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

//import com.bydan.erp.inventario.util.PreciosComprasConstantesFunciones;
import com.bydan.erp.inventario.util.report.PreciosComprasParameterReturnGeneral;
//import com.bydan.erp.inventario.util.report.PreciosComprasParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.report.PreciosComprasBean;
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
import com.bydan.erp.tesoreria.business.logic.*;

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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class PreciosComprasBeanSwingJInternalFrame extends PreciosComprasJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PreciosComprasBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PreciosCompras> precioscomprasValidator = new ClassValidator<PreciosCompras>(PreciosCompras.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PreciosCompras precioscompras;	
	public PreciosCompras precioscomprasAux;
	public PreciosCompras precioscomprasAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PreciosCompras precioscomprasTotales;
	public Long idPreciosComprasActual;
	public Long iIdNuevoPreciosCompras=0L;
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

	public String sFinalQueryComboTransaccion="";

	public List<Transaccion> transaccionsForeignKey;

	public List<Transaccion> gettransaccionsForeignKey() {
		return transaccionsForeignKey;
	}

	public void settransaccionsForeignKey(List<Transaccion> transaccionsForeignKey) {
		this.transaccionsForeignKey = transaccionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Transaccion transaccionForeignKey;

	public Transaccion gettransaccionForeignKey() {
		return transaccionForeignKey;
	}

	public void settransaccionForeignKey(Transaccion transaccionForeignKey) {
		this.transaccionForeignKey = transaccionForeignKey;
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
	
	public Boolean isPermisoTodoPreciosCompras;
	public Boolean isPermisoNuevoPreciosCompras;
	public Boolean isPermisoActualizarPreciosCompras;
	public Boolean isPermisoActualizarOriginalPreciosCompras;
	public Boolean isPermisoEliminarPreciosCompras;
	public Boolean isPermisoGuardarCambiosPreciosCompras;
	public Boolean isPermisoConsultaPreciosCompras;
	public Boolean isPermisoBusquedaPreciosCompras;
	public Boolean isPermisoReportePreciosCompras;
	public Boolean isPermisoPaginacionMedioPreciosCompras;
	public Boolean isPermisoPaginacionAltoPreciosCompras;
	public Boolean isPermisoPaginacionTodoPreciosCompras;
	public Boolean isPermisoCopiarPreciosCompras;
	public Boolean isPermisoVerFormPreciosCompras;
	public Boolean isPermisoDuplicarPreciosCompras;
	public Boolean isPermisoOrdenPreciosCompras;
	
	
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
	
	public PreciosComprasParameterReturnGeneral precioscomprasReturnGeneral;
	public PreciosComprasParameterReturnGeneral precioscomprasParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPreciosCompras=false;
	public Boolean esParaAccionDesdeFormularioPreciosCompras=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PreciosComprasSessionBeanAdditional precioscomprasSessionBeanAdditional=null;
	
	public PreciosComprasSessionBeanAdditional getPreciosComprasSessionBeanAdditional() {
		return this.precioscomprasSessionBeanAdditional;
	}
	
	public void setPreciosComprasSessionBeanAdditional(PreciosComprasSessionBeanAdditional precioscomprasSessionBeanAdditional) {
		try {
			this.precioscomprasSessionBeanAdditional=precioscomprasSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PreciosComprasBeanSwingJInternalFrameAdditional precioscomprasBeanSwingJInternalFrameAdditional=null;
	//public class PreciosComprasBeanSwingJInternalFrame
	
	public PreciosComprasBeanSwingJInternalFrameAdditional getPreciosComprasBeanSwingJInternalFrameAdditional() {
		return this.precioscomprasBeanSwingJInternalFrameAdditional;
	}
	
	public void setPreciosComprasBeanSwingJInternalFrameAdditional(PreciosComprasBeanSwingJInternalFrameAdditional precioscomprasBeanSwingJInternalFrameAdditional) {
		try {
			this.precioscomprasBeanSwingJInternalFrameAdditional=precioscomprasBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PreciosComprasLogic precioscomprasLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PreciosCompras precioscomprasBean;
	public PreciosComprasConstantesFunciones precioscomprasConstantesFunciones;
	//public PreciosComprasParameterReturnGeneral precioscomprasReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public BodegaLogic bodegaLogic;
	public ProductoLogic productoLogic;
	public TransaccionLogic transaccionLogic;
	public LineaLogic lineaLogic;
	public LineaLogic lineagrupoLogic;
	public LineaLogic lineacategoriaLogic;
	public LineaLogic lineamarcaLogic;
	
	//PARAMETROS
	
	
	//public List<PreciosCompras> precioscomprass;	
	//public List<PreciosCompras> precioscomprassEliminados;
	//public List<PreciosCompras> precioscomprassAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPreciosCompras=false;
	public Boolean isVisibilidadCeldaDuplicarPreciosCompras=true;
	public Boolean isVisibilidadCeldaCopiarPreciosCompras=true;
	public Boolean isVisibilidadCeldaVerFormPreciosCompras=true;
	public Boolean isVisibilidadCeldaOrdenPreciosCompras=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPreciosCompras=false;
	public Boolean isVisibilidadCeldaModificarPreciosCompras=false;
	public Boolean isVisibilidadCeldaActualizarPreciosCompras=false;
	public Boolean isVisibilidadCeldaEliminarPreciosCompras=false;
	public Boolean isVisibilidadCeldaCancelarPreciosCompras=false;
	public Boolean isVisibilidadCeldaGuardarPreciosCompras=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPreciosCompras=false;	
	
	
	public Boolean isVisibilidadBusquedaPreciosCompras=false;
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdLinea=false;
	public Boolean isVisibilidadFK_IdLineaCategoria=false;
	public Boolean isVisibilidadFK_IdLineaGrupo=false;
	public Boolean isVisibilidadFK_IdLineaMarca=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTransaccion=false;
	
	public Long getiIdNuevoPreciosCompras() {
		return this.iIdNuevoPreciosCompras;
	}

	public void setiIdNuevoPreciosCompras(Long iIdNuevoPreciosCompras) {
		this.iIdNuevoPreciosCompras = iIdNuevoPreciosCompras;
	}
	
	public Long getidPreciosComprasActual() {
		return this.idPreciosComprasActual;
	}

	public void setidPreciosComprasActual(Long idPreciosComprasActual) {
		this.idPreciosComprasActual = idPreciosComprasActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PreciosCompras getprecioscompras() {
		return this.precioscompras;
	}

	public void setprecioscompras(PreciosCompras precioscompras) {
		this.precioscompras = precioscompras;
	}
	
	public PreciosCompras getprecioscomprasAux() {
		return this.precioscomprasAux;
	}

	public void setprecioscomprasAux(PreciosCompras precioscomprasAux) {
		this.precioscomprasAux = precioscomprasAux;
	}				
	
	public PreciosCompras getprecioscomprasAnterior() {
		return this.precioscomprasAnterior;
	}

	public void setprecioscomprasAnterior(PreciosCompras precioscomprasAnterior) {
		this.precioscomprasAnterior = precioscomprasAnterior;
	}	
	
	public PreciosCompras getprecioscomprasTotales() {
		return this.precioscomprasTotales;
	}

	public void setprecioscomprasTotales(PreciosCompras precioscomprasTotales) {
		this.precioscomprasTotales = precioscomprasTotales;
	}	
	
	public PreciosCompras getprecioscomprasBean() {
		return this.precioscomprasBean;
	}

	public void setprecioscomprasBean(PreciosCompras precioscomprasBean) {
		this.precioscomprasBean = precioscomprasBean;
	}	
	
	public PreciosComprasParameterReturnGeneral getprecioscomprasReturnGeneral() {
		return this.precioscomprasReturnGeneral;
	}

	public void setprecioscomprasReturnGeneral(PreciosComprasParameterReturnGeneral precioscomprasReturnGeneral) {
		this.precioscomprasReturnGeneral = precioscomprasReturnGeneral;
	}	
	
	
	public Long id_bodegaBusquedaPreciosCompras=-1L;

	public Long getid_bodegaBusquedaPreciosCompras() {
		return this.id_bodegaBusquedaPreciosCompras;
	}

	public void setid_bodegaBusquedaPreciosCompras(Long id_bodegaBusquedaPreciosCompras) {
		this.id_bodegaBusquedaPreciosCompras = id_bodegaBusquedaPreciosCompras;
	}

;
	public Long id_productoBusquedaPreciosCompras=-1L;

	public Long getid_productoBusquedaPreciosCompras() {
		return this.id_productoBusquedaPreciosCompras;
	}

	public void setid_productoBusquedaPreciosCompras(Long id_productoBusquedaPreciosCompras) {
		this.id_productoBusquedaPreciosCompras = id_productoBusquedaPreciosCompras;
	}

;
	public Long id_transaccionBusquedaPreciosCompras=-1L;

	public Long getid_transaccionBusquedaPreciosCompras() {
		return this.id_transaccionBusquedaPreciosCompras;
	}

	public void setid_transaccionBusquedaPreciosCompras(Long id_transaccionBusquedaPreciosCompras) {
		this.id_transaccionBusquedaPreciosCompras = id_transaccionBusquedaPreciosCompras;
	}

;
	public Long id_lineaBusquedaPreciosCompras=-1L;

	public Long getid_lineaBusquedaPreciosCompras() {
		return this.id_lineaBusquedaPreciosCompras;
	}

	public void setid_lineaBusquedaPreciosCompras(Long id_lineaBusquedaPreciosCompras) {
		this.id_lineaBusquedaPreciosCompras = id_lineaBusquedaPreciosCompras;
	}

;
	public Long id_linea_grupoBusquedaPreciosCompras=-1L;

	public Long getid_linea_grupoBusquedaPreciosCompras() {
		return this.id_linea_grupoBusquedaPreciosCompras;
	}

	public void setid_linea_grupoBusquedaPreciosCompras(Long id_linea_grupoBusquedaPreciosCompras) {
		this.id_linea_grupoBusquedaPreciosCompras = id_linea_grupoBusquedaPreciosCompras;
	}

;
	public Long id_linea_categoriaBusquedaPreciosCompras=-1L;

	public Long getid_linea_categoriaBusquedaPreciosCompras() {
		return this.id_linea_categoriaBusquedaPreciosCompras;
	}

	public void setid_linea_categoriaBusquedaPreciosCompras(Long id_linea_categoriaBusquedaPreciosCompras) {
		this.id_linea_categoriaBusquedaPreciosCompras = id_linea_categoriaBusquedaPreciosCompras;
	}

;
	public Long id_linea_marcaBusquedaPreciosCompras=-1L;

	public Long getid_linea_marcaBusquedaPreciosCompras() {
		return this.id_linea_marcaBusquedaPreciosCompras;
	}

	public void setid_linea_marcaBusquedaPreciosCompras(Long id_linea_marcaBusquedaPreciosCompras) {
		this.id_linea_marcaBusquedaPreciosCompras = id_linea_marcaBusquedaPreciosCompras;
	}

;
	public Date fecha_emision_desdeBusquedaPreciosCompras=new Date();

	public Date getfecha_emision_desdeBusquedaPreciosCompras() {
		return this.fecha_emision_desdeBusquedaPreciosCompras;
	}

	public void setfecha_emision_desdeBusquedaPreciosCompras(Date fecha_emision_desdeBusquedaPreciosCompras) {
		this.fecha_emision_desdeBusquedaPreciosCompras = fecha_emision_desdeBusquedaPreciosCompras;
	}

;
	public Date fecha_emision_hastaBusquedaPreciosCompras=new Date();

	public Date getfecha_emision_hastaBusquedaPreciosCompras() {
		return this.fecha_emision_hastaBusquedaPreciosCompras;
	}

	public void setfecha_emision_hastaBusquedaPreciosCompras(Date fecha_emision_hastaBusquedaPreciosCompras) {
		this.fecha_emision_hastaBusquedaPreciosCompras = fecha_emision_hastaBusquedaPreciosCompras;
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

	public Long id_transaccionFK_IdTransaccion=-1L;

	public Long getid_transaccionFK_IdTransaccion() {
		return this.id_transaccionFK_IdTransaccion;
	}

	public void setid_transaccionFK_IdTransaccion(Long id_transaccionFK_IdTransaccion) {
		this.id_transaccionFK_IdTransaccion = id_transaccionFK_IdTransaccion;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public PreciosComprasLogic getPreciosComprasLogic()	{		
		return precioscomprasLogic;
	}

	public void setPreciosComprasLogic(PreciosComprasLogic precioscomprasLogic) {
		this.precioscomprasLogic = precioscomprasLogic;
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
	
	public Boolean getIsEsNuevoPreciosCompras() {
		return isEsNuevoPreciosCompras;
	}

	public void setIsEsNuevoPreciosCompras(Boolean isEsNuevoPreciosCompras) {
		this.isEsNuevoPreciosCompras = isEsNuevoPreciosCompras;
	}

	public Boolean getEsParaAccionDesdeFormularioPreciosCompras() {
		return esParaAccionDesdeFormularioPreciosCompras;
	}
	
	public void setEsParaAccionDesdeFormularioPreciosCompras(Boolean esParaAccionDesdeFormularioPreciosCompras) {
		this.esParaAccionDesdeFormularioPreciosCompras = esParaAccionDesdeFormularioPreciosCompras;
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

			if(this.precioscomprasSessionBean==null) {
				this.precioscomprasSessionBean=new PreciosComprasSessionBean();
			}

			if(!this.precioscomprasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(precioscomprasSessionBean.getlidEmpresaActual());
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

			if(this.precioscomprasSessionBean==null) {
				this.precioscomprasSessionBean=new PreciosComprasSessionBean();
			}

			if(!this.precioscomprasSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(precioscomprasSessionBean.getlidSucursalActual());
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

			if(this.precioscomprasSessionBean==null) {
				this.precioscomprasSessionBean=new PreciosComprasSessionBean();
			}

			if(!this.precioscomprasSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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
					bodegaLogic.getEntityWithConnection(precioscomprasSessionBean.getlidBodegaActual());
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

			if(this.precioscomprasSessionBean==null) {
				this.precioscomprasSessionBean=new PreciosComprasSessionBean();
			}

			if(!this.precioscomprasSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(precioscomprasSessionBean.getlidProductoActual());
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

	public void cargarCombosTransaccionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.transaccionsForeignKey=new ArrayList<Transaccion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TransaccionLogic transaccionLogic=new TransaccionLogic();

			//transaccionLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

			if(this.precioscomprasSessionBean==null) {
				this.precioscomprasSessionBean=new PreciosComprasSessionBean();
			}

			if(!this.precioscomprasSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transaccionLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

					transaccionLogic.getTodosTransaccionsWithConnection(sFinalQuery,new Pagination());

					this.transaccionsForeignKey=transaccionLogic.getTransaccions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTransaccion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionLogic.getEntityWithConnection(precioscomprasSessionBean.getlidTransaccionActual());
					this.transaccionsForeignKey.add(transaccionLogic.getTransaccion());
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

			if(this.precioscomprasSessionBean==null) {
				this.precioscomprasSessionBean=new PreciosComprasSessionBean();
			}

			if(!this.precioscomprasSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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
					lineaLogic.getEntityWithConnection(precioscomprasSessionBean.getlidLineaActual());
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

			if(this.precioscomprasSessionBean==null) {
				this.precioscomprasSessionBean=new PreciosComprasSessionBean();
			}

			if(!this.precioscomprasSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
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
					lineaLogic.getEntityWithConnection(precioscomprasSessionBean.getlidLineaGrupoActual());
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

			if(this.precioscomprasSessionBean==null) {
				this.precioscomprasSessionBean=new PreciosComprasSessionBean();
			}

			if(!this.precioscomprasSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
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
					lineaLogic.getEntityWithConnection(precioscomprasSessionBean.getlidLineaCategoriaActual());
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

			if(this.precioscomprasSessionBean==null) {
				this.precioscomprasSessionBean=new PreciosComprasSessionBean();
			}

			if(!this.precioscomprasSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
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
					lineaLogic.getEntityWithConnection(precioscomprasSessionBean.getlidLineaMarcaActual());
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

					if(this.precioscompras!=null) {
						this.precioscompras.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
						this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_empresaPreciosCompras.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaPreciosCompras.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
						if(this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_empresaPreciosCompras.getItemCount()>0) {
							this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_empresaPreciosCompras.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaPreciosComprasGenerico)throws Exception
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
				jComboBoxid_empresaPreciosComprasGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaPreciosComprasGenerico!=null && jComboBoxid_empresaPreciosComprasGenerico.getItemCount()>0) {
					jComboBoxid_empresaPreciosComprasGenerico.setSelectedIndex(0);
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

					if(this.precioscompras!=null) {
						this.precioscompras.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
						this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_sucursalPreciosCompras.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalPreciosCompras.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
						if(this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_sucursalPreciosCompras.getItemCount()>0) {
							this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_sucursalPreciosCompras.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalPreciosComprasGenerico)throws Exception
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
				jComboBoxid_sucursalPreciosComprasGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalPreciosComprasGenerico!=null && jComboBoxid_sucursalPreciosComprasGenerico.getItemCount()>0) {
					jComboBoxid_sucursalPreciosComprasGenerico.setSelectedIndex(0);
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

					if(this.precioscompras!=null) {
						this.precioscompras.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
						this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_bodegaPreciosCompras.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaPreciosCompras.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
						if(this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_bodegaPreciosCompras.getItemCount()>0) {
							this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_bodegaPreciosCompras.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPreciosCompras") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaBusquedaPreciosComprasPreciosCompras!=null) {
						jComboBoxid_bodegaBusquedaPreciosComprasPreciosCompras.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaBusquedaPreciosComprasPreciosCompras!=null) {
							//jComboBoxid_bodegaBusquedaPreciosComprasPreciosCompras.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaBusquedaPreciosComprasPreciosCompras.getItemCount()>0) {
								jComboBoxid_bodegaBusquedaPreciosComprasPreciosCompras.setSelectedIndex(0);
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
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaPreciosComprasGenerico)throws Exception
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
				jComboBoxid_bodegaPreciosComprasGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaPreciosComprasGenerico!=null && jComboBoxid_bodegaPreciosComprasGenerico.getItemCount()>0) {
					jComboBoxid_bodegaPreciosComprasGenerico.setSelectedIndex(0);
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

					if(this.precioscompras!=null) {
						this.precioscompras.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
						this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_productoPreciosCompras.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoPreciosCompras.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
						if(this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_productoPreciosCompras.getItemCount()>0) {
							this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_productoPreciosCompras.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPreciosCompras") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoBusquedaPreciosComprasPreciosCompras!=null) {
						jComboBoxid_productoBusquedaPreciosComprasPreciosCompras.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoBusquedaPreciosComprasPreciosCompras!=null) {
							//jComboBoxid_productoBusquedaPreciosComprasPreciosCompras.setSelectedItem(productoTemp);
							if(jComboBoxid_productoBusquedaPreciosComprasPreciosCompras.getItemCount()>0) {
								jComboBoxid_productoBusquedaPreciosComprasPreciosCompras.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoPreciosComprasGenerico)throws Exception
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
				jComboBoxid_productoPreciosComprasGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoPreciosComprasGenerico!=null && jComboBoxid_productoPreciosComprasGenerico.getItemCount()>0) {
					jComboBoxid_productoPreciosComprasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTransaccionForeignKey(Long idTransaccionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Transaccion  transaccionTemp=null;

			for(Transaccion transaccionAux:transaccionsForeignKey) {
				if(transaccionAux.getId()!=null && transaccionAux.getId().equals(idTransaccionSeleccionado)) {
					transaccionTemp=transaccionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(transaccionTemp!=null) {

					if(this.precioscompras!=null) {
						this.precioscompras.setTransaccion(transaccionTemp);
					}

					if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
						this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_transaccionPreciosCompras.setSelectedItem(transaccionTemp);
					}
				} else {
					//jComboBoxid_transaccionPreciosCompras.setSelectedItem(transaccionTemp);
					if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
						if(this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_transaccionPreciosCompras.getItemCount()>0) {
							this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_transaccionPreciosCompras.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPreciosCompras") || sFormularioTipoBusqueda.equals("Todos")){
					if(transaccionTemp!=null && jComboBoxid_transaccionBusquedaPreciosComprasPreciosCompras!=null) {
						jComboBoxid_transaccionBusquedaPreciosComprasPreciosCompras.setSelectedItem(transaccionTemp);
					} else {
						if(jComboBoxid_transaccionBusquedaPreciosComprasPreciosCompras!=null) {
							//jComboBoxid_transaccionBusquedaPreciosComprasPreciosCompras.setSelectedItem(transaccionTemp);
							if(jComboBoxid_transaccionBusquedaPreciosComprasPreciosCompras.getItemCount()>0) {
								jComboBoxid_transaccionBusquedaPreciosComprasPreciosCompras.setSelectedIndex(0);
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

	public String getActualTransaccionForeignKeyDescripcion(Long idTransaccionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Transaccion  transaccionTemp=null;

			for(Transaccion transaccionAux:transaccionsForeignKey) {
				if(transaccionAux.getId()!=null && transaccionAux.getId().equals(idTransaccionSeleccionado)) {
					transaccionTemp=transaccionAux;
					break;
				}
			}


			sDescripcion=TransaccionConstantesFunciones.getTransaccionDescripcion(transaccionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTransaccionForeignKeyGenerico(Long idTransaccionSeleccionado,JComboBox jComboBoxid_transaccionPreciosComprasGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionTemp=null;

			for(Transaccion transaccionAux:transaccionsForeignKey) {
				if(transaccionAux.getId()!=null && transaccionAux.getId().equals(idTransaccionSeleccionado)) {
					transaccionTemp=transaccionAux;
					break;
				}
			}

			if(transaccionTemp!=null) {
				jComboBoxid_transaccionPreciosComprasGenerico.setSelectedItem(transaccionTemp);
			} else {
				if(jComboBoxid_transaccionPreciosComprasGenerico!=null && jComboBoxid_transaccionPreciosComprasGenerico.getItemCount()>0) {
					jComboBoxid_transaccionPreciosComprasGenerico.setSelectedIndex(0);
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

					if(this.precioscompras!=null) {
						this.precioscompras.setLinea(lineaTemp);
					}

					if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
						this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_lineaPreciosCompras.setSelectedItem(lineaTemp);
					}
				} else {
					//jComboBoxid_lineaPreciosCompras.setSelectedItem(lineaTemp);
					if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
						if(this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_lineaPreciosCompras.getItemCount()>0) {
							this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_lineaPreciosCompras.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPreciosCompras") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineaTemp!=null && jComboBoxid_lineaBusquedaPreciosComprasPreciosCompras!=null) {
						jComboBoxid_lineaBusquedaPreciosComprasPreciosCompras.setSelectedItem(lineaTemp);
					} else {
						if(jComboBoxid_lineaBusquedaPreciosComprasPreciosCompras!=null) {
							//jComboBoxid_lineaBusquedaPreciosComprasPreciosCompras.setSelectedItem(lineaTemp);
							if(jComboBoxid_lineaBusquedaPreciosComprasPreciosCompras.getItemCount()>0) {
								jComboBoxid_lineaBusquedaPreciosComprasPreciosCompras.setSelectedIndex(0);
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
	public void setActualLineaForeignKeyGenerico(Long idLineaSeleccionado,JComboBox jComboBoxid_lineaPreciosComprasGenerico)throws Exception
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
				jComboBoxid_lineaPreciosComprasGenerico.setSelectedItem(lineaTemp);
			} else {
				if(jComboBoxid_lineaPreciosComprasGenerico!=null && jComboBoxid_lineaPreciosComprasGenerico.getItemCount()>0) {
					jComboBoxid_lineaPreciosComprasGenerico.setSelectedIndex(0);
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

					if(this.precioscompras!=null) {
						this.precioscompras.setLineaGrupo(lineagrupoTemp);
					}

					if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
						this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_grupoPreciosCompras.setSelectedItem(lineagrupoTemp);
					}
				} else {
					//jComboBoxid_linea_grupoPreciosCompras.setSelectedItem(lineagrupoTemp);
					if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
						if(this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_grupoPreciosCompras.getItemCount()>0) {
							this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_grupoPreciosCompras.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPreciosCompras") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineagrupoTemp!=null && jComboBoxid_linea_grupoBusquedaPreciosComprasPreciosCompras!=null) {
						jComboBoxid_linea_grupoBusquedaPreciosComprasPreciosCompras.setSelectedItem(lineagrupoTemp);
					} else {
						if(jComboBoxid_linea_grupoBusquedaPreciosComprasPreciosCompras!=null) {
							//jComboBoxid_linea_grupoBusquedaPreciosComprasPreciosCompras.setSelectedItem(lineagrupoTemp);
							if(jComboBoxid_linea_grupoBusquedaPreciosComprasPreciosCompras.getItemCount()>0) {
								jComboBoxid_linea_grupoBusquedaPreciosComprasPreciosCompras.setSelectedIndex(0);
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
	public void setActualLineaGrupoForeignKeyGenerico(Long idLineaGrupoSeleccionado,JComboBox jComboBoxid_linea_grupoPreciosComprasGenerico)throws Exception
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
				jComboBoxid_linea_grupoPreciosComprasGenerico.setSelectedItem(lineagrupoTemp);
			} else {
				if(jComboBoxid_linea_grupoPreciosComprasGenerico!=null && jComboBoxid_linea_grupoPreciosComprasGenerico.getItemCount()>0) {
					jComboBoxid_linea_grupoPreciosComprasGenerico.setSelectedIndex(0);
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

					if(this.precioscompras!=null) {
						this.precioscompras.setLineaCategoria(lineacategoriaTemp);
					}

					if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
						this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_categoriaPreciosCompras.setSelectedItem(lineacategoriaTemp);
					}
				} else {
					//jComboBoxid_linea_categoriaPreciosCompras.setSelectedItem(lineacategoriaTemp);
					if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
						if(this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_categoriaPreciosCompras.getItemCount()>0) {
							this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_categoriaPreciosCompras.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPreciosCompras") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineacategoriaTemp!=null && jComboBoxid_linea_categoriaBusquedaPreciosComprasPreciosCompras!=null) {
						jComboBoxid_linea_categoriaBusquedaPreciosComprasPreciosCompras.setSelectedItem(lineacategoriaTemp);
					} else {
						if(jComboBoxid_linea_categoriaBusquedaPreciosComprasPreciosCompras!=null) {
							//jComboBoxid_linea_categoriaBusquedaPreciosComprasPreciosCompras.setSelectedItem(lineacategoriaTemp);
							if(jComboBoxid_linea_categoriaBusquedaPreciosComprasPreciosCompras.getItemCount()>0) {
								jComboBoxid_linea_categoriaBusquedaPreciosComprasPreciosCompras.setSelectedIndex(0);
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
	public void setActualLineaCategoriaForeignKeyGenerico(Long idLineaCategoriaSeleccionado,JComboBox jComboBoxid_linea_categoriaPreciosComprasGenerico)throws Exception
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
				jComboBoxid_linea_categoriaPreciosComprasGenerico.setSelectedItem(lineacategoriaTemp);
			} else {
				if(jComboBoxid_linea_categoriaPreciosComprasGenerico!=null && jComboBoxid_linea_categoriaPreciosComprasGenerico.getItemCount()>0) {
					jComboBoxid_linea_categoriaPreciosComprasGenerico.setSelectedIndex(0);
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

					if(this.precioscompras!=null) {
						this.precioscompras.setLineaMarca(lineamarcaTemp);
					}

					if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
						this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_marcaPreciosCompras.setSelectedItem(lineamarcaTemp);
					}
				} else {
					//jComboBoxid_linea_marcaPreciosCompras.setSelectedItem(lineamarcaTemp);
					if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
						if(this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_marcaPreciosCompras.getItemCount()>0) {
							this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_marcaPreciosCompras.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPreciosCompras") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineamarcaTemp!=null && jComboBoxid_linea_marcaBusquedaPreciosComprasPreciosCompras!=null) {
						jComboBoxid_linea_marcaBusquedaPreciosComprasPreciosCompras.setSelectedItem(lineamarcaTemp);
					} else {
						if(jComboBoxid_linea_marcaBusquedaPreciosComprasPreciosCompras!=null) {
							//jComboBoxid_linea_marcaBusquedaPreciosComprasPreciosCompras.setSelectedItem(lineamarcaTemp);
							if(jComboBoxid_linea_marcaBusquedaPreciosComprasPreciosCompras.getItemCount()>0) {
								jComboBoxid_linea_marcaBusquedaPreciosComprasPreciosCompras.setSelectedIndex(0);
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
	public void setActualLineaMarcaForeignKeyGenerico(Long idLineaMarcaSeleccionado,JComboBox jComboBoxid_linea_marcaPreciosComprasGenerico)throws Exception
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
				jComboBoxid_linea_marcaPreciosComprasGenerico.setSelectedItem(lineamarcaTemp);
			} else {
				if(jComboBoxid_linea_marcaPreciosComprasGenerico!=null && jComboBoxid_linea_marcaPreciosComprasGenerico.getItemCount()>0) {
					jComboBoxid_linea_marcaPreciosComprasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(PreciosCompras precioscompras,JComboBox jComboBoxid_empresaPreciosComprasGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaPreciosComprasGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_empresaPreciosCompras.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaPreciosComprasGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				precioscompras.setid_empresa(empresaAux.getId());
				precioscompras.setempresa_descripcion(PreciosComprasConstantesFunciones.getEmpresaDescripcion(empresaAux));
				precioscompras.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(PreciosCompras precioscompras,JComboBox jComboBoxid_sucursalPreciosComprasGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalPreciosComprasGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_sucursalPreciosCompras.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalPreciosComprasGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				precioscompras.setid_sucursal(sucursalAux.getId());
				precioscompras.setsucursal_descripcion(PreciosComprasConstantesFunciones.getSucursalDescripcion(sucursalAux));
				precioscompras.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(PreciosCompras precioscompras,JComboBox jComboBoxid_bodegaPreciosComprasGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaPreciosComprasGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_bodegaPreciosCompras.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaPreciosComprasGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				precioscompras.setid_bodega(bodegaAux.getId());
				precioscompras.setbodega_descripcion(PreciosComprasConstantesFunciones.getBodegaDescripcion(bodegaAux));
				precioscompras.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(PreciosCompras precioscompras,JComboBox jComboBoxid_productoPreciosComprasGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoPreciosComprasGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_productoPreciosCompras.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoPreciosComprasGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				precioscompras.setid_producto(productoAux.getId());
				precioscompras.setproducto_descripcion(PreciosComprasConstantesFunciones.getProductoDescripcion(productoAux));
				precioscompras.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTransaccionForeignKey(PreciosCompras precioscompras,JComboBox jComboBoxid_transaccionPreciosComprasGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionAux=new Transaccion();

			if(jComboBoxid_transaccionPreciosComprasGenerico==null) {
				transaccionAux=(Transaccion)this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_transaccionPreciosCompras.getSelectedItem();
			} else {
				transaccionAux=(Transaccion)jComboBoxid_transaccionPreciosComprasGenerico.getSelectedItem();
			}

			if(transaccionAux!=null && transaccionAux.getId()!=null) {
				precioscompras.setid_transaccion(transaccionAux.getId());
				precioscompras.settransaccion_descripcion(PreciosComprasConstantesFunciones.getTransaccionDescripcion(transaccionAux));
				precioscompras.setTransaccion(transaccionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaForeignKey(PreciosCompras precioscompras,JComboBox jComboBoxid_lineaPreciosComprasGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_lineaPreciosComprasGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_lineaPreciosCompras.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_lineaPreciosComprasGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				precioscompras.setid_linea(lineaAux.getId());
				precioscompras.setlinea_descripcion(PreciosComprasConstantesFunciones.getLineaDescripcion(lineaAux));
				precioscompras.setLinea(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaGrupoForeignKey(PreciosCompras precioscompras,JComboBox jComboBoxid_linea_grupoPreciosComprasGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_grupoPreciosComprasGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_grupoPreciosCompras.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_grupoPreciosComprasGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				precioscompras.setid_linea_grupo(lineaAux.getId());
				precioscompras.setlineagrupo_descripcion(PreciosComprasConstantesFunciones.getLineaGrupoDescripcion(lineaAux));
				precioscompras.setLineaGrupo(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaCategoriaForeignKey(PreciosCompras precioscompras,JComboBox jComboBoxid_linea_categoriaPreciosComprasGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_categoriaPreciosComprasGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_categoriaPreciosCompras.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_categoriaPreciosComprasGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				precioscompras.setid_linea_categoria(lineaAux.getId());
				precioscompras.setlineacategoria_descripcion(PreciosComprasConstantesFunciones.getLineaCategoriaDescripcion(lineaAux));
				precioscompras.setLineaCategoria(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaMarcaForeignKey(PreciosCompras precioscompras,JComboBox jComboBoxid_linea_marcaPreciosComprasGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_marcaPreciosComprasGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_marcaPreciosCompras.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_marcaPreciosComprasGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				precioscompras.setid_linea_marca(lineaAux.getId());
				precioscompras.setlineamarca_descripcion(PreciosComprasConstantesFunciones.getLineaMarcaDescripcion(lineaAux));
				precioscompras.setLineaMarca(lineaAux);			}
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

					if(!PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPreciosCompras!=null) { 
							this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_empresaPreciosCompras.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_empresaPreciosCompras.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPreciosCompras!=null) { 
					}

					if(!PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPreciosCompras!=null) { 
							this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_sucursalPreciosCompras.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_sucursalPreciosCompras.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPreciosCompras!=null) { 
					}

					if(!PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPreciosCompras!=null) { 
							this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_bodegaPreciosCompras.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_bodegaPreciosCompras.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPreciosCompras!=null) { 
					}

					if(!PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPreciosCompras") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaBusquedaPreciosComprasPreciosCompras.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaBusquedaPreciosComprasPreciosCompras.addItem(bodega);
							}
						}

						if(!PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPreciosCompras!=null) { 
							this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_productoPreciosCompras.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_productoPreciosCompras.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPreciosCompras!=null) { 
					}

					if(!PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPreciosCompras") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoBusquedaPreciosComprasPreciosCompras.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoBusquedaPreciosComprasPreciosCompras.addItem(producto);
							}
						}

						if(!PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTransaccionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTransaccion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPreciosCompras!=null) { 
							this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_transaccionPreciosCompras.removeAllItems();

							for(Transaccion transaccion:this.transaccionsForeignKey) {
								this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_transaccionPreciosCompras.addItem(transaccion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPreciosCompras!=null) { 
					}

					if(!PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPreciosCompras") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_transaccionBusquedaPreciosComprasPreciosCompras.removeAllItems();

							for(Transaccion transaccion:this.transaccionsForeignKey) {
								this.jComboBoxid_transaccionBusquedaPreciosComprasPreciosCompras.addItem(transaccion);
							}
						}

						if(!PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPreciosCompras!=null) { 
							this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_lineaPreciosCompras.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_lineaPreciosCompras.addItem(linea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPreciosCompras!=null) { 
					}

					if(!PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPreciosCompras") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_lineaBusquedaPreciosComprasPreciosCompras.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jComboBoxid_lineaBusquedaPreciosComprasPreciosCompras.addItem(linea);
							}
						}

						if(!PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPreciosCompras!=null) { 
							this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_grupoPreciosCompras.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_grupoPreciosCompras.addItem(lineagrupo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPreciosCompras!=null) { 
					}

					if(!PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPreciosCompras") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_grupoBusquedaPreciosComprasPreciosCompras.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jComboBoxid_linea_grupoBusquedaPreciosComprasPreciosCompras.addItem(lineagrupo);
							}
						}

						if(!PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPreciosCompras!=null) { 
							this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_categoriaPreciosCompras.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_categoriaPreciosCompras.addItem(lineacategoria);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPreciosCompras!=null) { 
					}

					if(!PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPreciosCompras") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_categoriaBusquedaPreciosComprasPreciosCompras.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jComboBoxid_linea_categoriaBusquedaPreciosComprasPreciosCompras.addItem(lineacategoria);
							}
						}

						if(!PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPreciosCompras!=null) { 
							this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_marcaPreciosCompras.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_marcaPreciosCompras.addItem(lineamarca);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPreciosCompras!=null) { 
					}

					if(!PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPreciosCompras") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_marcaBusquedaPreciosComprasPreciosCompras.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jComboBoxid_linea_marcaBusquedaPreciosComprasPreciosCompras.addItem(lineamarca);
							}
						}

						if(!PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
							this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_empresaPreciosCompras.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
							this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_empresaPreciosCompras.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
							this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_sucursalPreciosCompras.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
							this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_sucursalPreciosCompras.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
							this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_bodegaPreciosCompras.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
							this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_bodegaPreciosCompras.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaBusquedaPreciosComprasPreciosCompras.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaBusquedaPreciosComprasPreciosCompras.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
							this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_productoPreciosCompras.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
							this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_productoPreciosCompras.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoBusquedaPreciosComprasPreciosCompras.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoBusquedaPreciosComprasPreciosCompras.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTransaccionForeignKey(Transaccion transaccion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
							this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_transaccionPreciosCompras.setSelectedItem(transaccion);
						}
					} else {
						if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
							this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_transaccionPreciosCompras.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_transaccionBusquedaPreciosComprasPreciosCompras.setSelectedItem(transaccion);
						} else {
							this.jComboBoxid_transaccionBusquedaPreciosComprasPreciosCompras.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
							this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_lineaPreciosCompras.setSelectedItem(linea);
						}
					} else {
						if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
							this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_lineaPreciosCompras.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_lineaBusquedaPreciosComprasPreciosCompras.setSelectedItem(linea);
						} else {
							this.jComboBoxid_lineaBusquedaPreciosComprasPreciosCompras.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
							this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_grupoPreciosCompras.setSelectedItem(lineagrupo);
						}
					} else {
						if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
							this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_grupoPreciosCompras.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_grupoBusquedaPreciosComprasPreciosCompras.setSelectedItem(lineagrupo);
						} else {
							this.jComboBoxid_linea_grupoBusquedaPreciosComprasPreciosCompras.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
							this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_categoriaPreciosCompras.setSelectedItem(lineacategoria);
						}
					} else {
						if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
							this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_categoriaPreciosCompras.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_categoriaBusquedaPreciosComprasPreciosCompras.setSelectedItem(lineacategoria);
						} else {
							this.jComboBoxid_linea_categoriaBusquedaPreciosComprasPreciosCompras.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
							this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_marcaPreciosCompras.setSelectedItem(lineamarca);
						}
					} else {
						if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
							this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_marcaPreciosCompras.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_marcaBusquedaPreciosComprasPreciosCompras.setSelectedItem(lineamarca);
						} else {
							this.jComboBoxid_linea_marcaBusquedaPreciosComprasPreciosCompras.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesPreciosCompras() throws Exception {
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
		
	public PreciosComprasParameterReturnGeneral getPreciosComprasParameterGeneral() {
		return this.precioscomprasParameterGeneral;
	}
	
	public void setPreciosComprasParameterGeneral(PreciosComprasParameterReturnGeneral precioscomprasParameterGeneral) {
		this.precioscomprasParameterGeneral = precioscomprasParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPreciosCompras() {
		return isPermisoTodoPreciosCompras;
	}

	public void setIsPermisoTodoPreciosCompras(Boolean isPermisoTodoPreciosCompras) {
		this.isPermisoTodoPreciosCompras = isPermisoTodoPreciosCompras;
	}

	public Boolean getIsPermisoNuevoPreciosCompras() {
		return isPermisoNuevoPreciosCompras;
	}

	public void setIsPermisoNuevoPreciosCompras(Boolean isPermisoNuevoPreciosCompras) {
		this.isPermisoNuevoPreciosCompras = isPermisoNuevoPreciosCompras;
	}

	public Boolean getIsPermisoActualizarPreciosCompras() {
		return isPermisoActualizarPreciosCompras;
	}

	public void setIsPermisoActualizarPreciosCompras(Boolean isPermisoActualizarPreciosCompras) {
		this.isPermisoActualizarPreciosCompras = isPermisoActualizarPreciosCompras;
	}

	public Boolean getIsPermisoEliminarPreciosCompras() {
		return isPermisoEliminarPreciosCompras;
	}

	public void setIsPermisoEliminarPreciosCompras(Boolean isPermisoEliminarPreciosCompras) {
		this.isPermisoEliminarPreciosCompras = isPermisoEliminarPreciosCompras;
	}

	public Boolean getIsPermisoGuardarCambiosPreciosCompras() {
		return isPermisoGuardarCambiosPreciosCompras;
	}

	public void setIsPermisoGuardarCambiosPreciosCompras(Boolean isPermisoGuardarCambiosPreciosCompras) {
		this.isPermisoGuardarCambiosPreciosCompras = isPermisoGuardarCambiosPreciosCompras;
	}
	
	public Boolean getIsPermisoConsultaPreciosCompras() {
		return isPermisoConsultaPreciosCompras;
	}

	public void setIsPermisoConsultaPreciosCompras(Boolean isPermisoConsultaPreciosCompras) {
		this.isPermisoConsultaPreciosCompras = isPermisoConsultaPreciosCompras;
	}

	public Boolean getIsPermisoBusquedaPreciosCompras() {
		return isPermisoBusquedaPreciosCompras;
	}

	public void setIsPermisoBusquedaPreciosCompras(Boolean isPermisoBusquedaPreciosCompras) {
		this.isPermisoBusquedaPreciosCompras = isPermisoBusquedaPreciosCompras;
	}

	public Boolean getIsPermisoReportePreciosCompras() {
		return isPermisoReportePreciosCompras;
	}

	public void setIsPermisoReportePreciosCompras(Boolean isPermisoReportePreciosCompras) {
		this.isPermisoReportePreciosCompras = isPermisoReportePreciosCompras;
	}
	
	public Boolean getIsPermisoPaginacionMedioPreciosCompras() {
		return isPermisoPaginacionMedioPreciosCompras;
	}

	public void setIsPermisoPaginacionMedioPreciosCompras(Boolean isPermisoPaginacionMedioPreciosCompras) {
		this.isPermisoPaginacionMedioPreciosCompras = isPermisoPaginacionMedioPreciosCompras;
	}
	
	public Boolean getIsPermisoPaginacionTodoPreciosCompras() {
		return isPermisoPaginacionTodoPreciosCompras;
	}

	public void setIsPermisoPaginacionTodoPreciosCompras(Boolean isPermisoPaginacionTodoPreciosCompras) {
		this.isPermisoPaginacionTodoPreciosCompras = isPermisoPaginacionTodoPreciosCompras;
	}
	
	public Boolean getIsPermisoPaginacionAltoPreciosCompras() {
		return isPermisoPaginacionAltoPreciosCompras;
	}

	public void setIsPermisoPaginacionAltoPreciosCompras(Boolean isPermisoPaginacionAltoPreciosCompras) {
		this.isPermisoPaginacionAltoPreciosCompras = isPermisoPaginacionAltoPreciosCompras;
	}
	
	public Boolean getIsPermisoCopiarPreciosCompras() {
		return isPermisoCopiarPreciosCompras;
	}

	public void setIsPermisoCopiarPreciosCompras(Boolean isPermisoCopiarPreciosCompras) {
		this.isPermisoCopiarPreciosCompras = isPermisoCopiarPreciosCompras;
	}
	
	public Boolean getIsPermisoVerFormPreciosCompras() {
		return isPermisoVerFormPreciosCompras;
	}

	public void setIsPermisoVerFormPreciosCompras(Boolean isPermisoVerFormPreciosCompras) {
		this.isPermisoVerFormPreciosCompras = isPermisoVerFormPreciosCompras;
	}
	
	public Boolean getIsPermisoDuplicarPreciosCompras() {
		return isPermisoDuplicarPreciosCompras;
	}

	public void setIsPermisoDuplicarPreciosCompras(Boolean isPermisoDuplicarPreciosCompras) {
		this.isPermisoDuplicarPreciosCompras = isPermisoDuplicarPreciosCompras;
	}
	
	public Boolean getIsPermisoOrdenPreciosCompras() {
		return isPermisoOrdenPreciosCompras;
	}

	public void setIsPermisoOrdenPreciosCompras(Boolean isPermisoOrdenPreciosCompras) {
		this.isPermisoOrdenPreciosCompras = isPermisoOrdenPreciosCompras;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPreciosCompras() {
		return isVisibilidadCeldaNuevoPreciosCompras;
	}

	public void setIsVisibilidadCeldaNuevoPreciosCompras(Boolean isVisibilidadCeldaNuevoPreciosCompras) {
		this.isVisibilidadCeldaNuevoPreciosCompras = isVisibilidadCeldaNuevoPreciosCompras;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPreciosCompras() {
		return isVisibilidadCeldaDuplicarPreciosCompras;
	}

	public void setIsVisibilidadCeldaDuplicarPreciosCompras(Boolean isVisibilidadCeldaDuplicarPreciosCompras) {
		this.isVisibilidadCeldaDuplicarPreciosCompras = isVisibilidadCeldaDuplicarPreciosCompras;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPreciosCompras() {
		return isVisibilidadCeldaCopiarPreciosCompras;
	}

	public void setIsVisibilidadCeldaCopiarPreciosCompras(Boolean isVisibilidadCeldaCopiarPreciosCompras) {
		this.isVisibilidadCeldaCopiarPreciosCompras = isVisibilidadCeldaCopiarPreciosCompras;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPreciosCompras() {
		return isVisibilidadCeldaVerFormPreciosCompras;
	}

	public void setIsVisibilidadCeldaVerFormPreciosCompras(Boolean isVisibilidadCeldaVerFormPreciosCompras) {
		this.isVisibilidadCeldaVerFormPreciosCompras = isVisibilidadCeldaVerFormPreciosCompras;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPreciosCompras() {
		return isVisibilidadCeldaOrdenPreciosCompras;
	}

	public void setIsVisibilidadCeldaOrdenPreciosCompras(Boolean isVisibilidadCeldaOrdenPreciosCompras) {
		this.isVisibilidadCeldaOrdenPreciosCompras = isVisibilidadCeldaOrdenPreciosCompras;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPreciosCompras() {
		return isVisibilidadCeldaNuevoRelacionesPreciosCompras;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPreciosCompras(Boolean isVisibilidadCeldaNuevoRelacionesPreciosCompras) {
		this.isVisibilidadCeldaNuevoRelacionesPreciosCompras = isVisibilidadCeldaNuevoRelacionesPreciosCompras;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPreciosCompras() {
		return isVisibilidadCeldaModificarPreciosCompras;
	}

	public void setIsVisibilidadCeldaModificarPreciosCompras(Boolean isVisibilidadCeldaModificarPreciosCompras) {
		this.isVisibilidadCeldaModificarPreciosCompras = isVisibilidadCeldaModificarPreciosCompras;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPreciosCompras() {
		return isVisibilidadCeldaActualizarPreciosCompras;
	}

	public void setIsVisibilidadCeldaActualizarPreciosCompras(Boolean isVisibilidadCeldaActualizarPreciosCompras) {
		this.isVisibilidadCeldaActualizarPreciosCompras = isVisibilidadCeldaActualizarPreciosCompras;
	}

	public Boolean getIsVisibilidadCeldaEliminarPreciosCompras() {
		return isVisibilidadCeldaEliminarPreciosCompras;
	}

	public void setIsVisibilidadCeldaEliminarPreciosCompras(Boolean isVisibilidadCeldaEliminarPreciosCompras) {
		this.isVisibilidadCeldaEliminarPreciosCompras = isVisibilidadCeldaEliminarPreciosCompras;
	}

	public Boolean getIsVisibilidadCeldaCancelarPreciosCompras() {
		return isVisibilidadCeldaCancelarPreciosCompras;
	}

	public void setIsVisibilidadCeldaCancelarPreciosCompras(Boolean isVisibilidadCeldaCancelarPreciosCompras) {
		this.isVisibilidadCeldaCancelarPreciosCompras = isVisibilidadCeldaCancelarPreciosCompras;
	}

	public Boolean getIsVisibilidadCeldaGuardarPreciosCompras() {
		return isVisibilidadCeldaGuardarPreciosCompras;
	}

	public void setIsVisibilidadCeldaGuardarPreciosCompras(Boolean isVisibilidadCeldaGuardarPreciosCompras) {
		this.isVisibilidadCeldaGuardarPreciosCompras = isVisibilidadCeldaGuardarPreciosCompras;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPreciosCompras() {
		return isVisibilidadCeldaGuardarCambiosPreciosCompras;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPreciosCompras(Boolean isVisibilidadCeldaGuardarCambiosPreciosCompras) {
		this.isVisibilidadCeldaGuardarCambiosPreciosCompras = isVisibilidadCeldaGuardarCambiosPreciosCompras;
	}
		
	public PreciosComprasSessionBean getprecioscomprasSessionBean() {
		return this.precioscomprasSessionBean;
	}
	
	public void setprecioscomprasSessionBean(PreciosComprasSessionBean precioscomprasSessionBean) {
		this.precioscomprasSessionBean=precioscomprasSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPreciosCompras() {
		return this.isVisibilidadBusquedaPreciosCompras;
	}

	public void setisVisibilidadBusquedaPreciosCompras(Boolean isVisibilidadBusquedaPreciosCompras) {
		this.isVisibilidadBusquedaPreciosCompras=isVisibilidadBusquedaPreciosCompras;
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

	public Boolean getisVisibilidadFK_IdTransaccion() {
		return this.isVisibilidadFK_IdTransaccion;
	}

	public void setisVisibilidadFK_IdTransaccion(Boolean isVisibilidadFK_IdTransaccion) {
		this.isVisibilidadFK_IdTransaccion=isVisibilidadFK_IdTransaccion;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(PreciosCompras precioscompras)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(precioscompras,null);
				this.setActualParaGuardarSucursalForeignKey(precioscompras,null);
				this.setActualParaGuardarBodegaForeignKey(precioscompras,null);
				this.setActualParaGuardarProductoForeignKey(precioscompras,null);
				this.setActualParaGuardarTransaccionForeignKey(precioscompras,null);
				this.setActualParaGuardarLineaForeignKey(precioscompras,null);
				this.setActualParaGuardarLineaGrupoForeignKey(precioscompras,null);
				this.setActualParaGuardarLineaCategoriaForeignKey(precioscompras,null);
				this.setActualParaGuardarLineaMarcaForeignKey(precioscompras,null);
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
	
	public void bugActualizarReferenciaActual(PreciosCompras precioscompras,PreciosCompras precioscomprasAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPreciosCompras(precioscompras);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		precioscomprasAux.setId(precioscompras.getId());
		precioscomprasAux.setVersionRow(precioscompras.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(PreciosCompras precioscomprasLocal) throws Exception {
		
		if(this.precioscomprasSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PreciosCompras precioscomprasLocal) throws Exception {	
		if(this.precioscomprasSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				precioscomprasLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				precioscomprasLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				precioscomprasLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				precioscomprasLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TransaccionDetalleFormJInternalFrame.class)) {
				TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrameLocal=(TransaccionBeanSwingJInternalFrame) ((TransaccionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				transaccionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTransaccion(transaccionBeanSwingJInternalFrameLocal.gettransaccion(),true);
				transaccionBeanSwingJInternalFrameLocal.actualizarLista(transaccionBeanSwingJInternalFrameLocal.transaccion,this.transaccionsForeignKey);

				transaccionBeanSwingJInternalFrameLocal.actualizarRelaciones(transaccionBeanSwingJInternalFrameLocal.transaccion);

				precioscomprasLocal.setTransaccion(transaccionBeanSwingJInternalFrameLocal.transaccion);

				this.addItemDefectoCombosForeignKeyTransaccion();
				this.cargarCombosFrameTransaccionsForeignKey("Formulario");
				this.setActualTransaccionForeignKey(transaccionBeanSwingJInternalFrameLocal.transaccion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineaBeanSwingJInternalFrameLocal.actualizarLista(lineaBeanSwingJInternalFrameLocal.linea,this.lineasForeignKey);

				lineaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineaBeanSwingJInternalFrameLocal.linea);

				precioscomprasLocal.setLinea(lineaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey("Formulario");
				this.setActualLineaForeignKey(lineaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineagrupoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineagrupoBeanSwingJInternalFrameLocal.getlinea(),true);
				lineagrupoBeanSwingJInternalFrameLocal.actualizarLista(lineagrupoBeanSwingJInternalFrameLocal.linea,this.lineagruposForeignKey);

				lineagrupoBeanSwingJInternalFrameLocal.actualizarRelaciones(lineagrupoBeanSwingJInternalFrameLocal.linea);

				precioscomprasLocal.setLineaGrupo(lineagrupoBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey("Formulario");
				this.setActualLineaGrupoForeignKey(lineagrupoBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineacategoriaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineacategoriaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineacategoriaBeanSwingJInternalFrameLocal.actualizarLista(lineacategoriaBeanSwingJInternalFrameLocal.linea,this.lineacategoriasForeignKey);

				lineacategoriaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				precioscomprasLocal.setLineaCategoria(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaCategoria();
				this.cargarCombosFrameLineaCategoriasForeignKey("Formulario");
				this.setActualLineaCategoriaForeignKey(lineacategoriaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineamarcaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineamarcaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineamarcaBeanSwingJInternalFrameLocal.actualizarLista(lineamarcaBeanSwingJInternalFrameLocal.linea,this.lineamarcasForeignKey);

				lineamarcaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineamarcaBeanSwingJInternalFrameLocal.linea);

				precioscomprasLocal.setLineaMarca(lineamarcaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaMarca();
				this.cargarCombosFrameLineaMarcasForeignKey("Formulario");
				this.setActualLineaMarcaForeignKey(lineamarcaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPreciosComprasActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.precioscompras =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.precioscompras =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = precioscomprasValidator.getInvalidValues(this.precioscompras);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PreciosCompras precioscompras,List<PreciosCompras> precioscomprass) throws Exception {
	}		
	
	public void actualizarSelectedLista(PreciosCompras precioscompras,List<PreciosCompras> precioscomprass) throws Exception {
		try	{			
			PreciosComprasConstantesFunciones.actualizarSelectedLista(precioscompras,precioscomprass);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PreciosCompras> precioscomprassLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				precioscomprassLocal=this.precioscomprasLogic.getPreciosComprass();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				precioscomprassLocal=this.precioscomprass;
			}
			//ARCHITECTURE
		
			for(PreciosCompras precioscomprasLocal:precioscomprassLocal) {
				if(this.permiteMantenimiento(precioscomprasLocal) && precioscomprasLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PreciosComprasConstantesFunciones.getPreciosComprasLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PreciosComprasConstantesFunciones.NOMBRECOMPLETOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreciosCompras.jLabelnombre_completo_clientePreciosCompras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PreciosComprasConstantesFunciones.NUMEROCOMPROBANTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreciosCompras.jLabelnumero_comprobantePreciosCompras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PreciosComprasConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreciosCompras.jLabelfecha_emisionPreciosCompras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PreciosComprasConstantesFunciones.NOMBREPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreciosCompras.jLabelnombre_productoPreciosCompras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PreciosComprasConstantesFunciones.COSTOUNITARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreciosCompras.jLabelcosto_unitarioPreciosCompras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PreciosComprasConstantesFunciones.CODIGOPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreciosCompras.jLabelcodigo_productoPreciosCompras,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPreciosCompras.jLabelnombre_completo_clientePreciosCompras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPreciosCompras.jLabelnumero_comprobantePreciosCompras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPreciosCompras.jLabelfecha_emisionPreciosCompras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPreciosCompras.jLabelnombre_productoPreciosCompras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPreciosCompras.jLabelcosto_unitarioPreciosCompras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPreciosCompras.jLabelcodigo_productoPreciosCompras,"");
		
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
		this.iIdNuevoPreciosCompras--;	
		
		
		this.precioscomprasAux=new PreciosCompras();
		
		this.precioscomprasAux.setId(this.iIdNuevoPreciosCompras);
		this.precioscomprasAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.precioscomprasLogic.getPreciosComprass().add(this.precioscomprasAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.precioscomprass.add(this.precioscomprasAux);
		}
		//ARCHITECTURE
		
		this.precioscompras=this.precioscomprasAux;
		
		if(PreciosComprasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPreciosCompras(this.precioscompras);
			this.setVariablesObjetoActualToFormularioForeignKeyPreciosCompras(this.precioscompras);
		}
				
		//this.setDefaultControlesPreciosCompras();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPreciosCompras();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPreciosCompras();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPreciosCompras();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPreciosCompras(this.precioscomprasBean,this.precioscompras,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPreciosCompras(this.precioscomprasReturnGeneral,this.precioscomprasBean,false);
		
		if(this.precioscomprasReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPreciosCompras(this.precioscomprasReturnGeneral.getPreciosCompras());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPreciosCompras(this.precioscomprasReturnGeneral.getPreciosCompras());
		}
		
		if(this.precioscomprasReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPreciosCompras(this.precioscomprasReturnGeneral.getPreciosCompras(),classes);//this.precioscomprasBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPreciosCompras(this.precioscompras,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPreciosCompras();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPreciosCompras();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PreciosComprasBeanSwingJInternalFrameAdditional.RecargarFormPreciosCompras(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPreciosCompras(false);
						
			if(precioscomprasSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPreciosCompras();
			}
			
			this.actualizarVisualTableDatosPreciosCompras();
			
			this.jTableDatosPreciosCompras.setRowSelectionInterval(this.getIndiceNuevoPreciosCompras(), this.getIndiceNuevoPreciosCompras());
			
			this.seleccionarFilaTablaPreciosComprasActual();
						
			this.actualizarEstadoCeldasBotonesPreciosCompras("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPreciosCompras(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPreciosCompras.jDateChooserfecha_emision_desdePreciosCompras.setEnabled(isHabilitar && this.precioscomprasConstantesFunciones.activarfecha_emision_desdePreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jDateChooserfecha_emision_hastaPreciosCompras.setEnabled(isHabilitar && this.precioscomprasConstantesFunciones.activarfecha_emision_hastaPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jTextAreanombre_completo_clientePreciosCompras.setEnabled(isHabilitar && this.precioscomprasConstantesFunciones.activarnombre_completo_clientePreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jTextFieldnumero_comprobantePreciosCompras.setEnabled(isHabilitar && this.precioscomprasConstantesFunciones.activarnumero_comprobantePreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jDateChooserfecha_emisionPreciosCompras.setEnabled(isHabilitar && this.precioscomprasConstantesFunciones.activarfecha_emisionPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jTextAreanombre_productoPreciosCompras.setEnabled(isHabilitar && this.precioscomprasConstantesFunciones.activarnombre_productoPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jTextFieldcosto_unitarioPreciosCompras.setEnabled(isHabilitar && this.precioscomprasConstantesFunciones.activarcosto_unitarioPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jTextFieldcodigo_productoPreciosCompras.setEnabled(isHabilitar && this.precioscomprasConstantesFunciones.activarcodigo_productoPreciosCompras);	
		//
		this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_empresaPreciosCompras.setEnabled(isHabilitar && this.precioscomprasConstantesFunciones.activarid_empresaPreciosCompras);//
		this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_sucursalPreciosCompras.setEnabled(isHabilitar && this.precioscomprasConstantesFunciones.activarid_sucursalPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_bodegaPreciosCompras.setEnabled(isHabilitar && this.precioscomprasConstantesFunciones.activarid_bodegaPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_productoPreciosCompras.setEnabled(isHabilitar && this.precioscomprasConstantesFunciones.activarid_productoPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_transaccionPreciosCompras.setEnabled(isHabilitar && this.precioscomprasConstantesFunciones.activarid_transaccionPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_lineaPreciosCompras.setEnabled(isHabilitar && this.precioscomprasConstantesFunciones.activarid_lineaPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_grupoPreciosCompras.setEnabled(isHabilitar && this.precioscomprasConstantesFunciones.activarid_linea_grupoPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_categoriaPreciosCompras.setEnabled(isHabilitar && this.precioscomprasConstantesFunciones.activarid_linea_categoriaPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_marcaPreciosCompras.setEnabled(isHabilitar && this.precioscomprasConstantesFunciones.activarid_linea_marcaPreciosCompras);
	};
	
	public void setDefaultControlesPreciosCompras() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPreciosCompras(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.precioscomprasSessionBean.setConGuardarRelaciones(true);			
			this.precioscomprasSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPreciosCompras.jTabbedPaneRelacionesPreciosCompras.setVisible(true);
			
					
		} else {
			//this.precioscomprasSessionBean.setConGuardarRelaciones(false);			
			this.precioscomprasSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPreciosCompras.jTabbedPaneRelacionesPreciosCompras.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoPreciosCompras() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PreciosCompras precioscomprasAux:this.precioscomprasLogic.getPreciosComprass()) {
				if(precioscomprasAux.getId().equals(this.iIdNuevoPreciosCompras)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PreciosCompras precioscomprasAux:this.precioscomprass) {
				if(precioscomprasAux.getId().equals(this.iIdNuevoPreciosCompras)) {
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
	
	public int getIndiceActualPreciosCompras(PreciosCompras precioscompras,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PreciosCompras precioscomprasAux:this.precioscomprasLogic.getPreciosComprass()) {
				if(precioscomprasAux.getId().equals(precioscompras.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PreciosCompras precioscomprasAux:this.precioscomprass) {
				if(precioscomprasAux.getId().equals(precioscompras.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPreciosCompras(PreciosCompras precioscomprasOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PreciosCompras precioscomprasAux:this.precioscomprasLogic.getPreciosComprass()) {
				if(precioscomprasAux.getPreciosComprasOriginal().getId().equals(precioscomprasOriginal.getId())) {
					existe=true;
					precioscomprasOriginal.setId(precioscomprasAux.getId());
					precioscomprasOriginal.setVersionRow(precioscomprasAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PreciosCompras precioscomprasAux:this.precioscomprass) {
				if(precioscomprasAux.getPreciosComprasOriginal().getId().equals(precioscomprasOriginal.getId())) {
					existe=true;
					precioscomprasOriginal.setId(precioscomprasAux.getId());
					precioscomprasOriginal.setVersionRow(precioscomprasAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPreciosCompras(Boolean esParaCancelar) throws Exception {
		precioscomprassAux=new ArrayList<PreciosCompras>();
		precioscomprasAux=new PreciosCompras();
		
		if(!this.precioscomprasSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PreciosCompras precioscomprasAux:this.precioscomprasLogic.getPreciosComprass()) {
					if(precioscomprasAux.getId()<0) {
						precioscomprassAux.add(precioscomprasAux);
					}		
				}
				this.iIdNuevoPreciosCompras=0L;
				this.precioscomprasLogic.getPreciosComprass().removeAll(precioscomprassAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PreciosCompras precioscomprasAux:this.precioscomprass) {
					if(precioscomprasAux.getId()<0) {
						precioscomprassAux.add(precioscomprasAux);
					}		
				}
				this.iIdNuevoPreciosCompras=0L;
				this.precioscomprass.removeAll(precioscomprassAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPreciosCompras 
					&& this.precioscomprasLogic.getPreciosComprass().size()>0
					) {
					precioscomprasAux=this.precioscomprasLogic.getPreciosComprass().get(this.precioscomprasLogic.getPreciosComprass().size() - 1);
				
					if(precioscomprasAux.getId()<0) {
						this.precioscomprasLogic.getPreciosComprass().remove(precioscomprasAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPreciosCompras && this.precioscomprass.size()>0) {
					precioscomprasAux=this.precioscomprass.get(this.precioscomprass.size() - 1);
				
					if(precioscomprasAux.getId()<0) {
						this.precioscomprass.remove(precioscomprasAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPreciosCompras(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(precioscompras.getId()<0) {
				this.precioscomprasLogic.getPreciosComprass().remove(this.precioscompras);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(precioscompras.getId()<0) {
				this.precioscomprass.remove(this.precioscompras);
			}
		}			
	}
	
	public void setEstadosInicialesPreciosCompras(List<PreciosCompras> precioscomprassAux) throws Exception {
		PreciosComprasConstantesFunciones.setEstadosInicialesPreciosCompras(precioscomprassAux);
	}
	
	public void setEstadosInicialesPreciosCompras(PreciosCompras precioscomprasAux) throws Exception {
		PreciosComprasConstantesFunciones.setEstadosInicialesPreciosCompras(precioscomprasAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPreciosComprasActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPreciosCompras("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPreciosComprasActual()) {
				if(!this.isEsNuevoPreciosCompras) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPreciosCompras("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPreciosCompras=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPreciosComprasActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Precios Compras ?", "MANTENIMIENTO DE Precios Compras", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPreciosCompras("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PreciosCompras precioscompras) throws Exception {
		PreciosComprasConstantesFunciones.seleccionarAsignar(this.precioscompras,precioscompras);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPreciosCompras=this.isPermisoActualizarOriginalPreciosCompras;
			
			
			this.seleccionarAsignar(precioscompras);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesPreciosCompras("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.precioscomprasSessionBean.setsFuncionBusquedaRapida(this.precioscomprasSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoPreciosCompras) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPreciosCompras(esParaCancelar);				
				this.cancelarNuevoPreciosCompras(esParaCancelar);								
			}
			
			this.precioscompras=new PreciosCompras();
			
			this.inicializarPreciosCompras();
			
			this.actualizarEstadoCeldasBotonesPreciosCompras("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPreciosCompras() throws Exception {
		try {
			PreciosComprasConstantesFunciones.inicializarPreciosCompras(this.precioscompras);
			
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
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.precioscomprasLogic.getPreciosComprass().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePreciosComprass(String sAccionBusqueda,List<PreciosCompras> precioscomprassParaReportes) throws Exception {
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
					sPathReporteFinal="PreciosCompras"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PreciosComprasMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PreciosComprasMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PreciosCompras"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Precios Comprases");		
		parameters.put("busquedapor", PreciosComprasConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePreciosCompras=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PreciosComprasConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PreciosComprasConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePreciosCompras=new JRBeanArrayDataSource(PreciosComprasJInternalFrame.TraerPreciosComprasBeans(precioscomprassParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePreciosCompras);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PreciosComprasConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PreciosComprasConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PreciosComprasBean.TraerPreciosComprasBeans(precioscomprassParaReportes).toArray()));
							
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
				this.generarExcelReportePreciosComprass(sAccionBusqueda,sTipoArchivoReporte,precioscomprassParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPreciosComprass(sAccionBusqueda,sTipoArchivoReporte,precioscomprassParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPreciosComprasActionPerformed(null);
					//this.generarExcelReportePreciosComprass(sAccionBusqueda,sTipoArchivoReporte,precioscomprassParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPreciosComprass(sAccionBusqueda,sTipoArchivoReporte,precioscomprassParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPreciosComprass(sAccionBusqueda,sTipoArchivoReporte,precioscomprassParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPreciosComprass(sAccionBusqueda,sTipoArchivoReporte,precioscomprassParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePreciosComprass(String sAccionBusqueda,String sTipoArchivoReporte,List<PreciosCompras> precioscomprassParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"precioscompras";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PreciosComprass");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPreciosCompras("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PreciosCompras precioscompras : precioscomprassParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PreciosComprasConstantesFunciones.generarExcelReporteDataPreciosCompras("NORMAL",row,workbook,precioscompras,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.precioscomprasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Precios Compras",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPreciosCompras(String sTipo,Row row,Workbook workbook) {
		
		PreciosComprasConstantesFunciones.generarExcelReporteHeaderPreciosCompras(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPreciosComprass(String sAccionBusqueda,String sTipoArchivoReporte,List<PreciosCompras> precioscomprassParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"precioscompras_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PreciosComprass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PreciosCompras precioscompras : precioscomprassParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PreciosComprasConstantesFunciones.getPreciosComprasDescripcion(precioscompras));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PreciosComprasConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(precioscompras.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PreciosComprasConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(precioscompras.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PreciosComprasConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(precioscompras.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PreciosComprasConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(precioscompras.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PreciosComprasConstantesFunciones.LABEL_IDTRANSACCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_IDTRANSACCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(precioscompras.gettransaccion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PreciosComprasConstantesFunciones.LABEL_IDLINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_IDLINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(precioscompras.getlinea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PreciosComprasConstantesFunciones.LABEL_IDLINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_IDLINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(precioscompras.getlineagrupo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PreciosComprasConstantesFunciones.LABEL_IDLINEACATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_IDLINEACATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(precioscompras.getlineacategoria_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PreciosComprasConstantesFunciones.LABEL_IDLINEAMARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_IDLINEAMARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(precioscompras.getlineamarca_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PreciosComprasConstantesFunciones.LABEL_FECHAEMISIONDESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_FECHAEMISIONDESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(precioscompras.getfecha_emision_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PreciosComprasConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(precioscompras.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PreciosComprasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(precioscompras.getnombre_completo_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PreciosComprasConstantesFunciones.LABEL_NUMEROCOMPROBANTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(precioscompras.getnumero_comprobante());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PreciosComprasConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(precioscompras.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PreciosComprasConstantesFunciones.LABEL_NOMBREPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_NOMBREPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(precioscompras.getnombre_producto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PreciosComprasConstantesFunciones.LABEL_COSTOUNITARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_COSTOUNITARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(precioscompras.getcosto_unitario());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PreciosComprasConstantesFunciones.LABEL_CODIGOPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_CODIGOPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(precioscompras.getcodigo_producto());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.precioscomprasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Precios Compras",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPreciosComprass(String sAccionBusqueda,String sTipoArchivoReporte,List<PreciosCompras> precioscomprassParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PreciosCompras> precioscomprassRespaldo=null;
		
		classes=PreciosComprasConstantesFunciones.getClassesRelationshipsOfPreciosCompras(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.precioscomprasLogic.setDatosCliente(this.datosCliente);
		this.precioscomprasLogic.setDatosDeep(this.datosDeep);
		this.precioscomprasLogic.setIsConDeep(true);
		
		precioscomprassRespaldo=this.precioscomprasLogic.getPreciosComprass();
		
		this.precioscomprasLogic.setPreciosComprass(precioscomprassParaReportes);	
		this.precioscomprasLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		precioscomprassParaReportes=this.precioscomprasLogic.getPreciosComprass();
		this.precioscomprasLogic.setPreciosComprass(precioscomprassRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"precioscompras_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PreciosComprass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPreciosCompras("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PreciosCompras precioscompras : precioscomprassParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPreciosCompras("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PreciosComprasConstantesFunciones.generarExcelReporteDataPreciosCompras("NORMAL",row,workbook,precioscompras,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(PreciosComprasConstantesFunciones.getPreciosComprasDescripcion(precioscompras));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.precioscomprasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Precios Compras",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPreciosCompras.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPreciosCompras.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPreciosCompras.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPreciosCompras.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPreciosCompras() throws Exception {		
		this.startProcessPreciosCompras(true);
	}
	
	public void startProcessPreciosCompras(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPreciosCompras ,this.jPanelParametrosReportesPreciosCompras, this.jScrollPanelDatosPreciosCompras,this.jPanelPaginacionPreciosCompras, this.jScrollPanelDatosEdicionPreciosCompras, this.jPanelAccionesPreciosCompras,this.jPanelAccionesFormularioPreciosCompras,this.jmenuBarPreciosCompras,this.jmenuBarDetallePreciosCompras,this.jTtoolBarPreciosCompras,this.jTtoolBarDetallePreciosCompras);		
		
		final JTabbedPane jTabbedPaneBusquedasPreciosCompras=this.jTabbedPaneBusquedasPreciosCompras; 
		
		final JPanel jPanelParametrosReportesPreciosCompras=this.jPanelParametrosReportesPreciosCompras;
		//final JScrollPane jScrollPanelDatosPreciosCompras=this.jScrollPanelDatosPreciosCompras;
		final JTable jTableDatosPreciosCompras=this.jTableDatosPreciosCompras;		
		final JPanel jPanelPaginacionPreciosCompras=this.jPanelPaginacionPreciosCompras;
		//final JScrollPane jScrollPanelDatosEdicionPreciosCompras=this.jScrollPanelDatosEdicionPreciosCompras;
		final JPanel jPanelAccionesPreciosCompras=this.jPanelAccionesPreciosCompras;
		
		JPanel jPanelCamposAuxiliarPreciosCompras=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPreciosCompras=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
			jPanelCamposAuxiliarPreciosCompras=this.jInternalFrameDetalleFormPreciosCompras.jPanelCamposPreciosCompras;
			jPanelAccionesFormularioAuxiliarPreciosCompras=this.jInternalFrameDetalleFormPreciosCompras.jPanelAccionesFormularioPreciosCompras;
		}
		
		final JPanel jPanelCamposPreciosCompras=jPanelCamposAuxiliarPreciosCompras;
		final JPanel jPanelAccionesFormularioPreciosCompras=jPanelAccionesFormularioAuxiliarPreciosCompras;
		
		
		final JMenuBar jmenuBarPreciosCompras=this.jmenuBarPreciosCompras;
		final JToolBar jTtoolBarPreciosCompras=this.jTtoolBarPreciosCompras;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPreciosCompras=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPreciosCompras=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
			jmenuBarDetalleAuxiliarPreciosCompras=this.jInternalFrameDetalleFormPreciosCompras.jmenuBarDetallePreciosCompras;
			jTtoolBarDetalleAuxiliarPreciosCompras=this.jInternalFrameDetalleFormPreciosCompras.jTtoolBarDetallePreciosCompras;
		}
		
		final JMenuBar jmenuBarDetallePreciosCompras=jmenuBarDetalleAuxiliarPreciosCompras;
		final JToolBar jTtoolBarDetallePreciosCompras=jTtoolBarDetalleAuxiliarPreciosCompras;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPreciosCompras;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPreciosCompras;
			processRunnable.jTableDatos=jTableDatosPreciosCompras;
			processRunnable.jPanelCampos=jPanelCamposPreciosCompras;
			processRunnable.jPanelPaginacion=jPanelPaginacionPreciosCompras;
			processRunnable.jPanelAcciones=jPanelAccionesPreciosCompras;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPreciosCompras;
			
			
			processRunnable.jmenuBar=jmenuBarPreciosCompras;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePreciosCompras;
			processRunnable.jTtoolBar=jTtoolBarPreciosCompras;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePreciosCompras;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPreciosCompras ,jPanelParametrosReportesPreciosCompras,jTableDatosPreciosCompras, /*jScrollPanelDatosPreciosCompras,*/jPanelCamposPreciosCompras,jPanelPaginacionPreciosCompras, /*jScrollPanelDatosEdicionPreciosCompras,*/ jPanelAccionesPreciosCompras,jPanelAccionesFormularioPreciosCompras,jmenuBarPreciosCompras,jmenuBarDetallePreciosCompras,jTtoolBarPreciosCompras,jTtoolBarDetallePreciosCompras);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPreciosCompras ,jPanelParametrosReportesPreciosCompras, jScrollPanelDatosPreciosCompras,jPanelPaginacionPreciosCompras, jScrollPanelDatosEdicionPreciosCompras, jPanelAccionesPreciosCompras,jPanelAccionesFormularioPreciosCompras,jmenuBarPreciosCompras,jmenuBarDetallePreciosCompras,jTtoolBarPreciosCompras,jTtoolBarDetallePreciosCompras);
						
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
	
	public void finishProcessPreciosCompras() {// throws Exception 
		this.finishProcessPreciosCompras(true);
	}
	
	public void finishProcessPreciosCompras(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPreciosCompras ,this.jPanelParametrosReportesPreciosCompras, this.jScrollPanelDatosPreciosCompras,this.jPanelPaginacionPreciosCompras, this.jScrollPanelDatosEdicionPreciosCompras, this.jPanelAccionesPreciosCompras,this.jPanelAccionesFormularioPreciosCompras,this.jmenuBarPreciosCompras,this.jmenuBarDetallePreciosCompras,this.jTtoolBarPreciosCompras,this.jTtoolBarDetallePreciosCompras);		
		
		final JTabbedPane jTabbedPaneBusquedasPreciosCompras=this.jTabbedPaneBusquedasPreciosCompras; 
		
		final JPanel jPanelParametrosReportesPreciosCompras=this.jPanelParametrosReportesPreciosCompras;
		//final JScrollPane jScrollPanelDatosPreciosCompras=this.jScrollPanelDatosPreciosCompras;
		final JTable jTableDatosPreciosCompras=this.jTableDatosPreciosCompras;		
		final JPanel jPanelPaginacionPreciosCompras=this.jPanelPaginacionPreciosCompras;
		//final JScrollPane jScrollPanelDatosEdicionPreciosCompras=this.jScrollPanelDatosEdicionPreciosCompras;
		final JPanel jPanelAccionesPreciosCompras=this.jPanelAccionesPreciosCompras;
		
		JPanel jPanelCamposAuxiliarPreciosCompras=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPreciosCompras=new JPanel();
		
		if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
			jPanelCamposAuxiliarPreciosCompras=this.jInternalFrameDetalleFormPreciosCompras.jPanelCamposPreciosCompras;
			jPanelAccionesFormularioAuxiliarPreciosCompras=this.jInternalFrameDetalleFormPreciosCompras.jPanelAccionesFormularioPreciosCompras;
		}
		
		final JPanel jPanelCamposPreciosCompras=jPanelCamposAuxiliarPreciosCompras;
		final JPanel jPanelAccionesFormularioPreciosCompras=jPanelAccionesFormularioAuxiliarPreciosCompras;
		
		
		final JMenuBar jmenuBarPreciosCompras=this.jmenuBarPreciosCompras;		
		final JToolBar jTtoolBarPreciosCompras=this.jTtoolBarPreciosCompras;
				
		JMenuBar jmenuBarDetalleAuxiliarPreciosCompras=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPreciosCompras=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
			jmenuBarDetalleAuxiliarPreciosCompras=this.jInternalFrameDetalleFormPreciosCompras.jmenuBarDetallePreciosCompras;
			jTtoolBarDetalleAuxiliarPreciosCompras=this.jInternalFrameDetalleFormPreciosCompras.jTtoolBarDetallePreciosCompras;		
		}
		
		final JMenuBar jmenuBarDetallePreciosCompras=jmenuBarDetalleAuxiliarPreciosCompras;
		final JToolBar jTtoolBarDetallePreciosCompras=jTtoolBarDetalleAuxiliarPreciosCompras;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPreciosCompras;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPreciosCompras;
			processRunnable.jTableDatos=jTableDatosPreciosCompras;
			processRunnable.jPanelCampos=jPanelCamposPreciosCompras;
			processRunnable.jPanelPaginacion=jPanelPaginacionPreciosCompras;
			processRunnable.jPanelAcciones=jPanelAccionesPreciosCompras;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPreciosCompras;
			
			
			processRunnable.jmenuBar=jmenuBarPreciosCompras;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePreciosCompras;
			processRunnable.jTtoolBar=jTtoolBarPreciosCompras;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePreciosCompras;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPreciosCompras ,jPanelParametrosReportesPreciosCompras, jTableDatosPreciosCompras,/*jScrollPanelDatosPreciosCompras,*/jPanelCamposPreciosCompras,jPanelPaginacionPreciosCompras, /*jScrollPanelDatosEdicionPreciosCompras,*/ jPanelAccionesPreciosCompras,jPanelAccionesFormularioPreciosCompras,jmenuBarPreciosCompras,jmenuBarDetallePreciosCompras,jTtoolBarPreciosCompras,jTtoolBarDetallePreciosCompras));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPreciosCompras(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPreciosCompras(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPreciosCompras(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPreciosCompras(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPreciosCompras,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePreciosCompras,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPreciosCompras(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPreciosCompras,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePreciosCompras,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.precioscomprasConstantesFunciones.getsFinalQueryPreciosCompras();
		String  finalQueryPaginacionTodos=this.precioscomprasConstantesFunciones.getsFinalQueryPreciosCompras();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PreciosComprasConstantesFunciones.getArrayColumnasGlobalesNoPreciosCompras(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PreciosComprasConstantesFunciones.getArrayColumnasGlobalesPreciosCompras(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PreciosComprasConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.precioscomprassEliminados= new ArrayList<PreciosCompras>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPreciosCompras();
		
				///*PreciosComprasSessionBean*/this.precioscomprasSessionBean=new PreciosComprasSessionBean();
			
			if(this.precioscomprasSessionBean==null) {
				this.precioscomprasSessionBean=new PreciosComprasSessionBean();
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
					this.iNumeroPaginacion=PreciosComprasConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PreciosComprasConstantesFunciones.getClassesForeignKeysOfPreciosCompras(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/precioscompras."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			precioscomprassAux= new ArrayList<PreciosCompras>();
			
				
			precioscomprasLogic.setDatosCliente(this.datosCliente);
			precioscomprasLogic.setDatosDeep(this.datosDeep);
			precioscomprasLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPreciosCompras")) {
				this.sDetalleReporte=PreciosComprasConstantesFunciones.getDetalleIndiceBusquedaPreciosCompras(id_bodegaBusquedaPreciosCompras,id_productoBusquedaPreciosCompras,id_transaccionBusquedaPreciosCompras,id_lineaBusquedaPreciosCompras,id_linea_grupoBusquedaPreciosCompras,id_linea_categoriaBusquedaPreciosCompras,id_linea_marcaBusquedaPreciosCompras,fecha_emision_desdeBusquedaPreciosCompras,fecha_emision_hastaBusquedaPreciosCompras);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					precioscomprasLogic.getPreciosComprassBusquedaPreciosCompras(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_bodegaBusquedaPreciosCompras,id_productoBusquedaPreciosCompras,id_transaccionBusquedaPreciosCompras,id_lineaBusquedaPreciosCompras,id_linea_grupoBusquedaPreciosCompras,id_linea_categoriaBusquedaPreciosCompras,id_linea_marcaBusquedaPreciosCompras,fecha_emision_desdeBusquedaPreciosCompras,fecha_emision_hastaBusquedaPreciosCompras);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PreciosComprasConstantesFunciones.getDetalleIndiceBusquedaPreciosCompras(id_bodegaBusquedaPreciosCompras,id_productoBusquedaPreciosCompras,id_transaccionBusquedaPreciosCompras,id_lineaBusquedaPreciosCompras,id_linea_grupoBusquedaPreciosCompras,id_linea_categoriaBusquedaPreciosCompras,id_linea_marcaBusquedaPreciosCompras,fecha_emision_desdeBusquedaPreciosCompras,fecha_emision_hastaBusquedaPreciosCompras);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PreciosComprasConstantesFunciones.getDetalleIndiceBusquedaPreciosCompras(id_bodegaBusquedaPreciosCompras,id_productoBusquedaPreciosCompras,id_transaccionBusquedaPreciosCompras,id_lineaBusquedaPreciosCompras,id_linea_grupoBusquedaPreciosCompras,id_linea_categoriaBusquedaPreciosCompras,id_linea_marcaBusquedaPreciosCompras,fecha_emision_desdeBusquedaPreciosCompras,fecha_emision_hastaBusquedaPreciosCompras);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=precioscomprasLogic.getPreciosComprass()==null||precioscomprasLogic.getPreciosComprass().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=precioscomprass==null|| precioscomprass.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						precioscomprassAux=new ArrayList<PreciosCompras>();
						precioscomprassAux.addAll(precioscomprasLogic.getPreciosComprass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							precioscomprassAux=new ArrayList<PreciosCompras>();
							precioscomprassAux.addAll(precioscomprass);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							precioscomprasLogic.getPreciosComprassBusquedaPreciosCompras(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_bodegaBusquedaPreciosCompras,id_productoBusquedaPreciosCompras,id_transaccionBusquedaPreciosCompras,id_lineaBusquedaPreciosCompras,id_linea_grupoBusquedaPreciosCompras,id_linea_categoriaBusquedaPreciosCompras,id_linea_marcaBusquedaPreciosCompras,fecha_emision_desdeBusquedaPreciosCompras,fecha_emision_hastaBusquedaPreciosCompras);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PreciosComprasConstantesFunciones.getDetalleIndiceBusquedaPreciosCompras(id_bodegaBusquedaPreciosCompras,id_productoBusquedaPreciosCompras,id_transaccionBusquedaPreciosCompras,id_lineaBusquedaPreciosCompras,id_linea_grupoBusquedaPreciosCompras,id_linea_categoriaBusquedaPreciosCompras,id_linea_marcaBusquedaPreciosCompras,fecha_emision_desdeBusquedaPreciosCompras,fecha_emision_hastaBusquedaPreciosCompras);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PreciosComprasConstantesFunciones.getDetalleIndiceBusquedaPreciosCompras(id_bodegaBusquedaPreciosCompras,id_productoBusquedaPreciosCompras,id_transaccionBusquedaPreciosCompras,id_lineaBusquedaPreciosCompras,id_linea_grupoBusquedaPreciosCompras,id_linea_categoriaBusquedaPreciosCompras,id_linea_marcaBusquedaPreciosCompras,fecha_emision_desdeBusquedaPreciosCompras,fecha_emision_hastaBusquedaPreciosCompras);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePreciosComprass("BusquedaPreciosCompras",precioscomprasLogic.getPreciosComprass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePreciosComprass("BusquedaPreciosCompras",precioscomprass);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						precioscomprasLogic.setPreciosComprass(new ArrayList<PreciosCompras>());
						precioscomprasLogic.getPreciosComprass().addAll(precioscomprassAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							precioscomprass=new ArrayList<PreciosCompras>();
							precioscomprass.addAll(precioscomprassAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPreciosCompras();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPreciosCompras();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=precioscomprasLogic.getPreciosComprass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=precioscomprass.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=precioscomprasLogic.getPreciosComprass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=precioscomprass.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PreciosCompras precioscompras) {
		Boolean permite=true;
		
		if(this.precioscompras.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PreciosComprasConstantesFunciones.getOrderByListaPreciosCompras();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PreciosComprasConstantesFunciones.getOrderByListaPreciosCompras();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PreciosCompras precioscompras:precioscomprasLogic.getPreciosComprass()) {
				if(precioscompras.getsType().equals(Constantes2.S_TOTALES)) {
					precioscomprasTotales=precioscompras;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PreciosCompras precioscompras:this.precioscomprass) {
				if(precioscompras.getsType().equals(Constantes2.S_TOTALES)) {
					precioscomprasTotales=precioscompras;
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
			this.precioscomprasAux=new PreciosCompras();
			this.precioscomprasAux.setsType(Constantes2.S_TOTALES);
			this.precioscomprasAux.setIsNew(false);
			this.precioscomprasAux.setIsChanged(false);
			this.precioscomprasAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//PreciosComprasConstantesFunciones.TotalizarValoresFilaPreciosCompras(this.precioscomprasLogic.getPreciosComprass(),this.precioscomprasAux);
				
				//this.precioscomprasLogic.getPreciosComprass().add(this.precioscomprasAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PreciosComprasConstantesFunciones.TotalizarValoresFilaPreciosCompras(this.precioscomprass,this.precioscomprasAux);
				
				this.precioscomprass.add(this.precioscomprasAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		precioscomprasTotales=new PreciosCompras();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.precioscomprasLogic.getPreciosComprass().remove(precioscomprasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.precioscomprass.remove(precioscomprasTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		precioscomprasTotales=new PreciosCompras();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PreciosCompras precioscompras:precioscomprasLogic.getPreciosComprass()) {
				if(precioscompras.getsType().equals(Constantes2.S_TOTALES)) {
					precioscomprasTotales=precioscompras;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PreciosComprasConstantesFunciones.TotalizarValoresFilaPreciosCompras(this.precioscomprasLogic.getPreciosComprass(),precioscomprasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PreciosCompras precioscompras:this.precioscomprass) {
				if(precioscompras.getsType().equals(Constantes2.S_TOTALES)) {
					precioscomprasTotales=precioscompras;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PreciosComprasConstantesFunciones.TotalizarValoresFilaPreciosCompras(this.precioscomprass,precioscomprasTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPreciosComprassBusquedaPreciosCompras()throws Exception {
		try {
			sAccionBusqueda="BusquedaPreciosCompras";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPreciosComprassFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPreciosComprassFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPreciosComprassFK_IdLinea()throws Exception {
		try {
			sAccionBusqueda="FK_IdLinea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPreciosComprassFK_IdLineaCategoria()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaCategoria";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPreciosComprassFK_IdLineaGrupo()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaGrupo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPreciosComprassFK_IdLineaMarca()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaMarca";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPreciosComprassFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPreciosComprassFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPreciosComprassFK_IdTransaccion()throws Exception {
		try {
			sAccionBusqueda="FK_IdTransaccion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPreciosComprassBusquedaPreciosCompras(String sFinalQuery,Long id_bodega,Long id_producto,Long id_transaccion,Long id_linea,Long id_linea_grupo,Long id_linea_categoria,Long id_linea_marca,Date fecha_emision_desde,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//precioscomprasLogic.getPreciosComprassBusquedaPreciosCompras(sFinalQuery,this.pagination,id_bodega,id_producto,id_transaccion,id_linea,id_linea_grupo,id_linea_categoria,id_linea_marca,fecha_emision_desde,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPreciosComprassFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//precioscomprasLogic.getPreciosComprassFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPreciosComprassFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//precioscomprasLogic.getPreciosComprassFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPreciosComprassFK_IdLinea(String sFinalQuery,Long id_linea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//precioscomprasLogic.getPreciosComprassFK_IdLinea(sFinalQuery,this.pagination,id_linea);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPreciosComprassFK_IdLineaCategoria(String sFinalQuery,Long id_linea_categoria)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//precioscomprasLogic.getPreciosComprassFK_IdLineaCategoria(sFinalQuery,this.pagination,id_linea_categoria);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPreciosComprassFK_IdLineaGrupo(String sFinalQuery,Long id_linea_grupo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//precioscomprasLogic.getPreciosComprassFK_IdLineaGrupo(sFinalQuery,this.pagination,id_linea_grupo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPreciosComprassFK_IdLineaMarca(String sFinalQuery,Long id_linea_marca)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//precioscomprasLogic.getPreciosComprassFK_IdLineaMarca(sFinalQuery,this.pagination,id_linea_marca);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPreciosComprassFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//precioscomprasLogic.getPreciosComprassFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPreciosComprassFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//precioscomprasLogic.getPreciosComprassFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPreciosComprassFK_IdTransaccion(String sFinalQuery,Long id_transaccion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//precioscomprasLogic.getPreciosComprassFK_IdTransaccion(sFinalQuery,this.pagination,id_transaccion);
				
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
	
	public void inicializarPermisosPreciosCompras() {
		this.isPermisoTodoPreciosCompras=false;
		this.isPermisoNuevoPreciosCompras=false;
		this.isPermisoActualizarPreciosCompras=false;
		this.isPermisoActualizarOriginalPreciosCompras=false;
		this.isPermisoEliminarPreciosCompras=false;
		this.isPermisoGuardarCambiosPreciosCompras=false;
		this.isPermisoConsultaPreciosCompras=true;
		this.isPermisoBusquedaPreciosCompras=true;
		this.isPermisoReportePreciosCompras=true;
		this.isPermisoOrdenPreciosCompras=false;		
		this.isPermisoPaginacionMedioPreciosCompras=false;		
		this.isPermisoPaginacionAltoPreciosCompras=false;		
		this.isPermisoPaginacionTodoPreciosCompras=false;		
		this.isPermisoCopiarPreciosCompras=false;		
		this.isPermisoVerFormPreciosCompras=false;		
		this.isPermisoDuplicarPreciosCompras=false;
		this.isPermisoOrdenPreciosCompras=false;
	}
	
	public void setPermisosUsuarioPreciosCompras(Boolean isPermiso) {
		this.isPermisoTodoPreciosCompras=isPermiso;
		this.isPermisoNuevoPreciosCompras=isPermiso;
		this.isPermisoActualizarPreciosCompras=isPermiso;
		this.isPermisoActualizarOriginalPreciosCompras=isPermiso;
		this.isPermisoEliminarPreciosCompras=isPermiso;
		this.isPermisoGuardarCambiosPreciosCompras=isPermiso;
		this.isPermisoConsultaPreciosCompras=isPermiso;
		this.isPermisoBusquedaPreciosCompras=isPermiso;
		this.isPermisoReportePreciosCompras=isPermiso;
		this.isPermisoOrdenPreciosCompras=isPermiso;		
		this.isPermisoPaginacionMedioPreciosCompras=isPermiso;		
		this.isPermisoPaginacionAltoPreciosCompras=isPermiso;		
		this.isPermisoPaginacionTodoPreciosCompras=isPermiso;		
		this.isPermisoCopiarPreciosCompras=isPermiso;		
		this.isPermisoVerFormPreciosCompras=isPermiso;		
		this.isPermisoDuplicarPreciosCompras=isPermiso;
		this.isPermisoOrdenPreciosCompras=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPreciosCompras(Boolean isPermiso) {
		//this.isPermisoTodoPreciosCompras=isPermiso;
		this.isPermisoNuevoPreciosCompras=isPermiso;
		this.isPermisoActualizarPreciosCompras=isPermiso;
		this.isPermisoActualizarOriginalPreciosCompras=isPermiso;
		this.isPermisoEliminarPreciosCompras=isPermiso;
		this.isPermisoGuardarCambiosPreciosCompras=isPermiso;
		//this.isPermisoConsultaPreciosCompras=isPermiso;
		//this.isPermisoBusquedaPreciosCompras=isPermiso;
		//this.isPermisoReportePreciosCompras=isPermiso;
		//this.isPermisoOrdenPreciosCompras=isPermiso;		
		//this.isPermisoPaginacionMedioPreciosCompras=isPermiso;		
		//this.isPermisoPaginacionAltoPreciosCompras=isPermiso;		
		//this.isPermisoPaginacionTodoPreciosCompras=isPermiso;		
		//this.isPermisoCopiarPreciosCompras=isPermiso;		
		//this.isPermisoDuplicarPreciosCompras=isPermiso;
		//this.isPermisoOrdenPreciosCompras=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPreciosComprasClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(PreciosComprasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebPreciosCompras(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPreciosComprasClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioPreciosComprasClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPreciosComprasClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPreciosComprasClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioPreciosCompras() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PreciosComprasJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.precioscomprasSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PreciosComprasConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPreciosCompras=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPreciosCompras=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPreciosCompras=this.isPermisoActualizarPreciosCompras;
			this.isPermisoEliminarPreciosCompras=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPreciosCompras=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPreciosCompras=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPreciosCompras=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPreciosCompras=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePreciosCompras=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPreciosCompras=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPreciosCompras=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPreciosCompras=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPreciosCompras=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPreciosCompras=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPreciosCompras=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPreciosCompras=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPreciosCompras=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.precioscomprasSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPreciosCompras.setToolTipText(this.jTableDatosPreciosCompras.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPreciosCompras(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPreciosCompras(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PreciosComprasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PreciosComprasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPreciosCompras() throws Exception {
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
	public void inicializarCombosForeignKeyPreciosComprasListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.bodegasForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
				this.transaccionsForeignKey=new ArrayList();
				this.lineasForeignKey=new ArrayList();
				this.lineagruposForeignKey=new ArrayList();
				this.lineacategoriasForeignKey=new ArrayList();
				this.lineamarcasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPreciosComprasListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PreciosComprasJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTransaccionListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTransaccionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.transaccionsForeignKey==null||this.transaccionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TransaccionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTransaccionsForeignKeyLista(finalQueryGlobal);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyPreciosCompras()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyBodega();
			this.addItemDefectoCombosForeignKeyProducto();
			this.addItemDefectoCombosForeignKeyTransaccion();
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
			if(this.precioscomprasSessionBean==null) {
				this.precioscomprasSessionBean=new PreciosComprasSessionBean();
			}

			if(!this.precioscomprasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.precioscomprasSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.precioscomprasSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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

			if(!this.precioscomprasSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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

	public void addItemDefectoCombosForeignKeyTransaccion()throws Exception {
		try {

			if(!this.precioscomprasSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion()) {
				Transaccion transaccion=new Transaccion();
				TransaccionConstantesFunciones.setTransaccionDescripcion(transaccion,Constantes.SMENSAJE_ESCOJA_OPCION);
				transaccion.setId(null);

				if(!TransaccionConstantesFunciones.ExisteEnLista(this.transaccionsForeignKey,transaccion,true)) {

					this.transaccionsForeignKey.add(0,transaccion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLinea()throws Exception {
		try {

			if(!this.precioscomprasSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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

			if(!this.precioscomprasSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
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

			if(!this.precioscomprasSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
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

			if(!this.precioscomprasSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
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
	
	public void initActionsCombosTodosForeignKeyPreciosCompras()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPreciosCompras(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPreciosCompras()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPreciosCompras();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPreciosCompras(PreciosCompras precioscompras)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPreciosCompras(PreciosCompras precioscompras,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPreciosCompras()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPreciosCompras()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPreciosCompras()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPreciosCompras()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPreciosCompras()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPreciosCompras()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");
			this.cargarCombosFrameTransaccionsForeignKey("Todos");
			this.cargarCombosFrameLineasForeignKey("Todos");
			this.cargarCombosFrameLineaGruposForeignKey("Todos");
			this.cargarCombosFrameLineaCategoriasForeignKey("Todos");
			this.cargarCombosFrameLineaMarcasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPreciosCompras(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTransaccionsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaGruposForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaCategoriasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaMarcasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPreciosCompras()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_empresaPreciosCompras!=null && this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_empresaPreciosCompras.getItemCount()>0) {
				this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_empresaPreciosCompras.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_sucursalPreciosCompras!=null && this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_sucursalPreciosCompras.getItemCount()>0) {
				this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_sucursalPreciosCompras.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_bodegaPreciosCompras!=null && this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_bodegaPreciosCompras.getItemCount()>0) {
				this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_bodegaPreciosCompras.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_productoPreciosCompras!=null && this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_productoPreciosCompras.getItemCount()>0) {
				this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_productoPreciosCompras.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_transaccionPreciosCompras!=null && this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_transaccionPreciosCompras.getItemCount()>0) {
				this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_transaccionPreciosCompras.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_lineaPreciosCompras!=null && this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_lineaPreciosCompras.getItemCount()>0) {
				this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_lineaPreciosCompras.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_grupoPreciosCompras!=null && this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_grupoPreciosCompras.getItemCount()>0) {
				this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_grupoPreciosCompras.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_categoriaPreciosCompras!=null && this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_categoriaPreciosCompras.getItemCount()>0) {
				this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_categoriaPreciosCompras.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_marcaPreciosCompras!=null && this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_marcaPreciosCompras.getItemCount()>0) {
				this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_marcaPreciosCompras.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


















	
	

	public PreciosComprasBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PreciosComprasBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PreciosComprasBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.precioscomprasSessionBean=new PreciosComprasSessionBean(); 
		this.precioscomprasConstantesFunciones=new PreciosComprasConstantesFunciones(); 
		this.precioscomprasBean=new PreciosCompras();//(this.precioscomprasConstantesFunciones); 		
		this.precioscomprasReturnGeneral=new PreciosComprasParameterReturnGeneral(); 
		
		this.precioscomprasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.precioscomprasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PreciosComprasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PreciosComprasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PreciosComprasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPreciosCompras(true);
			
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
			
			this.precioscomprasConstantesFunciones=new PreciosComprasConstantesFunciones(); 
			this.precioscomprasBean=new PreciosCompras();//this.precioscomprasConstantesFunciones); 			
			this.precioscomprasReturnGeneral=new PreciosComprasParameterReturnGeneral(); 
		
			PreciosComprasBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Precios Compras Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.precioscompras=new PreciosCompras();
			this.precioscomprass = new ArrayList<PreciosCompras>();
			this.precioscomprassAux = new ArrayList<PreciosCompras>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic=new PreciosComprasLogic();
				this.precioscomprasLogic.getNewConnexionToDeep("");
			}
			
			//this.precioscomprasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.precioscomprasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPreciosCompras);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPreciosCompras!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPreciosCompras);	
					}
					
					if(this.jInternalFrameImportacionPreciosCompras!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPreciosCompras);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPreciosCompras!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPreciosCompras);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPreciosCompras!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPreciosCompras);
				this.jInternalFrameDetalleFormPreciosCompras.setVisible(false);
				this.jInternalFrameDetalleFormPreciosCompras.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPreciosCompras!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPreciosCompras);
					this.jInternalFrameReporteDinamicoPreciosCompras.setVisible(false);
					this.jInternalFrameReporteDinamicoPreciosCompras.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPreciosCompras!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPreciosCompras);
					this.jInternalFrameImportacionPreciosCompras.setVisible(false);
					this.jInternalFrameImportacionPreciosCompras.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPreciosCompras!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPreciosCompras);
					this.jInternalFrameOrderByPreciosCompras.setVisible(false);
					this.jInternalFrameOrderByPreciosCompras.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPreciosComprasActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PreciosComprasConstantesFunciones.INUMEROPAGINACION;
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
			
			this.precioscomprasReturnGeneral=new PreciosComprasParameterReturnGeneral();
			
			this.precioscomprasParameterGeneral=new PreciosComprasParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.precioscomprasLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.precioscomprasSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PreciosComprasJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.precioscomprasSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PreciosComprasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.precioscomprasSessionBean.getEsGuardarRelacionado(),this.precioscomprasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PreciosComprasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.precioscomprasSessionBean.getEsGuardarRelacionado(),this.precioscomprasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPreciosCompras=false;
			this.isVisibilidadCeldaDuplicarPreciosCompras=true;
			this.isVisibilidadCeldaCopiarPreciosCompras=true;
			this.isVisibilidadCeldaVerFormPreciosCompras=true;
			this.isVisibilidadCeldaOrdenPreciosCompras=true;
			this.isVisibilidadCeldaNuevoRelacionesPreciosCompras=false;
			this.isVisibilidadCeldaModificarPreciosCompras=false;
			this.isVisibilidadCeldaActualizarPreciosCompras=false;
			this.isVisibilidadCeldaEliminarPreciosCompras=false;
			this.isVisibilidadCeldaCancelarPreciosCompras=false;
			this.isVisibilidadCeldaGuardarPreciosCompras=false;
			this.isVisibilidadCeldaGuardarCambiosPreciosCompras=false;
			
			
			this.isVisibilidadBusquedaPreciosCompras=true;
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdLinea=true;
			this.isVisibilidadFK_IdLineaCategoria=true;
			this.isVisibilidadFK_IdLineaGrupo=true;
			this.isVisibilidadFK_IdLineaMarca=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTransaccion=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPreciosCompras("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPreciosCompras();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPreciosCompras(false);
			
			this.setPermisosUsuarioPreciosCompras();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.precioscomprasSessionBean.getEsGuardarRelacionado() 
				|| (this.precioscomprasSessionBean.getEsGuardarRelacionado() && this.precioscomprasSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPreciosComprasClasesRelacionadas();
			}
			
			if(this.precioscomprasSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPreciosComprasClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPreciosCompras();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPreciosCompras();
			}
			
			if(!this.isPermisoBusquedaPreciosCompras) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPreciosCompras.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.precioscomprasSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PreciosComprasConstantesFunciones.getTiposSeleccionarPreciosCompras());
				
				this.tiposColumnasSelect=PreciosComprasConstantesFunciones.getTiposSeleccionarPreciosCompras(true);
				
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
			//if(!this.precioscomprasSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPreciosCompras();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioPreciosCompras(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioPreciosCompras(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPreciosCompras() ;
			
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
			this.transaccionLogic=new TransaccionLogic();
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
				precioscomprasImplementable= (PreciosComprasImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PreciosComprasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				precioscomprasImplementableHome= (PreciosComprasImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PreciosComprasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.precioscomprass= new ArrayList<PreciosCompras>();
			this.precioscomprassEliminados= new ArrayList<PreciosCompras>();
						
			this.isEsNuevoPreciosCompras=false;
			this.esParaAccionDesdeFormularioPreciosCompras=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.bodegasForeignKey=new ArrayList<Bodega>() ;
			this.productosForeignKey=new ArrayList<Producto>() ;
			this.transaccionsForeignKey=new ArrayList<Transaccion>() ;
			this.lineasForeignKey=new ArrayList<Linea>() ;
			this.lineagruposForeignKey=new ArrayList<Linea>() ;
			this.lineacategoriasForeignKey=new ArrayList<Linea>() ;
			this.lineamarcasForeignKey=new ArrayList<Linea>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPreciosCompras(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPreciosCompras();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.precioscomprasSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PreciosComprasBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PreciosComprasConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPreciosCompras("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPreciosCompras(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPreciosCompras!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPreciosCompras();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPreciosCompras();
			}
			
			PreciosComprasBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPreciosCompras.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPreciosCompras.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPreciosCompras.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPreciosCompras(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PreciosCompras: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPreciosCompras() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPreciosCompras")) {
				iIndex=this.jInternalFrameDetalleFormPreciosCompras.jTabbedPaneRelacionesPreciosCompras.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPreciosCompras.jTabbedPaneRelacionesPreciosCompras.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPreciosCompras();	
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
	
	public void cargarCombosForeignKeyPreciosCompras(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPreciosCompras(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPreciosCompras(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPreciosComprasListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPreciosCompras();
		
		this.cargarCombosFrameForeignKeyPreciosCompras();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPreciosCompras();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPreciosCompras();
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

	public void cargarCombosForeignKeyTransaccion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTransaccionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTransaccion();
				this.cargarCombosFrameTransaccionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTransaccion(this.transaccionsForeignKey);

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
	
	public void jButtonNuevoPreciosComprasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.precioscomprasSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPreciosCompras==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
			
			
			if(jTableDatosPreciosCompras.getRowCount()>=1) {
				jTableDatosPreciosCompras.removeRowSelectionInterval(0, jTableDatosPreciosCompras.getRowCount()-1);						
			}
			
			this.isEsNuevoPreciosCompras=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPreciosCompras(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPreciosCompras(true);			
			//this.precioscompras=new PreciosCompras();
			//this.precioscompras.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPreciosCompras(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPreciosCompras() ;
			
			if(PreciosComprasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePreciosCompras(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.precioscompras);	
			this.actualizarInformacion("INFO_PADRE",false,this.precioscompras);				
			
			PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
			
			if(this.precioscomprasSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PreciosCompras: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPreciosComprasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PreciosCompras> precioscomprassSeleccionados=new ArrayList<PreciosCompras>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPreciosCompras.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPreciosCompras.getSelectedRows().length;			
			}
			
			precioscomprassSeleccionados=this.getPreciosComprassSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPreciosCompras--;			
				//PreciosCompras precioscomprasAux= new PreciosCompras();			
				//precioscomprasAux.setId(this.iIdNuevoPreciosCompras);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PreciosCompras precioscomprasOrigen=new PreciosCompras();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PreciosCompras precioscomprasOrigen : precioscomprassSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							precioscomprasOrigen =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							precioscomprasOrigen =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPreciosCompras();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.precioscompras.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPreciosCompras(precioscomprasOrigen,this.precioscompras,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.precioscomprasLogic.getPreciosComprass().add(this.precioscomprasAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.precioscomprass.add(this.precioscomprasAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPreciosCompras(false);
				
				this.jTableDatosPreciosCompras.setRowSelectionInterval(this.getIndiceNuevoPreciosCompras(), this.getIndiceNuevoPreciosCompras());
				
				int iLastRow =  this.jTableDatosPreciosCompras.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPreciosCompras.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPreciosCompras.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPreciosCompras(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPreciosComprasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PreciosCompras> precioscomprassSeleccionados=new ArrayList<PreciosCompras>();									
		
			PreciosCompras precioscomprasOrigen=new PreciosCompras();
			PreciosCompras precioscomprasDestino=new PreciosCompras();
				
			precioscomprassSeleccionados=this.getPreciosComprassSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPreciosCompras.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || precioscomprassSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPreciosCompras.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						precioscomprasOrigen =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						precioscomprasOrigen =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						precioscomprasDestino =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						precioscomprasDestino =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				precioscomprasOrigen =precioscomprassSeleccionados.get(0);
				precioscomprasDestino =precioscomprassSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPreciosCompras(precioscomprasOrigen,precioscomprasDestino,true,false);
				
				precioscomprasDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(precioscomprasDestino,precioscomprasLogic.getPreciosComprass());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(precioscomprasDestino,precioscomprass);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPreciosCompras(false);
				
				//this.jTableDatosPreciosCompras.setRowSelectionInterval(this.getIndiceNuevoPreciosCompras(), this.getIndiceNuevoPreciosCompras());
				
				int iLastRow =  this.jTableDatosPreciosCompras.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPreciosCompras.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPreciosCompras.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPreciosCompras(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPreciosComprasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPreciosCompras==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPreciosCompras.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPreciosComprasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPreciosCompras.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPreciosCompras.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPreciosCompras.setVisible(!isVisible);
			this.jPanelPaginacionPreciosCompras.setVisible(!isVisible);
			this.jPanelAccionesPreciosCompras.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPreciosComprasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePreciosCompras();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPreciosComprasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPreciosCompras();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPreciosComprasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPreciosCompras();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPreciosComprasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPreciosCompras();
			
			this.abrirFrameOrderByPreciosCompras();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPreciosComprasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPreciosCompras();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePreciosCompras(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPreciosCompras);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPreciosCompras.isMaximum()) {
					this.jInternalFrameDetalleFormPreciosCompras.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPreciosCompras.setSize(this.jInternalFrameDetalleFormPreciosCompras.iWidthFormulario,this.jInternalFrameDetalleFormPreciosCompras.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPreciosCompras.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPreciosCompras.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPreciosCompras.isMaximum()) {
						this.jInternalFrameDetalleFormPreciosCompras.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPreciosCompras.jContentPaneDetallePreciosCompras.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPreciosCompras.jTabbedPaneRelacionesPreciosCompras.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPreciosCompras.jContentPaneDetallePreciosCompras.getWidth(),PreciosComprasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPreciosCompras.jTabbedPaneRelacionesPreciosCompras.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPreciosCompras.jContentPaneDetallePreciosCompras.getWidth(),PreciosComprasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPreciosCompras.jTabbedPaneRelacionesPreciosCompras.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPreciosCompras.jContentPaneDetallePreciosCompras.getWidth(),PreciosComprasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPreciosCompras.setVisible(true);
	        this.jInternalFrameDetalleFormPreciosCompras.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPreciosCompras() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPreciosCompras==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPreciosCompras=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPreciosCompras,false,this);
				} else {
					this.jInternalFrameOrderByPreciosCompras=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPreciosCompras,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPreciosCompras);
				this.jInternalFrameOrderByPreciosCompras.setVisible(false);
				this.jInternalFrameOrderByPreciosCompras.setSelected(false);
				
				this.jInternalFrameOrderByPreciosCompras.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPreciosCompras"));
				
				this.inicializarActualizarBindingTablaOrderByPreciosCompras();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPreciosCompras() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPreciosCompras==null) {
				
				this.jInternalFrameImportacionPreciosCompras=new ImportacionJInternalFrame(PreciosComprasConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPreciosCompras);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPreciosCompras);
				this.jInternalFrameImportacionPreciosCompras.setVisible(false);
				this.jInternalFrameImportacionPreciosCompras.setSelected(false);


				this.jInternalFrameImportacionPreciosCompras.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPreciosCompras"));
				this.jInternalFrameImportacionPreciosCompras.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPreciosCompras"));
				this.jInternalFrameImportacionPreciosCompras.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPreciosCompras"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPreciosCompras() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPreciosCompras==null) {
				this.jInternalFrameReporteDinamicoPreciosCompras=new ReporteDinamicoJInternalFrame(PreciosComprasConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPreciosCompras);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPreciosCompras);
				this.jInternalFrameReporteDinamicoPreciosCompras.setVisible(false);
				this.jInternalFrameReporteDinamicoPreciosCompras.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPreciosCompras.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPreciosCompras"));
				this.jInternalFrameReporteDinamicoPreciosCompras.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPreciosCompras"));
				this.jInternalFrameReporteDinamicoPreciosCompras.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPreciosCompras"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPreciosCompras();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetallePreciosCompras() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPreciosCompras);
			
	       	this.jInternalFrameDetalleFormPreciosCompras.setVisible(false);
	        this.jInternalFrameDetalleFormPreciosCompras.setSelected(false);
			
			//this.jInternalFrameDetalleFormPreciosCompras.dispose();
			//this.jInternalFrameDetalleFormPreciosCompras=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPreciosCompras() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPreciosCompras.setVisible(true);
	        this.jInternalFrameReporteDinamicoPreciosCompras.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPreciosCompras() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPreciosCompras.setVisible(true);
	        this.jInternalFrameImportacionPreciosCompras.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPreciosCompras() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPreciosCompras.setVisible(true);
	        this.jInternalFrameOrderByPreciosCompras.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPreciosCompras() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPreciosCompras.setVisible(false);
	        this.jInternalFrameOrderByPreciosCompras.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPreciosCompras() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPreciosCompras.setVisible(false);
	        this.jInternalFrameReporteDinamicoPreciosCompras.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPreciosCompras() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPreciosCompras.setVisible(false);
	        this.jInternalFrameImportacionPreciosCompras.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarPreciosComprasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPreciosCompras(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPreciosCompras(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPreciosCompras(true);
			//this.isEsNuevoPreciosCompras=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscompras =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.precioscompras =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPreciosCompras("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPreciosCompras(false) ;
			
			if(precioscomprasSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(PreciosComprasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePreciosCompras(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPreciosCompras(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPreciosComprasActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscompras =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.precioscompras =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPreciosCompras(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPreciosCompras==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPreciosCompras(true);
			//this.isEsNuevoPreciosCompras=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscompras =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.precioscompras =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.precioscompras.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPreciosCompras("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPreciosCompras(false) ;
			
			if(PreciosComprasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePreciosCompras(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPreciosCompras(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosPreciosCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreciosCompras,PreciosComprasConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPreciosCompras.getSelectedRow();

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
		TableColumn tableColumnProducto=this.jTableDatosPreciosCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreciosCompras,PreciosComprasConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPreciosCompras.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoTableCellFk.setRowActual(intSelectedRow);
			//productoTableCellFk.setproductosForeignKeyActual(productosForeignKey);
		//}


		if(productoTableCellFk!=null) {
			productoTableCellFk.RecargarProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTransaccion(List<Transaccion> transaccionsForeignKey)throws Exception{
		TableColumn tableColumnTransaccion=this.jTableDatosPreciosCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreciosCompras,PreciosComprasConstantesFunciones.LABEL_IDTRANSACCION));
		TableCellEditor tableCellEditorTransaccion =tableColumnTransaccion.getCellEditor();

		TransaccionTableCell transaccionTableCellFk=(TransaccionTableCell)tableCellEditorTransaccion;

		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.settransaccionsForeignKey(transaccionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPreciosCompras.getSelectedRow();

		//if(intSelectedRow<=0) {
			//transaccionTableCellFk.setRowActual(intSelectedRow);
			//transaccionTableCellFk.settransaccionsForeignKeyActual(transaccionsForeignKey);
		//}


		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.RecargarTransaccionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLinea(List<Linea> lineasForeignKey)throws Exception{
		TableColumn tableColumnLinea=this.jTableDatosPreciosCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreciosCompras,PreciosComprasConstantesFunciones.LABEL_IDLINEA));
		TableCellEditor tableCellEditorLinea =tableColumnLinea.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLinea;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPreciosCompras.getSelectedRow();

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
		TableColumn tableColumnLineaGrupo=this.jTableDatosPreciosCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreciosCompras,PreciosComprasConstantesFunciones.LABEL_IDLINEAGRUPO));
		TableCellEditor tableCellEditorLineaGrupo =tableColumnLineaGrupo.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaGrupo;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineagruposForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPreciosCompras.getSelectedRow();

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
		TableColumn tableColumnLineaCategoria=this.jTableDatosPreciosCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreciosCompras,PreciosComprasConstantesFunciones.LABEL_IDLINEACATEGORIA));
		TableCellEditor tableCellEditorLineaCategoria =tableColumnLineaCategoria.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaCategoria;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineacategoriasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPreciosCompras.getSelectedRow();

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
		TableColumn tableColumnLineaMarca=this.jTableDatosPreciosCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreciosCompras,PreciosComprasConstantesFunciones.LABEL_IDLINEAMARCA));
		TableCellEditor tableCellEditorLineaMarca =tableColumnLineaMarca.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaMarca;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineamarcasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPreciosCompras.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineamarcasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarPreciosComprasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPreciosCompras(false);
			
			//if(!this.isEsNuevoPreciosCompras) {								
				int intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscompras =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.precioscompras =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PreciosComprasJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPreciosCompras(this.precioscompras,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);
				
			}
			
			if(this.permiteMantenimiento(this.precioscompras)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.precioscomprasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPreciosCompras=true;
					this.inicializarActualizarBindingTablaPreciosCompras(false);
					this.isEsNuevoPreciosCompras=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPreciosCompras=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPreciosCompras=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPreciosCompras(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPreciosCompras(false);
				
				this.habilitarDeshabilitarControlesPreciosCompras(false);
			
												
				
				if(PreciosComprasJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePreciosCompras();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPreciosComprasActionPerformed(evt,precioscomprasSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPreciosCompras(this.precioscompras,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPreciosCompras.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,precioscomprasSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.precioscompras.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PreciosCompras.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreciosCompras.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPreciosComprasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscompras =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
				this.precioscompras.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.precioscompras =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
				this.precioscompras.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.precioscompras)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.precioscomprasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PreciosComprasModel) this.jTableDatosPreciosCompras.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPreciosCompras=true;
				this.inicializarActualizarBindingTablaPreciosCompras(false);
				this.isEsNuevoPreciosCompras=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPreciosCompras(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPreciosCompras(false);
				
				this.habilitarDeshabilitarControlesPreciosCompras(false);
				
				
				
				if(PreciosComprasJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePreciosCompras();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPreciosComprasActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPreciosCompras.getRowCount()>=1) {
				jTableDatosPreciosCompras.removeRowSelectionInterval(0, jTableDatosPreciosCompras.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPreciosCompras(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPreciosCompras(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPreciosCompras(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPreciosCompras(false) ;
			
			this.isEsNuevoPreciosCompras=false;
			
			if(PreciosComprasJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePreciosCompras();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPreciosComprasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPreciosCompras(false);
				
				//SI ES MANUAL
				if(PreciosComprasJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPreciosCompras();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPreciosComprasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPreciosCompras--;			
			//PreciosCompras precioscomprasAux= new PreciosCompras();			
			//precioscomprasAux.setId(this.iIdNuevoPreciosCompras);
			
			if(this.jInternalFrameDetalleFormPreciosCompras==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPreciosCompras();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);
			
			this.precioscompras.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.precioscomprasLogic.getPreciosComprass().add(this.precioscomprasAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.precioscomprass.add(this.precioscomprasAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPreciosCompras(false);
			
			this.jTableDatosPreciosCompras.setRowSelectionInterval(this.getIndiceNuevoPreciosCompras(), this.getIndiceNuevoPreciosCompras());
			
			int iLastRow =  this.jTableDatosPreciosCompras.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPreciosCompras.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPreciosCompras.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPreciosCompras(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPreciosComprasActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPreciosCompras(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPreciosCompras(false);
			
			//SI ES MANUAL
			if(PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPreciosCompras();
			}
			
			//this.abrirFrameTreePreciosCompras();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPreciosComprasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPreciosComprasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPreciosCompras.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPreciosCompras.setFileImportacion(this.jInternalFrameImportacionPreciosCompras.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPreciosCompras.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPreciosCompras.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPreciosCompras.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPreciosCompras.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPreciosComprasActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PreciosCompras> precioscomprassSeleccionados=new ArrayList<PreciosCompras>();		

		precioscomprassSeleccionados=this.getPreciosComprassSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPreciosCompras.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPreciosCompras.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PreciosComprasBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PreciosComprasBaseDesign.jrxml";
			
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
			
			this.generarReportePreciosComprass("Todos",precioscomprassSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.precioscomprasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Precios Compras",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPreciosCompras.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPreciosCompras.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PreciosComprasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompletoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompletoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompletoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompletoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PreciosComprasConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroComprobante_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroComprobante_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroComprobante_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroComprobante_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PreciosComprasConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PreciosComprasConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PreciosComprasConstantesFunciones.LABEL_COSTOUNITARIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_stoUnitario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_stoUnitario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_stoUnitario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_stoUnitario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PreciosComprasConstantesFunciones.LABEL_CODIGOPRODUCTO:
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
		
		if(this.jInternalFrameReporteDinamicoPreciosCompras.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPreciosCompras.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPreciosCompras.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PreciosComprasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoria="nombre_completo_cliente";
					break;

				case PreciosComprasConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					sNombreCampoCategoria="numero_comprobante";
					break;

				case PreciosComprasConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case PreciosComprasConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoria="nombre_producto";
					break;

				case PreciosComprasConstantesFunciones.LABEL_COSTOUNITARIO:
					sNombreCampoCategoria="costo_unitario";
					break;

				case PreciosComprasConstantesFunciones.LABEL_CODIGOPRODUCTO:
					sNombreCampoCategoria="codigo_producto";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPreciosCompras.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PreciosComprasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoriaValor="nombre_completo_cliente";
					break;

				case PreciosComprasConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					sNombreCampoCategoriaValor="numero_comprobante";
					break;

				case PreciosComprasConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case PreciosComprasConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoriaValor="nombre_producto";
					break;

				case PreciosComprasConstantesFunciones.LABEL_COSTOUNITARIO:
					sNombreCampoCategoriaValor="costo_unitario";
					break;

				case PreciosComprasConstantesFunciones.LABEL_CODIGOPRODUCTO:
					sNombreCampoCategoriaValor="codigo_producto";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPreciosCompras.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPreciosCompras.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PreciosComprasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo_cliente");
					break;

				case PreciosComprasConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Comprobante",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_comprobante");
					break;

				case PreciosComprasConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case PreciosComprasConstantesFunciones.LABEL_NOMBREPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_producto");
					break;

				case PreciosComprasConstantesFunciones.LABEL_COSTOUNITARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo Unitario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo_unitario");
					break;

				case PreciosComprasConstantesFunciones.LABEL_CODIGOPRODUCTO:
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
	
	public void jButtonGenerarExcelReporteDinamicoPreciosComprasActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PreciosCompras> precioscomprassSeleccionados=new ArrayList<PreciosCompras>();		
		
		precioscomprassSeleccionados=this.getPreciosComprassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"precioscompras";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("PreciosComprass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPreciosCompras.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPreciosCompras.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PreciosComprasConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(PreciosCompras precioscompras:precioscomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(precioscompras.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PreciosComprasConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(PreciosCompras precioscompras:precioscomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(precioscompras.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PreciosComprasConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(PreciosCompras precioscompras:precioscomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(precioscompras.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PreciosComprasConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(PreciosCompras precioscompras:precioscomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(precioscompras.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PreciosComprasConstantesFunciones.LABEL_IDTRANSACCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_IDTRANSACCION);
					iRow++;

					for(PreciosCompras precioscompras:precioscomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(precioscompras.gettransaccion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PreciosComprasConstantesFunciones.LABEL_IDLINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_IDLINEA);
					iRow++;

					for(PreciosCompras precioscompras:precioscomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(precioscompras.getlinea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PreciosComprasConstantesFunciones.LABEL_IDLINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_IDLINEAGRUPO);
					iRow++;

					for(PreciosCompras precioscompras:precioscomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(precioscompras.getlineagrupo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PreciosComprasConstantesFunciones.LABEL_IDLINEACATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_IDLINEACATEGORIA);
					iRow++;

					for(PreciosCompras precioscompras:precioscomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(precioscompras.getlineacategoria_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PreciosComprasConstantesFunciones.LABEL_IDLINEAMARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_IDLINEAMARCA);
					iRow++;

					for(PreciosCompras precioscompras:precioscomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(precioscompras.getlineamarca_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PreciosComprasConstantesFunciones.LABEL_FECHAEMISIONDESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_FECHAEMISIONDESDE);
					iRow++;

					for(PreciosCompras precioscompras:precioscomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(precioscompras.getfecha_emision_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PreciosComprasConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(PreciosCompras precioscompras:precioscomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(precioscompras.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PreciosComprasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
					iRow++;

					for(PreciosCompras precioscompras:precioscomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(precioscompras.getnombre_completo_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PreciosComprasConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
					iRow++;

					for(PreciosCompras precioscompras:precioscomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(precioscompras.getnumero_comprobante());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PreciosComprasConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(PreciosCompras precioscompras:precioscomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(precioscompras.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PreciosComprasConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_NOMBREPRODUCTO);
					iRow++;

					for(PreciosCompras precioscompras:precioscomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(precioscompras.getnombre_producto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PreciosComprasConstantesFunciones.LABEL_COSTOUNITARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_COSTOUNITARIO);
					iRow++;

					for(PreciosCompras precioscompras:precioscomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(precioscompras.getcosto_unitario());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PreciosComprasConstantesFunciones.LABEL_CODIGOPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_CODIGOPRODUCTO);
					iRow++;

					for(PreciosCompras precioscompras:precioscomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(precioscompras.getcodigo_producto());
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
			//	this.getFilaCabeceraExportarExcelPreciosCompras(row);				
			//	iRow++;
			//}				
			
			//for(PreciosCompras precioscomprasAux:precioscomprassSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPreciosCompras(precioscomprasAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.precioscomprasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Precios Compras",JOptionPane.INFORMATION_MESSAGE);
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
				this.precioscomprasLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPreciosCompras(false);
			
			//SI ES MANUAL
			if(PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPreciosCompras();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPreciosComprasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPreciosCompras(false);
			
			//SI ES MANUAL
			if(PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPreciosCompras();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPreciosComprasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPreciosCompras(false);
			
			//SI ES MANUAL
			if(PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPreciosCompras();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPreciosCompras() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPreciosCompras.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPreciosCompras.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPreciosCompras.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPreciosCompras.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPreciosCompras.setMinimumSize(dimensionMinimum);
		this.jTableDatosPreciosCompras.setMaximumSize(dimensionMaximum);
		this.jTableDatosPreciosCompras.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPreciosCompras(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPreciosCompras(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPreciosCompras(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPreciosCompras(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPreciosCompras(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.precioscomprasSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPreciosCompras(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPreciosCompras(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPreciosCompras(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PreciosComprasJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPreciosCompras() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPreciosCompras();
		
		this.inicializarActualizarBindingBotonesManualPreciosCompras(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.precioscomprasSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPreciosCompras();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPreciosCompras() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPreciosCompras(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPreciosCompras(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPreciosCompras.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPreciosCompras.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePreciosCompras.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPreciosCompras.jCheckBoxPostAccionNuevoPreciosCompras.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPreciosCompras.jCheckBoxPostAccionSinCerrarPreciosCompras.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPreciosCompras.jCheckBoxPostAccionSinMensajePreciosCompras.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPreciosCompras.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPreciosCompras.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePreciosCompras.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
				this.jInternalFrameDetalleFormPreciosCompras.jCheckBoxPostAccionNuevoPreciosCompras.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPreciosCompras.jCheckBoxPostAccionSinCerrarPreciosCompras.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPreciosCompras.jCheckBoxPostAccionSinMensajePreciosCompras.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPreciosCompras.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPreciosCompras.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPreciosCompras.jComboBoxTiposAccionesFormularioPreciosCompras.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPreciosCompras.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPreciosCompras!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPreciosCompras.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPreciosCompras.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPreciosCompras.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPreciosCompras.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPreciosCompras.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPreciosCompras!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPreciosCompras.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPreciosCompras.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPreciosCompras.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPreciosCompras(Boolean esInicializar) throws Exception {
		try	{	
			if(PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPreciosCompras(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPreciosCompras() throws Exception {
		try	{
			if(PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPreciosCompras();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePreciosCompras() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPreciosCompras.jComboBoxTiposAccionesFormularioPreciosCompras.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPreciosCompras.jComboBoxTiposAccionesFormularioPreciosCompras.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPreciosCompras() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPreciosCompras.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPreciosCompras.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPreciosCompras.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPreciosCompras.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPreciosCompras.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPreciosCompras.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPreciosCompras.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPreciosCompras.addItem(reporte);
			}
			
			
			if(!this.precioscomprasSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPreciosCompras.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPreciosCompras.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPreciosCompras.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPreciosCompras.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPreciosCompras.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPreciosCompras.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPreciosCompras!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPreciosCompras.jComboBoxTiposAccionesFormularioPreciosCompras.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPreciosCompras.jComboBoxTiposAccionesFormularioPreciosCompras.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPreciosCompras.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPreciosCompras.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPreciosCompras.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPreciosCompras();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPreciosCompras() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPreciosCompras!=null) {
				this.jInternalFrameReporteDinamicoPreciosCompras.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPreciosCompras.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPreciosCompras!=null) {
				this.jInternalFrameReporteDinamicoPreciosCompras.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPreciosCompras.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPreciosCompras!=null) {
				
				if(this.jInternalFrameReporteDinamicoPreciosCompras.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPreciosCompras.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPreciosCompras.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPreciosCompras.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPreciosCompras.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPreciosCompras.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoPreciosCompras.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPreciosCompras.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=PreciosComprasConstantesFunciones.getTiposSeleccionarPreciosCompras(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPreciosCompras.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoPreciosCompras.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoPreciosCompras.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=PreciosComprasConstantesFunciones.getTiposSeleccionarPreciosCompras(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPreciosCompras.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoPreciosCompras.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPreciosCompras.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=PreciosComprasConstantesFunciones.getTiposSeleccionarPreciosCompras(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPreciosCompras.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoPreciosCompras.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoPreciosCompras.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoPreciosCompras.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPreciosCompras()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaBusquedaPreciosComprasPreciosCompras.getSelectedItem()!=null){this.id_bodegaBusquedaPreciosCompras=((Bodega)this.jComboBoxid_bodegaBusquedaPreciosComprasPreciosCompras.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoBusquedaPreciosComprasPreciosCompras.getSelectedItem()!=null){this.id_productoBusquedaPreciosCompras=((Producto)this.jComboBoxid_productoBusquedaPreciosComprasPreciosCompras.getSelectedItem()).getId();}
		if(this.jComboBoxid_transaccionBusquedaPreciosComprasPreciosCompras.getSelectedItem()!=null){this.id_transaccionBusquedaPreciosCompras=((Transaccion)this.jComboBoxid_transaccionBusquedaPreciosComprasPreciosCompras.getSelectedItem()).getId();}
		if(this.jComboBoxid_lineaBusquedaPreciosComprasPreciosCompras.getSelectedItem()!=null){this.id_lineaBusquedaPreciosCompras=((Linea)this.jComboBoxid_lineaBusquedaPreciosComprasPreciosCompras.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_grupoBusquedaPreciosComprasPreciosCompras.getSelectedItem()!=null){this.id_linea_grupoBusquedaPreciosCompras=((Linea)this.jComboBoxid_linea_grupoBusquedaPreciosComprasPreciosCompras.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_categoriaBusquedaPreciosComprasPreciosCompras.getSelectedItem()!=null){this.id_linea_categoriaBusquedaPreciosCompras=((Linea)this.jComboBoxid_linea_categoriaBusquedaPreciosComprasPreciosCompras.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_marcaBusquedaPreciosComprasPreciosCompras.getSelectedItem()!=null){this.id_linea_marcaBusquedaPreciosCompras=((Linea)this.jComboBoxid_linea_marcaBusquedaPreciosComprasPreciosCompras.getSelectedItem()).getId();}
		this.fecha_emision_desdeBusquedaPreciosCompras=new Date(this.jDateChooserfecha_emision_desdeBusquedaPreciosComprasPreciosCompras.getDate().getTime());
		this.fecha_emision_hastaBusquedaPreciosCompras=new Date(this.jDateChooserfecha_emision_hastaBusquedaPreciosComprasPreciosCompras.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPreciosCompras(Boolean esInicializar) throws Exception {				
		if(PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPreciosCompras();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPreciosCompras() throws Exception {
		this.inicializarActualizarBindingTablaPreciosCompras(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPreciosCompras() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPreciosCompras.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPreciosCompras.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPreciosCompras.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PreciosComprasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPreciosCompras.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPreciosCompras.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PreciosComprasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPreciosComprasOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreciosComprasOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PreciosComprasPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPreciosCompras.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPreciosCompras.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PreciosComprasPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPreciosCompras.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPreciosCompras(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=precioscomprasLogic.getPreciosComprass().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=precioscomprass.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PreciosComprasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPreciosCompras.setModel(new PreciosComprasModel(this.precioscomprasLogic.getPreciosComprass(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPreciosCompras.setModel(new PreciosComprasModel(this.precioscomprass,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPreciosCompras!=null && this.jInternalFrameOrderByPreciosCompras.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPreciosCompras();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPreciosCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreciosCompras,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PreciosComprasPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PreciosComprasConstantesFunciones.SCLASSWEBTITULO,precioscomprasConstantesFunciones.resaltarSeleccionarPreciosCompras,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PreciosComprasConstantesFunciones.SCLASSWEBTITULO,precioscomprasConstantesFunciones.resaltarSeleccionarPreciosCompras,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPreciosCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreciosCompras,PreciosComprasConstantesFunciones.LABEL_ID));

		if(this.precioscomprasConstantesFunciones.mostraridPreciosCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PreciosComprasConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.precioscomprasConstantesFunciones.resaltaridPreciosCompras,this.precioscomprasConstantesFunciones.activaridPreciosCompras,iSizeTabla,this,true,"idPreciosCompras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.precioscomprasConstantesFunciones.resaltaridPreciosCompras,this.precioscomprasConstantesFunciones.activaridPreciosCompras,this,true,"idPreciosCompras","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPreciosCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreciosCompras,PreciosComprasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE));

		if(this.precioscomprasConstantesFunciones.mostrarnombre_completo_clientePreciosCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PreciosComprasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.precioscomprasConstantesFunciones.resaltarnombre_completo_clientePreciosCompras,this.precioscomprasConstantesFunciones.activarnombre_completo_clientePreciosCompras,iSizeTabla,this,true,"nombre_completo_clientePreciosCompras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.precioscomprasConstantesFunciones.resaltarnombre_completo_clientePreciosCompras,this.precioscomprasConstantesFunciones.activarnombre_completo_clientePreciosCompras,this,true,"nombre_completo_clientePreciosCompras","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PreciosComprasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPreciosCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreciosCompras,PreciosComprasConstantesFunciones.LABEL_NUMEROCOMPROBANTE));

		if(this.precioscomprasConstantesFunciones.mostrarnumero_comprobantePreciosCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PreciosComprasConstantesFunciones.LABEL_NUMEROCOMPROBANTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.precioscomprasConstantesFunciones.resaltarnumero_comprobantePreciosCompras,this.precioscomprasConstantesFunciones.activarnumero_comprobantePreciosCompras,iSizeTabla,this,true,"numero_comprobantePreciosCompras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.precioscomprasConstantesFunciones.resaltarnumero_comprobantePreciosCompras,this.precioscomprasConstantesFunciones.activarnumero_comprobantePreciosCompras,this,true,"numero_comprobantePreciosCompras","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PreciosComprasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPreciosCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreciosCompras,PreciosComprasConstantesFunciones.LABEL_FECHAEMISION));

		if(this.precioscomprasConstantesFunciones.mostrarfecha_emisionPreciosCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PreciosComprasConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.precioscomprasConstantesFunciones.resaltarfecha_emisionPreciosCompras,this.precioscomprasConstantesFunciones.activarfecha_emisionPreciosCompras,iSizeTabla,this,true,"fecha_emisionPreciosCompras","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.precioscomprasConstantesFunciones.resaltarfecha_emisionPreciosCompras,this.precioscomprasConstantesFunciones.activarfecha_emisionPreciosCompras,this,true,"fecha_emisionPreciosCompras","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new PreciosComprasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPreciosCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreciosCompras,PreciosComprasConstantesFunciones.LABEL_NOMBREPRODUCTO));

		if(this.precioscomprasConstantesFunciones.mostrarnombre_productoPreciosCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PreciosComprasConstantesFunciones.LABEL_NOMBREPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.precioscomprasConstantesFunciones.resaltarnombre_productoPreciosCompras,this.precioscomprasConstantesFunciones.activarnombre_productoPreciosCompras,iSizeTabla,this,true,"nombre_productoPreciosCompras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.precioscomprasConstantesFunciones.resaltarnombre_productoPreciosCompras,this.precioscomprasConstantesFunciones.activarnombre_productoPreciosCompras,this,true,"nombre_productoPreciosCompras","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PreciosComprasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPreciosCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreciosCompras,PreciosComprasConstantesFunciones.LABEL_COSTOUNITARIO));

		if(this.precioscomprasConstantesFunciones.mostrarcosto_unitarioPreciosCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PreciosComprasConstantesFunciones.LABEL_COSTOUNITARIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.precioscomprasConstantesFunciones.resaltarcosto_unitarioPreciosCompras,this.precioscomprasConstantesFunciones.activarcosto_unitarioPreciosCompras,iSizeTabla,this,true,"costo_unitarioPreciosCompras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.precioscomprasConstantesFunciones.resaltarcosto_unitarioPreciosCompras,this.precioscomprasConstantesFunciones.activarcosto_unitarioPreciosCompras,this,true,"costo_unitarioPreciosCompras","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PreciosComprasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPreciosCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreciosCompras,PreciosComprasConstantesFunciones.LABEL_CODIGOPRODUCTO));

		if(this.precioscomprasConstantesFunciones.mostrarcodigo_productoPreciosCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PreciosComprasConstantesFunciones.LABEL_CODIGOPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.precioscomprasConstantesFunciones.resaltarcodigo_productoPreciosCompras,this.precioscomprasConstantesFunciones.activarcodigo_productoPreciosCompras,iSizeTabla,this,true,"codigo_productoPreciosCompras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.precioscomprasConstantesFunciones.resaltarcodigo_productoPreciosCompras,this.precioscomprasConstantesFunciones.activarcodigo_productoPreciosCompras,this,true,"codigo_productoPreciosCompras","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PreciosComprasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.precioscomprasSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.precioscomprasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.precioscomprasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPreciosCompras.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.precioscomprasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.precioscomprasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPreciosCompras.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPreciosCompras && this.isPermisoGuardarCambiosPreciosCompras) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.precioscomprasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.precioscomprasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPreciosCompras.addColumn(tableColumn);
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
			
			this.jTableDatosPreciosCompras.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPreciosCompras && this.isPermisoGuardarCambiosPreciosCompras) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPreciosCompras && this.isPermisoGuardarCambiosPreciosCompras) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPreciosCompras.moveColumn(this.jTableDatosPreciosCompras.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPreciosCompras.moveColumn(this.jTableDatosPreciosCompras.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPreciosCompras.moveColumn(this.jTableDatosPreciosCompras.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPreciosCompras.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPreciosCompras.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPreciosCompras,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PreciosComprasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPreciosCompras.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPreciosCompras.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PreciosComprasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PreciosComprasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPreciosCompras.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPreciosCompras.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPreciosCompras.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=precioscomprasLogic.getPreciosComprass().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=precioscomprass.size()-1;
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
		//this.jTableDatosPreciosCompras.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPreciosCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPreciosCompras();
			
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
				
				//this.isEsNuevoPreciosCompras=false;
					
				PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
			
				if(this.precioscomprasSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPreciosCompras==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPreciosCompras.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPreciosCompras.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscompras =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.precioscompras =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.precioscompras.getsType().equals("DUPLICADO")
				   || this.precioscompras.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPreciosCompras=true;
				
				} else {
					this.isEsNuevoPreciosCompras=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.precioscomprasSessionBean.getEsGuardarRelacionado()) {
					if(this.precioscompras.getId()>=0 && !this.precioscompras.getIsNew()) {						
						this.isEsNuevoPreciosCompras=false;
						
					} else {
						this.isEsNuevoPreciosCompras=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPreciosCompras(esRelaciones);						
				
				this.seleccionarPreciosCompras(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.precioscompras.getId()<0) {
					this.isEsNuevoPreciosCompras=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPreciosCompras(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPreciosCompras(evt,rowIndex);
				}	
				
				if(this.precioscomprasSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PreciosCompras: " + this.dDif); 
					}
				}								
				
				PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPreciosCompras(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.precioscompras)) {
					if(this.precioscompras.getId()>0) {
						this.precioscompras.setIsDeleted(true);
						
						this.precioscomprassEliminados.add(this.precioscompras);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.precioscomprasLogic.getPreciosComprass().remove(this.precioscompras);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.precioscomprass.remove(this.precioscompras);				
					}
					
					
					((PreciosComprasModel) this.jTableDatosPreciosCompras.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPreciosCompras(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPreciosCompras(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPreciosCompras) {
			
			if(this.jInternalFrameDetalleFormPreciosCompras==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPreciosCompras.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPreciosCompras.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscompras =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.precioscompras =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PreciosComprasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPreciosCompras(this.precioscompras);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPreciosCompras("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPreciosCompras(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPreciosCompras() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPreciosCompras(PreciosCompras precioscompras) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPreciosCompras(precioscompras,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPreciosCompras(PreciosCompras precioscompras,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPreciosCompras(precioscompras);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPreciosCompras(precioscompras,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPreciosCompras(precioscompras);
	}
	
	public void setVariablesObjetoActualToFormularioPreciosCompras(PreciosCompras precioscompras) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPreciosCompras==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPreciosCompras.jLabelidPreciosCompras.setText(precioscompras.getId().toString());
			this.jInternalFrameDetalleFormPreciosCompras.jTextAreanombre_completo_clientePreciosCompras.setText(precioscompras.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormPreciosCompras.jTextFieldnumero_comprobantePreciosCompras.setText(precioscompras.getnumero_comprobante());
			this.jInternalFrameDetalleFormPreciosCompras.jDateChooserfecha_emisionPreciosCompras.setDate(precioscompras.getfecha_emision());
			this.jInternalFrameDetalleFormPreciosCompras.jTextAreanombre_productoPreciosCompras.setText(precioscompras.getnombre_producto());
			this.jInternalFrameDetalleFormPreciosCompras.jTextFieldcosto_unitarioPreciosCompras.setText(precioscompras.getcosto_unitario().toString());
			this.jInternalFrameDetalleFormPreciosCompras.jTextFieldcodigo_productoPreciosCompras.setText(precioscompras.getcodigo_producto());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PreciosCompras precioscomprasLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,precioscomprasLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PreciosCompras precioscomprasLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				precioscomprasLocal=this.precioscompras;
			} else {
				precioscomprasLocal=this.precioscomprasAnterior;
			}
		}
		
		if(this.permiteMantenimiento(precioscomprasLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPreciosCompras(precioscomprasLocal,true);
					
					if(precioscomprasSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(precioscomprasLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.precioscomprasSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(precioscomprasLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPreciosCompras(PreciosCompras precioscompras,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPreciosCompras(precioscompras,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(precioscompras);
	}
	
	public void setVariablesFormularioToObjetoActualPreciosCompras(PreciosCompras precioscompras,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPreciosCompras(precioscompras,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPreciosCompras(PreciosCompras precioscompras,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPreciosCompras==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPreciosCompras.jLabelidPreciosCompras.getText()==null || this.jInternalFrameDetalleFormPreciosCompras.jLabelidPreciosCompras.getText()=="" || this.jInternalFrameDetalleFormPreciosCompras.jLabelidPreciosCompras.getText()=="Id") {
				this.jInternalFrameDetalleFormPreciosCompras.jLabelidPreciosCompras.setText("0");
			}

			if(conColumnasBase) {precioscompras.setId(Long.parseLong(this.jInternalFrameDetalleFormPreciosCompras.jLabelidPreciosCompras.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PreciosComprasConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreciosCompras.jLabelIdPreciosCompras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			precioscompras.setnombre_completo_cliente(this.jInternalFrameDetalleFormPreciosCompras.jTextAreanombre_completo_clientePreciosCompras.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PreciosComprasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreciosCompras.jLabelnombre_completo_clientePreciosCompras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			precioscompras.setnumero_comprobante(this.jInternalFrameDetalleFormPreciosCompras.jTextFieldnumero_comprobantePreciosCompras.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PreciosComprasConstantesFunciones.LABEL_NUMEROCOMPROBANTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreciosCompras.jLabelnumero_comprobantePreciosCompras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			precioscompras.setfecha_emision(this.jInternalFrameDetalleFormPreciosCompras.jDateChooserfecha_emisionPreciosCompras.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PreciosComprasConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreciosCompras.jLabelfecha_emisionPreciosCompras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			precioscompras.setnombre_producto(this.jInternalFrameDetalleFormPreciosCompras.jTextAreanombre_productoPreciosCompras.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PreciosComprasConstantesFunciones.LABEL_NOMBREPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreciosCompras.jLabelnombre_productoPreciosCompras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			precioscompras.setcosto_unitario(Double.parseDouble(this.jInternalFrameDetalleFormPreciosCompras.jTextFieldcosto_unitarioPreciosCompras.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PreciosComprasConstantesFunciones.LABEL_COSTOUNITARIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreciosCompras.jLabelcosto_unitarioPreciosCompras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			precioscompras.setcodigo_producto(this.jInternalFrameDetalleFormPreciosCompras.jTextFieldcodigo_productoPreciosCompras.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PreciosComprasConstantesFunciones.LABEL_CODIGOPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreciosCompras.jLabelcodigo_productoPreciosCompras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPreciosCompras(PreciosCompras precioscomprasBean,PreciosCompras precioscompras,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPreciosCompras(PreciosCompras precioscomprasOrigen,PreciosCompras precioscompras,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && precioscomprasOrigen.getId()!=null && !precioscomprasOrigen.getId().equals(0L))) {precioscompras.setId(precioscomprasOrigen.getId());}}
			if(conDefault || (!conDefault && precioscomprasOrigen.getfecha_emision_desde()!=null && !precioscomprasOrigen.getfecha_emision_desde().equals(new Date()))) {precioscompras.setfecha_emision_desde(precioscomprasOrigen.getfecha_emision_desde());}
			if(conDefault || (!conDefault && precioscomprasOrigen.getfecha_emision_hasta()!=null && !precioscomprasOrigen.getfecha_emision_hasta().equals(new Date()))) {precioscompras.setfecha_emision_hasta(precioscomprasOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && precioscomprasOrigen.getnombre_completo_cliente()!=null && !precioscomprasOrigen.getnombre_completo_cliente().equals(""))) {precioscompras.setnombre_completo_cliente(precioscomprasOrigen.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && precioscomprasOrigen.getnumero_comprobante()!=null && !precioscomprasOrigen.getnumero_comprobante().equals(""))) {precioscompras.setnumero_comprobante(precioscomprasOrigen.getnumero_comprobante());}
			if(conDefault || (!conDefault && precioscomprasOrigen.getfecha_emision()!=null && !precioscomprasOrigen.getfecha_emision().equals(new Date()))) {precioscompras.setfecha_emision(precioscomprasOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && precioscomprasOrigen.getnombre_producto()!=null && !precioscomprasOrigen.getnombre_producto().equals(""))) {precioscompras.setnombre_producto(precioscomprasOrigen.getnombre_producto());}
			if(conDefault || (!conDefault && precioscomprasOrigen.getcosto_unitario()!=null && !precioscomprasOrigen.getcosto_unitario().equals(0.0))) {precioscompras.setcosto_unitario(precioscomprasOrigen.getcosto_unitario());}
			if(conDefault || (!conDefault && precioscomprasOrigen.getcodigo_producto()!=null && !precioscomprasOrigen.getcodigo_producto().equals(""))) {precioscompras.setcodigo_producto(precioscomprasOrigen.getcodigo_producto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPreciosCompras(PreciosCompras precioscompras) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPreciosCompras.jLabelidPreciosCompras.setText(precioscompras.getId().toString());
			this.jInternalFrameDetalleFormPreciosCompras.jTextAreanombre_completo_clientePreciosCompras.setText(precioscompras.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormPreciosCompras.jTextFieldnumero_comprobantePreciosCompras.setText(precioscompras.getnumero_comprobante());
			this.jInternalFrameDetalleFormPreciosCompras.jDateChooserfecha_emisionPreciosCompras.setDate(precioscompras.getfecha_emision());
			this.jInternalFrameDetalleFormPreciosCompras.jTextAreanombre_productoPreciosCompras.setText(precioscompras.getnombre_producto());
			this.jInternalFrameDetalleFormPreciosCompras.jTextFieldcosto_unitarioPreciosCompras.setText(precioscompras.getcosto_unitario().toString());
			this.jInternalFrameDetalleFormPreciosCompras.jTextFieldcodigo_productoPreciosCompras.setText(precioscompras.getcodigo_producto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPreciosCompras(PreciosComprasBean precioscomprasBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPreciosCompras.jLabelidPreciosCompras.setText(precioscomprasBean.getId().toString());
			this.jInternalFrameDetalleFormPreciosCompras.jTextAreanombre_completo_clientePreciosCompras.setText(precioscomprasBean.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormPreciosCompras.jTextFieldnumero_comprobantePreciosCompras.setText(precioscomprasBean.getnumero_comprobante());
			this.jInternalFrameDetalleFormPreciosCompras.jDateChooserfecha_emisionPreciosCompras.setDate(precioscomprasBean.getfecha_emision());
			this.jInternalFrameDetalleFormPreciosCompras.jTextAreanombre_productoPreciosCompras.setText(precioscomprasBean.getnombre_producto());
			this.jInternalFrameDetalleFormPreciosCompras.jTextFieldcosto_unitarioPreciosCompras.setText(precioscomprasBean.getcosto_unitario().toString());
			this.jInternalFrameDetalleFormPreciosCompras.jTextFieldcodigo_productoPreciosCompras.setText(precioscomprasBean.getcodigo_producto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPreciosCompras(PreciosComprasParameterReturnGeneral precioscomprasReturnGeneral,PreciosComprasBean precioscomprasBean,Boolean conDefault) throws Exception { 
		try {
			PreciosCompras precioscomprasLocal=new PreciosCompras();
			
			precioscomprasLocal=precioscomprasReturnGeneral.getPreciosCompras();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && precioscomprasLocal.getId()!=null && !precioscomprasLocal.getId().equals(0L))) {precioscomprasBean.setId(precioscomprasLocal.getId());}}
			if(conDefault || (!conDefault && precioscomprasLocal.getnombre_completo_cliente()!=null && !precioscomprasLocal.getnombre_completo_cliente().equals(""))) {precioscomprasBean.setnombre_completo_cliente(precioscomprasLocal.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && precioscomprasLocal.getnumero_comprobante()!=null && !precioscomprasLocal.getnumero_comprobante().equals(""))) {precioscomprasBean.setnumero_comprobante(precioscomprasLocal.getnumero_comprobante());}
			if(conDefault || (!conDefault && precioscomprasLocal.getfecha_emision()!=null && !precioscomprasLocal.getfecha_emision().equals(new Date()))) {precioscomprasBean.setfecha_emision(precioscomprasLocal.getfecha_emision());}
			if(conDefault || (!conDefault && precioscomprasLocal.getnombre_producto()!=null && !precioscomprasLocal.getnombre_producto().equals(""))) {precioscomprasBean.setnombre_producto(precioscomprasLocal.getnombre_producto());}
			if(conDefault || (!conDefault && precioscomprasLocal.getcosto_unitario()!=null && !precioscomprasLocal.getcosto_unitario().equals(0.0))) {precioscomprasBean.setcosto_unitario(precioscomprasLocal.getcosto_unitario());}
			if(conDefault || (!conDefault && precioscomprasLocal.getcodigo_producto()!=null && !precioscomprasLocal.getcodigo_producto().equals(""))) {precioscomprasBean.setcodigo_producto(precioscomprasLocal.getcodigo_producto());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPreciosComprasGenerico(Long idPreciosComprasSeleccionado,JComboBox jComboBoxPreciosCompras,List<PreciosCompras> precioscomprassLocal)throws Exception {
		try {
			PreciosCompras  precioscomprasTemp=null;

			for(PreciosCompras precioscomprasAux:precioscomprassLocal) {
				if(precioscomprasAux.getId()!=null && precioscomprasAux.getId().equals(idPreciosComprasSeleccionado)) {
					precioscomprasTemp=precioscomprasAux;
					break;
				}
			}

			jComboBoxPreciosCompras.setSelectedItem(precioscomprasTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPreciosComprasGenerico(JComboBox jComboBoxPreciosCompras,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPreciosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPreciosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPreciosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPreciosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPreciosCompras.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPreciosCompras.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPreciosCompras.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPreciosCompras.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPreciosCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPreciosCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			precioscompras=(PreciosCompras) precioscomprasLogic.getPreciosComprass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			precioscompras =(PreciosCompras) precioscomprass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!precioscompras.getIsNew() && !precioscompras.getIsChanged() && !precioscompras.getIsDeleted()) {
				sDescripcion=precioscompras.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=precioscompras.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!precioscompras.getIsNew() && !precioscompras.getIsChanged() && !precioscompras.getIsDeleted()) {
				sDescripcion=precioscompras.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=precioscompras.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!precioscompras.getIsNew() && !precioscompras.getIsChanged() && !precioscompras.getIsDeleted()) {
				sDescripcion=precioscompras.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=precioscompras.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!precioscompras.getIsNew() && !precioscompras.getIsChanged() && !precioscompras.getIsDeleted()) {
				sDescripcion=precioscompras.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=precioscompras.getproducto_descripcion();
			}
		}

		if(sTipo.equals("Transaccion")) {
			//sDescripcion=this.getActualTransaccionForeignKeyDescripcion((Long)value);
			if(!precioscompras.getIsNew() && !precioscompras.getIsChanged() && !precioscompras.getIsDeleted()) {
				sDescripcion=precioscompras.gettransaccion_descripcion();
			} else {
				//sDescripcion=this.getActualTransaccionForeignKeyDescripcion((Long)value);
				sDescripcion=precioscompras.gettransaccion_descripcion();
			}
		}

		if(sTipo.equals("Linea")) {
			//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
			if(!precioscompras.getIsNew() && !precioscompras.getIsChanged() && !precioscompras.getIsDeleted()) {
				sDescripcion=precioscompras.getlinea_descripcion();
			} else {
				//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
				sDescripcion=precioscompras.getlinea_descripcion();
			}
		}

		if(sTipo.equals("LineaGrupo")) {
			//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
			if(!precioscompras.getIsNew() && !precioscompras.getIsChanged() && !precioscompras.getIsDeleted()) {
				sDescripcion=precioscompras.getlineagrupo_descripcion();
			} else {
				//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
				sDescripcion=precioscompras.getlineagrupo_descripcion();
			}
		}

		if(sTipo.equals("LineaCategoria")) {
			//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
			if(!precioscompras.getIsNew() && !precioscompras.getIsChanged() && !precioscompras.getIsDeleted()) {
				sDescripcion=precioscompras.getlineacategoria_descripcion();
			} else {
				//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
				sDescripcion=precioscompras.getlineacategoria_descripcion();
			}
		}

		if(sTipo.equals("LineaMarca")) {
			//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
			if(!precioscompras.getIsNew() && !precioscompras.getIsChanged() && !precioscompras.getIsDeleted()) {
				sDescripcion=precioscompras.getlineamarca_descripcion();
			} else {
				//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
				sDescripcion=precioscompras.getlineamarca_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PreciosCompras precioscomprasRow=new PreciosCompras();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			precioscomprasRow=(PreciosCompras) precioscomprasLogic.getPreciosComprass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			precioscomprasRow=(PreciosCompras) precioscomprass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPreciosCompras(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPreciosCompras.setVisible((this.isVisibilidadCeldaNuevoPreciosCompras && this.isPermisoNuevoPreciosCompras));			
			this.jButtonDuplicarPreciosCompras.setVisible((this.isVisibilidadCeldaDuplicarPreciosCompras && this.isPermisoDuplicarPreciosCompras));			
			this.jButtonCopiarPreciosCompras.setVisible((this.isVisibilidadCeldaCopiarPreciosCompras && this.isPermisoCopiarPreciosCompras));
			this.jButtonVerFormPreciosCompras.setVisible((this.isVisibilidadCeldaVerFormPreciosCompras && this.isPermisoVerFormPreciosCompras));
			
			this.jButtonAbrirOrderByPreciosCompras.setVisible((this.isVisibilidadCeldaOrdenPreciosCompras && this.isPermisoOrdenPreciosCompras));			
			
			this.jButtonNuevoRelacionesPreciosCompras.setVisible((this.isVisibilidadCeldaNuevoRelacionesPreciosCompras && this.isPermisoNuevoPreciosCompras));			
			this.jButtonNuevoGuardarCambiosPreciosCompras.setVisible((this.isVisibilidadCeldaNuevoPreciosCompras && this.isPermisoNuevoPreciosCompras && this.isPermisoGuardarCambiosPreciosCompras));
			
			if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
			this.jInternalFrameDetalleFormPreciosCompras.jButtonModificarPreciosCompras.setVisible((this.isVisibilidadCeldaModificarPreciosCompras && this.isPermisoActualizarPreciosCompras));	
			this.jInternalFrameDetalleFormPreciosCompras.jButtonActualizarPreciosCompras.setVisible((this.isVisibilidadCeldaActualizarPreciosCompras && this.isPermisoActualizarPreciosCompras));	
			this.jInternalFrameDetalleFormPreciosCompras.jButtonEliminarPreciosCompras.setVisible((this.isVisibilidadCeldaEliminarPreciosCompras && this.isPermisoEliminarPreciosCompras));
			this.jInternalFrameDetalleFormPreciosCompras.jButtonCancelarPreciosCompras.setVisible(this.isVisibilidadCeldaCancelarPreciosCompras);							
			this.jInternalFrameDetalleFormPreciosCompras.jButtonGuardarCambiosPreciosCompras.setVisible((this.isVisibilidadCeldaGuardarPreciosCompras && this.isPermisoGuardarCambiosPreciosCompras));			
			
			}
						
			this.jButtonGuardarCambiosTablaPreciosCompras.setVisible((this.isVisibilidadCeldaGuardarCambiosPreciosCompras && this.isPermisoGuardarCambiosPreciosCompras));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPreciosCompras.setVisible((this.isVisibilidadCeldaNuevoPreciosCompras && this.isPermisoNuevoPreciosCompras));						
			this.jButtonDuplicarToolBarPreciosCompras.setVisible((this.isVisibilidadCeldaDuplicarPreciosCompras && this.isPermisoDuplicarPreciosCompras));						
			this.jButtonCopiarToolBarPreciosCompras.setVisible((this.isVisibilidadCeldaCopiarPreciosCompras && this.isPermisoCopiarPreciosCompras));			
			this.jButtonVerFormToolBarPreciosCompras.setVisible((this.isVisibilidadCeldaVerFormPreciosCompras && this.isPermisoVerFormPreciosCompras));			
			this.jButtonAbrirOrderByToolBarPreciosCompras.setVisible((this.isVisibilidadCeldaOrdenPreciosCompras && this.isPermisoOrdenPreciosCompras));
			this.jButtonNuevoRelacionesToolBarPreciosCompras.setVisible((this.isVisibilidadCeldaNuevoRelacionesPreciosCompras && this.isPermisoNuevoPreciosCompras));			
			this.jButtonNuevoGuardarCambiosToolBarPreciosCompras.setVisible((this.isVisibilidadCeldaNuevoPreciosCompras && this.isPermisoNuevoPreciosCompras && this.isPermisoGuardarCambiosPreciosCompras));			
			
			if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
			this.jInternalFrameDetalleFormPreciosCompras.jButtonModificarToolBarPreciosCompras.setVisible((this.isVisibilidadCeldaModificarPreciosCompras && this.isPermisoActualizarPreciosCompras));	
			this.jInternalFrameDetalleFormPreciosCompras.jButtonActualizarToolBarPreciosCompras.setVisible((this.isVisibilidadCeldaActualizarPreciosCompras  && this.isPermisoActualizarPreciosCompras));	
			this.jInternalFrameDetalleFormPreciosCompras.jButtonEliminarToolBarPreciosCompras.setVisible((this.isVisibilidadCeldaEliminarPreciosCompras && this.isPermisoEliminarPreciosCompras));
			this.jInternalFrameDetalleFormPreciosCompras.jButtonCancelarToolBarPreciosCompras.setVisible(this.isVisibilidadCeldaCancelarPreciosCompras);				
			this.jInternalFrameDetalleFormPreciosCompras.jButtonGuardarCambiosToolBarPreciosCompras.setVisible((this.isVisibilidadCeldaGuardarPreciosCompras && this.isPermisoGuardarCambiosPreciosCompras));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPreciosCompras.setVisible((this.isVisibilidadCeldaGuardarCambiosPreciosCompras && this.isPermisoGuardarCambiosPreciosCompras));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPreciosCompras.setVisible((this.isVisibilidadCeldaNuevoPreciosCompras && this.isPermisoNuevoPreciosCompras));			
			this.jMenuItemDuplicarPreciosCompras.setVisible((this.isVisibilidadCeldaDuplicarPreciosCompras && this.isPermisoDuplicarPreciosCompras));			
			this.jMenuItemCopiarPreciosCompras.setVisible((this.isVisibilidadCeldaCopiarPreciosCompras && this.isPermisoCopiarPreciosCompras));			
			this.jMenuItemVerFormPreciosCompras.setVisible((this.isVisibilidadCeldaVerFormPreciosCompras && this.isPermisoVerFormPreciosCompras));			
			this.jMenuItemAbrirOrderByPreciosCompras.setVisible((this.isVisibilidadCeldaOrdenPreciosCompras && this.isPermisoOrdenPreciosCompras));			
			//this.jMenuItemMostrarOcultarPreciosCompras.setVisible((this.isVisibilidadCeldaOrdenPreciosCompras && this.isPermisoOrdenPreciosCompras));
			this.jMenuItemDetalleAbrirOrderByPreciosCompras.setVisible((this.isVisibilidadCeldaOrdenPreciosCompras && this.isPermisoOrdenPreciosCompras));			
			//this.jMenuItemDetalleMostrarOcultarPreciosCompras.setVisible((this.isVisibilidadCeldaOrdenPreciosCompras && this.isPermisoOrdenPreciosCompras));			
			this.jMenuItemNuevoRelacionesPreciosCompras.setVisible((this.isVisibilidadCeldaNuevoRelacionesPreciosCompras && this.isPermisoNuevoPreciosCompras));			
			this.jMenuItemNuevoGuardarCambiosPreciosCompras.setVisible((this.isVisibilidadCeldaNuevoPreciosCompras && this.isPermisoNuevoPreciosCompras && this.isPermisoGuardarCambiosPreciosCompras));									
			
			if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
			this.jInternalFrameDetalleFormPreciosCompras.jMenuItemModificarPreciosCompras.setVisible((this.isVisibilidadCeldaModificarPreciosCompras && this.isPermisoActualizarPreciosCompras));	
			this.jInternalFrameDetalleFormPreciosCompras.jMenuItemActualizarPreciosCompras.setVisible((this.isVisibilidadCeldaActualizarPreciosCompras && this.isPermisoActualizarPreciosCompras));	
			this.jInternalFrameDetalleFormPreciosCompras.jMenuItemEliminarPreciosCompras.setVisible((this.isVisibilidadCeldaEliminarPreciosCompras && this.isPermisoEliminarPreciosCompras));
			this.jInternalFrameDetalleFormPreciosCompras.jMenuItemCancelarPreciosCompras.setVisible(this.isVisibilidadCeldaCancelarPreciosCompras);				
			}
			
			this.jMenuItemGuardarCambiosPreciosCompras.setVisible((this.isVisibilidadCeldaGuardarPreciosCompras && this.isPermisoGuardarCambiosPreciosCompras));						
			this.jMenuItemGuardarCambiosTablaPreciosCompras.setVisible((this.isVisibilidadCeldaGuardarCambiosPreciosCompras && this.isPermisoGuardarCambiosPreciosCompras));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPreciosCompras=this.jButtonNuevoPreciosCompras.isVisible();
			this.isVisibilidadCeldaDuplicarPreciosCompras=this.jButtonDuplicarPreciosCompras.isVisible();
			this.isVisibilidadCeldaCopiarPreciosCompras=this.jButtonCopiarPreciosCompras.isVisible();
			this.isVisibilidadCeldaVerFormPreciosCompras=this.jButtonVerFormPreciosCompras.isVisible();
			
			this.isVisibilidadCeldaOrdenPreciosCompras=this.jButtonAbrirOrderByPreciosCompras.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPreciosCompras=this.jButtonNuevoRelacionesPreciosCompras.isVisible();
			this.isVisibilidadCeldaModificarPreciosCompras=this.jButtonModificarPreciosCompras.isVisible();
			
			if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
			this.isVisibilidadCeldaActualizarPreciosCompras=this.jInternalFrameDetalleFormPreciosCompras.jButtonActualizarPreciosCompras.isVisible();
			this.isVisibilidadCeldaEliminarPreciosCompras=this.jInternalFrameDetalleFormPreciosCompras.jButtonEliminarPreciosCompras.isVisible();
			this.isVisibilidadCeldaCancelarPreciosCompras=this.jInternalFrameDetalleFormPreciosCompras.jButtonCancelarPreciosCompras.isVisible();
			this.isVisibilidadCeldaGuardarPreciosCompras=this.jInternalFrameDetalleFormPreciosCompras.jButtonGuardarCambiosPreciosCompras.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPreciosCompras=this.jButtonGuardarCambiosTablaPreciosCompras.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPreciosCompras=this.jButtonNuevoToolBarPreciosCompras.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPreciosCompras=this.jButtonNuevoRelacionesToolBarPreciosCompras.isVisible();
			
			if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
			this.isVisibilidadCeldaModificarPreciosCompras=this.jInternalFrameDetalleFormPreciosCompras.jButtonModificarToolBarPreciosCompras.isVisible();
			this.isVisibilidadCeldaActualizarPreciosCompras=this.jInternalFrameDetalleFormPreciosCompras.jButtonActualizarToolBarPreciosCompras.isVisible();
			this.isVisibilidadCeldaEliminarPreciosCompras=this.jInternalFrameDetalleFormPreciosCompras.jButtonEliminarToolBarPreciosCompras.isVisible();
			this.isVisibilidadCeldaCancelarPreciosCompras=this.jInternalFrameDetalleFormPreciosCompras.jButtonCancelarToolBarPreciosCompras.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPreciosCompras=this.jButtonGuardarCambiosToolBarPreciosCompras.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPreciosCompras=this.jButtonGuardarCambiosTablaToolBarPreciosCompras.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPreciosCompras=this.jMenuItemNuevoPreciosCompras.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPreciosCompras=this.jMenuItemNuevoRelacionesPreciosCompras.isVisible();
			
			if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
			this.isVisibilidadCeldaModificarPreciosCompras=this.jInternalFrameDetalleFormPreciosCompras.jMenuItemModificarPreciosCompras.isVisible();
			this.isVisibilidadCeldaActualizarPreciosCompras=this.jInternalFrameDetalleFormPreciosCompras.jMenuItemActualizarPreciosCompras.isVisible();
			this.isVisibilidadCeldaEliminarPreciosCompras=this.jInternalFrameDetalleFormPreciosCompras.jMenuItemEliminarPreciosCompras.isVisible();
			this.isVisibilidadCeldaCancelarPreciosCompras=this.jInternalFrameDetalleFormPreciosCompras.jMenuItemCancelarPreciosCompras.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPreciosCompras=this.jMenuItemGuardarCambiosPreciosCompras.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPreciosCompras=this.jMenuItemGuardarCambiosTablaPreciosCompras.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPreciosCompras(Boolean esInicializar) {
		if(PreciosComprasJInternalFrame.ISBINDING_MANUAL) {			
			if(this.precioscomprasSessionBean.getConGuardarRelaciones()) {
				//if(this.precioscomprasSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPreciosCompras();
			}
			
			this.inicializarActualizarBindingBotonesManualPreciosCompras(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPreciosCompras() {
		this.jButtonNuevoPreciosCompras.setVisible(this.isPermisoNuevoPreciosCompras);			
		this.jButtonDuplicarPreciosCompras.setVisible(this.isPermisoDuplicarPreciosCompras);			
		this.jButtonCopiarPreciosCompras.setVisible(this.isPermisoCopiarPreciosCompras);			
		this.jButtonVerFormPreciosCompras.setVisible(this.isPermisoVerFormPreciosCompras);			
		
		this.jButtonAbrirOrderByPreciosCompras.setVisible(this.isPermisoOrdenPreciosCompras);					
		
		this.jButtonNuevoRelacionesPreciosCompras.setVisible(this.isPermisoNuevoPreciosCompras);			
		
		if(this.jInternalFrameDetalleFormPreciosCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreciosCompras.jButtonModificarPreciosCompras.setVisible(this.isPermisoActualizarPreciosCompras);	
			this.jInternalFrameDetalleFormPreciosCompras.jButtonActualizarPreciosCompras.setVisible(this.isPermisoActualizarPreciosCompras);	
			this.jInternalFrameDetalleFormPreciosCompras.jButtonEliminarPreciosCompras.setVisible(this.isPermisoEliminarPreciosCompras);
			this.jInternalFrameDetalleFormPreciosCompras.jButtonCancelarPreciosCompras.setVisible(this.isVisibilidadCeldaCancelarPreciosCompras);						
			this.jInternalFrameDetalleFormPreciosCompras.jButtonGuardarCambiosPreciosCompras.setVisible(this.isPermisoGuardarCambiosPreciosCompras);							
		}
		
		this.jButtonGuardarCambiosTablaPreciosCompras.setVisible(this.isPermisoActualizarPreciosCompras);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePreciosCompras() {
		this.jInternalFrameDetalleFormPreciosCompras.jButtonModificarPreciosCompras.setVisible(this.isPermisoActualizarPreciosCompras);	
		this.jInternalFrameDetalleFormPreciosCompras.jButtonActualizarPreciosCompras.setVisible(this.isPermisoActualizarPreciosCompras);	
		this.jInternalFrameDetalleFormPreciosCompras.jButtonEliminarPreciosCompras.setVisible(this.isPermisoEliminarPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jButtonCancelarPreciosCompras.setVisible(this.isVisibilidadCeldaCancelarPreciosCompras);							
		this.jInternalFrameDetalleFormPreciosCompras.jButtonGuardarCambiosPreciosCompras.setVisible((this.isVisibilidadCeldaGuardarPreciosCompras && this.isPermisoGuardarCambiosPreciosCompras));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPreciosCompras() {
		if(PreciosComprasJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPreciosCompras();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPreciosCompras() {
	}
	
	public void jTableDatosPreciosComprasListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPreciosCompras(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPreciosComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreciosCompras(this.getprecioscompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.precioscompras =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.precioscompras =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.precioscompras==null) {
						this.precioscompras = new PreciosCompras();
					}

					this.setVariablesFormularioToObjetoActualPreciosCompras(this.precioscompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);
				}

				if(this.precioscompras.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.precioscompras.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreciosCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaPreciosComprasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebPreciosCompras(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPreciosCompras.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPreciosCompras.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscompras =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.precioscompras =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPreciosCompras(this.getprecioscompras(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.precioscomprasLogic.getConnexion());

				if(this.precioscompras.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.precioscompras.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPreciosCompras=(TitledBorder)this.jScrollPanelDatosPreciosCompras.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderPreciosCompras.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaPreciosComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreciosCompras(this.getprecioscompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.precioscompras =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.precioscompras =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.precioscompras==null) {
						this.precioscompras = new PreciosCompras();
					}

					this.setVariablesFormularioToObjetoActualPreciosCompras(this.precioscompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);
				}

				if(this.precioscompras.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.precioscompras.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreciosCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalPreciosComprasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebPreciosCompras(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPreciosCompras.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPreciosCompras.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscompras =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.precioscompras =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPreciosCompras(this.getprecioscompras(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.precioscomprasLogic.getConnexion());

				if(this.precioscompras.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.precioscompras.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPreciosCompras=(TitledBorder)this.jScrollPanelDatosPreciosCompras.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderPreciosCompras.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalPreciosComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreciosCompras(this.getprecioscompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.precioscompras =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.precioscompras =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.precioscompras==null) {
						this.precioscompras = new PreciosCompras();
					}

					this.setVariablesFormularioToObjetoActualPreciosCompras(this.precioscompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);
				}

				if(this.precioscompras.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.precioscompras.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreciosCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaPreciosComprasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebPreciosCompras(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPreciosCompras.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPreciosCompras.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscompras =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.precioscompras =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPreciosCompras(this.getprecioscompras(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.precioscomprasLogic.getConnexion());

				if(this.precioscompras.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.precioscompras.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPreciosCompras=(TitledBorder)this.jScrollPanelDatosPreciosCompras.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderPreciosCompras.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaPreciosComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreciosCompras(this.getprecioscompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.precioscompras =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.precioscompras =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.precioscompras==null) {
						this.precioscompras = new PreciosCompras();
					}

					this.setVariablesFormularioToObjetoActualPreciosCompras(this.precioscompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);
				}

				if(this.precioscompras.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.precioscompras.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreciosCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoPreciosComprasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebPreciosCompras(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPreciosCompras.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPreciosCompras.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscompras =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.precioscompras =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPreciosCompras(this.getprecioscompras(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.precioscomprasLogic.getConnexion());

				if(this.precioscompras.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.precioscompras.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPreciosCompras=(TitledBorder)this.jScrollPanelDatosPreciosCompras.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderPreciosCompras.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoPreciosComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreciosCompras(this.getprecioscompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.precioscompras =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.precioscompras =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.precioscompras==null) {
						this.precioscompras = new PreciosCompras();
					}

					this.setVariablesFormularioToObjetoActualPreciosCompras(this.precioscompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);
				}

				if(this.precioscompras.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.precioscompras.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreciosCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_transaccionPreciosComprasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotransaccion=true;

			idTienePermisotransaccion=this.tienePermisosUsuarioEnPaginaWebPreciosCompras(TransaccionConstantesFunciones.CLASSNAME);

			if(idTienePermisotransaccion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPreciosCompras.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPreciosCompras.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscompras =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.precioscompras =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPreciosCompras(this.getprecioscompras(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);

				this.transaccionBeanSwingJInternalFrame=new TransaccionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.transaccionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.transaccionBeanSwingJInternalFrame.getTransaccionLogic().setConnexion(this.precioscomprasLogic.getConnexion());

				if(this.precioscompras.getid_transaccion()!=null) {
					this.transaccionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.transaccionBeanSwingJInternalFrame.setIdActual(this.precioscompras.getid_transaccion());
					this.transaccionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.transaccionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.transaccionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccion();
				}

				JInternalFrameBase jinternalFrame =this.transaccionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPreciosCompras=(TitledBorder)this.jScrollPanelDatosPreciosCompras.getBorder();
				TitledBorder titledBordertransaccion=(TitledBorder)this.transaccionBeanSwingJInternalFrame.jScrollPanelDatosTransaccion.getBorder();

				titledBordertransaccion.setTitle(titledBorderPreciosCompras.getTitle() + " -> TRANSACCION");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_transaccionPreciosComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreciosCompras(this.getprecioscompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.precioscompras =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.precioscompras =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.precioscompras==null) {
						this.precioscompras = new PreciosCompras();
					}

					this.setVariablesFormularioToObjetoActualPreciosCompras(this.precioscompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);
				}

				if(this.precioscompras.getid_transaccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_transaccion = "+this.precioscompras.getid_transaccion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreciosCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_lineaPreciosComprasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolinea=true;

			idTienePermisolinea=this.tienePermisosUsuarioEnPaginaWebPreciosCompras(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolinea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPreciosCompras.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPreciosCompras.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscompras =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.precioscompras =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPreciosCompras(this.getprecioscompras(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);

				this.lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.precioscomprasLogic.getConnexion());

				if(this.precioscompras.getid_linea()!=null) {
					this.lineaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineaBeanSwingJInternalFrame.setIdActual(this.precioscompras.getid_linea());
					this.lineaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPreciosCompras=(TitledBorder)this.jScrollPanelDatosPreciosCompras.getBorder();
				TitledBorder titledBorderlinea=(TitledBorder)this.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlinea.setTitle(titledBorderPreciosCompras.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_lineaPreciosComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreciosCompras(this.getprecioscompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.precioscompras =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.precioscompras =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.precioscompras==null) {
						this.precioscompras = new PreciosCompras();
					}

					this.setVariablesFormularioToObjetoActualPreciosCompras(this.precioscompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);
				}

				if(this.precioscompras.getid_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea = "+this.precioscompras.getid_linea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreciosCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_grupoPreciosComprasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineagrupo=true;

			idTienePermisolineagrupo=this.tienePermisosUsuarioEnPaginaWebPreciosCompras(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineagrupo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPreciosCompras.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPreciosCompras.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscompras =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.precioscompras =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPreciosCompras(this.getprecioscompras(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);

				this.lineagrupoBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineagrupoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineagrupoBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.precioscomprasLogic.getConnexion());

				if(this.precioscompras.getid_linea_grupo()!=null) {
					this.lineagrupoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineagrupoBeanSwingJInternalFrame.setIdActual(this.precioscompras.getid_linea_grupo());
					this.lineagrupoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineagrupoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPreciosCompras=(TitledBorder)this.jScrollPanelDatosPreciosCompras.getBorder();
				TitledBorder titledBorderlineagrupo=(TitledBorder)this.lineagrupoBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineagrupo.setTitle(titledBorderPreciosCompras.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_grupoPreciosComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreciosCompras(this.getprecioscompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.precioscompras =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.precioscompras =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.precioscompras==null) {
						this.precioscompras = new PreciosCompras();
					}

					this.setVariablesFormularioToObjetoActualPreciosCompras(this.precioscompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);
				}

				if(this.precioscompras.getid_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_grupo = "+this.precioscompras.getid_linea_grupo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreciosCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_categoriaPreciosComprasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineacategoria=true;

			idTienePermisolineacategoria=this.tienePermisosUsuarioEnPaginaWebPreciosCompras(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineacategoria) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPreciosCompras.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPreciosCompras.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscompras =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.precioscompras =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPreciosCompras(this.getprecioscompras(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);

				this.lineacategoriaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineacategoriaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineacategoriaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.precioscomprasLogic.getConnexion());

				if(this.precioscompras.getid_linea_categoria()!=null) {
					this.lineacategoriaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineacategoriaBeanSwingJInternalFrame.setIdActual(this.precioscompras.getid_linea_categoria());
					this.lineacategoriaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineacategoriaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPreciosCompras=(TitledBorder)this.jScrollPanelDatosPreciosCompras.getBorder();
				TitledBorder titledBorderlineacategoria=(TitledBorder)this.lineacategoriaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineacategoria.setTitle(titledBorderPreciosCompras.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_categoriaPreciosComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreciosCompras(this.getprecioscompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.precioscompras =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.precioscompras =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.precioscompras==null) {
						this.precioscompras = new PreciosCompras();
					}

					this.setVariablesFormularioToObjetoActualPreciosCompras(this.precioscompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);
				}

				if(this.precioscompras.getid_linea_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_categoria = "+this.precioscompras.getid_linea_categoria().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreciosCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_marcaPreciosComprasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineamarca=true;

			idTienePermisolineamarca=this.tienePermisosUsuarioEnPaginaWebPreciosCompras(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineamarca) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPreciosCompras.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPreciosCompras.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscompras =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.precioscompras =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPreciosCompras(this.getprecioscompras(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);

				this.lineamarcaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineamarcaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineamarcaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.precioscomprasLogic.getConnexion());

				if(this.precioscompras.getid_linea_marca()!=null) {
					this.lineamarcaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineamarcaBeanSwingJInternalFrame.setIdActual(this.precioscompras.getid_linea_marca());
					this.lineamarcaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineamarcaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPreciosCompras=(TitledBorder)this.jScrollPanelDatosPreciosCompras.getBorder();
				TitledBorder titledBorderlineamarca=(TitledBorder)this.lineamarcaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineamarca.setTitle(titledBorderPreciosCompras.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_marcaPreciosComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreciosCompras(this.getprecioscompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.precioscompras =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.precioscompras =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.precioscompras==null) {
						this.precioscompras = new PreciosCompras();
					}

					this.setVariablesFormularioToObjetoActualPreciosCompras(this.precioscompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);
				}

				if(this.precioscompras.getid_linea_marca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_marca = "+this.precioscompras.getid_linea_marca().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreciosCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_desdePreciosComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreciosCompras(this.getprecioscompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.precioscompras =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.precioscompras =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.precioscompras==null) {
						this.precioscompras = new PreciosCompras();
					}

					this.setVariablesFormularioToObjetoActualPreciosCompras(this.precioscompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);
				}

				if(this.precioscompras.getfecha_emision_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_desde = '"+Funciones2.getStringPostgresDate(this.precioscompras.getfecha_emision_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreciosCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaPreciosComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreciosCompras(this.getprecioscompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.precioscompras =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.precioscompras =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.precioscompras==null) {
						this.precioscompras = new PreciosCompras();
					}

					this.setVariablesFormularioToObjetoActualPreciosCompras(this.precioscompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);
				}

				if(this.precioscompras.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.precioscompras.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreciosCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completo_clientePreciosComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreciosCompras(this.getprecioscompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.precioscompras =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.precioscompras =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.precioscompras==null) {
						this.precioscompras = new PreciosCompras();
					}

					this.setVariablesFormularioToObjetoActualPreciosCompras(this.precioscompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);
				}

				if(this.precioscompras.getnombre_completo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo_cliente like '%"+this.precioscompras.getnombre_completo_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreciosCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_comprobantePreciosComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreciosCompras(this.getprecioscompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.precioscompras =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.precioscompras =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.precioscompras==null) {
						this.precioscompras = new PreciosCompras();
					}

					this.setVariablesFormularioToObjetoActualPreciosCompras(this.precioscompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);
				}

				if(this.precioscompras.getnumero_comprobante()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_comprobante like '%"+this.precioscompras.getnumero_comprobante()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreciosCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionPreciosComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreciosCompras(this.getprecioscompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.precioscompras =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.precioscompras =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.precioscompras==null) {
						this.precioscompras = new PreciosCompras();
					}

					this.setVariablesFormularioToObjetoActualPreciosCompras(this.precioscompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);
				}

				if(this.precioscompras.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.precioscompras.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreciosCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_productoPreciosComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreciosCompras(this.getprecioscompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.precioscompras =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.precioscompras =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.precioscompras==null) {
						this.precioscompras = new PreciosCompras();
					}

					this.setVariablesFormularioToObjetoActualPreciosCompras(this.precioscompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);
				}

				if(this.precioscompras.getnombre_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_producto like '%"+this.precioscompras.getnombre_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreciosCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncosto_unitarioPreciosComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreciosCompras(this.getprecioscompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.precioscompras =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.precioscompras =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.precioscompras==null) {
						this.precioscompras = new PreciosCompras();
					}

					this.setVariablesFormularioToObjetoActualPreciosCompras(this.precioscompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);
				}

				if(this.precioscompras.getcosto_unitario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo_unitario = "+this.precioscompras.getcosto_unitario().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreciosCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_productoPreciosComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreciosCompras(this.getprecioscompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.precioscompras =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.precioscompras =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.precioscompras==null) {
						this.precioscompras = new PreciosCompras();
					}

					this.setVariablesFormularioToObjetoActualPreciosCompras(this.precioscompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);
				}

				if(this.precioscompras.getcodigo_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_producto like '%"+this.precioscompras.getcodigo_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreciosCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPreciosComprasPreciosComprasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPreciosCompras(false,false);

			this.getPreciosComprassBusquedaPreciosCompras();

			this.inicializarActualizarBindingPreciosCompras(false);

			//if(PreciosComprasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPreciosCompras(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdBodegaPreciosComprasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPreciosCompras(false,false);

			this.getPreciosComprassFK_IdBodega();

			this.inicializarActualizarBindingPreciosCompras(false);

			//if(PreciosComprasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPreciosCompras(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaPreciosComprasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPreciosCompras(false,false);

			this.getPreciosComprassFK_IdEmpresa();

			this.inicializarActualizarBindingPreciosCompras(false);

			//if(PreciosComprasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPreciosCompras(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaPreciosComprasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPreciosCompras(false,false);

			this.getPreciosComprassFK_IdLinea();

			this.inicializarActualizarBindingPreciosCompras(false);

			//if(PreciosComprasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPreciosCompras(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaCategoriaPreciosComprasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPreciosCompras(false,false);

			this.getPreciosComprassFK_IdLineaCategoria();

			this.inicializarActualizarBindingPreciosCompras(false);

			//if(PreciosComprasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPreciosCompras(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaGrupoPreciosComprasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPreciosCompras(false,false);

			this.getPreciosComprassFK_IdLineaGrupo();

			this.inicializarActualizarBindingPreciosCompras(false);

			//if(PreciosComprasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPreciosCompras(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaMarcaPreciosComprasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPreciosCompras(false,false);

			this.getPreciosComprassFK_IdLineaMarca();

			this.inicializarActualizarBindingPreciosCompras(false);

			//if(PreciosComprasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPreciosCompras(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoPreciosComprasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPreciosCompras(false,false);

			this.getPreciosComprassFK_IdProducto();

			this.inicializarActualizarBindingPreciosCompras(false);

			//if(PreciosComprasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPreciosCompras(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalPreciosComprasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPreciosCompras(false,false);

			this.getPreciosComprassFK_IdSucursal();

			this.inicializarActualizarBindingPreciosCompras(false);

			//if(PreciosComprasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPreciosCompras(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTransaccionPreciosComprasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPreciosCompras(false,false);

			this.getPreciosComprassFK_IdTransaccion();

			this.inicializarActualizarBindingPreciosCompras(false);

			//if(PreciosComprasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPreciosCompras(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioscomprasLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePreciosCompras() {
		if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
			this.jInternalFrameDetalleFormPreciosCompras.setVisible(false);	    			
			this.jInternalFrameDetalleFormPreciosCompras.dispose();
			this.jInternalFrameDetalleFormPreciosCompras=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPreciosCompras!=null) {
			this.jInternalFrameReporteDinamicoPreciosCompras.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPreciosCompras.dispose();
			this.jInternalFrameReporteDinamicoPreciosCompras=null;
		}
		
		if(this.jInternalFrameImportacionPreciosCompras!=null) {
			this.jInternalFrameImportacionPreciosCompras.setVisible(false);	    			
			this.jInternalFrameImportacionPreciosCompras.dispose();
			this.jInternalFrameImportacionPreciosCompras=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPreciosCompras();
			
			PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
			
			
			if(sTipo.equals("NuevoPreciosCompras")) {
				jButtonNuevoPreciosComprasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPreciosCompras")) {
				jButtonDuplicarPreciosComprasActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPreciosCompras")) {
				jButtonCopiarPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("VerFormPreciosCompras")) {
				jButtonVerFormPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPreciosCompras")) {
				jButtonNuevoPreciosComprasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPreciosCompras")) {
				jButtonDuplicarPreciosComprasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPreciosCompras")) {
				jButtonNuevoPreciosComprasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPreciosCompras")) {
				jButtonDuplicarPreciosComprasActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPreciosCompras")) {
				jButtonNuevoPreciosComprasActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPreciosCompras")) {
				jButtonNuevoPreciosComprasActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPreciosCompras")) {
				jButtonNuevoPreciosComprasActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPreciosCompras")) {
				jButtonModificarPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPreciosCompras")) {
				jButtonModificarPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPreciosCompras")) {
				jButtonModificarPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPreciosCompras")) {
				jButtonActualizarPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPreciosCompras")) {
				jButtonActualizarPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPreciosCompras")) {
				jButtonActualizarPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("EliminarPreciosCompras")) {
				jButtonEliminarPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPreciosCompras")) {
				jButtonEliminarPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPreciosCompras")) {
				jButtonEliminarPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("CancelarPreciosCompras")) {
				jButtonCancelarPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPreciosCompras")) {
				jButtonCancelarPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPreciosCompras")) {
				jButtonCancelarPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("CerrarPreciosCompras")) {
				jButtonCerrarPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPreciosCompras")) {
				jButtonCerrarPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPreciosCompras")) {
				jButtonCerrarPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPreciosCompras")) {
				jButtonMostrarOcultarPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPreciosCompras")) {
				jButtonCancelarPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPreciosCompras")) {
				jButtonGuardarCambiosPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPreciosCompras")) {
				jButtonGuardarCambiosPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPreciosCompras")) {
				jButtonCopiarPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPreciosCompras")) {
				jButtonVerFormPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPreciosCompras")) {
				jButtonGuardarCambiosPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPreciosCompras")) {
				jButtonCopiarPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPreciosCompras")) {
				jButtonVerFormPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPreciosCompras")) {
				jButtonGuardarCambiosPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPreciosCompras")) {
				jButtonGuardarCambiosPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPreciosCompras")) {
				jButtonGuardarCambiosPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPreciosCompras")) {
				jButtonRecargarInformacionPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPreciosCompras")) {
				jButtonRecargarInformacionPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPreciosCompras")) {
				jButtonRecargarInformacionPreciosComprasActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPreciosCompras")) {
				jButtonAnterioresPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPreciosCompras")) {
				jButtonAnterioresPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePreciosCompras")) {
				jButtonAnterioresPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPreciosCompras")) {
				jButtonSiguientesPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPreciosCompras")) {
				jButtonSiguientesPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPreciosCompras")) {
				jButtonSiguientesPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPreciosCompras") || sTipo.equals("MenuItemDetalleAbrirOrderByPreciosCompras")) {
				jButtonAbrirOrderByPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPreciosCompras") || sTipo.equals("MenuItemDetalleMostrarOcultarPreciosCompras")) {
				jButtonMostrarOcultarPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPreciosCompras")) {
				jButtonNuevoGuardarCambiosPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPreciosCompras")) {
				jButtonNuevoGuardarCambiosPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPreciosCompras")) {
				jButtonNuevoGuardarCambiosPreciosComprasActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPreciosCompras")) {
				jButtonCerrarReporteDinamicoPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPreciosCompras")) {
				jButtonGenerarReporteDinamicoPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPreciosCompras")) {
				
				jButtonGenerarExcelReporteDinamicoPreciosComprasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPreciosCompras")) {
				jButtonCerrarImportacionPreciosComprasActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPreciosCompras")) {
				
				jButtonGenerarImportacionPreciosComprasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPreciosCompras")) {
				
				jButtonAbrirImportacionPreciosComprasActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPreciosCompras")) {
				jComboBoxTiposAccionesPreciosComprasActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPreciosCompras")) {
				jComboBoxTiposRelacionesPreciosComprasActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPreciosCompras")) {
				jComboBoxTiposAccionesPreciosComprasActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPreciosCompras")) {
				
				jComboBoxTiposSeleccionarPreciosComprasActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPreciosCompras")) {
				jTextFieldValorCampoGeneralPreciosComprasActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPreciosCompras")) {
				jButtonAbrirOrderByPreciosComprasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPreciosCompras")) {
				jButtonAbrirOrderByPreciosComprasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPreciosCompras")) {
				jButtonCerrarOrderByPreciosComprasActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPreciosComprasBusqueda")) {
				this.jButtonidPreciosComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPreciosComprasUpdate")) {
				this.jButtonid_empresaPreciosComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPreciosComprasBusqueda")) {
				this.jButtonid_empresaPreciosComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalPreciosComprasUpdate")) {
				this.jButtonid_sucursalPreciosComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalPreciosComprasBusqueda")) {
				this.jButtonid_sucursalPreciosComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaPreciosComprasUpdate")) {
				this.jButtonid_bodegaPreciosComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaPreciosComprasBusqueda")) {
				this.jButtonid_bodegaPreciosComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoPreciosComprasUpdate")) {
				this.jButtonid_productoPreciosComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoPreciosComprasBusqueda")) {
				this.jButtonid_productoPreciosComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccionPreciosComprasUpdate")) {
				this.jButtonid_transaccionPreciosComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccionPreciosComprasBusqueda")) {
				this.jButtonid_transaccionPreciosComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaPreciosComprasUpdate")) {
				this.jButtonid_lineaPreciosComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaPreciosComprasBusqueda")) {
				this.jButtonid_lineaPreciosComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoPreciosComprasUpdate")) {
				this.jButtonid_linea_grupoPreciosComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoPreciosComprasBusqueda")) {
				this.jButtonid_linea_grupoPreciosComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaPreciosComprasUpdate")) {
				this.jButtonid_linea_categoriaPreciosComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaPreciosComprasBusqueda")) {
				this.jButtonid_linea_categoriaPreciosComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaPreciosComprasUpdate")) {
				this.jButtonid_linea_marcaPreciosComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaPreciosComprasBusqueda")) {
				this.jButtonid_linea_marcaPreciosComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdePreciosComprasBusqueda")) {
				this.jButtonfecha_emision_desdePreciosComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaPreciosComprasBusqueda")) {
				this.jButtonfecha_emision_hastaPreciosComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clientePreciosComprasBusqueda")) {
				this.jButtonnombre_completo_clientePreciosComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_comprobantePreciosComprasBusqueda")) {
				this.jButtonnumero_comprobantePreciosComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionPreciosComprasBusqueda")) {
				this.jButtonfecha_emisionPreciosComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoPreciosComprasBusqueda")) {
				this.jButtonnombre_productoPreciosComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_unitarioPreciosComprasBusqueda")) {
				this.jButtoncosto_unitarioPreciosComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_productoPreciosComprasBusqueda")) {
				this.jButtoncodigo_productoPreciosComprasBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPreciosComprasPreciosCompras")) {
				this.jButtonBusquedaPreciosComprasPreciosComprasActionPerformed(evt);
			}
			
			;
			
			
			PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPreciosCompras();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPreciosComprasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.precioscompras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.precioscompras);
				
				PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
				
				


				
				PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PreciosCompras.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreciosCompras.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PreciosCompras precioscomprasLocal=null;
			
			if(!this.getEsControlTabla()) {
				precioscomprasLocal=this.precioscompras;
			} else {
				precioscomprasLocal=this.precioscomprasAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.precioscompras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.precioscompras);
				
				PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
							
				
				


				
				PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PreciosCompras.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreciosCompras.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPreciosComprasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasAnterior =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.precioscomprasAnterior =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
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
			
			PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
			
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
			
			


			
			PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPreciosComprasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.precioscompras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.precioscompras);
				
				PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
								
						
				


				
				PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PreciosCompras.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreciosCompras.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.precioscompras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.precioscompras);
				
				PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
								
				
				


				
				PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PreciosCompras.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreciosCompras.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPreciosComprasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasAnterior =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.precioscomprasAnterior =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.precioscompras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.precioscompras);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPreciosComprasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasAnterior =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.precioscomprasAnterior =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPreciosComprasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.precioscompras);
			
			this.actualizarInformacion("INFO_PADRE",false,this.precioscompras);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.precioscompras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.precioscompras);
				
				PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
							
				
				


				
				PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PreciosCompras.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreciosCompras.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPreciosComprasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.precioscomprasAnterior =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.precioscomprasAnterior =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
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
			
			PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
			
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
			
			


			
			PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPreciosComprasActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.precioscompras);
			
			this.actualizarInformacion("INFO_PADRE",false,this.precioscompras);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.precioscompras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.precioscompras);
				
				PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
								
				
				


				
				PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PreciosCompras.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreciosCompras.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPreciosComprasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasAnterior =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.precioscomprasAnterior =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPreciosComprasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.precioscompras);
			
			this.actualizarInformacion("INFO_PADRE",false,this.precioscompras);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPreciosComprasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.precioscompras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.precioscompras);
				
				PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPreciosCompras")) {
					jCheckBoxSeleccionarTodosPreciosComprasItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPreciosCompras")) {
					jCheckBoxSeleccionadosPreciosComprasItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPreciosCompras")) {
					
				}
				
				


				
				
				PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PreciosCompras.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreciosCompras.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.precioscompras);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.precioscompras);
				
				PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
												
				
				


				
				
				PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PreciosCompras.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreciosCompras.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPreciosComprasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.precioscomprasAnterior =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.precioscomprasAnterior =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPreciosComprasActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.precioscompras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.precioscompras);
				
				PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
				
				
				PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
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
			
			PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
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
			
			


			
			PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPreciosComprasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.precioscompras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.precioscompras);
				
				PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PreciosCompras.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreciosCompras.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.precioscompras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.precioscompras);
				
				PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
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
				
				


				
				PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PreciosCompras.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreciosCompras.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPreciosComprasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioscomprasAnterior =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.precioscomprasAnterior =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPreciosCompras")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPreciosComprasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPreciosCompras.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.precioscompras =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.precioscompras =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.precioscompras);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPreciosCompras")) {
				
				}
				
				PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPreciosCompras")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPreciosCompras.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPreciosCompras")) {
			
			}
			
			PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPreciosCompras();
			
			PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
			
			if(sTipo.equals("NuevoPreciosCompras")) {
				jButtonNuevoPreciosComprasActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPreciosCompras")) {
				jButtonDuplicarPreciosComprasActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPreciosCompras")) {
				jButtonCopiarPreciosComprasActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPreciosCompras")) {
				jButtonVerFormPreciosComprasActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPreciosCompras")) {
				jButtonNuevoPreciosComprasActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPreciosCompras")) {
				jButtonModificarPreciosComprasActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPreciosCompras")) {
				jButtonActualizarPreciosComprasActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPreciosCompras")) {
				jButtonEliminarPreciosComprasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPreciosCompras")) {
				jButtonGuardarCambiosPreciosComprasActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPreciosCompras")) {
				jButtonCancelarPreciosComprasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPreciosCompras")) {
				jButtonCerrarPreciosComprasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPreciosCompras")) {
				jButtonGuardarCambiosPreciosComprasActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPreciosCompras")) {
				jButtonNuevoGuardarCambiosPreciosComprasActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPreciosCompras")) {
				jButtonAbrirOrderByPreciosComprasActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPreciosCompras")) {
				jButtonRecargarInformacionPreciosComprasActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPreciosCompras")) {
				jButtonAnterioresPreciosComprasActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPreciosCompras")) {
				jButtonSiguientesPreciosComprasActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPreciosComprasBusqueda")) {
				this.jButtonidPreciosComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPreciosComprasUpdate")) {
				this.jButtonid_empresaPreciosComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPreciosComprasBusqueda")) {
				this.jButtonid_empresaPreciosComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalPreciosComprasUpdate")) {
				this.jButtonid_sucursalPreciosComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalPreciosComprasBusqueda")) {
				this.jButtonid_sucursalPreciosComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaPreciosComprasUpdate")) {
				this.jButtonid_bodegaPreciosComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaPreciosComprasBusqueda")) {
				this.jButtonid_bodegaPreciosComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoPreciosComprasUpdate")) {
				this.jButtonid_productoPreciosComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoPreciosComprasBusqueda")) {
				this.jButtonid_productoPreciosComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccionPreciosComprasUpdate")) {
				this.jButtonid_transaccionPreciosComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccionPreciosComprasBusqueda")) {
				this.jButtonid_transaccionPreciosComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaPreciosComprasUpdate")) {
				this.jButtonid_lineaPreciosComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaPreciosComprasBusqueda")) {
				this.jButtonid_lineaPreciosComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoPreciosComprasUpdate")) {
				this.jButtonid_linea_grupoPreciosComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoPreciosComprasBusqueda")) {
				this.jButtonid_linea_grupoPreciosComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaPreciosComprasUpdate")) {
				this.jButtonid_linea_categoriaPreciosComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaPreciosComprasBusqueda")) {
				this.jButtonid_linea_categoriaPreciosComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaPreciosComprasUpdate")) {
				this.jButtonid_linea_marcaPreciosComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaPreciosComprasBusqueda")) {
				this.jButtonid_linea_marcaPreciosComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdePreciosComprasBusqueda")) {
				this.jButtonfecha_emision_desdePreciosComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaPreciosComprasBusqueda")) {
				this.jButtonfecha_emision_hastaPreciosComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clientePreciosComprasBusqueda")) {
				this.jButtonnombre_completo_clientePreciosComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_comprobantePreciosComprasBusqueda")) {
				this.jButtonnumero_comprobantePreciosComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionPreciosComprasBusqueda")) {
				this.jButtonfecha_emisionPreciosComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoPreciosComprasBusqueda")) {
				this.jButtonnombre_productoPreciosComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_unitarioPreciosComprasBusqueda")) {
				this.jButtoncosto_unitarioPreciosComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_productoPreciosComprasBusqueda")) {
				this.jButtoncodigo_productoPreciosComprasBusquedaActionPerformed(evt);
			}
			
			PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPreciosCompras();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePreciosCompras")) {
				closingInternalFramePreciosCompras();
				
			} else if(sTipo.equals("jButtonCancelarPreciosCompras")) {
				JInternalFrameBase jInternalFrameDetalleFormPreciosCompras = (JInternalFrameBase)evt.getSource();
	            	
	            PreciosComprasBeanSwingJInternalFrame jInternalFrameParent=(PreciosComprasBeanSwingJInternalFrame)jInternalFrameDetalleFormPreciosCompras.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPreciosComprasActionPerformed(null);
			}
			
			PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.precioscompras,new Object(),this.precioscomprasParameterGeneral,this.precioscomprasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPreciosCompras(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPreciosCompras(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPreciosCompras(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.precioscompras)) {
			if(!esControlTabla) {
				if(PreciosComprasJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPreciosCompras(this.precioscompras,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);			
				}
				
				if(this.precioscomprasSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPreciosCompras(this.precioscompras,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPreciosCompras(this.precioscomprasReturnGeneral,this.precioscomprasBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.precioscomprasSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPreciosCompras(classes,this.precioscomprasReturnGeneral,this.precioscomprasBean,false);
					}
						
					if(this.precioscomprasReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPreciosCompras(this.precioscomprasReturnGeneral.getPreciosCompras());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPreciosCompras(this.precioscomprasReturnGeneral.getPreciosCompras());	
					}
						
					if(this.precioscomprasReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPreciosCompras(this.precioscomprasReturnGeneral.getPreciosCompras(),classes);//this.precioscomprasBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPreciosCompras(this.precioscompras,classes);//this.precioscomprasBean);									
				}
			
				if(PreciosComprasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPreciosCompras(this.precioscompras,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPreciosCompras(this.precioscompras);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.precioscomprasAnterior!=null) {
						this.precioscompras=this.precioscomprasAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.precioscomprasSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.precioscomprasSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.precioscomprasReturnGeneral.getPreciosCompras(),precioscomprasLogic.getPreciosComprass());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.precioscomprasReturnGeneral.getPreciosCompras(),this.precioscomprass);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPreciosCompras.repaint();
				
				//((AbstractTableModel) this.jTableDatosPreciosCompras.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPreciosCompras();
			}
		}
	}
	
	public void actualizarVisualTableDatosPreciosCompras() throws Exception {
		
		PreciosComprasModel precioscomprasModel=(PreciosComprasModel)this.jTableDatosPreciosCompras.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			precioscomprasModel.precioscomprass=this.precioscomprasLogic.getPreciosComprass();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			precioscomprasModel.precioscomprass=this.precioscomprass;
		}
		
		
		((PreciosComprasModel) this.jTableDatosPreciosCompras.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPreciosCompras() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprecioscomprasAnterior(),this.precioscomprasLogic.getPreciosComprass());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprecioscomprasAnterior(),this.precioscomprass);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPreciosCompras();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPreciosCompras(PreciosCompras precioscompras,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
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
										
				PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.precioscompras,new Object(),generalEntityParameterGeneral,this.precioscomprasReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.precioscomprasSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PreciosComprasConstantesFunciones.getClassesRelationshipsOfPreciosCompras(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PreciosComprasConstantesFunciones.getClassesRelationshipsFromStringsOfPreciosCompras(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPreciosCompras(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PreciosComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.precioscompras,new Object(),generalEntityParameterGeneral,this.precioscomprasReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPreciosCompras(PreciosComprasBean precioscomprasBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPreciosCompras(ArrayList<Classe> classes,PreciosComprasReturnGeneral precioscomprasReturnGeneral,PreciosComprasBean precioscomprasBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPreciosCompras(PreciosCompras precioscompras,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.precioscompras)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPreciosCompras = new PreciosComprasDetalleFormJInternalFrame(jDesktopPane,this.precioscomprasSessionBean.getConGuardarRelaciones(),this.precioscomprasSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.setVisible(false);
		this.jInternalFrameDetalleFormPreciosCompras.setSelected(false);						
		
		this.jInternalFrameDetalleFormPreciosCompras.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPreciosCompras.precioscomprasLogic=this.precioscomprasLogic;
		
		this.cargarCombosFrameForeignKeyPreciosCompras("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePreciosCompras();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePreciosCompras();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPreciosCompras("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPreciosCompras();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPreciosCompras.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPreciosCompras"));
		
		this.jInternalFrameDetalleFormPreciosCompras.jButtonModificarPreciosCompras.addActionListener(new ButtonActionListener(this,"ModificarPreciosCompras"));

		
		this.jInternalFrameDetalleFormPreciosCompras.jButtonModificarToolBarPreciosCompras.addActionListener(new ButtonActionListener(this,"ModificarToolBarPreciosCompras"));
					
		this.jInternalFrameDetalleFormPreciosCompras.jMenuItemModificarPreciosCompras.addActionListener(new ButtonActionListener(this,"MenuItemModificarPreciosCompras"));		
		
		
		
		this.jInternalFrameDetalleFormPreciosCompras.jButtonActualizarPreciosCompras.addActionListener (new ButtonActionListener(this,"ActualizarPreciosCompras"));
		
		
		this.jInternalFrameDetalleFormPreciosCompras.jButtonActualizarToolBarPreciosCompras.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPreciosCompras"));
						
		this.jInternalFrameDetalleFormPreciosCompras.jMenuItemActualizarPreciosCompras.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPreciosCompras"));		
		
		
		
		this.jInternalFrameDetalleFormPreciosCompras.jButtonEliminarPreciosCompras.addActionListener (new ButtonActionListener(this,"EliminarPreciosCompras"));
		
		
		this.jInternalFrameDetalleFormPreciosCompras.jButtonEliminarToolBarPreciosCompras.addActionListener (new ButtonActionListener(this,"EliminarToolBarPreciosCompras"));
								
		this.jInternalFrameDetalleFormPreciosCompras.jMenuItemEliminarPreciosCompras.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPreciosCompras"));		
		
		
		
		this.jInternalFrameDetalleFormPreciosCompras.jButtonCancelarPreciosCompras.addActionListener (new ButtonActionListener(this,"CancelarPreciosCompras"));
		
		
		this.jInternalFrameDetalleFormPreciosCompras.jButtonCancelarToolBarPreciosCompras.addActionListener (new ButtonActionListener(this,"CancelarToolBarPreciosCompras"));
					
		this.jInternalFrameDetalleFormPreciosCompras.jMenuItemCancelarPreciosCompras.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPreciosCompras"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPreciosCompras.jMenuItemDetalleCerrarPreciosCompras.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPreciosCompras"));		
		
		
		
		this.jInternalFrameDetalleFormPreciosCompras.jButtonGuardarCambiosToolBarPreciosCompras.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPreciosCompras"));
		
		
		
		this.jInternalFrameDetalleFormPreciosCompras.jButtonGuardarCambiosToolBarPreciosCompras.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPreciosCompras"));
		
		
		
		this.jInternalFrameDetalleFormPreciosCompras.jComboBoxTiposAccionesFormularioPreciosCompras.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPreciosCompras"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonidPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"idPreciosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_empresaPreciosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPreciosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_empresaPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPreciosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_sucursalPreciosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPreciosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_sucursalPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPreciosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_bodegaPreciosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaPreciosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_bodegaPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaPreciosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_productoPreciosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_productoPreciosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_productoPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_productoPreciosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_transaccionPreciosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_transaccionPreciosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_transaccionPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccionPreciosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_lineaPreciosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_lineaPreciosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_lineaPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaPreciosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_linea_grupoPreciosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoPreciosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_linea_grupoPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoPreciosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_linea_categoriaPreciosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaPreciosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_linea_categoriaPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaPreciosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_linea_marcaPreciosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaPreciosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_linea_marcaPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaPreciosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonfecha_emision_desdePreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdePreciosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonfecha_emision_hastaPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaPreciosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonnombre_completo_clientePreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clientePreciosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonnumero_comprobantePreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobantePreciosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonfecha_emisionPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionPreciosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonnombre_productoPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoPreciosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtoncosto_unitarioPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"costo_unitarioPreciosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtoncodigo_productoPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoPreciosComprasBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPreciosCompras.jTabbedPaneRelacionesPreciosCompras.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPreciosCompras"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePreciosCompras"));
		
		if(this.jInternalFrameDetalleFormPreciosCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreciosCompras.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPreciosCompras"));
		}
		
		this.jTableDatosPreciosCompras.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPreciosCompras"));
		
		this.jTableDatosPreciosCompras.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPreciosCompras"));
		
		this.jButtonNuevoPreciosCompras.addActionListener(new ButtonActionListener(this,"NuevoPreciosCompras"));
		
		this.jButtonDuplicarPreciosCompras.addActionListener(new ButtonActionListener(this,"DuplicarPreciosCompras"));
		
		this.jButtonCopiarPreciosCompras.addActionListener(new ButtonActionListener(this,"CopiarPreciosCompras"));
		
		this.jButtonVerFormPreciosCompras.addActionListener(new ButtonActionListener(this,"VerFormPreciosCompras"));
		
		
		this.jButtonNuevoToolBarPreciosCompras.addActionListener(new ButtonActionListener(this,"NuevoToolBarPreciosCompras"));
			
		this.jButtonDuplicarToolBarPreciosCompras.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPreciosCompras"));
			
		this.jMenuItemNuevoPreciosCompras.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPreciosCompras"));
			
		this.jMenuItemDuplicarPreciosCompras.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPreciosCompras"));		
		
		
		this.jButtonNuevoRelacionesPreciosCompras.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPreciosCompras"));
		
		
		this.jButtonNuevoRelacionesToolBarPreciosCompras.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPreciosCompras"));
			
		this.jMenuItemNuevoRelacionesPreciosCompras.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPreciosCompras"));		
		
		
		if(this.jInternalFrameDetalleFormPreciosCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreciosCompras.jButtonModificarPreciosCompras.addActionListener(new ButtonActionListener(this,"ModificarPreciosCompras"));
		}
		
		
		if(this.jInternalFrameDetalleFormPreciosCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreciosCompras.jButtonModificarToolBarPreciosCompras.addActionListener(new ButtonActionListener(this,"ModificarToolBarPreciosCompras"));
			
			this.jInternalFrameDetalleFormPreciosCompras.jMenuItemModificarPreciosCompras.addActionListener(new ButtonActionListener(this,"MenuItemModificarPreciosCompras"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPreciosCompras!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPreciosCompras.jButtonActualizarPreciosCompras.addActionListener (new ButtonActionListener(this,"ActualizarPreciosCompras"));
		}
		
		
		if(this.jInternalFrameDetalleFormPreciosCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreciosCompras.jButtonActualizarToolBarPreciosCompras.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPreciosCompras"));
				
			this.jInternalFrameDetalleFormPreciosCompras.jMenuItemActualizarPreciosCompras.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPreciosCompras"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPreciosCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreciosCompras.jButtonEliminarPreciosCompras.addActionListener (new ButtonActionListener(this,"EliminarPreciosCompras"));
		}
		
		
		if(this.jInternalFrameDetalleFormPreciosCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreciosCompras.jButtonEliminarToolBarPreciosCompras.addActionListener (new ButtonActionListener(this,"EliminarToolBarPreciosCompras"));
						
			this.jInternalFrameDetalleFormPreciosCompras.jMenuItemEliminarPreciosCompras.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPreciosCompras"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPreciosCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreciosCompras.jButtonCancelarPreciosCompras.addActionListener (new ButtonActionListener(this,"CancelarPreciosCompras"));
		}
		
		
		if(this.jInternalFrameDetalleFormPreciosCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreciosCompras.jButtonCancelarToolBarPreciosCompras.addActionListener (new ButtonActionListener(this,"CancelarToolBarPreciosCompras"));
			
			this.jInternalFrameDetalleFormPreciosCompras.jMenuItemCancelarPreciosCompras.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPreciosCompras"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPreciosCompras.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPreciosCompras"));		
		
		
		this.jButtonCerrarPreciosCompras.addActionListener (new ButtonActionListener(this,"CerrarPreciosCompras"));
		
		
		this.jButtonCerrarToolBarPreciosCompras.addActionListener (new ButtonActionListener(this,"CerrarToolBarPreciosCompras"));
			
		this.jMenuItemCerrarPreciosCompras.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPreciosCompras"));
			
		if(this.jInternalFrameDetalleFormPreciosCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreciosCompras.jMenuItemDetalleCerrarPreciosCompras.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPreciosCompras"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPreciosCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreciosCompras.jButtonGuardarCambiosPreciosCompras.addActionListener (new ButtonActionListener(this,"GuardarCambiosPreciosCompras"));
		}
		
		
		if(this.jInternalFrameDetalleFormPreciosCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreciosCompras.jButtonGuardarCambiosToolBarPreciosCompras.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPreciosCompras"));
		}
		
		this.jButtonCopiarToolBarPreciosCompras.addActionListener (new ButtonActionListener(this,"CopiarToolBarPreciosCompras"));
			
		this.jButtonVerFormToolBarPreciosCompras.addActionListener (new ButtonActionListener(this,"VerFormToolBarPreciosCompras"));
		
		this.jMenuItemGuardarCambiosPreciosCompras.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPreciosCompras"));
			
		this.jMenuItemCopiarPreciosCompras.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPreciosCompras"));		
		
		this.jMenuItemVerFormPreciosCompras.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPreciosCompras"));		
		
		
		this.jButtonGuardarCambiosTablaPreciosCompras.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPreciosCompras"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPreciosCompras.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPreciosCompras"));
			
		this.jMenuItemGuardarCambiosTablaPreciosCompras.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPreciosCompras"));		
		
		
		
		this.jButtonRecargarInformacionPreciosCompras.addActionListener (new ButtonActionListener(this,"RecargarInformacionPreciosCompras"));
					
		this.jButtonRecargarInformacionToolBarPreciosCompras.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPreciosCompras"));
		
		this.jMenuItemRecargarInformacionPreciosCompras.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPreciosCompras"));		
		
		
		
		this.jButtonAnterioresPreciosCompras.addActionListener (new ButtonActionListener(this,"AnterioresPreciosCompras"));
		
		
		this.jButtonAnterioresToolBarPreciosCompras.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPreciosCompras"));
		
		this.jMenuItemAnterioresPreciosCompras.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPreciosCompras"));		
		
		
		this.jButtonSiguientesPreciosCompras.addActionListener (new ButtonActionListener(this,"SiguientesPreciosCompras"));
		
		
		this.jButtonSiguientesToolBarPreciosCompras.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPreciosCompras"));
			
		this.jMenuItemSiguientesPreciosCompras.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPreciosCompras"));
			
		this.jMenuItemAbrirOrderByPreciosCompras.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPreciosCompras"));
			
		this.jMenuItemMostrarOcultarPreciosCompras.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPreciosCompras"));
			
		this.jMenuItemDetalleAbrirOrderByPreciosCompras.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPreciosCompras"));
			
		this.jMenuItemDetalleMostarOcultarPreciosCompras.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPreciosCompras"));		
		
		
		this.jButtonNuevoGuardarCambiosPreciosCompras.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPreciosCompras"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPreciosCompras.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPreciosCompras"));
			
		this.jMenuItemNuevoGuardarCambiosPreciosCompras.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPreciosCompras"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPreciosCompras.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPreciosCompras"));

		this.jCheckBoxSeleccionadosPreciosCompras.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPreciosCompras"));
		
		if(this.jInternalFrameDetalleFormPreciosCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreciosCompras.jComboBoxTiposAccionesFormularioPreciosCompras.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPreciosCompras"));
		}
		
		
		this.jComboBoxTiposRelacionesPreciosCompras.addActionListener (new ButtonActionListener(this,"TiposRelacionesPreciosCompras"));
			
		this.jComboBoxTiposAccionesPreciosCompras.addActionListener (new ButtonActionListener(this,"TiposAccionesPreciosCompras"));
					
		this.jComboBoxTiposSeleccionarPreciosCompras.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPreciosCompras"));
			
		this.jTextFieldValorCampoGeneralPreciosCompras.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPreciosCompras"));		
		
		
		if(this.jInternalFrameDetalleFormPreciosCompras!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonidPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"idPreciosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_empresaPreciosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPreciosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_empresaPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPreciosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_sucursalPreciosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPreciosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_sucursalPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPreciosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_bodegaPreciosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaPreciosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_bodegaPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaPreciosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_productoPreciosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_productoPreciosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_productoPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_productoPreciosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_transaccionPreciosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_transaccionPreciosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_transaccionPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccionPreciosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_lineaPreciosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_lineaPreciosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_lineaPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaPreciosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_linea_grupoPreciosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoPreciosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_linea_grupoPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoPreciosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_linea_categoriaPreciosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaPreciosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_linea_categoriaPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaPreciosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_linea_marcaPreciosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaPreciosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_linea_marcaPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaPreciosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonfecha_emision_desdePreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdePreciosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonfecha_emision_hastaPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaPreciosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonnombre_completo_clientePreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clientePreciosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonnumero_comprobantePreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobantePreciosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonfecha_emisionPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionPreciosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonnombre_productoPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoPreciosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtoncosto_unitarioPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"costo_unitarioPreciosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtoncodigo_productoPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoPreciosComprasBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPreciosComprasPreciosCompras.addActionListener(new ButtonActionListener(this,"BusquedaPreciosComprasPreciosCompras"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPreciosCompras!=null) {
				this.jInternalFrameReporteDinamicoPreciosCompras.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPreciosCompras"));
				this.jInternalFrameReporteDinamicoPreciosCompras.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPreciosCompras"));
				this.jInternalFrameReporteDinamicoPreciosCompras.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPreciosCompras"));
			}
			
			//this.jButtonCerrarReporteDinamicoPreciosCompras.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPreciosCompras"));				
			//this.jButtonGenerarReporteDinamicoPreciosCompras.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPreciosCompras"));
			//this.jButtonGenerarExcelReporteDinamicoPreciosCompras.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPreciosCompras"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPreciosCompras!=null) {
				this.jInternalFrameImportacionPreciosCompras.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPreciosCompras"));
				this.jInternalFrameImportacionPreciosCompras.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPreciosCompras"));
				this.jInternalFrameImportacionPreciosCompras.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPreciosCompras"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPreciosCompras.addActionListener (new ButtonActionListener(this,"AbrirOrderByPreciosCompras"));
			
			this.jButtonAbrirOrderByToolBarPreciosCompras.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPreciosCompras"));			
			
			if(this.jInternalFrameOrderByPreciosCompras!=null) {
				this.jInternalFrameOrderByPreciosCompras.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPreciosCompras"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPreciosCompras!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPreciosCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreciosCompras.jTabbedPaneRelacionesPreciosCompras.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPreciosCompras"));
		
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
            		closingInternalFramePreciosCompras();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPreciosCompras.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPreciosCompras = (JInternalFrameBase)event.getSource();
	            	
	            PreciosComprasBeanSwingJInternalFrame jInternalFrameParent=(PreciosComprasBeanSwingJInternalFrame)jInternalFrameDetalleFormPreciosCompras.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPreciosComprasActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPreciosCompras.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPreciosComprasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPreciosCompras.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPreciosCompras.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPreciosComprasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPreciosComprasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPreciosComprasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPreciosCompras";
		inputMap = this.jButtonNuevoPreciosCompras.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPreciosCompras.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPreciosComprasActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPreciosComprasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPreciosComprasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPreciosComprasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPreciosCompras";
		inputMap = this.jButtonNuevoRelacionesPreciosCompras.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPreciosCompras.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPreciosComprasActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPreciosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPreciosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPreciosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPreciosCompras";
		inputMap = this.jButtonModificarPreciosCompras.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPreciosCompras.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPreciosComprasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPreciosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPreciosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPreciosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPreciosCompras";
		inputMap = this.jButtonActualizarPreciosCompras.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPreciosCompras.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPreciosComprasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPreciosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPreciosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPreciosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPreciosCompras";
		inputMap = this.jButtonEliminarPreciosCompras.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPreciosCompras.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPreciosComprasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPreciosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPreciosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPreciosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPreciosCompras";
		inputMap = this.jButtonCancelarPreciosCompras.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPreciosCompras.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPreciosComprasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPreciosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPreciosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPreciosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPreciosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPreciosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPreciosCompras";
		inputMap = this.jButtonCerrarPreciosCompras.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPreciosCompras.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPreciosComprasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPreciosCompras.jButtonGuardarCambiosPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPreciosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPreciosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPreciosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPreciosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPreciosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPreciosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPreciosCompras";
		inputMap = this.jInternalFrameDetalleFormPreciosCompras.jButtonGuardarCambiosPreciosCompras.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPreciosCompras.jButtonGuardarCambiosPreciosCompras.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPreciosComprasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPreciosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPreciosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPreciosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPreciosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPreciosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPreciosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPreciosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPreciosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPreciosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPreciosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPreciosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPreciosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPreciosCompras.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPreciosComprasItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPreciosCompras.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPreciosComprasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPreciosCompras.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPreciosComprasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPreciosCompras.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPreciosComprasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonidPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"idPreciosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_empresaPreciosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPreciosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_empresaPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPreciosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_sucursalPreciosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPreciosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_sucursalPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPreciosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_bodegaPreciosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaPreciosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_bodegaPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaPreciosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_productoPreciosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_productoPreciosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_productoPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_productoPreciosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_transaccionPreciosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_transaccionPreciosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_transaccionPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccionPreciosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_lineaPreciosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_lineaPreciosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_lineaPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaPreciosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_linea_grupoPreciosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoPreciosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_linea_grupoPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoPreciosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_linea_categoriaPreciosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaPreciosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_linea_categoriaPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaPreciosComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_linea_marcaPreciosComprasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaPreciosComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonid_linea_marcaPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaPreciosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonfecha_emision_desdePreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdePreciosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonfecha_emision_hastaPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaPreciosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonnombre_completo_clientePreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clientePreciosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonnumero_comprobantePreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobantePreciosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonfecha_emisionPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionPreciosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtonnombre_productoPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoPreciosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtoncosto_unitarioPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"costo_unitarioPreciosComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreciosCompras.jButtoncodigo_productoPreciosComprasBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoPreciosComprasBusqueda"));
		
		
		this.jButtonBusquedaPreciosComprasPreciosCompras.addActionListener(new ButtonActionListener(this,"BusquedaPreciosComprasPreciosCompras"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPreciosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPreciosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPreciosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPreciosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPreciosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPreciosCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPreciosComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPreciosComprasActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPreciosCompras.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPreciosCompras(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PreciosCompras precioscomprasAux:this.precioscomprasLogic.getPreciosComprass()) {
					precioscomprasAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PreciosCompras precioscomprasAux:precioscomprass) {
					precioscomprasAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPreciosComprasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPreciosCompras(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PreciosCompras precioscomprasAux:this.precioscomprasLogic.getPreciosComprass()) {
						precioscomprasAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PreciosCompras precioscomprasAux:precioscomprass) {
						precioscomprasAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PreciosCompras precioscomprasAux:this.precioscomprasLogic.getPreciosComprass()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PreciosCompras precioscomprasAux:precioscomprass) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPreciosCompras(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPreciosCompras.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPreciosCompras.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPreciosCompras,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPreciosComprasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPreciosCompras(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPreciosCompras.getSelectedRows();
			
			PreciosCompras precioscomprasLocal=new PreciosCompras();
			
			//this.seleccionarTodosPreciosCompras(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					precioscomprasLocal =(PreciosCompras) this.precioscomprasLogic.getPreciosComprass().toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					precioscomprasLocal =(PreciosCompras) this.precioscomprass.toArray()[this.jTableDatosPreciosCompras.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				precioscomprasLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PreciosCompras precioscomprasAux:this.precioscomprasLogic.getPreciosComprass()) {
						precioscomprasAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PreciosCompras precioscomprasAux:precioscomprass) {
						precioscomprasAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPreciosCompras(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPreciosCompras.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPreciosCompras.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPreciosCompras,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPreciosComprasItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPreciosComprasParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPreciosComprasActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPreciosCompras(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPreciosCompras.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PreciosCompras precioscomprasAux:this.precioscomprasLogic.getPreciosComprass()) {
				
						if(sTipoSeleccionar.equals(PreciosComprasConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							precioscomprasAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PreciosComprasConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							precioscomprasAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PreciosComprasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							precioscomprasAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PreciosComprasConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
							existe=true;
							precioscomprasAux.setnumero_comprobante(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PreciosComprasConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							precioscomprasAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PreciosComprasConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							precioscomprasAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PreciosComprasConstantesFunciones.LABEL_COSTOUNITARIO)) {
							existe=true;
							precioscomprasAux.setcosto_unitario(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PreciosComprasConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
							existe=true;
							precioscomprasAux.setcodigo_producto(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PreciosCompras precioscomprasAux:precioscomprass) {
					
						if(sTipoSeleccionar.equals(PreciosComprasConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							precioscomprasAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PreciosComprasConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							precioscomprasAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PreciosComprasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							precioscomprasAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PreciosComprasConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
							existe=true;
							precioscomprasAux.setnumero_comprobante(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PreciosComprasConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							precioscomprasAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PreciosComprasConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							precioscomprasAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PreciosComprasConstantesFunciones.LABEL_COSTOUNITARIO)) {
							existe=true;
							precioscomprasAux.setcosto_unitario(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PreciosComprasConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
							existe=true;
							precioscomprasAux.setcodigo_producto(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPreciosCompras(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPreciosComprasActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPreciosCompras(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPreciosCompras=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPreciosCompras.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPreciosCompras.jComboBoxTiposAccionesFormularioPreciosCompras.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePreciosCompras) {				
					conSplash=true;//false;										
					
					//this.startProcessPreciosCompras(conSplash);
				
					this.generarReportePreciosComprassSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPreciosCompras.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPreciosCompras.jComboBoxTiposAccionesFormularioPreciosCompras.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPreciosComprassSeleccionados();
				//this.jComboBoxTiposAccionesPreciosCompras.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPreciosComprassSeleccionados(false);
				//this.jComboBoxTiposAccionesPreciosCompras.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPreciosComprassSeleccionados(true);
				//this.jComboBoxTiposAccionesPreciosCompras.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPreciosCompras();
				
				this.exportarPreciosComprassSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPreciosCompras.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPreciosCompras.jComboBoxTiposAccionesFormularioPreciosCompras.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPreciosComprass();
				//this.importarPreciosComprass();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPreciosCompras.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPreciosCompras.jComboBoxTiposAccionesFormularioPreciosCompras.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPreciosCompras();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPreciosComprassSeleccionados();
				//this.jComboBoxTiposAccionesPreciosCompras.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Precios Compras", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPreciosCompras();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPreciosCompras)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPreciosCompras(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Precios Compras",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPreciosCompras.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPreciosCompras.jComboBoxTiposAccionesFormularioPreciosCompras.setSelectedIndex(0);					
				}	
			} 			
			else if(PreciosComprasBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePreciosCompras) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPreciosCompras(conSplash);
					
						//this.actualizarParametrosGeneralPreciosCompras();
						
						this.generarReporteProcesoAccionPreciosComprassSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPreciosCompras.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPreciosCompras.jComboBoxTiposAccionesFormularioPreciosCompras.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PreciosComprasBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Precios ComprasES SELECCIONADOS?", "MANTENIMIENTO DE Precios Compras", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPreciosCompras();
				
						this.actualizarParametrosGeneralPreciosCompras();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.precioscomprasReturnGeneral=precioscomprasLogic.procesarAccionPreciosComprassWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.precioscomprasLogic.getPreciosComprass(),this.precioscomprasParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPreciosComprasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPreciosCompras.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPreciosCompras.jComboBoxTiposAccionesFormularioPreciosCompras.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPreciosCompras();
					
					PreciosComprasBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPreciosComprasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPreciosCompras.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPreciosCompras.jComboBoxTiposAccionesFormularioPreciosCompras.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPreciosCompras(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPreciosComprasActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPreciosCompras();
			
			if(this.jInternalFrameDetalleFormPreciosCompras==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PreciosCompras> precioscomprassSeleccionados=new ArrayList<PreciosCompras>();		
			PreciosCompras precioscompras=new PreciosCompras();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPreciosCompras(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPreciosCompras.getSelectedItem();
			
			
			
			
			precioscomprassSeleccionados=this.getPreciosComprassSeleccionados(true);
			//this.sTipoAccion;
			
			if(precioscomprassSeleccionados.size()==1) {
				for(PreciosCompras precioscomprasAux:precioscomprassSeleccionados) {
					precioscompras=precioscomprasAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPreciosCompras();
			
      		//this.finishProcessPreciosCompras(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPreciosComprasReturnGeneral() throws Exception {
		if(this.precioscomprasReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.precioscomprasReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.precioscomprasReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.precioscomprasReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.precioscomprasReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.precioscomprasReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPreciosCompras(false);
		}
		
		if(this.precioscomprasReturnGeneral.getConRetornoLista() || this.precioscomprasReturnGeneral.getConRetornoObjeto()) {
			if(this.precioscomprasReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.precioscomprasLogic.setPreciosComprass(this.precioscomprasReturnGeneral.getPreciosComprass());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingPreciosCompras(false);
		}
	}
	
	public void actualizarParametrosGeneralPreciosCompras() throws Exception {
		
		
	}
	
	public ArrayList<PreciosCompras> getPreciosComprassSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PreciosCompras> precioscomprassSeleccionados=new ArrayList<PreciosCompras>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPreciosCompras) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PreciosCompras precioscomprasAux:precioscomprasLogic.getPreciosComprass()) {
					if(precioscomprasAux.getIsSelected()) {
						precioscomprassSeleccionados.add(precioscomprasAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PreciosCompras precioscomprasAux:this.precioscomprass) {
					if(precioscomprasAux.getIsSelected()) {
						precioscomprassSeleccionados.add(precioscomprasAux);				
					}
				}
			}
			
			if(precioscomprassSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						precioscomprassSeleccionados.addAll(this.precioscomprasLogic.getPreciosComprass());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						precioscomprassSeleccionados.addAll(this.precioscomprass);				
					}
				}
			}
		} else {
			precioscomprassSeleccionados.add(this.precioscompras);
		}
		
		return precioscomprassSeleccionados;
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
	
	public void generarReportePreciosComprassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPreciosComprassSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPreciosComprassSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPreciosComprassSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPreciosComprassSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Precios Compras",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPreciosComprassSeleccionados() throws Exception {
		ArrayList<PreciosCompras> precioscomprassSeleccionados=new ArrayList<PreciosCompras>();		
		
		precioscomprassSeleccionados=this.getPreciosComprassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePreciosComprass("Todos",precioscomprassSeleccionados);
		
	}	
	
	public void generarReporteNormalPreciosComprassSeleccionados() throws Exception {
		ArrayList<PreciosCompras> precioscomprassSeleccionados=new ArrayList<PreciosCompras>();		
		
		precioscomprassSeleccionados=this.getPreciosComprassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePreciosComprass("Todos",precioscomprassSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPreciosComprassSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PreciosCompras> precioscomprassSeleccionados=new ArrayList<PreciosCompras>();
		
		precioscomprassSeleccionados=this.getPreciosComprassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePreciosComprass("Todos",precioscomprassSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPreciosComprassSeleccionados() throws Exception {
		ArrayList<PreciosCompras> precioscomprassSeleccionados=new ArrayList<PreciosCompras>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPreciosCompras();
		
		
		precioscomprassSeleccionados=this.getPreciosComprassSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPreciosCompras();
		
		
		//this.generarReportePreciosComprass("Todos",precioscomprassSeleccionados ,precioscomprasImplementable,precioscomprasImplementableHome);
	}
	
	public void mostrarImportacionPreciosComprass() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPreciosCompras();
		
		this.abrirFrameImportacionPreciosCompras();		
		
			
		//this.generarReportePreciosComprass("Todos",precioscomprassSeleccionados ,precioscomprasImplementable,precioscomprasImplementableHome);
	}
	
	public void importarPreciosComprass() throws Exception {		
	
	}
	
	public void exportarPreciosComprassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPreciosComprassSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPreciosComprassSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPreciosComprassSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Precios Compras",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPreciosComprassSeleccionados() throws Exception {
		ArrayList<PreciosCompras> precioscomprassSeleccionados=new ArrayList<PreciosCompras>();		
		
		precioscomprassSeleccionados=this.getPreciosComprassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"precioscompras."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPreciosCompras(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PreciosCompras precioscomprasAux:precioscomprassSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPreciosCompras(precioscomprasAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//precioscomprasAux.setsDetalleGeneralEntityReporte(precioscomprasAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.precioscomprasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Precios Compras",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPreciosCompras(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PreciosComprasConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreciosComprasConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreciosComprasConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreciosComprasConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreciosComprasConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreciosComprasConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreciosComprasConstantesFunciones.LABEL_IDTRANSACCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreciosComprasConstantesFunciones.LABEL_IDLINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreciosComprasConstantesFunciones.LABEL_IDLINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreciosComprasConstantesFunciones.LABEL_IDLINEACATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreciosComprasConstantesFunciones.LABEL_IDLINEAMARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreciosComprasConstantesFunciones.LABEL_FECHAEMISIONDESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreciosComprasConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreciosComprasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreciosComprasConstantesFunciones.LABEL_NUMEROCOMPROBANTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreciosComprasConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreciosComprasConstantesFunciones.LABEL_NOMBREPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreciosComprasConstantesFunciones.LABEL_COSTOUNITARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreciosComprasConstantesFunciones.LABEL_CODIGOPRODUCTO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPreciosCompras(PreciosCompras precioscompras,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=precioscompras.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=precioscompras.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=precioscompras.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=precioscompras.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=precioscompras.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=precioscompras.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=precioscompras.gettransaccion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=precioscompras.getlinea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=precioscompras.getlineagrupo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=precioscompras.getlineacategoria_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=precioscompras.getlineamarca_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=precioscompras.getfecha_emision_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=precioscompras.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=precioscompras.getnombre_completo_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=precioscompras.getnumero_comprobante();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=precioscompras.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=precioscompras.getnombre_producto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=precioscompras.getcosto_unitario().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=precioscompras.getcodigo_producto();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPreciosComprassSeleccionados() throws Exception {
		ArrayList<PreciosCompras> precioscomprassSeleccionados=new ArrayList<PreciosCompras>();		
		
		precioscomprassSeleccionados=this.getPreciosComprassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"precioscompras.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PreciosComprass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPreciosCompras(row);				
				iRow++;
			}				
			
			for(PreciosCompras precioscomprasAux:precioscomprassSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPreciosCompras(precioscomprasAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.precioscomprasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Precios Compras",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPreciosComprassSeleccionados() throws Exception {
		ArrayList<PreciosCompras> precioscomprassSeleccionados=new ArrayList<PreciosCompras>();		
		
		precioscomprassSeleccionados=this.getPreciosComprassSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"precioscompras.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("precioscomprass");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("precioscompras");
			//elementRoot.appendChild(element);
		
			for(PreciosCompras precioscomprasAux:precioscomprassSeleccionados) {
				element = document.createElement("precioscompras");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPreciosCompras(precioscomprasAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.precioscomprasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Precios Compras",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPreciosCompras(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_IDTRANSACCION);
		cell = row.createCell(iColumn++);cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_IDLINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_IDLINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_IDLINEACATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_IDLINEAMARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		cell = row.createCell(iColumn++);cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_NOMBREPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_COSTOUNITARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(PreciosComprasConstantesFunciones.LABEL_CODIGOPRODUCTO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPreciosCompras(PreciosCompras precioscompras,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(precioscompras.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(precioscompras.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(precioscompras.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(precioscompras.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(precioscompras.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(precioscompras.gettransaccion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(precioscompras.getlinea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(precioscompras.getlineagrupo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(precioscompras.getlineacategoria_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(precioscompras.getlineamarca_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(precioscompras.getfecha_emision_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(precioscompras.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(precioscompras.getnombre_completo_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(precioscompras.getnumero_comprobante());
		cell = row.createCell(iColumn++);cell.setCellValue(precioscompras.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(precioscompras.getnombre_producto());
		cell = row.createCell(iColumn++);cell.setCellValue(precioscompras.getcosto_unitario());
		cell = row.createCell(iColumn++);cell.setCellValue(precioscompras.getcodigo_producto());				
	}
	
	public void setFilaDatosExportarXmlPreciosCompras(PreciosCompras precioscompras,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PreciosComprasConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(precioscompras.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PreciosComprasConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(precioscompras.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(PreciosComprasConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(precioscompras.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(PreciosComprasConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(precioscompras.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementbodega_descripcion = document.createElement(PreciosComprasConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(precioscompras.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementproducto_descripcion = document.createElement(PreciosComprasConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(precioscompras.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementtransaccion_descripcion = document.createElement(PreciosComprasConstantesFunciones.IDTRANSACCION);
		elementtransaccion_descripcion.appendChild(document.createTextNode(precioscompras.gettransaccion_descripcion()));
		element.appendChild(elementtransaccion_descripcion);

		Element elementlinea_descripcion = document.createElement(PreciosComprasConstantesFunciones.IDLINEA);
		elementlinea_descripcion.appendChild(document.createTextNode(precioscompras.getlinea_descripcion()));
		element.appendChild(elementlinea_descripcion);

		Element elementlineagrupo_descripcion = document.createElement(PreciosComprasConstantesFunciones.IDLINEAGRUPO);
		elementlineagrupo_descripcion.appendChild(document.createTextNode(precioscompras.getlineagrupo_descripcion()));
		element.appendChild(elementlineagrupo_descripcion);

		Element elementlineacategoria_descripcion = document.createElement(PreciosComprasConstantesFunciones.IDLINEACATEGORIA);
		elementlineacategoria_descripcion.appendChild(document.createTextNode(precioscompras.getlineacategoria_descripcion()));
		element.appendChild(elementlineacategoria_descripcion);

		Element elementlineamarca_descripcion = document.createElement(PreciosComprasConstantesFunciones.IDLINEAMARCA);
		elementlineamarca_descripcion.appendChild(document.createTextNode(precioscompras.getlineamarca_descripcion()));
		element.appendChild(elementlineamarca_descripcion);

		Element elementfecha_emision_desde = document.createElement(PreciosComprasConstantesFunciones.FECHAEMISIONDESDE);
		elementfecha_emision_desde.appendChild(document.createTextNode(precioscompras.getfecha_emision_desde().toString().trim()));
		element.appendChild(elementfecha_emision_desde);

		Element elementfecha_emision_hasta = document.createElement(PreciosComprasConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(precioscompras.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementnombre_completo_cliente = document.createElement(PreciosComprasConstantesFunciones.NOMBRECOMPLETOCLIENTE);
		elementnombre_completo_cliente.appendChild(document.createTextNode(precioscompras.getnombre_completo_cliente().trim()));
		element.appendChild(elementnombre_completo_cliente);

		Element elementnumero_comprobante = document.createElement(PreciosComprasConstantesFunciones.NUMEROCOMPROBANTE);
		elementnumero_comprobante.appendChild(document.createTextNode(precioscompras.getnumero_comprobante().trim()));
		element.appendChild(elementnumero_comprobante);

		Element elementfecha_emision = document.createElement(PreciosComprasConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(precioscompras.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementnombre_producto = document.createElement(PreciosComprasConstantesFunciones.NOMBREPRODUCTO);
		elementnombre_producto.appendChild(document.createTextNode(precioscompras.getnombre_producto().trim()));
		element.appendChild(elementnombre_producto);

		Element elementcosto_unitario = document.createElement(PreciosComprasConstantesFunciones.COSTOUNITARIO);
		elementcosto_unitario.appendChild(document.createTextNode(precioscompras.getcosto_unitario().toString().trim()));
		element.appendChild(elementcosto_unitario);

		Element elementcodigo_producto = document.createElement(PreciosComprasConstantesFunciones.CODIGOPRODUCTO);
		elementcodigo_producto.appendChild(document.createTextNode(precioscompras.getcodigo_producto().trim()));
		element.appendChild(elementcodigo_producto);
	}
	
	public void generarReporteGroupGenericoPreciosComprassSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PreciosCompras> precioscomprassSeleccionados=new ArrayList<PreciosCompras>();
		
		precioscomprassSeleccionados=this.getPreciosComprassSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPreciosCompras(precioscomprassSeleccionados);
		
		this.generarReportePreciosComprass("Todos",precioscomprassSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPreciosCompras(ArrayList<PreciosCompras> precioscomprassSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PreciosCompras precioscomprasAux:precioscomprassSeleccionados) {
				precioscomprasAux.setsDetalleGeneralEntityReporte(precioscomprasAux.toString());
			
				if(sTipoSeleccionar.equals(PreciosComprasConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					precioscomprasAux.setsDescripcionGeneralEntityReporte1(precioscomprasAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PreciosComprasConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					precioscomprasAux.setsDescripcionGeneralEntityReporte1(precioscomprasAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PreciosComprasConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					precioscomprasAux.setsDescripcionGeneralEntityReporte1(precioscomprasAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PreciosComprasConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					precioscomprasAux.setsDescripcionGeneralEntityReporte1(precioscomprasAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PreciosComprasConstantesFunciones.LABEL_IDTRANSACCION)) {
					existe=true;
					precioscomprasAux.setsDescripcionGeneralEntityReporte1(precioscomprasAux.gettransaccion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PreciosComprasConstantesFunciones.LABEL_IDLINEA)) {
					existe=true;
					precioscomprasAux.setsDescripcionGeneralEntityReporte1(precioscomprasAux.getlinea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PreciosComprasConstantesFunciones.LABEL_IDLINEAGRUPO)) {
					existe=true;
					precioscomprasAux.setsDescripcionGeneralEntityReporte1(precioscomprasAux.getlineagrupo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PreciosComprasConstantesFunciones.LABEL_IDLINEACATEGORIA)) {
					existe=true;
					precioscomprasAux.setsDescripcionGeneralEntityReporte1(precioscomprasAux.getlineacategoria_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PreciosComprasConstantesFunciones.LABEL_IDLINEAMARCA)) {
					existe=true;
					precioscomprasAux.setsDescripcionGeneralEntityReporte1(precioscomprasAux.getlineamarca_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PreciosComprasConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
					existe=true;
					precioscomprasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(precioscomprasAux.getfecha_emision_desde()));
				}
				 else if(sTipoSeleccionar.equals(PreciosComprasConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					precioscomprasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(precioscomprasAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(PreciosComprasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
					existe=true;
					precioscomprasAux.setsDescripcionGeneralEntityReporte1(precioscomprasAux.getnombre_completo_cliente());
				}
				 else if(sTipoSeleccionar.equals(PreciosComprasConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
					existe=true;
					precioscomprasAux.setsDescripcionGeneralEntityReporte1(precioscomprasAux.getnumero_comprobante());
				}
				 else if(sTipoSeleccionar.equals(PreciosComprasConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					precioscomprasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(precioscomprasAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(PreciosComprasConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
					existe=true;
					precioscomprasAux.setsDescripcionGeneralEntityReporte1(precioscomprasAux.getnombre_producto());
				}
				 else if(sTipoSeleccionar.equals(PreciosComprasConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
					existe=true;
					precioscomprasAux.setsDescripcionGeneralEntityReporte1(precioscomprasAux.getcodigo_producto());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreciosComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPreciosCompras(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPreciosCompras=true;
				this.isVisibilidadCeldaNuevoRelacionesPreciosCompras=true;
				this.isVisibilidadCeldaGuardarCambiosPreciosCompras=true;
			}
			
			this.isVisibilidadCeldaModificarPreciosCompras=false;
			this.isVisibilidadCeldaActualizarPreciosCompras=false;
			this.isVisibilidadCeldaEliminarPreciosCompras=false;
			this.isVisibilidadCeldaCancelarPreciosCompras=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPreciosCompras=true;
				} else {
					this.isVisibilidadCeldaGuardarPreciosCompras=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPreciosCompras=false;
			this.isVisibilidadCeldaNuevoRelacionesPreciosCompras=false;
			this.isVisibilidadCeldaGuardarCambiosPreciosCompras=false;
			this.isVisibilidadCeldaModificarPreciosCompras=false;
			this.isVisibilidadCeldaActualizarPreciosCompras=true;
			this.isVisibilidadCeldaEliminarPreciosCompras=false;
			this.isVisibilidadCeldaCancelarPreciosCompras=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPreciosCompras=true;
				} else {
					this.isVisibilidadCeldaGuardarPreciosCompras=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPreciosCompras=false;
			this.isVisibilidadCeldaNuevoRelacionesPreciosCompras=false;
			this.isVisibilidadCeldaGuardarCambiosPreciosCompras=false;
			this.isVisibilidadCeldaModificarPreciosCompras=false;
			this.isVisibilidadCeldaActualizarPreciosCompras=true;
			this.isVisibilidadCeldaEliminarPreciosCompras=true;
			this.isVisibilidadCeldaCancelarPreciosCompras=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPreciosCompras=true;
				} else {
					this.isVisibilidadCeldaGuardarPreciosCompras=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPreciosCompras=false;
			this.isVisibilidadCeldaNuevoRelacionesPreciosCompras=false;
			this.isVisibilidadCeldaGuardarCambiosPreciosCompras=false;
			this.isVisibilidadCeldaModificarPreciosCompras=false;
			this.isVisibilidadCeldaActualizarPreciosCompras=true;
			this.isVisibilidadCeldaEliminarPreciosCompras=false;
			this.isVisibilidadCeldaCancelarPreciosCompras=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPreciosCompras=false;
				} else {
					this.isVisibilidadCeldaGuardarPreciosCompras=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPreciosCompras=true;
			this.isVisibilidadCeldaNuevoRelacionesPreciosCompras=true;
			this.isVisibilidadCeldaGuardarCambiosPreciosCompras=true;
			this.isVisibilidadCeldaModificarPreciosCompras=false;
			this.isVisibilidadCeldaActualizarPreciosCompras=false;
			this.isVisibilidadCeldaEliminarPreciosCompras=false;
			this.isVisibilidadCeldaCancelarPreciosCompras=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPreciosCompras=true;
				} else {
					this.isVisibilidadCeldaGuardarPreciosCompras=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPreciosCompras=false;
			this.isVisibilidadCeldaNuevoRelacionesPreciosCompras=false;
			this.isVisibilidadCeldaGuardarCambiosPreciosCompras=false;
			this.isVisibilidadCeldaActualizarPreciosCompras=false;
			this.isVisibilidadCeldaEliminarPreciosCompras=false;
			this.isVisibilidadCeldaCancelarPreciosCompras=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPreciosCompras=false;
				} else {
					this.isVisibilidadCeldaGuardarPreciosCompras=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPreciosCompras=false;
			this.isVisibilidadCeldaNuevoRelacionesPreciosCompras=false;
			this.isVisibilidadCeldaGuardarCambiosPreciosCompras=false;
			this.isVisibilidadCeldaModificarPreciosCompras=true;
			this.isVisibilidadCeldaActualizarPreciosCompras=false;
			this.isVisibilidadCeldaEliminarPreciosCompras=false;
			this.isVisibilidadCeldaCancelarPreciosCompras=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPreciosCompras=false;
				} else {
					this.isVisibilidadCeldaGuardarPreciosCompras=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PreciosComprasJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPreciosCompras=true;
			this.isVisibilidadCeldaNuevoRelacionesPreciosCompras=true;
			this.isVisibilidadCeldaGuardarCambiosPreciosCompras=true;
		} else {
			this.actualizarEstadoPanelsPreciosCompras(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPreciosCompras=false;
			//this.isVisibilidadCeldaVerFormPreciosCompras=false;
			this.isVisibilidadCeldaDuplicarPreciosCompras=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!precioscomprasSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPreciosCompras=false;
		} else {
			this.isVisibilidadCeldaNuevoPreciosCompras=false;
			this.isVisibilidadCeldaGuardarCambiosPreciosCompras=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(precioscomprasSessionBean.getEsGuardarRelacionado()) {
			if(!precioscomprasSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPreciosCompras=false;												
			}
			
			this.jButtonCerrarPreciosCompras.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPreciosCompras=false;
		}
		
		if(!this.permiteMantenimiento(this.precioscompras)) {
			this.isVisibilidadCeldaActualizarPreciosCompras=false;
			this.isVisibilidadCeldaEliminarPreciosCompras=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoPreciosCompras=false;
		this.isVisibilidadCeldaNuevoRelacionesPreciosCompras=false;
		this.isVisibilidadCeldaGuardarCambiosPreciosCompras=false;
		//this.isVisibilidadCeldaModificarPreciosCompras=true;
		this.isVisibilidadCeldaActualizarPreciosCompras=false;
		this.isVisibilidadCeldaEliminarPreciosCompras=false;
		//this.isVisibilidadCeldaCancelarPreciosCompras=true;			
		this.isVisibilidadCeldaGuardarPreciosCompras=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPreciosCompras() {
	}
	
	public void actualizarEstadoPanelsPreciosCompras(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPreciosCompras!=null) {
				this.jScrollPanelDatosEdicionPreciosCompras.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPreciosCompras!=null) {
				this.jTabbedPaneBusquedasPreciosCompras.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPreciosCompras!=null) {
				this.jScrollPanelDatosPreciosCompras.setVisible(true);
			}
			
			if(this.jPanelPaginacionPreciosCompras!=null) {
				this.jPanelPaginacionPreciosCompras.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPreciosCompras!=null) {
				this.jPanelParametrosReportesPreciosCompras.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPreciosCompras!=null) {
				this.jScrollPanelDatosEdicionPreciosCompras.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPreciosCompras!=null) {
				this.jTabbedPaneBusquedasPreciosCompras.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPreciosCompras!=null) {
				this.jScrollPanelDatosPreciosCompras.setVisible(false);
			}
			
			if(this.jPanelPaginacionPreciosCompras!=null) {
				this.jPanelPaginacionPreciosCompras.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPreciosCompras!=null) {
				this.jPanelParametrosReportesPreciosCompras.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPreciosCompras!=null) {
				this.jScrollPanelDatosEdicionPreciosCompras.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPreciosCompras!=null) {
				this.jTabbedPaneBusquedasPreciosCompras.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPreciosCompras!=null) {
				this.jScrollPanelDatosPreciosCompras.setVisible(false);
			}
			
			if(this.jPanelPaginacionPreciosCompras!=null) {
				this.jPanelPaginacionPreciosCompras.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPreciosCompras!=null) {
				this.jPanelParametrosReportesPreciosCompras.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPreciosCompras!=null) {
				this.jScrollPanelDatosEdicionPreciosCompras.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPreciosCompras!=null) {
				this.jTabbedPaneBusquedasPreciosCompras.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPreciosCompras!=null) {
				this.jScrollPanelDatosPreciosCompras.setVisible(false);
			}
			
			if(this.jPanelPaginacionPreciosCompras!=null) {
				this.jPanelPaginacionPreciosCompras.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPreciosCompras!=null) {
				this.jPanelParametrosReportesPreciosCompras.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPreciosCompras!=null) {
				this.jScrollPanelDatosEdicionPreciosCompras.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPreciosCompras!=null) {
				this.jTabbedPaneBusquedasPreciosCompras.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPreciosCompras!=null) {
				this.jScrollPanelDatosPreciosCompras.setVisible(true);
			}
			
			if(this.jPanelPaginacionPreciosCompras!=null) {
				this.jPanelPaginacionPreciosCompras.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPreciosCompras!=null) {
				this.jPanelParametrosReportesPreciosCompras.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPreciosCompras!=null) {
				this.jScrollPanelDatosEdicionPreciosCompras.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPreciosCompras!=null) {
				this.jTabbedPaneBusquedasPreciosCompras.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPreciosCompras!=null) {
				this.jScrollPanelDatosPreciosCompras.setVisible(true);
			}
			
			if(this.jPanelPaginacionPreciosCompras!=null) {
				this.jPanelPaginacionPreciosCompras.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPreciosCompras!=null) {
				this.jPanelParametrosReportesPreciosCompras.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPreciosCompras!=null) {
				this.jScrollPanelDatosEdicionPreciosCompras.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPreciosCompras!=null) {
				this.jTabbedPaneBusquedasPreciosCompras.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPreciosCompras!=null) {
				this.jScrollPanelDatosPreciosCompras.setVisible(true);
			}
			
			if(this.jPanelPaginacionPreciosCompras!=null) {
				this.jPanelPaginacionPreciosCompras.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPreciosCompras!=null) {
				this.jPanelParametrosReportesPreciosCompras.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.precioscomprasSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPreciosCompras!=null) {
					this.jTabbedPaneBusquedasPreciosCompras.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPreciosCompras!=null) {
				this.jPanelParametrosReportesPreciosCompras.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.precioscomprasSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPreciosCompras!=null) {
				this.jTabbedPaneBusquedasPreciosCompras.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPreciosCompras!=null) {
				this.jPanelParametrosReportesPreciosCompras.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPreciosCompras=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPreciosCompras) {this.jTabbedPaneBusquedasPreciosCompras.remove(jPanelBusquedaPreciosComprasPreciosCompras);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaPreciosCompras=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPreciosCompras) {this.jTabbedPaneBusquedasPreciosCompras.remove(jPanelBusquedaPreciosComprasPreciosCompras);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadBusquedaPreciosCompras=isParaBodega;
			if(!this.isVisibilidadBusquedaPreciosCompras) {this.jTabbedPaneBusquedasPreciosCompras.remove(jPanelBusquedaPreciosComprasPreciosCompras);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadBusquedaPreciosCompras=isParaProducto;
			if(!this.isVisibilidadBusquedaPreciosCompras) {this.jTabbedPaneBusquedasPreciosCompras.remove(jPanelBusquedaPreciosComprasPreciosCompras);}
		}
		
	}

	public void setVisibilidadBusquedasParaTransaccion(Boolean isParaTransaccion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTransaccionNegation=!isParaTransaccion;

			this.isVisibilidadBusquedaPreciosCompras=isParaTransaccion;
			if(!this.isVisibilidadBusquedaPreciosCompras) {this.jTabbedPaneBusquedasPreciosCompras.remove(jPanelBusquedaPreciosComprasPreciosCompras);}
		}
		
	}

	public void setVisibilidadBusquedasParaLinea(Boolean isParaLinea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaNegation=!isParaLinea;

			this.isVisibilidadBusquedaPreciosCompras=isParaLinea;
			if(!this.isVisibilidadBusquedaPreciosCompras) {this.jTabbedPaneBusquedasPreciosCompras.remove(jPanelBusquedaPreciosComprasPreciosCompras);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaGrupo(Boolean isParaLineaGrupo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaGrupoNegation=!isParaLineaGrupo;

			this.isVisibilidadBusquedaPreciosCompras=isParaLineaGrupo;
			if(!this.isVisibilidadBusquedaPreciosCompras) {this.jTabbedPaneBusquedasPreciosCompras.remove(jPanelBusquedaPreciosComprasPreciosCompras);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaCategoria(Boolean isParaLineaCategoria){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaCategoriaNegation=!isParaLineaCategoria;

			this.isVisibilidadBusquedaPreciosCompras=isParaLineaCategoria;
			if(!this.isVisibilidadBusquedaPreciosCompras) {this.jTabbedPaneBusquedasPreciosCompras.remove(jPanelBusquedaPreciosComprasPreciosCompras);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaMarca(Boolean isParaLineaMarca){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaMarcaNegation=!isParaLineaMarca;

			this.isVisibilidadBusquedaPreciosCompras=isParaLineaMarca;
			if(!this.isVisibilidadBusquedaPreciosCompras) {this.jTabbedPaneBusquedasPreciosCompras.remove(jPanelBusquedaPreciosComprasPreciosCompras);}
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
			
			this.inicializarActualizarBindingTablaPreciosCompras(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPreciosCompras() {
		this.updateBorderResaltarBusquedasFormularioPreciosCompras();
		this.updateVisibilidadBusquedasFormularioPreciosCompras();
		this.updateHabilitarBusquedasFormularioPreciosCompras();
	}
	
	public void updateBorderResaltarBusquedasFormularioPreciosCompras() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPreciosCompras.getComponents().length>0) {
	

		if(this.precioscomprasConstantesFunciones.resaltarBusquedaPreciosComprasPreciosCompras!=null) {
			index= this.jTabbedPaneBusquedasPreciosCompras.indexOfComponent(this.jPanelBusquedaPreciosComprasPreciosCompras);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPreciosCompras.getComponent(index);
				jPanel.setBorder(this.precioscomprasConstantesFunciones.resaltarBusquedaPreciosComprasPreciosCompras);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPreciosCompras() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPreciosCompras.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPreciosCompras.indexOfComponent(this.jPanelBusquedaPreciosComprasPreciosCompras);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPreciosCompras.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.precioscomprasConstantesFunciones.mostrarBusquedaPreciosComprasPreciosCompras);
			if(!this.precioscomprasConstantesFunciones.mostrarBusquedaPreciosComprasPreciosCompras && index>-1) {
				this.jTabbedPaneBusquedasPreciosCompras.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPreciosCompras() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPreciosCompras.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPreciosCompras.indexOfComponent(this.jPanelBusquedaPreciosComprasPreciosCompras);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPreciosCompras.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.precioscomprasConstantesFunciones.activarBusquedaPreciosComprasPreciosCompras);
				this.jTabbedPaneBusquedasPreciosCompras.setEnabledAt(index,this.precioscomprasConstantesFunciones.activarBusquedaPreciosComprasPreciosCompras);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPreciosCompras(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPreciosCompras")) {
			index= this.jTabbedPaneBusquedasPreciosCompras.indexOfComponent(this.jPanelBusquedaPreciosComprasPreciosCompras);

			this.jTabbedPaneBusquedasPreciosCompras.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPreciosCompras.getComponent(index);

			this.precioscomprasConstantesFunciones.setResaltarBusquedaPreciosComprasPreciosCompras(resaltar);

			jPanel.setBorder(this.precioscomprasConstantesFunciones.resaltarBusquedaPreciosComprasPreciosCompras);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPreciosCompras.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPreciosCompras() throws Exception {

		if(this.jInternalFrameDetalleFormPreciosCompras==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPreciosCompras();
		this.updateVisibilidadResaltarControlesFormularioPreciosCompras();
		this.updateHabilitarResaltarControlesFormularioPreciosCompras();
		
	}
	
	public void updateBorderResaltarControlesFormularioPreciosCompras() throws Exception {
		if(this.jInternalFrameDetalleFormPreciosCompras==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.precioscomprasConstantesFunciones.resaltaridPreciosCompras!=null && this.jInternalFrameDetalleFormPreciosCompras!=null) {this.jInternalFrameDetalleFormPreciosCompras.jLabelidPreciosCompras.setBorder(this.precioscomprasConstantesFunciones.resaltaridPreciosCompras);}
		if(this.precioscomprasConstantesFunciones.resaltarid_empresaPreciosCompras!=null && this.jInternalFrameDetalleFormPreciosCompras!=null) {this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_empresaPreciosCompras.setBorder(this.precioscomprasConstantesFunciones.resaltarid_empresaPreciosCompras);}
		if(this.precioscomprasConstantesFunciones.resaltarid_sucursalPreciosCompras!=null && this.jInternalFrameDetalleFormPreciosCompras!=null) {this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_sucursalPreciosCompras.setBorder(this.precioscomprasConstantesFunciones.resaltarid_sucursalPreciosCompras);}
		if(this.precioscomprasConstantesFunciones.resaltarid_bodegaPreciosCompras!=null && this.jInternalFrameDetalleFormPreciosCompras!=null) {this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_bodegaPreciosCompras.setBorder(this.precioscomprasConstantesFunciones.resaltarid_bodegaPreciosCompras);}
		if(this.precioscomprasConstantesFunciones.resaltarid_productoPreciosCompras!=null && this.jInternalFrameDetalleFormPreciosCompras!=null) {this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_productoPreciosCompras.setBorder(this.precioscomprasConstantesFunciones.resaltarid_productoPreciosCompras);}
		if(this.precioscomprasConstantesFunciones.resaltarid_transaccionPreciosCompras!=null && this.jInternalFrameDetalleFormPreciosCompras!=null) {this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_transaccionPreciosCompras.setBorder(this.precioscomprasConstantesFunciones.resaltarid_transaccionPreciosCompras);}
		if(this.precioscomprasConstantesFunciones.resaltarid_lineaPreciosCompras!=null && this.jInternalFrameDetalleFormPreciosCompras!=null) {this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_lineaPreciosCompras.setBorder(this.precioscomprasConstantesFunciones.resaltarid_lineaPreciosCompras);}
		if(this.precioscomprasConstantesFunciones.resaltarid_linea_grupoPreciosCompras!=null && this.jInternalFrameDetalleFormPreciosCompras!=null) {this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_grupoPreciosCompras.setBorder(this.precioscomprasConstantesFunciones.resaltarid_linea_grupoPreciosCompras);}
		if(this.precioscomprasConstantesFunciones.resaltarid_linea_categoriaPreciosCompras!=null && this.jInternalFrameDetalleFormPreciosCompras!=null) {this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_categoriaPreciosCompras.setBorder(this.precioscomprasConstantesFunciones.resaltarid_linea_categoriaPreciosCompras);}
		if(this.precioscomprasConstantesFunciones.resaltarid_linea_marcaPreciosCompras!=null && this.jInternalFrameDetalleFormPreciosCompras!=null) {this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_marcaPreciosCompras.setBorder(this.precioscomprasConstantesFunciones.resaltarid_linea_marcaPreciosCompras);}
		if(this.precioscomprasConstantesFunciones.resaltarfecha_emision_desdePreciosCompras!=null && this.jInternalFrameDetalleFormPreciosCompras!=null) {this.jInternalFrameDetalleFormPreciosCompras.jDateChooserfecha_emision_desdePreciosCompras.setBorder(this.precioscomprasConstantesFunciones.resaltarfecha_emision_desdePreciosCompras);}
		if(this.precioscomprasConstantesFunciones.resaltarfecha_emision_hastaPreciosCompras!=null && this.jInternalFrameDetalleFormPreciosCompras!=null) {this.jInternalFrameDetalleFormPreciosCompras.jDateChooserfecha_emision_hastaPreciosCompras.setBorder(this.precioscomprasConstantesFunciones.resaltarfecha_emision_hastaPreciosCompras);}
		if(this.precioscomprasConstantesFunciones.resaltarnombre_completo_clientePreciosCompras!=null && this.jInternalFrameDetalleFormPreciosCompras!=null) {this.jInternalFrameDetalleFormPreciosCompras.jTextAreanombre_completo_clientePreciosCompras.setBorder(this.precioscomprasConstantesFunciones.resaltarnombre_completo_clientePreciosCompras);}
		if(this.precioscomprasConstantesFunciones.resaltarnumero_comprobantePreciosCompras!=null && this.jInternalFrameDetalleFormPreciosCompras!=null) {this.jInternalFrameDetalleFormPreciosCompras.jTextFieldnumero_comprobantePreciosCompras.setBorder(this.precioscomprasConstantesFunciones.resaltarnumero_comprobantePreciosCompras);}
		if(this.precioscomprasConstantesFunciones.resaltarfecha_emisionPreciosCompras!=null && this.jInternalFrameDetalleFormPreciosCompras!=null) {this.jInternalFrameDetalleFormPreciosCompras.jDateChooserfecha_emisionPreciosCompras.setBorder(this.precioscomprasConstantesFunciones.resaltarfecha_emisionPreciosCompras);}
		if(this.precioscomprasConstantesFunciones.resaltarnombre_productoPreciosCompras!=null && this.jInternalFrameDetalleFormPreciosCompras!=null) {this.jInternalFrameDetalleFormPreciosCompras.jTextAreanombre_productoPreciosCompras.setBorder(this.precioscomprasConstantesFunciones.resaltarnombre_productoPreciosCompras);}
		if(this.precioscomprasConstantesFunciones.resaltarcosto_unitarioPreciosCompras!=null && this.jInternalFrameDetalleFormPreciosCompras!=null) {this.jInternalFrameDetalleFormPreciosCompras.jTextFieldcosto_unitarioPreciosCompras.setBorder(this.precioscomprasConstantesFunciones.resaltarcosto_unitarioPreciosCompras);}
		if(this.precioscomprasConstantesFunciones.resaltarcodigo_productoPreciosCompras!=null && this.jInternalFrameDetalleFormPreciosCompras!=null) {this.jInternalFrameDetalleFormPreciosCompras.jTextFieldcodigo_productoPreciosCompras.setBorder(this.precioscomprasConstantesFunciones.resaltarcodigo_productoPreciosCompras);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPreciosCompras() throws Exception {		
		if(this.jInternalFrameDetalleFormPreciosCompras==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
	
		//this.jInternalFrameDetalleFormPreciosCompras.jLabelidPreciosCompras.setVisible(this.precioscomprasConstantesFunciones.mostraridPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jPanelidPreciosCompras.setVisible(this.precioscomprasConstantesFunciones.mostraridPreciosCompras);
		//this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_empresaPreciosCompras.setVisible(this.precioscomprasConstantesFunciones.mostrarid_empresaPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jPanelid_empresaPreciosCompras.setVisible(this.precioscomprasConstantesFunciones.mostrarid_empresaPreciosCompras);
		//this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_sucursalPreciosCompras.setVisible(this.precioscomprasConstantesFunciones.mostrarid_sucursalPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jPanelid_sucursalPreciosCompras.setVisible(this.precioscomprasConstantesFunciones.mostrarid_sucursalPreciosCompras);
		//this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_bodegaPreciosCompras.setVisible(this.precioscomprasConstantesFunciones.mostrarid_bodegaPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jPanelid_bodegaPreciosCompras.setVisible(this.precioscomprasConstantesFunciones.mostrarid_bodegaPreciosCompras);
		//this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_productoPreciosCompras.setVisible(this.precioscomprasConstantesFunciones.mostrarid_productoPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jPanelid_productoPreciosCompras.setVisible(this.precioscomprasConstantesFunciones.mostrarid_productoPreciosCompras);
		//this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_transaccionPreciosCompras.setVisible(this.precioscomprasConstantesFunciones.mostrarid_transaccionPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jPanelid_transaccionPreciosCompras.setVisible(this.precioscomprasConstantesFunciones.mostrarid_transaccionPreciosCompras);
		//this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_lineaPreciosCompras.setVisible(this.precioscomprasConstantesFunciones.mostrarid_lineaPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jPanelid_lineaPreciosCompras.setVisible(this.precioscomprasConstantesFunciones.mostrarid_lineaPreciosCompras);
		//this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_grupoPreciosCompras.setVisible(this.precioscomprasConstantesFunciones.mostrarid_linea_grupoPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jPanelid_linea_grupoPreciosCompras.setVisible(this.precioscomprasConstantesFunciones.mostrarid_linea_grupoPreciosCompras);
		//this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_categoriaPreciosCompras.setVisible(this.precioscomprasConstantesFunciones.mostrarid_linea_categoriaPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jPanelid_linea_categoriaPreciosCompras.setVisible(this.precioscomprasConstantesFunciones.mostrarid_linea_categoriaPreciosCompras);
		//this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_marcaPreciosCompras.setVisible(this.precioscomprasConstantesFunciones.mostrarid_linea_marcaPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jPanelid_linea_marcaPreciosCompras.setVisible(this.precioscomprasConstantesFunciones.mostrarid_linea_marcaPreciosCompras);
		//this.jInternalFrameDetalleFormPreciosCompras.jDateChooserfecha_emision_desdePreciosCompras.setVisible(this.precioscomprasConstantesFunciones.mostrarfecha_emision_desdePreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jPanelfecha_emision_desdePreciosCompras.setVisible(this.precioscomprasConstantesFunciones.mostrarfecha_emision_desdePreciosCompras);
		//this.jInternalFrameDetalleFormPreciosCompras.jDateChooserfecha_emision_hastaPreciosCompras.setVisible(this.precioscomprasConstantesFunciones.mostrarfecha_emision_hastaPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jPanelfecha_emision_hastaPreciosCompras.setVisible(this.precioscomprasConstantesFunciones.mostrarfecha_emision_hastaPreciosCompras);
		//this.jInternalFrameDetalleFormPreciosCompras.jTextAreanombre_completo_clientePreciosCompras.setVisible(this.precioscomprasConstantesFunciones.mostrarnombre_completo_clientePreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jPanelnombre_completo_clientePreciosCompras.setVisible(this.precioscomprasConstantesFunciones.mostrarnombre_completo_clientePreciosCompras);
		//this.jInternalFrameDetalleFormPreciosCompras.jTextFieldnumero_comprobantePreciosCompras.setVisible(this.precioscomprasConstantesFunciones.mostrarnumero_comprobantePreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jPanelnumero_comprobantePreciosCompras.setVisible(this.precioscomprasConstantesFunciones.mostrarnumero_comprobantePreciosCompras);
		//this.jInternalFrameDetalleFormPreciosCompras.jDateChooserfecha_emisionPreciosCompras.setVisible(this.precioscomprasConstantesFunciones.mostrarfecha_emisionPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jPanelfecha_emisionPreciosCompras.setVisible(this.precioscomprasConstantesFunciones.mostrarfecha_emisionPreciosCompras);
		//this.jInternalFrameDetalleFormPreciosCompras.jTextAreanombre_productoPreciosCompras.setVisible(this.precioscomprasConstantesFunciones.mostrarnombre_productoPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jPanelnombre_productoPreciosCompras.setVisible(this.precioscomprasConstantesFunciones.mostrarnombre_productoPreciosCompras);
		//this.jInternalFrameDetalleFormPreciosCompras.jTextFieldcosto_unitarioPreciosCompras.setVisible(this.precioscomprasConstantesFunciones.mostrarcosto_unitarioPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jPanelcosto_unitarioPreciosCompras.setVisible(this.precioscomprasConstantesFunciones.mostrarcosto_unitarioPreciosCompras);
		//this.jInternalFrameDetalleFormPreciosCompras.jTextFieldcodigo_productoPreciosCompras.setVisible(this.precioscomprasConstantesFunciones.mostrarcodigo_productoPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jPanelcodigo_productoPreciosCompras.setVisible(this.precioscomprasConstantesFunciones.mostrarcodigo_productoPreciosCompras);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPreciosCompras() throws Exception {
		if(this.jInternalFrameDetalleFormPreciosCompras==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPreciosCompras!=null) {
	
		this.jInternalFrameDetalleFormPreciosCompras.jLabelidPreciosCompras.setEnabled(this.precioscomprasConstantesFunciones.activaridPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_empresaPreciosCompras.setEnabled(this.precioscomprasConstantesFunciones.activarid_empresaPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_sucursalPreciosCompras.setEnabled(this.precioscomprasConstantesFunciones.activarid_sucursalPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_bodegaPreciosCompras.setEnabled(this.precioscomprasConstantesFunciones.activarid_bodegaPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_productoPreciosCompras.setEnabled(this.precioscomprasConstantesFunciones.activarid_productoPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_transaccionPreciosCompras.setEnabled(this.precioscomprasConstantesFunciones.activarid_transaccionPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_lineaPreciosCompras.setEnabled(this.precioscomprasConstantesFunciones.activarid_lineaPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_grupoPreciosCompras.setEnabled(this.precioscomprasConstantesFunciones.activarid_linea_grupoPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_categoriaPreciosCompras.setEnabled(this.precioscomprasConstantesFunciones.activarid_linea_categoriaPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jComboBoxid_linea_marcaPreciosCompras.setEnabled(this.precioscomprasConstantesFunciones.activarid_linea_marcaPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jDateChooserfecha_emision_desdePreciosCompras.setEnabled(this.precioscomprasConstantesFunciones.activarfecha_emision_desdePreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jDateChooserfecha_emision_hastaPreciosCompras.setEnabled(this.precioscomprasConstantesFunciones.activarfecha_emision_hastaPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jTextAreanombre_completo_clientePreciosCompras.setEnabled(this.precioscomprasConstantesFunciones.activarnombre_completo_clientePreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jTextFieldnumero_comprobantePreciosCompras.setEnabled(this.precioscomprasConstantesFunciones.activarnumero_comprobantePreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jDateChooserfecha_emisionPreciosCompras.setEnabled(this.precioscomprasConstantesFunciones.activarfecha_emisionPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jTextAreanombre_productoPreciosCompras.setEnabled(this.precioscomprasConstantesFunciones.activarnombre_productoPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jTextFieldcosto_unitarioPreciosCompras.setEnabled(this.precioscomprasConstantesFunciones.activarcosto_unitarioPreciosCompras);
		this.jInternalFrameDetalleFormPreciosCompras.jTextFieldcodigo_productoPreciosCompras.setEnabled(this.precioscomprasConstantesFunciones.activarcodigo_productoPreciosCompras);
		}
	}
	
		
}