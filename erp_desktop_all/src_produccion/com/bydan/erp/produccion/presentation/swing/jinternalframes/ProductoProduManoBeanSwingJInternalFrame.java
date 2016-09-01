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

import com.bydan.erp.produccion.util.ProductoProduManoConstantesFunciones;
import com.bydan.erp.produccion.util.ProductoProduManoParameterReturnGeneral;
//import com.bydan.erp.produccion.util.ProductoProduManoParameterGeneral;
//import com.bydan.erp.produccion.presentation.report.source.ProductoProduManoBean;
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
public class ProductoProduManoBeanSwingJInternalFrame extends ProductoProduManoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProductoProduManoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProductoProduMano> productoprodumanoValidator = new ClassValidator<ProductoProduMano>(ProductoProduMano.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProductoProduMano productoprodumano;	
	public ProductoProduMano productoprodumanoAux;
	public ProductoProduMano productoprodumanoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProductoProduMano productoprodumanoTotales;
	public Long idProductoProduManoActual;
	public Long iIdNuevoProductoProduMano=0L;
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

	public String sFinalQueryComboTipoManoProduEmpresa="";

	public List<TipoManoProduEmpresa> tipomanoproduempresasForeignKey;

	public List<TipoManoProduEmpresa> gettipomanoproduempresasForeignKey() {
		return tipomanoproduempresasForeignKey;
	}

	public void settipomanoproduempresasForeignKey(List<TipoManoProduEmpresa> tipomanoproduempresasForeignKey) {
		this.tipomanoproduempresasForeignKey = tipomanoproduempresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoManoProduEmpresa tipomanoproduempresaForeignKey;

	public TipoManoProduEmpresa gettipomanoproduempresaForeignKey() {
		return tipomanoproduempresaForeignKey;
	}

	public void settipomanoproduempresaForeignKey(TipoManoProduEmpresa tipomanoproduempresaForeignKey) {
		this.tipomanoproduempresaForeignKey = tipomanoproduempresaForeignKey;
	}

	public String sFinalQueryComboTipoProcesoEmpresaProdu="";

	public List<TipoProcesoEmpresaProdu> tipoprocesoempresaprodusForeignKey;

	public List<TipoProcesoEmpresaProdu> gettipoprocesoempresaprodusForeignKey() {
		return tipoprocesoempresaprodusForeignKey;
	}

	public void settipoprocesoempresaprodusForeignKey(List<TipoProcesoEmpresaProdu> tipoprocesoempresaprodusForeignKey) {
		this.tipoprocesoempresaprodusForeignKey = tipoprocesoempresaprodusForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoProcesoEmpresaProdu tipoprocesoempresaproduForeignKey;

	public TipoProcesoEmpresaProdu gettipoprocesoempresaproduForeignKey() {
		return tipoprocesoempresaproduForeignKey;
	}

	public void settipoprocesoempresaproduForeignKey(TipoProcesoEmpresaProdu tipoprocesoempresaproduForeignKey) {
		this.tipoprocesoempresaproduForeignKey = tipoprocesoempresaproduForeignKey;
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
	
	public Boolean isPermisoTodoProductoProduMano;
	public Boolean isPermisoNuevoProductoProduMano;
	public Boolean isPermisoActualizarProductoProduMano;
	public Boolean isPermisoActualizarOriginalProductoProduMano;
	public Boolean isPermisoEliminarProductoProduMano;
	public Boolean isPermisoGuardarCambiosProductoProduMano;
	public Boolean isPermisoConsultaProductoProduMano;
	public Boolean isPermisoBusquedaProductoProduMano;
	public Boolean isPermisoReporteProductoProduMano;
	public Boolean isPermisoPaginacionMedioProductoProduMano;
	public Boolean isPermisoPaginacionAltoProductoProduMano;
	public Boolean isPermisoPaginacionTodoProductoProduMano;
	public Boolean isPermisoCopiarProductoProduMano;
	public Boolean isPermisoVerFormProductoProduMano;
	public Boolean isPermisoDuplicarProductoProduMano;
	public Boolean isPermisoOrdenProductoProduMano;
	
	
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
	
	public ProductoProduManoParameterReturnGeneral productoprodumanoReturnGeneral;
	public ProductoProduManoParameterReturnGeneral productoprodumanoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProductoProduMano=false;
	public Boolean esParaAccionDesdeFormularioProductoProduMano=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProductoProduManoSessionBeanAdditional productoprodumanoSessionBeanAdditional=null;
	
	public ProductoProduManoSessionBeanAdditional getProductoProduManoSessionBeanAdditional() {
		return this.productoprodumanoSessionBeanAdditional;
	}
	
	public void setProductoProduManoSessionBeanAdditional(ProductoProduManoSessionBeanAdditional productoprodumanoSessionBeanAdditional) {
		try {
			this.productoprodumanoSessionBeanAdditional=productoprodumanoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProductoProduManoBeanSwingJInternalFrameAdditional productoprodumanoBeanSwingJInternalFrameAdditional=null;
	//public class ProductoProduManoBeanSwingJInternalFrame
	
	public ProductoProduManoBeanSwingJInternalFrameAdditional getProductoProduManoBeanSwingJInternalFrameAdditional() {
		return this.productoprodumanoBeanSwingJInternalFrameAdditional;
	}
	
	public void setProductoProduManoBeanSwingJInternalFrameAdditional(ProductoProduManoBeanSwingJInternalFrameAdditional productoprodumanoBeanSwingJInternalFrameAdditional) {
		try {
			this.productoprodumanoBeanSwingJInternalFrameAdditional=productoprodumanoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProductoProduManoLogic productoprodumanoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProductoProduMano productoprodumanoBean;
	public ProductoProduManoConstantesFunciones productoprodumanoConstantesFunciones;
	//public ProductoProduManoParameterReturnGeneral productoprodumanoReturnGeneral;
	
	//FK
	
	public ProductoDefiProduLogic productodefiproduLogic;
	public TipoManoProduEmpresaLogic tipomanoproduempresaLogic;
	public TipoProcesoEmpresaProduLogic tipoprocesoempresaproduLogic;
	public UnidadLogic unidadLogic;
	
	//PARAMETROS
	
	
	//public List<ProductoProduMano> productoprodumanos;	
	//public List<ProductoProduMano> productoprodumanosEliminados;
	//public List<ProductoProduMano> productoprodumanosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProductoProduMano=false;
	public Boolean isVisibilidadCeldaDuplicarProductoProduMano=true;
	public Boolean isVisibilidadCeldaCopiarProductoProduMano=true;
	public Boolean isVisibilidadCeldaVerFormProductoProduMano=true;
	public Boolean isVisibilidadCeldaOrdenProductoProduMano=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProductoProduMano=false;
	public Boolean isVisibilidadCeldaModificarProductoProduMano=false;
	public Boolean isVisibilidadCeldaActualizarProductoProduMano=false;
	public Boolean isVisibilidadCeldaEliminarProductoProduMano=false;
	public Boolean isVisibilidadCeldaCancelarProductoProduMano=false;
	public Boolean isVisibilidadCeldaGuardarProductoProduMano=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProductoProduMano=false;	
	
	
	public Boolean isVisibilidadFK_IdProductoDefiProdu=false;
	public Boolean isVisibilidadFK_IdTipoManoProduEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoProcesoEmpresaProdu=false;
	public Boolean isVisibilidadFK_IdUnidad=false;
	
	public Long getiIdNuevoProductoProduMano() {
		return this.iIdNuevoProductoProduMano;
	}

	public void setiIdNuevoProductoProduMano(Long iIdNuevoProductoProduMano) {
		this.iIdNuevoProductoProduMano = iIdNuevoProductoProduMano;
	}
	
	public Long getidProductoProduManoActual() {
		return this.idProductoProduManoActual;
	}

	public void setidProductoProduManoActual(Long idProductoProduManoActual) {
		this.idProductoProduManoActual = idProductoProduManoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProductoProduMano getproductoprodumano() {
		return this.productoprodumano;
	}

	public void setproductoprodumano(ProductoProduMano productoprodumano) {
		this.productoprodumano = productoprodumano;
	}
	
	public ProductoProduMano getproductoprodumanoAux() {
		return this.productoprodumanoAux;
	}

	public void setproductoprodumanoAux(ProductoProduMano productoprodumanoAux) {
		this.productoprodumanoAux = productoprodumanoAux;
	}				
	
	public ProductoProduMano getproductoprodumanoAnterior() {
		return this.productoprodumanoAnterior;
	}

	public void setproductoprodumanoAnterior(ProductoProduMano productoprodumanoAnterior) {
		this.productoprodumanoAnterior = productoprodumanoAnterior;
	}	
	
	public ProductoProduMano getproductoprodumanoTotales() {
		return this.productoprodumanoTotales;
	}

	public void setproductoprodumanoTotales(ProductoProduMano productoprodumanoTotales) {
		this.productoprodumanoTotales = productoprodumanoTotales;
	}	
	
	public ProductoProduMano getproductoprodumanoBean() {
		return this.productoprodumanoBean;
	}

	public void setproductoprodumanoBean(ProductoProduMano productoprodumanoBean) {
		this.productoprodumanoBean = productoprodumanoBean;
	}	
	
	public ProductoProduManoParameterReturnGeneral getproductoprodumanoReturnGeneral() {
		return this.productoprodumanoReturnGeneral;
	}

	public void setproductoprodumanoReturnGeneral(ProductoProduManoParameterReturnGeneral productoprodumanoReturnGeneral) {
		this.productoprodumanoReturnGeneral = productoprodumanoReturnGeneral;
	}	
	
	
	public Long id_producto_defi_produFK_IdProductoDefiProdu=-1L;

	public Long getid_producto_defi_produFK_IdProductoDefiProdu() {
		return this.id_producto_defi_produFK_IdProductoDefiProdu;
	}

	public void setid_producto_defi_produFK_IdProductoDefiProdu(Long id_producto_defi_produFK_IdProductoDefiProdu) {
		this.id_producto_defi_produFK_IdProductoDefiProdu = id_producto_defi_produFK_IdProductoDefiProdu;
	}

	public Long id_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresa=-1L;

	public Long getid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresa() {
		return this.id_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresa;
	}

	public void setid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresa(Long id_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresa) {
		this.id_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresa = id_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresa;
	}

	public Long id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu=-1L;

	public Long getid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu() {
		return this.id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu;
	}

	public void setid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu(Long id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu) {
		this.id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu = id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu;
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
	
	
	public ProductoProduManoLogic getProductoProduManoLogic()	{		
		return productoprodumanoLogic;
	}

	public void setProductoProduManoLogic(ProductoProduManoLogic productoprodumanoLogic) {
		this.productoprodumanoLogic = productoprodumanoLogic;
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
	
	public Boolean getIsEsNuevoProductoProduMano() {
		return isEsNuevoProductoProduMano;
	}

	public void setIsEsNuevoProductoProduMano(Boolean isEsNuevoProductoProduMano) {
		this.isEsNuevoProductoProduMano = isEsNuevoProductoProduMano;
	}

	public Boolean getEsParaAccionDesdeFormularioProductoProduMano() {
		return esParaAccionDesdeFormularioProductoProduMano;
	}
	
	public void setEsParaAccionDesdeFormularioProductoProduMano(Boolean esParaAccionDesdeFormularioProductoProduMano) {
		this.esParaAccionDesdeFormularioProductoProduMano = esParaAccionDesdeFormularioProductoProduMano;
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

			if(this.productoprodumanoSessionBean==null) {
				this.productoprodumanoSessionBean=new ProductoProduManoSessionBean();
			}

			if(!this.productoprodumanoSessionBean.getisBusquedaDesdeForeignKeySesionProductoDefiProdu()) {
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
					productodefiproduLogic.getEntityWithConnection(productoprodumanoSessionBean.getlidProductoDefiProduActual());
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

	public void cargarCombosTipoManoProduEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipomanoproduempresasForeignKey=new ArrayList<TipoManoProduEmpresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoManoProduEmpresaLogic tipomanoproduempresaLogic=new TipoManoProduEmpresaLogic();

			tipomanoproduempresaLogic.getTipoManoProduEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.productoprodumanoSessionBean==null) {
				this.productoprodumanoSessionBean=new ProductoProduManoSessionBean();
			}

			if(!this.productoprodumanoSessionBean.getisBusquedaDesdeForeignKeySesionTipoManoProduEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomanoproduempresaLogic.getTipoManoProduEmpresaDataAccess().setIsForForeingKeyData(true);

					tipomanoproduempresaLogic.getTodosTipoManoProduEmpresasWithConnection(sFinalQuery,new Pagination());

					this.tipomanoproduempresasForeignKey=tipomanoproduempresaLogic.getTipoManoProduEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoManoProduEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomanoproduempresaLogic.getEntityWithConnection(productoprodumanoSessionBean.getlidTipoManoProduEmpresaActual());
					this.tipomanoproduempresasForeignKey.add(tipomanoproduempresaLogic.getTipoManoProduEmpresa());
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

	public void cargarCombosTipoProcesoEmpresaProdusForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoprocesoempresaprodusForeignKey=new ArrayList<TipoProcesoEmpresaProdu>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoProcesoEmpresaProduLogic tipoprocesoempresaproduLogic=new TipoProcesoEmpresaProduLogic();

			tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProduDataAccess().setIsForForeingKeyData(true);

			if(this.productoprodumanoSessionBean==null) {
				this.productoprodumanoSessionBean=new ProductoProduManoSessionBean();
			}

			if(!this.productoprodumanoSessionBean.getisBusquedaDesdeForeignKeySesionTipoProcesoEmpresaProdu()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProduDataAccess().setIsForForeingKeyData(true);

					tipoprocesoempresaproduLogic.getTodosTipoProcesoEmpresaProdusWithConnection(sFinalQuery,new Pagination());

					this.tipoprocesoempresaprodusForeignKey=tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoProcesoEmpresaProdu(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprocesoempresaproduLogic.getEntityWithConnection(productoprodumanoSessionBean.getlidTipoProcesoEmpresaProduActual());
					this.tipoprocesoempresaprodusForeignKey.add(tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdu());
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

			unidadLogic.getUnidadDataAccess().setIsForForeingKeyData(true);

			if(this.productoprodumanoSessionBean==null) {
				this.productoprodumanoSessionBean=new ProductoProduManoSessionBean();
			}

			if(!this.productoprodumanoSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					unidadLogic.getUnidadDataAccess().setIsForForeingKeyData(true);

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
					unidadLogic.getEntityWithConnection(productoprodumanoSessionBean.getlidUnidadActual());
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

					if(this.productoprodumano!=null) {
						this.productoprodumano.setProductoDefiProdu(productodefiproduTemp);
					}

					if(this.jInternalFrameDetalleFormProductoProduMano!=null) {
						this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_producto_defi_produProductoProduMano.setSelectedItem(productodefiproduTemp);
					}
				} else {
					//jComboBoxid_producto_defi_produProductoProduMano.setSelectedItem(productodefiproduTemp);
					if(this.jInternalFrameDetalleFormProductoProduMano!=null) {
						if(this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_producto_defi_produProductoProduMano.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_producto_defi_produProductoProduMano.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProductoDefiProdu") || sFormularioTipoBusqueda.equals("Todos")){
					if(productodefiproduTemp!=null && jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMano!=null) {
						jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMano.setSelectedItem(productodefiproduTemp);
					} else {
						if(jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMano!=null) {
							//jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMano.setSelectedItem(productodefiproduTemp);
							if(jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMano.getItemCount()>0) {
								jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMano.setSelectedIndex(0);
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
	public void setActualProductoDefiProduForeignKeyGenerico(Long idProductoDefiProduSeleccionado,JComboBox jComboBoxid_producto_defi_produProductoProduManoGenerico)throws Exception
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
				jComboBoxid_producto_defi_produProductoProduManoGenerico.setSelectedItem(productodefiproduTemp);
			} else {
				if(jComboBoxid_producto_defi_produProductoProduManoGenerico!=null && jComboBoxid_producto_defi_produProductoProduManoGenerico.getItemCount()>0) {
					jComboBoxid_producto_defi_produProductoProduManoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoManoProduEmpresaForeignKey(Long idTipoManoProduEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoManoProduEmpresa  tipomanoproduempresaTemp=null;

			for(TipoManoProduEmpresa tipomanoproduempresaAux:tipomanoproduempresasForeignKey) {
				if(tipomanoproduempresaAux.getId()!=null && tipomanoproduempresaAux.getId().equals(idTipoManoProduEmpresaSeleccionado)) {
					tipomanoproduempresaTemp=tipomanoproduempresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipomanoproduempresaTemp!=null) {

					if(this.productoprodumano!=null) {
						this.productoprodumano.setTipoManoProduEmpresa(tipomanoproduempresaTemp);
					}

					if(this.jInternalFrameDetalleFormProductoProduMano!=null) {
						this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_tipo_mano_produ_empresaProductoProduMano.setSelectedItem(tipomanoproduempresaTemp);
					}
				} else {
					//jComboBoxid_tipo_mano_produ_empresaProductoProduMano.setSelectedItem(tipomanoproduempresaTemp);
					if(this.jInternalFrameDetalleFormProductoProduMano!=null) {
						if(this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_tipo_mano_produ_empresaProductoProduMano.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_tipo_mano_produ_empresaProductoProduMano.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoManoProduEmpresa") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipomanoproduempresaTemp!=null && jComboBoxid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoProduMano!=null) {
						jComboBoxid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoProduMano.setSelectedItem(tipomanoproduempresaTemp);
					} else {
						if(jComboBoxid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoProduMano!=null) {
							//jComboBoxid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoProduMano.setSelectedItem(tipomanoproduempresaTemp);
							if(jComboBoxid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoProduMano.getItemCount()>0) {
								jComboBoxid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoProduMano.setSelectedIndex(0);
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

	public String getActualTipoManoProduEmpresaForeignKeyDescripcion(Long idTipoManoProduEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoManoProduEmpresa  tipomanoproduempresaTemp=null;

			for(TipoManoProduEmpresa tipomanoproduempresaAux:tipomanoproduempresasForeignKey) {
				if(tipomanoproduempresaAux.getId()!=null && tipomanoproduempresaAux.getId().equals(idTipoManoProduEmpresaSeleccionado)) {
					tipomanoproduempresaTemp=tipomanoproduempresaAux;
					break;
				}
			}


			sDescripcion=TipoManoProduEmpresaConstantesFunciones.getTipoManoProduEmpresaDescripcion(tipomanoproduempresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoManoProduEmpresaForeignKeyGenerico(Long idTipoManoProduEmpresaSeleccionado,JComboBox jComboBoxid_tipo_mano_produ_empresaProductoProduManoGenerico)throws Exception
	{
		try
		{
			TipoManoProduEmpresa  tipomanoproduempresaTemp=null;

			for(TipoManoProduEmpresa tipomanoproduempresaAux:tipomanoproduempresasForeignKey) {
				if(tipomanoproduempresaAux.getId()!=null && tipomanoproduempresaAux.getId().equals(idTipoManoProduEmpresaSeleccionado)) {
					tipomanoproduempresaTemp=tipomanoproduempresaAux;
					break;
				}
			}

			if(tipomanoproduempresaTemp!=null) {
				jComboBoxid_tipo_mano_produ_empresaProductoProduManoGenerico.setSelectedItem(tipomanoproduempresaTemp);
			} else {
				if(jComboBoxid_tipo_mano_produ_empresaProductoProduManoGenerico!=null && jComboBoxid_tipo_mano_produ_empresaProductoProduManoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_mano_produ_empresaProductoProduManoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoProcesoEmpresaProduForeignKey(Long idTipoProcesoEmpresaProduSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoProcesoEmpresaProdu  tipoprocesoempresaproduTemp=null;

			for(TipoProcesoEmpresaProdu tipoprocesoempresaproduAux:tipoprocesoempresaprodusForeignKey) {
				if(tipoprocesoempresaproduAux.getId()!=null && tipoprocesoempresaproduAux.getId().equals(idTipoProcesoEmpresaProduSeleccionado)) {
					tipoprocesoempresaproduTemp=tipoprocesoempresaproduAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoprocesoempresaproduTemp!=null) {

					if(this.productoprodumano!=null) {
						this.productoprodumano.setTipoProcesoEmpresaProdu(tipoprocesoempresaproduTemp);
					}

					if(this.jInternalFrameDetalleFormProductoProduMano!=null) {
						this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_tipo_proceso_empresa_produProductoProduMano.setSelectedItem(tipoprocesoempresaproduTemp);
					}
				} else {
					//jComboBoxid_tipo_proceso_empresa_produProductoProduMano.setSelectedItem(tipoprocesoempresaproduTemp);
					if(this.jInternalFrameDetalleFormProductoProduMano!=null) {
						if(this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_tipo_proceso_empresa_produProductoProduMano.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_tipo_proceso_empresa_produProductoProduMano.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoProcesoEmpresaProdu") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoprocesoempresaproduTemp!=null && jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMano!=null) {
						jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMano.setSelectedItem(tipoprocesoempresaproduTemp);
					} else {
						if(jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMano!=null) {
							//jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMano.setSelectedItem(tipoprocesoempresaproduTemp);
							if(jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMano.getItemCount()>0) {
								jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMano.setSelectedIndex(0);
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

	public String getActualTipoProcesoEmpresaProduForeignKeyDescripcion(Long idTipoProcesoEmpresaProduSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoProcesoEmpresaProdu  tipoprocesoempresaproduTemp=null;

			for(TipoProcesoEmpresaProdu tipoprocesoempresaproduAux:tipoprocesoempresaprodusForeignKey) {
				if(tipoprocesoempresaproduAux.getId()!=null && tipoprocesoempresaproduAux.getId().equals(idTipoProcesoEmpresaProduSeleccionado)) {
					tipoprocesoempresaproduTemp=tipoprocesoempresaproduAux;
					break;
				}
			}


			sDescripcion=TipoProcesoEmpresaProduConstantesFunciones.getTipoProcesoEmpresaProduDescripcion(tipoprocesoempresaproduTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoProcesoEmpresaProduForeignKeyGenerico(Long idTipoProcesoEmpresaProduSeleccionado,JComboBox jComboBoxid_tipo_proceso_empresa_produProductoProduManoGenerico)throws Exception
	{
		try
		{
			TipoProcesoEmpresaProdu  tipoprocesoempresaproduTemp=null;

			for(TipoProcesoEmpresaProdu tipoprocesoempresaproduAux:tipoprocesoempresaprodusForeignKey) {
				if(tipoprocesoempresaproduAux.getId()!=null && tipoprocesoempresaproduAux.getId().equals(idTipoProcesoEmpresaProduSeleccionado)) {
					tipoprocesoempresaproduTemp=tipoprocesoempresaproduAux;
					break;
				}
			}

			if(tipoprocesoempresaproduTemp!=null) {
				jComboBoxid_tipo_proceso_empresa_produProductoProduManoGenerico.setSelectedItem(tipoprocesoempresaproduTemp);
			} else {
				if(jComboBoxid_tipo_proceso_empresa_produProductoProduManoGenerico!=null && jComboBoxid_tipo_proceso_empresa_produProductoProduManoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_proceso_empresa_produProductoProduManoGenerico.setSelectedIndex(0);
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

					if(this.productoprodumano!=null) {
						this.productoprodumano.setUnidad(unidadTemp);
					}

					if(this.jInternalFrameDetalleFormProductoProduMano!=null) {
						this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_unidadProductoProduMano.setSelectedItem(unidadTemp);
					}
				} else {
					//jComboBoxid_unidadProductoProduMano.setSelectedItem(unidadTemp);
					if(this.jInternalFrameDetalleFormProductoProduMano!=null) {
						if(this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_unidadProductoProduMano.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_unidadProductoProduMano.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){
					if(unidadTemp!=null && jComboBoxid_unidadFK_IdUnidadProductoProduMano!=null) {
						jComboBoxid_unidadFK_IdUnidadProductoProduMano.setSelectedItem(unidadTemp);
					} else {
						if(jComboBoxid_unidadFK_IdUnidadProductoProduMano!=null) {
							//jComboBoxid_unidadFK_IdUnidadProductoProduMano.setSelectedItem(unidadTemp);
							if(jComboBoxid_unidadFK_IdUnidadProductoProduMano.getItemCount()>0) {
								jComboBoxid_unidadFK_IdUnidadProductoProduMano.setSelectedIndex(0);
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
	public void setActualUnidadForeignKeyGenerico(Long idUnidadSeleccionado,JComboBox jComboBoxid_unidadProductoProduManoGenerico)throws Exception
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
				jComboBoxid_unidadProductoProduManoGenerico.setSelectedItem(unidadTemp);
			} else {
				if(jComboBoxid_unidadProductoProduManoGenerico!=null && jComboBoxid_unidadProductoProduManoGenerico.getItemCount()>0) {
					jComboBoxid_unidadProductoProduManoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoDefiProduForeignKey(ProductoProduMano productoprodumano,JComboBox jComboBoxid_producto_defi_produProductoProduManoGenerico)throws Exception
	{
		try
		{
			ProductoDefiProdu  productodefiproduAux=new ProductoDefiProdu();

			if(jComboBoxid_producto_defi_produProductoProduManoGenerico==null) {
				productodefiproduAux=(ProductoDefiProdu)this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_producto_defi_produProductoProduMano.getSelectedItem();
			} else {
				productodefiproduAux=(ProductoDefiProdu)jComboBoxid_producto_defi_produProductoProduManoGenerico.getSelectedItem();
			}

			if(productodefiproduAux!=null && productodefiproduAux.getId()!=null) {
				productoprodumano.setid_producto_defi_produ(productodefiproduAux.getId());
				productoprodumano.setproductodefiprodu_descripcion(ProductoProduManoConstantesFunciones.getProductoDefiProduDescripcion(productodefiproduAux));
				productoprodumano.setProductoDefiProdu(productodefiproduAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoManoProduEmpresaForeignKey(ProductoProduMano productoprodumano,JComboBox jComboBoxid_tipo_mano_produ_empresaProductoProduManoGenerico)throws Exception
	{
		try
		{
			TipoManoProduEmpresa  tipomanoproduempresaAux=new TipoManoProduEmpresa();

			if(jComboBoxid_tipo_mano_produ_empresaProductoProduManoGenerico==null) {
				tipomanoproduempresaAux=(TipoManoProduEmpresa)this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_tipo_mano_produ_empresaProductoProduMano.getSelectedItem();
			} else {
				tipomanoproduempresaAux=(TipoManoProduEmpresa)jComboBoxid_tipo_mano_produ_empresaProductoProduManoGenerico.getSelectedItem();
			}

			if(tipomanoproduempresaAux!=null && tipomanoproduempresaAux.getId()!=null) {
				productoprodumano.setid_tipo_mano_produ_empresa(tipomanoproduempresaAux.getId());
				productoprodumano.settipomanoproduempresa_descripcion(ProductoProduManoConstantesFunciones.getTipoManoProduEmpresaDescripcion(tipomanoproduempresaAux));
				productoprodumano.setTipoManoProduEmpresa(tipomanoproduempresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoProcesoEmpresaProduForeignKey(ProductoProduMano productoprodumano,JComboBox jComboBoxid_tipo_proceso_empresa_produProductoProduManoGenerico)throws Exception
	{
		try
		{
			TipoProcesoEmpresaProdu  tipoprocesoempresaproduAux=new TipoProcesoEmpresaProdu();

			if(jComboBoxid_tipo_proceso_empresa_produProductoProduManoGenerico==null) {
				tipoprocesoempresaproduAux=(TipoProcesoEmpresaProdu)this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_tipo_proceso_empresa_produProductoProduMano.getSelectedItem();
			} else {
				tipoprocesoempresaproduAux=(TipoProcesoEmpresaProdu)jComboBoxid_tipo_proceso_empresa_produProductoProduManoGenerico.getSelectedItem();
			}

			if(tipoprocesoempresaproduAux!=null && tipoprocesoempresaproduAux.getId()!=null) {
				productoprodumano.setid_tipo_proceso_empresa_produ(tipoprocesoempresaproduAux.getId());
				productoprodumano.settipoprocesoempresaprodu_descripcion(ProductoProduManoConstantesFunciones.getTipoProcesoEmpresaProduDescripcion(tipoprocesoempresaproduAux));
				productoprodumano.setTipoProcesoEmpresaProdu(tipoprocesoempresaproduAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUnidadForeignKey(ProductoProduMano productoprodumano,JComboBox jComboBoxid_unidadProductoProduManoGenerico)throws Exception
	{
		try
		{
			Unidad  unidadAux=new Unidad();

			if(jComboBoxid_unidadProductoProduManoGenerico==null) {
				unidadAux=(Unidad)this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_unidadProductoProduMano.getSelectedItem();
			} else {
				unidadAux=(Unidad)jComboBoxid_unidadProductoProduManoGenerico.getSelectedItem();
			}

			if(unidadAux!=null && unidadAux.getId()!=null) {
				productoprodumano.setid_unidad(unidadAux.getId());
				productoprodumano.setunidad_descripcion(ProductoProduManoConstantesFunciones.getUnidadDescripcion(unidadAux));
				productoprodumano.setUnidad(unidadAux);			}
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

					if(!ProductoProduManoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoProduMano!=null) { 
							this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_producto_defi_produProductoProduMano.removeAllItems();

							for(ProductoDefiProdu productodefiprodu:this.productodefiprodusForeignKey) {
								this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_producto_defi_produProductoProduMano.addItem(productodefiprodu);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoProduMano!=null) { 
					}

					if(!ProductoProduManoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProductoDefiProdu") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoProduManoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMano.removeAllItems();

							for(ProductoDefiProdu productodefiprodu:this.productodefiprodusForeignKey) {
								this.jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMano.addItem(productodefiprodu);
							}
						}

						if(!ProductoProduManoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoManoProduEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoManoProduEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProductoProduManoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoProduMano!=null) { 
							this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_tipo_mano_produ_empresaProductoProduMano.removeAllItems();

							for(TipoManoProduEmpresa tipomanoproduempresa:this.tipomanoproduempresasForeignKey) {
								this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_tipo_mano_produ_empresaProductoProduMano.addItem(tipomanoproduempresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoProduMano!=null) { 
					}

					if(!ProductoProduManoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoManoProduEmpresa") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoProduManoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoProduMano.removeAllItems();

							for(TipoManoProduEmpresa tipomanoproduempresa:this.tipomanoproduempresasForeignKey) {
								this.jComboBoxid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoProduMano.addItem(tipomanoproduempresa);
							}
						}

						if(!ProductoProduManoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoProcesoEmpresaProdusForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoProcesoEmpresaProdu=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProductoProduManoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoProduMano!=null) { 
							this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_tipo_proceso_empresa_produProductoProduMano.removeAllItems();

							for(TipoProcesoEmpresaProdu tipoprocesoempresaprodu:this.tipoprocesoempresaprodusForeignKey) {
								this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_tipo_proceso_empresa_produProductoProduMano.addItem(tipoprocesoempresaprodu);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoProduMano!=null) { 
					}

					if(!ProductoProduManoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoProcesoEmpresaProdu") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoProduManoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMano.removeAllItems();

							for(TipoProcesoEmpresaProdu tipoprocesoempresaprodu:this.tipoprocesoempresaprodusForeignKey) {
								this.jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMano.addItem(tipoprocesoempresaprodu);
							}
						}

						if(!ProductoProduManoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoProduManoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoProduMano!=null) { 
							this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_unidadProductoProduMano.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_unidadProductoProduMano.addItem(unidad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoProduMano!=null) { 
					}

					if(!ProductoProduManoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoProduManoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_unidadFK_IdUnidadProductoProduMano.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jComboBoxid_unidadFK_IdUnidadProductoProduMano.addItem(unidad);
							}
						}

						if(!ProductoProduManoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormProductoProduMano!=null) {
							this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_producto_defi_produProductoProduMano.setSelectedItem(productodefiprodu);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoProduMano!=null) {
							this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_producto_defi_produProductoProduMano.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMano.setSelectedItem(productodefiprodu);
						} else {
							this.jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMano.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoManoProduEmpresaForeignKey(TipoManoProduEmpresa tipomanoproduempresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProductoProduMano!=null) {
							this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_tipo_mano_produ_empresaProductoProduMano.setSelectedItem(tipomanoproduempresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoProduMano!=null) {
							this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_tipo_mano_produ_empresaProductoProduMano.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoProduMano.setSelectedItem(tipomanoproduempresa);
						} else {
							this.jComboBoxid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoProduMano.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoProcesoEmpresaProduForeignKey(TipoProcesoEmpresaProdu tipoprocesoempresaprodu,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProductoProduMano!=null) {
							this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_tipo_proceso_empresa_produProductoProduMano.setSelectedItem(tipoprocesoempresaprodu);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoProduMano!=null) {
							this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_tipo_proceso_empresa_produProductoProduMano.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMano.setSelectedItem(tipoprocesoempresaprodu);
						} else {
							this.jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMano.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoProduMano!=null) {
							this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_unidadProductoProduMano.setSelectedItem(unidad);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoProduMano!=null) {
							this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_unidadProductoProduMano.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_unidadFK_IdUnidadProductoProduMano.setSelectedItem(unidad);
						} else {
							this.jComboBoxid_unidadFK_IdUnidadProductoProduMano.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProductoProduMano() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ProductoProduManoConstantesFunciones.refrescarForeignKeysDescripcionesProductoProduMano(this.productoprodumanoLogic.getProductoProduManos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ProductoProduManoConstantesFunciones.refrescarForeignKeysDescripcionesProductoProduMano(this.productoprodumanos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(ProductoDefiProdu.class));
		classes.add(new Classe(TipoManoProduEmpresa.class));
		classes.add(new Classe(TipoProcesoEmpresaProdu.class));
		classes.add(new Classe(Unidad.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//productoprodumanoLogic.setProductoProduManos(this.productoprodumanos);
			productoprodumanoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ProductoProduManoParameterReturnGeneral getProductoProduManoParameterGeneral() {
		return this.productoprodumanoParameterGeneral;
	}
	
	public void setProductoProduManoParameterGeneral(ProductoProduManoParameterReturnGeneral productoprodumanoParameterGeneral) {
		this.productoprodumanoParameterGeneral = productoprodumanoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProductoProduMano() {
		return isPermisoTodoProductoProduMano;
	}

	public void setIsPermisoTodoProductoProduMano(Boolean isPermisoTodoProductoProduMano) {
		this.isPermisoTodoProductoProduMano = isPermisoTodoProductoProduMano;
	}

	public Boolean getIsPermisoNuevoProductoProduMano() {
		return isPermisoNuevoProductoProduMano;
	}

	public void setIsPermisoNuevoProductoProduMano(Boolean isPermisoNuevoProductoProduMano) {
		this.isPermisoNuevoProductoProduMano = isPermisoNuevoProductoProduMano;
	}

	public Boolean getIsPermisoActualizarProductoProduMano() {
		return isPermisoActualizarProductoProduMano;
	}

	public void setIsPermisoActualizarProductoProduMano(Boolean isPermisoActualizarProductoProduMano) {
		this.isPermisoActualizarProductoProduMano = isPermisoActualizarProductoProduMano;
	}

	public Boolean getIsPermisoEliminarProductoProduMano() {
		return isPermisoEliminarProductoProduMano;
	}

	public void setIsPermisoEliminarProductoProduMano(Boolean isPermisoEliminarProductoProduMano) {
		this.isPermisoEliminarProductoProduMano = isPermisoEliminarProductoProduMano;
	}

	public Boolean getIsPermisoGuardarCambiosProductoProduMano() {
		return isPermisoGuardarCambiosProductoProduMano;
	}

	public void setIsPermisoGuardarCambiosProductoProduMano(Boolean isPermisoGuardarCambiosProductoProduMano) {
		this.isPermisoGuardarCambiosProductoProduMano = isPermisoGuardarCambiosProductoProduMano;
	}
	
	public Boolean getIsPermisoConsultaProductoProduMano() {
		return isPermisoConsultaProductoProduMano;
	}

	public void setIsPermisoConsultaProductoProduMano(Boolean isPermisoConsultaProductoProduMano) {
		this.isPermisoConsultaProductoProduMano = isPermisoConsultaProductoProduMano;
	}

	public Boolean getIsPermisoBusquedaProductoProduMano() {
		return isPermisoBusquedaProductoProduMano;
	}

	public void setIsPermisoBusquedaProductoProduMano(Boolean isPermisoBusquedaProductoProduMano) {
		this.isPermisoBusquedaProductoProduMano = isPermisoBusquedaProductoProduMano;
	}

	public Boolean getIsPermisoReporteProductoProduMano() {
		return isPermisoReporteProductoProduMano;
	}

	public void setIsPermisoReporteProductoProduMano(Boolean isPermisoReporteProductoProduMano) {
		this.isPermisoReporteProductoProduMano = isPermisoReporteProductoProduMano;
	}
	
	public Boolean getIsPermisoPaginacionMedioProductoProduMano() {
		return isPermisoPaginacionMedioProductoProduMano;
	}

	public void setIsPermisoPaginacionMedioProductoProduMano(Boolean isPermisoPaginacionMedioProductoProduMano) {
		this.isPermisoPaginacionMedioProductoProduMano = isPermisoPaginacionMedioProductoProduMano;
	}
	
	public Boolean getIsPermisoPaginacionTodoProductoProduMano() {
		return isPermisoPaginacionTodoProductoProduMano;
	}

	public void setIsPermisoPaginacionTodoProductoProduMano(Boolean isPermisoPaginacionTodoProductoProduMano) {
		this.isPermisoPaginacionTodoProductoProduMano = isPermisoPaginacionTodoProductoProduMano;
	}
	
	public Boolean getIsPermisoPaginacionAltoProductoProduMano() {
		return isPermisoPaginacionAltoProductoProduMano;
	}

	public void setIsPermisoPaginacionAltoProductoProduMano(Boolean isPermisoPaginacionAltoProductoProduMano) {
		this.isPermisoPaginacionAltoProductoProduMano = isPermisoPaginacionAltoProductoProduMano;
	}
	
	public Boolean getIsPermisoCopiarProductoProduMano() {
		return isPermisoCopiarProductoProduMano;
	}

	public void setIsPermisoCopiarProductoProduMano(Boolean isPermisoCopiarProductoProduMano) {
		this.isPermisoCopiarProductoProduMano = isPermisoCopiarProductoProduMano;
	}
	
	public Boolean getIsPermisoVerFormProductoProduMano() {
		return isPermisoVerFormProductoProduMano;
	}

	public void setIsPermisoVerFormProductoProduMano(Boolean isPermisoVerFormProductoProduMano) {
		this.isPermisoVerFormProductoProduMano = isPermisoVerFormProductoProduMano;
	}
	
	public Boolean getIsPermisoDuplicarProductoProduMano() {
		return isPermisoDuplicarProductoProduMano;
	}

	public void setIsPermisoDuplicarProductoProduMano(Boolean isPermisoDuplicarProductoProduMano) {
		this.isPermisoDuplicarProductoProduMano = isPermisoDuplicarProductoProduMano;
	}
	
	public Boolean getIsPermisoOrdenProductoProduMano() {
		return isPermisoOrdenProductoProduMano;
	}

	public void setIsPermisoOrdenProductoProduMano(Boolean isPermisoOrdenProductoProduMano) {
		this.isPermisoOrdenProductoProduMano = isPermisoOrdenProductoProduMano;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProductoProduMano() {
		return isVisibilidadCeldaNuevoProductoProduMano;
	}

	public void setIsVisibilidadCeldaNuevoProductoProduMano(Boolean isVisibilidadCeldaNuevoProductoProduMano) {
		this.isVisibilidadCeldaNuevoProductoProduMano = isVisibilidadCeldaNuevoProductoProduMano;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProductoProduMano() {
		return isVisibilidadCeldaDuplicarProductoProduMano;
	}

	public void setIsVisibilidadCeldaDuplicarProductoProduMano(Boolean isVisibilidadCeldaDuplicarProductoProduMano) {
		this.isVisibilidadCeldaDuplicarProductoProduMano = isVisibilidadCeldaDuplicarProductoProduMano;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProductoProduMano() {
		return isVisibilidadCeldaCopiarProductoProduMano;
	}

	public void setIsVisibilidadCeldaCopiarProductoProduMano(Boolean isVisibilidadCeldaCopiarProductoProduMano) {
		this.isVisibilidadCeldaCopiarProductoProduMano = isVisibilidadCeldaCopiarProductoProduMano;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProductoProduMano() {
		return isVisibilidadCeldaVerFormProductoProduMano;
	}

	public void setIsVisibilidadCeldaVerFormProductoProduMano(Boolean isVisibilidadCeldaVerFormProductoProduMano) {
		this.isVisibilidadCeldaVerFormProductoProduMano = isVisibilidadCeldaVerFormProductoProduMano;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProductoProduMano() {
		return isVisibilidadCeldaOrdenProductoProduMano;
	}

	public void setIsVisibilidadCeldaOrdenProductoProduMano(Boolean isVisibilidadCeldaOrdenProductoProduMano) {
		this.isVisibilidadCeldaOrdenProductoProduMano = isVisibilidadCeldaOrdenProductoProduMano;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProductoProduMano() {
		return isVisibilidadCeldaNuevoRelacionesProductoProduMano;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProductoProduMano(Boolean isVisibilidadCeldaNuevoRelacionesProductoProduMano) {
		this.isVisibilidadCeldaNuevoRelacionesProductoProduMano = isVisibilidadCeldaNuevoRelacionesProductoProduMano;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProductoProduMano() {
		return isVisibilidadCeldaModificarProductoProduMano;
	}

	public void setIsVisibilidadCeldaModificarProductoProduMano(Boolean isVisibilidadCeldaModificarProductoProduMano) {
		this.isVisibilidadCeldaModificarProductoProduMano = isVisibilidadCeldaModificarProductoProduMano;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProductoProduMano() {
		return isVisibilidadCeldaActualizarProductoProduMano;
	}

	public void setIsVisibilidadCeldaActualizarProductoProduMano(Boolean isVisibilidadCeldaActualizarProductoProduMano) {
		this.isVisibilidadCeldaActualizarProductoProduMano = isVisibilidadCeldaActualizarProductoProduMano;
	}

	public Boolean getIsVisibilidadCeldaEliminarProductoProduMano() {
		return isVisibilidadCeldaEliminarProductoProduMano;
	}

	public void setIsVisibilidadCeldaEliminarProductoProduMano(Boolean isVisibilidadCeldaEliminarProductoProduMano) {
		this.isVisibilidadCeldaEliminarProductoProduMano = isVisibilidadCeldaEliminarProductoProduMano;
	}

	public Boolean getIsVisibilidadCeldaCancelarProductoProduMano() {
		return isVisibilidadCeldaCancelarProductoProduMano;
	}

	public void setIsVisibilidadCeldaCancelarProductoProduMano(Boolean isVisibilidadCeldaCancelarProductoProduMano) {
		this.isVisibilidadCeldaCancelarProductoProduMano = isVisibilidadCeldaCancelarProductoProduMano;
	}

	public Boolean getIsVisibilidadCeldaGuardarProductoProduMano() {
		return isVisibilidadCeldaGuardarProductoProduMano;
	}

	public void setIsVisibilidadCeldaGuardarProductoProduMano(Boolean isVisibilidadCeldaGuardarProductoProduMano) {
		this.isVisibilidadCeldaGuardarProductoProduMano = isVisibilidadCeldaGuardarProductoProduMano;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProductoProduMano() {
		return isVisibilidadCeldaGuardarCambiosProductoProduMano;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProductoProduMano(Boolean isVisibilidadCeldaGuardarCambiosProductoProduMano) {
		this.isVisibilidadCeldaGuardarCambiosProductoProduMano = isVisibilidadCeldaGuardarCambiosProductoProduMano;
	}
		
	public ProductoProduManoSessionBean getproductoprodumanoSessionBean() {
		return this.productoprodumanoSessionBean;
	}
	
	public void setproductoprodumanoSessionBean(ProductoProduManoSessionBean productoprodumanoSessionBean) {
		this.productoprodumanoSessionBean=productoprodumanoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdProductoDefiProdu() {
		return this.isVisibilidadFK_IdProductoDefiProdu;
	}

	public void setisVisibilidadFK_IdProductoDefiProdu(Boolean isVisibilidadFK_IdProductoDefiProdu) {
		this.isVisibilidadFK_IdProductoDefiProdu=isVisibilidadFK_IdProductoDefiProdu;
	}

	public Boolean getisVisibilidadFK_IdTipoManoProduEmpresa() {
		return this.isVisibilidadFK_IdTipoManoProduEmpresa;
	}

	public void setisVisibilidadFK_IdTipoManoProduEmpresa(Boolean isVisibilidadFK_IdTipoManoProduEmpresa) {
		this.isVisibilidadFK_IdTipoManoProduEmpresa=isVisibilidadFK_IdTipoManoProduEmpresa;
	}

	public Boolean getisVisibilidadFK_IdTipoProcesoEmpresaProdu() {
		return this.isVisibilidadFK_IdTipoProcesoEmpresaProdu;
	}

	public void setisVisibilidadFK_IdTipoProcesoEmpresaProdu(Boolean isVisibilidadFK_IdTipoProcesoEmpresaProdu) {
		this.isVisibilidadFK_IdTipoProcesoEmpresaProdu=isVisibilidadFK_IdTipoProcesoEmpresaProdu;
	}

	public Boolean getisVisibilidadFK_IdUnidad() {
		return this.isVisibilidadFK_IdUnidad;
	}

	public void setisVisibilidadFK_IdUnidad(Boolean isVisibilidadFK_IdUnidad) {
		this.isVisibilidadFK_IdUnidad=isVisibilidadFK_IdUnidad;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProductoProduMano(ProductoProduMano productoprodumano)throws Exception {
		try {
			
				this.setActualParaGuardarProductoDefiProduForeignKey(productoprodumano,null);
				this.setActualParaGuardarTipoManoProduEmpresaForeignKey(productoprodumano,null);
				this.setActualParaGuardarTipoProcesoEmpresaProduForeignKey(productoprodumano,null);
				this.setActualParaGuardarUnidadForeignKey(productoprodumano,null);
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
	
	public void bugActualizarReferenciaActual(ProductoProduMano productoprodumano,ProductoProduMano productoprodumanoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProductoProduMano(productoprodumano);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		productoprodumanoAux.setId(productoprodumano.getId());
		productoprodumanoAux.setVersionRow(productoprodumano.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessProductoProduMano();
		
			int intSelectedRow = this.jTableDatosProductoProduMano.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumano =(ProductoProduMano) this.productoprodumanoLogic.getProductoProduManos().toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.productoprodumano =(ProductoProduMano) this.productoprodumanos.toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ProductoProduManoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualProductoProduMano(this.productoprodumano,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMano(this.productoprodumano);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = productoprodumanoValidator.getInvalidValues(this.productoprodumano);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			productoprodumanoLogic.setDatosCliente(datosCliente);
			productoprodumanoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				productoprodumanoAux=new  ProductoProduMano();
				
				productoprodumanoAux.setIsNew(true);
				productoprodumanoAux.setIsChanged(true);
				
				productoprodumanoAux.setProductoProduManoOriginal(this.productoprodumano);
				
				productoprodumanoAux.setId(this.productoprodumano.getId());	
				productoprodumanoAux.setVersionRow(this.productoprodumano.getVersionRow());	
				productoprodumanoAux.setid_producto_defi_produ(this.productoprodumano.getid_producto_defi_produ());	
				productoprodumanoAux.setid_tipo_mano_produ_empresa(this.productoprodumano.getid_tipo_mano_produ_empresa());	
				productoprodumanoAux.setid_tipo_proceso_empresa_produ(this.productoprodumano.getid_tipo_proceso_empresa_produ());	
				productoprodumanoAux.setid_unidad(this.productoprodumano.getid_unidad());	
				productoprodumanoAux.setcantidad(this.productoprodumano.getcantidad());	
				productoprodumanoAux.setcosto(this.productoprodumano.getcosto());	
				productoprodumanoAux.setcosto_total(this.productoprodumano.getcosto_total());	
				productoprodumanoAux.setdescripcion(this.productoprodumano.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productoprodumanoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productoprodumanoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(productoprodumanoAux,productoprodumanoLogic.getProductoProduManos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoprodumanoAux,productoprodumanos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.productoprodumanoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoprodumanoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodumanoLogic.saveProductoProduManos();//WithConnection
						//productoprodumanoLogic.getSetVersionRowProductoProduManos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.productoprodumano,productoprodumanoAux);
					
					this.refrescarForeignKeysDescripcionesProductoProduMano();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoprodumanoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoprodumanoLogic.saveProductoProduManoRelaciones(productoprodumanoAux);//WithConnection
								//productoprodumanoLogic.getSetVersionRowProductoProduManos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.productoprodumano,productoprodumanoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.productoprodumanoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.productoprodumanoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(productoprodumanoAux,productoprodumanoLogic.getProductoProduManos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(productoprodumanoAux,productoprodumanos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.productoprodumano,productoprodumanoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				productoprodumanoAux=new  ProductoProduMano();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.productoprodumanoSessionBean.getEsGuardarRelacionado() 
					|| (this.productoprodumanoSessionBean.getEsGuardarRelacionado() && this.productoprodumano.getId()>=0)) {
						
					productoprodumanoAux.setIsNew(false);
				}
				
				productoprodumanoAux.setIsDeleted(false);
			
				productoprodumanoAux.setId(this.productoprodumano.getId());	
				productoprodumanoAux.setVersionRow(this.productoprodumano.getVersionRow());	
				productoprodumanoAux.setid_producto_defi_produ(this.productoprodumano.getid_producto_defi_produ());	
				productoprodumanoAux.setid_tipo_mano_produ_empresa(this.productoprodumano.getid_tipo_mano_produ_empresa());	
				productoprodumanoAux.setid_tipo_proceso_empresa_produ(this.productoprodumano.getid_tipo_proceso_empresa_produ());	
				productoprodumanoAux.setid_unidad(this.productoprodumano.getid_unidad());	
				productoprodumanoAux.setcantidad(this.productoprodumano.getcantidad());	
				productoprodumanoAux.setcosto(this.productoprodumano.getcosto());	
				productoprodumanoAux.setcosto_total(this.productoprodumano.getcosto_total());	
				productoprodumanoAux.setdescripcion(this.productoprodumano.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productoprodumanoAux,productoprodumanoLogic.getProductoProduManos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoprodumanoAux,productoprodumanos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.productoprodumanoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoprodumanoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodumanoLogic.saveProductoProduManos();//WithConnection
						//productoprodumanoLogic.getSetVersionRowProductoProduManos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.productoprodumano,productoprodumanoAux);
					
					this.refrescarForeignKeysDescripcionesProductoProduMano();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoprodumanoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoprodumanoLogic.saveProductoProduManoRelaciones(productoprodumanoAux);//WithConnection
								//productoprodumanoLogic.getSetVersionRowProductoProduManos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.productoprodumano,productoprodumanoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.productoprodumanoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.productoprodumanoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(productoprodumanoAux,productoprodumanoLogic.getProductoProduManos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(productoprodumanoAux,productoprodumanos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.productoprodumano,productoprodumanoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				productoprodumanoAux=new  ProductoProduMano();
				
				productoprodumanoAux.setIsNew(false);
				productoprodumanoAux.setIsChanged(false);
				
				productoprodumanoAux.setIsDeleted(true);
				
				productoprodumanoAux.setId(this.productoprodumano.getId());	
				productoprodumanoAux.setVersionRow(this.productoprodumano.getVersionRow());	
				productoprodumanoAux.setid_producto_defi_produ(this.productoprodumano.getid_producto_defi_produ());	
				productoprodumanoAux.setid_tipo_mano_produ_empresa(this.productoprodumano.getid_tipo_mano_produ_empresa());	
				productoprodumanoAux.setid_tipo_proceso_empresa_produ(this.productoprodumano.getid_tipo_proceso_empresa_produ());	
				productoprodumanoAux.setid_unidad(this.productoprodumano.getid_unidad());	
				productoprodumanoAux.setcantidad(this.productoprodumano.getcantidad());	
				productoprodumanoAux.setcosto(this.productoprodumano.getcosto());	
				productoprodumanoAux.setcosto_total(this.productoprodumano.getcosto_total());	
				productoprodumanoAux.setdescripcion(this.productoprodumano.getdescripcion());	
				
				if(this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.productoprodumanoAux.getId()>=0) {	
						this.productoprodumanosEliminados.add(productoprodumanoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(productoprodumanoAux,productoprodumanoLogic.getProductoProduManos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoprodumanoAux,productoprodumanos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.productoprodumanoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoprodumanoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodumanoLogic.saveProductoProduManos();//WithConnection
						//productoprodumanoLogic.getSetVersionRowProductoProduManos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoprodumanoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoprodumanoLogic.saveProductoProduManoRelaciones(productoprodumanoAux);//WithConnection
								//productoprodumanoLogic.getSetVersionRowProductoProduManos();//WithConnection
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
							if(this.productoprodumanoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.productoprodumanoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(productoprodumanoAux,productoprodumanoLogic.getProductoProduManos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(productoprodumanoAux,productoprodumanos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoLogic.getProductoProduManos().addAll(this.productoprodumanosEliminados);
					
					productoprodumanoLogic.saveProductoProduManos();//WithConnection
					//productoprodumanoLogic.getSetVersionRowProductoProduManos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesProductoProduMano();
				
				this.productoprodumanosEliminados= new ArrayList<ProductoProduMano>();		
			}
			
			if(this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Producto Mano De Obra Produccion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Producto Mano De Obra Produccion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.productoprodumano=productoprodumanoAux;
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
      		//this.finishProcessProductoProduMano();
      	}
		
	}	
	
	public void actualizarRelaciones(ProductoProduMano productoprodumanoLocal) throws Exception {
		
		if(this.productoprodumanoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProductoProduMano productoprodumanoLocal) throws Exception {	
		if(this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(ProductoDefiProduDetalleFormJInternalFrame.class)) {
				ProductoDefiProduBeanSwingJInternalFrame productodefiproduBeanSwingJInternalFrameLocal=(ProductoDefiProduBeanSwingJInternalFrame) ((ProductoDefiProduDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productodefiproduBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProductoDefiProdu(productodefiproduBeanSwingJInternalFrameLocal.getproductodefiprodu(),true);
				productodefiproduBeanSwingJInternalFrameLocal.actualizarLista(productodefiproduBeanSwingJInternalFrameLocal.productodefiprodu,this.productodefiprodusForeignKey);

				productodefiproduBeanSwingJInternalFrameLocal.actualizarRelaciones(productodefiproduBeanSwingJInternalFrameLocal.productodefiprodu);

				productoprodumanoLocal.setProductoDefiProdu(productodefiproduBeanSwingJInternalFrameLocal.productodefiprodu);

				this.addItemDefectoCombosForeignKeyProductoDefiProdu();
				this.cargarCombosFrameProductoDefiProdusForeignKey("Formulario");
				this.setActualProductoDefiProduForeignKey(productodefiproduBeanSwingJInternalFrameLocal.productodefiprodu.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoManoProduEmpresaDetalleFormJInternalFrame.class)) {
				TipoManoProduEmpresaBeanSwingJInternalFrame tipomanoproduempresaBeanSwingJInternalFrameLocal=(TipoManoProduEmpresaBeanSwingJInternalFrame) ((TipoManoProduEmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipomanoproduempresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoManoProduEmpresa(tipomanoproduempresaBeanSwingJInternalFrameLocal.gettipomanoproduempresa(),true);
				tipomanoproduempresaBeanSwingJInternalFrameLocal.actualizarLista(tipomanoproduempresaBeanSwingJInternalFrameLocal.tipomanoproduempresa,this.tipomanoproduempresasForeignKey);

				tipomanoproduempresaBeanSwingJInternalFrameLocal.actualizarRelaciones(tipomanoproduempresaBeanSwingJInternalFrameLocal.tipomanoproduempresa);

				productoprodumanoLocal.setTipoManoProduEmpresa(tipomanoproduempresaBeanSwingJInternalFrameLocal.tipomanoproduempresa);

				this.addItemDefectoCombosForeignKeyTipoManoProduEmpresa();
				this.cargarCombosFrameTipoManoProduEmpresasForeignKey("Formulario");
				this.setActualTipoManoProduEmpresaForeignKey(tipomanoproduempresaBeanSwingJInternalFrameLocal.tipomanoproduempresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoProcesoEmpresaProduDetalleFormJInternalFrame.class)) {
				TipoProcesoEmpresaProduBeanSwingJInternalFrame tipoprocesoempresaproduBeanSwingJInternalFrameLocal=(TipoProcesoEmpresaProduBeanSwingJInternalFrame) ((TipoProcesoEmpresaProduDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoprocesoempresaproduBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoProcesoEmpresaProdu(tipoprocesoempresaproduBeanSwingJInternalFrameLocal.gettipoprocesoempresaprodu(),true);
				tipoprocesoempresaproduBeanSwingJInternalFrameLocal.actualizarLista(tipoprocesoempresaproduBeanSwingJInternalFrameLocal.tipoprocesoempresaprodu,this.tipoprocesoempresaprodusForeignKey);

				tipoprocesoempresaproduBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoprocesoempresaproduBeanSwingJInternalFrameLocal.tipoprocesoempresaprodu);

				productoprodumanoLocal.setTipoProcesoEmpresaProdu(tipoprocesoempresaproduBeanSwingJInternalFrameLocal.tipoprocesoempresaprodu);

				this.addItemDefectoCombosForeignKeyTipoProcesoEmpresaProdu();
				this.cargarCombosFrameTipoProcesoEmpresaProdusForeignKey("Formulario");
				this.setActualTipoProcesoEmpresaProduForeignKey(tipoprocesoempresaproduBeanSwingJInternalFrameLocal.tipoprocesoempresaprodu.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UnidadDetalleFormJInternalFrame.class)) {
				UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrameLocal=(UnidadBeanSwingJInternalFrame) ((UnidadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				unidadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUnidad(unidadBeanSwingJInternalFrameLocal.getunidad(),true);
				unidadBeanSwingJInternalFrameLocal.actualizarLista(unidadBeanSwingJInternalFrameLocal.unidad,this.unidadsForeignKey);

				unidadBeanSwingJInternalFrameLocal.actualizarRelaciones(unidadBeanSwingJInternalFrameLocal.unidad);

				productoprodumanoLocal.setUnidad(unidadBeanSwingJInternalFrameLocal.unidad);

				this.addItemDefectoCombosForeignKeyUnidad();
				this.cargarCombosFrameUnidadsForeignKey("Formulario");
				this.setActualUnidadForeignKey(unidadBeanSwingJInternalFrameLocal.unidad.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProductoProduManoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProductoProduMano.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productoprodumano =(ProductoProduMano) this.productoprodumanoLogic.getProductoProduManos().toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.productoprodumano =(ProductoProduMano) this.productoprodumanos.toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = productoprodumanoValidator.getInvalidValues(this.productoprodumano);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProductoProduMano productoprodumano,List<ProductoProduMano> productoprodumanos) throws Exception {
		try	{		
			ProductoProduManoConstantesFunciones.actualizarLista(productoprodumano,productoprodumanos,this.productoprodumanoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ProductoProduMano productoprodumano,List<ProductoProduMano> productoprodumanos) throws Exception {
		try	{			
			ProductoProduManoConstantesFunciones.actualizarSelectedLista(productoprodumano,productoprodumanos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProductoProduMano> productoprodumanosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				productoprodumanosLocal=this.productoprodumanoLogic.getProductoProduManos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				productoprodumanosLocal=this.productoprodumanos;
			}
			//ARCHITECTURE
		
			for(ProductoProduMano productoprodumanoLocal:productoprodumanosLocal) {
				if(this.permiteMantenimiento(productoprodumanoLocal) && productoprodumanoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProductoProduManoConstantesFunciones.getProductoProduManoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProductoProduManoConstantesFunciones.IDPRODUCTODEFIPRODU)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduMano.jLabelid_producto_defi_produProductoProduMano,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProduManoConstantesFunciones.IDTIPOMANOPRODUEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduMano.jLabelid_tipo_mano_produ_empresaProductoProduMano,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProduManoConstantesFunciones.IDTIPOPROCESOEMPRESAPRODU)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduMano.jLabelid_tipo_proceso_empresa_produProductoProduMano,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProduManoConstantesFunciones.IDUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduMano.jLabelid_unidadProductoProduMano,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProduManoConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduMano.jLabelcantidadProductoProduMano,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProduManoConstantesFunciones.COSTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduMano.jLabelcostoProductoProduMano,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProduManoConstantesFunciones.COSTOTOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduMano.jLabelcosto_totalProductoProduMano,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProduManoConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduMano.jLabeldescripcionProductoProduMano,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProductoProduMano!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProduMano.jLabelid_producto_defi_produProductoProduMano,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProduMano.jLabelid_tipo_mano_produ_empresaProductoProduMano,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProduMano.jLabelid_tipo_proceso_empresa_produProductoProduMano,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProduMano.jLabelid_unidadProductoProduMano,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProduMano.jLabelcantidadProductoProduMano,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProduMano.jLabelcostoProductoProduMano,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProduMano.jLabelcosto_totalProductoProduMano,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProduMano.jLabeldescripcionProductoProduMano,"");
		
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
		this.iIdNuevoProductoProduMano--;	
		
		
		this.productoprodumanoAux=new ProductoProduMano();
		
		this.productoprodumanoAux.setId(this.iIdNuevoProductoProduMano);
		this.productoprodumanoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productoprodumanoLogic.getProductoProduManos().add(this.productoprodumanoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.productoprodumanos.add(this.productoprodumanoAux);
		}
		//ARCHITECTURE
		
		this.productoprodumano=this.productoprodumanoAux;
		
		if(ProductoProduManoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProductoProduMano(this.productoprodumano);
			this.setVariablesObjetoActualToFormularioForeignKeyProductoProduMano(this.productoprodumano);
		}
				
		//this.setDefaultControlesProductoProduMano();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProductoProduMano();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProductoProduMano();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductoProduMano();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductoProduMano(this.productoprodumanoBean,this.productoprodumano,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMano(this.productoprodumano);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ProductoProduManoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.productoprodumanoSessionBean.getConGuardarRelaciones()) {
			classes=ProductoProduManoConstantesFunciones.getClassesRelationshipsOfProductoProduMano(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.productoprodumanoReturnGeneral=productoprodumanoLogic.procesarEventosProductoProduManosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoprodumanoLogic.getProductoProduManos(),this.productoprodumano,this.productoprodumanoParameterGeneral,this.isEsNuevoProductoProduMano,classes);//this.productoprodumanoLogic.getProductoProduMano()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProductoProduMano(this.productoprodumanoReturnGeneral,this.productoprodumanoBean,false);
		
		if(this.productoprodumanoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProductoProduMano(this.productoprodumanoReturnGeneral.getProductoProduMano());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProductoProduMano(this.productoprodumanoReturnGeneral.getProductoProduMano());
		}
		
		if(this.productoprodumanoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProductoProduMano(this.productoprodumanoReturnGeneral.getProductoProduMano(),classes);//this.productoprodumanoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProductoProduMano(this.productoprodumano,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProductoProduMano();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProductoProduMano();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductoProduManoBeanSwingJInternalFrameAdditional.RecargarFormProductoProduMano(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProductoProduMano(false);
						
			if(productoprodumanoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProductoProduManoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoProduMano();
			}
			
			this.actualizarVisualTableDatosProductoProduMano();
			
			this.jTableDatosProductoProduMano.setRowSelectionInterval(this.getIndiceNuevoProductoProduMano(), this.getIndiceNuevoProductoProduMano());
			
			this.seleccionarFilaTablaProductoProduManoActual();
						
			this.actualizarEstadoCeldasBotonesProductoProduMano("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProductoProduMano(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProductoProduMano.jTextFieldcantidadProductoProduMano.setEnabled(isHabilitar && this.productoprodumanoConstantesFunciones.activarcantidadProductoProduMano);
		this.jInternalFrameDetalleFormProductoProduMano.jTextFieldcostoProductoProduMano.setEnabled(isHabilitar && this.productoprodumanoConstantesFunciones.activarcostoProductoProduMano);
		this.jInternalFrameDetalleFormProductoProduMano.jTextFieldcosto_totalProductoProduMano.setEnabled(isHabilitar && this.productoprodumanoConstantesFunciones.activarcosto_totalProductoProduMano);
		this.jInternalFrameDetalleFormProductoProduMano.jTextAreadescripcionProductoProduMano.setEnabled(isHabilitar && this.productoprodumanoConstantesFunciones.activardescripcionProductoProduMano);	
		
		this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_producto_defi_produProductoProduMano.setEnabled(isHabilitar && this.productoprodumanoConstantesFunciones.activarid_producto_defi_produProductoProduMano);
		this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_tipo_mano_produ_empresaProductoProduMano.setEnabled(isHabilitar && this.productoprodumanoConstantesFunciones.activarid_tipo_mano_produ_empresaProductoProduMano);
		this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_tipo_proceso_empresa_produProductoProduMano.setEnabled(isHabilitar && this.productoprodumanoConstantesFunciones.activarid_tipo_proceso_empresa_produProductoProduMano);
		this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_unidadProductoProduMano.setEnabled(isHabilitar && this.productoprodumanoConstantesFunciones.activarid_unidadProductoProduMano);
	};
	
	public void setDefaultControlesProductoProduMano() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProductoProduMano(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.productoprodumanoSessionBean.setConGuardarRelaciones(true);			
			this.productoprodumanoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProductoProduMano.jTabbedPaneRelacionesProductoProduMano.setVisible(true);
			
					
		} else {
			//this.productoprodumanoSessionBean.setConGuardarRelaciones(false);			
			this.productoprodumanoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProductoProduMano.jTabbedPaneRelacionesProductoProduMano.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProductoProduMano() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoProduMano productoprodumanoAux:this.productoprodumanoLogic.getProductoProduManos()) {
				if(productoprodumanoAux.getId().equals(this.iIdNuevoProductoProduMano)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoProduMano productoprodumanoAux:this.productoprodumanos) {
				if(productoprodumanoAux.getId().equals(this.iIdNuevoProductoProduMano)) {
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
	
	public int getIndiceActualProductoProduMano(ProductoProduMano productoprodumano,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoProduMano productoprodumanoAux:this.productoprodumanoLogic.getProductoProduManos()) {
				if(productoprodumanoAux.getId().equals(productoprodumano.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoProduMano productoprodumanoAux:this.productoprodumanos) {
				if(productoprodumanoAux.getId().equals(productoprodumano.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProductoProduMano(ProductoProduMano productoprodumanoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoProduMano productoprodumanoAux:this.productoprodumanoLogic.getProductoProduManos()) {
				if(productoprodumanoAux.getProductoProduManoOriginal().getId().equals(productoprodumanoOriginal.getId())) {
					existe=true;
					productoprodumanoOriginal.setId(productoprodumanoAux.getId());
					productoprodumanoOriginal.setVersionRow(productoprodumanoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoProduMano productoprodumanoAux:this.productoprodumanos) {
				if(productoprodumanoAux.getProductoProduManoOriginal().getId().equals(productoprodumanoOriginal.getId())) {
					existe=true;
					productoprodumanoOriginal.setId(productoprodumanoAux.getId());
					productoprodumanoOriginal.setVersionRow(productoprodumanoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProductoProduMano(Boolean esParaCancelar) throws Exception {
		productoprodumanosAux=new ArrayList<ProductoProduMano>();
		productoprodumanoAux=new ProductoProduMano();
		
		if(!this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductoProduMano productoprodumanoAux:this.productoprodumanoLogic.getProductoProduManos()) {
					if(productoprodumanoAux.getId()<0) {
						productoprodumanosAux.add(productoprodumanoAux);
					}		
				}
				this.iIdNuevoProductoProduMano=0L;
				this.productoprodumanoLogic.getProductoProduManos().removeAll(productoprodumanosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoProduMano productoprodumanoAux:this.productoprodumanos) {
					if(productoprodumanoAux.getId()<0) {
						productoprodumanosAux.add(productoprodumanoAux);
					}		
				}
				this.iIdNuevoProductoProduMano=0L;
				this.productoprodumanos.removeAll(productoprodumanosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProductoProduMano 
					&& this.productoprodumanoLogic.getProductoProduManos().size()>0
					) {
					productoprodumanoAux=this.productoprodumanoLogic.getProductoProduManos().get(this.productoprodumanoLogic.getProductoProduManos().size() - 1);
				
					if(productoprodumanoAux.getId()<0) {
						this.productoprodumanoLogic.getProductoProduManos().remove(productoprodumanoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProductoProduMano && this.productoprodumanos.size()>0) {
					productoprodumanoAux=this.productoprodumanos.get(this.productoprodumanos.size() - 1);
				
					if(productoprodumanoAux.getId()<0) {
						this.productoprodumanos.remove(productoprodumanoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProductoProduMano(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(productoprodumano.getId()<0) {
				this.productoprodumanoLogic.getProductoProduManos().remove(this.productoprodumano);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(productoprodumano.getId()<0) {
				this.productoprodumanos.remove(this.productoprodumano);
			}
		}			
	}
	
	public void setEstadosInicialesProductoProduMano(List<ProductoProduMano> productoprodumanosAux) throws Exception {
		ProductoProduManoConstantesFunciones.setEstadosInicialesProductoProduMano(productoprodumanosAux);
	}
	
	public void setEstadosInicialesProductoProduMano(ProductoProduMano productoprodumanoAux) throws Exception {
		ProductoProduManoConstantesFunciones.setEstadosInicialesProductoProduMano(productoprodumanoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProductoProduManoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProductoProduMano("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProductoProduManoActual()) {
				if(!this.isEsNuevoProductoProduMano) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProductoProduMano("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProductoProduMano=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProductoProduManoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Producto Mano De Obra Produccion ?", "MANTENIMIENTO DE Producto Mano De Obra Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProductoProduMano("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProductoProduMano productoprodumano) throws Exception {
		ProductoProduManoConstantesFunciones.seleccionarAsignar(this.productoprodumano,productoprodumano);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProductoProduMano=this.isPermisoActualizarOriginalProductoProduMano;
			
			
			this.seleccionarAsignar(productoprodumano);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductoProduManoConstantesFunciones.quitarEspaciosProductoProduMano(this.productoprodumano,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesProductoProduMano("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.productoprodumanoSessionBean.setsFuncionBusquedaRapida(this.productoprodumanoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProductoProduMano) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProductoProduMano(esParaCancelar);				
				this.cancelarNuevoProductoProduMano(esParaCancelar);								
			}
			
			this.productoprodumano=new ProductoProduMano();
			
			this.inicializarProductoProduMano();
			
			this.actualizarEstadoCeldasBotonesProductoProduMano("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProductoProduMano() throws Exception {
		try {
			ProductoProduManoConstantesFunciones.inicializarProductoProduMano(this.productoprodumano);
			
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
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.productoprodumanoLogic.getProductoProduManos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProductoProduManos(String sAccionBusqueda,List<ProductoProduMano> productoprodumanosParaReportes) throws Exception {
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
					sPathReporteFinal="ProductoProduMano"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProductoProduManoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProductoProduManoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProductoProduMano"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Producto Mano De Obra Producciones");		
		parameters.put("busquedapor", ProductoProduManoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProductoProduMano=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProductoProduManoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProductoProduManoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProductoProduMano=new JRBeanArrayDataSource(ProductoProduManoJInternalFrame.TraerProductoProduManoBeans(productoprodumanosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProductoProduMano);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProductoProduManoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProductoProduManoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProductoProduManoBean.TraerProductoProduManoBeans(productoprodumanosParaReportes).toArray()));
							
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
				this.generarExcelReporteProductoProduManos(sAccionBusqueda,sTipoArchivoReporte,productoprodumanosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProductoProduManos(sAccionBusqueda,sTipoArchivoReporte,productoprodumanosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProductoProduManoActionPerformed(null);
					//this.generarExcelReporteProductoProduManos(sAccionBusqueda,sTipoArchivoReporte,productoprodumanosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProductoProduManos(sAccionBusqueda,sTipoArchivoReporte,productoprodumanosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProductoProduManos(sAccionBusqueda,sTipoArchivoReporte,productoprodumanosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProductoProduManos(sAccionBusqueda,sTipoArchivoReporte,productoprodumanosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProductoProduManos(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoProduMano> productoprodumanosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoprodumano";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoProduManos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductoProduMano("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProductoProduMano productoprodumano : productoprodumanosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProductoProduManoConstantesFunciones.generarExcelReporteDataProductoProduMano("NORMAL",row,workbook,productoprodumano,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Mano De Obra Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProductoProduMano(String sTipo,Row row,Workbook workbook) {
		
		ProductoProduManoConstantesFunciones.generarExcelReporteHeaderProductoProduMano(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProductoProduManos(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoProduMano> productoprodumanosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoprodumano_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoProduManos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProductoProduMano productoprodumano : productoprodumanosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProductoProduManoConstantesFunciones.getProductoProduManoDescripcion(productoprodumano));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduManoConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduManoConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodumano.getproductodefiprodu_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduManoConstantesFunciones.LABEL_IDTIPOMANOPRODUEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduManoConstantesFunciones.LABEL_IDTIPOMANOPRODUEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodumano.gettipomanoproduempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduManoConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduManoConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodumano.gettipoprocesoempresaprodu_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduManoConstantesFunciones.LABEL_IDUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduManoConstantesFunciones.LABEL_IDUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodumano.getunidad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduManoConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduManoConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodumano.getcantidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduManoConstantesFunciones.LABEL_COSTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduManoConstantesFunciones.LABEL_COSTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodumano.getcosto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduManoConstantesFunciones.LABEL_COSTOTOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduManoConstantesFunciones.LABEL_COSTOTOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodumano.getcosto_total());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduManoConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduManoConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodumano.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Mano De Obra Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProductoProduManos(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoProduMano> productoprodumanosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProductoProduMano> productoprodumanosRespaldo=null;
		
		classes=ProductoProduManoConstantesFunciones.getClassesRelationshipsOfProductoProduMano(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.productoprodumanoLogic.setDatosCliente(this.datosCliente);
		this.productoprodumanoLogic.setDatosDeep(this.datosDeep);
		this.productoprodumanoLogic.setIsConDeep(true);
		
		productoprodumanosRespaldo=this.productoprodumanoLogic.getProductoProduManos();
		
		this.productoprodumanoLogic.setProductoProduManos(productoprodumanosParaReportes);	
		this.productoprodumanoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		productoprodumanosParaReportes=this.productoprodumanoLogic.getProductoProduManos();
		this.productoprodumanoLogic.setProductoProduManos(productoprodumanosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoprodumano_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoProduManos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductoProduMano("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProductoProduMano productoprodumano : productoprodumanosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProductoProduMano("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProductoProduManoConstantesFunciones.generarExcelReporteDataProductoProduMano("NORMAL",row,workbook,productoprodumano,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProductoProduManoConstantesFunciones.getProductoProduManoDescripcion(productoprodumano));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Mano De Obra Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductoProduMano.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoProduMano.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductoProduMano.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoProduMano.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProductoProduMano() throws Exception {		
		this.startProcessProductoProduMano(true);
	}
	
	public void startProcessProductoProduMano(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProductoProduMano ,this.jPanelParametrosReportesProductoProduMano, this.jScrollPanelDatosProductoProduMano,this.jPanelPaginacionProductoProduMano, this.jScrollPanelDatosEdicionProductoProduMano, this.jPanelAccionesProductoProduMano,this.jPanelAccionesFormularioProductoProduMano,this.jmenuBarProductoProduMano,this.jmenuBarDetalleProductoProduMano,this.jTtoolBarProductoProduMano,this.jTtoolBarDetalleProductoProduMano);		
		
		final JTabbedPane jTabbedPaneBusquedasProductoProduMano=this.jTabbedPaneBusquedasProductoProduMano; 
		
		final JPanel jPanelParametrosReportesProductoProduMano=this.jPanelParametrosReportesProductoProduMano;
		//final JScrollPane jScrollPanelDatosProductoProduMano=this.jScrollPanelDatosProductoProduMano;
		final JTable jTableDatosProductoProduMano=this.jTableDatosProductoProduMano;		
		final JPanel jPanelPaginacionProductoProduMano=this.jPanelPaginacionProductoProduMano;
		//final JScrollPane jScrollPanelDatosEdicionProductoProduMano=this.jScrollPanelDatosEdicionProductoProduMano;
		final JPanel jPanelAccionesProductoProduMano=this.jPanelAccionesProductoProduMano;
		
		JPanel jPanelCamposAuxiliarProductoProduMano=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProductoProduMano=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProductoProduMano!=null) {
			jPanelCamposAuxiliarProductoProduMano=this.jInternalFrameDetalleFormProductoProduMano.jPanelCamposProductoProduMano;
			jPanelAccionesFormularioAuxiliarProductoProduMano=this.jInternalFrameDetalleFormProductoProduMano.jPanelAccionesFormularioProductoProduMano;
		}
		
		final JPanel jPanelCamposProductoProduMano=jPanelCamposAuxiliarProductoProduMano;
		final JPanel jPanelAccionesFormularioProductoProduMano=jPanelAccionesFormularioAuxiliarProductoProduMano;
		
		
		final JMenuBar jmenuBarProductoProduMano=this.jmenuBarProductoProduMano;
		final JToolBar jTtoolBarProductoProduMano=this.jTtoolBarProductoProduMano;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProductoProduMano=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductoProduMano=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProductoProduMano!=null) {
			jmenuBarDetalleAuxiliarProductoProduMano=this.jInternalFrameDetalleFormProductoProduMano.jmenuBarDetalleProductoProduMano;
			jTtoolBarDetalleAuxiliarProductoProduMano=this.jInternalFrameDetalleFormProductoProduMano.jTtoolBarDetalleProductoProduMano;
		}
		
		final JMenuBar jmenuBarDetalleProductoProduMano=jmenuBarDetalleAuxiliarProductoProduMano;
		final JToolBar jTtoolBarDetalleProductoProduMano=jTtoolBarDetalleAuxiliarProductoProduMano;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductoProduMano;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductoProduMano;
			processRunnable.jTableDatos=jTableDatosProductoProduMano;
			processRunnable.jPanelCampos=jPanelCamposProductoProduMano;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductoProduMano;
			processRunnable.jPanelAcciones=jPanelAccionesProductoProduMano;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductoProduMano;
			
			
			processRunnable.jmenuBar=jmenuBarProductoProduMano;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductoProduMano;
			processRunnable.jTtoolBar=jTtoolBarProductoProduMano;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductoProduMano;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductoProduMano ,jPanelParametrosReportesProductoProduMano,jTableDatosProductoProduMano, /*jScrollPanelDatosProductoProduMano,*/jPanelCamposProductoProduMano,jPanelPaginacionProductoProduMano, /*jScrollPanelDatosEdicionProductoProduMano,*/ jPanelAccionesProductoProduMano,jPanelAccionesFormularioProductoProduMano,jmenuBarProductoProduMano,jmenuBarDetalleProductoProduMano,jTtoolBarProductoProduMano,jTtoolBarDetalleProductoProduMano);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductoProduMano ,jPanelParametrosReportesProductoProduMano, jScrollPanelDatosProductoProduMano,jPanelPaginacionProductoProduMano, jScrollPanelDatosEdicionProductoProduMano, jPanelAccionesProductoProduMano,jPanelAccionesFormularioProductoProduMano,jmenuBarProductoProduMano,jmenuBarDetalleProductoProduMano,jTtoolBarProductoProduMano,jTtoolBarDetalleProductoProduMano);
						
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
	
	public void finishProcessProductoProduMano() {// throws Exception 
		this.finishProcessProductoProduMano(true);
	}
	
	public void finishProcessProductoProduMano(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProductoProduMano ,this.jPanelParametrosReportesProductoProduMano, this.jScrollPanelDatosProductoProduMano,this.jPanelPaginacionProductoProduMano, this.jScrollPanelDatosEdicionProductoProduMano, this.jPanelAccionesProductoProduMano,this.jPanelAccionesFormularioProductoProduMano,this.jmenuBarProductoProduMano,this.jmenuBarDetalleProductoProduMano,this.jTtoolBarProductoProduMano,this.jTtoolBarDetalleProductoProduMano);		
		
		final JTabbedPane jTabbedPaneBusquedasProductoProduMano=this.jTabbedPaneBusquedasProductoProduMano; 
		
		final JPanel jPanelParametrosReportesProductoProduMano=this.jPanelParametrosReportesProductoProduMano;
		//final JScrollPane jScrollPanelDatosProductoProduMano=this.jScrollPanelDatosProductoProduMano;
		final JTable jTableDatosProductoProduMano=this.jTableDatosProductoProduMano;		
		final JPanel jPanelPaginacionProductoProduMano=this.jPanelPaginacionProductoProduMano;
		//final JScrollPane jScrollPanelDatosEdicionProductoProduMano=this.jScrollPanelDatosEdicionProductoProduMano;
		final JPanel jPanelAccionesProductoProduMano=this.jPanelAccionesProductoProduMano;
		
		JPanel jPanelCamposAuxiliarProductoProduMano=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProductoProduMano=new JPanel();
		
		if(this.jInternalFrameDetalleFormProductoProduMano!=null) {
			jPanelCamposAuxiliarProductoProduMano=this.jInternalFrameDetalleFormProductoProduMano.jPanelCamposProductoProduMano;
			jPanelAccionesFormularioAuxiliarProductoProduMano=this.jInternalFrameDetalleFormProductoProduMano.jPanelAccionesFormularioProductoProduMano;
		}
		
		final JPanel jPanelCamposProductoProduMano=jPanelCamposAuxiliarProductoProduMano;
		final JPanel jPanelAccionesFormularioProductoProduMano=jPanelAccionesFormularioAuxiliarProductoProduMano;
		
		
		final JMenuBar jmenuBarProductoProduMano=this.jmenuBarProductoProduMano;		
		final JToolBar jTtoolBarProductoProduMano=this.jTtoolBarProductoProduMano;
				
		JMenuBar jmenuBarDetalleAuxiliarProductoProduMano=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductoProduMano=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProductoProduMano!=null) {
			jmenuBarDetalleAuxiliarProductoProduMano=this.jInternalFrameDetalleFormProductoProduMano.jmenuBarDetalleProductoProduMano;
			jTtoolBarDetalleAuxiliarProductoProduMano=this.jInternalFrameDetalleFormProductoProduMano.jTtoolBarDetalleProductoProduMano;		
		}
		
		final JMenuBar jmenuBarDetalleProductoProduMano=jmenuBarDetalleAuxiliarProductoProduMano;
		final JToolBar jTtoolBarDetalleProductoProduMano=jTtoolBarDetalleAuxiliarProductoProduMano;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductoProduMano;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductoProduMano;
			processRunnable.jTableDatos=jTableDatosProductoProduMano;
			processRunnable.jPanelCampos=jPanelCamposProductoProduMano;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductoProduMano;
			processRunnable.jPanelAcciones=jPanelAccionesProductoProduMano;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductoProduMano;
			
			
			processRunnable.jmenuBar=jmenuBarProductoProduMano;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductoProduMano;
			processRunnable.jTtoolBar=jTtoolBarProductoProduMano;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductoProduMano;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProductoProduMano ,jPanelParametrosReportesProductoProduMano, jTableDatosProductoProduMano,/*jScrollPanelDatosProductoProduMano,*/jPanelCamposProductoProduMano,jPanelPaginacionProductoProduMano, /*jScrollPanelDatosEdicionProductoProduMano,*/ jPanelAccionesProductoProduMano,jPanelAccionesFormularioProductoProduMano,jmenuBarProductoProduMano,jmenuBarDetalleProductoProduMano,jTtoolBarProductoProduMano,jTtoolBarDetalleProductoProduMano));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProductoProduMano(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProductoProduMano(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProductoProduMano(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProductoProduMano(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProductoProduMano,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProductoProduMano,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProductoProduMano(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProductoProduMano,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProductoProduMano,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.productoprodumanoConstantesFunciones.getsFinalQueryProductoProduMano();
		String  finalQueryPaginacionTodos=this.productoprodumanoConstantesFunciones.getsFinalQueryProductoProduMano();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProductoProduManoConstantesFunciones.getArrayColumnasGlobalesNoProductoProduMano(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProductoProduManoConstantesFunciones.getArrayColumnasGlobalesProductoProduMano(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProductoProduManoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.productoprodumanosEliminados= new ArrayList<ProductoProduMano>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProductoProduMano();
		
				///*ProductoProduManoSessionBean*/this.productoprodumanoSessionBean=new ProductoProduManoSessionBean();
			
			if(this.productoprodumanoSessionBean==null) {
				this.productoprodumanoSessionBean=new ProductoProduManoSessionBean();
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
					this.iNumeroPaginacion=ProductoProduManoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProductoProduManoConstantesFunciones.getClassesForeignKeysOfProductoProduMano(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/productoprodumano."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			productoprodumanosAux= new ArrayList<ProductoProduMano>();
			
				
			productoprodumanoLogic.setDatosCliente(this.datosCliente);
			productoprodumanoLogic.setDatosDeep(this.datosDeep);
			productoprodumanoLogic.setIsConDeep(true);
			
			
			productoprodumanoLogic.getProductoProduManoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					productoprodumanoLogic.getTodosProductoProduManos(finalQueryGlobal,pagination);
					
					//productoprodumanoLogic.getTodosProductoProduManosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(productoprodumanoLogic.getProductoProduManos()==null|| productoprodumanoLogic.getProductoProduManos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoprodumanosAux= new ArrayList<ProductoProduMano>();
							productoprodumanosAux.addAll(productoprodumanoLogic.getProductoProduManos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodumanosAux= new ArrayList<ProductoProduMano>();
							productoprodumanosAux.addAll(productoprodumanos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoprodumanoLogic.getTodosProductoProduManos(finalQueryGlobal+"",this.pagination);												
							
							//productoprodumanoLogic.getTodosProductoProduManosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteProductoProduManos("Todos",productoprodumanoLogic.getProductoProduManos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoprodumanoLogic.setProductoProduManos(new ArrayList<ProductoProduMano>());					
							productoprodumanoLogic.getProductoProduManos().addAll(productoprodumanosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodumanos=new ArrayList<ProductoProduMano>();
							productoprodumanos.addAll(productoprodumanosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idProductoProduMano=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idProductoProduMano=this.idActual;
				
				} else if(this.idProductoProduManoActual!=null && this.idProductoProduManoActual!=0L) {
					idProductoProduMano=idProductoProduManoActual;
				}
				
					
				this.sDetalleReporte=ProductoProduManoConstantesFunciones.getDetalleIndicePorId(idProductoProduMano);
				
				this.productoprodumanos=new ArrayList<ProductoProduMano>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					productoprodumanoLogic.getEntity(idProductoProduMano);
					
					//productoprodumanoLogic.getEntityWithConnection(idProductoProduMano);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoprodumanoLogic.setProductoProduManos(new ArrayList<ProductoProduMano>());
					productoprodumanoLogic.getProductoProduManos().add(productoprodumanoLogic.getProductoProduMano());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoprodumanos=new ArrayList<ProductoProduMano>();
					this.productoprodumanos.add(productoprodumano);
				}
				
				if(productoprodumanoLogic.getProductoProduMano()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdProductoDefiProdu")) {
				this.sDetalleReporte=ProductoProduManoConstantesFunciones.getDetalleIndiceFK_IdProductoDefiProdu(id_producto_defi_produFK_IdProductoDefiProdu);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoprodumanoLogic.getProductoProduManosFK_IdProductoDefiProdu(finalQueryGlobal,pagination,id_producto_defi_produFK_IdProductoDefiProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduManoConstantesFunciones.getDetalleIndiceFK_IdProductoDefiProdu(id_producto_defi_produFK_IdProductoDefiProdu);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduManoConstantesFunciones.getDetalleIndiceFK_IdProductoDefiProdu(id_producto_defi_produFK_IdProductoDefiProdu);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoprodumanoLogic.getProductoProduManos()==null||productoprodumanoLogic.getProductoProduManos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoprodumanos==null|| productoprodumanos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodumanosAux=new ArrayList<ProductoProduMano>();
						productoprodumanosAux.addAll(productoprodumanoLogic.getProductoProduManos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodumanosAux=new ArrayList<ProductoProduMano>();
							productoprodumanosAux.addAll(productoprodumanos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoprodumanoLogic.getProductoProduManosFK_IdProductoDefiProdu(finalQueryGlobal,pagination,id_producto_defi_produFK_IdProductoDefiProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduManoConstantesFunciones.getDetalleIndiceFK_IdProductoDefiProdu(id_producto_defi_produFK_IdProductoDefiProdu);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduManoConstantesFunciones.getDetalleIndiceFK_IdProductoDefiProdu(id_producto_defi_produFK_IdProductoDefiProdu);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoProduManos("FK_IdProductoDefiProdu",productoprodumanoLogic.getProductoProduManos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoProduManos("FK_IdProductoDefiProdu",productoprodumanos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodumanoLogic.setProductoProduManos(new ArrayList<ProductoProduMano>());
						productoprodumanoLogic.getProductoProduManos().addAll(productoprodumanosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodumanos=new ArrayList<ProductoProduMano>();
							productoprodumanos.addAll(productoprodumanosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoManoProduEmpresa")) {
				this.sDetalleReporte=ProductoProduManoConstantesFunciones.getDetalleIndiceFK_IdTipoManoProduEmpresa(id_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoprodumanoLogic.getProductoProduManosFK_IdTipoManoProduEmpresa(finalQueryGlobal,pagination,id_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduManoConstantesFunciones.getDetalleIndiceFK_IdTipoManoProduEmpresa(id_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduManoConstantesFunciones.getDetalleIndiceFK_IdTipoManoProduEmpresa(id_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoprodumanoLogic.getProductoProduManos()==null||productoprodumanoLogic.getProductoProduManos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoprodumanos==null|| productoprodumanos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodumanosAux=new ArrayList<ProductoProduMano>();
						productoprodumanosAux.addAll(productoprodumanoLogic.getProductoProduManos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodumanosAux=new ArrayList<ProductoProduMano>();
							productoprodumanosAux.addAll(productoprodumanos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoprodumanoLogic.getProductoProduManosFK_IdTipoManoProduEmpresa(finalQueryGlobal,pagination,id_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduManoConstantesFunciones.getDetalleIndiceFK_IdTipoManoProduEmpresa(id_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduManoConstantesFunciones.getDetalleIndiceFK_IdTipoManoProduEmpresa(id_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoProduManos("FK_IdTipoManoProduEmpresa",productoprodumanoLogic.getProductoProduManos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoProduManos("FK_IdTipoManoProduEmpresa",productoprodumanos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodumanoLogic.setProductoProduManos(new ArrayList<ProductoProduMano>());
						productoprodumanoLogic.getProductoProduManos().addAll(productoprodumanosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodumanos=new ArrayList<ProductoProduMano>();
							productoprodumanos.addAll(productoprodumanosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoProcesoEmpresaProdu")) {
				this.sDetalleReporte=ProductoProduManoConstantesFunciones.getDetalleIndiceFK_IdTipoProcesoEmpresaProdu(id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoprodumanoLogic.getProductoProduManosFK_IdTipoProcesoEmpresaProdu(finalQueryGlobal,pagination,id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduManoConstantesFunciones.getDetalleIndiceFK_IdTipoProcesoEmpresaProdu(id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduManoConstantesFunciones.getDetalleIndiceFK_IdTipoProcesoEmpresaProdu(id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoprodumanoLogic.getProductoProduManos()==null||productoprodumanoLogic.getProductoProduManos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoprodumanos==null|| productoprodumanos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodumanosAux=new ArrayList<ProductoProduMano>();
						productoprodumanosAux.addAll(productoprodumanoLogic.getProductoProduManos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodumanosAux=new ArrayList<ProductoProduMano>();
							productoprodumanosAux.addAll(productoprodumanos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoprodumanoLogic.getProductoProduManosFK_IdTipoProcesoEmpresaProdu(finalQueryGlobal,pagination,id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduManoConstantesFunciones.getDetalleIndiceFK_IdTipoProcesoEmpresaProdu(id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduManoConstantesFunciones.getDetalleIndiceFK_IdTipoProcesoEmpresaProdu(id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoProduManos("FK_IdTipoProcesoEmpresaProdu",productoprodumanoLogic.getProductoProduManos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoProduManos("FK_IdTipoProcesoEmpresaProdu",productoprodumanos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodumanoLogic.setProductoProduManos(new ArrayList<ProductoProduMano>());
						productoprodumanoLogic.getProductoProduManos().addAll(productoprodumanosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodumanos=new ArrayList<ProductoProduMano>();
							productoprodumanos.addAll(productoprodumanosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUnidad")) {
				this.sDetalleReporte=ProductoProduManoConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoprodumanoLogic.getProductoProduManosFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduManoConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduManoConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoprodumanoLogic.getProductoProduManos()==null||productoprodumanoLogic.getProductoProduManos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoprodumanos==null|| productoprodumanos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodumanosAux=new ArrayList<ProductoProduMano>();
						productoprodumanosAux.addAll(productoprodumanoLogic.getProductoProduManos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodumanosAux=new ArrayList<ProductoProduMano>();
							productoprodumanosAux.addAll(productoprodumanos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoprodumanoLogic.getProductoProduManosFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduManoConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduManoConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoProduManos("FK_IdUnidad",productoprodumanoLogic.getProductoProduManos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoProduManos("FK_IdUnidad",productoprodumanos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodumanoLogic.setProductoProduManos(new ArrayList<ProductoProduMano>());
						productoprodumanoLogic.getProductoProduManos().addAll(productoprodumanosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodumanos=new ArrayList<ProductoProduMano>();
							productoprodumanos.addAll(productoprodumanosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProductoProduMano();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProductoProduMano();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productoprodumanoLogic.getProductoProduManos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoprodumanos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productoprodumanoLogic.getProductoProduManos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoprodumanos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProductoProduMano productoprodumano) {
		Boolean permite=true;
		
		if(this.productoprodumano.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProductoProduManoConstantesFunciones.getOrderByListaProductoProduMano();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProductoProduManoConstantesFunciones.getOrderByListaProductoProduMano();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoProduMano productoprodumano:productoprodumanoLogic.getProductoProduManos()) {
				if(productoprodumano.getsType().equals(Constantes2.S_TOTALES)) {
					productoprodumanoTotales=productoprodumano;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoProduMano productoprodumano:this.productoprodumanos) {
				if(productoprodumano.getsType().equals(Constantes2.S_TOTALES)) {
					productoprodumanoTotales=productoprodumano;
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
			this.productoprodumanoAux=new ProductoProduMano();
			this.productoprodumanoAux.setsType(Constantes2.S_TOTALES);
			this.productoprodumanoAux.setIsNew(false);
			this.productoprodumanoAux.setIsChanged(false);
			this.productoprodumanoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ProductoProduManoConstantesFunciones.TotalizarValoresFilaProductoProduMano(this.productoprodumanoLogic.getProductoProduManos(),this.productoprodumanoAux);
				
				this.productoprodumanoLogic.getProductoProduManos().add(this.productoprodumanoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProductoProduManoConstantesFunciones.TotalizarValoresFilaProductoProduMano(this.productoprodumanos,this.productoprodumanoAux);
				
				this.productoprodumanos.add(this.productoprodumanoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		productoprodumanoTotales=new ProductoProduMano();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productoprodumanoLogic.getProductoProduManos().remove(productoprodumanoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productoprodumanos.remove(productoprodumanoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		productoprodumanoTotales=new ProductoProduMano();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoProduMano productoprodumano:productoprodumanoLogic.getProductoProduManos()) {
				if(productoprodumano.getsType().equals(Constantes2.S_TOTALES)) {
					productoprodumanoTotales=productoprodumano;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductoProduManoConstantesFunciones.TotalizarValoresFilaProductoProduMano(this.productoprodumanoLogic.getProductoProduManos(),productoprodumanoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoProduMano productoprodumano:this.productoprodumanos) {
				if(productoprodumano.getsType().equals(Constantes2.S_TOTALES)) {
					productoprodumanoTotales=productoprodumano;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductoProduManoConstantesFunciones.TotalizarValoresFilaProductoProduMano(this.productoprodumanos,productoprodumanoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProductoProduManosFK_IdProductoDefiProdu()throws Exception {
		try {
			sAccionBusqueda="FK_IdProductoDefiProdu";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoProduManosFK_IdTipoManoProduEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoManoProduEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoProduManosFK_IdTipoProcesoEmpresaProdu()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoProcesoEmpresaProdu";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoProduManosFK_IdUnidad()throws Exception {
		try {
			sAccionBusqueda="FK_IdUnidad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProductoProduManosFK_IdProductoDefiProdu(String sFinalQuery,Long id_producto_defi_produ)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoprodumanoLogic.getProductoProduManosFK_IdProductoDefiProdu(sFinalQuery,this.pagination,id_producto_defi_produ);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoProduManosFK_IdTipoManoProduEmpresa(String sFinalQuery,Long id_tipo_mano_produ_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoprodumanoLogic.getProductoProduManosFK_IdTipoManoProduEmpresa(sFinalQuery,this.pagination,id_tipo_mano_produ_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoProduManosFK_IdTipoProcesoEmpresaProdu(String sFinalQuery,Long id_tipo_proceso_empresa_produ)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoprodumanoLogic.getProductoProduManosFK_IdTipoProcesoEmpresaProdu(sFinalQuery,this.pagination,id_tipo_proceso_empresa_produ);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoProduManosFK_IdUnidad(String sFinalQuery,Long id_unidad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoprodumanoLogic.getProductoProduManosFK_IdUnidad(sFinalQuery,this.pagination,id_unidad);
				
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
	
	public void inicializarPermisosProductoProduMano() {
		this.isPermisoTodoProductoProduMano=false;
		this.isPermisoNuevoProductoProduMano=false;
		this.isPermisoActualizarProductoProduMano=false;
		this.isPermisoActualizarOriginalProductoProduMano=false;
		this.isPermisoEliminarProductoProduMano=false;
		this.isPermisoGuardarCambiosProductoProduMano=false;
		this.isPermisoConsultaProductoProduMano=false;
		this.isPermisoBusquedaProductoProduMano=false;
		this.isPermisoReporteProductoProduMano=false;		
		this.isPermisoOrdenProductoProduMano=false;		
		this.isPermisoPaginacionMedioProductoProduMano=false;		
		this.isPermisoPaginacionAltoProductoProduMano=false;
		this.isPermisoPaginacionTodoProductoProduMano=false;
		this.isPermisoCopiarProductoProduMano=false;		
		this.isPermisoVerFormProductoProduMano=false;		
		this.isPermisoDuplicarProductoProduMano=false;		
		this.isPermisoOrdenProductoProduMano=false;		
	}
	
	public void setPermisosUsuarioProductoProduMano(Boolean isPermiso) {
		this.isPermisoTodoProductoProduMano=isPermiso;
		this.isPermisoNuevoProductoProduMano=isPermiso;
		this.isPermisoActualizarProductoProduMano=isPermiso;
		this.isPermisoActualizarOriginalProductoProduMano=isPermiso;
		this.isPermisoEliminarProductoProduMano=isPermiso;
		this.isPermisoGuardarCambiosProductoProduMano=isPermiso;
		this.isPermisoConsultaProductoProduMano=isPermiso;
		this.isPermisoBusquedaProductoProduMano=isPermiso;
		this.isPermisoReporteProductoProduMano=isPermiso;
		this.isPermisoOrdenProductoProduMano=isPermiso;		
		this.isPermisoPaginacionMedioProductoProduMano=isPermiso;		
		this.isPermisoPaginacionAltoProductoProduMano=isPermiso;		
		this.isPermisoPaginacionTodoProductoProduMano=isPermiso;		
		this.isPermisoCopiarProductoProduMano=isPermiso;		
		this.isPermisoVerFormProductoProduMano=isPermiso;		
		this.isPermisoDuplicarProductoProduMano=isPermiso;
		this.isPermisoOrdenProductoProduMano=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProductoProduMano(Boolean isPermiso) {
		//this.isPermisoTodoProductoProduMano=isPermiso;
		this.isPermisoNuevoProductoProduMano=isPermiso;
		this.isPermisoActualizarProductoProduMano=isPermiso;
		this.isPermisoActualizarOriginalProductoProduMano=isPermiso;
		this.isPermisoEliminarProductoProduMano=isPermiso;
		this.isPermisoGuardarCambiosProductoProduMano=isPermiso;
		//this.isPermisoConsultaProductoProduMano=isPermiso;
		//this.isPermisoBusquedaProductoProduMano=isPermiso;
		//this.isPermisoReporteProductoProduMano=isPermiso;
		//this.isPermisoOrdenProductoProduMano=isPermiso;		
		//this.isPermisoPaginacionMedioProductoProduMano=isPermiso;		
		//this.isPermisoPaginacionAltoProductoProduMano=isPermiso;		
		//this.isPermisoPaginacionTodoProductoProduMano=isPermiso;		
		//this.isPermisoCopiarProductoProduMano=isPermiso;		
		//this.isPermisoDuplicarProductoProduMano=isPermiso;
		//this.isPermisoOrdenProductoProduMano=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProductoProduManoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProductoProduManoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProductoProduMano(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProductoProduManoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProductoProduManoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProductoProduManoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProductoProduManoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProductoProduMano() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProductoProduManoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProductoProduManoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProductoProduMano=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProductoProduMano=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProductoProduMano=this.isPermisoActualizarProductoProduMano;
			this.isPermisoEliminarProductoProduMano=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProductoProduMano=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProductoProduMano=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProductoProduMano=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProductoProduMano=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProductoProduMano=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductoProduMano=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProductoProduMano=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProductoProduMano=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProductoProduMano=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProductoProduMano=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProductoProduMano=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProductoProduMano=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductoProduMano=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProductoProduMano.setToolTipText(this.jTableDatosProductoProduMano.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProductoProduMano(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProductoProduMano(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProductoProduManoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProductoProduManoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProductoProduMano() throws Exception {
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
	public void inicializarCombosForeignKeyProductoProduManoListas()throws Exception {
		try	{						
			
				this.productodefiprodusForeignKey=new ArrayList();
				this.tipomanoproduempresasForeignKey=new ArrayList();
				this.tipoprocesoempresaprodusForeignKey=new ArrayList();
				this.unidadsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProductoProduManoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProductoProduManoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyProductoProduManoListas(false);
			} else {
			
				this.cargarCombosForeignKeyProductoDefiProduListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoManoProduEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoProcesoEmpresaProduListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoManoProduEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipomanoproduempresasForeignKey==null||this.tipomanoproduempresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoManoProduEmpresaConstantesFunciones.getArrayColumnasGlobalesTipoManoProduEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoManoProduEmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoManoProduEmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoManoProduEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoProcesoEmpresaProduListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoprocesoempresaprodusForeignKey==null||this.tipoprocesoempresaprodusForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoProcesoEmpresaProduConstantesFunciones.getArrayColumnasGlobalesTipoProcesoEmpresaProdu(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoProcesoEmpresaProduConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoProcesoEmpresaProduConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoProcesoEmpresaProdusForeignKeyLista(finalQueryGlobal);
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

			if((this.unidadsForeignKey==null||this.unidadsForeignKey.size()<=0)) {
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
	
	public void cargarCombosLoteForeignKeyProductoProduManoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ProductoProduManoParameterReturnGeneral productoprodumanoReturnGeneral=new ProductoProduManoParameterReturnGeneral();
						
			


				String finalQueryGlobalProductoDefiProdu="";

				if(((this.productodefiprodusForeignKey==null||this.productodefiprodusForeignKey.size()<=0) && this.productoprodumanoConstantesFunciones.cargarid_producto_defi_produProductoProduMano)
					 || (this.esRecargarFks && this.productoprodumanoConstantesFunciones.cargarid_producto_defi_produProductoProduMano)) {

					if(!this.productoprodumanoSessionBean.getisBusquedaDesdeForeignKeySesionProductoDefiProdu()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoDefiProduConstantesFunciones.getArrayColumnasGlobalesProductoDefiProdu(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProductoDefiProdu=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoDefiProduConstantesFunciones.TABLENAME);

						finalQueryGlobalProductoDefiProdu=Funciones.GetFinalQueryAppend(finalQueryGlobalProductoDefiProdu, "");
						finalQueryGlobalProductoDefiProdu+=ProductoDefiProduConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductoDefiProdusForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProductoDefiProdu=" WHERE " + ConstantesSql.ID + "="+productoprodumanoSessionBean.getlidProductoDefiProduActual();
					}
				} else {
					finalQueryGlobalProductoDefiProdu="NONE";
				}


				String finalQueryGlobalTipoManoProduEmpresa="";

				if(((this.tipomanoproduempresasForeignKey==null||this.tipomanoproduempresasForeignKey.size()<=0) && this.productoprodumanoConstantesFunciones.cargarid_tipo_mano_produ_empresaProductoProduMano)
					 || (this.esRecargarFks && this.productoprodumanoConstantesFunciones.cargarid_tipo_mano_produ_empresaProductoProduMano)) {

					if(!this.productoprodumanoSessionBean.getisBusquedaDesdeForeignKeySesionTipoManoProduEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoManoProduEmpresaConstantesFunciones.getArrayColumnasGlobalesTipoManoProduEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoManoProduEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoManoProduEmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoManoProduEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoManoProduEmpresa, "");
						finalQueryGlobalTipoManoProduEmpresa+=TipoManoProduEmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoManoProduEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoManoProduEmpresa=" WHERE " + ConstantesSql.ID + "="+productoprodumanoSessionBean.getlidTipoManoProduEmpresaActual();
					}
				} else {
					finalQueryGlobalTipoManoProduEmpresa="NONE";
				}


				String finalQueryGlobalTipoProcesoEmpresaProdu="";

				if(((this.tipoprocesoempresaprodusForeignKey==null||this.tipoprocesoempresaprodusForeignKey.size()<=0) && this.productoprodumanoConstantesFunciones.cargarid_tipo_proceso_empresa_produProductoProduMano)
					 || (this.esRecargarFks && this.productoprodumanoConstantesFunciones.cargarid_tipo_proceso_empresa_produProductoProduMano)) {

					if(!this.productoprodumanoSessionBean.getisBusquedaDesdeForeignKeySesionTipoProcesoEmpresaProdu()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoProcesoEmpresaProduConstantesFunciones.getArrayColumnasGlobalesTipoProcesoEmpresaProdu(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoProcesoEmpresaProdu=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoProcesoEmpresaProduConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoProcesoEmpresaProdu=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoProcesoEmpresaProdu, "");
						finalQueryGlobalTipoProcesoEmpresaProdu+=TipoProcesoEmpresaProduConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoProcesoEmpresaProdusForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoProcesoEmpresaProdu=" WHERE " + ConstantesSql.ID + "="+productoprodumanoSessionBean.getlidTipoProcesoEmpresaProduActual();
					}
				} else {
					finalQueryGlobalTipoProcesoEmpresaProdu="NONE";
				}


				String finalQueryGlobalUnidad="";

				if(((this.unidadsForeignKey==null||this.unidadsForeignKey.size()<=0) && this.productoprodumanoConstantesFunciones.cargarid_unidadProductoProduMano)
					 || (this.esRecargarFks && this.productoprodumanoConstantesFunciones.cargarid_unidadProductoProduMano)) {

					if(!this.productoprodumanoSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UnidadConstantesFunciones.getArrayColumnasGlobalesUnidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUnidad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UnidadConstantesFunciones.TABLENAME);

						finalQueryGlobalUnidad=Funciones.GetFinalQueryAppend(finalQueryGlobalUnidad, "");
						finalQueryGlobalUnidad+=UnidadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUnidadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUnidad=" WHERE " + ConstantesSql.ID + "="+productoprodumanoSessionBean.getlidUnidadActual();
					}
				} else {
					finalQueryGlobalUnidad="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				productoprodumanoReturnGeneral=productoprodumanoLogic.cargarCombosLoteForeignKeyProductoProduMano(finalQueryGlobalProductoDefiProdu,finalQueryGlobalTipoManoProduEmpresa,finalQueryGlobalTipoProcesoEmpresaProdu,finalQueryGlobalUnidad);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalProductoDefiProdu.equals("NONE")) {
				this.productodefiprodusForeignKey=productoprodumanoReturnGeneral.getproductodefiprodusForeignKey();
			}

			if(!finalQueryGlobalTipoManoProduEmpresa.equals("NONE")) {
				this.tipomanoproduempresasForeignKey=productoprodumanoReturnGeneral.gettipomanoproduempresasForeignKey();
			}

			if(!finalQueryGlobalTipoProcesoEmpresaProdu.equals("NONE")) {
				this.tipoprocesoempresaprodusForeignKey=productoprodumanoReturnGeneral.gettipoprocesoempresaprodusForeignKey();
			}

			if(!finalQueryGlobalUnidad.equals("NONE")) {
				this.unidadsForeignKey=productoprodumanoReturnGeneral.getunidadsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyProductoProduMano()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyProductoDefiProdu();
			this.addItemDefectoCombosForeignKeyTipoManoProduEmpresa();
			this.addItemDefectoCombosForeignKeyTipoProcesoEmpresaProdu();
			this.addItemDefectoCombosForeignKeyUnidad();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyProductoDefiProdu()throws Exception {
		try {
			if(this.productoprodumanoSessionBean==null) {
				this.productoprodumanoSessionBean=new ProductoProduManoSessionBean();
			}

			if(!this.productoprodumanoSessionBean.getisBusquedaDesdeForeignKeySesionProductoDefiProdu()) {
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

	public void addItemDefectoCombosForeignKeyTipoManoProduEmpresa()throws Exception {
		try {

			if(!this.productoprodumanoSessionBean.getisBusquedaDesdeForeignKeySesionTipoManoProduEmpresa()) {
				TipoManoProduEmpresa tipomanoproduempresa=new TipoManoProduEmpresa();
				TipoManoProduEmpresaConstantesFunciones.setTipoManoProduEmpresaDescripcion(tipomanoproduempresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipomanoproduempresa.setId(null);

				if(!TipoManoProduEmpresaConstantesFunciones.ExisteEnLista(this.tipomanoproduempresasForeignKey,tipomanoproduempresa,true)) {

					this.tipomanoproduempresasForeignKey.add(0,tipomanoproduempresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoProcesoEmpresaProdu()throws Exception {
		try {

			if(!this.productoprodumanoSessionBean.getisBusquedaDesdeForeignKeySesionTipoProcesoEmpresaProdu()) {
				TipoProcesoEmpresaProdu tipoprocesoempresaprodu=new TipoProcesoEmpresaProdu();
				TipoProcesoEmpresaProduConstantesFunciones.setTipoProcesoEmpresaProduDescripcion(tipoprocesoempresaprodu,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoprocesoempresaprodu.setId(null);

				if(!TipoProcesoEmpresaProduConstantesFunciones.ExisteEnLista(this.tipoprocesoempresaprodusForeignKey,tipoprocesoempresaprodu,true)) {

					this.tipoprocesoempresaprodusForeignKey.add(0,tipoprocesoempresaprodu);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyUnidad()throws Exception {
		try {

			if(!this.productoprodumanoSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
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
	
	public void initActionsCombosTodosForeignKeyProductoProduMano()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProductoProduMano(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProductoProduMano()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductoProduMano();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProductoProduMano(ProductoProduMano productoprodumano)throws Exception {	
		try {
			
			this.setActualProductoDefiProduForeignKey(productoprodumano.getid_producto_defi_produ(),false,"Formulario");
			this.setActualTipoManoProduEmpresaForeignKey(productoprodumano.getid_tipo_mano_produ_empresa(),false,"Formulario");
			this.setActualTipoProcesoEmpresaProduForeignKey(productoprodumano.getid_tipo_proceso_empresa_produ(),false,"Formulario");
			this.setActualUnidadForeignKey(productoprodumano.getid_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProductoProduMano(ProductoProduMano productoprodumano,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProductoProduMano()throws Exception {	
		try {
			
			this.setActualProductoDefiProduForeignKey(this.productoprodumanoConstantesFunciones.getid_producto_defi_produ(),false,"Formulario");
			this.setActualTipoManoProduEmpresaForeignKey(this.productoprodumanoConstantesFunciones.getid_tipo_mano_produ_empresa(),false,"Formulario");
			this.setActualTipoProcesoEmpresaProduForeignKey(this.productoprodumanoConstantesFunciones.getid_tipo_proceso_empresa_produ(),false,"Formulario");
			this.setActualUnidadForeignKey(this.productoprodumanoConstantesFunciones.getid_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProductoProduMano()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProductoProduMano()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProductoProduMano()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProductoProduMano()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProductoProduMano()throws Exception {
		try {
			

			this.cargarCombosFrameProductoDefiProdusForeignKey("Todos");
			this.cargarCombosFrameTipoManoProduEmpresasForeignKey("Todos");
			this.cargarCombosFrameTipoProcesoEmpresaProdusForeignKey("Todos");
			this.cargarCombosFrameUnidadsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProductoProduMano(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameProductoDefiProdusForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoManoProduEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoProcesoEmpresaProdusForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUnidadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProductoProduMano()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_producto_defi_produProductoProduMano!=null && this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_producto_defi_produProductoProduMano.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_producto_defi_produProductoProduMano.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_tipo_mano_produ_empresaProductoProduMano!=null && this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_tipo_mano_produ_empresaProductoProduMano.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_tipo_mano_produ_empresaProductoProduMano.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_tipo_proceso_empresa_produProductoProduMano!=null && this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_tipo_proceso_empresa_produProductoProduMano.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_tipo_proceso_empresa_produProductoProduMano.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_unidadProductoProduMano!=null && this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_unidadProductoProduMano.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_unidadProductoProduMano.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public ProductoProduManoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProductoProduManoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProductoProduManoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.productoprodumanoSessionBean=new ProductoProduManoSessionBean(); 
		this.productoprodumanoConstantesFunciones=new ProductoProduManoConstantesFunciones(); 
		this.productoprodumanoBean=new ProductoProduMano();//(this.productoprodumanoConstantesFunciones); 		
		this.productoprodumanoReturnGeneral=new ProductoProduManoParameterReturnGeneral(); 
		
		this.productoprodumanoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoprodumanoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProductoProduManoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProductoProduManoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProductoProduManoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProductoProduMano(true);
			
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
			
			this.productoprodumanoConstantesFunciones=new ProductoProduManoConstantesFunciones(); 
			this.productoprodumanoBean=new ProductoProduMano();//this.productoprodumanoConstantesFunciones); 			
			this.productoprodumanoReturnGeneral=new ProductoProduManoParameterReturnGeneral(); 
		
			ProductoProduManoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Producto Mano De Obra Produccion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.productoprodumano=new ProductoProduMano();
			this.productoprodumanos = new ArrayList<ProductoProduMano>();
			this.productoprodumanosAux = new ArrayList<ProductoProduMano>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic=new ProductoProduManoLogic();
				this.productoprodumanoLogic.getNewConnexionToDeep("");
			}
			
			//this.productoprodumanoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.productoprodumanoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProductoProduMano);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProductoProduMano!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductoProduMano);	
					}
					
					if(this.jInternalFrameImportacionProductoProduMano!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductoProduMano);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProductoProduMano!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProductoProduMano);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProductoProduMano!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProductoProduMano);
				this.jInternalFrameDetalleFormProductoProduMano.setVisible(false);
				this.jInternalFrameDetalleFormProductoProduMano.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoProduMano!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductoProduMano);
					this.jInternalFrameReporteDinamicoProductoProduMano.setVisible(false);
					this.jInternalFrameReporteDinamicoProductoProduMano.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProductoProduMano!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProductoProduMano);
					this.jInternalFrameImportacionProductoProduMano.setVisible(false);
					this.jInternalFrameImportacionProductoProduMano.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProductoProduMano!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProductoProduMano);
					this.jInternalFrameOrderByProductoProduMano.setVisible(false);
					this.jInternalFrameOrderByProductoProduMano.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProductoProduManoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProductoProduManoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.productoprodumanoReturnGeneral=new ProductoProduManoParameterReturnGeneral();
			
			this.productoprodumanoParameterGeneral=new ProductoProduManoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.productoprodumanoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProductoProduManoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductoProduManoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productoprodumanoSessionBean.getEsGuardarRelacionado(),this.productoprodumanoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductoProduManoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productoprodumanoSessionBean.getEsGuardarRelacionado(),this.productoprodumanoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProductoProduMano=false;
			this.isVisibilidadCeldaDuplicarProductoProduMano=true;
			this.isVisibilidadCeldaCopiarProductoProduMano=true;
			this.isVisibilidadCeldaVerFormProductoProduMano=true;
			this.isVisibilidadCeldaOrdenProductoProduMano=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoProduMano=false;
			this.isVisibilidadCeldaModificarProductoProduMano=false;
			this.isVisibilidadCeldaActualizarProductoProduMano=false;
			this.isVisibilidadCeldaEliminarProductoProduMano=false;
			this.isVisibilidadCeldaCancelarProductoProduMano=false;
			this.isVisibilidadCeldaGuardarProductoProduMano=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProduMano=false;
			
			
			this.isVisibilidadFK_IdProductoDefiProdu=true;
			this.isVisibilidadFK_IdTipoManoProduEmpresa=true;
			this.isVisibilidadFK_IdTipoProcesoEmpresaProdu=true;
			this.isVisibilidadFK_IdUnidad=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProductoProduMano("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProductoProduMano();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProductoProduMano(false);
			
			this.setPermisosUsuarioProductoProduMano();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoprodumanoSessionBean.getEsGuardarRelacionado() 
				|| (this.productoprodumanoSessionBean.getEsGuardarRelacionado() && this.productoprodumanoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProductoProduManoClasesRelacionadas();
			}
			
			if(this.productoprodumanoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProductoProduManoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProductoProduManoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProductoProduMano();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProductoProduMano();
			}
			
			if(!this.isPermisoBusquedaProductoProduMano) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProductoProduMano.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioProductoProduMano,this.isPermisoPaginacionMedioProductoProduMano,this.isPermisoPaginacionTodoProductoProduMano);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProductoProduManoConstantesFunciones.getTiposSeleccionarProductoProduMano());
				
				this.tiposColumnasSelect=ProductoProduManoConstantesFunciones.getTiposSeleccionarProductoProduMano(true);
				
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
			//if(!this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProductoProduMano();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioProductoProduMano(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioProductoProduMano(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoProduMano() ;
			
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
			this.tipomanoproduempresaLogic=new TipoManoProduEmpresaLogic();
			this.tipoprocesoempresaproduLogic=new TipoProcesoEmpresaProduLogic();
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
				productoprodumanoImplementable= (ProductoProduManoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductoProduManoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				productoprodumanoImplementableHome= (ProductoProduManoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductoProduManoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.productoprodumanos= new ArrayList<ProductoProduMano>();
			this.productoprodumanosEliminados= new ArrayList<ProductoProduMano>();
						
			this.isEsNuevoProductoProduMano=false;
			this.esParaAccionDesdeFormularioProductoProduMano=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.productodefiprodusForeignKey=new ArrayList<ProductoDefiProdu>() ;
			this.tipomanoproduempresasForeignKey=new ArrayList<TipoManoProduEmpresa>() ;
			this.tipoprocesoempresaprodusForeignKey=new ArrayList<TipoProcesoEmpresaProdu>() ;
			this.unidadsForeignKey=new ArrayList<Unidad>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProductoProduMano(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProductoProduMano();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProductoProduManoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProductoProduManoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProductoProduMano("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProductoProduMano(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProductoProduMano!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProductoProduMano();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProductoProduMano();
			}
			
			ProductoProduManoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProductoProduMano.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProductoProduMano.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProductoProduMano.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProductoProduMano(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProductoProduMano: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProductoProduMano() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProductoProduMano")) {
				iIndex=this.jInternalFrameDetalleFormProductoProduMano.jTabbedPaneRelacionesProductoProduMano.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProductoProduMano.jTabbedPaneRelacionesProductoProduMano.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProductoProduMano.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProductoProduMano();	
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
	
	public void cargarCombosForeignKeyProductoProduMano(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProductoProduMano(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProductoProduMano(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProductoProduManoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProductoProduMano();
		
		this.cargarCombosFrameForeignKeyProductoProduMano();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProductoProduMano();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProductoProduMano();
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

	public void cargarCombosForeignKeyTipoManoProduEmpresa(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoManoProduEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoManoProduEmpresa();
				this.cargarCombosFrameTipoManoProduEmpresasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoManoProduEmpresa(this.tipomanoproduempresasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoProcesoEmpresaProdu(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoProcesoEmpresaProduListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoProcesoEmpresaProdu();
				this.cargarCombosFrameTipoProcesoEmpresaProdusForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodusForeignKey);

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
				}

			this.recargarComboTablaUnidad(this.unidadsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoProductoProduManoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.productoprodumanoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProductoProduMano==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
			
			
			if(jTableDatosProductoProduMano.getRowCount()>=1) {
				jTableDatosProductoProduMano.removeRowSelectionInterval(0, jTableDatosProductoProduMano.getRowCount()-1);						
			}
			
			this.isEsNuevoProductoProduMano=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProductoProduMano(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProductoProduMano(true);			
			//this.productoprodumano=new ProductoProduMano();
			//this.productoprodumano.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoProduMano(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoProduMano() ;
			
			if(ProductoProduManoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoProduMano(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.productoprodumano);	
			this.actualizarInformacion("INFO_PADRE",false,this.productoprodumano);				
			
			ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
			
			if(this.productoprodumanoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProductoProduMano: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProductoProduManoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProductoProduMano> productoprodumanosSeleccionados=new ArrayList<ProductoProduMano>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProductoProduMano.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProductoProduMano.getSelectedRows().length;			
			}
			
			productoprodumanosSeleccionados=this.getProductoProduManosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProductoProduMano--;			
				//ProductoProduMano productoprodumanoAux= new ProductoProduMano();			
				//productoprodumanoAux.setId(this.iIdNuevoProductoProduMano);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProductoProduMano productoprodumanoOrigen=new ProductoProduMano();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProductoProduMano productoprodumanoOrigen : productoprodumanosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProductoProduMano.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							productoprodumanoOrigen =(ProductoProduMano) this.productoprodumanoLogic.getProductoProduManos().toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodumanoOrigen =(ProductoProduMano) this.productoprodumanos.toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProductoProduMano();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.productoprodumano.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProductoProduMano(productoprodumanoOrigen,this.productoprodumano,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMano(this.productoprodumano);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productoprodumanoLogic.getProductoProduManos().add(this.productoprodumanoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productoprodumanos.add(this.productoprodumanoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProductoProduMano(false);
				
				this.jTableDatosProductoProduMano.setRowSelectionInterval(this.getIndiceNuevoProductoProduMano(), this.getIndiceNuevoProductoProduMano());
				
				int iLastRow =  this.jTableDatosProductoProduMano.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductoProduMano.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductoProduMano.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoProduMano(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProductoProduManoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProductoProduMano> productoprodumanosSeleccionados=new ArrayList<ProductoProduMano>();									
		
			ProductoProduMano productoprodumanoOrigen=new ProductoProduMano();
			ProductoProduMano productoprodumanoDestino=new ProductoProduMano();
				
			productoprodumanosSeleccionados=this.getProductoProduManosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProductoProduMano.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || productoprodumanosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProductoProduMano.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodumanoOrigen =(ProductoProduMano) this.productoprodumanoLogic.getProductoProduManos().toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productoprodumanoOrigen =(ProductoProduMano) this.productoprodumanos.toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodumanoDestino =(ProductoProduMano) this.productoprodumanoLogic.getProductoProduManos().toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productoprodumanoDestino =(ProductoProduMano) this.productoprodumanos.toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				productoprodumanoOrigen =productoprodumanosSeleccionados.get(0);
				productoprodumanoDestino =productoprodumanosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProductoProduMano(productoprodumanoOrigen,productoprodumanoDestino,true,false);
				
				productoprodumanoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productoprodumanoDestino,productoprodumanoLogic.getProductoProduManos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoprodumanoDestino,productoprodumanos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProductoProduMano(false);
				
				//this.jTableDatosProductoProduMano.setRowSelectionInterval(this.getIndiceNuevoProductoProduMano(), this.getIndiceNuevoProductoProduMano());
				
				int iLastRow =  this.jTableDatosProductoProduMano.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductoProduMano.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductoProduMano.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoProduMano(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProductoProduManoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductoProduMano==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProductoProduMano.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProductoProduManoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProductoProduMano.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProductoProduMano.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProductoProduMano.setVisible(!isVisible);
			this.jPanelPaginacionProductoProduMano.setVisible(!isVisible);
			this.jPanelAccionesProductoProduMano.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProductoProduManoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProductoProduMano();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProductoProduManoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProductoProduMano();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProductoProduManoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProductoProduMano();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProductoProduManoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProductoProduMano();
			
			this.abrirFrameOrderByProductoProduMano();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProductoProduManoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProductoProduMano();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProductoProduMano(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductoProduMano);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProductoProduMano.isMaximum()) {
					this.jInternalFrameDetalleFormProductoProduMano.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProductoProduMano.setSize(this.jInternalFrameDetalleFormProductoProduMano.iWidthFormulario,this.jInternalFrameDetalleFormProductoProduMano.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProductoProduMano.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProductoProduMano.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProductoProduMano.isMaximum()) {
						this.jInternalFrameDetalleFormProductoProduMano.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProductoProduMano.jContentPaneDetalleProductoProduMano.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProductoProduMano.jTabbedPaneRelacionesProductoProduMano.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProductoProduMano.jContentPaneDetalleProductoProduMano.getWidth(),ProductoProduManoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductoProduMano.jTabbedPaneRelacionesProductoProduMano.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProductoProduMano.jContentPaneDetalleProductoProduMano.getWidth(),ProductoProduManoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductoProduMano.jTabbedPaneRelacionesProductoProduMano.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProductoProduMano.jContentPaneDetalleProductoProduMano.getWidth(),ProductoProduManoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProductoProduMano.setVisible(true);
	        this.jInternalFrameDetalleFormProductoProduMano.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProductoProduMano() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProductoProduMano==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProductoProduMano=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoProduMano,false,this);
				} else {
					this.jInternalFrameOrderByProductoProduMano=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoProduMano,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProductoProduMano);
				this.jInternalFrameOrderByProductoProduMano.setVisible(false);
				this.jInternalFrameOrderByProductoProduMano.setSelected(false);
				
				this.jInternalFrameOrderByProductoProduMano.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductoProduMano"));
				
				this.inicializarActualizarBindingTablaOrderByProductoProduMano();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProductoProduMano() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProductoProduMano==null) {
				
				this.jInternalFrameImportacionProductoProduMano=new ImportacionJInternalFrame(ProductoProduManoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductoProduMano);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProductoProduMano);
				this.jInternalFrameImportacionProductoProduMano.setVisible(false);
				this.jInternalFrameImportacionProductoProduMano.setSelected(false);


				this.jInternalFrameImportacionProductoProduMano.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductoProduMano"));
				this.jInternalFrameImportacionProductoProduMano.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductoProduMano"));
				this.jInternalFrameImportacionProductoProduMano.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductoProduMano"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProductoProduMano() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProductoProduMano==null) {
				this.jInternalFrameReporteDinamicoProductoProduMano=new ReporteDinamicoJInternalFrame(ProductoProduManoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductoProduMano);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductoProduMano);
				this.jInternalFrameReporteDinamicoProductoProduMano.setVisible(false);
				this.jInternalFrameReporteDinamicoProductoProduMano.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProductoProduMano.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoProduMano"));
				this.jInternalFrameReporteDinamicoProductoProduMano.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoProduMano"));
				this.jInternalFrameReporteDinamicoProductoProduMano.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoProduMano"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoProduMano();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProductoProduMano() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductoProduMano);
			
	       	this.jInternalFrameDetalleFormProductoProduMano.setVisible(false);
	        this.jInternalFrameDetalleFormProductoProduMano.setSelected(false);
			
			//this.jInternalFrameDetalleFormProductoProduMano.dispose();
			//this.jInternalFrameDetalleFormProductoProduMano=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProductoProduMano() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProductoProduMano.setVisible(true);
	        this.jInternalFrameReporteDinamicoProductoProduMano.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProductoProduMano() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProductoProduMano.setVisible(true);
	        this.jInternalFrameImportacionProductoProduMano.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProductoProduMano() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProductoProduMano.setVisible(true);
	        this.jInternalFrameOrderByProductoProduMano.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProductoProduMano() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProductoProduMano.setVisible(false);
	        this.jInternalFrameOrderByProductoProduMano.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProductoProduMano() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProductoProduMano.setVisible(false);
	        this.jInternalFrameReporteDinamicoProductoProduMano.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProductoProduMano() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProductoProduMano.setVisible(false);
	        this.jInternalFrameImportacionProductoProduMano.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProductoProduManoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProductoProduMano(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProductoProduMano(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductoProduMano.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProductoProduMano(true);
			//this.isEsNuevoProductoProduMano=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumano =(ProductoProduMano) this.productoprodumanoLogic.getProductoProduManos().toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoprodumano =(ProductoProduMano) this.productoprodumanos.toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProductoProduMano("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoProduMano(false) ;
			
			if(productoprodumanoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProductoProduManoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoProduMano(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoProduMano(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProductoProduManoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProductoProduMano.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumano =(ProductoProduMano) this.productoprodumanoLogic.getProductoProduManos().toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoprodumano =(ProductoProduMano) this.productoprodumanos.toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProductoProduMano(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductoProduMano==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductoProduMano.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProductoProduMano(true);
			//this.isEsNuevoProductoProduMano=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumano =(ProductoProduMano) this.productoprodumanoLogic.getProductoProduManos().toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoprodumano =(ProductoProduMano) this.productoprodumanos.toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.productoprodumano.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProductoProduMano("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProductoProduMano(false) ;
			
			if(ProductoProduManoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoProduMano(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoProduMano(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaProductoDefiProdu(List<ProductoDefiProdu> productodefiprodusForeignKey)throws Exception{
		TableColumn tableColumnProductoDefiProdu=this.jTableDatosProductoProduMano.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMano,ProductoProduManoConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU));
		TableCellEditor tableCellEditorProductoDefiProdu =tableColumnProductoDefiProdu.getCellEditor();

		ProductoDefiProduTableCell productodefiproduTableCellFk=(ProductoDefiProduTableCell)tableCellEditorProductoDefiProdu;

		if(productodefiproduTableCellFk!=null) {
			productodefiproduTableCellFk.setproductodefiprodusForeignKey(productodefiprodusForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoProduMano.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productodefiproduTableCellFk.setRowActual(intSelectedRow);
			//productodefiproduTableCellFk.setproductodefiprodusForeignKeyActual(productodefiprodusForeignKey);
		//}


		if(productodefiproduTableCellFk!=null) {
			productodefiproduTableCellFk.RecargarProductoDefiProdusForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoManoProduEmpresa(List<TipoManoProduEmpresa> tipomanoproduempresasForeignKey)throws Exception{
		TableColumn tableColumnTipoManoProduEmpresa=this.jTableDatosProductoProduMano.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMano,ProductoProduManoConstantesFunciones.LABEL_IDTIPOMANOPRODUEMPRESA));
		TableCellEditor tableCellEditorTipoManoProduEmpresa =tableColumnTipoManoProduEmpresa.getCellEditor();

		TipoManoProduEmpresaTableCell tipomanoproduempresaTableCellFk=(TipoManoProduEmpresaTableCell)tableCellEditorTipoManoProduEmpresa;

		if(tipomanoproduempresaTableCellFk!=null) {
			tipomanoproduempresaTableCellFk.settipomanoproduempresasForeignKey(tipomanoproduempresasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoProduMano.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipomanoproduempresaTableCellFk.setRowActual(intSelectedRow);
			//tipomanoproduempresaTableCellFk.settipomanoproduempresasForeignKeyActual(tipomanoproduempresasForeignKey);
		//}


		if(tipomanoproduempresaTableCellFk!=null) {
			tipomanoproduempresaTableCellFk.RecargarTipoManoProduEmpresasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoProcesoEmpresaProdu(List<TipoProcesoEmpresaProdu> tipoprocesoempresaprodusForeignKey)throws Exception{
		TableColumn tableColumnTipoProcesoEmpresaProdu=this.jTableDatosProductoProduMano.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMano,ProductoProduManoConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU));
		TableCellEditor tableCellEditorTipoProcesoEmpresaProdu =tableColumnTipoProcesoEmpresaProdu.getCellEditor();

		TipoProcesoEmpresaProduTableCell tipoprocesoempresaproduTableCellFk=(TipoProcesoEmpresaProduTableCell)tableCellEditorTipoProcesoEmpresaProdu;

		if(tipoprocesoempresaproduTableCellFk!=null) {
			tipoprocesoempresaproduTableCellFk.settipoprocesoempresaprodusForeignKey(tipoprocesoempresaprodusForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoProduMano.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoprocesoempresaproduTableCellFk.setRowActual(intSelectedRow);
			//tipoprocesoempresaproduTableCellFk.settipoprocesoempresaprodusForeignKeyActual(tipoprocesoempresaprodusForeignKey);
		//}


		if(tipoprocesoempresaproduTableCellFk!=null) {
			tipoprocesoempresaproduTableCellFk.RecargarTipoProcesoEmpresaProdusForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaUnidad(List<Unidad> unidadsForeignKey)throws Exception{
		TableColumn tableColumnUnidad=this.jTableDatosProductoProduMano.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMano,ProductoProduManoConstantesFunciones.LABEL_IDUNIDAD));
		TableCellEditor tableCellEditorUnidad =tableColumnUnidad.getCellEditor();

		UnidadTableCell unidadTableCellFk=(UnidadTableCell)tableCellEditorUnidad;

		if(unidadTableCellFk!=null) {
			unidadTableCellFk.setunidadsForeignKey(unidadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoProduMano.getSelectedRow();

		//if(intSelectedRow<=0) {
			//unidadTableCellFk.setRowActual(intSelectedRow);
			//unidadTableCellFk.setunidadsForeignKeyActual(unidadsForeignKey);
		//}


		if(unidadTableCellFk!=null) {
			unidadTableCellFk.RecargarUnidadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProductoProduManoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProductoProduMano(false);
			
			//if(!this.isEsNuevoProductoProduMano) {								
				int intSelectedRow = this.jTableDatosProductoProduMano.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumano =(ProductoProduMano) this.productoprodumanoLogic.getProductoProduManos().toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoprodumano =(ProductoProduMano) this.productoprodumanos.toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProductoProduManoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProductoProduMano(this.productoprodumano,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMano(this.productoprodumano);
				
			}
			
			if(this.permiteMantenimiento(this.productoprodumano)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProductoProduMano=true;
					this.inicializarActualizarBindingTablaProductoProduMano(false);
					this.isEsNuevoProductoProduMano=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProductoProduMano=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProductoProduMano=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductoProduMano(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoProduMano(false);
				
				this.habilitarDeshabilitarControlesProductoProduMano(false);
			
												
				
				if(ProductoProduManoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProductoProduMano();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProductoProduManoActionPerformed(evt,productoprodumanoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProductoProduMano(this.productoprodumano,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProductoProduMano.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,productoprodumanoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.productoprodumano.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProductoProduMano.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduMano.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProductoProduManoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProductoProduMano.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumano =(ProductoProduMano) this.productoprodumanoLogic.getProductoProduManos().toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
				this.productoprodumano.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoprodumano =(ProductoProduMano) this.productoprodumanos.toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
				this.productoprodumano.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.productoprodumano)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProductoProduManoModel) this.jTableDatosProductoProduMano.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProductoProduMano=true;
				this.inicializarActualizarBindingTablaProductoProduMano(false);
				this.isEsNuevoProductoProduMano=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductoProduMano(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoProduMano(false);
				
				this.habilitarDeshabilitarControlesProductoProduMano(false);
				
				
				
				if(ProductoProduManoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProductoProduMano();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProductoProduManoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProductoProduMano.getRowCount()>=1) {
				jTableDatosProductoProduMano.removeRowSelectionInterval(0, jTableDatosProductoProduMano.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProductoProduMano(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProductoProduMano(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoProduMano(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoProduMano(false) ;
			
			this.isEsNuevoProductoProduMano=false;
			
			if(ProductoProduManoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProductoProduMano();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProductoProduManoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProductoProduMano(false);
				
				//SI ES MANUAL
				if(ProductoProduManoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProductoProduMano();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProductoProduManoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProductoProduMano--;			
			//ProductoProduMano productoprodumanoAux= new ProductoProduMano();			
			//productoprodumanoAux.setId(this.iIdNuevoProductoProduMano);
			
			if(this.jInternalFrameDetalleFormProductoProduMano==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProductoProduMano();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMano(this.productoprodumano);
			
			this.productoprodumano.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.productoprodumanoLogic.getProductoProduManos().add(this.productoprodumanoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.productoprodumanos.add(this.productoprodumanoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProductoProduMano(false);
			
			this.jTableDatosProductoProduMano.setRowSelectionInterval(this.getIndiceNuevoProductoProduMano(), this.getIndiceNuevoProductoProduMano());
			
			int iLastRow =  this.jTableDatosProductoProduMano.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProductoProduMano.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProductoProduMano.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProductoProduMano(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProductoProduManoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProductoProduMano(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoProduMano(false);
			
			//SI ES MANUAL
			if(ProductoProduManoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoProduMano();
			}
			
			//this.abrirFrameTreeProductoProduMano();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProductoProduManoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Producto Mano De Obra ProduccionES ?", "MANTENIMIENTO DE Producto Mano De Obra Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionProductoProduMano.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralProductoProduMano();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.productoprodumanoReturnGeneral=productoprodumanoLogic.procesarImportacionProductoProduManosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.productoprodumanoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarProductoProduManoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProductoProduManoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProductoProduMano.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProductoProduMano.setFileImportacion(this.jInternalFrameImportacionProductoProduMano.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProductoProduMano.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProductoProduMano.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProductoProduMano.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProductoProduMano.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProductoProduManoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProductoProduMano> productoprodumanosSeleccionados=new ArrayList<ProductoProduMano>();		

		productoprodumanosSeleccionados=this.getProductoProduManosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoProduMano.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoProduMano.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProductoProduManoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProductoProduManoBaseDesign.jrxml";
			
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
			
			this.generarReporteProductoProduManos("Todos",productoprodumanosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Mano De Obra Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProductoProduMano.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoProduMano.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductoProduManoConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ProductoDefiProdu_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ProductoDefiProdu_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ProductoDefiProdu_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ProductoDefiProdu_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProduManoConstantesFunciones.LABEL_IDTIPOMANOPRODUEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoManoProduEmpresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoManoProduEmpresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoManoProduEmpresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoManoProduEmpresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProduManoConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoProcesoEmpresaProdu_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoProcesoEmpresaProdu_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoProcesoEmpresaProdu_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoProcesoEmpresaProdu_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProduManoConstantesFunciones.LABEL_IDUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Unidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Unidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Unidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Unidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProduManoConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProduManoConstantesFunciones.LABEL_COSTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_sto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_sto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_sto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_sto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProduManoConstantesFunciones.LABEL_COSTOTOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_stoTotal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_stoTotal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_stoTotal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_stoTotal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProduManoConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoProductoProduMano.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProductoProduMano.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProductoProduMano.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProductoProduManoConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU:
					sNombreCampoCategoria="id_producto_defi_produ";
					break;

				case ProductoProduManoConstantesFunciones.LABEL_IDTIPOMANOPRODUEMPRESA:
					sNombreCampoCategoria="id_tipo_mano_produ_empresa";
					break;

				case ProductoProduManoConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU:
					sNombreCampoCategoria="id_tipo_proceso_empresa_produ";
					break;

				case ProductoProduManoConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoria="id_unidad";
					break;

				case ProductoProduManoConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;

				case ProductoProduManoConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoria="costo";
					break;

				case ProductoProduManoConstantesFunciones.LABEL_COSTOTOTAL:
					sNombreCampoCategoria="costo_total";
					break;

				case ProductoProduManoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProductoProduMano.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProductoProduManoConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU:
					sNombreCampoCategoriaValor="id_producto_defi_produ";
					break;

				case ProductoProduManoConstantesFunciones.LABEL_IDTIPOMANOPRODUEMPRESA:
					sNombreCampoCategoriaValor="id_tipo_mano_produ_empresa";
					break;

				case ProductoProduManoConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU:
					sNombreCampoCategoriaValor="id_tipo_proceso_empresa_produ";
					break;

				case ProductoProduManoConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoriaValor="id_unidad";
					break;

				case ProductoProduManoConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;

				case ProductoProduManoConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoriaValor="costo";
					break;

				case ProductoProduManoConstantesFunciones.LABEL_COSTOTOTAL:
					sNombreCampoCategoriaValor="costo_total";
					break;

				case ProductoProduManoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProductoProduMano.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoProduMano.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductoProduManoConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto Defi Produ",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto_defi_produ");
					break;

				case ProductoProduManoConstantesFunciones.LABEL_IDTIPOMANOPRODUEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Mano Obra Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_mano_produ_empresa");
					break;

				case ProductoProduManoConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Proceso Empresa Produ",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_proceso_empresa_produ");
					break;

				case ProductoProduManoConstantesFunciones.LABEL_IDUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Unad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_unidad");
					break;

				case ProductoProduManoConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantidad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad");
					break;

				case ProductoProduManoConstantesFunciones.LABEL_COSTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo");
					break;

				case ProductoProduManoConstantesFunciones.LABEL_COSTOTOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo_total");
					break;

				case ProductoProduManoConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoProductoProduManoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProductoProduMano> productoprodumanosSeleccionados=new ArrayList<ProductoProduMano>();		
		
		productoprodumanosSeleccionados=this.getProductoProduManosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoprodumano";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProductoProduManos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProductoProduMano.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoProduMano.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProductoProduManoConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduManoConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU);
					iRow++;

					for(ProductoProduMano productoprodumano:productoprodumanosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodumano.getproductodefiprodu_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProduManoConstantesFunciones.LABEL_IDTIPOMANOPRODUEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduManoConstantesFunciones.LABEL_IDTIPOMANOPRODUEMPRESA);
					iRow++;

					for(ProductoProduMano productoprodumano:productoprodumanosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodumano.gettipomanoproduempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProduManoConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduManoConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU);
					iRow++;

					for(ProductoProduMano productoprodumano:productoprodumanosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodumano.gettipoprocesoempresaprodu_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProduManoConstantesFunciones.LABEL_IDUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduManoConstantesFunciones.LABEL_IDUNIDAD);
					iRow++;

					for(ProductoProduMano productoprodumano:productoprodumanosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodumano.getunidad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProduManoConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduManoConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(ProductoProduMano productoprodumano:productoprodumanosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodumano.getcantidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProduManoConstantesFunciones.LABEL_COSTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduManoConstantesFunciones.LABEL_COSTO);
					iRow++;

					for(ProductoProduMano productoprodumano:productoprodumanosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodumano.getcosto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProduManoConstantesFunciones.LABEL_COSTOTOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduManoConstantesFunciones.LABEL_COSTOTOTAL);
					iRow++;

					for(ProductoProduMano productoprodumano:productoprodumanosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodumano.getcosto_total());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProduManoConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduManoConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(ProductoProduMano productoprodumano:productoprodumanosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodumano.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelProductoProduMano(row);				
			//	iRow++;
			//}				
			
			//for(ProductoProduMano productoprodumanoAux:productoprodumanosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProductoProduMano(productoprodumanoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Mano De Obra Produccion",JOptionPane.INFORMATION_MESSAGE);
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
				this.productoprodumanoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoProduMano(false);
			
			//SI ES MANUAL
			if(ProductoProduManoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoProduMano();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProductoProduManoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoProduMano(false);
			
			//SI ES MANUAL
			if(ProductoProduManoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductoProduMano();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProductoProduManoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoProduMano(false);
			
			//SI ES MANUAL
			if(ProductoProduManoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductoProduMano();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProductoProduMano() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProductoProduMano.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProductoProduMano.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProductoProduMano.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProductoProduMano.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProductoProduMano.setMinimumSize(dimensionMinimum);
		this.jTableDatosProductoProduMano.setMaximumSize(dimensionMaximum);
		this.jTableDatosProductoProduMano.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProductoProduMano(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProductoProduMano(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProductoProduMano(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProductoProduMano(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProductoProduMano(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProductoProduMano(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoProduMano(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProductoProduMano(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProductoProduManoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProductoProduManoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProductoProduMano() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProductoProduMano();
		
		this.inicializarActualizarBindingBotonesManualProductoProduMano(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProductoProduMano();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoProduMano() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProductoProduMano(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProductoProduMano(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProductoProduMano.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProductoProduMano.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProductoProduMano.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProductoProduMano!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProductoProduMano.jCheckBoxPostAccionNuevoProductoProduMano.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProductoProduMano.jCheckBoxPostAccionSinCerrarProductoProduMano.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProductoProduMano.jCheckBoxPostAccionSinMensajeProductoProduMano.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProductoProduMano.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProductoProduMano.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProductoProduMano.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProductoProduMano!=null) {
				this.jInternalFrameDetalleFormProductoProduMano.jCheckBoxPostAccionNuevoProductoProduMano.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProductoProduMano.jCheckBoxPostAccionSinCerrarProductoProduMano.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProductoProduMano.jCheckBoxPostAccionSinMensajeProductoProduMano.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProductoProduMano.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProductoProduMano.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProductoProduMano!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProductoProduMano.jComboBoxTiposAccionesFormularioProductoProduMano.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProductoProduMano.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProductoProduMano!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoProduMano.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProductoProduMano.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProductoProduMano.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProductoProduMano.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProductoProduMano.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProductoProduMano!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoProduMano.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProductoProduMano.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProductoProduMano.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProductoProduMano(Boolean esInicializar) throws Exception {
		try	{	
			if(ProductoProduManoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProductoProduMano(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProductoProduMano() throws Exception {
		try	{
			if(ProductoProduManoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProductoProduMano();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductoProduMano() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProductoProduMano.jComboBoxTiposAccionesFormularioProductoProduMano.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProductoProduMano.jComboBoxTiposAccionesFormularioProductoProduMano.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProductoProduMano() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProductoProduMano.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProductoProduMano.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProductoProduMano.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProductoProduMano.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProductoProduMano.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProductoProduMano.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProductoProduMano.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProductoProduMano.addItem(reporte);
			}
			
			
			if(!this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProductoProduMano.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProductoProduMano.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProductoProduMano.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProductoProduMano.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProductoProduMano.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProductoProduMano.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProductoProduMano!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProductoProduMano.jComboBoxTiposAccionesFormularioProductoProduMano.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProductoProduMano.jComboBoxTiposAccionesFormularioProductoProduMano.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProductoProduMano.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProductoProduMano.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProductoProduMano.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoProduMano();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoProduMano() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductoProduMano!=null) {
				this.jInternalFrameReporteDinamicoProductoProduMano.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductoProduMano.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductoProduMano!=null) {
				this.jInternalFrameReporteDinamicoProductoProduMano.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductoProduMano.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProductoProduMano!=null) {
				
				if(this.jInternalFrameReporteDinamicoProductoProduMano.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductoProduMano.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoProduMano.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProductoProduMano.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductoProduMano.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoProduMano.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoProduMano.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProductoProduMano.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ProductoProduManoConstantesFunciones.getTiposSeleccionarProductoProduMano(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProductoProduMano.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoProduMano.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoProductoProduMano.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ProductoProduManoConstantesFunciones.getTiposSeleccionarProductoProduMano(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProductoProduMano.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoProductoProduMano.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProductoProduMano.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ProductoProduManoConstantesFunciones.getTiposSeleccionarProductoProduMano(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoProduMano.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoProductoProduMano.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoProductoProduMano.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoProductoProduMano.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProductoProduMano()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMano.getSelectedItem()!=null){this.id_producto_defi_produFK_IdProductoDefiProdu=((ProductoDefiProdu)this.jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMano.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoProduMano.getSelectedItem()!=null){this.id_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresa=((TipoManoProduEmpresa)this.jComboBoxid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoProduMano.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMano.getSelectedItem()!=null){this.id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu=((TipoProcesoEmpresaProdu)this.jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMano.getSelectedItem()).getId();}
		if(this.jComboBoxid_unidadFK_IdUnidadProductoProduMano.getSelectedItem()!=null){this.id_unidadFK_IdUnidad=((Unidad)this.jComboBoxid_unidadFK_IdUnidadProductoProduMano.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProductoProduMano(Boolean esInicializar) throws Exception {				
		if(ProductoProduManoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProductoProduMano();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProductoProduMano() throws Exception {
		this.inicializarActualizarBindingTablaProductoProduMano(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProductoProduMano() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProductoProduMano.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProductoProduMano.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoProduMano.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProductoProduManoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProductoProduMano.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoProduMano.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProductoProduManoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProductoProduManoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduManoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProductoProduManoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProductoProduMano.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoProduMano.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProductoProduManoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProductoProduMano.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProductoProduMano(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=productoprodumanoLogic.getProductoProduManos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=productoprodumanos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProductoProduManoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProductoProduMano.setModel(new ProductoProduManoModel(this.productoprodumanoLogic.getProductoProduManos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProductoProduMano.setModel(new ProductoProduManoModel(this.productoprodumanos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProductoProduMano!=null && this.jInternalFrameOrderByProductoProduMano.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProductoProduMano();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProductoProduMano.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMano,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProductoProduManoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProductoProduManoConstantesFunciones.SCLASSWEBTITULO,productoprodumanoConstantesFunciones.resaltarSeleccionarProductoProduMano,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProductoProduManoConstantesFunciones.SCLASSWEBTITULO,productoprodumanoConstantesFunciones.resaltarSeleccionarProductoProduMano,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProductoProduMano.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMano,ProductoProduManoConstantesFunciones.LABEL_ID));

		if(this.productoprodumanoConstantesFunciones.mostraridProductoProduMano && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduManoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoprodumanoConstantesFunciones.resaltaridProductoProduMano,this.productoprodumanoConstantesFunciones.activaridProductoProduMano,iSizeTabla,this,true,"idProductoProduMano","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoprodumanoConstantesFunciones.resaltaridProductoProduMano,this.productoprodumanoConstantesFunciones.activaridProductoProduMano,this,true,"idProductoProduMano","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProduMano.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMano,ProductoProduManoConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU));

		if(this.productoprodumanoConstantesFunciones.mostrarid_producto_defi_produProductoProduMano && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduManoConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoDefiProduTableCell(this.productodefiprodusForeignKey,this.productoprodumanoConstantesFunciones.resaltarid_producto_defi_produProductoProduMano,this,this.productoprodumanoConstantesFunciones.activarid_producto_defi_produProductoProduMano,iSizeTabla));
			tableColumn.setCellEditor(new ProductoDefiProduTableCell(this.productodefiprodusForeignKey,this.productoprodumanoConstantesFunciones.resaltarid_producto_defi_produProductoProduMano,this,this.productoprodumanoConstantesFunciones.activarid_producto_defi_produProductoProduMano,true,"id_producto_defi_produProductoProduMano","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoProduManoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProduMano.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMano,ProductoProduManoConstantesFunciones.LABEL_IDTIPOMANOPRODUEMPRESA));

		if(this.productoprodumanoConstantesFunciones.mostrarid_tipo_mano_produ_empresaProductoProduMano && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduManoConstantesFunciones.LABEL_IDTIPOMANOPRODUEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoManoProduEmpresaTableCell(this.tipomanoproduempresasForeignKey,this.productoprodumanoConstantesFunciones.resaltarid_tipo_mano_produ_empresaProductoProduMano,this,this.productoprodumanoConstantesFunciones.activarid_tipo_mano_produ_empresaProductoProduMano,iSizeTabla));
			tableColumn.setCellEditor(new TipoManoProduEmpresaTableCell(this.tipomanoproduempresasForeignKey,this.productoprodumanoConstantesFunciones.resaltarid_tipo_mano_produ_empresaProductoProduMano,this,this.productoprodumanoConstantesFunciones.activarid_tipo_mano_produ_empresaProductoProduMano,true,"id_tipo_mano_produ_empresaProductoProduMano","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoProduManoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProduMano.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMano,ProductoProduManoConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU));

		if(this.productoprodumanoConstantesFunciones.mostrarid_tipo_proceso_empresa_produProductoProduMano && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduManoConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoProcesoEmpresaProduTableCell(this.tipoprocesoempresaprodusForeignKey,this.productoprodumanoConstantesFunciones.resaltarid_tipo_proceso_empresa_produProductoProduMano,this,this.productoprodumanoConstantesFunciones.activarid_tipo_proceso_empresa_produProductoProduMano,iSizeTabla));
			tableColumn.setCellEditor(new TipoProcesoEmpresaProduTableCell(this.tipoprocesoempresaprodusForeignKey,this.productoprodumanoConstantesFunciones.resaltarid_tipo_proceso_empresa_produProductoProduMano,this,this.productoprodumanoConstantesFunciones.activarid_tipo_proceso_empresa_produProductoProduMano,true,"id_tipo_proceso_empresa_produProductoProduMano","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoProduManoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProduMano.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMano,ProductoProduManoConstantesFunciones.LABEL_IDUNIDAD));

		if(this.productoprodumanoConstantesFunciones.mostrarid_unidadProductoProduMano && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduManoConstantesFunciones.LABEL_IDUNIDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new UnidadTableCell(this.unidadsForeignKey,this.productoprodumanoConstantesFunciones.resaltarid_unidadProductoProduMano,this,this.productoprodumanoConstantesFunciones.activarid_unidadProductoProduMano,iSizeTabla));
			tableColumn.setCellEditor(new UnidadTableCell(this.unidadsForeignKey,this.productoprodumanoConstantesFunciones.resaltarid_unidadProductoProduMano,this,this.productoprodumanoConstantesFunciones.activarid_unidadProductoProduMano,true,"id_unidadProductoProduMano","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoProduManoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProduMano.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMano,ProductoProduManoConstantesFunciones.LABEL_CANTIDAD));

		if(this.productoprodumanoConstantesFunciones.mostrarcantidadProductoProduMano && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduManoConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoprodumanoConstantesFunciones.resaltarcantidadProductoProduMano,this.productoprodumanoConstantesFunciones.activarcantidadProductoProduMano,iSizeTabla,this,true,"cantidadProductoProduMano","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoprodumanoConstantesFunciones.resaltarcantidadProductoProduMano,this.productoprodumanoConstantesFunciones.activarcantidadProductoProduMano,this,true,"cantidadProductoProduMano","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoProduManoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProduMano.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMano,ProductoProduManoConstantesFunciones.LABEL_COSTO));

		if(this.productoprodumanoConstantesFunciones.mostrarcostoProductoProduMano && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduManoConstantesFunciones.LABEL_COSTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoprodumanoConstantesFunciones.resaltarcostoProductoProduMano,this.productoprodumanoConstantesFunciones.activarcostoProductoProduMano,iSizeTabla,this,true,"costoProductoProduMano","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoprodumanoConstantesFunciones.resaltarcostoProductoProduMano,this.productoprodumanoConstantesFunciones.activarcostoProductoProduMano,this,true,"costoProductoProduMano","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoProduManoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProduMano.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMano,ProductoProduManoConstantesFunciones.LABEL_COSTOTOTAL));

		if(this.productoprodumanoConstantesFunciones.mostrarcosto_totalProductoProduMano && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduManoConstantesFunciones.LABEL_COSTOTOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoprodumanoConstantesFunciones.resaltarcosto_totalProductoProduMano,this.productoprodumanoConstantesFunciones.activarcosto_totalProductoProduMano,iSizeTabla,this,true,"costo_totalProductoProduMano","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoprodumanoConstantesFunciones.resaltarcosto_totalProductoProduMano,this.productoprodumanoConstantesFunciones.activarcosto_totalProductoProduMano,this,true,"costo_totalProductoProduMano","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoProduManoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProduMano.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMano,ProductoProduManoConstantesFunciones.LABEL_DESCRIPCION));

		if(this.productoprodumanoConstantesFunciones.mostrardescripcionProductoProduMano && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduManoConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productoprodumanoConstantesFunciones.resaltardescripcionProductoProduMano,this.productoprodumanoConstantesFunciones.activardescripcionProductoProduMano,iSizeTabla,this,true,"descripcionProductoProduMano","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoprodumanoConstantesFunciones.resaltardescripcionProductoProduMano,this.productoprodumanoConstantesFunciones.activardescripcionProductoProduMano,this,true,"descripcionProductoProduMano","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoProduManoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.productoprodumanoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productoprodumanoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productoprodumanoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductoProduMano.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productoprodumanoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productoprodumanoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductoProduMano.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProductoProduMano && this.isPermisoGuardarCambiosProductoProduMano) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.productoprodumanoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.productoprodumanoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProductoProduMano.addColumn(tableColumn);
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
			
			this.jTableDatosProductoProduMano.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductoProduMano && this.isPermisoGuardarCambiosProductoProduMano) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductoProduMano && this.isPermisoGuardarCambiosProductoProduMano) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProductoProduMano.moveColumn(this.jTableDatosProductoProduMano.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProductoProduMano.moveColumn(this.jTableDatosProductoProduMano.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProductoProduMano.moveColumn(this.jTableDatosProductoProduMano.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProductoProduMano.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProductoProduMano.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProductoProduMano,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProductoProduManoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProductoProduMano.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProductoProduMano.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProductoProduManoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProductoProduManoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProductoProduMano.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProductoProduMano.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProductoProduMano.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=productoprodumanoLogic.getProductoProduManos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=productoprodumanos.size()-1;
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
		//this.jTableDatosProductoProduMano.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProductoProduMano.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProductoProduMano();
			
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
				
				//this.isEsNuevoProductoProduMano=false;
					
				ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
			
				if(this.productoprodumanoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProductoProduMano==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductoProduMano.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductoProduMano.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumano =(ProductoProduMano) this.productoprodumanoLogic.getProductoProduManos().toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoprodumano =(ProductoProduMano) this.productoprodumanos.toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.productoprodumano.getsType().equals("DUPLICADO")
				   || this.productoprodumano.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProductoProduMano=true;
				
				} else {
					this.isEsNuevoProductoProduMano=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {
					if(this.productoprodumano.getId()>=0 && !this.productoprodumano.getIsNew()) {						
						this.isEsNuevoProductoProduMano=false;
						
					} else {
						this.isEsNuevoProductoProduMano=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProductoProduMano(esRelaciones);						
				
				this.seleccionarProductoProduMano(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.productoprodumano.getId()<0) {
					this.isEsNuevoProductoProduMano=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProductoProduMano(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProductoProduMano(evt,rowIndex);
				}	
				
				if(this.productoprodumanoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProductoProduMano: " + this.dDif); 
					}
				}								
				
				ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProductoProduMano(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.productoprodumano)) {
					if(this.productoprodumano.getId()>0) {
						this.productoprodumano.setIsDeleted(true);
						
						this.productoprodumanosEliminados.add(this.productoprodumano);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productoprodumanoLogic.getProductoProduManos().remove(this.productoprodumano);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productoprodumanos.remove(this.productoprodumano);				
					}
					
					
					((ProductoProduManoModel) this.jTableDatosProductoProduMano.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoProduMano(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProductoProduMano(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProductoProduMano) {
			
			if(this.jInternalFrameDetalleFormProductoProduMano==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductoProduMano.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductoProduMano.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumano =(ProductoProduMano) this.productoprodumanoLogic.getProductoProduManos().toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoprodumano =(ProductoProduMano) this.productoprodumanos.toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProductoProduManoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProductoProduMano(this.productoprodumano);
				}
				
				//ARCHITECTURE
				try {
					

					//ProductoDefiProdu
					if(!this.productoprodumanoConstantesFunciones.cargarid_producto_defi_produProductoProduMano || this.productoprodumanoConstantesFunciones.event_dependid_producto_defi_produProductoProduMano) {
						//this.cargarCombosProductoDefiProdusForeignKeyLista(" where id="+this.productoprodumano.getid_producto_defi_produ());
									//this.inicializarActualizarBindingProductoProduMano(false,false);
						this.productodefiprodusForeignKey=new ArrayList<ProductoDefiProdu>();

						if(productoprodumano.getProductoDefiProdu()!=null) {
							this.productodefiprodusForeignKey.add(productoprodumano.getProductoDefiProdu());
						}

						this.addItemDefectoCombosForeignKeyProductoDefiProdu();
						this.cargarCombosFrameProductoDefiProdusForeignKey("Todos");
					}
					this.setActualProductoDefiProduForeignKey(this.productoprodumano.getid_producto_defi_produ(),false,"Formulario");

					//TipoManoProduEmpresa
					if(!this.productoprodumanoConstantesFunciones.cargarid_tipo_mano_produ_empresaProductoProduMano || this.productoprodumanoConstantesFunciones.event_dependid_tipo_mano_produ_empresaProductoProduMano) {
						//this.cargarCombosTipoManoProduEmpresasForeignKeyLista(" where id="+this.productoprodumano.getid_tipo_mano_produ_empresa());
									//this.inicializarActualizarBindingProductoProduMano(false,false);
						this.tipomanoproduempresasForeignKey=new ArrayList<TipoManoProduEmpresa>();

						if(productoprodumano.getTipoManoProduEmpresa()!=null) {
							this.tipomanoproduempresasForeignKey.add(productoprodumano.getTipoManoProduEmpresa());
						}

						this.addItemDefectoCombosForeignKeyTipoManoProduEmpresa();
						this.cargarCombosFrameTipoManoProduEmpresasForeignKey("Todos");
					}
					this.setActualTipoManoProduEmpresaForeignKey(this.productoprodumano.getid_tipo_mano_produ_empresa(),false,"Formulario");

					//TipoProcesoEmpresaProdu
					if(!this.productoprodumanoConstantesFunciones.cargarid_tipo_proceso_empresa_produProductoProduMano || this.productoprodumanoConstantesFunciones.event_dependid_tipo_proceso_empresa_produProductoProduMano) {
						//this.cargarCombosTipoProcesoEmpresaProdusForeignKeyLista(" where id="+this.productoprodumano.getid_tipo_proceso_empresa_produ());
									//this.inicializarActualizarBindingProductoProduMano(false,false);
						this.tipoprocesoempresaprodusForeignKey=new ArrayList<TipoProcesoEmpresaProdu>();

						if(productoprodumano.getTipoProcesoEmpresaProdu()!=null) {
							this.tipoprocesoempresaprodusForeignKey.add(productoprodumano.getTipoProcesoEmpresaProdu());
						}

						this.addItemDefectoCombosForeignKeyTipoProcesoEmpresaProdu();
						this.cargarCombosFrameTipoProcesoEmpresaProdusForeignKey("Todos");
					}
					this.setActualTipoProcesoEmpresaProduForeignKey(this.productoprodumano.getid_tipo_proceso_empresa_produ(),false,"Formulario");

					//Unidad
					if(!this.productoprodumanoConstantesFunciones.cargarid_unidadProductoProduMano || this.productoprodumanoConstantesFunciones.event_dependid_unidadProductoProduMano) {
						//this.cargarCombosUnidadsForeignKeyLista(" where id="+this.productoprodumano.getid_unidad());
									//this.inicializarActualizarBindingProductoProduMano(false,false);
						this.unidadsForeignKey=new ArrayList<Unidad>();

						if(productoprodumano.getUnidad()!=null) {
							this.unidadsForeignKey.add(productoprodumano.getUnidad());
						}

						this.addItemDefectoCombosForeignKeyUnidad();
						this.cargarCombosFrameUnidadsForeignKey("Todos");
					}
					this.setActualUnidadForeignKey(this.productoprodumano.getid_unidad(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProductoProduMano("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProductoProduMano(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoProduMano() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductoProduMano(ProductoProduMano productoprodumano) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProductoProduMano(productoprodumano,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductoProduMano(ProductoProduMano productoprodumano,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProductoProduMano(productoprodumano);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProductoProduMano(productoprodumano,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProductoProduMano(productoprodumano);
	}
	
	public void setVariablesObjetoActualToFormularioProductoProduMano(ProductoProduMano productoprodumano) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProductoProduMano==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProductoProduMano.jLabelidProductoProduMano.setText(productoprodumano.getId().toString());
			this.jInternalFrameDetalleFormProductoProduMano.jTextFieldcantidadProductoProduMano.setText(productoprodumano.getcantidad().toString());
			this.jInternalFrameDetalleFormProductoProduMano.jTextFieldcostoProductoProduMano.setText(productoprodumano.getcosto().toString());
			this.jInternalFrameDetalleFormProductoProduMano.jTextFieldcosto_totalProductoProduMano.setText(productoprodumano.getcosto_total().toString());
			this.jInternalFrameDetalleFormProductoProduMano.jTextAreadescripcionProductoProduMano.setText(productoprodumano.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProductoProduMano productoprodumanoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,productoprodumanoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProductoProduMano productoprodumanoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				productoprodumanoLocal=this.productoprodumano;
			} else {
				productoprodumanoLocal=this.productoprodumanoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(productoprodumanoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProductoProduMano(productoprodumanoLocal,true);
					
					if(productoprodumanoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(productoprodumanoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(productoprodumanoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProductoProduMano(ProductoProduMano productoprodumano,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductoProduMano(productoprodumano,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMano(productoprodumano);
	}
	
	public void setVariablesFormularioToObjetoActualProductoProduMano(ProductoProduMano productoprodumano,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductoProduMano(productoprodumano,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProductoProduMano(ProductoProduMano productoprodumano,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProductoProduMano==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProductoProduMano.jLabelidProductoProduMano.getText()==null || this.jInternalFrameDetalleFormProductoProduMano.jLabelidProductoProduMano.getText()=="" || this.jInternalFrameDetalleFormProductoProduMano.jLabelidProductoProduMano.getText()=="Id") {
				this.jInternalFrameDetalleFormProductoProduMano.jLabelidProductoProduMano.setText("0");
			}

			if(conColumnasBase) {productoprodumano.setId(Long.parseLong(this.jInternalFrameDetalleFormProductoProduMano.jLabelidProductoProduMano.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoProduManoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduMano.jLabelIdProductoProduMano,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoprodumano.setcantidad(Long.parseLong(this.jInternalFrameDetalleFormProductoProduMano.jTextFieldcantidadProductoProduMano.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoProduManoConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduMano.jLabelcantidadProductoProduMano,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoprodumano.setcosto(Double.parseDouble(this.jInternalFrameDetalleFormProductoProduMano.jTextFieldcostoProductoProduMano.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoProduManoConstantesFunciones.LABEL_COSTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduMano.jLabelcostoProductoProduMano,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoprodumano.setcosto_total(Double.parseDouble(this.jInternalFrameDetalleFormProductoProduMano.jTextFieldcosto_totalProductoProduMano.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoProduManoConstantesFunciones.LABEL_COSTOTOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduMano.jLabelcosto_totalProductoProduMano,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoprodumano.setdescripcion(this.jInternalFrameDetalleFormProductoProduMano.jTextAreadescripcionProductoProduMano.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoProduManoConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduMano.jLabeldescripcionProductoProduMano,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductoProduMano(ProductoProduMano productoprodumanoBean,ProductoProduMano productoprodumano,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && productoprodumanoBean.getid_producto_defi_produ()!=null && !productoprodumanoBean.getid_producto_defi_produ().equals(-1L))) {productoprodumano.setid_producto_defi_produ(productoprodumanoBean.getid_producto_defi_produ());}
			if(conDefault || (!conDefault && productoprodumanoBean.getid_tipo_mano_produ_empresa()!=null && !productoprodumanoBean.getid_tipo_mano_produ_empresa().equals(-1L))) {productoprodumano.setid_tipo_mano_produ_empresa(productoprodumanoBean.getid_tipo_mano_produ_empresa());}
			if(conDefault || (!conDefault && productoprodumanoBean.getid_tipo_proceso_empresa_produ()!=null && !productoprodumanoBean.getid_tipo_proceso_empresa_produ().equals(-1L))) {productoprodumano.setid_tipo_proceso_empresa_produ(productoprodumanoBean.getid_tipo_proceso_empresa_produ());}
			if(conDefault || (!conDefault && productoprodumanoBean.getid_unidad()!=null && !productoprodumanoBean.getid_unidad().equals(-1L))) {productoprodumano.setid_unidad(productoprodumanoBean.getid_unidad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProductoProduMano(ProductoProduMano productoprodumanoOrigen,ProductoProduMano productoprodumano,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productoprodumanoOrigen.getId()!=null && !productoprodumanoOrigen.getId().equals(0L))) {productoprodumano.setId(productoprodumanoOrigen.getId());}}
			if(conDefault || (!conDefault && productoprodumanoOrigen.getid_producto_defi_produ()!=null && !productoprodumanoOrigen.getid_producto_defi_produ().equals(-1L))) {productoprodumano.setid_producto_defi_produ(productoprodumanoOrigen.getid_producto_defi_produ());}
			if(conDefault || (!conDefault && productoprodumanoOrigen.getid_tipo_mano_produ_empresa()!=null && !productoprodumanoOrigen.getid_tipo_mano_produ_empresa().equals(-1L))) {productoprodumano.setid_tipo_mano_produ_empresa(productoprodumanoOrigen.getid_tipo_mano_produ_empresa());}
			if(conDefault || (!conDefault && productoprodumanoOrigen.getid_tipo_proceso_empresa_produ()!=null && !productoprodumanoOrigen.getid_tipo_proceso_empresa_produ().equals(-1L))) {productoprodumano.setid_tipo_proceso_empresa_produ(productoprodumanoOrigen.getid_tipo_proceso_empresa_produ());}
			if(conDefault || (!conDefault && productoprodumanoOrigen.getid_unidad()!=null && !productoprodumanoOrigen.getid_unidad().equals(-1L))) {productoprodumano.setid_unidad(productoprodumanoOrigen.getid_unidad());}
			if(conDefault || (!conDefault && productoprodumanoOrigen.getcantidad()!=null && !productoprodumanoOrigen.getcantidad().equals(0L))) {productoprodumano.setcantidad(productoprodumanoOrigen.getcantidad());}
			if(conDefault || (!conDefault && productoprodumanoOrigen.getcosto()!=null && !productoprodumanoOrigen.getcosto().equals(0.0))) {productoprodumano.setcosto(productoprodumanoOrigen.getcosto());}
			if(conDefault || (!conDefault && productoprodumanoOrigen.getcosto_total()!=null && !productoprodumanoOrigen.getcosto_total().equals(0.0))) {productoprodumano.setcosto_total(productoprodumanoOrigen.getcosto_total());}
			if(conDefault || (!conDefault && productoprodumanoOrigen.getdescripcion()!=null && !productoprodumanoOrigen.getdescripcion().equals(""))) {productoprodumano.setdescripcion(productoprodumanoOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductoProduMano(ProductoProduMano productoprodumano) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductoProduMano.jLabelidProductoProduMano.setText(productoprodumano.getId().toString());
			this.jInternalFrameDetalleFormProductoProduMano.jTextFieldcantidadProductoProduMano.setText(productoprodumano.getcantidad().toString());
			this.jInternalFrameDetalleFormProductoProduMano.jTextFieldcostoProductoProduMano.setText(productoprodumano.getcosto().toString());
			this.jInternalFrameDetalleFormProductoProduMano.jTextFieldcosto_totalProductoProduMano.setText(productoprodumano.getcosto_total().toString());
			this.jInternalFrameDetalleFormProductoProduMano.jTextAreadescripcionProductoProduMano.setText(productoprodumano.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductoProduMano(ProductoProduManoBean productoprodumanoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductoProduMano.jLabelidProductoProduMano.setText(productoprodumanoBean.getId().toString());
			this.jInternalFrameDetalleFormProductoProduMano.jTextFieldcantidadProductoProduMano.setText(productoprodumanoBean.getcantidad().toString());
			this.jInternalFrameDetalleFormProductoProduMano.jTextFieldcostoProductoProduMano.setText(productoprodumanoBean.getcosto().toString());
			this.jInternalFrameDetalleFormProductoProduMano.jTextFieldcosto_totalProductoProduMano.setText(productoprodumanoBean.getcosto_total().toString());
			this.jInternalFrameDetalleFormProductoProduMano.jTextAreadescripcionProductoProduMano.setText(productoprodumanoBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProductoProduMano(ProductoProduManoParameterReturnGeneral productoprodumanoReturnGeneral,ProductoProduManoBean productoprodumanoBean,Boolean conDefault) throws Exception { 
		try {
			ProductoProduMano productoprodumanoLocal=new ProductoProduMano();
			
			productoprodumanoLocal=productoprodumanoReturnGeneral.getProductoProduMano();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productoprodumanoLocal.getId()!=null && !productoprodumanoLocal.getId().equals(0L))) {productoprodumanoBean.setId(productoprodumanoLocal.getId());}}
			if(conDefault || (!conDefault && productoprodumanoLocal.getid_producto_defi_produ()!=null && !productoprodumanoLocal.getid_producto_defi_produ().equals(-1L))) {productoprodumanoBean.setid_producto_defi_produ(productoprodumanoLocal.getid_producto_defi_produ());}
			if(conDefault || (!conDefault && productoprodumanoLocal.getid_tipo_mano_produ_empresa()!=null && !productoprodumanoLocal.getid_tipo_mano_produ_empresa().equals(-1L))) {productoprodumanoBean.setid_tipo_mano_produ_empresa(productoprodumanoLocal.getid_tipo_mano_produ_empresa());}
			if(conDefault || (!conDefault && productoprodumanoLocal.getid_tipo_proceso_empresa_produ()!=null && !productoprodumanoLocal.getid_tipo_proceso_empresa_produ().equals(-1L))) {productoprodumanoBean.setid_tipo_proceso_empresa_produ(productoprodumanoLocal.getid_tipo_proceso_empresa_produ());}
			if(conDefault || (!conDefault && productoprodumanoLocal.getid_unidad()!=null && !productoprodumanoLocal.getid_unidad().equals(-1L))) {productoprodumanoBean.setid_unidad(productoprodumanoLocal.getid_unidad());}
			if(conDefault || (!conDefault && productoprodumanoLocal.getcantidad()!=null && !productoprodumanoLocal.getcantidad().equals(0L))) {productoprodumanoBean.setcantidad(productoprodumanoLocal.getcantidad());}
			if(conDefault || (!conDefault && productoprodumanoLocal.getcosto()!=null && !productoprodumanoLocal.getcosto().equals(0.0))) {productoprodumanoBean.setcosto(productoprodumanoLocal.getcosto());}
			if(conDefault || (!conDefault && productoprodumanoLocal.getcosto_total()!=null && !productoprodumanoLocal.getcosto_total().equals(0.0))) {productoprodumanoBean.setcosto_total(productoprodumanoLocal.getcosto_total());}
			if(conDefault || (!conDefault && productoprodumanoLocal.getdescripcion()!=null && !productoprodumanoLocal.getdescripcion().equals(""))) {productoprodumanoBean.setdescripcion(productoprodumanoLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProductoProduManoGenerico(Long idProductoProduManoSeleccionado,JComboBox jComboBoxProductoProduMano,List<ProductoProduMano> productoprodumanosLocal)throws Exception {
		try {
			ProductoProduMano  productoprodumanoTemp=null;

			for(ProductoProduMano productoprodumanoAux:productoprodumanosLocal) {
				if(productoprodumanoAux.getId()!=null && productoprodumanoAux.getId().equals(idProductoProduManoSeleccionado)) {
					productoprodumanoTemp=productoprodumanoAux;
					break;
				}
			}

			jComboBoxProductoProduMano.setSelectedItem(productoprodumanoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProductoProduManoGenerico(JComboBox jComboBoxProductoProduMano,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProductoProduMano.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductoProduMano.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProductoProduMano.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductoProduMano.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductoProduMano.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProductoProduMano.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductoProduMano.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProductoProduMano.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProductoProduMano.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProductoProduMano.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoprodumano=(ProductoProduMano) productoprodumanoLogic.getProductoProduManos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productoprodumano =(ProductoProduMano) productoprodumanos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("ProductoDefiProdu")) {
			//sDescripcion=this.getActualProductoDefiProduForeignKeyDescripcion((Long)value);
			if(!productoprodumano.getIsNew() && !productoprodumano.getIsChanged() && !productoprodumano.getIsDeleted()) {
				sDescripcion=productoprodumano.getproductodefiprodu_descripcion();
			} else {
				//sDescripcion=this.getActualProductoDefiProduForeignKeyDescripcion((Long)value);
				sDescripcion=productoprodumano.getproductodefiprodu_descripcion();
			}
		}

		if(sTipo.equals("TipoManoProduEmpresa")) {
			//sDescripcion=this.getActualTipoManoProduEmpresaForeignKeyDescripcion((Long)value);
			if(!productoprodumano.getIsNew() && !productoprodumano.getIsChanged() && !productoprodumano.getIsDeleted()) {
				sDescripcion=productoprodumano.gettipomanoproduempresa_descripcion();
			} else {
				//sDescripcion=this.getActualTipoManoProduEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=productoprodumano.gettipomanoproduempresa_descripcion();
			}
		}

		if(sTipo.equals("TipoProcesoEmpresaProdu")) {
			//sDescripcion=this.getActualTipoProcesoEmpresaProduForeignKeyDescripcion((Long)value);
			if(!productoprodumano.getIsNew() && !productoprodumano.getIsChanged() && !productoprodumano.getIsDeleted()) {
				sDescripcion=productoprodumano.gettipoprocesoempresaprodu_descripcion();
			} else {
				//sDescripcion=this.getActualTipoProcesoEmpresaProduForeignKeyDescripcion((Long)value);
				sDescripcion=productoprodumano.gettipoprocesoempresaprodu_descripcion();
			}
		}

		if(sTipo.equals("Unidad")) {
			//sDescripcion=this.getActualUnidadForeignKeyDescripcion((Long)value);
			if(!productoprodumano.getIsNew() && !productoprodumano.getIsChanged() && !productoprodumano.getIsDeleted()) {
				sDescripcion=productoprodumano.getunidad_descripcion();
			} else {
				//sDescripcion=this.getActualUnidadForeignKeyDescripcion((Long)value);
				sDescripcion=productoprodumano.getunidad_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProductoProduMano productoprodumanoRow=new ProductoProduMano();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoprodumanoRow=(ProductoProduMano) productoprodumanoLogic.getProductoProduManos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productoprodumanoRow=(ProductoProduMano) productoprodumanos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProductoProduMano(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProductoProduMano.setVisible((this.isVisibilidadCeldaNuevoProductoProduMano && this.isPermisoNuevoProductoProduMano));			
			this.jButtonDuplicarProductoProduMano.setVisible((this.isVisibilidadCeldaDuplicarProductoProduMano && this.isPermisoDuplicarProductoProduMano));			
			this.jButtonCopiarProductoProduMano.setVisible((this.isVisibilidadCeldaCopiarProductoProduMano && this.isPermisoCopiarProductoProduMano));
			this.jButtonVerFormProductoProduMano.setVisible((this.isVisibilidadCeldaVerFormProductoProduMano && this.isPermisoVerFormProductoProduMano));
			
			this.jButtonAbrirOrderByProductoProduMano.setVisible((this.isVisibilidadCeldaOrdenProductoProduMano && this.isPermisoOrdenProductoProduMano));			
			
			this.jButtonNuevoRelacionesProductoProduMano.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoProduMano && this.isPermisoNuevoProductoProduMano));			
			this.jButtonNuevoGuardarCambiosProductoProduMano.setVisible((this.isVisibilidadCeldaNuevoProductoProduMano && this.isPermisoNuevoProductoProduMano && this.isPermisoGuardarCambiosProductoProduMano));
			
			if(this.jInternalFrameDetalleFormProductoProduMano!=null) {
			this.jInternalFrameDetalleFormProductoProduMano.jButtonModificarProductoProduMano.setVisible((this.isVisibilidadCeldaModificarProductoProduMano && this.isPermisoActualizarProductoProduMano));	
			this.jInternalFrameDetalleFormProductoProduMano.jButtonActualizarProductoProduMano.setVisible((this.isVisibilidadCeldaActualizarProductoProduMano && this.isPermisoActualizarProductoProduMano));	
			this.jInternalFrameDetalleFormProductoProduMano.jButtonEliminarProductoProduMano.setVisible((this.isVisibilidadCeldaEliminarProductoProduMano && this.isPermisoEliminarProductoProduMano));
			this.jInternalFrameDetalleFormProductoProduMano.jButtonCancelarProductoProduMano.setVisible(this.isVisibilidadCeldaCancelarProductoProduMano);							
			this.jInternalFrameDetalleFormProductoProduMano.jButtonGuardarCambiosProductoProduMano.setVisible((this.isVisibilidadCeldaGuardarProductoProduMano && this.isPermisoGuardarCambiosProductoProduMano));			
			
			}
						
			this.jButtonGuardarCambiosTablaProductoProduMano.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoProduMano && this.isPermisoGuardarCambiosProductoProduMano));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProductoProduMano.setVisible((this.isVisibilidadCeldaNuevoProductoProduMano && this.isPermisoNuevoProductoProduMano));						
			this.jButtonDuplicarToolBarProductoProduMano.setVisible((this.isVisibilidadCeldaDuplicarProductoProduMano && this.isPermisoDuplicarProductoProduMano));						
			this.jButtonCopiarToolBarProductoProduMano.setVisible((this.isVisibilidadCeldaCopiarProductoProduMano && this.isPermisoCopiarProductoProduMano));			
			this.jButtonVerFormToolBarProductoProduMano.setVisible((this.isVisibilidadCeldaVerFormProductoProduMano && this.isPermisoVerFormProductoProduMano));			
			this.jButtonAbrirOrderByToolBarProductoProduMano.setVisible((this.isVisibilidadCeldaOrdenProductoProduMano && this.isPermisoOrdenProductoProduMano));
			this.jButtonNuevoRelacionesToolBarProductoProduMano.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoProduMano && this.isPermisoNuevoProductoProduMano));			
			this.jButtonNuevoGuardarCambiosToolBarProductoProduMano.setVisible((this.isVisibilidadCeldaNuevoProductoProduMano && this.isPermisoNuevoProductoProduMano && this.isPermisoGuardarCambiosProductoProduMano));			
			
			if(this.jInternalFrameDetalleFormProductoProduMano!=null) {
			this.jInternalFrameDetalleFormProductoProduMano.jButtonModificarToolBarProductoProduMano.setVisible((this.isVisibilidadCeldaModificarProductoProduMano && this.isPermisoActualizarProductoProduMano));	
			this.jInternalFrameDetalleFormProductoProduMano.jButtonActualizarToolBarProductoProduMano.setVisible((this.isVisibilidadCeldaActualizarProductoProduMano  && this.isPermisoActualizarProductoProduMano));	
			this.jInternalFrameDetalleFormProductoProduMano.jButtonEliminarToolBarProductoProduMano.setVisible((this.isVisibilidadCeldaEliminarProductoProduMano && this.isPermisoEliminarProductoProduMano));
			this.jInternalFrameDetalleFormProductoProduMano.jButtonCancelarToolBarProductoProduMano.setVisible(this.isVisibilidadCeldaCancelarProductoProduMano);				
			this.jInternalFrameDetalleFormProductoProduMano.jButtonGuardarCambiosToolBarProductoProduMano.setVisible((this.isVisibilidadCeldaGuardarProductoProduMano && this.isPermisoGuardarCambiosProductoProduMano));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProductoProduMano.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoProduMano && this.isPermisoGuardarCambiosProductoProduMano));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProductoProduMano.setVisible((this.isVisibilidadCeldaNuevoProductoProduMano && this.isPermisoNuevoProductoProduMano));			
			this.jMenuItemDuplicarProductoProduMano.setVisible((this.isVisibilidadCeldaDuplicarProductoProduMano && this.isPermisoDuplicarProductoProduMano));			
			this.jMenuItemCopiarProductoProduMano.setVisible((this.isVisibilidadCeldaCopiarProductoProduMano && this.isPermisoCopiarProductoProduMano));			
			this.jMenuItemVerFormProductoProduMano.setVisible((this.isVisibilidadCeldaVerFormProductoProduMano && this.isPermisoVerFormProductoProduMano));			
			this.jMenuItemAbrirOrderByProductoProduMano.setVisible((this.isVisibilidadCeldaOrdenProductoProduMano && this.isPermisoOrdenProductoProduMano));			
			//this.jMenuItemMostrarOcultarProductoProduMano.setVisible((this.isVisibilidadCeldaOrdenProductoProduMano && this.isPermisoOrdenProductoProduMano));
			this.jMenuItemDetalleAbrirOrderByProductoProduMano.setVisible((this.isVisibilidadCeldaOrdenProductoProduMano && this.isPermisoOrdenProductoProduMano));			
			//this.jMenuItemDetalleMostrarOcultarProductoProduMano.setVisible((this.isVisibilidadCeldaOrdenProductoProduMano && this.isPermisoOrdenProductoProduMano));			
			this.jMenuItemNuevoRelacionesProductoProduMano.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoProduMano && this.isPermisoNuevoProductoProduMano));			
			this.jMenuItemNuevoGuardarCambiosProductoProduMano.setVisible((this.isVisibilidadCeldaNuevoProductoProduMano && this.isPermisoNuevoProductoProduMano && this.isPermisoGuardarCambiosProductoProduMano));									
			
			if(this.jInternalFrameDetalleFormProductoProduMano!=null) {
			this.jInternalFrameDetalleFormProductoProduMano.jMenuItemModificarProductoProduMano.setVisible((this.isVisibilidadCeldaModificarProductoProduMano && this.isPermisoActualizarProductoProduMano));	
			this.jInternalFrameDetalleFormProductoProduMano.jMenuItemActualizarProductoProduMano.setVisible((this.isVisibilidadCeldaActualizarProductoProduMano && this.isPermisoActualizarProductoProduMano));	
			this.jInternalFrameDetalleFormProductoProduMano.jMenuItemEliminarProductoProduMano.setVisible((this.isVisibilidadCeldaEliminarProductoProduMano && this.isPermisoEliminarProductoProduMano));
			this.jInternalFrameDetalleFormProductoProduMano.jMenuItemCancelarProductoProduMano.setVisible(this.isVisibilidadCeldaCancelarProductoProduMano);				
			}
			
			this.jMenuItemGuardarCambiosProductoProduMano.setVisible((this.isVisibilidadCeldaGuardarProductoProduMano && this.isPermisoGuardarCambiosProductoProduMano));						
			this.jMenuItemGuardarCambiosTablaProductoProduMano.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoProduMano && this.isPermisoGuardarCambiosProductoProduMano));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProductoProduMano=this.jButtonNuevoProductoProduMano.isVisible();
			this.isVisibilidadCeldaDuplicarProductoProduMano=this.jButtonDuplicarProductoProduMano.isVisible();
			this.isVisibilidadCeldaCopiarProductoProduMano=this.jButtonCopiarProductoProduMano.isVisible();
			this.isVisibilidadCeldaVerFormProductoProduMano=this.jButtonVerFormProductoProduMano.isVisible();
			
			this.isVisibilidadCeldaOrdenProductoProduMano=this.jButtonAbrirOrderByProductoProduMano.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProductoProduMano=this.jButtonNuevoRelacionesProductoProduMano.isVisible();
			this.isVisibilidadCeldaModificarProductoProduMano=this.jButtonModificarProductoProduMano.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoProduMano!=null) {
			this.isVisibilidadCeldaActualizarProductoProduMano=this.jInternalFrameDetalleFormProductoProduMano.jButtonActualizarProductoProduMano.isVisible();
			this.isVisibilidadCeldaEliminarProductoProduMano=this.jInternalFrameDetalleFormProductoProduMano.jButtonEliminarProductoProduMano.isVisible();
			this.isVisibilidadCeldaCancelarProductoProduMano=this.jInternalFrameDetalleFormProductoProduMano.jButtonCancelarProductoProduMano.isVisible();
			this.isVisibilidadCeldaGuardarProductoProduMano=this.jInternalFrameDetalleFormProductoProduMano.jButtonGuardarCambiosProductoProduMano.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProductoProduMano=this.jButtonGuardarCambiosTablaProductoProduMano.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProductoProduMano=this.jButtonNuevoToolBarProductoProduMano.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductoProduMano=this.jButtonNuevoRelacionesToolBarProductoProduMano.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoProduMano!=null) {
			this.isVisibilidadCeldaModificarProductoProduMano=this.jInternalFrameDetalleFormProductoProduMano.jButtonModificarToolBarProductoProduMano.isVisible();
			this.isVisibilidadCeldaActualizarProductoProduMano=this.jInternalFrameDetalleFormProductoProduMano.jButtonActualizarToolBarProductoProduMano.isVisible();
			this.isVisibilidadCeldaEliminarProductoProduMano=this.jInternalFrameDetalleFormProductoProduMano.jButtonEliminarToolBarProductoProduMano.isVisible();
			this.isVisibilidadCeldaCancelarProductoProduMano=this.jInternalFrameDetalleFormProductoProduMano.jButtonCancelarToolBarProductoProduMano.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductoProduMano=this.jButtonGuardarCambiosToolBarProductoProduMano.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductoProduMano=this.jButtonGuardarCambiosTablaToolBarProductoProduMano.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProductoProduMano=this.jMenuItemNuevoProductoProduMano.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductoProduMano=this.jMenuItemNuevoRelacionesProductoProduMano.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoProduMano!=null) {
			this.isVisibilidadCeldaModificarProductoProduMano=this.jInternalFrameDetalleFormProductoProduMano.jMenuItemModificarProductoProduMano.isVisible();
			this.isVisibilidadCeldaActualizarProductoProduMano=this.jInternalFrameDetalleFormProductoProduMano.jMenuItemActualizarProductoProduMano.isVisible();
			this.isVisibilidadCeldaEliminarProductoProduMano=this.jInternalFrameDetalleFormProductoProduMano.jMenuItemEliminarProductoProduMano.isVisible();
			this.isVisibilidadCeldaCancelarProductoProduMano=this.jInternalFrameDetalleFormProductoProduMano.jMenuItemCancelarProductoProduMano.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductoProduMano=this.jMenuItemGuardarCambiosProductoProduMano.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductoProduMano=this.jMenuItemGuardarCambiosTablaProductoProduMano.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProductoProduMano(Boolean esInicializar) {
		if(ProductoProduManoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.productoprodumanoSessionBean.getConGuardarRelaciones()) {
				//if(this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProductoProduMano();
			}
			
			this.inicializarActualizarBindingBotonesManualProductoProduMano(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProductoProduMano() {
		this.jButtonNuevoProductoProduMano.setVisible(this.isPermisoNuevoProductoProduMano);			
		this.jButtonDuplicarProductoProduMano.setVisible(this.isPermisoDuplicarProductoProduMano);			
		this.jButtonCopiarProductoProduMano.setVisible(this.isPermisoCopiarProductoProduMano);			
		this.jButtonVerFormProductoProduMano.setVisible(this.isPermisoVerFormProductoProduMano);			
		
		this.jButtonAbrirOrderByProductoProduMano.setVisible(this.isPermisoOrdenProductoProduMano);					
		
		this.jButtonNuevoRelacionesProductoProduMano.setVisible(this.isPermisoNuevoProductoProduMano);			
		
		if(this.jInternalFrameDetalleFormProductoProduMano!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMano.jButtonModificarProductoProduMano.setVisible(this.isPermisoActualizarProductoProduMano);	
			this.jInternalFrameDetalleFormProductoProduMano.jButtonActualizarProductoProduMano.setVisible(this.isPermisoActualizarProductoProduMano);	
			this.jInternalFrameDetalleFormProductoProduMano.jButtonEliminarProductoProduMano.setVisible(this.isPermisoEliminarProductoProduMano);
			this.jInternalFrameDetalleFormProductoProduMano.jButtonCancelarProductoProduMano.setVisible(this.isVisibilidadCeldaCancelarProductoProduMano);						
			this.jInternalFrameDetalleFormProductoProduMano.jButtonGuardarCambiosProductoProduMano.setVisible(this.isPermisoGuardarCambiosProductoProduMano);							
		}
		
		this.jButtonGuardarCambiosTablaProductoProduMano.setVisible(this.isPermisoActualizarProductoProduMano);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProductoProduMano() {
		this.jInternalFrameDetalleFormProductoProduMano.jButtonModificarProductoProduMano.setVisible(this.isPermisoActualizarProductoProduMano);	
		this.jInternalFrameDetalleFormProductoProduMano.jButtonActualizarProductoProduMano.setVisible(this.isPermisoActualizarProductoProduMano);	
		this.jInternalFrameDetalleFormProductoProduMano.jButtonEliminarProductoProduMano.setVisible(this.isPermisoEliminarProductoProduMano);
		this.jInternalFrameDetalleFormProductoProduMano.jButtonCancelarProductoProduMano.setVisible(this.isVisibilidadCeldaCancelarProductoProduMano);							
		this.jInternalFrameDetalleFormProductoProduMano.jButtonGuardarCambiosProductoProduMano.setVisible((this.isVisibilidadCeldaGuardarProductoProduMano && this.isPermisoGuardarCambiosProductoProduMano));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProductoProduMano() {
		if(ProductoProduManoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProductoProduMano();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProductoProduMano() {
	}
	
	public void jTableDatosProductoProduManoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProductoProduMano(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProductoProduManoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduMano.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProduMano(this.getproductoprodumano(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMano(this.productoprodumano);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodumano =(ProductoProduMano) this.productoprodumanoLogic.getProductoProduManos().toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodumano =(ProductoProduMano) this.productoprodumanos.toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodumano==null) {
						this.productoprodumano = new ProductoProduMano();
					}

					this.setVariablesFormularioToObjetoActualProductoProduMano(this.productoprodumano,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMano(this.productoprodumano);
				}

				if(this.productoprodumano.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.productoprodumano.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProduMano(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_producto_defi_produProductoProduManoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproductodefiprodu=true;

			idTienePermisoproductodefiprodu=this.tienePermisosUsuarioEnPaginaWebProductoProduMano(ProductoDefiProduConstantesFunciones.CLASSNAME);

			if(idTienePermisoproductodefiprodu) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduMano.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoProduMano.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoProduMano.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumano =(ProductoProduMano) this.productoprodumanoLogic.getProductoProduManos().toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoprodumano =(ProductoProduMano) this.productoprodumanos.toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoProduMano(this.getproductoprodumano(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMano(this.productoprodumano);

				this.productodefiproduBeanSwingJInternalFrame=new ProductoDefiProduBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productodefiproduBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productodefiproduBeanSwingJInternalFrame.getProductoDefiProduLogic().setConnexion(this.productoprodumanoLogic.getConnexion());

				if(this.productoprodumano.getid_producto_defi_produ()!=null) {
					this.productodefiproduBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productodefiproduBeanSwingJInternalFrame.setIdActual(this.productoprodumano.getid_producto_defi_produ());
					this.productodefiproduBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productodefiproduBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productodefiproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoDefiProdu();
				}

				JInternalFrameBase jinternalFrame =this.productodefiproduBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoProduMano=(TitledBorder)this.jScrollPanelDatosProductoProduMano.getBorder();
				TitledBorder titledBorderproductodefiprodu=(TitledBorder)this.productodefiproduBeanSwingJInternalFrame.jScrollPanelDatosProductoDefiProdu.getBorder();

				titledBorderproductodefiprodu.setTitle(titledBorderProductoProduMano.getTitle() + " -> Producto Definicion Produccion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_producto_defi_produProductoProduManoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduMano.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProduMano(this.getproductoprodumano(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMano(this.productoprodumano);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodumano =(ProductoProduMano) this.productoprodumanoLogic.getProductoProduManos().toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodumano =(ProductoProduMano) this.productoprodumanos.toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodumano==null) {
						this.productoprodumano = new ProductoProduMano();
					}

					this.setVariablesFormularioToObjetoActualProductoProduMano(this.productoprodumano,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMano(this.productoprodumano);
				}

				if(this.productoprodumano.getid_producto_defi_produ()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto_defi_produ = "+this.productoprodumano.getid_producto_defi_produ().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProduMano(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_mano_produ_empresaProductoProduManoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipomanoproduempresa=true;

			idTienePermisotipomanoproduempresa=this.tienePermisosUsuarioEnPaginaWebProductoProduMano(TipoManoProduEmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisotipomanoproduempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduMano.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoProduMano.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoProduMano.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumano =(ProductoProduMano) this.productoprodumanoLogic.getProductoProduManos().toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoprodumano =(ProductoProduMano) this.productoprodumanos.toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoProduMano(this.getproductoprodumano(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMano(this.productoprodumano);

				this.tipomanoproduempresaBeanSwingJInternalFrame=new TipoManoProduEmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipomanoproduempresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipomanoproduempresaBeanSwingJInternalFrame.getTipoManoProduEmpresaLogic().setConnexion(this.productoprodumanoLogic.getConnexion());

				if(this.productoprodumano.getid_tipo_mano_produ_empresa()!=null) {
					this.tipomanoproduempresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipomanoproduempresaBeanSwingJInternalFrame.setIdActual(this.productoprodumano.getid_tipo_mano_produ_empresa());
					this.tipomanoproduempresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipomanoproduempresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipomanoproduempresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoManoProduEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.tipomanoproduempresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoProduMano=(TitledBorder)this.jScrollPanelDatosProductoProduMano.getBorder();
				TitledBorder titledBordertipomanoproduempresa=(TitledBorder)this.tipomanoproduempresaBeanSwingJInternalFrame.jScrollPanelDatosTipoManoProduEmpresa.getBorder();

				titledBordertipomanoproduempresa.setTitle(titledBorderProductoProduMano.getTitle() + " -> Tipo Mano Obra Produccion Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_mano_produ_empresaProductoProduManoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduMano.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProduMano(this.getproductoprodumano(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMano(this.productoprodumano);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodumano =(ProductoProduMano) this.productoprodumanoLogic.getProductoProduManos().toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodumano =(ProductoProduMano) this.productoprodumanos.toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodumano==null) {
						this.productoprodumano = new ProductoProduMano();
					}

					this.setVariablesFormularioToObjetoActualProductoProduMano(this.productoprodumano,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMano(this.productoprodumano);
				}

				if(this.productoprodumano.getid_tipo_mano_produ_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_mano_produ_empresa = "+this.productoprodumano.getid_tipo_mano_produ_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProduMano(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_proceso_empresa_produProductoProduManoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoprocesoempresaprodu=true;

			idTienePermisotipoprocesoempresaprodu=this.tienePermisosUsuarioEnPaginaWebProductoProduMano(TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoprocesoempresaprodu) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduMano.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoProduMano.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoProduMano.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumano =(ProductoProduMano) this.productoprodumanoLogic.getProductoProduManos().toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoprodumano =(ProductoProduMano) this.productoprodumanos.toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoProduMano(this.getproductoprodumano(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMano(this.productoprodumano);

				this.tipoprocesoempresaproduBeanSwingJInternalFrame=new TipoProcesoEmpresaProduBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoprocesoempresaproduBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoprocesoempresaproduBeanSwingJInternalFrame.getTipoProcesoEmpresaProduLogic().setConnexion(this.productoprodumanoLogic.getConnexion());

				if(this.productoprodumano.getid_tipo_proceso_empresa_produ()!=null) {
					this.tipoprocesoempresaproduBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoprocesoempresaproduBeanSwingJInternalFrame.setIdActual(this.productoprodumano.getid_tipo_proceso_empresa_produ());
					this.tipoprocesoempresaproduBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoprocesoempresaproduBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoprocesoempresaproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoProcesoEmpresaProdu();
				}

				JInternalFrameBase jinternalFrame =this.tipoprocesoempresaproduBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoProduMano=(TitledBorder)this.jScrollPanelDatosProductoProduMano.getBorder();
				TitledBorder titledBordertipoprocesoempresaprodu=(TitledBorder)this.tipoprocesoempresaproduBeanSwingJInternalFrame.jScrollPanelDatosTipoProcesoEmpresaProdu.getBorder();

				titledBordertipoprocesoempresaprodu.setTitle(titledBorderProductoProduMano.getTitle() + " -> Tipo Proceso Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_proceso_empresa_produProductoProduManoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduMano.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProduMano(this.getproductoprodumano(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMano(this.productoprodumano);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodumano =(ProductoProduMano) this.productoprodumanoLogic.getProductoProduManos().toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodumano =(ProductoProduMano) this.productoprodumanos.toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodumano==null) {
						this.productoprodumano = new ProductoProduMano();
					}

					this.setVariablesFormularioToObjetoActualProductoProduMano(this.productoprodumano,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMano(this.productoprodumano);
				}

				if(this.productoprodumano.getid_tipo_proceso_empresa_produ()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_proceso_empresa_produ = "+this.productoprodumano.getid_tipo_proceso_empresa_produ().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProduMano(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_unidadProductoProduManoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisounidad=true;

			idTienePermisounidad=this.tienePermisosUsuarioEnPaginaWebProductoProduMano(UnidadConstantesFunciones.CLASSNAME);

			if(idTienePermisounidad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduMano.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoProduMano.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoProduMano.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumano =(ProductoProduMano) this.productoprodumanoLogic.getProductoProduManos().toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoprodumano =(ProductoProduMano) this.productoprodumanos.toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoProduMano(this.getproductoprodumano(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMano(this.productoprodumano);

				this.unidadBeanSwingJInternalFrame=new UnidadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.unidadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.unidadBeanSwingJInternalFrame.getUnidadLogic().setConnexion(this.productoprodumanoLogic.getConnexion());

				if(this.productoprodumano.getid_unidad()!=null) {
					this.unidadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.unidadBeanSwingJInternalFrame.setIdActual(this.productoprodumano.getid_unidad());
					this.unidadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.inicializarActualizarBindingTablaUnidad();
				}

				JInternalFrameBase jinternalFrame =this.unidadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoProduMano=(TitledBorder)this.jScrollPanelDatosProductoProduMano.getBorder();
				TitledBorder titledBorderunidad=(TitledBorder)this.unidadBeanSwingJInternalFrame.jScrollPanelDatosUnidad.getBorder();

				titledBorderunidad.setTitle(titledBorderProductoProduMano.getTitle() + " -> Unidad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_unidadProductoProduManoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduMano.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProduMano(this.getproductoprodumano(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMano(this.productoprodumano);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodumano =(ProductoProduMano) this.productoprodumanoLogic.getProductoProduManos().toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodumano =(ProductoProduMano) this.productoprodumanos.toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodumano==null) {
						this.productoprodumano = new ProductoProduMano();
					}

					this.setVariablesFormularioToObjetoActualProductoProduMano(this.productoprodumano,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMano(this.productoprodumano);
				}

				if(this.productoprodumano.getid_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_unidad = "+this.productoprodumano.getid_unidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProduMano(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadProductoProduManoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduMano.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProduMano(this.getproductoprodumano(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMano(this.productoprodumano);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodumano =(ProductoProduMano) this.productoprodumanoLogic.getProductoProduManos().toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodumano =(ProductoProduMano) this.productoprodumanos.toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodumano==null) {
						this.productoprodumano = new ProductoProduMano();
					}

					this.setVariablesFormularioToObjetoActualProductoProduMano(this.productoprodumano,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMano(this.productoprodumano);
				}

				if(this.productoprodumano.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.productoprodumano.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProduMano(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncostoProductoProduManoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduMano.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProduMano(this.getproductoprodumano(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMano(this.productoprodumano);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodumano =(ProductoProduMano) this.productoprodumanoLogic.getProductoProduManos().toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodumano =(ProductoProduMano) this.productoprodumanos.toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodumano==null) {
						this.productoprodumano = new ProductoProduMano();
					}

					this.setVariablesFormularioToObjetoActualProductoProduMano(this.productoprodumano,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMano(this.productoprodumano);
				}

				if(this.productoprodumano.getcosto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo = "+this.productoprodumano.getcosto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProduMano(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncosto_totalProductoProduManoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduMano.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProduMano(this.getproductoprodumano(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMano(this.productoprodumano);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodumano =(ProductoProduMano) this.productoprodumanoLogic.getProductoProduManos().toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodumano =(ProductoProduMano) this.productoprodumanos.toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodumano==null) {
						this.productoprodumano = new ProductoProduMano();
					}

					this.setVariablesFormularioToObjetoActualProductoProduMano(this.productoprodumano,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMano(this.productoprodumano);
				}

				if(this.productoprodumano.getcosto_total()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo_total = "+this.productoprodumano.getcosto_total().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProduMano(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionProductoProduManoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduMano.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProduMano(this.getproductoprodumano(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMano(this.productoprodumano);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodumano =(ProductoProduMano) this.productoprodumanoLogic.getProductoProduManos().toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodumano =(ProductoProduMano) this.productoprodumanos.toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodumano==null) {
						this.productoprodumano = new ProductoProduMano();
					}

					this.setVariablesFormularioToObjetoActualProductoProduMano(this.productoprodumano,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMano(this.productoprodumano);
				}

				if(this.productoprodumano.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.productoprodumano.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProduMano(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdProductoDefiProduProductoProduManoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoProduMano(false,false);

			this.getProductoProduManosFK_IdProductoDefiProdu();

			this.inicializarActualizarBindingProductoProduMano(false);

			//if(ProductoProduManoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoProduMano(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoManoProduEmpresaProductoProduManoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoProduMano(false,false);

			this.getProductoProduManosFK_IdTipoManoProduEmpresa();

			this.inicializarActualizarBindingProductoProduMano(false);

			//if(ProductoProduManoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoProduMano(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoProcesoEmpresaProduProductoProduManoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoProduMano(false,false);

			this.getProductoProduManosFK_IdTipoProcesoEmpresaProdu();

			this.inicializarActualizarBindingProductoProduMano(false);

			//if(ProductoProduManoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoProduMano(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUnidadProductoProduManoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoProduMano(false,false);

			this.getProductoProduManosFK_IdUnidad();

			this.inicializarActualizarBindingProductoProduMano(false);

			//if(ProductoProduManoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoProduMano(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumanoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProductoProduMano() {
		if(this.jInternalFrameDetalleFormProductoProduMano!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProductoProduMano!=null) {
			this.jInternalFrameDetalleFormProductoProduMano.setVisible(false);	    			
			this.jInternalFrameDetalleFormProductoProduMano.dispose();
			this.jInternalFrameDetalleFormProductoProduMano=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProductoProduMano!=null) {
			this.jInternalFrameReporteDinamicoProductoProduMano.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProductoProduMano.dispose();
			this.jInternalFrameReporteDinamicoProductoProduMano=null;
		}
		
		if(this.jInternalFrameImportacionProductoProduMano!=null) {
			this.jInternalFrameImportacionProductoProduMano.setVisible(false);	    			
			this.jInternalFrameImportacionProductoProduMano.dispose();
			this.jInternalFrameImportacionProductoProduMano=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProductoProduMano();
			
			ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
			
			
			if(sTipo.equals("NuevoProductoProduMano")) {
				jButtonNuevoProductoProduManoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProductoProduMano")) {
				jButtonDuplicarProductoProduManoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProductoProduMano")) {
				jButtonCopiarProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("VerFormProductoProduMano")) {
				jButtonVerFormProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProductoProduMano")) {
				jButtonNuevoProductoProduManoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProductoProduMano")) {
				jButtonDuplicarProductoProduManoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProductoProduMano")) {
				jButtonNuevoProductoProduManoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProductoProduMano")) {
				jButtonDuplicarProductoProduManoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProductoProduMano")) {
				jButtonNuevoProductoProduManoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProductoProduMano")) {
				jButtonNuevoProductoProduManoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProductoProduMano")) {
				jButtonNuevoProductoProduManoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProductoProduMano")) {
				jButtonModificarProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProductoProduMano")) {
				jButtonModificarProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProductoProduMano")) {
				jButtonModificarProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProductoProduMano")) {
				jButtonActualizarProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProductoProduMano")) {
				jButtonActualizarProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProductoProduMano")) {
				jButtonActualizarProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("EliminarProductoProduMano")) {
				jButtonEliminarProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProductoProduMano")) {
				jButtonEliminarProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProductoProduMano")) {
				jButtonEliminarProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("CancelarProductoProduMano")) {
				jButtonCancelarProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProductoProduMano")) {
				jButtonCancelarProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProductoProduMano")) {
				jButtonCancelarProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("CerrarProductoProduMano")) {
				jButtonCerrarProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProductoProduMano")) {
				jButtonCerrarProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProductoProduMano")) {
				jButtonCerrarProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProductoProduMano")) {
				jButtonMostrarOcultarProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProductoProduMano")) {
				jButtonCancelarProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProductoProduMano")) {
				jButtonGuardarCambiosProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProductoProduMano")) {
				jButtonGuardarCambiosProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProductoProduMano")) {
				jButtonCopiarProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProductoProduMano")) {
				jButtonVerFormProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProductoProduMano")) {
				jButtonGuardarCambiosProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProductoProduMano")) {
				jButtonCopiarProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProductoProduMano")) {
				jButtonVerFormProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProductoProduMano")) {
				jButtonGuardarCambiosProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProductoProduMano")) {
				jButtonGuardarCambiosProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProductoProduMano")) {
				jButtonGuardarCambiosProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProductoProduMano")) {
				jButtonRecargarInformacionProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProductoProduMano")) {
				jButtonRecargarInformacionProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProductoProduMano")) {
				jButtonRecargarInformacionProductoProduManoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProductoProduMano")) {
				jButtonAnterioresProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProductoProduMano")) {
				jButtonAnterioresProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProductoProduMano")) {
				jButtonAnterioresProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProductoProduMano")) {
				jButtonSiguientesProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProductoProduMano")) {
				jButtonSiguientesProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProductoProduMano")) {
				jButtonSiguientesProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProductoProduMano") || sTipo.equals("MenuItemDetalleAbrirOrderByProductoProduMano")) {
				jButtonAbrirOrderByProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProductoProduMano") || sTipo.equals("MenuItemDetalleMostrarOcultarProductoProduMano")) {
				jButtonMostrarOcultarProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProductoProduMano")) {
				jButtonNuevoGuardarCambiosProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProductoProduMano")) {
				jButtonNuevoGuardarCambiosProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProductoProduMano")) {
				jButtonNuevoGuardarCambiosProductoProduManoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProductoProduMano")) {
				jButtonCerrarReporteDinamicoProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProductoProduMano")) {
				jButtonGenerarReporteDinamicoProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProductoProduMano")) {
				
				jButtonGenerarExcelReporteDinamicoProductoProduManoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProductoProduMano")) {
				jButtonCerrarImportacionProductoProduManoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProductoProduMano")) {
				
				jButtonGenerarImportacionProductoProduManoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProductoProduMano")) {
				
				jButtonAbrirImportacionProductoProduManoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProductoProduMano")) {
				jComboBoxTiposAccionesProductoProduManoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProductoProduMano")) {
				jComboBoxTiposRelacionesProductoProduManoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProductoProduMano")) {
				jComboBoxTiposAccionesProductoProduManoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProductoProduMano")) {
				
				jComboBoxTiposSeleccionarProductoProduManoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProductoProduMano")) {
				jTextFieldValorCampoGeneralProductoProduManoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProductoProduMano")) {
				jButtonAbrirOrderByProductoProduManoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProductoProduMano")) {
				jButtonAbrirOrderByProductoProduManoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProductoProduMano")) {
				jButtonCerrarOrderByProductoProduManoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductoProduManoBusqueda")) {
				this.jButtonidProductoProduManoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_producto_defi_produProductoProduManoUpdate")) {
				this.jButtonid_producto_defi_produProductoProduManoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_producto_defi_produProductoProduManoBusqueda")) {
				this.jButtonid_producto_defi_produProductoProduManoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_mano_produ_empresaProductoProduManoUpdate")) {
				this.jButtonid_tipo_mano_produ_empresaProductoProduManoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_mano_produ_empresaProductoProduManoBusqueda")) {
				this.jButtonid_tipo_mano_produ_empresaProductoProduManoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_proceso_empresa_produProductoProduManoUpdate")) {
				this.jButtonid_tipo_proceso_empresa_produProductoProduManoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_proceso_empresa_produProductoProduManoBusqueda")) {
				this.jButtonid_tipo_proceso_empresa_produProductoProduManoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadProductoProduManoUpdate")) {
				this.jButtonid_unidadProductoProduManoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadProductoProduManoBusqueda")) {
				this.jButtonid_unidadProductoProduManoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadProductoProduManoBusqueda")) {
				this.jButtoncantidadProductoProduManoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoProductoProduManoBusqueda")) {
				this.jButtoncostoProductoProduManoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_totalProductoProduManoBusqueda")) {
				this.jButtoncosto_totalProductoProduManoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionProductoProduManoBusqueda")) {
				this.jButtondescripcionProductoProduManoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdProductoDefiProduProductoProduMano")) {
				this.jButtonFK_IdProductoDefiProduProductoProduManoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoManoProduEmpresaProductoProduMano")) {
				this.jButtonFK_IdTipoManoProduEmpresaProductoProduManoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoProcesoEmpresaProduProductoProduMano")) {
				this.jButtonFK_IdTipoProcesoEmpresaProduProductoProduManoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdUnidadProductoProduMano")) {
				this.jButtonFK_IdUnidadProductoProduManoActionPerformed(evt);
			}
			
			;
			
			
			ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProductoProduMano();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProduManoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumano);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodumano);
				
				ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
				
				


				
				ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProduMano.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduMano.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProductoProduMano productoprodumanoLocal=null;
			
			if(!this.getEsControlTabla()) {
				productoprodumanoLocal=this.productoprodumano;
			} else {
				productoprodumanoLocal=this.productoprodumanoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumano);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodumano);
				
				ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
							
				
				


				
				ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProduMano.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduMano.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProduManoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoProduMano.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoAnterior =(ProductoProduMano) this.productoprodumanoLogic.getProductoProduManos().toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoprodumanoAnterior =(ProductoProduMano) this.productoprodumanos.toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
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
			
			ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
			
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
			
			


			
			ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProduManoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumano);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodumano);
				
				ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
								
						
				


				
				ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProduMano.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduMano.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumano);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodumano);
				
				ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
								
				
				


				
				ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProduMano.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduMano.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProduManoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoProduMano.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoAnterior =(ProductoProduMano) this.productoprodumanoLogic.getProductoProduManos().toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoprodumanoAnterior =(ProductoProduMano) this.productoprodumanos.toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumano);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodumano);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProduManoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoProduMano.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoAnterior =(ProductoProduMano) this.productoprodumanoLogic.getProductoProduManos().toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoprodumanoAnterior =(ProductoProduMano) this.productoprodumanos.toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProduManoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumano);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoprodumano);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumano);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodumano);
				
				ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
							
				
				


				
				ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProduMano.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduMano.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProduManoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductoProduMano.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodumanoAnterior =(ProductoProduMano) this.productoprodumanoLogic.getProductoProduManos().toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productoprodumanoAnterior =(ProductoProduMano) this.productoprodumanos.toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
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
			
			ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
			
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
			
			


			
			ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProduManoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumano);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoprodumano);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumano);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodumano);
				
				ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
								
				
				


				
				ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProduMano.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduMano.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProduManoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoProduMano.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoAnterior =(ProductoProduMano) this.productoprodumanoLogic.getProductoProduManos().toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoprodumanoAnterior =(ProductoProduMano) this.productoprodumanos.toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProduManoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumano);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoprodumano);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProduManoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumano);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodumano);
				
				ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProductoProduMano")) {
					jCheckBoxSeleccionarTodosProductoProduManoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProductoProduMano")) {
					jCheckBoxSeleccionadosProductoProduManoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProductoProduMano")) {
					
				}
				
				


				
				
				ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProduMano.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduMano.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumano);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.productoprodumano);
				
				ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
												
				
				


				
				
				ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProduMano.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduMano.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProduManoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductoProduMano.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodumanoAnterior =(ProductoProduMano) this.productoprodumanoLogic.getProductoProduManos().toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productoprodumanoAnterior =(ProductoProduMano) this.productoprodumanos.toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProduManoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumano);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodumano);
				
				ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
				
				
				ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
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
			
			ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
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
			
			


			
			ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProduManoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumano);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodumano);
				
				ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProduMano.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduMano.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumano);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodumano);
				
				ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
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
				
				


				
				ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProduMano.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduMano.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProduManoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoProduMano.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumanoAnterior =(ProductoProduMano) this.productoprodumanoLogic.getProductoProduManos().toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoprodumanoAnterior =(ProductoProduMano) this.productoprodumanos.toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProductoProduMano")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProductoProduManoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProductoProduMano.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.productoprodumano =(ProductoProduMano) this.productoprodumanoLogic.getProductoProduManos().toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.productoprodumano =(ProductoProduMano) this.productoprodumanos.toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.productoprodumano);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProductoProduMano")) {
				
				}
				
				ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProductoProduMano")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProductoProduMano.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProductoProduMano")) {
			
			}
			
			ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProductoProduMano();
			
			ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
			
			if(sTipo.equals("NuevoProductoProduMano")) {
				jButtonNuevoProductoProduManoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProductoProduMano")) {
				jButtonDuplicarProductoProduManoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProductoProduMano")) {
				jButtonCopiarProductoProduManoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProductoProduMano")) {
				jButtonVerFormProductoProduManoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProductoProduMano")) {
				jButtonNuevoProductoProduManoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProductoProduMano")) {
				jButtonModificarProductoProduManoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProductoProduMano")) {
				jButtonActualizarProductoProduManoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProductoProduMano")) {
				jButtonEliminarProductoProduManoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProductoProduMano")) {
				jButtonGuardarCambiosProductoProduManoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProductoProduMano")) {
				jButtonCancelarProductoProduManoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProductoProduMano")) {
				jButtonCerrarProductoProduManoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProductoProduMano")) {
				jButtonGuardarCambiosProductoProduManoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProductoProduMano")) {
				jButtonNuevoGuardarCambiosProductoProduManoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProductoProduMano")) {
				jButtonAbrirOrderByProductoProduManoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProductoProduMano")) {
				jButtonRecargarInformacionProductoProduManoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProductoProduMano")) {
				jButtonAnterioresProductoProduManoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProductoProduMano")) {
				jButtonSiguientesProductoProduManoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductoProduManoBusqueda")) {
				this.jButtonidProductoProduManoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_producto_defi_produProductoProduManoUpdate")) {
				this.jButtonid_producto_defi_produProductoProduManoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_producto_defi_produProductoProduManoBusqueda")) {
				this.jButtonid_producto_defi_produProductoProduManoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_mano_produ_empresaProductoProduManoUpdate")) {
				this.jButtonid_tipo_mano_produ_empresaProductoProduManoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_mano_produ_empresaProductoProduManoBusqueda")) {
				this.jButtonid_tipo_mano_produ_empresaProductoProduManoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_proceso_empresa_produProductoProduManoUpdate")) {
				this.jButtonid_tipo_proceso_empresa_produProductoProduManoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_proceso_empresa_produProductoProduManoBusqueda")) {
				this.jButtonid_tipo_proceso_empresa_produProductoProduManoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadProductoProduManoUpdate")) {
				this.jButtonid_unidadProductoProduManoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadProductoProduManoBusqueda")) {
				this.jButtonid_unidadProductoProduManoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadProductoProduManoBusqueda")) {
				this.jButtoncantidadProductoProduManoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoProductoProduManoBusqueda")) {
				this.jButtoncostoProductoProduManoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_totalProductoProduManoBusqueda")) {
				this.jButtoncosto_totalProductoProduManoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionProductoProduManoBusqueda")) {
				this.jButtondescripcionProductoProduManoBusquedaActionPerformed(evt);
			}
			
			ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProductoProduMano();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProductoProduMano")) {
				closingInternalFrameProductoProduMano();
				
			} else if(sTipo.equals("jButtonCancelarProductoProduMano")) {
				JInternalFrameBase jInternalFrameDetalleFormProductoProduMano = (JInternalFrameBase)evt.getSource();
	            	
	            ProductoProduManoBeanSwingJInternalFrame jInternalFrameParent=(ProductoProduManoBeanSwingJInternalFrame)jInternalFrameDetalleFormProductoProduMano.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProductoProduManoActionPerformed(null);
			}
			
			ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productoprodumano,new Object(),this.productoprodumanoParameterGeneral,this.productoprodumanoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProductoProduMano(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProductoProduMano(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProductoProduMano(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.productoprodumano)) {
			if(!esControlTabla) {
				if(ProductoProduManoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProductoProduMano(this.productoprodumano,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMano(this.productoprodumano);			
				}
				
				if(this.productoprodumanoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProductoProduMano(this.productoprodumano,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.productoprodumanoReturnGeneral=productoprodumanoLogic.procesarEventosProductoProduManosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoprodumanoLogic.getProductoProduManos(),this.productoprodumano,this.productoprodumanoParameterGeneral,this.isEsNuevoProductoProduMano,classes);//this.productoprodumanoLogic.getProductoProduMano()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProductoProduMano(this.productoprodumanoReturnGeneral,this.productoprodumanoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.productoprodumanoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProductoProduMano(classes,this.productoprodumanoReturnGeneral,this.productoprodumanoBean,false);
					}
						
					if(this.productoprodumanoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProductoProduMano(this.productoprodumanoReturnGeneral.getProductoProduMano());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProductoProduMano(this.productoprodumanoReturnGeneral.getProductoProduMano());	
					}
						
					if(this.productoprodumanoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProductoProduMano(this.productoprodumanoReturnGeneral.getProductoProduMano(),classes);//this.productoprodumanoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProductoProduMano(this.productoprodumano,classes);//this.productoprodumanoBean);									
				}
			
				if(ProductoProduManoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProductoProduMano(this.productoprodumano,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMano(this.productoprodumano);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.productoprodumanoAnterior!=null) {
						this.productoprodumano=this.productoprodumanoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.productoprodumanoReturnGeneral=productoprodumanoLogic.procesarEventosProductoProduManosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoprodumanoLogic.getProductoProduManos(),this.productoprodumano,this.productoprodumanoParameterGeneral,this.isEsNuevoProductoProduMano,classes);//this.productoprodumanoLogic.getProductoProduMano()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productoprodumanoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productoprodumanoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.productoprodumanoReturnGeneral.getProductoProduMano(),productoprodumanoLogic.getProductoProduManos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.productoprodumanoReturnGeneral.getProductoProduMano(),this.productoprodumanos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProductoProduMano.repaint();
				
				//((AbstractTableModel) this.jTableDatosProductoProduMano.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProductoProduMano();
			}
		}
	}
	
	public void actualizarVisualTableDatosProductoProduMano() throws Exception {
		
		ProductoProduManoModel productoprodumanoModel=(ProductoProduManoModel)this.jTableDatosProductoProduMano.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoprodumanoModel.productoprodumanos=this.productoprodumanoLogic.getProductoProduManos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			productoprodumanoModel.productoprodumanos=this.productoprodumanos;
		}
		
		
		((ProductoProduManoModel) this.jTableDatosProductoProduMano.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProductoProduMano() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getproductoprodumanoAnterior(),this.productoprodumanoLogic.getProductoProduManos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getproductoprodumanoAnterior(),this.productoprodumanos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProductoProduMano();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProductoProduMano(ProductoProduMano productoprodumano,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
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
										
				ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoprodumano,new Object(),generalEntityParameterGeneral,this.productoprodumanoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.productoprodumanoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProductoProduManoConstantesFunciones.getClassesRelationshipsOfProductoProduMano(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProductoProduManoConstantesFunciones.getClassesRelationshipsFromStringsOfProductoProduMano(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProductoProduMano(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProductoProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoprodumano,new Object(),generalEntityParameterGeneral,this.productoprodumanoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProductoProduMano(ProductoProduManoBean productoprodumanoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProductoProduMano(ArrayList<Classe> classes,ProductoProduManoReturnGeneral productoprodumanoReturnGeneral,ProductoProduManoBean productoprodumanoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProductoProduMano(ProductoProduMano productoprodumano,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.productoprodumano)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProductoProduMano = new ProductoProduManoDetalleFormJInternalFrame(jDesktopPane,this.productoprodumanoSessionBean.getConGuardarRelaciones(),this.productoprodumanoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProductoProduMano);
		this.jInternalFrameDetalleFormProductoProduMano.setVisible(false);
		this.jInternalFrameDetalleFormProductoProduMano.setSelected(false);						
		
		this.jInternalFrameDetalleFormProductoProduMano.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProductoProduMano.productoprodumanoLogic=this.productoprodumanoLogic;
		
		this.cargarCombosFrameForeignKeyProductoProduMano("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProductoProduMano();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductoProduMano();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProductoProduMano("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProductoProduMano();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProductoProduMano.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductoProduMano"));
		
		this.jInternalFrameDetalleFormProductoProduMano.jButtonModificarProductoProduMano.addActionListener(new ButtonActionListener(this,"ModificarProductoProduMano"));

		
		this.jInternalFrameDetalleFormProductoProduMano.jButtonModificarToolBarProductoProduMano.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductoProduMano"));
					
		this.jInternalFrameDetalleFormProductoProduMano.jMenuItemModificarProductoProduMano.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductoProduMano"));		
		
		
		
		this.jInternalFrameDetalleFormProductoProduMano.jButtonActualizarProductoProduMano.addActionListener (new ButtonActionListener(this,"ActualizarProductoProduMano"));
		
		
		this.jInternalFrameDetalleFormProductoProduMano.jButtonActualizarToolBarProductoProduMano.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductoProduMano"));
						
		this.jInternalFrameDetalleFormProductoProduMano.jMenuItemActualizarProductoProduMano.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductoProduMano"));		
		
		
		
		this.jInternalFrameDetalleFormProductoProduMano.jButtonEliminarProductoProduMano.addActionListener (new ButtonActionListener(this,"EliminarProductoProduMano"));
		
		
		this.jInternalFrameDetalleFormProductoProduMano.jButtonEliminarToolBarProductoProduMano.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductoProduMano"));
								
		this.jInternalFrameDetalleFormProductoProduMano.jMenuItemEliminarProductoProduMano.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductoProduMano"));		
		
		
		
		this.jInternalFrameDetalleFormProductoProduMano.jButtonCancelarProductoProduMano.addActionListener (new ButtonActionListener(this,"CancelarProductoProduMano"));
		
		
		this.jInternalFrameDetalleFormProductoProduMano.jButtonCancelarToolBarProductoProduMano.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductoProduMano"));
					
		this.jInternalFrameDetalleFormProductoProduMano.jMenuItemCancelarProductoProduMano.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductoProduMano"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProductoProduMano.jMenuItemDetalleCerrarProductoProduMano.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductoProduMano"));		
		
		
		
		this.jInternalFrameDetalleFormProductoProduMano.jButtonGuardarCambiosToolBarProductoProduMano.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoProduMano"));
		
		
		
		this.jInternalFrameDetalleFormProductoProduMano.jButtonGuardarCambiosToolBarProductoProduMano.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoProduMano"));
		
		
		
		this.jInternalFrameDetalleFormProductoProduMano.jComboBoxTiposAccionesFormularioProductoProduMano.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductoProduMano"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMano.jButtonidProductoProduManoBusqueda.addActionListener(new ButtonActionListener(this,"idProductoProduManoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduMano.jButtonid_producto_defi_produProductoProduManoUpdate.addActionListener(new ButtonActionListener(this,"id_producto_defi_produProductoProduManoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMano.jButtonid_producto_defi_produProductoProduManoBusqueda.addActionListener(new ButtonActionListener(this,"id_producto_defi_produProductoProduManoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduMano.jButtonid_tipo_mano_produ_empresaProductoProduManoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_mano_produ_empresaProductoProduManoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMano.jButtonid_tipo_mano_produ_empresaProductoProduManoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_mano_produ_empresaProductoProduManoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduMano.jButtonid_tipo_proceso_empresa_produProductoProduManoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_proceso_empresa_produProductoProduManoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMano.jButtonid_tipo_proceso_empresa_produProductoProduManoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_proceso_empresa_produProductoProduManoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduMano.jButtonid_unidadProductoProduManoUpdate.addActionListener(new ButtonActionListener(this,"id_unidadProductoProduManoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMano.jButtonid_unidadProductoProduManoBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadProductoProduManoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMano.jButtoncantidadProductoProduManoBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductoProduManoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMano.jButtoncostoProductoProduManoBusqueda.addActionListener(new ButtonActionListener(this,"costoProductoProduManoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMano.jButtoncosto_totalProductoProduManoBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalProductoProduManoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMano.jButtondescripcionProductoProduManoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProductoProduManoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProductoProduMano.jTabbedPaneRelacionesProductoProduMano.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductoProduMano"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProductoProduMano"));
		
		if(this.jInternalFrameDetalleFormProductoProduMano!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMano.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductoProduMano"));
		}
		
		this.jTableDatosProductoProduMano.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProductoProduMano"));
		
		this.jTableDatosProductoProduMano.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProductoProduMano"));
		
		this.jButtonNuevoProductoProduMano.addActionListener(new ButtonActionListener(this,"NuevoProductoProduMano"));
		
		this.jButtonDuplicarProductoProduMano.addActionListener(new ButtonActionListener(this,"DuplicarProductoProduMano"));
		
		this.jButtonCopiarProductoProduMano.addActionListener(new ButtonActionListener(this,"CopiarProductoProduMano"));
		
		this.jButtonVerFormProductoProduMano.addActionListener(new ButtonActionListener(this,"VerFormProductoProduMano"));
		
		
		this.jButtonNuevoToolBarProductoProduMano.addActionListener(new ButtonActionListener(this,"NuevoToolBarProductoProduMano"));
			
		this.jButtonDuplicarToolBarProductoProduMano.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProductoProduMano"));
			
		this.jMenuItemNuevoProductoProduMano.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProductoProduMano"));
			
		this.jMenuItemDuplicarProductoProduMano.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProductoProduMano"));		
		
		
		this.jButtonNuevoRelacionesProductoProduMano.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProductoProduMano"));
		
		
		this.jButtonNuevoRelacionesToolBarProductoProduMano.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProductoProduMano"));
			
		this.jMenuItemNuevoRelacionesProductoProduMano.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProductoProduMano"));		
		
		
		if(this.jInternalFrameDetalleFormProductoProduMano!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMano.jButtonModificarProductoProduMano.addActionListener(new ButtonActionListener(this,"ModificarProductoProduMano"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProduMano!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMano.jButtonModificarToolBarProductoProduMano.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductoProduMano"));
			
			this.jInternalFrameDetalleFormProductoProduMano.jMenuItemModificarProductoProduMano.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductoProduMano"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProduMano!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProductoProduMano.jButtonActualizarProductoProduMano.addActionListener (new ButtonActionListener(this,"ActualizarProductoProduMano"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProduMano!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMano.jButtonActualizarToolBarProductoProduMano.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductoProduMano"));
				
			this.jInternalFrameDetalleFormProductoProduMano.jMenuItemActualizarProductoProduMano.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductoProduMano"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProduMano!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMano.jButtonEliminarProductoProduMano.addActionListener (new ButtonActionListener(this,"EliminarProductoProduMano"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProduMano!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMano.jButtonEliminarToolBarProductoProduMano.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductoProduMano"));
						
			this.jInternalFrameDetalleFormProductoProduMano.jMenuItemEliminarProductoProduMano.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductoProduMano"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProduMano!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMano.jButtonCancelarProductoProduMano.addActionListener (new ButtonActionListener(this,"CancelarProductoProduMano"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProduMano!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMano.jButtonCancelarToolBarProductoProduMano.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductoProduMano"));
			
			this.jInternalFrameDetalleFormProductoProduMano.jMenuItemCancelarProductoProduMano.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductoProduMano"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProductoProduMano.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProductoProduMano"));		
		
		
		this.jButtonCerrarProductoProduMano.addActionListener (new ButtonActionListener(this,"CerrarProductoProduMano"));
		
		
		this.jButtonCerrarToolBarProductoProduMano.addActionListener (new ButtonActionListener(this,"CerrarToolBarProductoProduMano"));
			
		this.jMenuItemCerrarProductoProduMano.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProductoProduMano"));
			
		if(this.jInternalFrameDetalleFormProductoProduMano!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMano.jMenuItemDetalleCerrarProductoProduMano.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductoProduMano"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProduMano!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMano.jButtonGuardarCambiosProductoProduMano.addActionListener (new ButtonActionListener(this,"GuardarCambiosProductoProduMano"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProduMano!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMano.jButtonGuardarCambiosToolBarProductoProduMano.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoProduMano"));
		}
		
		this.jButtonCopiarToolBarProductoProduMano.addActionListener (new ButtonActionListener(this,"CopiarToolBarProductoProduMano"));
			
		this.jButtonVerFormToolBarProductoProduMano.addActionListener (new ButtonActionListener(this,"VerFormToolBarProductoProduMano"));
		
		this.jMenuItemGuardarCambiosProductoProduMano.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProductoProduMano"));
			
		this.jMenuItemCopiarProductoProduMano.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProductoProduMano"));		
		
		this.jMenuItemVerFormProductoProduMano.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProductoProduMano"));		
		
		
		this.jButtonGuardarCambiosTablaProductoProduMano.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductoProduMano"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProductoProduMano.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProductoProduMano"));
			
		this.jMenuItemGuardarCambiosTablaProductoProduMano.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductoProduMano"));		
		
		
		
		this.jButtonRecargarInformacionProductoProduMano.addActionListener (new ButtonActionListener(this,"RecargarInformacionProductoProduMano"));
					
		this.jButtonRecargarInformacionToolBarProductoProduMano.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProductoProduMano"));
		
		this.jMenuItemRecargarInformacionProductoProduMano.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProductoProduMano"));		
		
		
		
		this.jButtonAnterioresProductoProduMano.addActionListener (new ButtonActionListener(this,"AnterioresProductoProduMano"));
		
		
		this.jButtonAnterioresToolBarProductoProduMano.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProductoProduMano"));
		
		this.jMenuItemAnterioresProductoProduMano.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProductoProduMano"));		
		
		
		this.jButtonSiguientesProductoProduMano.addActionListener (new ButtonActionListener(this,"SiguientesProductoProduMano"));
		
		
		this.jButtonSiguientesToolBarProductoProduMano.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProductoProduMano"));
			
		this.jMenuItemSiguientesProductoProduMano.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProductoProduMano"));
			
		this.jMenuItemAbrirOrderByProductoProduMano.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProductoProduMano"));
			
		this.jMenuItemMostrarOcultarProductoProduMano.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProductoProduMano"));
			
		this.jMenuItemDetalleAbrirOrderByProductoProduMano.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProductoProduMano"));
			
		this.jMenuItemDetalleMostarOcultarProductoProduMano.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProductoProduMano"));		
		
		
		this.jButtonNuevoGuardarCambiosProductoProduMano.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProductoProduMano"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductoProduMano.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProductoProduMano"));
			
		this.jMenuItemNuevoGuardarCambiosProductoProduMano.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProductoProduMano"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProductoProduMano.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProductoProduMano"));

		this.jCheckBoxSeleccionadosProductoProduMano.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProductoProduMano"));
		
		if(this.jInternalFrameDetalleFormProductoProduMano!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMano.jComboBoxTiposAccionesFormularioProductoProduMano.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductoProduMano"));
		}
		
		
		this.jComboBoxTiposRelacionesProductoProduMano.addActionListener (new ButtonActionListener(this,"TiposRelacionesProductoProduMano"));
			
		this.jComboBoxTiposAccionesProductoProduMano.addActionListener (new ButtonActionListener(this,"TiposAccionesProductoProduMano"));
					
		this.jComboBoxTiposSeleccionarProductoProduMano.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProductoProduMano"));
			
		this.jTextFieldValorCampoGeneralProductoProduMano.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProductoProduMano"));		
		
		
		if(this.jInternalFrameDetalleFormProductoProduMano!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMano.jButtonidProductoProduManoBusqueda.addActionListener(new ButtonActionListener(this,"idProductoProduManoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduMano.jButtonid_producto_defi_produProductoProduManoUpdate.addActionListener(new ButtonActionListener(this,"id_producto_defi_produProductoProduManoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMano.jButtonid_producto_defi_produProductoProduManoBusqueda.addActionListener(new ButtonActionListener(this,"id_producto_defi_produProductoProduManoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduMano.jButtonid_tipo_mano_produ_empresaProductoProduManoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_mano_produ_empresaProductoProduManoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMano.jButtonid_tipo_mano_produ_empresaProductoProduManoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_mano_produ_empresaProductoProduManoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduMano.jButtonid_tipo_proceso_empresa_produProductoProduManoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_proceso_empresa_produProductoProduManoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMano.jButtonid_tipo_proceso_empresa_produProductoProduManoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_proceso_empresa_produProductoProduManoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduMano.jButtonid_unidadProductoProduManoUpdate.addActionListener(new ButtonActionListener(this,"id_unidadProductoProduManoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMano.jButtonid_unidadProductoProduManoBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadProductoProduManoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMano.jButtoncantidadProductoProduManoBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductoProduManoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMano.jButtoncostoProductoProduManoBusqueda.addActionListener(new ButtonActionListener(this,"costoProductoProduManoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMano.jButtoncosto_totalProductoProduManoBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalProductoProduManoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMano.jButtondescripcionProductoProduManoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProductoProduManoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdProductoDefiProduProductoProduMano.addActionListener(new ButtonActionListener(this,"FK_IdProductoDefiProduProductoProduMano"));

			this.jButtonFK_IdTipoManoProduEmpresaProductoProduMano.addActionListener(new ButtonActionListener(this,"FK_IdTipoManoProduEmpresaProductoProduMano"));

			this.jButtonFK_IdTipoProcesoEmpresaProduProductoProduMano.addActionListener(new ButtonActionListener(this,"FK_IdTipoProcesoEmpresaProduProductoProduMano"));

			this.jButtonFK_IdUnidadProductoProduMano.addActionListener(new ButtonActionListener(this,"FK_IdUnidadProductoProduMano"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProductoProduMano!=null) {
				this.jInternalFrameReporteDinamicoProductoProduMano.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoProduMano"));
				this.jInternalFrameReporteDinamicoProductoProduMano.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoProduMano"));
				this.jInternalFrameReporteDinamicoProductoProduMano.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoProduMano"));
			}
			
			//this.jButtonCerrarReporteDinamicoProductoProduMano.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoProduMano"));				
			//this.jButtonGenerarReporteDinamicoProductoProduMano.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoProduMano"));
			//this.jButtonGenerarExcelReporteDinamicoProductoProduMano.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoProduMano"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProductoProduMano!=null) {
				this.jInternalFrameImportacionProductoProduMano.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductoProduMano"));
				this.jInternalFrameImportacionProductoProduMano.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductoProduMano"));
				this.jInternalFrameImportacionProductoProduMano.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductoProduMano"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProductoProduMano.addActionListener (new ButtonActionListener(this,"AbrirOrderByProductoProduMano"));
			
			this.jButtonAbrirOrderByToolBarProductoProduMano.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProductoProduMano"));			
			
			if(this.jInternalFrameOrderByProductoProduMano!=null) {
				this.jInternalFrameOrderByProductoProduMano.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductoProduMano"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProductoProduMano!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProductoProduMano!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMano.jTabbedPaneRelacionesProductoProduMano.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductoProduMano"));
		
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
            		closingInternalFrameProductoProduMano();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProductoProduMano.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProductoProduMano = (JInternalFrameBase)event.getSource();
	            	
	            ProductoProduManoBeanSwingJInternalFrame jInternalFrameParent=(ProductoProduManoBeanSwingJInternalFrame)jInternalFrameDetalleFormProductoProduMano.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProductoProduManoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProductoProduMano.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProductoProduManoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProductoProduMano.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProductoProduMano.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoProduManoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoProduManoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoProduManoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProductoProduMano";
		inputMap = this.jButtonNuevoProductoProduMano.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProductoProduMano.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductoProduManoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoProduManoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoProduManoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoProduManoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProductoProduMano";
		inputMap = this.jButtonNuevoRelacionesProductoProduMano.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProductoProduMano.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductoProduManoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProductoProduMano";
		inputMap = this.jButtonModificarProductoProduMano.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProductoProduMano.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProductoProduManoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProductoProduMano";
		inputMap = this.jButtonActualizarProductoProduMano.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProductoProduMano.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProductoProduManoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProductoProduMano";
		inputMap = this.jButtonEliminarProductoProduMano.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProductoProduMano.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProductoProduManoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProductoProduMano";
		inputMap = this.jButtonCancelarProductoProduMano.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProductoProduMano.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProductoProduManoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProductoProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProductoProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProductoProduMano";
		inputMap = this.jButtonCerrarProductoProduMano.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProductoProduMano.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProductoProduManoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProductoProduMano.jButtonGuardarCambiosProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProductoProduMano";
		inputMap = this.jInternalFrameDetalleFormProductoProduMano.jButtonGuardarCambiosProductoProduMano.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProductoProduMano.jButtonGuardarCambiosProductoProduMano.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProductoProduManoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProductoProduMano.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProductoProduManoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProductoProduMano.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProductoProduManoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProductoProduMano.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProductoProduManoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProductoProduMano.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProductoProduManoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMano.jButtonidProductoProduManoBusqueda.addActionListener(new ButtonActionListener(this,"idProductoProduManoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduMano.jButtonid_producto_defi_produProductoProduManoUpdate.addActionListener(new ButtonActionListener(this,"id_producto_defi_produProductoProduManoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMano.jButtonid_producto_defi_produProductoProduManoBusqueda.addActionListener(new ButtonActionListener(this,"id_producto_defi_produProductoProduManoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduMano.jButtonid_tipo_mano_produ_empresaProductoProduManoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_mano_produ_empresaProductoProduManoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMano.jButtonid_tipo_mano_produ_empresaProductoProduManoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_mano_produ_empresaProductoProduManoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduMano.jButtonid_tipo_proceso_empresa_produProductoProduManoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_proceso_empresa_produProductoProduManoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMano.jButtonid_tipo_proceso_empresa_produProductoProduManoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_proceso_empresa_produProductoProduManoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduMano.jButtonid_unidadProductoProduManoUpdate.addActionListener(new ButtonActionListener(this,"id_unidadProductoProduManoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMano.jButtonid_unidadProductoProduManoBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadProductoProduManoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMano.jButtoncantidadProductoProduManoBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductoProduManoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMano.jButtoncostoProductoProduManoBusqueda.addActionListener(new ButtonActionListener(this,"costoProductoProduManoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMano.jButtoncosto_totalProductoProduManoBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalProductoProduManoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMano.jButtondescripcionProductoProduManoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProductoProduManoBusqueda"));
		
		
		this.jButtonFK_IdProductoDefiProduProductoProduMano.addActionListener(new ButtonActionListener(this,"FK_IdProductoDefiProduProductoProduMano"));

		this.jButtonFK_IdTipoManoProduEmpresaProductoProduMano.addActionListener(new ButtonActionListener(this,"FK_IdTipoManoProduEmpresaProductoProduMano"));

		this.jButtonFK_IdTipoProcesoEmpresaProduProductoProduMano.addActionListener(new ButtonActionListener(this,"FK_IdTipoProcesoEmpresaProduProductoProduMano"));

		this.jButtonFK_IdUnidadProductoProduMano.addActionListener(new ButtonActionListener(this,"FK_IdUnidadProductoProduMano"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProductoProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProductoProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProductoProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProductoProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProductoProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProductoProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProductoProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProductoProduManoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProductoProduMano.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProductoProduMano(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProductoProduMano productoprodumanoAux:this.productoprodumanoLogic.getProductoProduManos()) {
					productoprodumanoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoProduMano productoprodumanoAux:productoprodumanos) {
					productoprodumanoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProductoProduManoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductoProduMano(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductoProduMano productoprodumanoAux:this.productoprodumanoLogic.getProductoProduManos()) {
						productoprodumanoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoProduMano productoprodumanoAux:productoprodumanos) {
						productoprodumanoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProductoProduMano productoprodumanoAux:this.productoprodumanoLogic.getProductoProduManos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoProduMano productoprodumanoAux:productoprodumanos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProductoProduMano(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductoProduMano.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductoProduMano.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMano,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProductoProduManoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductoProduMano(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProductoProduMano.getSelectedRows();
			
			ProductoProduMano productoprodumanoLocal=new ProductoProduMano();
			
			//this.seleccionarTodosProductoProduMano(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoprodumanoLocal =(ProductoProduMano) this.productoprodumanoLogic.getProductoProduManos().toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					productoprodumanoLocal =(ProductoProduMano) this.productoprodumanos.toArray()[this.jTableDatosProductoProduMano.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				productoprodumanoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductoProduMano productoprodumanoAux:this.productoprodumanoLogic.getProductoProduManos()) {
						productoprodumanoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoProduMano productoprodumanoAux:productoprodumanos) {
						productoprodumanoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProductoProduMano(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductoProduMano.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductoProduMano.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMano,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProductoProduManoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProductoProduManoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProductoProduManoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProductoProduMano(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProductoProduMano.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductoProduMano productoprodumanoAux:this.productoprodumanoLogic.getProductoProduManos()) {
				
						if(sTipoSeleccionar.equals(ProductoProduManoConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							productoprodumanoAux.setcantidad(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoProduManoConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							productoprodumanoAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoProduManoConstantesFunciones.LABEL_COSTOTOTAL)) {
							existe=true;
							productoprodumanoAux.setcosto_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoProduManoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							productoprodumanoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoProduMano productoprodumanoAux:productoprodumanos) {
					
						if(sTipoSeleccionar.equals(ProductoProduManoConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							productoprodumanoAux.setcantidad(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoProduManoConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							productoprodumanoAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoProduManoConstantesFunciones.LABEL_COSTOTOTAL)) {
							existe=true;
							productoprodumanoAux.setcosto_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoProduManoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							productoprodumanoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProductoProduMano(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProductoProduManoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProductoProduMano(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProductoProduMano=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProductoProduMano.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProductoProduMano.jComboBoxTiposAccionesFormularioProductoProduMano.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProductoProduMano) {				
					conSplash=true;//false;										
					
					//this.startProcessProductoProduMano(conSplash);
				
					this.generarReporteProductoProduManosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoProduMano.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoProduMano.jComboBoxTiposAccionesFormularioProductoProduMano.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProductoProduManosSeleccionados();
				//this.jComboBoxTiposAccionesProductoProduMano.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductoProduManosSeleccionados(false);
				//this.jComboBoxTiposAccionesProductoProduMano.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductoProduManosSeleccionados(true);
				//this.jComboBoxTiposAccionesProductoProduMano.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductoProduMano();
				
				this.exportarProductoProduManosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoProduMano.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoProduMano.jComboBoxTiposAccionesFormularioProductoProduMano.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProductoProduManos();
				//this.importarProductoProduManos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoProduMano.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoProduMano.jComboBoxTiposAccionesFormularioProductoProduMano.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductoProduMano();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProductoProduManosSeleccionados();
				//this.jComboBoxTiposAccionesProductoProduMano.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Producto Mano De Obra Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProductoProduMano();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProductoProduMano)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProductoProduMano(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Producto Mano De Obra Produccion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoProduMano.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoProduMano.jComboBoxTiposAccionesFormularioProductoProduMano.setSelectedIndex(0);					
				}	
			} 			
			else if(ProductoProduManoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProductoProduMano) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProductoProduMano(conSplash);
					
						//this.actualizarParametrosGeneralProductoProduMano();
						
						this.generarReporteProcesoAccionProductoProduManosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProductoProduMano.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProductoProduMano.jComboBoxTiposAccionesFormularioProductoProduMano.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProductoProduManoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Producto Mano De Obra ProduccionES SELECCIONADOS?", "MANTENIMIENTO DE Producto Mano De Obra Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProductoProduMano();
				
						this.actualizarParametrosGeneralProductoProduMano();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.productoprodumanoReturnGeneral=productoprodumanoLogic.procesarAccionProductoProduManosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.productoprodumanoLogic.getProductoProduManos(),this.productoprodumanoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProductoProduManoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductoProduMano.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductoProduMano.jComboBoxTiposAccionesFormularioProductoProduMano.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProductoProduMano();
					
					ProductoProduManoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProductoProduManoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductoProduMano.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductoProduMano.jComboBoxTiposAccionesFormularioProductoProduMano.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProductoProduMano(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProductoProduManoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProductoProduMano();
			
			if(this.jInternalFrameDetalleFormProductoProduMano==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProductoProduMano> productoprodumanosSeleccionados=new ArrayList<ProductoProduMano>();		
			ProductoProduMano productoprodumano=new ProductoProduMano();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProductoProduMano(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProductoProduMano.getSelectedItem();
			
			
			
			
			productoprodumanosSeleccionados=this.getProductoProduManosSeleccionados(true);
			//this.sTipoAccion;
			
			if(productoprodumanosSeleccionados.size()==1) {
				for(ProductoProduMano productoprodumanoAux:productoprodumanosSeleccionados) {
					productoprodumano=productoprodumanoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProductoProduMano();
			
      		//this.finishProcessProductoProduMano(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProductoProduManoReturnGeneral() throws Exception {
		if(this.productoprodumanoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.productoprodumanoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.productoprodumanoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.productoprodumanoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.productoprodumanoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.productoprodumanoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProductoProduMano(false);
		}
		
		if(this.productoprodumanoReturnGeneral.getConRetornoLista() || this.productoprodumanoReturnGeneral.getConRetornoObjeto()) {
			if(this.productoprodumanoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productoprodumanoLogic.setProductoProduManos(this.productoprodumanoReturnGeneral.getProductoProduManos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.productoprodumanoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productoprodumanoLogic.setProductoProduMano(this.productoprodumanoReturnGeneral.getProductoProduMano());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingProductoProduMano(false);
		}
	}
	
	public void actualizarParametrosGeneralProductoProduMano() throws Exception {
		
		
	}
	
	public ArrayList<ProductoProduMano> getProductoProduManosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProductoProduMano> productoprodumanosSeleccionados=new ArrayList<ProductoProduMano>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProductoProduMano) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProductoProduMano productoprodumanoAux:productoprodumanoLogic.getProductoProduManos()) {
					if(productoprodumanoAux.getIsSelected()) {
						productoprodumanosSeleccionados.add(productoprodumanoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoProduMano productoprodumanoAux:this.productoprodumanos) {
					if(productoprodumanoAux.getIsSelected()) {
						productoprodumanosSeleccionados.add(productoprodumanoAux);				
					}
				}
			}
			
			if(productoprodumanosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						productoprodumanosSeleccionados.addAll(this.productoprodumanoLogic.getProductoProduManos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						productoprodumanosSeleccionados.addAll(this.productoprodumanos);				
					}
				}
			}
		} else {
			productoprodumanosSeleccionados.add(this.productoprodumano);
		}
		
		return productoprodumanosSeleccionados;
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
	
	public void generarReporteProductoProduManosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProductoProduManosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProductoProduManosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductoProduManosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductoProduManosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Producto Mano De Obra Produccion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProductoProduManosSeleccionados() throws Exception {
		ArrayList<ProductoProduMano> productoprodumanosSeleccionados=new ArrayList<ProductoProduMano>();		
		
		productoprodumanosSeleccionados=this.getProductoProduManosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProductoProduManos("Todos",productoprodumanosSeleccionados);
		
	}	
	
	public void generarReporteNormalProductoProduManosSeleccionados() throws Exception {
		ArrayList<ProductoProduMano> productoprodumanosSeleccionados=new ArrayList<ProductoProduMano>();		
		
		productoprodumanosSeleccionados=this.getProductoProduManosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProductoProduManos("Todos",productoprodumanosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProductoProduManosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProductoProduMano> productoprodumanosSeleccionados=new ArrayList<ProductoProduMano>();
		
		productoprodumanosSeleccionados=this.getProductoProduManosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProductoProduManos("Todos",productoprodumanosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProductoProduManosSeleccionados() throws Exception {
		ArrayList<ProductoProduMano> productoprodumanosSeleccionados=new ArrayList<ProductoProduMano>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProductoProduMano();
		
		
		productoprodumanosSeleccionados=this.getProductoProduManosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProductoProduMano();
		
		
		//this.generarReporteProductoProduManos("Todos",productoprodumanosSeleccionados ,productoprodumanoImplementable,productoprodumanoImplementableHome);
	}
	
	public void mostrarImportacionProductoProduManos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProductoProduMano();
		
		this.abrirFrameImportacionProductoProduMano();		
		
			
		//this.generarReporteProductoProduManos("Todos",productoprodumanosSeleccionados ,productoprodumanoImplementable,productoprodumanoImplementableHome);
	}
	
	public void importarProductoProduManos() throws Exception {		
	
	}
	
	public void exportarProductoProduManosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProductoProduManosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProductoProduManosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProductoProduManosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Producto Mano De Obra Produccion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProductoProduManosSeleccionados() throws Exception {
		ArrayList<ProductoProduMano> productoprodumanosSeleccionados=new ArrayList<ProductoProduMano>();		
		
		productoprodumanosSeleccionados=this.getProductoProduManosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoprodumano."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProductoProduMano(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProductoProduMano productoprodumanoAux:productoprodumanosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProductoProduMano(productoprodumanoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//productoprodumanoAux.setsDetalleGeneralEntityReporte(productoprodumanoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Mano De Obra Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProductoProduMano(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProductoProduManoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduManoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduManoConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduManoConstantesFunciones.LABEL_IDTIPOMANOPRODUEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduManoConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduManoConstantesFunciones.LABEL_IDUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduManoConstantesFunciones.LABEL_CANTIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduManoConstantesFunciones.LABEL_COSTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduManoConstantesFunciones.LABEL_COSTOTOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduManoConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProductoProduMano(ProductoProduMano productoprodumano,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=productoprodumano.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodumano.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodumano.getproductodefiprodu_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodumano.gettipomanoproduempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodumano.gettipoprocesoempresaprodu_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodumano.getunidad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodumano.getcantidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodumano.getcosto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodumano.getcosto_total().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodumano.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProductoProduManosSeleccionados() throws Exception {
		ArrayList<ProductoProduMano> productoprodumanosSeleccionados=new ArrayList<ProductoProduMano>();		
		
		productoprodumanosSeleccionados=this.getProductoProduManosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoprodumano.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProductoProduManos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProductoProduMano(row);				
				iRow++;
			}				
			
			for(ProductoProduMano productoprodumanoAux:productoprodumanosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProductoProduMano(productoprodumanoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Mano De Obra Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProductoProduManosSeleccionados() throws Exception {
		ArrayList<ProductoProduMano> productoprodumanosSeleccionados=new ArrayList<ProductoProduMano>();		
		
		productoprodumanosSeleccionados=this.getProductoProduManosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoprodumano.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("productoprodumanos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("productoprodumano");
			//elementRoot.appendChild(element);
		
			for(ProductoProduMano productoprodumanoAux:productoprodumanosSeleccionados) {
				element = document.createElement("productoprodumano");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProductoProduMano(productoprodumanoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Mano De Obra Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProductoProduMano(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduManoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduManoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduManoConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduManoConstantesFunciones.LABEL_IDTIPOMANOPRODUEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduManoConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduManoConstantesFunciones.LABEL_IDUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduManoConstantesFunciones.LABEL_CANTIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduManoConstantesFunciones.LABEL_COSTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduManoConstantesFunciones.LABEL_COSTOTOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduManoConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProductoProduMano(ProductoProduMano productoprodumano,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodumano.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodumano.getproductodefiprodu_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodumano.gettipomanoproduempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodumano.gettipoprocesoempresaprodu_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodumano.getunidad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodumano.getcantidad());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodumano.getcosto());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodumano.getcosto_total());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodumano.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlProductoProduMano(ProductoProduMano productoprodumano,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProductoProduManoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(productoprodumano.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProductoProduManoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(productoprodumano.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementproductodefiprodu_descripcion = document.createElement(ProductoProduManoConstantesFunciones.IDPRODUCTODEFIPRODU);
		elementproductodefiprodu_descripcion.appendChild(document.createTextNode(productoprodumano.getproductodefiprodu_descripcion()));
		element.appendChild(elementproductodefiprodu_descripcion);

		Element elementtipomanoproduempresa_descripcion = document.createElement(ProductoProduManoConstantesFunciones.IDTIPOMANOPRODUEMPRESA);
		elementtipomanoproduempresa_descripcion.appendChild(document.createTextNode(productoprodumano.gettipomanoproduempresa_descripcion()));
		element.appendChild(elementtipomanoproduempresa_descripcion);

		Element elementtipoprocesoempresaprodu_descripcion = document.createElement(ProductoProduManoConstantesFunciones.IDTIPOPROCESOEMPRESAPRODU);
		elementtipoprocesoempresaprodu_descripcion.appendChild(document.createTextNode(productoprodumano.gettipoprocesoempresaprodu_descripcion()));
		element.appendChild(elementtipoprocesoempresaprodu_descripcion);

		Element elementunidad_descripcion = document.createElement(ProductoProduManoConstantesFunciones.IDUNIDAD);
		elementunidad_descripcion.appendChild(document.createTextNode(productoprodumano.getunidad_descripcion()));
		element.appendChild(elementunidad_descripcion);

		Element elementcantidad = document.createElement(ProductoProduManoConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(productoprodumano.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);

		Element elementcosto = document.createElement(ProductoProduManoConstantesFunciones.COSTO);
		elementcosto.appendChild(document.createTextNode(productoprodumano.getcosto().toString().trim()));
		element.appendChild(elementcosto);

		Element elementcosto_total = document.createElement(ProductoProduManoConstantesFunciones.COSTOTOTAL);
		elementcosto_total.appendChild(document.createTextNode(productoprodumano.getcosto_total().toString().trim()));
		element.appendChild(elementcosto_total);

		Element elementdescripcion = document.createElement(ProductoProduManoConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(productoprodumano.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoProductoProduManosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProductoProduMano> productoprodumanosSeleccionados=new ArrayList<ProductoProduMano>();
		
		productoprodumanosSeleccionados=this.getProductoProduManosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProductoProduMano(productoprodumanosSeleccionados);
		
		this.generarReporteProductoProduManos("Todos",productoprodumanosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProductoProduMano(ArrayList<ProductoProduMano> productoprodumanosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProductoProduMano productoprodumanoAux:productoprodumanosSeleccionados) {
				productoprodumanoAux.setsDetalleGeneralEntityReporte(productoprodumanoAux.toString());
			
				if(sTipoSeleccionar.equals(ProductoProduManoConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU)) {
					existe=true;
					productoprodumanoAux.setsDescripcionGeneralEntityReporte1(productoprodumanoAux.getproductodefiprodu_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoProduManoConstantesFunciones.LABEL_IDTIPOMANOPRODUEMPRESA)) {
					existe=true;
					productoprodumanoAux.setsDescripcionGeneralEntityReporte1(productoprodumanoAux.gettipomanoproduempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoProduManoConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU)) {
					existe=true;
					productoprodumanoAux.setsDescripcionGeneralEntityReporte1(productoprodumanoAux.gettipoprocesoempresaprodu_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoProduManoConstantesFunciones.LABEL_IDUNIDAD)) {
					existe=true;
					productoprodumanoAux.setsDescripcionGeneralEntityReporte1(productoprodumanoAux.getunidad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoProduManoConstantesFunciones.LABEL_CANTIDAD)) {
					existe=true;
					productoprodumanoAux.setsDescripcionGeneralEntityReporte1(productoprodumanoAux.getcantidad().toString());
				}
				 else if(sTipoSeleccionar.equals(ProductoProduManoConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					productoprodumanoAux.setsDescripcionGeneralEntityReporte1(productoprodumanoAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProductoProduMano(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProductoProduMano=true;
				this.isVisibilidadCeldaNuevoRelacionesProductoProduMano=true;
				this.isVisibilidadCeldaGuardarCambiosProductoProduMano=true;
			}
			
			this.isVisibilidadCeldaModificarProductoProduMano=false;
			this.isVisibilidadCeldaActualizarProductoProduMano=false;
			this.isVisibilidadCeldaEliminarProductoProduMano=false;
			this.isVisibilidadCeldaCancelarProductoProduMano=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProduMano=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoProduMano=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProductoProduMano=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoProduMano=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProduMano=false;
			this.isVisibilidadCeldaModificarProductoProduMano=false;
			this.isVisibilidadCeldaActualizarProductoProduMano=true;
			this.isVisibilidadCeldaEliminarProductoProduMano=false;
			this.isVisibilidadCeldaCancelarProductoProduMano=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProduMano=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoProduMano=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProductoProduMano=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoProduMano=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProduMano=false;
			this.isVisibilidadCeldaModificarProductoProduMano=false;
			this.isVisibilidadCeldaActualizarProductoProduMano=true;
			this.isVisibilidadCeldaEliminarProductoProduMano=true;
			this.isVisibilidadCeldaCancelarProductoProduMano=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProduMano=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoProduMano=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProductoProduMano=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoProduMano=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProduMano=false;
			this.isVisibilidadCeldaModificarProductoProduMano=false;
			this.isVisibilidadCeldaActualizarProductoProduMano=true;
			this.isVisibilidadCeldaEliminarProductoProduMano=false;
			this.isVisibilidadCeldaCancelarProductoProduMano=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProduMano=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoProduMano=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProductoProduMano=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoProduMano=true;
			this.isVisibilidadCeldaGuardarCambiosProductoProduMano=true;
			this.isVisibilidadCeldaModificarProductoProduMano=false;
			this.isVisibilidadCeldaActualizarProductoProduMano=false;
			this.isVisibilidadCeldaEliminarProductoProduMano=false;
			this.isVisibilidadCeldaCancelarProductoProduMano=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProduMano=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoProduMano=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProductoProduMano=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoProduMano=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProduMano=false;
			this.isVisibilidadCeldaActualizarProductoProduMano=false;
			this.isVisibilidadCeldaEliminarProductoProduMano=false;
			this.isVisibilidadCeldaCancelarProductoProduMano=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProduMano=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoProduMano=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProductoProduMano=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoProduMano=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProduMano=false;
			this.isVisibilidadCeldaModificarProductoProduMano=true;
			this.isVisibilidadCeldaActualizarProductoProduMano=false;
			this.isVisibilidadCeldaEliminarProductoProduMano=false;
			this.isVisibilidadCeldaCancelarProductoProduMano=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProduMano=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoProduMano=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProductoProduManoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProductoProduMano=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoProduMano=true;
			this.isVisibilidadCeldaGuardarCambiosProductoProduMano=true;
		} else {
			this.actualizarEstadoPanelsProductoProduMano(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProductoProduMano=false;
			//this.isVisibilidadCeldaVerFormProductoProduMano=false;
			this.isVisibilidadCeldaDuplicarProductoProduMano=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!productoprodumanoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProductoProduMano=false;
		} else {
			this.isVisibilidadCeldaNuevoProductoProduMano=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProduMano=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(productoprodumanoSessionBean.getEsGuardarRelacionado()) {
			if(!productoprodumanoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProductoProduMano=false;												
			}
			
			this.jButtonCerrarProductoProduMano.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProductoProduMano=false;
		}
		
		if(!this.permiteMantenimiento(this.productoprodumano)) {
			this.isVisibilidadCeldaActualizarProductoProduMano=false;
			this.isVisibilidadCeldaEliminarProductoProduMano=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProductoProduMano() {
	}
	
	public void actualizarEstadoPanelsProductoProduMano(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProductoProduMano!=null) {
				this.jScrollPanelDatosEdicionProductoProduMano.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProduMano!=null) {
				this.jTabbedPaneBusquedasProductoProduMano.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoProduMano!=null) {
				this.jScrollPanelDatosProductoProduMano.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoProduMano!=null) {
				this.jPanelPaginacionProductoProduMano.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoProduMano!=null) {
				this.jPanelParametrosReportesProductoProduMano.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProductoProduMano!=null) {
				this.jScrollPanelDatosEdicionProductoProduMano.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProduMano!=null) {
				this.jTabbedPaneBusquedasProductoProduMano.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProductoProduMano!=null) {
				this.jScrollPanelDatosProductoProduMano.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoProduMano!=null) {
				this.jPanelPaginacionProductoProduMano.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoProduMano!=null) {
				this.jPanelParametrosReportesProductoProduMano.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProductoProduMano!=null) {
				this.jScrollPanelDatosEdicionProductoProduMano.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProduMano!=null) {
				this.jTabbedPaneBusquedasProductoProduMano.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductoProduMano!=null) {
				this.jScrollPanelDatosProductoProduMano.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoProduMano!=null) {
				this.jPanelPaginacionProductoProduMano.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoProduMano!=null) {
				this.jPanelParametrosReportesProductoProduMano.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProductoProduMano!=null) {
				this.jScrollPanelDatosEdicionProductoProduMano.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProduMano!=null) {
				this.jTabbedPaneBusquedasProductoProduMano.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductoProduMano!=null) {
				this.jScrollPanelDatosProductoProduMano.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoProduMano!=null) {
				this.jPanelPaginacionProductoProduMano.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoProduMano!=null) {
				this.jPanelParametrosReportesProductoProduMano.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProductoProduMano!=null) {
				this.jScrollPanelDatosEdicionProductoProduMano.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProduMano!=null) {
				this.jTabbedPaneBusquedasProductoProduMano.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoProduMano!=null) {
				this.jScrollPanelDatosProductoProduMano.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoProduMano!=null) {
				this.jPanelPaginacionProductoProduMano.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoProduMano!=null) {
				this.jPanelParametrosReportesProductoProduMano.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProductoProduMano!=null) {
				this.jScrollPanelDatosEdicionProductoProduMano.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProduMano!=null) {
				this.jTabbedPaneBusquedasProductoProduMano.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoProduMano!=null) {
				this.jScrollPanelDatosProductoProduMano.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoProduMano!=null) {
				this.jPanelPaginacionProductoProduMano.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoProduMano!=null) {
				this.jPanelParametrosReportesProductoProduMano.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProductoProduMano!=null) {
				this.jScrollPanelDatosEdicionProductoProduMano.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProduMano!=null) {
				this.jTabbedPaneBusquedasProductoProduMano.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoProduMano!=null) {
				this.jScrollPanelDatosProductoProduMano.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoProduMano!=null) {
				this.jPanelPaginacionProductoProduMano.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoProduMano!=null) {
				this.jPanelParametrosReportesProductoProduMano.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProductoProduMano!=null) {
					this.jTabbedPaneBusquedasProductoProduMano.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProductoProduMano!=null) {
				this.jPanelParametrosReportesProductoProduMano.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProduMano!=null) {
				this.jTabbedPaneBusquedasProductoProduMano.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProductoProduMano!=null) {
				this.jPanelParametrosReportesProductoProduMano.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaProductoDefiProdu(Boolean isParaProductoDefiProdu){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoDefiProduNegation=!isParaProductoDefiProdu;

			this.isVisibilidadFK_IdProductoDefiProdu=isParaProductoDefiProdu;
			if(!this.isVisibilidadFK_IdProductoDefiProdu) {this.jTabbedPaneBusquedasProductoProduMano.remove(jPanelFK_IdProductoDefiProduProductoProduMano);}

			this.isVisibilidadFK_IdTipoManoProduEmpresa=isParaProductoDefiProduNegation;
			if(!this.isVisibilidadFK_IdTipoManoProduEmpresa) {this.jTabbedPaneBusquedasProductoProduMano.remove(jPanelFK_IdTipoManoProduEmpresaProductoProduMano);}

			this.isVisibilidadFK_IdTipoProcesoEmpresaProdu=isParaProductoDefiProduNegation;
			if(!this.isVisibilidadFK_IdTipoProcesoEmpresaProdu) {this.jTabbedPaneBusquedasProductoProduMano.remove(jPanelFK_IdTipoProcesoEmpresaProduProductoProduMano);}

			this.isVisibilidadFK_IdUnidad=isParaProductoDefiProduNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoProduMano.remove(jPanelFK_IdUnidadProductoProduMano);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoManoProduEmpresa(Boolean isParaTipoManoProduEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoManoProduEmpresaNegation=!isParaTipoManoProduEmpresa;

			this.isVisibilidadFK_IdProductoDefiProdu=isParaTipoManoProduEmpresaNegation;
			if(!this.isVisibilidadFK_IdProductoDefiProdu) {this.jTabbedPaneBusquedasProductoProduMano.remove(jPanelFK_IdProductoDefiProduProductoProduMano);}

			this.isVisibilidadFK_IdTipoManoProduEmpresa=isParaTipoManoProduEmpresa;
			if(!this.isVisibilidadFK_IdTipoManoProduEmpresa) {this.jTabbedPaneBusquedasProductoProduMano.remove(jPanelFK_IdTipoManoProduEmpresaProductoProduMano);}

			this.isVisibilidadFK_IdTipoProcesoEmpresaProdu=isParaTipoManoProduEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoProcesoEmpresaProdu) {this.jTabbedPaneBusquedasProductoProduMano.remove(jPanelFK_IdTipoProcesoEmpresaProduProductoProduMano);}

			this.isVisibilidadFK_IdUnidad=isParaTipoManoProduEmpresaNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoProduMano.remove(jPanelFK_IdUnidadProductoProduMano);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoProcesoEmpresaProdu(Boolean isParaTipoProcesoEmpresaProdu){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoProcesoEmpresaProduNegation=!isParaTipoProcesoEmpresaProdu;

			this.isVisibilidadFK_IdProductoDefiProdu=isParaTipoProcesoEmpresaProduNegation;
			if(!this.isVisibilidadFK_IdProductoDefiProdu) {this.jTabbedPaneBusquedasProductoProduMano.remove(jPanelFK_IdProductoDefiProduProductoProduMano);}

			this.isVisibilidadFK_IdTipoManoProduEmpresa=isParaTipoProcesoEmpresaProduNegation;
			if(!this.isVisibilidadFK_IdTipoManoProduEmpresa) {this.jTabbedPaneBusquedasProductoProduMano.remove(jPanelFK_IdTipoManoProduEmpresaProductoProduMano);}

			this.isVisibilidadFK_IdTipoProcesoEmpresaProdu=isParaTipoProcesoEmpresaProdu;
			if(!this.isVisibilidadFK_IdTipoProcesoEmpresaProdu) {this.jTabbedPaneBusquedasProductoProduMano.remove(jPanelFK_IdTipoProcesoEmpresaProduProductoProduMano);}

			this.isVisibilidadFK_IdUnidad=isParaTipoProcesoEmpresaProduNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoProduMano.remove(jPanelFK_IdUnidadProductoProduMano);}
		}
		
	}

	public void setVisibilidadBusquedasParaUnidad(Boolean isParaUnidad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUnidadNegation=!isParaUnidad;

			this.isVisibilidadFK_IdProductoDefiProdu=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdProductoDefiProdu) {this.jTabbedPaneBusquedasProductoProduMano.remove(jPanelFK_IdProductoDefiProduProductoProduMano);}

			this.isVisibilidadFK_IdTipoManoProduEmpresa=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdTipoManoProduEmpresa) {this.jTabbedPaneBusquedasProductoProduMano.remove(jPanelFK_IdTipoManoProduEmpresaProductoProduMano);}

			this.isVisibilidadFK_IdTipoProcesoEmpresaProdu=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdTipoProcesoEmpresaProdu) {this.jTabbedPaneBusquedasProductoProduMano.remove(jPanelFK_IdTipoProcesoEmpresaProduProductoProduMano);}

			this.isVisibilidadFK_IdUnidad=isParaUnidad;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoProduMano.remove(jPanelFK_IdUnidadProductoProduMano);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ProductoProduManoSessionBean productoprodumanoSessionBean=new ProductoProduManoSessionBean();
		
		if(this.productoprodumanoSessionBean==null) {
			this.productoprodumanoSessionBean=new ProductoProduManoSessionBean();
		}
		
		this.productoprodumanoSessionBean.setsUltimaBusquedaProductoProduMano(this.getsAccionBusqueda());
		this.productoprodumanoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.productoprodumanoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdProductoDefiProdu")) {
			productoprodumanoSessionBean.setid_producto_defi_produ(this.getid_producto_defi_produFK_IdProductoDefiProdu());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoManoProduEmpresa")) {
			productoprodumanoSessionBean.setid_tipo_mano_produ_empresa(this.getid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoProcesoEmpresaProdu")) {
			productoprodumanoSessionBean.setid_tipo_proceso_empresa_produ(this.getid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
			productoprodumanoSessionBean.setid_unidad(this.getid_unidadFK_IdUnidad());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ProductoProduManoSessionBean productoprodumanoSessionBean=new ProductoProduManoSessionBean();
		
		if(this.productoprodumanoSessionBean==null) {
			this.productoprodumanoSessionBean=new ProductoProduManoSessionBean();
		}
		
		if(this.productoprodumanoSessionBean.getsUltimaBusquedaProductoProduMano()!=null&&!this.productoprodumanoSessionBean.getsUltimaBusquedaProductoProduMano().equals("")) {
			this.setsAccionBusqueda(productoprodumanoSessionBean.getsUltimaBusquedaProductoProduMano());
			this.setiNumeroPaginacion(productoprodumanoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(productoprodumanoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdProductoDefiProdu")) {
				this.setid_producto_defi_produFK_IdProductoDefiProdu(productoprodumanoSessionBean.getid_producto_defi_produ());
				productoprodumanoSessionBean.setid_producto_defi_produ(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoManoProduEmpresa")) {
				this.setid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresa(productoprodumanoSessionBean.getid_tipo_mano_produ_empresa());
				productoprodumanoSessionBean.setid_tipo_mano_produ_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoProcesoEmpresaProdu")) {
				this.setid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu(productoprodumanoSessionBean.getid_tipo_proceso_empresa_produ());
				productoprodumanoSessionBean.setid_tipo_proceso_empresa_produ(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
				this.setid_unidadFK_IdUnidad(productoprodumanoSessionBean.getid_unidad());
				productoprodumanoSessionBean.setid_unidad(-1L);
			}
		}
		
		this.productoprodumanoSessionBean.setsUltimaBusquedaProductoProduMano("");
		this.productoprodumanoSessionBean.setiNumeroPaginacion(ProductoProduManoConstantesFunciones.INUMEROPAGINACION);
		this.productoprodumanoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaProductoProduMano(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProductoProduMano() {
		this.updateBorderResaltarBusquedasFormularioProductoProduMano();
		this.updateVisibilidadBusquedasFormularioProductoProduMano();
		this.updateHabilitarBusquedasFormularioProductoProduMano();
	}
	
	public void updateBorderResaltarBusquedasFormularioProductoProduMano() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProductoProduMano.getComponents().length>0) {
	

		if(this.productoprodumanoConstantesFunciones.resaltarFK_IdProductoDefiProduProductoProduMano!=null) {
			index= this.jTabbedPaneBusquedasProductoProduMano.indexOfComponent(this.jPanelFK_IdProductoDefiProduProductoProduMano);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMano.getComponent(index);
				jPanel.setBorder(this.productoprodumanoConstantesFunciones.resaltarFK_IdProductoDefiProduProductoProduMano);
			}
		}

		if(this.productoprodumanoConstantesFunciones.resaltarFK_IdTipoManoProduEmpresaProductoProduMano!=null) {
			index= this.jTabbedPaneBusquedasProductoProduMano.indexOfComponent(this.jPanelFK_IdTipoManoProduEmpresaProductoProduMano);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMano.getComponent(index);
				jPanel.setBorder(this.productoprodumanoConstantesFunciones.resaltarFK_IdTipoManoProduEmpresaProductoProduMano);
			}
		}

		if(this.productoprodumanoConstantesFunciones.resaltarFK_IdTipoProcesoEmpresaProduProductoProduMano!=null) {
			index= this.jTabbedPaneBusquedasProductoProduMano.indexOfComponent(this.jPanelFK_IdTipoProcesoEmpresaProduProductoProduMano);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMano.getComponent(index);
				jPanel.setBorder(this.productoprodumanoConstantesFunciones.resaltarFK_IdTipoProcesoEmpresaProduProductoProduMano);
			}
		}

		if(this.productoprodumanoConstantesFunciones.resaltarFK_IdUnidadProductoProduMano!=null) {
			index= this.jTabbedPaneBusquedasProductoProduMano.indexOfComponent(this.jPanelFK_IdUnidadProductoProduMano);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMano.getComponent(index);
				jPanel.setBorder(this.productoprodumanoConstantesFunciones.resaltarFK_IdUnidadProductoProduMano);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProductoProduMano() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProductoProduMano.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductoProduMano.indexOfComponent(this.jPanelFK_IdProductoDefiProduProductoProduMano);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMano.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoprodumanoConstantesFunciones.mostrarFK_IdProductoDefiProduProductoProduMano);
			if(!this.productoprodumanoConstantesFunciones.mostrarFK_IdProductoDefiProduProductoProduMano && index>-1) {
				this.jTabbedPaneBusquedasProductoProduMano.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoProduMano.indexOfComponent(this.jPanelFK_IdTipoManoProduEmpresaProductoProduMano);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMano.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoprodumanoConstantesFunciones.mostrarFK_IdTipoManoProduEmpresaProductoProduMano);
			if(!this.productoprodumanoConstantesFunciones.mostrarFK_IdTipoManoProduEmpresaProductoProduMano && index>-1) {
				this.jTabbedPaneBusquedasProductoProduMano.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoProduMano.indexOfComponent(this.jPanelFK_IdTipoProcesoEmpresaProduProductoProduMano);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMano.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoprodumanoConstantesFunciones.mostrarFK_IdTipoProcesoEmpresaProduProductoProduMano);
			if(!this.productoprodumanoConstantesFunciones.mostrarFK_IdTipoProcesoEmpresaProduProductoProduMano && index>-1) {
				this.jTabbedPaneBusquedasProductoProduMano.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoProduMano.indexOfComponent(this.jPanelFK_IdUnidadProductoProduMano);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMano.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoprodumanoConstantesFunciones.mostrarFK_IdUnidadProductoProduMano);
			if(!this.productoprodumanoConstantesFunciones.mostrarFK_IdUnidadProductoProduMano && index>-1) {
				this.jTabbedPaneBusquedasProductoProduMano.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProductoProduMano() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProductoProduMano.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductoProduMano.indexOfComponent(this.jPanelFK_IdProductoDefiProduProductoProduMano);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMano.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoprodumanoConstantesFunciones.activarFK_IdProductoDefiProduProductoProduMano);
				this.jTabbedPaneBusquedasProductoProduMano.setEnabledAt(index,this.productoprodumanoConstantesFunciones.activarFK_IdProductoDefiProduProductoProduMano);
			}

			index= this.jTabbedPaneBusquedasProductoProduMano.indexOfComponent(this.jPanelFK_IdTipoManoProduEmpresaProductoProduMano);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMano.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoprodumanoConstantesFunciones.activarFK_IdTipoManoProduEmpresaProductoProduMano);
				this.jTabbedPaneBusquedasProductoProduMano.setEnabledAt(index,this.productoprodumanoConstantesFunciones.activarFK_IdTipoManoProduEmpresaProductoProduMano);
			}

			index= this.jTabbedPaneBusquedasProductoProduMano.indexOfComponent(this.jPanelFK_IdTipoProcesoEmpresaProduProductoProduMano);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMano.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoprodumanoConstantesFunciones.activarFK_IdTipoProcesoEmpresaProduProductoProduMano);
				this.jTabbedPaneBusquedasProductoProduMano.setEnabledAt(index,this.productoprodumanoConstantesFunciones.activarFK_IdTipoProcesoEmpresaProduProductoProduMano);
			}

			index= this.jTabbedPaneBusquedasProductoProduMano.indexOfComponent(this.jPanelFK_IdUnidadProductoProduMano);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMano.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoprodumanoConstantesFunciones.activarFK_IdUnidadProductoProduMano);
				this.jTabbedPaneBusquedasProductoProduMano.setEnabledAt(index,this.productoprodumanoConstantesFunciones.activarFK_IdUnidadProductoProduMano);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProductoProduMano(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdProductoDefiProdu")) {
			index= this.jTabbedPaneBusquedasProductoProduMano.indexOfComponent(this.jPanelFK_IdProductoDefiProduProductoProduMano);

			this.jTabbedPaneBusquedasProductoProduMano.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMano.getComponent(index);

			this.productoprodumanoConstantesFunciones.setResaltarFK_IdProductoDefiProduProductoProduMano(resaltar);

			jPanel.setBorder(this.productoprodumanoConstantesFunciones.resaltarFK_IdProductoDefiProduProductoProduMano);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoManoProduEmpresa")) {
			index= this.jTabbedPaneBusquedasProductoProduMano.indexOfComponent(this.jPanelFK_IdTipoManoProduEmpresaProductoProduMano);

			this.jTabbedPaneBusquedasProductoProduMano.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMano.getComponent(index);

			this.productoprodumanoConstantesFunciones.setResaltarFK_IdTipoManoProduEmpresaProductoProduMano(resaltar);

			jPanel.setBorder(this.productoprodumanoConstantesFunciones.resaltarFK_IdTipoManoProduEmpresaProductoProduMano);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoProcesoEmpresaProdu")) {
			index= this.jTabbedPaneBusquedasProductoProduMano.indexOfComponent(this.jPanelFK_IdTipoProcesoEmpresaProduProductoProduMano);

			this.jTabbedPaneBusquedasProductoProduMano.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMano.getComponent(index);

			this.productoprodumanoConstantesFunciones.setResaltarFK_IdTipoProcesoEmpresaProduProductoProduMano(resaltar);

			jPanel.setBorder(this.productoprodumanoConstantesFunciones.resaltarFK_IdTipoProcesoEmpresaProduProductoProduMano);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdUnidad")) {
			index= this.jTabbedPaneBusquedasProductoProduMano.indexOfComponent(this.jPanelFK_IdUnidadProductoProduMano);

			this.jTabbedPaneBusquedasProductoProduMano.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMano.getComponent(index);

			this.productoprodumanoConstantesFunciones.setResaltarFK_IdUnidadProductoProduMano(resaltar);

			jPanel.setBorder(this.productoprodumanoConstantesFunciones.resaltarFK_IdUnidadProductoProduMano);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProductoProduMano.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProductoProduMano() throws Exception {

		if(this.jInternalFrameDetalleFormProductoProduMano==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProductoProduMano();
		this.updateVisibilidadResaltarControlesFormularioProductoProduMano();
		this.updateHabilitarResaltarControlesFormularioProductoProduMano();
		
	}
	
	public void updateBorderResaltarControlesFormularioProductoProduMano() throws Exception {
		if(this.jInternalFrameDetalleFormProductoProduMano==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.productoprodumanoConstantesFunciones.resaltaridProductoProduMano!=null && this.jInternalFrameDetalleFormProductoProduMano!=null) {this.jInternalFrameDetalleFormProductoProduMano.jLabelidProductoProduMano.setBorder(this.productoprodumanoConstantesFunciones.resaltaridProductoProduMano);}
		if(this.productoprodumanoConstantesFunciones.resaltarid_producto_defi_produProductoProduMano!=null && this.jInternalFrameDetalleFormProductoProduMano!=null) {this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_producto_defi_produProductoProduMano.setBorder(this.productoprodumanoConstantesFunciones.resaltarid_producto_defi_produProductoProduMano);}
		if(this.productoprodumanoConstantesFunciones.resaltarid_tipo_mano_produ_empresaProductoProduMano!=null && this.jInternalFrameDetalleFormProductoProduMano!=null) {this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_tipo_mano_produ_empresaProductoProduMano.setBorder(this.productoprodumanoConstantesFunciones.resaltarid_tipo_mano_produ_empresaProductoProduMano);}
		if(this.productoprodumanoConstantesFunciones.resaltarid_tipo_proceso_empresa_produProductoProduMano!=null && this.jInternalFrameDetalleFormProductoProduMano!=null) {this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_tipo_proceso_empresa_produProductoProduMano.setBorder(this.productoprodumanoConstantesFunciones.resaltarid_tipo_proceso_empresa_produProductoProduMano);}
		if(this.productoprodumanoConstantesFunciones.resaltarid_unidadProductoProduMano!=null && this.jInternalFrameDetalleFormProductoProduMano!=null) {this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_unidadProductoProduMano.setBorder(this.productoprodumanoConstantesFunciones.resaltarid_unidadProductoProduMano);}
		if(this.productoprodumanoConstantesFunciones.resaltarcantidadProductoProduMano!=null && this.jInternalFrameDetalleFormProductoProduMano!=null) {this.jInternalFrameDetalleFormProductoProduMano.jTextFieldcantidadProductoProduMano.setBorder(this.productoprodumanoConstantesFunciones.resaltarcantidadProductoProduMano);}
		if(this.productoprodumanoConstantesFunciones.resaltarcostoProductoProduMano!=null && this.jInternalFrameDetalleFormProductoProduMano!=null) {this.jInternalFrameDetalleFormProductoProduMano.jTextFieldcostoProductoProduMano.setBorder(this.productoprodumanoConstantesFunciones.resaltarcostoProductoProduMano);}
		if(this.productoprodumanoConstantesFunciones.resaltarcosto_totalProductoProduMano!=null && this.jInternalFrameDetalleFormProductoProduMano!=null) {this.jInternalFrameDetalleFormProductoProduMano.jTextFieldcosto_totalProductoProduMano.setBorder(this.productoprodumanoConstantesFunciones.resaltarcosto_totalProductoProduMano);}
		if(this.productoprodumanoConstantesFunciones.resaltardescripcionProductoProduMano!=null && this.jInternalFrameDetalleFormProductoProduMano!=null) {this.jInternalFrameDetalleFormProductoProduMano.jTextAreadescripcionProductoProduMano.setBorder(this.productoprodumanoConstantesFunciones.resaltardescripcionProductoProduMano);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProductoProduMano() throws Exception {		
		if(this.jInternalFrameDetalleFormProductoProduMano==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductoProduMano!=null) {
	
		//this.jInternalFrameDetalleFormProductoProduMano.jLabelidProductoProduMano.setVisible(this.productoprodumanoConstantesFunciones.mostraridProductoProduMano);
		this.jInternalFrameDetalleFormProductoProduMano.jPanelidProductoProduMano.setVisible(this.productoprodumanoConstantesFunciones.mostraridProductoProduMano);
		//this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_producto_defi_produProductoProduMano.setVisible(this.productoprodumanoConstantesFunciones.mostrarid_producto_defi_produProductoProduMano);
		this.jInternalFrameDetalleFormProductoProduMano.jPanelid_producto_defi_produProductoProduMano.setVisible(this.productoprodumanoConstantesFunciones.mostrarid_producto_defi_produProductoProduMano);
		//this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_tipo_mano_produ_empresaProductoProduMano.setVisible(this.productoprodumanoConstantesFunciones.mostrarid_tipo_mano_produ_empresaProductoProduMano);
		this.jInternalFrameDetalleFormProductoProduMano.jPanelid_tipo_mano_produ_empresaProductoProduMano.setVisible(this.productoprodumanoConstantesFunciones.mostrarid_tipo_mano_produ_empresaProductoProduMano);
		//this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_tipo_proceso_empresa_produProductoProduMano.setVisible(this.productoprodumanoConstantesFunciones.mostrarid_tipo_proceso_empresa_produProductoProduMano);
		this.jInternalFrameDetalleFormProductoProduMano.jPanelid_tipo_proceso_empresa_produProductoProduMano.setVisible(this.productoprodumanoConstantesFunciones.mostrarid_tipo_proceso_empresa_produProductoProduMano);
		//this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_unidadProductoProduMano.setVisible(this.productoprodumanoConstantesFunciones.mostrarid_unidadProductoProduMano);
		this.jInternalFrameDetalleFormProductoProduMano.jPanelid_unidadProductoProduMano.setVisible(this.productoprodumanoConstantesFunciones.mostrarid_unidadProductoProduMano);
		//this.jInternalFrameDetalleFormProductoProduMano.jTextFieldcantidadProductoProduMano.setVisible(this.productoprodumanoConstantesFunciones.mostrarcantidadProductoProduMano);
		this.jInternalFrameDetalleFormProductoProduMano.jPanelcantidadProductoProduMano.setVisible(this.productoprodumanoConstantesFunciones.mostrarcantidadProductoProduMano);
		//this.jInternalFrameDetalleFormProductoProduMano.jTextFieldcostoProductoProduMano.setVisible(this.productoprodumanoConstantesFunciones.mostrarcostoProductoProduMano);
		this.jInternalFrameDetalleFormProductoProduMano.jPanelcostoProductoProduMano.setVisible(this.productoprodumanoConstantesFunciones.mostrarcostoProductoProduMano);
		//this.jInternalFrameDetalleFormProductoProduMano.jTextFieldcosto_totalProductoProduMano.setVisible(this.productoprodumanoConstantesFunciones.mostrarcosto_totalProductoProduMano);
		this.jInternalFrameDetalleFormProductoProduMano.jPanelcosto_totalProductoProduMano.setVisible(this.productoprodumanoConstantesFunciones.mostrarcosto_totalProductoProduMano);
		//this.jInternalFrameDetalleFormProductoProduMano.jTextAreadescripcionProductoProduMano.setVisible(this.productoprodumanoConstantesFunciones.mostrardescripcionProductoProduMano);
		this.jInternalFrameDetalleFormProductoProduMano.jPaneldescripcionProductoProduMano.setVisible(this.productoprodumanoConstantesFunciones.mostrardescripcionProductoProduMano);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProductoProduMano() throws Exception {
		if(this.jInternalFrameDetalleFormProductoProduMano==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductoProduMano!=null) {
	
		this.jInternalFrameDetalleFormProductoProduMano.jLabelidProductoProduMano.setEnabled(this.productoprodumanoConstantesFunciones.activaridProductoProduMano);
		this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_producto_defi_produProductoProduMano.setEnabled(this.productoprodumanoConstantesFunciones.activarid_producto_defi_produProductoProduMano);
		this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_tipo_mano_produ_empresaProductoProduMano.setEnabled(this.productoprodumanoConstantesFunciones.activarid_tipo_mano_produ_empresaProductoProduMano);
		this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_tipo_proceso_empresa_produProductoProduMano.setEnabled(this.productoprodumanoConstantesFunciones.activarid_tipo_proceso_empresa_produProductoProduMano);
		this.jInternalFrameDetalleFormProductoProduMano.jComboBoxid_unidadProductoProduMano.setEnabled(this.productoprodumanoConstantesFunciones.activarid_unidadProductoProduMano);
		this.jInternalFrameDetalleFormProductoProduMano.jTextFieldcantidadProductoProduMano.setEnabled(this.productoprodumanoConstantesFunciones.activarcantidadProductoProduMano);
		this.jInternalFrameDetalleFormProductoProduMano.jTextFieldcostoProductoProduMano.setEnabled(this.productoprodumanoConstantesFunciones.activarcostoProductoProduMano);
		this.jInternalFrameDetalleFormProductoProduMano.jTextFieldcosto_totalProductoProduMano.setEnabled(this.productoprodumanoConstantesFunciones.activarcosto_totalProductoProduMano);
		this.jInternalFrameDetalleFormProductoProduMano.jTextAreadescripcionProductoProduMano.setEnabled(this.productoprodumanoConstantesFunciones.activardescripcionProductoProduMano);
		}
	}
	
		
}