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
package com.bydan.erp.inventario.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.inventario.util.ProductosServiciosPreciosSinRangosConstantesFunciones;
import com.bydan.erp.inventario.util.report.ProductosServiciosPreciosSinRangosParameterReturnGeneral;
//import com.bydan.erp.inventario.util.report.ProductosServiciosPreciosSinRangosParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.report.ProductosServiciosPreciosSinRangosBean;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.inventario.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.inventario.util.*;

import com.bydan.erp.inventario.util.report.*;
import com.bydan.erp.inventario.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.business.entity.report.*;
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


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;

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
public class ProductosServiciosPreciosSinRangosBeanSwingJInternalFrame extends ProductosServiciosPreciosSinRangosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProductosServiciosPreciosSinRangosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProductosServiciosPreciosSinRangos> productosserviciospreciossinrangosValidator = new ClassValidator<ProductosServiciosPreciosSinRangos>(ProductosServiciosPreciosSinRangos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos;	
	public ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosAux;
	public ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosTotales;
	public Long idProductosServiciosPreciosSinRangosActual;
	public Long iIdNuevoProductosServiciosPreciosSinRangos=0L;
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
	
	public Boolean isPermisoTodoProductosServiciosPreciosSinRangos;
	public Boolean isPermisoNuevoProductosServiciosPreciosSinRangos;
	public Boolean isPermisoActualizarProductosServiciosPreciosSinRangos;
	public Boolean isPermisoActualizarOriginalProductosServiciosPreciosSinRangos;
	public Boolean isPermisoEliminarProductosServiciosPreciosSinRangos;
	public Boolean isPermisoGuardarCambiosProductosServiciosPreciosSinRangos;
	public Boolean isPermisoConsultaProductosServiciosPreciosSinRangos;
	public Boolean isPermisoBusquedaProductosServiciosPreciosSinRangos;
	public Boolean isPermisoReporteProductosServiciosPreciosSinRangos;
	public Boolean isPermisoPaginacionMedioProductosServiciosPreciosSinRangos;
	public Boolean isPermisoPaginacionAltoProductosServiciosPreciosSinRangos;
	public Boolean isPermisoPaginacionTodoProductosServiciosPreciosSinRangos;
	public Boolean isPermisoCopiarProductosServiciosPreciosSinRangos;
	public Boolean isPermisoVerFormProductosServiciosPreciosSinRangos;
	public Boolean isPermisoDuplicarProductosServiciosPreciosSinRangos;
	public Boolean isPermisoOrdenProductosServiciosPreciosSinRangos;
	
	
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
	
	public ProductosServiciosPreciosSinRangosParameterReturnGeneral productosserviciospreciossinrangosReturnGeneral;
	public ProductosServiciosPreciosSinRangosParameterReturnGeneral productosserviciospreciossinrangosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProductosServiciosPreciosSinRangos=false;
	public Boolean esParaAccionDesdeFormularioProductosServiciosPreciosSinRangos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProductosServiciosPreciosSinRangosSessionBeanAdditional productosserviciospreciossinrangosSessionBeanAdditional=null;
	
	public ProductosServiciosPreciosSinRangosSessionBeanAdditional getProductosServiciosPreciosSinRangosSessionBeanAdditional() {
		return this.productosserviciospreciossinrangosSessionBeanAdditional;
	}
	
	public void setProductosServiciosPreciosSinRangosSessionBeanAdditional(ProductosServiciosPreciosSinRangosSessionBeanAdditional productosserviciospreciossinrangosSessionBeanAdditional) {
		try {
			this.productosserviciospreciossinrangosSessionBeanAdditional=productosserviciospreciossinrangosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional productosserviciospreciossinrangosBeanSwingJInternalFrameAdditional=null;
	//public class ProductosServiciosPreciosSinRangosBeanSwingJInternalFrame
	
	public ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional getProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional() {
		return this.productosserviciospreciossinrangosBeanSwingJInternalFrameAdditional;
	}
	
	public void setProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional(ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional productosserviciospreciossinrangosBeanSwingJInternalFrameAdditional) {
		try {
			this.productosserviciospreciossinrangosBeanSwingJInternalFrameAdditional=productosserviciospreciossinrangosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProductosServiciosPreciosSinRangosLogic productosserviciospreciossinrangosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosBean;
	public ProductosServiciosPreciosSinRangosConstantesFunciones productosserviciospreciossinrangosConstantesFunciones;
	//public ProductosServiciosPreciosSinRangosParameterReturnGeneral productosserviciospreciossinrangosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public BodegaLogic bodegaLogic;
	public LineaLogic lineaLogic;
	public LineaLogic lineagrupoLogic;
	public LineaLogic lineacategoriaLogic;
	public LineaLogic lineamarcaLogic;
	
	//PARAMETROS
	
	
	//public List<ProductosServiciosPreciosSinRangos> productosserviciospreciossinrangoss;	
	//public List<ProductosServiciosPreciosSinRangos> productosserviciospreciossinrangossEliminados;
	//public List<ProductosServiciosPreciosSinRangos> productosserviciospreciossinrangossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProductosServiciosPreciosSinRangos=false;
	public Boolean isVisibilidadCeldaDuplicarProductosServiciosPreciosSinRangos=true;
	public Boolean isVisibilidadCeldaCopiarProductosServiciosPreciosSinRangos=true;
	public Boolean isVisibilidadCeldaVerFormProductosServiciosPreciosSinRangos=true;
	public Boolean isVisibilidadCeldaOrdenProductosServiciosPreciosSinRangos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProductosServiciosPreciosSinRangos=false;
	public Boolean isVisibilidadCeldaModificarProductosServiciosPreciosSinRangos=false;
	public Boolean isVisibilidadCeldaActualizarProductosServiciosPreciosSinRangos=false;
	public Boolean isVisibilidadCeldaEliminarProductosServiciosPreciosSinRangos=false;
	public Boolean isVisibilidadCeldaCancelarProductosServiciosPreciosSinRangos=false;
	public Boolean isVisibilidadCeldaGuardarProductosServiciosPreciosSinRangos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProductosServiciosPreciosSinRangos=false;	
	
	
	public Boolean isVisibilidadBusquedaProductosServiciosPreciosSinRangos=false;
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdLinea=false;
	public Boolean isVisibilidadFK_IdLineaCategoria=false;
	public Boolean isVisibilidadFK_IdLineaGrupo=false;
	public Boolean isVisibilidadFK_IdLineaMarca=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoProductosServiciosPreciosSinRangos() {
		return this.iIdNuevoProductosServiciosPreciosSinRangos;
	}

	public void setiIdNuevoProductosServiciosPreciosSinRangos(Long iIdNuevoProductosServiciosPreciosSinRangos) {
		this.iIdNuevoProductosServiciosPreciosSinRangos = iIdNuevoProductosServiciosPreciosSinRangos;
	}
	
	public Long getidProductosServiciosPreciosSinRangosActual() {
		return this.idProductosServiciosPreciosSinRangosActual;
	}

	public void setidProductosServiciosPreciosSinRangosActual(Long idProductosServiciosPreciosSinRangosActual) {
		this.idProductosServiciosPreciosSinRangosActual = idProductosServiciosPreciosSinRangosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProductosServiciosPreciosSinRangos getproductosserviciospreciossinrangos() {
		return this.productosserviciospreciossinrangos;
	}

	public void setproductosserviciospreciossinrangos(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos) {
		this.productosserviciospreciossinrangos = productosserviciospreciossinrangos;
	}
	
	public ProductosServiciosPreciosSinRangos getproductosserviciospreciossinrangosAux() {
		return this.productosserviciospreciossinrangosAux;
	}

	public void setproductosserviciospreciossinrangosAux(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosAux) {
		this.productosserviciospreciossinrangosAux = productosserviciospreciossinrangosAux;
	}				
	
	public ProductosServiciosPreciosSinRangos getproductosserviciospreciossinrangosAnterior() {
		return this.productosserviciospreciossinrangosAnterior;
	}

	public void setproductosserviciospreciossinrangosAnterior(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosAnterior) {
		this.productosserviciospreciossinrangosAnterior = productosserviciospreciossinrangosAnterior;
	}	
	
	public ProductosServiciosPreciosSinRangos getproductosserviciospreciossinrangosTotales() {
		return this.productosserviciospreciossinrangosTotales;
	}

	public void setproductosserviciospreciossinrangosTotales(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosTotales) {
		this.productosserviciospreciossinrangosTotales = productosserviciospreciossinrangosTotales;
	}	
	
	public ProductosServiciosPreciosSinRangos getproductosserviciospreciossinrangosBean() {
		return this.productosserviciospreciossinrangosBean;
	}

	public void setproductosserviciospreciossinrangosBean(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosBean) {
		this.productosserviciospreciossinrangosBean = productosserviciospreciossinrangosBean;
	}	
	
	public ProductosServiciosPreciosSinRangosParameterReturnGeneral getproductosserviciospreciossinrangosReturnGeneral() {
		return this.productosserviciospreciossinrangosReturnGeneral;
	}

	public void setproductosserviciospreciossinrangosReturnGeneral(ProductosServiciosPreciosSinRangosParameterReturnGeneral productosserviciospreciossinrangosReturnGeneral) {
		this.productosserviciospreciossinrangosReturnGeneral = productosserviciospreciossinrangosReturnGeneral;
	}	
	
	
	public Long id_bodegaBusquedaProductosServiciosPreciosSinRangos=-1L;

	public Long getid_bodegaBusquedaProductosServiciosPreciosSinRangos() {
		return this.id_bodegaBusquedaProductosServiciosPreciosSinRangos;
	}

	public void setid_bodegaBusquedaProductosServiciosPreciosSinRangos(Long id_bodegaBusquedaProductosServiciosPreciosSinRangos) {
		this.id_bodegaBusquedaProductosServiciosPreciosSinRangos = id_bodegaBusquedaProductosServiciosPreciosSinRangos;
	}

;
	public Long id_lineaBusquedaProductosServiciosPreciosSinRangos=-1L;

	public Long getid_lineaBusquedaProductosServiciosPreciosSinRangos() {
		return this.id_lineaBusquedaProductosServiciosPreciosSinRangos;
	}

	public void setid_lineaBusquedaProductosServiciosPreciosSinRangos(Long id_lineaBusquedaProductosServiciosPreciosSinRangos) {
		this.id_lineaBusquedaProductosServiciosPreciosSinRangos = id_lineaBusquedaProductosServiciosPreciosSinRangos;
	}

;
	public Long id_linea_grupoBusquedaProductosServiciosPreciosSinRangos=-1L;

	public Long getid_linea_grupoBusquedaProductosServiciosPreciosSinRangos() {
		return this.id_linea_grupoBusquedaProductosServiciosPreciosSinRangos;
	}

	public void setid_linea_grupoBusquedaProductosServiciosPreciosSinRangos(Long id_linea_grupoBusquedaProductosServiciosPreciosSinRangos) {
		this.id_linea_grupoBusquedaProductosServiciosPreciosSinRangos = id_linea_grupoBusquedaProductosServiciosPreciosSinRangos;
	}

;
	public Long id_linea_categoriaBusquedaProductosServiciosPreciosSinRangos=-1L;

	public Long getid_linea_categoriaBusquedaProductosServiciosPreciosSinRangos() {
		return this.id_linea_categoriaBusquedaProductosServiciosPreciosSinRangos;
	}

	public void setid_linea_categoriaBusquedaProductosServiciosPreciosSinRangos(Long id_linea_categoriaBusquedaProductosServiciosPreciosSinRangos) {
		this.id_linea_categoriaBusquedaProductosServiciosPreciosSinRangos = id_linea_categoriaBusquedaProductosServiciosPreciosSinRangos;
	}

;
	public Long id_linea_marcaBusquedaProductosServiciosPreciosSinRangos=-1L;

	public Long getid_linea_marcaBusquedaProductosServiciosPreciosSinRangos() {
		return this.id_linea_marcaBusquedaProductosServiciosPreciosSinRangos;
	}

	public void setid_linea_marcaBusquedaProductosServiciosPreciosSinRangos(Long id_linea_marcaBusquedaProductosServiciosPreciosSinRangos) {
		this.id_linea_marcaBusquedaProductosServiciosPreciosSinRangos = id_linea_marcaBusquedaProductosServiciosPreciosSinRangos;
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

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ProductosServiciosPreciosSinRangosLogic getProductosServiciosPreciosSinRangosLogic()	{		
		return productosserviciospreciossinrangosLogic;
	}

	public void setProductosServiciosPreciosSinRangosLogic(ProductosServiciosPreciosSinRangosLogic productosserviciospreciossinrangosLogic) {
		this.productosserviciospreciossinrangosLogic = productosserviciospreciossinrangosLogic;
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
	
	public Boolean getIsEsNuevoProductosServiciosPreciosSinRangos() {
		return isEsNuevoProductosServiciosPreciosSinRangos;
	}

	public void setIsEsNuevoProductosServiciosPreciosSinRangos(Boolean isEsNuevoProductosServiciosPreciosSinRangos) {
		this.isEsNuevoProductosServiciosPreciosSinRangos = isEsNuevoProductosServiciosPreciosSinRangos;
	}

	public Boolean getEsParaAccionDesdeFormularioProductosServiciosPreciosSinRangos() {
		return esParaAccionDesdeFormularioProductosServiciosPreciosSinRangos;
	}
	
	public void setEsParaAccionDesdeFormularioProductosServiciosPreciosSinRangos(Boolean esParaAccionDesdeFormularioProductosServiciosPreciosSinRangos) {
		this.esParaAccionDesdeFormularioProductosServiciosPreciosSinRangos = esParaAccionDesdeFormularioProductosServiciosPreciosSinRangos;
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

			if(this.productosserviciospreciossinrangosSessionBean==null) {
				this.productosserviciospreciossinrangosSessionBean=new ProductosServiciosPreciosSinRangosSessionBean();
			}

			if(!this.productosserviciospreciossinrangosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(productosserviciospreciossinrangosSessionBean.getlidEmpresaActual());
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

			if(this.productosserviciospreciossinrangosSessionBean==null) {
				this.productosserviciospreciossinrangosSessionBean=new ProductosServiciosPreciosSinRangosSessionBean();
			}

			if(!this.productosserviciospreciossinrangosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(productosserviciospreciossinrangosSessionBean.getlidSucursalActual());
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

			if(this.productosserviciospreciossinrangosSessionBean==null) {
				this.productosserviciospreciossinrangosSessionBean=new ProductosServiciosPreciosSinRangosSessionBean();
			}

			if(!this.productosserviciospreciossinrangosSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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
					bodegaLogic.getEntityWithConnection(productosserviciospreciossinrangosSessionBean.getlidBodegaActual());
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

			if(this.productosserviciospreciossinrangosSessionBean==null) {
				this.productosserviciospreciossinrangosSessionBean=new ProductosServiciosPreciosSinRangosSessionBean();
			}

			if(!this.productosserviciospreciossinrangosSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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
					lineaLogic.getEntityWithConnection(productosserviciospreciossinrangosSessionBean.getlidLineaActual());
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

			if(this.productosserviciospreciossinrangosSessionBean==null) {
				this.productosserviciospreciossinrangosSessionBean=new ProductosServiciosPreciosSinRangosSessionBean();
			}

			if(!this.productosserviciospreciossinrangosSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
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
					lineaLogic.getEntityWithConnection(productosserviciospreciossinrangosSessionBean.getlidLineaGrupoActual());
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

			if(this.productosserviciospreciossinrangosSessionBean==null) {
				this.productosserviciospreciossinrangosSessionBean=new ProductosServiciosPreciosSinRangosSessionBean();
			}

			if(!this.productosserviciospreciossinrangosSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
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
					lineaLogic.getEntityWithConnection(productosserviciospreciossinrangosSessionBean.getlidLineaCategoriaActual());
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

			if(this.productosserviciospreciossinrangosSessionBean==null) {
				this.productosserviciospreciossinrangosSessionBean=new ProductosServiciosPreciosSinRangosSessionBean();
			}

			if(!this.productosserviciospreciossinrangosSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
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
					lineaLogic.getEntityWithConnection(productosserviciospreciossinrangosSessionBean.getlidLineaMarcaActual());
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

					if(this.productosserviciospreciossinrangos!=null) {
						this.productosserviciospreciossinrangos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
						this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_empresaProductosServiciosPreciosSinRangos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaProductosServiciosPreciosSinRangos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
						if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_empresaProductosServiciosPreciosSinRangos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_empresaProductosServiciosPreciosSinRangos.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaProductosServiciosPreciosSinRangosGenerico)throws Exception
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
				jComboBoxid_empresaProductosServiciosPreciosSinRangosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaProductosServiciosPreciosSinRangosGenerico!=null && jComboBoxid_empresaProductosServiciosPreciosSinRangosGenerico.getItemCount()>0) {
					jComboBoxid_empresaProductosServiciosPreciosSinRangosGenerico.setSelectedIndex(0);
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

					if(this.productosserviciospreciossinrangos!=null) {
						this.productosserviciospreciossinrangos.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
						this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_sucursalProductosServiciosPreciosSinRangos.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalProductosServiciosPreciosSinRangos.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
						if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_sucursalProductosServiciosPreciosSinRangos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_sucursalProductosServiciosPreciosSinRangos.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalProductosServiciosPreciosSinRangosGenerico)throws Exception
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
				jComboBoxid_sucursalProductosServiciosPreciosSinRangosGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalProductosServiciosPreciosSinRangosGenerico!=null && jComboBoxid_sucursalProductosServiciosPreciosSinRangosGenerico.getItemCount()>0) {
					jComboBoxid_sucursalProductosServiciosPreciosSinRangosGenerico.setSelectedIndex(0);
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

					if(this.productosserviciospreciossinrangos!=null) {
						this.productosserviciospreciossinrangos.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
						this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_bodegaProductosServiciosPreciosSinRangos.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaProductosServiciosPreciosSinRangos.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
						if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_bodegaProductosServiciosPreciosSinRangos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_bodegaProductosServiciosPreciosSinRangos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProductosServiciosPreciosSinRangos") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos!=null) {
						jComboBoxid_bodegaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos!=null) {
							//jComboBoxid_bodegaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.getItemCount()>0) {
								jComboBoxid_bodegaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setSelectedIndex(0);
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
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaProductosServiciosPreciosSinRangosGenerico)throws Exception
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
				jComboBoxid_bodegaProductosServiciosPreciosSinRangosGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaProductosServiciosPreciosSinRangosGenerico!=null && jComboBoxid_bodegaProductosServiciosPreciosSinRangosGenerico.getItemCount()>0) {
					jComboBoxid_bodegaProductosServiciosPreciosSinRangosGenerico.setSelectedIndex(0);
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

					if(this.productosserviciospreciossinrangos!=null) {
						this.productosserviciospreciossinrangos.setLinea(lineaTemp);
					}

					if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
						this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_lineaProductosServiciosPreciosSinRangos.setSelectedItem(lineaTemp);
					}
				} else {
					//jComboBoxid_lineaProductosServiciosPreciosSinRangos.setSelectedItem(lineaTemp);
					if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
						if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_lineaProductosServiciosPreciosSinRangos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_lineaProductosServiciosPreciosSinRangos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProductosServiciosPreciosSinRangos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineaTemp!=null && jComboBoxid_lineaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos!=null) {
						jComboBoxid_lineaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setSelectedItem(lineaTemp);
					} else {
						if(jComboBoxid_lineaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos!=null) {
							//jComboBoxid_lineaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setSelectedItem(lineaTemp);
							if(jComboBoxid_lineaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.getItemCount()>0) {
								jComboBoxid_lineaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setSelectedIndex(0);
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
	public void setActualLineaForeignKeyGenerico(Long idLineaSeleccionado,JComboBox jComboBoxid_lineaProductosServiciosPreciosSinRangosGenerico)throws Exception
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
				jComboBoxid_lineaProductosServiciosPreciosSinRangosGenerico.setSelectedItem(lineaTemp);
			} else {
				if(jComboBoxid_lineaProductosServiciosPreciosSinRangosGenerico!=null && jComboBoxid_lineaProductosServiciosPreciosSinRangosGenerico.getItemCount()>0) {
					jComboBoxid_lineaProductosServiciosPreciosSinRangosGenerico.setSelectedIndex(0);
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

					if(this.productosserviciospreciossinrangos!=null) {
						this.productosserviciospreciossinrangos.setLineaGrupo(lineagrupoTemp);
					}

					if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
						this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_grupoProductosServiciosPreciosSinRangos.setSelectedItem(lineagrupoTemp);
					}
				} else {
					//jComboBoxid_linea_grupoProductosServiciosPreciosSinRangos.setSelectedItem(lineagrupoTemp);
					if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
						if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_grupoProductosServiciosPreciosSinRangos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_grupoProductosServiciosPreciosSinRangos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProductosServiciosPreciosSinRangos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineagrupoTemp!=null && jComboBoxid_linea_grupoBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos!=null) {
						jComboBoxid_linea_grupoBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setSelectedItem(lineagrupoTemp);
					} else {
						if(jComboBoxid_linea_grupoBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos!=null) {
							//jComboBoxid_linea_grupoBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setSelectedItem(lineagrupoTemp);
							if(jComboBoxid_linea_grupoBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.getItemCount()>0) {
								jComboBoxid_linea_grupoBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setSelectedIndex(0);
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
	public void setActualLineaGrupoForeignKeyGenerico(Long idLineaGrupoSeleccionado,JComboBox jComboBoxid_linea_grupoProductosServiciosPreciosSinRangosGenerico)throws Exception
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
				jComboBoxid_linea_grupoProductosServiciosPreciosSinRangosGenerico.setSelectedItem(lineagrupoTemp);
			} else {
				if(jComboBoxid_linea_grupoProductosServiciosPreciosSinRangosGenerico!=null && jComboBoxid_linea_grupoProductosServiciosPreciosSinRangosGenerico.getItemCount()>0) {
					jComboBoxid_linea_grupoProductosServiciosPreciosSinRangosGenerico.setSelectedIndex(0);
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

					if(this.productosserviciospreciossinrangos!=null) {
						this.productosserviciospreciossinrangos.setLineaCategoria(lineacategoriaTemp);
					}

					if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
						this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_categoriaProductosServiciosPreciosSinRangos.setSelectedItem(lineacategoriaTemp);
					}
				} else {
					//jComboBoxid_linea_categoriaProductosServiciosPreciosSinRangos.setSelectedItem(lineacategoriaTemp);
					if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
						if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_categoriaProductosServiciosPreciosSinRangos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_categoriaProductosServiciosPreciosSinRangos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProductosServiciosPreciosSinRangos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineacategoriaTemp!=null && jComboBoxid_linea_categoriaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos!=null) {
						jComboBoxid_linea_categoriaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setSelectedItem(lineacategoriaTemp);
					} else {
						if(jComboBoxid_linea_categoriaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos!=null) {
							//jComboBoxid_linea_categoriaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setSelectedItem(lineacategoriaTemp);
							if(jComboBoxid_linea_categoriaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.getItemCount()>0) {
								jComboBoxid_linea_categoriaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setSelectedIndex(0);
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
	public void setActualLineaCategoriaForeignKeyGenerico(Long idLineaCategoriaSeleccionado,JComboBox jComboBoxid_linea_categoriaProductosServiciosPreciosSinRangosGenerico)throws Exception
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
				jComboBoxid_linea_categoriaProductosServiciosPreciosSinRangosGenerico.setSelectedItem(lineacategoriaTemp);
			} else {
				if(jComboBoxid_linea_categoriaProductosServiciosPreciosSinRangosGenerico!=null && jComboBoxid_linea_categoriaProductosServiciosPreciosSinRangosGenerico.getItemCount()>0) {
					jComboBoxid_linea_categoriaProductosServiciosPreciosSinRangosGenerico.setSelectedIndex(0);
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

					if(this.productosserviciospreciossinrangos!=null) {
						this.productosserviciospreciossinrangos.setLineaMarca(lineamarcaTemp);
					}

					if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
						this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_marcaProductosServiciosPreciosSinRangos.setSelectedItem(lineamarcaTemp);
					}
				} else {
					//jComboBoxid_linea_marcaProductosServiciosPreciosSinRangos.setSelectedItem(lineamarcaTemp);
					if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
						if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_marcaProductosServiciosPreciosSinRangos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_marcaProductosServiciosPreciosSinRangos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProductosServiciosPreciosSinRangos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineamarcaTemp!=null && jComboBoxid_linea_marcaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos!=null) {
						jComboBoxid_linea_marcaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setSelectedItem(lineamarcaTemp);
					} else {
						if(jComboBoxid_linea_marcaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos!=null) {
							//jComboBoxid_linea_marcaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setSelectedItem(lineamarcaTemp);
							if(jComboBoxid_linea_marcaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.getItemCount()>0) {
								jComboBoxid_linea_marcaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setSelectedIndex(0);
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
	public void setActualLineaMarcaForeignKeyGenerico(Long idLineaMarcaSeleccionado,JComboBox jComboBoxid_linea_marcaProductosServiciosPreciosSinRangosGenerico)throws Exception
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
				jComboBoxid_linea_marcaProductosServiciosPreciosSinRangosGenerico.setSelectedItem(lineamarcaTemp);
			} else {
				if(jComboBoxid_linea_marcaProductosServiciosPreciosSinRangosGenerico!=null && jComboBoxid_linea_marcaProductosServiciosPreciosSinRangosGenerico.getItemCount()>0) {
					jComboBoxid_linea_marcaProductosServiciosPreciosSinRangosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos,JComboBox jComboBoxid_empresaProductosServiciosPreciosSinRangosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaProductosServiciosPreciosSinRangosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_empresaProductosServiciosPreciosSinRangos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaProductosServiciosPreciosSinRangosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				productosserviciospreciossinrangos.setid_empresa(empresaAux.getId());
				productosserviciospreciossinrangos.setempresa_descripcion(ProductosServiciosPreciosSinRangosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				productosserviciospreciossinrangos.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos,JComboBox jComboBoxid_sucursalProductosServiciosPreciosSinRangosGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalProductosServiciosPreciosSinRangosGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_sucursalProductosServiciosPreciosSinRangos.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalProductosServiciosPreciosSinRangosGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				productosserviciospreciossinrangos.setid_sucursal(sucursalAux.getId());
				productosserviciospreciossinrangos.setsucursal_descripcion(ProductosServiciosPreciosSinRangosConstantesFunciones.getSucursalDescripcion(sucursalAux));
				productosserviciospreciossinrangos.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos,JComboBox jComboBoxid_bodegaProductosServiciosPreciosSinRangosGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaProductosServiciosPreciosSinRangosGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_bodegaProductosServiciosPreciosSinRangos.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaProductosServiciosPreciosSinRangosGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				productosserviciospreciossinrangos.setid_bodega(bodegaAux.getId());
				productosserviciospreciossinrangos.setbodega_descripcion(ProductosServiciosPreciosSinRangosConstantesFunciones.getBodegaDescripcion(bodegaAux));
				productosserviciospreciossinrangos.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaForeignKey(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos,JComboBox jComboBoxid_lineaProductosServiciosPreciosSinRangosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_lineaProductosServiciosPreciosSinRangosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_lineaProductosServiciosPreciosSinRangos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_lineaProductosServiciosPreciosSinRangosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				productosserviciospreciossinrangos.setid_linea(lineaAux.getId());
				productosserviciospreciossinrangos.setlinea_descripcion(ProductosServiciosPreciosSinRangosConstantesFunciones.getLineaDescripcion(lineaAux));
				productosserviciospreciossinrangos.setLinea(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaGrupoForeignKey(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos,JComboBox jComboBoxid_linea_grupoProductosServiciosPreciosSinRangosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_grupoProductosServiciosPreciosSinRangosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_grupoProductosServiciosPreciosSinRangos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_grupoProductosServiciosPreciosSinRangosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				productosserviciospreciossinrangos.setid_linea_grupo(lineaAux.getId());
				productosserviciospreciossinrangos.setlineagrupo_descripcion(ProductosServiciosPreciosSinRangosConstantesFunciones.getLineaGrupoDescripcion(lineaAux));
				productosserviciospreciossinrangos.setLineaGrupo(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaCategoriaForeignKey(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos,JComboBox jComboBoxid_linea_categoriaProductosServiciosPreciosSinRangosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_categoriaProductosServiciosPreciosSinRangosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_categoriaProductosServiciosPreciosSinRangos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_categoriaProductosServiciosPreciosSinRangosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				productosserviciospreciossinrangos.setid_linea_categoria(lineaAux.getId());
				productosserviciospreciossinrangos.setlineacategoria_descripcion(ProductosServiciosPreciosSinRangosConstantesFunciones.getLineaCategoriaDescripcion(lineaAux));
				productosserviciospreciossinrangos.setLineaCategoria(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaMarcaForeignKey(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos,JComboBox jComboBoxid_linea_marcaProductosServiciosPreciosSinRangosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_marcaProductosServiciosPreciosSinRangosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_marcaProductosServiciosPreciosSinRangos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_marcaProductosServiciosPreciosSinRangosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				productosserviciospreciossinrangos.setid_linea_marca(lineaAux.getId());
				productosserviciospreciossinrangos.setlineamarca_descripcion(ProductosServiciosPreciosSinRangosConstantesFunciones.getLineaMarcaDescripcion(lineaAux));
				productosserviciospreciossinrangos.setLineaMarca(lineaAux);			}
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

					if(!ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) { 
							this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_empresaProductosServiciosPreciosSinRangos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_empresaProductosServiciosPreciosSinRangos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) { 
					}

					if(!ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) { 
							this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_sucursalProductosServiciosPreciosSinRangos.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_sucursalProductosServiciosPreciosSinRangos.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) { 
					}

					if(!ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) { 
							this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_bodegaProductosServiciosPreciosSinRangos.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_bodegaProductosServiciosPreciosSinRangos.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) { 
					}

					if(!ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProductosServiciosPreciosSinRangos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.addItem(bodega);
							}
						}

						if(!ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) { 
							this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_lineaProductosServiciosPreciosSinRangos.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_lineaProductosServiciosPreciosSinRangos.addItem(linea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) { 
					}

					if(!ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProductosServiciosPreciosSinRangos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_lineaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jComboBoxid_lineaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.addItem(linea);
							}
						}

						if(!ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) { 
							this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_grupoProductosServiciosPreciosSinRangos.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_grupoProductosServiciosPreciosSinRangos.addItem(lineagrupo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) { 
					}

					if(!ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProductosServiciosPreciosSinRangos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_grupoBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jComboBoxid_linea_grupoBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.addItem(lineagrupo);
							}
						}

						if(!ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) { 
							this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_categoriaProductosServiciosPreciosSinRangos.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_categoriaProductosServiciosPreciosSinRangos.addItem(lineacategoria);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) { 
					}

					if(!ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProductosServiciosPreciosSinRangos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_categoriaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jComboBoxid_linea_categoriaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.addItem(lineacategoria);
							}
						}

						if(!ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) { 
							this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_marcaProductosServiciosPreciosSinRangos.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_marcaProductosServiciosPreciosSinRangos.addItem(lineamarca);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) { 
					}

					if(!ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProductosServiciosPreciosSinRangos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_marcaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jComboBoxid_linea_marcaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.addItem(lineamarca);
							}
						}

						if(!ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
							this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_empresaProductosServiciosPreciosSinRangos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
							this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_empresaProductosServiciosPreciosSinRangos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
							this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_sucursalProductosServiciosPreciosSinRangos.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
							this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_sucursalProductosServiciosPreciosSinRangos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
							this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_bodegaProductosServiciosPreciosSinRangos.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
							this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_bodegaProductosServiciosPreciosSinRangos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
							this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_lineaProductosServiciosPreciosSinRangos.setSelectedItem(linea);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
							this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_lineaProductosServiciosPreciosSinRangos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_lineaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setSelectedItem(linea);
						} else {
							this.jComboBoxid_lineaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
							this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_grupoProductosServiciosPreciosSinRangos.setSelectedItem(lineagrupo);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
							this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_grupoProductosServiciosPreciosSinRangos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_grupoBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setSelectedItem(lineagrupo);
						} else {
							this.jComboBoxid_linea_grupoBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
							this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_categoriaProductosServiciosPreciosSinRangos.setSelectedItem(lineacategoria);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
							this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_categoriaProductosServiciosPreciosSinRangos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_categoriaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setSelectedItem(lineacategoria);
						} else {
							this.jComboBoxid_linea_categoriaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
							this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_marcaProductosServiciosPreciosSinRangos.setSelectedItem(lineamarca);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
							this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_marcaProductosServiciosPreciosSinRangos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_marcaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setSelectedItem(lineamarca);
						} else {
							this.jComboBoxid_linea_marcaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProductosServiciosPreciosSinRangos() throws Exception {
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
		
	public ProductosServiciosPreciosSinRangosParameterReturnGeneral getProductosServiciosPreciosSinRangosParameterGeneral() {
		return this.productosserviciospreciossinrangosParameterGeneral;
	}
	
	public void setProductosServiciosPreciosSinRangosParameterGeneral(ProductosServiciosPreciosSinRangosParameterReturnGeneral productosserviciospreciossinrangosParameterGeneral) {
		this.productosserviciospreciossinrangosParameterGeneral = productosserviciospreciossinrangosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProductosServiciosPreciosSinRangos() {
		return isPermisoTodoProductosServiciosPreciosSinRangos;
	}

	public void setIsPermisoTodoProductosServiciosPreciosSinRangos(Boolean isPermisoTodoProductosServiciosPreciosSinRangos) {
		this.isPermisoTodoProductosServiciosPreciosSinRangos = isPermisoTodoProductosServiciosPreciosSinRangos;
	}

	public Boolean getIsPermisoNuevoProductosServiciosPreciosSinRangos() {
		return isPermisoNuevoProductosServiciosPreciosSinRangos;
	}

	public void setIsPermisoNuevoProductosServiciosPreciosSinRangos(Boolean isPermisoNuevoProductosServiciosPreciosSinRangos) {
		this.isPermisoNuevoProductosServiciosPreciosSinRangos = isPermisoNuevoProductosServiciosPreciosSinRangos;
	}

	public Boolean getIsPermisoActualizarProductosServiciosPreciosSinRangos() {
		return isPermisoActualizarProductosServiciosPreciosSinRangos;
	}

	public void setIsPermisoActualizarProductosServiciosPreciosSinRangos(Boolean isPermisoActualizarProductosServiciosPreciosSinRangos) {
		this.isPermisoActualizarProductosServiciosPreciosSinRangos = isPermisoActualizarProductosServiciosPreciosSinRangos;
	}

	public Boolean getIsPermisoEliminarProductosServiciosPreciosSinRangos() {
		return isPermisoEliminarProductosServiciosPreciosSinRangos;
	}

	public void setIsPermisoEliminarProductosServiciosPreciosSinRangos(Boolean isPermisoEliminarProductosServiciosPreciosSinRangos) {
		this.isPermisoEliminarProductosServiciosPreciosSinRangos = isPermisoEliminarProductosServiciosPreciosSinRangos;
	}

	public Boolean getIsPermisoGuardarCambiosProductosServiciosPreciosSinRangos() {
		return isPermisoGuardarCambiosProductosServiciosPreciosSinRangos;
	}

	public void setIsPermisoGuardarCambiosProductosServiciosPreciosSinRangos(Boolean isPermisoGuardarCambiosProductosServiciosPreciosSinRangos) {
		this.isPermisoGuardarCambiosProductosServiciosPreciosSinRangos = isPermisoGuardarCambiosProductosServiciosPreciosSinRangos;
	}
	
	public Boolean getIsPermisoConsultaProductosServiciosPreciosSinRangos() {
		return isPermisoConsultaProductosServiciosPreciosSinRangos;
	}

	public void setIsPermisoConsultaProductosServiciosPreciosSinRangos(Boolean isPermisoConsultaProductosServiciosPreciosSinRangos) {
		this.isPermisoConsultaProductosServiciosPreciosSinRangos = isPermisoConsultaProductosServiciosPreciosSinRangos;
	}

	public Boolean getIsPermisoBusquedaProductosServiciosPreciosSinRangos() {
		return isPermisoBusquedaProductosServiciosPreciosSinRangos;
	}

	public void setIsPermisoBusquedaProductosServiciosPreciosSinRangos(Boolean isPermisoBusquedaProductosServiciosPreciosSinRangos) {
		this.isPermisoBusquedaProductosServiciosPreciosSinRangos = isPermisoBusquedaProductosServiciosPreciosSinRangos;
	}

	public Boolean getIsPermisoReporteProductosServiciosPreciosSinRangos() {
		return isPermisoReporteProductosServiciosPreciosSinRangos;
	}

	public void setIsPermisoReporteProductosServiciosPreciosSinRangos(Boolean isPermisoReporteProductosServiciosPreciosSinRangos) {
		this.isPermisoReporteProductosServiciosPreciosSinRangos = isPermisoReporteProductosServiciosPreciosSinRangos;
	}
	
	public Boolean getIsPermisoPaginacionMedioProductosServiciosPreciosSinRangos() {
		return isPermisoPaginacionMedioProductosServiciosPreciosSinRangos;
	}

	public void setIsPermisoPaginacionMedioProductosServiciosPreciosSinRangos(Boolean isPermisoPaginacionMedioProductosServiciosPreciosSinRangos) {
		this.isPermisoPaginacionMedioProductosServiciosPreciosSinRangos = isPermisoPaginacionMedioProductosServiciosPreciosSinRangos;
	}
	
	public Boolean getIsPermisoPaginacionTodoProductosServiciosPreciosSinRangos() {
		return isPermisoPaginacionTodoProductosServiciosPreciosSinRangos;
	}

	public void setIsPermisoPaginacionTodoProductosServiciosPreciosSinRangos(Boolean isPermisoPaginacionTodoProductosServiciosPreciosSinRangos) {
		this.isPermisoPaginacionTodoProductosServiciosPreciosSinRangos = isPermisoPaginacionTodoProductosServiciosPreciosSinRangos;
	}
	
	public Boolean getIsPermisoPaginacionAltoProductosServiciosPreciosSinRangos() {
		return isPermisoPaginacionAltoProductosServiciosPreciosSinRangos;
	}

	public void setIsPermisoPaginacionAltoProductosServiciosPreciosSinRangos(Boolean isPermisoPaginacionAltoProductosServiciosPreciosSinRangos) {
		this.isPermisoPaginacionAltoProductosServiciosPreciosSinRangos = isPermisoPaginacionAltoProductosServiciosPreciosSinRangos;
	}
	
	public Boolean getIsPermisoCopiarProductosServiciosPreciosSinRangos() {
		return isPermisoCopiarProductosServiciosPreciosSinRangos;
	}

	public void setIsPermisoCopiarProductosServiciosPreciosSinRangos(Boolean isPermisoCopiarProductosServiciosPreciosSinRangos) {
		this.isPermisoCopiarProductosServiciosPreciosSinRangos = isPermisoCopiarProductosServiciosPreciosSinRangos;
	}
	
	public Boolean getIsPermisoVerFormProductosServiciosPreciosSinRangos() {
		return isPermisoVerFormProductosServiciosPreciosSinRangos;
	}

	public void setIsPermisoVerFormProductosServiciosPreciosSinRangos(Boolean isPermisoVerFormProductosServiciosPreciosSinRangos) {
		this.isPermisoVerFormProductosServiciosPreciosSinRangos = isPermisoVerFormProductosServiciosPreciosSinRangos;
	}
	
	public Boolean getIsPermisoDuplicarProductosServiciosPreciosSinRangos() {
		return isPermisoDuplicarProductosServiciosPreciosSinRangos;
	}

	public void setIsPermisoDuplicarProductosServiciosPreciosSinRangos(Boolean isPermisoDuplicarProductosServiciosPreciosSinRangos) {
		this.isPermisoDuplicarProductosServiciosPreciosSinRangos = isPermisoDuplicarProductosServiciosPreciosSinRangos;
	}
	
	public Boolean getIsPermisoOrdenProductosServiciosPreciosSinRangos() {
		return isPermisoOrdenProductosServiciosPreciosSinRangos;
	}

	public void setIsPermisoOrdenProductosServiciosPreciosSinRangos(Boolean isPermisoOrdenProductosServiciosPreciosSinRangos) {
		this.isPermisoOrdenProductosServiciosPreciosSinRangos = isPermisoOrdenProductosServiciosPreciosSinRangos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProductosServiciosPreciosSinRangos() {
		return isVisibilidadCeldaNuevoProductosServiciosPreciosSinRangos;
	}

	public void setIsVisibilidadCeldaNuevoProductosServiciosPreciosSinRangos(Boolean isVisibilidadCeldaNuevoProductosServiciosPreciosSinRangos) {
		this.isVisibilidadCeldaNuevoProductosServiciosPreciosSinRangos = isVisibilidadCeldaNuevoProductosServiciosPreciosSinRangos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProductosServiciosPreciosSinRangos() {
		return isVisibilidadCeldaDuplicarProductosServiciosPreciosSinRangos;
	}

	public void setIsVisibilidadCeldaDuplicarProductosServiciosPreciosSinRangos(Boolean isVisibilidadCeldaDuplicarProductosServiciosPreciosSinRangos) {
		this.isVisibilidadCeldaDuplicarProductosServiciosPreciosSinRangos = isVisibilidadCeldaDuplicarProductosServiciosPreciosSinRangos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProductosServiciosPreciosSinRangos() {
		return isVisibilidadCeldaCopiarProductosServiciosPreciosSinRangos;
	}

	public void setIsVisibilidadCeldaCopiarProductosServiciosPreciosSinRangos(Boolean isVisibilidadCeldaCopiarProductosServiciosPreciosSinRangos) {
		this.isVisibilidadCeldaCopiarProductosServiciosPreciosSinRangos = isVisibilidadCeldaCopiarProductosServiciosPreciosSinRangos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProductosServiciosPreciosSinRangos() {
		return isVisibilidadCeldaVerFormProductosServiciosPreciosSinRangos;
	}

	public void setIsVisibilidadCeldaVerFormProductosServiciosPreciosSinRangos(Boolean isVisibilidadCeldaVerFormProductosServiciosPreciosSinRangos) {
		this.isVisibilidadCeldaVerFormProductosServiciosPreciosSinRangos = isVisibilidadCeldaVerFormProductosServiciosPreciosSinRangos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProductosServiciosPreciosSinRangos() {
		return isVisibilidadCeldaOrdenProductosServiciosPreciosSinRangos;
	}

	public void setIsVisibilidadCeldaOrdenProductosServiciosPreciosSinRangos(Boolean isVisibilidadCeldaOrdenProductosServiciosPreciosSinRangos) {
		this.isVisibilidadCeldaOrdenProductosServiciosPreciosSinRangos = isVisibilidadCeldaOrdenProductosServiciosPreciosSinRangos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProductosServiciosPreciosSinRangos() {
		return isVisibilidadCeldaNuevoRelacionesProductosServiciosPreciosSinRangos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProductosServiciosPreciosSinRangos(Boolean isVisibilidadCeldaNuevoRelacionesProductosServiciosPreciosSinRangos) {
		this.isVisibilidadCeldaNuevoRelacionesProductosServiciosPreciosSinRangos = isVisibilidadCeldaNuevoRelacionesProductosServiciosPreciosSinRangos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProductosServiciosPreciosSinRangos() {
		return isVisibilidadCeldaModificarProductosServiciosPreciosSinRangos;
	}

	public void setIsVisibilidadCeldaModificarProductosServiciosPreciosSinRangos(Boolean isVisibilidadCeldaModificarProductosServiciosPreciosSinRangos) {
		this.isVisibilidadCeldaModificarProductosServiciosPreciosSinRangos = isVisibilidadCeldaModificarProductosServiciosPreciosSinRangos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProductosServiciosPreciosSinRangos() {
		return isVisibilidadCeldaActualizarProductosServiciosPreciosSinRangos;
	}

	public void setIsVisibilidadCeldaActualizarProductosServiciosPreciosSinRangos(Boolean isVisibilidadCeldaActualizarProductosServiciosPreciosSinRangos) {
		this.isVisibilidadCeldaActualizarProductosServiciosPreciosSinRangos = isVisibilidadCeldaActualizarProductosServiciosPreciosSinRangos;
	}

	public Boolean getIsVisibilidadCeldaEliminarProductosServiciosPreciosSinRangos() {
		return isVisibilidadCeldaEliminarProductosServiciosPreciosSinRangos;
	}

	public void setIsVisibilidadCeldaEliminarProductosServiciosPreciosSinRangos(Boolean isVisibilidadCeldaEliminarProductosServiciosPreciosSinRangos) {
		this.isVisibilidadCeldaEliminarProductosServiciosPreciosSinRangos = isVisibilidadCeldaEliminarProductosServiciosPreciosSinRangos;
	}

	public Boolean getIsVisibilidadCeldaCancelarProductosServiciosPreciosSinRangos() {
		return isVisibilidadCeldaCancelarProductosServiciosPreciosSinRangos;
	}

	public void setIsVisibilidadCeldaCancelarProductosServiciosPreciosSinRangos(Boolean isVisibilidadCeldaCancelarProductosServiciosPreciosSinRangos) {
		this.isVisibilidadCeldaCancelarProductosServiciosPreciosSinRangos = isVisibilidadCeldaCancelarProductosServiciosPreciosSinRangos;
	}

	public Boolean getIsVisibilidadCeldaGuardarProductosServiciosPreciosSinRangos() {
		return isVisibilidadCeldaGuardarProductosServiciosPreciosSinRangos;
	}

	public void setIsVisibilidadCeldaGuardarProductosServiciosPreciosSinRangos(Boolean isVisibilidadCeldaGuardarProductosServiciosPreciosSinRangos) {
		this.isVisibilidadCeldaGuardarProductosServiciosPreciosSinRangos = isVisibilidadCeldaGuardarProductosServiciosPreciosSinRangos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProductosServiciosPreciosSinRangos() {
		return isVisibilidadCeldaGuardarCambiosProductosServiciosPreciosSinRangos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProductosServiciosPreciosSinRangos(Boolean isVisibilidadCeldaGuardarCambiosProductosServiciosPreciosSinRangos) {
		this.isVisibilidadCeldaGuardarCambiosProductosServiciosPreciosSinRangos = isVisibilidadCeldaGuardarCambiosProductosServiciosPreciosSinRangos;
	}
		
	public ProductosServiciosPreciosSinRangosSessionBean getproductosserviciospreciossinrangosSessionBean() {
		return this.productosserviciospreciossinrangosSessionBean;
	}
	
	public void setproductosserviciospreciossinrangosSessionBean(ProductosServiciosPreciosSinRangosSessionBean productosserviciospreciossinrangosSessionBean) {
		this.productosserviciospreciossinrangosSessionBean=productosserviciospreciossinrangosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaProductosServiciosPreciosSinRangos() {
		return this.isVisibilidadBusquedaProductosServiciosPreciosSinRangos;
	}

	public void setisVisibilidadBusquedaProductosServiciosPreciosSinRangos(Boolean isVisibilidadBusquedaProductosServiciosPreciosSinRangos) {
		this.isVisibilidadBusquedaProductosServiciosPreciosSinRangos=isVisibilidadBusquedaProductosServiciosPreciosSinRangos;
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

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(productosserviciospreciossinrangos,null);
				this.setActualParaGuardarSucursalForeignKey(productosserviciospreciossinrangos,null);
				this.setActualParaGuardarBodegaForeignKey(productosserviciospreciossinrangos,null);
				this.setActualParaGuardarLineaForeignKey(productosserviciospreciossinrangos,null);
				this.setActualParaGuardarLineaGrupoForeignKey(productosserviciospreciossinrangos,null);
				this.setActualParaGuardarLineaCategoriaForeignKey(productosserviciospreciossinrangos,null);
				this.setActualParaGuardarLineaMarcaForeignKey(productosserviciospreciossinrangos,null);
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
	
	public void bugActualizarReferenciaActual(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos,ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProductosServiciosPreciosSinRangos(productosserviciospreciossinrangos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		productosserviciospreciossinrangosAux.setId(productosserviciospreciossinrangos.getId());
		productosserviciospreciossinrangosAux.setVersionRow(productosserviciospreciossinrangos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosLocal) throws Exception {
		
		if(this.productosserviciospreciossinrangosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosLocal) throws Exception {	
		if(this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				productosserviciospreciossinrangosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				productosserviciospreciossinrangosLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				productosserviciospreciossinrangosLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineaBeanSwingJInternalFrameLocal.actualizarLista(lineaBeanSwingJInternalFrameLocal.linea,this.lineasForeignKey);

				lineaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineaBeanSwingJInternalFrameLocal.linea);

				productosserviciospreciossinrangosLocal.setLinea(lineaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey("Formulario");
				this.setActualLineaForeignKey(lineaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineagrupoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineagrupoBeanSwingJInternalFrameLocal.getlinea(),true);
				lineagrupoBeanSwingJInternalFrameLocal.actualizarLista(lineagrupoBeanSwingJInternalFrameLocal.linea,this.lineagruposForeignKey);

				lineagrupoBeanSwingJInternalFrameLocal.actualizarRelaciones(lineagrupoBeanSwingJInternalFrameLocal.linea);

				productosserviciospreciossinrangosLocal.setLineaGrupo(lineagrupoBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey("Formulario");
				this.setActualLineaGrupoForeignKey(lineagrupoBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineacategoriaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineacategoriaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineacategoriaBeanSwingJInternalFrameLocal.actualizarLista(lineacategoriaBeanSwingJInternalFrameLocal.linea,this.lineacategoriasForeignKey);

				lineacategoriaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				productosserviciospreciossinrangosLocal.setLineaCategoria(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaCategoria();
				this.cargarCombosFrameLineaCategoriasForeignKey("Formulario");
				this.setActualLineaCategoriaForeignKey(lineacategoriaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineamarcaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineamarcaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineamarcaBeanSwingJInternalFrameLocal.actualizarLista(lineamarcaBeanSwingJInternalFrameLocal.linea,this.lineamarcasForeignKey);

				lineamarcaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineamarcaBeanSwingJInternalFrameLocal.linea);

				productosserviciospreciossinrangosLocal.setLineaMarca(lineamarcaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaMarca();
				this.cargarCombosFrameLineaMarcasForeignKey("Formulario");
				this.setActualLineaMarcaForeignKey(lineamarcaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProductosServiciosPreciosSinRangosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = productosserviciospreciossinrangosValidator.getInvalidValues(this.productosserviciospreciossinrangos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos,List<ProductosServiciosPreciosSinRangos> productosserviciospreciossinrangoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos,List<ProductosServiciosPreciosSinRangos> productosserviciospreciossinrangoss) throws Exception {
		try	{			
			ProductosServiciosPreciosSinRangosConstantesFunciones.actualizarSelectedLista(productosserviciospreciossinrangos,productosserviciospreciossinrangoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProductosServiciosPreciosSinRangos> productosserviciospreciossinrangossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				productosserviciospreciossinrangossLocal=this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				productosserviciospreciossinrangossLocal=this.productosserviciospreciossinrangoss;
			}
			//ARCHITECTURE
		
			for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosLocal:productosserviciospreciossinrangossLocal) {
				if(this.permiteMantenimiento(productosserviciospreciossinrangosLocal) && productosserviciospreciossinrangosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProductosServiciosPreciosSinRangosConstantesFunciones.getProductosServiciosPreciosSinRangosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProductosServiciosPreciosSinRangosConstantesFunciones.NOMBRESUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jLabelnombre_sucursalProductosServiciosPreciosSinRangos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosServiciosPreciosSinRangosConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jLabelcodigoProductosServiciosPreciosSinRangos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosServiciosPreciosSinRangosConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jLabelnombreProductosServiciosPreciosSinRangos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosServiciosPreciosSinRangosConstantesFunciones.NOMBREBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jLabelnombre_bodegaProductosServiciosPreciosSinRangos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosServiciosPreciosSinRangosConstantesFunciones.NOMBREUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jLabelnombre_unidadProductosServiciosPreciosSinRangos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosServiciosPreciosSinRangosConstantesFunciones.CODIGOTIPOPRECIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jLabelcodigo_tipo_precioProductosServiciosPreciosSinRangos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosServiciosPreciosSinRangosConstantesFunciones.PRECIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jLabelprecioProductosServiciosPreciosSinRangos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jLabelnombre_sucursalProductosServiciosPreciosSinRangos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jLabelcodigoProductosServiciosPreciosSinRangos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jLabelnombreProductosServiciosPreciosSinRangos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jLabelnombre_bodegaProductosServiciosPreciosSinRangos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jLabelnombre_unidadProductosServiciosPreciosSinRangos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jLabelcodigo_tipo_precioProductosServiciosPreciosSinRangos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jLabelprecioProductosServiciosPreciosSinRangos,"");
		
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
		this.iIdNuevoProductosServiciosPreciosSinRangos--;	
		
		
		this.productosserviciospreciossinrangosAux=new ProductosServiciosPreciosSinRangos();
		
		this.productosserviciospreciossinrangosAux.setId(this.iIdNuevoProductosServiciosPreciosSinRangos);
		this.productosserviciospreciossinrangosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().add(this.productosserviciospreciossinrangosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.productosserviciospreciossinrangoss.add(this.productosserviciospreciossinrangosAux);
		}
		//ARCHITECTURE
		
		this.productosserviciospreciossinrangos=this.productosserviciospreciossinrangosAux;
		
		if(ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);
			this.setVariablesObjetoActualToFormularioForeignKeyProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);
		}
				
		//this.setDefaultControlesProductosServiciosPreciosSinRangos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProductosServiciosPreciosSinRangos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProductosServiciosPreciosSinRangos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductosServiciosPreciosSinRangos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangosBean,this.productosserviciospreciossinrangos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangosReturnGeneral,this.productosserviciospreciossinrangosBean,false);
		
		if(this.productosserviciospreciossinrangosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangosReturnGeneral.getProductosServiciosPreciosSinRangos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangosReturnGeneral.getProductosServiciosPreciosSinRangos());
		}
		
		if(this.productosserviciospreciossinrangosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangosReturnGeneral.getProductosServiciosPreciosSinRangos(),classes);//this.productosserviciospreciossinrangosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProductosServiciosPreciosSinRangos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProductosServiciosPreciosSinRangos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.RecargarFormProductosServiciosPreciosSinRangos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false);
						
			if(productosserviciospreciossinrangosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductosServiciosPreciosSinRangos();
			}
			
			this.actualizarVisualTableDatosProductosServiciosPreciosSinRangos();
			
			this.jTableDatosProductosServiciosPreciosSinRangos.setRowSelectionInterval(this.getIndiceNuevoProductosServiciosPreciosSinRangos(), this.getIndiceNuevoProductosServiciosPreciosSinRangos());
			
			this.seleccionarFilaTablaProductosServiciosPreciosSinRangosActual();
						
			this.actualizarEstadoCeldasBotonesProductosServiciosPreciosSinRangos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProductosServiciosPreciosSinRangos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextAreanombre_sucursalProductosServiciosPreciosSinRangos.setEnabled(isHabilitar && this.productosserviciospreciossinrangosConstantesFunciones.activarnombre_sucursalProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextFieldcodigoProductosServiciosPreciosSinRangos.setEnabled(isHabilitar && this.productosserviciospreciossinrangosConstantesFunciones.activarcodigoProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextAreanombreProductosServiciosPreciosSinRangos.setEnabled(isHabilitar && this.productosserviciospreciossinrangosConstantesFunciones.activarnombreProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextAreanombre_bodegaProductosServiciosPreciosSinRangos.setEnabled(isHabilitar && this.productosserviciospreciossinrangosConstantesFunciones.activarnombre_bodegaProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextFieldnombre_unidadProductosServiciosPreciosSinRangos.setEnabled(isHabilitar && this.productosserviciospreciossinrangosConstantesFunciones.activarnombre_unidadProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextAreacodigo_tipo_precioProductosServiciosPreciosSinRangos.setEnabled(isHabilitar && this.productosserviciospreciossinrangosConstantesFunciones.activarcodigo_tipo_precioProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextFieldprecioProductosServiciosPreciosSinRangos.setEnabled(isHabilitar && this.productosserviciospreciossinrangosConstantesFunciones.activarprecioProductosServiciosPreciosSinRangos);	
		//
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_empresaProductosServiciosPreciosSinRangos.setEnabled(isHabilitar && this.productosserviciospreciossinrangosConstantesFunciones.activarid_empresaProductosServiciosPreciosSinRangos);//
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_sucursalProductosServiciosPreciosSinRangos.setEnabled(isHabilitar && this.productosserviciospreciossinrangosConstantesFunciones.activarid_sucursalProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_bodegaProductosServiciosPreciosSinRangos.setEnabled(isHabilitar && this.productosserviciospreciossinrangosConstantesFunciones.activarid_bodegaProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_lineaProductosServiciosPreciosSinRangos.setEnabled(isHabilitar && this.productosserviciospreciossinrangosConstantesFunciones.activarid_lineaProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_grupoProductosServiciosPreciosSinRangos.setEnabled(isHabilitar && this.productosserviciospreciossinrangosConstantesFunciones.activarid_linea_grupoProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_categoriaProductosServiciosPreciosSinRangos.setEnabled(isHabilitar && this.productosserviciospreciossinrangosConstantesFunciones.activarid_linea_categoriaProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_marcaProductosServiciosPreciosSinRangos.setEnabled(isHabilitar && this.productosserviciospreciossinrangosConstantesFunciones.activarid_linea_marcaProductosServiciosPreciosSinRangos);
	};
	
	public void setDefaultControlesProductosServiciosPreciosSinRangos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProductosServiciosPreciosSinRangos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.productosserviciospreciossinrangosSessionBean.setConGuardarRelaciones(true);			
			this.productosserviciospreciossinrangosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTabbedPaneRelacionesProductosServiciosPreciosSinRangos.setVisible(true);
			
					
		} else {
			//this.productosserviciospreciossinrangosSessionBean.setConGuardarRelaciones(false);			
			this.productosserviciospreciossinrangosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTabbedPaneRelacionesProductosServiciosPreciosSinRangos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProductosServiciosPreciosSinRangos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosAux:this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss()) {
				if(productosserviciospreciossinrangosAux.getId().equals(this.iIdNuevoProductosServiciosPreciosSinRangos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosAux:this.productosserviciospreciossinrangoss) {
				if(productosserviciospreciossinrangosAux.getId().equals(this.iIdNuevoProductosServiciosPreciosSinRangos)) {
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
	
	public int getIndiceActualProductosServiciosPreciosSinRangos(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosAux:this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss()) {
				if(productosserviciospreciossinrangosAux.getId().equals(productosserviciospreciossinrangos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosAux:this.productosserviciospreciossinrangoss) {
				if(productosserviciospreciossinrangosAux.getId().equals(productosserviciospreciossinrangos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProductosServiciosPreciosSinRangos(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosAux:this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss()) {
				if(productosserviciospreciossinrangosAux.getProductosServiciosPreciosSinRangosOriginal().getId().equals(productosserviciospreciossinrangosOriginal.getId())) {
					existe=true;
					productosserviciospreciossinrangosOriginal.setId(productosserviciospreciossinrangosAux.getId());
					productosserviciospreciossinrangosOriginal.setVersionRow(productosserviciospreciossinrangosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosAux:this.productosserviciospreciossinrangoss) {
				if(productosserviciospreciossinrangosAux.getProductosServiciosPreciosSinRangosOriginal().getId().equals(productosserviciospreciossinrangosOriginal.getId())) {
					existe=true;
					productosserviciospreciossinrangosOriginal.setId(productosserviciospreciossinrangosAux.getId());
					productosserviciospreciossinrangosOriginal.setVersionRow(productosserviciospreciossinrangosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProductosServiciosPreciosSinRangos(Boolean esParaCancelar) throws Exception {
		productosserviciospreciossinrangossAux=new ArrayList<ProductosServiciosPreciosSinRangos>();
		productosserviciospreciossinrangosAux=new ProductosServiciosPreciosSinRangos();
		
		if(!this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosAux:this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss()) {
					if(productosserviciospreciossinrangosAux.getId()<0) {
						productosserviciospreciossinrangossAux.add(productosserviciospreciossinrangosAux);
					}		
				}
				this.iIdNuevoProductosServiciosPreciosSinRangos=0L;
				this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().removeAll(productosserviciospreciossinrangossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosAux:this.productosserviciospreciossinrangoss) {
					if(productosserviciospreciossinrangosAux.getId()<0) {
						productosserviciospreciossinrangossAux.add(productosserviciospreciossinrangosAux);
					}		
				}
				this.iIdNuevoProductosServiciosPreciosSinRangos=0L;
				this.productosserviciospreciossinrangoss.removeAll(productosserviciospreciossinrangossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProductosServiciosPreciosSinRangos 
					&& this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().size()>0
					) {
					productosserviciospreciossinrangosAux=this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().get(this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().size() - 1);
				
					if(productosserviciospreciossinrangosAux.getId()<0) {
						this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().remove(productosserviciospreciossinrangosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProductosServiciosPreciosSinRangos && this.productosserviciospreciossinrangoss.size()>0) {
					productosserviciospreciossinrangosAux=this.productosserviciospreciossinrangoss.get(this.productosserviciospreciossinrangoss.size() - 1);
				
					if(productosserviciospreciossinrangosAux.getId()<0) {
						this.productosserviciospreciossinrangoss.remove(productosserviciospreciossinrangosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProductosServiciosPreciosSinRangos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(productosserviciospreciossinrangos.getId()<0) {
				this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().remove(this.productosserviciospreciossinrangos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(productosserviciospreciossinrangos.getId()<0) {
				this.productosserviciospreciossinrangoss.remove(this.productosserviciospreciossinrangos);
			}
		}			
	}
	
	public void setEstadosInicialesProductosServiciosPreciosSinRangos(List<ProductosServiciosPreciosSinRangos> productosserviciospreciossinrangossAux) throws Exception {
		ProductosServiciosPreciosSinRangosConstantesFunciones.setEstadosInicialesProductosServiciosPreciosSinRangos(productosserviciospreciossinrangossAux);
	}
	
	public void setEstadosInicialesProductosServiciosPreciosSinRangos(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosAux) throws Exception {
		ProductosServiciosPreciosSinRangosConstantesFunciones.setEstadosInicialesProductosServiciosPreciosSinRangos(productosserviciospreciossinrangosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProductosServiciosPreciosSinRangosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProductosServiciosPreciosSinRangos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProductosServiciosPreciosSinRangosActual()) {
				if(!this.isEsNuevoProductosServiciosPreciosSinRangos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProductosServiciosPreciosSinRangos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProductosServiciosPreciosSinRangos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProductosServiciosPreciosSinRangosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Productos Servicios Precios Sin Rangos ?", "MANTENIMIENTO DE Productos Servicios Precios Sin Rangos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProductosServiciosPreciosSinRangos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos) throws Exception {
		ProductosServiciosPreciosSinRangosConstantesFunciones.seleccionarAsignar(this.productosserviciospreciossinrangos,productosserviciospreciossinrangos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProductosServiciosPreciosSinRangos=this.isPermisoActualizarOriginalProductosServiciosPreciosSinRangos;
			
			
			this.seleccionarAsignar(productosserviciospreciossinrangos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProductosServiciosPreciosSinRangos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.productosserviciospreciossinrangosSessionBean.setsFuncionBusquedaRapida(this.productosserviciospreciossinrangosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProductosServiciosPreciosSinRangos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProductosServiciosPreciosSinRangos(esParaCancelar);				
				this.cancelarNuevoProductosServiciosPreciosSinRangos(esParaCancelar);								
			}
			
			this.productosserviciospreciossinrangos=new ProductosServiciosPreciosSinRangos();
			
			this.inicializarProductosServiciosPreciosSinRangos();
			
			this.actualizarEstadoCeldasBotonesProductosServiciosPreciosSinRangos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProductosServiciosPreciosSinRangos() throws Exception {
		try {
			ProductosServiciosPreciosSinRangosConstantesFunciones.inicializarProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);
			
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
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProductosServiciosPreciosSinRangoss(String sAccionBusqueda,List<ProductosServiciosPreciosSinRangos> productosserviciospreciossinrangossParaReportes) throws Exception {
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
					sPathReporteFinal="ProductosServiciosPreciosSinRangos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProductosServiciosPreciosSinRangosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProductosServiciosPreciosSinRangosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProductosServiciosPreciosSinRangos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Productos Servicios Precios Sin Rangoses");		
		parameters.put("busquedapor", ProductosServiciosPreciosSinRangosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProductosServiciosPreciosSinRangos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProductosServiciosPreciosSinRangosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProductosServiciosPreciosSinRangosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProductosServiciosPreciosSinRangos=new JRBeanArrayDataSource(ProductosServiciosPreciosSinRangosJInternalFrame.TraerProductosServiciosPreciosSinRangosBeans(productosserviciospreciossinrangossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProductosServiciosPreciosSinRangos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProductosServiciosPreciosSinRangosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProductosServiciosPreciosSinRangosBean.TraerProductosServiciosPreciosSinRangosBeans(productosserviciospreciossinrangossParaReportes).toArray()));
							
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
				this.generarExcelReporteProductosServiciosPreciosSinRangoss(sAccionBusqueda,sTipoArchivoReporte,productosserviciospreciossinrangossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProductosServiciosPreciosSinRangoss(sAccionBusqueda,sTipoArchivoReporte,productosserviciospreciossinrangossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProductosServiciosPreciosSinRangosActionPerformed(null);
					//this.generarExcelReporteProductosServiciosPreciosSinRangoss(sAccionBusqueda,sTipoArchivoReporte,productosserviciospreciossinrangossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProductosServiciosPreciosSinRangoss(sAccionBusqueda,sTipoArchivoReporte,productosserviciospreciossinrangossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProductosServiciosPreciosSinRangoss(sAccionBusqueda,sTipoArchivoReporte,productosserviciospreciossinrangossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProductosServiciosPreciosSinRangoss(sAccionBusqueda,sTipoArchivoReporte,productosserviciospreciossinrangossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProductosServiciosPreciosSinRangoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductosServiciosPreciosSinRangos> productosserviciospreciossinrangossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosserviciospreciossinrangos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductosServiciosPreciosSinRangoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductosServiciosPreciosSinRangos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos : productosserviciospreciossinrangossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProductosServiciosPreciosSinRangosConstantesFunciones.generarExcelReporteDataProductosServiciosPreciosSinRangos("NORMAL",row,workbook,productosserviciospreciossinrangos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Servicios Precios Sin Rangos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProductosServiciosPreciosSinRangos(String sTipo,Row row,Workbook workbook) {
		
		ProductosServiciosPreciosSinRangosConstantesFunciones.generarExcelReporteHeaderProductosServiciosPreciosSinRangos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProductosServiciosPreciosSinRangoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductosServiciosPreciosSinRangos> productosserviciospreciossinrangossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosserviciospreciossinrangos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductosServiciosPreciosSinRangoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos : productosserviciospreciossinrangossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.getProductosServiciosPreciosSinRangosDescripcion(productosserviciospreciossinrangos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciospreciossinrangos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciospreciossinrangos.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciospreciossinrangos.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDLINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDLINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciospreciossinrangos.getlinea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDLINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDLINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciospreciossinrangos.getlineagrupo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDLINEACATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDLINEACATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciospreciossinrangos.getlineacategoria_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDLINEAMARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDLINEAMARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciospreciossinrangos.getlineamarca_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBRESUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBRESUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciospreciossinrangos.getnombre_sucursal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciospreciossinrangos.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciospreciossinrangos.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBREBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBREBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciospreciossinrangos.getnombre_bodega());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBREUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBREUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciospreciossinrangos.getnombre_unidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_CODIGOTIPOPRECIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_CODIGOTIPOPRECIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciospreciossinrangos.getcodigo_tipo_precio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_PRECIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_PRECIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciospreciossinrangos.getprecio());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Servicios Precios Sin Rangos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProductosServiciosPreciosSinRangoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductosServiciosPreciosSinRangos> productosserviciospreciossinrangossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProductosServiciosPreciosSinRangos> productosserviciospreciossinrangossRespaldo=null;
		
		classes=ProductosServiciosPreciosSinRangosConstantesFunciones.getClassesRelationshipsOfProductosServiciosPreciosSinRangos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.productosserviciospreciossinrangosLogic.setDatosCliente(this.datosCliente);
		this.productosserviciospreciossinrangosLogic.setDatosDeep(this.datosDeep);
		this.productosserviciospreciossinrangosLogic.setIsConDeep(true);
		
		productosserviciospreciossinrangossRespaldo=this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss();
		
		this.productosserviciospreciossinrangosLogic.setProductosServiciosPreciosSinRangoss(productosserviciospreciossinrangossParaReportes);	
		this.productosserviciospreciossinrangosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		productosserviciospreciossinrangossParaReportes=this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss();
		this.productosserviciospreciossinrangosLogic.setProductosServiciosPreciosSinRangoss(productosserviciospreciossinrangossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosserviciospreciossinrangos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductosServiciosPreciosSinRangoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductosServiciosPreciosSinRangos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos : productosserviciospreciossinrangossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProductosServiciosPreciosSinRangos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProductosServiciosPreciosSinRangosConstantesFunciones.generarExcelReporteDataProductosServiciosPreciosSinRangos("NORMAL",row,workbook,productosserviciospreciossinrangos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.getProductosServiciosPreciosSinRangosDescripcion(productosserviciospreciossinrangos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Servicios Precios Sin Rangos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProductosServiciosPreciosSinRangos() throws Exception {		
		this.startProcessProductosServiciosPreciosSinRangos(true);
	}
	
	public void startProcessProductosServiciosPreciosSinRangos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos ,this.jPanelParametrosReportesProductosServiciosPreciosSinRangos, this.jScrollPanelDatosProductosServiciosPreciosSinRangos,this.jPanelPaginacionProductosServiciosPreciosSinRangos, this.jScrollPanelDatosEdicionProductosServiciosPreciosSinRangos, this.jPanelAccionesProductosServiciosPreciosSinRangos,this.jPanelAccionesFormularioProductosServiciosPreciosSinRangos,this.jmenuBarProductosServiciosPreciosSinRangos,this.jmenuBarDetalleProductosServiciosPreciosSinRangos,this.jTtoolBarProductosServiciosPreciosSinRangos,this.jTtoolBarDetalleProductosServiciosPreciosSinRangos);		
		
		final JTabbedPane jTabbedPaneBusquedasProductosServiciosPreciosSinRangos=this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos; 
		
		final JPanel jPanelParametrosReportesProductosServiciosPreciosSinRangos=this.jPanelParametrosReportesProductosServiciosPreciosSinRangos;
		//final JScrollPane jScrollPanelDatosProductosServiciosPreciosSinRangos=this.jScrollPanelDatosProductosServiciosPreciosSinRangos;
		final JTable jTableDatosProductosServiciosPreciosSinRangos=this.jTableDatosProductosServiciosPreciosSinRangos;		
		final JPanel jPanelPaginacionProductosServiciosPreciosSinRangos=this.jPanelPaginacionProductosServiciosPreciosSinRangos;
		//final JScrollPane jScrollPanelDatosEdicionProductosServiciosPreciosSinRangos=this.jScrollPanelDatosEdicionProductosServiciosPreciosSinRangos;
		final JPanel jPanelAccionesProductosServiciosPreciosSinRangos=this.jPanelAccionesProductosServiciosPreciosSinRangos;
		
		JPanel jPanelCamposAuxiliarProductosServiciosPreciosSinRangos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProductosServiciosPreciosSinRangos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
			jPanelCamposAuxiliarProductosServiciosPreciosSinRangos=this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jPanelCamposProductosServiciosPreciosSinRangos;
			jPanelAccionesFormularioAuxiliarProductosServiciosPreciosSinRangos=this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jPanelAccionesFormularioProductosServiciosPreciosSinRangos;
		}
		
		final JPanel jPanelCamposProductosServiciosPreciosSinRangos=jPanelCamposAuxiliarProductosServiciosPreciosSinRangos;
		final JPanel jPanelAccionesFormularioProductosServiciosPreciosSinRangos=jPanelAccionesFormularioAuxiliarProductosServiciosPreciosSinRangos;
		
		
		final JMenuBar jmenuBarProductosServiciosPreciosSinRangos=this.jmenuBarProductosServiciosPreciosSinRangos;
		final JToolBar jTtoolBarProductosServiciosPreciosSinRangos=this.jTtoolBarProductosServiciosPreciosSinRangos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProductosServiciosPreciosSinRangos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductosServiciosPreciosSinRangos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
			jmenuBarDetalleAuxiliarProductosServiciosPreciosSinRangos=this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jmenuBarDetalleProductosServiciosPreciosSinRangos;
			jTtoolBarDetalleAuxiliarProductosServiciosPreciosSinRangos=this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTtoolBarDetalleProductosServiciosPreciosSinRangos;
		}
		
		final JMenuBar jmenuBarDetalleProductosServiciosPreciosSinRangos=jmenuBarDetalleAuxiliarProductosServiciosPreciosSinRangos;
		final JToolBar jTtoolBarDetalleProductosServiciosPreciosSinRangos=jTtoolBarDetalleAuxiliarProductosServiciosPreciosSinRangos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductosServiciosPreciosSinRangos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductosServiciosPreciosSinRangos;
			processRunnable.jTableDatos=jTableDatosProductosServiciosPreciosSinRangos;
			processRunnable.jPanelCampos=jPanelCamposProductosServiciosPreciosSinRangos;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductosServiciosPreciosSinRangos;
			processRunnable.jPanelAcciones=jPanelAccionesProductosServiciosPreciosSinRangos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductosServiciosPreciosSinRangos;
			
			
			processRunnable.jmenuBar=jmenuBarProductosServiciosPreciosSinRangos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductosServiciosPreciosSinRangos;
			processRunnable.jTtoolBar=jTtoolBarProductosServiciosPreciosSinRangos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductosServiciosPreciosSinRangos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductosServiciosPreciosSinRangos ,jPanelParametrosReportesProductosServiciosPreciosSinRangos,jTableDatosProductosServiciosPreciosSinRangos, /*jScrollPanelDatosProductosServiciosPreciosSinRangos,*/jPanelCamposProductosServiciosPreciosSinRangos,jPanelPaginacionProductosServiciosPreciosSinRangos, /*jScrollPanelDatosEdicionProductosServiciosPreciosSinRangos,*/ jPanelAccionesProductosServiciosPreciosSinRangos,jPanelAccionesFormularioProductosServiciosPreciosSinRangos,jmenuBarProductosServiciosPreciosSinRangos,jmenuBarDetalleProductosServiciosPreciosSinRangos,jTtoolBarProductosServiciosPreciosSinRangos,jTtoolBarDetalleProductosServiciosPreciosSinRangos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductosServiciosPreciosSinRangos ,jPanelParametrosReportesProductosServiciosPreciosSinRangos, jScrollPanelDatosProductosServiciosPreciosSinRangos,jPanelPaginacionProductosServiciosPreciosSinRangos, jScrollPanelDatosEdicionProductosServiciosPreciosSinRangos, jPanelAccionesProductosServiciosPreciosSinRangos,jPanelAccionesFormularioProductosServiciosPreciosSinRangos,jmenuBarProductosServiciosPreciosSinRangos,jmenuBarDetalleProductosServiciosPreciosSinRangos,jTtoolBarProductosServiciosPreciosSinRangos,jTtoolBarDetalleProductosServiciosPreciosSinRangos);
						
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
	
	public void finishProcessProductosServiciosPreciosSinRangos() {// throws Exception 
		this.finishProcessProductosServiciosPreciosSinRangos(true);
	}
	
	public void finishProcessProductosServiciosPreciosSinRangos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos ,this.jPanelParametrosReportesProductosServiciosPreciosSinRangos, this.jScrollPanelDatosProductosServiciosPreciosSinRangos,this.jPanelPaginacionProductosServiciosPreciosSinRangos, this.jScrollPanelDatosEdicionProductosServiciosPreciosSinRangos, this.jPanelAccionesProductosServiciosPreciosSinRangos,this.jPanelAccionesFormularioProductosServiciosPreciosSinRangos,this.jmenuBarProductosServiciosPreciosSinRangos,this.jmenuBarDetalleProductosServiciosPreciosSinRangos,this.jTtoolBarProductosServiciosPreciosSinRangos,this.jTtoolBarDetalleProductosServiciosPreciosSinRangos);		
		
		final JTabbedPane jTabbedPaneBusquedasProductosServiciosPreciosSinRangos=this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos; 
		
		final JPanel jPanelParametrosReportesProductosServiciosPreciosSinRangos=this.jPanelParametrosReportesProductosServiciosPreciosSinRangos;
		//final JScrollPane jScrollPanelDatosProductosServiciosPreciosSinRangos=this.jScrollPanelDatosProductosServiciosPreciosSinRangos;
		final JTable jTableDatosProductosServiciosPreciosSinRangos=this.jTableDatosProductosServiciosPreciosSinRangos;		
		final JPanel jPanelPaginacionProductosServiciosPreciosSinRangos=this.jPanelPaginacionProductosServiciosPreciosSinRangos;
		//final JScrollPane jScrollPanelDatosEdicionProductosServiciosPreciosSinRangos=this.jScrollPanelDatosEdicionProductosServiciosPreciosSinRangos;
		final JPanel jPanelAccionesProductosServiciosPreciosSinRangos=this.jPanelAccionesProductosServiciosPreciosSinRangos;
		
		JPanel jPanelCamposAuxiliarProductosServiciosPreciosSinRangos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProductosServiciosPreciosSinRangos=new JPanel();
		
		if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
			jPanelCamposAuxiliarProductosServiciosPreciosSinRangos=this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jPanelCamposProductosServiciosPreciosSinRangos;
			jPanelAccionesFormularioAuxiliarProductosServiciosPreciosSinRangos=this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jPanelAccionesFormularioProductosServiciosPreciosSinRangos;
		}
		
		final JPanel jPanelCamposProductosServiciosPreciosSinRangos=jPanelCamposAuxiliarProductosServiciosPreciosSinRangos;
		final JPanel jPanelAccionesFormularioProductosServiciosPreciosSinRangos=jPanelAccionesFormularioAuxiliarProductosServiciosPreciosSinRangos;
		
		
		final JMenuBar jmenuBarProductosServiciosPreciosSinRangos=this.jmenuBarProductosServiciosPreciosSinRangos;		
		final JToolBar jTtoolBarProductosServiciosPreciosSinRangos=this.jTtoolBarProductosServiciosPreciosSinRangos;
				
		JMenuBar jmenuBarDetalleAuxiliarProductosServiciosPreciosSinRangos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductosServiciosPreciosSinRangos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
			jmenuBarDetalleAuxiliarProductosServiciosPreciosSinRangos=this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jmenuBarDetalleProductosServiciosPreciosSinRangos;
			jTtoolBarDetalleAuxiliarProductosServiciosPreciosSinRangos=this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTtoolBarDetalleProductosServiciosPreciosSinRangos;		
		}
		
		final JMenuBar jmenuBarDetalleProductosServiciosPreciosSinRangos=jmenuBarDetalleAuxiliarProductosServiciosPreciosSinRangos;
		final JToolBar jTtoolBarDetalleProductosServiciosPreciosSinRangos=jTtoolBarDetalleAuxiliarProductosServiciosPreciosSinRangos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductosServiciosPreciosSinRangos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductosServiciosPreciosSinRangos;
			processRunnable.jTableDatos=jTableDatosProductosServiciosPreciosSinRangos;
			processRunnable.jPanelCampos=jPanelCamposProductosServiciosPreciosSinRangos;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductosServiciosPreciosSinRangos;
			processRunnable.jPanelAcciones=jPanelAccionesProductosServiciosPreciosSinRangos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductosServiciosPreciosSinRangos;
			
			
			processRunnable.jmenuBar=jmenuBarProductosServiciosPreciosSinRangos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductosServiciosPreciosSinRangos;
			processRunnable.jTtoolBar=jTtoolBarProductosServiciosPreciosSinRangos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductosServiciosPreciosSinRangos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProductosServiciosPreciosSinRangos ,jPanelParametrosReportesProductosServiciosPreciosSinRangos, jTableDatosProductosServiciosPreciosSinRangos,/*jScrollPanelDatosProductosServiciosPreciosSinRangos,*/jPanelCamposProductosServiciosPreciosSinRangos,jPanelPaginacionProductosServiciosPreciosSinRangos, /*jScrollPanelDatosEdicionProductosServiciosPreciosSinRangos,*/ jPanelAccionesProductosServiciosPreciosSinRangos,jPanelAccionesFormularioProductosServiciosPreciosSinRangos,jmenuBarProductosServiciosPreciosSinRangos,jmenuBarDetalleProductosServiciosPreciosSinRangos,jTtoolBarProductosServiciosPreciosSinRangos,jTtoolBarDetalleProductosServiciosPreciosSinRangos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProductosServiciosPreciosSinRangos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProductosServiciosPreciosSinRangos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProductosServiciosPreciosSinRangos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProductosServiciosPreciosSinRangos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProductosServiciosPreciosSinRangos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProductosServiciosPreciosSinRangos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProductosServiciosPreciosSinRangos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProductosServiciosPreciosSinRangos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProductosServiciosPreciosSinRangos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.productosserviciospreciossinrangosConstantesFunciones.getsFinalQueryProductosServiciosPreciosSinRangos();
		String  finalQueryPaginacionTodos=this.productosserviciospreciossinrangosConstantesFunciones.getsFinalQueryProductosServiciosPreciosSinRangos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProductosServiciosPreciosSinRangosConstantesFunciones.getArrayColumnasGlobalesNoProductosServiciosPreciosSinRangos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProductosServiciosPreciosSinRangosConstantesFunciones.getArrayColumnasGlobalesProductosServiciosPreciosSinRangos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProductosServiciosPreciosSinRangosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.productosserviciospreciossinrangossEliminados= new ArrayList<ProductosServiciosPreciosSinRangos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProductosServiciosPreciosSinRangos();
		
				///*ProductosServiciosPreciosSinRangosSessionBean*/this.productosserviciospreciossinrangosSessionBean=new ProductosServiciosPreciosSinRangosSessionBean();
			
			if(this.productosserviciospreciossinrangosSessionBean==null) {
				this.productosserviciospreciossinrangosSessionBean=new ProductosServiciosPreciosSinRangosSessionBean();
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
					this.iNumeroPaginacion=ProductosServiciosPreciosSinRangosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProductosServiciosPreciosSinRangosConstantesFunciones.getClassesForeignKeysOfProductosServiciosPreciosSinRangos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/productosserviciospreciossinrangos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			productosserviciospreciossinrangossAux= new ArrayList<ProductosServiciosPreciosSinRangos>();
			
				
			productosserviciospreciossinrangosLogic.setDatosCliente(this.datosCliente);
			productosserviciospreciossinrangosLogic.setDatosDeep(this.datosDeep);
			productosserviciospreciossinrangosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaProductosServiciosPreciosSinRangos")) {
				this.sDetalleReporte=ProductosServiciosPreciosSinRangosConstantesFunciones.getDetalleIndiceBusquedaProductosServiciosPreciosSinRangos(id_bodegaBusquedaProductosServiciosPreciosSinRangos,id_lineaBusquedaProductosServiciosPreciosSinRangos,id_linea_grupoBusquedaProductosServiciosPreciosSinRangos,id_linea_categoriaBusquedaProductosServiciosPreciosSinRangos,id_linea_marcaBusquedaProductosServiciosPreciosSinRangos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangossBusquedaProductosServiciosPreciosSinRangos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_bodegaBusquedaProductosServiciosPreciosSinRangos,id_lineaBusquedaProductosServiciosPreciosSinRangos,id_linea_grupoBusquedaProductosServiciosPreciosSinRangos,id_linea_categoriaBusquedaProductosServiciosPreciosSinRangos,id_linea_marcaBusquedaProductosServiciosPreciosSinRangos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductosServiciosPreciosSinRangosConstantesFunciones.getDetalleIndiceBusquedaProductosServiciosPreciosSinRangos(id_bodegaBusquedaProductosServiciosPreciosSinRangos,id_lineaBusquedaProductosServiciosPreciosSinRangos,id_linea_grupoBusquedaProductosServiciosPreciosSinRangos,id_linea_categoriaBusquedaProductosServiciosPreciosSinRangos,id_linea_marcaBusquedaProductosServiciosPreciosSinRangos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductosServiciosPreciosSinRangosConstantesFunciones.getDetalleIndiceBusquedaProductosServiciosPreciosSinRangos(id_bodegaBusquedaProductosServiciosPreciosSinRangos,id_lineaBusquedaProductosServiciosPreciosSinRangos,id_linea_grupoBusquedaProductosServiciosPreciosSinRangos,id_linea_categoriaBusquedaProductosServiciosPreciosSinRangos,id_linea_marcaBusquedaProductosServiciosPreciosSinRangos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss()==null||productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productosserviciospreciossinrangoss==null|| productosserviciospreciossinrangoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productosserviciospreciossinrangossAux=new ArrayList<ProductosServiciosPreciosSinRangos>();
						productosserviciospreciossinrangossAux.addAll(productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productosserviciospreciossinrangossAux=new ArrayList<ProductosServiciosPreciosSinRangos>();
							productosserviciospreciossinrangossAux.addAll(productosserviciospreciossinrangoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangossBusquedaProductosServiciosPreciosSinRangos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_bodegaBusquedaProductosServiciosPreciosSinRangos,id_lineaBusquedaProductosServiciosPreciosSinRangos,id_linea_grupoBusquedaProductosServiciosPreciosSinRangos,id_linea_categoriaBusquedaProductosServiciosPreciosSinRangos,id_linea_marcaBusquedaProductosServiciosPreciosSinRangos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductosServiciosPreciosSinRangosConstantesFunciones.getDetalleIndiceBusquedaProductosServiciosPreciosSinRangos(id_bodegaBusquedaProductosServiciosPreciosSinRangos,id_lineaBusquedaProductosServiciosPreciosSinRangos,id_linea_grupoBusquedaProductosServiciosPreciosSinRangos,id_linea_categoriaBusquedaProductosServiciosPreciosSinRangos,id_linea_marcaBusquedaProductosServiciosPreciosSinRangos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductosServiciosPreciosSinRangosConstantesFunciones.getDetalleIndiceBusquedaProductosServiciosPreciosSinRangos(id_bodegaBusquedaProductosServiciosPreciosSinRangos,id_lineaBusquedaProductosServiciosPreciosSinRangos,id_linea_grupoBusquedaProductosServiciosPreciosSinRangos,id_linea_categoriaBusquedaProductosServiciosPreciosSinRangos,id_linea_marcaBusquedaProductosServiciosPreciosSinRangos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductosServiciosPreciosSinRangoss("BusquedaProductosServiciosPreciosSinRangos",productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductosServiciosPreciosSinRangoss("BusquedaProductosServiciosPreciosSinRangos",productosserviciospreciossinrangoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productosserviciospreciossinrangosLogic.setProductosServiciosPreciosSinRangoss(new ArrayList<ProductosServiciosPreciosSinRangos>());
						productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().addAll(productosserviciospreciossinrangossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productosserviciospreciossinrangoss=new ArrayList<ProductosServiciosPreciosSinRangos>();
							productosserviciospreciossinrangoss.addAll(productosserviciospreciossinrangossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProductosServiciosPreciosSinRangos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProductosServiciosPreciosSinRangos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productosserviciospreciossinrangoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productosserviciospreciossinrangoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos) {
		Boolean permite=true;
		
		if(this.productosserviciospreciossinrangos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProductosServiciosPreciosSinRangosConstantesFunciones.getOrderByListaProductosServiciosPreciosSinRangos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProductosServiciosPreciosSinRangosConstantesFunciones.getOrderByListaProductosServiciosPreciosSinRangos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos:productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss()) {
				if(productosserviciospreciossinrangos.getsType().equals(Constantes2.S_TOTALES)) {
					productosserviciospreciossinrangosTotales=productosserviciospreciossinrangos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos:this.productosserviciospreciossinrangoss) {
				if(productosserviciospreciossinrangos.getsType().equals(Constantes2.S_TOTALES)) {
					productosserviciospreciossinrangosTotales=productosserviciospreciossinrangos;
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
			this.productosserviciospreciossinrangosAux=new ProductosServiciosPreciosSinRangos();
			this.productosserviciospreciossinrangosAux.setsType(Constantes2.S_TOTALES);
			this.productosserviciospreciossinrangosAux.setIsNew(false);
			this.productosserviciospreciossinrangosAux.setIsChanged(false);
			this.productosserviciospreciossinrangosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProductosServiciosPreciosSinRangosConstantesFunciones.TotalizarValoresFilaProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss(),this.productosserviciospreciossinrangosAux);
				
				//this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().add(this.productosserviciospreciossinrangosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProductosServiciosPreciosSinRangosConstantesFunciones.TotalizarValoresFilaProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangoss,this.productosserviciospreciossinrangosAux);
				
				this.productosserviciospreciossinrangoss.add(this.productosserviciospreciossinrangosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		productosserviciospreciossinrangosTotales=new ProductosServiciosPreciosSinRangos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().remove(productosserviciospreciossinrangosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productosserviciospreciossinrangoss.remove(productosserviciospreciossinrangosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		productosserviciospreciossinrangosTotales=new ProductosServiciosPreciosSinRangos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos:productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss()) {
				if(productosserviciospreciossinrangos.getsType().equals(Constantes2.S_TOTALES)) {
					productosserviciospreciossinrangosTotales=productosserviciospreciossinrangos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductosServiciosPreciosSinRangosConstantesFunciones.TotalizarValoresFilaProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss(),productosserviciospreciossinrangosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos:this.productosserviciospreciossinrangoss) {
				if(productosserviciospreciossinrangos.getsType().equals(Constantes2.S_TOTALES)) {
					productosserviciospreciossinrangosTotales=productosserviciospreciossinrangos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductosServiciosPreciosSinRangosConstantesFunciones.TotalizarValoresFilaProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangoss,productosserviciospreciossinrangosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProductosServiciosPreciosSinRangossBusquedaProductosServiciosPreciosSinRangos()throws Exception {
		try {
			sAccionBusqueda="BusquedaProductosServiciosPreciosSinRangos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosServiciosPreciosSinRangossFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosServiciosPreciosSinRangossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosServiciosPreciosSinRangossFK_IdLinea()throws Exception {
		try {
			sAccionBusqueda="FK_IdLinea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosServiciosPreciosSinRangossFK_IdLineaCategoria()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaCategoria";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosServiciosPreciosSinRangossFK_IdLineaGrupo()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaGrupo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosServiciosPreciosSinRangossFK_IdLineaMarca()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaMarca";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosServiciosPreciosSinRangossFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProductosServiciosPreciosSinRangossBusquedaProductosServiciosPreciosSinRangos(String sFinalQuery,Long id_bodega,Long id_linea,Long id_linea_grupo,Long id_linea_categoria,Long id_linea_marca)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangossBusquedaProductosServiciosPreciosSinRangos(sFinalQuery,this.pagination,id_bodega,id_linea,id_linea_grupo,id_linea_categoria,id_linea_marca);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosServiciosPreciosSinRangossFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangossFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosServiciosPreciosSinRangossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosServiciosPreciosSinRangossFK_IdLinea(String sFinalQuery,Long id_linea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangossFK_IdLinea(sFinalQuery,this.pagination,id_linea);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosServiciosPreciosSinRangossFK_IdLineaCategoria(String sFinalQuery,Long id_linea_categoria)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangossFK_IdLineaCategoria(sFinalQuery,this.pagination,id_linea_categoria);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosServiciosPreciosSinRangossFK_IdLineaGrupo(String sFinalQuery,Long id_linea_grupo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangossFK_IdLineaGrupo(sFinalQuery,this.pagination,id_linea_grupo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosServiciosPreciosSinRangossFK_IdLineaMarca(String sFinalQuery,Long id_linea_marca)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangossFK_IdLineaMarca(sFinalQuery,this.pagination,id_linea_marca);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosServiciosPreciosSinRangossFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangossFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosProductosServiciosPreciosSinRangos() {
		this.isPermisoTodoProductosServiciosPreciosSinRangos=false;
		this.isPermisoNuevoProductosServiciosPreciosSinRangos=false;
		this.isPermisoActualizarProductosServiciosPreciosSinRangos=false;
		this.isPermisoActualizarOriginalProductosServiciosPreciosSinRangos=false;
		this.isPermisoEliminarProductosServiciosPreciosSinRangos=false;
		this.isPermisoGuardarCambiosProductosServiciosPreciosSinRangos=false;
		this.isPermisoConsultaProductosServiciosPreciosSinRangos=true;
		this.isPermisoBusquedaProductosServiciosPreciosSinRangos=true;
		this.isPermisoReporteProductosServiciosPreciosSinRangos=true;
		this.isPermisoOrdenProductosServiciosPreciosSinRangos=false;		
		this.isPermisoPaginacionMedioProductosServiciosPreciosSinRangos=false;		
		this.isPermisoPaginacionAltoProductosServiciosPreciosSinRangos=false;		
		this.isPermisoPaginacionTodoProductosServiciosPreciosSinRangos=false;		
		this.isPermisoCopiarProductosServiciosPreciosSinRangos=false;		
		this.isPermisoVerFormProductosServiciosPreciosSinRangos=false;		
		this.isPermisoDuplicarProductosServiciosPreciosSinRangos=false;
		this.isPermisoOrdenProductosServiciosPreciosSinRangos=false;
	}
	
	public void setPermisosUsuarioProductosServiciosPreciosSinRangos(Boolean isPermiso) {
		this.isPermisoTodoProductosServiciosPreciosSinRangos=isPermiso;
		this.isPermisoNuevoProductosServiciosPreciosSinRangos=isPermiso;
		this.isPermisoActualizarProductosServiciosPreciosSinRangos=isPermiso;
		this.isPermisoActualizarOriginalProductosServiciosPreciosSinRangos=isPermiso;
		this.isPermisoEliminarProductosServiciosPreciosSinRangos=isPermiso;
		this.isPermisoGuardarCambiosProductosServiciosPreciosSinRangos=isPermiso;
		this.isPermisoConsultaProductosServiciosPreciosSinRangos=isPermiso;
		this.isPermisoBusquedaProductosServiciosPreciosSinRangos=isPermiso;
		this.isPermisoReporteProductosServiciosPreciosSinRangos=isPermiso;
		this.isPermisoOrdenProductosServiciosPreciosSinRangos=isPermiso;		
		this.isPermisoPaginacionMedioProductosServiciosPreciosSinRangos=isPermiso;		
		this.isPermisoPaginacionAltoProductosServiciosPreciosSinRangos=isPermiso;		
		this.isPermisoPaginacionTodoProductosServiciosPreciosSinRangos=isPermiso;		
		this.isPermisoCopiarProductosServiciosPreciosSinRangos=isPermiso;		
		this.isPermisoVerFormProductosServiciosPreciosSinRangos=isPermiso;		
		this.isPermisoDuplicarProductosServiciosPreciosSinRangos=isPermiso;
		this.isPermisoOrdenProductosServiciosPreciosSinRangos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProductosServiciosPreciosSinRangos(Boolean isPermiso) {
		//this.isPermisoTodoProductosServiciosPreciosSinRangos=isPermiso;
		this.isPermisoNuevoProductosServiciosPreciosSinRangos=isPermiso;
		this.isPermisoActualizarProductosServiciosPreciosSinRangos=isPermiso;
		this.isPermisoActualizarOriginalProductosServiciosPreciosSinRangos=isPermiso;
		this.isPermisoEliminarProductosServiciosPreciosSinRangos=isPermiso;
		this.isPermisoGuardarCambiosProductosServiciosPreciosSinRangos=isPermiso;
		//this.isPermisoConsultaProductosServiciosPreciosSinRangos=isPermiso;
		//this.isPermisoBusquedaProductosServiciosPreciosSinRangos=isPermiso;
		//this.isPermisoReporteProductosServiciosPreciosSinRangos=isPermiso;
		//this.isPermisoOrdenProductosServiciosPreciosSinRangos=isPermiso;		
		//this.isPermisoPaginacionMedioProductosServiciosPreciosSinRangos=isPermiso;		
		//this.isPermisoPaginacionAltoProductosServiciosPreciosSinRangos=isPermiso;		
		//this.isPermisoPaginacionTodoProductosServiciosPreciosSinRangos=isPermiso;		
		//this.isPermisoCopiarProductosServiciosPreciosSinRangos=isPermiso;		
		//this.isPermisoDuplicarProductosServiciosPreciosSinRangos=isPermiso;
		//this.isPermisoOrdenProductosServiciosPreciosSinRangos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProductosServiciosPreciosSinRangosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProductosServiciosPreciosSinRangosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProductosServiciosPreciosSinRangos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProductosServiciosPreciosSinRangosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProductosServiciosPreciosSinRangosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProductosServiciosPreciosSinRangosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProductosServiciosPreciosSinRangosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProductosServiciosPreciosSinRangos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProductosServiciosPreciosSinRangosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProductosServiciosPreciosSinRangosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProductosServiciosPreciosSinRangos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProductosServiciosPreciosSinRangos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProductosServiciosPreciosSinRangos=this.isPermisoActualizarProductosServiciosPreciosSinRangos;
			this.isPermisoEliminarProductosServiciosPreciosSinRangos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProductosServiciosPreciosSinRangos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProductosServiciosPreciosSinRangos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProductosServiciosPreciosSinRangos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProductosServiciosPreciosSinRangos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProductosServiciosPreciosSinRangos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductosServiciosPreciosSinRangos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProductosServiciosPreciosSinRangos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProductosServiciosPreciosSinRangos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProductosServiciosPreciosSinRangos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProductosServiciosPreciosSinRangos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProductosServiciosPreciosSinRangos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProductosServiciosPreciosSinRangos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductosServiciosPreciosSinRangos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProductosServiciosPreciosSinRangos.setToolTipText(this.jTableDatosProductosServiciosPreciosSinRangos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProductosServiciosPreciosSinRangos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProductosServiciosPreciosSinRangos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProductosServiciosPreciosSinRangosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProductosServiciosPreciosSinRangosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProductosServiciosPreciosSinRangos() throws Exception {
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
	public void inicializarCombosForeignKeyProductosServiciosPreciosSinRangosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.bodegasForeignKey=new ArrayList();
				this.lineasForeignKey=new ArrayList();
				this.lineagruposForeignKey=new ArrayList();
				this.lineacategoriasForeignKey=new ArrayList();
				this.lineamarcasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProductosServiciosPreciosSinRangosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProductosServiciosPreciosSinRangosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyProductosServiciosPreciosSinRangos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
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
			if(this.productosserviciospreciossinrangosSessionBean==null) {
				this.productosserviciospreciossinrangosSessionBean=new ProductosServiciosPreciosSinRangosSessionBean();
			}

			if(!this.productosserviciospreciossinrangosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.productosserviciospreciossinrangosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.productosserviciospreciossinrangosSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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

			if(!this.productosserviciospreciossinrangosSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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

			if(!this.productosserviciospreciossinrangosSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
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

			if(!this.productosserviciospreciossinrangosSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
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

			if(!this.productosserviciospreciossinrangosSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
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
	
	public void initActionsCombosTodosForeignKeyProductosServiciosPreciosSinRangos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProductosServiciosPreciosSinRangos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProductosServiciosPreciosSinRangos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductosServiciosPreciosSinRangos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProductosServiciosPreciosSinRangos(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProductosServiciosPreciosSinRangos(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProductosServiciosPreciosSinRangos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProductosServiciosPreciosSinRangos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProductosServiciosPreciosSinRangos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProductosServiciosPreciosSinRangos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProductosServiciosPreciosSinRangos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProductosServiciosPreciosSinRangos()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameLineasForeignKey("Todos");
			this.cargarCombosFrameLineaGruposForeignKey("Todos");
			this.cargarCombosFrameLineaCategoriasForeignKey("Todos");
			this.cargarCombosFrameLineaMarcasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProductosServiciosPreciosSinRangos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaGruposForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaCategoriasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaMarcasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProductosServiciosPreciosSinRangos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_empresaProductosServiciosPreciosSinRangos!=null && this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_empresaProductosServiciosPreciosSinRangos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_empresaProductosServiciosPreciosSinRangos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_sucursalProductosServiciosPreciosSinRangos!=null && this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_sucursalProductosServiciosPreciosSinRangos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_sucursalProductosServiciosPreciosSinRangos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_bodegaProductosServiciosPreciosSinRangos!=null && this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_bodegaProductosServiciosPreciosSinRangos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_bodegaProductosServiciosPreciosSinRangos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_lineaProductosServiciosPreciosSinRangos!=null && this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_lineaProductosServiciosPreciosSinRangos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_lineaProductosServiciosPreciosSinRangos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_grupoProductosServiciosPreciosSinRangos!=null && this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_grupoProductosServiciosPreciosSinRangos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_grupoProductosServiciosPreciosSinRangos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_categoriaProductosServiciosPreciosSinRangos!=null && this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_categoriaProductosServiciosPreciosSinRangos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_categoriaProductosServiciosPreciosSinRangos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_marcaProductosServiciosPreciosSinRangos!=null && this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_marcaProductosServiciosPreciosSinRangos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_marcaProductosServiciosPreciosSinRangos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	














	
	

	public ProductosServiciosPreciosSinRangosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProductosServiciosPreciosSinRangosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProductosServiciosPreciosSinRangosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.productosserviciospreciossinrangosSessionBean=new ProductosServiciosPreciosSinRangosSessionBean(); 
		this.productosserviciospreciossinrangosConstantesFunciones=new ProductosServiciosPreciosSinRangosConstantesFunciones(); 
		this.productosserviciospreciossinrangosBean=new ProductosServiciosPreciosSinRangos();//(this.productosserviciospreciossinrangosConstantesFunciones); 		
		this.productosserviciospreciossinrangosReturnGeneral=new ProductosServiciosPreciosSinRangosParameterReturnGeneral(); 
		
		this.productosserviciospreciossinrangosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productosserviciospreciossinrangosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProductosServiciosPreciosSinRangosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProductosServiciosPreciosSinRangosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProductosServiciosPreciosSinRangosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProductosServiciosPreciosSinRangos(true);
			
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
			
			this.productosserviciospreciossinrangosConstantesFunciones=new ProductosServiciosPreciosSinRangosConstantesFunciones(); 
			this.productosserviciospreciossinrangosBean=new ProductosServiciosPreciosSinRangos();//this.productosserviciospreciossinrangosConstantesFunciones); 			
			this.productosserviciospreciossinrangosReturnGeneral=new ProductosServiciosPreciosSinRangosParameterReturnGeneral(); 
		
			ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Productos Servicios Precios Sin Rangos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.productosserviciospreciossinrangos=new ProductosServiciosPreciosSinRangos();
			this.productosserviciospreciossinrangoss = new ArrayList<ProductosServiciosPreciosSinRangos>();
			this.productosserviciospreciossinrangossAux = new ArrayList<ProductosServiciosPreciosSinRangos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic=new ProductosServiciosPreciosSinRangosLogic();
				this.productosserviciospreciossinrangosLogic.getNewConnexionToDeep("");
			}
			
			//this.productosserviciospreciossinrangosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.productosserviciospreciossinrangosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos);	
					}
					
					if(this.jInternalFrameImportacionProductosServiciosPreciosSinRangos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductosServiciosPreciosSinRangos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProductosServiciosPreciosSinRangos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProductosServiciosPreciosSinRangos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos);
				this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.setVisible(false);
				this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos);
					this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.setVisible(false);
					this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProductosServiciosPreciosSinRangos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProductosServiciosPreciosSinRangos);
					this.jInternalFrameImportacionProductosServiciosPreciosSinRangos.setVisible(false);
					this.jInternalFrameImportacionProductosServiciosPreciosSinRangos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProductosServiciosPreciosSinRangos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProductosServiciosPreciosSinRangos);
					this.jInternalFrameOrderByProductosServiciosPreciosSinRangos.setVisible(false);
					this.jInternalFrameOrderByProductosServiciosPreciosSinRangos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProductosServiciosPreciosSinRangosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProductosServiciosPreciosSinRangosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.productosserviciospreciossinrangosReturnGeneral=new ProductosServiciosPreciosSinRangosParameterReturnGeneral();
			
			this.productosserviciospreciossinrangosParameterGeneral=new ProductosServiciosPreciosSinRangosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.productosserviciospreciossinrangosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProductosServiciosPreciosSinRangosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductosServiciosPreciosSinRangosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado(),this.productosserviciospreciossinrangosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductosServiciosPreciosSinRangosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado(),this.productosserviciospreciossinrangosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProductosServiciosPreciosSinRangos=false;
			this.isVisibilidadCeldaDuplicarProductosServiciosPreciosSinRangos=true;
			this.isVisibilidadCeldaCopiarProductosServiciosPreciosSinRangos=true;
			this.isVisibilidadCeldaVerFormProductosServiciosPreciosSinRangos=true;
			this.isVisibilidadCeldaOrdenProductosServiciosPreciosSinRangos=true;
			this.isVisibilidadCeldaNuevoRelacionesProductosServiciosPreciosSinRangos=false;
			this.isVisibilidadCeldaModificarProductosServiciosPreciosSinRangos=false;
			this.isVisibilidadCeldaActualizarProductosServiciosPreciosSinRangos=false;
			this.isVisibilidadCeldaEliminarProductosServiciosPreciosSinRangos=false;
			this.isVisibilidadCeldaCancelarProductosServiciosPreciosSinRangos=false;
			this.isVisibilidadCeldaGuardarProductosServiciosPreciosSinRangos=false;
			this.isVisibilidadCeldaGuardarCambiosProductosServiciosPreciosSinRangos=false;
			
			
			this.isVisibilidadBusquedaProductosServiciosPreciosSinRangos=true;
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdLinea=true;
			this.isVisibilidadFK_IdLineaCategoria=true;
			this.isVisibilidadFK_IdLineaGrupo=true;
			this.isVisibilidadFK_IdLineaMarca=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProductosServiciosPreciosSinRangos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProductosServiciosPreciosSinRangos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProductosServiciosPreciosSinRangos(false);
			
			this.setPermisosUsuarioProductosServiciosPreciosSinRangos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado() 
				|| (this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado() && this.productosserviciospreciossinrangosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProductosServiciosPreciosSinRangosClasesRelacionadas();
			}
			
			if(this.productosserviciospreciossinrangosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProductosServiciosPreciosSinRangosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProductosServiciosPreciosSinRangos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProductosServiciosPreciosSinRangos();
			}
			
			if(!this.isPermisoBusquedaProductosServiciosPreciosSinRangos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProductosServiciosPreciosSinRangosConstantesFunciones.getTiposSeleccionarProductosServiciosPreciosSinRangos());
				
				this.tiposColumnasSelect=ProductosServiciosPreciosSinRangosConstantesFunciones.getTiposSeleccionarProductosServiciosPreciosSinRangos(true);
				
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
			//if(!this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProductosServiciosPreciosSinRangos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioProductosServiciosPreciosSinRangos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioProductosServiciosPreciosSinRangos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProductosServiciosPreciosSinRangos() ;
			
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
				productosserviciospreciossinrangosImplementable= (ProductosServiciosPreciosSinRangosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductosServiciosPreciosSinRangosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				productosserviciospreciossinrangosImplementableHome= (ProductosServiciosPreciosSinRangosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductosServiciosPreciosSinRangosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.productosserviciospreciossinrangoss= new ArrayList<ProductosServiciosPreciosSinRangos>();
			this.productosserviciospreciossinrangossEliminados= new ArrayList<ProductosServiciosPreciosSinRangos>();
						
			this.isEsNuevoProductosServiciosPreciosSinRangos=false;
			this.esParaAccionDesdeFormularioProductosServiciosPreciosSinRangos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.bodegasForeignKey=new ArrayList<Bodega>() ;
			this.lineasForeignKey=new ArrayList<Linea>() ;
			this.lineagruposForeignKey=new ArrayList<Linea>() ;
			this.lineacategoriasForeignKey=new ArrayList<Linea>() ;
			this.lineamarcasForeignKey=new ArrayList<Linea>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProductosServiciosPreciosSinRangos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProductosServiciosPreciosSinRangos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProductosServiciosPreciosSinRangosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProductosServiciosPreciosSinRangos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProductosServiciosPreciosSinRangos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProductosServiciosPreciosSinRangos();
			}
			
			ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProductosServiciosPreciosSinRangos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProductosServiciosPreciosSinRangos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProductosServiciosPreciosSinRangos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProductosServiciosPreciosSinRangos")) {
				iIndex=this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTabbedPaneRelacionesProductosServiciosPreciosSinRangos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTabbedPaneRelacionesProductosServiciosPreciosSinRangos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProductosServiciosPreciosSinRangos();	
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
	
	public void cargarCombosForeignKeyProductosServiciosPreciosSinRangos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProductosServiciosPreciosSinRangos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProductosServiciosPreciosSinRangos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProductosServiciosPreciosSinRangosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProductosServiciosPreciosSinRangos();
		
		this.cargarCombosFrameForeignKeyProductosServiciosPreciosSinRangos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProductosServiciosPreciosSinRangos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProductosServiciosPreciosSinRangos();
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
	
	public void jButtonNuevoProductosServiciosPreciosSinRangosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.productosserviciospreciossinrangosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
			
			
			if(jTableDatosProductosServiciosPreciosSinRangos.getRowCount()>=1) {
				jTableDatosProductosServiciosPreciosSinRangos.removeRowSelectionInterval(0, jTableDatosProductosServiciosPreciosSinRangos.getRowCount()-1);						
			}
			
			this.isEsNuevoProductosServiciosPreciosSinRangos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProductosServiciosPreciosSinRangos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProductosServiciosPreciosSinRangos(true);			
			//this.productosserviciospreciossinrangos=new ProductosServiciosPreciosSinRangos();
			//this.productosserviciospreciossinrangos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductosServiciosPreciosSinRangos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductosServiciosPreciosSinRangos() ;
			
			if(ProductosServiciosPreciosSinRangosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductosServiciosPreciosSinRangos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.productosserviciospreciossinrangos);	
			this.actualizarInformacion("INFO_PADRE",false,this.productosserviciospreciossinrangos);				
			
			ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
			
			if(this.productosserviciospreciossinrangosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProductosServiciosPreciosSinRangos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProductosServiciosPreciosSinRangosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProductosServiciosPreciosSinRangos> productosserviciospreciossinrangossSeleccionados=new ArrayList<ProductosServiciosPreciosSinRangos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRows().length;			
			}
			
			productosserviciospreciossinrangossSeleccionados=this.getProductosServiciosPreciosSinRangossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProductosServiciosPreciosSinRangos--;			
				//ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosAux= new ProductosServiciosPreciosSinRangos();			
				//productosserviciospreciossinrangosAux.setId(this.iIdNuevoProductosServiciosPreciosSinRangos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosOrigen=new ProductosServiciosPreciosSinRangos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosOrigen : productosserviciospreciossinrangossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							productosserviciospreciossinrangosOrigen =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productosserviciospreciossinrangosOrigen =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProductosServiciosPreciosSinRangos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.productosserviciospreciossinrangos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProductosServiciosPreciosSinRangos(productosserviciospreciossinrangosOrigen,this.productosserviciospreciossinrangos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().add(this.productosserviciospreciossinrangosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productosserviciospreciossinrangoss.add(this.productosserviciospreciossinrangosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProductosServiciosPreciosSinRangos(false);
				
				this.jTableDatosProductosServiciosPreciosSinRangos.setRowSelectionInterval(this.getIndiceNuevoProductosServiciosPreciosSinRangos(), this.getIndiceNuevoProductosServiciosPreciosSinRangos());
				
				int iLastRow =  this.jTableDatosProductosServiciosPreciosSinRangos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductosServiciosPreciosSinRangos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductosServiciosPreciosSinRangos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductosServiciosPreciosSinRangos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProductosServiciosPreciosSinRangosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProductosServiciosPreciosSinRangos> productosserviciospreciossinrangossSeleccionados=new ArrayList<ProductosServiciosPreciosSinRangos>();									
		
			ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosOrigen=new ProductosServiciosPreciosSinRangos();
			ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosDestino=new ProductosServiciosPreciosSinRangos();
				
			productosserviciospreciossinrangossSeleccionados=this.getProductosServiciosPreciosSinRangossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || productosserviciospreciossinrangossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productosserviciospreciossinrangosOrigen =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productosserviciospreciossinrangosOrigen =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productosserviciospreciossinrangosDestino =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productosserviciospreciossinrangosDestino =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				productosserviciospreciossinrangosOrigen =productosserviciospreciossinrangossSeleccionados.get(0);
				productosserviciospreciossinrangosDestino =productosserviciospreciossinrangossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProductosServiciosPreciosSinRangos(productosserviciospreciossinrangosOrigen,productosserviciospreciossinrangosDestino,true,false);
				
				productosserviciospreciossinrangosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productosserviciospreciossinrangosDestino,productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productosserviciospreciossinrangosDestino,productosserviciospreciossinrangoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProductosServiciosPreciosSinRangos(false);
				
				//this.jTableDatosProductosServiciosPreciosSinRangos.setRowSelectionInterval(this.getIndiceNuevoProductosServiciosPreciosSinRangos(), this.getIndiceNuevoProductosServiciosPreciosSinRangos());
				
				int iLastRow =  this.jTableDatosProductosServiciosPreciosSinRangos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductosServiciosPreciosSinRangos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductosServiciosPreciosSinRangos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductosServiciosPreciosSinRangos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProductosServiciosPreciosSinRangosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProductosServiciosPreciosSinRangosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProductosServiciosPreciosSinRangos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProductosServiciosPreciosSinRangos.setVisible(!isVisible);
			this.jPanelPaginacionProductosServiciosPreciosSinRangos.setVisible(!isVisible);
			this.jPanelAccionesProductosServiciosPreciosSinRangos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProductosServiciosPreciosSinRangosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProductosServiciosPreciosSinRangos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProductosServiciosPreciosSinRangosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProductosServiciosPreciosSinRangos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProductosServiciosPreciosSinRangosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProductosServiciosPreciosSinRangos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProductosServiciosPreciosSinRangosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProductosServiciosPreciosSinRangos();
			
			this.abrirFrameOrderByProductosServiciosPreciosSinRangos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProductosServiciosPreciosSinRangosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProductosServiciosPreciosSinRangos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProductosServiciosPreciosSinRangos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductosServiciosPreciosSinRangos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.isMaximum()) {
					this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.setSize(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.iWidthFormulario,this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.isMaximum()) {
						this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jContentPaneDetalleProductosServiciosPreciosSinRangos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTabbedPaneRelacionesProductosServiciosPreciosSinRangos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jContentPaneDetalleProductosServiciosPreciosSinRangos.getWidth(),ProductosServiciosPreciosSinRangosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTabbedPaneRelacionesProductosServiciosPreciosSinRangos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jContentPaneDetalleProductosServiciosPreciosSinRangos.getWidth(),ProductosServiciosPreciosSinRangosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTabbedPaneRelacionesProductosServiciosPreciosSinRangos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jContentPaneDetalleProductosServiciosPreciosSinRangos.getWidth(),ProductosServiciosPreciosSinRangosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.setVisible(true);
	        this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProductosServiciosPreciosSinRangos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProductosServiciosPreciosSinRangos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProductosServiciosPreciosSinRangos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductosServiciosPreciosSinRangos,false,this);
				} else {
					this.jInternalFrameOrderByProductosServiciosPreciosSinRangos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductosServiciosPreciosSinRangos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProductosServiciosPreciosSinRangos);
				this.jInternalFrameOrderByProductosServiciosPreciosSinRangos.setVisible(false);
				this.jInternalFrameOrderByProductosServiciosPreciosSinRangos.setSelected(false);
				
				this.jInternalFrameOrderByProductosServiciosPreciosSinRangos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductosServiciosPreciosSinRangos"));
				
				this.inicializarActualizarBindingTablaOrderByProductosServiciosPreciosSinRangos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProductosServiciosPreciosSinRangos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProductosServiciosPreciosSinRangos==null) {
				
				this.jInternalFrameImportacionProductosServiciosPreciosSinRangos=new ImportacionJInternalFrame(ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductosServiciosPreciosSinRangos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProductosServiciosPreciosSinRangos);
				this.jInternalFrameImportacionProductosServiciosPreciosSinRangos.setVisible(false);
				this.jInternalFrameImportacionProductosServiciosPreciosSinRangos.setSelected(false);


				this.jInternalFrameImportacionProductosServiciosPreciosSinRangos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductosServiciosPreciosSinRangos"));
				this.jInternalFrameImportacionProductosServiciosPreciosSinRangos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductosServiciosPreciosSinRangos"));
				this.jInternalFrameImportacionProductosServiciosPreciosSinRangos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductosServiciosPreciosSinRangos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProductosServiciosPreciosSinRangos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos==null) {
				this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos=new ReporteDinamicoJInternalFrame(ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos);
				this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.setVisible(false);
				this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductosServiciosPreciosSinRangos"));
				this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductosServiciosPreciosSinRangos"));
				this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductosServiciosPreciosSinRangos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductosServiciosPreciosSinRangos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProductosServiciosPreciosSinRangos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductosServiciosPreciosSinRangos);
			
	       	this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.setVisible(false);
	        this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.setSelected(false);
			
			//this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.dispose();
			//this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProductosServiciosPreciosSinRangos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.setVisible(true);
	        this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProductosServiciosPreciosSinRangos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProductosServiciosPreciosSinRangos.setVisible(true);
	        this.jInternalFrameImportacionProductosServiciosPreciosSinRangos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProductosServiciosPreciosSinRangos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProductosServiciosPreciosSinRangos.setVisible(true);
	        this.jInternalFrameOrderByProductosServiciosPreciosSinRangos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProductosServiciosPreciosSinRangos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProductosServiciosPreciosSinRangos.setVisible(false);
	        this.jInternalFrameOrderByProductosServiciosPreciosSinRangos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProductosServiciosPreciosSinRangos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.setVisible(false);
	        this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProductosServiciosPreciosSinRangos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProductosServiciosPreciosSinRangos.setVisible(false);
	        this.jInternalFrameImportacionProductosServiciosPreciosSinRangos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProductosServiciosPreciosSinRangosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProductosServiciosPreciosSinRangos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProductosServiciosPreciosSinRangos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProductosServiciosPreciosSinRangos(true);
			//this.isEsNuevoProductosServiciosPreciosSinRangos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProductosServiciosPreciosSinRangos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductosServiciosPreciosSinRangos(false) ;
			
			if(productosserviciospreciossinrangosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProductosServiciosPreciosSinRangosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductosServiciosPreciosSinRangos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductosServiciosPreciosSinRangos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProductosServiciosPreciosSinRangosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProductosServiciosPreciosSinRangos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProductosServiciosPreciosSinRangos(true);
			//this.isEsNuevoProductosServiciosPreciosSinRangos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.productosserviciospreciossinrangos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProductosServiciosPreciosSinRangos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProductosServiciosPreciosSinRangos(false) ;
			
			if(ProductosServiciosPreciosSinRangosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductosServiciosPreciosSinRangos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductosServiciosPreciosSinRangos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosProductosServiciosPreciosSinRangos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosPreciosSinRangos,ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();

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
		TableColumn tableColumnLinea=this.jTableDatosProductosServiciosPreciosSinRangos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosPreciosSinRangos,ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDLINEA));
		TableCellEditor tableCellEditorLinea =tableColumnLinea.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLinea;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();

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
		TableColumn tableColumnLineaGrupo=this.jTableDatosProductosServiciosPreciosSinRangos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosPreciosSinRangos,ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDLINEAGRUPO));
		TableCellEditor tableCellEditorLineaGrupo =tableColumnLineaGrupo.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaGrupo;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineagruposForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();

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
		TableColumn tableColumnLineaCategoria=this.jTableDatosProductosServiciosPreciosSinRangos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosPreciosSinRangos,ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDLINEACATEGORIA));
		TableCellEditor tableCellEditorLineaCategoria =tableColumnLineaCategoria.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaCategoria;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineacategoriasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();

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
		TableColumn tableColumnLineaMarca=this.jTableDatosProductosServiciosPreciosSinRangos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosPreciosSinRangos,ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDLINEAMARCA));
		TableCellEditor tableCellEditorLineaMarca =tableColumnLineaMarca.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaMarca;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineamarcasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineamarcasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProductosServiciosPreciosSinRangosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProductosServiciosPreciosSinRangos(false);
			
			//if(!this.isEsNuevoProductosServiciosPreciosSinRangos) {								
				int intSelectedRow = this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);
				
			}
			
			if(this.permiteMantenimiento(this.productosserviciospreciossinrangos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProductosServiciosPreciosSinRangos=true;
					this.inicializarActualizarBindingTablaProductosServiciosPreciosSinRangos(false);
					this.isEsNuevoProductosServiciosPreciosSinRangos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProductosServiciosPreciosSinRangos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProductosServiciosPreciosSinRangos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductosServiciosPreciosSinRangos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductosServiciosPreciosSinRangos(false);
				
				this.habilitarDeshabilitarControlesProductosServiciosPreciosSinRangos(false);
			
												
				
				if(ProductosServiciosPreciosSinRangosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProductosServiciosPreciosSinRangos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProductosServiciosPreciosSinRangosActionPerformed(evt,productosserviciospreciossinrangosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProductosServiciosPreciosSinRangos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,productosserviciospreciossinrangosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.productosserviciospreciossinrangos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProductosServiciosPreciosSinRangos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosServiciosPreciosSinRangos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProductosServiciosPreciosSinRangosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
				this.productosserviciospreciossinrangos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
				this.productosserviciospreciossinrangos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.productosserviciospreciossinrangos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProductosServiciosPreciosSinRangosModel) this.jTableDatosProductosServiciosPreciosSinRangos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProductosServiciosPreciosSinRangos=true;
				this.inicializarActualizarBindingTablaProductosServiciosPreciosSinRangos(false);
				this.isEsNuevoProductosServiciosPreciosSinRangos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductosServiciosPreciosSinRangos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductosServiciosPreciosSinRangos(false);
				
				this.habilitarDeshabilitarControlesProductosServiciosPreciosSinRangos(false);
				
				
				
				if(ProductosServiciosPreciosSinRangosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProductosServiciosPreciosSinRangos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProductosServiciosPreciosSinRangosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProductosServiciosPreciosSinRangos.getRowCount()>=1) {
				jTableDatosProductosServiciosPreciosSinRangos.removeRowSelectionInterval(0, jTableDatosProductosServiciosPreciosSinRangos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProductosServiciosPreciosSinRangos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProductosServiciosPreciosSinRangos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductosServiciosPreciosSinRangos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductosServiciosPreciosSinRangos(false) ;
			
			this.isEsNuevoProductosServiciosPreciosSinRangos=false;
			
			if(ProductosServiciosPreciosSinRangosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProductosServiciosPreciosSinRangos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProductosServiciosPreciosSinRangosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false);
				
				//SI ES MANUAL
				if(ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProductosServiciosPreciosSinRangos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProductosServiciosPreciosSinRangosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProductosServiciosPreciosSinRangos--;			
			//ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosAux= new ProductosServiciosPreciosSinRangos();			
			//productosserviciospreciossinrangosAux.setId(this.iIdNuevoProductosServiciosPreciosSinRangos);
			
			if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProductosServiciosPreciosSinRangos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);
			
			this.productosserviciospreciossinrangos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().add(this.productosserviciospreciossinrangosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.productosserviciospreciossinrangoss.add(this.productosserviciospreciossinrangosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProductosServiciosPreciosSinRangos(false);
			
			this.jTableDatosProductosServiciosPreciosSinRangos.setRowSelectionInterval(this.getIndiceNuevoProductosServiciosPreciosSinRangos(), this.getIndiceNuevoProductosServiciosPreciosSinRangos());
			
			int iLastRow =  this.jTableDatosProductosServiciosPreciosSinRangos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProductosServiciosPreciosSinRangos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProductosServiciosPreciosSinRangos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProductosServiciosPreciosSinRangos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProductosServiciosPreciosSinRangosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false);
			
			//SI ES MANUAL
			if(ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductosServiciosPreciosSinRangos();
			}
			
			//this.abrirFrameTreeProductosServiciosPreciosSinRangos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProductosServiciosPreciosSinRangosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProductosServiciosPreciosSinRangosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProductosServiciosPreciosSinRangos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProductosServiciosPreciosSinRangos.setFileImportacion(this.jInternalFrameImportacionProductosServiciosPreciosSinRangos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProductosServiciosPreciosSinRangos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProductosServiciosPreciosSinRangos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProductosServiciosPreciosSinRangos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProductosServiciosPreciosSinRangos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProductosServiciosPreciosSinRangosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProductosServiciosPreciosSinRangos> productosserviciospreciossinrangossSeleccionados=new ArrayList<ProductosServiciosPreciosSinRangos>();		

		productosserviciospreciossinrangossSeleccionados=this.getProductosServiciosPreciosSinRangossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProductosServiciosPreciosSinRangosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProductosServiciosPreciosSinRangosBaseDesign.jrxml";
			
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
			
			this.generarReporteProductosServiciosPreciosSinRangoss("Todos",productosserviciospreciossinrangossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Servicios Precios Sin Rangos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreSucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreSucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreSucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreSucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBREBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreBodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreBodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreBodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreBodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBREUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreUnidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreUnidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreUnidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreUnidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_CODIGOTIPOPRECIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoTipoPrecio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoTipoPrecio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoTipoPrecio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoTipoPrecio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_PRECIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ecio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ecio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ecio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ecio_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					sNombreCampoCategoria="nombre_sucursal";
					break;

				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBREBODEGA:
					sNombreCampoCategoria="nombre_bodega";
					break;

				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoria="nombre_unidad";
					break;

				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_CODIGOTIPOPRECIO:
					sNombreCampoCategoria="codigo_tipo_precio";
					break;

				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoria="precio";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					sNombreCampoCategoriaValor="nombre_sucursal";
					break;

				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBREBODEGA:
					sNombreCampoCategoriaValor="nombre_bodega";
					break;

				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoriaValor="nombre_unidad";
					break;

				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_CODIGOTIPOPRECIO:
					sNombreCampoCategoriaValor="codigo_tipo_precio";
					break;

				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoriaValor="precio";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_sucursal");
					break;

				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBREBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_bodega");
					break;

				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBREUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Unad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_unidad");
					break;

				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_CODIGOTIPOPRECIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Tipo Precio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_tipo_precio");
					break;

				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_PRECIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Precio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"precio");
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
	
	public void jButtonGenerarExcelReporteDinamicoProductosServiciosPreciosSinRangosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProductosServiciosPreciosSinRangos> productosserviciospreciossinrangossSeleccionados=new ArrayList<ProductosServiciosPreciosSinRangos>();		
		
		productosserviciospreciossinrangossSeleccionados=this.getProductosServiciosPreciosSinRangossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosserviciospreciossinrangos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProductosServiciosPreciosSinRangoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos:productosserviciospreciossinrangossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciospreciossinrangos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos:productosserviciospreciossinrangossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciospreciossinrangos.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos:productosserviciospreciossinrangossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciospreciossinrangos.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDLINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDLINEA);
					iRow++;

					for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos:productosserviciospreciossinrangossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciospreciossinrangos.getlinea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDLINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDLINEAGRUPO);
					iRow++;

					for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos:productosserviciospreciossinrangossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciospreciossinrangos.getlineagrupo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDLINEACATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDLINEACATEGORIA);
					iRow++;

					for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos:productosserviciospreciossinrangossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciospreciossinrangos.getlineacategoria_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDLINEAMARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDLINEAMARCA);
					iRow++;

					for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos:productosserviciospreciossinrangossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciospreciossinrangos.getlineamarca_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBRESUCURSAL);
					iRow++;

					for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos:productosserviciospreciossinrangossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciospreciossinrangos.getnombre_sucursal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos:productosserviciospreciossinrangossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciospreciossinrangos.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos:productosserviciospreciossinrangossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciospreciossinrangos.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBREBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBREBODEGA);
					iRow++;

					for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos:productosserviciospreciossinrangossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciospreciossinrangos.getnombre_bodega());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBREUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBREUNIDAD);
					iRow++;

					for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos:productosserviciospreciossinrangossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciospreciossinrangos.getnombre_unidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_CODIGOTIPOPRECIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_CODIGOTIPOPRECIO);
					iRow++;

					for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos:productosserviciospreciossinrangossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciospreciossinrangos.getcodigo_tipo_precio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_PRECIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_PRECIO);
					iRow++;

					for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos:productosserviciospreciossinrangossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciospreciossinrangos.getprecio());
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
			//	this.getFilaCabeceraExportarExcelProductosServiciosPreciosSinRangos(row);				
			//	iRow++;
			//}				
			
			//for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosAux:productosserviciospreciossinrangossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProductosServiciosPreciosSinRangos(productosserviciospreciossinrangosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Servicios Precios Sin Rangos",JOptionPane.INFORMATION_MESSAGE);
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
				this.productosserviciospreciossinrangosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false);
			
			//SI ES MANUAL
			if(ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductosServiciosPreciosSinRangos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProductosServiciosPreciosSinRangosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false);
			
			//SI ES MANUAL
			if(ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductosServiciosPreciosSinRangos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProductosServiciosPreciosSinRangosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false);
			
			//SI ES MANUAL
			if(ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductosServiciosPreciosSinRangos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProductosServiciosPreciosSinRangos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProductosServiciosPreciosSinRangos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProductosServiciosPreciosSinRangos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProductosServiciosPreciosSinRangos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProductosServiciosPreciosSinRangos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProductosServiciosPreciosSinRangos.setMinimumSize(dimensionMinimum);
		this.jTableDatosProductosServiciosPreciosSinRangos.setMaximumSize(dimensionMaximum);
		this.jTableDatosProductosServiciosPreciosSinRangos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProductosServiciosPreciosSinRangos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProductosServiciosPreciosSinRangos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProductosServiciosPreciosSinRangos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProductosServiciosPreciosSinRangos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProductosServiciosPreciosSinRangos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductosServiciosPreciosSinRangos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProductosServiciosPreciosSinRangos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProductosServiciosPreciosSinRangos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProductosServiciosPreciosSinRangos();
		
		this.inicializarActualizarBindingBotonesManualProductosServiciosPreciosSinRangos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProductosServiciosPreciosSinRangos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductosServiciosPreciosSinRangos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProductosServiciosPreciosSinRangos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProductosServiciosPreciosSinRangos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProductosServiciosPreciosSinRangos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProductosServiciosPreciosSinRangos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProductosServiciosPreciosSinRangos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jCheckBoxPostAccionNuevoProductosServiciosPreciosSinRangos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jCheckBoxPostAccionSinCerrarProductosServiciosPreciosSinRangos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jCheckBoxPostAccionSinMensajeProductosServiciosPreciosSinRangos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProductosServiciosPreciosSinRangos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProductosServiciosPreciosSinRangos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProductosServiciosPreciosSinRangos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
				this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jCheckBoxPostAccionNuevoProductosServiciosPreciosSinRangos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jCheckBoxPostAccionSinCerrarProductosServiciosPreciosSinRangos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jCheckBoxPostAccionSinMensajeProductosServiciosPreciosSinRangos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProductosServiciosPreciosSinRangos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProductosServiciosPreciosSinRangos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxTiposAccionesFormularioProductosServiciosPreciosSinRangos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProductosServiciosPreciosSinRangos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProductosServiciosPreciosSinRangos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProductosServiciosPreciosSinRangos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProductosServiciosPreciosSinRangos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProductosServiciosPreciosSinRangos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProductosServiciosPreciosSinRangos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProductosServiciosPreciosSinRangos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProductosServiciosPreciosSinRangos(Boolean esInicializar) throws Exception {
		try	{	
			if(ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProductosServiciosPreciosSinRangos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProductosServiciosPreciosSinRangos() throws Exception {
		try	{
			if(ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProductosServiciosPreciosSinRangos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductosServiciosPreciosSinRangos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxTiposAccionesFormularioProductosServiciosPreciosSinRangos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxTiposAccionesFormularioProductosServiciosPreciosSinRangos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProductosServiciosPreciosSinRangos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProductosServiciosPreciosSinRangos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProductosServiciosPreciosSinRangos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProductosServiciosPreciosSinRangos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProductosServiciosPreciosSinRangos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProductosServiciosPreciosSinRangos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProductosServiciosPreciosSinRangos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProductosServiciosPreciosSinRangos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProductosServiciosPreciosSinRangos.addItem(reporte);
			}
			
			
			if(!this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProductosServiciosPreciosSinRangos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProductosServiciosPreciosSinRangos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProductosServiciosPreciosSinRangos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProductosServiciosPreciosSinRangos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProductosServiciosPreciosSinRangos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProductosServiciosPreciosSinRangos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxTiposAccionesFormularioProductosServiciosPreciosSinRangos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxTiposAccionesFormularioProductosServiciosPreciosSinRangos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProductosServiciosPreciosSinRangos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProductosServiciosPreciosSinRangos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProductosServiciosPreciosSinRangos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductosServiciosPreciosSinRangos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductosServiciosPreciosSinRangos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos!=null) {
				this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos!=null) {
				this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos!=null) {
				
				if(this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ProductosServiciosPreciosSinRangosConstantesFunciones.getTiposSeleccionarProductosServiciosPreciosSinRangos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ProductosServiciosPreciosSinRangosConstantesFunciones.getTiposSeleccionarProductosServiciosPreciosSinRangos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ProductosServiciosPreciosSinRangosConstantesFunciones.getTiposSeleccionarProductosServiciosPreciosSinRangos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProductosServiciosPreciosSinRangos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.getSelectedItem()!=null){this.id_bodegaBusquedaProductosServiciosPreciosSinRangos=((Bodega)this.jComboBoxid_bodegaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.getSelectedItem()).getId();}
		if(this.jComboBoxid_lineaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.getSelectedItem()!=null){this.id_lineaBusquedaProductosServiciosPreciosSinRangos=((Linea)this.jComboBoxid_lineaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_grupoBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.getSelectedItem()!=null){this.id_linea_grupoBusquedaProductosServiciosPreciosSinRangos=((Linea)this.jComboBoxid_linea_grupoBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_categoriaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.getSelectedItem()!=null){this.id_linea_categoriaBusquedaProductosServiciosPreciosSinRangos=((Linea)this.jComboBoxid_linea_categoriaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_marcaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.getSelectedItem()!=null){this.id_linea_marcaBusquedaProductosServiciosPreciosSinRangos=((Linea)this.jComboBoxid_linea_marcaBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProductosServiciosPreciosSinRangos(Boolean esInicializar) throws Exception {				
		if(ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProductosServiciosPreciosSinRangos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProductosServiciosPreciosSinRangos() throws Exception {
		this.inicializarActualizarBindingTablaProductosServiciosPreciosSinRangos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProductosServiciosPreciosSinRangos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProductosServiciosPreciosSinRangos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProductosServiciosPreciosSinRangos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductosServiciosPreciosSinRangos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProductosServiciosPreciosSinRangosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProductosServiciosPreciosSinRangos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductosServiciosPreciosSinRangos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProductosServiciosPreciosSinRangosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProductosServiciosPreciosSinRangosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosPreciosSinRangosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProductosServiciosPreciosSinRangosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProductosServiciosPreciosSinRangos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductosServiciosPreciosSinRangos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProductosServiciosPreciosSinRangosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProductosServiciosPreciosSinRangos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProductosServiciosPreciosSinRangos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=productosserviciospreciossinrangoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProductosServiciosPreciosSinRangos.setModel(new ProductosServiciosPreciosSinRangosModel(this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProductosServiciosPreciosSinRangos.setModel(new ProductosServiciosPreciosSinRangosModel(this.productosserviciospreciossinrangoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProductosServiciosPreciosSinRangos!=null && this.jInternalFrameOrderByProductosServiciosPreciosSinRangos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProductosServiciosPreciosSinRangos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProductosServiciosPreciosSinRangos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosPreciosSinRangos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProductosServiciosPreciosSinRangosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO,productosserviciospreciossinrangosConstantesFunciones.resaltarSeleccionarProductosServiciosPreciosSinRangos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProductosServiciosPreciosSinRangosConstantesFunciones.SCLASSWEBTITULO,productosserviciospreciossinrangosConstantesFunciones.resaltarSeleccionarProductosServiciosPreciosSinRangos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProductosServiciosPreciosSinRangos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosPreciosSinRangos,ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_ID));

		if(this.productosserviciospreciossinrangosConstantesFunciones.mostraridProductosServiciosPreciosSinRangos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productosserviciospreciossinrangosConstantesFunciones.resaltaridProductosServiciosPreciosSinRangos,this.productosserviciospreciossinrangosConstantesFunciones.activaridProductosServiciosPreciosSinRangos,iSizeTabla,this,true,"idProductosServiciosPreciosSinRangos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosserviciospreciossinrangosConstantesFunciones.resaltaridProductosServiciosPreciosSinRangos,this.productosserviciospreciossinrangosConstantesFunciones.activaridProductosServiciosPreciosSinRangos,this,true,"idProductosServiciosPreciosSinRangos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosServiciosPreciosSinRangos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosPreciosSinRangos,ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBRESUCURSAL));

		if(this.productosserviciospreciossinrangosConstantesFunciones.mostrarnombre_sucursalProductosServiciosPreciosSinRangos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBRESUCURSAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosserviciospreciossinrangosConstantesFunciones.resaltarnombre_sucursalProductosServiciosPreciosSinRangos,this.productosserviciospreciossinrangosConstantesFunciones.activarnombre_sucursalProductosServiciosPreciosSinRangos,iSizeTabla,this,true,"nombre_sucursalProductosServiciosPreciosSinRangos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosserviciospreciossinrangosConstantesFunciones.resaltarnombre_sucursalProductosServiciosPreciosSinRangos,this.productosserviciospreciossinrangosConstantesFunciones.activarnombre_sucursalProductosServiciosPreciosSinRangos,this,true,"nombre_sucursalProductosServiciosPreciosSinRangos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosServiciosPreciosSinRangosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosServiciosPreciosSinRangos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosPreciosSinRangos,ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_CODIGO));

		if(this.productosserviciospreciossinrangosConstantesFunciones.mostrarcodigoProductosServiciosPreciosSinRangos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosserviciospreciossinrangosConstantesFunciones.resaltarcodigoProductosServiciosPreciosSinRangos,this.productosserviciospreciossinrangosConstantesFunciones.activarcodigoProductosServiciosPreciosSinRangos,iSizeTabla,this,true,"codigoProductosServiciosPreciosSinRangos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosserviciospreciossinrangosConstantesFunciones.resaltarcodigoProductosServiciosPreciosSinRangos,this.productosserviciospreciossinrangosConstantesFunciones.activarcodigoProductosServiciosPreciosSinRangos,this,true,"codigoProductosServiciosPreciosSinRangos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosServiciosPreciosSinRangosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosServiciosPreciosSinRangos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosPreciosSinRangos,ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBRE));

		if(this.productosserviciospreciossinrangosConstantesFunciones.mostrarnombreProductosServiciosPreciosSinRangos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosserviciospreciossinrangosConstantesFunciones.resaltarnombreProductosServiciosPreciosSinRangos,this.productosserviciospreciossinrangosConstantesFunciones.activarnombreProductosServiciosPreciosSinRangos,iSizeTabla,this,true,"nombreProductosServiciosPreciosSinRangos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosserviciospreciossinrangosConstantesFunciones.resaltarnombreProductosServiciosPreciosSinRangos,this.productosserviciospreciossinrangosConstantesFunciones.activarnombreProductosServiciosPreciosSinRangos,this,true,"nombreProductosServiciosPreciosSinRangos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosServiciosPreciosSinRangosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosServiciosPreciosSinRangos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosPreciosSinRangos,ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBREBODEGA));

		if(this.productosserviciospreciossinrangosConstantesFunciones.mostrarnombre_bodegaProductosServiciosPreciosSinRangos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBREBODEGA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosserviciospreciossinrangosConstantesFunciones.resaltarnombre_bodegaProductosServiciosPreciosSinRangos,this.productosserviciospreciossinrangosConstantesFunciones.activarnombre_bodegaProductosServiciosPreciosSinRangos,iSizeTabla,this,true,"nombre_bodegaProductosServiciosPreciosSinRangos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosserviciospreciossinrangosConstantesFunciones.resaltarnombre_bodegaProductosServiciosPreciosSinRangos,this.productosserviciospreciossinrangosConstantesFunciones.activarnombre_bodegaProductosServiciosPreciosSinRangos,this,true,"nombre_bodegaProductosServiciosPreciosSinRangos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosServiciosPreciosSinRangosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosServiciosPreciosSinRangos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosPreciosSinRangos,ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBREUNIDAD));

		if(this.productosserviciospreciossinrangosConstantesFunciones.mostrarnombre_unidadProductosServiciosPreciosSinRangos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBREUNIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosserviciospreciossinrangosConstantesFunciones.resaltarnombre_unidadProductosServiciosPreciosSinRangos,this.productosserviciospreciossinrangosConstantesFunciones.activarnombre_unidadProductosServiciosPreciosSinRangos,iSizeTabla,this,true,"nombre_unidadProductosServiciosPreciosSinRangos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosserviciospreciossinrangosConstantesFunciones.resaltarnombre_unidadProductosServiciosPreciosSinRangos,this.productosserviciospreciossinrangosConstantesFunciones.activarnombre_unidadProductosServiciosPreciosSinRangos,this,true,"nombre_unidadProductosServiciosPreciosSinRangos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosServiciosPreciosSinRangosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosServiciosPreciosSinRangos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosPreciosSinRangos,ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_CODIGOTIPOPRECIO));

		if(this.productosserviciospreciossinrangosConstantesFunciones.mostrarcodigo_tipo_precioProductosServiciosPreciosSinRangos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_CODIGOTIPOPRECIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosserviciospreciossinrangosConstantesFunciones.resaltarcodigo_tipo_precioProductosServiciosPreciosSinRangos,this.productosserviciospreciossinrangosConstantesFunciones.activarcodigo_tipo_precioProductosServiciosPreciosSinRangos,iSizeTabla,this,true,"codigo_tipo_precioProductosServiciosPreciosSinRangos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosserviciospreciossinrangosConstantesFunciones.resaltarcodigo_tipo_precioProductosServiciosPreciosSinRangos,this.productosserviciospreciossinrangosConstantesFunciones.activarcodigo_tipo_precioProductosServiciosPreciosSinRangos,this,true,"codigo_tipo_precioProductosServiciosPreciosSinRangos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosServiciosPreciosSinRangosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosServiciosPreciosSinRangos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosPreciosSinRangos,ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_PRECIO));

		if(this.productosserviciospreciossinrangosConstantesFunciones.mostrarprecioProductosServiciosPreciosSinRangos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_PRECIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productosserviciospreciossinrangosConstantesFunciones.resaltarprecioProductosServiciosPreciosSinRangos,this.productosserviciospreciossinrangosConstantesFunciones.activarprecioProductosServiciosPreciosSinRangos,iSizeTabla,this,true,"precioProductosServiciosPreciosSinRangos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosserviciospreciossinrangosConstantesFunciones.resaltarprecioProductosServiciosPreciosSinRangos,this.productosserviciospreciossinrangosConstantesFunciones.activarprecioProductosServiciosPreciosSinRangos,this,true,"precioProductosServiciosPreciosSinRangos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductosServiciosPreciosSinRangosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductosServiciosPreciosSinRangos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductosServiciosPreciosSinRangos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProductosServiciosPreciosSinRangos && this.isPermisoGuardarCambiosProductosServiciosPreciosSinRangos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProductosServiciosPreciosSinRangos.addColumn(tableColumn);
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
			
			this.jTableDatosProductosServiciosPreciosSinRangos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductosServiciosPreciosSinRangos && this.isPermisoGuardarCambiosProductosServiciosPreciosSinRangos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductosServiciosPreciosSinRangos && this.isPermisoGuardarCambiosProductosServiciosPreciosSinRangos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProductosServiciosPreciosSinRangos.moveColumn(this.jTableDatosProductosServiciosPreciosSinRangos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProductosServiciosPreciosSinRangos.moveColumn(this.jTableDatosProductosServiciosPreciosSinRangos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProductosServiciosPreciosSinRangos.moveColumn(this.jTableDatosProductosServiciosPreciosSinRangos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProductosServiciosPreciosSinRangos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProductosServiciosPreciosSinRangos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProductosServiciosPreciosSinRangos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProductosServiciosPreciosSinRangos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProductosServiciosPreciosSinRangos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProductosServiciosPreciosSinRangos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProductosServiciosPreciosSinRangos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProductosServiciosPreciosSinRangos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=productosserviciospreciossinrangoss.size()-1;
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
		//this.jTableDatosProductosServiciosPreciosSinRangos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProductosServiciosPreciosSinRangos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProductosServiciosPreciosSinRangos();
			
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
				
				//this.isEsNuevoProductosServiciosPreciosSinRangos=false;
					
				ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
			
				if(this.productosserviciospreciossinrangosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductosServiciosPreciosSinRangos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.productosserviciospreciossinrangos.getsType().equals("DUPLICADO")
				   || this.productosserviciospreciossinrangos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProductosServiciosPreciosSinRangos=true;
				
				} else {
					this.isEsNuevoProductosServiciosPreciosSinRangos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado()) {
					if(this.productosserviciospreciossinrangos.getId()>=0 && !this.productosserviciospreciossinrangos.getIsNew()) {						
						this.isEsNuevoProductosServiciosPreciosSinRangos=false;
						
					} else {
						this.isEsNuevoProductosServiciosPreciosSinRangos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProductosServiciosPreciosSinRangos(esRelaciones);						
				
				this.seleccionarProductosServiciosPreciosSinRangos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.productosserviciospreciossinrangos.getId()<0) {
					this.isEsNuevoProductosServiciosPreciosSinRangos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProductosServiciosPreciosSinRangos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProductosServiciosPreciosSinRangos(evt,rowIndex);
				}	
				
				if(this.productosserviciospreciossinrangosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProductosServiciosPreciosSinRangos: " + this.dDif); 
					}
				}								
				
				ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProductosServiciosPreciosSinRangos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.productosserviciospreciossinrangos)) {
					if(this.productosserviciospreciossinrangos.getId()>0) {
						this.productosserviciospreciossinrangos.setIsDeleted(true);
						
						this.productosserviciospreciossinrangossEliminados.add(this.productosserviciospreciossinrangos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().remove(this.productosserviciospreciossinrangos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productosserviciospreciossinrangoss.remove(this.productosserviciospreciossinrangos);				
					}
					
					
					((ProductosServiciosPreciosSinRangosModel) this.jTableDatosProductosServiciosPreciosSinRangos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProductosServiciosPreciosSinRangos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProductosServiciosPreciosSinRangos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProductosServiciosPreciosSinRangos) {
			
			if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductosServiciosPreciosSinRangos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProductosServiciosPreciosSinRangos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProductosServiciosPreciosSinRangos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductosServiciosPreciosSinRangos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductosServiciosPreciosSinRangos(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProductosServiciosPreciosSinRangos(productosserviciospreciossinrangos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductosServiciosPreciosSinRangos(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProductosServiciosPreciosSinRangos(productosserviciospreciossinrangos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProductosServiciosPreciosSinRangos(productosserviciospreciossinrangos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProductosServiciosPreciosSinRangos(productosserviciospreciossinrangos);
	}
	
	public void setVariablesObjetoActualToFormularioProductosServiciosPreciosSinRangos(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jLabelidProductosServiciosPreciosSinRangos.setText(productosserviciospreciossinrangos.getId().toString());
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextAreanombre_sucursalProductosServiciosPreciosSinRangos.setText(productosserviciospreciossinrangos.getnombre_sucursal());
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextFieldcodigoProductosServiciosPreciosSinRangos.setText(productosserviciospreciossinrangos.getcodigo());
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextAreanombreProductosServiciosPreciosSinRangos.setText(productosserviciospreciossinrangos.getnombre());
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextAreanombre_bodegaProductosServiciosPreciosSinRangos.setText(productosserviciospreciossinrangos.getnombre_bodega());
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextFieldnombre_unidadProductosServiciosPreciosSinRangos.setText(productosserviciospreciossinrangos.getnombre_unidad());
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextAreacodigo_tipo_precioProductosServiciosPreciosSinRangos.setText(productosserviciospreciossinrangos.getcodigo_tipo_precio());
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextFieldprecioProductosServiciosPreciosSinRangos.setText(productosserviciospreciossinrangos.getprecio().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,productosserviciospreciossinrangosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				productosserviciospreciossinrangosLocal=this.productosserviciospreciossinrangos;
			} else {
				productosserviciospreciossinrangosLocal=this.productosserviciospreciossinrangosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(productosserviciospreciossinrangosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProductosServiciosPreciosSinRangos(productosserviciospreciossinrangosLocal,true);
					
					if(productosserviciospreciossinrangosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(productosserviciospreciossinrangosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(productosserviciospreciossinrangosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProductosServiciosPreciosSinRangos(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(productosserviciospreciossinrangos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(productosserviciospreciossinrangos);
	}
	
	public void setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(productosserviciospreciossinrangos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jLabelidProductosServiciosPreciosSinRangos.getText()==null || this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jLabelidProductosServiciosPreciosSinRangos.getText()=="" || this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jLabelidProductosServiciosPreciosSinRangos.getText()=="Id") {
				this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jLabelidProductosServiciosPreciosSinRangos.setText("0");
			}

			if(conColumnasBase) {productosserviciospreciossinrangos.setId(Long.parseLong(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jLabelidProductosServiciosPreciosSinRangos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jLabelIdProductosServiciosPreciosSinRangos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosserviciospreciossinrangos.setnombre_sucursal(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextAreanombre_sucursalProductosServiciosPreciosSinRangos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBRESUCURSAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jLabelnombre_sucursalProductosServiciosPreciosSinRangos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosserviciospreciossinrangos.setcodigo(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextFieldcodigoProductosServiciosPreciosSinRangos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jLabelcodigoProductosServiciosPreciosSinRangos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosserviciospreciossinrangos.setnombre(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextAreanombreProductosServiciosPreciosSinRangos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jLabelnombreProductosServiciosPreciosSinRangos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosserviciospreciossinrangos.setnombre_bodega(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextAreanombre_bodegaProductosServiciosPreciosSinRangos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBREBODEGA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jLabelnombre_bodegaProductosServiciosPreciosSinRangos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosserviciospreciossinrangos.setnombre_unidad(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextFieldnombre_unidadProductosServiciosPreciosSinRangos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBREUNIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jLabelnombre_unidadProductosServiciosPreciosSinRangos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosserviciospreciossinrangos.setcodigo_tipo_precio(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextAreacodigo_tipo_precioProductosServiciosPreciosSinRangos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_CODIGOTIPOPRECIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jLabelcodigo_tipo_precioProductosServiciosPreciosSinRangos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosserviciospreciossinrangos.setprecio(Double.parseDouble(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextFieldprecioProductosServiciosPreciosSinRangos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_PRECIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jLabelprecioProductosServiciosPreciosSinRangos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductosServiciosPreciosSinRangos(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosBean,ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProductosServiciosPreciosSinRangos(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosOrigen,ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productosserviciospreciossinrangosOrigen.getId()!=null && !productosserviciospreciossinrangosOrigen.getId().equals(0L))) {productosserviciospreciossinrangos.setId(productosserviciospreciossinrangosOrigen.getId());}}
			if(conDefault || (!conDefault && productosserviciospreciossinrangosOrigen.getnombre_sucursal()!=null && !productosserviciospreciossinrangosOrigen.getnombre_sucursal().equals(""))) {productosserviciospreciossinrangos.setnombre_sucursal(productosserviciospreciossinrangosOrigen.getnombre_sucursal());}
			if(conDefault || (!conDefault && productosserviciospreciossinrangosOrigen.getcodigo()!=null && !productosserviciospreciossinrangosOrigen.getcodigo().equals(""))) {productosserviciospreciossinrangos.setcodigo(productosserviciospreciossinrangosOrigen.getcodigo());}
			if(conDefault || (!conDefault && productosserviciospreciossinrangosOrigen.getnombre()!=null && !productosserviciospreciossinrangosOrigen.getnombre().equals(""))) {productosserviciospreciossinrangos.setnombre(productosserviciospreciossinrangosOrigen.getnombre());}
			if(conDefault || (!conDefault && productosserviciospreciossinrangosOrigen.getnombre_bodega()!=null && !productosserviciospreciossinrangosOrigen.getnombre_bodega().equals(""))) {productosserviciospreciossinrangos.setnombre_bodega(productosserviciospreciossinrangosOrigen.getnombre_bodega());}
			if(conDefault || (!conDefault && productosserviciospreciossinrangosOrigen.getnombre_unidad()!=null && !productosserviciospreciossinrangosOrigen.getnombre_unidad().equals(""))) {productosserviciospreciossinrangos.setnombre_unidad(productosserviciospreciossinrangosOrigen.getnombre_unidad());}
			if(conDefault || (!conDefault && productosserviciospreciossinrangosOrigen.getcodigo_tipo_precio()!=null && !productosserviciospreciossinrangosOrigen.getcodigo_tipo_precio().equals(""))) {productosserviciospreciossinrangos.setcodigo_tipo_precio(productosserviciospreciossinrangosOrigen.getcodigo_tipo_precio());}
			if(conDefault || (!conDefault && productosserviciospreciossinrangosOrigen.getprecio()!=null && !productosserviciospreciossinrangosOrigen.getprecio().equals(0.0))) {productosserviciospreciossinrangos.setprecio(productosserviciospreciossinrangosOrigen.getprecio());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductosServiciosPreciosSinRangos(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jLabelidProductosServiciosPreciosSinRangos.setText(productosserviciospreciossinrangos.getId().toString());
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextAreanombre_sucursalProductosServiciosPreciosSinRangos.setText(productosserviciospreciossinrangos.getnombre_sucursal());
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextFieldcodigoProductosServiciosPreciosSinRangos.setText(productosserviciospreciossinrangos.getcodigo());
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextAreanombreProductosServiciosPreciosSinRangos.setText(productosserviciospreciossinrangos.getnombre());
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextAreanombre_bodegaProductosServiciosPreciosSinRangos.setText(productosserviciospreciossinrangos.getnombre_bodega());
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextFieldnombre_unidadProductosServiciosPreciosSinRangos.setText(productosserviciospreciossinrangos.getnombre_unidad());
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextAreacodigo_tipo_precioProductosServiciosPreciosSinRangos.setText(productosserviciospreciossinrangos.getcodigo_tipo_precio());
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextFieldprecioProductosServiciosPreciosSinRangos.setText(productosserviciospreciossinrangos.getprecio().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductosServiciosPreciosSinRangos(ProductosServiciosPreciosSinRangosBean productosserviciospreciossinrangosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jLabelidProductosServiciosPreciosSinRangos.setText(productosserviciospreciossinrangosBean.getId().toString());
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextAreanombre_sucursalProductosServiciosPreciosSinRangos.setText(productosserviciospreciossinrangosBean.getnombre_sucursal());
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextFieldcodigoProductosServiciosPreciosSinRangos.setText(productosserviciospreciossinrangosBean.getcodigo());
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextAreanombreProductosServiciosPreciosSinRangos.setText(productosserviciospreciossinrangosBean.getnombre());
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextAreanombre_bodegaProductosServiciosPreciosSinRangos.setText(productosserviciospreciossinrangosBean.getnombre_bodega());
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextFieldnombre_unidadProductosServiciosPreciosSinRangos.setText(productosserviciospreciossinrangosBean.getnombre_unidad());
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextAreacodigo_tipo_precioProductosServiciosPreciosSinRangos.setText(productosserviciospreciossinrangosBean.getcodigo_tipo_precio());
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextFieldprecioProductosServiciosPreciosSinRangos.setText(productosserviciospreciossinrangosBean.getprecio().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProductosServiciosPreciosSinRangos(ProductosServiciosPreciosSinRangosParameterReturnGeneral productosserviciospreciossinrangosReturnGeneral,ProductosServiciosPreciosSinRangosBean productosserviciospreciossinrangosBean,Boolean conDefault) throws Exception { 
		try {
			ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosLocal=new ProductosServiciosPreciosSinRangos();
			
			productosserviciospreciossinrangosLocal=productosserviciospreciossinrangosReturnGeneral.getProductosServiciosPreciosSinRangos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productosserviciospreciossinrangosLocal.getId()!=null && !productosserviciospreciossinrangosLocal.getId().equals(0L))) {productosserviciospreciossinrangosBean.setId(productosserviciospreciossinrangosLocal.getId());}}
			if(conDefault || (!conDefault && productosserviciospreciossinrangosLocal.getnombre_sucursal()!=null && !productosserviciospreciossinrangosLocal.getnombre_sucursal().equals(""))) {productosserviciospreciossinrangosBean.setnombre_sucursal(productosserviciospreciossinrangosLocal.getnombre_sucursal());}
			if(conDefault || (!conDefault && productosserviciospreciossinrangosLocal.getcodigo()!=null && !productosserviciospreciossinrangosLocal.getcodigo().equals(""))) {productosserviciospreciossinrangosBean.setcodigo(productosserviciospreciossinrangosLocal.getcodigo());}
			if(conDefault || (!conDefault && productosserviciospreciossinrangosLocal.getnombre()!=null && !productosserviciospreciossinrangosLocal.getnombre().equals(""))) {productosserviciospreciossinrangosBean.setnombre(productosserviciospreciossinrangosLocal.getnombre());}
			if(conDefault || (!conDefault && productosserviciospreciossinrangosLocal.getnombre_bodega()!=null && !productosserviciospreciossinrangosLocal.getnombre_bodega().equals(""))) {productosserviciospreciossinrangosBean.setnombre_bodega(productosserviciospreciossinrangosLocal.getnombre_bodega());}
			if(conDefault || (!conDefault && productosserviciospreciossinrangosLocal.getnombre_unidad()!=null && !productosserviciospreciossinrangosLocal.getnombre_unidad().equals(""))) {productosserviciospreciossinrangosBean.setnombre_unidad(productosserviciospreciossinrangosLocal.getnombre_unidad());}
			if(conDefault || (!conDefault && productosserviciospreciossinrangosLocal.getcodigo_tipo_precio()!=null && !productosserviciospreciossinrangosLocal.getcodigo_tipo_precio().equals(""))) {productosserviciospreciossinrangosBean.setcodigo_tipo_precio(productosserviciospreciossinrangosLocal.getcodigo_tipo_precio());}
			if(conDefault || (!conDefault && productosserviciospreciossinrangosLocal.getprecio()!=null && !productosserviciospreciossinrangosLocal.getprecio().equals(0.0))) {productosserviciospreciossinrangosBean.setprecio(productosserviciospreciossinrangosLocal.getprecio());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProductosServiciosPreciosSinRangosGenerico(Long idProductosServiciosPreciosSinRangosSeleccionado,JComboBox jComboBoxProductosServiciosPreciosSinRangos,List<ProductosServiciosPreciosSinRangos> productosserviciospreciossinrangossLocal)throws Exception {
		try {
			ProductosServiciosPreciosSinRangos  productosserviciospreciossinrangosTemp=null;

			for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosAux:productosserviciospreciossinrangossLocal) {
				if(productosserviciospreciossinrangosAux.getId()!=null && productosserviciospreciossinrangosAux.getId().equals(idProductosServiciosPreciosSinRangosSeleccionado)) {
					productosserviciospreciossinrangosTemp=productosserviciospreciossinrangosAux;
					break;
				}
			}

			jComboBoxProductosServiciosPreciosSinRangos.setSelectedItem(productosserviciospreciossinrangosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProductosServiciosPreciosSinRangosGenerico(JComboBox jComboBoxProductosServiciosPreciosSinRangos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProductosServiciosPreciosSinRangos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductosServiciosPreciosSinRangos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProductosServiciosPreciosSinRangos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductosServiciosPreciosSinRangos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductosServiciosPreciosSinRangos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProductosServiciosPreciosSinRangos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductosServiciosPreciosSinRangos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProductosServiciosPreciosSinRangos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProductosServiciosPreciosSinRangos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProductosServiciosPreciosSinRangos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productosserviciospreciossinrangos=(ProductosServiciosPreciosSinRangos) productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) productosserviciospreciossinrangoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!productosserviciospreciossinrangos.getIsNew() && !productosserviciospreciossinrangos.getIsChanged() && !productosserviciospreciossinrangos.getIsDeleted()) {
				sDescripcion=productosserviciospreciossinrangos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=productosserviciospreciossinrangos.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!productosserviciospreciossinrangos.getIsNew() && !productosserviciospreciossinrangos.getIsChanged() && !productosserviciospreciossinrangos.getIsDeleted()) {
				sDescripcion=productosserviciospreciossinrangos.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=productosserviciospreciossinrangos.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!productosserviciospreciossinrangos.getIsNew() && !productosserviciospreciossinrangos.getIsChanged() && !productosserviciospreciossinrangos.getIsDeleted()) {
				sDescripcion=productosserviciospreciossinrangos.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=productosserviciospreciossinrangos.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Linea")) {
			//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
			if(!productosserviciospreciossinrangos.getIsNew() && !productosserviciospreciossinrangos.getIsChanged() && !productosserviciospreciossinrangos.getIsDeleted()) {
				sDescripcion=productosserviciospreciossinrangos.getlinea_descripcion();
			} else {
				//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
				sDescripcion=productosserviciospreciossinrangos.getlinea_descripcion();
			}
		}

		if(sTipo.equals("LineaGrupo")) {
			//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
			if(!productosserviciospreciossinrangos.getIsNew() && !productosserviciospreciossinrangos.getIsChanged() && !productosserviciospreciossinrangos.getIsDeleted()) {
				sDescripcion=productosserviciospreciossinrangos.getlineagrupo_descripcion();
			} else {
				//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
				sDescripcion=productosserviciospreciossinrangos.getlineagrupo_descripcion();
			}
		}

		if(sTipo.equals("LineaCategoria")) {
			//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
			if(!productosserviciospreciossinrangos.getIsNew() && !productosserviciospreciossinrangos.getIsChanged() && !productosserviciospreciossinrangos.getIsDeleted()) {
				sDescripcion=productosserviciospreciossinrangos.getlineacategoria_descripcion();
			} else {
				//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
				sDescripcion=productosserviciospreciossinrangos.getlineacategoria_descripcion();
			}
		}

		if(sTipo.equals("LineaMarca")) {
			//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
			if(!productosserviciospreciossinrangos.getIsNew() && !productosserviciospreciossinrangos.getIsChanged() && !productosserviciospreciossinrangos.getIsDeleted()) {
				sDescripcion=productosserviciospreciossinrangos.getlineamarca_descripcion();
			} else {
				//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
				sDescripcion=productosserviciospreciossinrangos.getlineamarca_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosRow=new ProductosServiciosPreciosSinRangos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productosserviciospreciossinrangosRow=(ProductosServiciosPreciosSinRangos) productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productosserviciospreciossinrangosRow=(ProductosServiciosPreciosSinRangos) productosserviciospreciossinrangoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProductosServiciosPreciosSinRangos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProductosServiciosPreciosSinRangos.setVisible((this.isVisibilidadCeldaNuevoProductosServiciosPreciosSinRangos && this.isPermisoNuevoProductosServiciosPreciosSinRangos));			
			this.jButtonDuplicarProductosServiciosPreciosSinRangos.setVisible((this.isVisibilidadCeldaDuplicarProductosServiciosPreciosSinRangos && this.isPermisoDuplicarProductosServiciosPreciosSinRangos));			
			this.jButtonCopiarProductosServiciosPreciosSinRangos.setVisible((this.isVisibilidadCeldaCopiarProductosServiciosPreciosSinRangos && this.isPermisoCopiarProductosServiciosPreciosSinRangos));
			this.jButtonVerFormProductosServiciosPreciosSinRangos.setVisible((this.isVisibilidadCeldaVerFormProductosServiciosPreciosSinRangos && this.isPermisoVerFormProductosServiciosPreciosSinRangos));
			
			this.jButtonAbrirOrderByProductosServiciosPreciosSinRangos.setVisible((this.isVisibilidadCeldaOrdenProductosServiciosPreciosSinRangos && this.isPermisoOrdenProductosServiciosPreciosSinRangos));			
			
			this.jButtonNuevoRelacionesProductosServiciosPreciosSinRangos.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductosServiciosPreciosSinRangos && this.isPermisoNuevoProductosServiciosPreciosSinRangos));			
			this.jButtonNuevoGuardarCambiosProductosServiciosPreciosSinRangos.setVisible((this.isVisibilidadCeldaNuevoProductosServiciosPreciosSinRangos && this.isPermisoNuevoProductosServiciosPreciosSinRangos && this.isPermisoGuardarCambiosProductosServiciosPreciosSinRangos));
			
			if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonModificarProductosServiciosPreciosSinRangos.setVisible((this.isVisibilidadCeldaModificarProductosServiciosPreciosSinRangos && this.isPermisoActualizarProductosServiciosPreciosSinRangos));	
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonActualizarProductosServiciosPreciosSinRangos.setVisible((this.isVisibilidadCeldaActualizarProductosServiciosPreciosSinRangos && this.isPermisoActualizarProductosServiciosPreciosSinRangos));	
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonEliminarProductosServiciosPreciosSinRangos.setVisible((this.isVisibilidadCeldaEliminarProductosServiciosPreciosSinRangos && this.isPermisoEliminarProductosServiciosPreciosSinRangos));
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonCancelarProductosServiciosPreciosSinRangos.setVisible(this.isVisibilidadCeldaCancelarProductosServiciosPreciosSinRangos);							
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonGuardarCambiosProductosServiciosPreciosSinRangos.setVisible((this.isVisibilidadCeldaGuardarProductosServiciosPreciosSinRangos && this.isPermisoGuardarCambiosProductosServiciosPreciosSinRangos));			
			
			}
						
			this.jButtonGuardarCambiosTablaProductosServiciosPreciosSinRangos.setVisible((this.isVisibilidadCeldaGuardarCambiosProductosServiciosPreciosSinRangos && this.isPermisoGuardarCambiosProductosServiciosPreciosSinRangos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProductosServiciosPreciosSinRangos.setVisible((this.isVisibilidadCeldaNuevoProductosServiciosPreciosSinRangos && this.isPermisoNuevoProductosServiciosPreciosSinRangos));						
			this.jButtonDuplicarToolBarProductosServiciosPreciosSinRangos.setVisible((this.isVisibilidadCeldaDuplicarProductosServiciosPreciosSinRangos && this.isPermisoDuplicarProductosServiciosPreciosSinRangos));						
			this.jButtonCopiarToolBarProductosServiciosPreciosSinRangos.setVisible((this.isVisibilidadCeldaCopiarProductosServiciosPreciosSinRangos && this.isPermisoCopiarProductosServiciosPreciosSinRangos));			
			this.jButtonVerFormToolBarProductosServiciosPreciosSinRangos.setVisible((this.isVisibilidadCeldaVerFormProductosServiciosPreciosSinRangos && this.isPermisoVerFormProductosServiciosPreciosSinRangos));			
			this.jButtonAbrirOrderByToolBarProductosServiciosPreciosSinRangos.setVisible((this.isVisibilidadCeldaOrdenProductosServiciosPreciosSinRangos && this.isPermisoOrdenProductosServiciosPreciosSinRangos));
			this.jButtonNuevoRelacionesToolBarProductosServiciosPreciosSinRangos.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductosServiciosPreciosSinRangos && this.isPermisoNuevoProductosServiciosPreciosSinRangos));			
			this.jButtonNuevoGuardarCambiosToolBarProductosServiciosPreciosSinRangos.setVisible((this.isVisibilidadCeldaNuevoProductosServiciosPreciosSinRangos && this.isPermisoNuevoProductosServiciosPreciosSinRangos && this.isPermisoGuardarCambiosProductosServiciosPreciosSinRangos));			
			
			if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonModificarToolBarProductosServiciosPreciosSinRangos.setVisible((this.isVisibilidadCeldaModificarProductosServiciosPreciosSinRangos && this.isPermisoActualizarProductosServiciosPreciosSinRangos));	
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonActualizarToolBarProductosServiciosPreciosSinRangos.setVisible((this.isVisibilidadCeldaActualizarProductosServiciosPreciosSinRangos  && this.isPermisoActualizarProductosServiciosPreciosSinRangos));	
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonEliminarToolBarProductosServiciosPreciosSinRangos.setVisible((this.isVisibilidadCeldaEliminarProductosServiciosPreciosSinRangos && this.isPermisoEliminarProductosServiciosPreciosSinRangos));
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonCancelarToolBarProductosServiciosPreciosSinRangos.setVisible(this.isVisibilidadCeldaCancelarProductosServiciosPreciosSinRangos);				
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonGuardarCambiosToolBarProductosServiciosPreciosSinRangos.setVisible((this.isVisibilidadCeldaGuardarProductosServiciosPreciosSinRangos && this.isPermisoGuardarCambiosProductosServiciosPreciosSinRangos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProductosServiciosPreciosSinRangos.setVisible((this.isVisibilidadCeldaGuardarCambiosProductosServiciosPreciosSinRangos && this.isPermisoGuardarCambiosProductosServiciosPreciosSinRangos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProductosServiciosPreciosSinRangos.setVisible((this.isVisibilidadCeldaNuevoProductosServiciosPreciosSinRangos && this.isPermisoNuevoProductosServiciosPreciosSinRangos));			
			this.jMenuItemDuplicarProductosServiciosPreciosSinRangos.setVisible((this.isVisibilidadCeldaDuplicarProductosServiciosPreciosSinRangos && this.isPermisoDuplicarProductosServiciosPreciosSinRangos));			
			this.jMenuItemCopiarProductosServiciosPreciosSinRangos.setVisible((this.isVisibilidadCeldaCopiarProductosServiciosPreciosSinRangos && this.isPermisoCopiarProductosServiciosPreciosSinRangos));			
			this.jMenuItemVerFormProductosServiciosPreciosSinRangos.setVisible((this.isVisibilidadCeldaVerFormProductosServiciosPreciosSinRangos && this.isPermisoVerFormProductosServiciosPreciosSinRangos));			
			this.jMenuItemAbrirOrderByProductosServiciosPreciosSinRangos.setVisible((this.isVisibilidadCeldaOrdenProductosServiciosPreciosSinRangos && this.isPermisoOrdenProductosServiciosPreciosSinRangos));			
			//this.jMenuItemMostrarOcultarProductosServiciosPreciosSinRangos.setVisible((this.isVisibilidadCeldaOrdenProductosServiciosPreciosSinRangos && this.isPermisoOrdenProductosServiciosPreciosSinRangos));
			this.jMenuItemDetalleAbrirOrderByProductosServiciosPreciosSinRangos.setVisible((this.isVisibilidadCeldaOrdenProductosServiciosPreciosSinRangos && this.isPermisoOrdenProductosServiciosPreciosSinRangos));			
			//this.jMenuItemDetalleMostrarOcultarProductosServiciosPreciosSinRangos.setVisible((this.isVisibilidadCeldaOrdenProductosServiciosPreciosSinRangos && this.isPermisoOrdenProductosServiciosPreciosSinRangos));			
			this.jMenuItemNuevoRelacionesProductosServiciosPreciosSinRangos.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductosServiciosPreciosSinRangos && this.isPermisoNuevoProductosServiciosPreciosSinRangos));			
			this.jMenuItemNuevoGuardarCambiosProductosServiciosPreciosSinRangos.setVisible((this.isVisibilidadCeldaNuevoProductosServiciosPreciosSinRangos && this.isPermisoNuevoProductosServiciosPreciosSinRangos && this.isPermisoGuardarCambiosProductosServiciosPreciosSinRangos));									
			
			if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jMenuItemModificarProductosServiciosPreciosSinRangos.setVisible((this.isVisibilidadCeldaModificarProductosServiciosPreciosSinRangos && this.isPermisoActualizarProductosServiciosPreciosSinRangos));	
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jMenuItemActualizarProductosServiciosPreciosSinRangos.setVisible((this.isVisibilidadCeldaActualizarProductosServiciosPreciosSinRangos && this.isPermisoActualizarProductosServiciosPreciosSinRangos));	
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jMenuItemEliminarProductosServiciosPreciosSinRangos.setVisible((this.isVisibilidadCeldaEliminarProductosServiciosPreciosSinRangos && this.isPermisoEliminarProductosServiciosPreciosSinRangos));
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jMenuItemCancelarProductosServiciosPreciosSinRangos.setVisible(this.isVisibilidadCeldaCancelarProductosServiciosPreciosSinRangos);				
			}
			
			this.jMenuItemGuardarCambiosProductosServiciosPreciosSinRangos.setVisible((this.isVisibilidadCeldaGuardarProductosServiciosPreciosSinRangos && this.isPermisoGuardarCambiosProductosServiciosPreciosSinRangos));						
			this.jMenuItemGuardarCambiosTablaProductosServiciosPreciosSinRangos.setVisible((this.isVisibilidadCeldaGuardarCambiosProductosServiciosPreciosSinRangos && this.isPermisoGuardarCambiosProductosServiciosPreciosSinRangos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProductosServiciosPreciosSinRangos=this.jButtonNuevoProductosServiciosPreciosSinRangos.isVisible();
			this.isVisibilidadCeldaDuplicarProductosServiciosPreciosSinRangos=this.jButtonDuplicarProductosServiciosPreciosSinRangos.isVisible();
			this.isVisibilidadCeldaCopiarProductosServiciosPreciosSinRangos=this.jButtonCopiarProductosServiciosPreciosSinRangos.isVisible();
			this.isVisibilidadCeldaVerFormProductosServiciosPreciosSinRangos=this.jButtonVerFormProductosServiciosPreciosSinRangos.isVisible();
			
			this.isVisibilidadCeldaOrdenProductosServiciosPreciosSinRangos=this.jButtonAbrirOrderByProductosServiciosPreciosSinRangos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProductosServiciosPreciosSinRangos=this.jButtonNuevoRelacionesProductosServiciosPreciosSinRangos.isVisible();
			this.isVisibilidadCeldaModificarProductosServiciosPreciosSinRangos=this.jButtonModificarProductosServiciosPreciosSinRangos.isVisible();
			
			if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
			this.isVisibilidadCeldaActualizarProductosServiciosPreciosSinRangos=this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonActualizarProductosServiciosPreciosSinRangos.isVisible();
			this.isVisibilidadCeldaEliminarProductosServiciosPreciosSinRangos=this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonEliminarProductosServiciosPreciosSinRangos.isVisible();
			this.isVisibilidadCeldaCancelarProductosServiciosPreciosSinRangos=this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonCancelarProductosServiciosPreciosSinRangos.isVisible();
			this.isVisibilidadCeldaGuardarProductosServiciosPreciosSinRangos=this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonGuardarCambiosProductosServiciosPreciosSinRangos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProductosServiciosPreciosSinRangos=this.jButtonGuardarCambiosTablaProductosServiciosPreciosSinRangos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProductosServiciosPreciosSinRangos=this.jButtonNuevoToolBarProductosServiciosPreciosSinRangos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductosServiciosPreciosSinRangos=this.jButtonNuevoRelacionesToolBarProductosServiciosPreciosSinRangos.isVisible();
			
			if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
			this.isVisibilidadCeldaModificarProductosServiciosPreciosSinRangos=this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonModificarToolBarProductosServiciosPreciosSinRangos.isVisible();
			this.isVisibilidadCeldaActualizarProductosServiciosPreciosSinRangos=this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonActualizarToolBarProductosServiciosPreciosSinRangos.isVisible();
			this.isVisibilidadCeldaEliminarProductosServiciosPreciosSinRangos=this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonEliminarToolBarProductosServiciosPreciosSinRangos.isVisible();
			this.isVisibilidadCeldaCancelarProductosServiciosPreciosSinRangos=this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonCancelarToolBarProductosServiciosPreciosSinRangos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductosServiciosPreciosSinRangos=this.jButtonGuardarCambiosToolBarProductosServiciosPreciosSinRangos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductosServiciosPreciosSinRangos=this.jButtonGuardarCambiosTablaToolBarProductosServiciosPreciosSinRangos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProductosServiciosPreciosSinRangos=this.jMenuItemNuevoProductosServiciosPreciosSinRangos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductosServiciosPreciosSinRangos=this.jMenuItemNuevoRelacionesProductosServiciosPreciosSinRangos.isVisible();
			
			if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
			this.isVisibilidadCeldaModificarProductosServiciosPreciosSinRangos=this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jMenuItemModificarProductosServiciosPreciosSinRangos.isVisible();
			this.isVisibilidadCeldaActualizarProductosServiciosPreciosSinRangos=this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jMenuItemActualizarProductosServiciosPreciosSinRangos.isVisible();
			this.isVisibilidadCeldaEliminarProductosServiciosPreciosSinRangos=this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jMenuItemEliminarProductosServiciosPreciosSinRangos.isVisible();
			this.isVisibilidadCeldaCancelarProductosServiciosPreciosSinRangos=this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jMenuItemCancelarProductosServiciosPreciosSinRangos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductosServiciosPreciosSinRangos=this.jMenuItemGuardarCambiosProductosServiciosPreciosSinRangos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductosServiciosPreciosSinRangos=this.jMenuItemGuardarCambiosTablaProductosServiciosPreciosSinRangos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProductosServiciosPreciosSinRangos(Boolean esInicializar) {
		if(ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.productosserviciospreciossinrangosSessionBean.getConGuardarRelaciones()) {
				//if(this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProductosServiciosPreciosSinRangos();
			}
			
			this.inicializarActualizarBindingBotonesManualProductosServiciosPreciosSinRangos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProductosServiciosPreciosSinRangos() {
		this.jButtonNuevoProductosServiciosPreciosSinRangos.setVisible(this.isPermisoNuevoProductosServiciosPreciosSinRangos);			
		this.jButtonDuplicarProductosServiciosPreciosSinRangos.setVisible(this.isPermisoDuplicarProductosServiciosPreciosSinRangos);			
		this.jButtonCopiarProductosServiciosPreciosSinRangos.setVisible(this.isPermisoCopiarProductosServiciosPreciosSinRangos);			
		this.jButtonVerFormProductosServiciosPreciosSinRangos.setVisible(this.isPermisoVerFormProductosServiciosPreciosSinRangos);			
		
		this.jButtonAbrirOrderByProductosServiciosPreciosSinRangos.setVisible(this.isPermisoOrdenProductosServiciosPreciosSinRangos);					
		
		this.jButtonNuevoRelacionesProductosServiciosPreciosSinRangos.setVisible(this.isPermisoNuevoProductosServiciosPreciosSinRangos);			
		
		if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonModificarProductosServiciosPreciosSinRangos.setVisible(this.isPermisoActualizarProductosServiciosPreciosSinRangos);	
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonActualizarProductosServiciosPreciosSinRangos.setVisible(this.isPermisoActualizarProductosServiciosPreciosSinRangos);	
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonEliminarProductosServiciosPreciosSinRangos.setVisible(this.isPermisoEliminarProductosServiciosPreciosSinRangos);
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonCancelarProductosServiciosPreciosSinRangos.setVisible(this.isVisibilidadCeldaCancelarProductosServiciosPreciosSinRangos);						
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonGuardarCambiosProductosServiciosPreciosSinRangos.setVisible(this.isPermisoGuardarCambiosProductosServiciosPreciosSinRangos);							
		}
		
		this.jButtonGuardarCambiosTablaProductosServiciosPreciosSinRangos.setVisible(this.isPermisoActualizarProductosServiciosPreciosSinRangos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProductosServiciosPreciosSinRangos() {
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonModificarProductosServiciosPreciosSinRangos.setVisible(this.isPermisoActualizarProductosServiciosPreciosSinRangos);	
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonActualizarProductosServiciosPreciosSinRangos.setVisible(this.isPermisoActualizarProductosServiciosPreciosSinRangos);	
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonEliminarProductosServiciosPreciosSinRangos.setVisible(this.isPermisoEliminarProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonCancelarProductosServiciosPreciosSinRangos.setVisible(this.isVisibilidadCeldaCancelarProductosServiciosPreciosSinRangos);							
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonGuardarCambiosProductosServiciosPreciosSinRangos.setVisible((this.isVisibilidadCeldaGuardarProductosServiciosPreciosSinRangos && this.isPermisoGuardarCambiosProductosServiciosPreciosSinRangos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProductosServiciosPreciosSinRangos() {
		if(ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProductosServiciosPreciosSinRangos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProductosServiciosPreciosSinRangos() {
	}
	
	public void jTableDatosProductosServiciosPreciosSinRangosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProductosServiciosPreciosSinRangos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProductosServiciosPreciosSinRangosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(this.getproductosserviciospreciossinrangos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciospreciossinrangos==null) {
						this.productosserviciospreciossinrangos = new ProductosServiciosPreciosSinRangos();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);
				}

				if(this.productosserviciospreciossinrangos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.productosserviciospreciossinrangos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaProductosServiciosPreciosSinRangosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebProductosServiciosPreciosSinRangos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosServiciosPreciosSinRangos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosServiciosPreciosSinRangos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(this.getproductosserviciospreciossinrangos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.productosserviciospreciossinrangosLogic.getConnexion());

				if(this.productosserviciospreciossinrangos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.productosserviciospreciossinrangos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosServiciosPreciosSinRangos=(TitledBorder)this.jScrollPanelDatosProductosServiciosPreciosSinRangos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderProductosServiciosPreciosSinRangos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaProductosServiciosPreciosSinRangosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(this.getproductosserviciospreciossinrangos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciospreciossinrangos==null) {
						this.productosserviciospreciossinrangos = new ProductosServiciosPreciosSinRangos();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);
				}

				if(this.productosserviciospreciossinrangos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.productosserviciospreciossinrangos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalProductosServiciosPreciosSinRangosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebProductosServiciosPreciosSinRangos(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosServiciosPreciosSinRangos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosServiciosPreciosSinRangos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(this.getproductosserviciospreciossinrangos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.productosserviciospreciossinrangosLogic.getConnexion());

				if(this.productosserviciospreciossinrangos.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.productosserviciospreciossinrangos.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosServiciosPreciosSinRangos=(TitledBorder)this.jScrollPanelDatosProductosServiciosPreciosSinRangos.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderProductosServiciosPreciosSinRangos.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalProductosServiciosPreciosSinRangosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(this.getproductosserviciospreciossinrangos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciospreciossinrangos==null) {
						this.productosserviciospreciossinrangos = new ProductosServiciosPreciosSinRangos();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);
				}

				if(this.productosserviciospreciossinrangos.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.productosserviciospreciossinrangos.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaProductosServiciosPreciosSinRangosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebProductosServiciosPreciosSinRangos(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosServiciosPreciosSinRangos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosServiciosPreciosSinRangos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(this.getproductosserviciospreciossinrangos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.productosserviciospreciossinrangosLogic.getConnexion());

				if(this.productosserviciospreciossinrangos.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.productosserviciospreciossinrangos.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosServiciosPreciosSinRangos=(TitledBorder)this.jScrollPanelDatosProductosServiciosPreciosSinRangos.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderProductosServiciosPreciosSinRangos.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaProductosServiciosPreciosSinRangosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(this.getproductosserviciospreciossinrangos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciospreciossinrangos==null) {
						this.productosserviciospreciossinrangos = new ProductosServiciosPreciosSinRangos();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);
				}

				if(this.productosserviciospreciossinrangos.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.productosserviciospreciossinrangos.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_lineaProductosServiciosPreciosSinRangosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolinea=true;

			idTienePermisolinea=this.tienePermisosUsuarioEnPaginaWebProductosServiciosPreciosSinRangos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolinea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosServiciosPreciosSinRangos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosServiciosPreciosSinRangos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(this.getproductosserviciospreciossinrangos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);

				this.lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.productosserviciospreciossinrangosLogic.getConnexion());

				if(this.productosserviciospreciossinrangos.getid_linea()!=null) {
					this.lineaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineaBeanSwingJInternalFrame.setIdActual(this.productosserviciospreciossinrangos.getid_linea());
					this.lineaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosServiciosPreciosSinRangos=(TitledBorder)this.jScrollPanelDatosProductosServiciosPreciosSinRangos.getBorder();
				TitledBorder titledBorderlinea=(TitledBorder)this.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlinea.setTitle(titledBorderProductosServiciosPreciosSinRangos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_lineaProductosServiciosPreciosSinRangosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(this.getproductosserviciospreciossinrangos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciospreciossinrangos==null) {
						this.productosserviciospreciossinrangos = new ProductosServiciosPreciosSinRangos();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);
				}

				if(this.productosserviciospreciossinrangos.getid_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea = "+this.productosserviciospreciossinrangos.getid_linea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_grupoProductosServiciosPreciosSinRangosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineagrupo=true;

			idTienePermisolineagrupo=this.tienePermisosUsuarioEnPaginaWebProductosServiciosPreciosSinRangos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineagrupo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosServiciosPreciosSinRangos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosServiciosPreciosSinRangos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(this.getproductosserviciospreciossinrangos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);

				this.lineagrupoBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineagrupoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineagrupoBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.productosserviciospreciossinrangosLogic.getConnexion());

				if(this.productosserviciospreciossinrangos.getid_linea_grupo()!=null) {
					this.lineagrupoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineagrupoBeanSwingJInternalFrame.setIdActual(this.productosserviciospreciossinrangos.getid_linea_grupo());
					this.lineagrupoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineagrupoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosServiciosPreciosSinRangos=(TitledBorder)this.jScrollPanelDatosProductosServiciosPreciosSinRangos.getBorder();
				TitledBorder titledBorderlineagrupo=(TitledBorder)this.lineagrupoBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineagrupo.setTitle(titledBorderProductosServiciosPreciosSinRangos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_grupoProductosServiciosPreciosSinRangosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(this.getproductosserviciospreciossinrangos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciospreciossinrangos==null) {
						this.productosserviciospreciossinrangos = new ProductosServiciosPreciosSinRangos();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);
				}

				if(this.productosserviciospreciossinrangos.getid_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_grupo = "+this.productosserviciospreciossinrangos.getid_linea_grupo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_categoriaProductosServiciosPreciosSinRangosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineacategoria=true;

			idTienePermisolineacategoria=this.tienePermisosUsuarioEnPaginaWebProductosServiciosPreciosSinRangos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineacategoria) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosServiciosPreciosSinRangos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosServiciosPreciosSinRangos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(this.getproductosserviciospreciossinrangos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);

				this.lineacategoriaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineacategoriaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineacategoriaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.productosserviciospreciossinrangosLogic.getConnexion());

				if(this.productosserviciospreciossinrangos.getid_linea_categoria()!=null) {
					this.lineacategoriaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineacategoriaBeanSwingJInternalFrame.setIdActual(this.productosserviciospreciossinrangos.getid_linea_categoria());
					this.lineacategoriaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineacategoriaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosServiciosPreciosSinRangos=(TitledBorder)this.jScrollPanelDatosProductosServiciosPreciosSinRangos.getBorder();
				TitledBorder titledBorderlineacategoria=(TitledBorder)this.lineacategoriaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineacategoria.setTitle(titledBorderProductosServiciosPreciosSinRangos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_categoriaProductosServiciosPreciosSinRangosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(this.getproductosserviciospreciossinrangos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciospreciossinrangos==null) {
						this.productosserviciospreciossinrangos = new ProductosServiciosPreciosSinRangos();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);
				}

				if(this.productosserviciospreciossinrangos.getid_linea_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_categoria = "+this.productosserviciospreciossinrangos.getid_linea_categoria().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_marcaProductosServiciosPreciosSinRangosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineamarca=true;

			idTienePermisolineamarca=this.tienePermisosUsuarioEnPaginaWebProductosServiciosPreciosSinRangos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineamarca) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosServiciosPreciosSinRangos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosServiciosPreciosSinRangos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(this.getproductosserviciospreciossinrangos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);

				this.lineamarcaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineamarcaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineamarcaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.productosserviciospreciossinrangosLogic.getConnexion());

				if(this.productosserviciospreciossinrangos.getid_linea_marca()!=null) {
					this.lineamarcaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineamarcaBeanSwingJInternalFrame.setIdActual(this.productosserviciospreciossinrangos.getid_linea_marca());
					this.lineamarcaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineamarcaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosServiciosPreciosSinRangos=(TitledBorder)this.jScrollPanelDatosProductosServiciosPreciosSinRangos.getBorder();
				TitledBorder titledBorderlineamarca=(TitledBorder)this.lineamarcaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineamarca.setTitle(titledBorderProductosServiciosPreciosSinRangos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_marcaProductosServiciosPreciosSinRangosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(this.getproductosserviciospreciossinrangos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciospreciossinrangos==null) {
						this.productosserviciospreciossinrangos = new ProductosServiciosPreciosSinRangos();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);
				}

				if(this.productosserviciospreciossinrangos.getid_linea_marca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_marca = "+this.productosserviciospreciossinrangos.getid_linea_marca().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_sucursalProductosServiciosPreciosSinRangosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(this.getproductosserviciospreciossinrangos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciospreciossinrangos==null) {
						this.productosserviciospreciossinrangos = new ProductosServiciosPreciosSinRangos();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);
				}

				if(this.productosserviciospreciossinrangos.getnombre_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_sucursal like '%"+this.productosserviciospreciossinrangos.getnombre_sucursal()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoProductosServiciosPreciosSinRangosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(this.getproductosserviciospreciossinrangos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciospreciossinrangos==null) {
						this.productosserviciospreciossinrangos = new ProductosServiciosPreciosSinRangos();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);
				}

				if(this.productosserviciospreciossinrangos.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.productosserviciospreciossinrangos.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreProductosServiciosPreciosSinRangosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(this.getproductosserviciospreciossinrangos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciospreciossinrangos==null) {
						this.productosserviciospreciossinrangos = new ProductosServiciosPreciosSinRangos();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);
				}

				if(this.productosserviciospreciossinrangos.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.productosserviciospreciossinrangos.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_bodegaProductosServiciosPreciosSinRangosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(this.getproductosserviciospreciossinrangos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciospreciossinrangos==null) {
						this.productosserviciospreciossinrangos = new ProductosServiciosPreciosSinRangos();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);
				}

				if(this.productosserviciospreciossinrangos.getnombre_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_bodega like '%"+this.productosserviciospreciossinrangos.getnombre_bodega()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_unidadProductosServiciosPreciosSinRangosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(this.getproductosserviciospreciossinrangos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciospreciossinrangos==null) {
						this.productosserviciospreciossinrangos = new ProductosServiciosPreciosSinRangos();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);
				}

				if(this.productosserviciospreciossinrangos.getnombre_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_unidad like '%"+this.productosserviciospreciossinrangos.getnombre_unidad()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_tipo_precioProductosServiciosPreciosSinRangosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(this.getproductosserviciospreciossinrangos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciospreciossinrangos==null) {
						this.productosserviciospreciossinrangos = new ProductosServiciosPreciosSinRangos();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);
				}

				if(this.productosserviciospreciossinrangos.getcodigo_tipo_precio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_tipo_precio like '%"+this.productosserviciospreciossinrangos.getcodigo_tipo_precio()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonprecioProductosServiciosPreciosSinRangosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(this.getproductosserviciospreciossinrangos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciospreciossinrangos==null) {
						this.productosserviciospreciossinrangos = new ProductosServiciosPreciosSinRangos();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);
				}

				if(this.productosserviciospreciossinrangos.getprecio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where precio = "+this.productosserviciospreciossinrangos.getprecio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false,false);

			this.getProductosServiciosPreciosSinRangossBusquedaProductosServiciosPreciosSinRangos();

			this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false);

			//if(ProductosServiciosPreciosSinRangosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdBodegaProductosServiciosPreciosSinRangosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false,false);

			this.getProductosServiciosPreciosSinRangossFK_IdBodega();

			this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false);

			//if(ProductosServiciosPreciosSinRangosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaProductosServiciosPreciosSinRangosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false,false);

			this.getProductosServiciosPreciosSinRangossFK_IdEmpresa();

			this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false);

			//if(ProductosServiciosPreciosSinRangosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaProductosServiciosPreciosSinRangosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false,false);

			this.getProductosServiciosPreciosSinRangossFK_IdLinea();

			this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false);

			//if(ProductosServiciosPreciosSinRangosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaCategoriaProductosServiciosPreciosSinRangosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false,false);

			this.getProductosServiciosPreciosSinRangossFK_IdLineaCategoria();

			this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false);

			//if(ProductosServiciosPreciosSinRangosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaGrupoProductosServiciosPreciosSinRangosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false,false);

			this.getProductosServiciosPreciosSinRangossFK_IdLineaGrupo();

			this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false);

			//if(ProductosServiciosPreciosSinRangosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaMarcaProductosServiciosPreciosSinRangosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false,false);

			this.getProductosServiciosPreciosSinRangossFK_IdLineaMarca();

			this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false);

			//if(ProductosServiciosPreciosSinRangosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalProductosServiciosPreciosSinRangosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false,false);

			this.getProductosServiciosPreciosSinRangossFK_IdSucursal();

			this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false);

			//if(ProductosServiciosPreciosSinRangosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciospreciossinrangosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProductosServiciosPreciosSinRangos() {
		if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.setVisible(false);	    			
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.dispose();
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos!=null) {
			this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.dispose();
			this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos=null;
		}
		
		if(this.jInternalFrameImportacionProductosServiciosPreciosSinRangos!=null) {
			this.jInternalFrameImportacionProductosServiciosPreciosSinRangos.setVisible(false);	    			
			this.jInternalFrameImportacionProductosServiciosPreciosSinRangos.dispose();
			this.jInternalFrameImportacionProductosServiciosPreciosSinRangos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProductosServiciosPreciosSinRangos();
			
			ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
			
			
			if(sTipo.equals("NuevoProductosServiciosPreciosSinRangos")) {
				jButtonNuevoProductosServiciosPreciosSinRangosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProductosServiciosPreciosSinRangos")) {
				jButtonDuplicarProductosServiciosPreciosSinRangosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProductosServiciosPreciosSinRangos")) {
				jButtonCopiarProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("VerFormProductosServiciosPreciosSinRangos")) {
				jButtonVerFormProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProductosServiciosPreciosSinRangos")) {
				jButtonNuevoProductosServiciosPreciosSinRangosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProductosServiciosPreciosSinRangos")) {
				jButtonDuplicarProductosServiciosPreciosSinRangosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProductosServiciosPreciosSinRangos")) {
				jButtonNuevoProductosServiciosPreciosSinRangosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProductosServiciosPreciosSinRangos")) {
				jButtonDuplicarProductosServiciosPreciosSinRangosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProductosServiciosPreciosSinRangos")) {
				jButtonNuevoProductosServiciosPreciosSinRangosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProductosServiciosPreciosSinRangos")) {
				jButtonNuevoProductosServiciosPreciosSinRangosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProductosServiciosPreciosSinRangos")) {
				jButtonNuevoProductosServiciosPreciosSinRangosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProductosServiciosPreciosSinRangos")) {
				jButtonModificarProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProductosServiciosPreciosSinRangos")) {
				jButtonModificarProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProductosServiciosPreciosSinRangos")) {
				jButtonModificarProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProductosServiciosPreciosSinRangos")) {
				jButtonActualizarProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProductosServiciosPreciosSinRangos")) {
				jButtonActualizarProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProductosServiciosPreciosSinRangos")) {
				jButtonActualizarProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("EliminarProductosServiciosPreciosSinRangos")) {
				jButtonEliminarProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProductosServiciosPreciosSinRangos")) {
				jButtonEliminarProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProductosServiciosPreciosSinRangos")) {
				jButtonEliminarProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("CancelarProductosServiciosPreciosSinRangos")) {
				jButtonCancelarProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProductosServiciosPreciosSinRangos")) {
				jButtonCancelarProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProductosServiciosPreciosSinRangos")) {
				jButtonCancelarProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("CerrarProductosServiciosPreciosSinRangos")) {
				jButtonCerrarProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProductosServiciosPreciosSinRangos")) {
				jButtonCerrarProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProductosServiciosPreciosSinRangos")) {
				jButtonCerrarProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProductosServiciosPreciosSinRangos")) {
				jButtonMostrarOcultarProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProductosServiciosPreciosSinRangos")) {
				jButtonCancelarProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProductosServiciosPreciosSinRangos")) {
				jButtonGuardarCambiosProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProductosServiciosPreciosSinRangos")) {
				jButtonGuardarCambiosProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProductosServiciosPreciosSinRangos")) {
				jButtonCopiarProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProductosServiciosPreciosSinRangos")) {
				jButtonVerFormProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProductosServiciosPreciosSinRangos")) {
				jButtonGuardarCambiosProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProductosServiciosPreciosSinRangos")) {
				jButtonCopiarProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProductosServiciosPreciosSinRangos")) {
				jButtonVerFormProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProductosServiciosPreciosSinRangos")) {
				jButtonGuardarCambiosProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProductosServiciosPreciosSinRangos")) {
				jButtonGuardarCambiosProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProductosServiciosPreciosSinRangos")) {
				jButtonGuardarCambiosProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProductosServiciosPreciosSinRangos")) {
				jButtonRecargarInformacionProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProductosServiciosPreciosSinRangos")) {
				jButtonRecargarInformacionProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProductosServiciosPreciosSinRangos")) {
				jButtonRecargarInformacionProductosServiciosPreciosSinRangosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProductosServiciosPreciosSinRangos")) {
				jButtonAnterioresProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProductosServiciosPreciosSinRangos")) {
				jButtonAnterioresProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProductosServiciosPreciosSinRangos")) {
				jButtonAnterioresProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProductosServiciosPreciosSinRangos")) {
				jButtonSiguientesProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProductosServiciosPreciosSinRangos")) {
				jButtonSiguientesProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProductosServiciosPreciosSinRangos")) {
				jButtonSiguientesProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProductosServiciosPreciosSinRangos") || sTipo.equals("MenuItemDetalleAbrirOrderByProductosServiciosPreciosSinRangos")) {
				jButtonAbrirOrderByProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProductosServiciosPreciosSinRangos") || sTipo.equals("MenuItemDetalleMostrarOcultarProductosServiciosPreciosSinRangos")) {
				jButtonMostrarOcultarProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProductosServiciosPreciosSinRangos")) {
				jButtonNuevoGuardarCambiosProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProductosServiciosPreciosSinRangos")) {
				jButtonNuevoGuardarCambiosProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProductosServiciosPreciosSinRangos")) {
				jButtonNuevoGuardarCambiosProductosServiciosPreciosSinRangosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProductosServiciosPreciosSinRangos")) {
				jButtonCerrarReporteDinamicoProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProductosServiciosPreciosSinRangos")) {
				jButtonGenerarReporteDinamicoProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProductosServiciosPreciosSinRangos")) {
				
				jButtonGenerarExcelReporteDinamicoProductosServiciosPreciosSinRangosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProductosServiciosPreciosSinRangos")) {
				jButtonCerrarImportacionProductosServiciosPreciosSinRangosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProductosServiciosPreciosSinRangos")) {
				
				jButtonGenerarImportacionProductosServiciosPreciosSinRangosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProductosServiciosPreciosSinRangos")) {
				
				jButtonAbrirImportacionProductosServiciosPreciosSinRangosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProductosServiciosPreciosSinRangos")) {
				jComboBoxTiposAccionesProductosServiciosPreciosSinRangosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProductosServiciosPreciosSinRangos")) {
				jComboBoxTiposRelacionesProductosServiciosPreciosSinRangosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProductosServiciosPreciosSinRangos")) {
				jComboBoxTiposAccionesProductosServiciosPreciosSinRangosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProductosServiciosPreciosSinRangos")) {
				
				jComboBoxTiposSeleccionarProductosServiciosPreciosSinRangosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProductosServiciosPreciosSinRangos")) {
				jTextFieldValorCampoGeneralProductosServiciosPreciosSinRangosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProductosServiciosPreciosSinRangos")) {
				jButtonAbrirOrderByProductosServiciosPreciosSinRangosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProductosServiciosPreciosSinRangos")) {
				jButtonAbrirOrderByProductosServiciosPreciosSinRangosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProductosServiciosPreciosSinRangos")) {
				jButtonCerrarOrderByProductosServiciosPreciosSinRangosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductosServiciosPreciosSinRangosBusqueda")) {
				this.jButtonidProductosServiciosPreciosSinRangosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProductosServiciosPreciosSinRangosUpdate")) {
				this.jButtonid_empresaProductosServiciosPreciosSinRangosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProductosServiciosPreciosSinRangosBusqueda")) {
				this.jButtonid_empresaProductosServiciosPreciosSinRangosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProductosServiciosPreciosSinRangosUpdate")) {
				this.jButtonid_sucursalProductosServiciosPreciosSinRangosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProductosServiciosPreciosSinRangosBusqueda")) {
				this.jButtonid_sucursalProductosServiciosPreciosSinRangosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaProductosServiciosPreciosSinRangosUpdate")) {
				this.jButtonid_bodegaProductosServiciosPreciosSinRangosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaProductosServiciosPreciosSinRangosBusqueda")) {
				this.jButtonid_bodegaProductosServiciosPreciosSinRangosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaProductosServiciosPreciosSinRangosUpdate")) {
				this.jButtonid_lineaProductosServiciosPreciosSinRangosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaProductosServiciosPreciosSinRangosBusqueda")) {
				this.jButtonid_lineaProductosServiciosPreciosSinRangosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoProductosServiciosPreciosSinRangosUpdate")) {
				this.jButtonid_linea_grupoProductosServiciosPreciosSinRangosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoProductosServiciosPreciosSinRangosBusqueda")) {
				this.jButtonid_linea_grupoProductosServiciosPreciosSinRangosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaProductosServiciosPreciosSinRangosUpdate")) {
				this.jButtonid_linea_categoriaProductosServiciosPreciosSinRangosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaProductosServiciosPreciosSinRangosBusqueda")) {
				this.jButtonid_linea_categoriaProductosServiciosPreciosSinRangosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaProductosServiciosPreciosSinRangosUpdate")) {
				this.jButtonid_linea_marcaProductosServiciosPreciosSinRangosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaProductosServiciosPreciosSinRangosBusqueda")) {
				this.jButtonid_linea_marcaProductosServiciosPreciosSinRangosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sucursalProductosServiciosPreciosSinRangosBusqueda")) {
				this.jButtonnombre_sucursalProductosServiciosPreciosSinRangosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoProductosServiciosPreciosSinRangosBusqueda")) {
				this.jButtoncodigoProductosServiciosPreciosSinRangosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreProductosServiciosPreciosSinRangosBusqueda")) {
				this.jButtonnombreProductosServiciosPreciosSinRangosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bodegaProductosServiciosPreciosSinRangosBusqueda")) {
				this.jButtonnombre_bodegaProductosServiciosPreciosSinRangosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadProductosServiciosPreciosSinRangosBusqueda")) {
				this.jButtonnombre_unidadProductosServiciosPreciosSinRangosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_tipo_precioProductosServiciosPreciosSinRangosBusqueda")) {
				this.jButtoncodigo_tipo_precioProductosServiciosPreciosSinRangosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioProductosServiciosPreciosSinRangosBusqueda")) {
				this.jButtonprecioProductosServiciosPreciosSinRangosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos")) {
				this.jButtonBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangosActionPerformed(evt);
			}
			
			;
			
			
			ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProductosServiciosPreciosSinRangos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosServiciosPreciosSinRangosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciospreciossinrangos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosserviciospreciossinrangos);
				
				ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
				
				


				
				ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosServiciosPreciosSinRangos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosServiciosPreciosSinRangos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosLocal=null;
			
			if(!this.getEsControlTabla()) {
				productosserviciospreciossinrangosLocal=this.productosserviciospreciossinrangos;
			} else {
				productosserviciospreciossinrangosLocal=this.productosserviciospreciossinrangosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciospreciossinrangos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosserviciospreciossinrangos);
				
				ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
							
				
				


				
				ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosServiciosPreciosSinRangos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosServiciosPreciosSinRangos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosServiciosPreciosSinRangosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosAnterior =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosserviciospreciossinrangosAnterior =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
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
			
			ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
			
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
			
			


			
			ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosServiciosPreciosSinRangosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciospreciossinrangos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosserviciospreciossinrangos);
				
				ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
								
						
				


				
				ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosServiciosPreciosSinRangos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosServiciosPreciosSinRangos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciospreciossinrangos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosserviciospreciossinrangos);
				
				ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
								
				
				


				
				ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosServiciosPreciosSinRangos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosServiciosPreciosSinRangos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosServiciosPreciosSinRangosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosAnterior =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosserviciospreciossinrangosAnterior =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciospreciossinrangos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosserviciospreciossinrangos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosServiciosPreciosSinRangosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosAnterior =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosserviciospreciossinrangosAnterior =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosServiciosPreciosSinRangosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciospreciossinrangos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productosserviciospreciossinrangos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciospreciossinrangos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosserviciospreciossinrangos);
				
				ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
							
				
				


				
				ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosServiciosPreciosSinRangos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosServiciosPreciosSinRangos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosServiciosPreciosSinRangosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciospreciossinrangosAnterior =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productosserviciospreciossinrangosAnterior =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
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
			
			ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
			
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
			
			


			
			ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosServiciosPreciosSinRangosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciospreciossinrangos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productosserviciospreciossinrangos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciospreciossinrangos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosserviciospreciossinrangos);
				
				ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
								
				
				


				
				ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosServiciosPreciosSinRangos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosServiciosPreciosSinRangos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosServiciosPreciosSinRangosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosAnterior =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosserviciospreciossinrangosAnterior =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosServiciosPreciosSinRangosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciospreciossinrangos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productosserviciospreciossinrangos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosServiciosPreciosSinRangosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciospreciossinrangos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosserviciospreciossinrangos);
				
				ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProductosServiciosPreciosSinRangos")) {
					jCheckBoxSeleccionarTodosProductosServiciosPreciosSinRangosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProductosServiciosPreciosSinRangos")) {
					jCheckBoxSeleccionadosProductosServiciosPreciosSinRangosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProductosServiciosPreciosSinRangos")) {
					
				}
				
				


				
				
				ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosServiciosPreciosSinRangos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosServiciosPreciosSinRangos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciospreciossinrangos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.productosserviciospreciossinrangos);
				
				ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
												
				
				


				
				
				ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosServiciosPreciosSinRangos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosServiciosPreciosSinRangos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosServiciosPreciosSinRangosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciospreciossinrangosAnterior =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productosserviciospreciossinrangosAnterior =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosServiciosPreciosSinRangosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciospreciossinrangos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosserviciospreciossinrangos);
				
				ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
				
				
				ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
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
			
			ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
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
			
			


			
			ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosServiciosPreciosSinRangosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciospreciossinrangos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosserviciospreciossinrangos);
				
				ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosServiciosPreciosSinRangos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosServiciosPreciosSinRangos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciospreciossinrangos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosserviciospreciossinrangos);
				
				ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
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
				
				


				
				ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosServiciosPreciosSinRangos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosServiciosPreciosSinRangos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosServiciosPreciosSinRangosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciospreciossinrangosAnterior =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosserviciospreciossinrangosAnterior =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProductosServiciosPreciosSinRangos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProductosServiciosPreciosSinRangosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.productosserviciospreciossinrangos =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.productosserviciospreciossinrangos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProductosServiciosPreciosSinRangos")) {
				
				}
				
				ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProductosServiciosPreciosSinRangos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProductosServiciosPreciosSinRangos")) {
			
			}
			
			ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProductosServiciosPreciosSinRangos();
			
			ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
			
			if(sTipo.equals("NuevoProductosServiciosPreciosSinRangos")) {
				jButtonNuevoProductosServiciosPreciosSinRangosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProductosServiciosPreciosSinRangos")) {
				jButtonDuplicarProductosServiciosPreciosSinRangosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProductosServiciosPreciosSinRangos")) {
				jButtonCopiarProductosServiciosPreciosSinRangosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProductosServiciosPreciosSinRangos")) {
				jButtonVerFormProductosServiciosPreciosSinRangosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProductosServiciosPreciosSinRangos")) {
				jButtonNuevoProductosServiciosPreciosSinRangosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProductosServiciosPreciosSinRangos")) {
				jButtonModificarProductosServiciosPreciosSinRangosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProductosServiciosPreciosSinRangos")) {
				jButtonActualizarProductosServiciosPreciosSinRangosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProductosServiciosPreciosSinRangos")) {
				jButtonEliminarProductosServiciosPreciosSinRangosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProductosServiciosPreciosSinRangos")) {
				jButtonGuardarCambiosProductosServiciosPreciosSinRangosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProductosServiciosPreciosSinRangos")) {
				jButtonCancelarProductosServiciosPreciosSinRangosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProductosServiciosPreciosSinRangos")) {
				jButtonCerrarProductosServiciosPreciosSinRangosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProductosServiciosPreciosSinRangos")) {
				jButtonGuardarCambiosProductosServiciosPreciosSinRangosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProductosServiciosPreciosSinRangos")) {
				jButtonNuevoGuardarCambiosProductosServiciosPreciosSinRangosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProductosServiciosPreciosSinRangos")) {
				jButtonAbrirOrderByProductosServiciosPreciosSinRangosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProductosServiciosPreciosSinRangos")) {
				jButtonRecargarInformacionProductosServiciosPreciosSinRangosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProductosServiciosPreciosSinRangos")) {
				jButtonAnterioresProductosServiciosPreciosSinRangosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProductosServiciosPreciosSinRangos")) {
				jButtonSiguientesProductosServiciosPreciosSinRangosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductosServiciosPreciosSinRangosBusqueda")) {
				this.jButtonidProductosServiciosPreciosSinRangosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProductosServiciosPreciosSinRangosUpdate")) {
				this.jButtonid_empresaProductosServiciosPreciosSinRangosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProductosServiciosPreciosSinRangosBusqueda")) {
				this.jButtonid_empresaProductosServiciosPreciosSinRangosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProductosServiciosPreciosSinRangosUpdate")) {
				this.jButtonid_sucursalProductosServiciosPreciosSinRangosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProductosServiciosPreciosSinRangosBusqueda")) {
				this.jButtonid_sucursalProductosServiciosPreciosSinRangosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaProductosServiciosPreciosSinRangosUpdate")) {
				this.jButtonid_bodegaProductosServiciosPreciosSinRangosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaProductosServiciosPreciosSinRangosBusqueda")) {
				this.jButtonid_bodegaProductosServiciosPreciosSinRangosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaProductosServiciosPreciosSinRangosUpdate")) {
				this.jButtonid_lineaProductosServiciosPreciosSinRangosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaProductosServiciosPreciosSinRangosBusqueda")) {
				this.jButtonid_lineaProductosServiciosPreciosSinRangosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoProductosServiciosPreciosSinRangosUpdate")) {
				this.jButtonid_linea_grupoProductosServiciosPreciosSinRangosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoProductosServiciosPreciosSinRangosBusqueda")) {
				this.jButtonid_linea_grupoProductosServiciosPreciosSinRangosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaProductosServiciosPreciosSinRangosUpdate")) {
				this.jButtonid_linea_categoriaProductosServiciosPreciosSinRangosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaProductosServiciosPreciosSinRangosBusqueda")) {
				this.jButtonid_linea_categoriaProductosServiciosPreciosSinRangosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaProductosServiciosPreciosSinRangosUpdate")) {
				this.jButtonid_linea_marcaProductosServiciosPreciosSinRangosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaProductosServiciosPreciosSinRangosBusqueda")) {
				this.jButtonid_linea_marcaProductosServiciosPreciosSinRangosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sucursalProductosServiciosPreciosSinRangosBusqueda")) {
				this.jButtonnombre_sucursalProductosServiciosPreciosSinRangosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoProductosServiciosPreciosSinRangosBusqueda")) {
				this.jButtoncodigoProductosServiciosPreciosSinRangosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreProductosServiciosPreciosSinRangosBusqueda")) {
				this.jButtonnombreProductosServiciosPreciosSinRangosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bodegaProductosServiciosPreciosSinRangosBusqueda")) {
				this.jButtonnombre_bodegaProductosServiciosPreciosSinRangosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadProductosServiciosPreciosSinRangosBusqueda")) {
				this.jButtonnombre_unidadProductosServiciosPreciosSinRangosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_tipo_precioProductosServiciosPreciosSinRangosBusqueda")) {
				this.jButtoncodigo_tipo_precioProductosServiciosPreciosSinRangosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioProductosServiciosPreciosSinRangosBusqueda")) {
				this.jButtonprecioProductosServiciosPreciosSinRangosBusquedaActionPerformed(evt);
			}
			
			ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProductosServiciosPreciosSinRangos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProductosServiciosPreciosSinRangos")) {
				closingInternalFrameProductosServiciosPreciosSinRangos();
				
			} else if(sTipo.equals("jButtonCancelarProductosServiciosPreciosSinRangos")) {
				JInternalFrameBase jInternalFrameDetalleFormProductosServiciosPreciosSinRangos = (JInternalFrameBase)evt.getSource();
	            	
	            ProductosServiciosPreciosSinRangosBeanSwingJInternalFrame jInternalFrameParent=(ProductosServiciosPreciosSinRangosBeanSwingJInternalFrame)jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProductosServiciosPreciosSinRangosActionPerformed(null);
			}
			
			ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productosserviciospreciossinrangos,new Object(),this.productosserviciospreciossinrangosParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProductosServiciosPreciosSinRangos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProductosServiciosPreciosSinRangos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProductosServiciosPreciosSinRangos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.productosserviciospreciossinrangos)) {
			if(!esControlTabla) {
				if(ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);			
				}
				
				if(this.productosserviciospreciossinrangosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangosReturnGeneral,this.productosserviciospreciossinrangosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.productosserviciospreciossinrangosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProductosServiciosPreciosSinRangos(classes,this.productosserviciospreciossinrangosReturnGeneral,this.productosserviciospreciossinrangosBean,false);
					}
						
					if(this.productosserviciospreciossinrangosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangosReturnGeneral.getProductosServiciosPreciosSinRangos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangosReturnGeneral.getProductosServiciosPreciosSinRangos());	
					}
						
					if(this.productosserviciospreciossinrangosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangosReturnGeneral.getProductosServiciosPreciosSinRangos(),classes);//this.productosserviciospreciossinrangosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos,classes);//this.productosserviciospreciossinrangosBean);									
				}
			
				if(ProductosServiciosPreciosSinRangosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosPreciosSinRangos(this.productosserviciospreciossinrangos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.productosserviciospreciossinrangosAnterior!=null) {
						this.productosserviciospreciossinrangos=this.productosserviciospreciossinrangosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productosserviciospreciossinrangosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.productosserviciospreciossinrangosReturnGeneral.getProductosServiciosPreciosSinRangos(),productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.productosserviciospreciossinrangosReturnGeneral.getProductosServiciosPreciosSinRangos(),this.productosserviciospreciossinrangoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProductosServiciosPreciosSinRangos.repaint();
				
				//((AbstractTableModel) this.jTableDatosProductosServiciosPreciosSinRangos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProductosServiciosPreciosSinRangos();
			}
		}
	}
	
	public void actualizarVisualTableDatosProductosServiciosPreciosSinRangos() throws Exception {
		
		ProductosServiciosPreciosSinRangosModel productosserviciospreciossinrangosModel=(ProductosServiciosPreciosSinRangosModel)this.jTableDatosProductosServiciosPreciosSinRangos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productosserviciospreciossinrangosModel.productosserviciospreciossinrangoss=this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			productosserviciospreciossinrangosModel.productosserviciospreciossinrangoss=this.productosserviciospreciossinrangoss;
		}
		
		
		((ProductosServiciosPreciosSinRangosModel) this.jTableDatosProductosServiciosPreciosSinRangos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProductosServiciosPreciosSinRangos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getproductosserviciospreciossinrangosAnterior(),this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getproductosserviciospreciossinrangosAnterior(),this.productosserviciospreciossinrangoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProductosServiciosPreciosSinRangos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProductosServiciosPreciosSinRangos(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
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
										
				ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productosserviciospreciossinrangos,new Object(),generalEntityParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.productosserviciospreciossinrangosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProductosServiciosPreciosSinRangosConstantesFunciones.getClassesRelationshipsOfProductosServiciosPreciosSinRangos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProductosServiciosPreciosSinRangosConstantesFunciones.getClassesRelationshipsFromStringsOfProductosServiciosPreciosSinRangos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProductosServiciosPreciosSinRangos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productosserviciospreciossinrangos,new Object(),generalEntityParameterGeneral,this.productosserviciospreciossinrangosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProductosServiciosPreciosSinRangos(ProductosServiciosPreciosSinRangosBean productosserviciospreciossinrangosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProductosServiciosPreciosSinRangos(ArrayList<Classe> classes,ProductosServiciosPreciosSinRangosReturnGeneral productosserviciospreciossinrangosReturnGeneral,ProductosServiciosPreciosSinRangosBean productosserviciospreciossinrangosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProductosServiciosPreciosSinRangos(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.productosserviciospreciossinrangos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos = new ProductosServiciosPreciosSinRangosDetalleFormJInternalFrame(jDesktopPane,this.productosserviciospreciossinrangosSessionBean.getConGuardarRelaciones(),this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.setVisible(false);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.setSelected(false);						
		
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.productosserviciospreciossinrangosLogic=this.productosserviciospreciossinrangosLogic;
		
		this.cargarCombosFrameForeignKeyProductosServiciosPreciosSinRangos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProductosServiciosPreciosSinRangos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductosServiciosPreciosSinRangos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProductosServiciosPreciosSinRangos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProductosServiciosPreciosSinRangos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductosServiciosPreciosSinRangos"));
		
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonModificarProductosServiciosPreciosSinRangos.addActionListener(new ButtonActionListener(this,"ModificarProductosServiciosPreciosSinRangos"));

		
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonModificarToolBarProductosServiciosPreciosSinRangos.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductosServiciosPreciosSinRangos"));
					
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jMenuItemModificarProductosServiciosPreciosSinRangos.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductosServiciosPreciosSinRangos"));		
		
		
		
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonActualizarProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"ActualizarProductosServiciosPreciosSinRangos"));
		
		
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonActualizarToolBarProductosServiciosPreciosSinRangos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductosServiciosPreciosSinRangos"));
						
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jMenuItemActualizarProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductosServiciosPreciosSinRangos"));		
		
		
		
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonEliminarProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"EliminarProductosServiciosPreciosSinRangos"));
		
		
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonEliminarToolBarProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductosServiciosPreciosSinRangos"));
								
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jMenuItemEliminarProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductosServiciosPreciosSinRangos"));		
		
		
		
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonCancelarProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"CancelarProductosServiciosPreciosSinRangos"));
		
		
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonCancelarToolBarProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductosServiciosPreciosSinRangos"));
					
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jMenuItemCancelarProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductosServiciosPreciosSinRangos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jMenuItemDetalleCerrarProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductosServiciosPreciosSinRangos"));		
		
		
		
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonGuardarCambiosToolBarProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductosServiciosPreciosSinRangos"));
		
		
		
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonGuardarCambiosToolBarProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductosServiciosPreciosSinRangos"));
		
		
		
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxTiposAccionesFormularioProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductosServiciosPreciosSinRangos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonidProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"idProductosServiciosPreciosSinRangosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_empresaProductosServiciosPreciosSinRangosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductosServiciosPreciosSinRangosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_empresaProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductosServiciosPreciosSinRangosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_sucursalProductosServiciosPreciosSinRangosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductosServiciosPreciosSinRangosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_sucursalProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductosServiciosPreciosSinRangosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_bodegaProductosServiciosPreciosSinRangosUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProductosServiciosPreciosSinRangosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_bodegaProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProductosServiciosPreciosSinRangosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_lineaProductosServiciosPreciosSinRangosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaProductosServiciosPreciosSinRangosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_lineaProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaProductosServiciosPreciosSinRangosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_linea_grupoProductosServiciosPreciosSinRangosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoProductosServiciosPreciosSinRangosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_linea_grupoProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoProductosServiciosPreciosSinRangosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_linea_categoriaProductosServiciosPreciosSinRangosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProductosServiciosPreciosSinRangosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_linea_categoriaProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProductosServiciosPreciosSinRangosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_linea_marcaProductosServiciosPreciosSinRangosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaProductosServiciosPreciosSinRangosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_linea_marcaProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaProductosServiciosPreciosSinRangosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonnombre_sucursalProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalProductosServiciosPreciosSinRangosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtoncodigoProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"codigoProductosServiciosPreciosSinRangosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonnombreProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"nombreProductosServiciosPreciosSinRangosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonnombre_bodegaProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodegaProductosServiciosPreciosSinRangosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonnombre_unidadProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadProductosServiciosPreciosSinRangosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtoncodigo_tipo_precioProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_tipo_precioProductosServiciosPreciosSinRangosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonprecioProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"precioProductosServiciosPreciosSinRangosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTabbedPaneRelacionesProductosServiciosPreciosSinRangos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductosServiciosPreciosSinRangos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProductosServiciosPreciosSinRangos"));
		
		if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductosServiciosPreciosSinRangos"));
		}
		
		this.jTableDatosProductosServiciosPreciosSinRangos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProductosServiciosPreciosSinRangos"));
		
		this.jTableDatosProductosServiciosPreciosSinRangos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProductosServiciosPreciosSinRangos"));
		
		this.jButtonNuevoProductosServiciosPreciosSinRangos.addActionListener(new ButtonActionListener(this,"NuevoProductosServiciosPreciosSinRangos"));
		
		this.jButtonDuplicarProductosServiciosPreciosSinRangos.addActionListener(new ButtonActionListener(this,"DuplicarProductosServiciosPreciosSinRangos"));
		
		this.jButtonCopiarProductosServiciosPreciosSinRangos.addActionListener(new ButtonActionListener(this,"CopiarProductosServiciosPreciosSinRangos"));
		
		this.jButtonVerFormProductosServiciosPreciosSinRangos.addActionListener(new ButtonActionListener(this,"VerFormProductosServiciosPreciosSinRangos"));
		
		
		this.jButtonNuevoToolBarProductosServiciosPreciosSinRangos.addActionListener(new ButtonActionListener(this,"NuevoToolBarProductosServiciosPreciosSinRangos"));
			
		this.jButtonDuplicarToolBarProductosServiciosPreciosSinRangos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProductosServiciosPreciosSinRangos"));
			
		this.jMenuItemNuevoProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProductosServiciosPreciosSinRangos"));
			
		this.jMenuItemDuplicarProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProductosServiciosPreciosSinRangos"));		
		
		
		this.jButtonNuevoRelacionesProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProductosServiciosPreciosSinRangos"));
		
		
		this.jButtonNuevoRelacionesToolBarProductosServiciosPreciosSinRangos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProductosServiciosPreciosSinRangos"));
			
		this.jMenuItemNuevoRelacionesProductosServiciosPreciosSinRangos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProductosServiciosPreciosSinRangos"));		
		
		
		if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonModificarProductosServiciosPreciosSinRangos.addActionListener(new ButtonActionListener(this,"ModificarProductosServiciosPreciosSinRangos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonModificarToolBarProductosServiciosPreciosSinRangos.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductosServiciosPreciosSinRangos"));
			
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jMenuItemModificarProductosServiciosPreciosSinRangos.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductosServiciosPreciosSinRangos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonActualizarProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"ActualizarProductosServiciosPreciosSinRangos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonActualizarToolBarProductosServiciosPreciosSinRangos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductosServiciosPreciosSinRangos"));
				
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jMenuItemActualizarProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductosServiciosPreciosSinRangos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonEliminarProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"EliminarProductosServiciosPreciosSinRangos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonEliminarToolBarProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductosServiciosPreciosSinRangos"));
						
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jMenuItemEliminarProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductosServiciosPreciosSinRangos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonCancelarProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"CancelarProductosServiciosPreciosSinRangos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonCancelarToolBarProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductosServiciosPreciosSinRangos"));
			
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jMenuItemCancelarProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductosServiciosPreciosSinRangos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProductosServiciosPreciosSinRangos"));		
		
		
		this.jButtonCerrarProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"CerrarProductosServiciosPreciosSinRangos"));
		
		
		this.jButtonCerrarToolBarProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"CerrarToolBarProductosServiciosPreciosSinRangos"));
			
		this.jMenuItemCerrarProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProductosServiciosPreciosSinRangos"));
			
		if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jMenuItemDetalleCerrarProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductosServiciosPreciosSinRangos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonGuardarCambiosProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"GuardarCambiosProductosServiciosPreciosSinRangos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonGuardarCambiosToolBarProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductosServiciosPreciosSinRangos"));
		}
		
		this.jButtonCopiarToolBarProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"CopiarToolBarProductosServiciosPreciosSinRangos"));
			
		this.jButtonVerFormToolBarProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"VerFormToolBarProductosServiciosPreciosSinRangos"));
		
		this.jMenuItemGuardarCambiosProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProductosServiciosPreciosSinRangos"));
			
		this.jMenuItemCopiarProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProductosServiciosPreciosSinRangos"));		
		
		this.jMenuItemVerFormProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProductosServiciosPreciosSinRangos"));		
		
		
		this.jButtonGuardarCambiosTablaProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductosServiciosPreciosSinRangos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProductosServiciosPreciosSinRangos"));
			
		this.jMenuItemGuardarCambiosTablaProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductosServiciosPreciosSinRangos"));		
		
		
		
		this.jButtonRecargarInformacionProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"RecargarInformacionProductosServiciosPreciosSinRangos"));
					
		this.jButtonRecargarInformacionToolBarProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProductosServiciosPreciosSinRangos"));
		
		this.jMenuItemRecargarInformacionProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProductosServiciosPreciosSinRangos"));		
		
		
		
		this.jButtonAnterioresProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"AnterioresProductosServiciosPreciosSinRangos"));
		
		
		this.jButtonAnterioresToolBarProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProductosServiciosPreciosSinRangos"));
		
		this.jMenuItemAnterioresProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProductosServiciosPreciosSinRangos"));		
		
		
		this.jButtonSiguientesProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"SiguientesProductosServiciosPreciosSinRangos"));
		
		
		this.jButtonSiguientesToolBarProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProductosServiciosPreciosSinRangos"));
			
		this.jMenuItemSiguientesProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProductosServiciosPreciosSinRangos"));
			
		this.jMenuItemAbrirOrderByProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProductosServiciosPreciosSinRangos"));
			
		this.jMenuItemMostrarOcultarProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProductosServiciosPreciosSinRangos"));
			
		this.jMenuItemDetalleAbrirOrderByProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProductosServiciosPreciosSinRangos"));
			
		this.jMenuItemDetalleMostarOcultarProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProductosServiciosPreciosSinRangos"));		
		
		
		this.jButtonNuevoGuardarCambiosProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProductosServiciosPreciosSinRangos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProductosServiciosPreciosSinRangos"));
			
		this.jMenuItemNuevoGuardarCambiosProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProductosServiciosPreciosSinRangos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProductosServiciosPreciosSinRangos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProductosServiciosPreciosSinRangos"));

		this.jCheckBoxSeleccionadosProductosServiciosPreciosSinRangos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProductosServiciosPreciosSinRangos"));
		
		if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxTiposAccionesFormularioProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductosServiciosPreciosSinRangos"));
		}
		
		
		this.jComboBoxTiposRelacionesProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"TiposRelacionesProductosServiciosPreciosSinRangos"));
			
		this.jComboBoxTiposAccionesProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"TiposAccionesProductosServiciosPreciosSinRangos"));
					
		this.jComboBoxTiposSeleccionarProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProductosServiciosPreciosSinRangos"));
			
		this.jTextFieldValorCampoGeneralProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProductosServiciosPreciosSinRangos"));		
		
		
		if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonidProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"idProductosServiciosPreciosSinRangosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_empresaProductosServiciosPreciosSinRangosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductosServiciosPreciosSinRangosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_empresaProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductosServiciosPreciosSinRangosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_sucursalProductosServiciosPreciosSinRangosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductosServiciosPreciosSinRangosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_sucursalProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductosServiciosPreciosSinRangosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_bodegaProductosServiciosPreciosSinRangosUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProductosServiciosPreciosSinRangosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_bodegaProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProductosServiciosPreciosSinRangosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_lineaProductosServiciosPreciosSinRangosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaProductosServiciosPreciosSinRangosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_lineaProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaProductosServiciosPreciosSinRangosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_linea_grupoProductosServiciosPreciosSinRangosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoProductosServiciosPreciosSinRangosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_linea_grupoProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoProductosServiciosPreciosSinRangosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_linea_categoriaProductosServiciosPreciosSinRangosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProductosServiciosPreciosSinRangosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_linea_categoriaProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProductosServiciosPreciosSinRangosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_linea_marcaProductosServiciosPreciosSinRangosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaProductosServiciosPreciosSinRangosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_linea_marcaProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaProductosServiciosPreciosSinRangosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonnombre_sucursalProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalProductosServiciosPreciosSinRangosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtoncodigoProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"codigoProductosServiciosPreciosSinRangosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonnombreProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"nombreProductosServiciosPreciosSinRangosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonnombre_bodegaProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodegaProductosServiciosPreciosSinRangosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonnombre_unidadProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadProductosServiciosPreciosSinRangosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtoncodigo_tipo_precioProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_tipo_precioProductosServiciosPreciosSinRangosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonprecioProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"precioProductosServiciosPreciosSinRangosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.addActionListener(new ButtonActionListener(this,"BusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos!=null) {
				this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductosServiciosPreciosSinRangos"));
				this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductosServiciosPreciosSinRangos"));
				this.jInternalFrameReporteDinamicoProductosServiciosPreciosSinRangos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductosServiciosPreciosSinRangos"));
			}
			
			//this.jButtonCerrarReporteDinamicoProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductosServiciosPreciosSinRangos"));				
			//this.jButtonGenerarReporteDinamicoProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductosServiciosPreciosSinRangos"));
			//this.jButtonGenerarExcelReporteDinamicoProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductosServiciosPreciosSinRangos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProductosServiciosPreciosSinRangos!=null) {
				this.jInternalFrameImportacionProductosServiciosPreciosSinRangos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductosServiciosPreciosSinRangos"));
				this.jInternalFrameImportacionProductosServiciosPreciosSinRangos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductosServiciosPreciosSinRangos"));
				this.jInternalFrameImportacionProductosServiciosPreciosSinRangos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductosServiciosPreciosSinRangos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"AbrirOrderByProductosServiciosPreciosSinRangos"));
			
			this.jButtonAbrirOrderByToolBarProductosServiciosPreciosSinRangos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProductosServiciosPreciosSinRangos"));			
			
			if(this.jInternalFrameOrderByProductosServiciosPreciosSinRangos!=null) {
				this.jInternalFrameOrderByProductosServiciosPreciosSinRangos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductosServiciosPreciosSinRangos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTabbedPaneRelacionesProductosServiciosPreciosSinRangos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductosServiciosPreciosSinRangos"));
		
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
            		closingInternalFrameProductosServiciosPreciosSinRangos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProductosServiciosPreciosSinRangos = (JInternalFrameBase)event.getSource();
	            	
	            ProductosServiciosPreciosSinRangosBeanSwingJInternalFrame jInternalFrameParent=(ProductosServiciosPreciosSinRangosBeanSwingJInternalFrame)jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProductosServiciosPreciosSinRangosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProductosServiciosPreciosSinRangos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProductosServiciosPreciosSinRangosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProductosServiciosPreciosSinRangos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProductosServiciosPreciosSinRangos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosServiciosPreciosSinRangosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosServiciosPreciosSinRangosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosServiciosPreciosSinRangosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProductosServiciosPreciosSinRangos";
		inputMap = this.jButtonNuevoProductosServiciosPreciosSinRangos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProductosServiciosPreciosSinRangos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductosServiciosPreciosSinRangosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosServiciosPreciosSinRangosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosServiciosPreciosSinRangosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosServiciosPreciosSinRangosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProductosServiciosPreciosSinRangos";
		inputMap = this.jButtonNuevoRelacionesProductosServiciosPreciosSinRangos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProductosServiciosPreciosSinRangos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductosServiciosPreciosSinRangosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductosServiciosPreciosSinRangosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductosServiciosPreciosSinRangosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductosServiciosPreciosSinRangosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProductosServiciosPreciosSinRangos";
		inputMap = this.jButtonModificarProductosServiciosPreciosSinRangos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProductosServiciosPreciosSinRangos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProductosServiciosPreciosSinRangosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductosServiciosPreciosSinRangosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductosServiciosPreciosSinRangosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductosServiciosPreciosSinRangosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProductosServiciosPreciosSinRangos";
		inputMap = this.jButtonActualizarProductosServiciosPreciosSinRangos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProductosServiciosPreciosSinRangos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProductosServiciosPreciosSinRangosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductosServiciosPreciosSinRangosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductosServiciosPreciosSinRangosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductosServiciosPreciosSinRangosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProductosServiciosPreciosSinRangos";
		inputMap = this.jButtonEliminarProductosServiciosPreciosSinRangos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProductosServiciosPreciosSinRangos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProductosServiciosPreciosSinRangosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductosServiciosPreciosSinRangosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductosServiciosPreciosSinRangosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductosServiciosPreciosSinRangosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProductosServiciosPreciosSinRangos";
		inputMap = this.jButtonCancelarProductosServiciosPreciosSinRangos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProductosServiciosPreciosSinRangos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProductosServiciosPreciosSinRangosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductosServiciosPreciosSinRangosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductosServiciosPreciosSinRangosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductosServiciosPreciosSinRangosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProductosServiciosPreciosSinRangosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProductosServiciosPreciosSinRangosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProductosServiciosPreciosSinRangos";
		inputMap = this.jButtonCerrarProductosServiciosPreciosSinRangos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProductosServiciosPreciosSinRangos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProductosServiciosPreciosSinRangosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonGuardarCambiosProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosServiciosPreciosSinRangosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosServiciosPreciosSinRangosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosServiciosPreciosSinRangosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosServiciosPreciosSinRangosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosServiciosPreciosSinRangosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosServiciosPreciosSinRangosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProductosServiciosPreciosSinRangos";
		inputMap = this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonGuardarCambiosProductosServiciosPreciosSinRangos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonGuardarCambiosProductosServiciosPreciosSinRangos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProductosServiciosPreciosSinRangosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductosServiciosPreciosSinRangosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductosServiciosPreciosSinRangosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductosServiciosPreciosSinRangosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductosServiciosPreciosSinRangosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductosServiciosPreciosSinRangosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductosServiciosPreciosSinRangosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductosServiciosPreciosSinRangosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductosServiciosPreciosSinRangosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductosServiciosPreciosSinRangosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductosServiciosPreciosSinRangosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductosServiciosPreciosSinRangosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductosServiciosPreciosSinRangosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProductosServiciosPreciosSinRangos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProductosServiciosPreciosSinRangosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProductosServiciosPreciosSinRangos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProductosServiciosPreciosSinRangosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProductosServiciosPreciosSinRangos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProductosServiciosPreciosSinRangosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProductosServiciosPreciosSinRangos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProductosServiciosPreciosSinRangosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonidProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"idProductosServiciosPreciosSinRangosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_empresaProductosServiciosPreciosSinRangosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductosServiciosPreciosSinRangosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_empresaProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductosServiciosPreciosSinRangosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_sucursalProductosServiciosPreciosSinRangosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductosServiciosPreciosSinRangosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_sucursalProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductosServiciosPreciosSinRangosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_bodegaProductosServiciosPreciosSinRangosUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProductosServiciosPreciosSinRangosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_bodegaProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProductosServiciosPreciosSinRangosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_lineaProductosServiciosPreciosSinRangosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaProductosServiciosPreciosSinRangosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_lineaProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaProductosServiciosPreciosSinRangosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_linea_grupoProductosServiciosPreciosSinRangosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoProductosServiciosPreciosSinRangosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_linea_grupoProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoProductosServiciosPreciosSinRangosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_linea_categoriaProductosServiciosPreciosSinRangosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProductosServiciosPreciosSinRangosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_linea_categoriaProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProductosServiciosPreciosSinRangosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_linea_marcaProductosServiciosPreciosSinRangosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaProductosServiciosPreciosSinRangosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonid_linea_marcaProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaProductosServiciosPreciosSinRangosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonnombre_sucursalProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalProductosServiciosPreciosSinRangosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtoncodigoProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"codigoProductosServiciosPreciosSinRangosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonnombreProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"nombreProductosServiciosPreciosSinRangosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonnombre_bodegaProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodegaProductosServiciosPreciosSinRangosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonnombre_unidadProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadProductosServiciosPreciosSinRangosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtoncodigo_tipo_precioProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_tipo_precioProductosServiciosPreciosSinRangosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jButtonprecioProductosServiciosPreciosSinRangosBusqueda.addActionListener(new ButtonActionListener(this,"precioProductosServiciosPreciosSinRangosBusqueda"));
		
		
		this.jButtonBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos.addActionListener(new ButtonActionListener(this,"BusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProductosServiciosPreciosSinRangosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProductosServiciosPreciosSinRangosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProductosServiciosPreciosSinRangosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProductosServiciosPreciosSinRangosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProductosServiciosPreciosSinRangosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProductosServiciosPreciosSinRangos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProductosServiciosPreciosSinRangosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProductosServiciosPreciosSinRangosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProductosServiciosPreciosSinRangos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProductosServiciosPreciosSinRangos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosAux:this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss()) {
					productosserviciospreciossinrangosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosAux:productosserviciospreciossinrangoss) {
					productosserviciospreciossinrangosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProductosServiciosPreciosSinRangosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosAux:this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss()) {
						productosserviciospreciossinrangosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosAux:productosserviciospreciossinrangoss) {
						productosserviciospreciossinrangosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosAux:this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosAux:productosserviciospreciossinrangoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProductosServiciosPreciosSinRangos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductosServiciosPreciosSinRangos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductosServiciosPreciosSinRangos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosPreciosSinRangos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProductosServiciosPreciosSinRangosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProductosServiciosPreciosSinRangos.getSelectedRows();
			
			ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosLocal=new ProductosServiciosPreciosSinRangos();
			
			//this.seleccionarTodosProductosServiciosPreciosSinRangos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productosserviciospreciossinrangosLocal =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss().toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					productosserviciospreciossinrangosLocal =(ProductosServiciosPreciosSinRangos) this.productosserviciospreciossinrangoss.toArray()[this.jTableDatosProductosServiciosPreciosSinRangos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				productosserviciospreciossinrangosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosAux:this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss()) {
						productosserviciospreciossinrangosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosAux:productosserviciospreciossinrangoss) {
						productosserviciospreciossinrangosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProductosServiciosPreciosSinRangos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductosServiciosPreciosSinRangos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductosServiciosPreciosSinRangos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosPreciosSinRangos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProductosServiciosPreciosSinRangosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProductosServiciosPreciosSinRangosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProductosServiciosPreciosSinRangosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProductosServiciosPreciosSinRangos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosAux:this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss()) {
				
						if(sTipoSeleccionar.equals(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
							existe=true;
							productosserviciospreciossinrangosAux.setnombre_sucursal(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							productosserviciospreciossinrangosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							productosserviciospreciossinrangosAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBREBODEGA)) {
							existe=true;
							productosserviciospreciossinrangosAux.setnombre_bodega(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							productosserviciospreciossinrangosAux.setnombre_unidad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_CODIGOTIPOPRECIO)) {
							existe=true;
							productosserviciospreciossinrangosAux.setcodigo_tipo_precio(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							productosserviciospreciossinrangosAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosAux:productosserviciospreciossinrangoss) {
					
						if(sTipoSeleccionar.equals(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
							existe=true;
							productosserviciospreciossinrangosAux.setnombre_sucursal(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							productosserviciospreciossinrangosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							productosserviciospreciossinrangosAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBREBODEGA)) {
							existe=true;
							productosserviciospreciossinrangosAux.setnombre_bodega(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							productosserviciospreciossinrangosAux.setnombre_unidad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_CODIGOTIPOPRECIO)) {
							existe=true;
							productosserviciospreciossinrangosAux.setcodigo_tipo_precio(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							productosserviciospreciossinrangosAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProductosServiciosPreciosSinRangos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProductosServiciosPreciosSinRangosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProductosServiciosPreciosSinRangos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProductosServiciosPreciosSinRangos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxTiposAccionesFormularioProductosServiciosPreciosSinRangos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProductosServiciosPreciosSinRangos) {				
					conSplash=true;//false;										
					
					//this.startProcessProductosServiciosPreciosSinRangos(conSplash);
				
					this.generarReporteProductosServiciosPreciosSinRangossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductosServiciosPreciosSinRangos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxTiposAccionesFormularioProductosServiciosPreciosSinRangos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProductosServiciosPreciosSinRangossSeleccionados();
				//this.jComboBoxTiposAccionesProductosServiciosPreciosSinRangos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductosServiciosPreciosSinRangossSeleccionados(false);
				//this.jComboBoxTiposAccionesProductosServiciosPreciosSinRangos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductosServiciosPreciosSinRangossSeleccionados(true);
				//this.jComboBoxTiposAccionesProductosServiciosPreciosSinRangos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductosServiciosPreciosSinRangos();
				
				this.exportarProductosServiciosPreciosSinRangossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductosServiciosPreciosSinRangos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxTiposAccionesFormularioProductosServiciosPreciosSinRangos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProductosServiciosPreciosSinRangoss();
				//this.importarProductosServiciosPreciosSinRangoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductosServiciosPreciosSinRangos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxTiposAccionesFormularioProductosServiciosPreciosSinRangos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductosServiciosPreciosSinRangos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProductosServiciosPreciosSinRangossSeleccionados();
				//this.jComboBoxTiposAccionesProductosServiciosPreciosSinRangos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Productos Servicios Precios Sin Rangos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProductosServiciosPreciosSinRangos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProductosServiciosPreciosSinRangos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProductosServiciosPreciosSinRangos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Productos Servicios Precios Sin Rangos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductosServiciosPreciosSinRangos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxTiposAccionesFormularioProductosServiciosPreciosSinRangos.setSelectedIndex(0);					
				}	
			} 			
			else if(ProductosServiciosPreciosSinRangosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProductosServiciosPreciosSinRangos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProductosServiciosPreciosSinRangos(conSplash);
					
						//this.actualizarParametrosGeneralProductosServiciosPreciosSinRangos();
						
						this.generarReporteProcesoAccionProductosServiciosPreciosSinRangossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProductosServiciosPreciosSinRangos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxTiposAccionesFormularioProductosServiciosPreciosSinRangos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Productos Servicios Precios Sin RangosES SELECCIONADOS?", "MANTENIMIENTO DE Productos Servicios Precios Sin Rangos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProductosServiciosPreciosSinRangos();
				
						this.actualizarParametrosGeneralProductosServiciosPreciosSinRangos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.productosserviciospreciossinrangosReturnGeneral=productosserviciospreciossinrangosLogic.procesarAccionProductosServiciosPreciosSinRangossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss(),this.productosserviciospreciossinrangosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProductosServiciosPreciosSinRangosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductosServiciosPreciosSinRangos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxTiposAccionesFormularioProductosServiciosPreciosSinRangos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProductosServiciosPreciosSinRangos();
					
					ProductosServiciosPreciosSinRangosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProductosServiciosPreciosSinRangosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductosServiciosPreciosSinRangos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxTiposAccionesFormularioProductosServiciosPreciosSinRangos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProductosServiciosPreciosSinRangos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProductosServiciosPreciosSinRangosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProductosServiciosPreciosSinRangos();
			
			if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProductosServiciosPreciosSinRangos> productosserviciospreciossinrangossSeleccionados=new ArrayList<ProductosServiciosPreciosSinRangos>();		
			ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos=new ProductosServiciosPreciosSinRangos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProductosServiciosPreciosSinRangos.getSelectedItem();
			
			
			
			
			productosserviciospreciossinrangossSeleccionados=this.getProductosServiciosPreciosSinRangossSeleccionados(true);
			//this.sTipoAccion;
			
			if(productosserviciospreciossinrangossSeleccionados.size()==1) {
				for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosAux:productosserviciospreciossinrangossSeleccionados) {
					productosserviciospreciossinrangos=productosserviciospreciossinrangosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProductosServiciosPreciosSinRangos();
			
      		//this.finishProcessProductosServiciosPreciosSinRangos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProductosServiciosPreciosSinRangosReturnGeneral() throws Exception {
		if(this.productosserviciospreciossinrangosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.productosserviciospreciossinrangosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.productosserviciospreciossinrangosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.productosserviciospreciossinrangosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.productosserviciospreciossinrangosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.productosserviciospreciossinrangosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false);
		}
		
		if(this.productosserviciospreciossinrangosReturnGeneral.getConRetornoLista() || this.productosserviciospreciossinrangosReturnGeneral.getConRetornoObjeto()) {
			if(this.productosserviciospreciossinrangosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productosserviciospreciossinrangosLogic.setProductosServiciosPreciosSinRangoss(this.productosserviciospreciossinrangosReturnGeneral.getProductosServiciosPreciosSinRangoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProductosServiciosPreciosSinRangos(false);
		}
	}
	
	public void actualizarParametrosGeneralProductosServiciosPreciosSinRangos() throws Exception {
		
		
	}
	
	public ArrayList<ProductosServiciosPreciosSinRangos> getProductosServiciosPreciosSinRangossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProductosServiciosPreciosSinRangos> productosserviciospreciossinrangossSeleccionados=new ArrayList<ProductosServiciosPreciosSinRangos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProductosServiciosPreciosSinRangos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosAux:productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss()) {
					if(productosserviciospreciossinrangosAux.getIsSelected()) {
						productosserviciospreciossinrangossSeleccionados.add(productosserviciospreciossinrangosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosAux:this.productosserviciospreciossinrangoss) {
					if(productosserviciospreciossinrangosAux.getIsSelected()) {
						productosserviciospreciossinrangossSeleccionados.add(productosserviciospreciossinrangosAux);				
					}
				}
			}
			
			if(productosserviciospreciossinrangossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						productosserviciospreciossinrangossSeleccionados.addAll(this.productosserviciospreciossinrangosLogic.getProductosServiciosPreciosSinRangoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						productosserviciospreciossinrangossSeleccionados.addAll(this.productosserviciospreciossinrangoss);				
					}
				}
			}
		} else {
			productosserviciospreciossinrangossSeleccionados.add(this.productosserviciospreciossinrangos);
		}
		
		return productosserviciospreciossinrangossSeleccionados;
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
	
	public void generarReporteProductosServiciosPreciosSinRangossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProductosServiciosPreciosSinRangossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProductosServiciosPreciosSinRangossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductosServiciosPreciosSinRangossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductosServiciosPreciosSinRangossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Productos Servicios Precios Sin Rangos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProductosServiciosPreciosSinRangossSeleccionados() throws Exception {
		ArrayList<ProductosServiciosPreciosSinRangos> productosserviciospreciossinrangossSeleccionados=new ArrayList<ProductosServiciosPreciosSinRangos>();		
		
		productosserviciospreciossinrangossSeleccionados=this.getProductosServiciosPreciosSinRangossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProductosServiciosPreciosSinRangoss("Todos",productosserviciospreciossinrangossSeleccionados);
		
	}	
	
	public void generarReporteNormalProductosServiciosPreciosSinRangossSeleccionados() throws Exception {
		ArrayList<ProductosServiciosPreciosSinRangos> productosserviciospreciossinrangossSeleccionados=new ArrayList<ProductosServiciosPreciosSinRangos>();		
		
		productosserviciospreciossinrangossSeleccionados=this.getProductosServiciosPreciosSinRangossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProductosServiciosPreciosSinRangoss("Todos",productosserviciospreciossinrangossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProductosServiciosPreciosSinRangossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProductosServiciosPreciosSinRangos> productosserviciospreciossinrangossSeleccionados=new ArrayList<ProductosServiciosPreciosSinRangos>();
		
		productosserviciospreciossinrangossSeleccionados=this.getProductosServiciosPreciosSinRangossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProductosServiciosPreciosSinRangoss("Todos",productosserviciospreciossinrangossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProductosServiciosPreciosSinRangossSeleccionados() throws Exception {
		ArrayList<ProductosServiciosPreciosSinRangos> productosserviciospreciossinrangossSeleccionados=new ArrayList<ProductosServiciosPreciosSinRangos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProductosServiciosPreciosSinRangos();
		
		
		productosserviciospreciossinrangossSeleccionados=this.getProductosServiciosPreciosSinRangossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProductosServiciosPreciosSinRangos();
		
		
		//this.generarReporteProductosServiciosPreciosSinRangoss("Todos",productosserviciospreciossinrangossSeleccionados ,productosserviciospreciossinrangosImplementable,productosserviciospreciossinrangosImplementableHome);
	}
	
	public void mostrarImportacionProductosServiciosPreciosSinRangoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProductosServiciosPreciosSinRangos();
		
		this.abrirFrameImportacionProductosServiciosPreciosSinRangos();		
		
			
		//this.generarReporteProductosServiciosPreciosSinRangoss("Todos",productosserviciospreciossinrangossSeleccionados ,productosserviciospreciossinrangosImplementable,productosserviciospreciossinrangosImplementableHome);
	}
	
	public void importarProductosServiciosPreciosSinRangoss() throws Exception {		
	
	}
	
	public void exportarProductosServiciosPreciosSinRangossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProductosServiciosPreciosSinRangossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProductosServiciosPreciosSinRangossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProductosServiciosPreciosSinRangossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Productos Servicios Precios Sin Rangos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProductosServiciosPreciosSinRangossSeleccionados() throws Exception {
		ArrayList<ProductosServiciosPreciosSinRangos> productosserviciospreciossinrangossSeleccionados=new ArrayList<ProductosServiciosPreciosSinRangos>();		
		
		productosserviciospreciossinrangossSeleccionados=this.getProductosServiciosPreciosSinRangossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosserviciospreciossinrangos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProductosServiciosPreciosSinRangos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosAux:productosserviciospreciossinrangossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProductosServiciosPreciosSinRangos(productosserviciospreciossinrangosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//productosserviciospreciossinrangosAux.setsDetalleGeneralEntityReporte(productosserviciospreciossinrangosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Servicios Precios Sin Rangos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProductosServiciosPreciosSinRangos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDLINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDLINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDLINEACATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDLINEAMARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBRESUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBREBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBREUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_CODIGOTIPOPRECIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_PRECIO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProductosServiciosPreciosSinRangos(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=productosserviciospreciossinrangos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciospreciossinrangos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciospreciossinrangos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciospreciossinrangos.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciospreciossinrangos.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciospreciossinrangos.getlinea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciospreciossinrangos.getlineagrupo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciospreciossinrangos.getlineacategoria_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciospreciossinrangos.getlineamarca_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciospreciossinrangos.getnombre_sucursal();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciospreciossinrangos.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciospreciossinrangos.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciospreciossinrangos.getnombre_bodega();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciospreciossinrangos.getnombre_unidad();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciospreciossinrangos.getcodigo_tipo_precio();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciospreciossinrangos.getprecio().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProductosServiciosPreciosSinRangossSeleccionados() throws Exception {
		ArrayList<ProductosServiciosPreciosSinRangos> productosserviciospreciossinrangossSeleccionados=new ArrayList<ProductosServiciosPreciosSinRangos>();		
		
		productosserviciospreciossinrangossSeleccionados=this.getProductosServiciosPreciosSinRangossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosserviciospreciossinrangos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProductosServiciosPreciosSinRangoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProductosServiciosPreciosSinRangos(row);				
				iRow++;
			}				
			
			for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosAux:productosserviciospreciossinrangossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProductosServiciosPreciosSinRangos(productosserviciospreciossinrangosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Servicios Precios Sin Rangos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProductosServiciosPreciosSinRangossSeleccionados() throws Exception {
		ArrayList<ProductosServiciosPreciosSinRangos> productosserviciospreciossinrangossSeleccionados=new ArrayList<ProductosServiciosPreciosSinRangos>();		
		
		productosserviciospreciossinrangossSeleccionados=this.getProductosServiciosPreciosSinRangossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosserviciospreciossinrangos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("productosserviciospreciossinrangoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("productosserviciospreciossinrangos");
			//elementRoot.appendChild(element);
		
			for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosAux:productosserviciospreciossinrangossSeleccionados) {
				element = document.createElement("productosserviciospreciossinrangos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProductosServiciosPreciosSinRangos(productosserviciospreciossinrangosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Servicios Precios Sin Rangos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProductosServiciosPreciosSinRangos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDLINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDLINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDLINEACATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDLINEAMARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBRESUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBREBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBREUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_CODIGOTIPOPRECIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_PRECIO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProductosServiciosPreciosSinRangos(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciospreciossinrangos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciospreciossinrangos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciospreciossinrangos.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciospreciossinrangos.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciospreciossinrangos.getlinea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciospreciossinrangos.getlineagrupo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciospreciossinrangos.getlineacategoria_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciospreciossinrangos.getlineamarca_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciospreciossinrangos.getnombre_sucursal());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciospreciossinrangos.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciospreciossinrangos.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciospreciossinrangos.getnombre_bodega());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciospreciossinrangos.getnombre_unidad());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciospreciossinrangos.getcodigo_tipo_precio());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciospreciossinrangos.getprecio());				
	}
	
	public void setFilaDatosExportarXmlProductosServiciosPreciosSinRangos(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProductosServiciosPreciosSinRangosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(productosserviciospreciossinrangos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProductosServiciosPreciosSinRangosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(productosserviciospreciossinrangos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ProductosServiciosPreciosSinRangosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(productosserviciospreciossinrangos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ProductosServiciosPreciosSinRangosConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(productosserviciospreciossinrangos.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementbodega_descripcion = document.createElement(ProductosServiciosPreciosSinRangosConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(productosserviciospreciossinrangos.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementlinea_descripcion = document.createElement(ProductosServiciosPreciosSinRangosConstantesFunciones.IDLINEA);
		elementlinea_descripcion.appendChild(document.createTextNode(productosserviciospreciossinrangos.getlinea_descripcion()));
		element.appendChild(elementlinea_descripcion);

		Element elementlineagrupo_descripcion = document.createElement(ProductosServiciosPreciosSinRangosConstantesFunciones.IDLINEAGRUPO);
		elementlineagrupo_descripcion.appendChild(document.createTextNode(productosserviciospreciossinrangos.getlineagrupo_descripcion()));
		element.appendChild(elementlineagrupo_descripcion);

		Element elementlineacategoria_descripcion = document.createElement(ProductosServiciosPreciosSinRangosConstantesFunciones.IDLINEACATEGORIA);
		elementlineacategoria_descripcion.appendChild(document.createTextNode(productosserviciospreciossinrangos.getlineacategoria_descripcion()));
		element.appendChild(elementlineacategoria_descripcion);

		Element elementlineamarca_descripcion = document.createElement(ProductosServiciosPreciosSinRangosConstantesFunciones.IDLINEAMARCA);
		elementlineamarca_descripcion.appendChild(document.createTextNode(productosserviciospreciossinrangos.getlineamarca_descripcion()));
		element.appendChild(elementlineamarca_descripcion);

		Element elementnombre_sucursal = document.createElement(ProductosServiciosPreciosSinRangosConstantesFunciones.NOMBRESUCURSAL);
		elementnombre_sucursal.appendChild(document.createTextNode(productosserviciospreciossinrangos.getnombre_sucursal().trim()));
		element.appendChild(elementnombre_sucursal);

		Element elementcodigo = document.createElement(ProductosServiciosPreciosSinRangosConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(productosserviciospreciossinrangos.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(ProductosServiciosPreciosSinRangosConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(productosserviciospreciossinrangos.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementnombre_bodega = document.createElement(ProductosServiciosPreciosSinRangosConstantesFunciones.NOMBREBODEGA);
		elementnombre_bodega.appendChild(document.createTextNode(productosserviciospreciossinrangos.getnombre_bodega().trim()));
		element.appendChild(elementnombre_bodega);

		Element elementnombre_unidad = document.createElement(ProductosServiciosPreciosSinRangosConstantesFunciones.NOMBREUNIDAD);
		elementnombre_unidad.appendChild(document.createTextNode(productosserviciospreciossinrangos.getnombre_unidad().trim()));
		element.appendChild(elementnombre_unidad);

		Element elementcodigo_tipo_precio = document.createElement(ProductosServiciosPreciosSinRangosConstantesFunciones.CODIGOTIPOPRECIO);
		elementcodigo_tipo_precio.appendChild(document.createTextNode(productosserviciospreciossinrangos.getcodigo_tipo_precio().trim()));
		element.appendChild(elementcodigo_tipo_precio);

		Element elementprecio = document.createElement(ProductosServiciosPreciosSinRangosConstantesFunciones.PRECIO);
		elementprecio.appendChild(document.createTextNode(productosserviciospreciossinrangos.getprecio().toString().trim()));
		element.appendChild(elementprecio);
	}
	
	public void generarReporteGroupGenericoProductosServiciosPreciosSinRangossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProductosServiciosPreciosSinRangos> productosserviciospreciossinrangossSeleccionados=new ArrayList<ProductosServiciosPreciosSinRangos>();
		
		productosserviciospreciossinrangossSeleccionados=this.getProductosServiciosPreciosSinRangossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProductosServiciosPreciosSinRangos(productosserviciospreciossinrangossSeleccionados);
		
		this.generarReporteProductosServiciosPreciosSinRangoss("Todos",productosserviciospreciossinrangossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProductosServiciosPreciosSinRangos(ArrayList<ProductosServiciosPreciosSinRangos> productosserviciospreciossinrangossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProductosServiciosPreciosSinRangos productosserviciospreciossinrangosAux:productosserviciospreciossinrangossSeleccionados) {
				productosserviciospreciossinrangosAux.setsDetalleGeneralEntityReporte(productosserviciospreciossinrangosAux.toString());
			
				if(sTipoSeleccionar.equals(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					productosserviciospreciossinrangosAux.setsDescripcionGeneralEntityReporte1(productosserviciospreciossinrangosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					productosserviciospreciossinrangosAux.setsDescripcionGeneralEntityReporte1(productosserviciospreciossinrangosAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					productosserviciospreciossinrangosAux.setsDescripcionGeneralEntityReporte1(productosserviciospreciossinrangosAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDLINEA)) {
					existe=true;
					productosserviciospreciossinrangosAux.setsDescripcionGeneralEntityReporte1(productosserviciospreciossinrangosAux.getlinea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDLINEAGRUPO)) {
					existe=true;
					productosserviciospreciossinrangosAux.setsDescripcionGeneralEntityReporte1(productosserviciospreciossinrangosAux.getlineagrupo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDLINEACATEGORIA)) {
					existe=true;
					productosserviciospreciossinrangosAux.setsDescripcionGeneralEntityReporte1(productosserviciospreciossinrangosAux.getlineacategoria_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_IDLINEAMARCA)) {
					existe=true;
					productosserviciospreciossinrangosAux.setsDescripcionGeneralEntityReporte1(productosserviciospreciossinrangosAux.getlineamarca_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
					existe=true;
					productosserviciospreciossinrangosAux.setsDescripcionGeneralEntityReporte1(productosserviciospreciossinrangosAux.getnombre_sucursal());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					productosserviciospreciossinrangosAux.setsDescripcionGeneralEntityReporte1(productosserviciospreciossinrangosAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					productosserviciospreciossinrangosAux.setsDescripcionGeneralEntityReporte1(productosserviciospreciossinrangosAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBREBODEGA)) {
					existe=true;
					productosserviciospreciossinrangosAux.setsDescripcionGeneralEntityReporte1(productosserviciospreciossinrangosAux.getnombre_bodega());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
					existe=true;
					productosserviciospreciossinrangosAux.setsDescripcionGeneralEntityReporte1(productosserviciospreciossinrangosAux.getnombre_unidad());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosPreciosSinRangosConstantesFunciones.LABEL_CODIGOTIPOPRECIO)) {
					existe=true;
					productosserviciospreciossinrangosAux.setsDescripcionGeneralEntityReporte1(productosserviciospreciossinrangosAux.getcodigo_tipo_precio());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProductosServiciosPreciosSinRangos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProductosServiciosPreciosSinRangos=true;
				this.isVisibilidadCeldaNuevoRelacionesProductosServiciosPreciosSinRangos=true;
				this.isVisibilidadCeldaGuardarCambiosProductosServiciosPreciosSinRangos=true;
			}
			
			this.isVisibilidadCeldaModificarProductosServiciosPreciosSinRangos=false;
			this.isVisibilidadCeldaActualizarProductosServiciosPreciosSinRangos=false;
			this.isVisibilidadCeldaEliminarProductosServiciosPreciosSinRangos=false;
			this.isVisibilidadCeldaCancelarProductosServiciosPreciosSinRangos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosServiciosPreciosSinRangos=true;
				} else {
					this.isVisibilidadCeldaGuardarProductosServiciosPreciosSinRangos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProductosServiciosPreciosSinRangos=false;
			this.isVisibilidadCeldaNuevoRelacionesProductosServiciosPreciosSinRangos=false;
			this.isVisibilidadCeldaGuardarCambiosProductosServiciosPreciosSinRangos=false;
			this.isVisibilidadCeldaModificarProductosServiciosPreciosSinRangos=false;
			this.isVisibilidadCeldaActualizarProductosServiciosPreciosSinRangos=true;
			this.isVisibilidadCeldaEliminarProductosServiciosPreciosSinRangos=false;
			this.isVisibilidadCeldaCancelarProductosServiciosPreciosSinRangos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosServiciosPreciosSinRangos=true;
				} else {
					this.isVisibilidadCeldaGuardarProductosServiciosPreciosSinRangos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProductosServiciosPreciosSinRangos=false;
			this.isVisibilidadCeldaNuevoRelacionesProductosServiciosPreciosSinRangos=false;
			this.isVisibilidadCeldaGuardarCambiosProductosServiciosPreciosSinRangos=false;
			this.isVisibilidadCeldaModificarProductosServiciosPreciosSinRangos=false;
			this.isVisibilidadCeldaActualizarProductosServiciosPreciosSinRangos=true;
			this.isVisibilidadCeldaEliminarProductosServiciosPreciosSinRangos=true;
			this.isVisibilidadCeldaCancelarProductosServiciosPreciosSinRangos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosServiciosPreciosSinRangos=true;
				} else {
					this.isVisibilidadCeldaGuardarProductosServiciosPreciosSinRangos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProductosServiciosPreciosSinRangos=false;
			this.isVisibilidadCeldaNuevoRelacionesProductosServiciosPreciosSinRangos=false;
			this.isVisibilidadCeldaGuardarCambiosProductosServiciosPreciosSinRangos=false;
			this.isVisibilidadCeldaModificarProductosServiciosPreciosSinRangos=false;
			this.isVisibilidadCeldaActualizarProductosServiciosPreciosSinRangos=true;
			this.isVisibilidadCeldaEliminarProductosServiciosPreciosSinRangos=false;
			this.isVisibilidadCeldaCancelarProductosServiciosPreciosSinRangos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosServiciosPreciosSinRangos=false;
				} else {
					this.isVisibilidadCeldaGuardarProductosServiciosPreciosSinRangos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProductosServiciosPreciosSinRangos=true;
			this.isVisibilidadCeldaNuevoRelacionesProductosServiciosPreciosSinRangos=true;
			this.isVisibilidadCeldaGuardarCambiosProductosServiciosPreciosSinRangos=true;
			this.isVisibilidadCeldaModificarProductosServiciosPreciosSinRangos=false;
			this.isVisibilidadCeldaActualizarProductosServiciosPreciosSinRangos=false;
			this.isVisibilidadCeldaEliminarProductosServiciosPreciosSinRangos=false;
			this.isVisibilidadCeldaCancelarProductosServiciosPreciosSinRangos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosServiciosPreciosSinRangos=true;
				} else {
					this.isVisibilidadCeldaGuardarProductosServiciosPreciosSinRangos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProductosServiciosPreciosSinRangos=false;
			this.isVisibilidadCeldaNuevoRelacionesProductosServiciosPreciosSinRangos=false;
			this.isVisibilidadCeldaGuardarCambiosProductosServiciosPreciosSinRangos=false;
			this.isVisibilidadCeldaActualizarProductosServiciosPreciosSinRangos=false;
			this.isVisibilidadCeldaEliminarProductosServiciosPreciosSinRangos=false;
			this.isVisibilidadCeldaCancelarProductosServiciosPreciosSinRangos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosServiciosPreciosSinRangos=false;
				} else {
					this.isVisibilidadCeldaGuardarProductosServiciosPreciosSinRangos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProductosServiciosPreciosSinRangos=false;
			this.isVisibilidadCeldaNuevoRelacionesProductosServiciosPreciosSinRangos=false;
			this.isVisibilidadCeldaGuardarCambiosProductosServiciosPreciosSinRangos=false;
			this.isVisibilidadCeldaModificarProductosServiciosPreciosSinRangos=true;
			this.isVisibilidadCeldaActualizarProductosServiciosPreciosSinRangos=false;
			this.isVisibilidadCeldaEliminarProductosServiciosPreciosSinRangos=false;
			this.isVisibilidadCeldaCancelarProductosServiciosPreciosSinRangos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosServiciosPreciosSinRangos=false;
				} else {
					this.isVisibilidadCeldaGuardarProductosServiciosPreciosSinRangos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProductosServiciosPreciosSinRangosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProductosServiciosPreciosSinRangos=true;
			this.isVisibilidadCeldaNuevoRelacionesProductosServiciosPreciosSinRangos=true;
			this.isVisibilidadCeldaGuardarCambiosProductosServiciosPreciosSinRangos=true;
		} else {
			this.actualizarEstadoPanelsProductosServiciosPreciosSinRangos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProductosServiciosPreciosSinRangos=false;
			//this.isVisibilidadCeldaVerFormProductosServiciosPreciosSinRangos=false;
			this.isVisibilidadCeldaDuplicarProductosServiciosPreciosSinRangos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!productosserviciospreciossinrangosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProductosServiciosPreciosSinRangos=false;
		} else {
			this.isVisibilidadCeldaNuevoProductosServiciosPreciosSinRangos=false;
			this.isVisibilidadCeldaGuardarCambiosProductosServiciosPreciosSinRangos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado()) {
			if(!productosserviciospreciossinrangosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProductosServiciosPreciosSinRangos=false;												
			}
			
			this.jButtonCerrarProductosServiciosPreciosSinRangos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProductosServiciosPreciosSinRangos=false;
		}
		
		if(!this.permiteMantenimiento(this.productosserviciospreciossinrangos)) {
			this.isVisibilidadCeldaActualizarProductosServiciosPreciosSinRangos=false;
			this.isVisibilidadCeldaEliminarProductosServiciosPreciosSinRangos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProductosServiciosPreciosSinRangos=false;
		this.isVisibilidadCeldaNuevoRelacionesProductosServiciosPreciosSinRangos=false;
		this.isVisibilidadCeldaGuardarCambiosProductosServiciosPreciosSinRangos=false;
		//this.isVisibilidadCeldaModificarProductosServiciosPreciosSinRangos=true;
		this.isVisibilidadCeldaActualizarProductosServiciosPreciosSinRangos=false;
		this.isVisibilidadCeldaEliminarProductosServiciosPreciosSinRangos=false;
		//this.isVisibilidadCeldaCancelarProductosServiciosPreciosSinRangos=true;			
		this.isVisibilidadCeldaGuardarProductosServiciosPreciosSinRangos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProductosServiciosPreciosSinRangos() {
	}
	
	public void actualizarEstadoPanelsProductosServiciosPreciosSinRangos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProductosServiciosPreciosSinRangos!=null) {
				this.jScrollPanelDatosEdicionProductosServiciosPreciosSinRangos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos!=null) {
				this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductosServiciosPreciosSinRangos!=null) {
				this.jScrollPanelDatosProductosServiciosPreciosSinRangos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductosServiciosPreciosSinRangos!=null) {
				this.jPanelPaginacionProductosServiciosPreciosSinRangos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductosServiciosPreciosSinRangos!=null) {
				this.jPanelParametrosReportesProductosServiciosPreciosSinRangos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProductosServiciosPreciosSinRangos!=null) {
				this.jScrollPanelDatosEdicionProductosServiciosPreciosSinRangos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos!=null) {
				this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProductosServiciosPreciosSinRangos!=null) {
				this.jScrollPanelDatosProductosServiciosPreciosSinRangos.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductosServiciosPreciosSinRangos!=null) {
				this.jPanelPaginacionProductosServiciosPreciosSinRangos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductosServiciosPreciosSinRangos!=null) {
				this.jPanelParametrosReportesProductosServiciosPreciosSinRangos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProductosServiciosPreciosSinRangos!=null) {
				this.jScrollPanelDatosEdicionProductosServiciosPreciosSinRangos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos!=null) {
				this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductosServiciosPreciosSinRangos!=null) {
				this.jScrollPanelDatosProductosServiciosPreciosSinRangos.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductosServiciosPreciosSinRangos!=null) {
				this.jPanelPaginacionProductosServiciosPreciosSinRangos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductosServiciosPreciosSinRangos!=null) {
				this.jPanelParametrosReportesProductosServiciosPreciosSinRangos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProductosServiciosPreciosSinRangos!=null) {
				this.jScrollPanelDatosEdicionProductosServiciosPreciosSinRangos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos!=null) {
				this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductosServiciosPreciosSinRangos!=null) {
				this.jScrollPanelDatosProductosServiciosPreciosSinRangos.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductosServiciosPreciosSinRangos!=null) {
				this.jPanelPaginacionProductosServiciosPreciosSinRangos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductosServiciosPreciosSinRangos!=null) {
				this.jPanelParametrosReportesProductosServiciosPreciosSinRangos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProductosServiciosPreciosSinRangos!=null) {
				this.jScrollPanelDatosEdicionProductosServiciosPreciosSinRangos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos!=null) {
				this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductosServiciosPreciosSinRangos!=null) {
				this.jScrollPanelDatosProductosServiciosPreciosSinRangos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductosServiciosPreciosSinRangos!=null) {
				this.jPanelPaginacionProductosServiciosPreciosSinRangos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductosServiciosPreciosSinRangos!=null) {
				this.jPanelParametrosReportesProductosServiciosPreciosSinRangos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProductosServiciosPreciosSinRangos!=null) {
				this.jScrollPanelDatosEdicionProductosServiciosPreciosSinRangos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos!=null) {
				this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductosServiciosPreciosSinRangos!=null) {
				this.jScrollPanelDatosProductosServiciosPreciosSinRangos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductosServiciosPreciosSinRangos!=null) {
				this.jPanelPaginacionProductosServiciosPreciosSinRangos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductosServiciosPreciosSinRangos!=null) {
				this.jPanelParametrosReportesProductosServiciosPreciosSinRangos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProductosServiciosPreciosSinRangos!=null) {
				this.jScrollPanelDatosEdicionProductosServiciosPreciosSinRangos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos!=null) {
				this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductosServiciosPreciosSinRangos!=null) {
				this.jScrollPanelDatosProductosServiciosPreciosSinRangos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductosServiciosPreciosSinRangos!=null) {
				this.jPanelPaginacionProductosServiciosPreciosSinRangos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductosServiciosPreciosSinRangos!=null) {
				this.jPanelParametrosReportesProductosServiciosPreciosSinRangos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos!=null) {
					this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProductosServiciosPreciosSinRangos!=null) {
				this.jPanelParametrosReportesProductosServiciosPreciosSinRangos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.productosserviciospreciossinrangosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos!=null) {
				this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProductosServiciosPreciosSinRangos!=null) {
				this.jPanelParametrosReportesProductosServiciosPreciosSinRangos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaProductosServiciosPreciosSinRangos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaProductosServiciosPreciosSinRangos) {this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.remove(jPanelBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaProductosServiciosPreciosSinRangos=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaProductosServiciosPreciosSinRangos) {this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.remove(jPanelBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadBusquedaProductosServiciosPreciosSinRangos=isParaBodega;
			if(!this.isVisibilidadBusquedaProductosServiciosPreciosSinRangos) {this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.remove(jPanelBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLinea(Boolean isParaLinea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaNegation=!isParaLinea;

			this.isVisibilidadBusquedaProductosServiciosPreciosSinRangos=isParaLinea;
			if(!this.isVisibilidadBusquedaProductosServiciosPreciosSinRangos) {this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.remove(jPanelBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaGrupo(Boolean isParaLineaGrupo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaGrupoNegation=!isParaLineaGrupo;

			this.isVisibilidadBusquedaProductosServiciosPreciosSinRangos=isParaLineaGrupo;
			if(!this.isVisibilidadBusquedaProductosServiciosPreciosSinRangos) {this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.remove(jPanelBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaCategoria(Boolean isParaLineaCategoria){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaCategoriaNegation=!isParaLineaCategoria;

			this.isVisibilidadBusquedaProductosServiciosPreciosSinRangos=isParaLineaCategoria;
			if(!this.isVisibilidadBusquedaProductosServiciosPreciosSinRangos) {this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.remove(jPanelBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaMarca(Boolean isParaLineaMarca){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaMarcaNegation=!isParaLineaMarca;

			this.isVisibilidadBusquedaProductosServiciosPreciosSinRangos=isParaLineaMarca;
			if(!this.isVisibilidadBusquedaProductosServiciosPreciosSinRangos) {this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.remove(jPanelBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos);}
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
			
			this.inicializarActualizarBindingTablaProductosServiciosPreciosSinRangos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProductosServiciosPreciosSinRangos() {
		this.updateBorderResaltarBusquedasFormularioProductosServiciosPreciosSinRangos();
		this.updateVisibilidadBusquedasFormularioProductosServiciosPreciosSinRangos();
		this.updateHabilitarBusquedasFormularioProductosServiciosPreciosSinRangos();
	}
	
	public void updateBorderResaltarBusquedasFormularioProductosServiciosPreciosSinRangos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.getComponents().length>0) {
	

		if(this.productosserviciospreciossinrangosConstantesFunciones.resaltarBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos!=null) {
			index= this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.indexOfComponent(this.jPanelBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.getComponent(index);
				jPanel.setBorder(this.productosserviciospreciossinrangosConstantesFunciones.resaltarBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProductosServiciosPreciosSinRangos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.indexOfComponent(this.jPanelBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productosserviciospreciossinrangosConstantesFunciones.mostrarBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos);
			if(!this.productosserviciospreciossinrangosConstantesFunciones.mostrarBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos && index>-1) {
				this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProductosServiciosPreciosSinRangos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.indexOfComponent(this.jPanelBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productosserviciospreciossinrangosConstantesFunciones.activarBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos);
				this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.setEnabledAt(index,this.productosserviciospreciossinrangosConstantesFunciones.activarBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProductosServiciosPreciosSinRangos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaProductosServiciosPreciosSinRangos")) {
			index= this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.indexOfComponent(this.jPanelBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos);

			this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductosServiciosPreciosSinRangos.getComponent(index);

			this.productosserviciospreciossinrangosConstantesFunciones.setResaltarBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos(resaltar);

			jPanel.setBorder(this.productosserviciospreciossinrangosConstantesFunciones.resaltarBusquedaProductosServiciosPreciosSinRangosProductosServiciosPreciosSinRangos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProductosServiciosPreciosSinRangos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProductosServiciosPreciosSinRangos() throws Exception {

		if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProductosServiciosPreciosSinRangos();
		this.updateVisibilidadResaltarControlesFormularioProductosServiciosPreciosSinRangos();
		this.updateHabilitarResaltarControlesFormularioProductosServiciosPreciosSinRangos();
		
	}
	
	public void updateBorderResaltarControlesFormularioProductosServiciosPreciosSinRangos() throws Exception {
		if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.productosserviciospreciossinrangosConstantesFunciones.resaltaridProductosServiciosPreciosSinRangos!=null && this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jLabelidProductosServiciosPreciosSinRangos.setBorder(this.productosserviciospreciossinrangosConstantesFunciones.resaltaridProductosServiciosPreciosSinRangos);}
		if(this.productosserviciospreciossinrangosConstantesFunciones.resaltarid_empresaProductosServiciosPreciosSinRangos!=null && this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_empresaProductosServiciosPreciosSinRangos.setBorder(this.productosserviciospreciossinrangosConstantesFunciones.resaltarid_empresaProductosServiciosPreciosSinRangos);}
		if(this.productosserviciospreciossinrangosConstantesFunciones.resaltarid_sucursalProductosServiciosPreciosSinRangos!=null && this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_sucursalProductosServiciosPreciosSinRangos.setBorder(this.productosserviciospreciossinrangosConstantesFunciones.resaltarid_sucursalProductosServiciosPreciosSinRangos);}
		if(this.productosserviciospreciossinrangosConstantesFunciones.resaltarid_bodegaProductosServiciosPreciosSinRangos!=null && this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_bodegaProductosServiciosPreciosSinRangos.setBorder(this.productosserviciospreciossinrangosConstantesFunciones.resaltarid_bodegaProductosServiciosPreciosSinRangos);}
		if(this.productosserviciospreciossinrangosConstantesFunciones.resaltarid_lineaProductosServiciosPreciosSinRangos!=null && this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_lineaProductosServiciosPreciosSinRangos.setBorder(this.productosserviciospreciossinrangosConstantesFunciones.resaltarid_lineaProductosServiciosPreciosSinRangos);}
		if(this.productosserviciospreciossinrangosConstantesFunciones.resaltarid_linea_grupoProductosServiciosPreciosSinRangos!=null && this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_grupoProductosServiciosPreciosSinRangos.setBorder(this.productosserviciospreciossinrangosConstantesFunciones.resaltarid_linea_grupoProductosServiciosPreciosSinRangos);}
		if(this.productosserviciospreciossinrangosConstantesFunciones.resaltarid_linea_categoriaProductosServiciosPreciosSinRangos!=null && this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_categoriaProductosServiciosPreciosSinRangos.setBorder(this.productosserviciospreciossinrangosConstantesFunciones.resaltarid_linea_categoriaProductosServiciosPreciosSinRangos);}
		if(this.productosserviciospreciossinrangosConstantesFunciones.resaltarid_linea_marcaProductosServiciosPreciosSinRangos!=null && this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_marcaProductosServiciosPreciosSinRangos.setBorder(this.productosserviciospreciossinrangosConstantesFunciones.resaltarid_linea_marcaProductosServiciosPreciosSinRangos);}
		if(this.productosserviciospreciossinrangosConstantesFunciones.resaltarnombre_sucursalProductosServiciosPreciosSinRangos!=null && this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextAreanombre_sucursalProductosServiciosPreciosSinRangos.setBorder(this.productosserviciospreciossinrangosConstantesFunciones.resaltarnombre_sucursalProductosServiciosPreciosSinRangos);}
		if(this.productosserviciospreciossinrangosConstantesFunciones.resaltarcodigoProductosServiciosPreciosSinRangos!=null && this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextFieldcodigoProductosServiciosPreciosSinRangos.setBorder(this.productosserviciospreciossinrangosConstantesFunciones.resaltarcodigoProductosServiciosPreciosSinRangos);}
		if(this.productosserviciospreciossinrangosConstantesFunciones.resaltarnombreProductosServiciosPreciosSinRangos!=null && this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextAreanombreProductosServiciosPreciosSinRangos.setBorder(this.productosserviciospreciossinrangosConstantesFunciones.resaltarnombreProductosServiciosPreciosSinRangos);}
		if(this.productosserviciospreciossinrangosConstantesFunciones.resaltarnombre_bodegaProductosServiciosPreciosSinRangos!=null && this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextAreanombre_bodegaProductosServiciosPreciosSinRangos.setBorder(this.productosserviciospreciossinrangosConstantesFunciones.resaltarnombre_bodegaProductosServiciosPreciosSinRangos);}
		if(this.productosserviciospreciossinrangosConstantesFunciones.resaltarnombre_unidadProductosServiciosPreciosSinRangos!=null && this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextFieldnombre_unidadProductosServiciosPreciosSinRangos.setBorder(this.productosserviciospreciossinrangosConstantesFunciones.resaltarnombre_unidadProductosServiciosPreciosSinRangos);}
		if(this.productosserviciospreciossinrangosConstantesFunciones.resaltarcodigo_tipo_precioProductosServiciosPreciosSinRangos!=null && this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextAreacodigo_tipo_precioProductosServiciosPreciosSinRangos.setBorder(this.productosserviciospreciossinrangosConstantesFunciones.resaltarcodigo_tipo_precioProductosServiciosPreciosSinRangos);}
		if(this.productosserviciospreciossinrangosConstantesFunciones.resaltarprecioProductosServiciosPreciosSinRangos!=null && this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextFieldprecioProductosServiciosPreciosSinRangos.setBorder(this.productosserviciospreciossinrangosConstantesFunciones.resaltarprecioProductosServiciosPreciosSinRangos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProductosServiciosPreciosSinRangos() throws Exception {		
		if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
	
		//this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jLabelidProductosServiciosPreciosSinRangos.setVisible(this.productosserviciospreciossinrangosConstantesFunciones.mostraridProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jPanelidProductosServiciosPreciosSinRangos.setVisible(this.productosserviciospreciossinrangosConstantesFunciones.mostraridProductosServiciosPreciosSinRangos);
		//this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_empresaProductosServiciosPreciosSinRangos.setVisible(this.productosserviciospreciossinrangosConstantesFunciones.mostrarid_empresaProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jPanelid_empresaProductosServiciosPreciosSinRangos.setVisible(this.productosserviciospreciossinrangosConstantesFunciones.mostrarid_empresaProductosServiciosPreciosSinRangos);
		//this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_sucursalProductosServiciosPreciosSinRangos.setVisible(this.productosserviciospreciossinrangosConstantesFunciones.mostrarid_sucursalProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jPanelid_sucursalProductosServiciosPreciosSinRangos.setVisible(this.productosserviciospreciossinrangosConstantesFunciones.mostrarid_sucursalProductosServiciosPreciosSinRangos);
		//this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_bodegaProductosServiciosPreciosSinRangos.setVisible(this.productosserviciospreciossinrangosConstantesFunciones.mostrarid_bodegaProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jPanelid_bodegaProductosServiciosPreciosSinRangos.setVisible(this.productosserviciospreciossinrangosConstantesFunciones.mostrarid_bodegaProductosServiciosPreciosSinRangos);
		//this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_lineaProductosServiciosPreciosSinRangos.setVisible(this.productosserviciospreciossinrangosConstantesFunciones.mostrarid_lineaProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jPanelid_lineaProductosServiciosPreciosSinRangos.setVisible(this.productosserviciospreciossinrangosConstantesFunciones.mostrarid_lineaProductosServiciosPreciosSinRangos);
		//this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_grupoProductosServiciosPreciosSinRangos.setVisible(this.productosserviciospreciossinrangosConstantesFunciones.mostrarid_linea_grupoProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jPanelid_linea_grupoProductosServiciosPreciosSinRangos.setVisible(this.productosserviciospreciossinrangosConstantesFunciones.mostrarid_linea_grupoProductosServiciosPreciosSinRangos);
		//this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_categoriaProductosServiciosPreciosSinRangos.setVisible(this.productosserviciospreciossinrangosConstantesFunciones.mostrarid_linea_categoriaProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jPanelid_linea_categoriaProductosServiciosPreciosSinRangos.setVisible(this.productosserviciospreciossinrangosConstantesFunciones.mostrarid_linea_categoriaProductosServiciosPreciosSinRangos);
		//this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_marcaProductosServiciosPreciosSinRangos.setVisible(this.productosserviciospreciossinrangosConstantesFunciones.mostrarid_linea_marcaProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jPanelid_linea_marcaProductosServiciosPreciosSinRangos.setVisible(this.productosserviciospreciossinrangosConstantesFunciones.mostrarid_linea_marcaProductosServiciosPreciosSinRangos);
		//this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextAreanombre_sucursalProductosServiciosPreciosSinRangos.setVisible(this.productosserviciospreciossinrangosConstantesFunciones.mostrarnombre_sucursalProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jPanelnombre_sucursalProductosServiciosPreciosSinRangos.setVisible(this.productosserviciospreciossinrangosConstantesFunciones.mostrarnombre_sucursalProductosServiciosPreciosSinRangos);
		//this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextFieldcodigoProductosServiciosPreciosSinRangos.setVisible(this.productosserviciospreciossinrangosConstantesFunciones.mostrarcodigoProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jPanelcodigoProductosServiciosPreciosSinRangos.setVisible(this.productosserviciospreciossinrangosConstantesFunciones.mostrarcodigoProductosServiciosPreciosSinRangos);
		//this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextAreanombreProductosServiciosPreciosSinRangos.setVisible(this.productosserviciospreciossinrangosConstantesFunciones.mostrarnombreProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jPanelnombreProductosServiciosPreciosSinRangos.setVisible(this.productosserviciospreciossinrangosConstantesFunciones.mostrarnombreProductosServiciosPreciosSinRangos);
		//this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextAreanombre_bodegaProductosServiciosPreciosSinRangos.setVisible(this.productosserviciospreciossinrangosConstantesFunciones.mostrarnombre_bodegaProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jPanelnombre_bodegaProductosServiciosPreciosSinRangos.setVisible(this.productosserviciospreciossinrangosConstantesFunciones.mostrarnombre_bodegaProductosServiciosPreciosSinRangos);
		//this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextFieldnombre_unidadProductosServiciosPreciosSinRangos.setVisible(this.productosserviciospreciossinrangosConstantesFunciones.mostrarnombre_unidadProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jPanelnombre_unidadProductosServiciosPreciosSinRangos.setVisible(this.productosserviciospreciossinrangosConstantesFunciones.mostrarnombre_unidadProductosServiciosPreciosSinRangos);
		//this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextAreacodigo_tipo_precioProductosServiciosPreciosSinRangos.setVisible(this.productosserviciospreciossinrangosConstantesFunciones.mostrarcodigo_tipo_precioProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jPanelcodigo_tipo_precioProductosServiciosPreciosSinRangos.setVisible(this.productosserviciospreciossinrangosConstantesFunciones.mostrarcodigo_tipo_precioProductosServiciosPreciosSinRangos);
		//this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextFieldprecioProductosServiciosPreciosSinRangos.setVisible(this.productosserviciospreciossinrangosConstantesFunciones.mostrarprecioProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jPanelprecioProductosServiciosPreciosSinRangos.setVisible(this.productosserviciospreciossinrangosConstantesFunciones.mostrarprecioProductosServiciosPreciosSinRangos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProductosServiciosPreciosSinRangos() throws Exception {
		if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos!=null) {
	
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jLabelidProductosServiciosPreciosSinRangos.setEnabled(this.productosserviciospreciossinrangosConstantesFunciones.activaridProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_empresaProductosServiciosPreciosSinRangos.setEnabled(this.productosserviciospreciossinrangosConstantesFunciones.activarid_empresaProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_sucursalProductosServiciosPreciosSinRangos.setEnabled(this.productosserviciospreciossinrangosConstantesFunciones.activarid_sucursalProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_bodegaProductosServiciosPreciosSinRangos.setEnabled(this.productosserviciospreciossinrangosConstantesFunciones.activarid_bodegaProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_lineaProductosServiciosPreciosSinRangos.setEnabled(this.productosserviciospreciossinrangosConstantesFunciones.activarid_lineaProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_grupoProductosServiciosPreciosSinRangos.setEnabled(this.productosserviciospreciossinrangosConstantesFunciones.activarid_linea_grupoProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_categoriaProductosServiciosPreciosSinRangos.setEnabled(this.productosserviciospreciossinrangosConstantesFunciones.activarid_linea_categoriaProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jComboBoxid_linea_marcaProductosServiciosPreciosSinRangos.setEnabled(this.productosserviciospreciossinrangosConstantesFunciones.activarid_linea_marcaProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextAreanombre_sucursalProductosServiciosPreciosSinRangos.setEnabled(this.productosserviciospreciossinrangosConstantesFunciones.activarnombre_sucursalProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextFieldcodigoProductosServiciosPreciosSinRangos.setEnabled(this.productosserviciospreciossinrangosConstantesFunciones.activarcodigoProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextAreanombreProductosServiciosPreciosSinRangos.setEnabled(this.productosserviciospreciossinrangosConstantesFunciones.activarnombreProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextAreanombre_bodegaProductosServiciosPreciosSinRangos.setEnabled(this.productosserviciospreciossinrangosConstantesFunciones.activarnombre_bodegaProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextFieldnombre_unidadProductosServiciosPreciosSinRangos.setEnabled(this.productosserviciospreciossinrangosConstantesFunciones.activarnombre_unidadProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextAreacodigo_tipo_precioProductosServiciosPreciosSinRangos.setEnabled(this.productosserviciospreciossinrangosConstantesFunciones.activarcodigo_tipo_precioProductosServiciosPreciosSinRangos);
		this.jInternalFrameDetalleFormProductosServiciosPreciosSinRangos.jTextFieldprecioProductosServiciosPreciosSinRangos.setEnabled(this.productosserviciospreciossinrangosConstantesFunciones.activarprecioProductosServiciosPreciosSinRangos);
		}
	}
	
		
}