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

import com.bydan.erp.inventario.util.CompoKitConstantesFunciones;
import com.bydan.erp.inventario.util.CompoKitParameterReturnGeneral;
//import com.bydan.erp.inventario.util.CompoKitParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.CompoKitBean;
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
public class CompoKitBeanSwingJInternalFrame extends CompoKitJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CompoKitBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CompoKit> compokitValidator = new ClassValidator<CompoKit>(CompoKit.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CompoKit compokit;	
	public CompoKit compokitAux;
	public CompoKit compokitAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CompoKit compokitTotales;
	public Long idCompoKitActual;
	public Long iIdNuevoCompoKit=0L;
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

	public String sFinalQueryComboKit="";

	public List<Kit> kitsForeignKey;

	public List<Kit> getkitsForeignKey() {
		return kitsForeignKey;
	}

	public void setkitsForeignKey(List<Kit> kitsForeignKey) {
		this.kitsForeignKey = kitsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Kit kitForeignKey;

	public Kit getkitForeignKey() {
		return kitForeignKey;
	}

	public void setkitForeignKey(Kit kitForeignKey) {
		this.kitForeignKey = kitForeignKey;
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
	
	public Boolean isPermisoTodoCompoKit;
	public Boolean isPermisoNuevoCompoKit;
	public Boolean isPermisoActualizarCompoKit;
	public Boolean isPermisoActualizarOriginalCompoKit;
	public Boolean isPermisoEliminarCompoKit;
	public Boolean isPermisoGuardarCambiosCompoKit;
	public Boolean isPermisoConsultaCompoKit;
	public Boolean isPermisoBusquedaCompoKit;
	public Boolean isPermisoReporteCompoKit;
	public Boolean isPermisoPaginacionMedioCompoKit;
	public Boolean isPermisoPaginacionAltoCompoKit;
	public Boolean isPermisoPaginacionTodoCompoKit;
	public Boolean isPermisoCopiarCompoKit;
	public Boolean isPermisoVerFormCompoKit;
	public Boolean isPermisoDuplicarCompoKit;
	public Boolean isPermisoOrdenCompoKit;
	
	
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
	
	public CompoKitParameterReturnGeneral compokitReturnGeneral;
	public CompoKitParameterReturnGeneral compokitParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCompoKit=false;
	public Boolean esParaAccionDesdeFormularioCompoKit=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CompoKitSessionBeanAdditional compokitSessionBeanAdditional=null;
	
	public CompoKitSessionBeanAdditional getCompoKitSessionBeanAdditional() {
		return this.compokitSessionBeanAdditional;
	}
	
	public void setCompoKitSessionBeanAdditional(CompoKitSessionBeanAdditional compokitSessionBeanAdditional) {
		try {
			this.compokitSessionBeanAdditional=compokitSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CompoKitBeanSwingJInternalFrameAdditional compokitBeanSwingJInternalFrameAdditional=null;
	//public class CompoKitBeanSwingJInternalFrame
	
	public CompoKitBeanSwingJInternalFrameAdditional getCompoKitBeanSwingJInternalFrameAdditional() {
		return this.compokitBeanSwingJInternalFrameAdditional;
	}
	
	public void setCompoKitBeanSwingJInternalFrameAdditional(CompoKitBeanSwingJInternalFrameAdditional compokitBeanSwingJInternalFrameAdditional) {
		try {
			this.compokitBeanSwingJInternalFrameAdditional=compokitBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CompoKitLogic compokitLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CompoKit compokitBean;
	public CompoKitConstantesFunciones compokitConstantesFunciones;
	//public CompoKitParameterReturnGeneral compokitReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public BodegaLogic bodegaLogic;
	public ProductoLogic productoLogic;
	public KitLogic kitLogic;
	public UnidadLogic unidadLogic;
	
	//PARAMETROS
	
	
	//public List<CompoKit> compokits;	
	//public List<CompoKit> compokitsEliminados;
	//public List<CompoKit> compokitsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCompoKit=false;
	public Boolean isVisibilidadCeldaDuplicarCompoKit=true;
	public Boolean isVisibilidadCeldaCopiarCompoKit=true;
	public Boolean isVisibilidadCeldaVerFormCompoKit=true;
	public Boolean isVisibilidadCeldaOrdenCompoKit=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCompoKit=false;
	public Boolean isVisibilidadCeldaModificarCompoKit=false;
	public Boolean isVisibilidadCeldaActualizarCompoKit=false;
	public Boolean isVisibilidadCeldaEliminarCompoKit=false;
	public Boolean isVisibilidadCeldaCancelarCompoKit=false;
	public Boolean isVisibilidadCeldaGuardarCompoKit=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCompoKit=false;	
	
	
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdKit=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdUnidad=false;
	
	public Long getiIdNuevoCompoKit() {
		return this.iIdNuevoCompoKit;
	}

	public void setiIdNuevoCompoKit(Long iIdNuevoCompoKit) {
		this.iIdNuevoCompoKit = iIdNuevoCompoKit;
	}
	
	public Long getidCompoKitActual() {
		return this.idCompoKitActual;
	}

	public void setidCompoKitActual(Long idCompoKitActual) {
		this.idCompoKitActual = idCompoKitActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CompoKit getcompokit() {
		return this.compokit;
	}

	public void setcompokit(CompoKit compokit) {
		this.compokit = compokit;
	}
	
	public CompoKit getcompokitAux() {
		return this.compokitAux;
	}

	public void setcompokitAux(CompoKit compokitAux) {
		this.compokitAux = compokitAux;
	}				
	
	public CompoKit getcompokitAnterior() {
		return this.compokitAnterior;
	}

	public void setcompokitAnterior(CompoKit compokitAnterior) {
		this.compokitAnterior = compokitAnterior;
	}	
	
	public CompoKit getcompokitTotales() {
		return this.compokitTotales;
	}

	public void setcompokitTotales(CompoKit compokitTotales) {
		this.compokitTotales = compokitTotales;
	}	
	
	public CompoKit getcompokitBean() {
		return this.compokitBean;
	}

	public void setcompokitBean(CompoKit compokitBean) {
		this.compokitBean = compokitBean;
	}	
	
	public CompoKitParameterReturnGeneral getcompokitReturnGeneral() {
		return this.compokitReturnGeneral;
	}

	public void setcompokitReturnGeneral(CompoKitParameterReturnGeneral compokitReturnGeneral) {
		this.compokitReturnGeneral = compokitReturnGeneral;
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

	public Long id_kitFK_IdKit=-1L;

	public Long getid_kitFK_IdKit() {
		return this.id_kitFK_IdKit;
	}

	public void setid_kitFK_IdKit(Long id_kitFK_IdKit) {
		this.id_kitFK_IdKit = id_kitFK_IdKit;
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

	public Long id_unidadFK_IdUnidad=-1L;

	public Long getid_unidadFK_IdUnidad() {
		return this.id_unidadFK_IdUnidad;
	}

	public void setid_unidadFK_IdUnidad(Long id_unidadFK_IdUnidad) {
		this.id_unidadFK_IdUnidad = id_unidadFK_IdUnidad;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public CompoKitLogic getCompoKitLogic()	{		
		return compokitLogic;
	}

	public void setCompoKitLogic(CompoKitLogic compokitLogic) {
		this.compokitLogic = compokitLogic;
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
	
	public Boolean getIsEsNuevoCompoKit() {
		return isEsNuevoCompoKit;
	}

	public void setIsEsNuevoCompoKit(Boolean isEsNuevoCompoKit) {
		this.isEsNuevoCompoKit = isEsNuevoCompoKit;
	}

	public Boolean getEsParaAccionDesdeFormularioCompoKit() {
		return esParaAccionDesdeFormularioCompoKit;
	}
	
	public void setEsParaAccionDesdeFormularioCompoKit(Boolean esParaAccionDesdeFormularioCompoKit) {
		this.esParaAccionDesdeFormularioCompoKit = esParaAccionDesdeFormularioCompoKit;
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

			if(this.compokitSessionBean==null) {
				this.compokitSessionBean=new CompoKitSessionBean();
			}

			if(!this.compokitSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(compokitSessionBean.getlidEmpresaActual());
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

			if(this.compokitSessionBean==null) {
				this.compokitSessionBean=new CompoKitSessionBean();
			}

			if(!this.compokitSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(compokitSessionBean.getlidSucursalActual());
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

			if(this.compokitSessionBean==null) {
				this.compokitSessionBean=new CompoKitSessionBean();
			}

			if(!this.compokitSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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
					bodegaLogic.getEntityWithConnection(compokitSessionBean.getlidBodegaActual());
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

			if(this.compokitSessionBean==null) {
				this.compokitSessionBean=new CompoKitSessionBean();
			}

			if(!this.compokitSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(compokitSessionBean.getlidProductoActual());
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

	public void cargarCombosKitsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.kitsForeignKey=new ArrayList<Kit>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			KitLogic kitLogic=new KitLogic();

			//kitLogic.getKitDataAccess().setIsForForeingKeyData(true);

			if(this.compokitSessionBean==null) {
				this.compokitSessionBean=new CompoKitSessionBean();
			}

			if(!this.compokitSessionBean.getisBusquedaDesdeForeignKeySesionKit()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//kitLogic.getKitDataAccess().setIsForForeingKeyData(true);

					kitLogic.getTodosKitsWithConnection(sFinalQuery,new Pagination());

					this.kitsForeignKey=kitLogic.getKits();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaKit(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					kitLogic.getEntityWithConnection(compokitSessionBean.getlidKitActual());
					this.kitsForeignKey.add(kitLogic.getKit());
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

			if(this.compokitSessionBean==null) {
				this.compokitSessionBean=new CompoKitSessionBean();
			}

			if(!this.compokitSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
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
					unidadLogic.getEntityWithConnection(compokitSessionBean.getlidUnidadActual());
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

					if(this.compokit!=null) {
						this.compokit.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCompoKit!=null) {
						this.jInternalFrameDetalleFormCompoKit.jComboBoxid_empresaCompoKit.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCompoKit.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCompoKit!=null) {
						if(this.jInternalFrameDetalleFormCompoKit.jComboBoxid_empresaCompoKit.getItemCount()>0) {
							this.jInternalFrameDetalleFormCompoKit.jComboBoxid_empresaCompoKit.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCompoKitGenerico)throws Exception
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
				jComboBoxid_empresaCompoKitGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCompoKitGenerico!=null && jComboBoxid_empresaCompoKitGenerico.getItemCount()>0) {
					jComboBoxid_empresaCompoKitGenerico.setSelectedIndex(0);
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

					if(this.compokit!=null) {
						this.compokit.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormCompoKit!=null) {
						this.jInternalFrameDetalleFormCompoKit.jComboBoxid_sucursalCompoKit.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalCompoKit.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormCompoKit!=null) {
						if(this.jInternalFrameDetalleFormCompoKit.jComboBoxid_sucursalCompoKit.getItemCount()>0) {
							this.jInternalFrameDetalleFormCompoKit.jComboBoxid_sucursalCompoKit.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalCompoKitGenerico)throws Exception
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
				jComboBoxid_sucursalCompoKitGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalCompoKitGenerico!=null && jComboBoxid_sucursalCompoKitGenerico.getItemCount()>0) {
					jComboBoxid_sucursalCompoKitGenerico.setSelectedIndex(0);
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

					if(this.compokit!=null) {
						this.compokit.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormCompoKit!=null) {
						this.jInternalFrameDetalleFormCompoKit.jComboBoxid_bodegaCompoKit.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaCompoKit.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormCompoKit!=null) {
						if(this.jInternalFrameDetalleFormCompoKit.jComboBoxid_bodegaCompoKit.getItemCount()>0) {
							this.jInternalFrameDetalleFormCompoKit.jComboBoxid_bodegaCompoKit.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaFK_IdBodegaCompoKit!=null) {
						jComboBoxid_bodegaFK_IdBodegaCompoKit.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaFK_IdBodegaCompoKit!=null) {
							//jComboBoxid_bodegaFK_IdBodegaCompoKit.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaFK_IdBodegaCompoKit.getItemCount()>0) {
								jComboBoxid_bodegaFK_IdBodegaCompoKit.setSelectedIndex(0);
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
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaCompoKitGenerico)throws Exception
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
				jComboBoxid_bodegaCompoKitGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaCompoKitGenerico!=null && jComboBoxid_bodegaCompoKitGenerico.getItemCount()>0) {
					jComboBoxid_bodegaCompoKitGenerico.setSelectedIndex(0);
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

					if(this.compokit!=null) {
						this.compokit.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormCompoKit!=null) {
						this.jInternalFrameDetalleFormCompoKit.jComboBoxid_productoCompoKit.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoCompoKit.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormCompoKit!=null) {
						if(this.jInternalFrameDetalleFormCompoKit.jComboBoxid_productoCompoKit.getItemCount()>0) {
							this.jInternalFrameDetalleFormCompoKit.jComboBoxid_productoCompoKit.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoFK_IdProductoCompoKit!=null) {
						jComboBoxid_productoFK_IdProductoCompoKit.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoFK_IdProductoCompoKit!=null) {
							//jComboBoxid_productoFK_IdProductoCompoKit.setSelectedItem(productoTemp);
							if(jComboBoxid_productoFK_IdProductoCompoKit.getItemCount()>0) {
								jComboBoxid_productoFK_IdProductoCompoKit.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoCompoKitGenerico)throws Exception
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
				jComboBoxid_productoCompoKitGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoCompoKitGenerico!=null && jComboBoxid_productoCompoKitGenerico.getItemCount()>0) {
					jComboBoxid_productoCompoKitGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualKitForeignKey(Long idKitSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Kit  kitTemp=null;

			for(Kit kitAux:kitsForeignKey) {
				if(kitAux.getId()!=null && kitAux.getId().equals(idKitSeleccionado)) {
					kitTemp=kitAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(kitTemp!=null) {

					if(this.compokit!=null) {
						this.compokit.setKit(kitTemp);
					}

					if(this.jInternalFrameDetalleFormCompoKit!=null) {
						this.jInternalFrameDetalleFormCompoKit.jComboBoxid_kitCompoKit.setSelectedItem(kitTemp);
					}
				} else {
					//jComboBoxid_kitCompoKit.setSelectedItem(kitTemp);
					if(this.jInternalFrameDetalleFormCompoKit!=null) {
						if(this.jInternalFrameDetalleFormCompoKit.jComboBoxid_kitCompoKit.getItemCount()>0) {
							this.jInternalFrameDetalleFormCompoKit.jComboBoxid_kitCompoKit.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdKit") || sFormularioTipoBusqueda.equals("Todos")){
					if(kitTemp!=null && jComboBoxid_kitFK_IdKitCompoKit!=null) {
						jComboBoxid_kitFK_IdKitCompoKit.setSelectedItem(kitTemp);
					} else {
						if(jComboBoxid_kitFK_IdKitCompoKit!=null) {
							//jComboBoxid_kitFK_IdKitCompoKit.setSelectedItem(kitTemp);
							if(jComboBoxid_kitFK_IdKitCompoKit.getItemCount()>0) {
								jComboBoxid_kitFK_IdKitCompoKit.setSelectedIndex(0);
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

	public String getActualKitForeignKeyDescripcion(Long idKitSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Kit  kitTemp=null;

			for(Kit kitAux:kitsForeignKey) {
				if(kitAux.getId()!=null && kitAux.getId().equals(idKitSeleccionado)) {
					kitTemp=kitAux;
					break;
				}
			}


			sDescripcion=KitConstantesFunciones.getKitDescripcion(kitTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualKitForeignKeyGenerico(Long idKitSeleccionado,JComboBox jComboBoxid_kitCompoKitGenerico)throws Exception
	{
		try
		{
			Kit  kitTemp=null;

			for(Kit kitAux:kitsForeignKey) {
				if(kitAux.getId()!=null && kitAux.getId().equals(idKitSeleccionado)) {
					kitTemp=kitAux;
					break;
				}
			}

			if(kitTemp!=null) {
				jComboBoxid_kitCompoKitGenerico.setSelectedItem(kitTemp);
			} else {
				if(jComboBoxid_kitCompoKitGenerico!=null && jComboBoxid_kitCompoKitGenerico.getItemCount()>0) {
					jComboBoxid_kitCompoKitGenerico.setSelectedIndex(0);
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

					if(this.compokit!=null) {
						this.compokit.setUnidad(unidadTemp);
					}

					if(this.jInternalFrameDetalleFormCompoKit!=null) {
						this.jInternalFrameDetalleFormCompoKit.jComboBoxid_unidadCompoKit.setSelectedItem(unidadTemp);
					}
				} else {
					//jComboBoxid_unidadCompoKit.setSelectedItem(unidadTemp);
					if(this.jInternalFrameDetalleFormCompoKit!=null) {
						if(this.jInternalFrameDetalleFormCompoKit.jComboBoxid_unidadCompoKit.getItemCount()>0) {
							this.jInternalFrameDetalleFormCompoKit.jComboBoxid_unidadCompoKit.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){
					if(unidadTemp!=null && jComboBoxid_unidadFK_IdUnidadCompoKit!=null) {
						jComboBoxid_unidadFK_IdUnidadCompoKit.setSelectedItem(unidadTemp);
					} else {
						if(jComboBoxid_unidadFK_IdUnidadCompoKit!=null) {
							//jComboBoxid_unidadFK_IdUnidadCompoKit.setSelectedItem(unidadTemp);
							if(jComboBoxid_unidadFK_IdUnidadCompoKit.getItemCount()>0) {
								jComboBoxid_unidadFK_IdUnidadCompoKit.setSelectedIndex(0);
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
	public void setActualUnidadForeignKeyGenerico(Long idUnidadSeleccionado,JComboBox jComboBoxid_unidadCompoKitGenerico)throws Exception
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
				jComboBoxid_unidadCompoKitGenerico.setSelectedItem(unidadTemp);
			} else {
				if(jComboBoxid_unidadCompoKitGenerico!=null && jComboBoxid_unidadCompoKitGenerico.getItemCount()>0) {
					jComboBoxid_unidadCompoKitGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CompoKit compokit,JComboBox jComboBoxid_empresaCompoKitGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCompoKitGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCompoKit.jComboBoxid_empresaCompoKit.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCompoKitGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				compokit.setid_empresa(empresaAux.getId());
				compokit.setempresa_descripcion(CompoKitConstantesFunciones.getEmpresaDescripcion(empresaAux));
				compokit.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(CompoKit compokit,JComboBox jComboBoxid_sucursalCompoKitGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalCompoKitGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormCompoKit.jComboBoxid_sucursalCompoKit.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalCompoKitGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				compokit.setid_sucursal(sucursalAux.getId());
				compokit.setsucursal_descripcion(CompoKitConstantesFunciones.getSucursalDescripcion(sucursalAux));
				compokit.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(CompoKit compokit,JComboBox jComboBoxid_bodegaCompoKitGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaCompoKitGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormCompoKit.jComboBoxid_bodegaCompoKit.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaCompoKitGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				compokit.setid_bodega(bodegaAux.getId());
				compokit.setbodega_descripcion(CompoKitConstantesFunciones.getBodegaDescripcion(bodegaAux));
				compokit.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(CompoKit compokit,JComboBox jComboBoxid_productoCompoKitGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoCompoKitGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormCompoKit.jComboBoxid_productoCompoKit.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoCompoKitGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				compokit.setid_producto(productoAux.getId());
				compokit.setproducto_descripcion(CompoKitConstantesFunciones.getProductoDescripcion(productoAux));
				compokit.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarKitForeignKey(CompoKit compokit,JComboBox jComboBoxid_kitCompoKitGenerico)throws Exception
	{
		try
		{
			Kit  kitAux=new Kit();

			if(jComboBoxid_kitCompoKitGenerico==null) {
				kitAux=(Kit)this.jInternalFrameDetalleFormCompoKit.jComboBoxid_kitCompoKit.getSelectedItem();
			} else {
				kitAux=(Kit)jComboBoxid_kitCompoKitGenerico.getSelectedItem();
			}

			if(kitAux!=null && kitAux.getId()!=null) {
				compokit.setid_kit(kitAux.getId());
				compokit.setkit_descripcion(CompoKitConstantesFunciones.getKitDescripcion(kitAux));
				compokit.setKit(kitAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUnidadForeignKey(CompoKit compokit,JComboBox jComboBoxid_unidadCompoKitGenerico)throws Exception
	{
		try
		{
			Unidad  unidadAux=new Unidad();

			if(jComboBoxid_unidadCompoKitGenerico==null) {
				unidadAux=(Unidad)this.jInternalFrameDetalleFormCompoKit.jComboBoxid_unidadCompoKit.getSelectedItem();
			} else {
				unidadAux=(Unidad)jComboBoxid_unidadCompoKitGenerico.getSelectedItem();
			}

			if(unidadAux!=null && unidadAux.getId()!=null) {
				compokit.setid_unidad(unidadAux.getId());
				compokit.setunidad_descripcion(CompoKitConstantesFunciones.getUnidadDescripcion(unidadAux));
				compokit.setUnidad(unidadAux);			}
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

					if(!CompoKitJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCompoKit!=null) { 
							this.jInternalFrameDetalleFormCompoKit.jComboBoxid_empresaCompoKit.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCompoKit.jComboBoxid_empresaCompoKit.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCompoKit!=null) { 
					}

					if(!CompoKitJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CompoKitJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCompoKit!=null) { 
							this.jInternalFrameDetalleFormCompoKit.jComboBoxid_sucursalCompoKit.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormCompoKit.jComboBoxid_sucursalCompoKit.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCompoKit!=null) { 
					}

					if(!CompoKitJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CompoKitJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCompoKit!=null) { 
							this.jInternalFrameDetalleFormCompoKit.jComboBoxid_bodegaCompoKit.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormCompoKit.jComboBoxid_bodegaCompoKit.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCompoKit!=null) { 
					}

					if(!CompoKitJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CompoKitJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaCompoKit.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaFK_IdBodegaCompoKit.addItem(bodega);
							}
						}

						if(!CompoKitJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CompoKitJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCompoKit!=null) { 
							this.jInternalFrameDetalleFormCompoKit.jComboBoxid_productoCompoKit.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormCompoKit.jComboBoxid_productoCompoKit.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCompoKit!=null) { 
					}

					if(!CompoKitJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CompoKitJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoFK_IdProductoCompoKit.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoFK_IdProductoCompoKit.addItem(producto);
							}
						}

						if(!CompoKitJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameKitsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingKit=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CompoKitJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCompoKit!=null) { 
							this.jInternalFrameDetalleFormCompoKit.jComboBoxid_kitCompoKit.removeAllItems();

							for(Kit kit:this.kitsForeignKey) {
								this.jInternalFrameDetalleFormCompoKit.jComboBoxid_kitCompoKit.addItem(kit);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCompoKit!=null) { 
					}

					if(!CompoKitJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdKit") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CompoKitJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_kitFK_IdKitCompoKit.removeAllItems();

							for(Kit kit:this.kitsForeignKey) {
								this.jComboBoxid_kitFK_IdKitCompoKit.addItem(kit);
							}
						}

						if(!CompoKitJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CompoKitJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCompoKit!=null) { 
							this.jInternalFrameDetalleFormCompoKit.jComboBoxid_unidadCompoKit.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jInternalFrameDetalleFormCompoKit.jComboBoxid_unidadCompoKit.addItem(unidad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCompoKit!=null) { 
					}

					if(!CompoKitJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CompoKitJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_unidadFK_IdUnidadCompoKit.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jComboBoxid_unidadFK_IdUnidadCompoKit.addItem(unidad);
							}
						}

						if(!CompoKitJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormCompoKit!=null) {
							this.jInternalFrameDetalleFormCompoKit.jComboBoxid_empresaCompoKit.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCompoKit!=null) {
							this.jInternalFrameDetalleFormCompoKit.jComboBoxid_empresaCompoKit.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCompoKit!=null) {
							this.jInternalFrameDetalleFormCompoKit.jComboBoxid_sucursalCompoKit.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormCompoKit!=null) {
							this.jInternalFrameDetalleFormCompoKit.jComboBoxid_sucursalCompoKit.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCompoKit!=null) {
							this.jInternalFrameDetalleFormCompoKit.jComboBoxid_bodegaCompoKit.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormCompoKit!=null) {
							this.jInternalFrameDetalleFormCompoKit.jComboBoxid_bodegaCompoKit.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaFK_IdBodegaCompoKit.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaCompoKit.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCompoKit!=null) {
							this.jInternalFrameDetalleFormCompoKit.jComboBoxid_productoCompoKit.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormCompoKit!=null) {
							this.jInternalFrameDetalleFormCompoKit.jComboBoxid_productoCompoKit.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoFK_IdProductoCompoKit.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoFK_IdProductoCompoKit.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameKitForeignKey(Kit kit,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCompoKit!=null) {
							this.jInternalFrameDetalleFormCompoKit.jComboBoxid_kitCompoKit.setSelectedItem(kit);
						}
					} else {
						if(this.jInternalFrameDetalleFormCompoKit!=null) {
							this.jInternalFrameDetalleFormCompoKit.jComboBoxid_kitCompoKit.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_kitFK_IdKitCompoKit.setSelectedItem(kit);
						} else {
							this.jComboBoxid_kitFK_IdKitCompoKit.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCompoKit!=null) {
							this.jInternalFrameDetalleFormCompoKit.jComboBoxid_unidadCompoKit.setSelectedItem(unidad);
						}
					} else {
						if(this.jInternalFrameDetalleFormCompoKit!=null) {
							this.jInternalFrameDetalleFormCompoKit.jComboBoxid_unidadCompoKit.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_unidadFK_IdUnidadCompoKit.setSelectedItem(unidad);
						} else {
							this.jComboBoxid_unidadFK_IdUnidadCompoKit.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesCompoKit() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			CompoKitConstantesFunciones.refrescarForeignKeysDescripcionesCompoKit(this.compokitLogic.getCompoKits());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			CompoKitConstantesFunciones.refrescarForeignKeysDescripcionesCompoKit(this.compokits);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Bodega.class));
		classes.add(new Classe(Producto.class));
		classes.add(new Classe(Kit.class));
		classes.add(new Classe(Unidad.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//compokitLogic.setCompoKits(this.compokits);
			compokitLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public CompoKitParameterReturnGeneral getCompoKitParameterGeneral() {
		return this.compokitParameterGeneral;
	}
	
	public void setCompoKitParameterGeneral(CompoKitParameterReturnGeneral compokitParameterGeneral) {
		this.compokitParameterGeneral = compokitParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCompoKit() {
		return isPermisoTodoCompoKit;
	}

	public void setIsPermisoTodoCompoKit(Boolean isPermisoTodoCompoKit) {
		this.isPermisoTodoCompoKit = isPermisoTodoCompoKit;
	}

	public Boolean getIsPermisoNuevoCompoKit() {
		return isPermisoNuevoCompoKit;
	}

	public void setIsPermisoNuevoCompoKit(Boolean isPermisoNuevoCompoKit) {
		this.isPermisoNuevoCompoKit = isPermisoNuevoCompoKit;
	}

	public Boolean getIsPermisoActualizarCompoKit() {
		return isPermisoActualizarCompoKit;
	}

	public void setIsPermisoActualizarCompoKit(Boolean isPermisoActualizarCompoKit) {
		this.isPermisoActualizarCompoKit = isPermisoActualizarCompoKit;
	}

	public Boolean getIsPermisoEliminarCompoKit() {
		return isPermisoEliminarCompoKit;
	}

	public void setIsPermisoEliminarCompoKit(Boolean isPermisoEliminarCompoKit) {
		this.isPermisoEliminarCompoKit = isPermisoEliminarCompoKit;
	}

	public Boolean getIsPermisoGuardarCambiosCompoKit() {
		return isPermisoGuardarCambiosCompoKit;
	}

	public void setIsPermisoGuardarCambiosCompoKit(Boolean isPermisoGuardarCambiosCompoKit) {
		this.isPermisoGuardarCambiosCompoKit = isPermisoGuardarCambiosCompoKit;
	}
	
	public Boolean getIsPermisoConsultaCompoKit() {
		return isPermisoConsultaCompoKit;
	}

	public void setIsPermisoConsultaCompoKit(Boolean isPermisoConsultaCompoKit) {
		this.isPermisoConsultaCompoKit = isPermisoConsultaCompoKit;
	}

	public Boolean getIsPermisoBusquedaCompoKit() {
		return isPermisoBusquedaCompoKit;
	}

	public void setIsPermisoBusquedaCompoKit(Boolean isPermisoBusquedaCompoKit) {
		this.isPermisoBusquedaCompoKit = isPermisoBusquedaCompoKit;
	}

	public Boolean getIsPermisoReporteCompoKit() {
		return isPermisoReporteCompoKit;
	}

	public void setIsPermisoReporteCompoKit(Boolean isPermisoReporteCompoKit) {
		this.isPermisoReporteCompoKit = isPermisoReporteCompoKit;
	}
	
	public Boolean getIsPermisoPaginacionMedioCompoKit() {
		return isPermisoPaginacionMedioCompoKit;
	}

	public void setIsPermisoPaginacionMedioCompoKit(Boolean isPermisoPaginacionMedioCompoKit) {
		this.isPermisoPaginacionMedioCompoKit = isPermisoPaginacionMedioCompoKit;
	}
	
	public Boolean getIsPermisoPaginacionTodoCompoKit() {
		return isPermisoPaginacionTodoCompoKit;
	}

	public void setIsPermisoPaginacionTodoCompoKit(Boolean isPermisoPaginacionTodoCompoKit) {
		this.isPermisoPaginacionTodoCompoKit = isPermisoPaginacionTodoCompoKit;
	}
	
	public Boolean getIsPermisoPaginacionAltoCompoKit() {
		return isPermisoPaginacionAltoCompoKit;
	}

	public void setIsPermisoPaginacionAltoCompoKit(Boolean isPermisoPaginacionAltoCompoKit) {
		this.isPermisoPaginacionAltoCompoKit = isPermisoPaginacionAltoCompoKit;
	}
	
	public Boolean getIsPermisoCopiarCompoKit() {
		return isPermisoCopiarCompoKit;
	}

	public void setIsPermisoCopiarCompoKit(Boolean isPermisoCopiarCompoKit) {
		this.isPermisoCopiarCompoKit = isPermisoCopiarCompoKit;
	}
	
	public Boolean getIsPermisoVerFormCompoKit() {
		return isPermisoVerFormCompoKit;
	}

	public void setIsPermisoVerFormCompoKit(Boolean isPermisoVerFormCompoKit) {
		this.isPermisoVerFormCompoKit = isPermisoVerFormCompoKit;
	}
	
	public Boolean getIsPermisoDuplicarCompoKit() {
		return isPermisoDuplicarCompoKit;
	}

	public void setIsPermisoDuplicarCompoKit(Boolean isPermisoDuplicarCompoKit) {
		this.isPermisoDuplicarCompoKit = isPermisoDuplicarCompoKit;
	}
	
	public Boolean getIsPermisoOrdenCompoKit() {
		return isPermisoOrdenCompoKit;
	}

	public void setIsPermisoOrdenCompoKit(Boolean isPermisoOrdenCompoKit) {
		this.isPermisoOrdenCompoKit = isPermisoOrdenCompoKit;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCompoKit() {
		return isVisibilidadCeldaNuevoCompoKit;
	}

	public void setIsVisibilidadCeldaNuevoCompoKit(Boolean isVisibilidadCeldaNuevoCompoKit) {
		this.isVisibilidadCeldaNuevoCompoKit = isVisibilidadCeldaNuevoCompoKit;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCompoKit() {
		return isVisibilidadCeldaDuplicarCompoKit;
	}

	public void setIsVisibilidadCeldaDuplicarCompoKit(Boolean isVisibilidadCeldaDuplicarCompoKit) {
		this.isVisibilidadCeldaDuplicarCompoKit = isVisibilidadCeldaDuplicarCompoKit;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCompoKit() {
		return isVisibilidadCeldaCopiarCompoKit;
	}

	public void setIsVisibilidadCeldaCopiarCompoKit(Boolean isVisibilidadCeldaCopiarCompoKit) {
		this.isVisibilidadCeldaCopiarCompoKit = isVisibilidadCeldaCopiarCompoKit;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCompoKit() {
		return isVisibilidadCeldaVerFormCompoKit;
	}

	public void setIsVisibilidadCeldaVerFormCompoKit(Boolean isVisibilidadCeldaVerFormCompoKit) {
		this.isVisibilidadCeldaVerFormCompoKit = isVisibilidadCeldaVerFormCompoKit;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCompoKit() {
		return isVisibilidadCeldaOrdenCompoKit;
	}

	public void setIsVisibilidadCeldaOrdenCompoKit(Boolean isVisibilidadCeldaOrdenCompoKit) {
		this.isVisibilidadCeldaOrdenCompoKit = isVisibilidadCeldaOrdenCompoKit;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCompoKit() {
		return isVisibilidadCeldaNuevoRelacionesCompoKit;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCompoKit(Boolean isVisibilidadCeldaNuevoRelacionesCompoKit) {
		this.isVisibilidadCeldaNuevoRelacionesCompoKit = isVisibilidadCeldaNuevoRelacionesCompoKit;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCompoKit() {
		return isVisibilidadCeldaModificarCompoKit;
	}

	public void setIsVisibilidadCeldaModificarCompoKit(Boolean isVisibilidadCeldaModificarCompoKit) {
		this.isVisibilidadCeldaModificarCompoKit = isVisibilidadCeldaModificarCompoKit;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCompoKit() {
		return isVisibilidadCeldaActualizarCompoKit;
	}

	public void setIsVisibilidadCeldaActualizarCompoKit(Boolean isVisibilidadCeldaActualizarCompoKit) {
		this.isVisibilidadCeldaActualizarCompoKit = isVisibilidadCeldaActualizarCompoKit;
	}

	public Boolean getIsVisibilidadCeldaEliminarCompoKit() {
		return isVisibilidadCeldaEliminarCompoKit;
	}

	public void setIsVisibilidadCeldaEliminarCompoKit(Boolean isVisibilidadCeldaEliminarCompoKit) {
		this.isVisibilidadCeldaEliminarCompoKit = isVisibilidadCeldaEliminarCompoKit;
	}

	public Boolean getIsVisibilidadCeldaCancelarCompoKit() {
		return isVisibilidadCeldaCancelarCompoKit;
	}

	public void setIsVisibilidadCeldaCancelarCompoKit(Boolean isVisibilidadCeldaCancelarCompoKit) {
		this.isVisibilidadCeldaCancelarCompoKit = isVisibilidadCeldaCancelarCompoKit;
	}

	public Boolean getIsVisibilidadCeldaGuardarCompoKit() {
		return isVisibilidadCeldaGuardarCompoKit;
	}

	public void setIsVisibilidadCeldaGuardarCompoKit(Boolean isVisibilidadCeldaGuardarCompoKit) {
		this.isVisibilidadCeldaGuardarCompoKit = isVisibilidadCeldaGuardarCompoKit;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCompoKit() {
		return isVisibilidadCeldaGuardarCambiosCompoKit;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCompoKit(Boolean isVisibilidadCeldaGuardarCambiosCompoKit) {
		this.isVisibilidadCeldaGuardarCambiosCompoKit = isVisibilidadCeldaGuardarCambiosCompoKit;
	}
		
	public CompoKitSessionBean getcompokitSessionBean() {
		return this.compokitSessionBean;
	}
	
	public void setcompokitSessionBean(CompoKitSessionBean compokitSessionBean) {
		this.compokitSessionBean=compokitSessionBean;
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

	public Boolean getisVisibilidadFK_IdKit() {
		return this.isVisibilidadFK_IdKit;
	}

	public void setisVisibilidadFK_IdKit(Boolean isVisibilidadFK_IdKit) {
		this.isVisibilidadFK_IdKit=isVisibilidadFK_IdKit;
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

	public Boolean getisVisibilidadFK_IdUnidad() {
		return this.isVisibilidadFK_IdUnidad;
	}

	public void setisVisibilidadFK_IdUnidad(Boolean isVisibilidadFK_IdUnidad) {
		this.isVisibilidadFK_IdUnidad=isVisibilidadFK_IdUnidad;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCompoKit(CompoKit compokit)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(compokit,null);
				this.setActualParaGuardarSucursalForeignKey(compokit,null);
				this.setActualParaGuardarBodegaForeignKey(compokit,null);
				this.setActualParaGuardarProductoForeignKey(compokit,null);
				this.setActualParaGuardarKitForeignKey(compokit,null);
				this.setActualParaGuardarUnidadForeignKey(compokit,null);
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
	
	public void bugActualizarReferenciaActual(CompoKit compokit,CompoKit compokitAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCompoKit(compokit);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		compokitAux.setId(compokit.getId());
		compokitAux.setVersionRow(compokit.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessCompoKit();
		
			int intSelectedRow = this.jTableDatosCompoKit.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokit =(CompoKit) this.compokitLogic.getCompoKits().toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.compokit =(CompoKit) this.compokits.toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(CompoKitJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualCompoKit(this.compokit,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysCompoKit(this.compokit);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = compokitValidator.getInvalidValues(this.compokit);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			compokitLogic.setDatosCliente(datosCliente);
			compokitLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				compokitAux=new  CompoKit();
				
				compokitAux.setIsNew(true);
				compokitAux.setIsChanged(true);
				
				compokitAux.setCompoKitOriginal(this.compokit);
				
				compokitAux.setId(this.compokit.getId());	
				compokitAux.setVersionRow(this.compokit.getVersionRow());	
				compokitAux.setid_empresa(this.compokit.getid_empresa());	
				compokitAux.setid_sucursal(this.compokit.getid_sucursal());	
				compokitAux.setid_bodega(this.compokit.getid_bodega());	
				compokitAux.setid_producto(this.compokit.getid_producto());	
				compokitAux.setid_kit(this.compokit.getid_kit());	
				compokitAux.setid_unidad(this.compokit.getid_unidad());	
				compokitAux.setcantidad(this.compokit.getcantidad());	
				compokitAux.setvalor_ingreso(this.compokit.getvalor_ingreso());	
				compokitAux.setdescripcion(this.compokit.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.compokitSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.compokitSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(compokitAux,compokitLogic.getCompoKits());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(compokitAux,compokits);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.compokitSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.compokitSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						compokitLogic.saveCompoKits();//WithConnection
						//compokitLogic.getSetVersionRowCompoKits();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.compokit,compokitAux);
					
					this.refrescarForeignKeysDescripcionesCompoKit();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.compokitSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.compokitSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								compokitLogic.saveCompoKitRelaciones(compokitAux);//WithConnection
								//compokitLogic.getSetVersionRowCompoKits();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.compokit,compokitAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.compokitSessionBean.getEstaModoGuardarRelaciones() 
									|| this.compokitSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(compokitAux,compokitLogic.getCompoKits());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(compokitAux,compokits);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.compokit,compokitAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				compokitAux=new  CompoKit();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.compokitSessionBean.getEsGuardarRelacionado() 
					|| (this.compokitSessionBean.getEsGuardarRelacionado() && this.compokit.getId()>=0)) {
						
					compokitAux.setIsNew(false);
				}
				
				compokitAux.setIsDeleted(false);
			
				compokitAux.setId(this.compokit.getId());	
				compokitAux.setVersionRow(this.compokit.getVersionRow());	
				compokitAux.setid_empresa(this.compokit.getid_empresa());	
				compokitAux.setid_sucursal(this.compokit.getid_sucursal());	
				compokitAux.setid_bodega(this.compokit.getid_bodega());	
				compokitAux.setid_producto(this.compokit.getid_producto());	
				compokitAux.setid_kit(this.compokit.getid_kit());	
				compokitAux.setid_unidad(this.compokit.getid_unidad());	
				compokitAux.setcantidad(this.compokit.getcantidad());	
				compokitAux.setvalor_ingreso(this.compokit.getvalor_ingreso());	
				compokitAux.setdescripcion(this.compokit.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(compokitAux,compokitLogic.getCompoKits());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(compokitAux,compokits);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.compokitSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.compokitSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						compokitLogic.saveCompoKits();//WithConnection
						//compokitLogic.getSetVersionRowCompoKits();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.compokit,compokitAux);
					
					this.refrescarForeignKeysDescripcionesCompoKit();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.compokitSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.compokitSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								compokitLogic.saveCompoKitRelaciones(compokitAux);//WithConnection
								//compokitLogic.getSetVersionRowCompoKits();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.compokit,compokitAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.compokitSessionBean.getEstaModoGuardarRelaciones() 
									|| this.compokitSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(compokitAux,compokitLogic.getCompoKits());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(compokitAux,compokits);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.compokit,compokitAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				compokitAux=new  CompoKit();
				
				compokitAux.setIsNew(false);
				compokitAux.setIsChanged(false);
				
				compokitAux.setIsDeleted(true);
				
				compokitAux.setId(this.compokit.getId());	
				compokitAux.setVersionRow(this.compokit.getVersionRow());	
				compokitAux.setid_empresa(this.compokit.getid_empresa());	
				compokitAux.setid_sucursal(this.compokit.getid_sucursal());	
				compokitAux.setid_bodega(this.compokit.getid_bodega());	
				compokitAux.setid_producto(this.compokit.getid_producto());	
				compokitAux.setid_kit(this.compokit.getid_kit());	
				compokitAux.setid_unidad(this.compokit.getid_unidad());	
				compokitAux.setcantidad(this.compokit.getcantidad());	
				compokitAux.setvalor_ingreso(this.compokit.getvalor_ingreso());	
				compokitAux.setdescripcion(this.compokit.getdescripcion());	
				
				if(this.compokitSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.compokitAux.getId()>=0) {	
						this.compokitsEliminados.add(compokitAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(compokitAux,compokitLogic.getCompoKits());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(compokitAux,compokits);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.compokitSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.compokitSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						compokitLogic.saveCompoKits();//WithConnection
						//compokitLogic.getSetVersionRowCompoKits();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.compokitSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.compokitSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								compokitLogic.saveCompoKitRelaciones(compokitAux);//WithConnection
								//compokitLogic.getSetVersionRowCompoKits();//WithConnection
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
							if(this.compokitSessionBean.getEstaModoGuardarRelaciones() 
								|| this.compokitSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(compokitAux,compokitLogic.getCompoKits());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(compokitAux,compokits);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitLogic.getCompoKits().addAll(this.compokitsEliminados);
					
					compokitLogic.saveCompoKits();//WithConnection
					//compokitLogic.getSetVersionRowCompoKits();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesCompoKit();
				
				this.compokitsEliminados= new ArrayList<CompoKit>();		
			}
			
			if(this.compokitSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.compokitSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Compo Kit GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Compo Kit",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.compokit=compokitAux;
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
      		//this.finishProcessCompoKit();
      	}
		
	}	
	
	public void actualizarRelaciones(CompoKit compokitLocal) throws Exception {
		
		if(this.compokitSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CompoKit compokitLocal) throws Exception {	
		if(this.compokitSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				compokitLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				compokitLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				compokitLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				compokitLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(KitDetalleFormJInternalFrame.class)) {
				KitBeanSwingJInternalFrame kitBeanSwingJInternalFrameLocal=(KitBeanSwingJInternalFrame) ((KitDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				kitBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoKit(kitBeanSwingJInternalFrameLocal.getkit(),true);
				kitBeanSwingJInternalFrameLocal.actualizarLista(kitBeanSwingJInternalFrameLocal.kit,this.kitsForeignKey);

				kitBeanSwingJInternalFrameLocal.actualizarRelaciones(kitBeanSwingJInternalFrameLocal.kit);

				compokitLocal.setKit(kitBeanSwingJInternalFrameLocal.kit);

				this.addItemDefectoCombosForeignKeyKit();
				this.cargarCombosFrameKitsForeignKey("Formulario");
				this.setActualKitForeignKey(kitBeanSwingJInternalFrameLocal.kit.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UnidadDetalleFormJInternalFrame.class)) {
				UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrameLocal=(UnidadBeanSwingJInternalFrame) ((UnidadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				unidadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUnidad(unidadBeanSwingJInternalFrameLocal.getunidad(),true);
				unidadBeanSwingJInternalFrameLocal.actualizarLista(unidadBeanSwingJInternalFrameLocal.unidad,this.unidadsForeignKey);

				unidadBeanSwingJInternalFrameLocal.actualizarRelaciones(unidadBeanSwingJInternalFrameLocal.unidad);

				compokitLocal.setUnidad(unidadBeanSwingJInternalFrameLocal.unidad);

				this.addItemDefectoCombosForeignKeyUnidad();
				this.cargarCombosFrameUnidadsForeignKey("Formulario");
				this.setActualUnidadForeignKey(unidadBeanSwingJInternalFrameLocal.unidad.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCompoKitActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCompoKit.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.compokit =(CompoKit) this.compokitLogic.getCompoKits().toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.compokit =(CompoKit) this.compokits.toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = compokitValidator.getInvalidValues(this.compokit);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CompoKit compokit,List<CompoKit> compokits) throws Exception {
		try	{		
			CompoKitConstantesFunciones.actualizarLista(compokit,compokits,this.compokitSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(CompoKit compokit,List<CompoKit> compokits) throws Exception {
		try	{			
			CompoKitConstantesFunciones.actualizarSelectedLista(compokit,compokits);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CompoKit> compokitsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				compokitsLocal=this.compokitLogic.getCompoKits();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				compokitsLocal=this.compokits;
			}
			//ARCHITECTURE
		
			for(CompoKit compokitLocal:compokitsLocal) {
				if(this.permiteMantenimiento(compokitLocal) && compokitLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CompoKitConstantesFunciones.getCompoKitLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CompoKitConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCompoKit.jLabelid_empresaCompoKit,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CompoKitConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCompoKit.jLabelid_sucursalCompoKit,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CompoKitConstantesFunciones.IDBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCompoKit.jLabelid_bodegaCompoKit,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CompoKitConstantesFunciones.IDPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCompoKit.jLabelid_productoCompoKit,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CompoKitConstantesFunciones.IDKIT)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCompoKit.jLabelid_kitCompoKit,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CompoKitConstantesFunciones.IDUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCompoKit.jLabelid_unidadCompoKit,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CompoKitConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCompoKit.jLabelcantidadCompoKit,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CompoKitConstantesFunciones.VALORINGRESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCompoKit.jLabelvalor_ingresoCompoKit,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CompoKitConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCompoKit.jLabeldescripcionCompoKit,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCompoKit!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCompoKit.jLabelid_empresaCompoKit,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCompoKit.jLabelid_sucursalCompoKit,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCompoKit.jLabelid_bodegaCompoKit,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCompoKit.jLabelid_productoCompoKit,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCompoKit.jLabelid_kitCompoKit,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCompoKit.jLabelid_unidadCompoKit,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCompoKit.jLabelcantidadCompoKit,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCompoKit.jLabelvalor_ingresoCompoKit,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCompoKit.jLabeldescripcionCompoKit,"");
		
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
		this.iIdNuevoCompoKit--;	
		
		
		this.compokitAux=new CompoKit();
		
		this.compokitAux.setId(this.iIdNuevoCompoKit);
		this.compokitAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.compokitLogic.getCompoKits().add(this.compokitAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.compokits.add(this.compokitAux);
		}
		//ARCHITECTURE
		
		this.compokit=this.compokitAux;
		
		if(CompoKitJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCompoKit(this.compokit);
			this.setVariablesObjetoActualToFormularioForeignKeyCompoKit(this.compokit);
		}
				
		//this.setDefaultControlesCompoKit();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCompoKit();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCompoKit();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCompoKit();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCompoKit(this.compokitBean,this.compokit,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCompoKit(this.compokit);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(CompoKitConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.compokitSessionBean.getConGuardarRelaciones()) {
			classes=CompoKitConstantesFunciones.getClassesRelationshipsOfCompoKit(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.compokitReturnGeneral=compokitLogic.procesarEventosCompoKitsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.compokitLogic.getCompoKits(),this.compokit,this.compokitParameterGeneral,this.isEsNuevoCompoKit,classes);//this.compokitLogic.getCompoKit()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCompoKit(this.compokitReturnGeneral,this.compokitBean,false);
		
		if(this.compokitReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCompoKit(this.compokitReturnGeneral.getCompoKit());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCompoKit(this.compokitReturnGeneral.getCompoKit());
		}
		
		if(this.compokitReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCompoKit(this.compokitReturnGeneral.getCompoKit(),classes);//this.compokitBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCompoKit(this.compokit,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCompoKit();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCompoKit();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CompoKitBeanSwingJInternalFrameAdditional.RecargarFormCompoKit(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCompoKit(false);
						
			if(compokitSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CompoKitJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCompoKit();
			}
			
			this.actualizarVisualTableDatosCompoKit();
			
			this.jTableDatosCompoKit.setRowSelectionInterval(this.getIndiceNuevoCompoKit(), this.getIndiceNuevoCompoKit());
			
			this.seleccionarFilaTablaCompoKitActual();
						
			this.actualizarEstadoCeldasBotonesCompoKit("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCompoKit(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCompoKit.jTextFieldcantidadCompoKit.setEnabled(isHabilitar && this.compokitConstantesFunciones.activarcantidadCompoKit);
		this.jInternalFrameDetalleFormCompoKit.jTextFieldvalor_ingresoCompoKit.setEnabled(isHabilitar && this.compokitConstantesFunciones.activarvalor_ingresoCompoKit);
		this.jInternalFrameDetalleFormCompoKit.jTextAreadescripcionCompoKit.setEnabled(isHabilitar && this.compokitConstantesFunciones.activardescripcionCompoKit);	
		//
		this.jInternalFrameDetalleFormCompoKit.jComboBoxid_empresaCompoKit.setEnabled(isHabilitar && this.compokitConstantesFunciones.activarid_empresaCompoKit);//
		this.jInternalFrameDetalleFormCompoKit.jComboBoxid_sucursalCompoKit.setEnabled(isHabilitar && this.compokitConstantesFunciones.activarid_sucursalCompoKit);
		this.jInternalFrameDetalleFormCompoKit.jComboBoxid_bodegaCompoKit.setEnabled(isHabilitar && this.compokitConstantesFunciones.activarid_bodegaCompoKit);
		this.jInternalFrameDetalleFormCompoKit.jComboBoxid_productoCompoKit.setEnabled(isHabilitar && this.compokitConstantesFunciones.activarid_productoCompoKit);
		this.jInternalFrameDetalleFormCompoKit.jComboBoxid_kitCompoKit.setEnabled(isHabilitar && this.compokitConstantesFunciones.activarid_kitCompoKit);
		this.jInternalFrameDetalleFormCompoKit.jComboBoxid_unidadCompoKit.setEnabled(isHabilitar && this.compokitConstantesFunciones.activarid_unidadCompoKit);
	};
	
	public void setDefaultControlesCompoKit() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCompoKit(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.compokitSessionBean.setConGuardarRelaciones(true);			
			this.compokitSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCompoKit.jTabbedPaneRelacionesCompoKit.setVisible(true);
			
					
		} else {
			//this.compokitSessionBean.setConGuardarRelaciones(false);			
			this.compokitSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCompoKit.jTabbedPaneRelacionesCompoKit.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCompoKit() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CompoKit compokitAux:this.compokitLogic.getCompoKits()) {
				if(compokitAux.getId().equals(this.iIdNuevoCompoKit)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CompoKit compokitAux:this.compokits) {
				if(compokitAux.getId().equals(this.iIdNuevoCompoKit)) {
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
	
	public int getIndiceActualCompoKit(CompoKit compokit,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CompoKit compokitAux:this.compokitLogic.getCompoKits()) {
				if(compokitAux.getId().equals(compokit.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CompoKit compokitAux:this.compokits) {
				if(compokitAux.getId().equals(compokit.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCompoKit(CompoKit compokitOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CompoKit compokitAux:this.compokitLogic.getCompoKits()) {
				if(compokitAux.getCompoKitOriginal().getId().equals(compokitOriginal.getId())) {
					existe=true;
					compokitOriginal.setId(compokitAux.getId());
					compokitOriginal.setVersionRow(compokitAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CompoKit compokitAux:this.compokits) {
				if(compokitAux.getCompoKitOriginal().getId().equals(compokitOriginal.getId())) {
					existe=true;
					compokitOriginal.setId(compokitAux.getId());
					compokitOriginal.setVersionRow(compokitAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCompoKit(Boolean esParaCancelar) throws Exception {
		compokitsAux=new ArrayList<CompoKit>();
		compokitAux=new CompoKit();
		
		if(!this.compokitSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CompoKit compokitAux:this.compokitLogic.getCompoKits()) {
					if(compokitAux.getId()<0) {
						compokitsAux.add(compokitAux);
					}		
				}
				this.iIdNuevoCompoKit=0L;
				this.compokitLogic.getCompoKits().removeAll(compokitsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CompoKit compokitAux:this.compokits) {
					if(compokitAux.getId()<0) {
						compokitsAux.add(compokitAux);
					}		
				}
				this.iIdNuevoCompoKit=0L;
				this.compokits.removeAll(compokitsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCompoKit 
					&& this.compokitLogic.getCompoKits().size()>0
					) {
					compokitAux=this.compokitLogic.getCompoKits().get(this.compokitLogic.getCompoKits().size() - 1);
				
					if(compokitAux.getId()<0) {
						this.compokitLogic.getCompoKits().remove(compokitAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCompoKit && this.compokits.size()>0) {
					compokitAux=this.compokits.get(this.compokits.size() - 1);
				
					if(compokitAux.getId()<0) {
						this.compokits.remove(compokitAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCompoKit(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(compokit.getId()<0) {
				this.compokitLogic.getCompoKits().remove(this.compokit);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(compokit.getId()<0) {
				this.compokits.remove(this.compokit);
			}
		}			
	}
	
	public void setEstadosInicialesCompoKit(List<CompoKit> compokitsAux) throws Exception {
		CompoKitConstantesFunciones.setEstadosInicialesCompoKit(compokitsAux);
	}
	
	public void setEstadosInicialesCompoKit(CompoKit compokitAux) throws Exception {
		CompoKitConstantesFunciones.setEstadosInicialesCompoKit(compokitAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCompoKitActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCompoKit("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCompoKitActual()) {
				if(!this.isEsNuevoCompoKit) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCompoKit("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCompoKit=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCompoKitActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Compo Kit ?", "MANTENIMIENTO DE Compo Kit", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCompoKit("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CompoKit compokit) throws Exception {
		CompoKitConstantesFunciones.seleccionarAsignar(this.compokit,compokit);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCompoKit=this.isPermisoActualizarOriginalCompoKit;
			
			
			this.seleccionarAsignar(compokit);
			
			

			idProductoActual=compokit.getid_producto();
			this.seleccionarProductoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CompoKitConstantesFunciones.quitarEspaciosCompoKit(this.compokit,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesCompoKit("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.compokitSessionBean.setsFuncionBusquedaRapida(this.compokitSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoCompoKit) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCompoKit(esParaCancelar);				
				this.cancelarNuevoCompoKit(esParaCancelar);								
			}
			
			this.compokit=new CompoKit();
			
			this.inicializarCompoKit();
			
			this.actualizarEstadoCeldasBotonesCompoKit("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCompoKit() throws Exception {
		try {
			CompoKitConstantesFunciones.inicializarCompoKit(this.compokit);
			
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
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.compokitLogic.getCompoKits().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCompoKits(String sAccionBusqueda,List<CompoKit> compokitsParaReportes) throws Exception {
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
					sPathReporteFinal="CompoKit"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CompoKitMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CompoKitMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CompoKit"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Compo Kites");		
		parameters.put("busquedapor", CompoKitConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCompoKit=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CompoKitConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CompoKitConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCompoKit=new JRBeanArrayDataSource(CompoKitJInternalFrame.TraerCompoKitBeans(compokitsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCompoKit);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CompoKitConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CompoKitConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CompoKitBean.TraerCompoKitBeans(compokitsParaReportes).toArray()));
							
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
				this.generarExcelReporteCompoKits(sAccionBusqueda,sTipoArchivoReporte,compokitsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCompoKits(sAccionBusqueda,sTipoArchivoReporte,compokitsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCompoKitActionPerformed(null);
					//this.generarExcelReporteCompoKits(sAccionBusqueda,sTipoArchivoReporte,compokitsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCompoKits(sAccionBusqueda,sTipoArchivoReporte,compokitsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCompoKits(sAccionBusqueda,sTipoArchivoReporte,compokitsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCompoKits(sAccionBusqueda,sTipoArchivoReporte,compokitsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCompoKits(String sAccionBusqueda,String sTipoArchivoReporte,List<CompoKit> compokitsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"compokit";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CompoKits");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCompoKit("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CompoKit compokit : compokitsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CompoKitConstantesFunciones.generarExcelReporteDataCompoKit("NORMAL",row,workbook,compokit,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.compokitSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Compo Kit",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCompoKit(String sTipo,Row row,Workbook workbook) {
		
		CompoKitConstantesFunciones.generarExcelReporteHeaderCompoKit(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCompoKits(String sAccionBusqueda,String sTipoArchivoReporte,List<CompoKit> compokitsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"compokit_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CompoKits");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CompoKit compokit : compokitsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CompoKitConstantesFunciones.getCompoKitDescripcion(compokit));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CompoKitConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CompoKitConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(compokit.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CompoKitConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CompoKitConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(compokit.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CompoKitConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CompoKitConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(compokit.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CompoKitConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CompoKitConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(compokit.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CompoKitConstantesFunciones.LABEL_IDKIT))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CompoKitConstantesFunciones.LABEL_IDKIT);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(compokit.getkit_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CompoKitConstantesFunciones.LABEL_IDUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CompoKitConstantesFunciones.LABEL_IDUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(compokit.getunidad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CompoKitConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CompoKitConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(compokit.getcantidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CompoKitConstantesFunciones.LABEL_VALORINGRESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CompoKitConstantesFunciones.LABEL_VALORINGRESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(compokit.getvalor_ingreso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CompoKitConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CompoKitConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(compokit.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.compokitSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Compo Kit",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCompoKits(String sAccionBusqueda,String sTipoArchivoReporte,List<CompoKit> compokitsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CompoKit> compokitsRespaldo=null;
		
		classes=CompoKitConstantesFunciones.getClassesRelationshipsOfCompoKit(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.compokitLogic.setDatosCliente(this.datosCliente);
		this.compokitLogic.setDatosDeep(this.datosDeep);
		this.compokitLogic.setIsConDeep(true);
		
		compokitsRespaldo=this.compokitLogic.getCompoKits();
		
		this.compokitLogic.setCompoKits(compokitsParaReportes);	
		this.compokitLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		compokitsParaReportes=this.compokitLogic.getCompoKits();
		this.compokitLogic.setCompoKits(compokitsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"compokit_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CompoKits");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCompoKit("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CompoKit compokit : compokitsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCompoKit("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CompoKitConstantesFunciones.generarExcelReporteDataCompoKit("NORMAL",row,workbook,compokit,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CompoKitConstantesFunciones.getCompoKitDescripcion(compokit));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.compokitSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Compo Kit",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCompoKit.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCompoKit.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCompoKit.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCompoKit.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCompoKit() throws Exception {		
		this.startProcessCompoKit(true);
	}
	
	public void startProcessCompoKit(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCompoKit ,this.jPanelParametrosReportesCompoKit, this.jScrollPanelDatosCompoKit,this.jPanelPaginacionCompoKit, this.jScrollPanelDatosEdicionCompoKit, this.jPanelAccionesCompoKit,this.jPanelAccionesFormularioCompoKit,this.jmenuBarCompoKit,this.jmenuBarDetalleCompoKit,this.jTtoolBarCompoKit,this.jTtoolBarDetalleCompoKit);		
		
		final JTabbedPane jTabbedPaneBusquedasCompoKit=this.jTabbedPaneBusquedasCompoKit; 
		
		final JPanel jPanelParametrosReportesCompoKit=this.jPanelParametrosReportesCompoKit;
		//final JScrollPane jScrollPanelDatosCompoKit=this.jScrollPanelDatosCompoKit;
		final JTable jTableDatosCompoKit=this.jTableDatosCompoKit;		
		final JPanel jPanelPaginacionCompoKit=this.jPanelPaginacionCompoKit;
		//final JScrollPane jScrollPanelDatosEdicionCompoKit=this.jScrollPanelDatosEdicionCompoKit;
		final JPanel jPanelAccionesCompoKit=this.jPanelAccionesCompoKit;
		
		JPanel jPanelCamposAuxiliarCompoKit=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCompoKit=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCompoKit!=null) {
			jPanelCamposAuxiliarCompoKit=this.jInternalFrameDetalleFormCompoKit.jPanelCamposCompoKit;
			jPanelAccionesFormularioAuxiliarCompoKit=this.jInternalFrameDetalleFormCompoKit.jPanelAccionesFormularioCompoKit;
		}
		
		final JPanel jPanelCamposCompoKit=jPanelCamposAuxiliarCompoKit;
		final JPanel jPanelAccionesFormularioCompoKit=jPanelAccionesFormularioAuxiliarCompoKit;
		
		
		final JMenuBar jmenuBarCompoKit=this.jmenuBarCompoKit;
		final JToolBar jTtoolBarCompoKit=this.jTtoolBarCompoKit;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCompoKit=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCompoKit=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCompoKit!=null) {
			jmenuBarDetalleAuxiliarCompoKit=this.jInternalFrameDetalleFormCompoKit.jmenuBarDetalleCompoKit;
			jTtoolBarDetalleAuxiliarCompoKit=this.jInternalFrameDetalleFormCompoKit.jTtoolBarDetalleCompoKit;
		}
		
		final JMenuBar jmenuBarDetalleCompoKit=jmenuBarDetalleAuxiliarCompoKit;
		final JToolBar jTtoolBarDetalleCompoKit=jTtoolBarDetalleAuxiliarCompoKit;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCompoKit;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCompoKit;
			processRunnable.jTableDatos=jTableDatosCompoKit;
			processRunnable.jPanelCampos=jPanelCamposCompoKit;
			processRunnable.jPanelPaginacion=jPanelPaginacionCompoKit;
			processRunnable.jPanelAcciones=jPanelAccionesCompoKit;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCompoKit;
			
			
			processRunnable.jmenuBar=jmenuBarCompoKit;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCompoKit;
			processRunnable.jTtoolBar=jTtoolBarCompoKit;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCompoKit;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCompoKit ,jPanelParametrosReportesCompoKit,jTableDatosCompoKit, /*jScrollPanelDatosCompoKit,*/jPanelCamposCompoKit,jPanelPaginacionCompoKit, /*jScrollPanelDatosEdicionCompoKit,*/ jPanelAccionesCompoKit,jPanelAccionesFormularioCompoKit,jmenuBarCompoKit,jmenuBarDetalleCompoKit,jTtoolBarCompoKit,jTtoolBarDetalleCompoKit);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCompoKit ,jPanelParametrosReportesCompoKit, jScrollPanelDatosCompoKit,jPanelPaginacionCompoKit, jScrollPanelDatosEdicionCompoKit, jPanelAccionesCompoKit,jPanelAccionesFormularioCompoKit,jmenuBarCompoKit,jmenuBarDetalleCompoKit,jTtoolBarCompoKit,jTtoolBarDetalleCompoKit);
						
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
	
	public void finishProcessCompoKit() {// throws Exception 
		this.finishProcessCompoKit(true);
	}
	
	public void finishProcessCompoKit(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCompoKit ,this.jPanelParametrosReportesCompoKit, this.jScrollPanelDatosCompoKit,this.jPanelPaginacionCompoKit, this.jScrollPanelDatosEdicionCompoKit, this.jPanelAccionesCompoKit,this.jPanelAccionesFormularioCompoKit,this.jmenuBarCompoKit,this.jmenuBarDetalleCompoKit,this.jTtoolBarCompoKit,this.jTtoolBarDetalleCompoKit);		
		
		final JTabbedPane jTabbedPaneBusquedasCompoKit=this.jTabbedPaneBusquedasCompoKit; 
		
		final JPanel jPanelParametrosReportesCompoKit=this.jPanelParametrosReportesCompoKit;
		//final JScrollPane jScrollPanelDatosCompoKit=this.jScrollPanelDatosCompoKit;
		final JTable jTableDatosCompoKit=this.jTableDatosCompoKit;		
		final JPanel jPanelPaginacionCompoKit=this.jPanelPaginacionCompoKit;
		//final JScrollPane jScrollPanelDatosEdicionCompoKit=this.jScrollPanelDatosEdicionCompoKit;
		final JPanel jPanelAccionesCompoKit=this.jPanelAccionesCompoKit;
		
		JPanel jPanelCamposAuxiliarCompoKit=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCompoKit=new JPanel();
		
		if(this.jInternalFrameDetalleFormCompoKit!=null) {
			jPanelCamposAuxiliarCompoKit=this.jInternalFrameDetalleFormCompoKit.jPanelCamposCompoKit;
			jPanelAccionesFormularioAuxiliarCompoKit=this.jInternalFrameDetalleFormCompoKit.jPanelAccionesFormularioCompoKit;
		}
		
		final JPanel jPanelCamposCompoKit=jPanelCamposAuxiliarCompoKit;
		final JPanel jPanelAccionesFormularioCompoKit=jPanelAccionesFormularioAuxiliarCompoKit;
		
		
		final JMenuBar jmenuBarCompoKit=this.jmenuBarCompoKit;		
		final JToolBar jTtoolBarCompoKit=this.jTtoolBarCompoKit;
				
		JMenuBar jmenuBarDetalleAuxiliarCompoKit=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCompoKit=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCompoKit!=null) {
			jmenuBarDetalleAuxiliarCompoKit=this.jInternalFrameDetalleFormCompoKit.jmenuBarDetalleCompoKit;
			jTtoolBarDetalleAuxiliarCompoKit=this.jInternalFrameDetalleFormCompoKit.jTtoolBarDetalleCompoKit;		
		}
		
		final JMenuBar jmenuBarDetalleCompoKit=jmenuBarDetalleAuxiliarCompoKit;
		final JToolBar jTtoolBarDetalleCompoKit=jTtoolBarDetalleAuxiliarCompoKit;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCompoKit;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCompoKit;
			processRunnable.jTableDatos=jTableDatosCompoKit;
			processRunnable.jPanelCampos=jPanelCamposCompoKit;
			processRunnable.jPanelPaginacion=jPanelPaginacionCompoKit;
			processRunnable.jPanelAcciones=jPanelAccionesCompoKit;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCompoKit;
			
			
			processRunnable.jmenuBar=jmenuBarCompoKit;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCompoKit;
			processRunnable.jTtoolBar=jTtoolBarCompoKit;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCompoKit;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCompoKit ,jPanelParametrosReportesCompoKit, jTableDatosCompoKit,/*jScrollPanelDatosCompoKit,*/jPanelCamposCompoKit,jPanelPaginacionCompoKit, /*jScrollPanelDatosEdicionCompoKit,*/ jPanelAccionesCompoKit,jPanelAccionesFormularioCompoKit,jmenuBarCompoKit,jmenuBarDetalleCompoKit,jTtoolBarCompoKit,jTtoolBarDetalleCompoKit));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCompoKit(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCompoKit(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCompoKit(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCompoKit(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCompoKit,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCompoKit,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCompoKit(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCompoKit,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCompoKit,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.compokitConstantesFunciones.getsFinalQueryCompoKit();
		String  finalQueryPaginacionTodos=this.compokitConstantesFunciones.getsFinalQueryCompoKit();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CompoKitConstantesFunciones.getArrayColumnasGlobalesNoCompoKit(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CompoKitConstantesFunciones.getArrayColumnasGlobalesCompoKit(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CompoKitConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.compokitsEliminados= new ArrayList<CompoKit>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCompoKit();
		
				///*CompoKitSessionBean*/this.compokitSessionBean=new CompoKitSessionBean();
			
			if(this.compokitSessionBean==null) {
				this.compokitSessionBean=new CompoKitSessionBean();
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
					this.iNumeroPaginacion=CompoKitConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CompoKitConstantesFunciones.getClassesForeignKeysOfCompoKit(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/compokit."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			compokitsAux= new ArrayList<CompoKit>();
			
				
			compokitLogic.setDatosCliente(this.datosCliente);
			compokitLogic.setDatosDeep(this.datosDeep);
			compokitLogic.setIsConDeep(true);
			
			
			compokitLogic.getCompoKitDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					compokitLogic.getTodosCompoKits(finalQueryGlobal,pagination);
					
					//compokitLogic.getTodosCompoKitsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(compokitLogic.getCompoKits()==null|| compokitLogic.getCompoKits().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							compokitsAux= new ArrayList<CompoKit>();
							compokitsAux.addAll(compokitLogic.getCompoKits());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							compokitsAux= new ArrayList<CompoKit>();
							compokitsAux.addAll(compokits);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							compokitLogic.getTodosCompoKits(finalQueryGlobal+"",this.pagination);												
							
							//compokitLogic.getTodosCompoKitsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteCompoKits("Todos",compokitLogic.getCompoKits() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							compokitLogic.setCompoKits(new ArrayList<CompoKit>());					
							compokitLogic.getCompoKits().addAll(compokitsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							compokits=new ArrayList<CompoKit>();
							compokits.addAll(compokitsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idCompoKit=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idCompoKit=this.idActual;
				
				} else if(this.idCompoKitActual!=null && this.idCompoKitActual!=0L) {
					idCompoKit=idCompoKitActual;
				}
				
					
				this.sDetalleReporte=CompoKitConstantesFunciones.getDetalleIndicePorId(idCompoKit);
				
				this.compokits=new ArrayList<CompoKit>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					compokitLogic.getEntity(idCompoKit);
					
					//compokitLogic.getEntityWithConnection(idCompoKit);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					compokitLogic.setCompoKits(new ArrayList<CompoKit>());
					compokitLogic.getCompoKits().add(compokitLogic.getCompoKit());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.compokits=new ArrayList<CompoKit>();
					this.compokits.add(compokit);
				}
				
				if(compokitLogic.getCompoKit()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdBodega")) {
				this.sDetalleReporte=CompoKitConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					compokitLogic.getCompoKitsFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CompoKitConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CompoKitConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=compokitLogic.getCompoKits()==null||compokitLogic.getCompoKits().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=compokits==null|| compokits.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						compokitsAux=new ArrayList<CompoKit>();
						compokitsAux.addAll(compokitLogic.getCompoKits());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							compokitsAux=new ArrayList<CompoKit>();
							compokitsAux.addAll(compokits);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							compokitLogic.getCompoKitsFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CompoKitConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CompoKitConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCompoKits("FK_IdBodega",compokitLogic.getCompoKits());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCompoKits("FK_IdBodega",compokits);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						compokitLogic.setCompoKits(new ArrayList<CompoKit>());
						compokitLogic.getCompoKits().addAll(compokitsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							compokits=new ArrayList<CompoKit>();
							compokits.addAll(compokitsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=CompoKitConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					compokitLogic.getCompoKitsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CompoKitConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CompoKitConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=compokitLogic.getCompoKits()==null||compokitLogic.getCompoKits().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=compokits==null|| compokits.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						compokitsAux=new ArrayList<CompoKit>();
						compokitsAux.addAll(compokitLogic.getCompoKits());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							compokitsAux=new ArrayList<CompoKit>();
							compokitsAux.addAll(compokits);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							compokitLogic.getCompoKitsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CompoKitConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CompoKitConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCompoKits("FK_IdEmpresa",compokitLogic.getCompoKits());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCompoKits("FK_IdEmpresa",compokits);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						compokitLogic.setCompoKits(new ArrayList<CompoKit>());
						compokitLogic.getCompoKits().addAll(compokitsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							compokits=new ArrayList<CompoKit>();
							compokits.addAll(compokitsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdKit")) {
				this.sDetalleReporte=CompoKitConstantesFunciones.getDetalleIndiceFK_IdKit(id_kitFK_IdKit);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					compokitLogic.getCompoKitsFK_IdKit(finalQueryGlobal,pagination,id_kitFK_IdKit);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CompoKitConstantesFunciones.getDetalleIndiceFK_IdKit(id_kitFK_IdKit);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CompoKitConstantesFunciones.getDetalleIndiceFK_IdKit(id_kitFK_IdKit);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=compokitLogic.getCompoKits()==null||compokitLogic.getCompoKits().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=compokits==null|| compokits.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						compokitsAux=new ArrayList<CompoKit>();
						compokitsAux.addAll(compokitLogic.getCompoKits());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							compokitsAux=new ArrayList<CompoKit>();
							compokitsAux.addAll(compokits);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							compokitLogic.getCompoKitsFK_IdKit(finalQueryGlobal,pagination,id_kitFK_IdKit);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CompoKitConstantesFunciones.getDetalleIndiceFK_IdKit(id_kitFK_IdKit);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CompoKitConstantesFunciones.getDetalleIndiceFK_IdKit(id_kitFK_IdKit);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCompoKits("FK_IdKit",compokitLogic.getCompoKits());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCompoKits("FK_IdKit",compokits);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						compokitLogic.setCompoKits(new ArrayList<CompoKit>());
						compokitLogic.getCompoKits().addAll(compokitsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							compokits=new ArrayList<CompoKit>();
							compokits.addAll(compokitsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdProducto")) {
				this.sDetalleReporte=CompoKitConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					compokitLogic.getCompoKitsFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CompoKitConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CompoKitConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=compokitLogic.getCompoKits()==null||compokitLogic.getCompoKits().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=compokits==null|| compokits.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						compokitsAux=new ArrayList<CompoKit>();
						compokitsAux.addAll(compokitLogic.getCompoKits());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							compokitsAux=new ArrayList<CompoKit>();
							compokitsAux.addAll(compokits);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							compokitLogic.getCompoKitsFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CompoKitConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CompoKitConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCompoKits("FK_IdProducto",compokitLogic.getCompoKits());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCompoKits("FK_IdProducto",compokits);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						compokitLogic.setCompoKits(new ArrayList<CompoKit>());
						compokitLogic.getCompoKits().addAll(compokitsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							compokits=new ArrayList<CompoKit>();
							compokits.addAll(compokitsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=CompoKitConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					compokitLogic.getCompoKitsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CompoKitConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CompoKitConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=compokitLogic.getCompoKits()==null||compokitLogic.getCompoKits().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=compokits==null|| compokits.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						compokitsAux=new ArrayList<CompoKit>();
						compokitsAux.addAll(compokitLogic.getCompoKits());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							compokitsAux=new ArrayList<CompoKit>();
							compokitsAux.addAll(compokits);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							compokitLogic.getCompoKitsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CompoKitConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CompoKitConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCompoKits("FK_IdSucursal",compokitLogic.getCompoKits());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCompoKits("FK_IdSucursal",compokits);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						compokitLogic.setCompoKits(new ArrayList<CompoKit>());
						compokitLogic.getCompoKits().addAll(compokitsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							compokits=new ArrayList<CompoKit>();
							compokits.addAll(compokitsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUnidad")) {
				this.sDetalleReporte=CompoKitConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					compokitLogic.getCompoKitsFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CompoKitConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CompoKitConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=compokitLogic.getCompoKits()==null||compokitLogic.getCompoKits().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=compokits==null|| compokits.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						compokitsAux=new ArrayList<CompoKit>();
						compokitsAux.addAll(compokitLogic.getCompoKits());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							compokitsAux=new ArrayList<CompoKit>();
							compokitsAux.addAll(compokits);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							compokitLogic.getCompoKitsFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CompoKitConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CompoKitConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCompoKits("FK_IdUnidad",compokitLogic.getCompoKits());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCompoKits("FK_IdUnidad",compokits);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						compokitLogic.setCompoKits(new ArrayList<CompoKit>());
						compokitLogic.getCompoKits().addAll(compokitsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							compokits=new ArrayList<CompoKit>();
							compokits.addAll(compokitsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCompoKit();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCompoKit();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=compokitLogic.getCompoKits().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=compokits.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=compokitLogic.getCompoKits().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=compokits.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CompoKit compokit) {
		Boolean permite=true;
		
		if(this.compokit.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CompoKitConstantesFunciones.getOrderByListaCompoKit();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CompoKitConstantesFunciones.getOrderByListaCompoKit();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CompoKit compokit:compokitLogic.getCompoKits()) {
				if(compokit.getsType().equals(Constantes2.S_TOTALES)) {
					compokitTotales=compokit;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CompoKit compokit:this.compokits) {
				if(compokit.getsType().equals(Constantes2.S_TOTALES)) {
					compokitTotales=compokit;
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
			this.compokitAux=new CompoKit();
			this.compokitAux.setsType(Constantes2.S_TOTALES);
			this.compokitAux.setIsNew(false);
			this.compokitAux.setIsChanged(false);
			this.compokitAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				CompoKitConstantesFunciones.TotalizarValoresFilaCompoKit(this.compokitLogic.getCompoKits(),this.compokitAux);
				
				this.compokitLogic.getCompoKits().add(this.compokitAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CompoKitConstantesFunciones.TotalizarValoresFilaCompoKit(this.compokits,this.compokitAux);
				
				this.compokits.add(this.compokitAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		compokitTotales=new CompoKit();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.compokitLogic.getCompoKits().remove(compokitTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.compokits.remove(compokitTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		compokitTotales=new CompoKit();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CompoKit compokit:compokitLogic.getCompoKits()) {
				if(compokit.getsType().equals(Constantes2.S_TOTALES)) {
					compokitTotales=compokit;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CompoKitConstantesFunciones.TotalizarValoresFilaCompoKit(this.compokitLogic.getCompoKits(),compokitTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CompoKit compokit:this.compokits) {
				if(compokit.getsType().equals(Constantes2.S_TOTALES)) {
					compokitTotales=compokit;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CompoKitConstantesFunciones.TotalizarValoresFilaCompoKit(this.compokits,compokitTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCompoKitsFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCompoKitsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCompoKitsFK_IdKit()throws Exception {
		try {
			sAccionBusqueda="FK_IdKit";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCompoKitsFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCompoKitsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCompoKitsFK_IdUnidad()throws Exception {
		try {
			sAccionBusqueda="FK_IdUnidad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCompoKitsFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					compokitLogic.getCompoKitsFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCompoKitsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					compokitLogic.getCompoKitsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCompoKitsFK_IdKit(String sFinalQuery,Long id_kit)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					compokitLogic.getCompoKitsFK_IdKit(sFinalQuery,this.pagination,id_kit);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCompoKitsFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					compokitLogic.getCompoKitsFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCompoKitsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					compokitLogic.getCompoKitsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCompoKitsFK_IdUnidad(String sFinalQuery,Long id_unidad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					compokitLogic.getCompoKitsFK_IdUnidad(sFinalQuery,this.pagination,id_unidad);
				
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
	
	public void inicializarPermisosCompoKit() {
		this.isPermisoTodoCompoKit=false;
		this.isPermisoNuevoCompoKit=false;
		this.isPermisoActualizarCompoKit=false;
		this.isPermisoActualizarOriginalCompoKit=false;
		this.isPermisoEliminarCompoKit=false;
		this.isPermisoGuardarCambiosCompoKit=false;
		this.isPermisoConsultaCompoKit=false;
		this.isPermisoBusquedaCompoKit=false;
		this.isPermisoReporteCompoKit=false;		
		this.isPermisoOrdenCompoKit=false;		
		this.isPermisoPaginacionMedioCompoKit=false;		
		this.isPermisoPaginacionAltoCompoKit=false;
		this.isPermisoPaginacionTodoCompoKit=false;
		this.isPermisoCopiarCompoKit=false;		
		this.isPermisoVerFormCompoKit=false;		
		this.isPermisoDuplicarCompoKit=false;		
		this.isPermisoOrdenCompoKit=false;		
	}
	
	public void setPermisosUsuarioCompoKit(Boolean isPermiso) {
		this.isPermisoTodoCompoKit=isPermiso;
		this.isPermisoNuevoCompoKit=isPermiso;
		this.isPermisoActualizarCompoKit=isPermiso;
		this.isPermisoActualizarOriginalCompoKit=isPermiso;
		this.isPermisoEliminarCompoKit=isPermiso;
		this.isPermisoGuardarCambiosCompoKit=isPermiso;
		this.isPermisoConsultaCompoKit=isPermiso;
		this.isPermisoBusquedaCompoKit=isPermiso;
		this.isPermisoReporteCompoKit=isPermiso;
		this.isPermisoOrdenCompoKit=isPermiso;		
		this.isPermisoPaginacionMedioCompoKit=isPermiso;		
		this.isPermisoPaginacionAltoCompoKit=isPermiso;		
		this.isPermisoPaginacionTodoCompoKit=isPermiso;		
		this.isPermisoCopiarCompoKit=isPermiso;		
		this.isPermisoVerFormCompoKit=isPermiso;		
		this.isPermisoDuplicarCompoKit=isPermiso;
		this.isPermisoOrdenCompoKit=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCompoKit(Boolean isPermiso) {
		//this.isPermisoTodoCompoKit=isPermiso;
		this.isPermisoNuevoCompoKit=isPermiso;
		this.isPermisoActualizarCompoKit=isPermiso;
		this.isPermisoActualizarOriginalCompoKit=isPermiso;
		this.isPermisoEliminarCompoKit=isPermiso;
		this.isPermisoGuardarCambiosCompoKit=isPermiso;
		//this.isPermisoConsultaCompoKit=isPermiso;
		//this.isPermisoBusquedaCompoKit=isPermiso;
		//this.isPermisoReporteCompoKit=isPermiso;
		//this.isPermisoOrdenCompoKit=isPermiso;		
		//this.isPermisoPaginacionMedioCompoKit=isPermiso;		
		//this.isPermisoPaginacionAltoCompoKit=isPermiso;		
		//this.isPermisoPaginacionTodoCompoKit=isPermiso;		
		//this.isPermisoCopiarCompoKit=isPermiso;		
		//this.isPermisoDuplicarCompoKit=isPermiso;
		//this.isPermisoOrdenCompoKit=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCompoKitClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CompoKitJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCompoKit(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCompoKitClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCompoKitClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCompoKitClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCompoKitClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCompoKit() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CompoKitJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.compokitSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CompoKitConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCompoKit=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCompoKit=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCompoKit=this.isPermisoActualizarCompoKit;
			this.isPermisoEliminarCompoKit=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCompoKit=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCompoKit=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCompoKit=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCompoKit=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCompoKit=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCompoKit=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCompoKit=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCompoKit=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCompoKit=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCompoKit=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCompoKit=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCompoKit=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCompoKit=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.compokitSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCompoKit.setToolTipText(this.jTableDatosCompoKit.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCompoKit(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCompoKit(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CompoKitJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CompoKitJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCompoKit() throws Exception {
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
	public void inicializarCombosForeignKeyCompoKitListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.bodegasForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
				this.kitsForeignKey=new ArrayList();
				this.unidadsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCompoKitListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CompoKitJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyCompoKitListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyKitListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyUnidadListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyKitListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.kitsForeignKey==null||this.kitsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=KitConstantesFunciones.getArrayColumnasGlobalesKit(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,KitConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=KitConstantesFunciones.SFINALQUERY;

				this.cargarCombosKitsForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyCompoKitListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			CompoKitParameterReturnGeneral compokitReturnGeneral=new CompoKitParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.compokitConstantesFunciones.cargarid_empresaCompoKit)
					 || (this.esRecargarFks && this.compokitConstantesFunciones.cargarid_empresaCompoKit)) {

					if(!this.compokitSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+compokitSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.compokitConstantesFunciones.cargarid_sucursalCompoKit)
					 || (this.esRecargarFks && this.compokitConstantesFunciones.cargarid_sucursalCompoKit)) {

					if(!this.compokitSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+compokitSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalBodega="";

				if(((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0) && this.compokitConstantesFunciones.cargarid_bodegaCompoKit)
					 || (this.esRecargarFks && this.compokitConstantesFunciones.cargarid_bodegaCompoKit)) {

					if(!this.compokitSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBodega=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

						finalQueryGlobalBodega=Funciones.GetFinalQueryAppend(finalQueryGlobalBodega, "");
						finalQueryGlobalBodega+=BodegaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBodega=" WHERE " + ConstantesSql.ID + "="+compokitSessionBean.getlidBodegaActual();
					}
				} else {
					finalQueryGlobalBodega="NONE";
				}


				String finalQueryGlobalProducto="";

				if(cargarCombosDependencia && ((this.productosForeignKey==null||this.productosForeignKey.size()<=0) && this.compokitConstantesFunciones.cargarid_productoCompoKit)
					 || (this.esRecargarFks && this.compokitConstantesFunciones.cargarid_productoCompoKit)) {

					if(!this.compokitSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalProducto, "");
						finalQueryGlobalProducto+=ProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProducto=" WHERE " + ConstantesSql.ID + "="+compokitSessionBean.getlidProductoActual();
					}
				} else {
					finalQueryGlobalProducto="NONE";
				}


				String finalQueryGlobalKit="";

				if(((this.kitsForeignKey==null||this.kitsForeignKey.size()<=0) && this.compokitConstantesFunciones.cargarid_kitCompoKit)
					 || (this.esRecargarFks && this.compokitConstantesFunciones.cargarid_kitCompoKit)) {

					if(!this.compokitSessionBean.getisBusquedaDesdeForeignKeySesionKit()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=KitConstantesFunciones.getArrayColumnasGlobalesKit(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalKit=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,KitConstantesFunciones.TABLENAME);

						finalQueryGlobalKit=Funciones.GetFinalQueryAppend(finalQueryGlobalKit, "");
						finalQueryGlobalKit+=KitConstantesFunciones.SFINALQUERY;

						//this.cargarCombosKitsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalKit=" WHERE " + ConstantesSql.ID + "="+compokitSessionBean.getlidKitActual();
					}
				} else {
					finalQueryGlobalKit="NONE";
				}


				String finalQueryGlobalUnidad="";

				if(cargarCombosDependencia && ((this.unidadsForeignKey==null||this.unidadsForeignKey.size()<=0) && this.compokitConstantesFunciones.cargarid_unidadCompoKit)
					 || (this.esRecargarFks && this.compokitConstantesFunciones.cargarid_unidadCompoKit)) {

					if(!this.compokitSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UnidadConstantesFunciones.getArrayColumnasGlobalesUnidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUnidad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UnidadConstantesFunciones.TABLENAME);

						finalQueryGlobalUnidad=Funciones.GetFinalQueryAppend(finalQueryGlobalUnidad, "");
						finalQueryGlobalUnidad+=UnidadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUnidadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUnidad=" WHERE " + ConstantesSql.ID + "="+compokitSessionBean.getlidUnidadActual();
					}
				} else {
					finalQueryGlobalUnidad="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				compokitReturnGeneral=compokitLogic.cargarCombosLoteForeignKeyCompoKit(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalBodega,finalQueryGlobalProducto,finalQueryGlobalKit,finalQueryGlobalUnidad);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=compokitReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=compokitReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalBodega.equals("NONE")) {
				this.bodegasForeignKey=compokitReturnGeneral.getbodegasForeignKey();
			}

			if(!finalQueryGlobalProducto.equals("NONE")) {
				this.productosForeignKey=compokitReturnGeneral.getproductosForeignKey();
			}

			if(!finalQueryGlobalKit.equals("NONE")) {
				this.kitsForeignKey=compokitReturnGeneral.getkitsForeignKey();
			}

			if(!finalQueryGlobalUnidad.equals("NONE")) {
				this.unidadsForeignKey=compokitReturnGeneral.getunidadsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyCompoKit()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyBodega();
			this.addItemDefectoCombosForeignKeyProducto();
			this.addItemDefectoCombosForeignKeyKit();
			this.addItemDefectoCombosForeignKeyUnidad();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.compokitSessionBean==null) {
				this.compokitSessionBean=new CompoKitSessionBean();
			}

			if(!this.compokitSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.compokitSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.compokitSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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

			if(!this.compokitSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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

	public void addItemDefectoCombosForeignKeyKit()throws Exception {
		try {

			if(!this.compokitSessionBean.getisBusquedaDesdeForeignKeySesionKit()) {
				Kit kit=new Kit();
				KitConstantesFunciones.setKitDescripcion(kit,Constantes.SMENSAJE_ESCOJA_OPCION);
				kit.setId(null);

				if(!KitConstantesFunciones.ExisteEnLista(this.kitsForeignKey,kit,true)) {

					this.kitsForeignKey.add(0,kit);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyUnidad()throws Exception {
		try {

			if(!this.compokitSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
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
	
	public void initActionsCombosTodosForeignKeyCompoKit()throws Exception {
		try {
			
			this.initActionsCombosForeignKeyBodega("Todos");
			this.initActionsCombosForeignKeyProducto("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCompoKit(String sFormularioTipoBusqueda)throws Exception {
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
			sFinalQueryCombo=InventarioSql.GetQueryUnidadFromBodegaYProducto(productoLocal,this.compokit.getid_bodega());

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
					if(this.jInternalFrameDetalleFormCompoKit!=null) {
						this.jInternalFrameDetalleFormCompoKit.jComboBoxid_bodegaCompoKit.addItemListener(new ComboBoxItemListener(this,"id_bodegaCompoKit"));
						this.jInternalFrameDetalleFormCompoKit.jComboBoxid_bodegaCompoKit.addFocusListener(new ComboBoxFocusListener(this,"id_bodegaCompoKit"));
					}
				} else {
					if(this.jInternalFrameDetalleFormCompoKit!=null) {
						this.jInternalFrameDetalleFormCompoKit.jComboBoxid_bodegaCompoKit.addActionListener(new ComboBoxActionListener(this,"id_bodegaCompoKit"));
						this.jInternalFrameDetalleFormCompoKit.jComboBoxid_bodegaCompoKit.addFocusListener(new ComboBoxFocusListener(this,"id_bodegaCompoKit"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_bodegaFK_IdBodegaCompoKit.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_bodegaFK_IdBodegaCompoKit"));

						this.jComboBoxid_bodegaFK_IdBodegaCompoKit.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_bodegaFK_IdBodegaCompoKit"));

					} else {
						this.jComboBoxid_bodegaFK_IdBodegaCompoKit.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_bodegaFK_IdBodegaCompoKit"));

						this.jComboBoxid_bodegaFK_IdBodegaCompoKit.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_bodegaFK_IdBodegaCompoKit"));

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
					if(this.jInternalFrameDetalleFormCompoKit!=null) {
						this.jInternalFrameDetalleFormCompoKit.jComboBoxid_productoCompoKit.addItemListener(new ComboBoxItemListener(this,"id_productoCompoKit"));
						this.jInternalFrameDetalleFormCompoKit.jComboBoxid_productoCompoKit.addFocusListener(new ComboBoxFocusListener(this,"id_productoCompoKit"));
					}
				} else {
					if(this.jInternalFrameDetalleFormCompoKit!=null) {
						this.jInternalFrameDetalleFormCompoKit.jComboBoxid_productoCompoKit.addActionListener(new ComboBoxActionListener(this,"id_productoCompoKit"));
						this.jInternalFrameDetalleFormCompoKit.jComboBoxid_productoCompoKit.addFocusListener(new ComboBoxFocusListener(this,"id_productoCompoKit"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_productoFK_IdProductoCompoKit.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_productoFK_IdProductoCompoKit"));

						this.jComboBoxid_productoFK_IdProductoCompoKit.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_productoFK_IdProductoCompoKit"));

					} else {
						this.jComboBoxid_productoFK_IdProductoCompoKit.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_productoFK_IdProductoCompoKit"));

						this.jComboBoxid_productoFK_IdProductoCompoKit.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_productoFK_IdProductoCompoKit"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosForeignKeyCompoKit()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCompoKit();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCompoKit(CompoKit compokit)throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(compokit.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(compokit.getid_producto(),false,"Formulario");
			this.setActualKitForeignKey(compokit.getid_kit(),false,"Formulario");
			this.setActualUnidadForeignKey(compokit.getid_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCompoKit(CompoKit compokit,String sTipoEvento)throws Exception {	
		try {
			
			

				if(compokit.getProducto()!=null && !sTipoEvento.equals("id_productoCompoKit")) { //sTipoEvento Evita Bucle Infinito

					this.productosForeignKey=new ArrayList<Producto>();
					this.productosForeignKey.add(compokit.getProducto());

					this.addItemDefectoCombosForeignKeyProducto();
					this.cargarCombosFrameProductosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCompoKit()throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(this.compokitConstantesFunciones.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(this.compokitConstantesFunciones.getid_producto(),false,"Formulario");
			this.setActualKitForeignKey(this.compokitConstantesFunciones.getid_kit(),false,"Formulario");
			this.setActualUnidadForeignKey(this.compokitConstantesFunciones.getid_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCompoKit()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCompoKit()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCompoKit()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCompoKit()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCompoKit()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");
			this.cargarCombosFrameKitsForeignKey("Todos");
			this.cargarCombosFrameUnidadsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCompoKit(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameKitsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUnidadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCompoKit()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCompoKit.jComboBoxid_empresaCompoKit!=null && this.jInternalFrameDetalleFormCompoKit.jComboBoxid_empresaCompoKit.getItemCount()>0) {
				this.jInternalFrameDetalleFormCompoKit.jComboBoxid_empresaCompoKit.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCompoKit.jComboBoxid_sucursalCompoKit!=null && this.jInternalFrameDetalleFormCompoKit.jComboBoxid_sucursalCompoKit.getItemCount()>0) {
				this.jInternalFrameDetalleFormCompoKit.jComboBoxid_sucursalCompoKit.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCompoKit.jComboBoxid_bodegaCompoKit!=null && this.jInternalFrameDetalleFormCompoKit.jComboBoxid_bodegaCompoKit.getItemCount()>0) {
				this.jInternalFrameDetalleFormCompoKit.jComboBoxid_bodegaCompoKit.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCompoKit.jComboBoxid_productoCompoKit!=null && this.jInternalFrameDetalleFormCompoKit.jComboBoxid_productoCompoKit.getItemCount()>0) {
				this.jInternalFrameDetalleFormCompoKit.jComboBoxid_productoCompoKit.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCompoKit.jComboBoxid_kitCompoKit!=null && this.jInternalFrameDetalleFormCompoKit.jComboBoxid_kitCompoKit.getItemCount()>0) {
				this.jInternalFrameDetalleFormCompoKit.jComboBoxid_kitCompoKit.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCompoKit.jComboBoxid_unidadCompoKit!=null && this.jInternalFrameDetalleFormCompoKit.jComboBoxid_unidadCompoKit.getItemCount()>0) {
				this.jInternalFrameDetalleFormCompoKit.jComboBoxid_unidadCompoKit.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	





	public void recargarFormCompoKitBodega(JComboBox<?> jComboBoxGenericoBodega,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormCompoKitid_producto(jComboBoxGenericoBodega,sFormularioTipoBusqueda,"Bodega",false);
	}

	public void recargarFormCompoKitProducto(JComboBox<?> jComboBoxGenericoProducto,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormCompoKitid_unidad(jComboBoxGenericoProducto,sFormularioTipoBusqueda,"Producto",false);
	}




	
	



	public void recargarFormCompoKitid_producto(JComboBox<?> jComboBoxGenericoProducto,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Bodega")){
				this.setActualParaGuardarBodegaForeignKey(this.compokit,jComboBoxGenericoProducto);
			}

			if(this.compokit.getid_bodega()!=null && this.compokit.getid_bodega()!=0L) {
				sFinalQuery+="  WHERE  id_bodega="+this.compokit.getid_bodega();
			} else {
				sFinalQuery+="  WHERE  id_bodega=-1";
			}



			//BUCLE RECURSIVO
			this.setActualProductoForeignKey(this.compokit.getid_bodega(),true,sFormularioTipoBusqueda);

			this.cargarCombosProductosForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}



	public void recargarFormCompoKitid_unidad(JComboBox<?> jComboBoxGenericoUnidad,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Producto")){
				this.setActualParaGuardarProductoForeignKey(this.compokit,jComboBoxGenericoUnidad);
			}

			if(this.compokit.getid_producto()!=null && this.compokit.getid_producto()!=0L) {
				sFinalQuery+="  WHERE  id_producto="+this.compokit.getid_producto();
			} else {
				sFinalQuery+="  WHERE  id_producto=-1";
			}



			//BUCLE RECURSIVO
			this.setActualUnidadForeignKey(this.compokit.getid_producto(),true,sFormularioTipoBusqueda);

			this.cargarCombosUnidadsForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameUnidadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public CompoKitBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CompoKitBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CompoKitBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.compokitSessionBean=new CompoKitSessionBean(); 
		this.compokitConstantesFunciones=new CompoKitConstantesFunciones(); 
		this.compokitBean=new CompoKit();//(this.compokitConstantesFunciones); 		
		this.compokitReturnGeneral=new CompoKitParameterReturnGeneral(); 
		
		this.compokitSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.compokitSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CompoKitBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CompoKitBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CompoKitBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCompoKit(true);
			
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
			
			this.compokitConstantesFunciones=new CompoKitConstantesFunciones(); 
			this.compokitBean=new CompoKit();//this.compokitConstantesFunciones); 			
			this.compokitReturnGeneral=new CompoKitParameterReturnGeneral(); 
		
			CompoKitBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Compo Kit Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.compokit=new CompoKit();
			this.compokits = new ArrayList<CompoKit>();
			this.compokitsAux = new ArrayList<CompoKit>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic=new CompoKitLogic();
				this.compokitLogic.getNewConnexionToDeep("");
			}
			
			//this.compokitSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.compokitSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCompoKit);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCompoKit!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCompoKit);	
					}
					
					if(this.jInternalFrameImportacionCompoKit!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCompoKit);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCompoKit!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCompoKit);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCompoKit!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCompoKit);
				this.jInternalFrameDetalleFormCompoKit.setVisible(false);
				this.jInternalFrameDetalleFormCompoKit.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCompoKit!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCompoKit);
					this.jInternalFrameReporteDinamicoCompoKit.setVisible(false);
					this.jInternalFrameReporteDinamicoCompoKit.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCompoKit!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCompoKit);
					this.jInternalFrameImportacionCompoKit.setVisible(false);
					this.jInternalFrameImportacionCompoKit.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCompoKit!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCompoKit);
					this.jInternalFrameOrderByCompoKit.setVisible(false);
					this.jInternalFrameOrderByCompoKit.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCompoKitActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CompoKitConstantesFunciones.INUMEROPAGINACION;
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
			
			this.compokitReturnGeneral=new CompoKitParameterReturnGeneral();
			
			this.compokitParameterGeneral=new CompoKitParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.compokitLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.compokitSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CompoKitJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.compokitSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CompoKitConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.compokitSessionBean.getEsGuardarRelacionado(),this.compokitSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CompoKitConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.compokitSessionBean.getEsGuardarRelacionado(),this.compokitSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCompoKit=false;
			this.isVisibilidadCeldaDuplicarCompoKit=true;
			this.isVisibilidadCeldaCopiarCompoKit=true;
			this.isVisibilidadCeldaVerFormCompoKit=true;
			this.isVisibilidadCeldaOrdenCompoKit=true;
			this.isVisibilidadCeldaNuevoRelacionesCompoKit=false;
			this.isVisibilidadCeldaModificarCompoKit=false;
			this.isVisibilidadCeldaActualizarCompoKit=false;
			this.isVisibilidadCeldaEliminarCompoKit=false;
			this.isVisibilidadCeldaCancelarCompoKit=false;
			this.isVisibilidadCeldaGuardarCompoKit=false;
			this.isVisibilidadCeldaGuardarCambiosCompoKit=false;
			
			
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdKit=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdUnidad=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCompoKit("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCompoKit();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCompoKit(false);
			
			this.setPermisosUsuarioCompoKit();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.compokitSessionBean.getEsGuardarRelacionado() 
				|| (this.compokitSessionBean.getEsGuardarRelacionado() && this.compokitSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCompoKitClasesRelacionadas();
			}
			
			if(this.compokitSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCompoKitClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CompoKitJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCompoKit();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCompoKit();
			}
			
			if(!this.isPermisoBusquedaCompoKit) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCompoKit.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.compokitSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioCompoKit,this.isPermisoPaginacionMedioCompoKit,this.isPermisoPaginacionTodoCompoKit);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CompoKitConstantesFunciones.getTiposSeleccionarCompoKit());
				
				this.tiposColumnasSelect=CompoKitConstantesFunciones.getTiposSeleccionarCompoKit(true);
				
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
			//if(!this.compokitSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCompoKit();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioCompoKit(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioCompoKit(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCompoKit() ;
			
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
			this.kitLogic=new KitLogic();
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
				compokitImplementable= (CompoKitImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CompoKitConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				compokitImplementableHome= (CompoKitImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CompoKitConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.compokits= new ArrayList<CompoKit>();
			this.compokitsEliminados= new ArrayList<CompoKit>();
						
			this.isEsNuevoCompoKit=false;
			this.esParaAccionDesdeFormularioCompoKit=false;
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
			this.kitsForeignKey=new ArrayList<Kit>() ;
			this.unidadsForeignKey=new ArrayList<Unidad>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCompoKit(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCompoKit();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.compokitSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CompoKitBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CompoKitConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCompoKit("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCompoKit(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCompoKit!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCompoKit();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCompoKit();
			}
			
			CompoKitBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCompoKit.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCompoKit.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCompoKit.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCompoKit(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CompoKit: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCompoKit() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCompoKit")) {
				iIndex=this.jInternalFrameDetalleFormCompoKit.jTabbedPaneRelacionesCompoKit.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCompoKit.jTabbedPaneRelacionesCompoKit.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCompoKit.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCompoKit();	
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
	
	public void cargarCombosForeignKeyCompoKit(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCompoKit(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCompoKit(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCompoKitListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCompoKit();
		
		this.cargarCombosFrameForeignKeyCompoKit();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCompoKit();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCompoKit();
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

	public void cargarCombosForeignKeyKit(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyKitListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyKit();
				this.cargarCombosFrameKitsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyProducto("Todos");
				}

			this.recargarComboTablaKit(this.kitsForeignKey);

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
	
	public void jButtonNuevoCompoKitActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.compokitSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCompoKit==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
			
			
			if(jTableDatosCompoKit.getRowCount()>=1) {
				jTableDatosCompoKit.removeRowSelectionInterval(0, jTableDatosCompoKit.getRowCount()-1);						
			}
			
			this.isEsNuevoCompoKit=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCompoKit(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCompoKit(true);			
			//this.compokit=new CompoKit();
			//this.compokit.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCompoKit(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCompoKit() ;
			
			if(CompoKitJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCompoKit(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.compokit);	
			this.actualizarInformacion("INFO_PADRE",false,this.compokit);				
			
			CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
			
			if(this.compokitSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CompoKit: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCompoKitActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CompoKit> compokitsSeleccionados=new ArrayList<CompoKit>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCompoKit.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCompoKit.getSelectedRows().length;			
			}
			
			compokitsSeleccionados=this.getCompoKitsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCompoKit--;			
				//CompoKit compokitAux= new CompoKit();			
				//compokitAux.setId(this.iIdNuevoCompoKit);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CompoKit compokitOrigen=new CompoKit();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CompoKit compokitOrigen : compokitsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCompoKit.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							compokitOrigen =(CompoKit) this.compokitLogic.getCompoKits().toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							compokitOrigen =(CompoKit) this.compokits.toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCompoKit();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.compokit.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCompoKit(compokitOrigen,this.compokit,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCompoKit(this.compokit);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.compokitLogic.getCompoKits().add(this.compokitAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.compokits.add(this.compokitAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCompoKit(false);
				
				this.jTableDatosCompoKit.setRowSelectionInterval(this.getIndiceNuevoCompoKit(), this.getIndiceNuevoCompoKit());
				
				int iLastRow =  this.jTableDatosCompoKit.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCompoKit.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCompoKit.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCompoKit(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCompoKitActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CompoKit> compokitsSeleccionados=new ArrayList<CompoKit>();									
		
			CompoKit compokitOrigen=new CompoKit();
			CompoKit compokitDestino=new CompoKit();
				
			compokitsSeleccionados=this.getCompoKitsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCompoKit.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || compokitsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCompoKit.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						compokitOrigen =(CompoKit) this.compokitLogic.getCompoKits().toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						compokitOrigen =(CompoKit) this.compokits.toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						compokitDestino =(CompoKit) this.compokitLogic.getCompoKits().toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						compokitDestino =(CompoKit) this.compokits.toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				compokitOrigen =compokitsSeleccionados.get(0);
				compokitDestino =compokitsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCompoKit(compokitOrigen,compokitDestino,true,false);
				
				compokitDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(compokitDestino,compokitLogic.getCompoKits());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(compokitDestino,compokits);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCompoKit(false);
				
				//this.jTableDatosCompoKit.setRowSelectionInterval(this.getIndiceNuevoCompoKit(), this.getIndiceNuevoCompoKit());
				
				int iLastRow =  this.jTableDatosCompoKit.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCompoKit.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCompoKit.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCompoKit(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCompoKitActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCompoKit==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCompoKit.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCompoKitActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCompoKit.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCompoKit.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCompoKit.setVisible(!isVisible);
			this.jPanelPaginacionCompoKit.setVisible(!isVisible);
			this.jPanelAccionesCompoKit.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCompoKitActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCompoKit();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCompoKitActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCompoKit();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCompoKitActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCompoKit();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCompoKitActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCompoKit();
			
			this.abrirFrameOrderByCompoKit();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCompoKitActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCompoKit();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCompoKit(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCompoKit);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCompoKit.isMaximum()) {
					this.jInternalFrameDetalleFormCompoKit.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCompoKit.setSize(this.jInternalFrameDetalleFormCompoKit.iWidthFormulario,this.jInternalFrameDetalleFormCompoKit.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCompoKit.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCompoKit.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCompoKit.isMaximum()) {
						this.jInternalFrameDetalleFormCompoKit.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCompoKit.jContentPaneDetalleCompoKit.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCompoKit.jTabbedPaneRelacionesCompoKit.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCompoKit.jContentPaneDetalleCompoKit.getWidth(),CompoKitConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCompoKit.jTabbedPaneRelacionesCompoKit.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCompoKit.jContentPaneDetalleCompoKit.getWidth(),CompoKitConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCompoKit.jTabbedPaneRelacionesCompoKit.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCompoKit.jContentPaneDetalleCompoKit.getWidth(),CompoKitConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCompoKit.setVisible(true);
	        this.jInternalFrameDetalleFormCompoKit.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCompoKit() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCompoKit==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCompoKit=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCompoKit,false,this);
				} else {
					this.jInternalFrameOrderByCompoKit=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCompoKit,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCompoKit);
				this.jInternalFrameOrderByCompoKit.setVisible(false);
				this.jInternalFrameOrderByCompoKit.setSelected(false);
				
				this.jInternalFrameOrderByCompoKit.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCompoKit"));
				
				this.inicializarActualizarBindingTablaOrderByCompoKit();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCompoKit() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCompoKit==null) {
				
				this.jInternalFrameImportacionCompoKit=new ImportacionJInternalFrame(CompoKitConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCompoKit);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCompoKit);
				this.jInternalFrameImportacionCompoKit.setVisible(false);
				this.jInternalFrameImportacionCompoKit.setSelected(false);


				this.jInternalFrameImportacionCompoKit.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCompoKit"));
				this.jInternalFrameImportacionCompoKit.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCompoKit"));
				this.jInternalFrameImportacionCompoKit.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCompoKit"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCompoKit() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCompoKit==null) {
				this.jInternalFrameReporteDinamicoCompoKit=new ReporteDinamicoJInternalFrame(CompoKitConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCompoKit);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCompoKit);
				this.jInternalFrameReporteDinamicoCompoKit.setVisible(false);
				this.jInternalFrameReporteDinamicoCompoKit.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCompoKit.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCompoKit"));
				this.jInternalFrameReporteDinamicoCompoKit.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCompoKit"));
				this.jInternalFrameReporteDinamicoCompoKit.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCompoKit"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCompoKit();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCompoKit() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCompoKit);
			
	       	this.jInternalFrameDetalleFormCompoKit.setVisible(false);
	        this.jInternalFrameDetalleFormCompoKit.setSelected(false);
			
			//this.jInternalFrameDetalleFormCompoKit.dispose();
			//this.jInternalFrameDetalleFormCompoKit=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCompoKit() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCompoKit.setVisible(true);
	        this.jInternalFrameReporteDinamicoCompoKit.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCompoKit() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCompoKit.setVisible(true);
	        this.jInternalFrameImportacionCompoKit.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCompoKit() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCompoKit.setVisible(true);
	        this.jInternalFrameOrderByCompoKit.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCompoKit() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCompoKit.setVisible(false);
	        this.jInternalFrameOrderByCompoKit.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCompoKit() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCompoKit.setVisible(false);
	        this.jInternalFrameReporteDinamicoCompoKit.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCompoKit() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCompoKit.setVisible(false);
	        this.jInternalFrameImportacionCompoKit.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCompoKitActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCompoKit(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCompoKit(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCompoKit.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCompoKit(true);
			//this.isEsNuevoCompoKit=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokit =(CompoKit) this.compokitLogic.getCompoKits().toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.compokit =(CompoKit) this.compokits.toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCompoKit("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCompoKit(false) ;
			
			if(compokitSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CompoKitJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCompoKit(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCompoKit(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCompoKitActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCompoKit.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokit =(CompoKit) this.compokitLogic.getCompoKits().toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.compokit =(CompoKit) this.compokits.toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCompoKit(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCompoKit==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCompoKit.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCompoKit(true);
			//this.isEsNuevoCompoKit=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokit =(CompoKit) this.compokitLogic.getCompoKits().toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.compokit =(CompoKit) this.compokits.toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.compokit.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCompoKit("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCompoKit(false) ;
			
			if(CompoKitJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCompoKit(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCompoKit(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Producto")) {
				if(!this.compokitConstantesFunciones.cargarid_productoCompoKit) {
					this.cargarCombosProductosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingCompoKit(false,false);
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
		TableColumn tableColumnBodega=this.jTableDatosCompoKit.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCompoKit,CompoKitConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCompoKit.getSelectedRow();

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
		TableColumn tableColumnProducto=this.jTableDatosCompoKit.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCompoKit,CompoKitConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCompoKit.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoTableCellFk.setRowActual(intSelectedRow);
			//productoTableCellFk.setproductosForeignKeyActual(productosForeignKey);
		//}


		if(productoTableCellFk!=null) {
			productoTableCellFk.RecargarProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaKit(List<Kit> kitsForeignKey)throws Exception{
		TableColumn tableColumnKit=this.jTableDatosCompoKit.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCompoKit,CompoKitConstantesFunciones.LABEL_IDKIT));
		TableCellEditor tableCellEditorKit =tableColumnKit.getCellEditor();

		KitTableCell kitTableCellFk=(KitTableCell)tableCellEditorKit;

		if(kitTableCellFk!=null) {
			kitTableCellFk.setkitsForeignKey(kitsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCompoKit.getSelectedRow();

		//if(intSelectedRow<=0) {
			//kitTableCellFk.setRowActual(intSelectedRow);
			//kitTableCellFk.setkitsForeignKeyActual(kitsForeignKey);
		//}


		if(kitTableCellFk!=null) {
			kitTableCellFk.RecargarKitsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaUnidad(List<Unidad> unidadsForeignKey)throws Exception{
		TableColumn tableColumnUnidad=this.jTableDatosCompoKit.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCompoKit,CompoKitConstantesFunciones.LABEL_IDUNIDAD));
		TableCellEditor tableCellEditorUnidad =tableColumnUnidad.getCellEditor();

		UnidadTableCell unidadTableCellFk=(UnidadTableCell)tableCellEditorUnidad;

		if(unidadTableCellFk!=null) {
			unidadTableCellFk.setunidadsForeignKey(unidadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCompoKit.getSelectedRow();

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
	
	public void jButtonActualizarCompoKitActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCompoKit(false);
			
			//if(!this.isEsNuevoCompoKit) {								
				int intSelectedRow = this.jTableDatosCompoKit.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokit =(CompoKit) this.compokitLogic.getCompoKits().toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.compokit =(CompoKit) this.compokits.toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CompoKitJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCompoKit(this.compokit,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCompoKit(this.compokit);
				
			}
			
			if(this.permiteMantenimiento(this.compokit)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.compokitSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCompoKit=true;
					this.inicializarActualizarBindingTablaCompoKit(false);
					this.isEsNuevoCompoKit=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCompoKit=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCompoKit=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCompoKit(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCompoKit(false);
				
				this.habilitarDeshabilitarControlesCompoKit(false);
			
												
				
				if(CompoKitJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCompoKit();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCompoKitActionPerformed(evt,compokitSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCompoKit(this.compokit,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCompoKit.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,compokitSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.compokit.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CompoKit.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CompoKit.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCompoKitActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCompoKit.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokit =(CompoKit) this.compokitLogic.getCompoKits().toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
				this.compokit.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.compokit =(CompoKit) this.compokits.toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
				this.compokit.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.compokit)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.compokitSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CompoKitModel) this.jTableDatosCompoKit.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCompoKit=true;
				this.inicializarActualizarBindingTablaCompoKit(false);
				this.isEsNuevoCompoKit=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCompoKit(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCompoKit(false);
				
				this.habilitarDeshabilitarControlesCompoKit(false);
				
				
				
				if(CompoKitJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCompoKit();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCompoKitActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCompoKit.getRowCount()>=1) {
				jTableDatosCompoKit.removeRowSelectionInterval(0, jTableDatosCompoKit.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCompoKit(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCompoKit(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCompoKit(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCompoKit(false) ;
			
			this.isEsNuevoCompoKit=false;
			
			if(CompoKitJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCompoKit();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCompoKitActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCompoKit(false);
				
				//SI ES MANUAL
				if(CompoKitJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCompoKit();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCompoKitActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCompoKit--;			
			//CompoKit compokitAux= new CompoKit();			
			//compokitAux.setId(this.iIdNuevoCompoKit);
			
			if(this.jInternalFrameDetalleFormCompoKit==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCompoKit();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCompoKit(this.compokit);
			
			this.compokit.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.compokitLogic.getCompoKits().add(this.compokitAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.compokits.add(this.compokitAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCompoKit(false);
			
			this.jTableDatosCompoKit.setRowSelectionInterval(this.getIndiceNuevoCompoKit(), this.getIndiceNuevoCompoKit());
			
			int iLastRow =  this.jTableDatosCompoKit.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCompoKit.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCompoKit.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCompoKit(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCompoKitActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCompoKit(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCompoKit(false);
			
			//SI ES MANUAL
			if(CompoKitJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCompoKit();
			}
			
			//this.abrirFrameTreeCompoKit();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCompoKitActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Compo KitES ?", "MANTENIMIENTO DE Compo Kit", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionCompoKit.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralCompoKit();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.compokitReturnGeneral=compokitLogic.procesarImportacionCompoKitsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.compokitParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarCompoKitReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCompoKitActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCompoKit.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCompoKit.setFileImportacion(this.jInternalFrameImportacionCompoKit.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCompoKit.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCompoKit.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCompoKit.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCompoKit.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCompoKitActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CompoKit> compokitsSeleccionados=new ArrayList<CompoKit>();		

		compokitsSeleccionados=this.getCompoKitsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCompoKit.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCompoKit.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CompoKitBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CompoKitBaseDesign.jrxml";
			
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
			
			this.generarReporteCompoKits("Todos",compokitsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.compokitSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Compo Kit",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCompoKit.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCompoKit.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CompoKitConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CompoKitConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CompoKitConstantesFunciones.LABEL_IDBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Bodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Bodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Bodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Bodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CompoKitConstantesFunciones.LABEL_IDPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Producto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Producto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Producto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Producto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CompoKitConstantesFunciones.LABEL_IDKIT:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Kit_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Kit_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Kit_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Kit_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CompoKitConstantesFunciones.LABEL_IDUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Unidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Unidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Unidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Unidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CompoKitConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CompoKitConstantesFunciones.LABEL_VALORINGRESO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorIngreso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorIngreso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorIngreso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorIngreso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CompoKitConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoCompoKit.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCompoKit.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCompoKit.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CompoKitConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case CompoKitConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case CompoKitConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoria="id_bodega";
					break;

				case CompoKitConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoria="id_producto";
					break;

				case CompoKitConstantesFunciones.LABEL_IDKIT:
					sNombreCampoCategoria="id_kit";
					break;

				case CompoKitConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoria="id_unidad";
					break;

				case CompoKitConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;

				case CompoKitConstantesFunciones.LABEL_VALORINGRESO:
					sNombreCampoCategoria="valor_ingreso";
					break;

				case CompoKitConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCompoKit.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CompoKitConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case CompoKitConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case CompoKitConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoriaValor="id_bodega";
					break;

				case CompoKitConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoriaValor="id_producto";
					break;

				case CompoKitConstantesFunciones.LABEL_IDKIT:
					sNombreCampoCategoriaValor="id_kit";
					break;

				case CompoKitConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoriaValor="id_unidad";
					break;

				case CompoKitConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;

				case CompoKitConstantesFunciones.LABEL_VALORINGRESO:
					sNombreCampoCategoriaValor="valor_ingreso";
					break;

				case CompoKitConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCompoKit.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCompoKit.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CompoKitConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case CompoKitConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case CompoKitConstantesFunciones.LABEL_IDBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_bodega");
					break;

				case CompoKitConstantesFunciones.LABEL_IDPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto");
					break;

				case CompoKitConstantesFunciones.LABEL_IDKIT:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Kit",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_kit");
					break;

				case CompoKitConstantesFunciones.LABEL_IDUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Unad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_unidad");
					break;

				case CompoKitConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantidad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad");
					break;

				case CompoKitConstantesFunciones.LABEL_VALORINGRESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Ingreso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_ingreso");
					break;

				case CompoKitConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoCompoKitActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CompoKit> compokitsSeleccionados=new ArrayList<CompoKit>();		
		
		compokitsSeleccionados=this.getCompoKitsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"compokit";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CompoKits");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCompoKit.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCompoKit.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CompoKitConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CompoKitConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CompoKit compokit:compokitsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(compokit.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CompoKitConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CompoKitConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(CompoKit compokit:compokitsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(compokit.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CompoKitConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CompoKitConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(CompoKit compokit:compokitsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(compokit.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CompoKitConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CompoKitConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(CompoKit compokit:compokitsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(compokit.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CompoKitConstantesFunciones.LABEL_IDKIT:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CompoKitConstantesFunciones.LABEL_IDKIT);
					iRow++;

					for(CompoKit compokit:compokitsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(compokit.getkit_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CompoKitConstantesFunciones.LABEL_IDUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CompoKitConstantesFunciones.LABEL_IDUNIDAD);
					iRow++;

					for(CompoKit compokit:compokitsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(compokit.getunidad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CompoKitConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CompoKitConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(CompoKit compokit:compokitsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(compokit.getcantidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CompoKitConstantesFunciones.LABEL_VALORINGRESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CompoKitConstantesFunciones.LABEL_VALORINGRESO);
					iRow++;

					for(CompoKit compokit:compokitsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(compokit.getvalor_ingreso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CompoKitConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CompoKitConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(CompoKit compokit:compokitsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(compokit.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelCompoKit(row);				
			//	iRow++;
			//}				
			
			//for(CompoKit compokitAux:compokitsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCompoKit(compokitAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.compokitSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Compo Kit",JOptionPane.INFORMATION_MESSAGE);
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
				this.compokitLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCompoKit(false);
			
			//SI ES MANUAL
			if(CompoKitJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCompoKit();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCompoKitActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCompoKit(false);
			
			//SI ES MANUAL
			if(CompoKitJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCompoKit();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCompoKitActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCompoKit(false);
			
			//SI ES MANUAL
			if(CompoKitJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCompoKit();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCompoKit() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCompoKit.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCompoKit.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCompoKit.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCompoKit.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCompoKit.setMinimumSize(dimensionMinimum);
		this.jTableDatosCompoKit.setMaximumSize(dimensionMaximum);
		this.jTableDatosCompoKit.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCompoKit(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCompoKit(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCompoKit(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCompoKit(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCompoKit(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.compokitSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCompoKit(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCompoKit(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCompoKit(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CompoKitJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CompoKitJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCompoKit() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCompoKit();
		
		this.inicializarActualizarBindingBotonesManualCompoKit(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.compokitSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCompoKit();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCompoKit() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCompoKit(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCompoKit(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCompoKit.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCompoKit.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCompoKit.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCompoKit!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCompoKit.jCheckBoxPostAccionNuevoCompoKit.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCompoKit.jCheckBoxPostAccionSinCerrarCompoKit.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCompoKit.jCheckBoxPostAccionSinMensajeCompoKit.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCompoKit.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCompoKit.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCompoKit.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCompoKit!=null) {
				this.jInternalFrameDetalleFormCompoKit.jCheckBoxPostAccionNuevoCompoKit.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCompoKit.jCheckBoxPostAccionSinCerrarCompoKit.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCompoKit.jCheckBoxPostAccionSinMensajeCompoKit.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCompoKit.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCompoKit.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCompoKit!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCompoKit.jComboBoxTiposAccionesFormularioCompoKit.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCompoKit.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCompoKit!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCompoKit.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCompoKit.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCompoKit.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCompoKit.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCompoKit.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCompoKit!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCompoKit.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCompoKit.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCompoKit.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCompoKit(Boolean esInicializar) throws Exception {
		try	{	
			if(CompoKitJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCompoKit(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCompoKit() throws Exception {
		try	{
			if(CompoKitJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCompoKit();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCompoKit() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCompoKit.jComboBoxTiposAccionesFormularioCompoKit.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCompoKit.jComboBoxTiposAccionesFormularioCompoKit.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCompoKit() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCompoKit.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCompoKit.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCompoKit.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCompoKit.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCompoKit.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCompoKit.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCompoKit.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCompoKit.addItem(reporte);
			}
			
			
			if(!this.compokitSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCompoKit.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCompoKit.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCompoKit.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCompoKit.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCompoKit.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCompoKit.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCompoKit!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCompoKit.jComboBoxTiposAccionesFormularioCompoKit.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCompoKit.jComboBoxTiposAccionesFormularioCompoKit.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCompoKit.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCompoKit.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCompoKit.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCompoKit();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCompoKit() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCompoKit!=null) {
				this.jInternalFrameReporteDinamicoCompoKit.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCompoKit.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCompoKit!=null) {
				this.jInternalFrameReporteDinamicoCompoKit.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCompoKit.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCompoKit!=null) {
				
				if(this.jInternalFrameReporteDinamicoCompoKit.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCompoKit.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCompoKit.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCompoKit.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCompoKit.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCompoKit.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoCompoKit.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCompoKit.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=CompoKitConstantesFunciones.getTiposSeleccionarCompoKit(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCompoKit.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoCompoKit.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoCompoKit.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=CompoKitConstantesFunciones.getTiposSeleccionarCompoKit(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCompoKit.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoCompoKit.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCompoKit.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=CompoKitConstantesFunciones.getTiposSeleccionarCompoKit(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCompoKit.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoCompoKit.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoCompoKit.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoCompoKit.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCompoKit()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaFK_IdBodegaCompoKit.getSelectedItem()!=null){this.id_bodegaFK_IdBodega=((Bodega)this.jComboBoxid_bodegaFK_IdBodegaCompoKit.getSelectedItem()).getId();}
		if(this.jComboBoxid_kitFK_IdKitCompoKit.getSelectedItem()!=null){this.id_kitFK_IdKit=((Kit)this.jComboBoxid_kitFK_IdKitCompoKit.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoFK_IdProductoCompoKit.getSelectedItem()!=null){this.id_productoFK_IdProducto=((Producto)this.jComboBoxid_productoFK_IdProductoCompoKit.getSelectedItem()).getId();}
		if(this.jComboBoxid_unidadFK_IdUnidadCompoKit.getSelectedItem()!=null){this.id_unidadFK_IdUnidad=((Unidad)this.jComboBoxid_unidadFK_IdUnidadCompoKit.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCompoKit(Boolean esInicializar) throws Exception {				
		if(CompoKitJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCompoKit();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCompoKit() throws Exception {
		this.inicializarActualizarBindingTablaCompoKit(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCompoKit() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCompoKit.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCompoKit.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCompoKit.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CompoKitPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCompoKit.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCompoKit.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CompoKitPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCompoKitOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCompoKitOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CompoKitPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCompoKit.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCompoKit.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CompoKitPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCompoKit.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCompoKit(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=compokitLogic.getCompoKits().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=compokits.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CompoKitJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCompoKit.setModel(new CompoKitModel(this.compokitLogic.getCompoKits(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCompoKit.setModel(new CompoKitModel(this.compokits,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCompoKit!=null && this.jInternalFrameOrderByCompoKit.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCompoKit();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCompoKit.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCompoKit,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CompoKitPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CompoKitConstantesFunciones.SCLASSWEBTITULO,compokitConstantesFunciones.resaltarSeleccionarCompoKit,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CompoKitConstantesFunciones.SCLASSWEBTITULO,compokitConstantesFunciones.resaltarSeleccionarCompoKit,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCompoKit.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCompoKit,CompoKitConstantesFunciones.LABEL_ID));

		if(this.compokitConstantesFunciones.mostraridCompoKit && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CompoKitConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.compokitConstantesFunciones.resaltaridCompoKit,this.compokitConstantesFunciones.activaridCompoKit,iSizeTabla,this,true,"idCompoKit","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.compokitConstantesFunciones.resaltaridCompoKit,this.compokitConstantesFunciones.activaridCompoKit,this,true,"idCompoKit","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCompoKit.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCompoKit,CompoKitConstantesFunciones.LABEL_IDEMPRESA));

		if(this.compokitConstantesFunciones.mostrarid_empresaCompoKit && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CompoKitConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.compokitConstantesFunciones.resaltarid_empresaCompoKit,this,this.compokitConstantesFunciones.activarid_empresaCompoKit,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.compokitConstantesFunciones.resaltarid_empresaCompoKit,this,this.compokitConstantesFunciones.activarid_empresaCompoKit,false,"id_empresaCompoKit","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CompoKitPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCompoKit.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCompoKit,CompoKitConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.compokitConstantesFunciones.mostrarid_sucursalCompoKit && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CompoKitConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.compokitConstantesFunciones.resaltarid_sucursalCompoKit,this,this.compokitConstantesFunciones.activarid_sucursalCompoKit,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.compokitConstantesFunciones.resaltarid_sucursalCompoKit,this,this.compokitConstantesFunciones.activarid_sucursalCompoKit,false,"id_sucursalCompoKit","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CompoKitPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCompoKit.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCompoKit,CompoKitConstantesFunciones.LABEL_IDBODEGA));

		if(this.compokitConstantesFunciones.mostrarid_bodegaCompoKit && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CompoKitConstantesFunciones.LABEL_IDBODEGA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BodegaTableCell(this.bodegasForeignKey,this.compokitConstantesFunciones.resaltarid_bodegaCompoKit,this,this.compokitConstantesFunciones.activarid_bodegaCompoKit,iSizeTabla));
			tableColumn.setCellEditor(new BodegaTableCell(this.bodegasForeignKey,this.compokitConstantesFunciones.resaltarid_bodegaCompoKit,this,this.compokitConstantesFunciones.activarid_bodegaCompoKit,true,"id_bodegaCompoKit","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new CompoKitPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCompoKit.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCompoKit,CompoKitConstantesFunciones.LABEL_IDPRODUCTO));

		if(this.compokitConstantesFunciones.mostrarid_productoCompoKit && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CompoKitConstantesFunciones.LABEL_IDPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoTableCell(this.productosForeignKey,this.compokitConstantesFunciones.resaltarid_productoCompoKit,this,this.compokitConstantesFunciones.activarid_productoCompoKit,iSizeTabla));
			tableColumn.setCellEditor(new ProductoTableCell(this.productosForeignKey,this.compokitConstantesFunciones.resaltarid_productoCompoKit,this,this.compokitConstantesFunciones.activarid_productoCompoKit,true,"id_productoCompoKit","CON_BUSQUEDA-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new CompoKitPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCompoKit.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCompoKit,CompoKitConstantesFunciones.LABEL_IDKIT));

		if(this.compokitConstantesFunciones.mostrarid_kitCompoKit && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CompoKitConstantesFunciones.LABEL_IDKIT,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new KitTableCell(this.kitsForeignKey,this.compokitConstantesFunciones.resaltarid_kitCompoKit,this,this.compokitConstantesFunciones.activarid_kitCompoKit,iSizeTabla));
			tableColumn.setCellEditor(new KitTableCell(this.kitsForeignKey,this.compokitConstantesFunciones.resaltarid_kitCompoKit,this,this.compokitConstantesFunciones.activarid_kitCompoKit,true,"id_kitCompoKit","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CompoKitPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCompoKit.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCompoKit,CompoKitConstantesFunciones.LABEL_IDUNIDAD));

		if(this.compokitConstantesFunciones.mostrarid_unidadCompoKit && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CompoKitConstantesFunciones.LABEL_IDUNIDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new UnidadTableCell(this.unidadsForeignKey,this.compokitConstantesFunciones.resaltarid_unidadCompoKit,this,this.compokitConstantesFunciones.activarid_unidadCompoKit,iSizeTabla));
			tableColumn.setCellEditor(new UnidadTableCell(this.unidadsForeignKey,this.compokitConstantesFunciones.resaltarid_unidadCompoKit,this,this.compokitConstantesFunciones.activarid_unidadCompoKit,true,"id_unidadCompoKit","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CompoKitPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCompoKit.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCompoKit,CompoKitConstantesFunciones.LABEL_CANTIDAD));

		if(this.compokitConstantesFunciones.mostrarcantidadCompoKit && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CompoKitConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.compokitConstantesFunciones.resaltarcantidadCompoKit,this.compokitConstantesFunciones.activarcantidadCompoKit,iSizeTabla,this,true,"cantidadCompoKit","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.compokitConstantesFunciones.resaltarcantidadCompoKit,this.compokitConstantesFunciones.activarcantidadCompoKit,this,true,"cantidadCompoKit","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CompoKitPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCompoKit.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCompoKit,CompoKitConstantesFunciones.LABEL_VALORINGRESO));

		if(this.compokitConstantesFunciones.mostrarvalor_ingresoCompoKit && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CompoKitConstantesFunciones.LABEL_VALORINGRESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.compokitConstantesFunciones.resaltarvalor_ingresoCompoKit,this.compokitConstantesFunciones.activarvalor_ingresoCompoKit,iSizeTabla,this,true,"valor_ingresoCompoKit","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.compokitConstantesFunciones.resaltarvalor_ingresoCompoKit,this.compokitConstantesFunciones.activarvalor_ingresoCompoKit,this,true,"valor_ingresoCompoKit","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CompoKitPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCompoKit.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCompoKit,CompoKitConstantesFunciones.LABEL_DESCRIPCION));

		if(this.compokitConstantesFunciones.mostrardescripcionCompoKit && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CompoKitConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.compokitConstantesFunciones.resaltardescripcionCompoKit,this.compokitConstantesFunciones.activardescripcionCompoKit,iSizeTabla,this,true,"descripcionCompoKit","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.compokitConstantesFunciones.resaltardescripcionCompoKit,this.compokitConstantesFunciones.activardescripcionCompoKit,this,true,"descripcionCompoKit","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CompoKitPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.compokitSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.compokitSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.compokitSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCompoKit.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.compokitSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.compokitSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCompoKit.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCompoKit && this.isPermisoGuardarCambiosCompoKit) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.compokitSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.compokitSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCompoKit.addColumn(tableColumn);
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
			
			this.jTableDatosCompoKit.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCompoKit && this.isPermisoGuardarCambiosCompoKit) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCompoKit && this.isPermisoGuardarCambiosCompoKit) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCompoKit.moveColumn(this.jTableDatosCompoKit.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCompoKit.moveColumn(this.jTableDatosCompoKit.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCompoKit.moveColumn(this.jTableDatosCompoKit.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCompoKit.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCompoKit.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCompoKit,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CompoKitJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCompoKit.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCompoKit.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CompoKitJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CompoKitJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCompoKit.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCompoKit.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCompoKit.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=compokitLogic.getCompoKits().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=compokits.size()-1;
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
		//this.jTableDatosCompoKit.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCompoKit.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCompoKit();
			
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
				
				//this.isEsNuevoCompoKit=false;
					
				CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
			
				if(this.compokitSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCompoKit==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCompoKit.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCompoKit.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokit =(CompoKit) this.compokitLogic.getCompoKits().toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.compokit =(CompoKit) this.compokits.toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.compokit.getsType().equals("DUPLICADO")
				   || this.compokit.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCompoKit=true;
				
				} else {
					this.isEsNuevoCompoKit=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.compokitSessionBean.getEsGuardarRelacionado()) {
					if(this.compokit.getId()>=0 && !this.compokit.getIsNew()) {						
						this.isEsNuevoCompoKit=false;
						
					} else {
						this.isEsNuevoCompoKit=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCompoKit(esRelaciones);						
				
				this.seleccionarCompoKit(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.compokit.getId()<0) {
					this.isEsNuevoCompoKit=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCompoKit(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCompoKit(evt,rowIndex);
				}	
				
				if(this.compokitSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CompoKit: " + this.dDif); 
					}
				}								
				
				CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCompoKit(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.compokit)) {
					if(this.compokit.getId()>0) {
						this.compokit.setIsDeleted(true);
						
						this.compokitsEliminados.add(this.compokit);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.compokitLogic.getCompoKits().remove(this.compokit);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.compokits.remove(this.compokit);				
					}
					
					
					((CompoKitModel) this.jTableDatosCompoKit.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCompoKit(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCompoKit(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCompoKit) {
			
			if(this.jInternalFrameDetalleFormCompoKit==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCompoKit.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCompoKit.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokit =(CompoKit) this.compokitLogic.getCompoKits().toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.compokit =(CompoKit) this.compokits.toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CompoKitJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCompoKit(this.compokit);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.compokitConstantesFunciones.cargarid_empresaCompoKit || this.compokitConstantesFunciones.event_dependid_empresaCompoKit) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.compokit.getid_empresa());
									//this.inicializarActualizarBindingCompoKit(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(compokit.getEmpresa()!=null) {
							this.empresasForeignKey.add(compokit.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.compokit.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.compokitConstantesFunciones.cargarid_sucursalCompoKit || this.compokitConstantesFunciones.event_dependid_sucursalCompoKit) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.compokit.getid_sucursal());
									//this.inicializarActualizarBindingCompoKit(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(compokit.getSucursal()!=null) {
							this.sucursalsForeignKey.add(compokit.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.compokit.getid_sucursal(),false,"Formulario");

					//Bodega
					if(!this.compokitConstantesFunciones.cargarid_bodegaCompoKit || this.compokitConstantesFunciones.event_dependid_bodegaCompoKit) {
						//this.cargarCombosBodegasForeignKeyLista(" where id="+this.compokit.getid_bodega());
									//this.inicializarActualizarBindingCompoKit(false,false);
						this.bodegasForeignKey=new ArrayList<Bodega>();

						if(compokit.getBodega()!=null) {
							this.bodegasForeignKey.add(compokit.getBodega());
						}

						this.addItemDefectoCombosForeignKeyBodega();
						this.cargarCombosFrameBodegasForeignKey("Todos");
					}
					this.setActualBodegaForeignKey(this.compokit.getid_bodega(),false,"Formulario");

					//Producto
					if(!this.compokitConstantesFunciones.cargarid_productoCompoKit || this.compokitConstantesFunciones.event_dependid_productoCompoKit) {
						//this.cargarCombosProductosForeignKeyLista(" where id="+this.compokit.getid_producto());
									//this.inicializarActualizarBindingCompoKit(false,false);
						this.productosForeignKey=new ArrayList<Producto>();

						if(compokit.getProducto()!=null) {
							this.productosForeignKey.add(compokit.getProducto());
						}

						this.addItemDefectoCombosForeignKeyProducto();
						this.cargarCombosFrameProductosForeignKey("Todos");
					}
					this.setActualProductoForeignKey(this.compokit.getid_producto(),false,"Formulario");

					//Kit
					if(!this.compokitConstantesFunciones.cargarid_kitCompoKit || this.compokitConstantesFunciones.event_dependid_kitCompoKit) {
						//this.cargarCombosKitsForeignKeyLista(" where id="+this.compokit.getid_kit());
									//this.inicializarActualizarBindingCompoKit(false,false);
						this.kitsForeignKey=new ArrayList<Kit>();

						if(compokit.getKit()!=null) {
							this.kitsForeignKey.add(compokit.getKit());
						}

						this.addItemDefectoCombosForeignKeyKit();
						this.cargarCombosFrameKitsForeignKey("Todos");
					}
					this.setActualKitForeignKey(this.compokit.getid_kit(),false,"Formulario");

					//Unidad
					if(!this.compokitConstantesFunciones.cargarid_unidadCompoKit || this.compokitConstantesFunciones.event_dependid_unidadCompoKit) {
						//this.cargarCombosUnidadsForeignKeyLista(" where id="+this.compokit.getid_unidad());
									//this.inicializarActualizarBindingCompoKit(false,false);
						this.unidadsForeignKey=new ArrayList<Unidad>();

						if(compokit.getUnidad()!=null) {
							this.unidadsForeignKey.add(compokit.getUnidad());
						}

						this.addItemDefectoCombosForeignKeyUnidad();
						this.cargarCombosFrameUnidadsForeignKey("Todos");
					}
					this.setActualUnidadForeignKey(this.compokit.getid_unidad(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCompoKit("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCompoKit(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCompoKit() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCompoKit(CompoKit compokit) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCompoKit(compokit,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCompoKit(CompoKit compokit,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCompoKit(compokit);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCompoKit(compokit,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCompoKit(compokit);
	}
	
	public void setVariablesObjetoActualToFormularioCompoKit(CompoKit compokit) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCompoKit==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCompoKit.jLabelidCompoKit.setText(compokit.getId().toString());
			this.jInternalFrameDetalleFormCompoKit.jTextFieldcantidadCompoKit.setText(compokit.getcantidad().toString());
			this.jInternalFrameDetalleFormCompoKit.jTextFieldvalor_ingresoCompoKit.setText(compokit.getvalor_ingreso().toString());
			this.jInternalFrameDetalleFormCompoKit.jTextAreadescripcionCompoKit.setText(compokit.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CompoKit compokitLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,compokitLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CompoKit compokitLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				compokitLocal=this.compokit;
			} else {
				compokitLocal=this.compokitAnterior;
			}
		}
		
		if(this.permiteMantenimiento(compokitLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCompoKit(compokitLocal,true);
					
					if(compokitSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(compokitLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.compokitSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(compokitLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCompoKit(CompoKit compokit,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCompoKit(compokit,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCompoKit(compokit);
	}
	
	public void setVariablesFormularioToObjetoActualCompoKit(CompoKit compokit,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCompoKit(compokit,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCompoKit(CompoKit compokit,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCompoKit==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCompoKit.jLabelidCompoKit.getText()==null || this.jInternalFrameDetalleFormCompoKit.jLabelidCompoKit.getText()=="" || this.jInternalFrameDetalleFormCompoKit.jLabelidCompoKit.getText()=="Id") {
				this.jInternalFrameDetalleFormCompoKit.jLabelidCompoKit.setText("0");
			}

			if(conColumnasBase) {compokit.setId(Long.parseLong(this.jInternalFrameDetalleFormCompoKit.jLabelidCompoKit.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CompoKitConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCompoKit.jLabelIdCompoKit,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			compokit.setcantidad(Integer.parseInt(this.jInternalFrameDetalleFormCompoKit.jTextFieldcantidadCompoKit.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CompoKitConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCompoKit.jLabelcantidadCompoKit,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			compokit.setvalor_ingreso(Double.parseDouble(this.jInternalFrameDetalleFormCompoKit.jTextFieldvalor_ingresoCompoKit.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CompoKitConstantesFunciones.LABEL_VALORINGRESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCompoKit.jLabelvalor_ingresoCompoKit,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			compokit.setdescripcion(this.jInternalFrameDetalleFormCompoKit.jTextAreadescripcionCompoKit.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CompoKitConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCompoKit.jLabeldescripcionCompoKit,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCompoKit(CompoKit compokitBean,CompoKit compokit,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && compokitBean.getid_bodega()!=null && !compokitBean.getid_bodega().equals(-1L))) {compokit.setid_bodega(compokitBean.getid_bodega());}
			if(conDefault || (!conDefault && compokitBean.getid_producto()!=null && !compokitBean.getid_producto().equals(-1L))) {compokit.setid_producto(compokitBean.getid_producto());}
			if(conDefault || (!conDefault && compokitBean.getid_kit()!=null && !compokitBean.getid_kit().equals(-1L))) {compokit.setid_kit(compokitBean.getid_kit());}
			if(conDefault || (!conDefault && compokitBean.getid_unidad()!=null && !compokitBean.getid_unidad().equals(-1L))) {compokit.setid_unidad(compokitBean.getid_unidad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCompoKit(CompoKit compokitOrigen,CompoKit compokit,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && compokitOrigen.getId()!=null && !compokitOrigen.getId().equals(0L))) {compokit.setId(compokitOrigen.getId());}}
			if(conDefault || (!conDefault && compokitOrigen.getid_bodega()!=null && !compokitOrigen.getid_bodega().equals(-1L))) {compokit.setid_bodega(compokitOrigen.getid_bodega());}
			if(conDefault || (!conDefault && compokitOrigen.getid_producto()!=null && !compokitOrigen.getid_producto().equals(-1L))) {compokit.setid_producto(compokitOrigen.getid_producto());}
			if(conDefault || (!conDefault && compokitOrigen.getid_kit()!=null && !compokitOrigen.getid_kit().equals(-1L))) {compokit.setid_kit(compokitOrigen.getid_kit());}
			if(conDefault || (!conDefault && compokitOrigen.getid_unidad()!=null && !compokitOrigen.getid_unidad().equals(-1L))) {compokit.setid_unidad(compokitOrigen.getid_unidad());}
			if(conDefault || (!conDefault && compokitOrigen.getcantidad()!=null && !compokitOrigen.getcantidad().equals(0))) {compokit.setcantidad(compokitOrigen.getcantidad());}
			if(conDefault || (!conDefault && compokitOrigen.getvalor_ingreso()!=null && !compokitOrigen.getvalor_ingreso().equals(0.0))) {compokit.setvalor_ingreso(compokitOrigen.getvalor_ingreso());}
			if(conDefault || (!conDefault && compokitOrigen.getdescripcion()!=null && !compokitOrigen.getdescripcion().equals(""))) {compokit.setdescripcion(compokitOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCompoKit(CompoKit compokit) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCompoKit.jLabelidCompoKit.setText(compokit.getId().toString());
			this.jInternalFrameDetalleFormCompoKit.jTextFieldcantidadCompoKit.setText(compokit.getcantidad().toString());
			this.jInternalFrameDetalleFormCompoKit.jTextFieldvalor_ingresoCompoKit.setText(compokit.getvalor_ingreso().toString());
			this.jInternalFrameDetalleFormCompoKit.jTextAreadescripcionCompoKit.setText(compokit.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCompoKit(CompoKitBean compokitBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCompoKit.jLabelidCompoKit.setText(compokitBean.getId().toString());
			this.jInternalFrameDetalleFormCompoKit.jTextFieldcantidadCompoKit.setText(compokitBean.getcantidad().toString());
			this.jInternalFrameDetalleFormCompoKit.jTextFieldvalor_ingresoCompoKit.setText(compokitBean.getvalor_ingreso().toString());
			this.jInternalFrameDetalleFormCompoKit.jTextAreadescripcionCompoKit.setText(compokitBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCompoKit(CompoKitParameterReturnGeneral compokitReturnGeneral,CompoKitBean compokitBean,Boolean conDefault) throws Exception { 
		try {
			CompoKit compokitLocal=new CompoKit();
			
			compokitLocal=compokitReturnGeneral.getCompoKit();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && compokitLocal.getId()!=null && !compokitLocal.getId().equals(0L))) {compokitBean.setId(compokitLocal.getId());}}
			if(conDefault || (!conDefault && compokitLocal.getid_bodega()!=null && !compokitLocal.getid_bodega().equals(-1L))) {compokitBean.setid_bodega(compokitLocal.getid_bodega());}
			if(conDefault || (!conDefault && compokitLocal.getid_producto()!=null && !compokitLocal.getid_producto().equals(-1L))) {compokitBean.setid_producto(compokitLocal.getid_producto());}
			if(conDefault || (!conDefault && compokitLocal.getid_kit()!=null && !compokitLocal.getid_kit().equals(-1L))) {compokitBean.setid_kit(compokitLocal.getid_kit());}
			if(conDefault || (!conDefault && compokitLocal.getid_unidad()!=null && !compokitLocal.getid_unidad().equals(-1L))) {compokitBean.setid_unidad(compokitLocal.getid_unidad());}
			if(conDefault || (!conDefault && compokitLocal.getcantidad()!=null && !compokitLocal.getcantidad().equals(0))) {compokitBean.setcantidad(compokitLocal.getcantidad());}
			if(conDefault || (!conDefault && compokitLocal.getvalor_ingreso()!=null && !compokitLocal.getvalor_ingreso().equals(0.0))) {compokitBean.setvalor_ingreso(compokitLocal.getvalor_ingreso());}
			if(conDefault || (!conDefault && compokitLocal.getdescripcion()!=null && !compokitLocal.getdescripcion().equals(""))) {compokitBean.setdescripcion(compokitLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCompoKitGenerico(Long idCompoKitSeleccionado,JComboBox jComboBoxCompoKit,List<CompoKit> compokitsLocal)throws Exception {
		try {
			CompoKit  compokitTemp=null;

			for(CompoKit compokitAux:compokitsLocal) {
				if(compokitAux.getId()!=null && compokitAux.getId().equals(idCompoKitSeleccionado)) {
					compokitTemp=compokitAux;
					break;
				}
			}

			jComboBoxCompoKit.setSelectedItem(compokitTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCompoKitGenerico(JComboBox jComboBoxCompoKit,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCompoKit.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCompoKit.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCompoKit.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCompoKit.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCompoKit.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCompoKit.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCompoKit.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCompoKit.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCompoKit.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCompoKit.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			compokit=(CompoKit) compokitLogic.getCompoKits().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			compokit =(CompoKit) compokits.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!compokit.getIsNew() && !compokit.getIsChanged() && !compokit.getIsDeleted()) {
				sDescripcion=compokit.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=compokit.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!compokit.getIsNew() && !compokit.getIsChanged() && !compokit.getIsDeleted()) {
				sDescripcion=compokit.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=compokit.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!compokit.getIsNew() && !compokit.getIsChanged() && !compokit.getIsDeleted()) {
				sDescripcion=compokit.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=compokit.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!compokit.getIsNew() && !compokit.getIsChanged() && !compokit.getIsDeleted()) {
				sDescripcion=compokit.getproducto_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=compokit.getproducto_descripcion();
			}
		}

		if(sTipo.equals("Kit")) {
			//sDescripcion=this.getActualKitForeignKeyDescripcion((Long)value);
			if(!compokit.getIsNew() && !compokit.getIsChanged() && !compokit.getIsDeleted()) {
				sDescripcion=compokit.getkit_descripcion();
			} else {
				//sDescripcion=this.getActualKitForeignKeyDescripcion((Long)value);
				sDescripcion=compokit.getkit_descripcion();
			}
		}

		if(sTipo.equals("Unidad")) {
			//sDescripcion=this.getActualUnidadForeignKeyDescripcion((Long)value);
			if(!compokit.getIsNew() && !compokit.getIsChanged() && !compokit.getIsDeleted()) {
				sDescripcion=compokit.getunidad_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=compokit.getunidad_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CompoKit compokitRow=new CompoKit();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			compokitRow=(CompoKit) compokitLogic.getCompoKits().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			compokitRow=(CompoKit) compokits.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCompoKit(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCompoKit.setVisible((this.isVisibilidadCeldaNuevoCompoKit && this.isPermisoNuevoCompoKit));			
			this.jButtonDuplicarCompoKit.setVisible((this.isVisibilidadCeldaDuplicarCompoKit && this.isPermisoDuplicarCompoKit));			
			this.jButtonCopiarCompoKit.setVisible((this.isVisibilidadCeldaCopiarCompoKit && this.isPermisoCopiarCompoKit));
			this.jButtonVerFormCompoKit.setVisible((this.isVisibilidadCeldaVerFormCompoKit && this.isPermisoVerFormCompoKit));
			
			this.jButtonAbrirOrderByCompoKit.setVisible((this.isVisibilidadCeldaOrdenCompoKit && this.isPermisoOrdenCompoKit));			
			
			this.jButtonNuevoRelacionesCompoKit.setVisible((this.isVisibilidadCeldaNuevoRelacionesCompoKit && this.isPermisoNuevoCompoKit));			
			this.jButtonNuevoGuardarCambiosCompoKit.setVisible((this.isVisibilidadCeldaNuevoCompoKit && this.isPermisoNuevoCompoKit && this.isPermisoGuardarCambiosCompoKit));
			
			if(this.jInternalFrameDetalleFormCompoKit!=null) {
			this.jInternalFrameDetalleFormCompoKit.jButtonModificarCompoKit.setVisible((this.isVisibilidadCeldaModificarCompoKit && this.isPermisoActualizarCompoKit));	
			this.jInternalFrameDetalleFormCompoKit.jButtonActualizarCompoKit.setVisible((this.isVisibilidadCeldaActualizarCompoKit && this.isPermisoActualizarCompoKit));	
			this.jInternalFrameDetalleFormCompoKit.jButtonEliminarCompoKit.setVisible((this.isVisibilidadCeldaEliminarCompoKit && this.isPermisoEliminarCompoKit));
			this.jInternalFrameDetalleFormCompoKit.jButtonCancelarCompoKit.setVisible(this.isVisibilidadCeldaCancelarCompoKit);							
			this.jInternalFrameDetalleFormCompoKit.jButtonGuardarCambiosCompoKit.setVisible((this.isVisibilidadCeldaGuardarCompoKit && this.isPermisoGuardarCambiosCompoKit));			
			
			}
						
			this.jButtonGuardarCambiosTablaCompoKit.setVisible((this.isVisibilidadCeldaGuardarCambiosCompoKit && this.isPermisoGuardarCambiosCompoKit));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCompoKit.setVisible((this.isVisibilidadCeldaNuevoCompoKit && this.isPermisoNuevoCompoKit));						
			this.jButtonDuplicarToolBarCompoKit.setVisible((this.isVisibilidadCeldaDuplicarCompoKit && this.isPermisoDuplicarCompoKit));						
			this.jButtonCopiarToolBarCompoKit.setVisible((this.isVisibilidadCeldaCopiarCompoKit && this.isPermisoCopiarCompoKit));			
			this.jButtonVerFormToolBarCompoKit.setVisible((this.isVisibilidadCeldaVerFormCompoKit && this.isPermisoVerFormCompoKit));			
			this.jButtonAbrirOrderByToolBarCompoKit.setVisible((this.isVisibilidadCeldaOrdenCompoKit && this.isPermisoOrdenCompoKit));
			this.jButtonNuevoRelacionesToolBarCompoKit.setVisible((this.isVisibilidadCeldaNuevoRelacionesCompoKit && this.isPermisoNuevoCompoKit));			
			this.jButtonNuevoGuardarCambiosToolBarCompoKit.setVisible((this.isVisibilidadCeldaNuevoCompoKit && this.isPermisoNuevoCompoKit && this.isPermisoGuardarCambiosCompoKit));			
			
			if(this.jInternalFrameDetalleFormCompoKit!=null) {
			this.jInternalFrameDetalleFormCompoKit.jButtonModificarToolBarCompoKit.setVisible((this.isVisibilidadCeldaModificarCompoKit && this.isPermisoActualizarCompoKit));	
			this.jInternalFrameDetalleFormCompoKit.jButtonActualizarToolBarCompoKit.setVisible((this.isVisibilidadCeldaActualizarCompoKit  && this.isPermisoActualizarCompoKit));	
			this.jInternalFrameDetalleFormCompoKit.jButtonEliminarToolBarCompoKit.setVisible((this.isVisibilidadCeldaEliminarCompoKit && this.isPermisoEliminarCompoKit));
			this.jInternalFrameDetalleFormCompoKit.jButtonCancelarToolBarCompoKit.setVisible(this.isVisibilidadCeldaCancelarCompoKit);				
			this.jInternalFrameDetalleFormCompoKit.jButtonGuardarCambiosToolBarCompoKit.setVisible((this.isVisibilidadCeldaGuardarCompoKit && this.isPermisoGuardarCambiosCompoKit));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCompoKit.setVisible((this.isVisibilidadCeldaGuardarCambiosCompoKit && this.isPermisoGuardarCambiosCompoKit));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCompoKit.setVisible((this.isVisibilidadCeldaNuevoCompoKit && this.isPermisoNuevoCompoKit));			
			this.jMenuItemDuplicarCompoKit.setVisible((this.isVisibilidadCeldaDuplicarCompoKit && this.isPermisoDuplicarCompoKit));			
			this.jMenuItemCopiarCompoKit.setVisible((this.isVisibilidadCeldaCopiarCompoKit && this.isPermisoCopiarCompoKit));			
			this.jMenuItemVerFormCompoKit.setVisible((this.isVisibilidadCeldaVerFormCompoKit && this.isPermisoVerFormCompoKit));			
			this.jMenuItemAbrirOrderByCompoKit.setVisible((this.isVisibilidadCeldaOrdenCompoKit && this.isPermisoOrdenCompoKit));			
			//this.jMenuItemMostrarOcultarCompoKit.setVisible((this.isVisibilidadCeldaOrdenCompoKit && this.isPermisoOrdenCompoKit));
			this.jMenuItemDetalleAbrirOrderByCompoKit.setVisible((this.isVisibilidadCeldaOrdenCompoKit && this.isPermisoOrdenCompoKit));			
			//this.jMenuItemDetalleMostrarOcultarCompoKit.setVisible((this.isVisibilidadCeldaOrdenCompoKit && this.isPermisoOrdenCompoKit));			
			this.jMenuItemNuevoRelacionesCompoKit.setVisible((this.isVisibilidadCeldaNuevoRelacionesCompoKit && this.isPermisoNuevoCompoKit));			
			this.jMenuItemNuevoGuardarCambiosCompoKit.setVisible((this.isVisibilidadCeldaNuevoCompoKit && this.isPermisoNuevoCompoKit && this.isPermisoGuardarCambiosCompoKit));									
			
			if(this.jInternalFrameDetalleFormCompoKit!=null) {
			this.jInternalFrameDetalleFormCompoKit.jMenuItemModificarCompoKit.setVisible((this.isVisibilidadCeldaModificarCompoKit && this.isPermisoActualizarCompoKit));	
			this.jInternalFrameDetalleFormCompoKit.jMenuItemActualizarCompoKit.setVisible((this.isVisibilidadCeldaActualizarCompoKit && this.isPermisoActualizarCompoKit));	
			this.jInternalFrameDetalleFormCompoKit.jMenuItemEliminarCompoKit.setVisible((this.isVisibilidadCeldaEliminarCompoKit && this.isPermisoEliminarCompoKit));
			this.jInternalFrameDetalleFormCompoKit.jMenuItemCancelarCompoKit.setVisible(this.isVisibilidadCeldaCancelarCompoKit);				
			}
			
			this.jMenuItemGuardarCambiosCompoKit.setVisible((this.isVisibilidadCeldaGuardarCompoKit && this.isPermisoGuardarCambiosCompoKit));						
			this.jMenuItemGuardarCambiosTablaCompoKit.setVisible((this.isVisibilidadCeldaGuardarCambiosCompoKit && this.isPermisoGuardarCambiosCompoKit));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCompoKit=this.jButtonNuevoCompoKit.isVisible();
			this.isVisibilidadCeldaDuplicarCompoKit=this.jButtonDuplicarCompoKit.isVisible();
			this.isVisibilidadCeldaCopiarCompoKit=this.jButtonCopiarCompoKit.isVisible();
			this.isVisibilidadCeldaVerFormCompoKit=this.jButtonVerFormCompoKit.isVisible();
			
			this.isVisibilidadCeldaOrdenCompoKit=this.jButtonAbrirOrderByCompoKit.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCompoKit=this.jButtonNuevoRelacionesCompoKit.isVisible();
			this.isVisibilidadCeldaModificarCompoKit=this.jButtonModificarCompoKit.isVisible();
			
			if(this.jInternalFrameDetalleFormCompoKit!=null) {
			this.isVisibilidadCeldaActualizarCompoKit=this.jInternalFrameDetalleFormCompoKit.jButtonActualizarCompoKit.isVisible();
			this.isVisibilidadCeldaEliminarCompoKit=this.jInternalFrameDetalleFormCompoKit.jButtonEliminarCompoKit.isVisible();
			this.isVisibilidadCeldaCancelarCompoKit=this.jInternalFrameDetalleFormCompoKit.jButtonCancelarCompoKit.isVisible();
			this.isVisibilidadCeldaGuardarCompoKit=this.jInternalFrameDetalleFormCompoKit.jButtonGuardarCambiosCompoKit.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCompoKit=this.jButtonGuardarCambiosTablaCompoKit.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCompoKit=this.jButtonNuevoToolBarCompoKit.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCompoKit=this.jButtonNuevoRelacionesToolBarCompoKit.isVisible();
			
			if(this.jInternalFrameDetalleFormCompoKit!=null) {
			this.isVisibilidadCeldaModificarCompoKit=this.jInternalFrameDetalleFormCompoKit.jButtonModificarToolBarCompoKit.isVisible();
			this.isVisibilidadCeldaActualizarCompoKit=this.jInternalFrameDetalleFormCompoKit.jButtonActualizarToolBarCompoKit.isVisible();
			this.isVisibilidadCeldaEliminarCompoKit=this.jInternalFrameDetalleFormCompoKit.jButtonEliminarToolBarCompoKit.isVisible();
			this.isVisibilidadCeldaCancelarCompoKit=this.jInternalFrameDetalleFormCompoKit.jButtonCancelarToolBarCompoKit.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCompoKit=this.jButtonGuardarCambiosToolBarCompoKit.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCompoKit=this.jButtonGuardarCambiosTablaToolBarCompoKit.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCompoKit=this.jMenuItemNuevoCompoKit.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCompoKit=this.jMenuItemNuevoRelacionesCompoKit.isVisible();
			
			if(this.jInternalFrameDetalleFormCompoKit!=null) {
			this.isVisibilidadCeldaModificarCompoKit=this.jInternalFrameDetalleFormCompoKit.jMenuItemModificarCompoKit.isVisible();
			this.isVisibilidadCeldaActualizarCompoKit=this.jInternalFrameDetalleFormCompoKit.jMenuItemActualizarCompoKit.isVisible();
			this.isVisibilidadCeldaEliminarCompoKit=this.jInternalFrameDetalleFormCompoKit.jMenuItemEliminarCompoKit.isVisible();
			this.isVisibilidadCeldaCancelarCompoKit=this.jInternalFrameDetalleFormCompoKit.jMenuItemCancelarCompoKit.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCompoKit=this.jMenuItemGuardarCambiosCompoKit.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCompoKit=this.jMenuItemGuardarCambiosTablaCompoKit.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCompoKit(Boolean esInicializar) {
		if(CompoKitJInternalFrame.ISBINDING_MANUAL) {			
			if(this.compokitSessionBean.getConGuardarRelaciones()) {
				//if(this.compokitSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCompoKit();
			}
			
			this.inicializarActualizarBindingBotonesManualCompoKit(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCompoKit() {
		this.jButtonNuevoCompoKit.setVisible(this.isPermisoNuevoCompoKit);			
		this.jButtonDuplicarCompoKit.setVisible(this.isPermisoDuplicarCompoKit);			
		this.jButtonCopiarCompoKit.setVisible(this.isPermisoCopiarCompoKit);			
		this.jButtonVerFormCompoKit.setVisible(this.isPermisoVerFormCompoKit);			
		
		this.jButtonAbrirOrderByCompoKit.setVisible(this.isPermisoOrdenCompoKit);					
		
		this.jButtonNuevoRelacionesCompoKit.setVisible(this.isPermisoNuevoCompoKit);			
		
		if(this.jInternalFrameDetalleFormCompoKit!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCompoKit.jButtonModificarCompoKit.setVisible(this.isPermisoActualizarCompoKit);	
			this.jInternalFrameDetalleFormCompoKit.jButtonActualizarCompoKit.setVisible(this.isPermisoActualizarCompoKit);	
			this.jInternalFrameDetalleFormCompoKit.jButtonEliminarCompoKit.setVisible(this.isPermisoEliminarCompoKit);
			this.jInternalFrameDetalleFormCompoKit.jButtonCancelarCompoKit.setVisible(this.isVisibilidadCeldaCancelarCompoKit);						
			this.jInternalFrameDetalleFormCompoKit.jButtonGuardarCambiosCompoKit.setVisible(this.isPermisoGuardarCambiosCompoKit);							
		}
		
		this.jButtonGuardarCambiosTablaCompoKit.setVisible(this.isPermisoActualizarCompoKit);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCompoKit() {
		this.jInternalFrameDetalleFormCompoKit.jButtonModificarCompoKit.setVisible(this.isPermisoActualizarCompoKit);	
		this.jInternalFrameDetalleFormCompoKit.jButtonActualizarCompoKit.setVisible(this.isPermisoActualizarCompoKit);	
		this.jInternalFrameDetalleFormCompoKit.jButtonEliminarCompoKit.setVisible(this.isPermisoEliminarCompoKit);
		this.jInternalFrameDetalleFormCompoKit.jButtonCancelarCompoKit.setVisible(this.isVisibilidadCeldaCancelarCompoKit);							
		this.jInternalFrameDetalleFormCompoKit.jButtonGuardarCambiosCompoKit.setVisible((this.isVisibilidadCeldaGuardarCompoKit && this.isPermisoGuardarCambiosCompoKit));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCompoKit() {
		if(CompoKitJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCompoKit();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCompoKit() {
	}
	
	public void jTableDatosCompoKitListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCompoKit(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCompoKitBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCompoKit.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCompoKit(this.getcompokit(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCompoKit(this.compokit);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.compokit =(CompoKit) this.compokitLogic.getCompoKits().toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.compokit =(CompoKit) this.compokits.toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.compokit==null) {
						this.compokit = new CompoKit();
					}

					this.setVariablesFormularioToObjetoActualCompoKit(this.compokit,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCompoKit(this.compokit);
				}

				if(this.compokit.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.compokit.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCompoKit(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCompoKitUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCompoKit(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCompoKit.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCompoKit.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCompoKit.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokit =(CompoKit) this.compokitLogic.getCompoKits().toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.compokit =(CompoKit) this.compokits.toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCompoKit(this.getcompokit(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCompoKit(this.compokit);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.compokitLogic.getConnexion());

				if(this.compokit.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.compokit.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCompoKit=(TitledBorder)this.jScrollPanelDatosCompoKit.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCompoKit.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCompoKitBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCompoKit.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCompoKit(this.getcompokit(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCompoKit(this.compokit);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.compokit =(CompoKit) this.compokitLogic.getCompoKits().toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.compokit =(CompoKit) this.compokits.toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.compokit==null) {
						this.compokit = new CompoKit();
					}

					this.setVariablesFormularioToObjetoActualCompoKit(this.compokit,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCompoKit(this.compokit);
				}

				if(this.compokit.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.compokit.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCompoKit(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalCompoKitUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebCompoKit(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCompoKit.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCompoKit.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCompoKit.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokit =(CompoKit) this.compokitLogic.getCompoKits().toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.compokit =(CompoKit) this.compokits.toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCompoKit(this.getcompokit(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCompoKit(this.compokit);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.compokitLogic.getConnexion());

				if(this.compokit.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.compokit.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCompoKit=(TitledBorder)this.jScrollPanelDatosCompoKit.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderCompoKit.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalCompoKitBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCompoKit.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCompoKit(this.getcompokit(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCompoKit(this.compokit);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.compokit =(CompoKit) this.compokitLogic.getCompoKits().toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.compokit =(CompoKit) this.compokits.toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.compokit==null) {
						this.compokit = new CompoKit();
					}

					this.setVariablesFormularioToObjetoActualCompoKit(this.compokit,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCompoKit(this.compokit);
				}

				if(this.compokit.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.compokit.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCompoKit(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaCompoKitUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebCompoKit(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCompoKit.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCompoKit.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCompoKit.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokit =(CompoKit) this.compokitLogic.getCompoKits().toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.compokit =(CompoKit) this.compokits.toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCompoKit(this.getcompokit(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCompoKit(this.compokit);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.compokitLogic.getConnexion());

				if(this.compokit.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.compokit.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCompoKit=(TitledBorder)this.jScrollPanelDatosCompoKit.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderCompoKit.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaCompoKitBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCompoKit.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCompoKit(this.getcompokit(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCompoKit(this.compokit);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.compokit =(CompoKit) this.compokitLogic.getCompoKits().toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.compokit =(CompoKit) this.compokits.toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.compokit==null) {
						this.compokit = new CompoKit();
					}

					this.setVariablesFormularioToObjetoActualCompoKit(this.compokit,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCompoKit(this.compokit);
				}

				if(this.compokit.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.compokit.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCompoKit(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoCompoKitActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderCompoKit=null;
			TitledBorder titledBorderproducto=null;

			if(!this.jScrollPanelDatosCompoKit.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderCompoKit=(TitledBorder)this.jScrollPanelDatosCompoKit.getBorder();
				titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderCompoKit.getTitle() + " -> Producto");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_productoCompoKitUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebCompoKit(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCompoKit.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCompoKit.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCompoKit.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokit =(CompoKit) this.compokitLogic.getCompoKits().toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.compokit =(CompoKit) this.compokits.toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCompoKit(this.getcompokit(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCompoKit(this.compokit);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.compokitLogic.getConnexion());

				if(this.compokit.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.compokit.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCompoKit=(TitledBorder)this.jScrollPanelDatosCompoKit.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderCompoKit.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoCompoKitBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCompoKit.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCompoKit(this.getcompokit(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCompoKit(this.compokit);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.compokit =(CompoKit) this.compokitLogic.getCompoKits().toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.compokit =(CompoKit) this.compokits.toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.compokit==null) {
						this.compokit = new CompoKit();
					}

					this.setVariablesFormularioToObjetoActualCompoKit(this.compokit,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCompoKit(this.compokit);
				}

				if(this.compokit.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.compokit.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCompoKit(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_kitCompoKitUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisokit=true;

			idTienePermisokit=this.tienePermisosUsuarioEnPaginaWebCompoKit(KitConstantesFunciones.CLASSNAME);

			if(idTienePermisokit) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCompoKit.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCompoKit.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCompoKit.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokit =(CompoKit) this.compokitLogic.getCompoKits().toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.compokit =(CompoKit) this.compokits.toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCompoKit(this.getcompokit(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCompoKit(this.compokit);

				this.kitBeanSwingJInternalFrame=new KitBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.kitBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.kitBeanSwingJInternalFrame.getKitLogic().setConnexion(this.compokitLogic.getConnexion());

				if(this.compokit.getid_kit()!=null) {
					this.kitBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.kitBeanSwingJInternalFrame.setIdActual(this.compokit.getid_kit());
					this.kitBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.kitBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.kitBeanSwingJInternalFrame.inicializarActualizarBindingTablaKit();
				}

				JInternalFrameBase jinternalFrame =this.kitBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCompoKit=(TitledBorder)this.jScrollPanelDatosCompoKit.getBorder();
				TitledBorder titledBorderkit=(TitledBorder)this.kitBeanSwingJInternalFrame.jScrollPanelDatosKit.getBorder();

				titledBorderkit.setTitle(titledBorderCompoKit.getTitle() + " -> Kit");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_kitCompoKitBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCompoKit.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCompoKit(this.getcompokit(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCompoKit(this.compokit);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.compokit =(CompoKit) this.compokitLogic.getCompoKits().toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.compokit =(CompoKit) this.compokits.toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.compokit==null) {
						this.compokit = new CompoKit();
					}

					this.setVariablesFormularioToObjetoActualCompoKit(this.compokit,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCompoKit(this.compokit);
				}

				if(this.compokit.getid_kit()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_kit = "+this.compokit.getid_kit().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCompoKit(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_unidadCompoKitUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisounidad=true;

			idTienePermisounidad=this.tienePermisosUsuarioEnPaginaWebCompoKit(UnidadConstantesFunciones.CLASSNAME);

			if(idTienePermisounidad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCompoKit.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCompoKit.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCompoKit.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokit =(CompoKit) this.compokitLogic.getCompoKits().toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.compokit =(CompoKit) this.compokits.toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCompoKit(this.getcompokit(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCompoKit(this.compokit);

				this.unidadBeanSwingJInternalFrame=new UnidadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.unidadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.unidadBeanSwingJInternalFrame.getUnidadLogic().setConnexion(this.compokitLogic.getConnexion());

				if(this.compokit.getid_unidad()!=null) {
					this.unidadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.unidadBeanSwingJInternalFrame.setIdActual(this.compokit.getid_unidad());
					this.unidadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.inicializarActualizarBindingTablaUnidad();
				}

				JInternalFrameBase jinternalFrame =this.unidadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCompoKit=(TitledBorder)this.jScrollPanelDatosCompoKit.getBorder();
				TitledBorder titledBorderunidad=(TitledBorder)this.unidadBeanSwingJInternalFrame.jScrollPanelDatosUnidad.getBorder();

				titledBorderunidad.setTitle(titledBorderCompoKit.getTitle() + " -> Unidad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_unidadCompoKitBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCompoKit.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCompoKit(this.getcompokit(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCompoKit(this.compokit);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.compokit =(CompoKit) this.compokitLogic.getCompoKits().toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.compokit =(CompoKit) this.compokits.toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.compokit==null) {
						this.compokit = new CompoKit();
					}

					this.setVariablesFormularioToObjetoActualCompoKit(this.compokit,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCompoKit(this.compokit);
				}

				if(this.compokit.getid_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_unidad = "+this.compokit.getid_unidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCompoKit(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadCompoKitBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCompoKit.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCompoKit(this.getcompokit(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCompoKit(this.compokit);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.compokit =(CompoKit) this.compokitLogic.getCompoKits().toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.compokit =(CompoKit) this.compokits.toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.compokit==null) {
						this.compokit = new CompoKit();
					}

					this.setVariablesFormularioToObjetoActualCompoKit(this.compokit,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCompoKit(this.compokit);
				}

				if(this.compokit.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.compokit.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCompoKit(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_ingresoCompoKitBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCompoKit.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCompoKit(this.getcompokit(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCompoKit(this.compokit);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.compokit =(CompoKit) this.compokitLogic.getCompoKits().toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.compokit =(CompoKit) this.compokits.toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.compokit==null) {
						this.compokit = new CompoKit();
					}

					this.setVariablesFormularioToObjetoActualCompoKit(this.compokit,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCompoKit(this.compokit);
				}

				if(this.compokit.getvalor_ingreso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_ingreso = "+this.compokit.getvalor_ingreso().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCompoKit(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionCompoKitBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCompoKit.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCompoKit(this.getcompokit(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCompoKit(this.compokit);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.compokit =(CompoKit) this.compokitLogic.getCompoKits().toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.compokit =(CompoKit) this.compokits.toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.compokit==null) {
						this.compokit = new CompoKit();
					}

					this.setVariablesFormularioToObjetoActualCompoKit(this.compokit,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCompoKit(this.compokit);
				}

				if(this.compokit.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.compokit.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCompoKit(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdBodegaCompoKitActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCompoKit(false,false);

			this.getCompoKitsFK_IdBodega();

			this.inicializarActualizarBindingCompoKit(false);

			//if(CompoKitBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCompoKit(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCompoKitActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCompoKit(false,false);

			this.getCompoKitsFK_IdEmpresa();

			this.inicializarActualizarBindingCompoKit(false);

			//if(CompoKitBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCompoKit(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdKitCompoKitActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCompoKit(false,false);

			this.getCompoKitsFK_IdKit();

			this.inicializarActualizarBindingCompoKit(false);

			//if(CompoKitBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCompoKit(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoCompoKitActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCompoKit(false,false);

			this.getCompoKitsFK_IdProducto();

			this.inicializarActualizarBindingCompoKit(false);

			//if(CompoKitBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCompoKit(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalCompoKitActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCompoKit(false,false);

			this.getCompoKitsFK_IdSucursal();

			this.inicializarActualizarBindingCompoKit(false);

			//if(CompoKitBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCompoKit(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUnidadCompoKitActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCompoKit(false,false);

			this.getCompoKitsFK_IdUnidad();

			this.inicializarActualizarBindingCompoKit(false);

			//if(CompoKitBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCompoKit(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.compokitLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCompoKit() {
		if(this.jInternalFrameDetalleFormCompoKit!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCompoKit!=null) {
			this.jInternalFrameDetalleFormCompoKit.setVisible(false);	    			
			this.jInternalFrameDetalleFormCompoKit.dispose();
			this.jInternalFrameDetalleFormCompoKit=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCompoKit!=null) {
			this.jInternalFrameReporteDinamicoCompoKit.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCompoKit.dispose();
			this.jInternalFrameReporteDinamicoCompoKit=null;
		}
		
		if(this.jInternalFrameImportacionCompoKit!=null) {
			this.jInternalFrameImportacionCompoKit.setVisible(false);	    			
			this.jInternalFrameImportacionCompoKit.dispose();
			this.jInternalFrameImportacionCompoKit=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCompoKit();
			
			CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
			
			
			if(sTipo.equals("NuevoCompoKit")) {
				jButtonNuevoCompoKitActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCompoKit")) {
				jButtonDuplicarCompoKitActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCompoKit")) {
				jButtonCopiarCompoKitActionPerformed(evt);
			} else if(sTipo.equals("VerFormCompoKit")) {
				jButtonVerFormCompoKitActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCompoKit")) {
				jButtonNuevoCompoKitActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCompoKit")) {
				jButtonDuplicarCompoKitActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCompoKit")) {
				jButtonNuevoCompoKitActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCompoKit")) {
				jButtonDuplicarCompoKitActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCompoKit")) {
				jButtonNuevoCompoKitActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCompoKit")) {
				jButtonNuevoCompoKitActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCompoKit")) {
				jButtonNuevoCompoKitActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCompoKit")) {
				jButtonModificarCompoKitActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCompoKit")) {
				jButtonModificarCompoKitActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCompoKit")) {
				jButtonModificarCompoKitActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCompoKit")) {
				jButtonActualizarCompoKitActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCompoKit")) {
				jButtonActualizarCompoKitActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCompoKit")) {
				jButtonActualizarCompoKitActionPerformed(evt);
			} else if(sTipo.equals("EliminarCompoKit")) {
				jButtonEliminarCompoKitActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCompoKit")) {
				jButtonEliminarCompoKitActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCompoKit")) {
				jButtonEliminarCompoKitActionPerformed(evt);
			} else if(sTipo.equals("CancelarCompoKit")) {
				jButtonCancelarCompoKitActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCompoKit")) {
				jButtonCancelarCompoKitActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCompoKit")) {
				jButtonCancelarCompoKitActionPerformed(evt);
			} else if(sTipo.equals("CerrarCompoKit")) {
				jButtonCerrarCompoKitActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCompoKit")) {
				jButtonCerrarCompoKitActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCompoKit")) {
				jButtonCerrarCompoKitActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCompoKit")) {
				jButtonMostrarOcultarCompoKitActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCompoKit")) {
				jButtonCancelarCompoKitActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCompoKit")) {
				jButtonGuardarCambiosCompoKitActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCompoKit")) {
				jButtonGuardarCambiosCompoKitActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCompoKit")) {
				jButtonCopiarCompoKitActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCompoKit")) {
				jButtonVerFormCompoKitActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCompoKit")) {
				jButtonGuardarCambiosCompoKitActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCompoKit")) {
				jButtonCopiarCompoKitActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCompoKit")) {
				jButtonVerFormCompoKitActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCompoKit")) {
				jButtonGuardarCambiosCompoKitActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCompoKit")) {
				jButtonGuardarCambiosCompoKitActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCompoKit")) {
				jButtonGuardarCambiosCompoKitActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCompoKit")) {
				jButtonRecargarInformacionCompoKitActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCompoKit")) {
				jButtonRecargarInformacionCompoKitActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCompoKit")) {
				jButtonRecargarInformacionCompoKitActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCompoKit")) {
				jButtonAnterioresCompoKitActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCompoKit")) {
				jButtonAnterioresCompoKitActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCompoKit")) {
				jButtonAnterioresCompoKitActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCompoKit")) {
				jButtonSiguientesCompoKitActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCompoKit")) {
				jButtonSiguientesCompoKitActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCompoKit")) {
				jButtonSiguientesCompoKitActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCompoKit") || sTipo.equals("MenuItemDetalleAbrirOrderByCompoKit")) {
				jButtonAbrirOrderByCompoKitActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCompoKit") || sTipo.equals("MenuItemDetalleMostrarOcultarCompoKit")) {
				jButtonMostrarOcultarCompoKitActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCompoKit")) {
				jButtonNuevoGuardarCambiosCompoKitActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCompoKit")) {
				jButtonNuevoGuardarCambiosCompoKitActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCompoKit")) {
				jButtonNuevoGuardarCambiosCompoKitActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCompoKit")) {
				jButtonCerrarReporteDinamicoCompoKitActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCompoKit")) {
				jButtonGenerarReporteDinamicoCompoKitActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCompoKit")) {
				
				jButtonGenerarExcelReporteDinamicoCompoKitActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCompoKit")) {
				jButtonCerrarImportacionCompoKitActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCompoKit")) {
				
				jButtonGenerarImportacionCompoKitActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCompoKit")) {
				
				jButtonAbrirImportacionCompoKitActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCompoKit")) {
				jComboBoxTiposAccionesCompoKitActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCompoKit")) {
				jComboBoxTiposRelacionesCompoKitActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCompoKit")) {
				jComboBoxTiposAccionesCompoKitActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCompoKit")) {
				
				jComboBoxTiposSeleccionarCompoKitActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCompoKit")) {
				jTextFieldValorCampoGeneralCompoKitActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCompoKit")) {
				jButtonAbrirOrderByCompoKitActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCompoKit")) {
				jButtonAbrirOrderByCompoKitActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCompoKit")) {
				jButtonCerrarOrderByCompoKitActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCompoKitBusqueda")) {
				this.jButtonidCompoKitBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCompoKitUpdate")) {
				this.jButtonid_empresaCompoKitUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCompoKitBusqueda")) {
				this.jButtonid_empresaCompoKitBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCompoKitUpdate")) {
				this.jButtonid_sucursalCompoKitUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCompoKitBusqueda")) {
				this.jButtonid_sucursalCompoKitBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaCompoKitUpdate")) {
				this.jButtonid_bodegaCompoKitUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaCompoKitBusqueda")) {
				this.jButtonid_bodegaCompoKitBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoCompoKit")) {
				this.jButtonid_productoCompoKitActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoCompoKitUpdate")) {
				this.jButtonid_productoCompoKitUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoCompoKitBusqueda")) {
				this.jButtonid_productoCompoKitBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_kitCompoKitUpdate")) {
				this.jButtonid_kitCompoKitUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_kitCompoKitBusqueda")) {
				this.jButtonid_kitCompoKitBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadCompoKitUpdate")) {
				this.jButtonid_unidadCompoKitUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadCompoKitBusqueda")) {
				this.jButtonid_unidadCompoKitBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadCompoKitBusqueda")) {
				this.jButtoncantidadCompoKitBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_ingresoCompoKitBusqueda")) {
				this.jButtonvalor_ingresoCompoKitBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionCompoKitBusqueda")) {
				this.jButtondescripcionCompoKitBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_productoCompoKit")) {
				this.jButtonid_productoCompoKitActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdBodegaCompoKit")) {
				this.jButtonFK_IdBodegaCompoKitActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdKitCompoKit")) {
				this.jButtonFK_IdKitCompoKitActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdProductoCompoKit")) {
				this.jButtonFK_IdProductoCompoKitActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdUnidadCompoKit")) {
				this.jButtonFK_IdUnidadCompoKitActionPerformed(evt);
			}
			
			;
			
			
			CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCompoKit();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCompoKitActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.compokit);
				
				this.actualizarInformacion("INFO_PADRE",false,this.compokit);
				
				CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
				
				


				
				CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CompoKit.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CompoKit.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CompoKit compokitLocal=null;
			
			if(!this.getEsControlTabla()) {
				compokitLocal=this.compokit;
			} else {
				compokitLocal=this.compokitAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.compokit);
				
				this.actualizarInformacion("INFO_PADRE",false,this.compokit);
				
				CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
							
				
				


				
				CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CompoKit.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CompoKit.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCompoKitActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCompoKit.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitAnterior =(CompoKit) this.compokitLogic.getCompoKits().toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.compokitAnterior =(CompoKit) this.compokits.toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
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
			
			CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
			
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
			
			


			
			CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCompoKitActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.compokit);
				
				this.actualizarInformacion("INFO_PADRE",false,this.compokit);
				
				CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
								
						
				


				
				CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CompoKit.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CompoKit.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.compokit);
				
				this.actualizarInformacion("INFO_PADRE",false,this.compokit);
				
				CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
								
				
				


				
				CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CompoKit.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CompoKit.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCompoKitActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCompoKit.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitAnterior =(CompoKit) this.compokitLogic.getCompoKits().toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.compokitAnterior =(CompoKit) this.compokits.toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.compokit);
				
				this.actualizarInformacion("INFO_PADRE",false,this.compokit);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCompoKitActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCompoKit.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitAnterior =(CompoKit) this.compokitLogic.getCompoKits().toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.compokitAnterior =(CompoKit) this.compokits.toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCompoKitActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.compokit);
			
			this.actualizarInformacion("INFO_PADRE",false,this.compokit);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.compokit);
				
				this.actualizarInformacion("INFO_PADRE",false,this.compokit);
				
				CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
							
				
				


				
				CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CompoKit.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CompoKit.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCompoKitActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCompoKit.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.compokitAnterior =(CompoKit) this.compokitLogic.getCompoKits().toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.compokitAnterior =(CompoKit) this.compokits.toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
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
			
			CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
			
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
			
			


			
			CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCompoKitActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.compokit);
			
			this.actualizarInformacion("INFO_PADRE",false,this.compokit);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.compokit);
				
				this.actualizarInformacion("INFO_PADRE",false,this.compokit);
				
				CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
								
				
				


				
				CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CompoKit.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CompoKit.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCompoKitActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCompoKit.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitAnterior =(CompoKit) this.compokitLogic.getCompoKits().toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.compokitAnterior =(CompoKit) this.compokits.toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCompoKitActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.compokit);
			
			this.actualizarInformacion("INFO_PADRE",false,this.compokit);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCompoKitActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.compokit);
				
				this.actualizarInformacion("INFO_PADRE",false,this.compokit);
				
				CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCompoKit")) {
					jCheckBoxSeleccionarTodosCompoKitItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCompoKit")) {
					jCheckBoxSeleccionadosCompoKitItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCompoKit")) {
					
				}
				
				


				
				
				CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CompoKit.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CompoKit.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.compokit);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.compokit);
				
				CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
												
				
				


				
				
				CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CompoKit.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CompoKit.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCompoKitActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCompoKit.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.compokitAnterior =(CompoKit) this.compokitLogic.getCompoKits().toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.compokitAnterior =(CompoKit) this.compokits.toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCompoKitActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.compokit);
				
				this.actualizarInformacion("INFO_PADRE",false,this.compokit);
				
				CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
				
				
				CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
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
			
			CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
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
			
			


			if(sTipo.equals("id_bodegaCompoKit")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormCompoKit.jComboBoxid_bodegaCompoKit;
				}

				if(this.compokitSessionBean.getConGuardarRelaciones()) {
					//classes=CompoKitConstantesFunciones.getClassesRelationshipsOfCompoKit(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyBodega(jComboBoxGenerico,"Formulario");

				this.recargarFormCompoKit(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_bodegaFK_IdBodegaCompoKit")) {
				this.procesarActionsCombosForeignKeyBodega(jComboBoxid_bodegaFK_IdBodegaCompoKit,"FK_IdBodega");
				//recargarFormCompoKitBodega(jComboBoxid_bodegaFK_IdBodegaCompoKit,"FK_IdBodega");
			}
			 else if(sTipo.equals("id_productoCompoKit")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormCompoKit.jComboBoxid_productoCompoKit;
				}

				if(this.compokitSessionBean.getConGuardarRelaciones()) {
					//classes=CompoKitConstantesFunciones.getClassesRelationshipsOfCompoKit(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyProducto(jComboBoxGenerico,"Formulario");

				this.recargarFormCompoKit(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_productoFK_IdProductoCompoKit")) {
				this.procesarActionsCombosForeignKeyProducto(jComboBoxid_productoFK_IdProductoCompoKit,"FK_IdProducto");
				//recargarFormCompoKitProducto(jComboBoxid_productoFK_IdProductoCompoKit,"FK_IdProducto");
			}
			
			CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCompoKitActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.compokit);
				
				this.actualizarInformacion("INFO_PADRE",false,this.compokit);
				
				CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_bodegaCompoKit")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormCompoKit.jComboBoxid_bodegaCompoKit;
				}

				if(this.compokitSessionBean.getConGuardarRelaciones()) {
					//classes=CompoKitConstantesFunciones.getClassesRelationshipsOfCompoKit(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyBodega(jComboBoxGenerico,"Formulario");

				this.recargarFormCompoKit(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_bodegaFK_IdBodegaCompoKit")) {
				this.procesarActionsCombosForeignKeyBodega(jComboBoxid_bodegaFK_IdBodegaCompoKit,"FK_IdBodega");
				//recargarFormCompoKitBodega(jComboBoxid_bodegaFK_IdBodegaCompoKit,"FK_IdBodega");
			}
			 else if(sTipo.equals("id_productoCompoKit")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormCompoKit.jComboBoxid_productoCompoKit;
				}

				if(this.compokitSessionBean.getConGuardarRelaciones()) {
					//classes=CompoKitConstantesFunciones.getClassesRelationshipsOfCompoKit(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyProducto(jComboBoxGenerico,"Formulario");

				this.recargarFormCompoKit(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_productoFK_IdProductoCompoKit")) {
				this.procesarActionsCombosForeignKeyProducto(jComboBoxid_productoFK_IdProductoCompoKit,"FK_IdProducto");
				//recargarFormCompoKitProducto(jComboBoxid_productoFK_IdProductoCompoKit,"FK_IdProducto");
			}
				
				CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CompoKit.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CompoKit.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.compokit);
				
				this.actualizarInformacion("INFO_PADRE",false,this.compokit);
				
				CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
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
				
				


			if(sTipo.equals("id_bodegaCompoKit")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormCompoKit.jComboBoxid_bodegaCompoKit;
				}

				if(this.compokitSessionBean.getConGuardarRelaciones()) {
					//classes=CompoKitConstantesFunciones.getClassesRelationshipsOfCompoKit(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyBodega(jComboBoxGenerico,"Formulario");

				this.recargarFormCompoKit(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_bodegaFK_IdBodegaCompoKit")) {
				this.procesarActionsCombosForeignKeyBodega(jComboBoxid_bodegaFK_IdBodegaCompoKit,"FK_IdBodega");
				//recargarFormCompoKitBodega(jComboBoxid_bodegaFK_IdBodegaCompoKit,"FK_IdBodega");
			}
			 else if(sTipo.equals("id_productoCompoKit")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormCompoKit.jComboBoxid_productoCompoKit;
				}

				if(this.compokitSessionBean.getConGuardarRelaciones()) {
					//classes=CompoKitConstantesFunciones.getClassesRelationshipsOfCompoKit(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyProducto(jComboBoxGenerico,"Formulario");

				this.recargarFormCompoKit(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_productoFK_IdProductoCompoKit")) {
				this.procesarActionsCombosForeignKeyProducto(jComboBoxid_productoFK_IdProductoCompoKit,"FK_IdProducto");
				//recargarFormCompoKitProducto(jComboBoxid_productoFK_IdProductoCompoKit,"FK_IdProducto");
			}
				
				CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CompoKit.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CompoKit.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCompoKitActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCompoKit.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.compokitAnterior =(CompoKit) this.compokitLogic.getCompoKits().toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.compokitAnterior =(CompoKit) this.compokits.toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCompoKit")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCompoKitListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCompoKit.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.compokit =(CompoKit) this.compokitLogic.getCompoKits().toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.compokit =(CompoKit) this.compokits.toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.compokit);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCompoKit")) {
				
				}
				
				CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCompoKit")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCompoKit.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCompoKit")) {
			
			}
			
			CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCompoKit();
			
			CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
			
			if(sTipo.equals("NuevoCompoKit")) {
				jButtonNuevoCompoKitActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCompoKit")) {
				jButtonDuplicarCompoKitActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCompoKit")) {
				jButtonCopiarCompoKitActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCompoKit")) {
				jButtonVerFormCompoKitActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCompoKit")) {
				jButtonNuevoCompoKitActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCompoKit")) {
				jButtonModificarCompoKitActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCompoKit")) {
				jButtonActualizarCompoKitActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCompoKit")) {
				jButtonEliminarCompoKitActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCompoKit")) {
				jButtonGuardarCambiosCompoKitActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCompoKit")) {
				jButtonCancelarCompoKitActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCompoKit")) {
				jButtonCerrarCompoKitActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCompoKit")) {
				jButtonGuardarCambiosCompoKitActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCompoKit")) {
				jButtonNuevoGuardarCambiosCompoKitActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCompoKit")) {
				jButtonAbrirOrderByCompoKitActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCompoKit")) {
				jButtonRecargarInformacionCompoKitActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCompoKit")) {
				jButtonAnterioresCompoKitActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCompoKit")) {
				jButtonSiguientesCompoKitActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCompoKitBusqueda")) {
				this.jButtonidCompoKitBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCompoKitUpdate")) {
				this.jButtonid_empresaCompoKitUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCompoKitBusqueda")) {
				this.jButtonid_empresaCompoKitBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCompoKitUpdate")) {
				this.jButtonid_sucursalCompoKitUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCompoKitBusqueda")) {
				this.jButtonid_sucursalCompoKitBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaCompoKitUpdate")) {
				this.jButtonid_bodegaCompoKitUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaCompoKitBusqueda")) {
				this.jButtonid_bodegaCompoKitBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoCompoKit")) {
				this.jButtonid_productoCompoKitActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoCompoKitUpdate")) {
				this.jButtonid_productoCompoKitUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoCompoKitBusqueda")) {
				this.jButtonid_productoCompoKitBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_kitCompoKitUpdate")) {
				this.jButtonid_kitCompoKitUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_kitCompoKitBusqueda")) {
				this.jButtonid_kitCompoKitBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadCompoKitUpdate")) {
				this.jButtonid_unidadCompoKitUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadCompoKitBusqueda")) {
				this.jButtonid_unidadCompoKitBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadCompoKitBusqueda")) {
				this.jButtoncantidadCompoKitBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_ingresoCompoKitBusqueda")) {
				this.jButtonvalor_ingresoCompoKitBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionCompoKitBusqueda")) {
				this.jButtondescripcionCompoKitBusquedaActionPerformed(evt);
			}
			
			CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCompoKit();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCompoKit")) {
				closingInternalFrameCompoKit();
				
			} else if(sTipo.equals("jButtonCancelarCompoKit")) {
				JInternalFrameBase jInternalFrameDetalleFormCompoKit = (JInternalFrameBase)evt.getSource();
	            	
	            CompoKitBeanSwingJInternalFrame jInternalFrameParent=(CompoKitBeanSwingJInternalFrame)jInternalFrameDetalleFormCompoKit.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCompoKitActionPerformed(null);
			}
			
			CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.compokit,new Object(),this.compokitParameterGeneral,this.compokitReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCompoKit(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCompoKit(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCompoKit(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.compokit)) {
			if(!esControlTabla) {
				if(CompoKitJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCompoKit(this.compokit,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCompoKit(this.compokit);			
				}
				
				if(this.compokitSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCompoKit(this.compokit,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.compokitReturnGeneral=compokitLogic.procesarEventosCompoKitsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.compokitLogic.getCompoKits(),this.compokit,this.compokitParameterGeneral,this.isEsNuevoCompoKit,classes);//this.compokitLogic.getCompoKit()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCompoKit(this.compokitReturnGeneral,this.compokitBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.compokitSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCompoKit(classes,this.compokitReturnGeneral,this.compokitBean,false);
					}
						
					if(this.compokitReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCompoKit(this.compokitReturnGeneral.getCompoKit());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCompoKit(this.compokitReturnGeneral.getCompoKit());	
					}
						
					if(this.compokitReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCompoKit(this.compokitReturnGeneral.getCompoKit(),classes);//this.compokitBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCompoKit(this.compokit,classes);//this.compokitBean);									
				}
			
				if(CompoKitJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCompoKit(this.compokit,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCompoKit(this.compokit);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.compokitAnterior!=null) {
						this.compokit=this.compokitAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.compokitReturnGeneral=compokitLogic.procesarEventosCompoKitsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.compokitLogic.getCompoKits(),this.compokit,this.compokitParameterGeneral,this.isEsNuevoCompoKit,classes);//this.compokitLogic.getCompoKit()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.compokitSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.compokitSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.compokitReturnGeneral.getCompoKit(),compokitLogic.getCompoKits());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.compokitReturnGeneral.getCompoKit(),this.compokits);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCompoKit.repaint();
				
				//((AbstractTableModel) this.jTableDatosCompoKit.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCompoKit();
			}
		}
	}
	
	public void actualizarVisualTableDatosCompoKit() throws Exception {
		
		CompoKitModel compokitModel=(CompoKitModel)this.jTableDatosCompoKit.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			compokitModel.compokits=this.compokitLogic.getCompoKits();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			compokitModel.compokits=this.compokits;
		}
		
		
		((CompoKitModel) this.jTableDatosCompoKit.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCompoKit() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcompokitAnterior(),this.compokitLogic.getCompoKits());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcompokitAnterior(),this.compokits);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCompoKit();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCompoKit(CompoKit compokit,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
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
										
				CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.compokit,new Object(),generalEntityParameterGeneral,this.compokitReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.compokitSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CompoKitConstantesFunciones.getClassesRelationshipsOfCompoKit(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CompoKitConstantesFunciones.getClassesRelationshipsFromStringsOfCompoKit(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCompoKit(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CompoKitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.compokit,new Object(),generalEntityParameterGeneral,this.compokitReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCompoKit(CompoKitBean compokitBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCompoKit(ArrayList<Classe> classes,CompoKitReturnGeneral compokitReturnGeneral,CompoKitBean compokitBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCompoKit(CompoKit compokit,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.compokit)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCompoKit = new CompoKitDetalleFormJInternalFrame(jDesktopPane,this.compokitSessionBean.getConGuardarRelaciones(),this.compokitSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCompoKit);
		this.jInternalFrameDetalleFormCompoKit.setVisible(false);
		this.jInternalFrameDetalleFormCompoKit.setSelected(false);						
		
		this.jInternalFrameDetalleFormCompoKit.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCompoKit.compokitLogic=this.compokitLogic;
		
		this.cargarCombosFrameForeignKeyCompoKit("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCompoKit();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCompoKit();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCompoKit("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCompoKit();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCompoKit.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCompoKit"));
		
		this.jInternalFrameDetalleFormCompoKit.jButtonModificarCompoKit.addActionListener(new ButtonActionListener(this,"ModificarCompoKit"));

		
		this.jInternalFrameDetalleFormCompoKit.jButtonModificarToolBarCompoKit.addActionListener(new ButtonActionListener(this,"ModificarToolBarCompoKit"));
					
		this.jInternalFrameDetalleFormCompoKit.jMenuItemModificarCompoKit.addActionListener(new ButtonActionListener(this,"MenuItemModificarCompoKit"));		
		
		
		
		this.jInternalFrameDetalleFormCompoKit.jButtonActualizarCompoKit.addActionListener (new ButtonActionListener(this,"ActualizarCompoKit"));
		
		
		this.jInternalFrameDetalleFormCompoKit.jButtonActualizarToolBarCompoKit.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCompoKit"));
						
		this.jInternalFrameDetalleFormCompoKit.jMenuItemActualizarCompoKit.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCompoKit"));		
		
		
		
		this.jInternalFrameDetalleFormCompoKit.jButtonEliminarCompoKit.addActionListener (new ButtonActionListener(this,"EliminarCompoKit"));
		
		
		this.jInternalFrameDetalleFormCompoKit.jButtonEliminarToolBarCompoKit.addActionListener (new ButtonActionListener(this,"EliminarToolBarCompoKit"));
								
		this.jInternalFrameDetalleFormCompoKit.jMenuItemEliminarCompoKit.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCompoKit"));		
		
		
		
		this.jInternalFrameDetalleFormCompoKit.jButtonCancelarCompoKit.addActionListener (new ButtonActionListener(this,"CancelarCompoKit"));
		
		
		this.jInternalFrameDetalleFormCompoKit.jButtonCancelarToolBarCompoKit.addActionListener (new ButtonActionListener(this,"CancelarToolBarCompoKit"));
					
		this.jInternalFrameDetalleFormCompoKit.jMenuItemCancelarCompoKit.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCompoKit"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCompoKit.jMenuItemDetalleCerrarCompoKit.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCompoKit"));		
		
		
		
		this.jInternalFrameDetalleFormCompoKit.jButtonGuardarCambiosToolBarCompoKit.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCompoKit"));
		
		
		
		this.jInternalFrameDetalleFormCompoKit.jButtonGuardarCambiosToolBarCompoKit.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCompoKit"));
		
		
		
		this.jInternalFrameDetalleFormCompoKit.jComboBoxTiposAccionesFormularioCompoKit.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCompoKit"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCompoKit.jButtonidCompoKitBusqueda.addActionListener(new ButtonActionListener(this,"idCompoKitBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCompoKit.jButtonid_empresaCompoKitUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCompoKitUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCompoKit.jButtonid_empresaCompoKitBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCompoKitBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCompoKit.jButtonid_sucursalCompoKitUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCompoKitUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCompoKit.jButtonid_sucursalCompoKitBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCompoKitBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCompoKit.jButtonid_bodegaCompoKitUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaCompoKitUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCompoKit.jButtonid_bodegaCompoKitBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaCompoKitBusqueda"));
		//jButtonid_productoCompoKit.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoCompoKitActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCompoKit.jButtonid_productoCompoKit.addActionListener(new ButtonActionListener(this,"id_productoCompoKit"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCompoKit.jButtonid_productoCompoKitUpdate.addActionListener(new ButtonActionListener(this,"id_productoCompoKitUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCompoKit.jButtonid_productoCompoKitBusqueda.addActionListener(new ButtonActionListener(this,"id_productoCompoKitBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCompoKit.jButtonid_kitCompoKitUpdate.addActionListener(new ButtonActionListener(this,"id_kitCompoKitUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCompoKit.jButtonid_kitCompoKitBusqueda.addActionListener(new ButtonActionListener(this,"id_kitCompoKitBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCompoKit.jButtonid_unidadCompoKitUpdate.addActionListener(new ButtonActionListener(this,"id_unidadCompoKitUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCompoKit.jButtonid_unidadCompoKitBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadCompoKitBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCompoKit.jButtoncantidadCompoKitBusqueda.addActionListener(new ButtonActionListener(this,"cantidadCompoKitBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCompoKit.jButtonvalor_ingresoCompoKitBusqueda.addActionListener(new ButtonActionListener(this,"valor_ingresoCompoKitBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCompoKit.jButtondescripcionCompoKitBusqueda.addActionListener(new ButtonActionListener(this,"descripcionCompoKitBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCompoKit.jTabbedPaneRelacionesCompoKit.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCompoKit"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCompoKit"));
		
		if(this.jInternalFrameDetalleFormCompoKit!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCompoKit.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCompoKit"));
		}
		
		this.jTableDatosCompoKit.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCompoKit"));
		
		this.jTableDatosCompoKit.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCompoKit"));
		
		this.jButtonNuevoCompoKit.addActionListener(new ButtonActionListener(this,"NuevoCompoKit"));
		
		this.jButtonDuplicarCompoKit.addActionListener(new ButtonActionListener(this,"DuplicarCompoKit"));
		
		this.jButtonCopiarCompoKit.addActionListener(new ButtonActionListener(this,"CopiarCompoKit"));
		
		this.jButtonVerFormCompoKit.addActionListener(new ButtonActionListener(this,"VerFormCompoKit"));
		
		
		this.jButtonNuevoToolBarCompoKit.addActionListener(new ButtonActionListener(this,"NuevoToolBarCompoKit"));
			
		this.jButtonDuplicarToolBarCompoKit.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCompoKit"));
			
		this.jMenuItemNuevoCompoKit.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCompoKit"));
			
		this.jMenuItemDuplicarCompoKit.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCompoKit"));		
		
		
		this.jButtonNuevoRelacionesCompoKit.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCompoKit"));
		
		
		this.jButtonNuevoRelacionesToolBarCompoKit.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCompoKit"));
			
		this.jMenuItemNuevoRelacionesCompoKit.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCompoKit"));		
		
		
		if(this.jInternalFrameDetalleFormCompoKit!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCompoKit.jButtonModificarCompoKit.addActionListener(new ButtonActionListener(this,"ModificarCompoKit"));
		}
		
		
		if(this.jInternalFrameDetalleFormCompoKit!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCompoKit.jButtonModificarToolBarCompoKit.addActionListener(new ButtonActionListener(this,"ModificarToolBarCompoKit"));
			
			this.jInternalFrameDetalleFormCompoKit.jMenuItemModificarCompoKit.addActionListener(new ButtonActionListener(this,"MenuItemModificarCompoKit"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCompoKit!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCompoKit.jButtonActualizarCompoKit.addActionListener (new ButtonActionListener(this,"ActualizarCompoKit"));
		}
		
		
		if(this.jInternalFrameDetalleFormCompoKit!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCompoKit.jButtonActualizarToolBarCompoKit.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCompoKit"));
				
			this.jInternalFrameDetalleFormCompoKit.jMenuItemActualizarCompoKit.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCompoKit"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCompoKit!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCompoKit.jButtonEliminarCompoKit.addActionListener (new ButtonActionListener(this,"EliminarCompoKit"));
		}
		
		
		if(this.jInternalFrameDetalleFormCompoKit!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCompoKit.jButtonEliminarToolBarCompoKit.addActionListener (new ButtonActionListener(this,"EliminarToolBarCompoKit"));
						
			this.jInternalFrameDetalleFormCompoKit.jMenuItemEliminarCompoKit.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCompoKit"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCompoKit!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCompoKit.jButtonCancelarCompoKit.addActionListener (new ButtonActionListener(this,"CancelarCompoKit"));
		}
		
		
		if(this.jInternalFrameDetalleFormCompoKit!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCompoKit.jButtonCancelarToolBarCompoKit.addActionListener (new ButtonActionListener(this,"CancelarToolBarCompoKit"));
			
			this.jInternalFrameDetalleFormCompoKit.jMenuItemCancelarCompoKit.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCompoKit"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCompoKit.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCompoKit"));		
		
		
		this.jButtonCerrarCompoKit.addActionListener (new ButtonActionListener(this,"CerrarCompoKit"));
		
		
		this.jButtonCerrarToolBarCompoKit.addActionListener (new ButtonActionListener(this,"CerrarToolBarCompoKit"));
			
		this.jMenuItemCerrarCompoKit.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCompoKit"));
			
		if(this.jInternalFrameDetalleFormCompoKit!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCompoKit.jMenuItemDetalleCerrarCompoKit.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCompoKit"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCompoKit!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCompoKit.jButtonGuardarCambiosCompoKit.addActionListener (new ButtonActionListener(this,"GuardarCambiosCompoKit"));
		}
		
		
		if(this.jInternalFrameDetalleFormCompoKit!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCompoKit.jButtonGuardarCambiosToolBarCompoKit.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCompoKit"));
		}
		
		this.jButtonCopiarToolBarCompoKit.addActionListener (new ButtonActionListener(this,"CopiarToolBarCompoKit"));
			
		this.jButtonVerFormToolBarCompoKit.addActionListener (new ButtonActionListener(this,"VerFormToolBarCompoKit"));
		
		this.jMenuItemGuardarCambiosCompoKit.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCompoKit"));
			
		this.jMenuItemCopiarCompoKit.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCompoKit"));		
		
		this.jMenuItemVerFormCompoKit.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCompoKit"));		
		
		
		this.jButtonGuardarCambiosTablaCompoKit.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCompoKit"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCompoKit.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCompoKit"));
			
		this.jMenuItemGuardarCambiosTablaCompoKit.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCompoKit"));		
		
		
		
		this.jButtonRecargarInformacionCompoKit.addActionListener (new ButtonActionListener(this,"RecargarInformacionCompoKit"));
					
		this.jButtonRecargarInformacionToolBarCompoKit.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCompoKit"));
		
		this.jMenuItemRecargarInformacionCompoKit.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCompoKit"));		
		
		
		
		this.jButtonAnterioresCompoKit.addActionListener (new ButtonActionListener(this,"AnterioresCompoKit"));
		
		
		this.jButtonAnterioresToolBarCompoKit.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCompoKit"));
		
		this.jMenuItemAnterioresCompoKit.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCompoKit"));		
		
		
		this.jButtonSiguientesCompoKit.addActionListener (new ButtonActionListener(this,"SiguientesCompoKit"));
		
		
		this.jButtonSiguientesToolBarCompoKit.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCompoKit"));
			
		this.jMenuItemSiguientesCompoKit.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCompoKit"));
			
		this.jMenuItemAbrirOrderByCompoKit.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCompoKit"));
			
		this.jMenuItemMostrarOcultarCompoKit.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCompoKit"));
			
		this.jMenuItemDetalleAbrirOrderByCompoKit.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCompoKit"));
			
		this.jMenuItemDetalleMostarOcultarCompoKit.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCompoKit"));		
		
		
		this.jButtonNuevoGuardarCambiosCompoKit.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCompoKit"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCompoKit.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCompoKit"));
			
		this.jMenuItemNuevoGuardarCambiosCompoKit.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCompoKit"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCompoKit.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCompoKit"));

		this.jCheckBoxSeleccionadosCompoKit.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCompoKit"));
		
		if(this.jInternalFrameDetalleFormCompoKit!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCompoKit.jComboBoxTiposAccionesFormularioCompoKit.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCompoKit"));
		}
		
		
		this.jComboBoxTiposRelacionesCompoKit.addActionListener (new ButtonActionListener(this,"TiposRelacionesCompoKit"));
			
		this.jComboBoxTiposAccionesCompoKit.addActionListener (new ButtonActionListener(this,"TiposAccionesCompoKit"));
					
		this.jComboBoxTiposSeleccionarCompoKit.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCompoKit"));
			
		this.jTextFieldValorCampoGeneralCompoKit.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCompoKit"));		
		
		
		if(this.jInternalFrameDetalleFormCompoKit!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCompoKit.jButtonidCompoKitBusqueda.addActionListener(new ButtonActionListener(this,"idCompoKitBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCompoKit.jButtonid_empresaCompoKitUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCompoKitUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCompoKit.jButtonid_empresaCompoKitBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCompoKitBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCompoKit.jButtonid_sucursalCompoKitUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCompoKitUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCompoKit.jButtonid_sucursalCompoKitBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCompoKitBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCompoKit.jButtonid_bodegaCompoKitUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaCompoKitUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCompoKit.jButtonid_bodegaCompoKitBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaCompoKitBusqueda"));
		//jButtonid_productoCompoKit.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoCompoKitActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCompoKit.jButtonid_productoCompoKit.addActionListener(new ButtonActionListener(this,"id_productoCompoKit"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCompoKit.jButtonid_productoCompoKitUpdate.addActionListener(new ButtonActionListener(this,"id_productoCompoKitUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCompoKit.jButtonid_productoCompoKitBusqueda.addActionListener(new ButtonActionListener(this,"id_productoCompoKitBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCompoKit.jButtonid_kitCompoKitUpdate.addActionListener(new ButtonActionListener(this,"id_kitCompoKitUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCompoKit.jButtonid_kitCompoKitBusqueda.addActionListener(new ButtonActionListener(this,"id_kitCompoKitBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCompoKit.jButtonid_unidadCompoKitUpdate.addActionListener(new ButtonActionListener(this,"id_unidadCompoKitUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCompoKit.jButtonid_unidadCompoKitBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadCompoKitBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCompoKit.jButtoncantidadCompoKitBusqueda.addActionListener(new ButtonActionListener(this,"cantidadCompoKitBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCompoKit.jButtonvalor_ingresoCompoKitBusqueda.addActionListener(new ButtonActionListener(this,"valor_ingresoCompoKitBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCompoKit.jButtondescripcionCompoKitBusqueda.addActionListener(new ButtonActionListener(this,"descripcionCompoKitBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdBodegaCompoKit.addActionListener(new ButtonActionListener(this,"FK_IdBodegaCompoKit"));

			this.jButtonFK_IdKitCompoKit.addActionListener(new ButtonActionListener(this,"FK_IdKitCompoKit"));

			this.jButtonFK_IdProductoCompoKit.addActionListener(new ButtonActionListener(this,"FK_IdProductoCompoKit"));

			this.jButtonBuscarFK_IdProductoid_productoCompoKit.addActionListener(new ButtonActionListener(this,"id_productoCompoKit"));

			this.jButtonFK_IdUnidadCompoKit.addActionListener(new ButtonActionListener(this,"FK_IdUnidadCompoKit"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCompoKit!=null) {
				this.jInternalFrameReporteDinamicoCompoKit.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCompoKit"));
				this.jInternalFrameReporteDinamicoCompoKit.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCompoKit"));
				this.jInternalFrameReporteDinamicoCompoKit.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCompoKit"));
			}
			
			//this.jButtonCerrarReporteDinamicoCompoKit.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCompoKit"));				
			//this.jButtonGenerarReporteDinamicoCompoKit.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCompoKit"));
			//this.jButtonGenerarExcelReporteDinamicoCompoKit.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCompoKit"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCompoKit!=null) {
				this.jInternalFrameImportacionCompoKit.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCompoKit"));
				this.jInternalFrameImportacionCompoKit.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCompoKit"));
				this.jInternalFrameImportacionCompoKit.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCompoKit"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCompoKit.addActionListener (new ButtonActionListener(this,"AbrirOrderByCompoKit"));
			
			this.jButtonAbrirOrderByToolBarCompoKit.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCompoKit"));			
			
			if(this.jInternalFrameOrderByCompoKit!=null) {
				this.jInternalFrameOrderByCompoKit.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCompoKit"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCompoKit!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCompoKit!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCompoKit.jTabbedPaneRelacionesCompoKit.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCompoKit"));
		
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
            		closingInternalFrameCompoKit();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCompoKit.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCompoKit = (JInternalFrameBase)event.getSource();
	            	
	            CompoKitBeanSwingJInternalFrame jInternalFrameParent=(CompoKitBeanSwingJInternalFrame)jInternalFrameDetalleFormCompoKit.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCompoKitActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCompoKit.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCompoKitListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCompoKit.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCompoKit.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCompoKitActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCompoKitActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCompoKitActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCompoKit";
		inputMap = this.jButtonNuevoCompoKit.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCompoKit.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCompoKitActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCompoKitActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCompoKitActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCompoKitActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCompoKit";
		inputMap = this.jButtonNuevoRelacionesCompoKit.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCompoKit.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCompoKitActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCompoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCompoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCompoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCompoKit";
		inputMap = this.jButtonModificarCompoKit.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCompoKit.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCompoKitActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCompoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCompoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCompoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCompoKit";
		inputMap = this.jButtonActualizarCompoKit.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCompoKit.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCompoKitActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCompoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCompoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCompoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCompoKit";
		inputMap = this.jButtonEliminarCompoKit.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCompoKit.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCompoKitActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCompoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCompoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCompoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCompoKit";
		inputMap = this.jButtonCancelarCompoKit.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCompoKit.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCompoKitActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCompoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCompoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCompoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCompoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCompoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCompoKit";
		inputMap = this.jButtonCerrarCompoKit.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCompoKit.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCompoKitActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCompoKit.jButtonGuardarCambiosCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCompoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCompoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCompoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCompoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCompoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCompoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCompoKit";
		inputMap = this.jInternalFrameDetalleFormCompoKit.jButtonGuardarCambiosCompoKit.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCompoKit.jButtonGuardarCambiosCompoKit.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCompoKitActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCompoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCompoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCompoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCompoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCompoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCompoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCompoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCompoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCompoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCompoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCompoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCompoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCompoKit.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCompoKitItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCompoKit.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCompoKitActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCompoKit.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCompoKitActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCompoKit.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCompoKitActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCompoKit.jButtonidCompoKitBusqueda.addActionListener(new ButtonActionListener(this,"idCompoKitBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCompoKit.jButtonid_empresaCompoKitUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCompoKitUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCompoKit.jButtonid_empresaCompoKitBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCompoKitBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCompoKit.jButtonid_sucursalCompoKitUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCompoKitUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCompoKit.jButtonid_sucursalCompoKitBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCompoKitBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCompoKit.jButtonid_bodegaCompoKitUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaCompoKitUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCompoKit.jButtonid_bodegaCompoKitBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaCompoKitBusqueda"));
		//jButtonid_productoCompoKit.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoCompoKitActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCompoKit.jButtonid_productoCompoKit.addActionListener(new ButtonActionListener(this,"id_productoCompoKit"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCompoKit.jButtonid_productoCompoKitUpdate.addActionListener(new ButtonActionListener(this,"id_productoCompoKitUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCompoKit.jButtonid_productoCompoKitBusqueda.addActionListener(new ButtonActionListener(this,"id_productoCompoKitBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCompoKit.jButtonid_kitCompoKitUpdate.addActionListener(new ButtonActionListener(this,"id_kitCompoKitUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCompoKit.jButtonid_kitCompoKitBusqueda.addActionListener(new ButtonActionListener(this,"id_kitCompoKitBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCompoKit.jButtonid_unidadCompoKitUpdate.addActionListener(new ButtonActionListener(this,"id_unidadCompoKitUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCompoKit.jButtonid_unidadCompoKitBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadCompoKitBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCompoKit.jButtoncantidadCompoKitBusqueda.addActionListener(new ButtonActionListener(this,"cantidadCompoKitBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCompoKit.jButtonvalor_ingresoCompoKitBusqueda.addActionListener(new ButtonActionListener(this,"valor_ingresoCompoKitBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCompoKit.jButtondescripcionCompoKitBusqueda.addActionListener(new ButtonActionListener(this,"descripcionCompoKitBusqueda"));
		
		
		this.jButtonFK_IdBodegaCompoKit.addActionListener(new ButtonActionListener(this,"FK_IdBodegaCompoKit"));

		this.jButtonFK_IdKitCompoKit.addActionListener(new ButtonActionListener(this,"FK_IdKitCompoKit"));

		this.jButtonFK_IdProductoCompoKit.addActionListener(new ButtonActionListener(this,"FK_IdProductoCompoKit"));

		this.jButtonBuscarFK_IdProductoid_productoCompoKit.addActionListener(new ButtonActionListener(this,"id_productoCompoKit"));

		this.jButtonFK_IdUnidadCompoKit.addActionListener(new ButtonActionListener(this,"FK_IdUnidadCompoKit"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCompoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCompoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCompoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCompoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCompoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCompoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCompoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCompoKitActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCompoKit.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCompoKit(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CompoKit compokitAux:this.compokitLogic.getCompoKits()) {
					compokitAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CompoKit compokitAux:compokits) {
					compokitAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCompoKitItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCompoKit(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CompoKit compokitAux:this.compokitLogic.getCompoKits()) {
						compokitAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CompoKit compokitAux:compokits) {
						compokitAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CompoKit compokitAux:this.compokitLogic.getCompoKits()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CompoKit compokitAux:compokits) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCompoKit(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCompoKit.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCompoKit.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCompoKit,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCompoKitItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCompoKit(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCompoKit.getSelectedRows();
			
			CompoKit compokitLocal=new CompoKit();
			
			//this.seleccionarTodosCompoKit(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					compokitLocal =(CompoKit) this.compokitLogic.getCompoKits().toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					compokitLocal =(CompoKit) this.compokits.toArray()[this.jTableDatosCompoKit.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				compokitLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CompoKit compokitAux:this.compokitLogic.getCompoKits()) {
						compokitAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CompoKit compokitAux:compokits) {
						compokitAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCompoKit(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCompoKit.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCompoKit.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCompoKit,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCompoKitItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCompoKitParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCompoKitActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCompoKit(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCompoKit.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CompoKit compokitAux:this.compokitLogic.getCompoKits()) {
				
						if(sTipoSeleccionar.equals(CompoKitConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							compokitAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CompoKitConstantesFunciones.LABEL_VALORINGRESO)) {
							existe=true;
							compokitAux.setvalor_ingreso(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CompoKitConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							compokitAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CompoKit compokitAux:compokits) {
					
						if(sTipoSeleccionar.equals(CompoKitConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							compokitAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CompoKitConstantesFunciones.LABEL_VALORINGRESO)) {
							existe=true;
							compokitAux.setvalor_ingreso(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CompoKitConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							compokitAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCompoKit(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCompoKitActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCompoKit(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCompoKit=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCompoKit.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCompoKit.jComboBoxTiposAccionesFormularioCompoKit.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCompoKit) {				
					conSplash=true;//false;										
					
					//this.startProcessCompoKit(conSplash);
				
					this.generarReporteCompoKitsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCompoKit.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCompoKit.jComboBoxTiposAccionesFormularioCompoKit.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCompoKitsSeleccionados();
				//this.jComboBoxTiposAccionesCompoKit.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCompoKitsSeleccionados(false);
				//this.jComboBoxTiposAccionesCompoKit.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCompoKitsSeleccionados(true);
				//this.jComboBoxTiposAccionesCompoKit.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCompoKit();
				
				this.exportarCompoKitsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCompoKit.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCompoKit.jComboBoxTiposAccionesFormularioCompoKit.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCompoKits();
				//this.importarCompoKits();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCompoKit.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCompoKit.jComboBoxTiposAccionesFormularioCompoKit.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCompoKit();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCompoKitsSeleccionados();
				//this.jComboBoxTiposAccionesCompoKit.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Compo Kit", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCompoKit();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCompoKit)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCompoKit(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Compo Kit",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCompoKit.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCompoKit.jComboBoxTiposAccionesFormularioCompoKit.setSelectedIndex(0);					
				}	
			} 			
			else if(CompoKitBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCompoKit) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCompoKit(conSplash);
					
						//this.actualizarParametrosGeneralCompoKit();
						
						this.generarReporteProcesoAccionCompoKitsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCompoKit.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCompoKit.jComboBoxTiposAccionesFormularioCompoKit.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CompoKitBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Compo KitES SELECCIONADOS?", "MANTENIMIENTO DE Compo Kit", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCompoKit();
				
						this.actualizarParametrosGeneralCompoKit();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.compokitReturnGeneral=compokitLogic.procesarAccionCompoKitsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.compokitLogic.getCompoKits(),this.compokitParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCompoKitReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCompoKit.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCompoKit.jComboBoxTiposAccionesFormularioCompoKit.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCompoKit();
					
					CompoKitBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCompoKitReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCompoKit.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCompoKit.jComboBoxTiposAccionesFormularioCompoKit.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCompoKit(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCompoKitActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCompoKit();
			
			if(this.jInternalFrameDetalleFormCompoKit==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CompoKit> compokitsSeleccionados=new ArrayList<CompoKit>();		
			CompoKit compokit=new CompoKit();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCompoKit(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCompoKit.getSelectedItem();
			
			
			
			
			compokitsSeleccionados=this.getCompoKitsSeleccionados(true);
			//this.sTipoAccion;
			
			if(compokitsSeleccionados.size()==1) {
				for(CompoKit compokitAux:compokitsSeleccionados) {
					compokit=compokitAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCompoKit();
			
      		//this.finishProcessCompoKit(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCompoKitReturnGeneral() throws Exception {
		if(this.compokitReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.compokitReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.compokitReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.compokitReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.compokitReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.compokitReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCompoKit(false);
		}
		
		if(this.compokitReturnGeneral.getConRetornoLista() || this.compokitReturnGeneral.getConRetornoObjeto()) {
			if(this.compokitReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.compokitLogic.setCompoKits(this.compokitReturnGeneral.getCompoKits());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.compokitReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.compokitLogic.setCompoKit(this.compokitReturnGeneral.getCompoKit());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingCompoKit(false);
		}
	}
	
	public void actualizarParametrosGeneralCompoKit() throws Exception {
		
		
	}
	
	public ArrayList<CompoKit> getCompoKitsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CompoKit> compokitsSeleccionados=new ArrayList<CompoKit>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCompoKit) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CompoKit compokitAux:compokitLogic.getCompoKits()) {
					if(compokitAux.getIsSelected()) {
						compokitsSeleccionados.add(compokitAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CompoKit compokitAux:this.compokits) {
					if(compokitAux.getIsSelected()) {
						compokitsSeleccionados.add(compokitAux);				
					}
				}
			}
			
			if(compokitsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						compokitsSeleccionados.addAll(this.compokitLogic.getCompoKits());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						compokitsSeleccionados.addAll(this.compokits);				
					}
				}
			}
		} else {
			compokitsSeleccionados.add(this.compokit);
		}
		
		return compokitsSeleccionados;
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
	
	public void generarReporteCompoKitsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCompoKitsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCompoKitsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCompoKitsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCompoKitsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Compo Kit",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCompoKitsSeleccionados() throws Exception {
		ArrayList<CompoKit> compokitsSeleccionados=new ArrayList<CompoKit>();		
		
		compokitsSeleccionados=this.getCompoKitsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCompoKits("Todos",compokitsSeleccionados);
		
	}	
	
	public void generarReporteNormalCompoKitsSeleccionados() throws Exception {
		ArrayList<CompoKit> compokitsSeleccionados=new ArrayList<CompoKit>();		
		
		compokitsSeleccionados=this.getCompoKitsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCompoKits("Todos",compokitsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCompoKitsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CompoKit> compokitsSeleccionados=new ArrayList<CompoKit>();
		
		compokitsSeleccionados=this.getCompoKitsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCompoKits("Todos",compokitsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCompoKitsSeleccionados() throws Exception {
		ArrayList<CompoKit> compokitsSeleccionados=new ArrayList<CompoKit>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCompoKit();
		
		
		compokitsSeleccionados=this.getCompoKitsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCompoKit();
		
		
		//this.generarReporteCompoKits("Todos",compokitsSeleccionados ,compokitImplementable,compokitImplementableHome);
	}
	
	public void mostrarImportacionCompoKits() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCompoKit();
		
		this.abrirFrameImportacionCompoKit();		
		
			
		//this.generarReporteCompoKits("Todos",compokitsSeleccionados ,compokitImplementable,compokitImplementableHome);
	}
	
	public void importarCompoKits() throws Exception {		
	
	}
	
	public void exportarCompoKitsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCompoKitsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCompoKitsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCompoKitsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Compo Kit",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCompoKitsSeleccionados() throws Exception {
		ArrayList<CompoKit> compokitsSeleccionados=new ArrayList<CompoKit>();		
		
		compokitsSeleccionados=this.getCompoKitsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"compokit."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCompoKit(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CompoKit compokitAux:compokitsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCompoKit(compokitAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//compokitAux.setsDetalleGeneralEntityReporte(compokitAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.compokitSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Compo Kit",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCompoKit(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CompoKitConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CompoKitConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CompoKitConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CompoKitConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CompoKitConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CompoKitConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CompoKitConstantesFunciones.LABEL_IDKIT;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CompoKitConstantesFunciones.LABEL_IDUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CompoKitConstantesFunciones.LABEL_CANTIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CompoKitConstantesFunciones.LABEL_VALORINGRESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CompoKitConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCompoKit(CompoKit compokit,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=compokit.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=compokit.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=compokit.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=compokit.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=compokit.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=compokit.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=compokit.getkit_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=compokit.getunidad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=compokit.getcantidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=compokit.getvalor_ingreso().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=compokit.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCompoKitsSeleccionados() throws Exception {
		ArrayList<CompoKit> compokitsSeleccionados=new ArrayList<CompoKit>();		
		
		compokitsSeleccionados=this.getCompoKitsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"compokit.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CompoKits");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCompoKit(row);				
				iRow++;
			}				
			
			for(CompoKit compokitAux:compokitsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCompoKit(compokitAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.compokitSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Compo Kit",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCompoKitsSeleccionados() throws Exception {
		ArrayList<CompoKit> compokitsSeleccionados=new ArrayList<CompoKit>();		
		
		compokitsSeleccionados=this.getCompoKitsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"compokit.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("compokits");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("compokit");
			//elementRoot.appendChild(element);
		
			for(CompoKit compokitAux:compokitsSeleccionados) {
				element = document.createElement("compokit");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCompoKit(compokitAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.compokitSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Compo Kit",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCompoKit(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CompoKitConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CompoKitConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CompoKitConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CompoKitConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CompoKitConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(CompoKitConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(CompoKitConstantesFunciones.LABEL_IDKIT);
		cell = row.createCell(iColumn++);cell.setCellValue(CompoKitConstantesFunciones.LABEL_IDUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(CompoKitConstantesFunciones.LABEL_CANTIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(CompoKitConstantesFunciones.LABEL_VALORINGRESO);
		cell = row.createCell(iColumn++);cell.setCellValue(CompoKitConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCompoKit(CompoKit compokit,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(compokit.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(compokit.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(compokit.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(compokit.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(compokit.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(compokit.getkit_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(compokit.getunidad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(compokit.getcantidad());
		cell = row.createCell(iColumn++);cell.setCellValue(compokit.getvalor_ingreso());
		cell = row.createCell(iColumn++);cell.setCellValue(compokit.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlCompoKit(CompoKit compokit,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CompoKitConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(compokit.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CompoKitConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(compokit.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CompoKitConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(compokit.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(CompoKitConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(compokit.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementbodega_descripcion = document.createElement(CompoKitConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(compokit.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementproducto_descripcion = document.createElement(CompoKitConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(compokit.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementkit_descripcion = document.createElement(CompoKitConstantesFunciones.IDKIT);
		elementkit_descripcion.appendChild(document.createTextNode(compokit.getkit_descripcion()));
		element.appendChild(elementkit_descripcion);

		Element elementunidad_descripcion = document.createElement(CompoKitConstantesFunciones.IDUNIDAD);
		elementunidad_descripcion.appendChild(document.createTextNode(compokit.getunidad_descripcion()));
		element.appendChild(elementunidad_descripcion);

		Element elementcantidad = document.createElement(CompoKitConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(compokit.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);

		Element elementvalor_ingreso = document.createElement(CompoKitConstantesFunciones.VALORINGRESO);
		elementvalor_ingreso.appendChild(document.createTextNode(compokit.getvalor_ingreso().toString().trim()));
		element.appendChild(elementvalor_ingreso);

		Element elementdescripcion = document.createElement(CompoKitConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(compokit.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoCompoKitsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CompoKit> compokitsSeleccionados=new ArrayList<CompoKit>();
		
		compokitsSeleccionados=this.getCompoKitsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCompoKit(compokitsSeleccionados);
		
		this.generarReporteCompoKits("Todos",compokitsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCompoKit(ArrayList<CompoKit> compokitsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CompoKit compokitAux:compokitsSeleccionados) {
				compokitAux.setsDetalleGeneralEntityReporte(compokitAux.toString());
			
				if(sTipoSeleccionar.equals(CompoKitConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					compokitAux.setsDescripcionGeneralEntityReporte1(compokitAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CompoKitConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					compokitAux.setsDescripcionGeneralEntityReporte1(compokitAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CompoKitConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					compokitAux.setsDescripcionGeneralEntityReporte1(compokitAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CompoKitConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					compokitAux.setsDescripcionGeneralEntityReporte1(compokitAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CompoKitConstantesFunciones.LABEL_IDKIT)) {
					existe=true;
					compokitAux.setsDescripcionGeneralEntityReporte1(compokitAux.getkit_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CompoKitConstantesFunciones.LABEL_IDUNIDAD)) {
					existe=true;
					compokitAux.setsDescripcionGeneralEntityReporte1(compokitAux.getunidad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CompoKitConstantesFunciones.LABEL_CANTIDAD)) {
					existe=true;
					compokitAux.setsDescripcionGeneralEntityReporte1(compokitAux.getcantidad().toString());
				}
				 else if(sTipoSeleccionar.equals(CompoKitConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					compokitAux.setsDescripcionGeneralEntityReporte1(compokitAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CompoKitConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCompoKit(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCompoKit=true;
				this.isVisibilidadCeldaNuevoRelacionesCompoKit=true;
				this.isVisibilidadCeldaGuardarCambiosCompoKit=true;
			}
			
			this.isVisibilidadCeldaModificarCompoKit=false;
			this.isVisibilidadCeldaActualizarCompoKit=false;
			this.isVisibilidadCeldaEliminarCompoKit=false;
			this.isVisibilidadCeldaCancelarCompoKit=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCompoKit=true;
				} else {
					this.isVisibilidadCeldaGuardarCompoKit=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCompoKit=false;
			this.isVisibilidadCeldaNuevoRelacionesCompoKit=false;
			this.isVisibilidadCeldaGuardarCambiosCompoKit=false;
			this.isVisibilidadCeldaModificarCompoKit=false;
			this.isVisibilidadCeldaActualizarCompoKit=true;
			this.isVisibilidadCeldaEliminarCompoKit=false;
			this.isVisibilidadCeldaCancelarCompoKit=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCompoKit=true;
				} else {
					this.isVisibilidadCeldaGuardarCompoKit=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCompoKit=false;
			this.isVisibilidadCeldaNuevoRelacionesCompoKit=false;
			this.isVisibilidadCeldaGuardarCambiosCompoKit=false;
			this.isVisibilidadCeldaModificarCompoKit=false;
			this.isVisibilidadCeldaActualizarCompoKit=true;
			this.isVisibilidadCeldaEliminarCompoKit=true;
			this.isVisibilidadCeldaCancelarCompoKit=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCompoKit=true;
				} else {
					this.isVisibilidadCeldaGuardarCompoKit=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCompoKit=false;
			this.isVisibilidadCeldaNuevoRelacionesCompoKit=false;
			this.isVisibilidadCeldaGuardarCambiosCompoKit=false;
			this.isVisibilidadCeldaModificarCompoKit=false;
			this.isVisibilidadCeldaActualizarCompoKit=true;
			this.isVisibilidadCeldaEliminarCompoKit=false;
			this.isVisibilidadCeldaCancelarCompoKit=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCompoKit=false;
				} else {
					this.isVisibilidadCeldaGuardarCompoKit=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCompoKit=true;
			this.isVisibilidadCeldaNuevoRelacionesCompoKit=true;
			this.isVisibilidadCeldaGuardarCambiosCompoKit=true;
			this.isVisibilidadCeldaModificarCompoKit=false;
			this.isVisibilidadCeldaActualizarCompoKit=false;
			this.isVisibilidadCeldaEliminarCompoKit=false;
			this.isVisibilidadCeldaCancelarCompoKit=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCompoKit=true;
				} else {
					this.isVisibilidadCeldaGuardarCompoKit=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCompoKit=false;
			this.isVisibilidadCeldaNuevoRelacionesCompoKit=false;
			this.isVisibilidadCeldaGuardarCambiosCompoKit=false;
			this.isVisibilidadCeldaActualizarCompoKit=false;
			this.isVisibilidadCeldaEliminarCompoKit=false;
			this.isVisibilidadCeldaCancelarCompoKit=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCompoKit=false;
				} else {
					this.isVisibilidadCeldaGuardarCompoKit=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCompoKit=false;
			this.isVisibilidadCeldaNuevoRelacionesCompoKit=false;
			this.isVisibilidadCeldaGuardarCambiosCompoKit=false;
			this.isVisibilidadCeldaModificarCompoKit=true;
			this.isVisibilidadCeldaActualizarCompoKit=false;
			this.isVisibilidadCeldaEliminarCompoKit=false;
			this.isVisibilidadCeldaCancelarCompoKit=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCompoKit=false;
				} else {
					this.isVisibilidadCeldaGuardarCompoKit=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CompoKitJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCompoKit=true;
			this.isVisibilidadCeldaNuevoRelacionesCompoKit=true;
			this.isVisibilidadCeldaGuardarCambiosCompoKit=true;
		} else {
			this.actualizarEstadoPanelsCompoKit(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCompoKit=false;
			//this.isVisibilidadCeldaVerFormCompoKit=false;
			this.isVisibilidadCeldaDuplicarCompoKit=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!compokitSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCompoKit=false;
		} else {
			this.isVisibilidadCeldaNuevoCompoKit=false;
			this.isVisibilidadCeldaGuardarCambiosCompoKit=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(compokitSessionBean.getEsGuardarRelacionado()) {
			if(!compokitSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCompoKit=false;												
			}
			
			this.jButtonCerrarCompoKit.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCompoKit=false;
		}
		
		if(!this.permiteMantenimiento(this.compokit)) {
			this.isVisibilidadCeldaActualizarCompoKit=false;
			this.isVisibilidadCeldaEliminarCompoKit=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCompoKit() {
	}
	
	public void actualizarEstadoPanelsCompoKit(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCompoKit!=null) {
				this.jScrollPanelDatosEdicionCompoKit.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCompoKit!=null) {
				this.jTabbedPaneBusquedasCompoKit.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCompoKit!=null) {
				this.jScrollPanelDatosCompoKit.setVisible(true);
			}
			
			if(this.jPanelPaginacionCompoKit!=null) {
				this.jPanelPaginacionCompoKit.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCompoKit!=null) {
				this.jPanelParametrosReportesCompoKit.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCompoKit!=null) {
				this.jScrollPanelDatosEdicionCompoKit.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCompoKit!=null) {
				this.jTabbedPaneBusquedasCompoKit.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCompoKit!=null) {
				this.jScrollPanelDatosCompoKit.setVisible(false);
			}
			
			if(this.jPanelPaginacionCompoKit!=null) {
				this.jPanelPaginacionCompoKit.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCompoKit!=null) {
				this.jPanelParametrosReportesCompoKit.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCompoKit!=null) {
				this.jScrollPanelDatosEdicionCompoKit.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCompoKit!=null) {
				this.jTabbedPaneBusquedasCompoKit.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCompoKit!=null) {
				this.jScrollPanelDatosCompoKit.setVisible(false);
			}
			
			if(this.jPanelPaginacionCompoKit!=null) {
				this.jPanelPaginacionCompoKit.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCompoKit!=null) {
				this.jPanelParametrosReportesCompoKit.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCompoKit!=null) {
				this.jScrollPanelDatosEdicionCompoKit.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCompoKit!=null) {
				this.jTabbedPaneBusquedasCompoKit.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCompoKit!=null) {
				this.jScrollPanelDatosCompoKit.setVisible(false);
			}
			
			if(this.jPanelPaginacionCompoKit!=null) {
				this.jPanelPaginacionCompoKit.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCompoKit!=null) {
				this.jPanelParametrosReportesCompoKit.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCompoKit!=null) {
				this.jScrollPanelDatosEdicionCompoKit.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCompoKit!=null) {
				this.jTabbedPaneBusquedasCompoKit.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCompoKit!=null) {
				this.jScrollPanelDatosCompoKit.setVisible(true);
			}
			
			if(this.jPanelPaginacionCompoKit!=null) {
				this.jPanelPaginacionCompoKit.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCompoKit!=null) {
				this.jPanelParametrosReportesCompoKit.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCompoKit!=null) {
				this.jScrollPanelDatosEdicionCompoKit.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCompoKit!=null) {
				this.jTabbedPaneBusquedasCompoKit.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCompoKit!=null) {
				this.jScrollPanelDatosCompoKit.setVisible(true);
			}
			
			if(this.jPanelPaginacionCompoKit!=null) {
				this.jPanelPaginacionCompoKit.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCompoKit!=null) {
				this.jPanelParametrosReportesCompoKit.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCompoKit!=null) {
				this.jScrollPanelDatosEdicionCompoKit.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCompoKit!=null) {
				this.jTabbedPaneBusquedasCompoKit.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCompoKit!=null) {
				this.jScrollPanelDatosCompoKit.setVisible(true);
			}
			
			if(this.jPanelPaginacionCompoKit!=null) {
				this.jPanelPaginacionCompoKit.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCompoKit!=null) {
				this.jPanelParametrosReportesCompoKit.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.compokitSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCompoKit!=null) {
					this.jTabbedPaneBusquedasCompoKit.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCompoKit!=null) {
				this.jPanelParametrosReportesCompoKit.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.compokitSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCompoKit!=null) {
				this.jTabbedPaneBusquedasCompoKit.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCompoKit!=null) {
				this.jPanelParametrosReportesCompoKit.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdBodega=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasCompoKit.remove(jPanelFK_IdBodegaCompoKit);}

			this.isVisibilidadFK_IdKit=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdKit) {this.jTabbedPaneBusquedasCompoKit.remove(jPanelFK_IdKitCompoKit);}

			this.isVisibilidadFK_IdProducto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasCompoKit.remove(jPanelFK_IdProductoCompoKit);}

			this.isVisibilidadFK_IdUnidad=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasCompoKit.remove(jPanelFK_IdUnidadCompoKit);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdBodega=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasCompoKit.remove(jPanelFK_IdBodegaCompoKit);}

			this.isVisibilidadFK_IdKit=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdKit) {this.jTabbedPaneBusquedasCompoKit.remove(jPanelFK_IdKitCompoKit);}

			this.isVisibilidadFK_IdProducto=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasCompoKit.remove(jPanelFK_IdProductoCompoKit);}

			this.isVisibilidadFK_IdUnidad=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasCompoKit.remove(jPanelFK_IdUnidadCompoKit);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadFK_IdBodega=isParaBodega;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasCompoKit.remove(jPanelFK_IdBodegaCompoKit);}

			this.isVisibilidadFK_IdKit=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdKit) {this.jTabbedPaneBusquedasCompoKit.remove(jPanelFK_IdKitCompoKit);}

			this.isVisibilidadFK_IdProducto=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasCompoKit.remove(jPanelFK_IdProductoCompoKit);}

			this.isVisibilidadFK_IdUnidad=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasCompoKit.remove(jPanelFK_IdUnidadCompoKit);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadFK_IdBodega=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasCompoKit.remove(jPanelFK_IdBodegaCompoKit);}

			this.isVisibilidadFK_IdKit=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdKit) {this.jTabbedPaneBusquedasCompoKit.remove(jPanelFK_IdKitCompoKit);}

			this.isVisibilidadFK_IdProducto=isParaProducto;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasCompoKit.remove(jPanelFK_IdProductoCompoKit);}

			this.isVisibilidadFK_IdUnidad=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasCompoKit.remove(jPanelFK_IdUnidadCompoKit);}
		}
		
	}

	public void setVisibilidadBusquedasParaKit(Boolean isParaKit){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaKitNegation=!isParaKit;

			this.isVisibilidadFK_IdBodega=isParaKitNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasCompoKit.remove(jPanelFK_IdBodegaCompoKit);}

			this.isVisibilidadFK_IdKit=isParaKit;
			if(!this.isVisibilidadFK_IdKit) {this.jTabbedPaneBusquedasCompoKit.remove(jPanelFK_IdKitCompoKit);}

			this.isVisibilidadFK_IdProducto=isParaKitNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasCompoKit.remove(jPanelFK_IdProductoCompoKit);}

			this.isVisibilidadFK_IdUnidad=isParaKitNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasCompoKit.remove(jPanelFK_IdUnidadCompoKit);}
		}
		
	}

	public void setVisibilidadBusquedasParaUnidad(Boolean isParaUnidad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUnidadNegation=!isParaUnidad;

			this.isVisibilidadFK_IdBodega=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasCompoKit.remove(jPanelFK_IdBodegaCompoKit);}

			this.isVisibilidadFK_IdKit=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdKit) {this.jTabbedPaneBusquedasCompoKit.remove(jPanelFK_IdKitCompoKit);}

			this.isVisibilidadFK_IdProducto=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasCompoKit.remove(jPanelFK_IdProductoCompoKit);}

			this.isVisibilidadFK_IdUnidad=isParaUnidad;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasCompoKit.remove(jPanelFK_IdUnidadCompoKit);}
		}
		
	}
	
	
	
	

	public String registrarSesionCompoKitParaBusquedaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(compokitSessionBean==null) {
				compokitSessionBean=new CompoKitSessionBean();
			}

			if(productoSessionBean==null) {
				productoSessionBean=new ProductoSessionBean();
			}

			productoSessionBean.setsPathNavegacionActual(compokitSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			productoSessionBean.setisPermiteRecargarInformacion(false);
			productoSessionBean.setisPaginaPopup(true);
			isPaginaPopupProducto=productoSessionBean.getisPaginaPopup();
			productoSessionBean.setisPaginaPopup(false);
			productoSessionBean.setEstaModoBusqueda(true);
			productoSessionBean.setsFuncionBusquedaRapida("window.opener.compokitFuncionGeneral.setCombosCodigoDesdeBusquedaid_producto(TO_REPLACE);");
			productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(CompoKitConstantesFunciones.SNOMBREOPCION);
			//productoSessionBean.setisBusquedaDesdeForeignKeySesionCompoKit(true);
			//productoSessionBean.setlidCompoKitActual(this.idCompoKitActual);

			compokitSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCompoKit(true);
			compokitSessionBean.setlIdCompoKitActualForeignKey(this.idCompoKitActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//CompoKitSessionBean compokitSessionBean=new CompoKitSessionBean();
		
		if(this.compokitSessionBean==null) {
			this.compokitSessionBean=new CompoKitSessionBean();
		}
		
		this.compokitSessionBean.setsUltimaBusquedaCompoKit(this.getsAccionBusqueda());
		this.compokitSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.compokitSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
			compokitSessionBean.setid_bodega(this.getid_bodegaFK_IdBodega());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			compokitSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdKit")) {
			compokitSessionBean.setid_kit(this.getid_kitFK_IdKit());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
			compokitSessionBean.setid_producto(this.getid_productoFK_IdProducto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			compokitSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
			compokitSessionBean.setid_unidad(this.getid_unidadFK_IdUnidad());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//CompoKitSessionBean compokitSessionBean=new CompoKitSessionBean();
		
		if(this.compokitSessionBean==null) {
			this.compokitSessionBean=new CompoKitSessionBean();
		}
		
		if(this.compokitSessionBean.getsUltimaBusquedaCompoKit()!=null&&!this.compokitSessionBean.getsUltimaBusquedaCompoKit().equals("")) {
			this.setsAccionBusqueda(compokitSessionBean.getsUltimaBusquedaCompoKit());
			this.setiNumeroPaginacion(compokitSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(compokitSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
				this.setid_bodegaFK_IdBodega(compokitSessionBean.getid_bodega());
				compokitSessionBean.setid_bodega(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(compokitSessionBean.getid_empresa());
				compokitSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdKit")) {
				this.setid_kitFK_IdKit(compokitSessionBean.getid_kit());
				compokitSessionBean.setid_kit(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
				this.setid_productoFK_IdProducto(compokitSessionBean.getid_producto());
				compokitSessionBean.setid_producto(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(compokitSessionBean.getid_sucursal());
				compokitSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
				this.setid_unidadFK_IdUnidad(compokitSessionBean.getid_unidad());
				compokitSessionBean.setid_unidad(-1L);
			}
		}
		
		this.compokitSessionBean.setsUltimaBusquedaCompoKit("");
		this.compokitSessionBean.setiNumeroPaginacion(CompoKitConstantesFunciones.INUMEROPAGINACION);
		this.compokitSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCompoKit(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCompoKit() {
		this.updateBorderResaltarBusquedasFormularioCompoKit();
		this.updateVisibilidadBusquedasFormularioCompoKit();
		this.updateHabilitarBusquedasFormularioCompoKit();
	}
	
	public void updateBorderResaltarBusquedasFormularioCompoKit() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCompoKit.getComponents().length>0) {
	

		if(this.compokitConstantesFunciones.resaltarFK_IdBodegaCompoKit!=null) {
			index= this.jTabbedPaneBusquedasCompoKit.indexOfComponent(this.jPanelFK_IdBodegaCompoKit);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCompoKit.getComponent(index);
				jPanel.setBorder(this.compokitConstantesFunciones.resaltarFK_IdBodegaCompoKit);
			}
		}

		if(this.compokitConstantesFunciones.resaltarFK_IdKitCompoKit!=null) {
			index= this.jTabbedPaneBusquedasCompoKit.indexOfComponent(this.jPanelFK_IdKitCompoKit);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCompoKit.getComponent(index);
				jPanel.setBorder(this.compokitConstantesFunciones.resaltarFK_IdKitCompoKit);
			}
		}

		if(this.compokitConstantesFunciones.resaltarFK_IdProductoCompoKit!=null) {
			index= this.jTabbedPaneBusquedasCompoKit.indexOfComponent(this.jPanelFK_IdProductoCompoKit);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCompoKit.getComponent(index);
				jPanel.setBorder(this.compokitConstantesFunciones.resaltarFK_IdProductoCompoKit);
			}
		}

		if(this.compokitConstantesFunciones.resaltarFK_IdUnidadCompoKit!=null) {
			index= this.jTabbedPaneBusquedasCompoKit.indexOfComponent(this.jPanelFK_IdUnidadCompoKit);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCompoKit.getComponent(index);
				jPanel.setBorder(this.compokitConstantesFunciones.resaltarFK_IdUnidadCompoKit);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCompoKit() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCompoKit.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCompoKit.indexOfComponent(this.jPanelFK_IdBodegaCompoKit);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCompoKit.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.compokitConstantesFunciones.mostrarFK_IdBodegaCompoKit);
			if(!this.compokitConstantesFunciones.mostrarFK_IdBodegaCompoKit && index>-1) {
				this.jTabbedPaneBusquedasCompoKit.remove(index);
			}

			index= this.jTabbedPaneBusquedasCompoKit.indexOfComponent(this.jPanelFK_IdKitCompoKit);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCompoKit.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.compokitConstantesFunciones.mostrarFK_IdKitCompoKit);
			if(!this.compokitConstantesFunciones.mostrarFK_IdKitCompoKit && index>-1) {
				this.jTabbedPaneBusquedasCompoKit.remove(index);
			}

			index= this.jTabbedPaneBusquedasCompoKit.indexOfComponent(this.jPanelFK_IdProductoCompoKit);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCompoKit.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.compokitConstantesFunciones.mostrarFK_IdProductoCompoKit);
			if(!this.compokitConstantesFunciones.mostrarFK_IdProductoCompoKit && index>-1) {
				this.jTabbedPaneBusquedasCompoKit.remove(index);
			}

			index= this.jTabbedPaneBusquedasCompoKit.indexOfComponent(this.jPanelFK_IdUnidadCompoKit);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCompoKit.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.compokitConstantesFunciones.mostrarFK_IdUnidadCompoKit);
			if(!this.compokitConstantesFunciones.mostrarFK_IdUnidadCompoKit && index>-1) {
				this.jTabbedPaneBusquedasCompoKit.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCompoKit() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCompoKit.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCompoKit.indexOfComponent(this.jPanelFK_IdBodegaCompoKit);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCompoKit.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.compokitConstantesFunciones.activarFK_IdBodegaCompoKit);
				this.jTabbedPaneBusquedasCompoKit.setEnabledAt(index,this.compokitConstantesFunciones.activarFK_IdBodegaCompoKit);
			}

			index= this.jTabbedPaneBusquedasCompoKit.indexOfComponent(this.jPanelFK_IdKitCompoKit);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCompoKit.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.compokitConstantesFunciones.activarFK_IdKitCompoKit);
				this.jTabbedPaneBusquedasCompoKit.setEnabledAt(index,this.compokitConstantesFunciones.activarFK_IdKitCompoKit);
			}

			index= this.jTabbedPaneBusquedasCompoKit.indexOfComponent(this.jPanelFK_IdProductoCompoKit);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCompoKit.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.compokitConstantesFunciones.activarFK_IdProductoCompoKit);
				this.jTabbedPaneBusquedasCompoKit.setEnabledAt(index,this.compokitConstantesFunciones.activarFK_IdProductoCompoKit);
			}

			index= this.jTabbedPaneBusquedasCompoKit.indexOfComponent(this.jPanelFK_IdUnidadCompoKit);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCompoKit.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.compokitConstantesFunciones.activarFK_IdUnidadCompoKit);
				this.jTabbedPaneBusquedasCompoKit.setEnabledAt(index,this.compokitConstantesFunciones.activarFK_IdUnidadCompoKit);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCompoKit(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdBodega")) {
			index= this.jTabbedPaneBusquedasCompoKit.indexOfComponent(this.jPanelFK_IdBodegaCompoKit);

			this.jTabbedPaneBusquedasCompoKit.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCompoKit.getComponent(index);

			this.compokitConstantesFunciones.setResaltarFK_IdBodegaCompoKit(resaltar);

			jPanel.setBorder(this.compokitConstantesFunciones.resaltarFK_IdBodegaCompoKit);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdKit")) {
			index= this.jTabbedPaneBusquedasCompoKit.indexOfComponent(this.jPanelFK_IdKitCompoKit);

			this.jTabbedPaneBusquedasCompoKit.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCompoKit.getComponent(index);

			this.compokitConstantesFunciones.setResaltarFK_IdKitCompoKit(resaltar);

			jPanel.setBorder(this.compokitConstantesFunciones.resaltarFK_IdKitCompoKit);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdProducto")) {
			index= this.jTabbedPaneBusquedasCompoKit.indexOfComponent(this.jPanelFK_IdProductoCompoKit);

			this.jTabbedPaneBusquedasCompoKit.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCompoKit.getComponent(index);

			this.compokitConstantesFunciones.setResaltarFK_IdProductoCompoKit(resaltar);

			jPanel.setBorder(this.compokitConstantesFunciones.resaltarFK_IdProductoCompoKit);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdUnidad")) {
			index= this.jTabbedPaneBusquedasCompoKit.indexOfComponent(this.jPanelFK_IdUnidadCompoKit);

			this.jTabbedPaneBusquedasCompoKit.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCompoKit.getComponent(index);

			this.compokitConstantesFunciones.setResaltarFK_IdUnidadCompoKit(resaltar);

			jPanel.setBorder(this.compokitConstantesFunciones.resaltarFK_IdUnidadCompoKit);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCompoKit.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCompoKit() throws Exception {

		if(this.jInternalFrameDetalleFormCompoKit==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCompoKit();
		this.updateVisibilidadResaltarControlesFormularioCompoKit();
		this.updateHabilitarResaltarControlesFormularioCompoKit();
		
	}
	
	public void updateBorderResaltarControlesFormularioCompoKit() throws Exception {
		if(this.jInternalFrameDetalleFormCompoKit==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.compokitConstantesFunciones.resaltaridCompoKit!=null && this.jInternalFrameDetalleFormCompoKit!=null) {this.jInternalFrameDetalleFormCompoKit.jLabelidCompoKit.setBorder(this.compokitConstantesFunciones.resaltaridCompoKit);}
		if(this.compokitConstantesFunciones.resaltarid_empresaCompoKit!=null && this.jInternalFrameDetalleFormCompoKit!=null) {this.jInternalFrameDetalleFormCompoKit.jComboBoxid_empresaCompoKit.setBorder(this.compokitConstantesFunciones.resaltarid_empresaCompoKit);}
		if(this.compokitConstantesFunciones.resaltarid_sucursalCompoKit!=null && this.jInternalFrameDetalleFormCompoKit!=null) {this.jInternalFrameDetalleFormCompoKit.jComboBoxid_sucursalCompoKit.setBorder(this.compokitConstantesFunciones.resaltarid_sucursalCompoKit);}
		if(this.compokitConstantesFunciones.resaltarid_bodegaCompoKit!=null && this.jInternalFrameDetalleFormCompoKit!=null) {this.jInternalFrameDetalleFormCompoKit.jComboBoxid_bodegaCompoKit.setBorder(this.compokitConstantesFunciones.resaltarid_bodegaCompoKit);}
		if(this.compokitConstantesFunciones.resaltarid_productoCompoKit!=null && this.jInternalFrameDetalleFormCompoKit!=null) {this.jInternalFrameDetalleFormCompoKit.jComboBoxid_productoCompoKit.setBorder(this.compokitConstantesFunciones.resaltarid_productoCompoKit);}
		if(this.compokitConstantesFunciones.resaltarid_kitCompoKit!=null && this.jInternalFrameDetalleFormCompoKit!=null) {this.jInternalFrameDetalleFormCompoKit.jComboBoxid_kitCompoKit.setBorder(this.compokitConstantesFunciones.resaltarid_kitCompoKit);}
		if(this.compokitConstantesFunciones.resaltarid_unidadCompoKit!=null && this.jInternalFrameDetalleFormCompoKit!=null) {this.jInternalFrameDetalleFormCompoKit.jComboBoxid_unidadCompoKit.setBorder(this.compokitConstantesFunciones.resaltarid_unidadCompoKit);}
		if(this.compokitConstantesFunciones.resaltarcantidadCompoKit!=null && this.jInternalFrameDetalleFormCompoKit!=null) {this.jInternalFrameDetalleFormCompoKit.jTextFieldcantidadCompoKit.setBorder(this.compokitConstantesFunciones.resaltarcantidadCompoKit);}
		if(this.compokitConstantesFunciones.resaltarvalor_ingresoCompoKit!=null && this.jInternalFrameDetalleFormCompoKit!=null) {this.jInternalFrameDetalleFormCompoKit.jTextFieldvalor_ingresoCompoKit.setBorder(this.compokitConstantesFunciones.resaltarvalor_ingresoCompoKit);}
		if(this.compokitConstantesFunciones.resaltardescripcionCompoKit!=null && this.jInternalFrameDetalleFormCompoKit!=null) {this.jInternalFrameDetalleFormCompoKit.jTextAreadescripcionCompoKit.setBorder(this.compokitConstantesFunciones.resaltardescripcionCompoKit);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCompoKit() throws Exception {		
		if(this.jInternalFrameDetalleFormCompoKit==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCompoKit!=null) {
	
		//this.jInternalFrameDetalleFormCompoKit.jLabelidCompoKit.setVisible(this.compokitConstantesFunciones.mostraridCompoKit);
		this.jInternalFrameDetalleFormCompoKit.jPanelidCompoKit.setVisible(this.compokitConstantesFunciones.mostraridCompoKit);
		//this.jInternalFrameDetalleFormCompoKit.jComboBoxid_empresaCompoKit.setVisible(this.compokitConstantesFunciones.mostrarid_empresaCompoKit);
		this.jInternalFrameDetalleFormCompoKit.jPanelid_empresaCompoKit.setVisible(this.compokitConstantesFunciones.mostrarid_empresaCompoKit);
		//this.jInternalFrameDetalleFormCompoKit.jComboBoxid_sucursalCompoKit.setVisible(this.compokitConstantesFunciones.mostrarid_sucursalCompoKit);
		this.jInternalFrameDetalleFormCompoKit.jPanelid_sucursalCompoKit.setVisible(this.compokitConstantesFunciones.mostrarid_sucursalCompoKit);
		//this.jInternalFrameDetalleFormCompoKit.jComboBoxid_bodegaCompoKit.setVisible(this.compokitConstantesFunciones.mostrarid_bodegaCompoKit);
		this.jInternalFrameDetalleFormCompoKit.jPanelid_bodegaCompoKit.setVisible(this.compokitConstantesFunciones.mostrarid_bodegaCompoKit);
		//this.jInternalFrameDetalleFormCompoKit.jComboBoxid_productoCompoKit.setVisible(this.compokitConstantesFunciones.mostrarid_productoCompoKit);
		this.jInternalFrameDetalleFormCompoKit.jPanelid_productoCompoKit.setVisible(this.compokitConstantesFunciones.mostrarid_productoCompoKit);
			this.jInternalFrameDetalleFormCompoKit.jButtonid_productoCompoKit.setVisible(this.compokitConstantesFunciones.mostrarid_productoCompoKit);
		//this.jInternalFrameDetalleFormCompoKit.jComboBoxid_kitCompoKit.setVisible(this.compokitConstantesFunciones.mostrarid_kitCompoKit);
		this.jInternalFrameDetalleFormCompoKit.jPanelid_kitCompoKit.setVisible(this.compokitConstantesFunciones.mostrarid_kitCompoKit);
		//this.jInternalFrameDetalleFormCompoKit.jComboBoxid_unidadCompoKit.setVisible(this.compokitConstantesFunciones.mostrarid_unidadCompoKit);
		this.jInternalFrameDetalleFormCompoKit.jPanelid_unidadCompoKit.setVisible(this.compokitConstantesFunciones.mostrarid_unidadCompoKit);
		//this.jInternalFrameDetalleFormCompoKit.jTextFieldcantidadCompoKit.setVisible(this.compokitConstantesFunciones.mostrarcantidadCompoKit);
		this.jInternalFrameDetalleFormCompoKit.jPanelcantidadCompoKit.setVisible(this.compokitConstantesFunciones.mostrarcantidadCompoKit);
		//this.jInternalFrameDetalleFormCompoKit.jTextFieldvalor_ingresoCompoKit.setVisible(this.compokitConstantesFunciones.mostrarvalor_ingresoCompoKit);
		this.jInternalFrameDetalleFormCompoKit.jPanelvalor_ingresoCompoKit.setVisible(this.compokitConstantesFunciones.mostrarvalor_ingresoCompoKit);
		//this.jInternalFrameDetalleFormCompoKit.jTextAreadescripcionCompoKit.setVisible(this.compokitConstantesFunciones.mostrardescripcionCompoKit);
		this.jInternalFrameDetalleFormCompoKit.jPaneldescripcionCompoKit.setVisible(this.compokitConstantesFunciones.mostrardescripcionCompoKit);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCompoKit() throws Exception {
		if(this.jInternalFrameDetalleFormCompoKit==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCompoKit!=null) {
	
		this.jInternalFrameDetalleFormCompoKit.jLabelidCompoKit.setEnabled(this.compokitConstantesFunciones.activaridCompoKit);
		this.jInternalFrameDetalleFormCompoKit.jComboBoxid_empresaCompoKit.setEnabled(this.compokitConstantesFunciones.activarid_empresaCompoKit);
		this.jInternalFrameDetalleFormCompoKit.jComboBoxid_sucursalCompoKit.setEnabled(this.compokitConstantesFunciones.activarid_sucursalCompoKit);
		this.jInternalFrameDetalleFormCompoKit.jComboBoxid_bodegaCompoKit.setEnabled(this.compokitConstantesFunciones.activarid_bodegaCompoKit);
		this.jInternalFrameDetalleFormCompoKit.jComboBoxid_productoCompoKit.setEnabled(this.compokitConstantesFunciones.activarid_productoCompoKit);
			this.jInternalFrameDetalleFormCompoKit.jButtonid_productoCompoKit.setEnabled(this.compokitConstantesFunciones.activarid_productoCompoKit);
		this.jInternalFrameDetalleFormCompoKit.jComboBoxid_kitCompoKit.setEnabled(this.compokitConstantesFunciones.activarid_kitCompoKit);
		this.jInternalFrameDetalleFormCompoKit.jComboBoxid_unidadCompoKit.setEnabled(this.compokitConstantesFunciones.activarid_unidadCompoKit);
		this.jInternalFrameDetalleFormCompoKit.jTextFieldcantidadCompoKit.setEnabled(this.compokitConstantesFunciones.activarcantidadCompoKit);
		this.jInternalFrameDetalleFormCompoKit.jTextFieldvalor_ingresoCompoKit.setEnabled(this.compokitConstantesFunciones.activarvalor_ingresoCompoKit);
		this.jInternalFrameDetalleFormCompoKit.jTextAreadescripcionCompoKit.setEnabled(this.compokitConstantesFunciones.activardescripcionCompoKit);
		}
	}
	
		
}