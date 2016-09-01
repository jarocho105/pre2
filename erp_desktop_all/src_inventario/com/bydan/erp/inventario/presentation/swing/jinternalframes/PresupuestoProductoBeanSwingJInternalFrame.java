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

import com.bydan.erp.inventario.util.PresupuestoProductoConstantesFunciones;
import com.bydan.erp.inventario.util.PresupuestoProductoParameterReturnGeneral;
//import com.bydan.erp.inventario.util.PresupuestoProductoParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.PresupuestoProductoBean;
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
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class PresupuestoProductoBeanSwingJInternalFrame extends PresupuestoProductoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PresupuestoProductoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PresupuestoProducto> presupuestoproductoValidator = new ClassValidator<PresupuestoProducto>(PresupuestoProducto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PresupuestoProducto presupuestoproducto;	
	public PresupuestoProducto presupuestoproductoAux;
	public PresupuestoProducto presupuestoproductoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PresupuestoProducto presupuestoproductoTotales;
	public Long idPresupuestoProductoActual;
	public Long iIdNuevoPresupuestoProducto=0L;
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

	public String sFinalQueryComboEjercicio="";

	public List<Ejercicio> ejerciciosForeignKey;

	public List<Ejercicio> getejerciciosForeignKey() {
		return ejerciciosForeignKey;
	}

	public void setejerciciosForeignKey(List<Ejercicio> ejerciciosForeignKey) {
		this.ejerciciosForeignKey = ejerciciosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Ejercicio ejercicioForeignKey;

	public Ejercicio getejercicioForeignKey() {
		return ejercicioForeignKey;
	}

	public void setejercicioForeignKey(Ejercicio ejercicioForeignKey) {
		this.ejercicioForeignKey = ejercicioForeignKey;
	}

	public String sFinalQueryComboPeriodo="";

	public List<Periodo> periodosForeignKey;

	public List<Periodo> getperiodosForeignKey() {
		return periodosForeignKey;
	}

	public void setperiodosForeignKey(List<Periodo> periodosForeignKey) {
		this.periodosForeignKey = periodosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Periodo periodoForeignKey;

	public Periodo getperiodoForeignKey() {
		return periodoForeignKey;
	}

	public void setperiodoForeignKey(Periodo periodoForeignKey) {
		this.periodoForeignKey = periodoForeignKey;
	}

	public String sFinalQueryComboCuentaContable="";

	public List<CuentaContable> cuentacontablesForeignKey;

	public List<CuentaContable> getcuentacontablesForeignKey() {
		return cuentacontablesForeignKey;
	}

	public void setcuentacontablesForeignKey(List<CuentaContable> cuentacontablesForeignKey) {
		this.cuentacontablesForeignKey = cuentacontablesForeignKey;
	}

	//OBJETO FK ACTUAL
	public CuentaContable cuentacontableForeignKey;

	public CuentaContable getcuentacontableForeignKey() {
		return cuentacontableForeignKey;
	}

	public void setcuentacontableForeignKey(CuentaContable cuentacontableForeignKey) {
		this.cuentacontableForeignKey = cuentacontableForeignKey;
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
	
	public Boolean isPermisoTodoPresupuestoProducto;
	public Boolean isPermisoNuevoPresupuestoProducto;
	public Boolean isPermisoActualizarPresupuestoProducto;
	public Boolean isPermisoActualizarOriginalPresupuestoProducto;
	public Boolean isPermisoEliminarPresupuestoProducto;
	public Boolean isPermisoGuardarCambiosPresupuestoProducto;
	public Boolean isPermisoConsultaPresupuestoProducto;
	public Boolean isPermisoBusquedaPresupuestoProducto;
	public Boolean isPermisoReportePresupuestoProducto;
	public Boolean isPermisoPaginacionMedioPresupuestoProducto;
	public Boolean isPermisoPaginacionAltoPresupuestoProducto;
	public Boolean isPermisoPaginacionTodoPresupuestoProducto;
	public Boolean isPermisoCopiarPresupuestoProducto;
	public Boolean isPermisoVerFormPresupuestoProducto;
	public Boolean isPermisoDuplicarPresupuestoProducto;
	public Boolean isPermisoOrdenPresupuestoProducto;
	
	
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
	
	public PresupuestoProductoParameterReturnGeneral presupuestoproductoReturnGeneral;
	public PresupuestoProductoParameterReturnGeneral presupuestoproductoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPresupuestoProducto=false;
	public Boolean esParaAccionDesdeFormularioPresupuestoProducto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PresupuestoProductoSessionBeanAdditional presupuestoproductoSessionBeanAdditional=null;
	
	public PresupuestoProductoSessionBeanAdditional getPresupuestoProductoSessionBeanAdditional() {
		return this.presupuestoproductoSessionBeanAdditional;
	}
	
	public void setPresupuestoProductoSessionBeanAdditional(PresupuestoProductoSessionBeanAdditional presupuestoproductoSessionBeanAdditional) {
		try {
			this.presupuestoproductoSessionBeanAdditional=presupuestoproductoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PresupuestoProductoBeanSwingJInternalFrameAdditional presupuestoproductoBeanSwingJInternalFrameAdditional=null;
	//public class PresupuestoProductoBeanSwingJInternalFrame
	
	public PresupuestoProductoBeanSwingJInternalFrameAdditional getPresupuestoProductoBeanSwingJInternalFrameAdditional() {
		return this.presupuestoproductoBeanSwingJInternalFrameAdditional;
	}
	
	public void setPresupuestoProductoBeanSwingJInternalFrameAdditional(PresupuestoProductoBeanSwingJInternalFrameAdditional presupuestoproductoBeanSwingJInternalFrameAdditional) {
		try {
			this.presupuestoproductoBeanSwingJInternalFrameAdditional=presupuestoproductoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PresupuestoProductoLogic presupuestoproductoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PresupuestoProducto presupuestoproductoBean;
	public PresupuestoProductoConstantesFunciones presupuestoproductoConstantesFunciones;
	//public PresupuestoProductoParameterReturnGeneral presupuestoproductoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	public CuentaContableLogic cuentacontableLogic;
	public BodegaLogic bodegaLogic;
	public ProductoLogic productoLogic;
	
	//PARAMETROS
	
	
	//public List<PresupuestoProducto> presupuestoproductos;	
	//public List<PresupuestoProducto> presupuestoproductosEliminados;
	//public List<PresupuestoProducto> presupuestoproductosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPresupuestoProducto=false;
	public Boolean isVisibilidadCeldaDuplicarPresupuestoProducto=true;
	public Boolean isVisibilidadCeldaCopiarPresupuestoProducto=true;
	public Boolean isVisibilidadCeldaVerFormPresupuestoProducto=true;
	public Boolean isVisibilidadCeldaOrdenPresupuestoProducto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPresupuestoProducto=false;
	public Boolean isVisibilidadCeldaModificarPresupuestoProducto=false;
	public Boolean isVisibilidadCeldaActualizarPresupuestoProducto=false;
	public Boolean isVisibilidadCeldaEliminarPresupuestoProducto=false;
	public Boolean isVisibilidadCeldaCancelarPresupuestoProducto=false;
	public Boolean isVisibilidadCeldaGuardarPresupuestoProducto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPresupuestoProducto=false;	
	
	
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdCuentaContable=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoPresupuestoProducto() {
		return this.iIdNuevoPresupuestoProducto;
	}

	public void setiIdNuevoPresupuestoProducto(Long iIdNuevoPresupuestoProducto) {
		this.iIdNuevoPresupuestoProducto = iIdNuevoPresupuestoProducto;
	}
	
	public Long getidPresupuestoProductoActual() {
		return this.idPresupuestoProductoActual;
	}

	public void setidPresupuestoProductoActual(Long idPresupuestoProductoActual) {
		this.idPresupuestoProductoActual = idPresupuestoProductoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PresupuestoProducto getpresupuestoproducto() {
		return this.presupuestoproducto;
	}

	public void setpresupuestoproducto(PresupuestoProducto presupuestoproducto) {
		this.presupuestoproducto = presupuestoproducto;
	}
	
	public PresupuestoProducto getpresupuestoproductoAux() {
		return this.presupuestoproductoAux;
	}

	public void setpresupuestoproductoAux(PresupuestoProducto presupuestoproductoAux) {
		this.presupuestoproductoAux = presupuestoproductoAux;
	}				
	
	public PresupuestoProducto getpresupuestoproductoAnterior() {
		return this.presupuestoproductoAnterior;
	}

	public void setpresupuestoproductoAnterior(PresupuestoProducto presupuestoproductoAnterior) {
		this.presupuestoproductoAnterior = presupuestoproductoAnterior;
	}	
	
	public PresupuestoProducto getpresupuestoproductoTotales() {
		return this.presupuestoproductoTotales;
	}

	public void setpresupuestoproductoTotales(PresupuestoProducto presupuestoproductoTotales) {
		this.presupuestoproductoTotales = presupuestoproductoTotales;
	}	
	
	public PresupuestoProducto getpresupuestoproductoBean() {
		return this.presupuestoproductoBean;
	}

	public void setpresupuestoproductoBean(PresupuestoProducto presupuestoproductoBean) {
		this.presupuestoproductoBean = presupuestoproductoBean;
	}	
	
	public PresupuestoProductoParameterReturnGeneral getpresupuestoproductoReturnGeneral() {
		return this.presupuestoproductoReturnGeneral;
	}

	public void setpresupuestoproductoReturnGeneral(PresupuestoProductoParameterReturnGeneral presupuestoproductoReturnGeneral) {
		this.presupuestoproductoReturnGeneral = presupuestoproductoReturnGeneral;
	}	
	
	
	public Long id_bodegaFK_IdBodega=-1L;

	public Long getid_bodegaFK_IdBodega() {
		return this.id_bodegaFK_IdBodega;
	}

	public void setid_bodegaFK_IdBodega(Long id_bodegaFK_IdBodega) {
		this.id_bodegaFK_IdBodega = id_bodegaFK_IdBodega;
	}

	public Long id_cuenta_contableFK_IdCuentaContable=-1L;

	public Long getid_cuenta_contableFK_IdCuentaContable() {
		return this.id_cuenta_contableFK_IdCuentaContable;
	}

	public void setid_cuenta_contableFK_IdCuentaContable(Long id_cuenta_contableFK_IdCuentaContable) {
		this.id_cuenta_contableFK_IdCuentaContable = id_cuenta_contableFK_IdCuentaContable;
	}

	public Long id_ejercicioFK_IdEjercicio=-1L;

	public Long getid_ejercicioFK_IdEjercicio() {
		return this.id_ejercicioFK_IdEjercicio;
	}

	public void setid_ejercicioFK_IdEjercicio(Long id_ejercicioFK_IdEjercicio) {
		this.id_ejercicioFK_IdEjercicio = id_ejercicioFK_IdEjercicio;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_periodoFK_IdPeriodo=-1L;

	public Long getid_periodoFK_IdPeriodo() {
		return this.id_periodoFK_IdPeriodo;
	}

	public void setid_periodoFK_IdPeriodo(Long id_periodoFK_IdPeriodo) {
		this.id_periodoFK_IdPeriodo = id_periodoFK_IdPeriodo;
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

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public PresupuestoProductoLogic getPresupuestoProductoLogic()	{		
		return presupuestoproductoLogic;
	}

	public void setPresupuestoProductoLogic(PresupuestoProductoLogic presupuestoproductoLogic) {
		this.presupuestoproductoLogic = presupuestoproductoLogic;
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
	
	public Boolean getIsEsNuevoPresupuestoProducto() {
		return isEsNuevoPresupuestoProducto;
	}

	public void setIsEsNuevoPresupuestoProducto(Boolean isEsNuevoPresupuestoProducto) {
		this.isEsNuevoPresupuestoProducto = isEsNuevoPresupuestoProducto;
	}

	public Boolean getEsParaAccionDesdeFormularioPresupuestoProducto() {
		return esParaAccionDesdeFormularioPresupuestoProducto;
	}
	
	public void setEsParaAccionDesdeFormularioPresupuestoProducto(Boolean esParaAccionDesdeFormularioPresupuestoProducto) {
		this.esParaAccionDesdeFormularioPresupuestoProducto = esParaAccionDesdeFormularioPresupuestoProducto;
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

			if(this.presupuestoproductoSessionBean==null) {
				this.presupuestoproductoSessionBean=new PresupuestoProductoSessionBean();
			}

			if(!this.presupuestoproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(presupuestoproductoSessionBean.getlidEmpresaActual());
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

			if(this.presupuestoproductoSessionBean==null) {
				this.presupuestoproductoSessionBean=new PresupuestoProductoSessionBean();
			}

			if(!this.presupuestoproductoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(presupuestoproductoSessionBean.getlidSucursalActual());
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

	public void cargarCombosEjerciciosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EjercicioLogic ejercicioLogic=new EjercicioLogic();

			//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

			if(this.presupuestoproductoSessionBean==null) {
				this.presupuestoproductoSessionBean=new PresupuestoProductoSessionBean();
			}

			if(!this.presupuestoproductoSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

					ejercicioLogic.getTodosEjerciciosWithConnection(sFinalQuery,new Pagination());

					this.ejerciciosForeignKey=ejercicioLogic.getEjercicios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEjercicio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					ejercicioLogic.getEntityWithConnection(presupuestoproductoSessionBean.getlidEjercicioActual());
					this.ejerciciosForeignKey.add(ejercicioLogic.getEjercicio());
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

	public void cargarCombosPeriodosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.periodosForeignKey=new ArrayList<Periodo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PeriodoLogic periodoLogic=new PeriodoLogic();

			//periodoLogic.getPeriodoDataAccess().setIsForForeingKeyData(true);

			if(this.presupuestoproductoSessionBean==null) {
				this.presupuestoproductoSessionBean=new PresupuestoProductoSessionBean();
			}

			if(!this.presupuestoproductoSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//periodoLogic.getPeriodoDataAccess().setIsForForeingKeyData(true);

					periodoLogic.getTodosPeriodosWithConnection(sFinalQuery,new Pagination());

					this.periodosForeignKey=periodoLogic.getPeriodos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPeriodo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					periodoLogic.getEntityWithConnection(presupuestoproductoSessionBean.getlidPeriodoActual());
					this.periodosForeignKey.add(periodoLogic.getPeriodo());
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

	public void cargarCombosCuentaContablesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CuentaContableLogic cuentacontableLogic=new CuentaContableLogic();

			//cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

			if(this.presupuestoproductoSessionBean==null) {
				this.presupuestoproductoSessionBean=new PresupuestoProductoSessionBean();
			}

			if(!this.presupuestoproductoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

					cuentacontableLogic.getTodosCuentaContablesWithConnection(sFinalQuery,new Pagination());

					this.cuentacontablesForeignKey=cuentacontableLogic.getCuentaContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCuentaContable(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getEntityWithConnection(presupuestoproductoSessionBean.getlidCuentaContableActual());
					this.cuentacontablesForeignKey.add(cuentacontableLogic.getCuentaContable());
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

			if(this.presupuestoproductoSessionBean==null) {
				this.presupuestoproductoSessionBean=new PresupuestoProductoSessionBean();
			}

			if(!this.presupuestoproductoSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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
					bodegaLogic.getEntityWithConnection(presupuestoproductoSessionBean.getlidBodegaActual());
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

			if(this.presupuestoproductoSessionBean==null) {
				this.presupuestoproductoSessionBean=new PresupuestoProductoSessionBean();
			}

			if(!this.presupuestoproductoSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(presupuestoproductoSessionBean.getlidProductoActual());
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

					if(this.presupuestoproducto!=null) {
						this.presupuestoproducto.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
						this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_empresaPresupuestoProducto.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaPresupuestoProducto.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
						if(this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_empresaPresupuestoProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_empresaPresupuestoProducto.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaPresupuestoProductoGenerico)throws Exception
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
				jComboBoxid_empresaPresupuestoProductoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaPresupuestoProductoGenerico!=null && jComboBoxid_empresaPresupuestoProductoGenerico.getItemCount()>0) {
					jComboBoxid_empresaPresupuestoProductoGenerico.setSelectedIndex(0);
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

					if(this.presupuestoproducto!=null) {
						this.presupuestoproducto.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
						this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_sucursalPresupuestoProducto.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalPresupuestoProducto.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
						if(this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_sucursalPresupuestoProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_sucursalPresupuestoProducto.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalPresupuestoProductoGenerico)throws Exception
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
				jComboBoxid_sucursalPresupuestoProductoGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalPresupuestoProductoGenerico!=null && jComboBoxid_sucursalPresupuestoProductoGenerico.getItemCount()>0) {
					jComboBoxid_sucursalPresupuestoProductoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEjercicioForeignKey(Long idEjercicioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(ejercicioTemp!=null) {

					if(this.presupuestoproducto!=null) {
						this.presupuestoproducto.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
						this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_ejercicioPresupuestoProducto.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioPresupuestoProducto.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
						if(this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_ejercicioPresupuestoProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_ejercicioPresupuestoProducto.setSelectedIndex(0);
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

	public String getActualEjercicioForeignKeyDescripcion(Long idEjercicioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}


			sDescripcion=EjercicioConstantesFunciones.getEjercicioDescripcion(ejercicioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioPresupuestoProductoGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(ejercicioTemp!=null) {
				jComboBoxid_ejercicioPresupuestoProductoGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioPresupuestoProductoGenerico!=null && jComboBoxid_ejercicioPresupuestoProductoGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioPresupuestoProductoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPeriodoForeignKey(Long idPeriodoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(periodoTemp!=null) {

					if(this.presupuestoproducto!=null) {
						this.presupuestoproducto.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
						this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_periodoPresupuestoProducto.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoPresupuestoProducto.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
						if(this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_periodoPresupuestoProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_periodoPresupuestoProducto.setSelectedIndex(0);
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

	public String getActualPeriodoForeignKeyDescripcion(Long idPeriodoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}


			sDescripcion=PeriodoConstantesFunciones.getPeriodoDescripcion(periodoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoPresupuestoProductoGenerico)throws Exception
	{
		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}

			if(periodoTemp!=null) {
				jComboBoxid_periodoPresupuestoProductoGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoPresupuestoProductoGenerico!=null && jComboBoxid_periodoPresupuestoProductoGenerico.getItemCount()>0) {
					jComboBoxid_periodoPresupuestoProductoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCuentaContableForeignKey(Long idCuentaContableSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableTemp=null;

			for(CuentaContable cuentacontableAux:cuentacontablesForeignKey) {
				if(cuentacontableAux.getId()!=null && cuentacontableAux.getId().equals(idCuentaContableSeleccionado)) {
					cuentacontableTemp=cuentacontableAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cuentacontableTemp!=null) {

					if(this.presupuestoproducto!=null) {
						this.presupuestoproducto.setCuentaContable(cuentacontableTemp);
					}

					if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
						this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_cuenta_contablePresupuestoProducto.setSelectedItem(cuentacontableTemp);
					}
				} else {
					//jComboBoxid_cuenta_contablePresupuestoProducto.setSelectedItem(cuentacontableTemp);
					if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
						if(this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_cuenta_contablePresupuestoProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_cuenta_contablePresupuestoProducto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontableTemp!=null && jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoProducto!=null) {
						jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoProducto.setSelectedItem(cuentacontableTemp);
					} else {
						if(jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoProducto!=null) {
							//jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoProducto.setSelectedItem(cuentacontableTemp);
							if(jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoProducto.getItemCount()>0) {
								jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoProducto.setSelectedIndex(0);
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

	public String getActualCuentaContableForeignKeyDescripcion(Long idCuentaContableSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CuentaContable  cuentacontableTemp=null;

			for(CuentaContable cuentacontableAux:cuentacontablesForeignKey) {
				if(cuentacontableAux.getId()!=null && cuentacontableAux.getId().equals(idCuentaContableSeleccionado)) {
					cuentacontableTemp=cuentacontableAux;
					break;
				}
			}


			sDescripcion=CuentaContableConstantesFunciones.getCuentaContableDescripcion(cuentacontableTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCuentaContableForeignKeyGenerico(Long idCuentaContableSeleccionado,JComboBox jComboBoxid_cuenta_contablePresupuestoProductoGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableTemp=null;

			for(CuentaContable cuentacontableAux:cuentacontablesForeignKey) {
				if(cuentacontableAux.getId()!=null && cuentacontableAux.getId().equals(idCuentaContableSeleccionado)) {
					cuentacontableTemp=cuentacontableAux;
					break;
				}
			}

			if(cuentacontableTemp!=null) {
				jComboBoxid_cuenta_contablePresupuestoProductoGenerico.setSelectedItem(cuentacontableTemp);
			} else {
				if(jComboBoxid_cuenta_contablePresupuestoProductoGenerico!=null && jComboBoxid_cuenta_contablePresupuestoProductoGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contablePresupuestoProductoGenerico.setSelectedIndex(0);
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

					if(this.presupuestoproducto!=null) {
						this.presupuestoproducto.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
						this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_bodegaPresupuestoProducto.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaPresupuestoProducto.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
						if(this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_bodegaPresupuestoProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_bodegaPresupuestoProducto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaFK_IdBodegaPresupuestoProducto!=null) {
						jComboBoxid_bodegaFK_IdBodegaPresupuestoProducto.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaFK_IdBodegaPresupuestoProducto!=null) {
							//jComboBoxid_bodegaFK_IdBodegaPresupuestoProducto.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaFK_IdBodegaPresupuestoProducto.getItemCount()>0) {
								jComboBoxid_bodegaFK_IdBodegaPresupuestoProducto.setSelectedIndex(0);
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
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaPresupuestoProductoGenerico)throws Exception
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
				jComboBoxid_bodegaPresupuestoProductoGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaPresupuestoProductoGenerico!=null && jComboBoxid_bodegaPresupuestoProductoGenerico.getItemCount()>0) {
					jComboBoxid_bodegaPresupuestoProductoGenerico.setSelectedIndex(0);
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

					if(this.presupuestoproducto!=null) {
						this.presupuestoproducto.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
						this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_productoPresupuestoProducto.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoPresupuestoProducto.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
						if(this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_productoPresupuestoProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_productoPresupuestoProducto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoFK_IdProductoPresupuestoProducto!=null) {
						jComboBoxid_productoFK_IdProductoPresupuestoProducto.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoFK_IdProductoPresupuestoProducto!=null) {
							//jComboBoxid_productoFK_IdProductoPresupuestoProducto.setSelectedItem(productoTemp);
							if(jComboBoxid_productoFK_IdProductoPresupuestoProducto.getItemCount()>0) {
								jComboBoxid_productoFK_IdProductoPresupuestoProducto.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoPresupuestoProductoGenerico)throws Exception
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
				jComboBoxid_productoPresupuestoProductoGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoPresupuestoProductoGenerico!=null && jComboBoxid_productoPresupuestoProductoGenerico.getItemCount()>0) {
					jComboBoxid_productoPresupuestoProductoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(PresupuestoProducto presupuestoproducto,JComboBox jComboBoxid_empresaPresupuestoProductoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaPresupuestoProductoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_empresaPresupuestoProducto.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaPresupuestoProductoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				presupuestoproducto.setid_empresa(empresaAux.getId());
				presupuestoproducto.setempresa_descripcion(PresupuestoProductoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				presupuestoproducto.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(PresupuestoProducto presupuestoproducto,JComboBox jComboBoxid_sucursalPresupuestoProductoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalPresupuestoProductoGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_sucursalPresupuestoProducto.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalPresupuestoProductoGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				presupuestoproducto.setid_sucursal(sucursalAux.getId());
				presupuestoproducto.setsucursal_descripcion(PresupuestoProductoConstantesFunciones.getSucursalDescripcion(sucursalAux));
				presupuestoproducto.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(PresupuestoProducto presupuestoproducto,JComboBox jComboBoxid_ejercicioPresupuestoProductoGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioPresupuestoProductoGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_ejercicioPresupuestoProducto.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioPresupuestoProductoGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				presupuestoproducto.setid_ejercicio(ejercicioAux.getId());
				presupuestoproducto.setejercicio_descripcion(PresupuestoProductoConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				presupuestoproducto.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(PresupuestoProducto presupuestoproducto,JComboBox jComboBoxid_periodoPresupuestoProductoGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoPresupuestoProductoGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_periodoPresupuestoProducto.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoPresupuestoProductoGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				if(periodoAux.getid_estado_periodo().equals(0L)) {
					throw new Exception("Periodo INACTIVO, NO PUEDE GUARDAR LA INFORMACION CONSULTE CON EL ADMINISTRADOR");
				}

				presupuestoproducto.setid_periodo(periodoAux.getId());
				presupuestoproducto.setperiodo_descripcion(PresupuestoProductoConstantesFunciones.getPeriodoDescripcion(periodoAux));
				presupuestoproducto.setPeriodo(periodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableForeignKey(PresupuestoProducto presupuestoproducto,JComboBox jComboBoxid_cuenta_contablePresupuestoProductoGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contablePresupuestoProductoGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_cuenta_contablePresupuestoProducto.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contablePresupuestoProductoGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null && cuentacontableAux.getId()!=null) {
				presupuestoproducto.setid_cuenta_contable(cuentacontableAux.getId());
				presupuestoproducto.setcuentacontable_descripcion(PresupuestoProductoConstantesFunciones.getCuentaContableDescripcion(cuentacontableAux));
				presupuestoproducto.setCuentaContable(cuentacontableAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(PresupuestoProducto presupuestoproducto,JComboBox jComboBoxid_bodegaPresupuestoProductoGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaPresupuestoProductoGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_bodegaPresupuestoProducto.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaPresupuestoProductoGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				presupuestoproducto.setid_bodega(bodegaAux.getId());
				presupuestoproducto.setbodega_descripcion(PresupuestoProductoConstantesFunciones.getBodegaDescripcion(bodegaAux));
				presupuestoproducto.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(PresupuestoProducto presupuestoproducto,JComboBox jComboBoxid_productoPresupuestoProductoGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoPresupuestoProductoGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_productoPresupuestoProducto.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoPresupuestoProductoGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				presupuestoproducto.setid_producto(productoAux.getId());
				presupuestoproducto.setproducto_descripcion(PresupuestoProductoConstantesFunciones.getProductoDescripcion(productoAux));
				presupuestoproducto.setProducto(productoAux);			}
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

					if(!PresupuestoProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) { 
							this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_empresaPresupuestoProducto.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_empresaPresupuestoProducto.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) { 
					}

					if(!PresupuestoProductoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PresupuestoProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) { 
							this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_sucursalPresupuestoProducto.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_sucursalPresupuestoProducto.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) { 
					}

					if(!PresupuestoProductoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEjerciciosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEjercicio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PresupuestoProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) { 
							this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_ejercicioPresupuestoProducto.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_ejercicioPresupuestoProducto.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) { 
					}

					if(!PresupuestoProductoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePeriodosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPeriodo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PresupuestoProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) { 
							this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_periodoPresupuestoProducto.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_periodoPresupuestoProducto.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) { 
					}

					if(!PresupuestoProductoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCuentaContablesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCuentaContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PresupuestoProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) { 
							this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_cuenta_contablePresupuestoProducto.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_cuenta_contablePresupuestoProducto.addItem(cuentacontable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) { 
					}

					if(!PresupuestoProductoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PresupuestoProductoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoProducto.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoProducto.addItem(cuentacontable);
							}
						}

						if(!PresupuestoProductoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PresupuestoProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) { 
							this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_bodegaPresupuestoProducto.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_bodegaPresupuestoProducto.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) { 
					}

					if(!PresupuestoProductoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PresupuestoProductoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaPresupuestoProducto.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaFK_IdBodegaPresupuestoProducto.addItem(bodega);
							}
						}

						if(!PresupuestoProductoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PresupuestoProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) { 
							this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_productoPresupuestoProducto.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_productoPresupuestoProducto.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) { 
					}

					if(!PresupuestoProductoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PresupuestoProductoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoFK_IdProductoPresupuestoProducto.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoFK_IdProductoPresupuestoProducto.addItem(producto);
							}
						}

						if(!PresupuestoProductoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
							this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_empresaPresupuestoProducto.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
							this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_empresaPresupuestoProducto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
							this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_sucursalPresupuestoProducto.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
							this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_sucursalPresupuestoProducto.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEjercicioForeignKey(Ejercicio ejercicio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
							this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_ejercicioPresupuestoProducto.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
							this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_ejercicioPresupuestoProducto.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFramePeriodoForeignKey(Periodo periodo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
							this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_periodoPresupuestoProducto.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
							this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_periodoPresupuestoProducto.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameCuentaContableForeignKey(CuentaContable cuentacontable,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
							this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_cuenta_contablePresupuestoProducto.setSelectedItem(cuentacontable);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
							this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_cuenta_contablePresupuestoProducto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoProducto.setSelectedItem(cuentacontable);
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoProducto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
							this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_bodegaPresupuestoProducto.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
							this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_bodegaPresupuestoProducto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaFK_IdBodegaPresupuestoProducto.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaPresupuestoProducto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
							this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_productoPresupuestoProducto.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
							this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_productoPresupuestoProducto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoFK_IdProductoPresupuestoProducto.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoFK_IdProductoPresupuestoProducto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesPresupuestoProducto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			PresupuestoProductoConstantesFunciones.refrescarForeignKeysDescripcionesPresupuestoProducto(this.presupuestoproductoLogic.getPresupuestoProductos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			PresupuestoProductoConstantesFunciones.refrescarForeignKeysDescripcionesPresupuestoProducto(this.presupuestoproductos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(Periodo.class));
		classes.add(new Classe(CuentaContable.class));
		classes.add(new Classe(Bodega.class));
		classes.add(new Classe(Producto.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//presupuestoproductoLogic.setPresupuestoProductos(this.presupuestoproductos);
			presupuestoproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public PresupuestoProductoParameterReturnGeneral getPresupuestoProductoParameterGeneral() {
		return this.presupuestoproductoParameterGeneral;
	}
	
	public void setPresupuestoProductoParameterGeneral(PresupuestoProductoParameterReturnGeneral presupuestoproductoParameterGeneral) {
		this.presupuestoproductoParameterGeneral = presupuestoproductoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPresupuestoProducto() {
		return isPermisoTodoPresupuestoProducto;
	}

	public void setIsPermisoTodoPresupuestoProducto(Boolean isPermisoTodoPresupuestoProducto) {
		this.isPermisoTodoPresupuestoProducto = isPermisoTodoPresupuestoProducto;
	}

	public Boolean getIsPermisoNuevoPresupuestoProducto() {
		return isPermisoNuevoPresupuestoProducto;
	}

	public void setIsPermisoNuevoPresupuestoProducto(Boolean isPermisoNuevoPresupuestoProducto) {
		this.isPermisoNuevoPresupuestoProducto = isPermisoNuevoPresupuestoProducto;
	}

	public Boolean getIsPermisoActualizarPresupuestoProducto() {
		return isPermisoActualizarPresupuestoProducto;
	}

	public void setIsPermisoActualizarPresupuestoProducto(Boolean isPermisoActualizarPresupuestoProducto) {
		this.isPermisoActualizarPresupuestoProducto = isPermisoActualizarPresupuestoProducto;
	}

	public Boolean getIsPermisoEliminarPresupuestoProducto() {
		return isPermisoEliminarPresupuestoProducto;
	}

	public void setIsPermisoEliminarPresupuestoProducto(Boolean isPermisoEliminarPresupuestoProducto) {
		this.isPermisoEliminarPresupuestoProducto = isPermisoEliminarPresupuestoProducto;
	}

	public Boolean getIsPermisoGuardarCambiosPresupuestoProducto() {
		return isPermisoGuardarCambiosPresupuestoProducto;
	}

	public void setIsPermisoGuardarCambiosPresupuestoProducto(Boolean isPermisoGuardarCambiosPresupuestoProducto) {
		this.isPermisoGuardarCambiosPresupuestoProducto = isPermisoGuardarCambiosPresupuestoProducto;
	}
	
	public Boolean getIsPermisoConsultaPresupuestoProducto() {
		return isPermisoConsultaPresupuestoProducto;
	}

	public void setIsPermisoConsultaPresupuestoProducto(Boolean isPermisoConsultaPresupuestoProducto) {
		this.isPermisoConsultaPresupuestoProducto = isPermisoConsultaPresupuestoProducto;
	}

	public Boolean getIsPermisoBusquedaPresupuestoProducto() {
		return isPermisoBusquedaPresupuestoProducto;
	}

	public void setIsPermisoBusquedaPresupuestoProducto(Boolean isPermisoBusquedaPresupuestoProducto) {
		this.isPermisoBusquedaPresupuestoProducto = isPermisoBusquedaPresupuestoProducto;
	}

	public Boolean getIsPermisoReportePresupuestoProducto() {
		return isPermisoReportePresupuestoProducto;
	}

	public void setIsPermisoReportePresupuestoProducto(Boolean isPermisoReportePresupuestoProducto) {
		this.isPermisoReportePresupuestoProducto = isPermisoReportePresupuestoProducto;
	}
	
	public Boolean getIsPermisoPaginacionMedioPresupuestoProducto() {
		return isPermisoPaginacionMedioPresupuestoProducto;
	}

	public void setIsPermisoPaginacionMedioPresupuestoProducto(Boolean isPermisoPaginacionMedioPresupuestoProducto) {
		this.isPermisoPaginacionMedioPresupuestoProducto = isPermisoPaginacionMedioPresupuestoProducto;
	}
	
	public Boolean getIsPermisoPaginacionTodoPresupuestoProducto() {
		return isPermisoPaginacionTodoPresupuestoProducto;
	}

	public void setIsPermisoPaginacionTodoPresupuestoProducto(Boolean isPermisoPaginacionTodoPresupuestoProducto) {
		this.isPermisoPaginacionTodoPresupuestoProducto = isPermisoPaginacionTodoPresupuestoProducto;
	}
	
	public Boolean getIsPermisoPaginacionAltoPresupuestoProducto() {
		return isPermisoPaginacionAltoPresupuestoProducto;
	}

	public void setIsPermisoPaginacionAltoPresupuestoProducto(Boolean isPermisoPaginacionAltoPresupuestoProducto) {
		this.isPermisoPaginacionAltoPresupuestoProducto = isPermisoPaginacionAltoPresupuestoProducto;
	}
	
	public Boolean getIsPermisoCopiarPresupuestoProducto() {
		return isPermisoCopiarPresupuestoProducto;
	}

	public void setIsPermisoCopiarPresupuestoProducto(Boolean isPermisoCopiarPresupuestoProducto) {
		this.isPermisoCopiarPresupuestoProducto = isPermisoCopiarPresupuestoProducto;
	}
	
	public Boolean getIsPermisoVerFormPresupuestoProducto() {
		return isPermisoVerFormPresupuestoProducto;
	}

	public void setIsPermisoVerFormPresupuestoProducto(Boolean isPermisoVerFormPresupuestoProducto) {
		this.isPermisoVerFormPresupuestoProducto = isPermisoVerFormPresupuestoProducto;
	}
	
	public Boolean getIsPermisoDuplicarPresupuestoProducto() {
		return isPermisoDuplicarPresupuestoProducto;
	}

	public void setIsPermisoDuplicarPresupuestoProducto(Boolean isPermisoDuplicarPresupuestoProducto) {
		this.isPermisoDuplicarPresupuestoProducto = isPermisoDuplicarPresupuestoProducto;
	}
	
	public Boolean getIsPermisoOrdenPresupuestoProducto() {
		return isPermisoOrdenPresupuestoProducto;
	}

	public void setIsPermisoOrdenPresupuestoProducto(Boolean isPermisoOrdenPresupuestoProducto) {
		this.isPermisoOrdenPresupuestoProducto = isPermisoOrdenPresupuestoProducto;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPresupuestoProducto() {
		return isVisibilidadCeldaNuevoPresupuestoProducto;
	}

	public void setIsVisibilidadCeldaNuevoPresupuestoProducto(Boolean isVisibilidadCeldaNuevoPresupuestoProducto) {
		this.isVisibilidadCeldaNuevoPresupuestoProducto = isVisibilidadCeldaNuevoPresupuestoProducto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPresupuestoProducto() {
		return isVisibilidadCeldaDuplicarPresupuestoProducto;
	}

	public void setIsVisibilidadCeldaDuplicarPresupuestoProducto(Boolean isVisibilidadCeldaDuplicarPresupuestoProducto) {
		this.isVisibilidadCeldaDuplicarPresupuestoProducto = isVisibilidadCeldaDuplicarPresupuestoProducto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPresupuestoProducto() {
		return isVisibilidadCeldaCopiarPresupuestoProducto;
	}

	public void setIsVisibilidadCeldaCopiarPresupuestoProducto(Boolean isVisibilidadCeldaCopiarPresupuestoProducto) {
		this.isVisibilidadCeldaCopiarPresupuestoProducto = isVisibilidadCeldaCopiarPresupuestoProducto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPresupuestoProducto() {
		return isVisibilidadCeldaVerFormPresupuestoProducto;
	}

	public void setIsVisibilidadCeldaVerFormPresupuestoProducto(Boolean isVisibilidadCeldaVerFormPresupuestoProducto) {
		this.isVisibilidadCeldaVerFormPresupuestoProducto = isVisibilidadCeldaVerFormPresupuestoProducto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPresupuestoProducto() {
		return isVisibilidadCeldaOrdenPresupuestoProducto;
	}

	public void setIsVisibilidadCeldaOrdenPresupuestoProducto(Boolean isVisibilidadCeldaOrdenPresupuestoProducto) {
		this.isVisibilidadCeldaOrdenPresupuestoProducto = isVisibilidadCeldaOrdenPresupuestoProducto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPresupuestoProducto() {
		return isVisibilidadCeldaNuevoRelacionesPresupuestoProducto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPresupuestoProducto(Boolean isVisibilidadCeldaNuevoRelacionesPresupuestoProducto) {
		this.isVisibilidadCeldaNuevoRelacionesPresupuestoProducto = isVisibilidadCeldaNuevoRelacionesPresupuestoProducto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPresupuestoProducto() {
		return isVisibilidadCeldaModificarPresupuestoProducto;
	}

	public void setIsVisibilidadCeldaModificarPresupuestoProducto(Boolean isVisibilidadCeldaModificarPresupuestoProducto) {
		this.isVisibilidadCeldaModificarPresupuestoProducto = isVisibilidadCeldaModificarPresupuestoProducto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPresupuestoProducto() {
		return isVisibilidadCeldaActualizarPresupuestoProducto;
	}

	public void setIsVisibilidadCeldaActualizarPresupuestoProducto(Boolean isVisibilidadCeldaActualizarPresupuestoProducto) {
		this.isVisibilidadCeldaActualizarPresupuestoProducto = isVisibilidadCeldaActualizarPresupuestoProducto;
	}

	public Boolean getIsVisibilidadCeldaEliminarPresupuestoProducto() {
		return isVisibilidadCeldaEliminarPresupuestoProducto;
	}

	public void setIsVisibilidadCeldaEliminarPresupuestoProducto(Boolean isVisibilidadCeldaEliminarPresupuestoProducto) {
		this.isVisibilidadCeldaEliminarPresupuestoProducto = isVisibilidadCeldaEliminarPresupuestoProducto;
	}

	public Boolean getIsVisibilidadCeldaCancelarPresupuestoProducto() {
		return isVisibilidadCeldaCancelarPresupuestoProducto;
	}

	public void setIsVisibilidadCeldaCancelarPresupuestoProducto(Boolean isVisibilidadCeldaCancelarPresupuestoProducto) {
		this.isVisibilidadCeldaCancelarPresupuestoProducto = isVisibilidadCeldaCancelarPresupuestoProducto;
	}

	public Boolean getIsVisibilidadCeldaGuardarPresupuestoProducto() {
		return isVisibilidadCeldaGuardarPresupuestoProducto;
	}

	public void setIsVisibilidadCeldaGuardarPresupuestoProducto(Boolean isVisibilidadCeldaGuardarPresupuestoProducto) {
		this.isVisibilidadCeldaGuardarPresupuestoProducto = isVisibilidadCeldaGuardarPresupuestoProducto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPresupuestoProducto() {
		return isVisibilidadCeldaGuardarCambiosPresupuestoProducto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPresupuestoProducto(Boolean isVisibilidadCeldaGuardarCambiosPresupuestoProducto) {
		this.isVisibilidadCeldaGuardarCambiosPresupuestoProducto = isVisibilidadCeldaGuardarCambiosPresupuestoProducto;
	}
		
	public PresupuestoProductoSessionBean getpresupuestoproductoSessionBean() {
		return this.presupuestoproductoSessionBean;
	}
	
	public void setpresupuestoproductoSessionBean(PresupuestoProductoSessionBean presupuestoproductoSessionBean) {
		this.presupuestoproductoSessionBean=presupuestoproductoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdBodega() {
		return this.isVisibilidadFK_IdBodega;
	}

	public void setisVisibilidadFK_IdBodega(Boolean isVisibilidadFK_IdBodega) {
		this.isVisibilidadFK_IdBodega=isVisibilidadFK_IdBodega;
	}

	public Boolean getisVisibilidadFK_IdCuentaContable() {
		return this.isVisibilidadFK_IdCuentaContable;
	}

	public void setisVisibilidadFK_IdCuentaContable(Boolean isVisibilidadFK_IdCuentaContable) {
		this.isVisibilidadFK_IdCuentaContable=isVisibilidadFK_IdCuentaContable;
	}

	public Boolean getisVisibilidadFK_IdEjercicio() {
		return this.isVisibilidadFK_IdEjercicio;
	}

	public void setisVisibilidadFK_IdEjercicio(Boolean isVisibilidadFK_IdEjercicio) {
		this.isVisibilidadFK_IdEjercicio=isVisibilidadFK_IdEjercicio;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdPeriodo() {
		return this.isVisibilidadFK_IdPeriodo;
	}

	public void setisVisibilidadFK_IdPeriodo(Boolean isVisibilidadFK_IdPeriodo) {
		this.isVisibilidadFK_IdPeriodo=isVisibilidadFK_IdPeriodo;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPresupuestoProducto(PresupuestoProducto presupuestoproducto)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(presupuestoproducto,null);
				this.setActualParaGuardarSucursalForeignKey(presupuestoproducto,null);
				this.setActualParaGuardarEjercicioForeignKey(presupuestoproducto,null);
				this.setActualParaGuardarPeriodoForeignKey(presupuestoproducto,null);
				this.setActualParaGuardarCuentaContableForeignKey(presupuestoproducto,null);
				this.setActualParaGuardarBodegaForeignKey(presupuestoproducto,null);
				this.setActualParaGuardarProductoForeignKey(presupuestoproducto,null);
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
	
	public void bugActualizarReferenciaActual(PresupuestoProducto presupuestoproducto,PresupuestoProducto presupuestoproductoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPresupuestoProducto(presupuestoproducto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		presupuestoproductoAux.setId(presupuestoproducto.getId());
		presupuestoproductoAux.setVersionRow(presupuestoproducto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessPresupuestoProducto();
		
			int intSelectedRow = this.jTableDatosPresupuestoProducto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductoLogic.getPresupuestoProductos().toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductos.toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PresupuestoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualPresupuestoProducto(this.presupuestoproducto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoProducto(this.presupuestoproducto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = presupuestoproductoValidator.getInvalidValues(this.presupuestoproducto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			presupuestoproductoLogic.setDatosCliente(datosCliente);
			presupuestoproductoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				presupuestoproductoAux=new  PresupuestoProducto();
				
				presupuestoproductoAux.setIsNew(true);
				presupuestoproductoAux.setIsChanged(true);
				
				presupuestoproductoAux.setPresupuestoProductoOriginal(this.presupuestoproducto);
				
				presupuestoproductoAux.setId(this.presupuestoproducto.getId());	
				presupuestoproductoAux.setVersionRow(this.presupuestoproducto.getVersionRow());	
				presupuestoproductoAux.setid_empresa(this.presupuestoproducto.getid_empresa());	
				presupuestoproductoAux.setid_sucursal(this.presupuestoproducto.getid_sucursal());	
				presupuestoproductoAux.setid_ejercicio(this.presupuestoproducto.getid_ejercicio());	
				presupuestoproductoAux.setid_periodo(this.presupuestoproducto.getid_periodo());	
				presupuestoproductoAux.setid_cuenta_contable(this.presupuestoproducto.getid_cuenta_contable());	
				presupuestoproductoAux.setid_bodega(this.presupuestoproducto.getid_bodega());	
				presupuestoproductoAux.setid_producto(this.presupuestoproducto.getid_producto());	
				presupuestoproductoAux.setvalor_ingreso(this.presupuestoproducto.getvalor_ingreso());	
				presupuestoproductoAux.setvalor_egreso(this.presupuestoproducto.getvalor_egreso());	
				presupuestoproductoAux.setcantidad_ingreso(this.presupuestoproducto.getcantidad_ingreso());	
				presupuestoproductoAux.setcantidad_egreso(this.presupuestoproducto.getcantidad_egreso());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.presupuestoproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.presupuestoproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(presupuestoproductoAux,presupuestoproductoLogic.getPresupuestoProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presupuestoproductoAux,presupuestoproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.presupuestoproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.presupuestoproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoproductoLogic.savePresupuestoProductos();//WithConnection
						//presupuestoproductoLogic.getSetVersionRowPresupuestoProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.presupuestoproducto,presupuestoproductoAux);
					
					this.refrescarForeignKeysDescripcionesPresupuestoProducto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.presupuestoproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								presupuestoproductoLogic.savePresupuestoProductoRelaciones(presupuestoproductoAux);//WithConnection
								//presupuestoproductoLogic.getSetVersionRowPresupuestoProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.presupuestoproducto,presupuestoproductoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.presupuestoproductoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.presupuestoproductoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(presupuestoproductoAux,presupuestoproductoLogic.getPresupuestoProductos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(presupuestoproductoAux,presupuestoproductos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.presupuestoproducto,presupuestoproductoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				presupuestoproductoAux=new  PresupuestoProducto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.presupuestoproductoSessionBean.getEsGuardarRelacionado() 
					|| (this.presupuestoproductoSessionBean.getEsGuardarRelacionado() && this.presupuestoproducto.getId()>=0)) {
						
					presupuestoproductoAux.setIsNew(false);
				}
				
				presupuestoproductoAux.setIsDeleted(false);
			
				presupuestoproductoAux.setId(this.presupuestoproducto.getId());	
				presupuestoproductoAux.setVersionRow(this.presupuestoproducto.getVersionRow());	
				presupuestoproductoAux.setid_empresa(this.presupuestoproducto.getid_empresa());	
				presupuestoproductoAux.setid_sucursal(this.presupuestoproducto.getid_sucursal());	
				presupuestoproductoAux.setid_ejercicio(this.presupuestoproducto.getid_ejercicio());	
				presupuestoproductoAux.setid_periodo(this.presupuestoproducto.getid_periodo());	
				presupuestoproductoAux.setid_cuenta_contable(this.presupuestoproducto.getid_cuenta_contable());	
				presupuestoproductoAux.setid_bodega(this.presupuestoproducto.getid_bodega());	
				presupuestoproductoAux.setid_producto(this.presupuestoproducto.getid_producto());	
				presupuestoproductoAux.setvalor_ingreso(this.presupuestoproducto.getvalor_ingreso());	
				presupuestoproductoAux.setvalor_egreso(this.presupuestoproducto.getvalor_egreso());	
				presupuestoproductoAux.setcantidad_ingreso(this.presupuestoproducto.getcantidad_ingreso());	
				presupuestoproductoAux.setcantidad_egreso(this.presupuestoproducto.getcantidad_egreso());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(presupuestoproductoAux,presupuestoproductoLogic.getPresupuestoProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presupuestoproductoAux,presupuestoproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.presupuestoproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.presupuestoproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoproductoLogic.savePresupuestoProductos();//WithConnection
						//presupuestoproductoLogic.getSetVersionRowPresupuestoProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.presupuestoproducto,presupuestoproductoAux);
					
					this.refrescarForeignKeysDescripcionesPresupuestoProducto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.presupuestoproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								presupuestoproductoLogic.savePresupuestoProductoRelaciones(presupuestoproductoAux);//WithConnection
								//presupuestoproductoLogic.getSetVersionRowPresupuestoProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.presupuestoproducto,presupuestoproductoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.presupuestoproductoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.presupuestoproductoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(presupuestoproductoAux,presupuestoproductoLogic.getPresupuestoProductos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(presupuestoproductoAux,presupuestoproductos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.presupuestoproducto,presupuestoproductoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				presupuestoproductoAux=new  PresupuestoProducto();
				
				presupuestoproductoAux.setIsNew(false);
				presupuestoproductoAux.setIsChanged(false);
				
				presupuestoproductoAux.setIsDeleted(true);
				
				presupuestoproductoAux.setId(this.presupuestoproducto.getId());	
				presupuestoproductoAux.setVersionRow(this.presupuestoproducto.getVersionRow());	
				presupuestoproductoAux.setid_empresa(this.presupuestoproducto.getid_empresa());	
				presupuestoproductoAux.setid_sucursal(this.presupuestoproducto.getid_sucursal());	
				presupuestoproductoAux.setid_ejercicio(this.presupuestoproducto.getid_ejercicio());	
				presupuestoproductoAux.setid_periodo(this.presupuestoproducto.getid_periodo());	
				presupuestoproductoAux.setid_cuenta_contable(this.presupuestoproducto.getid_cuenta_contable());	
				presupuestoproductoAux.setid_bodega(this.presupuestoproducto.getid_bodega());	
				presupuestoproductoAux.setid_producto(this.presupuestoproducto.getid_producto());	
				presupuestoproductoAux.setvalor_ingreso(this.presupuestoproducto.getvalor_ingreso());	
				presupuestoproductoAux.setvalor_egreso(this.presupuestoproducto.getvalor_egreso());	
				presupuestoproductoAux.setcantidad_ingreso(this.presupuestoproducto.getcantidad_ingreso());	
				presupuestoproductoAux.setcantidad_egreso(this.presupuestoproducto.getcantidad_egreso());	
				
				if(this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.presupuestoproductoAux.getId()>=0) {	
						this.presupuestoproductosEliminados.add(presupuestoproductoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(presupuestoproductoAux,presupuestoproductoLogic.getPresupuestoProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presupuestoproductoAux,presupuestoproductos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.presupuestoproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.presupuestoproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoproductoLogic.savePresupuestoProductos();//WithConnection
						//presupuestoproductoLogic.getSetVersionRowPresupuestoProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.presupuestoproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								presupuestoproductoLogic.savePresupuestoProductoRelaciones(presupuestoproductoAux);//WithConnection
								//presupuestoproductoLogic.getSetVersionRowPresupuestoProductos();//WithConnection
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
							if(this.presupuestoproductoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.presupuestoproductoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(presupuestoproductoAux,presupuestoproductoLogic.getPresupuestoProductos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(presupuestoproductoAux,presupuestoproductos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.getPresupuestoProductos().addAll(this.presupuestoproductosEliminados);
					
					presupuestoproductoLogic.savePresupuestoProductos();//WithConnection
					//presupuestoproductoLogic.getSetVersionRowPresupuestoProductos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesPresupuestoProducto();
				
				this.presupuestoproductosEliminados= new ArrayList<PresupuestoProducto>();		
			}
			
			if(this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Presupuesto Producto GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Presupuesto Producto",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.presupuestoproducto=presupuestoproductoAux;
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
      		//this.finishProcessPresupuestoProducto();
      	}
		
	}	
	
	public void actualizarRelaciones(PresupuestoProducto presupuestoproductoLocal) throws Exception {
		
		if(this.presupuestoproductoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PresupuestoProducto presupuestoproductoLocal) throws Exception {	
		if(this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				presupuestoproductoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				presupuestoproductoLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				presupuestoproductoLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				presupuestoproductoLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontableBeanSwingJInternalFrameLocal.actualizarLista(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablesForeignKey);

				cuentacontableBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				presupuestoproductoLocal.setCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContable();
				this.cargarCombosFrameCuentaContablesForeignKey("Formulario");
				this.setActualCuentaContableForeignKey(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				presupuestoproductoLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				presupuestoproductoLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPresupuestoProductoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPresupuestoProducto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductoLogic.getPresupuestoProductos().toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductos.toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = presupuestoproductoValidator.getInvalidValues(this.presupuestoproducto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PresupuestoProducto presupuestoproducto,List<PresupuestoProducto> presupuestoproductos) throws Exception {
		try	{		
			PresupuestoProductoConstantesFunciones.actualizarLista(presupuestoproducto,presupuestoproductos,this.presupuestoproductoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(PresupuestoProducto presupuestoproducto,List<PresupuestoProducto> presupuestoproductos) throws Exception {
		try	{			
			PresupuestoProductoConstantesFunciones.actualizarSelectedLista(presupuestoproducto,presupuestoproductos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PresupuestoProducto> presupuestoproductosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				presupuestoproductosLocal=this.presupuestoproductoLogic.getPresupuestoProductos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				presupuestoproductosLocal=this.presupuestoproductos;
			}
			//ARCHITECTURE
		
			for(PresupuestoProducto presupuestoproductoLocal:presupuestoproductosLocal) {
				if(this.permiteMantenimiento(presupuestoproductoLocal) && presupuestoproductoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PresupuestoProductoConstantesFunciones.getPresupuestoProductoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PresupuestoProductoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoProducto.jLabelid_empresaPresupuestoProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoProductoConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoProducto.jLabelid_sucursalPresupuestoProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoProductoConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoProducto.jLabelid_ejercicioPresupuestoProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoProductoConstantesFunciones.IDPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoProducto.jLabelid_periodoPresupuestoProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoProductoConstantesFunciones.IDCUENTACONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoProducto.jLabelid_cuenta_contablePresupuestoProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoProductoConstantesFunciones.IDBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoProducto.jLabelid_bodegaPresupuestoProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoProductoConstantesFunciones.IDPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoProducto.jLabelid_productoPresupuestoProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoProductoConstantesFunciones.VALORINGRESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoProducto.jLabelvalor_ingresoPresupuestoProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoProductoConstantesFunciones.VALOREGRESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoProducto.jLabelvalor_egresoPresupuestoProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoProductoConstantesFunciones.CANTIDADINGRESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoProducto.jLabelcantidad_ingresoPresupuestoProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoProductoConstantesFunciones.CANTIDADEGRESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoProducto.jLabelcantidad_egresoPresupuestoProducto,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoProducto.jLabelid_empresaPresupuestoProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoProducto.jLabelid_sucursalPresupuestoProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoProducto.jLabelid_ejercicioPresupuestoProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoProducto.jLabelid_periodoPresupuestoProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoProducto.jLabelid_cuenta_contablePresupuestoProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoProducto.jLabelid_bodegaPresupuestoProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoProducto.jLabelid_productoPresupuestoProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoProducto.jLabelvalor_ingresoPresupuestoProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoProducto.jLabelvalor_egresoPresupuestoProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoProducto.jLabelcantidad_ingresoPresupuestoProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoProducto.jLabelcantidad_egresoPresupuestoProducto,"");
		
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
		this.iIdNuevoPresupuestoProducto--;	
		
		
		this.presupuestoproductoAux=new PresupuestoProducto();
		
		this.presupuestoproductoAux.setId(this.iIdNuevoPresupuestoProducto);
		this.presupuestoproductoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.presupuestoproductoLogic.getPresupuestoProductos().add(this.presupuestoproductoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.presupuestoproductos.add(this.presupuestoproductoAux);
		}
		//ARCHITECTURE
		
		this.presupuestoproducto=this.presupuestoproductoAux;
		
		if(PresupuestoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPresupuestoProducto(this.presupuestoproducto);
			this.setVariablesObjetoActualToFormularioForeignKeyPresupuestoProducto(this.presupuestoproducto);
		}
				
		//this.setDefaultControlesPresupuestoProducto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPresupuestoProducto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPresupuestoProducto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPresupuestoProducto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPresupuestoProducto(this.presupuestoproductoBean,this.presupuestoproducto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoProducto(this.presupuestoproducto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(PresupuestoProductoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.presupuestoproductoSessionBean.getConGuardarRelaciones()) {
			classes=PresupuestoProductoConstantesFunciones.getClassesRelationshipsOfPresupuestoProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.presupuestoproductoReturnGeneral=presupuestoproductoLogic.procesarEventosPresupuestoProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.presupuestoproductoLogic.getPresupuestoProductos(),this.presupuestoproducto,this.presupuestoproductoParameterGeneral,this.isEsNuevoPresupuestoProducto,classes);//this.presupuestoproductoLogic.getPresupuestoProducto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPresupuestoProducto(this.presupuestoproductoReturnGeneral,this.presupuestoproductoBean,false);
		
		if(this.presupuestoproductoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPresupuestoProducto(this.presupuestoproductoReturnGeneral.getPresupuestoProducto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPresupuestoProducto(this.presupuestoproductoReturnGeneral.getPresupuestoProducto());
		}
		
		if(this.presupuestoproductoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPresupuestoProducto(this.presupuestoproductoReturnGeneral.getPresupuestoProducto(),classes);//this.presupuestoproductoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPresupuestoProducto(this.presupuestoproducto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPresupuestoProducto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPresupuestoProducto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PresupuestoProductoBeanSwingJInternalFrameAdditional.RecargarFormPresupuestoProducto(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPresupuestoProducto(false);
						
			if(presupuestoproductoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(PresupuestoProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPresupuestoProducto();
			}
			
			this.actualizarVisualTableDatosPresupuestoProducto();
			
			this.jTableDatosPresupuestoProducto.setRowSelectionInterval(this.getIndiceNuevoPresupuestoProducto(), this.getIndiceNuevoPresupuestoProducto());
			
			this.seleccionarFilaTablaPresupuestoProductoActual();
						
			this.actualizarEstadoCeldasBotonesPresupuestoProducto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPresupuestoProducto(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPresupuestoProducto.jTextFieldvalor_ingresoPresupuestoProducto.setEnabled(isHabilitar && this.presupuestoproductoConstantesFunciones.activarvalor_ingresoPresupuestoProducto);
		this.jInternalFrameDetalleFormPresupuestoProducto.jTextFieldvalor_egresoPresupuestoProducto.setEnabled(isHabilitar && this.presupuestoproductoConstantesFunciones.activarvalor_egresoPresupuestoProducto);
		this.jInternalFrameDetalleFormPresupuestoProducto.jTextFieldcantidad_ingresoPresupuestoProducto.setEnabled(isHabilitar && this.presupuestoproductoConstantesFunciones.activarcantidad_ingresoPresupuestoProducto);
		this.jInternalFrameDetalleFormPresupuestoProducto.jTextFieldcantidad_egresoPresupuestoProducto.setEnabled(isHabilitar && this.presupuestoproductoConstantesFunciones.activarcantidad_egresoPresupuestoProducto);	
		//
		this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_empresaPresupuestoProducto.setEnabled(isHabilitar && this.presupuestoproductoConstantesFunciones.activarid_empresaPresupuestoProducto);//
		this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_sucursalPresupuestoProducto.setEnabled(isHabilitar && this.presupuestoproductoConstantesFunciones.activarid_sucursalPresupuestoProducto);//
		this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_ejercicioPresupuestoProducto.setEnabled(isHabilitar && this.presupuestoproductoConstantesFunciones.activarid_ejercicioPresupuestoProducto);//
		this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_periodoPresupuestoProducto.setEnabled(isHabilitar && this.presupuestoproductoConstantesFunciones.activarid_periodoPresupuestoProducto);
		this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_cuenta_contablePresupuestoProducto.setEnabled(isHabilitar && this.presupuestoproductoConstantesFunciones.activarid_cuenta_contablePresupuestoProducto);
		this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_bodegaPresupuestoProducto.setEnabled(isHabilitar && this.presupuestoproductoConstantesFunciones.activarid_bodegaPresupuestoProducto);
		this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_productoPresupuestoProducto.setEnabled(isHabilitar && this.presupuestoproductoConstantesFunciones.activarid_productoPresupuestoProducto);
	};
	
	public void setDefaultControlesPresupuestoProducto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPresupuestoProducto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.presupuestoproductoSessionBean.setConGuardarRelaciones(true);			
			this.presupuestoproductoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPresupuestoProducto.jTabbedPaneRelacionesPresupuestoProducto.setVisible(true);
			
					
		} else {
			//this.presupuestoproductoSessionBean.setConGuardarRelaciones(false);			
			this.presupuestoproductoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPresupuestoProducto.jTabbedPaneRelacionesPresupuestoProducto.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoPresupuestoProducto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresupuestoProducto presupuestoproductoAux:this.presupuestoproductoLogic.getPresupuestoProductos()) {
				if(presupuestoproductoAux.getId().equals(this.iIdNuevoPresupuestoProducto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresupuestoProducto presupuestoproductoAux:this.presupuestoproductos) {
				if(presupuestoproductoAux.getId().equals(this.iIdNuevoPresupuestoProducto)) {
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
	
	public int getIndiceActualPresupuestoProducto(PresupuestoProducto presupuestoproducto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresupuestoProducto presupuestoproductoAux:this.presupuestoproductoLogic.getPresupuestoProductos()) {
				if(presupuestoproductoAux.getId().equals(presupuestoproducto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresupuestoProducto presupuestoproductoAux:this.presupuestoproductos) {
				if(presupuestoproductoAux.getId().equals(presupuestoproducto.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPresupuestoProducto(PresupuestoProducto presupuestoproductoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresupuestoProducto presupuestoproductoAux:this.presupuestoproductoLogic.getPresupuestoProductos()) {
				if(presupuestoproductoAux.getPresupuestoProductoOriginal().getId().equals(presupuestoproductoOriginal.getId())) {
					existe=true;
					presupuestoproductoOriginal.setId(presupuestoproductoAux.getId());
					presupuestoproductoOriginal.setVersionRow(presupuestoproductoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresupuestoProducto presupuestoproductoAux:this.presupuestoproductos) {
				if(presupuestoproductoAux.getPresupuestoProductoOriginal().getId().equals(presupuestoproductoOriginal.getId())) {
					existe=true;
					presupuestoproductoOriginal.setId(presupuestoproductoAux.getId());
					presupuestoproductoOriginal.setVersionRow(presupuestoproductoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPresupuestoProducto(Boolean esParaCancelar) throws Exception {
		presupuestoproductosAux=new ArrayList<PresupuestoProducto>();
		presupuestoproductoAux=new PresupuestoProducto();
		
		if(!this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PresupuestoProducto presupuestoproductoAux:this.presupuestoproductoLogic.getPresupuestoProductos()) {
					if(presupuestoproductoAux.getId()<0) {
						presupuestoproductosAux.add(presupuestoproductoAux);
					}		
				}
				this.iIdNuevoPresupuestoProducto=0L;
				this.presupuestoproductoLogic.getPresupuestoProductos().removeAll(presupuestoproductosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresupuestoProducto presupuestoproductoAux:this.presupuestoproductos) {
					if(presupuestoproductoAux.getId()<0) {
						presupuestoproductosAux.add(presupuestoproductoAux);
					}		
				}
				this.iIdNuevoPresupuestoProducto=0L;
				this.presupuestoproductos.removeAll(presupuestoproductosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPresupuestoProducto 
					&& this.presupuestoproductoLogic.getPresupuestoProductos().size()>0
					) {
					presupuestoproductoAux=this.presupuestoproductoLogic.getPresupuestoProductos().get(this.presupuestoproductoLogic.getPresupuestoProductos().size() - 1);
				
					if(presupuestoproductoAux.getId()<0) {
						this.presupuestoproductoLogic.getPresupuestoProductos().remove(presupuestoproductoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPresupuestoProducto && this.presupuestoproductos.size()>0) {
					presupuestoproductoAux=this.presupuestoproductos.get(this.presupuestoproductos.size() - 1);
				
					if(presupuestoproductoAux.getId()<0) {
						this.presupuestoproductos.remove(presupuestoproductoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPresupuestoProducto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(presupuestoproducto.getId()<0) {
				this.presupuestoproductoLogic.getPresupuestoProductos().remove(this.presupuestoproducto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(presupuestoproducto.getId()<0) {
				this.presupuestoproductos.remove(this.presupuestoproducto);
			}
		}			
	}
	
	public void setEstadosInicialesPresupuestoProducto(List<PresupuestoProducto> presupuestoproductosAux) throws Exception {
		PresupuestoProductoConstantesFunciones.setEstadosInicialesPresupuestoProducto(presupuestoproductosAux);
	}
	
	public void setEstadosInicialesPresupuestoProducto(PresupuestoProducto presupuestoproductoAux) throws Exception {
		PresupuestoProductoConstantesFunciones.setEstadosInicialesPresupuestoProducto(presupuestoproductoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPresupuestoProductoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPresupuestoProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPresupuestoProductoActual()) {
				if(!this.isEsNuevoPresupuestoProducto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPresupuestoProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPresupuestoProducto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPresupuestoProductoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Presupuesto Producto ?", "MANTENIMIENTO DE Presupuesto Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPresupuestoProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PresupuestoProducto presupuestoproducto) throws Exception {
		PresupuestoProductoConstantesFunciones.seleccionarAsignar(this.presupuestoproducto,presupuestoproducto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPresupuestoProducto=this.isPermisoActualizarOriginalPresupuestoProducto;
			
			
			this.seleccionarAsignar(presupuestoproducto);
			
			

			idProductoActual=presupuestoproducto.getid_producto();
			this.seleccionarProductoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PresupuestoProductoConstantesFunciones.quitarEspaciosPresupuestoProducto(this.presupuestoproducto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesPresupuestoProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.presupuestoproductoSessionBean.setsFuncionBusquedaRapida(this.presupuestoproductoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoPresupuestoProducto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPresupuestoProducto(esParaCancelar);				
				this.cancelarNuevoPresupuestoProducto(esParaCancelar);								
			}
			
			this.presupuestoproducto=new PresupuestoProducto();
			
			this.inicializarPresupuestoProducto();
			
			this.actualizarEstadoCeldasBotonesPresupuestoProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPresupuestoProducto() throws Exception {
		try {
			PresupuestoProductoConstantesFunciones.inicializarPresupuestoProducto(this.presupuestoproducto);
			
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
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.presupuestoproductoLogic.getPresupuestoProductos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePresupuestoProductos(String sAccionBusqueda,List<PresupuestoProducto> presupuestoproductosParaReportes) throws Exception {
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
					sPathReporteFinal="PresupuestoProducto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PresupuestoProductoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PresupuestoProductoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PresupuestoProducto"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Presupuesto Productos");		
		parameters.put("busquedapor", PresupuestoProductoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePresupuestoProducto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PresupuestoProductoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PresupuestoProductoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePresupuestoProducto=new JRBeanArrayDataSource(PresupuestoProductoJInternalFrame.TraerPresupuestoProductoBeans(presupuestoproductosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePresupuestoProducto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PresupuestoProductoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PresupuestoProductoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PresupuestoProductoBean.TraerPresupuestoProductoBeans(presupuestoproductosParaReportes).toArray()));
							
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
				this.generarExcelReportePresupuestoProductos(sAccionBusqueda,sTipoArchivoReporte,presupuestoproductosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPresupuestoProductos(sAccionBusqueda,sTipoArchivoReporte,presupuestoproductosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPresupuestoProductoActionPerformed(null);
					//this.generarExcelReportePresupuestoProductos(sAccionBusqueda,sTipoArchivoReporte,presupuestoproductosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPresupuestoProductos(sAccionBusqueda,sTipoArchivoReporte,presupuestoproductosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPresupuestoProductos(sAccionBusqueda,sTipoArchivoReporte,presupuestoproductosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPresupuestoProductos(sAccionBusqueda,sTipoArchivoReporte,presupuestoproductosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePresupuestoProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<PresupuestoProducto> presupuestoproductosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestoproducto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PresupuestoProductos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPresupuestoProducto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PresupuestoProducto presupuestoproducto : presupuestoproductosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PresupuestoProductoConstantesFunciones.generarExcelReporteDataPresupuestoProducto("NORMAL",row,workbook,presupuestoproducto,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuesto Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPresupuestoProducto(String sTipo,Row row,Workbook workbook) {
		
		PresupuestoProductoConstantesFunciones.generarExcelReporteHeaderPresupuestoProducto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPresupuestoProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<PresupuestoProducto> presupuestoproductosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestoproducto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PresupuestoProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PresupuestoProducto presupuestoproducto : presupuestoproductosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PresupuestoProductoConstantesFunciones.getPresupuestoProductoDescripcion(presupuestoproducto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoProductoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoProductoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoproducto.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoProductoConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoProductoConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoproducto.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoProductoConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoProductoConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoproducto.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoProductoConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoProductoConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoproducto.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoProductoConstantesFunciones.LABEL_IDCUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoProductoConstantesFunciones.LABEL_IDCUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoproducto.getcuentacontable_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoProductoConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoProductoConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoproducto.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoProductoConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoProductoConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoproducto.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoProductoConstantesFunciones.LABEL_VALORINGRESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoProductoConstantesFunciones.LABEL_VALORINGRESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoproducto.getvalor_ingreso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoProductoConstantesFunciones.LABEL_VALOREGRESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoProductoConstantesFunciones.LABEL_VALOREGRESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoproducto.getvalor_egreso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoProductoConstantesFunciones.LABEL_CANTIDADINGRESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoProductoConstantesFunciones.LABEL_CANTIDADINGRESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoproducto.getcantidad_ingreso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoProductoConstantesFunciones.LABEL_CANTIDADEGRESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoProductoConstantesFunciones.LABEL_CANTIDADEGRESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoproducto.getcantidad_egreso());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuesto Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPresupuestoProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<PresupuestoProducto> presupuestoproductosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PresupuestoProducto> presupuestoproductosRespaldo=null;
		
		classes=PresupuestoProductoConstantesFunciones.getClassesRelationshipsOfPresupuestoProducto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.presupuestoproductoLogic.setDatosCliente(this.datosCliente);
		this.presupuestoproductoLogic.setDatosDeep(this.datosDeep);
		this.presupuestoproductoLogic.setIsConDeep(true);
		
		presupuestoproductosRespaldo=this.presupuestoproductoLogic.getPresupuestoProductos();
		
		this.presupuestoproductoLogic.setPresupuestoProductos(presupuestoproductosParaReportes);	
		this.presupuestoproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		presupuestoproductosParaReportes=this.presupuestoproductoLogic.getPresupuestoProductos();
		this.presupuestoproductoLogic.setPresupuestoProductos(presupuestoproductosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestoproducto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PresupuestoProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPresupuestoProducto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PresupuestoProducto presupuestoproducto : presupuestoproductosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPresupuestoProducto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PresupuestoProductoConstantesFunciones.generarExcelReporteDataPresupuestoProducto("NORMAL",row,workbook,presupuestoproducto,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(PresupuestoProductoConstantesFunciones.getPresupuestoProductoDescripcion(presupuestoproducto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuesto Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPresupuestoProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresupuestoProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPresupuestoProducto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresupuestoProducto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPresupuestoProducto() throws Exception {		
		this.startProcessPresupuestoProducto(true);
	}
	
	public void startProcessPresupuestoProducto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPresupuestoProducto ,this.jPanelParametrosReportesPresupuestoProducto, this.jScrollPanelDatosPresupuestoProducto,this.jPanelPaginacionPresupuestoProducto, this.jScrollPanelDatosEdicionPresupuestoProducto, this.jPanelAccionesPresupuestoProducto,this.jPanelAccionesFormularioPresupuestoProducto,this.jmenuBarPresupuestoProducto,this.jmenuBarDetallePresupuestoProducto,this.jTtoolBarPresupuestoProducto,this.jTtoolBarDetallePresupuestoProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasPresupuestoProducto=this.jTabbedPaneBusquedasPresupuestoProducto; 
		
		final JPanel jPanelParametrosReportesPresupuestoProducto=this.jPanelParametrosReportesPresupuestoProducto;
		//final JScrollPane jScrollPanelDatosPresupuestoProducto=this.jScrollPanelDatosPresupuestoProducto;
		final JTable jTableDatosPresupuestoProducto=this.jTableDatosPresupuestoProducto;		
		final JPanel jPanelPaginacionPresupuestoProducto=this.jPanelPaginacionPresupuestoProducto;
		//final JScrollPane jScrollPanelDatosEdicionPresupuestoProducto=this.jScrollPanelDatosEdicionPresupuestoProducto;
		final JPanel jPanelAccionesPresupuestoProducto=this.jPanelAccionesPresupuestoProducto;
		
		JPanel jPanelCamposAuxiliarPresupuestoProducto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPresupuestoProducto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
			jPanelCamposAuxiliarPresupuestoProducto=this.jInternalFrameDetalleFormPresupuestoProducto.jPanelCamposPresupuestoProducto;
			jPanelAccionesFormularioAuxiliarPresupuestoProducto=this.jInternalFrameDetalleFormPresupuestoProducto.jPanelAccionesFormularioPresupuestoProducto;
		}
		
		final JPanel jPanelCamposPresupuestoProducto=jPanelCamposAuxiliarPresupuestoProducto;
		final JPanel jPanelAccionesFormularioPresupuestoProducto=jPanelAccionesFormularioAuxiliarPresupuestoProducto;
		
		
		final JMenuBar jmenuBarPresupuestoProducto=this.jmenuBarPresupuestoProducto;
		final JToolBar jTtoolBarPresupuestoProducto=this.jTtoolBarPresupuestoProducto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPresupuestoProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPresupuestoProducto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
			jmenuBarDetalleAuxiliarPresupuestoProducto=this.jInternalFrameDetalleFormPresupuestoProducto.jmenuBarDetallePresupuestoProducto;
			jTtoolBarDetalleAuxiliarPresupuestoProducto=this.jInternalFrameDetalleFormPresupuestoProducto.jTtoolBarDetallePresupuestoProducto;
		}
		
		final JMenuBar jmenuBarDetallePresupuestoProducto=jmenuBarDetalleAuxiliarPresupuestoProducto;
		final JToolBar jTtoolBarDetallePresupuestoProducto=jTtoolBarDetalleAuxiliarPresupuestoProducto;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPresupuestoProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPresupuestoProducto;
			processRunnable.jTableDatos=jTableDatosPresupuestoProducto;
			processRunnable.jPanelCampos=jPanelCamposPresupuestoProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionPresupuestoProducto;
			processRunnable.jPanelAcciones=jPanelAccionesPresupuestoProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPresupuestoProducto;
			
			
			processRunnable.jmenuBar=jmenuBarPresupuestoProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePresupuestoProducto;
			processRunnable.jTtoolBar=jTtoolBarPresupuestoProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePresupuestoProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPresupuestoProducto ,jPanelParametrosReportesPresupuestoProducto,jTableDatosPresupuestoProducto, /*jScrollPanelDatosPresupuestoProducto,*/jPanelCamposPresupuestoProducto,jPanelPaginacionPresupuestoProducto, /*jScrollPanelDatosEdicionPresupuestoProducto,*/ jPanelAccionesPresupuestoProducto,jPanelAccionesFormularioPresupuestoProducto,jmenuBarPresupuestoProducto,jmenuBarDetallePresupuestoProducto,jTtoolBarPresupuestoProducto,jTtoolBarDetallePresupuestoProducto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPresupuestoProducto ,jPanelParametrosReportesPresupuestoProducto, jScrollPanelDatosPresupuestoProducto,jPanelPaginacionPresupuestoProducto, jScrollPanelDatosEdicionPresupuestoProducto, jPanelAccionesPresupuestoProducto,jPanelAccionesFormularioPresupuestoProducto,jmenuBarPresupuestoProducto,jmenuBarDetallePresupuestoProducto,jTtoolBarPresupuestoProducto,jTtoolBarDetallePresupuestoProducto);
						
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
	
	public void finishProcessPresupuestoProducto() {// throws Exception 
		this.finishProcessPresupuestoProducto(true);
	}
	
	public void finishProcessPresupuestoProducto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPresupuestoProducto ,this.jPanelParametrosReportesPresupuestoProducto, this.jScrollPanelDatosPresupuestoProducto,this.jPanelPaginacionPresupuestoProducto, this.jScrollPanelDatosEdicionPresupuestoProducto, this.jPanelAccionesPresupuestoProducto,this.jPanelAccionesFormularioPresupuestoProducto,this.jmenuBarPresupuestoProducto,this.jmenuBarDetallePresupuestoProducto,this.jTtoolBarPresupuestoProducto,this.jTtoolBarDetallePresupuestoProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasPresupuestoProducto=this.jTabbedPaneBusquedasPresupuestoProducto; 
		
		final JPanel jPanelParametrosReportesPresupuestoProducto=this.jPanelParametrosReportesPresupuestoProducto;
		//final JScrollPane jScrollPanelDatosPresupuestoProducto=this.jScrollPanelDatosPresupuestoProducto;
		final JTable jTableDatosPresupuestoProducto=this.jTableDatosPresupuestoProducto;		
		final JPanel jPanelPaginacionPresupuestoProducto=this.jPanelPaginacionPresupuestoProducto;
		//final JScrollPane jScrollPanelDatosEdicionPresupuestoProducto=this.jScrollPanelDatosEdicionPresupuestoProducto;
		final JPanel jPanelAccionesPresupuestoProducto=this.jPanelAccionesPresupuestoProducto;
		
		JPanel jPanelCamposAuxiliarPresupuestoProducto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPresupuestoProducto=new JPanel();
		
		if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
			jPanelCamposAuxiliarPresupuestoProducto=this.jInternalFrameDetalleFormPresupuestoProducto.jPanelCamposPresupuestoProducto;
			jPanelAccionesFormularioAuxiliarPresupuestoProducto=this.jInternalFrameDetalleFormPresupuestoProducto.jPanelAccionesFormularioPresupuestoProducto;
		}
		
		final JPanel jPanelCamposPresupuestoProducto=jPanelCamposAuxiliarPresupuestoProducto;
		final JPanel jPanelAccionesFormularioPresupuestoProducto=jPanelAccionesFormularioAuxiliarPresupuestoProducto;
		
		
		final JMenuBar jmenuBarPresupuestoProducto=this.jmenuBarPresupuestoProducto;		
		final JToolBar jTtoolBarPresupuestoProducto=this.jTtoolBarPresupuestoProducto;
				
		JMenuBar jmenuBarDetalleAuxiliarPresupuestoProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPresupuestoProducto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
			jmenuBarDetalleAuxiliarPresupuestoProducto=this.jInternalFrameDetalleFormPresupuestoProducto.jmenuBarDetallePresupuestoProducto;
			jTtoolBarDetalleAuxiliarPresupuestoProducto=this.jInternalFrameDetalleFormPresupuestoProducto.jTtoolBarDetallePresupuestoProducto;		
		}
		
		final JMenuBar jmenuBarDetallePresupuestoProducto=jmenuBarDetalleAuxiliarPresupuestoProducto;
		final JToolBar jTtoolBarDetallePresupuestoProducto=jTtoolBarDetalleAuxiliarPresupuestoProducto;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPresupuestoProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPresupuestoProducto;
			processRunnable.jTableDatos=jTableDatosPresupuestoProducto;
			processRunnable.jPanelCampos=jPanelCamposPresupuestoProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionPresupuestoProducto;
			processRunnable.jPanelAcciones=jPanelAccionesPresupuestoProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPresupuestoProducto;
			
			
			processRunnable.jmenuBar=jmenuBarPresupuestoProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePresupuestoProducto;
			processRunnable.jTtoolBar=jTtoolBarPresupuestoProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePresupuestoProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPresupuestoProducto ,jPanelParametrosReportesPresupuestoProducto, jTableDatosPresupuestoProducto,/*jScrollPanelDatosPresupuestoProducto,*/jPanelCamposPresupuestoProducto,jPanelPaginacionPresupuestoProducto, /*jScrollPanelDatosEdicionPresupuestoProducto,*/ jPanelAccionesPresupuestoProducto,jPanelAccionesFormularioPresupuestoProducto,jmenuBarPresupuestoProducto,jmenuBarDetallePresupuestoProducto,jTtoolBarPresupuestoProducto,jTtoolBarDetallePresupuestoProducto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPresupuestoProducto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPresupuestoProducto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPresupuestoProducto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPresupuestoProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPresupuestoProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePresupuestoProducto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPresupuestoProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPresupuestoProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePresupuestoProducto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.presupuestoproductoConstantesFunciones.getsFinalQueryPresupuestoProducto();
		String  finalQueryPaginacionTodos=this.presupuestoproductoConstantesFunciones.getsFinalQueryPresupuestoProducto();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PresupuestoProductoConstantesFunciones.getArrayColumnasGlobalesNoPresupuestoProducto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PresupuestoProductoConstantesFunciones.getArrayColumnasGlobalesPresupuestoProducto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PresupuestoProductoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.presupuestoproductosEliminados= new ArrayList<PresupuestoProducto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPresupuestoProducto();
		
				///*PresupuestoProductoSessionBean*/this.presupuestoproductoSessionBean=new PresupuestoProductoSessionBean();
			
			if(this.presupuestoproductoSessionBean==null) {
				this.presupuestoproductoSessionBean=new PresupuestoProductoSessionBean();
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
					this.iNumeroPaginacion=PresupuestoProductoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PresupuestoProductoConstantesFunciones.getClassesForeignKeysOfPresupuestoProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/presupuestoproducto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			presupuestoproductosAux= new ArrayList<PresupuestoProducto>();
			
				
			presupuestoproductoLogic.setDatosCliente(this.datosCliente);
			presupuestoproductoLogic.setDatosDeep(this.datosDeep);
			presupuestoproductoLogic.setIsConDeep(true);
			
			
			presupuestoproductoLogic.getPresupuestoProductoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					presupuestoproductoLogic.getTodosPresupuestoProductos(finalQueryGlobal,pagination);
					
					//presupuestoproductoLogic.getTodosPresupuestoProductosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(presupuestoproductoLogic.getPresupuestoProductos()==null|| presupuestoproductoLogic.getPresupuestoProductos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							presupuestoproductosAux= new ArrayList<PresupuestoProducto>();
							presupuestoproductosAux.addAll(presupuestoproductoLogic.getPresupuestoProductos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoproductosAux= new ArrayList<PresupuestoProducto>();
							presupuestoproductosAux.addAll(presupuestoproductos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							presupuestoproductoLogic.getTodosPresupuestoProductos(finalQueryGlobal+"",this.pagination);												
							
							//presupuestoproductoLogic.getTodosPresupuestoProductosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportePresupuestoProductos("Todos",presupuestoproductoLogic.getPresupuestoProductos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							presupuestoproductoLogic.setPresupuestoProductos(new ArrayList<PresupuestoProducto>());					
							presupuestoproductoLogic.getPresupuestoProductos().addAll(presupuestoproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoproductos=new ArrayList<PresupuestoProducto>();
							presupuestoproductos.addAll(presupuestoproductosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPresupuestoProducto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPresupuestoProducto=this.idActual;
				
				} else if(this.idPresupuestoProductoActual!=null && this.idPresupuestoProductoActual!=0L) {
					idPresupuestoProducto=idPresupuestoProductoActual;
				}
				
					
				this.sDetalleReporte=PresupuestoProductoConstantesFunciones.getDetalleIndicePorId(idPresupuestoProducto);
				
				this.presupuestoproductos=new ArrayList<PresupuestoProducto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					presupuestoproductoLogic.getEntity(idPresupuestoProducto);
					
					//presupuestoproductoLogic.getEntityWithConnection(idPresupuestoProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presupuestoproductoLogic.setPresupuestoProductos(new ArrayList<PresupuestoProducto>());
					presupuestoproductoLogic.getPresupuestoProductos().add(presupuestoproductoLogic.getPresupuestoProducto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestoproductos=new ArrayList<PresupuestoProducto>();
					this.presupuestoproductos.add(presupuestoproducto);
				}
				
				if(presupuestoproductoLogic.getPresupuestoProducto()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdBodega")) {
				this.sDetalleReporte=PresupuestoProductoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presupuestoproductoLogic.getPresupuestoProductosFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoProductoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoProductoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presupuestoproductoLogic.getPresupuestoProductos()==null||presupuestoproductoLogic.getPresupuestoProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presupuestoproductos==null|| presupuestoproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoproductosAux=new ArrayList<PresupuestoProducto>();
						presupuestoproductosAux.addAll(presupuestoproductoLogic.getPresupuestoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoproductosAux=new ArrayList<PresupuestoProducto>();
							presupuestoproductosAux.addAll(presupuestoproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presupuestoproductoLogic.getPresupuestoProductosFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoProductoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoProductoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresupuestoProductos("FK_IdBodega",presupuestoproductoLogic.getPresupuestoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresupuestoProductos("FK_IdBodega",presupuestoproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoproductoLogic.setPresupuestoProductos(new ArrayList<PresupuestoProducto>());
						presupuestoproductoLogic.getPresupuestoProductos().addAll(presupuestoproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoproductos=new ArrayList<PresupuestoProducto>();
							presupuestoproductos.addAll(presupuestoproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCuentaContable")) {
				this.sDetalleReporte=PresupuestoProductoConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presupuestoproductoLogic.getPresupuestoProductosFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoProductoConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoProductoConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presupuestoproductoLogic.getPresupuestoProductos()==null||presupuestoproductoLogic.getPresupuestoProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presupuestoproductos==null|| presupuestoproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoproductosAux=new ArrayList<PresupuestoProducto>();
						presupuestoproductosAux.addAll(presupuestoproductoLogic.getPresupuestoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoproductosAux=new ArrayList<PresupuestoProducto>();
							presupuestoproductosAux.addAll(presupuestoproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presupuestoproductoLogic.getPresupuestoProductosFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoProductoConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoProductoConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresupuestoProductos("FK_IdCuentaContable",presupuestoproductoLogic.getPresupuestoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresupuestoProductos("FK_IdCuentaContable",presupuestoproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoproductoLogic.setPresupuestoProductos(new ArrayList<PresupuestoProducto>());
						presupuestoproductoLogic.getPresupuestoProductos().addAll(presupuestoproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoproductos=new ArrayList<PresupuestoProducto>();
							presupuestoproductos.addAll(presupuestoproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEjercicio")) {
				this.sDetalleReporte=PresupuestoProductoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presupuestoproductoLogic.getPresupuestoProductosFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoProductoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoProductoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presupuestoproductoLogic.getPresupuestoProductos()==null||presupuestoproductoLogic.getPresupuestoProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presupuestoproductos==null|| presupuestoproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoproductosAux=new ArrayList<PresupuestoProducto>();
						presupuestoproductosAux.addAll(presupuestoproductoLogic.getPresupuestoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoproductosAux=new ArrayList<PresupuestoProducto>();
							presupuestoproductosAux.addAll(presupuestoproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presupuestoproductoLogic.getPresupuestoProductosFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoProductoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoProductoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresupuestoProductos("FK_IdEjercicio",presupuestoproductoLogic.getPresupuestoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresupuestoProductos("FK_IdEjercicio",presupuestoproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoproductoLogic.setPresupuestoProductos(new ArrayList<PresupuestoProducto>());
						presupuestoproductoLogic.getPresupuestoProductos().addAll(presupuestoproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoproductos=new ArrayList<PresupuestoProducto>();
							presupuestoproductos.addAll(presupuestoproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=PresupuestoProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presupuestoproductoLogic.getPresupuestoProductosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presupuestoproductoLogic.getPresupuestoProductos()==null||presupuestoproductoLogic.getPresupuestoProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presupuestoproductos==null|| presupuestoproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoproductosAux=new ArrayList<PresupuestoProducto>();
						presupuestoproductosAux.addAll(presupuestoproductoLogic.getPresupuestoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoproductosAux=new ArrayList<PresupuestoProducto>();
							presupuestoproductosAux.addAll(presupuestoproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presupuestoproductoLogic.getPresupuestoProductosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresupuestoProductos("FK_IdEmpresa",presupuestoproductoLogic.getPresupuestoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresupuestoProductos("FK_IdEmpresa",presupuestoproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoproductoLogic.setPresupuestoProductos(new ArrayList<PresupuestoProducto>());
						presupuestoproductoLogic.getPresupuestoProductos().addAll(presupuestoproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoproductos=new ArrayList<PresupuestoProducto>();
							presupuestoproductos.addAll(presupuestoproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPeriodo")) {
				this.sDetalleReporte=PresupuestoProductoConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presupuestoproductoLogic.getPresupuestoProductosFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoProductoConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoProductoConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presupuestoproductoLogic.getPresupuestoProductos()==null||presupuestoproductoLogic.getPresupuestoProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presupuestoproductos==null|| presupuestoproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoproductosAux=new ArrayList<PresupuestoProducto>();
						presupuestoproductosAux.addAll(presupuestoproductoLogic.getPresupuestoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoproductosAux=new ArrayList<PresupuestoProducto>();
							presupuestoproductosAux.addAll(presupuestoproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presupuestoproductoLogic.getPresupuestoProductosFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoProductoConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoProductoConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresupuestoProductos("FK_IdPeriodo",presupuestoproductoLogic.getPresupuestoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresupuestoProductos("FK_IdPeriodo",presupuestoproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoproductoLogic.setPresupuestoProductos(new ArrayList<PresupuestoProducto>());
						presupuestoproductoLogic.getPresupuestoProductos().addAll(presupuestoproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoproductos=new ArrayList<PresupuestoProducto>();
							presupuestoproductos.addAll(presupuestoproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdProducto")) {
				this.sDetalleReporte=PresupuestoProductoConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presupuestoproductoLogic.getPresupuestoProductosFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoProductoConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoProductoConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presupuestoproductoLogic.getPresupuestoProductos()==null||presupuestoproductoLogic.getPresupuestoProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presupuestoproductos==null|| presupuestoproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoproductosAux=new ArrayList<PresupuestoProducto>();
						presupuestoproductosAux.addAll(presupuestoproductoLogic.getPresupuestoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoproductosAux=new ArrayList<PresupuestoProducto>();
							presupuestoproductosAux.addAll(presupuestoproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presupuestoproductoLogic.getPresupuestoProductosFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoProductoConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoProductoConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresupuestoProductos("FK_IdProducto",presupuestoproductoLogic.getPresupuestoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresupuestoProductos("FK_IdProducto",presupuestoproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoproductoLogic.setPresupuestoProductos(new ArrayList<PresupuestoProducto>());
						presupuestoproductoLogic.getPresupuestoProductos().addAll(presupuestoproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoproductos=new ArrayList<PresupuestoProducto>();
							presupuestoproductos.addAll(presupuestoproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=PresupuestoProductoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presupuestoproductoLogic.getPresupuestoProductosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoProductoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoProductoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presupuestoproductoLogic.getPresupuestoProductos()==null||presupuestoproductoLogic.getPresupuestoProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presupuestoproductos==null|| presupuestoproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoproductosAux=new ArrayList<PresupuestoProducto>();
						presupuestoproductosAux.addAll(presupuestoproductoLogic.getPresupuestoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoproductosAux=new ArrayList<PresupuestoProducto>();
							presupuestoproductosAux.addAll(presupuestoproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presupuestoproductoLogic.getPresupuestoProductosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoProductoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoProductoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresupuestoProductos("FK_IdSucursal",presupuestoproductoLogic.getPresupuestoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresupuestoProductos("FK_IdSucursal",presupuestoproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoproductoLogic.setPresupuestoProductos(new ArrayList<PresupuestoProducto>());
						presupuestoproductoLogic.getPresupuestoProductos().addAll(presupuestoproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoproductos=new ArrayList<PresupuestoProducto>();
							presupuestoproductos.addAll(presupuestoproductosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPresupuestoProducto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPresupuestoProducto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=presupuestoproductoLogic.getPresupuestoProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=presupuestoproductos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=presupuestoproductoLogic.getPresupuestoProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=presupuestoproductos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PresupuestoProducto presupuestoproducto) {
		Boolean permite=true;
		
		if(this.presupuestoproducto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PresupuestoProductoConstantesFunciones.getOrderByListaPresupuestoProducto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PresupuestoProductoConstantesFunciones.getOrderByListaPresupuestoProducto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresupuestoProducto presupuestoproducto:presupuestoproductoLogic.getPresupuestoProductos()) {
				if(presupuestoproducto.getsType().equals(Constantes2.S_TOTALES)) {
					presupuestoproductoTotales=presupuestoproducto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresupuestoProducto presupuestoproducto:this.presupuestoproductos) {
				if(presupuestoproducto.getsType().equals(Constantes2.S_TOTALES)) {
					presupuestoproductoTotales=presupuestoproducto;
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
			this.presupuestoproductoAux=new PresupuestoProducto();
			this.presupuestoproductoAux.setsType(Constantes2.S_TOTALES);
			this.presupuestoproductoAux.setIsNew(false);
			this.presupuestoproductoAux.setIsChanged(false);
			this.presupuestoproductoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				PresupuestoProductoConstantesFunciones.TotalizarValoresFilaPresupuestoProducto(this.presupuestoproductoLogic.getPresupuestoProductos(),this.presupuestoproductoAux);
				
				this.presupuestoproductoLogic.getPresupuestoProductos().add(this.presupuestoproductoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PresupuestoProductoConstantesFunciones.TotalizarValoresFilaPresupuestoProducto(this.presupuestoproductos,this.presupuestoproductoAux);
				
				this.presupuestoproductos.add(this.presupuestoproductoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		presupuestoproductoTotales=new PresupuestoProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.presupuestoproductoLogic.getPresupuestoProductos().remove(presupuestoproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.presupuestoproductos.remove(presupuestoproductoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		presupuestoproductoTotales=new PresupuestoProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresupuestoProducto presupuestoproducto:presupuestoproductoLogic.getPresupuestoProductos()) {
				if(presupuestoproducto.getsType().equals(Constantes2.S_TOTALES)) {
					presupuestoproductoTotales=presupuestoproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PresupuestoProductoConstantesFunciones.TotalizarValoresFilaPresupuestoProducto(this.presupuestoproductoLogic.getPresupuestoProductos(),presupuestoproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresupuestoProducto presupuestoproducto:this.presupuestoproductos) {
				if(presupuestoproducto.getsType().equals(Constantes2.S_TOTALES)) {
					presupuestoproductoTotales=presupuestoproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PresupuestoProductoConstantesFunciones.TotalizarValoresFilaPresupuestoProducto(this.presupuestoproductos,presupuestoproductoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPresupuestoProductosFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresupuestoProductosFK_IdCuentaContable()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresupuestoProductosFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresupuestoProductosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresupuestoProductosFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresupuestoProductosFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresupuestoProductosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPresupuestoProductosFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presupuestoproductoLogic.getPresupuestoProductosFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresupuestoProductosFK_IdCuentaContable(String sFinalQuery,Long id_cuenta_contable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presupuestoproductoLogic.getPresupuestoProductosFK_IdCuentaContable(sFinalQuery,this.pagination,id_cuenta_contable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresupuestoProductosFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presupuestoproductoLogic.getPresupuestoProductosFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresupuestoProductosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presupuestoproductoLogic.getPresupuestoProductosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresupuestoProductosFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presupuestoproductoLogic.getPresupuestoProductosFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresupuestoProductosFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presupuestoproductoLogic.getPresupuestoProductosFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresupuestoProductosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presupuestoproductoLogic.getPresupuestoProductosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosPresupuestoProducto() {
		this.isPermisoTodoPresupuestoProducto=false;
		this.isPermisoNuevoPresupuestoProducto=false;
		this.isPermisoActualizarPresupuestoProducto=false;
		this.isPermisoActualizarOriginalPresupuestoProducto=false;
		this.isPermisoEliminarPresupuestoProducto=false;
		this.isPermisoGuardarCambiosPresupuestoProducto=false;
		this.isPermisoConsultaPresupuestoProducto=false;
		this.isPermisoBusquedaPresupuestoProducto=false;
		this.isPermisoReportePresupuestoProducto=false;		
		this.isPermisoOrdenPresupuestoProducto=false;		
		this.isPermisoPaginacionMedioPresupuestoProducto=false;		
		this.isPermisoPaginacionAltoPresupuestoProducto=false;
		this.isPermisoPaginacionTodoPresupuestoProducto=false;
		this.isPermisoCopiarPresupuestoProducto=false;		
		this.isPermisoVerFormPresupuestoProducto=false;		
		this.isPermisoDuplicarPresupuestoProducto=false;		
		this.isPermisoOrdenPresupuestoProducto=false;		
	}
	
	public void setPermisosUsuarioPresupuestoProducto(Boolean isPermiso) {
		this.isPermisoTodoPresupuestoProducto=isPermiso;
		this.isPermisoNuevoPresupuestoProducto=isPermiso;
		this.isPermisoActualizarPresupuestoProducto=isPermiso;
		this.isPermisoActualizarOriginalPresupuestoProducto=isPermiso;
		this.isPermisoEliminarPresupuestoProducto=isPermiso;
		this.isPermisoGuardarCambiosPresupuestoProducto=isPermiso;
		this.isPermisoConsultaPresupuestoProducto=isPermiso;
		this.isPermisoBusquedaPresupuestoProducto=isPermiso;
		this.isPermisoReportePresupuestoProducto=isPermiso;
		this.isPermisoOrdenPresupuestoProducto=isPermiso;		
		this.isPermisoPaginacionMedioPresupuestoProducto=isPermiso;		
		this.isPermisoPaginacionAltoPresupuestoProducto=isPermiso;		
		this.isPermisoPaginacionTodoPresupuestoProducto=isPermiso;		
		this.isPermisoCopiarPresupuestoProducto=isPermiso;		
		this.isPermisoVerFormPresupuestoProducto=isPermiso;		
		this.isPermisoDuplicarPresupuestoProducto=isPermiso;
		this.isPermisoOrdenPresupuestoProducto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPresupuestoProducto(Boolean isPermiso) {
		//this.isPermisoTodoPresupuestoProducto=isPermiso;
		this.isPermisoNuevoPresupuestoProducto=isPermiso;
		this.isPermisoActualizarPresupuestoProducto=isPermiso;
		this.isPermisoActualizarOriginalPresupuestoProducto=isPermiso;
		this.isPermisoEliminarPresupuestoProducto=isPermiso;
		this.isPermisoGuardarCambiosPresupuestoProducto=isPermiso;
		//this.isPermisoConsultaPresupuestoProducto=isPermiso;
		//this.isPermisoBusquedaPresupuestoProducto=isPermiso;
		//this.isPermisoReportePresupuestoProducto=isPermiso;
		//this.isPermisoOrdenPresupuestoProducto=isPermiso;		
		//this.isPermisoPaginacionMedioPresupuestoProducto=isPermiso;		
		//this.isPermisoPaginacionAltoPresupuestoProducto=isPermiso;		
		//this.isPermisoPaginacionTodoPresupuestoProducto=isPermiso;		
		//this.isPermisoCopiarPresupuestoProducto=isPermiso;		
		//this.isPermisoDuplicarPresupuestoProducto=isPermiso;
		//this.isPermisoOrdenPresupuestoProducto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPresupuestoProductoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(PresupuestoProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebPresupuestoProducto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPresupuestoProductoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioPresupuestoProductoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPresupuestoProductoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPresupuestoProductoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioPresupuestoProducto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PresupuestoProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PresupuestoProductoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPresupuestoProducto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPresupuestoProducto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPresupuestoProducto=this.isPermisoActualizarPresupuestoProducto;
			this.isPermisoEliminarPresupuestoProducto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPresupuestoProducto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPresupuestoProducto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPresupuestoProducto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPresupuestoProducto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePresupuestoProducto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPresupuestoProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPresupuestoProducto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPresupuestoProducto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPresupuestoProducto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPresupuestoProducto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPresupuestoProducto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPresupuestoProducto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPresupuestoProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPresupuestoProducto.setToolTipText(this.jTableDatosPresupuestoProducto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPresupuestoProducto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPresupuestoProducto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PresupuestoProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PresupuestoProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPresupuestoProducto() throws Exception {
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
	public void inicializarCombosForeignKeyPresupuestoProductoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
				this.cuentacontablesForeignKey=new ArrayList();
				this.bodegasForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPresupuestoProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PresupuestoProductoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyPresupuestoProductoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEjercicioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EjercicioConstantesFunciones.SFINALQUERY;

				this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPeriodoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PeriodoConstantesFunciones.SFINALQUERY;

				this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaContableListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cuentacontablesForeignKey==null||this.cuentacontablesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CuentaContableConstantesFunciones.SFINALQUERY;

				this.cargarCombosCuentaContablesForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyPresupuestoProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			PresupuestoProductoParameterReturnGeneral presupuestoproductoReturnGeneral=new PresupuestoProductoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.presupuestoproductoConstantesFunciones.cargarid_empresaPresupuestoProducto)
					 || (this.esRecargarFks && this.presupuestoproductoConstantesFunciones.cargarid_empresaPresupuestoProducto)) {

					if(!this.presupuestoproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+presupuestoproductoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.presupuestoproductoConstantesFunciones.cargarid_sucursalPresupuestoProducto)
					 || (this.esRecargarFks && this.presupuestoproductoConstantesFunciones.cargarid_sucursalPresupuestoProducto)) {

					if(!this.presupuestoproductoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+presupuestoproductoSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.presupuestoproductoConstantesFunciones.cargarid_ejercicioPresupuestoProducto)
					 || (this.esRecargarFks && this.presupuestoproductoConstantesFunciones.cargarid_ejercicioPresupuestoProducto)) {

					if(!this.presupuestoproductoSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+presupuestoproductoSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalPeriodo="";

				if(((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0) && this.presupuestoproductoConstantesFunciones.cargarid_periodoPresupuestoProducto)
					 || (this.esRecargarFks && this.presupuestoproductoConstantesFunciones.cargarid_periodoPresupuestoProducto)) {

					if(!this.presupuestoproductoSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPeriodo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

						finalQueryGlobalPeriodo=Funciones.GetFinalQueryAppend(finalQueryGlobalPeriodo, "");
						finalQueryGlobalPeriodo+=PeriodoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPeriodo=" WHERE " + ConstantesSql.ID + "="+presupuestoproductoSessionBean.getlidPeriodoActual();
					}
				} else {
					finalQueryGlobalPeriodo="NONE";
				}


				String finalQueryGlobalCuentaContable="";

				if(((this.cuentacontablesForeignKey==null||this.cuentacontablesForeignKey.size()<=0) && this.presupuestoproductoConstantesFunciones.cargarid_cuenta_contablePresupuestoProducto)
					 || (this.esRecargarFks && this.presupuestoproductoConstantesFunciones.cargarid_cuenta_contablePresupuestoProducto)) {

					if(!this.presupuestoproductoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContable=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContable=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContable, "");
						finalQueryGlobalCuentaContable+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContablesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContable=" WHERE " + ConstantesSql.ID + "="+presupuestoproductoSessionBean.getlidCuentaContableActual();
					}
				} else {
					finalQueryGlobalCuentaContable="NONE";
				}


				String finalQueryGlobalBodega="";

				if(((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0) && this.presupuestoproductoConstantesFunciones.cargarid_bodegaPresupuestoProducto)
					 || (this.esRecargarFks && this.presupuestoproductoConstantesFunciones.cargarid_bodegaPresupuestoProducto)) {

					if(!this.presupuestoproductoSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBodega=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

						finalQueryGlobalBodega=Funciones.GetFinalQueryAppend(finalQueryGlobalBodega, "");
						finalQueryGlobalBodega+=BodegaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBodega=" WHERE " + ConstantesSql.ID + "="+presupuestoproductoSessionBean.getlidBodegaActual();
					}
				} else {
					finalQueryGlobalBodega="NONE";
				}


				String finalQueryGlobalProducto="";

				if(((this.productosForeignKey==null||this.productosForeignKey.size()<=0) && this.presupuestoproductoConstantesFunciones.cargarid_productoPresupuestoProducto)
					 || (this.esRecargarFks && this.presupuestoproductoConstantesFunciones.cargarid_productoPresupuestoProducto)) {

					if(!this.presupuestoproductoSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalProducto, "");
						finalQueryGlobalProducto+=ProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProducto=" WHERE " + ConstantesSql.ID + "="+presupuestoproductoSessionBean.getlidProductoActual();
					}
				} else {
					finalQueryGlobalProducto="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				presupuestoproductoReturnGeneral=presupuestoproductoLogic.cargarCombosLoteForeignKeyPresupuestoProducto(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEjercicio,finalQueryGlobalPeriodo,finalQueryGlobalCuentaContable,finalQueryGlobalBodega,finalQueryGlobalProducto);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=presupuestoproductoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=presupuestoproductoReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=presupuestoproductoReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalPeriodo.equals("NONE")) {
				this.periodosForeignKey=presupuestoproductoReturnGeneral.getperiodosForeignKey();
			}

			if(!finalQueryGlobalCuentaContable.equals("NONE")) {
				this.cuentacontablesForeignKey=presupuestoproductoReturnGeneral.getcuentacontablesForeignKey();
			}

			if(!finalQueryGlobalBodega.equals("NONE")) {
				this.bodegasForeignKey=presupuestoproductoReturnGeneral.getbodegasForeignKey();
			}

			if(!finalQueryGlobalProducto.equals("NONE")) {
				this.productosForeignKey=presupuestoproductoReturnGeneral.getproductosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyPresupuestoProducto()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
			this.addItemDefectoCombosForeignKeyCuentaContable();
			this.addItemDefectoCombosForeignKeyBodega();
			this.addItemDefectoCombosForeignKeyProducto();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.presupuestoproductoSessionBean==null) {
				this.presupuestoproductoSessionBean=new PresupuestoProductoSessionBean();
			}

			if(!this.presupuestoproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.presupuestoproductoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyEjercicio()throws Exception {
		try {

			if(!this.presupuestoproductoSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				Ejercicio ejercicio=new Ejercicio();
				EjercicioConstantesFunciones.setEjercicioDescripcion(ejercicio,Constantes.SMENSAJE_ESCOJA_OPCION);
				ejercicio.setId(null);

				if(!EjercicioConstantesFunciones.ExisteEnLista(this.ejerciciosForeignKey,ejercicio,true)) {

					this.ejerciciosForeignKey.add(0,ejercicio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyPeriodo()throws Exception {
		try {

			if(!this.presupuestoproductoSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
				Periodo periodo=new Periodo();
				PeriodoConstantesFunciones.setPeriodoDescripcion(periodo,Constantes.SMENSAJE_ESCOJA_OPCION);
				periodo.setId(null);

				if(!PeriodoConstantesFunciones.ExisteEnLista(this.periodosForeignKey,periodo,true)) {

					this.periodosForeignKey.add(0,periodo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCuentaContable()throws Exception {
		try {

			if(!this.presupuestoproductoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
				CuentaContable cuentacontable=new CuentaContable();
				CuentaContableConstantesFunciones.setCuentaContableDescripcion(cuentacontable,Constantes.SMENSAJE_ESCOJA_OPCION);
				cuentacontable.setId(null);

				if(!CuentaContableConstantesFunciones.ExisteEnLista(this.cuentacontablesForeignKey,cuentacontable,true)) {

					this.cuentacontablesForeignKey.add(0,cuentacontable);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyBodega()throws Exception {
		try {

			if(!this.presupuestoproductoSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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

			if(!this.presupuestoproductoSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
	
	public void initActionsCombosTodosForeignKeyPresupuestoProducto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPresupuestoProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPresupuestoProducto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualEjercicioForeignKey(this.parametroGeneralUsuario.getid_ejercicio(),false,"Formulario");
				this.setActualPeriodoForeignKey(this.parametroGeneralUsuario.getid_periodo(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPresupuestoProducto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPresupuestoProducto(PresupuestoProducto presupuestoproducto)throws Exception {	
		try {
			
			this.setActualCuentaContableForeignKey(presupuestoproducto.getid_cuenta_contable(),false,"Formulario");
			this.setActualBodegaForeignKey(presupuestoproducto.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(presupuestoproducto.getid_producto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPresupuestoProducto(PresupuestoProducto presupuestoproducto,String sTipoEvento)throws Exception {	
		try {
			
			

				if(presupuestoproducto.getProducto()!=null && !sTipoEvento.equals("id_productoPresupuestoProducto")) { //sTipoEvento Evita Bucle Infinito

					this.productosForeignKey=new ArrayList<Producto>();
					this.productosForeignKey.add(presupuestoproducto.getProducto());

					this.addItemDefectoCombosForeignKeyProducto();
					this.cargarCombosFrameProductosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPresupuestoProducto()throws Exception {	
		try {
			
			this.setActualCuentaContableForeignKey(this.presupuestoproductoConstantesFunciones.getid_cuenta_contable(),false,"Formulario");
			this.setActualBodegaForeignKey(this.presupuestoproductoConstantesFunciones.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(this.presupuestoproductoConstantesFunciones.getid_producto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPresupuestoProducto()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_ejercicioPresupuestoProducto.getSelectedItem();
				}

				if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_periodoPresupuestoProducto.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPresupuestoProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPresupuestoProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPresupuestoProducto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPresupuestoProducto()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");
			this.cargarCombosFrameCuentaContablesForeignKey("Todos");
			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPresupuestoProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContablesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPresupuestoProducto()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_empresaPresupuestoProducto!=null && this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_empresaPresupuestoProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_empresaPresupuestoProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_sucursalPresupuestoProducto!=null && this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_sucursalPresupuestoProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_sucursalPresupuestoProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_ejercicioPresupuestoProducto!=null && this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_ejercicioPresupuestoProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_ejercicioPresupuestoProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_periodoPresupuestoProducto!=null && this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_periodoPresupuestoProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_periodoPresupuestoProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_cuenta_contablePresupuestoProducto!=null && this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_cuenta_contablePresupuestoProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_cuenta_contablePresupuestoProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_bodegaPresupuestoProducto!=null && this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_bodegaPresupuestoProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_bodegaPresupuestoProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_productoPresupuestoProducto!=null && this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_productoPresupuestoProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_productoPresupuestoProducto.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	














	
	

	public PresupuestoProductoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PresupuestoProductoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PresupuestoProductoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.presupuestoproductoSessionBean=new PresupuestoProductoSessionBean(); 
		this.presupuestoproductoConstantesFunciones=new PresupuestoProductoConstantesFunciones(); 
		this.presupuestoproductoBean=new PresupuestoProducto();//(this.presupuestoproductoConstantesFunciones); 		
		this.presupuestoproductoReturnGeneral=new PresupuestoProductoParameterReturnGeneral(); 
		
		this.presupuestoproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presupuestoproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PresupuestoProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PresupuestoProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PresupuestoProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPresupuestoProducto(true);
			
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
			
			this.presupuestoproductoConstantesFunciones=new PresupuestoProductoConstantesFunciones(); 
			this.presupuestoproductoBean=new PresupuestoProducto();//this.presupuestoproductoConstantesFunciones); 			
			this.presupuestoproductoReturnGeneral=new PresupuestoProductoParameterReturnGeneral(); 
		
			PresupuestoProductoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Presupuesto Producto Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.presupuestoproducto=new PresupuestoProducto();
			this.presupuestoproductos = new ArrayList<PresupuestoProducto>();
			this.presupuestoproductosAux = new ArrayList<PresupuestoProducto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic=new PresupuestoProductoLogic();
				this.presupuestoproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.presupuestoproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.presupuestoproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPresupuestoProducto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPresupuestoProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPresupuestoProducto);	
					}
					
					if(this.jInternalFrameImportacionPresupuestoProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPresupuestoProducto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPresupuestoProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPresupuestoProducto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPresupuestoProducto);
				this.jInternalFrameDetalleFormPresupuestoProducto.setVisible(false);
				this.jInternalFrameDetalleFormPresupuestoProducto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPresupuestoProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPresupuestoProducto);
					this.jInternalFrameReporteDinamicoPresupuestoProducto.setVisible(false);
					this.jInternalFrameReporteDinamicoPresupuestoProducto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPresupuestoProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPresupuestoProducto);
					this.jInternalFrameImportacionPresupuestoProducto.setVisible(false);
					this.jInternalFrameImportacionPresupuestoProducto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPresupuestoProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPresupuestoProducto);
					this.jInternalFrameOrderByPresupuestoProducto.setVisible(false);
					this.jInternalFrameOrderByPresupuestoProducto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPresupuestoProductoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PresupuestoProductoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.presupuestoproductoReturnGeneral=new PresupuestoProductoParameterReturnGeneral();
			
			this.presupuestoproductoParameterGeneral=new PresupuestoProductoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.presupuestoproductoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PresupuestoProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PresupuestoProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.presupuestoproductoSessionBean.getEsGuardarRelacionado(),this.presupuestoproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PresupuestoProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.presupuestoproductoSessionBean.getEsGuardarRelacionado(),this.presupuestoproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPresupuestoProducto=false;
			this.isVisibilidadCeldaDuplicarPresupuestoProducto=true;
			this.isVisibilidadCeldaCopiarPresupuestoProducto=true;
			this.isVisibilidadCeldaVerFormPresupuestoProducto=true;
			this.isVisibilidadCeldaOrdenPresupuestoProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoProducto=false;
			this.isVisibilidadCeldaModificarPresupuestoProducto=false;
			this.isVisibilidadCeldaActualizarPresupuestoProducto=false;
			this.isVisibilidadCeldaEliminarPresupuestoProducto=false;
			this.isVisibilidadCeldaCancelarPresupuestoProducto=false;
			this.isVisibilidadCeldaGuardarPresupuestoProducto=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoProducto=false;
			
			
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdCuentaContable=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdPeriodo=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPresupuestoProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPresupuestoProducto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPresupuestoProducto(false);
			
			this.setPermisosUsuarioPresupuestoProducto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.presupuestoproductoSessionBean.getEsGuardarRelacionado() 
				|| (this.presupuestoproductoSessionBean.getEsGuardarRelacionado() && this.presupuestoproductoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPresupuestoProductoClasesRelacionadas();
			}
			
			if(this.presupuestoproductoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPresupuestoProductoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PresupuestoProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPresupuestoProducto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPresupuestoProducto();
			}
			
			if(!this.isPermisoBusquedaPresupuestoProducto) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPresupuestoProducto.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioPresupuestoProducto,this.isPermisoPaginacionMedioPresupuestoProducto,this.isPermisoPaginacionTodoPresupuestoProducto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PresupuestoProductoConstantesFunciones.getTiposSeleccionarPresupuestoProducto());
				
				this.tiposColumnasSelect=PresupuestoProductoConstantesFunciones.getTiposSeleccionarPresupuestoProducto(true);
				
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
			//if(!this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPresupuestoProducto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioPresupuestoProducto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioPresupuestoProducto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPresupuestoProducto() ;
			
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
			this.ejercicioLogic=new EjercicioLogic();
			this.periodoLogic=new PeriodoLogic();
			this.cuentacontableLogic=new CuentaContableLogic();
			this.bodegaLogic=new BodegaLogic();
			this.productoLogic=new ProductoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				presupuestoproductoImplementable= (PresupuestoProductoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PresupuestoProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				presupuestoproductoImplementableHome= (PresupuestoProductoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PresupuestoProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.presupuestoproductos= new ArrayList<PresupuestoProducto>();
			this.presupuestoproductosEliminados= new ArrayList<PresupuestoProducto>();
						
			this.isEsNuevoPresupuestoProducto=false;
			this.esParaAccionDesdeFormularioPresupuestoProducto=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idProductoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			this.cuentacontablesForeignKey=new ArrayList<CuentaContable>() ;
			this.bodegasForeignKey=new ArrayList<Bodega>() ;
			this.productosForeignKey=new ArrayList<Producto>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPresupuestoProducto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPresupuestoProducto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PresupuestoProductoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PresupuestoProductoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPresupuestoProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPresupuestoProducto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPresupuestoProducto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPresupuestoProducto();
			}
			
			PresupuestoProductoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPresupuestoProducto.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPresupuestoProducto.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPresupuestoProducto.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPresupuestoProducto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PresupuestoProducto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPresupuestoProducto() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPresupuestoProducto")) {
				iIndex=this.jInternalFrameDetalleFormPresupuestoProducto.jTabbedPaneRelacionesPresupuestoProducto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPresupuestoProducto.jTabbedPaneRelacionesPresupuestoProducto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPresupuestoProducto.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPresupuestoProducto();	
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
	
	public void cargarCombosForeignKeyPresupuestoProducto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPresupuestoProducto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPresupuestoProducto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPresupuestoProductoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPresupuestoProducto();
		
		this.cargarCombosFrameForeignKeyPresupuestoProducto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPresupuestoProducto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPresupuestoProducto();
		}
	}
	
	

	public void cargarCombosForeignKeyCuentaContable(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCuentaContableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCuentaContable();
				this.cargarCombosFrameCuentaContablesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCuentaContable(this.cuentacontablesForeignKey);

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
	
	public void jButtonNuevoPresupuestoProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.presupuestoproductoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPresupuestoProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
			
			
			if(jTableDatosPresupuestoProducto.getRowCount()>=1) {
				jTableDatosPresupuestoProducto.removeRowSelectionInterval(0, jTableDatosPresupuestoProducto.getRowCount()-1);						
			}
			
			this.isEsNuevoPresupuestoProducto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPresupuestoProducto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPresupuestoProducto(true);			
			//this.presupuestoproducto=new PresupuestoProducto();
			//this.presupuestoproducto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPresupuestoProducto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresupuestoProducto() ;
			
			if(PresupuestoProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePresupuestoProducto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.presupuestoproducto);	
			this.actualizarInformacion("INFO_PADRE",false,this.presupuestoproducto);				
			
			PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
			
			if(this.presupuestoproductoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PresupuestoProducto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPresupuestoProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PresupuestoProducto> presupuestoproductosSeleccionados=new ArrayList<PresupuestoProducto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPresupuestoProducto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPresupuestoProducto.getSelectedRows().length;			
			}
			
			presupuestoproductosSeleccionados=this.getPresupuestoProductosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPresupuestoProducto--;			
				//PresupuestoProducto presupuestoproductoAux= new PresupuestoProducto();			
				//presupuestoproductoAux.setId(this.iIdNuevoPresupuestoProducto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PresupuestoProducto presupuestoproductoOrigen=new PresupuestoProducto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PresupuestoProducto presupuestoproductoOrigen : presupuestoproductosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPresupuestoProducto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							presupuestoproductoOrigen =(PresupuestoProducto) this.presupuestoproductoLogic.getPresupuestoProductos().toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoproductoOrigen =(PresupuestoProducto) this.presupuestoproductos.toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPresupuestoProducto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.presupuestoproducto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPresupuestoProducto(presupuestoproductoOrigen,this.presupuestoproducto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoProducto(this.presupuestoproducto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.presupuestoproductoLogic.getPresupuestoProductos().add(this.presupuestoproductoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.presupuestoproductos.add(this.presupuestoproductoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPresupuestoProducto(false);
				
				this.jTableDatosPresupuestoProducto.setRowSelectionInterval(this.getIndiceNuevoPresupuestoProducto(), this.getIndiceNuevoPresupuestoProducto());
				
				int iLastRow =  this.jTableDatosPresupuestoProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPresupuestoProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPresupuestoProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPresupuestoProducto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPresupuestoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PresupuestoProducto> presupuestoproductosSeleccionados=new ArrayList<PresupuestoProducto>();									
		
			PresupuestoProducto presupuestoproductoOrigen=new PresupuestoProducto();
			PresupuestoProducto presupuestoproductoDestino=new PresupuestoProducto();
				
			presupuestoproductosSeleccionados=this.getPresupuestoProductosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPresupuestoProducto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || presupuestoproductosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPresupuestoProducto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoproductoOrigen =(PresupuestoProducto) this.presupuestoproductoLogic.getPresupuestoProductos().toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						presupuestoproductoOrigen =(PresupuestoProducto) this.presupuestoproductos.toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoproductoDestino =(PresupuestoProducto) this.presupuestoproductoLogic.getPresupuestoProductos().toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						presupuestoproductoDestino =(PresupuestoProducto) this.presupuestoproductos.toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				presupuestoproductoOrigen =presupuestoproductosSeleccionados.get(0);
				presupuestoproductoDestino =presupuestoproductosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPresupuestoProducto(presupuestoproductoOrigen,presupuestoproductoDestino,true,false);
				
				presupuestoproductoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(presupuestoproductoDestino,presupuestoproductoLogic.getPresupuestoProductos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presupuestoproductoDestino,presupuestoproductos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPresupuestoProducto(false);
				
				//this.jTableDatosPresupuestoProducto.setRowSelectionInterval(this.getIndiceNuevoPresupuestoProducto(), this.getIndiceNuevoPresupuestoProducto());
				
				int iLastRow =  this.jTableDatosPresupuestoProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPresupuestoProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPresupuestoProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPresupuestoProducto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPresupuestoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPresupuestoProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPresupuestoProducto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPresupuestoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPresupuestoProducto.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPresupuestoProducto.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPresupuestoProducto.setVisible(!isVisible);
			this.jPanelPaginacionPresupuestoProducto.setVisible(!isVisible);
			this.jPanelAccionesPresupuestoProducto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPresupuestoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePresupuestoProducto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPresupuestoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPresupuestoProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPresupuestoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPresupuestoProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPresupuestoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPresupuestoProducto();
			
			this.abrirFrameOrderByPresupuestoProducto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPresupuestoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPresupuestoProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePresupuestoProducto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPresupuestoProducto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPresupuestoProducto.isMaximum()) {
					this.jInternalFrameDetalleFormPresupuestoProducto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPresupuestoProducto.setSize(this.jInternalFrameDetalleFormPresupuestoProducto.iWidthFormulario,this.jInternalFrameDetalleFormPresupuestoProducto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPresupuestoProducto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPresupuestoProducto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPresupuestoProducto.isMaximum()) {
						this.jInternalFrameDetalleFormPresupuestoProducto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPresupuestoProducto.jContentPaneDetallePresupuestoProducto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPresupuestoProducto.jTabbedPaneRelacionesPresupuestoProducto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPresupuestoProducto.jContentPaneDetallePresupuestoProducto.getWidth(),PresupuestoProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPresupuestoProducto.jTabbedPaneRelacionesPresupuestoProducto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPresupuestoProducto.jContentPaneDetallePresupuestoProducto.getWidth(),PresupuestoProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPresupuestoProducto.jTabbedPaneRelacionesPresupuestoProducto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPresupuestoProducto.jContentPaneDetallePresupuestoProducto.getWidth(),PresupuestoProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPresupuestoProducto.setVisible(true);
	        this.jInternalFrameDetalleFormPresupuestoProducto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPresupuestoProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPresupuestoProducto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPresupuestoProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresupuestoProducto,false,this);
				} else {
					this.jInternalFrameOrderByPresupuestoProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresupuestoProducto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPresupuestoProducto);
				this.jInternalFrameOrderByPresupuestoProducto.setVisible(false);
				this.jInternalFrameOrderByPresupuestoProducto.setSelected(false);
				
				this.jInternalFrameOrderByPresupuestoProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPresupuestoProducto"));
				
				this.inicializarActualizarBindingTablaOrderByPresupuestoProducto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPresupuestoProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPresupuestoProducto==null) {
				
				this.jInternalFrameImportacionPresupuestoProducto=new ImportacionJInternalFrame(PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPresupuestoProducto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPresupuestoProducto);
				this.jInternalFrameImportacionPresupuestoProducto.setVisible(false);
				this.jInternalFrameImportacionPresupuestoProducto.setSelected(false);


				this.jInternalFrameImportacionPresupuestoProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPresupuestoProducto"));
				this.jInternalFrameImportacionPresupuestoProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPresupuestoProducto"));
				this.jInternalFrameImportacionPresupuestoProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPresupuestoProducto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPresupuestoProducto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPresupuestoProducto==null) {
				this.jInternalFrameReporteDinamicoPresupuestoProducto=new ReporteDinamicoJInternalFrame(PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPresupuestoProducto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPresupuestoProducto);
				this.jInternalFrameReporteDinamicoPresupuestoProducto.setVisible(false);
				this.jInternalFrameReporteDinamicoPresupuestoProducto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPresupuestoProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPresupuestoProducto"));
				this.jInternalFrameReporteDinamicoPresupuestoProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPresupuestoProducto"));
				this.jInternalFrameReporteDinamicoPresupuestoProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPresupuestoProducto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPresupuestoProducto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetallePresupuestoProducto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPresupuestoProducto);
			
	       	this.jInternalFrameDetalleFormPresupuestoProducto.setVisible(false);
	        this.jInternalFrameDetalleFormPresupuestoProducto.setSelected(false);
			
			//this.jInternalFrameDetalleFormPresupuestoProducto.dispose();
			//this.jInternalFrameDetalleFormPresupuestoProducto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPresupuestoProducto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPresupuestoProducto.setVisible(true);
	        this.jInternalFrameReporteDinamicoPresupuestoProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPresupuestoProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPresupuestoProducto.setVisible(true);
	        this.jInternalFrameImportacionPresupuestoProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPresupuestoProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPresupuestoProducto.setVisible(true);
	        this.jInternalFrameOrderByPresupuestoProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPresupuestoProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPresupuestoProducto.setVisible(false);
	        this.jInternalFrameOrderByPresupuestoProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPresupuestoProducto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPresupuestoProducto.setVisible(false);
	        this.jInternalFrameReporteDinamicoPresupuestoProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPresupuestoProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPresupuestoProducto.setVisible(false);
	        this.jInternalFrameImportacionPresupuestoProducto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeCuentaContable(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCuentaContable);
						CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.sTipoBusqueda="CuentaContable";
						}

						cuentacontableBeanSwingJInternalFrame.getTodosCuentaContableArbol();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setCuentaContables(cuentacontableBeanSwingJInternalFrame.cuentacontablesArbol);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.CargarTreeCuentaContable();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setVisible(true);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.jInternalFrameParent=this;
						TitledBorder titledBorderPresupuestoProducto=(TitledBorder)this.jScrollPanelDatosPresupuestoProducto.getBorder();
						TitledBorder titledBorderCuentaContable=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContable.setTitle(titledBorderPresupuestoProducto.getTitle() + " -> Cuenta Contable");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuentacontableBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(cuentacontableBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCuentaContable(CuentaContableBeanSwingJInternalFrame jInternalFrameTreeCuentaContable) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeCuentaContable);
						jInternalFrameTreeCuentaContable.setVisible(false);
						jInternalFrameTreeCuentaContable.setSelected(false);
						//jInternalFrameTreeCuentaContable.dispose();
						//jInternalFrameTreeCuentaContable=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void jButtonModificarPresupuestoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPresupuestoProducto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPresupuestoProducto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPresupuestoProducto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPresupuestoProducto(true);
			//this.isEsNuevoPresupuestoProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductoLogic.getPresupuestoProductos().toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductos.toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPresupuestoProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPresupuestoProducto(false) ;
			
			if(presupuestoproductoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(PresupuestoProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePresupuestoProducto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresupuestoProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPresupuestoProductoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPresupuestoProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductoLogic.getPresupuestoProductos().toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductos.toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPresupuestoProducto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPresupuestoProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPresupuestoProducto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPresupuestoProducto(true);
			//this.isEsNuevoPresupuestoProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductoLogic.getPresupuestoProductos().toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductos.toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.presupuestoproducto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPresupuestoProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPresupuestoProducto(false) ;
			
			if(PresupuestoProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePresupuestoProducto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresupuestoProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Producto")) {
				if(!this.presupuestoproductoConstantesFunciones.cargarid_productoPresupuestoProducto) {
					this.cargarCombosProductosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingPresupuestoProducto(false,false);
					this.cargarCombosFrameProductosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_producto (id);

				this.recargarComboTablaProducto(this.productosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
					
	
	public void recargarComboTablaCuentaContable(List<CuentaContable> cuentacontablesForeignKey)throws Exception{
		TableColumn tableColumnCuentaContable=this.jTableDatosPresupuestoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoProducto,PresupuestoProductoConstantesFunciones.LABEL_IDCUENTACONTABLE));
		TableCellEditor tableCellEditorCuentaContable =tableColumnCuentaContable.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContable;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPresupuestoProducto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontablesForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosPresupuestoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoProducto,PresupuestoProductoConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPresupuestoProducto.getSelectedRow();

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
		TableColumn tableColumnProducto=this.jTableDatosPresupuestoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoProducto,PresupuestoProductoConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPresupuestoProducto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoTableCellFk.setRowActual(intSelectedRow);
			//productoTableCellFk.setproductosForeignKeyActual(productosForeignKey);
		//}


		if(productoTableCellFk!=null) {
			productoTableCellFk.RecargarProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_producto (Long id) throws Exception {
		this.setActualProductoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarPresupuestoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPresupuestoProducto(false);
			
			//if(!this.isEsNuevoPresupuestoProducto) {								
				int intSelectedRow = this.jTableDatosPresupuestoProducto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductoLogic.getPresupuestoProductos().toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductos.toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PresupuestoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPresupuestoProducto(this.presupuestoproducto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoProducto(this.presupuestoproducto);
				
			}
			
			if(this.permiteMantenimiento(this.presupuestoproducto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPresupuestoProducto=true;
					this.inicializarActualizarBindingTablaPresupuestoProducto(false);
					this.isEsNuevoPresupuestoProducto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPresupuestoProducto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPresupuestoProducto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPresupuestoProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPresupuestoProducto(false);
				
				this.habilitarDeshabilitarControlesPresupuestoProducto(false);
			
												
				
				if(PresupuestoProductoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePresupuestoProducto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPresupuestoProductoActionPerformed(evt,presupuestoproductoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPresupuestoProducto(this.presupuestoproducto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPresupuestoProducto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,presupuestoproductoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.presupuestoproducto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PresupuestoProducto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoProducto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPresupuestoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPresupuestoProducto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductoLogic.getPresupuestoProductos().toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
				this.presupuestoproducto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductos.toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
				this.presupuestoproducto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.presupuestoproducto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PresupuestoProductoModel) this.jTableDatosPresupuestoProducto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPresupuestoProducto=true;
				this.inicializarActualizarBindingTablaPresupuestoProducto(false);
				this.isEsNuevoPresupuestoProducto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPresupuestoProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPresupuestoProducto(false);
				
				this.habilitarDeshabilitarControlesPresupuestoProducto(false);
				
				
				
				if(PresupuestoProductoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePresupuestoProducto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPresupuestoProductoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPresupuestoProducto.getRowCount()>=1) {
				jTableDatosPresupuestoProducto.removeRowSelectionInterval(0, jTableDatosPresupuestoProducto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPresupuestoProducto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPresupuestoProducto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPresupuestoProducto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresupuestoProducto(false) ;
			
			this.isEsNuevoPresupuestoProducto=false;
			
			if(PresupuestoProductoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePresupuestoProducto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPresupuestoProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPresupuestoProducto(false);
				
				//SI ES MANUAL
				if(PresupuestoProductoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPresupuestoProducto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPresupuestoProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPresupuestoProducto--;			
			//PresupuestoProducto presupuestoproductoAux= new PresupuestoProducto();			
			//presupuestoproductoAux.setId(this.iIdNuevoPresupuestoProducto);
			
			if(this.jInternalFrameDetalleFormPresupuestoProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPresupuestoProducto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoProducto(this.presupuestoproducto);
			
			this.presupuestoproducto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.presupuestoproductoLogic.getPresupuestoProductos().add(this.presupuestoproductoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.presupuestoproductos.add(this.presupuestoproductoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPresupuestoProducto(false);
			
			this.jTableDatosPresupuestoProducto.setRowSelectionInterval(this.getIndiceNuevoPresupuestoProducto(), this.getIndiceNuevoPresupuestoProducto());
			
			int iLastRow =  this.jTableDatosPresupuestoProducto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPresupuestoProducto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPresupuestoProducto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPresupuestoProducto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPresupuestoProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPresupuestoProducto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresupuestoProducto(false);
			
			//SI ES MANUAL
			if(PresupuestoProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPresupuestoProducto();
			}
			
			//this.abrirFrameTreePresupuestoProducto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPresupuestoProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Presupuesto ProductoS ?", "MANTENIMIENTO DE Presupuesto Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionPresupuestoProducto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralPresupuestoProducto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.presupuestoproductoReturnGeneral=presupuestoproductoLogic.procesarImportacionPresupuestoProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.presupuestoproductoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarPresupuestoProductoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPresupuestoProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPresupuestoProducto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPresupuestoProducto.setFileImportacion(this.jInternalFrameImportacionPresupuestoProducto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPresupuestoProducto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPresupuestoProducto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPresupuestoProducto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPresupuestoProducto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPresupuestoProductoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PresupuestoProducto> presupuestoproductosSeleccionados=new ArrayList<PresupuestoProducto>();		

		presupuestoproductosSeleccionados=this.getPresupuestoProductosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresupuestoProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresupuestoProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PresupuestoProductoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PresupuestoProductoBaseDesign.jrxml";
			
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
			
			this.generarReportePresupuestoProductos("Todos",presupuestoproductosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuesto Producto",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPresupuestoProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresupuestoProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PresupuestoProductoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoProductoConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoProductoConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoProductoConstantesFunciones.LABEL_IDPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Periodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Periodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Periodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Periodo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoProductoConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoProductoConstantesFunciones.LABEL_IDBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Bodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Bodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Bodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Bodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoProductoConstantesFunciones.LABEL_IDPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Producto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Producto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Producto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Producto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoProductoConstantesFunciones.LABEL_VALORINGRESO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorIngreso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorIngreso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorIngreso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorIngreso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoProductoConstantesFunciones.LABEL_VALOREGRESO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorEgreso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorEgreso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorEgreso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorEgreso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoProductoConstantesFunciones.LABEL_CANTIDADINGRESO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidadIngreso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidadIngreso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidadIngreso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidadIngreso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoProductoConstantesFunciones.LABEL_CANTIDADEGRESO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidadEgreso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidadEgreso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidadEgreso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidadEgreso_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoPresupuestoProducto.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPresupuestoProducto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPresupuestoProducto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PresupuestoProductoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case PresupuestoProductoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case PresupuestoProductoConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case PresupuestoProductoConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoria="id_periodo";
					break;

				case PresupuestoProductoConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoria="id_cuenta_contable";
					break;

				case PresupuestoProductoConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoria="id_bodega";
					break;

				case PresupuestoProductoConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoria="id_producto";
					break;

				case PresupuestoProductoConstantesFunciones.LABEL_VALORINGRESO:
					sNombreCampoCategoria="valor_ingreso";
					break;

				case PresupuestoProductoConstantesFunciones.LABEL_VALOREGRESO:
					sNombreCampoCategoria="valor_egreso";
					break;

				case PresupuestoProductoConstantesFunciones.LABEL_CANTIDADINGRESO:
					sNombreCampoCategoria="cantidad_ingreso";
					break;

				case PresupuestoProductoConstantesFunciones.LABEL_CANTIDADEGRESO:
					sNombreCampoCategoria="cantidad_egreso";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPresupuestoProducto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PresupuestoProductoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case PresupuestoProductoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case PresupuestoProductoConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case PresupuestoProductoConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoriaValor="id_periodo";
					break;

				case PresupuestoProductoConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoriaValor="id_cuenta_contable";
					break;

				case PresupuestoProductoConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoriaValor="id_bodega";
					break;

				case PresupuestoProductoConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoriaValor="id_producto";
					break;

				case PresupuestoProductoConstantesFunciones.LABEL_VALORINGRESO:
					sNombreCampoCategoriaValor="valor_ingreso";
					break;

				case PresupuestoProductoConstantesFunciones.LABEL_VALOREGRESO:
					sNombreCampoCategoriaValor="valor_egreso";
					break;

				case PresupuestoProductoConstantesFunciones.LABEL_CANTIDADINGRESO:
					sNombreCampoCategoriaValor="cantidad_ingreso";
					break;

				case PresupuestoProductoConstantesFunciones.LABEL_CANTIDADEGRESO:
					sNombreCampoCategoriaValor="cantidad_egreso";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPresupuestoProducto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresupuestoProducto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PresupuestoProductoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case PresupuestoProductoConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case PresupuestoProductoConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case PresupuestoProductoConstantesFunciones.LABEL_IDPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo");
					break;

				case PresupuestoProductoConstantesFunciones.LABEL_IDCUENTACONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable");
					break;

				case PresupuestoProductoConstantesFunciones.LABEL_IDBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_bodega");
					break;

				case PresupuestoProductoConstantesFunciones.LABEL_IDPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto");
					break;

				case PresupuestoProductoConstantesFunciones.LABEL_VALORINGRESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Ingreso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_ingreso");
					break;

				case PresupuestoProductoConstantesFunciones.LABEL_VALOREGRESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Egreso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_egreso");
					break;

				case PresupuestoProductoConstantesFunciones.LABEL_CANTIDADINGRESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantidad Ingreso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad_ingreso");
					break;

				case PresupuestoProductoConstantesFunciones.LABEL_CANTIDADEGRESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantidad Egreso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad_egreso");
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
	
	public void jButtonGenerarExcelReporteDinamicoPresupuestoProductoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PresupuestoProducto> presupuestoproductosSeleccionados=new ArrayList<PresupuestoProducto>();		
		
		presupuestoproductosSeleccionados=this.getPresupuestoProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestoproducto";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("PresupuestoProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPresupuestoProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPresupuestoProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PresupuestoProductoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoProductoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(PresupuestoProducto presupuestoproducto:presupuestoproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoproducto.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoProductoConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoProductoConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(PresupuestoProducto presupuestoproducto:presupuestoproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoproducto.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoProductoConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoProductoConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(PresupuestoProducto presupuestoproducto:presupuestoproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoproducto.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoProductoConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoProductoConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(PresupuestoProducto presupuestoproducto:presupuestoproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoproducto.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoProductoConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoProductoConstantesFunciones.LABEL_IDCUENTACONTABLE);
					iRow++;

					for(PresupuestoProducto presupuestoproducto:presupuestoproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoproducto.getcuentacontable_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoProductoConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoProductoConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(PresupuestoProducto presupuestoproducto:presupuestoproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoproducto.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoProductoConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoProductoConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(PresupuestoProducto presupuestoproducto:presupuestoproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoproducto.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoProductoConstantesFunciones.LABEL_VALORINGRESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoProductoConstantesFunciones.LABEL_VALORINGRESO);
					iRow++;

					for(PresupuestoProducto presupuestoproducto:presupuestoproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoproducto.getvalor_ingreso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoProductoConstantesFunciones.LABEL_VALOREGRESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoProductoConstantesFunciones.LABEL_VALOREGRESO);
					iRow++;

					for(PresupuestoProducto presupuestoproducto:presupuestoproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoproducto.getvalor_egreso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoProductoConstantesFunciones.LABEL_CANTIDADINGRESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoProductoConstantesFunciones.LABEL_CANTIDADINGRESO);
					iRow++;

					for(PresupuestoProducto presupuestoproducto:presupuestoproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoproducto.getcantidad_ingreso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoProductoConstantesFunciones.LABEL_CANTIDADEGRESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoProductoConstantesFunciones.LABEL_CANTIDADEGRESO);
					iRow++;

					for(PresupuestoProducto presupuestoproducto:presupuestoproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoproducto.getcantidad_egreso());
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
			//	this.getFilaCabeceraExportarExcelPresupuestoProducto(row);				
			//	iRow++;
			//}				
			
			//for(PresupuestoProducto presupuestoproductoAux:presupuestoproductosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPresupuestoProducto(presupuestoproductoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuesto Producto",JOptionPane.INFORMATION_MESSAGE);
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
				this.presupuestoproductoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresupuestoProducto(false);
			
			//SI ES MANUAL
			if(PresupuestoProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPresupuestoProducto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPresupuestoProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresupuestoProducto(false);
			
			//SI ES MANUAL
			if(PresupuestoProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPresupuestoProducto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPresupuestoProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresupuestoProducto(false);
			
			//SI ES MANUAL
			if(PresupuestoProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPresupuestoProducto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPresupuestoProducto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPresupuestoProducto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPresupuestoProducto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPresupuestoProducto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPresupuestoProducto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPresupuestoProducto.setMinimumSize(dimensionMinimum);
		this.jTableDatosPresupuestoProducto.setMaximumSize(dimensionMaximum);
		this.jTableDatosPresupuestoProducto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPresupuestoProducto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPresupuestoProducto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPresupuestoProducto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPresupuestoProducto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPresupuestoProducto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPresupuestoProducto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPresupuestoProducto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPresupuestoProducto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PresupuestoProductoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PresupuestoProductoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPresupuestoProducto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPresupuestoProducto();
		
		this.inicializarActualizarBindingBotonesManualPresupuestoProducto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPresupuestoProducto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPresupuestoProducto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPresupuestoProducto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPresupuestoProducto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPresupuestoProducto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPresupuestoProducto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePresupuestoProducto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPresupuestoProducto.jCheckBoxPostAccionNuevoPresupuestoProducto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPresupuestoProducto.jCheckBoxPostAccionSinCerrarPresupuestoProducto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPresupuestoProducto.jCheckBoxPostAccionSinMensajePresupuestoProducto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPresupuestoProducto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPresupuestoProducto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePresupuestoProducto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
				this.jInternalFrameDetalleFormPresupuestoProducto.jCheckBoxPostAccionNuevoPresupuestoProducto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPresupuestoProducto.jCheckBoxPostAccionSinCerrarPresupuestoProducto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPresupuestoProducto.jCheckBoxPostAccionSinMensajePresupuestoProducto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPresupuestoProducto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPresupuestoProducto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxTiposAccionesFormularioPresupuestoProducto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPresupuestoProducto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPresupuestoProducto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresupuestoProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPresupuestoProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPresupuestoProducto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPresupuestoProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPresupuestoProducto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPresupuestoProducto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresupuestoProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPresupuestoProducto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPresupuestoProducto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPresupuestoProducto(Boolean esInicializar) throws Exception {
		try	{	
			if(PresupuestoProductoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPresupuestoProducto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPresupuestoProducto() throws Exception {
		try	{
			if(PresupuestoProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPresupuestoProducto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePresupuestoProducto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxTiposAccionesFormularioPresupuestoProducto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxTiposAccionesFormularioPresupuestoProducto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPresupuestoProducto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPresupuestoProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPresupuestoProducto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPresupuestoProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPresupuestoProducto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPresupuestoProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPresupuestoProducto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPresupuestoProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPresupuestoProducto.addItem(reporte);
			}
			
			
			if(!this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPresupuestoProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPresupuestoProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPresupuestoProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPresupuestoProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPresupuestoProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPresupuestoProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxTiposAccionesFormularioPresupuestoProducto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxTiposAccionesFormularioPresupuestoProducto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPresupuestoProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPresupuestoProducto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPresupuestoProducto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPresupuestoProducto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPresupuestoProducto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPresupuestoProducto!=null) {
				this.jInternalFrameReporteDinamicoPresupuestoProducto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPresupuestoProducto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPresupuestoProducto!=null) {
				this.jInternalFrameReporteDinamicoPresupuestoProducto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPresupuestoProducto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPresupuestoProducto!=null) {
				
				if(this.jInternalFrameReporteDinamicoPresupuestoProducto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPresupuestoProducto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPresupuestoProducto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPresupuestoProducto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPresupuestoProducto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPresupuestoProducto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoPresupuestoProducto.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPresupuestoProducto.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=PresupuestoProductoConstantesFunciones.getTiposSeleccionarPresupuestoProducto(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPresupuestoProducto.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoPresupuestoProducto.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoPresupuestoProducto.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=PresupuestoProductoConstantesFunciones.getTiposSeleccionarPresupuestoProducto(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPresupuestoProducto.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoPresupuestoProducto.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPresupuestoProducto.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=PresupuestoProductoConstantesFunciones.getTiposSeleccionarPresupuestoProducto(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPresupuestoProducto.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoPresupuestoProducto.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoPresupuestoProducto.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoPresupuestoProducto.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPresupuestoProducto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaFK_IdBodegaPresupuestoProducto.getSelectedItem()!=null){this.id_bodegaFK_IdBodega=((Bodega)this.jComboBoxid_bodegaFK_IdBodegaPresupuestoProducto.getSelectedItem()).getId();}
		if(this.jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoProducto.getSelectedItem()!=null){this.id_cuenta_contableFK_IdCuentaContable=((CuentaContable)this.jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoProducto.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoFK_IdProductoPresupuestoProducto.getSelectedItem()!=null){this.id_productoFK_IdProducto=((Producto)this.jComboBoxid_productoFK_IdProductoPresupuestoProducto.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPresupuestoProducto(Boolean esInicializar) throws Exception {				
		if(PresupuestoProductoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPresupuestoProducto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPresupuestoProducto() throws Exception {
		this.inicializarActualizarBindingTablaPresupuestoProducto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPresupuestoProducto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPresupuestoProducto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPresupuestoProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPresupuestoProducto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PresupuestoProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPresupuestoProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPresupuestoProducto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PresupuestoProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPresupuestoProductoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoProductoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PresupuestoProductoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPresupuestoProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPresupuestoProducto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PresupuestoProductoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPresupuestoProducto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPresupuestoProducto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=presupuestoproductoLogic.getPresupuestoProductos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=presupuestoproductos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PresupuestoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPresupuestoProducto.setModel(new PresupuestoProductoModel(this.presupuestoproductoLogic.getPresupuestoProductos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPresupuestoProducto.setModel(new PresupuestoProductoModel(this.presupuestoproductos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPresupuestoProducto!=null && this.jInternalFrameOrderByPresupuestoProducto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPresupuestoProducto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPresupuestoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoProducto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PresupuestoProductoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO,presupuestoproductoConstantesFunciones.resaltarSeleccionarPresupuestoProducto,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PresupuestoProductoConstantesFunciones.SCLASSWEBTITULO,presupuestoproductoConstantesFunciones.resaltarSeleccionarPresupuestoProducto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPresupuestoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoProducto,PresupuestoProductoConstantesFunciones.LABEL_ID));

		if(this.presupuestoproductoConstantesFunciones.mostraridPresupuestoProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoProductoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presupuestoproductoConstantesFunciones.resaltaridPresupuestoProducto,this.presupuestoproductoConstantesFunciones.activaridPresupuestoProducto,iSizeTabla,this,true,"idPresupuestoProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestoproductoConstantesFunciones.resaltaridPresupuestoProducto,this.presupuestoproductoConstantesFunciones.activaridPresupuestoProducto,this,true,"idPresupuestoProducto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoProducto,PresupuestoProductoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.presupuestoproductoConstantesFunciones.mostrarid_empresaPresupuestoProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoProductoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.presupuestoproductoConstantesFunciones.resaltarid_empresaPresupuestoProducto,this,this.presupuestoproductoConstantesFunciones.activarid_empresaPresupuestoProducto,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.presupuestoproductoConstantesFunciones.resaltarid_empresaPresupuestoProducto,this,this.presupuestoproductoConstantesFunciones.activarid_empresaPresupuestoProducto,false,"id_empresaPresupuestoProducto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresupuestoProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoProducto,PresupuestoProductoConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.presupuestoproductoConstantesFunciones.mostrarid_sucursalPresupuestoProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoProductoConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.presupuestoproductoConstantesFunciones.resaltarid_sucursalPresupuestoProducto,this,this.presupuestoproductoConstantesFunciones.activarid_sucursalPresupuestoProducto,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.presupuestoproductoConstantesFunciones.resaltarid_sucursalPresupuestoProducto,this,this.presupuestoproductoConstantesFunciones.activarid_sucursalPresupuestoProducto,false,"id_sucursalPresupuestoProducto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresupuestoProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoProducto,PresupuestoProductoConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.presupuestoproductoConstantesFunciones.mostrarid_ejercicioPresupuestoProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoProductoConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.presupuestoproductoConstantesFunciones.resaltarid_ejercicioPresupuestoProducto,this,this.presupuestoproductoConstantesFunciones.activarid_ejercicioPresupuestoProducto,iSizeTabla));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.presupuestoproductoConstantesFunciones.resaltarid_ejercicioPresupuestoProducto,this,this.presupuestoproductoConstantesFunciones.activarid_ejercicioPresupuestoProducto,false,"id_ejercicioPresupuestoProducto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresupuestoProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoProducto,PresupuestoProductoConstantesFunciones.LABEL_IDPERIODO));

		if(this.presupuestoproductoConstantesFunciones.mostrarid_periodoPresupuestoProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoProductoConstantesFunciones.LABEL_IDPERIODO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new PeriodoTableCell(this.periodosForeignKey,this.presupuestoproductoConstantesFunciones.resaltarid_periodoPresupuestoProducto,this,this.presupuestoproductoConstantesFunciones.activarid_periodoPresupuestoProducto,iSizeTabla));
			tableColumn.setCellEditor(new PeriodoTableCell(this.periodosForeignKey,this.presupuestoproductoConstantesFunciones.resaltarid_periodoPresupuestoProducto,this,this.presupuestoproductoConstantesFunciones.activarid_periodoPresupuestoProducto,false,"id_periodoPresupuestoProducto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresupuestoProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoProducto,PresupuestoProductoConstantesFunciones.LABEL_IDCUENTACONTABLE));

		if(this.presupuestoproductoConstantesFunciones.mostrarid_cuenta_contablePresupuestoProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoProductoConstantesFunciones.LABEL_IDCUENTACONTABLE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.presupuestoproductoConstantesFunciones.resaltarid_cuenta_contablePresupuestoProducto,this,this.presupuestoproductoConstantesFunciones.activarid_cuenta_contablePresupuestoProducto,iSizeTabla));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.presupuestoproductoConstantesFunciones.resaltarid_cuenta_contablePresupuestoProducto,this,this.presupuestoproductoConstantesFunciones.activarid_cuenta_contablePresupuestoProducto,true,"id_cuenta_contablePresupuestoProducto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new PresupuestoProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoProducto,PresupuestoProductoConstantesFunciones.LABEL_IDBODEGA));

		if(this.presupuestoproductoConstantesFunciones.mostrarid_bodegaPresupuestoProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoProductoConstantesFunciones.LABEL_IDBODEGA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BodegaTableCell(this.bodegasForeignKey,this.presupuestoproductoConstantesFunciones.resaltarid_bodegaPresupuestoProducto,this,this.presupuestoproductoConstantesFunciones.activarid_bodegaPresupuestoProducto,iSizeTabla));
			tableColumn.setCellEditor(new BodegaTableCell(this.bodegasForeignKey,this.presupuestoproductoConstantesFunciones.resaltarid_bodegaPresupuestoProducto,this,this.presupuestoproductoConstantesFunciones.activarid_bodegaPresupuestoProducto,true,"id_bodegaPresupuestoProducto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new PresupuestoProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoProducto,PresupuestoProductoConstantesFunciones.LABEL_IDPRODUCTO));

		if(this.presupuestoproductoConstantesFunciones.mostrarid_productoPresupuestoProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoProductoConstantesFunciones.LABEL_IDPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoTableCell(this.productosForeignKey,this.presupuestoproductoConstantesFunciones.resaltarid_productoPresupuestoProducto,this,this.presupuestoproductoConstantesFunciones.activarid_productoPresupuestoProducto,iSizeTabla));
			tableColumn.setCellEditor(new ProductoTableCell(this.productosForeignKey,this.presupuestoproductoConstantesFunciones.resaltarid_productoPresupuestoProducto,this,this.presupuestoproductoConstantesFunciones.activarid_productoPresupuestoProducto,true,"id_productoPresupuestoProducto","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new PresupuestoProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoProducto,PresupuestoProductoConstantesFunciones.LABEL_VALORINGRESO));

		if(this.presupuestoproductoConstantesFunciones.mostrarvalor_ingresoPresupuestoProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoProductoConstantesFunciones.LABEL_VALORINGRESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presupuestoproductoConstantesFunciones.resaltarvalor_ingresoPresupuestoProducto,this.presupuestoproductoConstantesFunciones.activarvalor_ingresoPresupuestoProducto,iSizeTabla,this,true,"valor_ingresoPresupuestoProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestoproductoConstantesFunciones.resaltarvalor_ingresoPresupuestoProducto,this.presupuestoproductoConstantesFunciones.activarvalor_ingresoPresupuestoProducto,this,true,"valor_ingresoPresupuestoProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PresupuestoProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoProducto,PresupuestoProductoConstantesFunciones.LABEL_VALOREGRESO));

		if(this.presupuestoproductoConstantesFunciones.mostrarvalor_egresoPresupuestoProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoProductoConstantesFunciones.LABEL_VALOREGRESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presupuestoproductoConstantesFunciones.resaltarvalor_egresoPresupuestoProducto,this.presupuestoproductoConstantesFunciones.activarvalor_egresoPresupuestoProducto,iSizeTabla,this,true,"valor_egresoPresupuestoProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestoproductoConstantesFunciones.resaltarvalor_egresoPresupuestoProducto,this.presupuestoproductoConstantesFunciones.activarvalor_egresoPresupuestoProducto,this,true,"valor_egresoPresupuestoProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PresupuestoProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoProducto,PresupuestoProductoConstantesFunciones.LABEL_CANTIDADINGRESO));

		if(this.presupuestoproductoConstantesFunciones.mostrarcantidad_ingresoPresupuestoProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoProductoConstantesFunciones.LABEL_CANTIDADINGRESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presupuestoproductoConstantesFunciones.resaltarcantidad_ingresoPresupuestoProducto,this.presupuestoproductoConstantesFunciones.activarcantidad_ingresoPresupuestoProducto,iSizeTabla,this,true,"cantidad_ingresoPresupuestoProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestoproductoConstantesFunciones.resaltarcantidad_ingresoPresupuestoProducto,this.presupuestoproductoConstantesFunciones.activarcantidad_ingresoPresupuestoProducto,this,true,"cantidad_ingresoPresupuestoProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PresupuestoProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoProducto,PresupuestoProductoConstantesFunciones.LABEL_CANTIDADEGRESO));

		if(this.presupuestoproductoConstantesFunciones.mostrarcantidad_egresoPresupuestoProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoProductoConstantesFunciones.LABEL_CANTIDADEGRESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presupuestoproductoConstantesFunciones.resaltarcantidad_egresoPresupuestoProducto,this.presupuestoproductoConstantesFunciones.activarcantidad_egresoPresupuestoProducto,iSizeTabla,this,true,"cantidad_egresoPresupuestoProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestoproductoConstantesFunciones.resaltarcantidad_egresoPresupuestoProducto,this.presupuestoproductoConstantesFunciones.activarcantidad_egresoPresupuestoProducto,this,true,"cantidad_egresoPresupuestoProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PresupuestoProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.presupuestoproductoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.presupuestoproductoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.presupuestoproductoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPresupuestoProducto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.presupuestoproductoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.presupuestoproductoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPresupuestoProducto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPresupuestoProducto && this.isPermisoGuardarCambiosPresupuestoProducto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.presupuestoproductoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.presupuestoproductoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPresupuestoProducto.addColumn(tableColumn);
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
			
			this.jTableDatosPresupuestoProducto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPresupuestoProducto && this.isPermisoGuardarCambiosPresupuestoProducto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPresupuestoProducto && this.isPermisoGuardarCambiosPresupuestoProducto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPresupuestoProducto.moveColumn(this.jTableDatosPresupuestoProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPresupuestoProducto.moveColumn(this.jTableDatosPresupuestoProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPresupuestoProducto.moveColumn(this.jTableDatosPresupuestoProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPresupuestoProducto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPresupuestoProducto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPresupuestoProducto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PresupuestoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPresupuestoProducto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPresupuestoProducto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PresupuestoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PresupuestoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPresupuestoProducto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPresupuestoProducto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPresupuestoProducto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=presupuestoproductoLogic.getPresupuestoProductos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=presupuestoproductos.size()-1;
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
		//this.jTableDatosPresupuestoProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPresupuestoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPresupuestoProducto();
			
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
				
				//this.isEsNuevoPresupuestoProducto=false;
					
				PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
			
				if(this.presupuestoproductoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPresupuestoProducto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPresupuestoProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPresupuestoProducto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductoLogic.getPresupuestoProductos().toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductos.toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.presupuestoproducto.getsType().equals("DUPLICADO")
				   || this.presupuestoproducto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPresupuestoProducto=true;
				
				} else {
					this.isEsNuevoPresupuestoProducto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {
					if(this.presupuestoproducto.getId()>=0 && !this.presupuestoproducto.getIsNew()) {						
						this.isEsNuevoPresupuestoProducto=false;
						
					} else {
						this.isEsNuevoPresupuestoProducto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPresupuestoProducto(esRelaciones);						
				
				this.seleccionarPresupuestoProducto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.presupuestoproducto.getId()<0) {
					this.isEsNuevoPresupuestoProducto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPresupuestoProducto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPresupuestoProducto(evt,rowIndex);
				}	
				
				if(this.presupuestoproductoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PresupuestoProducto: " + this.dDif); 
					}
				}								
				
				PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPresupuestoProducto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.presupuestoproducto)) {
					if(this.presupuestoproducto.getId()>0) {
						this.presupuestoproducto.setIsDeleted(true);
						
						this.presupuestoproductosEliminados.add(this.presupuestoproducto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.presupuestoproductoLogic.getPresupuestoProductos().remove(this.presupuestoproducto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.presupuestoproductos.remove(this.presupuestoproducto);				
					}
					
					
					((PresupuestoProductoModel) this.jTableDatosPresupuestoProducto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPresupuestoProducto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPresupuestoProducto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPresupuestoProducto) {
			
			if(this.jInternalFrameDetalleFormPresupuestoProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPresupuestoProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPresupuestoProducto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductoLogic.getPresupuestoProductos().toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductos.toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PresupuestoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPresupuestoProducto(this.presupuestoproducto);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.presupuestoproductoConstantesFunciones.cargarid_empresaPresupuestoProducto || this.presupuestoproductoConstantesFunciones.event_dependid_empresaPresupuestoProducto) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.presupuestoproducto.getid_empresa());
									//this.inicializarActualizarBindingPresupuestoProducto(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(presupuestoproducto.getEmpresa()!=null) {
							this.empresasForeignKey.add(presupuestoproducto.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.presupuestoproducto.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.presupuestoproductoConstantesFunciones.cargarid_sucursalPresupuestoProducto || this.presupuestoproductoConstantesFunciones.event_dependid_sucursalPresupuestoProducto) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.presupuestoproducto.getid_sucursal());
									//this.inicializarActualizarBindingPresupuestoProducto(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(presupuestoproducto.getSucursal()!=null) {
							this.sucursalsForeignKey.add(presupuestoproducto.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.presupuestoproducto.getid_sucursal(),false,"Formulario");

					//Ejercicio
					if(!this.presupuestoproductoConstantesFunciones.cargarid_ejercicioPresupuestoProducto || this.presupuestoproductoConstantesFunciones.event_dependid_ejercicioPresupuestoProducto) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.presupuestoproducto.getid_ejercicio());
									//this.inicializarActualizarBindingPresupuestoProducto(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(presupuestoproducto.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(presupuestoproducto.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.presupuestoproducto.getid_ejercicio(),false,"Formulario");

					//Periodo
					if(!this.presupuestoproductoConstantesFunciones.cargarid_periodoPresupuestoProducto || this.presupuestoproductoConstantesFunciones.event_dependid_periodoPresupuestoProducto) {
						//this.cargarCombosPeriodosForeignKeyLista(" where id="+this.presupuestoproducto.getid_periodo());
									//this.inicializarActualizarBindingPresupuestoProducto(false,false);
						this.periodosForeignKey=new ArrayList<Periodo>();

						if(presupuestoproducto.getPeriodo()!=null) {
							this.periodosForeignKey.add(presupuestoproducto.getPeriodo());
						}

						this.addItemDefectoCombosForeignKeyPeriodo();
						this.cargarCombosFramePeriodosForeignKey("Todos");
					}
					this.setActualPeriodoForeignKey(this.presupuestoproducto.getid_periodo(),false,"Formulario");

					//CuentaContable
					if(!this.presupuestoproductoConstantesFunciones.cargarid_cuenta_contablePresupuestoProducto || this.presupuestoproductoConstantesFunciones.event_dependid_cuenta_contablePresupuestoProducto) {
						//this.cargarCombosCuentaContablesForeignKeyLista(" where id="+this.presupuestoproducto.getid_cuenta_contable());
									//this.inicializarActualizarBindingPresupuestoProducto(false,false);
						this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();

						if(presupuestoproducto.getCuentaContable()!=null) {
							this.cuentacontablesForeignKey.add(presupuestoproducto.getCuentaContable());
						}

						this.addItemDefectoCombosForeignKeyCuentaContable();
						this.cargarCombosFrameCuentaContablesForeignKey("Todos");
					}
					this.setActualCuentaContableForeignKey(this.presupuestoproducto.getid_cuenta_contable(),false,"Formulario");

					//Bodega
					if(!this.presupuestoproductoConstantesFunciones.cargarid_bodegaPresupuestoProducto || this.presupuestoproductoConstantesFunciones.event_dependid_bodegaPresupuestoProducto) {
						//this.cargarCombosBodegasForeignKeyLista(" where id="+this.presupuestoproducto.getid_bodega());
									//this.inicializarActualizarBindingPresupuestoProducto(false,false);
						this.bodegasForeignKey=new ArrayList<Bodega>();

						if(presupuestoproducto.getBodega()!=null) {
							this.bodegasForeignKey.add(presupuestoproducto.getBodega());
						}

						this.addItemDefectoCombosForeignKeyBodega();
						this.cargarCombosFrameBodegasForeignKey("Todos");
					}
					this.setActualBodegaForeignKey(this.presupuestoproducto.getid_bodega(),false,"Formulario");

					//Producto
					if(!this.presupuestoproductoConstantesFunciones.cargarid_productoPresupuestoProducto || this.presupuestoproductoConstantesFunciones.event_dependid_productoPresupuestoProducto) {
						//this.cargarCombosProductosForeignKeyLista(" where id="+this.presupuestoproducto.getid_producto());
									//this.inicializarActualizarBindingPresupuestoProducto(false,false);
						this.productosForeignKey=new ArrayList<Producto>();

						if(presupuestoproducto.getProducto()!=null) {
							this.productosForeignKey.add(presupuestoproducto.getProducto());
						}

						this.addItemDefectoCombosForeignKeyProducto();
						this.cargarCombosFrameProductosForeignKey("Todos");
					}
					this.setActualProductoForeignKey(this.presupuestoproducto.getid_producto(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPresupuestoProducto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPresupuestoProducto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPresupuestoProducto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPresupuestoProducto(PresupuestoProducto presupuestoproducto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPresupuestoProducto(presupuestoproducto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPresupuestoProducto(PresupuestoProducto presupuestoproducto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPresupuestoProducto(presupuestoproducto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPresupuestoProducto(presupuestoproducto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPresupuestoProducto(presupuestoproducto);
	}
	
	public void setVariablesObjetoActualToFormularioPresupuestoProducto(PresupuestoProducto presupuestoproducto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPresupuestoProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPresupuestoProducto.jLabelidPresupuestoProducto.setText(presupuestoproducto.getId().toString());
			this.jInternalFrameDetalleFormPresupuestoProducto.jTextFieldvalor_ingresoPresupuestoProducto.setText(presupuestoproducto.getvalor_ingreso().toString());
			this.jInternalFrameDetalleFormPresupuestoProducto.jTextFieldvalor_egresoPresupuestoProducto.setText(presupuestoproducto.getvalor_egreso().toString());
			this.jInternalFrameDetalleFormPresupuestoProducto.jTextFieldcantidad_ingresoPresupuestoProducto.setText(presupuestoproducto.getcantidad_ingreso().toString());
			this.jInternalFrameDetalleFormPresupuestoProducto.jTextFieldcantidad_egresoPresupuestoProducto.setText(presupuestoproducto.getcantidad_egreso().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PresupuestoProducto presupuestoproductoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,presupuestoproductoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PresupuestoProducto presupuestoproductoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				presupuestoproductoLocal=this.presupuestoproducto;
			} else {
				presupuestoproductoLocal=this.presupuestoproductoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(presupuestoproductoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPresupuestoProducto(presupuestoproductoLocal,true);
					
					if(presupuestoproductoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(presupuestoproductoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(presupuestoproductoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPresupuestoProducto(PresupuestoProducto presupuestoproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPresupuestoProducto(presupuestoproducto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoProducto(presupuestoproducto);
	}
	
	public void setVariablesFormularioToObjetoActualPresupuestoProducto(PresupuestoProducto presupuestoproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPresupuestoProducto(presupuestoproducto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPresupuestoProducto(PresupuestoProducto presupuestoproducto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPresupuestoProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPresupuestoProducto.jLabelidPresupuestoProducto.getText()==null || this.jInternalFrameDetalleFormPresupuestoProducto.jLabelidPresupuestoProducto.getText()=="" || this.jInternalFrameDetalleFormPresupuestoProducto.jLabelidPresupuestoProducto.getText()=="Id") {
				this.jInternalFrameDetalleFormPresupuestoProducto.jLabelidPresupuestoProducto.setText("0");
			}

			if(conColumnasBase) {presupuestoproducto.setId(Long.parseLong(this.jInternalFrameDetalleFormPresupuestoProducto.jLabelidPresupuestoProducto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestoProductoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoProducto.jLabelIdPresupuestoProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presupuestoproducto.setvalor_ingreso(Double.parseDouble(this.jInternalFrameDetalleFormPresupuestoProducto.jTextFieldvalor_ingresoPresupuestoProducto.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestoProductoConstantesFunciones.LABEL_VALORINGRESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoProducto.jLabelvalor_ingresoPresupuestoProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presupuestoproducto.setvalor_egreso(Double.parseDouble(this.jInternalFrameDetalleFormPresupuestoProducto.jTextFieldvalor_egresoPresupuestoProducto.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestoProductoConstantesFunciones.LABEL_VALOREGRESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoProducto.jLabelvalor_egresoPresupuestoProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presupuestoproducto.setcantidad_ingreso(Double.parseDouble(this.jInternalFrameDetalleFormPresupuestoProducto.jTextFieldcantidad_ingresoPresupuestoProducto.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestoProductoConstantesFunciones.LABEL_CANTIDADINGRESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoProducto.jLabelcantidad_ingresoPresupuestoProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presupuestoproducto.setcantidad_egreso(Double.parseDouble(this.jInternalFrameDetalleFormPresupuestoProducto.jTextFieldcantidad_egresoPresupuestoProducto.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestoProductoConstantesFunciones.LABEL_CANTIDADEGRESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoProducto.jLabelcantidad_egresoPresupuestoProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPresupuestoProducto(PresupuestoProducto presupuestoproductoBean,PresupuestoProducto presupuestoproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && presupuestoproductoBean.getid_cuenta_contable()!=null && !presupuestoproductoBean.getid_cuenta_contable().equals(-1L))) {presupuestoproducto.setid_cuenta_contable(presupuestoproductoBean.getid_cuenta_contable());}
			if(conDefault || (!conDefault && presupuestoproductoBean.getid_bodega()!=null && !presupuestoproductoBean.getid_bodega().equals(-1L))) {presupuestoproducto.setid_bodega(presupuestoproductoBean.getid_bodega());}
			if(conDefault || (!conDefault && presupuestoproductoBean.getid_producto()!=null && !presupuestoproductoBean.getid_producto().equals(-1L))) {presupuestoproducto.setid_producto(presupuestoproductoBean.getid_producto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPresupuestoProducto(PresupuestoProducto presupuestoproductoOrigen,PresupuestoProducto presupuestoproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && presupuestoproductoOrigen.getId()!=null && !presupuestoproductoOrigen.getId().equals(0L))) {presupuestoproducto.setId(presupuestoproductoOrigen.getId());}}
			if(conDefault || (!conDefault && presupuestoproductoOrigen.getid_cuenta_contable()!=null && !presupuestoproductoOrigen.getid_cuenta_contable().equals(-1L))) {presupuestoproducto.setid_cuenta_contable(presupuestoproductoOrigen.getid_cuenta_contable());}
			if(conDefault || (!conDefault && presupuestoproductoOrigen.getid_bodega()!=null && !presupuestoproductoOrigen.getid_bodega().equals(-1L))) {presupuestoproducto.setid_bodega(presupuestoproductoOrigen.getid_bodega());}
			if(conDefault || (!conDefault && presupuestoproductoOrigen.getid_producto()!=null && !presupuestoproductoOrigen.getid_producto().equals(-1L))) {presupuestoproducto.setid_producto(presupuestoproductoOrigen.getid_producto());}
			if(conDefault || (!conDefault && presupuestoproductoOrigen.getvalor_ingreso()!=null && !presupuestoproductoOrigen.getvalor_ingreso().equals(0.0))) {presupuestoproducto.setvalor_ingreso(presupuestoproductoOrigen.getvalor_ingreso());}
			if(conDefault || (!conDefault && presupuestoproductoOrigen.getvalor_egreso()!=null && !presupuestoproductoOrigen.getvalor_egreso().equals(0.0))) {presupuestoproducto.setvalor_egreso(presupuestoproductoOrigen.getvalor_egreso());}
			if(conDefault || (!conDefault && presupuestoproductoOrigen.getcantidad_ingreso()!=null && !presupuestoproductoOrigen.getcantidad_ingreso().equals(0.0))) {presupuestoproducto.setcantidad_ingreso(presupuestoproductoOrigen.getcantidad_ingreso());}
			if(conDefault || (!conDefault && presupuestoproductoOrigen.getcantidad_egreso()!=null && !presupuestoproductoOrigen.getcantidad_egreso().equals(0.0))) {presupuestoproducto.setcantidad_egreso(presupuestoproductoOrigen.getcantidad_egreso());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPresupuestoProducto(PresupuestoProducto presupuestoproducto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPresupuestoProducto.jLabelidPresupuestoProducto.setText(presupuestoproducto.getId().toString());
			this.jInternalFrameDetalleFormPresupuestoProducto.jTextFieldvalor_ingresoPresupuestoProducto.setText(presupuestoproducto.getvalor_ingreso().toString());
			this.jInternalFrameDetalleFormPresupuestoProducto.jTextFieldvalor_egresoPresupuestoProducto.setText(presupuestoproducto.getvalor_egreso().toString());
			this.jInternalFrameDetalleFormPresupuestoProducto.jTextFieldcantidad_ingresoPresupuestoProducto.setText(presupuestoproducto.getcantidad_ingreso().toString());
			this.jInternalFrameDetalleFormPresupuestoProducto.jTextFieldcantidad_egresoPresupuestoProducto.setText(presupuestoproducto.getcantidad_egreso().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPresupuestoProducto(PresupuestoProductoBean presupuestoproductoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPresupuestoProducto.jLabelidPresupuestoProducto.setText(presupuestoproductoBean.getId().toString());
			this.jInternalFrameDetalleFormPresupuestoProducto.jTextFieldvalor_ingresoPresupuestoProducto.setText(presupuestoproductoBean.getvalor_ingreso().toString());
			this.jInternalFrameDetalleFormPresupuestoProducto.jTextFieldvalor_egresoPresupuestoProducto.setText(presupuestoproductoBean.getvalor_egreso().toString());
			this.jInternalFrameDetalleFormPresupuestoProducto.jTextFieldcantidad_ingresoPresupuestoProducto.setText(presupuestoproductoBean.getcantidad_ingreso().toString());
			this.jInternalFrameDetalleFormPresupuestoProducto.jTextFieldcantidad_egresoPresupuestoProducto.setText(presupuestoproductoBean.getcantidad_egreso().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPresupuestoProducto(PresupuestoProductoParameterReturnGeneral presupuestoproductoReturnGeneral,PresupuestoProductoBean presupuestoproductoBean,Boolean conDefault) throws Exception { 
		try {
			PresupuestoProducto presupuestoproductoLocal=new PresupuestoProducto();
			
			presupuestoproductoLocal=presupuestoproductoReturnGeneral.getPresupuestoProducto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && presupuestoproductoLocal.getId()!=null && !presupuestoproductoLocal.getId().equals(0L))) {presupuestoproductoBean.setId(presupuestoproductoLocal.getId());}}
			if(conDefault || (!conDefault && presupuestoproductoLocal.getid_cuenta_contable()!=null && !presupuestoproductoLocal.getid_cuenta_contable().equals(-1L))) {presupuestoproductoBean.setid_cuenta_contable(presupuestoproductoLocal.getid_cuenta_contable());}
			if(conDefault || (!conDefault && presupuestoproductoLocal.getid_bodega()!=null && !presupuestoproductoLocal.getid_bodega().equals(-1L))) {presupuestoproductoBean.setid_bodega(presupuestoproductoLocal.getid_bodega());}
			if(conDefault || (!conDefault && presupuestoproductoLocal.getid_producto()!=null && !presupuestoproductoLocal.getid_producto().equals(-1L))) {presupuestoproductoBean.setid_producto(presupuestoproductoLocal.getid_producto());}
			if(conDefault || (!conDefault && presupuestoproductoLocal.getvalor_ingreso()!=null && !presupuestoproductoLocal.getvalor_ingreso().equals(0.0))) {presupuestoproductoBean.setvalor_ingreso(presupuestoproductoLocal.getvalor_ingreso());}
			if(conDefault || (!conDefault && presupuestoproductoLocal.getvalor_egreso()!=null && !presupuestoproductoLocal.getvalor_egreso().equals(0.0))) {presupuestoproductoBean.setvalor_egreso(presupuestoproductoLocal.getvalor_egreso());}
			if(conDefault || (!conDefault && presupuestoproductoLocal.getcantidad_ingreso()!=null && !presupuestoproductoLocal.getcantidad_ingreso().equals(0.0))) {presupuestoproductoBean.setcantidad_ingreso(presupuestoproductoLocal.getcantidad_ingreso());}
			if(conDefault || (!conDefault && presupuestoproductoLocal.getcantidad_egreso()!=null && !presupuestoproductoLocal.getcantidad_egreso().equals(0.0))) {presupuestoproductoBean.setcantidad_egreso(presupuestoproductoLocal.getcantidad_egreso());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPresupuestoProductoGenerico(Long idPresupuestoProductoSeleccionado,JComboBox jComboBoxPresupuestoProducto,List<PresupuestoProducto> presupuestoproductosLocal)throws Exception {
		try {
			PresupuestoProducto  presupuestoproductoTemp=null;

			for(PresupuestoProducto presupuestoproductoAux:presupuestoproductosLocal) {
				if(presupuestoproductoAux.getId()!=null && presupuestoproductoAux.getId().equals(idPresupuestoProductoSeleccionado)) {
					presupuestoproductoTemp=presupuestoproductoAux;
					break;
				}
			}

			jComboBoxPresupuestoProducto.setSelectedItem(presupuestoproductoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPresupuestoProductoGenerico(JComboBox jComboBoxPresupuestoProducto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPresupuestoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPresupuestoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPresupuestoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPresupuestoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPresupuestoProducto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPresupuestoProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPresupuestoProducto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPresupuestoProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPresupuestoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPresupuestoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			presupuestoproducto=(PresupuestoProducto) presupuestoproductoLogic.getPresupuestoProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			presupuestoproducto =(PresupuestoProducto) presupuestoproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!presupuestoproducto.getIsNew() && !presupuestoproducto.getIsChanged() && !presupuestoproducto.getIsDeleted()) {
				sDescripcion=presupuestoproducto.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=presupuestoproducto.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!presupuestoproducto.getIsNew() && !presupuestoproducto.getIsChanged() && !presupuestoproducto.getIsDeleted()) {
				sDescripcion=presupuestoproducto.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=presupuestoproducto.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!presupuestoproducto.getIsNew() && !presupuestoproducto.getIsChanged() && !presupuestoproducto.getIsDeleted()) {
				sDescripcion=presupuestoproducto.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=presupuestoproducto.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!presupuestoproducto.getIsNew() && !presupuestoproducto.getIsChanged() && !presupuestoproducto.getIsDeleted()) {
				sDescripcion=presupuestoproducto.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=presupuestoproducto.getperiodo_descripcion();
			}
		}

		if(sTipo.equals("CuentaContable")) {
			//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
			if(!presupuestoproducto.getIsNew() && !presupuestoproducto.getIsChanged() && !presupuestoproducto.getIsDeleted()) {
				sDescripcion=presupuestoproducto.getcuentacontable_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
				sDescripcion=presupuestoproducto.getcuentacontable_descripcion();
			}
		}

		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!presupuestoproducto.getIsNew() && !presupuestoproducto.getIsChanged() && !presupuestoproducto.getIsDeleted()) {
				sDescripcion=presupuestoproducto.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=presupuestoproducto.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!presupuestoproducto.getIsNew() && !presupuestoproducto.getIsChanged() && !presupuestoproducto.getIsDeleted()) {
				sDescripcion=presupuestoproducto.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=presupuestoproducto.getproducto_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PresupuestoProducto presupuestoproductoRow=new PresupuestoProducto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			presupuestoproductoRow=(PresupuestoProducto) presupuestoproductoLogic.getPresupuestoProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			presupuestoproductoRow=(PresupuestoProducto) presupuestoproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPresupuestoProducto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPresupuestoProducto.setVisible((this.isVisibilidadCeldaNuevoPresupuestoProducto && this.isPermisoNuevoPresupuestoProducto));			
			this.jButtonDuplicarPresupuestoProducto.setVisible((this.isVisibilidadCeldaDuplicarPresupuestoProducto && this.isPermisoDuplicarPresupuestoProducto));			
			this.jButtonCopiarPresupuestoProducto.setVisible((this.isVisibilidadCeldaCopiarPresupuestoProducto && this.isPermisoCopiarPresupuestoProducto));
			this.jButtonVerFormPresupuestoProducto.setVisible((this.isVisibilidadCeldaVerFormPresupuestoProducto && this.isPermisoVerFormPresupuestoProducto));
			
			this.jButtonAbrirOrderByPresupuestoProducto.setVisible((this.isVisibilidadCeldaOrdenPresupuestoProducto && this.isPermisoOrdenPresupuestoProducto));			
			
			this.jButtonNuevoRelacionesPresupuestoProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesPresupuestoProducto && this.isPermisoNuevoPresupuestoProducto));			
			this.jButtonNuevoGuardarCambiosPresupuestoProducto.setVisible((this.isVisibilidadCeldaNuevoPresupuestoProducto && this.isPermisoNuevoPresupuestoProducto && this.isPermisoGuardarCambiosPresupuestoProducto));
			
			if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
			this.jInternalFrameDetalleFormPresupuestoProducto.jButtonModificarPresupuestoProducto.setVisible((this.isVisibilidadCeldaModificarPresupuestoProducto && this.isPermisoActualizarPresupuestoProducto));	
			this.jInternalFrameDetalleFormPresupuestoProducto.jButtonActualizarPresupuestoProducto.setVisible((this.isVisibilidadCeldaActualizarPresupuestoProducto && this.isPermisoActualizarPresupuestoProducto));	
			this.jInternalFrameDetalleFormPresupuestoProducto.jButtonEliminarPresupuestoProducto.setVisible((this.isVisibilidadCeldaEliminarPresupuestoProducto && this.isPermisoEliminarPresupuestoProducto));
			this.jInternalFrameDetalleFormPresupuestoProducto.jButtonCancelarPresupuestoProducto.setVisible(this.isVisibilidadCeldaCancelarPresupuestoProducto);							
			this.jInternalFrameDetalleFormPresupuestoProducto.jButtonGuardarCambiosPresupuestoProducto.setVisible((this.isVisibilidadCeldaGuardarPresupuestoProducto && this.isPermisoGuardarCambiosPresupuestoProducto));			
			
			}
						
			this.jButtonGuardarCambiosTablaPresupuestoProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosPresupuestoProducto && this.isPermisoGuardarCambiosPresupuestoProducto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPresupuestoProducto.setVisible((this.isVisibilidadCeldaNuevoPresupuestoProducto && this.isPermisoNuevoPresupuestoProducto));						
			this.jButtonDuplicarToolBarPresupuestoProducto.setVisible((this.isVisibilidadCeldaDuplicarPresupuestoProducto && this.isPermisoDuplicarPresupuestoProducto));						
			this.jButtonCopiarToolBarPresupuestoProducto.setVisible((this.isVisibilidadCeldaCopiarPresupuestoProducto && this.isPermisoCopiarPresupuestoProducto));			
			this.jButtonVerFormToolBarPresupuestoProducto.setVisible((this.isVisibilidadCeldaVerFormPresupuestoProducto && this.isPermisoVerFormPresupuestoProducto));			
			this.jButtonAbrirOrderByToolBarPresupuestoProducto.setVisible((this.isVisibilidadCeldaOrdenPresupuestoProducto && this.isPermisoOrdenPresupuestoProducto));
			this.jButtonNuevoRelacionesToolBarPresupuestoProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesPresupuestoProducto && this.isPermisoNuevoPresupuestoProducto));			
			this.jButtonNuevoGuardarCambiosToolBarPresupuestoProducto.setVisible((this.isVisibilidadCeldaNuevoPresupuestoProducto && this.isPermisoNuevoPresupuestoProducto && this.isPermisoGuardarCambiosPresupuestoProducto));			
			
			if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
			this.jInternalFrameDetalleFormPresupuestoProducto.jButtonModificarToolBarPresupuestoProducto.setVisible((this.isVisibilidadCeldaModificarPresupuestoProducto && this.isPermisoActualizarPresupuestoProducto));	
			this.jInternalFrameDetalleFormPresupuestoProducto.jButtonActualizarToolBarPresupuestoProducto.setVisible((this.isVisibilidadCeldaActualizarPresupuestoProducto  && this.isPermisoActualizarPresupuestoProducto));	
			this.jInternalFrameDetalleFormPresupuestoProducto.jButtonEliminarToolBarPresupuestoProducto.setVisible((this.isVisibilidadCeldaEliminarPresupuestoProducto && this.isPermisoEliminarPresupuestoProducto));
			this.jInternalFrameDetalleFormPresupuestoProducto.jButtonCancelarToolBarPresupuestoProducto.setVisible(this.isVisibilidadCeldaCancelarPresupuestoProducto);				
			this.jInternalFrameDetalleFormPresupuestoProducto.jButtonGuardarCambiosToolBarPresupuestoProducto.setVisible((this.isVisibilidadCeldaGuardarPresupuestoProducto && this.isPermisoGuardarCambiosPresupuestoProducto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPresupuestoProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosPresupuestoProducto && this.isPermisoGuardarCambiosPresupuestoProducto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPresupuestoProducto.setVisible((this.isVisibilidadCeldaNuevoPresupuestoProducto && this.isPermisoNuevoPresupuestoProducto));			
			this.jMenuItemDuplicarPresupuestoProducto.setVisible((this.isVisibilidadCeldaDuplicarPresupuestoProducto && this.isPermisoDuplicarPresupuestoProducto));			
			this.jMenuItemCopiarPresupuestoProducto.setVisible((this.isVisibilidadCeldaCopiarPresupuestoProducto && this.isPermisoCopiarPresupuestoProducto));			
			this.jMenuItemVerFormPresupuestoProducto.setVisible((this.isVisibilidadCeldaVerFormPresupuestoProducto && this.isPermisoVerFormPresupuestoProducto));			
			this.jMenuItemAbrirOrderByPresupuestoProducto.setVisible((this.isVisibilidadCeldaOrdenPresupuestoProducto && this.isPermisoOrdenPresupuestoProducto));			
			//this.jMenuItemMostrarOcultarPresupuestoProducto.setVisible((this.isVisibilidadCeldaOrdenPresupuestoProducto && this.isPermisoOrdenPresupuestoProducto));
			this.jMenuItemDetalleAbrirOrderByPresupuestoProducto.setVisible((this.isVisibilidadCeldaOrdenPresupuestoProducto && this.isPermisoOrdenPresupuestoProducto));			
			//this.jMenuItemDetalleMostrarOcultarPresupuestoProducto.setVisible((this.isVisibilidadCeldaOrdenPresupuestoProducto && this.isPermisoOrdenPresupuestoProducto));			
			this.jMenuItemNuevoRelacionesPresupuestoProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesPresupuestoProducto && this.isPermisoNuevoPresupuestoProducto));			
			this.jMenuItemNuevoGuardarCambiosPresupuestoProducto.setVisible((this.isVisibilidadCeldaNuevoPresupuestoProducto && this.isPermisoNuevoPresupuestoProducto && this.isPermisoGuardarCambiosPresupuestoProducto));									
			
			if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
			this.jInternalFrameDetalleFormPresupuestoProducto.jMenuItemModificarPresupuestoProducto.setVisible((this.isVisibilidadCeldaModificarPresupuestoProducto && this.isPermisoActualizarPresupuestoProducto));	
			this.jInternalFrameDetalleFormPresupuestoProducto.jMenuItemActualizarPresupuestoProducto.setVisible((this.isVisibilidadCeldaActualizarPresupuestoProducto && this.isPermisoActualizarPresupuestoProducto));	
			this.jInternalFrameDetalleFormPresupuestoProducto.jMenuItemEliminarPresupuestoProducto.setVisible((this.isVisibilidadCeldaEliminarPresupuestoProducto && this.isPermisoEliminarPresupuestoProducto));
			this.jInternalFrameDetalleFormPresupuestoProducto.jMenuItemCancelarPresupuestoProducto.setVisible(this.isVisibilidadCeldaCancelarPresupuestoProducto);				
			}
			
			this.jMenuItemGuardarCambiosPresupuestoProducto.setVisible((this.isVisibilidadCeldaGuardarPresupuestoProducto && this.isPermisoGuardarCambiosPresupuestoProducto));						
			this.jMenuItemGuardarCambiosTablaPresupuestoProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosPresupuestoProducto && this.isPermisoGuardarCambiosPresupuestoProducto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPresupuestoProducto=this.jButtonNuevoPresupuestoProducto.isVisible();
			this.isVisibilidadCeldaDuplicarPresupuestoProducto=this.jButtonDuplicarPresupuestoProducto.isVisible();
			this.isVisibilidadCeldaCopiarPresupuestoProducto=this.jButtonCopiarPresupuestoProducto.isVisible();
			this.isVisibilidadCeldaVerFormPresupuestoProducto=this.jButtonVerFormPresupuestoProducto.isVisible();
			
			this.isVisibilidadCeldaOrdenPresupuestoProducto=this.jButtonAbrirOrderByPresupuestoProducto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoProducto=this.jButtonNuevoRelacionesPresupuestoProducto.isVisible();
			this.isVisibilidadCeldaModificarPresupuestoProducto=this.jButtonModificarPresupuestoProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
			this.isVisibilidadCeldaActualizarPresupuestoProducto=this.jInternalFrameDetalleFormPresupuestoProducto.jButtonActualizarPresupuestoProducto.isVisible();
			this.isVisibilidadCeldaEliminarPresupuestoProducto=this.jInternalFrameDetalleFormPresupuestoProducto.jButtonEliminarPresupuestoProducto.isVisible();
			this.isVisibilidadCeldaCancelarPresupuestoProducto=this.jInternalFrameDetalleFormPresupuestoProducto.jButtonCancelarPresupuestoProducto.isVisible();
			this.isVisibilidadCeldaGuardarPresupuestoProducto=this.jInternalFrameDetalleFormPresupuestoProducto.jButtonGuardarCambiosPresupuestoProducto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPresupuestoProducto=this.jButtonGuardarCambiosTablaPresupuestoProducto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPresupuestoProducto=this.jButtonNuevoToolBarPresupuestoProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoProducto=this.jButtonNuevoRelacionesToolBarPresupuestoProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
			this.isVisibilidadCeldaModificarPresupuestoProducto=this.jInternalFrameDetalleFormPresupuestoProducto.jButtonModificarToolBarPresupuestoProducto.isVisible();
			this.isVisibilidadCeldaActualizarPresupuestoProducto=this.jInternalFrameDetalleFormPresupuestoProducto.jButtonActualizarToolBarPresupuestoProducto.isVisible();
			this.isVisibilidadCeldaEliminarPresupuestoProducto=this.jInternalFrameDetalleFormPresupuestoProducto.jButtonEliminarToolBarPresupuestoProducto.isVisible();
			this.isVisibilidadCeldaCancelarPresupuestoProducto=this.jInternalFrameDetalleFormPresupuestoProducto.jButtonCancelarToolBarPresupuestoProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPresupuestoProducto=this.jButtonGuardarCambiosToolBarPresupuestoProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPresupuestoProducto=this.jButtonGuardarCambiosTablaToolBarPresupuestoProducto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPresupuestoProducto=this.jMenuItemNuevoPresupuestoProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoProducto=this.jMenuItemNuevoRelacionesPresupuestoProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
			this.isVisibilidadCeldaModificarPresupuestoProducto=this.jInternalFrameDetalleFormPresupuestoProducto.jMenuItemModificarPresupuestoProducto.isVisible();
			this.isVisibilidadCeldaActualizarPresupuestoProducto=this.jInternalFrameDetalleFormPresupuestoProducto.jMenuItemActualizarPresupuestoProducto.isVisible();
			this.isVisibilidadCeldaEliminarPresupuestoProducto=this.jInternalFrameDetalleFormPresupuestoProducto.jMenuItemEliminarPresupuestoProducto.isVisible();
			this.isVisibilidadCeldaCancelarPresupuestoProducto=this.jInternalFrameDetalleFormPresupuestoProducto.jMenuItemCancelarPresupuestoProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPresupuestoProducto=this.jMenuItemGuardarCambiosPresupuestoProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPresupuestoProducto=this.jMenuItemGuardarCambiosTablaPresupuestoProducto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPresupuestoProducto(Boolean esInicializar) {
		if(PresupuestoProductoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.presupuestoproductoSessionBean.getConGuardarRelaciones()) {
				//if(this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPresupuestoProducto();
			}
			
			this.inicializarActualizarBindingBotonesManualPresupuestoProducto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPresupuestoProducto() {
		this.jButtonNuevoPresupuestoProducto.setVisible(this.isPermisoNuevoPresupuestoProducto);			
		this.jButtonDuplicarPresupuestoProducto.setVisible(this.isPermisoDuplicarPresupuestoProducto);			
		this.jButtonCopiarPresupuestoProducto.setVisible(this.isPermisoCopiarPresupuestoProducto);			
		this.jButtonVerFormPresupuestoProducto.setVisible(this.isPermisoVerFormPresupuestoProducto);			
		
		this.jButtonAbrirOrderByPresupuestoProducto.setVisible(this.isPermisoOrdenPresupuestoProducto);					
		
		this.jButtonNuevoRelacionesPresupuestoProducto.setVisible(this.isPermisoNuevoPresupuestoProducto);			
		
		if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoProducto.jButtonModificarPresupuestoProducto.setVisible(this.isPermisoActualizarPresupuestoProducto);	
			this.jInternalFrameDetalleFormPresupuestoProducto.jButtonActualizarPresupuestoProducto.setVisible(this.isPermisoActualizarPresupuestoProducto);	
			this.jInternalFrameDetalleFormPresupuestoProducto.jButtonEliminarPresupuestoProducto.setVisible(this.isPermisoEliminarPresupuestoProducto);
			this.jInternalFrameDetalleFormPresupuestoProducto.jButtonCancelarPresupuestoProducto.setVisible(this.isVisibilidadCeldaCancelarPresupuestoProducto);						
			this.jInternalFrameDetalleFormPresupuestoProducto.jButtonGuardarCambiosPresupuestoProducto.setVisible(this.isPermisoGuardarCambiosPresupuestoProducto);							
		}
		
		this.jButtonGuardarCambiosTablaPresupuestoProducto.setVisible(this.isPermisoActualizarPresupuestoProducto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePresupuestoProducto() {
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonModificarPresupuestoProducto.setVisible(this.isPermisoActualizarPresupuestoProducto);	
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonActualizarPresupuestoProducto.setVisible(this.isPermisoActualizarPresupuestoProducto);	
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonEliminarPresupuestoProducto.setVisible(this.isPermisoEliminarPresupuestoProducto);
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonCancelarPresupuestoProducto.setVisible(this.isVisibilidadCeldaCancelarPresupuestoProducto);							
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonGuardarCambiosPresupuestoProducto.setVisible((this.isVisibilidadCeldaGuardarPresupuestoProducto && this.isPermisoGuardarCambiosPresupuestoProducto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPresupuestoProducto() {
		if(PresupuestoProductoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPresupuestoProducto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPresupuestoProducto() {
	}
	
	public void jTableDatosPresupuestoProductoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPresupuestoProducto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPresupuestoProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoProducto(this.getpresupuestoproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoProducto(this.presupuestoproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductoLogic.getPresupuestoProductos().toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductos.toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoproducto==null) {
						this.presupuestoproducto = new PresupuestoProducto();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoProducto(this.presupuestoproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoProducto(this.presupuestoproducto);
				}

				if(this.presupuestoproducto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.presupuestoproducto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaPresupuestoProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebPresupuestoProducto(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresupuestoProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresupuestoProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductoLogic.getPresupuestoProductos().toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductos.toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresupuestoProducto(this.getpresupuestoproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoProducto(this.presupuestoproducto);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.presupuestoproductoLogic.getConnexion());

				if(this.presupuestoproducto.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.presupuestoproducto.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresupuestoProducto=(TitledBorder)this.jScrollPanelDatosPresupuestoProducto.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderPresupuestoProducto.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaPresupuestoProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoProducto(this.getpresupuestoproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoProducto(this.presupuestoproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductoLogic.getPresupuestoProductos().toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductos.toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoproducto==null) {
						this.presupuestoproducto = new PresupuestoProducto();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoProducto(this.presupuestoproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoProducto(this.presupuestoproducto);
				}

				if(this.presupuestoproducto.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.presupuestoproducto.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalPresupuestoProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebPresupuestoProducto(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresupuestoProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresupuestoProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductoLogic.getPresupuestoProductos().toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductos.toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresupuestoProducto(this.getpresupuestoproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoProducto(this.presupuestoproducto);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.presupuestoproductoLogic.getConnexion());

				if(this.presupuestoproducto.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.presupuestoproducto.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresupuestoProducto=(TitledBorder)this.jScrollPanelDatosPresupuestoProducto.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderPresupuestoProducto.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalPresupuestoProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoProducto(this.getpresupuestoproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoProducto(this.presupuestoproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductoLogic.getPresupuestoProductos().toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductos.toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoproducto==null) {
						this.presupuestoproducto = new PresupuestoProducto();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoProducto(this.presupuestoproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoProducto(this.presupuestoproducto);
				}

				if(this.presupuestoproducto.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.presupuestoproducto.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioPresupuestoProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebPresupuestoProducto(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresupuestoProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresupuestoProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductoLogic.getPresupuestoProductos().toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductos.toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresupuestoProducto(this.getpresupuestoproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoProducto(this.presupuestoproducto);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.presupuestoproductoLogic.getConnexion());

				if(this.presupuestoproducto.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.presupuestoproducto.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresupuestoProducto=(TitledBorder)this.jScrollPanelDatosPresupuestoProducto.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderPresupuestoProducto.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioPresupuestoProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoProducto(this.getpresupuestoproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoProducto(this.presupuestoproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductoLogic.getPresupuestoProductos().toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductos.toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoproducto==null) {
						this.presupuestoproducto = new PresupuestoProducto();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoProducto(this.presupuestoproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoProducto(this.presupuestoproducto);
				}

				if(this.presupuestoproducto.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.presupuestoproducto.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoPresupuestoProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebPresupuestoProducto(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresupuestoProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresupuestoProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductoLogic.getPresupuestoProductos().toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductos.toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresupuestoProducto(this.getpresupuestoproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoProducto(this.presupuestoproducto);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.presupuestoproductoLogic.getConnexion());

				if(this.presupuestoproducto.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.presupuestoproducto.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresupuestoProducto=(TitledBorder)this.jScrollPanelDatosPresupuestoProducto.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderPresupuestoProducto.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoPresupuestoProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoProducto(this.getpresupuestoproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoProducto(this.presupuestoproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductoLogic.getPresupuestoProductos().toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductos.toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoproducto==null) {
						this.presupuestoproducto = new PresupuestoProducto();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoProducto(this.presupuestoproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoProducto(this.presupuestoproducto);
				}

				if(this.presupuestoproducto.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.presupuestoproducto.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contablePresupuestoProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontable=true;

			idTienePermisocuentacontable=this.tienePermisosUsuarioEnPaginaWebPresupuestoProducto(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresupuestoProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresupuestoProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductoLogic.getPresupuestoProductos().toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductos.toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresupuestoProducto(this.getpresupuestoproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoProducto(this.presupuestoproducto);

				this.cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontableBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.presupuestoproductoLogic.getConnexion());

				if(this.presupuestoproducto.getid_cuenta_contable()!=null) {
					this.cuentacontableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontableBeanSwingJInternalFrame.setIdActual(this.presupuestoproducto.getid_cuenta_contable());
					this.cuentacontableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresupuestoProducto=(TitledBorder)this.jScrollPanelDatosPresupuestoProducto.getBorder();
				TitledBorder titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderPresupuestoProducto.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contablePresupuestoProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoProducto(this.getpresupuestoproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoProducto(this.presupuestoproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductoLogic.getPresupuestoProductos().toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductos.toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoproducto==null) {
						this.presupuestoproducto = new PresupuestoProducto();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoProducto(this.presupuestoproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoProducto(this.presupuestoproducto);
				}

				if(this.presupuestoproducto.getid_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable = "+this.presupuestoproducto.getid_cuenta_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaPresupuestoProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebPresupuestoProducto(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresupuestoProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresupuestoProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductoLogic.getPresupuestoProductos().toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductos.toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresupuestoProducto(this.getpresupuestoproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoProducto(this.presupuestoproducto);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.presupuestoproductoLogic.getConnexion());

				if(this.presupuestoproducto.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.presupuestoproducto.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresupuestoProducto=(TitledBorder)this.jScrollPanelDatosPresupuestoProducto.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderPresupuestoProducto.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaPresupuestoProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoProducto(this.getpresupuestoproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoProducto(this.presupuestoproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductoLogic.getPresupuestoProductos().toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductos.toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoproducto==null) {
						this.presupuestoproducto = new PresupuestoProducto();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoProducto(this.presupuestoproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoProducto(this.presupuestoproducto);
				}

				if(this.presupuestoproducto.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.presupuestoproducto.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoPresupuestoProductoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderPresupuestoProducto=null;
			TitledBorder titledBorderproducto=null;

			if(!this.jScrollPanelDatosPresupuestoProducto.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderPresupuestoProducto=(TitledBorder)this.jScrollPanelDatosPresupuestoProducto.getBorder();
				titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderPresupuestoProducto.getTitle() + " -> Producto");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_productoPresupuestoProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebPresupuestoProducto(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresupuestoProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresupuestoProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductoLogic.getPresupuestoProductos().toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductos.toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresupuestoProducto(this.getpresupuestoproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoProducto(this.presupuestoproducto);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.presupuestoproductoLogic.getConnexion());

				if(this.presupuestoproducto.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.presupuestoproducto.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresupuestoProducto=(TitledBorder)this.jScrollPanelDatosPresupuestoProducto.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderPresupuestoProducto.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoPresupuestoProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoProducto(this.getpresupuestoproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoProducto(this.presupuestoproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductoLogic.getPresupuestoProductos().toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductos.toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoproducto==null) {
						this.presupuestoproducto = new PresupuestoProducto();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoProducto(this.presupuestoproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoProducto(this.presupuestoproducto);
				}

				if(this.presupuestoproducto.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.presupuestoproducto.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_ingresoPresupuestoProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoProducto(this.getpresupuestoproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoProducto(this.presupuestoproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductoLogic.getPresupuestoProductos().toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductos.toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoproducto==null) {
						this.presupuestoproducto = new PresupuestoProducto();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoProducto(this.presupuestoproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoProducto(this.presupuestoproducto);
				}

				if(this.presupuestoproducto.getvalor_ingreso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_ingreso = "+this.presupuestoproducto.getvalor_ingreso().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_egresoPresupuestoProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoProducto(this.getpresupuestoproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoProducto(this.presupuestoproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductoLogic.getPresupuestoProductos().toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductos.toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoproducto==null) {
						this.presupuestoproducto = new PresupuestoProducto();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoProducto(this.presupuestoproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoProducto(this.presupuestoproducto);
				}

				if(this.presupuestoproducto.getvalor_egreso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_egreso = "+this.presupuestoproducto.getvalor_egreso().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidad_ingresoPresupuestoProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoProducto(this.getpresupuestoproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoProducto(this.presupuestoproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductoLogic.getPresupuestoProductos().toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductos.toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoproducto==null) {
						this.presupuestoproducto = new PresupuestoProducto();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoProducto(this.presupuestoproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoProducto(this.presupuestoproducto);
				}

				if(this.presupuestoproducto.getcantidad_ingreso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad_ingreso = "+this.presupuestoproducto.getcantidad_ingreso().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidad_egresoPresupuestoProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoProducto(this.getpresupuestoproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoProducto(this.presupuestoproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductoLogic.getPresupuestoProductos().toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductos.toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoproducto==null) {
						this.presupuestoproducto = new PresupuestoProducto();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoProducto(this.presupuestoproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoProducto(this.presupuestoproducto);
				}

				if(this.presupuestoproducto.getcantidad_egreso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad_egreso = "+this.presupuestoproducto.getcantidad_egreso().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdBodegaPresupuestoProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresupuestoProducto(false,false);

			this.getPresupuestoProductosFK_IdBodega();

			this.inicializarActualizarBindingPresupuestoProducto(false);

			//if(PresupuestoProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresupuestoProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContablePresupuestoProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresupuestoProducto(false,false);

			this.getPresupuestoProductosFK_IdCuentaContable();

			this.inicializarActualizarBindingPresupuestoProducto(false);

			//if(PresupuestoProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresupuestoProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioPresupuestoProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresupuestoProducto(false,false);

			this.getPresupuestoProductosFK_IdEjercicio();

			this.inicializarActualizarBindingPresupuestoProducto(false);

			//if(PresupuestoProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresupuestoProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaPresupuestoProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresupuestoProducto(false,false);

			this.getPresupuestoProductosFK_IdEmpresa();

			this.inicializarActualizarBindingPresupuestoProducto(false);

			//if(PresupuestoProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresupuestoProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoPresupuestoProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresupuestoProducto(false,false);

			this.getPresupuestoProductosFK_IdPeriodo();

			this.inicializarActualizarBindingPresupuestoProducto(false);

			//if(PresupuestoProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresupuestoProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoPresupuestoProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresupuestoProducto(false,false);

			this.getPresupuestoProductosFK_IdProducto();

			this.inicializarActualizarBindingPresupuestoProducto(false);

			//if(PresupuestoProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresupuestoProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalPresupuestoProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresupuestoProducto(false,false);

			this.getPresupuestoProductosFK_IdSucursal();

			this.inicializarActualizarBindingPresupuestoProducto(false);

			//if(PresupuestoProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresupuestoProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePresupuestoProducto() {
		if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
			this.jInternalFrameDetalleFormPresupuestoProducto.setVisible(false);	    			
			this.jInternalFrameDetalleFormPresupuestoProducto.dispose();
			this.jInternalFrameDetalleFormPresupuestoProducto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPresupuestoProducto!=null) {
			this.jInternalFrameReporteDinamicoPresupuestoProducto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPresupuestoProducto.dispose();
			this.jInternalFrameReporteDinamicoPresupuestoProducto=null;
		}
		
		if(this.jInternalFrameImportacionPresupuestoProducto!=null) {
			this.jInternalFrameImportacionPresupuestoProducto.setVisible(false);	    			
			this.jInternalFrameImportacionPresupuestoProducto.dispose();
			this.jInternalFrameImportacionPresupuestoProducto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPresupuestoProducto();
			
			PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
			
			
			if(sTipo.equals("NuevoPresupuestoProducto")) {
				jButtonNuevoPresupuestoProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPresupuestoProducto")) {
				jButtonDuplicarPresupuestoProductoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPresupuestoProducto")) {
				jButtonCopiarPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormPresupuestoProducto")) {
				jButtonVerFormPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPresupuestoProducto")) {
				jButtonNuevoPresupuestoProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPresupuestoProducto")) {
				jButtonDuplicarPresupuestoProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPresupuestoProducto")) {
				jButtonNuevoPresupuestoProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPresupuestoProducto")) {
				jButtonDuplicarPresupuestoProductoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPresupuestoProducto")) {
				jButtonNuevoPresupuestoProductoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPresupuestoProducto")) {
				jButtonNuevoPresupuestoProductoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPresupuestoProducto")) {
				jButtonNuevoPresupuestoProductoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPresupuestoProducto")) {
				jButtonModificarPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPresupuestoProducto")) {
				jButtonModificarPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPresupuestoProducto")) {
				jButtonModificarPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPresupuestoProducto")) {
				jButtonActualizarPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPresupuestoProducto")) {
				jButtonActualizarPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPresupuestoProducto")) {
				jButtonActualizarPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarPresupuestoProducto")) {
				jButtonEliminarPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPresupuestoProducto")) {
				jButtonEliminarPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPresupuestoProducto")) {
				jButtonEliminarPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarPresupuestoProducto")) {
				jButtonCancelarPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPresupuestoProducto")) {
				jButtonCancelarPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPresupuestoProducto")) {
				jButtonCancelarPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarPresupuestoProducto")) {
				jButtonCerrarPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPresupuestoProducto")) {
				jButtonCerrarPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPresupuestoProducto")) {
				jButtonCerrarPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPresupuestoProducto")) {
				jButtonMostrarOcultarPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPresupuestoProducto")) {
				jButtonCancelarPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPresupuestoProducto")) {
				jButtonGuardarCambiosPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPresupuestoProducto")) {
				jButtonGuardarCambiosPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPresupuestoProducto")) {
				jButtonCopiarPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPresupuestoProducto")) {
				jButtonVerFormPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPresupuestoProducto")) {
				jButtonGuardarCambiosPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPresupuestoProducto")) {
				jButtonCopiarPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPresupuestoProducto")) {
				jButtonVerFormPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPresupuestoProducto")) {
				jButtonGuardarCambiosPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPresupuestoProducto")) {
				jButtonGuardarCambiosPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPresupuestoProducto")) {
				jButtonGuardarCambiosPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPresupuestoProducto")) {
				jButtonRecargarInformacionPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPresupuestoProducto")) {
				jButtonRecargarInformacionPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPresupuestoProducto")) {
				jButtonRecargarInformacionPresupuestoProductoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPresupuestoProducto")) {
				jButtonAnterioresPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPresupuestoProducto")) {
				jButtonAnterioresPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePresupuestoProducto")) {
				jButtonAnterioresPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPresupuestoProducto")) {
				jButtonSiguientesPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPresupuestoProducto")) {
				jButtonSiguientesPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPresupuestoProducto")) {
				jButtonSiguientesPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPresupuestoProducto") || sTipo.equals("MenuItemDetalleAbrirOrderByPresupuestoProducto")) {
				jButtonAbrirOrderByPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPresupuestoProducto") || sTipo.equals("MenuItemDetalleMostrarOcultarPresupuestoProducto")) {
				jButtonMostrarOcultarPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPresupuestoProducto")) {
				jButtonNuevoGuardarCambiosPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPresupuestoProducto")) {
				jButtonNuevoGuardarCambiosPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPresupuestoProducto")) {
				jButtonNuevoGuardarCambiosPresupuestoProductoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPresupuestoProducto")) {
				jButtonCerrarReporteDinamicoPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPresupuestoProducto")) {
				jButtonGenerarReporteDinamicoPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPresupuestoProducto")) {
				
				jButtonGenerarExcelReporteDinamicoPresupuestoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPresupuestoProducto")) {
				jButtonCerrarImportacionPresupuestoProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPresupuestoProducto")) {
				
				jButtonGenerarImportacionPresupuestoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPresupuestoProducto")) {
				
				jButtonAbrirImportacionPresupuestoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPresupuestoProducto")) {
				jComboBoxTiposAccionesPresupuestoProductoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPresupuestoProducto")) {
				jComboBoxTiposRelacionesPresupuestoProductoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPresupuestoProducto")) {
				jComboBoxTiposAccionesPresupuestoProductoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPresupuestoProducto")) {
				
				jComboBoxTiposSeleccionarPresupuestoProductoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPresupuestoProducto")) {
				jTextFieldValorCampoGeneralPresupuestoProductoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPresupuestoProducto")) {
				jButtonAbrirOrderByPresupuestoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPresupuestoProducto")) {
				jButtonAbrirOrderByPresupuestoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPresupuestoProducto")) {
				jButtonCerrarOrderByPresupuestoProductoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPresupuestoProductoBusqueda")) {
				this.jButtonidPresupuestoProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPresupuestoProductoUpdate")) {
				this.jButtonid_empresaPresupuestoProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPresupuestoProductoBusqueda")) {
				this.jButtonid_empresaPresupuestoProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalPresupuestoProductoUpdate")) {
				this.jButtonid_sucursalPresupuestoProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalPresupuestoProductoBusqueda")) {
				this.jButtonid_sucursalPresupuestoProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioPresupuestoProductoUpdate")) {
				this.jButtonid_ejercicioPresupuestoProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioPresupuestoProductoBusqueda")) {
				this.jButtonid_ejercicioPresupuestoProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoPresupuestoProductoUpdate")) {
				this.jButtonid_periodoPresupuestoProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoPresupuestoProductoBusqueda")) {
				this.jButtonid_periodoPresupuestoProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contablePresupuestoProductoUpdate")) {
				this.jButtonid_cuenta_contablePresupuestoProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contablePresupuestoProductoBusqueda")) {
				this.jButtonid_cuenta_contablePresupuestoProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaPresupuestoProductoUpdate")) {
				this.jButtonid_bodegaPresupuestoProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaPresupuestoProductoBusqueda")) {
				this.jButtonid_bodegaPresupuestoProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoPresupuestoProducto")) {
				this.jButtonid_productoPresupuestoProductoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoPresupuestoProductoUpdate")) {
				this.jButtonid_productoPresupuestoProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoPresupuestoProductoBusqueda")) {
				this.jButtonid_productoPresupuestoProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_ingresoPresupuestoProductoBusqueda")) {
				this.jButtonvalor_ingresoPresupuestoProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_egresoPresupuestoProductoBusqueda")) {
				this.jButtonvalor_egresoPresupuestoProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_ingresoPresupuestoProductoBusqueda")) {
				this.jButtoncantidad_ingresoPresupuestoProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_egresoPresupuestoProductoBusqueda")) {
				this.jButtoncantidad_egresoPresupuestoProductoBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_productoPresupuestoProducto")) {
				this.jButtonid_productoPresupuestoProductoActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdBodegaPresupuestoProducto")) {
				this.jButtonFK_IdBodegaPresupuestoProductoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdCuentaContablePresupuestoProducto")) {
				this.jButtonFK_IdCuentaContablePresupuestoProductoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdProductoPresupuestoProducto")) {
				this.jButtonFK_IdProductoPresupuestoProductoActionPerformed(evt);
			}
			
			;
			
			
			PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPresupuestoProducto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestoProductoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoproducto);
				
				PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
				
				


				
				PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PresupuestoProducto presupuestoproductoLocal=null;
			
			if(!this.getEsControlTabla()) {
				presupuestoproductoLocal=this.presupuestoproducto;
			} else {
				presupuestoproductoLocal=this.presupuestoproductoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoproducto);
				
				PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
							
				
				


				
				PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestoProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresupuestoProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoAnterior =(PresupuestoProducto) this.presupuestoproductoLogic.getPresupuestoProductos().toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestoproductoAnterior =(PresupuestoProducto) this.presupuestoproductos.toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
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
			
			PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
			
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
			
			


			
			PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestoProductoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoproducto);
				
				PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
								
						
				


				
				PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoProducto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoproducto);
				
				PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
								
				
				


				
				PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestoProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresupuestoProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoAnterior =(PresupuestoProducto) this.presupuestoproductoLogic.getPresupuestoProductos().toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestoproductoAnterior =(PresupuestoProducto) this.presupuestoproductos.toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoproducto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestoProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresupuestoProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoAnterior =(PresupuestoProducto) this.presupuestoproductoLogic.getPresupuestoProductos().toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestoproductoAnterior =(PresupuestoProducto) this.presupuestoproductos.toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestoProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.presupuestoproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoproducto);
				
				PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
							
				
				


				
				PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoProducto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestoProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPresupuestoProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoproductoAnterior =(PresupuestoProducto) this.presupuestoproductoLogic.getPresupuestoProductos().toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.presupuestoproductoAnterior =(PresupuestoProducto) this.presupuestoproductos.toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
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
			
			PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
			
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
			
			


			
			PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestoProductoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.presupuestoproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoproducto);
				
				PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
								
				
				


				
				PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestoProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresupuestoProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoAnterior =(PresupuestoProducto) this.presupuestoproductoLogic.getPresupuestoProductos().toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestoproductoAnterior =(PresupuestoProducto) this.presupuestoproductos.toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestoProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.presupuestoproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestoProductoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoproducto);
				
				PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPresupuestoProducto")) {
					jCheckBoxSeleccionarTodosPresupuestoProductoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPresupuestoProducto")) {
					jCheckBoxSeleccionadosPresupuestoProductoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPresupuestoProducto")) {
					
				}
				
				


				
				
				PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoproducto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.presupuestoproducto);
				
				PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
												
				
				


				
				
				PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestoProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPresupuestoProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoproductoAnterior =(PresupuestoProducto) this.presupuestoproductoLogic.getPresupuestoProductos().toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.presupuestoproductoAnterior =(PresupuestoProducto) this.presupuestoproductos.toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestoProductoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoproducto);
				
				PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
				
				
				PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
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
			
			PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
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
			
			


			
			PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestoProductoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoproducto);
				
				PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoProducto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoProducto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoproducto);
				
				PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
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
				
				


				
				PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoProducto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestoProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresupuestoProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoproductoAnterior =(PresupuestoProducto) this.presupuestoproductoLogic.getPresupuestoProductos().toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestoproductoAnterior =(PresupuestoProducto) this.presupuestoproductos.toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPresupuestoProducto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPresupuestoProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPresupuestoProducto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductoLogic.getPresupuestoProductos().toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.presupuestoproducto =(PresupuestoProducto) this.presupuestoproductos.toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.presupuestoproducto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPresupuestoProducto")) {
				
				}
				
				PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPresupuestoProducto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPresupuestoProducto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPresupuestoProducto")) {
			
			}
			
			PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPresupuestoProducto();
			
			PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
			
			if(sTipo.equals("NuevoPresupuestoProducto")) {
				jButtonNuevoPresupuestoProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPresupuestoProducto")) {
				jButtonDuplicarPresupuestoProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPresupuestoProducto")) {
				jButtonCopiarPresupuestoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPresupuestoProducto")) {
				jButtonVerFormPresupuestoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPresupuestoProducto")) {
				jButtonNuevoPresupuestoProductoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPresupuestoProducto")) {
				jButtonModificarPresupuestoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPresupuestoProducto")) {
				jButtonActualizarPresupuestoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPresupuestoProducto")) {
				jButtonEliminarPresupuestoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPresupuestoProducto")) {
				jButtonGuardarCambiosPresupuestoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPresupuestoProducto")) {
				jButtonCancelarPresupuestoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPresupuestoProducto")) {
				jButtonCerrarPresupuestoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPresupuestoProducto")) {
				jButtonGuardarCambiosPresupuestoProductoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPresupuestoProducto")) {
				jButtonNuevoGuardarCambiosPresupuestoProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPresupuestoProducto")) {
				jButtonAbrirOrderByPresupuestoProductoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPresupuestoProducto")) {
				jButtonRecargarInformacionPresupuestoProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPresupuestoProducto")) {
				jButtonAnterioresPresupuestoProductoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPresupuestoProducto")) {
				jButtonSiguientesPresupuestoProductoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPresupuestoProductoBusqueda")) {
				this.jButtonidPresupuestoProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPresupuestoProductoUpdate")) {
				this.jButtonid_empresaPresupuestoProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPresupuestoProductoBusqueda")) {
				this.jButtonid_empresaPresupuestoProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalPresupuestoProductoUpdate")) {
				this.jButtonid_sucursalPresupuestoProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalPresupuestoProductoBusqueda")) {
				this.jButtonid_sucursalPresupuestoProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioPresupuestoProductoUpdate")) {
				this.jButtonid_ejercicioPresupuestoProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioPresupuestoProductoBusqueda")) {
				this.jButtonid_ejercicioPresupuestoProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoPresupuestoProductoUpdate")) {
				this.jButtonid_periodoPresupuestoProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoPresupuestoProductoBusqueda")) {
				this.jButtonid_periodoPresupuestoProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contablePresupuestoProductoUpdate")) {
				this.jButtonid_cuenta_contablePresupuestoProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contablePresupuestoProductoBusqueda")) {
				this.jButtonid_cuenta_contablePresupuestoProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaPresupuestoProductoUpdate")) {
				this.jButtonid_bodegaPresupuestoProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaPresupuestoProductoBusqueda")) {
				this.jButtonid_bodegaPresupuestoProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoPresupuestoProducto")) {
				this.jButtonid_productoPresupuestoProductoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoPresupuestoProductoUpdate")) {
				this.jButtonid_productoPresupuestoProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoPresupuestoProductoBusqueda")) {
				this.jButtonid_productoPresupuestoProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_ingresoPresupuestoProductoBusqueda")) {
				this.jButtonvalor_ingresoPresupuestoProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_egresoPresupuestoProductoBusqueda")) {
				this.jButtonvalor_egresoPresupuestoProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_ingresoPresupuestoProductoBusqueda")) {
				this.jButtoncantidad_ingresoPresupuestoProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_egresoPresupuestoProductoBusqueda")) {
				this.jButtoncantidad_egresoPresupuestoProductoBusquedaActionPerformed(evt);
			}
			
			PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPresupuestoProducto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePresupuestoProducto")) {
				closingInternalFramePresupuestoProducto();
				
			} else if(sTipo.equals("jButtonCancelarPresupuestoProducto")) {
				JInternalFrameBase jInternalFrameDetalleFormPresupuestoProducto = (JInternalFrameBase)evt.getSource();
	            	
	            PresupuestoProductoBeanSwingJInternalFrame jInternalFrameParent=(PresupuestoProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormPresupuestoProducto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPresupuestoProductoActionPerformed(null);
			}
			
			PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.presupuestoproducto,new Object(),this.presupuestoproductoParameterGeneral,this.presupuestoproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPresupuestoProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPresupuestoProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPresupuestoProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.presupuestoproducto)) {
			if(!esControlTabla) {
				if(PresupuestoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPresupuestoProducto(this.presupuestoproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoProducto(this.presupuestoproducto);			
				}
				
				if(this.presupuestoproductoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPresupuestoProducto(this.presupuestoproducto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.presupuestoproductoReturnGeneral=presupuestoproductoLogic.procesarEventosPresupuestoProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presupuestoproductoLogic.getPresupuestoProductos(),this.presupuestoproducto,this.presupuestoproductoParameterGeneral,this.isEsNuevoPresupuestoProducto,classes);//this.presupuestoproductoLogic.getPresupuestoProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPresupuestoProducto(this.presupuestoproductoReturnGeneral,this.presupuestoproductoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.presupuestoproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPresupuestoProducto(classes,this.presupuestoproductoReturnGeneral,this.presupuestoproductoBean,false);
					}
						
					if(this.presupuestoproductoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPresupuestoProducto(this.presupuestoproductoReturnGeneral.getPresupuestoProducto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPresupuestoProducto(this.presupuestoproductoReturnGeneral.getPresupuestoProducto());	
					}
						
					if(this.presupuestoproductoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPresupuestoProducto(this.presupuestoproductoReturnGeneral.getPresupuestoProducto(),classes);//this.presupuestoproductoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPresupuestoProducto(this.presupuestoproducto,classes);//this.presupuestoproductoBean);									
				}
			
				if(PresupuestoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPresupuestoProducto(this.presupuestoproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoProducto(this.presupuestoproducto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.presupuestoproductoAnterior!=null) {
						this.presupuestoproducto=this.presupuestoproductoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.presupuestoproductoReturnGeneral=presupuestoproductoLogic.procesarEventosPresupuestoProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presupuestoproductoLogic.getPresupuestoProductos(),this.presupuestoproducto,this.presupuestoproductoParameterGeneral,this.isEsNuevoPresupuestoProducto,classes);//this.presupuestoproductoLogic.getPresupuestoProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.presupuestoproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.presupuestoproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.presupuestoproductoReturnGeneral.getPresupuestoProducto(),presupuestoproductoLogic.getPresupuestoProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.presupuestoproductoReturnGeneral.getPresupuestoProducto(),this.presupuestoproductos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPresupuestoProducto.repaint();
				
				//((AbstractTableModel) this.jTableDatosPresupuestoProducto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPresupuestoProducto();
			}
		}
	}
	
	public void actualizarVisualTableDatosPresupuestoProducto() throws Exception {
		
		PresupuestoProductoModel presupuestoproductoModel=(PresupuestoProductoModel)this.jTableDatosPresupuestoProducto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			presupuestoproductoModel.presupuestoproductos=this.presupuestoproductoLogic.getPresupuestoProductos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			presupuestoproductoModel.presupuestoproductos=this.presupuestoproductos;
		}
		
		
		((PresupuestoProductoModel) this.jTableDatosPresupuestoProducto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPresupuestoProducto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getpresupuestoproductoAnterior(),this.presupuestoproductoLogic.getPresupuestoProductos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getpresupuestoproductoAnterior(),this.presupuestoproductos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPresupuestoProducto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPresupuestoProducto(PresupuestoProducto presupuestoproducto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
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
										
				PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presupuestoproducto,new Object(),generalEntityParameterGeneral,this.presupuestoproductoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.presupuestoproductoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PresupuestoProductoConstantesFunciones.getClassesRelationshipsOfPresupuestoProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PresupuestoProductoConstantesFunciones.getClassesRelationshipsFromStringsOfPresupuestoProducto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPresupuestoProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PresupuestoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presupuestoproducto,new Object(),generalEntityParameterGeneral,this.presupuestoproductoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPresupuestoProducto(PresupuestoProductoBean presupuestoproductoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPresupuestoProducto(ArrayList<Classe> classes,PresupuestoProductoReturnGeneral presupuestoproductoReturnGeneral,PresupuestoProductoBean presupuestoproductoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPresupuestoProducto(PresupuestoProducto presupuestoproducto,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.presupuestoproducto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPresupuestoProducto = new PresupuestoProductoDetalleFormJInternalFrame(jDesktopPane,this.presupuestoproductoSessionBean.getConGuardarRelaciones(),this.presupuestoproductoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPresupuestoProducto);
		this.jInternalFrameDetalleFormPresupuestoProducto.setVisible(false);
		this.jInternalFrameDetalleFormPresupuestoProducto.setSelected(false);						
		
		this.jInternalFrameDetalleFormPresupuestoProducto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPresupuestoProducto.presupuestoproductoLogic=this.presupuestoproductoLogic;
		
		this.cargarCombosFrameForeignKeyPresupuestoProducto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePresupuestoProducto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePresupuestoProducto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPresupuestoProducto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPresupuestoProducto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPresupuestoProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPresupuestoProducto"));
		
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonModificarPresupuestoProducto.addActionListener(new ButtonActionListener(this,"ModificarPresupuestoProducto"));

		
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonModificarToolBarPresupuestoProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarPresupuestoProducto"));
					
		this.jInternalFrameDetalleFormPresupuestoProducto.jMenuItemModificarPresupuestoProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarPresupuestoProducto"));		
		
		
		
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonActualizarPresupuestoProducto.addActionListener (new ButtonActionListener(this,"ActualizarPresupuestoProducto"));
		
		
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonActualizarToolBarPresupuestoProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPresupuestoProducto"));
						
		this.jInternalFrameDetalleFormPresupuestoProducto.jMenuItemActualizarPresupuestoProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPresupuestoProducto"));		
		
		
		
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonEliminarPresupuestoProducto.addActionListener (new ButtonActionListener(this,"EliminarPresupuestoProducto"));
		
		
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonEliminarToolBarPresupuestoProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarPresupuestoProducto"));
								
		this.jInternalFrameDetalleFormPresupuestoProducto.jMenuItemEliminarPresupuestoProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPresupuestoProducto"));		
		
		
		
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonCancelarPresupuestoProducto.addActionListener (new ButtonActionListener(this,"CancelarPresupuestoProducto"));
		
		
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonCancelarToolBarPresupuestoProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarPresupuestoProducto"));
					
		this.jInternalFrameDetalleFormPresupuestoProducto.jMenuItemCancelarPresupuestoProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPresupuestoProducto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPresupuestoProducto.jMenuItemDetalleCerrarPresupuestoProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPresupuestoProducto"));		
		
		
		
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonGuardarCambiosToolBarPresupuestoProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPresupuestoProducto"));
		
		
		
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonGuardarCambiosToolBarPresupuestoProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPresupuestoProducto"));
		
		
		
		this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxTiposAccionesFormularioPresupuestoProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPresupuestoProducto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonidPresupuestoProductoBusqueda.addActionListener(new ButtonActionListener(this,"idPresupuestoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_empresaPresupuestoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPresupuestoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_empresaPresupuestoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPresupuestoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_sucursalPresupuestoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPresupuestoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_sucursalPresupuestoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPresupuestoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_ejercicioPresupuestoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPresupuestoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_ejercicioPresupuestoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPresupuestoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_periodoPresupuestoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_periodoPresupuestoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_periodoPresupuestoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoPresupuestoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_cuenta_contablePresupuestoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresupuestoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_cuenta_contablePresupuestoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresupuestoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_bodegaPresupuestoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaPresupuestoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_bodegaPresupuestoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaPresupuestoProductoBusqueda"));
		//jButtonid_productoPresupuestoProducto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoPresupuestoProductoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_productoPresupuestoProducto.addActionListener(new ButtonActionListener(this,"id_productoPresupuestoProducto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_productoPresupuestoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_productoPresupuestoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_productoPresupuestoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_productoPresupuestoProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonvalor_ingresoPresupuestoProductoBusqueda.addActionListener(new ButtonActionListener(this,"valor_ingresoPresupuestoProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonvalor_egresoPresupuestoProductoBusqueda.addActionListener(new ButtonActionListener(this,"valor_egresoPresupuestoProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtoncantidad_ingresoPresupuestoProductoBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_ingresoPresupuestoProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtoncantidad_egresoPresupuestoProductoBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_egresoPresupuestoProductoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPresupuestoProducto.jTabbedPaneRelacionesPresupuestoProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPresupuestoProducto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePresupuestoProducto"));
		
		if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPresupuestoProducto"));
		}
		
		this.jTableDatosPresupuestoProducto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPresupuestoProducto"));
		
		this.jTableDatosPresupuestoProducto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPresupuestoProducto"));
		
		this.jButtonNuevoPresupuestoProducto.addActionListener(new ButtonActionListener(this,"NuevoPresupuestoProducto"));
		
		this.jButtonDuplicarPresupuestoProducto.addActionListener(new ButtonActionListener(this,"DuplicarPresupuestoProducto"));
		
		this.jButtonCopiarPresupuestoProducto.addActionListener(new ButtonActionListener(this,"CopiarPresupuestoProducto"));
		
		this.jButtonVerFormPresupuestoProducto.addActionListener(new ButtonActionListener(this,"VerFormPresupuestoProducto"));
		
		
		this.jButtonNuevoToolBarPresupuestoProducto.addActionListener(new ButtonActionListener(this,"NuevoToolBarPresupuestoProducto"));
			
		this.jButtonDuplicarToolBarPresupuestoProducto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPresupuestoProducto"));
			
		this.jMenuItemNuevoPresupuestoProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPresupuestoProducto"));
			
		this.jMenuItemDuplicarPresupuestoProducto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPresupuestoProducto"));		
		
		
		this.jButtonNuevoRelacionesPresupuestoProducto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPresupuestoProducto"));
		
		
		this.jButtonNuevoRelacionesToolBarPresupuestoProducto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPresupuestoProducto"));
			
		this.jMenuItemNuevoRelacionesPresupuestoProducto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPresupuestoProducto"));		
		
		
		if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoProducto.jButtonModificarPresupuestoProducto.addActionListener(new ButtonActionListener(this,"ModificarPresupuestoProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoProducto.jButtonModificarToolBarPresupuestoProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarPresupuestoProducto"));
			
			this.jInternalFrameDetalleFormPresupuestoProducto.jMenuItemModificarPresupuestoProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarPresupuestoProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPresupuestoProducto.jButtonActualizarPresupuestoProducto.addActionListener (new ButtonActionListener(this,"ActualizarPresupuestoProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoProducto.jButtonActualizarToolBarPresupuestoProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPresupuestoProducto"));
				
			this.jInternalFrameDetalleFormPresupuestoProducto.jMenuItemActualizarPresupuestoProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPresupuestoProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoProducto.jButtonEliminarPresupuestoProducto.addActionListener (new ButtonActionListener(this,"EliminarPresupuestoProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoProducto.jButtonEliminarToolBarPresupuestoProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarPresupuestoProducto"));
						
			this.jInternalFrameDetalleFormPresupuestoProducto.jMenuItemEliminarPresupuestoProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPresupuestoProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoProducto.jButtonCancelarPresupuestoProducto.addActionListener (new ButtonActionListener(this,"CancelarPresupuestoProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoProducto.jButtonCancelarToolBarPresupuestoProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarPresupuestoProducto"));
			
			this.jInternalFrameDetalleFormPresupuestoProducto.jMenuItemCancelarPresupuestoProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPresupuestoProducto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPresupuestoProducto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPresupuestoProducto"));		
		
		
		this.jButtonCerrarPresupuestoProducto.addActionListener (new ButtonActionListener(this,"CerrarPresupuestoProducto"));
		
		
		this.jButtonCerrarToolBarPresupuestoProducto.addActionListener (new ButtonActionListener(this,"CerrarToolBarPresupuestoProducto"));
			
		this.jMenuItemCerrarPresupuestoProducto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPresupuestoProducto"));
			
		if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoProducto.jMenuItemDetalleCerrarPresupuestoProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPresupuestoProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoProducto.jButtonGuardarCambiosPresupuestoProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosPresupuestoProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoProducto.jButtonGuardarCambiosToolBarPresupuestoProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPresupuestoProducto"));
		}
		
		this.jButtonCopiarToolBarPresupuestoProducto.addActionListener (new ButtonActionListener(this,"CopiarToolBarPresupuestoProducto"));
			
		this.jButtonVerFormToolBarPresupuestoProducto.addActionListener (new ButtonActionListener(this,"VerFormToolBarPresupuestoProducto"));
		
		this.jMenuItemGuardarCambiosPresupuestoProducto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPresupuestoProducto"));
			
		this.jMenuItemCopiarPresupuestoProducto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPresupuestoProducto"));		
		
		this.jMenuItemVerFormPresupuestoProducto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPresupuestoProducto"));		
		
		
		this.jButtonGuardarCambiosTablaPresupuestoProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPresupuestoProducto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPresupuestoProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPresupuestoProducto"));
			
		this.jMenuItemGuardarCambiosTablaPresupuestoProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPresupuestoProducto"));		
		
		
		
		this.jButtonRecargarInformacionPresupuestoProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionPresupuestoProducto"));
					
		this.jButtonRecargarInformacionToolBarPresupuestoProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPresupuestoProducto"));
		
		this.jMenuItemRecargarInformacionPresupuestoProducto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPresupuestoProducto"));		
		
		
		
		this.jButtonAnterioresPresupuestoProducto.addActionListener (new ButtonActionListener(this,"AnterioresPresupuestoProducto"));
		
		
		this.jButtonAnterioresToolBarPresupuestoProducto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPresupuestoProducto"));
		
		this.jMenuItemAnterioresPresupuestoProducto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPresupuestoProducto"));		
		
		
		this.jButtonSiguientesPresupuestoProducto.addActionListener (new ButtonActionListener(this,"SiguientesPresupuestoProducto"));
		
		
		this.jButtonSiguientesToolBarPresupuestoProducto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPresupuestoProducto"));
			
		this.jMenuItemSiguientesPresupuestoProducto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPresupuestoProducto"));
			
		this.jMenuItemAbrirOrderByPresupuestoProducto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPresupuestoProducto"));
			
		this.jMenuItemMostrarOcultarPresupuestoProducto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPresupuestoProducto"));
			
		this.jMenuItemDetalleAbrirOrderByPresupuestoProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPresupuestoProducto"));
			
		this.jMenuItemDetalleMostarOcultarPresupuestoProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPresupuestoProducto"));		
		
		
		this.jButtonNuevoGuardarCambiosPresupuestoProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPresupuestoProducto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPresupuestoProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPresupuestoProducto"));
			
		this.jMenuItemNuevoGuardarCambiosPresupuestoProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPresupuestoProducto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPresupuestoProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPresupuestoProducto"));

		this.jCheckBoxSeleccionadosPresupuestoProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPresupuestoProducto"));
		
		if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxTiposAccionesFormularioPresupuestoProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPresupuestoProducto"));
		}
		
		
		this.jComboBoxTiposRelacionesPresupuestoProducto.addActionListener (new ButtonActionListener(this,"TiposRelacionesPresupuestoProducto"));
			
		this.jComboBoxTiposAccionesPresupuestoProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesPresupuestoProducto"));
					
		this.jComboBoxTiposSeleccionarPresupuestoProducto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPresupuestoProducto"));
			
		this.jTextFieldValorCampoGeneralPresupuestoProducto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPresupuestoProducto"));		
		
		
		if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonidPresupuestoProductoBusqueda.addActionListener(new ButtonActionListener(this,"idPresupuestoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_empresaPresupuestoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPresupuestoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_empresaPresupuestoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPresupuestoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_sucursalPresupuestoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPresupuestoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_sucursalPresupuestoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPresupuestoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_ejercicioPresupuestoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPresupuestoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_ejercicioPresupuestoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPresupuestoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_periodoPresupuestoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_periodoPresupuestoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_periodoPresupuestoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoPresupuestoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_cuenta_contablePresupuestoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresupuestoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_cuenta_contablePresupuestoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresupuestoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_bodegaPresupuestoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaPresupuestoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_bodegaPresupuestoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaPresupuestoProductoBusqueda"));
		//jButtonid_productoPresupuestoProducto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoPresupuestoProductoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_productoPresupuestoProducto.addActionListener(new ButtonActionListener(this,"id_productoPresupuestoProducto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_productoPresupuestoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_productoPresupuestoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_productoPresupuestoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_productoPresupuestoProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonvalor_ingresoPresupuestoProductoBusqueda.addActionListener(new ButtonActionListener(this,"valor_ingresoPresupuestoProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonvalor_egresoPresupuestoProductoBusqueda.addActionListener(new ButtonActionListener(this,"valor_egresoPresupuestoProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtoncantidad_ingresoPresupuestoProductoBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_ingresoPresupuestoProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtoncantidad_egresoPresupuestoProductoBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_egresoPresupuestoProductoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdBodegaPresupuestoProducto.addActionListener(new ButtonActionListener(this,"FK_IdBodegaPresupuestoProducto"));

			this.jButtonFK_IdCuentaContablePresupuestoProducto.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContablePresupuestoProducto"));

			this.jButtonFK_IdProductoPresupuestoProducto.addActionListener(new ButtonActionListener(this,"FK_IdProductoPresupuestoProducto"));

			this.jButtonBuscarFK_IdProductoid_productoPresupuestoProducto.addActionListener(new ButtonActionListener(this,"id_productoPresupuestoProducto"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPresupuestoProducto!=null) {
				this.jInternalFrameReporteDinamicoPresupuestoProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPresupuestoProducto"));
				this.jInternalFrameReporteDinamicoPresupuestoProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPresupuestoProducto"));
				this.jInternalFrameReporteDinamicoPresupuestoProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPresupuestoProducto"));
			}
			
			//this.jButtonCerrarReporteDinamicoPresupuestoProducto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPresupuestoProducto"));				
			//this.jButtonGenerarReporteDinamicoPresupuestoProducto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPresupuestoProducto"));
			//this.jButtonGenerarExcelReporteDinamicoPresupuestoProducto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPresupuestoProducto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPresupuestoProducto!=null) {
				this.jInternalFrameImportacionPresupuestoProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPresupuestoProducto"));
				this.jInternalFrameImportacionPresupuestoProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPresupuestoProducto"));
				this.jInternalFrameImportacionPresupuestoProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPresupuestoProducto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPresupuestoProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderByPresupuestoProducto"));
			
			this.jButtonAbrirOrderByToolBarPresupuestoProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPresupuestoProducto"));			
			
			if(this.jInternalFrameOrderByPresupuestoProducto!=null) {
				this.jInternalFrameOrderByPresupuestoProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPresupuestoProducto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoProducto.jTabbedPaneRelacionesPresupuestoProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPresupuestoProducto"));
		
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
            		closingInternalFramePresupuestoProducto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPresupuestoProducto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPresupuestoProducto = (JInternalFrameBase)event.getSource();
	            	
	            PresupuestoProductoBeanSwingJInternalFrame jInternalFrameParent=(PresupuestoProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormPresupuestoProducto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPresupuestoProductoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPresupuestoProducto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPresupuestoProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPresupuestoProducto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPresupuestoProducto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresupuestoProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresupuestoProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresupuestoProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPresupuestoProducto";
		inputMap = this.jButtonNuevoPresupuestoProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPresupuestoProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPresupuestoProductoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresupuestoProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresupuestoProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresupuestoProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPresupuestoProducto";
		inputMap = this.jButtonNuevoRelacionesPresupuestoProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPresupuestoProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPresupuestoProductoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPresupuestoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPresupuestoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPresupuestoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPresupuestoProducto";
		inputMap = this.jButtonModificarPresupuestoProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPresupuestoProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPresupuestoProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPresupuestoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPresupuestoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPresupuestoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPresupuestoProducto";
		inputMap = this.jButtonActualizarPresupuestoProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPresupuestoProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPresupuestoProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPresupuestoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPresupuestoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPresupuestoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPresupuestoProducto";
		inputMap = this.jButtonEliminarPresupuestoProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPresupuestoProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPresupuestoProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPresupuestoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPresupuestoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPresupuestoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPresupuestoProducto";
		inputMap = this.jButtonCancelarPresupuestoProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPresupuestoProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPresupuestoProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPresupuestoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPresupuestoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPresupuestoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPresupuestoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPresupuestoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPresupuestoProducto";
		inputMap = this.jButtonCerrarPresupuestoProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPresupuestoProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPresupuestoProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonGuardarCambiosPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresupuestoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresupuestoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresupuestoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresupuestoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresupuestoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresupuestoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPresupuestoProducto";
		inputMap = this.jInternalFrameDetalleFormPresupuestoProducto.jButtonGuardarCambiosPresupuestoProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonGuardarCambiosPresupuestoProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPresupuestoProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPresupuestoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPresupuestoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPresupuestoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPresupuestoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPresupuestoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPresupuestoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPresupuestoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPresupuestoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPresupuestoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPresupuestoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPresupuestoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPresupuestoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPresupuestoProducto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPresupuestoProductoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPresupuestoProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPresupuestoProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPresupuestoProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPresupuestoProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPresupuestoProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPresupuestoProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonidPresupuestoProductoBusqueda.addActionListener(new ButtonActionListener(this,"idPresupuestoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_empresaPresupuestoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPresupuestoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_empresaPresupuestoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPresupuestoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_sucursalPresupuestoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPresupuestoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_sucursalPresupuestoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPresupuestoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_ejercicioPresupuestoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPresupuestoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_ejercicioPresupuestoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPresupuestoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_periodoPresupuestoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_periodoPresupuestoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_periodoPresupuestoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoPresupuestoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_cuenta_contablePresupuestoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresupuestoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_cuenta_contablePresupuestoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresupuestoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_bodegaPresupuestoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaPresupuestoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_bodegaPresupuestoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaPresupuestoProductoBusqueda"));
		//jButtonid_productoPresupuestoProducto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoPresupuestoProductoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_productoPresupuestoProducto.addActionListener(new ButtonActionListener(this,"id_productoPresupuestoProducto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_productoPresupuestoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_productoPresupuestoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_productoPresupuestoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_productoPresupuestoProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonvalor_ingresoPresupuestoProductoBusqueda.addActionListener(new ButtonActionListener(this,"valor_ingresoPresupuestoProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtonvalor_egresoPresupuestoProductoBusqueda.addActionListener(new ButtonActionListener(this,"valor_egresoPresupuestoProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtoncantidad_ingresoPresupuestoProductoBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_ingresoPresupuestoProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoProducto.jButtoncantidad_egresoPresupuestoProductoBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_egresoPresupuestoProductoBusqueda"));
		
		
		this.jButtonFK_IdBodegaPresupuestoProducto.addActionListener(new ButtonActionListener(this,"FK_IdBodegaPresupuestoProducto"));

		this.jButtonFK_IdCuentaContablePresupuestoProducto.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContablePresupuestoProducto"));

		this.jButtonFK_IdProductoPresupuestoProducto.addActionListener(new ButtonActionListener(this,"FK_IdProductoPresupuestoProducto"));

		this.jButtonBuscarFK_IdProductoid_productoPresupuestoProducto.addActionListener(new ButtonActionListener(this,"id_productoPresupuestoProducto"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPresupuestoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPresupuestoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPresupuestoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPresupuestoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPresupuestoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPresupuestoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPresupuestoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPresupuestoProductoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPresupuestoProducto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPresupuestoProducto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PresupuestoProducto presupuestoproductoAux:this.presupuestoproductoLogic.getPresupuestoProductos()) {
					presupuestoproductoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresupuestoProducto presupuestoproductoAux:presupuestoproductos) {
					presupuestoproductoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPresupuestoProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPresupuestoProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PresupuestoProducto presupuestoproductoAux:this.presupuestoproductoLogic.getPresupuestoProductos()) {
						presupuestoproductoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PresupuestoProducto presupuestoproductoAux:presupuestoproductos) {
						presupuestoproductoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PresupuestoProducto presupuestoproductoAux:this.presupuestoproductoLogic.getPresupuestoProductos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PresupuestoProducto presupuestoproductoAux:presupuestoproductos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPresupuestoProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPresupuestoProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPresupuestoProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPresupuestoProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPresupuestoProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPresupuestoProducto.getSelectedRows();
			
			PresupuestoProducto presupuestoproductoLocal=new PresupuestoProducto();
			
			//this.seleccionarTodosPresupuestoProducto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presupuestoproductoLocal =(PresupuestoProducto) this.presupuestoproductoLogic.getPresupuestoProductos().toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					presupuestoproductoLocal =(PresupuestoProducto) this.presupuestoproductos.toArray()[this.jTableDatosPresupuestoProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				presupuestoproductoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PresupuestoProducto presupuestoproductoAux:this.presupuestoproductoLogic.getPresupuestoProductos()) {
						presupuestoproductoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PresupuestoProducto presupuestoproductoAux:presupuestoproductos) {
						presupuestoproductoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPresupuestoProducto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPresupuestoProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPresupuestoProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPresupuestoProductoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPresupuestoProductoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPresupuestoProductoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPresupuestoProducto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPresupuestoProducto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PresupuestoProducto presupuestoproductoAux:this.presupuestoproductoLogic.getPresupuestoProductos()) {
				
						if(sTipoSeleccionar.equals(PresupuestoProductoConstantesFunciones.LABEL_VALORINGRESO)) {
							existe=true;
							presupuestoproductoAux.setvalor_ingreso(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestoProductoConstantesFunciones.LABEL_VALOREGRESO)) {
							existe=true;
							presupuestoproductoAux.setvalor_egreso(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestoProductoConstantesFunciones.LABEL_CANTIDADINGRESO)) {
							existe=true;
							presupuestoproductoAux.setcantidad_ingreso(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestoProductoConstantesFunciones.LABEL_CANTIDADEGRESO)) {
							existe=true;
							presupuestoproductoAux.setcantidad_egreso(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresupuestoProducto presupuestoproductoAux:presupuestoproductos) {
					
						if(sTipoSeleccionar.equals(PresupuestoProductoConstantesFunciones.LABEL_VALORINGRESO)) {
							existe=true;
							presupuestoproductoAux.setvalor_ingreso(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestoProductoConstantesFunciones.LABEL_VALOREGRESO)) {
							existe=true;
							presupuestoproductoAux.setvalor_egreso(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestoProductoConstantesFunciones.LABEL_CANTIDADINGRESO)) {
							existe=true;
							presupuestoproductoAux.setcantidad_ingreso(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestoProductoConstantesFunciones.LABEL_CANTIDADEGRESO)) {
							existe=true;
							presupuestoproductoAux.setcantidad_egreso(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPresupuestoProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPresupuestoProductoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPresupuestoProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPresupuestoProducto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPresupuestoProducto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxTiposAccionesFormularioPresupuestoProducto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePresupuestoProducto) {				
					conSplash=true;//false;										
					
					//this.startProcessPresupuestoProducto(conSplash);
				
					this.generarReportePresupuestoProductosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresupuestoProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxTiposAccionesFormularioPresupuestoProducto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPresupuestoProductosSeleccionados();
				//this.jComboBoxTiposAccionesPresupuestoProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPresupuestoProductosSeleccionados(false);
				//this.jComboBoxTiposAccionesPresupuestoProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPresupuestoProductosSeleccionados(true);
				//this.jComboBoxTiposAccionesPresupuestoProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPresupuestoProducto();
				
				this.exportarPresupuestoProductosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresupuestoProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxTiposAccionesFormularioPresupuestoProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPresupuestoProductos();
				//this.importarPresupuestoProductos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresupuestoProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxTiposAccionesFormularioPresupuestoProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPresupuestoProducto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPresupuestoProductosSeleccionados();
				//this.jComboBoxTiposAccionesPresupuestoProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Presupuesto Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPresupuestoProducto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPresupuestoProducto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPresupuestoProducto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Presupuesto Producto",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresupuestoProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxTiposAccionesFormularioPresupuestoProducto.setSelectedIndex(0);					
				}	
			} 			
			else if(PresupuestoProductoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePresupuestoProducto) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPresupuestoProducto(conSplash);
					
						//this.actualizarParametrosGeneralPresupuestoProducto();
						
						this.generarReporteProcesoAccionPresupuestoProductosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPresupuestoProducto.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxTiposAccionesFormularioPresupuestoProducto.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PresupuestoProductoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Presupuesto ProductoS SELECCIONADOS?", "MANTENIMIENTO DE Presupuesto Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPresupuestoProducto();
				
						this.actualizarParametrosGeneralPresupuestoProducto();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.presupuestoproductoReturnGeneral=presupuestoproductoLogic.procesarAccionPresupuestoProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.presupuestoproductoLogic.getPresupuestoProductos(),this.presupuestoproductoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPresupuestoProductoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPresupuestoProducto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxTiposAccionesFormularioPresupuestoProducto.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPresupuestoProducto();
					
					PresupuestoProductoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPresupuestoProductoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPresupuestoProducto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxTiposAccionesFormularioPresupuestoProducto.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPresupuestoProducto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPresupuestoProductoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPresupuestoProducto();
			
			if(this.jInternalFrameDetalleFormPresupuestoProducto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PresupuestoProducto> presupuestoproductosSeleccionados=new ArrayList<PresupuestoProducto>();		
			PresupuestoProducto presupuestoproducto=new PresupuestoProducto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPresupuestoProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPresupuestoProducto.getSelectedItem();
			
			
			
			
			presupuestoproductosSeleccionados=this.getPresupuestoProductosSeleccionados(true);
			//this.sTipoAccion;
			
			if(presupuestoproductosSeleccionados.size()==1) {
				for(PresupuestoProducto presupuestoproductoAux:presupuestoproductosSeleccionados) {
					presupuestoproducto=presupuestoproductoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPresupuestoProducto();
			
      		//this.finishProcessPresupuestoProducto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPresupuestoProductoReturnGeneral() throws Exception {
		if(this.presupuestoproductoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.presupuestoproductoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.presupuestoproductoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.presupuestoproductoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.presupuestoproductoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.presupuestoproductoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPresupuestoProducto(false);
		}
		
		if(this.presupuestoproductoReturnGeneral.getConRetornoLista() || this.presupuestoproductoReturnGeneral.getConRetornoObjeto()) {
			if(this.presupuestoproductoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.presupuestoproductoLogic.setPresupuestoProductos(this.presupuestoproductoReturnGeneral.getPresupuestoProductos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.presupuestoproductoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.presupuestoproductoLogic.setPresupuestoProducto(this.presupuestoproductoReturnGeneral.getPresupuestoProducto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingPresupuestoProducto(false);
		}
	}
	
	public void actualizarParametrosGeneralPresupuestoProducto() throws Exception {
		
		
	}
	
	public ArrayList<PresupuestoProducto> getPresupuestoProductosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PresupuestoProducto> presupuestoproductosSeleccionados=new ArrayList<PresupuestoProducto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPresupuestoProducto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PresupuestoProducto presupuestoproductoAux:presupuestoproductoLogic.getPresupuestoProductos()) {
					if(presupuestoproductoAux.getIsSelected()) {
						presupuestoproductosSeleccionados.add(presupuestoproductoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresupuestoProducto presupuestoproductoAux:this.presupuestoproductos) {
					if(presupuestoproductoAux.getIsSelected()) {
						presupuestoproductosSeleccionados.add(presupuestoproductoAux);				
					}
				}
			}
			
			if(presupuestoproductosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						presupuestoproductosSeleccionados.addAll(this.presupuestoproductoLogic.getPresupuestoProductos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						presupuestoproductosSeleccionados.addAll(this.presupuestoproductos);				
					}
				}
			}
		} else {
			presupuestoproductosSeleccionados.add(this.presupuestoproducto);
		}
		
		return presupuestoproductosSeleccionados;
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
	
	public void generarReportePresupuestoProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPresupuestoProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPresupuestoProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPresupuestoProductosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPresupuestoProductosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Presupuesto Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPresupuestoProductosSeleccionados() throws Exception {
		ArrayList<PresupuestoProducto> presupuestoproductosSeleccionados=new ArrayList<PresupuestoProducto>();		
		
		presupuestoproductosSeleccionados=this.getPresupuestoProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePresupuestoProductos("Todos",presupuestoproductosSeleccionados);
		
	}	
	
	public void generarReporteNormalPresupuestoProductosSeleccionados() throws Exception {
		ArrayList<PresupuestoProducto> presupuestoproductosSeleccionados=new ArrayList<PresupuestoProducto>();		
		
		presupuestoproductosSeleccionados=this.getPresupuestoProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePresupuestoProductos("Todos",presupuestoproductosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPresupuestoProductosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PresupuestoProducto> presupuestoproductosSeleccionados=new ArrayList<PresupuestoProducto>();
		
		presupuestoproductosSeleccionados=this.getPresupuestoProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePresupuestoProductos("Todos",presupuestoproductosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPresupuestoProductosSeleccionados() throws Exception {
		ArrayList<PresupuestoProducto> presupuestoproductosSeleccionados=new ArrayList<PresupuestoProducto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPresupuestoProducto();
		
		
		presupuestoproductosSeleccionados=this.getPresupuestoProductosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPresupuestoProducto();
		
		
		//this.generarReportePresupuestoProductos("Todos",presupuestoproductosSeleccionados ,presupuestoproductoImplementable,presupuestoproductoImplementableHome);
	}
	
	public void mostrarImportacionPresupuestoProductos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPresupuestoProducto();
		
		this.abrirFrameImportacionPresupuestoProducto();		
		
			
		//this.generarReportePresupuestoProductos("Todos",presupuestoproductosSeleccionados ,presupuestoproductoImplementable,presupuestoproductoImplementableHome);
	}
	
	public void importarPresupuestoProductos() throws Exception {		
	
	}
	
	public void exportarPresupuestoProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPresupuestoProductosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPresupuestoProductosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPresupuestoProductosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Presupuesto Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPresupuestoProductosSeleccionados() throws Exception {
		ArrayList<PresupuestoProducto> presupuestoproductosSeleccionados=new ArrayList<PresupuestoProducto>();		
		
		presupuestoproductosSeleccionados=this.getPresupuestoProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestoproducto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPresupuestoProducto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PresupuestoProducto presupuestoproductoAux:presupuestoproductosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPresupuestoProducto(presupuestoproductoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//presupuestoproductoAux.setsDetalleGeneralEntityReporte(presupuestoproductoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuesto Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPresupuestoProducto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PresupuestoProductoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoProductoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoProductoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoProductoConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoProductoConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoProductoConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoProductoConstantesFunciones.LABEL_IDCUENTACONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoProductoConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoProductoConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoProductoConstantesFunciones.LABEL_VALORINGRESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoProductoConstantesFunciones.LABEL_VALOREGRESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoProductoConstantesFunciones.LABEL_CANTIDADINGRESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoProductoConstantesFunciones.LABEL_CANTIDADEGRESO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPresupuestoProducto(PresupuestoProducto presupuestoproducto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=presupuestoproducto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoproducto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoproducto.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoproducto.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoproducto.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoproducto.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoproducto.getcuentacontable_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoproducto.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoproducto.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoproducto.getvalor_ingreso().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoproducto.getvalor_egreso().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoproducto.getcantidad_ingreso().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoproducto.getcantidad_egreso().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPresupuestoProductosSeleccionados() throws Exception {
		ArrayList<PresupuestoProducto> presupuestoproductosSeleccionados=new ArrayList<PresupuestoProducto>();		
		
		presupuestoproductosSeleccionados=this.getPresupuestoProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestoproducto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PresupuestoProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPresupuestoProducto(row);				
				iRow++;
			}				
			
			for(PresupuestoProducto presupuestoproductoAux:presupuestoproductosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPresupuestoProducto(presupuestoproductoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuesto Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPresupuestoProductosSeleccionados() throws Exception {
		ArrayList<PresupuestoProducto> presupuestoproductosSeleccionados=new ArrayList<PresupuestoProducto>();		
		
		presupuestoproductosSeleccionados=this.getPresupuestoProductosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestoproducto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("presupuestoproductos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("presupuestoproducto");
			//elementRoot.appendChild(element);
		
			for(PresupuestoProducto presupuestoproductoAux:presupuestoproductosSeleccionados) {
				element = document.createElement("presupuestoproducto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPresupuestoProducto(presupuestoproductoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuesto Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPresupuestoProducto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoProductoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoProductoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoProductoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoProductoConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoProductoConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoProductoConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoProductoConstantesFunciones.LABEL_IDCUENTACONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoProductoConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoProductoConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoProductoConstantesFunciones.LABEL_VALORINGRESO);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoProductoConstantesFunciones.LABEL_VALOREGRESO);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoProductoConstantesFunciones.LABEL_CANTIDADINGRESO);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoProductoConstantesFunciones.LABEL_CANTIDADEGRESO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPresupuestoProducto(PresupuestoProducto presupuestoproducto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoproducto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoproducto.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoproducto.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoproducto.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoproducto.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoproducto.getcuentacontable_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoproducto.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoproducto.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoproducto.getvalor_ingreso());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoproducto.getvalor_egreso());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoproducto.getcantidad_ingreso());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoproducto.getcantidad_egreso());				
	}
	
	public void setFilaDatosExportarXmlPresupuestoProducto(PresupuestoProducto presupuestoproducto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PresupuestoProductoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(presupuestoproducto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PresupuestoProductoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(presupuestoproducto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(PresupuestoProductoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(presupuestoproducto.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(PresupuestoProductoConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(presupuestoproducto.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(PresupuestoProductoConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(presupuestoproducto.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(PresupuestoProductoConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(presupuestoproducto.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementcuentacontable_descripcion = document.createElement(PresupuestoProductoConstantesFunciones.IDCUENTACONTABLE);
		elementcuentacontable_descripcion.appendChild(document.createTextNode(presupuestoproducto.getcuentacontable_descripcion()));
		element.appendChild(elementcuentacontable_descripcion);

		Element elementbodega_descripcion = document.createElement(PresupuestoProductoConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(presupuestoproducto.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementproducto_descripcion = document.createElement(PresupuestoProductoConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(presupuestoproducto.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementvalor_ingreso = document.createElement(PresupuestoProductoConstantesFunciones.VALORINGRESO);
		elementvalor_ingreso.appendChild(document.createTextNode(presupuestoproducto.getvalor_ingreso().toString().trim()));
		element.appendChild(elementvalor_ingreso);

		Element elementvalor_egreso = document.createElement(PresupuestoProductoConstantesFunciones.VALOREGRESO);
		elementvalor_egreso.appendChild(document.createTextNode(presupuestoproducto.getvalor_egreso().toString().trim()));
		element.appendChild(elementvalor_egreso);

		Element elementcantidad_ingreso = document.createElement(PresupuestoProductoConstantesFunciones.CANTIDADINGRESO);
		elementcantidad_ingreso.appendChild(document.createTextNode(presupuestoproducto.getcantidad_ingreso().toString().trim()));
		element.appendChild(elementcantidad_ingreso);

		Element elementcantidad_egreso = document.createElement(PresupuestoProductoConstantesFunciones.CANTIDADEGRESO);
		elementcantidad_egreso.appendChild(document.createTextNode(presupuestoproducto.getcantidad_egreso().toString().trim()));
		element.appendChild(elementcantidad_egreso);
	}
	
	public void generarReporteGroupGenericoPresupuestoProductosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PresupuestoProducto> presupuestoproductosSeleccionados=new ArrayList<PresupuestoProducto>();
		
		presupuestoproductosSeleccionados=this.getPresupuestoProductosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPresupuestoProducto(presupuestoproductosSeleccionados);
		
		this.generarReportePresupuestoProductos("Todos",presupuestoproductosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPresupuestoProducto(ArrayList<PresupuestoProducto> presupuestoproductosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PresupuestoProducto presupuestoproductoAux:presupuestoproductosSeleccionados) {
				presupuestoproductoAux.setsDetalleGeneralEntityReporte(presupuestoproductoAux.toString());
			
				if(sTipoSeleccionar.equals(PresupuestoProductoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					presupuestoproductoAux.setsDescripcionGeneralEntityReporte1(presupuestoproductoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresupuestoProductoConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					presupuestoproductoAux.setsDescripcionGeneralEntityReporte1(presupuestoproductoAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresupuestoProductoConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					presupuestoproductoAux.setsDescripcionGeneralEntityReporte1(presupuestoproductoAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresupuestoProductoConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					presupuestoproductoAux.setsDescripcionGeneralEntityReporte1(presupuestoproductoAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresupuestoProductoConstantesFunciones.LABEL_IDCUENTACONTABLE)) {
					existe=true;
					presupuestoproductoAux.setsDescripcionGeneralEntityReporte1(presupuestoproductoAux.getcuentacontable_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresupuestoProductoConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					presupuestoproductoAux.setsDescripcionGeneralEntityReporte1(presupuestoproductoAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresupuestoProductoConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					presupuestoproductoAux.setsDescripcionGeneralEntityReporte1(presupuestoproductoAux.getproducto_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPresupuestoProducto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPresupuestoProducto=true;
				this.isVisibilidadCeldaNuevoRelacionesPresupuestoProducto=true;
				this.isVisibilidadCeldaGuardarCambiosPresupuestoProducto=true;
			}
			
			this.isVisibilidadCeldaModificarPresupuestoProducto=false;
			this.isVisibilidadCeldaActualizarPresupuestoProducto=false;
			this.isVisibilidadCeldaEliminarPresupuestoProducto=false;
			this.isVisibilidadCeldaCancelarPresupuestoProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestoProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestoProducto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPresupuestoProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoProducto=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoProducto=false;
			this.isVisibilidadCeldaModificarPresupuestoProducto=false;
			this.isVisibilidadCeldaActualizarPresupuestoProducto=true;
			this.isVisibilidadCeldaEliminarPresupuestoProducto=false;
			this.isVisibilidadCeldaCancelarPresupuestoProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestoProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestoProducto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPresupuestoProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoProducto=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoProducto=false;
			this.isVisibilidadCeldaModificarPresupuestoProducto=false;
			this.isVisibilidadCeldaActualizarPresupuestoProducto=true;
			this.isVisibilidadCeldaEliminarPresupuestoProducto=true;
			this.isVisibilidadCeldaCancelarPresupuestoProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestoProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestoProducto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPresupuestoProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoProducto=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoProducto=false;
			this.isVisibilidadCeldaModificarPresupuestoProducto=false;
			this.isVisibilidadCeldaActualizarPresupuestoProducto=true;
			this.isVisibilidadCeldaEliminarPresupuestoProducto=false;
			this.isVisibilidadCeldaCancelarPresupuestoProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestoProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestoProducto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPresupuestoProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoProducto=true;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoProducto=true;
			this.isVisibilidadCeldaModificarPresupuestoProducto=false;
			this.isVisibilidadCeldaActualizarPresupuestoProducto=false;
			this.isVisibilidadCeldaEliminarPresupuestoProducto=false;
			this.isVisibilidadCeldaCancelarPresupuestoProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestoProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestoProducto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPresupuestoProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoProducto=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoProducto=false;
			this.isVisibilidadCeldaActualizarPresupuestoProducto=false;
			this.isVisibilidadCeldaEliminarPresupuestoProducto=false;
			this.isVisibilidadCeldaCancelarPresupuestoProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestoProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestoProducto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPresupuestoProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoProducto=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoProducto=false;
			this.isVisibilidadCeldaModificarPresupuestoProducto=true;
			this.isVisibilidadCeldaActualizarPresupuestoProducto=false;
			this.isVisibilidadCeldaEliminarPresupuestoProducto=false;
			this.isVisibilidadCeldaCancelarPresupuestoProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestoProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestoProducto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PresupuestoProductoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPresupuestoProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoProducto=true;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoProducto=true;
		} else {
			this.actualizarEstadoPanelsPresupuestoProducto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPresupuestoProducto=false;
			//this.isVisibilidadCeldaVerFormPresupuestoProducto=false;
			this.isVisibilidadCeldaDuplicarPresupuestoProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!presupuestoproductoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoProducto=false;
		} else {
			this.isVisibilidadCeldaNuevoPresupuestoProducto=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(presupuestoproductoSessionBean.getEsGuardarRelacionado()) {
			if(!presupuestoproductoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPresupuestoProducto=false;												
			}
			
			this.jButtonCerrarPresupuestoProducto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoProducto=false;
		}
		
		if(!this.permiteMantenimiento(this.presupuestoproducto)) {
			this.isVisibilidadCeldaActualizarPresupuestoProducto=false;
			this.isVisibilidadCeldaEliminarPresupuestoProducto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPresupuestoProducto() {
	}
	
	public void actualizarEstadoPanelsPresupuestoProducto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPresupuestoProducto!=null) {
				this.jScrollPanelDatosEdicionPresupuestoProducto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestoProducto!=null) {
				this.jTabbedPaneBusquedasPresupuestoProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresupuestoProducto!=null) {
				this.jScrollPanelDatosPresupuestoProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresupuestoProducto!=null) {
				this.jPanelPaginacionPresupuestoProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresupuestoProducto!=null) {
				this.jPanelParametrosReportesPresupuestoProducto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPresupuestoProducto!=null) {
				this.jScrollPanelDatosEdicionPresupuestoProducto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestoProducto!=null) {
				this.jTabbedPaneBusquedasPresupuestoProducto.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPresupuestoProducto!=null) {
				this.jScrollPanelDatosPresupuestoProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionPresupuestoProducto!=null) {
				this.jPanelPaginacionPresupuestoProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPresupuestoProducto!=null) {
				this.jPanelParametrosReportesPresupuestoProducto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPresupuestoProducto!=null) {
				this.jScrollPanelDatosEdicionPresupuestoProducto.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestoProducto!=null) {
				this.jTabbedPaneBusquedasPresupuestoProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPresupuestoProducto!=null) {
				this.jScrollPanelDatosPresupuestoProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionPresupuestoProducto!=null) {
				this.jPanelPaginacionPresupuestoProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPresupuestoProducto!=null) {
				this.jPanelParametrosReportesPresupuestoProducto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPresupuestoProducto!=null) {
				this.jScrollPanelDatosEdicionPresupuestoProducto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestoProducto!=null) {
				this.jTabbedPaneBusquedasPresupuestoProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPresupuestoProducto!=null) {
				this.jScrollPanelDatosPresupuestoProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionPresupuestoProducto!=null) {
				this.jPanelPaginacionPresupuestoProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPresupuestoProducto!=null) {
				this.jPanelParametrosReportesPresupuestoProducto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPresupuestoProducto!=null) {
				this.jScrollPanelDatosEdicionPresupuestoProducto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestoProducto!=null) {
				this.jTabbedPaneBusquedasPresupuestoProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresupuestoProducto!=null) {
				this.jScrollPanelDatosPresupuestoProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresupuestoProducto!=null) {
				this.jPanelPaginacionPresupuestoProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresupuestoProducto!=null) {
				this.jPanelParametrosReportesPresupuestoProducto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPresupuestoProducto!=null) {
				this.jScrollPanelDatosEdicionPresupuestoProducto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestoProducto!=null) {
				this.jTabbedPaneBusquedasPresupuestoProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresupuestoProducto!=null) {
				this.jScrollPanelDatosPresupuestoProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresupuestoProducto!=null) {
				this.jPanelPaginacionPresupuestoProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresupuestoProducto!=null) {
				this.jPanelParametrosReportesPresupuestoProducto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPresupuestoProducto!=null) {
				this.jScrollPanelDatosEdicionPresupuestoProducto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestoProducto!=null) {
				this.jTabbedPaneBusquedasPresupuestoProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresupuestoProducto!=null) {
				this.jScrollPanelDatosPresupuestoProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresupuestoProducto!=null) {
				this.jPanelPaginacionPresupuestoProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresupuestoProducto!=null) {
				this.jPanelParametrosReportesPresupuestoProducto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPresupuestoProducto!=null) {
					this.jTabbedPaneBusquedasPresupuestoProducto.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPresupuestoProducto!=null) {
				this.jPanelParametrosReportesPresupuestoProducto.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestoProducto!=null) {
				this.jTabbedPaneBusquedasPresupuestoProducto.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPresupuestoProducto!=null) {
				this.jPanelParametrosReportesPresupuestoProducto.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdBodega=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasPresupuestoProducto.remove(jPanelFK_IdBodegaPresupuestoProducto);}

			this.isVisibilidadFK_IdCuentaContable=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasPresupuestoProducto.remove(jPanelFK_IdCuentaContablePresupuestoProducto);}

			this.isVisibilidadFK_IdProducto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPresupuestoProducto.remove(jPanelFK_IdProductoPresupuestoProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdBodega=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasPresupuestoProducto.remove(jPanelFK_IdBodegaPresupuestoProducto);}

			this.isVisibilidadFK_IdCuentaContable=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasPresupuestoProducto.remove(jPanelFK_IdCuentaContablePresupuestoProducto);}

			this.isVisibilidadFK_IdProducto=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPresupuestoProducto.remove(jPanelFK_IdProductoPresupuestoProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadFK_IdBodega=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasPresupuestoProducto.remove(jPanelFK_IdBodegaPresupuestoProducto);}

			this.isVisibilidadFK_IdCuentaContable=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasPresupuestoProducto.remove(jPanelFK_IdCuentaContablePresupuestoProducto);}

			this.isVisibilidadFK_IdProducto=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPresupuestoProducto.remove(jPanelFK_IdProductoPresupuestoProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadFK_IdBodega=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasPresupuestoProducto.remove(jPanelFK_IdBodegaPresupuestoProducto);}

			this.isVisibilidadFK_IdCuentaContable=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasPresupuestoProducto.remove(jPanelFK_IdCuentaContablePresupuestoProducto);}

			this.isVisibilidadFK_IdProducto=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPresupuestoProducto.remove(jPanelFK_IdProductoPresupuestoProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContable(Boolean isParaCuentaContable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableNegation=!isParaCuentaContable;

			this.isVisibilidadFK_IdBodega=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasPresupuestoProducto.remove(jPanelFK_IdBodegaPresupuestoProducto);}

			this.isVisibilidadFK_IdCuentaContable=isParaCuentaContable;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasPresupuestoProducto.remove(jPanelFK_IdCuentaContablePresupuestoProducto);}

			this.isVisibilidadFK_IdProducto=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPresupuestoProducto.remove(jPanelFK_IdProductoPresupuestoProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadFK_IdBodega=isParaBodega;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasPresupuestoProducto.remove(jPanelFK_IdBodegaPresupuestoProducto);}

			this.isVisibilidadFK_IdCuentaContable=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasPresupuestoProducto.remove(jPanelFK_IdCuentaContablePresupuestoProducto);}

			this.isVisibilidadFK_IdProducto=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPresupuestoProducto.remove(jPanelFK_IdProductoPresupuestoProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadFK_IdBodega=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasPresupuestoProducto.remove(jPanelFK_IdBodegaPresupuestoProducto);}

			this.isVisibilidadFK_IdCuentaContable=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasPresupuestoProducto.remove(jPanelFK_IdCuentaContablePresupuestoProducto);}

			this.isVisibilidadFK_IdProducto=isParaProducto;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPresupuestoProducto.remove(jPanelFK_IdProductoPresupuestoProducto);}
		}
		
	}
	
	
	
	

	public String registrarSesionPresupuestoProductoParaBusquedaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(presupuestoproductoSessionBean==null) {
				presupuestoproductoSessionBean=new PresupuestoProductoSessionBean();
			}

			if(productoSessionBean==null) {
				productoSessionBean=new ProductoSessionBean();
			}

			productoSessionBean.setsPathNavegacionActual(presupuestoproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			productoSessionBean.setisPermiteRecargarInformacion(false);
			productoSessionBean.setisPaginaPopup(true);
			isPaginaPopupProducto=productoSessionBean.getisPaginaPopup();
			productoSessionBean.setisPaginaPopup(false);
			productoSessionBean.setEstaModoBusqueda(true);
			productoSessionBean.setsFuncionBusquedaRapida("window.opener.presupuestoproductoFuncionGeneral.setCombosCodigoDesdeBusquedaid_producto(TO_REPLACE);");
			productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(PresupuestoProductoConstantesFunciones.SNOMBREOPCION);
			//productoSessionBean.setisBusquedaDesdeForeignKeySesionPresupuestoProducto(true);
			//productoSessionBean.setlidPresupuestoProductoActual(this.idPresupuestoProductoActual);

			presupuestoproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPresupuestoProducto(true);
			presupuestoproductoSessionBean.setlIdPresupuestoProductoActualForeignKey(this.idPresupuestoProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PresupuestoProductoSessionBean presupuestoproductoSessionBean=new PresupuestoProductoSessionBean();
		
		if(this.presupuestoproductoSessionBean==null) {
			this.presupuestoproductoSessionBean=new PresupuestoProductoSessionBean();
		}
		
		this.presupuestoproductoSessionBean.setsUltimaBusquedaPresupuestoProducto(this.getsAccionBusqueda());
		this.presupuestoproductoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.presupuestoproductoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
			presupuestoproductoSessionBean.setid_bodega(this.getid_bodegaFK_IdBodega());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
			presupuestoproductoSessionBean.setid_cuenta_contable(this.getid_cuenta_contableFK_IdCuentaContable());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
			presupuestoproductoSessionBean.setid_ejercicio(this.getid_ejercicioFK_IdEjercicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			presupuestoproductoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
			presupuestoproductoSessionBean.setid_periodo(this.getid_periodoFK_IdPeriodo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
			presupuestoproductoSessionBean.setid_producto(this.getid_productoFK_IdProducto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			presupuestoproductoSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PresupuestoProductoSessionBean presupuestoproductoSessionBean=new PresupuestoProductoSessionBean();
		
		if(this.presupuestoproductoSessionBean==null) {
			this.presupuestoproductoSessionBean=new PresupuestoProductoSessionBean();
		}
		
		if(this.presupuestoproductoSessionBean.getsUltimaBusquedaPresupuestoProducto()!=null&&!this.presupuestoproductoSessionBean.getsUltimaBusquedaPresupuestoProducto().equals("")) {
			this.setsAccionBusqueda(presupuestoproductoSessionBean.getsUltimaBusquedaPresupuestoProducto());
			this.setiNumeroPaginacion(presupuestoproductoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(presupuestoproductoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
				this.setid_bodegaFK_IdBodega(presupuestoproductoSessionBean.getid_bodega());
				presupuestoproductoSessionBean.setid_bodega(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
				this.setid_cuenta_contableFK_IdCuentaContable(presupuestoproductoSessionBean.getid_cuenta_contable());
				presupuestoproductoSessionBean.setid_cuenta_contable(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
				this.setid_ejercicioFK_IdEjercicio(presupuestoproductoSessionBean.getid_ejercicio());
				presupuestoproductoSessionBean.setid_ejercicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(presupuestoproductoSessionBean.getid_empresa());
				presupuestoproductoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
				this.setid_periodoFK_IdPeriodo(presupuestoproductoSessionBean.getid_periodo());
				presupuestoproductoSessionBean.setid_periodo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
				this.setid_productoFK_IdProducto(presupuestoproductoSessionBean.getid_producto());
				presupuestoproductoSessionBean.setid_producto(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(presupuestoproductoSessionBean.getid_sucursal());
				presupuestoproductoSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.presupuestoproductoSessionBean.setsUltimaBusquedaPresupuestoProducto("");
		this.presupuestoproductoSessionBean.setiNumeroPaginacion(PresupuestoProductoConstantesFunciones.INUMEROPAGINACION);
		this.presupuestoproductoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPresupuestoProducto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPresupuestoProducto() {
		this.updateBorderResaltarBusquedasFormularioPresupuestoProducto();
		this.updateVisibilidadBusquedasFormularioPresupuestoProducto();
		this.updateHabilitarBusquedasFormularioPresupuestoProducto();
	}
	
	public void updateBorderResaltarBusquedasFormularioPresupuestoProducto() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPresupuestoProducto.getComponents().length>0) {
	

		if(this.presupuestoproductoConstantesFunciones.resaltarFK_IdBodegaPresupuestoProducto!=null) {
			index= this.jTabbedPaneBusquedasPresupuestoProducto.indexOfComponent(this.jPanelFK_IdBodegaPresupuestoProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoProducto.getComponent(index);
				jPanel.setBorder(this.presupuestoproductoConstantesFunciones.resaltarFK_IdBodegaPresupuestoProducto);
			}
		}

		if(this.presupuestoproductoConstantesFunciones.resaltarFK_IdCuentaContablePresupuestoProducto!=null) {
			index= this.jTabbedPaneBusquedasPresupuestoProducto.indexOfComponent(this.jPanelFK_IdCuentaContablePresupuestoProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoProducto.getComponent(index);
				jPanel.setBorder(this.presupuestoproductoConstantesFunciones.resaltarFK_IdCuentaContablePresupuestoProducto);
			}
		}

		if(this.presupuestoproductoConstantesFunciones.resaltarFK_IdProductoPresupuestoProducto!=null) {
			index= this.jTabbedPaneBusquedasPresupuestoProducto.indexOfComponent(this.jPanelFK_IdProductoPresupuestoProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoProducto.getComponent(index);
				jPanel.setBorder(this.presupuestoproductoConstantesFunciones.resaltarFK_IdProductoPresupuestoProducto);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPresupuestoProducto() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPresupuestoProducto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPresupuestoProducto.indexOfComponent(this.jPanelFK_IdBodegaPresupuestoProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.presupuestoproductoConstantesFunciones.mostrarFK_IdBodegaPresupuestoProducto);
			if(!this.presupuestoproductoConstantesFunciones.mostrarFK_IdBodegaPresupuestoProducto && index>-1) {
				this.jTabbedPaneBusquedasPresupuestoProducto.remove(index);
			}

			index= this.jTabbedPaneBusquedasPresupuestoProducto.indexOfComponent(this.jPanelFK_IdCuentaContablePresupuestoProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.presupuestoproductoConstantesFunciones.mostrarFK_IdCuentaContablePresupuestoProducto);
			if(!this.presupuestoproductoConstantesFunciones.mostrarFK_IdCuentaContablePresupuestoProducto && index>-1) {
				this.jTabbedPaneBusquedasPresupuestoProducto.remove(index);
			}

			index= this.jTabbedPaneBusquedasPresupuestoProducto.indexOfComponent(this.jPanelFK_IdProductoPresupuestoProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.presupuestoproductoConstantesFunciones.mostrarFK_IdProductoPresupuestoProducto);
			if(!this.presupuestoproductoConstantesFunciones.mostrarFK_IdProductoPresupuestoProducto && index>-1) {
				this.jTabbedPaneBusquedasPresupuestoProducto.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPresupuestoProducto() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPresupuestoProducto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPresupuestoProducto.indexOfComponent(this.jPanelFK_IdBodegaPresupuestoProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.presupuestoproductoConstantesFunciones.activarFK_IdBodegaPresupuestoProducto);
				this.jTabbedPaneBusquedasPresupuestoProducto.setEnabledAt(index,this.presupuestoproductoConstantesFunciones.activarFK_IdBodegaPresupuestoProducto);
			}

			index= this.jTabbedPaneBusquedasPresupuestoProducto.indexOfComponent(this.jPanelFK_IdCuentaContablePresupuestoProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.presupuestoproductoConstantesFunciones.activarFK_IdCuentaContablePresupuestoProducto);
				this.jTabbedPaneBusquedasPresupuestoProducto.setEnabledAt(index,this.presupuestoproductoConstantesFunciones.activarFK_IdCuentaContablePresupuestoProducto);
			}

			index= this.jTabbedPaneBusquedasPresupuestoProducto.indexOfComponent(this.jPanelFK_IdProductoPresupuestoProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.presupuestoproductoConstantesFunciones.activarFK_IdProductoPresupuestoProducto);
				this.jTabbedPaneBusquedasPresupuestoProducto.setEnabledAt(index,this.presupuestoproductoConstantesFunciones.activarFK_IdProductoPresupuestoProducto);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPresupuestoProducto(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdBodega")) {
			index= this.jTabbedPaneBusquedasPresupuestoProducto.indexOfComponent(this.jPanelFK_IdBodegaPresupuestoProducto);

			this.jTabbedPaneBusquedasPresupuestoProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoProducto.getComponent(index);

			this.presupuestoproductoConstantesFunciones.setResaltarFK_IdBodegaPresupuestoProducto(resaltar);

			jPanel.setBorder(this.presupuestoproductoConstantesFunciones.resaltarFK_IdBodegaPresupuestoProducto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCuentaContable")) {
			index= this.jTabbedPaneBusquedasPresupuestoProducto.indexOfComponent(this.jPanelFK_IdCuentaContablePresupuestoProducto);

			this.jTabbedPaneBusquedasPresupuestoProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoProducto.getComponent(index);

			this.presupuestoproductoConstantesFunciones.setResaltarFK_IdCuentaContablePresupuestoProducto(resaltar);

			jPanel.setBorder(this.presupuestoproductoConstantesFunciones.resaltarFK_IdCuentaContablePresupuestoProducto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdProducto")) {
			index= this.jTabbedPaneBusquedasPresupuestoProducto.indexOfComponent(this.jPanelFK_IdProductoPresupuestoProducto);

			this.jTabbedPaneBusquedasPresupuestoProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoProducto.getComponent(index);

			this.presupuestoproductoConstantesFunciones.setResaltarFK_IdProductoPresupuestoProducto(resaltar);

			jPanel.setBorder(this.presupuestoproductoConstantesFunciones.resaltarFK_IdProductoPresupuestoProducto);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPresupuestoProducto.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPresupuestoProducto() throws Exception {

		if(this.jInternalFrameDetalleFormPresupuestoProducto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPresupuestoProducto();
		this.updateVisibilidadResaltarControlesFormularioPresupuestoProducto();
		this.updateHabilitarResaltarControlesFormularioPresupuestoProducto();
		
	}
	
	public void updateBorderResaltarControlesFormularioPresupuestoProducto() throws Exception {
		if(this.jInternalFrameDetalleFormPresupuestoProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.presupuestoproductoConstantesFunciones.resaltaridPresupuestoProducto!=null && this.jInternalFrameDetalleFormPresupuestoProducto!=null) {this.jInternalFrameDetalleFormPresupuestoProducto.jLabelidPresupuestoProducto.setBorder(this.presupuestoproductoConstantesFunciones.resaltaridPresupuestoProducto);}
		if(this.presupuestoproductoConstantesFunciones.resaltarid_empresaPresupuestoProducto!=null && this.jInternalFrameDetalleFormPresupuestoProducto!=null) {this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_empresaPresupuestoProducto.setBorder(this.presupuestoproductoConstantesFunciones.resaltarid_empresaPresupuestoProducto);}
		if(this.presupuestoproductoConstantesFunciones.resaltarid_sucursalPresupuestoProducto!=null && this.jInternalFrameDetalleFormPresupuestoProducto!=null) {this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_sucursalPresupuestoProducto.setBorder(this.presupuestoproductoConstantesFunciones.resaltarid_sucursalPresupuestoProducto);}
		if(this.presupuestoproductoConstantesFunciones.resaltarid_ejercicioPresupuestoProducto!=null && this.jInternalFrameDetalleFormPresupuestoProducto!=null) {this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_ejercicioPresupuestoProducto.setBorder(this.presupuestoproductoConstantesFunciones.resaltarid_ejercicioPresupuestoProducto);}
		if(this.presupuestoproductoConstantesFunciones.resaltarid_periodoPresupuestoProducto!=null && this.jInternalFrameDetalleFormPresupuestoProducto!=null) {this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_periodoPresupuestoProducto.setBorder(this.presupuestoproductoConstantesFunciones.resaltarid_periodoPresupuestoProducto);}
		if(this.presupuestoproductoConstantesFunciones.resaltarid_cuenta_contablePresupuestoProducto!=null && this.jInternalFrameDetalleFormPresupuestoProducto!=null) {this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_cuenta_contablePresupuestoProducto.setBorder(this.presupuestoproductoConstantesFunciones.resaltarid_cuenta_contablePresupuestoProducto);}
		if(this.presupuestoproductoConstantesFunciones.resaltarid_bodegaPresupuestoProducto!=null && this.jInternalFrameDetalleFormPresupuestoProducto!=null) {this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_bodegaPresupuestoProducto.setBorder(this.presupuestoproductoConstantesFunciones.resaltarid_bodegaPresupuestoProducto);}
		if(this.presupuestoproductoConstantesFunciones.resaltarid_productoPresupuestoProducto!=null && this.jInternalFrameDetalleFormPresupuestoProducto!=null) {this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_productoPresupuestoProducto.setBorder(this.presupuestoproductoConstantesFunciones.resaltarid_productoPresupuestoProducto);}
		if(this.presupuestoproductoConstantesFunciones.resaltarvalor_ingresoPresupuestoProducto!=null && this.jInternalFrameDetalleFormPresupuestoProducto!=null) {this.jInternalFrameDetalleFormPresupuestoProducto.jTextFieldvalor_ingresoPresupuestoProducto.setBorder(this.presupuestoproductoConstantesFunciones.resaltarvalor_ingresoPresupuestoProducto);}
		if(this.presupuestoproductoConstantesFunciones.resaltarvalor_egresoPresupuestoProducto!=null && this.jInternalFrameDetalleFormPresupuestoProducto!=null) {this.jInternalFrameDetalleFormPresupuestoProducto.jTextFieldvalor_egresoPresupuestoProducto.setBorder(this.presupuestoproductoConstantesFunciones.resaltarvalor_egresoPresupuestoProducto);}
		if(this.presupuestoproductoConstantesFunciones.resaltarcantidad_ingresoPresupuestoProducto!=null && this.jInternalFrameDetalleFormPresupuestoProducto!=null) {this.jInternalFrameDetalleFormPresupuestoProducto.jTextFieldcantidad_ingresoPresupuestoProducto.setBorder(this.presupuestoproductoConstantesFunciones.resaltarcantidad_ingresoPresupuestoProducto);}
		if(this.presupuestoproductoConstantesFunciones.resaltarcantidad_egresoPresupuestoProducto!=null && this.jInternalFrameDetalleFormPresupuestoProducto!=null) {this.jInternalFrameDetalleFormPresupuestoProducto.jTextFieldcantidad_egresoPresupuestoProducto.setBorder(this.presupuestoproductoConstantesFunciones.resaltarcantidad_egresoPresupuestoProducto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPresupuestoProducto() throws Exception {		
		if(this.jInternalFrameDetalleFormPresupuestoProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
	
		//this.jInternalFrameDetalleFormPresupuestoProducto.jLabelidPresupuestoProducto.setVisible(this.presupuestoproductoConstantesFunciones.mostraridPresupuestoProducto);
		this.jInternalFrameDetalleFormPresupuestoProducto.jPanelidPresupuestoProducto.setVisible(this.presupuestoproductoConstantesFunciones.mostraridPresupuestoProducto);
		//this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_empresaPresupuestoProducto.setVisible(this.presupuestoproductoConstantesFunciones.mostrarid_empresaPresupuestoProducto);
		this.jInternalFrameDetalleFormPresupuestoProducto.jPanelid_empresaPresupuestoProducto.setVisible(this.presupuestoproductoConstantesFunciones.mostrarid_empresaPresupuestoProducto);
		//this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_sucursalPresupuestoProducto.setVisible(this.presupuestoproductoConstantesFunciones.mostrarid_sucursalPresupuestoProducto);
		this.jInternalFrameDetalleFormPresupuestoProducto.jPanelid_sucursalPresupuestoProducto.setVisible(this.presupuestoproductoConstantesFunciones.mostrarid_sucursalPresupuestoProducto);
		//this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_ejercicioPresupuestoProducto.setVisible(this.presupuestoproductoConstantesFunciones.mostrarid_ejercicioPresupuestoProducto);
		this.jInternalFrameDetalleFormPresupuestoProducto.jPanelid_ejercicioPresupuestoProducto.setVisible(this.presupuestoproductoConstantesFunciones.mostrarid_ejercicioPresupuestoProducto);
		//this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_periodoPresupuestoProducto.setVisible(this.presupuestoproductoConstantesFunciones.mostrarid_periodoPresupuestoProducto);
		this.jInternalFrameDetalleFormPresupuestoProducto.jPanelid_periodoPresupuestoProducto.setVisible(this.presupuestoproductoConstantesFunciones.mostrarid_periodoPresupuestoProducto);
		//this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_cuenta_contablePresupuestoProducto.setVisible(this.presupuestoproductoConstantesFunciones.mostrarid_cuenta_contablePresupuestoProducto);
		this.jInternalFrameDetalleFormPresupuestoProducto.jPanelid_cuenta_contablePresupuestoProducto.setVisible(this.presupuestoproductoConstantesFunciones.mostrarid_cuenta_contablePresupuestoProducto);
		//this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_bodegaPresupuestoProducto.setVisible(this.presupuestoproductoConstantesFunciones.mostrarid_bodegaPresupuestoProducto);
		this.jInternalFrameDetalleFormPresupuestoProducto.jPanelid_bodegaPresupuestoProducto.setVisible(this.presupuestoproductoConstantesFunciones.mostrarid_bodegaPresupuestoProducto);
		//this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_productoPresupuestoProducto.setVisible(this.presupuestoproductoConstantesFunciones.mostrarid_productoPresupuestoProducto);
		this.jInternalFrameDetalleFormPresupuestoProducto.jPanelid_productoPresupuestoProducto.setVisible(this.presupuestoproductoConstantesFunciones.mostrarid_productoPresupuestoProducto);
			this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_productoPresupuestoProducto.setVisible(this.presupuestoproductoConstantesFunciones.mostrarid_productoPresupuestoProducto);
		//this.jInternalFrameDetalleFormPresupuestoProducto.jTextFieldvalor_ingresoPresupuestoProducto.setVisible(this.presupuestoproductoConstantesFunciones.mostrarvalor_ingresoPresupuestoProducto);
		this.jInternalFrameDetalleFormPresupuestoProducto.jPanelvalor_ingresoPresupuestoProducto.setVisible(this.presupuestoproductoConstantesFunciones.mostrarvalor_ingresoPresupuestoProducto);
		//this.jInternalFrameDetalleFormPresupuestoProducto.jTextFieldvalor_egresoPresupuestoProducto.setVisible(this.presupuestoproductoConstantesFunciones.mostrarvalor_egresoPresupuestoProducto);
		this.jInternalFrameDetalleFormPresupuestoProducto.jPanelvalor_egresoPresupuestoProducto.setVisible(this.presupuestoproductoConstantesFunciones.mostrarvalor_egresoPresupuestoProducto);
		//this.jInternalFrameDetalleFormPresupuestoProducto.jTextFieldcantidad_ingresoPresupuestoProducto.setVisible(this.presupuestoproductoConstantesFunciones.mostrarcantidad_ingresoPresupuestoProducto);
		this.jInternalFrameDetalleFormPresupuestoProducto.jPanelcantidad_ingresoPresupuestoProducto.setVisible(this.presupuestoproductoConstantesFunciones.mostrarcantidad_ingresoPresupuestoProducto);
		//this.jInternalFrameDetalleFormPresupuestoProducto.jTextFieldcantidad_egresoPresupuestoProducto.setVisible(this.presupuestoproductoConstantesFunciones.mostrarcantidad_egresoPresupuestoProducto);
		this.jInternalFrameDetalleFormPresupuestoProducto.jPanelcantidad_egresoPresupuestoProducto.setVisible(this.presupuestoproductoConstantesFunciones.mostrarcantidad_egresoPresupuestoProducto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPresupuestoProducto() throws Exception {
		if(this.jInternalFrameDetalleFormPresupuestoProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPresupuestoProducto!=null) {
	
		this.jInternalFrameDetalleFormPresupuestoProducto.jLabelidPresupuestoProducto.setEnabled(this.presupuestoproductoConstantesFunciones.activaridPresupuestoProducto);
		this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_empresaPresupuestoProducto.setEnabled(this.presupuestoproductoConstantesFunciones.activarid_empresaPresupuestoProducto);
		this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_sucursalPresupuestoProducto.setEnabled(this.presupuestoproductoConstantesFunciones.activarid_sucursalPresupuestoProducto);
		this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_ejercicioPresupuestoProducto.setEnabled(this.presupuestoproductoConstantesFunciones.activarid_ejercicioPresupuestoProducto);
		this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_periodoPresupuestoProducto.setEnabled(this.presupuestoproductoConstantesFunciones.activarid_periodoPresupuestoProducto);
		this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_cuenta_contablePresupuestoProducto.setEnabled(this.presupuestoproductoConstantesFunciones.activarid_cuenta_contablePresupuestoProducto);
		this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_bodegaPresupuestoProducto.setEnabled(this.presupuestoproductoConstantesFunciones.activarid_bodegaPresupuestoProducto);
		this.jInternalFrameDetalleFormPresupuestoProducto.jComboBoxid_productoPresupuestoProducto.setEnabled(this.presupuestoproductoConstantesFunciones.activarid_productoPresupuestoProducto);
			this.jInternalFrameDetalleFormPresupuestoProducto.jButtonid_productoPresupuestoProducto.setEnabled(this.presupuestoproductoConstantesFunciones.activarid_productoPresupuestoProducto);
		this.jInternalFrameDetalleFormPresupuestoProducto.jTextFieldvalor_ingresoPresupuestoProducto.setEnabled(this.presupuestoproductoConstantesFunciones.activarvalor_ingresoPresupuestoProducto);
		this.jInternalFrameDetalleFormPresupuestoProducto.jTextFieldvalor_egresoPresupuestoProducto.setEnabled(this.presupuestoproductoConstantesFunciones.activarvalor_egresoPresupuestoProducto);
		this.jInternalFrameDetalleFormPresupuestoProducto.jTextFieldcantidad_ingresoPresupuestoProducto.setEnabled(this.presupuestoproductoConstantesFunciones.activarcantidad_ingresoPresupuestoProducto);
		this.jInternalFrameDetalleFormPresupuestoProducto.jTextFieldcantidad_egresoPresupuestoProducto.setEnabled(this.presupuestoproductoConstantesFunciones.activarcantidad_egresoPresupuestoProducto);
		}
	}
	
		
}