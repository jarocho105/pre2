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

//import com.bydan.erp.inventario.util.PedidosComprasConstantesFunciones;
import com.bydan.erp.inventario.util.report.PedidosComprasParameterReturnGeneral;
//import com.bydan.erp.inventario.util.report.PedidosComprasParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.report.PedidosComprasBean;
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
import com.bydan.erp.facturacion.business.logic.*;

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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class PedidosComprasBeanSwingJInternalFrame extends PedidosComprasJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PedidosComprasBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PedidosCompras> pedidoscomprasValidator = new ClassValidator<PedidosCompras>(PedidosCompras.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PedidosCompras pedidoscompras;	
	public PedidosCompras pedidoscomprasAux;
	public PedidosCompras pedidoscomprasAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PedidosCompras pedidoscomprasTotales;
	public Long idPedidosComprasActual;
	public Long iIdNuevoPedidosCompras=0L;
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

	public String sFinalQueryComboTipoProductoServicio="";

	public List<TipoProductoServicio> tipoproductoserviciosForeignKey;

	public List<TipoProductoServicio> gettipoproductoserviciosForeignKey() {
		return tipoproductoserviciosForeignKey;
	}

	public void settipoproductoserviciosForeignKey(List<TipoProductoServicio> tipoproductoserviciosForeignKey) {
		this.tipoproductoserviciosForeignKey = tipoproductoserviciosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoProductoServicio tipoproductoservicioForeignKey;

	public TipoProductoServicio gettipoproductoservicioForeignKey() {
		return tipoproductoservicioForeignKey;
	}

	public void settipoproductoservicioForeignKey(TipoProductoServicio tipoproductoservicioForeignKey) {
		this.tipoproductoservicioForeignKey = tipoproductoservicioForeignKey;
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
	
	public Boolean isPermisoTodoPedidosCompras;
	public Boolean isPermisoNuevoPedidosCompras;
	public Boolean isPermisoActualizarPedidosCompras;
	public Boolean isPermisoActualizarOriginalPedidosCompras;
	public Boolean isPermisoEliminarPedidosCompras;
	public Boolean isPermisoGuardarCambiosPedidosCompras;
	public Boolean isPermisoConsultaPedidosCompras;
	public Boolean isPermisoBusquedaPedidosCompras;
	public Boolean isPermisoReportePedidosCompras;
	public Boolean isPermisoPaginacionMedioPedidosCompras;
	public Boolean isPermisoPaginacionAltoPedidosCompras;
	public Boolean isPermisoPaginacionTodoPedidosCompras;
	public Boolean isPermisoCopiarPedidosCompras;
	public Boolean isPermisoVerFormPedidosCompras;
	public Boolean isPermisoDuplicarPedidosCompras;
	public Boolean isPermisoOrdenPedidosCompras;
	
	
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
	
	public PedidosComprasParameterReturnGeneral pedidoscomprasReturnGeneral;
	public PedidosComprasParameterReturnGeneral pedidoscomprasParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPedidosCompras=false;
	public Boolean esParaAccionDesdeFormularioPedidosCompras=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PedidosComprasSessionBeanAdditional pedidoscomprasSessionBeanAdditional=null;
	
	public PedidosComprasSessionBeanAdditional getPedidosComprasSessionBeanAdditional() {
		return this.pedidoscomprasSessionBeanAdditional;
	}
	
	public void setPedidosComprasSessionBeanAdditional(PedidosComprasSessionBeanAdditional pedidoscomprasSessionBeanAdditional) {
		try {
			this.pedidoscomprasSessionBeanAdditional=pedidoscomprasSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PedidosComprasBeanSwingJInternalFrameAdditional pedidoscomprasBeanSwingJInternalFrameAdditional=null;
	//public class PedidosComprasBeanSwingJInternalFrame
	
	public PedidosComprasBeanSwingJInternalFrameAdditional getPedidosComprasBeanSwingJInternalFrameAdditional() {
		return this.pedidoscomprasBeanSwingJInternalFrameAdditional;
	}
	
	public void setPedidosComprasBeanSwingJInternalFrameAdditional(PedidosComprasBeanSwingJInternalFrameAdditional pedidoscomprasBeanSwingJInternalFrameAdditional) {
		try {
			this.pedidoscomprasBeanSwingJInternalFrameAdditional=pedidoscomprasBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PedidosComprasLogic pedidoscomprasLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PedidosCompras pedidoscomprasBean;
	public PedidosComprasConstantesFunciones pedidoscomprasConstantesFunciones;
	//public PedidosComprasParameterReturnGeneral pedidoscomprasReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public ProductoLogic productoLogic;
	public LineaLogic lineaLogic;
	public LineaLogic lineagrupoLogic;
	public LineaLogic lineacategoriaLogic;
	public LineaLogic lineamarcaLogic;
	public TipoProductoServicioLogic tipoproductoservicioLogic;
	
	//PARAMETROS
	
	
	//public List<PedidosCompras> pedidoscomprass;	
	//public List<PedidosCompras> pedidoscomprassEliminados;
	//public List<PedidosCompras> pedidoscomprassAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPedidosCompras=false;
	public Boolean isVisibilidadCeldaDuplicarPedidosCompras=true;
	public Boolean isVisibilidadCeldaCopiarPedidosCompras=true;
	public Boolean isVisibilidadCeldaVerFormPedidosCompras=true;
	public Boolean isVisibilidadCeldaOrdenPedidosCompras=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPedidosCompras=false;
	public Boolean isVisibilidadCeldaModificarPedidosCompras=false;
	public Boolean isVisibilidadCeldaActualizarPedidosCompras=false;
	public Boolean isVisibilidadCeldaEliminarPedidosCompras=false;
	public Boolean isVisibilidadCeldaCancelarPedidosCompras=false;
	public Boolean isVisibilidadCeldaGuardarPedidosCompras=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPedidosCompras=false;	
	
	
	public Boolean isVisibilidadBusquedaPedidosCompras=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdLinea=false;
	public Boolean isVisibilidadFK_IdLineaCategoria=false;
	public Boolean isVisibilidadFK_IdLineaGrupo=false;
	public Boolean isVisibilidadFK_IdLineaMarca=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoProductoServicio=false;
	
	public Long getiIdNuevoPedidosCompras() {
		return this.iIdNuevoPedidosCompras;
	}

	public void setiIdNuevoPedidosCompras(Long iIdNuevoPedidosCompras) {
		this.iIdNuevoPedidosCompras = iIdNuevoPedidosCompras;
	}
	
	public Long getidPedidosComprasActual() {
		return this.idPedidosComprasActual;
	}

	public void setidPedidosComprasActual(Long idPedidosComprasActual) {
		this.idPedidosComprasActual = idPedidosComprasActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PedidosCompras getpedidoscompras() {
		return this.pedidoscompras;
	}

	public void setpedidoscompras(PedidosCompras pedidoscompras) {
		this.pedidoscompras = pedidoscompras;
	}
	
	public PedidosCompras getpedidoscomprasAux() {
		return this.pedidoscomprasAux;
	}

	public void setpedidoscomprasAux(PedidosCompras pedidoscomprasAux) {
		this.pedidoscomprasAux = pedidoscomprasAux;
	}				
	
	public PedidosCompras getpedidoscomprasAnterior() {
		return this.pedidoscomprasAnterior;
	}

	public void setpedidoscomprasAnterior(PedidosCompras pedidoscomprasAnterior) {
		this.pedidoscomprasAnterior = pedidoscomprasAnterior;
	}	
	
	public PedidosCompras getpedidoscomprasTotales() {
		return this.pedidoscomprasTotales;
	}

	public void setpedidoscomprasTotales(PedidosCompras pedidoscomprasTotales) {
		this.pedidoscomprasTotales = pedidoscomprasTotales;
	}	
	
	public PedidosCompras getpedidoscomprasBean() {
		return this.pedidoscomprasBean;
	}

	public void setpedidoscomprasBean(PedidosCompras pedidoscomprasBean) {
		this.pedidoscomprasBean = pedidoscomprasBean;
	}	
	
	public PedidosComprasParameterReturnGeneral getpedidoscomprasReturnGeneral() {
		return this.pedidoscomprasReturnGeneral;
	}

	public void setpedidoscomprasReturnGeneral(PedidosComprasParameterReturnGeneral pedidoscomprasReturnGeneral) {
		this.pedidoscomprasReturnGeneral = pedidoscomprasReturnGeneral;
	}	
	
	
	public Long id_productoBusquedaPedidosCompras=-1L;

	public Long getid_productoBusquedaPedidosCompras() {
		return this.id_productoBusquedaPedidosCompras;
	}

	public void setid_productoBusquedaPedidosCompras(Long id_productoBusquedaPedidosCompras) {
		this.id_productoBusquedaPedidosCompras = id_productoBusquedaPedidosCompras;
	}

;
	public Long id_lineaBusquedaPedidosCompras=-1L;

	public Long getid_lineaBusquedaPedidosCompras() {
		return this.id_lineaBusquedaPedidosCompras;
	}

	public void setid_lineaBusquedaPedidosCompras(Long id_lineaBusquedaPedidosCompras) {
		this.id_lineaBusquedaPedidosCompras = id_lineaBusquedaPedidosCompras;
	}

;
	public Long id_linea_grupoBusquedaPedidosCompras=-1L;

	public Long getid_linea_grupoBusquedaPedidosCompras() {
		return this.id_linea_grupoBusquedaPedidosCompras;
	}

	public void setid_linea_grupoBusquedaPedidosCompras(Long id_linea_grupoBusquedaPedidosCompras) {
		this.id_linea_grupoBusquedaPedidosCompras = id_linea_grupoBusquedaPedidosCompras;
	}

;
	public Long id_linea_categoriaBusquedaPedidosCompras=-1L;

	public Long getid_linea_categoriaBusquedaPedidosCompras() {
		return this.id_linea_categoriaBusquedaPedidosCompras;
	}

	public void setid_linea_categoriaBusquedaPedidosCompras(Long id_linea_categoriaBusquedaPedidosCompras) {
		this.id_linea_categoriaBusquedaPedidosCompras = id_linea_categoriaBusquedaPedidosCompras;
	}

;
	public Long id_linea_marcaBusquedaPedidosCompras=-1L;

	public Long getid_linea_marcaBusquedaPedidosCompras() {
		return this.id_linea_marcaBusquedaPedidosCompras;
	}

	public void setid_linea_marcaBusquedaPedidosCompras(Long id_linea_marcaBusquedaPedidosCompras) {
		this.id_linea_marcaBusquedaPedidosCompras = id_linea_marcaBusquedaPedidosCompras;
	}

;
	public Long id_tipo_producto_servicioBusquedaPedidosCompras=-1L;

	public Long getid_tipo_producto_servicioBusquedaPedidosCompras() {
		return this.id_tipo_producto_servicioBusquedaPedidosCompras;
	}

	public void setid_tipo_producto_servicioBusquedaPedidosCompras(Long id_tipo_producto_servicioBusquedaPedidosCompras) {
		this.id_tipo_producto_servicioBusquedaPedidosCompras = id_tipo_producto_servicioBusquedaPedidosCompras;
	}

;
	public Date fecha_emision_desdeBusquedaPedidosCompras=new Date();

	public Date getfecha_emision_desdeBusquedaPedidosCompras() {
		return this.fecha_emision_desdeBusquedaPedidosCompras;
	}

	public void setfecha_emision_desdeBusquedaPedidosCompras(Date fecha_emision_desdeBusquedaPedidosCompras) {
		this.fecha_emision_desdeBusquedaPedidosCompras = fecha_emision_desdeBusquedaPedidosCompras;
	}

;
	public Date fecha_emision_hastaBusquedaPedidosCompras=new Date();

	public Date getfecha_emision_hastaBusquedaPedidosCompras() {
		return this.fecha_emision_hastaBusquedaPedidosCompras;
	}

	public void setfecha_emision_hastaBusquedaPedidosCompras(Date fecha_emision_hastaBusquedaPedidosCompras) {
		this.fecha_emision_hastaBusquedaPedidosCompras = fecha_emision_hastaBusquedaPedidosCompras;
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

	public Long id_tipo_producto_servicioFK_IdTipoProductoServicio=-1L;

	public Long getid_tipo_producto_servicioFK_IdTipoProductoServicio() {
		return this.id_tipo_producto_servicioFK_IdTipoProductoServicio;
	}

	public void setid_tipo_producto_servicioFK_IdTipoProductoServicio(Long id_tipo_producto_servicioFK_IdTipoProductoServicio) {
		this.id_tipo_producto_servicioFK_IdTipoProductoServicio = id_tipo_producto_servicioFK_IdTipoProductoServicio;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public PedidosComprasLogic getPedidosComprasLogic()	{		
		return pedidoscomprasLogic;
	}

	public void setPedidosComprasLogic(PedidosComprasLogic pedidoscomprasLogic) {
		this.pedidoscomprasLogic = pedidoscomprasLogic;
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
	
	public Boolean getIsEsNuevoPedidosCompras() {
		return isEsNuevoPedidosCompras;
	}

	public void setIsEsNuevoPedidosCompras(Boolean isEsNuevoPedidosCompras) {
		this.isEsNuevoPedidosCompras = isEsNuevoPedidosCompras;
	}

	public Boolean getEsParaAccionDesdeFormularioPedidosCompras() {
		return esParaAccionDesdeFormularioPedidosCompras;
	}
	
	public void setEsParaAccionDesdeFormularioPedidosCompras(Boolean esParaAccionDesdeFormularioPedidosCompras) {
		this.esParaAccionDesdeFormularioPedidosCompras = esParaAccionDesdeFormularioPedidosCompras;
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

			if(this.pedidoscomprasSessionBean==null) {
				this.pedidoscomprasSessionBean=new PedidosComprasSessionBean();
			}

			if(!this.pedidoscomprasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(pedidoscomprasSessionBean.getlidEmpresaActual());
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

			if(this.pedidoscomprasSessionBean==null) {
				this.pedidoscomprasSessionBean=new PedidosComprasSessionBean();
			}

			if(!this.pedidoscomprasSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(pedidoscomprasSessionBean.getlidSucursalActual());
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

			if(this.pedidoscomprasSessionBean==null) {
				this.pedidoscomprasSessionBean=new PedidosComprasSessionBean();
			}

			if(!this.pedidoscomprasSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(pedidoscomprasSessionBean.getlidProductoActual());
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

			if(this.pedidoscomprasSessionBean==null) {
				this.pedidoscomprasSessionBean=new PedidosComprasSessionBean();
			}

			if(!this.pedidoscomprasSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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
					lineaLogic.getEntityWithConnection(pedidoscomprasSessionBean.getlidLineaActual());
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

			if(this.pedidoscomprasSessionBean==null) {
				this.pedidoscomprasSessionBean=new PedidosComprasSessionBean();
			}

			if(!this.pedidoscomprasSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
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
					lineaLogic.getEntityWithConnection(pedidoscomprasSessionBean.getlidLineaGrupoActual());
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

			if(this.pedidoscomprasSessionBean==null) {
				this.pedidoscomprasSessionBean=new PedidosComprasSessionBean();
			}

			if(!this.pedidoscomprasSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
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
					lineaLogic.getEntityWithConnection(pedidoscomprasSessionBean.getlidLineaCategoriaActual());
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

			if(this.pedidoscomprasSessionBean==null) {
				this.pedidoscomprasSessionBean=new PedidosComprasSessionBean();
			}

			if(!this.pedidoscomprasSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
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
					lineaLogic.getEntityWithConnection(pedidoscomprasSessionBean.getlidLineaMarcaActual());
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

	public void cargarCombosTipoProductoServiciosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoproductoserviciosForeignKey=new ArrayList<TipoProductoServicio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoProductoServicioLogic tipoproductoservicioLogic=new TipoProductoServicioLogic();

			//tipoproductoservicioLogic.getTipoProductoServicioDataAccess().setIsForForeingKeyData(true);

			if(this.pedidoscomprasSessionBean==null) {
				this.pedidoscomprasSessionBean=new PedidosComprasSessionBean();
			}

			if(!this.pedidoscomprasSessionBean.getisBusquedaDesdeForeignKeySesionTipoProductoServicio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipoproductoservicioLogic.getTipoProductoServicioDataAccess().setIsForForeingKeyData(true);

					tipoproductoservicioLogic.getTodosTipoProductoServiciosWithConnection(sFinalQuery,new Pagination());

					this.tipoproductoserviciosForeignKey=tipoproductoservicioLogic.getTipoProductoServicios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoProductoServicio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoproductoservicioLogic.getEntityWithConnection(pedidoscomprasSessionBean.getlidTipoProductoServicioActual());
					this.tipoproductoserviciosForeignKey.add(tipoproductoservicioLogic.getTipoProductoServicio());
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

					if(this.pedidoscompras!=null) {
						this.pedidoscompras.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
						this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_empresaPedidosCompras.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaPedidosCompras.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
						if(this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_empresaPedidosCompras.getItemCount()>0) {
							this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_empresaPedidosCompras.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaPedidosComprasGenerico)throws Exception
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
				jComboBoxid_empresaPedidosComprasGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaPedidosComprasGenerico!=null && jComboBoxid_empresaPedidosComprasGenerico.getItemCount()>0) {
					jComboBoxid_empresaPedidosComprasGenerico.setSelectedIndex(0);
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

					if(this.pedidoscompras!=null) {
						this.pedidoscompras.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
						this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_sucursalPedidosCompras.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalPedidosCompras.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
						if(this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_sucursalPedidosCompras.getItemCount()>0) {
							this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_sucursalPedidosCompras.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalPedidosComprasGenerico)throws Exception
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
				jComboBoxid_sucursalPedidosComprasGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalPedidosComprasGenerico!=null && jComboBoxid_sucursalPedidosComprasGenerico.getItemCount()>0) {
					jComboBoxid_sucursalPedidosComprasGenerico.setSelectedIndex(0);
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

					if(this.pedidoscompras!=null) {
						this.pedidoscompras.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
						this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_productoPedidosCompras.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoPedidosCompras.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
						if(this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_productoPedidosCompras.getItemCount()>0) {
							this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_productoPedidosCompras.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPedidosCompras") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoBusquedaPedidosComprasPedidosCompras!=null) {
						jComboBoxid_productoBusquedaPedidosComprasPedidosCompras.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoBusquedaPedidosComprasPedidosCompras!=null) {
							//jComboBoxid_productoBusquedaPedidosComprasPedidosCompras.setSelectedItem(productoTemp);
							if(jComboBoxid_productoBusquedaPedidosComprasPedidosCompras.getItemCount()>0) {
								jComboBoxid_productoBusquedaPedidosComprasPedidosCompras.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoPedidosComprasGenerico)throws Exception
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
				jComboBoxid_productoPedidosComprasGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoPedidosComprasGenerico!=null && jComboBoxid_productoPedidosComprasGenerico.getItemCount()>0) {
					jComboBoxid_productoPedidosComprasGenerico.setSelectedIndex(0);
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

					if(this.pedidoscompras!=null) {
						this.pedidoscompras.setLinea(lineaTemp);
					}

					if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
						this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_lineaPedidosCompras.setSelectedItem(lineaTemp);
					}
				} else {
					//jComboBoxid_lineaPedidosCompras.setSelectedItem(lineaTemp);
					if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
						if(this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_lineaPedidosCompras.getItemCount()>0) {
							this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_lineaPedidosCompras.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPedidosCompras") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineaTemp!=null && jComboBoxid_lineaBusquedaPedidosComprasPedidosCompras!=null) {
						jComboBoxid_lineaBusquedaPedidosComprasPedidosCompras.setSelectedItem(lineaTemp);
					} else {
						if(jComboBoxid_lineaBusquedaPedidosComprasPedidosCompras!=null) {
							//jComboBoxid_lineaBusquedaPedidosComprasPedidosCompras.setSelectedItem(lineaTemp);
							if(jComboBoxid_lineaBusquedaPedidosComprasPedidosCompras.getItemCount()>0) {
								jComboBoxid_lineaBusquedaPedidosComprasPedidosCompras.setSelectedIndex(0);
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
	public void setActualLineaForeignKeyGenerico(Long idLineaSeleccionado,JComboBox jComboBoxid_lineaPedidosComprasGenerico)throws Exception
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
				jComboBoxid_lineaPedidosComprasGenerico.setSelectedItem(lineaTemp);
			} else {
				if(jComboBoxid_lineaPedidosComprasGenerico!=null && jComboBoxid_lineaPedidosComprasGenerico.getItemCount()>0) {
					jComboBoxid_lineaPedidosComprasGenerico.setSelectedIndex(0);
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

					if(this.pedidoscompras!=null) {
						this.pedidoscompras.setLineaGrupo(lineagrupoTemp);
					}

					if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
						this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_grupoPedidosCompras.setSelectedItem(lineagrupoTemp);
					}
				} else {
					//jComboBoxid_linea_grupoPedidosCompras.setSelectedItem(lineagrupoTemp);
					if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
						if(this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_grupoPedidosCompras.getItemCount()>0) {
							this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_grupoPedidosCompras.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPedidosCompras") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineagrupoTemp!=null && jComboBoxid_linea_grupoBusquedaPedidosComprasPedidosCompras!=null) {
						jComboBoxid_linea_grupoBusquedaPedidosComprasPedidosCompras.setSelectedItem(lineagrupoTemp);
					} else {
						if(jComboBoxid_linea_grupoBusquedaPedidosComprasPedidosCompras!=null) {
							//jComboBoxid_linea_grupoBusquedaPedidosComprasPedidosCompras.setSelectedItem(lineagrupoTemp);
							if(jComboBoxid_linea_grupoBusquedaPedidosComprasPedidosCompras.getItemCount()>0) {
								jComboBoxid_linea_grupoBusquedaPedidosComprasPedidosCompras.setSelectedIndex(0);
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
	public void setActualLineaGrupoForeignKeyGenerico(Long idLineaGrupoSeleccionado,JComboBox jComboBoxid_linea_grupoPedidosComprasGenerico)throws Exception
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
				jComboBoxid_linea_grupoPedidosComprasGenerico.setSelectedItem(lineagrupoTemp);
			} else {
				if(jComboBoxid_linea_grupoPedidosComprasGenerico!=null && jComboBoxid_linea_grupoPedidosComprasGenerico.getItemCount()>0) {
					jComboBoxid_linea_grupoPedidosComprasGenerico.setSelectedIndex(0);
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

					if(this.pedidoscompras!=null) {
						this.pedidoscompras.setLineaCategoria(lineacategoriaTemp);
					}

					if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
						this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_categoriaPedidosCompras.setSelectedItem(lineacategoriaTemp);
					}
				} else {
					//jComboBoxid_linea_categoriaPedidosCompras.setSelectedItem(lineacategoriaTemp);
					if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
						if(this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_categoriaPedidosCompras.getItemCount()>0) {
							this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_categoriaPedidosCompras.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPedidosCompras") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineacategoriaTemp!=null && jComboBoxid_linea_categoriaBusquedaPedidosComprasPedidosCompras!=null) {
						jComboBoxid_linea_categoriaBusquedaPedidosComprasPedidosCompras.setSelectedItem(lineacategoriaTemp);
					} else {
						if(jComboBoxid_linea_categoriaBusquedaPedidosComprasPedidosCompras!=null) {
							//jComboBoxid_linea_categoriaBusquedaPedidosComprasPedidosCompras.setSelectedItem(lineacategoriaTemp);
							if(jComboBoxid_linea_categoriaBusquedaPedidosComprasPedidosCompras.getItemCount()>0) {
								jComboBoxid_linea_categoriaBusquedaPedidosComprasPedidosCompras.setSelectedIndex(0);
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
	public void setActualLineaCategoriaForeignKeyGenerico(Long idLineaCategoriaSeleccionado,JComboBox jComboBoxid_linea_categoriaPedidosComprasGenerico)throws Exception
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
				jComboBoxid_linea_categoriaPedidosComprasGenerico.setSelectedItem(lineacategoriaTemp);
			} else {
				if(jComboBoxid_linea_categoriaPedidosComprasGenerico!=null && jComboBoxid_linea_categoriaPedidosComprasGenerico.getItemCount()>0) {
					jComboBoxid_linea_categoriaPedidosComprasGenerico.setSelectedIndex(0);
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

					if(this.pedidoscompras!=null) {
						this.pedidoscompras.setLineaMarca(lineamarcaTemp);
					}

					if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
						this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_marcaPedidosCompras.setSelectedItem(lineamarcaTemp);
					}
				} else {
					//jComboBoxid_linea_marcaPedidosCompras.setSelectedItem(lineamarcaTemp);
					if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
						if(this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_marcaPedidosCompras.getItemCount()>0) {
							this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_marcaPedidosCompras.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPedidosCompras") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineamarcaTemp!=null && jComboBoxid_linea_marcaBusquedaPedidosComprasPedidosCompras!=null) {
						jComboBoxid_linea_marcaBusquedaPedidosComprasPedidosCompras.setSelectedItem(lineamarcaTemp);
					} else {
						if(jComboBoxid_linea_marcaBusquedaPedidosComprasPedidosCompras!=null) {
							//jComboBoxid_linea_marcaBusquedaPedidosComprasPedidosCompras.setSelectedItem(lineamarcaTemp);
							if(jComboBoxid_linea_marcaBusquedaPedidosComprasPedidosCompras.getItemCount()>0) {
								jComboBoxid_linea_marcaBusquedaPedidosComprasPedidosCompras.setSelectedIndex(0);
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
	public void setActualLineaMarcaForeignKeyGenerico(Long idLineaMarcaSeleccionado,JComboBox jComboBoxid_linea_marcaPedidosComprasGenerico)throws Exception
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
				jComboBoxid_linea_marcaPedidosComprasGenerico.setSelectedItem(lineamarcaTemp);
			} else {
				if(jComboBoxid_linea_marcaPedidosComprasGenerico!=null && jComboBoxid_linea_marcaPedidosComprasGenerico.getItemCount()>0) {
					jComboBoxid_linea_marcaPedidosComprasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoProductoServicioForeignKey(Long idTipoProductoServicioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoProductoServicio  tipoproductoservicioTemp=null;

			for(TipoProductoServicio tipoproductoservicioAux:tipoproductoserviciosForeignKey) {
				if(tipoproductoservicioAux.getId()!=null && tipoproductoservicioAux.getId().equals(idTipoProductoServicioSeleccionado)) {
					tipoproductoservicioTemp=tipoproductoservicioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoproductoservicioTemp!=null) {

					if(this.pedidoscompras!=null) {
						this.pedidoscompras.setTipoProductoServicio(tipoproductoservicioTemp);
					}

					if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
						this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_tipo_producto_servicioPedidosCompras.setSelectedItem(tipoproductoservicioTemp);
					}
				} else {
					//jComboBoxid_tipo_producto_servicioPedidosCompras.setSelectedItem(tipoproductoservicioTemp);
					if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
						if(this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_tipo_producto_servicioPedidosCompras.getItemCount()>0) {
							this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_tipo_producto_servicioPedidosCompras.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPedidosCompras") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoproductoservicioTemp!=null && jComboBoxid_tipo_producto_servicioBusquedaPedidosComprasPedidosCompras!=null) {
						jComboBoxid_tipo_producto_servicioBusquedaPedidosComprasPedidosCompras.setSelectedItem(tipoproductoservicioTemp);
					} else {
						if(jComboBoxid_tipo_producto_servicioBusquedaPedidosComprasPedidosCompras!=null) {
							//jComboBoxid_tipo_producto_servicioBusquedaPedidosComprasPedidosCompras.setSelectedItem(tipoproductoservicioTemp);
							if(jComboBoxid_tipo_producto_servicioBusquedaPedidosComprasPedidosCompras.getItemCount()>0) {
								jComboBoxid_tipo_producto_servicioBusquedaPedidosComprasPedidosCompras.setSelectedIndex(0);
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

	public String getActualTipoProductoServicioForeignKeyDescripcion(Long idTipoProductoServicioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoProductoServicio  tipoproductoservicioTemp=null;

			for(TipoProductoServicio tipoproductoservicioAux:tipoproductoserviciosForeignKey) {
				if(tipoproductoservicioAux.getId()!=null && tipoproductoservicioAux.getId().equals(idTipoProductoServicioSeleccionado)) {
					tipoproductoservicioTemp=tipoproductoservicioAux;
					break;
				}
			}


			sDescripcion=TipoProductoServicioConstantesFunciones.getTipoProductoServicioDescripcion(tipoproductoservicioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoProductoServicioForeignKeyGenerico(Long idTipoProductoServicioSeleccionado,JComboBox jComboBoxid_tipo_producto_servicioPedidosComprasGenerico)throws Exception
	{
		try
		{
			TipoProductoServicio  tipoproductoservicioTemp=null;

			for(TipoProductoServicio tipoproductoservicioAux:tipoproductoserviciosForeignKey) {
				if(tipoproductoservicioAux.getId()!=null && tipoproductoservicioAux.getId().equals(idTipoProductoServicioSeleccionado)) {
					tipoproductoservicioTemp=tipoproductoservicioAux;
					break;
				}
			}

			if(tipoproductoservicioTemp!=null) {
				jComboBoxid_tipo_producto_servicioPedidosComprasGenerico.setSelectedItem(tipoproductoservicioTemp);
			} else {
				if(jComboBoxid_tipo_producto_servicioPedidosComprasGenerico!=null && jComboBoxid_tipo_producto_servicioPedidosComprasGenerico.getItemCount()>0) {
					jComboBoxid_tipo_producto_servicioPedidosComprasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(PedidosCompras pedidoscompras,JComboBox jComboBoxid_empresaPedidosComprasGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaPedidosComprasGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_empresaPedidosCompras.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaPedidosComprasGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				pedidoscompras.setid_empresa(empresaAux.getId());
				pedidoscompras.setempresa_descripcion(PedidosComprasConstantesFunciones.getEmpresaDescripcion(empresaAux));
				pedidoscompras.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(PedidosCompras pedidoscompras,JComboBox jComboBoxid_sucursalPedidosComprasGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalPedidosComprasGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_sucursalPedidosCompras.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalPedidosComprasGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				pedidoscompras.setid_sucursal(sucursalAux.getId());
				pedidoscompras.setsucursal_descripcion(PedidosComprasConstantesFunciones.getSucursalDescripcion(sucursalAux));
				pedidoscompras.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(PedidosCompras pedidoscompras,JComboBox jComboBoxid_productoPedidosComprasGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoPedidosComprasGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_productoPedidosCompras.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoPedidosComprasGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				pedidoscompras.setid_producto(productoAux.getId());
				pedidoscompras.setproducto_descripcion(PedidosComprasConstantesFunciones.getProductoDescripcion(productoAux));
				pedidoscompras.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaForeignKey(PedidosCompras pedidoscompras,JComboBox jComboBoxid_lineaPedidosComprasGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_lineaPedidosComprasGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_lineaPedidosCompras.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_lineaPedidosComprasGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				pedidoscompras.setid_linea(lineaAux.getId());
				pedidoscompras.setlinea_descripcion(PedidosComprasConstantesFunciones.getLineaDescripcion(lineaAux));
				pedidoscompras.setLinea(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaGrupoForeignKey(PedidosCompras pedidoscompras,JComboBox jComboBoxid_linea_grupoPedidosComprasGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_grupoPedidosComprasGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_grupoPedidosCompras.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_grupoPedidosComprasGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				pedidoscompras.setid_linea_grupo(lineaAux.getId());
				pedidoscompras.setlineagrupo_descripcion(PedidosComprasConstantesFunciones.getLineaGrupoDescripcion(lineaAux));
				pedidoscompras.setLineaGrupo(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaCategoriaForeignKey(PedidosCompras pedidoscompras,JComboBox jComboBoxid_linea_categoriaPedidosComprasGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_categoriaPedidosComprasGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_categoriaPedidosCompras.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_categoriaPedidosComprasGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				pedidoscompras.setid_linea_categoria(lineaAux.getId());
				pedidoscompras.setlineacategoria_descripcion(PedidosComprasConstantesFunciones.getLineaCategoriaDescripcion(lineaAux));
				pedidoscompras.setLineaCategoria(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaMarcaForeignKey(PedidosCompras pedidoscompras,JComboBox jComboBoxid_linea_marcaPedidosComprasGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_marcaPedidosComprasGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_marcaPedidosCompras.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_marcaPedidosComprasGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				pedidoscompras.setid_linea_marca(lineaAux.getId());
				pedidoscompras.setlineamarca_descripcion(PedidosComprasConstantesFunciones.getLineaMarcaDescripcion(lineaAux));
				pedidoscompras.setLineaMarca(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoProductoServicioForeignKey(PedidosCompras pedidoscompras,JComboBox jComboBoxid_tipo_producto_servicioPedidosComprasGenerico)throws Exception
	{
		try
		{
			TipoProductoServicio  tipoproductoservicioAux=new TipoProductoServicio();

			if(jComboBoxid_tipo_producto_servicioPedidosComprasGenerico==null) {
				tipoproductoservicioAux=(TipoProductoServicio)this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_tipo_producto_servicioPedidosCompras.getSelectedItem();
			} else {
				tipoproductoservicioAux=(TipoProductoServicio)jComboBoxid_tipo_producto_servicioPedidosComprasGenerico.getSelectedItem();
			}

			if(tipoproductoservicioAux!=null && tipoproductoservicioAux.getId()!=null) {
				pedidoscompras.setid_tipo_producto_servicio(tipoproductoservicioAux.getId());
				pedidoscompras.settipoproductoservicio_descripcion(PedidosComprasConstantesFunciones.getTipoProductoServicioDescripcion(tipoproductoservicioAux));
				pedidoscompras.setTipoProductoServicio(tipoproductoservicioAux);			}
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

					if(!PedidosComprasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPedidosCompras!=null) { 
							this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_empresaPedidosCompras.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_empresaPedidosCompras.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPedidosCompras!=null) { 
					}

					if(!PedidosComprasJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PedidosComprasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPedidosCompras!=null) { 
							this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_sucursalPedidosCompras.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_sucursalPedidosCompras.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPedidosCompras!=null) { 
					}

					if(!PedidosComprasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


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

					if(!PedidosComprasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPedidosCompras!=null) { 
							this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_productoPedidosCompras.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_productoPedidosCompras.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPedidosCompras!=null) { 
					}

					if(!PedidosComprasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPedidosCompras") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PedidosComprasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoBusquedaPedidosComprasPedidosCompras.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoBusquedaPedidosComprasPedidosCompras.addItem(producto);
							}
						}

						if(!PedidosComprasJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PedidosComprasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPedidosCompras!=null) { 
							this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_lineaPedidosCompras.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_lineaPedidosCompras.addItem(linea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPedidosCompras!=null) { 
					}

					if(!PedidosComprasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPedidosCompras") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PedidosComprasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_lineaBusquedaPedidosComprasPedidosCompras.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jComboBoxid_lineaBusquedaPedidosComprasPedidosCompras.addItem(linea);
							}
						}

						if(!PedidosComprasJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PedidosComprasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPedidosCompras!=null) { 
							this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_grupoPedidosCompras.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_grupoPedidosCompras.addItem(lineagrupo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPedidosCompras!=null) { 
					}

					if(!PedidosComprasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPedidosCompras") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PedidosComprasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_grupoBusquedaPedidosComprasPedidosCompras.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jComboBoxid_linea_grupoBusquedaPedidosComprasPedidosCompras.addItem(lineagrupo);
							}
						}

						if(!PedidosComprasJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PedidosComprasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPedidosCompras!=null) { 
							this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_categoriaPedidosCompras.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_categoriaPedidosCompras.addItem(lineacategoria);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPedidosCompras!=null) { 
					}

					if(!PedidosComprasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPedidosCompras") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PedidosComprasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_categoriaBusquedaPedidosComprasPedidosCompras.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jComboBoxid_linea_categoriaBusquedaPedidosComprasPedidosCompras.addItem(lineacategoria);
							}
						}

						if(!PedidosComprasJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PedidosComprasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPedidosCompras!=null) { 
							this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_marcaPedidosCompras.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_marcaPedidosCompras.addItem(lineamarca);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPedidosCompras!=null) { 
					}

					if(!PedidosComprasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPedidosCompras") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PedidosComprasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_marcaBusquedaPedidosComprasPedidosCompras.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jComboBoxid_linea_marcaBusquedaPedidosComprasPedidosCompras.addItem(lineamarca);
							}
						}

						if(!PedidosComprasJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoProductoServiciosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoProductoServicio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PedidosComprasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPedidosCompras!=null) { 
							this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_tipo_producto_servicioPedidosCompras.removeAllItems();

							for(TipoProductoServicio tipoproductoservicio:this.tipoproductoserviciosForeignKey) {
								this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_tipo_producto_servicioPedidosCompras.addItem(tipoproductoservicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPedidosCompras!=null) { 
					}

					if(!PedidosComprasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPedidosCompras") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PedidosComprasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_producto_servicioBusquedaPedidosComprasPedidosCompras.removeAllItems();

							for(TipoProductoServicio tipoproductoservicio:this.tipoproductoserviciosForeignKey) {
								this.jComboBoxid_tipo_producto_servicioBusquedaPedidosComprasPedidosCompras.addItem(tipoproductoservicio);
							}
						}

						if(!PedidosComprasJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
							this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_empresaPedidosCompras.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
							this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_empresaPedidosCompras.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
							this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_sucursalPedidosCompras.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
							this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_sucursalPedidosCompras.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameProductoForeignKey(Producto producto,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
							this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_productoPedidosCompras.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
							this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_productoPedidosCompras.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoBusquedaPedidosComprasPedidosCompras.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoBusquedaPedidosComprasPedidosCompras.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
							this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_lineaPedidosCompras.setSelectedItem(linea);
						}
					} else {
						if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
							this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_lineaPedidosCompras.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_lineaBusquedaPedidosComprasPedidosCompras.setSelectedItem(linea);
						} else {
							this.jComboBoxid_lineaBusquedaPedidosComprasPedidosCompras.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
							this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_grupoPedidosCompras.setSelectedItem(lineagrupo);
						}
					} else {
						if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
							this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_grupoPedidosCompras.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_grupoBusquedaPedidosComprasPedidosCompras.setSelectedItem(lineagrupo);
						} else {
							this.jComboBoxid_linea_grupoBusquedaPedidosComprasPedidosCompras.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
							this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_categoriaPedidosCompras.setSelectedItem(lineacategoria);
						}
					} else {
						if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
							this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_categoriaPedidosCompras.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_categoriaBusquedaPedidosComprasPedidosCompras.setSelectedItem(lineacategoria);
						} else {
							this.jComboBoxid_linea_categoriaBusquedaPedidosComprasPedidosCompras.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
							this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_marcaPedidosCompras.setSelectedItem(lineamarca);
						}
					} else {
						if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
							this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_marcaPedidosCompras.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_marcaBusquedaPedidosComprasPedidosCompras.setSelectedItem(lineamarca);
						} else {
							this.jComboBoxid_linea_marcaBusquedaPedidosComprasPedidosCompras.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoProductoServicioForeignKey(TipoProductoServicio tipoproductoservicio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
							this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_tipo_producto_servicioPedidosCompras.setSelectedItem(tipoproductoservicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
							this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_tipo_producto_servicioPedidosCompras.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_producto_servicioBusquedaPedidosComprasPedidosCompras.setSelectedItem(tipoproductoservicio);
						} else {
							this.jComboBoxid_tipo_producto_servicioBusquedaPedidosComprasPedidosCompras.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesPedidosCompras() throws Exception {
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
		
	public PedidosComprasParameterReturnGeneral getPedidosComprasParameterGeneral() {
		return this.pedidoscomprasParameterGeneral;
	}
	
	public void setPedidosComprasParameterGeneral(PedidosComprasParameterReturnGeneral pedidoscomprasParameterGeneral) {
		this.pedidoscomprasParameterGeneral = pedidoscomprasParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPedidosCompras() {
		return isPermisoTodoPedidosCompras;
	}

	public void setIsPermisoTodoPedidosCompras(Boolean isPermisoTodoPedidosCompras) {
		this.isPermisoTodoPedidosCompras = isPermisoTodoPedidosCompras;
	}

	public Boolean getIsPermisoNuevoPedidosCompras() {
		return isPermisoNuevoPedidosCompras;
	}

	public void setIsPermisoNuevoPedidosCompras(Boolean isPermisoNuevoPedidosCompras) {
		this.isPermisoNuevoPedidosCompras = isPermisoNuevoPedidosCompras;
	}

	public Boolean getIsPermisoActualizarPedidosCompras() {
		return isPermisoActualizarPedidosCompras;
	}

	public void setIsPermisoActualizarPedidosCompras(Boolean isPermisoActualizarPedidosCompras) {
		this.isPermisoActualizarPedidosCompras = isPermisoActualizarPedidosCompras;
	}

	public Boolean getIsPermisoEliminarPedidosCompras() {
		return isPermisoEliminarPedidosCompras;
	}

	public void setIsPermisoEliminarPedidosCompras(Boolean isPermisoEliminarPedidosCompras) {
		this.isPermisoEliminarPedidosCompras = isPermisoEliminarPedidosCompras;
	}

	public Boolean getIsPermisoGuardarCambiosPedidosCompras() {
		return isPermisoGuardarCambiosPedidosCompras;
	}

	public void setIsPermisoGuardarCambiosPedidosCompras(Boolean isPermisoGuardarCambiosPedidosCompras) {
		this.isPermisoGuardarCambiosPedidosCompras = isPermisoGuardarCambiosPedidosCompras;
	}
	
	public Boolean getIsPermisoConsultaPedidosCompras() {
		return isPermisoConsultaPedidosCompras;
	}

	public void setIsPermisoConsultaPedidosCompras(Boolean isPermisoConsultaPedidosCompras) {
		this.isPermisoConsultaPedidosCompras = isPermisoConsultaPedidosCompras;
	}

	public Boolean getIsPermisoBusquedaPedidosCompras() {
		return isPermisoBusquedaPedidosCompras;
	}

	public void setIsPermisoBusquedaPedidosCompras(Boolean isPermisoBusquedaPedidosCompras) {
		this.isPermisoBusquedaPedidosCompras = isPermisoBusquedaPedidosCompras;
	}

	public Boolean getIsPermisoReportePedidosCompras() {
		return isPermisoReportePedidosCompras;
	}

	public void setIsPermisoReportePedidosCompras(Boolean isPermisoReportePedidosCompras) {
		this.isPermisoReportePedidosCompras = isPermisoReportePedidosCompras;
	}
	
	public Boolean getIsPermisoPaginacionMedioPedidosCompras() {
		return isPermisoPaginacionMedioPedidosCompras;
	}

	public void setIsPermisoPaginacionMedioPedidosCompras(Boolean isPermisoPaginacionMedioPedidosCompras) {
		this.isPermisoPaginacionMedioPedidosCompras = isPermisoPaginacionMedioPedidosCompras;
	}
	
	public Boolean getIsPermisoPaginacionTodoPedidosCompras() {
		return isPermisoPaginacionTodoPedidosCompras;
	}

	public void setIsPermisoPaginacionTodoPedidosCompras(Boolean isPermisoPaginacionTodoPedidosCompras) {
		this.isPermisoPaginacionTodoPedidosCompras = isPermisoPaginacionTodoPedidosCompras;
	}
	
	public Boolean getIsPermisoPaginacionAltoPedidosCompras() {
		return isPermisoPaginacionAltoPedidosCompras;
	}

	public void setIsPermisoPaginacionAltoPedidosCompras(Boolean isPermisoPaginacionAltoPedidosCompras) {
		this.isPermisoPaginacionAltoPedidosCompras = isPermisoPaginacionAltoPedidosCompras;
	}
	
	public Boolean getIsPermisoCopiarPedidosCompras() {
		return isPermisoCopiarPedidosCompras;
	}

	public void setIsPermisoCopiarPedidosCompras(Boolean isPermisoCopiarPedidosCompras) {
		this.isPermisoCopiarPedidosCompras = isPermisoCopiarPedidosCompras;
	}
	
	public Boolean getIsPermisoVerFormPedidosCompras() {
		return isPermisoVerFormPedidosCompras;
	}

	public void setIsPermisoVerFormPedidosCompras(Boolean isPermisoVerFormPedidosCompras) {
		this.isPermisoVerFormPedidosCompras = isPermisoVerFormPedidosCompras;
	}
	
	public Boolean getIsPermisoDuplicarPedidosCompras() {
		return isPermisoDuplicarPedidosCompras;
	}

	public void setIsPermisoDuplicarPedidosCompras(Boolean isPermisoDuplicarPedidosCompras) {
		this.isPermisoDuplicarPedidosCompras = isPermisoDuplicarPedidosCompras;
	}
	
	public Boolean getIsPermisoOrdenPedidosCompras() {
		return isPermisoOrdenPedidosCompras;
	}

	public void setIsPermisoOrdenPedidosCompras(Boolean isPermisoOrdenPedidosCompras) {
		this.isPermisoOrdenPedidosCompras = isPermisoOrdenPedidosCompras;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPedidosCompras() {
		return isVisibilidadCeldaNuevoPedidosCompras;
	}

	public void setIsVisibilidadCeldaNuevoPedidosCompras(Boolean isVisibilidadCeldaNuevoPedidosCompras) {
		this.isVisibilidadCeldaNuevoPedidosCompras = isVisibilidadCeldaNuevoPedidosCompras;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPedidosCompras() {
		return isVisibilidadCeldaDuplicarPedidosCompras;
	}

	public void setIsVisibilidadCeldaDuplicarPedidosCompras(Boolean isVisibilidadCeldaDuplicarPedidosCompras) {
		this.isVisibilidadCeldaDuplicarPedidosCompras = isVisibilidadCeldaDuplicarPedidosCompras;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPedidosCompras() {
		return isVisibilidadCeldaCopiarPedidosCompras;
	}

	public void setIsVisibilidadCeldaCopiarPedidosCompras(Boolean isVisibilidadCeldaCopiarPedidosCompras) {
		this.isVisibilidadCeldaCopiarPedidosCompras = isVisibilidadCeldaCopiarPedidosCompras;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPedidosCompras() {
		return isVisibilidadCeldaVerFormPedidosCompras;
	}

	public void setIsVisibilidadCeldaVerFormPedidosCompras(Boolean isVisibilidadCeldaVerFormPedidosCompras) {
		this.isVisibilidadCeldaVerFormPedidosCompras = isVisibilidadCeldaVerFormPedidosCompras;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPedidosCompras() {
		return isVisibilidadCeldaOrdenPedidosCompras;
	}

	public void setIsVisibilidadCeldaOrdenPedidosCompras(Boolean isVisibilidadCeldaOrdenPedidosCompras) {
		this.isVisibilidadCeldaOrdenPedidosCompras = isVisibilidadCeldaOrdenPedidosCompras;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPedidosCompras() {
		return isVisibilidadCeldaNuevoRelacionesPedidosCompras;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPedidosCompras(Boolean isVisibilidadCeldaNuevoRelacionesPedidosCompras) {
		this.isVisibilidadCeldaNuevoRelacionesPedidosCompras = isVisibilidadCeldaNuevoRelacionesPedidosCompras;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPedidosCompras() {
		return isVisibilidadCeldaModificarPedidosCompras;
	}

	public void setIsVisibilidadCeldaModificarPedidosCompras(Boolean isVisibilidadCeldaModificarPedidosCompras) {
		this.isVisibilidadCeldaModificarPedidosCompras = isVisibilidadCeldaModificarPedidosCompras;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPedidosCompras() {
		return isVisibilidadCeldaActualizarPedidosCompras;
	}

	public void setIsVisibilidadCeldaActualizarPedidosCompras(Boolean isVisibilidadCeldaActualizarPedidosCompras) {
		this.isVisibilidadCeldaActualizarPedidosCompras = isVisibilidadCeldaActualizarPedidosCompras;
	}

	public Boolean getIsVisibilidadCeldaEliminarPedidosCompras() {
		return isVisibilidadCeldaEliminarPedidosCompras;
	}

	public void setIsVisibilidadCeldaEliminarPedidosCompras(Boolean isVisibilidadCeldaEliminarPedidosCompras) {
		this.isVisibilidadCeldaEliminarPedidosCompras = isVisibilidadCeldaEliminarPedidosCompras;
	}

	public Boolean getIsVisibilidadCeldaCancelarPedidosCompras() {
		return isVisibilidadCeldaCancelarPedidosCompras;
	}

	public void setIsVisibilidadCeldaCancelarPedidosCompras(Boolean isVisibilidadCeldaCancelarPedidosCompras) {
		this.isVisibilidadCeldaCancelarPedidosCompras = isVisibilidadCeldaCancelarPedidosCompras;
	}

	public Boolean getIsVisibilidadCeldaGuardarPedidosCompras() {
		return isVisibilidadCeldaGuardarPedidosCompras;
	}

	public void setIsVisibilidadCeldaGuardarPedidosCompras(Boolean isVisibilidadCeldaGuardarPedidosCompras) {
		this.isVisibilidadCeldaGuardarPedidosCompras = isVisibilidadCeldaGuardarPedidosCompras;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPedidosCompras() {
		return isVisibilidadCeldaGuardarCambiosPedidosCompras;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPedidosCompras(Boolean isVisibilidadCeldaGuardarCambiosPedidosCompras) {
		this.isVisibilidadCeldaGuardarCambiosPedidosCompras = isVisibilidadCeldaGuardarCambiosPedidosCompras;
	}
		
	public PedidosComprasSessionBean getpedidoscomprasSessionBean() {
		return this.pedidoscomprasSessionBean;
	}
	
	public void setpedidoscomprasSessionBean(PedidosComprasSessionBean pedidoscomprasSessionBean) {
		this.pedidoscomprasSessionBean=pedidoscomprasSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPedidosCompras() {
		return this.isVisibilidadBusquedaPedidosCompras;
	}

	public void setisVisibilidadBusquedaPedidosCompras(Boolean isVisibilidadBusquedaPedidosCompras) {
		this.isVisibilidadBusquedaPedidosCompras=isVisibilidadBusquedaPedidosCompras;
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

	public Boolean getisVisibilidadFK_IdTipoProductoServicio() {
		return this.isVisibilidadFK_IdTipoProductoServicio;
	}

	public void setisVisibilidadFK_IdTipoProductoServicio(Boolean isVisibilidadFK_IdTipoProductoServicio) {
		this.isVisibilidadFK_IdTipoProductoServicio=isVisibilidadFK_IdTipoProductoServicio;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(PedidosCompras pedidoscompras)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(pedidoscompras,null);
				this.setActualParaGuardarSucursalForeignKey(pedidoscompras,null);
				this.setActualParaGuardarProductoForeignKey(pedidoscompras,null);
				this.setActualParaGuardarLineaForeignKey(pedidoscompras,null);
				this.setActualParaGuardarLineaGrupoForeignKey(pedidoscompras,null);
				this.setActualParaGuardarLineaCategoriaForeignKey(pedidoscompras,null);
				this.setActualParaGuardarLineaMarcaForeignKey(pedidoscompras,null);
				this.setActualParaGuardarTipoProductoServicioForeignKey(pedidoscompras,null);
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
	
	public void bugActualizarReferenciaActual(PedidosCompras pedidoscompras,PedidosCompras pedidoscomprasAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPedidosCompras(pedidoscompras);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		pedidoscomprasAux.setId(pedidoscompras.getId());
		pedidoscomprasAux.setVersionRow(pedidoscompras.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(PedidosCompras pedidoscomprasLocal) throws Exception {
		
		if(this.pedidoscomprasSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PedidosCompras pedidoscomprasLocal) throws Exception {	
		if(this.pedidoscomprasSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				pedidoscomprasLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				pedidoscomprasLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				pedidoscomprasLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineaBeanSwingJInternalFrameLocal.actualizarLista(lineaBeanSwingJInternalFrameLocal.linea,this.lineasForeignKey);

				lineaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineaBeanSwingJInternalFrameLocal.linea);

				pedidoscomprasLocal.setLinea(lineaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey("Formulario");
				this.setActualLineaForeignKey(lineaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineagrupoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineagrupoBeanSwingJInternalFrameLocal.getlinea(),true);
				lineagrupoBeanSwingJInternalFrameLocal.actualizarLista(lineagrupoBeanSwingJInternalFrameLocal.linea,this.lineagruposForeignKey);

				lineagrupoBeanSwingJInternalFrameLocal.actualizarRelaciones(lineagrupoBeanSwingJInternalFrameLocal.linea);

				pedidoscomprasLocal.setLineaGrupo(lineagrupoBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey("Formulario");
				this.setActualLineaGrupoForeignKey(lineagrupoBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineacategoriaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineacategoriaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineacategoriaBeanSwingJInternalFrameLocal.actualizarLista(lineacategoriaBeanSwingJInternalFrameLocal.linea,this.lineacategoriasForeignKey);

				lineacategoriaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				pedidoscomprasLocal.setLineaCategoria(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaCategoria();
				this.cargarCombosFrameLineaCategoriasForeignKey("Formulario");
				this.setActualLineaCategoriaForeignKey(lineacategoriaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineamarcaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineamarcaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineamarcaBeanSwingJInternalFrameLocal.actualizarLista(lineamarcaBeanSwingJInternalFrameLocal.linea,this.lineamarcasForeignKey);

				lineamarcaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineamarcaBeanSwingJInternalFrameLocal.linea);

				pedidoscomprasLocal.setLineaMarca(lineamarcaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaMarca();
				this.cargarCombosFrameLineaMarcasForeignKey("Formulario");
				this.setActualLineaMarcaForeignKey(lineamarcaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoProductoServicioDetalleFormJInternalFrame.class)) {
				TipoProductoServicioBeanSwingJInternalFrame tipoproductoservicioBeanSwingJInternalFrameLocal=(TipoProductoServicioBeanSwingJInternalFrame) ((TipoProductoServicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoproductoservicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoProductoServicio(tipoproductoservicioBeanSwingJInternalFrameLocal.gettipoproductoservicio(),true);
				tipoproductoservicioBeanSwingJInternalFrameLocal.actualizarLista(tipoproductoservicioBeanSwingJInternalFrameLocal.tipoproductoservicio,this.tipoproductoserviciosForeignKey);

				tipoproductoservicioBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoproductoservicioBeanSwingJInternalFrameLocal.tipoproductoservicio);

				pedidoscomprasLocal.setTipoProductoServicio(tipoproductoservicioBeanSwingJInternalFrameLocal.tipoproductoservicio);

				this.addItemDefectoCombosForeignKeyTipoProductoServicio();
				this.cargarCombosFrameTipoProductoServiciosForeignKey("Formulario");
				this.setActualTipoProductoServicioForeignKey(tipoproductoservicioBeanSwingJInternalFrameLocal.tipoproductoservicio.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPedidosComprasActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.pedidoscompras =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.pedidoscompras =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = pedidoscomprasValidator.getInvalidValues(this.pedidoscompras);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PedidosCompras pedidoscompras,List<PedidosCompras> pedidoscomprass) throws Exception {
	}		
	
	public void actualizarSelectedLista(PedidosCompras pedidoscompras,List<PedidosCompras> pedidoscomprass) throws Exception {
		try	{			
			PedidosComprasConstantesFunciones.actualizarSelectedLista(pedidoscompras,pedidoscomprass);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PedidosCompras> pedidoscomprassLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				pedidoscomprassLocal=this.pedidoscomprasLogic.getPedidosComprass();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				pedidoscomprassLocal=this.pedidoscomprass;
			}
			//ARCHITECTURE
		
			for(PedidosCompras pedidoscomprasLocal:pedidoscomprassLocal) {
				if(this.permiteMantenimiento(pedidoscomprasLocal) && pedidoscomprasLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PedidosComprasConstantesFunciones.getPedidosComprasLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PedidosComprasConstantesFunciones.SECUENCIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidosCompras.jLabelsecuencialPedidosCompras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidosComprasConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidosCompras.jLabelfecha_emisionPedidosCompras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidosComprasConstantesFunciones.FECHAENTREGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidosCompras.jLabelfecha_entregaPedidosCompras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidosComprasConstantesFunciones.NOMBREPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidosCompras.jLabelnombre_productoPedidosCompras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidosComprasConstantesFunciones.NOMBREUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidosCompras.jLabelnombre_unidadPedidosCompras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidosComprasConstantesFunciones.CANTIDADPEDIDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidosCompras.jLabelcantidad_pedidoPedidosCompras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidosComprasConstantesFunciones.CANTIDADENTREGADA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidosCompras.jLabelcantidad_entregadaPedidosCompras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidosComprasConstantesFunciones.CANTIDADPENDIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidosCompras.jLabelcantidad_pendientePedidosCompras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidosComprasConstantesFunciones.CODIGOPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidosCompras.jLabelcodigo_productoPedidosCompras,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidosCompras.jLabelsecuencialPedidosCompras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidosCompras.jLabelfecha_emisionPedidosCompras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidosCompras.jLabelfecha_entregaPedidosCompras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidosCompras.jLabelnombre_productoPedidosCompras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidosCompras.jLabelnombre_unidadPedidosCompras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidosCompras.jLabelcantidad_pedidoPedidosCompras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidosCompras.jLabelcantidad_entregadaPedidosCompras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidosCompras.jLabelcantidad_pendientePedidosCompras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidosCompras.jLabelcodigo_productoPedidosCompras,"");
		
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
		this.iIdNuevoPedidosCompras--;	
		
		
		this.pedidoscomprasAux=new PedidosCompras();
		
		this.pedidoscomprasAux.setId(this.iIdNuevoPedidosCompras);
		this.pedidoscomprasAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.pedidoscomprasLogic.getPedidosComprass().add(this.pedidoscomprasAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.pedidoscomprass.add(this.pedidoscomprasAux);
		}
		//ARCHITECTURE
		
		this.pedidoscompras=this.pedidoscomprasAux;
		
		if(PedidosComprasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPedidosCompras(this.pedidoscompras);
			this.setVariablesObjetoActualToFormularioForeignKeyPedidosCompras(this.pedidoscompras);
		}
				
		//this.setDefaultControlesPedidosCompras();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPedidosCompras();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPedidosCompras();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPedidosCompras();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPedidosCompras(this.pedidoscomprasBean,this.pedidoscompras,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPedidosCompras(this.pedidoscomprasReturnGeneral,this.pedidoscomprasBean,false);
		
		if(this.pedidoscomprasReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPedidosCompras(this.pedidoscomprasReturnGeneral.getPedidosCompras());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPedidosCompras(this.pedidoscomprasReturnGeneral.getPedidosCompras());
		}
		
		if(this.pedidoscomprasReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPedidosCompras(this.pedidoscomprasReturnGeneral.getPedidosCompras(),classes);//this.pedidoscomprasBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPedidosCompras(this.pedidoscompras,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPedidosCompras();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPedidosCompras();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PedidosComprasBeanSwingJInternalFrameAdditional.RecargarFormPedidosCompras(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPedidosCompras(false);
						
			if(pedidoscomprasSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(PedidosComprasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPedidosCompras();
			}
			
			this.actualizarVisualTableDatosPedidosCompras();
			
			this.jTableDatosPedidosCompras.setRowSelectionInterval(this.getIndiceNuevoPedidosCompras(), this.getIndiceNuevoPedidosCompras());
			
			this.seleccionarFilaTablaPedidosComprasActual();
						
			this.actualizarEstadoCeldasBotonesPedidosCompras("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPedidosCompras(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPedidosCompras.jDateChooserfecha_emision_desdePedidosCompras.setEnabled(isHabilitar && this.pedidoscomprasConstantesFunciones.activarfecha_emision_desdePedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jDateChooserfecha_emision_hastaPedidosCompras.setEnabled(isHabilitar && this.pedidoscomprasConstantesFunciones.activarfecha_emision_hastaPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jTextFieldsecuencialPedidosCompras.setEnabled(isHabilitar && this.pedidoscomprasConstantesFunciones.activarsecuencialPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jDateChooserfecha_emisionPedidosCompras.setEnabled(isHabilitar && this.pedidoscomprasConstantesFunciones.activarfecha_emisionPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jDateChooserfecha_entregaPedidosCompras.setEnabled(isHabilitar && this.pedidoscomprasConstantesFunciones.activarfecha_entregaPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jTextAreanombre_productoPedidosCompras.setEnabled(isHabilitar && this.pedidoscomprasConstantesFunciones.activarnombre_productoPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jTextFieldnombre_unidadPedidosCompras.setEnabled(isHabilitar && this.pedidoscomprasConstantesFunciones.activarnombre_unidadPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jTextFieldcantidad_pedidoPedidosCompras.setEnabled(isHabilitar && this.pedidoscomprasConstantesFunciones.activarcantidad_pedidoPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jTextFieldcantidad_entregadaPedidosCompras.setEnabled(isHabilitar && this.pedidoscomprasConstantesFunciones.activarcantidad_entregadaPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jTextFieldcantidad_pendientePedidosCompras.setEnabled(isHabilitar && this.pedidoscomprasConstantesFunciones.activarcantidad_pendientePedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jTextFieldcodigo_productoPedidosCompras.setEnabled(isHabilitar && this.pedidoscomprasConstantesFunciones.activarcodigo_productoPedidosCompras);	
		//
		this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_empresaPedidosCompras.setEnabled(isHabilitar && this.pedidoscomprasConstantesFunciones.activarid_empresaPedidosCompras);//
		this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_sucursalPedidosCompras.setEnabled(isHabilitar && this.pedidoscomprasConstantesFunciones.activarid_sucursalPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_productoPedidosCompras.setEnabled(isHabilitar && this.pedidoscomprasConstantesFunciones.activarid_productoPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_lineaPedidosCompras.setEnabled(isHabilitar && this.pedidoscomprasConstantesFunciones.activarid_lineaPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_grupoPedidosCompras.setEnabled(isHabilitar && this.pedidoscomprasConstantesFunciones.activarid_linea_grupoPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_categoriaPedidosCompras.setEnabled(isHabilitar && this.pedidoscomprasConstantesFunciones.activarid_linea_categoriaPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_marcaPedidosCompras.setEnabled(isHabilitar && this.pedidoscomprasConstantesFunciones.activarid_linea_marcaPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_tipo_producto_servicioPedidosCompras.setEnabled(isHabilitar && this.pedidoscomprasConstantesFunciones.activarid_tipo_producto_servicioPedidosCompras);
	};
	
	public void setDefaultControlesPedidosCompras() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPedidosCompras(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.pedidoscomprasSessionBean.setConGuardarRelaciones(true);			
			this.pedidoscomprasSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPedidosCompras.jTabbedPaneRelacionesPedidosCompras.setVisible(true);
			
					
		} else {
			//this.pedidoscomprasSessionBean.setConGuardarRelaciones(false);			
			this.pedidoscomprasSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPedidosCompras.jTabbedPaneRelacionesPedidosCompras.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoPedidosCompras() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PedidosCompras pedidoscomprasAux:this.pedidoscomprasLogic.getPedidosComprass()) {
				if(pedidoscomprasAux.getId().equals(this.iIdNuevoPedidosCompras)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PedidosCompras pedidoscomprasAux:this.pedidoscomprass) {
				if(pedidoscomprasAux.getId().equals(this.iIdNuevoPedidosCompras)) {
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
	
	public int getIndiceActualPedidosCompras(PedidosCompras pedidoscompras,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PedidosCompras pedidoscomprasAux:this.pedidoscomprasLogic.getPedidosComprass()) {
				if(pedidoscomprasAux.getId().equals(pedidoscompras.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PedidosCompras pedidoscomprasAux:this.pedidoscomprass) {
				if(pedidoscomprasAux.getId().equals(pedidoscompras.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPedidosCompras(PedidosCompras pedidoscomprasOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PedidosCompras pedidoscomprasAux:this.pedidoscomprasLogic.getPedidosComprass()) {
				if(pedidoscomprasAux.getPedidosComprasOriginal().getId().equals(pedidoscomprasOriginal.getId())) {
					existe=true;
					pedidoscomprasOriginal.setId(pedidoscomprasAux.getId());
					pedidoscomprasOriginal.setVersionRow(pedidoscomprasAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PedidosCompras pedidoscomprasAux:this.pedidoscomprass) {
				if(pedidoscomprasAux.getPedidosComprasOriginal().getId().equals(pedidoscomprasOriginal.getId())) {
					existe=true;
					pedidoscomprasOriginal.setId(pedidoscomprasAux.getId());
					pedidoscomprasOriginal.setVersionRow(pedidoscomprasAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPedidosCompras(Boolean esParaCancelar) throws Exception {
		pedidoscomprassAux=new ArrayList<PedidosCompras>();
		pedidoscomprasAux=new PedidosCompras();
		
		if(!this.pedidoscomprasSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PedidosCompras pedidoscomprasAux:this.pedidoscomprasLogic.getPedidosComprass()) {
					if(pedidoscomprasAux.getId()<0) {
						pedidoscomprassAux.add(pedidoscomprasAux);
					}		
				}
				this.iIdNuevoPedidosCompras=0L;
				this.pedidoscomprasLogic.getPedidosComprass().removeAll(pedidoscomprassAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PedidosCompras pedidoscomprasAux:this.pedidoscomprass) {
					if(pedidoscomprasAux.getId()<0) {
						pedidoscomprassAux.add(pedidoscomprasAux);
					}		
				}
				this.iIdNuevoPedidosCompras=0L;
				this.pedidoscomprass.removeAll(pedidoscomprassAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPedidosCompras 
					&& this.pedidoscomprasLogic.getPedidosComprass().size()>0
					) {
					pedidoscomprasAux=this.pedidoscomprasLogic.getPedidosComprass().get(this.pedidoscomprasLogic.getPedidosComprass().size() - 1);
				
					if(pedidoscomprasAux.getId()<0) {
						this.pedidoscomprasLogic.getPedidosComprass().remove(pedidoscomprasAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPedidosCompras && this.pedidoscomprass.size()>0) {
					pedidoscomprasAux=this.pedidoscomprass.get(this.pedidoscomprass.size() - 1);
				
					if(pedidoscomprasAux.getId()<0) {
						this.pedidoscomprass.remove(pedidoscomprasAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPedidosCompras(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(pedidoscompras.getId()<0) {
				this.pedidoscomprasLogic.getPedidosComprass().remove(this.pedidoscompras);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(pedidoscompras.getId()<0) {
				this.pedidoscomprass.remove(this.pedidoscompras);
			}
		}			
	}
	
	public void setEstadosInicialesPedidosCompras(List<PedidosCompras> pedidoscomprassAux) throws Exception {
		PedidosComprasConstantesFunciones.setEstadosInicialesPedidosCompras(pedidoscomprassAux);
	}
	
	public void setEstadosInicialesPedidosCompras(PedidosCompras pedidoscomprasAux) throws Exception {
		PedidosComprasConstantesFunciones.setEstadosInicialesPedidosCompras(pedidoscomprasAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPedidosComprasActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPedidosCompras("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPedidosComprasActual()) {
				if(!this.isEsNuevoPedidosCompras) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPedidosCompras("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPedidosCompras=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPedidosComprasActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Pedidos Compras ?", "MANTENIMIENTO DE Pedidos Compras", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPedidosCompras("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PedidosCompras pedidoscompras) throws Exception {
		PedidosComprasConstantesFunciones.seleccionarAsignar(this.pedidoscompras,pedidoscompras);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPedidosCompras=this.isPermisoActualizarOriginalPedidosCompras;
			
			
			this.seleccionarAsignar(pedidoscompras);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesPedidosCompras("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.pedidoscomprasSessionBean.setsFuncionBusquedaRapida(this.pedidoscomprasSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoPedidosCompras) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPedidosCompras(esParaCancelar);				
				this.cancelarNuevoPedidosCompras(esParaCancelar);								
			}
			
			this.pedidoscompras=new PedidosCompras();
			
			this.inicializarPedidosCompras();
			
			this.actualizarEstadoCeldasBotonesPedidosCompras("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPedidosCompras() throws Exception {
		try {
			PedidosComprasConstantesFunciones.inicializarPedidosCompras(this.pedidoscompras);
			
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
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.pedidoscomprasLogic.getPedidosComprass().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePedidosComprass(String sAccionBusqueda,List<PedidosCompras> pedidoscomprassParaReportes) throws Exception {
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
					sPathReporteFinal="PedidosCompras"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PedidosComprasMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PedidosComprasMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PedidosCompras"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Pedidos Comprases");		
		parameters.put("busquedapor", PedidosComprasConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePedidosCompras=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PedidosComprasConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PedidosComprasConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePedidosCompras=new JRBeanArrayDataSource(PedidosComprasJInternalFrame.TraerPedidosComprasBeans(pedidoscomprassParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePedidosCompras);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PedidosComprasConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PedidosComprasConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PedidosComprasBean.TraerPedidosComprasBeans(pedidoscomprassParaReportes).toArray()));
							
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
				this.generarExcelReportePedidosComprass(sAccionBusqueda,sTipoArchivoReporte,pedidoscomprassParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPedidosComprass(sAccionBusqueda,sTipoArchivoReporte,pedidoscomprassParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPedidosComprasActionPerformed(null);
					//this.generarExcelReportePedidosComprass(sAccionBusqueda,sTipoArchivoReporte,pedidoscomprassParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPedidosComprass(sAccionBusqueda,sTipoArchivoReporte,pedidoscomprassParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPedidosComprass(sAccionBusqueda,sTipoArchivoReporte,pedidoscomprassParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPedidosComprass(sAccionBusqueda,sTipoArchivoReporte,pedidoscomprassParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePedidosComprass(String sAccionBusqueda,String sTipoArchivoReporte,List<PedidosCompras> pedidoscomprassParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pedidoscompras";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PedidosComprass");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPedidosCompras("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PedidosCompras pedidoscompras : pedidoscomprassParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PedidosComprasConstantesFunciones.generarExcelReporteDataPedidosCompras("NORMAL",row,workbook,pedidoscompras,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pedidoscomprasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pedidos Compras",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPedidosCompras(String sTipo,Row row,Workbook workbook) {
		
		PedidosComprasConstantesFunciones.generarExcelReporteHeaderPedidosCompras(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPedidosComprass(String sAccionBusqueda,String sTipoArchivoReporte,List<PedidosCompras> pedidoscomprassParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pedidoscompras_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PedidosComprass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PedidosCompras pedidoscompras : pedidoscomprassParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PedidosComprasConstantesFunciones.getPedidosComprasDescripcion(pedidoscompras));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidosComprasConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidoscompras.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidosComprasConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidoscompras.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidosComprasConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidoscompras.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidosComprasConstantesFunciones.LABEL_IDLINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_IDLINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidoscompras.getlinea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidosComprasConstantesFunciones.LABEL_IDLINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_IDLINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidoscompras.getlineagrupo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidosComprasConstantesFunciones.LABEL_IDLINEACATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_IDLINEACATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidoscompras.getlineacategoria_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidosComprasConstantesFunciones.LABEL_IDLINEAMARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_IDLINEAMARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidoscompras.getlineamarca_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidosComprasConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidoscompras.gettipoproductoservicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidosComprasConstantesFunciones.LABEL_FECHAEMISIONDESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_FECHAEMISIONDESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidoscompras.getfecha_emision_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidosComprasConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidoscompras.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidosComprasConstantesFunciones.LABEL_SECUENCIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_SECUENCIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidoscompras.getsecuencial());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidosComprasConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidoscompras.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidosComprasConstantesFunciones.LABEL_FECHAENTREGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_FECHAENTREGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidoscompras.getfecha_entrega());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidosComprasConstantesFunciones.LABEL_NOMBREPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_NOMBREPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidoscompras.getnombre_producto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidosComprasConstantesFunciones.LABEL_NOMBREUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_NOMBREUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidoscompras.getnombre_unidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidosComprasConstantesFunciones.LABEL_CANTIDADPEDIDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_CANTIDADPEDIDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidoscompras.getcantidad_pedido());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidosComprasConstantesFunciones.LABEL_CANTIDADENTREGADA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_CANTIDADENTREGADA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidoscompras.getcantidad_entregada());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidosComprasConstantesFunciones.LABEL_CANTIDADPENDIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_CANTIDADPENDIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidoscompras.getcantidad_pendiente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidosComprasConstantesFunciones.LABEL_CODIGOPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_CODIGOPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidoscompras.getcodigo_producto());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pedidoscomprasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pedidos Compras",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPedidosComprass(String sAccionBusqueda,String sTipoArchivoReporte,List<PedidosCompras> pedidoscomprassParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PedidosCompras> pedidoscomprassRespaldo=null;
		
		classes=PedidosComprasConstantesFunciones.getClassesRelationshipsOfPedidosCompras(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.pedidoscomprasLogic.setDatosCliente(this.datosCliente);
		this.pedidoscomprasLogic.setDatosDeep(this.datosDeep);
		this.pedidoscomprasLogic.setIsConDeep(true);
		
		pedidoscomprassRespaldo=this.pedidoscomprasLogic.getPedidosComprass();
		
		this.pedidoscomprasLogic.setPedidosComprass(pedidoscomprassParaReportes);	
		this.pedidoscomprasLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		pedidoscomprassParaReportes=this.pedidoscomprasLogic.getPedidosComprass();
		this.pedidoscomprasLogic.setPedidosComprass(pedidoscomprassRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pedidoscompras_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PedidosComprass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPedidosCompras("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PedidosCompras pedidoscompras : pedidoscomprassParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPedidosCompras("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PedidosComprasConstantesFunciones.generarExcelReporteDataPedidosCompras("NORMAL",row,workbook,pedidoscompras,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(PedidosComprasConstantesFunciones.getPedidosComprasDescripcion(pedidoscompras));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pedidoscomprasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pedidos Compras",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPedidosCompras.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPedidosCompras.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPedidosCompras.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPedidosCompras.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPedidosCompras() throws Exception {		
		this.startProcessPedidosCompras(true);
	}
	
	public void startProcessPedidosCompras(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPedidosCompras ,this.jPanelParametrosReportesPedidosCompras, this.jScrollPanelDatosPedidosCompras,this.jPanelPaginacionPedidosCompras, this.jScrollPanelDatosEdicionPedidosCompras, this.jPanelAccionesPedidosCompras,this.jPanelAccionesFormularioPedidosCompras,this.jmenuBarPedidosCompras,this.jmenuBarDetallePedidosCompras,this.jTtoolBarPedidosCompras,this.jTtoolBarDetallePedidosCompras);		
		
		final JTabbedPane jTabbedPaneBusquedasPedidosCompras=this.jTabbedPaneBusquedasPedidosCompras; 
		
		final JPanel jPanelParametrosReportesPedidosCompras=this.jPanelParametrosReportesPedidosCompras;
		//final JScrollPane jScrollPanelDatosPedidosCompras=this.jScrollPanelDatosPedidosCompras;
		final JTable jTableDatosPedidosCompras=this.jTableDatosPedidosCompras;		
		final JPanel jPanelPaginacionPedidosCompras=this.jPanelPaginacionPedidosCompras;
		//final JScrollPane jScrollPanelDatosEdicionPedidosCompras=this.jScrollPanelDatosEdicionPedidosCompras;
		final JPanel jPanelAccionesPedidosCompras=this.jPanelAccionesPedidosCompras;
		
		JPanel jPanelCamposAuxiliarPedidosCompras=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPedidosCompras=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
			jPanelCamposAuxiliarPedidosCompras=this.jInternalFrameDetalleFormPedidosCompras.jPanelCamposPedidosCompras;
			jPanelAccionesFormularioAuxiliarPedidosCompras=this.jInternalFrameDetalleFormPedidosCompras.jPanelAccionesFormularioPedidosCompras;
		}
		
		final JPanel jPanelCamposPedidosCompras=jPanelCamposAuxiliarPedidosCompras;
		final JPanel jPanelAccionesFormularioPedidosCompras=jPanelAccionesFormularioAuxiliarPedidosCompras;
		
		
		final JMenuBar jmenuBarPedidosCompras=this.jmenuBarPedidosCompras;
		final JToolBar jTtoolBarPedidosCompras=this.jTtoolBarPedidosCompras;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPedidosCompras=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPedidosCompras=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
			jmenuBarDetalleAuxiliarPedidosCompras=this.jInternalFrameDetalleFormPedidosCompras.jmenuBarDetallePedidosCompras;
			jTtoolBarDetalleAuxiliarPedidosCompras=this.jInternalFrameDetalleFormPedidosCompras.jTtoolBarDetallePedidosCompras;
		}
		
		final JMenuBar jmenuBarDetallePedidosCompras=jmenuBarDetalleAuxiliarPedidosCompras;
		final JToolBar jTtoolBarDetallePedidosCompras=jTtoolBarDetalleAuxiliarPedidosCompras;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPedidosCompras;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPedidosCompras;
			processRunnable.jTableDatos=jTableDatosPedidosCompras;
			processRunnable.jPanelCampos=jPanelCamposPedidosCompras;
			processRunnable.jPanelPaginacion=jPanelPaginacionPedidosCompras;
			processRunnable.jPanelAcciones=jPanelAccionesPedidosCompras;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPedidosCompras;
			
			
			processRunnable.jmenuBar=jmenuBarPedidosCompras;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePedidosCompras;
			processRunnable.jTtoolBar=jTtoolBarPedidosCompras;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePedidosCompras;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPedidosCompras ,jPanelParametrosReportesPedidosCompras,jTableDatosPedidosCompras, /*jScrollPanelDatosPedidosCompras,*/jPanelCamposPedidosCompras,jPanelPaginacionPedidosCompras, /*jScrollPanelDatosEdicionPedidosCompras,*/ jPanelAccionesPedidosCompras,jPanelAccionesFormularioPedidosCompras,jmenuBarPedidosCompras,jmenuBarDetallePedidosCompras,jTtoolBarPedidosCompras,jTtoolBarDetallePedidosCompras);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPedidosCompras ,jPanelParametrosReportesPedidosCompras, jScrollPanelDatosPedidosCompras,jPanelPaginacionPedidosCompras, jScrollPanelDatosEdicionPedidosCompras, jPanelAccionesPedidosCompras,jPanelAccionesFormularioPedidosCompras,jmenuBarPedidosCompras,jmenuBarDetallePedidosCompras,jTtoolBarPedidosCompras,jTtoolBarDetallePedidosCompras);
						
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
	
	public void finishProcessPedidosCompras() {// throws Exception 
		this.finishProcessPedidosCompras(true);
	}
	
	public void finishProcessPedidosCompras(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPedidosCompras ,this.jPanelParametrosReportesPedidosCompras, this.jScrollPanelDatosPedidosCompras,this.jPanelPaginacionPedidosCompras, this.jScrollPanelDatosEdicionPedidosCompras, this.jPanelAccionesPedidosCompras,this.jPanelAccionesFormularioPedidosCompras,this.jmenuBarPedidosCompras,this.jmenuBarDetallePedidosCompras,this.jTtoolBarPedidosCompras,this.jTtoolBarDetallePedidosCompras);		
		
		final JTabbedPane jTabbedPaneBusquedasPedidosCompras=this.jTabbedPaneBusquedasPedidosCompras; 
		
		final JPanel jPanelParametrosReportesPedidosCompras=this.jPanelParametrosReportesPedidosCompras;
		//final JScrollPane jScrollPanelDatosPedidosCompras=this.jScrollPanelDatosPedidosCompras;
		final JTable jTableDatosPedidosCompras=this.jTableDatosPedidosCompras;		
		final JPanel jPanelPaginacionPedidosCompras=this.jPanelPaginacionPedidosCompras;
		//final JScrollPane jScrollPanelDatosEdicionPedidosCompras=this.jScrollPanelDatosEdicionPedidosCompras;
		final JPanel jPanelAccionesPedidosCompras=this.jPanelAccionesPedidosCompras;
		
		JPanel jPanelCamposAuxiliarPedidosCompras=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPedidosCompras=new JPanel();
		
		if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
			jPanelCamposAuxiliarPedidosCompras=this.jInternalFrameDetalleFormPedidosCompras.jPanelCamposPedidosCompras;
			jPanelAccionesFormularioAuxiliarPedidosCompras=this.jInternalFrameDetalleFormPedidosCompras.jPanelAccionesFormularioPedidosCompras;
		}
		
		final JPanel jPanelCamposPedidosCompras=jPanelCamposAuxiliarPedidosCompras;
		final JPanel jPanelAccionesFormularioPedidosCompras=jPanelAccionesFormularioAuxiliarPedidosCompras;
		
		
		final JMenuBar jmenuBarPedidosCompras=this.jmenuBarPedidosCompras;		
		final JToolBar jTtoolBarPedidosCompras=this.jTtoolBarPedidosCompras;
				
		JMenuBar jmenuBarDetalleAuxiliarPedidosCompras=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPedidosCompras=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
			jmenuBarDetalleAuxiliarPedidosCompras=this.jInternalFrameDetalleFormPedidosCompras.jmenuBarDetallePedidosCompras;
			jTtoolBarDetalleAuxiliarPedidosCompras=this.jInternalFrameDetalleFormPedidosCompras.jTtoolBarDetallePedidosCompras;		
		}
		
		final JMenuBar jmenuBarDetallePedidosCompras=jmenuBarDetalleAuxiliarPedidosCompras;
		final JToolBar jTtoolBarDetallePedidosCompras=jTtoolBarDetalleAuxiliarPedidosCompras;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPedidosCompras;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPedidosCompras;
			processRunnable.jTableDatos=jTableDatosPedidosCompras;
			processRunnable.jPanelCampos=jPanelCamposPedidosCompras;
			processRunnable.jPanelPaginacion=jPanelPaginacionPedidosCompras;
			processRunnable.jPanelAcciones=jPanelAccionesPedidosCompras;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPedidosCompras;
			
			
			processRunnable.jmenuBar=jmenuBarPedidosCompras;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePedidosCompras;
			processRunnable.jTtoolBar=jTtoolBarPedidosCompras;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePedidosCompras;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPedidosCompras ,jPanelParametrosReportesPedidosCompras, jTableDatosPedidosCompras,/*jScrollPanelDatosPedidosCompras,*/jPanelCamposPedidosCompras,jPanelPaginacionPedidosCompras, /*jScrollPanelDatosEdicionPedidosCompras,*/ jPanelAccionesPedidosCompras,jPanelAccionesFormularioPedidosCompras,jmenuBarPedidosCompras,jmenuBarDetallePedidosCompras,jTtoolBarPedidosCompras,jTtoolBarDetallePedidosCompras));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPedidosCompras(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPedidosCompras(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPedidosCompras(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPedidosCompras(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPedidosCompras,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePedidosCompras,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPedidosCompras(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPedidosCompras,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePedidosCompras,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.pedidoscomprasConstantesFunciones.getsFinalQueryPedidosCompras();
		String  finalQueryPaginacionTodos=this.pedidoscomprasConstantesFunciones.getsFinalQueryPedidosCompras();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PedidosComprasConstantesFunciones.getArrayColumnasGlobalesNoPedidosCompras(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PedidosComprasConstantesFunciones.getArrayColumnasGlobalesPedidosCompras(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PedidosComprasConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.pedidoscomprassEliminados= new ArrayList<PedidosCompras>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPedidosCompras();
		
				///*PedidosComprasSessionBean*/this.pedidoscomprasSessionBean=new PedidosComprasSessionBean();
			
			if(this.pedidoscomprasSessionBean==null) {
				this.pedidoscomprasSessionBean=new PedidosComprasSessionBean();
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
					this.iNumeroPaginacion=PedidosComprasConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PedidosComprasConstantesFunciones.getClassesForeignKeysOfPedidosCompras(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/pedidoscompras."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			pedidoscomprassAux= new ArrayList<PedidosCompras>();
			
				
			pedidoscomprasLogic.setDatosCliente(this.datosCliente);
			pedidoscomprasLogic.setDatosDeep(this.datosDeep);
			pedidoscomprasLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPedidosCompras")) {
				this.sDetalleReporte=PedidosComprasConstantesFunciones.getDetalleIndiceBusquedaPedidosCompras(id_productoBusquedaPedidosCompras,id_lineaBusquedaPedidosCompras,id_linea_grupoBusquedaPedidosCompras,id_linea_categoriaBusquedaPedidosCompras,id_linea_marcaBusquedaPedidosCompras,id_tipo_producto_servicioBusquedaPedidosCompras,fecha_emision_desdeBusquedaPedidosCompras,fecha_emision_hastaBusquedaPedidosCompras);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					pedidoscomprasLogic.getPedidosComprassBusquedaPedidosCompras(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_productoBusquedaPedidosCompras,id_lineaBusquedaPedidosCompras,id_linea_grupoBusquedaPedidosCompras,id_linea_categoriaBusquedaPedidosCompras,id_linea_marcaBusquedaPedidosCompras,id_tipo_producto_servicioBusquedaPedidosCompras,fecha_emision_desdeBusquedaPedidosCompras,fecha_emision_hastaBusquedaPedidosCompras);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidosComprasConstantesFunciones.getDetalleIndiceBusquedaPedidosCompras(id_productoBusquedaPedidosCompras,id_lineaBusquedaPedidosCompras,id_linea_grupoBusquedaPedidosCompras,id_linea_categoriaBusquedaPedidosCompras,id_linea_marcaBusquedaPedidosCompras,id_tipo_producto_servicioBusquedaPedidosCompras,fecha_emision_desdeBusquedaPedidosCompras,fecha_emision_hastaBusquedaPedidosCompras);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidosComprasConstantesFunciones.getDetalleIndiceBusquedaPedidosCompras(id_productoBusquedaPedidosCompras,id_lineaBusquedaPedidosCompras,id_linea_grupoBusquedaPedidosCompras,id_linea_categoriaBusquedaPedidosCompras,id_linea_marcaBusquedaPedidosCompras,id_tipo_producto_servicioBusquedaPedidosCompras,fecha_emision_desdeBusquedaPedidosCompras,fecha_emision_hastaBusquedaPedidosCompras);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=pedidoscomprasLogic.getPedidosComprass()==null||pedidoscomprasLogic.getPedidosComprass().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=pedidoscomprass==null|| pedidoscomprass.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidoscomprassAux=new ArrayList<PedidosCompras>();
						pedidoscomprassAux.addAll(pedidoscomprasLogic.getPedidosComprass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidoscomprassAux=new ArrayList<PedidosCompras>();
							pedidoscomprassAux.addAll(pedidoscomprass);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							pedidoscomprasLogic.getPedidosComprassBusquedaPedidosCompras(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_productoBusquedaPedidosCompras,id_lineaBusquedaPedidosCompras,id_linea_grupoBusquedaPedidosCompras,id_linea_categoriaBusquedaPedidosCompras,id_linea_marcaBusquedaPedidosCompras,id_tipo_producto_servicioBusquedaPedidosCompras,fecha_emision_desdeBusquedaPedidosCompras,fecha_emision_hastaBusquedaPedidosCompras);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidosComprasConstantesFunciones.getDetalleIndiceBusquedaPedidosCompras(id_productoBusquedaPedidosCompras,id_lineaBusquedaPedidosCompras,id_linea_grupoBusquedaPedidosCompras,id_linea_categoriaBusquedaPedidosCompras,id_linea_marcaBusquedaPedidosCompras,id_tipo_producto_servicioBusquedaPedidosCompras,fecha_emision_desdeBusquedaPedidosCompras,fecha_emision_hastaBusquedaPedidosCompras);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidosComprasConstantesFunciones.getDetalleIndiceBusquedaPedidosCompras(id_productoBusquedaPedidosCompras,id_lineaBusquedaPedidosCompras,id_linea_grupoBusquedaPedidosCompras,id_linea_categoriaBusquedaPedidosCompras,id_linea_marcaBusquedaPedidosCompras,id_tipo_producto_servicioBusquedaPedidosCompras,fecha_emision_desdeBusquedaPedidosCompras,fecha_emision_hastaBusquedaPedidosCompras);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePedidosComprass("BusquedaPedidosCompras",pedidoscomprasLogic.getPedidosComprass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePedidosComprass("BusquedaPedidosCompras",pedidoscomprass);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidoscomprasLogic.setPedidosComprass(new ArrayList<PedidosCompras>());
						pedidoscomprasLogic.getPedidosComprass().addAll(pedidoscomprassAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidoscomprass=new ArrayList<PedidosCompras>();
							pedidoscomprass.addAll(pedidoscomprassAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPedidosCompras();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPedidosCompras();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=pedidoscomprasLogic.getPedidosComprass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=pedidoscomprass.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=pedidoscomprasLogic.getPedidosComprass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=pedidoscomprass.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PedidosCompras pedidoscompras) {
		Boolean permite=true;
		
		if(this.pedidoscompras.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PedidosComprasConstantesFunciones.getOrderByListaPedidosCompras();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PedidosComprasConstantesFunciones.getOrderByListaPedidosCompras();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PedidosCompras pedidoscompras:pedidoscomprasLogic.getPedidosComprass()) {
				if(pedidoscompras.getsType().equals(Constantes2.S_TOTALES)) {
					pedidoscomprasTotales=pedidoscompras;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PedidosCompras pedidoscompras:this.pedidoscomprass) {
				if(pedidoscompras.getsType().equals(Constantes2.S_TOTALES)) {
					pedidoscomprasTotales=pedidoscompras;
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
			this.pedidoscomprasAux=new PedidosCompras();
			this.pedidoscomprasAux.setsType(Constantes2.S_TOTALES);
			this.pedidoscomprasAux.setIsNew(false);
			this.pedidoscomprasAux.setIsChanged(false);
			this.pedidoscomprasAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//PedidosComprasConstantesFunciones.TotalizarValoresFilaPedidosCompras(this.pedidoscomprasLogic.getPedidosComprass(),this.pedidoscomprasAux);
				
				//this.pedidoscomprasLogic.getPedidosComprass().add(this.pedidoscomprasAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PedidosComprasConstantesFunciones.TotalizarValoresFilaPedidosCompras(this.pedidoscomprass,this.pedidoscomprasAux);
				
				this.pedidoscomprass.add(this.pedidoscomprasAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		pedidoscomprasTotales=new PedidosCompras();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.pedidoscomprasLogic.getPedidosComprass().remove(pedidoscomprasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.pedidoscomprass.remove(pedidoscomprasTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		pedidoscomprasTotales=new PedidosCompras();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PedidosCompras pedidoscompras:pedidoscomprasLogic.getPedidosComprass()) {
				if(pedidoscompras.getsType().equals(Constantes2.S_TOTALES)) {
					pedidoscomprasTotales=pedidoscompras;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PedidosComprasConstantesFunciones.TotalizarValoresFilaPedidosCompras(this.pedidoscomprasLogic.getPedidosComprass(),pedidoscomprasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PedidosCompras pedidoscompras:this.pedidoscomprass) {
				if(pedidoscompras.getsType().equals(Constantes2.S_TOTALES)) {
					pedidoscomprasTotales=pedidoscompras;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PedidosComprasConstantesFunciones.TotalizarValoresFilaPedidosCompras(this.pedidoscomprass,pedidoscomprasTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPedidosComprassBusquedaPedidosCompras()throws Exception {
		try {
			sAccionBusqueda="BusquedaPedidosCompras";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPedidosComprassFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPedidosComprassFK_IdLinea()throws Exception {
		try {
			sAccionBusqueda="FK_IdLinea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPedidosComprassFK_IdLineaCategoria()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaCategoria";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPedidosComprassFK_IdLineaGrupo()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaGrupo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPedidosComprassFK_IdLineaMarca()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaMarca";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPedidosComprassFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPedidosComprassFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPedidosComprassFK_IdTipoProductoServicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoProductoServicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPedidosComprassBusquedaPedidosCompras(String sFinalQuery,Long id_producto,Long id_linea,Long id_linea_grupo,Long id_linea_categoria,Long id_linea_marca,Long id_tipo_producto_servicio,Date fecha_emision_desde,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//pedidoscomprasLogic.getPedidosComprassBusquedaPedidosCompras(sFinalQuery,this.pagination,id_producto,id_linea,id_linea_grupo,id_linea_categoria,id_linea_marca,id_tipo_producto_servicio,fecha_emision_desde,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPedidosComprassFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//pedidoscomprasLogic.getPedidosComprassFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPedidosComprassFK_IdLinea(String sFinalQuery,Long id_linea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//pedidoscomprasLogic.getPedidosComprassFK_IdLinea(sFinalQuery,this.pagination,id_linea);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPedidosComprassFK_IdLineaCategoria(String sFinalQuery,Long id_linea_categoria)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//pedidoscomprasLogic.getPedidosComprassFK_IdLineaCategoria(sFinalQuery,this.pagination,id_linea_categoria);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPedidosComprassFK_IdLineaGrupo(String sFinalQuery,Long id_linea_grupo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//pedidoscomprasLogic.getPedidosComprassFK_IdLineaGrupo(sFinalQuery,this.pagination,id_linea_grupo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPedidosComprassFK_IdLineaMarca(String sFinalQuery,Long id_linea_marca)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//pedidoscomprasLogic.getPedidosComprassFK_IdLineaMarca(sFinalQuery,this.pagination,id_linea_marca);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPedidosComprassFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//pedidoscomprasLogic.getPedidosComprassFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPedidosComprassFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//pedidoscomprasLogic.getPedidosComprassFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPedidosComprassFK_IdTipoProductoServicio(String sFinalQuery,Long id_tipo_producto_servicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//pedidoscomprasLogic.getPedidosComprassFK_IdTipoProductoServicio(sFinalQuery,this.pagination,id_tipo_producto_servicio);
				
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
	
	public void inicializarPermisosPedidosCompras() {
		this.isPermisoTodoPedidosCompras=false;
		this.isPermisoNuevoPedidosCompras=false;
		this.isPermisoActualizarPedidosCompras=false;
		this.isPermisoActualizarOriginalPedidosCompras=false;
		this.isPermisoEliminarPedidosCompras=false;
		this.isPermisoGuardarCambiosPedidosCompras=false;
		this.isPermisoConsultaPedidosCompras=true;
		this.isPermisoBusquedaPedidosCompras=true;
		this.isPermisoReportePedidosCompras=true;
		this.isPermisoOrdenPedidosCompras=false;		
		this.isPermisoPaginacionMedioPedidosCompras=false;		
		this.isPermisoPaginacionAltoPedidosCompras=false;		
		this.isPermisoPaginacionTodoPedidosCompras=false;		
		this.isPermisoCopiarPedidosCompras=false;		
		this.isPermisoVerFormPedidosCompras=false;		
		this.isPermisoDuplicarPedidosCompras=false;
		this.isPermisoOrdenPedidosCompras=false;
	}
	
	public void setPermisosUsuarioPedidosCompras(Boolean isPermiso) {
		this.isPermisoTodoPedidosCompras=isPermiso;
		this.isPermisoNuevoPedidosCompras=isPermiso;
		this.isPermisoActualizarPedidosCompras=isPermiso;
		this.isPermisoActualizarOriginalPedidosCompras=isPermiso;
		this.isPermisoEliminarPedidosCompras=isPermiso;
		this.isPermisoGuardarCambiosPedidosCompras=isPermiso;
		this.isPermisoConsultaPedidosCompras=isPermiso;
		this.isPermisoBusquedaPedidosCompras=isPermiso;
		this.isPermisoReportePedidosCompras=isPermiso;
		this.isPermisoOrdenPedidosCompras=isPermiso;		
		this.isPermisoPaginacionMedioPedidosCompras=isPermiso;		
		this.isPermisoPaginacionAltoPedidosCompras=isPermiso;		
		this.isPermisoPaginacionTodoPedidosCompras=isPermiso;		
		this.isPermisoCopiarPedidosCompras=isPermiso;		
		this.isPermisoVerFormPedidosCompras=isPermiso;		
		this.isPermisoDuplicarPedidosCompras=isPermiso;
		this.isPermisoOrdenPedidosCompras=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPedidosCompras(Boolean isPermiso) {
		//this.isPermisoTodoPedidosCompras=isPermiso;
		this.isPermisoNuevoPedidosCompras=isPermiso;
		this.isPermisoActualizarPedidosCompras=isPermiso;
		this.isPermisoActualizarOriginalPedidosCompras=isPermiso;
		this.isPermisoEliminarPedidosCompras=isPermiso;
		this.isPermisoGuardarCambiosPedidosCompras=isPermiso;
		//this.isPermisoConsultaPedidosCompras=isPermiso;
		//this.isPermisoBusquedaPedidosCompras=isPermiso;
		//this.isPermisoReportePedidosCompras=isPermiso;
		//this.isPermisoOrdenPedidosCompras=isPermiso;		
		//this.isPermisoPaginacionMedioPedidosCompras=isPermiso;		
		//this.isPermisoPaginacionAltoPedidosCompras=isPermiso;		
		//this.isPermisoPaginacionTodoPedidosCompras=isPermiso;		
		//this.isPermisoCopiarPedidosCompras=isPermiso;		
		//this.isPermisoDuplicarPedidosCompras=isPermiso;
		//this.isPermisoOrdenPedidosCompras=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPedidosComprasClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(PedidosComprasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebPedidosCompras(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPedidosComprasClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioPedidosComprasClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPedidosComprasClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPedidosComprasClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioPedidosCompras() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PedidosComprasJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.pedidoscomprasSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PedidosComprasConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPedidosCompras=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPedidosCompras=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPedidosCompras=this.isPermisoActualizarPedidosCompras;
			this.isPermisoEliminarPedidosCompras=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPedidosCompras=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPedidosCompras=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPedidosCompras=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPedidosCompras=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePedidosCompras=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPedidosCompras=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPedidosCompras=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPedidosCompras=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPedidosCompras=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPedidosCompras=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPedidosCompras=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPedidosCompras=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPedidosCompras=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.pedidoscomprasSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPedidosCompras.setToolTipText(this.jTableDatosPedidosCompras.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPedidosCompras(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPedidosCompras(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PedidosComprasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PedidosComprasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPedidosCompras() throws Exception {
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
	public void inicializarCombosForeignKeyPedidosComprasListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
				this.lineasForeignKey=new ArrayList();
				this.lineagruposForeignKey=new ArrayList();
				this.lineacategoriasForeignKey=new ArrayList();
				this.lineamarcasForeignKey=new ArrayList();
				this.tipoproductoserviciosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPedidosComprasListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PedidosComprasJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaGrupoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaCategoriaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaMarcaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoProductoServicioListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoProductoServicioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoproductoserviciosForeignKey==null||this.tipoproductoserviciosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoProductoServicioConstantesFunciones.getArrayColumnasGlobalesTipoProductoServicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoProductoServicioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoProductoServicioConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoProductoServiciosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyPedidosCompras()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyProducto();
			this.addItemDefectoCombosForeignKeyLinea();
			this.addItemDefectoCombosForeignKeyLineaGrupo();
			this.addItemDefectoCombosForeignKeyLineaCategoria();
			this.addItemDefectoCombosForeignKeyLineaMarca();
			this.addItemDefectoCombosForeignKeyTipoProductoServicio();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.pedidoscomprasSessionBean==null) {
				this.pedidoscomprasSessionBean=new PedidosComprasSessionBean();
			}

			if(!this.pedidoscomprasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.pedidoscomprasSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyProducto()throws Exception {
		try {

			if(!this.pedidoscomprasSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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

	public void addItemDefectoCombosForeignKeyLinea()throws Exception {
		try {

			if(!this.pedidoscomprasSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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

			if(!this.pedidoscomprasSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
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

			if(!this.pedidoscomprasSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
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

			if(!this.pedidoscomprasSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
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

	public void addItemDefectoCombosForeignKeyTipoProductoServicio()throws Exception {
		try {

			if(!this.pedidoscomprasSessionBean.getisBusquedaDesdeForeignKeySesionTipoProductoServicio()) {
				TipoProductoServicio tipoproductoservicio=new TipoProductoServicio();
				TipoProductoServicioConstantesFunciones.setTipoProductoServicioDescripcion(tipoproductoservicio,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoproductoservicio.setId(null);

				if(!TipoProductoServicioConstantesFunciones.ExisteEnLista(this.tipoproductoserviciosForeignKey,tipoproductoservicio,true)) {

					this.tipoproductoserviciosForeignKey.add(0,tipoproductoservicio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyPedidosCompras()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPedidosCompras(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPedidosCompras()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPedidosCompras();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPedidosCompras(PedidosCompras pedidoscompras)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPedidosCompras(PedidosCompras pedidoscompras,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPedidosCompras()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPedidosCompras()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPedidosCompras()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPedidosCompras()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPedidosCompras()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPedidosCompras()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");
			this.cargarCombosFrameLineasForeignKey("Todos");
			this.cargarCombosFrameLineaGruposForeignKey("Todos");
			this.cargarCombosFrameLineaCategoriasForeignKey("Todos");
			this.cargarCombosFrameLineaMarcasForeignKey("Todos");
			this.cargarCombosFrameTipoProductoServiciosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPedidosCompras(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaGruposForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaCategoriasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaMarcasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoProductoServiciosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPedidosCompras()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_empresaPedidosCompras!=null && this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_empresaPedidosCompras.getItemCount()>0) {
				this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_empresaPedidosCompras.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_sucursalPedidosCompras!=null && this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_sucursalPedidosCompras.getItemCount()>0) {
				this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_sucursalPedidosCompras.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_productoPedidosCompras!=null && this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_productoPedidosCompras.getItemCount()>0) {
				this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_productoPedidosCompras.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_lineaPedidosCompras!=null && this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_lineaPedidosCompras.getItemCount()>0) {
				this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_lineaPedidosCompras.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_grupoPedidosCompras!=null && this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_grupoPedidosCompras.getItemCount()>0) {
				this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_grupoPedidosCompras.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_categoriaPedidosCompras!=null && this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_categoriaPedidosCompras.getItemCount()>0) {
				this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_categoriaPedidosCompras.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_marcaPedidosCompras!=null && this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_marcaPedidosCompras.getItemCount()>0) {
				this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_marcaPedidosCompras.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_tipo_producto_servicioPedidosCompras!=null && this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_tipo_producto_servicioPedidosCompras.getItemCount()>0) {
				this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_tipo_producto_servicioPedidosCompras.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
















	
	

	public PedidosComprasBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PedidosComprasBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PedidosComprasBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.pedidoscomprasSessionBean=new PedidosComprasSessionBean(); 
		this.pedidoscomprasConstantesFunciones=new PedidosComprasConstantesFunciones(); 
		this.pedidoscomprasBean=new PedidosCompras();//(this.pedidoscomprasConstantesFunciones); 		
		this.pedidoscomprasReturnGeneral=new PedidosComprasParameterReturnGeneral(); 
		
		this.pedidoscomprasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.pedidoscomprasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PedidosComprasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PedidosComprasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PedidosComprasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPedidosCompras(true);
			
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
			
			this.pedidoscomprasConstantesFunciones=new PedidosComprasConstantesFunciones(); 
			this.pedidoscomprasBean=new PedidosCompras();//this.pedidoscomprasConstantesFunciones); 			
			this.pedidoscomprasReturnGeneral=new PedidosComprasParameterReturnGeneral(); 
		
			PedidosComprasBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Pedidos Compras Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.pedidoscompras=new PedidosCompras();
			this.pedidoscomprass = new ArrayList<PedidosCompras>();
			this.pedidoscomprassAux = new ArrayList<PedidosCompras>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic=new PedidosComprasLogic();
				this.pedidoscomprasLogic.getNewConnexionToDeep("");
			}
			
			//this.pedidoscomprasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.pedidoscomprasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPedidosCompras);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPedidosCompras!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPedidosCompras);	
					}
					
					if(this.jInternalFrameImportacionPedidosCompras!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPedidosCompras);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPedidosCompras!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPedidosCompras);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPedidosCompras!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPedidosCompras);
				this.jInternalFrameDetalleFormPedidosCompras.setVisible(false);
				this.jInternalFrameDetalleFormPedidosCompras.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPedidosCompras!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPedidosCompras);
					this.jInternalFrameReporteDinamicoPedidosCompras.setVisible(false);
					this.jInternalFrameReporteDinamicoPedidosCompras.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPedidosCompras!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPedidosCompras);
					this.jInternalFrameImportacionPedidosCompras.setVisible(false);
					this.jInternalFrameImportacionPedidosCompras.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPedidosCompras!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPedidosCompras);
					this.jInternalFrameOrderByPedidosCompras.setVisible(false);
					this.jInternalFrameOrderByPedidosCompras.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPedidosComprasActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PedidosComprasConstantesFunciones.INUMEROPAGINACION;
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
			
			this.pedidoscomprasReturnGeneral=new PedidosComprasParameterReturnGeneral();
			
			this.pedidoscomprasParameterGeneral=new PedidosComprasParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.pedidoscomprasLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.pedidoscomprasSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PedidosComprasJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.pedidoscomprasSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PedidosComprasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.pedidoscomprasSessionBean.getEsGuardarRelacionado(),this.pedidoscomprasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PedidosComprasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.pedidoscomprasSessionBean.getEsGuardarRelacionado(),this.pedidoscomprasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPedidosCompras=false;
			this.isVisibilidadCeldaDuplicarPedidosCompras=true;
			this.isVisibilidadCeldaCopiarPedidosCompras=true;
			this.isVisibilidadCeldaVerFormPedidosCompras=true;
			this.isVisibilidadCeldaOrdenPedidosCompras=true;
			this.isVisibilidadCeldaNuevoRelacionesPedidosCompras=false;
			this.isVisibilidadCeldaModificarPedidosCompras=false;
			this.isVisibilidadCeldaActualizarPedidosCompras=false;
			this.isVisibilidadCeldaEliminarPedidosCompras=false;
			this.isVisibilidadCeldaCancelarPedidosCompras=false;
			this.isVisibilidadCeldaGuardarPedidosCompras=false;
			this.isVisibilidadCeldaGuardarCambiosPedidosCompras=false;
			
			
			this.isVisibilidadBusquedaPedidosCompras=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdLinea=true;
			this.isVisibilidadFK_IdLineaCategoria=true;
			this.isVisibilidadFK_IdLineaGrupo=true;
			this.isVisibilidadFK_IdLineaMarca=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoProductoServicio=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPedidosCompras("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPedidosCompras();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPedidosCompras(false);
			
			this.setPermisosUsuarioPedidosCompras();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.pedidoscomprasSessionBean.getEsGuardarRelacionado() 
				|| (this.pedidoscomprasSessionBean.getEsGuardarRelacionado() && this.pedidoscomprasSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPedidosComprasClasesRelacionadas();
			}
			
			if(this.pedidoscomprasSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPedidosComprasClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PedidosComprasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPedidosCompras();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPedidosCompras();
			}
			
			if(!this.isPermisoBusquedaPedidosCompras) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPedidosCompras.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.pedidoscomprasSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PedidosComprasConstantesFunciones.getTiposSeleccionarPedidosCompras());
				
				this.tiposColumnasSelect=PedidosComprasConstantesFunciones.getTiposSeleccionarPedidosCompras(true);
				
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
			//if(!this.pedidoscomprasSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPedidosCompras();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,false);
				this.setAccionesUsuarioPedidosCompras(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,false);							
				this.setAccionesUsuarioPedidosCompras(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPedidosCompras() ;
			
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
			this.productoLogic=new ProductoLogic();
			this.lineaLogic=new LineaLogic();
			this.lineagrupoLogic=new LineaLogic();
			this.lineacategoriaLogic=new LineaLogic();
			this.lineamarcaLogic=new LineaLogic();
			this.tipoproductoservicioLogic=new TipoProductoServicioLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				pedidoscomprasImplementable= (PedidosComprasImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PedidosComprasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				pedidoscomprasImplementableHome= (PedidosComprasImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PedidosComprasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.pedidoscomprass= new ArrayList<PedidosCompras>();
			this.pedidoscomprassEliminados= new ArrayList<PedidosCompras>();
						
			this.isEsNuevoPedidosCompras=false;
			this.esParaAccionDesdeFormularioPedidosCompras=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.productosForeignKey=new ArrayList<Producto>() ;
			this.lineasForeignKey=new ArrayList<Linea>() ;
			this.lineagruposForeignKey=new ArrayList<Linea>() ;
			this.lineacategoriasForeignKey=new ArrayList<Linea>() ;
			this.lineamarcasForeignKey=new ArrayList<Linea>() ;
			this.tipoproductoserviciosForeignKey=new ArrayList<TipoProductoServicio>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPedidosCompras(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPedidosCompras();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.pedidoscomprasSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PedidosComprasBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PedidosComprasConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPedidosCompras("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPedidosCompras(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPedidosCompras!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPedidosCompras();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPedidosCompras();
			}
			
			PedidosComprasBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPedidosCompras.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPedidosCompras.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPedidosCompras.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPedidosCompras(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PedidosCompras: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPedidosCompras() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPedidosCompras")) {
				iIndex=this.jInternalFrameDetalleFormPedidosCompras.jTabbedPaneRelacionesPedidosCompras.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPedidosCompras.jTabbedPaneRelacionesPedidosCompras.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPedidosCompras();	
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
	
	public void cargarCombosForeignKeyPedidosCompras(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPedidosCompras(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPedidosCompras(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPedidosComprasListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPedidosCompras();
		
		this.cargarCombosFrameForeignKeyPedidosCompras();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPedidosCompras();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPedidosCompras();
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

	public void cargarCombosForeignKeyTipoProductoServicio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoProductoServicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoProductoServicio();
				this.cargarCombosFrameTipoProductoServiciosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoProductoServicio(this.tipoproductoserviciosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoPedidosComprasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.pedidoscomprasSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPedidosCompras==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
			
			
			if(jTableDatosPedidosCompras.getRowCount()>=1) {
				jTableDatosPedidosCompras.removeRowSelectionInterval(0, jTableDatosPedidosCompras.getRowCount()-1);						
			}
			
			this.isEsNuevoPedidosCompras=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPedidosCompras(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPedidosCompras(true);			
			//this.pedidoscompras=new PedidosCompras();
			//this.pedidoscompras.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPedidosCompras(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPedidosCompras() ;
			
			if(PedidosComprasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePedidosCompras(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.pedidoscompras);	
			this.actualizarInformacion("INFO_PADRE",false,this.pedidoscompras);				
			
			PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
			
			if(this.pedidoscomprasSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PedidosCompras: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPedidosComprasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PedidosCompras> pedidoscomprassSeleccionados=new ArrayList<PedidosCompras>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPedidosCompras.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPedidosCompras.getSelectedRows().length;			
			}
			
			pedidoscomprassSeleccionados=this.getPedidosComprassSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPedidosCompras--;			
				//PedidosCompras pedidoscomprasAux= new PedidosCompras();			
				//pedidoscomprasAux.setId(this.iIdNuevoPedidosCompras);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PedidosCompras pedidoscomprasOrigen=new PedidosCompras();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PedidosCompras pedidoscomprasOrigen : pedidoscomprassSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							pedidoscomprasOrigen =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidoscomprasOrigen =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPedidosCompras();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.pedidoscompras.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPedidosCompras(pedidoscomprasOrigen,this.pedidoscompras,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.pedidoscomprasLogic.getPedidosComprass().add(this.pedidoscomprasAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.pedidoscomprass.add(this.pedidoscomprasAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPedidosCompras(false);
				
				this.jTableDatosPedidosCompras.setRowSelectionInterval(this.getIndiceNuevoPedidosCompras(), this.getIndiceNuevoPedidosCompras());
				
				int iLastRow =  this.jTableDatosPedidosCompras.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPedidosCompras.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPedidosCompras.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPedidosCompras(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPedidosComprasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PedidosCompras> pedidoscomprassSeleccionados=new ArrayList<PedidosCompras>();									
		
			PedidosCompras pedidoscomprasOrigen=new PedidosCompras();
			PedidosCompras pedidoscomprasDestino=new PedidosCompras();
				
			pedidoscomprassSeleccionados=this.getPedidosComprassSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPedidosCompras.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || pedidoscomprassSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPedidosCompras.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidoscomprasOrigen =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						pedidoscomprasOrigen =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidoscomprasDestino =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						pedidoscomprasDestino =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				pedidoscomprasOrigen =pedidoscomprassSeleccionados.get(0);
				pedidoscomprasDestino =pedidoscomprassSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPedidosCompras(pedidoscomprasOrigen,pedidoscomprasDestino,true,false);
				
				pedidoscomprasDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(pedidoscomprasDestino,pedidoscomprasLogic.getPedidosComprass());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(pedidoscomprasDestino,pedidoscomprass);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPedidosCompras(false);
				
				//this.jTableDatosPedidosCompras.setRowSelectionInterval(this.getIndiceNuevoPedidosCompras(), this.getIndiceNuevoPedidosCompras());
				
				int iLastRow =  this.jTableDatosPedidosCompras.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPedidosCompras.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPedidosCompras.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPedidosCompras(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPedidosComprasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPedidosCompras==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPedidosCompras.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPedidosComprasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPedidosCompras.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPedidosCompras.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPedidosCompras.setVisible(!isVisible);
			this.jPanelPaginacionPedidosCompras.setVisible(!isVisible);
			this.jPanelAccionesPedidosCompras.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPedidosComprasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePedidosCompras();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPedidosComprasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPedidosCompras();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPedidosComprasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPedidosCompras();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPedidosComprasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPedidosCompras();
			
			this.abrirFrameOrderByPedidosCompras();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPedidosComprasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPedidosCompras();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePedidosCompras(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPedidosCompras);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPedidosCompras.isMaximum()) {
					this.jInternalFrameDetalleFormPedidosCompras.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPedidosCompras.setSize(this.jInternalFrameDetalleFormPedidosCompras.iWidthFormulario,this.jInternalFrameDetalleFormPedidosCompras.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPedidosCompras.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPedidosCompras.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPedidosCompras.isMaximum()) {
						this.jInternalFrameDetalleFormPedidosCompras.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPedidosCompras.jContentPaneDetallePedidosCompras.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPedidosCompras.jTabbedPaneRelacionesPedidosCompras.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPedidosCompras.jContentPaneDetallePedidosCompras.getWidth(),PedidosComprasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPedidosCompras.jTabbedPaneRelacionesPedidosCompras.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPedidosCompras.jContentPaneDetallePedidosCompras.getWidth(),PedidosComprasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPedidosCompras.jTabbedPaneRelacionesPedidosCompras.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPedidosCompras.jContentPaneDetallePedidosCompras.getWidth(),PedidosComprasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPedidosCompras.setVisible(true);
	        this.jInternalFrameDetalleFormPedidosCompras.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPedidosCompras() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPedidosCompras==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPedidosCompras=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPedidosCompras,false,this);
				} else {
					this.jInternalFrameOrderByPedidosCompras=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPedidosCompras,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPedidosCompras);
				this.jInternalFrameOrderByPedidosCompras.setVisible(false);
				this.jInternalFrameOrderByPedidosCompras.setSelected(false);
				
				this.jInternalFrameOrderByPedidosCompras.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPedidosCompras"));
				
				this.inicializarActualizarBindingTablaOrderByPedidosCompras();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPedidosCompras() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPedidosCompras==null) {
				
				this.jInternalFrameImportacionPedidosCompras=new ImportacionJInternalFrame(PedidosComprasConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPedidosCompras);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPedidosCompras);
				this.jInternalFrameImportacionPedidosCompras.setVisible(false);
				this.jInternalFrameImportacionPedidosCompras.setSelected(false);


				this.jInternalFrameImportacionPedidosCompras.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPedidosCompras"));
				this.jInternalFrameImportacionPedidosCompras.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPedidosCompras"));
				this.jInternalFrameImportacionPedidosCompras.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPedidosCompras"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPedidosCompras() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPedidosCompras==null) {
				this.jInternalFrameReporteDinamicoPedidosCompras=new ReporteDinamicoJInternalFrame(PedidosComprasConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPedidosCompras);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPedidosCompras);
				this.jInternalFrameReporteDinamicoPedidosCompras.setVisible(false);
				this.jInternalFrameReporteDinamicoPedidosCompras.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPedidosCompras.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPedidosCompras"));
				this.jInternalFrameReporteDinamicoPedidosCompras.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPedidosCompras"));
				this.jInternalFrameReporteDinamicoPedidosCompras.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPedidosCompras"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPedidosCompras();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetallePedidosCompras() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPedidosCompras);
			
	       	this.jInternalFrameDetalleFormPedidosCompras.setVisible(false);
	        this.jInternalFrameDetalleFormPedidosCompras.setSelected(false);
			
			//this.jInternalFrameDetalleFormPedidosCompras.dispose();
			//this.jInternalFrameDetalleFormPedidosCompras=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPedidosCompras() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPedidosCompras.setVisible(true);
	        this.jInternalFrameReporteDinamicoPedidosCompras.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPedidosCompras() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPedidosCompras.setVisible(true);
	        this.jInternalFrameImportacionPedidosCompras.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPedidosCompras() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPedidosCompras.setVisible(true);
	        this.jInternalFrameOrderByPedidosCompras.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPedidosCompras() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPedidosCompras.setVisible(false);
	        this.jInternalFrameOrderByPedidosCompras.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPedidosCompras() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPedidosCompras.setVisible(false);
	        this.jInternalFrameReporteDinamicoPedidosCompras.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPedidosCompras() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPedidosCompras.setVisible(false);
	        this.jInternalFrameImportacionPedidosCompras.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarPedidosComprasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPedidosCompras(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPedidosCompras(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPedidosCompras(true);
			//this.isEsNuevoPedidosCompras=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscompras =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.pedidoscompras =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPedidosCompras("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPedidosCompras(false) ;
			
			if(pedidoscomprasSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(PedidosComprasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePedidosCompras(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPedidosCompras(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPedidosComprasActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscompras =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pedidoscompras =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPedidosCompras(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPedidosCompras==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPedidosCompras(true);
			//this.isEsNuevoPedidosCompras=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscompras =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.pedidoscompras =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.pedidoscompras.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPedidosCompras("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPedidosCompras(false) ;
			
			if(PedidosComprasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePedidosCompras(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPedidosCompras(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaProducto(List<Producto> productosForeignKey)throws Exception{
		TableColumn tableColumnProducto=this.jTableDatosPedidosCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidosCompras,PedidosComprasConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPedidosCompras.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoTableCellFk.setRowActual(intSelectedRow);
			//productoTableCellFk.setproductosForeignKeyActual(productosForeignKey);
		//}


		if(productoTableCellFk!=null) {
			productoTableCellFk.RecargarProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLinea(List<Linea> lineasForeignKey)throws Exception{
		TableColumn tableColumnLinea=this.jTableDatosPedidosCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidosCompras,PedidosComprasConstantesFunciones.LABEL_IDLINEA));
		TableCellEditor tableCellEditorLinea =tableColumnLinea.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLinea;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPedidosCompras.getSelectedRow();

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
		TableColumn tableColumnLineaGrupo=this.jTableDatosPedidosCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidosCompras,PedidosComprasConstantesFunciones.LABEL_IDLINEAGRUPO));
		TableCellEditor tableCellEditorLineaGrupo =tableColumnLineaGrupo.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaGrupo;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineagruposForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPedidosCompras.getSelectedRow();

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
		TableColumn tableColumnLineaCategoria=this.jTableDatosPedidosCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidosCompras,PedidosComprasConstantesFunciones.LABEL_IDLINEACATEGORIA));
		TableCellEditor tableCellEditorLineaCategoria =tableColumnLineaCategoria.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaCategoria;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineacategoriasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPedidosCompras.getSelectedRow();

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
		TableColumn tableColumnLineaMarca=this.jTableDatosPedidosCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidosCompras,PedidosComprasConstantesFunciones.LABEL_IDLINEAMARCA));
		TableCellEditor tableCellEditorLineaMarca =tableColumnLineaMarca.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaMarca;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineamarcasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPedidosCompras.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineamarcasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoProductoServicio(List<TipoProductoServicio> tipoproductoserviciosForeignKey)throws Exception{
		TableColumn tableColumnTipoProductoServicio=this.jTableDatosPedidosCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidosCompras,PedidosComprasConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO));
		TableCellEditor tableCellEditorTipoProductoServicio =tableColumnTipoProductoServicio.getCellEditor();

		TipoProductoServicioTableCell tipoproductoservicioTableCellFk=(TipoProductoServicioTableCell)tableCellEditorTipoProductoServicio;

		if(tipoproductoservicioTableCellFk!=null) {
			tipoproductoservicioTableCellFk.settipoproductoserviciosForeignKey(tipoproductoserviciosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPedidosCompras.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoproductoservicioTableCellFk.setRowActual(intSelectedRow);
			//tipoproductoservicioTableCellFk.settipoproductoserviciosForeignKeyActual(tipoproductoserviciosForeignKey);
		//}


		if(tipoproductoservicioTableCellFk!=null) {
			tipoproductoservicioTableCellFk.RecargarTipoProductoServiciosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarPedidosComprasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPedidosCompras(false);
			
			//if(!this.isEsNuevoPedidosCompras) {								
				int intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscompras =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pedidoscompras =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PedidosComprasJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPedidosCompras(this.pedidoscompras,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
				
			}
			
			if(this.permiteMantenimiento(this.pedidoscompras)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.pedidoscomprasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPedidosCompras=true;
					this.inicializarActualizarBindingTablaPedidosCompras(false);
					this.isEsNuevoPedidosCompras=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPedidosCompras=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPedidosCompras=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPedidosCompras(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPedidosCompras(false);
				
				this.habilitarDeshabilitarControlesPedidosCompras(false);
			
												
				
				if(PedidosComprasJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePedidosCompras();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPedidosComprasActionPerformed(evt,pedidoscomprasSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPedidosCompras(this.pedidoscompras,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPedidosCompras.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,pedidoscomprasSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.pedidoscompras.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PedidosCompras.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PedidosCompras.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPedidosComprasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscompras =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
				this.pedidoscompras.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.pedidoscompras =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
				this.pedidoscompras.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.pedidoscompras)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.pedidoscomprasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PedidosComprasModel) this.jTableDatosPedidosCompras.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPedidosCompras=true;
				this.inicializarActualizarBindingTablaPedidosCompras(false);
				this.isEsNuevoPedidosCompras=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPedidosCompras(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPedidosCompras(false);
				
				this.habilitarDeshabilitarControlesPedidosCompras(false);
				
				
				
				if(PedidosComprasJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePedidosCompras();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPedidosComprasActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPedidosCompras.getRowCount()>=1) {
				jTableDatosPedidosCompras.removeRowSelectionInterval(0, jTableDatosPedidosCompras.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPedidosCompras(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPedidosCompras(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPedidosCompras(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPedidosCompras(false) ;
			
			this.isEsNuevoPedidosCompras=false;
			
			if(PedidosComprasJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePedidosCompras();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPedidosComprasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPedidosCompras(false);
				
				//SI ES MANUAL
				if(PedidosComprasJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPedidosCompras();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPedidosComprasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPedidosCompras--;			
			//PedidosCompras pedidoscomprasAux= new PedidosCompras();			
			//pedidoscomprasAux.setId(this.iIdNuevoPedidosCompras);
			
			if(this.jInternalFrameDetalleFormPedidosCompras==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPedidosCompras();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
			
			this.pedidoscompras.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.pedidoscomprasLogic.getPedidosComprass().add(this.pedidoscomprasAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.pedidoscomprass.add(this.pedidoscomprasAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPedidosCompras(false);
			
			this.jTableDatosPedidosCompras.setRowSelectionInterval(this.getIndiceNuevoPedidosCompras(), this.getIndiceNuevoPedidosCompras());
			
			int iLastRow =  this.jTableDatosPedidosCompras.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPedidosCompras.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPedidosCompras.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPedidosCompras(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPedidosComprasActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPedidosCompras(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPedidosCompras(false);
			
			//SI ES MANUAL
			if(PedidosComprasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPedidosCompras();
			}
			
			//this.abrirFrameTreePedidosCompras();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPedidosComprasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPedidosComprasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPedidosCompras.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPedidosCompras.setFileImportacion(this.jInternalFrameImportacionPedidosCompras.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPedidosCompras.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPedidosCompras.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPedidosCompras.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPedidosCompras.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPedidosComprasActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PedidosCompras> pedidoscomprassSeleccionados=new ArrayList<PedidosCompras>();		

		pedidoscomprassSeleccionados=this.getPedidosComprassSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPedidosCompras.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPedidosCompras.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PedidosComprasBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PedidosComprasBaseDesign.jrxml";
			
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
			
			this.generarReportePedidosComprass("Todos",pedidoscomprassSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pedidoscomprasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pedidos Compras",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPedidosCompras.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPedidosCompras.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PedidosComprasConstantesFunciones.LABEL_SECUENCIAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cuencial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cuencial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cuencial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cuencial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidosComprasConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidosComprasConstantesFunciones.LABEL_FECHAENTREGA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEntrega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEntrega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEntrega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEntrega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidosComprasConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidosComprasConstantesFunciones.LABEL_NOMBREUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreUnidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreUnidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreUnidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreUnidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidosComprasConstantesFunciones.LABEL_CANTIDADPEDIDO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidadPedido_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidadPedido_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidadPedido_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidadPedido_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidosComprasConstantesFunciones.LABEL_CANTIDADENTREGADA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidadEntregada_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidadEntregada_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidadEntregada_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidadEntregada_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidosComprasConstantesFunciones.LABEL_CANTIDADPENDIENTE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidadPendiente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidadPendiente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidadPendiente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidadPendiente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidosComprasConstantesFunciones.LABEL_CODIGOPRODUCTO:
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
		
		if(this.jInternalFrameReporteDinamicoPedidosCompras.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPedidosCompras.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPedidosCompras.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PedidosComprasConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoria="secuencial";
					break;

				case PedidosComprasConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case PedidosComprasConstantesFunciones.LABEL_FECHAENTREGA:
					sNombreCampoCategoria="fecha_entrega";
					break;

				case PedidosComprasConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoria="nombre_producto";
					break;

				case PedidosComprasConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoria="nombre_unidad";
					break;

				case PedidosComprasConstantesFunciones.LABEL_CANTIDADPEDIDO:
					sNombreCampoCategoria="cantidad_pedido";
					break;

				case PedidosComprasConstantesFunciones.LABEL_CANTIDADENTREGADA:
					sNombreCampoCategoria="cantidad_entregada";
					break;

				case PedidosComprasConstantesFunciones.LABEL_CANTIDADPENDIENTE:
					sNombreCampoCategoria="cantidad_pendiente";
					break;

				case PedidosComprasConstantesFunciones.LABEL_CODIGOPRODUCTO:
					sNombreCampoCategoria="codigo_producto";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPedidosCompras.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PedidosComprasConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoriaValor="secuencial";
					break;

				case PedidosComprasConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case PedidosComprasConstantesFunciones.LABEL_FECHAENTREGA:
					sNombreCampoCategoriaValor="fecha_entrega";
					break;

				case PedidosComprasConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoriaValor="nombre_producto";
					break;

				case PedidosComprasConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoriaValor="nombre_unidad";
					break;

				case PedidosComprasConstantesFunciones.LABEL_CANTIDADPEDIDO:
					sNombreCampoCategoriaValor="cantidad_pedido";
					break;

				case PedidosComprasConstantesFunciones.LABEL_CANTIDADENTREGADA:
					sNombreCampoCategoriaValor="cantidad_entregada";
					break;

				case PedidosComprasConstantesFunciones.LABEL_CANTIDADPENDIENTE:
					sNombreCampoCategoriaValor="cantidad_pendiente";
					break;

				case PedidosComprasConstantesFunciones.LABEL_CODIGOPRODUCTO:
					sNombreCampoCategoriaValor="codigo_producto";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPedidosCompras.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPedidosCompras.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PedidosComprasConstantesFunciones.LABEL_SECUENCIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Secuencial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"secuencial");
					break;

				case PedidosComprasConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case PedidosComprasConstantesFunciones.LABEL_FECHAENTREGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Entrega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_entrega");
					break;

				case PedidosComprasConstantesFunciones.LABEL_NOMBREPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_producto");
					break;

				case PedidosComprasConstantesFunciones.LABEL_NOMBREUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Unad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_unidad");
					break;

				case PedidosComprasConstantesFunciones.LABEL_CANTIDADPEDIDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantad Pedo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad_pedido");
					break;

				case PedidosComprasConstantesFunciones.LABEL_CANTIDADENTREGADA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantad Entregada",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad_entregada");
					break;

				case PedidosComprasConstantesFunciones.LABEL_CANTIDADPENDIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantad Pendiente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad_pendiente");
					break;

				case PedidosComprasConstantesFunciones.LABEL_CODIGOPRODUCTO:
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
	
	public void jButtonGenerarExcelReporteDinamicoPedidosComprasActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PedidosCompras> pedidoscomprassSeleccionados=new ArrayList<PedidosCompras>();		
		
		pedidoscomprassSeleccionados=this.getPedidosComprassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pedidoscompras";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("PedidosComprass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPedidosCompras.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPedidosCompras.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PedidosComprasConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(PedidosCompras pedidoscompras:pedidoscomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidoscompras.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidosComprasConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(PedidosCompras pedidoscompras:pedidoscomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidoscompras.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidosComprasConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(PedidosCompras pedidoscompras:pedidoscomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidoscompras.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidosComprasConstantesFunciones.LABEL_IDLINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_IDLINEA);
					iRow++;

					for(PedidosCompras pedidoscompras:pedidoscomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidoscompras.getlinea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidosComprasConstantesFunciones.LABEL_IDLINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_IDLINEAGRUPO);
					iRow++;

					for(PedidosCompras pedidoscompras:pedidoscomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidoscompras.getlineagrupo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidosComprasConstantesFunciones.LABEL_IDLINEACATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_IDLINEACATEGORIA);
					iRow++;

					for(PedidosCompras pedidoscompras:pedidoscomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidoscompras.getlineacategoria_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidosComprasConstantesFunciones.LABEL_IDLINEAMARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_IDLINEAMARCA);
					iRow++;

					for(PedidosCompras pedidoscompras:pedidoscomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidoscompras.getlineamarca_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidosComprasConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO);
					iRow++;

					for(PedidosCompras pedidoscompras:pedidoscomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidoscompras.gettipoproductoservicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidosComprasConstantesFunciones.LABEL_FECHAEMISIONDESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_FECHAEMISIONDESDE);
					iRow++;

					for(PedidosCompras pedidoscompras:pedidoscomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidoscompras.getfecha_emision_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidosComprasConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(PedidosCompras pedidoscompras:pedidoscomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidoscompras.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidosComprasConstantesFunciones.LABEL_SECUENCIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_SECUENCIAL);
					iRow++;

					for(PedidosCompras pedidoscompras:pedidoscomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidoscompras.getsecuencial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidosComprasConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(PedidosCompras pedidoscompras:pedidoscomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidoscompras.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidosComprasConstantesFunciones.LABEL_FECHAENTREGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_FECHAENTREGA);
					iRow++;

					for(PedidosCompras pedidoscompras:pedidoscomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidoscompras.getfecha_entrega());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidosComprasConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_NOMBREPRODUCTO);
					iRow++;

					for(PedidosCompras pedidoscompras:pedidoscomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidoscompras.getnombre_producto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidosComprasConstantesFunciones.LABEL_NOMBREUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_NOMBREUNIDAD);
					iRow++;

					for(PedidosCompras pedidoscompras:pedidoscomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidoscompras.getnombre_unidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidosComprasConstantesFunciones.LABEL_CANTIDADPEDIDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_CANTIDADPEDIDO);
					iRow++;

					for(PedidosCompras pedidoscompras:pedidoscomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidoscompras.getcantidad_pedido());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidosComprasConstantesFunciones.LABEL_CANTIDADENTREGADA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_CANTIDADENTREGADA);
					iRow++;

					for(PedidosCompras pedidoscompras:pedidoscomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidoscompras.getcantidad_entregada());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidosComprasConstantesFunciones.LABEL_CANTIDADPENDIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_CANTIDADPENDIENTE);
					iRow++;

					for(PedidosCompras pedidoscompras:pedidoscomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidoscompras.getcantidad_pendiente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidosComprasConstantesFunciones.LABEL_CODIGOPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_CODIGOPRODUCTO);
					iRow++;

					for(PedidosCompras pedidoscompras:pedidoscomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidoscompras.getcodigo_producto());
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
			//	this.getFilaCabeceraExportarExcelPedidosCompras(row);				
			//	iRow++;
			//}				
			
			//for(PedidosCompras pedidoscomprasAux:pedidoscomprassSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPedidosCompras(pedidoscomprasAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pedidoscomprasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pedidos Compras",JOptionPane.INFORMATION_MESSAGE);
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
				this.pedidoscomprasLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPedidosCompras(false);
			
			//SI ES MANUAL
			if(PedidosComprasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPedidosCompras();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPedidosComprasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPedidosCompras(false);
			
			//SI ES MANUAL
			if(PedidosComprasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPedidosCompras();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPedidosComprasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPedidosCompras(false);
			
			//SI ES MANUAL
			if(PedidosComprasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPedidosCompras();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPedidosCompras() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPedidosCompras.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPedidosCompras.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPedidosCompras.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPedidosCompras.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPedidosCompras.setMinimumSize(dimensionMinimum);
		this.jTableDatosPedidosCompras.setMaximumSize(dimensionMaximum);
		this.jTableDatosPedidosCompras.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPedidosCompras(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPedidosCompras(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPedidosCompras(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPedidosCompras(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPedidosCompras(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.pedidoscomprasSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPedidosCompras(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPedidosCompras(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPedidosCompras(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PedidosComprasJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PedidosComprasJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPedidosCompras() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPedidosCompras();
		
		this.inicializarActualizarBindingBotonesManualPedidosCompras(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.pedidoscomprasSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPedidosCompras();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPedidosCompras() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPedidosCompras(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPedidosCompras(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPedidosCompras.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPedidosCompras.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePedidosCompras.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPedidosCompras.jCheckBoxPostAccionNuevoPedidosCompras.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPedidosCompras.jCheckBoxPostAccionSinCerrarPedidosCompras.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPedidosCompras.jCheckBoxPostAccionSinMensajePedidosCompras.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPedidosCompras.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPedidosCompras.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePedidosCompras.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
				this.jInternalFrameDetalleFormPedidosCompras.jCheckBoxPostAccionNuevoPedidosCompras.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPedidosCompras.jCheckBoxPostAccionSinCerrarPedidosCompras.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPedidosCompras.jCheckBoxPostAccionSinMensajePedidosCompras.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPedidosCompras.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPedidosCompras.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPedidosCompras.jComboBoxTiposAccionesFormularioPedidosCompras.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPedidosCompras.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPedidosCompras!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPedidosCompras.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPedidosCompras.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPedidosCompras.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPedidosCompras.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPedidosCompras.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPedidosCompras!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPedidosCompras.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPedidosCompras.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPedidosCompras.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPedidosCompras(Boolean esInicializar) throws Exception {
		try	{	
			if(PedidosComprasJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPedidosCompras(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPedidosCompras() throws Exception {
		try	{
			if(PedidosComprasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPedidosCompras();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePedidosCompras() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPedidosCompras.jComboBoxTiposAccionesFormularioPedidosCompras.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPedidosCompras.jComboBoxTiposAccionesFormularioPedidosCompras.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPedidosCompras() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPedidosCompras.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPedidosCompras.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPedidosCompras.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPedidosCompras.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPedidosCompras.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPedidosCompras.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPedidosCompras.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPedidosCompras.addItem(reporte);
			}
			
			
			if(!this.pedidoscomprasSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPedidosCompras.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPedidosCompras.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPedidosCompras.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPedidosCompras.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPedidosCompras.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPedidosCompras.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPedidosCompras!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPedidosCompras.jComboBoxTiposAccionesFormularioPedidosCompras.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPedidosCompras.jComboBoxTiposAccionesFormularioPedidosCompras.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPedidosCompras.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPedidosCompras.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPedidosCompras.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPedidosCompras();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPedidosCompras() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPedidosCompras!=null) {
				this.jInternalFrameReporteDinamicoPedidosCompras.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPedidosCompras.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPedidosCompras!=null) {
				this.jInternalFrameReporteDinamicoPedidosCompras.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPedidosCompras.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPedidosCompras!=null) {
				
				if(this.jInternalFrameReporteDinamicoPedidosCompras.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPedidosCompras.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPedidosCompras.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPedidosCompras.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPedidosCompras.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPedidosCompras.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPedidosCompras()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_productoBusquedaPedidosComprasPedidosCompras.getSelectedItem()!=null){this.id_productoBusquedaPedidosCompras=((Producto)this.jComboBoxid_productoBusquedaPedidosComprasPedidosCompras.getSelectedItem()).getId();}
		if(this.jComboBoxid_lineaBusquedaPedidosComprasPedidosCompras.getSelectedItem()!=null){this.id_lineaBusquedaPedidosCompras=((Linea)this.jComboBoxid_lineaBusquedaPedidosComprasPedidosCompras.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_grupoBusquedaPedidosComprasPedidosCompras.getSelectedItem()!=null){this.id_linea_grupoBusquedaPedidosCompras=((Linea)this.jComboBoxid_linea_grupoBusquedaPedidosComprasPedidosCompras.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_categoriaBusquedaPedidosComprasPedidosCompras.getSelectedItem()!=null){this.id_linea_categoriaBusquedaPedidosCompras=((Linea)this.jComboBoxid_linea_categoriaBusquedaPedidosComprasPedidosCompras.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_marcaBusquedaPedidosComprasPedidosCompras.getSelectedItem()!=null){this.id_linea_marcaBusquedaPedidosCompras=((Linea)this.jComboBoxid_linea_marcaBusquedaPedidosComprasPedidosCompras.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_producto_servicioBusquedaPedidosComprasPedidosCompras.getSelectedItem()!=null){this.id_tipo_producto_servicioBusquedaPedidosCompras=((TipoProductoServicio)this.jComboBoxid_tipo_producto_servicioBusquedaPedidosComprasPedidosCompras.getSelectedItem()).getId();}
		this.fecha_emision_desdeBusquedaPedidosCompras=new Date(this.jDateChooserfecha_emision_desdeBusquedaPedidosComprasPedidosCompras.getDate().getTime());
		this.fecha_emision_hastaBusquedaPedidosCompras=new Date(this.jDateChooserfecha_emision_hastaBusquedaPedidosComprasPedidosCompras.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPedidosCompras(Boolean esInicializar) throws Exception {				
		if(PedidosComprasJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPedidosCompras();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPedidosCompras() throws Exception {
		this.inicializarActualizarBindingTablaPedidosCompras(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPedidosCompras() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPedidosCompras.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPedidosCompras.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPedidosCompras.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PedidosComprasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPedidosCompras.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPedidosCompras.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PedidosComprasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPedidosComprasOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidosComprasOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PedidosComprasPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPedidosCompras.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPedidosCompras.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PedidosComprasPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPedidosCompras.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPedidosCompras(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=pedidoscomprasLogic.getPedidosComprass().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=pedidoscomprass.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PedidosComprasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPedidosCompras.setModel(new PedidosComprasModel(this.pedidoscomprasLogic.getPedidosComprass(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPedidosCompras.setModel(new PedidosComprasModel(this.pedidoscomprass,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPedidosCompras!=null && this.jInternalFrameOrderByPedidosCompras.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPedidosCompras();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPedidosCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidosCompras,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PedidosComprasPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PedidosComprasConstantesFunciones.SCLASSWEBTITULO,pedidoscomprasConstantesFunciones.resaltarSeleccionarPedidosCompras,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PedidosComprasConstantesFunciones.SCLASSWEBTITULO,pedidoscomprasConstantesFunciones.resaltarSeleccionarPedidosCompras,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPedidosCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidosCompras,PedidosComprasConstantesFunciones.LABEL_ID));

		if(this.pedidoscomprasConstantesFunciones.mostraridPedidosCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidosComprasConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.pedidoscomprasConstantesFunciones.resaltaridPedidosCompras,this.pedidoscomprasConstantesFunciones.activaridPedidosCompras,this,true,"idPedidosCompras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pedidoscomprasConstantesFunciones.resaltaridPedidosCompras,this.pedidoscomprasConstantesFunciones.activaridPedidosCompras,this,true,"idPedidosCompras","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidosCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidosCompras,PedidosComprasConstantesFunciones.LABEL_SECUENCIAL));

		if(this.pedidoscomprasConstantesFunciones.mostrarsecuencialPedidosCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidosComprasConstantesFunciones.LABEL_SECUENCIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pedidoscomprasConstantesFunciones.resaltarsecuencialPedidosCompras,this.pedidoscomprasConstantesFunciones.activarsecuencialPedidosCompras,this,true,"secuencialPedidosCompras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pedidoscomprasConstantesFunciones.resaltarsecuencialPedidosCompras,this.pedidoscomprasConstantesFunciones.activarsecuencialPedidosCompras,this,true,"secuencialPedidosCompras","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PedidosComprasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidosCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidosCompras,PedidosComprasConstantesFunciones.LABEL_FECHAEMISION));

		if(this.pedidoscomprasConstantesFunciones.mostrarfecha_emisionPedidosCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidosComprasConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.pedidoscomprasConstantesFunciones.resaltarfecha_emisionPedidosCompras,this.pedidoscomprasConstantesFunciones.activarfecha_emisionPedidosCompras,this,true,"fecha_emisionPedidosCompras","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.pedidoscomprasConstantesFunciones.resaltarfecha_emisionPedidosCompras,this.pedidoscomprasConstantesFunciones.activarfecha_emisionPedidosCompras,this,true,"fecha_emisionPedidosCompras","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new PedidosComprasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidosCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidosCompras,PedidosComprasConstantesFunciones.LABEL_FECHAENTREGA));

		if(this.pedidoscomprasConstantesFunciones.mostrarfecha_entregaPedidosCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidosComprasConstantesFunciones.LABEL_FECHAENTREGA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.pedidoscomprasConstantesFunciones.resaltarfecha_entregaPedidosCompras,this.pedidoscomprasConstantesFunciones.activarfecha_entregaPedidosCompras,this,true,"fecha_entregaPedidosCompras","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.pedidoscomprasConstantesFunciones.resaltarfecha_entregaPedidosCompras,this.pedidoscomprasConstantesFunciones.activarfecha_entregaPedidosCompras,this,true,"fecha_entregaPedidosCompras","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new PedidosComprasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidosCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidosCompras,PedidosComprasConstantesFunciones.LABEL_NOMBREPRODUCTO));

		if(this.pedidoscomprasConstantesFunciones.mostrarnombre_productoPedidosCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidosComprasConstantesFunciones.LABEL_NOMBREPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pedidoscomprasConstantesFunciones.resaltarnombre_productoPedidosCompras,this.pedidoscomprasConstantesFunciones.activarnombre_productoPedidosCompras,this,true,"nombre_productoPedidosCompras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pedidoscomprasConstantesFunciones.resaltarnombre_productoPedidosCompras,this.pedidoscomprasConstantesFunciones.activarnombre_productoPedidosCompras,this,true,"nombre_productoPedidosCompras","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PedidosComprasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidosCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidosCompras,PedidosComprasConstantesFunciones.LABEL_NOMBREUNIDAD));

		if(this.pedidoscomprasConstantesFunciones.mostrarnombre_unidadPedidosCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidosComprasConstantesFunciones.LABEL_NOMBREUNIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pedidoscomprasConstantesFunciones.resaltarnombre_unidadPedidosCompras,this.pedidoscomprasConstantesFunciones.activarnombre_unidadPedidosCompras,this,true,"nombre_unidadPedidosCompras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pedidoscomprasConstantesFunciones.resaltarnombre_unidadPedidosCompras,this.pedidoscomprasConstantesFunciones.activarnombre_unidadPedidosCompras,this,true,"nombre_unidadPedidosCompras","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PedidosComprasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidosCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidosCompras,PedidosComprasConstantesFunciones.LABEL_CANTIDADPEDIDO));

		if(this.pedidoscomprasConstantesFunciones.mostrarcantidad_pedidoPedidosCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidosComprasConstantesFunciones.LABEL_CANTIDADPEDIDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.pedidoscomprasConstantesFunciones.resaltarcantidad_pedidoPedidosCompras,this.pedidoscomprasConstantesFunciones.activarcantidad_pedidoPedidosCompras,this,true,"cantidad_pedidoPedidosCompras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pedidoscomprasConstantesFunciones.resaltarcantidad_pedidoPedidosCompras,this.pedidoscomprasConstantesFunciones.activarcantidad_pedidoPedidosCompras,this,true,"cantidad_pedidoPedidosCompras","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PedidosComprasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidosCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidosCompras,PedidosComprasConstantesFunciones.LABEL_CANTIDADENTREGADA));

		if(this.pedidoscomprasConstantesFunciones.mostrarcantidad_entregadaPedidosCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidosComprasConstantesFunciones.LABEL_CANTIDADENTREGADA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.pedidoscomprasConstantesFunciones.resaltarcantidad_entregadaPedidosCompras,this.pedidoscomprasConstantesFunciones.activarcantidad_entregadaPedidosCompras,this,true,"cantidad_entregadaPedidosCompras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pedidoscomprasConstantesFunciones.resaltarcantidad_entregadaPedidosCompras,this.pedidoscomprasConstantesFunciones.activarcantidad_entregadaPedidosCompras,this,true,"cantidad_entregadaPedidosCompras","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PedidosComprasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidosCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidosCompras,PedidosComprasConstantesFunciones.LABEL_CANTIDADPENDIENTE));

		if(this.pedidoscomprasConstantesFunciones.mostrarcantidad_pendientePedidosCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidosComprasConstantesFunciones.LABEL_CANTIDADPENDIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.pedidoscomprasConstantesFunciones.resaltarcantidad_pendientePedidosCompras,this.pedidoscomprasConstantesFunciones.activarcantidad_pendientePedidosCompras,this,true,"cantidad_pendientePedidosCompras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pedidoscomprasConstantesFunciones.resaltarcantidad_pendientePedidosCompras,this.pedidoscomprasConstantesFunciones.activarcantidad_pendientePedidosCompras,this,true,"cantidad_pendientePedidosCompras","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PedidosComprasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidosCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidosCompras,PedidosComprasConstantesFunciones.LABEL_CODIGOPRODUCTO));

		if(this.pedidoscomprasConstantesFunciones.mostrarcodigo_productoPedidosCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidosComprasConstantesFunciones.LABEL_CODIGOPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pedidoscomprasConstantesFunciones.resaltarcodigo_productoPedidosCompras,this.pedidoscomprasConstantesFunciones.activarcodigo_productoPedidosCompras,this,true,"codigo_productoPedidosCompras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pedidoscomprasConstantesFunciones.resaltarcodigo_productoPedidosCompras,this.pedidoscomprasConstantesFunciones.activarcodigo_productoPedidosCompras,this,true,"codigo_productoPedidosCompras","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PedidosComprasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.pedidoscomprasSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.pedidoscomprasSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.pedidoscomprasSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPedidosCompras.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.pedidoscomprasSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.pedidoscomprasSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPedidosCompras.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPedidosCompras && this.isPermisoGuardarCambiosPedidosCompras) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.pedidoscomprasSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.pedidoscomprasSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPedidosCompras.addColumn(tableColumn);
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
			
			this.jTableDatosPedidosCompras.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPedidosCompras && this.isPermisoGuardarCambiosPedidosCompras) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPedidosCompras && this.isPermisoGuardarCambiosPedidosCompras) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPedidosCompras.moveColumn(this.jTableDatosPedidosCompras.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPedidosCompras.moveColumn(this.jTableDatosPedidosCompras.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPedidosCompras.moveColumn(this.jTableDatosPedidosCompras.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPedidosCompras.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPedidosCompras.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPedidosCompras,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PedidosComprasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPedidosCompras.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPedidosCompras.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PedidosComprasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PedidosComprasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPedidosCompras.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPedidosCompras.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPedidosCompras.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=pedidoscomprasLogic.getPedidosComprass().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=pedidoscomprass.size()-1;
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
		//this.jTableDatosPedidosCompras.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPedidosCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPedidosCompras();
			
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
				
				//this.isEsNuevoPedidosCompras=false;
					
				PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
			
				if(this.pedidoscomprasSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPedidosCompras==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPedidosCompras.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPedidosCompras.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscompras =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pedidoscompras =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.pedidoscompras.getsType().equals("DUPLICADO")
				   || this.pedidoscompras.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPedidosCompras=true;
				
				} else {
					this.isEsNuevoPedidosCompras=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.pedidoscomprasSessionBean.getEsGuardarRelacionado()) {
					if(this.pedidoscompras.getId()>=0 && !this.pedidoscompras.getIsNew()) {						
						this.isEsNuevoPedidosCompras=false;
						
					} else {
						this.isEsNuevoPedidosCompras=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPedidosCompras(esRelaciones);						
				
				this.seleccionarPedidosCompras(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.pedidoscompras.getId()<0) {
					this.isEsNuevoPedidosCompras=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPedidosCompras(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPedidosCompras(evt,rowIndex);
				}	
				
				if(this.pedidoscomprasSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PedidosCompras: " + this.dDif); 
					}
				}								
				
				PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPedidosCompras(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.pedidoscompras)) {
					if(this.pedidoscompras.getId()>0) {
						this.pedidoscompras.setIsDeleted(true);
						
						this.pedidoscomprassEliminados.add(this.pedidoscompras);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.pedidoscomprasLogic.getPedidosComprass().remove(this.pedidoscompras);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.pedidoscomprass.remove(this.pedidoscompras);				
					}
					
					
					((PedidosComprasModel) this.jTableDatosPedidosCompras.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPedidosCompras(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPedidosCompras(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPedidosCompras) {
			
			if(this.jInternalFrameDetalleFormPedidosCompras==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPedidosCompras.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPedidosCompras.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscompras =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pedidoscompras =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PedidosComprasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPedidosCompras(this.pedidoscompras);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPedidosCompras("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPedidosCompras(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPedidosCompras() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPedidosCompras(PedidosCompras pedidoscompras) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPedidosCompras(pedidoscompras,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPedidosCompras(PedidosCompras pedidoscompras,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPedidosCompras(pedidoscompras);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPedidosCompras(pedidoscompras,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPedidosCompras(pedidoscompras);
	}
	
	public void setVariablesObjetoActualToFormularioPedidosCompras(PedidosCompras pedidoscompras) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPedidosCompras==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPedidosCompras.jLabelidPedidosCompras.setText(pedidoscompras.getId().toString());
			this.jInternalFrameDetalleFormPedidosCompras.jTextFieldsecuencialPedidosCompras.setText(pedidoscompras.getsecuencial());
			this.jInternalFrameDetalleFormPedidosCompras.jDateChooserfecha_emisionPedidosCompras.setDate(pedidoscompras.getfecha_emision());
			this.jInternalFrameDetalleFormPedidosCompras.jDateChooserfecha_entregaPedidosCompras.setDate(pedidoscompras.getfecha_entrega());
			this.jInternalFrameDetalleFormPedidosCompras.jTextAreanombre_productoPedidosCompras.setText(pedidoscompras.getnombre_producto());
			this.jInternalFrameDetalleFormPedidosCompras.jTextFieldnombre_unidadPedidosCompras.setText(pedidoscompras.getnombre_unidad());
			this.jInternalFrameDetalleFormPedidosCompras.jTextFieldcantidad_pedidoPedidosCompras.setText(pedidoscompras.getcantidad_pedido().toString());
			this.jInternalFrameDetalleFormPedidosCompras.jTextFieldcantidad_entregadaPedidosCompras.setText(pedidoscompras.getcantidad_entregada().toString());
			this.jInternalFrameDetalleFormPedidosCompras.jTextFieldcantidad_pendientePedidosCompras.setText(pedidoscompras.getcantidad_pendiente().toString());
			this.jInternalFrameDetalleFormPedidosCompras.jTextFieldcodigo_productoPedidosCompras.setText(pedidoscompras.getcodigo_producto());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PedidosCompras pedidoscomprasLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,pedidoscomprasLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PedidosCompras pedidoscomprasLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				pedidoscomprasLocal=this.pedidoscompras;
			} else {
				pedidoscomprasLocal=this.pedidoscomprasAnterior;
			}
		}
		
		if(this.permiteMantenimiento(pedidoscomprasLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPedidosCompras(pedidoscomprasLocal,true);
					
					if(pedidoscomprasSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(pedidoscomprasLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.pedidoscomprasSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(pedidoscomprasLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPedidosCompras(PedidosCompras pedidoscompras,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPedidosCompras(pedidoscompras,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(pedidoscompras);
	}
	
	public void setVariablesFormularioToObjetoActualPedidosCompras(PedidosCompras pedidoscompras,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPedidosCompras(pedidoscompras,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPedidosCompras(PedidosCompras pedidoscompras,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPedidosCompras==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPedidosCompras.jLabelidPedidosCompras.getText()==null || this.jInternalFrameDetalleFormPedidosCompras.jLabelidPedidosCompras.getText()=="" || this.jInternalFrameDetalleFormPedidosCompras.jLabelidPedidosCompras.getText()=="Id") {
				this.jInternalFrameDetalleFormPedidosCompras.jLabelidPedidosCompras.setText("0");
			}

			if(conColumnasBase) {pedidoscompras.setId(Long.parseLong(this.jInternalFrameDetalleFormPedidosCompras.jLabelidPedidosCompras.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PedidosComprasConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidosCompras.jLabelIdPedidosCompras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pedidoscompras.setsecuencial(this.jInternalFrameDetalleFormPedidosCompras.jTextFieldsecuencialPedidosCompras.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PedidosComprasConstantesFunciones.LABEL_SECUENCIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidosCompras.jLabelsecuencialPedidosCompras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pedidoscompras.setfecha_emision(this.jInternalFrameDetalleFormPedidosCompras.jDateChooserfecha_emisionPedidosCompras.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PedidosComprasConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidosCompras.jLabelfecha_emisionPedidosCompras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pedidoscompras.setfecha_entrega(this.jInternalFrameDetalleFormPedidosCompras.jDateChooserfecha_entregaPedidosCompras.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PedidosComprasConstantesFunciones.LABEL_FECHAENTREGA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidosCompras.jLabelfecha_entregaPedidosCompras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pedidoscompras.setnombre_producto(this.jInternalFrameDetalleFormPedidosCompras.jTextAreanombre_productoPedidosCompras.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PedidosComprasConstantesFunciones.LABEL_NOMBREPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidosCompras.jLabelnombre_productoPedidosCompras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pedidoscompras.setnombre_unidad(this.jInternalFrameDetalleFormPedidosCompras.jTextFieldnombre_unidadPedidosCompras.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PedidosComprasConstantesFunciones.LABEL_NOMBREUNIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidosCompras.jLabelnombre_unidadPedidosCompras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pedidoscompras.setcantidad_pedido(Integer.parseInt(this.jInternalFrameDetalleFormPedidosCompras.jTextFieldcantidad_pedidoPedidosCompras.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PedidosComprasConstantesFunciones.LABEL_CANTIDADPEDIDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidosCompras.jLabelcantidad_pedidoPedidosCompras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pedidoscompras.setcantidad_entregada(Integer.parseInt(this.jInternalFrameDetalleFormPedidosCompras.jTextFieldcantidad_entregadaPedidosCompras.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PedidosComprasConstantesFunciones.LABEL_CANTIDADENTREGADA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidosCompras.jLabelcantidad_entregadaPedidosCompras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pedidoscompras.setcantidad_pendiente(Integer.parseInt(this.jInternalFrameDetalleFormPedidosCompras.jTextFieldcantidad_pendientePedidosCompras.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PedidosComprasConstantesFunciones.LABEL_CANTIDADPENDIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidosCompras.jLabelcantidad_pendientePedidosCompras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pedidoscompras.setcodigo_producto(this.jInternalFrameDetalleFormPedidosCompras.jTextFieldcodigo_productoPedidosCompras.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PedidosComprasConstantesFunciones.LABEL_CODIGOPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidosCompras.jLabelcodigo_productoPedidosCompras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPedidosCompras(PedidosCompras pedidoscomprasBean,PedidosCompras pedidoscompras,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPedidosCompras(PedidosCompras pedidoscomprasOrigen,PedidosCompras pedidoscompras,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && pedidoscomprasOrigen.getId()!=null && !pedidoscomprasOrigen.getId().equals(0L))) {pedidoscompras.setId(pedidoscomprasOrigen.getId());}}
			if(conDefault || (!conDefault && pedidoscomprasOrigen.getfecha_emision_desde()!=null && !pedidoscomprasOrigen.getfecha_emision_desde().equals(new Date()))) {pedidoscompras.setfecha_emision_desde(pedidoscomprasOrigen.getfecha_emision_desde());}
			if(conDefault || (!conDefault && pedidoscomprasOrigen.getfecha_emision_hasta()!=null && !pedidoscomprasOrigen.getfecha_emision_hasta().equals(new Date()))) {pedidoscompras.setfecha_emision_hasta(pedidoscomprasOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && pedidoscomprasOrigen.getsecuencial()!=null && !pedidoscomprasOrigen.getsecuencial().equals(""))) {pedidoscompras.setsecuencial(pedidoscomprasOrigen.getsecuencial());}
			if(conDefault || (!conDefault && pedidoscomprasOrigen.getfecha_emision()!=null && !pedidoscomprasOrigen.getfecha_emision().equals(new Date()))) {pedidoscompras.setfecha_emision(pedidoscomprasOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && pedidoscomprasOrigen.getfecha_entrega()!=null && !pedidoscomprasOrigen.getfecha_entrega().equals(new Date()))) {pedidoscompras.setfecha_entrega(pedidoscomprasOrigen.getfecha_entrega());}
			if(conDefault || (!conDefault && pedidoscomprasOrigen.getnombre_producto()!=null && !pedidoscomprasOrigen.getnombre_producto().equals(""))) {pedidoscompras.setnombre_producto(pedidoscomprasOrigen.getnombre_producto());}
			if(conDefault || (!conDefault && pedidoscomprasOrigen.getnombre_unidad()!=null && !pedidoscomprasOrigen.getnombre_unidad().equals(""))) {pedidoscompras.setnombre_unidad(pedidoscomprasOrigen.getnombre_unidad());}
			if(conDefault || (!conDefault && pedidoscomprasOrigen.getcantidad_pedido()!=null && !pedidoscomprasOrigen.getcantidad_pedido().equals(0))) {pedidoscompras.setcantidad_pedido(pedidoscomprasOrigen.getcantidad_pedido());}
			if(conDefault || (!conDefault && pedidoscomprasOrigen.getcantidad_entregada()!=null && !pedidoscomprasOrigen.getcantidad_entregada().equals(0))) {pedidoscompras.setcantidad_entregada(pedidoscomprasOrigen.getcantidad_entregada());}
			if(conDefault || (!conDefault && pedidoscomprasOrigen.getcantidad_pendiente()!=null && !pedidoscomprasOrigen.getcantidad_pendiente().equals(0))) {pedidoscompras.setcantidad_pendiente(pedidoscomprasOrigen.getcantidad_pendiente());}
			if(conDefault || (!conDefault && pedidoscomprasOrigen.getcodigo_producto()!=null && !pedidoscomprasOrigen.getcodigo_producto().equals(""))) {pedidoscompras.setcodigo_producto(pedidoscomprasOrigen.getcodigo_producto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPedidosCompras(PedidosCompras pedidoscompras) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPedidosCompras.jLabelidPedidosCompras.setText(pedidoscompras.getId().toString());
			this.jInternalFrameDetalleFormPedidosCompras.jTextFieldsecuencialPedidosCompras.setText(pedidoscompras.getsecuencial());
			this.jInternalFrameDetalleFormPedidosCompras.jDateChooserfecha_emisionPedidosCompras.setDate(pedidoscompras.getfecha_emision());
			this.jInternalFrameDetalleFormPedidosCompras.jDateChooserfecha_entregaPedidosCompras.setDate(pedidoscompras.getfecha_entrega());
			this.jInternalFrameDetalleFormPedidosCompras.jTextAreanombre_productoPedidosCompras.setText(pedidoscompras.getnombre_producto());
			this.jInternalFrameDetalleFormPedidosCompras.jTextFieldnombre_unidadPedidosCompras.setText(pedidoscompras.getnombre_unidad());
			this.jInternalFrameDetalleFormPedidosCompras.jTextFieldcantidad_pedidoPedidosCompras.setText(pedidoscompras.getcantidad_pedido().toString());
			this.jInternalFrameDetalleFormPedidosCompras.jTextFieldcantidad_entregadaPedidosCompras.setText(pedidoscompras.getcantidad_entregada().toString());
			this.jInternalFrameDetalleFormPedidosCompras.jTextFieldcantidad_pendientePedidosCompras.setText(pedidoscompras.getcantidad_pendiente().toString());
			this.jInternalFrameDetalleFormPedidosCompras.jTextFieldcodigo_productoPedidosCompras.setText(pedidoscompras.getcodigo_producto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPedidosCompras(PedidosComprasBean pedidoscomprasBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPedidosCompras.jLabelidPedidosCompras.setText(pedidoscomprasBean.getId().toString());
			this.jInternalFrameDetalleFormPedidosCompras.jTextFieldsecuencialPedidosCompras.setText(pedidoscomprasBean.getsecuencial());
			this.jInternalFrameDetalleFormPedidosCompras.jDateChooserfecha_emisionPedidosCompras.setDate(pedidoscomprasBean.getfecha_emision());
			this.jInternalFrameDetalleFormPedidosCompras.jDateChooserfecha_entregaPedidosCompras.setDate(pedidoscomprasBean.getfecha_entrega());
			this.jInternalFrameDetalleFormPedidosCompras.jTextAreanombre_productoPedidosCompras.setText(pedidoscomprasBean.getnombre_producto());
			this.jInternalFrameDetalleFormPedidosCompras.jTextFieldnombre_unidadPedidosCompras.setText(pedidoscomprasBean.getnombre_unidad());
			this.jInternalFrameDetalleFormPedidosCompras.jTextFieldcantidad_pedidoPedidosCompras.setText(pedidoscomprasBean.getcantidad_pedido().toString());
			this.jInternalFrameDetalleFormPedidosCompras.jTextFieldcantidad_entregadaPedidosCompras.setText(pedidoscomprasBean.getcantidad_entregada().toString());
			this.jInternalFrameDetalleFormPedidosCompras.jTextFieldcantidad_pendientePedidosCompras.setText(pedidoscomprasBean.getcantidad_pendiente().toString());
			this.jInternalFrameDetalleFormPedidosCompras.jTextFieldcodigo_productoPedidosCompras.setText(pedidoscomprasBean.getcodigo_producto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPedidosCompras(PedidosComprasParameterReturnGeneral pedidoscomprasReturnGeneral,PedidosComprasBean pedidoscomprasBean,Boolean conDefault) throws Exception { 
		try {
			PedidosCompras pedidoscomprasLocal=new PedidosCompras();
			
			pedidoscomprasLocal=pedidoscomprasReturnGeneral.getPedidosCompras();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && pedidoscomprasLocal.getId()!=null && !pedidoscomprasLocal.getId().equals(0L))) {pedidoscomprasBean.setId(pedidoscomprasLocal.getId());}}
			if(conDefault || (!conDefault && pedidoscomprasLocal.getsecuencial()!=null && !pedidoscomprasLocal.getsecuencial().equals(""))) {pedidoscomprasBean.setsecuencial(pedidoscomprasLocal.getsecuencial());}
			if(conDefault || (!conDefault && pedidoscomprasLocal.getfecha_emision()!=null && !pedidoscomprasLocal.getfecha_emision().equals(new Date()))) {pedidoscomprasBean.setfecha_emision(pedidoscomprasLocal.getfecha_emision());}
			if(conDefault || (!conDefault && pedidoscomprasLocal.getfecha_entrega()!=null && !pedidoscomprasLocal.getfecha_entrega().equals(new Date()))) {pedidoscomprasBean.setfecha_entrega(pedidoscomprasLocal.getfecha_entrega());}
			if(conDefault || (!conDefault && pedidoscomprasLocal.getnombre_producto()!=null && !pedidoscomprasLocal.getnombre_producto().equals(""))) {pedidoscomprasBean.setnombre_producto(pedidoscomprasLocal.getnombre_producto());}
			if(conDefault || (!conDefault && pedidoscomprasLocal.getnombre_unidad()!=null && !pedidoscomprasLocal.getnombre_unidad().equals(""))) {pedidoscomprasBean.setnombre_unidad(pedidoscomprasLocal.getnombre_unidad());}
			if(conDefault || (!conDefault && pedidoscomprasLocal.getcantidad_pedido()!=null && !pedidoscomprasLocal.getcantidad_pedido().equals(0))) {pedidoscomprasBean.setcantidad_pedido(pedidoscomprasLocal.getcantidad_pedido());}
			if(conDefault || (!conDefault && pedidoscomprasLocal.getcantidad_entregada()!=null && !pedidoscomprasLocal.getcantidad_entregada().equals(0))) {pedidoscomprasBean.setcantidad_entregada(pedidoscomprasLocal.getcantidad_entregada());}
			if(conDefault || (!conDefault && pedidoscomprasLocal.getcantidad_pendiente()!=null && !pedidoscomprasLocal.getcantidad_pendiente().equals(0))) {pedidoscomprasBean.setcantidad_pendiente(pedidoscomprasLocal.getcantidad_pendiente());}
			if(conDefault || (!conDefault && pedidoscomprasLocal.getcodigo_producto()!=null && !pedidoscomprasLocal.getcodigo_producto().equals(""))) {pedidoscomprasBean.setcodigo_producto(pedidoscomprasLocal.getcodigo_producto());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPedidosComprasGenerico(Long idPedidosComprasSeleccionado,JComboBox jComboBoxPedidosCompras,List<PedidosCompras> pedidoscomprassLocal)throws Exception {
		try {
			PedidosCompras  pedidoscomprasTemp=null;

			for(PedidosCompras pedidoscomprasAux:pedidoscomprassLocal) {
				if(pedidoscomprasAux.getId()!=null && pedidoscomprasAux.getId().equals(idPedidosComprasSeleccionado)) {
					pedidoscomprasTemp=pedidoscomprasAux;
					break;
				}
			}

			jComboBoxPedidosCompras.setSelectedItem(pedidoscomprasTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPedidosComprasGenerico(JComboBox jComboBoxPedidosCompras,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPedidosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPedidosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPedidosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPedidosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPedidosCompras.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPedidosCompras.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPedidosCompras.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPedidosCompras.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPedidosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPedidosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			pedidoscompras=(PedidosCompras) pedidoscomprasLogic.getPedidosComprass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			pedidoscompras =(PedidosCompras) pedidoscomprass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!pedidoscompras.getIsNew() && !pedidoscompras.getIsChanged() && !pedidoscompras.getIsDeleted()) {
				sDescripcion=pedidoscompras.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=pedidoscompras.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!pedidoscompras.getIsNew() && !pedidoscompras.getIsChanged() && !pedidoscompras.getIsDeleted()) {
				sDescripcion=pedidoscompras.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=pedidoscompras.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!pedidoscompras.getIsNew() && !pedidoscompras.getIsChanged() && !pedidoscompras.getIsDeleted()) {
				sDescripcion=pedidoscompras.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=pedidoscompras.getproducto_descripcion();
			}
		}

		if(sTipo.equals("Linea")) {
			//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
			if(!pedidoscompras.getIsNew() && !pedidoscompras.getIsChanged() && !pedidoscompras.getIsDeleted()) {
				sDescripcion=pedidoscompras.getlinea_descripcion();
			} else {
				//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
				sDescripcion=pedidoscompras.getlinea_descripcion();
			}
		}

		if(sTipo.equals("LineaGrupo")) {
			//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
			if(!pedidoscompras.getIsNew() && !pedidoscompras.getIsChanged() && !pedidoscompras.getIsDeleted()) {
				sDescripcion=pedidoscompras.getlineagrupo_descripcion();
			} else {
				//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
				sDescripcion=pedidoscompras.getlineagrupo_descripcion();
			}
		}

		if(sTipo.equals("LineaCategoria")) {
			//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
			if(!pedidoscompras.getIsNew() && !pedidoscompras.getIsChanged() && !pedidoscompras.getIsDeleted()) {
				sDescripcion=pedidoscompras.getlineacategoria_descripcion();
			} else {
				//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
				sDescripcion=pedidoscompras.getlineacategoria_descripcion();
			}
		}

		if(sTipo.equals("LineaMarca")) {
			//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
			if(!pedidoscompras.getIsNew() && !pedidoscompras.getIsChanged() && !pedidoscompras.getIsDeleted()) {
				sDescripcion=pedidoscompras.getlineamarca_descripcion();
			} else {
				//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
				sDescripcion=pedidoscompras.getlineamarca_descripcion();
			}
		}

		if(sTipo.equals("TipoProductoServicio")) {
			//sDescripcion=this.getActualTipoProductoServicioForeignKeyDescripcion((Long)value);
			if(!pedidoscompras.getIsNew() && !pedidoscompras.getIsChanged() && !pedidoscompras.getIsDeleted()) {
				sDescripcion=pedidoscompras.gettipoproductoservicio_descripcion();
			} else {
				//sDescripcion=this.getActualTipoProductoServicioForeignKeyDescripcion((Long)value);
				sDescripcion=pedidoscompras.gettipoproductoservicio_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PedidosCompras pedidoscomprasRow=new PedidosCompras();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			pedidoscomprasRow=(PedidosCompras) pedidoscomprasLogic.getPedidosComprass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			pedidoscomprasRow=(PedidosCompras) pedidoscomprass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPedidosCompras(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPedidosCompras.setVisible((this.isVisibilidadCeldaNuevoPedidosCompras && this.isPermisoNuevoPedidosCompras));			
			this.jButtonDuplicarPedidosCompras.setVisible((this.isVisibilidadCeldaDuplicarPedidosCompras && this.isPermisoDuplicarPedidosCompras));			
			this.jButtonCopiarPedidosCompras.setVisible((this.isVisibilidadCeldaCopiarPedidosCompras && this.isPermisoCopiarPedidosCompras));
			this.jButtonVerFormPedidosCompras.setVisible((this.isVisibilidadCeldaVerFormPedidosCompras && this.isPermisoVerFormPedidosCompras));
			
			this.jButtonAbrirOrderByPedidosCompras.setVisible((this.isVisibilidadCeldaOrdenPedidosCompras && this.isPermisoOrdenPedidosCompras));			
			
			this.jButtonNuevoRelacionesPedidosCompras.setVisible((this.isVisibilidadCeldaNuevoRelacionesPedidosCompras && this.isPermisoNuevoPedidosCompras));			
			this.jButtonNuevoGuardarCambiosPedidosCompras.setVisible((this.isVisibilidadCeldaNuevoPedidosCompras && this.isPermisoNuevoPedidosCompras && this.isPermisoGuardarCambiosPedidosCompras));
			
			if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
			this.jInternalFrameDetalleFormPedidosCompras.jButtonModificarPedidosCompras.setVisible((this.isVisibilidadCeldaModificarPedidosCompras && this.isPermisoActualizarPedidosCompras));	
			this.jInternalFrameDetalleFormPedidosCompras.jButtonActualizarPedidosCompras.setVisible((this.isVisibilidadCeldaActualizarPedidosCompras && this.isPermisoActualizarPedidosCompras));	
			this.jInternalFrameDetalleFormPedidosCompras.jButtonEliminarPedidosCompras.setVisible((this.isVisibilidadCeldaEliminarPedidosCompras && this.isPermisoEliminarPedidosCompras));
			this.jInternalFrameDetalleFormPedidosCompras.jButtonCancelarPedidosCompras.setVisible(this.isVisibilidadCeldaCancelarPedidosCompras);							
			this.jInternalFrameDetalleFormPedidosCompras.jButtonGuardarCambiosPedidosCompras.setVisible((this.isVisibilidadCeldaGuardarPedidosCompras && this.isPermisoGuardarCambiosPedidosCompras));			
			
			}
						
			this.jButtonGuardarCambiosTablaPedidosCompras.setVisible((this.isVisibilidadCeldaGuardarCambiosPedidosCompras && this.isPermisoGuardarCambiosPedidosCompras));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPedidosCompras.setVisible((this.isVisibilidadCeldaNuevoPedidosCompras && this.isPermisoNuevoPedidosCompras));						
			this.jButtonDuplicarToolBarPedidosCompras.setVisible((this.isVisibilidadCeldaDuplicarPedidosCompras && this.isPermisoDuplicarPedidosCompras));						
			this.jButtonCopiarToolBarPedidosCompras.setVisible((this.isVisibilidadCeldaCopiarPedidosCompras && this.isPermisoCopiarPedidosCompras));			
			this.jButtonVerFormToolBarPedidosCompras.setVisible((this.isVisibilidadCeldaVerFormPedidosCompras && this.isPermisoVerFormPedidosCompras));			
			this.jButtonAbrirOrderByToolBarPedidosCompras.setVisible((this.isVisibilidadCeldaOrdenPedidosCompras && this.isPermisoOrdenPedidosCompras));
			this.jButtonNuevoRelacionesToolBarPedidosCompras.setVisible((this.isVisibilidadCeldaNuevoRelacionesPedidosCompras && this.isPermisoNuevoPedidosCompras));			
			this.jButtonNuevoGuardarCambiosToolBarPedidosCompras.setVisible((this.isVisibilidadCeldaNuevoPedidosCompras && this.isPermisoNuevoPedidosCompras && this.isPermisoGuardarCambiosPedidosCompras));			
			
			if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
			this.jInternalFrameDetalleFormPedidosCompras.jButtonModificarToolBarPedidosCompras.setVisible((this.isVisibilidadCeldaModificarPedidosCompras && this.isPermisoActualizarPedidosCompras));	
			this.jInternalFrameDetalleFormPedidosCompras.jButtonActualizarToolBarPedidosCompras.setVisible((this.isVisibilidadCeldaActualizarPedidosCompras  && this.isPermisoActualizarPedidosCompras));	
			this.jInternalFrameDetalleFormPedidosCompras.jButtonEliminarToolBarPedidosCompras.setVisible((this.isVisibilidadCeldaEliminarPedidosCompras && this.isPermisoEliminarPedidosCompras));
			this.jInternalFrameDetalleFormPedidosCompras.jButtonCancelarToolBarPedidosCompras.setVisible(this.isVisibilidadCeldaCancelarPedidosCompras);				
			this.jInternalFrameDetalleFormPedidosCompras.jButtonGuardarCambiosToolBarPedidosCompras.setVisible((this.isVisibilidadCeldaGuardarPedidosCompras && this.isPermisoGuardarCambiosPedidosCompras));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPedidosCompras.setVisible((this.isVisibilidadCeldaGuardarCambiosPedidosCompras && this.isPermisoGuardarCambiosPedidosCompras));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPedidosCompras.setVisible((this.isVisibilidadCeldaNuevoPedidosCompras && this.isPermisoNuevoPedidosCompras));			
			this.jMenuItemDuplicarPedidosCompras.setVisible((this.isVisibilidadCeldaDuplicarPedidosCompras && this.isPermisoDuplicarPedidosCompras));			
			this.jMenuItemCopiarPedidosCompras.setVisible((this.isVisibilidadCeldaCopiarPedidosCompras && this.isPermisoCopiarPedidosCompras));			
			this.jMenuItemVerFormPedidosCompras.setVisible((this.isVisibilidadCeldaVerFormPedidosCompras && this.isPermisoVerFormPedidosCompras));			
			this.jMenuItemAbrirOrderByPedidosCompras.setVisible((this.isVisibilidadCeldaOrdenPedidosCompras && this.isPermisoOrdenPedidosCompras));			
			//this.jMenuItemMostrarOcultarPedidosCompras.setVisible((this.isVisibilidadCeldaOrdenPedidosCompras && this.isPermisoOrdenPedidosCompras));
			this.jMenuItemDetalleAbrirOrderByPedidosCompras.setVisible((this.isVisibilidadCeldaOrdenPedidosCompras && this.isPermisoOrdenPedidosCompras));			
			//this.jMenuItemDetalleMostrarOcultarPedidosCompras.setVisible((this.isVisibilidadCeldaOrdenPedidosCompras && this.isPermisoOrdenPedidosCompras));			
			this.jMenuItemNuevoRelacionesPedidosCompras.setVisible((this.isVisibilidadCeldaNuevoRelacionesPedidosCompras && this.isPermisoNuevoPedidosCompras));			
			this.jMenuItemNuevoGuardarCambiosPedidosCompras.setVisible((this.isVisibilidadCeldaNuevoPedidosCompras && this.isPermisoNuevoPedidosCompras && this.isPermisoGuardarCambiosPedidosCompras));									
			
			if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
			this.jInternalFrameDetalleFormPedidosCompras.jMenuItemModificarPedidosCompras.setVisible((this.isVisibilidadCeldaModificarPedidosCompras && this.isPermisoActualizarPedidosCompras));	
			this.jInternalFrameDetalleFormPedidosCompras.jMenuItemActualizarPedidosCompras.setVisible((this.isVisibilidadCeldaActualizarPedidosCompras && this.isPermisoActualizarPedidosCompras));	
			this.jInternalFrameDetalleFormPedidosCompras.jMenuItemEliminarPedidosCompras.setVisible((this.isVisibilidadCeldaEliminarPedidosCompras && this.isPermisoEliminarPedidosCompras));
			this.jInternalFrameDetalleFormPedidosCompras.jMenuItemCancelarPedidosCompras.setVisible(this.isVisibilidadCeldaCancelarPedidosCompras);				
			}
			
			this.jMenuItemGuardarCambiosPedidosCompras.setVisible((this.isVisibilidadCeldaGuardarPedidosCompras && this.isPermisoGuardarCambiosPedidosCompras));						
			this.jMenuItemGuardarCambiosTablaPedidosCompras.setVisible((this.isVisibilidadCeldaGuardarCambiosPedidosCompras && this.isPermisoGuardarCambiosPedidosCompras));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPedidosCompras=this.jButtonNuevoPedidosCompras.isVisible();
			this.isVisibilidadCeldaDuplicarPedidosCompras=this.jButtonDuplicarPedidosCompras.isVisible();
			this.isVisibilidadCeldaCopiarPedidosCompras=this.jButtonCopiarPedidosCompras.isVisible();
			this.isVisibilidadCeldaVerFormPedidosCompras=this.jButtonVerFormPedidosCompras.isVisible();
			
			this.isVisibilidadCeldaOrdenPedidosCompras=this.jButtonAbrirOrderByPedidosCompras.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPedidosCompras=this.jButtonNuevoRelacionesPedidosCompras.isVisible();
			this.isVisibilidadCeldaModificarPedidosCompras=this.jButtonModificarPedidosCompras.isVisible();
			
			if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
			this.isVisibilidadCeldaActualizarPedidosCompras=this.jInternalFrameDetalleFormPedidosCompras.jButtonActualizarPedidosCompras.isVisible();
			this.isVisibilidadCeldaEliminarPedidosCompras=this.jInternalFrameDetalleFormPedidosCompras.jButtonEliminarPedidosCompras.isVisible();
			this.isVisibilidadCeldaCancelarPedidosCompras=this.jInternalFrameDetalleFormPedidosCompras.jButtonCancelarPedidosCompras.isVisible();
			this.isVisibilidadCeldaGuardarPedidosCompras=this.jInternalFrameDetalleFormPedidosCompras.jButtonGuardarCambiosPedidosCompras.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPedidosCompras=this.jButtonGuardarCambiosTablaPedidosCompras.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPedidosCompras=this.jButtonNuevoToolBarPedidosCompras.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPedidosCompras=this.jButtonNuevoRelacionesToolBarPedidosCompras.isVisible();
			
			if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
			this.isVisibilidadCeldaModificarPedidosCompras=this.jInternalFrameDetalleFormPedidosCompras.jButtonModificarToolBarPedidosCompras.isVisible();
			this.isVisibilidadCeldaActualizarPedidosCompras=this.jInternalFrameDetalleFormPedidosCompras.jButtonActualizarToolBarPedidosCompras.isVisible();
			this.isVisibilidadCeldaEliminarPedidosCompras=this.jInternalFrameDetalleFormPedidosCompras.jButtonEliminarToolBarPedidosCompras.isVisible();
			this.isVisibilidadCeldaCancelarPedidosCompras=this.jInternalFrameDetalleFormPedidosCompras.jButtonCancelarToolBarPedidosCompras.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPedidosCompras=this.jButtonGuardarCambiosToolBarPedidosCompras.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPedidosCompras=this.jButtonGuardarCambiosTablaToolBarPedidosCompras.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPedidosCompras=this.jMenuItemNuevoPedidosCompras.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPedidosCompras=this.jMenuItemNuevoRelacionesPedidosCompras.isVisible();
			
			if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
			this.isVisibilidadCeldaModificarPedidosCompras=this.jInternalFrameDetalleFormPedidosCompras.jMenuItemModificarPedidosCompras.isVisible();
			this.isVisibilidadCeldaActualizarPedidosCompras=this.jInternalFrameDetalleFormPedidosCompras.jMenuItemActualizarPedidosCompras.isVisible();
			this.isVisibilidadCeldaEliminarPedidosCompras=this.jInternalFrameDetalleFormPedidosCompras.jMenuItemEliminarPedidosCompras.isVisible();
			this.isVisibilidadCeldaCancelarPedidosCompras=this.jInternalFrameDetalleFormPedidosCompras.jMenuItemCancelarPedidosCompras.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPedidosCompras=this.jMenuItemGuardarCambiosPedidosCompras.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPedidosCompras=this.jMenuItemGuardarCambiosTablaPedidosCompras.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPedidosCompras(Boolean esInicializar) {
		if(PedidosComprasJInternalFrame.ISBINDING_MANUAL) {			
			if(this.pedidoscomprasSessionBean.getConGuardarRelaciones()) {
				//if(this.pedidoscomprasSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPedidosCompras();
			}
			
			this.inicializarActualizarBindingBotonesManualPedidosCompras(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPedidosCompras() {
		this.jButtonNuevoPedidosCompras.setVisible(this.isPermisoNuevoPedidosCompras);			
		this.jButtonDuplicarPedidosCompras.setVisible(this.isPermisoDuplicarPedidosCompras);			
		this.jButtonCopiarPedidosCompras.setVisible(this.isPermisoCopiarPedidosCompras);			
		this.jButtonVerFormPedidosCompras.setVisible(this.isPermisoVerFormPedidosCompras);			
		
		this.jButtonAbrirOrderByPedidosCompras.setVisible(this.isPermisoOrdenPedidosCompras);					
		
		this.jButtonNuevoRelacionesPedidosCompras.setVisible(this.isPermisoNuevoPedidosCompras);			
		
		if(this.jInternalFrameDetalleFormPedidosCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidosCompras.jButtonModificarPedidosCompras.setVisible(this.isPermisoActualizarPedidosCompras);	
			this.jInternalFrameDetalleFormPedidosCompras.jButtonActualizarPedidosCompras.setVisible(this.isPermisoActualizarPedidosCompras);	
			this.jInternalFrameDetalleFormPedidosCompras.jButtonEliminarPedidosCompras.setVisible(this.isPermisoEliminarPedidosCompras);
			this.jInternalFrameDetalleFormPedidosCompras.jButtonCancelarPedidosCompras.setVisible(this.isVisibilidadCeldaCancelarPedidosCompras);						
			this.jInternalFrameDetalleFormPedidosCompras.jButtonGuardarCambiosPedidosCompras.setVisible(this.isPermisoGuardarCambiosPedidosCompras);							
		}
		
		this.jButtonGuardarCambiosTablaPedidosCompras.setVisible(this.isPermisoActualizarPedidosCompras);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePedidosCompras() {
		this.jInternalFrameDetalleFormPedidosCompras.jButtonModificarPedidosCompras.setVisible(this.isPermisoActualizarPedidosCompras);	
		this.jInternalFrameDetalleFormPedidosCompras.jButtonActualizarPedidosCompras.setVisible(this.isPermisoActualizarPedidosCompras);	
		this.jInternalFrameDetalleFormPedidosCompras.jButtonEliminarPedidosCompras.setVisible(this.isPermisoEliminarPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jButtonCancelarPedidosCompras.setVisible(this.isVisibilidadCeldaCancelarPedidosCompras);							
		this.jInternalFrameDetalleFormPedidosCompras.jButtonGuardarCambiosPedidosCompras.setVisible((this.isVisibilidadCeldaGuardarPedidosCompras && this.isPermisoGuardarCambiosPedidosCompras));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPedidosCompras() {
		if(PedidosComprasJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPedidosCompras();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPedidosCompras() {
	}
	
	public void jTableDatosPedidosComprasListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPedidosCompras(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPedidosComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidosCompras(this.getpedidoscompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoscompras =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidoscompras =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidoscompras==null) {
						this.pedidoscompras = new PedidosCompras();
					}

					this.setVariablesFormularioToObjetoActualPedidosCompras(this.pedidoscompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
				}

				if(this.pedidoscompras.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.pedidoscompras.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidosCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaPedidosComprasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebPedidosCompras(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPedidosCompras.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPedidosCompras.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscompras =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pedidoscompras =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPedidosCompras(this.getpedidoscompras(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.pedidoscomprasLogic.getConnexion());

				if(this.pedidoscompras.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.pedidoscompras.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPedidosCompras=(TitledBorder)this.jScrollPanelDatosPedidosCompras.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderPedidosCompras.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaPedidosComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidosCompras(this.getpedidoscompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoscompras =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidoscompras =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidoscompras==null) {
						this.pedidoscompras = new PedidosCompras();
					}

					this.setVariablesFormularioToObjetoActualPedidosCompras(this.pedidoscompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
				}

				if(this.pedidoscompras.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.pedidoscompras.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidosCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalPedidosComprasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebPedidosCompras(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPedidosCompras.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPedidosCompras.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscompras =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pedidoscompras =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPedidosCompras(this.getpedidoscompras(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.pedidoscomprasLogic.getConnexion());

				if(this.pedidoscompras.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.pedidoscompras.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPedidosCompras=(TitledBorder)this.jScrollPanelDatosPedidosCompras.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderPedidosCompras.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalPedidosComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidosCompras(this.getpedidoscompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoscompras =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidoscompras =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidoscompras==null) {
						this.pedidoscompras = new PedidosCompras();
					}

					this.setVariablesFormularioToObjetoActualPedidosCompras(this.pedidoscompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
				}

				if(this.pedidoscompras.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.pedidoscompras.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidosCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoPedidosComprasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebPedidosCompras(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPedidosCompras.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPedidosCompras.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscompras =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pedidoscompras =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPedidosCompras(this.getpedidoscompras(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.pedidoscomprasLogic.getConnexion());

				if(this.pedidoscompras.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.pedidoscompras.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPedidosCompras=(TitledBorder)this.jScrollPanelDatosPedidosCompras.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderPedidosCompras.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoPedidosComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidosCompras(this.getpedidoscompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoscompras =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidoscompras =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidoscompras==null) {
						this.pedidoscompras = new PedidosCompras();
					}

					this.setVariablesFormularioToObjetoActualPedidosCompras(this.pedidoscompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
				}

				if(this.pedidoscompras.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.pedidoscompras.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidosCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_lineaPedidosComprasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolinea=true;

			idTienePermisolinea=this.tienePermisosUsuarioEnPaginaWebPedidosCompras(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolinea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPedidosCompras.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPedidosCompras.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscompras =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pedidoscompras =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPedidosCompras(this.getpedidoscompras(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);

				this.lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.pedidoscomprasLogic.getConnexion());

				if(this.pedidoscompras.getid_linea()!=null) {
					this.lineaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineaBeanSwingJInternalFrame.setIdActual(this.pedidoscompras.getid_linea());
					this.lineaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPedidosCompras=(TitledBorder)this.jScrollPanelDatosPedidosCompras.getBorder();
				TitledBorder titledBorderlinea=(TitledBorder)this.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlinea.setTitle(titledBorderPedidosCompras.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_lineaPedidosComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidosCompras(this.getpedidoscompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoscompras =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidoscompras =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidoscompras==null) {
						this.pedidoscompras = new PedidosCompras();
					}

					this.setVariablesFormularioToObjetoActualPedidosCompras(this.pedidoscompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
				}

				if(this.pedidoscompras.getid_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea = "+this.pedidoscompras.getid_linea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidosCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_grupoPedidosComprasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineagrupo=true;

			idTienePermisolineagrupo=this.tienePermisosUsuarioEnPaginaWebPedidosCompras(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineagrupo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPedidosCompras.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPedidosCompras.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscompras =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pedidoscompras =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPedidosCompras(this.getpedidoscompras(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);

				this.lineagrupoBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineagrupoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineagrupoBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.pedidoscomprasLogic.getConnexion());

				if(this.pedidoscompras.getid_linea_grupo()!=null) {
					this.lineagrupoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineagrupoBeanSwingJInternalFrame.setIdActual(this.pedidoscompras.getid_linea_grupo());
					this.lineagrupoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineagrupoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPedidosCompras=(TitledBorder)this.jScrollPanelDatosPedidosCompras.getBorder();
				TitledBorder titledBorderlineagrupo=(TitledBorder)this.lineagrupoBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineagrupo.setTitle(titledBorderPedidosCompras.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_grupoPedidosComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidosCompras(this.getpedidoscompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoscompras =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidoscompras =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidoscompras==null) {
						this.pedidoscompras = new PedidosCompras();
					}

					this.setVariablesFormularioToObjetoActualPedidosCompras(this.pedidoscompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
				}

				if(this.pedidoscompras.getid_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_grupo = "+this.pedidoscompras.getid_linea_grupo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidosCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_categoriaPedidosComprasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineacategoria=true;

			idTienePermisolineacategoria=this.tienePermisosUsuarioEnPaginaWebPedidosCompras(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineacategoria) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPedidosCompras.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPedidosCompras.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscompras =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pedidoscompras =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPedidosCompras(this.getpedidoscompras(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);

				this.lineacategoriaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineacategoriaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineacategoriaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.pedidoscomprasLogic.getConnexion());

				if(this.pedidoscompras.getid_linea_categoria()!=null) {
					this.lineacategoriaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineacategoriaBeanSwingJInternalFrame.setIdActual(this.pedidoscompras.getid_linea_categoria());
					this.lineacategoriaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineacategoriaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPedidosCompras=(TitledBorder)this.jScrollPanelDatosPedidosCompras.getBorder();
				TitledBorder titledBorderlineacategoria=(TitledBorder)this.lineacategoriaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineacategoria.setTitle(titledBorderPedidosCompras.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_categoriaPedidosComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidosCompras(this.getpedidoscompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoscompras =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidoscompras =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidoscompras==null) {
						this.pedidoscompras = new PedidosCompras();
					}

					this.setVariablesFormularioToObjetoActualPedidosCompras(this.pedidoscompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
				}

				if(this.pedidoscompras.getid_linea_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_categoria = "+this.pedidoscompras.getid_linea_categoria().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidosCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_marcaPedidosComprasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineamarca=true;

			idTienePermisolineamarca=this.tienePermisosUsuarioEnPaginaWebPedidosCompras(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineamarca) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPedidosCompras.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPedidosCompras.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscompras =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pedidoscompras =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPedidosCompras(this.getpedidoscompras(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);

				this.lineamarcaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineamarcaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineamarcaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.pedidoscomprasLogic.getConnexion());

				if(this.pedidoscompras.getid_linea_marca()!=null) {
					this.lineamarcaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineamarcaBeanSwingJInternalFrame.setIdActual(this.pedidoscompras.getid_linea_marca());
					this.lineamarcaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineamarcaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPedidosCompras=(TitledBorder)this.jScrollPanelDatosPedidosCompras.getBorder();
				TitledBorder titledBorderlineamarca=(TitledBorder)this.lineamarcaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineamarca.setTitle(titledBorderPedidosCompras.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_marcaPedidosComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidosCompras(this.getpedidoscompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoscompras =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidoscompras =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidoscompras==null) {
						this.pedidoscompras = new PedidosCompras();
					}

					this.setVariablesFormularioToObjetoActualPedidosCompras(this.pedidoscompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
				}

				if(this.pedidoscompras.getid_linea_marca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_marca = "+this.pedidoscompras.getid_linea_marca().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidosCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_producto_servicioPedidosComprasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoproductoservicio=true;

			idTienePermisotipoproductoservicio=this.tienePermisosUsuarioEnPaginaWebPedidosCompras(TipoProductoServicioConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoproductoservicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPedidosCompras.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPedidosCompras.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscompras =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pedidoscompras =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPedidosCompras(this.getpedidoscompras(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);

				this.tipoproductoservicioBeanSwingJInternalFrame=new TipoProductoServicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoproductoservicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoproductoservicioBeanSwingJInternalFrame.getTipoProductoServicioLogic().setConnexion(this.pedidoscomprasLogic.getConnexion());

				if(this.pedidoscompras.getid_tipo_producto_servicio()!=null) {
					this.tipoproductoservicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoproductoservicioBeanSwingJInternalFrame.setIdActual(this.pedidoscompras.getid_tipo_producto_servicio());
					this.tipoproductoservicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoproductoservicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoproductoservicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoProductoServicio();
				}

				JInternalFrameBase jinternalFrame =this.tipoproductoservicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPedidosCompras=(TitledBorder)this.jScrollPanelDatosPedidosCompras.getBorder();
				TitledBorder titledBordertipoproductoservicio=(TitledBorder)this.tipoproductoservicioBeanSwingJInternalFrame.jScrollPanelDatosTipoProductoServicio.getBorder();

				titledBordertipoproductoservicio.setTitle(titledBorderPedidosCompras.getTitle() + " -> TIPOPRODUCTOSERVICIO");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_producto_servicioPedidosComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidosCompras(this.getpedidoscompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoscompras =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidoscompras =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidoscompras==null) {
						this.pedidoscompras = new PedidosCompras();
					}

					this.setVariablesFormularioToObjetoActualPedidosCompras(this.pedidoscompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
				}

				if(this.pedidoscompras.getid_tipo_producto_servicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_producto_servicio = "+this.pedidoscompras.getid_tipo_producto_servicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidosCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_desdePedidosComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidosCompras(this.getpedidoscompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoscompras =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidoscompras =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidoscompras==null) {
						this.pedidoscompras = new PedidosCompras();
					}

					this.setVariablesFormularioToObjetoActualPedidosCompras(this.pedidoscompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
				}

				if(this.pedidoscompras.getfecha_emision_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_desde = '"+Funciones2.getStringPostgresDate(this.pedidoscompras.getfecha_emision_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidosCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaPedidosComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidosCompras(this.getpedidoscompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoscompras =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidoscompras =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidoscompras==null) {
						this.pedidoscompras = new PedidosCompras();
					}

					this.setVariablesFormularioToObjetoActualPedidosCompras(this.pedidoscompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
				}

				if(this.pedidoscompras.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.pedidoscompras.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidosCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsecuencialPedidosComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidosCompras(this.getpedidoscompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoscompras =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidoscompras =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidoscompras==null) {
						this.pedidoscompras = new PedidosCompras();
					}

					this.setVariablesFormularioToObjetoActualPedidosCompras(this.pedidoscompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
				}

				if(this.pedidoscompras.getsecuencial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where secuencial like '%"+this.pedidoscompras.getsecuencial()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidosCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionPedidosComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidosCompras(this.getpedidoscompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoscompras =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidoscompras =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidoscompras==null) {
						this.pedidoscompras = new PedidosCompras();
					}

					this.setVariablesFormularioToObjetoActualPedidosCompras(this.pedidoscompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
				}

				if(this.pedidoscompras.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.pedidoscompras.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidosCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_entregaPedidosComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidosCompras(this.getpedidoscompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoscompras =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidoscompras =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidoscompras==null) {
						this.pedidoscompras = new PedidosCompras();
					}

					this.setVariablesFormularioToObjetoActualPedidosCompras(this.pedidoscompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
				}

				if(this.pedidoscompras.getfecha_entrega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_entrega = '"+Funciones2.getStringPostgresDate(this.pedidoscompras.getfecha_entrega())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidosCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_productoPedidosComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidosCompras(this.getpedidoscompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoscompras =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidoscompras =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidoscompras==null) {
						this.pedidoscompras = new PedidosCompras();
					}

					this.setVariablesFormularioToObjetoActualPedidosCompras(this.pedidoscompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
				}

				if(this.pedidoscompras.getnombre_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_producto like '%"+this.pedidoscompras.getnombre_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidosCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_unidadPedidosComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidosCompras(this.getpedidoscompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoscompras =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidoscompras =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidoscompras==null) {
						this.pedidoscompras = new PedidosCompras();
					}

					this.setVariablesFormularioToObjetoActualPedidosCompras(this.pedidoscompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
				}

				if(this.pedidoscompras.getnombre_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_unidad like '%"+this.pedidoscompras.getnombre_unidad()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidosCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidad_pedidoPedidosComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidosCompras(this.getpedidoscompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoscompras =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidoscompras =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidoscompras==null) {
						this.pedidoscompras = new PedidosCompras();
					}

					this.setVariablesFormularioToObjetoActualPedidosCompras(this.pedidoscompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
				}

				if(this.pedidoscompras.getcantidad_pedido()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad_pedido = "+this.pedidoscompras.getcantidad_pedido().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidosCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidad_entregadaPedidosComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidosCompras(this.getpedidoscompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoscompras =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidoscompras =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidoscompras==null) {
						this.pedidoscompras = new PedidosCompras();
					}

					this.setVariablesFormularioToObjetoActualPedidosCompras(this.pedidoscompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
				}

				if(this.pedidoscompras.getcantidad_entregada()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad_entregada = "+this.pedidoscompras.getcantidad_entregada().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidosCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidad_pendientePedidosComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidosCompras(this.getpedidoscompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoscompras =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidoscompras =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidoscompras==null) {
						this.pedidoscompras = new PedidosCompras();
					}

					this.setVariablesFormularioToObjetoActualPedidosCompras(this.pedidoscompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
				}

				if(this.pedidoscompras.getcantidad_pendiente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad_pendiente = "+this.pedidoscompras.getcantidad_pendiente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidosCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_productoPedidosComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidosCompras(this.getpedidoscompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoscompras =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidoscompras =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidoscompras==null) {
						this.pedidoscompras = new PedidosCompras();
					}

					this.setVariablesFormularioToObjetoActualPedidosCompras(this.pedidoscompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);
				}

				if(this.pedidoscompras.getcodigo_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_producto like '%"+this.pedidoscompras.getcodigo_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidosCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPedidosComprasPedidosComprasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPedidosCompras(false,false);

			this.getPedidosComprassBusquedaPedidosCompras();

			this.inicializarActualizarBindingPedidosCompras(false);

			//if(PedidosComprasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPedidosCompras(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaPedidosComprasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPedidosCompras(false,false);

			this.getPedidosComprassFK_IdEmpresa();

			this.inicializarActualizarBindingPedidosCompras(false);

			//if(PedidosComprasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPedidosCompras(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaPedidosComprasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPedidosCompras(false,false);

			this.getPedidosComprassFK_IdLinea();

			this.inicializarActualizarBindingPedidosCompras(false);

			//if(PedidosComprasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPedidosCompras(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaCategoriaPedidosComprasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPedidosCompras(false,false);

			this.getPedidosComprassFK_IdLineaCategoria();

			this.inicializarActualizarBindingPedidosCompras(false);

			//if(PedidosComprasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPedidosCompras(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaGrupoPedidosComprasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPedidosCompras(false,false);

			this.getPedidosComprassFK_IdLineaGrupo();

			this.inicializarActualizarBindingPedidosCompras(false);

			//if(PedidosComprasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPedidosCompras(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaMarcaPedidosComprasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPedidosCompras(false,false);

			this.getPedidosComprassFK_IdLineaMarca();

			this.inicializarActualizarBindingPedidosCompras(false);

			//if(PedidosComprasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPedidosCompras(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoPedidosComprasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPedidosCompras(false,false);

			this.getPedidosComprassFK_IdProducto();

			this.inicializarActualizarBindingPedidosCompras(false);

			//if(PedidosComprasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPedidosCompras(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalPedidosComprasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPedidosCompras(false,false);

			this.getPedidosComprassFK_IdSucursal();

			this.inicializarActualizarBindingPedidosCompras(false);

			//if(PedidosComprasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPedidosCompras(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoProductoServicioPedidosComprasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPedidosCompras(false,false);

			this.getPedidosComprassFK_IdTipoProductoServicio();

			this.inicializarActualizarBindingPedidosCompras(false);

			//if(PedidosComprasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPedidosCompras(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoscomprasLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePedidosCompras() {
		if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
			this.jInternalFrameDetalleFormPedidosCompras.setVisible(false);	    			
			this.jInternalFrameDetalleFormPedidosCompras.dispose();
			this.jInternalFrameDetalleFormPedidosCompras=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPedidosCompras!=null) {
			this.jInternalFrameReporteDinamicoPedidosCompras.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPedidosCompras.dispose();
			this.jInternalFrameReporteDinamicoPedidosCompras=null;
		}
		
		if(this.jInternalFrameImportacionPedidosCompras!=null) {
			this.jInternalFrameImportacionPedidosCompras.setVisible(false);	    			
			this.jInternalFrameImportacionPedidosCompras.dispose();
			this.jInternalFrameImportacionPedidosCompras=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPedidosCompras();
			
			PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
			
			
			if(sTipo.equals("NuevoPedidosCompras")) {
				jButtonNuevoPedidosComprasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPedidosCompras")) {
				jButtonDuplicarPedidosComprasActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPedidosCompras")) {
				jButtonCopiarPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("VerFormPedidosCompras")) {
				jButtonVerFormPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPedidosCompras")) {
				jButtonNuevoPedidosComprasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPedidosCompras")) {
				jButtonDuplicarPedidosComprasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPedidosCompras")) {
				jButtonNuevoPedidosComprasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPedidosCompras")) {
				jButtonDuplicarPedidosComprasActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPedidosCompras")) {
				jButtonNuevoPedidosComprasActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPedidosCompras")) {
				jButtonNuevoPedidosComprasActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPedidosCompras")) {
				jButtonNuevoPedidosComprasActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPedidosCompras")) {
				jButtonModificarPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPedidosCompras")) {
				jButtonModificarPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPedidosCompras")) {
				jButtonModificarPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPedidosCompras")) {
				jButtonActualizarPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPedidosCompras")) {
				jButtonActualizarPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPedidosCompras")) {
				jButtonActualizarPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("EliminarPedidosCompras")) {
				jButtonEliminarPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPedidosCompras")) {
				jButtonEliminarPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPedidosCompras")) {
				jButtonEliminarPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("CancelarPedidosCompras")) {
				jButtonCancelarPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPedidosCompras")) {
				jButtonCancelarPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPedidosCompras")) {
				jButtonCancelarPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("CerrarPedidosCompras")) {
				jButtonCerrarPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPedidosCompras")) {
				jButtonCerrarPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPedidosCompras")) {
				jButtonCerrarPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPedidosCompras")) {
				jButtonMostrarOcultarPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPedidosCompras")) {
				jButtonCancelarPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPedidosCompras")) {
				jButtonGuardarCambiosPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPedidosCompras")) {
				jButtonGuardarCambiosPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPedidosCompras")) {
				jButtonCopiarPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPedidosCompras")) {
				jButtonVerFormPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPedidosCompras")) {
				jButtonGuardarCambiosPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPedidosCompras")) {
				jButtonCopiarPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPedidosCompras")) {
				jButtonVerFormPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPedidosCompras")) {
				jButtonGuardarCambiosPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPedidosCompras")) {
				jButtonGuardarCambiosPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPedidosCompras")) {
				jButtonGuardarCambiosPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPedidosCompras")) {
				jButtonRecargarInformacionPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPedidosCompras")) {
				jButtonRecargarInformacionPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPedidosCompras")) {
				jButtonRecargarInformacionPedidosComprasActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPedidosCompras")) {
				jButtonAnterioresPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPedidosCompras")) {
				jButtonAnterioresPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePedidosCompras")) {
				jButtonAnterioresPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPedidosCompras")) {
				jButtonSiguientesPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPedidosCompras")) {
				jButtonSiguientesPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPedidosCompras")) {
				jButtonSiguientesPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPedidosCompras") || sTipo.equals("MenuItemDetalleAbrirOrderByPedidosCompras")) {
				jButtonAbrirOrderByPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPedidosCompras") || sTipo.equals("MenuItemDetalleMostrarOcultarPedidosCompras")) {
				jButtonMostrarOcultarPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPedidosCompras")) {
				jButtonNuevoGuardarCambiosPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPedidosCompras")) {
				jButtonNuevoGuardarCambiosPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPedidosCompras")) {
				jButtonNuevoGuardarCambiosPedidosComprasActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPedidosCompras")) {
				jButtonCerrarReporteDinamicoPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPedidosCompras")) {
				jButtonGenerarReporteDinamicoPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPedidosCompras")) {
				
				jButtonGenerarExcelReporteDinamicoPedidosComprasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPedidosCompras")) {
				jButtonCerrarImportacionPedidosComprasActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPedidosCompras")) {
				
				jButtonGenerarImportacionPedidosComprasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPedidosCompras")) {
				
				jButtonAbrirImportacionPedidosComprasActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPedidosCompras")) {
				jComboBoxTiposAccionesPedidosComprasActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPedidosCompras")) {
				jComboBoxTiposRelacionesPedidosComprasActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPedidosCompras")) {
				jComboBoxTiposAccionesPedidosComprasActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPedidosCompras")) {
				
				jComboBoxTiposSeleccionarPedidosComprasActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPedidosCompras")) {
				jTextFieldValorCampoGeneralPedidosComprasActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPedidosCompras")) {
				jButtonAbrirOrderByPedidosComprasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPedidosCompras")) {
				jButtonAbrirOrderByPedidosComprasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPedidosCompras")) {
				jButtonCerrarOrderByPedidosComprasActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPedidosComprasBusqueda")) {
				this.jButtonidPedidosComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPedidosComprasUpdate")) {
				this.jButtonid_empresaPedidosComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPedidosComprasBusqueda")) {
				this.jButtonid_empresaPedidosComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalPedidosComprasUpdate")) {
				this.jButtonid_sucursalPedidosComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalPedidosComprasBusqueda")) {
				this.jButtonid_sucursalPedidosComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoPedidosComprasUpdate")) {
				this.jButtonid_productoPedidosComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoPedidosComprasBusqueda")) {
				this.jButtonid_productoPedidosComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaPedidosComprasUpdate")) {
				this.jButtonid_lineaPedidosComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaPedidosComprasBusqueda")) {
				this.jButtonid_lineaPedidosComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoPedidosComprasUpdate")) {
				this.jButtonid_linea_grupoPedidosComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoPedidosComprasBusqueda")) {
				this.jButtonid_linea_grupoPedidosComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaPedidosComprasUpdate")) {
				this.jButtonid_linea_categoriaPedidosComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaPedidosComprasBusqueda")) {
				this.jButtonid_linea_categoriaPedidosComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaPedidosComprasUpdate")) {
				this.jButtonid_linea_marcaPedidosComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaPedidosComprasBusqueda")) {
				this.jButtonid_linea_marcaPedidosComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_producto_servicioPedidosComprasUpdate")) {
				this.jButtonid_tipo_producto_servicioPedidosComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_producto_servicioPedidosComprasBusqueda")) {
				this.jButtonid_tipo_producto_servicioPedidosComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdePedidosComprasBusqueda")) {
				this.jButtonfecha_emision_desdePedidosComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaPedidosComprasBusqueda")) {
				this.jButtonfecha_emision_hastaPedidosComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialPedidosComprasBusqueda")) {
				this.jButtonsecuencialPedidosComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionPedidosComprasBusqueda")) {
				this.jButtonfecha_emisionPedidosComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_entregaPedidosComprasBusqueda")) {
				this.jButtonfecha_entregaPedidosComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoPedidosComprasBusqueda")) {
				this.jButtonnombre_productoPedidosComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadPedidosComprasBusqueda")) {
				this.jButtonnombre_unidadPedidosComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_pedidoPedidosComprasBusqueda")) {
				this.jButtoncantidad_pedidoPedidosComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_entregadaPedidosComprasBusqueda")) {
				this.jButtoncantidad_entregadaPedidosComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_pendientePedidosComprasBusqueda")) {
				this.jButtoncantidad_pendientePedidosComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_productoPedidosComprasBusqueda")) {
				this.jButtoncodigo_productoPedidosComprasBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPedidosComprasPedidosCompras")) {
				this.jButtonBusquedaPedidosComprasPedidosComprasActionPerformed(evt);
			}
			
			;
			
			
			PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPedidosCompras();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPedidosComprasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidoscompras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidoscompras);
				
				PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
				
				


				
				PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PedidosCompras.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PedidosCompras.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PedidosCompras pedidoscomprasLocal=null;
			
			if(!this.getEsControlTabla()) {
				pedidoscomprasLocal=this.pedidoscompras;
			} else {
				pedidoscomprasLocal=this.pedidoscomprasAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidoscompras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidoscompras);
				
				PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
							
				
				


				
				PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PedidosCompras.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PedidosCompras.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPedidosComprasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasAnterior =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pedidoscomprasAnterior =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
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
			
			PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
			
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
			
			


			
			PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPedidosComprasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidoscompras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidoscompras);
				
				PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
								
						
				


				
				PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PedidosCompras.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PedidosCompras.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidoscompras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidoscompras);
				
				PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
								
				
				


				
				PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PedidosCompras.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PedidosCompras.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPedidosComprasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasAnterior =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pedidoscomprasAnterior =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidoscompras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidoscompras);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPedidosComprasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasAnterior =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pedidoscomprasAnterior =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPedidosComprasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidoscompras);
			
			this.actualizarInformacion("INFO_PADRE",false,this.pedidoscompras);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidoscompras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidoscompras);
				
				PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
							
				
				


				
				PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PedidosCompras.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PedidosCompras.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPedidosComprasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoscomprasAnterior =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.pedidoscomprasAnterior =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
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
			
			PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
			
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
			
			


			
			PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPedidosComprasActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidoscompras);
			
			this.actualizarInformacion("INFO_PADRE",false,this.pedidoscompras);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidoscompras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidoscompras);
				
				PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
								
				
				


				
				PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PedidosCompras.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PedidosCompras.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPedidosComprasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasAnterior =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pedidoscomprasAnterior =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPedidosComprasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidoscompras);
			
			this.actualizarInformacion("INFO_PADRE",false,this.pedidoscompras);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPedidosComprasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidoscompras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidoscompras);
				
				PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPedidosCompras")) {
					jCheckBoxSeleccionarTodosPedidosComprasItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPedidosCompras")) {
					jCheckBoxSeleccionadosPedidosComprasItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPedidosCompras")) {
					
				}
				
				


				
				
				PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PedidosCompras.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PedidosCompras.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidoscompras);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.pedidoscompras);
				
				PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
												
				
				


				
				
				PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PedidosCompras.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PedidosCompras.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPedidosComprasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoscomprasAnterior =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.pedidoscomprasAnterior =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPedidosComprasActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidoscompras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidoscompras);
				
				PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
				
				
				PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
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
			
			PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
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
			
			


			
			PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPedidosComprasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidoscompras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidoscompras);
				
				PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PedidosCompras.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PedidosCompras.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidoscompras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidoscompras);
				
				PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
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
				
				


				
				PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PedidosCompras.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PedidosCompras.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPedidosComprasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoscomprasAnterior =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pedidoscomprasAnterior =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPedidosCompras")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPedidosComprasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPedidosCompras.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.pedidoscompras =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.pedidoscompras =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.pedidoscompras);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPedidosCompras")) {
				
				}
				
				PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPedidosCompras")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPedidosCompras.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPedidosCompras")) {
			
			}
			
			PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPedidosCompras();
			
			PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
			
			if(sTipo.equals("NuevoPedidosCompras")) {
				jButtonNuevoPedidosComprasActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPedidosCompras")) {
				jButtonDuplicarPedidosComprasActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPedidosCompras")) {
				jButtonCopiarPedidosComprasActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPedidosCompras")) {
				jButtonVerFormPedidosComprasActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPedidosCompras")) {
				jButtonNuevoPedidosComprasActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPedidosCompras")) {
				jButtonModificarPedidosComprasActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPedidosCompras")) {
				jButtonActualizarPedidosComprasActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPedidosCompras")) {
				jButtonEliminarPedidosComprasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPedidosCompras")) {
				jButtonGuardarCambiosPedidosComprasActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPedidosCompras")) {
				jButtonCancelarPedidosComprasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPedidosCompras")) {
				jButtonCerrarPedidosComprasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPedidosCompras")) {
				jButtonGuardarCambiosPedidosComprasActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPedidosCompras")) {
				jButtonNuevoGuardarCambiosPedidosComprasActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPedidosCompras")) {
				jButtonAbrirOrderByPedidosComprasActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPedidosCompras")) {
				jButtonRecargarInformacionPedidosComprasActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPedidosCompras")) {
				jButtonAnterioresPedidosComprasActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPedidosCompras")) {
				jButtonSiguientesPedidosComprasActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPedidosComprasBusqueda")) {
				this.jButtonidPedidosComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPedidosComprasUpdate")) {
				this.jButtonid_empresaPedidosComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPedidosComprasBusqueda")) {
				this.jButtonid_empresaPedidosComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalPedidosComprasUpdate")) {
				this.jButtonid_sucursalPedidosComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalPedidosComprasBusqueda")) {
				this.jButtonid_sucursalPedidosComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoPedidosComprasUpdate")) {
				this.jButtonid_productoPedidosComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoPedidosComprasBusqueda")) {
				this.jButtonid_productoPedidosComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaPedidosComprasUpdate")) {
				this.jButtonid_lineaPedidosComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaPedidosComprasBusqueda")) {
				this.jButtonid_lineaPedidosComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoPedidosComprasUpdate")) {
				this.jButtonid_linea_grupoPedidosComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoPedidosComprasBusqueda")) {
				this.jButtonid_linea_grupoPedidosComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaPedidosComprasUpdate")) {
				this.jButtonid_linea_categoriaPedidosComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaPedidosComprasBusqueda")) {
				this.jButtonid_linea_categoriaPedidosComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaPedidosComprasUpdate")) {
				this.jButtonid_linea_marcaPedidosComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaPedidosComprasBusqueda")) {
				this.jButtonid_linea_marcaPedidosComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_producto_servicioPedidosComprasUpdate")) {
				this.jButtonid_tipo_producto_servicioPedidosComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_producto_servicioPedidosComprasBusqueda")) {
				this.jButtonid_tipo_producto_servicioPedidosComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdePedidosComprasBusqueda")) {
				this.jButtonfecha_emision_desdePedidosComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaPedidosComprasBusqueda")) {
				this.jButtonfecha_emision_hastaPedidosComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialPedidosComprasBusqueda")) {
				this.jButtonsecuencialPedidosComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionPedidosComprasBusqueda")) {
				this.jButtonfecha_emisionPedidosComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_entregaPedidosComprasBusqueda")) {
				this.jButtonfecha_entregaPedidosComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoPedidosComprasBusqueda")) {
				this.jButtonnombre_productoPedidosComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadPedidosComprasBusqueda")) {
				this.jButtonnombre_unidadPedidosComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_pedidoPedidosComprasBusqueda")) {
				this.jButtoncantidad_pedidoPedidosComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_entregadaPedidosComprasBusqueda")) {
				this.jButtoncantidad_entregadaPedidosComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_pendientePedidosComprasBusqueda")) {
				this.jButtoncantidad_pendientePedidosComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_productoPedidosComprasBusqueda")) {
				this.jButtoncodigo_productoPedidosComprasBusquedaActionPerformed(evt);
			}
			
			PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPedidosCompras();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePedidosCompras")) {
				closingInternalFramePedidosCompras();
				
			} else if(sTipo.equals("jButtonCancelarPedidosCompras")) {
				JInternalFrameBase jInternalFrameDetalleFormPedidosCompras = (JInternalFrameBase)evt.getSource();
	            	
	            PedidosComprasBeanSwingJInternalFrame jInternalFrameParent=(PedidosComprasBeanSwingJInternalFrame)jInternalFrameDetalleFormPedidosCompras.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPedidosComprasActionPerformed(null);
			}
			
			PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.pedidoscompras,new Object(),this.pedidoscomprasParameterGeneral,this.pedidoscomprasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPedidosCompras(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPedidosCompras(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPedidosCompras(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.pedidoscompras)) {
			if(!esControlTabla) {
				if(PedidosComprasJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPedidosCompras(this.pedidoscompras,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);			
				}
				
				if(this.pedidoscomprasSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPedidosCompras(this.pedidoscompras,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPedidosCompras(this.pedidoscomprasReturnGeneral,this.pedidoscomprasBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.pedidoscomprasSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPedidosCompras(classes,this.pedidoscomprasReturnGeneral,this.pedidoscomprasBean,false);
					}
						
					if(this.pedidoscomprasReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPedidosCompras(this.pedidoscomprasReturnGeneral.getPedidosCompras());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPedidosCompras(this.pedidoscomprasReturnGeneral.getPedidosCompras());	
					}
						
					if(this.pedidoscomprasReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPedidosCompras(this.pedidoscomprasReturnGeneral.getPedidosCompras(),classes);//this.pedidoscomprasBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPedidosCompras(this.pedidoscompras,classes);//this.pedidoscomprasBean);									
				}
			
				if(PedidosComprasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPedidosCompras(this.pedidoscompras,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidosCompras(this.pedidoscompras);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.pedidoscomprasAnterior!=null) {
						this.pedidoscompras=this.pedidoscomprasAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.pedidoscomprasSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.pedidoscomprasSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.pedidoscomprasReturnGeneral.getPedidosCompras(),pedidoscomprasLogic.getPedidosComprass());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.pedidoscomprasReturnGeneral.getPedidosCompras(),this.pedidoscomprass);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPedidosCompras.repaint();
				
				//((AbstractTableModel) this.jTableDatosPedidosCompras.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPedidosCompras();
			}
		}
	}
	
	public void actualizarVisualTableDatosPedidosCompras() throws Exception {
		
		PedidosComprasModel pedidoscomprasModel=(PedidosComprasModel)this.jTableDatosPedidosCompras.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			pedidoscomprasModel.pedidoscomprass=this.pedidoscomprasLogic.getPedidosComprass();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			pedidoscomprasModel.pedidoscomprass=this.pedidoscomprass;
		}
		
		
		((PedidosComprasModel) this.jTableDatosPedidosCompras.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPedidosCompras() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getpedidoscomprasAnterior(),this.pedidoscomprasLogic.getPedidosComprass());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getpedidoscomprasAnterior(),this.pedidoscomprass);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPedidosCompras();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPedidosCompras(PedidosCompras pedidoscompras,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
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
										
				PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.pedidoscompras,new Object(),generalEntityParameterGeneral,this.pedidoscomprasReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.pedidoscomprasSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PedidosComprasConstantesFunciones.getClassesRelationshipsOfPedidosCompras(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PedidosComprasConstantesFunciones.getClassesRelationshipsFromStringsOfPedidosCompras(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPedidosCompras(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PedidosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.pedidoscompras,new Object(),generalEntityParameterGeneral,this.pedidoscomprasReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPedidosCompras(PedidosComprasBean pedidoscomprasBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPedidosCompras(ArrayList<Classe> classes,PedidosComprasReturnGeneral pedidoscomprasReturnGeneral,PedidosComprasBean pedidoscomprasBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPedidosCompras(PedidosCompras pedidoscompras,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.pedidoscompras)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPedidosCompras = new PedidosComprasDetalleFormJInternalFrame(jDesktopPane,this.pedidoscomprasSessionBean.getConGuardarRelaciones(),this.pedidoscomprasSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.setVisible(false);
		this.jInternalFrameDetalleFormPedidosCompras.setSelected(false);						
		
		this.jInternalFrameDetalleFormPedidosCompras.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPedidosCompras.pedidoscomprasLogic=this.pedidoscomprasLogic;
		
		this.cargarCombosFrameForeignKeyPedidosCompras("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePedidosCompras();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePedidosCompras();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPedidosCompras("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPedidosCompras();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPedidosCompras.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPedidosCompras"));
		
		this.jInternalFrameDetalleFormPedidosCompras.jButtonModificarPedidosCompras.addActionListener(new ButtonActionListener(this,"ModificarPedidosCompras"));

		
		this.jInternalFrameDetalleFormPedidosCompras.jButtonModificarToolBarPedidosCompras.addActionListener(new ButtonActionListener(this,"ModificarToolBarPedidosCompras"));
					
		this.jInternalFrameDetalleFormPedidosCompras.jMenuItemModificarPedidosCompras.addActionListener(new ButtonActionListener(this,"MenuItemModificarPedidosCompras"));		
		
		
		
		this.jInternalFrameDetalleFormPedidosCompras.jButtonActualizarPedidosCompras.addActionListener (new ButtonActionListener(this,"ActualizarPedidosCompras"));
		
		
		this.jInternalFrameDetalleFormPedidosCompras.jButtonActualizarToolBarPedidosCompras.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPedidosCompras"));
						
		this.jInternalFrameDetalleFormPedidosCompras.jMenuItemActualizarPedidosCompras.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPedidosCompras"));		
		
		
		
		this.jInternalFrameDetalleFormPedidosCompras.jButtonEliminarPedidosCompras.addActionListener (new ButtonActionListener(this,"EliminarPedidosCompras"));
		
		
		this.jInternalFrameDetalleFormPedidosCompras.jButtonEliminarToolBarPedidosCompras.addActionListener (new ButtonActionListener(this,"EliminarToolBarPedidosCompras"));
								
		this.jInternalFrameDetalleFormPedidosCompras.jMenuItemEliminarPedidosCompras.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPedidosCompras"));		
		
		
		
		this.jInternalFrameDetalleFormPedidosCompras.jButtonCancelarPedidosCompras.addActionListener (new ButtonActionListener(this,"CancelarPedidosCompras"));
		
		
		this.jInternalFrameDetalleFormPedidosCompras.jButtonCancelarToolBarPedidosCompras.addActionListener (new ButtonActionListener(this,"CancelarToolBarPedidosCompras"));
					
		this.jInternalFrameDetalleFormPedidosCompras.jMenuItemCancelarPedidosCompras.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPedidosCompras"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPedidosCompras.jMenuItemDetalleCerrarPedidosCompras.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPedidosCompras"));		
		
		
		
		this.jInternalFrameDetalleFormPedidosCompras.jButtonGuardarCambiosToolBarPedidosCompras.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPedidosCompras"));
		
		
		
		this.jInternalFrameDetalleFormPedidosCompras.jButtonGuardarCambiosToolBarPedidosCompras.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPedidosCompras"));
		
		
		
		this.jInternalFrameDetalleFormPedidosCompras.jComboBoxTiposAccionesFormularioPedidosCompras.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPedidosCompras"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonidPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"idPedidosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_empresaPedidosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPedidosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_empresaPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPedidosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_sucursalPedidosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPedidosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_sucursalPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPedidosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_productoPedidosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_productoPedidosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_productoPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_productoPedidosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_lineaPedidosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_lineaPedidosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_lineaPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaPedidosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_linea_grupoPedidosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoPedidosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_linea_grupoPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoPedidosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_linea_categoriaPedidosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaPedidosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_linea_categoriaPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaPedidosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_linea_marcaPedidosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaPedidosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_linea_marcaPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaPedidosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_tipo_producto_servicioPedidosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_producto_servicioPedidosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_tipo_producto_servicioPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_producto_servicioPedidosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonfecha_emision_desdePedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdePedidosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonfecha_emision_hastaPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaPedidosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonsecuencialPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"secuencialPedidosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonfecha_emisionPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionPedidosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonfecha_entregaPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_entregaPedidosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonnombre_productoPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoPedidosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonnombre_unidadPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadPedidosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtoncantidad_pedidoPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_pedidoPedidosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtoncantidad_entregadaPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_entregadaPedidosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtoncantidad_pendientePedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_pendientePedidosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtoncodigo_productoPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoPedidosComprasBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPedidosCompras.jTabbedPaneRelacionesPedidosCompras.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPedidosCompras"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePedidosCompras"));
		
		if(this.jInternalFrameDetalleFormPedidosCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidosCompras.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPedidosCompras"));
		}
		
		this.jTableDatosPedidosCompras.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPedidosCompras"));
		
		this.jTableDatosPedidosCompras.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPedidosCompras"));
		
		this.jButtonNuevoPedidosCompras.addActionListener(new ButtonActionListener(this,"NuevoPedidosCompras"));
		
		this.jButtonDuplicarPedidosCompras.addActionListener(new ButtonActionListener(this,"DuplicarPedidosCompras"));
		
		this.jButtonCopiarPedidosCompras.addActionListener(new ButtonActionListener(this,"CopiarPedidosCompras"));
		
		this.jButtonVerFormPedidosCompras.addActionListener(new ButtonActionListener(this,"VerFormPedidosCompras"));
		
		
		this.jButtonNuevoToolBarPedidosCompras.addActionListener(new ButtonActionListener(this,"NuevoToolBarPedidosCompras"));
			
		this.jButtonDuplicarToolBarPedidosCompras.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPedidosCompras"));
			
		this.jMenuItemNuevoPedidosCompras.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPedidosCompras"));
			
		this.jMenuItemDuplicarPedidosCompras.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPedidosCompras"));		
		
		
		this.jButtonNuevoRelacionesPedidosCompras.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPedidosCompras"));
		
		
		this.jButtonNuevoRelacionesToolBarPedidosCompras.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPedidosCompras"));
			
		this.jMenuItemNuevoRelacionesPedidosCompras.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPedidosCompras"));		
		
		
		if(this.jInternalFrameDetalleFormPedidosCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidosCompras.jButtonModificarPedidosCompras.addActionListener(new ButtonActionListener(this,"ModificarPedidosCompras"));
		}
		
		
		if(this.jInternalFrameDetalleFormPedidosCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidosCompras.jButtonModificarToolBarPedidosCompras.addActionListener(new ButtonActionListener(this,"ModificarToolBarPedidosCompras"));
			
			this.jInternalFrameDetalleFormPedidosCompras.jMenuItemModificarPedidosCompras.addActionListener(new ButtonActionListener(this,"MenuItemModificarPedidosCompras"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPedidosCompras!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPedidosCompras.jButtonActualizarPedidosCompras.addActionListener (new ButtonActionListener(this,"ActualizarPedidosCompras"));
		}
		
		
		if(this.jInternalFrameDetalleFormPedidosCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidosCompras.jButtonActualizarToolBarPedidosCompras.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPedidosCompras"));
				
			this.jInternalFrameDetalleFormPedidosCompras.jMenuItemActualizarPedidosCompras.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPedidosCompras"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPedidosCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidosCompras.jButtonEliminarPedidosCompras.addActionListener (new ButtonActionListener(this,"EliminarPedidosCompras"));
		}
		
		
		if(this.jInternalFrameDetalleFormPedidosCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidosCompras.jButtonEliminarToolBarPedidosCompras.addActionListener (new ButtonActionListener(this,"EliminarToolBarPedidosCompras"));
						
			this.jInternalFrameDetalleFormPedidosCompras.jMenuItemEliminarPedidosCompras.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPedidosCompras"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPedidosCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidosCompras.jButtonCancelarPedidosCompras.addActionListener (new ButtonActionListener(this,"CancelarPedidosCompras"));
		}
		
		
		if(this.jInternalFrameDetalleFormPedidosCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidosCompras.jButtonCancelarToolBarPedidosCompras.addActionListener (new ButtonActionListener(this,"CancelarToolBarPedidosCompras"));
			
			this.jInternalFrameDetalleFormPedidosCompras.jMenuItemCancelarPedidosCompras.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPedidosCompras"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPedidosCompras.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPedidosCompras"));		
		
		
		this.jButtonCerrarPedidosCompras.addActionListener (new ButtonActionListener(this,"CerrarPedidosCompras"));
		
		
		this.jButtonCerrarToolBarPedidosCompras.addActionListener (new ButtonActionListener(this,"CerrarToolBarPedidosCompras"));
			
		this.jMenuItemCerrarPedidosCompras.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPedidosCompras"));
			
		if(this.jInternalFrameDetalleFormPedidosCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidosCompras.jMenuItemDetalleCerrarPedidosCompras.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPedidosCompras"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPedidosCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidosCompras.jButtonGuardarCambiosPedidosCompras.addActionListener (new ButtonActionListener(this,"GuardarCambiosPedidosCompras"));
		}
		
		
		if(this.jInternalFrameDetalleFormPedidosCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidosCompras.jButtonGuardarCambiosToolBarPedidosCompras.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPedidosCompras"));
		}
		
		this.jButtonCopiarToolBarPedidosCompras.addActionListener (new ButtonActionListener(this,"CopiarToolBarPedidosCompras"));
			
		this.jButtonVerFormToolBarPedidosCompras.addActionListener (new ButtonActionListener(this,"VerFormToolBarPedidosCompras"));
		
		this.jMenuItemGuardarCambiosPedidosCompras.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPedidosCompras"));
			
		this.jMenuItemCopiarPedidosCompras.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPedidosCompras"));		
		
		this.jMenuItemVerFormPedidosCompras.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPedidosCompras"));		
		
		
		this.jButtonGuardarCambiosTablaPedidosCompras.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPedidosCompras"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPedidosCompras.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPedidosCompras"));
			
		this.jMenuItemGuardarCambiosTablaPedidosCompras.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPedidosCompras"));		
		
		
		
		this.jButtonRecargarInformacionPedidosCompras.addActionListener (new ButtonActionListener(this,"RecargarInformacionPedidosCompras"));
					
		this.jButtonRecargarInformacionToolBarPedidosCompras.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPedidosCompras"));
		
		this.jMenuItemRecargarInformacionPedidosCompras.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPedidosCompras"));		
		
		
		
		this.jButtonAnterioresPedidosCompras.addActionListener (new ButtonActionListener(this,"AnterioresPedidosCompras"));
		
		
		this.jButtonAnterioresToolBarPedidosCompras.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPedidosCompras"));
		
		this.jMenuItemAnterioresPedidosCompras.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPedidosCompras"));		
		
		
		this.jButtonSiguientesPedidosCompras.addActionListener (new ButtonActionListener(this,"SiguientesPedidosCompras"));
		
		
		this.jButtonSiguientesToolBarPedidosCompras.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPedidosCompras"));
			
		this.jMenuItemSiguientesPedidosCompras.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPedidosCompras"));
			
		this.jMenuItemAbrirOrderByPedidosCompras.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPedidosCompras"));
			
		this.jMenuItemMostrarOcultarPedidosCompras.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPedidosCompras"));
			
		this.jMenuItemDetalleAbrirOrderByPedidosCompras.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPedidosCompras"));
			
		this.jMenuItemDetalleMostarOcultarPedidosCompras.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPedidosCompras"));		
		
		
		this.jButtonNuevoGuardarCambiosPedidosCompras.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPedidosCompras"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPedidosCompras.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPedidosCompras"));
			
		this.jMenuItemNuevoGuardarCambiosPedidosCompras.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPedidosCompras"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPedidosCompras.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPedidosCompras"));

		this.jCheckBoxSeleccionadosPedidosCompras.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPedidosCompras"));
		
		if(this.jInternalFrameDetalleFormPedidosCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidosCompras.jComboBoxTiposAccionesFormularioPedidosCompras.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPedidosCompras"));
		}
		
		
		this.jComboBoxTiposRelacionesPedidosCompras.addActionListener (new ButtonActionListener(this,"TiposRelacionesPedidosCompras"));
			
		this.jComboBoxTiposAccionesPedidosCompras.addActionListener (new ButtonActionListener(this,"TiposAccionesPedidosCompras"));
					
		this.jComboBoxTiposSeleccionarPedidosCompras.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPedidosCompras"));
			
		this.jTextFieldValorCampoGeneralPedidosCompras.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPedidosCompras"));		
		
		
		if(this.jInternalFrameDetalleFormPedidosCompras!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonidPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"idPedidosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_empresaPedidosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPedidosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_empresaPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPedidosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_sucursalPedidosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPedidosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_sucursalPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPedidosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_productoPedidosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_productoPedidosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_productoPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_productoPedidosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_lineaPedidosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_lineaPedidosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_lineaPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaPedidosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_linea_grupoPedidosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoPedidosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_linea_grupoPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoPedidosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_linea_categoriaPedidosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaPedidosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_linea_categoriaPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaPedidosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_linea_marcaPedidosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaPedidosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_linea_marcaPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaPedidosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_tipo_producto_servicioPedidosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_producto_servicioPedidosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_tipo_producto_servicioPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_producto_servicioPedidosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonfecha_emision_desdePedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdePedidosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonfecha_emision_hastaPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaPedidosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonsecuencialPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"secuencialPedidosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonfecha_emisionPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionPedidosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonfecha_entregaPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_entregaPedidosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonnombre_productoPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoPedidosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonnombre_unidadPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadPedidosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtoncantidad_pedidoPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_pedidoPedidosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtoncantidad_entregadaPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_entregadaPedidosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtoncantidad_pendientePedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_pendientePedidosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtoncodigo_productoPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoPedidosComprasBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPedidosComprasPedidosCompras.addActionListener(new ButtonActionListener(this,"BusquedaPedidosComprasPedidosCompras"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPedidosCompras!=null) {
				this.jInternalFrameReporteDinamicoPedidosCompras.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPedidosCompras"));
				this.jInternalFrameReporteDinamicoPedidosCompras.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPedidosCompras"));
				this.jInternalFrameReporteDinamicoPedidosCompras.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPedidosCompras"));
			}
			
			//this.jButtonCerrarReporteDinamicoPedidosCompras.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPedidosCompras"));				
			//this.jButtonGenerarReporteDinamicoPedidosCompras.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPedidosCompras"));
			//this.jButtonGenerarExcelReporteDinamicoPedidosCompras.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPedidosCompras"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPedidosCompras!=null) {
				this.jInternalFrameImportacionPedidosCompras.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPedidosCompras"));
				this.jInternalFrameImportacionPedidosCompras.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPedidosCompras"));
				this.jInternalFrameImportacionPedidosCompras.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPedidosCompras"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPedidosCompras.addActionListener (new ButtonActionListener(this,"AbrirOrderByPedidosCompras"));
			
			this.jButtonAbrirOrderByToolBarPedidosCompras.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPedidosCompras"));			
			
			if(this.jInternalFrameOrderByPedidosCompras!=null) {
				this.jInternalFrameOrderByPedidosCompras.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPedidosCompras"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPedidosCompras!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPedidosCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidosCompras.jTabbedPaneRelacionesPedidosCompras.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPedidosCompras"));
		
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
            		closingInternalFramePedidosCompras();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPedidosCompras.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPedidosCompras = (JInternalFrameBase)event.getSource();
	            	
	            PedidosComprasBeanSwingJInternalFrame jInternalFrameParent=(PedidosComprasBeanSwingJInternalFrame)jInternalFrameDetalleFormPedidosCompras.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPedidosComprasActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPedidosCompras.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPedidosComprasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPedidosCompras.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPedidosCompras.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPedidosComprasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPedidosComprasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPedidosComprasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPedidosCompras";
		inputMap = this.jButtonNuevoPedidosCompras.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPedidosCompras.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPedidosComprasActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPedidosComprasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPedidosComprasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPedidosComprasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPedidosCompras";
		inputMap = this.jButtonNuevoRelacionesPedidosCompras.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPedidosCompras.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPedidosComprasActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPedidosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPedidosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPedidosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPedidosCompras";
		inputMap = this.jButtonModificarPedidosCompras.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPedidosCompras.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPedidosComprasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPedidosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPedidosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPedidosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPedidosCompras";
		inputMap = this.jButtonActualizarPedidosCompras.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPedidosCompras.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPedidosComprasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPedidosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPedidosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPedidosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPedidosCompras";
		inputMap = this.jButtonEliminarPedidosCompras.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPedidosCompras.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPedidosComprasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPedidosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPedidosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPedidosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPedidosCompras";
		inputMap = this.jButtonCancelarPedidosCompras.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPedidosCompras.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPedidosComprasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPedidosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPedidosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPedidosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPedidosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPedidosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPedidosCompras";
		inputMap = this.jButtonCerrarPedidosCompras.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPedidosCompras.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPedidosComprasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPedidosCompras.jButtonGuardarCambiosPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPedidosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPedidosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPedidosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPedidosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPedidosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPedidosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPedidosCompras";
		inputMap = this.jInternalFrameDetalleFormPedidosCompras.jButtonGuardarCambiosPedidosCompras.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPedidosCompras.jButtonGuardarCambiosPedidosCompras.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPedidosComprasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPedidosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPedidosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPedidosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPedidosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPedidosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPedidosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPedidosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPedidosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPedidosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPedidosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPedidosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPedidosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPedidosCompras.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPedidosComprasItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPedidosCompras.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPedidosComprasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPedidosCompras.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPedidosComprasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPedidosCompras.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPedidosComprasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonidPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"idPedidosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_empresaPedidosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPedidosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_empresaPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPedidosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_sucursalPedidosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPedidosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_sucursalPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPedidosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_productoPedidosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_productoPedidosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_productoPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_productoPedidosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_lineaPedidosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_lineaPedidosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_lineaPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaPedidosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_linea_grupoPedidosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoPedidosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_linea_grupoPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoPedidosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_linea_categoriaPedidosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaPedidosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_linea_categoriaPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaPedidosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_linea_marcaPedidosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaPedidosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_linea_marcaPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaPedidosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_tipo_producto_servicioPedidosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_producto_servicioPedidosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonid_tipo_producto_servicioPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_producto_servicioPedidosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonfecha_emision_desdePedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdePedidosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonfecha_emision_hastaPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaPedidosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonsecuencialPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"secuencialPedidosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonfecha_emisionPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionPedidosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonfecha_entregaPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_entregaPedidosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonnombre_productoPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoPedidosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtonnombre_unidadPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadPedidosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtoncantidad_pedidoPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_pedidoPedidosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtoncantidad_entregadaPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_entregadaPedidosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtoncantidad_pendientePedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_pendientePedidosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidosCompras.jButtoncodigo_productoPedidosComprasBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoPedidosComprasBusqueda"));
		
		
		this.jButtonBusquedaPedidosComprasPedidosCompras.addActionListener(new ButtonActionListener(this,"BusquedaPedidosComprasPedidosCompras"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPedidosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPedidosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPedidosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPedidosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPedidosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPedidosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPedidosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPedidosComprasActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPedidosCompras.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPedidosCompras(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PedidosCompras pedidoscomprasAux:this.pedidoscomprasLogic.getPedidosComprass()) {
					pedidoscomprasAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PedidosCompras pedidoscomprasAux:pedidoscomprass) {
					pedidoscomprasAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPedidosComprasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPedidosCompras(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PedidosCompras pedidoscomprasAux:this.pedidoscomprasLogic.getPedidosComprass()) {
						pedidoscomprasAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PedidosCompras pedidoscomprasAux:pedidoscomprass) {
						pedidoscomprasAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PedidosCompras pedidoscomprasAux:this.pedidoscomprasLogic.getPedidosComprass()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PedidosCompras pedidoscomprasAux:pedidoscomprass) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPedidosCompras(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPedidosCompras.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPedidosCompras.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPedidosCompras,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPedidosComprasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPedidosCompras(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPedidosCompras.getSelectedRows();
			
			PedidosCompras pedidoscomprasLocal=new PedidosCompras();
			
			//this.seleccionarTodosPedidosCompras(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					pedidoscomprasLocal =(PedidosCompras) this.pedidoscomprasLogic.getPedidosComprass().toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					pedidoscomprasLocal =(PedidosCompras) this.pedidoscomprass.toArray()[this.jTableDatosPedidosCompras.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				pedidoscomprasLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PedidosCompras pedidoscomprasAux:this.pedidoscomprasLogic.getPedidosComprass()) {
						pedidoscomprasAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PedidosCompras pedidoscomprasAux:pedidoscomprass) {
						pedidoscomprasAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPedidosCompras(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPedidosCompras.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPedidosCompras.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPedidosCompras,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPedidosComprasItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPedidosComprasParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPedidosComprasActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPedidosCompras(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPedidosCompras.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PedidosCompras pedidoscomprasAux:this.pedidoscomprasLogic.getPedidosComprass()) {
				
						if(sTipoSeleccionar.equals(PedidosComprasConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							pedidoscomprasAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PedidosComprasConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							pedidoscomprasAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PedidosComprasConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							pedidoscomprasAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PedidosComprasConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							pedidoscomprasAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PedidosComprasConstantesFunciones.LABEL_FECHAENTREGA)) {
							existe=true;
							pedidoscomprasAux.setfecha_entrega(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PedidosComprasConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							pedidoscomprasAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PedidosComprasConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							pedidoscomprasAux.setnombre_unidad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PedidosComprasConstantesFunciones.LABEL_CANTIDADPEDIDO)) {
							existe=true;
							pedidoscomprasAux.setcantidad_pedido(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PedidosComprasConstantesFunciones.LABEL_CANTIDADENTREGADA)) {
							existe=true;
							pedidoscomprasAux.setcantidad_entregada(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PedidosComprasConstantesFunciones.LABEL_CANTIDADPENDIENTE)) {
							existe=true;
							pedidoscomprasAux.setcantidad_pendiente(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PedidosComprasConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
							existe=true;
							pedidoscomprasAux.setcodigo_producto(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PedidosCompras pedidoscomprasAux:pedidoscomprass) {
					
						if(sTipoSeleccionar.equals(PedidosComprasConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							pedidoscomprasAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PedidosComprasConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							pedidoscomprasAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PedidosComprasConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							pedidoscomprasAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PedidosComprasConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							pedidoscomprasAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PedidosComprasConstantesFunciones.LABEL_FECHAENTREGA)) {
							existe=true;
							pedidoscomprasAux.setfecha_entrega(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PedidosComprasConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							pedidoscomprasAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PedidosComprasConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							pedidoscomprasAux.setnombre_unidad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PedidosComprasConstantesFunciones.LABEL_CANTIDADPEDIDO)) {
							existe=true;
							pedidoscomprasAux.setcantidad_pedido(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PedidosComprasConstantesFunciones.LABEL_CANTIDADENTREGADA)) {
							existe=true;
							pedidoscomprasAux.setcantidad_entregada(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PedidosComprasConstantesFunciones.LABEL_CANTIDADPENDIENTE)) {
							existe=true;
							pedidoscomprasAux.setcantidad_pendiente(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PedidosComprasConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
							existe=true;
							pedidoscomprasAux.setcodigo_producto(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPedidosCompras(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPedidosComprasActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPedidosCompras(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPedidosCompras=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPedidosCompras.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPedidosCompras.jComboBoxTiposAccionesFormularioPedidosCompras.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePedidosCompras) {				
					conSplash=true;//false;										
					
					//this.startProcessPedidosCompras(conSplash);
				
					this.generarReportePedidosComprassSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPedidosCompras.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPedidosCompras.jComboBoxTiposAccionesFormularioPedidosCompras.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPedidosComprassSeleccionados();
				//this.jComboBoxTiposAccionesPedidosCompras.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPedidosComprassSeleccionados(false);
				//this.jComboBoxTiposAccionesPedidosCompras.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPedidosComprassSeleccionados(true);
				//this.jComboBoxTiposAccionesPedidosCompras.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPedidosCompras();
				
				this.exportarPedidosComprassSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPedidosCompras.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPedidosCompras.jComboBoxTiposAccionesFormularioPedidosCompras.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPedidosComprass();
				//this.importarPedidosComprass();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPedidosCompras.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPedidosCompras.jComboBoxTiposAccionesFormularioPedidosCompras.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPedidosCompras();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPedidosComprassSeleccionados();
				//this.jComboBoxTiposAccionesPedidosCompras.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Pedidos Compras", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPedidosCompras();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPedidosCompras)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPedidosCompras(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Pedidos Compras",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPedidosCompras.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPedidosCompras.jComboBoxTiposAccionesFormularioPedidosCompras.setSelectedIndex(0);					
				}	
			} 			
			else if(PedidosComprasBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePedidosCompras) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPedidosCompras(conSplash);
					
						//this.actualizarParametrosGeneralPedidosCompras();
						
						this.generarReporteProcesoAccionPedidosComprassSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPedidosCompras.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPedidosCompras.jComboBoxTiposAccionesFormularioPedidosCompras.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PedidosComprasBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Pedidos ComprasES SELECCIONADOS?", "MANTENIMIENTO DE Pedidos Compras", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPedidosCompras();
				
						this.actualizarParametrosGeneralPedidosCompras();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.pedidoscomprasReturnGeneral=pedidoscomprasLogic.procesarAccionPedidosComprassWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.pedidoscomprasLogic.getPedidosComprass(),this.pedidoscomprasParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPedidosComprasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPedidosCompras.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPedidosCompras.jComboBoxTiposAccionesFormularioPedidosCompras.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPedidosCompras();
					
					PedidosComprasBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPedidosComprasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPedidosCompras.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPedidosCompras.jComboBoxTiposAccionesFormularioPedidosCompras.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPedidosCompras(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPedidosComprasActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPedidosCompras();
			
			if(this.jInternalFrameDetalleFormPedidosCompras==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PedidosCompras> pedidoscomprassSeleccionados=new ArrayList<PedidosCompras>();		
			PedidosCompras pedidoscompras=new PedidosCompras();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPedidosCompras(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPedidosCompras.getSelectedItem();
			
			
			
			
			pedidoscomprassSeleccionados=this.getPedidosComprassSeleccionados(true);
			//this.sTipoAccion;
			
			if(pedidoscomprassSeleccionados.size()==1) {
				for(PedidosCompras pedidoscomprasAux:pedidoscomprassSeleccionados) {
					pedidoscompras=pedidoscomprasAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPedidosCompras();
			
      		//this.finishProcessPedidosCompras(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPedidosComprasReturnGeneral() throws Exception {
		if(this.pedidoscomprasReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.pedidoscomprasReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.pedidoscomprasReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.pedidoscomprasReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.pedidoscomprasReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.pedidoscomprasReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPedidosCompras(false);
		}
		
		if(this.pedidoscomprasReturnGeneral.getConRetornoLista() || this.pedidoscomprasReturnGeneral.getConRetornoObjeto()) {
			if(this.pedidoscomprasReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.pedidoscomprasLogic.setPedidosComprass(this.pedidoscomprasReturnGeneral.getPedidosComprass());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingPedidosCompras(false);
		}
	}
	
	public void actualizarParametrosGeneralPedidosCompras() throws Exception {
		
		
	}
	
	public ArrayList<PedidosCompras> getPedidosComprassSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PedidosCompras> pedidoscomprassSeleccionados=new ArrayList<PedidosCompras>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPedidosCompras) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PedidosCompras pedidoscomprasAux:pedidoscomprasLogic.getPedidosComprass()) {
					if(pedidoscomprasAux.getIsSelected()) {
						pedidoscomprassSeleccionados.add(pedidoscomprasAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PedidosCompras pedidoscomprasAux:this.pedidoscomprass) {
					if(pedidoscomprasAux.getIsSelected()) {
						pedidoscomprassSeleccionados.add(pedidoscomprasAux);				
					}
				}
			}
			
			if(pedidoscomprassSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						pedidoscomprassSeleccionados.addAll(this.pedidoscomprasLogic.getPedidosComprass());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						pedidoscomprassSeleccionados.addAll(this.pedidoscomprass);				
					}
				}
			}
		} else {
			pedidoscomprassSeleccionados.add(this.pedidoscompras);
		}
		
		return pedidoscomprassSeleccionados;
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
	
	public void generarReportePedidosComprassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPedidosComprassSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPedidosComprassSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPedidosComprassSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPedidosComprassSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Pedidos Compras",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPedidosComprassSeleccionados() throws Exception {
		ArrayList<PedidosCompras> pedidoscomprassSeleccionados=new ArrayList<PedidosCompras>();		
		
		pedidoscomprassSeleccionados=this.getPedidosComprassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePedidosComprass("Todos",pedidoscomprassSeleccionados);
		
	}	
	
	public void generarReporteNormalPedidosComprassSeleccionados() throws Exception {
		ArrayList<PedidosCompras> pedidoscomprassSeleccionados=new ArrayList<PedidosCompras>();		
		
		pedidoscomprassSeleccionados=this.getPedidosComprassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePedidosComprass("Todos",pedidoscomprassSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPedidosComprassSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PedidosCompras> pedidoscomprassSeleccionados=new ArrayList<PedidosCompras>();
		
		pedidoscomprassSeleccionados=this.getPedidosComprassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePedidosComprass("Todos",pedidoscomprassSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPedidosComprassSeleccionados() throws Exception {
		ArrayList<PedidosCompras> pedidoscomprassSeleccionados=new ArrayList<PedidosCompras>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPedidosCompras();
		
		
		pedidoscomprassSeleccionados=this.getPedidosComprassSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPedidosCompras();
		
		
		//this.generarReportePedidosComprass("Todos",pedidoscomprassSeleccionados ,pedidoscomprasImplementable,pedidoscomprasImplementableHome);
	}
	
	public void mostrarImportacionPedidosComprass() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPedidosCompras();
		
		this.abrirFrameImportacionPedidosCompras();		
		
			
		//this.generarReportePedidosComprass("Todos",pedidoscomprassSeleccionados ,pedidoscomprasImplementable,pedidoscomprasImplementableHome);
	}
	
	public void importarPedidosComprass() throws Exception {		
	
	}
	
	public void exportarPedidosComprassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPedidosComprassSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPedidosComprassSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPedidosComprassSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Pedidos Compras",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPedidosComprassSeleccionados() throws Exception {
		ArrayList<PedidosCompras> pedidoscomprassSeleccionados=new ArrayList<PedidosCompras>();		
		
		pedidoscomprassSeleccionados=this.getPedidosComprassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pedidoscompras."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPedidosCompras(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PedidosCompras pedidoscomprasAux:pedidoscomprassSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPedidosCompras(pedidoscomprasAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//pedidoscomprasAux.setsDetalleGeneralEntityReporte(pedidoscomprasAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pedidoscomprasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pedidos Compras",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPedidosCompras(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PedidosComprasConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidosComprasConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidosComprasConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidosComprasConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidosComprasConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidosComprasConstantesFunciones.LABEL_IDLINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidosComprasConstantesFunciones.LABEL_IDLINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidosComprasConstantesFunciones.LABEL_IDLINEACATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidosComprasConstantesFunciones.LABEL_IDLINEAMARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidosComprasConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidosComprasConstantesFunciones.LABEL_FECHAEMISIONDESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidosComprasConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidosComprasConstantesFunciones.LABEL_SECUENCIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidosComprasConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidosComprasConstantesFunciones.LABEL_FECHAENTREGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidosComprasConstantesFunciones.LABEL_NOMBREPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidosComprasConstantesFunciones.LABEL_NOMBREUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidosComprasConstantesFunciones.LABEL_CANTIDADPEDIDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidosComprasConstantesFunciones.LABEL_CANTIDADENTREGADA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidosComprasConstantesFunciones.LABEL_CANTIDADPENDIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidosComprasConstantesFunciones.LABEL_CODIGOPRODUCTO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPedidosCompras(PedidosCompras pedidoscompras,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=pedidoscompras.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidoscompras.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidoscompras.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidoscompras.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidoscompras.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidoscompras.getlinea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidoscompras.getlineagrupo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidoscompras.getlineacategoria_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidoscompras.getlineamarca_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidoscompras.gettipoproductoservicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidoscompras.getfecha_emision_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidoscompras.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidoscompras.getsecuencial();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidoscompras.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidoscompras.getfecha_entrega().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidoscompras.getnombre_producto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidoscompras.getnombre_unidad();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidoscompras.getcantidad_pedido().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidoscompras.getcantidad_entregada().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidoscompras.getcantidad_pendiente().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidoscompras.getcodigo_producto();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPedidosComprassSeleccionados() throws Exception {
		ArrayList<PedidosCompras> pedidoscomprassSeleccionados=new ArrayList<PedidosCompras>();		
		
		pedidoscomprassSeleccionados=this.getPedidosComprassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pedidoscompras.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PedidosComprass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPedidosCompras(row);				
				iRow++;
			}				
			
			for(PedidosCompras pedidoscomprasAux:pedidoscomprassSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPedidosCompras(pedidoscomprasAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pedidoscomprasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pedidos Compras",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPedidosComprassSeleccionados() throws Exception {
		ArrayList<PedidosCompras> pedidoscomprassSeleccionados=new ArrayList<PedidosCompras>();		
		
		pedidoscomprassSeleccionados=this.getPedidosComprassSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pedidoscompras.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("pedidoscomprass");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("pedidoscompras");
			//elementRoot.appendChild(element);
		
			for(PedidosCompras pedidoscomprasAux:pedidoscomprassSeleccionados) {
				element = document.createElement("pedidoscompras");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPedidosCompras(pedidoscomprasAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pedidoscomprasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pedidos Compras",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPedidosCompras(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_IDLINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_IDLINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_IDLINEACATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_IDLINEAMARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_SECUENCIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_FECHAENTREGA);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_NOMBREPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_NOMBREUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_CANTIDADPEDIDO);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_CANTIDADENTREGADA);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_CANTIDADPENDIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidosComprasConstantesFunciones.LABEL_CODIGOPRODUCTO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPedidosCompras(PedidosCompras pedidoscompras,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(pedidoscompras.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidoscompras.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidoscompras.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidoscompras.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidoscompras.getlinea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidoscompras.getlineagrupo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidoscompras.getlineacategoria_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidoscompras.getlineamarca_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidoscompras.gettipoproductoservicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidoscompras.getfecha_emision_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidoscompras.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidoscompras.getsecuencial());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidoscompras.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidoscompras.getfecha_entrega());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidoscompras.getnombre_producto());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidoscompras.getnombre_unidad());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidoscompras.getcantidad_pedido());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidoscompras.getcantidad_entregada());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidoscompras.getcantidad_pendiente());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidoscompras.getcodigo_producto());				
	}
	
	public void setFilaDatosExportarXmlPedidosCompras(PedidosCompras pedidoscompras,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PedidosComprasConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(pedidoscompras.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PedidosComprasConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(pedidoscompras.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(PedidosComprasConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(pedidoscompras.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(PedidosComprasConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(pedidoscompras.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementproducto_descripcion = document.createElement(PedidosComprasConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(pedidoscompras.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementlinea_descripcion = document.createElement(PedidosComprasConstantesFunciones.IDLINEA);
		elementlinea_descripcion.appendChild(document.createTextNode(pedidoscompras.getlinea_descripcion()));
		element.appendChild(elementlinea_descripcion);

		Element elementlineagrupo_descripcion = document.createElement(PedidosComprasConstantesFunciones.IDLINEAGRUPO);
		elementlineagrupo_descripcion.appendChild(document.createTextNode(pedidoscompras.getlineagrupo_descripcion()));
		element.appendChild(elementlineagrupo_descripcion);

		Element elementlineacategoria_descripcion = document.createElement(PedidosComprasConstantesFunciones.IDLINEACATEGORIA);
		elementlineacategoria_descripcion.appendChild(document.createTextNode(pedidoscompras.getlineacategoria_descripcion()));
		element.appendChild(elementlineacategoria_descripcion);

		Element elementlineamarca_descripcion = document.createElement(PedidosComprasConstantesFunciones.IDLINEAMARCA);
		elementlineamarca_descripcion.appendChild(document.createTextNode(pedidoscompras.getlineamarca_descripcion()));
		element.appendChild(elementlineamarca_descripcion);

		Element elementtipoproductoservicio_descripcion = document.createElement(PedidosComprasConstantesFunciones.IDTIPOPRODUCTOSERVICIO);
		elementtipoproductoservicio_descripcion.appendChild(document.createTextNode(pedidoscompras.gettipoproductoservicio_descripcion()));
		element.appendChild(elementtipoproductoservicio_descripcion);

		Element elementfecha_emision_desde = document.createElement(PedidosComprasConstantesFunciones.FECHAEMISIONDESDE);
		elementfecha_emision_desde.appendChild(document.createTextNode(pedidoscompras.getfecha_emision_desde().toString().trim()));
		element.appendChild(elementfecha_emision_desde);

		Element elementfecha_emision_hasta = document.createElement(PedidosComprasConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(pedidoscompras.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementsecuencial = document.createElement(PedidosComprasConstantesFunciones.SECUENCIAL);
		elementsecuencial.appendChild(document.createTextNode(pedidoscompras.getsecuencial().trim()));
		element.appendChild(elementsecuencial);

		Element elementfecha_emision = document.createElement(PedidosComprasConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(pedidoscompras.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementfecha_entrega = document.createElement(PedidosComprasConstantesFunciones.FECHAENTREGA);
		elementfecha_entrega.appendChild(document.createTextNode(pedidoscompras.getfecha_entrega().toString().trim()));
		element.appendChild(elementfecha_entrega);

		Element elementnombre_producto = document.createElement(PedidosComprasConstantesFunciones.NOMBREPRODUCTO);
		elementnombre_producto.appendChild(document.createTextNode(pedidoscompras.getnombre_producto().trim()));
		element.appendChild(elementnombre_producto);

		Element elementnombre_unidad = document.createElement(PedidosComprasConstantesFunciones.NOMBREUNIDAD);
		elementnombre_unidad.appendChild(document.createTextNode(pedidoscompras.getnombre_unidad().trim()));
		element.appendChild(elementnombre_unidad);

		Element elementcantidad_pedido = document.createElement(PedidosComprasConstantesFunciones.CANTIDADPEDIDO);
		elementcantidad_pedido.appendChild(document.createTextNode(pedidoscompras.getcantidad_pedido().toString().trim()));
		element.appendChild(elementcantidad_pedido);

		Element elementcantidad_entregada = document.createElement(PedidosComprasConstantesFunciones.CANTIDADENTREGADA);
		elementcantidad_entregada.appendChild(document.createTextNode(pedidoscompras.getcantidad_entregada().toString().trim()));
		element.appendChild(elementcantidad_entregada);

		Element elementcantidad_pendiente = document.createElement(PedidosComprasConstantesFunciones.CANTIDADPENDIENTE);
		elementcantidad_pendiente.appendChild(document.createTextNode(pedidoscompras.getcantidad_pendiente().toString().trim()));
		element.appendChild(elementcantidad_pendiente);

		Element elementcodigo_producto = document.createElement(PedidosComprasConstantesFunciones.CODIGOPRODUCTO);
		elementcodigo_producto.appendChild(document.createTextNode(pedidoscompras.getcodigo_producto().trim()));
		element.appendChild(elementcodigo_producto);
	}
	
	public void generarReporteGroupGenericoPedidosComprassSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PedidosCompras> pedidoscomprassSeleccionados=new ArrayList<PedidosCompras>();
		
		pedidoscomprassSeleccionados=this.getPedidosComprassSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPedidosCompras(pedidoscomprassSeleccionados);
		
		this.generarReportePedidosComprass("Todos",pedidoscomprassSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPedidosCompras(ArrayList<PedidosCompras> pedidoscomprassSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PedidosCompras pedidoscomprasAux:pedidoscomprassSeleccionados) {
				pedidoscomprasAux.setsDetalleGeneralEntityReporte(pedidoscomprasAux.toString());
			
				if(sTipoSeleccionar.equals(PedidosComprasConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					pedidoscomprasAux.setsDescripcionGeneralEntityReporte1(pedidoscomprasAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PedidosComprasConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					pedidoscomprasAux.setsDescripcionGeneralEntityReporte1(pedidoscomprasAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PedidosComprasConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					pedidoscomprasAux.setsDescripcionGeneralEntityReporte1(pedidoscomprasAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PedidosComprasConstantesFunciones.LABEL_IDLINEA)) {
					existe=true;
					pedidoscomprasAux.setsDescripcionGeneralEntityReporte1(pedidoscomprasAux.getlinea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PedidosComprasConstantesFunciones.LABEL_IDLINEAGRUPO)) {
					existe=true;
					pedidoscomprasAux.setsDescripcionGeneralEntityReporte1(pedidoscomprasAux.getlineagrupo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PedidosComprasConstantesFunciones.LABEL_IDLINEACATEGORIA)) {
					existe=true;
					pedidoscomprasAux.setsDescripcionGeneralEntityReporte1(pedidoscomprasAux.getlineacategoria_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PedidosComprasConstantesFunciones.LABEL_IDLINEAMARCA)) {
					existe=true;
					pedidoscomprasAux.setsDescripcionGeneralEntityReporte1(pedidoscomprasAux.getlineamarca_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PedidosComprasConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO)) {
					existe=true;
					pedidoscomprasAux.setsDescripcionGeneralEntityReporte1(pedidoscomprasAux.gettipoproductoservicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PedidosComprasConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
					existe=true;
					pedidoscomprasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(pedidoscomprasAux.getfecha_emision_desde()));
				}
				 else if(sTipoSeleccionar.equals(PedidosComprasConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					pedidoscomprasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(pedidoscomprasAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(PedidosComprasConstantesFunciones.LABEL_SECUENCIAL)) {
					existe=true;
					pedidoscomprasAux.setsDescripcionGeneralEntityReporte1(pedidoscomprasAux.getsecuencial());
				}
				 else if(sTipoSeleccionar.equals(PedidosComprasConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					pedidoscomprasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(pedidoscomprasAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(PedidosComprasConstantesFunciones.LABEL_FECHAENTREGA)) {
					existe=true;
					pedidoscomprasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(pedidoscomprasAux.getfecha_entrega()));
				}
				 else if(sTipoSeleccionar.equals(PedidosComprasConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
					existe=true;
					pedidoscomprasAux.setsDescripcionGeneralEntityReporte1(pedidoscomprasAux.getnombre_producto());
				}
				 else if(sTipoSeleccionar.equals(PedidosComprasConstantesFunciones.LABEL_NOMBREUNIDAD)) {
					existe=true;
					pedidoscomprasAux.setsDescripcionGeneralEntityReporte1(pedidoscomprasAux.getnombre_unidad());
				}
				 else if(sTipoSeleccionar.equals(PedidosComprasConstantesFunciones.LABEL_CANTIDADPEDIDO)) {
					existe=true;
					pedidoscomprasAux.setsDescripcionGeneralEntityReporte1(pedidoscomprasAux.getcantidad_pedido().toString());
				}
				 else if(sTipoSeleccionar.equals(PedidosComprasConstantesFunciones.LABEL_CANTIDADENTREGADA)) {
					existe=true;
					pedidoscomprasAux.setsDescripcionGeneralEntityReporte1(pedidoscomprasAux.getcantidad_entregada().toString());
				}
				 else if(sTipoSeleccionar.equals(PedidosComprasConstantesFunciones.LABEL_CANTIDADPENDIENTE)) {
					existe=true;
					pedidoscomprasAux.setsDescripcionGeneralEntityReporte1(pedidoscomprasAux.getcantidad_pendiente().toString());
				}
				 else if(sTipoSeleccionar.equals(PedidosComprasConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
					existe=true;
					pedidoscomprasAux.setsDescripcionGeneralEntityReporte1(pedidoscomprasAux.getcodigo_producto());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPedidosCompras(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPedidosCompras=true;
				this.isVisibilidadCeldaNuevoRelacionesPedidosCompras=true;
				this.isVisibilidadCeldaGuardarCambiosPedidosCompras=true;
			}
			
			this.isVisibilidadCeldaModificarPedidosCompras=false;
			this.isVisibilidadCeldaActualizarPedidosCompras=false;
			this.isVisibilidadCeldaEliminarPedidosCompras=false;
			this.isVisibilidadCeldaCancelarPedidosCompras=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPedidosCompras=true;
				} else {
					this.isVisibilidadCeldaGuardarPedidosCompras=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPedidosCompras=false;
			this.isVisibilidadCeldaNuevoRelacionesPedidosCompras=false;
			this.isVisibilidadCeldaGuardarCambiosPedidosCompras=false;
			this.isVisibilidadCeldaModificarPedidosCompras=false;
			this.isVisibilidadCeldaActualizarPedidosCompras=true;
			this.isVisibilidadCeldaEliminarPedidosCompras=false;
			this.isVisibilidadCeldaCancelarPedidosCompras=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPedidosCompras=true;
				} else {
					this.isVisibilidadCeldaGuardarPedidosCompras=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPedidosCompras=false;
			this.isVisibilidadCeldaNuevoRelacionesPedidosCompras=false;
			this.isVisibilidadCeldaGuardarCambiosPedidosCompras=false;
			this.isVisibilidadCeldaModificarPedidosCompras=false;
			this.isVisibilidadCeldaActualizarPedidosCompras=true;
			this.isVisibilidadCeldaEliminarPedidosCompras=true;
			this.isVisibilidadCeldaCancelarPedidosCompras=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPedidosCompras=true;
				} else {
					this.isVisibilidadCeldaGuardarPedidosCompras=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPedidosCompras=false;
			this.isVisibilidadCeldaNuevoRelacionesPedidosCompras=false;
			this.isVisibilidadCeldaGuardarCambiosPedidosCompras=false;
			this.isVisibilidadCeldaModificarPedidosCompras=false;
			this.isVisibilidadCeldaActualizarPedidosCompras=true;
			this.isVisibilidadCeldaEliminarPedidosCompras=false;
			this.isVisibilidadCeldaCancelarPedidosCompras=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPedidosCompras=false;
				} else {
					this.isVisibilidadCeldaGuardarPedidosCompras=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPedidosCompras=true;
			this.isVisibilidadCeldaNuevoRelacionesPedidosCompras=true;
			this.isVisibilidadCeldaGuardarCambiosPedidosCompras=true;
			this.isVisibilidadCeldaModificarPedidosCompras=false;
			this.isVisibilidadCeldaActualizarPedidosCompras=false;
			this.isVisibilidadCeldaEliminarPedidosCompras=false;
			this.isVisibilidadCeldaCancelarPedidosCompras=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPedidosCompras=true;
				} else {
					this.isVisibilidadCeldaGuardarPedidosCompras=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPedidosCompras=false;
			this.isVisibilidadCeldaNuevoRelacionesPedidosCompras=false;
			this.isVisibilidadCeldaGuardarCambiosPedidosCompras=false;
			this.isVisibilidadCeldaActualizarPedidosCompras=false;
			this.isVisibilidadCeldaEliminarPedidosCompras=false;
			this.isVisibilidadCeldaCancelarPedidosCompras=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPedidosCompras=false;
				} else {
					this.isVisibilidadCeldaGuardarPedidosCompras=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPedidosCompras=false;
			this.isVisibilidadCeldaNuevoRelacionesPedidosCompras=false;
			this.isVisibilidadCeldaGuardarCambiosPedidosCompras=false;
			this.isVisibilidadCeldaModificarPedidosCompras=true;
			this.isVisibilidadCeldaActualizarPedidosCompras=false;
			this.isVisibilidadCeldaEliminarPedidosCompras=false;
			this.isVisibilidadCeldaCancelarPedidosCompras=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPedidosCompras=false;
				} else {
					this.isVisibilidadCeldaGuardarPedidosCompras=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PedidosComprasJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPedidosCompras=true;
			this.isVisibilidadCeldaNuevoRelacionesPedidosCompras=true;
			this.isVisibilidadCeldaGuardarCambiosPedidosCompras=true;
		} else {
			this.actualizarEstadoPanelsPedidosCompras(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPedidosCompras=false;
			//this.isVisibilidadCeldaVerFormPedidosCompras=false;
			this.isVisibilidadCeldaDuplicarPedidosCompras=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!pedidoscomprasSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPedidosCompras=false;
		} else {
			this.isVisibilidadCeldaNuevoPedidosCompras=false;
			this.isVisibilidadCeldaGuardarCambiosPedidosCompras=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(pedidoscomprasSessionBean.getEsGuardarRelacionado()) {
			if(!pedidoscomprasSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPedidosCompras=false;												
			}
			
			this.jButtonCerrarPedidosCompras.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPedidosCompras=false;
		}
		
		if(!this.permiteMantenimiento(this.pedidoscompras)) {
			this.isVisibilidadCeldaActualizarPedidosCompras=false;
			this.isVisibilidadCeldaEliminarPedidosCompras=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoPedidosCompras=false;
		this.isVisibilidadCeldaNuevoRelacionesPedidosCompras=false;
		this.isVisibilidadCeldaGuardarCambiosPedidosCompras=false;
		//this.isVisibilidadCeldaModificarPedidosCompras=true;
		this.isVisibilidadCeldaActualizarPedidosCompras=false;
		this.isVisibilidadCeldaEliminarPedidosCompras=false;
		//this.isVisibilidadCeldaCancelarPedidosCompras=true;			
		this.isVisibilidadCeldaGuardarPedidosCompras=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPedidosCompras() {
	}
	
	public void actualizarEstadoPanelsPedidosCompras(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPedidosCompras!=null) {
				this.jScrollPanelDatosEdicionPedidosCompras.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPedidosCompras!=null) {
				this.jTabbedPaneBusquedasPedidosCompras.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPedidosCompras!=null) {
				this.jScrollPanelDatosPedidosCompras.setVisible(true);
			}
			
			if(this.jPanelPaginacionPedidosCompras!=null) {
				this.jPanelPaginacionPedidosCompras.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPedidosCompras!=null) {
				this.jPanelParametrosReportesPedidosCompras.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPedidosCompras!=null) {
				this.jScrollPanelDatosEdicionPedidosCompras.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPedidosCompras!=null) {
				this.jTabbedPaneBusquedasPedidosCompras.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPedidosCompras!=null) {
				this.jScrollPanelDatosPedidosCompras.setVisible(false);
			}
			
			if(this.jPanelPaginacionPedidosCompras!=null) {
				this.jPanelPaginacionPedidosCompras.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPedidosCompras!=null) {
				this.jPanelParametrosReportesPedidosCompras.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPedidosCompras!=null) {
				this.jScrollPanelDatosEdicionPedidosCompras.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPedidosCompras!=null) {
				this.jTabbedPaneBusquedasPedidosCompras.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPedidosCompras!=null) {
				this.jScrollPanelDatosPedidosCompras.setVisible(false);
			}
			
			if(this.jPanelPaginacionPedidosCompras!=null) {
				this.jPanelPaginacionPedidosCompras.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPedidosCompras!=null) {
				this.jPanelParametrosReportesPedidosCompras.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPedidosCompras!=null) {
				this.jScrollPanelDatosEdicionPedidosCompras.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPedidosCompras!=null) {
				this.jTabbedPaneBusquedasPedidosCompras.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPedidosCompras!=null) {
				this.jScrollPanelDatosPedidosCompras.setVisible(false);
			}
			
			if(this.jPanelPaginacionPedidosCompras!=null) {
				this.jPanelPaginacionPedidosCompras.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPedidosCompras!=null) {
				this.jPanelParametrosReportesPedidosCompras.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPedidosCompras!=null) {
				this.jScrollPanelDatosEdicionPedidosCompras.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPedidosCompras!=null) {
				this.jTabbedPaneBusquedasPedidosCompras.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPedidosCompras!=null) {
				this.jScrollPanelDatosPedidosCompras.setVisible(true);
			}
			
			if(this.jPanelPaginacionPedidosCompras!=null) {
				this.jPanelPaginacionPedidosCompras.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPedidosCompras!=null) {
				this.jPanelParametrosReportesPedidosCompras.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPedidosCompras!=null) {
				this.jScrollPanelDatosEdicionPedidosCompras.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPedidosCompras!=null) {
				this.jTabbedPaneBusquedasPedidosCompras.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPedidosCompras!=null) {
				this.jScrollPanelDatosPedidosCompras.setVisible(true);
			}
			
			if(this.jPanelPaginacionPedidosCompras!=null) {
				this.jPanelPaginacionPedidosCompras.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPedidosCompras!=null) {
				this.jPanelParametrosReportesPedidosCompras.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPedidosCompras!=null) {
				this.jScrollPanelDatosEdicionPedidosCompras.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPedidosCompras!=null) {
				this.jTabbedPaneBusquedasPedidosCompras.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPedidosCompras!=null) {
				this.jScrollPanelDatosPedidosCompras.setVisible(true);
			}
			
			if(this.jPanelPaginacionPedidosCompras!=null) {
				this.jPanelPaginacionPedidosCompras.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPedidosCompras!=null) {
				this.jPanelParametrosReportesPedidosCompras.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.pedidoscomprasSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPedidosCompras!=null) {
					this.jTabbedPaneBusquedasPedidosCompras.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPedidosCompras!=null) {
				this.jPanelParametrosReportesPedidosCompras.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.pedidoscomprasSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPedidosCompras!=null) {
				this.jTabbedPaneBusquedasPedidosCompras.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPedidosCompras!=null) {
				this.jPanelParametrosReportesPedidosCompras.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPedidosCompras=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPedidosCompras) {this.jTabbedPaneBusquedasPedidosCompras.remove(jPanelBusquedaPedidosComprasPedidosCompras);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaPedidosCompras=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPedidosCompras) {this.jTabbedPaneBusquedasPedidosCompras.remove(jPanelBusquedaPedidosComprasPedidosCompras);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadBusquedaPedidosCompras=isParaProducto;
			if(!this.isVisibilidadBusquedaPedidosCompras) {this.jTabbedPaneBusquedasPedidosCompras.remove(jPanelBusquedaPedidosComprasPedidosCompras);}
		}
		
	}

	public void setVisibilidadBusquedasParaLinea(Boolean isParaLinea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaNegation=!isParaLinea;

			this.isVisibilidadBusquedaPedidosCompras=isParaLinea;
			if(!this.isVisibilidadBusquedaPedidosCompras) {this.jTabbedPaneBusquedasPedidosCompras.remove(jPanelBusquedaPedidosComprasPedidosCompras);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaGrupo(Boolean isParaLineaGrupo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaGrupoNegation=!isParaLineaGrupo;

			this.isVisibilidadBusquedaPedidosCompras=isParaLineaGrupo;
			if(!this.isVisibilidadBusquedaPedidosCompras) {this.jTabbedPaneBusquedasPedidosCompras.remove(jPanelBusquedaPedidosComprasPedidosCompras);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaCategoria(Boolean isParaLineaCategoria){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaCategoriaNegation=!isParaLineaCategoria;

			this.isVisibilidadBusquedaPedidosCompras=isParaLineaCategoria;
			if(!this.isVisibilidadBusquedaPedidosCompras) {this.jTabbedPaneBusquedasPedidosCompras.remove(jPanelBusquedaPedidosComprasPedidosCompras);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaMarca(Boolean isParaLineaMarca){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaMarcaNegation=!isParaLineaMarca;

			this.isVisibilidadBusquedaPedidosCompras=isParaLineaMarca;
			if(!this.isVisibilidadBusquedaPedidosCompras) {this.jTabbedPaneBusquedasPedidosCompras.remove(jPanelBusquedaPedidosComprasPedidosCompras);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoProductoServicio(Boolean isParaTipoProductoServicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoProductoServicioNegation=!isParaTipoProductoServicio;

			this.isVisibilidadBusquedaPedidosCompras=isParaTipoProductoServicio;
			if(!this.isVisibilidadBusquedaPedidosCompras) {this.jTabbedPaneBusquedasPedidosCompras.remove(jPanelBusquedaPedidosComprasPedidosCompras);}
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
			
			this.inicializarActualizarBindingTablaPedidosCompras(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPedidosCompras() {
		this.updateBorderResaltarBusquedasFormularioPedidosCompras();
		this.updateVisibilidadBusquedasFormularioPedidosCompras();
		this.updateHabilitarBusquedasFormularioPedidosCompras();
	}
	
	public void updateBorderResaltarBusquedasFormularioPedidosCompras() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPedidosCompras.getComponents().length>0) {
	

		if(this.pedidoscomprasConstantesFunciones.resaltarBusquedaPedidosComprasPedidosCompras!=null) {
			index= this.jTabbedPaneBusquedasPedidosCompras.indexOfComponent(this.jPanelBusquedaPedidosComprasPedidosCompras);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPedidosCompras.getComponent(index);
				jPanel.setBorder(this.pedidoscomprasConstantesFunciones.resaltarBusquedaPedidosComprasPedidosCompras);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPedidosCompras() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPedidosCompras.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPedidosCompras.indexOfComponent(this.jPanelBusquedaPedidosComprasPedidosCompras);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPedidosCompras.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.pedidoscomprasConstantesFunciones.mostrarBusquedaPedidosComprasPedidosCompras);
			if(!this.pedidoscomprasConstantesFunciones.mostrarBusquedaPedidosComprasPedidosCompras && index>-1) {
				this.jTabbedPaneBusquedasPedidosCompras.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPedidosCompras() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPedidosCompras.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPedidosCompras.indexOfComponent(this.jPanelBusquedaPedidosComprasPedidosCompras);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPedidosCompras.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.pedidoscomprasConstantesFunciones.activarBusquedaPedidosComprasPedidosCompras);
				this.jTabbedPaneBusquedasPedidosCompras.setEnabledAt(index,this.pedidoscomprasConstantesFunciones.activarBusquedaPedidosComprasPedidosCompras);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPedidosCompras(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPedidosCompras")) {
			index= this.jTabbedPaneBusquedasPedidosCompras.indexOfComponent(this.jPanelBusquedaPedidosComprasPedidosCompras);

			this.jTabbedPaneBusquedasPedidosCompras.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPedidosCompras.getComponent(index);

			this.pedidoscomprasConstantesFunciones.setResaltarBusquedaPedidosComprasPedidosCompras(resaltar);

			jPanel.setBorder(this.pedidoscomprasConstantesFunciones.resaltarBusquedaPedidosComprasPedidosCompras);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPedidosCompras.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPedidosCompras() throws Exception {

		if(this.jInternalFrameDetalleFormPedidosCompras==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPedidosCompras();
		this.updateVisibilidadResaltarControlesFormularioPedidosCompras();
		this.updateHabilitarResaltarControlesFormularioPedidosCompras();
		
	}
	
	public void updateBorderResaltarControlesFormularioPedidosCompras() throws Exception {
		if(this.jInternalFrameDetalleFormPedidosCompras==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.pedidoscomprasConstantesFunciones.resaltaridPedidosCompras!=null && this.jInternalFrameDetalleFormPedidosCompras!=null) {this.jInternalFrameDetalleFormPedidosCompras.jLabelidPedidosCompras.setBorder(this.pedidoscomprasConstantesFunciones.resaltaridPedidosCompras);}
		if(this.pedidoscomprasConstantesFunciones.resaltarid_empresaPedidosCompras!=null && this.jInternalFrameDetalleFormPedidosCompras!=null) {this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_empresaPedidosCompras.setBorder(this.pedidoscomprasConstantesFunciones.resaltarid_empresaPedidosCompras);}
		if(this.pedidoscomprasConstantesFunciones.resaltarid_sucursalPedidosCompras!=null && this.jInternalFrameDetalleFormPedidosCompras!=null) {this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_sucursalPedidosCompras.setBorder(this.pedidoscomprasConstantesFunciones.resaltarid_sucursalPedidosCompras);}
		if(this.pedidoscomprasConstantesFunciones.resaltarid_productoPedidosCompras!=null && this.jInternalFrameDetalleFormPedidosCompras!=null) {this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_productoPedidosCompras.setBorder(this.pedidoscomprasConstantesFunciones.resaltarid_productoPedidosCompras);}
		if(this.pedidoscomprasConstantesFunciones.resaltarid_lineaPedidosCompras!=null && this.jInternalFrameDetalleFormPedidosCompras!=null) {this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_lineaPedidosCompras.setBorder(this.pedidoscomprasConstantesFunciones.resaltarid_lineaPedidosCompras);}
		if(this.pedidoscomprasConstantesFunciones.resaltarid_linea_grupoPedidosCompras!=null && this.jInternalFrameDetalleFormPedidosCompras!=null) {this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_grupoPedidosCompras.setBorder(this.pedidoscomprasConstantesFunciones.resaltarid_linea_grupoPedidosCompras);}
		if(this.pedidoscomprasConstantesFunciones.resaltarid_linea_categoriaPedidosCompras!=null && this.jInternalFrameDetalleFormPedidosCompras!=null) {this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_categoriaPedidosCompras.setBorder(this.pedidoscomprasConstantesFunciones.resaltarid_linea_categoriaPedidosCompras);}
		if(this.pedidoscomprasConstantesFunciones.resaltarid_linea_marcaPedidosCompras!=null && this.jInternalFrameDetalleFormPedidosCompras!=null) {this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_marcaPedidosCompras.setBorder(this.pedidoscomprasConstantesFunciones.resaltarid_linea_marcaPedidosCompras);}
		if(this.pedidoscomprasConstantesFunciones.resaltarid_tipo_producto_servicioPedidosCompras!=null && this.jInternalFrameDetalleFormPedidosCompras!=null) {this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_tipo_producto_servicioPedidosCompras.setBorder(this.pedidoscomprasConstantesFunciones.resaltarid_tipo_producto_servicioPedidosCompras);}
		if(this.pedidoscomprasConstantesFunciones.resaltarfecha_emision_desdePedidosCompras!=null && this.jInternalFrameDetalleFormPedidosCompras!=null) {this.jInternalFrameDetalleFormPedidosCompras.jDateChooserfecha_emision_desdePedidosCompras.setBorder(this.pedidoscomprasConstantesFunciones.resaltarfecha_emision_desdePedidosCompras);}
		if(this.pedidoscomprasConstantesFunciones.resaltarfecha_emision_hastaPedidosCompras!=null && this.jInternalFrameDetalleFormPedidosCompras!=null) {this.jInternalFrameDetalleFormPedidosCompras.jDateChooserfecha_emision_hastaPedidosCompras.setBorder(this.pedidoscomprasConstantesFunciones.resaltarfecha_emision_hastaPedidosCompras);}
		if(this.pedidoscomprasConstantesFunciones.resaltarsecuencialPedidosCompras!=null && this.jInternalFrameDetalleFormPedidosCompras!=null) {this.jInternalFrameDetalleFormPedidosCompras.jTextFieldsecuencialPedidosCompras.setBorder(this.pedidoscomprasConstantesFunciones.resaltarsecuencialPedidosCompras);}
		if(this.pedidoscomprasConstantesFunciones.resaltarfecha_emisionPedidosCompras!=null && this.jInternalFrameDetalleFormPedidosCompras!=null) {this.jInternalFrameDetalleFormPedidosCompras.jDateChooserfecha_emisionPedidosCompras.setBorder(this.pedidoscomprasConstantesFunciones.resaltarfecha_emisionPedidosCompras);}
		if(this.pedidoscomprasConstantesFunciones.resaltarfecha_entregaPedidosCompras!=null && this.jInternalFrameDetalleFormPedidosCompras!=null) {this.jInternalFrameDetalleFormPedidosCompras.jDateChooserfecha_entregaPedidosCompras.setBorder(this.pedidoscomprasConstantesFunciones.resaltarfecha_entregaPedidosCompras);}
		if(this.pedidoscomprasConstantesFunciones.resaltarnombre_productoPedidosCompras!=null && this.jInternalFrameDetalleFormPedidosCompras!=null) {this.jInternalFrameDetalleFormPedidosCompras.jTextAreanombre_productoPedidosCompras.setBorder(this.pedidoscomprasConstantesFunciones.resaltarnombre_productoPedidosCompras);}
		if(this.pedidoscomprasConstantesFunciones.resaltarnombre_unidadPedidosCompras!=null && this.jInternalFrameDetalleFormPedidosCompras!=null) {this.jInternalFrameDetalleFormPedidosCompras.jTextFieldnombre_unidadPedidosCompras.setBorder(this.pedidoscomprasConstantesFunciones.resaltarnombre_unidadPedidosCompras);}
		if(this.pedidoscomprasConstantesFunciones.resaltarcantidad_pedidoPedidosCompras!=null && this.jInternalFrameDetalleFormPedidosCompras!=null) {this.jInternalFrameDetalleFormPedidosCompras.jTextFieldcantidad_pedidoPedidosCompras.setBorder(this.pedidoscomprasConstantesFunciones.resaltarcantidad_pedidoPedidosCompras);}
		if(this.pedidoscomprasConstantesFunciones.resaltarcantidad_entregadaPedidosCompras!=null && this.jInternalFrameDetalleFormPedidosCompras!=null) {this.jInternalFrameDetalleFormPedidosCompras.jTextFieldcantidad_entregadaPedidosCompras.setBorder(this.pedidoscomprasConstantesFunciones.resaltarcantidad_entregadaPedidosCompras);}
		if(this.pedidoscomprasConstantesFunciones.resaltarcantidad_pendientePedidosCompras!=null && this.jInternalFrameDetalleFormPedidosCompras!=null) {this.jInternalFrameDetalleFormPedidosCompras.jTextFieldcantidad_pendientePedidosCompras.setBorder(this.pedidoscomprasConstantesFunciones.resaltarcantidad_pendientePedidosCompras);}
		if(this.pedidoscomprasConstantesFunciones.resaltarcodigo_productoPedidosCompras!=null && this.jInternalFrameDetalleFormPedidosCompras!=null) {this.jInternalFrameDetalleFormPedidosCompras.jTextFieldcodigo_productoPedidosCompras.setBorder(this.pedidoscomprasConstantesFunciones.resaltarcodigo_productoPedidosCompras);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPedidosCompras() throws Exception {		
		if(this.jInternalFrameDetalleFormPedidosCompras==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
	
		//this.jInternalFrameDetalleFormPedidosCompras.jLabelidPedidosCompras.setVisible(this.pedidoscomprasConstantesFunciones.mostraridPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jPanelidPedidosCompras.setVisible(this.pedidoscomprasConstantesFunciones.mostraridPedidosCompras);
		//this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_empresaPedidosCompras.setVisible(this.pedidoscomprasConstantesFunciones.mostrarid_empresaPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jPanelid_empresaPedidosCompras.setVisible(this.pedidoscomprasConstantesFunciones.mostrarid_empresaPedidosCompras);
		//this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_sucursalPedidosCompras.setVisible(this.pedidoscomprasConstantesFunciones.mostrarid_sucursalPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jPanelid_sucursalPedidosCompras.setVisible(this.pedidoscomprasConstantesFunciones.mostrarid_sucursalPedidosCompras);
		//this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_productoPedidosCompras.setVisible(this.pedidoscomprasConstantesFunciones.mostrarid_productoPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jPanelid_productoPedidosCompras.setVisible(this.pedidoscomprasConstantesFunciones.mostrarid_productoPedidosCompras);
		//this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_lineaPedidosCompras.setVisible(this.pedidoscomprasConstantesFunciones.mostrarid_lineaPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jPanelid_lineaPedidosCompras.setVisible(this.pedidoscomprasConstantesFunciones.mostrarid_lineaPedidosCompras);
		//this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_grupoPedidosCompras.setVisible(this.pedidoscomprasConstantesFunciones.mostrarid_linea_grupoPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jPanelid_linea_grupoPedidosCompras.setVisible(this.pedidoscomprasConstantesFunciones.mostrarid_linea_grupoPedidosCompras);
		//this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_categoriaPedidosCompras.setVisible(this.pedidoscomprasConstantesFunciones.mostrarid_linea_categoriaPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jPanelid_linea_categoriaPedidosCompras.setVisible(this.pedidoscomprasConstantesFunciones.mostrarid_linea_categoriaPedidosCompras);
		//this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_marcaPedidosCompras.setVisible(this.pedidoscomprasConstantesFunciones.mostrarid_linea_marcaPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jPanelid_linea_marcaPedidosCompras.setVisible(this.pedidoscomprasConstantesFunciones.mostrarid_linea_marcaPedidosCompras);
		//this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_tipo_producto_servicioPedidosCompras.setVisible(this.pedidoscomprasConstantesFunciones.mostrarid_tipo_producto_servicioPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jPanelid_tipo_producto_servicioPedidosCompras.setVisible(this.pedidoscomprasConstantesFunciones.mostrarid_tipo_producto_servicioPedidosCompras);
		//this.jInternalFrameDetalleFormPedidosCompras.jDateChooserfecha_emision_desdePedidosCompras.setVisible(this.pedidoscomprasConstantesFunciones.mostrarfecha_emision_desdePedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jPanelfecha_emision_desdePedidosCompras.setVisible(this.pedidoscomprasConstantesFunciones.mostrarfecha_emision_desdePedidosCompras);
		//this.jInternalFrameDetalleFormPedidosCompras.jDateChooserfecha_emision_hastaPedidosCompras.setVisible(this.pedidoscomprasConstantesFunciones.mostrarfecha_emision_hastaPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jPanelfecha_emision_hastaPedidosCompras.setVisible(this.pedidoscomprasConstantesFunciones.mostrarfecha_emision_hastaPedidosCompras);
		//this.jInternalFrameDetalleFormPedidosCompras.jTextFieldsecuencialPedidosCompras.setVisible(this.pedidoscomprasConstantesFunciones.mostrarsecuencialPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jPanelsecuencialPedidosCompras.setVisible(this.pedidoscomprasConstantesFunciones.mostrarsecuencialPedidosCompras);
		//this.jInternalFrameDetalleFormPedidosCompras.jDateChooserfecha_emisionPedidosCompras.setVisible(this.pedidoscomprasConstantesFunciones.mostrarfecha_emisionPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jPanelfecha_emisionPedidosCompras.setVisible(this.pedidoscomprasConstantesFunciones.mostrarfecha_emisionPedidosCompras);
		//this.jInternalFrameDetalleFormPedidosCompras.jDateChooserfecha_entregaPedidosCompras.setVisible(this.pedidoscomprasConstantesFunciones.mostrarfecha_entregaPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jPanelfecha_entregaPedidosCompras.setVisible(this.pedidoscomprasConstantesFunciones.mostrarfecha_entregaPedidosCompras);
		//this.jInternalFrameDetalleFormPedidosCompras.jTextAreanombre_productoPedidosCompras.setVisible(this.pedidoscomprasConstantesFunciones.mostrarnombre_productoPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jPanelnombre_productoPedidosCompras.setVisible(this.pedidoscomprasConstantesFunciones.mostrarnombre_productoPedidosCompras);
		//this.jInternalFrameDetalleFormPedidosCompras.jTextFieldnombre_unidadPedidosCompras.setVisible(this.pedidoscomprasConstantesFunciones.mostrarnombre_unidadPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jPanelnombre_unidadPedidosCompras.setVisible(this.pedidoscomprasConstantesFunciones.mostrarnombre_unidadPedidosCompras);
		//this.jInternalFrameDetalleFormPedidosCompras.jTextFieldcantidad_pedidoPedidosCompras.setVisible(this.pedidoscomprasConstantesFunciones.mostrarcantidad_pedidoPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jPanelcantidad_pedidoPedidosCompras.setVisible(this.pedidoscomprasConstantesFunciones.mostrarcantidad_pedidoPedidosCompras);
		//this.jInternalFrameDetalleFormPedidosCompras.jTextFieldcantidad_entregadaPedidosCompras.setVisible(this.pedidoscomprasConstantesFunciones.mostrarcantidad_entregadaPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jPanelcantidad_entregadaPedidosCompras.setVisible(this.pedidoscomprasConstantesFunciones.mostrarcantidad_entregadaPedidosCompras);
		//this.jInternalFrameDetalleFormPedidosCompras.jTextFieldcantidad_pendientePedidosCompras.setVisible(this.pedidoscomprasConstantesFunciones.mostrarcantidad_pendientePedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jPanelcantidad_pendientePedidosCompras.setVisible(this.pedidoscomprasConstantesFunciones.mostrarcantidad_pendientePedidosCompras);
		//this.jInternalFrameDetalleFormPedidosCompras.jTextFieldcodigo_productoPedidosCompras.setVisible(this.pedidoscomprasConstantesFunciones.mostrarcodigo_productoPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jPanelcodigo_productoPedidosCompras.setVisible(this.pedidoscomprasConstantesFunciones.mostrarcodigo_productoPedidosCompras);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPedidosCompras() throws Exception {
		if(this.jInternalFrameDetalleFormPedidosCompras==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPedidosCompras!=null) {
	
		this.jInternalFrameDetalleFormPedidosCompras.jLabelidPedidosCompras.setEnabled(this.pedidoscomprasConstantesFunciones.activaridPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_empresaPedidosCompras.setEnabled(this.pedidoscomprasConstantesFunciones.activarid_empresaPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_sucursalPedidosCompras.setEnabled(this.pedidoscomprasConstantesFunciones.activarid_sucursalPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_productoPedidosCompras.setEnabled(this.pedidoscomprasConstantesFunciones.activarid_productoPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_lineaPedidosCompras.setEnabled(this.pedidoscomprasConstantesFunciones.activarid_lineaPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_grupoPedidosCompras.setEnabled(this.pedidoscomprasConstantesFunciones.activarid_linea_grupoPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_categoriaPedidosCompras.setEnabled(this.pedidoscomprasConstantesFunciones.activarid_linea_categoriaPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_linea_marcaPedidosCompras.setEnabled(this.pedidoscomprasConstantesFunciones.activarid_linea_marcaPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jComboBoxid_tipo_producto_servicioPedidosCompras.setEnabled(this.pedidoscomprasConstantesFunciones.activarid_tipo_producto_servicioPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jDateChooserfecha_emision_desdePedidosCompras.setEnabled(this.pedidoscomprasConstantesFunciones.activarfecha_emision_desdePedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jDateChooserfecha_emision_hastaPedidosCompras.setEnabled(this.pedidoscomprasConstantesFunciones.activarfecha_emision_hastaPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jTextFieldsecuencialPedidosCompras.setEnabled(this.pedidoscomprasConstantesFunciones.activarsecuencialPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jDateChooserfecha_emisionPedidosCompras.setEnabled(this.pedidoscomprasConstantesFunciones.activarfecha_emisionPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jDateChooserfecha_entregaPedidosCompras.setEnabled(this.pedidoscomprasConstantesFunciones.activarfecha_entregaPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jTextAreanombre_productoPedidosCompras.setEnabled(this.pedidoscomprasConstantesFunciones.activarnombre_productoPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jTextFieldnombre_unidadPedidosCompras.setEnabled(this.pedidoscomprasConstantesFunciones.activarnombre_unidadPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jTextFieldcantidad_pedidoPedidosCompras.setEnabled(this.pedidoscomprasConstantesFunciones.activarcantidad_pedidoPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jTextFieldcantidad_entregadaPedidosCompras.setEnabled(this.pedidoscomprasConstantesFunciones.activarcantidad_entregadaPedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jTextFieldcantidad_pendientePedidosCompras.setEnabled(this.pedidoscomprasConstantesFunciones.activarcantidad_pendientePedidosCompras);
		this.jInternalFrameDetalleFormPedidosCompras.jTextFieldcodigo_productoPedidosCompras.setEnabled(this.pedidoscomprasConstantesFunciones.activarcodigo_productoPedidosCompras);
		}
	}
	
		
}