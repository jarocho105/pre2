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

import com.bydan.erp.produccion.util.ProductoProduMermaConstantesFunciones;
import com.bydan.erp.produccion.util.ProductoProduMermaParameterReturnGeneral;
//import com.bydan.erp.produccion.util.ProductoProduMermaParameterGeneral;
//import com.bydan.erp.produccion.presentation.report.source.ProductoProduMermaBean;
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
public class ProductoProduMermaBeanSwingJInternalFrame extends ProductoProduMermaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProductoProduMermaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProductoProduMerma> productoprodumermaValidator = new ClassValidator<ProductoProduMerma>(ProductoProduMerma.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProductoProduMerma productoprodumerma;	
	public ProductoProduMerma productoprodumermaAux;
	public ProductoProduMerma productoprodumermaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProductoProduMerma productoprodumermaTotales;
	public Long idProductoProduMermaActual;
	public Long iIdNuevoProductoProduMerma=0L;
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

	public String sFinalQueryComboTipoMermaEmpresa="";

	public List<TipoMermaEmpresa> tipomermaempresasForeignKey;

	public List<TipoMermaEmpresa> gettipomermaempresasForeignKey() {
		return tipomermaempresasForeignKey;
	}

	public void settipomermaempresasForeignKey(List<TipoMermaEmpresa> tipomermaempresasForeignKey) {
		this.tipomermaempresasForeignKey = tipomermaempresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoMermaEmpresa tipomermaempresaForeignKey;

	public TipoMermaEmpresa gettipomermaempresaForeignKey() {
		return tipomermaempresaForeignKey;
	}

	public void settipomermaempresaForeignKey(TipoMermaEmpresa tipomermaempresaForeignKey) {
		this.tipomermaempresaForeignKey = tipomermaempresaForeignKey;
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
	
	public Boolean isPermisoTodoProductoProduMerma;
	public Boolean isPermisoNuevoProductoProduMerma;
	public Boolean isPermisoActualizarProductoProduMerma;
	public Boolean isPermisoActualizarOriginalProductoProduMerma;
	public Boolean isPermisoEliminarProductoProduMerma;
	public Boolean isPermisoGuardarCambiosProductoProduMerma;
	public Boolean isPermisoConsultaProductoProduMerma;
	public Boolean isPermisoBusquedaProductoProduMerma;
	public Boolean isPermisoReporteProductoProduMerma;
	public Boolean isPermisoPaginacionMedioProductoProduMerma;
	public Boolean isPermisoPaginacionAltoProductoProduMerma;
	public Boolean isPermisoPaginacionTodoProductoProduMerma;
	public Boolean isPermisoCopiarProductoProduMerma;
	public Boolean isPermisoVerFormProductoProduMerma;
	public Boolean isPermisoDuplicarProductoProduMerma;
	public Boolean isPermisoOrdenProductoProduMerma;
	
	
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
	
	public ProductoProduMermaParameterReturnGeneral productoprodumermaReturnGeneral;
	public ProductoProduMermaParameterReturnGeneral productoprodumermaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProductoProduMerma=false;
	public Boolean esParaAccionDesdeFormularioProductoProduMerma=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProductoProduMermaSessionBeanAdditional productoprodumermaSessionBeanAdditional=null;
	
	public ProductoProduMermaSessionBeanAdditional getProductoProduMermaSessionBeanAdditional() {
		return this.productoprodumermaSessionBeanAdditional;
	}
	
	public void setProductoProduMermaSessionBeanAdditional(ProductoProduMermaSessionBeanAdditional productoprodumermaSessionBeanAdditional) {
		try {
			this.productoprodumermaSessionBeanAdditional=productoprodumermaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProductoProduMermaBeanSwingJInternalFrameAdditional productoprodumermaBeanSwingJInternalFrameAdditional=null;
	//public class ProductoProduMermaBeanSwingJInternalFrame
	
	public ProductoProduMermaBeanSwingJInternalFrameAdditional getProductoProduMermaBeanSwingJInternalFrameAdditional() {
		return this.productoprodumermaBeanSwingJInternalFrameAdditional;
	}
	
	public void setProductoProduMermaBeanSwingJInternalFrameAdditional(ProductoProduMermaBeanSwingJInternalFrameAdditional productoprodumermaBeanSwingJInternalFrameAdditional) {
		try {
			this.productoprodumermaBeanSwingJInternalFrameAdditional=productoprodumermaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProductoProduMermaLogic productoprodumermaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProductoProduMerma productoprodumermaBean;
	public ProductoProduMermaConstantesFunciones productoprodumermaConstantesFunciones;
	//public ProductoProduMermaParameterReturnGeneral productoprodumermaReturnGeneral;
	
	//FK
	
	public ProductoDefiProduLogic productodefiproduLogic;
	public TipoMermaEmpresaLogic tipomermaempresaLogic;
	public UnidadLogic unidadLogic;
	
	//PARAMETROS
	
	
	//public List<ProductoProduMerma> productoprodumermas;	
	//public List<ProductoProduMerma> productoprodumermasEliminados;
	//public List<ProductoProduMerma> productoprodumermasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProductoProduMerma=false;
	public Boolean isVisibilidadCeldaDuplicarProductoProduMerma=true;
	public Boolean isVisibilidadCeldaCopiarProductoProduMerma=true;
	public Boolean isVisibilidadCeldaVerFormProductoProduMerma=true;
	public Boolean isVisibilidadCeldaOrdenProductoProduMerma=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProductoProduMerma=false;
	public Boolean isVisibilidadCeldaModificarProductoProduMerma=false;
	public Boolean isVisibilidadCeldaActualizarProductoProduMerma=false;
	public Boolean isVisibilidadCeldaEliminarProductoProduMerma=false;
	public Boolean isVisibilidadCeldaCancelarProductoProduMerma=false;
	public Boolean isVisibilidadCeldaGuardarProductoProduMerma=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProductoProduMerma=false;	
	
	
	public Boolean isVisibilidadFK_IdProductoDefiProdu=false;
	public Boolean isVisibilidadFK_IdTipoMermaEmpresa=false;
	public Boolean isVisibilidadFK_IdUnidad=false;
	
	public Long getiIdNuevoProductoProduMerma() {
		return this.iIdNuevoProductoProduMerma;
	}

	public void setiIdNuevoProductoProduMerma(Long iIdNuevoProductoProduMerma) {
		this.iIdNuevoProductoProduMerma = iIdNuevoProductoProduMerma;
	}
	
	public Long getidProductoProduMermaActual() {
		return this.idProductoProduMermaActual;
	}

	public void setidProductoProduMermaActual(Long idProductoProduMermaActual) {
		this.idProductoProduMermaActual = idProductoProduMermaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProductoProduMerma getproductoprodumerma() {
		return this.productoprodumerma;
	}

	public void setproductoprodumerma(ProductoProduMerma productoprodumerma) {
		this.productoprodumerma = productoprodumerma;
	}
	
	public ProductoProduMerma getproductoprodumermaAux() {
		return this.productoprodumermaAux;
	}

	public void setproductoprodumermaAux(ProductoProduMerma productoprodumermaAux) {
		this.productoprodumermaAux = productoprodumermaAux;
	}				
	
	public ProductoProduMerma getproductoprodumermaAnterior() {
		return this.productoprodumermaAnterior;
	}

	public void setproductoprodumermaAnterior(ProductoProduMerma productoprodumermaAnterior) {
		this.productoprodumermaAnterior = productoprodumermaAnterior;
	}	
	
	public ProductoProduMerma getproductoprodumermaTotales() {
		return this.productoprodumermaTotales;
	}

	public void setproductoprodumermaTotales(ProductoProduMerma productoprodumermaTotales) {
		this.productoprodumermaTotales = productoprodumermaTotales;
	}	
	
	public ProductoProduMerma getproductoprodumermaBean() {
		return this.productoprodumermaBean;
	}

	public void setproductoprodumermaBean(ProductoProduMerma productoprodumermaBean) {
		this.productoprodumermaBean = productoprodumermaBean;
	}	
	
	public ProductoProduMermaParameterReturnGeneral getproductoprodumermaReturnGeneral() {
		return this.productoprodumermaReturnGeneral;
	}

	public void setproductoprodumermaReturnGeneral(ProductoProduMermaParameterReturnGeneral productoprodumermaReturnGeneral) {
		this.productoprodumermaReturnGeneral = productoprodumermaReturnGeneral;
	}	
	
	
	public Long id_producto_defi_produFK_IdProductoDefiProdu=-1L;

	public Long getid_producto_defi_produFK_IdProductoDefiProdu() {
		return this.id_producto_defi_produFK_IdProductoDefiProdu;
	}

	public void setid_producto_defi_produFK_IdProductoDefiProdu(Long id_producto_defi_produFK_IdProductoDefiProdu) {
		this.id_producto_defi_produFK_IdProductoDefiProdu = id_producto_defi_produFK_IdProductoDefiProdu;
	}

	public Long id_tipo_merma_empresaFK_IdTipoMermaEmpresa=-1L;

	public Long getid_tipo_merma_empresaFK_IdTipoMermaEmpresa() {
		return this.id_tipo_merma_empresaFK_IdTipoMermaEmpresa;
	}

	public void setid_tipo_merma_empresaFK_IdTipoMermaEmpresa(Long id_tipo_merma_empresaFK_IdTipoMermaEmpresa) {
		this.id_tipo_merma_empresaFK_IdTipoMermaEmpresa = id_tipo_merma_empresaFK_IdTipoMermaEmpresa;
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
	
	
	public ProductoProduMermaLogic getProductoProduMermaLogic()	{		
		return productoprodumermaLogic;
	}

	public void setProductoProduMermaLogic(ProductoProduMermaLogic productoprodumermaLogic) {
		this.productoprodumermaLogic = productoprodumermaLogic;
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
	
	public Boolean getIsEsNuevoProductoProduMerma() {
		return isEsNuevoProductoProduMerma;
	}

	public void setIsEsNuevoProductoProduMerma(Boolean isEsNuevoProductoProduMerma) {
		this.isEsNuevoProductoProduMerma = isEsNuevoProductoProduMerma;
	}

	public Boolean getEsParaAccionDesdeFormularioProductoProduMerma() {
		return esParaAccionDesdeFormularioProductoProduMerma;
	}
	
	public void setEsParaAccionDesdeFormularioProductoProduMerma(Boolean esParaAccionDesdeFormularioProductoProduMerma) {
		this.esParaAccionDesdeFormularioProductoProduMerma = esParaAccionDesdeFormularioProductoProduMerma;
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

			if(this.productoprodumermaSessionBean==null) {
				this.productoprodumermaSessionBean=new ProductoProduMermaSessionBean();
			}

			if(!this.productoprodumermaSessionBean.getisBusquedaDesdeForeignKeySesionProductoDefiProdu()) {
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
					productodefiproduLogic.getEntityWithConnection(productoprodumermaSessionBean.getlidProductoDefiProduActual());
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

	public void cargarCombosTipoMermaEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipomermaempresasForeignKey=new ArrayList<TipoMermaEmpresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoMermaEmpresaLogic tipomermaempresaLogic=new TipoMermaEmpresaLogic();

			tipomermaempresaLogic.getTipoMermaEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.productoprodumermaSessionBean==null) {
				this.productoprodumermaSessionBean=new ProductoProduMermaSessionBean();
			}

			if(!this.productoprodumermaSessionBean.getisBusquedaDesdeForeignKeySesionTipoMermaEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomermaempresaLogic.getTipoMermaEmpresaDataAccess().setIsForForeingKeyData(true);

					tipomermaempresaLogic.getTodosTipoMermaEmpresasWithConnection(sFinalQuery,new Pagination());

					this.tipomermaempresasForeignKey=tipomermaempresaLogic.getTipoMermaEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoMermaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomermaempresaLogic.getEntityWithConnection(productoprodumermaSessionBean.getlidTipoMermaEmpresaActual());
					this.tipomermaempresasForeignKey.add(tipomermaempresaLogic.getTipoMermaEmpresa());
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

			if(this.productoprodumermaSessionBean==null) {
				this.productoprodumermaSessionBean=new ProductoProduMermaSessionBean();
			}

			if(!this.productoprodumermaSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
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
					unidadLogic.getEntityWithConnection(productoprodumermaSessionBean.getlidUnidadActual());
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

					if(this.productoprodumerma!=null) {
						this.productoprodumerma.setProductoDefiProdu(productodefiproduTemp);
					}

					if(this.jInternalFrameDetalleFormProductoProduMerma!=null) {
						this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_producto_defi_produProductoProduMerma.setSelectedItem(productodefiproduTemp);
					}
				} else {
					//jComboBoxid_producto_defi_produProductoProduMerma.setSelectedItem(productodefiproduTemp);
					if(this.jInternalFrameDetalleFormProductoProduMerma!=null) {
						if(this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_producto_defi_produProductoProduMerma.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_producto_defi_produProductoProduMerma.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProductoDefiProdu") || sFormularioTipoBusqueda.equals("Todos")){
					if(productodefiproduTemp!=null && jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMerma!=null) {
						jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMerma.setSelectedItem(productodefiproduTemp);
					} else {
						if(jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMerma!=null) {
							//jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMerma.setSelectedItem(productodefiproduTemp);
							if(jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMerma.getItemCount()>0) {
								jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMerma.setSelectedIndex(0);
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
	public void setActualProductoDefiProduForeignKeyGenerico(Long idProductoDefiProduSeleccionado,JComboBox jComboBoxid_producto_defi_produProductoProduMermaGenerico)throws Exception
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
				jComboBoxid_producto_defi_produProductoProduMermaGenerico.setSelectedItem(productodefiproduTemp);
			} else {
				if(jComboBoxid_producto_defi_produProductoProduMermaGenerico!=null && jComboBoxid_producto_defi_produProductoProduMermaGenerico.getItemCount()>0) {
					jComboBoxid_producto_defi_produProductoProduMermaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoMermaEmpresaForeignKey(Long idTipoMermaEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoMermaEmpresa  tipomermaempresaTemp=null;

			for(TipoMermaEmpresa tipomermaempresaAux:tipomermaempresasForeignKey) {
				if(tipomermaempresaAux.getId()!=null && tipomermaempresaAux.getId().equals(idTipoMermaEmpresaSeleccionado)) {
					tipomermaempresaTemp=tipomermaempresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipomermaempresaTemp!=null) {

					if(this.productoprodumerma!=null) {
						this.productoprodumerma.setTipoMermaEmpresa(tipomermaempresaTemp);
					}

					if(this.jInternalFrameDetalleFormProductoProduMerma!=null) {
						this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_tipo_merma_empresaProductoProduMerma.setSelectedItem(tipomermaempresaTemp);
					}
				} else {
					//jComboBoxid_tipo_merma_empresaProductoProduMerma.setSelectedItem(tipomermaempresaTemp);
					if(this.jInternalFrameDetalleFormProductoProduMerma!=null) {
						if(this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_tipo_merma_empresaProductoProduMerma.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_tipo_merma_empresaProductoProduMerma.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoMermaEmpresa") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipomermaempresaTemp!=null && jComboBoxid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoProduMerma!=null) {
						jComboBoxid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoProduMerma.setSelectedItem(tipomermaempresaTemp);
					} else {
						if(jComboBoxid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoProduMerma!=null) {
							//jComboBoxid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoProduMerma.setSelectedItem(tipomermaempresaTemp);
							if(jComboBoxid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoProduMerma.getItemCount()>0) {
								jComboBoxid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoProduMerma.setSelectedIndex(0);
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

	public String getActualTipoMermaEmpresaForeignKeyDescripcion(Long idTipoMermaEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoMermaEmpresa  tipomermaempresaTemp=null;

			for(TipoMermaEmpresa tipomermaempresaAux:tipomermaempresasForeignKey) {
				if(tipomermaempresaAux.getId()!=null && tipomermaempresaAux.getId().equals(idTipoMermaEmpresaSeleccionado)) {
					tipomermaempresaTemp=tipomermaempresaAux;
					break;
				}
			}


			sDescripcion=TipoMermaEmpresaConstantesFunciones.getTipoMermaEmpresaDescripcion(tipomermaempresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoMermaEmpresaForeignKeyGenerico(Long idTipoMermaEmpresaSeleccionado,JComboBox jComboBoxid_tipo_merma_empresaProductoProduMermaGenerico)throws Exception
	{
		try
		{
			TipoMermaEmpresa  tipomermaempresaTemp=null;

			for(TipoMermaEmpresa tipomermaempresaAux:tipomermaempresasForeignKey) {
				if(tipomermaempresaAux.getId()!=null && tipomermaempresaAux.getId().equals(idTipoMermaEmpresaSeleccionado)) {
					tipomermaempresaTemp=tipomermaempresaAux;
					break;
				}
			}

			if(tipomermaempresaTemp!=null) {
				jComboBoxid_tipo_merma_empresaProductoProduMermaGenerico.setSelectedItem(tipomermaempresaTemp);
			} else {
				if(jComboBoxid_tipo_merma_empresaProductoProduMermaGenerico!=null && jComboBoxid_tipo_merma_empresaProductoProduMermaGenerico.getItemCount()>0) {
					jComboBoxid_tipo_merma_empresaProductoProduMermaGenerico.setSelectedIndex(0);
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

					if(this.productoprodumerma!=null) {
						this.productoprodumerma.setUnidad(unidadTemp);
					}

					if(this.jInternalFrameDetalleFormProductoProduMerma!=null) {
						this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_unidadProductoProduMerma.setSelectedItem(unidadTemp);
					}
				} else {
					//jComboBoxid_unidadProductoProduMerma.setSelectedItem(unidadTemp);
					if(this.jInternalFrameDetalleFormProductoProduMerma!=null) {
						if(this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_unidadProductoProduMerma.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_unidadProductoProduMerma.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){
					if(unidadTemp!=null && jComboBoxid_unidadFK_IdUnidadProductoProduMerma!=null) {
						jComboBoxid_unidadFK_IdUnidadProductoProduMerma.setSelectedItem(unidadTemp);
					} else {
						if(jComboBoxid_unidadFK_IdUnidadProductoProduMerma!=null) {
							//jComboBoxid_unidadFK_IdUnidadProductoProduMerma.setSelectedItem(unidadTemp);
							if(jComboBoxid_unidadFK_IdUnidadProductoProduMerma.getItemCount()>0) {
								jComboBoxid_unidadFK_IdUnidadProductoProduMerma.setSelectedIndex(0);
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
	public void setActualUnidadForeignKeyGenerico(Long idUnidadSeleccionado,JComboBox jComboBoxid_unidadProductoProduMermaGenerico)throws Exception
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
				jComboBoxid_unidadProductoProduMermaGenerico.setSelectedItem(unidadTemp);
			} else {
				if(jComboBoxid_unidadProductoProduMermaGenerico!=null && jComboBoxid_unidadProductoProduMermaGenerico.getItemCount()>0) {
					jComboBoxid_unidadProductoProduMermaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoDefiProduForeignKey(ProductoProduMerma productoprodumerma,JComboBox jComboBoxid_producto_defi_produProductoProduMermaGenerico)throws Exception
	{
		try
		{
			ProductoDefiProdu  productodefiproduAux=new ProductoDefiProdu();

			if(jComboBoxid_producto_defi_produProductoProduMermaGenerico==null) {
				productodefiproduAux=(ProductoDefiProdu)this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_producto_defi_produProductoProduMerma.getSelectedItem();
			} else {
				productodefiproduAux=(ProductoDefiProdu)jComboBoxid_producto_defi_produProductoProduMermaGenerico.getSelectedItem();
			}

			if(productodefiproduAux!=null && productodefiproduAux.getId()!=null) {
				productoprodumerma.setid_producto_defi_produ(productodefiproduAux.getId());
				productoprodumerma.setproductodefiprodu_descripcion(ProductoProduMermaConstantesFunciones.getProductoDefiProduDescripcion(productodefiproduAux));
				productoprodumerma.setProductoDefiProdu(productodefiproduAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoMermaEmpresaForeignKey(ProductoProduMerma productoprodumerma,JComboBox jComboBoxid_tipo_merma_empresaProductoProduMermaGenerico)throws Exception
	{
		try
		{
			TipoMermaEmpresa  tipomermaempresaAux=new TipoMermaEmpresa();

			if(jComboBoxid_tipo_merma_empresaProductoProduMermaGenerico==null) {
				tipomermaempresaAux=(TipoMermaEmpresa)this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_tipo_merma_empresaProductoProduMerma.getSelectedItem();
			} else {
				tipomermaempresaAux=(TipoMermaEmpresa)jComboBoxid_tipo_merma_empresaProductoProduMermaGenerico.getSelectedItem();
			}

			if(tipomermaempresaAux!=null && tipomermaempresaAux.getId()!=null) {
				productoprodumerma.setid_tipo_merma_empresa(tipomermaempresaAux.getId());
				productoprodumerma.settipomermaempresa_descripcion(ProductoProduMermaConstantesFunciones.getTipoMermaEmpresaDescripcion(tipomermaempresaAux));
				productoprodumerma.setTipoMermaEmpresa(tipomermaempresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUnidadForeignKey(ProductoProduMerma productoprodumerma,JComboBox jComboBoxid_unidadProductoProduMermaGenerico)throws Exception
	{
		try
		{
			Unidad  unidadAux=new Unidad();

			if(jComboBoxid_unidadProductoProduMermaGenerico==null) {
				unidadAux=(Unidad)this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_unidadProductoProduMerma.getSelectedItem();
			} else {
				unidadAux=(Unidad)jComboBoxid_unidadProductoProduMermaGenerico.getSelectedItem();
			}

			if(unidadAux!=null && unidadAux.getId()!=null) {
				productoprodumerma.setid_unidad(unidadAux.getId());
				productoprodumerma.setunidad_descripcion(ProductoProduMermaConstantesFunciones.getUnidadDescripcion(unidadAux));
				productoprodumerma.setUnidad(unidadAux);			}
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

					if(!ProductoProduMermaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoProduMerma!=null) { 
							this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_producto_defi_produProductoProduMerma.removeAllItems();

							for(ProductoDefiProdu productodefiprodu:this.productodefiprodusForeignKey) {
								this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_producto_defi_produProductoProduMerma.addItem(productodefiprodu);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoProduMerma!=null) { 
					}

					if(!ProductoProduMermaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProductoDefiProdu") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoProduMermaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMerma.removeAllItems();

							for(ProductoDefiProdu productodefiprodu:this.productodefiprodusForeignKey) {
								this.jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMerma.addItem(productodefiprodu);
							}
						}

						if(!ProductoProduMermaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoMermaEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoMermaEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProductoProduMermaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoProduMerma!=null) { 
							this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_tipo_merma_empresaProductoProduMerma.removeAllItems();

							for(TipoMermaEmpresa tipomermaempresa:this.tipomermaempresasForeignKey) {
								this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_tipo_merma_empresaProductoProduMerma.addItem(tipomermaempresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoProduMerma!=null) { 
					}

					if(!ProductoProduMermaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoMermaEmpresa") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoProduMermaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoProduMerma.removeAllItems();

							for(TipoMermaEmpresa tipomermaempresa:this.tipomermaempresasForeignKey) {
								this.jComboBoxid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoProduMerma.addItem(tipomermaempresa);
							}
						}

						if(!ProductoProduMermaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoProduMermaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoProduMerma!=null) { 
							this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_unidadProductoProduMerma.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_unidadProductoProduMerma.addItem(unidad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoProduMerma!=null) { 
					}

					if(!ProductoProduMermaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoProduMermaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_unidadFK_IdUnidadProductoProduMerma.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jComboBoxid_unidadFK_IdUnidadProductoProduMerma.addItem(unidad);
							}
						}

						if(!ProductoProduMermaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormProductoProduMerma!=null) {
							this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_producto_defi_produProductoProduMerma.setSelectedItem(productodefiprodu);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoProduMerma!=null) {
							this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_producto_defi_produProductoProduMerma.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMerma.setSelectedItem(productodefiprodu);
						} else {
							this.jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMerma.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoMermaEmpresaForeignKey(TipoMermaEmpresa tipomermaempresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProductoProduMerma!=null) {
							this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_tipo_merma_empresaProductoProduMerma.setSelectedItem(tipomermaempresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoProduMerma!=null) {
							this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_tipo_merma_empresaProductoProduMerma.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoProduMerma.setSelectedItem(tipomermaempresa);
						} else {
							this.jComboBoxid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoProduMerma.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoProduMerma!=null) {
							this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_unidadProductoProduMerma.setSelectedItem(unidad);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoProduMerma!=null) {
							this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_unidadProductoProduMerma.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_unidadFK_IdUnidadProductoProduMerma.setSelectedItem(unidad);
						} else {
							this.jComboBoxid_unidadFK_IdUnidadProductoProduMerma.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProductoProduMerma() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ProductoProduMermaConstantesFunciones.refrescarForeignKeysDescripcionesProductoProduMerma(this.productoprodumermaLogic.getProductoProduMermas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ProductoProduMermaConstantesFunciones.refrescarForeignKeysDescripcionesProductoProduMerma(this.productoprodumermas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(ProductoDefiProdu.class));
		classes.add(new Classe(TipoMermaEmpresa.class));
		classes.add(new Classe(Unidad.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//productoprodumermaLogic.setProductoProduMermas(this.productoprodumermas);
			productoprodumermaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ProductoProduMermaParameterReturnGeneral getProductoProduMermaParameterGeneral() {
		return this.productoprodumermaParameterGeneral;
	}
	
	public void setProductoProduMermaParameterGeneral(ProductoProduMermaParameterReturnGeneral productoprodumermaParameterGeneral) {
		this.productoprodumermaParameterGeneral = productoprodumermaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProductoProduMerma() {
		return isPermisoTodoProductoProduMerma;
	}

	public void setIsPermisoTodoProductoProduMerma(Boolean isPermisoTodoProductoProduMerma) {
		this.isPermisoTodoProductoProduMerma = isPermisoTodoProductoProduMerma;
	}

	public Boolean getIsPermisoNuevoProductoProduMerma() {
		return isPermisoNuevoProductoProduMerma;
	}

	public void setIsPermisoNuevoProductoProduMerma(Boolean isPermisoNuevoProductoProduMerma) {
		this.isPermisoNuevoProductoProduMerma = isPermisoNuevoProductoProduMerma;
	}

	public Boolean getIsPermisoActualizarProductoProduMerma() {
		return isPermisoActualizarProductoProduMerma;
	}

	public void setIsPermisoActualizarProductoProduMerma(Boolean isPermisoActualizarProductoProduMerma) {
		this.isPermisoActualizarProductoProduMerma = isPermisoActualizarProductoProduMerma;
	}

	public Boolean getIsPermisoEliminarProductoProduMerma() {
		return isPermisoEliminarProductoProduMerma;
	}

	public void setIsPermisoEliminarProductoProduMerma(Boolean isPermisoEliminarProductoProduMerma) {
		this.isPermisoEliminarProductoProduMerma = isPermisoEliminarProductoProduMerma;
	}

	public Boolean getIsPermisoGuardarCambiosProductoProduMerma() {
		return isPermisoGuardarCambiosProductoProduMerma;
	}

	public void setIsPermisoGuardarCambiosProductoProduMerma(Boolean isPermisoGuardarCambiosProductoProduMerma) {
		this.isPermisoGuardarCambiosProductoProduMerma = isPermisoGuardarCambiosProductoProduMerma;
	}
	
	public Boolean getIsPermisoConsultaProductoProduMerma() {
		return isPermisoConsultaProductoProduMerma;
	}

	public void setIsPermisoConsultaProductoProduMerma(Boolean isPermisoConsultaProductoProduMerma) {
		this.isPermisoConsultaProductoProduMerma = isPermisoConsultaProductoProduMerma;
	}

	public Boolean getIsPermisoBusquedaProductoProduMerma() {
		return isPermisoBusquedaProductoProduMerma;
	}

	public void setIsPermisoBusquedaProductoProduMerma(Boolean isPermisoBusquedaProductoProduMerma) {
		this.isPermisoBusquedaProductoProduMerma = isPermisoBusquedaProductoProduMerma;
	}

	public Boolean getIsPermisoReporteProductoProduMerma() {
		return isPermisoReporteProductoProduMerma;
	}

	public void setIsPermisoReporteProductoProduMerma(Boolean isPermisoReporteProductoProduMerma) {
		this.isPermisoReporteProductoProduMerma = isPermisoReporteProductoProduMerma;
	}
	
	public Boolean getIsPermisoPaginacionMedioProductoProduMerma() {
		return isPermisoPaginacionMedioProductoProduMerma;
	}

	public void setIsPermisoPaginacionMedioProductoProduMerma(Boolean isPermisoPaginacionMedioProductoProduMerma) {
		this.isPermisoPaginacionMedioProductoProduMerma = isPermisoPaginacionMedioProductoProduMerma;
	}
	
	public Boolean getIsPermisoPaginacionTodoProductoProduMerma() {
		return isPermisoPaginacionTodoProductoProduMerma;
	}

	public void setIsPermisoPaginacionTodoProductoProduMerma(Boolean isPermisoPaginacionTodoProductoProduMerma) {
		this.isPermisoPaginacionTodoProductoProduMerma = isPermisoPaginacionTodoProductoProduMerma;
	}
	
	public Boolean getIsPermisoPaginacionAltoProductoProduMerma() {
		return isPermisoPaginacionAltoProductoProduMerma;
	}

	public void setIsPermisoPaginacionAltoProductoProduMerma(Boolean isPermisoPaginacionAltoProductoProduMerma) {
		this.isPermisoPaginacionAltoProductoProduMerma = isPermisoPaginacionAltoProductoProduMerma;
	}
	
	public Boolean getIsPermisoCopiarProductoProduMerma() {
		return isPermisoCopiarProductoProduMerma;
	}

	public void setIsPermisoCopiarProductoProduMerma(Boolean isPermisoCopiarProductoProduMerma) {
		this.isPermisoCopiarProductoProduMerma = isPermisoCopiarProductoProduMerma;
	}
	
	public Boolean getIsPermisoVerFormProductoProduMerma() {
		return isPermisoVerFormProductoProduMerma;
	}

	public void setIsPermisoVerFormProductoProduMerma(Boolean isPermisoVerFormProductoProduMerma) {
		this.isPermisoVerFormProductoProduMerma = isPermisoVerFormProductoProduMerma;
	}
	
	public Boolean getIsPermisoDuplicarProductoProduMerma() {
		return isPermisoDuplicarProductoProduMerma;
	}

	public void setIsPermisoDuplicarProductoProduMerma(Boolean isPermisoDuplicarProductoProduMerma) {
		this.isPermisoDuplicarProductoProduMerma = isPermisoDuplicarProductoProduMerma;
	}
	
	public Boolean getIsPermisoOrdenProductoProduMerma() {
		return isPermisoOrdenProductoProduMerma;
	}

	public void setIsPermisoOrdenProductoProduMerma(Boolean isPermisoOrdenProductoProduMerma) {
		this.isPermisoOrdenProductoProduMerma = isPermisoOrdenProductoProduMerma;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProductoProduMerma() {
		return isVisibilidadCeldaNuevoProductoProduMerma;
	}

	public void setIsVisibilidadCeldaNuevoProductoProduMerma(Boolean isVisibilidadCeldaNuevoProductoProduMerma) {
		this.isVisibilidadCeldaNuevoProductoProduMerma = isVisibilidadCeldaNuevoProductoProduMerma;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProductoProduMerma() {
		return isVisibilidadCeldaDuplicarProductoProduMerma;
	}

	public void setIsVisibilidadCeldaDuplicarProductoProduMerma(Boolean isVisibilidadCeldaDuplicarProductoProduMerma) {
		this.isVisibilidadCeldaDuplicarProductoProduMerma = isVisibilidadCeldaDuplicarProductoProduMerma;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProductoProduMerma() {
		return isVisibilidadCeldaCopiarProductoProduMerma;
	}

	public void setIsVisibilidadCeldaCopiarProductoProduMerma(Boolean isVisibilidadCeldaCopiarProductoProduMerma) {
		this.isVisibilidadCeldaCopiarProductoProduMerma = isVisibilidadCeldaCopiarProductoProduMerma;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProductoProduMerma() {
		return isVisibilidadCeldaVerFormProductoProduMerma;
	}

	public void setIsVisibilidadCeldaVerFormProductoProduMerma(Boolean isVisibilidadCeldaVerFormProductoProduMerma) {
		this.isVisibilidadCeldaVerFormProductoProduMerma = isVisibilidadCeldaVerFormProductoProduMerma;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProductoProduMerma() {
		return isVisibilidadCeldaOrdenProductoProduMerma;
	}

	public void setIsVisibilidadCeldaOrdenProductoProduMerma(Boolean isVisibilidadCeldaOrdenProductoProduMerma) {
		this.isVisibilidadCeldaOrdenProductoProduMerma = isVisibilidadCeldaOrdenProductoProduMerma;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProductoProduMerma() {
		return isVisibilidadCeldaNuevoRelacionesProductoProduMerma;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProductoProduMerma(Boolean isVisibilidadCeldaNuevoRelacionesProductoProduMerma) {
		this.isVisibilidadCeldaNuevoRelacionesProductoProduMerma = isVisibilidadCeldaNuevoRelacionesProductoProduMerma;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProductoProduMerma() {
		return isVisibilidadCeldaModificarProductoProduMerma;
	}

	public void setIsVisibilidadCeldaModificarProductoProduMerma(Boolean isVisibilidadCeldaModificarProductoProduMerma) {
		this.isVisibilidadCeldaModificarProductoProduMerma = isVisibilidadCeldaModificarProductoProduMerma;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProductoProduMerma() {
		return isVisibilidadCeldaActualizarProductoProduMerma;
	}

	public void setIsVisibilidadCeldaActualizarProductoProduMerma(Boolean isVisibilidadCeldaActualizarProductoProduMerma) {
		this.isVisibilidadCeldaActualizarProductoProduMerma = isVisibilidadCeldaActualizarProductoProduMerma;
	}

	public Boolean getIsVisibilidadCeldaEliminarProductoProduMerma() {
		return isVisibilidadCeldaEliminarProductoProduMerma;
	}

	public void setIsVisibilidadCeldaEliminarProductoProduMerma(Boolean isVisibilidadCeldaEliminarProductoProduMerma) {
		this.isVisibilidadCeldaEliminarProductoProduMerma = isVisibilidadCeldaEliminarProductoProduMerma;
	}

	public Boolean getIsVisibilidadCeldaCancelarProductoProduMerma() {
		return isVisibilidadCeldaCancelarProductoProduMerma;
	}

	public void setIsVisibilidadCeldaCancelarProductoProduMerma(Boolean isVisibilidadCeldaCancelarProductoProduMerma) {
		this.isVisibilidadCeldaCancelarProductoProduMerma = isVisibilidadCeldaCancelarProductoProduMerma;
	}

	public Boolean getIsVisibilidadCeldaGuardarProductoProduMerma() {
		return isVisibilidadCeldaGuardarProductoProduMerma;
	}

	public void setIsVisibilidadCeldaGuardarProductoProduMerma(Boolean isVisibilidadCeldaGuardarProductoProduMerma) {
		this.isVisibilidadCeldaGuardarProductoProduMerma = isVisibilidadCeldaGuardarProductoProduMerma;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProductoProduMerma() {
		return isVisibilidadCeldaGuardarCambiosProductoProduMerma;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProductoProduMerma(Boolean isVisibilidadCeldaGuardarCambiosProductoProduMerma) {
		this.isVisibilidadCeldaGuardarCambiosProductoProduMerma = isVisibilidadCeldaGuardarCambiosProductoProduMerma;
	}
		
	public ProductoProduMermaSessionBean getproductoprodumermaSessionBean() {
		return this.productoprodumermaSessionBean;
	}
	
	public void setproductoprodumermaSessionBean(ProductoProduMermaSessionBean productoprodumermaSessionBean) {
		this.productoprodumermaSessionBean=productoprodumermaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdProductoDefiProdu() {
		return this.isVisibilidadFK_IdProductoDefiProdu;
	}

	public void setisVisibilidadFK_IdProductoDefiProdu(Boolean isVisibilidadFK_IdProductoDefiProdu) {
		this.isVisibilidadFK_IdProductoDefiProdu=isVisibilidadFK_IdProductoDefiProdu;
	}

	public Boolean getisVisibilidadFK_IdTipoMermaEmpresa() {
		return this.isVisibilidadFK_IdTipoMermaEmpresa;
	}

	public void setisVisibilidadFK_IdTipoMermaEmpresa(Boolean isVisibilidadFK_IdTipoMermaEmpresa) {
		this.isVisibilidadFK_IdTipoMermaEmpresa=isVisibilidadFK_IdTipoMermaEmpresa;
	}

	public Boolean getisVisibilidadFK_IdUnidad() {
		return this.isVisibilidadFK_IdUnidad;
	}

	public void setisVisibilidadFK_IdUnidad(Boolean isVisibilidadFK_IdUnidad) {
		this.isVisibilidadFK_IdUnidad=isVisibilidadFK_IdUnidad;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProductoProduMerma(ProductoProduMerma productoprodumerma)throws Exception {
		try {
			
				this.setActualParaGuardarProductoDefiProduForeignKey(productoprodumerma,null);
				this.setActualParaGuardarTipoMermaEmpresaForeignKey(productoprodumerma,null);
				this.setActualParaGuardarUnidadForeignKey(productoprodumerma,null);
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
	
	public void bugActualizarReferenciaActual(ProductoProduMerma productoprodumerma,ProductoProduMerma productoprodumermaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProductoProduMerma(productoprodumerma);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		productoprodumermaAux.setId(productoprodumerma.getId());
		productoprodumermaAux.setVersionRow(productoprodumerma.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessProductoProduMerma();
		
			int intSelectedRow = this.jTableDatosProductoProduMerma.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumerma =(ProductoProduMerma) this.productoprodumermaLogic.getProductoProduMermas().toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.productoprodumerma =(ProductoProduMerma) this.productoprodumermas.toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ProductoProduMermaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualProductoProduMerma(this.productoprodumerma,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMerma(this.productoprodumerma);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = productoprodumermaValidator.getInvalidValues(this.productoprodumerma);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			productoprodumermaLogic.setDatosCliente(datosCliente);
			productoprodumermaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				productoprodumermaAux=new  ProductoProduMerma();
				
				productoprodumermaAux.setIsNew(true);
				productoprodumermaAux.setIsChanged(true);
				
				productoprodumermaAux.setProductoProduMermaOriginal(this.productoprodumerma);
				
				productoprodumermaAux.setId(this.productoprodumerma.getId());	
				productoprodumermaAux.setVersionRow(this.productoprodumerma.getVersionRow());	
				productoprodumermaAux.setid_producto_defi_produ(this.productoprodumerma.getid_producto_defi_produ());	
				productoprodumermaAux.setid_tipo_merma_empresa(this.productoprodumerma.getid_tipo_merma_empresa());	
				productoprodumermaAux.setid_unidad(this.productoprodumerma.getid_unidad());	
				productoprodumermaAux.setcantidad(this.productoprodumerma.getcantidad());	
				productoprodumermaAux.setcosto(this.productoprodumerma.getcosto());	
				productoprodumermaAux.setcosto_total(this.productoprodumerma.getcosto_total());	
				productoprodumermaAux.setdescripcion(this.productoprodumerma.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productoprodumermaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productoprodumermaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(productoprodumermaAux,productoprodumermaLogic.getProductoProduMermas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoprodumermaAux,productoprodumermas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.productoprodumermaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoprodumermaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodumermaLogic.saveProductoProduMermas();//WithConnection
						//productoprodumermaLogic.getSetVersionRowProductoProduMermas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.productoprodumerma,productoprodumermaAux);
					
					this.refrescarForeignKeysDescripcionesProductoProduMerma();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoprodumermaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoprodumermaLogic.saveProductoProduMermaRelaciones(productoprodumermaAux);//WithConnection
								//productoprodumermaLogic.getSetVersionRowProductoProduMermas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.productoprodumerma,productoprodumermaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.productoprodumermaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.productoprodumermaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(productoprodumermaAux,productoprodumermaLogic.getProductoProduMermas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(productoprodumermaAux,productoprodumermas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.productoprodumerma,productoprodumermaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				productoprodumermaAux=new  ProductoProduMerma();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.productoprodumermaSessionBean.getEsGuardarRelacionado() 
					|| (this.productoprodumermaSessionBean.getEsGuardarRelacionado() && this.productoprodumerma.getId()>=0)) {
						
					productoprodumermaAux.setIsNew(false);
				}
				
				productoprodumermaAux.setIsDeleted(false);
			
				productoprodumermaAux.setId(this.productoprodumerma.getId());	
				productoprodumermaAux.setVersionRow(this.productoprodumerma.getVersionRow());	
				productoprodumermaAux.setid_producto_defi_produ(this.productoprodumerma.getid_producto_defi_produ());	
				productoprodumermaAux.setid_tipo_merma_empresa(this.productoprodumerma.getid_tipo_merma_empresa());	
				productoprodumermaAux.setid_unidad(this.productoprodumerma.getid_unidad());	
				productoprodumermaAux.setcantidad(this.productoprodumerma.getcantidad());	
				productoprodumermaAux.setcosto(this.productoprodumerma.getcosto());	
				productoprodumermaAux.setcosto_total(this.productoprodumerma.getcosto_total());	
				productoprodumermaAux.setdescripcion(this.productoprodumerma.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productoprodumermaAux,productoprodumermaLogic.getProductoProduMermas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoprodumermaAux,productoprodumermas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.productoprodumermaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoprodumermaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodumermaLogic.saveProductoProduMermas();//WithConnection
						//productoprodumermaLogic.getSetVersionRowProductoProduMermas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.productoprodumerma,productoprodumermaAux);
					
					this.refrescarForeignKeysDescripcionesProductoProduMerma();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoprodumermaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoprodumermaLogic.saveProductoProduMermaRelaciones(productoprodumermaAux);//WithConnection
								//productoprodumermaLogic.getSetVersionRowProductoProduMermas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.productoprodumerma,productoprodumermaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.productoprodumermaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.productoprodumermaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(productoprodumermaAux,productoprodumermaLogic.getProductoProduMermas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(productoprodumermaAux,productoprodumermas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.productoprodumerma,productoprodumermaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				productoprodumermaAux=new  ProductoProduMerma();
				
				productoprodumermaAux.setIsNew(false);
				productoprodumermaAux.setIsChanged(false);
				
				productoprodumermaAux.setIsDeleted(true);
				
				productoprodumermaAux.setId(this.productoprodumerma.getId());	
				productoprodumermaAux.setVersionRow(this.productoprodumerma.getVersionRow());	
				productoprodumermaAux.setid_producto_defi_produ(this.productoprodumerma.getid_producto_defi_produ());	
				productoprodumermaAux.setid_tipo_merma_empresa(this.productoprodumerma.getid_tipo_merma_empresa());	
				productoprodumermaAux.setid_unidad(this.productoprodumerma.getid_unidad());	
				productoprodumermaAux.setcantidad(this.productoprodumerma.getcantidad());	
				productoprodumermaAux.setcosto(this.productoprodumerma.getcosto());	
				productoprodumermaAux.setcosto_total(this.productoprodumerma.getcosto_total());	
				productoprodumermaAux.setdescripcion(this.productoprodumerma.getdescripcion());	
				
				if(this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.productoprodumermaAux.getId()>=0) {	
						this.productoprodumermasEliminados.add(productoprodumermaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(productoprodumermaAux,productoprodumermaLogic.getProductoProduMermas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoprodumermaAux,productoprodumermas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.productoprodumermaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoprodumermaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodumermaLogic.saveProductoProduMermas();//WithConnection
						//productoprodumermaLogic.getSetVersionRowProductoProduMermas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoprodumermaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoprodumermaLogic.saveProductoProduMermaRelaciones(productoprodumermaAux);//WithConnection
								//productoprodumermaLogic.getSetVersionRowProductoProduMermas();//WithConnection
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
							if(this.productoprodumermaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.productoprodumermaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(productoprodumermaAux,productoprodumermaLogic.getProductoProduMermas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(productoprodumermaAux,productoprodumermas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumermaLogic.getProductoProduMermas().addAll(this.productoprodumermasEliminados);
					
					productoprodumermaLogic.saveProductoProduMermas();//WithConnection
					//productoprodumermaLogic.getSetVersionRowProductoProduMermas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesProductoProduMerma();
				
				this.productoprodumermasEliminados= new ArrayList<ProductoProduMerma>();		
			}
			
			if(this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Producto Merma Produccion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Producto Merma Produccion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.productoprodumerma=productoprodumermaAux;
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
      		//this.finishProcessProductoProduMerma();
      	}
		
	}	
	
	public void actualizarRelaciones(ProductoProduMerma productoprodumermaLocal) throws Exception {
		
		if(this.productoprodumermaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProductoProduMerma productoprodumermaLocal) throws Exception {	
		if(this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(ProductoDefiProduDetalleFormJInternalFrame.class)) {
				ProductoDefiProduBeanSwingJInternalFrame productodefiproduBeanSwingJInternalFrameLocal=(ProductoDefiProduBeanSwingJInternalFrame) ((ProductoDefiProduDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productodefiproduBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProductoDefiProdu(productodefiproduBeanSwingJInternalFrameLocal.getproductodefiprodu(),true);
				productodefiproduBeanSwingJInternalFrameLocal.actualizarLista(productodefiproduBeanSwingJInternalFrameLocal.productodefiprodu,this.productodefiprodusForeignKey);

				productodefiproduBeanSwingJInternalFrameLocal.actualizarRelaciones(productodefiproduBeanSwingJInternalFrameLocal.productodefiprodu);

				productoprodumermaLocal.setProductoDefiProdu(productodefiproduBeanSwingJInternalFrameLocal.productodefiprodu);

				this.addItemDefectoCombosForeignKeyProductoDefiProdu();
				this.cargarCombosFrameProductoDefiProdusForeignKey("Formulario");
				this.setActualProductoDefiProduForeignKey(productodefiproduBeanSwingJInternalFrameLocal.productodefiprodu.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoMermaEmpresaDetalleFormJInternalFrame.class)) {
				TipoMermaEmpresaBeanSwingJInternalFrame tipomermaempresaBeanSwingJInternalFrameLocal=(TipoMermaEmpresaBeanSwingJInternalFrame) ((TipoMermaEmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipomermaempresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoMermaEmpresa(tipomermaempresaBeanSwingJInternalFrameLocal.gettipomermaempresa(),true);
				tipomermaempresaBeanSwingJInternalFrameLocal.actualizarLista(tipomermaempresaBeanSwingJInternalFrameLocal.tipomermaempresa,this.tipomermaempresasForeignKey);

				tipomermaempresaBeanSwingJInternalFrameLocal.actualizarRelaciones(tipomermaempresaBeanSwingJInternalFrameLocal.tipomermaempresa);

				productoprodumermaLocal.setTipoMermaEmpresa(tipomermaempresaBeanSwingJInternalFrameLocal.tipomermaempresa);

				this.addItemDefectoCombosForeignKeyTipoMermaEmpresa();
				this.cargarCombosFrameTipoMermaEmpresasForeignKey("Formulario");
				this.setActualTipoMermaEmpresaForeignKey(tipomermaempresaBeanSwingJInternalFrameLocal.tipomermaempresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UnidadDetalleFormJInternalFrame.class)) {
				UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrameLocal=(UnidadBeanSwingJInternalFrame) ((UnidadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				unidadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUnidad(unidadBeanSwingJInternalFrameLocal.getunidad(),true);
				unidadBeanSwingJInternalFrameLocal.actualizarLista(unidadBeanSwingJInternalFrameLocal.unidad,this.unidadsForeignKey);

				unidadBeanSwingJInternalFrameLocal.actualizarRelaciones(unidadBeanSwingJInternalFrameLocal.unidad);

				productoprodumermaLocal.setUnidad(unidadBeanSwingJInternalFrameLocal.unidad);

				this.addItemDefectoCombosForeignKeyUnidad();
				this.cargarCombosFrameUnidadsForeignKey("Formulario");
				this.setActualUnidadForeignKey(unidadBeanSwingJInternalFrameLocal.unidad.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProductoProduMermaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProductoProduMerma.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productoprodumerma =(ProductoProduMerma) this.productoprodumermaLogic.getProductoProduMermas().toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.productoprodumerma =(ProductoProduMerma) this.productoprodumermas.toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = productoprodumermaValidator.getInvalidValues(this.productoprodumerma);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProductoProduMerma productoprodumerma,List<ProductoProduMerma> productoprodumermas) throws Exception {
		try	{		
			ProductoProduMermaConstantesFunciones.actualizarLista(productoprodumerma,productoprodumermas,this.productoprodumermaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ProductoProduMerma productoprodumerma,List<ProductoProduMerma> productoprodumermas) throws Exception {
		try	{			
			ProductoProduMermaConstantesFunciones.actualizarSelectedLista(productoprodumerma,productoprodumermas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProductoProduMerma> productoprodumermasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				productoprodumermasLocal=this.productoprodumermaLogic.getProductoProduMermas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				productoprodumermasLocal=this.productoprodumermas;
			}
			//ARCHITECTURE
		
			for(ProductoProduMerma productoprodumermaLocal:productoprodumermasLocal) {
				if(this.permiteMantenimiento(productoprodumermaLocal) && productoprodumermaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProductoProduMermaConstantesFunciones.getProductoProduMermaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProductoProduMermaConstantesFunciones.IDPRODUCTODEFIPRODU)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduMerma.jLabelid_producto_defi_produProductoProduMerma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProduMermaConstantesFunciones.IDTIPOMERMAEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduMerma.jLabelid_tipo_merma_empresaProductoProduMerma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProduMermaConstantesFunciones.IDUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduMerma.jLabelid_unidadProductoProduMerma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProduMermaConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduMerma.jLabelcantidadProductoProduMerma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProduMermaConstantesFunciones.COSTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduMerma.jLabelcostoProductoProduMerma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProduMermaConstantesFunciones.COSTOTOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduMerma.jLabelcosto_totalProductoProduMerma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProduMermaConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduMerma.jLabeldescripcionProductoProduMerma,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProductoProduMerma!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProduMerma.jLabelid_producto_defi_produProductoProduMerma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProduMerma.jLabelid_tipo_merma_empresaProductoProduMerma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProduMerma.jLabelid_unidadProductoProduMerma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProduMerma.jLabelcantidadProductoProduMerma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProduMerma.jLabelcostoProductoProduMerma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProduMerma.jLabelcosto_totalProductoProduMerma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProduMerma.jLabeldescripcionProductoProduMerma,"");
		
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
		this.iIdNuevoProductoProduMerma--;	
		
		
		this.productoprodumermaAux=new ProductoProduMerma();
		
		this.productoprodumermaAux.setId(this.iIdNuevoProductoProduMerma);
		this.productoprodumermaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productoprodumermaLogic.getProductoProduMermas().add(this.productoprodumermaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.productoprodumermas.add(this.productoprodumermaAux);
		}
		//ARCHITECTURE
		
		this.productoprodumerma=this.productoprodumermaAux;
		
		if(ProductoProduMermaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProductoProduMerma(this.productoprodumerma);
			this.setVariablesObjetoActualToFormularioForeignKeyProductoProduMerma(this.productoprodumerma);
		}
				
		//this.setDefaultControlesProductoProduMerma();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProductoProduMerma();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProductoProduMerma();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductoProduMerma();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductoProduMerma(this.productoprodumermaBean,this.productoprodumerma,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMerma(this.productoprodumerma);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ProductoProduMermaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.productoprodumermaSessionBean.getConGuardarRelaciones()) {
			classes=ProductoProduMermaConstantesFunciones.getClassesRelationshipsOfProductoProduMerma(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.productoprodumermaReturnGeneral=productoprodumermaLogic.procesarEventosProductoProduMermasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoprodumermaLogic.getProductoProduMermas(),this.productoprodumerma,this.productoprodumermaParameterGeneral,this.isEsNuevoProductoProduMerma,classes);//this.productoprodumermaLogic.getProductoProduMerma()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProductoProduMerma(this.productoprodumermaReturnGeneral,this.productoprodumermaBean,false);
		
		if(this.productoprodumermaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProductoProduMerma(this.productoprodumermaReturnGeneral.getProductoProduMerma());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProductoProduMerma(this.productoprodumermaReturnGeneral.getProductoProduMerma());
		}
		
		if(this.productoprodumermaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProductoProduMerma(this.productoprodumermaReturnGeneral.getProductoProduMerma(),classes);//this.productoprodumermaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProductoProduMerma(this.productoprodumerma,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProductoProduMerma();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProductoProduMerma();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductoProduMermaBeanSwingJInternalFrameAdditional.RecargarFormProductoProduMerma(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProductoProduMerma(false);
						
			if(productoprodumermaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProductoProduMermaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoProduMerma();
			}
			
			this.actualizarVisualTableDatosProductoProduMerma();
			
			this.jTableDatosProductoProduMerma.setRowSelectionInterval(this.getIndiceNuevoProductoProduMerma(), this.getIndiceNuevoProductoProduMerma());
			
			this.seleccionarFilaTablaProductoProduMermaActual();
						
			this.actualizarEstadoCeldasBotonesProductoProduMerma("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProductoProduMerma(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProductoProduMerma.jTextFieldcantidadProductoProduMerma.setEnabled(isHabilitar && this.productoprodumermaConstantesFunciones.activarcantidadProductoProduMerma);
		this.jInternalFrameDetalleFormProductoProduMerma.jTextFieldcostoProductoProduMerma.setEnabled(isHabilitar && this.productoprodumermaConstantesFunciones.activarcostoProductoProduMerma);
		this.jInternalFrameDetalleFormProductoProduMerma.jTextFieldcosto_totalProductoProduMerma.setEnabled(isHabilitar && this.productoprodumermaConstantesFunciones.activarcosto_totalProductoProduMerma);
		this.jInternalFrameDetalleFormProductoProduMerma.jTextAreadescripcionProductoProduMerma.setEnabled(isHabilitar && this.productoprodumermaConstantesFunciones.activardescripcionProductoProduMerma);	
		
		this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_producto_defi_produProductoProduMerma.setEnabled(isHabilitar && this.productoprodumermaConstantesFunciones.activarid_producto_defi_produProductoProduMerma);
		this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_tipo_merma_empresaProductoProduMerma.setEnabled(isHabilitar && this.productoprodumermaConstantesFunciones.activarid_tipo_merma_empresaProductoProduMerma);
		this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_unidadProductoProduMerma.setEnabled(isHabilitar && this.productoprodumermaConstantesFunciones.activarid_unidadProductoProduMerma);
	};
	
	public void setDefaultControlesProductoProduMerma() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProductoProduMerma(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.productoprodumermaSessionBean.setConGuardarRelaciones(true);			
			this.productoprodumermaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProductoProduMerma.jTabbedPaneRelacionesProductoProduMerma.setVisible(true);
			
					
		} else {
			//this.productoprodumermaSessionBean.setConGuardarRelaciones(false);			
			this.productoprodumermaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProductoProduMerma.jTabbedPaneRelacionesProductoProduMerma.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProductoProduMerma() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoProduMerma productoprodumermaAux:this.productoprodumermaLogic.getProductoProduMermas()) {
				if(productoprodumermaAux.getId().equals(this.iIdNuevoProductoProduMerma)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoProduMerma productoprodumermaAux:this.productoprodumermas) {
				if(productoprodumermaAux.getId().equals(this.iIdNuevoProductoProduMerma)) {
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
	
	public int getIndiceActualProductoProduMerma(ProductoProduMerma productoprodumerma,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoProduMerma productoprodumermaAux:this.productoprodumermaLogic.getProductoProduMermas()) {
				if(productoprodumermaAux.getId().equals(productoprodumerma.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoProduMerma productoprodumermaAux:this.productoprodumermas) {
				if(productoprodumermaAux.getId().equals(productoprodumerma.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProductoProduMerma(ProductoProduMerma productoprodumermaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoProduMerma productoprodumermaAux:this.productoprodumermaLogic.getProductoProduMermas()) {
				if(productoprodumermaAux.getProductoProduMermaOriginal().getId().equals(productoprodumermaOriginal.getId())) {
					existe=true;
					productoprodumermaOriginal.setId(productoprodumermaAux.getId());
					productoprodumermaOriginal.setVersionRow(productoprodumermaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoProduMerma productoprodumermaAux:this.productoprodumermas) {
				if(productoprodumermaAux.getProductoProduMermaOriginal().getId().equals(productoprodumermaOriginal.getId())) {
					existe=true;
					productoprodumermaOriginal.setId(productoprodumermaAux.getId());
					productoprodumermaOriginal.setVersionRow(productoprodumermaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProductoProduMerma(Boolean esParaCancelar) throws Exception {
		productoprodumermasAux=new ArrayList<ProductoProduMerma>();
		productoprodumermaAux=new ProductoProduMerma();
		
		if(!this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductoProduMerma productoprodumermaAux:this.productoprodumermaLogic.getProductoProduMermas()) {
					if(productoprodumermaAux.getId()<0) {
						productoprodumermasAux.add(productoprodumermaAux);
					}		
				}
				this.iIdNuevoProductoProduMerma=0L;
				this.productoprodumermaLogic.getProductoProduMermas().removeAll(productoprodumermasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoProduMerma productoprodumermaAux:this.productoprodumermas) {
					if(productoprodumermaAux.getId()<0) {
						productoprodumermasAux.add(productoprodumermaAux);
					}		
				}
				this.iIdNuevoProductoProduMerma=0L;
				this.productoprodumermas.removeAll(productoprodumermasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProductoProduMerma 
					&& this.productoprodumermaLogic.getProductoProduMermas().size()>0
					) {
					productoprodumermaAux=this.productoprodumermaLogic.getProductoProduMermas().get(this.productoprodumermaLogic.getProductoProduMermas().size() - 1);
				
					if(productoprodumermaAux.getId()<0) {
						this.productoprodumermaLogic.getProductoProduMermas().remove(productoprodumermaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProductoProduMerma && this.productoprodumermas.size()>0) {
					productoprodumermaAux=this.productoprodumermas.get(this.productoprodumermas.size() - 1);
				
					if(productoprodumermaAux.getId()<0) {
						this.productoprodumermas.remove(productoprodumermaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProductoProduMerma(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(productoprodumerma.getId()<0) {
				this.productoprodumermaLogic.getProductoProduMermas().remove(this.productoprodumerma);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(productoprodumerma.getId()<0) {
				this.productoprodumermas.remove(this.productoprodumerma);
			}
		}			
	}
	
	public void setEstadosInicialesProductoProduMerma(List<ProductoProduMerma> productoprodumermasAux) throws Exception {
		ProductoProduMermaConstantesFunciones.setEstadosInicialesProductoProduMerma(productoprodumermasAux);
	}
	
	public void setEstadosInicialesProductoProduMerma(ProductoProduMerma productoprodumermaAux) throws Exception {
		ProductoProduMermaConstantesFunciones.setEstadosInicialesProductoProduMerma(productoprodumermaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProductoProduMermaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProductoProduMerma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProductoProduMermaActual()) {
				if(!this.isEsNuevoProductoProduMerma) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProductoProduMerma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProductoProduMerma=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProductoProduMermaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Producto Merma Produccion ?", "MANTENIMIENTO DE Producto Merma Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProductoProduMerma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProductoProduMerma productoprodumerma) throws Exception {
		ProductoProduMermaConstantesFunciones.seleccionarAsignar(this.productoprodumerma,productoprodumerma);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProductoProduMerma=this.isPermisoActualizarOriginalProductoProduMerma;
			
			
			this.seleccionarAsignar(productoprodumerma);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductoProduMermaConstantesFunciones.quitarEspaciosProductoProduMerma(this.productoprodumerma,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesProductoProduMerma("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.productoprodumermaSessionBean.setsFuncionBusquedaRapida(this.productoprodumermaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProductoProduMerma) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProductoProduMerma(esParaCancelar);				
				this.cancelarNuevoProductoProduMerma(esParaCancelar);								
			}
			
			this.productoprodumerma=new ProductoProduMerma();
			
			this.inicializarProductoProduMerma();
			
			this.actualizarEstadoCeldasBotonesProductoProduMerma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProductoProduMerma() throws Exception {
		try {
			ProductoProduMermaConstantesFunciones.inicializarProductoProduMerma(this.productoprodumerma);
			
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
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.productoprodumermaLogic.getProductoProduMermas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProductoProduMermas(String sAccionBusqueda,List<ProductoProduMerma> productoprodumermasParaReportes) throws Exception {
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
					sPathReporteFinal="ProductoProduMerma"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProductoProduMermaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProductoProduMermaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProductoProduMerma"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Producto Merma Producciones");		
		parameters.put("busquedapor", ProductoProduMermaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProductoProduMerma=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProductoProduMermaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProductoProduMermaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProductoProduMerma=new JRBeanArrayDataSource(ProductoProduMermaJInternalFrame.TraerProductoProduMermaBeans(productoprodumermasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProductoProduMerma);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProductoProduMermaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProductoProduMermaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProductoProduMermaBean.TraerProductoProduMermaBeans(productoprodumermasParaReportes).toArray()));
							
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
				this.generarExcelReporteProductoProduMermas(sAccionBusqueda,sTipoArchivoReporte,productoprodumermasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProductoProduMermas(sAccionBusqueda,sTipoArchivoReporte,productoprodumermasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProductoProduMermaActionPerformed(null);
					//this.generarExcelReporteProductoProduMermas(sAccionBusqueda,sTipoArchivoReporte,productoprodumermasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProductoProduMermas(sAccionBusqueda,sTipoArchivoReporte,productoprodumermasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProductoProduMermas(sAccionBusqueda,sTipoArchivoReporte,productoprodumermasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProductoProduMermas(sAccionBusqueda,sTipoArchivoReporte,productoprodumermasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProductoProduMermas(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoProduMerma> productoprodumermasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoprodumerma";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoProduMermas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductoProduMerma("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProductoProduMerma productoprodumerma : productoprodumermasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProductoProduMermaConstantesFunciones.generarExcelReporteDataProductoProduMerma("NORMAL",row,workbook,productoprodumerma,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Merma Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProductoProduMerma(String sTipo,Row row,Workbook workbook) {
		
		ProductoProduMermaConstantesFunciones.generarExcelReporteHeaderProductoProduMerma(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProductoProduMermas(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoProduMerma> productoprodumermasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoprodumerma_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoProduMermas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProductoProduMerma productoprodumerma : productoprodumermasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProductoProduMermaConstantesFunciones.getProductoProduMermaDescripcion(productoprodumerma));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduMermaConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduMermaConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodumerma.getproductodefiprodu_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduMermaConstantesFunciones.LABEL_IDTIPOMERMAEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduMermaConstantesFunciones.LABEL_IDTIPOMERMAEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodumerma.gettipomermaempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduMermaConstantesFunciones.LABEL_IDUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduMermaConstantesFunciones.LABEL_IDUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodumerma.getunidad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduMermaConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduMermaConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodumerma.getcantidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduMermaConstantesFunciones.LABEL_COSTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduMermaConstantesFunciones.LABEL_COSTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodumerma.getcosto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduMermaConstantesFunciones.LABEL_COSTOTOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduMermaConstantesFunciones.LABEL_COSTOTOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodumerma.getcosto_total());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduMermaConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduMermaConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodumerma.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Merma Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProductoProduMermas(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoProduMerma> productoprodumermasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProductoProduMerma> productoprodumermasRespaldo=null;
		
		classes=ProductoProduMermaConstantesFunciones.getClassesRelationshipsOfProductoProduMerma(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.productoprodumermaLogic.setDatosCliente(this.datosCliente);
		this.productoprodumermaLogic.setDatosDeep(this.datosDeep);
		this.productoprodumermaLogic.setIsConDeep(true);
		
		productoprodumermasRespaldo=this.productoprodumermaLogic.getProductoProduMermas();
		
		this.productoprodumermaLogic.setProductoProduMermas(productoprodumermasParaReportes);	
		this.productoprodumermaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		productoprodumermasParaReportes=this.productoprodumermaLogic.getProductoProduMermas();
		this.productoprodumermaLogic.setProductoProduMermas(productoprodumermasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoprodumerma_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoProduMermas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductoProduMerma("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProductoProduMerma productoprodumerma : productoprodumermasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProductoProduMerma("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProductoProduMermaConstantesFunciones.generarExcelReporteDataProductoProduMerma("NORMAL",row,workbook,productoprodumerma,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProductoProduMermaConstantesFunciones.getProductoProduMermaDescripcion(productoprodumerma));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Merma Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductoProduMerma.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoProduMerma.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductoProduMerma.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoProduMerma.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProductoProduMerma() throws Exception {		
		this.startProcessProductoProduMerma(true);
	}
	
	public void startProcessProductoProduMerma(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProductoProduMerma ,this.jPanelParametrosReportesProductoProduMerma, this.jScrollPanelDatosProductoProduMerma,this.jPanelPaginacionProductoProduMerma, this.jScrollPanelDatosEdicionProductoProduMerma, this.jPanelAccionesProductoProduMerma,this.jPanelAccionesFormularioProductoProduMerma,this.jmenuBarProductoProduMerma,this.jmenuBarDetalleProductoProduMerma,this.jTtoolBarProductoProduMerma,this.jTtoolBarDetalleProductoProduMerma);		
		
		final JTabbedPane jTabbedPaneBusquedasProductoProduMerma=this.jTabbedPaneBusquedasProductoProduMerma; 
		
		final JPanel jPanelParametrosReportesProductoProduMerma=this.jPanelParametrosReportesProductoProduMerma;
		//final JScrollPane jScrollPanelDatosProductoProduMerma=this.jScrollPanelDatosProductoProduMerma;
		final JTable jTableDatosProductoProduMerma=this.jTableDatosProductoProduMerma;		
		final JPanel jPanelPaginacionProductoProduMerma=this.jPanelPaginacionProductoProduMerma;
		//final JScrollPane jScrollPanelDatosEdicionProductoProduMerma=this.jScrollPanelDatosEdicionProductoProduMerma;
		final JPanel jPanelAccionesProductoProduMerma=this.jPanelAccionesProductoProduMerma;
		
		JPanel jPanelCamposAuxiliarProductoProduMerma=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProductoProduMerma=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProductoProduMerma!=null) {
			jPanelCamposAuxiliarProductoProduMerma=this.jInternalFrameDetalleFormProductoProduMerma.jPanelCamposProductoProduMerma;
			jPanelAccionesFormularioAuxiliarProductoProduMerma=this.jInternalFrameDetalleFormProductoProduMerma.jPanelAccionesFormularioProductoProduMerma;
		}
		
		final JPanel jPanelCamposProductoProduMerma=jPanelCamposAuxiliarProductoProduMerma;
		final JPanel jPanelAccionesFormularioProductoProduMerma=jPanelAccionesFormularioAuxiliarProductoProduMerma;
		
		
		final JMenuBar jmenuBarProductoProduMerma=this.jmenuBarProductoProduMerma;
		final JToolBar jTtoolBarProductoProduMerma=this.jTtoolBarProductoProduMerma;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProductoProduMerma=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductoProduMerma=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProductoProduMerma!=null) {
			jmenuBarDetalleAuxiliarProductoProduMerma=this.jInternalFrameDetalleFormProductoProduMerma.jmenuBarDetalleProductoProduMerma;
			jTtoolBarDetalleAuxiliarProductoProduMerma=this.jInternalFrameDetalleFormProductoProduMerma.jTtoolBarDetalleProductoProduMerma;
		}
		
		final JMenuBar jmenuBarDetalleProductoProduMerma=jmenuBarDetalleAuxiliarProductoProduMerma;
		final JToolBar jTtoolBarDetalleProductoProduMerma=jTtoolBarDetalleAuxiliarProductoProduMerma;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductoProduMerma;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductoProduMerma;
			processRunnable.jTableDatos=jTableDatosProductoProduMerma;
			processRunnable.jPanelCampos=jPanelCamposProductoProduMerma;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductoProduMerma;
			processRunnable.jPanelAcciones=jPanelAccionesProductoProduMerma;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductoProduMerma;
			
			
			processRunnable.jmenuBar=jmenuBarProductoProduMerma;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductoProduMerma;
			processRunnable.jTtoolBar=jTtoolBarProductoProduMerma;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductoProduMerma;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductoProduMerma ,jPanelParametrosReportesProductoProduMerma,jTableDatosProductoProduMerma, /*jScrollPanelDatosProductoProduMerma,*/jPanelCamposProductoProduMerma,jPanelPaginacionProductoProduMerma, /*jScrollPanelDatosEdicionProductoProduMerma,*/ jPanelAccionesProductoProduMerma,jPanelAccionesFormularioProductoProduMerma,jmenuBarProductoProduMerma,jmenuBarDetalleProductoProduMerma,jTtoolBarProductoProduMerma,jTtoolBarDetalleProductoProduMerma);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductoProduMerma ,jPanelParametrosReportesProductoProduMerma, jScrollPanelDatosProductoProduMerma,jPanelPaginacionProductoProduMerma, jScrollPanelDatosEdicionProductoProduMerma, jPanelAccionesProductoProduMerma,jPanelAccionesFormularioProductoProduMerma,jmenuBarProductoProduMerma,jmenuBarDetalleProductoProduMerma,jTtoolBarProductoProduMerma,jTtoolBarDetalleProductoProduMerma);
						
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
	
	public void finishProcessProductoProduMerma() {// throws Exception 
		this.finishProcessProductoProduMerma(true);
	}
	
	public void finishProcessProductoProduMerma(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProductoProduMerma ,this.jPanelParametrosReportesProductoProduMerma, this.jScrollPanelDatosProductoProduMerma,this.jPanelPaginacionProductoProduMerma, this.jScrollPanelDatosEdicionProductoProduMerma, this.jPanelAccionesProductoProduMerma,this.jPanelAccionesFormularioProductoProduMerma,this.jmenuBarProductoProduMerma,this.jmenuBarDetalleProductoProduMerma,this.jTtoolBarProductoProduMerma,this.jTtoolBarDetalleProductoProduMerma);		
		
		final JTabbedPane jTabbedPaneBusquedasProductoProduMerma=this.jTabbedPaneBusquedasProductoProduMerma; 
		
		final JPanel jPanelParametrosReportesProductoProduMerma=this.jPanelParametrosReportesProductoProduMerma;
		//final JScrollPane jScrollPanelDatosProductoProduMerma=this.jScrollPanelDatosProductoProduMerma;
		final JTable jTableDatosProductoProduMerma=this.jTableDatosProductoProduMerma;		
		final JPanel jPanelPaginacionProductoProduMerma=this.jPanelPaginacionProductoProduMerma;
		//final JScrollPane jScrollPanelDatosEdicionProductoProduMerma=this.jScrollPanelDatosEdicionProductoProduMerma;
		final JPanel jPanelAccionesProductoProduMerma=this.jPanelAccionesProductoProduMerma;
		
		JPanel jPanelCamposAuxiliarProductoProduMerma=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProductoProduMerma=new JPanel();
		
		if(this.jInternalFrameDetalleFormProductoProduMerma!=null) {
			jPanelCamposAuxiliarProductoProduMerma=this.jInternalFrameDetalleFormProductoProduMerma.jPanelCamposProductoProduMerma;
			jPanelAccionesFormularioAuxiliarProductoProduMerma=this.jInternalFrameDetalleFormProductoProduMerma.jPanelAccionesFormularioProductoProduMerma;
		}
		
		final JPanel jPanelCamposProductoProduMerma=jPanelCamposAuxiliarProductoProduMerma;
		final JPanel jPanelAccionesFormularioProductoProduMerma=jPanelAccionesFormularioAuxiliarProductoProduMerma;
		
		
		final JMenuBar jmenuBarProductoProduMerma=this.jmenuBarProductoProduMerma;		
		final JToolBar jTtoolBarProductoProduMerma=this.jTtoolBarProductoProduMerma;
				
		JMenuBar jmenuBarDetalleAuxiliarProductoProduMerma=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductoProduMerma=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProductoProduMerma!=null) {
			jmenuBarDetalleAuxiliarProductoProduMerma=this.jInternalFrameDetalleFormProductoProduMerma.jmenuBarDetalleProductoProduMerma;
			jTtoolBarDetalleAuxiliarProductoProduMerma=this.jInternalFrameDetalleFormProductoProduMerma.jTtoolBarDetalleProductoProduMerma;		
		}
		
		final JMenuBar jmenuBarDetalleProductoProduMerma=jmenuBarDetalleAuxiliarProductoProduMerma;
		final JToolBar jTtoolBarDetalleProductoProduMerma=jTtoolBarDetalleAuxiliarProductoProduMerma;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductoProduMerma;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductoProduMerma;
			processRunnable.jTableDatos=jTableDatosProductoProduMerma;
			processRunnable.jPanelCampos=jPanelCamposProductoProduMerma;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductoProduMerma;
			processRunnable.jPanelAcciones=jPanelAccionesProductoProduMerma;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductoProduMerma;
			
			
			processRunnable.jmenuBar=jmenuBarProductoProduMerma;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductoProduMerma;
			processRunnable.jTtoolBar=jTtoolBarProductoProduMerma;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductoProduMerma;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProductoProduMerma ,jPanelParametrosReportesProductoProduMerma, jTableDatosProductoProduMerma,/*jScrollPanelDatosProductoProduMerma,*/jPanelCamposProductoProduMerma,jPanelPaginacionProductoProduMerma, /*jScrollPanelDatosEdicionProductoProduMerma,*/ jPanelAccionesProductoProduMerma,jPanelAccionesFormularioProductoProduMerma,jmenuBarProductoProduMerma,jmenuBarDetalleProductoProduMerma,jTtoolBarProductoProduMerma,jTtoolBarDetalleProductoProduMerma));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProductoProduMerma(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProductoProduMerma(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProductoProduMerma(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProductoProduMerma(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProductoProduMerma,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProductoProduMerma,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProductoProduMerma(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProductoProduMerma,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProductoProduMerma,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.productoprodumermaConstantesFunciones.getsFinalQueryProductoProduMerma();
		String  finalQueryPaginacionTodos=this.productoprodumermaConstantesFunciones.getsFinalQueryProductoProduMerma();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProductoProduMermaConstantesFunciones.getArrayColumnasGlobalesNoProductoProduMerma(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProductoProduMermaConstantesFunciones.getArrayColumnasGlobalesProductoProduMerma(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProductoProduMermaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.productoprodumermasEliminados= new ArrayList<ProductoProduMerma>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProductoProduMerma();
		
				///*ProductoProduMermaSessionBean*/this.productoprodumermaSessionBean=new ProductoProduMermaSessionBean();
			
			if(this.productoprodumermaSessionBean==null) {
				this.productoprodumermaSessionBean=new ProductoProduMermaSessionBean();
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
					this.iNumeroPaginacion=ProductoProduMermaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProductoProduMermaConstantesFunciones.getClassesForeignKeysOfProductoProduMerma(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/productoprodumerma."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			productoprodumermasAux= new ArrayList<ProductoProduMerma>();
			
				
			productoprodumermaLogic.setDatosCliente(this.datosCliente);
			productoprodumermaLogic.setDatosDeep(this.datosDeep);
			productoprodumermaLogic.setIsConDeep(true);
			
			
			productoprodumermaLogic.getProductoProduMermaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					productoprodumermaLogic.getTodosProductoProduMermas(finalQueryGlobal,pagination);
					
					//productoprodumermaLogic.getTodosProductoProduMermasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(productoprodumermaLogic.getProductoProduMermas()==null|| productoprodumermaLogic.getProductoProduMermas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoprodumermasAux= new ArrayList<ProductoProduMerma>();
							productoprodumermasAux.addAll(productoprodumermaLogic.getProductoProduMermas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodumermasAux= new ArrayList<ProductoProduMerma>();
							productoprodumermasAux.addAll(productoprodumermas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoprodumermaLogic.getTodosProductoProduMermas(finalQueryGlobal+"",this.pagination);												
							
							//productoprodumermaLogic.getTodosProductoProduMermasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteProductoProduMermas("Todos",productoprodumermaLogic.getProductoProduMermas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoprodumermaLogic.setProductoProduMermas(new ArrayList<ProductoProduMerma>());					
							productoprodumermaLogic.getProductoProduMermas().addAll(productoprodumermasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodumermas=new ArrayList<ProductoProduMerma>();
							productoprodumermas.addAll(productoprodumermasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idProductoProduMerma=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idProductoProduMerma=this.idActual;
				
				} else if(this.idProductoProduMermaActual!=null && this.idProductoProduMermaActual!=0L) {
					idProductoProduMerma=idProductoProduMermaActual;
				}
				
					
				this.sDetalleReporte=ProductoProduMermaConstantesFunciones.getDetalleIndicePorId(idProductoProduMerma);
				
				this.productoprodumermas=new ArrayList<ProductoProduMerma>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					productoprodumermaLogic.getEntity(idProductoProduMerma);
					
					//productoprodumermaLogic.getEntityWithConnection(idProductoProduMerma);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoprodumermaLogic.setProductoProduMermas(new ArrayList<ProductoProduMerma>());
					productoprodumermaLogic.getProductoProduMermas().add(productoprodumermaLogic.getProductoProduMerma());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoprodumermas=new ArrayList<ProductoProduMerma>();
					this.productoprodumermas.add(productoprodumerma);
				}
				
				if(productoprodumermaLogic.getProductoProduMerma()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdProductoDefiProdu")) {
				this.sDetalleReporte=ProductoProduMermaConstantesFunciones.getDetalleIndiceFK_IdProductoDefiProdu(id_producto_defi_produFK_IdProductoDefiProdu);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoprodumermaLogic.getProductoProduMermasFK_IdProductoDefiProdu(finalQueryGlobal,pagination,id_producto_defi_produFK_IdProductoDefiProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduMermaConstantesFunciones.getDetalleIndiceFK_IdProductoDefiProdu(id_producto_defi_produFK_IdProductoDefiProdu);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduMermaConstantesFunciones.getDetalleIndiceFK_IdProductoDefiProdu(id_producto_defi_produFK_IdProductoDefiProdu);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoprodumermaLogic.getProductoProduMermas()==null||productoprodumermaLogic.getProductoProduMermas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoprodumermas==null|| productoprodumermas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodumermasAux=new ArrayList<ProductoProduMerma>();
						productoprodumermasAux.addAll(productoprodumermaLogic.getProductoProduMermas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodumermasAux=new ArrayList<ProductoProduMerma>();
							productoprodumermasAux.addAll(productoprodumermas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoprodumermaLogic.getProductoProduMermasFK_IdProductoDefiProdu(finalQueryGlobal,pagination,id_producto_defi_produFK_IdProductoDefiProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduMermaConstantesFunciones.getDetalleIndiceFK_IdProductoDefiProdu(id_producto_defi_produFK_IdProductoDefiProdu);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduMermaConstantesFunciones.getDetalleIndiceFK_IdProductoDefiProdu(id_producto_defi_produFK_IdProductoDefiProdu);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoProduMermas("FK_IdProductoDefiProdu",productoprodumermaLogic.getProductoProduMermas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoProduMermas("FK_IdProductoDefiProdu",productoprodumermas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodumermaLogic.setProductoProduMermas(new ArrayList<ProductoProduMerma>());
						productoprodumermaLogic.getProductoProduMermas().addAll(productoprodumermasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodumermas=new ArrayList<ProductoProduMerma>();
							productoprodumermas.addAll(productoprodumermasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoMermaEmpresa")) {
				this.sDetalleReporte=ProductoProduMermaConstantesFunciones.getDetalleIndiceFK_IdTipoMermaEmpresa(id_tipo_merma_empresaFK_IdTipoMermaEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoprodumermaLogic.getProductoProduMermasFK_IdTipoMermaEmpresa(finalQueryGlobal,pagination,id_tipo_merma_empresaFK_IdTipoMermaEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduMermaConstantesFunciones.getDetalleIndiceFK_IdTipoMermaEmpresa(id_tipo_merma_empresaFK_IdTipoMermaEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduMermaConstantesFunciones.getDetalleIndiceFK_IdTipoMermaEmpresa(id_tipo_merma_empresaFK_IdTipoMermaEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoprodumermaLogic.getProductoProduMermas()==null||productoprodumermaLogic.getProductoProduMermas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoprodumermas==null|| productoprodumermas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodumermasAux=new ArrayList<ProductoProduMerma>();
						productoprodumermasAux.addAll(productoprodumermaLogic.getProductoProduMermas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodumermasAux=new ArrayList<ProductoProduMerma>();
							productoprodumermasAux.addAll(productoprodumermas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoprodumermaLogic.getProductoProduMermasFK_IdTipoMermaEmpresa(finalQueryGlobal,pagination,id_tipo_merma_empresaFK_IdTipoMermaEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduMermaConstantesFunciones.getDetalleIndiceFK_IdTipoMermaEmpresa(id_tipo_merma_empresaFK_IdTipoMermaEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduMermaConstantesFunciones.getDetalleIndiceFK_IdTipoMermaEmpresa(id_tipo_merma_empresaFK_IdTipoMermaEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoProduMermas("FK_IdTipoMermaEmpresa",productoprodumermaLogic.getProductoProduMermas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoProduMermas("FK_IdTipoMermaEmpresa",productoprodumermas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodumermaLogic.setProductoProduMermas(new ArrayList<ProductoProduMerma>());
						productoprodumermaLogic.getProductoProduMermas().addAll(productoprodumermasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodumermas=new ArrayList<ProductoProduMerma>();
							productoprodumermas.addAll(productoprodumermasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUnidad")) {
				this.sDetalleReporte=ProductoProduMermaConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoprodumermaLogic.getProductoProduMermasFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduMermaConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduMermaConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoprodumermaLogic.getProductoProduMermas()==null||productoprodumermaLogic.getProductoProduMermas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoprodumermas==null|| productoprodumermas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodumermasAux=new ArrayList<ProductoProduMerma>();
						productoprodumermasAux.addAll(productoprodumermaLogic.getProductoProduMermas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodumermasAux=new ArrayList<ProductoProduMerma>();
							productoprodumermasAux.addAll(productoprodumermas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoprodumermaLogic.getProductoProduMermasFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduMermaConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduMermaConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoProduMermas("FK_IdUnidad",productoprodumermaLogic.getProductoProduMermas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoProduMermas("FK_IdUnidad",productoprodumermas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodumermaLogic.setProductoProduMermas(new ArrayList<ProductoProduMerma>());
						productoprodumermaLogic.getProductoProduMermas().addAll(productoprodumermasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodumermas=new ArrayList<ProductoProduMerma>();
							productoprodumermas.addAll(productoprodumermasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProductoProduMerma();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProductoProduMerma();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productoprodumermaLogic.getProductoProduMermas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoprodumermas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productoprodumermaLogic.getProductoProduMermas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoprodumermas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProductoProduMerma productoprodumerma) {
		Boolean permite=true;
		
		if(this.productoprodumerma.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProductoProduMermaConstantesFunciones.getOrderByListaProductoProduMerma();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProductoProduMermaConstantesFunciones.getOrderByListaProductoProduMerma();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoProduMerma productoprodumerma:productoprodumermaLogic.getProductoProduMermas()) {
				if(productoprodumerma.getsType().equals(Constantes2.S_TOTALES)) {
					productoprodumermaTotales=productoprodumerma;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoProduMerma productoprodumerma:this.productoprodumermas) {
				if(productoprodumerma.getsType().equals(Constantes2.S_TOTALES)) {
					productoprodumermaTotales=productoprodumerma;
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
			this.productoprodumermaAux=new ProductoProduMerma();
			this.productoprodumermaAux.setsType(Constantes2.S_TOTALES);
			this.productoprodumermaAux.setIsNew(false);
			this.productoprodumermaAux.setIsChanged(false);
			this.productoprodumermaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ProductoProduMermaConstantesFunciones.TotalizarValoresFilaProductoProduMerma(this.productoprodumermaLogic.getProductoProduMermas(),this.productoprodumermaAux);
				
				this.productoprodumermaLogic.getProductoProduMermas().add(this.productoprodumermaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProductoProduMermaConstantesFunciones.TotalizarValoresFilaProductoProduMerma(this.productoprodumermas,this.productoprodumermaAux);
				
				this.productoprodumermas.add(this.productoprodumermaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		productoprodumermaTotales=new ProductoProduMerma();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productoprodumermaLogic.getProductoProduMermas().remove(productoprodumermaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productoprodumermas.remove(productoprodumermaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		productoprodumermaTotales=new ProductoProduMerma();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoProduMerma productoprodumerma:productoprodumermaLogic.getProductoProduMermas()) {
				if(productoprodumerma.getsType().equals(Constantes2.S_TOTALES)) {
					productoprodumermaTotales=productoprodumerma;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductoProduMermaConstantesFunciones.TotalizarValoresFilaProductoProduMerma(this.productoprodumermaLogic.getProductoProduMermas(),productoprodumermaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoProduMerma productoprodumerma:this.productoprodumermas) {
				if(productoprodumerma.getsType().equals(Constantes2.S_TOTALES)) {
					productoprodumermaTotales=productoprodumerma;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductoProduMermaConstantesFunciones.TotalizarValoresFilaProductoProduMerma(this.productoprodumermas,productoprodumermaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProductoProduMermasFK_IdProductoDefiProdu()throws Exception {
		try {
			sAccionBusqueda="FK_IdProductoDefiProdu";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoProduMermasFK_IdTipoMermaEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoMermaEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoProduMermasFK_IdUnidad()throws Exception {
		try {
			sAccionBusqueda="FK_IdUnidad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProductoProduMermasFK_IdProductoDefiProdu(String sFinalQuery,Long id_producto_defi_produ)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoprodumermaLogic.getProductoProduMermasFK_IdProductoDefiProdu(sFinalQuery,this.pagination,id_producto_defi_produ);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoProduMermasFK_IdTipoMermaEmpresa(String sFinalQuery,Long id_tipo_merma_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoprodumermaLogic.getProductoProduMermasFK_IdTipoMermaEmpresa(sFinalQuery,this.pagination,id_tipo_merma_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoProduMermasFK_IdUnidad(String sFinalQuery,Long id_unidad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoprodumermaLogic.getProductoProduMermasFK_IdUnidad(sFinalQuery,this.pagination,id_unidad);
				
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
	
	public void inicializarPermisosProductoProduMerma() {
		this.isPermisoTodoProductoProduMerma=false;
		this.isPermisoNuevoProductoProduMerma=false;
		this.isPermisoActualizarProductoProduMerma=false;
		this.isPermisoActualizarOriginalProductoProduMerma=false;
		this.isPermisoEliminarProductoProduMerma=false;
		this.isPermisoGuardarCambiosProductoProduMerma=false;
		this.isPermisoConsultaProductoProduMerma=false;
		this.isPermisoBusquedaProductoProduMerma=false;
		this.isPermisoReporteProductoProduMerma=false;		
		this.isPermisoOrdenProductoProduMerma=false;		
		this.isPermisoPaginacionMedioProductoProduMerma=false;		
		this.isPermisoPaginacionAltoProductoProduMerma=false;
		this.isPermisoPaginacionTodoProductoProduMerma=false;
		this.isPermisoCopiarProductoProduMerma=false;		
		this.isPermisoVerFormProductoProduMerma=false;		
		this.isPermisoDuplicarProductoProduMerma=false;		
		this.isPermisoOrdenProductoProduMerma=false;		
	}
	
	public void setPermisosUsuarioProductoProduMerma(Boolean isPermiso) {
		this.isPermisoTodoProductoProduMerma=isPermiso;
		this.isPermisoNuevoProductoProduMerma=isPermiso;
		this.isPermisoActualizarProductoProduMerma=isPermiso;
		this.isPermisoActualizarOriginalProductoProduMerma=isPermiso;
		this.isPermisoEliminarProductoProduMerma=isPermiso;
		this.isPermisoGuardarCambiosProductoProduMerma=isPermiso;
		this.isPermisoConsultaProductoProduMerma=isPermiso;
		this.isPermisoBusquedaProductoProduMerma=isPermiso;
		this.isPermisoReporteProductoProduMerma=isPermiso;
		this.isPermisoOrdenProductoProduMerma=isPermiso;		
		this.isPermisoPaginacionMedioProductoProduMerma=isPermiso;		
		this.isPermisoPaginacionAltoProductoProduMerma=isPermiso;		
		this.isPermisoPaginacionTodoProductoProduMerma=isPermiso;		
		this.isPermisoCopiarProductoProduMerma=isPermiso;		
		this.isPermisoVerFormProductoProduMerma=isPermiso;		
		this.isPermisoDuplicarProductoProduMerma=isPermiso;
		this.isPermisoOrdenProductoProduMerma=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProductoProduMerma(Boolean isPermiso) {
		//this.isPermisoTodoProductoProduMerma=isPermiso;
		this.isPermisoNuevoProductoProduMerma=isPermiso;
		this.isPermisoActualizarProductoProduMerma=isPermiso;
		this.isPermisoActualizarOriginalProductoProduMerma=isPermiso;
		this.isPermisoEliminarProductoProduMerma=isPermiso;
		this.isPermisoGuardarCambiosProductoProduMerma=isPermiso;
		//this.isPermisoConsultaProductoProduMerma=isPermiso;
		//this.isPermisoBusquedaProductoProduMerma=isPermiso;
		//this.isPermisoReporteProductoProduMerma=isPermiso;
		//this.isPermisoOrdenProductoProduMerma=isPermiso;		
		//this.isPermisoPaginacionMedioProductoProduMerma=isPermiso;		
		//this.isPermisoPaginacionAltoProductoProduMerma=isPermiso;		
		//this.isPermisoPaginacionTodoProductoProduMerma=isPermiso;		
		//this.isPermisoCopiarProductoProduMerma=isPermiso;		
		//this.isPermisoDuplicarProductoProduMerma=isPermiso;
		//this.isPermisoOrdenProductoProduMerma=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProductoProduMermaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProductoProduMermaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProductoProduMerma(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProductoProduMermaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProductoProduMermaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProductoProduMermaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProductoProduMermaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProductoProduMerma() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProductoProduMermaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProductoProduMermaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProductoProduMerma=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProductoProduMerma=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProductoProduMerma=this.isPermisoActualizarProductoProduMerma;
			this.isPermisoEliminarProductoProduMerma=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProductoProduMerma=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProductoProduMerma=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProductoProduMerma=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProductoProduMerma=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProductoProduMerma=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductoProduMerma=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProductoProduMerma=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProductoProduMerma=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProductoProduMerma=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProductoProduMerma=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProductoProduMerma=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProductoProduMerma=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductoProduMerma=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProductoProduMerma.setToolTipText(this.jTableDatosProductoProduMerma.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProductoProduMerma(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProductoProduMerma(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProductoProduMermaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProductoProduMermaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProductoProduMerma() throws Exception {
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
	public void inicializarCombosForeignKeyProductoProduMermaListas()throws Exception {
		try	{						
			
				this.productodefiprodusForeignKey=new ArrayList();
				this.tipomermaempresasForeignKey=new ArrayList();
				this.unidadsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProductoProduMermaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProductoProduMermaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyProductoProduMermaListas(false);
			} else {
			
				this.cargarCombosForeignKeyProductoDefiProduListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoMermaEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoMermaEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipomermaempresasForeignKey==null||this.tipomermaempresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoMermaEmpresaConstantesFunciones.getArrayColumnasGlobalesTipoMermaEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoMermaEmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoMermaEmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoMermaEmpresasForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyProductoProduMermaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ProductoProduMermaParameterReturnGeneral productoprodumermaReturnGeneral=new ProductoProduMermaParameterReturnGeneral();
						
			


				String finalQueryGlobalProductoDefiProdu="";

				if(((this.productodefiprodusForeignKey==null||this.productodefiprodusForeignKey.size()<=0) && this.productoprodumermaConstantesFunciones.cargarid_producto_defi_produProductoProduMerma)
					 || (this.esRecargarFks && this.productoprodumermaConstantesFunciones.cargarid_producto_defi_produProductoProduMerma)) {

					if(!this.productoprodumermaSessionBean.getisBusquedaDesdeForeignKeySesionProductoDefiProdu()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoDefiProduConstantesFunciones.getArrayColumnasGlobalesProductoDefiProdu(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProductoDefiProdu=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoDefiProduConstantesFunciones.TABLENAME);

						finalQueryGlobalProductoDefiProdu=Funciones.GetFinalQueryAppend(finalQueryGlobalProductoDefiProdu, "");
						finalQueryGlobalProductoDefiProdu+=ProductoDefiProduConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductoDefiProdusForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProductoDefiProdu=" WHERE " + ConstantesSql.ID + "="+productoprodumermaSessionBean.getlidProductoDefiProduActual();
					}
				} else {
					finalQueryGlobalProductoDefiProdu="NONE";
				}


				String finalQueryGlobalTipoMermaEmpresa="";

				if(((this.tipomermaempresasForeignKey==null||this.tipomermaempresasForeignKey.size()<=0) && this.productoprodumermaConstantesFunciones.cargarid_tipo_merma_empresaProductoProduMerma)
					 || (this.esRecargarFks && this.productoprodumermaConstantesFunciones.cargarid_tipo_merma_empresaProductoProduMerma)) {

					if(!this.productoprodumermaSessionBean.getisBusquedaDesdeForeignKeySesionTipoMermaEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoMermaEmpresaConstantesFunciones.getArrayColumnasGlobalesTipoMermaEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoMermaEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoMermaEmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoMermaEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoMermaEmpresa, "");
						finalQueryGlobalTipoMermaEmpresa+=TipoMermaEmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoMermaEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoMermaEmpresa=" WHERE " + ConstantesSql.ID + "="+productoprodumermaSessionBean.getlidTipoMermaEmpresaActual();
					}
				} else {
					finalQueryGlobalTipoMermaEmpresa="NONE";
				}


				String finalQueryGlobalUnidad="";

				if(((this.unidadsForeignKey==null||this.unidadsForeignKey.size()<=0) && this.productoprodumermaConstantesFunciones.cargarid_unidadProductoProduMerma)
					 || (this.esRecargarFks && this.productoprodumermaConstantesFunciones.cargarid_unidadProductoProduMerma)) {

					if(!this.productoprodumermaSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UnidadConstantesFunciones.getArrayColumnasGlobalesUnidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUnidad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UnidadConstantesFunciones.TABLENAME);

						finalQueryGlobalUnidad=Funciones.GetFinalQueryAppend(finalQueryGlobalUnidad, "");
						finalQueryGlobalUnidad+=UnidadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUnidadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUnidad=" WHERE " + ConstantesSql.ID + "="+productoprodumermaSessionBean.getlidUnidadActual();
					}
				} else {
					finalQueryGlobalUnidad="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				productoprodumermaReturnGeneral=productoprodumermaLogic.cargarCombosLoteForeignKeyProductoProduMerma(finalQueryGlobalProductoDefiProdu,finalQueryGlobalTipoMermaEmpresa,finalQueryGlobalUnidad);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalProductoDefiProdu.equals("NONE")) {
				this.productodefiprodusForeignKey=productoprodumermaReturnGeneral.getproductodefiprodusForeignKey();
			}

			if(!finalQueryGlobalTipoMermaEmpresa.equals("NONE")) {
				this.tipomermaempresasForeignKey=productoprodumermaReturnGeneral.gettipomermaempresasForeignKey();
			}

			if(!finalQueryGlobalUnidad.equals("NONE")) {
				this.unidadsForeignKey=productoprodumermaReturnGeneral.getunidadsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyProductoProduMerma()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyProductoDefiProdu();
			this.addItemDefectoCombosForeignKeyTipoMermaEmpresa();
			this.addItemDefectoCombosForeignKeyUnidad();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyProductoDefiProdu()throws Exception {
		try {
			if(this.productoprodumermaSessionBean==null) {
				this.productoprodumermaSessionBean=new ProductoProduMermaSessionBean();
			}

			if(!this.productoprodumermaSessionBean.getisBusquedaDesdeForeignKeySesionProductoDefiProdu()) {
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

	public void addItemDefectoCombosForeignKeyTipoMermaEmpresa()throws Exception {
		try {

			if(!this.productoprodumermaSessionBean.getisBusquedaDesdeForeignKeySesionTipoMermaEmpresa()) {
				TipoMermaEmpresa tipomermaempresa=new TipoMermaEmpresa();
				TipoMermaEmpresaConstantesFunciones.setTipoMermaEmpresaDescripcion(tipomermaempresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipomermaempresa.setId(null);

				if(!TipoMermaEmpresaConstantesFunciones.ExisteEnLista(this.tipomermaempresasForeignKey,tipomermaempresa,true)) {

					this.tipomermaempresasForeignKey.add(0,tipomermaempresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyUnidad()throws Exception {
		try {

			if(!this.productoprodumermaSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
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
	
	public void initActionsCombosTodosForeignKeyProductoProduMerma()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProductoProduMerma(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProductoProduMerma()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductoProduMerma();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProductoProduMerma(ProductoProduMerma productoprodumerma)throws Exception {	
		try {
			
			this.setActualProductoDefiProduForeignKey(productoprodumerma.getid_producto_defi_produ(),false,"Formulario");
			this.setActualTipoMermaEmpresaForeignKey(productoprodumerma.getid_tipo_merma_empresa(),false,"Formulario");
			this.setActualUnidadForeignKey(productoprodumerma.getid_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProductoProduMerma(ProductoProduMerma productoprodumerma,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProductoProduMerma()throws Exception {	
		try {
			
			this.setActualProductoDefiProduForeignKey(this.productoprodumermaConstantesFunciones.getid_producto_defi_produ(),false,"Formulario");
			this.setActualTipoMermaEmpresaForeignKey(this.productoprodumermaConstantesFunciones.getid_tipo_merma_empresa(),false,"Formulario");
			this.setActualUnidadForeignKey(this.productoprodumermaConstantesFunciones.getid_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProductoProduMerma()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProductoProduMerma()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProductoProduMerma()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProductoProduMerma()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProductoProduMerma()throws Exception {
		try {
			

			this.cargarCombosFrameProductoDefiProdusForeignKey("Todos");
			this.cargarCombosFrameTipoMermaEmpresasForeignKey("Todos");
			this.cargarCombosFrameUnidadsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProductoProduMerma(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameProductoDefiProdusForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoMermaEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUnidadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProductoProduMerma()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_producto_defi_produProductoProduMerma!=null && this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_producto_defi_produProductoProduMerma.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_producto_defi_produProductoProduMerma.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_tipo_merma_empresaProductoProduMerma!=null && this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_tipo_merma_empresaProductoProduMerma.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_tipo_merma_empresaProductoProduMerma.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_unidadProductoProduMerma!=null && this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_unidadProductoProduMerma.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_unidadProductoProduMerma.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public ProductoProduMermaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProductoProduMermaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProductoProduMermaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.productoprodumermaSessionBean=new ProductoProduMermaSessionBean(); 
		this.productoprodumermaConstantesFunciones=new ProductoProduMermaConstantesFunciones(); 
		this.productoprodumermaBean=new ProductoProduMerma();//(this.productoprodumermaConstantesFunciones); 		
		this.productoprodumermaReturnGeneral=new ProductoProduMermaParameterReturnGeneral(); 
		
		this.productoprodumermaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoprodumermaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProductoProduMermaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProductoProduMermaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProductoProduMermaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProductoProduMerma(true);
			
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
			
			this.productoprodumermaConstantesFunciones=new ProductoProduMermaConstantesFunciones(); 
			this.productoprodumermaBean=new ProductoProduMerma();//this.productoprodumermaConstantesFunciones); 			
			this.productoprodumermaReturnGeneral=new ProductoProduMermaParameterReturnGeneral(); 
		
			ProductoProduMermaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Producto Merma Produccion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.productoprodumerma=new ProductoProduMerma();
			this.productoprodumermas = new ArrayList<ProductoProduMerma>();
			this.productoprodumermasAux = new ArrayList<ProductoProduMerma>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic=new ProductoProduMermaLogic();
				this.productoprodumermaLogic.getNewConnexionToDeep("");
			}
			
			//this.productoprodumermaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.productoprodumermaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProductoProduMerma);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProductoProduMerma!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductoProduMerma);	
					}
					
					if(this.jInternalFrameImportacionProductoProduMerma!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductoProduMerma);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProductoProduMerma!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProductoProduMerma);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProductoProduMerma!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProductoProduMerma);
				this.jInternalFrameDetalleFormProductoProduMerma.setVisible(false);
				this.jInternalFrameDetalleFormProductoProduMerma.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoProduMerma!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductoProduMerma);
					this.jInternalFrameReporteDinamicoProductoProduMerma.setVisible(false);
					this.jInternalFrameReporteDinamicoProductoProduMerma.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProductoProduMerma!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProductoProduMerma);
					this.jInternalFrameImportacionProductoProduMerma.setVisible(false);
					this.jInternalFrameImportacionProductoProduMerma.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProductoProduMerma!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProductoProduMerma);
					this.jInternalFrameOrderByProductoProduMerma.setVisible(false);
					this.jInternalFrameOrderByProductoProduMerma.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProductoProduMermaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProductoProduMermaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.productoprodumermaReturnGeneral=new ProductoProduMermaParameterReturnGeneral();
			
			this.productoprodumermaParameterGeneral=new ProductoProduMermaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.productoprodumermaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProductoProduMermaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductoProduMermaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productoprodumermaSessionBean.getEsGuardarRelacionado(),this.productoprodumermaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductoProduMermaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productoprodumermaSessionBean.getEsGuardarRelacionado(),this.productoprodumermaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProductoProduMerma=false;
			this.isVisibilidadCeldaDuplicarProductoProduMerma=true;
			this.isVisibilidadCeldaCopiarProductoProduMerma=true;
			this.isVisibilidadCeldaVerFormProductoProduMerma=true;
			this.isVisibilidadCeldaOrdenProductoProduMerma=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoProduMerma=false;
			this.isVisibilidadCeldaModificarProductoProduMerma=false;
			this.isVisibilidadCeldaActualizarProductoProduMerma=false;
			this.isVisibilidadCeldaEliminarProductoProduMerma=false;
			this.isVisibilidadCeldaCancelarProductoProduMerma=false;
			this.isVisibilidadCeldaGuardarProductoProduMerma=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProduMerma=false;
			
			
			this.isVisibilidadFK_IdProductoDefiProdu=true;
			this.isVisibilidadFK_IdTipoMermaEmpresa=true;
			this.isVisibilidadFK_IdUnidad=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProductoProduMerma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProductoProduMerma();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProductoProduMerma(false);
			
			this.setPermisosUsuarioProductoProduMerma();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoprodumermaSessionBean.getEsGuardarRelacionado() 
				|| (this.productoprodumermaSessionBean.getEsGuardarRelacionado() && this.productoprodumermaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProductoProduMermaClasesRelacionadas();
			}
			
			if(this.productoprodumermaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProductoProduMermaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProductoProduMermaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProductoProduMerma();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProductoProduMerma();
			}
			
			if(!this.isPermisoBusquedaProductoProduMerma) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProductoProduMerma.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioProductoProduMerma,this.isPermisoPaginacionMedioProductoProduMerma,this.isPermisoPaginacionTodoProductoProduMerma);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProductoProduMermaConstantesFunciones.getTiposSeleccionarProductoProduMerma());
				
				this.tiposColumnasSelect=ProductoProduMermaConstantesFunciones.getTiposSeleccionarProductoProduMerma(true);
				
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
			//if(!this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProductoProduMerma();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioProductoProduMerma(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioProductoProduMerma(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoProduMerma() ;
			
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
			this.tipomermaempresaLogic=new TipoMermaEmpresaLogic();
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
				productoprodumermaImplementable= (ProductoProduMermaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductoProduMermaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				productoprodumermaImplementableHome= (ProductoProduMermaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductoProduMermaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.productoprodumermas= new ArrayList<ProductoProduMerma>();
			this.productoprodumermasEliminados= new ArrayList<ProductoProduMerma>();
						
			this.isEsNuevoProductoProduMerma=false;
			this.esParaAccionDesdeFormularioProductoProduMerma=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.productodefiprodusForeignKey=new ArrayList<ProductoDefiProdu>() ;
			this.tipomermaempresasForeignKey=new ArrayList<TipoMermaEmpresa>() ;
			this.unidadsForeignKey=new ArrayList<Unidad>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProductoProduMerma(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProductoProduMerma();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProductoProduMermaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProductoProduMermaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProductoProduMerma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProductoProduMerma(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProductoProduMerma!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProductoProduMerma();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProductoProduMerma();
			}
			
			ProductoProduMermaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProductoProduMerma.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProductoProduMerma.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProductoProduMerma.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProductoProduMerma(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProductoProduMerma: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProductoProduMerma() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProductoProduMerma")) {
				iIndex=this.jInternalFrameDetalleFormProductoProduMerma.jTabbedPaneRelacionesProductoProduMerma.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProductoProduMerma.jTabbedPaneRelacionesProductoProduMerma.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProductoProduMerma.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProductoProduMerma();	
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
	
	public void cargarCombosForeignKeyProductoProduMerma(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProductoProduMerma(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProductoProduMerma(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProductoProduMermaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProductoProduMerma();
		
		this.cargarCombosFrameForeignKeyProductoProduMerma();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProductoProduMerma();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProductoProduMerma();
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

	public void cargarCombosForeignKeyTipoMermaEmpresa(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoMermaEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoMermaEmpresa();
				this.cargarCombosFrameTipoMermaEmpresasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoMermaEmpresa(this.tipomermaempresasForeignKey);

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
	
	public void jButtonNuevoProductoProduMermaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.productoprodumermaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProductoProduMerma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
			
			
			if(jTableDatosProductoProduMerma.getRowCount()>=1) {
				jTableDatosProductoProduMerma.removeRowSelectionInterval(0, jTableDatosProductoProduMerma.getRowCount()-1);						
			}
			
			this.isEsNuevoProductoProduMerma=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProductoProduMerma(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProductoProduMerma(true);			
			//this.productoprodumerma=new ProductoProduMerma();
			//this.productoprodumerma.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoProduMerma(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoProduMerma() ;
			
			if(ProductoProduMermaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoProduMerma(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.productoprodumerma);	
			this.actualizarInformacion("INFO_PADRE",false,this.productoprodumerma);				
			
			ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
			
			if(this.productoprodumermaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProductoProduMerma: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProductoProduMermaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProductoProduMerma> productoprodumermasSeleccionados=new ArrayList<ProductoProduMerma>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProductoProduMerma.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProductoProduMerma.getSelectedRows().length;			
			}
			
			productoprodumermasSeleccionados=this.getProductoProduMermasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProductoProduMerma--;			
				//ProductoProduMerma productoprodumermaAux= new ProductoProduMerma();			
				//productoprodumermaAux.setId(this.iIdNuevoProductoProduMerma);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProductoProduMerma productoprodumermaOrigen=new ProductoProduMerma();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProductoProduMerma productoprodumermaOrigen : productoprodumermasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProductoProduMerma.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							productoprodumermaOrigen =(ProductoProduMerma) this.productoprodumermaLogic.getProductoProduMermas().toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodumermaOrigen =(ProductoProduMerma) this.productoprodumermas.toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProductoProduMerma();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.productoprodumerma.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProductoProduMerma(productoprodumermaOrigen,this.productoprodumerma,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMerma(this.productoprodumerma);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productoprodumermaLogic.getProductoProduMermas().add(this.productoprodumermaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productoprodumermas.add(this.productoprodumermaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProductoProduMerma(false);
				
				this.jTableDatosProductoProduMerma.setRowSelectionInterval(this.getIndiceNuevoProductoProduMerma(), this.getIndiceNuevoProductoProduMerma());
				
				int iLastRow =  this.jTableDatosProductoProduMerma.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductoProduMerma.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductoProduMerma.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoProduMerma(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProductoProduMermaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProductoProduMerma> productoprodumermasSeleccionados=new ArrayList<ProductoProduMerma>();									
		
			ProductoProduMerma productoprodumermaOrigen=new ProductoProduMerma();
			ProductoProduMerma productoprodumermaDestino=new ProductoProduMerma();
				
			productoprodumermasSeleccionados=this.getProductoProduMermasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProductoProduMerma.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || productoprodumermasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProductoProduMerma.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodumermaOrigen =(ProductoProduMerma) this.productoprodumermaLogic.getProductoProduMermas().toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productoprodumermaOrigen =(ProductoProduMerma) this.productoprodumermas.toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodumermaDestino =(ProductoProduMerma) this.productoprodumermaLogic.getProductoProduMermas().toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productoprodumermaDestino =(ProductoProduMerma) this.productoprodumermas.toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				productoprodumermaOrigen =productoprodumermasSeleccionados.get(0);
				productoprodumermaDestino =productoprodumermasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProductoProduMerma(productoprodumermaOrigen,productoprodumermaDestino,true,false);
				
				productoprodumermaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productoprodumermaDestino,productoprodumermaLogic.getProductoProduMermas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoprodumermaDestino,productoprodumermas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProductoProduMerma(false);
				
				//this.jTableDatosProductoProduMerma.setRowSelectionInterval(this.getIndiceNuevoProductoProduMerma(), this.getIndiceNuevoProductoProduMerma());
				
				int iLastRow =  this.jTableDatosProductoProduMerma.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductoProduMerma.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductoProduMerma.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoProduMerma(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProductoProduMermaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductoProduMerma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProductoProduMerma.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProductoProduMermaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProductoProduMerma.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProductoProduMerma.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProductoProduMerma.setVisible(!isVisible);
			this.jPanelPaginacionProductoProduMerma.setVisible(!isVisible);
			this.jPanelAccionesProductoProduMerma.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProductoProduMermaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProductoProduMerma();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProductoProduMermaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProductoProduMerma();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProductoProduMermaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProductoProduMerma();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProductoProduMermaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProductoProduMerma();
			
			this.abrirFrameOrderByProductoProduMerma();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProductoProduMermaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProductoProduMerma();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProductoProduMerma(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductoProduMerma);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProductoProduMerma.isMaximum()) {
					this.jInternalFrameDetalleFormProductoProduMerma.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProductoProduMerma.setSize(this.jInternalFrameDetalleFormProductoProduMerma.iWidthFormulario,this.jInternalFrameDetalleFormProductoProduMerma.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProductoProduMerma.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProductoProduMerma.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProductoProduMerma.isMaximum()) {
						this.jInternalFrameDetalleFormProductoProduMerma.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProductoProduMerma.jContentPaneDetalleProductoProduMerma.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProductoProduMerma.jTabbedPaneRelacionesProductoProduMerma.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProductoProduMerma.jContentPaneDetalleProductoProduMerma.getWidth(),ProductoProduMermaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductoProduMerma.jTabbedPaneRelacionesProductoProduMerma.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProductoProduMerma.jContentPaneDetalleProductoProduMerma.getWidth(),ProductoProduMermaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductoProduMerma.jTabbedPaneRelacionesProductoProduMerma.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProductoProduMerma.jContentPaneDetalleProductoProduMerma.getWidth(),ProductoProduMermaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProductoProduMerma.setVisible(true);
	        this.jInternalFrameDetalleFormProductoProduMerma.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProductoProduMerma() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProductoProduMerma==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProductoProduMerma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoProduMerma,false,this);
				} else {
					this.jInternalFrameOrderByProductoProduMerma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoProduMerma,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProductoProduMerma);
				this.jInternalFrameOrderByProductoProduMerma.setVisible(false);
				this.jInternalFrameOrderByProductoProduMerma.setSelected(false);
				
				this.jInternalFrameOrderByProductoProduMerma.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductoProduMerma"));
				
				this.inicializarActualizarBindingTablaOrderByProductoProduMerma();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProductoProduMerma() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProductoProduMerma==null) {
				
				this.jInternalFrameImportacionProductoProduMerma=new ImportacionJInternalFrame(ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductoProduMerma);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProductoProduMerma);
				this.jInternalFrameImportacionProductoProduMerma.setVisible(false);
				this.jInternalFrameImportacionProductoProduMerma.setSelected(false);


				this.jInternalFrameImportacionProductoProduMerma.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductoProduMerma"));
				this.jInternalFrameImportacionProductoProduMerma.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductoProduMerma"));
				this.jInternalFrameImportacionProductoProduMerma.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductoProduMerma"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProductoProduMerma() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProductoProduMerma==null) {
				this.jInternalFrameReporteDinamicoProductoProduMerma=new ReporteDinamicoJInternalFrame(ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductoProduMerma);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductoProduMerma);
				this.jInternalFrameReporteDinamicoProductoProduMerma.setVisible(false);
				this.jInternalFrameReporteDinamicoProductoProduMerma.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProductoProduMerma.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoProduMerma"));
				this.jInternalFrameReporteDinamicoProductoProduMerma.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoProduMerma"));
				this.jInternalFrameReporteDinamicoProductoProduMerma.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoProduMerma"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoProduMerma();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProductoProduMerma() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductoProduMerma);
			
	       	this.jInternalFrameDetalleFormProductoProduMerma.setVisible(false);
	        this.jInternalFrameDetalleFormProductoProduMerma.setSelected(false);
			
			//this.jInternalFrameDetalleFormProductoProduMerma.dispose();
			//this.jInternalFrameDetalleFormProductoProduMerma=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProductoProduMerma() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProductoProduMerma.setVisible(true);
	        this.jInternalFrameReporteDinamicoProductoProduMerma.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProductoProduMerma() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProductoProduMerma.setVisible(true);
	        this.jInternalFrameImportacionProductoProduMerma.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProductoProduMerma() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProductoProduMerma.setVisible(true);
	        this.jInternalFrameOrderByProductoProduMerma.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProductoProduMerma() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProductoProduMerma.setVisible(false);
	        this.jInternalFrameOrderByProductoProduMerma.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProductoProduMerma() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProductoProduMerma.setVisible(false);
	        this.jInternalFrameReporteDinamicoProductoProduMerma.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProductoProduMerma() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProductoProduMerma.setVisible(false);
	        this.jInternalFrameImportacionProductoProduMerma.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProductoProduMermaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProductoProduMerma(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProductoProduMerma(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductoProduMerma.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProductoProduMerma(true);
			//this.isEsNuevoProductoProduMerma=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumerma =(ProductoProduMerma) this.productoprodumermaLogic.getProductoProduMermas().toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoprodumerma =(ProductoProduMerma) this.productoprodumermas.toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProductoProduMerma("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoProduMerma(false) ;
			
			if(productoprodumermaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProductoProduMermaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoProduMerma(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoProduMerma(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProductoProduMermaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProductoProduMerma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumerma =(ProductoProduMerma) this.productoprodumermaLogic.getProductoProduMermas().toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoprodumerma =(ProductoProduMerma) this.productoprodumermas.toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProductoProduMerma(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductoProduMerma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductoProduMerma.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProductoProduMerma(true);
			//this.isEsNuevoProductoProduMerma=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumerma =(ProductoProduMerma) this.productoprodumermaLogic.getProductoProduMermas().toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoprodumerma =(ProductoProduMerma) this.productoprodumermas.toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.productoprodumerma.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProductoProduMerma("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProductoProduMerma(false) ;
			
			if(ProductoProduMermaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoProduMerma(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoProduMerma(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaProductoDefiProdu(List<ProductoDefiProdu> productodefiprodusForeignKey)throws Exception{
		TableColumn tableColumnProductoDefiProdu=this.jTableDatosProductoProduMerma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMerma,ProductoProduMermaConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU));
		TableCellEditor tableCellEditorProductoDefiProdu =tableColumnProductoDefiProdu.getCellEditor();

		ProductoDefiProduTableCell productodefiproduTableCellFk=(ProductoDefiProduTableCell)tableCellEditorProductoDefiProdu;

		if(productodefiproduTableCellFk!=null) {
			productodefiproduTableCellFk.setproductodefiprodusForeignKey(productodefiprodusForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoProduMerma.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productodefiproduTableCellFk.setRowActual(intSelectedRow);
			//productodefiproduTableCellFk.setproductodefiprodusForeignKeyActual(productodefiprodusForeignKey);
		//}


		if(productodefiproduTableCellFk!=null) {
			productodefiproduTableCellFk.RecargarProductoDefiProdusForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoMermaEmpresa(List<TipoMermaEmpresa> tipomermaempresasForeignKey)throws Exception{
		TableColumn tableColumnTipoMermaEmpresa=this.jTableDatosProductoProduMerma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMerma,ProductoProduMermaConstantesFunciones.LABEL_IDTIPOMERMAEMPRESA));
		TableCellEditor tableCellEditorTipoMermaEmpresa =tableColumnTipoMermaEmpresa.getCellEditor();

		TipoMermaEmpresaTableCell tipomermaempresaTableCellFk=(TipoMermaEmpresaTableCell)tableCellEditorTipoMermaEmpresa;

		if(tipomermaempresaTableCellFk!=null) {
			tipomermaempresaTableCellFk.settipomermaempresasForeignKey(tipomermaempresasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoProduMerma.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipomermaempresaTableCellFk.setRowActual(intSelectedRow);
			//tipomermaempresaTableCellFk.settipomermaempresasForeignKeyActual(tipomermaempresasForeignKey);
		//}


		if(tipomermaempresaTableCellFk!=null) {
			tipomermaempresaTableCellFk.RecargarTipoMermaEmpresasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaUnidad(List<Unidad> unidadsForeignKey)throws Exception{
		TableColumn tableColumnUnidad=this.jTableDatosProductoProduMerma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMerma,ProductoProduMermaConstantesFunciones.LABEL_IDUNIDAD));
		TableCellEditor tableCellEditorUnidad =tableColumnUnidad.getCellEditor();

		UnidadTableCell unidadTableCellFk=(UnidadTableCell)tableCellEditorUnidad;

		if(unidadTableCellFk!=null) {
			unidadTableCellFk.setunidadsForeignKey(unidadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoProduMerma.getSelectedRow();

		//if(intSelectedRow<=0) {
			//unidadTableCellFk.setRowActual(intSelectedRow);
			//unidadTableCellFk.setunidadsForeignKeyActual(unidadsForeignKey);
		//}


		if(unidadTableCellFk!=null) {
			unidadTableCellFk.RecargarUnidadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProductoProduMermaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProductoProduMerma(false);
			
			//if(!this.isEsNuevoProductoProduMerma) {								
				int intSelectedRow = this.jTableDatosProductoProduMerma.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumerma =(ProductoProduMerma) this.productoprodumermaLogic.getProductoProduMermas().toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoprodumerma =(ProductoProduMerma) this.productoprodumermas.toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProductoProduMermaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProductoProduMerma(this.productoprodumerma,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMerma(this.productoprodumerma);
				
			}
			
			if(this.permiteMantenimiento(this.productoprodumerma)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProductoProduMerma=true;
					this.inicializarActualizarBindingTablaProductoProduMerma(false);
					this.isEsNuevoProductoProduMerma=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProductoProduMerma=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProductoProduMerma=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductoProduMerma(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoProduMerma(false);
				
				this.habilitarDeshabilitarControlesProductoProduMerma(false);
			
												
				
				if(ProductoProduMermaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProductoProduMerma();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProductoProduMermaActionPerformed(evt,productoprodumermaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProductoProduMerma(this.productoprodumerma,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProductoProduMerma.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,productoprodumermaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.productoprodumerma.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProductoProduMerma.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduMerma.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProductoProduMermaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProductoProduMerma.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumerma =(ProductoProduMerma) this.productoprodumermaLogic.getProductoProduMermas().toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
				this.productoprodumerma.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoprodumerma =(ProductoProduMerma) this.productoprodumermas.toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
				this.productoprodumerma.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.productoprodumerma)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProductoProduMermaModel) this.jTableDatosProductoProduMerma.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProductoProduMerma=true;
				this.inicializarActualizarBindingTablaProductoProduMerma(false);
				this.isEsNuevoProductoProduMerma=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductoProduMerma(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoProduMerma(false);
				
				this.habilitarDeshabilitarControlesProductoProduMerma(false);
				
				
				
				if(ProductoProduMermaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProductoProduMerma();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProductoProduMermaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProductoProduMerma.getRowCount()>=1) {
				jTableDatosProductoProduMerma.removeRowSelectionInterval(0, jTableDatosProductoProduMerma.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProductoProduMerma(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProductoProduMerma(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoProduMerma(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoProduMerma(false) ;
			
			this.isEsNuevoProductoProduMerma=false;
			
			if(ProductoProduMermaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProductoProduMerma();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProductoProduMermaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProductoProduMerma(false);
				
				//SI ES MANUAL
				if(ProductoProduMermaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProductoProduMerma();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProductoProduMermaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProductoProduMerma--;			
			//ProductoProduMerma productoprodumermaAux= new ProductoProduMerma();			
			//productoprodumermaAux.setId(this.iIdNuevoProductoProduMerma);
			
			if(this.jInternalFrameDetalleFormProductoProduMerma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProductoProduMerma();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMerma(this.productoprodumerma);
			
			this.productoprodumerma.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.productoprodumermaLogic.getProductoProduMermas().add(this.productoprodumermaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.productoprodumermas.add(this.productoprodumermaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProductoProduMerma(false);
			
			this.jTableDatosProductoProduMerma.setRowSelectionInterval(this.getIndiceNuevoProductoProduMerma(), this.getIndiceNuevoProductoProduMerma());
			
			int iLastRow =  this.jTableDatosProductoProduMerma.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProductoProduMerma.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProductoProduMerma.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProductoProduMerma(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProductoProduMermaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProductoProduMerma(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoProduMerma(false);
			
			//SI ES MANUAL
			if(ProductoProduMermaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoProduMerma();
			}
			
			//this.abrirFrameTreeProductoProduMerma();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProductoProduMermaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Producto Merma ProduccionES ?", "MANTENIMIENTO DE Producto Merma Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionProductoProduMerma.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralProductoProduMerma();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.productoprodumermaReturnGeneral=productoprodumermaLogic.procesarImportacionProductoProduMermasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.productoprodumermaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarProductoProduMermaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProductoProduMermaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProductoProduMerma.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProductoProduMerma.setFileImportacion(this.jInternalFrameImportacionProductoProduMerma.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProductoProduMerma.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProductoProduMerma.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProductoProduMerma.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProductoProduMerma.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProductoProduMermaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProductoProduMerma> productoprodumermasSeleccionados=new ArrayList<ProductoProduMerma>();		

		productoprodumermasSeleccionados=this.getProductoProduMermasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoProduMerma.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoProduMerma.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProductoProduMermaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProductoProduMermaBaseDesign.jrxml";
			
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
			
			this.generarReporteProductoProduMermas("Todos",productoprodumermasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Merma Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProductoProduMerma.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoProduMerma.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductoProduMermaConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ProductoDefiProdu_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ProductoDefiProdu_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ProductoDefiProdu_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ProductoDefiProdu_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProduMermaConstantesFunciones.LABEL_IDTIPOMERMAEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoMermaEmpresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoMermaEmpresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoMermaEmpresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoMermaEmpresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProduMermaConstantesFunciones.LABEL_IDUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Unidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Unidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Unidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Unidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProduMermaConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProduMermaConstantesFunciones.LABEL_COSTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_sto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_sto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_sto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_sto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProduMermaConstantesFunciones.LABEL_COSTOTOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_stoTotal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_stoTotal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_stoTotal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_stoTotal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProduMermaConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoProductoProduMerma.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProductoProduMerma.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProductoProduMerma.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProductoProduMermaConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU:
					sNombreCampoCategoria="id_producto_defi_produ";
					break;

				case ProductoProduMermaConstantesFunciones.LABEL_IDTIPOMERMAEMPRESA:
					sNombreCampoCategoria="id_tipo_merma_empresa";
					break;

				case ProductoProduMermaConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoria="id_unidad";
					break;

				case ProductoProduMermaConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;

				case ProductoProduMermaConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoria="costo";
					break;

				case ProductoProduMermaConstantesFunciones.LABEL_COSTOTOTAL:
					sNombreCampoCategoria="costo_total";
					break;

				case ProductoProduMermaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProductoProduMerma.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProductoProduMermaConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU:
					sNombreCampoCategoriaValor="id_producto_defi_produ";
					break;

				case ProductoProduMermaConstantesFunciones.LABEL_IDTIPOMERMAEMPRESA:
					sNombreCampoCategoriaValor="id_tipo_merma_empresa";
					break;

				case ProductoProduMermaConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoriaValor="id_unidad";
					break;

				case ProductoProduMermaConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;

				case ProductoProduMermaConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoriaValor="costo";
					break;

				case ProductoProduMermaConstantesFunciones.LABEL_COSTOTOTAL:
					sNombreCampoCategoriaValor="costo_total";
					break;

				case ProductoProduMermaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProductoProduMerma.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoProduMerma.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductoProduMermaConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto Defi Produ",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto_defi_produ");
					break;

				case ProductoProduMermaConstantesFunciones.LABEL_IDTIPOMERMAEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Merma Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_merma_empresa");
					break;

				case ProductoProduMermaConstantesFunciones.LABEL_IDUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Unad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_unidad");
					break;

				case ProductoProduMermaConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad");
					break;

				case ProductoProduMermaConstantesFunciones.LABEL_COSTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo");
					break;

				case ProductoProduMermaConstantesFunciones.LABEL_COSTOTOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo_total");
					break;

				case ProductoProduMermaConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoProductoProduMermaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProductoProduMerma> productoprodumermasSeleccionados=new ArrayList<ProductoProduMerma>();		
		
		productoprodumermasSeleccionados=this.getProductoProduMermasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoprodumerma";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProductoProduMermas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProductoProduMerma.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoProduMerma.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProductoProduMermaConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduMermaConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU);
					iRow++;

					for(ProductoProduMerma productoprodumerma:productoprodumermasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodumerma.getproductodefiprodu_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProduMermaConstantesFunciones.LABEL_IDTIPOMERMAEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduMermaConstantesFunciones.LABEL_IDTIPOMERMAEMPRESA);
					iRow++;

					for(ProductoProduMerma productoprodumerma:productoprodumermasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodumerma.gettipomermaempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProduMermaConstantesFunciones.LABEL_IDUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduMermaConstantesFunciones.LABEL_IDUNIDAD);
					iRow++;

					for(ProductoProduMerma productoprodumerma:productoprodumermasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodumerma.getunidad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProduMermaConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduMermaConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(ProductoProduMerma productoprodumerma:productoprodumermasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodumerma.getcantidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProduMermaConstantesFunciones.LABEL_COSTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduMermaConstantesFunciones.LABEL_COSTO);
					iRow++;

					for(ProductoProduMerma productoprodumerma:productoprodumermasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodumerma.getcosto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProduMermaConstantesFunciones.LABEL_COSTOTOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduMermaConstantesFunciones.LABEL_COSTOTOTAL);
					iRow++;

					for(ProductoProduMerma productoprodumerma:productoprodumermasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodumerma.getcosto_total());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProduMermaConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduMermaConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(ProductoProduMerma productoprodumerma:productoprodumermasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodumerma.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelProductoProduMerma(row);				
			//	iRow++;
			//}				
			
			//for(ProductoProduMerma productoprodumermaAux:productoprodumermasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProductoProduMerma(productoprodumermaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Merma Produccion",JOptionPane.INFORMATION_MESSAGE);
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
				this.productoprodumermaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoProduMerma(false);
			
			//SI ES MANUAL
			if(ProductoProduMermaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoProduMerma();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProductoProduMermaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoProduMerma(false);
			
			//SI ES MANUAL
			if(ProductoProduMermaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductoProduMerma();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProductoProduMermaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoProduMerma(false);
			
			//SI ES MANUAL
			if(ProductoProduMermaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductoProduMerma();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProductoProduMerma() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProductoProduMerma.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProductoProduMerma.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProductoProduMerma.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProductoProduMerma.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProductoProduMerma.setMinimumSize(dimensionMinimum);
		this.jTableDatosProductoProduMerma.setMaximumSize(dimensionMaximum);
		this.jTableDatosProductoProduMerma.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProductoProduMerma(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProductoProduMerma(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProductoProduMerma(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProductoProduMerma(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProductoProduMerma(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProductoProduMerma(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoProduMerma(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProductoProduMerma(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProductoProduMermaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProductoProduMermaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProductoProduMerma() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProductoProduMerma();
		
		this.inicializarActualizarBindingBotonesManualProductoProduMerma(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProductoProduMerma();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoProduMerma() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProductoProduMerma(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProductoProduMerma(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProductoProduMerma.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProductoProduMerma.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProductoProduMerma.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProductoProduMerma!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProductoProduMerma.jCheckBoxPostAccionNuevoProductoProduMerma.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProductoProduMerma.jCheckBoxPostAccionSinCerrarProductoProduMerma.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProductoProduMerma.jCheckBoxPostAccionSinMensajeProductoProduMerma.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProductoProduMerma.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProductoProduMerma.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProductoProduMerma.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProductoProduMerma!=null) {
				this.jInternalFrameDetalleFormProductoProduMerma.jCheckBoxPostAccionNuevoProductoProduMerma.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProductoProduMerma.jCheckBoxPostAccionSinCerrarProductoProduMerma.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProductoProduMerma.jCheckBoxPostAccionSinMensajeProductoProduMerma.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProductoProduMerma.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProductoProduMerma.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProductoProduMerma!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxTiposAccionesFormularioProductoProduMerma.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProductoProduMerma.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProductoProduMerma!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoProduMerma.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProductoProduMerma.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProductoProduMerma.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProductoProduMerma.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProductoProduMerma.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProductoProduMerma!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoProduMerma.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProductoProduMerma.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProductoProduMerma.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProductoProduMerma(Boolean esInicializar) throws Exception {
		try	{	
			if(ProductoProduMermaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProductoProduMerma(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProductoProduMerma() throws Exception {
		try	{
			if(ProductoProduMermaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProductoProduMerma();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductoProduMerma() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxTiposAccionesFormularioProductoProduMerma.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxTiposAccionesFormularioProductoProduMerma.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProductoProduMerma() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProductoProduMerma.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProductoProduMerma.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProductoProduMerma.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProductoProduMerma.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProductoProduMerma.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProductoProduMerma.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProductoProduMerma.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProductoProduMerma.addItem(reporte);
			}
			
			
			if(!this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProductoProduMerma.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProductoProduMerma.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProductoProduMerma.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProductoProduMerma.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProductoProduMerma.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProductoProduMerma.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProductoProduMerma!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxTiposAccionesFormularioProductoProduMerma.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxTiposAccionesFormularioProductoProduMerma.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProductoProduMerma.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProductoProduMerma.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProductoProduMerma.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoProduMerma();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoProduMerma() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductoProduMerma!=null) {
				this.jInternalFrameReporteDinamicoProductoProduMerma.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductoProduMerma.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductoProduMerma!=null) {
				this.jInternalFrameReporteDinamicoProductoProduMerma.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductoProduMerma.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProductoProduMerma!=null) {
				
				if(this.jInternalFrameReporteDinamicoProductoProduMerma.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductoProduMerma.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoProduMerma.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProductoProduMerma.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductoProduMerma.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoProduMerma.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoProduMerma.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProductoProduMerma.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ProductoProduMermaConstantesFunciones.getTiposSeleccionarProductoProduMerma(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProductoProduMerma.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoProduMerma.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoProductoProduMerma.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ProductoProduMermaConstantesFunciones.getTiposSeleccionarProductoProduMerma(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProductoProduMerma.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoProductoProduMerma.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProductoProduMerma.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ProductoProduMermaConstantesFunciones.getTiposSeleccionarProductoProduMerma(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoProduMerma.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoProductoProduMerma.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoProductoProduMerma.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoProductoProduMerma.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProductoProduMerma()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMerma.getSelectedItem()!=null){this.id_producto_defi_produFK_IdProductoDefiProdu=((ProductoDefiProdu)this.jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMerma.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoProduMerma.getSelectedItem()!=null){this.id_tipo_merma_empresaFK_IdTipoMermaEmpresa=((TipoMermaEmpresa)this.jComboBoxid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoProduMerma.getSelectedItem()).getId();}
		if(this.jComboBoxid_unidadFK_IdUnidadProductoProduMerma.getSelectedItem()!=null){this.id_unidadFK_IdUnidad=((Unidad)this.jComboBoxid_unidadFK_IdUnidadProductoProduMerma.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProductoProduMerma(Boolean esInicializar) throws Exception {				
		if(ProductoProduMermaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProductoProduMerma();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProductoProduMerma() throws Exception {
		this.inicializarActualizarBindingTablaProductoProduMerma(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProductoProduMerma() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProductoProduMerma.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProductoProduMerma.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoProduMerma.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProductoProduMermaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProductoProduMerma.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoProduMerma.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProductoProduMermaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProductoProduMermaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMermaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProductoProduMermaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProductoProduMerma.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoProduMerma.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProductoProduMermaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProductoProduMerma.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProductoProduMerma(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=productoprodumermaLogic.getProductoProduMermas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=productoprodumermas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProductoProduMermaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProductoProduMerma.setModel(new ProductoProduMermaModel(this.productoprodumermaLogic.getProductoProduMermas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProductoProduMerma.setModel(new ProductoProduMermaModel(this.productoprodumermas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProductoProduMerma!=null && this.jInternalFrameOrderByProductoProduMerma.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProductoProduMerma();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProductoProduMerma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMerma,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProductoProduMermaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO,productoprodumermaConstantesFunciones.resaltarSeleccionarProductoProduMerma,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO,productoprodumermaConstantesFunciones.resaltarSeleccionarProductoProduMerma,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProductoProduMerma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMerma,ProductoProduMermaConstantesFunciones.LABEL_ID));

		if(this.productoprodumermaConstantesFunciones.mostraridProductoProduMerma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduMermaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoprodumermaConstantesFunciones.resaltaridProductoProduMerma,this.productoprodumermaConstantesFunciones.activaridProductoProduMerma,iSizeTabla,this,true,"idProductoProduMerma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoprodumermaConstantesFunciones.resaltaridProductoProduMerma,this.productoprodumermaConstantesFunciones.activaridProductoProduMerma,this,true,"idProductoProduMerma","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProduMerma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMerma,ProductoProduMermaConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU));

		if(this.productoprodumermaConstantesFunciones.mostrarid_producto_defi_produProductoProduMerma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduMermaConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoDefiProduTableCell(this.productodefiprodusForeignKey,this.productoprodumermaConstantesFunciones.resaltarid_producto_defi_produProductoProduMerma,this,this.productoprodumermaConstantesFunciones.activarid_producto_defi_produProductoProduMerma,iSizeTabla));
			tableColumn.setCellEditor(new ProductoDefiProduTableCell(this.productodefiprodusForeignKey,this.productoprodumermaConstantesFunciones.resaltarid_producto_defi_produProductoProduMerma,this,this.productoprodumermaConstantesFunciones.activarid_producto_defi_produProductoProduMerma,true,"id_producto_defi_produProductoProduMerma","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoProduMermaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProduMerma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMerma,ProductoProduMermaConstantesFunciones.LABEL_IDTIPOMERMAEMPRESA));

		if(this.productoprodumermaConstantesFunciones.mostrarid_tipo_merma_empresaProductoProduMerma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduMermaConstantesFunciones.LABEL_IDTIPOMERMAEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoMermaEmpresaTableCell(this.tipomermaempresasForeignKey,this.productoprodumermaConstantesFunciones.resaltarid_tipo_merma_empresaProductoProduMerma,this,this.productoprodumermaConstantesFunciones.activarid_tipo_merma_empresaProductoProduMerma,iSizeTabla));
			tableColumn.setCellEditor(new TipoMermaEmpresaTableCell(this.tipomermaempresasForeignKey,this.productoprodumermaConstantesFunciones.resaltarid_tipo_merma_empresaProductoProduMerma,this,this.productoprodumermaConstantesFunciones.activarid_tipo_merma_empresaProductoProduMerma,true,"id_tipo_merma_empresaProductoProduMerma","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoProduMermaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProduMerma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMerma,ProductoProduMermaConstantesFunciones.LABEL_IDUNIDAD));

		if(this.productoprodumermaConstantesFunciones.mostrarid_unidadProductoProduMerma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduMermaConstantesFunciones.LABEL_IDUNIDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new UnidadTableCell(this.unidadsForeignKey,this.productoprodumermaConstantesFunciones.resaltarid_unidadProductoProduMerma,this,this.productoprodumermaConstantesFunciones.activarid_unidadProductoProduMerma,iSizeTabla));
			tableColumn.setCellEditor(new UnidadTableCell(this.unidadsForeignKey,this.productoprodumermaConstantesFunciones.resaltarid_unidadProductoProduMerma,this,this.productoprodumermaConstantesFunciones.activarid_unidadProductoProduMerma,true,"id_unidadProductoProduMerma","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoProduMermaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProduMerma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMerma,ProductoProduMermaConstantesFunciones.LABEL_CANTIDAD));

		if(this.productoprodumermaConstantesFunciones.mostrarcantidadProductoProduMerma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduMermaConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoprodumermaConstantesFunciones.resaltarcantidadProductoProduMerma,this.productoprodumermaConstantesFunciones.activarcantidadProductoProduMerma,iSizeTabla,this,true,"cantidadProductoProduMerma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoprodumermaConstantesFunciones.resaltarcantidadProductoProduMerma,this.productoprodumermaConstantesFunciones.activarcantidadProductoProduMerma,this,true,"cantidadProductoProduMerma","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoProduMermaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProduMerma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMerma,ProductoProduMermaConstantesFunciones.LABEL_COSTO));

		if(this.productoprodumermaConstantesFunciones.mostrarcostoProductoProduMerma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduMermaConstantesFunciones.LABEL_COSTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoprodumermaConstantesFunciones.resaltarcostoProductoProduMerma,this.productoprodumermaConstantesFunciones.activarcostoProductoProduMerma,iSizeTabla,this,true,"costoProductoProduMerma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoprodumermaConstantesFunciones.resaltarcostoProductoProduMerma,this.productoprodumermaConstantesFunciones.activarcostoProductoProduMerma,this,true,"costoProductoProduMerma","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoProduMermaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProduMerma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMerma,ProductoProduMermaConstantesFunciones.LABEL_COSTOTOTAL));

		if(this.productoprodumermaConstantesFunciones.mostrarcosto_totalProductoProduMerma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduMermaConstantesFunciones.LABEL_COSTOTOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoprodumermaConstantesFunciones.resaltarcosto_totalProductoProduMerma,this.productoprodumermaConstantesFunciones.activarcosto_totalProductoProduMerma,iSizeTabla,this,true,"costo_totalProductoProduMerma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoprodumermaConstantesFunciones.resaltarcosto_totalProductoProduMerma,this.productoprodumermaConstantesFunciones.activarcosto_totalProductoProduMerma,this,true,"costo_totalProductoProduMerma","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoProduMermaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProduMerma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMerma,ProductoProduMermaConstantesFunciones.LABEL_DESCRIPCION));

		if(this.productoprodumermaConstantesFunciones.mostrardescripcionProductoProduMerma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduMermaConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productoprodumermaConstantesFunciones.resaltardescripcionProductoProduMerma,this.productoprodumermaConstantesFunciones.activardescripcionProductoProduMerma,iSizeTabla,this,true,"descripcionProductoProduMerma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoprodumermaConstantesFunciones.resaltardescripcionProductoProduMerma,this.productoprodumermaConstantesFunciones.activardescripcionProductoProduMerma,this,true,"descripcionProductoProduMerma","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoProduMermaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.productoprodumermaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productoprodumermaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productoprodumermaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductoProduMerma.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productoprodumermaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productoprodumermaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductoProduMerma.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProductoProduMerma && this.isPermisoGuardarCambiosProductoProduMerma) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.productoprodumermaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.productoprodumermaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProductoProduMerma.addColumn(tableColumn);
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
			
			this.jTableDatosProductoProduMerma.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductoProduMerma && this.isPermisoGuardarCambiosProductoProduMerma) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductoProduMerma && this.isPermisoGuardarCambiosProductoProduMerma) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProductoProduMerma.moveColumn(this.jTableDatosProductoProduMerma.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProductoProduMerma.moveColumn(this.jTableDatosProductoProduMerma.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProductoProduMerma.moveColumn(this.jTableDatosProductoProduMerma.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProductoProduMerma.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProductoProduMerma.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProductoProduMerma,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProductoProduMermaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProductoProduMerma.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProductoProduMerma.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProductoProduMermaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProductoProduMermaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProductoProduMerma.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProductoProduMerma.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProductoProduMerma.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=productoprodumermaLogic.getProductoProduMermas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=productoprodumermas.size()-1;
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
		//this.jTableDatosProductoProduMerma.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProductoProduMerma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProductoProduMerma();
			
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
				
				//this.isEsNuevoProductoProduMerma=false;
					
				ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
			
				if(this.productoprodumermaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProductoProduMerma==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductoProduMerma.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductoProduMerma.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumerma =(ProductoProduMerma) this.productoprodumermaLogic.getProductoProduMermas().toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoprodumerma =(ProductoProduMerma) this.productoprodumermas.toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.productoprodumerma.getsType().equals("DUPLICADO")
				   || this.productoprodumerma.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProductoProduMerma=true;
				
				} else {
					this.isEsNuevoProductoProduMerma=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {
					if(this.productoprodumerma.getId()>=0 && !this.productoprodumerma.getIsNew()) {						
						this.isEsNuevoProductoProduMerma=false;
						
					} else {
						this.isEsNuevoProductoProduMerma=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProductoProduMerma(esRelaciones);						
				
				this.seleccionarProductoProduMerma(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.productoprodumerma.getId()<0) {
					this.isEsNuevoProductoProduMerma=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProductoProduMerma(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProductoProduMerma(evt,rowIndex);
				}	
				
				if(this.productoprodumermaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProductoProduMerma: " + this.dDif); 
					}
				}								
				
				ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProductoProduMerma(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.productoprodumerma)) {
					if(this.productoprodumerma.getId()>0) {
						this.productoprodumerma.setIsDeleted(true);
						
						this.productoprodumermasEliminados.add(this.productoprodumerma);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productoprodumermaLogic.getProductoProduMermas().remove(this.productoprodumerma);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productoprodumermas.remove(this.productoprodumerma);				
					}
					
					
					((ProductoProduMermaModel) this.jTableDatosProductoProduMerma.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoProduMerma(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProductoProduMerma(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProductoProduMerma) {
			
			if(this.jInternalFrameDetalleFormProductoProduMerma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductoProduMerma.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductoProduMerma.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumerma =(ProductoProduMerma) this.productoprodumermaLogic.getProductoProduMermas().toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoprodumerma =(ProductoProduMerma) this.productoprodumermas.toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProductoProduMermaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProductoProduMerma(this.productoprodumerma);
				}
				
				//ARCHITECTURE
				try {
					

					//ProductoDefiProdu
					if(!this.productoprodumermaConstantesFunciones.cargarid_producto_defi_produProductoProduMerma || this.productoprodumermaConstantesFunciones.event_dependid_producto_defi_produProductoProduMerma) {
						//this.cargarCombosProductoDefiProdusForeignKeyLista(" where id="+this.productoprodumerma.getid_producto_defi_produ());
									//this.inicializarActualizarBindingProductoProduMerma(false,false);
						this.productodefiprodusForeignKey=new ArrayList<ProductoDefiProdu>();

						if(productoprodumerma.getProductoDefiProdu()!=null) {
							this.productodefiprodusForeignKey.add(productoprodumerma.getProductoDefiProdu());
						}

						this.addItemDefectoCombosForeignKeyProductoDefiProdu();
						this.cargarCombosFrameProductoDefiProdusForeignKey("Todos");
					}
					this.setActualProductoDefiProduForeignKey(this.productoprodumerma.getid_producto_defi_produ(),false,"Formulario");

					//TipoMermaEmpresa
					if(!this.productoprodumermaConstantesFunciones.cargarid_tipo_merma_empresaProductoProduMerma || this.productoprodumermaConstantesFunciones.event_dependid_tipo_merma_empresaProductoProduMerma) {
						//this.cargarCombosTipoMermaEmpresasForeignKeyLista(" where id="+this.productoprodumerma.getid_tipo_merma_empresa());
									//this.inicializarActualizarBindingProductoProduMerma(false,false);
						this.tipomermaempresasForeignKey=new ArrayList<TipoMermaEmpresa>();

						if(productoprodumerma.getTipoMermaEmpresa()!=null) {
							this.tipomermaempresasForeignKey.add(productoprodumerma.getTipoMermaEmpresa());
						}

						this.addItemDefectoCombosForeignKeyTipoMermaEmpresa();
						this.cargarCombosFrameTipoMermaEmpresasForeignKey("Todos");
					}
					this.setActualTipoMermaEmpresaForeignKey(this.productoprodumerma.getid_tipo_merma_empresa(),false,"Formulario");

					//Unidad
					if(!this.productoprodumermaConstantesFunciones.cargarid_unidadProductoProduMerma || this.productoprodumermaConstantesFunciones.event_dependid_unidadProductoProduMerma) {
						//this.cargarCombosUnidadsForeignKeyLista(" where id="+this.productoprodumerma.getid_unidad());
									//this.inicializarActualizarBindingProductoProduMerma(false,false);
						this.unidadsForeignKey=new ArrayList<Unidad>();

						if(productoprodumerma.getUnidad()!=null) {
							this.unidadsForeignKey.add(productoprodumerma.getUnidad());
						}

						this.addItemDefectoCombosForeignKeyUnidad();
						this.cargarCombosFrameUnidadsForeignKey("Todos");
					}
					this.setActualUnidadForeignKey(this.productoprodumerma.getid_unidad(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProductoProduMerma("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProductoProduMerma(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoProduMerma() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductoProduMerma(ProductoProduMerma productoprodumerma) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProductoProduMerma(productoprodumerma,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductoProduMerma(ProductoProduMerma productoprodumerma,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProductoProduMerma(productoprodumerma);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProductoProduMerma(productoprodumerma,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProductoProduMerma(productoprodumerma);
	}
	
	public void setVariablesObjetoActualToFormularioProductoProduMerma(ProductoProduMerma productoprodumerma) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProductoProduMerma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProductoProduMerma.jLabelidProductoProduMerma.setText(productoprodumerma.getId().toString());
			this.jInternalFrameDetalleFormProductoProduMerma.jTextFieldcantidadProductoProduMerma.setText(productoprodumerma.getcantidad().toString());
			this.jInternalFrameDetalleFormProductoProduMerma.jTextFieldcostoProductoProduMerma.setText(productoprodumerma.getcosto().toString());
			this.jInternalFrameDetalleFormProductoProduMerma.jTextFieldcosto_totalProductoProduMerma.setText(productoprodumerma.getcosto_total().toString());
			this.jInternalFrameDetalleFormProductoProduMerma.jTextAreadescripcionProductoProduMerma.setText(productoprodumerma.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProductoProduMerma productoprodumermaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,productoprodumermaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProductoProduMerma productoprodumermaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				productoprodumermaLocal=this.productoprodumerma;
			} else {
				productoprodumermaLocal=this.productoprodumermaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(productoprodumermaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProductoProduMerma(productoprodumermaLocal,true);
					
					if(productoprodumermaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(productoprodumermaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(productoprodumermaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProductoProduMerma(ProductoProduMerma productoprodumerma,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductoProduMerma(productoprodumerma,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMerma(productoprodumerma);
	}
	
	public void setVariablesFormularioToObjetoActualProductoProduMerma(ProductoProduMerma productoprodumerma,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductoProduMerma(productoprodumerma,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProductoProduMerma(ProductoProduMerma productoprodumerma,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProductoProduMerma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProductoProduMerma.jLabelidProductoProduMerma.getText()==null || this.jInternalFrameDetalleFormProductoProduMerma.jLabelidProductoProduMerma.getText()=="" || this.jInternalFrameDetalleFormProductoProduMerma.jLabelidProductoProduMerma.getText()=="Id") {
				this.jInternalFrameDetalleFormProductoProduMerma.jLabelidProductoProduMerma.setText("0");
			}

			if(conColumnasBase) {productoprodumerma.setId(Long.parseLong(this.jInternalFrameDetalleFormProductoProduMerma.jLabelidProductoProduMerma.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoProduMermaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduMerma.jLabelIdProductoProduMerma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoprodumerma.setcantidad(Integer.parseInt(this.jInternalFrameDetalleFormProductoProduMerma.jTextFieldcantidadProductoProduMerma.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoProduMermaConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduMerma.jLabelcantidadProductoProduMerma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoprodumerma.setcosto(Double.parseDouble(this.jInternalFrameDetalleFormProductoProduMerma.jTextFieldcostoProductoProduMerma.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoProduMermaConstantesFunciones.LABEL_COSTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduMerma.jLabelcostoProductoProduMerma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoprodumerma.setcosto_total(Double.parseDouble(this.jInternalFrameDetalleFormProductoProduMerma.jTextFieldcosto_totalProductoProduMerma.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoProduMermaConstantesFunciones.LABEL_COSTOTOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduMerma.jLabelcosto_totalProductoProduMerma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoprodumerma.setdescripcion(this.jInternalFrameDetalleFormProductoProduMerma.jTextAreadescripcionProductoProduMerma.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoProduMermaConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduMerma.jLabeldescripcionProductoProduMerma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductoProduMerma(ProductoProduMerma productoprodumermaBean,ProductoProduMerma productoprodumerma,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && productoprodumermaBean.getid_producto_defi_produ()!=null && !productoprodumermaBean.getid_producto_defi_produ().equals(-1L))) {productoprodumerma.setid_producto_defi_produ(productoprodumermaBean.getid_producto_defi_produ());}
			if(conDefault || (!conDefault && productoprodumermaBean.getid_tipo_merma_empresa()!=null && !productoprodumermaBean.getid_tipo_merma_empresa().equals(-1L))) {productoprodumerma.setid_tipo_merma_empresa(productoprodumermaBean.getid_tipo_merma_empresa());}
			if(conDefault || (!conDefault && productoprodumermaBean.getid_unidad()!=null && !productoprodumermaBean.getid_unidad().equals(-1L))) {productoprodumerma.setid_unidad(productoprodumermaBean.getid_unidad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProductoProduMerma(ProductoProduMerma productoprodumermaOrigen,ProductoProduMerma productoprodumerma,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productoprodumermaOrigen.getId()!=null && !productoprodumermaOrigen.getId().equals(0L))) {productoprodumerma.setId(productoprodumermaOrigen.getId());}}
			if(conDefault || (!conDefault && productoprodumermaOrigen.getid_producto_defi_produ()!=null && !productoprodumermaOrigen.getid_producto_defi_produ().equals(-1L))) {productoprodumerma.setid_producto_defi_produ(productoprodumermaOrigen.getid_producto_defi_produ());}
			if(conDefault || (!conDefault && productoprodumermaOrigen.getid_tipo_merma_empresa()!=null && !productoprodumermaOrigen.getid_tipo_merma_empresa().equals(-1L))) {productoprodumerma.setid_tipo_merma_empresa(productoprodumermaOrigen.getid_tipo_merma_empresa());}
			if(conDefault || (!conDefault && productoprodumermaOrigen.getid_unidad()!=null && !productoprodumermaOrigen.getid_unidad().equals(-1L))) {productoprodumerma.setid_unidad(productoprodumermaOrigen.getid_unidad());}
			if(conDefault || (!conDefault && productoprodumermaOrigen.getcantidad()!=null && !productoprodumermaOrigen.getcantidad().equals(0))) {productoprodumerma.setcantidad(productoprodumermaOrigen.getcantidad());}
			if(conDefault || (!conDefault && productoprodumermaOrigen.getcosto()!=null && !productoprodumermaOrigen.getcosto().equals(0.0))) {productoprodumerma.setcosto(productoprodumermaOrigen.getcosto());}
			if(conDefault || (!conDefault && productoprodumermaOrigen.getcosto_total()!=null && !productoprodumermaOrigen.getcosto_total().equals(0.0))) {productoprodumerma.setcosto_total(productoprodumermaOrigen.getcosto_total());}
			if(conDefault || (!conDefault && productoprodumermaOrigen.getdescripcion()!=null && !productoprodumermaOrigen.getdescripcion().equals(""))) {productoprodumerma.setdescripcion(productoprodumermaOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductoProduMerma(ProductoProduMerma productoprodumerma) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductoProduMerma.jLabelidProductoProduMerma.setText(productoprodumerma.getId().toString());
			this.jInternalFrameDetalleFormProductoProduMerma.jTextFieldcantidadProductoProduMerma.setText(productoprodumerma.getcantidad().toString());
			this.jInternalFrameDetalleFormProductoProduMerma.jTextFieldcostoProductoProduMerma.setText(productoprodumerma.getcosto().toString());
			this.jInternalFrameDetalleFormProductoProduMerma.jTextFieldcosto_totalProductoProduMerma.setText(productoprodumerma.getcosto_total().toString());
			this.jInternalFrameDetalleFormProductoProduMerma.jTextAreadescripcionProductoProduMerma.setText(productoprodumerma.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductoProduMerma(ProductoProduMermaBean productoprodumermaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductoProduMerma.jLabelidProductoProduMerma.setText(productoprodumermaBean.getId().toString());
			this.jInternalFrameDetalleFormProductoProduMerma.jTextFieldcantidadProductoProduMerma.setText(productoprodumermaBean.getcantidad().toString());
			this.jInternalFrameDetalleFormProductoProduMerma.jTextFieldcostoProductoProduMerma.setText(productoprodumermaBean.getcosto().toString());
			this.jInternalFrameDetalleFormProductoProduMerma.jTextFieldcosto_totalProductoProduMerma.setText(productoprodumermaBean.getcosto_total().toString());
			this.jInternalFrameDetalleFormProductoProduMerma.jTextAreadescripcionProductoProduMerma.setText(productoprodumermaBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProductoProduMerma(ProductoProduMermaParameterReturnGeneral productoprodumermaReturnGeneral,ProductoProduMermaBean productoprodumermaBean,Boolean conDefault) throws Exception { 
		try {
			ProductoProduMerma productoprodumermaLocal=new ProductoProduMerma();
			
			productoprodumermaLocal=productoprodumermaReturnGeneral.getProductoProduMerma();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productoprodumermaLocal.getId()!=null && !productoprodumermaLocal.getId().equals(0L))) {productoprodumermaBean.setId(productoprodumermaLocal.getId());}}
			if(conDefault || (!conDefault && productoprodumermaLocal.getid_producto_defi_produ()!=null && !productoprodumermaLocal.getid_producto_defi_produ().equals(-1L))) {productoprodumermaBean.setid_producto_defi_produ(productoprodumermaLocal.getid_producto_defi_produ());}
			if(conDefault || (!conDefault && productoprodumermaLocal.getid_tipo_merma_empresa()!=null && !productoprodumermaLocal.getid_tipo_merma_empresa().equals(-1L))) {productoprodumermaBean.setid_tipo_merma_empresa(productoprodumermaLocal.getid_tipo_merma_empresa());}
			if(conDefault || (!conDefault && productoprodumermaLocal.getid_unidad()!=null && !productoprodumermaLocal.getid_unidad().equals(-1L))) {productoprodumermaBean.setid_unidad(productoprodumermaLocal.getid_unidad());}
			if(conDefault || (!conDefault && productoprodumermaLocal.getcantidad()!=null && !productoprodumermaLocal.getcantidad().equals(0))) {productoprodumermaBean.setcantidad(productoprodumermaLocal.getcantidad());}
			if(conDefault || (!conDefault && productoprodumermaLocal.getcosto()!=null && !productoprodumermaLocal.getcosto().equals(0.0))) {productoprodumermaBean.setcosto(productoprodumermaLocal.getcosto());}
			if(conDefault || (!conDefault && productoprodumermaLocal.getcosto_total()!=null && !productoprodumermaLocal.getcosto_total().equals(0.0))) {productoprodumermaBean.setcosto_total(productoprodumermaLocal.getcosto_total());}
			if(conDefault || (!conDefault && productoprodumermaLocal.getdescripcion()!=null && !productoprodumermaLocal.getdescripcion().equals(""))) {productoprodumermaBean.setdescripcion(productoprodumermaLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProductoProduMermaGenerico(Long idProductoProduMermaSeleccionado,JComboBox jComboBoxProductoProduMerma,List<ProductoProduMerma> productoprodumermasLocal)throws Exception {
		try {
			ProductoProduMerma  productoprodumermaTemp=null;

			for(ProductoProduMerma productoprodumermaAux:productoprodumermasLocal) {
				if(productoprodumermaAux.getId()!=null && productoprodumermaAux.getId().equals(idProductoProduMermaSeleccionado)) {
					productoprodumermaTemp=productoprodumermaAux;
					break;
				}
			}

			jComboBoxProductoProduMerma.setSelectedItem(productoprodumermaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProductoProduMermaGenerico(JComboBox jComboBoxProductoProduMerma,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProductoProduMerma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductoProduMerma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProductoProduMerma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductoProduMerma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductoProduMerma.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProductoProduMerma.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductoProduMerma.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProductoProduMerma.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProductoProduMerma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProductoProduMerma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoprodumerma=(ProductoProduMerma) productoprodumermaLogic.getProductoProduMermas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productoprodumerma =(ProductoProduMerma) productoprodumermas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("ProductoDefiProdu")) {
			//sDescripcion=this.getActualProductoDefiProduForeignKeyDescripcion((Long)value);
			if(!productoprodumerma.getIsNew() && !productoprodumerma.getIsChanged() && !productoprodumerma.getIsDeleted()) {
				sDescripcion=productoprodumerma.getproductodefiprodu_descripcion();
			} else {
				//sDescripcion=this.getActualProductoDefiProduForeignKeyDescripcion((Long)value);
				sDescripcion=productoprodumerma.getproductodefiprodu_descripcion();
			}
		}

		if(sTipo.equals("TipoMermaEmpresa")) {
			//sDescripcion=this.getActualTipoMermaEmpresaForeignKeyDescripcion((Long)value);
			if(!productoprodumerma.getIsNew() && !productoprodumerma.getIsChanged() && !productoprodumerma.getIsDeleted()) {
				sDescripcion=productoprodumerma.gettipomermaempresa_descripcion();
			} else {
				//sDescripcion=this.getActualTipoMermaEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=productoprodumerma.gettipomermaempresa_descripcion();
			}
		}

		if(sTipo.equals("Unidad")) {
			//sDescripcion=this.getActualUnidadForeignKeyDescripcion((Long)value);
			if(!productoprodumerma.getIsNew() && !productoprodumerma.getIsChanged() && !productoprodumerma.getIsDeleted()) {
				sDescripcion=productoprodumerma.getunidad_descripcion();
			} else {
				//sDescripcion=this.getActualUnidadForeignKeyDescripcion((Long)value);
				sDescripcion=productoprodumerma.getunidad_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProductoProduMerma productoprodumermaRow=new ProductoProduMerma();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoprodumermaRow=(ProductoProduMerma) productoprodumermaLogic.getProductoProduMermas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productoprodumermaRow=(ProductoProduMerma) productoprodumermas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProductoProduMerma(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProductoProduMerma.setVisible((this.isVisibilidadCeldaNuevoProductoProduMerma && this.isPermisoNuevoProductoProduMerma));			
			this.jButtonDuplicarProductoProduMerma.setVisible((this.isVisibilidadCeldaDuplicarProductoProduMerma && this.isPermisoDuplicarProductoProduMerma));			
			this.jButtonCopiarProductoProduMerma.setVisible((this.isVisibilidadCeldaCopiarProductoProduMerma && this.isPermisoCopiarProductoProduMerma));
			this.jButtonVerFormProductoProduMerma.setVisible((this.isVisibilidadCeldaVerFormProductoProduMerma && this.isPermisoVerFormProductoProduMerma));
			
			this.jButtonAbrirOrderByProductoProduMerma.setVisible((this.isVisibilidadCeldaOrdenProductoProduMerma && this.isPermisoOrdenProductoProduMerma));			
			
			this.jButtonNuevoRelacionesProductoProduMerma.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoProduMerma && this.isPermisoNuevoProductoProduMerma));			
			this.jButtonNuevoGuardarCambiosProductoProduMerma.setVisible((this.isVisibilidadCeldaNuevoProductoProduMerma && this.isPermisoNuevoProductoProduMerma && this.isPermisoGuardarCambiosProductoProduMerma));
			
			if(this.jInternalFrameDetalleFormProductoProduMerma!=null) {
			this.jInternalFrameDetalleFormProductoProduMerma.jButtonModificarProductoProduMerma.setVisible((this.isVisibilidadCeldaModificarProductoProduMerma && this.isPermisoActualizarProductoProduMerma));	
			this.jInternalFrameDetalleFormProductoProduMerma.jButtonActualizarProductoProduMerma.setVisible((this.isVisibilidadCeldaActualizarProductoProduMerma && this.isPermisoActualizarProductoProduMerma));	
			this.jInternalFrameDetalleFormProductoProduMerma.jButtonEliminarProductoProduMerma.setVisible((this.isVisibilidadCeldaEliminarProductoProduMerma && this.isPermisoEliminarProductoProduMerma));
			this.jInternalFrameDetalleFormProductoProduMerma.jButtonCancelarProductoProduMerma.setVisible(this.isVisibilidadCeldaCancelarProductoProduMerma);							
			this.jInternalFrameDetalleFormProductoProduMerma.jButtonGuardarCambiosProductoProduMerma.setVisible((this.isVisibilidadCeldaGuardarProductoProduMerma && this.isPermisoGuardarCambiosProductoProduMerma));			
			
			}
						
			this.jButtonGuardarCambiosTablaProductoProduMerma.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoProduMerma && this.isPermisoGuardarCambiosProductoProduMerma));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProductoProduMerma.setVisible((this.isVisibilidadCeldaNuevoProductoProduMerma && this.isPermisoNuevoProductoProduMerma));						
			this.jButtonDuplicarToolBarProductoProduMerma.setVisible((this.isVisibilidadCeldaDuplicarProductoProduMerma && this.isPermisoDuplicarProductoProduMerma));						
			this.jButtonCopiarToolBarProductoProduMerma.setVisible((this.isVisibilidadCeldaCopiarProductoProduMerma && this.isPermisoCopiarProductoProduMerma));			
			this.jButtonVerFormToolBarProductoProduMerma.setVisible((this.isVisibilidadCeldaVerFormProductoProduMerma && this.isPermisoVerFormProductoProduMerma));			
			this.jButtonAbrirOrderByToolBarProductoProduMerma.setVisible((this.isVisibilidadCeldaOrdenProductoProduMerma && this.isPermisoOrdenProductoProduMerma));
			this.jButtonNuevoRelacionesToolBarProductoProduMerma.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoProduMerma && this.isPermisoNuevoProductoProduMerma));			
			this.jButtonNuevoGuardarCambiosToolBarProductoProduMerma.setVisible((this.isVisibilidadCeldaNuevoProductoProduMerma && this.isPermisoNuevoProductoProduMerma && this.isPermisoGuardarCambiosProductoProduMerma));			
			
			if(this.jInternalFrameDetalleFormProductoProduMerma!=null) {
			this.jInternalFrameDetalleFormProductoProduMerma.jButtonModificarToolBarProductoProduMerma.setVisible((this.isVisibilidadCeldaModificarProductoProduMerma && this.isPermisoActualizarProductoProduMerma));	
			this.jInternalFrameDetalleFormProductoProduMerma.jButtonActualizarToolBarProductoProduMerma.setVisible((this.isVisibilidadCeldaActualizarProductoProduMerma  && this.isPermisoActualizarProductoProduMerma));	
			this.jInternalFrameDetalleFormProductoProduMerma.jButtonEliminarToolBarProductoProduMerma.setVisible((this.isVisibilidadCeldaEliminarProductoProduMerma && this.isPermisoEliminarProductoProduMerma));
			this.jInternalFrameDetalleFormProductoProduMerma.jButtonCancelarToolBarProductoProduMerma.setVisible(this.isVisibilidadCeldaCancelarProductoProduMerma);				
			this.jInternalFrameDetalleFormProductoProduMerma.jButtonGuardarCambiosToolBarProductoProduMerma.setVisible((this.isVisibilidadCeldaGuardarProductoProduMerma && this.isPermisoGuardarCambiosProductoProduMerma));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProductoProduMerma.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoProduMerma && this.isPermisoGuardarCambiosProductoProduMerma));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProductoProduMerma.setVisible((this.isVisibilidadCeldaNuevoProductoProduMerma && this.isPermisoNuevoProductoProduMerma));			
			this.jMenuItemDuplicarProductoProduMerma.setVisible((this.isVisibilidadCeldaDuplicarProductoProduMerma && this.isPermisoDuplicarProductoProduMerma));			
			this.jMenuItemCopiarProductoProduMerma.setVisible((this.isVisibilidadCeldaCopiarProductoProduMerma && this.isPermisoCopiarProductoProduMerma));			
			this.jMenuItemVerFormProductoProduMerma.setVisible((this.isVisibilidadCeldaVerFormProductoProduMerma && this.isPermisoVerFormProductoProduMerma));			
			this.jMenuItemAbrirOrderByProductoProduMerma.setVisible((this.isVisibilidadCeldaOrdenProductoProduMerma && this.isPermisoOrdenProductoProduMerma));			
			//this.jMenuItemMostrarOcultarProductoProduMerma.setVisible((this.isVisibilidadCeldaOrdenProductoProduMerma && this.isPermisoOrdenProductoProduMerma));
			this.jMenuItemDetalleAbrirOrderByProductoProduMerma.setVisible((this.isVisibilidadCeldaOrdenProductoProduMerma && this.isPermisoOrdenProductoProduMerma));			
			//this.jMenuItemDetalleMostrarOcultarProductoProduMerma.setVisible((this.isVisibilidadCeldaOrdenProductoProduMerma && this.isPermisoOrdenProductoProduMerma));			
			this.jMenuItemNuevoRelacionesProductoProduMerma.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoProduMerma && this.isPermisoNuevoProductoProduMerma));			
			this.jMenuItemNuevoGuardarCambiosProductoProduMerma.setVisible((this.isVisibilidadCeldaNuevoProductoProduMerma && this.isPermisoNuevoProductoProduMerma && this.isPermisoGuardarCambiosProductoProduMerma));									
			
			if(this.jInternalFrameDetalleFormProductoProduMerma!=null) {
			this.jInternalFrameDetalleFormProductoProduMerma.jMenuItemModificarProductoProduMerma.setVisible((this.isVisibilidadCeldaModificarProductoProduMerma && this.isPermisoActualizarProductoProduMerma));	
			this.jInternalFrameDetalleFormProductoProduMerma.jMenuItemActualizarProductoProduMerma.setVisible((this.isVisibilidadCeldaActualizarProductoProduMerma && this.isPermisoActualizarProductoProduMerma));	
			this.jInternalFrameDetalleFormProductoProduMerma.jMenuItemEliminarProductoProduMerma.setVisible((this.isVisibilidadCeldaEliminarProductoProduMerma && this.isPermisoEliminarProductoProduMerma));
			this.jInternalFrameDetalleFormProductoProduMerma.jMenuItemCancelarProductoProduMerma.setVisible(this.isVisibilidadCeldaCancelarProductoProduMerma);				
			}
			
			this.jMenuItemGuardarCambiosProductoProduMerma.setVisible((this.isVisibilidadCeldaGuardarProductoProduMerma && this.isPermisoGuardarCambiosProductoProduMerma));						
			this.jMenuItemGuardarCambiosTablaProductoProduMerma.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoProduMerma && this.isPermisoGuardarCambiosProductoProduMerma));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProductoProduMerma=this.jButtonNuevoProductoProduMerma.isVisible();
			this.isVisibilidadCeldaDuplicarProductoProduMerma=this.jButtonDuplicarProductoProduMerma.isVisible();
			this.isVisibilidadCeldaCopiarProductoProduMerma=this.jButtonCopiarProductoProduMerma.isVisible();
			this.isVisibilidadCeldaVerFormProductoProduMerma=this.jButtonVerFormProductoProduMerma.isVisible();
			
			this.isVisibilidadCeldaOrdenProductoProduMerma=this.jButtonAbrirOrderByProductoProduMerma.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProductoProduMerma=this.jButtonNuevoRelacionesProductoProduMerma.isVisible();
			this.isVisibilidadCeldaModificarProductoProduMerma=this.jButtonModificarProductoProduMerma.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoProduMerma!=null) {
			this.isVisibilidadCeldaActualizarProductoProduMerma=this.jInternalFrameDetalleFormProductoProduMerma.jButtonActualizarProductoProduMerma.isVisible();
			this.isVisibilidadCeldaEliminarProductoProduMerma=this.jInternalFrameDetalleFormProductoProduMerma.jButtonEliminarProductoProduMerma.isVisible();
			this.isVisibilidadCeldaCancelarProductoProduMerma=this.jInternalFrameDetalleFormProductoProduMerma.jButtonCancelarProductoProduMerma.isVisible();
			this.isVisibilidadCeldaGuardarProductoProduMerma=this.jInternalFrameDetalleFormProductoProduMerma.jButtonGuardarCambiosProductoProduMerma.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProductoProduMerma=this.jButtonGuardarCambiosTablaProductoProduMerma.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProductoProduMerma=this.jButtonNuevoToolBarProductoProduMerma.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductoProduMerma=this.jButtonNuevoRelacionesToolBarProductoProduMerma.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoProduMerma!=null) {
			this.isVisibilidadCeldaModificarProductoProduMerma=this.jInternalFrameDetalleFormProductoProduMerma.jButtonModificarToolBarProductoProduMerma.isVisible();
			this.isVisibilidadCeldaActualizarProductoProduMerma=this.jInternalFrameDetalleFormProductoProduMerma.jButtonActualizarToolBarProductoProduMerma.isVisible();
			this.isVisibilidadCeldaEliminarProductoProduMerma=this.jInternalFrameDetalleFormProductoProduMerma.jButtonEliminarToolBarProductoProduMerma.isVisible();
			this.isVisibilidadCeldaCancelarProductoProduMerma=this.jInternalFrameDetalleFormProductoProduMerma.jButtonCancelarToolBarProductoProduMerma.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductoProduMerma=this.jButtonGuardarCambiosToolBarProductoProduMerma.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductoProduMerma=this.jButtonGuardarCambiosTablaToolBarProductoProduMerma.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProductoProduMerma=this.jMenuItemNuevoProductoProduMerma.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductoProduMerma=this.jMenuItemNuevoRelacionesProductoProduMerma.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoProduMerma!=null) {
			this.isVisibilidadCeldaModificarProductoProduMerma=this.jInternalFrameDetalleFormProductoProduMerma.jMenuItemModificarProductoProduMerma.isVisible();
			this.isVisibilidadCeldaActualizarProductoProduMerma=this.jInternalFrameDetalleFormProductoProduMerma.jMenuItemActualizarProductoProduMerma.isVisible();
			this.isVisibilidadCeldaEliminarProductoProduMerma=this.jInternalFrameDetalleFormProductoProduMerma.jMenuItemEliminarProductoProduMerma.isVisible();
			this.isVisibilidadCeldaCancelarProductoProduMerma=this.jInternalFrameDetalleFormProductoProduMerma.jMenuItemCancelarProductoProduMerma.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductoProduMerma=this.jMenuItemGuardarCambiosProductoProduMerma.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductoProduMerma=this.jMenuItemGuardarCambiosTablaProductoProduMerma.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProductoProduMerma(Boolean esInicializar) {
		if(ProductoProduMermaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.productoprodumermaSessionBean.getConGuardarRelaciones()) {
				//if(this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProductoProduMerma();
			}
			
			this.inicializarActualizarBindingBotonesManualProductoProduMerma(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProductoProduMerma() {
		this.jButtonNuevoProductoProduMerma.setVisible(this.isPermisoNuevoProductoProduMerma);			
		this.jButtonDuplicarProductoProduMerma.setVisible(this.isPermisoDuplicarProductoProduMerma);			
		this.jButtonCopiarProductoProduMerma.setVisible(this.isPermisoCopiarProductoProduMerma);			
		this.jButtonVerFormProductoProduMerma.setVisible(this.isPermisoVerFormProductoProduMerma);			
		
		this.jButtonAbrirOrderByProductoProduMerma.setVisible(this.isPermisoOrdenProductoProduMerma);					
		
		this.jButtonNuevoRelacionesProductoProduMerma.setVisible(this.isPermisoNuevoProductoProduMerma);			
		
		if(this.jInternalFrameDetalleFormProductoProduMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMerma.jButtonModificarProductoProduMerma.setVisible(this.isPermisoActualizarProductoProduMerma);	
			this.jInternalFrameDetalleFormProductoProduMerma.jButtonActualizarProductoProduMerma.setVisible(this.isPermisoActualizarProductoProduMerma);	
			this.jInternalFrameDetalleFormProductoProduMerma.jButtonEliminarProductoProduMerma.setVisible(this.isPermisoEliminarProductoProduMerma);
			this.jInternalFrameDetalleFormProductoProduMerma.jButtonCancelarProductoProduMerma.setVisible(this.isVisibilidadCeldaCancelarProductoProduMerma);						
			this.jInternalFrameDetalleFormProductoProduMerma.jButtonGuardarCambiosProductoProduMerma.setVisible(this.isPermisoGuardarCambiosProductoProduMerma);							
		}
		
		this.jButtonGuardarCambiosTablaProductoProduMerma.setVisible(this.isPermisoActualizarProductoProduMerma);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProductoProduMerma() {
		this.jInternalFrameDetalleFormProductoProduMerma.jButtonModificarProductoProduMerma.setVisible(this.isPermisoActualizarProductoProduMerma);	
		this.jInternalFrameDetalleFormProductoProduMerma.jButtonActualizarProductoProduMerma.setVisible(this.isPermisoActualizarProductoProduMerma);	
		this.jInternalFrameDetalleFormProductoProduMerma.jButtonEliminarProductoProduMerma.setVisible(this.isPermisoEliminarProductoProduMerma);
		this.jInternalFrameDetalleFormProductoProduMerma.jButtonCancelarProductoProduMerma.setVisible(this.isVisibilidadCeldaCancelarProductoProduMerma);							
		this.jInternalFrameDetalleFormProductoProduMerma.jButtonGuardarCambiosProductoProduMerma.setVisible((this.isVisibilidadCeldaGuardarProductoProduMerma && this.isPermisoGuardarCambiosProductoProduMerma));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProductoProduMerma() {
		if(ProductoProduMermaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProductoProduMerma();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProductoProduMerma() {
	}
	
	public void jTableDatosProductoProduMermaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProductoProduMerma(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProductoProduMermaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumermaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduMerma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProduMerma(this.getproductoprodumerma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMerma(this.productoprodumerma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodumerma =(ProductoProduMerma) this.productoprodumermaLogic.getProductoProduMermas().toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodumerma =(ProductoProduMerma) this.productoprodumermas.toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodumerma==null) {
						this.productoprodumerma = new ProductoProduMerma();
					}

					this.setVariablesFormularioToObjetoActualProductoProduMerma(this.productoprodumerma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMerma(this.productoprodumerma);
				}

				if(this.productoprodumerma.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.productoprodumerma.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProduMerma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumermaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumermaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumermaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_producto_defi_produProductoProduMermaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproductodefiprodu=true;

			idTienePermisoproductodefiprodu=this.tienePermisosUsuarioEnPaginaWebProductoProduMerma(ProductoDefiProduConstantesFunciones.CLASSNAME);

			if(idTienePermisoproductodefiprodu) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduMerma.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoProduMerma.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoProduMerma.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumerma =(ProductoProduMerma) this.productoprodumermaLogic.getProductoProduMermas().toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoprodumerma =(ProductoProduMerma) this.productoprodumermas.toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoProduMerma(this.getproductoprodumerma(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMerma(this.productoprodumerma);

				this.productodefiproduBeanSwingJInternalFrame=new ProductoDefiProduBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productodefiproduBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productodefiproduBeanSwingJInternalFrame.getProductoDefiProduLogic().setConnexion(this.productoprodumermaLogic.getConnexion());

				if(this.productoprodumerma.getid_producto_defi_produ()!=null) {
					this.productodefiproduBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productodefiproduBeanSwingJInternalFrame.setIdActual(this.productoprodumerma.getid_producto_defi_produ());
					this.productodefiproduBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productodefiproduBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productodefiproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoDefiProdu();
				}

				JInternalFrameBase jinternalFrame =this.productodefiproduBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoProduMerma=(TitledBorder)this.jScrollPanelDatosProductoProduMerma.getBorder();
				TitledBorder titledBorderproductodefiprodu=(TitledBorder)this.productodefiproduBeanSwingJInternalFrame.jScrollPanelDatosProductoDefiProdu.getBorder();

				titledBorderproductodefiprodu.setTitle(titledBorderProductoProduMerma.getTitle() + " -> Producto Definicion Produccion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_producto_defi_produProductoProduMermaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumermaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduMerma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProduMerma(this.getproductoprodumerma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMerma(this.productoprodumerma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodumerma =(ProductoProduMerma) this.productoprodumermaLogic.getProductoProduMermas().toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodumerma =(ProductoProduMerma) this.productoprodumermas.toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodumerma==null) {
						this.productoprodumerma = new ProductoProduMerma();
					}

					this.setVariablesFormularioToObjetoActualProductoProduMerma(this.productoprodumerma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMerma(this.productoprodumerma);
				}

				if(this.productoprodumerma.getid_producto_defi_produ()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto_defi_produ = "+this.productoprodumerma.getid_producto_defi_produ().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProduMerma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumermaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumermaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumermaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_merma_empresaProductoProduMermaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipomermaempresa=true;

			idTienePermisotipomermaempresa=this.tienePermisosUsuarioEnPaginaWebProductoProduMerma(TipoMermaEmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisotipomermaempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduMerma.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoProduMerma.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoProduMerma.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumerma =(ProductoProduMerma) this.productoprodumermaLogic.getProductoProduMermas().toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoprodumerma =(ProductoProduMerma) this.productoprodumermas.toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoProduMerma(this.getproductoprodumerma(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMerma(this.productoprodumerma);

				this.tipomermaempresaBeanSwingJInternalFrame=new TipoMermaEmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipomermaempresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipomermaempresaBeanSwingJInternalFrame.getTipoMermaEmpresaLogic().setConnexion(this.productoprodumermaLogic.getConnexion());

				if(this.productoprodumerma.getid_tipo_merma_empresa()!=null) {
					this.tipomermaempresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipomermaempresaBeanSwingJInternalFrame.setIdActual(this.productoprodumerma.getid_tipo_merma_empresa());
					this.tipomermaempresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipomermaempresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipomermaempresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoMermaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.tipomermaempresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoProduMerma=(TitledBorder)this.jScrollPanelDatosProductoProduMerma.getBorder();
				TitledBorder titledBordertipomermaempresa=(TitledBorder)this.tipomermaempresaBeanSwingJInternalFrame.jScrollPanelDatosTipoMermaEmpresa.getBorder();

				titledBordertipomermaempresa.setTitle(titledBorderProductoProduMerma.getTitle() + " -> Tipo Merma Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_merma_empresaProductoProduMermaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumermaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduMerma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProduMerma(this.getproductoprodumerma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMerma(this.productoprodumerma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodumerma =(ProductoProduMerma) this.productoprodumermaLogic.getProductoProduMermas().toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodumerma =(ProductoProduMerma) this.productoprodumermas.toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodumerma==null) {
						this.productoprodumerma = new ProductoProduMerma();
					}

					this.setVariablesFormularioToObjetoActualProductoProduMerma(this.productoprodumerma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMerma(this.productoprodumerma);
				}

				if(this.productoprodumerma.getid_tipo_merma_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_merma_empresa = "+this.productoprodumerma.getid_tipo_merma_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProduMerma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumermaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumermaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumermaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_unidadProductoProduMermaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisounidad=true;

			idTienePermisounidad=this.tienePermisosUsuarioEnPaginaWebProductoProduMerma(UnidadConstantesFunciones.CLASSNAME);

			if(idTienePermisounidad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduMerma.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoProduMerma.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoProduMerma.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumerma =(ProductoProduMerma) this.productoprodumermaLogic.getProductoProduMermas().toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoprodumerma =(ProductoProduMerma) this.productoprodumermas.toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoProduMerma(this.getproductoprodumerma(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMerma(this.productoprodumerma);

				this.unidadBeanSwingJInternalFrame=new UnidadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.unidadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.unidadBeanSwingJInternalFrame.getUnidadLogic().setConnexion(this.productoprodumermaLogic.getConnexion());

				if(this.productoprodumerma.getid_unidad()!=null) {
					this.unidadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.unidadBeanSwingJInternalFrame.setIdActual(this.productoprodumerma.getid_unidad());
					this.unidadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.inicializarActualizarBindingTablaUnidad();
				}

				JInternalFrameBase jinternalFrame =this.unidadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoProduMerma=(TitledBorder)this.jScrollPanelDatosProductoProduMerma.getBorder();
				TitledBorder titledBorderunidad=(TitledBorder)this.unidadBeanSwingJInternalFrame.jScrollPanelDatosUnidad.getBorder();

				titledBorderunidad.setTitle(titledBorderProductoProduMerma.getTitle() + " -> Unidad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_unidadProductoProduMermaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumermaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduMerma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProduMerma(this.getproductoprodumerma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMerma(this.productoprodumerma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodumerma =(ProductoProduMerma) this.productoprodumermaLogic.getProductoProduMermas().toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodumerma =(ProductoProduMerma) this.productoprodumermas.toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodumerma==null) {
						this.productoprodumerma = new ProductoProduMerma();
					}

					this.setVariablesFormularioToObjetoActualProductoProduMerma(this.productoprodumerma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMerma(this.productoprodumerma);
				}

				if(this.productoprodumerma.getid_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_unidad = "+this.productoprodumerma.getid_unidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProduMerma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumermaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumermaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumermaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadProductoProduMermaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumermaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduMerma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProduMerma(this.getproductoprodumerma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMerma(this.productoprodumerma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodumerma =(ProductoProduMerma) this.productoprodumermaLogic.getProductoProduMermas().toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodumerma =(ProductoProduMerma) this.productoprodumermas.toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodumerma==null) {
						this.productoprodumerma = new ProductoProduMerma();
					}

					this.setVariablesFormularioToObjetoActualProductoProduMerma(this.productoprodumerma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMerma(this.productoprodumerma);
				}

				if(this.productoprodumerma.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.productoprodumerma.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProduMerma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumermaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumermaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumermaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncostoProductoProduMermaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumermaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduMerma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProduMerma(this.getproductoprodumerma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMerma(this.productoprodumerma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodumerma =(ProductoProduMerma) this.productoprodumermaLogic.getProductoProduMermas().toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodumerma =(ProductoProduMerma) this.productoprodumermas.toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodumerma==null) {
						this.productoprodumerma = new ProductoProduMerma();
					}

					this.setVariablesFormularioToObjetoActualProductoProduMerma(this.productoprodumerma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMerma(this.productoprodumerma);
				}

				if(this.productoprodumerma.getcosto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo = "+this.productoprodumerma.getcosto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProduMerma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumermaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumermaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumermaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncosto_totalProductoProduMermaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumermaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduMerma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProduMerma(this.getproductoprodumerma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMerma(this.productoprodumerma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodumerma =(ProductoProduMerma) this.productoprodumermaLogic.getProductoProduMermas().toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodumerma =(ProductoProduMerma) this.productoprodumermas.toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodumerma==null) {
						this.productoprodumerma = new ProductoProduMerma();
					}

					this.setVariablesFormularioToObjetoActualProductoProduMerma(this.productoprodumerma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMerma(this.productoprodumerma);
				}

				if(this.productoprodumerma.getcosto_total()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo_total = "+this.productoprodumerma.getcosto_total().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProduMerma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumermaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumermaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumermaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionProductoProduMermaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumermaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduMerma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProduMerma(this.getproductoprodumerma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMerma(this.productoprodumerma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodumerma =(ProductoProduMerma) this.productoprodumermaLogic.getProductoProduMermas().toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodumerma =(ProductoProduMerma) this.productoprodumermas.toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodumerma==null) {
						this.productoprodumerma = new ProductoProduMerma();
					}

					this.setVariablesFormularioToObjetoActualProductoProduMerma(this.productoprodumerma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMerma(this.productoprodumerma);
				}

				if(this.productoprodumerma.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.productoprodumerma.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProduMerma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumermaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumermaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumermaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdProductoDefiProduProductoProduMermaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoProduMerma(false,false);

			this.getProductoProduMermasFK_IdProductoDefiProdu();

			this.inicializarActualizarBindingProductoProduMerma(false);

			//if(ProductoProduMermaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoProduMerma(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoMermaEmpresaProductoProduMermaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoProduMerma(false,false);

			this.getProductoProduMermasFK_IdTipoMermaEmpresa();

			this.inicializarActualizarBindingProductoProduMerma(false);

			//if(ProductoProduMermaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoProduMerma(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUnidadProductoProduMermaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoProduMerma(false,false);

			this.getProductoProduMermasFK_IdUnidad();

			this.inicializarActualizarBindingProductoProduMerma(false);

			//if(ProductoProduMermaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoProduMerma(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumermaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProductoProduMerma() {
		if(this.jInternalFrameDetalleFormProductoProduMerma!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProductoProduMerma!=null) {
			this.jInternalFrameDetalleFormProductoProduMerma.setVisible(false);	    			
			this.jInternalFrameDetalleFormProductoProduMerma.dispose();
			this.jInternalFrameDetalleFormProductoProduMerma=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProductoProduMerma!=null) {
			this.jInternalFrameReporteDinamicoProductoProduMerma.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProductoProduMerma.dispose();
			this.jInternalFrameReporteDinamicoProductoProduMerma=null;
		}
		
		if(this.jInternalFrameImportacionProductoProduMerma!=null) {
			this.jInternalFrameImportacionProductoProduMerma.setVisible(false);	    			
			this.jInternalFrameImportacionProductoProduMerma.dispose();
			this.jInternalFrameImportacionProductoProduMerma=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProductoProduMerma();
			
			ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
			
			
			if(sTipo.equals("NuevoProductoProduMerma")) {
				jButtonNuevoProductoProduMermaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProductoProduMerma")) {
				jButtonDuplicarProductoProduMermaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProductoProduMerma")) {
				jButtonCopiarProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("VerFormProductoProduMerma")) {
				jButtonVerFormProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProductoProduMerma")) {
				jButtonNuevoProductoProduMermaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProductoProduMerma")) {
				jButtonDuplicarProductoProduMermaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProductoProduMerma")) {
				jButtonNuevoProductoProduMermaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProductoProduMerma")) {
				jButtonDuplicarProductoProduMermaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProductoProduMerma")) {
				jButtonNuevoProductoProduMermaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProductoProduMerma")) {
				jButtonNuevoProductoProduMermaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProductoProduMerma")) {
				jButtonNuevoProductoProduMermaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProductoProduMerma")) {
				jButtonModificarProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProductoProduMerma")) {
				jButtonModificarProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProductoProduMerma")) {
				jButtonModificarProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProductoProduMerma")) {
				jButtonActualizarProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProductoProduMerma")) {
				jButtonActualizarProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProductoProduMerma")) {
				jButtonActualizarProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("EliminarProductoProduMerma")) {
				jButtonEliminarProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProductoProduMerma")) {
				jButtonEliminarProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProductoProduMerma")) {
				jButtonEliminarProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("CancelarProductoProduMerma")) {
				jButtonCancelarProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProductoProduMerma")) {
				jButtonCancelarProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProductoProduMerma")) {
				jButtonCancelarProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("CerrarProductoProduMerma")) {
				jButtonCerrarProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProductoProduMerma")) {
				jButtonCerrarProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProductoProduMerma")) {
				jButtonCerrarProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProductoProduMerma")) {
				jButtonMostrarOcultarProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProductoProduMerma")) {
				jButtonCancelarProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProductoProduMerma")) {
				jButtonGuardarCambiosProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProductoProduMerma")) {
				jButtonGuardarCambiosProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProductoProduMerma")) {
				jButtonCopiarProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProductoProduMerma")) {
				jButtonVerFormProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProductoProduMerma")) {
				jButtonGuardarCambiosProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProductoProduMerma")) {
				jButtonCopiarProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProductoProduMerma")) {
				jButtonVerFormProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProductoProduMerma")) {
				jButtonGuardarCambiosProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProductoProduMerma")) {
				jButtonGuardarCambiosProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProductoProduMerma")) {
				jButtonGuardarCambiosProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProductoProduMerma")) {
				jButtonRecargarInformacionProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProductoProduMerma")) {
				jButtonRecargarInformacionProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProductoProduMerma")) {
				jButtonRecargarInformacionProductoProduMermaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProductoProduMerma")) {
				jButtonAnterioresProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProductoProduMerma")) {
				jButtonAnterioresProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProductoProduMerma")) {
				jButtonAnterioresProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProductoProduMerma")) {
				jButtonSiguientesProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProductoProduMerma")) {
				jButtonSiguientesProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProductoProduMerma")) {
				jButtonSiguientesProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProductoProduMerma") || sTipo.equals("MenuItemDetalleAbrirOrderByProductoProduMerma")) {
				jButtonAbrirOrderByProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProductoProduMerma") || sTipo.equals("MenuItemDetalleMostrarOcultarProductoProduMerma")) {
				jButtonMostrarOcultarProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProductoProduMerma")) {
				jButtonNuevoGuardarCambiosProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProductoProduMerma")) {
				jButtonNuevoGuardarCambiosProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProductoProduMerma")) {
				jButtonNuevoGuardarCambiosProductoProduMermaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProductoProduMerma")) {
				jButtonCerrarReporteDinamicoProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProductoProduMerma")) {
				jButtonGenerarReporteDinamicoProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProductoProduMerma")) {
				
				jButtonGenerarExcelReporteDinamicoProductoProduMermaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProductoProduMerma")) {
				jButtonCerrarImportacionProductoProduMermaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProductoProduMerma")) {
				
				jButtonGenerarImportacionProductoProduMermaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProductoProduMerma")) {
				
				jButtonAbrirImportacionProductoProduMermaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProductoProduMerma")) {
				jComboBoxTiposAccionesProductoProduMermaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProductoProduMerma")) {
				jComboBoxTiposRelacionesProductoProduMermaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProductoProduMerma")) {
				jComboBoxTiposAccionesProductoProduMermaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProductoProduMerma")) {
				
				jComboBoxTiposSeleccionarProductoProduMermaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProductoProduMerma")) {
				jTextFieldValorCampoGeneralProductoProduMermaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProductoProduMerma")) {
				jButtonAbrirOrderByProductoProduMermaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProductoProduMerma")) {
				jButtonAbrirOrderByProductoProduMermaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProductoProduMerma")) {
				jButtonCerrarOrderByProductoProduMermaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductoProduMermaBusqueda")) {
				this.jButtonidProductoProduMermaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_producto_defi_produProductoProduMermaUpdate")) {
				this.jButtonid_producto_defi_produProductoProduMermaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_producto_defi_produProductoProduMermaBusqueda")) {
				this.jButtonid_producto_defi_produProductoProduMermaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_merma_empresaProductoProduMermaUpdate")) {
				this.jButtonid_tipo_merma_empresaProductoProduMermaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_merma_empresaProductoProduMermaBusqueda")) {
				this.jButtonid_tipo_merma_empresaProductoProduMermaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadProductoProduMermaUpdate")) {
				this.jButtonid_unidadProductoProduMermaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadProductoProduMermaBusqueda")) {
				this.jButtonid_unidadProductoProduMermaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadProductoProduMermaBusqueda")) {
				this.jButtoncantidadProductoProduMermaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoProductoProduMermaBusqueda")) {
				this.jButtoncostoProductoProduMermaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_totalProductoProduMermaBusqueda")) {
				this.jButtoncosto_totalProductoProduMermaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionProductoProduMermaBusqueda")) {
				this.jButtondescripcionProductoProduMermaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdProductoDefiProduProductoProduMerma")) {
				this.jButtonFK_IdProductoDefiProduProductoProduMermaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoMermaEmpresaProductoProduMerma")) {
				this.jButtonFK_IdTipoMermaEmpresaProductoProduMermaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdUnidadProductoProduMerma")) {
				this.jButtonFK_IdUnidadProductoProduMermaActionPerformed(evt);
			}
			
			;
			
			
			ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProductoProduMerma();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProduMermaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumerma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodumerma);
				
				ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
				
				


				
				ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProduMerma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduMerma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProductoProduMerma productoprodumermaLocal=null;
			
			if(!this.getEsControlTabla()) {
				productoprodumermaLocal=this.productoprodumerma;
			} else {
				productoprodumermaLocal=this.productoprodumermaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumerma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodumerma);
				
				ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
							
				
				


				
				ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProduMerma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduMerma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProduMermaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoProduMerma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumermaAnterior =(ProductoProduMerma) this.productoprodumermaLogic.getProductoProduMermas().toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoprodumermaAnterior =(ProductoProduMerma) this.productoprodumermas.toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
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
			
			ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
			
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
			
			


			
			ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProduMermaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumerma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodumerma);
				
				ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
								
						
				


				
				ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProduMerma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduMerma.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumerma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodumerma);
				
				ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
								
				
				


				
				ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProduMerma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduMerma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProduMermaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoProduMerma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumermaAnterior =(ProductoProduMerma) this.productoprodumermaLogic.getProductoProduMermas().toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoprodumermaAnterior =(ProductoProduMerma) this.productoprodumermas.toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumerma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodumerma);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProduMermaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoProduMerma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumermaAnterior =(ProductoProduMerma) this.productoprodumermaLogic.getProductoProduMermas().toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoprodumermaAnterior =(ProductoProduMerma) this.productoprodumermas.toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProduMermaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumerma);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoprodumerma);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumerma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodumerma);
				
				ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
							
				
				


				
				ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProduMerma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduMerma.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProduMermaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductoProduMerma.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodumermaAnterior =(ProductoProduMerma) this.productoprodumermaLogic.getProductoProduMermas().toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productoprodumermaAnterior =(ProductoProduMerma) this.productoprodumermas.toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
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
			
			ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
			
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
			
			


			
			ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProduMermaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumerma);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoprodumerma);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumerma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodumerma);
				
				ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
								
				
				


				
				ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProduMerma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduMerma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProduMermaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoProduMerma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumermaAnterior =(ProductoProduMerma) this.productoprodumermaLogic.getProductoProduMermas().toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoprodumermaAnterior =(ProductoProduMerma) this.productoprodumermas.toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProduMermaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumerma);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoprodumerma);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProduMermaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumerma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodumerma);
				
				ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProductoProduMerma")) {
					jCheckBoxSeleccionarTodosProductoProduMermaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProductoProduMerma")) {
					jCheckBoxSeleccionadosProductoProduMermaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProductoProduMerma")) {
					
				}
				
				


				
				
				ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProduMerma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduMerma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumerma);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.productoprodumerma);
				
				ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
												
				
				


				
				
				ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProduMerma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduMerma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProduMermaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductoProduMerma.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodumermaAnterior =(ProductoProduMerma) this.productoprodumermaLogic.getProductoProduMermas().toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productoprodumermaAnterior =(ProductoProduMerma) this.productoprodumermas.toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProduMermaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumerma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodumerma);
				
				ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
				
				
				ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
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
			
			ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
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
			
			


			
			ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProduMermaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumerma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodumerma);
				
				ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProduMerma.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduMerma.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumerma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodumerma);
				
				ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
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
				
				


				
				ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProduMerma.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduMerma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProduMermaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoProduMerma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumermaAnterior =(ProductoProduMerma) this.productoprodumermaLogic.getProductoProduMermas().toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoprodumermaAnterior =(ProductoProduMerma) this.productoprodumermas.toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProductoProduMerma")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProductoProduMermaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProductoProduMerma.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.productoprodumerma =(ProductoProduMerma) this.productoprodumermaLogic.getProductoProduMermas().toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.productoprodumerma =(ProductoProduMerma) this.productoprodumermas.toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.productoprodumerma);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProductoProduMerma")) {
				
				}
				
				ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProductoProduMerma")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProductoProduMerma.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProductoProduMerma")) {
			
			}
			
			ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProductoProduMerma();
			
			ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
			
			if(sTipo.equals("NuevoProductoProduMerma")) {
				jButtonNuevoProductoProduMermaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProductoProduMerma")) {
				jButtonDuplicarProductoProduMermaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProductoProduMerma")) {
				jButtonCopiarProductoProduMermaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProductoProduMerma")) {
				jButtonVerFormProductoProduMermaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProductoProduMerma")) {
				jButtonNuevoProductoProduMermaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProductoProduMerma")) {
				jButtonModificarProductoProduMermaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProductoProduMerma")) {
				jButtonActualizarProductoProduMermaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProductoProduMerma")) {
				jButtonEliminarProductoProduMermaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProductoProduMerma")) {
				jButtonGuardarCambiosProductoProduMermaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProductoProduMerma")) {
				jButtonCancelarProductoProduMermaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProductoProduMerma")) {
				jButtonCerrarProductoProduMermaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProductoProduMerma")) {
				jButtonGuardarCambiosProductoProduMermaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProductoProduMerma")) {
				jButtonNuevoGuardarCambiosProductoProduMermaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProductoProduMerma")) {
				jButtonAbrirOrderByProductoProduMermaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProductoProduMerma")) {
				jButtonRecargarInformacionProductoProduMermaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProductoProduMerma")) {
				jButtonAnterioresProductoProduMermaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProductoProduMerma")) {
				jButtonSiguientesProductoProduMermaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductoProduMermaBusqueda")) {
				this.jButtonidProductoProduMermaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_producto_defi_produProductoProduMermaUpdate")) {
				this.jButtonid_producto_defi_produProductoProduMermaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_producto_defi_produProductoProduMermaBusqueda")) {
				this.jButtonid_producto_defi_produProductoProduMermaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_merma_empresaProductoProduMermaUpdate")) {
				this.jButtonid_tipo_merma_empresaProductoProduMermaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_merma_empresaProductoProduMermaBusqueda")) {
				this.jButtonid_tipo_merma_empresaProductoProduMermaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadProductoProduMermaUpdate")) {
				this.jButtonid_unidadProductoProduMermaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadProductoProduMermaBusqueda")) {
				this.jButtonid_unidadProductoProduMermaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadProductoProduMermaBusqueda")) {
				this.jButtoncantidadProductoProduMermaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoProductoProduMermaBusqueda")) {
				this.jButtoncostoProductoProduMermaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_totalProductoProduMermaBusqueda")) {
				this.jButtoncosto_totalProductoProduMermaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionProductoProduMermaBusqueda")) {
				this.jButtondescripcionProductoProduMermaBusquedaActionPerformed(evt);
			}
			
			ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProductoProduMerma();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProductoProduMerma")) {
				closingInternalFrameProductoProduMerma();
				
			} else if(sTipo.equals("jButtonCancelarProductoProduMerma")) {
				JInternalFrameBase jInternalFrameDetalleFormProductoProduMerma = (JInternalFrameBase)evt.getSource();
	            	
	            ProductoProduMermaBeanSwingJInternalFrame jInternalFrameParent=(ProductoProduMermaBeanSwingJInternalFrame)jInternalFrameDetalleFormProductoProduMerma.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProductoProduMermaActionPerformed(null);
			}
			
			ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productoprodumerma,new Object(),this.productoprodumermaParameterGeneral,this.productoprodumermaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProductoProduMerma(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProductoProduMerma(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProductoProduMerma(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.productoprodumerma)) {
			if(!esControlTabla) {
				if(ProductoProduMermaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProductoProduMerma(this.productoprodumerma,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMerma(this.productoprodumerma);			
				}
				
				if(this.productoprodumermaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProductoProduMerma(this.productoprodumerma,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.productoprodumermaReturnGeneral=productoprodumermaLogic.procesarEventosProductoProduMermasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoprodumermaLogic.getProductoProduMermas(),this.productoprodumerma,this.productoprodumermaParameterGeneral,this.isEsNuevoProductoProduMerma,classes);//this.productoprodumermaLogic.getProductoProduMerma()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProductoProduMerma(this.productoprodumermaReturnGeneral,this.productoprodumermaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.productoprodumermaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProductoProduMerma(classes,this.productoprodumermaReturnGeneral,this.productoprodumermaBean,false);
					}
						
					if(this.productoprodumermaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProductoProduMerma(this.productoprodumermaReturnGeneral.getProductoProduMerma());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProductoProduMerma(this.productoprodumermaReturnGeneral.getProductoProduMerma());	
					}
						
					if(this.productoprodumermaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProductoProduMerma(this.productoprodumermaReturnGeneral.getProductoProduMerma(),classes);//this.productoprodumermaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProductoProduMerma(this.productoprodumerma,classes);//this.productoprodumermaBean);									
				}
			
				if(ProductoProduMermaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProductoProduMerma(this.productoprodumerma,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMerma(this.productoprodumerma);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.productoprodumermaAnterior!=null) {
						this.productoprodumerma=this.productoprodumermaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.productoprodumermaReturnGeneral=productoprodumermaLogic.procesarEventosProductoProduMermasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoprodumermaLogic.getProductoProduMermas(),this.productoprodumerma,this.productoprodumermaParameterGeneral,this.isEsNuevoProductoProduMerma,classes);//this.productoprodumermaLogic.getProductoProduMerma()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productoprodumermaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productoprodumermaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.productoprodumermaReturnGeneral.getProductoProduMerma(),productoprodumermaLogic.getProductoProduMermas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.productoprodumermaReturnGeneral.getProductoProduMerma(),this.productoprodumermas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProductoProduMerma.repaint();
				
				//((AbstractTableModel) this.jTableDatosProductoProduMerma.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProductoProduMerma();
			}
		}
	}
	
	public void actualizarVisualTableDatosProductoProduMerma() throws Exception {
		
		ProductoProduMermaModel productoprodumermaModel=(ProductoProduMermaModel)this.jTableDatosProductoProduMerma.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoprodumermaModel.productoprodumermas=this.productoprodumermaLogic.getProductoProduMermas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			productoprodumermaModel.productoprodumermas=this.productoprodumermas;
		}
		
		
		((ProductoProduMermaModel) this.jTableDatosProductoProduMerma.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProductoProduMerma() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getproductoprodumermaAnterior(),this.productoprodumermaLogic.getProductoProduMermas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getproductoprodumermaAnterior(),this.productoprodumermas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProductoProduMerma();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProductoProduMerma(ProductoProduMerma productoprodumerma,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
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
										
				ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoprodumerma,new Object(),generalEntityParameterGeneral,this.productoprodumermaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.productoprodumermaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProductoProduMermaConstantesFunciones.getClassesRelationshipsOfProductoProduMerma(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProductoProduMermaConstantesFunciones.getClassesRelationshipsFromStringsOfProductoProduMerma(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProductoProduMerma(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProductoProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoprodumerma,new Object(),generalEntityParameterGeneral,this.productoprodumermaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProductoProduMerma(ProductoProduMermaBean productoprodumermaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProductoProduMerma(ArrayList<Classe> classes,ProductoProduMermaReturnGeneral productoprodumermaReturnGeneral,ProductoProduMermaBean productoprodumermaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProductoProduMerma(ProductoProduMerma productoprodumerma,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.productoprodumerma)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProductoProduMerma = new ProductoProduMermaDetalleFormJInternalFrame(jDesktopPane,this.productoprodumermaSessionBean.getConGuardarRelaciones(),this.productoprodumermaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProductoProduMerma);
		this.jInternalFrameDetalleFormProductoProduMerma.setVisible(false);
		this.jInternalFrameDetalleFormProductoProduMerma.setSelected(false);						
		
		this.jInternalFrameDetalleFormProductoProduMerma.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProductoProduMerma.productoprodumermaLogic=this.productoprodumermaLogic;
		
		this.cargarCombosFrameForeignKeyProductoProduMerma("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProductoProduMerma();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductoProduMerma();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProductoProduMerma("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProductoProduMerma();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProductoProduMerma.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductoProduMerma"));
		
		this.jInternalFrameDetalleFormProductoProduMerma.jButtonModificarProductoProduMerma.addActionListener(new ButtonActionListener(this,"ModificarProductoProduMerma"));

		
		this.jInternalFrameDetalleFormProductoProduMerma.jButtonModificarToolBarProductoProduMerma.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductoProduMerma"));
					
		this.jInternalFrameDetalleFormProductoProduMerma.jMenuItemModificarProductoProduMerma.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductoProduMerma"));		
		
		
		
		this.jInternalFrameDetalleFormProductoProduMerma.jButtonActualizarProductoProduMerma.addActionListener (new ButtonActionListener(this,"ActualizarProductoProduMerma"));
		
		
		this.jInternalFrameDetalleFormProductoProduMerma.jButtonActualizarToolBarProductoProduMerma.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductoProduMerma"));
						
		this.jInternalFrameDetalleFormProductoProduMerma.jMenuItemActualizarProductoProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductoProduMerma"));		
		
		
		
		this.jInternalFrameDetalleFormProductoProduMerma.jButtonEliminarProductoProduMerma.addActionListener (new ButtonActionListener(this,"EliminarProductoProduMerma"));
		
		
		this.jInternalFrameDetalleFormProductoProduMerma.jButtonEliminarToolBarProductoProduMerma.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductoProduMerma"));
								
		this.jInternalFrameDetalleFormProductoProduMerma.jMenuItemEliminarProductoProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductoProduMerma"));		
		
		
		
		this.jInternalFrameDetalleFormProductoProduMerma.jButtonCancelarProductoProduMerma.addActionListener (new ButtonActionListener(this,"CancelarProductoProduMerma"));
		
		
		this.jInternalFrameDetalleFormProductoProduMerma.jButtonCancelarToolBarProductoProduMerma.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductoProduMerma"));
					
		this.jInternalFrameDetalleFormProductoProduMerma.jMenuItemCancelarProductoProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductoProduMerma"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProductoProduMerma.jMenuItemDetalleCerrarProductoProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductoProduMerma"));		
		
		
		
		this.jInternalFrameDetalleFormProductoProduMerma.jButtonGuardarCambiosToolBarProductoProduMerma.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoProduMerma"));
		
		
		
		this.jInternalFrameDetalleFormProductoProduMerma.jButtonGuardarCambiosToolBarProductoProduMerma.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoProduMerma"));
		
		
		
		this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxTiposAccionesFormularioProductoProduMerma.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductoProduMerma"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMerma.jButtonidProductoProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"idProductoProduMermaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduMerma.jButtonid_producto_defi_produProductoProduMermaUpdate.addActionListener(new ButtonActionListener(this,"id_producto_defi_produProductoProduMermaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMerma.jButtonid_producto_defi_produProductoProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"id_producto_defi_produProductoProduMermaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduMerma.jButtonid_tipo_merma_empresaProductoProduMermaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_merma_empresaProductoProduMermaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMerma.jButtonid_tipo_merma_empresaProductoProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_merma_empresaProductoProduMermaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduMerma.jButtonid_unidadProductoProduMermaUpdate.addActionListener(new ButtonActionListener(this,"id_unidadProductoProduMermaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMerma.jButtonid_unidadProductoProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadProductoProduMermaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMerma.jButtoncantidadProductoProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductoProduMermaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMerma.jButtoncostoProductoProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"costoProductoProduMermaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMerma.jButtoncosto_totalProductoProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalProductoProduMermaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMerma.jButtondescripcionProductoProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProductoProduMermaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProductoProduMerma.jTabbedPaneRelacionesProductoProduMerma.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductoProduMerma"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProductoProduMerma"));
		
		if(this.jInternalFrameDetalleFormProductoProduMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMerma.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductoProduMerma"));
		}
		
		this.jTableDatosProductoProduMerma.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProductoProduMerma"));
		
		this.jTableDatosProductoProduMerma.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProductoProduMerma"));
		
		this.jButtonNuevoProductoProduMerma.addActionListener(new ButtonActionListener(this,"NuevoProductoProduMerma"));
		
		this.jButtonDuplicarProductoProduMerma.addActionListener(new ButtonActionListener(this,"DuplicarProductoProduMerma"));
		
		this.jButtonCopiarProductoProduMerma.addActionListener(new ButtonActionListener(this,"CopiarProductoProduMerma"));
		
		this.jButtonVerFormProductoProduMerma.addActionListener(new ButtonActionListener(this,"VerFormProductoProduMerma"));
		
		
		this.jButtonNuevoToolBarProductoProduMerma.addActionListener(new ButtonActionListener(this,"NuevoToolBarProductoProduMerma"));
			
		this.jButtonDuplicarToolBarProductoProduMerma.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProductoProduMerma"));
			
		this.jMenuItemNuevoProductoProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProductoProduMerma"));
			
		this.jMenuItemDuplicarProductoProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProductoProduMerma"));		
		
		
		this.jButtonNuevoRelacionesProductoProduMerma.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProductoProduMerma"));
		
		
		this.jButtonNuevoRelacionesToolBarProductoProduMerma.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProductoProduMerma"));
			
		this.jMenuItemNuevoRelacionesProductoProduMerma.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProductoProduMerma"));		
		
		
		if(this.jInternalFrameDetalleFormProductoProduMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMerma.jButtonModificarProductoProduMerma.addActionListener(new ButtonActionListener(this,"ModificarProductoProduMerma"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProduMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMerma.jButtonModificarToolBarProductoProduMerma.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductoProduMerma"));
			
			this.jInternalFrameDetalleFormProductoProduMerma.jMenuItemModificarProductoProduMerma.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductoProduMerma"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProduMerma!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProductoProduMerma.jButtonActualizarProductoProduMerma.addActionListener (new ButtonActionListener(this,"ActualizarProductoProduMerma"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProduMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMerma.jButtonActualizarToolBarProductoProduMerma.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductoProduMerma"));
				
			this.jInternalFrameDetalleFormProductoProduMerma.jMenuItemActualizarProductoProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductoProduMerma"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProduMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMerma.jButtonEliminarProductoProduMerma.addActionListener (new ButtonActionListener(this,"EliminarProductoProduMerma"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProduMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMerma.jButtonEliminarToolBarProductoProduMerma.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductoProduMerma"));
						
			this.jInternalFrameDetalleFormProductoProduMerma.jMenuItemEliminarProductoProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductoProduMerma"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProduMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMerma.jButtonCancelarProductoProduMerma.addActionListener (new ButtonActionListener(this,"CancelarProductoProduMerma"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProduMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMerma.jButtonCancelarToolBarProductoProduMerma.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductoProduMerma"));
			
			this.jInternalFrameDetalleFormProductoProduMerma.jMenuItemCancelarProductoProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductoProduMerma"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProductoProduMerma.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProductoProduMerma"));		
		
		
		this.jButtonCerrarProductoProduMerma.addActionListener (new ButtonActionListener(this,"CerrarProductoProduMerma"));
		
		
		this.jButtonCerrarToolBarProductoProduMerma.addActionListener (new ButtonActionListener(this,"CerrarToolBarProductoProduMerma"));
			
		this.jMenuItemCerrarProductoProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProductoProduMerma"));
			
		if(this.jInternalFrameDetalleFormProductoProduMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMerma.jMenuItemDetalleCerrarProductoProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductoProduMerma"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProduMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMerma.jButtonGuardarCambiosProductoProduMerma.addActionListener (new ButtonActionListener(this,"GuardarCambiosProductoProduMerma"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProduMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMerma.jButtonGuardarCambiosToolBarProductoProduMerma.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoProduMerma"));
		}
		
		this.jButtonCopiarToolBarProductoProduMerma.addActionListener (new ButtonActionListener(this,"CopiarToolBarProductoProduMerma"));
			
		this.jButtonVerFormToolBarProductoProduMerma.addActionListener (new ButtonActionListener(this,"VerFormToolBarProductoProduMerma"));
		
		this.jMenuItemGuardarCambiosProductoProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProductoProduMerma"));
			
		this.jMenuItemCopiarProductoProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProductoProduMerma"));		
		
		this.jMenuItemVerFormProductoProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProductoProduMerma"));		
		
		
		this.jButtonGuardarCambiosTablaProductoProduMerma.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductoProduMerma"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProductoProduMerma.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProductoProduMerma"));
			
		this.jMenuItemGuardarCambiosTablaProductoProduMerma.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductoProduMerma"));		
		
		
		
		this.jButtonRecargarInformacionProductoProduMerma.addActionListener (new ButtonActionListener(this,"RecargarInformacionProductoProduMerma"));
					
		this.jButtonRecargarInformacionToolBarProductoProduMerma.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProductoProduMerma"));
		
		this.jMenuItemRecargarInformacionProductoProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProductoProduMerma"));		
		
		
		
		this.jButtonAnterioresProductoProduMerma.addActionListener (new ButtonActionListener(this,"AnterioresProductoProduMerma"));
		
		
		this.jButtonAnterioresToolBarProductoProduMerma.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProductoProduMerma"));
		
		this.jMenuItemAnterioresProductoProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProductoProduMerma"));		
		
		
		this.jButtonSiguientesProductoProduMerma.addActionListener (new ButtonActionListener(this,"SiguientesProductoProduMerma"));
		
		
		this.jButtonSiguientesToolBarProductoProduMerma.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProductoProduMerma"));
			
		this.jMenuItemSiguientesProductoProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProductoProduMerma"));
			
		this.jMenuItemAbrirOrderByProductoProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProductoProduMerma"));
			
		this.jMenuItemMostrarOcultarProductoProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProductoProduMerma"));
			
		this.jMenuItemDetalleAbrirOrderByProductoProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProductoProduMerma"));
			
		this.jMenuItemDetalleMostarOcultarProductoProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProductoProduMerma"));		
		
		
		this.jButtonNuevoGuardarCambiosProductoProduMerma.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProductoProduMerma"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductoProduMerma.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProductoProduMerma"));
			
		this.jMenuItemNuevoGuardarCambiosProductoProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProductoProduMerma"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProductoProduMerma.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProductoProduMerma"));

		this.jCheckBoxSeleccionadosProductoProduMerma.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProductoProduMerma"));
		
		if(this.jInternalFrameDetalleFormProductoProduMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxTiposAccionesFormularioProductoProduMerma.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductoProduMerma"));
		}
		
		
		this.jComboBoxTiposRelacionesProductoProduMerma.addActionListener (new ButtonActionListener(this,"TiposRelacionesProductoProduMerma"));
			
		this.jComboBoxTiposAccionesProductoProduMerma.addActionListener (new ButtonActionListener(this,"TiposAccionesProductoProduMerma"));
					
		this.jComboBoxTiposSeleccionarProductoProduMerma.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProductoProduMerma"));
			
		this.jTextFieldValorCampoGeneralProductoProduMerma.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProductoProduMerma"));		
		
		
		if(this.jInternalFrameDetalleFormProductoProduMerma!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMerma.jButtonidProductoProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"idProductoProduMermaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduMerma.jButtonid_producto_defi_produProductoProduMermaUpdate.addActionListener(new ButtonActionListener(this,"id_producto_defi_produProductoProduMermaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMerma.jButtonid_producto_defi_produProductoProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"id_producto_defi_produProductoProduMermaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduMerma.jButtonid_tipo_merma_empresaProductoProduMermaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_merma_empresaProductoProduMermaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMerma.jButtonid_tipo_merma_empresaProductoProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_merma_empresaProductoProduMermaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduMerma.jButtonid_unidadProductoProduMermaUpdate.addActionListener(new ButtonActionListener(this,"id_unidadProductoProduMermaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMerma.jButtonid_unidadProductoProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadProductoProduMermaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMerma.jButtoncantidadProductoProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductoProduMermaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMerma.jButtoncostoProductoProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"costoProductoProduMermaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMerma.jButtoncosto_totalProductoProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalProductoProduMermaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMerma.jButtondescripcionProductoProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProductoProduMermaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdProductoDefiProduProductoProduMerma.addActionListener(new ButtonActionListener(this,"FK_IdProductoDefiProduProductoProduMerma"));

			this.jButtonFK_IdTipoMermaEmpresaProductoProduMerma.addActionListener(new ButtonActionListener(this,"FK_IdTipoMermaEmpresaProductoProduMerma"));

			this.jButtonFK_IdUnidadProductoProduMerma.addActionListener(new ButtonActionListener(this,"FK_IdUnidadProductoProduMerma"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProductoProduMerma!=null) {
				this.jInternalFrameReporteDinamicoProductoProduMerma.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoProduMerma"));
				this.jInternalFrameReporteDinamicoProductoProduMerma.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoProduMerma"));
				this.jInternalFrameReporteDinamicoProductoProduMerma.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoProduMerma"));
			}
			
			//this.jButtonCerrarReporteDinamicoProductoProduMerma.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoProduMerma"));				
			//this.jButtonGenerarReporteDinamicoProductoProduMerma.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoProduMerma"));
			//this.jButtonGenerarExcelReporteDinamicoProductoProduMerma.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoProduMerma"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProductoProduMerma!=null) {
				this.jInternalFrameImportacionProductoProduMerma.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductoProduMerma"));
				this.jInternalFrameImportacionProductoProduMerma.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductoProduMerma"));
				this.jInternalFrameImportacionProductoProduMerma.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductoProduMerma"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProductoProduMerma.addActionListener (new ButtonActionListener(this,"AbrirOrderByProductoProduMerma"));
			
			this.jButtonAbrirOrderByToolBarProductoProduMerma.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProductoProduMerma"));			
			
			if(this.jInternalFrameOrderByProductoProduMerma!=null) {
				this.jInternalFrameOrderByProductoProduMerma.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductoProduMerma"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProductoProduMerma!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProductoProduMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMerma.jTabbedPaneRelacionesProductoProduMerma.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductoProduMerma"));
		
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
            		closingInternalFrameProductoProduMerma();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProductoProduMerma.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProductoProduMerma = (JInternalFrameBase)event.getSource();
	            	
	            ProductoProduMermaBeanSwingJInternalFrame jInternalFrameParent=(ProductoProduMermaBeanSwingJInternalFrame)jInternalFrameDetalleFormProductoProduMerma.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProductoProduMermaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProductoProduMerma.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProductoProduMermaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProductoProduMerma.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProductoProduMerma.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoProduMermaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoProduMermaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoProduMermaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProductoProduMerma";
		inputMap = this.jButtonNuevoProductoProduMerma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProductoProduMerma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductoProduMermaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoProduMermaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoProduMermaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoProduMermaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProductoProduMerma";
		inputMap = this.jButtonNuevoRelacionesProductoProduMerma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProductoProduMerma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductoProduMermaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProductoProduMerma";
		inputMap = this.jButtonModificarProductoProduMerma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProductoProduMerma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProductoProduMermaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProductoProduMerma";
		inputMap = this.jButtonActualizarProductoProduMerma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProductoProduMerma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProductoProduMermaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProductoProduMerma";
		inputMap = this.jButtonEliminarProductoProduMerma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProductoProduMerma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProductoProduMermaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProductoProduMerma";
		inputMap = this.jButtonCancelarProductoProduMerma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProductoProduMerma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProductoProduMermaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProductoProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProductoProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProductoProduMerma";
		inputMap = this.jButtonCerrarProductoProduMerma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProductoProduMerma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProductoProduMermaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProductoProduMerma.jButtonGuardarCambiosProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProductoProduMerma";
		inputMap = this.jInternalFrameDetalleFormProductoProduMerma.jButtonGuardarCambiosProductoProduMerma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProductoProduMerma.jButtonGuardarCambiosProductoProduMerma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProductoProduMermaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProductoProduMerma.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProductoProduMermaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProductoProduMerma.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProductoProduMermaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProductoProduMerma.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProductoProduMermaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProductoProduMerma.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProductoProduMermaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMerma.jButtonidProductoProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"idProductoProduMermaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduMerma.jButtonid_producto_defi_produProductoProduMermaUpdate.addActionListener(new ButtonActionListener(this,"id_producto_defi_produProductoProduMermaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMerma.jButtonid_producto_defi_produProductoProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"id_producto_defi_produProductoProduMermaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduMerma.jButtonid_tipo_merma_empresaProductoProduMermaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_merma_empresaProductoProduMermaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMerma.jButtonid_tipo_merma_empresaProductoProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_merma_empresaProductoProduMermaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduMerma.jButtonid_unidadProductoProduMermaUpdate.addActionListener(new ButtonActionListener(this,"id_unidadProductoProduMermaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMerma.jButtonid_unidadProductoProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadProductoProduMermaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMerma.jButtoncantidadProductoProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductoProduMermaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMerma.jButtoncostoProductoProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"costoProductoProduMermaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMerma.jButtoncosto_totalProductoProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalProductoProduMermaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMerma.jButtondescripcionProductoProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProductoProduMermaBusqueda"));
		
		
		this.jButtonFK_IdProductoDefiProduProductoProduMerma.addActionListener(new ButtonActionListener(this,"FK_IdProductoDefiProduProductoProduMerma"));

		this.jButtonFK_IdTipoMermaEmpresaProductoProduMerma.addActionListener(new ButtonActionListener(this,"FK_IdTipoMermaEmpresaProductoProduMerma"));

		this.jButtonFK_IdUnidadProductoProduMerma.addActionListener(new ButtonActionListener(this,"FK_IdUnidadProductoProduMerma"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProductoProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProductoProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProductoProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProductoProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProductoProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProductoProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProductoProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProductoProduMermaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProductoProduMerma.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProductoProduMerma(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProductoProduMerma productoprodumermaAux:this.productoprodumermaLogic.getProductoProduMermas()) {
					productoprodumermaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoProduMerma productoprodumermaAux:productoprodumermas) {
					productoprodumermaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProductoProduMermaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductoProduMerma(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductoProduMerma productoprodumermaAux:this.productoprodumermaLogic.getProductoProduMermas()) {
						productoprodumermaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoProduMerma productoprodumermaAux:productoprodumermas) {
						productoprodumermaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProductoProduMerma productoprodumermaAux:this.productoprodumermaLogic.getProductoProduMermas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoProduMerma productoprodumermaAux:productoprodumermas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProductoProduMerma(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductoProduMerma.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductoProduMerma.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMerma,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProductoProduMermaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductoProduMerma(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProductoProduMerma.getSelectedRows();
			
			ProductoProduMerma productoprodumermaLocal=new ProductoProduMerma();
			
			//this.seleccionarTodosProductoProduMerma(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoprodumermaLocal =(ProductoProduMerma) this.productoprodumermaLogic.getProductoProduMermas().toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					productoprodumermaLocal =(ProductoProduMerma) this.productoprodumermas.toArray()[this.jTableDatosProductoProduMerma.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				productoprodumermaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductoProduMerma productoprodumermaAux:this.productoprodumermaLogic.getProductoProduMermas()) {
						productoprodumermaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoProduMerma productoprodumermaAux:productoprodumermas) {
						productoprodumermaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProductoProduMerma(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductoProduMerma.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductoProduMerma.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMerma,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProductoProduMermaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProductoProduMermaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProductoProduMermaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProductoProduMerma(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProductoProduMerma.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductoProduMerma productoprodumermaAux:this.productoprodumermaLogic.getProductoProduMermas()) {
				
						if(sTipoSeleccionar.equals(ProductoProduMermaConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							productoprodumermaAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoProduMermaConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							productoprodumermaAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoProduMermaConstantesFunciones.LABEL_COSTOTOTAL)) {
							existe=true;
							productoprodumermaAux.setcosto_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoProduMermaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							productoprodumermaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoProduMerma productoprodumermaAux:productoprodumermas) {
					
						if(sTipoSeleccionar.equals(ProductoProduMermaConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							productoprodumermaAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoProduMermaConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							productoprodumermaAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoProduMermaConstantesFunciones.LABEL_COSTOTOTAL)) {
							existe=true;
							productoprodumermaAux.setcosto_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoProduMermaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							productoprodumermaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProductoProduMerma(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProductoProduMermaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProductoProduMerma(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProductoProduMerma=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProductoProduMerma.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxTiposAccionesFormularioProductoProduMerma.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProductoProduMerma) {				
					conSplash=true;//false;										
					
					//this.startProcessProductoProduMerma(conSplash);
				
					this.generarReporteProductoProduMermasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoProduMerma.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxTiposAccionesFormularioProductoProduMerma.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProductoProduMermasSeleccionados();
				//this.jComboBoxTiposAccionesProductoProduMerma.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductoProduMermasSeleccionados(false);
				//this.jComboBoxTiposAccionesProductoProduMerma.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductoProduMermasSeleccionados(true);
				//this.jComboBoxTiposAccionesProductoProduMerma.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductoProduMerma();
				
				this.exportarProductoProduMermasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoProduMerma.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxTiposAccionesFormularioProductoProduMerma.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProductoProduMermas();
				//this.importarProductoProduMermas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoProduMerma.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxTiposAccionesFormularioProductoProduMerma.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductoProduMerma();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProductoProduMermasSeleccionados();
				//this.jComboBoxTiposAccionesProductoProduMerma.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Producto Merma Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProductoProduMerma();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProductoProduMerma)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProductoProduMerma(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Producto Merma Produccion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoProduMerma.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxTiposAccionesFormularioProductoProduMerma.setSelectedIndex(0);					
				}	
			} 			
			else if(ProductoProduMermaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProductoProduMerma) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProductoProduMerma(conSplash);
					
						//this.actualizarParametrosGeneralProductoProduMerma();
						
						this.generarReporteProcesoAccionProductoProduMermasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProductoProduMerma.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxTiposAccionesFormularioProductoProduMerma.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProductoProduMermaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Producto Merma ProduccionES SELECCIONADOS?", "MANTENIMIENTO DE Producto Merma Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProductoProduMerma();
				
						this.actualizarParametrosGeneralProductoProduMerma();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.productoprodumermaReturnGeneral=productoprodumermaLogic.procesarAccionProductoProduMermasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.productoprodumermaLogic.getProductoProduMermas(),this.productoprodumermaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProductoProduMermaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductoProduMerma.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxTiposAccionesFormularioProductoProduMerma.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProductoProduMerma();
					
					ProductoProduMermaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProductoProduMermaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductoProduMerma.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxTiposAccionesFormularioProductoProduMerma.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProductoProduMerma(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProductoProduMermaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProductoProduMerma();
			
			if(this.jInternalFrameDetalleFormProductoProduMerma==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProductoProduMerma> productoprodumermasSeleccionados=new ArrayList<ProductoProduMerma>();		
			ProductoProduMerma productoprodumerma=new ProductoProduMerma();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProductoProduMerma(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProductoProduMerma.getSelectedItem();
			
			
			
			
			productoprodumermasSeleccionados=this.getProductoProduMermasSeleccionados(true);
			//this.sTipoAccion;
			
			if(productoprodumermasSeleccionados.size()==1) {
				for(ProductoProduMerma productoprodumermaAux:productoprodumermasSeleccionados) {
					productoprodumerma=productoprodumermaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProductoProduMerma();
			
      		//this.finishProcessProductoProduMerma(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProductoProduMermaReturnGeneral() throws Exception {
		if(this.productoprodumermaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.productoprodumermaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.productoprodumermaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.productoprodumermaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.productoprodumermaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.productoprodumermaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProductoProduMerma(false);
		}
		
		if(this.productoprodumermaReturnGeneral.getConRetornoLista() || this.productoprodumermaReturnGeneral.getConRetornoObjeto()) {
			if(this.productoprodumermaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productoprodumermaLogic.setProductoProduMermas(this.productoprodumermaReturnGeneral.getProductoProduMermas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.productoprodumermaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productoprodumermaLogic.setProductoProduMerma(this.productoprodumermaReturnGeneral.getProductoProduMerma());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingProductoProduMerma(false);
		}
	}
	
	public void actualizarParametrosGeneralProductoProduMerma() throws Exception {
		
		
	}
	
	public ArrayList<ProductoProduMerma> getProductoProduMermasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProductoProduMerma> productoprodumermasSeleccionados=new ArrayList<ProductoProduMerma>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProductoProduMerma) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProductoProduMerma productoprodumermaAux:productoprodumermaLogic.getProductoProduMermas()) {
					if(productoprodumermaAux.getIsSelected()) {
						productoprodumermasSeleccionados.add(productoprodumermaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoProduMerma productoprodumermaAux:this.productoprodumermas) {
					if(productoprodumermaAux.getIsSelected()) {
						productoprodumermasSeleccionados.add(productoprodumermaAux);				
					}
				}
			}
			
			if(productoprodumermasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						productoprodumermasSeleccionados.addAll(this.productoprodumermaLogic.getProductoProduMermas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						productoprodumermasSeleccionados.addAll(this.productoprodumermas);				
					}
				}
			}
		} else {
			productoprodumermasSeleccionados.add(this.productoprodumerma);
		}
		
		return productoprodumermasSeleccionados;
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
	
	public void generarReporteProductoProduMermasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProductoProduMermasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProductoProduMermasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductoProduMermasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductoProduMermasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Producto Merma Produccion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProductoProduMermasSeleccionados() throws Exception {
		ArrayList<ProductoProduMerma> productoprodumermasSeleccionados=new ArrayList<ProductoProduMerma>();		
		
		productoprodumermasSeleccionados=this.getProductoProduMermasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProductoProduMermas("Todos",productoprodumermasSeleccionados);
		
	}	
	
	public void generarReporteNormalProductoProduMermasSeleccionados() throws Exception {
		ArrayList<ProductoProduMerma> productoprodumermasSeleccionados=new ArrayList<ProductoProduMerma>();		
		
		productoprodumermasSeleccionados=this.getProductoProduMermasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProductoProduMermas("Todos",productoprodumermasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProductoProduMermasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProductoProduMerma> productoprodumermasSeleccionados=new ArrayList<ProductoProduMerma>();
		
		productoprodumermasSeleccionados=this.getProductoProduMermasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProductoProduMermas("Todos",productoprodumermasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProductoProduMermasSeleccionados() throws Exception {
		ArrayList<ProductoProduMerma> productoprodumermasSeleccionados=new ArrayList<ProductoProduMerma>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProductoProduMerma();
		
		
		productoprodumermasSeleccionados=this.getProductoProduMermasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProductoProduMerma();
		
		
		//this.generarReporteProductoProduMermas("Todos",productoprodumermasSeleccionados ,productoprodumermaImplementable,productoprodumermaImplementableHome);
	}
	
	public void mostrarImportacionProductoProduMermas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProductoProduMerma();
		
		this.abrirFrameImportacionProductoProduMerma();		
		
			
		//this.generarReporteProductoProduMermas("Todos",productoprodumermasSeleccionados ,productoprodumermaImplementable,productoprodumermaImplementableHome);
	}
	
	public void importarProductoProduMermas() throws Exception {		
	
	}
	
	public void exportarProductoProduMermasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProductoProduMermasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProductoProduMermasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProductoProduMermasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Producto Merma Produccion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProductoProduMermasSeleccionados() throws Exception {
		ArrayList<ProductoProduMerma> productoprodumermasSeleccionados=new ArrayList<ProductoProduMerma>();		
		
		productoprodumermasSeleccionados=this.getProductoProduMermasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoprodumerma."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProductoProduMerma(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProductoProduMerma productoprodumermaAux:productoprodumermasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProductoProduMerma(productoprodumermaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//productoprodumermaAux.setsDetalleGeneralEntityReporte(productoprodumermaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Merma Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProductoProduMerma(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProductoProduMermaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduMermaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduMermaConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduMermaConstantesFunciones.LABEL_IDTIPOMERMAEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduMermaConstantesFunciones.LABEL_IDUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduMermaConstantesFunciones.LABEL_CANTIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduMermaConstantesFunciones.LABEL_COSTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduMermaConstantesFunciones.LABEL_COSTOTOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduMermaConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProductoProduMerma(ProductoProduMerma productoprodumerma,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=productoprodumerma.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodumerma.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodumerma.getproductodefiprodu_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodumerma.gettipomermaempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodumerma.getunidad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodumerma.getcantidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodumerma.getcosto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodumerma.getcosto_total().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodumerma.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProductoProduMermasSeleccionados() throws Exception {
		ArrayList<ProductoProduMerma> productoprodumermasSeleccionados=new ArrayList<ProductoProduMerma>();		
		
		productoprodumermasSeleccionados=this.getProductoProduMermasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoprodumerma.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProductoProduMermas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProductoProduMerma(row);				
				iRow++;
			}				
			
			for(ProductoProduMerma productoprodumermaAux:productoprodumermasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProductoProduMerma(productoprodumermaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Merma Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProductoProduMermasSeleccionados() throws Exception {
		ArrayList<ProductoProduMerma> productoprodumermasSeleccionados=new ArrayList<ProductoProduMerma>();		
		
		productoprodumermasSeleccionados=this.getProductoProduMermasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoprodumerma.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("productoprodumermas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("productoprodumerma");
			//elementRoot.appendChild(element);
		
			for(ProductoProduMerma productoprodumermaAux:productoprodumermasSeleccionados) {
				element = document.createElement("productoprodumerma");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProductoProduMerma(productoprodumermaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Merma Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProductoProduMerma(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduMermaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduMermaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduMermaConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduMermaConstantesFunciones.LABEL_IDTIPOMERMAEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduMermaConstantesFunciones.LABEL_IDUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduMermaConstantesFunciones.LABEL_CANTIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduMermaConstantesFunciones.LABEL_COSTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduMermaConstantesFunciones.LABEL_COSTOTOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduMermaConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProductoProduMerma(ProductoProduMerma productoprodumerma,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodumerma.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodumerma.getproductodefiprodu_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodumerma.gettipomermaempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodumerma.getunidad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodumerma.getcantidad());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodumerma.getcosto());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodumerma.getcosto_total());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodumerma.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlProductoProduMerma(ProductoProduMerma productoprodumerma,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProductoProduMermaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(productoprodumerma.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProductoProduMermaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(productoprodumerma.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementproductodefiprodu_descripcion = document.createElement(ProductoProduMermaConstantesFunciones.IDPRODUCTODEFIPRODU);
		elementproductodefiprodu_descripcion.appendChild(document.createTextNode(productoprodumerma.getproductodefiprodu_descripcion()));
		element.appendChild(elementproductodefiprodu_descripcion);

		Element elementtipomermaempresa_descripcion = document.createElement(ProductoProduMermaConstantesFunciones.IDTIPOMERMAEMPRESA);
		elementtipomermaempresa_descripcion.appendChild(document.createTextNode(productoprodumerma.gettipomermaempresa_descripcion()));
		element.appendChild(elementtipomermaempresa_descripcion);

		Element elementunidad_descripcion = document.createElement(ProductoProduMermaConstantesFunciones.IDUNIDAD);
		elementunidad_descripcion.appendChild(document.createTextNode(productoprodumerma.getunidad_descripcion()));
		element.appendChild(elementunidad_descripcion);

		Element elementcantidad = document.createElement(ProductoProduMermaConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(productoprodumerma.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);

		Element elementcosto = document.createElement(ProductoProduMermaConstantesFunciones.COSTO);
		elementcosto.appendChild(document.createTextNode(productoprodumerma.getcosto().toString().trim()));
		element.appendChild(elementcosto);

		Element elementcosto_total = document.createElement(ProductoProduMermaConstantesFunciones.COSTOTOTAL);
		elementcosto_total.appendChild(document.createTextNode(productoprodumerma.getcosto_total().toString().trim()));
		element.appendChild(elementcosto_total);

		Element elementdescripcion = document.createElement(ProductoProduMermaConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(productoprodumerma.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoProductoProduMermasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProductoProduMerma> productoprodumermasSeleccionados=new ArrayList<ProductoProduMerma>();
		
		productoprodumermasSeleccionados=this.getProductoProduMermasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProductoProduMerma(productoprodumermasSeleccionados);
		
		this.generarReporteProductoProduMermas("Todos",productoprodumermasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProductoProduMerma(ArrayList<ProductoProduMerma> productoprodumermasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProductoProduMerma productoprodumermaAux:productoprodumermasSeleccionados) {
				productoprodumermaAux.setsDetalleGeneralEntityReporte(productoprodumermaAux.toString());
			
				if(sTipoSeleccionar.equals(ProductoProduMermaConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU)) {
					existe=true;
					productoprodumermaAux.setsDescripcionGeneralEntityReporte1(productoprodumermaAux.getproductodefiprodu_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoProduMermaConstantesFunciones.LABEL_IDTIPOMERMAEMPRESA)) {
					existe=true;
					productoprodumermaAux.setsDescripcionGeneralEntityReporte1(productoprodumermaAux.gettipomermaempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoProduMermaConstantesFunciones.LABEL_IDUNIDAD)) {
					existe=true;
					productoprodumermaAux.setsDescripcionGeneralEntityReporte1(productoprodumermaAux.getunidad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoProduMermaConstantesFunciones.LABEL_CANTIDAD)) {
					existe=true;
					productoprodumermaAux.setsDescripcionGeneralEntityReporte1(productoprodumermaAux.getcantidad().toString());
				}
				 else if(sTipoSeleccionar.equals(ProductoProduMermaConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					productoprodumermaAux.setsDescripcionGeneralEntityReporte1(productoprodumermaAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProductoProduMerma(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProductoProduMerma=true;
				this.isVisibilidadCeldaNuevoRelacionesProductoProduMerma=true;
				this.isVisibilidadCeldaGuardarCambiosProductoProduMerma=true;
			}
			
			this.isVisibilidadCeldaModificarProductoProduMerma=false;
			this.isVisibilidadCeldaActualizarProductoProduMerma=false;
			this.isVisibilidadCeldaEliminarProductoProduMerma=false;
			this.isVisibilidadCeldaCancelarProductoProduMerma=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProduMerma=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoProduMerma=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProductoProduMerma=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoProduMerma=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProduMerma=false;
			this.isVisibilidadCeldaModificarProductoProduMerma=false;
			this.isVisibilidadCeldaActualizarProductoProduMerma=true;
			this.isVisibilidadCeldaEliminarProductoProduMerma=false;
			this.isVisibilidadCeldaCancelarProductoProduMerma=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProduMerma=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoProduMerma=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProductoProduMerma=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoProduMerma=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProduMerma=false;
			this.isVisibilidadCeldaModificarProductoProduMerma=false;
			this.isVisibilidadCeldaActualizarProductoProduMerma=true;
			this.isVisibilidadCeldaEliminarProductoProduMerma=true;
			this.isVisibilidadCeldaCancelarProductoProduMerma=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProduMerma=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoProduMerma=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProductoProduMerma=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoProduMerma=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProduMerma=false;
			this.isVisibilidadCeldaModificarProductoProduMerma=false;
			this.isVisibilidadCeldaActualizarProductoProduMerma=true;
			this.isVisibilidadCeldaEliminarProductoProduMerma=false;
			this.isVisibilidadCeldaCancelarProductoProduMerma=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProduMerma=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoProduMerma=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProductoProduMerma=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoProduMerma=true;
			this.isVisibilidadCeldaGuardarCambiosProductoProduMerma=true;
			this.isVisibilidadCeldaModificarProductoProduMerma=false;
			this.isVisibilidadCeldaActualizarProductoProduMerma=false;
			this.isVisibilidadCeldaEliminarProductoProduMerma=false;
			this.isVisibilidadCeldaCancelarProductoProduMerma=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProduMerma=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoProduMerma=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProductoProduMerma=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoProduMerma=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProduMerma=false;
			this.isVisibilidadCeldaActualizarProductoProduMerma=false;
			this.isVisibilidadCeldaEliminarProductoProduMerma=false;
			this.isVisibilidadCeldaCancelarProductoProduMerma=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProduMerma=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoProduMerma=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProductoProduMerma=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoProduMerma=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProduMerma=false;
			this.isVisibilidadCeldaModificarProductoProduMerma=true;
			this.isVisibilidadCeldaActualizarProductoProduMerma=false;
			this.isVisibilidadCeldaEliminarProductoProduMerma=false;
			this.isVisibilidadCeldaCancelarProductoProduMerma=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProduMerma=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoProduMerma=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProductoProduMermaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProductoProduMerma=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoProduMerma=true;
			this.isVisibilidadCeldaGuardarCambiosProductoProduMerma=true;
		} else {
			this.actualizarEstadoPanelsProductoProduMerma(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProductoProduMerma=false;
			//this.isVisibilidadCeldaVerFormProductoProduMerma=false;
			this.isVisibilidadCeldaDuplicarProductoProduMerma=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!productoprodumermaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProductoProduMerma=false;
		} else {
			this.isVisibilidadCeldaNuevoProductoProduMerma=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProduMerma=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(productoprodumermaSessionBean.getEsGuardarRelacionado()) {
			if(!productoprodumermaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProductoProduMerma=false;												
			}
			
			this.jButtonCerrarProductoProduMerma.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProductoProduMerma=false;
		}
		
		if(!this.permiteMantenimiento(this.productoprodumerma)) {
			this.isVisibilidadCeldaActualizarProductoProduMerma=false;
			this.isVisibilidadCeldaEliminarProductoProduMerma=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProductoProduMerma() {
	}
	
	public void actualizarEstadoPanelsProductoProduMerma(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProductoProduMerma!=null) {
				this.jScrollPanelDatosEdicionProductoProduMerma.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProduMerma!=null) {
				this.jTabbedPaneBusquedasProductoProduMerma.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoProduMerma!=null) {
				this.jScrollPanelDatosProductoProduMerma.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoProduMerma!=null) {
				this.jPanelPaginacionProductoProduMerma.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoProduMerma!=null) {
				this.jPanelParametrosReportesProductoProduMerma.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProductoProduMerma!=null) {
				this.jScrollPanelDatosEdicionProductoProduMerma.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProduMerma!=null) {
				this.jTabbedPaneBusquedasProductoProduMerma.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProductoProduMerma!=null) {
				this.jScrollPanelDatosProductoProduMerma.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoProduMerma!=null) {
				this.jPanelPaginacionProductoProduMerma.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoProduMerma!=null) {
				this.jPanelParametrosReportesProductoProduMerma.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProductoProduMerma!=null) {
				this.jScrollPanelDatosEdicionProductoProduMerma.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProduMerma!=null) {
				this.jTabbedPaneBusquedasProductoProduMerma.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductoProduMerma!=null) {
				this.jScrollPanelDatosProductoProduMerma.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoProduMerma!=null) {
				this.jPanelPaginacionProductoProduMerma.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoProduMerma!=null) {
				this.jPanelParametrosReportesProductoProduMerma.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProductoProduMerma!=null) {
				this.jScrollPanelDatosEdicionProductoProduMerma.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProduMerma!=null) {
				this.jTabbedPaneBusquedasProductoProduMerma.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductoProduMerma!=null) {
				this.jScrollPanelDatosProductoProduMerma.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoProduMerma!=null) {
				this.jPanelPaginacionProductoProduMerma.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoProduMerma!=null) {
				this.jPanelParametrosReportesProductoProduMerma.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProductoProduMerma!=null) {
				this.jScrollPanelDatosEdicionProductoProduMerma.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProduMerma!=null) {
				this.jTabbedPaneBusquedasProductoProduMerma.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoProduMerma!=null) {
				this.jScrollPanelDatosProductoProduMerma.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoProduMerma!=null) {
				this.jPanelPaginacionProductoProduMerma.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoProduMerma!=null) {
				this.jPanelParametrosReportesProductoProduMerma.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProductoProduMerma!=null) {
				this.jScrollPanelDatosEdicionProductoProduMerma.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProduMerma!=null) {
				this.jTabbedPaneBusquedasProductoProduMerma.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoProduMerma!=null) {
				this.jScrollPanelDatosProductoProduMerma.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoProduMerma!=null) {
				this.jPanelPaginacionProductoProduMerma.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoProduMerma!=null) {
				this.jPanelParametrosReportesProductoProduMerma.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProductoProduMerma!=null) {
				this.jScrollPanelDatosEdicionProductoProduMerma.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProduMerma!=null) {
				this.jTabbedPaneBusquedasProductoProduMerma.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoProduMerma!=null) {
				this.jScrollPanelDatosProductoProduMerma.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoProduMerma!=null) {
				this.jPanelPaginacionProductoProduMerma.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoProduMerma!=null) {
				this.jPanelParametrosReportesProductoProduMerma.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProductoProduMerma!=null) {
					this.jTabbedPaneBusquedasProductoProduMerma.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProductoProduMerma!=null) {
				this.jPanelParametrosReportesProductoProduMerma.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.productoprodumermaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProduMerma!=null) {
				this.jTabbedPaneBusquedasProductoProduMerma.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProductoProduMerma!=null) {
				this.jPanelParametrosReportesProductoProduMerma.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaProductoDefiProdu(Boolean isParaProductoDefiProdu){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoDefiProduNegation=!isParaProductoDefiProdu;

			this.isVisibilidadFK_IdProductoDefiProdu=isParaProductoDefiProdu;
			if(!this.isVisibilidadFK_IdProductoDefiProdu) {this.jTabbedPaneBusquedasProductoProduMerma.remove(jPanelFK_IdProductoDefiProduProductoProduMerma);}

			this.isVisibilidadFK_IdTipoMermaEmpresa=isParaProductoDefiProduNegation;
			if(!this.isVisibilidadFK_IdTipoMermaEmpresa) {this.jTabbedPaneBusquedasProductoProduMerma.remove(jPanelFK_IdTipoMermaEmpresaProductoProduMerma);}

			this.isVisibilidadFK_IdUnidad=isParaProductoDefiProduNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoProduMerma.remove(jPanelFK_IdUnidadProductoProduMerma);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoMermaEmpresa(Boolean isParaTipoMermaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoMermaEmpresaNegation=!isParaTipoMermaEmpresa;

			this.isVisibilidadFK_IdProductoDefiProdu=isParaTipoMermaEmpresaNegation;
			if(!this.isVisibilidadFK_IdProductoDefiProdu) {this.jTabbedPaneBusquedasProductoProduMerma.remove(jPanelFK_IdProductoDefiProduProductoProduMerma);}

			this.isVisibilidadFK_IdTipoMermaEmpresa=isParaTipoMermaEmpresa;
			if(!this.isVisibilidadFK_IdTipoMermaEmpresa) {this.jTabbedPaneBusquedasProductoProduMerma.remove(jPanelFK_IdTipoMermaEmpresaProductoProduMerma);}

			this.isVisibilidadFK_IdUnidad=isParaTipoMermaEmpresaNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoProduMerma.remove(jPanelFK_IdUnidadProductoProduMerma);}
		}
		
	}

	public void setVisibilidadBusquedasParaUnidad(Boolean isParaUnidad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUnidadNegation=!isParaUnidad;

			this.isVisibilidadFK_IdProductoDefiProdu=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdProductoDefiProdu) {this.jTabbedPaneBusquedasProductoProduMerma.remove(jPanelFK_IdProductoDefiProduProductoProduMerma);}

			this.isVisibilidadFK_IdTipoMermaEmpresa=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdTipoMermaEmpresa) {this.jTabbedPaneBusquedasProductoProduMerma.remove(jPanelFK_IdTipoMermaEmpresaProductoProduMerma);}

			this.isVisibilidadFK_IdUnidad=isParaUnidad;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoProduMerma.remove(jPanelFK_IdUnidadProductoProduMerma);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ProductoProduMermaSessionBean productoprodumermaSessionBean=new ProductoProduMermaSessionBean();
		
		if(this.productoprodumermaSessionBean==null) {
			this.productoprodumermaSessionBean=new ProductoProduMermaSessionBean();
		}
		
		this.productoprodumermaSessionBean.setsUltimaBusquedaProductoProduMerma(this.getsAccionBusqueda());
		this.productoprodumermaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.productoprodumermaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdProductoDefiProdu")) {
			productoprodumermaSessionBean.setid_producto_defi_produ(this.getid_producto_defi_produFK_IdProductoDefiProdu());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoMermaEmpresa")) {
			productoprodumermaSessionBean.setid_tipo_merma_empresa(this.getid_tipo_merma_empresaFK_IdTipoMermaEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
			productoprodumermaSessionBean.setid_unidad(this.getid_unidadFK_IdUnidad());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ProductoProduMermaSessionBean productoprodumermaSessionBean=new ProductoProduMermaSessionBean();
		
		if(this.productoprodumermaSessionBean==null) {
			this.productoprodumermaSessionBean=new ProductoProduMermaSessionBean();
		}
		
		if(this.productoprodumermaSessionBean.getsUltimaBusquedaProductoProduMerma()!=null&&!this.productoprodumermaSessionBean.getsUltimaBusquedaProductoProduMerma().equals("")) {
			this.setsAccionBusqueda(productoprodumermaSessionBean.getsUltimaBusquedaProductoProduMerma());
			this.setiNumeroPaginacion(productoprodumermaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(productoprodumermaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdProductoDefiProdu")) {
				this.setid_producto_defi_produFK_IdProductoDefiProdu(productoprodumermaSessionBean.getid_producto_defi_produ());
				productoprodumermaSessionBean.setid_producto_defi_produ(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoMermaEmpresa")) {
				this.setid_tipo_merma_empresaFK_IdTipoMermaEmpresa(productoprodumermaSessionBean.getid_tipo_merma_empresa());
				productoprodumermaSessionBean.setid_tipo_merma_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
				this.setid_unidadFK_IdUnidad(productoprodumermaSessionBean.getid_unidad());
				productoprodumermaSessionBean.setid_unidad(-1L);
			}
		}
		
		this.productoprodumermaSessionBean.setsUltimaBusquedaProductoProduMerma("");
		this.productoprodumermaSessionBean.setiNumeroPaginacion(ProductoProduMermaConstantesFunciones.INUMEROPAGINACION);
		this.productoprodumermaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaProductoProduMerma(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProductoProduMerma() {
		this.updateBorderResaltarBusquedasFormularioProductoProduMerma();
		this.updateVisibilidadBusquedasFormularioProductoProduMerma();
		this.updateHabilitarBusquedasFormularioProductoProduMerma();
	}
	
	public void updateBorderResaltarBusquedasFormularioProductoProduMerma() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProductoProduMerma.getComponents().length>0) {
	

		if(this.productoprodumermaConstantesFunciones.resaltarFK_IdProductoDefiProduProductoProduMerma!=null) {
			index= this.jTabbedPaneBusquedasProductoProduMerma.indexOfComponent(this.jPanelFK_IdProductoDefiProduProductoProduMerma);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMerma.getComponent(index);
				jPanel.setBorder(this.productoprodumermaConstantesFunciones.resaltarFK_IdProductoDefiProduProductoProduMerma);
			}
		}

		if(this.productoprodumermaConstantesFunciones.resaltarFK_IdTipoMermaEmpresaProductoProduMerma!=null) {
			index= this.jTabbedPaneBusquedasProductoProduMerma.indexOfComponent(this.jPanelFK_IdTipoMermaEmpresaProductoProduMerma);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMerma.getComponent(index);
				jPanel.setBorder(this.productoprodumermaConstantesFunciones.resaltarFK_IdTipoMermaEmpresaProductoProduMerma);
			}
		}

		if(this.productoprodumermaConstantesFunciones.resaltarFK_IdUnidadProductoProduMerma!=null) {
			index= this.jTabbedPaneBusquedasProductoProduMerma.indexOfComponent(this.jPanelFK_IdUnidadProductoProduMerma);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMerma.getComponent(index);
				jPanel.setBorder(this.productoprodumermaConstantesFunciones.resaltarFK_IdUnidadProductoProduMerma);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProductoProduMerma() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProductoProduMerma.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductoProduMerma.indexOfComponent(this.jPanelFK_IdProductoDefiProduProductoProduMerma);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMerma.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoprodumermaConstantesFunciones.mostrarFK_IdProductoDefiProduProductoProduMerma);
			if(!this.productoprodumermaConstantesFunciones.mostrarFK_IdProductoDefiProduProductoProduMerma && index>-1) {
				this.jTabbedPaneBusquedasProductoProduMerma.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoProduMerma.indexOfComponent(this.jPanelFK_IdTipoMermaEmpresaProductoProduMerma);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMerma.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoprodumermaConstantesFunciones.mostrarFK_IdTipoMermaEmpresaProductoProduMerma);
			if(!this.productoprodumermaConstantesFunciones.mostrarFK_IdTipoMermaEmpresaProductoProduMerma && index>-1) {
				this.jTabbedPaneBusquedasProductoProduMerma.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoProduMerma.indexOfComponent(this.jPanelFK_IdUnidadProductoProduMerma);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMerma.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoprodumermaConstantesFunciones.mostrarFK_IdUnidadProductoProduMerma);
			if(!this.productoprodumermaConstantesFunciones.mostrarFK_IdUnidadProductoProduMerma && index>-1) {
				this.jTabbedPaneBusquedasProductoProduMerma.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProductoProduMerma() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProductoProduMerma.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductoProduMerma.indexOfComponent(this.jPanelFK_IdProductoDefiProduProductoProduMerma);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMerma.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoprodumermaConstantesFunciones.activarFK_IdProductoDefiProduProductoProduMerma);
				this.jTabbedPaneBusquedasProductoProduMerma.setEnabledAt(index,this.productoprodumermaConstantesFunciones.activarFK_IdProductoDefiProduProductoProduMerma);
			}

			index= this.jTabbedPaneBusquedasProductoProduMerma.indexOfComponent(this.jPanelFK_IdTipoMermaEmpresaProductoProduMerma);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMerma.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoprodumermaConstantesFunciones.activarFK_IdTipoMermaEmpresaProductoProduMerma);
				this.jTabbedPaneBusquedasProductoProduMerma.setEnabledAt(index,this.productoprodumermaConstantesFunciones.activarFK_IdTipoMermaEmpresaProductoProduMerma);
			}

			index= this.jTabbedPaneBusquedasProductoProduMerma.indexOfComponent(this.jPanelFK_IdUnidadProductoProduMerma);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMerma.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoprodumermaConstantesFunciones.activarFK_IdUnidadProductoProduMerma);
				this.jTabbedPaneBusquedasProductoProduMerma.setEnabledAt(index,this.productoprodumermaConstantesFunciones.activarFK_IdUnidadProductoProduMerma);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProductoProduMerma(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdProductoDefiProdu")) {
			index= this.jTabbedPaneBusquedasProductoProduMerma.indexOfComponent(this.jPanelFK_IdProductoDefiProduProductoProduMerma);

			this.jTabbedPaneBusquedasProductoProduMerma.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMerma.getComponent(index);

			this.productoprodumermaConstantesFunciones.setResaltarFK_IdProductoDefiProduProductoProduMerma(resaltar);

			jPanel.setBorder(this.productoprodumermaConstantesFunciones.resaltarFK_IdProductoDefiProduProductoProduMerma);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoMermaEmpresa")) {
			index= this.jTabbedPaneBusquedasProductoProduMerma.indexOfComponent(this.jPanelFK_IdTipoMermaEmpresaProductoProduMerma);

			this.jTabbedPaneBusquedasProductoProduMerma.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMerma.getComponent(index);

			this.productoprodumermaConstantesFunciones.setResaltarFK_IdTipoMermaEmpresaProductoProduMerma(resaltar);

			jPanel.setBorder(this.productoprodumermaConstantesFunciones.resaltarFK_IdTipoMermaEmpresaProductoProduMerma);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdUnidad")) {
			index= this.jTabbedPaneBusquedasProductoProduMerma.indexOfComponent(this.jPanelFK_IdUnidadProductoProduMerma);

			this.jTabbedPaneBusquedasProductoProduMerma.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMerma.getComponent(index);

			this.productoprodumermaConstantesFunciones.setResaltarFK_IdUnidadProductoProduMerma(resaltar);

			jPanel.setBorder(this.productoprodumermaConstantesFunciones.resaltarFK_IdUnidadProductoProduMerma);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProductoProduMerma.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProductoProduMerma() throws Exception {

		if(this.jInternalFrameDetalleFormProductoProduMerma==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProductoProduMerma();
		this.updateVisibilidadResaltarControlesFormularioProductoProduMerma();
		this.updateHabilitarResaltarControlesFormularioProductoProduMerma();
		
	}
	
	public void updateBorderResaltarControlesFormularioProductoProduMerma() throws Exception {
		if(this.jInternalFrameDetalleFormProductoProduMerma==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.productoprodumermaConstantesFunciones.resaltaridProductoProduMerma!=null && this.jInternalFrameDetalleFormProductoProduMerma!=null) {this.jInternalFrameDetalleFormProductoProduMerma.jLabelidProductoProduMerma.setBorder(this.productoprodumermaConstantesFunciones.resaltaridProductoProduMerma);}
		if(this.productoprodumermaConstantesFunciones.resaltarid_producto_defi_produProductoProduMerma!=null && this.jInternalFrameDetalleFormProductoProduMerma!=null) {this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_producto_defi_produProductoProduMerma.setBorder(this.productoprodumermaConstantesFunciones.resaltarid_producto_defi_produProductoProduMerma);}
		if(this.productoprodumermaConstantesFunciones.resaltarid_tipo_merma_empresaProductoProduMerma!=null && this.jInternalFrameDetalleFormProductoProduMerma!=null) {this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_tipo_merma_empresaProductoProduMerma.setBorder(this.productoprodumermaConstantesFunciones.resaltarid_tipo_merma_empresaProductoProduMerma);}
		if(this.productoprodumermaConstantesFunciones.resaltarid_unidadProductoProduMerma!=null && this.jInternalFrameDetalleFormProductoProduMerma!=null) {this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_unidadProductoProduMerma.setBorder(this.productoprodumermaConstantesFunciones.resaltarid_unidadProductoProduMerma);}
		if(this.productoprodumermaConstantesFunciones.resaltarcantidadProductoProduMerma!=null && this.jInternalFrameDetalleFormProductoProduMerma!=null) {this.jInternalFrameDetalleFormProductoProduMerma.jTextFieldcantidadProductoProduMerma.setBorder(this.productoprodumermaConstantesFunciones.resaltarcantidadProductoProduMerma);}
		if(this.productoprodumermaConstantesFunciones.resaltarcostoProductoProduMerma!=null && this.jInternalFrameDetalleFormProductoProduMerma!=null) {this.jInternalFrameDetalleFormProductoProduMerma.jTextFieldcostoProductoProduMerma.setBorder(this.productoprodumermaConstantesFunciones.resaltarcostoProductoProduMerma);}
		if(this.productoprodumermaConstantesFunciones.resaltarcosto_totalProductoProduMerma!=null && this.jInternalFrameDetalleFormProductoProduMerma!=null) {this.jInternalFrameDetalleFormProductoProduMerma.jTextFieldcosto_totalProductoProduMerma.setBorder(this.productoprodumermaConstantesFunciones.resaltarcosto_totalProductoProduMerma);}
		if(this.productoprodumermaConstantesFunciones.resaltardescripcionProductoProduMerma!=null && this.jInternalFrameDetalleFormProductoProduMerma!=null) {this.jInternalFrameDetalleFormProductoProduMerma.jTextAreadescripcionProductoProduMerma.setBorder(this.productoprodumermaConstantesFunciones.resaltardescripcionProductoProduMerma);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProductoProduMerma() throws Exception {		
		if(this.jInternalFrameDetalleFormProductoProduMerma==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductoProduMerma!=null) {
	
		//this.jInternalFrameDetalleFormProductoProduMerma.jLabelidProductoProduMerma.setVisible(this.productoprodumermaConstantesFunciones.mostraridProductoProduMerma);
		this.jInternalFrameDetalleFormProductoProduMerma.jPanelidProductoProduMerma.setVisible(this.productoprodumermaConstantesFunciones.mostraridProductoProduMerma);
		//this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_producto_defi_produProductoProduMerma.setVisible(this.productoprodumermaConstantesFunciones.mostrarid_producto_defi_produProductoProduMerma);
		this.jInternalFrameDetalleFormProductoProduMerma.jPanelid_producto_defi_produProductoProduMerma.setVisible(this.productoprodumermaConstantesFunciones.mostrarid_producto_defi_produProductoProduMerma);
		//this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_tipo_merma_empresaProductoProduMerma.setVisible(this.productoprodumermaConstantesFunciones.mostrarid_tipo_merma_empresaProductoProduMerma);
		this.jInternalFrameDetalleFormProductoProduMerma.jPanelid_tipo_merma_empresaProductoProduMerma.setVisible(this.productoprodumermaConstantesFunciones.mostrarid_tipo_merma_empresaProductoProduMerma);
		//this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_unidadProductoProduMerma.setVisible(this.productoprodumermaConstantesFunciones.mostrarid_unidadProductoProduMerma);
		this.jInternalFrameDetalleFormProductoProduMerma.jPanelid_unidadProductoProduMerma.setVisible(this.productoprodumermaConstantesFunciones.mostrarid_unidadProductoProduMerma);
		//this.jInternalFrameDetalleFormProductoProduMerma.jTextFieldcantidadProductoProduMerma.setVisible(this.productoprodumermaConstantesFunciones.mostrarcantidadProductoProduMerma);
		this.jInternalFrameDetalleFormProductoProduMerma.jPanelcantidadProductoProduMerma.setVisible(this.productoprodumermaConstantesFunciones.mostrarcantidadProductoProduMerma);
		//this.jInternalFrameDetalleFormProductoProduMerma.jTextFieldcostoProductoProduMerma.setVisible(this.productoprodumermaConstantesFunciones.mostrarcostoProductoProduMerma);
		this.jInternalFrameDetalleFormProductoProduMerma.jPanelcostoProductoProduMerma.setVisible(this.productoprodumermaConstantesFunciones.mostrarcostoProductoProduMerma);
		//this.jInternalFrameDetalleFormProductoProduMerma.jTextFieldcosto_totalProductoProduMerma.setVisible(this.productoprodumermaConstantesFunciones.mostrarcosto_totalProductoProduMerma);
		this.jInternalFrameDetalleFormProductoProduMerma.jPanelcosto_totalProductoProduMerma.setVisible(this.productoprodumermaConstantesFunciones.mostrarcosto_totalProductoProduMerma);
		//this.jInternalFrameDetalleFormProductoProduMerma.jTextAreadescripcionProductoProduMerma.setVisible(this.productoprodumermaConstantesFunciones.mostrardescripcionProductoProduMerma);
		this.jInternalFrameDetalleFormProductoProduMerma.jPaneldescripcionProductoProduMerma.setVisible(this.productoprodumermaConstantesFunciones.mostrardescripcionProductoProduMerma);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProductoProduMerma() throws Exception {
		if(this.jInternalFrameDetalleFormProductoProduMerma==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductoProduMerma!=null) {
	
		this.jInternalFrameDetalleFormProductoProduMerma.jLabelidProductoProduMerma.setEnabled(this.productoprodumermaConstantesFunciones.activaridProductoProduMerma);
		this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_producto_defi_produProductoProduMerma.setEnabled(this.productoprodumermaConstantesFunciones.activarid_producto_defi_produProductoProduMerma);
		this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_tipo_merma_empresaProductoProduMerma.setEnabled(this.productoprodumermaConstantesFunciones.activarid_tipo_merma_empresaProductoProduMerma);
		this.jInternalFrameDetalleFormProductoProduMerma.jComboBoxid_unidadProductoProduMerma.setEnabled(this.productoprodumermaConstantesFunciones.activarid_unidadProductoProduMerma);
		this.jInternalFrameDetalleFormProductoProduMerma.jTextFieldcantidadProductoProduMerma.setEnabled(this.productoprodumermaConstantesFunciones.activarcantidadProductoProduMerma);
		this.jInternalFrameDetalleFormProductoProduMerma.jTextFieldcostoProductoProduMerma.setEnabled(this.productoprodumermaConstantesFunciones.activarcostoProductoProduMerma);
		this.jInternalFrameDetalleFormProductoProduMerma.jTextFieldcosto_totalProductoProduMerma.setEnabled(this.productoprodumermaConstantesFunciones.activarcosto_totalProductoProduMerma);
		this.jInternalFrameDetalleFormProductoProduMerma.jTextAreadescripcionProductoProduMerma.setEnabled(this.productoprodumermaConstantesFunciones.activardescripcionProductoProduMerma);
		}
	}
	
		
}