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

import com.bydan.erp.produccion.util.ProductoOrdenDetaProduManoConstantesFunciones;
import com.bydan.erp.produccion.util.ProductoOrdenDetaProduManoParameterReturnGeneral;
//import com.bydan.erp.produccion.util.ProductoOrdenDetaProduManoParameterGeneral;
//import com.bydan.erp.produccion.presentation.report.source.ProductoOrdenDetaProduManoBean;
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
public class ProductoOrdenDetaProduManoBeanSwingJInternalFrame extends ProductoOrdenDetaProduManoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProductoOrdenDetaProduManoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProductoOrdenDetaProduMano> productoordendetaprodumanoValidator = new ClassValidator<ProductoOrdenDetaProduMano>(ProductoOrdenDetaProduMano.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProductoOrdenDetaProduMano productoordendetaprodumano;	
	public ProductoOrdenDetaProduMano productoordendetaprodumanoAux;
	public ProductoOrdenDetaProduMano productoordendetaprodumanoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProductoOrdenDetaProduMano productoordendetaprodumanoTotales;
	public Long idProductoOrdenDetaProduManoActual;
	public Long iIdNuevoProductoOrdenDetaProduMano=0L;
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
	
	public Boolean isPermisoTodoProductoOrdenDetaProduMano;
	public Boolean isPermisoNuevoProductoOrdenDetaProduMano;
	public Boolean isPermisoActualizarProductoOrdenDetaProduMano;
	public Boolean isPermisoActualizarOriginalProductoOrdenDetaProduMano;
	public Boolean isPermisoEliminarProductoOrdenDetaProduMano;
	public Boolean isPermisoGuardarCambiosProductoOrdenDetaProduMano;
	public Boolean isPermisoConsultaProductoOrdenDetaProduMano;
	public Boolean isPermisoBusquedaProductoOrdenDetaProduMano;
	public Boolean isPermisoReporteProductoOrdenDetaProduMano;
	public Boolean isPermisoPaginacionMedioProductoOrdenDetaProduMano;
	public Boolean isPermisoPaginacionAltoProductoOrdenDetaProduMano;
	public Boolean isPermisoPaginacionTodoProductoOrdenDetaProduMano;
	public Boolean isPermisoCopiarProductoOrdenDetaProduMano;
	public Boolean isPermisoVerFormProductoOrdenDetaProduMano;
	public Boolean isPermisoDuplicarProductoOrdenDetaProduMano;
	public Boolean isPermisoOrdenProductoOrdenDetaProduMano;
	
	
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
	
	public ProductoOrdenDetaProduManoParameterReturnGeneral productoordendetaprodumanoReturnGeneral;
	public ProductoOrdenDetaProduManoParameterReturnGeneral productoordendetaprodumanoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProductoOrdenDetaProduMano=false;
	public Boolean esParaAccionDesdeFormularioProductoOrdenDetaProduMano=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProductoOrdenDetaProduManoSessionBeanAdditional productoordendetaprodumanoSessionBeanAdditional=null;
	
	public ProductoOrdenDetaProduManoSessionBeanAdditional getProductoOrdenDetaProduManoSessionBeanAdditional() {
		return this.productoordendetaprodumanoSessionBeanAdditional;
	}
	
	public void setProductoOrdenDetaProduManoSessionBeanAdditional(ProductoOrdenDetaProduManoSessionBeanAdditional productoordendetaprodumanoSessionBeanAdditional) {
		try {
			this.productoordendetaprodumanoSessionBeanAdditional=productoordendetaprodumanoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional productoordendetaprodumanoBeanSwingJInternalFrameAdditional=null;
	//public class ProductoOrdenDetaProduManoBeanSwingJInternalFrame
	
	public ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional getProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional() {
		return this.productoordendetaprodumanoBeanSwingJInternalFrameAdditional;
	}
	
	public void setProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional(ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional productoordendetaprodumanoBeanSwingJInternalFrameAdditional) {
		try {
			this.productoordendetaprodumanoBeanSwingJInternalFrameAdditional=productoordendetaprodumanoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProductoOrdenDetaProduManoLogic productoordendetaprodumanoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProductoOrdenDetaProduMano productoordendetaprodumanoBean;
	public ProductoOrdenDetaProduManoConstantesFunciones productoordendetaprodumanoConstantesFunciones;
	//public ProductoOrdenDetaProduManoParameterReturnGeneral productoordendetaprodumanoReturnGeneral;
	
	//FK
	
	public OrdenDetaProduLogic ordendetaproduLogic;
	public TipoManoProduEmpresaLogic tipomanoproduempresaLogic;
	public TipoProcesoEmpresaProduLogic tipoprocesoempresaproduLogic;
	public UnidadLogic unidadLogic;
	
	//PARAMETROS
	
	
	//public List<ProductoOrdenDetaProduMano> productoordendetaprodumanos;	
	//public List<ProductoOrdenDetaProduMano> productoordendetaprodumanosEliminados;
	//public List<ProductoOrdenDetaProduMano> productoordendetaprodumanosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProductoOrdenDetaProduMano=false;
	public Boolean isVisibilidadCeldaDuplicarProductoOrdenDetaProduMano=true;
	public Boolean isVisibilidadCeldaCopiarProductoOrdenDetaProduMano=true;
	public Boolean isVisibilidadCeldaVerFormProductoOrdenDetaProduMano=true;
	public Boolean isVisibilidadCeldaOrdenProductoOrdenDetaProduMano=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMano=false;
	public Boolean isVisibilidadCeldaModificarProductoOrdenDetaProduMano=false;
	public Boolean isVisibilidadCeldaActualizarProductoOrdenDetaProduMano=false;
	public Boolean isVisibilidadCeldaEliminarProductoOrdenDetaProduMano=false;
	public Boolean isVisibilidadCeldaCancelarProductoOrdenDetaProduMano=false;
	public Boolean isVisibilidadCeldaGuardarProductoOrdenDetaProduMano=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMano=false;	
	
	
	public Boolean isVisibilidadFK_IdOrdenDetaProdu=false;
	public Boolean isVisibilidadFK_IdTipoManoProduEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoProcesoEmpresaProdu=false;
	public Boolean isVisibilidadFK_IdUnidad=false;
	
	public Long getiIdNuevoProductoOrdenDetaProduMano() {
		return this.iIdNuevoProductoOrdenDetaProduMano;
	}

	public void setiIdNuevoProductoOrdenDetaProduMano(Long iIdNuevoProductoOrdenDetaProduMano) {
		this.iIdNuevoProductoOrdenDetaProduMano = iIdNuevoProductoOrdenDetaProduMano;
	}
	
	public Long getidProductoOrdenDetaProduManoActual() {
		return this.idProductoOrdenDetaProduManoActual;
	}

	public void setidProductoOrdenDetaProduManoActual(Long idProductoOrdenDetaProduManoActual) {
		this.idProductoOrdenDetaProduManoActual = idProductoOrdenDetaProduManoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProductoOrdenDetaProduMano getproductoordendetaprodumano() {
		return this.productoordendetaprodumano;
	}

	public void setproductoordendetaprodumano(ProductoOrdenDetaProduMano productoordendetaprodumano) {
		this.productoordendetaprodumano = productoordendetaprodumano;
	}
	
	public ProductoOrdenDetaProduMano getproductoordendetaprodumanoAux() {
		return this.productoordendetaprodumanoAux;
	}

	public void setproductoordendetaprodumanoAux(ProductoOrdenDetaProduMano productoordendetaprodumanoAux) {
		this.productoordendetaprodumanoAux = productoordendetaprodumanoAux;
	}				
	
	public ProductoOrdenDetaProduMano getproductoordendetaprodumanoAnterior() {
		return this.productoordendetaprodumanoAnterior;
	}

	public void setproductoordendetaprodumanoAnterior(ProductoOrdenDetaProduMano productoordendetaprodumanoAnterior) {
		this.productoordendetaprodumanoAnterior = productoordendetaprodumanoAnterior;
	}	
	
	public ProductoOrdenDetaProduMano getproductoordendetaprodumanoTotales() {
		return this.productoordendetaprodumanoTotales;
	}

	public void setproductoordendetaprodumanoTotales(ProductoOrdenDetaProduMano productoordendetaprodumanoTotales) {
		this.productoordendetaprodumanoTotales = productoordendetaprodumanoTotales;
	}	
	
	public ProductoOrdenDetaProduMano getproductoordendetaprodumanoBean() {
		return this.productoordendetaprodumanoBean;
	}

	public void setproductoordendetaprodumanoBean(ProductoOrdenDetaProduMano productoordendetaprodumanoBean) {
		this.productoordendetaprodumanoBean = productoordendetaprodumanoBean;
	}	
	
	public ProductoOrdenDetaProduManoParameterReturnGeneral getproductoordendetaprodumanoReturnGeneral() {
		return this.productoordendetaprodumanoReturnGeneral;
	}

	public void setproductoordendetaprodumanoReturnGeneral(ProductoOrdenDetaProduManoParameterReturnGeneral productoordendetaprodumanoReturnGeneral) {
		this.productoordendetaprodumanoReturnGeneral = productoordendetaprodumanoReturnGeneral;
	}	
	
	
	public Long id_orden_deta_produFK_IdOrdenDetaProdu=-1L;

	public Long getid_orden_deta_produFK_IdOrdenDetaProdu() {
		return this.id_orden_deta_produFK_IdOrdenDetaProdu;
	}

	public void setid_orden_deta_produFK_IdOrdenDetaProdu(Long id_orden_deta_produFK_IdOrdenDetaProdu) {
		this.id_orden_deta_produFK_IdOrdenDetaProdu = id_orden_deta_produFK_IdOrdenDetaProdu;
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
	
	
	public ProductoOrdenDetaProduManoLogic getProductoOrdenDetaProduManoLogic()	{		
		return productoordendetaprodumanoLogic;
	}

	public void setProductoOrdenDetaProduManoLogic(ProductoOrdenDetaProduManoLogic productoordendetaprodumanoLogic) {
		this.productoordendetaprodumanoLogic = productoordendetaprodumanoLogic;
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
	
	public Boolean getIsEsNuevoProductoOrdenDetaProduMano() {
		return isEsNuevoProductoOrdenDetaProduMano;
	}

	public void setIsEsNuevoProductoOrdenDetaProduMano(Boolean isEsNuevoProductoOrdenDetaProduMano) {
		this.isEsNuevoProductoOrdenDetaProduMano = isEsNuevoProductoOrdenDetaProduMano;
	}

	public Boolean getEsParaAccionDesdeFormularioProductoOrdenDetaProduMano() {
		return esParaAccionDesdeFormularioProductoOrdenDetaProduMano;
	}
	
	public void setEsParaAccionDesdeFormularioProductoOrdenDetaProduMano(Boolean esParaAccionDesdeFormularioProductoOrdenDetaProduMano) {
		this.esParaAccionDesdeFormularioProductoOrdenDetaProduMano = esParaAccionDesdeFormularioProductoOrdenDetaProduMano;
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

			if(this.productoordendetaprodumanoSessionBean==null) {
				this.productoordendetaprodumanoSessionBean=new ProductoOrdenDetaProduManoSessionBean();
			}

			if(!this.productoordendetaprodumanoSessionBean.getisBusquedaDesdeForeignKeySesionOrdenDetaProdu()) {
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
					ordendetaproduLogic.getEntityWithConnection(productoordendetaprodumanoSessionBean.getlidOrdenDetaProduActual());
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

			if(this.productoordendetaprodumanoSessionBean==null) {
				this.productoordendetaprodumanoSessionBean=new ProductoOrdenDetaProduManoSessionBean();
			}

			if(!this.productoordendetaprodumanoSessionBean.getisBusquedaDesdeForeignKeySesionTipoManoProduEmpresa()) {
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
					tipomanoproduempresaLogic.getEntityWithConnection(productoordendetaprodumanoSessionBean.getlidTipoManoProduEmpresaActual());
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

			if(this.productoordendetaprodumanoSessionBean==null) {
				this.productoordendetaprodumanoSessionBean=new ProductoOrdenDetaProduManoSessionBean();
			}

			if(!this.productoordendetaprodumanoSessionBean.getisBusquedaDesdeForeignKeySesionTipoProcesoEmpresaProdu()) {
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
					tipoprocesoempresaproduLogic.getEntityWithConnection(productoordendetaprodumanoSessionBean.getlidTipoProcesoEmpresaProduActual());
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

			if(this.productoordendetaprodumanoSessionBean==null) {
				this.productoordendetaprodumanoSessionBean=new ProductoOrdenDetaProduManoSessionBean();
			}

			if(!this.productoordendetaprodumanoSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
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
					unidadLogic.getEntityWithConnection(productoordendetaprodumanoSessionBean.getlidUnidadActual());
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

					if(this.productoordendetaprodumano!=null) {
						this.productoordendetaprodumano.setOrdenDetaProdu(ordendetaproduTemp);
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {
						this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_orden_deta_produProductoOrdenDetaProduMano.setSelectedItem(ordendetaproduTemp);
					}
				} else {
					//jComboBoxid_orden_deta_produProductoOrdenDetaProduMano.setSelectedItem(ordendetaproduTemp);
					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_orden_deta_produProductoOrdenDetaProduMano.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_orden_deta_produProductoOrdenDetaProduMano.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdOrdenDetaProdu") || sFormularioTipoBusqueda.equals("Todos")){
					if(ordendetaproduTemp!=null && jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMano!=null) {
						jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMano.setSelectedItem(ordendetaproduTemp);
					} else {
						if(jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMano!=null) {
							//jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMano.setSelectedItem(ordendetaproduTemp);
							if(jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMano.getItemCount()>0) {
								jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMano.setSelectedIndex(0);
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
	public void setActualOrdenDetaProduForeignKeyGenerico(Long idOrdenDetaProduSeleccionado,JComboBox jComboBoxid_orden_deta_produProductoOrdenDetaProduManoGenerico)throws Exception
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
				jComboBoxid_orden_deta_produProductoOrdenDetaProduManoGenerico.setSelectedItem(ordendetaproduTemp);
			} else {
				if(jComboBoxid_orden_deta_produProductoOrdenDetaProduManoGenerico!=null && jComboBoxid_orden_deta_produProductoOrdenDetaProduManoGenerico.getItemCount()>0) {
					jComboBoxid_orden_deta_produProductoOrdenDetaProduManoGenerico.setSelectedIndex(0);
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

					if(this.productoordendetaprodumano!=null) {
						this.productoordendetaprodumano.setTipoManoProduEmpresa(tipomanoproduempresaTemp);
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {
						this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.setSelectedItem(tipomanoproduempresaTemp);
					}
				} else {
					//jComboBoxid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.setSelectedItem(tipomanoproduempresaTemp);
					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoManoProduEmpresa") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipomanoproduempresaTemp!=null && jComboBoxid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano!=null) {
						jComboBoxid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano.setSelectedItem(tipomanoproduempresaTemp);
					} else {
						if(jComboBoxid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano!=null) {
							//jComboBoxid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano.setSelectedItem(tipomanoproduempresaTemp);
							if(jComboBoxid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano.getItemCount()>0) {
								jComboBoxid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano.setSelectedIndex(0);
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
	public void setActualTipoManoProduEmpresaForeignKeyGenerico(Long idTipoManoProduEmpresaSeleccionado,JComboBox jComboBoxid_tipo_mano_produ_empresaProductoOrdenDetaProduManoGenerico)throws Exception
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
				jComboBoxid_tipo_mano_produ_empresaProductoOrdenDetaProduManoGenerico.setSelectedItem(tipomanoproduempresaTemp);
			} else {
				if(jComboBoxid_tipo_mano_produ_empresaProductoOrdenDetaProduManoGenerico!=null && jComboBoxid_tipo_mano_produ_empresaProductoOrdenDetaProduManoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_mano_produ_empresaProductoOrdenDetaProduManoGenerico.setSelectedIndex(0);
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

					if(this.productoordendetaprodumano!=null) {
						this.productoordendetaprodumano.setTipoProcesoEmpresaProdu(tipoprocesoempresaproduTemp);
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {
						this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.setSelectedItem(tipoprocesoempresaproduTemp);
					}
				} else {
					//jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.setSelectedItem(tipoprocesoempresaproduTemp);
					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoProcesoEmpresaProdu") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoprocesoempresaproduTemp!=null && jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano!=null) {
						jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano.setSelectedItem(tipoprocesoempresaproduTemp);
					} else {
						if(jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano!=null) {
							//jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano.setSelectedItem(tipoprocesoempresaproduTemp);
							if(jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano.getItemCount()>0) {
								jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano.setSelectedIndex(0);
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
	public void setActualTipoProcesoEmpresaProduForeignKeyGenerico(Long idTipoProcesoEmpresaProduSeleccionado,JComboBox jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduManoGenerico)throws Exception
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
				jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduManoGenerico.setSelectedItem(tipoprocesoempresaproduTemp);
			} else {
				if(jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduManoGenerico!=null && jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduManoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduManoGenerico.setSelectedIndex(0);
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

					if(this.productoordendetaprodumano!=null) {
						this.productoordendetaprodumano.setUnidad(unidadTemp);
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {
						this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_unidadProductoOrdenDetaProduMano.setSelectedItem(unidadTemp);
					}
				} else {
					//jComboBoxid_unidadProductoOrdenDetaProduMano.setSelectedItem(unidadTemp);
					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_unidadProductoOrdenDetaProduMano.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_unidadProductoOrdenDetaProduMano.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){
					if(unidadTemp!=null && jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMano!=null) {
						jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMano.setSelectedItem(unidadTemp);
					} else {
						if(jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMano!=null) {
							//jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMano.setSelectedItem(unidadTemp);
							if(jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMano.getItemCount()>0) {
								jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMano.setSelectedIndex(0);
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
	public void setActualUnidadForeignKeyGenerico(Long idUnidadSeleccionado,JComboBox jComboBoxid_unidadProductoOrdenDetaProduManoGenerico)throws Exception
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
				jComboBoxid_unidadProductoOrdenDetaProduManoGenerico.setSelectedItem(unidadTemp);
			} else {
				if(jComboBoxid_unidadProductoOrdenDetaProduManoGenerico!=null && jComboBoxid_unidadProductoOrdenDetaProduManoGenerico.getItemCount()>0) {
					jComboBoxid_unidadProductoOrdenDetaProduManoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarOrdenDetaProduForeignKey(ProductoOrdenDetaProduMano productoordendetaprodumano,JComboBox jComboBoxid_orden_deta_produProductoOrdenDetaProduManoGenerico)throws Exception
	{
		try
		{
			OrdenDetaProdu  ordendetaproduAux=new OrdenDetaProdu();

			if(jComboBoxid_orden_deta_produProductoOrdenDetaProduManoGenerico==null) {
				ordendetaproduAux=(OrdenDetaProdu)this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_orden_deta_produProductoOrdenDetaProduMano.getSelectedItem();
			} else {
				ordendetaproduAux=(OrdenDetaProdu)jComboBoxid_orden_deta_produProductoOrdenDetaProduManoGenerico.getSelectedItem();
			}

			if(ordendetaproduAux!=null && ordendetaproduAux.getId()!=null) {
				productoordendetaprodumano.setid_orden_deta_produ(ordendetaproduAux.getId());
				productoordendetaprodumano.setordendetaprodu_descripcion(ProductoOrdenDetaProduManoConstantesFunciones.getOrdenDetaProduDescripcion(ordendetaproduAux));
				productoordendetaprodumano.setOrdenDetaProdu(ordendetaproduAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoManoProduEmpresaForeignKey(ProductoOrdenDetaProduMano productoordendetaprodumano,JComboBox jComboBoxid_tipo_mano_produ_empresaProductoOrdenDetaProduManoGenerico)throws Exception
	{
		try
		{
			TipoManoProduEmpresa  tipomanoproduempresaAux=new TipoManoProduEmpresa();

			if(jComboBoxid_tipo_mano_produ_empresaProductoOrdenDetaProduManoGenerico==null) {
				tipomanoproduempresaAux=(TipoManoProduEmpresa)this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.getSelectedItem();
			} else {
				tipomanoproduempresaAux=(TipoManoProduEmpresa)jComboBoxid_tipo_mano_produ_empresaProductoOrdenDetaProduManoGenerico.getSelectedItem();
			}

			if(tipomanoproduempresaAux!=null && tipomanoproduempresaAux.getId()!=null) {
				productoordendetaprodumano.setid_tipo_mano_produ_empresa(tipomanoproduempresaAux.getId());
				productoordendetaprodumano.settipomanoproduempresa_descripcion(ProductoOrdenDetaProduManoConstantesFunciones.getTipoManoProduEmpresaDescripcion(tipomanoproduempresaAux));
				productoordendetaprodumano.setTipoManoProduEmpresa(tipomanoproduempresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoProcesoEmpresaProduForeignKey(ProductoOrdenDetaProduMano productoordendetaprodumano,JComboBox jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduManoGenerico)throws Exception
	{
		try
		{
			TipoProcesoEmpresaProdu  tipoprocesoempresaproduAux=new TipoProcesoEmpresaProdu();

			if(jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduManoGenerico==null) {
				tipoprocesoempresaproduAux=(TipoProcesoEmpresaProdu)this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.getSelectedItem();
			} else {
				tipoprocesoempresaproduAux=(TipoProcesoEmpresaProdu)jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduManoGenerico.getSelectedItem();
			}

			if(tipoprocesoempresaproduAux!=null && tipoprocesoempresaproduAux.getId()!=null) {
				productoordendetaprodumano.setid_tipo_proceso_empresa_produ(tipoprocesoempresaproduAux.getId());
				productoordendetaprodumano.settipoprocesoempresaprodu_descripcion(ProductoOrdenDetaProduManoConstantesFunciones.getTipoProcesoEmpresaProduDescripcion(tipoprocesoempresaproduAux));
				productoordendetaprodumano.setTipoProcesoEmpresaProdu(tipoprocesoempresaproduAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUnidadForeignKey(ProductoOrdenDetaProduMano productoordendetaprodumano,JComboBox jComboBoxid_unidadProductoOrdenDetaProduManoGenerico)throws Exception
	{
		try
		{
			Unidad  unidadAux=new Unidad();

			if(jComboBoxid_unidadProductoOrdenDetaProduManoGenerico==null) {
				unidadAux=(Unidad)this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_unidadProductoOrdenDetaProduMano.getSelectedItem();
			} else {
				unidadAux=(Unidad)jComboBoxid_unidadProductoOrdenDetaProduManoGenerico.getSelectedItem();
			}

			if(unidadAux!=null && unidadAux.getId()!=null) {
				productoordendetaprodumano.setid_unidad(unidadAux.getId());
				productoordendetaprodumano.setunidad_descripcion(ProductoOrdenDetaProduManoConstantesFunciones.getUnidadDescripcion(unidadAux));
				productoordendetaprodumano.setUnidad(unidadAux);			}
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

					if(!ProductoOrdenDetaProduManoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) { 
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_orden_deta_produProductoOrdenDetaProduMano.removeAllItems();

							for(OrdenDetaProdu ordendetaprodu:this.ordendetaprodusForeignKey) {
								this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_orden_deta_produProductoOrdenDetaProduMano.addItem(ordendetaprodu);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) { 
					}

					if(!ProductoOrdenDetaProduManoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdOrdenDetaProdu") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoOrdenDetaProduManoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMano.removeAllItems();

							for(OrdenDetaProdu ordendetaprodu:this.ordendetaprodusForeignKey) {
								this.jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMano.addItem(ordendetaprodu);
							}
						}

						if(!ProductoOrdenDetaProduManoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoOrdenDetaProduManoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) { 
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.removeAllItems();

							for(TipoManoProduEmpresa tipomanoproduempresa:this.tipomanoproduempresasForeignKey) {
								this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.addItem(tipomanoproduempresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) { 
					}

					if(!ProductoOrdenDetaProduManoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoManoProduEmpresa") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoOrdenDetaProduManoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano.removeAllItems();

							for(TipoManoProduEmpresa tipomanoproduempresa:this.tipomanoproduempresasForeignKey) {
								this.jComboBoxid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano.addItem(tipomanoproduempresa);
							}
						}

						if(!ProductoOrdenDetaProduManoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoOrdenDetaProduManoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) { 
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.removeAllItems();

							for(TipoProcesoEmpresaProdu tipoprocesoempresaprodu:this.tipoprocesoempresaprodusForeignKey) {
								this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.addItem(tipoprocesoempresaprodu);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) { 
					}

					if(!ProductoOrdenDetaProduManoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoProcesoEmpresaProdu") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoOrdenDetaProduManoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano.removeAllItems();

							for(TipoProcesoEmpresaProdu tipoprocesoempresaprodu:this.tipoprocesoempresaprodusForeignKey) {
								this.jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano.addItem(tipoprocesoempresaprodu);
							}
						}

						if(!ProductoOrdenDetaProduManoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoOrdenDetaProduManoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) { 
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_unidadProductoOrdenDetaProduMano.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_unidadProductoOrdenDetaProduMano.addItem(unidad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) { 
					}

					if(!ProductoOrdenDetaProduManoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoOrdenDetaProduManoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMano.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMano.addItem(unidad);
							}
						}

						if(!ProductoOrdenDetaProduManoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_orden_deta_produProductoOrdenDetaProduMano.setSelectedItem(ordendetaprodu);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_orden_deta_produProductoOrdenDetaProduMano.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMano.setSelectedItem(ordendetaprodu);
						} else {
							this.jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMano.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.setSelectedItem(tipomanoproduempresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano.setSelectedItem(tipomanoproduempresa);
						} else {
							this.jComboBoxid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.setSelectedItem(tipoprocesoempresaprodu);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano.setSelectedItem(tipoprocesoempresaprodu);
						} else {
							this.jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_unidadProductoOrdenDetaProduMano.setSelectedItem(unidad);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_unidadProductoOrdenDetaProduMano.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMano.setSelectedItem(unidad);
						} else {
							this.jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMano.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProductoOrdenDetaProduMano() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ProductoOrdenDetaProduManoConstantesFunciones.refrescarForeignKeysDescripcionesProductoOrdenDetaProduMano(this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ProductoOrdenDetaProduManoConstantesFunciones.refrescarForeignKeysDescripcionesProductoOrdenDetaProduMano(this.productoordendetaprodumanos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(OrdenDetaProdu.class));
		classes.add(new Classe(TipoManoProduEmpresa.class));
		classes.add(new Classe(TipoProcesoEmpresaProdu.class));
		classes.add(new Classe(Unidad.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//productoordendetaprodumanoLogic.setProductoOrdenDetaProduManos(this.productoordendetaprodumanos);
			productoordendetaprodumanoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ProductoOrdenDetaProduManoParameterReturnGeneral getProductoOrdenDetaProduManoParameterGeneral() {
		return this.productoordendetaprodumanoParameterGeneral;
	}
	
	public void setProductoOrdenDetaProduManoParameterGeneral(ProductoOrdenDetaProduManoParameterReturnGeneral productoordendetaprodumanoParameterGeneral) {
		this.productoordendetaprodumanoParameterGeneral = productoordendetaprodumanoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProductoOrdenDetaProduMano() {
		return isPermisoTodoProductoOrdenDetaProduMano;
	}

	public void setIsPermisoTodoProductoOrdenDetaProduMano(Boolean isPermisoTodoProductoOrdenDetaProduMano) {
		this.isPermisoTodoProductoOrdenDetaProduMano = isPermisoTodoProductoOrdenDetaProduMano;
	}

	public Boolean getIsPermisoNuevoProductoOrdenDetaProduMano() {
		return isPermisoNuevoProductoOrdenDetaProduMano;
	}

	public void setIsPermisoNuevoProductoOrdenDetaProduMano(Boolean isPermisoNuevoProductoOrdenDetaProduMano) {
		this.isPermisoNuevoProductoOrdenDetaProduMano = isPermisoNuevoProductoOrdenDetaProduMano;
	}

	public Boolean getIsPermisoActualizarProductoOrdenDetaProduMano() {
		return isPermisoActualizarProductoOrdenDetaProduMano;
	}

	public void setIsPermisoActualizarProductoOrdenDetaProduMano(Boolean isPermisoActualizarProductoOrdenDetaProduMano) {
		this.isPermisoActualizarProductoOrdenDetaProduMano = isPermisoActualizarProductoOrdenDetaProduMano;
	}

	public Boolean getIsPermisoEliminarProductoOrdenDetaProduMano() {
		return isPermisoEliminarProductoOrdenDetaProduMano;
	}

	public void setIsPermisoEliminarProductoOrdenDetaProduMano(Boolean isPermisoEliminarProductoOrdenDetaProduMano) {
		this.isPermisoEliminarProductoOrdenDetaProduMano = isPermisoEliminarProductoOrdenDetaProduMano;
	}

	public Boolean getIsPermisoGuardarCambiosProductoOrdenDetaProduMano() {
		return isPermisoGuardarCambiosProductoOrdenDetaProduMano;
	}

	public void setIsPermisoGuardarCambiosProductoOrdenDetaProduMano(Boolean isPermisoGuardarCambiosProductoOrdenDetaProduMano) {
		this.isPermisoGuardarCambiosProductoOrdenDetaProduMano = isPermisoGuardarCambiosProductoOrdenDetaProduMano;
	}
	
	public Boolean getIsPermisoConsultaProductoOrdenDetaProduMano() {
		return isPermisoConsultaProductoOrdenDetaProduMano;
	}

	public void setIsPermisoConsultaProductoOrdenDetaProduMano(Boolean isPermisoConsultaProductoOrdenDetaProduMano) {
		this.isPermisoConsultaProductoOrdenDetaProduMano = isPermisoConsultaProductoOrdenDetaProduMano;
	}

	public Boolean getIsPermisoBusquedaProductoOrdenDetaProduMano() {
		return isPermisoBusquedaProductoOrdenDetaProduMano;
	}

	public void setIsPermisoBusquedaProductoOrdenDetaProduMano(Boolean isPermisoBusquedaProductoOrdenDetaProduMano) {
		this.isPermisoBusquedaProductoOrdenDetaProduMano = isPermisoBusquedaProductoOrdenDetaProduMano;
	}

	public Boolean getIsPermisoReporteProductoOrdenDetaProduMano() {
		return isPermisoReporteProductoOrdenDetaProduMano;
	}

	public void setIsPermisoReporteProductoOrdenDetaProduMano(Boolean isPermisoReporteProductoOrdenDetaProduMano) {
		this.isPermisoReporteProductoOrdenDetaProduMano = isPermisoReporteProductoOrdenDetaProduMano;
	}
	
	public Boolean getIsPermisoPaginacionMedioProductoOrdenDetaProduMano() {
		return isPermisoPaginacionMedioProductoOrdenDetaProduMano;
	}

	public void setIsPermisoPaginacionMedioProductoOrdenDetaProduMano(Boolean isPermisoPaginacionMedioProductoOrdenDetaProduMano) {
		this.isPermisoPaginacionMedioProductoOrdenDetaProduMano = isPermisoPaginacionMedioProductoOrdenDetaProduMano;
	}
	
	public Boolean getIsPermisoPaginacionTodoProductoOrdenDetaProduMano() {
		return isPermisoPaginacionTodoProductoOrdenDetaProduMano;
	}

	public void setIsPermisoPaginacionTodoProductoOrdenDetaProduMano(Boolean isPermisoPaginacionTodoProductoOrdenDetaProduMano) {
		this.isPermisoPaginacionTodoProductoOrdenDetaProduMano = isPermisoPaginacionTodoProductoOrdenDetaProduMano;
	}
	
	public Boolean getIsPermisoPaginacionAltoProductoOrdenDetaProduMano() {
		return isPermisoPaginacionAltoProductoOrdenDetaProduMano;
	}

	public void setIsPermisoPaginacionAltoProductoOrdenDetaProduMano(Boolean isPermisoPaginacionAltoProductoOrdenDetaProduMano) {
		this.isPermisoPaginacionAltoProductoOrdenDetaProduMano = isPermisoPaginacionAltoProductoOrdenDetaProduMano;
	}
	
	public Boolean getIsPermisoCopiarProductoOrdenDetaProduMano() {
		return isPermisoCopiarProductoOrdenDetaProduMano;
	}

	public void setIsPermisoCopiarProductoOrdenDetaProduMano(Boolean isPermisoCopiarProductoOrdenDetaProduMano) {
		this.isPermisoCopiarProductoOrdenDetaProduMano = isPermisoCopiarProductoOrdenDetaProduMano;
	}
	
	public Boolean getIsPermisoVerFormProductoOrdenDetaProduMano() {
		return isPermisoVerFormProductoOrdenDetaProduMano;
	}

	public void setIsPermisoVerFormProductoOrdenDetaProduMano(Boolean isPermisoVerFormProductoOrdenDetaProduMano) {
		this.isPermisoVerFormProductoOrdenDetaProduMano = isPermisoVerFormProductoOrdenDetaProduMano;
	}
	
	public Boolean getIsPermisoDuplicarProductoOrdenDetaProduMano() {
		return isPermisoDuplicarProductoOrdenDetaProduMano;
	}

	public void setIsPermisoDuplicarProductoOrdenDetaProduMano(Boolean isPermisoDuplicarProductoOrdenDetaProduMano) {
		this.isPermisoDuplicarProductoOrdenDetaProduMano = isPermisoDuplicarProductoOrdenDetaProduMano;
	}
	
	public Boolean getIsPermisoOrdenProductoOrdenDetaProduMano() {
		return isPermisoOrdenProductoOrdenDetaProduMano;
	}

	public void setIsPermisoOrdenProductoOrdenDetaProduMano(Boolean isPermisoOrdenProductoOrdenDetaProduMano) {
		this.isPermisoOrdenProductoOrdenDetaProduMano = isPermisoOrdenProductoOrdenDetaProduMano;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProductoOrdenDetaProduMano() {
		return isVisibilidadCeldaNuevoProductoOrdenDetaProduMano;
	}

	public void setIsVisibilidadCeldaNuevoProductoOrdenDetaProduMano(Boolean isVisibilidadCeldaNuevoProductoOrdenDetaProduMano) {
		this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMano = isVisibilidadCeldaNuevoProductoOrdenDetaProduMano;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProductoOrdenDetaProduMano() {
		return isVisibilidadCeldaDuplicarProductoOrdenDetaProduMano;
	}

	public void setIsVisibilidadCeldaDuplicarProductoOrdenDetaProduMano(Boolean isVisibilidadCeldaDuplicarProductoOrdenDetaProduMano) {
		this.isVisibilidadCeldaDuplicarProductoOrdenDetaProduMano = isVisibilidadCeldaDuplicarProductoOrdenDetaProduMano;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProductoOrdenDetaProduMano() {
		return isVisibilidadCeldaCopiarProductoOrdenDetaProduMano;
	}

	public void setIsVisibilidadCeldaCopiarProductoOrdenDetaProduMano(Boolean isVisibilidadCeldaCopiarProductoOrdenDetaProduMano) {
		this.isVisibilidadCeldaCopiarProductoOrdenDetaProduMano = isVisibilidadCeldaCopiarProductoOrdenDetaProduMano;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProductoOrdenDetaProduMano() {
		return isVisibilidadCeldaVerFormProductoOrdenDetaProduMano;
	}

	public void setIsVisibilidadCeldaVerFormProductoOrdenDetaProduMano(Boolean isVisibilidadCeldaVerFormProductoOrdenDetaProduMano) {
		this.isVisibilidadCeldaVerFormProductoOrdenDetaProduMano = isVisibilidadCeldaVerFormProductoOrdenDetaProduMano;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProductoOrdenDetaProduMano() {
		return isVisibilidadCeldaOrdenProductoOrdenDetaProduMano;
	}

	public void setIsVisibilidadCeldaOrdenProductoOrdenDetaProduMano(Boolean isVisibilidadCeldaOrdenProductoOrdenDetaProduMano) {
		this.isVisibilidadCeldaOrdenProductoOrdenDetaProduMano = isVisibilidadCeldaOrdenProductoOrdenDetaProduMano;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMano() {
		return isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMano;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMano(Boolean isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMano) {
		this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMano = isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMano;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProductoOrdenDetaProduMano() {
		return isVisibilidadCeldaModificarProductoOrdenDetaProduMano;
	}

	public void setIsVisibilidadCeldaModificarProductoOrdenDetaProduMano(Boolean isVisibilidadCeldaModificarProductoOrdenDetaProduMano) {
		this.isVisibilidadCeldaModificarProductoOrdenDetaProduMano = isVisibilidadCeldaModificarProductoOrdenDetaProduMano;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProductoOrdenDetaProduMano() {
		return isVisibilidadCeldaActualizarProductoOrdenDetaProduMano;
	}

	public void setIsVisibilidadCeldaActualizarProductoOrdenDetaProduMano(Boolean isVisibilidadCeldaActualizarProductoOrdenDetaProduMano) {
		this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMano = isVisibilidadCeldaActualizarProductoOrdenDetaProduMano;
	}

	public Boolean getIsVisibilidadCeldaEliminarProductoOrdenDetaProduMano() {
		return isVisibilidadCeldaEliminarProductoOrdenDetaProduMano;
	}

	public void setIsVisibilidadCeldaEliminarProductoOrdenDetaProduMano(Boolean isVisibilidadCeldaEliminarProductoOrdenDetaProduMano) {
		this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMano = isVisibilidadCeldaEliminarProductoOrdenDetaProduMano;
	}

	public Boolean getIsVisibilidadCeldaCancelarProductoOrdenDetaProduMano() {
		return isVisibilidadCeldaCancelarProductoOrdenDetaProduMano;
	}

	public void setIsVisibilidadCeldaCancelarProductoOrdenDetaProduMano(Boolean isVisibilidadCeldaCancelarProductoOrdenDetaProduMano) {
		this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMano = isVisibilidadCeldaCancelarProductoOrdenDetaProduMano;
	}

	public Boolean getIsVisibilidadCeldaGuardarProductoOrdenDetaProduMano() {
		return isVisibilidadCeldaGuardarProductoOrdenDetaProduMano;
	}

	public void setIsVisibilidadCeldaGuardarProductoOrdenDetaProduMano(Boolean isVisibilidadCeldaGuardarProductoOrdenDetaProduMano) {
		this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMano = isVisibilidadCeldaGuardarProductoOrdenDetaProduMano;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMano() {
		return isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMano;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMano(Boolean isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMano) {
		this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMano = isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMano;
	}
		
	public ProductoOrdenDetaProduManoSessionBean getproductoordendetaprodumanoSessionBean() {
		return this.productoordendetaprodumanoSessionBean;
	}
	
	public void setproductoordendetaprodumanoSessionBean(ProductoOrdenDetaProduManoSessionBean productoordendetaprodumanoSessionBean) {
		this.productoordendetaprodumanoSessionBean=productoordendetaprodumanoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdOrdenDetaProdu() {
		return this.isVisibilidadFK_IdOrdenDetaProdu;
	}

	public void setisVisibilidadFK_IdOrdenDetaProdu(Boolean isVisibilidadFK_IdOrdenDetaProdu) {
		this.isVisibilidadFK_IdOrdenDetaProdu=isVisibilidadFK_IdOrdenDetaProdu;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMano(ProductoOrdenDetaProduMano productoordendetaprodumano)throws Exception {
		try {
			
				this.setActualParaGuardarOrdenDetaProduForeignKey(productoordendetaprodumano,null);
				this.setActualParaGuardarTipoManoProduEmpresaForeignKey(productoordendetaprodumano,null);
				this.setActualParaGuardarTipoProcesoEmpresaProduForeignKey(productoordendetaprodumano,null);
				this.setActualParaGuardarUnidadForeignKey(productoordendetaprodumano,null);
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
	
	public void bugActualizarReferenciaActual(ProductoOrdenDetaProduMano productoordendetaprodumano,ProductoOrdenDetaProduMano productoordendetaprodumanoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProductoOrdenDetaProduMano(productoordendetaprodumano);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		productoordendetaprodumanoAux.setId(productoordendetaprodumano.getId());
		productoordendetaprodumanoAux.setVersionRow(productoordendetaprodumano.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessProductoOrdenDetaProduMano();
		
			int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMano.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanos.toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ProductoOrdenDetaProduManoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMano(this.productoordendetaprodumano,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMano(this.productoordendetaprodumano);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = productoordendetaprodumanoValidator.getInvalidValues(this.productoordendetaprodumano);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			productoordendetaprodumanoLogic.setDatosCliente(datosCliente);
			productoordendetaprodumanoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				productoordendetaprodumanoAux=new  ProductoOrdenDetaProduMano();
				
				productoordendetaprodumanoAux.setIsNew(true);
				productoordendetaprodumanoAux.setIsChanged(true);
				
				productoordendetaprodumanoAux.setProductoOrdenDetaProduManoOriginal(this.productoordendetaprodumano);
				
				productoordendetaprodumanoAux.setId(this.productoordendetaprodumano.getId());	
				productoordendetaprodumanoAux.setVersionRow(this.productoordendetaprodumano.getVersionRow());	
				productoordendetaprodumanoAux.setid_orden_deta_produ(this.productoordendetaprodumano.getid_orden_deta_produ());	
				productoordendetaprodumanoAux.setid_tipo_mano_produ_empresa(this.productoordendetaprodumano.getid_tipo_mano_produ_empresa());	
				productoordendetaprodumanoAux.setid_tipo_proceso_empresa_produ(this.productoordendetaprodumano.getid_tipo_proceso_empresa_produ());	
				productoordendetaprodumanoAux.setid_unidad(this.productoordendetaprodumano.getid_unidad());	
				productoordendetaprodumanoAux.setcantidad(this.productoordendetaprodumano.getcantidad());	
				productoordendetaprodumanoAux.setcosto(this.productoordendetaprodumano.getcosto());	
				productoordendetaprodumanoAux.setcosto_total(this.productoordendetaprodumano.getcosto_total());	
				productoordendetaprodumanoAux.setdescripcion(this.productoordendetaprodumano.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productoordendetaprodumanoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(productoordendetaprodumanoAux,productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoordendetaprodumanoAux,productoordendetaprodumanos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.productoordendetaprodumanoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodumanoLogic.saveProductoOrdenDetaProduManos();//WithConnection
						//productoordendetaprodumanoLogic.getSetVersionRowProductoOrdenDetaProduManos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.productoordendetaprodumano,productoordendetaprodumanoAux);
					
					this.refrescarForeignKeysDescripcionesProductoOrdenDetaProduMano();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoordendetaprodumanoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoordendetaprodumanoLogic.saveProductoOrdenDetaProduManoRelaciones(productoordendetaprodumanoAux);//WithConnection
								//productoordendetaprodumanoLogic.getSetVersionRowProductoOrdenDetaProduManos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.productoordendetaprodumano,productoordendetaprodumanoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.productoordendetaprodumanoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(productoordendetaprodumanoAux,productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(productoordendetaprodumanoAux,productoordendetaprodumanos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.productoordendetaprodumano,productoordendetaprodumanoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				productoordendetaprodumanoAux=new  ProductoOrdenDetaProduMano();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado() 
					|| (this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado() && this.productoordendetaprodumano.getId()>=0)) {
						
					productoordendetaprodumanoAux.setIsNew(false);
				}
				
				productoordendetaprodumanoAux.setIsDeleted(false);
			
				productoordendetaprodumanoAux.setId(this.productoordendetaprodumano.getId());	
				productoordendetaprodumanoAux.setVersionRow(this.productoordendetaprodumano.getVersionRow());	
				productoordendetaprodumanoAux.setid_orden_deta_produ(this.productoordendetaprodumano.getid_orden_deta_produ());	
				productoordendetaprodumanoAux.setid_tipo_mano_produ_empresa(this.productoordendetaprodumano.getid_tipo_mano_produ_empresa());	
				productoordendetaprodumanoAux.setid_tipo_proceso_empresa_produ(this.productoordendetaprodumano.getid_tipo_proceso_empresa_produ());	
				productoordendetaprodumanoAux.setid_unidad(this.productoordendetaprodumano.getid_unidad());	
				productoordendetaprodumanoAux.setcantidad(this.productoordendetaprodumano.getcantidad());	
				productoordendetaprodumanoAux.setcosto(this.productoordendetaprodumano.getcosto());	
				productoordendetaprodumanoAux.setcosto_total(this.productoordendetaprodumano.getcosto_total());	
				productoordendetaprodumanoAux.setdescripcion(this.productoordendetaprodumano.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productoordendetaprodumanoAux,productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoordendetaprodumanoAux,productoordendetaprodumanos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.productoordendetaprodumanoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodumanoLogic.saveProductoOrdenDetaProduManos();//WithConnection
						//productoordendetaprodumanoLogic.getSetVersionRowProductoOrdenDetaProduManos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.productoordendetaprodumano,productoordendetaprodumanoAux);
					
					this.refrescarForeignKeysDescripcionesProductoOrdenDetaProduMano();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoordendetaprodumanoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoordendetaprodumanoLogic.saveProductoOrdenDetaProduManoRelaciones(productoordendetaprodumanoAux);//WithConnection
								//productoordendetaprodumanoLogic.getSetVersionRowProductoOrdenDetaProduManos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.productoordendetaprodumano,productoordendetaprodumanoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.productoordendetaprodumanoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(productoordendetaprodumanoAux,productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(productoordendetaprodumanoAux,productoordendetaprodumanos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.productoordendetaprodumano,productoordendetaprodumanoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				productoordendetaprodumanoAux=new  ProductoOrdenDetaProduMano();
				
				productoordendetaprodumanoAux.setIsNew(false);
				productoordendetaprodumanoAux.setIsChanged(false);
				
				productoordendetaprodumanoAux.setIsDeleted(true);
				
				productoordendetaprodumanoAux.setId(this.productoordendetaprodumano.getId());	
				productoordendetaprodumanoAux.setVersionRow(this.productoordendetaprodumano.getVersionRow());	
				productoordendetaprodumanoAux.setid_orden_deta_produ(this.productoordendetaprodumano.getid_orden_deta_produ());	
				productoordendetaprodumanoAux.setid_tipo_mano_produ_empresa(this.productoordendetaprodumano.getid_tipo_mano_produ_empresa());	
				productoordendetaprodumanoAux.setid_tipo_proceso_empresa_produ(this.productoordendetaprodumano.getid_tipo_proceso_empresa_produ());	
				productoordendetaprodumanoAux.setid_unidad(this.productoordendetaprodumano.getid_unidad());	
				productoordendetaprodumanoAux.setcantidad(this.productoordendetaprodumano.getcantidad());	
				productoordendetaprodumanoAux.setcosto(this.productoordendetaprodumano.getcosto());	
				productoordendetaprodumanoAux.setcosto_total(this.productoordendetaprodumano.getcosto_total());	
				productoordendetaprodumanoAux.setdescripcion(this.productoordendetaprodumano.getdescripcion());	
				
				if(this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.productoordendetaprodumanoAux.getId()>=0) {	
						this.productoordendetaprodumanosEliminados.add(productoordendetaprodumanoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(productoordendetaprodumanoAux,productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoordendetaprodumanoAux,productoordendetaprodumanos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.productoordendetaprodumanoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodumanoLogic.saveProductoOrdenDetaProduManos();//WithConnection
						//productoordendetaprodumanoLogic.getSetVersionRowProductoOrdenDetaProduManos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoordendetaprodumanoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoordendetaprodumanoLogic.saveProductoOrdenDetaProduManoRelaciones(productoordendetaprodumanoAux);//WithConnection
								//productoordendetaprodumanoLogic.getSetVersionRowProductoOrdenDetaProduManos();//WithConnection
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
							if(this.productoordendetaprodumanoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(productoordendetaprodumanoAux,productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(productoordendetaprodumanoAux,productoordendetaprodumanos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().addAll(this.productoordendetaprodumanosEliminados);
					
					productoordendetaprodumanoLogic.saveProductoOrdenDetaProduManos();//WithConnection
					//productoordendetaprodumanoLogic.getSetVersionRowProductoOrdenDetaProduManos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesProductoOrdenDetaProduMano();
				
				this.productoordendetaprodumanosEliminados= new ArrayList<ProductoOrdenDetaProduMano>();		
			}
			
			if(this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Orden  Mano De Obra GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Orden  Mano De Obra",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.productoordendetaprodumano=productoordendetaprodumanoAux;
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
      		//this.finishProcessProductoOrdenDetaProduMano();
      	}
		
	}	
	
	public void actualizarRelaciones(ProductoOrdenDetaProduMano productoordendetaprodumanoLocal) throws Exception {
		
		if(this.productoordendetaprodumanoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProductoOrdenDetaProduMano productoordendetaprodumanoLocal) throws Exception {	
		if(this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(OrdenDetaProduDetalleFormJInternalFrame.class)) {
				OrdenDetaProduBeanSwingJInternalFrame ordendetaproduBeanSwingJInternalFrameLocal=(OrdenDetaProduBeanSwingJInternalFrame) ((OrdenDetaProduDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ordendetaproduBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoOrdenDetaProdu(ordendetaproduBeanSwingJInternalFrameLocal.getordendetaprodu(),true);
				ordendetaproduBeanSwingJInternalFrameLocal.actualizarLista(ordendetaproduBeanSwingJInternalFrameLocal.ordendetaprodu,this.ordendetaprodusForeignKey);

				ordendetaproduBeanSwingJInternalFrameLocal.actualizarRelaciones(ordendetaproduBeanSwingJInternalFrameLocal.ordendetaprodu);

				productoordendetaprodumanoLocal.setOrdenDetaProdu(ordendetaproduBeanSwingJInternalFrameLocal.ordendetaprodu);

				this.addItemDefectoCombosForeignKeyOrdenDetaProdu();
				this.cargarCombosFrameOrdenDetaProdusForeignKey("Formulario");
				this.setActualOrdenDetaProduForeignKey(ordendetaproduBeanSwingJInternalFrameLocal.ordendetaprodu.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoManoProduEmpresaDetalleFormJInternalFrame.class)) {
				TipoManoProduEmpresaBeanSwingJInternalFrame tipomanoproduempresaBeanSwingJInternalFrameLocal=(TipoManoProduEmpresaBeanSwingJInternalFrame) ((TipoManoProduEmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipomanoproduempresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoManoProduEmpresa(tipomanoproduempresaBeanSwingJInternalFrameLocal.gettipomanoproduempresa(),true);
				tipomanoproduempresaBeanSwingJInternalFrameLocal.actualizarLista(tipomanoproduempresaBeanSwingJInternalFrameLocal.tipomanoproduempresa,this.tipomanoproduempresasForeignKey);

				tipomanoproduempresaBeanSwingJInternalFrameLocal.actualizarRelaciones(tipomanoproduempresaBeanSwingJInternalFrameLocal.tipomanoproduempresa);

				productoordendetaprodumanoLocal.setTipoManoProduEmpresa(tipomanoproduempresaBeanSwingJInternalFrameLocal.tipomanoproduempresa);

				this.addItemDefectoCombosForeignKeyTipoManoProduEmpresa();
				this.cargarCombosFrameTipoManoProduEmpresasForeignKey("Formulario");
				this.setActualTipoManoProduEmpresaForeignKey(tipomanoproduempresaBeanSwingJInternalFrameLocal.tipomanoproduempresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoProcesoEmpresaProduDetalleFormJInternalFrame.class)) {
				TipoProcesoEmpresaProduBeanSwingJInternalFrame tipoprocesoempresaproduBeanSwingJInternalFrameLocal=(TipoProcesoEmpresaProduBeanSwingJInternalFrame) ((TipoProcesoEmpresaProduDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoprocesoempresaproduBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoProcesoEmpresaProdu(tipoprocesoempresaproduBeanSwingJInternalFrameLocal.gettipoprocesoempresaprodu(),true);
				tipoprocesoempresaproduBeanSwingJInternalFrameLocal.actualizarLista(tipoprocesoempresaproduBeanSwingJInternalFrameLocal.tipoprocesoempresaprodu,this.tipoprocesoempresaprodusForeignKey);

				tipoprocesoempresaproduBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoprocesoempresaproduBeanSwingJInternalFrameLocal.tipoprocesoempresaprodu);

				productoordendetaprodumanoLocal.setTipoProcesoEmpresaProdu(tipoprocesoempresaproduBeanSwingJInternalFrameLocal.tipoprocesoempresaprodu);

				this.addItemDefectoCombosForeignKeyTipoProcesoEmpresaProdu();
				this.cargarCombosFrameTipoProcesoEmpresaProdusForeignKey("Formulario");
				this.setActualTipoProcesoEmpresaProduForeignKey(tipoprocesoempresaproduBeanSwingJInternalFrameLocal.tipoprocesoempresaprodu.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UnidadDetalleFormJInternalFrame.class)) {
				UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrameLocal=(UnidadBeanSwingJInternalFrame) ((UnidadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				unidadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUnidad(unidadBeanSwingJInternalFrameLocal.getunidad(),true);
				unidadBeanSwingJInternalFrameLocal.actualizarLista(unidadBeanSwingJInternalFrameLocal.unidad,this.unidadsForeignKey);

				unidadBeanSwingJInternalFrameLocal.actualizarRelaciones(unidadBeanSwingJInternalFrameLocal.unidad);

				productoordendetaprodumanoLocal.setUnidad(unidadBeanSwingJInternalFrameLocal.unidad);

				this.addItemDefectoCombosForeignKeyUnidad();
				this.cargarCombosFrameUnidadsForeignKey("Formulario");
				this.setActualUnidadForeignKey(unidadBeanSwingJInternalFrameLocal.unidad.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProductoOrdenDetaProduManoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMano.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanos.toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = productoordendetaprodumanoValidator.getInvalidValues(this.productoordendetaprodumano);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProductoOrdenDetaProduMano productoordendetaprodumano,List<ProductoOrdenDetaProduMano> productoordendetaprodumanos) throws Exception {
		try	{		
			ProductoOrdenDetaProduManoConstantesFunciones.actualizarLista(productoordendetaprodumano,productoordendetaprodumanos,this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ProductoOrdenDetaProduMano productoordendetaprodumano,List<ProductoOrdenDetaProduMano> productoordendetaprodumanos) throws Exception {
		try	{			
			ProductoOrdenDetaProduManoConstantesFunciones.actualizarSelectedLista(productoordendetaprodumano,productoordendetaprodumanos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProductoOrdenDetaProduMano> productoordendetaprodumanosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				productoordendetaprodumanosLocal=this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				productoordendetaprodumanosLocal=this.productoordendetaprodumanos;
			}
			//ARCHITECTURE
		
			for(ProductoOrdenDetaProduMano productoordendetaprodumanoLocal:productoordendetaprodumanosLocal) {
				if(this.permiteMantenimiento(productoordendetaprodumanoLocal) && productoordendetaprodumanoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProductoOrdenDetaProduManoConstantesFunciones.getProductoOrdenDetaProduManoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduManoConstantesFunciones.IDORDENDETAPRODU)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jLabelid_orden_deta_produProductoOrdenDetaProduMano,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduManoConstantesFunciones.IDTIPOMANOPRODUEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jLabelid_tipo_mano_produ_empresaProductoOrdenDetaProduMano,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduManoConstantesFunciones.IDTIPOPROCESOEMPRESAPRODU)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jLabelid_tipo_proceso_empresa_produProductoOrdenDetaProduMano,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduManoConstantesFunciones.IDUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jLabelid_unidadProductoOrdenDetaProduMano,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduManoConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jLabelcantidadProductoOrdenDetaProduMano,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduManoConstantesFunciones.COSTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jLabelcostoProductoOrdenDetaProduMano,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduManoConstantesFunciones.COSTOTOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jLabelcosto_totalProductoOrdenDetaProduMano,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduManoConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jLabeldescripcionProductoOrdenDetaProduMano,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jLabelid_orden_deta_produProductoOrdenDetaProduMano,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jLabelid_tipo_mano_produ_empresaProductoOrdenDetaProduMano,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jLabelid_tipo_proceso_empresa_produProductoOrdenDetaProduMano,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jLabelid_unidadProductoOrdenDetaProduMano,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jLabelcantidadProductoOrdenDetaProduMano,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jLabelcostoProductoOrdenDetaProduMano,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jLabelcosto_totalProductoOrdenDetaProduMano,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jLabeldescripcionProductoOrdenDetaProduMano,"");
		
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
		this.iIdNuevoProductoOrdenDetaProduMano--;	
		
		
		this.productoordendetaprodumanoAux=new ProductoOrdenDetaProduMano();
		
		this.productoordendetaprodumanoAux.setId(this.iIdNuevoProductoOrdenDetaProduMano);
		this.productoordendetaprodumanoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().add(this.productoordendetaprodumanoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.productoordendetaprodumanos.add(this.productoordendetaprodumanoAux);
		}
		//ARCHITECTURE
		
		this.productoordendetaprodumano=this.productoordendetaprodumanoAux;
		
		if(ProductoOrdenDetaProduManoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProductoOrdenDetaProduMano(this.productoordendetaprodumano);
			this.setVariablesObjetoActualToFormularioForeignKeyProductoOrdenDetaProduMano(this.productoordendetaprodumano);
		}
				
		//this.setDefaultControlesProductoOrdenDetaProduMano();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProductoOrdenDetaProduMano();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProductoOrdenDetaProduMano();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductoOrdenDetaProduMano();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductoOrdenDetaProduMano(this.productoordendetaprodumanoBean,this.productoordendetaprodumano,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMano(this.productoordendetaprodumano);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.productoordendetaprodumanoSessionBean.getConGuardarRelaciones()) {
			classes=ProductoOrdenDetaProduManoConstantesFunciones.getClassesRelationshipsOfProductoOrdenDetaProduMano(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.productoordendetaprodumanoReturnGeneral=productoordendetaprodumanoLogic.procesarEventosProductoOrdenDetaProduManosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos(),this.productoordendetaprodumano,this.productoordendetaprodumanoParameterGeneral,this.isEsNuevoProductoOrdenDetaProduMano,classes);//this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduMano()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProductoOrdenDetaProduMano(this.productoordendetaprodumanoReturnGeneral,this.productoordendetaprodumanoBean,false);
		
		if(this.productoordendetaprodumanoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProductoOrdenDetaProduMano(this.productoordendetaprodumanoReturnGeneral.getProductoOrdenDetaProduMano());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProductoOrdenDetaProduMano(this.productoordendetaprodumanoReturnGeneral.getProductoOrdenDetaProduMano());
		}
		
		if(this.productoordendetaprodumanoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProductoOrdenDetaProduMano(this.productoordendetaprodumanoReturnGeneral.getProductoOrdenDetaProduMano(),classes);//this.productoordendetaprodumanoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMano(this.productoordendetaprodumano,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProductoOrdenDetaProduMano();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProductoOrdenDetaProduMano();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.RecargarFormProductoOrdenDetaProduMano(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProductoOrdenDetaProduMano(false);
						
			if(productoordendetaprodumanoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProductoOrdenDetaProduManoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoOrdenDetaProduMano();
			}
			
			this.actualizarVisualTableDatosProductoOrdenDetaProduMano();
			
			this.jTableDatosProductoOrdenDetaProduMano.setRowSelectionInterval(this.getIndiceNuevoProductoOrdenDetaProduMano(), this.getIndiceNuevoProductoOrdenDetaProduMano());
			
			this.seleccionarFilaTablaProductoOrdenDetaProduManoActual();
						
			this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduMano("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProductoOrdenDetaProduMano(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTextFieldcantidadProductoOrdenDetaProduMano.setEnabled(isHabilitar && this.productoordendetaprodumanoConstantesFunciones.activarcantidadProductoOrdenDetaProduMano);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTextFieldcostoProductoOrdenDetaProduMano.setEnabled(isHabilitar && this.productoordendetaprodumanoConstantesFunciones.activarcostoProductoOrdenDetaProduMano);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTextFieldcosto_totalProductoOrdenDetaProduMano.setEnabled(isHabilitar && this.productoordendetaprodumanoConstantesFunciones.activarcosto_totalProductoOrdenDetaProduMano);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTextAreadescripcionProductoOrdenDetaProduMano.setEnabled(isHabilitar && this.productoordendetaprodumanoConstantesFunciones.activardescripcionProductoOrdenDetaProduMano);	
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_orden_deta_produProductoOrdenDetaProduMano.setEnabled(isHabilitar && this.productoordendetaprodumanoConstantesFunciones.activarid_orden_deta_produProductoOrdenDetaProduMano);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.setEnabled(isHabilitar && this.productoordendetaprodumanoConstantesFunciones.activarid_tipo_mano_produ_empresaProductoOrdenDetaProduMano);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.setEnabled(isHabilitar && this.productoordendetaprodumanoConstantesFunciones.activarid_tipo_proceso_empresa_produProductoOrdenDetaProduMano);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_unidadProductoOrdenDetaProduMano.setEnabled(isHabilitar && this.productoordendetaprodumanoConstantesFunciones.activarid_unidadProductoOrdenDetaProduMano);
	};
	
	public void setDefaultControlesProductoOrdenDetaProduMano() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProductoOrdenDetaProduMano(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.productoordendetaprodumanoSessionBean.setConGuardarRelaciones(true);			
			this.productoordendetaprodumanoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTabbedPaneRelacionesProductoOrdenDetaProduMano.setVisible(true);
			
					
		} else {
			//this.productoordendetaprodumanoSessionBean.setConGuardarRelaciones(false);			
			this.productoordendetaprodumanoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTabbedPaneRelacionesProductoOrdenDetaProduMano.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProductoOrdenDetaProduMano() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoOrdenDetaProduMano productoordendetaprodumanoAux:this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos()) {
				if(productoordendetaprodumanoAux.getId().equals(this.iIdNuevoProductoOrdenDetaProduMano)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoOrdenDetaProduMano productoordendetaprodumanoAux:this.productoordendetaprodumanos) {
				if(productoordendetaprodumanoAux.getId().equals(this.iIdNuevoProductoOrdenDetaProduMano)) {
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
	
	public int getIndiceActualProductoOrdenDetaProduMano(ProductoOrdenDetaProduMano productoordendetaprodumano,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoOrdenDetaProduMano productoordendetaprodumanoAux:this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos()) {
				if(productoordendetaprodumanoAux.getId().equals(productoordendetaprodumano.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoOrdenDetaProduMano productoordendetaprodumanoAux:this.productoordendetaprodumanos) {
				if(productoordendetaprodumanoAux.getId().equals(productoordendetaprodumano.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProductoOrdenDetaProduMano(ProductoOrdenDetaProduMano productoordendetaprodumanoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoOrdenDetaProduMano productoordendetaprodumanoAux:this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos()) {
				if(productoordendetaprodumanoAux.getProductoOrdenDetaProduManoOriginal().getId().equals(productoordendetaprodumanoOriginal.getId())) {
					existe=true;
					productoordendetaprodumanoOriginal.setId(productoordendetaprodumanoAux.getId());
					productoordendetaprodumanoOriginal.setVersionRow(productoordendetaprodumanoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoOrdenDetaProduMano productoordendetaprodumanoAux:this.productoordendetaprodumanos) {
				if(productoordendetaprodumanoAux.getProductoOrdenDetaProduManoOriginal().getId().equals(productoordendetaprodumanoOriginal.getId())) {
					existe=true;
					productoordendetaprodumanoOriginal.setId(productoordendetaprodumanoAux.getId());
					productoordendetaprodumanoOriginal.setVersionRow(productoordendetaprodumanoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProductoOrdenDetaProduMano(Boolean esParaCancelar) throws Exception {
		productoordendetaprodumanosAux=new ArrayList<ProductoOrdenDetaProduMano>();
		productoordendetaprodumanoAux=new ProductoOrdenDetaProduMano();
		
		if(!this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductoOrdenDetaProduMano productoordendetaprodumanoAux:this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos()) {
					if(productoordendetaprodumanoAux.getId()<0) {
						productoordendetaprodumanosAux.add(productoordendetaprodumanoAux);
					}		
				}
				this.iIdNuevoProductoOrdenDetaProduMano=0L;
				this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().removeAll(productoordendetaprodumanosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoOrdenDetaProduMano productoordendetaprodumanoAux:this.productoordendetaprodumanos) {
					if(productoordendetaprodumanoAux.getId()<0) {
						productoordendetaprodumanosAux.add(productoordendetaprodumanoAux);
					}		
				}
				this.iIdNuevoProductoOrdenDetaProduMano=0L;
				this.productoordendetaprodumanos.removeAll(productoordendetaprodumanosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProductoOrdenDetaProduMano 
					&& this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().size()>0
					) {
					productoordendetaprodumanoAux=this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().get(this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().size() - 1);
				
					if(productoordendetaprodumanoAux.getId()<0) {
						this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().remove(productoordendetaprodumanoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProductoOrdenDetaProduMano && this.productoordendetaprodumanos.size()>0) {
					productoordendetaprodumanoAux=this.productoordendetaprodumanos.get(this.productoordendetaprodumanos.size() - 1);
				
					if(productoordendetaprodumanoAux.getId()<0) {
						this.productoordendetaprodumanos.remove(productoordendetaprodumanoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProductoOrdenDetaProduMano(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(productoordendetaprodumano.getId()<0) {
				this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().remove(this.productoordendetaprodumano);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(productoordendetaprodumano.getId()<0) {
				this.productoordendetaprodumanos.remove(this.productoordendetaprodumano);
			}
		}			
	}
	
	public void setEstadosInicialesProductoOrdenDetaProduMano(List<ProductoOrdenDetaProduMano> productoordendetaprodumanosAux) throws Exception {
		ProductoOrdenDetaProduManoConstantesFunciones.setEstadosInicialesProductoOrdenDetaProduMano(productoordendetaprodumanosAux);
	}
	
	public void setEstadosInicialesProductoOrdenDetaProduMano(ProductoOrdenDetaProduMano productoordendetaprodumanoAux) throws Exception {
		ProductoOrdenDetaProduManoConstantesFunciones.setEstadosInicialesProductoOrdenDetaProduMano(productoordendetaprodumanoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProductoOrdenDetaProduManoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduMano("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProductoOrdenDetaProduManoActual()) {
				if(!this.isEsNuevoProductoOrdenDetaProduMano) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduMano("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProductoOrdenDetaProduMano=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProductoOrdenDetaProduManoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Orden  Mano De Obra ?", "MANTENIMIENTO DE Orden  Mano De Obra", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduMano("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProductoOrdenDetaProduMano productoordendetaprodumano) throws Exception {
		ProductoOrdenDetaProduManoConstantesFunciones.seleccionarAsignar(this.productoordendetaprodumano,productoordendetaprodumano);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProductoOrdenDetaProduMano=this.isPermisoActualizarOriginalProductoOrdenDetaProduMano;
			
			
			this.seleccionarAsignar(productoordendetaprodumano);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductoOrdenDetaProduManoConstantesFunciones.quitarEspaciosProductoOrdenDetaProduMano(this.productoordendetaprodumano,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduMano("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.productoordendetaprodumanoSessionBean.setsFuncionBusquedaRapida(this.productoordendetaprodumanoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProductoOrdenDetaProduMano) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProductoOrdenDetaProduMano(esParaCancelar);				
				this.cancelarNuevoProductoOrdenDetaProduMano(esParaCancelar);								
			}
			
			this.productoordendetaprodumano=new ProductoOrdenDetaProduMano();
			
			this.inicializarProductoOrdenDetaProduMano();
			
			this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduMano("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProductoOrdenDetaProduMano() throws Exception {
		try {
			ProductoOrdenDetaProduManoConstantesFunciones.inicializarProductoOrdenDetaProduMano(this.productoordendetaprodumano);
			
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
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProductoOrdenDetaProduManos(String sAccionBusqueda,List<ProductoOrdenDetaProduMano> productoordendetaprodumanosParaReportes) throws Exception {
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
					sPathReporteFinal="ProductoOrdenDetaProduMano"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProductoOrdenDetaProduManoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProductoOrdenDetaProduManoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProductoOrdenDetaProduMano"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Orden  Mano De Obraes");		
		parameters.put("busquedapor", ProductoOrdenDetaProduManoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProductoOrdenDetaProduMano=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProductoOrdenDetaProduManoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProductoOrdenDetaProduManoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProductoOrdenDetaProduMano=new JRBeanArrayDataSource(ProductoOrdenDetaProduManoJInternalFrame.TraerProductoOrdenDetaProduManoBeans(productoordendetaprodumanosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProductoOrdenDetaProduMano);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProductoOrdenDetaProduManoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProductoOrdenDetaProduManoBean.TraerProductoOrdenDetaProduManoBeans(productoordendetaprodumanosParaReportes).toArray()));
							
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
				this.generarExcelReporteProductoOrdenDetaProduManos(sAccionBusqueda,sTipoArchivoReporte,productoordendetaprodumanosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProductoOrdenDetaProduManos(sAccionBusqueda,sTipoArchivoReporte,productoordendetaprodumanosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduManoActionPerformed(null);
					//this.generarExcelReporteProductoOrdenDetaProduManos(sAccionBusqueda,sTipoArchivoReporte,productoordendetaprodumanosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProductoOrdenDetaProduManos(sAccionBusqueda,sTipoArchivoReporte,productoordendetaprodumanosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProductoOrdenDetaProduManos(sAccionBusqueda,sTipoArchivoReporte,productoordendetaprodumanosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProductoOrdenDetaProduManos(sAccionBusqueda,sTipoArchivoReporte,productoordendetaprodumanosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProductoOrdenDetaProduManos(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoOrdenDetaProduMano> productoordendetaprodumanosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoordendetaprodumano";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoOrdenDetaProduManos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductoOrdenDetaProduMano("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProductoOrdenDetaProduMano productoordendetaprodumano : productoordendetaprodumanosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProductoOrdenDetaProduManoConstantesFunciones.generarExcelReporteDataProductoOrdenDetaProduMano("NORMAL",row,workbook,productoordendetaprodumano,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden  Mano De Obra",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProductoOrdenDetaProduMano(String sTipo,Row row,Workbook workbook) {
		
		ProductoOrdenDetaProduManoConstantesFunciones.generarExcelReporteHeaderProductoOrdenDetaProduMano(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProductoOrdenDetaProduManos(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoOrdenDetaProduMano> productoordendetaprodumanosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoordendetaprodumano_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoOrdenDetaProduManos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProductoOrdenDetaProduMano productoordendetaprodumano : productoordendetaprodumanosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProductoOrdenDetaProduManoConstantesFunciones.getProductoOrdenDetaProduManoDescripcion(productoordendetaprodumano));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDORDENDETAPRODU))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDORDENDETAPRODU);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodumano.getordendetaprodu_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDTIPOMANOPRODUEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDTIPOMANOPRODUEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodumano.gettipomanoproduempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodumano.gettipoprocesoempresaprodu_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodumano.getunidad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodumano.getcantidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_COSTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_COSTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodumano.getcosto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_COSTOTOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_COSTOTOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodumano.getcosto_total());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodumano.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden  Mano De Obra",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProductoOrdenDetaProduManos(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoOrdenDetaProduMano> productoordendetaprodumanosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProductoOrdenDetaProduMano> productoordendetaprodumanosRespaldo=null;
		
		classes=ProductoOrdenDetaProduManoConstantesFunciones.getClassesRelationshipsOfProductoOrdenDetaProduMano(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.productoordendetaprodumanoLogic.setDatosCliente(this.datosCliente);
		this.productoordendetaprodumanoLogic.setDatosDeep(this.datosDeep);
		this.productoordendetaprodumanoLogic.setIsConDeep(true);
		
		productoordendetaprodumanosRespaldo=this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos();
		
		this.productoordendetaprodumanoLogic.setProductoOrdenDetaProduManos(productoordendetaprodumanosParaReportes);	
		this.productoordendetaprodumanoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		productoordendetaprodumanosParaReportes=this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos();
		this.productoordendetaprodumanoLogic.setProductoOrdenDetaProduManos(productoordendetaprodumanosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoordendetaprodumano_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoOrdenDetaProduManos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductoOrdenDetaProduMano("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProductoOrdenDetaProduMano productoordendetaprodumano : productoordendetaprodumanosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProductoOrdenDetaProduMano("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProductoOrdenDetaProduManoConstantesFunciones.generarExcelReporteDataProductoOrdenDetaProduMano("NORMAL",row,workbook,productoordendetaprodumano,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProductoOrdenDetaProduManoConstantesFunciones.getProductoOrdenDetaProduManoDescripcion(productoordendetaprodumano));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden  Mano De Obra",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProductoOrdenDetaProduMano() throws Exception {		
		this.startProcessProductoOrdenDetaProduMano(true);
	}
	
	public void startProcessProductoOrdenDetaProduMano(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProductoOrdenDetaProduMano ,this.jPanelParametrosReportesProductoOrdenDetaProduMano, this.jScrollPanelDatosProductoOrdenDetaProduMano,this.jPanelPaginacionProductoOrdenDetaProduMano, this.jScrollPanelDatosEdicionProductoOrdenDetaProduMano, this.jPanelAccionesProductoOrdenDetaProduMano,this.jPanelAccionesFormularioProductoOrdenDetaProduMano,this.jmenuBarProductoOrdenDetaProduMano,this.jmenuBarDetalleProductoOrdenDetaProduMano,this.jTtoolBarProductoOrdenDetaProduMano,this.jTtoolBarDetalleProductoOrdenDetaProduMano);		
		
		final JTabbedPane jTabbedPaneBusquedasProductoOrdenDetaProduMano=this.jTabbedPaneBusquedasProductoOrdenDetaProduMano; 
		
		final JPanel jPanelParametrosReportesProductoOrdenDetaProduMano=this.jPanelParametrosReportesProductoOrdenDetaProduMano;
		//final JScrollPane jScrollPanelDatosProductoOrdenDetaProduMano=this.jScrollPanelDatosProductoOrdenDetaProduMano;
		final JTable jTableDatosProductoOrdenDetaProduMano=this.jTableDatosProductoOrdenDetaProduMano;		
		final JPanel jPanelPaginacionProductoOrdenDetaProduMano=this.jPanelPaginacionProductoOrdenDetaProduMano;
		//final JScrollPane jScrollPanelDatosEdicionProductoOrdenDetaProduMano=this.jScrollPanelDatosEdicionProductoOrdenDetaProduMano;
		final JPanel jPanelAccionesProductoOrdenDetaProduMano=this.jPanelAccionesProductoOrdenDetaProduMano;
		
		JPanel jPanelCamposAuxiliarProductoOrdenDetaProduMano=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProductoOrdenDetaProduMano=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {
			jPanelCamposAuxiliarProductoOrdenDetaProduMano=this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jPanelCamposProductoOrdenDetaProduMano;
			jPanelAccionesFormularioAuxiliarProductoOrdenDetaProduMano=this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jPanelAccionesFormularioProductoOrdenDetaProduMano;
		}
		
		final JPanel jPanelCamposProductoOrdenDetaProduMano=jPanelCamposAuxiliarProductoOrdenDetaProduMano;
		final JPanel jPanelAccionesFormularioProductoOrdenDetaProduMano=jPanelAccionesFormularioAuxiliarProductoOrdenDetaProduMano;
		
		
		final JMenuBar jmenuBarProductoOrdenDetaProduMano=this.jmenuBarProductoOrdenDetaProduMano;
		final JToolBar jTtoolBarProductoOrdenDetaProduMano=this.jTtoolBarProductoOrdenDetaProduMano;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProductoOrdenDetaProduMano=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductoOrdenDetaProduMano=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {
			jmenuBarDetalleAuxiliarProductoOrdenDetaProduMano=this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jmenuBarDetalleProductoOrdenDetaProduMano;
			jTtoolBarDetalleAuxiliarProductoOrdenDetaProduMano=this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTtoolBarDetalleProductoOrdenDetaProduMano;
		}
		
		final JMenuBar jmenuBarDetalleProductoOrdenDetaProduMano=jmenuBarDetalleAuxiliarProductoOrdenDetaProduMano;
		final JToolBar jTtoolBarDetalleProductoOrdenDetaProduMano=jTtoolBarDetalleAuxiliarProductoOrdenDetaProduMano;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductoOrdenDetaProduMano;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductoOrdenDetaProduMano;
			processRunnable.jTableDatos=jTableDatosProductoOrdenDetaProduMano;
			processRunnable.jPanelCampos=jPanelCamposProductoOrdenDetaProduMano;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductoOrdenDetaProduMano;
			processRunnable.jPanelAcciones=jPanelAccionesProductoOrdenDetaProduMano;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductoOrdenDetaProduMano;
			
			
			processRunnable.jmenuBar=jmenuBarProductoOrdenDetaProduMano;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductoOrdenDetaProduMano;
			processRunnable.jTtoolBar=jTtoolBarProductoOrdenDetaProduMano;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductoOrdenDetaProduMano;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductoOrdenDetaProduMano ,jPanelParametrosReportesProductoOrdenDetaProduMano,jTableDatosProductoOrdenDetaProduMano, /*jScrollPanelDatosProductoOrdenDetaProduMano,*/jPanelCamposProductoOrdenDetaProduMano,jPanelPaginacionProductoOrdenDetaProduMano, /*jScrollPanelDatosEdicionProductoOrdenDetaProduMano,*/ jPanelAccionesProductoOrdenDetaProduMano,jPanelAccionesFormularioProductoOrdenDetaProduMano,jmenuBarProductoOrdenDetaProduMano,jmenuBarDetalleProductoOrdenDetaProduMano,jTtoolBarProductoOrdenDetaProduMano,jTtoolBarDetalleProductoOrdenDetaProduMano);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductoOrdenDetaProduMano ,jPanelParametrosReportesProductoOrdenDetaProduMano, jScrollPanelDatosProductoOrdenDetaProduMano,jPanelPaginacionProductoOrdenDetaProduMano, jScrollPanelDatosEdicionProductoOrdenDetaProduMano, jPanelAccionesProductoOrdenDetaProduMano,jPanelAccionesFormularioProductoOrdenDetaProduMano,jmenuBarProductoOrdenDetaProduMano,jmenuBarDetalleProductoOrdenDetaProduMano,jTtoolBarProductoOrdenDetaProduMano,jTtoolBarDetalleProductoOrdenDetaProduMano);
						
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
	
	public void finishProcessProductoOrdenDetaProduMano() {// throws Exception 
		this.finishProcessProductoOrdenDetaProduMano(true);
	}
	
	public void finishProcessProductoOrdenDetaProduMano(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProductoOrdenDetaProduMano ,this.jPanelParametrosReportesProductoOrdenDetaProduMano, this.jScrollPanelDatosProductoOrdenDetaProduMano,this.jPanelPaginacionProductoOrdenDetaProduMano, this.jScrollPanelDatosEdicionProductoOrdenDetaProduMano, this.jPanelAccionesProductoOrdenDetaProduMano,this.jPanelAccionesFormularioProductoOrdenDetaProduMano,this.jmenuBarProductoOrdenDetaProduMano,this.jmenuBarDetalleProductoOrdenDetaProduMano,this.jTtoolBarProductoOrdenDetaProduMano,this.jTtoolBarDetalleProductoOrdenDetaProduMano);		
		
		final JTabbedPane jTabbedPaneBusquedasProductoOrdenDetaProduMano=this.jTabbedPaneBusquedasProductoOrdenDetaProduMano; 
		
		final JPanel jPanelParametrosReportesProductoOrdenDetaProduMano=this.jPanelParametrosReportesProductoOrdenDetaProduMano;
		//final JScrollPane jScrollPanelDatosProductoOrdenDetaProduMano=this.jScrollPanelDatosProductoOrdenDetaProduMano;
		final JTable jTableDatosProductoOrdenDetaProduMano=this.jTableDatosProductoOrdenDetaProduMano;		
		final JPanel jPanelPaginacionProductoOrdenDetaProduMano=this.jPanelPaginacionProductoOrdenDetaProduMano;
		//final JScrollPane jScrollPanelDatosEdicionProductoOrdenDetaProduMano=this.jScrollPanelDatosEdicionProductoOrdenDetaProduMano;
		final JPanel jPanelAccionesProductoOrdenDetaProduMano=this.jPanelAccionesProductoOrdenDetaProduMano;
		
		JPanel jPanelCamposAuxiliarProductoOrdenDetaProduMano=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProductoOrdenDetaProduMano=new JPanel();
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {
			jPanelCamposAuxiliarProductoOrdenDetaProduMano=this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jPanelCamposProductoOrdenDetaProduMano;
			jPanelAccionesFormularioAuxiliarProductoOrdenDetaProduMano=this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jPanelAccionesFormularioProductoOrdenDetaProduMano;
		}
		
		final JPanel jPanelCamposProductoOrdenDetaProduMano=jPanelCamposAuxiliarProductoOrdenDetaProduMano;
		final JPanel jPanelAccionesFormularioProductoOrdenDetaProduMano=jPanelAccionesFormularioAuxiliarProductoOrdenDetaProduMano;
		
		
		final JMenuBar jmenuBarProductoOrdenDetaProduMano=this.jmenuBarProductoOrdenDetaProduMano;		
		final JToolBar jTtoolBarProductoOrdenDetaProduMano=this.jTtoolBarProductoOrdenDetaProduMano;
				
		JMenuBar jmenuBarDetalleAuxiliarProductoOrdenDetaProduMano=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductoOrdenDetaProduMano=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {
			jmenuBarDetalleAuxiliarProductoOrdenDetaProduMano=this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jmenuBarDetalleProductoOrdenDetaProduMano;
			jTtoolBarDetalleAuxiliarProductoOrdenDetaProduMano=this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTtoolBarDetalleProductoOrdenDetaProduMano;		
		}
		
		final JMenuBar jmenuBarDetalleProductoOrdenDetaProduMano=jmenuBarDetalleAuxiliarProductoOrdenDetaProduMano;
		final JToolBar jTtoolBarDetalleProductoOrdenDetaProduMano=jTtoolBarDetalleAuxiliarProductoOrdenDetaProduMano;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductoOrdenDetaProduMano;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductoOrdenDetaProduMano;
			processRunnable.jTableDatos=jTableDatosProductoOrdenDetaProduMano;
			processRunnable.jPanelCampos=jPanelCamposProductoOrdenDetaProduMano;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductoOrdenDetaProduMano;
			processRunnable.jPanelAcciones=jPanelAccionesProductoOrdenDetaProduMano;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductoOrdenDetaProduMano;
			
			
			processRunnable.jmenuBar=jmenuBarProductoOrdenDetaProduMano;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductoOrdenDetaProduMano;
			processRunnable.jTtoolBar=jTtoolBarProductoOrdenDetaProduMano;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductoOrdenDetaProduMano;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProductoOrdenDetaProduMano ,jPanelParametrosReportesProductoOrdenDetaProduMano, jTableDatosProductoOrdenDetaProduMano,/*jScrollPanelDatosProductoOrdenDetaProduMano,*/jPanelCamposProductoOrdenDetaProduMano,jPanelPaginacionProductoOrdenDetaProduMano, /*jScrollPanelDatosEdicionProductoOrdenDetaProduMano,*/ jPanelAccionesProductoOrdenDetaProduMano,jPanelAccionesFormularioProductoOrdenDetaProduMano,jmenuBarProductoOrdenDetaProduMano,jmenuBarDetalleProductoOrdenDetaProduMano,jTtoolBarProductoOrdenDetaProduMano,jTtoolBarDetalleProductoOrdenDetaProduMano));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProductoOrdenDetaProduMano(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProductoOrdenDetaProduMano(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProductoOrdenDetaProduMano(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProductoOrdenDetaProduMano(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProductoOrdenDetaProduMano,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProductoOrdenDetaProduMano,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProductoOrdenDetaProduMano(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProductoOrdenDetaProduMano,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProductoOrdenDetaProduMano,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.productoordendetaprodumanoConstantesFunciones.getsFinalQueryProductoOrdenDetaProduMano();
		String  finalQueryPaginacionTodos=this.productoordendetaprodumanoConstantesFunciones.getsFinalQueryProductoOrdenDetaProduMano();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProductoOrdenDetaProduManoConstantesFunciones.getArrayColumnasGlobalesNoProductoOrdenDetaProduMano(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProductoOrdenDetaProduManoConstantesFunciones.getArrayColumnasGlobalesProductoOrdenDetaProduMano(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProductoOrdenDetaProduManoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.productoordendetaprodumanosEliminados= new ArrayList<ProductoOrdenDetaProduMano>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProductoOrdenDetaProduMano();
		
				///*ProductoOrdenDetaProduManoSessionBean*/this.productoordendetaprodumanoSessionBean=new ProductoOrdenDetaProduManoSessionBean();
			
			if(this.productoordendetaprodumanoSessionBean==null) {
				this.productoordendetaprodumanoSessionBean=new ProductoOrdenDetaProduManoSessionBean();
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
					this.iNumeroPaginacion=ProductoOrdenDetaProduManoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProductoOrdenDetaProduManoConstantesFunciones.getClassesForeignKeysOfProductoOrdenDetaProduMano(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/productoordendetaprodumano."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			productoordendetaprodumanosAux= new ArrayList<ProductoOrdenDetaProduMano>();
			
				
			productoordendetaprodumanoLogic.setDatosCliente(this.datosCliente);
			productoordendetaprodumanoLogic.setDatosDeep(this.datosDeep);
			productoordendetaprodumanoLogic.setIsConDeep(true);
			
			
			productoordendetaprodumanoLogic.getProductoOrdenDetaProduManoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					productoordendetaprodumanoLogic.getTodosProductoOrdenDetaProduManos(finalQueryGlobal,pagination);
					
					//productoordendetaprodumanoLogic.getTodosProductoOrdenDetaProduManosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos()==null|| productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoordendetaprodumanosAux= new ArrayList<ProductoOrdenDetaProduMano>();
							productoordendetaprodumanosAux.addAll(productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodumanosAux= new ArrayList<ProductoOrdenDetaProduMano>();
							productoordendetaprodumanosAux.addAll(productoordendetaprodumanos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoordendetaprodumanoLogic.getTodosProductoOrdenDetaProduManos(finalQueryGlobal+"",this.pagination);												
							
							//productoordendetaprodumanoLogic.getTodosProductoOrdenDetaProduManosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteProductoOrdenDetaProduManos("Todos",productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoordendetaprodumanoLogic.setProductoOrdenDetaProduManos(new ArrayList<ProductoOrdenDetaProduMano>());					
							productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().addAll(productoordendetaprodumanosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodumanos=new ArrayList<ProductoOrdenDetaProduMano>();
							productoordendetaprodumanos.addAll(productoordendetaprodumanosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idProductoOrdenDetaProduMano=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idProductoOrdenDetaProduMano=this.idActual;
				
				} else if(this.idProductoOrdenDetaProduManoActual!=null && this.idProductoOrdenDetaProduManoActual!=0L) {
					idProductoOrdenDetaProduMano=idProductoOrdenDetaProduManoActual;
				}
				
					
				this.sDetalleReporte=ProductoOrdenDetaProduManoConstantesFunciones.getDetalleIndicePorId(idProductoOrdenDetaProduMano);
				
				this.productoordendetaprodumanos=new ArrayList<ProductoOrdenDetaProduMano>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					productoordendetaprodumanoLogic.getEntity(idProductoOrdenDetaProduMano);
					
					//productoordendetaprodumanoLogic.getEntityWithConnection(idProductoOrdenDetaProduMano);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoordendetaprodumanoLogic.setProductoOrdenDetaProduManos(new ArrayList<ProductoOrdenDetaProduMano>());
					productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().add(productoordendetaprodumanoLogic.getProductoOrdenDetaProduMano());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoordendetaprodumanos=new ArrayList<ProductoOrdenDetaProduMano>();
					this.productoordendetaprodumanos.add(productoordendetaprodumano);
				}
				
				if(productoordendetaprodumanoLogic.getProductoOrdenDetaProduMano()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdOrdenDetaProdu")) {
				this.sDetalleReporte=ProductoOrdenDetaProduManoConstantesFunciones.getDetalleIndiceFK_IdOrdenDetaProdu(id_orden_deta_produFK_IdOrdenDetaProdu);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoordendetaprodumanoLogic.getProductoOrdenDetaProduManosFK_IdOrdenDetaProdu(finalQueryGlobal,pagination,id_orden_deta_produFK_IdOrdenDetaProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduManoConstantesFunciones.getDetalleIndiceFK_IdOrdenDetaProdu(id_orden_deta_produFK_IdOrdenDetaProdu);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduManoConstantesFunciones.getDetalleIndiceFK_IdOrdenDetaProdu(id_orden_deta_produFK_IdOrdenDetaProdu);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos()==null||productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoordendetaprodumanos==null|| productoordendetaprodumanos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodumanosAux=new ArrayList<ProductoOrdenDetaProduMano>();
						productoordendetaprodumanosAux.addAll(productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodumanosAux=new ArrayList<ProductoOrdenDetaProduMano>();
							productoordendetaprodumanosAux.addAll(productoordendetaprodumanos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoordendetaprodumanoLogic.getProductoOrdenDetaProduManosFK_IdOrdenDetaProdu(finalQueryGlobal,pagination,id_orden_deta_produFK_IdOrdenDetaProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduManoConstantesFunciones.getDetalleIndiceFK_IdOrdenDetaProdu(id_orden_deta_produFK_IdOrdenDetaProdu);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduManoConstantesFunciones.getDetalleIndiceFK_IdOrdenDetaProdu(id_orden_deta_produFK_IdOrdenDetaProdu);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoOrdenDetaProduManos("FK_IdOrdenDetaProdu",productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoOrdenDetaProduManos("FK_IdOrdenDetaProdu",productoordendetaprodumanos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodumanoLogic.setProductoOrdenDetaProduManos(new ArrayList<ProductoOrdenDetaProduMano>());
						productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().addAll(productoordendetaprodumanosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodumanos=new ArrayList<ProductoOrdenDetaProduMano>();
							productoordendetaprodumanos.addAll(productoordendetaprodumanosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoManoProduEmpresa")) {
				this.sDetalleReporte=ProductoOrdenDetaProduManoConstantesFunciones.getDetalleIndiceFK_IdTipoManoProduEmpresa(id_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoordendetaprodumanoLogic.getProductoOrdenDetaProduManosFK_IdTipoManoProduEmpresa(finalQueryGlobal,pagination,id_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduManoConstantesFunciones.getDetalleIndiceFK_IdTipoManoProduEmpresa(id_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduManoConstantesFunciones.getDetalleIndiceFK_IdTipoManoProduEmpresa(id_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos()==null||productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoordendetaprodumanos==null|| productoordendetaprodumanos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodumanosAux=new ArrayList<ProductoOrdenDetaProduMano>();
						productoordendetaprodumanosAux.addAll(productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodumanosAux=new ArrayList<ProductoOrdenDetaProduMano>();
							productoordendetaprodumanosAux.addAll(productoordendetaprodumanos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoordendetaprodumanoLogic.getProductoOrdenDetaProduManosFK_IdTipoManoProduEmpresa(finalQueryGlobal,pagination,id_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduManoConstantesFunciones.getDetalleIndiceFK_IdTipoManoProduEmpresa(id_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduManoConstantesFunciones.getDetalleIndiceFK_IdTipoManoProduEmpresa(id_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoOrdenDetaProduManos("FK_IdTipoManoProduEmpresa",productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoOrdenDetaProduManos("FK_IdTipoManoProduEmpresa",productoordendetaprodumanos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodumanoLogic.setProductoOrdenDetaProduManos(new ArrayList<ProductoOrdenDetaProduMano>());
						productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().addAll(productoordendetaprodumanosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodumanos=new ArrayList<ProductoOrdenDetaProduMano>();
							productoordendetaprodumanos.addAll(productoordendetaprodumanosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoProcesoEmpresaProdu")) {
				this.sDetalleReporte=ProductoOrdenDetaProduManoConstantesFunciones.getDetalleIndiceFK_IdTipoProcesoEmpresaProdu(id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoordendetaprodumanoLogic.getProductoOrdenDetaProduManosFK_IdTipoProcesoEmpresaProdu(finalQueryGlobal,pagination,id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduManoConstantesFunciones.getDetalleIndiceFK_IdTipoProcesoEmpresaProdu(id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduManoConstantesFunciones.getDetalleIndiceFK_IdTipoProcesoEmpresaProdu(id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos()==null||productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoordendetaprodumanos==null|| productoordendetaprodumanos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodumanosAux=new ArrayList<ProductoOrdenDetaProduMano>();
						productoordendetaprodumanosAux.addAll(productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodumanosAux=new ArrayList<ProductoOrdenDetaProduMano>();
							productoordendetaprodumanosAux.addAll(productoordendetaprodumanos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoordendetaprodumanoLogic.getProductoOrdenDetaProduManosFK_IdTipoProcesoEmpresaProdu(finalQueryGlobal,pagination,id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduManoConstantesFunciones.getDetalleIndiceFK_IdTipoProcesoEmpresaProdu(id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduManoConstantesFunciones.getDetalleIndiceFK_IdTipoProcesoEmpresaProdu(id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoOrdenDetaProduManos("FK_IdTipoProcesoEmpresaProdu",productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoOrdenDetaProduManos("FK_IdTipoProcesoEmpresaProdu",productoordendetaprodumanos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodumanoLogic.setProductoOrdenDetaProduManos(new ArrayList<ProductoOrdenDetaProduMano>());
						productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().addAll(productoordendetaprodumanosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodumanos=new ArrayList<ProductoOrdenDetaProduMano>();
							productoordendetaprodumanos.addAll(productoordendetaprodumanosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUnidad")) {
				this.sDetalleReporte=ProductoOrdenDetaProduManoConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoordendetaprodumanoLogic.getProductoOrdenDetaProduManosFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduManoConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduManoConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos()==null||productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoordendetaprodumanos==null|| productoordendetaprodumanos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodumanosAux=new ArrayList<ProductoOrdenDetaProduMano>();
						productoordendetaprodumanosAux.addAll(productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodumanosAux=new ArrayList<ProductoOrdenDetaProduMano>();
							productoordendetaprodumanosAux.addAll(productoordendetaprodumanos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoordendetaprodumanoLogic.getProductoOrdenDetaProduManosFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduManoConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduManoConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoOrdenDetaProduManos("FK_IdUnidad",productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoOrdenDetaProduManos("FK_IdUnidad",productoordendetaprodumanos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodumanoLogic.setProductoOrdenDetaProduManos(new ArrayList<ProductoOrdenDetaProduMano>());
						productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().addAll(productoordendetaprodumanosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodumanos=new ArrayList<ProductoOrdenDetaProduMano>();
							productoordendetaprodumanos.addAll(productoordendetaprodumanosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProductoOrdenDetaProduMano();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProductoOrdenDetaProduMano();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoordendetaprodumanos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoordendetaprodumanos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProductoOrdenDetaProduMano productoordendetaprodumano) {
		Boolean permite=true;
		
		if(this.productoordendetaprodumano.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProductoOrdenDetaProduManoConstantesFunciones.getOrderByListaProductoOrdenDetaProduMano();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProductoOrdenDetaProduManoConstantesFunciones.getOrderByListaProductoOrdenDetaProduMano();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoOrdenDetaProduMano productoordendetaprodumano:productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos()) {
				if(productoordendetaprodumano.getsType().equals(Constantes2.S_TOTALES)) {
					productoordendetaprodumanoTotales=productoordendetaprodumano;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoOrdenDetaProduMano productoordendetaprodumano:this.productoordendetaprodumanos) {
				if(productoordendetaprodumano.getsType().equals(Constantes2.S_TOTALES)) {
					productoordendetaprodumanoTotales=productoordendetaprodumano;
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
			this.productoordendetaprodumanoAux=new ProductoOrdenDetaProduMano();
			this.productoordendetaprodumanoAux.setsType(Constantes2.S_TOTALES);
			this.productoordendetaprodumanoAux.setIsNew(false);
			this.productoordendetaprodumanoAux.setIsChanged(false);
			this.productoordendetaprodumanoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ProductoOrdenDetaProduManoConstantesFunciones.TotalizarValoresFilaProductoOrdenDetaProduMano(this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos(),this.productoordendetaprodumanoAux);
				
				this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().add(this.productoordendetaprodumanoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProductoOrdenDetaProduManoConstantesFunciones.TotalizarValoresFilaProductoOrdenDetaProduMano(this.productoordendetaprodumanos,this.productoordendetaprodumanoAux);
				
				this.productoordendetaprodumanos.add(this.productoordendetaprodumanoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		productoordendetaprodumanoTotales=new ProductoOrdenDetaProduMano();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().remove(productoordendetaprodumanoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productoordendetaprodumanos.remove(productoordendetaprodumanoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		productoordendetaprodumanoTotales=new ProductoOrdenDetaProduMano();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoOrdenDetaProduMano productoordendetaprodumano:productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos()) {
				if(productoordendetaprodumano.getsType().equals(Constantes2.S_TOTALES)) {
					productoordendetaprodumanoTotales=productoordendetaprodumano;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductoOrdenDetaProduManoConstantesFunciones.TotalizarValoresFilaProductoOrdenDetaProduMano(this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos(),productoordendetaprodumanoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoOrdenDetaProduMano productoordendetaprodumano:this.productoordendetaprodumanos) {
				if(productoordendetaprodumano.getsType().equals(Constantes2.S_TOTALES)) {
					productoordendetaprodumanoTotales=productoordendetaprodumano;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductoOrdenDetaProduManoConstantesFunciones.TotalizarValoresFilaProductoOrdenDetaProduMano(this.productoordendetaprodumanos,productoordendetaprodumanoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProductoOrdenDetaProduManosFK_IdOrdenDetaProdu()throws Exception {
		try {
			sAccionBusqueda="FK_IdOrdenDetaProdu";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoOrdenDetaProduManosFK_IdTipoManoProduEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoManoProduEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoOrdenDetaProduManosFK_IdTipoProcesoEmpresaProdu()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoProcesoEmpresaProdu";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoOrdenDetaProduManosFK_IdUnidad()throws Exception {
		try {
			sAccionBusqueda="FK_IdUnidad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProductoOrdenDetaProduManosFK_IdOrdenDetaProdu(String sFinalQuery,Long id_orden_deta_produ)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoordendetaprodumanoLogic.getProductoOrdenDetaProduManosFK_IdOrdenDetaProdu(sFinalQuery,this.pagination,id_orden_deta_produ);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoOrdenDetaProduManosFK_IdTipoManoProduEmpresa(String sFinalQuery,Long id_tipo_mano_produ_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoordendetaprodumanoLogic.getProductoOrdenDetaProduManosFK_IdTipoManoProduEmpresa(sFinalQuery,this.pagination,id_tipo_mano_produ_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoOrdenDetaProduManosFK_IdTipoProcesoEmpresaProdu(String sFinalQuery,Long id_tipo_proceso_empresa_produ)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoordendetaprodumanoLogic.getProductoOrdenDetaProduManosFK_IdTipoProcesoEmpresaProdu(sFinalQuery,this.pagination,id_tipo_proceso_empresa_produ);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoOrdenDetaProduManosFK_IdUnidad(String sFinalQuery,Long id_unidad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoordendetaprodumanoLogic.getProductoOrdenDetaProduManosFK_IdUnidad(sFinalQuery,this.pagination,id_unidad);
				
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
	
	public void inicializarPermisosProductoOrdenDetaProduMano() {
		this.isPermisoTodoProductoOrdenDetaProduMano=false;
		this.isPermisoNuevoProductoOrdenDetaProduMano=false;
		this.isPermisoActualizarProductoOrdenDetaProduMano=false;
		this.isPermisoActualizarOriginalProductoOrdenDetaProduMano=false;
		this.isPermisoEliminarProductoOrdenDetaProduMano=false;
		this.isPermisoGuardarCambiosProductoOrdenDetaProduMano=false;
		this.isPermisoConsultaProductoOrdenDetaProduMano=false;
		this.isPermisoBusquedaProductoOrdenDetaProduMano=false;
		this.isPermisoReporteProductoOrdenDetaProduMano=false;		
		this.isPermisoOrdenProductoOrdenDetaProduMano=false;		
		this.isPermisoPaginacionMedioProductoOrdenDetaProduMano=false;		
		this.isPermisoPaginacionAltoProductoOrdenDetaProduMano=false;
		this.isPermisoPaginacionTodoProductoOrdenDetaProduMano=false;
		this.isPermisoCopiarProductoOrdenDetaProduMano=false;		
		this.isPermisoVerFormProductoOrdenDetaProduMano=false;		
		this.isPermisoDuplicarProductoOrdenDetaProduMano=false;		
		this.isPermisoOrdenProductoOrdenDetaProduMano=false;		
	}
	
	public void setPermisosUsuarioProductoOrdenDetaProduMano(Boolean isPermiso) {
		this.isPermisoTodoProductoOrdenDetaProduMano=isPermiso;
		this.isPermisoNuevoProductoOrdenDetaProduMano=isPermiso;
		this.isPermisoActualizarProductoOrdenDetaProduMano=isPermiso;
		this.isPermisoActualizarOriginalProductoOrdenDetaProduMano=isPermiso;
		this.isPermisoEliminarProductoOrdenDetaProduMano=isPermiso;
		this.isPermisoGuardarCambiosProductoOrdenDetaProduMano=isPermiso;
		this.isPermisoConsultaProductoOrdenDetaProduMano=isPermiso;
		this.isPermisoBusquedaProductoOrdenDetaProduMano=isPermiso;
		this.isPermisoReporteProductoOrdenDetaProduMano=isPermiso;
		this.isPermisoOrdenProductoOrdenDetaProduMano=isPermiso;		
		this.isPermisoPaginacionMedioProductoOrdenDetaProduMano=isPermiso;		
		this.isPermisoPaginacionAltoProductoOrdenDetaProduMano=isPermiso;		
		this.isPermisoPaginacionTodoProductoOrdenDetaProduMano=isPermiso;		
		this.isPermisoCopiarProductoOrdenDetaProduMano=isPermiso;		
		this.isPermisoVerFormProductoOrdenDetaProduMano=isPermiso;		
		this.isPermisoDuplicarProductoOrdenDetaProduMano=isPermiso;
		this.isPermisoOrdenProductoOrdenDetaProduMano=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProductoOrdenDetaProduMano(Boolean isPermiso) {
		//this.isPermisoTodoProductoOrdenDetaProduMano=isPermiso;
		this.isPermisoNuevoProductoOrdenDetaProduMano=isPermiso;
		this.isPermisoActualizarProductoOrdenDetaProduMano=isPermiso;
		this.isPermisoActualizarOriginalProductoOrdenDetaProduMano=isPermiso;
		this.isPermisoEliminarProductoOrdenDetaProduMano=isPermiso;
		this.isPermisoGuardarCambiosProductoOrdenDetaProduMano=isPermiso;
		//this.isPermisoConsultaProductoOrdenDetaProduMano=isPermiso;
		//this.isPermisoBusquedaProductoOrdenDetaProduMano=isPermiso;
		//this.isPermisoReporteProductoOrdenDetaProduMano=isPermiso;
		//this.isPermisoOrdenProductoOrdenDetaProduMano=isPermiso;		
		//this.isPermisoPaginacionMedioProductoOrdenDetaProduMano=isPermiso;		
		//this.isPermisoPaginacionAltoProductoOrdenDetaProduMano=isPermiso;		
		//this.isPermisoPaginacionTodoProductoOrdenDetaProduMano=isPermiso;		
		//this.isPermisoCopiarProductoOrdenDetaProduMano=isPermiso;		
		//this.isPermisoDuplicarProductoOrdenDetaProduMano=isPermiso;
		//this.isPermisoOrdenProductoOrdenDetaProduMano=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProductoOrdenDetaProduManoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProductoOrdenDetaProduManoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProductoOrdenDetaProduMano(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProductoOrdenDetaProduManoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProductoOrdenDetaProduManoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProductoOrdenDetaProduManoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProductoOrdenDetaProduManoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProductoOrdenDetaProduMano() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProductoOrdenDetaProduManoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProductoOrdenDetaProduManoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProductoOrdenDetaProduMano=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProductoOrdenDetaProduMano=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProductoOrdenDetaProduMano=this.isPermisoActualizarProductoOrdenDetaProduMano;
			this.isPermisoEliminarProductoOrdenDetaProduMano=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProductoOrdenDetaProduMano=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProductoOrdenDetaProduMano=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProductoOrdenDetaProduMano=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProductoOrdenDetaProduMano=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProductoOrdenDetaProduMano=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductoOrdenDetaProduMano=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProductoOrdenDetaProduMano=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProductoOrdenDetaProduMano=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProductoOrdenDetaProduMano=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProductoOrdenDetaProduMano=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProductoOrdenDetaProduMano=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProductoOrdenDetaProduMano=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductoOrdenDetaProduMano=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProductoOrdenDetaProduMano.setToolTipText(this.jTableDatosProductoOrdenDetaProduMano.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProductoOrdenDetaProduMano(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProductoOrdenDetaProduMano(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProductoOrdenDetaProduManoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProductoOrdenDetaProduManoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProductoOrdenDetaProduMano() throws Exception {
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
	public void inicializarCombosForeignKeyProductoOrdenDetaProduManoListas()throws Exception {
		try	{						
			
				this.ordendetaprodusForeignKey=new ArrayList();
				this.tipomanoproduempresasForeignKey=new ArrayList();
				this.tipoprocesoempresaprodusForeignKey=new ArrayList();
				this.unidadsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProductoOrdenDetaProduManoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProductoOrdenDetaProduManoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyProductoOrdenDetaProduManoListas(false);
			} else {
			
				this.cargarCombosForeignKeyOrdenDetaProduListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoManoProduEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoProcesoEmpresaProduListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyProductoOrdenDetaProduManoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ProductoOrdenDetaProduManoParameterReturnGeneral productoordendetaprodumanoReturnGeneral=new ProductoOrdenDetaProduManoParameterReturnGeneral();
						
			


				String finalQueryGlobalOrdenDetaProdu="";

				if(((this.ordendetaprodusForeignKey==null||this.ordendetaprodusForeignKey.size()<=0) && this.productoordendetaprodumanoConstantesFunciones.cargarid_orden_deta_produProductoOrdenDetaProduMano)
					 || (this.esRecargarFks && this.productoordendetaprodumanoConstantesFunciones.cargarid_orden_deta_produProductoOrdenDetaProduMano)) {

					if(!this.productoordendetaprodumanoSessionBean.getisBusquedaDesdeForeignKeySesionOrdenDetaProdu()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=OrdenDetaProduConstantesFunciones.getArrayColumnasGlobalesOrdenDetaProdu(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalOrdenDetaProdu=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,OrdenDetaProduConstantesFunciones.TABLENAME);

						finalQueryGlobalOrdenDetaProdu=Funciones.GetFinalQueryAppend(finalQueryGlobalOrdenDetaProdu, "");
						finalQueryGlobalOrdenDetaProdu+=OrdenDetaProduConstantesFunciones.SFINALQUERY;

						//this.cargarCombosOrdenDetaProdusForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalOrdenDetaProdu=" WHERE " + ConstantesSql.ID + "="+productoordendetaprodumanoSessionBean.getlidOrdenDetaProduActual();
					}
				} else {
					finalQueryGlobalOrdenDetaProdu="NONE";
				}


				String finalQueryGlobalTipoManoProduEmpresa="";

				if(((this.tipomanoproduempresasForeignKey==null||this.tipomanoproduempresasForeignKey.size()<=0) && this.productoordendetaprodumanoConstantesFunciones.cargarid_tipo_mano_produ_empresaProductoOrdenDetaProduMano)
					 || (this.esRecargarFks && this.productoordendetaprodumanoConstantesFunciones.cargarid_tipo_mano_produ_empresaProductoOrdenDetaProduMano)) {

					if(!this.productoordendetaprodumanoSessionBean.getisBusquedaDesdeForeignKeySesionTipoManoProduEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoManoProduEmpresaConstantesFunciones.getArrayColumnasGlobalesTipoManoProduEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoManoProduEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoManoProduEmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoManoProduEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoManoProduEmpresa, "");
						finalQueryGlobalTipoManoProduEmpresa+=TipoManoProduEmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoManoProduEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoManoProduEmpresa=" WHERE " + ConstantesSql.ID + "="+productoordendetaprodumanoSessionBean.getlidTipoManoProduEmpresaActual();
					}
				} else {
					finalQueryGlobalTipoManoProduEmpresa="NONE";
				}


				String finalQueryGlobalTipoProcesoEmpresaProdu="";

				if(((this.tipoprocesoempresaprodusForeignKey==null||this.tipoprocesoempresaprodusForeignKey.size()<=0) && this.productoordendetaprodumanoConstantesFunciones.cargarid_tipo_proceso_empresa_produProductoOrdenDetaProduMano)
					 || (this.esRecargarFks && this.productoordendetaprodumanoConstantesFunciones.cargarid_tipo_proceso_empresa_produProductoOrdenDetaProduMano)) {

					if(!this.productoordendetaprodumanoSessionBean.getisBusquedaDesdeForeignKeySesionTipoProcesoEmpresaProdu()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoProcesoEmpresaProduConstantesFunciones.getArrayColumnasGlobalesTipoProcesoEmpresaProdu(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoProcesoEmpresaProdu=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoProcesoEmpresaProduConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoProcesoEmpresaProdu=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoProcesoEmpresaProdu, "");
						finalQueryGlobalTipoProcesoEmpresaProdu+=TipoProcesoEmpresaProduConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoProcesoEmpresaProdusForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoProcesoEmpresaProdu=" WHERE " + ConstantesSql.ID + "="+productoordendetaprodumanoSessionBean.getlidTipoProcesoEmpresaProduActual();
					}
				} else {
					finalQueryGlobalTipoProcesoEmpresaProdu="NONE";
				}


				String finalQueryGlobalUnidad="";

				if(((this.unidadsForeignKey==null||this.unidadsForeignKey.size()<=0) && this.productoordendetaprodumanoConstantesFunciones.cargarid_unidadProductoOrdenDetaProduMano)
					 || (this.esRecargarFks && this.productoordendetaprodumanoConstantesFunciones.cargarid_unidadProductoOrdenDetaProduMano)) {

					if(!this.productoordendetaprodumanoSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UnidadConstantesFunciones.getArrayColumnasGlobalesUnidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUnidad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UnidadConstantesFunciones.TABLENAME);

						finalQueryGlobalUnidad=Funciones.GetFinalQueryAppend(finalQueryGlobalUnidad, "");
						finalQueryGlobalUnidad+=UnidadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUnidadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUnidad=" WHERE " + ConstantesSql.ID + "="+productoordendetaprodumanoSessionBean.getlidUnidadActual();
					}
				} else {
					finalQueryGlobalUnidad="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				productoordendetaprodumanoReturnGeneral=productoordendetaprodumanoLogic.cargarCombosLoteForeignKeyProductoOrdenDetaProduMano(finalQueryGlobalOrdenDetaProdu,finalQueryGlobalTipoManoProduEmpresa,finalQueryGlobalTipoProcesoEmpresaProdu,finalQueryGlobalUnidad);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalOrdenDetaProdu.equals("NONE")) {
				this.ordendetaprodusForeignKey=productoordendetaprodumanoReturnGeneral.getordendetaprodusForeignKey();
			}

			if(!finalQueryGlobalTipoManoProduEmpresa.equals("NONE")) {
				this.tipomanoproduempresasForeignKey=productoordendetaprodumanoReturnGeneral.gettipomanoproduempresasForeignKey();
			}

			if(!finalQueryGlobalTipoProcesoEmpresaProdu.equals("NONE")) {
				this.tipoprocesoempresaprodusForeignKey=productoordendetaprodumanoReturnGeneral.gettipoprocesoempresaprodusForeignKey();
			}

			if(!finalQueryGlobalUnidad.equals("NONE")) {
				this.unidadsForeignKey=productoordendetaprodumanoReturnGeneral.getunidadsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyProductoOrdenDetaProduMano()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyOrdenDetaProdu();
			this.addItemDefectoCombosForeignKeyTipoManoProduEmpresa();
			this.addItemDefectoCombosForeignKeyTipoProcesoEmpresaProdu();
			this.addItemDefectoCombosForeignKeyUnidad();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyOrdenDetaProdu()throws Exception {
		try {
			if(this.productoordendetaprodumanoSessionBean==null) {
				this.productoordendetaprodumanoSessionBean=new ProductoOrdenDetaProduManoSessionBean();
			}

			if(!this.productoordendetaprodumanoSessionBean.getisBusquedaDesdeForeignKeySesionOrdenDetaProdu()) {
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

	public void addItemDefectoCombosForeignKeyTipoManoProduEmpresa()throws Exception {
		try {

			if(!this.productoordendetaprodumanoSessionBean.getisBusquedaDesdeForeignKeySesionTipoManoProduEmpresa()) {
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

			if(!this.productoordendetaprodumanoSessionBean.getisBusquedaDesdeForeignKeySesionTipoProcesoEmpresaProdu()) {
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

			if(!this.productoordendetaprodumanoSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
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
	
	public void initActionsCombosTodosForeignKeyProductoOrdenDetaProduMano()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProductoOrdenDetaProduMano(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProductoOrdenDetaProduMano()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductoOrdenDetaProduMano();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProductoOrdenDetaProduMano(ProductoOrdenDetaProduMano productoordendetaprodumano)throws Exception {	
		try {
			
			this.setActualOrdenDetaProduForeignKey(productoordendetaprodumano.getid_orden_deta_produ(),false,"Formulario");
			this.setActualTipoManoProduEmpresaForeignKey(productoordendetaprodumano.getid_tipo_mano_produ_empresa(),false,"Formulario");
			this.setActualTipoProcesoEmpresaProduForeignKey(productoordendetaprodumano.getid_tipo_proceso_empresa_produ(),false,"Formulario");
			this.setActualUnidadForeignKey(productoordendetaprodumano.getid_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProductoOrdenDetaProduMano(ProductoOrdenDetaProduMano productoordendetaprodumano,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProductoOrdenDetaProduMano()throws Exception {	
		try {
			
			this.setActualOrdenDetaProduForeignKey(this.productoordendetaprodumanoConstantesFunciones.getid_orden_deta_produ(),false,"Formulario");
			this.setActualTipoManoProduEmpresaForeignKey(this.productoordendetaprodumanoConstantesFunciones.getid_tipo_mano_produ_empresa(),false,"Formulario");
			this.setActualTipoProcesoEmpresaProduForeignKey(this.productoordendetaprodumanoConstantesFunciones.getid_tipo_proceso_empresa_produ(),false,"Formulario");
			this.setActualUnidadForeignKey(this.productoordendetaprodumanoConstantesFunciones.getid_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProductoOrdenDetaProduMano()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProductoOrdenDetaProduMano()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProductoOrdenDetaProduMano()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProductoOrdenDetaProduMano()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProductoOrdenDetaProduMano()throws Exception {
		try {
			

			this.cargarCombosFrameOrdenDetaProdusForeignKey("Todos");
			this.cargarCombosFrameTipoManoProduEmpresasForeignKey("Todos");
			this.cargarCombosFrameTipoProcesoEmpresaProdusForeignKey("Todos");
			this.cargarCombosFrameUnidadsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProductoOrdenDetaProduMano(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameOrdenDetaProdusForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoManoProduEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoProcesoEmpresaProdusForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUnidadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProductoOrdenDetaProduMano()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_orden_deta_produProductoOrdenDetaProduMano!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_orden_deta_produProductoOrdenDetaProduMano.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_orden_deta_produProductoOrdenDetaProduMano.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_tipo_mano_produ_empresaProductoOrdenDetaProduMano!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMano!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_unidadProductoOrdenDetaProduMano!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_unidadProductoOrdenDetaProduMano.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_unidadProductoOrdenDetaProduMano.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public ProductoOrdenDetaProduManoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProductoOrdenDetaProduManoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProductoOrdenDetaProduManoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.productoordendetaprodumanoSessionBean=new ProductoOrdenDetaProduManoSessionBean(); 
		this.productoordendetaprodumanoConstantesFunciones=new ProductoOrdenDetaProduManoConstantesFunciones(); 
		this.productoordendetaprodumanoBean=new ProductoOrdenDetaProduMano();//(this.productoordendetaprodumanoConstantesFunciones); 		
		this.productoordendetaprodumanoReturnGeneral=new ProductoOrdenDetaProduManoParameterReturnGeneral(); 
		
		this.productoordendetaprodumanoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoordendetaprodumanoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProductoOrdenDetaProduManoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProductoOrdenDetaProduManoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProductoOrdenDetaProduManoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProductoOrdenDetaProduMano(true);
			
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
			
			this.productoordendetaprodumanoConstantesFunciones=new ProductoOrdenDetaProduManoConstantesFunciones(); 
			this.productoordendetaprodumanoBean=new ProductoOrdenDetaProduMano();//this.productoordendetaprodumanoConstantesFunciones); 			
			this.productoordendetaprodumanoReturnGeneral=new ProductoOrdenDetaProduManoParameterReturnGeneral(); 
		
			ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Orden  Mano De Obra Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.productoordendetaprodumano=new ProductoOrdenDetaProduMano();
			this.productoordendetaprodumanos = new ArrayList<ProductoOrdenDetaProduMano>();
			this.productoordendetaprodumanosAux = new ArrayList<ProductoOrdenDetaProduMano>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic=new ProductoOrdenDetaProduManoLogic();
				this.productoordendetaprodumanoLogic.getNewConnexionToDeep("");
			}
			
			//this.productoordendetaprodumanoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.productoordendetaprodumanoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProductoOrdenDetaProduMano);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano);	
					}
					
					if(this.jInternalFrameImportacionProductoOrdenDetaProduMano!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductoOrdenDetaProduMano);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProductoOrdenDetaProduMano!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProductoOrdenDetaProduMano);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano);
				this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.setVisible(false);
				this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano);
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.setVisible(false);
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProductoOrdenDetaProduMano!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProductoOrdenDetaProduMano);
					this.jInternalFrameImportacionProductoOrdenDetaProduMano.setVisible(false);
					this.jInternalFrameImportacionProductoOrdenDetaProduMano.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProductoOrdenDetaProduMano!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProductoOrdenDetaProduMano);
					this.jInternalFrameOrderByProductoOrdenDetaProduMano.setVisible(false);
					this.jInternalFrameOrderByProductoOrdenDetaProduMano.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProductoOrdenDetaProduManoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProductoOrdenDetaProduManoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.productoordendetaprodumanoReturnGeneral=new ProductoOrdenDetaProduManoParameterReturnGeneral();
			
			this.productoordendetaprodumanoParameterGeneral=new ProductoOrdenDetaProduManoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.productoordendetaprodumanoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProductoOrdenDetaProduManoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductoOrdenDetaProduManoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado(),this.productoordendetaprodumanoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductoOrdenDetaProduManoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado(),this.productoordendetaprodumanoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMano=false;
			this.isVisibilidadCeldaDuplicarProductoOrdenDetaProduMano=true;
			this.isVisibilidadCeldaCopiarProductoOrdenDetaProduMano=true;
			this.isVisibilidadCeldaVerFormProductoOrdenDetaProduMano=true;
			this.isVisibilidadCeldaOrdenProductoOrdenDetaProduMano=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMano=false;
			this.isVisibilidadCeldaModificarProductoOrdenDetaProduMano=false;
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMano=false;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMano=false;
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMano=false;
			this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMano=false;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMano=false;
			
			
			this.isVisibilidadFK_IdOrdenDetaProdu=true;
			this.isVisibilidadFK_IdTipoManoProduEmpresa=true;
			this.isVisibilidadFK_IdTipoProcesoEmpresaProdu=true;
			this.isVisibilidadFK_IdUnidad=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduMano("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProductoOrdenDetaProduMano();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProductoOrdenDetaProduMano(false);
			
			this.setPermisosUsuarioProductoOrdenDetaProduMano();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado() 
				|| (this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado() && this.productoordendetaprodumanoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProductoOrdenDetaProduManoClasesRelacionadas();
			}
			
			if(this.productoordendetaprodumanoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProductoOrdenDetaProduManoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProductoOrdenDetaProduManoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProductoOrdenDetaProduMano();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProductoOrdenDetaProduMano();
			}
			
			if(!this.isPermisoBusquedaProductoOrdenDetaProduMano) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioProductoOrdenDetaProduMano,this.isPermisoPaginacionMedioProductoOrdenDetaProduMano,this.isPermisoPaginacionTodoProductoOrdenDetaProduMano);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProductoOrdenDetaProduManoConstantesFunciones.getTiposSeleccionarProductoOrdenDetaProduMano());
				
				this.tiposColumnasSelect=ProductoOrdenDetaProduManoConstantesFunciones.getTiposSeleccionarProductoOrdenDetaProduMano(true);
				
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
			//if(!this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProductoOrdenDetaProduMano();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioProductoOrdenDetaProduMano(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioProductoOrdenDetaProduMano(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoOrdenDetaProduMano() ;
			
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
				productoordendetaprodumanoImplementable= (ProductoOrdenDetaProduManoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductoOrdenDetaProduManoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				productoordendetaprodumanoImplementableHome= (ProductoOrdenDetaProduManoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductoOrdenDetaProduManoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.productoordendetaprodumanos= new ArrayList<ProductoOrdenDetaProduMano>();
			this.productoordendetaprodumanosEliminados= new ArrayList<ProductoOrdenDetaProduMano>();
						
			this.isEsNuevoProductoOrdenDetaProduMano=false;
			this.esParaAccionDesdeFormularioProductoOrdenDetaProduMano=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.ordendetaprodusForeignKey=new ArrayList<OrdenDetaProdu>() ;
			this.tipomanoproduempresasForeignKey=new ArrayList<TipoManoProduEmpresa>() ;
			this.tipoprocesoempresaprodusForeignKey=new ArrayList<TipoProcesoEmpresaProdu>() ;
			this.unidadsForeignKey=new ArrayList<Unidad>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProductoOrdenDetaProduMano(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProductoOrdenDetaProduMano();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProductoOrdenDetaProduManoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduMano("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProductoOrdenDetaProduMano(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProductoOrdenDetaProduMano();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProductoOrdenDetaProduMano();
			}
			
			ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProductoOrdenDetaProduMano(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProductoOrdenDetaProduMano: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProductoOrdenDetaProduMano() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProductoOrdenDetaProduMano")) {
				iIndex=this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTabbedPaneRelacionesProductoOrdenDetaProduMano.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTabbedPaneRelacionesProductoOrdenDetaProduMano.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProductoOrdenDetaProduMano.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProductoOrdenDetaProduMano();	
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
	
	public void cargarCombosForeignKeyProductoOrdenDetaProduMano(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProductoOrdenDetaProduMano(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProductoOrdenDetaProduMano(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProductoOrdenDetaProduManoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProductoOrdenDetaProduMano();
		
		this.cargarCombosFrameForeignKeyProductoOrdenDetaProduMano();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProductoOrdenDetaProduMano();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProductoOrdenDetaProduMano();
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
	
	public void jButtonNuevoProductoOrdenDetaProduManoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.productoordendetaprodumanoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
			
			
			if(jTableDatosProductoOrdenDetaProduMano.getRowCount()>=1) {
				jTableDatosProductoOrdenDetaProduMano.removeRowSelectionInterval(0, jTableDatosProductoOrdenDetaProduMano.getRowCount()-1);						
			}
			
			this.isEsNuevoProductoOrdenDetaProduMano=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProductoOrdenDetaProduMano(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProductoOrdenDetaProduMano(true);			
			//this.productoordendetaprodumano=new ProductoOrdenDetaProduMano();
			//this.productoordendetaprodumano.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoOrdenDetaProduMano(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProduMano() ;
			
			if(ProductoOrdenDetaProduManoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoOrdenDetaProduMano(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.productoordendetaprodumano);	
			this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumano);				
			
			ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
			
			if(this.productoordendetaprodumanoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProductoOrdenDetaProduMano: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProductoOrdenDetaProduManoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProductoOrdenDetaProduMano> productoordendetaprodumanosSeleccionados=new ArrayList<ProductoOrdenDetaProduMano>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProductoOrdenDetaProduMano.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProductoOrdenDetaProduMano.getSelectedRows().length;			
			}
			
			productoordendetaprodumanosSeleccionados=this.getProductoOrdenDetaProduManosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProductoOrdenDetaProduMano--;			
				//ProductoOrdenDetaProduMano productoordendetaprodumanoAux= new ProductoOrdenDetaProduMano();			
				//productoordendetaprodumanoAux.setId(this.iIdNuevoProductoOrdenDetaProduMano);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProductoOrdenDetaProduMano productoordendetaprodumanoOrigen=new ProductoOrdenDetaProduMano();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProductoOrdenDetaProduMano productoordendetaprodumanoOrigen : productoordendetaprodumanosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProductoOrdenDetaProduMano.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							productoordendetaprodumanoOrigen =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodumanoOrigen =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanos.toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProductoOrdenDetaProduMano();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.productoordendetaprodumano.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProductoOrdenDetaProduMano(productoordendetaprodumanoOrigen,this.productoordendetaprodumano,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMano(this.productoordendetaprodumano);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().add(this.productoordendetaprodumanoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodumanos.add(this.productoordendetaprodumanoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProductoOrdenDetaProduMano(false);
				
				this.jTableDatosProductoOrdenDetaProduMano.setRowSelectionInterval(this.getIndiceNuevoProductoOrdenDetaProduMano(), this.getIndiceNuevoProductoOrdenDetaProduMano());
				
				int iLastRow =  this.jTableDatosProductoOrdenDetaProduMano.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductoOrdenDetaProduMano.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductoOrdenDetaProduMano.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoOrdenDetaProduMano(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProductoOrdenDetaProduManoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProductoOrdenDetaProduMano> productoordendetaprodumanosSeleccionados=new ArrayList<ProductoOrdenDetaProduMano>();									
		
			ProductoOrdenDetaProduMano productoordendetaprodumanoOrigen=new ProductoOrdenDetaProduMano();
			ProductoOrdenDetaProduMano productoordendetaprodumanoDestino=new ProductoOrdenDetaProduMano();
				
			productoordendetaprodumanosSeleccionados=this.getProductoOrdenDetaProduManosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProductoOrdenDetaProduMano.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || productoordendetaprodumanosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProductoOrdenDetaProduMano.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodumanoOrigen =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productoordendetaprodumanoOrigen =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanos.toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodumanoDestino =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productoordendetaprodumanoDestino =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanos.toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				productoordendetaprodumanoOrigen =productoordendetaprodumanosSeleccionados.get(0);
				productoordendetaprodumanoDestino =productoordendetaprodumanosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProductoOrdenDetaProduMano(productoordendetaprodumanoOrigen,productoordendetaprodumanoDestino,true,false);
				
				productoordendetaprodumanoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productoordendetaprodumanoDestino,productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoordendetaprodumanoDestino,productoordendetaprodumanos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProductoOrdenDetaProduMano(false);
				
				//this.jTableDatosProductoOrdenDetaProduMano.setRowSelectionInterval(this.getIndiceNuevoProductoOrdenDetaProduMano(), this.getIndiceNuevoProductoOrdenDetaProduMano());
				
				int iLastRow =  this.jTableDatosProductoOrdenDetaProduMano.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductoOrdenDetaProduMano.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductoOrdenDetaProduMano.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoOrdenDetaProduMano(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProductoOrdenDetaProduManoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProductoOrdenDetaProduManoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProductoOrdenDetaProduMano.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProductoOrdenDetaProduMano.setVisible(!isVisible);
			this.jPanelPaginacionProductoOrdenDetaProduMano.setVisible(!isVisible);
			this.jPanelAccionesProductoOrdenDetaProduMano.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProductoOrdenDetaProduManoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProductoOrdenDetaProduMano();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProductoOrdenDetaProduManoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProductoOrdenDetaProduMano();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProductoOrdenDetaProduManoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProductoOrdenDetaProduMano();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProductoOrdenDetaProduManoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProductoOrdenDetaProduMano();
			
			this.abrirFrameOrderByProductoOrdenDetaProduMano();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProductoOrdenDetaProduManoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProductoOrdenDetaProduMano();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProductoOrdenDetaProduMano(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductoOrdenDetaProduMano);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.isMaximum()) {
					this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.setSize(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.iWidthFormulario,this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.isMaximum()) {
						this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jContentPaneDetalleProductoOrdenDetaProduMano.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTabbedPaneRelacionesProductoOrdenDetaProduMano.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jContentPaneDetalleProductoOrdenDetaProduMano.getWidth(),ProductoOrdenDetaProduManoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTabbedPaneRelacionesProductoOrdenDetaProduMano.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jContentPaneDetalleProductoOrdenDetaProduMano.getWidth(),ProductoOrdenDetaProduManoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTabbedPaneRelacionesProductoOrdenDetaProduMano.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jContentPaneDetalleProductoOrdenDetaProduMano.getWidth(),ProductoOrdenDetaProduManoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.setVisible(true);
	        this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProductoOrdenDetaProduMano() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProductoOrdenDetaProduMano==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProductoOrdenDetaProduMano=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoOrdenDetaProduMano,false,this);
				} else {
					this.jInternalFrameOrderByProductoOrdenDetaProduMano=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoOrdenDetaProduMano,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProductoOrdenDetaProduMano);
				this.jInternalFrameOrderByProductoOrdenDetaProduMano.setVisible(false);
				this.jInternalFrameOrderByProductoOrdenDetaProduMano.setSelected(false);
				
				this.jInternalFrameOrderByProductoOrdenDetaProduMano.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductoOrdenDetaProduMano"));
				
				this.inicializarActualizarBindingTablaOrderByProductoOrdenDetaProduMano();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProductoOrdenDetaProduMano() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProductoOrdenDetaProduMano==null) {
				
				this.jInternalFrameImportacionProductoOrdenDetaProduMano=new ImportacionJInternalFrame(ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductoOrdenDetaProduMano);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProductoOrdenDetaProduMano);
				this.jInternalFrameImportacionProductoOrdenDetaProduMano.setVisible(false);
				this.jInternalFrameImportacionProductoOrdenDetaProduMano.setSelected(false);


				this.jInternalFrameImportacionProductoOrdenDetaProduMano.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductoOrdenDetaProduMano"));
				this.jInternalFrameImportacionProductoOrdenDetaProduMano.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductoOrdenDetaProduMano"));
				this.jInternalFrameImportacionProductoOrdenDetaProduMano.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductoOrdenDetaProduMano"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProductoOrdenDetaProduMano() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano==null) {
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano=new ReporteDinamicoJInternalFrame(ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano);
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.setVisible(false);
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoOrdenDetaProduMano"));
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoOrdenDetaProduMano"));
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoOrdenDetaProduMano"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoOrdenDetaProduMano();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProductoOrdenDetaProduMano() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductoOrdenDetaProduMano);
			
	       	this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.setVisible(false);
	        this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.setSelected(false);
			
			//this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.dispose();
			//this.jInternalFrameDetalleFormProductoOrdenDetaProduMano=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProductoOrdenDetaProduMano() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.setVisible(true);
	        this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProductoOrdenDetaProduMano() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProductoOrdenDetaProduMano.setVisible(true);
	        this.jInternalFrameImportacionProductoOrdenDetaProduMano.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProductoOrdenDetaProduMano() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProductoOrdenDetaProduMano.setVisible(true);
	        this.jInternalFrameOrderByProductoOrdenDetaProduMano.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProductoOrdenDetaProduMano() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProductoOrdenDetaProduMano.setVisible(false);
	        this.jInternalFrameOrderByProductoOrdenDetaProduMano.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProductoOrdenDetaProduMano() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.setVisible(false);
	        this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProductoOrdenDetaProduMano() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProductoOrdenDetaProduMano.setVisible(false);
	        this.jInternalFrameImportacionProductoOrdenDetaProduMano.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProductoOrdenDetaProduManoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProductoOrdenDetaProduMano(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProductoOrdenDetaProduMano(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductoOrdenDetaProduMano.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProductoOrdenDetaProduMano(true);
			//this.isEsNuevoProductoOrdenDetaProduMano=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanos.toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduMano("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoOrdenDetaProduMano(false) ;
			
			if(productoordendetaprodumanoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProductoOrdenDetaProduManoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoOrdenDetaProduMano(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProduMano(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProductoOrdenDetaProduManoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProduMano.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanos.toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProductoOrdenDetaProduMano(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductoOrdenDetaProduMano.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProductoOrdenDetaProduMano(true);
			//this.isEsNuevoProductoOrdenDetaProduMano=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanos.toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.productoordendetaprodumano.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduMano("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProductoOrdenDetaProduMano(false) ;
			
			if(ProductoOrdenDetaProduManoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoOrdenDetaProduMano(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProduMano(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaOrdenDetaProdu(List<OrdenDetaProdu> ordendetaprodusForeignKey)throws Exception{
		TableColumn tableColumnOrdenDetaProdu=this.jTableDatosProductoOrdenDetaProduMano.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMano,ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDORDENDETAPRODU));
		TableCellEditor tableCellEditorOrdenDetaProdu =tableColumnOrdenDetaProdu.getCellEditor();

		OrdenDetaProduTableCell ordendetaproduTableCellFk=(OrdenDetaProduTableCell)tableCellEditorOrdenDetaProdu;

		if(ordendetaproduTableCellFk!=null) {
			ordendetaproduTableCellFk.setordendetaprodusForeignKey(ordendetaprodusForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoOrdenDetaProduMano.getSelectedRow();

		//if(intSelectedRow<=0) {
			//ordendetaproduTableCellFk.setRowActual(intSelectedRow);
			//ordendetaproduTableCellFk.setordendetaprodusForeignKeyActual(ordendetaprodusForeignKey);
		//}


		if(ordendetaproduTableCellFk!=null) {
			ordendetaproduTableCellFk.RecargarOrdenDetaProdusForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoManoProduEmpresa(List<TipoManoProduEmpresa> tipomanoproduempresasForeignKey)throws Exception{
		TableColumn tableColumnTipoManoProduEmpresa=this.jTableDatosProductoOrdenDetaProduMano.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMano,ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDTIPOMANOPRODUEMPRESA));
		TableCellEditor tableCellEditorTipoManoProduEmpresa =tableColumnTipoManoProduEmpresa.getCellEditor();

		TipoManoProduEmpresaTableCell tipomanoproduempresaTableCellFk=(TipoManoProduEmpresaTableCell)tableCellEditorTipoManoProduEmpresa;

		if(tipomanoproduempresaTableCellFk!=null) {
			tipomanoproduempresaTableCellFk.settipomanoproduempresasForeignKey(tipomanoproduempresasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoOrdenDetaProduMano.getSelectedRow();

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
		TableColumn tableColumnTipoProcesoEmpresaProdu=this.jTableDatosProductoOrdenDetaProduMano.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMano,ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU));
		TableCellEditor tableCellEditorTipoProcesoEmpresaProdu =tableColumnTipoProcesoEmpresaProdu.getCellEditor();

		TipoProcesoEmpresaProduTableCell tipoprocesoempresaproduTableCellFk=(TipoProcesoEmpresaProduTableCell)tableCellEditorTipoProcesoEmpresaProdu;

		if(tipoprocesoempresaproduTableCellFk!=null) {
			tipoprocesoempresaproduTableCellFk.settipoprocesoempresaprodusForeignKey(tipoprocesoempresaprodusForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoOrdenDetaProduMano.getSelectedRow();

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
		TableColumn tableColumnUnidad=this.jTableDatosProductoOrdenDetaProduMano.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMano,ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDUNIDAD));
		TableCellEditor tableCellEditorUnidad =tableColumnUnidad.getCellEditor();

		UnidadTableCell unidadTableCellFk=(UnidadTableCell)tableCellEditorUnidad;

		if(unidadTableCellFk!=null) {
			unidadTableCellFk.setunidadsForeignKey(unidadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoOrdenDetaProduMano.getSelectedRow();

		//if(intSelectedRow<=0) {
			//unidadTableCellFk.setRowActual(intSelectedRow);
			//unidadTableCellFk.setunidadsForeignKeyActual(unidadsForeignKey);
		//}


		if(unidadTableCellFk!=null) {
			unidadTableCellFk.RecargarUnidadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProductoOrdenDetaProduManoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProductoOrdenDetaProduMano(false);
			
			//if(!this.isEsNuevoProductoOrdenDetaProduMano) {								
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMano.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanos.toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProductoOrdenDetaProduManoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMano(this.productoordendetaprodumano,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMano(this.productoordendetaprodumano);
				
			}
			
			if(this.permiteMantenimiento(this.productoordendetaprodumano)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProductoOrdenDetaProduMano=true;
					this.inicializarActualizarBindingTablaProductoOrdenDetaProduMano(false);
					this.isEsNuevoProductoOrdenDetaProduMano=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProductoOrdenDetaProduMano=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProductoOrdenDetaProduMano=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductoOrdenDetaProduMano(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProduMano(false);
				
				this.habilitarDeshabilitarControlesProductoOrdenDetaProduMano(false);
			
												
				
				if(ProductoOrdenDetaProduManoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProductoOrdenDetaProduMano();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProductoOrdenDetaProduManoActionPerformed(evt,productoordendetaprodumanoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProductoOrdenDetaProduMano(this.productoordendetaprodumano,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProductoOrdenDetaProduMano.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,productoordendetaprodumanoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.productoordendetaprodumano.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduMano.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduMano.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProductoOrdenDetaProduManoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMano.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
				this.productoordendetaprodumano.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanos.toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
				this.productoordendetaprodumano.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.productoordendetaprodumano)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProductoOrdenDetaProduManoModel) this.jTableDatosProductoOrdenDetaProduMano.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProductoOrdenDetaProduMano=true;
				this.inicializarActualizarBindingTablaProductoOrdenDetaProduMano(false);
				this.isEsNuevoProductoOrdenDetaProduMano=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductoOrdenDetaProduMano(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProduMano(false);
				
				this.habilitarDeshabilitarControlesProductoOrdenDetaProduMano(false);
				
				
				
				if(ProductoOrdenDetaProduManoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProductoOrdenDetaProduMano();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProductoOrdenDetaProduManoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProductoOrdenDetaProduMano.getRowCount()>=1) {
				jTableDatosProductoOrdenDetaProduMano.removeRowSelectionInterval(0, jTableDatosProductoOrdenDetaProduMano.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProductoOrdenDetaProduMano(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProductoOrdenDetaProduMano(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoOrdenDetaProduMano(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProduMano(false) ;
			
			this.isEsNuevoProductoOrdenDetaProduMano=false;
			
			if(ProductoOrdenDetaProduManoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProductoOrdenDetaProduMano();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProductoOrdenDetaProduManoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProductoOrdenDetaProduMano(false);
				
				//SI ES MANUAL
				if(ProductoOrdenDetaProduManoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProductoOrdenDetaProduMano();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProductoOrdenDetaProduManoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProductoOrdenDetaProduMano--;			
			//ProductoOrdenDetaProduMano productoordendetaprodumanoAux= new ProductoOrdenDetaProduMano();			
			//productoordendetaprodumanoAux.setId(this.iIdNuevoProductoOrdenDetaProduMano);
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProductoOrdenDetaProduMano();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMano(this.productoordendetaprodumano);
			
			this.productoordendetaprodumano.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().add(this.productoordendetaprodumanoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.productoordendetaprodumanos.add(this.productoordendetaprodumanoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProductoOrdenDetaProduMano(false);
			
			this.jTableDatosProductoOrdenDetaProduMano.setRowSelectionInterval(this.getIndiceNuevoProductoOrdenDetaProduMano(), this.getIndiceNuevoProductoOrdenDetaProduMano());
			
			int iLastRow =  this.jTableDatosProductoOrdenDetaProduMano.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProductoOrdenDetaProduMano.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProductoOrdenDetaProduMano.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProductoOrdenDetaProduMano(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProductoOrdenDetaProduManoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProductoOrdenDetaProduMano(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoOrdenDetaProduMano(false);
			
			//SI ES MANUAL
			if(ProductoOrdenDetaProduManoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoOrdenDetaProduMano();
			}
			
			//this.abrirFrameTreeProductoOrdenDetaProduMano();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProductoOrdenDetaProduManoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Orden  Mano De ObraES ?", "MANTENIMIENTO DE Orden  Mano De Obra", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionProductoOrdenDetaProduMano.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralProductoOrdenDetaProduMano();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.productoordendetaprodumanoReturnGeneral=productoordendetaprodumanoLogic.procesarImportacionProductoOrdenDetaProduManosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.productoordendetaprodumanoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarProductoOrdenDetaProduManoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProductoOrdenDetaProduManoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProductoOrdenDetaProduMano.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProductoOrdenDetaProduMano.setFileImportacion(this.jInternalFrameImportacionProductoOrdenDetaProduMano.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProductoOrdenDetaProduMano.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProductoOrdenDetaProduMano.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProductoOrdenDetaProduMano.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProductoOrdenDetaProduMano.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProductoOrdenDetaProduManoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProductoOrdenDetaProduMano> productoordendetaprodumanosSeleccionados=new ArrayList<ProductoOrdenDetaProduMano>();		

		productoordendetaprodumanosSeleccionados=this.getProductoOrdenDetaProduManosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProductoOrdenDetaProduManoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProductoOrdenDetaProduManoBaseDesign.jrxml";
			
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
			
			this.generarReporteProductoOrdenDetaProduManos("Todos",productoordendetaprodumanosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden  Mano De Obra",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDORDENDETAPRODU:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_OrdenDetaProdu_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_OrdenDetaProdu_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_OrdenDetaProdu_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_OrdenDetaProdu_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDTIPOMANOPRODUEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoManoProduEmpresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoManoProduEmpresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoManoProduEmpresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoManoProduEmpresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoProcesoEmpresaProdu_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoProcesoEmpresaProdu_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoProcesoEmpresaProdu_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoProcesoEmpresaProdu_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Unidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Unidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Unidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Unidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoOrdenDetaProduManoConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoOrdenDetaProduManoConstantesFunciones.LABEL_COSTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_sto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_sto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_sto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_sto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoOrdenDetaProduManoConstantesFunciones.LABEL_COSTOTOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_stoTotal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_stoTotal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_stoTotal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_stoTotal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoOrdenDetaProduManoConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDORDENDETAPRODU:
					sNombreCampoCategoria="id_orden_deta_produ";
					break;

				case ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDTIPOMANOPRODUEMPRESA:
					sNombreCampoCategoria="id_tipo_mano_produ_empresa";
					break;

				case ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU:
					sNombreCampoCategoria="id_tipo_proceso_empresa_produ";
					break;

				case ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoria="id_unidad";
					break;

				case ProductoOrdenDetaProduManoConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;

				case ProductoOrdenDetaProduManoConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoria="costo";
					break;

				case ProductoOrdenDetaProduManoConstantesFunciones.LABEL_COSTOTOTAL:
					sNombreCampoCategoria="costo_total";
					break;

				case ProductoOrdenDetaProduManoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDORDENDETAPRODU:
					sNombreCampoCategoriaValor="id_orden_deta_produ";
					break;

				case ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDTIPOMANOPRODUEMPRESA:
					sNombreCampoCategoriaValor="id_tipo_mano_produ_empresa";
					break;

				case ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU:
					sNombreCampoCategoriaValor="id_tipo_proceso_empresa_produ";
					break;

				case ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoriaValor="id_unidad";
					break;

				case ProductoOrdenDetaProduManoConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;

				case ProductoOrdenDetaProduManoConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoriaValor="costo";
					break;

				case ProductoOrdenDetaProduManoConstantesFunciones.LABEL_COSTOTOTAL:
					sNombreCampoCategoriaValor="costo_total";
					break;

				case ProductoOrdenDetaProduManoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDORDENDETAPRODU:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Orden Deta Produ",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_orden_deta_produ");
					break;

				case ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDTIPOMANOPRODUEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Mano Obra Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_mano_produ_empresa");
					break;

				case ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Proceso Empresa Produ",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_proceso_empresa_produ");
					break;

				case ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Unad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_unidad");
					break;

				case ProductoOrdenDetaProduManoConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantidad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad");
					break;

				case ProductoOrdenDetaProduManoConstantesFunciones.LABEL_COSTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo");
					break;

				case ProductoOrdenDetaProduManoConstantesFunciones.LABEL_COSTOTOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo_total");
					break;

				case ProductoOrdenDetaProduManoConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduManoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProductoOrdenDetaProduMano> productoordendetaprodumanosSeleccionados=new ArrayList<ProductoOrdenDetaProduMano>();		
		
		productoordendetaprodumanosSeleccionados=this.getProductoOrdenDetaProduManosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoordendetaprodumano";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProductoOrdenDetaProduManos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDORDENDETAPRODU:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDORDENDETAPRODU);
					iRow++;

					for(ProductoOrdenDetaProduMano productoordendetaprodumano:productoordendetaprodumanosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodumano.getordendetaprodu_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDTIPOMANOPRODUEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDTIPOMANOPRODUEMPRESA);
					iRow++;

					for(ProductoOrdenDetaProduMano productoordendetaprodumano:productoordendetaprodumanosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodumano.gettipomanoproduempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU);
					iRow++;

					for(ProductoOrdenDetaProduMano productoordendetaprodumano:productoordendetaprodumanosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodumano.gettipoprocesoempresaprodu_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDUNIDAD);
					iRow++;

					for(ProductoOrdenDetaProduMano productoordendetaprodumano:productoordendetaprodumanosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodumano.getunidad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoOrdenDetaProduManoConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(ProductoOrdenDetaProduMano productoordendetaprodumano:productoordendetaprodumanosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodumano.getcantidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoOrdenDetaProduManoConstantesFunciones.LABEL_COSTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_COSTO);
					iRow++;

					for(ProductoOrdenDetaProduMano productoordendetaprodumano:productoordendetaprodumanosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodumano.getcosto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoOrdenDetaProduManoConstantesFunciones.LABEL_COSTOTOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_COSTOTOTAL);
					iRow++;

					for(ProductoOrdenDetaProduMano productoordendetaprodumano:productoordendetaprodumanosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodumano.getcosto_total());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoOrdenDetaProduManoConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(ProductoOrdenDetaProduMano productoordendetaprodumano:productoordendetaprodumanosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodumano.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelProductoOrdenDetaProduMano(row);				
			//	iRow++;
			//}				
			
			//for(ProductoOrdenDetaProduMano productoordendetaprodumanoAux:productoordendetaprodumanosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProductoOrdenDetaProduMano(productoordendetaprodumanoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden  Mano De Obra",JOptionPane.INFORMATION_MESSAGE);
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
				this.productoordendetaprodumanoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoOrdenDetaProduMano(false);
			
			//SI ES MANUAL
			if(ProductoOrdenDetaProduManoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoOrdenDetaProduMano();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProductoOrdenDetaProduManoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoOrdenDetaProduMano(false);
			
			//SI ES MANUAL
			if(ProductoOrdenDetaProduManoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductoOrdenDetaProduMano();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProductoOrdenDetaProduManoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoOrdenDetaProduMano(false);
			
			//SI ES MANUAL
			if(ProductoOrdenDetaProduManoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductoOrdenDetaProduMano();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProductoOrdenDetaProduMano() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProductoOrdenDetaProduMano.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProductoOrdenDetaProduMano.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProductoOrdenDetaProduMano.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProductoOrdenDetaProduMano.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProductoOrdenDetaProduMano.setMinimumSize(dimensionMinimum);
		this.jTableDatosProductoOrdenDetaProduMano.setMaximumSize(dimensionMaximum);
		this.jTableDatosProductoOrdenDetaProduMano.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProductoOrdenDetaProduMano(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProductoOrdenDetaProduMano(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProductoOrdenDetaProduMano(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProductoOrdenDetaProduMano(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProductoOrdenDetaProduMano(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProductoOrdenDetaProduMano(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoOrdenDetaProduMano(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProductoOrdenDetaProduMano(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProductoOrdenDetaProduManoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProductoOrdenDetaProduManoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProductoOrdenDetaProduMano() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProductoOrdenDetaProduMano();
		
		this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProduMano(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProductoOrdenDetaProduMano();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoOrdenDetaProduMano() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProductoOrdenDetaProduMano(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProductoOrdenDetaProduMano(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMano.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProductoOrdenDetaProduMano.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProductoOrdenDetaProduMano.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jCheckBoxPostAccionNuevoProductoOrdenDetaProduMano.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jCheckBoxPostAccionSinCerrarProductoOrdenDetaProduMano.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jCheckBoxPostAccionSinMensajeProductoOrdenDetaProduMano.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMano.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProductoOrdenDetaProduMano.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProductoOrdenDetaProduMano.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {
				this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jCheckBoxPostAccionNuevoProductoOrdenDetaProduMano.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jCheckBoxPostAccionSinCerrarProductoOrdenDetaProduMano.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jCheckBoxPostAccionSinMensajeProductoOrdenDetaProduMano.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProductoOrdenDetaProduMano.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProductoOrdenDetaProduMano.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMano.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMano.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProductoOrdenDetaProduMano.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProductoOrdenDetaProduMano.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMano.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProductoOrdenDetaProduMano.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduMano.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProductoOrdenDetaProduMano.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProductoOrdenDetaProduMano(Boolean esInicializar) throws Exception {
		try	{	
			if(ProductoOrdenDetaProduManoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProductoOrdenDetaProduMano(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProductoOrdenDetaProduMano() throws Exception {
		try	{
			if(ProductoOrdenDetaProduManoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProductoOrdenDetaProduMano();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductoOrdenDetaProduMano() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMano.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMano.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProductoOrdenDetaProduMano() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMano.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMano.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProductoOrdenDetaProduMano.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProductoOrdenDetaProduMano.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduMano.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduMano.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProductoOrdenDetaProduMano.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProductoOrdenDetaProduMano.addItem(reporte);
			}
			
			
			if(!this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProductoOrdenDetaProduMano.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProductoOrdenDetaProduMano.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProductoOrdenDetaProduMano.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProductoOrdenDetaProduMano.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProductoOrdenDetaProduMano.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProductoOrdenDetaProduMano.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMano.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMano.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMano.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMano.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMano.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoOrdenDetaProduMano();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoOrdenDetaProduMano() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano!=null) {
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano!=null) {
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano!=null) {
				
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ProductoOrdenDetaProduManoConstantesFunciones.getTiposSeleccionarProductoOrdenDetaProduMano(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ProductoOrdenDetaProduManoConstantesFunciones.getTiposSeleccionarProductoOrdenDetaProduMano(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ProductoOrdenDetaProduManoConstantesFunciones.getTiposSeleccionarProductoOrdenDetaProduMano(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProductoOrdenDetaProduMano()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMano.getSelectedItem()!=null){this.id_orden_deta_produFK_IdOrdenDetaProdu=((OrdenDetaProdu)this.jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMano.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano.getSelectedItem()!=null){this.id_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresa=((TipoManoProduEmpresa)this.jComboBoxid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano.getSelectedItem()!=null){this.id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu=((TipoProcesoEmpresaProdu)this.jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano.getSelectedItem()).getId();}
		if(this.jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMano.getSelectedItem()!=null){this.id_unidadFK_IdUnidad=((Unidad)this.jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMano.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProductoOrdenDetaProduMano(Boolean esInicializar) throws Exception {				
		if(ProductoOrdenDetaProduManoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProductoOrdenDetaProduMano();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProductoOrdenDetaProduMano() throws Exception {
		this.inicializarActualizarBindingTablaProductoOrdenDetaProduMano(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProductoOrdenDetaProduMano() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProductoOrdenDetaProduMano.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProductoOrdenDetaProduMano.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoOrdenDetaProduMano.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduManoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProductoOrdenDetaProduMano.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoOrdenDetaProduMano.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduManoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProductoOrdenDetaProduManoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduManoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduManoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProductoOrdenDetaProduMano.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoOrdenDetaProduMano.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduManoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProductoOrdenDetaProduMano.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProductoOrdenDetaProduMano(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=productoordendetaprodumanos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProductoOrdenDetaProduManoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProductoOrdenDetaProduMano.setModel(new ProductoOrdenDetaProduManoModel(this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProductoOrdenDetaProduMano.setModel(new ProductoOrdenDetaProduManoModel(this.productoordendetaprodumanos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProductoOrdenDetaProduMano!=null && this.jInternalFrameOrderByProductoOrdenDetaProduMano.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProductoOrdenDetaProduMano();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProductoOrdenDetaProduMano.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMano,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduManoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO,productoordendetaprodumanoConstantesFunciones.resaltarSeleccionarProductoOrdenDetaProduMano,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProductoOrdenDetaProduManoConstantesFunciones.SCLASSWEBTITULO,productoordendetaprodumanoConstantesFunciones.resaltarSeleccionarProductoOrdenDetaProduMano,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProductoOrdenDetaProduMano.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMano,ProductoOrdenDetaProduManoConstantesFunciones.LABEL_ID));

		if(this.productoordendetaprodumanoConstantesFunciones.mostraridProductoOrdenDetaProduMano && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduManoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoordendetaprodumanoConstantesFunciones.resaltaridProductoOrdenDetaProduMano,this.productoordendetaprodumanoConstantesFunciones.activaridProductoOrdenDetaProduMano,iSizeTabla,this,true,"idProductoOrdenDetaProduMano","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoordendetaprodumanoConstantesFunciones.resaltaridProductoOrdenDetaProduMano,this.productoordendetaprodumanoConstantesFunciones.activaridProductoOrdenDetaProduMano,this,true,"idProductoOrdenDetaProduMano","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProduMano.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMano,ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDORDENDETAPRODU));

		if(this.productoordendetaprodumanoConstantesFunciones.mostrarid_orden_deta_produProductoOrdenDetaProduMano && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDORDENDETAPRODU,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new OrdenDetaProduTableCell(this.ordendetaprodusForeignKey,this.productoordendetaprodumanoConstantesFunciones.resaltarid_orden_deta_produProductoOrdenDetaProduMano,this,this.productoordendetaprodumanoConstantesFunciones.activarid_orden_deta_produProductoOrdenDetaProduMano,iSizeTabla));
			tableColumn.setCellEditor(new OrdenDetaProduTableCell(this.ordendetaprodusForeignKey,this.productoordendetaprodumanoConstantesFunciones.resaltarid_orden_deta_produProductoOrdenDetaProduMano,this,this.productoordendetaprodumanoConstantesFunciones.activarid_orden_deta_produProductoOrdenDetaProduMano,true,"id_orden_deta_produProductoOrdenDetaProduMano","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduManoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProduMano.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMano,ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDTIPOMANOPRODUEMPRESA));

		if(this.productoordendetaprodumanoConstantesFunciones.mostrarid_tipo_mano_produ_empresaProductoOrdenDetaProduMano && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDTIPOMANOPRODUEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoManoProduEmpresaTableCell(this.tipomanoproduempresasForeignKey,this.productoordendetaprodumanoConstantesFunciones.resaltarid_tipo_mano_produ_empresaProductoOrdenDetaProduMano,this,this.productoordendetaprodumanoConstantesFunciones.activarid_tipo_mano_produ_empresaProductoOrdenDetaProduMano,iSizeTabla));
			tableColumn.setCellEditor(new TipoManoProduEmpresaTableCell(this.tipomanoproduempresasForeignKey,this.productoordendetaprodumanoConstantesFunciones.resaltarid_tipo_mano_produ_empresaProductoOrdenDetaProduMano,this,this.productoordendetaprodumanoConstantesFunciones.activarid_tipo_mano_produ_empresaProductoOrdenDetaProduMano,true,"id_tipo_mano_produ_empresaProductoOrdenDetaProduMano","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduManoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProduMano.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMano,ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU));

		if(this.productoordendetaprodumanoConstantesFunciones.mostrarid_tipo_proceso_empresa_produProductoOrdenDetaProduMano && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoProcesoEmpresaProduTableCell(this.tipoprocesoempresaprodusForeignKey,this.productoordendetaprodumanoConstantesFunciones.resaltarid_tipo_proceso_empresa_produProductoOrdenDetaProduMano,this,this.productoordendetaprodumanoConstantesFunciones.activarid_tipo_proceso_empresa_produProductoOrdenDetaProduMano,iSizeTabla));
			tableColumn.setCellEditor(new TipoProcesoEmpresaProduTableCell(this.tipoprocesoempresaprodusForeignKey,this.productoordendetaprodumanoConstantesFunciones.resaltarid_tipo_proceso_empresa_produProductoOrdenDetaProduMano,this,this.productoordendetaprodumanoConstantesFunciones.activarid_tipo_proceso_empresa_produProductoOrdenDetaProduMano,true,"id_tipo_proceso_empresa_produProductoOrdenDetaProduMano","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduManoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProduMano.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMano,ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDUNIDAD));

		if(this.productoordendetaprodumanoConstantesFunciones.mostrarid_unidadProductoOrdenDetaProduMano && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDUNIDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new UnidadTableCell(this.unidadsForeignKey,this.productoordendetaprodumanoConstantesFunciones.resaltarid_unidadProductoOrdenDetaProduMano,this,this.productoordendetaprodumanoConstantesFunciones.activarid_unidadProductoOrdenDetaProduMano,iSizeTabla));
			tableColumn.setCellEditor(new UnidadTableCell(this.unidadsForeignKey,this.productoordendetaprodumanoConstantesFunciones.resaltarid_unidadProductoOrdenDetaProduMano,this,this.productoordendetaprodumanoConstantesFunciones.activarid_unidadProductoOrdenDetaProduMano,true,"id_unidadProductoOrdenDetaProduMano","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduManoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProduMano.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMano,ProductoOrdenDetaProduManoConstantesFunciones.LABEL_CANTIDAD));

		if(this.productoordendetaprodumanoConstantesFunciones.mostrarcantidadProductoOrdenDetaProduMano && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduManoConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoordendetaprodumanoConstantesFunciones.resaltarcantidadProductoOrdenDetaProduMano,this.productoordendetaprodumanoConstantesFunciones.activarcantidadProductoOrdenDetaProduMano,iSizeTabla,this,true,"cantidadProductoOrdenDetaProduMano","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoordendetaprodumanoConstantesFunciones.resaltarcantidadProductoOrdenDetaProduMano,this.productoordendetaprodumanoConstantesFunciones.activarcantidadProductoOrdenDetaProduMano,this,true,"cantidadProductoOrdenDetaProduMano","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduManoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProduMano.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMano,ProductoOrdenDetaProduManoConstantesFunciones.LABEL_COSTO));

		if(this.productoordendetaprodumanoConstantesFunciones.mostrarcostoProductoOrdenDetaProduMano && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduManoConstantesFunciones.LABEL_COSTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoordendetaprodumanoConstantesFunciones.resaltarcostoProductoOrdenDetaProduMano,this.productoordendetaprodumanoConstantesFunciones.activarcostoProductoOrdenDetaProduMano,iSizeTabla,this,true,"costoProductoOrdenDetaProduMano","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoordendetaprodumanoConstantesFunciones.resaltarcostoProductoOrdenDetaProduMano,this.productoordendetaprodumanoConstantesFunciones.activarcostoProductoOrdenDetaProduMano,this,true,"costoProductoOrdenDetaProduMano","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduManoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProduMano.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMano,ProductoOrdenDetaProduManoConstantesFunciones.LABEL_COSTOTOTAL));

		if(this.productoordendetaprodumanoConstantesFunciones.mostrarcosto_totalProductoOrdenDetaProduMano && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduManoConstantesFunciones.LABEL_COSTOTOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoordendetaprodumanoConstantesFunciones.resaltarcosto_totalProductoOrdenDetaProduMano,this.productoordendetaprodumanoConstantesFunciones.activarcosto_totalProductoOrdenDetaProduMano,iSizeTabla,this,true,"costo_totalProductoOrdenDetaProduMano","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoordendetaprodumanoConstantesFunciones.resaltarcosto_totalProductoOrdenDetaProduMano,this.productoordendetaprodumanoConstantesFunciones.activarcosto_totalProductoOrdenDetaProduMano,this,true,"costo_totalProductoOrdenDetaProduMano","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduManoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProduMano.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMano,ProductoOrdenDetaProduManoConstantesFunciones.LABEL_DESCRIPCION));

		if(this.productoordendetaprodumanoConstantesFunciones.mostrardescripcionProductoOrdenDetaProduMano && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduManoConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productoordendetaprodumanoConstantesFunciones.resaltardescripcionProductoOrdenDetaProduMano,this.productoordendetaprodumanoConstantesFunciones.activardescripcionProductoOrdenDetaProduMano,iSizeTabla,this,true,"descripcionProductoOrdenDetaProduMano","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoordendetaprodumanoConstantesFunciones.resaltardescripcionProductoOrdenDetaProduMano,this.productoordendetaprodumanoConstantesFunciones.activardescripcionProductoOrdenDetaProduMano,this,true,"descripcionProductoOrdenDetaProduMano","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduManoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductoOrdenDetaProduMano.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductoOrdenDetaProduMano.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProductoOrdenDetaProduMano && this.isPermisoGuardarCambiosProductoOrdenDetaProduMano) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProductoOrdenDetaProduMano.addColumn(tableColumn);
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
			
			this.jTableDatosProductoOrdenDetaProduMano.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductoOrdenDetaProduMano && this.isPermisoGuardarCambiosProductoOrdenDetaProduMano) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductoOrdenDetaProduMano && this.isPermisoGuardarCambiosProductoOrdenDetaProduMano) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProductoOrdenDetaProduMano.moveColumn(this.jTableDatosProductoOrdenDetaProduMano.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProductoOrdenDetaProduMano.moveColumn(this.jTableDatosProductoOrdenDetaProduMano.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProductoOrdenDetaProduMano.moveColumn(this.jTableDatosProductoOrdenDetaProduMano.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProductoOrdenDetaProduMano.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProductoOrdenDetaProduMano.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProductoOrdenDetaProduMano,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProductoOrdenDetaProduManoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProductoOrdenDetaProduMano.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProductoOrdenDetaProduMano.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProductoOrdenDetaProduManoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProductoOrdenDetaProduManoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProductoOrdenDetaProduMano.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProductoOrdenDetaProduMano.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProductoOrdenDetaProduMano.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=productoordendetaprodumanos.size()-1;
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
		//this.jTableDatosProductoOrdenDetaProduMano.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProductoOrdenDetaProduMano.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProductoOrdenDetaProduMano();
			
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
				
				//this.isEsNuevoProductoOrdenDetaProduMano=false;
					
				ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
			
				if(this.productoordendetaprodumanoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductoOrdenDetaProduMano.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductoOrdenDetaProduMano.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanos.toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.productoordendetaprodumano.getsType().equals("DUPLICADO")
				   || this.productoordendetaprodumano.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProductoOrdenDetaProduMano=true;
				
				} else {
					this.isEsNuevoProductoOrdenDetaProduMano=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {
					if(this.productoordendetaprodumano.getId()>=0 && !this.productoordendetaprodumano.getIsNew()) {						
						this.isEsNuevoProductoOrdenDetaProduMano=false;
						
					} else {
						this.isEsNuevoProductoOrdenDetaProduMano=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProductoOrdenDetaProduMano(esRelaciones);						
				
				this.seleccionarProductoOrdenDetaProduMano(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.productoordendetaprodumano.getId()<0) {
					this.isEsNuevoProductoOrdenDetaProduMano=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProductoOrdenDetaProduMano(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProductoOrdenDetaProduMano(evt,rowIndex);
				}	
				
				if(this.productoordendetaprodumanoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProductoOrdenDetaProduMano: " + this.dDif); 
					}
				}								
				
				ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProductoOrdenDetaProduMano(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.productoordendetaprodumano)) {
					if(this.productoordendetaprodumano.getId()>0) {
						this.productoordendetaprodumano.setIsDeleted(true);
						
						this.productoordendetaprodumanosEliminados.add(this.productoordendetaprodumano);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().remove(this.productoordendetaprodumano);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodumanos.remove(this.productoordendetaprodumano);				
					}
					
					
					((ProductoOrdenDetaProduManoModel) this.jTableDatosProductoOrdenDetaProduMano.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoOrdenDetaProduMano(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProductoOrdenDetaProduMano(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProductoOrdenDetaProduMano) {
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductoOrdenDetaProduMano.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductoOrdenDetaProduMano.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanos.toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProductoOrdenDetaProduManoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProductoOrdenDetaProduMano(this.productoordendetaprodumano);
				}
				
				//ARCHITECTURE
				try {
					

					//OrdenDetaProdu
					if(!this.productoordendetaprodumanoConstantesFunciones.cargarid_orden_deta_produProductoOrdenDetaProduMano || this.productoordendetaprodumanoConstantesFunciones.event_dependid_orden_deta_produProductoOrdenDetaProduMano) {
						//this.cargarCombosOrdenDetaProdusForeignKeyLista(" where id="+this.productoordendetaprodumano.getid_orden_deta_produ());
									//this.inicializarActualizarBindingProductoOrdenDetaProduMano(false,false);
						this.ordendetaprodusForeignKey=new ArrayList<OrdenDetaProdu>();

						if(productoordendetaprodumano.getOrdenDetaProdu()!=null) {
							this.ordendetaprodusForeignKey.add(productoordendetaprodumano.getOrdenDetaProdu());
						}

						this.addItemDefectoCombosForeignKeyOrdenDetaProdu();
						this.cargarCombosFrameOrdenDetaProdusForeignKey("Todos");
					}
					this.setActualOrdenDetaProduForeignKey(this.productoordendetaprodumano.getid_orden_deta_produ(),false,"Formulario");

					//TipoManoProduEmpresa
					if(!this.productoordendetaprodumanoConstantesFunciones.cargarid_tipo_mano_produ_empresaProductoOrdenDetaProduMano || this.productoordendetaprodumanoConstantesFunciones.event_dependid_tipo_mano_produ_empresaProductoOrdenDetaProduMano) {
						//this.cargarCombosTipoManoProduEmpresasForeignKeyLista(" where id="+this.productoordendetaprodumano.getid_tipo_mano_produ_empresa());
									//this.inicializarActualizarBindingProductoOrdenDetaProduMano(false,false);
						this.tipomanoproduempresasForeignKey=new ArrayList<TipoManoProduEmpresa>();

						if(productoordendetaprodumano.getTipoManoProduEmpresa()!=null) {
							this.tipomanoproduempresasForeignKey.add(productoordendetaprodumano.getTipoManoProduEmpresa());
						}

						this.addItemDefectoCombosForeignKeyTipoManoProduEmpresa();
						this.cargarCombosFrameTipoManoProduEmpresasForeignKey("Todos");
					}
					this.setActualTipoManoProduEmpresaForeignKey(this.productoordendetaprodumano.getid_tipo_mano_produ_empresa(),false,"Formulario");

					//TipoProcesoEmpresaProdu
					if(!this.productoordendetaprodumanoConstantesFunciones.cargarid_tipo_proceso_empresa_produProductoOrdenDetaProduMano || this.productoordendetaprodumanoConstantesFunciones.event_dependid_tipo_proceso_empresa_produProductoOrdenDetaProduMano) {
						//this.cargarCombosTipoProcesoEmpresaProdusForeignKeyLista(" where id="+this.productoordendetaprodumano.getid_tipo_proceso_empresa_produ());
									//this.inicializarActualizarBindingProductoOrdenDetaProduMano(false,false);
						this.tipoprocesoempresaprodusForeignKey=new ArrayList<TipoProcesoEmpresaProdu>();

						if(productoordendetaprodumano.getTipoProcesoEmpresaProdu()!=null) {
							this.tipoprocesoempresaprodusForeignKey.add(productoordendetaprodumano.getTipoProcesoEmpresaProdu());
						}

						this.addItemDefectoCombosForeignKeyTipoProcesoEmpresaProdu();
						this.cargarCombosFrameTipoProcesoEmpresaProdusForeignKey("Todos");
					}
					this.setActualTipoProcesoEmpresaProduForeignKey(this.productoordendetaprodumano.getid_tipo_proceso_empresa_produ(),false,"Formulario");

					//Unidad
					if(!this.productoordendetaprodumanoConstantesFunciones.cargarid_unidadProductoOrdenDetaProduMano || this.productoordendetaprodumanoConstantesFunciones.event_dependid_unidadProductoOrdenDetaProduMano) {
						//this.cargarCombosUnidadsForeignKeyLista(" where id="+this.productoordendetaprodumano.getid_unidad());
									//this.inicializarActualizarBindingProductoOrdenDetaProduMano(false,false);
						this.unidadsForeignKey=new ArrayList<Unidad>();

						if(productoordendetaprodumano.getUnidad()!=null) {
							this.unidadsForeignKey.add(productoordendetaprodumano.getUnidad());
						}

						this.addItemDefectoCombosForeignKeyUnidad();
						this.cargarCombosFrameUnidadsForeignKey("Todos");
					}
					this.setActualUnidadForeignKey(this.productoordendetaprodumano.getid_unidad(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduMano("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProductoOrdenDetaProduMano(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProduMano() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductoOrdenDetaProduMano(ProductoOrdenDetaProduMano productoordendetaprodumano) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProductoOrdenDetaProduMano(productoordendetaprodumano,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductoOrdenDetaProduMano(ProductoOrdenDetaProduMano productoordendetaprodumano,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProductoOrdenDetaProduMano(productoordendetaprodumano);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProductoOrdenDetaProduMano(productoordendetaprodumano,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProductoOrdenDetaProduMano(productoordendetaprodumano);
	}
	
	public void setVariablesObjetoActualToFormularioProductoOrdenDetaProduMano(ProductoOrdenDetaProduMano productoordendetaprodumano) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jLabelidProductoOrdenDetaProduMano.setText(productoordendetaprodumano.getId().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTextFieldcantidadProductoOrdenDetaProduMano.setText(productoordendetaprodumano.getcantidad().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTextFieldcostoProductoOrdenDetaProduMano.setText(productoordendetaprodumano.getcosto().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTextFieldcosto_totalProductoOrdenDetaProduMano.setText(productoordendetaprodumano.getcosto_total().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTextAreadescripcionProductoOrdenDetaProduMano.setText(productoordendetaprodumano.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProductoOrdenDetaProduMano productoordendetaprodumanoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,productoordendetaprodumanoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProductoOrdenDetaProduMano productoordendetaprodumanoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				productoordendetaprodumanoLocal=this.productoordendetaprodumano;
			} else {
				productoordendetaprodumanoLocal=this.productoordendetaprodumanoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(productoordendetaprodumanoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProductoOrdenDetaProduMano(productoordendetaprodumanoLocal,true);
					
					if(productoordendetaprodumanoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(productoordendetaprodumanoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(productoordendetaprodumanoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProductoOrdenDetaProduMano(ProductoOrdenDetaProduMano productoordendetaprodumano,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMano(productoordendetaprodumano,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMano(productoordendetaprodumano);
	}
	
	public void setVariablesFormularioToObjetoActualProductoOrdenDetaProduMano(ProductoOrdenDetaProduMano productoordendetaprodumano,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMano(productoordendetaprodumano,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProductoOrdenDetaProduMano(ProductoOrdenDetaProduMano productoordendetaprodumano,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jLabelidProductoOrdenDetaProduMano.getText()==null || this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jLabelidProductoOrdenDetaProduMano.getText()=="" || this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jLabelidProductoOrdenDetaProduMano.getText()=="Id") {
				this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jLabelidProductoOrdenDetaProduMano.setText("0");
			}

			if(conColumnasBase) {productoordendetaprodumano.setId(Long.parseLong(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jLabelidProductoOrdenDetaProduMano.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoOrdenDetaProduManoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jLabelIdProductoOrdenDetaProduMano,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoordendetaprodumano.setcantidad(Long.parseLong(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTextFieldcantidadProductoOrdenDetaProduMano.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoOrdenDetaProduManoConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jLabelcantidadProductoOrdenDetaProduMano,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoordendetaprodumano.setcosto(Double.parseDouble(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTextFieldcostoProductoOrdenDetaProduMano.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoOrdenDetaProduManoConstantesFunciones.LABEL_COSTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jLabelcostoProductoOrdenDetaProduMano,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoordendetaprodumano.setcosto_total(Double.parseDouble(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTextFieldcosto_totalProductoOrdenDetaProduMano.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoOrdenDetaProduManoConstantesFunciones.LABEL_COSTOTOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jLabelcosto_totalProductoOrdenDetaProduMano,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoordendetaprodumano.setdescripcion(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTextAreadescripcionProductoOrdenDetaProduMano.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoOrdenDetaProduManoConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jLabeldescripcionProductoOrdenDetaProduMano,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductoOrdenDetaProduMano(ProductoOrdenDetaProduMano productoordendetaprodumanoBean,ProductoOrdenDetaProduMano productoordendetaprodumano,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && productoordendetaprodumanoBean.getid_orden_deta_produ()!=null && !productoordendetaprodumanoBean.getid_orden_deta_produ().equals(-1L))) {productoordendetaprodumano.setid_orden_deta_produ(productoordendetaprodumanoBean.getid_orden_deta_produ());}
			if(conDefault || (!conDefault && productoordendetaprodumanoBean.getid_tipo_mano_produ_empresa()!=null && !productoordendetaprodumanoBean.getid_tipo_mano_produ_empresa().equals(-1L))) {productoordendetaprodumano.setid_tipo_mano_produ_empresa(productoordendetaprodumanoBean.getid_tipo_mano_produ_empresa());}
			if(conDefault || (!conDefault && productoordendetaprodumanoBean.getid_tipo_proceso_empresa_produ()!=null && !productoordendetaprodumanoBean.getid_tipo_proceso_empresa_produ().equals(-1L))) {productoordendetaprodumano.setid_tipo_proceso_empresa_produ(productoordendetaprodumanoBean.getid_tipo_proceso_empresa_produ());}
			if(conDefault || (!conDefault && productoordendetaprodumanoBean.getid_unidad()!=null && !productoordendetaprodumanoBean.getid_unidad().equals(-1L))) {productoordendetaprodumano.setid_unidad(productoordendetaprodumanoBean.getid_unidad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProductoOrdenDetaProduMano(ProductoOrdenDetaProduMano productoordendetaprodumanoOrigen,ProductoOrdenDetaProduMano productoordendetaprodumano,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productoordendetaprodumanoOrigen.getId()!=null && !productoordendetaprodumanoOrigen.getId().equals(0L))) {productoordendetaprodumano.setId(productoordendetaprodumanoOrigen.getId());}}
			if(conDefault || (!conDefault && productoordendetaprodumanoOrigen.getid_orden_deta_produ()!=null && !productoordendetaprodumanoOrigen.getid_orden_deta_produ().equals(-1L))) {productoordendetaprodumano.setid_orden_deta_produ(productoordendetaprodumanoOrigen.getid_orden_deta_produ());}
			if(conDefault || (!conDefault && productoordendetaprodumanoOrigen.getid_tipo_mano_produ_empresa()!=null && !productoordendetaprodumanoOrigen.getid_tipo_mano_produ_empresa().equals(-1L))) {productoordendetaprodumano.setid_tipo_mano_produ_empresa(productoordendetaprodumanoOrigen.getid_tipo_mano_produ_empresa());}
			if(conDefault || (!conDefault && productoordendetaprodumanoOrigen.getid_tipo_proceso_empresa_produ()!=null && !productoordendetaprodumanoOrigen.getid_tipo_proceso_empresa_produ().equals(-1L))) {productoordendetaprodumano.setid_tipo_proceso_empresa_produ(productoordendetaprodumanoOrigen.getid_tipo_proceso_empresa_produ());}
			if(conDefault || (!conDefault && productoordendetaprodumanoOrigen.getid_unidad()!=null && !productoordendetaprodumanoOrigen.getid_unidad().equals(-1L))) {productoordendetaprodumano.setid_unidad(productoordendetaprodumanoOrigen.getid_unidad());}
			if(conDefault || (!conDefault && productoordendetaprodumanoOrigen.getcantidad()!=null && !productoordendetaprodumanoOrigen.getcantidad().equals(0L))) {productoordendetaprodumano.setcantidad(productoordendetaprodumanoOrigen.getcantidad());}
			if(conDefault || (!conDefault && productoordendetaprodumanoOrigen.getcosto()!=null && !productoordendetaprodumanoOrigen.getcosto().equals(0.0))) {productoordendetaprodumano.setcosto(productoordendetaprodumanoOrigen.getcosto());}
			if(conDefault || (!conDefault && productoordendetaprodumanoOrigen.getcosto_total()!=null && !productoordendetaprodumanoOrigen.getcosto_total().equals(0.0))) {productoordendetaprodumano.setcosto_total(productoordendetaprodumanoOrigen.getcosto_total());}
			if(conDefault || (!conDefault && productoordendetaprodumanoOrigen.getdescripcion()!=null && !productoordendetaprodumanoOrigen.getdescripcion().equals(""))) {productoordendetaprodumano.setdescripcion(productoordendetaprodumanoOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductoOrdenDetaProduMano(ProductoOrdenDetaProduMano productoordendetaprodumano) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jLabelidProductoOrdenDetaProduMano.setText(productoordendetaprodumano.getId().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTextFieldcantidadProductoOrdenDetaProduMano.setText(productoordendetaprodumano.getcantidad().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTextFieldcostoProductoOrdenDetaProduMano.setText(productoordendetaprodumano.getcosto().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTextFieldcosto_totalProductoOrdenDetaProduMano.setText(productoordendetaprodumano.getcosto_total().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTextAreadescripcionProductoOrdenDetaProduMano.setText(productoordendetaprodumano.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductoOrdenDetaProduMano(ProductoOrdenDetaProduManoBean productoordendetaprodumanoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jLabelidProductoOrdenDetaProduMano.setText(productoordendetaprodumanoBean.getId().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTextFieldcantidadProductoOrdenDetaProduMano.setText(productoordendetaprodumanoBean.getcantidad().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTextFieldcostoProductoOrdenDetaProduMano.setText(productoordendetaprodumanoBean.getcosto().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTextFieldcosto_totalProductoOrdenDetaProduMano.setText(productoordendetaprodumanoBean.getcosto_total().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTextAreadescripcionProductoOrdenDetaProduMano.setText(productoordendetaprodumanoBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProductoOrdenDetaProduMano(ProductoOrdenDetaProduManoParameterReturnGeneral productoordendetaprodumanoReturnGeneral,ProductoOrdenDetaProduManoBean productoordendetaprodumanoBean,Boolean conDefault) throws Exception { 
		try {
			ProductoOrdenDetaProduMano productoordendetaprodumanoLocal=new ProductoOrdenDetaProduMano();
			
			productoordendetaprodumanoLocal=productoordendetaprodumanoReturnGeneral.getProductoOrdenDetaProduMano();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productoordendetaprodumanoLocal.getId()!=null && !productoordendetaprodumanoLocal.getId().equals(0L))) {productoordendetaprodumanoBean.setId(productoordendetaprodumanoLocal.getId());}}
			if(conDefault || (!conDefault && productoordendetaprodumanoLocal.getid_orden_deta_produ()!=null && !productoordendetaprodumanoLocal.getid_orden_deta_produ().equals(-1L))) {productoordendetaprodumanoBean.setid_orden_deta_produ(productoordendetaprodumanoLocal.getid_orden_deta_produ());}
			if(conDefault || (!conDefault && productoordendetaprodumanoLocal.getid_tipo_mano_produ_empresa()!=null && !productoordendetaprodumanoLocal.getid_tipo_mano_produ_empresa().equals(-1L))) {productoordendetaprodumanoBean.setid_tipo_mano_produ_empresa(productoordendetaprodumanoLocal.getid_tipo_mano_produ_empresa());}
			if(conDefault || (!conDefault && productoordendetaprodumanoLocal.getid_tipo_proceso_empresa_produ()!=null && !productoordendetaprodumanoLocal.getid_tipo_proceso_empresa_produ().equals(-1L))) {productoordendetaprodumanoBean.setid_tipo_proceso_empresa_produ(productoordendetaprodumanoLocal.getid_tipo_proceso_empresa_produ());}
			if(conDefault || (!conDefault && productoordendetaprodumanoLocal.getid_unidad()!=null && !productoordendetaprodumanoLocal.getid_unidad().equals(-1L))) {productoordendetaprodumanoBean.setid_unidad(productoordendetaprodumanoLocal.getid_unidad());}
			if(conDefault || (!conDefault && productoordendetaprodumanoLocal.getcantidad()!=null && !productoordendetaprodumanoLocal.getcantidad().equals(0L))) {productoordendetaprodumanoBean.setcantidad(productoordendetaprodumanoLocal.getcantidad());}
			if(conDefault || (!conDefault && productoordendetaprodumanoLocal.getcosto()!=null && !productoordendetaprodumanoLocal.getcosto().equals(0.0))) {productoordendetaprodumanoBean.setcosto(productoordendetaprodumanoLocal.getcosto());}
			if(conDefault || (!conDefault && productoordendetaprodumanoLocal.getcosto_total()!=null && !productoordendetaprodumanoLocal.getcosto_total().equals(0.0))) {productoordendetaprodumanoBean.setcosto_total(productoordendetaprodumanoLocal.getcosto_total());}
			if(conDefault || (!conDefault && productoordendetaprodumanoLocal.getdescripcion()!=null && !productoordendetaprodumanoLocal.getdescripcion().equals(""))) {productoordendetaprodumanoBean.setdescripcion(productoordendetaprodumanoLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProductoOrdenDetaProduManoGenerico(Long idProductoOrdenDetaProduManoSeleccionado,JComboBox jComboBoxProductoOrdenDetaProduMano,List<ProductoOrdenDetaProduMano> productoordendetaprodumanosLocal)throws Exception {
		try {
			ProductoOrdenDetaProduMano  productoordendetaprodumanoTemp=null;

			for(ProductoOrdenDetaProduMano productoordendetaprodumanoAux:productoordendetaprodumanosLocal) {
				if(productoordendetaprodumanoAux.getId()!=null && productoordendetaprodumanoAux.getId().equals(idProductoOrdenDetaProduManoSeleccionado)) {
					productoordendetaprodumanoTemp=productoordendetaprodumanoAux;
					break;
				}
			}

			jComboBoxProductoOrdenDetaProduMano.setSelectedItem(productoordendetaprodumanoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProductoOrdenDetaProduManoGenerico(JComboBox jComboBoxProductoOrdenDetaProduMano,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProductoOrdenDetaProduMano.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductoOrdenDetaProduMano.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProductoOrdenDetaProduMano.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductoOrdenDetaProduMano.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductoOrdenDetaProduMano.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProductoOrdenDetaProduMano.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductoOrdenDetaProduMano.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProductoOrdenDetaProduMano.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProductoOrdenDetaProduMano.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProductoOrdenDetaProduMano.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoordendetaprodumano=(ProductoOrdenDetaProduMano) productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productoordendetaprodumano =(ProductoOrdenDetaProduMano) productoordendetaprodumanos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("OrdenDetaProdu")) {
			//sDescripcion=this.getActualOrdenDetaProduForeignKeyDescripcion((Long)value);
			if(!productoordendetaprodumano.getIsNew() && !productoordendetaprodumano.getIsChanged() && !productoordendetaprodumano.getIsDeleted()) {
				sDescripcion=productoordendetaprodumano.getordendetaprodu_descripcion();
			} else {
				//sDescripcion=this.getActualOrdenDetaProduForeignKeyDescripcion((Long)value);
				sDescripcion=productoordendetaprodumano.getordendetaprodu_descripcion();
			}
		}

		if(sTipo.equals("TipoManoProduEmpresa")) {
			//sDescripcion=this.getActualTipoManoProduEmpresaForeignKeyDescripcion((Long)value);
			if(!productoordendetaprodumano.getIsNew() && !productoordendetaprodumano.getIsChanged() && !productoordendetaprodumano.getIsDeleted()) {
				sDescripcion=productoordendetaprodumano.gettipomanoproduempresa_descripcion();
			} else {
				//sDescripcion=this.getActualTipoManoProduEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=productoordendetaprodumano.gettipomanoproduempresa_descripcion();
			}
		}

		if(sTipo.equals("TipoProcesoEmpresaProdu")) {
			//sDescripcion=this.getActualTipoProcesoEmpresaProduForeignKeyDescripcion((Long)value);
			if(!productoordendetaprodumano.getIsNew() && !productoordendetaprodumano.getIsChanged() && !productoordendetaprodumano.getIsDeleted()) {
				sDescripcion=productoordendetaprodumano.gettipoprocesoempresaprodu_descripcion();
			} else {
				//sDescripcion=this.getActualTipoProcesoEmpresaProduForeignKeyDescripcion((Long)value);
				sDescripcion=productoordendetaprodumano.gettipoprocesoempresaprodu_descripcion();
			}
		}

		if(sTipo.equals("Unidad")) {
			//sDescripcion=this.getActualUnidadForeignKeyDescripcion((Long)value);
			if(!productoordendetaprodumano.getIsNew() && !productoordendetaprodumano.getIsChanged() && !productoordendetaprodumano.getIsDeleted()) {
				sDescripcion=productoordendetaprodumano.getunidad_descripcion();
			} else {
				//sDescripcion=this.getActualUnidadForeignKeyDescripcion((Long)value);
				sDescripcion=productoordendetaprodumano.getunidad_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProductoOrdenDetaProduMano productoordendetaprodumanoRow=new ProductoOrdenDetaProduMano();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoordendetaprodumanoRow=(ProductoOrdenDetaProduMano) productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productoordendetaprodumanoRow=(ProductoOrdenDetaProduMano) productoordendetaprodumanos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProductoOrdenDetaProduMano(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProductoOrdenDetaProduMano.setVisible((this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMano && this.isPermisoNuevoProductoOrdenDetaProduMano));			
			this.jButtonDuplicarProductoOrdenDetaProduMano.setVisible((this.isVisibilidadCeldaDuplicarProductoOrdenDetaProduMano && this.isPermisoDuplicarProductoOrdenDetaProduMano));			
			this.jButtonCopiarProductoOrdenDetaProduMano.setVisible((this.isVisibilidadCeldaCopiarProductoOrdenDetaProduMano && this.isPermisoCopiarProductoOrdenDetaProduMano));
			this.jButtonVerFormProductoOrdenDetaProduMano.setVisible((this.isVisibilidadCeldaVerFormProductoOrdenDetaProduMano && this.isPermisoVerFormProductoOrdenDetaProduMano));
			
			this.jButtonAbrirOrderByProductoOrdenDetaProduMano.setVisible((this.isVisibilidadCeldaOrdenProductoOrdenDetaProduMano && this.isPermisoOrdenProductoOrdenDetaProduMano));			
			
			this.jButtonNuevoRelacionesProductoOrdenDetaProduMano.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMano && this.isPermisoNuevoProductoOrdenDetaProduMano));			
			this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduMano.setVisible((this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMano && this.isPermisoNuevoProductoOrdenDetaProduMano && this.isPermisoGuardarCambiosProductoOrdenDetaProduMano));
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonModificarProductoOrdenDetaProduMano.setVisible((this.isVisibilidadCeldaModificarProductoOrdenDetaProduMano && this.isPermisoActualizarProductoOrdenDetaProduMano));	
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonActualizarProductoOrdenDetaProduMano.setVisible((this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMano && this.isPermisoActualizarProductoOrdenDetaProduMano));	
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonEliminarProductoOrdenDetaProduMano.setVisible((this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMano && this.isPermisoEliminarProductoOrdenDetaProduMano));
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonCancelarProductoOrdenDetaProduMano.setVisible(this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMano);							
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonGuardarCambiosProductoOrdenDetaProduMano.setVisible((this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMano && this.isPermisoGuardarCambiosProductoOrdenDetaProduMano));			
			
			}
						
			this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMano.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMano && this.isPermisoGuardarCambiosProductoOrdenDetaProduMano));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProductoOrdenDetaProduMano.setVisible((this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMano && this.isPermisoNuevoProductoOrdenDetaProduMano));						
			this.jButtonDuplicarToolBarProductoOrdenDetaProduMano.setVisible((this.isVisibilidadCeldaDuplicarProductoOrdenDetaProduMano && this.isPermisoDuplicarProductoOrdenDetaProduMano));						
			this.jButtonCopiarToolBarProductoOrdenDetaProduMano.setVisible((this.isVisibilidadCeldaCopiarProductoOrdenDetaProduMano && this.isPermisoCopiarProductoOrdenDetaProduMano));			
			this.jButtonVerFormToolBarProductoOrdenDetaProduMano.setVisible((this.isVisibilidadCeldaVerFormProductoOrdenDetaProduMano && this.isPermisoVerFormProductoOrdenDetaProduMano));			
			this.jButtonAbrirOrderByToolBarProductoOrdenDetaProduMano.setVisible((this.isVisibilidadCeldaOrdenProductoOrdenDetaProduMano && this.isPermisoOrdenProductoOrdenDetaProduMano));
			this.jButtonNuevoRelacionesToolBarProductoOrdenDetaProduMano.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMano && this.isPermisoNuevoProductoOrdenDetaProduMano));			
			this.jButtonNuevoGuardarCambiosToolBarProductoOrdenDetaProduMano.setVisible((this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMano && this.isPermisoNuevoProductoOrdenDetaProduMano && this.isPermisoGuardarCambiosProductoOrdenDetaProduMano));			
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonModificarToolBarProductoOrdenDetaProduMano.setVisible((this.isVisibilidadCeldaModificarProductoOrdenDetaProduMano && this.isPermisoActualizarProductoOrdenDetaProduMano));	
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonActualizarToolBarProductoOrdenDetaProduMano.setVisible((this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMano  && this.isPermisoActualizarProductoOrdenDetaProduMano));	
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonEliminarToolBarProductoOrdenDetaProduMano.setVisible((this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMano && this.isPermisoEliminarProductoOrdenDetaProduMano));
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonCancelarToolBarProductoOrdenDetaProduMano.setVisible(this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMano);				
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonGuardarCambiosToolBarProductoOrdenDetaProduMano.setVisible((this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMano && this.isPermisoGuardarCambiosProductoOrdenDetaProduMano));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProductoOrdenDetaProduMano.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMano && this.isPermisoGuardarCambiosProductoOrdenDetaProduMano));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProductoOrdenDetaProduMano.setVisible((this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMano && this.isPermisoNuevoProductoOrdenDetaProduMano));			
			this.jMenuItemDuplicarProductoOrdenDetaProduMano.setVisible((this.isVisibilidadCeldaDuplicarProductoOrdenDetaProduMano && this.isPermisoDuplicarProductoOrdenDetaProduMano));			
			this.jMenuItemCopiarProductoOrdenDetaProduMano.setVisible((this.isVisibilidadCeldaCopiarProductoOrdenDetaProduMano && this.isPermisoCopiarProductoOrdenDetaProduMano));			
			this.jMenuItemVerFormProductoOrdenDetaProduMano.setVisible((this.isVisibilidadCeldaVerFormProductoOrdenDetaProduMano && this.isPermisoVerFormProductoOrdenDetaProduMano));			
			this.jMenuItemAbrirOrderByProductoOrdenDetaProduMano.setVisible((this.isVisibilidadCeldaOrdenProductoOrdenDetaProduMano && this.isPermisoOrdenProductoOrdenDetaProduMano));			
			//this.jMenuItemMostrarOcultarProductoOrdenDetaProduMano.setVisible((this.isVisibilidadCeldaOrdenProductoOrdenDetaProduMano && this.isPermisoOrdenProductoOrdenDetaProduMano));
			this.jMenuItemDetalleAbrirOrderByProductoOrdenDetaProduMano.setVisible((this.isVisibilidadCeldaOrdenProductoOrdenDetaProduMano && this.isPermisoOrdenProductoOrdenDetaProduMano));			
			//this.jMenuItemDetalleMostrarOcultarProductoOrdenDetaProduMano.setVisible((this.isVisibilidadCeldaOrdenProductoOrdenDetaProduMano && this.isPermisoOrdenProductoOrdenDetaProduMano));			
			this.jMenuItemNuevoRelacionesProductoOrdenDetaProduMano.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMano && this.isPermisoNuevoProductoOrdenDetaProduMano));			
			this.jMenuItemNuevoGuardarCambiosProductoOrdenDetaProduMano.setVisible((this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMano && this.isPermisoNuevoProductoOrdenDetaProduMano && this.isPermisoGuardarCambiosProductoOrdenDetaProduMano));									
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jMenuItemModificarProductoOrdenDetaProduMano.setVisible((this.isVisibilidadCeldaModificarProductoOrdenDetaProduMano && this.isPermisoActualizarProductoOrdenDetaProduMano));	
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jMenuItemActualizarProductoOrdenDetaProduMano.setVisible((this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMano && this.isPermisoActualizarProductoOrdenDetaProduMano));	
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jMenuItemEliminarProductoOrdenDetaProduMano.setVisible((this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMano && this.isPermisoEliminarProductoOrdenDetaProduMano));
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jMenuItemCancelarProductoOrdenDetaProduMano.setVisible(this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMano);				
			}
			
			this.jMenuItemGuardarCambiosProductoOrdenDetaProduMano.setVisible((this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMano && this.isPermisoGuardarCambiosProductoOrdenDetaProduMano));						
			this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProduMano.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMano && this.isPermisoGuardarCambiosProductoOrdenDetaProduMano));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMano=this.jButtonNuevoProductoOrdenDetaProduMano.isVisible();
			this.isVisibilidadCeldaDuplicarProductoOrdenDetaProduMano=this.jButtonDuplicarProductoOrdenDetaProduMano.isVisible();
			this.isVisibilidadCeldaCopiarProductoOrdenDetaProduMano=this.jButtonCopiarProductoOrdenDetaProduMano.isVisible();
			this.isVisibilidadCeldaVerFormProductoOrdenDetaProduMano=this.jButtonVerFormProductoOrdenDetaProduMano.isVisible();
			
			this.isVisibilidadCeldaOrdenProductoOrdenDetaProduMano=this.jButtonAbrirOrderByProductoOrdenDetaProduMano.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMano=this.jButtonNuevoRelacionesProductoOrdenDetaProduMano.isVisible();
			this.isVisibilidadCeldaModificarProductoOrdenDetaProduMano=this.jButtonModificarProductoOrdenDetaProduMano.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMano=this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonActualizarProductoOrdenDetaProduMano.isVisible();
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMano=this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonEliminarProductoOrdenDetaProduMano.isVisible();
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMano=this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonCancelarProductoOrdenDetaProduMano.isVisible();
			this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMano=this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonGuardarCambiosProductoOrdenDetaProduMano.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMano=this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMano.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMano=this.jButtonNuevoToolBarProductoOrdenDetaProduMano.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMano=this.jButtonNuevoRelacionesToolBarProductoOrdenDetaProduMano.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {
			this.isVisibilidadCeldaModificarProductoOrdenDetaProduMano=this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonModificarToolBarProductoOrdenDetaProduMano.isVisible();
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMano=this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonActualizarToolBarProductoOrdenDetaProduMano.isVisible();
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMano=this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonEliminarToolBarProductoOrdenDetaProduMano.isVisible();
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMano=this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonCancelarToolBarProductoOrdenDetaProduMano.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMano=this.jButtonGuardarCambiosToolBarProductoOrdenDetaProduMano.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMano=this.jButtonGuardarCambiosTablaToolBarProductoOrdenDetaProduMano.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMano=this.jMenuItemNuevoProductoOrdenDetaProduMano.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMano=this.jMenuItemNuevoRelacionesProductoOrdenDetaProduMano.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {
			this.isVisibilidadCeldaModificarProductoOrdenDetaProduMano=this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jMenuItemModificarProductoOrdenDetaProduMano.isVisible();
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMano=this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jMenuItemActualizarProductoOrdenDetaProduMano.isVisible();
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMano=this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jMenuItemEliminarProductoOrdenDetaProduMano.isVisible();
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMano=this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jMenuItemCancelarProductoOrdenDetaProduMano.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMano=this.jMenuItemGuardarCambiosProductoOrdenDetaProduMano.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMano=this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProduMano.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProductoOrdenDetaProduMano(Boolean esInicializar) {
		if(ProductoOrdenDetaProduManoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.productoordendetaprodumanoSessionBean.getConGuardarRelaciones()) {
				//if(this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProductoOrdenDetaProduMano();
			}
			
			this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProduMano(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProductoOrdenDetaProduMano() {
		this.jButtonNuevoProductoOrdenDetaProduMano.setVisible(this.isPermisoNuevoProductoOrdenDetaProduMano);			
		this.jButtonDuplicarProductoOrdenDetaProduMano.setVisible(this.isPermisoDuplicarProductoOrdenDetaProduMano);			
		this.jButtonCopiarProductoOrdenDetaProduMano.setVisible(this.isPermisoCopiarProductoOrdenDetaProduMano);			
		this.jButtonVerFormProductoOrdenDetaProduMano.setVisible(this.isPermisoVerFormProductoOrdenDetaProduMano);			
		
		this.jButtonAbrirOrderByProductoOrdenDetaProduMano.setVisible(this.isPermisoOrdenProductoOrdenDetaProduMano);					
		
		this.jButtonNuevoRelacionesProductoOrdenDetaProduMano.setVisible(this.isPermisoNuevoProductoOrdenDetaProduMano);			
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonModificarProductoOrdenDetaProduMano.setVisible(this.isPermisoActualizarProductoOrdenDetaProduMano);	
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonActualizarProductoOrdenDetaProduMano.setVisible(this.isPermisoActualizarProductoOrdenDetaProduMano);	
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonEliminarProductoOrdenDetaProduMano.setVisible(this.isPermisoEliminarProductoOrdenDetaProduMano);
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonCancelarProductoOrdenDetaProduMano.setVisible(this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMano);						
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonGuardarCambiosProductoOrdenDetaProduMano.setVisible(this.isPermisoGuardarCambiosProductoOrdenDetaProduMano);							
		}
		
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMano.setVisible(this.isPermisoActualizarProductoOrdenDetaProduMano);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProductoOrdenDetaProduMano() {
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonModificarProductoOrdenDetaProduMano.setVisible(this.isPermisoActualizarProductoOrdenDetaProduMano);	
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonActualizarProductoOrdenDetaProduMano.setVisible(this.isPermisoActualizarProductoOrdenDetaProduMano);	
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonEliminarProductoOrdenDetaProduMano.setVisible(this.isPermisoEliminarProductoOrdenDetaProduMano);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonCancelarProductoOrdenDetaProduMano.setVisible(this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMano);							
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonGuardarCambiosProductoOrdenDetaProduMano.setVisible((this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMano && this.isPermisoGuardarCambiosProductoOrdenDetaProduMano));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProductoOrdenDetaProduMano() {
		if(ProductoOrdenDetaProduManoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProductoOrdenDetaProduMano();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProductoOrdenDetaProduMano() {
	}
	
	public void jTableDatosProductoOrdenDetaProduManoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProductoOrdenDetaProduMano(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProductoOrdenDetaProduManoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMano.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMano(this.getproductoordendetaprodumano(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMano(this.productoordendetaprodumano);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanos.toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodumano==null) {
						this.productoordendetaprodumano = new ProductoOrdenDetaProduMano();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMano(this.productoordendetaprodumano,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMano(this.productoordendetaprodumano);
				}

				if(this.productoordendetaprodumano.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.productoordendetaprodumano.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProduMano(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_orden_deta_produProductoOrdenDetaProduManoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoordendetaprodu=true;

			idTienePermisoordendetaprodu=this.tienePermisosUsuarioEnPaginaWebProductoOrdenDetaProduMano(OrdenDetaProduConstantesFunciones.CLASSNAME);

			if(idTienePermisoordendetaprodu) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMano.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoOrdenDetaProduMano.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoOrdenDetaProduMano.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanos.toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMano(this.getproductoordendetaprodumano(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMano(this.productoordendetaprodumano);

				this.ordendetaproduBeanSwingJInternalFrame=new OrdenDetaProduBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ordendetaproduBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ordendetaproduBeanSwingJInternalFrame.getOrdenDetaProduLogic().setConnexion(this.productoordendetaprodumanoLogic.getConnexion());

				if(this.productoordendetaprodumano.getid_orden_deta_produ()!=null) {
					this.ordendetaproduBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ordendetaproduBeanSwingJInternalFrame.setIdActual(this.productoordendetaprodumano.getid_orden_deta_produ());
					this.ordendetaproduBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ordendetaproduBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ordendetaproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaOrdenDetaProdu();
				}

				JInternalFrameBase jinternalFrame =this.ordendetaproduBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoOrdenDetaProduMano=(TitledBorder)this.jScrollPanelDatosProductoOrdenDetaProduMano.getBorder();
				TitledBorder titledBorderordendetaprodu=(TitledBorder)this.ordendetaproduBeanSwingJInternalFrame.jScrollPanelDatosOrdenDetaProdu.getBorder();

				titledBorderordendetaprodu.setTitle(titledBorderProductoOrdenDetaProduMano.getTitle() + " -> Orden Detalle Produccion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_orden_deta_produProductoOrdenDetaProduManoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMano.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMano(this.getproductoordendetaprodumano(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMano(this.productoordendetaprodumano);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanos.toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodumano==null) {
						this.productoordendetaprodumano = new ProductoOrdenDetaProduMano();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMano(this.productoordendetaprodumano,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMano(this.productoordendetaprodumano);
				}

				if(this.productoordendetaprodumano.getid_orden_deta_produ()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_orden_deta_produ = "+this.productoordendetaprodumano.getid_orden_deta_produ().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProduMano(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduManoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipomanoproduempresa=true;

			idTienePermisotipomanoproduempresa=this.tienePermisosUsuarioEnPaginaWebProductoOrdenDetaProduMano(TipoManoProduEmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisotipomanoproduempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMano.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoOrdenDetaProduMano.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoOrdenDetaProduMano.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanos.toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMano(this.getproductoordendetaprodumano(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMano(this.productoordendetaprodumano);

				this.tipomanoproduempresaBeanSwingJInternalFrame=new TipoManoProduEmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipomanoproduempresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipomanoproduempresaBeanSwingJInternalFrame.getTipoManoProduEmpresaLogic().setConnexion(this.productoordendetaprodumanoLogic.getConnexion());

				if(this.productoordendetaprodumano.getid_tipo_mano_produ_empresa()!=null) {
					this.tipomanoproduempresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipomanoproduempresaBeanSwingJInternalFrame.setIdActual(this.productoordendetaprodumano.getid_tipo_mano_produ_empresa());
					this.tipomanoproduempresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipomanoproduempresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipomanoproduempresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoManoProduEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.tipomanoproduempresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoOrdenDetaProduMano=(TitledBorder)this.jScrollPanelDatosProductoOrdenDetaProduMano.getBorder();
				TitledBorder titledBordertipomanoproduempresa=(TitledBorder)this.tipomanoproduempresaBeanSwingJInternalFrame.jScrollPanelDatosTipoManoProduEmpresa.getBorder();

				titledBordertipomanoproduempresa.setTitle(titledBorderProductoOrdenDetaProduMano.getTitle() + " -> Tipo Mano Obra Produccion Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduManoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMano.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMano(this.getproductoordendetaprodumano(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMano(this.productoordendetaprodumano);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanos.toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodumano==null) {
						this.productoordendetaprodumano = new ProductoOrdenDetaProduMano();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMano(this.productoordendetaprodumano,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMano(this.productoordendetaprodumano);
				}

				if(this.productoordendetaprodumano.getid_tipo_mano_produ_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_mano_produ_empresa = "+this.productoordendetaprodumano.getid_tipo_mano_produ_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProduMano(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduManoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoprocesoempresaprodu=true;

			idTienePermisotipoprocesoempresaprodu=this.tienePermisosUsuarioEnPaginaWebProductoOrdenDetaProduMano(TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoprocesoempresaprodu) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMano.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoOrdenDetaProduMano.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoOrdenDetaProduMano.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanos.toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMano(this.getproductoordendetaprodumano(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMano(this.productoordendetaprodumano);

				this.tipoprocesoempresaproduBeanSwingJInternalFrame=new TipoProcesoEmpresaProduBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoprocesoempresaproduBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoprocesoempresaproduBeanSwingJInternalFrame.getTipoProcesoEmpresaProduLogic().setConnexion(this.productoordendetaprodumanoLogic.getConnexion());

				if(this.productoordendetaprodumano.getid_tipo_proceso_empresa_produ()!=null) {
					this.tipoprocesoempresaproduBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoprocesoempresaproduBeanSwingJInternalFrame.setIdActual(this.productoordendetaprodumano.getid_tipo_proceso_empresa_produ());
					this.tipoprocesoempresaproduBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoprocesoempresaproduBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoprocesoempresaproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoProcesoEmpresaProdu();
				}

				JInternalFrameBase jinternalFrame =this.tipoprocesoempresaproduBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoOrdenDetaProduMano=(TitledBorder)this.jScrollPanelDatosProductoOrdenDetaProduMano.getBorder();
				TitledBorder titledBordertipoprocesoempresaprodu=(TitledBorder)this.tipoprocesoempresaproduBeanSwingJInternalFrame.jScrollPanelDatosTipoProcesoEmpresaProdu.getBorder();

				titledBordertipoprocesoempresaprodu.setTitle(titledBorderProductoOrdenDetaProduMano.getTitle() + " -> Tipo Proceso Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduManoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMano.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMano(this.getproductoordendetaprodumano(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMano(this.productoordendetaprodumano);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanos.toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodumano==null) {
						this.productoordendetaprodumano = new ProductoOrdenDetaProduMano();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMano(this.productoordendetaprodumano,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMano(this.productoordendetaprodumano);
				}

				if(this.productoordendetaprodumano.getid_tipo_proceso_empresa_produ()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_proceso_empresa_produ = "+this.productoordendetaprodumano.getid_tipo_proceso_empresa_produ().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProduMano(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_unidadProductoOrdenDetaProduManoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisounidad=true;

			idTienePermisounidad=this.tienePermisosUsuarioEnPaginaWebProductoOrdenDetaProduMano(UnidadConstantesFunciones.CLASSNAME);

			if(idTienePermisounidad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMano.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoOrdenDetaProduMano.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoOrdenDetaProduMano.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanos.toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMano(this.getproductoordendetaprodumano(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMano(this.productoordendetaprodumano);

				this.unidadBeanSwingJInternalFrame=new UnidadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.unidadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.unidadBeanSwingJInternalFrame.getUnidadLogic().setConnexion(this.productoordendetaprodumanoLogic.getConnexion());

				if(this.productoordendetaprodumano.getid_unidad()!=null) {
					this.unidadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.unidadBeanSwingJInternalFrame.setIdActual(this.productoordendetaprodumano.getid_unidad());
					this.unidadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.inicializarActualizarBindingTablaUnidad();
				}

				JInternalFrameBase jinternalFrame =this.unidadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoOrdenDetaProduMano=(TitledBorder)this.jScrollPanelDatosProductoOrdenDetaProduMano.getBorder();
				TitledBorder titledBorderunidad=(TitledBorder)this.unidadBeanSwingJInternalFrame.jScrollPanelDatosUnidad.getBorder();

				titledBorderunidad.setTitle(titledBorderProductoOrdenDetaProduMano.getTitle() + " -> Unidad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_unidadProductoOrdenDetaProduManoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMano.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMano(this.getproductoordendetaprodumano(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMano(this.productoordendetaprodumano);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanos.toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodumano==null) {
						this.productoordendetaprodumano = new ProductoOrdenDetaProduMano();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMano(this.productoordendetaprodumano,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMano(this.productoordendetaprodumano);
				}

				if(this.productoordendetaprodumano.getid_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_unidad = "+this.productoordendetaprodumano.getid_unidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProduMano(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadProductoOrdenDetaProduManoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMano.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMano(this.getproductoordendetaprodumano(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMano(this.productoordendetaprodumano);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanos.toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodumano==null) {
						this.productoordendetaprodumano = new ProductoOrdenDetaProduMano();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMano(this.productoordendetaprodumano,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMano(this.productoordendetaprodumano);
				}

				if(this.productoordendetaprodumano.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.productoordendetaprodumano.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProduMano(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncostoProductoOrdenDetaProduManoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMano.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMano(this.getproductoordendetaprodumano(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMano(this.productoordendetaprodumano);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanos.toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodumano==null) {
						this.productoordendetaprodumano = new ProductoOrdenDetaProduMano();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMano(this.productoordendetaprodumano,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMano(this.productoordendetaprodumano);
				}

				if(this.productoordendetaprodumano.getcosto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo = "+this.productoordendetaprodumano.getcosto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProduMano(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncosto_totalProductoOrdenDetaProduManoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMano.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMano(this.getproductoordendetaprodumano(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMano(this.productoordendetaprodumano);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanos.toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodumano==null) {
						this.productoordendetaprodumano = new ProductoOrdenDetaProduMano();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMano(this.productoordendetaprodumano,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMano(this.productoordendetaprodumano);
				}

				if(this.productoordendetaprodumano.getcosto_total()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo_total = "+this.productoordendetaprodumano.getcosto_total().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProduMano(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionProductoOrdenDetaProduManoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMano.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMano(this.getproductoordendetaprodumano(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMano(this.productoordendetaprodumano);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanos.toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodumano==null) {
						this.productoordendetaprodumano = new ProductoOrdenDetaProduMano();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMano(this.productoordendetaprodumano,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMano(this.productoordendetaprodumano);
				}

				if(this.productoordendetaprodumano.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.productoordendetaprodumano.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProduMano(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduManoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoOrdenDetaProduMano(false,false);

			this.getProductoOrdenDetaProduManosFK_IdOrdenDetaProdu();

			this.inicializarActualizarBindingProductoOrdenDetaProduMano(false);

			//if(ProductoOrdenDetaProduManoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoOrdenDetaProduMano(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoManoProduEmpresaProductoOrdenDetaProduManoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoOrdenDetaProduMano(false,false);

			this.getProductoOrdenDetaProduManosFK_IdTipoManoProduEmpresa();

			this.inicializarActualizarBindingProductoOrdenDetaProduMano(false);

			//if(ProductoOrdenDetaProduManoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoOrdenDetaProduMano(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduManoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoOrdenDetaProduMano(false,false);

			this.getProductoOrdenDetaProduManosFK_IdTipoProcesoEmpresaProdu();

			this.inicializarActualizarBindingProductoOrdenDetaProduMano(false);

			//if(ProductoOrdenDetaProduManoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoOrdenDetaProduMano(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUnidadProductoOrdenDetaProduManoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoOrdenDetaProduMano(false,false);

			this.getProductoOrdenDetaProduManosFK_IdUnidad();

			this.inicializarActualizarBindingProductoOrdenDetaProduMano(false);

			//if(ProductoOrdenDetaProduManoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoOrdenDetaProduMano(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumanoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProductoOrdenDetaProduMano() {
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.setVisible(false);	    			
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.dispose();
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano!=null) {
			this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.dispose();
			this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano=null;
		}
		
		if(this.jInternalFrameImportacionProductoOrdenDetaProduMano!=null) {
			this.jInternalFrameImportacionProductoOrdenDetaProduMano.setVisible(false);	    			
			this.jInternalFrameImportacionProductoOrdenDetaProduMano.dispose();
			this.jInternalFrameImportacionProductoOrdenDetaProduMano=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProductoOrdenDetaProduMano();
			
			ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
			
			
			if(sTipo.equals("NuevoProductoOrdenDetaProduMano")) {
				jButtonNuevoProductoOrdenDetaProduManoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProductoOrdenDetaProduMano")) {
				jButtonDuplicarProductoOrdenDetaProduManoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProductoOrdenDetaProduMano")) {
				jButtonCopiarProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("VerFormProductoOrdenDetaProduMano")) {
				jButtonVerFormProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProductoOrdenDetaProduMano")) {
				jButtonNuevoProductoOrdenDetaProduManoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProductoOrdenDetaProduMano")) {
				jButtonDuplicarProductoOrdenDetaProduManoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProductoOrdenDetaProduMano")) {
				jButtonNuevoProductoOrdenDetaProduManoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProductoOrdenDetaProduMano")) {
				jButtonDuplicarProductoOrdenDetaProduManoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProductoOrdenDetaProduMano")) {
				jButtonNuevoProductoOrdenDetaProduManoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProductoOrdenDetaProduMano")) {
				jButtonNuevoProductoOrdenDetaProduManoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProductoOrdenDetaProduMano")) {
				jButtonNuevoProductoOrdenDetaProduManoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProductoOrdenDetaProduMano")) {
				jButtonModificarProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProductoOrdenDetaProduMano")) {
				jButtonModificarProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProductoOrdenDetaProduMano")) {
				jButtonModificarProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProductoOrdenDetaProduMano")) {
				jButtonActualizarProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProductoOrdenDetaProduMano")) {
				jButtonActualizarProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProductoOrdenDetaProduMano")) {
				jButtonActualizarProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("EliminarProductoOrdenDetaProduMano")) {
				jButtonEliminarProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProductoOrdenDetaProduMano")) {
				jButtonEliminarProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProductoOrdenDetaProduMano")) {
				jButtonEliminarProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("CancelarProductoOrdenDetaProduMano")) {
				jButtonCancelarProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProductoOrdenDetaProduMano")) {
				jButtonCancelarProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProductoOrdenDetaProduMano")) {
				jButtonCancelarProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("CerrarProductoOrdenDetaProduMano")) {
				jButtonCerrarProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProductoOrdenDetaProduMano")) {
				jButtonCerrarProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProductoOrdenDetaProduMano")) {
				jButtonCerrarProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProductoOrdenDetaProduMano")) {
				jButtonMostrarOcultarProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProductoOrdenDetaProduMano")) {
				jButtonCancelarProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProductoOrdenDetaProduMano")) {
				jButtonGuardarCambiosProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProductoOrdenDetaProduMano")) {
				jButtonGuardarCambiosProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProductoOrdenDetaProduMano")) {
				jButtonCopiarProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProductoOrdenDetaProduMano")) {
				jButtonVerFormProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProductoOrdenDetaProduMano")) {
				jButtonGuardarCambiosProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProductoOrdenDetaProduMano")) {
				jButtonCopiarProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProductoOrdenDetaProduMano")) {
				jButtonVerFormProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProductoOrdenDetaProduMano")) {
				jButtonGuardarCambiosProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProductoOrdenDetaProduMano")) {
				jButtonGuardarCambiosProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProductoOrdenDetaProduMano")) {
				jButtonGuardarCambiosProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProductoOrdenDetaProduMano")) {
				jButtonRecargarInformacionProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProductoOrdenDetaProduMano")) {
				jButtonRecargarInformacionProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProductoOrdenDetaProduMano")) {
				jButtonRecargarInformacionProductoOrdenDetaProduManoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProductoOrdenDetaProduMano")) {
				jButtonAnterioresProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProductoOrdenDetaProduMano")) {
				jButtonAnterioresProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProductoOrdenDetaProduMano")) {
				jButtonAnterioresProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProductoOrdenDetaProduMano")) {
				jButtonSiguientesProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProductoOrdenDetaProduMano")) {
				jButtonSiguientesProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProductoOrdenDetaProduMano")) {
				jButtonSiguientesProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProductoOrdenDetaProduMano") || sTipo.equals("MenuItemDetalleAbrirOrderByProductoOrdenDetaProduMano")) {
				jButtonAbrirOrderByProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProductoOrdenDetaProduMano") || sTipo.equals("MenuItemDetalleMostrarOcultarProductoOrdenDetaProduMano")) {
				jButtonMostrarOcultarProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProductoOrdenDetaProduMano")) {
				jButtonNuevoGuardarCambiosProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProductoOrdenDetaProduMano")) {
				jButtonNuevoGuardarCambiosProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProductoOrdenDetaProduMano")) {
				jButtonNuevoGuardarCambiosProductoOrdenDetaProduManoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProductoOrdenDetaProduMano")) {
				jButtonCerrarReporteDinamicoProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProductoOrdenDetaProduMano")) {
				jButtonGenerarReporteDinamicoProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProductoOrdenDetaProduMano")) {
				
				jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduManoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProductoOrdenDetaProduMano")) {
				jButtonCerrarImportacionProductoOrdenDetaProduManoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProductoOrdenDetaProduMano")) {
				
				jButtonGenerarImportacionProductoOrdenDetaProduManoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProductoOrdenDetaProduMano")) {
				
				jButtonAbrirImportacionProductoOrdenDetaProduManoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProductoOrdenDetaProduMano")) {
				jComboBoxTiposAccionesProductoOrdenDetaProduManoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProductoOrdenDetaProduMano")) {
				jComboBoxTiposRelacionesProductoOrdenDetaProduManoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProductoOrdenDetaProduMano")) {
				jComboBoxTiposAccionesProductoOrdenDetaProduManoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProductoOrdenDetaProduMano")) {
				
				jComboBoxTiposSeleccionarProductoOrdenDetaProduManoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProductoOrdenDetaProduMano")) {
				jTextFieldValorCampoGeneralProductoOrdenDetaProduManoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProductoOrdenDetaProduMano")) {
				jButtonAbrirOrderByProductoOrdenDetaProduManoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProductoOrdenDetaProduMano")) {
				jButtonAbrirOrderByProductoOrdenDetaProduManoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProductoOrdenDetaProduMano")) {
				jButtonCerrarOrderByProductoOrdenDetaProduManoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductoOrdenDetaProduManoBusqueda")) {
				this.jButtonidProductoOrdenDetaProduManoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_orden_deta_produProductoOrdenDetaProduManoUpdate")) {
				this.jButtonid_orden_deta_produProductoOrdenDetaProduManoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_orden_deta_produProductoOrdenDetaProduManoBusqueda")) {
				this.jButtonid_orden_deta_produProductoOrdenDetaProduManoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_mano_produ_empresaProductoOrdenDetaProduManoUpdate")) {
				this.jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduManoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_mano_produ_empresaProductoOrdenDetaProduManoBusqueda")) {
				this.jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduManoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_proceso_empresa_produProductoOrdenDetaProduManoUpdate")) {
				this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduManoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_proceso_empresa_produProductoOrdenDetaProduManoBusqueda")) {
				this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduManoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadProductoOrdenDetaProduManoUpdate")) {
				this.jButtonid_unidadProductoOrdenDetaProduManoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadProductoOrdenDetaProduManoBusqueda")) {
				this.jButtonid_unidadProductoOrdenDetaProduManoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadProductoOrdenDetaProduManoBusqueda")) {
				this.jButtoncantidadProductoOrdenDetaProduManoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoProductoOrdenDetaProduManoBusqueda")) {
				this.jButtoncostoProductoOrdenDetaProduManoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_totalProductoOrdenDetaProduManoBusqueda")) {
				this.jButtoncosto_totalProductoOrdenDetaProduManoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionProductoOrdenDetaProduManoBusqueda")) {
				this.jButtondescripcionProductoOrdenDetaProduManoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdOrdenDetaProduProductoOrdenDetaProduMano")) {
				this.jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduManoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano")) {
				this.jButtonFK_IdTipoManoProduEmpresaProductoOrdenDetaProduManoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano")) {
				this.jButtonFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduManoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdUnidadProductoOrdenDetaProduMano")) {
				this.jButtonFK_IdUnidadProductoOrdenDetaProduManoActionPerformed(evt);
			}
			
			;
			
			
			ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProductoOrdenDetaProduMano();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoOrdenDetaProduManoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumano);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumano);
				
				ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
				
				


				
				ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduMano.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduMano.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProductoOrdenDetaProduMano productoordendetaprodumanoLocal=null;
			
			if(!this.getEsControlTabla()) {
				productoordendetaprodumanoLocal=this.productoordendetaprodumano;
			} else {
				productoordendetaprodumanoLocal=this.productoordendetaprodumanoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumano);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumano);
				
				ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
							
				
				


				
				ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduMano.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduMano.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoOrdenDetaProduManoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProduMano.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoAnterior =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoordendetaprodumanoAnterior =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanos.toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
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
			
			ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
			
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
			
			


			
			ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoOrdenDetaProduManoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumano);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumano);
				
				ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
								
						
				


				
				ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduMano.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduMano.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumano);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumano);
				
				ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
								
				
				


				
				ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduMano.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduMano.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoOrdenDetaProduManoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProduMano.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoAnterior =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoordendetaprodumanoAnterior =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanos.toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumano);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumano);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoOrdenDetaProduManoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProduMano.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoAnterior =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoordendetaprodumanoAnterior =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanos.toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoOrdenDetaProduManoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumano);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumano);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumano);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumano);
				
				ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
							
				
				


				
				ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduMano.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduMano.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoOrdenDetaProduManoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProduMano.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodumanoAnterior =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productoordendetaprodumanoAnterior =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanos.toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
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
			
			ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
			
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
			
			


			
			ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoOrdenDetaProduManoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumano);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumano);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumano);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumano);
				
				ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
								
				
				


				
				ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduMano.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduMano.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoOrdenDetaProduManoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProduMano.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoAnterior =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoordendetaprodumanoAnterior =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanos.toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoOrdenDetaProduManoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumano);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumano);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoOrdenDetaProduManoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumano);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumano);
				
				ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProductoOrdenDetaProduMano")) {
					jCheckBoxSeleccionarTodosProductoOrdenDetaProduManoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProductoOrdenDetaProduMano")) {
					jCheckBoxSeleccionadosProductoOrdenDetaProduManoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProductoOrdenDetaProduMano")) {
					
				}
				
				


				
				
				ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduMano.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduMano.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumano);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumano);
				
				ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
												
				
				


				
				
				ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduMano.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduMano.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoOrdenDetaProduManoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProduMano.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodumanoAnterior =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productoordendetaprodumanoAnterior =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanos.toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoOrdenDetaProduManoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumano);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumano);
				
				ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
				
				
				ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
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
			
			ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
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
			
			


			
			ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoOrdenDetaProduManoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumano);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumano);
				
				ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduMano.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduMano.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumano);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumano);
				
				ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
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
				
				


				
				ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduMano.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduMano.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoOrdenDetaProduManoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProduMano.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumanoAnterior =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoordendetaprodumanoAnterior =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanos.toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProductoOrdenDetaProduMano")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProductoOrdenDetaProduManoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProduMano.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.productoordendetaprodumano =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanos.toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.productoordendetaprodumano);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProductoOrdenDetaProduMano")) {
				
				}
				
				ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProductoOrdenDetaProduMano")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProductoOrdenDetaProduMano.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProductoOrdenDetaProduMano")) {
			
			}
			
			ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProductoOrdenDetaProduMano();
			
			ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
			
			if(sTipo.equals("NuevoProductoOrdenDetaProduMano")) {
				jButtonNuevoProductoOrdenDetaProduManoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProductoOrdenDetaProduMano")) {
				jButtonDuplicarProductoOrdenDetaProduManoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProductoOrdenDetaProduMano")) {
				jButtonCopiarProductoOrdenDetaProduManoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProductoOrdenDetaProduMano")) {
				jButtonVerFormProductoOrdenDetaProduManoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProductoOrdenDetaProduMano")) {
				jButtonNuevoProductoOrdenDetaProduManoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProductoOrdenDetaProduMano")) {
				jButtonModificarProductoOrdenDetaProduManoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProductoOrdenDetaProduMano")) {
				jButtonActualizarProductoOrdenDetaProduManoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProductoOrdenDetaProduMano")) {
				jButtonEliminarProductoOrdenDetaProduManoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProductoOrdenDetaProduMano")) {
				jButtonGuardarCambiosProductoOrdenDetaProduManoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProductoOrdenDetaProduMano")) {
				jButtonCancelarProductoOrdenDetaProduManoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProductoOrdenDetaProduMano")) {
				jButtonCerrarProductoOrdenDetaProduManoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProductoOrdenDetaProduMano")) {
				jButtonGuardarCambiosProductoOrdenDetaProduManoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProductoOrdenDetaProduMano")) {
				jButtonNuevoGuardarCambiosProductoOrdenDetaProduManoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProductoOrdenDetaProduMano")) {
				jButtonAbrirOrderByProductoOrdenDetaProduManoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProductoOrdenDetaProduMano")) {
				jButtonRecargarInformacionProductoOrdenDetaProduManoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProductoOrdenDetaProduMano")) {
				jButtonAnterioresProductoOrdenDetaProduManoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProductoOrdenDetaProduMano")) {
				jButtonSiguientesProductoOrdenDetaProduManoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductoOrdenDetaProduManoBusqueda")) {
				this.jButtonidProductoOrdenDetaProduManoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_orden_deta_produProductoOrdenDetaProduManoUpdate")) {
				this.jButtonid_orden_deta_produProductoOrdenDetaProduManoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_orden_deta_produProductoOrdenDetaProduManoBusqueda")) {
				this.jButtonid_orden_deta_produProductoOrdenDetaProduManoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_mano_produ_empresaProductoOrdenDetaProduManoUpdate")) {
				this.jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduManoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_mano_produ_empresaProductoOrdenDetaProduManoBusqueda")) {
				this.jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduManoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_proceso_empresa_produProductoOrdenDetaProduManoUpdate")) {
				this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduManoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_proceso_empresa_produProductoOrdenDetaProduManoBusqueda")) {
				this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduManoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadProductoOrdenDetaProduManoUpdate")) {
				this.jButtonid_unidadProductoOrdenDetaProduManoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadProductoOrdenDetaProduManoBusqueda")) {
				this.jButtonid_unidadProductoOrdenDetaProduManoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadProductoOrdenDetaProduManoBusqueda")) {
				this.jButtoncantidadProductoOrdenDetaProduManoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoProductoOrdenDetaProduManoBusqueda")) {
				this.jButtoncostoProductoOrdenDetaProduManoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_totalProductoOrdenDetaProduManoBusqueda")) {
				this.jButtoncosto_totalProductoOrdenDetaProduManoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionProductoOrdenDetaProduManoBusqueda")) {
				this.jButtondescripcionProductoOrdenDetaProduManoBusquedaActionPerformed(evt);
			}
			
			ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProductoOrdenDetaProduMano();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProductoOrdenDetaProduMano")) {
				closingInternalFrameProductoOrdenDetaProduMano();
				
			} else if(sTipo.equals("jButtonCancelarProductoOrdenDetaProduMano")) {
				JInternalFrameBase jInternalFrameDetalleFormProductoOrdenDetaProduMano = (JInternalFrameBase)evt.getSource();
	            	
	            ProductoOrdenDetaProduManoBeanSwingJInternalFrame jInternalFrameParent=(ProductoOrdenDetaProduManoBeanSwingJInternalFrame)jInternalFrameDetalleFormProductoOrdenDetaProduMano.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProductoOrdenDetaProduManoActionPerformed(null);
			}
			
			ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productoordendetaprodumano,new Object(),this.productoordendetaprodumanoParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProductoOrdenDetaProduMano(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProductoOrdenDetaProduMano(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProductoOrdenDetaProduMano(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.productoordendetaprodumano)) {
			if(!esControlTabla) {
				if(ProductoOrdenDetaProduManoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMano(this.productoordendetaprodumano,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMano(this.productoordendetaprodumano);			
				}
				
				if(this.productoordendetaprodumanoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProductoOrdenDetaProduMano(this.productoordendetaprodumano,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.productoordendetaprodumanoReturnGeneral=productoordendetaprodumanoLogic.procesarEventosProductoOrdenDetaProduManosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos(),this.productoordendetaprodumano,this.productoordendetaprodumanoParameterGeneral,this.isEsNuevoProductoOrdenDetaProduMano,classes);//this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduMano()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProductoOrdenDetaProduMano(this.productoordendetaprodumanoReturnGeneral,this.productoordendetaprodumanoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.productoordendetaprodumanoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProductoOrdenDetaProduMano(classes,this.productoordendetaprodumanoReturnGeneral,this.productoordendetaprodumanoBean,false);
					}
						
					if(this.productoordendetaprodumanoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProductoOrdenDetaProduMano(this.productoordendetaprodumanoReturnGeneral.getProductoOrdenDetaProduMano());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProductoOrdenDetaProduMano(this.productoordendetaprodumanoReturnGeneral.getProductoOrdenDetaProduMano());	
					}
						
					if(this.productoordendetaprodumanoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProductoOrdenDetaProduMano(this.productoordendetaprodumanoReturnGeneral.getProductoOrdenDetaProduMano(),classes);//this.productoordendetaprodumanoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProductoOrdenDetaProduMano(this.productoordendetaprodumano,classes);//this.productoordendetaprodumanoBean);									
				}
			
				if(ProductoOrdenDetaProduManoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMano(this.productoordendetaprodumano,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMano(this.productoordendetaprodumano);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.productoordendetaprodumanoAnterior!=null) {
						this.productoordendetaprodumano=this.productoordendetaprodumanoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.productoordendetaprodumanoReturnGeneral=productoordendetaprodumanoLogic.procesarEventosProductoOrdenDetaProduManosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos(),this.productoordendetaprodumano,this.productoordendetaprodumanoParameterGeneral,this.isEsNuevoProductoOrdenDetaProduMano,classes);//this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduMano()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productoordendetaprodumanoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.productoordendetaprodumanoReturnGeneral.getProductoOrdenDetaProduMano(),productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.productoordendetaprodumanoReturnGeneral.getProductoOrdenDetaProduMano(),this.productoordendetaprodumanos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProductoOrdenDetaProduMano.repaint();
				
				//((AbstractTableModel) this.jTableDatosProductoOrdenDetaProduMano.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProductoOrdenDetaProduMano();
			}
		}
	}
	
	public void actualizarVisualTableDatosProductoOrdenDetaProduMano() throws Exception {
		
		ProductoOrdenDetaProduManoModel productoordendetaprodumanoModel=(ProductoOrdenDetaProduManoModel)this.jTableDatosProductoOrdenDetaProduMano.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoordendetaprodumanoModel.productoordendetaprodumanos=this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			productoordendetaprodumanoModel.productoordendetaprodumanos=this.productoordendetaprodumanos;
		}
		
		
		((ProductoOrdenDetaProduManoModel) this.jTableDatosProductoOrdenDetaProduMano.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProductoOrdenDetaProduMano() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getproductoordendetaprodumanoAnterior(),this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getproductoordendetaprodumanoAnterior(),this.productoordendetaprodumanos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProductoOrdenDetaProduMano();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProductoOrdenDetaProduMano(ProductoOrdenDetaProduMano productoordendetaprodumano,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
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
										
				ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoordendetaprodumano,new Object(),generalEntityParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.productoordendetaprodumanoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProductoOrdenDetaProduManoConstantesFunciones.getClassesRelationshipsOfProductoOrdenDetaProduMano(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProductoOrdenDetaProduManoConstantesFunciones.getClassesRelationshipsFromStringsOfProductoOrdenDetaProduMano(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProductoOrdenDetaProduMano(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoordendetaprodumano,new Object(),generalEntityParameterGeneral,this.productoordendetaprodumanoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProductoOrdenDetaProduMano(ProductoOrdenDetaProduManoBean productoordendetaprodumanoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProductoOrdenDetaProduMano(ArrayList<Classe> classes,ProductoOrdenDetaProduManoReturnGeneral productoordendetaprodumanoReturnGeneral,ProductoOrdenDetaProduManoBean productoordendetaprodumanoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProductoOrdenDetaProduMano(ProductoOrdenDetaProduMano productoordendetaprodumano,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.productoordendetaprodumano)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano = new ProductoOrdenDetaProduManoDetalleFormJInternalFrame(jDesktopPane,this.productoordendetaprodumanoSessionBean.getConGuardarRelaciones(),this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.setVisible(false);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.setSelected(false);						
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.productoordendetaprodumanoLogic=this.productoordendetaprodumanoLogic;
		
		this.cargarCombosFrameForeignKeyProductoOrdenDetaProduMano("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProductoOrdenDetaProduMano();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductoOrdenDetaProduMano();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProductoOrdenDetaProduMano("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProductoOrdenDetaProduMano();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductoOrdenDetaProduMano"));
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonModificarProductoOrdenDetaProduMano.addActionListener(new ButtonActionListener(this,"ModificarProductoOrdenDetaProduMano"));

		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonModificarToolBarProductoOrdenDetaProduMano.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductoOrdenDetaProduMano"));
					
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jMenuItemModificarProductoOrdenDetaProduMano.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductoOrdenDetaProduMano"));		
		
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonActualizarProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"ActualizarProductoOrdenDetaProduMano"));
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonActualizarToolBarProductoOrdenDetaProduMano.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductoOrdenDetaProduMano"));
						
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jMenuItemActualizarProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductoOrdenDetaProduMano"));		
		
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonEliminarProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"EliminarProductoOrdenDetaProduMano"));
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonEliminarToolBarProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductoOrdenDetaProduMano"));
								
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jMenuItemEliminarProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductoOrdenDetaProduMano"));		
		
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonCancelarProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"CancelarProductoOrdenDetaProduMano"));
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonCancelarToolBarProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductoOrdenDetaProduMano"));
					
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jMenuItemCancelarProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductoOrdenDetaProduMano"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jMenuItemDetalleCerrarProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductoOrdenDetaProduMano"));		
		
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonGuardarCambiosToolBarProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoOrdenDetaProduMano"));
		
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonGuardarCambiosToolBarProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoOrdenDetaProduMano"));
		
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductoOrdenDetaProduMano"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonidProductoOrdenDetaProduManoBusqueda.addActionListener(new ButtonActionListener(this,"idProductoOrdenDetaProduManoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonid_orden_deta_produProductoOrdenDetaProduManoUpdate.addActionListener(new ButtonActionListener(this,"id_orden_deta_produProductoOrdenDetaProduManoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonid_orden_deta_produProductoOrdenDetaProduManoBusqueda.addActionListener(new ButtonActionListener(this,"id_orden_deta_produProductoOrdenDetaProduManoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduManoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_mano_produ_empresaProductoOrdenDetaProduManoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduManoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_mano_produ_empresaProductoOrdenDetaProduManoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduManoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_proceso_empresa_produProductoOrdenDetaProduManoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduManoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_proceso_empresa_produProductoOrdenDetaProduManoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonid_unidadProductoOrdenDetaProduManoUpdate.addActionListener(new ButtonActionListener(this,"id_unidadProductoOrdenDetaProduManoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonid_unidadProductoOrdenDetaProduManoBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadProductoOrdenDetaProduManoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtoncantidadProductoOrdenDetaProduManoBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductoOrdenDetaProduManoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtoncostoProductoOrdenDetaProduManoBusqueda.addActionListener(new ButtonActionListener(this,"costoProductoOrdenDetaProduManoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtoncosto_totalProductoOrdenDetaProduManoBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalProductoOrdenDetaProduManoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtondescripcionProductoOrdenDetaProduManoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProductoOrdenDetaProduManoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTabbedPaneRelacionesProductoOrdenDetaProduMano.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductoOrdenDetaProduMano"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProductoOrdenDetaProduMano"));
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductoOrdenDetaProduMano"));
		}
		
		this.jTableDatosProductoOrdenDetaProduMano.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProductoOrdenDetaProduMano"));
		
		this.jTableDatosProductoOrdenDetaProduMano.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProductoOrdenDetaProduMano"));
		
		this.jButtonNuevoProductoOrdenDetaProduMano.addActionListener(new ButtonActionListener(this,"NuevoProductoOrdenDetaProduMano"));
		
		this.jButtonDuplicarProductoOrdenDetaProduMano.addActionListener(new ButtonActionListener(this,"DuplicarProductoOrdenDetaProduMano"));
		
		this.jButtonCopiarProductoOrdenDetaProduMano.addActionListener(new ButtonActionListener(this,"CopiarProductoOrdenDetaProduMano"));
		
		this.jButtonVerFormProductoOrdenDetaProduMano.addActionListener(new ButtonActionListener(this,"VerFormProductoOrdenDetaProduMano"));
		
		
		this.jButtonNuevoToolBarProductoOrdenDetaProduMano.addActionListener(new ButtonActionListener(this,"NuevoToolBarProductoOrdenDetaProduMano"));
			
		this.jButtonDuplicarToolBarProductoOrdenDetaProduMano.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProductoOrdenDetaProduMano"));
			
		this.jMenuItemNuevoProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProductoOrdenDetaProduMano"));
			
		this.jMenuItemDuplicarProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProductoOrdenDetaProduMano"));		
		
		
		this.jButtonNuevoRelacionesProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProductoOrdenDetaProduMano"));
		
		
		this.jButtonNuevoRelacionesToolBarProductoOrdenDetaProduMano.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProductoOrdenDetaProduMano"));
			
		this.jMenuItemNuevoRelacionesProductoOrdenDetaProduMano.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProductoOrdenDetaProduMano"));		
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonModificarProductoOrdenDetaProduMano.addActionListener(new ButtonActionListener(this,"ModificarProductoOrdenDetaProduMano"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonModificarToolBarProductoOrdenDetaProduMano.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductoOrdenDetaProduMano"));
			
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jMenuItemModificarProductoOrdenDetaProduMano.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductoOrdenDetaProduMano"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonActualizarProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"ActualizarProductoOrdenDetaProduMano"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonActualizarToolBarProductoOrdenDetaProduMano.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductoOrdenDetaProduMano"));
				
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jMenuItemActualizarProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductoOrdenDetaProduMano"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonEliminarProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"EliminarProductoOrdenDetaProduMano"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonEliminarToolBarProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductoOrdenDetaProduMano"));
						
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jMenuItemEliminarProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductoOrdenDetaProduMano"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonCancelarProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"CancelarProductoOrdenDetaProduMano"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonCancelarToolBarProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductoOrdenDetaProduMano"));
			
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jMenuItemCancelarProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductoOrdenDetaProduMano"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProductoOrdenDetaProduMano"));		
		
		
		this.jButtonCerrarProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"CerrarProductoOrdenDetaProduMano"));
		
		
		this.jButtonCerrarToolBarProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"CerrarToolBarProductoOrdenDetaProduMano"));
			
		this.jMenuItemCerrarProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProductoOrdenDetaProduMano"));
			
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jMenuItemDetalleCerrarProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductoOrdenDetaProduMano"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonGuardarCambiosProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"GuardarCambiosProductoOrdenDetaProduMano"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonGuardarCambiosToolBarProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoOrdenDetaProduMano"));
		}
		
		this.jButtonCopiarToolBarProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"CopiarToolBarProductoOrdenDetaProduMano"));
			
		this.jButtonVerFormToolBarProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"VerFormToolBarProductoOrdenDetaProduMano"));
		
		this.jMenuItemGuardarCambiosProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProductoOrdenDetaProduMano"));
			
		this.jMenuItemCopiarProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProductoOrdenDetaProduMano"));		
		
		this.jMenuItemVerFormProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProductoOrdenDetaProduMano"));		
		
		
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductoOrdenDetaProduMano"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProductoOrdenDetaProduMano"));
			
		this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductoOrdenDetaProduMano"));		
		
		
		
		this.jButtonRecargarInformacionProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"RecargarInformacionProductoOrdenDetaProduMano"));
					
		this.jButtonRecargarInformacionToolBarProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProductoOrdenDetaProduMano"));
		
		this.jMenuItemRecargarInformacionProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProductoOrdenDetaProduMano"));		
		
		
		
		this.jButtonAnterioresProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"AnterioresProductoOrdenDetaProduMano"));
		
		
		this.jButtonAnterioresToolBarProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProductoOrdenDetaProduMano"));
		
		this.jMenuItemAnterioresProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProductoOrdenDetaProduMano"));		
		
		
		this.jButtonSiguientesProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"SiguientesProductoOrdenDetaProduMano"));
		
		
		this.jButtonSiguientesToolBarProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProductoOrdenDetaProduMano"));
			
		this.jMenuItemSiguientesProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProductoOrdenDetaProduMano"));
			
		this.jMenuItemAbrirOrderByProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProductoOrdenDetaProduMano"));
			
		this.jMenuItemMostrarOcultarProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProductoOrdenDetaProduMano"));
			
		this.jMenuItemDetalleAbrirOrderByProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProductoOrdenDetaProduMano"));
			
		this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProductoOrdenDetaProduMano"));		
		
		
		this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProductoOrdenDetaProduMano"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProductoOrdenDetaProduMano"));
			
		this.jMenuItemNuevoGuardarCambiosProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProductoOrdenDetaProduMano"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMano.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProductoOrdenDetaProduMano"));

		this.jCheckBoxSeleccionadosProductoOrdenDetaProduMano.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProductoOrdenDetaProduMano"));
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductoOrdenDetaProduMano"));
		}
		
		
		this.jComboBoxTiposRelacionesProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"TiposRelacionesProductoOrdenDetaProduMano"));
			
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"TiposAccionesProductoOrdenDetaProduMano"));
					
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProductoOrdenDetaProduMano"));
			
		this.jTextFieldValorCampoGeneralProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProductoOrdenDetaProduMano"));		
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonidProductoOrdenDetaProduManoBusqueda.addActionListener(new ButtonActionListener(this,"idProductoOrdenDetaProduManoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonid_orden_deta_produProductoOrdenDetaProduManoUpdate.addActionListener(new ButtonActionListener(this,"id_orden_deta_produProductoOrdenDetaProduManoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonid_orden_deta_produProductoOrdenDetaProduManoBusqueda.addActionListener(new ButtonActionListener(this,"id_orden_deta_produProductoOrdenDetaProduManoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduManoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_mano_produ_empresaProductoOrdenDetaProduManoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduManoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_mano_produ_empresaProductoOrdenDetaProduManoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduManoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_proceso_empresa_produProductoOrdenDetaProduManoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduManoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_proceso_empresa_produProductoOrdenDetaProduManoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonid_unidadProductoOrdenDetaProduManoUpdate.addActionListener(new ButtonActionListener(this,"id_unidadProductoOrdenDetaProduManoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonid_unidadProductoOrdenDetaProduManoBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadProductoOrdenDetaProduManoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtoncantidadProductoOrdenDetaProduManoBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductoOrdenDetaProduManoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtoncostoProductoOrdenDetaProduManoBusqueda.addActionListener(new ButtonActionListener(this,"costoProductoOrdenDetaProduManoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtoncosto_totalProductoOrdenDetaProduManoBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalProductoOrdenDetaProduManoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtondescripcionProductoOrdenDetaProduManoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProductoOrdenDetaProduManoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduMano.addActionListener(new ButtonActionListener(this,"FK_IdOrdenDetaProduProductoOrdenDetaProduMano"));

			this.jButtonFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano.addActionListener(new ButtonActionListener(this,"FK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano"));

			this.jButtonFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano.addActionListener(new ButtonActionListener(this,"FK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano"));

			this.jButtonFK_IdUnidadProductoOrdenDetaProduMano.addActionListener(new ButtonActionListener(this,"FK_IdUnidadProductoOrdenDetaProduMano"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano!=null) {
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoOrdenDetaProduMano"));
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoOrdenDetaProduMano"));
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMano.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoOrdenDetaProduMano"));
			}
			
			//this.jButtonCerrarReporteDinamicoProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoOrdenDetaProduMano"));				
			//this.jButtonGenerarReporteDinamicoProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoOrdenDetaProduMano"));
			//this.jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoOrdenDetaProduMano"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProductoOrdenDetaProduMano!=null) {
				this.jInternalFrameImportacionProductoOrdenDetaProduMano.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductoOrdenDetaProduMano"));
				this.jInternalFrameImportacionProductoOrdenDetaProduMano.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductoOrdenDetaProduMano"));
				this.jInternalFrameImportacionProductoOrdenDetaProduMano.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductoOrdenDetaProduMano"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"AbrirOrderByProductoOrdenDetaProduMano"));
			
			this.jButtonAbrirOrderByToolBarProductoOrdenDetaProduMano.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProductoOrdenDetaProduMano"));			
			
			if(this.jInternalFrameOrderByProductoOrdenDetaProduMano!=null) {
				this.jInternalFrameOrderByProductoOrdenDetaProduMano.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductoOrdenDetaProduMano"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTabbedPaneRelacionesProductoOrdenDetaProduMano.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductoOrdenDetaProduMano"));
		
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
            		closingInternalFrameProductoOrdenDetaProduMano();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProductoOrdenDetaProduMano = (JInternalFrameBase)event.getSource();
	            	
	            ProductoOrdenDetaProduManoBeanSwingJInternalFrame jInternalFrameParent=(ProductoOrdenDetaProduManoBeanSwingJInternalFrame)jInternalFrameDetalleFormProductoOrdenDetaProduMano.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProductoOrdenDetaProduManoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProductoOrdenDetaProduMano.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProductoOrdenDetaProduManoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProductoOrdenDetaProduMano.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProductoOrdenDetaProduMano.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoOrdenDetaProduManoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoOrdenDetaProduManoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoOrdenDetaProduManoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProductoOrdenDetaProduMano";
		inputMap = this.jButtonNuevoProductoOrdenDetaProduMano.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProductoOrdenDetaProduMano.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductoOrdenDetaProduManoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoOrdenDetaProduManoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoOrdenDetaProduManoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoOrdenDetaProduManoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProductoOrdenDetaProduMano";
		inputMap = this.jButtonNuevoRelacionesProductoOrdenDetaProduMano.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProductoOrdenDetaProduMano.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductoOrdenDetaProduManoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoOrdenDetaProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoOrdenDetaProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoOrdenDetaProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProductoOrdenDetaProduMano";
		inputMap = this.jButtonModificarProductoOrdenDetaProduMano.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProductoOrdenDetaProduMano.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProductoOrdenDetaProduManoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoOrdenDetaProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoOrdenDetaProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoOrdenDetaProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProductoOrdenDetaProduMano";
		inputMap = this.jButtonActualizarProductoOrdenDetaProduMano.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProductoOrdenDetaProduMano.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProductoOrdenDetaProduManoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoOrdenDetaProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoOrdenDetaProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoOrdenDetaProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProductoOrdenDetaProduMano";
		inputMap = this.jButtonEliminarProductoOrdenDetaProduMano.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProductoOrdenDetaProduMano.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProductoOrdenDetaProduManoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoOrdenDetaProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoOrdenDetaProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoOrdenDetaProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProductoOrdenDetaProduMano";
		inputMap = this.jButtonCancelarProductoOrdenDetaProduMano.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProductoOrdenDetaProduMano.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProductoOrdenDetaProduManoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoOrdenDetaProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoOrdenDetaProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoOrdenDetaProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProductoOrdenDetaProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProductoOrdenDetaProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProductoOrdenDetaProduMano";
		inputMap = this.jButtonCerrarProductoOrdenDetaProduMano.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProductoOrdenDetaProduMano.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProductoOrdenDetaProduManoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonGuardarCambiosProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoOrdenDetaProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoOrdenDetaProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoOrdenDetaProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoOrdenDetaProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoOrdenDetaProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoOrdenDetaProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProductoOrdenDetaProduMano";
		inputMap = this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonGuardarCambiosProductoOrdenDetaProduMano.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonGuardarCambiosProductoOrdenDetaProduMano.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProductoOrdenDetaProduManoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoOrdenDetaProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoOrdenDetaProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoOrdenDetaProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoOrdenDetaProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoOrdenDetaProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoOrdenDetaProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoOrdenDetaProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoOrdenDetaProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoOrdenDetaProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoOrdenDetaProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoOrdenDetaProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoOrdenDetaProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMano.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProductoOrdenDetaProduManoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProductoOrdenDetaProduMano.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProductoOrdenDetaProduManoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMano.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProductoOrdenDetaProduManoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProductoOrdenDetaProduMano.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProductoOrdenDetaProduManoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonidProductoOrdenDetaProduManoBusqueda.addActionListener(new ButtonActionListener(this,"idProductoOrdenDetaProduManoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonid_orden_deta_produProductoOrdenDetaProduManoUpdate.addActionListener(new ButtonActionListener(this,"id_orden_deta_produProductoOrdenDetaProduManoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonid_orden_deta_produProductoOrdenDetaProduManoBusqueda.addActionListener(new ButtonActionListener(this,"id_orden_deta_produProductoOrdenDetaProduManoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduManoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_mano_produ_empresaProductoOrdenDetaProduManoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonid_tipo_mano_produ_empresaProductoOrdenDetaProduManoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_mano_produ_empresaProductoOrdenDetaProduManoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduManoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_proceso_empresa_produProductoOrdenDetaProduManoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduManoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_proceso_empresa_produProductoOrdenDetaProduManoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonid_unidadProductoOrdenDetaProduManoUpdate.addActionListener(new ButtonActionListener(this,"id_unidadProductoOrdenDetaProduManoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtonid_unidadProductoOrdenDetaProduManoBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadProductoOrdenDetaProduManoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtoncantidadProductoOrdenDetaProduManoBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductoOrdenDetaProduManoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtoncostoProductoOrdenDetaProduManoBusqueda.addActionListener(new ButtonActionListener(this,"costoProductoOrdenDetaProduManoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtoncosto_totalProductoOrdenDetaProduManoBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalProductoOrdenDetaProduManoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jButtondescripcionProductoOrdenDetaProduManoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProductoOrdenDetaProduManoBusqueda"));
		
		
		this.jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduMano.addActionListener(new ButtonActionListener(this,"FK_IdOrdenDetaProduProductoOrdenDetaProduMano"));

		this.jButtonFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano.addActionListener(new ButtonActionListener(this,"FK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano"));

		this.jButtonFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano.addActionListener(new ButtonActionListener(this,"FK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano"));

		this.jButtonFK_IdUnidadProductoOrdenDetaProduMano.addActionListener(new ButtonActionListener(this,"FK_IdUnidadProductoOrdenDetaProduMano"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProductoOrdenDetaProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProductoOrdenDetaProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProductoOrdenDetaProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProductoOrdenDetaProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProductoOrdenDetaProduMano.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProductoOrdenDetaProduManoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProductoOrdenDetaProduManoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMano.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProductoOrdenDetaProduMano(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProductoOrdenDetaProduMano productoordendetaprodumanoAux:this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos()) {
					productoordendetaprodumanoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoOrdenDetaProduMano productoordendetaprodumanoAux:productoordendetaprodumanos) {
					productoordendetaprodumanoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProductoOrdenDetaProduManoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductoOrdenDetaProduMano(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductoOrdenDetaProduMano productoordendetaprodumanoAux:this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos()) {
						productoordendetaprodumanoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoOrdenDetaProduMano productoordendetaprodumanoAux:productoordendetaprodumanos) {
						productoordendetaprodumanoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProductoOrdenDetaProduMano productoordendetaprodumanoAux:this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoOrdenDetaProduMano productoordendetaprodumanoAux:productoordendetaprodumanos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProductoOrdenDetaProduMano(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductoOrdenDetaProduMano.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductoOrdenDetaProduMano.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMano,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProductoOrdenDetaProduManoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductoOrdenDetaProduMano(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProductoOrdenDetaProduMano.getSelectedRows();
			
			ProductoOrdenDetaProduMano productoordendetaprodumanoLocal=new ProductoOrdenDetaProduMano();
			
			//this.seleccionarTodosProductoOrdenDetaProduMano(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoordendetaprodumanoLocal =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos().toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					productoordendetaprodumanoLocal =(ProductoOrdenDetaProduMano) this.productoordendetaprodumanos.toArray()[this.jTableDatosProductoOrdenDetaProduMano.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				productoordendetaprodumanoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductoOrdenDetaProduMano productoordendetaprodumanoAux:this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos()) {
						productoordendetaprodumanoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoOrdenDetaProduMano productoordendetaprodumanoAux:productoordendetaprodumanos) {
						productoordendetaprodumanoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProductoOrdenDetaProduMano(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductoOrdenDetaProduMano.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductoOrdenDetaProduMano.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMano,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProductoOrdenDetaProduManoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProductoOrdenDetaProduManoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProductoOrdenDetaProduManoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProductoOrdenDetaProduMano(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProductoOrdenDetaProduMano.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductoOrdenDetaProduMano productoordendetaprodumanoAux:this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos()) {
				
						if(sTipoSeleccionar.equals(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							productoordendetaprodumanoAux.setcantidad(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							productoordendetaprodumanoAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_COSTOTOTAL)) {
							existe=true;
							productoordendetaprodumanoAux.setcosto_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							productoordendetaprodumanoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoOrdenDetaProduMano productoordendetaprodumanoAux:productoordendetaprodumanos) {
					
						if(sTipoSeleccionar.equals(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							productoordendetaprodumanoAux.setcantidad(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							productoordendetaprodumanoAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_COSTOTOTAL)) {
							existe=true;
							productoordendetaprodumanoAux.setcosto_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							productoordendetaprodumanoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProductoOrdenDetaProduMano(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProductoOrdenDetaProduManoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProductoOrdenDetaProduMano(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProductoOrdenDetaProduMano=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProductoOrdenDetaProduMano.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMano.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProductoOrdenDetaProduMano) {				
					conSplash=true;//false;										
					
					//this.startProcessProductoOrdenDetaProduMano(conSplash);
				
					this.generarReporteProductoOrdenDetaProduManosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoOrdenDetaProduMano.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMano.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProductoOrdenDetaProduManosSeleccionados();
				//this.jComboBoxTiposAccionesProductoOrdenDetaProduMano.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductoOrdenDetaProduManosSeleccionados(false);
				//this.jComboBoxTiposAccionesProductoOrdenDetaProduMano.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductoOrdenDetaProduManosSeleccionados(true);
				//this.jComboBoxTiposAccionesProductoOrdenDetaProduMano.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductoOrdenDetaProduMano();
				
				this.exportarProductoOrdenDetaProduManosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoOrdenDetaProduMano.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMano.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProductoOrdenDetaProduManos();
				//this.importarProductoOrdenDetaProduManos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoOrdenDetaProduMano.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMano.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductoOrdenDetaProduMano();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProductoOrdenDetaProduManosSeleccionados();
				//this.jComboBoxTiposAccionesProductoOrdenDetaProduMano.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Orden  Mano De Obra", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProductoOrdenDetaProduMano();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProductoOrdenDetaProduMano)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProductoOrdenDetaProduMano(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Orden  Mano De Obra",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoOrdenDetaProduMano.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMano.setSelectedIndex(0);					
				}	
			} 			
			else if(ProductoOrdenDetaProduManoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProductoOrdenDetaProduMano) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProductoOrdenDetaProduMano(conSplash);
					
						//this.actualizarParametrosGeneralProductoOrdenDetaProduMano();
						
						this.generarReporteProcesoAccionProductoOrdenDetaProduManosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProductoOrdenDetaProduMano.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMano.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Orden  Mano De ObraES SELECCIONADOS?", "MANTENIMIENTO DE Orden  Mano De Obra", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProductoOrdenDetaProduMano();
				
						this.actualizarParametrosGeneralProductoOrdenDetaProduMano();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.productoordendetaprodumanoReturnGeneral=productoordendetaprodumanoLogic.procesarAccionProductoOrdenDetaProduManosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos(),this.productoordendetaprodumanoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProductoOrdenDetaProduManoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductoOrdenDetaProduMano.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMano.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProductoOrdenDetaProduMano();
					
					ProductoOrdenDetaProduManoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProductoOrdenDetaProduManoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductoOrdenDetaProduMano.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMano.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProductoOrdenDetaProduMano(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProductoOrdenDetaProduManoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProductoOrdenDetaProduMano();
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProductoOrdenDetaProduMano> productoordendetaprodumanosSeleccionados=new ArrayList<ProductoOrdenDetaProduMano>();		
			ProductoOrdenDetaProduMano productoordendetaprodumano=new ProductoOrdenDetaProduMano();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProductoOrdenDetaProduMano(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProductoOrdenDetaProduMano.getSelectedItem();
			
			
			
			
			productoordendetaprodumanosSeleccionados=this.getProductoOrdenDetaProduManosSeleccionados(true);
			//this.sTipoAccion;
			
			if(productoordendetaprodumanosSeleccionados.size()==1) {
				for(ProductoOrdenDetaProduMano productoordendetaprodumanoAux:productoordendetaprodumanosSeleccionados) {
					productoordendetaprodumano=productoordendetaprodumanoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProductoOrdenDetaProduMano();
			
      		//this.finishProcessProductoOrdenDetaProduMano(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProductoOrdenDetaProduManoReturnGeneral() throws Exception {
		if(this.productoordendetaprodumanoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.productoordendetaprodumanoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.productoordendetaprodumanoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.productoordendetaprodumanoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.productoordendetaprodumanoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.productoordendetaprodumanoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProductoOrdenDetaProduMano(false);
		}
		
		if(this.productoordendetaprodumanoReturnGeneral.getConRetornoLista() || this.productoordendetaprodumanoReturnGeneral.getConRetornoObjeto()) {
			if(this.productoordendetaprodumanoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productoordendetaprodumanoLogic.setProductoOrdenDetaProduManos(this.productoordendetaprodumanoReturnGeneral.getProductoOrdenDetaProduManos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.productoordendetaprodumanoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productoordendetaprodumanoLogic.setProductoOrdenDetaProduMano(this.productoordendetaprodumanoReturnGeneral.getProductoOrdenDetaProduMano());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingProductoOrdenDetaProduMano(false);
		}
	}
	
	public void actualizarParametrosGeneralProductoOrdenDetaProduMano() throws Exception {
		
		
	}
	
	public ArrayList<ProductoOrdenDetaProduMano> getProductoOrdenDetaProduManosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProductoOrdenDetaProduMano> productoordendetaprodumanosSeleccionados=new ArrayList<ProductoOrdenDetaProduMano>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProductoOrdenDetaProduMano) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProductoOrdenDetaProduMano productoordendetaprodumanoAux:productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos()) {
					if(productoordendetaprodumanoAux.getIsSelected()) {
						productoordendetaprodumanosSeleccionados.add(productoordendetaprodumanoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoOrdenDetaProduMano productoordendetaprodumanoAux:this.productoordendetaprodumanos) {
					if(productoordendetaprodumanoAux.getIsSelected()) {
						productoordendetaprodumanosSeleccionados.add(productoordendetaprodumanoAux);				
					}
				}
			}
			
			if(productoordendetaprodumanosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						productoordendetaprodumanosSeleccionados.addAll(this.productoordendetaprodumanoLogic.getProductoOrdenDetaProduManos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						productoordendetaprodumanosSeleccionados.addAll(this.productoordendetaprodumanos);				
					}
				}
			}
		} else {
			productoordendetaprodumanosSeleccionados.add(this.productoordendetaprodumano);
		}
		
		return productoordendetaprodumanosSeleccionados;
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
	
	public void generarReporteProductoOrdenDetaProduManosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProductoOrdenDetaProduManosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProductoOrdenDetaProduManosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductoOrdenDetaProduManosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductoOrdenDetaProduManosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Orden  Mano De Obra",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProductoOrdenDetaProduManosSeleccionados() throws Exception {
		ArrayList<ProductoOrdenDetaProduMano> productoordendetaprodumanosSeleccionados=new ArrayList<ProductoOrdenDetaProduMano>();		
		
		productoordendetaprodumanosSeleccionados=this.getProductoOrdenDetaProduManosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProductoOrdenDetaProduManos("Todos",productoordendetaprodumanosSeleccionados);
		
	}	
	
	public void generarReporteNormalProductoOrdenDetaProduManosSeleccionados() throws Exception {
		ArrayList<ProductoOrdenDetaProduMano> productoordendetaprodumanosSeleccionados=new ArrayList<ProductoOrdenDetaProduMano>();		
		
		productoordendetaprodumanosSeleccionados=this.getProductoOrdenDetaProduManosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProductoOrdenDetaProduManos("Todos",productoordendetaprodumanosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProductoOrdenDetaProduManosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProductoOrdenDetaProduMano> productoordendetaprodumanosSeleccionados=new ArrayList<ProductoOrdenDetaProduMano>();
		
		productoordendetaprodumanosSeleccionados=this.getProductoOrdenDetaProduManosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProductoOrdenDetaProduManos("Todos",productoordendetaprodumanosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProductoOrdenDetaProduManosSeleccionados() throws Exception {
		ArrayList<ProductoOrdenDetaProduMano> productoordendetaprodumanosSeleccionados=new ArrayList<ProductoOrdenDetaProduMano>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProductoOrdenDetaProduMano();
		
		
		productoordendetaprodumanosSeleccionados=this.getProductoOrdenDetaProduManosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProductoOrdenDetaProduMano();
		
		
		//this.generarReporteProductoOrdenDetaProduManos("Todos",productoordendetaprodumanosSeleccionados ,productoordendetaprodumanoImplementable,productoordendetaprodumanoImplementableHome);
	}
	
	public void mostrarImportacionProductoOrdenDetaProduManos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProductoOrdenDetaProduMano();
		
		this.abrirFrameImportacionProductoOrdenDetaProduMano();		
		
			
		//this.generarReporteProductoOrdenDetaProduManos("Todos",productoordendetaprodumanosSeleccionados ,productoordendetaprodumanoImplementable,productoordendetaprodumanoImplementableHome);
	}
	
	public void importarProductoOrdenDetaProduManos() throws Exception {		
	
	}
	
	public void exportarProductoOrdenDetaProduManosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProductoOrdenDetaProduManosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProductoOrdenDetaProduManosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProductoOrdenDetaProduManosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Orden  Mano De Obra",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProductoOrdenDetaProduManosSeleccionados() throws Exception {
		ArrayList<ProductoOrdenDetaProduMano> productoordendetaprodumanosSeleccionados=new ArrayList<ProductoOrdenDetaProduMano>();		
		
		productoordendetaprodumanosSeleccionados=this.getProductoOrdenDetaProduManosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoordendetaprodumano."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProductoOrdenDetaProduMano(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProductoOrdenDetaProduMano productoordendetaprodumanoAux:productoordendetaprodumanosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProductoOrdenDetaProduMano(productoordendetaprodumanoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//productoordendetaprodumanoAux.setsDetalleGeneralEntityReporte(productoordendetaprodumanoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden  Mano De Obra",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProductoOrdenDetaProduMano(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProductoOrdenDetaProduManoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduManoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDORDENDETAPRODU;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDTIPOMANOPRODUEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduManoConstantesFunciones.LABEL_CANTIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduManoConstantesFunciones.LABEL_COSTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduManoConstantesFunciones.LABEL_COSTOTOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduManoConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProductoOrdenDetaProduMano(ProductoOrdenDetaProduMano productoordendetaprodumano,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=productoordendetaprodumano.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodumano.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodumano.getordendetaprodu_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodumano.gettipomanoproduempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodumano.gettipoprocesoempresaprodu_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodumano.getunidad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodumano.getcantidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodumano.getcosto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodumano.getcosto_total().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodumano.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProductoOrdenDetaProduManosSeleccionados() throws Exception {
		ArrayList<ProductoOrdenDetaProduMano> productoordendetaprodumanosSeleccionados=new ArrayList<ProductoOrdenDetaProduMano>();		
		
		productoordendetaprodumanosSeleccionados=this.getProductoOrdenDetaProduManosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoordendetaprodumano.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProductoOrdenDetaProduManos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProductoOrdenDetaProduMano(row);				
				iRow++;
			}				
			
			for(ProductoOrdenDetaProduMano productoordendetaprodumanoAux:productoordendetaprodumanosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProductoOrdenDetaProduMano(productoordendetaprodumanoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden  Mano De Obra",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProductoOrdenDetaProduManosSeleccionados() throws Exception {
		ArrayList<ProductoOrdenDetaProduMano> productoordendetaprodumanosSeleccionados=new ArrayList<ProductoOrdenDetaProduMano>();		
		
		productoordendetaprodumanosSeleccionados=this.getProductoOrdenDetaProduManosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoordendetaprodumano.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("productoordendetaprodumanos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("productoordendetaprodumano");
			//elementRoot.appendChild(element);
		
			for(ProductoOrdenDetaProduMano productoordendetaprodumanoAux:productoordendetaprodumanosSeleccionados) {
				element = document.createElement("productoordendetaprodumano");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProductoOrdenDetaProduMano(productoordendetaprodumanoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden  Mano De Obra",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProductoOrdenDetaProduMano(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDORDENDETAPRODU);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDTIPOMANOPRODUEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_CANTIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_COSTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_COSTOTOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProductoOrdenDetaProduMano(ProductoOrdenDetaProduMano productoordendetaprodumano,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodumano.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodumano.getordendetaprodu_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodumano.gettipomanoproduempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodumano.gettipoprocesoempresaprodu_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodumano.getunidad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodumano.getcantidad());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodumano.getcosto());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodumano.getcosto_total());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodumano.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlProductoOrdenDetaProduMano(ProductoOrdenDetaProduMano productoordendetaprodumano,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProductoOrdenDetaProduManoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(productoordendetaprodumano.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProductoOrdenDetaProduManoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(productoordendetaprodumano.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementordendetaprodu_descripcion = document.createElement(ProductoOrdenDetaProduManoConstantesFunciones.IDORDENDETAPRODU);
		elementordendetaprodu_descripcion.appendChild(document.createTextNode(productoordendetaprodumano.getordendetaprodu_descripcion()));
		element.appendChild(elementordendetaprodu_descripcion);

		Element elementtipomanoproduempresa_descripcion = document.createElement(ProductoOrdenDetaProduManoConstantesFunciones.IDTIPOMANOPRODUEMPRESA);
		elementtipomanoproduempresa_descripcion.appendChild(document.createTextNode(productoordendetaprodumano.gettipomanoproduempresa_descripcion()));
		element.appendChild(elementtipomanoproduempresa_descripcion);

		Element elementtipoprocesoempresaprodu_descripcion = document.createElement(ProductoOrdenDetaProduManoConstantesFunciones.IDTIPOPROCESOEMPRESAPRODU);
		elementtipoprocesoempresaprodu_descripcion.appendChild(document.createTextNode(productoordendetaprodumano.gettipoprocesoempresaprodu_descripcion()));
		element.appendChild(elementtipoprocesoempresaprodu_descripcion);

		Element elementunidad_descripcion = document.createElement(ProductoOrdenDetaProduManoConstantesFunciones.IDUNIDAD);
		elementunidad_descripcion.appendChild(document.createTextNode(productoordendetaprodumano.getunidad_descripcion()));
		element.appendChild(elementunidad_descripcion);

		Element elementcantidad = document.createElement(ProductoOrdenDetaProduManoConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(productoordendetaprodumano.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);

		Element elementcosto = document.createElement(ProductoOrdenDetaProduManoConstantesFunciones.COSTO);
		elementcosto.appendChild(document.createTextNode(productoordendetaprodumano.getcosto().toString().trim()));
		element.appendChild(elementcosto);

		Element elementcosto_total = document.createElement(ProductoOrdenDetaProduManoConstantesFunciones.COSTOTOTAL);
		elementcosto_total.appendChild(document.createTextNode(productoordendetaprodumano.getcosto_total().toString().trim()));
		element.appendChild(elementcosto_total);

		Element elementdescripcion = document.createElement(ProductoOrdenDetaProduManoConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(productoordendetaprodumano.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoProductoOrdenDetaProduManosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProductoOrdenDetaProduMano> productoordendetaprodumanosSeleccionados=new ArrayList<ProductoOrdenDetaProduMano>();
		
		productoordendetaprodumanosSeleccionados=this.getProductoOrdenDetaProduManosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProductoOrdenDetaProduMano(productoordendetaprodumanosSeleccionados);
		
		this.generarReporteProductoOrdenDetaProduManos("Todos",productoordendetaprodumanosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProductoOrdenDetaProduMano(ArrayList<ProductoOrdenDetaProduMano> productoordendetaprodumanosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProductoOrdenDetaProduMano productoordendetaprodumanoAux:productoordendetaprodumanosSeleccionados) {
				productoordendetaprodumanoAux.setsDetalleGeneralEntityReporte(productoordendetaprodumanoAux.toString());
			
				if(sTipoSeleccionar.equals(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDORDENDETAPRODU)) {
					existe=true;
					productoordendetaprodumanoAux.setsDescripcionGeneralEntityReporte1(productoordendetaprodumanoAux.getordendetaprodu_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDTIPOMANOPRODUEMPRESA)) {
					existe=true;
					productoordendetaprodumanoAux.setsDescripcionGeneralEntityReporte1(productoordendetaprodumanoAux.gettipomanoproduempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU)) {
					existe=true;
					productoordendetaprodumanoAux.setsDescripcionGeneralEntityReporte1(productoordendetaprodumanoAux.gettipoprocesoempresaprodu_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_IDUNIDAD)) {
					existe=true;
					productoordendetaprodumanoAux.setsDescripcionGeneralEntityReporte1(productoordendetaprodumanoAux.getunidad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_CANTIDAD)) {
					existe=true;
					productoordendetaprodumanoAux.setsDescripcionGeneralEntityReporte1(productoordendetaprodumanoAux.getcantidad().toString());
				}
				 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduManoConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					productoordendetaprodumanoAux.setsDescripcionGeneralEntityReporte1(productoordendetaprodumanoAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduManoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProductoOrdenDetaProduMano(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMano=true;
				this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMano=true;
				this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMano=true;
			}
			
			this.isVisibilidadCeldaModificarProductoOrdenDetaProduMano=false;
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMano=false;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMano=false;
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMano=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMano=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMano=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMano=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMano=false;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMano=false;
			this.isVisibilidadCeldaModificarProductoOrdenDetaProduMano=false;
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMano=true;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMano=false;
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMano=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMano=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMano=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMano=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMano=false;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMano=false;
			this.isVisibilidadCeldaModificarProductoOrdenDetaProduMano=false;
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMano=true;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMano=true;
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMano=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMano=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMano=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMano=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMano=false;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMano=false;
			this.isVisibilidadCeldaModificarProductoOrdenDetaProduMano=false;
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMano=true;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMano=false;
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMano=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMano=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMano=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMano=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMano=true;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMano=true;
			this.isVisibilidadCeldaModificarProductoOrdenDetaProduMano=false;
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMano=false;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMano=false;
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMano=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMano=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMano=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMano=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMano=false;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMano=false;
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMano=false;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMano=false;
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMano=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMano=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMano=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMano=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMano=false;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMano=false;
			this.isVisibilidadCeldaModificarProductoOrdenDetaProduMano=true;
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMano=false;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMano=false;
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMano=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMano=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMano=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProductoOrdenDetaProduManoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMano=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMano=true;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMano=true;
		} else {
			this.actualizarEstadoPanelsProductoOrdenDetaProduMano(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProductoOrdenDetaProduMano=false;
			//this.isVisibilidadCeldaVerFormProductoOrdenDetaProduMano=false;
			this.isVisibilidadCeldaDuplicarProductoOrdenDetaProduMano=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!productoordendetaprodumanoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMano=false;
		} else {
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMano=false;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMano=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {
			if(!productoordendetaprodumanoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMano=false;												
			}
			
			this.jButtonCerrarProductoOrdenDetaProduMano.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMano=false;
		}
		
		if(!this.permiteMantenimiento(this.productoordendetaprodumano)) {
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMano=false;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMano=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProductoOrdenDetaProduMano() {
	}
	
	public void actualizarEstadoPanelsProductoOrdenDetaProduMano(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProductoOrdenDetaProduMano!=null) {
				this.jScrollPanelDatosEdicionProductoOrdenDetaProduMano.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoOrdenDetaProduMano!=null) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoOrdenDetaProduMano!=null) {
				this.jScrollPanelDatosProductoOrdenDetaProduMano.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoOrdenDetaProduMano!=null) {
				this.jPanelPaginacionProductoOrdenDetaProduMano.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProduMano!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProduMano.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProductoOrdenDetaProduMano!=null) {
				this.jScrollPanelDatosEdicionProductoOrdenDetaProduMano.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoOrdenDetaProduMano!=null) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProductoOrdenDetaProduMano!=null) {
				this.jScrollPanelDatosProductoOrdenDetaProduMano.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoOrdenDetaProduMano!=null) {
				this.jPanelPaginacionProductoOrdenDetaProduMano.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProduMano!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProduMano.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProductoOrdenDetaProduMano!=null) {
				this.jScrollPanelDatosEdicionProductoOrdenDetaProduMano.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoOrdenDetaProduMano!=null) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductoOrdenDetaProduMano!=null) {
				this.jScrollPanelDatosProductoOrdenDetaProduMano.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoOrdenDetaProduMano!=null) {
				this.jPanelPaginacionProductoOrdenDetaProduMano.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProduMano!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProduMano.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProductoOrdenDetaProduMano!=null) {
				this.jScrollPanelDatosEdicionProductoOrdenDetaProduMano.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoOrdenDetaProduMano!=null) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductoOrdenDetaProduMano!=null) {
				this.jScrollPanelDatosProductoOrdenDetaProduMano.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoOrdenDetaProduMano!=null) {
				this.jPanelPaginacionProductoOrdenDetaProduMano.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProduMano!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProduMano.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProductoOrdenDetaProduMano!=null) {
				this.jScrollPanelDatosEdicionProductoOrdenDetaProduMano.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoOrdenDetaProduMano!=null) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoOrdenDetaProduMano!=null) {
				this.jScrollPanelDatosProductoOrdenDetaProduMano.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoOrdenDetaProduMano!=null) {
				this.jPanelPaginacionProductoOrdenDetaProduMano.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProduMano!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProduMano.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProductoOrdenDetaProduMano!=null) {
				this.jScrollPanelDatosEdicionProductoOrdenDetaProduMano.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoOrdenDetaProduMano!=null) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoOrdenDetaProduMano!=null) {
				this.jScrollPanelDatosProductoOrdenDetaProduMano.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoOrdenDetaProduMano!=null) {
				this.jPanelPaginacionProductoOrdenDetaProduMano.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProduMano!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProduMano.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProductoOrdenDetaProduMano!=null) {
				this.jScrollPanelDatosEdicionProductoOrdenDetaProduMano.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoOrdenDetaProduMano!=null) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoOrdenDetaProduMano!=null) {
				this.jScrollPanelDatosProductoOrdenDetaProduMano.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoOrdenDetaProduMano!=null) {
				this.jPanelPaginacionProductoOrdenDetaProduMano.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProduMano!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProduMano.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProductoOrdenDetaProduMano!=null) {
					this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProduMano!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProduMano.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoOrdenDetaProduMano!=null) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProduMano!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProduMano.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaOrdenDetaProdu(Boolean isParaOrdenDetaProdu){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaOrdenDetaProduNegation=!isParaOrdenDetaProdu;

			this.isVisibilidadFK_IdOrdenDetaProdu=isParaOrdenDetaProdu;
			if(!this.isVisibilidadFK_IdOrdenDetaProdu) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.remove(jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMano);}

			this.isVisibilidadFK_IdTipoManoProduEmpresa=isParaOrdenDetaProduNegation;
			if(!this.isVisibilidadFK_IdTipoManoProduEmpresa) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.remove(jPanelFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano);}

			this.isVisibilidadFK_IdTipoProcesoEmpresaProdu=isParaOrdenDetaProduNegation;
			if(!this.isVisibilidadFK_IdTipoProcesoEmpresaProdu) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.remove(jPanelFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano);}

			this.isVisibilidadFK_IdUnidad=isParaOrdenDetaProduNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.remove(jPanelFK_IdUnidadProductoOrdenDetaProduMano);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoManoProduEmpresa(Boolean isParaTipoManoProduEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoManoProduEmpresaNegation=!isParaTipoManoProduEmpresa;

			this.isVisibilidadFK_IdOrdenDetaProdu=isParaTipoManoProduEmpresaNegation;
			if(!this.isVisibilidadFK_IdOrdenDetaProdu) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.remove(jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMano);}

			this.isVisibilidadFK_IdTipoManoProduEmpresa=isParaTipoManoProduEmpresa;
			if(!this.isVisibilidadFK_IdTipoManoProduEmpresa) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.remove(jPanelFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano);}

			this.isVisibilidadFK_IdTipoProcesoEmpresaProdu=isParaTipoManoProduEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoProcesoEmpresaProdu) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.remove(jPanelFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano);}

			this.isVisibilidadFK_IdUnidad=isParaTipoManoProduEmpresaNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.remove(jPanelFK_IdUnidadProductoOrdenDetaProduMano);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoProcesoEmpresaProdu(Boolean isParaTipoProcesoEmpresaProdu){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoProcesoEmpresaProduNegation=!isParaTipoProcesoEmpresaProdu;

			this.isVisibilidadFK_IdOrdenDetaProdu=isParaTipoProcesoEmpresaProduNegation;
			if(!this.isVisibilidadFK_IdOrdenDetaProdu) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.remove(jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMano);}

			this.isVisibilidadFK_IdTipoManoProduEmpresa=isParaTipoProcesoEmpresaProduNegation;
			if(!this.isVisibilidadFK_IdTipoManoProduEmpresa) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.remove(jPanelFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano);}

			this.isVisibilidadFK_IdTipoProcesoEmpresaProdu=isParaTipoProcesoEmpresaProdu;
			if(!this.isVisibilidadFK_IdTipoProcesoEmpresaProdu) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.remove(jPanelFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano);}

			this.isVisibilidadFK_IdUnidad=isParaTipoProcesoEmpresaProduNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.remove(jPanelFK_IdUnidadProductoOrdenDetaProduMano);}
		}
		
	}

	public void setVisibilidadBusquedasParaUnidad(Boolean isParaUnidad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUnidadNegation=!isParaUnidad;

			this.isVisibilidadFK_IdOrdenDetaProdu=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdOrdenDetaProdu) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.remove(jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMano);}

			this.isVisibilidadFK_IdTipoManoProduEmpresa=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdTipoManoProduEmpresa) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.remove(jPanelFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano);}

			this.isVisibilidadFK_IdTipoProcesoEmpresaProdu=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdTipoProcesoEmpresaProdu) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.remove(jPanelFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano);}

			this.isVisibilidadFK_IdUnidad=isParaUnidad;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.remove(jPanelFK_IdUnidadProductoOrdenDetaProduMano);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ProductoOrdenDetaProduManoSessionBean productoordendetaprodumanoSessionBean=new ProductoOrdenDetaProduManoSessionBean();
		
		if(this.productoordendetaprodumanoSessionBean==null) {
			this.productoordendetaprodumanoSessionBean=new ProductoOrdenDetaProduManoSessionBean();
		}
		
		this.productoordendetaprodumanoSessionBean.setsUltimaBusquedaProductoOrdenDetaProduMano(this.getsAccionBusqueda());
		this.productoordendetaprodumanoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.productoordendetaprodumanoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdOrdenDetaProdu")) {
			productoordendetaprodumanoSessionBean.setid_orden_deta_produ(this.getid_orden_deta_produFK_IdOrdenDetaProdu());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoManoProduEmpresa")) {
			productoordendetaprodumanoSessionBean.setid_tipo_mano_produ_empresa(this.getid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoProcesoEmpresaProdu")) {
			productoordendetaprodumanoSessionBean.setid_tipo_proceso_empresa_produ(this.getid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
			productoordendetaprodumanoSessionBean.setid_unidad(this.getid_unidadFK_IdUnidad());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ProductoOrdenDetaProduManoSessionBean productoordendetaprodumanoSessionBean=new ProductoOrdenDetaProduManoSessionBean();
		
		if(this.productoordendetaprodumanoSessionBean==null) {
			this.productoordendetaprodumanoSessionBean=new ProductoOrdenDetaProduManoSessionBean();
		}
		
		if(this.productoordendetaprodumanoSessionBean.getsUltimaBusquedaProductoOrdenDetaProduMano()!=null&&!this.productoordendetaprodumanoSessionBean.getsUltimaBusquedaProductoOrdenDetaProduMano().equals("")) {
			this.setsAccionBusqueda(productoordendetaprodumanoSessionBean.getsUltimaBusquedaProductoOrdenDetaProduMano());
			this.setiNumeroPaginacion(productoordendetaprodumanoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(productoordendetaprodumanoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdOrdenDetaProdu")) {
				this.setid_orden_deta_produFK_IdOrdenDetaProdu(productoordendetaprodumanoSessionBean.getid_orden_deta_produ());
				productoordendetaprodumanoSessionBean.setid_orden_deta_produ(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoManoProduEmpresa")) {
				this.setid_tipo_mano_produ_empresaFK_IdTipoManoProduEmpresa(productoordendetaprodumanoSessionBean.getid_tipo_mano_produ_empresa());
				productoordendetaprodumanoSessionBean.setid_tipo_mano_produ_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoProcesoEmpresaProdu")) {
				this.setid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu(productoordendetaprodumanoSessionBean.getid_tipo_proceso_empresa_produ());
				productoordendetaprodumanoSessionBean.setid_tipo_proceso_empresa_produ(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
				this.setid_unidadFK_IdUnidad(productoordendetaprodumanoSessionBean.getid_unidad());
				productoordendetaprodumanoSessionBean.setid_unidad(-1L);
			}
		}
		
		this.productoordendetaprodumanoSessionBean.setsUltimaBusquedaProductoOrdenDetaProduMano("");
		this.productoordendetaprodumanoSessionBean.setiNumeroPaginacion(ProductoOrdenDetaProduManoConstantesFunciones.INUMEROPAGINACION);
		this.productoordendetaprodumanoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaProductoOrdenDetaProduMano(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProductoOrdenDetaProduMano() {
		this.updateBorderResaltarBusquedasFormularioProductoOrdenDetaProduMano();
		this.updateVisibilidadBusquedasFormularioProductoOrdenDetaProduMano();
		this.updateHabilitarBusquedasFormularioProductoOrdenDetaProduMano();
	}
	
	public void updateBorderResaltarBusquedasFormularioProductoOrdenDetaProduMano() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.getComponents().length>0) {
	

		if(this.productoordendetaprodumanoConstantesFunciones.resaltarFK_IdOrdenDetaProduProductoOrdenDetaProduMano!=null) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.indexOfComponent(this.jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMano);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.getComponent(index);
				jPanel.setBorder(this.productoordendetaprodumanoConstantesFunciones.resaltarFK_IdOrdenDetaProduProductoOrdenDetaProduMano);
			}
		}

		if(this.productoordendetaprodumanoConstantesFunciones.resaltarFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano!=null) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.indexOfComponent(this.jPanelFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.getComponent(index);
				jPanel.setBorder(this.productoordendetaprodumanoConstantesFunciones.resaltarFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano);
			}
		}

		if(this.productoordendetaprodumanoConstantesFunciones.resaltarFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano!=null) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.indexOfComponent(this.jPanelFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.getComponent(index);
				jPanel.setBorder(this.productoordendetaprodumanoConstantesFunciones.resaltarFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano);
			}
		}

		if(this.productoordendetaprodumanoConstantesFunciones.resaltarFK_IdUnidadProductoOrdenDetaProduMano!=null) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.indexOfComponent(this.jPanelFK_IdUnidadProductoOrdenDetaProduMano);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.getComponent(index);
				jPanel.setBorder(this.productoordendetaprodumanoConstantesFunciones.resaltarFK_IdUnidadProductoOrdenDetaProduMano);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProductoOrdenDetaProduMano() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.indexOfComponent(this.jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMano);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoordendetaprodumanoConstantesFunciones.mostrarFK_IdOrdenDetaProduProductoOrdenDetaProduMano);
			if(!this.productoordendetaprodumanoConstantesFunciones.mostrarFK_IdOrdenDetaProduProductoOrdenDetaProduMano && index>-1) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.indexOfComponent(this.jPanelFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoordendetaprodumanoConstantesFunciones.mostrarFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano);
			if(!this.productoordendetaprodumanoConstantesFunciones.mostrarFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano && index>-1) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.indexOfComponent(this.jPanelFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoordendetaprodumanoConstantesFunciones.mostrarFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano);
			if(!this.productoordendetaprodumanoConstantesFunciones.mostrarFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano && index>-1) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.indexOfComponent(this.jPanelFK_IdUnidadProductoOrdenDetaProduMano);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoordendetaprodumanoConstantesFunciones.mostrarFK_IdUnidadProductoOrdenDetaProduMano);
			if(!this.productoordendetaprodumanoConstantesFunciones.mostrarFK_IdUnidadProductoOrdenDetaProduMano && index>-1) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProductoOrdenDetaProduMano() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.indexOfComponent(this.jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMano);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoordendetaprodumanoConstantesFunciones.activarFK_IdOrdenDetaProduProductoOrdenDetaProduMano);
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.setEnabledAt(index,this.productoordendetaprodumanoConstantesFunciones.activarFK_IdOrdenDetaProduProductoOrdenDetaProduMano);
			}

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.indexOfComponent(this.jPanelFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoordendetaprodumanoConstantesFunciones.activarFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano);
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.setEnabledAt(index,this.productoordendetaprodumanoConstantesFunciones.activarFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano);
			}

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.indexOfComponent(this.jPanelFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoordendetaprodumanoConstantesFunciones.activarFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano);
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.setEnabledAt(index,this.productoordendetaprodumanoConstantesFunciones.activarFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano);
			}

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.indexOfComponent(this.jPanelFK_IdUnidadProductoOrdenDetaProduMano);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoordendetaprodumanoConstantesFunciones.activarFK_IdUnidadProductoOrdenDetaProduMano);
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.setEnabledAt(index,this.productoordendetaprodumanoConstantesFunciones.activarFK_IdUnidadProductoOrdenDetaProduMano);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProductoOrdenDetaProduMano(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdOrdenDetaProdu")) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.indexOfComponent(this.jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMano);

			this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.getComponent(index);

			this.productoordendetaprodumanoConstantesFunciones.setResaltarFK_IdOrdenDetaProduProductoOrdenDetaProduMano(resaltar);

			jPanel.setBorder(this.productoordendetaprodumanoConstantesFunciones.resaltarFK_IdOrdenDetaProduProductoOrdenDetaProduMano);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoManoProduEmpresa")) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.indexOfComponent(this.jPanelFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano);

			this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.getComponent(index);

			this.productoordendetaprodumanoConstantesFunciones.setResaltarFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano(resaltar);

			jPanel.setBorder(this.productoordendetaprodumanoConstantesFunciones.resaltarFK_IdTipoManoProduEmpresaProductoOrdenDetaProduMano);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoProcesoEmpresaProdu")) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.indexOfComponent(this.jPanelFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano);

			this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.getComponent(index);

			this.productoordendetaprodumanoConstantesFunciones.setResaltarFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano(resaltar);

			jPanel.setBorder(this.productoordendetaprodumanoConstantesFunciones.resaltarFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMano);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdUnidad")) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.indexOfComponent(this.jPanelFK_IdUnidadProductoOrdenDetaProduMano);

			this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMano.getComponent(index);

			this.productoordendetaprodumanoConstantesFunciones.setResaltarFK_IdUnidadProductoOrdenDetaProduMano(resaltar);

			jPanel.setBorder(this.productoordendetaprodumanoConstantesFunciones.resaltarFK_IdUnidadProductoOrdenDetaProduMano);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProductoOrdenDetaProduMano.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProductoOrdenDetaProduMano() throws Exception {

		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProductoOrdenDetaProduMano();
		this.updateVisibilidadResaltarControlesFormularioProductoOrdenDetaProduMano();
		this.updateHabilitarResaltarControlesFormularioProductoOrdenDetaProduMano();
		
	}
	
	public void updateBorderResaltarControlesFormularioProductoOrdenDetaProduMano() throws Exception {
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.productoordendetaprodumanoConstantesFunciones.resaltaridProductoOrdenDetaProduMano!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jLabelidProductoOrdenDetaProduMano.setBorder(this.productoordendetaprodumanoConstantesFunciones.resaltaridProductoOrdenDetaProduMano);}
		if(this.productoordendetaprodumanoConstantesFunciones.resaltarid_orden_deta_produProductoOrdenDetaProduMano!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_orden_deta_produProductoOrdenDetaProduMano.setBorder(this.productoordendetaprodumanoConstantesFunciones.resaltarid_orden_deta_produProductoOrdenDetaProduMano);}
		if(this.productoordendetaprodumanoConstantesFunciones.resaltarid_tipo_mano_produ_empresaProductoOrdenDetaProduMano!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.setBorder(this.productoordendetaprodumanoConstantesFunciones.resaltarid_tipo_mano_produ_empresaProductoOrdenDetaProduMano);}
		if(this.productoordendetaprodumanoConstantesFunciones.resaltarid_tipo_proceso_empresa_produProductoOrdenDetaProduMano!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.setBorder(this.productoordendetaprodumanoConstantesFunciones.resaltarid_tipo_proceso_empresa_produProductoOrdenDetaProduMano);}
		if(this.productoordendetaprodumanoConstantesFunciones.resaltarid_unidadProductoOrdenDetaProduMano!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_unidadProductoOrdenDetaProduMano.setBorder(this.productoordendetaprodumanoConstantesFunciones.resaltarid_unidadProductoOrdenDetaProduMano);}
		if(this.productoordendetaprodumanoConstantesFunciones.resaltarcantidadProductoOrdenDetaProduMano!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTextFieldcantidadProductoOrdenDetaProduMano.setBorder(this.productoordendetaprodumanoConstantesFunciones.resaltarcantidadProductoOrdenDetaProduMano);}
		if(this.productoordendetaprodumanoConstantesFunciones.resaltarcostoProductoOrdenDetaProduMano!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTextFieldcostoProductoOrdenDetaProduMano.setBorder(this.productoordendetaprodumanoConstantesFunciones.resaltarcostoProductoOrdenDetaProduMano);}
		if(this.productoordendetaprodumanoConstantesFunciones.resaltarcosto_totalProductoOrdenDetaProduMano!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTextFieldcosto_totalProductoOrdenDetaProduMano.setBorder(this.productoordendetaprodumanoConstantesFunciones.resaltarcosto_totalProductoOrdenDetaProduMano);}
		if(this.productoordendetaprodumanoConstantesFunciones.resaltardescripcionProductoOrdenDetaProduMano!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTextAreadescripcionProductoOrdenDetaProduMano.setBorder(this.productoordendetaprodumanoConstantesFunciones.resaltardescripcionProductoOrdenDetaProduMano);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProductoOrdenDetaProduMano() throws Exception {		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {
	
		//this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jLabelidProductoOrdenDetaProduMano.setVisible(this.productoordendetaprodumanoConstantesFunciones.mostraridProductoOrdenDetaProduMano);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jPanelidProductoOrdenDetaProduMano.setVisible(this.productoordendetaprodumanoConstantesFunciones.mostraridProductoOrdenDetaProduMano);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_orden_deta_produProductoOrdenDetaProduMano.setVisible(this.productoordendetaprodumanoConstantesFunciones.mostrarid_orden_deta_produProductoOrdenDetaProduMano);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jPanelid_orden_deta_produProductoOrdenDetaProduMano.setVisible(this.productoordendetaprodumanoConstantesFunciones.mostrarid_orden_deta_produProductoOrdenDetaProduMano);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.setVisible(this.productoordendetaprodumanoConstantesFunciones.mostrarid_tipo_mano_produ_empresaProductoOrdenDetaProduMano);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jPanelid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.setVisible(this.productoordendetaprodumanoConstantesFunciones.mostrarid_tipo_mano_produ_empresaProductoOrdenDetaProduMano);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.setVisible(this.productoordendetaprodumanoConstantesFunciones.mostrarid_tipo_proceso_empresa_produProductoOrdenDetaProduMano);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jPanelid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.setVisible(this.productoordendetaprodumanoConstantesFunciones.mostrarid_tipo_proceso_empresa_produProductoOrdenDetaProduMano);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_unidadProductoOrdenDetaProduMano.setVisible(this.productoordendetaprodumanoConstantesFunciones.mostrarid_unidadProductoOrdenDetaProduMano);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jPanelid_unidadProductoOrdenDetaProduMano.setVisible(this.productoordendetaprodumanoConstantesFunciones.mostrarid_unidadProductoOrdenDetaProduMano);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTextFieldcantidadProductoOrdenDetaProduMano.setVisible(this.productoordendetaprodumanoConstantesFunciones.mostrarcantidadProductoOrdenDetaProduMano);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jPanelcantidadProductoOrdenDetaProduMano.setVisible(this.productoordendetaprodumanoConstantesFunciones.mostrarcantidadProductoOrdenDetaProduMano);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTextFieldcostoProductoOrdenDetaProduMano.setVisible(this.productoordendetaprodumanoConstantesFunciones.mostrarcostoProductoOrdenDetaProduMano);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jPanelcostoProductoOrdenDetaProduMano.setVisible(this.productoordendetaprodumanoConstantesFunciones.mostrarcostoProductoOrdenDetaProduMano);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTextFieldcosto_totalProductoOrdenDetaProduMano.setVisible(this.productoordendetaprodumanoConstantesFunciones.mostrarcosto_totalProductoOrdenDetaProduMano);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jPanelcosto_totalProductoOrdenDetaProduMano.setVisible(this.productoordendetaprodumanoConstantesFunciones.mostrarcosto_totalProductoOrdenDetaProduMano);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTextAreadescripcionProductoOrdenDetaProduMano.setVisible(this.productoordendetaprodumanoConstantesFunciones.mostrardescripcionProductoOrdenDetaProduMano);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jPaneldescripcionProductoOrdenDetaProduMano.setVisible(this.productoordendetaprodumanoConstantesFunciones.mostrardescripcionProductoOrdenDetaProduMano);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProductoOrdenDetaProduMano() throws Exception {
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMano!=null) {
	
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jLabelidProductoOrdenDetaProduMano.setEnabled(this.productoordendetaprodumanoConstantesFunciones.activaridProductoOrdenDetaProduMano);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_orden_deta_produProductoOrdenDetaProduMano.setEnabled(this.productoordendetaprodumanoConstantesFunciones.activarid_orden_deta_produProductoOrdenDetaProduMano);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_tipo_mano_produ_empresaProductoOrdenDetaProduMano.setEnabled(this.productoordendetaprodumanoConstantesFunciones.activarid_tipo_mano_produ_empresaProductoOrdenDetaProduMano);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMano.setEnabled(this.productoordendetaprodumanoConstantesFunciones.activarid_tipo_proceso_empresa_produProductoOrdenDetaProduMano);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jComboBoxid_unidadProductoOrdenDetaProduMano.setEnabled(this.productoordendetaprodumanoConstantesFunciones.activarid_unidadProductoOrdenDetaProduMano);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTextFieldcantidadProductoOrdenDetaProduMano.setEnabled(this.productoordendetaprodumanoConstantesFunciones.activarcantidadProductoOrdenDetaProduMano);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTextFieldcostoProductoOrdenDetaProduMano.setEnabled(this.productoordendetaprodumanoConstantesFunciones.activarcostoProductoOrdenDetaProduMano);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTextFieldcosto_totalProductoOrdenDetaProduMano.setEnabled(this.productoordendetaprodumanoConstantesFunciones.activarcosto_totalProductoOrdenDetaProduMano);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMano.jTextAreadescripcionProductoOrdenDetaProduMano.setEnabled(this.productoordendetaprodumanoConstantesFunciones.activardescripcionProductoOrdenDetaProduMano);
		}
	}
	
		
}