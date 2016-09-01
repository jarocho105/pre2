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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.facturacion.util.ProductosPendientesConstantesFunciones;
import com.bydan.erp.facturacion.util.report.ProductosPendientesParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.report.ProductosPendientesParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.report.ProductosPendientesBean;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.facturacion.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.facturacion.util.*;

import com.bydan.erp.facturacion.util.report.*;
import com.bydan.erp.facturacion.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
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

//import org.hibernate.collection.PersistentBag;

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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;

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
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ProductosPendientesBeanSwingJInternalFrame extends ProductosPendientesJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProductosPendientesBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProductosPendientes> productospendientesValidator = new ClassValidator<ProductosPendientes>(ProductosPendientes.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProductosPendientes productospendientes;	
	public ProductosPendientes productospendientesAux;
	public ProductosPendientes productospendientesAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProductosPendientes productospendientesTotales;
	public Long idProductosPendientesActual;
	public Long iIdNuevoProductosPendientes=0L;
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

	public String sFinalQueryComboLinea="";

	public List<Linea> lineasForeignKey;

	public List<Linea> getlineasForeignKey() {
		return lineasForeignKey;
	}

	public void setlineasForeignKey(List<Linea> lineasForeignKey) {
		this.lineasForeignKey = lineasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineaForeignKey;

	public Linea getlineaForeignKey() {
		return lineaForeignKey;
	}

	public void setlineaForeignKey(Linea lineaForeignKey) {
		this.lineaForeignKey = lineaForeignKey;
	}

	public String sFinalQueryComboLineaGrupo="";

	public List<Linea> lineagruposForeignKey;

	public List<Linea> getlineagruposForeignKey() {
		return lineagruposForeignKey;
	}

	public void setlineagruposForeignKey(List<Linea> lineagruposForeignKey) {
		this.lineagruposForeignKey = lineagruposForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineagrupoForeignKey;

	public Linea getlineagrupoForeignKey() {
		return lineagrupoForeignKey;
	}

	public void setlineagrupoForeignKey(Linea lineagrupoForeignKey) {
		this.lineagrupoForeignKey = lineagrupoForeignKey;
	}

	public String sFinalQueryComboLineaCategoria="";

	public List<Linea> lineacategoriasForeignKey;

	public List<Linea> getlineacategoriasForeignKey() {
		return lineacategoriasForeignKey;
	}

	public void setlineacategoriasForeignKey(List<Linea> lineacategoriasForeignKey) {
		this.lineacategoriasForeignKey = lineacategoriasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineacategoriaForeignKey;

	public Linea getlineacategoriaForeignKey() {
		return lineacategoriaForeignKey;
	}

	public void setlineacategoriaForeignKey(Linea lineacategoriaForeignKey) {
		this.lineacategoriaForeignKey = lineacategoriaForeignKey;
	}

	public String sFinalQueryComboLineaMarca="";

	public List<Linea> lineamarcasForeignKey;

	public List<Linea> getlineamarcasForeignKey() {
		return lineamarcasForeignKey;
	}

	public void setlineamarcasForeignKey(List<Linea> lineamarcasForeignKey) {
		this.lineamarcasForeignKey = lineamarcasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineamarcaForeignKey;

	public Linea getlineamarcaForeignKey() {
		return lineamarcaForeignKey;
	}

	public void setlineamarcaForeignKey(Linea lineamarcaForeignKey) {
		this.lineamarcaForeignKey = lineamarcaForeignKey;
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
	
	public Boolean isPermisoTodoProductosPendientes;
	public Boolean isPermisoNuevoProductosPendientes;
	public Boolean isPermisoActualizarProductosPendientes;
	public Boolean isPermisoActualizarOriginalProductosPendientes;
	public Boolean isPermisoEliminarProductosPendientes;
	public Boolean isPermisoGuardarCambiosProductosPendientes;
	public Boolean isPermisoConsultaProductosPendientes;
	public Boolean isPermisoBusquedaProductosPendientes;
	public Boolean isPermisoReporteProductosPendientes;
	public Boolean isPermisoPaginacionMedioProductosPendientes;
	public Boolean isPermisoPaginacionAltoProductosPendientes;
	public Boolean isPermisoPaginacionTodoProductosPendientes;
	public Boolean isPermisoCopiarProductosPendientes;
	public Boolean isPermisoVerFormProductosPendientes;
	public Boolean isPermisoDuplicarProductosPendientes;
	public Boolean isPermisoOrdenProductosPendientes;
	
	
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
	
	public ProductosPendientesParameterReturnGeneral productospendientesReturnGeneral;
	public ProductosPendientesParameterReturnGeneral productospendientesParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProductosPendientes=false;
	public Boolean esParaAccionDesdeFormularioProductosPendientes=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProductosPendientesSessionBeanAdditional productospendientesSessionBeanAdditional=null;
	
	public ProductosPendientesSessionBeanAdditional getProductosPendientesSessionBeanAdditional() {
		return this.productospendientesSessionBeanAdditional;
	}
	
	public void setProductosPendientesSessionBeanAdditional(ProductosPendientesSessionBeanAdditional productospendientesSessionBeanAdditional) {
		try {
			this.productospendientesSessionBeanAdditional=productospendientesSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProductosPendientesBeanSwingJInternalFrameAdditional productospendientesBeanSwingJInternalFrameAdditional=null;
	//public class ProductosPendientesBeanSwingJInternalFrame
	
	public ProductosPendientesBeanSwingJInternalFrameAdditional getProductosPendientesBeanSwingJInternalFrameAdditional() {
		return this.productospendientesBeanSwingJInternalFrameAdditional;
	}
	
	public void setProductosPendientesBeanSwingJInternalFrameAdditional(ProductosPendientesBeanSwingJInternalFrameAdditional productospendientesBeanSwingJInternalFrameAdditional) {
		try {
			this.productospendientesBeanSwingJInternalFrameAdditional=productospendientesBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProductosPendientesLogic productospendientesLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProductosPendientes productospendientesBean;
	public ProductosPendientesConstantesFunciones productospendientesConstantesFunciones;
	//public ProductosPendientesParameterReturnGeneral productospendientesReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public BodegaLogic bodegaLogic;
	public LineaLogic lineaLogic;
	public LineaLogic lineagrupoLogic;
	public LineaLogic lineacategoriaLogic;
	public LineaLogic lineamarcaLogic;
	
	//PARAMETROS
	
	
	//public List<ProductosPendientes> productospendientess;	
	//public List<ProductosPendientes> productospendientessEliminados;
	//public List<ProductosPendientes> productospendientessAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProductosPendientes=false;
	public Boolean isVisibilidadCeldaDuplicarProductosPendientes=true;
	public Boolean isVisibilidadCeldaCopiarProductosPendientes=true;
	public Boolean isVisibilidadCeldaVerFormProductosPendientes=true;
	public Boolean isVisibilidadCeldaOrdenProductosPendientes=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProductosPendientes=false;
	public Boolean isVisibilidadCeldaModificarProductosPendientes=false;
	public Boolean isVisibilidadCeldaActualizarProductosPendientes=false;
	public Boolean isVisibilidadCeldaEliminarProductosPendientes=false;
	public Boolean isVisibilidadCeldaCancelarProductosPendientes=false;
	public Boolean isVisibilidadCeldaGuardarProductosPendientes=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProductosPendientes=false;	
	
	
	public Boolean isVisibilidadBusquedaProductosPendientes=false;
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdLinea=false;
	public Boolean isVisibilidadFK_IdLineaCategoria=false;
	public Boolean isVisibilidadFK_IdLineaGrupo=false;
	public Boolean isVisibilidadFK_IdLineaMarca=false;
	
	public Long getiIdNuevoProductosPendientes() {
		return this.iIdNuevoProductosPendientes;
	}

	public void setiIdNuevoProductosPendientes(Long iIdNuevoProductosPendientes) {
		this.iIdNuevoProductosPendientes = iIdNuevoProductosPendientes;
	}
	
	public Long getidProductosPendientesActual() {
		return this.idProductosPendientesActual;
	}

	public void setidProductosPendientesActual(Long idProductosPendientesActual) {
		this.idProductosPendientesActual = idProductosPendientesActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProductosPendientes getproductospendientes() {
		return this.productospendientes;
	}

	public void setproductospendientes(ProductosPendientes productospendientes) {
		this.productospendientes = productospendientes;
	}
	
	public ProductosPendientes getproductospendientesAux() {
		return this.productospendientesAux;
	}

	public void setproductospendientesAux(ProductosPendientes productospendientesAux) {
		this.productospendientesAux = productospendientesAux;
	}				
	
	public ProductosPendientes getproductospendientesAnterior() {
		return this.productospendientesAnterior;
	}

	public void setproductospendientesAnterior(ProductosPendientes productospendientesAnterior) {
		this.productospendientesAnterior = productospendientesAnterior;
	}	
	
	public ProductosPendientes getproductospendientesTotales() {
		return this.productospendientesTotales;
	}

	public void setproductospendientesTotales(ProductosPendientes productospendientesTotales) {
		this.productospendientesTotales = productospendientesTotales;
	}	
	
	public ProductosPendientes getproductospendientesBean() {
		return this.productospendientesBean;
	}

	public void setproductospendientesBean(ProductosPendientes productospendientesBean) {
		this.productospendientesBean = productospendientesBean;
	}	
	
	public ProductosPendientesParameterReturnGeneral getproductospendientesReturnGeneral() {
		return this.productospendientesReturnGeneral;
	}

	public void setproductospendientesReturnGeneral(ProductosPendientesParameterReturnGeneral productospendientesReturnGeneral) {
		this.productospendientesReturnGeneral = productospendientesReturnGeneral;
	}	
	
	
	public Long id_bodegaBusquedaProductosPendientes=-1L;

	public Long getid_bodegaBusquedaProductosPendientes() {
		return this.id_bodegaBusquedaProductosPendientes;
	}

	public void setid_bodegaBusquedaProductosPendientes(Long id_bodegaBusquedaProductosPendientes) {
		this.id_bodegaBusquedaProductosPendientes = id_bodegaBusquedaProductosPendientes;
	}

;
	public Long id_lineaBusquedaProductosPendientes=-1L;

	public Long getid_lineaBusquedaProductosPendientes() {
		return this.id_lineaBusquedaProductosPendientes;
	}

	public void setid_lineaBusquedaProductosPendientes(Long id_lineaBusquedaProductosPendientes) {
		this.id_lineaBusquedaProductosPendientes = id_lineaBusquedaProductosPendientes;
	}

;
	public Long id_linea_grupoBusquedaProductosPendientes=-1L;

	public Long getid_linea_grupoBusquedaProductosPendientes() {
		return this.id_linea_grupoBusquedaProductosPendientes;
	}

	public void setid_linea_grupoBusquedaProductosPendientes(Long id_linea_grupoBusquedaProductosPendientes) {
		this.id_linea_grupoBusquedaProductosPendientes = id_linea_grupoBusquedaProductosPendientes;
	}

;
	public Long id_linea_categoriaBusquedaProductosPendientes=-1L;

	public Long getid_linea_categoriaBusquedaProductosPendientes() {
		return this.id_linea_categoriaBusquedaProductosPendientes;
	}

	public void setid_linea_categoriaBusquedaProductosPendientes(Long id_linea_categoriaBusquedaProductosPendientes) {
		this.id_linea_categoriaBusquedaProductosPendientes = id_linea_categoriaBusquedaProductosPendientes;
	}

;
	public Long id_linea_marcaBusquedaProductosPendientes=-1L;

	public Long getid_linea_marcaBusquedaProductosPendientes() {
		return this.id_linea_marcaBusquedaProductosPendientes;
	}

	public void setid_linea_marcaBusquedaProductosPendientes(Long id_linea_marcaBusquedaProductosPendientes) {
		this.id_linea_marcaBusquedaProductosPendientes = id_linea_marcaBusquedaProductosPendientes;
	}

;
	public Date fecha_emision_desdeBusquedaProductosPendientes=new Date();

	public Date getfecha_emision_desdeBusquedaProductosPendientes() {
		return this.fecha_emision_desdeBusquedaProductosPendientes;
	}

	public void setfecha_emision_desdeBusquedaProductosPendientes(Date fecha_emision_desdeBusquedaProductosPendientes) {
		this.fecha_emision_desdeBusquedaProductosPendientes = fecha_emision_desdeBusquedaProductosPendientes;
	}

;
	public Date fecha_emision_hastaBusquedaProductosPendientes=new Date();

	public Date getfecha_emision_hastaBusquedaProductosPendientes() {
		return this.fecha_emision_hastaBusquedaProductosPendientes;
	}

	public void setfecha_emision_hastaBusquedaProductosPendientes(Date fecha_emision_hastaBusquedaProductosPendientes) {
		this.fecha_emision_hastaBusquedaProductosPendientes = fecha_emision_hastaBusquedaProductosPendientes;
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

	public Long id_lineaFK_IdLinea=-1L;

	public Long getid_lineaFK_IdLinea() {
		return this.id_lineaFK_IdLinea;
	}

	public void setid_lineaFK_IdLinea(Long id_lineaFK_IdLinea) {
		this.id_lineaFK_IdLinea = id_lineaFK_IdLinea;
	}

	public Long id_linea_categoriaFK_IdLineaCategoria=-1L;

	public Long getid_linea_categoriaFK_IdLineaCategoria() {
		return this.id_linea_categoriaFK_IdLineaCategoria;
	}

	public void setid_linea_categoriaFK_IdLineaCategoria(Long id_linea_categoriaFK_IdLineaCategoria) {
		this.id_linea_categoriaFK_IdLineaCategoria = id_linea_categoriaFK_IdLineaCategoria;
	}

	public Long id_linea_grupoFK_IdLineaGrupo=-1L;

	public Long getid_linea_grupoFK_IdLineaGrupo() {
		return this.id_linea_grupoFK_IdLineaGrupo;
	}

	public void setid_linea_grupoFK_IdLineaGrupo(Long id_linea_grupoFK_IdLineaGrupo) {
		this.id_linea_grupoFK_IdLineaGrupo = id_linea_grupoFK_IdLineaGrupo;
	}

	public Long id_linea_marcaFK_IdLineaMarca=-1L;

	public Long getid_linea_marcaFK_IdLineaMarca() {
		return this.id_linea_marcaFK_IdLineaMarca;
	}

	public void setid_linea_marcaFK_IdLineaMarca(Long id_linea_marcaFK_IdLineaMarca) {
		this.id_linea_marcaFK_IdLineaMarca = id_linea_marcaFK_IdLineaMarca;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ProductosPendientesLogic getProductosPendientesLogic()	{		
		return productospendientesLogic;
	}

	public void setProductosPendientesLogic(ProductosPendientesLogic productospendientesLogic) {
		this.productospendientesLogic = productospendientesLogic;
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
	
	public Boolean getIsEsNuevoProductosPendientes() {
		return isEsNuevoProductosPendientes;
	}

	public void setIsEsNuevoProductosPendientes(Boolean isEsNuevoProductosPendientes) {
		this.isEsNuevoProductosPendientes = isEsNuevoProductosPendientes;
	}

	public Boolean getEsParaAccionDesdeFormularioProductosPendientes() {
		return esParaAccionDesdeFormularioProductosPendientes;
	}
	
	public void setEsParaAccionDesdeFormularioProductosPendientes(Boolean esParaAccionDesdeFormularioProductosPendientes) {
		this.esParaAccionDesdeFormularioProductosPendientes = esParaAccionDesdeFormularioProductosPendientes;
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

			if(this.productospendientesSessionBean==null) {
				this.productospendientesSessionBean=new ProductosPendientesSessionBean();
			}

			if(!this.productospendientesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(productospendientesSessionBean.getlidEmpresaActual());
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

			if(this.productospendientesSessionBean==null) {
				this.productospendientesSessionBean=new ProductosPendientesSessionBean();
			}

			if(!this.productospendientesSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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
					bodegaLogic.getEntityWithConnection(productospendientesSessionBean.getlidBodegaActual());
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

	public void cargarCombosLineasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineasForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.productospendientesSessionBean==null) {
				this.productospendientesSessionBean=new ProductosPendientesSessionBean();
			}

			if(!this.productospendientesSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineasForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLinea(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(productospendientesSessionBean.getlidLineaActual());
					this.lineasForeignKey.add(lineaLogic.getLinea());
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

	public void cargarCombosLineaGruposForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineagruposForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.productospendientesSessionBean==null) {
				this.productospendientesSessionBean=new ProductosPendientesSessionBean();
			}

			if(!this.productospendientesSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineagrupoLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineagruposForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLineaGrupo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(productospendientesSessionBean.getlidLineaGrupoActual());
					this.lineagruposForeignKey.add(lineaLogic.getLinea());
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

	public void cargarCombosLineaCategoriasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineacategoriasForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.productospendientesSessionBean==null) {
				this.productospendientesSessionBean=new ProductosPendientesSessionBean();
			}

			if(!this.productospendientesSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineacategoriaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineacategoriasForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLineaCategoria(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(productospendientesSessionBean.getlidLineaCategoriaActual());
					this.lineacategoriasForeignKey.add(lineaLogic.getLinea());
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

	public void cargarCombosLineaMarcasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineamarcasForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.productospendientesSessionBean==null) {
				this.productospendientesSessionBean=new ProductosPendientesSessionBean();
			}

			if(!this.productospendientesSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineamarcaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineamarcasForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLineaMarca(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(productospendientesSessionBean.getlidLineaMarcaActual());
					this.lineamarcasForeignKey.add(lineaLogic.getLinea());
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

					if(this.productospendientes!=null) {
						this.productospendientes.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
						this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_empresaProductosPendientes.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaProductosPendientes.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
						if(this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_empresaProductosPendientes.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_empresaProductosPendientes.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaProductosPendientesGenerico)throws Exception
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
				jComboBoxid_empresaProductosPendientesGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaProductosPendientesGenerico!=null && jComboBoxid_empresaProductosPendientesGenerico.getItemCount()>0) {
					jComboBoxid_empresaProductosPendientesGenerico.setSelectedIndex(0);
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

					if(this.productospendientes!=null) {
						this.productospendientes.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
						this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_bodegaProductosPendientes.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaProductosPendientes.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
						if(this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_bodegaProductosPendientes.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_bodegaProductosPendientes.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProductosPendientes") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaBusquedaProductosPendientesProductosPendientes!=null) {
						jComboBoxid_bodegaBusquedaProductosPendientesProductosPendientes.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaBusquedaProductosPendientesProductosPendientes!=null) {
							//jComboBoxid_bodegaBusquedaProductosPendientesProductosPendientes.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaBusquedaProductosPendientesProductosPendientes.getItemCount()>0) {
								jComboBoxid_bodegaBusquedaProductosPendientesProductosPendientes.setSelectedIndex(0);
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
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaProductosPendientesGenerico)throws Exception
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
				jComboBoxid_bodegaProductosPendientesGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaProductosPendientesGenerico!=null && jComboBoxid_bodegaProductosPendientesGenerico.getItemCount()>0) {
					jComboBoxid_bodegaProductosPendientesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaForeignKey(Long idLineaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineaTemp=null;

			for(Linea lineaAux:lineasForeignKey) {
				if(lineaAux.getId()!=null && lineaAux.getId().equals(idLineaSeleccionado)) {
					lineaTemp=lineaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineaTemp!=null) {

					if(this.productospendientes!=null) {
						this.productospendientes.setLinea(lineaTemp);
					}

					if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
						this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_lineaProductosPendientes.setSelectedItem(lineaTemp);
					}
				} else {
					//jComboBoxid_lineaProductosPendientes.setSelectedItem(lineaTemp);
					if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
						if(this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_lineaProductosPendientes.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_lineaProductosPendientes.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProductosPendientes") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineaTemp!=null && jComboBoxid_lineaBusquedaProductosPendientesProductosPendientes!=null) {
						jComboBoxid_lineaBusquedaProductosPendientesProductosPendientes.setSelectedItem(lineaTemp);
					} else {
						if(jComboBoxid_lineaBusquedaProductosPendientesProductosPendientes!=null) {
							//jComboBoxid_lineaBusquedaProductosPendientesProductosPendientes.setSelectedItem(lineaTemp);
							if(jComboBoxid_lineaBusquedaProductosPendientesProductosPendientes.getItemCount()>0) {
								jComboBoxid_lineaBusquedaProductosPendientesProductosPendientes.setSelectedIndex(0);
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

	public String getActualLineaForeignKeyDescripcion(Long idLineaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineaTemp=null;

			for(Linea lineaAux:lineasForeignKey) {
				if(lineaAux.getId()!=null && lineaAux.getId().equals(idLineaSeleccionado)) {
					lineaTemp=lineaAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaForeignKeyGenerico(Long idLineaSeleccionado,JComboBox jComboBoxid_lineaProductosPendientesGenerico)throws Exception
	{
		try
		{
			Linea  lineaTemp=null;

			for(Linea lineaAux:lineasForeignKey) {
				if(lineaAux.getId()!=null && lineaAux.getId().equals(idLineaSeleccionado)) {
					lineaTemp=lineaAux;
					break;
				}
			}

			if(lineaTemp!=null) {
				jComboBoxid_lineaProductosPendientesGenerico.setSelectedItem(lineaTemp);
			} else {
				if(jComboBoxid_lineaProductosPendientesGenerico!=null && jComboBoxid_lineaProductosPendientesGenerico.getItemCount()>0) {
					jComboBoxid_lineaProductosPendientesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaGrupoForeignKey(Long idLineaGrupoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineagrupoTemp=null;

			for(Linea lineagrupoAux:lineagruposForeignKey) {
				if(lineagrupoAux.getId()!=null && lineagrupoAux.getId().equals(idLineaGrupoSeleccionado)) {
					lineagrupoTemp=lineagrupoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineagrupoTemp!=null) {

					if(this.productospendientes!=null) {
						this.productospendientes.setLineaGrupo(lineagrupoTemp);
					}

					if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
						this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_grupoProductosPendientes.setSelectedItem(lineagrupoTemp);
					}
				} else {
					//jComboBoxid_linea_grupoProductosPendientes.setSelectedItem(lineagrupoTemp);
					if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
						if(this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_grupoProductosPendientes.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_grupoProductosPendientes.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProductosPendientes") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineagrupoTemp!=null && jComboBoxid_linea_grupoBusquedaProductosPendientesProductosPendientes!=null) {
						jComboBoxid_linea_grupoBusquedaProductosPendientesProductosPendientes.setSelectedItem(lineagrupoTemp);
					} else {
						if(jComboBoxid_linea_grupoBusquedaProductosPendientesProductosPendientes!=null) {
							//jComboBoxid_linea_grupoBusquedaProductosPendientesProductosPendientes.setSelectedItem(lineagrupoTemp);
							if(jComboBoxid_linea_grupoBusquedaProductosPendientesProductosPendientes.getItemCount()>0) {
								jComboBoxid_linea_grupoBusquedaProductosPendientesProductosPendientes.setSelectedIndex(0);
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

	public String getActualLineaGrupoForeignKeyDescripcion(Long idLineaGrupoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineagrupoTemp=null;

			for(Linea lineagrupoAux:lineagruposForeignKey) {
				if(lineagrupoAux.getId()!=null && lineagrupoAux.getId().equals(idLineaGrupoSeleccionado)) {
					lineagrupoTemp=lineagrupoAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineagrupoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaGrupoForeignKeyGenerico(Long idLineaGrupoSeleccionado,JComboBox jComboBoxid_linea_grupoProductosPendientesGenerico)throws Exception
	{
		try
		{
			Linea  lineagrupoTemp=null;

			for(Linea lineagrupoAux:lineagruposForeignKey) {
				if(lineagrupoAux.getId()!=null && lineagrupoAux.getId().equals(idLineaGrupoSeleccionado)) {
					lineagrupoTemp=lineagrupoAux;
					break;
				}
			}

			if(lineagrupoTemp!=null) {
				jComboBoxid_linea_grupoProductosPendientesGenerico.setSelectedItem(lineagrupoTemp);
			} else {
				if(jComboBoxid_linea_grupoProductosPendientesGenerico!=null && jComboBoxid_linea_grupoProductosPendientesGenerico.getItemCount()>0) {
					jComboBoxid_linea_grupoProductosPendientesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaCategoriaForeignKey(Long idLineaCategoriaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineacategoriaTemp=null;

			for(Linea lineacategoriaAux:lineacategoriasForeignKey) {
				if(lineacategoriaAux.getId()!=null && lineacategoriaAux.getId().equals(idLineaCategoriaSeleccionado)) {
					lineacategoriaTemp=lineacategoriaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineacategoriaTemp!=null) {

					if(this.productospendientes!=null) {
						this.productospendientes.setLineaCategoria(lineacategoriaTemp);
					}

					if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
						this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_categoriaProductosPendientes.setSelectedItem(lineacategoriaTemp);
					}
				} else {
					//jComboBoxid_linea_categoriaProductosPendientes.setSelectedItem(lineacategoriaTemp);
					if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
						if(this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_categoriaProductosPendientes.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_categoriaProductosPendientes.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProductosPendientes") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineacategoriaTemp!=null && jComboBoxid_linea_categoriaBusquedaProductosPendientesProductosPendientes!=null) {
						jComboBoxid_linea_categoriaBusquedaProductosPendientesProductosPendientes.setSelectedItem(lineacategoriaTemp);
					} else {
						if(jComboBoxid_linea_categoriaBusquedaProductosPendientesProductosPendientes!=null) {
							//jComboBoxid_linea_categoriaBusquedaProductosPendientesProductosPendientes.setSelectedItem(lineacategoriaTemp);
							if(jComboBoxid_linea_categoriaBusquedaProductosPendientesProductosPendientes.getItemCount()>0) {
								jComboBoxid_linea_categoriaBusquedaProductosPendientesProductosPendientes.setSelectedIndex(0);
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

	public String getActualLineaCategoriaForeignKeyDescripcion(Long idLineaCategoriaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineacategoriaTemp=null;

			for(Linea lineacategoriaAux:lineacategoriasForeignKey) {
				if(lineacategoriaAux.getId()!=null && lineacategoriaAux.getId().equals(idLineaCategoriaSeleccionado)) {
					lineacategoriaTemp=lineacategoriaAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineacategoriaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaCategoriaForeignKeyGenerico(Long idLineaCategoriaSeleccionado,JComboBox jComboBoxid_linea_categoriaProductosPendientesGenerico)throws Exception
	{
		try
		{
			Linea  lineacategoriaTemp=null;

			for(Linea lineacategoriaAux:lineacategoriasForeignKey) {
				if(lineacategoriaAux.getId()!=null && lineacategoriaAux.getId().equals(idLineaCategoriaSeleccionado)) {
					lineacategoriaTemp=lineacategoriaAux;
					break;
				}
			}

			if(lineacategoriaTemp!=null) {
				jComboBoxid_linea_categoriaProductosPendientesGenerico.setSelectedItem(lineacategoriaTemp);
			} else {
				if(jComboBoxid_linea_categoriaProductosPendientesGenerico!=null && jComboBoxid_linea_categoriaProductosPendientesGenerico.getItemCount()>0) {
					jComboBoxid_linea_categoriaProductosPendientesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaMarcaForeignKey(Long idLineaMarcaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineamarcaTemp=null;

			for(Linea lineamarcaAux:lineamarcasForeignKey) {
				if(lineamarcaAux.getId()!=null && lineamarcaAux.getId().equals(idLineaMarcaSeleccionado)) {
					lineamarcaTemp=lineamarcaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineamarcaTemp!=null) {

					if(this.productospendientes!=null) {
						this.productospendientes.setLineaMarca(lineamarcaTemp);
					}

					if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
						this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_marcaProductosPendientes.setSelectedItem(lineamarcaTemp);
					}
				} else {
					//jComboBoxid_linea_marcaProductosPendientes.setSelectedItem(lineamarcaTemp);
					if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
						if(this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_marcaProductosPendientes.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_marcaProductosPendientes.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProductosPendientes") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineamarcaTemp!=null && jComboBoxid_linea_marcaBusquedaProductosPendientesProductosPendientes!=null) {
						jComboBoxid_linea_marcaBusquedaProductosPendientesProductosPendientes.setSelectedItem(lineamarcaTemp);
					} else {
						if(jComboBoxid_linea_marcaBusquedaProductosPendientesProductosPendientes!=null) {
							//jComboBoxid_linea_marcaBusquedaProductosPendientesProductosPendientes.setSelectedItem(lineamarcaTemp);
							if(jComboBoxid_linea_marcaBusquedaProductosPendientesProductosPendientes.getItemCount()>0) {
								jComboBoxid_linea_marcaBusquedaProductosPendientesProductosPendientes.setSelectedIndex(0);
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

	public String getActualLineaMarcaForeignKeyDescripcion(Long idLineaMarcaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineamarcaTemp=null;

			for(Linea lineamarcaAux:lineamarcasForeignKey) {
				if(lineamarcaAux.getId()!=null && lineamarcaAux.getId().equals(idLineaMarcaSeleccionado)) {
					lineamarcaTemp=lineamarcaAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineamarcaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaMarcaForeignKeyGenerico(Long idLineaMarcaSeleccionado,JComboBox jComboBoxid_linea_marcaProductosPendientesGenerico)throws Exception
	{
		try
		{
			Linea  lineamarcaTemp=null;

			for(Linea lineamarcaAux:lineamarcasForeignKey) {
				if(lineamarcaAux.getId()!=null && lineamarcaAux.getId().equals(idLineaMarcaSeleccionado)) {
					lineamarcaTemp=lineamarcaAux;
					break;
				}
			}

			if(lineamarcaTemp!=null) {
				jComboBoxid_linea_marcaProductosPendientesGenerico.setSelectedItem(lineamarcaTemp);
			} else {
				if(jComboBoxid_linea_marcaProductosPendientesGenerico!=null && jComboBoxid_linea_marcaProductosPendientesGenerico.getItemCount()>0) {
					jComboBoxid_linea_marcaProductosPendientesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ProductosPendientes productospendientes,JComboBox jComboBoxid_empresaProductosPendientesGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaProductosPendientesGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_empresaProductosPendientes.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaProductosPendientesGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				productospendientes.setid_empresa(empresaAux.getId());
				productospendientes.setempresa_descripcion(ProductosPendientesConstantesFunciones.getEmpresaDescripcion(empresaAux));
				productospendientes.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(ProductosPendientes productospendientes,JComboBox jComboBoxid_bodegaProductosPendientesGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaProductosPendientesGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_bodegaProductosPendientes.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaProductosPendientesGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				productospendientes.setid_bodega(bodegaAux.getId());
				productospendientes.setbodega_descripcion(ProductosPendientesConstantesFunciones.getBodegaDescripcion(bodegaAux));
				productospendientes.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaForeignKey(ProductosPendientes productospendientes,JComboBox jComboBoxid_lineaProductosPendientesGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_lineaProductosPendientesGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_lineaProductosPendientes.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_lineaProductosPendientesGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				productospendientes.setid_linea(lineaAux.getId());
				productospendientes.setlinea_descripcion(ProductosPendientesConstantesFunciones.getLineaDescripcion(lineaAux));
				productospendientes.setLinea(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaGrupoForeignKey(ProductosPendientes productospendientes,JComboBox jComboBoxid_linea_grupoProductosPendientesGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_grupoProductosPendientesGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_grupoProductosPendientes.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_grupoProductosPendientesGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				productospendientes.setid_linea_grupo(lineaAux.getId());
				productospendientes.setlineagrupo_descripcion(ProductosPendientesConstantesFunciones.getLineaGrupoDescripcion(lineaAux));
				productospendientes.setLineaGrupo(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaCategoriaForeignKey(ProductosPendientes productospendientes,JComboBox jComboBoxid_linea_categoriaProductosPendientesGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_categoriaProductosPendientesGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_categoriaProductosPendientes.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_categoriaProductosPendientesGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				productospendientes.setid_linea_categoria(lineaAux.getId());
				productospendientes.setlineacategoria_descripcion(ProductosPendientesConstantesFunciones.getLineaCategoriaDescripcion(lineaAux));
				productospendientes.setLineaCategoria(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaMarcaForeignKey(ProductosPendientes productospendientes,JComboBox jComboBoxid_linea_marcaProductosPendientesGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_marcaProductosPendientesGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_marcaProductosPendientes.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_marcaProductosPendientesGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				productospendientes.setid_linea_marca(lineaAux.getId());
				productospendientes.setlineamarca_descripcion(ProductosPendientesConstantesFunciones.getLineaMarcaDescripcion(lineaAux));
				productospendientes.setLineaMarca(lineaAux);			}
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

					if(!ProductosPendientesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosPendientes!=null) { 
							this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_empresaProductosPendientes.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_empresaProductosPendientes.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosPendientes!=null) { 
					}

					if(!ProductosPendientesJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductosPendientesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosPendientes!=null) { 
							this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_bodegaProductosPendientes.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_bodegaProductosPendientes.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosPendientes!=null) { 
					}

					if(!ProductosPendientesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProductosPendientes") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductosPendientesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaBusquedaProductosPendientesProductosPendientes.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaBusquedaProductosPendientesProductosPendientes.addItem(bodega);
							}
						}

						if(!ProductosPendientesJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProductosPendientesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosPendientes!=null) { 
							this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_lineaProductosPendientes.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_lineaProductosPendientes.addItem(linea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosPendientes!=null) { 
					}

					if(!ProductosPendientesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProductosPendientes") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductosPendientesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_lineaBusquedaProductosPendientesProductosPendientes.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jComboBoxid_lineaBusquedaProductosPendientesProductosPendientes.addItem(linea);
							}
						}

						if(!ProductosPendientesJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineaGruposForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProductosPendientesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosPendientes!=null) { 
							this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_grupoProductosPendientes.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_grupoProductosPendientes.addItem(lineagrupo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosPendientes!=null) { 
					}

					if(!ProductosPendientesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProductosPendientes") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductosPendientesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_grupoBusquedaProductosPendientesProductosPendientes.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jComboBoxid_linea_grupoBusquedaProductosPendientesProductosPendientes.addItem(lineagrupo);
							}
						}

						if(!ProductosPendientesJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineaCategoriasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProductosPendientesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosPendientes!=null) { 
							this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_categoriaProductosPendientes.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_categoriaProductosPendientes.addItem(lineacategoria);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosPendientes!=null) { 
					}

					if(!ProductosPendientesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProductosPendientes") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductosPendientesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_categoriaBusquedaProductosPendientesProductosPendientes.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jComboBoxid_linea_categoriaBusquedaProductosPendientesProductosPendientes.addItem(lineacategoria);
							}
						}

						if(!ProductosPendientesJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineaMarcasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProductosPendientesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosPendientes!=null) { 
							this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_marcaProductosPendientes.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_marcaProductosPendientes.addItem(lineamarca);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosPendientes!=null) { 
					}

					if(!ProductosPendientesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProductosPendientes") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductosPendientesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_marcaBusquedaProductosPendientesProductosPendientes.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jComboBoxid_linea_marcaBusquedaProductosPendientesProductosPendientes.addItem(lineamarca);
							}
						}

						if(!ProductosPendientesJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
							this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_empresaProductosPendientes.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
							this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_empresaProductosPendientes.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
							this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_bodegaProductosPendientes.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
							this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_bodegaProductosPendientes.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaBusquedaProductosPendientesProductosPendientes.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaBusquedaProductosPendientesProductosPendientes.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameLineaForeignKey(Linea linea,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
							this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_lineaProductosPendientes.setSelectedItem(linea);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
							this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_lineaProductosPendientes.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_lineaBusquedaProductosPendientesProductosPendientes.setSelectedItem(linea);
						} else {
							this.jComboBoxid_lineaBusquedaProductosPendientesProductosPendientes.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameLineaGrupoForeignKey(Linea lineagrupo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
							this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_grupoProductosPendientes.setSelectedItem(lineagrupo);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
							this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_grupoProductosPendientes.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_grupoBusquedaProductosPendientesProductosPendientes.setSelectedItem(lineagrupo);
						} else {
							this.jComboBoxid_linea_grupoBusquedaProductosPendientesProductosPendientes.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameLineaCategoriaForeignKey(Linea lineacategoria,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
							this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_categoriaProductosPendientes.setSelectedItem(lineacategoria);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
							this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_categoriaProductosPendientes.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_categoriaBusquedaProductosPendientesProductosPendientes.setSelectedItem(lineacategoria);
						} else {
							this.jComboBoxid_linea_categoriaBusquedaProductosPendientesProductosPendientes.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameLineaMarcaForeignKey(Linea lineamarca,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
							this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_marcaProductosPendientes.setSelectedItem(lineamarca);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
							this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_marcaProductosPendientes.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_marcaBusquedaProductosPendientesProductosPendientes.setSelectedItem(lineamarca);
						} else {
							this.jComboBoxid_linea_marcaBusquedaProductosPendientesProductosPendientes.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProductosPendientes() throws Exception {
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
		
	public ProductosPendientesParameterReturnGeneral getProductosPendientesParameterGeneral() {
		return this.productospendientesParameterGeneral;
	}
	
	public void setProductosPendientesParameterGeneral(ProductosPendientesParameterReturnGeneral productospendientesParameterGeneral) {
		this.productospendientesParameterGeneral = productospendientesParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProductosPendientes() {
		return isPermisoTodoProductosPendientes;
	}

	public void setIsPermisoTodoProductosPendientes(Boolean isPermisoTodoProductosPendientes) {
		this.isPermisoTodoProductosPendientes = isPermisoTodoProductosPendientes;
	}

	public Boolean getIsPermisoNuevoProductosPendientes() {
		return isPermisoNuevoProductosPendientes;
	}

	public void setIsPermisoNuevoProductosPendientes(Boolean isPermisoNuevoProductosPendientes) {
		this.isPermisoNuevoProductosPendientes = isPermisoNuevoProductosPendientes;
	}

	public Boolean getIsPermisoActualizarProductosPendientes() {
		return isPermisoActualizarProductosPendientes;
	}

	public void setIsPermisoActualizarProductosPendientes(Boolean isPermisoActualizarProductosPendientes) {
		this.isPermisoActualizarProductosPendientes = isPermisoActualizarProductosPendientes;
	}

	public Boolean getIsPermisoEliminarProductosPendientes() {
		return isPermisoEliminarProductosPendientes;
	}

	public void setIsPermisoEliminarProductosPendientes(Boolean isPermisoEliminarProductosPendientes) {
		this.isPermisoEliminarProductosPendientes = isPermisoEliminarProductosPendientes;
	}

	public Boolean getIsPermisoGuardarCambiosProductosPendientes() {
		return isPermisoGuardarCambiosProductosPendientes;
	}

	public void setIsPermisoGuardarCambiosProductosPendientes(Boolean isPermisoGuardarCambiosProductosPendientes) {
		this.isPermisoGuardarCambiosProductosPendientes = isPermisoGuardarCambiosProductosPendientes;
	}
	
	public Boolean getIsPermisoConsultaProductosPendientes() {
		return isPermisoConsultaProductosPendientes;
	}

	public void setIsPermisoConsultaProductosPendientes(Boolean isPermisoConsultaProductosPendientes) {
		this.isPermisoConsultaProductosPendientes = isPermisoConsultaProductosPendientes;
	}

	public Boolean getIsPermisoBusquedaProductosPendientes() {
		return isPermisoBusquedaProductosPendientes;
	}

	public void setIsPermisoBusquedaProductosPendientes(Boolean isPermisoBusquedaProductosPendientes) {
		this.isPermisoBusquedaProductosPendientes = isPermisoBusquedaProductosPendientes;
	}

	public Boolean getIsPermisoReporteProductosPendientes() {
		return isPermisoReporteProductosPendientes;
	}

	public void setIsPermisoReporteProductosPendientes(Boolean isPermisoReporteProductosPendientes) {
		this.isPermisoReporteProductosPendientes = isPermisoReporteProductosPendientes;
	}
	
	public Boolean getIsPermisoPaginacionMedioProductosPendientes() {
		return isPermisoPaginacionMedioProductosPendientes;
	}

	public void setIsPermisoPaginacionMedioProductosPendientes(Boolean isPermisoPaginacionMedioProductosPendientes) {
		this.isPermisoPaginacionMedioProductosPendientes = isPermisoPaginacionMedioProductosPendientes;
	}
	
	public Boolean getIsPermisoPaginacionTodoProductosPendientes() {
		return isPermisoPaginacionTodoProductosPendientes;
	}

	public void setIsPermisoPaginacionTodoProductosPendientes(Boolean isPermisoPaginacionTodoProductosPendientes) {
		this.isPermisoPaginacionTodoProductosPendientes = isPermisoPaginacionTodoProductosPendientes;
	}
	
	public Boolean getIsPermisoPaginacionAltoProductosPendientes() {
		return isPermisoPaginacionAltoProductosPendientes;
	}

	public void setIsPermisoPaginacionAltoProductosPendientes(Boolean isPermisoPaginacionAltoProductosPendientes) {
		this.isPermisoPaginacionAltoProductosPendientes = isPermisoPaginacionAltoProductosPendientes;
	}
	
	public Boolean getIsPermisoCopiarProductosPendientes() {
		return isPermisoCopiarProductosPendientes;
	}

	public void setIsPermisoCopiarProductosPendientes(Boolean isPermisoCopiarProductosPendientes) {
		this.isPermisoCopiarProductosPendientes = isPermisoCopiarProductosPendientes;
	}
	
	public Boolean getIsPermisoVerFormProductosPendientes() {
		return isPermisoVerFormProductosPendientes;
	}

	public void setIsPermisoVerFormProductosPendientes(Boolean isPermisoVerFormProductosPendientes) {
		this.isPermisoVerFormProductosPendientes = isPermisoVerFormProductosPendientes;
	}
	
	public Boolean getIsPermisoDuplicarProductosPendientes() {
		return isPermisoDuplicarProductosPendientes;
	}

	public void setIsPermisoDuplicarProductosPendientes(Boolean isPermisoDuplicarProductosPendientes) {
		this.isPermisoDuplicarProductosPendientes = isPermisoDuplicarProductosPendientes;
	}
	
	public Boolean getIsPermisoOrdenProductosPendientes() {
		return isPermisoOrdenProductosPendientes;
	}

	public void setIsPermisoOrdenProductosPendientes(Boolean isPermisoOrdenProductosPendientes) {
		this.isPermisoOrdenProductosPendientes = isPermisoOrdenProductosPendientes;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProductosPendientes() {
		return isVisibilidadCeldaNuevoProductosPendientes;
	}

	public void setIsVisibilidadCeldaNuevoProductosPendientes(Boolean isVisibilidadCeldaNuevoProductosPendientes) {
		this.isVisibilidadCeldaNuevoProductosPendientes = isVisibilidadCeldaNuevoProductosPendientes;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProductosPendientes() {
		return isVisibilidadCeldaDuplicarProductosPendientes;
	}

	public void setIsVisibilidadCeldaDuplicarProductosPendientes(Boolean isVisibilidadCeldaDuplicarProductosPendientes) {
		this.isVisibilidadCeldaDuplicarProductosPendientes = isVisibilidadCeldaDuplicarProductosPendientes;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProductosPendientes() {
		return isVisibilidadCeldaCopiarProductosPendientes;
	}

	public void setIsVisibilidadCeldaCopiarProductosPendientes(Boolean isVisibilidadCeldaCopiarProductosPendientes) {
		this.isVisibilidadCeldaCopiarProductosPendientes = isVisibilidadCeldaCopiarProductosPendientes;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProductosPendientes() {
		return isVisibilidadCeldaVerFormProductosPendientes;
	}

	public void setIsVisibilidadCeldaVerFormProductosPendientes(Boolean isVisibilidadCeldaVerFormProductosPendientes) {
		this.isVisibilidadCeldaVerFormProductosPendientes = isVisibilidadCeldaVerFormProductosPendientes;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProductosPendientes() {
		return isVisibilidadCeldaOrdenProductosPendientes;
	}

	public void setIsVisibilidadCeldaOrdenProductosPendientes(Boolean isVisibilidadCeldaOrdenProductosPendientes) {
		this.isVisibilidadCeldaOrdenProductosPendientes = isVisibilidadCeldaOrdenProductosPendientes;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProductosPendientes() {
		return isVisibilidadCeldaNuevoRelacionesProductosPendientes;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProductosPendientes(Boolean isVisibilidadCeldaNuevoRelacionesProductosPendientes) {
		this.isVisibilidadCeldaNuevoRelacionesProductosPendientes = isVisibilidadCeldaNuevoRelacionesProductosPendientes;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProductosPendientes() {
		return isVisibilidadCeldaModificarProductosPendientes;
	}

	public void setIsVisibilidadCeldaModificarProductosPendientes(Boolean isVisibilidadCeldaModificarProductosPendientes) {
		this.isVisibilidadCeldaModificarProductosPendientes = isVisibilidadCeldaModificarProductosPendientes;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProductosPendientes() {
		return isVisibilidadCeldaActualizarProductosPendientes;
	}

	public void setIsVisibilidadCeldaActualizarProductosPendientes(Boolean isVisibilidadCeldaActualizarProductosPendientes) {
		this.isVisibilidadCeldaActualizarProductosPendientes = isVisibilidadCeldaActualizarProductosPendientes;
	}

	public Boolean getIsVisibilidadCeldaEliminarProductosPendientes() {
		return isVisibilidadCeldaEliminarProductosPendientes;
	}

	public void setIsVisibilidadCeldaEliminarProductosPendientes(Boolean isVisibilidadCeldaEliminarProductosPendientes) {
		this.isVisibilidadCeldaEliminarProductosPendientes = isVisibilidadCeldaEliminarProductosPendientes;
	}

	public Boolean getIsVisibilidadCeldaCancelarProductosPendientes() {
		return isVisibilidadCeldaCancelarProductosPendientes;
	}

	public void setIsVisibilidadCeldaCancelarProductosPendientes(Boolean isVisibilidadCeldaCancelarProductosPendientes) {
		this.isVisibilidadCeldaCancelarProductosPendientes = isVisibilidadCeldaCancelarProductosPendientes;
	}

	public Boolean getIsVisibilidadCeldaGuardarProductosPendientes() {
		return isVisibilidadCeldaGuardarProductosPendientes;
	}

	public void setIsVisibilidadCeldaGuardarProductosPendientes(Boolean isVisibilidadCeldaGuardarProductosPendientes) {
		this.isVisibilidadCeldaGuardarProductosPendientes = isVisibilidadCeldaGuardarProductosPendientes;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProductosPendientes() {
		return isVisibilidadCeldaGuardarCambiosProductosPendientes;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProductosPendientes(Boolean isVisibilidadCeldaGuardarCambiosProductosPendientes) {
		this.isVisibilidadCeldaGuardarCambiosProductosPendientes = isVisibilidadCeldaGuardarCambiosProductosPendientes;
	}
		
	public ProductosPendientesSessionBean getproductospendientesSessionBean() {
		return this.productospendientesSessionBean;
	}
	
	public void setproductospendientesSessionBean(ProductosPendientesSessionBean productospendientesSessionBean) {
		this.productospendientesSessionBean=productospendientesSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaProductosPendientes() {
		return this.isVisibilidadBusquedaProductosPendientes;
	}

	public void setisVisibilidadBusquedaProductosPendientes(Boolean isVisibilidadBusquedaProductosPendientes) {
		this.isVisibilidadBusquedaProductosPendientes=isVisibilidadBusquedaProductosPendientes;
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

	public Boolean getisVisibilidadFK_IdLinea() {
		return this.isVisibilidadFK_IdLinea;
	}

	public void setisVisibilidadFK_IdLinea(Boolean isVisibilidadFK_IdLinea) {
		this.isVisibilidadFK_IdLinea=isVisibilidadFK_IdLinea;
	}

	public Boolean getisVisibilidadFK_IdLineaCategoria() {
		return this.isVisibilidadFK_IdLineaCategoria;
	}

	public void setisVisibilidadFK_IdLineaCategoria(Boolean isVisibilidadFK_IdLineaCategoria) {
		this.isVisibilidadFK_IdLineaCategoria=isVisibilidadFK_IdLineaCategoria;
	}

	public Boolean getisVisibilidadFK_IdLineaGrupo() {
		return this.isVisibilidadFK_IdLineaGrupo;
	}

	public void setisVisibilidadFK_IdLineaGrupo(Boolean isVisibilidadFK_IdLineaGrupo) {
		this.isVisibilidadFK_IdLineaGrupo=isVisibilidadFK_IdLineaGrupo;
	}

	public Boolean getisVisibilidadFK_IdLineaMarca() {
		return this.isVisibilidadFK_IdLineaMarca;
	}

	public void setisVisibilidadFK_IdLineaMarca(Boolean isVisibilidadFK_IdLineaMarca) {
		this.isVisibilidadFK_IdLineaMarca=isVisibilidadFK_IdLineaMarca;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(ProductosPendientes productospendientes)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(productospendientes,null);
				this.setActualParaGuardarBodegaForeignKey(productospendientes,null);
				this.setActualParaGuardarLineaForeignKey(productospendientes,null);
				this.setActualParaGuardarLineaGrupoForeignKey(productospendientes,null);
				this.setActualParaGuardarLineaCategoriaForeignKey(productospendientes,null);
				this.setActualParaGuardarLineaMarcaForeignKey(productospendientes,null);
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
	
	public void bugActualizarReferenciaActual(ProductosPendientes productospendientes,ProductosPendientes productospendientesAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProductosPendientes(productospendientes);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		productospendientesAux.setId(productospendientes.getId());
		productospendientesAux.setVersionRow(productospendientes.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProductosPendientes productospendientesLocal) throws Exception {
		
		if(this.productospendientesSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProductosPendientes productospendientesLocal) throws Exception {	
		if(this.productospendientesSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				productospendientesLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				productospendientesLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineaBeanSwingJInternalFrameLocal.actualizarLista(lineaBeanSwingJInternalFrameLocal.linea,this.lineasForeignKey);

				lineaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineaBeanSwingJInternalFrameLocal.linea);

				productospendientesLocal.setLinea(lineaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey("Formulario");
				this.setActualLineaForeignKey(lineaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineagrupoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineagrupoBeanSwingJInternalFrameLocal.getlinea(),true);
				lineagrupoBeanSwingJInternalFrameLocal.actualizarLista(lineagrupoBeanSwingJInternalFrameLocal.linea,this.lineagruposForeignKey);

				lineagrupoBeanSwingJInternalFrameLocal.actualizarRelaciones(lineagrupoBeanSwingJInternalFrameLocal.linea);

				productospendientesLocal.setLineaGrupo(lineagrupoBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey("Formulario");
				this.setActualLineaGrupoForeignKey(lineagrupoBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineacategoriaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineacategoriaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineacategoriaBeanSwingJInternalFrameLocal.actualizarLista(lineacategoriaBeanSwingJInternalFrameLocal.linea,this.lineacategoriasForeignKey);

				lineacategoriaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				productospendientesLocal.setLineaCategoria(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaCategoria();
				this.cargarCombosFrameLineaCategoriasForeignKey("Formulario");
				this.setActualLineaCategoriaForeignKey(lineacategoriaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineamarcaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineamarcaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineamarcaBeanSwingJInternalFrameLocal.actualizarLista(lineamarcaBeanSwingJInternalFrameLocal.linea,this.lineamarcasForeignKey);

				lineamarcaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineamarcaBeanSwingJInternalFrameLocal.linea);

				productospendientesLocal.setLineaMarca(lineamarcaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaMarca();
				this.cargarCombosFrameLineaMarcasForeignKey("Formulario");
				this.setActualLineaMarcaForeignKey(lineamarcaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProductosPendientesActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProductosPendientes.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productospendientes =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.productospendientes =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = productospendientesValidator.getInvalidValues(this.productospendientes);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProductosPendientes productospendientes,List<ProductosPendientes> productospendientess) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProductosPendientes productospendientes,List<ProductosPendientes> productospendientess) throws Exception {
		try	{			
			ProductosPendientesConstantesFunciones.actualizarSelectedLista(productospendientes,productospendientess);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProductosPendientes> productospendientessLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				productospendientessLocal=this.productospendientesLogic.getProductosPendientess();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				productospendientessLocal=this.productospendientess;
			}
			//ARCHITECTURE
		
			for(ProductosPendientes productospendientesLocal:productospendientessLocal) {
				if(this.permiteMantenimiento(productospendientesLocal) && productospendientesLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProductosPendientesConstantesFunciones.getProductosPendientesLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProductosPendientesConstantesFunciones.NOMBREEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosPendientes.jLabelnombre_empresaProductosPendientes,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosPendientesConstantesFunciones.RUCEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosPendientes.jLabelruc_empresaProductosPendientes,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosPendientesConstantesFunciones.NOMBREPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosPendientes.jLabelnombre_productoProductosPendientes,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosPendientesConstantesFunciones.NOMBREUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosPendientes.jLabelnombre_unidadProductosPendientes,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosPendientesConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosPendientes.jLabelcantidadProductosPendientes,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosPendientesConstantesFunciones.PRECIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosPendientes.jLabelprecioProductosPendientes,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosPendientesConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosPendientes.jLabeltotalProductosPendientes,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosPendientesConstantesFunciones.CODIGOPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosPendientes.jLabelcodigo_productoProductosPendientes,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosPendientes.jLabelnombre_empresaProductosPendientes,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosPendientes.jLabelruc_empresaProductosPendientes,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosPendientes.jLabelnombre_productoProductosPendientes,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosPendientes.jLabelnombre_unidadProductosPendientes,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosPendientes.jLabelcantidadProductosPendientes,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosPendientes.jLabelprecioProductosPendientes,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosPendientes.jLabeltotalProductosPendientes,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosPendientes.jLabelcodigo_productoProductosPendientes,"");
		
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
		this.iIdNuevoProductosPendientes--;	
		
		
		this.productospendientesAux=new ProductosPendientes();
		
		this.productospendientesAux.setId(this.iIdNuevoProductosPendientes);
		this.productospendientesAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productospendientesLogic.getProductosPendientess().add(this.productospendientesAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.productospendientess.add(this.productospendientesAux);
		}
		//ARCHITECTURE
		
		this.productospendientes=this.productospendientesAux;
		
		if(ProductosPendientesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProductosPendientes(this.productospendientes);
			this.setVariablesObjetoActualToFormularioForeignKeyProductosPendientes(this.productospendientes);
		}
				
		//this.setDefaultControlesProductosPendientes();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProductosPendientes();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProductosPendientes();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductosPendientes();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductosPendientes(this.productospendientesBean,this.productospendientes,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProductosPendientes(this.productospendientesReturnGeneral,this.productospendientesBean,false);
		
		if(this.productospendientesReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProductosPendientes(this.productospendientesReturnGeneral.getProductosPendientes());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProductosPendientes(this.productospendientesReturnGeneral.getProductosPendientes());
		}
		
		if(this.productospendientesReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProductosPendientes(this.productospendientesReturnGeneral.getProductosPendientes(),classes);//this.productospendientesBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProductosPendientes(this.productospendientes,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProductosPendientes();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProductosPendientes();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductosPendientesBeanSwingJInternalFrameAdditional.RecargarFormProductosPendientes(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProductosPendientes(false);
						
			if(productospendientesSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProductosPendientesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductosPendientes();
			}
			
			this.actualizarVisualTableDatosProductosPendientes();
			
			this.jTableDatosProductosPendientes.setRowSelectionInterval(this.getIndiceNuevoProductosPendientes(), this.getIndiceNuevoProductosPendientes());
			
			this.seleccionarFilaTablaProductosPendientesActual();
						
			this.actualizarEstadoCeldasBotonesProductosPendientes("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProductosPendientes(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProductosPendientes.jDateChooserfecha_emision_desdeProductosPendientes.setEnabled(isHabilitar && this.productospendientesConstantesFunciones.activarfecha_emision_desdeProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jDateChooserfecha_emision_hastaProductosPendientes.setEnabled(isHabilitar && this.productospendientesConstantesFunciones.activarfecha_emision_hastaProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jTextAreanombre_empresaProductosPendientes.setEnabled(isHabilitar && this.productospendientesConstantesFunciones.activarnombre_empresaProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jTextFieldruc_empresaProductosPendientes.setEnabled(isHabilitar && this.productospendientesConstantesFunciones.activarruc_empresaProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jTextAreanombre_productoProductosPendientes.setEnabled(isHabilitar && this.productospendientesConstantesFunciones.activarnombre_productoProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jTextFieldnombre_unidadProductosPendientes.setEnabled(isHabilitar && this.productospendientesConstantesFunciones.activarnombre_unidadProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jTextFieldcantidadProductosPendientes.setEnabled(isHabilitar && this.productospendientesConstantesFunciones.activarcantidadProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jTextFieldprecioProductosPendientes.setEnabled(isHabilitar && this.productospendientesConstantesFunciones.activarprecioProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jTextFieldtotalProductosPendientes.setEnabled(isHabilitar && this.productospendientesConstantesFunciones.activartotalProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jTextFieldcodigo_productoProductosPendientes.setEnabled(isHabilitar && this.productospendientesConstantesFunciones.activarcodigo_productoProductosPendientes);	
		//
		this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_empresaProductosPendientes.setEnabled(isHabilitar && this.productospendientesConstantesFunciones.activarid_empresaProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_bodegaProductosPendientes.setEnabled(isHabilitar && this.productospendientesConstantesFunciones.activarid_bodegaProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_lineaProductosPendientes.setEnabled(isHabilitar && this.productospendientesConstantesFunciones.activarid_lineaProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_grupoProductosPendientes.setEnabled(isHabilitar && this.productospendientesConstantesFunciones.activarid_linea_grupoProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_categoriaProductosPendientes.setEnabled(isHabilitar && this.productospendientesConstantesFunciones.activarid_linea_categoriaProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_marcaProductosPendientes.setEnabled(isHabilitar && this.productospendientesConstantesFunciones.activarid_linea_marcaProductosPendientes);
	};
	
	public void setDefaultControlesProductosPendientes() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProductosPendientes(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.productospendientesSessionBean.setConGuardarRelaciones(true);			
			this.productospendientesSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProductosPendientes.jTabbedPaneRelacionesProductosPendientes.setVisible(true);
			
					
		} else {
			//this.productospendientesSessionBean.setConGuardarRelaciones(false);			
			this.productospendientesSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProductosPendientes.jTabbedPaneRelacionesProductosPendientes.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProductosPendientes() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductosPendientes productospendientesAux:this.productospendientesLogic.getProductosPendientess()) {
				if(productospendientesAux.getId().equals(this.iIdNuevoProductosPendientes)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductosPendientes productospendientesAux:this.productospendientess) {
				if(productospendientesAux.getId().equals(this.iIdNuevoProductosPendientes)) {
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
	
	public int getIndiceActualProductosPendientes(ProductosPendientes productospendientes,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductosPendientes productospendientesAux:this.productospendientesLogic.getProductosPendientess()) {
				if(productospendientesAux.getId().equals(productospendientes.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductosPendientes productospendientesAux:this.productospendientess) {
				if(productospendientesAux.getId().equals(productospendientes.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProductosPendientes(ProductosPendientes productospendientesOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductosPendientes productospendientesAux:this.productospendientesLogic.getProductosPendientess()) {
				if(productospendientesAux.getProductosPendientesOriginal().getId().equals(productospendientesOriginal.getId())) {
					existe=true;
					productospendientesOriginal.setId(productospendientesAux.getId());
					productospendientesOriginal.setVersionRow(productospendientesAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductosPendientes productospendientesAux:this.productospendientess) {
				if(productospendientesAux.getProductosPendientesOriginal().getId().equals(productospendientesOriginal.getId())) {
					existe=true;
					productospendientesOriginal.setId(productospendientesAux.getId());
					productospendientesOriginal.setVersionRow(productospendientesAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProductosPendientes(Boolean esParaCancelar) throws Exception {
		productospendientessAux=new ArrayList<ProductosPendientes>();
		productospendientesAux=new ProductosPendientes();
		
		if(!this.productospendientesSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductosPendientes productospendientesAux:this.productospendientesLogic.getProductosPendientess()) {
					if(productospendientesAux.getId()<0) {
						productospendientessAux.add(productospendientesAux);
					}		
				}
				this.iIdNuevoProductosPendientes=0L;
				this.productospendientesLogic.getProductosPendientess().removeAll(productospendientessAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductosPendientes productospendientesAux:this.productospendientess) {
					if(productospendientesAux.getId()<0) {
						productospendientessAux.add(productospendientesAux);
					}		
				}
				this.iIdNuevoProductosPendientes=0L;
				this.productospendientess.removeAll(productospendientessAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProductosPendientes 
					&& this.productospendientesLogic.getProductosPendientess().size()>0
					) {
					productospendientesAux=this.productospendientesLogic.getProductosPendientess().get(this.productospendientesLogic.getProductosPendientess().size() - 1);
				
					if(productospendientesAux.getId()<0) {
						this.productospendientesLogic.getProductosPendientess().remove(productospendientesAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProductosPendientes && this.productospendientess.size()>0) {
					productospendientesAux=this.productospendientess.get(this.productospendientess.size() - 1);
				
					if(productospendientesAux.getId()<0) {
						this.productospendientess.remove(productospendientesAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProductosPendientes(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(productospendientes.getId()<0) {
				this.productospendientesLogic.getProductosPendientess().remove(this.productospendientes);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(productospendientes.getId()<0) {
				this.productospendientess.remove(this.productospendientes);
			}
		}			
	}
	
	public void setEstadosInicialesProductosPendientes(List<ProductosPendientes> productospendientessAux) throws Exception {
		ProductosPendientesConstantesFunciones.setEstadosInicialesProductosPendientes(productospendientessAux);
	}
	
	public void setEstadosInicialesProductosPendientes(ProductosPendientes productospendientesAux) throws Exception {
		ProductosPendientesConstantesFunciones.setEstadosInicialesProductosPendientes(productospendientesAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProductosPendientesActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProductosPendientes("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProductosPendientesActual()) {
				if(!this.isEsNuevoProductosPendientes) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProductosPendientes("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProductosPendientes=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProductosPendientesActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Productos Pendientes ?", "MANTENIMIENTO DE Productos Pendientes", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProductosPendientes("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProductosPendientes productospendientes) throws Exception {
		ProductosPendientesConstantesFunciones.seleccionarAsignar(this.productospendientes,productospendientes);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProductosPendientes=this.isPermisoActualizarOriginalProductosPendientes;
			
			
			this.seleccionarAsignar(productospendientes);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProductosPendientes("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.productospendientesSessionBean.setsFuncionBusquedaRapida(this.productospendientesSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProductosPendientes) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProductosPendientes(esParaCancelar);				
				this.cancelarNuevoProductosPendientes(esParaCancelar);								
			}
			
			this.productospendientes=new ProductosPendientes();
			
			this.inicializarProductosPendientes();
			
			this.actualizarEstadoCeldasBotonesProductosPendientes("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProductosPendientes() throws Exception {
		try {
			ProductosPendientesConstantesFunciones.inicializarProductosPendientes(this.productospendientes);
			
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
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.productospendientesLogic.getProductosPendientess().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProductosPendientess(String sAccionBusqueda,List<ProductosPendientes> productospendientessParaReportes) throws Exception {
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
					sPathReporteFinal="ProductosPendientes"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProductosPendientesMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProductosPendientesMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProductosPendientes"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Productos Pendienteses");		
		parameters.put("busquedapor", ProductosPendientesConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProductosPendientes=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProductosPendientesConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProductosPendientesConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProductosPendientes=new JRBeanArrayDataSource(ProductosPendientesJInternalFrame.TraerProductosPendientesBeans(productospendientessParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProductosPendientes);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProductosPendientesConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProductosPendientesConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProductosPendientesBean.TraerProductosPendientesBeans(productospendientessParaReportes).toArray()));
							
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
				this.generarExcelReporteProductosPendientess(sAccionBusqueda,sTipoArchivoReporte,productospendientessParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProductosPendientess(sAccionBusqueda,sTipoArchivoReporte,productospendientessParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProductosPendientesActionPerformed(null);
					//this.generarExcelReporteProductosPendientess(sAccionBusqueda,sTipoArchivoReporte,productospendientessParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProductosPendientess(sAccionBusqueda,sTipoArchivoReporte,productospendientessParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProductosPendientess(sAccionBusqueda,sTipoArchivoReporte,productospendientessParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProductosPendientess(sAccionBusqueda,sTipoArchivoReporte,productospendientessParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProductosPendientess(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductosPendientes> productospendientessParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productospendientes";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductosPendientess");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductosPendientes("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProductosPendientes productospendientes : productospendientessParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProductosPendientesConstantesFunciones.generarExcelReporteDataProductosPendientes("NORMAL",row,workbook,productospendientes,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productospendientesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Pendientes",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProductosPendientes(String sTipo,Row row,Workbook workbook) {
		
		ProductosPendientesConstantesFunciones.generarExcelReporteHeaderProductosPendientes(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProductosPendientess(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductosPendientes> productospendientessParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productospendientes_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductosPendientess");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProductosPendientes productospendientes : productospendientessParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProductosPendientesConstantesFunciones.getProductosPendientesDescripcion(productospendientes));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosPendientesConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productospendientes.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosPendientesConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productospendientes.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosPendientesConstantesFunciones.LABEL_IDLINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_IDLINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productospendientes.getlinea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosPendientesConstantesFunciones.LABEL_IDLINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_IDLINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productospendientes.getlineagrupo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosPendientesConstantesFunciones.LABEL_IDLINEACATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_IDLINEACATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productospendientes.getlineacategoria_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosPendientesConstantesFunciones.LABEL_IDLINEAMARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_IDLINEAMARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productospendientes.getlineamarca_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosPendientesConstantesFunciones.LABEL_FECHAEMISIONDESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_FECHAEMISIONDESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productospendientes.getfecha_emision_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosPendientesConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productospendientes.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosPendientesConstantesFunciones.LABEL_NOMBREEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_NOMBREEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productospendientes.getnombre_empresa());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosPendientesConstantesFunciones.LABEL_RUCEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_RUCEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productospendientes.getruc_empresa());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosPendientesConstantesFunciones.LABEL_NOMBREPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_NOMBREPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productospendientes.getnombre_producto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosPendientesConstantesFunciones.LABEL_NOMBREUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_NOMBREUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productospendientes.getnombre_unidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosPendientesConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productospendientes.getcantidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosPendientesConstantesFunciones.LABEL_PRECIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_PRECIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productospendientes.getprecio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosPendientesConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productospendientes.gettotal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosPendientesConstantesFunciones.LABEL_CODIGOPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_CODIGOPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productospendientes.getcodigo_producto());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productospendientesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Pendientes",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProductosPendientess(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductosPendientes> productospendientessParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProductosPendientes> productospendientessRespaldo=null;
		
		classes=ProductosPendientesConstantesFunciones.getClassesRelationshipsOfProductosPendientes(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.productospendientesLogic.setDatosCliente(this.datosCliente);
		this.productospendientesLogic.setDatosDeep(this.datosDeep);
		this.productospendientesLogic.setIsConDeep(true);
		
		productospendientessRespaldo=this.productospendientesLogic.getProductosPendientess();
		
		this.productospendientesLogic.setProductosPendientess(productospendientessParaReportes);	
		this.productospendientesLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		productospendientessParaReportes=this.productospendientesLogic.getProductosPendientess();
		this.productospendientesLogic.setProductosPendientess(productospendientessRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productospendientes_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductosPendientess");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductosPendientes("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProductosPendientes productospendientes : productospendientessParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProductosPendientes("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProductosPendientesConstantesFunciones.generarExcelReporteDataProductosPendientes("NORMAL",row,workbook,productospendientes,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProductosPendientesConstantesFunciones.getProductosPendientesDescripcion(productospendientes));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productospendientesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Pendientes",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductosPendientes.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductosPendientes.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductosPendientes.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductosPendientes.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProductosPendientes() throws Exception {		
		this.startProcessProductosPendientes(true);
	}
	
	public void startProcessProductosPendientes(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProductosPendientes ,this.jPanelParametrosReportesProductosPendientes, this.jScrollPanelDatosProductosPendientes,this.jPanelPaginacionProductosPendientes, this.jScrollPanelDatosEdicionProductosPendientes, this.jPanelAccionesProductosPendientes,this.jPanelAccionesFormularioProductosPendientes,this.jmenuBarProductosPendientes,this.jmenuBarDetalleProductosPendientes,this.jTtoolBarProductosPendientes,this.jTtoolBarDetalleProductosPendientes);		
		
		final JTabbedPane jTabbedPaneBusquedasProductosPendientes=this.jTabbedPaneBusquedasProductosPendientes; 
		
		final JPanel jPanelParametrosReportesProductosPendientes=this.jPanelParametrosReportesProductosPendientes;
		//final JScrollPane jScrollPanelDatosProductosPendientes=this.jScrollPanelDatosProductosPendientes;
		final JTable jTableDatosProductosPendientes=this.jTableDatosProductosPendientes;		
		final JPanel jPanelPaginacionProductosPendientes=this.jPanelPaginacionProductosPendientes;
		//final JScrollPane jScrollPanelDatosEdicionProductosPendientes=this.jScrollPanelDatosEdicionProductosPendientes;
		final JPanel jPanelAccionesProductosPendientes=this.jPanelAccionesProductosPendientes;
		
		JPanel jPanelCamposAuxiliarProductosPendientes=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProductosPendientes=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
			jPanelCamposAuxiliarProductosPendientes=this.jInternalFrameDetalleFormProductosPendientes.jPanelCamposProductosPendientes;
			jPanelAccionesFormularioAuxiliarProductosPendientes=this.jInternalFrameDetalleFormProductosPendientes.jPanelAccionesFormularioProductosPendientes;
		}
		
		final JPanel jPanelCamposProductosPendientes=jPanelCamposAuxiliarProductosPendientes;
		final JPanel jPanelAccionesFormularioProductosPendientes=jPanelAccionesFormularioAuxiliarProductosPendientes;
		
		
		final JMenuBar jmenuBarProductosPendientes=this.jmenuBarProductosPendientes;
		final JToolBar jTtoolBarProductosPendientes=this.jTtoolBarProductosPendientes;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProductosPendientes=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductosPendientes=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
			jmenuBarDetalleAuxiliarProductosPendientes=this.jInternalFrameDetalleFormProductosPendientes.jmenuBarDetalleProductosPendientes;
			jTtoolBarDetalleAuxiliarProductosPendientes=this.jInternalFrameDetalleFormProductosPendientes.jTtoolBarDetalleProductosPendientes;
		}
		
		final JMenuBar jmenuBarDetalleProductosPendientes=jmenuBarDetalleAuxiliarProductosPendientes;
		final JToolBar jTtoolBarDetalleProductosPendientes=jTtoolBarDetalleAuxiliarProductosPendientes;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductosPendientes;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductosPendientes;
			processRunnable.jTableDatos=jTableDatosProductosPendientes;
			processRunnable.jPanelCampos=jPanelCamposProductosPendientes;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductosPendientes;
			processRunnable.jPanelAcciones=jPanelAccionesProductosPendientes;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductosPendientes;
			
			
			processRunnable.jmenuBar=jmenuBarProductosPendientes;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductosPendientes;
			processRunnable.jTtoolBar=jTtoolBarProductosPendientes;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductosPendientes;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductosPendientes ,jPanelParametrosReportesProductosPendientes,jTableDatosProductosPendientes, /*jScrollPanelDatosProductosPendientes,*/jPanelCamposProductosPendientes,jPanelPaginacionProductosPendientes, /*jScrollPanelDatosEdicionProductosPendientes,*/ jPanelAccionesProductosPendientes,jPanelAccionesFormularioProductosPendientes,jmenuBarProductosPendientes,jmenuBarDetalleProductosPendientes,jTtoolBarProductosPendientes,jTtoolBarDetalleProductosPendientes);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductosPendientes ,jPanelParametrosReportesProductosPendientes, jScrollPanelDatosProductosPendientes,jPanelPaginacionProductosPendientes, jScrollPanelDatosEdicionProductosPendientes, jPanelAccionesProductosPendientes,jPanelAccionesFormularioProductosPendientes,jmenuBarProductosPendientes,jmenuBarDetalleProductosPendientes,jTtoolBarProductosPendientes,jTtoolBarDetalleProductosPendientes);
						
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
	
	public void finishProcessProductosPendientes() {// throws Exception 
		this.finishProcessProductosPendientes(true);
	}
	
	public void finishProcessProductosPendientes(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProductosPendientes ,this.jPanelParametrosReportesProductosPendientes, this.jScrollPanelDatosProductosPendientes,this.jPanelPaginacionProductosPendientes, this.jScrollPanelDatosEdicionProductosPendientes, this.jPanelAccionesProductosPendientes,this.jPanelAccionesFormularioProductosPendientes,this.jmenuBarProductosPendientes,this.jmenuBarDetalleProductosPendientes,this.jTtoolBarProductosPendientes,this.jTtoolBarDetalleProductosPendientes);		
		
		final JTabbedPane jTabbedPaneBusquedasProductosPendientes=this.jTabbedPaneBusquedasProductosPendientes; 
		
		final JPanel jPanelParametrosReportesProductosPendientes=this.jPanelParametrosReportesProductosPendientes;
		//final JScrollPane jScrollPanelDatosProductosPendientes=this.jScrollPanelDatosProductosPendientes;
		final JTable jTableDatosProductosPendientes=this.jTableDatosProductosPendientes;		
		final JPanel jPanelPaginacionProductosPendientes=this.jPanelPaginacionProductosPendientes;
		//final JScrollPane jScrollPanelDatosEdicionProductosPendientes=this.jScrollPanelDatosEdicionProductosPendientes;
		final JPanel jPanelAccionesProductosPendientes=this.jPanelAccionesProductosPendientes;
		
		JPanel jPanelCamposAuxiliarProductosPendientes=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProductosPendientes=new JPanel();
		
		if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
			jPanelCamposAuxiliarProductosPendientes=this.jInternalFrameDetalleFormProductosPendientes.jPanelCamposProductosPendientes;
			jPanelAccionesFormularioAuxiliarProductosPendientes=this.jInternalFrameDetalleFormProductosPendientes.jPanelAccionesFormularioProductosPendientes;
		}
		
		final JPanel jPanelCamposProductosPendientes=jPanelCamposAuxiliarProductosPendientes;
		final JPanel jPanelAccionesFormularioProductosPendientes=jPanelAccionesFormularioAuxiliarProductosPendientes;
		
		
		final JMenuBar jmenuBarProductosPendientes=this.jmenuBarProductosPendientes;		
		final JToolBar jTtoolBarProductosPendientes=this.jTtoolBarProductosPendientes;
				
		JMenuBar jmenuBarDetalleAuxiliarProductosPendientes=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductosPendientes=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
			jmenuBarDetalleAuxiliarProductosPendientes=this.jInternalFrameDetalleFormProductosPendientes.jmenuBarDetalleProductosPendientes;
			jTtoolBarDetalleAuxiliarProductosPendientes=this.jInternalFrameDetalleFormProductosPendientes.jTtoolBarDetalleProductosPendientes;		
		}
		
		final JMenuBar jmenuBarDetalleProductosPendientes=jmenuBarDetalleAuxiliarProductosPendientes;
		final JToolBar jTtoolBarDetalleProductosPendientes=jTtoolBarDetalleAuxiliarProductosPendientes;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductosPendientes;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductosPendientes;
			processRunnable.jTableDatos=jTableDatosProductosPendientes;
			processRunnable.jPanelCampos=jPanelCamposProductosPendientes;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductosPendientes;
			processRunnable.jPanelAcciones=jPanelAccionesProductosPendientes;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductosPendientes;
			
			
			processRunnable.jmenuBar=jmenuBarProductosPendientes;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductosPendientes;
			processRunnable.jTtoolBar=jTtoolBarProductosPendientes;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductosPendientes;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProductosPendientes ,jPanelParametrosReportesProductosPendientes, jTableDatosProductosPendientes,/*jScrollPanelDatosProductosPendientes,*/jPanelCamposProductosPendientes,jPanelPaginacionProductosPendientes, /*jScrollPanelDatosEdicionProductosPendientes,*/ jPanelAccionesProductosPendientes,jPanelAccionesFormularioProductosPendientes,jmenuBarProductosPendientes,jmenuBarDetalleProductosPendientes,jTtoolBarProductosPendientes,jTtoolBarDetalleProductosPendientes));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProductosPendientes(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProductosPendientes(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProductosPendientes(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProductosPendientes(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProductosPendientes,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProductosPendientes,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProductosPendientes(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProductosPendientes,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProductosPendientes,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.productospendientesConstantesFunciones.getsFinalQueryProductosPendientes();
		String  finalQueryPaginacionTodos=this.productospendientesConstantesFunciones.getsFinalQueryProductosPendientes();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProductosPendientesConstantesFunciones.getArrayColumnasGlobalesNoProductosPendientes(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProductosPendientesConstantesFunciones.getArrayColumnasGlobalesProductosPendientes(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProductosPendientesConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.productospendientessEliminados= new ArrayList<ProductosPendientes>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProductosPendientes();
		
				///*ProductosPendientesSessionBean*/this.productospendientesSessionBean=new ProductosPendientesSessionBean();
			
			if(this.productospendientesSessionBean==null) {
				this.productospendientesSessionBean=new ProductosPendientesSessionBean();
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
					this.iNumeroPaginacion=ProductosPendientesConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProductosPendientesConstantesFunciones.getClassesForeignKeysOfProductosPendientes(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/productospendientes."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			productospendientessAux= new ArrayList<ProductosPendientes>();
			
				
			productospendientesLogic.setDatosCliente(this.datosCliente);
			productospendientesLogic.setDatosDeep(this.datosDeep);
			productospendientesLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaProductosPendientes")) {
				this.sDetalleReporte=ProductosPendientesConstantesFunciones.getDetalleIndiceBusquedaProductosPendientes(id_bodegaBusquedaProductosPendientes,id_lineaBusquedaProductosPendientes,id_linea_grupoBusquedaProductosPendientes,id_linea_categoriaBusquedaProductosPendientes,id_linea_marcaBusquedaProductosPendientes,fecha_emision_desdeBusquedaProductosPendientes,fecha_emision_hastaBusquedaProductosPendientes);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productospendientesLogic.getProductosPendientessBusquedaProductosPendientes(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_bodegaBusquedaProductosPendientes,id_lineaBusquedaProductosPendientes,id_linea_grupoBusquedaProductosPendientes,id_linea_categoriaBusquedaProductosPendientes,id_linea_marcaBusquedaProductosPendientes,fecha_emision_desdeBusquedaProductosPendientes,fecha_emision_hastaBusquedaProductosPendientes);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductosPendientesConstantesFunciones.getDetalleIndiceBusquedaProductosPendientes(id_bodegaBusquedaProductosPendientes,id_lineaBusquedaProductosPendientes,id_linea_grupoBusquedaProductosPendientes,id_linea_categoriaBusquedaProductosPendientes,id_linea_marcaBusquedaProductosPendientes,fecha_emision_desdeBusquedaProductosPendientes,fecha_emision_hastaBusquedaProductosPendientes);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductosPendientesConstantesFunciones.getDetalleIndiceBusquedaProductosPendientes(id_bodegaBusquedaProductosPendientes,id_lineaBusquedaProductosPendientes,id_linea_grupoBusquedaProductosPendientes,id_linea_categoriaBusquedaProductosPendientes,id_linea_marcaBusquedaProductosPendientes,fecha_emision_desdeBusquedaProductosPendientes,fecha_emision_hastaBusquedaProductosPendientes);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productospendientesLogic.getProductosPendientess()==null||productospendientesLogic.getProductosPendientess().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productospendientess==null|| productospendientess.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productospendientessAux=new ArrayList<ProductosPendientes>();
						productospendientessAux.addAll(productospendientesLogic.getProductosPendientess());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productospendientessAux=new ArrayList<ProductosPendientes>();
							productospendientessAux.addAll(productospendientess);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productospendientesLogic.getProductosPendientessBusquedaProductosPendientes(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_bodegaBusquedaProductosPendientes,id_lineaBusquedaProductosPendientes,id_linea_grupoBusquedaProductosPendientes,id_linea_categoriaBusquedaProductosPendientes,id_linea_marcaBusquedaProductosPendientes,fecha_emision_desdeBusquedaProductosPendientes,fecha_emision_hastaBusquedaProductosPendientes);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductosPendientesConstantesFunciones.getDetalleIndiceBusquedaProductosPendientes(id_bodegaBusquedaProductosPendientes,id_lineaBusquedaProductosPendientes,id_linea_grupoBusquedaProductosPendientes,id_linea_categoriaBusquedaProductosPendientes,id_linea_marcaBusquedaProductosPendientes,fecha_emision_desdeBusquedaProductosPendientes,fecha_emision_hastaBusquedaProductosPendientes);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductosPendientesConstantesFunciones.getDetalleIndiceBusquedaProductosPendientes(id_bodegaBusquedaProductosPendientes,id_lineaBusquedaProductosPendientes,id_linea_grupoBusquedaProductosPendientes,id_linea_categoriaBusquedaProductosPendientes,id_linea_marcaBusquedaProductosPendientes,fecha_emision_desdeBusquedaProductosPendientes,fecha_emision_hastaBusquedaProductosPendientes);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductosPendientess("BusquedaProductosPendientes",productospendientesLogic.getProductosPendientess());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductosPendientess("BusquedaProductosPendientes",productospendientess);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productospendientesLogic.setProductosPendientess(new ArrayList<ProductosPendientes>());
						productospendientesLogic.getProductosPendientess().addAll(productospendientessAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productospendientess=new ArrayList<ProductosPendientes>();
							productospendientess.addAll(productospendientessAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProductosPendientes();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProductosPendientes();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productospendientesLogic.getProductosPendientess().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productospendientess.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productospendientesLogic.getProductosPendientess().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productospendientess.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProductosPendientes productospendientes) {
		Boolean permite=true;
		
		if(this.productospendientes.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProductosPendientesConstantesFunciones.getOrderByListaProductosPendientes();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProductosPendientesConstantesFunciones.getOrderByListaProductosPendientes();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductosPendientes productospendientes:productospendientesLogic.getProductosPendientess()) {
				if(productospendientes.getsType().equals(Constantes2.S_TOTALES)) {
					productospendientesTotales=productospendientes;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductosPendientes productospendientes:this.productospendientess) {
				if(productospendientes.getsType().equals(Constantes2.S_TOTALES)) {
					productospendientesTotales=productospendientes;
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
			this.productospendientesAux=new ProductosPendientes();
			this.productospendientesAux.setsType(Constantes2.S_TOTALES);
			this.productospendientesAux.setIsNew(false);
			this.productospendientesAux.setIsChanged(false);
			this.productospendientesAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProductosPendientesConstantesFunciones.TotalizarValoresFilaProductosPendientes(this.productospendientesLogic.getProductosPendientess(),this.productospendientesAux);
				
				//this.productospendientesLogic.getProductosPendientess().add(this.productospendientesAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProductosPendientesConstantesFunciones.TotalizarValoresFilaProductosPendientes(this.productospendientess,this.productospendientesAux);
				
				this.productospendientess.add(this.productospendientesAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		productospendientesTotales=new ProductosPendientes();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productospendientesLogic.getProductosPendientess().remove(productospendientesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productospendientess.remove(productospendientesTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		productospendientesTotales=new ProductosPendientes();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductosPendientes productospendientes:productospendientesLogic.getProductosPendientess()) {
				if(productospendientes.getsType().equals(Constantes2.S_TOTALES)) {
					productospendientesTotales=productospendientes;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductosPendientesConstantesFunciones.TotalizarValoresFilaProductosPendientes(this.productospendientesLogic.getProductosPendientess(),productospendientesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductosPendientes productospendientes:this.productospendientess) {
				if(productospendientes.getsType().equals(Constantes2.S_TOTALES)) {
					productospendientesTotales=productospendientes;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductosPendientesConstantesFunciones.TotalizarValoresFilaProductosPendientes(this.productospendientess,productospendientesTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProductosPendientessBusquedaProductosPendientes()throws Exception {
		try {
			sAccionBusqueda="BusquedaProductosPendientes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosPendientessFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosPendientessFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosPendientessFK_IdLinea()throws Exception {
		try {
			sAccionBusqueda="FK_IdLinea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosPendientessFK_IdLineaCategoria()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaCategoria";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosPendientessFK_IdLineaGrupo()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaGrupo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosPendientessFK_IdLineaMarca()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaMarca";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProductosPendientessBusquedaProductosPendientes(String sFinalQuery,Long id_bodega,Long id_linea,Long id_linea_grupo,Long id_linea_categoria,Long id_linea_marca,Date fecha_emision_desde,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productospendientesLogic.getProductosPendientessBusquedaProductosPendientes(sFinalQuery,this.pagination,id_bodega,id_linea,id_linea_grupo,id_linea_categoria,id_linea_marca,fecha_emision_desde,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosPendientessFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productospendientesLogic.getProductosPendientessFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosPendientessFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productospendientesLogic.getProductosPendientessFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosPendientessFK_IdLinea(String sFinalQuery,Long id_linea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productospendientesLogic.getProductosPendientessFK_IdLinea(sFinalQuery,this.pagination,id_linea);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosPendientessFK_IdLineaCategoria(String sFinalQuery,Long id_linea_categoria)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productospendientesLogic.getProductosPendientessFK_IdLineaCategoria(sFinalQuery,this.pagination,id_linea_categoria);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosPendientessFK_IdLineaGrupo(String sFinalQuery,Long id_linea_grupo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productospendientesLogic.getProductosPendientessFK_IdLineaGrupo(sFinalQuery,this.pagination,id_linea_grupo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosPendientessFK_IdLineaMarca(String sFinalQuery,Long id_linea_marca)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productospendientesLogic.getProductosPendientessFK_IdLineaMarca(sFinalQuery,this.pagination,id_linea_marca);
				
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
								
			//this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosProductosPendientes() {
		this.isPermisoTodoProductosPendientes=false;
		this.isPermisoNuevoProductosPendientes=false;
		this.isPermisoActualizarProductosPendientes=false;
		this.isPermisoActualizarOriginalProductosPendientes=false;
		this.isPermisoEliminarProductosPendientes=false;
		this.isPermisoGuardarCambiosProductosPendientes=false;
		this.isPermisoConsultaProductosPendientes=true;
		this.isPermisoBusquedaProductosPendientes=true;
		this.isPermisoReporteProductosPendientes=true;
		this.isPermisoOrdenProductosPendientes=false;		
		this.isPermisoPaginacionMedioProductosPendientes=false;		
		this.isPermisoPaginacionAltoProductosPendientes=false;		
		this.isPermisoPaginacionTodoProductosPendientes=false;		
		this.isPermisoCopiarProductosPendientes=false;		
		this.isPermisoVerFormProductosPendientes=false;		
		this.isPermisoDuplicarProductosPendientes=false;
		this.isPermisoOrdenProductosPendientes=false;
	}
	
	public void setPermisosUsuarioProductosPendientes(Boolean isPermiso) {
		this.isPermisoTodoProductosPendientes=isPermiso;
		this.isPermisoNuevoProductosPendientes=isPermiso;
		this.isPermisoActualizarProductosPendientes=isPermiso;
		this.isPermisoActualizarOriginalProductosPendientes=isPermiso;
		this.isPermisoEliminarProductosPendientes=isPermiso;
		this.isPermisoGuardarCambiosProductosPendientes=isPermiso;
		this.isPermisoConsultaProductosPendientes=isPermiso;
		this.isPermisoBusquedaProductosPendientes=isPermiso;
		this.isPermisoReporteProductosPendientes=isPermiso;
		this.isPermisoOrdenProductosPendientes=isPermiso;		
		this.isPermisoPaginacionMedioProductosPendientes=isPermiso;		
		this.isPermisoPaginacionAltoProductosPendientes=isPermiso;		
		this.isPermisoPaginacionTodoProductosPendientes=isPermiso;		
		this.isPermisoCopiarProductosPendientes=isPermiso;		
		this.isPermisoVerFormProductosPendientes=isPermiso;		
		this.isPermisoDuplicarProductosPendientes=isPermiso;
		this.isPermisoOrdenProductosPendientes=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProductosPendientes(Boolean isPermiso) {
		//this.isPermisoTodoProductosPendientes=isPermiso;
		this.isPermisoNuevoProductosPendientes=isPermiso;
		this.isPermisoActualizarProductosPendientes=isPermiso;
		this.isPermisoActualizarOriginalProductosPendientes=isPermiso;
		this.isPermisoEliminarProductosPendientes=isPermiso;
		this.isPermisoGuardarCambiosProductosPendientes=isPermiso;
		//this.isPermisoConsultaProductosPendientes=isPermiso;
		//this.isPermisoBusquedaProductosPendientes=isPermiso;
		//this.isPermisoReporteProductosPendientes=isPermiso;
		//this.isPermisoOrdenProductosPendientes=isPermiso;		
		//this.isPermisoPaginacionMedioProductosPendientes=isPermiso;		
		//this.isPermisoPaginacionAltoProductosPendientes=isPermiso;		
		//this.isPermisoPaginacionTodoProductosPendientes=isPermiso;		
		//this.isPermisoCopiarProductosPendientes=isPermiso;		
		//this.isPermisoDuplicarProductosPendientes=isPermiso;
		//this.isPermisoOrdenProductosPendientes=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProductosPendientesClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProductosPendientesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProductosPendientes(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProductosPendientesClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProductosPendientesClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProductosPendientesClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProductosPendientesClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProductosPendientes() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProductosPendientesJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.productospendientesSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProductosPendientesConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProductosPendientes=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProductosPendientes=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProductosPendientes=this.isPermisoActualizarProductosPendientes;
			this.isPermisoEliminarProductosPendientes=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProductosPendientes=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProductosPendientes=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProductosPendientes=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProductosPendientes=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProductosPendientes=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductosPendientes=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProductosPendientes=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProductosPendientes=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProductosPendientes=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProductosPendientes=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProductosPendientes=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProductosPendientes=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductosPendientes=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.productospendientesSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProductosPendientes.setToolTipText(this.jTableDatosProductosPendientes.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProductosPendientes(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProductosPendientes(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProductosPendientesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProductosPendientesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProductosPendientes() throws Exception {
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
	public void inicializarCombosForeignKeyProductosPendientesListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.bodegasForeignKey=new ArrayList();
				this.lineasForeignKey=new ArrayList();
				this.lineagruposForeignKey=new ArrayList();
				this.lineacategoriasForeignKey=new ArrayList();
				this.lineamarcasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProductosPendientesListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProductosPendientesJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaGrupoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaCategoriaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaMarcaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyLineaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineasForeignKey==null||this.lineasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaGrupoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineagruposForeignKey==null||this.lineagruposForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineaGruposForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaCategoriaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineacategoriasForeignKey==null||this.lineacategoriasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineaCategoriasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaMarcaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineamarcasForeignKey==null||this.lineamarcasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineaMarcasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyProductosPendientes()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyBodega();
			this.addItemDefectoCombosForeignKeyLinea();
			this.addItemDefectoCombosForeignKeyLineaGrupo();
			this.addItemDefectoCombosForeignKeyLineaCategoria();
			this.addItemDefectoCombosForeignKeyLineaMarca();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.productospendientesSessionBean==null) {
				this.productospendientesSessionBean=new ProductosPendientesSessionBean();
			}

			if(!this.productospendientesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyBodega()throws Exception {
		try {

			if(!this.productospendientesSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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

	public void addItemDefectoCombosForeignKeyLinea()throws Exception {
		try {

			if(!this.productospendientesSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
				Linea linea=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(linea,Constantes.SMENSAJE_ESCOJA_OPCION);
				linea.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineasForeignKey,linea,true)) {

					this.lineasForeignKey.add(0,linea);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLineaGrupo()throws Exception {
		try {

			if(!this.productospendientesSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
				Linea lineagrupo=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(lineagrupo,Constantes.SMENSAJE_ESCOJA_OPCION);
				lineagrupo.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineagruposForeignKey,lineagrupo,true)) {

					this.lineagruposForeignKey.add(0,lineagrupo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLineaCategoria()throws Exception {
		try {

			if(!this.productospendientesSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
				Linea lineacategoria=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(lineacategoria,Constantes.SMENSAJE_ESCOJA_OPCION);
				lineacategoria.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineacategoriasForeignKey,lineacategoria,true)) {

					this.lineacategoriasForeignKey.add(0,lineacategoria);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLineaMarca()throws Exception {
		try {

			if(!this.productospendientesSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
				Linea lineamarca=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(lineamarca,Constantes.SMENSAJE_ESCOJA_OPCION);
				lineamarca.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineamarcasForeignKey,lineamarca,true)) {

					this.lineamarcasForeignKey.add(0,lineamarca);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyProductosPendientes()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProductosPendientes(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProductosPendientes()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductosPendientes();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProductosPendientes(ProductosPendientes productospendientes)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProductosPendientes(ProductosPendientes productospendientes,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProductosPendientes()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProductosPendientes()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProductosPendientes()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProductosPendientes()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProductosPendientes()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProductosPendientes()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameLineasForeignKey("Todos");
			this.cargarCombosFrameLineaGruposForeignKey("Todos");
			this.cargarCombosFrameLineaCategoriasForeignKey("Todos");
			this.cargarCombosFrameLineaMarcasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProductosPendientes(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaGruposForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaCategoriasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaMarcasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProductosPendientes()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_empresaProductosPendientes!=null && this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_empresaProductosPendientes.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_empresaProductosPendientes.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_bodegaProductosPendientes!=null && this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_bodegaProductosPendientes.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_bodegaProductosPendientes.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_lineaProductosPendientes!=null && this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_lineaProductosPendientes.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_lineaProductosPendientes.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_grupoProductosPendientes!=null && this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_grupoProductosPendientes.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_grupoProductosPendientes.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_categoriaProductosPendientes!=null && this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_categoriaProductosPendientes.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_categoriaProductosPendientes.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_marcaProductosPendientes!=null && this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_marcaProductosPendientes.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_marcaProductosPendientes.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	












	
	

	public ProductosPendientesBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProductosPendientesBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProductosPendientesBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.productospendientesSessionBean=new ProductosPendientesSessionBean(); 
		this.productospendientesConstantesFunciones=new ProductosPendientesConstantesFunciones(); 
		this.productospendientesBean=new ProductosPendientes();//(this.productospendientesConstantesFunciones); 		
		this.productospendientesReturnGeneral=new ProductosPendientesParameterReturnGeneral(); 
		
		this.productospendientesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productospendientesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProductosPendientesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProductosPendientesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProductosPendientesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProductosPendientes(true);
			
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
			
			this.productospendientesConstantesFunciones=new ProductosPendientesConstantesFunciones(); 
			this.productospendientesBean=new ProductosPendientes();//this.productospendientesConstantesFunciones); 			
			this.productospendientesReturnGeneral=new ProductosPendientesParameterReturnGeneral(); 
		
			ProductosPendientesBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Productos Pendientes Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.productospendientes=new ProductosPendientes();
			this.productospendientess = new ArrayList<ProductosPendientes>();
			this.productospendientessAux = new ArrayList<ProductosPendientes>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic=new ProductosPendientesLogic();
				this.productospendientesLogic.getNewConnexionToDeep("");
			}
			
			//this.productospendientesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.productospendientesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProductosPendientes);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProductosPendientes!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductosPendientes);	
					}
					
					if(this.jInternalFrameImportacionProductosPendientes!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductosPendientes);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProductosPendientes!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProductosPendientes);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProductosPendientes!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProductosPendientes);
				this.jInternalFrameDetalleFormProductosPendientes.setVisible(false);
				this.jInternalFrameDetalleFormProductosPendientes.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProductosPendientes!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductosPendientes);
					this.jInternalFrameReporteDinamicoProductosPendientes.setVisible(false);
					this.jInternalFrameReporteDinamicoProductosPendientes.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProductosPendientes!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProductosPendientes);
					this.jInternalFrameImportacionProductosPendientes.setVisible(false);
					this.jInternalFrameImportacionProductosPendientes.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProductosPendientes!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProductosPendientes);
					this.jInternalFrameOrderByProductosPendientes.setVisible(false);
					this.jInternalFrameOrderByProductosPendientes.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProductosPendientesActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProductosPendientesConstantesFunciones.INUMEROPAGINACION;
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
			
			this.productospendientesReturnGeneral=new ProductosPendientesParameterReturnGeneral();
			
			this.productospendientesParameterGeneral=new ProductosPendientesParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.productospendientesLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.productospendientesSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProductosPendientesJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.productospendientesSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductosPendientesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productospendientesSessionBean.getEsGuardarRelacionado(),this.productospendientesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductosPendientesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productospendientesSessionBean.getEsGuardarRelacionado(),this.productospendientesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProductosPendientes=false;
			this.isVisibilidadCeldaDuplicarProductosPendientes=true;
			this.isVisibilidadCeldaCopiarProductosPendientes=true;
			this.isVisibilidadCeldaVerFormProductosPendientes=true;
			this.isVisibilidadCeldaOrdenProductosPendientes=true;
			this.isVisibilidadCeldaNuevoRelacionesProductosPendientes=false;
			this.isVisibilidadCeldaModificarProductosPendientes=false;
			this.isVisibilidadCeldaActualizarProductosPendientes=false;
			this.isVisibilidadCeldaEliminarProductosPendientes=false;
			this.isVisibilidadCeldaCancelarProductosPendientes=false;
			this.isVisibilidadCeldaGuardarProductosPendientes=false;
			this.isVisibilidadCeldaGuardarCambiosProductosPendientes=false;
			
			
			this.isVisibilidadBusquedaProductosPendientes=true;
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdLinea=true;
			this.isVisibilidadFK_IdLineaCategoria=true;
			this.isVisibilidadFK_IdLineaGrupo=true;
			this.isVisibilidadFK_IdLineaMarca=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProductosPendientes("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProductosPendientes();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProductosPendientes(false);
			
			this.setPermisosUsuarioProductosPendientes();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productospendientesSessionBean.getEsGuardarRelacionado() 
				|| (this.productospendientesSessionBean.getEsGuardarRelacionado() && this.productospendientesSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProductosPendientesClasesRelacionadas();
			}
			
			if(this.productospendientesSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProductosPendientesClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProductosPendientesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProductosPendientes();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProductosPendientes();
			}
			
			if(!this.isPermisoBusquedaProductosPendientes) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProductosPendientes.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productospendientesSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProductosPendientesConstantesFunciones.getTiposSeleccionarProductosPendientes());
				
				this.tiposColumnasSelect=ProductosPendientesConstantesFunciones.getTiposSeleccionarProductosPendientes(true);
				
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
			//if(!this.productospendientesSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProductosPendientes();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioProductosPendientes(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioProductosPendientes(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProductosPendientes() ;
			
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
			this.bodegaLogic=new BodegaLogic();
			this.lineaLogic=new LineaLogic();
			this.lineagrupoLogic=new LineaLogic();
			this.lineacategoriaLogic=new LineaLogic();
			this.lineamarcaLogic=new LineaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				productospendientesImplementable= (ProductosPendientesImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductosPendientesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				productospendientesImplementableHome= (ProductosPendientesImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductosPendientesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.productospendientess= new ArrayList<ProductosPendientes>();
			this.productospendientessEliminados= new ArrayList<ProductosPendientes>();
						
			this.isEsNuevoProductosPendientes=false;
			this.esParaAccionDesdeFormularioProductosPendientes=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.bodegasForeignKey=new ArrayList<Bodega>() ;
			this.lineasForeignKey=new ArrayList<Linea>() ;
			this.lineagruposForeignKey=new ArrayList<Linea>() ;
			this.lineacategoriasForeignKey=new ArrayList<Linea>() ;
			this.lineamarcasForeignKey=new ArrayList<Linea>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProductosPendientes(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProductosPendientes();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productospendientesSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProductosPendientesBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProductosPendientesConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProductosPendientes("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProductosPendientes(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProductosPendientes!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProductosPendientes();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProductosPendientes();
			}
			
			ProductosPendientesBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProductosPendientes.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProductosPendientes.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProductosPendientes.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProductosPendientes(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProductosPendientes: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProductosPendientes() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProductosPendientes")) {
				iIndex=this.jInternalFrameDetalleFormProductosPendientes.jTabbedPaneRelacionesProductosPendientes.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProductosPendientes.jTabbedPaneRelacionesProductosPendientes.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProductosPendientes.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProductosPendientes();	
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
	
	public void cargarCombosForeignKeyProductosPendientes(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProductosPendientes(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProductosPendientes(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProductosPendientesListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProductosPendientes();
		
		this.cargarCombosFrameForeignKeyProductosPendientes();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProductosPendientes();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProductosPendientes();
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

	public void cargarCombosForeignKeyLinea(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLinea(this.lineasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaGrupo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaGrupoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLineaGrupo(this.lineagruposForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaCategoria(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaCategoriaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLineaCategoria();
				this.cargarCombosFrameLineaCategoriasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLineaCategoria(this.lineacategoriasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaMarca(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaMarcaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLineaMarca();
				this.cargarCombosFrameLineaMarcasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLineaMarca(this.lineamarcasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoProductosPendientesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.productospendientesSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProductosPendientes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
			
			
			if(jTableDatosProductosPendientes.getRowCount()>=1) {
				jTableDatosProductosPendientes.removeRowSelectionInterval(0, jTableDatosProductosPendientes.getRowCount()-1);						
			}
			
			this.isEsNuevoProductosPendientes=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProductosPendientes(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProductosPendientes(true);			
			//this.productospendientes=new ProductosPendientes();
			//this.productospendientes.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductosPendientes(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductosPendientes() ;
			
			if(ProductosPendientesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductosPendientes(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.productospendientes);	
			this.actualizarInformacion("INFO_PADRE",false,this.productospendientes);				
			
			ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
			
			if(this.productospendientesSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProductosPendientes: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProductosPendientesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProductosPendientes> productospendientessSeleccionados=new ArrayList<ProductosPendientes>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProductosPendientes.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProductosPendientes.getSelectedRows().length;			
			}
			
			productospendientessSeleccionados=this.getProductosPendientessSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProductosPendientes--;			
				//ProductosPendientes productospendientesAux= new ProductosPendientes();			
				//productospendientesAux.setId(this.iIdNuevoProductosPendientes);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProductosPendientes productospendientesOrigen=new ProductosPendientes();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProductosPendientes productospendientesOrigen : productospendientessSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProductosPendientes.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							productospendientesOrigen =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productospendientesOrigen =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProductosPendientes();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.productospendientes.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProductosPendientes(productospendientesOrigen,this.productospendientes,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productospendientesLogic.getProductosPendientess().add(this.productospendientesAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productospendientess.add(this.productospendientesAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProductosPendientes(false);
				
				this.jTableDatosProductosPendientes.setRowSelectionInterval(this.getIndiceNuevoProductosPendientes(), this.getIndiceNuevoProductosPendientes());
				
				int iLastRow =  this.jTableDatosProductosPendientes.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductosPendientes.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductosPendientes.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductosPendientes(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProductosPendientesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProductosPendientes> productospendientessSeleccionados=new ArrayList<ProductosPendientes>();									
		
			ProductosPendientes productospendientesOrigen=new ProductosPendientes();
			ProductosPendientes productospendientesDestino=new ProductosPendientes();
				
			productospendientessSeleccionados=this.getProductosPendientessSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProductosPendientes.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || productospendientessSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProductosPendientes.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productospendientesOrigen =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productospendientesOrigen =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productospendientesDestino =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productospendientesDestino =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				productospendientesOrigen =productospendientessSeleccionados.get(0);
				productospendientesDestino =productospendientessSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProductosPendientes(productospendientesOrigen,productospendientesDestino,true,false);
				
				productospendientesDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productospendientesDestino,productospendientesLogic.getProductosPendientess());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productospendientesDestino,productospendientess);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProductosPendientes(false);
				
				//this.jTableDatosProductosPendientes.setRowSelectionInterval(this.getIndiceNuevoProductosPendientes(), this.getIndiceNuevoProductosPendientes());
				
				int iLastRow =  this.jTableDatosProductosPendientes.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductosPendientes.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductosPendientes.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductosPendientes(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProductosPendientesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductosPendientes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProductosPendientes.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProductosPendientesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProductosPendientes.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProductosPendientes.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProductosPendientes.setVisible(!isVisible);
			this.jPanelPaginacionProductosPendientes.setVisible(!isVisible);
			this.jPanelAccionesProductosPendientes.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProductosPendientesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProductosPendientes();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProductosPendientesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProductosPendientes();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProductosPendientesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProductosPendientes();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProductosPendientesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProductosPendientes();
			
			this.abrirFrameOrderByProductosPendientes();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProductosPendientesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProductosPendientes();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProductosPendientes(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductosPendientes);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProductosPendientes.isMaximum()) {
					this.jInternalFrameDetalleFormProductosPendientes.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProductosPendientes.setSize(this.jInternalFrameDetalleFormProductosPendientes.iWidthFormulario,this.jInternalFrameDetalleFormProductosPendientes.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProductosPendientes.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProductosPendientes.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProductosPendientes.isMaximum()) {
						this.jInternalFrameDetalleFormProductosPendientes.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProductosPendientes.jContentPaneDetalleProductosPendientes.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProductosPendientes.jTabbedPaneRelacionesProductosPendientes.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProductosPendientes.jContentPaneDetalleProductosPendientes.getWidth(),ProductosPendientesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductosPendientes.jTabbedPaneRelacionesProductosPendientes.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProductosPendientes.jContentPaneDetalleProductosPendientes.getWidth(),ProductosPendientesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductosPendientes.jTabbedPaneRelacionesProductosPendientes.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProductosPendientes.jContentPaneDetalleProductosPendientes.getWidth(),ProductosPendientesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProductosPendientes.setVisible(true);
	        this.jInternalFrameDetalleFormProductosPendientes.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProductosPendientes() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProductosPendientes==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProductosPendientes=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductosPendientes,false,this);
				} else {
					this.jInternalFrameOrderByProductosPendientes=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductosPendientes,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProductosPendientes);
				this.jInternalFrameOrderByProductosPendientes.setVisible(false);
				this.jInternalFrameOrderByProductosPendientes.setSelected(false);
				
				this.jInternalFrameOrderByProductosPendientes.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductosPendientes"));
				
				this.inicializarActualizarBindingTablaOrderByProductosPendientes();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProductosPendientes() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProductosPendientes==null) {
				
				this.jInternalFrameImportacionProductosPendientes=new ImportacionJInternalFrame(ProductosPendientesConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductosPendientes);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProductosPendientes);
				this.jInternalFrameImportacionProductosPendientes.setVisible(false);
				this.jInternalFrameImportacionProductosPendientes.setSelected(false);


				this.jInternalFrameImportacionProductosPendientes.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductosPendientes"));
				this.jInternalFrameImportacionProductosPendientes.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductosPendientes"));
				this.jInternalFrameImportacionProductosPendientes.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductosPendientes"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProductosPendientes() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProductosPendientes==null) {
				this.jInternalFrameReporteDinamicoProductosPendientes=new ReporteDinamicoJInternalFrame(ProductosPendientesConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductosPendientes);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductosPendientes);
				this.jInternalFrameReporteDinamicoProductosPendientes.setVisible(false);
				this.jInternalFrameReporteDinamicoProductosPendientes.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProductosPendientes.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductosPendientes"));
				this.jInternalFrameReporteDinamicoProductosPendientes.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductosPendientes"));
				this.jInternalFrameReporteDinamicoProductosPendientes.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductosPendientes"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductosPendientes();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProductosPendientes() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductosPendientes);
			
	       	this.jInternalFrameDetalleFormProductosPendientes.setVisible(false);
	        this.jInternalFrameDetalleFormProductosPendientes.setSelected(false);
			
			//this.jInternalFrameDetalleFormProductosPendientes.dispose();
			//this.jInternalFrameDetalleFormProductosPendientes=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProductosPendientes() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProductosPendientes.setVisible(true);
	        this.jInternalFrameReporteDinamicoProductosPendientes.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProductosPendientes() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProductosPendientes.setVisible(true);
	        this.jInternalFrameImportacionProductosPendientes.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProductosPendientes() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProductosPendientes.setVisible(true);
	        this.jInternalFrameOrderByProductosPendientes.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProductosPendientes() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProductosPendientes.setVisible(false);
	        this.jInternalFrameOrderByProductosPendientes.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProductosPendientes() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProductosPendientes.setVisible(false);
	        this.jInternalFrameReporteDinamicoProductosPendientes.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProductosPendientes() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProductosPendientes.setVisible(false);
	        this.jInternalFrameImportacionProductosPendientes.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProductosPendientesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProductosPendientes(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProductosPendientes(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductosPendientes.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProductosPendientes(true);
			//this.isEsNuevoProductosPendientes=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientes =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productospendientes =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProductosPendientes("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductosPendientes(false) ;
			
			if(productospendientesSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProductosPendientesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductosPendientes(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductosPendientes(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProductosPendientesActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProductosPendientes.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientes =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productospendientes =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProductosPendientes(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductosPendientes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductosPendientes.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProductosPendientes(true);
			//this.isEsNuevoProductosPendientes=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientes =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productospendientes =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.productospendientes.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProductosPendientes("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProductosPendientes(false) ;
			
			if(ProductosPendientesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductosPendientes(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductosPendientes(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosProductosPendientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosPendientes,ProductosPendientesConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductosPendientes.getSelectedRow();

		//if(intSelectedRow<=0) {
			//bodegaTableCellFk.setRowActual(intSelectedRow);
			//bodegaTableCellFk.setbodegasForeignKeyActual(bodegasForeignKey);
		//}


		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.RecargarBodegasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLinea(List<Linea> lineasForeignKey)throws Exception{
		TableColumn tableColumnLinea=this.jTableDatosProductosPendientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosPendientes,ProductosPendientesConstantesFunciones.LABEL_IDLINEA));
		TableCellEditor tableCellEditorLinea =tableColumnLinea.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLinea;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductosPendientes.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLineaGrupo(List<Linea> lineagruposForeignKey)throws Exception{
		TableColumn tableColumnLineaGrupo=this.jTableDatosProductosPendientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosPendientes,ProductosPendientesConstantesFunciones.LABEL_IDLINEAGRUPO));
		TableCellEditor tableCellEditorLineaGrupo =tableColumnLineaGrupo.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaGrupo;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineagruposForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductosPendientes.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineagruposForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLineaCategoria(List<Linea> lineacategoriasForeignKey)throws Exception{
		TableColumn tableColumnLineaCategoria=this.jTableDatosProductosPendientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosPendientes,ProductosPendientesConstantesFunciones.LABEL_IDLINEACATEGORIA));
		TableCellEditor tableCellEditorLineaCategoria =tableColumnLineaCategoria.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaCategoria;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineacategoriasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductosPendientes.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineacategoriasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLineaMarca(List<Linea> lineamarcasForeignKey)throws Exception{
		TableColumn tableColumnLineaMarca=this.jTableDatosProductosPendientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosPendientes,ProductosPendientesConstantesFunciones.LABEL_IDLINEAMARCA));
		TableCellEditor tableCellEditorLineaMarca =tableColumnLineaMarca.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaMarca;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineamarcasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductosPendientes.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineamarcasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProductosPendientesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProductosPendientes(false);
			
			//if(!this.isEsNuevoProductosPendientes) {								
				int intSelectedRow = this.jTableDatosProductosPendientes.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientes =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productospendientes =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProductosPendientesJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProductosPendientes(this.productospendientes,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);
				
			}
			
			if(this.permiteMantenimiento(this.productospendientes)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.productospendientesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProductosPendientes=true;
					this.inicializarActualizarBindingTablaProductosPendientes(false);
					this.isEsNuevoProductosPendientes=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProductosPendientes=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProductosPendientes=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductosPendientes(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductosPendientes(false);
				
				this.habilitarDeshabilitarControlesProductosPendientes(false);
			
												
				
				if(ProductosPendientesJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProductosPendientes();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProductosPendientesActionPerformed(evt,productospendientesSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProductosPendientes(this.productospendientes,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProductosPendientes.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,productospendientesSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.productospendientes.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProductosPendientes.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosPendientes.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProductosPendientesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProductosPendientes.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientes =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
				this.productospendientes.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productospendientes =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
				this.productospendientes.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.productospendientes)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.productospendientesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProductosPendientesModel) this.jTableDatosProductosPendientes.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProductosPendientes=true;
				this.inicializarActualizarBindingTablaProductosPendientes(false);
				this.isEsNuevoProductosPendientes=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductosPendientes(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductosPendientes(false);
				
				this.habilitarDeshabilitarControlesProductosPendientes(false);
				
				
				
				if(ProductosPendientesJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProductosPendientes();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProductosPendientesActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProductosPendientes.getRowCount()>=1) {
				jTableDatosProductosPendientes.removeRowSelectionInterval(0, jTableDatosProductosPendientes.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProductosPendientes(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProductosPendientes(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductosPendientes(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductosPendientes(false) ;
			
			this.isEsNuevoProductosPendientes=false;
			
			if(ProductosPendientesJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProductosPendientes();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProductosPendientesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProductosPendientes(false);
				
				//SI ES MANUAL
				if(ProductosPendientesJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProductosPendientes();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProductosPendientesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProductosPendientes--;			
			//ProductosPendientes productospendientesAux= new ProductosPendientes();			
			//productospendientesAux.setId(this.iIdNuevoProductosPendientes);
			
			if(this.jInternalFrameDetalleFormProductosPendientes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProductosPendientes();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);
			
			this.productospendientes.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.productospendientesLogic.getProductosPendientess().add(this.productospendientesAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.productospendientess.add(this.productospendientesAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProductosPendientes(false);
			
			this.jTableDatosProductosPendientes.setRowSelectionInterval(this.getIndiceNuevoProductosPendientes(), this.getIndiceNuevoProductosPendientes());
			
			int iLastRow =  this.jTableDatosProductosPendientes.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProductosPendientes.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProductosPendientes.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProductosPendientes(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProductosPendientesActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProductosPendientes(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductosPendientes(false);
			
			//SI ES MANUAL
			if(ProductosPendientesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductosPendientes();
			}
			
			//this.abrirFrameTreeProductosPendientes();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProductosPendientesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProductosPendientesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProductosPendientes.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProductosPendientes.setFileImportacion(this.jInternalFrameImportacionProductosPendientes.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProductosPendientes.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProductosPendientes.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProductosPendientes.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProductosPendientes.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProductosPendientesActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProductosPendientes> productospendientessSeleccionados=new ArrayList<ProductosPendientes>();		

		productospendientessSeleccionados=this.getProductosPendientessSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductosPendientes.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductosPendientes.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProductosPendientesBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProductosPendientesBaseDesign.jrxml";
			
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
			
			this.generarReporteProductosPendientess("Todos",productospendientessSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productospendientesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Pendientes",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProductosPendientes.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductosPendientes.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductosPendientesConstantesFunciones.LABEL_NOMBREEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreEmpresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreEmpresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreEmpresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreEmpresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosPendientesConstantesFunciones.LABEL_RUCEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cEmpresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cEmpresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cEmpresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cEmpresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosPendientesConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosPendientesConstantesFunciones.LABEL_NOMBREUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreUnidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreUnidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreUnidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreUnidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosPendientesConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosPendientesConstantesFunciones.LABEL_PRECIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ecio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ecio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ecio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ecio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosPendientesConstantesFunciones.LABEL_TOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosPendientesConstantesFunciones.LABEL_CODIGOPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoProducto_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProductosPendientes.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProductosPendientes.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProductosPendientes.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProductosPendientesConstantesFunciones.LABEL_NOMBREEMPRESA:
					sNombreCampoCategoria="nombre_empresa";
					break;

				case ProductosPendientesConstantesFunciones.LABEL_RUCEMPRESA:
					sNombreCampoCategoria="ruc_empresa";
					break;

				case ProductosPendientesConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoria="nombre_producto";
					break;

				case ProductosPendientesConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoria="nombre_unidad";
					break;

				case ProductosPendientesConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;

				case ProductosPendientesConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoria="precio";
					break;

				case ProductosPendientesConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;

				case ProductosPendientesConstantesFunciones.LABEL_CODIGOPRODUCTO:
					sNombreCampoCategoria="codigo_producto";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProductosPendientes.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProductosPendientesConstantesFunciones.LABEL_NOMBREEMPRESA:
					sNombreCampoCategoriaValor="nombre_empresa";
					break;

				case ProductosPendientesConstantesFunciones.LABEL_RUCEMPRESA:
					sNombreCampoCategoriaValor="ruc_empresa";
					break;

				case ProductosPendientesConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoriaValor="nombre_producto";
					break;

				case ProductosPendientesConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoriaValor="nombre_unidad";
					break;

				case ProductosPendientesConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;

				case ProductosPendientesConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoriaValor="precio";
					break;

				case ProductosPendientesConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;

				case ProductosPendientesConstantesFunciones.LABEL_CODIGOPRODUCTO:
					sNombreCampoCategoriaValor="codigo_producto";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProductosPendientes.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductosPendientes.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductosPendientesConstantesFunciones.LABEL_NOMBREEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_empresa");
					break;

				case ProductosPendientesConstantesFunciones.LABEL_RUCEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ruc Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ruc_empresa");
					break;

				case ProductosPendientesConstantesFunciones.LABEL_NOMBREPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_producto");
					break;

				case ProductosPendientesConstantesFunciones.LABEL_NOMBREUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Unad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_unidad");
					break;

				case ProductosPendientesConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad");
					break;

				case ProductosPendientesConstantesFunciones.LABEL_PRECIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Precio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"precio");
					break;

				case ProductosPendientesConstantesFunciones.LABEL_TOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total");
					break;

				case ProductosPendientesConstantesFunciones.LABEL_CODIGOPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_producto");
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
	
	public void jButtonGenerarExcelReporteDinamicoProductosPendientesActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProductosPendientes> productospendientessSeleccionados=new ArrayList<ProductosPendientes>();		
		
		productospendientessSeleccionados=this.getProductosPendientessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productospendientes";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProductosPendientess");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProductosPendientes.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProductosPendientes.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProductosPendientesConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ProductosPendientes productospendientes:productospendientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productospendientes.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosPendientesConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(ProductosPendientes productospendientes:productospendientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productospendientes.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosPendientesConstantesFunciones.LABEL_IDLINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_IDLINEA);
					iRow++;

					for(ProductosPendientes productospendientes:productospendientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productospendientes.getlinea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosPendientesConstantesFunciones.LABEL_IDLINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_IDLINEAGRUPO);
					iRow++;

					for(ProductosPendientes productospendientes:productospendientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productospendientes.getlineagrupo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosPendientesConstantesFunciones.LABEL_IDLINEACATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_IDLINEACATEGORIA);
					iRow++;

					for(ProductosPendientes productospendientes:productospendientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productospendientes.getlineacategoria_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosPendientesConstantesFunciones.LABEL_IDLINEAMARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_IDLINEAMARCA);
					iRow++;

					for(ProductosPendientes productospendientes:productospendientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productospendientes.getlineamarca_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosPendientesConstantesFunciones.LABEL_FECHAEMISIONDESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_FECHAEMISIONDESDE);
					iRow++;

					for(ProductosPendientes productospendientes:productospendientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productospendientes.getfecha_emision_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosPendientesConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(ProductosPendientes productospendientes:productospendientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productospendientes.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosPendientesConstantesFunciones.LABEL_NOMBREEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_NOMBREEMPRESA);
					iRow++;

					for(ProductosPendientes productospendientes:productospendientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productospendientes.getnombre_empresa());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosPendientesConstantesFunciones.LABEL_RUCEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_RUCEMPRESA);
					iRow++;

					for(ProductosPendientes productospendientes:productospendientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productospendientes.getruc_empresa());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosPendientesConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_NOMBREPRODUCTO);
					iRow++;

					for(ProductosPendientes productospendientes:productospendientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productospendientes.getnombre_producto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosPendientesConstantesFunciones.LABEL_NOMBREUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_NOMBREUNIDAD);
					iRow++;

					for(ProductosPendientes productospendientes:productospendientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productospendientes.getnombre_unidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosPendientesConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(ProductosPendientes productospendientes:productospendientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productospendientes.getcantidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosPendientesConstantesFunciones.LABEL_PRECIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_PRECIO);
					iRow++;

					for(ProductosPendientes productospendientes:productospendientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productospendientes.getprecio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosPendientesConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(ProductosPendientes productospendientes:productospendientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productospendientes.gettotal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosPendientesConstantesFunciones.LABEL_CODIGOPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_CODIGOPRODUCTO);
					iRow++;

					for(ProductosPendientes productospendientes:productospendientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productospendientes.getcodigo_producto());
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
			//	this.getFilaCabeceraExportarExcelProductosPendientes(row);				
			//	iRow++;
			//}				
			
			//for(ProductosPendientes productospendientesAux:productospendientessSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProductosPendientes(productospendientesAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productospendientesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Pendientes",JOptionPane.INFORMATION_MESSAGE);
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
				this.productospendientesLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductosPendientes(false);
			
			//SI ES MANUAL
			if(ProductosPendientesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductosPendientes();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProductosPendientesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductosPendientes(false);
			
			//SI ES MANUAL
			if(ProductosPendientesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductosPendientes();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProductosPendientesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductosPendientes(false);
			
			//SI ES MANUAL
			if(ProductosPendientesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductosPendientes();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProductosPendientes() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProductosPendientes.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProductosPendientes.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProductosPendientes.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProductosPendientes.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProductosPendientes.setMinimumSize(dimensionMinimum);
		this.jTableDatosProductosPendientes.setMaximumSize(dimensionMaximum);
		this.jTableDatosProductosPendientes.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProductosPendientes(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProductosPendientes(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProductosPendientes(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProductosPendientes(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProductosPendientes(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productospendientesSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProductosPendientes(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductosPendientes(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProductosPendientes(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProductosPendientesJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProductosPendientesJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProductosPendientes() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProductosPendientes();
		
		this.inicializarActualizarBindingBotonesManualProductosPendientes(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productospendientesSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProductosPendientes();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductosPendientes() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProductosPendientes(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProductosPendientes(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProductosPendientes.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProductosPendientes.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProductosPendientes.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProductosPendientes.jCheckBoxPostAccionNuevoProductosPendientes.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProductosPendientes.jCheckBoxPostAccionSinCerrarProductosPendientes.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProductosPendientes.jCheckBoxPostAccionSinMensajeProductosPendientes.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProductosPendientes.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProductosPendientes.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProductosPendientes.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
				this.jInternalFrameDetalleFormProductosPendientes.jCheckBoxPostAccionNuevoProductosPendientes.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProductosPendientes.jCheckBoxPostAccionSinCerrarProductosPendientes.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProductosPendientes.jCheckBoxPostAccionSinMensajeProductosPendientes.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProductosPendientes.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProductosPendientes.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProductosPendientes.jComboBoxTiposAccionesFormularioProductosPendientes.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProductosPendientes.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProductosPendientes!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductosPendientes.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProductosPendientes.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProductosPendientes.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProductosPendientes.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProductosPendientes.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProductosPendientes!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductosPendientes.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProductosPendientes.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProductosPendientes.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProductosPendientes(Boolean esInicializar) throws Exception {
		try	{	
			if(ProductosPendientesJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProductosPendientes(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProductosPendientes() throws Exception {
		try	{
			if(ProductosPendientesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProductosPendientes();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductosPendientes() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProductosPendientes.jComboBoxTiposAccionesFormularioProductosPendientes.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProductosPendientes.jComboBoxTiposAccionesFormularioProductosPendientes.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProductosPendientes() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProductosPendientes.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProductosPendientes.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProductosPendientes.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProductosPendientes.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProductosPendientes.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProductosPendientes.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProductosPendientes.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProductosPendientes.addItem(reporte);
			}
			
			
			if(!this.productospendientesSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProductosPendientes.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProductosPendientes.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProductosPendientes.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProductosPendientes.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProductosPendientes.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProductosPendientes.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProductosPendientes!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProductosPendientes.jComboBoxTiposAccionesFormularioProductosPendientes.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProductosPendientes.jComboBoxTiposAccionesFormularioProductosPendientes.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProductosPendientes.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProductosPendientes.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProductosPendientes.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductosPendientes();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductosPendientes() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductosPendientes!=null) {
				this.jInternalFrameReporteDinamicoProductosPendientes.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductosPendientes.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductosPendientes!=null) {
				this.jInternalFrameReporteDinamicoProductosPendientes.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductosPendientes.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProductosPendientes!=null) {
				
				if(this.jInternalFrameReporteDinamicoProductosPendientes.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductosPendientes.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductosPendientes.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProductosPendientes.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductosPendientes.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductosPendientes.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoProductosPendientes.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProductosPendientes.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ProductosPendientesConstantesFunciones.getTiposSeleccionarProductosPendientes(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProductosPendientes.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoProductosPendientes.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoProductosPendientes.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ProductosPendientesConstantesFunciones.getTiposSeleccionarProductosPendientes(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProductosPendientes.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoProductosPendientes.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProductosPendientes.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ProductosPendientesConstantesFunciones.getTiposSeleccionarProductosPendientes(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductosPendientes.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoProductosPendientes.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoProductosPendientes.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoProductosPendientes.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProductosPendientes()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaBusquedaProductosPendientesProductosPendientes.getSelectedItem()!=null){this.id_bodegaBusquedaProductosPendientes=((Bodega)this.jComboBoxid_bodegaBusquedaProductosPendientesProductosPendientes.getSelectedItem()).getId();}
		if(this.jComboBoxid_lineaBusquedaProductosPendientesProductosPendientes.getSelectedItem()!=null){this.id_lineaBusquedaProductosPendientes=((Linea)this.jComboBoxid_lineaBusquedaProductosPendientesProductosPendientes.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_grupoBusquedaProductosPendientesProductosPendientes.getSelectedItem()!=null){this.id_linea_grupoBusquedaProductosPendientes=((Linea)this.jComboBoxid_linea_grupoBusquedaProductosPendientesProductosPendientes.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_categoriaBusquedaProductosPendientesProductosPendientes.getSelectedItem()!=null){this.id_linea_categoriaBusquedaProductosPendientes=((Linea)this.jComboBoxid_linea_categoriaBusquedaProductosPendientesProductosPendientes.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_marcaBusquedaProductosPendientesProductosPendientes.getSelectedItem()!=null){this.id_linea_marcaBusquedaProductosPendientes=((Linea)this.jComboBoxid_linea_marcaBusquedaProductosPendientesProductosPendientes.getSelectedItem()).getId();}
		this.fecha_emision_desdeBusquedaProductosPendientes=new Date(this.jDateChooserfecha_emision_desdeBusquedaProductosPendientesProductosPendientes.getDate().getTime());
		this.fecha_emision_hastaBusquedaProductosPendientes=new Date(this.jDateChooserfecha_emision_hastaBusquedaProductosPendientesProductosPendientes.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProductosPendientes(Boolean esInicializar) throws Exception {				
		if(ProductosPendientesJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProductosPendientes();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProductosPendientes() throws Exception {
		this.inicializarActualizarBindingTablaProductosPendientes(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProductosPendientes() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProductosPendientes.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProductosPendientes.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductosPendientes.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProductosPendientesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProductosPendientes.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductosPendientes.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProductosPendientesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProductosPendientesOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosPendientesOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProductosPendientesPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProductosPendientes.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductosPendientes.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProductosPendientesPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProductosPendientes.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProductosPendientes(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=productospendientesLogic.getProductosPendientess().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=productospendientess.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProductosPendientesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProductosPendientes.setModel(new ProductosPendientesModel(this.productospendientesLogic.getProductosPendientess(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProductosPendientes.setModel(new ProductosPendientesModel(this.productospendientess,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProductosPendientes!=null && this.jInternalFrameOrderByProductosPendientes.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProductosPendientes();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProductosPendientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosPendientes,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProductosPendientesPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProductosPendientesConstantesFunciones.SCLASSWEBTITULO,productospendientesConstantesFunciones.resaltarSeleccionarProductosPendientes,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProductosPendientesConstantesFunciones.SCLASSWEBTITULO,productospendientesConstantesFunciones.resaltarSeleccionarProductosPendientes,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProductosPendientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosPendientes,ProductosPendientesConstantesFunciones.LABEL_ID));

		if(this.productospendientesConstantesFunciones.mostraridProductosPendientes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosPendientesConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productospendientesConstantesFunciones.resaltaridProductosPendientes,this.productospendientesConstantesFunciones.activaridProductosPendientes,iSizeTabla,this,true,"idProductosPendientes","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productospendientesConstantesFunciones.resaltaridProductosPendientes,this.productospendientesConstantesFunciones.activaridProductosPendientes,this,true,"idProductosPendientes","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosPendientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosPendientes,ProductosPendientesConstantesFunciones.LABEL_NOMBREEMPRESA));

		if(this.productospendientesConstantesFunciones.mostrarnombre_empresaProductosPendientes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosPendientesConstantesFunciones.LABEL_NOMBREEMPRESA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productospendientesConstantesFunciones.resaltarnombre_empresaProductosPendientes,this.productospendientesConstantesFunciones.activarnombre_empresaProductosPendientes,iSizeTabla,this,true,"nombre_empresaProductosPendientes","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productospendientesConstantesFunciones.resaltarnombre_empresaProductosPendientes,this.productospendientesConstantesFunciones.activarnombre_empresaProductosPendientes,this,true,"nombre_empresaProductosPendientes","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosPendientesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosPendientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosPendientes,ProductosPendientesConstantesFunciones.LABEL_RUCEMPRESA));

		if(this.productospendientesConstantesFunciones.mostrarruc_empresaProductosPendientes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosPendientesConstantesFunciones.LABEL_RUCEMPRESA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productospendientesConstantesFunciones.resaltarruc_empresaProductosPendientes,this.productospendientesConstantesFunciones.activarruc_empresaProductosPendientes,iSizeTabla,this,true,"ruc_empresaProductosPendientes","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productospendientesConstantesFunciones.resaltarruc_empresaProductosPendientes,this.productospendientesConstantesFunciones.activarruc_empresaProductosPendientes,this,true,"ruc_empresaProductosPendientes","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosPendientesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosPendientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosPendientes,ProductosPendientesConstantesFunciones.LABEL_NOMBREPRODUCTO));

		if(this.productospendientesConstantesFunciones.mostrarnombre_productoProductosPendientes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosPendientesConstantesFunciones.LABEL_NOMBREPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productospendientesConstantesFunciones.resaltarnombre_productoProductosPendientes,this.productospendientesConstantesFunciones.activarnombre_productoProductosPendientes,iSizeTabla,this,true,"nombre_productoProductosPendientes","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productospendientesConstantesFunciones.resaltarnombre_productoProductosPendientes,this.productospendientesConstantesFunciones.activarnombre_productoProductosPendientes,this,true,"nombre_productoProductosPendientes","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosPendientesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosPendientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosPendientes,ProductosPendientesConstantesFunciones.LABEL_NOMBREUNIDAD));

		if(this.productospendientesConstantesFunciones.mostrarnombre_unidadProductosPendientes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosPendientesConstantesFunciones.LABEL_NOMBREUNIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productospendientesConstantesFunciones.resaltarnombre_unidadProductosPendientes,this.productospendientesConstantesFunciones.activarnombre_unidadProductosPendientes,iSizeTabla,this,true,"nombre_unidadProductosPendientes","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productospendientesConstantesFunciones.resaltarnombre_unidadProductosPendientes,this.productospendientesConstantesFunciones.activarnombre_unidadProductosPendientes,this,true,"nombre_unidadProductosPendientes","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosPendientesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosPendientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosPendientes,ProductosPendientesConstantesFunciones.LABEL_CANTIDAD));

		if(this.productospendientesConstantesFunciones.mostrarcantidadProductosPendientes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosPendientesConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productospendientesConstantesFunciones.resaltarcantidadProductosPendientes,this.productospendientesConstantesFunciones.activarcantidadProductosPendientes,iSizeTabla,this,true,"cantidadProductosPendientes","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productospendientesConstantesFunciones.resaltarcantidadProductosPendientes,this.productospendientesConstantesFunciones.activarcantidadProductosPendientes,this,true,"cantidadProductosPendientes","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductosPendientesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosPendientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosPendientes,ProductosPendientesConstantesFunciones.LABEL_PRECIO));

		if(this.productospendientesConstantesFunciones.mostrarprecioProductosPendientes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosPendientesConstantesFunciones.LABEL_PRECIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productospendientesConstantesFunciones.resaltarprecioProductosPendientes,this.productospendientesConstantesFunciones.activarprecioProductosPendientes,iSizeTabla,this,true,"precioProductosPendientes","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productospendientesConstantesFunciones.resaltarprecioProductosPendientes,this.productospendientesConstantesFunciones.activarprecioProductosPendientes,this,true,"precioProductosPendientes","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductosPendientesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosPendientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosPendientes,ProductosPendientesConstantesFunciones.LABEL_TOTAL));

		if(this.productospendientesConstantesFunciones.mostrartotalProductosPendientes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosPendientesConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productospendientesConstantesFunciones.resaltartotalProductosPendientes,this.productospendientesConstantesFunciones.activartotalProductosPendientes,iSizeTabla,this,true,"totalProductosPendientes","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productospendientesConstantesFunciones.resaltartotalProductosPendientes,this.productospendientesConstantesFunciones.activartotalProductosPendientes,this,true,"totalProductosPendientes","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductosPendientesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosPendientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosPendientes,ProductosPendientesConstantesFunciones.LABEL_CODIGOPRODUCTO));

		if(this.productospendientesConstantesFunciones.mostrarcodigo_productoProductosPendientes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosPendientesConstantesFunciones.LABEL_CODIGOPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productospendientesConstantesFunciones.resaltarcodigo_productoProductosPendientes,this.productospendientesConstantesFunciones.activarcodigo_productoProductosPendientes,iSizeTabla,this,true,"codigo_productoProductosPendientes","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productospendientesConstantesFunciones.resaltarcodigo_productoProductosPendientes,this.productospendientesConstantesFunciones.activarcodigo_productoProductosPendientes,this,true,"codigo_productoProductosPendientes","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosPendientesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.productospendientesSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productospendientesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productospendientesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductosPendientes.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productospendientesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productospendientesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductosPendientes.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProductosPendientes && this.isPermisoGuardarCambiosProductosPendientes) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.productospendientesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.productospendientesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProductosPendientes.addColumn(tableColumn);
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
			
			this.jTableDatosProductosPendientes.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductosPendientes && this.isPermisoGuardarCambiosProductosPendientes) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductosPendientes && this.isPermisoGuardarCambiosProductosPendientes) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProductosPendientes.moveColumn(this.jTableDatosProductosPendientes.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProductosPendientes.moveColumn(this.jTableDatosProductosPendientes.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProductosPendientes.moveColumn(this.jTableDatosProductosPendientes.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProductosPendientes.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProductosPendientes.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProductosPendientes,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProductosPendientesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProductosPendientes.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProductosPendientes.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProductosPendientesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProductosPendientesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProductosPendientes.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProductosPendientes.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProductosPendientes.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=productospendientesLogic.getProductosPendientess().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=productospendientess.size()-1;
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
		//this.jTableDatosProductosPendientes.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProductosPendientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProductosPendientes();
			
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
				
				//this.isEsNuevoProductosPendientes=false;
					
				ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
			
				if(this.productospendientesSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProductosPendientes==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductosPendientes.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductosPendientes.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientes =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productospendientes =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.productospendientes.getsType().equals("DUPLICADO")
				   || this.productospendientes.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProductosPendientes=true;
				
				} else {
					this.isEsNuevoProductosPendientes=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.productospendientesSessionBean.getEsGuardarRelacionado()) {
					if(this.productospendientes.getId()>=0 && !this.productospendientes.getIsNew()) {						
						this.isEsNuevoProductosPendientes=false;
						
					} else {
						this.isEsNuevoProductosPendientes=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProductosPendientes(esRelaciones);						
				
				this.seleccionarProductosPendientes(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.productospendientes.getId()<0) {
					this.isEsNuevoProductosPendientes=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProductosPendientes(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProductosPendientes(evt,rowIndex);
				}	
				
				if(this.productospendientesSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProductosPendientes: " + this.dDif); 
					}
				}								
				
				ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProductosPendientes(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.productospendientes)) {
					if(this.productospendientes.getId()>0) {
						this.productospendientes.setIsDeleted(true);
						
						this.productospendientessEliminados.add(this.productospendientes);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productospendientesLogic.getProductosPendientess().remove(this.productospendientes);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productospendientess.remove(this.productospendientes);				
					}
					
					
					((ProductosPendientesModel) this.jTableDatosProductosPendientes.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProductosPendientes(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProductosPendientes(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProductosPendientes) {
			
			if(this.jInternalFrameDetalleFormProductosPendientes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductosPendientes.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductosPendientes.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientes =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productospendientes =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProductosPendientesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProductosPendientes(this.productospendientes);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProductosPendientes("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProductosPendientes(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductosPendientes() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductosPendientes(ProductosPendientes productospendientes) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProductosPendientes(productospendientes,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductosPendientes(ProductosPendientes productospendientes,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProductosPendientes(productospendientes);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProductosPendientes(productospendientes,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProductosPendientes(productospendientes);
	}
	
	public void setVariablesObjetoActualToFormularioProductosPendientes(ProductosPendientes productospendientes) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProductosPendientes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProductosPendientes.jLabelidProductosPendientes.setText(productospendientes.getId().toString());
			this.jInternalFrameDetalleFormProductosPendientes.jTextAreanombre_empresaProductosPendientes.setText(productospendientes.getnombre_empresa());
			this.jInternalFrameDetalleFormProductosPendientes.jTextFieldruc_empresaProductosPendientes.setText(productospendientes.getruc_empresa());
			this.jInternalFrameDetalleFormProductosPendientes.jTextAreanombre_productoProductosPendientes.setText(productospendientes.getnombre_producto());
			this.jInternalFrameDetalleFormProductosPendientes.jTextFieldnombre_unidadProductosPendientes.setText(productospendientes.getnombre_unidad());
			this.jInternalFrameDetalleFormProductosPendientes.jTextFieldcantidadProductosPendientes.setText(productospendientes.getcantidad().toString());
			this.jInternalFrameDetalleFormProductosPendientes.jTextFieldprecioProductosPendientes.setText(productospendientes.getprecio().toString());
			this.jInternalFrameDetalleFormProductosPendientes.jTextFieldtotalProductosPendientes.setText(productospendientes.gettotal().toString());
			this.jInternalFrameDetalleFormProductosPendientes.jTextFieldcodigo_productoProductosPendientes.setText(productospendientes.getcodigo_producto());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProductosPendientes productospendientesLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,productospendientesLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProductosPendientes productospendientesLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				productospendientesLocal=this.productospendientes;
			} else {
				productospendientesLocal=this.productospendientesAnterior;
			}
		}
		
		if(this.permiteMantenimiento(productospendientesLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProductosPendientes(productospendientesLocal,true);
					
					if(productospendientesSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(productospendientesLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.productospendientesSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(productospendientesLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProductosPendientes(ProductosPendientes productospendientes,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductosPendientes(productospendientes,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(productospendientes);
	}
	
	public void setVariablesFormularioToObjetoActualProductosPendientes(ProductosPendientes productospendientes,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductosPendientes(productospendientes,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProductosPendientes(ProductosPendientes productospendientes,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProductosPendientes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProductosPendientes.jLabelidProductosPendientes.getText()==null || this.jInternalFrameDetalleFormProductosPendientes.jLabelidProductosPendientes.getText()=="" || this.jInternalFrameDetalleFormProductosPendientes.jLabelidProductosPendientes.getText()=="Id") {
				this.jInternalFrameDetalleFormProductosPendientes.jLabelidProductosPendientes.setText("0");
			}

			if(conColumnasBase) {productospendientes.setId(Long.parseLong(this.jInternalFrameDetalleFormProductosPendientes.jLabelidProductosPendientes.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosPendientesConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosPendientes.jLabelIdProductosPendientes,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productospendientes.setnombre_empresa(this.jInternalFrameDetalleFormProductosPendientes.jTextAreanombre_empresaProductosPendientes.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosPendientesConstantesFunciones.LABEL_NOMBREEMPRESA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosPendientes.jLabelnombre_empresaProductosPendientes,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productospendientes.setruc_empresa(this.jInternalFrameDetalleFormProductosPendientes.jTextFieldruc_empresaProductosPendientes.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosPendientesConstantesFunciones.LABEL_RUCEMPRESA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosPendientes.jLabelruc_empresaProductosPendientes,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productospendientes.setnombre_producto(this.jInternalFrameDetalleFormProductosPendientes.jTextAreanombre_productoProductosPendientes.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosPendientesConstantesFunciones.LABEL_NOMBREPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosPendientes.jLabelnombre_productoProductosPendientes,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productospendientes.setnombre_unidad(this.jInternalFrameDetalleFormProductosPendientes.jTextFieldnombre_unidadProductosPendientes.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosPendientesConstantesFunciones.LABEL_NOMBREUNIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosPendientes.jLabelnombre_unidadProductosPendientes,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productospendientes.setcantidad(Integer.parseInt(this.jInternalFrameDetalleFormProductosPendientes.jTextFieldcantidadProductosPendientes.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosPendientesConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosPendientes.jLabelcantidadProductosPendientes,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productospendientes.setprecio(Double.parseDouble(this.jInternalFrameDetalleFormProductosPendientes.jTextFieldprecioProductosPendientes.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosPendientesConstantesFunciones.LABEL_PRECIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosPendientes.jLabelprecioProductosPendientes,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productospendientes.settotal(Double.parseDouble(this.jInternalFrameDetalleFormProductosPendientes.jTextFieldtotalProductosPendientes.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosPendientesConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosPendientes.jLabeltotalProductosPendientes,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productospendientes.setcodigo_producto(this.jInternalFrameDetalleFormProductosPendientes.jTextFieldcodigo_productoProductosPendientes.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosPendientesConstantesFunciones.LABEL_CODIGOPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosPendientes.jLabelcodigo_productoProductosPendientes,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductosPendientes(ProductosPendientes productospendientesBean,ProductosPendientes productospendientes,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProductosPendientes(ProductosPendientes productospendientesOrigen,ProductosPendientes productospendientes,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productospendientesOrigen.getId()!=null && !productospendientesOrigen.getId().equals(0L))) {productospendientes.setId(productospendientesOrigen.getId());}}
			if(conDefault || (!conDefault && productospendientesOrigen.getfecha_emision_desde()!=null && !productospendientesOrigen.getfecha_emision_desde().equals(new Date()))) {productospendientes.setfecha_emision_desde(productospendientesOrigen.getfecha_emision_desde());}
			if(conDefault || (!conDefault && productospendientesOrigen.getfecha_emision_hasta()!=null && !productospendientesOrigen.getfecha_emision_hasta().equals(new Date()))) {productospendientes.setfecha_emision_hasta(productospendientesOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && productospendientesOrigen.getnombre_empresa()!=null && !productospendientesOrigen.getnombre_empresa().equals(""))) {productospendientes.setnombre_empresa(productospendientesOrigen.getnombre_empresa());}
			if(conDefault || (!conDefault && productospendientesOrigen.getruc_empresa()!=null && !productospendientesOrigen.getruc_empresa().equals(""))) {productospendientes.setruc_empresa(productospendientesOrigen.getruc_empresa());}
			if(conDefault || (!conDefault && productospendientesOrigen.getnombre_producto()!=null && !productospendientesOrigen.getnombre_producto().equals(""))) {productospendientes.setnombre_producto(productospendientesOrigen.getnombre_producto());}
			if(conDefault || (!conDefault && productospendientesOrigen.getnombre_unidad()!=null && !productospendientesOrigen.getnombre_unidad().equals(""))) {productospendientes.setnombre_unidad(productospendientesOrigen.getnombre_unidad());}
			if(conDefault || (!conDefault && productospendientesOrigen.getcantidad()!=null && !productospendientesOrigen.getcantidad().equals(0))) {productospendientes.setcantidad(productospendientesOrigen.getcantidad());}
			if(conDefault || (!conDefault && productospendientesOrigen.getprecio()!=null && !productospendientesOrigen.getprecio().equals(0.0))) {productospendientes.setprecio(productospendientesOrigen.getprecio());}
			if(conDefault || (!conDefault && productospendientesOrigen.gettotal()!=null && !productospendientesOrigen.gettotal().equals(0.0))) {productospendientes.settotal(productospendientesOrigen.gettotal());}
			if(conDefault || (!conDefault && productospendientesOrigen.getcodigo_producto()!=null && !productospendientesOrigen.getcodigo_producto().equals(""))) {productospendientes.setcodigo_producto(productospendientesOrigen.getcodigo_producto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductosPendientes(ProductosPendientes productospendientes) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductosPendientes.jLabelidProductosPendientes.setText(productospendientes.getId().toString());
			this.jInternalFrameDetalleFormProductosPendientes.jTextAreanombre_empresaProductosPendientes.setText(productospendientes.getnombre_empresa());
			this.jInternalFrameDetalleFormProductosPendientes.jTextFieldruc_empresaProductosPendientes.setText(productospendientes.getruc_empresa());
			this.jInternalFrameDetalleFormProductosPendientes.jTextAreanombre_productoProductosPendientes.setText(productospendientes.getnombre_producto());
			this.jInternalFrameDetalleFormProductosPendientes.jTextFieldnombre_unidadProductosPendientes.setText(productospendientes.getnombre_unidad());
			this.jInternalFrameDetalleFormProductosPendientes.jTextFieldcantidadProductosPendientes.setText(productospendientes.getcantidad().toString());
			this.jInternalFrameDetalleFormProductosPendientes.jTextFieldprecioProductosPendientes.setText(productospendientes.getprecio().toString());
			this.jInternalFrameDetalleFormProductosPendientes.jTextFieldtotalProductosPendientes.setText(productospendientes.gettotal().toString());
			this.jInternalFrameDetalleFormProductosPendientes.jTextFieldcodigo_productoProductosPendientes.setText(productospendientes.getcodigo_producto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductosPendientes(ProductosPendientesBean productospendientesBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductosPendientes.jLabelidProductosPendientes.setText(productospendientesBean.getId().toString());
			this.jInternalFrameDetalleFormProductosPendientes.jTextAreanombre_empresaProductosPendientes.setText(productospendientesBean.getnombre_empresa());
			this.jInternalFrameDetalleFormProductosPendientes.jTextFieldruc_empresaProductosPendientes.setText(productospendientesBean.getruc_empresa());
			this.jInternalFrameDetalleFormProductosPendientes.jTextAreanombre_productoProductosPendientes.setText(productospendientesBean.getnombre_producto());
			this.jInternalFrameDetalleFormProductosPendientes.jTextFieldnombre_unidadProductosPendientes.setText(productospendientesBean.getnombre_unidad());
			this.jInternalFrameDetalleFormProductosPendientes.jTextFieldcantidadProductosPendientes.setText(productospendientesBean.getcantidad().toString());
			this.jInternalFrameDetalleFormProductosPendientes.jTextFieldprecioProductosPendientes.setText(productospendientesBean.getprecio().toString());
			this.jInternalFrameDetalleFormProductosPendientes.jTextFieldtotalProductosPendientes.setText(productospendientesBean.gettotal().toString());
			this.jInternalFrameDetalleFormProductosPendientes.jTextFieldcodigo_productoProductosPendientes.setText(productospendientesBean.getcodigo_producto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProductosPendientes(ProductosPendientesParameterReturnGeneral productospendientesReturnGeneral,ProductosPendientesBean productospendientesBean,Boolean conDefault) throws Exception { 
		try {
			ProductosPendientes productospendientesLocal=new ProductosPendientes();
			
			productospendientesLocal=productospendientesReturnGeneral.getProductosPendientes();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productospendientesLocal.getId()!=null && !productospendientesLocal.getId().equals(0L))) {productospendientesBean.setId(productospendientesLocal.getId());}}
			if(conDefault || (!conDefault && productospendientesLocal.getnombre_empresa()!=null && !productospendientesLocal.getnombre_empresa().equals(""))) {productospendientesBean.setnombre_empresa(productospendientesLocal.getnombre_empresa());}
			if(conDefault || (!conDefault && productospendientesLocal.getruc_empresa()!=null && !productospendientesLocal.getruc_empresa().equals(""))) {productospendientesBean.setruc_empresa(productospendientesLocal.getruc_empresa());}
			if(conDefault || (!conDefault && productospendientesLocal.getnombre_producto()!=null && !productospendientesLocal.getnombre_producto().equals(""))) {productospendientesBean.setnombre_producto(productospendientesLocal.getnombre_producto());}
			if(conDefault || (!conDefault && productospendientesLocal.getnombre_unidad()!=null && !productospendientesLocal.getnombre_unidad().equals(""))) {productospendientesBean.setnombre_unidad(productospendientesLocal.getnombre_unidad());}
			if(conDefault || (!conDefault && productospendientesLocal.getcantidad()!=null && !productospendientesLocal.getcantidad().equals(0))) {productospendientesBean.setcantidad(productospendientesLocal.getcantidad());}
			if(conDefault || (!conDefault && productospendientesLocal.getprecio()!=null && !productospendientesLocal.getprecio().equals(0.0))) {productospendientesBean.setprecio(productospendientesLocal.getprecio());}
			if(conDefault || (!conDefault && productospendientesLocal.gettotal()!=null && !productospendientesLocal.gettotal().equals(0.0))) {productospendientesBean.settotal(productospendientesLocal.gettotal());}
			if(conDefault || (!conDefault && productospendientesLocal.getcodigo_producto()!=null && !productospendientesLocal.getcodigo_producto().equals(""))) {productospendientesBean.setcodigo_producto(productospendientesLocal.getcodigo_producto());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProductosPendientesGenerico(Long idProductosPendientesSeleccionado,JComboBox jComboBoxProductosPendientes,List<ProductosPendientes> productospendientessLocal)throws Exception {
		try {
			ProductosPendientes  productospendientesTemp=null;

			for(ProductosPendientes productospendientesAux:productospendientessLocal) {
				if(productospendientesAux.getId()!=null && productospendientesAux.getId().equals(idProductosPendientesSeleccionado)) {
					productospendientesTemp=productospendientesAux;
					break;
				}
			}

			jComboBoxProductosPendientes.setSelectedItem(productospendientesTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProductosPendientesGenerico(JComboBox jComboBoxProductosPendientes,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProductosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProductosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductosPendientes.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProductosPendientes.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductosPendientes.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProductosPendientes.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProductosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProductosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productospendientes=(ProductosPendientes) productospendientesLogic.getProductosPendientess().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productospendientes =(ProductosPendientes) productospendientess.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!productospendientes.getIsNew() && !productospendientes.getIsChanged() && !productospendientes.getIsDeleted()) {
				sDescripcion=productospendientes.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=productospendientes.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!productospendientes.getIsNew() && !productospendientes.getIsChanged() && !productospendientes.getIsDeleted()) {
				sDescripcion=productospendientes.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=productospendientes.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Linea")) {
			//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
			if(!productospendientes.getIsNew() && !productospendientes.getIsChanged() && !productospendientes.getIsDeleted()) {
				sDescripcion=productospendientes.getlinea_descripcion();
			} else {
				//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
				sDescripcion=productospendientes.getlinea_descripcion();
			}
		}

		if(sTipo.equals("LineaGrupo")) {
			//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
			if(!productospendientes.getIsNew() && !productospendientes.getIsChanged() && !productospendientes.getIsDeleted()) {
				sDescripcion=productospendientes.getlineagrupo_descripcion();
			} else {
				//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
				sDescripcion=productospendientes.getlineagrupo_descripcion();
			}
		}

		if(sTipo.equals("LineaCategoria")) {
			//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
			if(!productospendientes.getIsNew() && !productospendientes.getIsChanged() && !productospendientes.getIsDeleted()) {
				sDescripcion=productospendientes.getlineacategoria_descripcion();
			} else {
				//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
				sDescripcion=productospendientes.getlineacategoria_descripcion();
			}
		}

		if(sTipo.equals("LineaMarca")) {
			//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
			if(!productospendientes.getIsNew() && !productospendientes.getIsChanged() && !productospendientes.getIsDeleted()) {
				sDescripcion=productospendientes.getlineamarca_descripcion();
			} else {
				//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
				sDescripcion=productospendientes.getlineamarca_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProductosPendientes productospendientesRow=new ProductosPendientes();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productospendientesRow=(ProductosPendientes) productospendientesLogic.getProductosPendientess().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productospendientesRow=(ProductosPendientes) productospendientess.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProductosPendientes(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProductosPendientes.setVisible((this.isVisibilidadCeldaNuevoProductosPendientes && this.isPermisoNuevoProductosPendientes));			
			this.jButtonDuplicarProductosPendientes.setVisible((this.isVisibilidadCeldaDuplicarProductosPendientes && this.isPermisoDuplicarProductosPendientes));			
			this.jButtonCopiarProductosPendientes.setVisible((this.isVisibilidadCeldaCopiarProductosPendientes && this.isPermisoCopiarProductosPendientes));
			this.jButtonVerFormProductosPendientes.setVisible((this.isVisibilidadCeldaVerFormProductosPendientes && this.isPermisoVerFormProductosPendientes));
			
			this.jButtonAbrirOrderByProductosPendientes.setVisible((this.isVisibilidadCeldaOrdenProductosPendientes && this.isPermisoOrdenProductosPendientes));			
			
			this.jButtonNuevoRelacionesProductosPendientes.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductosPendientes && this.isPermisoNuevoProductosPendientes));			
			this.jButtonNuevoGuardarCambiosProductosPendientes.setVisible((this.isVisibilidadCeldaNuevoProductosPendientes && this.isPermisoNuevoProductosPendientes && this.isPermisoGuardarCambiosProductosPendientes));
			
			if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
			this.jInternalFrameDetalleFormProductosPendientes.jButtonModificarProductosPendientes.setVisible((this.isVisibilidadCeldaModificarProductosPendientes && this.isPermisoActualizarProductosPendientes));	
			this.jInternalFrameDetalleFormProductosPendientes.jButtonActualizarProductosPendientes.setVisible((this.isVisibilidadCeldaActualizarProductosPendientes && this.isPermisoActualizarProductosPendientes));	
			this.jInternalFrameDetalleFormProductosPendientes.jButtonEliminarProductosPendientes.setVisible((this.isVisibilidadCeldaEliminarProductosPendientes && this.isPermisoEliminarProductosPendientes));
			this.jInternalFrameDetalleFormProductosPendientes.jButtonCancelarProductosPendientes.setVisible(this.isVisibilidadCeldaCancelarProductosPendientes);							
			this.jInternalFrameDetalleFormProductosPendientes.jButtonGuardarCambiosProductosPendientes.setVisible((this.isVisibilidadCeldaGuardarProductosPendientes && this.isPermisoGuardarCambiosProductosPendientes));			
			
			}
						
			this.jButtonGuardarCambiosTablaProductosPendientes.setVisible((this.isVisibilidadCeldaGuardarCambiosProductosPendientes && this.isPermisoGuardarCambiosProductosPendientes));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProductosPendientes.setVisible((this.isVisibilidadCeldaNuevoProductosPendientes && this.isPermisoNuevoProductosPendientes));						
			this.jButtonDuplicarToolBarProductosPendientes.setVisible((this.isVisibilidadCeldaDuplicarProductosPendientes && this.isPermisoDuplicarProductosPendientes));						
			this.jButtonCopiarToolBarProductosPendientes.setVisible((this.isVisibilidadCeldaCopiarProductosPendientes && this.isPermisoCopiarProductosPendientes));			
			this.jButtonVerFormToolBarProductosPendientes.setVisible((this.isVisibilidadCeldaVerFormProductosPendientes && this.isPermisoVerFormProductosPendientes));			
			this.jButtonAbrirOrderByToolBarProductosPendientes.setVisible((this.isVisibilidadCeldaOrdenProductosPendientes && this.isPermisoOrdenProductosPendientes));
			this.jButtonNuevoRelacionesToolBarProductosPendientes.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductosPendientes && this.isPermisoNuevoProductosPendientes));			
			this.jButtonNuevoGuardarCambiosToolBarProductosPendientes.setVisible((this.isVisibilidadCeldaNuevoProductosPendientes && this.isPermisoNuevoProductosPendientes && this.isPermisoGuardarCambiosProductosPendientes));			
			
			if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
			this.jInternalFrameDetalleFormProductosPendientes.jButtonModificarToolBarProductosPendientes.setVisible((this.isVisibilidadCeldaModificarProductosPendientes && this.isPermisoActualizarProductosPendientes));	
			this.jInternalFrameDetalleFormProductosPendientes.jButtonActualizarToolBarProductosPendientes.setVisible((this.isVisibilidadCeldaActualizarProductosPendientes  && this.isPermisoActualizarProductosPendientes));	
			this.jInternalFrameDetalleFormProductosPendientes.jButtonEliminarToolBarProductosPendientes.setVisible((this.isVisibilidadCeldaEliminarProductosPendientes && this.isPermisoEliminarProductosPendientes));
			this.jInternalFrameDetalleFormProductosPendientes.jButtonCancelarToolBarProductosPendientes.setVisible(this.isVisibilidadCeldaCancelarProductosPendientes);				
			this.jInternalFrameDetalleFormProductosPendientes.jButtonGuardarCambiosToolBarProductosPendientes.setVisible((this.isVisibilidadCeldaGuardarProductosPendientes && this.isPermisoGuardarCambiosProductosPendientes));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProductosPendientes.setVisible((this.isVisibilidadCeldaGuardarCambiosProductosPendientes && this.isPermisoGuardarCambiosProductosPendientes));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProductosPendientes.setVisible((this.isVisibilidadCeldaNuevoProductosPendientes && this.isPermisoNuevoProductosPendientes));			
			this.jMenuItemDuplicarProductosPendientes.setVisible((this.isVisibilidadCeldaDuplicarProductosPendientes && this.isPermisoDuplicarProductosPendientes));			
			this.jMenuItemCopiarProductosPendientes.setVisible((this.isVisibilidadCeldaCopiarProductosPendientes && this.isPermisoCopiarProductosPendientes));			
			this.jMenuItemVerFormProductosPendientes.setVisible((this.isVisibilidadCeldaVerFormProductosPendientes && this.isPermisoVerFormProductosPendientes));			
			this.jMenuItemAbrirOrderByProductosPendientes.setVisible((this.isVisibilidadCeldaOrdenProductosPendientes && this.isPermisoOrdenProductosPendientes));			
			//this.jMenuItemMostrarOcultarProductosPendientes.setVisible((this.isVisibilidadCeldaOrdenProductosPendientes && this.isPermisoOrdenProductosPendientes));
			this.jMenuItemDetalleAbrirOrderByProductosPendientes.setVisible((this.isVisibilidadCeldaOrdenProductosPendientes && this.isPermisoOrdenProductosPendientes));			
			//this.jMenuItemDetalleMostrarOcultarProductosPendientes.setVisible((this.isVisibilidadCeldaOrdenProductosPendientes && this.isPermisoOrdenProductosPendientes));			
			this.jMenuItemNuevoRelacionesProductosPendientes.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductosPendientes && this.isPermisoNuevoProductosPendientes));			
			this.jMenuItemNuevoGuardarCambiosProductosPendientes.setVisible((this.isVisibilidadCeldaNuevoProductosPendientes && this.isPermisoNuevoProductosPendientes && this.isPermisoGuardarCambiosProductosPendientes));									
			
			if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
			this.jInternalFrameDetalleFormProductosPendientes.jMenuItemModificarProductosPendientes.setVisible((this.isVisibilidadCeldaModificarProductosPendientes && this.isPermisoActualizarProductosPendientes));	
			this.jInternalFrameDetalleFormProductosPendientes.jMenuItemActualizarProductosPendientes.setVisible((this.isVisibilidadCeldaActualizarProductosPendientes && this.isPermisoActualizarProductosPendientes));	
			this.jInternalFrameDetalleFormProductosPendientes.jMenuItemEliminarProductosPendientes.setVisible((this.isVisibilidadCeldaEliminarProductosPendientes && this.isPermisoEliminarProductosPendientes));
			this.jInternalFrameDetalleFormProductosPendientes.jMenuItemCancelarProductosPendientes.setVisible(this.isVisibilidadCeldaCancelarProductosPendientes);				
			}
			
			this.jMenuItemGuardarCambiosProductosPendientes.setVisible((this.isVisibilidadCeldaGuardarProductosPendientes && this.isPermisoGuardarCambiosProductosPendientes));						
			this.jMenuItemGuardarCambiosTablaProductosPendientes.setVisible((this.isVisibilidadCeldaGuardarCambiosProductosPendientes && this.isPermisoGuardarCambiosProductosPendientes));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProductosPendientes=this.jButtonNuevoProductosPendientes.isVisible();
			this.isVisibilidadCeldaDuplicarProductosPendientes=this.jButtonDuplicarProductosPendientes.isVisible();
			this.isVisibilidadCeldaCopiarProductosPendientes=this.jButtonCopiarProductosPendientes.isVisible();
			this.isVisibilidadCeldaVerFormProductosPendientes=this.jButtonVerFormProductosPendientes.isVisible();
			
			this.isVisibilidadCeldaOrdenProductosPendientes=this.jButtonAbrirOrderByProductosPendientes.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProductosPendientes=this.jButtonNuevoRelacionesProductosPendientes.isVisible();
			this.isVisibilidadCeldaModificarProductosPendientes=this.jButtonModificarProductosPendientes.isVisible();
			
			if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
			this.isVisibilidadCeldaActualizarProductosPendientes=this.jInternalFrameDetalleFormProductosPendientes.jButtonActualizarProductosPendientes.isVisible();
			this.isVisibilidadCeldaEliminarProductosPendientes=this.jInternalFrameDetalleFormProductosPendientes.jButtonEliminarProductosPendientes.isVisible();
			this.isVisibilidadCeldaCancelarProductosPendientes=this.jInternalFrameDetalleFormProductosPendientes.jButtonCancelarProductosPendientes.isVisible();
			this.isVisibilidadCeldaGuardarProductosPendientes=this.jInternalFrameDetalleFormProductosPendientes.jButtonGuardarCambiosProductosPendientes.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProductosPendientes=this.jButtonGuardarCambiosTablaProductosPendientes.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProductosPendientes=this.jButtonNuevoToolBarProductosPendientes.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductosPendientes=this.jButtonNuevoRelacionesToolBarProductosPendientes.isVisible();
			
			if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
			this.isVisibilidadCeldaModificarProductosPendientes=this.jInternalFrameDetalleFormProductosPendientes.jButtonModificarToolBarProductosPendientes.isVisible();
			this.isVisibilidadCeldaActualizarProductosPendientes=this.jInternalFrameDetalleFormProductosPendientes.jButtonActualizarToolBarProductosPendientes.isVisible();
			this.isVisibilidadCeldaEliminarProductosPendientes=this.jInternalFrameDetalleFormProductosPendientes.jButtonEliminarToolBarProductosPendientes.isVisible();
			this.isVisibilidadCeldaCancelarProductosPendientes=this.jInternalFrameDetalleFormProductosPendientes.jButtonCancelarToolBarProductosPendientes.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductosPendientes=this.jButtonGuardarCambiosToolBarProductosPendientes.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductosPendientes=this.jButtonGuardarCambiosTablaToolBarProductosPendientes.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProductosPendientes=this.jMenuItemNuevoProductosPendientes.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductosPendientes=this.jMenuItemNuevoRelacionesProductosPendientes.isVisible();
			
			if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
			this.isVisibilidadCeldaModificarProductosPendientes=this.jInternalFrameDetalleFormProductosPendientes.jMenuItemModificarProductosPendientes.isVisible();
			this.isVisibilidadCeldaActualizarProductosPendientes=this.jInternalFrameDetalleFormProductosPendientes.jMenuItemActualizarProductosPendientes.isVisible();
			this.isVisibilidadCeldaEliminarProductosPendientes=this.jInternalFrameDetalleFormProductosPendientes.jMenuItemEliminarProductosPendientes.isVisible();
			this.isVisibilidadCeldaCancelarProductosPendientes=this.jInternalFrameDetalleFormProductosPendientes.jMenuItemCancelarProductosPendientes.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductosPendientes=this.jMenuItemGuardarCambiosProductosPendientes.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductosPendientes=this.jMenuItemGuardarCambiosTablaProductosPendientes.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProductosPendientes(Boolean esInicializar) {
		if(ProductosPendientesJInternalFrame.ISBINDING_MANUAL) {			
			if(this.productospendientesSessionBean.getConGuardarRelaciones()) {
				//if(this.productospendientesSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProductosPendientes();
			}
			
			this.inicializarActualizarBindingBotonesManualProductosPendientes(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProductosPendientes() {
		this.jButtonNuevoProductosPendientes.setVisible(this.isPermisoNuevoProductosPendientes);			
		this.jButtonDuplicarProductosPendientes.setVisible(this.isPermisoDuplicarProductosPendientes);			
		this.jButtonCopiarProductosPendientes.setVisible(this.isPermisoCopiarProductosPendientes);			
		this.jButtonVerFormProductosPendientes.setVisible(this.isPermisoVerFormProductosPendientes);			
		
		this.jButtonAbrirOrderByProductosPendientes.setVisible(this.isPermisoOrdenProductosPendientes);					
		
		this.jButtonNuevoRelacionesProductosPendientes.setVisible(this.isPermisoNuevoProductosPendientes);			
		
		if(this.jInternalFrameDetalleFormProductosPendientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosPendientes.jButtonModificarProductosPendientes.setVisible(this.isPermisoActualizarProductosPendientes);	
			this.jInternalFrameDetalleFormProductosPendientes.jButtonActualizarProductosPendientes.setVisible(this.isPermisoActualizarProductosPendientes);	
			this.jInternalFrameDetalleFormProductosPendientes.jButtonEliminarProductosPendientes.setVisible(this.isPermisoEliminarProductosPendientes);
			this.jInternalFrameDetalleFormProductosPendientes.jButtonCancelarProductosPendientes.setVisible(this.isVisibilidadCeldaCancelarProductosPendientes);						
			this.jInternalFrameDetalleFormProductosPendientes.jButtonGuardarCambiosProductosPendientes.setVisible(this.isPermisoGuardarCambiosProductosPendientes);							
		}
		
		this.jButtonGuardarCambiosTablaProductosPendientes.setVisible(this.isPermisoActualizarProductosPendientes);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProductosPendientes() {
		this.jInternalFrameDetalleFormProductosPendientes.jButtonModificarProductosPendientes.setVisible(this.isPermisoActualizarProductosPendientes);	
		this.jInternalFrameDetalleFormProductosPendientes.jButtonActualizarProductosPendientes.setVisible(this.isPermisoActualizarProductosPendientes);	
		this.jInternalFrameDetalleFormProductosPendientes.jButtonEliminarProductosPendientes.setVisible(this.isPermisoEliminarProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jButtonCancelarProductosPendientes.setVisible(this.isVisibilidadCeldaCancelarProductosPendientes);							
		this.jInternalFrameDetalleFormProductosPendientes.jButtonGuardarCambiosProductosPendientes.setVisible((this.isVisibilidadCeldaGuardarProductosPendientes && this.isPermisoGuardarCambiosProductosPendientes));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProductosPendientes() {
		if(ProductosPendientesJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProductosPendientes();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProductosPendientes() {
	}
	
	public void jTableDatosProductosPendientesListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProductosPendientes(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProductosPendientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosPendientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosPendientes(this.getproductospendientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productospendientes =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productospendientes =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productospendientes==null) {
						this.productospendientes = new ProductosPendientes();
					}

					this.setVariablesFormularioToObjetoActualProductosPendientes(this.productospendientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);
				}

				if(this.productospendientes.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.productospendientes.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosPendientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaProductosPendientesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebProductosPendientes(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosPendientes.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosPendientes.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosPendientes.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientes =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productospendientes =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosPendientes(this.getproductospendientes(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.productospendientesLogic.getConnexion());

				if(this.productospendientes.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.productospendientes.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosPendientes=(TitledBorder)this.jScrollPanelDatosProductosPendientes.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderProductosPendientes.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaProductosPendientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosPendientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosPendientes(this.getproductospendientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productospendientes =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productospendientes =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productospendientes==null) {
						this.productospendientes = new ProductosPendientes();
					}

					this.setVariablesFormularioToObjetoActualProductosPendientes(this.productospendientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);
				}

				if(this.productospendientes.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.productospendientes.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosPendientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaProductosPendientesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebProductosPendientes(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosPendientes.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosPendientes.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosPendientes.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientes =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productospendientes =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosPendientes(this.getproductospendientes(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.productospendientesLogic.getConnexion());

				if(this.productospendientes.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.productospendientes.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosPendientes=(TitledBorder)this.jScrollPanelDatosProductosPendientes.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderProductosPendientes.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaProductosPendientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosPendientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosPendientes(this.getproductospendientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productospendientes =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productospendientes =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productospendientes==null) {
						this.productospendientes = new ProductosPendientes();
					}

					this.setVariablesFormularioToObjetoActualProductosPendientes(this.productospendientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);
				}

				if(this.productospendientes.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.productospendientes.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosPendientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_lineaProductosPendientesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolinea=true;

			idTienePermisolinea=this.tienePermisosUsuarioEnPaginaWebProductosPendientes(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolinea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosPendientes.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosPendientes.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosPendientes.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientes =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productospendientes =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosPendientes(this.getproductospendientes(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);

				this.lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.productospendientesLogic.getConnexion());

				if(this.productospendientes.getid_linea()!=null) {
					this.lineaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineaBeanSwingJInternalFrame.setIdActual(this.productospendientes.getid_linea());
					this.lineaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosPendientes=(TitledBorder)this.jScrollPanelDatosProductosPendientes.getBorder();
				TitledBorder titledBorderlinea=(TitledBorder)this.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlinea.setTitle(titledBorderProductosPendientes.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_lineaProductosPendientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosPendientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosPendientes(this.getproductospendientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productospendientes =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productospendientes =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productospendientes==null) {
						this.productospendientes = new ProductosPendientes();
					}

					this.setVariablesFormularioToObjetoActualProductosPendientes(this.productospendientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);
				}

				if(this.productospendientes.getid_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea = "+this.productospendientes.getid_linea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosPendientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_grupoProductosPendientesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineagrupo=true;

			idTienePermisolineagrupo=this.tienePermisosUsuarioEnPaginaWebProductosPendientes(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineagrupo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosPendientes.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosPendientes.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosPendientes.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientes =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productospendientes =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosPendientes(this.getproductospendientes(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);

				this.lineagrupoBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineagrupoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineagrupoBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.productospendientesLogic.getConnexion());

				if(this.productospendientes.getid_linea_grupo()!=null) {
					this.lineagrupoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineagrupoBeanSwingJInternalFrame.setIdActual(this.productospendientes.getid_linea_grupo());
					this.lineagrupoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineagrupoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosPendientes=(TitledBorder)this.jScrollPanelDatosProductosPendientes.getBorder();
				TitledBorder titledBorderlineagrupo=(TitledBorder)this.lineagrupoBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineagrupo.setTitle(titledBorderProductosPendientes.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_grupoProductosPendientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosPendientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosPendientes(this.getproductospendientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productospendientes =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productospendientes =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productospendientes==null) {
						this.productospendientes = new ProductosPendientes();
					}

					this.setVariablesFormularioToObjetoActualProductosPendientes(this.productospendientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);
				}

				if(this.productospendientes.getid_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_grupo = "+this.productospendientes.getid_linea_grupo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosPendientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_categoriaProductosPendientesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineacategoria=true;

			idTienePermisolineacategoria=this.tienePermisosUsuarioEnPaginaWebProductosPendientes(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineacategoria) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosPendientes.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosPendientes.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosPendientes.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientes =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productospendientes =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosPendientes(this.getproductospendientes(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);

				this.lineacategoriaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineacategoriaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineacategoriaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.productospendientesLogic.getConnexion());

				if(this.productospendientes.getid_linea_categoria()!=null) {
					this.lineacategoriaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineacategoriaBeanSwingJInternalFrame.setIdActual(this.productospendientes.getid_linea_categoria());
					this.lineacategoriaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineacategoriaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosPendientes=(TitledBorder)this.jScrollPanelDatosProductosPendientes.getBorder();
				TitledBorder titledBorderlineacategoria=(TitledBorder)this.lineacategoriaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineacategoria.setTitle(titledBorderProductosPendientes.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_categoriaProductosPendientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosPendientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosPendientes(this.getproductospendientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productospendientes =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productospendientes =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productospendientes==null) {
						this.productospendientes = new ProductosPendientes();
					}

					this.setVariablesFormularioToObjetoActualProductosPendientes(this.productospendientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);
				}

				if(this.productospendientes.getid_linea_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_categoria = "+this.productospendientes.getid_linea_categoria().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosPendientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_marcaProductosPendientesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineamarca=true;

			idTienePermisolineamarca=this.tienePermisosUsuarioEnPaginaWebProductosPendientes(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineamarca) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosPendientes.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosPendientes.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosPendientes.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientes =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productospendientes =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosPendientes(this.getproductospendientes(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);

				this.lineamarcaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineamarcaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineamarcaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.productospendientesLogic.getConnexion());

				if(this.productospendientes.getid_linea_marca()!=null) {
					this.lineamarcaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineamarcaBeanSwingJInternalFrame.setIdActual(this.productospendientes.getid_linea_marca());
					this.lineamarcaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineamarcaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosPendientes=(TitledBorder)this.jScrollPanelDatosProductosPendientes.getBorder();
				TitledBorder titledBorderlineamarca=(TitledBorder)this.lineamarcaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineamarca.setTitle(titledBorderProductosPendientes.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_marcaProductosPendientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosPendientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosPendientes(this.getproductospendientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productospendientes =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productospendientes =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productospendientes==null) {
						this.productospendientes = new ProductosPendientes();
					}

					this.setVariablesFormularioToObjetoActualProductosPendientes(this.productospendientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);
				}

				if(this.productospendientes.getid_linea_marca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_marca = "+this.productospendientes.getid_linea_marca().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosPendientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_desdeProductosPendientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosPendientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosPendientes(this.getproductospendientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productospendientes =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productospendientes =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productospendientes==null) {
						this.productospendientes = new ProductosPendientes();
					}

					this.setVariablesFormularioToObjetoActualProductosPendientes(this.productospendientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);
				}

				if(this.productospendientes.getfecha_emision_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_desde = '"+Funciones2.getStringPostgresDate(this.productospendientes.getfecha_emision_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosPendientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaProductosPendientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosPendientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosPendientes(this.getproductospendientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productospendientes =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productospendientes =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productospendientes==null) {
						this.productospendientes = new ProductosPendientes();
					}

					this.setVariablesFormularioToObjetoActualProductosPendientes(this.productospendientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);
				}

				if(this.productospendientes.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.productospendientes.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosPendientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_empresaProductosPendientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosPendientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosPendientes(this.getproductospendientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productospendientes =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productospendientes =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productospendientes==null) {
						this.productospendientes = new ProductosPendientes();
					}

					this.setVariablesFormularioToObjetoActualProductosPendientes(this.productospendientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);
				}

				if(this.productospendientes.getnombre_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_empresa like '%"+this.productospendientes.getnombre_empresa()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosPendientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonruc_empresaProductosPendientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosPendientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosPendientes(this.getproductospendientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productospendientes =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productospendientes =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productospendientes==null) {
						this.productospendientes = new ProductosPendientes();
					}

					this.setVariablesFormularioToObjetoActualProductosPendientes(this.productospendientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);
				}

				if(this.productospendientes.getruc_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ruc_empresa like '%"+this.productospendientes.getruc_empresa()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosPendientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_productoProductosPendientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosPendientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosPendientes(this.getproductospendientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productospendientes =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productospendientes =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productospendientes==null) {
						this.productospendientes = new ProductosPendientes();
					}

					this.setVariablesFormularioToObjetoActualProductosPendientes(this.productospendientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);
				}

				if(this.productospendientes.getnombre_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_producto like '%"+this.productospendientes.getnombre_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosPendientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_unidadProductosPendientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosPendientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosPendientes(this.getproductospendientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productospendientes =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productospendientes =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productospendientes==null) {
						this.productospendientes = new ProductosPendientes();
					}

					this.setVariablesFormularioToObjetoActualProductosPendientes(this.productospendientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);
				}

				if(this.productospendientes.getnombre_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_unidad like '%"+this.productospendientes.getnombre_unidad()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosPendientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadProductosPendientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosPendientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosPendientes(this.getproductospendientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productospendientes =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productospendientes =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productospendientes==null) {
						this.productospendientes = new ProductosPendientes();
					}

					this.setVariablesFormularioToObjetoActualProductosPendientes(this.productospendientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);
				}

				if(this.productospendientes.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.productospendientes.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosPendientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonprecioProductosPendientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosPendientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosPendientes(this.getproductospendientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productospendientes =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productospendientes =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productospendientes==null) {
						this.productospendientes = new ProductosPendientes();
					}

					this.setVariablesFormularioToObjetoActualProductosPendientes(this.productospendientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);
				}

				if(this.productospendientes.getprecio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where precio = "+this.productospendientes.getprecio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosPendientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalProductosPendientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosPendientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosPendientes(this.getproductospendientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productospendientes =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productospendientes =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productospendientes==null) {
						this.productospendientes = new ProductosPendientes();
					}

					this.setVariablesFormularioToObjetoActualProductosPendientes(this.productospendientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);
				}

				if(this.productospendientes.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.productospendientes.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosPendientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_productoProductosPendientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosPendientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosPendientes(this.getproductospendientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productospendientes =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productospendientes =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productospendientes==null) {
						this.productospendientes = new ProductosPendientes();
					}

					this.setVariablesFormularioToObjetoActualProductosPendientes(this.productospendientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);
				}

				if(this.productospendientes.getcodigo_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_producto like '%"+this.productospendientes.getcodigo_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosPendientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaProductosPendientesProductosPendientesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosPendientes(false,false);

			this.getProductosPendientessBusquedaProductosPendientes();

			this.inicializarActualizarBindingProductosPendientes(false);

			//if(ProductosPendientesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosPendientes(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdBodegaProductosPendientesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosPendientes(false,false);

			this.getProductosPendientessFK_IdBodega();

			this.inicializarActualizarBindingProductosPendientes(false);

			//if(ProductosPendientesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosPendientes(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaProductosPendientesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosPendientes(false,false);

			this.getProductosPendientessFK_IdEmpresa();

			this.inicializarActualizarBindingProductosPendientes(false);

			//if(ProductosPendientesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosPendientes(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaProductosPendientesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosPendientes(false,false);

			this.getProductosPendientessFK_IdLinea();

			this.inicializarActualizarBindingProductosPendientes(false);

			//if(ProductosPendientesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosPendientes(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaCategoriaProductosPendientesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosPendientes(false,false);

			this.getProductosPendientessFK_IdLineaCategoria();

			this.inicializarActualizarBindingProductosPendientes(false);

			//if(ProductosPendientesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosPendientes(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaGrupoProductosPendientesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosPendientes(false,false);

			this.getProductosPendientessFK_IdLineaGrupo();

			this.inicializarActualizarBindingProductosPendientes(false);

			//if(ProductosPendientesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosPendientes(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaMarcaProductosPendientesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosPendientes(false,false);

			this.getProductosPendientessFK_IdLineaMarca();

			this.inicializarActualizarBindingProductosPendientes(false);

			//if(ProductosPendientesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosPendientes(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productospendientesLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProductosPendientes() {
		if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
			this.jInternalFrameDetalleFormProductosPendientes.setVisible(false);	    			
			this.jInternalFrameDetalleFormProductosPendientes.dispose();
			this.jInternalFrameDetalleFormProductosPendientes=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProductosPendientes!=null) {
			this.jInternalFrameReporteDinamicoProductosPendientes.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProductosPendientes.dispose();
			this.jInternalFrameReporteDinamicoProductosPendientes=null;
		}
		
		if(this.jInternalFrameImportacionProductosPendientes!=null) {
			this.jInternalFrameImportacionProductosPendientes.setVisible(false);	    			
			this.jInternalFrameImportacionProductosPendientes.dispose();
			this.jInternalFrameImportacionProductosPendientes=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProductosPendientes();
			
			ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
			
			
			if(sTipo.equals("NuevoProductosPendientes")) {
				jButtonNuevoProductosPendientesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProductosPendientes")) {
				jButtonDuplicarProductosPendientesActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProductosPendientes")) {
				jButtonCopiarProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("VerFormProductosPendientes")) {
				jButtonVerFormProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProductosPendientes")) {
				jButtonNuevoProductosPendientesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProductosPendientes")) {
				jButtonDuplicarProductosPendientesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProductosPendientes")) {
				jButtonNuevoProductosPendientesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProductosPendientes")) {
				jButtonDuplicarProductosPendientesActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProductosPendientes")) {
				jButtonNuevoProductosPendientesActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProductosPendientes")) {
				jButtonNuevoProductosPendientesActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProductosPendientes")) {
				jButtonNuevoProductosPendientesActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProductosPendientes")) {
				jButtonModificarProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProductosPendientes")) {
				jButtonModificarProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProductosPendientes")) {
				jButtonModificarProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProductosPendientes")) {
				jButtonActualizarProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProductosPendientes")) {
				jButtonActualizarProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProductosPendientes")) {
				jButtonActualizarProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("EliminarProductosPendientes")) {
				jButtonEliminarProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProductosPendientes")) {
				jButtonEliminarProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProductosPendientes")) {
				jButtonEliminarProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("CancelarProductosPendientes")) {
				jButtonCancelarProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProductosPendientes")) {
				jButtonCancelarProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProductosPendientes")) {
				jButtonCancelarProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("CerrarProductosPendientes")) {
				jButtonCerrarProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProductosPendientes")) {
				jButtonCerrarProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProductosPendientes")) {
				jButtonCerrarProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProductosPendientes")) {
				jButtonMostrarOcultarProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProductosPendientes")) {
				jButtonCancelarProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProductosPendientes")) {
				jButtonGuardarCambiosProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProductosPendientes")) {
				jButtonGuardarCambiosProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProductosPendientes")) {
				jButtonCopiarProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProductosPendientes")) {
				jButtonVerFormProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProductosPendientes")) {
				jButtonGuardarCambiosProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProductosPendientes")) {
				jButtonCopiarProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProductosPendientes")) {
				jButtonVerFormProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProductosPendientes")) {
				jButtonGuardarCambiosProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProductosPendientes")) {
				jButtonGuardarCambiosProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProductosPendientes")) {
				jButtonGuardarCambiosProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProductosPendientes")) {
				jButtonRecargarInformacionProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProductosPendientes")) {
				jButtonRecargarInformacionProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProductosPendientes")) {
				jButtonRecargarInformacionProductosPendientesActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProductosPendientes")) {
				jButtonAnterioresProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProductosPendientes")) {
				jButtonAnterioresProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProductosPendientes")) {
				jButtonAnterioresProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProductosPendientes")) {
				jButtonSiguientesProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProductosPendientes")) {
				jButtonSiguientesProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProductosPendientes")) {
				jButtonSiguientesProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProductosPendientes") || sTipo.equals("MenuItemDetalleAbrirOrderByProductosPendientes")) {
				jButtonAbrirOrderByProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProductosPendientes") || sTipo.equals("MenuItemDetalleMostrarOcultarProductosPendientes")) {
				jButtonMostrarOcultarProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProductosPendientes")) {
				jButtonNuevoGuardarCambiosProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProductosPendientes")) {
				jButtonNuevoGuardarCambiosProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProductosPendientes")) {
				jButtonNuevoGuardarCambiosProductosPendientesActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProductosPendientes")) {
				jButtonCerrarReporteDinamicoProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProductosPendientes")) {
				jButtonGenerarReporteDinamicoProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProductosPendientes")) {
				
				jButtonGenerarExcelReporteDinamicoProductosPendientesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProductosPendientes")) {
				jButtonCerrarImportacionProductosPendientesActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProductosPendientes")) {
				
				jButtonGenerarImportacionProductosPendientesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProductosPendientes")) {
				
				jButtonAbrirImportacionProductosPendientesActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProductosPendientes")) {
				jComboBoxTiposAccionesProductosPendientesActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProductosPendientes")) {
				jComboBoxTiposRelacionesProductosPendientesActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProductosPendientes")) {
				jComboBoxTiposAccionesProductosPendientesActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProductosPendientes")) {
				
				jComboBoxTiposSeleccionarProductosPendientesActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProductosPendientes")) {
				jTextFieldValorCampoGeneralProductosPendientesActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProductosPendientes")) {
				jButtonAbrirOrderByProductosPendientesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProductosPendientes")) {
				jButtonAbrirOrderByProductosPendientesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProductosPendientes")) {
				jButtonCerrarOrderByProductosPendientesActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductosPendientesBusqueda")) {
				this.jButtonidProductosPendientesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProductosPendientesUpdate")) {
				this.jButtonid_empresaProductosPendientesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProductosPendientesBusqueda")) {
				this.jButtonid_empresaProductosPendientesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaProductosPendientesUpdate")) {
				this.jButtonid_bodegaProductosPendientesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaProductosPendientesBusqueda")) {
				this.jButtonid_bodegaProductosPendientesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaProductosPendientesUpdate")) {
				this.jButtonid_lineaProductosPendientesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaProductosPendientesBusqueda")) {
				this.jButtonid_lineaProductosPendientesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoProductosPendientesUpdate")) {
				this.jButtonid_linea_grupoProductosPendientesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoProductosPendientesBusqueda")) {
				this.jButtonid_linea_grupoProductosPendientesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaProductosPendientesUpdate")) {
				this.jButtonid_linea_categoriaProductosPendientesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaProductosPendientesBusqueda")) {
				this.jButtonid_linea_categoriaProductosPendientesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaProductosPendientesUpdate")) {
				this.jButtonid_linea_marcaProductosPendientesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaProductosPendientesBusqueda")) {
				this.jButtonid_linea_marcaProductosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeProductosPendientesBusqueda")) {
				this.jButtonfecha_emision_desdeProductosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaProductosPendientesBusqueda")) {
				this.jButtonfecha_emision_hastaProductosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_empresaProductosPendientesBusqueda")) {
				this.jButtonnombre_empresaProductosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ruc_empresaProductosPendientesBusqueda")) {
				this.jButtonruc_empresaProductosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoProductosPendientesBusqueda")) {
				this.jButtonnombre_productoProductosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadProductosPendientesBusqueda")) {
				this.jButtonnombre_unidadProductosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadProductosPendientesBusqueda")) {
				this.jButtoncantidadProductosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioProductosPendientesBusqueda")) {
				this.jButtonprecioProductosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalProductosPendientesBusqueda")) {
				this.jButtontotalProductosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_productoProductosPendientesBusqueda")) {
				this.jButtoncodigo_productoProductosPendientesBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaProductosPendientesProductosPendientes")) {
				this.jButtonBusquedaProductosPendientesProductosPendientesActionPerformed(evt);
			}
			
			;
			
			
			ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProductosPendientes();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosPendientesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productospendientes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productospendientes);
				
				ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
				
				


				
				ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosPendientes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosPendientes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProductosPendientes productospendientesLocal=null;
			
			if(!this.getEsControlTabla()) {
				productospendientesLocal=this.productospendientes;
			} else {
				productospendientesLocal=this.productospendientesAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productospendientes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productospendientes);
				
				ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
							
				
				


				
				ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosPendientes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosPendientes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosPendientesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductosPendientes.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesAnterior =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productospendientesAnterior =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
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
			
			ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
			
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
			
			


			
			ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosPendientesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productospendientes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productospendientes);
				
				ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
								
						
				


				
				ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosPendientes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosPendientes.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productospendientes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productospendientes);
				
				ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
								
				
				


				
				ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosPendientes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosPendientes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosPendientesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductosPendientes.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesAnterior =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productospendientesAnterior =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productospendientes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productospendientes);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosPendientesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductosPendientes.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesAnterior =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productospendientesAnterior =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosPendientesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productospendientes);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productospendientes);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productospendientes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productospendientes);
				
				ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
							
				
				


				
				ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosPendientes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosPendientes.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosPendientesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductosPendientes.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productospendientesAnterior =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productospendientesAnterior =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
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
			
			ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
			
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
			
			


			
			ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosPendientesActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productospendientes);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productospendientes);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productospendientes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productospendientes);
				
				ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
								
				
				


				
				ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosPendientes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosPendientes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosPendientesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductosPendientes.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesAnterior =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productospendientesAnterior =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosPendientesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productospendientes);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productospendientes);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosPendientesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productospendientes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productospendientes);
				
				ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProductosPendientes")) {
					jCheckBoxSeleccionarTodosProductosPendientesItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProductosPendientes")) {
					jCheckBoxSeleccionadosProductosPendientesItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProductosPendientes")) {
					
				}
				
				


				
				
				ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosPendientes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosPendientes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.productospendientes);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.productospendientes);
				
				ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
												
				
				


				
				
				ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosPendientes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosPendientes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosPendientesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductosPendientes.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productospendientesAnterior =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productospendientesAnterior =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosPendientesActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productospendientes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productospendientes);
				
				ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
				
				
				ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
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
			
			ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
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
			
			


			
			ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosPendientesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productospendientes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productospendientes);
				
				ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosPendientes.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosPendientes.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productospendientes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productospendientes);
				
				ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
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
				
				


				
				ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosPendientes.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosPendientes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosPendientesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductosPendientes.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productospendientesAnterior =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productospendientesAnterior =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProductosPendientes")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProductosPendientesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProductosPendientes.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.productospendientes =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.productospendientes =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.productospendientes);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProductosPendientes")) {
				
				}
				
				ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProductosPendientes")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProductosPendientes.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProductosPendientes")) {
			
			}
			
			ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProductosPendientes();
			
			ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
			
			if(sTipo.equals("NuevoProductosPendientes")) {
				jButtonNuevoProductosPendientesActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProductosPendientes")) {
				jButtonDuplicarProductosPendientesActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProductosPendientes")) {
				jButtonCopiarProductosPendientesActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProductosPendientes")) {
				jButtonVerFormProductosPendientesActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProductosPendientes")) {
				jButtonNuevoProductosPendientesActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProductosPendientes")) {
				jButtonModificarProductosPendientesActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProductosPendientes")) {
				jButtonActualizarProductosPendientesActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProductosPendientes")) {
				jButtonEliminarProductosPendientesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProductosPendientes")) {
				jButtonGuardarCambiosProductosPendientesActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProductosPendientes")) {
				jButtonCancelarProductosPendientesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProductosPendientes")) {
				jButtonCerrarProductosPendientesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProductosPendientes")) {
				jButtonGuardarCambiosProductosPendientesActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProductosPendientes")) {
				jButtonNuevoGuardarCambiosProductosPendientesActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProductosPendientes")) {
				jButtonAbrirOrderByProductosPendientesActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProductosPendientes")) {
				jButtonRecargarInformacionProductosPendientesActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProductosPendientes")) {
				jButtonAnterioresProductosPendientesActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProductosPendientes")) {
				jButtonSiguientesProductosPendientesActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductosPendientesBusqueda")) {
				this.jButtonidProductosPendientesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProductosPendientesUpdate")) {
				this.jButtonid_empresaProductosPendientesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProductosPendientesBusqueda")) {
				this.jButtonid_empresaProductosPendientesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaProductosPendientesUpdate")) {
				this.jButtonid_bodegaProductosPendientesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaProductosPendientesBusqueda")) {
				this.jButtonid_bodegaProductosPendientesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaProductosPendientesUpdate")) {
				this.jButtonid_lineaProductosPendientesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaProductosPendientesBusqueda")) {
				this.jButtonid_lineaProductosPendientesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoProductosPendientesUpdate")) {
				this.jButtonid_linea_grupoProductosPendientesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoProductosPendientesBusqueda")) {
				this.jButtonid_linea_grupoProductosPendientesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaProductosPendientesUpdate")) {
				this.jButtonid_linea_categoriaProductosPendientesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaProductosPendientesBusqueda")) {
				this.jButtonid_linea_categoriaProductosPendientesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaProductosPendientesUpdate")) {
				this.jButtonid_linea_marcaProductosPendientesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaProductosPendientesBusqueda")) {
				this.jButtonid_linea_marcaProductosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeProductosPendientesBusqueda")) {
				this.jButtonfecha_emision_desdeProductosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaProductosPendientesBusqueda")) {
				this.jButtonfecha_emision_hastaProductosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_empresaProductosPendientesBusqueda")) {
				this.jButtonnombre_empresaProductosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ruc_empresaProductosPendientesBusqueda")) {
				this.jButtonruc_empresaProductosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoProductosPendientesBusqueda")) {
				this.jButtonnombre_productoProductosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadProductosPendientesBusqueda")) {
				this.jButtonnombre_unidadProductosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadProductosPendientesBusqueda")) {
				this.jButtoncantidadProductosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioProductosPendientesBusqueda")) {
				this.jButtonprecioProductosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalProductosPendientesBusqueda")) {
				this.jButtontotalProductosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_productoProductosPendientesBusqueda")) {
				this.jButtoncodigo_productoProductosPendientesBusquedaActionPerformed(evt);
			}
			
			ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProductosPendientes();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProductosPendientes")) {
				closingInternalFrameProductosPendientes();
				
			} else if(sTipo.equals("jButtonCancelarProductosPendientes")) {
				JInternalFrameBase jInternalFrameDetalleFormProductosPendientes = (JInternalFrameBase)evt.getSource();
	            	
	            ProductosPendientesBeanSwingJInternalFrame jInternalFrameParent=(ProductosPendientesBeanSwingJInternalFrame)jInternalFrameDetalleFormProductosPendientes.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProductosPendientesActionPerformed(null);
			}
			
			ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productospendientes,new Object(),this.productospendientesParameterGeneral,this.productospendientesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProductosPendientes(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProductosPendientes(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProductosPendientes(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.productospendientes)) {
			if(!esControlTabla) {
				if(ProductosPendientesJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProductosPendientes(this.productospendientes,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);			
				}
				
				if(this.productospendientesSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProductosPendientes(this.productospendientes,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProductosPendientes(this.productospendientesReturnGeneral,this.productospendientesBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.productospendientesSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProductosPendientes(classes,this.productospendientesReturnGeneral,this.productospendientesBean,false);
					}
						
					if(this.productospendientesReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProductosPendientes(this.productospendientesReturnGeneral.getProductosPendientes());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProductosPendientes(this.productospendientesReturnGeneral.getProductosPendientes());	
					}
						
					if(this.productospendientesReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProductosPendientes(this.productospendientesReturnGeneral.getProductosPendientes(),classes);//this.productospendientesBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProductosPendientes(this.productospendientes,classes);//this.productospendientesBean);									
				}
			
				if(ProductosPendientesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProductosPendientes(this.productospendientes,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosPendientes(this.productospendientes);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.productospendientesAnterior!=null) {
						this.productospendientes=this.productospendientesAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productospendientesSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productospendientesSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.productospendientesReturnGeneral.getProductosPendientes(),productospendientesLogic.getProductosPendientess());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.productospendientesReturnGeneral.getProductosPendientes(),this.productospendientess);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProductosPendientes.repaint();
				
				//((AbstractTableModel) this.jTableDatosProductosPendientes.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProductosPendientes();
			}
		}
	}
	
	public void actualizarVisualTableDatosProductosPendientes() throws Exception {
		
		ProductosPendientesModel productospendientesModel=(ProductosPendientesModel)this.jTableDatosProductosPendientes.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productospendientesModel.productospendientess=this.productospendientesLogic.getProductosPendientess();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			productospendientesModel.productospendientess=this.productospendientess;
		}
		
		
		((ProductosPendientesModel) this.jTableDatosProductosPendientes.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProductosPendientes() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getproductospendientesAnterior(),this.productospendientesLogic.getProductosPendientess());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getproductospendientesAnterior(),this.productospendientess);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProductosPendientes();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProductosPendientes(ProductosPendientes productospendientes,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
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
										
				ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productospendientes,new Object(),generalEntityParameterGeneral,this.productospendientesReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.productospendientesSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProductosPendientesConstantesFunciones.getClassesRelationshipsOfProductosPendientes(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProductosPendientesConstantesFunciones.getClassesRelationshipsFromStringsOfProductosPendientes(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProductosPendientes(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProductosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productospendientes,new Object(),generalEntityParameterGeneral,this.productospendientesReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProductosPendientes(ProductosPendientesBean productospendientesBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProductosPendientes(ArrayList<Classe> classes,ProductosPendientesReturnGeneral productospendientesReturnGeneral,ProductosPendientesBean productospendientesBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProductosPendientes(ProductosPendientes productospendientes,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.productospendientes)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProductosPendientes = new ProductosPendientesDetalleFormJInternalFrame(jDesktopPane,this.productospendientesSessionBean.getConGuardarRelaciones(),this.productospendientesSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.setVisible(false);
		this.jInternalFrameDetalleFormProductosPendientes.setSelected(false);						
		
		this.jInternalFrameDetalleFormProductosPendientes.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProductosPendientes.productospendientesLogic=this.productospendientesLogic;
		
		this.cargarCombosFrameForeignKeyProductosPendientes("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProductosPendientes();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductosPendientes();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProductosPendientes("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProductosPendientes();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProductosPendientes.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductosPendientes"));
		
		this.jInternalFrameDetalleFormProductosPendientes.jButtonModificarProductosPendientes.addActionListener(new ButtonActionListener(this,"ModificarProductosPendientes"));

		
		this.jInternalFrameDetalleFormProductosPendientes.jButtonModificarToolBarProductosPendientes.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductosPendientes"));
					
		this.jInternalFrameDetalleFormProductosPendientes.jMenuItemModificarProductosPendientes.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductosPendientes"));		
		
		
		
		this.jInternalFrameDetalleFormProductosPendientes.jButtonActualizarProductosPendientes.addActionListener (new ButtonActionListener(this,"ActualizarProductosPendientes"));
		
		
		this.jInternalFrameDetalleFormProductosPendientes.jButtonActualizarToolBarProductosPendientes.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductosPendientes"));
						
		this.jInternalFrameDetalleFormProductosPendientes.jMenuItemActualizarProductosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductosPendientes"));		
		
		
		
		this.jInternalFrameDetalleFormProductosPendientes.jButtonEliminarProductosPendientes.addActionListener (new ButtonActionListener(this,"EliminarProductosPendientes"));
		
		
		this.jInternalFrameDetalleFormProductosPendientes.jButtonEliminarToolBarProductosPendientes.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductosPendientes"));
								
		this.jInternalFrameDetalleFormProductosPendientes.jMenuItemEliminarProductosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductosPendientes"));		
		
		
		
		this.jInternalFrameDetalleFormProductosPendientes.jButtonCancelarProductosPendientes.addActionListener (new ButtonActionListener(this,"CancelarProductosPendientes"));
		
		
		this.jInternalFrameDetalleFormProductosPendientes.jButtonCancelarToolBarProductosPendientes.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductosPendientes"));
					
		this.jInternalFrameDetalleFormProductosPendientes.jMenuItemCancelarProductosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductosPendientes"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProductosPendientes.jMenuItemDetalleCerrarProductosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductosPendientes"));		
		
		
		
		this.jInternalFrameDetalleFormProductosPendientes.jButtonGuardarCambiosToolBarProductosPendientes.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductosPendientes"));
		
		
		
		this.jInternalFrameDetalleFormProductosPendientes.jButtonGuardarCambiosToolBarProductosPendientes.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductosPendientes"));
		
		
		
		this.jInternalFrameDetalleFormProductosPendientes.jComboBoxTiposAccionesFormularioProductosPendientes.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductosPendientes"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonidProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"idProductosPendientesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosPendientes.jButtonid_empresaProductosPendientesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductosPendientesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonid_empresaProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductosPendientesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosPendientes.jButtonid_bodegaProductosPendientesUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProductosPendientesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonid_bodegaProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProductosPendientesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosPendientes.jButtonid_lineaProductosPendientesUpdate.addActionListener(new ButtonActionListener(this,"id_lineaProductosPendientesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonid_lineaProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaProductosPendientesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosPendientes.jButtonid_linea_grupoProductosPendientesUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoProductosPendientesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonid_linea_grupoProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoProductosPendientesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosPendientes.jButtonid_linea_categoriaProductosPendientesUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProductosPendientesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonid_linea_categoriaProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProductosPendientesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosPendientes.jButtonid_linea_marcaProductosPendientesUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaProductosPendientesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonid_linea_marcaProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaProductosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonfecha_emision_desdeProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeProductosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonfecha_emision_hastaProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaProductosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonnombre_empresaProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_empresaProductosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonruc_empresaProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"ruc_empresaProductosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonnombre_productoProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoProductosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonnombre_unidadProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadProductosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtoncantidadProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonprecioProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"precioProductosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtontotalProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"totalProductosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtoncodigo_productoProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoProductosPendientesBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProductosPendientes.jTabbedPaneRelacionesProductosPendientes.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductosPendientes"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProductosPendientes"));
		
		if(this.jInternalFrameDetalleFormProductosPendientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosPendientes.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductosPendientes"));
		}
		
		this.jTableDatosProductosPendientes.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProductosPendientes"));
		
		this.jTableDatosProductosPendientes.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProductosPendientes"));
		
		this.jButtonNuevoProductosPendientes.addActionListener(new ButtonActionListener(this,"NuevoProductosPendientes"));
		
		this.jButtonDuplicarProductosPendientes.addActionListener(new ButtonActionListener(this,"DuplicarProductosPendientes"));
		
		this.jButtonCopiarProductosPendientes.addActionListener(new ButtonActionListener(this,"CopiarProductosPendientes"));
		
		this.jButtonVerFormProductosPendientes.addActionListener(new ButtonActionListener(this,"VerFormProductosPendientes"));
		
		
		this.jButtonNuevoToolBarProductosPendientes.addActionListener(new ButtonActionListener(this,"NuevoToolBarProductosPendientes"));
			
		this.jButtonDuplicarToolBarProductosPendientes.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProductosPendientes"));
			
		this.jMenuItemNuevoProductosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProductosPendientes"));
			
		this.jMenuItemDuplicarProductosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProductosPendientes"));		
		
		
		this.jButtonNuevoRelacionesProductosPendientes.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProductosPendientes"));
		
		
		this.jButtonNuevoRelacionesToolBarProductosPendientes.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProductosPendientes"));
			
		this.jMenuItemNuevoRelacionesProductosPendientes.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProductosPendientes"));		
		
		
		if(this.jInternalFrameDetalleFormProductosPendientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosPendientes.jButtonModificarProductosPendientes.addActionListener(new ButtonActionListener(this,"ModificarProductosPendientes"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductosPendientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosPendientes.jButtonModificarToolBarProductosPendientes.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductosPendientes"));
			
			this.jInternalFrameDetalleFormProductosPendientes.jMenuItemModificarProductosPendientes.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductosPendientes"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductosPendientes!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProductosPendientes.jButtonActualizarProductosPendientes.addActionListener (new ButtonActionListener(this,"ActualizarProductosPendientes"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductosPendientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosPendientes.jButtonActualizarToolBarProductosPendientes.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductosPendientes"));
				
			this.jInternalFrameDetalleFormProductosPendientes.jMenuItemActualizarProductosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductosPendientes"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductosPendientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosPendientes.jButtonEliminarProductosPendientes.addActionListener (new ButtonActionListener(this,"EliminarProductosPendientes"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductosPendientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosPendientes.jButtonEliminarToolBarProductosPendientes.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductosPendientes"));
						
			this.jInternalFrameDetalleFormProductosPendientes.jMenuItemEliminarProductosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductosPendientes"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductosPendientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosPendientes.jButtonCancelarProductosPendientes.addActionListener (new ButtonActionListener(this,"CancelarProductosPendientes"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductosPendientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosPendientes.jButtonCancelarToolBarProductosPendientes.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductosPendientes"));
			
			this.jInternalFrameDetalleFormProductosPendientes.jMenuItemCancelarProductosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductosPendientes"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProductosPendientes.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProductosPendientes"));		
		
		
		this.jButtonCerrarProductosPendientes.addActionListener (new ButtonActionListener(this,"CerrarProductosPendientes"));
		
		
		this.jButtonCerrarToolBarProductosPendientes.addActionListener (new ButtonActionListener(this,"CerrarToolBarProductosPendientes"));
			
		this.jMenuItemCerrarProductosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProductosPendientes"));
			
		if(this.jInternalFrameDetalleFormProductosPendientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosPendientes.jMenuItemDetalleCerrarProductosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductosPendientes"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductosPendientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosPendientes.jButtonGuardarCambiosProductosPendientes.addActionListener (new ButtonActionListener(this,"GuardarCambiosProductosPendientes"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductosPendientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosPendientes.jButtonGuardarCambiosToolBarProductosPendientes.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductosPendientes"));
		}
		
		this.jButtonCopiarToolBarProductosPendientes.addActionListener (new ButtonActionListener(this,"CopiarToolBarProductosPendientes"));
			
		this.jButtonVerFormToolBarProductosPendientes.addActionListener (new ButtonActionListener(this,"VerFormToolBarProductosPendientes"));
		
		this.jMenuItemGuardarCambiosProductosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProductosPendientes"));
			
		this.jMenuItemCopiarProductosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProductosPendientes"));		
		
		this.jMenuItemVerFormProductosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProductosPendientes"));		
		
		
		this.jButtonGuardarCambiosTablaProductosPendientes.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductosPendientes"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProductosPendientes.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProductosPendientes"));
			
		this.jMenuItemGuardarCambiosTablaProductosPendientes.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductosPendientes"));		
		
		
		
		this.jButtonRecargarInformacionProductosPendientes.addActionListener (new ButtonActionListener(this,"RecargarInformacionProductosPendientes"));
					
		this.jButtonRecargarInformacionToolBarProductosPendientes.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProductosPendientes"));
		
		this.jMenuItemRecargarInformacionProductosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProductosPendientes"));		
		
		
		
		this.jButtonAnterioresProductosPendientes.addActionListener (new ButtonActionListener(this,"AnterioresProductosPendientes"));
		
		
		this.jButtonAnterioresToolBarProductosPendientes.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProductosPendientes"));
		
		this.jMenuItemAnterioresProductosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProductosPendientes"));		
		
		
		this.jButtonSiguientesProductosPendientes.addActionListener (new ButtonActionListener(this,"SiguientesProductosPendientes"));
		
		
		this.jButtonSiguientesToolBarProductosPendientes.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProductosPendientes"));
			
		this.jMenuItemSiguientesProductosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProductosPendientes"));
			
		this.jMenuItemAbrirOrderByProductosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProductosPendientes"));
			
		this.jMenuItemMostrarOcultarProductosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProductosPendientes"));
			
		this.jMenuItemDetalleAbrirOrderByProductosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProductosPendientes"));
			
		this.jMenuItemDetalleMostarOcultarProductosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProductosPendientes"));		
		
		
		this.jButtonNuevoGuardarCambiosProductosPendientes.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProductosPendientes"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductosPendientes.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProductosPendientes"));
			
		this.jMenuItemNuevoGuardarCambiosProductosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProductosPendientes"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProductosPendientes.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProductosPendientes"));

		this.jCheckBoxSeleccionadosProductosPendientes.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProductosPendientes"));
		
		if(this.jInternalFrameDetalleFormProductosPendientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosPendientes.jComboBoxTiposAccionesFormularioProductosPendientes.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductosPendientes"));
		}
		
		
		this.jComboBoxTiposRelacionesProductosPendientes.addActionListener (new ButtonActionListener(this,"TiposRelacionesProductosPendientes"));
			
		this.jComboBoxTiposAccionesProductosPendientes.addActionListener (new ButtonActionListener(this,"TiposAccionesProductosPendientes"));
					
		this.jComboBoxTiposSeleccionarProductosPendientes.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProductosPendientes"));
			
		this.jTextFieldValorCampoGeneralProductosPendientes.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProductosPendientes"));		
		
		
		if(this.jInternalFrameDetalleFormProductosPendientes!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonidProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"idProductosPendientesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosPendientes.jButtonid_empresaProductosPendientesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductosPendientesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonid_empresaProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductosPendientesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosPendientes.jButtonid_bodegaProductosPendientesUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProductosPendientesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonid_bodegaProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProductosPendientesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosPendientes.jButtonid_lineaProductosPendientesUpdate.addActionListener(new ButtonActionListener(this,"id_lineaProductosPendientesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonid_lineaProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaProductosPendientesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosPendientes.jButtonid_linea_grupoProductosPendientesUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoProductosPendientesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonid_linea_grupoProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoProductosPendientesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosPendientes.jButtonid_linea_categoriaProductosPendientesUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProductosPendientesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonid_linea_categoriaProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProductosPendientesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosPendientes.jButtonid_linea_marcaProductosPendientesUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaProductosPendientesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonid_linea_marcaProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaProductosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonfecha_emision_desdeProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeProductosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonfecha_emision_hastaProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaProductosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonnombre_empresaProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_empresaProductosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonruc_empresaProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"ruc_empresaProductosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonnombre_productoProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoProductosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonnombre_unidadProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadProductosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtoncantidadProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonprecioProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"precioProductosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtontotalProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"totalProductosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtoncodigo_productoProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoProductosPendientesBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaProductosPendientesProductosPendientes.addActionListener(new ButtonActionListener(this,"BusquedaProductosPendientesProductosPendientes"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProductosPendientes!=null) {
				this.jInternalFrameReporteDinamicoProductosPendientes.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductosPendientes"));
				this.jInternalFrameReporteDinamicoProductosPendientes.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductosPendientes"));
				this.jInternalFrameReporteDinamicoProductosPendientes.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductosPendientes"));
			}
			
			//this.jButtonCerrarReporteDinamicoProductosPendientes.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductosPendientes"));				
			//this.jButtonGenerarReporteDinamicoProductosPendientes.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductosPendientes"));
			//this.jButtonGenerarExcelReporteDinamicoProductosPendientes.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductosPendientes"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProductosPendientes!=null) {
				this.jInternalFrameImportacionProductosPendientes.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductosPendientes"));
				this.jInternalFrameImportacionProductosPendientes.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductosPendientes"));
				this.jInternalFrameImportacionProductosPendientes.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductosPendientes"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProductosPendientes.addActionListener (new ButtonActionListener(this,"AbrirOrderByProductosPendientes"));
			
			this.jButtonAbrirOrderByToolBarProductosPendientes.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProductosPendientes"));			
			
			if(this.jInternalFrameOrderByProductosPendientes!=null) {
				this.jInternalFrameOrderByProductosPendientes.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductosPendientes"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProductosPendientes!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProductosPendientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosPendientes.jTabbedPaneRelacionesProductosPendientes.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductosPendientes"));
		
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
            		closingInternalFrameProductosPendientes();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProductosPendientes.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProductosPendientes = (JInternalFrameBase)event.getSource();
	            	
	            ProductosPendientesBeanSwingJInternalFrame jInternalFrameParent=(ProductosPendientesBeanSwingJInternalFrame)jInternalFrameDetalleFormProductosPendientes.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProductosPendientesActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProductosPendientes.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProductosPendientesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProductosPendientes.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProductosPendientes.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosPendientesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosPendientesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosPendientesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProductosPendientes";
		inputMap = this.jButtonNuevoProductosPendientes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProductosPendientes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductosPendientesActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosPendientesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosPendientesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosPendientesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProductosPendientes";
		inputMap = this.jButtonNuevoRelacionesProductosPendientes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProductosPendientes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductosPendientesActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProductosPendientes";
		inputMap = this.jButtonModificarProductosPendientes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProductosPendientes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProductosPendientesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProductosPendientes";
		inputMap = this.jButtonActualizarProductosPendientes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProductosPendientes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProductosPendientesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProductosPendientes";
		inputMap = this.jButtonEliminarProductosPendientes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProductosPendientes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProductosPendientesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProductosPendientes";
		inputMap = this.jButtonCancelarProductosPendientes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProductosPendientes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProductosPendientesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProductosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProductosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProductosPendientes";
		inputMap = this.jButtonCerrarProductosPendientes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProductosPendientes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProductosPendientesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProductosPendientes.jButtonGuardarCambiosProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProductosPendientes";
		inputMap = this.jInternalFrameDetalleFormProductosPendientes.jButtonGuardarCambiosProductosPendientes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProductosPendientes.jButtonGuardarCambiosProductosPendientes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProductosPendientesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProductosPendientes.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProductosPendientesItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProductosPendientes.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProductosPendientesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProductosPendientes.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProductosPendientesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProductosPendientes.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProductosPendientesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonidProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"idProductosPendientesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosPendientes.jButtonid_empresaProductosPendientesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductosPendientesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonid_empresaProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductosPendientesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosPendientes.jButtonid_bodegaProductosPendientesUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProductosPendientesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonid_bodegaProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProductosPendientesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosPendientes.jButtonid_lineaProductosPendientesUpdate.addActionListener(new ButtonActionListener(this,"id_lineaProductosPendientesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonid_lineaProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaProductosPendientesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosPendientes.jButtonid_linea_grupoProductosPendientesUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoProductosPendientesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonid_linea_grupoProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoProductosPendientesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosPendientes.jButtonid_linea_categoriaProductosPendientesUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProductosPendientesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonid_linea_categoriaProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProductosPendientesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosPendientes.jButtonid_linea_marcaProductosPendientesUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaProductosPendientesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonid_linea_marcaProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaProductosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonfecha_emision_desdeProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeProductosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonfecha_emision_hastaProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaProductosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonnombre_empresaProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_empresaProductosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonruc_empresaProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"ruc_empresaProductosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonnombre_productoProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoProductosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonnombre_unidadProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadProductosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtoncantidadProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtonprecioProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"precioProductosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtontotalProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"totalProductosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosPendientes.jButtoncodigo_productoProductosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoProductosPendientesBusqueda"));
		
		
		this.jButtonBusquedaProductosPendientesProductosPendientes.addActionListener(new ButtonActionListener(this,"BusquedaProductosPendientesProductosPendientes"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProductosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProductosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProductosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProductosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProductosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProductosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProductosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProductosPendientesActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProductosPendientes.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProductosPendientes(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProductosPendientes productospendientesAux:this.productospendientesLogic.getProductosPendientess()) {
					productospendientesAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductosPendientes productospendientesAux:productospendientess) {
					productospendientesAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProductosPendientesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductosPendientes(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductosPendientes productospendientesAux:this.productospendientesLogic.getProductosPendientess()) {
						productospendientesAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductosPendientes productospendientesAux:productospendientess) {
						productospendientesAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProductosPendientes productospendientesAux:this.productospendientesLogic.getProductosPendientess()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductosPendientes productospendientesAux:productospendientess) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProductosPendientes(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductosPendientes.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductosPendientes.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductosPendientes,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProductosPendientesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductosPendientes(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProductosPendientes.getSelectedRows();
			
			ProductosPendientes productospendientesLocal=new ProductosPendientes();
			
			//this.seleccionarTodosProductosPendientes(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productospendientesLocal =(ProductosPendientes) this.productospendientesLogic.getProductosPendientess().toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					productospendientesLocal =(ProductosPendientes) this.productospendientess.toArray()[this.jTableDatosProductosPendientes.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				productospendientesLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductosPendientes productospendientesAux:this.productospendientesLogic.getProductosPendientess()) {
						productospendientesAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductosPendientes productospendientesAux:productospendientess) {
						productospendientesAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProductosPendientes(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductosPendientes.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductosPendientes.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductosPendientes,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProductosPendientesItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProductosPendientesParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProductosPendientesActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProductosPendientes(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProductosPendientes.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductosPendientes productospendientesAux:this.productospendientesLogic.getProductosPendientess()) {
				
						if(sTipoSeleccionar.equals(ProductosPendientesConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							productospendientesAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosPendientesConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							productospendientesAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosPendientesConstantesFunciones.LABEL_NOMBREEMPRESA)) {
							existe=true;
							productospendientesAux.setnombre_empresa(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosPendientesConstantesFunciones.LABEL_RUCEMPRESA)) {
							existe=true;
							productospendientesAux.setruc_empresa(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosPendientesConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							productospendientesAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosPendientesConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							productospendientesAux.setnombre_unidad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosPendientesConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							productospendientesAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosPendientesConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							productospendientesAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosPendientesConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							productospendientesAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosPendientesConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
							existe=true;
							productospendientesAux.setcodigo_producto(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductosPendientes productospendientesAux:productospendientess) {
					
						if(sTipoSeleccionar.equals(ProductosPendientesConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							productospendientesAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosPendientesConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							productospendientesAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosPendientesConstantesFunciones.LABEL_NOMBREEMPRESA)) {
							existe=true;
							productospendientesAux.setnombre_empresa(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosPendientesConstantesFunciones.LABEL_RUCEMPRESA)) {
							existe=true;
							productospendientesAux.setruc_empresa(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosPendientesConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							productospendientesAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosPendientesConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							productospendientesAux.setnombre_unidad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosPendientesConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							productospendientesAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosPendientesConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							productospendientesAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosPendientesConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							productospendientesAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosPendientesConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
							existe=true;
							productospendientesAux.setcodigo_producto(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProductosPendientes(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProductosPendientesActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProductosPendientes(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProductosPendientes=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProductosPendientes.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProductosPendientes.jComboBoxTiposAccionesFormularioProductosPendientes.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProductosPendientes) {				
					conSplash=true;//false;										
					
					//this.startProcessProductosPendientes(conSplash);
				
					this.generarReporteProductosPendientessSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductosPendientes.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductosPendientes.jComboBoxTiposAccionesFormularioProductosPendientes.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProductosPendientessSeleccionados();
				//this.jComboBoxTiposAccionesProductosPendientes.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductosPendientessSeleccionados(false);
				//this.jComboBoxTiposAccionesProductosPendientes.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductosPendientessSeleccionados(true);
				//this.jComboBoxTiposAccionesProductosPendientes.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductosPendientes();
				
				this.exportarProductosPendientessSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductosPendientes.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductosPendientes.jComboBoxTiposAccionesFormularioProductosPendientes.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProductosPendientess();
				//this.importarProductosPendientess();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductosPendientes.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductosPendientes.jComboBoxTiposAccionesFormularioProductosPendientes.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductosPendientes();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProductosPendientessSeleccionados();
				//this.jComboBoxTiposAccionesProductosPendientes.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Productos Pendientes", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProductosPendientes();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProductosPendientes)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProductosPendientes(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Productos Pendientes",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductosPendientes.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductosPendientes.jComboBoxTiposAccionesFormularioProductosPendientes.setSelectedIndex(0);					
				}	
			} 			
			else if(ProductosPendientesBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProductosPendientes) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProductosPendientes(conSplash);
					
						//this.actualizarParametrosGeneralProductosPendientes();
						
						this.generarReporteProcesoAccionProductosPendientessSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProductosPendientes.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProductosPendientes.jComboBoxTiposAccionesFormularioProductosPendientes.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProductosPendientesBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Productos PendientesES SELECCIONADOS?", "MANTENIMIENTO DE Productos Pendientes", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProductosPendientes();
				
						this.actualizarParametrosGeneralProductosPendientes();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.productospendientesReturnGeneral=productospendientesLogic.procesarAccionProductosPendientessWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.productospendientesLogic.getProductosPendientess(),this.productospendientesParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProductosPendientesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductosPendientes.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductosPendientes.jComboBoxTiposAccionesFormularioProductosPendientes.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProductosPendientes();
					
					ProductosPendientesBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProductosPendientesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductosPendientes.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductosPendientes.jComboBoxTiposAccionesFormularioProductosPendientes.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProductosPendientes(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProductosPendientesActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProductosPendientes();
			
			if(this.jInternalFrameDetalleFormProductosPendientes==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProductosPendientes> productospendientessSeleccionados=new ArrayList<ProductosPendientes>();		
			ProductosPendientes productospendientes=new ProductosPendientes();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProductosPendientes(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProductosPendientes.getSelectedItem();
			
			
			
			
			productospendientessSeleccionados=this.getProductosPendientessSeleccionados(true);
			//this.sTipoAccion;
			
			if(productospendientessSeleccionados.size()==1) {
				for(ProductosPendientes productospendientesAux:productospendientessSeleccionados) {
					productospendientes=productospendientesAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProductosPendientes();
			
      		//this.finishProcessProductosPendientes(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProductosPendientesReturnGeneral() throws Exception {
		if(this.productospendientesReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.productospendientesReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.productospendientesReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.productospendientesReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.productospendientesReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.productospendientesReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProductosPendientes(false);
		}
		
		if(this.productospendientesReturnGeneral.getConRetornoLista() || this.productospendientesReturnGeneral.getConRetornoObjeto()) {
			if(this.productospendientesReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productospendientesLogic.setProductosPendientess(this.productospendientesReturnGeneral.getProductosPendientess());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProductosPendientes(false);
		}
	}
	
	public void actualizarParametrosGeneralProductosPendientes() throws Exception {
		
		
	}
	
	public ArrayList<ProductosPendientes> getProductosPendientessSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProductosPendientes> productospendientessSeleccionados=new ArrayList<ProductosPendientes>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProductosPendientes) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProductosPendientes productospendientesAux:productospendientesLogic.getProductosPendientess()) {
					if(productospendientesAux.getIsSelected()) {
						productospendientessSeleccionados.add(productospendientesAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductosPendientes productospendientesAux:this.productospendientess) {
					if(productospendientesAux.getIsSelected()) {
						productospendientessSeleccionados.add(productospendientesAux);				
					}
				}
			}
			
			if(productospendientessSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						productospendientessSeleccionados.addAll(this.productospendientesLogic.getProductosPendientess());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						productospendientessSeleccionados.addAll(this.productospendientess);				
					}
				}
			}
		} else {
			productospendientessSeleccionados.add(this.productospendientes);
		}
		
		return productospendientessSeleccionados;
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
	
	public void generarReporteProductosPendientessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProductosPendientessSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProductosPendientessSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductosPendientessSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductosPendientessSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Productos Pendientes",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProductosPendientessSeleccionados() throws Exception {
		ArrayList<ProductosPendientes> productospendientessSeleccionados=new ArrayList<ProductosPendientes>();		
		
		productospendientessSeleccionados=this.getProductosPendientessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProductosPendientess("Todos",productospendientessSeleccionados);
		
	}	
	
	public void generarReporteNormalProductosPendientessSeleccionados() throws Exception {
		ArrayList<ProductosPendientes> productospendientessSeleccionados=new ArrayList<ProductosPendientes>();		
		
		productospendientessSeleccionados=this.getProductosPendientessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProductosPendientess("Todos",productospendientessSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProductosPendientessSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProductosPendientes> productospendientessSeleccionados=new ArrayList<ProductosPendientes>();
		
		productospendientessSeleccionados=this.getProductosPendientessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProductosPendientess("Todos",productospendientessSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProductosPendientessSeleccionados() throws Exception {
		ArrayList<ProductosPendientes> productospendientessSeleccionados=new ArrayList<ProductosPendientes>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProductosPendientes();
		
		
		productospendientessSeleccionados=this.getProductosPendientessSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProductosPendientes();
		
		
		//this.generarReporteProductosPendientess("Todos",productospendientessSeleccionados ,productospendientesImplementable,productospendientesImplementableHome);
	}
	
	public void mostrarImportacionProductosPendientess() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProductosPendientes();
		
		this.abrirFrameImportacionProductosPendientes();		
		
			
		//this.generarReporteProductosPendientess("Todos",productospendientessSeleccionados ,productospendientesImplementable,productospendientesImplementableHome);
	}
	
	public void importarProductosPendientess() throws Exception {		
	
	}
	
	public void exportarProductosPendientessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProductosPendientessSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProductosPendientessSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProductosPendientessSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Productos Pendientes",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProductosPendientessSeleccionados() throws Exception {
		ArrayList<ProductosPendientes> productospendientessSeleccionados=new ArrayList<ProductosPendientes>();		
		
		productospendientessSeleccionados=this.getProductosPendientessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productospendientes."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProductosPendientes(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProductosPendientes productospendientesAux:productospendientessSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProductosPendientes(productospendientesAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//productospendientesAux.setsDetalleGeneralEntityReporte(productospendientesAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productospendientesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Pendientes",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProductosPendientes(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProductosPendientesConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosPendientesConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosPendientesConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosPendientesConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosPendientesConstantesFunciones.LABEL_IDLINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosPendientesConstantesFunciones.LABEL_IDLINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosPendientesConstantesFunciones.LABEL_IDLINEACATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosPendientesConstantesFunciones.LABEL_IDLINEAMARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosPendientesConstantesFunciones.LABEL_FECHAEMISIONDESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosPendientesConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosPendientesConstantesFunciones.LABEL_NOMBREEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosPendientesConstantesFunciones.LABEL_RUCEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosPendientesConstantesFunciones.LABEL_NOMBREPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosPendientesConstantesFunciones.LABEL_NOMBREUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosPendientesConstantesFunciones.LABEL_CANTIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosPendientesConstantesFunciones.LABEL_PRECIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosPendientesConstantesFunciones.LABEL_TOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosPendientesConstantesFunciones.LABEL_CODIGOPRODUCTO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProductosPendientes(ProductosPendientes productospendientes,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=productospendientes.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=productospendientes.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=productospendientes.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productospendientes.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productospendientes.getlinea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productospendientes.getlineagrupo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productospendientes.getlineacategoria_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productospendientes.getlineamarca_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productospendientes.getfecha_emision_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productospendientes.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productospendientes.getnombre_empresa();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productospendientes.getruc_empresa();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productospendientes.getnombre_producto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productospendientes.getnombre_unidad();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productospendientes.getcantidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productospendientes.getprecio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productospendientes.gettotal().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productospendientes.getcodigo_producto();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProductosPendientessSeleccionados() throws Exception {
		ArrayList<ProductosPendientes> productospendientessSeleccionados=new ArrayList<ProductosPendientes>();		
		
		productospendientessSeleccionados=this.getProductosPendientessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productospendientes.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProductosPendientess");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProductosPendientes(row);				
				iRow++;
			}				
			
			for(ProductosPendientes productospendientesAux:productospendientessSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProductosPendientes(productospendientesAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productospendientesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Pendientes",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProductosPendientessSeleccionados() throws Exception {
		ArrayList<ProductosPendientes> productospendientessSeleccionados=new ArrayList<ProductosPendientes>();		
		
		productospendientessSeleccionados=this.getProductosPendientessSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productospendientes.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("productospendientess");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("productospendientes");
			//elementRoot.appendChild(element);
		
			for(ProductosPendientes productospendientesAux:productospendientessSeleccionados) {
				element = document.createElement("productospendientes");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProductosPendientes(productospendientesAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productospendientesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Pendientes",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProductosPendientes(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_IDLINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_IDLINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_IDLINEACATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_IDLINEAMARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_NOMBREEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_RUCEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_NOMBREPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_NOMBREUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_CANTIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_PRECIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_TOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosPendientesConstantesFunciones.LABEL_CODIGOPRODUCTO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProductosPendientes(ProductosPendientes productospendientes,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(productospendientes.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(productospendientes.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productospendientes.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productospendientes.getlinea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productospendientes.getlineagrupo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productospendientes.getlineacategoria_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productospendientes.getlineamarca_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productospendientes.getfecha_emision_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(productospendientes.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(productospendientes.getnombre_empresa());
		cell = row.createCell(iColumn++);cell.setCellValue(productospendientes.getruc_empresa());
		cell = row.createCell(iColumn++);cell.setCellValue(productospendientes.getnombre_producto());
		cell = row.createCell(iColumn++);cell.setCellValue(productospendientes.getnombre_unidad());
		cell = row.createCell(iColumn++);cell.setCellValue(productospendientes.getcantidad());
		cell = row.createCell(iColumn++);cell.setCellValue(productospendientes.getprecio());
		cell = row.createCell(iColumn++);cell.setCellValue(productospendientes.gettotal());
		cell = row.createCell(iColumn++);cell.setCellValue(productospendientes.getcodigo_producto());				
	}
	
	public void setFilaDatosExportarXmlProductosPendientes(ProductosPendientes productospendientes,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProductosPendientesConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(productospendientes.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProductosPendientesConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(productospendientes.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ProductosPendientesConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(productospendientes.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementbodega_descripcion = document.createElement(ProductosPendientesConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(productospendientes.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementlinea_descripcion = document.createElement(ProductosPendientesConstantesFunciones.IDLINEA);
		elementlinea_descripcion.appendChild(document.createTextNode(productospendientes.getlinea_descripcion()));
		element.appendChild(elementlinea_descripcion);

		Element elementlineagrupo_descripcion = document.createElement(ProductosPendientesConstantesFunciones.IDLINEAGRUPO);
		elementlineagrupo_descripcion.appendChild(document.createTextNode(productospendientes.getlineagrupo_descripcion()));
		element.appendChild(elementlineagrupo_descripcion);

		Element elementlineacategoria_descripcion = document.createElement(ProductosPendientesConstantesFunciones.IDLINEACATEGORIA);
		elementlineacategoria_descripcion.appendChild(document.createTextNode(productospendientes.getlineacategoria_descripcion()));
		element.appendChild(elementlineacategoria_descripcion);

		Element elementlineamarca_descripcion = document.createElement(ProductosPendientesConstantesFunciones.IDLINEAMARCA);
		elementlineamarca_descripcion.appendChild(document.createTextNode(productospendientes.getlineamarca_descripcion()));
		element.appendChild(elementlineamarca_descripcion);

		Element elementfecha_emision_desde = document.createElement(ProductosPendientesConstantesFunciones.FECHAEMISIONDESDE);
		elementfecha_emision_desde.appendChild(document.createTextNode(productospendientes.getfecha_emision_desde().toString().trim()));
		element.appendChild(elementfecha_emision_desde);

		Element elementfecha_emision_hasta = document.createElement(ProductosPendientesConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(productospendientes.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementnombre_empresa = document.createElement(ProductosPendientesConstantesFunciones.NOMBREEMPRESA);
		elementnombre_empresa.appendChild(document.createTextNode(productospendientes.getnombre_empresa().trim()));
		element.appendChild(elementnombre_empresa);

		Element elementruc_empresa = document.createElement(ProductosPendientesConstantesFunciones.RUCEMPRESA);
		elementruc_empresa.appendChild(document.createTextNode(productospendientes.getruc_empresa().trim()));
		element.appendChild(elementruc_empresa);

		Element elementnombre_producto = document.createElement(ProductosPendientesConstantesFunciones.NOMBREPRODUCTO);
		elementnombre_producto.appendChild(document.createTextNode(productospendientes.getnombre_producto().trim()));
		element.appendChild(elementnombre_producto);

		Element elementnombre_unidad = document.createElement(ProductosPendientesConstantesFunciones.NOMBREUNIDAD);
		elementnombre_unidad.appendChild(document.createTextNode(productospendientes.getnombre_unidad().trim()));
		element.appendChild(elementnombre_unidad);

		Element elementcantidad = document.createElement(ProductosPendientesConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(productospendientes.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);

		Element elementprecio = document.createElement(ProductosPendientesConstantesFunciones.PRECIO);
		elementprecio.appendChild(document.createTextNode(productospendientes.getprecio().toString().trim()));
		element.appendChild(elementprecio);

		Element elementtotal = document.createElement(ProductosPendientesConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(productospendientes.gettotal().toString().trim()));
		element.appendChild(elementtotal);

		Element elementcodigo_producto = document.createElement(ProductosPendientesConstantesFunciones.CODIGOPRODUCTO);
		elementcodigo_producto.appendChild(document.createTextNode(productospendientes.getcodigo_producto().trim()));
		element.appendChild(elementcodigo_producto);
	}
	
	public void generarReporteGroupGenericoProductosPendientessSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProductosPendientes> productospendientessSeleccionados=new ArrayList<ProductosPendientes>();
		
		productospendientessSeleccionados=this.getProductosPendientessSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProductosPendientes(productospendientessSeleccionados);
		
		this.generarReporteProductosPendientess("Todos",productospendientessSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProductosPendientes(ArrayList<ProductosPendientes> productospendientessSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProductosPendientes productospendientesAux:productospendientessSeleccionados) {
				productospendientesAux.setsDetalleGeneralEntityReporte(productospendientesAux.toString());
			
				if(sTipoSeleccionar.equals(ProductosPendientesConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					productospendientesAux.setsDescripcionGeneralEntityReporte1(productospendientesAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosPendientesConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					productospendientesAux.setsDescripcionGeneralEntityReporte1(productospendientesAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosPendientesConstantesFunciones.LABEL_IDLINEA)) {
					existe=true;
					productospendientesAux.setsDescripcionGeneralEntityReporte1(productospendientesAux.getlinea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosPendientesConstantesFunciones.LABEL_IDLINEAGRUPO)) {
					existe=true;
					productospendientesAux.setsDescripcionGeneralEntityReporte1(productospendientesAux.getlineagrupo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosPendientesConstantesFunciones.LABEL_IDLINEACATEGORIA)) {
					existe=true;
					productospendientesAux.setsDescripcionGeneralEntityReporte1(productospendientesAux.getlineacategoria_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosPendientesConstantesFunciones.LABEL_IDLINEAMARCA)) {
					existe=true;
					productospendientesAux.setsDescripcionGeneralEntityReporte1(productospendientesAux.getlineamarca_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosPendientesConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
					existe=true;
					productospendientesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(productospendientesAux.getfecha_emision_desde()));
				}
				 else if(sTipoSeleccionar.equals(ProductosPendientesConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					productospendientesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(productospendientesAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(ProductosPendientesConstantesFunciones.LABEL_NOMBREEMPRESA)) {
					existe=true;
					productospendientesAux.setsDescripcionGeneralEntityReporte1(productospendientesAux.getnombre_empresa());
				}
				 else if(sTipoSeleccionar.equals(ProductosPendientesConstantesFunciones.LABEL_RUCEMPRESA)) {
					existe=true;
					productospendientesAux.setsDescripcionGeneralEntityReporte1(productospendientesAux.getruc_empresa());
				}
				 else if(sTipoSeleccionar.equals(ProductosPendientesConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
					existe=true;
					productospendientesAux.setsDescripcionGeneralEntityReporte1(productospendientesAux.getnombre_producto());
				}
				 else if(sTipoSeleccionar.equals(ProductosPendientesConstantesFunciones.LABEL_NOMBREUNIDAD)) {
					existe=true;
					productospendientesAux.setsDescripcionGeneralEntityReporte1(productospendientesAux.getnombre_unidad());
				}
				 else if(sTipoSeleccionar.equals(ProductosPendientesConstantesFunciones.LABEL_CANTIDAD)) {
					existe=true;
					productospendientesAux.setsDescripcionGeneralEntityReporte1(productospendientesAux.getcantidad().toString());
				}
				 else if(sTipoSeleccionar.equals(ProductosPendientesConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
					existe=true;
					productospendientesAux.setsDescripcionGeneralEntityReporte1(productospendientesAux.getcodigo_producto());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProductosPendientes(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProductosPendientes=true;
				this.isVisibilidadCeldaNuevoRelacionesProductosPendientes=true;
				this.isVisibilidadCeldaGuardarCambiosProductosPendientes=true;
			}
			
			this.isVisibilidadCeldaModificarProductosPendientes=false;
			this.isVisibilidadCeldaActualizarProductosPendientes=false;
			this.isVisibilidadCeldaEliminarProductosPendientes=false;
			this.isVisibilidadCeldaCancelarProductosPendientes=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosPendientes=true;
				} else {
					this.isVisibilidadCeldaGuardarProductosPendientes=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProductosPendientes=false;
			this.isVisibilidadCeldaNuevoRelacionesProductosPendientes=false;
			this.isVisibilidadCeldaGuardarCambiosProductosPendientes=false;
			this.isVisibilidadCeldaModificarProductosPendientes=false;
			this.isVisibilidadCeldaActualizarProductosPendientes=true;
			this.isVisibilidadCeldaEliminarProductosPendientes=false;
			this.isVisibilidadCeldaCancelarProductosPendientes=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosPendientes=true;
				} else {
					this.isVisibilidadCeldaGuardarProductosPendientes=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProductosPendientes=false;
			this.isVisibilidadCeldaNuevoRelacionesProductosPendientes=false;
			this.isVisibilidadCeldaGuardarCambiosProductosPendientes=false;
			this.isVisibilidadCeldaModificarProductosPendientes=false;
			this.isVisibilidadCeldaActualizarProductosPendientes=true;
			this.isVisibilidadCeldaEliminarProductosPendientes=true;
			this.isVisibilidadCeldaCancelarProductosPendientes=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosPendientes=true;
				} else {
					this.isVisibilidadCeldaGuardarProductosPendientes=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProductosPendientes=false;
			this.isVisibilidadCeldaNuevoRelacionesProductosPendientes=false;
			this.isVisibilidadCeldaGuardarCambiosProductosPendientes=false;
			this.isVisibilidadCeldaModificarProductosPendientes=false;
			this.isVisibilidadCeldaActualizarProductosPendientes=true;
			this.isVisibilidadCeldaEliminarProductosPendientes=false;
			this.isVisibilidadCeldaCancelarProductosPendientes=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosPendientes=false;
				} else {
					this.isVisibilidadCeldaGuardarProductosPendientes=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProductosPendientes=true;
			this.isVisibilidadCeldaNuevoRelacionesProductosPendientes=true;
			this.isVisibilidadCeldaGuardarCambiosProductosPendientes=true;
			this.isVisibilidadCeldaModificarProductosPendientes=false;
			this.isVisibilidadCeldaActualizarProductosPendientes=false;
			this.isVisibilidadCeldaEliminarProductosPendientes=false;
			this.isVisibilidadCeldaCancelarProductosPendientes=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosPendientes=true;
				} else {
					this.isVisibilidadCeldaGuardarProductosPendientes=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProductosPendientes=false;
			this.isVisibilidadCeldaNuevoRelacionesProductosPendientes=false;
			this.isVisibilidadCeldaGuardarCambiosProductosPendientes=false;
			this.isVisibilidadCeldaActualizarProductosPendientes=false;
			this.isVisibilidadCeldaEliminarProductosPendientes=false;
			this.isVisibilidadCeldaCancelarProductosPendientes=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosPendientes=false;
				} else {
					this.isVisibilidadCeldaGuardarProductosPendientes=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProductosPendientes=false;
			this.isVisibilidadCeldaNuevoRelacionesProductosPendientes=false;
			this.isVisibilidadCeldaGuardarCambiosProductosPendientes=false;
			this.isVisibilidadCeldaModificarProductosPendientes=true;
			this.isVisibilidadCeldaActualizarProductosPendientes=false;
			this.isVisibilidadCeldaEliminarProductosPendientes=false;
			this.isVisibilidadCeldaCancelarProductosPendientes=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosPendientes=false;
				} else {
					this.isVisibilidadCeldaGuardarProductosPendientes=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProductosPendientesJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProductosPendientes=true;
			this.isVisibilidadCeldaNuevoRelacionesProductosPendientes=true;
			this.isVisibilidadCeldaGuardarCambiosProductosPendientes=true;
		} else {
			this.actualizarEstadoPanelsProductosPendientes(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProductosPendientes=false;
			//this.isVisibilidadCeldaVerFormProductosPendientes=false;
			this.isVisibilidadCeldaDuplicarProductosPendientes=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!productospendientesSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProductosPendientes=false;
		} else {
			this.isVisibilidadCeldaNuevoProductosPendientes=false;
			this.isVisibilidadCeldaGuardarCambiosProductosPendientes=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(productospendientesSessionBean.getEsGuardarRelacionado()) {
			if(!productospendientesSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProductosPendientes=false;												
			}
			
			this.jButtonCerrarProductosPendientes.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProductosPendientes=false;
		}
		
		if(!this.permiteMantenimiento(this.productospendientes)) {
			this.isVisibilidadCeldaActualizarProductosPendientes=false;
			this.isVisibilidadCeldaEliminarProductosPendientes=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProductosPendientes=false;
		this.isVisibilidadCeldaNuevoRelacionesProductosPendientes=false;
		this.isVisibilidadCeldaGuardarCambiosProductosPendientes=false;
		//this.isVisibilidadCeldaModificarProductosPendientes=true;
		this.isVisibilidadCeldaActualizarProductosPendientes=false;
		this.isVisibilidadCeldaEliminarProductosPendientes=false;
		//this.isVisibilidadCeldaCancelarProductosPendientes=true;			
		this.isVisibilidadCeldaGuardarProductosPendientes=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProductosPendientes() {
	}
	
	public void actualizarEstadoPanelsProductosPendientes(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProductosPendientes!=null) {
				this.jScrollPanelDatosEdicionProductosPendientes.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosPendientes!=null) {
				this.jTabbedPaneBusquedasProductosPendientes.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductosPendientes!=null) {
				this.jScrollPanelDatosProductosPendientes.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductosPendientes!=null) {
				this.jPanelPaginacionProductosPendientes.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductosPendientes!=null) {
				this.jPanelParametrosReportesProductosPendientes.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProductosPendientes!=null) {
				this.jScrollPanelDatosEdicionProductosPendientes.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosPendientes!=null) {
				this.jTabbedPaneBusquedasProductosPendientes.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProductosPendientes!=null) {
				this.jScrollPanelDatosProductosPendientes.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductosPendientes!=null) {
				this.jPanelPaginacionProductosPendientes.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductosPendientes!=null) {
				this.jPanelParametrosReportesProductosPendientes.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProductosPendientes!=null) {
				this.jScrollPanelDatosEdicionProductosPendientes.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosPendientes!=null) {
				this.jTabbedPaneBusquedasProductosPendientes.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductosPendientes!=null) {
				this.jScrollPanelDatosProductosPendientes.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductosPendientes!=null) {
				this.jPanelPaginacionProductosPendientes.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductosPendientes!=null) {
				this.jPanelParametrosReportesProductosPendientes.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProductosPendientes!=null) {
				this.jScrollPanelDatosEdicionProductosPendientes.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosPendientes!=null) {
				this.jTabbedPaneBusquedasProductosPendientes.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductosPendientes!=null) {
				this.jScrollPanelDatosProductosPendientes.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductosPendientes!=null) {
				this.jPanelPaginacionProductosPendientes.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductosPendientes!=null) {
				this.jPanelParametrosReportesProductosPendientes.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProductosPendientes!=null) {
				this.jScrollPanelDatosEdicionProductosPendientes.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosPendientes!=null) {
				this.jTabbedPaneBusquedasProductosPendientes.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductosPendientes!=null) {
				this.jScrollPanelDatosProductosPendientes.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductosPendientes!=null) {
				this.jPanelPaginacionProductosPendientes.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductosPendientes!=null) {
				this.jPanelParametrosReportesProductosPendientes.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProductosPendientes!=null) {
				this.jScrollPanelDatosEdicionProductosPendientes.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosPendientes!=null) {
				this.jTabbedPaneBusquedasProductosPendientes.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductosPendientes!=null) {
				this.jScrollPanelDatosProductosPendientes.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductosPendientes!=null) {
				this.jPanelPaginacionProductosPendientes.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductosPendientes!=null) {
				this.jPanelParametrosReportesProductosPendientes.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProductosPendientes!=null) {
				this.jScrollPanelDatosEdicionProductosPendientes.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosPendientes!=null) {
				this.jTabbedPaneBusquedasProductosPendientes.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductosPendientes!=null) {
				this.jScrollPanelDatosProductosPendientes.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductosPendientes!=null) {
				this.jPanelPaginacionProductosPendientes.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductosPendientes!=null) {
				this.jPanelParametrosReportesProductosPendientes.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.productospendientesSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProductosPendientes!=null) {
					this.jTabbedPaneBusquedasProductosPendientes.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProductosPendientes!=null) {
				this.jPanelParametrosReportesProductosPendientes.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.productospendientesSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosPendientes!=null) {
				this.jTabbedPaneBusquedasProductosPendientes.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProductosPendientes!=null) {
				this.jPanelParametrosReportesProductosPendientes.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaProductosPendientes=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaProductosPendientes) {this.jTabbedPaneBusquedasProductosPendientes.remove(jPanelBusquedaProductosPendientesProductosPendientes);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadBusquedaProductosPendientes=isParaBodega;
			if(!this.isVisibilidadBusquedaProductosPendientes) {this.jTabbedPaneBusquedasProductosPendientes.remove(jPanelBusquedaProductosPendientesProductosPendientes);}
		}
		
	}

	public void setVisibilidadBusquedasParaLinea(Boolean isParaLinea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaNegation=!isParaLinea;

			this.isVisibilidadBusquedaProductosPendientes=isParaLinea;
			if(!this.isVisibilidadBusquedaProductosPendientes) {this.jTabbedPaneBusquedasProductosPendientes.remove(jPanelBusquedaProductosPendientesProductosPendientes);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaGrupo(Boolean isParaLineaGrupo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaGrupoNegation=!isParaLineaGrupo;

			this.isVisibilidadBusquedaProductosPendientes=isParaLineaGrupo;
			if(!this.isVisibilidadBusquedaProductosPendientes) {this.jTabbedPaneBusquedasProductosPendientes.remove(jPanelBusquedaProductosPendientesProductosPendientes);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaCategoria(Boolean isParaLineaCategoria){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaCategoriaNegation=!isParaLineaCategoria;

			this.isVisibilidadBusquedaProductosPendientes=isParaLineaCategoria;
			if(!this.isVisibilidadBusquedaProductosPendientes) {this.jTabbedPaneBusquedasProductosPendientes.remove(jPanelBusquedaProductosPendientesProductosPendientes);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaMarca(Boolean isParaLineaMarca){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaMarcaNegation=!isParaLineaMarca;

			this.isVisibilidadBusquedaProductosPendientes=isParaLineaMarca;
			if(!this.isVisibilidadBusquedaProductosPendientes) {this.jTabbedPaneBusquedasProductosPendientes.remove(jPanelBusquedaProductosPendientesProductosPendientes);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaProductosPendientes(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProductosPendientes() {
		this.updateBorderResaltarBusquedasFormularioProductosPendientes();
		this.updateVisibilidadBusquedasFormularioProductosPendientes();
		this.updateHabilitarBusquedasFormularioProductosPendientes();
	}
	
	public void updateBorderResaltarBusquedasFormularioProductosPendientes() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProductosPendientes.getComponents().length>0) {
	

		if(this.productospendientesConstantesFunciones.resaltarBusquedaProductosPendientesProductosPendientes!=null) {
			index= this.jTabbedPaneBusquedasProductosPendientes.indexOfComponent(this.jPanelBusquedaProductosPendientesProductosPendientes);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductosPendientes.getComponent(index);
				jPanel.setBorder(this.productospendientesConstantesFunciones.resaltarBusquedaProductosPendientesProductosPendientes);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProductosPendientes() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProductosPendientes.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductosPendientes.indexOfComponent(this.jPanelBusquedaProductosPendientesProductosPendientes);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductosPendientes.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productospendientesConstantesFunciones.mostrarBusquedaProductosPendientesProductosPendientes);
			if(!this.productospendientesConstantesFunciones.mostrarBusquedaProductosPendientesProductosPendientes && index>-1) {
				this.jTabbedPaneBusquedasProductosPendientes.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProductosPendientes() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProductosPendientes.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductosPendientes.indexOfComponent(this.jPanelBusquedaProductosPendientesProductosPendientes);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductosPendientes.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productospendientesConstantesFunciones.activarBusquedaProductosPendientesProductosPendientes);
				this.jTabbedPaneBusquedasProductosPendientes.setEnabledAt(index,this.productospendientesConstantesFunciones.activarBusquedaProductosPendientesProductosPendientes);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProductosPendientes(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaProductosPendientes")) {
			index= this.jTabbedPaneBusquedasProductosPendientes.indexOfComponent(this.jPanelBusquedaProductosPendientesProductosPendientes);

			this.jTabbedPaneBusquedasProductosPendientes.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductosPendientes.getComponent(index);

			this.productospendientesConstantesFunciones.setResaltarBusquedaProductosPendientesProductosPendientes(resaltar);

			jPanel.setBorder(this.productospendientesConstantesFunciones.resaltarBusquedaProductosPendientesProductosPendientes);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProductosPendientes.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProductosPendientes() throws Exception {

		if(this.jInternalFrameDetalleFormProductosPendientes==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProductosPendientes();
		this.updateVisibilidadResaltarControlesFormularioProductosPendientes();
		this.updateHabilitarResaltarControlesFormularioProductosPendientes();
		
	}
	
	public void updateBorderResaltarControlesFormularioProductosPendientes() throws Exception {
		if(this.jInternalFrameDetalleFormProductosPendientes==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.productospendientesConstantesFunciones.resaltaridProductosPendientes!=null && this.jInternalFrameDetalleFormProductosPendientes!=null) {this.jInternalFrameDetalleFormProductosPendientes.jLabelidProductosPendientes.setBorder(this.productospendientesConstantesFunciones.resaltaridProductosPendientes);}
		if(this.productospendientesConstantesFunciones.resaltarid_empresaProductosPendientes!=null && this.jInternalFrameDetalleFormProductosPendientes!=null) {this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_empresaProductosPendientes.setBorder(this.productospendientesConstantesFunciones.resaltarid_empresaProductosPendientes);}
		if(this.productospendientesConstantesFunciones.resaltarid_bodegaProductosPendientes!=null && this.jInternalFrameDetalleFormProductosPendientes!=null) {this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_bodegaProductosPendientes.setBorder(this.productospendientesConstantesFunciones.resaltarid_bodegaProductosPendientes);}
		if(this.productospendientesConstantesFunciones.resaltarid_lineaProductosPendientes!=null && this.jInternalFrameDetalleFormProductosPendientes!=null) {this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_lineaProductosPendientes.setBorder(this.productospendientesConstantesFunciones.resaltarid_lineaProductosPendientes);}
		if(this.productospendientesConstantesFunciones.resaltarid_linea_grupoProductosPendientes!=null && this.jInternalFrameDetalleFormProductosPendientes!=null) {this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_grupoProductosPendientes.setBorder(this.productospendientesConstantesFunciones.resaltarid_linea_grupoProductosPendientes);}
		if(this.productospendientesConstantesFunciones.resaltarid_linea_categoriaProductosPendientes!=null && this.jInternalFrameDetalleFormProductosPendientes!=null) {this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_categoriaProductosPendientes.setBorder(this.productospendientesConstantesFunciones.resaltarid_linea_categoriaProductosPendientes);}
		if(this.productospendientesConstantesFunciones.resaltarid_linea_marcaProductosPendientes!=null && this.jInternalFrameDetalleFormProductosPendientes!=null) {this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_marcaProductosPendientes.setBorder(this.productospendientesConstantesFunciones.resaltarid_linea_marcaProductosPendientes);}
		if(this.productospendientesConstantesFunciones.resaltarfecha_emision_desdeProductosPendientes!=null && this.jInternalFrameDetalleFormProductosPendientes!=null) {this.jInternalFrameDetalleFormProductosPendientes.jDateChooserfecha_emision_desdeProductosPendientes.setBorder(this.productospendientesConstantesFunciones.resaltarfecha_emision_desdeProductosPendientes);}
		if(this.productospendientesConstantesFunciones.resaltarfecha_emision_hastaProductosPendientes!=null && this.jInternalFrameDetalleFormProductosPendientes!=null) {this.jInternalFrameDetalleFormProductosPendientes.jDateChooserfecha_emision_hastaProductosPendientes.setBorder(this.productospendientesConstantesFunciones.resaltarfecha_emision_hastaProductosPendientes);}
		if(this.productospendientesConstantesFunciones.resaltarnombre_empresaProductosPendientes!=null && this.jInternalFrameDetalleFormProductosPendientes!=null) {this.jInternalFrameDetalleFormProductosPendientes.jTextAreanombre_empresaProductosPendientes.setBorder(this.productospendientesConstantesFunciones.resaltarnombre_empresaProductosPendientes);}
		if(this.productospendientesConstantesFunciones.resaltarruc_empresaProductosPendientes!=null && this.jInternalFrameDetalleFormProductosPendientes!=null) {this.jInternalFrameDetalleFormProductosPendientes.jTextFieldruc_empresaProductosPendientes.setBorder(this.productospendientesConstantesFunciones.resaltarruc_empresaProductosPendientes);}
		if(this.productospendientesConstantesFunciones.resaltarnombre_productoProductosPendientes!=null && this.jInternalFrameDetalleFormProductosPendientes!=null) {this.jInternalFrameDetalleFormProductosPendientes.jTextAreanombre_productoProductosPendientes.setBorder(this.productospendientesConstantesFunciones.resaltarnombre_productoProductosPendientes);}
		if(this.productospendientesConstantesFunciones.resaltarnombre_unidadProductosPendientes!=null && this.jInternalFrameDetalleFormProductosPendientes!=null) {this.jInternalFrameDetalleFormProductosPendientes.jTextFieldnombre_unidadProductosPendientes.setBorder(this.productospendientesConstantesFunciones.resaltarnombre_unidadProductosPendientes);}
		if(this.productospendientesConstantesFunciones.resaltarcantidadProductosPendientes!=null && this.jInternalFrameDetalleFormProductosPendientes!=null) {this.jInternalFrameDetalleFormProductosPendientes.jTextFieldcantidadProductosPendientes.setBorder(this.productospendientesConstantesFunciones.resaltarcantidadProductosPendientes);}
		if(this.productospendientesConstantesFunciones.resaltarprecioProductosPendientes!=null && this.jInternalFrameDetalleFormProductosPendientes!=null) {this.jInternalFrameDetalleFormProductosPendientes.jTextFieldprecioProductosPendientes.setBorder(this.productospendientesConstantesFunciones.resaltarprecioProductosPendientes);}
		if(this.productospendientesConstantesFunciones.resaltartotalProductosPendientes!=null && this.jInternalFrameDetalleFormProductosPendientes!=null) {this.jInternalFrameDetalleFormProductosPendientes.jTextFieldtotalProductosPendientes.setBorder(this.productospendientesConstantesFunciones.resaltartotalProductosPendientes);}
		if(this.productospendientesConstantesFunciones.resaltarcodigo_productoProductosPendientes!=null && this.jInternalFrameDetalleFormProductosPendientes!=null) {this.jInternalFrameDetalleFormProductosPendientes.jTextFieldcodigo_productoProductosPendientes.setBorder(this.productospendientesConstantesFunciones.resaltarcodigo_productoProductosPendientes);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProductosPendientes() throws Exception {		
		if(this.jInternalFrameDetalleFormProductosPendientes==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
	
		//this.jInternalFrameDetalleFormProductosPendientes.jLabelidProductosPendientes.setVisible(this.productospendientesConstantesFunciones.mostraridProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jPanelidProductosPendientes.setVisible(this.productospendientesConstantesFunciones.mostraridProductosPendientes);
		//this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_empresaProductosPendientes.setVisible(this.productospendientesConstantesFunciones.mostrarid_empresaProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jPanelid_empresaProductosPendientes.setVisible(this.productospendientesConstantesFunciones.mostrarid_empresaProductosPendientes);
		//this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_bodegaProductosPendientes.setVisible(this.productospendientesConstantesFunciones.mostrarid_bodegaProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jPanelid_bodegaProductosPendientes.setVisible(this.productospendientesConstantesFunciones.mostrarid_bodegaProductosPendientes);
		//this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_lineaProductosPendientes.setVisible(this.productospendientesConstantesFunciones.mostrarid_lineaProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jPanelid_lineaProductosPendientes.setVisible(this.productospendientesConstantesFunciones.mostrarid_lineaProductosPendientes);
		//this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_grupoProductosPendientes.setVisible(this.productospendientesConstantesFunciones.mostrarid_linea_grupoProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jPanelid_linea_grupoProductosPendientes.setVisible(this.productospendientesConstantesFunciones.mostrarid_linea_grupoProductosPendientes);
		//this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_categoriaProductosPendientes.setVisible(this.productospendientesConstantesFunciones.mostrarid_linea_categoriaProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jPanelid_linea_categoriaProductosPendientes.setVisible(this.productospendientesConstantesFunciones.mostrarid_linea_categoriaProductosPendientes);
		//this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_marcaProductosPendientes.setVisible(this.productospendientesConstantesFunciones.mostrarid_linea_marcaProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jPanelid_linea_marcaProductosPendientes.setVisible(this.productospendientesConstantesFunciones.mostrarid_linea_marcaProductosPendientes);
		//this.jInternalFrameDetalleFormProductosPendientes.jDateChooserfecha_emision_desdeProductosPendientes.setVisible(this.productospendientesConstantesFunciones.mostrarfecha_emision_desdeProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jPanelfecha_emision_desdeProductosPendientes.setVisible(this.productospendientesConstantesFunciones.mostrarfecha_emision_desdeProductosPendientes);
		//this.jInternalFrameDetalleFormProductosPendientes.jDateChooserfecha_emision_hastaProductosPendientes.setVisible(this.productospendientesConstantesFunciones.mostrarfecha_emision_hastaProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jPanelfecha_emision_hastaProductosPendientes.setVisible(this.productospendientesConstantesFunciones.mostrarfecha_emision_hastaProductosPendientes);
		//this.jInternalFrameDetalleFormProductosPendientes.jTextAreanombre_empresaProductosPendientes.setVisible(this.productospendientesConstantesFunciones.mostrarnombre_empresaProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jPanelnombre_empresaProductosPendientes.setVisible(this.productospendientesConstantesFunciones.mostrarnombre_empresaProductosPendientes);
		//this.jInternalFrameDetalleFormProductosPendientes.jTextFieldruc_empresaProductosPendientes.setVisible(this.productospendientesConstantesFunciones.mostrarruc_empresaProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jPanelruc_empresaProductosPendientes.setVisible(this.productospendientesConstantesFunciones.mostrarruc_empresaProductosPendientes);
		//this.jInternalFrameDetalleFormProductosPendientes.jTextAreanombre_productoProductosPendientes.setVisible(this.productospendientesConstantesFunciones.mostrarnombre_productoProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jPanelnombre_productoProductosPendientes.setVisible(this.productospendientesConstantesFunciones.mostrarnombre_productoProductosPendientes);
		//this.jInternalFrameDetalleFormProductosPendientes.jTextFieldnombre_unidadProductosPendientes.setVisible(this.productospendientesConstantesFunciones.mostrarnombre_unidadProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jPanelnombre_unidadProductosPendientes.setVisible(this.productospendientesConstantesFunciones.mostrarnombre_unidadProductosPendientes);
		//this.jInternalFrameDetalleFormProductosPendientes.jTextFieldcantidadProductosPendientes.setVisible(this.productospendientesConstantesFunciones.mostrarcantidadProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jPanelcantidadProductosPendientes.setVisible(this.productospendientesConstantesFunciones.mostrarcantidadProductosPendientes);
		//this.jInternalFrameDetalleFormProductosPendientes.jTextFieldprecioProductosPendientes.setVisible(this.productospendientesConstantesFunciones.mostrarprecioProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jPanelprecioProductosPendientes.setVisible(this.productospendientesConstantesFunciones.mostrarprecioProductosPendientes);
		//this.jInternalFrameDetalleFormProductosPendientes.jTextFieldtotalProductosPendientes.setVisible(this.productospendientesConstantesFunciones.mostrartotalProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jPaneltotalProductosPendientes.setVisible(this.productospendientesConstantesFunciones.mostrartotalProductosPendientes);
		//this.jInternalFrameDetalleFormProductosPendientes.jTextFieldcodigo_productoProductosPendientes.setVisible(this.productospendientesConstantesFunciones.mostrarcodigo_productoProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jPanelcodigo_productoProductosPendientes.setVisible(this.productospendientesConstantesFunciones.mostrarcodigo_productoProductosPendientes);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProductosPendientes() throws Exception {
		if(this.jInternalFrameDetalleFormProductosPendientes==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductosPendientes!=null) {
	
		this.jInternalFrameDetalleFormProductosPendientes.jLabelidProductosPendientes.setEnabled(this.productospendientesConstantesFunciones.activaridProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_empresaProductosPendientes.setEnabled(this.productospendientesConstantesFunciones.activarid_empresaProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_bodegaProductosPendientes.setEnabled(this.productospendientesConstantesFunciones.activarid_bodegaProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_lineaProductosPendientes.setEnabled(this.productospendientesConstantesFunciones.activarid_lineaProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_grupoProductosPendientes.setEnabled(this.productospendientesConstantesFunciones.activarid_linea_grupoProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_categoriaProductosPendientes.setEnabled(this.productospendientesConstantesFunciones.activarid_linea_categoriaProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jComboBoxid_linea_marcaProductosPendientes.setEnabled(this.productospendientesConstantesFunciones.activarid_linea_marcaProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jDateChooserfecha_emision_desdeProductosPendientes.setEnabled(this.productospendientesConstantesFunciones.activarfecha_emision_desdeProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jDateChooserfecha_emision_hastaProductosPendientes.setEnabled(this.productospendientesConstantesFunciones.activarfecha_emision_hastaProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jTextAreanombre_empresaProductosPendientes.setEnabled(this.productospendientesConstantesFunciones.activarnombre_empresaProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jTextFieldruc_empresaProductosPendientes.setEnabled(this.productospendientesConstantesFunciones.activarruc_empresaProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jTextAreanombre_productoProductosPendientes.setEnabled(this.productospendientesConstantesFunciones.activarnombre_productoProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jTextFieldnombre_unidadProductosPendientes.setEnabled(this.productospendientesConstantesFunciones.activarnombre_unidadProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jTextFieldcantidadProductosPendientes.setEnabled(this.productospendientesConstantesFunciones.activarcantidadProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jTextFieldprecioProductosPendientes.setEnabled(this.productospendientesConstantesFunciones.activarprecioProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jTextFieldtotalProductosPendientes.setEnabled(this.productospendientesConstantesFunciones.activartotalProductosPendientes);
		this.jInternalFrameDetalleFormProductosPendientes.jTextFieldcodigo_productoProductosPendientes.setEnabled(this.productospendientesConstantesFunciones.activarcodigo_productoProductosPendientes);
		}
	}
	
		
}