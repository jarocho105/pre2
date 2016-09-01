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

import com.bydan.erp.produccion.util.ProductoOrdenDetaProduMermaConstantesFunciones;
import com.bydan.erp.produccion.util.ProductoOrdenDetaProduMermaParameterReturnGeneral;
//import com.bydan.erp.produccion.util.ProductoOrdenDetaProduMermaParameterGeneral;
//import com.bydan.erp.produccion.presentation.report.source.ProductoOrdenDetaProduMermaBean;
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
public class ProductoOrdenDetaProduMermaBeanSwingJInternalFrame extends ProductoOrdenDetaProduMermaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProductoOrdenDetaProduMermaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProductoOrdenDetaProduMerma> productoordendetaprodumermaValidator = new ClassValidator<ProductoOrdenDetaProduMerma>(ProductoOrdenDetaProduMerma.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProductoOrdenDetaProduMerma productoordendetaprodumerma;	
	public ProductoOrdenDetaProduMerma productoordendetaprodumermaAux;
	public ProductoOrdenDetaProduMerma productoordendetaprodumermaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProductoOrdenDetaProduMerma productoordendetaprodumermaTotales;
	public Long idProductoOrdenDetaProduMermaActual;
	public Long iIdNuevoProductoOrdenDetaProduMerma=0L;
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
	
	public Boolean isPermisoTodoProductoOrdenDetaProduMerma;
	public Boolean isPermisoNuevoProductoOrdenDetaProduMerma;
	public Boolean isPermisoActualizarProductoOrdenDetaProduMerma;
	public Boolean isPermisoActualizarOriginalProductoOrdenDetaProduMerma;
	public Boolean isPermisoEliminarProductoOrdenDetaProduMerma;
	public Boolean isPermisoGuardarCambiosProductoOrdenDetaProduMerma;
	public Boolean isPermisoConsultaProductoOrdenDetaProduMerma;
	public Boolean isPermisoBusquedaProductoOrdenDetaProduMerma;
	public Boolean isPermisoReporteProductoOrdenDetaProduMerma;
	public Boolean isPermisoPaginacionMedioProductoOrdenDetaProduMerma;
	public Boolean isPermisoPaginacionAltoProductoOrdenDetaProduMerma;
	public Boolean isPermisoPaginacionTodoProductoOrdenDetaProduMerma;
	public Boolean isPermisoCopiarProductoOrdenDetaProduMerma;
	public Boolean isPermisoVerFormProductoOrdenDetaProduMerma;
	public Boolean isPermisoDuplicarProductoOrdenDetaProduMerma;
	public Boolean isPermisoOrdenProductoOrdenDetaProduMerma;
	
	
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
	
	public ProductoOrdenDetaProduMermaParameterReturnGeneral productoordendetaprodumermaReturnGeneral;
	public ProductoOrdenDetaProduMermaParameterReturnGeneral productoordendetaprodumermaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProductoOrdenDetaProduMerma=false;
	public Boolean esParaAccionDesdeFormularioProductoOrdenDetaProduMerma=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProductoOrdenDetaProduMermaSessionBeanAdditional productoordendetaprodumermaSessionBeanAdditional=null;
	
	public ProductoOrdenDetaProduMermaSessionBeanAdditional getProductoOrdenDetaProduMermaSessionBeanAdditional() {
		return this.productoordendetaprodumermaSessionBeanAdditional;
	}
	
	public void setProductoOrdenDetaProduMermaSessionBeanAdditional(ProductoOrdenDetaProduMermaSessionBeanAdditional productoordendetaprodumermaSessionBeanAdditional) {
		try {
			this.productoordendetaprodumermaSessionBeanAdditional=productoordendetaprodumermaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional productoordendetaprodumermaBeanSwingJInternalFrameAdditional=null;
	//public class ProductoOrdenDetaProduMermaBeanSwingJInternalFrame
	
	public ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional getProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional() {
		return this.productoordendetaprodumermaBeanSwingJInternalFrameAdditional;
	}
	
	public void setProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional(ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional productoordendetaprodumermaBeanSwingJInternalFrameAdditional) {
		try {
			this.productoordendetaprodumermaBeanSwingJInternalFrameAdditional=productoordendetaprodumermaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProductoOrdenDetaProduMermaLogic productoordendetaprodumermaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProductoOrdenDetaProduMerma productoordendetaprodumermaBean;
	public ProductoOrdenDetaProduMermaConstantesFunciones productoordendetaprodumermaConstantesFunciones;
	//public ProductoOrdenDetaProduMermaParameterReturnGeneral productoordendetaprodumermaReturnGeneral;
	
	//FK
	
	public OrdenDetaProduLogic ordendetaproduLogic;
	public TipoMermaEmpresaLogic tipomermaempresaLogic;
	public UnidadLogic unidadLogic;
	
	//PARAMETROS
	
	
	//public List<ProductoOrdenDetaProduMerma> productoordendetaprodumermas;	
	//public List<ProductoOrdenDetaProduMerma> productoordendetaprodumermasEliminados;
	//public List<ProductoOrdenDetaProduMerma> productoordendetaprodumermasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProductoOrdenDetaProduMerma=false;
	public Boolean isVisibilidadCeldaDuplicarProductoOrdenDetaProduMerma=true;
	public Boolean isVisibilidadCeldaCopiarProductoOrdenDetaProduMerma=true;
	public Boolean isVisibilidadCeldaVerFormProductoOrdenDetaProduMerma=true;
	public Boolean isVisibilidadCeldaOrdenProductoOrdenDetaProduMerma=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMerma=false;
	public Boolean isVisibilidadCeldaModificarProductoOrdenDetaProduMerma=false;
	public Boolean isVisibilidadCeldaActualizarProductoOrdenDetaProduMerma=false;
	public Boolean isVisibilidadCeldaEliminarProductoOrdenDetaProduMerma=false;
	public Boolean isVisibilidadCeldaCancelarProductoOrdenDetaProduMerma=false;
	public Boolean isVisibilidadCeldaGuardarProductoOrdenDetaProduMerma=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMerma=false;	
	
	
	public Boolean isVisibilidadFK_IdOrdenDetaProdu=false;
	public Boolean isVisibilidadFK_IdTipoMermaEmpresa=false;
	public Boolean isVisibilidadFK_IdUnidad=false;
	
	public Long getiIdNuevoProductoOrdenDetaProduMerma() {
		return this.iIdNuevoProductoOrdenDetaProduMerma;
	}

	public void setiIdNuevoProductoOrdenDetaProduMerma(Long iIdNuevoProductoOrdenDetaProduMerma) {
		this.iIdNuevoProductoOrdenDetaProduMerma = iIdNuevoProductoOrdenDetaProduMerma;
	}
	
	public Long getidProductoOrdenDetaProduMermaActual() {
		return this.idProductoOrdenDetaProduMermaActual;
	}

	public void setidProductoOrdenDetaProduMermaActual(Long idProductoOrdenDetaProduMermaActual) {
		this.idProductoOrdenDetaProduMermaActual = idProductoOrdenDetaProduMermaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProductoOrdenDetaProduMerma getproductoordendetaprodumerma() {
		return this.productoordendetaprodumerma;
	}

	public void setproductoordendetaprodumerma(ProductoOrdenDetaProduMerma productoordendetaprodumerma) {
		this.productoordendetaprodumerma = productoordendetaprodumerma;
	}
	
	public ProductoOrdenDetaProduMerma getproductoordendetaprodumermaAux() {
		return this.productoordendetaprodumermaAux;
	}

	public void setproductoordendetaprodumermaAux(ProductoOrdenDetaProduMerma productoordendetaprodumermaAux) {
		this.productoordendetaprodumermaAux = productoordendetaprodumermaAux;
	}				
	
	public ProductoOrdenDetaProduMerma getproductoordendetaprodumermaAnterior() {
		return this.productoordendetaprodumermaAnterior;
	}

	public void setproductoordendetaprodumermaAnterior(ProductoOrdenDetaProduMerma productoordendetaprodumermaAnterior) {
		this.productoordendetaprodumermaAnterior = productoordendetaprodumermaAnterior;
	}	
	
	public ProductoOrdenDetaProduMerma getproductoordendetaprodumermaTotales() {
		return this.productoordendetaprodumermaTotales;
	}

	public void setproductoordendetaprodumermaTotales(ProductoOrdenDetaProduMerma productoordendetaprodumermaTotales) {
		this.productoordendetaprodumermaTotales = productoordendetaprodumermaTotales;
	}	
	
	public ProductoOrdenDetaProduMerma getproductoordendetaprodumermaBean() {
		return this.productoordendetaprodumermaBean;
	}

	public void setproductoordendetaprodumermaBean(ProductoOrdenDetaProduMerma productoordendetaprodumermaBean) {
		this.productoordendetaprodumermaBean = productoordendetaprodumermaBean;
	}	
	
	public ProductoOrdenDetaProduMermaParameterReturnGeneral getproductoordendetaprodumermaReturnGeneral() {
		return this.productoordendetaprodumermaReturnGeneral;
	}

	public void setproductoordendetaprodumermaReturnGeneral(ProductoOrdenDetaProduMermaParameterReturnGeneral productoordendetaprodumermaReturnGeneral) {
		this.productoordendetaprodumermaReturnGeneral = productoordendetaprodumermaReturnGeneral;
	}	
	
	
	public Long id_orden_deta_produFK_IdOrdenDetaProdu=-1L;

	public Long getid_orden_deta_produFK_IdOrdenDetaProdu() {
		return this.id_orden_deta_produFK_IdOrdenDetaProdu;
	}

	public void setid_orden_deta_produFK_IdOrdenDetaProdu(Long id_orden_deta_produFK_IdOrdenDetaProdu) {
		this.id_orden_deta_produFK_IdOrdenDetaProdu = id_orden_deta_produFK_IdOrdenDetaProdu;
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
	
	
	public ProductoOrdenDetaProduMermaLogic getProductoOrdenDetaProduMermaLogic()	{		
		return productoordendetaprodumermaLogic;
	}

	public void setProductoOrdenDetaProduMermaLogic(ProductoOrdenDetaProduMermaLogic productoordendetaprodumermaLogic) {
		this.productoordendetaprodumermaLogic = productoordendetaprodumermaLogic;
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
	
	public Boolean getIsEsNuevoProductoOrdenDetaProduMerma() {
		return isEsNuevoProductoOrdenDetaProduMerma;
	}

	public void setIsEsNuevoProductoOrdenDetaProduMerma(Boolean isEsNuevoProductoOrdenDetaProduMerma) {
		this.isEsNuevoProductoOrdenDetaProduMerma = isEsNuevoProductoOrdenDetaProduMerma;
	}

	public Boolean getEsParaAccionDesdeFormularioProductoOrdenDetaProduMerma() {
		return esParaAccionDesdeFormularioProductoOrdenDetaProduMerma;
	}
	
	public void setEsParaAccionDesdeFormularioProductoOrdenDetaProduMerma(Boolean esParaAccionDesdeFormularioProductoOrdenDetaProduMerma) {
		this.esParaAccionDesdeFormularioProductoOrdenDetaProduMerma = esParaAccionDesdeFormularioProductoOrdenDetaProduMerma;
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

			if(this.productoordendetaprodumermaSessionBean==null) {
				this.productoordendetaprodumermaSessionBean=new ProductoOrdenDetaProduMermaSessionBean();
			}

			if(!this.productoordendetaprodumermaSessionBean.getisBusquedaDesdeForeignKeySesionOrdenDetaProdu()) {
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
					ordendetaproduLogic.getEntityWithConnection(productoordendetaprodumermaSessionBean.getlidOrdenDetaProduActual());
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

			if(this.productoordendetaprodumermaSessionBean==null) {
				this.productoordendetaprodumermaSessionBean=new ProductoOrdenDetaProduMermaSessionBean();
			}

			if(!this.productoordendetaprodumermaSessionBean.getisBusquedaDesdeForeignKeySesionTipoMermaEmpresa()) {
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
					tipomermaempresaLogic.getEntityWithConnection(productoordendetaprodumermaSessionBean.getlidTipoMermaEmpresaActual());
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

			if(this.productoordendetaprodumermaSessionBean==null) {
				this.productoordendetaprodumermaSessionBean=new ProductoOrdenDetaProduMermaSessionBean();
			}

			if(!this.productoordendetaprodumermaSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
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
					unidadLogic.getEntityWithConnection(productoordendetaprodumermaSessionBean.getlidUnidadActual());
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

					if(this.productoordendetaprodumerma!=null) {
						this.productoordendetaprodumerma.setOrdenDetaProdu(ordendetaproduTemp);
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) {
						this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_orden_deta_produProductoOrdenDetaProduMerma.setSelectedItem(ordendetaproduTemp);
					}
				} else {
					//jComboBoxid_orden_deta_produProductoOrdenDetaProduMerma.setSelectedItem(ordendetaproduTemp);
					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_orden_deta_produProductoOrdenDetaProduMerma.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_orden_deta_produProductoOrdenDetaProduMerma.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdOrdenDetaProdu") || sFormularioTipoBusqueda.equals("Todos")){
					if(ordendetaproduTemp!=null && jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMerma!=null) {
						jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMerma.setSelectedItem(ordendetaproduTemp);
					} else {
						if(jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMerma!=null) {
							//jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMerma.setSelectedItem(ordendetaproduTemp);
							if(jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMerma.getItemCount()>0) {
								jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMerma.setSelectedIndex(0);
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
	public void setActualOrdenDetaProduForeignKeyGenerico(Long idOrdenDetaProduSeleccionado,JComboBox jComboBoxid_orden_deta_produProductoOrdenDetaProduMermaGenerico)throws Exception
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
				jComboBoxid_orden_deta_produProductoOrdenDetaProduMermaGenerico.setSelectedItem(ordendetaproduTemp);
			} else {
				if(jComboBoxid_orden_deta_produProductoOrdenDetaProduMermaGenerico!=null && jComboBoxid_orden_deta_produProductoOrdenDetaProduMermaGenerico.getItemCount()>0) {
					jComboBoxid_orden_deta_produProductoOrdenDetaProduMermaGenerico.setSelectedIndex(0);
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

					if(this.productoordendetaprodumerma!=null) {
						this.productoordendetaprodumerma.setTipoMermaEmpresa(tipomermaempresaTemp);
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) {
						this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMerma.setSelectedItem(tipomermaempresaTemp);
					}
				} else {
					//jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMerma.setSelectedItem(tipomermaempresaTemp);
					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMerma.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMerma.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoMermaEmpresa") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipomermaempresaTemp!=null && jComboBoxid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma!=null) {
						jComboBoxid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma.setSelectedItem(tipomermaempresaTemp);
					} else {
						if(jComboBoxid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma!=null) {
							//jComboBoxid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma.setSelectedItem(tipomermaempresaTemp);
							if(jComboBoxid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma.getItemCount()>0) {
								jComboBoxid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma.setSelectedIndex(0);
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
	public void setActualTipoMermaEmpresaForeignKeyGenerico(Long idTipoMermaEmpresaSeleccionado,JComboBox jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMermaGenerico)throws Exception
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
				jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMermaGenerico.setSelectedItem(tipomermaempresaTemp);
			} else {
				if(jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMermaGenerico!=null && jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMermaGenerico.getItemCount()>0) {
					jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMermaGenerico.setSelectedIndex(0);
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

					if(this.productoordendetaprodumerma!=null) {
						this.productoordendetaprodumerma.setUnidad(unidadTemp);
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) {
						this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_unidadProductoOrdenDetaProduMerma.setSelectedItem(unidadTemp);
					}
				} else {
					//jComboBoxid_unidadProductoOrdenDetaProduMerma.setSelectedItem(unidadTemp);
					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_unidadProductoOrdenDetaProduMerma.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_unidadProductoOrdenDetaProduMerma.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){
					if(unidadTemp!=null && jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMerma!=null) {
						jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMerma.setSelectedItem(unidadTemp);
					} else {
						if(jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMerma!=null) {
							//jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMerma.setSelectedItem(unidadTemp);
							if(jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMerma.getItemCount()>0) {
								jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMerma.setSelectedIndex(0);
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
	public void setActualUnidadForeignKeyGenerico(Long idUnidadSeleccionado,JComboBox jComboBoxid_unidadProductoOrdenDetaProduMermaGenerico)throws Exception
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
				jComboBoxid_unidadProductoOrdenDetaProduMermaGenerico.setSelectedItem(unidadTemp);
			} else {
				if(jComboBoxid_unidadProductoOrdenDetaProduMermaGenerico!=null && jComboBoxid_unidadProductoOrdenDetaProduMermaGenerico.getItemCount()>0) {
					jComboBoxid_unidadProductoOrdenDetaProduMermaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarOrdenDetaProduForeignKey(ProductoOrdenDetaProduMerma productoordendetaprodumerma,JComboBox jComboBoxid_orden_deta_produProductoOrdenDetaProduMermaGenerico)throws Exception
	{
		try
		{
			OrdenDetaProdu  ordendetaproduAux=new OrdenDetaProdu();

			if(jComboBoxid_orden_deta_produProductoOrdenDetaProduMermaGenerico==null) {
				ordendetaproduAux=(OrdenDetaProdu)this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_orden_deta_produProductoOrdenDetaProduMerma.getSelectedItem();
			} else {
				ordendetaproduAux=(OrdenDetaProdu)jComboBoxid_orden_deta_produProductoOrdenDetaProduMermaGenerico.getSelectedItem();
			}

			if(ordendetaproduAux!=null && ordendetaproduAux.getId()!=null) {
				productoordendetaprodumerma.setid_orden_deta_produ(ordendetaproduAux.getId());
				productoordendetaprodumerma.setordendetaprodu_descripcion(ProductoOrdenDetaProduMermaConstantesFunciones.getOrdenDetaProduDescripcion(ordendetaproduAux));
				productoordendetaprodumerma.setOrdenDetaProdu(ordendetaproduAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoMermaEmpresaForeignKey(ProductoOrdenDetaProduMerma productoordendetaprodumerma,JComboBox jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMermaGenerico)throws Exception
	{
		try
		{
			TipoMermaEmpresa  tipomermaempresaAux=new TipoMermaEmpresa();

			if(jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMermaGenerico==null) {
				tipomermaempresaAux=(TipoMermaEmpresa)this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMerma.getSelectedItem();
			} else {
				tipomermaempresaAux=(TipoMermaEmpresa)jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMermaGenerico.getSelectedItem();
			}

			if(tipomermaempresaAux!=null && tipomermaempresaAux.getId()!=null) {
				productoordendetaprodumerma.setid_tipo_merma_empresa(tipomermaempresaAux.getId());
				productoordendetaprodumerma.settipomermaempresa_descripcion(ProductoOrdenDetaProduMermaConstantesFunciones.getTipoMermaEmpresaDescripcion(tipomermaempresaAux));
				productoordendetaprodumerma.setTipoMermaEmpresa(tipomermaempresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUnidadForeignKey(ProductoOrdenDetaProduMerma productoordendetaprodumerma,JComboBox jComboBoxid_unidadProductoOrdenDetaProduMermaGenerico)throws Exception
	{
		try
		{
			Unidad  unidadAux=new Unidad();

			if(jComboBoxid_unidadProductoOrdenDetaProduMermaGenerico==null) {
				unidadAux=(Unidad)this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_unidadProductoOrdenDetaProduMerma.getSelectedItem();
			} else {
				unidadAux=(Unidad)jComboBoxid_unidadProductoOrdenDetaProduMermaGenerico.getSelectedItem();
			}

			if(unidadAux!=null && unidadAux.getId()!=null) {
				productoordendetaprodumerma.setid_unidad(unidadAux.getId());
				productoordendetaprodumerma.setunidad_descripcion(ProductoOrdenDetaProduMermaConstantesFunciones.getUnidadDescripcion(unidadAux));
				productoordendetaprodumerma.setUnidad(unidadAux);			}
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

					if(!ProductoOrdenDetaProduMermaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) { 
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_orden_deta_produProductoOrdenDetaProduMerma.removeAllItems();

							for(OrdenDetaProdu ordendetaprodu:this.ordendetaprodusForeignKey) {
								this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_orden_deta_produProductoOrdenDetaProduMerma.addItem(ordendetaprodu);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) { 
					}

					if(!ProductoOrdenDetaProduMermaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdOrdenDetaProdu") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoOrdenDetaProduMermaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMerma.removeAllItems();

							for(OrdenDetaProdu ordendetaprodu:this.ordendetaprodusForeignKey) {
								this.jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMerma.addItem(ordendetaprodu);
							}
						}

						if(!ProductoOrdenDetaProduMermaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoOrdenDetaProduMermaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) { 
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMerma.removeAllItems();

							for(TipoMermaEmpresa tipomermaempresa:this.tipomermaempresasForeignKey) {
								this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMerma.addItem(tipomermaempresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) { 
					}

					if(!ProductoOrdenDetaProduMermaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoMermaEmpresa") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoOrdenDetaProduMermaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma.removeAllItems();

							for(TipoMermaEmpresa tipomermaempresa:this.tipomermaempresasForeignKey) {
								this.jComboBoxid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma.addItem(tipomermaempresa);
							}
						}

						if(!ProductoOrdenDetaProduMermaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoOrdenDetaProduMermaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) { 
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_unidadProductoOrdenDetaProduMerma.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_unidadProductoOrdenDetaProduMerma.addItem(unidad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) { 
					}

					if(!ProductoOrdenDetaProduMermaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoOrdenDetaProduMermaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMerma.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMerma.addItem(unidad);
							}
						}

						if(!ProductoOrdenDetaProduMermaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_orden_deta_produProductoOrdenDetaProduMerma.setSelectedItem(ordendetaprodu);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_orden_deta_produProductoOrdenDetaProduMerma.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMerma.setSelectedItem(ordendetaprodu);
						} else {
							this.jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMerma.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMerma.setSelectedItem(tipomermaempresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMerma.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma.setSelectedItem(tipomermaempresa);
						} else {
							this.jComboBoxid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_unidadProductoOrdenDetaProduMerma.setSelectedItem(unidad);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_unidadProductoOrdenDetaProduMerma.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMerma.setSelectedItem(unidad);
						} else {
							this.jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMerma.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProductoOrdenDetaProduMerma() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ProductoOrdenDetaProduMermaConstantesFunciones.refrescarForeignKeysDescripcionesProductoOrdenDetaProduMerma(this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ProductoOrdenDetaProduMermaConstantesFunciones.refrescarForeignKeysDescripcionesProductoOrdenDetaProduMerma(this.productoordendetaprodumermas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(OrdenDetaProdu.class));
		classes.add(new Classe(TipoMermaEmpresa.class));
		classes.add(new Classe(Unidad.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//productoordendetaprodumermaLogic.setProductoOrdenDetaProduMermas(this.productoordendetaprodumermas);
			productoordendetaprodumermaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ProductoOrdenDetaProduMermaParameterReturnGeneral getProductoOrdenDetaProduMermaParameterGeneral() {
		return this.productoordendetaprodumermaParameterGeneral;
	}
	
	public void setProductoOrdenDetaProduMermaParameterGeneral(ProductoOrdenDetaProduMermaParameterReturnGeneral productoordendetaprodumermaParameterGeneral) {
		this.productoordendetaprodumermaParameterGeneral = productoordendetaprodumermaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProductoOrdenDetaProduMerma() {
		return isPermisoTodoProductoOrdenDetaProduMerma;
	}

	public void setIsPermisoTodoProductoOrdenDetaProduMerma(Boolean isPermisoTodoProductoOrdenDetaProduMerma) {
		this.isPermisoTodoProductoOrdenDetaProduMerma = isPermisoTodoProductoOrdenDetaProduMerma;
	}

	public Boolean getIsPermisoNuevoProductoOrdenDetaProduMerma() {
		return isPermisoNuevoProductoOrdenDetaProduMerma;
	}

	public void setIsPermisoNuevoProductoOrdenDetaProduMerma(Boolean isPermisoNuevoProductoOrdenDetaProduMerma) {
		this.isPermisoNuevoProductoOrdenDetaProduMerma = isPermisoNuevoProductoOrdenDetaProduMerma;
	}

	public Boolean getIsPermisoActualizarProductoOrdenDetaProduMerma() {
		return isPermisoActualizarProductoOrdenDetaProduMerma;
	}

	public void setIsPermisoActualizarProductoOrdenDetaProduMerma(Boolean isPermisoActualizarProductoOrdenDetaProduMerma) {
		this.isPermisoActualizarProductoOrdenDetaProduMerma = isPermisoActualizarProductoOrdenDetaProduMerma;
	}

	public Boolean getIsPermisoEliminarProductoOrdenDetaProduMerma() {
		return isPermisoEliminarProductoOrdenDetaProduMerma;
	}

	public void setIsPermisoEliminarProductoOrdenDetaProduMerma(Boolean isPermisoEliminarProductoOrdenDetaProduMerma) {
		this.isPermisoEliminarProductoOrdenDetaProduMerma = isPermisoEliminarProductoOrdenDetaProduMerma;
	}

	public Boolean getIsPermisoGuardarCambiosProductoOrdenDetaProduMerma() {
		return isPermisoGuardarCambiosProductoOrdenDetaProduMerma;
	}

	public void setIsPermisoGuardarCambiosProductoOrdenDetaProduMerma(Boolean isPermisoGuardarCambiosProductoOrdenDetaProduMerma) {
		this.isPermisoGuardarCambiosProductoOrdenDetaProduMerma = isPermisoGuardarCambiosProductoOrdenDetaProduMerma;
	}
	
	public Boolean getIsPermisoConsultaProductoOrdenDetaProduMerma() {
		return isPermisoConsultaProductoOrdenDetaProduMerma;
	}

	public void setIsPermisoConsultaProductoOrdenDetaProduMerma(Boolean isPermisoConsultaProductoOrdenDetaProduMerma) {
		this.isPermisoConsultaProductoOrdenDetaProduMerma = isPermisoConsultaProductoOrdenDetaProduMerma;
	}

	public Boolean getIsPermisoBusquedaProductoOrdenDetaProduMerma() {
		return isPermisoBusquedaProductoOrdenDetaProduMerma;
	}

	public void setIsPermisoBusquedaProductoOrdenDetaProduMerma(Boolean isPermisoBusquedaProductoOrdenDetaProduMerma) {
		this.isPermisoBusquedaProductoOrdenDetaProduMerma = isPermisoBusquedaProductoOrdenDetaProduMerma;
	}

	public Boolean getIsPermisoReporteProductoOrdenDetaProduMerma() {
		return isPermisoReporteProductoOrdenDetaProduMerma;
	}

	public void setIsPermisoReporteProductoOrdenDetaProduMerma(Boolean isPermisoReporteProductoOrdenDetaProduMerma) {
		this.isPermisoReporteProductoOrdenDetaProduMerma = isPermisoReporteProductoOrdenDetaProduMerma;
	}
	
	public Boolean getIsPermisoPaginacionMedioProductoOrdenDetaProduMerma() {
		return isPermisoPaginacionMedioProductoOrdenDetaProduMerma;
	}

	public void setIsPermisoPaginacionMedioProductoOrdenDetaProduMerma(Boolean isPermisoPaginacionMedioProductoOrdenDetaProduMerma) {
		this.isPermisoPaginacionMedioProductoOrdenDetaProduMerma = isPermisoPaginacionMedioProductoOrdenDetaProduMerma;
	}
	
	public Boolean getIsPermisoPaginacionTodoProductoOrdenDetaProduMerma() {
		return isPermisoPaginacionTodoProductoOrdenDetaProduMerma;
	}

	public void setIsPermisoPaginacionTodoProductoOrdenDetaProduMerma(Boolean isPermisoPaginacionTodoProductoOrdenDetaProduMerma) {
		this.isPermisoPaginacionTodoProductoOrdenDetaProduMerma = isPermisoPaginacionTodoProductoOrdenDetaProduMerma;
	}
	
	public Boolean getIsPermisoPaginacionAltoProductoOrdenDetaProduMerma() {
		return isPermisoPaginacionAltoProductoOrdenDetaProduMerma;
	}

	public void setIsPermisoPaginacionAltoProductoOrdenDetaProduMerma(Boolean isPermisoPaginacionAltoProductoOrdenDetaProduMerma) {
		this.isPermisoPaginacionAltoProductoOrdenDetaProduMerma = isPermisoPaginacionAltoProductoOrdenDetaProduMerma;
	}
	
	public Boolean getIsPermisoCopiarProductoOrdenDetaProduMerma() {
		return isPermisoCopiarProductoOrdenDetaProduMerma;
	}

	public void setIsPermisoCopiarProductoOrdenDetaProduMerma(Boolean isPermisoCopiarProductoOrdenDetaProduMerma) {
		this.isPermisoCopiarProductoOrdenDetaProduMerma = isPermisoCopiarProductoOrdenDetaProduMerma;
	}
	
	public Boolean getIsPermisoVerFormProductoOrdenDetaProduMerma() {
		return isPermisoVerFormProductoOrdenDetaProduMerma;
	}

	public void setIsPermisoVerFormProductoOrdenDetaProduMerma(Boolean isPermisoVerFormProductoOrdenDetaProduMerma) {
		this.isPermisoVerFormProductoOrdenDetaProduMerma = isPermisoVerFormProductoOrdenDetaProduMerma;
	}
	
	public Boolean getIsPermisoDuplicarProductoOrdenDetaProduMerma() {
		return isPermisoDuplicarProductoOrdenDetaProduMerma;
	}

	public void setIsPermisoDuplicarProductoOrdenDetaProduMerma(Boolean isPermisoDuplicarProductoOrdenDetaProduMerma) {
		this.isPermisoDuplicarProductoOrdenDetaProduMerma = isPermisoDuplicarProductoOrdenDetaProduMerma;
	}
	
	public Boolean getIsPermisoOrdenProductoOrdenDetaProduMerma() {
		return isPermisoOrdenProductoOrdenDetaProduMerma;
	}

	public void setIsPermisoOrdenProductoOrdenDetaProduMerma(Boolean isPermisoOrdenProductoOrdenDetaProduMerma) {
		this.isPermisoOrdenProductoOrdenDetaProduMerma = isPermisoOrdenProductoOrdenDetaProduMerma;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProductoOrdenDetaProduMerma() {
		return isVisibilidadCeldaNuevoProductoOrdenDetaProduMerma;
	}

	public void setIsVisibilidadCeldaNuevoProductoOrdenDetaProduMerma(Boolean isVisibilidadCeldaNuevoProductoOrdenDetaProduMerma) {
		this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMerma = isVisibilidadCeldaNuevoProductoOrdenDetaProduMerma;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProductoOrdenDetaProduMerma() {
		return isVisibilidadCeldaDuplicarProductoOrdenDetaProduMerma;
	}

	public void setIsVisibilidadCeldaDuplicarProductoOrdenDetaProduMerma(Boolean isVisibilidadCeldaDuplicarProductoOrdenDetaProduMerma) {
		this.isVisibilidadCeldaDuplicarProductoOrdenDetaProduMerma = isVisibilidadCeldaDuplicarProductoOrdenDetaProduMerma;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProductoOrdenDetaProduMerma() {
		return isVisibilidadCeldaCopiarProductoOrdenDetaProduMerma;
	}

	public void setIsVisibilidadCeldaCopiarProductoOrdenDetaProduMerma(Boolean isVisibilidadCeldaCopiarProductoOrdenDetaProduMerma) {
		this.isVisibilidadCeldaCopiarProductoOrdenDetaProduMerma = isVisibilidadCeldaCopiarProductoOrdenDetaProduMerma;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProductoOrdenDetaProduMerma() {
		return isVisibilidadCeldaVerFormProductoOrdenDetaProduMerma;
	}

	public void setIsVisibilidadCeldaVerFormProductoOrdenDetaProduMerma(Boolean isVisibilidadCeldaVerFormProductoOrdenDetaProduMerma) {
		this.isVisibilidadCeldaVerFormProductoOrdenDetaProduMerma = isVisibilidadCeldaVerFormProductoOrdenDetaProduMerma;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProductoOrdenDetaProduMerma() {
		return isVisibilidadCeldaOrdenProductoOrdenDetaProduMerma;
	}

	public void setIsVisibilidadCeldaOrdenProductoOrdenDetaProduMerma(Boolean isVisibilidadCeldaOrdenProductoOrdenDetaProduMerma) {
		this.isVisibilidadCeldaOrdenProductoOrdenDetaProduMerma = isVisibilidadCeldaOrdenProductoOrdenDetaProduMerma;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMerma() {
		return isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMerma;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMerma(Boolean isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMerma) {
		this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMerma = isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMerma;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProductoOrdenDetaProduMerma() {
		return isVisibilidadCeldaModificarProductoOrdenDetaProduMerma;
	}

	public void setIsVisibilidadCeldaModificarProductoOrdenDetaProduMerma(Boolean isVisibilidadCeldaModificarProductoOrdenDetaProduMerma) {
		this.isVisibilidadCeldaModificarProductoOrdenDetaProduMerma = isVisibilidadCeldaModificarProductoOrdenDetaProduMerma;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProductoOrdenDetaProduMerma() {
		return isVisibilidadCeldaActualizarProductoOrdenDetaProduMerma;
	}

	public void setIsVisibilidadCeldaActualizarProductoOrdenDetaProduMerma(Boolean isVisibilidadCeldaActualizarProductoOrdenDetaProduMerma) {
		this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMerma = isVisibilidadCeldaActualizarProductoOrdenDetaProduMerma;
	}

	public Boolean getIsVisibilidadCeldaEliminarProductoOrdenDetaProduMerma() {
		return isVisibilidadCeldaEliminarProductoOrdenDetaProduMerma;
	}

	public void setIsVisibilidadCeldaEliminarProductoOrdenDetaProduMerma(Boolean isVisibilidadCeldaEliminarProductoOrdenDetaProduMerma) {
		this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMerma = isVisibilidadCeldaEliminarProductoOrdenDetaProduMerma;
	}

	public Boolean getIsVisibilidadCeldaCancelarProductoOrdenDetaProduMerma() {
		return isVisibilidadCeldaCancelarProductoOrdenDetaProduMerma;
	}

	public void setIsVisibilidadCeldaCancelarProductoOrdenDetaProduMerma(Boolean isVisibilidadCeldaCancelarProductoOrdenDetaProduMerma) {
		this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMerma = isVisibilidadCeldaCancelarProductoOrdenDetaProduMerma;
	}

	public Boolean getIsVisibilidadCeldaGuardarProductoOrdenDetaProduMerma() {
		return isVisibilidadCeldaGuardarProductoOrdenDetaProduMerma;
	}

	public void setIsVisibilidadCeldaGuardarProductoOrdenDetaProduMerma(Boolean isVisibilidadCeldaGuardarProductoOrdenDetaProduMerma) {
		this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMerma = isVisibilidadCeldaGuardarProductoOrdenDetaProduMerma;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMerma() {
		return isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMerma;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMerma(Boolean isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMerma) {
		this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMerma = isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMerma;
	}
		
	public ProductoOrdenDetaProduMermaSessionBean getproductoordendetaprodumermaSessionBean() {
		return this.productoordendetaprodumermaSessionBean;
	}
	
	public void setproductoordendetaprodumermaSessionBean(ProductoOrdenDetaProduMermaSessionBean productoordendetaprodumermaSessionBean) {
		this.productoordendetaprodumermaSessionBean=productoordendetaprodumermaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdOrdenDetaProdu() {
		return this.isVisibilidadFK_IdOrdenDetaProdu;
	}

	public void setisVisibilidadFK_IdOrdenDetaProdu(Boolean isVisibilidadFK_IdOrdenDetaProdu) {
		this.isVisibilidadFK_IdOrdenDetaProdu=isVisibilidadFK_IdOrdenDetaProdu;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMerma(ProductoOrdenDetaProduMerma productoordendetaprodumerma)throws Exception {
		try {
			
				this.setActualParaGuardarOrdenDetaProduForeignKey(productoordendetaprodumerma,null);
				this.setActualParaGuardarTipoMermaEmpresaForeignKey(productoordendetaprodumerma,null);
				this.setActualParaGuardarUnidadForeignKey(productoordendetaprodumerma,null);
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
	
	public void bugActualizarReferenciaActual(ProductoOrdenDetaProduMerma productoordendetaprodumerma,ProductoOrdenDetaProduMerma productoordendetaprodumermaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProductoOrdenDetaProduMerma(productoordendetaprodumerma);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		productoordendetaprodumermaAux.setId(productoordendetaprodumerma.getId());
		productoordendetaprodumermaAux.setVersionRow(productoordendetaprodumerma.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessProductoOrdenDetaProduMerma();
		
			int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMerma.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermas.toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ProductoOrdenDetaProduMermaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMerma(this.productoordendetaprodumerma,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMerma(this.productoordendetaprodumerma);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = productoordendetaprodumermaValidator.getInvalidValues(this.productoordendetaprodumerma);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			productoordendetaprodumermaLogic.setDatosCliente(datosCliente);
			productoordendetaprodumermaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				productoordendetaprodumermaAux=new  ProductoOrdenDetaProduMerma();
				
				productoordendetaprodumermaAux.setIsNew(true);
				productoordendetaprodumermaAux.setIsChanged(true);
				
				productoordendetaprodumermaAux.setProductoOrdenDetaProduMermaOriginal(this.productoordendetaprodumerma);
				
				productoordendetaprodumermaAux.setId(this.productoordendetaprodumerma.getId());	
				productoordendetaprodumermaAux.setVersionRow(this.productoordendetaprodumerma.getVersionRow());	
				productoordendetaprodumermaAux.setid_orden_deta_produ(this.productoordendetaprodumerma.getid_orden_deta_produ());	
				productoordendetaprodumermaAux.setid_tipo_merma_empresa(this.productoordendetaprodumerma.getid_tipo_merma_empresa());	
				productoordendetaprodumermaAux.setid_unidad(this.productoordendetaprodumerma.getid_unidad());	
				productoordendetaprodumermaAux.setcantidad(this.productoordendetaprodumerma.getcantidad());	
				productoordendetaprodumermaAux.setcosto(this.productoordendetaprodumerma.getcosto());	
				productoordendetaprodumermaAux.setcosto_total(this.productoordendetaprodumerma.getcosto_total());	
				productoordendetaprodumermaAux.setdescripcion(this.productoordendetaprodumerma.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productoordendetaprodumermaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(productoordendetaprodumermaAux,productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoordendetaprodumermaAux,productoordendetaprodumermas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.productoordendetaprodumermaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodumermaLogic.saveProductoOrdenDetaProduMermas();//WithConnection
						//productoordendetaprodumermaLogic.getSetVersionRowProductoOrdenDetaProduMermas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.productoordendetaprodumerma,productoordendetaprodumermaAux);
					
					this.refrescarForeignKeysDescripcionesProductoOrdenDetaProduMerma();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoordendetaprodumermaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoordendetaprodumermaLogic.saveProductoOrdenDetaProduMermaRelaciones(productoordendetaprodumermaAux);//WithConnection
								//productoordendetaprodumermaLogic.getSetVersionRowProductoOrdenDetaProduMermas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.productoordendetaprodumerma,productoordendetaprodumermaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.productoordendetaprodumermaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(productoordendetaprodumermaAux,productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(productoordendetaprodumermaAux,productoordendetaprodumermas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.productoordendetaprodumerma,productoordendetaprodumermaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				productoordendetaprodumermaAux=new  ProductoOrdenDetaProduMerma();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado() 
					|| (this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado() && this.productoordendetaprodumerma.getId()>=0)) {
						
					productoordendetaprodumermaAux.setIsNew(false);
				}
				
				productoordendetaprodumermaAux.setIsDeleted(false);
			
				productoordendetaprodumermaAux.setId(this.productoordendetaprodumerma.getId());	
				productoordendetaprodumermaAux.setVersionRow(this.productoordendetaprodumerma.getVersionRow());	
				productoordendetaprodumermaAux.setid_orden_deta_produ(this.productoordendetaprodumerma.getid_orden_deta_produ());	
				productoordendetaprodumermaAux.setid_tipo_merma_empresa(this.productoordendetaprodumerma.getid_tipo_merma_empresa());	
				productoordendetaprodumermaAux.setid_unidad(this.productoordendetaprodumerma.getid_unidad());	
				productoordendetaprodumermaAux.setcantidad(this.productoordendetaprodumerma.getcantidad());	
				productoordendetaprodumermaAux.setcosto(this.productoordendetaprodumerma.getcosto());	
				productoordendetaprodumermaAux.setcosto_total(this.productoordendetaprodumerma.getcosto_total());	
				productoordendetaprodumermaAux.setdescripcion(this.productoordendetaprodumerma.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productoordendetaprodumermaAux,productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoordendetaprodumermaAux,productoordendetaprodumermas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.productoordendetaprodumermaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodumermaLogic.saveProductoOrdenDetaProduMermas();//WithConnection
						//productoordendetaprodumermaLogic.getSetVersionRowProductoOrdenDetaProduMermas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.productoordendetaprodumerma,productoordendetaprodumermaAux);
					
					this.refrescarForeignKeysDescripcionesProductoOrdenDetaProduMerma();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoordendetaprodumermaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoordendetaprodumermaLogic.saveProductoOrdenDetaProduMermaRelaciones(productoordendetaprodumermaAux);//WithConnection
								//productoordendetaprodumermaLogic.getSetVersionRowProductoOrdenDetaProduMermas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.productoordendetaprodumerma,productoordendetaprodumermaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.productoordendetaprodumermaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(productoordendetaprodumermaAux,productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(productoordendetaprodumermaAux,productoordendetaprodumermas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.productoordendetaprodumerma,productoordendetaprodumermaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				productoordendetaprodumermaAux=new  ProductoOrdenDetaProduMerma();
				
				productoordendetaprodumermaAux.setIsNew(false);
				productoordendetaprodumermaAux.setIsChanged(false);
				
				productoordendetaprodumermaAux.setIsDeleted(true);
				
				productoordendetaprodumermaAux.setId(this.productoordendetaprodumerma.getId());	
				productoordendetaprodumermaAux.setVersionRow(this.productoordendetaprodumerma.getVersionRow());	
				productoordendetaprodumermaAux.setid_orden_deta_produ(this.productoordendetaprodumerma.getid_orden_deta_produ());	
				productoordendetaprodumermaAux.setid_tipo_merma_empresa(this.productoordendetaprodumerma.getid_tipo_merma_empresa());	
				productoordendetaprodumermaAux.setid_unidad(this.productoordendetaprodumerma.getid_unidad());	
				productoordendetaprodumermaAux.setcantidad(this.productoordendetaprodumerma.getcantidad());	
				productoordendetaprodumermaAux.setcosto(this.productoordendetaprodumerma.getcosto());	
				productoordendetaprodumermaAux.setcosto_total(this.productoordendetaprodumerma.getcosto_total());	
				productoordendetaprodumermaAux.setdescripcion(this.productoordendetaprodumerma.getdescripcion());	
				
				if(this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.productoordendetaprodumermaAux.getId()>=0) {	
						this.productoordendetaprodumermasEliminados.add(productoordendetaprodumermaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(productoordendetaprodumermaAux,productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoordendetaprodumermaAux,productoordendetaprodumermas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.productoordendetaprodumermaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodumermaLogic.saveProductoOrdenDetaProduMermas();//WithConnection
						//productoordendetaprodumermaLogic.getSetVersionRowProductoOrdenDetaProduMermas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoordendetaprodumermaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoordendetaprodumermaLogic.saveProductoOrdenDetaProduMermaRelaciones(productoordendetaprodumermaAux);//WithConnection
								//productoordendetaprodumermaLogic.getSetVersionRowProductoOrdenDetaProduMermas();//WithConnection
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
							if(this.productoordendetaprodumermaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(productoordendetaprodumermaAux,productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(productoordendetaprodumermaAux,productoordendetaprodumermas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().addAll(this.productoordendetaprodumermasEliminados);
					
					productoordendetaprodumermaLogic.saveProductoOrdenDetaProduMermas();//WithConnection
					//productoordendetaprodumermaLogic.getSetVersionRowProductoOrdenDetaProduMermas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesProductoOrdenDetaProduMerma();
				
				this.productoordendetaprodumermasEliminados= new ArrayList<ProductoOrdenDetaProduMerma>();		
			}
			
			if(this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Orden Merma GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Orden Merma",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.productoordendetaprodumerma=productoordendetaprodumermaAux;
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
      		//this.finishProcessProductoOrdenDetaProduMerma();
      	}
		
	}	
	
	public void actualizarRelaciones(ProductoOrdenDetaProduMerma productoordendetaprodumermaLocal) throws Exception {
		
		if(this.productoordendetaprodumermaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProductoOrdenDetaProduMerma productoordendetaprodumermaLocal) throws Exception {	
		if(this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(OrdenDetaProduDetalleFormJInternalFrame.class)) {
				OrdenDetaProduBeanSwingJInternalFrame ordendetaproduBeanSwingJInternalFrameLocal=(OrdenDetaProduBeanSwingJInternalFrame) ((OrdenDetaProduDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ordendetaproduBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoOrdenDetaProdu(ordendetaproduBeanSwingJInternalFrameLocal.getordendetaprodu(),true);
				ordendetaproduBeanSwingJInternalFrameLocal.actualizarLista(ordendetaproduBeanSwingJInternalFrameLocal.ordendetaprodu,this.ordendetaprodusForeignKey);

				ordendetaproduBeanSwingJInternalFrameLocal.actualizarRelaciones(ordendetaproduBeanSwingJInternalFrameLocal.ordendetaprodu);

				productoordendetaprodumermaLocal.setOrdenDetaProdu(ordendetaproduBeanSwingJInternalFrameLocal.ordendetaprodu);

				this.addItemDefectoCombosForeignKeyOrdenDetaProdu();
				this.cargarCombosFrameOrdenDetaProdusForeignKey("Formulario");
				this.setActualOrdenDetaProduForeignKey(ordendetaproduBeanSwingJInternalFrameLocal.ordendetaprodu.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoMermaEmpresaDetalleFormJInternalFrame.class)) {
				TipoMermaEmpresaBeanSwingJInternalFrame tipomermaempresaBeanSwingJInternalFrameLocal=(TipoMermaEmpresaBeanSwingJInternalFrame) ((TipoMermaEmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipomermaempresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoMermaEmpresa(tipomermaempresaBeanSwingJInternalFrameLocal.gettipomermaempresa(),true);
				tipomermaempresaBeanSwingJInternalFrameLocal.actualizarLista(tipomermaempresaBeanSwingJInternalFrameLocal.tipomermaempresa,this.tipomermaempresasForeignKey);

				tipomermaempresaBeanSwingJInternalFrameLocal.actualizarRelaciones(tipomermaempresaBeanSwingJInternalFrameLocal.tipomermaempresa);

				productoordendetaprodumermaLocal.setTipoMermaEmpresa(tipomermaempresaBeanSwingJInternalFrameLocal.tipomermaempresa);

				this.addItemDefectoCombosForeignKeyTipoMermaEmpresa();
				this.cargarCombosFrameTipoMermaEmpresasForeignKey("Formulario");
				this.setActualTipoMermaEmpresaForeignKey(tipomermaempresaBeanSwingJInternalFrameLocal.tipomermaempresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UnidadDetalleFormJInternalFrame.class)) {
				UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrameLocal=(UnidadBeanSwingJInternalFrame) ((UnidadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				unidadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUnidad(unidadBeanSwingJInternalFrameLocal.getunidad(),true);
				unidadBeanSwingJInternalFrameLocal.actualizarLista(unidadBeanSwingJInternalFrameLocal.unidad,this.unidadsForeignKey);

				unidadBeanSwingJInternalFrameLocal.actualizarRelaciones(unidadBeanSwingJInternalFrameLocal.unidad);

				productoordendetaprodumermaLocal.setUnidad(unidadBeanSwingJInternalFrameLocal.unidad);

				this.addItemDefectoCombosForeignKeyUnidad();
				this.cargarCombosFrameUnidadsForeignKey("Formulario");
				this.setActualUnidadForeignKey(unidadBeanSwingJInternalFrameLocal.unidad.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProductoOrdenDetaProduMermaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMerma.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermas.toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = productoordendetaprodumermaValidator.getInvalidValues(this.productoordendetaprodumerma);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProductoOrdenDetaProduMerma productoordendetaprodumerma,List<ProductoOrdenDetaProduMerma> productoordendetaprodumermas) throws Exception {
		try	{		
			ProductoOrdenDetaProduMermaConstantesFunciones.actualizarLista(productoordendetaprodumerma,productoordendetaprodumermas,this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ProductoOrdenDetaProduMerma productoordendetaprodumerma,List<ProductoOrdenDetaProduMerma> productoordendetaprodumermas) throws Exception {
		try	{			
			ProductoOrdenDetaProduMermaConstantesFunciones.actualizarSelectedLista(productoordendetaprodumerma,productoordendetaprodumermas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProductoOrdenDetaProduMerma> productoordendetaprodumermasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				productoordendetaprodumermasLocal=this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				productoordendetaprodumermasLocal=this.productoordendetaprodumermas;
			}
			//ARCHITECTURE
		
			for(ProductoOrdenDetaProduMerma productoordendetaprodumermaLocal:productoordendetaprodumermasLocal) {
				if(this.permiteMantenimiento(productoordendetaprodumermaLocal) && productoordendetaprodumermaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProductoOrdenDetaProduMermaConstantesFunciones.getProductoOrdenDetaProduMermaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduMermaConstantesFunciones.IDORDENDETAPRODU)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jLabelid_orden_deta_produProductoOrdenDetaProduMerma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduMermaConstantesFunciones.IDTIPOMERMAEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jLabelid_tipo_merma_empresaProductoOrdenDetaProduMerma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduMermaConstantesFunciones.IDUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jLabelid_unidadProductoOrdenDetaProduMerma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduMermaConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jLabelcantidadProductoOrdenDetaProduMerma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduMermaConstantesFunciones.COSTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jLabelcostoProductoOrdenDetaProduMerma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduMermaConstantesFunciones.COSTOTOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jLabelcosto_totalProductoOrdenDetaProduMerma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduMermaConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jLabeldescripcionProductoOrdenDetaProduMerma,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jLabelid_orden_deta_produProductoOrdenDetaProduMerma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jLabelid_tipo_merma_empresaProductoOrdenDetaProduMerma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jLabelid_unidadProductoOrdenDetaProduMerma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jLabelcantidadProductoOrdenDetaProduMerma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jLabelcostoProductoOrdenDetaProduMerma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jLabelcosto_totalProductoOrdenDetaProduMerma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jLabeldescripcionProductoOrdenDetaProduMerma,"");
		
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
		this.iIdNuevoProductoOrdenDetaProduMerma--;	
		
		
		this.productoordendetaprodumermaAux=new ProductoOrdenDetaProduMerma();
		
		this.productoordendetaprodumermaAux.setId(this.iIdNuevoProductoOrdenDetaProduMerma);
		this.productoordendetaprodumermaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().add(this.productoordendetaprodumermaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.productoordendetaprodumermas.add(this.productoordendetaprodumermaAux);
		}
		//ARCHITECTURE
		
		this.productoordendetaprodumerma=this.productoordendetaprodumermaAux;
		
		if(ProductoOrdenDetaProduMermaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProductoOrdenDetaProduMerma(this.productoordendetaprodumerma);
			this.setVariablesObjetoActualToFormularioForeignKeyProductoOrdenDetaProduMerma(this.productoordendetaprodumerma);
		}
				
		//this.setDefaultControlesProductoOrdenDetaProduMerma();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProductoOrdenDetaProduMerma();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProductoOrdenDetaProduMerma();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductoOrdenDetaProduMerma();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductoOrdenDetaProduMerma(this.productoordendetaprodumermaBean,this.productoordendetaprodumerma,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMerma(this.productoordendetaprodumerma);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.productoordendetaprodumermaSessionBean.getConGuardarRelaciones()) {
			classes=ProductoOrdenDetaProduMermaConstantesFunciones.getClassesRelationshipsOfProductoOrdenDetaProduMerma(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.productoordendetaprodumermaReturnGeneral=productoordendetaprodumermaLogic.procesarEventosProductoOrdenDetaProduMermasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas(),this.productoordendetaprodumerma,this.productoordendetaprodumermaParameterGeneral,this.isEsNuevoProductoOrdenDetaProduMerma,classes);//this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMerma()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProductoOrdenDetaProduMerma(this.productoordendetaprodumermaReturnGeneral,this.productoordendetaprodumermaBean,false);
		
		if(this.productoordendetaprodumermaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProductoOrdenDetaProduMerma(this.productoordendetaprodumermaReturnGeneral.getProductoOrdenDetaProduMerma());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProductoOrdenDetaProduMerma(this.productoordendetaprodumermaReturnGeneral.getProductoOrdenDetaProduMerma());
		}
		
		if(this.productoordendetaprodumermaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProductoOrdenDetaProduMerma(this.productoordendetaprodumermaReturnGeneral.getProductoOrdenDetaProduMerma(),classes);//this.productoordendetaprodumermaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMerma(this.productoordendetaprodumerma,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProductoOrdenDetaProduMerma();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProductoOrdenDetaProduMerma();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.RecargarFormProductoOrdenDetaProduMerma(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProductoOrdenDetaProduMerma(false);
						
			if(productoordendetaprodumermaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProductoOrdenDetaProduMermaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoOrdenDetaProduMerma();
			}
			
			this.actualizarVisualTableDatosProductoOrdenDetaProduMerma();
			
			this.jTableDatosProductoOrdenDetaProduMerma.setRowSelectionInterval(this.getIndiceNuevoProductoOrdenDetaProduMerma(), this.getIndiceNuevoProductoOrdenDetaProduMerma());
			
			this.seleccionarFilaTablaProductoOrdenDetaProduMermaActual();
						
			this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduMerma("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProductoOrdenDetaProduMerma(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTextFieldcantidadProductoOrdenDetaProduMerma.setEnabled(isHabilitar && this.productoordendetaprodumermaConstantesFunciones.activarcantidadProductoOrdenDetaProduMerma);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTextFieldcostoProductoOrdenDetaProduMerma.setEnabled(isHabilitar && this.productoordendetaprodumermaConstantesFunciones.activarcostoProductoOrdenDetaProduMerma);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTextFieldcosto_totalProductoOrdenDetaProduMerma.setEnabled(isHabilitar && this.productoordendetaprodumermaConstantesFunciones.activarcosto_totalProductoOrdenDetaProduMerma);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTextAreadescripcionProductoOrdenDetaProduMerma.setEnabled(isHabilitar && this.productoordendetaprodumermaConstantesFunciones.activardescripcionProductoOrdenDetaProduMerma);	
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_orden_deta_produProductoOrdenDetaProduMerma.setEnabled(isHabilitar && this.productoordendetaprodumermaConstantesFunciones.activarid_orden_deta_produProductoOrdenDetaProduMerma);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMerma.setEnabled(isHabilitar && this.productoordendetaprodumermaConstantesFunciones.activarid_tipo_merma_empresaProductoOrdenDetaProduMerma);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_unidadProductoOrdenDetaProduMerma.setEnabled(isHabilitar && this.productoordendetaprodumermaConstantesFunciones.activarid_unidadProductoOrdenDetaProduMerma);
	};
	
	public void setDefaultControlesProductoOrdenDetaProduMerma() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProductoOrdenDetaProduMerma(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.productoordendetaprodumermaSessionBean.setConGuardarRelaciones(true);			
			this.productoordendetaprodumermaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTabbedPaneRelacionesProductoOrdenDetaProduMerma.setVisible(true);
			
					
		} else {
			//this.productoordendetaprodumermaSessionBean.setConGuardarRelaciones(false);			
			this.productoordendetaprodumermaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTabbedPaneRelacionesProductoOrdenDetaProduMerma.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProductoOrdenDetaProduMerma() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoOrdenDetaProduMerma productoordendetaprodumermaAux:this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas()) {
				if(productoordendetaprodumermaAux.getId().equals(this.iIdNuevoProductoOrdenDetaProduMerma)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoOrdenDetaProduMerma productoordendetaprodumermaAux:this.productoordendetaprodumermas) {
				if(productoordendetaprodumermaAux.getId().equals(this.iIdNuevoProductoOrdenDetaProduMerma)) {
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
	
	public int getIndiceActualProductoOrdenDetaProduMerma(ProductoOrdenDetaProduMerma productoordendetaprodumerma,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoOrdenDetaProduMerma productoordendetaprodumermaAux:this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas()) {
				if(productoordendetaprodumermaAux.getId().equals(productoordendetaprodumerma.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoOrdenDetaProduMerma productoordendetaprodumermaAux:this.productoordendetaprodumermas) {
				if(productoordendetaprodumermaAux.getId().equals(productoordendetaprodumerma.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProductoOrdenDetaProduMerma(ProductoOrdenDetaProduMerma productoordendetaprodumermaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoOrdenDetaProduMerma productoordendetaprodumermaAux:this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas()) {
				if(productoordendetaprodumermaAux.getProductoOrdenDetaProduMermaOriginal().getId().equals(productoordendetaprodumermaOriginal.getId())) {
					existe=true;
					productoordendetaprodumermaOriginal.setId(productoordendetaprodumermaAux.getId());
					productoordendetaprodumermaOriginal.setVersionRow(productoordendetaprodumermaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoOrdenDetaProduMerma productoordendetaprodumermaAux:this.productoordendetaprodumermas) {
				if(productoordendetaprodumermaAux.getProductoOrdenDetaProduMermaOriginal().getId().equals(productoordendetaprodumermaOriginal.getId())) {
					existe=true;
					productoordendetaprodumermaOriginal.setId(productoordendetaprodumermaAux.getId());
					productoordendetaprodumermaOriginal.setVersionRow(productoordendetaprodumermaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProductoOrdenDetaProduMerma(Boolean esParaCancelar) throws Exception {
		productoordendetaprodumermasAux=new ArrayList<ProductoOrdenDetaProduMerma>();
		productoordendetaprodumermaAux=new ProductoOrdenDetaProduMerma();
		
		if(!this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductoOrdenDetaProduMerma productoordendetaprodumermaAux:this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas()) {
					if(productoordendetaprodumermaAux.getId()<0) {
						productoordendetaprodumermasAux.add(productoordendetaprodumermaAux);
					}		
				}
				this.iIdNuevoProductoOrdenDetaProduMerma=0L;
				this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().removeAll(productoordendetaprodumermasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoOrdenDetaProduMerma productoordendetaprodumermaAux:this.productoordendetaprodumermas) {
					if(productoordendetaprodumermaAux.getId()<0) {
						productoordendetaprodumermasAux.add(productoordendetaprodumermaAux);
					}		
				}
				this.iIdNuevoProductoOrdenDetaProduMerma=0L;
				this.productoordendetaprodumermas.removeAll(productoordendetaprodumermasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProductoOrdenDetaProduMerma 
					&& this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().size()>0
					) {
					productoordendetaprodumermaAux=this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().get(this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().size() - 1);
				
					if(productoordendetaprodumermaAux.getId()<0) {
						this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().remove(productoordendetaprodumermaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProductoOrdenDetaProduMerma && this.productoordendetaprodumermas.size()>0) {
					productoordendetaprodumermaAux=this.productoordendetaprodumermas.get(this.productoordendetaprodumermas.size() - 1);
				
					if(productoordendetaprodumermaAux.getId()<0) {
						this.productoordendetaprodumermas.remove(productoordendetaprodumermaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProductoOrdenDetaProduMerma(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(productoordendetaprodumerma.getId()<0) {
				this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().remove(this.productoordendetaprodumerma);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(productoordendetaprodumerma.getId()<0) {
				this.productoordendetaprodumermas.remove(this.productoordendetaprodumerma);
			}
		}			
	}
	
	public void setEstadosInicialesProductoOrdenDetaProduMerma(List<ProductoOrdenDetaProduMerma> productoordendetaprodumermasAux) throws Exception {
		ProductoOrdenDetaProduMermaConstantesFunciones.setEstadosInicialesProductoOrdenDetaProduMerma(productoordendetaprodumermasAux);
	}
	
	public void setEstadosInicialesProductoOrdenDetaProduMerma(ProductoOrdenDetaProduMerma productoordendetaprodumermaAux) throws Exception {
		ProductoOrdenDetaProduMermaConstantesFunciones.setEstadosInicialesProductoOrdenDetaProduMerma(productoordendetaprodumermaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProductoOrdenDetaProduMermaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduMerma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProductoOrdenDetaProduMermaActual()) {
				if(!this.isEsNuevoProductoOrdenDetaProduMerma) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduMerma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProductoOrdenDetaProduMerma=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProductoOrdenDetaProduMermaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Orden Merma ?", "MANTENIMIENTO DE Orden Merma", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduMerma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProductoOrdenDetaProduMerma productoordendetaprodumerma) throws Exception {
		ProductoOrdenDetaProduMermaConstantesFunciones.seleccionarAsignar(this.productoordendetaprodumerma,productoordendetaprodumerma);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProductoOrdenDetaProduMerma=this.isPermisoActualizarOriginalProductoOrdenDetaProduMerma;
			
			
			this.seleccionarAsignar(productoordendetaprodumerma);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductoOrdenDetaProduMermaConstantesFunciones.quitarEspaciosProductoOrdenDetaProduMerma(this.productoordendetaprodumerma,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduMerma("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.productoordendetaprodumermaSessionBean.setsFuncionBusquedaRapida(this.productoordendetaprodumermaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProductoOrdenDetaProduMerma) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProductoOrdenDetaProduMerma(esParaCancelar);				
				this.cancelarNuevoProductoOrdenDetaProduMerma(esParaCancelar);								
			}
			
			this.productoordendetaprodumerma=new ProductoOrdenDetaProduMerma();
			
			this.inicializarProductoOrdenDetaProduMerma();
			
			this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduMerma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProductoOrdenDetaProduMerma() throws Exception {
		try {
			ProductoOrdenDetaProduMermaConstantesFunciones.inicializarProductoOrdenDetaProduMerma(this.productoordendetaprodumerma);
			
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
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProductoOrdenDetaProduMermas(String sAccionBusqueda,List<ProductoOrdenDetaProduMerma> productoordendetaprodumermasParaReportes) throws Exception {
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
					sPathReporteFinal="ProductoOrdenDetaProduMerma"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProductoOrdenDetaProduMermaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProductoOrdenDetaProduMermaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProductoOrdenDetaProduMerma"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Orden Mermaes");		
		parameters.put("busquedapor", ProductoOrdenDetaProduMermaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProductoOrdenDetaProduMerma=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProductoOrdenDetaProduMermaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProductoOrdenDetaProduMermaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProductoOrdenDetaProduMerma=new JRBeanArrayDataSource(ProductoOrdenDetaProduMermaJInternalFrame.TraerProductoOrdenDetaProduMermaBeans(productoordendetaprodumermasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProductoOrdenDetaProduMerma);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProductoOrdenDetaProduMermaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProductoOrdenDetaProduMermaBean.TraerProductoOrdenDetaProduMermaBeans(productoordendetaprodumermasParaReportes).toArray()));
							
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
				this.generarExcelReporteProductoOrdenDetaProduMermas(sAccionBusqueda,sTipoArchivoReporte,productoordendetaprodumermasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProductoOrdenDetaProduMermas(sAccionBusqueda,sTipoArchivoReporte,productoordendetaprodumermasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduMermaActionPerformed(null);
					//this.generarExcelReporteProductoOrdenDetaProduMermas(sAccionBusqueda,sTipoArchivoReporte,productoordendetaprodumermasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProductoOrdenDetaProduMermas(sAccionBusqueda,sTipoArchivoReporte,productoordendetaprodumermasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProductoOrdenDetaProduMermas(sAccionBusqueda,sTipoArchivoReporte,productoordendetaprodumermasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProductoOrdenDetaProduMermas(sAccionBusqueda,sTipoArchivoReporte,productoordendetaprodumermasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProductoOrdenDetaProduMermas(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoOrdenDetaProduMerma> productoordendetaprodumermasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoordendetaprodumerma";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoOrdenDetaProduMermas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductoOrdenDetaProduMerma("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProductoOrdenDetaProduMerma productoordendetaprodumerma : productoordendetaprodumermasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProductoOrdenDetaProduMermaConstantesFunciones.generarExcelReporteDataProductoOrdenDetaProduMerma("NORMAL",row,workbook,productoordendetaprodumerma,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden Merma",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProductoOrdenDetaProduMerma(String sTipo,Row row,Workbook workbook) {
		
		ProductoOrdenDetaProduMermaConstantesFunciones.generarExcelReporteHeaderProductoOrdenDetaProduMerma(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProductoOrdenDetaProduMermas(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoOrdenDetaProduMerma> productoordendetaprodumermasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoordendetaprodumerma_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoOrdenDetaProduMermas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProductoOrdenDetaProduMerma productoordendetaprodumerma : productoordendetaprodumermasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProductoOrdenDetaProduMermaConstantesFunciones.getProductoOrdenDetaProduMermaDescripcion(productoordendetaprodumerma));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDORDENDETAPRODU))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDORDENDETAPRODU);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodumerma.getordendetaprodu_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDTIPOMERMAEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDTIPOMERMAEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodumerma.gettipomermaempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodumerma.getunidad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodumerma.getcantidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_COSTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_COSTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodumerma.getcosto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_COSTOTOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_COSTOTOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodumerma.getcosto_total());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodumerma.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden Merma",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProductoOrdenDetaProduMermas(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoOrdenDetaProduMerma> productoordendetaprodumermasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProductoOrdenDetaProduMerma> productoordendetaprodumermasRespaldo=null;
		
		classes=ProductoOrdenDetaProduMermaConstantesFunciones.getClassesRelationshipsOfProductoOrdenDetaProduMerma(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.productoordendetaprodumermaLogic.setDatosCliente(this.datosCliente);
		this.productoordendetaprodumermaLogic.setDatosDeep(this.datosDeep);
		this.productoordendetaprodumermaLogic.setIsConDeep(true);
		
		productoordendetaprodumermasRespaldo=this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas();
		
		this.productoordendetaprodumermaLogic.setProductoOrdenDetaProduMermas(productoordendetaprodumermasParaReportes);	
		this.productoordendetaprodumermaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		productoordendetaprodumermasParaReportes=this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas();
		this.productoordendetaprodumermaLogic.setProductoOrdenDetaProduMermas(productoordendetaprodumermasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoordendetaprodumerma_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoOrdenDetaProduMermas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductoOrdenDetaProduMerma("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProductoOrdenDetaProduMerma productoordendetaprodumerma : productoordendetaprodumermasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProductoOrdenDetaProduMerma("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProductoOrdenDetaProduMermaConstantesFunciones.generarExcelReporteDataProductoOrdenDetaProduMerma("NORMAL",row,workbook,productoordendetaprodumerma,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProductoOrdenDetaProduMermaConstantesFunciones.getProductoOrdenDetaProduMermaDescripcion(productoordendetaprodumerma));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden Merma",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProductoOrdenDetaProduMerma() throws Exception {		
		this.startProcessProductoOrdenDetaProduMerma(true);
	}
	
	public void startProcessProductoOrdenDetaProduMerma(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma ,this.jPanelParametrosReportesProductoOrdenDetaProduMerma, this.jScrollPanelDatosProductoOrdenDetaProduMerma,this.jPanelPaginacionProductoOrdenDetaProduMerma, this.jScrollPanelDatosEdicionProductoOrdenDetaProduMerma, this.jPanelAccionesProductoOrdenDetaProduMerma,this.jPanelAccionesFormularioProductoOrdenDetaProduMerma,this.jmenuBarProductoOrdenDetaProduMerma,this.jmenuBarDetalleProductoOrdenDetaProduMerma,this.jTtoolBarProductoOrdenDetaProduMerma,this.jTtoolBarDetalleProductoOrdenDetaProduMerma);		
		
		final JTabbedPane jTabbedPaneBusquedasProductoOrdenDetaProduMerma=this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma; 
		
		final JPanel jPanelParametrosReportesProductoOrdenDetaProduMerma=this.jPanelParametrosReportesProductoOrdenDetaProduMerma;
		//final JScrollPane jScrollPanelDatosProductoOrdenDetaProduMerma=this.jScrollPanelDatosProductoOrdenDetaProduMerma;
		final JTable jTableDatosProductoOrdenDetaProduMerma=this.jTableDatosProductoOrdenDetaProduMerma;		
		final JPanel jPanelPaginacionProductoOrdenDetaProduMerma=this.jPanelPaginacionProductoOrdenDetaProduMerma;
		//final JScrollPane jScrollPanelDatosEdicionProductoOrdenDetaProduMerma=this.jScrollPanelDatosEdicionProductoOrdenDetaProduMerma;
		final JPanel jPanelAccionesProductoOrdenDetaProduMerma=this.jPanelAccionesProductoOrdenDetaProduMerma;
		
		JPanel jPanelCamposAuxiliarProductoOrdenDetaProduMerma=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProductoOrdenDetaProduMerma=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) {
			jPanelCamposAuxiliarProductoOrdenDetaProduMerma=this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jPanelCamposProductoOrdenDetaProduMerma;
			jPanelAccionesFormularioAuxiliarProductoOrdenDetaProduMerma=this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jPanelAccionesFormularioProductoOrdenDetaProduMerma;
		}
		
		final JPanel jPanelCamposProductoOrdenDetaProduMerma=jPanelCamposAuxiliarProductoOrdenDetaProduMerma;
		final JPanel jPanelAccionesFormularioProductoOrdenDetaProduMerma=jPanelAccionesFormularioAuxiliarProductoOrdenDetaProduMerma;
		
		
		final JMenuBar jmenuBarProductoOrdenDetaProduMerma=this.jmenuBarProductoOrdenDetaProduMerma;
		final JToolBar jTtoolBarProductoOrdenDetaProduMerma=this.jTtoolBarProductoOrdenDetaProduMerma;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProductoOrdenDetaProduMerma=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductoOrdenDetaProduMerma=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) {
			jmenuBarDetalleAuxiliarProductoOrdenDetaProduMerma=this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jmenuBarDetalleProductoOrdenDetaProduMerma;
			jTtoolBarDetalleAuxiliarProductoOrdenDetaProduMerma=this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTtoolBarDetalleProductoOrdenDetaProduMerma;
		}
		
		final JMenuBar jmenuBarDetalleProductoOrdenDetaProduMerma=jmenuBarDetalleAuxiliarProductoOrdenDetaProduMerma;
		final JToolBar jTtoolBarDetalleProductoOrdenDetaProduMerma=jTtoolBarDetalleAuxiliarProductoOrdenDetaProduMerma;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductoOrdenDetaProduMerma;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductoOrdenDetaProduMerma;
			processRunnable.jTableDatos=jTableDatosProductoOrdenDetaProduMerma;
			processRunnable.jPanelCampos=jPanelCamposProductoOrdenDetaProduMerma;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductoOrdenDetaProduMerma;
			processRunnable.jPanelAcciones=jPanelAccionesProductoOrdenDetaProduMerma;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductoOrdenDetaProduMerma;
			
			
			processRunnable.jmenuBar=jmenuBarProductoOrdenDetaProduMerma;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductoOrdenDetaProduMerma;
			processRunnable.jTtoolBar=jTtoolBarProductoOrdenDetaProduMerma;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductoOrdenDetaProduMerma;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductoOrdenDetaProduMerma ,jPanelParametrosReportesProductoOrdenDetaProduMerma,jTableDatosProductoOrdenDetaProduMerma, /*jScrollPanelDatosProductoOrdenDetaProduMerma,*/jPanelCamposProductoOrdenDetaProduMerma,jPanelPaginacionProductoOrdenDetaProduMerma, /*jScrollPanelDatosEdicionProductoOrdenDetaProduMerma,*/ jPanelAccionesProductoOrdenDetaProduMerma,jPanelAccionesFormularioProductoOrdenDetaProduMerma,jmenuBarProductoOrdenDetaProduMerma,jmenuBarDetalleProductoOrdenDetaProduMerma,jTtoolBarProductoOrdenDetaProduMerma,jTtoolBarDetalleProductoOrdenDetaProduMerma);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductoOrdenDetaProduMerma ,jPanelParametrosReportesProductoOrdenDetaProduMerma, jScrollPanelDatosProductoOrdenDetaProduMerma,jPanelPaginacionProductoOrdenDetaProduMerma, jScrollPanelDatosEdicionProductoOrdenDetaProduMerma, jPanelAccionesProductoOrdenDetaProduMerma,jPanelAccionesFormularioProductoOrdenDetaProduMerma,jmenuBarProductoOrdenDetaProduMerma,jmenuBarDetalleProductoOrdenDetaProduMerma,jTtoolBarProductoOrdenDetaProduMerma,jTtoolBarDetalleProductoOrdenDetaProduMerma);
						
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
	
	public void finishProcessProductoOrdenDetaProduMerma() {// throws Exception 
		this.finishProcessProductoOrdenDetaProduMerma(true);
	}
	
	public void finishProcessProductoOrdenDetaProduMerma(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma ,this.jPanelParametrosReportesProductoOrdenDetaProduMerma, this.jScrollPanelDatosProductoOrdenDetaProduMerma,this.jPanelPaginacionProductoOrdenDetaProduMerma, this.jScrollPanelDatosEdicionProductoOrdenDetaProduMerma, this.jPanelAccionesProductoOrdenDetaProduMerma,this.jPanelAccionesFormularioProductoOrdenDetaProduMerma,this.jmenuBarProductoOrdenDetaProduMerma,this.jmenuBarDetalleProductoOrdenDetaProduMerma,this.jTtoolBarProductoOrdenDetaProduMerma,this.jTtoolBarDetalleProductoOrdenDetaProduMerma);		
		
		final JTabbedPane jTabbedPaneBusquedasProductoOrdenDetaProduMerma=this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma; 
		
		final JPanel jPanelParametrosReportesProductoOrdenDetaProduMerma=this.jPanelParametrosReportesProductoOrdenDetaProduMerma;
		//final JScrollPane jScrollPanelDatosProductoOrdenDetaProduMerma=this.jScrollPanelDatosProductoOrdenDetaProduMerma;
		final JTable jTableDatosProductoOrdenDetaProduMerma=this.jTableDatosProductoOrdenDetaProduMerma;		
		final JPanel jPanelPaginacionProductoOrdenDetaProduMerma=this.jPanelPaginacionProductoOrdenDetaProduMerma;
		//final JScrollPane jScrollPanelDatosEdicionProductoOrdenDetaProduMerma=this.jScrollPanelDatosEdicionProductoOrdenDetaProduMerma;
		final JPanel jPanelAccionesProductoOrdenDetaProduMerma=this.jPanelAccionesProductoOrdenDetaProduMerma;
		
		JPanel jPanelCamposAuxiliarProductoOrdenDetaProduMerma=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProductoOrdenDetaProduMerma=new JPanel();
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) {
			jPanelCamposAuxiliarProductoOrdenDetaProduMerma=this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jPanelCamposProductoOrdenDetaProduMerma;
			jPanelAccionesFormularioAuxiliarProductoOrdenDetaProduMerma=this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jPanelAccionesFormularioProductoOrdenDetaProduMerma;
		}
		
		final JPanel jPanelCamposProductoOrdenDetaProduMerma=jPanelCamposAuxiliarProductoOrdenDetaProduMerma;
		final JPanel jPanelAccionesFormularioProductoOrdenDetaProduMerma=jPanelAccionesFormularioAuxiliarProductoOrdenDetaProduMerma;
		
		
		final JMenuBar jmenuBarProductoOrdenDetaProduMerma=this.jmenuBarProductoOrdenDetaProduMerma;		
		final JToolBar jTtoolBarProductoOrdenDetaProduMerma=this.jTtoolBarProductoOrdenDetaProduMerma;
				
		JMenuBar jmenuBarDetalleAuxiliarProductoOrdenDetaProduMerma=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductoOrdenDetaProduMerma=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) {
			jmenuBarDetalleAuxiliarProductoOrdenDetaProduMerma=this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jmenuBarDetalleProductoOrdenDetaProduMerma;
			jTtoolBarDetalleAuxiliarProductoOrdenDetaProduMerma=this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTtoolBarDetalleProductoOrdenDetaProduMerma;		
		}
		
		final JMenuBar jmenuBarDetalleProductoOrdenDetaProduMerma=jmenuBarDetalleAuxiliarProductoOrdenDetaProduMerma;
		final JToolBar jTtoolBarDetalleProductoOrdenDetaProduMerma=jTtoolBarDetalleAuxiliarProductoOrdenDetaProduMerma;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductoOrdenDetaProduMerma;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductoOrdenDetaProduMerma;
			processRunnable.jTableDatos=jTableDatosProductoOrdenDetaProduMerma;
			processRunnable.jPanelCampos=jPanelCamposProductoOrdenDetaProduMerma;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductoOrdenDetaProduMerma;
			processRunnable.jPanelAcciones=jPanelAccionesProductoOrdenDetaProduMerma;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductoOrdenDetaProduMerma;
			
			
			processRunnable.jmenuBar=jmenuBarProductoOrdenDetaProduMerma;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductoOrdenDetaProduMerma;
			processRunnable.jTtoolBar=jTtoolBarProductoOrdenDetaProduMerma;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductoOrdenDetaProduMerma;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProductoOrdenDetaProduMerma ,jPanelParametrosReportesProductoOrdenDetaProduMerma, jTableDatosProductoOrdenDetaProduMerma,/*jScrollPanelDatosProductoOrdenDetaProduMerma,*/jPanelCamposProductoOrdenDetaProduMerma,jPanelPaginacionProductoOrdenDetaProduMerma, /*jScrollPanelDatosEdicionProductoOrdenDetaProduMerma,*/ jPanelAccionesProductoOrdenDetaProduMerma,jPanelAccionesFormularioProductoOrdenDetaProduMerma,jmenuBarProductoOrdenDetaProduMerma,jmenuBarDetalleProductoOrdenDetaProduMerma,jTtoolBarProductoOrdenDetaProduMerma,jTtoolBarDetalleProductoOrdenDetaProduMerma));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProductoOrdenDetaProduMerma(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProductoOrdenDetaProduMerma(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProductoOrdenDetaProduMerma(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProductoOrdenDetaProduMerma(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProductoOrdenDetaProduMerma,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProductoOrdenDetaProduMerma,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProductoOrdenDetaProduMerma(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProductoOrdenDetaProduMerma,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProductoOrdenDetaProduMerma,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.productoordendetaprodumermaConstantesFunciones.getsFinalQueryProductoOrdenDetaProduMerma();
		String  finalQueryPaginacionTodos=this.productoordendetaprodumermaConstantesFunciones.getsFinalQueryProductoOrdenDetaProduMerma();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProductoOrdenDetaProduMermaConstantesFunciones.getArrayColumnasGlobalesNoProductoOrdenDetaProduMerma(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProductoOrdenDetaProduMermaConstantesFunciones.getArrayColumnasGlobalesProductoOrdenDetaProduMerma(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProductoOrdenDetaProduMermaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.productoordendetaprodumermasEliminados= new ArrayList<ProductoOrdenDetaProduMerma>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProductoOrdenDetaProduMerma();
		
				///*ProductoOrdenDetaProduMermaSessionBean*/this.productoordendetaprodumermaSessionBean=new ProductoOrdenDetaProduMermaSessionBean();
			
			if(this.productoordendetaprodumermaSessionBean==null) {
				this.productoordendetaprodumermaSessionBean=new ProductoOrdenDetaProduMermaSessionBean();
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
					this.iNumeroPaginacion=ProductoOrdenDetaProduMermaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProductoOrdenDetaProduMermaConstantesFunciones.getClassesForeignKeysOfProductoOrdenDetaProduMerma(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/productoordendetaprodumerma."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			productoordendetaprodumermasAux= new ArrayList<ProductoOrdenDetaProduMerma>();
			
				
			productoordendetaprodumermaLogic.setDatosCliente(this.datosCliente);
			productoordendetaprodumermaLogic.setDatosDeep(this.datosDeep);
			productoordendetaprodumermaLogic.setIsConDeep(true);
			
			
			productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					productoordendetaprodumermaLogic.getTodosProductoOrdenDetaProduMermas(finalQueryGlobal,pagination);
					
					//productoordendetaprodumermaLogic.getTodosProductoOrdenDetaProduMermasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas()==null|| productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoordendetaprodumermasAux= new ArrayList<ProductoOrdenDetaProduMerma>();
							productoordendetaprodumermasAux.addAll(productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodumermasAux= new ArrayList<ProductoOrdenDetaProduMerma>();
							productoordendetaprodumermasAux.addAll(productoordendetaprodumermas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoordendetaprodumermaLogic.getTodosProductoOrdenDetaProduMermas(finalQueryGlobal+"",this.pagination);												
							
							//productoordendetaprodumermaLogic.getTodosProductoOrdenDetaProduMermasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteProductoOrdenDetaProduMermas("Todos",productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoordendetaprodumermaLogic.setProductoOrdenDetaProduMermas(new ArrayList<ProductoOrdenDetaProduMerma>());					
							productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().addAll(productoordendetaprodumermasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodumermas=new ArrayList<ProductoOrdenDetaProduMerma>();
							productoordendetaprodumermas.addAll(productoordendetaprodumermasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idProductoOrdenDetaProduMerma=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idProductoOrdenDetaProduMerma=this.idActual;
				
				} else if(this.idProductoOrdenDetaProduMermaActual!=null && this.idProductoOrdenDetaProduMermaActual!=0L) {
					idProductoOrdenDetaProduMerma=idProductoOrdenDetaProduMermaActual;
				}
				
					
				this.sDetalleReporte=ProductoOrdenDetaProduMermaConstantesFunciones.getDetalleIndicePorId(idProductoOrdenDetaProduMerma);
				
				this.productoordendetaprodumermas=new ArrayList<ProductoOrdenDetaProduMerma>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					productoordendetaprodumermaLogic.getEntity(idProductoOrdenDetaProduMerma);
					
					//productoordendetaprodumermaLogic.getEntityWithConnection(idProductoOrdenDetaProduMerma);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoordendetaprodumermaLogic.setProductoOrdenDetaProduMermas(new ArrayList<ProductoOrdenDetaProduMerma>());
					productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().add(productoordendetaprodumermaLogic.getProductoOrdenDetaProduMerma());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoordendetaprodumermas=new ArrayList<ProductoOrdenDetaProduMerma>();
					this.productoordendetaprodumermas.add(productoordendetaprodumerma);
				}
				
				if(productoordendetaprodumermaLogic.getProductoOrdenDetaProduMerma()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdOrdenDetaProdu")) {
				this.sDetalleReporte=ProductoOrdenDetaProduMermaConstantesFunciones.getDetalleIndiceFK_IdOrdenDetaProdu(id_orden_deta_produFK_IdOrdenDetaProdu);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermasFK_IdOrdenDetaProdu(finalQueryGlobal,pagination,id_orden_deta_produFK_IdOrdenDetaProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduMermaConstantesFunciones.getDetalleIndiceFK_IdOrdenDetaProdu(id_orden_deta_produFK_IdOrdenDetaProdu);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduMermaConstantesFunciones.getDetalleIndiceFK_IdOrdenDetaProdu(id_orden_deta_produFK_IdOrdenDetaProdu);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas()==null||productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoordendetaprodumermas==null|| productoordendetaprodumermas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodumermasAux=new ArrayList<ProductoOrdenDetaProduMerma>();
						productoordendetaprodumermasAux.addAll(productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodumermasAux=new ArrayList<ProductoOrdenDetaProduMerma>();
							productoordendetaprodumermasAux.addAll(productoordendetaprodumermas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermasFK_IdOrdenDetaProdu(finalQueryGlobal,pagination,id_orden_deta_produFK_IdOrdenDetaProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduMermaConstantesFunciones.getDetalleIndiceFK_IdOrdenDetaProdu(id_orden_deta_produFK_IdOrdenDetaProdu);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduMermaConstantesFunciones.getDetalleIndiceFK_IdOrdenDetaProdu(id_orden_deta_produFK_IdOrdenDetaProdu);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoOrdenDetaProduMermas("FK_IdOrdenDetaProdu",productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoOrdenDetaProduMermas("FK_IdOrdenDetaProdu",productoordendetaprodumermas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodumermaLogic.setProductoOrdenDetaProduMermas(new ArrayList<ProductoOrdenDetaProduMerma>());
						productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().addAll(productoordendetaprodumermasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodumermas=new ArrayList<ProductoOrdenDetaProduMerma>();
							productoordendetaprodumermas.addAll(productoordendetaprodumermasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoMermaEmpresa")) {
				this.sDetalleReporte=ProductoOrdenDetaProduMermaConstantesFunciones.getDetalleIndiceFK_IdTipoMermaEmpresa(id_tipo_merma_empresaFK_IdTipoMermaEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermasFK_IdTipoMermaEmpresa(finalQueryGlobal,pagination,id_tipo_merma_empresaFK_IdTipoMermaEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduMermaConstantesFunciones.getDetalleIndiceFK_IdTipoMermaEmpresa(id_tipo_merma_empresaFK_IdTipoMermaEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduMermaConstantesFunciones.getDetalleIndiceFK_IdTipoMermaEmpresa(id_tipo_merma_empresaFK_IdTipoMermaEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas()==null||productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoordendetaprodumermas==null|| productoordendetaprodumermas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodumermasAux=new ArrayList<ProductoOrdenDetaProduMerma>();
						productoordendetaprodumermasAux.addAll(productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodumermasAux=new ArrayList<ProductoOrdenDetaProduMerma>();
							productoordendetaprodumermasAux.addAll(productoordendetaprodumermas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermasFK_IdTipoMermaEmpresa(finalQueryGlobal,pagination,id_tipo_merma_empresaFK_IdTipoMermaEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduMermaConstantesFunciones.getDetalleIndiceFK_IdTipoMermaEmpresa(id_tipo_merma_empresaFK_IdTipoMermaEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduMermaConstantesFunciones.getDetalleIndiceFK_IdTipoMermaEmpresa(id_tipo_merma_empresaFK_IdTipoMermaEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoOrdenDetaProduMermas("FK_IdTipoMermaEmpresa",productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoOrdenDetaProduMermas("FK_IdTipoMermaEmpresa",productoordendetaprodumermas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodumermaLogic.setProductoOrdenDetaProduMermas(new ArrayList<ProductoOrdenDetaProduMerma>());
						productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().addAll(productoordendetaprodumermasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodumermas=new ArrayList<ProductoOrdenDetaProduMerma>();
							productoordendetaprodumermas.addAll(productoordendetaprodumermasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUnidad")) {
				this.sDetalleReporte=ProductoOrdenDetaProduMermaConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermasFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduMermaConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduMermaConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas()==null||productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoordendetaprodumermas==null|| productoordendetaprodumermas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodumermasAux=new ArrayList<ProductoOrdenDetaProduMerma>();
						productoordendetaprodumermasAux.addAll(productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodumermasAux=new ArrayList<ProductoOrdenDetaProduMerma>();
							productoordendetaprodumermasAux.addAll(productoordendetaprodumermas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermasFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduMermaConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduMermaConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoOrdenDetaProduMermas("FK_IdUnidad",productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoOrdenDetaProduMermas("FK_IdUnidad",productoordendetaprodumermas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodumermaLogic.setProductoOrdenDetaProduMermas(new ArrayList<ProductoOrdenDetaProduMerma>());
						productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().addAll(productoordendetaprodumermasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodumermas=new ArrayList<ProductoOrdenDetaProduMerma>();
							productoordendetaprodumermas.addAll(productoordendetaprodumermasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProductoOrdenDetaProduMerma();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProductoOrdenDetaProduMerma();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoordendetaprodumermas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoordendetaprodumermas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProductoOrdenDetaProduMerma productoordendetaprodumerma) {
		Boolean permite=true;
		
		if(this.productoordendetaprodumerma.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProductoOrdenDetaProduMermaConstantesFunciones.getOrderByListaProductoOrdenDetaProduMerma();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProductoOrdenDetaProduMermaConstantesFunciones.getOrderByListaProductoOrdenDetaProduMerma();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoOrdenDetaProduMerma productoordendetaprodumerma:productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas()) {
				if(productoordendetaprodumerma.getsType().equals(Constantes2.S_TOTALES)) {
					productoordendetaprodumermaTotales=productoordendetaprodumerma;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoOrdenDetaProduMerma productoordendetaprodumerma:this.productoordendetaprodumermas) {
				if(productoordendetaprodumerma.getsType().equals(Constantes2.S_TOTALES)) {
					productoordendetaprodumermaTotales=productoordendetaprodumerma;
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
			this.productoordendetaprodumermaAux=new ProductoOrdenDetaProduMerma();
			this.productoordendetaprodumermaAux.setsType(Constantes2.S_TOTALES);
			this.productoordendetaprodumermaAux.setIsNew(false);
			this.productoordendetaprodumermaAux.setIsChanged(false);
			this.productoordendetaprodumermaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ProductoOrdenDetaProduMermaConstantesFunciones.TotalizarValoresFilaProductoOrdenDetaProduMerma(this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas(),this.productoordendetaprodumermaAux);
				
				this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().add(this.productoordendetaprodumermaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProductoOrdenDetaProduMermaConstantesFunciones.TotalizarValoresFilaProductoOrdenDetaProduMerma(this.productoordendetaprodumermas,this.productoordendetaprodumermaAux);
				
				this.productoordendetaprodumermas.add(this.productoordendetaprodumermaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		productoordendetaprodumermaTotales=new ProductoOrdenDetaProduMerma();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().remove(productoordendetaprodumermaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productoordendetaprodumermas.remove(productoordendetaprodumermaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		productoordendetaprodumermaTotales=new ProductoOrdenDetaProduMerma();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoOrdenDetaProduMerma productoordendetaprodumerma:productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas()) {
				if(productoordendetaprodumerma.getsType().equals(Constantes2.S_TOTALES)) {
					productoordendetaprodumermaTotales=productoordendetaprodumerma;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductoOrdenDetaProduMermaConstantesFunciones.TotalizarValoresFilaProductoOrdenDetaProduMerma(this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas(),productoordendetaprodumermaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoOrdenDetaProduMerma productoordendetaprodumerma:this.productoordendetaprodumermas) {
				if(productoordendetaprodumerma.getsType().equals(Constantes2.S_TOTALES)) {
					productoordendetaprodumermaTotales=productoordendetaprodumerma;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductoOrdenDetaProduMermaConstantesFunciones.TotalizarValoresFilaProductoOrdenDetaProduMerma(this.productoordendetaprodumermas,productoordendetaprodumermaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProductoOrdenDetaProduMermasFK_IdOrdenDetaProdu()throws Exception {
		try {
			sAccionBusqueda="FK_IdOrdenDetaProdu";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoOrdenDetaProduMermasFK_IdTipoMermaEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoMermaEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoOrdenDetaProduMermasFK_IdUnidad()throws Exception {
		try {
			sAccionBusqueda="FK_IdUnidad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProductoOrdenDetaProduMermasFK_IdOrdenDetaProdu(String sFinalQuery,Long id_orden_deta_produ)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermasFK_IdOrdenDetaProdu(sFinalQuery,this.pagination,id_orden_deta_produ);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoOrdenDetaProduMermasFK_IdTipoMermaEmpresa(String sFinalQuery,Long id_tipo_merma_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermasFK_IdTipoMermaEmpresa(sFinalQuery,this.pagination,id_tipo_merma_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoOrdenDetaProduMermasFK_IdUnidad(String sFinalQuery,Long id_unidad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermasFK_IdUnidad(sFinalQuery,this.pagination,id_unidad);
				
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
	
	public void inicializarPermisosProductoOrdenDetaProduMerma() {
		this.isPermisoTodoProductoOrdenDetaProduMerma=false;
		this.isPermisoNuevoProductoOrdenDetaProduMerma=false;
		this.isPermisoActualizarProductoOrdenDetaProduMerma=false;
		this.isPermisoActualizarOriginalProductoOrdenDetaProduMerma=false;
		this.isPermisoEliminarProductoOrdenDetaProduMerma=false;
		this.isPermisoGuardarCambiosProductoOrdenDetaProduMerma=false;
		this.isPermisoConsultaProductoOrdenDetaProduMerma=false;
		this.isPermisoBusquedaProductoOrdenDetaProduMerma=false;
		this.isPermisoReporteProductoOrdenDetaProduMerma=false;		
		this.isPermisoOrdenProductoOrdenDetaProduMerma=false;		
		this.isPermisoPaginacionMedioProductoOrdenDetaProduMerma=false;		
		this.isPermisoPaginacionAltoProductoOrdenDetaProduMerma=false;
		this.isPermisoPaginacionTodoProductoOrdenDetaProduMerma=false;
		this.isPermisoCopiarProductoOrdenDetaProduMerma=false;		
		this.isPermisoVerFormProductoOrdenDetaProduMerma=false;		
		this.isPermisoDuplicarProductoOrdenDetaProduMerma=false;		
		this.isPermisoOrdenProductoOrdenDetaProduMerma=false;		
	}
	
	public void setPermisosUsuarioProductoOrdenDetaProduMerma(Boolean isPermiso) {
		this.isPermisoTodoProductoOrdenDetaProduMerma=isPermiso;
		this.isPermisoNuevoProductoOrdenDetaProduMerma=isPermiso;
		this.isPermisoActualizarProductoOrdenDetaProduMerma=isPermiso;
		this.isPermisoActualizarOriginalProductoOrdenDetaProduMerma=isPermiso;
		this.isPermisoEliminarProductoOrdenDetaProduMerma=isPermiso;
		this.isPermisoGuardarCambiosProductoOrdenDetaProduMerma=isPermiso;
		this.isPermisoConsultaProductoOrdenDetaProduMerma=isPermiso;
		this.isPermisoBusquedaProductoOrdenDetaProduMerma=isPermiso;
		this.isPermisoReporteProductoOrdenDetaProduMerma=isPermiso;
		this.isPermisoOrdenProductoOrdenDetaProduMerma=isPermiso;		
		this.isPermisoPaginacionMedioProductoOrdenDetaProduMerma=isPermiso;		
		this.isPermisoPaginacionAltoProductoOrdenDetaProduMerma=isPermiso;		
		this.isPermisoPaginacionTodoProductoOrdenDetaProduMerma=isPermiso;		
		this.isPermisoCopiarProductoOrdenDetaProduMerma=isPermiso;		
		this.isPermisoVerFormProductoOrdenDetaProduMerma=isPermiso;		
		this.isPermisoDuplicarProductoOrdenDetaProduMerma=isPermiso;
		this.isPermisoOrdenProductoOrdenDetaProduMerma=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProductoOrdenDetaProduMerma(Boolean isPermiso) {
		//this.isPermisoTodoProductoOrdenDetaProduMerma=isPermiso;
		this.isPermisoNuevoProductoOrdenDetaProduMerma=isPermiso;
		this.isPermisoActualizarProductoOrdenDetaProduMerma=isPermiso;
		this.isPermisoActualizarOriginalProductoOrdenDetaProduMerma=isPermiso;
		this.isPermisoEliminarProductoOrdenDetaProduMerma=isPermiso;
		this.isPermisoGuardarCambiosProductoOrdenDetaProduMerma=isPermiso;
		//this.isPermisoConsultaProductoOrdenDetaProduMerma=isPermiso;
		//this.isPermisoBusquedaProductoOrdenDetaProduMerma=isPermiso;
		//this.isPermisoReporteProductoOrdenDetaProduMerma=isPermiso;
		//this.isPermisoOrdenProductoOrdenDetaProduMerma=isPermiso;		
		//this.isPermisoPaginacionMedioProductoOrdenDetaProduMerma=isPermiso;		
		//this.isPermisoPaginacionAltoProductoOrdenDetaProduMerma=isPermiso;		
		//this.isPermisoPaginacionTodoProductoOrdenDetaProduMerma=isPermiso;		
		//this.isPermisoCopiarProductoOrdenDetaProduMerma=isPermiso;		
		//this.isPermisoDuplicarProductoOrdenDetaProduMerma=isPermiso;
		//this.isPermisoOrdenProductoOrdenDetaProduMerma=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProductoOrdenDetaProduMermaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProductoOrdenDetaProduMermaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProductoOrdenDetaProduMerma(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProductoOrdenDetaProduMermaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProductoOrdenDetaProduMermaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProductoOrdenDetaProduMermaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProductoOrdenDetaProduMermaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProductoOrdenDetaProduMerma() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProductoOrdenDetaProduMermaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProductoOrdenDetaProduMermaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProductoOrdenDetaProduMerma=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProductoOrdenDetaProduMerma=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProductoOrdenDetaProduMerma=this.isPermisoActualizarProductoOrdenDetaProduMerma;
			this.isPermisoEliminarProductoOrdenDetaProduMerma=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProductoOrdenDetaProduMerma=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProductoOrdenDetaProduMerma=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProductoOrdenDetaProduMerma=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProductoOrdenDetaProduMerma=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProductoOrdenDetaProduMerma=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductoOrdenDetaProduMerma=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProductoOrdenDetaProduMerma=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProductoOrdenDetaProduMerma=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProductoOrdenDetaProduMerma=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProductoOrdenDetaProduMerma=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProductoOrdenDetaProduMerma=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProductoOrdenDetaProduMerma=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductoOrdenDetaProduMerma=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProductoOrdenDetaProduMerma.setToolTipText(this.jTableDatosProductoOrdenDetaProduMerma.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProductoOrdenDetaProduMerma(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProductoOrdenDetaProduMerma(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProductoOrdenDetaProduMermaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProductoOrdenDetaProduMermaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProductoOrdenDetaProduMerma() throws Exception {
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
	public void inicializarCombosForeignKeyProductoOrdenDetaProduMermaListas()throws Exception {
		try	{						
			
				this.ordendetaprodusForeignKey=new ArrayList();
				this.tipomermaempresasForeignKey=new ArrayList();
				this.unidadsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProductoOrdenDetaProduMermaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProductoOrdenDetaProduMermaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyProductoOrdenDetaProduMermaListas(false);
			} else {
			
				this.cargarCombosForeignKeyOrdenDetaProduListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoMermaEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyProductoOrdenDetaProduMermaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ProductoOrdenDetaProduMermaParameterReturnGeneral productoordendetaprodumermaReturnGeneral=new ProductoOrdenDetaProduMermaParameterReturnGeneral();
						
			


				String finalQueryGlobalOrdenDetaProdu="";

				if(((this.ordendetaprodusForeignKey==null||this.ordendetaprodusForeignKey.size()<=0) && this.productoordendetaprodumermaConstantesFunciones.cargarid_orden_deta_produProductoOrdenDetaProduMerma)
					 || (this.esRecargarFks && this.productoordendetaprodumermaConstantesFunciones.cargarid_orden_deta_produProductoOrdenDetaProduMerma)) {

					if(!this.productoordendetaprodumermaSessionBean.getisBusquedaDesdeForeignKeySesionOrdenDetaProdu()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=OrdenDetaProduConstantesFunciones.getArrayColumnasGlobalesOrdenDetaProdu(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalOrdenDetaProdu=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,OrdenDetaProduConstantesFunciones.TABLENAME);

						finalQueryGlobalOrdenDetaProdu=Funciones.GetFinalQueryAppend(finalQueryGlobalOrdenDetaProdu, "");
						finalQueryGlobalOrdenDetaProdu+=OrdenDetaProduConstantesFunciones.SFINALQUERY;

						//this.cargarCombosOrdenDetaProdusForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalOrdenDetaProdu=" WHERE " + ConstantesSql.ID + "="+productoordendetaprodumermaSessionBean.getlidOrdenDetaProduActual();
					}
				} else {
					finalQueryGlobalOrdenDetaProdu="NONE";
				}


				String finalQueryGlobalTipoMermaEmpresa="";

				if(((this.tipomermaempresasForeignKey==null||this.tipomermaempresasForeignKey.size()<=0) && this.productoordendetaprodumermaConstantesFunciones.cargarid_tipo_merma_empresaProductoOrdenDetaProduMerma)
					 || (this.esRecargarFks && this.productoordendetaprodumermaConstantesFunciones.cargarid_tipo_merma_empresaProductoOrdenDetaProduMerma)) {

					if(!this.productoordendetaprodumermaSessionBean.getisBusquedaDesdeForeignKeySesionTipoMermaEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoMermaEmpresaConstantesFunciones.getArrayColumnasGlobalesTipoMermaEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoMermaEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoMermaEmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoMermaEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoMermaEmpresa, "");
						finalQueryGlobalTipoMermaEmpresa+=TipoMermaEmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoMermaEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoMermaEmpresa=" WHERE " + ConstantesSql.ID + "="+productoordendetaprodumermaSessionBean.getlidTipoMermaEmpresaActual();
					}
				} else {
					finalQueryGlobalTipoMermaEmpresa="NONE";
				}


				String finalQueryGlobalUnidad="";

				if(((this.unidadsForeignKey==null||this.unidadsForeignKey.size()<=0) && this.productoordendetaprodumermaConstantesFunciones.cargarid_unidadProductoOrdenDetaProduMerma)
					 || (this.esRecargarFks && this.productoordendetaprodumermaConstantesFunciones.cargarid_unidadProductoOrdenDetaProduMerma)) {

					if(!this.productoordendetaprodumermaSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UnidadConstantesFunciones.getArrayColumnasGlobalesUnidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUnidad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UnidadConstantesFunciones.TABLENAME);

						finalQueryGlobalUnidad=Funciones.GetFinalQueryAppend(finalQueryGlobalUnidad, "");
						finalQueryGlobalUnidad+=UnidadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUnidadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUnidad=" WHERE " + ConstantesSql.ID + "="+productoordendetaprodumermaSessionBean.getlidUnidadActual();
					}
				} else {
					finalQueryGlobalUnidad="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				productoordendetaprodumermaReturnGeneral=productoordendetaprodumermaLogic.cargarCombosLoteForeignKeyProductoOrdenDetaProduMerma(finalQueryGlobalOrdenDetaProdu,finalQueryGlobalTipoMermaEmpresa,finalQueryGlobalUnidad);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalOrdenDetaProdu.equals("NONE")) {
				this.ordendetaprodusForeignKey=productoordendetaprodumermaReturnGeneral.getordendetaprodusForeignKey();
			}

			if(!finalQueryGlobalTipoMermaEmpresa.equals("NONE")) {
				this.tipomermaempresasForeignKey=productoordendetaprodumermaReturnGeneral.gettipomermaempresasForeignKey();
			}

			if(!finalQueryGlobalUnidad.equals("NONE")) {
				this.unidadsForeignKey=productoordendetaprodumermaReturnGeneral.getunidadsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyProductoOrdenDetaProduMerma()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyOrdenDetaProdu();
			this.addItemDefectoCombosForeignKeyTipoMermaEmpresa();
			this.addItemDefectoCombosForeignKeyUnidad();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyOrdenDetaProdu()throws Exception {
		try {
			if(this.productoordendetaprodumermaSessionBean==null) {
				this.productoordendetaprodumermaSessionBean=new ProductoOrdenDetaProduMermaSessionBean();
			}

			if(!this.productoordendetaprodumermaSessionBean.getisBusquedaDesdeForeignKeySesionOrdenDetaProdu()) {
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

	public void addItemDefectoCombosForeignKeyTipoMermaEmpresa()throws Exception {
		try {

			if(!this.productoordendetaprodumermaSessionBean.getisBusquedaDesdeForeignKeySesionTipoMermaEmpresa()) {
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

			if(!this.productoordendetaprodumermaSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
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
	
	public void initActionsCombosTodosForeignKeyProductoOrdenDetaProduMerma()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProductoOrdenDetaProduMerma(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProductoOrdenDetaProduMerma()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductoOrdenDetaProduMerma();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProductoOrdenDetaProduMerma(ProductoOrdenDetaProduMerma productoordendetaprodumerma)throws Exception {	
		try {
			
			this.setActualOrdenDetaProduForeignKey(productoordendetaprodumerma.getid_orden_deta_produ(),false,"Formulario");
			this.setActualTipoMermaEmpresaForeignKey(productoordendetaprodumerma.getid_tipo_merma_empresa(),false,"Formulario");
			this.setActualUnidadForeignKey(productoordendetaprodumerma.getid_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProductoOrdenDetaProduMerma(ProductoOrdenDetaProduMerma productoordendetaprodumerma,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProductoOrdenDetaProduMerma()throws Exception {	
		try {
			
			this.setActualOrdenDetaProduForeignKey(this.productoordendetaprodumermaConstantesFunciones.getid_orden_deta_produ(),false,"Formulario");
			this.setActualTipoMermaEmpresaForeignKey(this.productoordendetaprodumermaConstantesFunciones.getid_tipo_merma_empresa(),false,"Formulario");
			this.setActualUnidadForeignKey(this.productoordendetaprodumermaConstantesFunciones.getid_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProductoOrdenDetaProduMerma()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProductoOrdenDetaProduMerma()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProductoOrdenDetaProduMerma()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProductoOrdenDetaProduMerma()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProductoOrdenDetaProduMerma()throws Exception {
		try {
			

			this.cargarCombosFrameOrdenDetaProdusForeignKey("Todos");
			this.cargarCombosFrameTipoMermaEmpresasForeignKey("Todos");
			this.cargarCombosFrameUnidadsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProductoOrdenDetaProduMerma(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameOrdenDetaProdusForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoMermaEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUnidadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProductoOrdenDetaProduMerma()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_orden_deta_produProductoOrdenDetaProduMerma!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_orden_deta_produProductoOrdenDetaProduMerma.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_orden_deta_produProductoOrdenDetaProduMerma.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMerma!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMerma.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMerma.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_unidadProductoOrdenDetaProduMerma!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_unidadProductoOrdenDetaProduMerma.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_unidadProductoOrdenDetaProduMerma.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public ProductoOrdenDetaProduMermaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProductoOrdenDetaProduMermaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProductoOrdenDetaProduMermaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.productoordendetaprodumermaSessionBean=new ProductoOrdenDetaProduMermaSessionBean(); 
		this.productoordendetaprodumermaConstantesFunciones=new ProductoOrdenDetaProduMermaConstantesFunciones(); 
		this.productoordendetaprodumermaBean=new ProductoOrdenDetaProduMerma();//(this.productoordendetaprodumermaConstantesFunciones); 		
		this.productoordendetaprodumermaReturnGeneral=new ProductoOrdenDetaProduMermaParameterReturnGeneral(); 
		
		this.productoordendetaprodumermaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoordendetaprodumermaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProductoOrdenDetaProduMermaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProductoOrdenDetaProduMermaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProductoOrdenDetaProduMermaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProductoOrdenDetaProduMerma(true);
			
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
			
			this.productoordendetaprodumermaConstantesFunciones=new ProductoOrdenDetaProduMermaConstantesFunciones(); 
			this.productoordendetaprodumermaBean=new ProductoOrdenDetaProduMerma();//this.productoordendetaprodumermaConstantesFunciones); 			
			this.productoordendetaprodumermaReturnGeneral=new ProductoOrdenDetaProduMermaParameterReturnGeneral(); 
		
			ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Orden Merma Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.productoordendetaprodumerma=new ProductoOrdenDetaProduMerma();
			this.productoordendetaprodumermas = new ArrayList<ProductoOrdenDetaProduMerma>();
			this.productoordendetaprodumermasAux = new ArrayList<ProductoOrdenDetaProduMerma>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic=new ProductoOrdenDetaProduMermaLogic();
				this.productoordendetaprodumermaLogic.getNewConnexionToDeep("");
			}
			
			//this.productoordendetaprodumermaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.productoordendetaprodumermaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma);	
					}
					
					if(this.jInternalFrameImportacionProductoOrdenDetaProduMerma!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductoOrdenDetaProduMerma);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProductoOrdenDetaProduMerma!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProductoOrdenDetaProduMerma);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma);
				this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.setVisible(false);
				this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma);
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.setVisible(false);
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProductoOrdenDetaProduMerma!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProductoOrdenDetaProduMerma);
					this.jInternalFrameImportacionProductoOrdenDetaProduMerma.setVisible(false);
					this.jInternalFrameImportacionProductoOrdenDetaProduMerma.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProductoOrdenDetaProduMerma!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProductoOrdenDetaProduMerma);
					this.jInternalFrameOrderByProductoOrdenDetaProduMerma.setVisible(false);
					this.jInternalFrameOrderByProductoOrdenDetaProduMerma.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProductoOrdenDetaProduMermaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProductoOrdenDetaProduMermaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.productoordendetaprodumermaReturnGeneral=new ProductoOrdenDetaProduMermaParameterReturnGeneral();
			
			this.productoordendetaprodumermaParameterGeneral=new ProductoOrdenDetaProduMermaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.productoordendetaprodumermaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProductoOrdenDetaProduMermaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductoOrdenDetaProduMermaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado(),this.productoordendetaprodumermaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductoOrdenDetaProduMermaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado(),this.productoordendetaprodumermaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMerma=false;
			this.isVisibilidadCeldaDuplicarProductoOrdenDetaProduMerma=true;
			this.isVisibilidadCeldaCopiarProductoOrdenDetaProduMerma=true;
			this.isVisibilidadCeldaVerFormProductoOrdenDetaProduMerma=true;
			this.isVisibilidadCeldaOrdenProductoOrdenDetaProduMerma=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMerma=false;
			this.isVisibilidadCeldaModificarProductoOrdenDetaProduMerma=false;
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMerma=false;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMerma=false;
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMerma=false;
			this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMerma=false;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMerma=false;
			
			
			this.isVisibilidadFK_IdOrdenDetaProdu=true;
			this.isVisibilidadFK_IdTipoMermaEmpresa=true;
			this.isVisibilidadFK_IdUnidad=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduMerma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProductoOrdenDetaProduMerma();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProductoOrdenDetaProduMerma(false);
			
			this.setPermisosUsuarioProductoOrdenDetaProduMerma();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado() 
				|| (this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado() && this.productoordendetaprodumermaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProductoOrdenDetaProduMermaClasesRelacionadas();
			}
			
			if(this.productoordendetaprodumermaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProductoOrdenDetaProduMermaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProductoOrdenDetaProduMermaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProductoOrdenDetaProduMerma();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProductoOrdenDetaProduMerma();
			}
			
			if(!this.isPermisoBusquedaProductoOrdenDetaProduMerma) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioProductoOrdenDetaProduMerma,this.isPermisoPaginacionMedioProductoOrdenDetaProduMerma,this.isPermisoPaginacionTodoProductoOrdenDetaProduMerma);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProductoOrdenDetaProduMermaConstantesFunciones.getTiposSeleccionarProductoOrdenDetaProduMerma());
				
				this.tiposColumnasSelect=ProductoOrdenDetaProduMermaConstantesFunciones.getTiposSeleccionarProductoOrdenDetaProduMerma(true);
				
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
			//if(!this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProductoOrdenDetaProduMerma();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioProductoOrdenDetaProduMerma(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioProductoOrdenDetaProduMerma(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoOrdenDetaProduMerma() ;
			
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
				productoordendetaprodumermaImplementable= (ProductoOrdenDetaProduMermaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductoOrdenDetaProduMermaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				productoordendetaprodumermaImplementableHome= (ProductoOrdenDetaProduMermaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductoOrdenDetaProduMermaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.productoordendetaprodumermas= new ArrayList<ProductoOrdenDetaProduMerma>();
			this.productoordendetaprodumermasEliminados= new ArrayList<ProductoOrdenDetaProduMerma>();
						
			this.isEsNuevoProductoOrdenDetaProduMerma=false;
			this.esParaAccionDesdeFormularioProductoOrdenDetaProduMerma=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.ordendetaprodusForeignKey=new ArrayList<OrdenDetaProdu>() ;
			this.tipomermaempresasForeignKey=new ArrayList<TipoMermaEmpresa>() ;
			this.unidadsForeignKey=new ArrayList<Unidad>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProductoOrdenDetaProduMerma(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProductoOrdenDetaProduMerma();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProductoOrdenDetaProduMermaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduMerma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProductoOrdenDetaProduMerma(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProductoOrdenDetaProduMerma();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProductoOrdenDetaProduMerma();
			}
			
			ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProductoOrdenDetaProduMerma(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProductoOrdenDetaProduMerma: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProductoOrdenDetaProduMerma() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProductoOrdenDetaProduMerma")) {
				iIndex=this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTabbedPaneRelacionesProductoOrdenDetaProduMerma.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTabbedPaneRelacionesProductoOrdenDetaProduMerma.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProductoOrdenDetaProduMerma.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProductoOrdenDetaProduMerma();	
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
	
	public void cargarCombosForeignKeyProductoOrdenDetaProduMerma(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProductoOrdenDetaProduMerma(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProductoOrdenDetaProduMerma(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProductoOrdenDetaProduMermaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProductoOrdenDetaProduMerma();
		
		this.cargarCombosFrameForeignKeyProductoOrdenDetaProduMerma();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProductoOrdenDetaProduMerma();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProductoOrdenDetaProduMerma();
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
	
	public void jButtonNuevoProductoOrdenDetaProduMermaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.productoordendetaprodumermaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
			
			
			if(jTableDatosProductoOrdenDetaProduMerma.getRowCount()>=1) {
				jTableDatosProductoOrdenDetaProduMerma.removeRowSelectionInterval(0, jTableDatosProductoOrdenDetaProduMerma.getRowCount()-1);						
			}
			
			this.isEsNuevoProductoOrdenDetaProduMerma=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProductoOrdenDetaProduMerma(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProductoOrdenDetaProduMerma(true);			
			//this.productoordendetaprodumerma=new ProductoOrdenDetaProduMerma();
			//this.productoordendetaprodumerma.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoOrdenDetaProduMerma(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProduMerma() ;
			
			if(ProductoOrdenDetaProduMermaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoOrdenDetaProduMerma(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.productoordendetaprodumerma);	
			this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumerma);				
			
			ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
			
			if(this.productoordendetaprodumermaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProductoOrdenDetaProduMerma: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProductoOrdenDetaProduMermaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProductoOrdenDetaProduMerma> productoordendetaprodumermasSeleccionados=new ArrayList<ProductoOrdenDetaProduMerma>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProductoOrdenDetaProduMerma.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProductoOrdenDetaProduMerma.getSelectedRows().length;			
			}
			
			productoordendetaprodumermasSeleccionados=this.getProductoOrdenDetaProduMermasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProductoOrdenDetaProduMerma--;			
				//ProductoOrdenDetaProduMerma productoordendetaprodumermaAux= new ProductoOrdenDetaProduMerma();			
				//productoordendetaprodumermaAux.setId(this.iIdNuevoProductoOrdenDetaProduMerma);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProductoOrdenDetaProduMerma productoordendetaprodumermaOrigen=new ProductoOrdenDetaProduMerma();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProductoOrdenDetaProduMerma productoordendetaprodumermaOrigen : productoordendetaprodumermasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProductoOrdenDetaProduMerma.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							productoordendetaprodumermaOrigen =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodumermaOrigen =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermas.toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProductoOrdenDetaProduMerma();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.productoordendetaprodumerma.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProductoOrdenDetaProduMerma(productoordendetaprodumermaOrigen,this.productoordendetaprodumerma,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMerma(this.productoordendetaprodumerma);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().add(this.productoordendetaprodumermaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodumermas.add(this.productoordendetaprodumermaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProductoOrdenDetaProduMerma(false);
				
				this.jTableDatosProductoOrdenDetaProduMerma.setRowSelectionInterval(this.getIndiceNuevoProductoOrdenDetaProduMerma(), this.getIndiceNuevoProductoOrdenDetaProduMerma());
				
				int iLastRow =  this.jTableDatosProductoOrdenDetaProduMerma.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductoOrdenDetaProduMerma.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductoOrdenDetaProduMerma.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoOrdenDetaProduMerma(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProductoOrdenDetaProduMermaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProductoOrdenDetaProduMerma> productoordendetaprodumermasSeleccionados=new ArrayList<ProductoOrdenDetaProduMerma>();									
		
			ProductoOrdenDetaProduMerma productoordendetaprodumermaOrigen=new ProductoOrdenDetaProduMerma();
			ProductoOrdenDetaProduMerma productoordendetaprodumermaDestino=new ProductoOrdenDetaProduMerma();
				
			productoordendetaprodumermasSeleccionados=this.getProductoOrdenDetaProduMermasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProductoOrdenDetaProduMerma.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || productoordendetaprodumermasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProductoOrdenDetaProduMerma.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodumermaOrigen =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productoordendetaprodumermaOrigen =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermas.toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodumermaDestino =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productoordendetaprodumermaDestino =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermas.toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				productoordendetaprodumermaOrigen =productoordendetaprodumermasSeleccionados.get(0);
				productoordendetaprodumermaDestino =productoordendetaprodumermasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProductoOrdenDetaProduMerma(productoordendetaprodumermaOrigen,productoordendetaprodumermaDestino,true,false);
				
				productoordendetaprodumermaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productoordendetaprodumermaDestino,productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoordendetaprodumermaDestino,productoordendetaprodumermas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProductoOrdenDetaProduMerma(false);
				
				//this.jTableDatosProductoOrdenDetaProduMerma.setRowSelectionInterval(this.getIndiceNuevoProductoOrdenDetaProduMerma(), this.getIndiceNuevoProductoOrdenDetaProduMerma());
				
				int iLastRow =  this.jTableDatosProductoOrdenDetaProduMerma.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductoOrdenDetaProduMerma.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductoOrdenDetaProduMerma.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoOrdenDetaProduMerma(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProductoOrdenDetaProduMermaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProductoOrdenDetaProduMermaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProductoOrdenDetaProduMerma.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProductoOrdenDetaProduMerma.setVisible(!isVisible);
			this.jPanelPaginacionProductoOrdenDetaProduMerma.setVisible(!isVisible);
			this.jPanelAccionesProductoOrdenDetaProduMerma.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProductoOrdenDetaProduMermaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProductoOrdenDetaProduMerma();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProductoOrdenDetaProduMermaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProductoOrdenDetaProduMerma();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProductoOrdenDetaProduMermaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProductoOrdenDetaProduMerma();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProductoOrdenDetaProduMermaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProductoOrdenDetaProduMerma();
			
			this.abrirFrameOrderByProductoOrdenDetaProduMerma();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProductoOrdenDetaProduMermaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProductoOrdenDetaProduMerma();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProductoOrdenDetaProduMerma(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductoOrdenDetaProduMerma);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.isMaximum()) {
					this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.setSize(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.iWidthFormulario,this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.isMaximum()) {
						this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jContentPaneDetalleProductoOrdenDetaProduMerma.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTabbedPaneRelacionesProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jContentPaneDetalleProductoOrdenDetaProduMerma.getWidth(),ProductoOrdenDetaProduMermaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTabbedPaneRelacionesProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jContentPaneDetalleProductoOrdenDetaProduMerma.getWidth(),ProductoOrdenDetaProduMermaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTabbedPaneRelacionesProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jContentPaneDetalleProductoOrdenDetaProduMerma.getWidth(),ProductoOrdenDetaProduMermaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.setVisible(true);
	        this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProductoOrdenDetaProduMerma() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProductoOrdenDetaProduMerma==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProductoOrdenDetaProduMerma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoOrdenDetaProduMerma,false,this);
				} else {
					this.jInternalFrameOrderByProductoOrdenDetaProduMerma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoOrdenDetaProduMerma,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProductoOrdenDetaProduMerma);
				this.jInternalFrameOrderByProductoOrdenDetaProduMerma.setVisible(false);
				this.jInternalFrameOrderByProductoOrdenDetaProduMerma.setSelected(false);
				
				this.jInternalFrameOrderByProductoOrdenDetaProduMerma.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductoOrdenDetaProduMerma"));
				
				this.inicializarActualizarBindingTablaOrderByProductoOrdenDetaProduMerma();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProductoOrdenDetaProduMerma() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProductoOrdenDetaProduMerma==null) {
				
				this.jInternalFrameImportacionProductoOrdenDetaProduMerma=new ImportacionJInternalFrame(ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductoOrdenDetaProduMerma);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProductoOrdenDetaProduMerma);
				this.jInternalFrameImportacionProductoOrdenDetaProduMerma.setVisible(false);
				this.jInternalFrameImportacionProductoOrdenDetaProduMerma.setSelected(false);


				this.jInternalFrameImportacionProductoOrdenDetaProduMerma.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductoOrdenDetaProduMerma"));
				this.jInternalFrameImportacionProductoOrdenDetaProduMerma.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductoOrdenDetaProduMerma"));
				this.jInternalFrameImportacionProductoOrdenDetaProduMerma.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductoOrdenDetaProduMerma"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProductoOrdenDetaProduMerma() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma==null) {
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma=new ReporteDinamicoJInternalFrame(ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma);
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.setVisible(false);
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoOrdenDetaProduMerma"));
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoOrdenDetaProduMerma"));
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoOrdenDetaProduMerma"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoOrdenDetaProduMerma();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProductoOrdenDetaProduMerma() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductoOrdenDetaProduMerma);
			
	       	this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.setVisible(false);
	        this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.setSelected(false);
			
			//this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.dispose();
			//this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProductoOrdenDetaProduMerma() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.setVisible(true);
	        this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProductoOrdenDetaProduMerma() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProductoOrdenDetaProduMerma.setVisible(true);
	        this.jInternalFrameImportacionProductoOrdenDetaProduMerma.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProductoOrdenDetaProduMerma() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProductoOrdenDetaProduMerma.setVisible(true);
	        this.jInternalFrameOrderByProductoOrdenDetaProduMerma.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProductoOrdenDetaProduMerma() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProductoOrdenDetaProduMerma.setVisible(false);
	        this.jInternalFrameOrderByProductoOrdenDetaProduMerma.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProductoOrdenDetaProduMerma() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.setVisible(false);
	        this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProductoOrdenDetaProduMerma() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProductoOrdenDetaProduMerma.setVisible(false);
	        this.jInternalFrameImportacionProductoOrdenDetaProduMerma.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProductoOrdenDetaProduMermaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProductoOrdenDetaProduMerma(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProductoOrdenDetaProduMerma(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductoOrdenDetaProduMerma.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProductoOrdenDetaProduMerma(true);
			//this.isEsNuevoProductoOrdenDetaProduMerma=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermas.toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduMerma("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoOrdenDetaProduMerma(false) ;
			
			if(productoordendetaprodumermaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProductoOrdenDetaProduMermaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoOrdenDetaProduMerma(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProduMerma(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProductoOrdenDetaProduMermaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProduMerma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermas.toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProductoOrdenDetaProduMerma(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductoOrdenDetaProduMerma.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProductoOrdenDetaProduMerma(true);
			//this.isEsNuevoProductoOrdenDetaProduMerma=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermas.toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.productoordendetaprodumerma.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduMerma("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProductoOrdenDetaProduMerma(false) ;
			
			if(ProductoOrdenDetaProduMermaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoOrdenDetaProduMerma(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProduMerma(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaOrdenDetaProdu(List<OrdenDetaProdu> ordendetaprodusForeignKey)throws Exception{
		TableColumn tableColumnOrdenDetaProdu=this.jTableDatosProductoOrdenDetaProduMerma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMerma,ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDORDENDETAPRODU));
		TableCellEditor tableCellEditorOrdenDetaProdu =tableColumnOrdenDetaProdu.getCellEditor();

		OrdenDetaProduTableCell ordendetaproduTableCellFk=(OrdenDetaProduTableCell)tableCellEditorOrdenDetaProdu;

		if(ordendetaproduTableCellFk!=null) {
			ordendetaproduTableCellFk.setordendetaprodusForeignKey(ordendetaprodusForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoOrdenDetaProduMerma.getSelectedRow();

		//if(intSelectedRow<=0) {
			//ordendetaproduTableCellFk.setRowActual(intSelectedRow);
			//ordendetaproduTableCellFk.setordendetaprodusForeignKeyActual(ordendetaprodusForeignKey);
		//}


		if(ordendetaproduTableCellFk!=null) {
			ordendetaproduTableCellFk.RecargarOrdenDetaProdusForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoMermaEmpresa(List<TipoMermaEmpresa> tipomermaempresasForeignKey)throws Exception{
		TableColumn tableColumnTipoMermaEmpresa=this.jTableDatosProductoOrdenDetaProduMerma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMerma,ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDTIPOMERMAEMPRESA));
		TableCellEditor tableCellEditorTipoMermaEmpresa =tableColumnTipoMermaEmpresa.getCellEditor();

		TipoMermaEmpresaTableCell tipomermaempresaTableCellFk=(TipoMermaEmpresaTableCell)tableCellEditorTipoMermaEmpresa;

		if(tipomermaempresaTableCellFk!=null) {
			tipomermaempresaTableCellFk.settipomermaempresasForeignKey(tipomermaempresasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoOrdenDetaProduMerma.getSelectedRow();

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
		TableColumn tableColumnUnidad=this.jTableDatosProductoOrdenDetaProduMerma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMerma,ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDUNIDAD));
		TableCellEditor tableCellEditorUnidad =tableColumnUnidad.getCellEditor();

		UnidadTableCell unidadTableCellFk=(UnidadTableCell)tableCellEditorUnidad;

		if(unidadTableCellFk!=null) {
			unidadTableCellFk.setunidadsForeignKey(unidadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoOrdenDetaProduMerma.getSelectedRow();

		//if(intSelectedRow<=0) {
			//unidadTableCellFk.setRowActual(intSelectedRow);
			//unidadTableCellFk.setunidadsForeignKeyActual(unidadsForeignKey);
		//}


		if(unidadTableCellFk!=null) {
			unidadTableCellFk.RecargarUnidadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProductoOrdenDetaProduMermaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProductoOrdenDetaProduMerma(false);
			
			//if(!this.isEsNuevoProductoOrdenDetaProduMerma) {								
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMerma.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermas.toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProductoOrdenDetaProduMermaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMerma(this.productoordendetaprodumerma,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMerma(this.productoordendetaprodumerma);
				
			}
			
			if(this.permiteMantenimiento(this.productoordendetaprodumerma)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProductoOrdenDetaProduMerma=true;
					this.inicializarActualizarBindingTablaProductoOrdenDetaProduMerma(false);
					this.isEsNuevoProductoOrdenDetaProduMerma=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProductoOrdenDetaProduMerma=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProductoOrdenDetaProduMerma=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductoOrdenDetaProduMerma(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProduMerma(false);
				
				this.habilitarDeshabilitarControlesProductoOrdenDetaProduMerma(false);
			
												
				
				if(ProductoOrdenDetaProduMermaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProductoOrdenDetaProduMerma();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProductoOrdenDetaProduMermaActionPerformed(evt,productoordendetaprodumermaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProductoOrdenDetaProduMerma(this.productoordendetaprodumerma,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProductoOrdenDetaProduMerma.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,productoordendetaprodumermaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.productoordendetaprodumerma.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduMerma.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduMerma.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProductoOrdenDetaProduMermaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMerma.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
				this.productoordendetaprodumerma.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermas.toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
				this.productoordendetaprodumerma.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.productoordendetaprodumerma)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProductoOrdenDetaProduMermaModel) this.jTableDatosProductoOrdenDetaProduMerma.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProductoOrdenDetaProduMerma=true;
				this.inicializarActualizarBindingTablaProductoOrdenDetaProduMerma(false);
				this.isEsNuevoProductoOrdenDetaProduMerma=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductoOrdenDetaProduMerma(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProduMerma(false);
				
				this.habilitarDeshabilitarControlesProductoOrdenDetaProduMerma(false);
				
				
				
				if(ProductoOrdenDetaProduMermaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProductoOrdenDetaProduMerma();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProductoOrdenDetaProduMermaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProductoOrdenDetaProduMerma.getRowCount()>=1) {
				jTableDatosProductoOrdenDetaProduMerma.removeRowSelectionInterval(0, jTableDatosProductoOrdenDetaProduMerma.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProductoOrdenDetaProduMerma(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProductoOrdenDetaProduMerma(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoOrdenDetaProduMerma(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProduMerma(false) ;
			
			this.isEsNuevoProductoOrdenDetaProduMerma=false;
			
			if(ProductoOrdenDetaProduMermaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProductoOrdenDetaProduMerma();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProductoOrdenDetaProduMermaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProductoOrdenDetaProduMerma(false);
				
				//SI ES MANUAL
				if(ProductoOrdenDetaProduMermaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProductoOrdenDetaProduMerma();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProductoOrdenDetaProduMermaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProductoOrdenDetaProduMerma--;			
			//ProductoOrdenDetaProduMerma productoordendetaprodumermaAux= new ProductoOrdenDetaProduMerma();			
			//productoordendetaprodumermaAux.setId(this.iIdNuevoProductoOrdenDetaProduMerma);
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProductoOrdenDetaProduMerma();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMerma(this.productoordendetaprodumerma);
			
			this.productoordendetaprodumerma.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().add(this.productoordendetaprodumermaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.productoordendetaprodumermas.add(this.productoordendetaprodumermaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProductoOrdenDetaProduMerma(false);
			
			this.jTableDatosProductoOrdenDetaProduMerma.setRowSelectionInterval(this.getIndiceNuevoProductoOrdenDetaProduMerma(), this.getIndiceNuevoProductoOrdenDetaProduMerma());
			
			int iLastRow =  this.jTableDatosProductoOrdenDetaProduMerma.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProductoOrdenDetaProduMerma.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProductoOrdenDetaProduMerma.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProductoOrdenDetaProduMerma(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProductoOrdenDetaProduMermaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProductoOrdenDetaProduMerma(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoOrdenDetaProduMerma(false);
			
			//SI ES MANUAL
			if(ProductoOrdenDetaProduMermaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoOrdenDetaProduMerma();
			}
			
			//this.abrirFrameTreeProductoOrdenDetaProduMerma();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProductoOrdenDetaProduMermaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Orden MermaES ?", "MANTENIMIENTO DE Orden Merma", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionProductoOrdenDetaProduMerma.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralProductoOrdenDetaProduMerma();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.productoordendetaprodumermaReturnGeneral=productoordendetaprodumermaLogic.procesarImportacionProductoOrdenDetaProduMermasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.productoordendetaprodumermaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarProductoOrdenDetaProduMermaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProductoOrdenDetaProduMermaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProductoOrdenDetaProduMerma.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProductoOrdenDetaProduMerma.setFileImportacion(this.jInternalFrameImportacionProductoOrdenDetaProduMerma.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProductoOrdenDetaProduMerma.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProductoOrdenDetaProduMerma.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProductoOrdenDetaProduMerma.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProductoOrdenDetaProduMerma.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProductoOrdenDetaProduMermaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProductoOrdenDetaProduMerma> productoordendetaprodumermasSeleccionados=new ArrayList<ProductoOrdenDetaProduMerma>();		

		productoordendetaprodumermasSeleccionados=this.getProductoOrdenDetaProduMermasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProductoOrdenDetaProduMermaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProductoOrdenDetaProduMermaBaseDesign.jrxml";
			
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
			
			this.generarReporteProductoOrdenDetaProduMermas("Todos",productoordendetaprodumermasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden Merma",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDORDENDETAPRODU:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_OrdenDetaProdu_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_OrdenDetaProdu_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_OrdenDetaProdu_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_OrdenDetaProdu_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDTIPOMERMAEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoMermaEmpresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoMermaEmpresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoMermaEmpresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoMermaEmpresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Unidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Unidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Unidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Unidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_COSTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_sto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_sto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_sto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_sto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_COSTOTOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_stoTotal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_stoTotal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_stoTotal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_stoTotal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDORDENDETAPRODU:
					sNombreCampoCategoria="id_orden_deta_produ";
					break;

				case ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDTIPOMERMAEMPRESA:
					sNombreCampoCategoria="id_tipo_merma_empresa";
					break;

				case ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoria="id_unidad";
					break;

				case ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;

				case ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoria="costo";
					break;

				case ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_COSTOTOTAL:
					sNombreCampoCategoria="costo_total";
					break;

				case ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDORDENDETAPRODU:
					sNombreCampoCategoriaValor="id_orden_deta_produ";
					break;

				case ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDTIPOMERMAEMPRESA:
					sNombreCampoCategoriaValor="id_tipo_merma_empresa";
					break;

				case ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoriaValor="id_unidad";
					break;

				case ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;

				case ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoriaValor="costo";
					break;

				case ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_COSTOTOTAL:
					sNombreCampoCategoriaValor="costo_total";
					break;

				case ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDORDENDETAPRODU:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Orden Deta Produ",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_orden_deta_produ");
					break;

				case ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDTIPOMERMAEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Merma Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_merma_empresa");
					break;

				case ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Unad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_unidad");
					break;

				case ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad");
					break;

				case ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_COSTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo");
					break;

				case ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_COSTOTOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo_total");
					break;

				case ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduMermaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProductoOrdenDetaProduMerma> productoordendetaprodumermasSeleccionados=new ArrayList<ProductoOrdenDetaProduMerma>();		
		
		productoordendetaprodumermasSeleccionados=this.getProductoOrdenDetaProduMermasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoordendetaprodumerma";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProductoOrdenDetaProduMermas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDORDENDETAPRODU:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDORDENDETAPRODU);
					iRow++;

					for(ProductoOrdenDetaProduMerma productoordendetaprodumerma:productoordendetaprodumermasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodumerma.getordendetaprodu_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDTIPOMERMAEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDTIPOMERMAEMPRESA);
					iRow++;

					for(ProductoOrdenDetaProduMerma productoordendetaprodumerma:productoordendetaprodumermasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodumerma.gettipomermaempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDUNIDAD);
					iRow++;

					for(ProductoOrdenDetaProduMerma productoordendetaprodumerma:productoordendetaprodumermasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodumerma.getunidad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(ProductoOrdenDetaProduMerma productoordendetaprodumerma:productoordendetaprodumermasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodumerma.getcantidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_COSTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_COSTO);
					iRow++;

					for(ProductoOrdenDetaProduMerma productoordendetaprodumerma:productoordendetaprodumermasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodumerma.getcosto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_COSTOTOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_COSTOTOTAL);
					iRow++;

					for(ProductoOrdenDetaProduMerma productoordendetaprodumerma:productoordendetaprodumermasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodumerma.getcosto_total());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(ProductoOrdenDetaProduMerma productoordendetaprodumerma:productoordendetaprodumermasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodumerma.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelProductoOrdenDetaProduMerma(row);				
			//	iRow++;
			//}				
			
			//for(ProductoOrdenDetaProduMerma productoordendetaprodumermaAux:productoordendetaprodumermasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProductoOrdenDetaProduMerma(productoordendetaprodumermaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden Merma",JOptionPane.INFORMATION_MESSAGE);
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
				this.productoordendetaprodumermaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoOrdenDetaProduMerma(false);
			
			//SI ES MANUAL
			if(ProductoOrdenDetaProduMermaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoOrdenDetaProduMerma();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProductoOrdenDetaProduMermaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoOrdenDetaProduMerma(false);
			
			//SI ES MANUAL
			if(ProductoOrdenDetaProduMermaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductoOrdenDetaProduMerma();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProductoOrdenDetaProduMermaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoOrdenDetaProduMerma(false);
			
			//SI ES MANUAL
			if(ProductoOrdenDetaProduMermaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductoOrdenDetaProduMerma();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProductoOrdenDetaProduMerma() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProductoOrdenDetaProduMerma.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProductoOrdenDetaProduMerma.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProductoOrdenDetaProduMerma.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProductoOrdenDetaProduMerma.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProductoOrdenDetaProduMerma.setMinimumSize(dimensionMinimum);
		this.jTableDatosProductoOrdenDetaProduMerma.setMaximumSize(dimensionMaximum);
		this.jTableDatosProductoOrdenDetaProduMerma.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProductoOrdenDetaProduMerma(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProductoOrdenDetaProduMerma(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProductoOrdenDetaProduMerma(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProductoOrdenDetaProduMerma(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProductoOrdenDetaProduMerma(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProductoOrdenDetaProduMerma(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoOrdenDetaProduMerma(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProductoOrdenDetaProduMerma(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProductoOrdenDetaProduMermaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProductoOrdenDetaProduMermaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProductoOrdenDetaProduMerma() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProductoOrdenDetaProduMerma();
		
		this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProduMerma(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProductoOrdenDetaProduMerma();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoOrdenDetaProduMerma() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProductoOrdenDetaProduMerma(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProductoOrdenDetaProduMerma(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMerma.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProductoOrdenDetaProduMerma.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProductoOrdenDetaProduMerma.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jCheckBoxPostAccionNuevoProductoOrdenDetaProduMerma.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jCheckBoxPostAccionSinCerrarProductoOrdenDetaProduMerma.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jCheckBoxPostAccionSinMensajeProductoOrdenDetaProduMerma.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMerma.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProductoOrdenDetaProduMerma.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProductoOrdenDetaProduMerma.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) {
				this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jCheckBoxPostAccionNuevoProductoOrdenDetaProduMerma.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jCheckBoxPostAccionSinCerrarProductoOrdenDetaProduMerma.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jCheckBoxPostAccionSinMensajeProductoOrdenDetaProduMerma.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProductoOrdenDetaProduMerma.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProductoOrdenDetaProduMerma.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMerma.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMerma.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProductoOrdenDetaProduMerma.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProductoOrdenDetaProduMerma.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMerma.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProductoOrdenDetaProduMerma.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduMerma.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProductoOrdenDetaProduMerma.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProductoOrdenDetaProduMerma(Boolean esInicializar) throws Exception {
		try	{	
			if(ProductoOrdenDetaProduMermaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProductoOrdenDetaProduMerma(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProductoOrdenDetaProduMerma() throws Exception {
		try	{
			if(ProductoOrdenDetaProduMermaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProductoOrdenDetaProduMerma();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductoOrdenDetaProduMerma() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMerma.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMerma.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProductoOrdenDetaProduMerma() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMerma.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMerma.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProductoOrdenDetaProduMerma.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProductoOrdenDetaProduMerma.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduMerma.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduMerma.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProductoOrdenDetaProduMerma.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProductoOrdenDetaProduMerma.addItem(reporte);
			}
			
			
			if(!this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProductoOrdenDetaProduMerma.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProductoOrdenDetaProduMerma.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProductoOrdenDetaProduMerma.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProductoOrdenDetaProduMerma.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProductoOrdenDetaProduMerma.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProductoOrdenDetaProduMerma.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMerma.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMerma.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMerma.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMerma.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMerma.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoOrdenDetaProduMerma();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoOrdenDetaProduMerma() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma!=null) {
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma!=null) {
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma!=null) {
				
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ProductoOrdenDetaProduMermaConstantesFunciones.getTiposSeleccionarProductoOrdenDetaProduMerma(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ProductoOrdenDetaProduMermaConstantesFunciones.getTiposSeleccionarProductoOrdenDetaProduMerma(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ProductoOrdenDetaProduMermaConstantesFunciones.getTiposSeleccionarProductoOrdenDetaProduMerma(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProductoOrdenDetaProduMerma()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMerma.getSelectedItem()!=null){this.id_orden_deta_produFK_IdOrdenDetaProdu=((OrdenDetaProdu)this.jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMerma.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma.getSelectedItem()!=null){this.id_tipo_merma_empresaFK_IdTipoMermaEmpresa=((TipoMermaEmpresa)this.jComboBoxid_tipo_merma_empresaFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma.getSelectedItem()).getId();}
		if(this.jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMerma.getSelectedItem()!=null){this.id_unidadFK_IdUnidad=((Unidad)this.jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMerma.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProductoOrdenDetaProduMerma(Boolean esInicializar) throws Exception {				
		if(ProductoOrdenDetaProduMermaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProductoOrdenDetaProduMerma();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProductoOrdenDetaProduMerma() throws Exception {
		this.inicializarActualizarBindingTablaProductoOrdenDetaProduMerma(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProductoOrdenDetaProduMerma() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProductoOrdenDetaProduMerma.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProductoOrdenDetaProduMerma.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoOrdenDetaProduMerma.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduMermaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProductoOrdenDetaProduMerma.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoOrdenDetaProduMerma.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduMermaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProductoOrdenDetaProduMermaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMermaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduMermaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProductoOrdenDetaProduMerma.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoOrdenDetaProduMerma.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduMermaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProductoOrdenDetaProduMerma.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProductoOrdenDetaProduMerma(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=productoordendetaprodumermas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProductoOrdenDetaProduMermaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProductoOrdenDetaProduMerma.setModel(new ProductoOrdenDetaProduMermaModel(this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProductoOrdenDetaProduMerma.setModel(new ProductoOrdenDetaProduMermaModel(this.productoordendetaprodumermas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProductoOrdenDetaProduMerma!=null && this.jInternalFrameOrderByProductoOrdenDetaProduMerma.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProductoOrdenDetaProduMerma();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProductoOrdenDetaProduMerma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMerma,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduMermaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO,productoordendetaprodumermaConstantesFunciones.resaltarSeleccionarProductoOrdenDetaProduMerma,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO,productoordendetaprodumermaConstantesFunciones.resaltarSeleccionarProductoOrdenDetaProduMerma,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProductoOrdenDetaProduMerma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMerma,ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_ID));

		if(this.productoordendetaprodumermaConstantesFunciones.mostraridProductoOrdenDetaProduMerma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoordendetaprodumermaConstantesFunciones.resaltaridProductoOrdenDetaProduMerma,this.productoordendetaprodumermaConstantesFunciones.activaridProductoOrdenDetaProduMerma,iSizeTabla,this,true,"idProductoOrdenDetaProduMerma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoordendetaprodumermaConstantesFunciones.resaltaridProductoOrdenDetaProduMerma,this.productoordendetaprodumermaConstantesFunciones.activaridProductoOrdenDetaProduMerma,this,true,"idProductoOrdenDetaProduMerma","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProduMerma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMerma,ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDORDENDETAPRODU));

		if(this.productoordendetaprodumermaConstantesFunciones.mostrarid_orden_deta_produProductoOrdenDetaProduMerma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDORDENDETAPRODU,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new OrdenDetaProduTableCell(this.ordendetaprodusForeignKey,this.productoordendetaprodumermaConstantesFunciones.resaltarid_orden_deta_produProductoOrdenDetaProduMerma,this,this.productoordendetaprodumermaConstantesFunciones.activarid_orden_deta_produProductoOrdenDetaProduMerma,iSizeTabla));
			tableColumn.setCellEditor(new OrdenDetaProduTableCell(this.ordendetaprodusForeignKey,this.productoordendetaprodumermaConstantesFunciones.resaltarid_orden_deta_produProductoOrdenDetaProduMerma,this,this.productoordendetaprodumermaConstantesFunciones.activarid_orden_deta_produProductoOrdenDetaProduMerma,true,"id_orden_deta_produProductoOrdenDetaProduMerma","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduMermaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProduMerma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMerma,ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDTIPOMERMAEMPRESA));

		if(this.productoordendetaprodumermaConstantesFunciones.mostrarid_tipo_merma_empresaProductoOrdenDetaProduMerma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDTIPOMERMAEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoMermaEmpresaTableCell(this.tipomermaempresasForeignKey,this.productoordendetaprodumermaConstantesFunciones.resaltarid_tipo_merma_empresaProductoOrdenDetaProduMerma,this,this.productoordendetaprodumermaConstantesFunciones.activarid_tipo_merma_empresaProductoOrdenDetaProduMerma,iSizeTabla));
			tableColumn.setCellEditor(new TipoMermaEmpresaTableCell(this.tipomermaempresasForeignKey,this.productoordendetaprodumermaConstantesFunciones.resaltarid_tipo_merma_empresaProductoOrdenDetaProduMerma,this,this.productoordendetaprodumermaConstantesFunciones.activarid_tipo_merma_empresaProductoOrdenDetaProduMerma,true,"id_tipo_merma_empresaProductoOrdenDetaProduMerma","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduMermaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProduMerma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMerma,ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDUNIDAD));

		if(this.productoordendetaprodumermaConstantesFunciones.mostrarid_unidadProductoOrdenDetaProduMerma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDUNIDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new UnidadTableCell(this.unidadsForeignKey,this.productoordendetaprodumermaConstantesFunciones.resaltarid_unidadProductoOrdenDetaProduMerma,this,this.productoordendetaprodumermaConstantesFunciones.activarid_unidadProductoOrdenDetaProduMerma,iSizeTabla));
			tableColumn.setCellEditor(new UnidadTableCell(this.unidadsForeignKey,this.productoordendetaprodumermaConstantesFunciones.resaltarid_unidadProductoOrdenDetaProduMerma,this,this.productoordendetaprodumermaConstantesFunciones.activarid_unidadProductoOrdenDetaProduMerma,true,"id_unidadProductoOrdenDetaProduMerma","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduMermaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProduMerma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMerma,ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_CANTIDAD));

		if(this.productoordendetaprodumermaConstantesFunciones.mostrarcantidadProductoOrdenDetaProduMerma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoordendetaprodumermaConstantesFunciones.resaltarcantidadProductoOrdenDetaProduMerma,this.productoordendetaprodumermaConstantesFunciones.activarcantidadProductoOrdenDetaProduMerma,iSizeTabla,this,true,"cantidadProductoOrdenDetaProduMerma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoordendetaprodumermaConstantesFunciones.resaltarcantidadProductoOrdenDetaProduMerma,this.productoordendetaprodumermaConstantesFunciones.activarcantidadProductoOrdenDetaProduMerma,this,true,"cantidadProductoOrdenDetaProduMerma","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduMermaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProduMerma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMerma,ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_COSTO));

		if(this.productoordendetaprodumermaConstantesFunciones.mostrarcostoProductoOrdenDetaProduMerma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_COSTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoordendetaprodumermaConstantesFunciones.resaltarcostoProductoOrdenDetaProduMerma,this.productoordendetaprodumermaConstantesFunciones.activarcostoProductoOrdenDetaProduMerma,iSizeTabla,this,true,"costoProductoOrdenDetaProduMerma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoordendetaprodumermaConstantesFunciones.resaltarcostoProductoOrdenDetaProduMerma,this.productoordendetaprodumermaConstantesFunciones.activarcostoProductoOrdenDetaProduMerma,this,true,"costoProductoOrdenDetaProduMerma","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduMermaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProduMerma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMerma,ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_COSTOTOTAL));

		if(this.productoordendetaprodumermaConstantesFunciones.mostrarcosto_totalProductoOrdenDetaProduMerma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_COSTOTOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoordendetaprodumermaConstantesFunciones.resaltarcosto_totalProductoOrdenDetaProduMerma,this.productoordendetaprodumermaConstantesFunciones.activarcosto_totalProductoOrdenDetaProduMerma,iSizeTabla,this,true,"costo_totalProductoOrdenDetaProduMerma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoordendetaprodumermaConstantesFunciones.resaltarcosto_totalProductoOrdenDetaProduMerma,this.productoordendetaprodumermaConstantesFunciones.activarcosto_totalProductoOrdenDetaProduMerma,this,true,"costo_totalProductoOrdenDetaProduMerma","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduMermaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProduMerma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMerma,ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_DESCRIPCION));

		if(this.productoordendetaprodumermaConstantesFunciones.mostrardescripcionProductoOrdenDetaProduMerma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productoordendetaprodumermaConstantesFunciones.resaltardescripcionProductoOrdenDetaProduMerma,this.productoordendetaprodumermaConstantesFunciones.activardescripcionProductoOrdenDetaProduMerma,iSizeTabla,this,true,"descripcionProductoOrdenDetaProduMerma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoordendetaprodumermaConstantesFunciones.resaltardescripcionProductoOrdenDetaProduMerma,this.productoordendetaprodumermaConstantesFunciones.activardescripcionProductoOrdenDetaProduMerma,this,true,"descripcionProductoOrdenDetaProduMerma","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduMermaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductoOrdenDetaProduMerma.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductoOrdenDetaProduMerma.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProductoOrdenDetaProduMerma && this.isPermisoGuardarCambiosProductoOrdenDetaProduMerma) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProductoOrdenDetaProduMerma.addColumn(tableColumn);
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
			
			this.jTableDatosProductoOrdenDetaProduMerma.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductoOrdenDetaProduMerma && this.isPermisoGuardarCambiosProductoOrdenDetaProduMerma) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductoOrdenDetaProduMerma && this.isPermisoGuardarCambiosProductoOrdenDetaProduMerma) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProductoOrdenDetaProduMerma.moveColumn(this.jTableDatosProductoOrdenDetaProduMerma.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProductoOrdenDetaProduMerma.moveColumn(this.jTableDatosProductoOrdenDetaProduMerma.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProductoOrdenDetaProduMerma.moveColumn(this.jTableDatosProductoOrdenDetaProduMerma.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProductoOrdenDetaProduMerma.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProductoOrdenDetaProduMerma.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProductoOrdenDetaProduMerma,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProductoOrdenDetaProduMermaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProductoOrdenDetaProduMerma.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProductoOrdenDetaProduMerma.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProductoOrdenDetaProduMermaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProductoOrdenDetaProduMermaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProductoOrdenDetaProduMerma.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProductoOrdenDetaProduMerma.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProductoOrdenDetaProduMerma.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=productoordendetaprodumermas.size()-1;
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
		//this.jTableDatosProductoOrdenDetaProduMerma.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProductoOrdenDetaProduMerma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProductoOrdenDetaProduMerma();
			
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
				
				//this.isEsNuevoProductoOrdenDetaProduMerma=false;
					
				ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
			
				if(this.productoordendetaprodumermaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductoOrdenDetaProduMerma.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductoOrdenDetaProduMerma.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermas.toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.productoordendetaprodumerma.getsType().equals("DUPLICADO")
				   || this.productoordendetaprodumerma.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProductoOrdenDetaProduMerma=true;
				
				} else {
					this.isEsNuevoProductoOrdenDetaProduMerma=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {
					if(this.productoordendetaprodumerma.getId()>=0 && !this.productoordendetaprodumerma.getIsNew()) {						
						this.isEsNuevoProductoOrdenDetaProduMerma=false;
						
					} else {
						this.isEsNuevoProductoOrdenDetaProduMerma=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProductoOrdenDetaProduMerma(esRelaciones);						
				
				this.seleccionarProductoOrdenDetaProduMerma(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.productoordendetaprodumerma.getId()<0) {
					this.isEsNuevoProductoOrdenDetaProduMerma=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProductoOrdenDetaProduMerma(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProductoOrdenDetaProduMerma(evt,rowIndex);
				}	
				
				if(this.productoordendetaprodumermaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProductoOrdenDetaProduMerma: " + this.dDif); 
					}
				}								
				
				ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProductoOrdenDetaProduMerma(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.productoordendetaprodumerma)) {
					if(this.productoordendetaprodumerma.getId()>0) {
						this.productoordendetaprodumerma.setIsDeleted(true);
						
						this.productoordendetaprodumermasEliminados.add(this.productoordendetaprodumerma);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().remove(this.productoordendetaprodumerma);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodumermas.remove(this.productoordendetaprodumerma);				
					}
					
					
					((ProductoOrdenDetaProduMermaModel) this.jTableDatosProductoOrdenDetaProduMerma.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoOrdenDetaProduMerma(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProductoOrdenDetaProduMerma(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProductoOrdenDetaProduMerma) {
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductoOrdenDetaProduMerma.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductoOrdenDetaProduMerma.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermas.toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProductoOrdenDetaProduMermaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProductoOrdenDetaProduMerma(this.productoordendetaprodumerma);
				}
				
				//ARCHITECTURE
				try {
					

					//OrdenDetaProdu
					if(!this.productoordendetaprodumermaConstantesFunciones.cargarid_orden_deta_produProductoOrdenDetaProduMerma || this.productoordendetaprodumermaConstantesFunciones.event_dependid_orden_deta_produProductoOrdenDetaProduMerma) {
						//this.cargarCombosOrdenDetaProdusForeignKeyLista(" where id="+this.productoordendetaprodumerma.getid_orden_deta_produ());
									//this.inicializarActualizarBindingProductoOrdenDetaProduMerma(false,false);
						this.ordendetaprodusForeignKey=new ArrayList<OrdenDetaProdu>();

						if(productoordendetaprodumerma.getOrdenDetaProdu()!=null) {
							this.ordendetaprodusForeignKey.add(productoordendetaprodumerma.getOrdenDetaProdu());
						}

						this.addItemDefectoCombosForeignKeyOrdenDetaProdu();
						this.cargarCombosFrameOrdenDetaProdusForeignKey("Todos");
					}
					this.setActualOrdenDetaProduForeignKey(this.productoordendetaprodumerma.getid_orden_deta_produ(),false,"Formulario");

					//TipoMermaEmpresa
					if(!this.productoordendetaprodumermaConstantesFunciones.cargarid_tipo_merma_empresaProductoOrdenDetaProduMerma || this.productoordendetaprodumermaConstantesFunciones.event_dependid_tipo_merma_empresaProductoOrdenDetaProduMerma) {
						//this.cargarCombosTipoMermaEmpresasForeignKeyLista(" where id="+this.productoordendetaprodumerma.getid_tipo_merma_empresa());
									//this.inicializarActualizarBindingProductoOrdenDetaProduMerma(false,false);
						this.tipomermaempresasForeignKey=new ArrayList<TipoMermaEmpresa>();

						if(productoordendetaprodumerma.getTipoMermaEmpresa()!=null) {
							this.tipomermaempresasForeignKey.add(productoordendetaprodumerma.getTipoMermaEmpresa());
						}

						this.addItemDefectoCombosForeignKeyTipoMermaEmpresa();
						this.cargarCombosFrameTipoMermaEmpresasForeignKey("Todos");
					}
					this.setActualTipoMermaEmpresaForeignKey(this.productoordendetaprodumerma.getid_tipo_merma_empresa(),false,"Formulario");

					//Unidad
					if(!this.productoordendetaprodumermaConstantesFunciones.cargarid_unidadProductoOrdenDetaProduMerma || this.productoordendetaprodumermaConstantesFunciones.event_dependid_unidadProductoOrdenDetaProduMerma) {
						//this.cargarCombosUnidadsForeignKeyLista(" where id="+this.productoordendetaprodumerma.getid_unidad());
									//this.inicializarActualizarBindingProductoOrdenDetaProduMerma(false,false);
						this.unidadsForeignKey=new ArrayList<Unidad>();

						if(productoordendetaprodumerma.getUnidad()!=null) {
							this.unidadsForeignKey.add(productoordendetaprodumerma.getUnidad());
						}

						this.addItemDefectoCombosForeignKeyUnidad();
						this.cargarCombosFrameUnidadsForeignKey("Todos");
					}
					this.setActualUnidadForeignKey(this.productoordendetaprodumerma.getid_unidad(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduMerma("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProductoOrdenDetaProduMerma(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProduMerma() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductoOrdenDetaProduMerma(ProductoOrdenDetaProduMerma productoordendetaprodumerma) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProductoOrdenDetaProduMerma(productoordendetaprodumerma,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductoOrdenDetaProduMerma(ProductoOrdenDetaProduMerma productoordendetaprodumerma,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProductoOrdenDetaProduMerma(productoordendetaprodumerma);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProductoOrdenDetaProduMerma(productoordendetaprodumerma,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProductoOrdenDetaProduMerma(productoordendetaprodumerma);
	}
	
	public void setVariablesObjetoActualToFormularioProductoOrdenDetaProduMerma(ProductoOrdenDetaProduMerma productoordendetaprodumerma) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jLabelidProductoOrdenDetaProduMerma.setText(productoordendetaprodumerma.getId().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTextFieldcantidadProductoOrdenDetaProduMerma.setText(productoordendetaprodumerma.getcantidad().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTextFieldcostoProductoOrdenDetaProduMerma.setText(productoordendetaprodumerma.getcosto().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTextFieldcosto_totalProductoOrdenDetaProduMerma.setText(productoordendetaprodumerma.getcosto_total().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTextAreadescripcionProductoOrdenDetaProduMerma.setText(productoordendetaprodumerma.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProductoOrdenDetaProduMerma productoordendetaprodumermaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,productoordendetaprodumermaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProductoOrdenDetaProduMerma productoordendetaprodumermaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				productoordendetaprodumermaLocal=this.productoordendetaprodumerma;
			} else {
				productoordendetaprodumermaLocal=this.productoordendetaprodumermaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(productoordendetaprodumermaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProductoOrdenDetaProduMerma(productoordendetaprodumermaLocal,true);
					
					if(productoordendetaprodumermaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(productoordendetaprodumermaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(productoordendetaprodumermaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProductoOrdenDetaProduMerma(ProductoOrdenDetaProduMerma productoordendetaprodumerma,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMerma(productoordendetaprodumerma,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMerma(productoordendetaprodumerma);
	}
	
	public void setVariablesFormularioToObjetoActualProductoOrdenDetaProduMerma(ProductoOrdenDetaProduMerma productoordendetaprodumerma,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMerma(productoordendetaprodumerma,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProductoOrdenDetaProduMerma(ProductoOrdenDetaProduMerma productoordendetaprodumerma,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jLabelidProductoOrdenDetaProduMerma.getText()==null || this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jLabelidProductoOrdenDetaProduMerma.getText()=="" || this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jLabelidProductoOrdenDetaProduMerma.getText()=="Id") {
				this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jLabelidProductoOrdenDetaProduMerma.setText("0");
			}

			if(conColumnasBase) {productoordendetaprodumerma.setId(Long.parseLong(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jLabelidProductoOrdenDetaProduMerma.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jLabelIdProductoOrdenDetaProduMerma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoordendetaprodumerma.setcantidad(Integer.parseInt(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTextFieldcantidadProductoOrdenDetaProduMerma.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jLabelcantidadProductoOrdenDetaProduMerma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoordendetaprodumerma.setcosto(Double.parseDouble(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTextFieldcostoProductoOrdenDetaProduMerma.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_COSTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jLabelcostoProductoOrdenDetaProduMerma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoordendetaprodumerma.setcosto_total(Double.parseDouble(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTextFieldcosto_totalProductoOrdenDetaProduMerma.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_COSTOTOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jLabelcosto_totalProductoOrdenDetaProduMerma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoordendetaprodumerma.setdescripcion(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTextAreadescripcionProductoOrdenDetaProduMerma.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jLabeldescripcionProductoOrdenDetaProduMerma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductoOrdenDetaProduMerma(ProductoOrdenDetaProduMerma productoordendetaprodumermaBean,ProductoOrdenDetaProduMerma productoordendetaprodumerma,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && productoordendetaprodumermaBean.getid_orden_deta_produ()!=null && !productoordendetaprodumermaBean.getid_orden_deta_produ().equals(-1L))) {productoordendetaprodumerma.setid_orden_deta_produ(productoordendetaprodumermaBean.getid_orden_deta_produ());}
			if(conDefault || (!conDefault && productoordendetaprodumermaBean.getid_tipo_merma_empresa()!=null && !productoordendetaprodumermaBean.getid_tipo_merma_empresa().equals(-1L))) {productoordendetaprodumerma.setid_tipo_merma_empresa(productoordendetaprodumermaBean.getid_tipo_merma_empresa());}
			if(conDefault || (!conDefault && productoordendetaprodumermaBean.getid_unidad()!=null && !productoordendetaprodumermaBean.getid_unidad().equals(-1L))) {productoordendetaprodumerma.setid_unidad(productoordendetaprodumermaBean.getid_unidad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProductoOrdenDetaProduMerma(ProductoOrdenDetaProduMerma productoordendetaprodumermaOrigen,ProductoOrdenDetaProduMerma productoordendetaprodumerma,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productoordendetaprodumermaOrigen.getId()!=null && !productoordendetaprodumermaOrigen.getId().equals(0L))) {productoordendetaprodumerma.setId(productoordendetaprodumermaOrigen.getId());}}
			if(conDefault || (!conDefault && productoordendetaprodumermaOrigen.getid_orden_deta_produ()!=null && !productoordendetaprodumermaOrigen.getid_orden_deta_produ().equals(-1L))) {productoordendetaprodumerma.setid_orden_deta_produ(productoordendetaprodumermaOrigen.getid_orden_deta_produ());}
			if(conDefault || (!conDefault && productoordendetaprodumermaOrigen.getid_tipo_merma_empresa()!=null && !productoordendetaprodumermaOrigen.getid_tipo_merma_empresa().equals(-1L))) {productoordendetaprodumerma.setid_tipo_merma_empresa(productoordendetaprodumermaOrigen.getid_tipo_merma_empresa());}
			if(conDefault || (!conDefault && productoordendetaprodumermaOrigen.getid_unidad()!=null && !productoordendetaprodumermaOrigen.getid_unidad().equals(-1L))) {productoordendetaprodumerma.setid_unidad(productoordendetaprodumermaOrigen.getid_unidad());}
			if(conDefault || (!conDefault && productoordendetaprodumermaOrigen.getcantidad()!=null && !productoordendetaprodumermaOrigen.getcantidad().equals(0))) {productoordendetaprodumerma.setcantidad(productoordendetaprodumermaOrigen.getcantidad());}
			if(conDefault || (!conDefault && productoordendetaprodumermaOrigen.getcosto()!=null && !productoordendetaprodumermaOrigen.getcosto().equals(0.0))) {productoordendetaprodumerma.setcosto(productoordendetaprodumermaOrigen.getcosto());}
			if(conDefault || (!conDefault && productoordendetaprodumermaOrigen.getcosto_total()!=null && !productoordendetaprodumermaOrigen.getcosto_total().equals(0.0))) {productoordendetaprodumerma.setcosto_total(productoordendetaprodumermaOrigen.getcosto_total());}
			if(conDefault || (!conDefault && productoordendetaprodumermaOrigen.getdescripcion()!=null && !productoordendetaprodumermaOrigen.getdescripcion().equals(""))) {productoordendetaprodumerma.setdescripcion(productoordendetaprodumermaOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductoOrdenDetaProduMerma(ProductoOrdenDetaProduMerma productoordendetaprodumerma) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jLabelidProductoOrdenDetaProduMerma.setText(productoordendetaprodumerma.getId().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTextFieldcantidadProductoOrdenDetaProduMerma.setText(productoordendetaprodumerma.getcantidad().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTextFieldcostoProductoOrdenDetaProduMerma.setText(productoordendetaprodumerma.getcosto().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTextFieldcosto_totalProductoOrdenDetaProduMerma.setText(productoordendetaprodumerma.getcosto_total().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTextAreadescripcionProductoOrdenDetaProduMerma.setText(productoordendetaprodumerma.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductoOrdenDetaProduMerma(ProductoOrdenDetaProduMermaBean productoordendetaprodumermaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jLabelidProductoOrdenDetaProduMerma.setText(productoordendetaprodumermaBean.getId().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTextFieldcantidadProductoOrdenDetaProduMerma.setText(productoordendetaprodumermaBean.getcantidad().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTextFieldcostoProductoOrdenDetaProduMerma.setText(productoordendetaprodumermaBean.getcosto().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTextFieldcosto_totalProductoOrdenDetaProduMerma.setText(productoordendetaprodumermaBean.getcosto_total().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTextAreadescripcionProductoOrdenDetaProduMerma.setText(productoordendetaprodumermaBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProductoOrdenDetaProduMerma(ProductoOrdenDetaProduMermaParameterReturnGeneral productoordendetaprodumermaReturnGeneral,ProductoOrdenDetaProduMermaBean productoordendetaprodumermaBean,Boolean conDefault) throws Exception { 
		try {
			ProductoOrdenDetaProduMerma productoordendetaprodumermaLocal=new ProductoOrdenDetaProduMerma();
			
			productoordendetaprodumermaLocal=productoordendetaprodumermaReturnGeneral.getProductoOrdenDetaProduMerma();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productoordendetaprodumermaLocal.getId()!=null && !productoordendetaprodumermaLocal.getId().equals(0L))) {productoordendetaprodumermaBean.setId(productoordendetaprodumermaLocal.getId());}}
			if(conDefault || (!conDefault && productoordendetaprodumermaLocal.getid_orden_deta_produ()!=null && !productoordendetaprodumermaLocal.getid_orden_deta_produ().equals(-1L))) {productoordendetaprodumermaBean.setid_orden_deta_produ(productoordendetaprodumermaLocal.getid_orden_deta_produ());}
			if(conDefault || (!conDefault && productoordendetaprodumermaLocal.getid_tipo_merma_empresa()!=null && !productoordendetaprodumermaLocal.getid_tipo_merma_empresa().equals(-1L))) {productoordendetaprodumermaBean.setid_tipo_merma_empresa(productoordendetaprodumermaLocal.getid_tipo_merma_empresa());}
			if(conDefault || (!conDefault && productoordendetaprodumermaLocal.getid_unidad()!=null && !productoordendetaprodumermaLocal.getid_unidad().equals(-1L))) {productoordendetaprodumermaBean.setid_unidad(productoordendetaprodumermaLocal.getid_unidad());}
			if(conDefault || (!conDefault && productoordendetaprodumermaLocal.getcantidad()!=null && !productoordendetaprodumermaLocal.getcantidad().equals(0))) {productoordendetaprodumermaBean.setcantidad(productoordendetaprodumermaLocal.getcantidad());}
			if(conDefault || (!conDefault && productoordendetaprodumermaLocal.getcosto()!=null && !productoordendetaprodumermaLocal.getcosto().equals(0.0))) {productoordendetaprodumermaBean.setcosto(productoordendetaprodumermaLocal.getcosto());}
			if(conDefault || (!conDefault && productoordendetaprodumermaLocal.getcosto_total()!=null && !productoordendetaprodumermaLocal.getcosto_total().equals(0.0))) {productoordendetaprodumermaBean.setcosto_total(productoordendetaprodumermaLocal.getcosto_total());}
			if(conDefault || (!conDefault && productoordendetaprodumermaLocal.getdescripcion()!=null && !productoordendetaprodumermaLocal.getdescripcion().equals(""))) {productoordendetaprodumermaBean.setdescripcion(productoordendetaprodumermaLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProductoOrdenDetaProduMermaGenerico(Long idProductoOrdenDetaProduMermaSeleccionado,JComboBox jComboBoxProductoOrdenDetaProduMerma,List<ProductoOrdenDetaProduMerma> productoordendetaprodumermasLocal)throws Exception {
		try {
			ProductoOrdenDetaProduMerma  productoordendetaprodumermaTemp=null;

			for(ProductoOrdenDetaProduMerma productoordendetaprodumermaAux:productoordendetaprodumermasLocal) {
				if(productoordendetaprodumermaAux.getId()!=null && productoordendetaprodumermaAux.getId().equals(idProductoOrdenDetaProduMermaSeleccionado)) {
					productoordendetaprodumermaTemp=productoordendetaprodumermaAux;
					break;
				}
			}

			jComboBoxProductoOrdenDetaProduMerma.setSelectedItem(productoordendetaprodumermaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProductoOrdenDetaProduMermaGenerico(JComboBox jComboBoxProductoOrdenDetaProduMerma,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProductoOrdenDetaProduMerma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductoOrdenDetaProduMerma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProductoOrdenDetaProduMerma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductoOrdenDetaProduMerma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductoOrdenDetaProduMerma.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProductoOrdenDetaProduMerma.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductoOrdenDetaProduMerma.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProductoOrdenDetaProduMerma.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProductoOrdenDetaProduMerma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProductoOrdenDetaProduMerma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoordendetaprodumerma=(ProductoOrdenDetaProduMerma) productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) productoordendetaprodumermas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("OrdenDetaProdu")) {
			//sDescripcion=this.getActualOrdenDetaProduForeignKeyDescripcion((Long)value);
			if(!productoordendetaprodumerma.getIsNew() && !productoordendetaprodumerma.getIsChanged() && !productoordendetaprodumerma.getIsDeleted()) {
				sDescripcion=productoordendetaprodumerma.getordendetaprodu_descripcion();
			} else {
				//sDescripcion=this.getActualOrdenDetaProduForeignKeyDescripcion((Long)value);
				sDescripcion=productoordendetaprodumerma.getordendetaprodu_descripcion();
			}
		}

		if(sTipo.equals("TipoMermaEmpresa")) {
			//sDescripcion=this.getActualTipoMermaEmpresaForeignKeyDescripcion((Long)value);
			if(!productoordendetaprodumerma.getIsNew() && !productoordendetaprodumerma.getIsChanged() && !productoordendetaprodumerma.getIsDeleted()) {
				sDescripcion=productoordendetaprodumerma.gettipomermaempresa_descripcion();
			} else {
				//sDescripcion=this.getActualTipoMermaEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=productoordendetaprodumerma.gettipomermaempresa_descripcion();
			}
		}

		if(sTipo.equals("Unidad")) {
			//sDescripcion=this.getActualUnidadForeignKeyDescripcion((Long)value);
			if(!productoordendetaprodumerma.getIsNew() && !productoordendetaprodumerma.getIsChanged() && !productoordendetaprodumerma.getIsDeleted()) {
				sDescripcion=productoordendetaprodumerma.getunidad_descripcion();
			} else {
				//sDescripcion=this.getActualUnidadForeignKeyDescripcion((Long)value);
				sDescripcion=productoordendetaprodumerma.getunidad_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProductoOrdenDetaProduMerma productoordendetaprodumermaRow=new ProductoOrdenDetaProduMerma();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoordendetaprodumermaRow=(ProductoOrdenDetaProduMerma) productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productoordendetaprodumermaRow=(ProductoOrdenDetaProduMerma) productoordendetaprodumermas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProductoOrdenDetaProduMerma(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProductoOrdenDetaProduMerma.setVisible((this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMerma && this.isPermisoNuevoProductoOrdenDetaProduMerma));			
			this.jButtonDuplicarProductoOrdenDetaProduMerma.setVisible((this.isVisibilidadCeldaDuplicarProductoOrdenDetaProduMerma && this.isPermisoDuplicarProductoOrdenDetaProduMerma));			
			this.jButtonCopiarProductoOrdenDetaProduMerma.setVisible((this.isVisibilidadCeldaCopiarProductoOrdenDetaProduMerma && this.isPermisoCopiarProductoOrdenDetaProduMerma));
			this.jButtonVerFormProductoOrdenDetaProduMerma.setVisible((this.isVisibilidadCeldaVerFormProductoOrdenDetaProduMerma && this.isPermisoVerFormProductoOrdenDetaProduMerma));
			
			this.jButtonAbrirOrderByProductoOrdenDetaProduMerma.setVisible((this.isVisibilidadCeldaOrdenProductoOrdenDetaProduMerma && this.isPermisoOrdenProductoOrdenDetaProduMerma));			
			
			this.jButtonNuevoRelacionesProductoOrdenDetaProduMerma.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMerma && this.isPermisoNuevoProductoOrdenDetaProduMerma));			
			this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduMerma.setVisible((this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMerma && this.isPermisoNuevoProductoOrdenDetaProduMerma && this.isPermisoGuardarCambiosProductoOrdenDetaProduMerma));
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonModificarProductoOrdenDetaProduMerma.setVisible((this.isVisibilidadCeldaModificarProductoOrdenDetaProduMerma && this.isPermisoActualizarProductoOrdenDetaProduMerma));	
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonActualizarProductoOrdenDetaProduMerma.setVisible((this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMerma && this.isPermisoActualizarProductoOrdenDetaProduMerma));	
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonEliminarProductoOrdenDetaProduMerma.setVisible((this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMerma && this.isPermisoEliminarProductoOrdenDetaProduMerma));
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonCancelarProductoOrdenDetaProduMerma.setVisible(this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMerma);							
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonGuardarCambiosProductoOrdenDetaProduMerma.setVisible((this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMerma && this.isPermisoGuardarCambiosProductoOrdenDetaProduMerma));			
			
			}
						
			this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMerma.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMerma && this.isPermisoGuardarCambiosProductoOrdenDetaProduMerma));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProductoOrdenDetaProduMerma.setVisible((this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMerma && this.isPermisoNuevoProductoOrdenDetaProduMerma));						
			this.jButtonDuplicarToolBarProductoOrdenDetaProduMerma.setVisible((this.isVisibilidadCeldaDuplicarProductoOrdenDetaProduMerma && this.isPermisoDuplicarProductoOrdenDetaProduMerma));						
			this.jButtonCopiarToolBarProductoOrdenDetaProduMerma.setVisible((this.isVisibilidadCeldaCopiarProductoOrdenDetaProduMerma && this.isPermisoCopiarProductoOrdenDetaProduMerma));			
			this.jButtonVerFormToolBarProductoOrdenDetaProduMerma.setVisible((this.isVisibilidadCeldaVerFormProductoOrdenDetaProduMerma && this.isPermisoVerFormProductoOrdenDetaProduMerma));			
			this.jButtonAbrirOrderByToolBarProductoOrdenDetaProduMerma.setVisible((this.isVisibilidadCeldaOrdenProductoOrdenDetaProduMerma && this.isPermisoOrdenProductoOrdenDetaProduMerma));
			this.jButtonNuevoRelacionesToolBarProductoOrdenDetaProduMerma.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMerma && this.isPermisoNuevoProductoOrdenDetaProduMerma));			
			this.jButtonNuevoGuardarCambiosToolBarProductoOrdenDetaProduMerma.setVisible((this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMerma && this.isPermisoNuevoProductoOrdenDetaProduMerma && this.isPermisoGuardarCambiosProductoOrdenDetaProduMerma));			
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonModificarToolBarProductoOrdenDetaProduMerma.setVisible((this.isVisibilidadCeldaModificarProductoOrdenDetaProduMerma && this.isPermisoActualizarProductoOrdenDetaProduMerma));	
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonActualizarToolBarProductoOrdenDetaProduMerma.setVisible((this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMerma  && this.isPermisoActualizarProductoOrdenDetaProduMerma));	
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonEliminarToolBarProductoOrdenDetaProduMerma.setVisible((this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMerma && this.isPermisoEliminarProductoOrdenDetaProduMerma));
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonCancelarToolBarProductoOrdenDetaProduMerma.setVisible(this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMerma);				
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonGuardarCambiosToolBarProductoOrdenDetaProduMerma.setVisible((this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMerma && this.isPermisoGuardarCambiosProductoOrdenDetaProduMerma));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProductoOrdenDetaProduMerma.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMerma && this.isPermisoGuardarCambiosProductoOrdenDetaProduMerma));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProductoOrdenDetaProduMerma.setVisible((this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMerma && this.isPermisoNuevoProductoOrdenDetaProduMerma));			
			this.jMenuItemDuplicarProductoOrdenDetaProduMerma.setVisible((this.isVisibilidadCeldaDuplicarProductoOrdenDetaProduMerma && this.isPermisoDuplicarProductoOrdenDetaProduMerma));			
			this.jMenuItemCopiarProductoOrdenDetaProduMerma.setVisible((this.isVisibilidadCeldaCopiarProductoOrdenDetaProduMerma && this.isPermisoCopiarProductoOrdenDetaProduMerma));			
			this.jMenuItemVerFormProductoOrdenDetaProduMerma.setVisible((this.isVisibilidadCeldaVerFormProductoOrdenDetaProduMerma && this.isPermisoVerFormProductoOrdenDetaProduMerma));			
			this.jMenuItemAbrirOrderByProductoOrdenDetaProduMerma.setVisible((this.isVisibilidadCeldaOrdenProductoOrdenDetaProduMerma && this.isPermisoOrdenProductoOrdenDetaProduMerma));			
			//this.jMenuItemMostrarOcultarProductoOrdenDetaProduMerma.setVisible((this.isVisibilidadCeldaOrdenProductoOrdenDetaProduMerma && this.isPermisoOrdenProductoOrdenDetaProduMerma));
			this.jMenuItemDetalleAbrirOrderByProductoOrdenDetaProduMerma.setVisible((this.isVisibilidadCeldaOrdenProductoOrdenDetaProduMerma && this.isPermisoOrdenProductoOrdenDetaProduMerma));			
			//this.jMenuItemDetalleMostrarOcultarProductoOrdenDetaProduMerma.setVisible((this.isVisibilidadCeldaOrdenProductoOrdenDetaProduMerma && this.isPermisoOrdenProductoOrdenDetaProduMerma));			
			this.jMenuItemNuevoRelacionesProductoOrdenDetaProduMerma.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMerma && this.isPermisoNuevoProductoOrdenDetaProduMerma));			
			this.jMenuItemNuevoGuardarCambiosProductoOrdenDetaProduMerma.setVisible((this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMerma && this.isPermisoNuevoProductoOrdenDetaProduMerma && this.isPermisoGuardarCambiosProductoOrdenDetaProduMerma));									
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jMenuItemModificarProductoOrdenDetaProduMerma.setVisible((this.isVisibilidadCeldaModificarProductoOrdenDetaProduMerma && this.isPermisoActualizarProductoOrdenDetaProduMerma));	
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jMenuItemActualizarProductoOrdenDetaProduMerma.setVisible((this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMerma && this.isPermisoActualizarProductoOrdenDetaProduMerma));	
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jMenuItemEliminarProductoOrdenDetaProduMerma.setVisible((this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMerma && this.isPermisoEliminarProductoOrdenDetaProduMerma));
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jMenuItemCancelarProductoOrdenDetaProduMerma.setVisible(this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMerma);				
			}
			
			this.jMenuItemGuardarCambiosProductoOrdenDetaProduMerma.setVisible((this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMerma && this.isPermisoGuardarCambiosProductoOrdenDetaProduMerma));						
			this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProduMerma.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMerma && this.isPermisoGuardarCambiosProductoOrdenDetaProduMerma));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMerma=this.jButtonNuevoProductoOrdenDetaProduMerma.isVisible();
			this.isVisibilidadCeldaDuplicarProductoOrdenDetaProduMerma=this.jButtonDuplicarProductoOrdenDetaProduMerma.isVisible();
			this.isVisibilidadCeldaCopiarProductoOrdenDetaProduMerma=this.jButtonCopiarProductoOrdenDetaProduMerma.isVisible();
			this.isVisibilidadCeldaVerFormProductoOrdenDetaProduMerma=this.jButtonVerFormProductoOrdenDetaProduMerma.isVisible();
			
			this.isVisibilidadCeldaOrdenProductoOrdenDetaProduMerma=this.jButtonAbrirOrderByProductoOrdenDetaProduMerma.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMerma=this.jButtonNuevoRelacionesProductoOrdenDetaProduMerma.isVisible();
			this.isVisibilidadCeldaModificarProductoOrdenDetaProduMerma=this.jButtonModificarProductoOrdenDetaProduMerma.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) {
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMerma=this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonActualizarProductoOrdenDetaProduMerma.isVisible();
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMerma=this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonEliminarProductoOrdenDetaProduMerma.isVisible();
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMerma=this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonCancelarProductoOrdenDetaProduMerma.isVisible();
			this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMerma=this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonGuardarCambiosProductoOrdenDetaProduMerma.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMerma=this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMerma.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMerma=this.jButtonNuevoToolBarProductoOrdenDetaProduMerma.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMerma=this.jButtonNuevoRelacionesToolBarProductoOrdenDetaProduMerma.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) {
			this.isVisibilidadCeldaModificarProductoOrdenDetaProduMerma=this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonModificarToolBarProductoOrdenDetaProduMerma.isVisible();
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMerma=this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonActualizarToolBarProductoOrdenDetaProduMerma.isVisible();
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMerma=this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonEliminarToolBarProductoOrdenDetaProduMerma.isVisible();
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMerma=this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonCancelarToolBarProductoOrdenDetaProduMerma.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMerma=this.jButtonGuardarCambiosToolBarProductoOrdenDetaProduMerma.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMerma=this.jButtonGuardarCambiosTablaToolBarProductoOrdenDetaProduMerma.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMerma=this.jMenuItemNuevoProductoOrdenDetaProduMerma.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMerma=this.jMenuItemNuevoRelacionesProductoOrdenDetaProduMerma.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) {
			this.isVisibilidadCeldaModificarProductoOrdenDetaProduMerma=this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jMenuItemModificarProductoOrdenDetaProduMerma.isVisible();
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMerma=this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jMenuItemActualizarProductoOrdenDetaProduMerma.isVisible();
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMerma=this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jMenuItemEliminarProductoOrdenDetaProduMerma.isVisible();
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMerma=this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jMenuItemCancelarProductoOrdenDetaProduMerma.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMerma=this.jMenuItemGuardarCambiosProductoOrdenDetaProduMerma.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMerma=this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProduMerma.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProductoOrdenDetaProduMerma(Boolean esInicializar) {
		if(ProductoOrdenDetaProduMermaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.productoordendetaprodumermaSessionBean.getConGuardarRelaciones()) {
				//if(this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProductoOrdenDetaProduMerma();
			}
			
			this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProduMerma(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProductoOrdenDetaProduMerma() {
		this.jButtonNuevoProductoOrdenDetaProduMerma.setVisible(this.isPermisoNuevoProductoOrdenDetaProduMerma);			
		this.jButtonDuplicarProductoOrdenDetaProduMerma.setVisible(this.isPermisoDuplicarProductoOrdenDetaProduMerma);			
		this.jButtonCopiarProductoOrdenDetaProduMerma.setVisible(this.isPermisoCopiarProductoOrdenDetaProduMerma);			
		this.jButtonVerFormProductoOrdenDetaProduMerma.setVisible(this.isPermisoVerFormProductoOrdenDetaProduMerma);			
		
		this.jButtonAbrirOrderByProductoOrdenDetaProduMerma.setVisible(this.isPermisoOrdenProductoOrdenDetaProduMerma);					
		
		this.jButtonNuevoRelacionesProductoOrdenDetaProduMerma.setVisible(this.isPermisoNuevoProductoOrdenDetaProduMerma);			
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonModificarProductoOrdenDetaProduMerma.setVisible(this.isPermisoActualizarProductoOrdenDetaProduMerma);	
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonActualizarProductoOrdenDetaProduMerma.setVisible(this.isPermisoActualizarProductoOrdenDetaProduMerma);	
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonEliminarProductoOrdenDetaProduMerma.setVisible(this.isPermisoEliminarProductoOrdenDetaProduMerma);
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonCancelarProductoOrdenDetaProduMerma.setVisible(this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMerma);						
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonGuardarCambiosProductoOrdenDetaProduMerma.setVisible(this.isPermisoGuardarCambiosProductoOrdenDetaProduMerma);							
		}
		
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMerma.setVisible(this.isPermisoActualizarProductoOrdenDetaProduMerma);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProductoOrdenDetaProduMerma() {
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonModificarProductoOrdenDetaProduMerma.setVisible(this.isPermisoActualizarProductoOrdenDetaProduMerma);	
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonActualizarProductoOrdenDetaProduMerma.setVisible(this.isPermisoActualizarProductoOrdenDetaProduMerma);	
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonEliminarProductoOrdenDetaProduMerma.setVisible(this.isPermisoEliminarProductoOrdenDetaProduMerma);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonCancelarProductoOrdenDetaProduMerma.setVisible(this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMerma);							
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonGuardarCambiosProductoOrdenDetaProduMerma.setVisible((this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMerma && this.isPermisoGuardarCambiosProductoOrdenDetaProduMerma));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProductoOrdenDetaProduMerma() {
		if(ProductoOrdenDetaProduMermaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProductoOrdenDetaProduMerma();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProductoOrdenDetaProduMerma() {
	}
	
	public void jTableDatosProductoOrdenDetaProduMermaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProductoOrdenDetaProduMerma(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProductoOrdenDetaProduMermaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumermaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMerma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMerma(this.getproductoordendetaprodumerma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMerma(this.productoordendetaprodumerma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermas.toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodumerma==null) {
						this.productoordendetaprodumerma = new ProductoOrdenDetaProduMerma();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMerma(this.productoordendetaprodumerma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMerma(this.productoordendetaprodumerma);
				}

				if(this.productoordendetaprodumerma.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.productoordendetaprodumerma.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProduMerma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumermaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumermaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumermaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_orden_deta_produProductoOrdenDetaProduMermaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoordendetaprodu=true;

			idTienePermisoordendetaprodu=this.tienePermisosUsuarioEnPaginaWebProductoOrdenDetaProduMerma(OrdenDetaProduConstantesFunciones.CLASSNAME);

			if(idTienePermisoordendetaprodu) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMerma.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoOrdenDetaProduMerma.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoOrdenDetaProduMerma.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermas.toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMerma(this.getproductoordendetaprodumerma(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMerma(this.productoordendetaprodumerma);

				this.ordendetaproduBeanSwingJInternalFrame=new OrdenDetaProduBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ordendetaproduBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ordendetaproduBeanSwingJInternalFrame.getOrdenDetaProduLogic().setConnexion(this.productoordendetaprodumermaLogic.getConnexion());

				if(this.productoordendetaprodumerma.getid_orden_deta_produ()!=null) {
					this.ordendetaproduBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ordendetaproduBeanSwingJInternalFrame.setIdActual(this.productoordendetaprodumerma.getid_orden_deta_produ());
					this.ordendetaproduBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ordendetaproduBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ordendetaproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaOrdenDetaProdu();
				}

				JInternalFrameBase jinternalFrame =this.ordendetaproduBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoOrdenDetaProduMerma=(TitledBorder)this.jScrollPanelDatosProductoOrdenDetaProduMerma.getBorder();
				TitledBorder titledBorderordendetaprodu=(TitledBorder)this.ordendetaproduBeanSwingJInternalFrame.jScrollPanelDatosOrdenDetaProdu.getBorder();

				titledBorderordendetaprodu.setTitle(titledBorderProductoOrdenDetaProduMerma.getTitle() + " -> Orden Detalle Produccion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_orden_deta_produProductoOrdenDetaProduMermaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumermaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMerma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMerma(this.getproductoordendetaprodumerma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMerma(this.productoordendetaprodumerma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermas.toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodumerma==null) {
						this.productoordendetaprodumerma = new ProductoOrdenDetaProduMerma();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMerma(this.productoordendetaprodumerma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMerma(this.productoordendetaprodumerma);
				}

				if(this.productoordendetaprodumerma.getid_orden_deta_produ()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_orden_deta_produ = "+this.productoordendetaprodumerma.getid_orden_deta_produ().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProduMerma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumermaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumermaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumermaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_merma_empresaProductoOrdenDetaProduMermaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipomermaempresa=true;

			idTienePermisotipomermaempresa=this.tienePermisosUsuarioEnPaginaWebProductoOrdenDetaProduMerma(TipoMermaEmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisotipomermaempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMerma.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoOrdenDetaProduMerma.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoOrdenDetaProduMerma.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermas.toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMerma(this.getproductoordendetaprodumerma(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMerma(this.productoordendetaprodumerma);

				this.tipomermaempresaBeanSwingJInternalFrame=new TipoMermaEmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipomermaempresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipomermaempresaBeanSwingJInternalFrame.getTipoMermaEmpresaLogic().setConnexion(this.productoordendetaprodumermaLogic.getConnexion());

				if(this.productoordendetaprodumerma.getid_tipo_merma_empresa()!=null) {
					this.tipomermaempresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipomermaempresaBeanSwingJInternalFrame.setIdActual(this.productoordendetaprodumerma.getid_tipo_merma_empresa());
					this.tipomermaempresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipomermaempresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipomermaempresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoMermaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.tipomermaempresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoOrdenDetaProduMerma=(TitledBorder)this.jScrollPanelDatosProductoOrdenDetaProduMerma.getBorder();
				TitledBorder titledBordertipomermaempresa=(TitledBorder)this.tipomermaempresaBeanSwingJInternalFrame.jScrollPanelDatosTipoMermaEmpresa.getBorder();

				titledBordertipomermaempresa.setTitle(titledBorderProductoOrdenDetaProduMerma.getTitle() + " -> Tipo Merma Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_merma_empresaProductoOrdenDetaProduMermaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumermaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMerma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMerma(this.getproductoordendetaprodumerma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMerma(this.productoordendetaprodumerma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermas.toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodumerma==null) {
						this.productoordendetaprodumerma = new ProductoOrdenDetaProduMerma();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMerma(this.productoordendetaprodumerma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMerma(this.productoordendetaprodumerma);
				}

				if(this.productoordendetaprodumerma.getid_tipo_merma_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_merma_empresa = "+this.productoordendetaprodumerma.getid_tipo_merma_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProduMerma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumermaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumermaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumermaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_unidadProductoOrdenDetaProduMermaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisounidad=true;

			idTienePermisounidad=this.tienePermisosUsuarioEnPaginaWebProductoOrdenDetaProduMerma(UnidadConstantesFunciones.CLASSNAME);

			if(idTienePermisounidad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMerma.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoOrdenDetaProduMerma.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoOrdenDetaProduMerma.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermas.toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMerma(this.getproductoordendetaprodumerma(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMerma(this.productoordendetaprodumerma);

				this.unidadBeanSwingJInternalFrame=new UnidadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.unidadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.unidadBeanSwingJInternalFrame.getUnidadLogic().setConnexion(this.productoordendetaprodumermaLogic.getConnexion());

				if(this.productoordendetaprodumerma.getid_unidad()!=null) {
					this.unidadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.unidadBeanSwingJInternalFrame.setIdActual(this.productoordendetaprodumerma.getid_unidad());
					this.unidadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.inicializarActualizarBindingTablaUnidad();
				}

				JInternalFrameBase jinternalFrame =this.unidadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoOrdenDetaProduMerma=(TitledBorder)this.jScrollPanelDatosProductoOrdenDetaProduMerma.getBorder();
				TitledBorder titledBorderunidad=(TitledBorder)this.unidadBeanSwingJInternalFrame.jScrollPanelDatosUnidad.getBorder();

				titledBorderunidad.setTitle(titledBorderProductoOrdenDetaProduMerma.getTitle() + " -> Unidad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_unidadProductoOrdenDetaProduMermaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumermaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMerma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMerma(this.getproductoordendetaprodumerma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMerma(this.productoordendetaprodumerma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermas.toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodumerma==null) {
						this.productoordendetaprodumerma = new ProductoOrdenDetaProduMerma();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMerma(this.productoordendetaprodumerma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMerma(this.productoordendetaprodumerma);
				}

				if(this.productoordendetaprodumerma.getid_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_unidad = "+this.productoordendetaprodumerma.getid_unidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProduMerma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumermaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumermaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumermaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadProductoOrdenDetaProduMermaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumermaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMerma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMerma(this.getproductoordendetaprodumerma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMerma(this.productoordendetaprodumerma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermas.toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodumerma==null) {
						this.productoordendetaprodumerma = new ProductoOrdenDetaProduMerma();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMerma(this.productoordendetaprodumerma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMerma(this.productoordendetaprodumerma);
				}

				if(this.productoordendetaprodumerma.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.productoordendetaprodumerma.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProduMerma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumermaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumermaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumermaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncostoProductoOrdenDetaProduMermaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumermaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMerma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMerma(this.getproductoordendetaprodumerma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMerma(this.productoordendetaprodumerma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermas.toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodumerma==null) {
						this.productoordendetaprodumerma = new ProductoOrdenDetaProduMerma();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMerma(this.productoordendetaprodumerma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMerma(this.productoordendetaprodumerma);
				}

				if(this.productoordendetaprodumerma.getcosto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo = "+this.productoordendetaprodumerma.getcosto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProduMerma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumermaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumermaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumermaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncosto_totalProductoOrdenDetaProduMermaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumermaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMerma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMerma(this.getproductoordendetaprodumerma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMerma(this.productoordendetaprodumerma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermas.toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodumerma==null) {
						this.productoordendetaprodumerma = new ProductoOrdenDetaProduMerma();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMerma(this.productoordendetaprodumerma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMerma(this.productoordendetaprodumerma);
				}

				if(this.productoordendetaprodumerma.getcosto_total()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo_total = "+this.productoordendetaprodumerma.getcosto_total().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProduMerma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumermaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumermaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumermaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionProductoOrdenDetaProduMermaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumermaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMerma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMerma(this.getproductoordendetaprodumerma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMerma(this.productoordendetaprodumerma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermas.toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodumerma==null) {
						this.productoordendetaprodumerma = new ProductoOrdenDetaProduMerma();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMerma(this.productoordendetaprodumerma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMerma(this.productoordendetaprodumerma);
				}

				if(this.productoordendetaprodumerma.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.productoordendetaprodumerma.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProduMerma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumermaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumermaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumermaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduMermaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoOrdenDetaProduMerma(false,false);

			this.getProductoOrdenDetaProduMermasFK_IdOrdenDetaProdu();

			this.inicializarActualizarBindingProductoOrdenDetaProduMerma(false);

			//if(ProductoOrdenDetaProduMermaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoOrdenDetaProduMerma(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoMermaEmpresaProductoOrdenDetaProduMermaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoOrdenDetaProduMerma(false,false);

			this.getProductoOrdenDetaProduMermasFK_IdTipoMermaEmpresa();

			this.inicializarActualizarBindingProductoOrdenDetaProduMerma(false);

			//if(ProductoOrdenDetaProduMermaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoOrdenDetaProduMerma(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUnidadProductoOrdenDetaProduMermaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoOrdenDetaProduMerma(false,false);

			this.getProductoOrdenDetaProduMermasFK_IdUnidad();

			this.inicializarActualizarBindingProductoOrdenDetaProduMerma(false);

			//if(ProductoOrdenDetaProduMermaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoOrdenDetaProduMerma(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumermaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProductoOrdenDetaProduMerma() {
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.setVisible(false);	    			
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.dispose();
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma!=null) {
			this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.dispose();
			this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma=null;
		}
		
		if(this.jInternalFrameImportacionProductoOrdenDetaProduMerma!=null) {
			this.jInternalFrameImportacionProductoOrdenDetaProduMerma.setVisible(false);	    			
			this.jInternalFrameImportacionProductoOrdenDetaProduMerma.dispose();
			this.jInternalFrameImportacionProductoOrdenDetaProduMerma=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProductoOrdenDetaProduMerma();
			
			ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
			
			
			if(sTipo.equals("NuevoProductoOrdenDetaProduMerma")) {
				jButtonNuevoProductoOrdenDetaProduMermaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProductoOrdenDetaProduMerma")) {
				jButtonDuplicarProductoOrdenDetaProduMermaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProductoOrdenDetaProduMerma")) {
				jButtonCopiarProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("VerFormProductoOrdenDetaProduMerma")) {
				jButtonVerFormProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProductoOrdenDetaProduMerma")) {
				jButtonNuevoProductoOrdenDetaProduMermaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProductoOrdenDetaProduMerma")) {
				jButtonDuplicarProductoOrdenDetaProduMermaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProductoOrdenDetaProduMerma")) {
				jButtonNuevoProductoOrdenDetaProduMermaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProductoOrdenDetaProduMerma")) {
				jButtonDuplicarProductoOrdenDetaProduMermaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProductoOrdenDetaProduMerma")) {
				jButtonNuevoProductoOrdenDetaProduMermaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProductoOrdenDetaProduMerma")) {
				jButtonNuevoProductoOrdenDetaProduMermaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProductoOrdenDetaProduMerma")) {
				jButtonNuevoProductoOrdenDetaProduMermaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProductoOrdenDetaProduMerma")) {
				jButtonModificarProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProductoOrdenDetaProduMerma")) {
				jButtonModificarProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProductoOrdenDetaProduMerma")) {
				jButtonModificarProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProductoOrdenDetaProduMerma")) {
				jButtonActualizarProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProductoOrdenDetaProduMerma")) {
				jButtonActualizarProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProductoOrdenDetaProduMerma")) {
				jButtonActualizarProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("EliminarProductoOrdenDetaProduMerma")) {
				jButtonEliminarProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProductoOrdenDetaProduMerma")) {
				jButtonEliminarProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProductoOrdenDetaProduMerma")) {
				jButtonEliminarProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("CancelarProductoOrdenDetaProduMerma")) {
				jButtonCancelarProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProductoOrdenDetaProduMerma")) {
				jButtonCancelarProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProductoOrdenDetaProduMerma")) {
				jButtonCancelarProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("CerrarProductoOrdenDetaProduMerma")) {
				jButtonCerrarProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProductoOrdenDetaProduMerma")) {
				jButtonCerrarProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProductoOrdenDetaProduMerma")) {
				jButtonCerrarProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProductoOrdenDetaProduMerma")) {
				jButtonMostrarOcultarProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProductoOrdenDetaProduMerma")) {
				jButtonCancelarProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProductoOrdenDetaProduMerma")) {
				jButtonGuardarCambiosProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProductoOrdenDetaProduMerma")) {
				jButtonGuardarCambiosProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProductoOrdenDetaProduMerma")) {
				jButtonCopiarProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProductoOrdenDetaProduMerma")) {
				jButtonVerFormProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProductoOrdenDetaProduMerma")) {
				jButtonGuardarCambiosProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProductoOrdenDetaProduMerma")) {
				jButtonCopiarProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProductoOrdenDetaProduMerma")) {
				jButtonVerFormProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProductoOrdenDetaProduMerma")) {
				jButtonGuardarCambiosProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProductoOrdenDetaProduMerma")) {
				jButtonGuardarCambiosProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProductoOrdenDetaProduMerma")) {
				jButtonGuardarCambiosProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProductoOrdenDetaProduMerma")) {
				jButtonRecargarInformacionProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProductoOrdenDetaProduMerma")) {
				jButtonRecargarInformacionProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProductoOrdenDetaProduMerma")) {
				jButtonRecargarInformacionProductoOrdenDetaProduMermaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProductoOrdenDetaProduMerma")) {
				jButtonAnterioresProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProductoOrdenDetaProduMerma")) {
				jButtonAnterioresProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProductoOrdenDetaProduMerma")) {
				jButtonAnterioresProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProductoOrdenDetaProduMerma")) {
				jButtonSiguientesProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProductoOrdenDetaProduMerma")) {
				jButtonSiguientesProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProductoOrdenDetaProduMerma")) {
				jButtonSiguientesProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProductoOrdenDetaProduMerma") || sTipo.equals("MenuItemDetalleAbrirOrderByProductoOrdenDetaProduMerma")) {
				jButtonAbrirOrderByProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProductoOrdenDetaProduMerma") || sTipo.equals("MenuItemDetalleMostrarOcultarProductoOrdenDetaProduMerma")) {
				jButtonMostrarOcultarProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProductoOrdenDetaProduMerma")) {
				jButtonNuevoGuardarCambiosProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProductoOrdenDetaProduMerma")) {
				jButtonNuevoGuardarCambiosProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProductoOrdenDetaProduMerma")) {
				jButtonNuevoGuardarCambiosProductoOrdenDetaProduMermaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProductoOrdenDetaProduMerma")) {
				jButtonCerrarReporteDinamicoProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProductoOrdenDetaProduMerma")) {
				jButtonGenerarReporteDinamicoProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProductoOrdenDetaProduMerma")) {
				
				jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduMermaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProductoOrdenDetaProduMerma")) {
				jButtonCerrarImportacionProductoOrdenDetaProduMermaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProductoOrdenDetaProduMerma")) {
				
				jButtonGenerarImportacionProductoOrdenDetaProduMermaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProductoOrdenDetaProduMerma")) {
				
				jButtonAbrirImportacionProductoOrdenDetaProduMermaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProductoOrdenDetaProduMerma")) {
				jComboBoxTiposAccionesProductoOrdenDetaProduMermaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProductoOrdenDetaProduMerma")) {
				jComboBoxTiposRelacionesProductoOrdenDetaProduMermaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProductoOrdenDetaProduMerma")) {
				jComboBoxTiposAccionesProductoOrdenDetaProduMermaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProductoOrdenDetaProduMerma")) {
				
				jComboBoxTiposSeleccionarProductoOrdenDetaProduMermaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProductoOrdenDetaProduMerma")) {
				jTextFieldValorCampoGeneralProductoOrdenDetaProduMermaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProductoOrdenDetaProduMerma")) {
				jButtonAbrirOrderByProductoOrdenDetaProduMermaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProductoOrdenDetaProduMerma")) {
				jButtonAbrirOrderByProductoOrdenDetaProduMermaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProductoOrdenDetaProduMerma")) {
				jButtonCerrarOrderByProductoOrdenDetaProduMermaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductoOrdenDetaProduMermaBusqueda")) {
				this.jButtonidProductoOrdenDetaProduMermaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_orden_deta_produProductoOrdenDetaProduMermaUpdate")) {
				this.jButtonid_orden_deta_produProductoOrdenDetaProduMermaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_orden_deta_produProductoOrdenDetaProduMermaBusqueda")) {
				this.jButtonid_orden_deta_produProductoOrdenDetaProduMermaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_merma_empresaProductoOrdenDetaProduMermaUpdate")) {
				this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMermaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_merma_empresaProductoOrdenDetaProduMermaBusqueda")) {
				this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMermaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadProductoOrdenDetaProduMermaUpdate")) {
				this.jButtonid_unidadProductoOrdenDetaProduMermaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadProductoOrdenDetaProduMermaBusqueda")) {
				this.jButtonid_unidadProductoOrdenDetaProduMermaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadProductoOrdenDetaProduMermaBusqueda")) {
				this.jButtoncantidadProductoOrdenDetaProduMermaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoProductoOrdenDetaProduMermaBusqueda")) {
				this.jButtoncostoProductoOrdenDetaProduMermaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_totalProductoOrdenDetaProduMermaBusqueda")) {
				this.jButtoncosto_totalProductoOrdenDetaProduMermaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionProductoOrdenDetaProduMermaBusqueda")) {
				this.jButtondescripcionProductoOrdenDetaProduMermaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdOrdenDetaProduProductoOrdenDetaProduMerma")) {
				this.jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduMermaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma")) {
				this.jButtonFK_IdTipoMermaEmpresaProductoOrdenDetaProduMermaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdUnidadProductoOrdenDetaProduMerma")) {
				this.jButtonFK_IdUnidadProductoOrdenDetaProduMermaActionPerformed(evt);
			}
			
			;
			
			
			ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProductoOrdenDetaProduMerma();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoOrdenDetaProduMermaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumerma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumerma);
				
				ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
				
				


				
				ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduMerma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduMerma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProductoOrdenDetaProduMerma productoordendetaprodumermaLocal=null;
			
			if(!this.getEsControlTabla()) {
				productoordendetaprodumermaLocal=this.productoordendetaprodumerma;
			} else {
				productoordendetaprodumermaLocal=this.productoordendetaprodumermaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumerma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumerma);
				
				ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
							
				
				


				
				ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduMerma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduMerma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoOrdenDetaProduMermaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProduMerma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumermaAnterior =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoordendetaprodumermaAnterior =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermas.toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
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
			
			ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
			
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
			
			


			
			ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoOrdenDetaProduMermaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumerma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumerma);
				
				ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
								
						
				


				
				ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduMerma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduMerma.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumerma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumerma);
				
				ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
								
				
				


				
				ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduMerma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduMerma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoOrdenDetaProduMermaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProduMerma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumermaAnterior =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoordendetaprodumermaAnterior =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermas.toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumerma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumerma);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoOrdenDetaProduMermaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProduMerma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumermaAnterior =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoordendetaprodumermaAnterior =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermas.toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoOrdenDetaProduMermaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumerma);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumerma);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumerma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumerma);
				
				ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
							
				
				


				
				ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduMerma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduMerma.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoOrdenDetaProduMermaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProduMerma.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodumermaAnterior =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productoordendetaprodumermaAnterior =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermas.toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
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
			
			ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
			
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
			
			


			
			ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoOrdenDetaProduMermaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumerma);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumerma);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumerma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumerma);
				
				ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
								
				
				


				
				ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduMerma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduMerma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoOrdenDetaProduMermaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProduMerma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumermaAnterior =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoordendetaprodumermaAnterior =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermas.toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoOrdenDetaProduMermaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumerma);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumerma);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoOrdenDetaProduMermaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumerma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumerma);
				
				ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProductoOrdenDetaProduMerma")) {
					jCheckBoxSeleccionarTodosProductoOrdenDetaProduMermaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProductoOrdenDetaProduMerma")) {
					jCheckBoxSeleccionadosProductoOrdenDetaProduMermaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProductoOrdenDetaProduMerma")) {
					
				}
				
				


				
				
				ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduMerma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduMerma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumerma);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumerma);
				
				ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
												
				
				


				
				
				ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduMerma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduMerma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoOrdenDetaProduMermaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProduMerma.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodumermaAnterior =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productoordendetaprodumermaAnterior =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermas.toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoOrdenDetaProduMermaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumerma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumerma);
				
				ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
				
				
				ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
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
			
			ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
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
			
			


			
			ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoOrdenDetaProduMermaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumerma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumerma);
				
				ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduMerma.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduMerma.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumerma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumerma);
				
				ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
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
				
				


				
				ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduMerma.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduMerma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoOrdenDetaProduMermaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProduMerma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumermaAnterior =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoordendetaprodumermaAnterior =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermas.toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProductoOrdenDetaProduMerma")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProductoOrdenDetaProduMermaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProduMerma.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.productoordendetaprodumerma =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermas.toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.productoordendetaprodumerma);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProductoOrdenDetaProduMerma")) {
				
				}
				
				ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProductoOrdenDetaProduMerma")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProductoOrdenDetaProduMerma.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProductoOrdenDetaProduMerma")) {
			
			}
			
			ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProductoOrdenDetaProduMerma();
			
			ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
			
			if(sTipo.equals("NuevoProductoOrdenDetaProduMerma")) {
				jButtonNuevoProductoOrdenDetaProduMermaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProductoOrdenDetaProduMerma")) {
				jButtonDuplicarProductoOrdenDetaProduMermaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProductoOrdenDetaProduMerma")) {
				jButtonCopiarProductoOrdenDetaProduMermaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProductoOrdenDetaProduMerma")) {
				jButtonVerFormProductoOrdenDetaProduMermaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProductoOrdenDetaProduMerma")) {
				jButtonNuevoProductoOrdenDetaProduMermaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProductoOrdenDetaProduMerma")) {
				jButtonModificarProductoOrdenDetaProduMermaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProductoOrdenDetaProduMerma")) {
				jButtonActualizarProductoOrdenDetaProduMermaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProductoOrdenDetaProduMerma")) {
				jButtonEliminarProductoOrdenDetaProduMermaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProductoOrdenDetaProduMerma")) {
				jButtonGuardarCambiosProductoOrdenDetaProduMermaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProductoOrdenDetaProduMerma")) {
				jButtonCancelarProductoOrdenDetaProduMermaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProductoOrdenDetaProduMerma")) {
				jButtonCerrarProductoOrdenDetaProduMermaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProductoOrdenDetaProduMerma")) {
				jButtonGuardarCambiosProductoOrdenDetaProduMermaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProductoOrdenDetaProduMerma")) {
				jButtonNuevoGuardarCambiosProductoOrdenDetaProduMermaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProductoOrdenDetaProduMerma")) {
				jButtonAbrirOrderByProductoOrdenDetaProduMermaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProductoOrdenDetaProduMerma")) {
				jButtonRecargarInformacionProductoOrdenDetaProduMermaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProductoOrdenDetaProduMerma")) {
				jButtonAnterioresProductoOrdenDetaProduMermaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProductoOrdenDetaProduMerma")) {
				jButtonSiguientesProductoOrdenDetaProduMermaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductoOrdenDetaProduMermaBusqueda")) {
				this.jButtonidProductoOrdenDetaProduMermaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_orden_deta_produProductoOrdenDetaProduMermaUpdate")) {
				this.jButtonid_orden_deta_produProductoOrdenDetaProduMermaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_orden_deta_produProductoOrdenDetaProduMermaBusqueda")) {
				this.jButtonid_orden_deta_produProductoOrdenDetaProduMermaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_merma_empresaProductoOrdenDetaProduMermaUpdate")) {
				this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMermaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_merma_empresaProductoOrdenDetaProduMermaBusqueda")) {
				this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMermaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadProductoOrdenDetaProduMermaUpdate")) {
				this.jButtonid_unidadProductoOrdenDetaProduMermaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadProductoOrdenDetaProduMermaBusqueda")) {
				this.jButtonid_unidadProductoOrdenDetaProduMermaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadProductoOrdenDetaProduMermaBusqueda")) {
				this.jButtoncantidadProductoOrdenDetaProduMermaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoProductoOrdenDetaProduMermaBusqueda")) {
				this.jButtoncostoProductoOrdenDetaProduMermaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_totalProductoOrdenDetaProduMermaBusqueda")) {
				this.jButtoncosto_totalProductoOrdenDetaProduMermaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionProductoOrdenDetaProduMermaBusqueda")) {
				this.jButtondescripcionProductoOrdenDetaProduMermaBusquedaActionPerformed(evt);
			}
			
			ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProductoOrdenDetaProduMerma();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProductoOrdenDetaProduMerma")) {
				closingInternalFrameProductoOrdenDetaProduMerma();
				
			} else if(sTipo.equals("jButtonCancelarProductoOrdenDetaProduMerma")) {
				JInternalFrameBase jInternalFrameDetalleFormProductoOrdenDetaProduMerma = (JInternalFrameBase)evt.getSource();
	            	
	            ProductoOrdenDetaProduMermaBeanSwingJInternalFrame jInternalFrameParent=(ProductoOrdenDetaProduMermaBeanSwingJInternalFrame)jInternalFrameDetalleFormProductoOrdenDetaProduMerma.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProductoOrdenDetaProduMermaActionPerformed(null);
			}
			
			ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productoordendetaprodumerma,new Object(),this.productoordendetaprodumermaParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProductoOrdenDetaProduMerma(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProductoOrdenDetaProduMerma(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProductoOrdenDetaProduMerma(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.productoordendetaprodumerma)) {
			if(!esControlTabla) {
				if(ProductoOrdenDetaProduMermaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMerma(this.productoordendetaprodumerma,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMerma(this.productoordendetaprodumerma);			
				}
				
				if(this.productoordendetaprodumermaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProductoOrdenDetaProduMerma(this.productoordendetaprodumerma,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.productoordendetaprodumermaReturnGeneral=productoordendetaprodumermaLogic.procesarEventosProductoOrdenDetaProduMermasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas(),this.productoordendetaprodumerma,this.productoordendetaprodumermaParameterGeneral,this.isEsNuevoProductoOrdenDetaProduMerma,classes);//this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMerma()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProductoOrdenDetaProduMerma(this.productoordendetaprodumermaReturnGeneral,this.productoordendetaprodumermaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.productoordendetaprodumermaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProductoOrdenDetaProduMerma(classes,this.productoordendetaprodumermaReturnGeneral,this.productoordendetaprodumermaBean,false);
					}
						
					if(this.productoordendetaprodumermaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProductoOrdenDetaProduMerma(this.productoordendetaprodumermaReturnGeneral.getProductoOrdenDetaProduMerma());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProductoOrdenDetaProduMerma(this.productoordendetaprodumermaReturnGeneral.getProductoOrdenDetaProduMerma());	
					}
						
					if(this.productoordendetaprodumermaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProductoOrdenDetaProduMerma(this.productoordendetaprodumermaReturnGeneral.getProductoOrdenDetaProduMerma(),classes);//this.productoordendetaprodumermaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProductoOrdenDetaProduMerma(this.productoordendetaprodumerma,classes);//this.productoordendetaprodumermaBean);									
				}
			
				if(ProductoOrdenDetaProduMermaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMerma(this.productoordendetaprodumerma,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMerma(this.productoordendetaprodumerma);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.productoordendetaprodumermaAnterior!=null) {
						this.productoordendetaprodumerma=this.productoordendetaprodumermaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.productoordendetaprodumermaReturnGeneral=productoordendetaprodumermaLogic.procesarEventosProductoOrdenDetaProduMermasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas(),this.productoordendetaprodumerma,this.productoordendetaprodumermaParameterGeneral,this.isEsNuevoProductoOrdenDetaProduMerma,classes);//this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMerma()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productoordendetaprodumermaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.productoordendetaprodumermaReturnGeneral.getProductoOrdenDetaProduMerma(),productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.productoordendetaprodumermaReturnGeneral.getProductoOrdenDetaProduMerma(),this.productoordendetaprodumermas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProductoOrdenDetaProduMerma.repaint();
				
				//((AbstractTableModel) this.jTableDatosProductoOrdenDetaProduMerma.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProductoOrdenDetaProduMerma();
			}
		}
	}
	
	public void actualizarVisualTableDatosProductoOrdenDetaProduMerma() throws Exception {
		
		ProductoOrdenDetaProduMermaModel productoordendetaprodumermaModel=(ProductoOrdenDetaProduMermaModel)this.jTableDatosProductoOrdenDetaProduMerma.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoordendetaprodumermaModel.productoordendetaprodumermas=this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			productoordendetaprodumermaModel.productoordendetaprodumermas=this.productoordendetaprodumermas;
		}
		
		
		((ProductoOrdenDetaProduMermaModel) this.jTableDatosProductoOrdenDetaProduMerma.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProductoOrdenDetaProduMerma() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getproductoordendetaprodumermaAnterior(),this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getproductoordendetaprodumermaAnterior(),this.productoordendetaprodumermas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProductoOrdenDetaProduMerma();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProductoOrdenDetaProduMerma(ProductoOrdenDetaProduMerma productoordendetaprodumerma,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
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
										
				ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoordendetaprodumerma,new Object(),generalEntityParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.productoordendetaprodumermaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProductoOrdenDetaProduMermaConstantesFunciones.getClassesRelationshipsOfProductoOrdenDetaProduMerma(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProductoOrdenDetaProduMermaConstantesFunciones.getClassesRelationshipsFromStringsOfProductoOrdenDetaProduMerma(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProductoOrdenDetaProduMerma(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoordendetaprodumerma,new Object(),generalEntityParameterGeneral,this.productoordendetaprodumermaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProductoOrdenDetaProduMerma(ProductoOrdenDetaProduMermaBean productoordendetaprodumermaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProductoOrdenDetaProduMerma(ArrayList<Classe> classes,ProductoOrdenDetaProduMermaReturnGeneral productoordendetaprodumermaReturnGeneral,ProductoOrdenDetaProduMermaBean productoordendetaprodumermaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProductoOrdenDetaProduMerma(ProductoOrdenDetaProduMerma productoordendetaprodumerma,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.productoordendetaprodumerma)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma = new ProductoOrdenDetaProduMermaDetalleFormJInternalFrame(jDesktopPane,this.productoordendetaprodumermaSessionBean.getConGuardarRelaciones(),this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.setVisible(false);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.setSelected(false);						
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.productoordendetaprodumermaLogic=this.productoordendetaprodumermaLogic;
		
		this.cargarCombosFrameForeignKeyProductoOrdenDetaProduMerma("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProductoOrdenDetaProduMerma();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductoOrdenDetaProduMerma();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProductoOrdenDetaProduMerma("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProductoOrdenDetaProduMerma();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductoOrdenDetaProduMerma"));
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonModificarProductoOrdenDetaProduMerma.addActionListener(new ButtonActionListener(this,"ModificarProductoOrdenDetaProduMerma"));

		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonModificarToolBarProductoOrdenDetaProduMerma.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductoOrdenDetaProduMerma"));
					
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jMenuItemModificarProductoOrdenDetaProduMerma.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductoOrdenDetaProduMerma"));		
		
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonActualizarProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"ActualizarProductoOrdenDetaProduMerma"));
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonActualizarToolBarProductoOrdenDetaProduMerma.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductoOrdenDetaProduMerma"));
						
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jMenuItemActualizarProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductoOrdenDetaProduMerma"));		
		
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonEliminarProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"EliminarProductoOrdenDetaProduMerma"));
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonEliminarToolBarProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductoOrdenDetaProduMerma"));
								
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jMenuItemEliminarProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductoOrdenDetaProduMerma"));		
		
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonCancelarProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"CancelarProductoOrdenDetaProduMerma"));
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonCancelarToolBarProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductoOrdenDetaProduMerma"));
					
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jMenuItemCancelarProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductoOrdenDetaProduMerma"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jMenuItemDetalleCerrarProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductoOrdenDetaProduMerma"));		
		
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonGuardarCambiosToolBarProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoOrdenDetaProduMerma"));
		
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonGuardarCambiosToolBarProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoOrdenDetaProduMerma"));
		
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductoOrdenDetaProduMerma"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonidProductoOrdenDetaProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"idProductoOrdenDetaProduMermaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonid_orden_deta_produProductoOrdenDetaProduMermaUpdate.addActionListener(new ButtonActionListener(this,"id_orden_deta_produProductoOrdenDetaProduMermaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonid_orden_deta_produProductoOrdenDetaProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"id_orden_deta_produProductoOrdenDetaProduMermaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMermaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_merma_empresaProductoOrdenDetaProduMermaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_merma_empresaProductoOrdenDetaProduMermaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonid_unidadProductoOrdenDetaProduMermaUpdate.addActionListener(new ButtonActionListener(this,"id_unidadProductoOrdenDetaProduMermaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonid_unidadProductoOrdenDetaProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadProductoOrdenDetaProduMermaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtoncantidadProductoOrdenDetaProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductoOrdenDetaProduMermaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtoncostoProductoOrdenDetaProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"costoProductoOrdenDetaProduMermaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtoncosto_totalProductoOrdenDetaProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalProductoOrdenDetaProduMermaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtondescripcionProductoOrdenDetaProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProductoOrdenDetaProduMermaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTabbedPaneRelacionesProductoOrdenDetaProduMerma.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductoOrdenDetaProduMerma"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProductoOrdenDetaProduMerma"));
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductoOrdenDetaProduMerma"));
		}
		
		this.jTableDatosProductoOrdenDetaProduMerma.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProductoOrdenDetaProduMerma"));
		
		this.jTableDatosProductoOrdenDetaProduMerma.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProductoOrdenDetaProduMerma"));
		
		this.jButtonNuevoProductoOrdenDetaProduMerma.addActionListener(new ButtonActionListener(this,"NuevoProductoOrdenDetaProduMerma"));
		
		this.jButtonDuplicarProductoOrdenDetaProduMerma.addActionListener(new ButtonActionListener(this,"DuplicarProductoOrdenDetaProduMerma"));
		
		this.jButtonCopiarProductoOrdenDetaProduMerma.addActionListener(new ButtonActionListener(this,"CopiarProductoOrdenDetaProduMerma"));
		
		this.jButtonVerFormProductoOrdenDetaProduMerma.addActionListener(new ButtonActionListener(this,"VerFormProductoOrdenDetaProduMerma"));
		
		
		this.jButtonNuevoToolBarProductoOrdenDetaProduMerma.addActionListener(new ButtonActionListener(this,"NuevoToolBarProductoOrdenDetaProduMerma"));
			
		this.jButtonDuplicarToolBarProductoOrdenDetaProduMerma.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProductoOrdenDetaProduMerma"));
			
		this.jMenuItemNuevoProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProductoOrdenDetaProduMerma"));
			
		this.jMenuItemDuplicarProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProductoOrdenDetaProduMerma"));		
		
		
		this.jButtonNuevoRelacionesProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProductoOrdenDetaProduMerma"));
		
		
		this.jButtonNuevoRelacionesToolBarProductoOrdenDetaProduMerma.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProductoOrdenDetaProduMerma"));
			
		this.jMenuItemNuevoRelacionesProductoOrdenDetaProduMerma.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProductoOrdenDetaProduMerma"));		
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonModificarProductoOrdenDetaProduMerma.addActionListener(new ButtonActionListener(this,"ModificarProductoOrdenDetaProduMerma"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonModificarToolBarProductoOrdenDetaProduMerma.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductoOrdenDetaProduMerma"));
			
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jMenuItemModificarProductoOrdenDetaProduMerma.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductoOrdenDetaProduMerma"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonActualizarProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"ActualizarProductoOrdenDetaProduMerma"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonActualizarToolBarProductoOrdenDetaProduMerma.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductoOrdenDetaProduMerma"));
				
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jMenuItemActualizarProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductoOrdenDetaProduMerma"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonEliminarProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"EliminarProductoOrdenDetaProduMerma"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonEliminarToolBarProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductoOrdenDetaProduMerma"));
						
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jMenuItemEliminarProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductoOrdenDetaProduMerma"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonCancelarProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"CancelarProductoOrdenDetaProduMerma"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonCancelarToolBarProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductoOrdenDetaProduMerma"));
			
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jMenuItemCancelarProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductoOrdenDetaProduMerma"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProductoOrdenDetaProduMerma"));		
		
		
		this.jButtonCerrarProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"CerrarProductoOrdenDetaProduMerma"));
		
		
		this.jButtonCerrarToolBarProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"CerrarToolBarProductoOrdenDetaProduMerma"));
			
		this.jMenuItemCerrarProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProductoOrdenDetaProduMerma"));
			
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jMenuItemDetalleCerrarProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductoOrdenDetaProduMerma"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonGuardarCambiosProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"GuardarCambiosProductoOrdenDetaProduMerma"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonGuardarCambiosToolBarProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoOrdenDetaProduMerma"));
		}
		
		this.jButtonCopiarToolBarProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"CopiarToolBarProductoOrdenDetaProduMerma"));
			
		this.jButtonVerFormToolBarProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"VerFormToolBarProductoOrdenDetaProduMerma"));
		
		this.jMenuItemGuardarCambiosProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProductoOrdenDetaProduMerma"));
			
		this.jMenuItemCopiarProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProductoOrdenDetaProduMerma"));		
		
		this.jMenuItemVerFormProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProductoOrdenDetaProduMerma"));		
		
		
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductoOrdenDetaProduMerma"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProductoOrdenDetaProduMerma"));
			
		this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductoOrdenDetaProduMerma"));		
		
		
		
		this.jButtonRecargarInformacionProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"RecargarInformacionProductoOrdenDetaProduMerma"));
					
		this.jButtonRecargarInformacionToolBarProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProductoOrdenDetaProduMerma"));
		
		this.jMenuItemRecargarInformacionProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProductoOrdenDetaProduMerma"));		
		
		
		
		this.jButtonAnterioresProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"AnterioresProductoOrdenDetaProduMerma"));
		
		
		this.jButtonAnterioresToolBarProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProductoOrdenDetaProduMerma"));
		
		this.jMenuItemAnterioresProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProductoOrdenDetaProduMerma"));		
		
		
		this.jButtonSiguientesProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"SiguientesProductoOrdenDetaProduMerma"));
		
		
		this.jButtonSiguientesToolBarProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProductoOrdenDetaProduMerma"));
			
		this.jMenuItemSiguientesProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProductoOrdenDetaProduMerma"));
			
		this.jMenuItemAbrirOrderByProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProductoOrdenDetaProduMerma"));
			
		this.jMenuItemMostrarOcultarProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProductoOrdenDetaProduMerma"));
			
		this.jMenuItemDetalleAbrirOrderByProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProductoOrdenDetaProduMerma"));
			
		this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProductoOrdenDetaProduMerma"));		
		
		
		this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProductoOrdenDetaProduMerma"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProductoOrdenDetaProduMerma"));
			
		this.jMenuItemNuevoGuardarCambiosProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProductoOrdenDetaProduMerma"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMerma.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProductoOrdenDetaProduMerma"));

		this.jCheckBoxSeleccionadosProductoOrdenDetaProduMerma.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProductoOrdenDetaProduMerma"));
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductoOrdenDetaProduMerma"));
		}
		
		
		this.jComboBoxTiposRelacionesProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"TiposRelacionesProductoOrdenDetaProduMerma"));
			
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"TiposAccionesProductoOrdenDetaProduMerma"));
					
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProductoOrdenDetaProduMerma"));
			
		this.jTextFieldValorCampoGeneralProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProductoOrdenDetaProduMerma"));		
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonidProductoOrdenDetaProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"idProductoOrdenDetaProduMermaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonid_orden_deta_produProductoOrdenDetaProduMermaUpdate.addActionListener(new ButtonActionListener(this,"id_orden_deta_produProductoOrdenDetaProduMermaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonid_orden_deta_produProductoOrdenDetaProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"id_orden_deta_produProductoOrdenDetaProduMermaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMermaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_merma_empresaProductoOrdenDetaProduMermaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_merma_empresaProductoOrdenDetaProduMermaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonid_unidadProductoOrdenDetaProduMermaUpdate.addActionListener(new ButtonActionListener(this,"id_unidadProductoOrdenDetaProduMermaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonid_unidadProductoOrdenDetaProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadProductoOrdenDetaProduMermaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtoncantidadProductoOrdenDetaProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductoOrdenDetaProduMermaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtoncostoProductoOrdenDetaProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"costoProductoOrdenDetaProduMermaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtoncosto_totalProductoOrdenDetaProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalProductoOrdenDetaProduMermaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtondescripcionProductoOrdenDetaProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProductoOrdenDetaProduMermaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduMerma.addActionListener(new ButtonActionListener(this,"FK_IdOrdenDetaProduProductoOrdenDetaProduMerma"));

			this.jButtonFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma.addActionListener(new ButtonActionListener(this,"FK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma"));

			this.jButtonFK_IdUnidadProductoOrdenDetaProduMerma.addActionListener(new ButtonActionListener(this,"FK_IdUnidadProductoOrdenDetaProduMerma"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma!=null) {
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoOrdenDetaProduMerma"));
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoOrdenDetaProduMerma"));
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMerma.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoOrdenDetaProduMerma"));
			}
			
			//this.jButtonCerrarReporteDinamicoProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoOrdenDetaProduMerma"));				
			//this.jButtonGenerarReporteDinamicoProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoOrdenDetaProduMerma"));
			//this.jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoOrdenDetaProduMerma"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProductoOrdenDetaProduMerma!=null) {
				this.jInternalFrameImportacionProductoOrdenDetaProduMerma.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductoOrdenDetaProduMerma"));
				this.jInternalFrameImportacionProductoOrdenDetaProduMerma.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductoOrdenDetaProduMerma"));
				this.jInternalFrameImportacionProductoOrdenDetaProduMerma.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductoOrdenDetaProduMerma"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"AbrirOrderByProductoOrdenDetaProduMerma"));
			
			this.jButtonAbrirOrderByToolBarProductoOrdenDetaProduMerma.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProductoOrdenDetaProduMerma"));			
			
			if(this.jInternalFrameOrderByProductoOrdenDetaProduMerma!=null) {
				this.jInternalFrameOrderByProductoOrdenDetaProduMerma.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductoOrdenDetaProduMerma"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTabbedPaneRelacionesProductoOrdenDetaProduMerma.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductoOrdenDetaProduMerma"));
		
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
            		closingInternalFrameProductoOrdenDetaProduMerma();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProductoOrdenDetaProduMerma = (JInternalFrameBase)event.getSource();
	            	
	            ProductoOrdenDetaProduMermaBeanSwingJInternalFrame jInternalFrameParent=(ProductoOrdenDetaProduMermaBeanSwingJInternalFrame)jInternalFrameDetalleFormProductoOrdenDetaProduMerma.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProductoOrdenDetaProduMermaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProductoOrdenDetaProduMerma.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProductoOrdenDetaProduMermaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProductoOrdenDetaProduMerma.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProductoOrdenDetaProduMerma.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoOrdenDetaProduMermaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoOrdenDetaProduMermaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoOrdenDetaProduMermaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProductoOrdenDetaProduMerma";
		inputMap = this.jButtonNuevoProductoOrdenDetaProduMerma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProductoOrdenDetaProduMerma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductoOrdenDetaProduMermaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoOrdenDetaProduMermaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoOrdenDetaProduMermaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoOrdenDetaProduMermaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProductoOrdenDetaProduMerma";
		inputMap = this.jButtonNuevoRelacionesProductoOrdenDetaProduMerma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProductoOrdenDetaProduMerma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductoOrdenDetaProduMermaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoOrdenDetaProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoOrdenDetaProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoOrdenDetaProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProductoOrdenDetaProduMerma";
		inputMap = this.jButtonModificarProductoOrdenDetaProduMerma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProductoOrdenDetaProduMerma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProductoOrdenDetaProduMermaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoOrdenDetaProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoOrdenDetaProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoOrdenDetaProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProductoOrdenDetaProduMerma";
		inputMap = this.jButtonActualizarProductoOrdenDetaProduMerma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProductoOrdenDetaProduMerma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProductoOrdenDetaProduMermaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoOrdenDetaProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoOrdenDetaProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoOrdenDetaProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProductoOrdenDetaProduMerma";
		inputMap = this.jButtonEliminarProductoOrdenDetaProduMerma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProductoOrdenDetaProduMerma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProductoOrdenDetaProduMermaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoOrdenDetaProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoOrdenDetaProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoOrdenDetaProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProductoOrdenDetaProduMerma";
		inputMap = this.jButtonCancelarProductoOrdenDetaProduMerma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProductoOrdenDetaProduMerma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProductoOrdenDetaProduMermaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoOrdenDetaProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoOrdenDetaProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoOrdenDetaProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProductoOrdenDetaProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProductoOrdenDetaProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProductoOrdenDetaProduMerma";
		inputMap = this.jButtonCerrarProductoOrdenDetaProduMerma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProductoOrdenDetaProduMerma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProductoOrdenDetaProduMermaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonGuardarCambiosProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoOrdenDetaProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoOrdenDetaProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoOrdenDetaProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoOrdenDetaProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoOrdenDetaProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoOrdenDetaProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProductoOrdenDetaProduMerma";
		inputMap = this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonGuardarCambiosProductoOrdenDetaProduMerma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonGuardarCambiosProductoOrdenDetaProduMerma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProductoOrdenDetaProduMermaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoOrdenDetaProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoOrdenDetaProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoOrdenDetaProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoOrdenDetaProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoOrdenDetaProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoOrdenDetaProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoOrdenDetaProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoOrdenDetaProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoOrdenDetaProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoOrdenDetaProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoOrdenDetaProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoOrdenDetaProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMerma.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProductoOrdenDetaProduMermaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProductoOrdenDetaProduMerma.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProductoOrdenDetaProduMermaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMerma.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProductoOrdenDetaProduMermaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProductoOrdenDetaProduMerma.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProductoOrdenDetaProduMermaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonidProductoOrdenDetaProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"idProductoOrdenDetaProduMermaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonid_orden_deta_produProductoOrdenDetaProduMermaUpdate.addActionListener(new ButtonActionListener(this,"id_orden_deta_produProductoOrdenDetaProduMermaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonid_orden_deta_produProductoOrdenDetaProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"id_orden_deta_produProductoOrdenDetaProduMermaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMermaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_merma_empresaProductoOrdenDetaProduMermaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_merma_empresaProductoOrdenDetaProduMermaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonid_unidadProductoOrdenDetaProduMermaUpdate.addActionListener(new ButtonActionListener(this,"id_unidadProductoOrdenDetaProduMermaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtonid_unidadProductoOrdenDetaProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadProductoOrdenDetaProduMermaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtoncantidadProductoOrdenDetaProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductoOrdenDetaProduMermaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtoncostoProductoOrdenDetaProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"costoProductoOrdenDetaProduMermaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtoncosto_totalProductoOrdenDetaProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalProductoOrdenDetaProduMermaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jButtondescripcionProductoOrdenDetaProduMermaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProductoOrdenDetaProduMermaBusqueda"));
		
		
		this.jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduMerma.addActionListener(new ButtonActionListener(this,"FK_IdOrdenDetaProduProductoOrdenDetaProduMerma"));

		this.jButtonFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma.addActionListener(new ButtonActionListener(this,"FK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma"));

		this.jButtonFK_IdUnidadProductoOrdenDetaProduMerma.addActionListener(new ButtonActionListener(this,"FK_IdUnidadProductoOrdenDetaProduMerma"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProductoOrdenDetaProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProductoOrdenDetaProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProductoOrdenDetaProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProductoOrdenDetaProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProductoOrdenDetaProduMerma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProductoOrdenDetaProduMermaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProductoOrdenDetaProduMermaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMerma.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProductoOrdenDetaProduMerma(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProductoOrdenDetaProduMerma productoordendetaprodumermaAux:this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas()) {
					productoordendetaprodumermaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoOrdenDetaProduMerma productoordendetaprodumermaAux:productoordendetaprodumermas) {
					productoordendetaprodumermaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProductoOrdenDetaProduMermaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductoOrdenDetaProduMerma(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductoOrdenDetaProduMerma productoordendetaprodumermaAux:this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas()) {
						productoordendetaprodumermaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoOrdenDetaProduMerma productoordendetaprodumermaAux:productoordendetaprodumermas) {
						productoordendetaprodumermaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProductoOrdenDetaProduMerma productoordendetaprodumermaAux:this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoOrdenDetaProduMerma productoordendetaprodumermaAux:productoordendetaprodumermas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProductoOrdenDetaProduMerma(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductoOrdenDetaProduMerma.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductoOrdenDetaProduMerma.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMerma,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProductoOrdenDetaProduMermaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductoOrdenDetaProduMerma(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProductoOrdenDetaProduMerma.getSelectedRows();
			
			ProductoOrdenDetaProduMerma productoordendetaprodumermaLocal=new ProductoOrdenDetaProduMerma();
			
			//this.seleccionarTodosProductoOrdenDetaProduMerma(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoordendetaprodumermaLocal =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas().toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					productoordendetaprodumermaLocal =(ProductoOrdenDetaProduMerma) this.productoordendetaprodumermas.toArray()[this.jTableDatosProductoOrdenDetaProduMerma.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				productoordendetaprodumermaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductoOrdenDetaProduMerma productoordendetaprodumermaAux:this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas()) {
						productoordendetaprodumermaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoOrdenDetaProduMerma productoordendetaprodumermaAux:productoordendetaprodumermas) {
						productoordendetaprodumermaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProductoOrdenDetaProduMerma(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductoOrdenDetaProduMerma.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductoOrdenDetaProduMerma.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMerma,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProductoOrdenDetaProduMermaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProductoOrdenDetaProduMermaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProductoOrdenDetaProduMermaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProductoOrdenDetaProduMerma(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProductoOrdenDetaProduMerma.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductoOrdenDetaProduMerma productoordendetaprodumermaAux:this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas()) {
				
						if(sTipoSeleccionar.equals(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							productoordendetaprodumermaAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							productoordendetaprodumermaAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_COSTOTOTAL)) {
							existe=true;
							productoordendetaprodumermaAux.setcosto_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							productoordendetaprodumermaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoOrdenDetaProduMerma productoordendetaprodumermaAux:productoordendetaprodumermas) {
					
						if(sTipoSeleccionar.equals(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							productoordendetaprodumermaAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							productoordendetaprodumermaAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_COSTOTOTAL)) {
							existe=true;
							productoordendetaprodumermaAux.setcosto_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							productoordendetaprodumermaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProductoOrdenDetaProduMerma(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProductoOrdenDetaProduMermaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProductoOrdenDetaProduMerma(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProductoOrdenDetaProduMerma=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProductoOrdenDetaProduMerma.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMerma.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProductoOrdenDetaProduMerma) {				
					conSplash=true;//false;										
					
					//this.startProcessProductoOrdenDetaProduMerma(conSplash);
				
					this.generarReporteProductoOrdenDetaProduMermasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoOrdenDetaProduMerma.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMerma.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProductoOrdenDetaProduMermasSeleccionados();
				//this.jComboBoxTiposAccionesProductoOrdenDetaProduMerma.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductoOrdenDetaProduMermasSeleccionados(false);
				//this.jComboBoxTiposAccionesProductoOrdenDetaProduMerma.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductoOrdenDetaProduMermasSeleccionados(true);
				//this.jComboBoxTiposAccionesProductoOrdenDetaProduMerma.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductoOrdenDetaProduMerma();
				
				this.exportarProductoOrdenDetaProduMermasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoOrdenDetaProduMerma.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMerma.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProductoOrdenDetaProduMermas();
				//this.importarProductoOrdenDetaProduMermas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoOrdenDetaProduMerma.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMerma.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductoOrdenDetaProduMerma();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProductoOrdenDetaProduMermasSeleccionados();
				//this.jComboBoxTiposAccionesProductoOrdenDetaProduMerma.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Orden Merma", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProductoOrdenDetaProduMerma();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProductoOrdenDetaProduMerma)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProductoOrdenDetaProduMerma(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Orden Merma",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoOrdenDetaProduMerma.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMerma.setSelectedIndex(0);					
				}	
			} 			
			else if(ProductoOrdenDetaProduMermaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProductoOrdenDetaProduMerma) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProductoOrdenDetaProduMerma(conSplash);
					
						//this.actualizarParametrosGeneralProductoOrdenDetaProduMerma();
						
						this.generarReporteProcesoAccionProductoOrdenDetaProduMermasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProductoOrdenDetaProduMerma.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMerma.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Orden MermaES SELECCIONADOS?", "MANTENIMIENTO DE Orden Merma", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProductoOrdenDetaProduMerma();
				
						this.actualizarParametrosGeneralProductoOrdenDetaProduMerma();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.productoordendetaprodumermaReturnGeneral=productoordendetaprodumermaLogic.procesarAccionProductoOrdenDetaProduMermasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas(),this.productoordendetaprodumermaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProductoOrdenDetaProduMermaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductoOrdenDetaProduMerma.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMerma.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProductoOrdenDetaProduMerma();
					
					ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProductoOrdenDetaProduMermaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductoOrdenDetaProduMerma.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMerma.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProductoOrdenDetaProduMerma(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProductoOrdenDetaProduMermaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProductoOrdenDetaProduMerma();
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProductoOrdenDetaProduMerma> productoordendetaprodumermasSeleccionados=new ArrayList<ProductoOrdenDetaProduMerma>();		
			ProductoOrdenDetaProduMerma productoordendetaprodumerma=new ProductoOrdenDetaProduMerma();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProductoOrdenDetaProduMerma(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProductoOrdenDetaProduMerma.getSelectedItem();
			
			
			
			
			productoordendetaprodumermasSeleccionados=this.getProductoOrdenDetaProduMermasSeleccionados(true);
			//this.sTipoAccion;
			
			if(productoordendetaprodumermasSeleccionados.size()==1) {
				for(ProductoOrdenDetaProduMerma productoordendetaprodumermaAux:productoordendetaprodumermasSeleccionados) {
					productoordendetaprodumerma=productoordendetaprodumermaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProductoOrdenDetaProduMerma();
			
      		//this.finishProcessProductoOrdenDetaProduMerma(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProductoOrdenDetaProduMermaReturnGeneral() throws Exception {
		if(this.productoordendetaprodumermaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.productoordendetaprodumermaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.productoordendetaprodumermaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.productoordendetaprodumermaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.productoordendetaprodumermaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.productoordendetaprodumermaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProductoOrdenDetaProduMerma(false);
		}
		
		if(this.productoordendetaprodumermaReturnGeneral.getConRetornoLista() || this.productoordendetaprodumermaReturnGeneral.getConRetornoObjeto()) {
			if(this.productoordendetaprodumermaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productoordendetaprodumermaLogic.setProductoOrdenDetaProduMermas(this.productoordendetaprodumermaReturnGeneral.getProductoOrdenDetaProduMermas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.productoordendetaprodumermaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productoordendetaprodumermaLogic.setProductoOrdenDetaProduMerma(this.productoordendetaprodumermaReturnGeneral.getProductoOrdenDetaProduMerma());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingProductoOrdenDetaProduMerma(false);
		}
	}
	
	public void actualizarParametrosGeneralProductoOrdenDetaProduMerma() throws Exception {
		
		
	}
	
	public ArrayList<ProductoOrdenDetaProduMerma> getProductoOrdenDetaProduMermasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProductoOrdenDetaProduMerma> productoordendetaprodumermasSeleccionados=new ArrayList<ProductoOrdenDetaProduMerma>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProductoOrdenDetaProduMerma) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProductoOrdenDetaProduMerma productoordendetaprodumermaAux:productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas()) {
					if(productoordendetaprodumermaAux.getIsSelected()) {
						productoordendetaprodumermasSeleccionados.add(productoordendetaprodumermaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoOrdenDetaProduMerma productoordendetaprodumermaAux:this.productoordendetaprodumermas) {
					if(productoordendetaprodumermaAux.getIsSelected()) {
						productoordendetaprodumermasSeleccionados.add(productoordendetaprodumermaAux);				
					}
				}
			}
			
			if(productoordendetaprodumermasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						productoordendetaprodumermasSeleccionados.addAll(this.productoordendetaprodumermaLogic.getProductoOrdenDetaProduMermas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						productoordendetaprodumermasSeleccionados.addAll(this.productoordendetaprodumermas);				
					}
				}
			}
		} else {
			productoordendetaprodumermasSeleccionados.add(this.productoordendetaprodumerma);
		}
		
		return productoordendetaprodumermasSeleccionados;
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
	
	public void generarReporteProductoOrdenDetaProduMermasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProductoOrdenDetaProduMermasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProductoOrdenDetaProduMermasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductoOrdenDetaProduMermasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductoOrdenDetaProduMermasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Orden Merma",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProductoOrdenDetaProduMermasSeleccionados() throws Exception {
		ArrayList<ProductoOrdenDetaProduMerma> productoordendetaprodumermasSeleccionados=new ArrayList<ProductoOrdenDetaProduMerma>();		
		
		productoordendetaprodumermasSeleccionados=this.getProductoOrdenDetaProduMermasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProductoOrdenDetaProduMermas("Todos",productoordendetaprodumermasSeleccionados);
		
	}	
	
	public void generarReporteNormalProductoOrdenDetaProduMermasSeleccionados() throws Exception {
		ArrayList<ProductoOrdenDetaProduMerma> productoordendetaprodumermasSeleccionados=new ArrayList<ProductoOrdenDetaProduMerma>();		
		
		productoordendetaprodumermasSeleccionados=this.getProductoOrdenDetaProduMermasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProductoOrdenDetaProduMermas("Todos",productoordendetaprodumermasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProductoOrdenDetaProduMermasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProductoOrdenDetaProduMerma> productoordendetaprodumermasSeleccionados=new ArrayList<ProductoOrdenDetaProduMerma>();
		
		productoordendetaprodumermasSeleccionados=this.getProductoOrdenDetaProduMermasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProductoOrdenDetaProduMermas("Todos",productoordendetaprodumermasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProductoOrdenDetaProduMermasSeleccionados() throws Exception {
		ArrayList<ProductoOrdenDetaProduMerma> productoordendetaprodumermasSeleccionados=new ArrayList<ProductoOrdenDetaProduMerma>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProductoOrdenDetaProduMerma();
		
		
		productoordendetaprodumermasSeleccionados=this.getProductoOrdenDetaProduMermasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProductoOrdenDetaProduMerma();
		
		
		//this.generarReporteProductoOrdenDetaProduMermas("Todos",productoordendetaprodumermasSeleccionados ,productoordendetaprodumermaImplementable,productoordendetaprodumermaImplementableHome);
	}
	
	public void mostrarImportacionProductoOrdenDetaProduMermas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProductoOrdenDetaProduMerma();
		
		this.abrirFrameImportacionProductoOrdenDetaProduMerma();		
		
			
		//this.generarReporteProductoOrdenDetaProduMermas("Todos",productoordendetaprodumermasSeleccionados ,productoordendetaprodumermaImplementable,productoordendetaprodumermaImplementableHome);
	}
	
	public void importarProductoOrdenDetaProduMermas() throws Exception {		
	
	}
	
	public void exportarProductoOrdenDetaProduMermasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProductoOrdenDetaProduMermasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProductoOrdenDetaProduMermasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProductoOrdenDetaProduMermasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Orden Merma",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProductoOrdenDetaProduMermasSeleccionados() throws Exception {
		ArrayList<ProductoOrdenDetaProduMerma> productoordendetaprodumermasSeleccionados=new ArrayList<ProductoOrdenDetaProduMerma>();		
		
		productoordendetaprodumermasSeleccionados=this.getProductoOrdenDetaProduMermasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoordendetaprodumerma."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProductoOrdenDetaProduMerma(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProductoOrdenDetaProduMerma productoordendetaprodumermaAux:productoordendetaprodumermasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProductoOrdenDetaProduMerma(productoordendetaprodumermaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//productoordendetaprodumermaAux.setsDetalleGeneralEntityReporte(productoordendetaprodumermaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden Merma",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProductoOrdenDetaProduMerma(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDORDENDETAPRODU;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDTIPOMERMAEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_CANTIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_COSTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_COSTOTOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProductoOrdenDetaProduMerma(ProductoOrdenDetaProduMerma productoordendetaprodumerma,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=productoordendetaprodumerma.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodumerma.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodumerma.getordendetaprodu_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodumerma.gettipomermaempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodumerma.getunidad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodumerma.getcantidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodumerma.getcosto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodumerma.getcosto_total().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodumerma.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProductoOrdenDetaProduMermasSeleccionados() throws Exception {
		ArrayList<ProductoOrdenDetaProduMerma> productoordendetaprodumermasSeleccionados=new ArrayList<ProductoOrdenDetaProduMerma>();		
		
		productoordendetaprodumermasSeleccionados=this.getProductoOrdenDetaProduMermasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoordendetaprodumerma.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProductoOrdenDetaProduMermas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProductoOrdenDetaProduMerma(row);				
				iRow++;
			}				
			
			for(ProductoOrdenDetaProduMerma productoordendetaprodumermaAux:productoordendetaprodumermasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProductoOrdenDetaProduMerma(productoordendetaprodumermaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden Merma",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProductoOrdenDetaProduMermasSeleccionados() throws Exception {
		ArrayList<ProductoOrdenDetaProduMerma> productoordendetaprodumermasSeleccionados=new ArrayList<ProductoOrdenDetaProduMerma>();		
		
		productoordendetaprodumermasSeleccionados=this.getProductoOrdenDetaProduMermasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoordendetaprodumerma.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("productoordendetaprodumermas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("productoordendetaprodumerma");
			//elementRoot.appendChild(element);
		
			for(ProductoOrdenDetaProduMerma productoordendetaprodumermaAux:productoordendetaprodumermasSeleccionados) {
				element = document.createElement("productoordendetaprodumerma");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProductoOrdenDetaProduMerma(productoordendetaprodumermaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden Merma",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProductoOrdenDetaProduMerma(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDORDENDETAPRODU);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDTIPOMERMAEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_CANTIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_COSTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_COSTOTOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProductoOrdenDetaProduMerma(ProductoOrdenDetaProduMerma productoordendetaprodumerma,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodumerma.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodumerma.getordendetaprodu_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodumerma.gettipomermaempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodumerma.getunidad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodumerma.getcantidad());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodumerma.getcosto());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodumerma.getcosto_total());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodumerma.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlProductoOrdenDetaProduMerma(ProductoOrdenDetaProduMerma productoordendetaprodumerma,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProductoOrdenDetaProduMermaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(productoordendetaprodumerma.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProductoOrdenDetaProduMermaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(productoordendetaprodumerma.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementordendetaprodu_descripcion = document.createElement(ProductoOrdenDetaProduMermaConstantesFunciones.IDORDENDETAPRODU);
		elementordendetaprodu_descripcion.appendChild(document.createTextNode(productoordendetaprodumerma.getordendetaprodu_descripcion()));
		element.appendChild(elementordendetaprodu_descripcion);

		Element elementtipomermaempresa_descripcion = document.createElement(ProductoOrdenDetaProduMermaConstantesFunciones.IDTIPOMERMAEMPRESA);
		elementtipomermaempresa_descripcion.appendChild(document.createTextNode(productoordendetaprodumerma.gettipomermaempresa_descripcion()));
		element.appendChild(elementtipomermaempresa_descripcion);

		Element elementunidad_descripcion = document.createElement(ProductoOrdenDetaProduMermaConstantesFunciones.IDUNIDAD);
		elementunidad_descripcion.appendChild(document.createTextNode(productoordendetaprodumerma.getunidad_descripcion()));
		element.appendChild(elementunidad_descripcion);

		Element elementcantidad = document.createElement(ProductoOrdenDetaProduMermaConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(productoordendetaprodumerma.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);

		Element elementcosto = document.createElement(ProductoOrdenDetaProduMermaConstantesFunciones.COSTO);
		elementcosto.appendChild(document.createTextNode(productoordendetaprodumerma.getcosto().toString().trim()));
		element.appendChild(elementcosto);

		Element elementcosto_total = document.createElement(ProductoOrdenDetaProduMermaConstantesFunciones.COSTOTOTAL);
		elementcosto_total.appendChild(document.createTextNode(productoordendetaprodumerma.getcosto_total().toString().trim()));
		element.appendChild(elementcosto_total);

		Element elementdescripcion = document.createElement(ProductoOrdenDetaProduMermaConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(productoordendetaprodumerma.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoProductoOrdenDetaProduMermasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProductoOrdenDetaProduMerma> productoordendetaprodumermasSeleccionados=new ArrayList<ProductoOrdenDetaProduMerma>();
		
		productoordendetaprodumermasSeleccionados=this.getProductoOrdenDetaProduMermasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProductoOrdenDetaProduMerma(productoordendetaprodumermasSeleccionados);
		
		this.generarReporteProductoOrdenDetaProduMermas("Todos",productoordendetaprodumermasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProductoOrdenDetaProduMerma(ArrayList<ProductoOrdenDetaProduMerma> productoordendetaprodumermasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProductoOrdenDetaProduMerma productoordendetaprodumermaAux:productoordendetaprodumermasSeleccionados) {
				productoordendetaprodumermaAux.setsDetalleGeneralEntityReporte(productoordendetaprodumermaAux.toString());
			
				if(sTipoSeleccionar.equals(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDORDENDETAPRODU)) {
					existe=true;
					productoordendetaprodumermaAux.setsDescripcionGeneralEntityReporte1(productoordendetaprodumermaAux.getordendetaprodu_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDTIPOMERMAEMPRESA)) {
					existe=true;
					productoordendetaprodumermaAux.setsDescripcionGeneralEntityReporte1(productoordendetaprodumermaAux.gettipomermaempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDUNIDAD)) {
					existe=true;
					productoordendetaprodumermaAux.setsDescripcionGeneralEntityReporte1(productoordendetaprodumermaAux.getunidad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_CANTIDAD)) {
					existe=true;
					productoordendetaprodumermaAux.setsDescripcionGeneralEntityReporte1(productoordendetaprodumermaAux.getcantidad().toString());
				}
				 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					productoordendetaprodumermaAux.setsDescripcionGeneralEntityReporte1(productoordendetaprodumermaAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMermaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProductoOrdenDetaProduMerma(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMerma=true;
				this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMerma=true;
				this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMerma=true;
			}
			
			this.isVisibilidadCeldaModificarProductoOrdenDetaProduMerma=false;
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMerma=false;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMerma=false;
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMerma=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMerma=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMerma=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMerma=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMerma=false;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMerma=false;
			this.isVisibilidadCeldaModificarProductoOrdenDetaProduMerma=false;
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMerma=true;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMerma=false;
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMerma=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMerma=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMerma=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMerma=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMerma=false;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMerma=false;
			this.isVisibilidadCeldaModificarProductoOrdenDetaProduMerma=false;
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMerma=true;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMerma=true;
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMerma=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMerma=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMerma=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMerma=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMerma=false;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMerma=false;
			this.isVisibilidadCeldaModificarProductoOrdenDetaProduMerma=false;
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMerma=true;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMerma=false;
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMerma=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMerma=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMerma=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMerma=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMerma=true;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMerma=true;
			this.isVisibilidadCeldaModificarProductoOrdenDetaProduMerma=false;
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMerma=false;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMerma=false;
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMerma=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMerma=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMerma=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMerma=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMerma=false;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMerma=false;
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMerma=false;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMerma=false;
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMerma=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMerma=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMerma=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMerma=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMerma=false;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMerma=false;
			this.isVisibilidadCeldaModificarProductoOrdenDetaProduMerma=true;
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMerma=false;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMerma=false;
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMerma=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMerma=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMerma=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProductoOrdenDetaProduMermaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMerma=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMerma=true;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMerma=true;
		} else {
			this.actualizarEstadoPanelsProductoOrdenDetaProduMerma(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProductoOrdenDetaProduMerma=false;
			//this.isVisibilidadCeldaVerFormProductoOrdenDetaProduMerma=false;
			this.isVisibilidadCeldaDuplicarProductoOrdenDetaProduMerma=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!productoordendetaprodumermaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMerma=false;
		} else {
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMerma=false;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMerma=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {
			if(!productoordendetaprodumermaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMerma=false;												
			}
			
			this.jButtonCerrarProductoOrdenDetaProduMerma.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMerma=false;
		}
		
		if(!this.permiteMantenimiento(this.productoordendetaprodumerma)) {
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMerma=false;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMerma=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProductoOrdenDetaProduMerma() {
	}
	
	public void actualizarEstadoPanelsProductoOrdenDetaProduMerma(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProductoOrdenDetaProduMerma!=null) {
				this.jScrollPanelDatosEdicionProductoOrdenDetaProduMerma.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma!=null) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoOrdenDetaProduMerma!=null) {
				this.jScrollPanelDatosProductoOrdenDetaProduMerma.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoOrdenDetaProduMerma!=null) {
				this.jPanelPaginacionProductoOrdenDetaProduMerma.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProduMerma!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProduMerma.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProductoOrdenDetaProduMerma!=null) {
				this.jScrollPanelDatosEdicionProductoOrdenDetaProduMerma.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma!=null) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProductoOrdenDetaProduMerma!=null) {
				this.jScrollPanelDatosProductoOrdenDetaProduMerma.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoOrdenDetaProduMerma!=null) {
				this.jPanelPaginacionProductoOrdenDetaProduMerma.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProduMerma!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProduMerma.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProductoOrdenDetaProduMerma!=null) {
				this.jScrollPanelDatosEdicionProductoOrdenDetaProduMerma.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma!=null) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductoOrdenDetaProduMerma!=null) {
				this.jScrollPanelDatosProductoOrdenDetaProduMerma.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoOrdenDetaProduMerma!=null) {
				this.jPanelPaginacionProductoOrdenDetaProduMerma.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProduMerma!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProduMerma.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProductoOrdenDetaProduMerma!=null) {
				this.jScrollPanelDatosEdicionProductoOrdenDetaProduMerma.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma!=null) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductoOrdenDetaProduMerma!=null) {
				this.jScrollPanelDatosProductoOrdenDetaProduMerma.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoOrdenDetaProduMerma!=null) {
				this.jPanelPaginacionProductoOrdenDetaProduMerma.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProduMerma!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProduMerma.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProductoOrdenDetaProduMerma!=null) {
				this.jScrollPanelDatosEdicionProductoOrdenDetaProduMerma.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma!=null) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoOrdenDetaProduMerma!=null) {
				this.jScrollPanelDatosProductoOrdenDetaProduMerma.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoOrdenDetaProduMerma!=null) {
				this.jPanelPaginacionProductoOrdenDetaProduMerma.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProduMerma!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProduMerma.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProductoOrdenDetaProduMerma!=null) {
				this.jScrollPanelDatosEdicionProductoOrdenDetaProduMerma.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma!=null) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoOrdenDetaProduMerma!=null) {
				this.jScrollPanelDatosProductoOrdenDetaProduMerma.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoOrdenDetaProduMerma!=null) {
				this.jPanelPaginacionProductoOrdenDetaProduMerma.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProduMerma!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProduMerma.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProductoOrdenDetaProduMerma!=null) {
				this.jScrollPanelDatosEdicionProductoOrdenDetaProduMerma.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma!=null) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoOrdenDetaProduMerma!=null) {
				this.jScrollPanelDatosProductoOrdenDetaProduMerma.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoOrdenDetaProduMerma!=null) {
				this.jPanelPaginacionProductoOrdenDetaProduMerma.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProduMerma!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProduMerma.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma!=null) {
					this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProduMerma!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProduMerma.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma!=null) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProduMerma!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProduMerma.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaOrdenDetaProdu(Boolean isParaOrdenDetaProdu){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaOrdenDetaProduNegation=!isParaOrdenDetaProdu;

			this.isVisibilidadFK_IdOrdenDetaProdu=isParaOrdenDetaProdu;
			if(!this.isVisibilidadFK_IdOrdenDetaProdu) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.remove(jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMerma);}

			this.isVisibilidadFK_IdTipoMermaEmpresa=isParaOrdenDetaProduNegation;
			if(!this.isVisibilidadFK_IdTipoMermaEmpresa) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.remove(jPanelFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma);}

			this.isVisibilidadFK_IdUnidad=isParaOrdenDetaProduNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.remove(jPanelFK_IdUnidadProductoOrdenDetaProduMerma);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoMermaEmpresa(Boolean isParaTipoMermaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoMermaEmpresaNegation=!isParaTipoMermaEmpresa;

			this.isVisibilidadFK_IdOrdenDetaProdu=isParaTipoMermaEmpresaNegation;
			if(!this.isVisibilidadFK_IdOrdenDetaProdu) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.remove(jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMerma);}

			this.isVisibilidadFK_IdTipoMermaEmpresa=isParaTipoMermaEmpresa;
			if(!this.isVisibilidadFK_IdTipoMermaEmpresa) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.remove(jPanelFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma);}

			this.isVisibilidadFK_IdUnidad=isParaTipoMermaEmpresaNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.remove(jPanelFK_IdUnidadProductoOrdenDetaProduMerma);}
		}
		
	}

	public void setVisibilidadBusquedasParaUnidad(Boolean isParaUnidad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUnidadNegation=!isParaUnidad;

			this.isVisibilidadFK_IdOrdenDetaProdu=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdOrdenDetaProdu) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.remove(jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMerma);}

			this.isVisibilidadFK_IdTipoMermaEmpresa=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdTipoMermaEmpresa) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.remove(jPanelFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma);}

			this.isVisibilidadFK_IdUnidad=isParaUnidad;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.remove(jPanelFK_IdUnidadProductoOrdenDetaProduMerma);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ProductoOrdenDetaProduMermaSessionBean productoordendetaprodumermaSessionBean=new ProductoOrdenDetaProduMermaSessionBean();
		
		if(this.productoordendetaprodumermaSessionBean==null) {
			this.productoordendetaprodumermaSessionBean=new ProductoOrdenDetaProduMermaSessionBean();
		}
		
		this.productoordendetaprodumermaSessionBean.setsUltimaBusquedaProductoOrdenDetaProduMerma(this.getsAccionBusqueda());
		this.productoordendetaprodumermaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.productoordendetaprodumermaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdOrdenDetaProdu")) {
			productoordendetaprodumermaSessionBean.setid_orden_deta_produ(this.getid_orden_deta_produFK_IdOrdenDetaProdu());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoMermaEmpresa")) {
			productoordendetaprodumermaSessionBean.setid_tipo_merma_empresa(this.getid_tipo_merma_empresaFK_IdTipoMermaEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
			productoordendetaprodumermaSessionBean.setid_unidad(this.getid_unidadFK_IdUnidad());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ProductoOrdenDetaProduMermaSessionBean productoordendetaprodumermaSessionBean=new ProductoOrdenDetaProduMermaSessionBean();
		
		if(this.productoordendetaprodumermaSessionBean==null) {
			this.productoordendetaprodumermaSessionBean=new ProductoOrdenDetaProduMermaSessionBean();
		}
		
		if(this.productoordendetaprodumermaSessionBean.getsUltimaBusquedaProductoOrdenDetaProduMerma()!=null&&!this.productoordendetaprodumermaSessionBean.getsUltimaBusquedaProductoOrdenDetaProduMerma().equals("")) {
			this.setsAccionBusqueda(productoordendetaprodumermaSessionBean.getsUltimaBusquedaProductoOrdenDetaProduMerma());
			this.setiNumeroPaginacion(productoordendetaprodumermaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(productoordendetaprodumermaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdOrdenDetaProdu")) {
				this.setid_orden_deta_produFK_IdOrdenDetaProdu(productoordendetaprodumermaSessionBean.getid_orden_deta_produ());
				productoordendetaprodumermaSessionBean.setid_orden_deta_produ(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoMermaEmpresa")) {
				this.setid_tipo_merma_empresaFK_IdTipoMermaEmpresa(productoordendetaprodumermaSessionBean.getid_tipo_merma_empresa());
				productoordendetaprodumermaSessionBean.setid_tipo_merma_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
				this.setid_unidadFK_IdUnidad(productoordendetaprodumermaSessionBean.getid_unidad());
				productoordendetaprodumermaSessionBean.setid_unidad(-1L);
			}
		}
		
		this.productoordendetaprodumermaSessionBean.setsUltimaBusquedaProductoOrdenDetaProduMerma("");
		this.productoordendetaprodumermaSessionBean.setiNumeroPaginacion(ProductoOrdenDetaProduMermaConstantesFunciones.INUMEROPAGINACION);
		this.productoordendetaprodumermaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaProductoOrdenDetaProduMerma(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProductoOrdenDetaProduMerma() {
		this.updateBorderResaltarBusquedasFormularioProductoOrdenDetaProduMerma();
		this.updateVisibilidadBusquedasFormularioProductoOrdenDetaProduMerma();
		this.updateHabilitarBusquedasFormularioProductoOrdenDetaProduMerma();
	}
	
	public void updateBorderResaltarBusquedasFormularioProductoOrdenDetaProduMerma() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.getComponents().length>0) {
	

		if(this.productoordendetaprodumermaConstantesFunciones.resaltarFK_IdOrdenDetaProduProductoOrdenDetaProduMerma!=null) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.indexOfComponent(this.jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMerma);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.getComponent(index);
				jPanel.setBorder(this.productoordendetaprodumermaConstantesFunciones.resaltarFK_IdOrdenDetaProduProductoOrdenDetaProduMerma);
			}
		}

		if(this.productoordendetaprodumermaConstantesFunciones.resaltarFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma!=null) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.indexOfComponent(this.jPanelFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.getComponent(index);
				jPanel.setBorder(this.productoordendetaprodumermaConstantesFunciones.resaltarFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma);
			}
		}

		if(this.productoordendetaprodumermaConstantesFunciones.resaltarFK_IdUnidadProductoOrdenDetaProduMerma!=null) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.indexOfComponent(this.jPanelFK_IdUnidadProductoOrdenDetaProduMerma);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.getComponent(index);
				jPanel.setBorder(this.productoordendetaprodumermaConstantesFunciones.resaltarFK_IdUnidadProductoOrdenDetaProduMerma);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProductoOrdenDetaProduMerma() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.indexOfComponent(this.jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMerma);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoordendetaprodumermaConstantesFunciones.mostrarFK_IdOrdenDetaProduProductoOrdenDetaProduMerma);
			if(!this.productoordendetaprodumermaConstantesFunciones.mostrarFK_IdOrdenDetaProduProductoOrdenDetaProduMerma && index>-1) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.indexOfComponent(this.jPanelFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoordendetaprodumermaConstantesFunciones.mostrarFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma);
			if(!this.productoordendetaprodumermaConstantesFunciones.mostrarFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma && index>-1) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.indexOfComponent(this.jPanelFK_IdUnidadProductoOrdenDetaProduMerma);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoordendetaprodumermaConstantesFunciones.mostrarFK_IdUnidadProductoOrdenDetaProduMerma);
			if(!this.productoordendetaprodumermaConstantesFunciones.mostrarFK_IdUnidadProductoOrdenDetaProduMerma && index>-1) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProductoOrdenDetaProduMerma() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.indexOfComponent(this.jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMerma);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoordendetaprodumermaConstantesFunciones.activarFK_IdOrdenDetaProduProductoOrdenDetaProduMerma);
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.setEnabledAt(index,this.productoordendetaprodumermaConstantesFunciones.activarFK_IdOrdenDetaProduProductoOrdenDetaProduMerma);
			}

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.indexOfComponent(this.jPanelFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoordendetaprodumermaConstantesFunciones.activarFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma);
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.setEnabledAt(index,this.productoordendetaprodumermaConstantesFunciones.activarFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma);
			}

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.indexOfComponent(this.jPanelFK_IdUnidadProductoOrdenDetaProduMerma);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoordendetaprodumermaConstantesFunciones.activarFK_IdUnidadProductoOrdenDetaProduMerma);
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.setEnabledAt(index,this.productoordendetaprodumermaConstantesFunciones.activarFK_IdUnidadProductoOrdenDetaProduMerma);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProductoOrdenDetaProduMerma(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdOrdenDetaProdu")) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.indexOfComponent(this.jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMerma);

			this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.getComponent(index);

			this.productoordendetaprodumermaConstantesFunciones.setResaltarFK_IdOrdenDetaProduProductoOrdenDetaProduMerma(resaltar);

			jPanel.setBorder(this.productoordendetaprodumermaConstantesFunciones.resaltarFK_IdOrdenDetaProduProductoOrdenDetaProduMerma);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoMermaEmpresa")) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.indexOfComponent(this.jPanelFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma);

			this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.getComponent(index);

			this.productoordendetaprodumermaConstantesFunciones.setResaltarFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma(resaltar);

			jPanel.setBorder(this.productoordendetaprodumermaConstantesFunciones.resaltarFK_IdTipoMermaEmpresaProductoOrdenDetaProduMerma);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdUnidad")) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.indexOfComponent(this.jPanelFK_IdUnidadProductoOrdenDetaProduMerma);

			this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMerma.getComponent(index);

			this.productoordendetaprodumermaConstantesFunciones.setResaltarFK_IdUnidadProductoOrdenDetaProduMerma(resaltar);

			jPanel.setBorder(this.productoordendetaprodumermaConstantesFunciones.resaltarFK_IdUnidadProductoOrdenDetaProduMerma);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProductoOrdenDetaProduMerma.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProductoOrdenDetaProduMerma() throws Exception {

		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProductoOrdenDetaProduMerma();
		this.updateVisibilidadResaltarControlesFormularioProductoOrdenDetaProduMerma();
		this.updateHabilitarResaltarControlesFormularioProductoOrdenDetaProduMerma();
		
	}
	
	public void updateBorderResaltarControlesFormularioProductoOrdenDetaProduMerma() throws Exception {
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.productoordendetaprodumermaConstantesFunciones.resaltaridProductoOrdenDetaProduMerma!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jLabelidProductoOrdenDetaProduMerma.setBorder(this.productoordendetaprodumermaConstantesFunciones.resaltaridProductoOrdenDetaProduMerma);}
		if(this.productoordendetaprodumermaConstantesFunciones.resaltarid_orden_deta_produProductoOrdenDetaProduMerma!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_orden_deta_produProductoOrdenDetaProduMerma.setBorder(this.productoordendetaprodumermaConstantesFunciones.resaltarid_orden_deta_produProductoOrdenDetaProduMerma);}
		if(this.productoordendetaprodumermaConstantesFunciones.resaltarid_tipo_merma_empresaProductoOrdenDetaProduMerma!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMerma.setBorder(this.productoordendetaprodumermaConstantesFunciones.resaltarid_tipo_merma_empresaProductoOrdenDetaProduMerma);}
		if(this.productoordendetaprodumermaConstantesFunciones.resaltarid_unidadProductoOrdenDetaProduMerma!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_unidadProductoOrdenDetaProduMerma.setBorder(this.productoordendetaprodumermaConstantesFunciones.resaltarid_unidadProductoOrdenDetaProduMerma);}
		if(this.productoordendetaprodumermaConstantesFunciones.resaltarcantidadProductoOrdenDetaProduMerma!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTextFieldcantidadProductoOrdenDetaProduMerma.setBorder(this.productoordendetaprodumermaConstantesFunciones.resaltarcantidadProductoOrdenDetaProduMerma);}
		if(this.productoordendetaprodumermaConstantesFunciones.resaltarcostoProductoOrdenDetaProduMerma!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTextFieldcostoProductoOrdenDetaProduMerma.setBorder(this.productoordendetaprodumermaConstantesFunciones.resaltarcostoProductoOrdenDetaProduMerma);}
		if(this.productoordendetaprodumermaConstantesFunciones.resaltarcosto_totalProductoOrdenDetaProduMerma!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTextFieldcosto_totalProductoOrdenDetaProduMerma.setBorder(this.productoordendetaprodumermaConstantesFunciones.resaltarcosto_totalProductoOrdenDetaProduMerma);}
		if(this.productoordendetaprodumermaConstantesFunciones.resaltardescripcionProductoOrdenDetaProduMerma!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTextAreadescripcionProductoOrdenDetaProduMerma.setBorder(this.productoordendetaprodumermaConstantesFunciones.resaltardescripcionProductoOrdenDetaProduMerma);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProductoOrdenDetaProduMerma() throws Exception {		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) {
	
		//this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jLabelidProductoOrdenDetaProduMerma.setVisible(this.productoordendetaprodumermaConstantesFunciones.mostraridProductoOrdenDetaProduMerma);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jPanelidProductoOrdenDetaProduMerma.setVisible(this.productoordendetaprodumermaConstantesFunciones.mostraridProductoOrdenDetaProduMerma);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_orden_deta_produProductoOrdenDetaProduMerma.setVisible(this.productoordendetaprodumermaConstantesFunciones.mostrarid_orden_deta_produProductoOrdenDetaProduMerma);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jPanelid_orden_deta_produProductoOrdenDetaProduMerma.setVisible(this.productoordendetaprodumermaConstantesFunciones.mostrarid_orden_deta_produProductoOrdenDetaProduMerma);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMerma.setVisible(this.productoordendetaprodumermaConstantesFunciones.mostrarid_tipo_merma_empresaProductoOrdenDetaProduMerma);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jPanelid_tipo_merma_empresaProductoOrdenDetaProduMerma.setVisible(this.productoordendetaprodumermaConstantesFunciones.mostrarid_tipo_merma_empresaProductoOrdenDetaProduMerma);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_unidadProductoOrdenDetaProduMerma.setVisible(this.productoordendetaprodumermaConstantesFunciones.mostrarid_unidadProductoOrdenDetaProduMerma);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jPanelid_unidadProductoOrdenDetaProduMerma.setVisible(this.productoordendetaprodumermaConstantesFunciones.mostrarid_unidadProductoOrdenDetaProduMerma);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTextFieldcantidadProductoOrdenDetaProduMerma.setVisible(this.productoordendetaprodumermaConstantesFunciones.mostrarcantidadProductoOrdenDetaProduMerma);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jPanelcantidadProductoOrdenDetaProduMerma.setVisible(this.productoordendetaprodumermaConstantesFunciones.mostrarcantidadProductoOrdenDetaProduMerma);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTextFieldcostoProductoOrdenDetaProduMerma.setVisible(this.productoordendetaprodumermaConstantesFunciones.mostrarcostoProductoOrdenDetaProduMerma);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jPanelcostoProductoOrdenDetaProduMerma.setVisible(this.productoordendetaprodumermaConstantesFunciones.mostrarcostoProductoOrdenDetaProduMerma);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTextFieldcosto_totalProductoOrdenDetaProduMerma.setVisible(this.productoordendetaprodumermaConstantesFunciones.mostrarcosto_totalProductoOrdenDetaProduMerma);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jPanelcosto_totalProductoOrdenDetaProduMerma.setVisible(this.productoordendetaprodumermaConstantesFunciones.mostrarcosto_totalProductoOrdenDetaProduMerma);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTextAreadescripcionProductoOrdenDetaProduMerma.setVisible(this.productoordendetaprodumermaConstantesFunciones.mostrardescripcionProductoOrdenDetaProduMerma);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jPaneldescripcionProductoOrdenDetaProduMerma.setVisible(this.productoordendetaprodumermaConstantesFunciones.mostrardescripcionProductoOrdenDetaProduMerma);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProductoOrdenDetaProduMerma() throws Exception {
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma!=null) {
	
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jLabelidProductoOrdenDetaProduMerma.setEnabled(this.productoordendetaprodumermaConstantesFunciones.activaridProductoOrdenDetaProduMerma);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_orden_deta_produProductoOrdenDetaProduMerma.setEnabled(this.productoordendetaprodumermaConstantesFunciones.activarid_orden_deta_produProductoOrdenDetaProduMerma);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMerma.setEnabled(this.productoordendetaprodumermaConstantesFunciones.activarid_tipo_merma_empresaProductoOrdenDetaProduMerma);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jComboBoxid_unidadProductoOrdenDetaProduMerma.setEnabled(this.productoordendetaprodumermaConstantesFunciones.activarid_unidadProductoOrdenDetaProduMerma);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTextFieldcantidadProductoOrdenDetaProduMerma.setEnabled(this.productoordendetaprodumermaConstantesFunciones.activarcantidadProductoOrdenDetaProduMerma);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTextFieldcostoProductoOrdenDetaProduMerma.setEnabled(this.productoordendetaprodumermaConstantesFunciones.activarcostoProductoOrdenDetaProduMerma);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTextFieldcosto_totalProductoOrdenDetaProduMerma.setEnabled(this.productoordendetaprodumermaConstantesFunciones.activarcosto_totalProductoOrdenDetaProduMerma);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMerma.jTextAreadescripcionProductoOrdenDetaProduMerma.setEnabled(this.productoordendetaprodumermaConstantesFunciones.activardescripcionProductoOrdenDetaProduMerma);
		}
	}
	
		
}