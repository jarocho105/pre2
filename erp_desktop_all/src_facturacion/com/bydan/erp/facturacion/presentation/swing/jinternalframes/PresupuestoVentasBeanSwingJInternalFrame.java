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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;




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

import com.bydan.erp.facturacion.util.PresupuestoVentasConstantesFunciones;
import com.bydan.erp.facturacion.util.PresupuestoVentasParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.PresupuestoVentasParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.PresupuestoVentasBean;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.facturacion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.facturacion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class PresupuestoVentasBeanSwingJInternalFrame extends PresupuestoVentasJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PresupuestoVentasBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PresupuestoVentas> presupuestoventasValidator = new ClassValidator<PresupuestoVentas>(PresupuestoVentas.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PresupuestoVentas presupuestoventas;	
	public PresupuestoVentas presupuestoventasAux;
	public PresupuestoVentas presupuestoventasAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PresupuestoVentas presupuestoventasTotales;
	public Long idPresupuestoVentasActual;
	public Long iIdNuevoPresupuestoVentas=0L;
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

	public String sFinalQueryComboVendedor="";

	public List<Vendedor> vendedorsForeignKey;

	public List<Vendedor> getvendedorsForeignKey() {
		return vendedorsForeignKey;
	}

	public void setvendedorsForeignKey(List<Vendedor> vendedorsForeignKey) {
		this.vendedorsForeignKey = vendedorsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Vendedor vendedorForeignKey;

	public Vendedor getvendedorForeignKey() {
		return vendedorForeignKey;
	}

	public void setvendedorForeignKey(Vendedor vendedorForeignKey) {
		this.vendedorForeignKey = vendedorForeignKey;
	}

	public String sFinalQueryComboPais="";

	public List<Pais> paissForeignKey;

	public List<Pais> getpaissForeignKey() {
		return paissForeignKey;
	}

	public void setpaissForeignKey(List<Pais> paissForeignKey) {
		this.paissForeignKey = paissForeignKey;
	}

	//OBJETO FK ACTUAL
	public Pais paisForeignKey;

	public Pais getpaisForeignKey() {
		return paisForeignKey;
	}

	public void setpaisForeignKey(Pais paisForeignKey) {
		this.paisForeignKey = paisForeignKey;
	}

	public String sFinalQueryComboCiudad="";

	public List<Ciudad> ciudadsForeignKey;

	public List<Ciudad> getciudadsForeignKey() {
		return ciudadsForeignKey;
	}

	public void setciudadsForeignKey(List<Ciudad> ciudadsForeignKey) {
		this.ciudadsForeignKey = ciudadsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Ciudad ciudadForeignKey;

	public Ciudad getciudadForeignKey() {
		return ciudadForeignKey;
	}

	public void setciudadForeignKey(Ciudad ciudadForeignKey) {
		this.ciudadForeignKey = ciudadForeignKey;
	}

	public String sFinalQueryComboZona="";

	public List<Zona> zonasForeignKey;

	public List<Zona> getzonasForeignKey() {
		return zonasForeignKey;
	}

	public void setzonasForeignKey(List<Zona> zonasForeignKey) {
		this.zonasForeignKey = zonasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Zona zonaForeignKey;

	public Zona getzonaForeignKey() {
		return zonaForeignKey;
	}

	public void setzonaForeignKey(Zona zonaForeignKey) {
		this.zonaForeignKey = zonaForeignKey;
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
	
	public Boolean isPermisoTodoPresupuestoVentas;
	public Boolean isPermisoNuevoPresupuestoVentas;
	public Boolean isPermisoActualizarPresupuestoVentas;
	public Boolean isPermisoActualizarOriginalPresupuestoVentas;
	public Boolean isPermisoEliminarPresupuestoVentas;
	public Boolean isPermisoGuardarCambiosPresupuestoVentas;
	public Boolean isPermisoConsultaPresupuestoVentas;
	public Boolean isPermisoBusquedaPresupuestoVentas;
	public Boolean isPermisoReportePresupuestoVentas;
	public Boolean isPermisoPaginacionMedioPresupuestoVentas;
	public Boolean isPermisoPaginacionAltoPresupuestoVentas;
	public Boolean isPermisoPaginacionTodoPresupuestoVentas;
	public Boolean isPermisoCopiarPresupuestoVentas;
	public Boolean isPermisoVerFormPresupuestoVentas;
	public Boolean isPermisoDuplicarPresupuestoVentas;
	public Boolean isPermisoOrdenPresupuestoVentas;
	
	
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
	
	public PresupuestoVentasParameterReturnGeneral presupuestoventasReturnGeneral;
	public PresupuestoVentasParameterReturnGeneral presupuestoventasParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPresupuestoVentas=false;
	public Boolean esParaAccionDesdeFormularioPresupuestoVentas=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PresupuestoVentasSessionBeanAdditional presupuestoventasSessionBeanAdditional=null;
	
	public PresupuestoVentasSessionBeanAdditional getPresupuestoVentasSessionBeanAdditional() {
		return this.presupuestoventasSessionBeanAdditional;
	}
	
	public void setPresupuestoVentasSessionBeanAdditional(PresupuestoVentasSessionBeanAdditional presupuestoventasSessionBeanAdditional) {
		try {
			this.presupuestoventasSessionBeanAdditional=presupuestoventasSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PresupuestoVentasBeanSwingJInternalFrameAdditional presupuestoventasBeanSwingJInternalFrameAdditional=null;
	//public class PresupuestoVentasBeanSwingJInternalFrame
	
	public PresupuestoVentasBeanSwingJInternalFrameAdditional getPresupuestoVentasBeanSwingJInternalFrameAdditional() {
		return this.presupuestoventasBeanSwingJInternalFrameAdditional;
	}
	
	public void setPresupuestoVentasBeanSwingJInternalFrameAdditional(PresupuestoVentasBeanSwingJInternalFrameAdditional presupuestoventasBeanSwingJInternalFrameAdditional) {
		try {
			this.presupuestoventasBeanSwingJInternalFrameAdditional=presupuestoventasBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PresupuestoVentasLogic presupuestoventasLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PresupuestoVentas presupuestoventasBean;
	public PresupuestoVentasConstantesFunciones presupuestoventasConstantesFunciones;
	//public PresupuestoVentasParameterReturnGeneral presupuestoventasReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	public VendedorLogic vendedorLogic;
	public PaisLogic paisLogic;
	public CiudadLogic ciudadLogic;
	public ZonaLogic zonaLogic;
	public ProductoLogic productoLogic;
	
	//PARAMETROS
	
	
	//public List<PresupuestoVentas> presupuestoventass;	
	//public List<PresupuestoVentas> presupuestoventassEliminados;
	//public List<PresupuestoVentas> presupuestoventassAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPresupuestoVentas=false;
	public Boolean isVisibilidadCeldaDuplicarPresupuestoVentas=true;
	public Boolean isVisibilidadCeldaCopiarPresupuestoVentas=true;
	public Boolean isVisibilidadCeldaVerFormPresupuestoVentas=true;
	public Boolean isVisibilidadCeldaOrdenPresupuestoVentas=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPresupuestoVentas=false;
	public Boolean isVisibilidadCeldaModificarPresupuestoVentas=false;
	public Boolean isVisibilidadCeldaActualizarPresupuestoVentas=false;
	public Boolean isVisibilidadCeldaEliminarPresupuestoVentas=false;
	public Boolean isVisibilidadCeldaCancelarPresupuestoVentas=false;
	public Boolean isVisibilidadCeldaGuardarPresupuestoVentas=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPresupuestoVentas=false;	
	
	
	public Boolean isVisibilidadFK_IdCiudad=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdPais=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdVendedor=false;
	public Boolean isVisibilidadFK_IdZona=false;
	
	public Long getiIdNuevoPresupuestoVentas() {
		return this.iIdNuevoPresupuestoVentas;
	}

	public void setiIdNuevoPresupuestoVentas(Long iIdNuevoPresupuestoVentas) {
		this.iIdNuevoPresupuestoVentas = iIdNuevoPresupuestoVentas;
	}
	
	public Long getidPresupuestoVentasActual() {
		return this.idPresupuestoVentasActual;
	}

	public void setidPresupuestoVentasActual(Long idPresupuestoVentasActual) {
		this.idPresupuestoVentasActual = idPresupuestoVentasActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PresupuestoVentas getpresupuestoventas() {
		return this.presupuestoventas;
	}

	public void setpresupuestoventas(PresupuestoVentas presupuestoventas) {
		this.presupuestoventas = presupuestoventas;
	}
	
	public PresupuestoVentas getpresupuestoventasAux() {
		return this.presupuestoventasAux;
	}

	public void setpresupuestoventasAux(PresupuestoVentas presupuestoventasAux) {
		this.presupuestoventasAux = presupuestoventasAux;
	}				
	
	public PresupuestoVentas getpresupuestoventasAnterior() {
		return this.presupuestoventasAnterior;
	}

	public void setpresupuestoventasAnterior(PresupuestoVentas presupuestoventasAnterior) {
		this.presupuestoventasAnterior = presupuestoventasAnterior;
	}	
	
	public PresupuestoVentas getpresupuestoventasTotales() {
		return this.presupuestoventasTotales;
	}

	public void setpresupuestoventasTotales(PresupuestoVentas presupuestoventasTotales) {
		this.presupuestoventasTotales = presupuestoventasTotales;
	}	
	
	public PresupuestoVentas getpresupuestoventasBean() {
		return this.presupuestoventasBean;
	}

	public void setpresupuestoventasBean(PresupuestoVentas presupuestoventasBean) {
		this.presupuestoventasBean = presupuestoventasBean;
	}	
	
	public PresupuestoVentasParameterReturnGeneral getpresupuestoventasReturnGeneral() {
		return this.presupuestoventasReturnGeneral;
	}

	public void setpresupuestoventasReturnGeneral(PresupuestoVentasParameterReturnGeneral presupuestoventasReturnGeneral) {
		this.presupuestoventasReturnGeneral = presupuestoventasReturnGeneral;
	}	
	
	
	public Long id_ciudadFK_IdCiudad=-1L;

	public Long getid_ciudadFK_IdCiudad() {
		return this.id_ciudadFK_IdCiudad;
	}

	public void setid_ciudadFK_IdCiudad(Long id_ciudadFK_IdCiudad) {
		this.id_ciudadFK_IdCiudad = id_ciudadFK_IdCiudad;
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

	public Long id_paisFK_IdPais=-1L;

	public Long getid_paisFK_IdPais() {
		return this.id_paisFK_IdPais;
	}

	public void setid_paisFK_IdPais(Long id_paisFK_IdPais) {
		this.id_paisFK_IdPais = id_paisFK_IdPais;
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

	public Long id_vendedorFK_IdVendedor=-1L;

	public Long getid_vendedorFK_IdVendedor() {
		return this.id_vendedorFK_IdVendedor;
	}

	public void setid_vendedorFK_IdVendedor(Long id_vendedorFK_IdVendedor) {
		this.id_vendedorFK_IdVendedor = id_vendedorFK_IdVendedor;
	}

	public Long id_zonaFK_IdZona=null;

	public Long getid_zonaFK_IdZona() {
		return this.id_zonaFK_IdZona;
	}

	public void setid_zonaFK_IdZona(Long id_zonaFK_IdZona) {
		this.id_zonaFK_IdZona = id_zonaFK_IdZona;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public PresupuestoVentasLogic getPresupuestoVentasLogic()	{		
		return presupuestoventasLogic;
	}

	public void setPresupuestoVentasLogic(PresupuestoVentasLogic presupuestoventasLogic) {
		this.presupuestoventasLogic = presupuestoventasLogic;
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
	
	public Boolean getIsEsNuevoPresupuestoVentas() {
		return isEsNuevoPresupuestoVentas;
	}

	public void setIsEsNuevoPresupuestoVentas(Boolean isEsNuevoPresupuestoVentas) {
		this.isEsNuevoPresupuestoVentas = isEsNuevoPresupuestoVentas;
	}

	public Boolean getEsParaAccionDesdeFormularioPresupuestoVentas() {
		return esParaAccionDesdeFormularioPresupuestoVentas;
	}
	
	public void setEsParaAccionDesdeFormularioPresupuestoVentas(Boolean esParaAccionDesdeFormularioPresupuestoVentas) {
		this.esParaAccionDesdeFormularioPresupuestoVentas = esParaAccionDesdeFormularioPresupuestoVentas;
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

			if(this.presupuestoventasSessionBean==null) {
				this.presupuestoventasSessionBean=new PresupuestoVentasSessionBean();
			}

			if(!this.presupuestoventasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(presupuestoventasSessionBean.getlidEmpresaActual());
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

			if(this.presupuestoventasSessionBean==null) {
				this.presupuestoventasSessionBean=new PresupuestoVentasSessionBean();
			}

			if(!this.presupuestoventasSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(presupuestoventasSessionBean.getlidSucursalActual());
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

			if(this.presupuestoventasSessionBean==null) {
				this.presupuestoventasSessionBean=new PresupuestoVentasSessionBean();
			}

			if(!this.presupuestoventasSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(presupuestoventasSessionBean.getlidEjercicioActual());
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

			if(this.presupuestoventasSessionBean==null) {
				this.presupuestoventasSessionBean=new PresupuestoVentasSessionBean();
			}

			if(!this.presupuestoventasSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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
					periodoLogic.getEntityWithConnection(presupuestoventasSessionBean.getlidPeriodoActual());
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

	public void cargarCombosVendedorsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.vendedorsForeignKey=new ArrayList<Vendedor>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			VendedorLogic vendedorLogic=new VendedorLogic();

			//vendedorLogic.getVendedorDataAccess().setIsForForeingKeyData(true);

			if(this.presupuestoventasSessionBean==null) {
				this.presupuestoventasSessionBean=new PresupuestoVentasSessionBean();
			}

			if(!this.presupuestoventasSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//vendedorLogic.getVendedorDataAccess().setIsForForeingKeyData(true);

					vendedorLogic.getTodosVendedorsWithConnection(sFinalQuery,new Pagination());

					this.vendedorsForeignKey=vendedorLogic.getVendedors();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaVendedor(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					vendedorLogic.getEntityWithConnection(presupuestoventasSessionBean.getlidVendedorActual());
					this.vendedorsForeignKey.add(vendedorLogic.getVendedor());
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

	public void cargarCombosPaissForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.paissForeignKey=new ArrayList<Pais>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PaisLogic paisLogic=new PaisLogic();

			//paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

			if(this.presupuestoventasSessionBean==null) {
				this.presupuestoventasSessionBean=new PresupuestoVentasSessionBean();
			}

			if(!this.presupuestoventasSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

					paisLogic.getTodosPaissWithConnection(sFinalQuery,new Pagination());

					this.paissForeignKey=paisLogic.getPaiss();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPais(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.getEntityWithConnection(presupuestoventasSessionBean.getlidPaisActual());
					this.paissForeignKey.add(paisLogic.getPais());
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

	public void cargarCombosCiudadsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.ciudadsForeignKey=new ArrayList<Ciudad>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CiudadLogic ciudadLogic=new CiudadLogic();

			//ciudadLogic.getCiudadDataAccess().setIsForForeingKeyData(true);

			if(this.presupuestoventasSessionBean==null) {
				this.presupuestoventasSessionBean=new PresupuestoVentasSessionBean();
			}

			if(!this.presupuestoventasSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ciudadLogic.getCiudadDataAccess().setIsForForeingKeyData(true);

					ciudadLogic.getTodosCiudadsWithConnection(sFinalQuery,new Pagination());

					this.ciudadsForeignKey=ciudadLogic.getCiudads();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCiudad(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					ciudadLogic.getEntityWithConnection(presupuestoventasSessionBean.getlidCiudadActual());
					this.ciudadsForeignKey.add(ciudadLogic.getCiudad());
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

	public void cargarCombosZonasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.zonasForeignKey=new ArrayList<Zona>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			Zona zonaNulo = new Zona();

			ZonaLogic zonaLogic=new ZonaLogic();

			//zonaLogic.getZonaDataAccess().setIsForForeingKeyData(true);

			if(this.presupuestoventasSessionBean==null) {
				this.presupuestoventasSessionBean=new PresupuestoVentasSessionBean();
			}

			if(!this.presupuestoventasSessionBean.getisBusquedaDesdeForeignKeySesionZona()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//zonaLogic.getZonaDataAccess().setIsForForeingKeyData(true);

					zonaLogic.getTodosZonasWithConnection(sFinalQuery,new Pagination());

					this.zonasForeignKey=zonaLogic.getZonas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}

				this.zonasForeignKey.add(0, zonaNulo);

				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaZona(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					zonaLogic.getEntityWithConnection(presupuestoventasSessionBean.getlidZonaActual());
					this.zonasForeignKey.add(zonaLogic.getZona());
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

			if(this.presupuestoventasSessionBean==null) {
				this.presupuestoventasSessionBean=new PresupuestoVentasSessionBean();
			}

			if(!this.presupuestoventasSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(presupuestoventasSessionBean.getlidProductoActual());
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

					if(this.presupuestoventas!=null) {
						this.presupuestoventas.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
						this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_empresaPresupuestoVentas.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaPresupuestoVentas.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
						if(this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_empresaPresupuestoVentas.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_empresaPresupuestoVentas.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaPresupuestoVentasGenerico)throws Exception
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
				jComboBoxid_empresaPresupuestoVentasGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaPresupuestoVentasGenerico!=null && jComboBoxid_empresaPresupuestoVentasGenerico.getItemCount()>0) {
					jComboBoxid_empresaPresupuestoVentasGenerico.setSelectedIndex(0);
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

					if(this.presupuestoventas!=null) {
						this.presupuestoventas.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
						this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_sucursalPresupuestoVentas.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalPresupuestoVentas.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
						if(this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_sucursalPresupuestoVentas.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_sucursalPresupuestoVentas.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalPresupuestoVentasGenerico)throws Exception
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
				jComboBoxid_sucursalPresupuestoVentasGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalPresupuestoVentasGenerico!=null && jComboBoxid_sucursalPresupuestoVentasGenerico.getItemCount()>0) {
					jComboBoxid_sucursalPresupuestoVentasGenerico.setSelectedIndex(0);
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

					if(this.presupuestoventas!=null) {
						this.presupuestoventas.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
						this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_ejercicioPresupuestoVentas.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioPresupuestoVentas.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
						if(this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_ejercicioPresupuestoVentas.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_ejercicioPresupuestoVentas.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioPresupuestoVentasGenerico)throws Exception
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
				jComboBoxid_ejercicioPresupuestoVentasGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioPresupuestoVentasGenerico!=null && jComboBoxid_ejercicioPresupuestoVentasGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioPresupuestoVentasGenerico.setSelectedIndex(0);
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

					if(this.presupuestoventas!=null) {
						this.presupuestoventas.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
						this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_periodoPresupuestoVentas.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoPresupuestoVentas.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
						if(this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_periodoPresupuestoVentas.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_periodoPresupuestoVentas.setSelectedIndex(0);
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
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoPresupuestoVentasGenerico)throws Exception
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
				jComboBoxid_periodoPresupuestoVentasGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoPresupuestoVentasGenerico!=null && jComboBoxid_periodoPresupuestoVentasGenerico.getItemCount()>0) {
					jComboBoxid_periodoPresupuestoVentasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualVendedorForeignKey(Long idVendedorSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Vendedor  vendedorTemp=null;

			for(Vendedor vendedorAux:vendedorsForeignKey) {
				if(vendedorAux.getId()!=null && vendedorAux.getId().equals(idVendedorSeleccionado)) {
					vendedorTemp=vendedorAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(vendedorTemp!=null) {

					if(this.presupuestoventas!=null) {
						this.presupuestoventas.setVendedor(vendedorTemp);
					}

					if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
						this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_vendedorPresupuestoVentas.setSelectedItem(vendedorTemp);
					}
				} else {
					//jComboBoxid_vendedorPresupuestoVentas.setSelectedItem(vendedorTemp);
					if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
						if(this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_vendedorPresupuestoVentas.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_vendedorPresupuestoVentas.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdVendedor") || sFormularioTipoBusqueda.equals("Todos")){
					if(vendedorTemp!=null && jComboBoxid_vendedorFK_IdVendedorPresupuestoVentas!=null) {
						jComboBoxid_vendedorFK_IdVendedorPresupuestoVentas.setSelectedItem(vendedorTemp);
					} else {
						if(jComboBoxid_vendedorFK_IdVendedorPresupuestoVentas!=null) {
							//jComboBoxid_vendedorFK_IdVendedorPresupuestoVentas.setSelectedItem(vendedorTemp);
							if(jComboBoxid_vendedorFK_IdVendedorPresupuestoVentas.getItemCount()>0) {
								jComboBoxid_vendedorFK_IdVendedorPresupuestoVentas.setSelectedIndex(0);
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

	public String getActualVendedorForeignKeyDescripcion(Long idVendedorSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Vendedor  vendedorTemp=null;

			for(Vendedor vendedorAux:vendedorsForeignKey) {
				if(vendedorAux.getId()!=null && vendedorAux.getId().equals(idVendedorSeleccionado)) {
					vendedorTemp=vendedorAux;
					break;
				}
			}


			sDescripcion=VendedorConstantesFunciones.getVendedorDescripcion(vendedorTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualVendedorForeignKeyGenerico(Long idVendedorSeleccionado,JComboBox jComboBoxid_vendedorPresupuestoVentasGenerico)throws Exception
	{
		try
		{
			Vendedor  vendedorTemp=null;

			for(Vendedor vendedorAux:vendedorsForeignKey) {
				if(vendedorAux.getId()!=null && vendedorAux.getId().equals(idVendedorSeleccionado)) {
					vendedorTemp=vendedorAux;
					break;
				}
			}

			if(vendedorTemp!=null) {
				jComboBoxid_vendedorPresupuestoVentasGenerico.setSelectedItem(vendedorTemp);
			} else {
				if(jComboBoxid_vendedorPresupuestoVentasGenerico!=null && jComboBoxid_vendedorPresupuestoVentasGenerico.getItemCount()>0) {
					jComboBoxid_vendedorPresupuestoVentasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPaisForeignKey(Long idPaisSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(paisTemp!=null) {

					if(this.presupuestoventas!=null) {
						this.presupuestoventas.setPais(paisTemp);
					}

					if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
						this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_paisPresupuestoVentas.setSelectedItem(paisTemp);
					}
				} else {
					//jComboBoxid_paisPresupuestoVentas.setSelectedItem(paisTemp);
					if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
						if(this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_paisPresupuestoVentas.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_paisPresupuestoVentas.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){
					if(paisTemp!=null && jComboBoxid_paisFK_IdPaisPresupuestoVentas!=null) {
						jComboBoxid_paisFK_IdPaisPresupuestoVentas.setSelectedItem(paisTemp);
					} else {
						if(jComboBoxid_paisFK_IdPaisPresupuestoVentas!=null) {
							//jComboBoxid_paisFK_IdPaisPresupuestoVentas.setSelectedItem(paisTemp);
							if(jComboBoxid_paisFK_IdPaisPresupuestoVentas.getItemCount()>0) {
								jComboBoxid_paisFK_IdPaisPresupuestoVentas.setSelectedIndex(0);
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

	public String getActualPaisForeignKeyDescripcion(Long idPaisSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}


			sDescripcion=PaisConstantesFunciones.getPaisDescripcion(paisTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPaisForeignKeyGenerico(Long idPaisSeleccionado,JComboBox jComboBoxid_paisPresupuestoVentasGenerico)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(paisTemp!=null) {
				jComboBoxid_paisPresupuestoVentasGenerico.setSelectedItem(paisTemp);
			} else {
				if(jComboBoxid_paisPresupuestoVentasGenerico!=null && jComboBoxid_paisPresupuestoVentasGenerico.getItemCount()>0) {
					jComboBoxid_paisPresupuestoVentasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCiudadForeignKey(Long idCiudadSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Ciudad  ciudadTemp=null;

			for(Ciudad ciudadAux:ciudadsForeignKey) {
				if(ciudadAux.getId()!=null && ciudadAux.getId().equals(idCiudadSeleccionado)) {
					ciudadTemp=ciudadAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(ciudadTemp!=null) {

					if(this.presupuestoventas!=null) {
						this.presupuestoventas.setCiudad(ciudadTemp);
					}

					if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
						this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_ciudadPresupuestoVentas.setSelectedItem(ciudadTemp);
					}
				} else {
					//jComboBoxid_ciudadPresupuestoVentas.setSelectedItem(ciudadTemp);
					if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
						if(this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_ciudadPresupuestoVentas.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_ciudadPresupuestoVentas.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCiudad") || sFormularioTipoBusqueda.equals("Todos")){
					if(ciudadTemp!=null && jComboBoxid_ciudadFK_IdCiudadPresupuestoVentas!=null) {
						jComboBoxid_ciudadFK_IdCiudadPresupuestoVentas.setSelectedItem(ciudadTemp);
					} else {
						if(jComboBoxid_ciudadFK_IdCiudadPresupuestoVentas!=null) {
							//jComboBoxid_ciudadFK_IdCiudadPresupuestoVentas.setSelectedItem(ciudadTemp);
							if(jComboBoxid_ciudadFK_IdCiudadPresupuestoVentas.getItemCount()>0) {
								jComboBoxid_ciudadFK_IdCiudadPresupuestoVentas.setSelectedIndex(0);
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

	public String getActualCiudadForeignKeyDescripcion(Long idCiudadSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Ciudad  ciudadTemp=null;

			for(Ciudad ciudadAux:ciudadsForeignKey) {
				if(ciudadAux.getId()!=null && ciudadAux.getId().equals(idCiudadSeleccionado)) {
					ciudadTemp=ciudadAux;
					break;
				}
			}


			sDescripcion=CiudadConstantesFunciones.getCiudadDescripcion(ciudadTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCiudadForeignKeyGenerico(Long idCiudadSeleccionado,JComboBox jComboBoxid_ciudadPresupuestoVentasGenerico)throws Exception
	{
		try
		{
			Ciudad  ciudadTemp=null;

			for(Ciudad ciudadAux:ciudadsForeignKey) {
				if(ciudadAux.getId()!=null && ciudadAux.getId().equals(idCiudadSeleccionado)) {
					ciudadTemp=ciudadAux;
					break;
				}
			}

			if(ciudadTemp!=null) {
				jComboBoxid_ciudadPresupuestoVentasGenerico.setSelectedItem(ciudadTemp);
			} else {
				if(jComboBoxid_ciudadPresupuestoVentasGenerico!=null && jComboBoxid_ciudadPresupuestoVentasGenerico.getItemCount()>0) {
					jComboBoxid_ciudadPresupuestoVentasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualZonaForeignKey(Long idZonaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Zona  zonaTemp=null;

			for(Zona zonaAux:zonasForeignKey) {
				if(zonaAux.getId()!=null && zonaAux.getId().equals(idZonaSeleccionado)) {
					zonaTemp=zonaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(zonaTemp!=null) {

					if(this.presupuestoventas!=null) {
						this.presupuestoventas.setZona(zonaTemp);
					}

					if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
						this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_zonaPresupuestoVentas.setSelectedItem(zonaTemp);
					}
				} else {
					//jComboBoxid_zonaPresupuestoVentas.setSelectedItem(zonaTemp);
					if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
						if(this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_zonaPresupuestoVentas.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_zonaPresupuestoVentas.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdZona") || sFormularioTipoBusqueda.equals("Todos")){
					if(zonaTemp!=null && jComboBoxid_zonaFK_IdZonaPresupuestoVentas!=null) {
						jComboBoxid_zonaFK_IdZonaPresupuestoVentas.setSelectedItem(zonaTemp);
					} else {
						if(jComboBoxid_zonaFK_IdZonaPresupuestoVentas!=null) {
							//jComboBoxid_zonaFK_IdZonaPresupuestoVentas.setSelectedItem(zonaTemp);
							if(jComboBoxid_zonaFK_IdZonaPresupuestoVentas.getItemCount()>0) {
								jComboBoxid_zonaFK_IdZonaPresupuestoVentas.setSelectedIndex(0);
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

	public String getActualZonaForeignKeyDescripcion(Long idZonaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Zona  zonaTemp=null;

			for(Zona zonaAux:zonasForeignKey) {
				if(zonaAux.getId()!=null && zonaAux.getId().equals(idZonaSeleccionado)) {
					zonaTemp=zonaAux;
					break;
				}
			}


			sDescripcion=ZonaConstantesFunciones.getZonaDescripcion(zonaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualZonaForeignKeyGenerico(Long idZonaSeleccionado,JComboBox jComboBoxid_zonaPresupuestoVentasGenerico)throws Exception
	{
		try
		{
			Zona  zonaTemp=null;

			for(Zona zonaAux:zonasForeignKey) {
				if(zonaAux.getId()!=null && zonaAux.getId().equals(idZonaSeleccionado)) {
					zonaTemp=zonaAux;
					break;
				}
			}

			if(zonaTemp!=null) {
				jComboBoxid_zonaPresupuestoVentasGenerico.setSelectedItem(zonaTemp);
			} else {
				if(jComboBoxid_zonaPresupuestoVentasGenerico!=null && jComboBoxid_zonaPresupuestoVentasGenerico.getItemCount()>0) {
					jComboBoxid_zonaPresupuestoVentasGenerico.setSelectedIndex(0);
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

					if(this.presupuestoventas!=null) {
						this.presupuestoventas.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
						this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_productoPresupuestoVentas.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoPresupuestoVentas.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
						if(this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_productoPresupuestoVentas.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_productoPresupuestoVentas.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoFK_IdProductoPresupuestoVentas!=null) {
						jComboBoxid_productoFK_IdProductoPresupuestoVentas.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoFK_IdProductoPresupuestoVentas!=null) {
							//jComboBoxid_productoFK_IdProductoPresupuestoVentas.setSelectedItem(productoTemp);
							if(jComboBoxid_productoFK_IdProductoPresupuestoVentas.getItemCount()>0) {
								jComboBoxid_productoFK_IdProductoPresupuestoVentas.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoPresupuestoVentasGenerico)throws Exception
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
				jComboBoxid_productoPresupuestoVentasGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoPresupuestoVentasGenerico!=null && jComboBoxid_productoPresupuestoVentasGenerico.getItemCount()>0) {
					jComboBoxid_productoPresupuestoVentasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(PresupuestoVentas presupuestoventas,JComboBox jComboBoxid_empresaPresupuestoVentasGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaPresupuestoVentasGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_empresaPresupuestoVentas.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaPresupuestoVentasGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				presupuestoventas.setid_empresa(empresaAux.getId());
				presupuestoventas.setempresa_descripcion(PresupuestoVentasConstantesFunciones.getEmpresaDescripcion(empresaAux));
				presupuestoventas.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(PresupuestoVentas presupuestoventas,JComboBox jComboBoxid_sucursalPresupuestoVentasGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalPresupuestoVentasGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_sucursalPresupuestoVentas.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalPresupuestoVentasGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				presupuestoventas.setid_sucursal(sucursalAux.getId());
				presupuestoventas.setsucursal_descripcion(PresupuestoVentasConstantesFunciones.getSucursalDescripcion(sucursalAux));
				presupuestoventas.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(PresupuestoVentas presupuestoventas,JComboBox jComboBoxid_ejercicioPresupuestoVentasGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioPresupuestoVentasGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_ejercicioPresupuestoVentas.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioPresupuestoVentasGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				presupuestoventas.setid_ejercicio(ejercicioAux.getId());
				presupuestoventas.setejercicio_descripcion(PresupuestoVentasConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				presupuestoventas.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(PresupuestoVentas presupuestoventas,JComboBox jComboBoxid_periodoPresupuestoVentasGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoPresupuestoVentasGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_periodoPresupuestoVentas.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoPresupuestoVentasGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				if(periodoAux.getid_estado_periodo().equals(0L)) {
					throw new Exception("Periodo INACTIVO, NO PUEDE GUARDAR LA INFORMACION CONSULTE CON EL ADMINISTRADOR");
				}

				presupuestoventas.setid_periodo(periodoAux.getId());
				presupuestoventas.setperiodo_descripcion(PresupuestoVentasConstantesFunciones.getPeriodoDescripcion(periodoAux));
				presupuestoventas.setPeriodo(periodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarVendedorForeignKey(PresupuestoVentas presupuestoventas,JComboBox jComboBoxid_vendedorPresupuestoVentasGenerico)throws Exception
	{
		try
		{
			Vendedor  vendedorAux=new Vendedor();

			if(jComboBoxid_vendedorPresupuestoVentasGenerico==null) {
				vendedorAux=(Vendedor)this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_vendedorPresupuestoVentas.getSelectedItem();
			} else {
				vendedorAux=(Vendedor)jComboBoxid_vendedorPresupuestoVentasGenerico.getSelectedItem();
			}

			if(vendedorAux!=null && vendedorAux.getId()!=null) {
				presupuestoventas.setid_vendedor(vendedorAux.getId());
				presupuestoventas.setvendedor_descripcion(PresupuestoVentasConstantesFunciones.getVendedorDescripcion(vendedorAux));
				presupuestoventas.setVendedor(vendedorAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPaisForeignKey(PresupuestoVentas presupuestoventas,JComboBox jComboBoxid_paisPresupuestoVentasGenerico)throws Exception
	{
		try
		{
			Pais  paisAux=new Pais();

			if(jComboBoxid_paisPresupuestoVentasGenerico==null) {
				paisAux=(Pais)this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_paisPresupuestoVentas.getSelectedItem();
			} else {
				paisAux=(Pais)jComboBoxid_paisPresupuestoVentasGenerico.getSelectedItem();
			}

			if(paisAux!=null && paisAux.getId()!=null) {
				presupuestoventas.setid_pais(paisAux.getId());
				presupuestoventas.setpais_descripcion(PresupuestoVentasConstantesFunciones.getPaisDescripcion(paisAux));
				presupuestoventas.setPais(paisAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCiudadForeignKey(PresupuestoVentas presupuestoventas,JComboBox jComboBoxid_ciudadPresupuestoVentasGenerico)throws Exception
	{
		try
		{
			Ciudad  ciudadAux=new Ciudad();

			if(jComboBoxid_ciudadPresupuestoVentasGenerico==null) {
				ciudadAux=(Ciudad)this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_ciudadPresupuestoVentas.getSelectedItem();
			} else {
				ciudadAux=(Ciudad)jComboBoxid_ciudadPresupuestoVentasGenerico.getSelectedItem();
			}

			if(ciudadAux!=null && ciudadAux.getId()!=null) {
				presupuestoventas.setid_ciudad(ciudadAux.getId());
				presupuestoventas.setciudad_descripcion(PresupuestoVentasConstantesFunciones.getCiudadDescripcion(ciudadAux));
				presupuestoventas.setCiudad(ciudadAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarZonaForeignKey(PresupuestoVentas presupuestoventas,JComboBox jComboBoxid_zonaPresupuestoVentasGenerico)throws Exception
	{
		try
		{
			Zona  zonaAux=new Zona();

			if(jComboBoxid_zonaPresupuestoVentasGenerico==null) {
				zonaAux=(Zona)this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_zonaPresupuestoVentas.getSelectedItem();
			} else {
				zonaAux=(Zona)jComboBoxid_zonaPresupuestoVentasGenerico.getSelectedItem();
			}

			if(zonaAux!=null) {
				presupuestoventas.setid_zona(zonaAux.getId());
				presupuestoventas.setzona_descripcion(PresupuestoVentasConstantesFunciones.getZonaDescripcion(zonaAux));
				presupuestoventas.setZona(zonaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(PresupuestoVentas presupuestoventas,JComboBox jComboBoxid_productoPresupuestoVentasGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoPresupuestoVentasGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_productoPresupuestoVentas.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoPresupuestoVentasGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				presupuestoventas.setid_producto(productoAux.getId());
				presupuestoventas.setproducto_descripcion(PresupuestoVentasConstantesFunciones.getProductoDescripcion(productoAux));
				presupuestoventas.setProducto(productoAux);			}
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

					if(!PresupuestoVentasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) { 
							this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_empresaPresupuestoVentas.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_empresaPresupuestoVentas.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) { 
					}

					if(!PresupuestoVentasJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PresupuestoVentasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) { 
							this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_sucursalPresupuestoVentas.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_sucursalPresupuestoVentas.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) { 
					}

					if(!PresupuestoVentasJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PresupuestoVentasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) { 
							this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_ejercicioPresupuestoVentas.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_ejercicioPresupuestoVentas.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) { 
					}

					if(!PresupuestoVentasJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PresupuestoVentasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) { 
							this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_periodoPresupuestoVentas.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_periodoPresupuestoVentas.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) { 
					}

					if(!PresupuestoVentasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameVendedorsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingVendedor=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PresupuestoVentasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) { 
							this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_vendedorPresupuestoVentas.removeAllItems();

							for(Vendedor vendedor:this.vendedorsForeignKey) {
								this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_vendedorPresupuestoVentas.addItem(vendedor);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) { 
					}

					if(!PresupuestoVentasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdVendedor") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PresupuestoVentasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_vendedorFK_IdVendedorPresupuestoVentas.removeAllItems();

							for(Vendedor vendedor:this.vendedorsForeignKey) {
								this.jComboBoxid_vendedorFK_IdVendedorPresupuestoVentas.addItem(vendedor);
							}
						}

						if(!PresupuestoVentasJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePaissForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPais=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PresupuestoVentasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) { 
							this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_paisPresupuestoVentas.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_paisPresupuestoVentas.addItem(pais);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) { 
					}

					if(!PresupuestoVentasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PresupuestoVentasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_paisFK_IdPaisPresupuestoVentas.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jComboBoxid_paisFK_IdPaisPresupuestoVentas.addItem(pais);
							}
						}

						if(!PresupuestoVentasJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCiudadsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCiudad=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PresupuestoVentasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) { 
							this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_ciudadPresupuestoVentas.removeAllItems();

							for(Ciudad ciudad:this.ciudadsForeignKey) {
								this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_ciudadPresupuestoVentas.addItem(ciudad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) { 
					}

					if(!PresupuestoVentasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCiudad") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PresupuestoVentasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ciudadFK_IdCiudadPresupuestoVentas.removeAllItems();

							for(Ciudad ciudad:this.ciudadsForeignKey) {
								this.jComboBoxid_ciudadFK_IdCiudadPresupuestoVentas.addItem(ciudad);
							}
						}

						if(!PresupuestoVentasJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameZonasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingZona=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PresupuestoVentasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) { 
							this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_zonaPresupuestoVentas.removeAllItems();

							for(Zona zona:this.zonasForeignKey) {
								this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_zonaPresupuestoVentas.addItem(zona);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) { 
					}

					if(!PresupuestoVentasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdZona") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PresupuestoVentasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_zonaFK_IdZonaPresupuestoVentas.removeAllItems();

							for(Zona zona:this.zonasForeignKey) {
								this.jComboBoxid_zonaFK_IdZonaPresupuestoVentas.addItem(zona);
							}
						}

						if(!PresupuestoVentasJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PresupuestoVentasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) { 
							this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_productoPresupuestoVentas.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_productoPresupuestoVentas.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) { 
					}

					if(!PresupuestoVentasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PresupuestoVentasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoFK_IdProductoPresupuestoVentas.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoFK_IdProductoPresupuestoVentas.addItem(producto);
							}
						}

						if(!PresupuestoVentasJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
							this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_empresaPresupuestoVentas.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
							this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_empresaPresupuestoVentas.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
							this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_sucursalPresupuestoVentas.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
							this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_sucursalPresupuestoVentas.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
							this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_ejercicioPresupuestoVentas.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
							this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_ejercicioPresupuestoVentas.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
							this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_periodoPresupuestoVentas.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
							this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_periodoPresupuestoVentas.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameVendedorForeignKey(Vendedor vendedor,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
							this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_vendedorPresupuestoVentas.setSelectedItem(vendedor);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
							this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_vendedorPresupuestoVentas.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_vendedorFK_IdVendedorPresupuestoVentas.setSelectedItem(vendedor);
						} else {
							this.jComboBoxid_vendedorFK_IdVendedorPresupuestoVentas.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFramePaisForeignKey(Pais pais,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
							this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_paisPresupuestoVentas.setSelectedItem(pais);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
							this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_paisPresupuestoVentas.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_paisFK_IdPaisPresupuestoVentas.setSelectedItem(pais);
						} else {
							this.jComboBoxid_paisFK_IdPaisPresupuestoVentas.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCiudadForeignKey(Ciudad ciudad,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
							this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_ciudadPresupuestoVentas.setSelectedItem(ciudad);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
							this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_ciudadPresupuestoVentas.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ciudadFK_IdCiudadPresupuestoVentas.setSelectedItem(ciudad);
						} else {
							this.jComboBoxid_ciudadFK_IdCiudadPresupuestoVentas.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameZonaForeignKey(Zona zona,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
							this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_zonaPresupuestoVentas.setSelectedItem(zona);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
							this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_zonaPresupuestoVentas.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_zonaFK_IdZonaPresupuestoVentas.setSelectedItem(zona);
						} else {
							this.jComboBoxid_zonaFK_IdZonaPresupuestoVentas.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
							this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_productoPresupuestoVentas.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
							this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_productoPresupuestoVentas.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoFK_IdProductoPresupuestoVentas.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoFK_IdProductoPresupuestoVentas.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesPresupuestoVentas() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			PresupuestoVentasConstantesFunciones.refrescarForeignKeysDescripcionesPresupuestoVentas(this.presupuestoventasLogic.getPresupuestoVentass());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			PresupuestoVentasConstantesFunciones.refrescarForeignKeysDescripcionesPresupuestoVentas(this.presupuestoventass);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(Periodo.class));
		classes.add(new Classe(Vendedor.class));
		classes.add(new Classe(Pais.class));
		classes.add(new Classe(Ciudad.class));
		classes.add(new Classe(Zona.class));
		classes.add(new Classe(Producto.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//presupuestoventasLogic.setPresupuestoVentass(this.presupuestoventass);
			presupuestoventasLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public PresupuestoVentasParameterReturnGeneral getPresupuestoVentasParameterGeneral() {
		return this.presupuestoventasParameterGeneral;
	}
	
	public void setPresupuestoVentasParameterGeneral(PresupuestoVentasParameterReturnGeneral presupuestoventasParameterGeneral) {
		this.presupuestoventasParameterGeneral = presupuestoventasParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPresupuestoVentas() {
		return isPermisoTodoPresupuestoVentas;
	}

	public void setIsPermisoTodoPresupuestoVentas(Boolean isPermisoTodoPresupuestoVentas) {
		this.isPermisoTodoPresupuestoVentas = isPermisoTodoPresupuestoVentas;
	}

	public Boolean getIsPermisoNuevoPresupuestoVentas() {
		return isPermisoNuevoPresupuestoVentas;
	}

	public void setIsPermisoNuevoPresupuestoVentas(Boolean isPermisoNuevoPresupuestoVentas) {
		this.isPermisoNuevoPresupuestoVentas = isPermisoNuevoPresupuestoVentas;
	}

	public Boolean getIsPermisoActualizarPresupuestoVentas() {
		return isPermisoActualizarPresupuestoVentas;
	}

	public void setIsPermisoActualizarPresupuestoVentas(Boolean isPermisoActualizarPresupuestoVentas) {
		this.isPermisoActualizarPresupuestoVentas = isPermisoActualizarPresupuestoVentas;
	}

	public Boolean getIsPermisoEliminarPresupuestoVentas() {
		return isPermisoEliminarPresupuestoVentas;
	}

	public void setIsPermisoEliminarPresupuestoVentas(Boolean isPermisoEliminarPresupuestoVentas) {
		this.isPermisoEliminarPresupuestoVentas = isPermisoEliminarPresupuestoVentas;
	}

	public Boolean getIsPermisoGuardarCambiosPresupuestoVentas() {
		return isPermisoGuardarCambiosPresupuestoVentas;
	}

	public void setIsPermisoGuardarCambiosPresupuestoVentas(Boolean isPermisoGuardarCambiosPresupuestoVentas) {
		this.isPermisoGuardarCambiosPresupuestoVentas = isPermisoGuardarCambiosPresupuestoVentas;
	}
	
	public Boolean getIsPermisoConsultaPresupuestoVentas() {
		return isPermisoConsultaPresupuestoVentas;
	}

	public void setIsPermisoConsultaPresupuestoVentas(Boolean isPermisoConsultaPresupuestoVentas) {
		this.isPermisoConsultaPresupuestoVentas = isPermisoConsultaPresupuestoVentas;
	}

	public Boolean getIsPermisoBusquedaPresupuestoVentas() {
		return isPermisoBusquedaPresupuestoVentas;
	}

	public void setIsPermisoBusquedaPresupuestoVentas(Boolean isPermisoBusquedaPresupuestoVentas) {
		this.isPermisoBusquedaPresupuestoVentas = isPermisoBusquedaPresupuestoVentas;
	}

	public Boolean getIsPermisoReportePresupuestoVentas() {
		return isPermisoReportePresupuestoVentas;
	}

	public void setIsPermisoReportePresupuestoVentas(Boolean isPermisoReportePresupuestoVentas) {
		this.isPermisoReportePresupuestoVentas = isPermisoReportePresupuestoVentas;
	}
	
	public Boolean getIsPermisoPaginacionMedioPresupuestoVentas() {
		return isPermisoPaginacionMedioPresupuestoVentas;
	}

	public void setIsPermisoPaginacionMedioPresupuestoVentas(Boolean isPermisoPaginacionMedioPresupuestoVentas) {
		this.isPermisoPaginacionMedioPresupuestoVentas = isPermisoPaginacionMedioPresupuestoVentas;
	}
	
	public Boolean getIsPermisoPaginacionTodoPresupuestoVentas() {
		return isPermisoPaginacionTodoPresupuestoVentas;
	}

	public void setIsPermisoPaginacionTodoPresupuestoVentas(Boolean isPermisoPaginacionTodoPresupuestoVentas) {
		this.isPermisoPaginacionTodoPresupuestoVentas = isPermisoPaginacionTodoPresupuestoVentas;
	}
	
	public Boolean getIsPermisoPaginacionAltoPresupuestoVentas() {
		return isPermisoPaginacionAltoPresupuestoVentas;
	}

	public void setIsPermisoPaginacionAltoPresupuestoVentas(Boolean isPermisoPaginacionAltoPresupuestoVentas) {
		this.isPermisoPaginacionAltoPresupuestoVentas = isPermisoPaginacionAltoPresupuestoVentas;
	}
	
	public Boolean getIsPermisoCopiarPresupuestoVentas() {
		return isPermisoCopiarPresupuestoVentas;
	}

	public void setIsPermisoCopiarPresupuestoVentas(Boolean isPermisoCopiarPresupuestoVentas) {
		this.isPermisoCopiarPresupuestoVentas = isPermisoCopiarPresupuestoVentas;
	}
	
	public Boolean getIsPermisoVerFormPresupuestoVentas() {
		return isPermisoVerFormPresupuestoVentas;
	}

	public void setIsPermisoVerFormPresupuestoVentas(Boolean isPermisoVerFormPresupuestoVentas) {
		this.isPermisoVerFormPresupuestoVentas = isPermisoVerFormPresupuestoVentas;
	}
	
	public Boolean getIsPermisoDuplicarPresupuestoVentas() {
		return isPermisoDuplicarPresupuestoVentas;
	}

	public void setIsPermisoDuplicarPresupuestoVentas(Boolean isPermisoDuplicarPresupuestoVentas) {
		this.isPermisoDuplicarPresupuestoVentas = isPermisoDuplicarPresupuestoVentas;
	}
	
	public Boolean getIsPermisoOrdenPresupuestoVentas() {
		return isPermisoOrdenPresupuestoVentas;
	}

	public void setIsPermisoOrdenPresupuestoVentas(Boolean isPermisoOrdenPresupuestoVentas) {
		this.isPermisoOrdenPresupuestoVentas = isPermisoOrdenPresupuestoVentas;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPresupuestoVentas() {
		return isVisibilidadCeldaNuevoPresupuestoVentas;
	}

	public void setIsVisibilidadCeldaNuevoPresupuestoVentas(Boolean isVisibilidadCeldaNuevoPresupuestoVentas) {
		this.isVisibilidadCeldaNuevoPresupuestoVentas = isVisibilidadCeldaNuevoPresupuestoVentas;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPresupuestoVentas() {
		return isVisibilidadCeldaDuplicarPresupuestoVentas;
	}

	public void setIsVisibilidadCeldaDuplicarPresupuestoVentas(Boolean isVisibilidadCeldaDuplicarPresupuestoVentas) {
		this.isVisibilidadCeldaDuplicarPresupuestoVentas = isVisibilidadCeldaDuplicarPresupuestoVentas;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPresupuestoVentas() {
		return isVisibilidadCeldaCopiarPresupuestoVentas;
	}

	public void setIsVisibilidadCeldaCopiarPresupuestoVentas(Boolean isVisibilidadCeldaCopiarPresupuestoVentas) {
		this.isVisibilidadCeldaCopiarPresupuestoVentas = isVisibilidadCeldaCopiarPresupuestoVentas;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPresupuestoVentas() {
		return isVisibilidadCeldaVerFormPresupuestoVentas;
	}

	public void setIsVisibilidadCeldaVerFormPresupuestoVentas(Boolean isVisibilidadCeldaVerFormPresupuestoVentas) {
		this.isVisibilidadCeldaVerFormPresupuestoVentas = isVisibilidadCeldaVerFormPresupuestoVentas;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPresupuestoVentas() {
		return isVisibilidadCeldaOrdenPresupuestoVentas;
	}

	public void setIsVisibilidadCeldaOrdenPresupuestoVentas(Boolean isVisibilidadCeldaOrdenPresupuestoVentas) {
		this.isVisibilidadCeldaOrdenPresupuestoVentas = isVisibilidadCeldaOrdenPresupuestoVentas;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPresupuestoVentas() {
		return isVisibilidadCeldaNuevoRelacionesPresupuestoVentas;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPresupuestoVentas(Boolean isVisibilidadCeldaNuevoRelacionesPresupuestoVentas) {
		this.isVisibilidadCeldaNuevoRelacionesPresupuestoVentas = isVisibilidadCeldaNuevoRelacionesPresupuestoVentas;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPresupuestoVentas() {
		return isVisibilidadCeldaModificarPresupuestoVentas;
	}

	public void setIsVisibilidadCeldaModificarPresupuestoVentas(Boolean isVisibilidadCeldaModificarPresupuestoVentas) {
		this.isVisibilidadCeldaModificarPresupuestoVentas = isVisibilidadCeldaModificarPresupuestoVentas;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPresupuestoVentas() {
		return isVisibilidadCeldaActualizarPresupuestoVentas;
	}

	public void setIsVisibilidadCeldaActualizarPresupuestoVentas(Boolean isVisibilidadCeldaActualizarPresupuestoVentas) {
		this.isVisibilidadCeldaActualizarPresupuestoVentas = isVisibilidadCeldaActualizarPresupuestoVentas;
	}

	public Boolean getIsVisibilidadCeldaEliminarPresupuestoVentas() {
		return isVisibilidadCeldaEliminarPresupuestoVentas;
	}

	public void setIsVisibilidadCeldaEliminarPresupuestoVentas(Boolean isVisibilidadCeldaEliminarPresupuestoVentas) {
		this.isVisibilidadCeldaEliminarPresupuestoVentas = isVisibilidadCeldaEliminarPresupuestoVentas;
	}

	public Boolean getIsVisibilidadCeldaCancelarPresupuestoVentas() {
		return isVisibilidadCeldaCancelarPresupuestoVentas;
	}

	public void setIsVisibilidadCeldaCancelarPresupuestoVentas(Boolean isVisibilidadCeldaCancelarPresupuestoVentas) {
		this.isVisibilidadCeldaCancelarPresupuestoVentas = isVisibilidadCeldaCancelarPresupuestoVentas;
	}

	public Boolean getIsVisibilidadCeldaGuardarPresupuestoVentas() {
		return isVisibilidadCeldaGuardarPresupuestoVentas;
	}

	public void setIsVisibilidadCeldaGuardarPresupuestoVentas(Boolean isVisibilidadCeldaGuardarPresupuestoVentas) {
		this.isVisibilidadCeldaGuardarPresupuestoVentas = isVisibilidadCeldaGuardarPresupuestoVentas;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPresupuestoVentas() {
		return isVisibilidadCeldaGuardarCambiosPresupuestoVentas;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPresupuestoVentas(Boolean isVisibilidadCeldaGuardarCambiosPresupuestoVentas) {
		this.isVisibilidadCeldaGuardarCambiosPresupuestoVentas = isVisibilidadCeldaGuardarCambiosPresupuestoVentas;
	}
		
	public PresupuestoVentasSessionBean getpresupuestoventasSessionBean() {
		return this.presupuestoventasSessionBean;
	}
	
	public void setpresupuestoventasSessionBean(PresupuestoVentasSessionBean presupuestoventasSessionBean) {
		this.presupuestoventasSessionBean=presupuestoventasSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCiudad() {
		return this.isVisibilidadFK_IdCiudad;
	}

	public void setisVisibilidadFK_IdCiudad(Boolean isVisibilidadFK_IdCiudad) {
		this.isVisibilidadFK_IdCiudad=isVisibilidadFK_IdCiudad;
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

	public Boolean getisVisibilidadFK_IdPais() {
		return this.isVisibilidadFK_IdPais;
	}

	public void setisVisibilidadFK_IdPais(Boolean isVisibilidadFK_IdPais) {
		this.isVisibilidadFK_IdPais=isVisibilidadFK_IdPais;
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

	public Boolean getisVisibilidadFK_IdVendedor() {
		return this.isVisibilidadFK_IdVendedor;
	}

	public void setisVisibilidadFK_IdVendedor(Boolean isVisibilidadFK_IdVendedor) {
		this.isVisibilidadFK_IdVendedor=isVisibilidadFK_IdVendedor;
	}

	public Boolean getisVisibilidadFK_IdZona() {
		return this.isVisibilidadFK_IdZona;
	}

	public void setisVisibilidadFK_IdZona(Boolean isVisibilidadFK_IdZona) {
		this.isVisibilidadFK_IdZona=isVisibilidadFK_IdZona;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(PresupuestoVentas presupuestoventas)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(presupuestoventas,null);
				this.setActualParaGuardarSucursalForeignKey(presupuestoventas,null);
				this.setActualParaGuardarEjercicioForeignKey(presupuestoventas,null);
				this.setActualParaGuardarPeriodoForeignKey(presupuestoventas,null);
				this.setActualParaGuardarVendedorForeignKey(presupuestoventas,null);
				this.setActualParaGuardarPaisForeignKey(presupuestoventas,null);
				this.setActualParaGuardarCiudadForeignKey(presupuestoventas,null);
				this.setActualParaGuardarZonaForeignKey(presupuestoventas,null);
				this.setActualParaGuardarProductoForeignKey(presupuestoventas,null);
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
	
	public void bugActualizarReferenciaActual(PresupuestoVentas presupuestoventas,PresupuestoVentas presupuestoventasAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPresupuestoVentas(presupuestoventas);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		presupuestoventasAux.setId(presupuestoventas.getId());
		presupuestoventasAux.setVersionRow(presupuestoventas.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessPresupuestoVentas();
		
			int intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventas =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.presupuestoventas =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PresupuestoVentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.presupuestoventas,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = presupuestoventasValidator.getInvalidValues(this.presupuestoventas);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			presupuestoventasLogic.setDatosCliente(datosCliente);
			presupuestoventasLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				presupuestoventasAux=new  PresupuestoVentas();
				
				presupuestoventasAux.setIsNew(true);
				presupuestoventasAux.setIsChanged(true);
				
				presupuestoventasAux.setPresupuestoVentasOriginal(this.presupuestoventas);
				
				presupuestoventasAux.setId(this.presupuestoventas.getId());	
				presupuestoventasAux.setVersionRow(this.presupuestoventas.getVersionRow());	
				presupuestoventasAux.setid_empresa(this.presupuestoventas.getid_empresa());	
				presupuestoventasAux.setid_sucursal(this.presupuestoventas.getid_sucursal());	
				presupuestoventasAux.setid_ejercicio(this.presupuestoventas.getid_ejercicio());	
				presupuestoventasAux.setid_periodo(this.presupuestoventas.getid_periodo());	
				presupuestoventasAux.setid_vendedor(this.presupuestoventas.getid_vendedor());	
				presupuestoventasAux.setid_pais(this.presupuestoventas.getid_pais());	
				presupuestoventasAux.setid_ciudad(this.presupuestoventas.getid_ciudad());	
				
				if(this.presupuestoventas.getid_zona()!=null && this.presupuestoventas.getid_zona()>0L) {
					presupuestoventasAux.setid_zona(this.presupuestoventas.getid_zona());
				} else {
					presupuestoventasAux.setid_zona(null);
				}	
				presupuestoventasAux.setid_producto(this.presupuestoventas.getid_producto());	
				presupuestoventasAux.setprecio(this.presupuestoventas.getprecio());	
				presupuestoventasAux.setcantidad(this.presupuestoventas.getcantidad());	
				presupuestoventasAux.setvalor(this.presupuestoventas.getvalor());	
				presupuestoventasAux.setporcentaje(this.presupuestoventas.getporcentaje());	
				presupuestoventasAux.setcantidad_total(this.presupuestoventas.getcantidad_total());	
				presupuestoventasAux.setvalor_total(this.presupuestoventas.getvalor_total());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.presupuestoventasSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.presupuestoventasSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(presupuestoventasAux,presupuestoventasLogic.getPresupuestoVentass());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presupuestoventasAux,presupuestoventass);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.presupuestoventasSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.presupuestoventasSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoventasLogic.savePresupuestoVentass();//WithConnection
						//presupuestoventasLogic.getSetVersionRowPresupuestoVentass();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.presupuestoventas,presupuestoventasAux);
					
					this.refrescarForeignKeysDescripcionesPresupuestoVentas();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.presupuestoventasSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								presupuestoventasLogic.savePresupuestoVentasRelaciones(presupuestoventasAux);//WithConnection
								//presupuestoventasLogic.getSetVersionRowPresupuestoVentass();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.presupuestoventas,presupuestoventasAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.presupuestoventasSessionBean.getEstaModoGuardarRelaciones() 
									|| this.presupuestoventasSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(presupuestoventasAux,presupuestoventasLogic.getPresupuestoVentass());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(presupuestoventasAux,presupuestoventass);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.presupuestoventas,presupuestoventasAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				presupuestoventasAux=new  PresupuestoVentas();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.presupuestoventasSessionBean.getEsGuardarRelacionado() 
					|| (this.presupuestoventasSessionBean.getEsGuardarRelacionado() && this.presupuestoventas.getId()>=0)) {
						
					presupuestoventasAux.setIsNew(false);
				}
				
				presupuestoventasAux.setIsDeleted(false);
			
				presupuestoventasAux.setId(this.presupuestoventas.getId());	
				presupuestoventasAux.setVersionRow(this.presupuestoventas.getVersionRow());	
				presupuestoventasAux.setid_empresa(this.presupuestoventas.getid_empresa());	
				presupuestoventasAux.setid_sucursal(this.presupuestoventas.getid_sucursal());	
				presupuestoventasAux.setid_ejercicio(this.presupuestoventas.getid_ejercicio());	
				presupuestoventasAux.setid_periodo(this.presupuestoventas.getid_periodo());	
				presupuestoventasAux.setid_vendedor(this.presupuestoventas.getid_vendedor());	
				presupuestoventasAux.setid_pais(this.presupuestoventas.getid_pais());	
				presupuestoventasAux.setid_ciudad(this.presupuestoventas.getid_ciudad());	
				
				if(this.presupuestoventas.getid_zona()!=null && this.presupuestoventas.getid_zona()>0L) {
					presupuestoventasAux.setid_zona(this.presupuestoventas.getid_zona());
				} else {
					presupuestoventasAux.setid_zona(null);
				}	
				presupuestoventasAux.setid_producto(this.presupuestoventas.getid_producto());	
				presupuestoventasAux.setprecio(this.presupuestoventas.getprecio());	
				presupuestoventasAux.setcantidad(this.presupuestoventas.getcantidad());	
				presupuestoventasAux.setvalor(this.presupuestoventas.getvalor());	
				presupuestoventasAux.setporcentaje(this.presupuestoventas.getporcentaje());	
				presupuestoventasAux.setcantidad_total(this.presupuestoventas.getcantidad_total());	
				presupuestoventasAux.setvalor_total(this.presupuestoventas.getvalor_total());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(presupuestoventasAux,presupuestoventasLogic.getPresupuestoVentass());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presupuestoventasAux,presupuestoventass);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.presupuestoventasSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.presupuestoventasSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoventasLogic.savePresupuestoVentass();//WithConnection
						//presupuestoventasLogic.getSetVersionRowPresupuestoVentass();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.presupuestoventas,presupuestoventasAux);
					
					this.refrescarForeignKeysDescripcionesPresupuestoVentas();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.presupuestoventasSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								presupuestoventasLogic.savePresupuestoVentasRelaciones(presupuestoventasAux);//WithConnection
								//presupuestoventasLogic.getSetVersionRowPresupuestoVentass();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.presupuestoventas,presupuestoventasAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.presupuestoventasSessionBean.getEstaModoGuardarRelaciones() 
									|| this.presupuestoventasSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(presupuestoventasAux,presupuestoventasLogic.getPresupuestoVentass());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(presupuestoventasAux,presupuestoventass);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.presupuestoventas,presupuestoventasAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				presupuestoventasAux=new  PresupuestoVentas();
				
				presupuestoventasAux.setIsNew(false);
				presupuestoventasAux.setIsChanged(false);
				
				presupuestoventasAux.setIsDeleted(true);
				
				presupuestoventasAux.setId(this.presupuestoventas.getId());	
				presupuestoventasAux.setVersionRow(this.presupuestoventas.getVersionRow());	
				presupuestoventasAux.setid_empresa(this.presupuestoventas.getid_empresa());	
				presupuestoventasAux.setid_sucursal(this.presupuestoventas.getid_sucursal());	
				presupuestoventasAux.setid_ejercicio(this.presupuestoventas.getid_ejercicio());	
				presupuestoventasAux.setid_periodo(this.presupuestoventas.getid_periodo());	
				presupuestoventasAux.setid_vendedor(this.presupuestoventas.getid_vendedor());	
				presupuestoventasAux.setid_pais(this.presupuestoventas.getid_pais());	
				presupuestoventasAux.setid_ciudad(this.presupuestoventas.getid_ciudad());	
				
				if(this.presupuestoventas.getid_zona()!=null && this.presupuestoventas.getid_zona()>0L) {
					presupuestoventasAux.setid_zona(this.presupuestoventas.getid_zona());
				} else {
					presupuestoventasAux.setid_zona(null);
				}	
				presupuestoventasAux.setid_producto(this.presupuestoventas.getid_producto());	
				presupuestoventasAux.setprecio(this.presupuestoventas.getprecio());	
				presupuestoventasAux.setcantidad(this.presupuestoventas.getcantidad());	
				presupuestoventasAux.setvalor(this.presupuestoventas.getvalor());	
				presupuestoventasAux.setporcentaje(this.presupuestoventas.getporcentaje());	
				presupuestoventasAux.setcantidad_total(this.presupuestoventas.getcantidad_total());	
				presupuestoventasAux.setvalor_total(this.presupuestoventas.getvalor_total());	
				
				if(this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.presupuestoventasAux.getId()>=0) {	
						this.presupuestoventassEliminados.add(presupuestoventasAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(presupuestoventasAux,presupuestoventasLogic.getPresupuestoVentass());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presupuestoventasAux,presupuestoventass);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.presupuestoventasSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.presupuestoventasSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoventasLogic.savePresupuestoVentass();//WithConnection
						//presupuestoventasLogic.getSetVersionRowPresupuestoVentass();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.presupuestoventasSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								presupuestoventasLogic.savePresupuestoVentasRelaciones(presupuestoventasAux);//WithConnection
								//presupuestoventasLogic.getSetVersionRowPresupuestoVentass();//WithConnection
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
							if(this.presupuestoventasSessionBean.getEstaModoGuardarRelaciones() 
								|| this.presupuestoventasSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(presupuestoventasAux,presupuestoventasLogic.getPresupuestoVentass());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(presupuestoventasAux,presupuestoventass);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.getPresupuestoVentass().addAll(this.presupuestoventassEliminados);
					
					presupuestoventasLogic.savePresupuestoVentass();//WithConnection
					//presupuestoventasLogic.getSetVersionRowPresupuestoVentass();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesPresupuestoVentas();
				
				this.presupuestoventassEliminados= new ArrayList<PresupuestoVentas>();		
			}
			
			if(this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Presupuesto Ventas GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Presupuesto Ventas",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.presupuestoventas=presupuestoventasAux;
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
      		//this.finishProcessPresupuestoVentas();
      	}
		
	}	
	
	public void actualizarRelaciones(PresupuestoVentas presupuestoventasLocal) throws Exception {
		
		if(this.presupuestoventasSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PresupuestoVentas presupuestoventasLocal) throws Exception {	
		if(this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				presupuestoventasLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				presupuestoventasLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				presupuestoventasLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				presupuestoventasLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(VendedorDetalleFormJInternalFrame.class)) {
				VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrameLocal=(VendedorBeanSwingJInternalFrame) ((VendedorDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				vendedorBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoVendedor(vendedorBeanSwingJInternalFrameLocal.getvendedor(),true);
				vendedorBeanSwingJInternalFrameLocal.actualizarLista(vendedorBeanSwingJInternalFrameLocal.vendedor,this.vendedorsForeignKey);

				vendedorBeanSwingJInternalFrameLocal.actualizarRelaciones(vendedorBeanSwingJInternalFrameLocal.vendedor);

				presupuestoventasLocal.setVendedor(vendedorBeanSwingJInternalFrameLocal.vendedor);

				this.addItemDefectoCombosForeignKeyVendedor();
				this.cargarCombosFrameVendedorsForeignKey("Formulario");
				this.setActualVendedorForeignKey(vendedorBeanSwingJInternalFrameLocal.vendedor.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PaisDetalleFormJInternalFrame.class)) {
				PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrameLocal=(PaisBeanSwingJInternalFrame) ((PaisDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				paisBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPais(paisBeanSwingJInternalFrameLocal.getpais(),true);
				paisBeanSwingJInternalFrameLocal.actualizarLista(paisBeanSwingJInternalFrameLocal.pais,this.paissForeignKey);

				paisBeanSwingJInternalFrameLocal.actualizarRelaciones(paisBeanSwingJInternalFrameLocal.pais);

				presupuestoventasLocal.setPais(paisBeanSwingJInternalFrameLocal.pais);

				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey("Formulario");
				this.setActualPaisForeignKey(paisBeanSwingJInternalFrameLocal.pais.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CiudadDetalleFormJInternalFrame.class)) {
				CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrameLocal=(CiudadBeanSwingJInternalFrame) ((CiudadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ciudadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCiudad(ciudadBeanSwingJInternalFrameLocal.getciudad(),true);
				ciudadBeanSwingJInternalFrameLocal.actualizarLista(ciudadBeanSwingJInternalFrameLocal.ciudad,this.ciudadsForeignKey);

				ciudadBeanSwingJInternalFrameLocal.actualizarRelaciones(ciudadBeanSwingJInternalFrameLocal.ciudad);

				presupuestoventasLocal.setCiudad(ciudadBeanSwingJInternalFrameLocal.ciudad);

				this.addItemDefectoCombosForeignKeyCiudad();
				this.cargarCombosFrameCiudadsForeignKey("Formulario");
				this.setActualCiudadForeignKey(ciudadBeanSwingJInternalFrameLocal.ciudad.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ZonaDetalleFormJInternalFrame.class)) {
				ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrameLocal=(ZonaBeanSwingJInternalFrame) ((ZonaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				zonaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoZona(zonaBeanSwingJInternalFrameLocal.getzona(),true);
				zonaBeanSwingJInternalFrameLocal.actualizarLista(zonaBeanSwingJInternalFrameLocal.zona,this.zonasForeignKey);

				zonaBeanSwingJInternalFrameLocal.actualizarRelaciones(zonaBeanSwingJInternalFrameLocal.zona);

				presupuestoventasLocal.setZona(zonaBeanSwingJInternalFrameLocal.zona);

				this.addItemDefectoCombosForeignKeyZona();
				this.cargarCombosFrameZonasForeignKey("Formulario");
				this.setActualZonaForeignKey(zonaBeanSwingJInternalFrameLocal.zona.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				presupuestoventasLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPresupuestoVentasActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.presupuestoventas =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.presupuestoventas =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = presupuestoventasValidator.getInvalidValues(this.presupuestoventas);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PresupuestoVentas presupuestoventas,List<PresupuestoVentas> presupuestoventass) throws Exception {
		try	{		
			PresupuestoVentasConstantesFunciones.actualizarLista(presupuestoventas,presupuestoventass,this.presupuestoventasSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(PresupuestoVentas presupuestoventas,List<PresupuestoVentas> presupuestoventass) throws Exception {
		try	{			
			PresupuestoVentasConstantesFunciones.actualizarSelectedLista(presupuestoventas,presupuestoventass);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PresupuestoVentas> presupuestoventassLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				presupuestoventassLocal=this.presupuestoventasLogic.getPresupuestoVentass();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				presupuestoventassLocal=this.presupuestoventass;
			}
			//ARCHITECTURE
		
			for(PresupuestoVentas presupuestoventasLocal:presupuestoventassLocal) {
				if(this.permiteMantenimiento(presupuestoventasLocal) && presupuestoventasLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PresupuestoVentasConstantesFunciones.getPresupuestoVentasLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PresupuestoVentasConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoVentas.jLabelid_empresaPresupuestoVentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoVentasConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoVentas.jLabelid_sucursalPresupuestoVentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoVentasConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoVentas.jLabelid_ejercicioPresupuestoVentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoVentasConstantesFunciones.IDPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoVentas.jLabelid_periodoPresupuestoVentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoVentasConstantesFunciones.IDVENDEDOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoVentas.jLabelid_vendedorPresupuestoVentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoVentasConstantesFunciones.IDPAIS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoVentas.jLabelid_paisPresupuestoVentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoVentasConstantesFunciones.IDCIUDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoVentas.jLabelid_ciudadPresupuestoVentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoVentasConstantesFunciones.IDZONA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoVentas.jLabelid_zonaPresupuestoVentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoVentasConstantesFunciones.IDPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoVentas.jLabelid_productoPresupuestoVentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoVentasConstantesFunciones.PRECIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoVentas.jLabelprecioPresupuestoVentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoVentasConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoVentas.jLabelcantidadPresupuestoVentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoVentasConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoVentas.jLabelvalorPresupuestoVentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoVentasConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoVentas.jLabelporcentajePresupuestoVentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoVentasConstantesFunciones.CANTIDADTOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoVentas.jLabelcantidad_totalPresupuestoVentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoVentasConstantesFunciones.VALORTOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoVentas.jLabelvalor_totalPresupuestoVentas,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoVentas.jLabelid_empresaPresupuestoVentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoVentas.jLabelid_sucursalPresupuestoVentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoVentas.jLabelid_ejercicioPresupuestoVentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoVentas.jLabelid_periodoPresupuestoVentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoVentas.jLabelid_vendedorPresupuestoVentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoVentas.jLabelid_paisPresupuestoVentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoVentas.jLabelid_ciudadPresupuestoVentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoVentas.jLabelid_zonaPresupuestoVentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoVentas.jLabelid_productoPresupuestoVentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoVentas.jLabelprecioPresupuestoVentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoVentas.jLabelcantidadPresupuestoVentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoVentas.jLabelvalorPresupuestoVentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoVentas.jLabelporcentajePresupuestoVentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoVentas.jLabelcantidad_totalPresupuestoVentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoVentas.jLabelvalor_totalPresupuestoVentas,"");
		
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
		this.iIdNuevoPresupuestoVentas--;	
		
		
		this.presupuestoventasAux=new PresupuestoVentas();
		
		this.presupuestoventasAux.setId(this.iIdNuevoPresupuestoVentas);
		this.presupuestoventasAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.presupuestoventasLogic.getPresupuestoVentass().add(this.presupuestoventasAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.presupuestoventass.add(this.presupuestoventasAux);
		}
		//ARCHITECTURE
		
		this.presupuestoventas=this.presupuestoventasAux;
		
		if(PresupuestoVentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPresupuestoVentas(this.presupuestoventas);
			this.setVariablesObjetoActualToFormularioForeignKeyPresupuestoVentas(this.presupuestoventas);
		}
				
		//this.setDefaultControlesPresupuestoVentas();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPresupuestoVentas();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPresupuestoVentas();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPresupuestoVentas();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPresupuestoVentas(this.presupuestoventasBean,this.presupuestoventas,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(PresupuestoVentasConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.presupuestoventasSessionBean.getConGuardarRelaciones()) {
			classes=PresupuestoVentasConstantesFunciones.getClassesRelationshipsOfPresupuestoVentas(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.presupuestoventasReturnGeneral=presupuestoventasLogic.procesarEventosPresupuestoVentassWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.presupuestoventasLogic.getPresupuestoVentass(),this.presupuestoventas,this.presupuestoventasParameterGeneral,this.isEsNuevoPresupuestoVentas,classes);//this.presupuestoventasLogic.getPresupuestoVentas()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPresupuestoVentas(this.presupuestoventasReturnGeneral,this.presupuestoventasBean,false);
		
		if(this.presupuestoventasReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPresupuestoVentas(this.presupuestoventasReturnGeneral.getPresupuestoVentas());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPresupuestoVentas(this.presupuestoventasReturnGeneral.getPresupuestoVentas());
		}
		
		if(this.presupuestoventasReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPresupuestoVentas(this.presupuestoventasReturnGeneral.getPresupuestoVentas(),classes);//this.presupuestoventasBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.presupuestoventas,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPresupuestoVentas();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPresupuestoVentas();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PresupuestoVentasBeanSwingJInternalFrameAdditional.RecargarFormPresupuestoVentas(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPresupuestoVentas(false);
						
			if(presupuestoventasSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(PresupuestoVentasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPresupuestoVentas();
			}
			
			this.actualizarVisualTableDatosPresupuestoVentas();
			
			this.jTableDatosPresupuestoVentas.setRowSelectionInterval(this.getIndiceNuevoPresupuestoVentas(), this.getIndiceNuevoPresupuestoVentas());
			
			this.seleccionarFilaTablaPresupuestoVentasActual();
						
			this.actualizarEstadoCeldasBotonesPresupuestoVentas("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPresupuestoVentas(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldprecioPresupuestoVentas.setEnabled(isHabilitar && this.presupuestoventasConstantesFunciones.activarprecioPresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldcantidadPresupuestoVentas.setEnabled(isHabilitar && this.presupuestoventasConstantesFunciones.activarcantidadPresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldvalorPresupuestoVentas.setEnabled(isHabilitar && this.presupuestoventasConstantesFunciones.activarvalorPresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldporcentajePresupuestoVentas.setEnabled(isHabilitar && this.presupuestoventasConstantesFunciones.activarporcentajePresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldcantidad_totalPresupuestoVentas.setEnabled(isHabilitar && this.presupuestoventasConstantesFunciones.activarcantidad_totalPresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldvalor_totalPresupuestoVentas.setEnabled(isHabilitar && this.presupuestoventasConstantesFunciones.activarvalor_totalPresupuestoVentas);	
		//
		this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_empresaPresupuestoVentas.setEnabled(isHabilitar && this.presupuestoventasConstantesFunciones.activarid_empresaPresupuestoVentas);//
		this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_sucursalPresupuestoVentas.setEnabled(isHabilitar && this.presupuestoventasConstantesFunciones.activarid_sucursalPresupuestoVentas);//
		this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_ejercicioPresupuestoVentas.setEnabled(isHabilitar && this.presupuestoventasConstantesFunciones.activarid_ejercicioPresupuestoVentas);//
		this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_periodoPresupuestoVentas.setEnabled(isHabilitar && this.presupuestoventasConstantesFunciones.activarid_periodoPresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_vendedorPresupuestoVentas.setEnabled(isHabilitar && this.presupuestoventasConstantesFunciones.activarid_vendedorPresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_paisPresupuestoVentas.setEnabled(isHabilitar && this.presupuestoventasConstantesFunciones.activarid_paisPresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_ciudadPresupuestoVentas.setEnabled(isHabilitar && this.presupuestoventasConstantesFunciones.activarid_ciudadPresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_zonaPresupuestoVentas.setEnabled(isHabilitar && this.presupuestoventasConstantesFunciones.activarid_zonaPresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_productoPresupuestoVentas.setEnabled(isHabilitar && this.presupuestoventasConstantesFunciones.activarid_productoPresupuestoVentas);
	};
	
	public void setDefaultControlesPresupuestoVentas() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPresupuestoVentas(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.presupuestoventasSessionBean.setConGuardarRelaciones(true);			
			this.presupuestoventasSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPresupuestoVentas.jTabbedPaneRelacionesPresupuestoVentas.setVisible(true);
			
					
		} else {
			//this.presupuestoventasSessionBean.setConGuardarRelaciones(false);			
			this.presupuestoventasSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPresupuestoVentas.jTabbedPaneRelacionesPresupuestoVentas.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoPresupuestoVentas() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresupuestoVentas presupuestoventasAux:this.presupuestoventasLogic.getPresupuestoVentass()) {
				if(presupuestoventasAux.getId().equals(this.iIdNuevoPresupuestoVentas)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresupuestoVentas presupuestoventasAux:this.presupuestoventass) {
				if(presupuestoventasAux.getId().equals(this.iIdNuevoPresupuestoVentas)) {
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
	
	public int getIndiceActualPresupuestoVentas(PresupuestoVentas presupuestoventas,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresupuestoVentas presupuestoventasAux:this.presupuestoventasLogic.getPresupuestoVentass()) {
				if(presupuestoventasAux.getId().equals(presupuestoventas.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresupuestoVentas presupuestoventasAux:this.presupuestoventass) {
				if(presupuestoventasAux.getId().equals(presupuestoventas.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPresupuestoVentas(PresupuestoVentas presupuestoventasOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresupuestoVentas presupuestoventasAux:this.presupuestoventasLogic.getPresupuestoVentass()) {
				if(presupuestoventasAux.getPresupuestoVentasOriginal().getId().equals(presupuestoventasOriginal.getId())) {
					existe=true;
					presupuestoventasOriginal.setId(presupuestoventasAux.getId());
					presupuestoventasOriginal.setVersionRow(presupuestoventasAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresupuestoVentas presupuestoventasAux:this.presupuestoventass) {
				if(presupuestoventasAux.getPresupuestoVentasOriginal().getId().equals(presupuestoventasOriginal.getId())) {
					existe=true;
					presupuestoventasOriginal.setId(presupuestoventasAux.getId());
					presupuestoventasOriginal.setVersionRow(presupuestoventasAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPresupuestoVentas(Boolean esParaCancelar) throws Exception {
		presupuestoventassAux=new ArrayList<PresupuestoVentas>();
		presupuestoventasAux=new PresupuestoVentas();
		
		if(!this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PresupuestoVentas presupuestoventasAux:this.presupuestoventasLogic.getPresupuestoVentass()) {
					if(presupuestoventasAux.getId()<0) {
						presupuestoventassAux.add(presupuestoventasAux);
					}		
				}
				this.iIdNuevoPresupuestoVentas=0L;
				this.presupuestoventasLogic.getPresupuestoVentass().removeAll(presupuestoventassAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresupuestoVentas presupuestoventasAux:this.presupuestoventass) {
					if(presupuestoventasAux.getId()<0) {
						presupuestoventassAux.add(presupuestoventasAux);
					}		
				}
				this.iIdNuevoPresupuestoVentas=0L;
				this.presupuestoventass.removeAll(presupuestoventassAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPresupuestoVentas 
					&& this.presupuestoventasLogic.getPresupuestoVentass().size()>0
					) {
					presupuestoventasAux=this.presupuestoventasLogic.getPresupuestoVentass().get(this.presupuestoventasLogic.getPresupuestoVentass().size() - 1);
				
					if(presupuestoventasAux.getId()<0) {
						this.presupuestoventasLogic.getPresupuestoVentass().remove(presupuestoventasAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPresupuestoVentas && this.presupuestoventass.size()>0) {
					presupuestoventasAux=this.presupuestoventass.get(this.presupuestoventass.size() - 1);
				
					if(presupuestoventasAux.getId()<0) {
						this.presupuestoventass.remove(presupuestoventasAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPresupuestoVentas(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(presupuestoventas.getId()<0) {
				this.presupuestoventasLogic.getPresupuestoVentass().remove(this.presupuestoventas);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(presupuestoventas.getId()<0) {
				this.presupuestoventass.remove(this.presupuestoventas);
			}
		}			
	}
	
	public void setEstadosInicialesPresupuestoVentas(List<PresupuestoVentas> presupuestoventassAux) throws Exception {
		PresupuestoVentasConstantesFunciones.setEstadosInicialesPresupuestoVentas(presupuestoventassAux);
	}
	
	public void setEstadosInicialesPresupuestoVentas(PresupuestoVentas presupuestoventasAux) throws Exception {
		PresupuestoVentasConstantesFunciones.setEstadosInicialesPresupuestoVentas(presupuestoventasAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPresupuestoVentasActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPresupuestoVentas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPresupuestoVentasActual()) {
				if(!this.isEsNuevoPresupuestoVentas) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPresupuestoVentas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPresupuestoVentas=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPresupuestoVentasActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Presupuesto Ventas ?", "MANTENIMIENTO DE Presupuesto Ventas", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPresupuestoVentas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PresupuestoVentas presupuestoventas) throws Exception {
		PresupuestoVentasConstantesFunciones.seleccionarAsignar(this.presupuestoventas,presupuestoventas);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPresupuestoVentas=this.isPermisoActualizarOriginalPresupuestoVentas;
			
			
			this.seleccionarAsignar(presupuestoventas);
			
			

			idProductoActual=presupuestoventas.getid_producto();
			this.seleccionarProductoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PresupuestoVentasConstantesFunciones.quitarEspaciosPresupuestoVentas(this.presupuestoventas,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesPresupuestoVentas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.presupuestoventasSessionBean.setsFuncionBusquedaRapida(this.presupuestoventasSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoPresupuestoVentas) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPresupuestoVentas(esParaCancelar);				
				this.cancelarNuevoPresupuestoVentas(esParaCancelar);								
			}
			
			this.presupuestoventas=new PresupuestoVentas();
			
			this.inicializarPresupuestoVentas();
			
			this.actualizarEstadoCeldasBotonesPresupuestoVentas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPresupuestoVentas() throws Exception {
		try {
			PresupuestoVentasConstantesFunciones.inicializarPresupuestoVentas(this.presupuestoventas);
			
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
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.presupuestoventasLogic.getPresupuestoVentass().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePresupuestoVentass(String sAccionBusqueda,List<PresupuestoVentas> presupuestoventassParaReportes) throws Exception {
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
					sPathReporteFinal="PresupuestoVentas"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PresupuestoVentasMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PresupuestoVentasMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PresupuestoVentas"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Presupuesto Ventases");		
		parameters.put("busquedapor", PresupuestoVentasConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePresupuestoVentas=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PresupuestoVentasConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PresupuestoVentasConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePresupuestoVentas=new JRBeanArrayDataSource(PresupuestoVentasJInternalFrame.TraerPresupuestoVentasBeans(presupuestoventassParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePresupuestoVentas);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PresupuestoVentasConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PresupuestoVentasConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PresupuestoVentasBean.TraerPresupuestoVentasBeans(presupuestoventassParaReportes).toArray()));
							
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
				this.generarExcelReportePresupuestoVentass(sAccionBusqueda,sTipoArchivoReporte,presupuestoventassParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPresupuestoVentass(sAccionBusqueda,sTipoArchivoReporte,presupuestoventassParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPresupuestoVentasActionPerformed(null);
					//this.generarExcelReportePresupuestoVentass(sAccionBusqueda,sTipoArchivoReporte,presupuestoventassParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPresupuestoVentass(sAccionBusqueda,sTipoArchivoReporte,presupuestoventassParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPresupuestoVentass(sAccionBusqueda,sTipoArchivoReporte,presupuestoventassParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPresupuestoVentass(sAccionBusqueda,sTipoArchivoReporte,presupuestoventassParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePresupuestoVentass(String sAccionBusqueda,String sTipoArchivoReporte,List<PresupuestoVentas> presupuestoventassParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestoventas";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PresupuestoVentass");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPresupuestoVentas("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PresupuestoVentas presupuestoventas : presupuestoventassParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PresupuestoVentasConstantesFunciones.generarExcelReporteDataPresupuestoVentas("NORMAL",row,workbook,presupuestoventas,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuesto Ventas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPresupuestoVentas(String sTipo,Row row,Workbook workbook) {
		
		PresupuestoVentasConstantesFunciones.generarExcelReporteHeaderPresupuestoVentas(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPresupuestoVentass(String sAccionBusqueda,String sTipoArchivoReporte,List<PresupuestoVentas> presupuestoventassParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestoventas_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PresupuestoVentass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PresupuestoVentas presupuestoventas : presupuestoventassParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PresupuestoVentasConstantesFunciones.getPresupuestoVentasDescripcion(presupuestoventas));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoVentasConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoventas.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoVentasConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoventas.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoVentasConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoventas.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoVentasConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoventas.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoVentasConstantesFunciones.LABEL_IDVENDEDOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_IDVENDEDOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoventas.getvendedor_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoVentasConstantesFunciones.LABEL_IDPAIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_IDPAIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoventas.getpais_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoVentasConstantesFunciones.LABEL_IDCIUDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_IDCIUDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoventas.getciudad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoVentasConstantesFunciones.LABEL_IDZONA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_IDZONA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoventas.getzona_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoVentasConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoventas.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoVentasConstantesFunciones.LABEL_PRECIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_PRECIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoventas.getprecio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoVentasConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoventas.getcantidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoVentasConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoventas.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoVentasConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoventas.getporcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoVentasConstantesFunciones.LABEL_CANTIDADTOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_CANTIDADTOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoventas.getcantidad_total());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoVentasConstantesFunciones.LABEL_VALORTOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_VALORTOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoventas.getvalor_total());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuesto Ventas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPresupuestoVentass(String sAccionBusqueda,String sTipoArchivoReporte,List<PresupuestoVentas> presupuestoventassParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PresupuestoVentas> presupuestoventassRespaldo=null;
		
		classes=PresupuestoVentasConstantesFunciones.getClassesRelationshipsOfPresupuestoVentas(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.presupuestoventasLogic.setDatosCliente(this.datosCliente);
		this.presupuestoventasLogic.setDatosDeep(this.datosDeep);
		this.presupuestoventasLogic.setIsConDeep(true);
		
		presupuestoventassRespaldo=this.presupuestoventasLogic.getPresupuestoVentass();
		
		this.presupuestoventasLogic.setPresupuestoVentass(presupuestoventassParaReportes);	
		this.presupuestoventasLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		presupuestoventassParaReportes=this.presupuestoventasLogic.getPresupuestoVentass();
		this.presupuestoventasLogic.setPresupuestoVentass(presupuestoventassRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestoventas_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PresupuestoVentass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPresupuestoVentas("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PresupuestoVentas presupuestoventas : presupuestoventassParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPresupuestoVentas("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PresupuestoVentasConstantesFunciones.generarExcelReporteDataPresupuestoVentas("NORMAL",row,workbook,presupuestoventas,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(PresupuestoVentasConstantesFunciones.getPresupuestoVentasDescripcion(presupuestoventas));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuesto Ventas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPresupuestoVentas.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresupuestoVentas.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPresupuestoVentas.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresupuestoVentas.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPresupuestoVentas() throws Exception {		
		this.startProcessPresupuestoVentas(true);
	}
	
	public void startProcessPresupuestoVentas(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPresupuestoVentas ,this.jPanelParametrosReportesPresupuestoVentas, this.jScrollPanelDatosPresupuestoVentas,this.jPanelPaginacionPresupuestoVentas, this.jScrollPanelDatosEdicionPresupuestoVentas, this.jPanelAccionesPresupuestoVentas,this.jPanelAccionesFormularioPresupuestoVentas,this.jmenuBarPresupuestoVentas,this.jmenuBarDetallePresupuestoVentas,this.jTtoolBarPresupuestoVentas,this.jTtoolBarDetallePresupuestoVentas);		
		
		final JTabbedPane jTabbedPaneBusquedasPresupuestoVentas=this.jTabbedPaneBusquedasPresupuestoVentas; 
		
		final JPanel jPanelParametrosReportesPresupuestoVentas=this.jPanelParametrosReportesPresupuestoVentas;
		//final JScrollPane jScrollPanelDatosPresupuestoVentas=this.jScrollPanelDatosPresupuestoVentas;
		final JTable jTableDatosPresupuestoVentas=this.jTableDatosPresupuestoVentas;		
		final JPanel jPanelPaginacionPresupuestoVentas=this.jPanelPaginacionPresupuestoVentas;
		//final JScrollPane jScrollPanelDatosEdicionPresupuestoVentas=this.jScrollPanelDatosEdicionPresupuestoVentas;
		final JPanel jPanelAccionesPresupuestoVentas=this.jPanelAccionesPresupuestoVentas;
		
		JPanel jPanelCamposAuxiliarPresupuestoVentas=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPresupuestoVentas=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
			jPanelCamposAuxiliarPresupuestoVentas=this.jInternalFrameDetalleFormPresupuestoVentas.jPanelCamposPresupuestoVentas;
			jPanelAccionesFormularioAuxiliarPresupuestoVentas=this.jInternalFrameDetalleFormPresupuestoVentas.jPanelAccionesFormularioPresupuestoVentas;
		}
		
		final JPanel jPanelCamposPresupuestoVentas=jPanelCamposAuxiliarPresupuestoVentas;
		final JPanel jPanelAccionesFormularioPresupuestoVentas=jPanelAccionesFormularioAuxiliarPresupuestoVentas;
		
		
		final JMenuBar jmenuBarPresupuestoVentas=this.jmenuBarPresupuestoVentas;
		final JToolBar jTtoolBarPresupuestoVentas=this.jTtoolBarPresupuestoVentas;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPresupuestoVentas=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPresupuestoVentas=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
			jmenuBarDetalleAuxiliarPresupuestoVentas=this.jInternalFrameDetalleFormPresupuestoVentas.jmenuBarDetallePresupuestoVentas;
			jTtoolBarDetalleAuxiliarPresupuestoVentas=this.jInternalFrameDetalleFormPresupuestoVentas.jTtoolBarDetallePresupuestoVentas;
		}
		
		final JMenuBar jmenuBarDetallePresupuestoVentas=jmenuBarDetalleAuxiliarPresupuestoVentas;
		final JToolBar jTtoolBarDetallePresupuestoVentas=jTtoolBarDetalleAuxiliarPresupuestoVentas;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPresupuestoVentas;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPresupuestoVentas;
			processRunnable.jTableDatos=jTableDatosPresupuestoVentas;
			processRunnable.jPanelCampos=jPanelCamposPresupuestoVentas;
			processRunnable.jPanelPaginacion=jPanelPaginacionPresupuestoVentas;
			processRunnable.jPanelAcciones=jPanelAccionesPresupuestoVentas;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPresupuestoVentas;
			
			
			processRunnable.jmenuBar=jmenuBarPresupuestoVentas;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePresupuestoVentas;
			processRunnable.jTtoolBar=jTtoolBarPresupuestoVentas;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePresupuestoVentas;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPresupuestoVentas ,jPanelParametrosReportesPresupuestoVentas,jTableDatosPresupuestoVentas, /*jScrollPanelDatosPresupuestoVentas,*/jPanelCamposPresupuestoVentas,jPanelPaginacionPresupuestoVentas, /*jScrollPanelDatosEdicionPresupuestoVentas,*/ jPanelAccionesPresupuestoVentas,jPanelAccionesFormularioPresupuestoVentas,jmenuBarPresupuestoVentas,jmenuBarDetallePresupuestoVentas,jTtoolBarPresupuestoVentas,jTtoolBarDetallePresupuestoVentas);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPresupuestoVentas ,jPanelParametrosReportesPresupuestoVentas, jScrollPanelDatosPresupuestoVentas,jPanelPaginacionPresupuestoVentas, jScrollPanelDatosEdicionPresupuestoVentas, jPanelAccionesPresupuestoVentas,jPanelAccionesFormularioPresupuestoVentas,jmenuBarPresupuestoVentas,jmenuBarDetallePresupuestoVentas,jTtoolBarPresupuestoVentas,jTtoolBarDetallePresupuestoVentas);
						
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
	
	public void finishProcessPresupuestoVentas() {// throws Exception 
		this.finishProcessPresupuestoVentas(true);
	}
	
	public void finishProcessPresupuestoVentas(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPresupuestoVentas ,this.jPanelParametrosReportesPresupuestoVentas, this.jScrollPanelDatosPresupuestoVentas,this.jPanelPaginacionPresupuestoVentas, this.jScrollPanelDatosEdicionPresupuestoVentas, this.jPanelAccionesPresupuestoVentas,this.jPanelAccionesFormularioPresupuestoVentas,this.jmenuBarPresupuestoVentas,this.jmenuBarDetallePresupuestoVentas,this.jTtoolBarPresupuestoVentas,this.jTtoolBarDetallePresupuestoVentas);		
		
		final JTabbedPane jTabbedPaneBusquedasPresupuestoVentas=this.jTabbedPaneBusquedasPresupuestoVentas; 
		
		final JPanel jPanelParametrosReportesPresupuestoVentas=this.jPanelParametrosReportesPresupuestoVentas;
		//final JScrollPane jScrollPanelDatosPresupuestoVentas=this.jScrollPanelDatosPresupuestoVentas;
		final JTable jTableDatosPresupuestoVentas=this.jTableDatosPresupuestoVentas;		
		final JPanel jPanelPaginacionPresupuestoVentas=this.jPanelPaginacionPresupuestoVentas;
		//final JScrollPane jScrollPanelDatosEdicionPresupuestoVentas=this.jScrollPanelDatosEdicionPresupuestoVentas;
		final JPanel jPanelAccionesPresupuestoVentas=this.jPanelAccionesPresupuestoVentas;
		
		JPanel jPanelCamposAuxiliarPresupuestoVentas=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPresupuestoVentas=new JPanel();
		
		if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
			jPanelCamposAuxiliarPresupuestoVentas=this.jInternalFrameDetalleFormPresupuestoVentas.jPanelCamposPresupuestoVentas;
			jPanelAccionesFormularioAuxiliarPresupuestoVentas=this.jInternalFrameDetalleFormPresupuestoVentas.jPanelAccionesFormularioPresupuestoVentas;
		}
		
		final JPanel jPanelCamposPresupuestoVentas=jPanelCamposAuxiliarPresupuestoVentas;
		final JPanel jPanelAccionesFormularioPresupuestoVentas=jPanelAccionesFormularioAuxiliarPresupuestoVentas;
		
		
		final JMenuBar jmenuBarPresupuestoVentas=this.jmenuBarPresupuestoVentas;		
		final JToolBar jTtoolBarPresupuestoVentas=this.jTtoolBarPresupuestoVentas;
				
		JMenuBar jmenuBarDetalleAuxiliarPresupuestoVentas=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPresupuestoVentas=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
			jmenuBarDetalleAuxiliarPresupuestoVentas=this.jInternalFrameDetalleFormPresupuestoVentas.jmenuBarDetallePresupuestoVentas;
			jTtoolBarDetalleAuxiliarPresupuestoVentas=this.jInternalFrameDetalleFormPresupuestoVentas.jTtoolBarDetallePresupuestoVentas;		
		}
		
		final JMenuBar jmenuBarDetallePresupuestoVentas=jmenuBarDetalleAuxiliarPresupuestoVentas;
		final JToolBar jTtoolBarDetallePresupuestoVentas=jTtoolBarDetalleAuxiliarPresupuestoVentas;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPresupuestoVentas;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPresupuestoVentas;
			processRunnable.jTableDatos=jTableDatosPresupuestoVentas;
			processRunnable.jPanelCampos=jPanelCamposPresupuestoVentas;
			processRunnable.jPanelPaginacion=jPanelPaginacionPresupuestoVentas;
			processRunnable.jPanelAcciones=jPanelAccionesPresupuestoVentas;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPresupuestoVentas;
			
			
			processRunnable.jmenuBar=jmenuBarPresupuestoVentas;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePresupuestoVentas;
			processRunnable.jTtoolBar=jTtoolBarPresupuestoVentas;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePresupuestoVentas;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPresupuestoVentas ,jPanelParametrosReportesPresupuestoVentas, jTableDatosPresupuestoVentas,/*jScrollPanelDatosPresupuestoVentas,*/jPanelCamposPresupuestoVentas,jPanelPaginacionPresupuestoVentas, /*jScrollPanelDatosEdicionPresupuestoVentas,*/ jPanelAccionesPresupuestoVentas,jPanelAccionesFormularioPresupuestoVentas,jmenuBarPresupuestoVentas,jmenuBarDetallePresupuestoVentas,jTtoolBarPresupuestoVentas,jTtoolBarDetallePresupuestoVentas));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPresupuestoVentas(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPresupuestoVentas(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPresupuestoVentas(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPresupuestoVentas(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPresupuestoVentas,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePresupuestoVentas,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPresupuestoVentas(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPresupuestoVentas,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePresupuestoVentas,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.presupuestoventasConstantesFunciones.getsFinalQueryPresupuestoVentas();
		String  finalQueryPaginacionTodos=this.presupuestoventasConstantesFunciones.getsFinalQueryPresupuestoVentas();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PresupuestoVentasConstantesFunciones.getArrayColumnasGlobalesNoPresupuestoVentas(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PresupuestoVentasConstantesFunciones.getArrayColumnasGlobalesPresupuestoVentas(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PresupuestoVentasConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.presupuestoventassEliminados= new ArrayList<PresupuestoVentas>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPresupuestoVentas();
		
				///*PresupuestoVentasSessionBean*/this.presupuestoventasSessionBean=new PresupuestoVentasSessionBean();
			
			if(this.presupuestoventasSessionBean==null) {
				this.presupuestoventasSessionBean=new PresupuestoVentasSessionBean();
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
					this.iNumeroPaginacion=PresupuestoVentasConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PresupuestoVentasConstantesFunciones.getClassesForeignKeysOfPresupuestoVentas(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/presupuestoventas."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			presupuestoventassAux= new ArrayList<PresupuestoVentas>();
			
				
			presupuestoventasLogic.setDatosCliente(this.datosCliente);
			presupuestoventasLogic.setDatosDeep(this.datosDeep);
			presupuestoventasLogic.setIsConDeep(true);
			
			
			presupuestoventasLogic.getPresupuestoVentasDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					presupuestoventasLogic.getTodosPresupuestoVentass(finalQueryGlobal,pagination);
					
					//presupuestoventasLogic.getTodosPresupuestoVentassWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(presupuestoventasLogic.getPresupuestoVentass()==null|| presupuestoventasLogic.getPresupuestoVentass().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							presupuestoventassAux= new ArrayList<PresupuestoVentas>();
							presupuestoventassAux.addAll(presupuestoventasLogic.getPresupuestoVentass());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoventassAux= new ArrayList<PresupuestoVentas>();
							presupuestoventassAux.addAll(presupuestoventass);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							presupuestoventasLogic.getTodosPresupuestoVentass(finalQueryGlobal+"",this.pagination);												
							
							//presupuestoventasLogic.getTodosPresupuestoVentassWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportePresupuestoVentass("Todos",presupuestoventasLogic.getPresupuestoVentass() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							presupuestoventasLogic.setPresupuestoVentass(new ArrayList<PresupuestoVentas>());					
							presupuestoventasLogic.getPresupuestoVentass().addAll(presupuestoventassAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoventass=new ArrayList<PresupuestoVentas>();
							presupuestoventass.addAll(presupuestoventassAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPresupuestoVentas=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPresupuestoVentas=this.idActual;
				
				} else if(this.idPresupuestoVentasActual!=null && this.idPresupuestoVentasActual!=0L) {
					idPresupuestoVentas=idPresupuestoVentasActual;
				}
				
					
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndicePorId(idPresupuestoVentas);
				
				this.presupuestoventass=new ArrayList<PresupuestoVentas>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					presupuestoventasLogic.getEntity(idPresupuestoVentas);
					
					//presupuestoventasLogic.getEntityWithConnection(idPresupuestoVentas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presupuestoventasLogic.setPresupuestoVentass(new ArrayList<PresupuestoVentas>());
					presupuestoventasLogic.getPresupuestoVentass().add(presupuestoventasLogic.getPresupuestoVentas());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestoventass=new ArrayList<PresupuestoVentas>();
					this.presupuestoventass.add(presupuestoventas);
				}
				
				if(presupuestoventasLogic.getPresupuestoVentas()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCiudad")) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdCiudad(id_ciudadFK_IdCiudad);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presupuestoventasLogic.getPresupuestoVentassFK_IdCiudad(finalQueryGlobal,pagination,id_ciudadFK_IdCiudad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdCiudad(id_ciudadFK_IdCiudad);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdCiudad(id_ciudadFK_IdCiudad);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presupuestoventasLogic.getPresupuestoVentass()==null||presupuestoventasLogic.getPresupuestoVentass().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presupuestoventass==null|| presupuestoventass.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoventassAux=new ArrayList<PresupuestoVentas>();
						presupuestoventassAux.addAll(presupuestoventasLogic.getPresupuestoVentass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoventassAux=new ArrayList<PresupuestoVentas>();
							presupuestoventassAux.addAll(presupuestoventass);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presupuestoventasLogic.getPresupuestoVentassFK_IdCiudad(finalQueryGlobal,pagination,id_ciudadFK_IdCiudad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdCiudad(id_ciudadFK_IdCiudad);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdCiudad(id_ciudadFK_IdCiudad);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresupuestoVentass("FK_IdCiudad",presupuestoventasLogic.getPresupuestoVentass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresupuestoVentass("FK_IdCiudad",presupuestoventass);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoventasLogic.setPresupuestoVentass(new ArrayList<PresupuestoVentas>());
						presupuestoventasLogic.getPresupuestoVentass().addAll(presupuestoventassAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoventass=new ArrayList<PresupuestoVentas>();
							presupuestoventass.addAll(presupuestoventassAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEjercicio")) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presupuestoventasLogic.getPresupuestoVentassFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presupuestoventasLogic.getPresupuestoVentass()==null||presupuestoventasLogic.getPresupuestoVentass().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presupuestoventass==null|| presupuestoventass.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoventassAux=new ArrayList<PresupuestoVentas>();
						presupuestoventassAux.addAll(presupuestoventasLogic.getPresupuestoVentass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoventassAux=new ArrayList<PresupuestoVentas>();
							presupuestoventassAux.addAll(presupuestoventass);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presupuestoventasLogic.getPresupuestoVentassFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresupuestoVentass("FK_IdEjercicio",presupuestoventasLogic.getPresupuestoVentass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresupuestoVentass("FK_IdEjercicio",presupuestoventass);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoventasLogic.setPresupuestoVentass(new ArrayList<PresupuestoVentas>());
						presupuestoventasLogic.getPresupuestoVentass().addAll(presupuestoventassAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoventass=new ArrayList<PresupuestoVentas>();
							presupuestoventass.addAll(presupuestoventassAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presupuestoventasLogic.getPresupuestoVentassFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presupuestoventasLogic.getPresupuestoVentass()==null||presupuestoventasLogic.getPresupuestoVentass().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presupuestoventass==null|| presupuestoventass.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoventassAux=new ArrayList<PresupuestoVentas>();
						presupuestoventassAux.addAll(presupuestoventasLogic.getPresupuestoVentass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoventassAux=new ArrayList<PresupuestoVentas>();
							presupuestoventassAux.addAll(presupuestoventass);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presupuestoventasLogic.getPresupuestoVentassFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresupuestoVentass("FK_IdEmpresa",presupuestoventasLogic.getPresupuestoVentass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresupuestoVentass("FK_IdEmpresa",presupuestoventass);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoventasLogic.setPresupuestoVentass(new ArrayList<PresupuestoVentas>());
						presupuestoventasLogic.getPresupuestoVentass().addAll(presupuestoventassAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoventass=new ArrayList<PresupuestoVentas>();
							presupuestoventass.addAll(presupuestoventassAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPais")) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presupuestoventasLogic.getPresupuestoVentassFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presupuestoventasLogic.getPresupuestoVentass()==null||presupuestoventasLogic.getPresupuestoVentass().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presupuestoventass==null|| presupuestoventass.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoventassAux=new ArrayList<PresupuestoVentas>();
						presupuestoventassAux.addAll(presupuestoventasLogic.getPresupuestoVentass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoventassAux=new ArrayList<PresupuestoVentas>();
							presupuestoventassAux.addAll(presupuestoventass);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presupuestoventasLogic.getPresupuestoVentassFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresupuestoVentass("FK_IdPais",presupuestoventasLogic.getPresupuestoVentass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresupuestoVentass("FK_IdPais",presupuestoventass);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoventasLogic.setPresupuestoVentass(new ArrayList<PresupuestoVentas>());
						presupuestoventasLogic.getPresupuestoVentass().addAll(presupuestoventassAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoventass=new ArrayList<PresupuestoVentas>();
							presupuestoventass.addAll(presupuestoventassAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPeriodo")) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presupuestoventasLogic.getPresupuestoVentassFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presupuestoventasLogic.getPresupuestoVentass()==null||presupuestoventasLogic.getPresupuestoVentass().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presupuestoventass==null|| presupuestoventass.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoventassAux=new ArrayList<PresupuestoVentas>();
						presupuestoventassAux.addAll(presupuestoventasLogic.getPresupuestoVentass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoventassAux=new ArrayList<PresupuestoVentas>();
							presupuestoventassAux.addAll(presupuestoventass);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presupuestoventasLogic.getPresupuestoVentassFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresupuestoVentass("FK_IdPeriodo",presupuestoventasLogic.getPresupuestoVentass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresupuestoVentass("FK_IdPeriodo",presupuestoventass);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoventasLogic.setPresupuestoVentass(new ArrayList<PresupuestoVentas>());
						presupuestoventasLogic.getPresupuestoVentass().addAll(presupuestoventassAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoventass=new ArrayList<PresupuestoVentas>();
							presupuestoventass.addAll(presupuestoventassAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdProducto")) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presupuestoventasLogic.getPresupuestoVentassFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presupuestoventasLogic.getPresupuestoVentass()==null||presupuestoventasLogic.getPresupuestoVentass().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presupuestoventass==null|| presupuestoventass.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoventassAux=new ArrayList<PresupuestoVentas>();
						presupuestoventassAux.addAll(presupuestoventasLogic.getPresupuestoVentass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoventassAux=new ArrayList<PresupuestoVentas>();
							presupuestoventassAux.addAll(presupuestoventass);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presupuestoventasLogic.getPresupuestoVentassFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresupuestoVentass("FK_IdProducto",presupuestoventasLogic.getPresupuestoVentass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresupuestoVentass("FK_IdProducto",presupuestoventass);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoventasLogic.setPresupuestoVentass(new ArrayList<PresupuestoVentas>());
						presupuestoventasLogic.getPresupuestoVentass().addAll(presupuestoventassAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoventass=new ArrayList<PresupuestoVentas>();
							presupuestoventass.addAll(presupuestoventassAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presupuestoventasLogic.getPresupuestoVentassFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presupuestoventasLogic.getPresupuestoVentass()==null||presupuestoventasLogic.getPresupuestoVentass().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presupuestoventass==null|| presupuestoventass.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoventassAux=new ArrayList<PresupuestoVentas>();
						presupuestoventassAux.addAll(presupuestoventasLogic.getPresupuestoVentass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoventassAux=new ArrayList<PresupuestoVentas>();
							presupuestoventassAux.addAll(presupuestoventass);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presupuestoventasLogic.getPresupuestoVentassFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresupuestoVentass("FK_IdSucursal",presupuestoventasLogic.getPresupuestoVentass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresupuestoVentass("FK_IdSucursal",presupuestoventass);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoventasLogic.setPresupuestoVentass(new ArrayList<PresupuestoVentas>());
						presupuestoventasLogic.getPresupuestoVentass().addAll(presupuestoventassAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoventass=new ArrayList<PresupuestoVentas>();
							presupuestoventass.addAll(presupuestoventassAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdVendedor")) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdVendedor(id_vendedorFK_IdVendedor);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presupuestoventasLogic.getPresupuestoVentassFK_IdVendedor(finalQueryGlobal,pagination,id_vendedorFK_IdVendedor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdVendedor(id_vendedorFK_IdVendedor);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdVendedor(id_vendedorFK_IdVendedor);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presupuestoventasLogic.getPresupuestoVentass()==null||presupuestoventasLogic.getPresupuestoVentass().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presupuestoventass==null|| presupuestoventass.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoventassAux=new ArrayList<PresupuestoVentas>();
						presupuestoventassAux.addAll(presupuestoventasLogic.getPresupuestoVentass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoventassAux=new ArrayList<PresupuestoVentas>();
							presupuestoventassAux.addAll(presupuestoventass);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presupuestoventasLogic.getPresupuestoVentassFK_IdVendedor(finalQueryGlobal,pagination,id_vendedorFK_IdVendedor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdVendedor(id_vendedorFK_IdVendedor);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdVendedor(id_vendedorFK_IdVendedor);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresupuestoVentass("FK_IdVendedor",presupuestoventasLogic.getPresupuestoVentass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresupuestoVentass("FK_IdVendedor",presupuestoventass);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoventasLogic.setPresupuestoVentass(new ArrayList<PresupuestoVentas>());
						presupuestoventasLogic.getPresupuestoVentass().addAll(presupuestoventassAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoventass=new ArrayList<PresupuestoVentas>();
							presupuestoventass.addAll(presupuestoventassAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdZona")) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdZona(id_zonaFK_IdZona);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presupuestoventasLogic.getPresupuestoVentassFK_IdZona(finalQueryGlobal,pagination,id_zonaFK_IdZona);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdZona(id_zonaFK_IdZona);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdZona(id_zonaFK_IdZona);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presupuestoventasLogic.getPresupuestoVentass()==null||presupuestoventasLogic.getPresupuestoVentass().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presupuestoventass==null|| presupuestoventass.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoventassAux=new ArrayList<PresupuestoVentas>();
						presupuestoventassAux.addAll(presupuestoventasLogic.getPresupuestoVentass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoventassAux=new ArrayList<PresupuestoVentas>();
							presupuestoventassAux.addAll(presupuestoventass);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presupuestoventasLogic.getPresupuestoVentassFK_IdZona(finalQueryGlobal,pagination,id_zonaFK_IdZona);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdZona(id_zonaFK_IdZona);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoVentasConstantesFunciones.getDetalleIndiceFK_IdZona(id_zonaFK_IdZona);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresupuestoVentass("FK_IdZona",presupuestoventasLogic.getPresupuestoVentass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresupuestoVentass("FK_IdZona",presupuestoventass);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoventasLogic.setPresupuestoVentass(new ArrayList<PresupuestoVentas>());
						presupuestoventasLogic.getPresupuestoVentass().addAll(presupuestoventassAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoventass=new ArrayList<PresupuestoVentas>();
							presupuestoventass.addAll(presupuestoventassAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPresupuestoVentas();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPresupuestoVentas();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=presupuestoventasLogic.getPresupuestoVentass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=presupuestoventass.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=presupuestoventasLogic.getPresupuestoVentass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=presupuestoventass.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PresupuestoVentas presupuestoventas) {
		Boolean permite=true;
		
		if(this.presupuestoventas.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PresupuestoVentasConstantesFunciones.getOrderByListaPresupuestoVentas();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PresupuestoVentasConstantesFunciones.getOrderByListaPresupuestoVentas();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresupuestoVentas presupuestoventas:presupuestoventasLogic.getPresupuestoVentass()) {
				if(presupuestoventas.getsType().equals(Constantes2.S_TOTALES)) {
					presupuestoventasTotales=presupuestoventas;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresupuestoVentas presupuestoventas:this.presupuestoventass) {
				if(presupuestoventas.getsType().equals(Constantes2.S_TOTALES)) {
					presupuestoventasTotales=presupuestoventas;
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
			this.presupuestoventasAux=new PresupuestoVentas();
			this.presupuestoventasAux.setsType(Constantes2.S_TOTALES);
			this.presupuestoventasAux.setIsNew(false);
			this.presupuestoventasAux.setIsChanged(false);
			this.presupuestoventasAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				PresupuestoVentasConstantesFunciones.TotalizarValoresFilaPresupuestoVentas(this.presupuestoventasLogic.getPresupuestoVentass(),this.presupuestoventasAux);
				
				this.presupuestoventasLogic.getPresupuestoVentass().add(this.presupuestoventasAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PresupuestoVentasConstantesFunciones.TotalizarValoresFilaPresupuestoVentas(this.presupuestoventass,this.presupuestoventasAux);
				
				this.presupuestoventass.add(this.presupuestoventasAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		presupuestoventasTotales=new PresupuestoVentas();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.presupuestoventasLogic.getPresupuestoVentass().remove(presupuestoventasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.presupuestoventass.remove(presupuestoventasTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		presupuestoventasTotales=new PresupuestoVentas();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresupuestoVentas presupuestoventas:presupuestoventasLogic.getPresupuestoVentass()) {
				if(presupuestoventas.getsType().equals(Constantes2.S_TOTALES)) {
					presupuestoventasTotales=presupuestoventas;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PresupuestoVentasConstantesFunciones.TotalizarValoresFilaPresupuestoVentas(this.presupuestoventasLogic.getPresupuestoVentass(),presupuestoventasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresupuestoVentas presupuestoventas:this.presupuestoventass) {
				if(presupuestoventas.getsType().equals(Constantes2.S_TOTALES)) {
					presupuestoventasTotales=presupuestoventas;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PresupuestoVentasConstantesFunciones.TotalizarValoresFilaPresupuestoVentas(this.presupuestoventass,presupuestoventasTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPresupuestoVentassFK_IdCiudad()throws Exception {
		try {
			sAccionBusqueda="FK_IdCiudad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresupuestoVentassFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresupuestoVentassFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresupuestoVentassFK_IdPais()throws Exception {
		try {
			sAccionBusqueda="FK_IdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresupuestoVentassFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresupuestoVentassFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresupuestoVentassFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresupuestoVentassFK_IdVendedor()throws Exception {
		try {
			sAccionBusqueda="FK_IdVendedor";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresupuestoVentassFK_IdZona()throws Exception {
		try {
			sAccionBusqueda="FK_IdZona";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPresupuestoVentassFK_IdCiudad(String sFinalQuery,Long id_ciudad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presupuestoventasLogic.getPresupuestoVentassFK_IdCiudad(sFinalQuery,this.pagination,id_ciudad);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresupuestoVentassFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presupuestoventasLogic.getPresupuestoVentassFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresupuestoVentassFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presupuestoventasLogic.getPresupuestoVentassFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresupuestoVentassFK_IdPais(String sFinalQuery,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presupuestoventasLogic.getPresupuestoVentassFK_IdPais(sFinalQuery,this.pagination,id_pais);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresupuestoVentassFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presupuestoventasLogic.getPresupuestoVentassFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresupuestoVentassFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presupuestoventasLogic.getPresupuestoVentassFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresupuestoVentassFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presupuestoventasLogic.getPresupuestoVentassFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresupuestoVentassFK_IdVendedor(String sFinalQuery,Long id_vendedor)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presupuestoventasLogic.getPresupuestoVentassFK_IdVendedor(sFinalQuery,this.pagination,id_vendedor);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresupuestoVentassFK_IdZona(String sFinalQuery,Long id_zona)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presupuestoventasLogic.getPresupuestoVentassFK_IdZona(sFinalQuery,this.pagination,id_zona);
				
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
	
	public void inicializarPermisosPresupuestoVentas() {
		this.isPermisoTodoPresupuestoVentas=false;
		this.isPermisoNuevoPresupuestoVentas=false;
		this.isPermisoActualizarPresupuestoVentas=false;
		this.isPermisoActualizarOriginalPresupuestoVentas=false;
		this.isPermisoEliminarPresupuestoVentas=false;
		this.isPermisoGuardarCambiosPresupuestoVentas=false;
		this.isPermisoConsultaPresupuestoVentas=false;
		this.isPermisoBusquedaPresupuestoVentas=false;
		this.isPermisoReportePresupuestoVentas=false;		
		this.isPermisoOrdenPresupuestoVentas=false;		
		this.isPermisoPaginacionMedioPresupuestoVentas=false;		
		this.isPermisoPaginacionAltoPresupuestoVentas=false;
		this.isPermisoPaginacionTodoPresupuestoVentas=false;
		this.isPermisoCopiarPresupuestoVentas=false;		
		this.isPermisoVerFormPresupuestoVentas=false;		
		this.isPermisoDuplicarPresupuestoVentas=false;		
		this.isPermisoOrdenPresupuestoVentas=false;		
	}
	
	public void setPermisosUsuarioPresupuestoVentas(Boolean isPermiso) {
		this.isPermisoTodoPresupuestoVentas=isPermiso;
		this.isPermisoNuevoPresupuestoVentas=isPermiso;
		this.isPermisoActualizarPresupuestoVentas=isPermiso;
		this.isPermisoActualizarOriginalPresupuestoVentas=isPermiso;
		this.isPermisoEliminarPresupuestoVentas=isPermiso;
		this.isPermisoGuardarCambiosPresupuestoVentas=isPermiso;
		this.isPermisoConsultaPresupuestoVentas=isPermiso;
		this.isPermisoBusquedaPresupuestoVentas=isPermiso;
		this.isPermisoReportePresupuestoVentas=isPermiso;
		this.isPermisoOrdenPresupuestoVentas=isPermiso;		
		this.isPermisoPaginacionMedioPresupuestoVentas=isPermiso;		
		this.isPermisoPaginacionAltoPresupuestoVentas=isPermiso;		
		this.isPermisoPaginacionTodoPresupuestoVentas=isPermiso;		
		this.isPermisoCopiarPresupuestoVentas=isPermiso;		
		this.isPermisoVerFormPresupuestoVentas=isPermiso;		
		this.isPermisoDuplicarPresupuestoVentas=isPermiso;
		this.isPermisoOrdenPresupuestoVentas=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPresupuestoVentas(Boolean isPermiso) {
		//this.isPermisoTodoPresupuestoVentas=isPermiso;
		this.isPermisoNuevoPresupuestoVentas=isPermiso;
		this.isPermisoActualizarPresupuestoVentas=isPermiso;
		this.isPermisoActualizarOriginalPresupuestoVentas=isPermiso;
		this.isPermisoEliminarPresupuestoVentas=isPermiso;
		this.isPermisoGuardarCambiosPresupuestoVentas=isPermiso;
		//this.isPermisoConsultaPresupuestoVentas=isPermiso;
		//this.isPermisoBusquedaPresupuestoVentas=isPermiso;
		//this.isPermisoReportePresupuestoVentas=isPermiso;
		//this.isPermisoOrdenPresupuestoVentas=isPermiso;		
		//this.isPermisoPaginacionMedioPresupuestoVentas=isPermiso;		
		//this.isPermisoPaginacionAltoPresupuestoVentas=isPermiso;		
		//this.isPermisoPaginacionTodoPresupuestoVentas=isPermiso;		
		//this.isPermisoCopiarPresupuestoVentas=isPermiso;		
		//this.isPermisoDuplicarPresupuestoVentas=isPermiso;
		//this.isPermisoOrdenPresupuestoVentas=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPresupuestoVentasClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(PresupuestoVentasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebPresupuestoVentas(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPresupuestoVentasClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioPresupuestoVentasClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPresupuestoVentasClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPresupuestoVentasClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioPresupuestoVentas() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PresupuestoVentasJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PresupuestoVentasConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPresupuestoVentas=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPresupuestoVentas=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPresupuestoVentas=this.isPermisoActualizarPresupuestoVentas;
			this.isPermisoEliminarPresupuestoVentas=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPresupuestoVentas=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPresupuestoVentas=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPresupuestoVentas=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPresupuestoVentas=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePresupuestoVentas=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPresupuestoVentas=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPresupuestoVentas=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPresupuestoVentas=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPresupuestoVentas=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPresupuestoVentas=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPresupuestoVentas=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPresupuestoVentas=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPresupuestoVentas=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPresupuestoVentas.setToolTipText(this.jTableDatosPresupuestoVentas.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPresupuestoVentas(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPresupuestoVentas(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PresupuestoVentasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PresupuestoVentasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPresupuestoVentas() throws Exception {
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
	public void inicializarCombosForeignKeyPresupuestoVentasListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
				this.vendedorsForeignKey=new ArrayList();
				this.paissForeignKey=new ArrayList();
				this.ciudadsForeignKey=new ArrayList();
				this.zonasForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPresupuestoVentasListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PresupuestoVentasJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyPresupuestoVentasListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyVendedorListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCiudadListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyZonaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyVendedorListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.vendedorsForeignKey==null||this.vendedorsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=VendedorConstantesFunciones.getArrayColumnasGlobalesVendedor(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,VendedorConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=VendedorConstantesFunciones.SFINALQUERY;

				this.cargarCombosVendedorsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPaisListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.paissForeignKey==null||this.paissForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PaisConstantesFunciones.SFINALQUERY;

				this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCiudadListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.ciudadsForeignKey==null||this.ciudadsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CiudadConstantesFunciones.getArrayColumnasGlobalesCiudad(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CiudadConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CiudadConstantesFunciones.SFINALQUERY;

				this.cargarCombosCiudadsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyZonaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.zonasForeignKey==null||this.zonasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ZonaConstantesFunciones.getArrayColumnasGlobalesZona(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ZonaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ZonaConstantesFunciones.SFINALQUERY;

				this.cargarCombosZonasForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyPresupuestoVentasListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			PresupuestoVentasParameterReturnGeneral presupuestoventasReturnGeneral=new PresupuestoVentasParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.presupuestoventasConstantesFunciones.cargarid_empresaPresupuestoVentas)
					 || (this.esRecargarFks && this.presupuestoventasConstantesFunciones.cargarid_empresaPresupuestoVentas)) {

					if(!this.presupuestoventasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+presupuestoventasSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.presupuestoventasConstantesFunciones.cargarid_sucursalPresupuestoVentas)
					 || (this.esRecargarFks && this.presupuestoventasConstantesFunciones.cargarid_sucursalPresupuestoVentas)) {

					if(!this.presupuestoventasSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+presupuestoventasSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.presupuestoventasConstantesFunciones.cargarid_ejercicioPresupuestoVentas)
					 || (this.esRecargarFks && this.presupuestoventasConstantesFunciones.cargarid_ejercicioPresupuestoVentas)) {

					if(!this.presupuestoventasSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+presupuestoventasSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalPeriodo="";

				if(((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0) && this.presupuestoventasConstantesFunciones.cargarid_periodoPresupuestoVentas)
					 || (this.esRecargarFks && this.presupuestoventasConstantesFunciones.cargarid_periodoPresupuestoVentas)) {

					if(!this.presupuestoventasSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPeriodo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

						finalQueryGlobalPeriodo=Funciones.GetFinalQueryAppend(finalQueryGlobalPeriodo, "");
						finalQueryGlobalPeriodo+=PeriodoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPeriodo=" WHERE " + ConstantesSql.ID + "="+presupuestoventasSessionBean.getlidPeriodoActual();
					}
				} else {
					finalQueryGlobalPeriodo="NONE";
				}


				String finalQueryGlobalVendedor="";

				if(((this.vendedorsForeignKey==null||this.vendedorsForeignKey.size()<=0) && this.presupuestoventasConstantesFunciones.cargarid_vendedorPresupuestoVentas)
					 || (this.esRecargarFks && this.presupuestoventasConstantesFunciones.cargarid_vendedorPresupuestoVentas)) {

					if(!this.presupuestoventasSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=VendedorConstantesFunciones.getArrayColumnasGlobalesVendedor(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalVendedor=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,VendedorConstantesFunciones.TABLENAME);

						finalQueryGlobalVendedor=Funciones.GetFinalQueryAppend(finalQueryGlobalVendedor, "");
						finalQueryGlobalVendedor+=VendedorConstantesFunciones.SFINALQUERY;

						//this.cargarCombosVendedorsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalVendedor=" WHERE " + ConstantesSql.ID + "="+presupuestoventasSessionBean.getlidVendedorActual();
					}
				} else {
					finalQueryGlobalVendedor="NONE";
				}


				String finalQueryGlobalPais="";

				if(((this.paissForeignKey==null||this.paissForeignKey.size()<=0) && this.presupuestoventasConstantesFunciones.cargarid_paisPresupuestoVentas)
					 || (this.esRecargarFks && this.presupuestoventasConstantesFunciones.cargarid_paisPresupuestoVentas)) {

					if(!this.presupuestoventasSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPais=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

						finalQueryGlobalPais=Funciones.GetFinalQueryAppend(finalQueryGlobalPais, "");
						finalQueryGlobalPais+=PaisConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPais=" WHERE " + ConstantesSql.ID + "="+presupuestoventasSessionBean.getlidPaisActual();
					}
				} else {
					finalQueryGlobalPais="NONE";
				}


				String finalQueryGlobalCiudad="";

				if(((this.ciudadsForeignKey==null||this.ciudadsForeignKey.size()<=0) && this.presupuestoventasConstantesFunciones.cargarid_ciudadPresupuestoVentas)
					 || (this.esRecargarFks && this.presupuestoventasConstantesFunciones.cargarid_ciudadPresupuestoVentas)) {

					if(!this.presupuestoventasSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CiudadConstantesFunciones.getArrayColumnasGlobalesCiudad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCiudad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CiudadConstantesFunciones.TABLENAME);

						finalQueryGlobalCiudad=Funciones.GetFinalQueryAppend(finalQueryGlobalCiudad, "");
						finalQueryGlobalCiudad+=CiudadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCiudadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCiudad=" WHERE " + ConstantesSql.ID + "="+presupuestoventasSessionBean.getlidCiudadActual();
					}
				} else {
					finalQueryGlobalCiudad="NONE";
				}


				String finalQueryGlobalZona="";

				if(((this.zonasForeignKey==null||this.zonasForeignKey.size()<=0) && this.presupuestoventasConstantesFunciones.cargarid_zonaPresupuestoVentas)
					 || (this.esRecargarFks && this.presupuestoventasConstantesFunciones.cargarid_zonaPresupuestoVentas)) {

					if(!this.presupuestoventasSessionBean.getisBusquedaDesdeForeignKeySesionZona()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ZonaConstantesFunciones.getArrayColumnasGlobalesZona(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalZona=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ZonaConstantesFunciones.TABLENAME);

						finalQueryGlobalZona=Funciones.GetFinalQueryAppend(finalQueryGlobalZona, "");
						finalQueryGlobalZona+=ZonaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosZonasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalZona=" WHERE " + ConstantesSql.ID + "="+presupuestoventasSessionBean.getlidZonaActual();
					}
				} else {
					finalQueryGlobalZona="NONE";
				}


				String finalQueryGlobalProducto="";

				if(((this.productosForeignKey==null||this.productosForeignKey.size()<=0) && this.presupuestoventasConstantesFunciones.cargarid_productoPresupuestoVentas)
					 || (this.esRecargarFks && this.presupuestoventasConstantesFunciones.cargarid_productoPresupuestoVentas)) {

					if(!this.presupuestoventasSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalProducto, "");
						finalQueryGlobalProducto+=ProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProducto=" WHERE " + ConstantesSql.ID + "="+presupuestoventasSessionBean.getlidProductoActual();
					}
				} else {
					finalQueryGlobalProducto="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				presupuestoventasReturnGeneral=presupuestoventasLogic.cargarCombosLoteForeignKeyPresupuestoVentas(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEjercicio,finalQueryGlobalPeriodo,finalQueryGlobalVendedor,finalQueryGlobalPais,finalQueryGlobalCiudad,finalQueryGlobalZona,finalQueryGlobalProducto);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=presupuestoventasReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=presupuestoventasReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=presupuestoventasReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalPeriodo.equals("NONE")) {
				this.periodosForeignKey=presupuestoventasReturnGeneral.getperiodosForeignKey();
			}

			if(!finalQueryGlobalVendedor.equals("NONE")) {
				this.vendedorsForeignKey=presupuestoventasReturnGeneral.getvendedorsForeignKey();
			}

			if(!finalQueryGlobalPais.equals("NONE")) {
				this.paissForeignKey=presupuestoventasReturnGeneral.getpaissForeignKey();
			}

			if(!finalQueryGlobalCiudad.equals("NONE")) {
				this.ciudadsForeignKey=presupuestoventasReturnGeneral.getciudadsForeignKey();
			}

			if(!finalQueryGlobalZona.equals("NONE")) {
				this.zonasForeignKey=presupuestoventasReturnGeneral.getzonasForeignKey();
			}

			if(!finalQueryGlobalProducto.equals("NONE")) {
				this.productosForeignKey=presupuestoventasReturnGeneral.getproductosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyPresupuestoVentas()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
			this.addItemDefectoCombosForeignKeyVendedor();
			this.addItemDefectoCombosForeignKeyPais();
			this.addItemDefectoCombosForeignKeyCiudad();
			this.addItemDefectoCombosForeignKeyZona();
			this.addItemDefectoCombosForeignKeyProducto();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.presupuestoventasSessionBean==null) {
				this.presupuestoventasSessionBean=new PresupuestoVentasSessionBean();
			}

			if(!this.presupuestoventasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.presupuestoventasSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.presupuestoventasSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

			if(!this.presupuestoventasSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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

	public void addItemDefectoCombosForeignKeyVendedor()throws Exception {
		try {

			if(!this.presupuestoventasSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {
				Vendedor vendedor=new Vendedor();
				VendedorConstantesFunciones.setVendedorDescripcion(vendedor,Constantes.SMENSAJE_ESCOJA_OPCION);
				vendedor.setId(null);

				if(!VendedorConstantesFunciones.ExisteEnLista(this.vendedorsForeignKey,vendedor,true)) {

					this.vendedorsForeignKey.add(0,vendedor);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyPais()throws Exception {
		try {

			if(!this.presupuestoventasSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				Pais pais=new Pais();
				PaisConstantesFunciones.setPaisDescripcion(pais,Constantes.SMENSAJE_ESCOJA_OPCION);
				pais.setId(null);

				if(!PaisConstantesFunciones.ExisteEnLista(this.paissForeignKey,pais,true)) {

					this.paissForeignKey.add(0,pais);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCiudad()throws Exception {
		try {

			if(!this.presupuestoventasSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {
				Ciudad ciudad=new Ciudad();
				CiudadConstantesFunciones.setCiudadDescripcion(ciudad,Constantes.SMENSAJE_ESCOJA_OPCION);
				ciudad.setId(null);

				if(!CiudadConstantesFunciones.ExisteEnLista(this.ciudadsForeignKey,ciudad,true)) {

					this.ciudadsForeignKey.add(0,ciudad);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyZona()throws Exception {
		try {

			if(!this.presupuestoventasSessionBean.getisBusquedaDesdeForeignKeySesionZona()) {
				Zona zona=new Zona();
				ZonaConstantesFunciones.setZonaDescripcion(zona,Constantes.SMENSAJE_ESCOJA_OPCION);
				zona.setId(null);

				if(!ZonaConstantesFunciones.ExisteEnLista(this.zonasForeignKey,zona,true)) {

					this.zonasForeignKey.add(0,zona);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyProducto()throws Exception {
		try {

			if(!this.presupuestoventasSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
	
	public void initActionsCombosTodosForeignKeyPresupuestoVentas()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPresupuestoVentas(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPresupuestoVentas()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualEjercicioForeignKey(this.parametroGeneralUsuario.getid_ejercicio(),false,"Formulario");
				this.setActualPeriodoForeignKey(this.parametroGeneralUsuario.getid_periodo(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPresupuestoVentas();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPresupuestoVentas(PresupuestoVentas presupuestoventas)throws Exception {	
		try {
			
			this.setActualVendedorForeignKey(presupuestoventas.getid_vendedor(),false,"Formulario");
			this.setActualPaisForeignKey(presupuestoventas.getid_pais(),false,"Formulario");
			this.setActualCiudadForeignKey(presupuestoventas.getid_ciudad(),false,"Formulario");
			this.setActualZonaForeignKey(presupuestoventas.getid_zona(),false,"Formulario");
			this.setActualProductoForeignKey(presupuestoventas.getid_producto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPresupuestoVentas(PresupuestoVentas presupuestoventas,String sTipoEvento)throws Exception {	
		try {
			
			

				if(presupuestoventas.getProducto()!=null && !sTipoEvento.equals("id_productoPresupuestoVentas")) { //sTipoEvento Evita Bucle Infinito

					this.productosForeignKey=new ArrayList<Producto>();
					this.productosForeignKey.add(presupuestoventas.getProducto());

					this.addItemDefectoCombosForeignKeyProducto();
					this.cargarCombosFrameProductosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPresupuestoVentas()throws Exception {	
		try {
			
			this.setActualVendedorForeignKey(this.presupuestoventasConstantesFunciones.getid_vendedor(),false,"Formulario");
			this.setActualPaisForeignKey(this.presupuestoventasConstantesFunciones.getid_pais(),false,"Formulario");
			this.setActualCiudadForeignKey(this.presupuestoventasConstantesFunciones.getid_ciudad(),false,"Formulario");
			this.setActualZonaForeignKey(this.presupuestoventasConstantesFunciones.getid_zona(),false,"Formulario");
			this.setActualProductoForeignKey(this.presupuestoventasConstantesFunciones.getid_producto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPresupuestoVentas()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_ejercicioPresupuestoVentas.getSelectedItem();
				}

				if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_periodoPresupuestoVentas.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPresupuestoVentas()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPresupuestoVentas()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPresupuestoVentas()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPresupuestoVentas()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");
			this.cargarCombosFrameVendedorsForeignKey("Todos");
			this.cargarCombosFramePaissForeignKey("Todos");
			this.cargarCombosFrameCiudadsForeignKey("Todos");
			this.cargarCombosFrameZonasForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPresupuestoVentas(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameVendedorsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCiudadsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameZonasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPresupuestoVentas()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_empresaPresupuestoVentas!=null && this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_empresaPresupuestoVentas.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_empresaPresupuestoVentas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_sucursalPresupuestoVentas!=null && this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_sucursalPresupuestoVentas.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_sucursalPresupuestoVentas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_ejercicioPresupuestoVentas!=null && this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_ejercicioPresupuestoVentas.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_ejercicioPresupuestoVentas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_periodoPresupuestoVentas!=null && this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_periodoPresupuestoVentas.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_periodoPresupuestoVentas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_vendedorPresupuestoVentas!=null && this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_vendedorPresupuestoVentas.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_vendedorPresupuestoVentas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_paisPresupuestoVentas!=null && this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_paisPresupuestoVentas.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_paisPresupuestoVentas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_ciudadPresupuestoVentas!=null && this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_ciudadPresupuestoVentas.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_ciudadPresupuestoVentas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_zonaPresupuestoVentas!=null && this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_zonaPresupuestoVentas.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_zonaPresupuestoVentas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_productoPresupuestoVentas!=null && this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_productoPresupuestoVentas.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_productoPresupuestoVentas.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


















	
	

	public PresupuestoVentasBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PresupuestoVentasBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PresupuestoVentasBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.presupuestoventasSessionBean=new PresupuestoVentasSessionBean(); 
		this.presupuestoventasConstantesFunciones=new PresupuestoVentasConstantesFunciones(); 
		this.presupuestoventasBean=new PresupuestoVentas();//(this.presupuestoventasConstantesFunciones); 		
		this.presupuestoventasReturnGeneral=new PresupuestoVentasParameterReturnGeneral(); 
		
		this.presupuestoventasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presupuestoventasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PresupuestoVentasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PresupuestoVentasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PresupuestoVentasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPresupuestoVentas(true);
			
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
			
			this.presupuestoventasConstantesFunciones=new PresupuestoVentasConstantesFunciones(); 
			this.presupuestoventasBean=new PresupuestoVentas();//this.presupuestoventasConstantesFunciones); 			
			this.presupuestoventasReturnGeneral=new PresupuestoVentasParameterReturnGeneral(); 
		
			PresupuestoVentasBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Presupuesto Ventas Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.presupuestoventas=new PresupuestoVentas();
			this.presupuestoventass = new ArrayList<PresupuestoVentas>();
			this.presupuestoventassAux = new ArrayList<PresupuestoVentas>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic=new PresupuestoVentasLogic();
				this.presupuestoventasLogic.getNewConnexionToDeep("");
			}
			
			//this.presupuestoventasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.presupuestoventasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPresupuestoVentas);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPresupuestoVentas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPresupuestoVentas);	
					}
					
					if(this.jInternalFrameImportacionPresupuestoVentas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPresupuestoVentas);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPresupuestoVentas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPresupuestoVentas);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPresupuestoVentas);
				this.jInternalFrameDetalleFormPresupuestoVentas.setVisible(false);
				this.jInternalFrameDetalleFormPresupuestoVentas.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPresupuestoVentas!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPresupuestoVentas);
					this.jInternalFrameReporteDinamicoPresupuestoVentas.setVisible(false);
					this.jInternalFrameReporteDinamicoPresupuestoVentas.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPresupuestoVentas!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPresupuestoVentas);
					this.jInternalFrameImportacionPresupuestoVentas.setVisible(false);
					this.jInternalFrameImportacionPresupuestoVentas.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPresupuestoVentas!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPresupuestoVentas);
					this.jInternalFrameOrderByPresupuestoVentas.setVisible(false);
					this.jInternalFrameOrderByPresupuestoVentas.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPresupuestoVentasActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PresupuestoVentasConstantesFunciones.INUMEROPAGINACION;
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
			
			this.presupuestoventasReturnGeneral=new PresupuestoVentasParameterReturnGeneral();
			
			this.presupuestoventasParameterGeneral=new PresupuestoVentasParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.presupuestoventasLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PresupuestoVentasJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PresupuestoVentasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.presupuestoventasSessionBean.getEsGuardarRelacionado(),this.presupuestoventasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PresupuestoVentasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.presupuestoventasSessionBean.getEsGuardarRelacionado(),this.presupuestoventasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPresupuestoVentas=false;
			this.isVisibilidadCeldaDuplicarPresupuestoVentas=true;
			this.isVisibilidadCeldaCopiarPresupuestoVentas=true;
			this.isVisibilidadCeldaVerFormPresupuestoVentas=true;
			this.isVisibilidadCeldaOrdenPresupuestoVentas=true;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoVentas=false;
			this.isVisibilidadCeldaModificarPresupuestoVentas=false;
			this.isVisibilidadCeldaActualizarPresupuestoVentas=false;
			this.isVisibilidadCeldaEliminarPresupuestoVentas=false;
			this.isVisibilidadCeldaCancelarPresupuestoVentas=false;
			this.isVisibilidadCeldaGuardarPresupuestoVentas=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoVentas=false;
			
			
			this.isVisibilidadFK_IdCiudad=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdPais=true;
			this.isVisibilidadFK_IdPeriodo=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdVendedor=true;
			this.isVisibilidadFK_IdZona=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPresupuestoVentas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPresupuestoVentas();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPresupuestoVentas(false);
			
			this.setPermisosUsuarioPresupuestoVentas();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.presupuestoventasSessionBean.getEsGuardarRelacionado() 
				|| (this.presupuestoventasSessionBean.getEsGuardarRelacionado() && this.presupuestoventasSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPresupuestoVentasClasesRelacionadas();
			}
			
			if(this.presupuestoventasSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPresupuestoVentasClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PresupuestoVentasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPresupuestoVentas();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPresupuestoVentas();
			}
			
			if(!this.isPermisoBusquedaPresupuestoVentas) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPresupuestoVentas.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioPresupuestoVentas,this.isPermisoPaginacionMedioPresupuestoVentas,this.isPermisoPaginacionTodoPresupuestoVentas);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PresupuestoVentasConstantesFunciones.getTiposSeleccionarPresupuestoVentas());
				
				this.tiposColumnasSelect=PresupuestoVentasConstantesFunciones.getTiposSeleccionarPresupuestoVentas(true);
				
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
			//if(!this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPresupuestoVentas();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioPresupuestoVentas(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioPresupuestoVentas(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPresupuestoVentas() ;
			
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
			this.vendedorLogic=new VendedorLogic();
			this.paisLogic=new PaisLogic();
			this.ciudadLogic=new CiudadLogic();
			this.zonaLogic=new ZonaLogic();
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
				presupuestoventasImplementable= (PresupuestoVentasImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PresupuestoVentasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				presupuestoventasImplementableHome= (PresupuestoVentasImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PresupuestoVentasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.presupuestoventass= new ArrayList<PresupuestoVentas>();
			this.presupuestoventassEliminados= new ArrayList<PresupuestoVentas>();
						
			this.isEsNuevoPresupuestoVentas=false;
			this.esParaAccionDesdeFormularioPresupuestoVentas=false;
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
			this.vendedorsForeignKey=new ArrayList<Vendedor>() ;
			this.paissForeignKey=new ArrayList<Pais>() ;
			this.ciudadsForeignKey=new ArrayList<Ciudad>() ;
			this.zonasForeignKey=new ArrayList<Zona>() ;
			this.productosForeignKey=new ArrayList<Producto>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPresupuestoVentas(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPresupuestoVentas();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PresupuestoVentasBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PresupuestoVentasConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPresupuestoVentas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPresupuestoVentas(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPresupuestoVentas();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPresupuestoVentas();
			}
			
			PresupuestoVentasBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPresupuestoVentas.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPresupuestoVentas.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPresupuestoVentas.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPresupuestoVentas(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PresupuestoVentas: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPresupuestoVentas() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPresupuestoVentas")) {
				iIndex=this.jInternalFrameDetalleFormPresupuestoVentas.jTabbedPaneRelacionesPresupuestoVentas.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPresupuestoVentas.jTabbedPaneRelacionesPresupuestoVentas.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPresupuestoVentas();	
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
	
	public void cargarCombosForeignKeyPresupuestoVentas(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPresupuestoVentas(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPresupuestoVentas(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPresupuestoVentasListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPresupuestoVentas();
		
		this.cargarCombosFrameForeignKeyPresupuestoVentas();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPresupuestoVentas();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPresupuestoVentas();
		}
	}
	
	

	public void cargarCombosForeignKeyVendedor(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyVendedorListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyVendedor();
				this.cargarCombosFrameVendedorsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaVendedor(this.vendedorsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPais(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPais(this.paissForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCiudad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCiudadListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCiudad();
				this.cargarCombosFrameCiudadsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCiudad(this.ciudadsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyZona(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyZonaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyZona();
				this.cargarCombosFrameZonasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaZona(this.zonasForeignKey);

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
	
	public void jButtonNuevoPresupuestoVentasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.presupuestoventasSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPresupuestoVentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
			
			
			if(jTableDatosPresupuestoVentas.getRowCount()>=1) {
				jTableDatosPresupuestoVentas.removeRowSelectionInterval(0, jTableDatosPresupuestoVentas.getRowCount()-1);						
			}
			
			this.isEsNuevoPresupuestoVentas=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPresupuestoVentas(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPresupuestoVentas(true);			
			//this.presupuestoventas=new PresupuestoVentas();
			//this.presupuestoventas.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPresupuestoVentas(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresupuestoVentas() ;
			
			if(PresupuestoVentasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePresupuestoVentas(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.presupuestoventas);	
			this.actualizarInformacion("INFO_PADRE",false,this.presupuestoventas);				
			
			PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
			
			if(this.presupuestoventasSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PresupuestoVentas: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPresupuestoVentasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PresupuestoVentas> presupuestoventassSeleccionados=new ArrayList<PresupuestoVentas>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPresupuestoVentas.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPresupuestoVentas.getSelectedRows().length;			
			}
			
			presupuestoventassSeleccionados=this.getPresupuestoVentassSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPresupuestoVentas--;			
				//PresupuestoVentas presupuestoventasAux= new PresupuestoVentas();			
				//presupuestoventasAux.setId(this.iIdNuevoPresupuestoVentas);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PresupuestoVentas presupuestoventasOrigen=new PresupuestoVentas();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PresupuestoVentas presupuestoventasOrigen : presupuestoventassSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							presupuestoventasOrigen =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoventasOrigen =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPresupuestoVentas();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.presupuestoventas.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPresupuestoVentas(presupuestoventasOrigen,this.presupuestoventas,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.presupuestoventasLogic.getPresupuestoVentass().add(this.presupuestoventasAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.presupuestoventass.add(this.presupuestoventasAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPresupuestoVentas(false);
				
				this.jTableDatosPresupuestoVentas.setRowSelectionInterval(this.getIndiceNuevoPresupuestoVentas(), this.getIndiceNuevoPresupuestoVentas());
				
				int iLastRow =  this.jTableDatosPresupuestoVentas.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPresupuestoVentas.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPresupuestoVentas.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPresupuestoVentas(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPresupuestoVentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PresupuestoVentas> presupuestoventassSeleccionados=new ArrayList<PresupuestoVentas>();									
		
			PresupuestoVentas presupuestoventasOrigen=new PresupuestoVentas();
			PresupuestoVentas presupuestoventasDestino=new PresupuestoVentas();
				
			presupuestoventassSeleccionados=this.getPresupuestoVentassSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPresupuestoVentas.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || presupuestoventassSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPresupuestoVentas.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoventasOrigen =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						presupuestoventasOrigen =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoventasDestino =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						presupuestoventasDestino =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				presupuestoventasOrigen =presupuestoventassSeleccionados.get(0);
				presupuestoventasDestino =presupuestoventassSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPresupuestoVentas(presupuestoventasOrigen,presupuestoventasDestino,true,false);
				
				presupuestoventasDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(presupuestoventasDestino,presupuestoventasLogic.getPresupuestoVentass());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presupuestoventasDestino,presupuestoventass);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPresupuestoVentas(false);
				
				//this.jTableDatosPresupuestoVentas.setRowSelectionInterval(this.getIndiceNuevoPresupuestoVentas(), this.getIndiceNuevoPresupuestoVentas());
				
				int iLastRow =  this.jTableDatosPresupuestoVentas.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPresupuestoVentas.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPresupuestoVentas.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPresupuestoVentas(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPresupuestoVentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPresupuestoVentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPresupuestoVentas.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPresupuestoVentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPresupuestoVentas.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPresupuestoVentas.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPresupuestoVentas.setVisible(!isVisible);
			this.jPanelPaginacionPresupuestoVentas.setVisible(!isVisible);
			this.jPanelAccionesPresupuestoVentas.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPresupuestoVentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePresupuestoVentas();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPresupuestoVentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPresupuestoVentas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPresupuestoVentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPresupuestoVentas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPresupuestoVentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPresupuestoVentas();
			
			this.abrirFrameOrderByPresupuestoVentas();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPresupuestoVentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPresupuestoVentas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePresupuestoVentas(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPresupuestoVentas);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPresupuestoVentas.isMaximum()) {
					this.jInternalFrameDetalleFormPresupuestoVentas.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPresupuestoVentas.setSize(this.jInternalFrameDetalleFormPresupuestoVentas.iWidthFormulario,this.jInternalFrameDetalleFormPresupuestoVentas.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPresupuestoVentas.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPresupuestoVentas.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPresupuestoVentas.isMaximum()) {
						this.jInternalFrameDetalleFormPresupuestoVentas.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPresupuestoVentas.jContentPaneDetallePresupuestoVentas.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPresupuestoVentas.jTabbedPaneRelacionesPresupuestoVentas.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPresupuestoVentas.jContentPaneDetallePresupuestoVentas.getWidth(),PresupuestoVentasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPresupuestoVentas.jTabbedPaneRelacionesPresupuestoVentas.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPresupuestoVentas.jContentPaneDetallePresupuestoVentas.getWidth(),PresupuestoVentasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPresupuestoVentas.jTabbedPaneRelacionesPresupuestoVentas.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPresupuestoVentas.jContentPaneDetallePresupuestoVentas.getWidth(),PresupuestoVentasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPresupuestoVentas.setVisible(true);
	        this.jInternalFrameDetalleFormPresupuestoVentas.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPresupuestoVentas() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPresupuestoVentas==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPresupuestoVentas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresupuestoVentas,false,this);
				} else {
					this.jInternalFrameOrderByPresupuestoVentas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresupuestoVentas,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPresupuestoVentas);
				this.jInternalFrameOrderByPresupuestoVentas.setVisible(false);
				this.jInternalFrameOrderByPresupuestoVentas.setSelected(false);
				
				this.jInternalFrameOrderByPresupuestoVentas.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPresupuestoVentas"));
				
				this.inicializarActualizarBindingTablaOrderByPresupuestoVentas();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPresupuestoVentas() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPresupuestoVentas==null) {
				
				this.jInternalFrameImportacionPresupuestoVentas=new ImportacionJInternalFrame(PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPresupuestoVentas);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPresupuestoVentas);
				this.jInternalFrameImportacionPresupuestoVentas.setVisible(false);
				this.jInternalFrameImportacionPresupuestoVentas.setSelected(false);


				this.jInternalFrameImportacionPresupuestoVentas.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPresupuestoVentas"));
				this.jInternalFrameImportacionPresupuestoVentas.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPresupuestoVentas"));
				this.jInternalFrameImportacionPresupuestoVentas.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPresupuestoVentas"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPresupuestoVentas() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPresupuestoVentas==null) {
				this.jInternalFrameReporteDinamicoPresupuestoVentas=new ReporteDinamicoJInternalFrame(PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPresupuestoVentas);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPresupuestoVentas);
				this.jInternalFrameReporteDinamicoPresupuestoVentas.setVisible(false);
				this.jInternalFrameReporteDinamicoPresupuestoVentas.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPresupuestoVentas.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPresupuestoVentas"));
				this.jInternalFrameReporteDinamicoPresupuestoVentas.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPresupuestoVentas"));
				this.jInternalFrameReporteDinamicoPresupuestoVentas.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPresupuestoVentas"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPresupuestoVentas();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetallePresupuestoVentas() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPresupuestoVentas);
			
	       	this.jInternalFrameDetalleFormPresupuestoVentas.setVisible(false);
	        this.jInternalFrameDetalleFormPresupuestoVentas.setSelected(false);
			
			//this.jInternalFrameDetalleFormPresupuestoVentas.dispose();
			//this.jInternalFrameDetalleFormPresupuestoVentas=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPresupuestoVentas() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPresupuestoVentas.setVisible(true);
	        this.jInternalFrameReporteDinamicoPresupuestoVentas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPresupuestoVentas() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPresupuestoVentas.setVisible(true);
	        this.jInternalFrameImportacionPresupuestoVentas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPresupuestoVentas() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPresupuestoVentas.setVisible(true);
	        this.jInternalFrameOrderByPresupuestoVentas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPresupuestoVentas() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPresupuestoVentas.setVisible(false);
	        this.jInternalFrameOrderByPresupuestoVentas.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPresupuestoVentas() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPresupuestoVentas.setVisible(false);
	        this.jInternalFrameReporteDinamicoPresupuestoVentas.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPresupuestoVentas() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPresupuestoVentas.setVisible(false);
	        this.jInternalFrameImportacionPresupuestoVentas.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeVendedor(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeVendedor);
						VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame=new VendedorBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						vendedorBeanSwingJInternalFrame.setJInternalFrameParent(this);
						vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.sTipoBusqueda="Vendedor";
						}

						vendedorBeanSwingJInternalFrame.getTodosVendedorArbol();
						vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.setVendedors(vendedorBeanSwingJInternalFrame.vendedorsArbol);
						vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.CargarTreeVendedor();
						vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.setVisible(true);
						vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.jInternalFrameParent=this;
						TitledBorder titledBorderPresupuestoVentas=(TitledBorder)this.jScrollPanelDatosPresupuestoVentas.getBorder();
						TitledBorder titledBorderVendedor=(TitledBorder)vendedorBeanSwingJInternalFrame.jScrollPanelDatosVendedor.getBorder();

						titledBorderVendedor.setTitle(titledBorderPresupuestoVentas.getTitle() + " -> Vendedor");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,vendedorBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(vendedorBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeVendedor(VendedorBeanSwingJInternalFrame jInternalFrameTreeVendedor) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeVendedor);
						jInternalFrameTreeVendedor.setVisible(false);
						jInternalFrameTreeVendedor.setSelected(false);
						//jInternalFrameTreeVendedor.dispose();
						//jInternalFrameTreeVendedor=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void jButtonModificarPresupuestoVentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPresupuestoVentas(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPresupuestoVentas(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPresupuestoVentas(true);
			//this.isEsNuevoPresupuestoVentas=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventas =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.presupuestoventas =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPresupuestoVentas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPresupuestoVentas(false) ;
			
			if(presupuestoventasSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(PresupuestoVentasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePresupuestoVentas(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresupuestoVentas(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPresupuestoVentasActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventas =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestoventas =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPresupuestoVentas(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPresupuestoVentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPresupuestoVentas(true);
			//this.isEsNuevoPresupuestoVentas=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventas =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.presupuestoventas =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.presupuestoventas.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPresupuestoVentas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPresupuestoVentas(false) ;
			
			if(PresupuestoVentasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePresupuestoVentas(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresupuestoVentas(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Producto")) {
				if(!this.presupuestoventasConstantesFunciones.cargarid_productoPresupuestoVentas) {
					this.cargarCombosProductosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingPresupuestoVentas(false,false);
					this.cargarCombosFrameProductosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_producto (id);

				this.recargarComboTablaProducto(this.productosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
					
	
	public void recargarComboTablaVendedor(List<Vendedor> vendedorsForeignKey)throws Exception{
		TableColumn tableColumnVendedor=this.jTableDatosPresupuestoVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoVentas,PresupuestoVentasConstantesFunciones.LABEL_IDVENDEDOR));
		TableCellEditor tableCellEditorVendedor =tableColumnVendedor.getCellEditor();

		VendedorTableCell vendedorTableCellFk=(VendedorTableCell)tableCellEditorVendedor;

		if(vendedorTableCellFk!=null) {
			vendedorTableCellFk.setvendedorsForeignKey(vendedorsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPresupuestoVentas.getSelectedRow();

		//if(intSelectedRow<=0) {
			//vendedorTableCellFk.setRowActual(intSelectedRow);
			//vendedorTableCellFk.setvendedorsForeignKeyActual(vendedorsForeignKey);
		//}


		if(vendedorTableCellFk!=null) {
			vendedorTableCellFk.RecargarVendedorsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaPais(List<Pais> paissForeignKey)throws Exception{
		TableColumn tableColumnPais=this.jTableDatosPresupuestoVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoVentas,PresupuestoVentasConstantesFunciones.LABEL_IDPAIS));
		TableCellEditor tableCellEditorPais =tableColumnPais.getCellEditor();

		PaisTableCell paisTableCellFk=(PaisTableCell)tableCellEditorPais;

		if(paisTableCellFk!=null) {
			paisTableCellFk.setpaissForeignKey(paissForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPresupuestoVentas.getSelectedRow();

		//if(intSelectedRow<=0) {
			//paisTableCellFk.setRowActual(intSelectedRow);
			//paisTableCellFk.setpaissForeignKeyActual(paissForeignKey);
		//}


		if(paisTableCellFk!=null) {
			paisTableCellFk.RecargarPaissForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCiudad(List<Ciudad> ciudadsForeignKey)throws Exception{
		TableColumn tableColumnCiudad=this.jTableDatosPresupuestoVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoVentas,PresupuestoVentasConstantesFunciones.LABEL_IDCIUDAD));
		TableCellEditor tableCellEditorCiudad =tableColumnCiudad.getCellEditor();

		CiudadTableCell ciudadTableCellFk=(CiudadTableCell)tableCellEditorCiudad;

		if(ciudadTableCellFk!=null) {
			ciudadTableCellFk.setciudadsForeignKey(ciudadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPresupuestoVentas.getSelectedRow();

		//if(intSelectedRow<=0) {
			//ciudadTableCellFk.setRowActual(intSelectedRow);
			//ciudadTableCellFk.setciudadsForeignKeyActual(ciudadsForeignKey);
		//}


		if(ciudadTableCellFk!=null) {
			ciudadTableCellFk.RecargarCiudadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaZona(List<Zona> zonasForeignKey)throws Exception{
		TableColumn tableColumnZona=this.jTableDatosPresupuestoVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoVentas,PresupuestoVentasConstantesFunciones.LABEL_IDZONA));
		TableCellEditor tableCellEditorZona =tableColumnZona.getCellEditor();

		ZonaTableCell zonaTableCellFk=(ZonaTableCell)tableCellEditorZona;

		if(zonaTableCellFk!=null) {
			zonaTableCellFk.setzonasForeignKey(zonasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPresupuestoVentas.getSelectedRow();

		//if(intSelectedRow<=0) {
			//zonaTableCellFk.setRowActual(intSelectedRow);
			//zonaTableCellFk.setzonasForeignKeyActual(zonasForeignKey);
		//}


		if(zonaTableCellFk!=null) {
			zonaTableCellFk.RecargarZonasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaProducto(List<Producto> productosForeignKey)throws Exception{
		TableColumn tableColumnProducto=this.jTableDatosPresupuestoVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoVentas,PresupuestoVentasConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPresupuestoVentas.getSelectedRow();

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
	
	public void jButtonActualizarPresupuestoVentasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPresupuestoVentas(false);
			
			//if(!this.isEsNuevoPresupuestoVentas) {								
				int intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventas =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestoventas =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PresupuestoVentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.presupuestoventas,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);
				
			}
			
			if(this.permiteMantenimiento(this.presupuestoventas)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPresupuestoVentas=true;
					this.inicializarActualizarBindingTablaPresupuestoVentas(false);
					this.isEsNuevoPresupuestoVentas=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPresupuestoVentas=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPresupuestoVentas=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPresupuestoVentas(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPresupuestoVentas(false);
				
				this.habilitarDeshabilitarControlesPresupuestoVentas(false);
			
												
				
				if(PresupuestoVentasJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePresupuestoVentas();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPresupuestoVentasActionPerformed(evt,presupuestoventasSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPresupuestoVentas(this.presupuestoventas,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPresupuestoVentas.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,presupuestoventasSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.presupuestoventas.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PresupuestoVentas.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoVentas.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPresupuestoVentasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventas =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
				this.presupuestoventas.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.presupuestoventas =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
				this.presupuestoventas.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.presupuestoventas)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PresupuestoVentasModel) this.jTableDatosPresupuestoVentas.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPresupuestoVentas=true;
				this.inicializarActualizarBindingTablaPresupuestoVentas(false);
				this.isEsNuevoPresupuestoVentas=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPresupuestoVentas(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPresupuestoVentas(false);
				
				this.habilitarDeshabilitarControlesPresupuestoVentas(false);
				
				
				
				if(PresupuestoVentasJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePresupuestoVentas();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPresupuestoVentasActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPresupuestoVentas.getRowCount()>=1) {
				jTableDatosPresupuestoVentas.removeRowSelectionInterval(0, jTableDatosPresupuestoVentas.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPresupuestoVentas(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPresupuestoVentas(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPresupuestoVentas(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresupuestoVentas(false) ;
			
			this.isEsNuevoPresupuestoVentas=false;
			
			if(PresupuestoVentasJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePresupuestoVentas();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPresupuestoVentasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPresupuestoVentas(false);
				
				//SI ES MANUAL
				if(PresupuestoVentasJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPresupuestoVentas();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPresupuestoVentasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPresupuestoVentas--;			
			//PresupuestoVentas presupuestoventasAux= new PresupuestoVentas();			
			//presupuestoventasAux.setId(this.iIdNuevoPresupuestoVentas);
			
			if(this.jInternalFrameDetalleFormPresupuestoVentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPresupuestoVentas();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);
			
			this.presupuestoventas.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.presupuestoventasLogic.getPresupuestoVentass().add(this.presupuestoventasAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.presupuestoventass.add(this.presupuestoventasAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPresupuestoVentas(false);
			
			this.jTableDatosPresupuestoVentas.setRowSelectionInterval(this.getIndiceNuevoPresupuestoVentas(), this.getIndiceNuevoPresupuestoVentas());
			
			int iLastRow =  this.jTableDatosPresupuestoVentas.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPresupuestoVentas.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPresupuestoVentas.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPresupuestoVentas(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPresupuestoVentasActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPresupuestoVentas(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresupuestoVentas(false);
			
			//SI ES MANUAL
			if(PresupuestoVentasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPresupuestoVentas();
			}
			
			//this.abrirFrameTreePresupuestoVentas();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPresupuestoVentasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Presupuesto VentasES ?", "MANTENIMIENTO DE Presupuesto Ventas", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionPresupuestoVentas.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralPresupuestoVentas();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.presupuestoventasReturnGeneral=presupuestoventasLogic.procesarImportacionPresupuestoVentassWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.presupuestoventasParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarPresupuestoVentasReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPresupuestoVentasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPresupuestoVentas.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPresupuestoVentas.setFileImportacion(this.jInternalFrameImportacionPresupuestoVentas.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPresupuestoVentas.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPresupuestoVentas.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPresupuestoVentas.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPresupuestoVentas.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPresupuestoVentasActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PresupuestoVentas> presupuestoventassSeleccionados=new ArrayList<PresupuestoVentas>();		

		presupuestoventassSeleccionados=this.getPresupuestoVentassSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresupuestoVentas.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresupuestoVentas.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PresupuestoVentasBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PresupuestoVentasBaseDesign.jrxml";
			
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
			
			this.generarReportePresupuestoVentass("Todos",presupuestoventassSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuesto Ventas",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPresupuestoVentas.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresupuestoVentas.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PresupuestoVentasConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoVentasConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoVentasConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoVentasConstantesFunciones.LABEL_IDPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Periodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Periodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Periodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Periodo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoVentasConstantesFunciones.LABEL_IDVENDEDOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Vendedor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Vendedor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Vendedor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Vendedor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoVentasConstantesFunciones.LABEL_IDPAIS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Pais_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Pais_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Pais_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Pais_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoVentasConstantesFunciones.LABEL_IDCIUDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ciudad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ciudad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ciudad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ciudad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoVentasConstantesFunciones.LABEL_IDZONA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Zona_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Zona_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Zona_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Zona_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoVentasConstantesFunciones.LABEL_IDPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Producto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Producto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Producto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Producto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoVentasConstantesFunciones.LABEL_PRECIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ecio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ecio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ecio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ecio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoVentasConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoVentasConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoVentasConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoVentasConstantesFunciones.LABEL_CANTIDADTOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidadTotal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidadTotal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidadTotal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidadTotal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoVentasConstantesFunciones.LABEL_VALORTOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorTotal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorTotal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorTotal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorTotal_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoPresupuestoVentas.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPresupuestoVentas.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPresupuestoVentas.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PresupuestoVentasConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoria="id_periodo";
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_IDVENDEDOR:
					sNombreCampoCategoria="id_vendedor";
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoria="id_pais";
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_IDCIUDAD:
					sNombreCampoCategoria="id_ciudad";
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_IDZONA:
					sNombreCampoCategoria="id_zona";
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoria="id_producto";
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoria="precio";
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_CANTIDADTOTAL:
					sNombreCampoCategoria="cantidad_total";
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_VALORTOTAL:
					sNombreCampoCategoria="valor_total";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPresupuestoVentas.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PresupuestoVentasConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoriaValor="id_periodo";
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_IDVENDEDOR:
					sNombreCampoCategoriaValor="id_vendedor";
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoriaValor="id_pais";
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_IDCIUDAD:
					sNombreCampoCategoriaValor="id_ciudad";
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_IDZONA:
					sNombreCampoCategoriaValor="id_zona";
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoriaValor="id_producto";
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoriaValor="precio";
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_CANTIDADTOTAL:
					sNombreCampoCategoriaValor="cantidad_total";
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_VALORTOTAL:
					sNombreCampoCategoriaValor="valor_total";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPresupuestoVentas.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresupuestoVentas.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PresupuestoVentasConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_IDPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo");
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_IDVENDEDOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Vendedor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_vendedor");
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_IDPAIS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pais",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pais");
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_IDCIUDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ciudad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ciudad");
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_IDZONA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Zona",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_zona");
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_IDPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto");
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_PRECIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Precio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"precio");
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantidad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad");
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_CANTIDADTOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantidad Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad_total");
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_VALORTOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_total");
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
	
	public void jButtonGenerarExcelReporteDinamicoPresupuestoVentasActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PresupuestoVentas> presupuestoventassSeleccionados=new ArrayList<PresupuestoVentas>();		
		
		presupuestoventassSeleccionados=this.getPresupuestoVentassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestoventas";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("PresupuestoVentass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPresupuestoVentas.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPresupuestoVentas.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PresupuestoVentasConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(PresupuestoVentas presupuestoventas:presupuestoventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoventas.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(PresupuestoVentas presupuestoventas:presupuestoventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoventas.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(PresupuestoVentas presupuestoventas:presupuestoventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoventas.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(PresupuestoVentas presupuestoventas:presupuestoventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoventas.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_IDVENDEDOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_IDVENDEDOR);
					iRow++;

					for(PresupuestoVentas presupuestoventas:presupuestoventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoventas.getvendedor_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_IDPAIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_IDPAIS);
					iRow++;

					for(PresupuestoVentas presupuestoventas:presupuestoventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoventas.getpais_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_IDCIUDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_IDCIUDAD);
					iRow++;

					for(PresupuestoVentas presupuestoventas:presupuestoventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoventas.getciudad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_IDZONA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_IDZONA);
					iRow++;

					for(PresupuestoVentas presupuestoventas:presupuestoventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoventas.getzona_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(PresupuestoVentas presupuestoventas:presupuestoventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoventas.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_PRECIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_PRECIO);
					iRow++;

					for(PresupuestoVentas presupuestoventas:presupuestoventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoventas.getprecio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(PresupuestoVentas presupuestoventas:presupuestoventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoventas.getcantidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(PresupuestoVentas presupuestoventas:presupuestoventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoventas.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(PresupuestoVentas presupuestoventas:presupuestoventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoventas.getporcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_CANTIDADTOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_CANTIDADTOTAL);
					iRow++;

					for(PresupuestoVentas presupuestoventas:presupuestoventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoventas.getcantidad_total());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoVentasConstantesFunciones.LABEL_VALORTOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_VALORTOTAL);
					iRow++;

					for(PresupuestoVentas presupuestoventas:presupuestoventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoventas.getvalor_total());
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
			//	this.getFilaCabeceraExportarExcelPresupuestoVentas(row);				
			//	iRow++;
			//}				
			
			//for(PresupuestoVentas presupuestoventasAux:presupuestoventassSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPresupuestoVentas(presupuestoventasAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuesto Ventas",JOptionPane.INFORMATION_MESSAGE);
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
				this.presupuestoventasLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresupuestoVentas(false);
			
			//SI ES MANUAL
			if(PresupuestoVentasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPresupuestoVentas();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPresupuestoVentasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresupuestoVentas(false);
			
			//SI ES MANUAL
			if(PresupuestoVentasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPresupuestoVentas();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPresupuestoVentasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresupuestoVentas(false);
			
			//SI ES MANUAL
			if(PresupuestoVentasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPresupuestoVentas();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPresupuestoVentas() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPresupuestoVentas.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPresupuestoVentas.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPresupuestoVentas.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPresupuestoVentas.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPresupuestoVentas.setMinimumSize(dimensionMinimum);
		this.jTableDatosPresupuestoVentas.setMaximumSize(dimensionMaximum);
		this.jTableDatosPresupuestoVentas.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPresupuestoVentas(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPresupuestoVentas(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPresupuestoVentas(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPresupuestoVentas(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPresupuestoVentas(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPresupuestoVentas(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPresupuestoVentas(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPresupuestoVentas(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PresupuestoVentasJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PresupuestoVentasJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPresupuestoVentas() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPresupuestoVentas();
		
		this.inicializarActualizarBindingBotonesManualPresupuestoVentas(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPresupuestoVentas();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPresupuestoVentas() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPresupuestoVentas(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPresupuestoVentas(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPresupuestoVentas.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPresupuestoVentas.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePresupuestoVentas.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPresupuestoVentas.jCheckBoxPostAccionNuevoPresupuestoVentas.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPresupuestoVentas.jCheckBoxPostAccionSinCerrarPresupuestoVentas.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPresupuestoVentas.jCheckBoxPostAccionSinMensajePresupuestoVentas.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPresupuestoVentas.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPresupuestoVentas.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePresupuestoVentas.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
				this.jInternalFrameDetalleFormPresupuestoVentas.jCheckBoxPostAccionNuevoPresupuestoVentas.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPresupuestoVentas.jCheckBoxPostAccionSinCerrarPresupuestoVentas.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPresupuestoVentas.jCheckBoxPostAccionSinMensajePresupuestoVentas.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPresupuestoVentas.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPresupuestoVentas.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxTiposAccionesFormularioPresupuestoVentas.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPresupuestoVentas.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPresupuestoVentas!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresupuestoVentas.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPresupuestoVentas.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPresupuestoVentas.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPresupuestoVentas.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPresupuestoVentas.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPresupuestoVentas!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresupuestoVentas.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPresupuestoVentas.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPresupuestoVentas.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPresupuestoVentas(Boolean esInicializar) throws Exception {
		try	{	
			if(PresupuestoVentasJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPresupuestoVentas(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPresupuestoVentas() throws Exception {
		try	{
			if(PresupuestoVentasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPresupuestoVentas();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePresupuestoVentas() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxTiposAccionesFormularioPresupuestoVentas.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxTiposAccionesFormularioPresupuestoVentas.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPresupuestoVentas() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPresupuestoVentas.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPresupuestoVentas.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPresupuestoVentas.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPresupuestoVentas.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPresupuestoVentas.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPresupuestoVentas.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPresupuestoVentas.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPresupuestoVentas.addItem(reporte);
			}
			
			
			if(!this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPresupuestoVentas.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPresupuestoVentas.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPresupuestoVentas.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPresupuestoVentas.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPresupuestoVentas.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPresupuestoVentas.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxTiposAccionesFormularioPresupuestoVentas.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxTiposAccionesFormularioPresupuestoVentas.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPresupuestoVentas.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPresupuestoVentas.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPresupuestoVentas.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPresupuestoVentas();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPresupuestoVentas() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPresupuestoVentas!=null) {
				this.jInternalFrameReporteDinamicoPresupuestoVentas.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPresupuestoVentas.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPresupuestoVentas!=null) {
				this.jInternalFrameReporteDinamicoPresupuestoVentas.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPresupuestoVentas.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPresupuestoVentas!=null) {
				
				if(this.jInternalFrameReporteDinamicoPresupuestoVentas.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPresupuestoVentas.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPresupuestoVentas.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPresupuestoVentas.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPresupuestoVentas.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPresupuestoVentas.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoPresupuestoVentas.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPresupuestoVentas.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=PresupuestoVentasConstantesFunciones.getTiposSeleccionarPresupuestoVentas(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPresupuestoVentas.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoPresupuestoVentas.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoPresupuestoVentas.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=PresupuestoVentasConstantesFunciones.getTiposSeleccionarPresupuestoVentas(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPresupuestoVentas.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoPresupuestoVentas.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPresupuestoVentas.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=PresupuestoVentasConstantesFunciones.getTiposSeleccionarPresupuestoVentas(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPresupuestoVentas.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoPresupuestoVentas.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoPresupuestoVentas.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoPresupuestoVentas.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPresupuestoVentas()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_ciudadFK_IdCiudadPresupuestoVentas.getSelectedItem()!=null){this.id_ciudadFK_IdCiudad=((Ciudad)this.jComboBoxid_ciudadFK_IdCiudadPresupuestoVentas.getSelectedItem()).getId();}
		if(this.jComboBoxid_paisFK_IdPaisPresupuestoVentas.getSelectedItem()!=null){this.id_paisFK_IdPais=((Pais)this.jComboBoxid_paisFK_IdPaisPresupuestoVentas.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoFK_IdProductoPresupuestoVentas.getSelectedItem()!=null){this.id_productoFK_IdProducto=((Producto)this.jComboBoxid_productoFK_IdProductoPresupuestoVentas.getSelectedItem()).getId();}
		if(this.jComboBoxid_vendedorFK_IdVendedorPresupuestoVentas.getSelectedItem()!=null){this.id_vendedorFK_IdVendedor=((Vendedor)this.jComboBoxid_vendedorFK_IdVendedorPresupuestoVentas.getSelectedItem()).getId();}
		if(this.jComboBoxid_zonaFK_IdZonaPresupuestoVentas.getSelectedItem()!=null){this.id_zonaFK_IdZona=((Zona)this.jComboBoxid_zonaFK_IdZonaPresupuestoVentas.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPresupuestoVentas(Boolean esInicializar) throws Exception {				
		if(PresupuestoVentasJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPresupuestoVentas();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPresupuestoVentas() throws Exception {
		this.inicializarActualizarBindingTablaPresupuestoVentas(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPresupuestoVentas() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPresupuestoVentas.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPresupuestoVentas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPresupuestoVentas.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PresupuestoVentasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPresupuestoVentas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPresupuestoVentas.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PresupuestoVentasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPresupuestoVentasOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoVentasOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PresupuestoVentasPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPresupuestoVentas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPresupuestoVentas.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PresupuestoVentasPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPresupuestoVentas.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPresupuestoVentas(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=presupuestoventasLogic.getPresupuestoVentass().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=presupuestoventass.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PresupuestoVentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPresupuestoVentas.setModel(new PresupuestoVentasModel(this.presupuestoventasLogic.getPresupuestoVentass(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPresupuestoVentas.setModel(new PresupuestoVentasModel(this.presupuestoventass,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPresupuestoVentas!=null && this.jInternalFrameOrderByPresupuestoVentas.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPresupuestoVentas();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPresupuestoVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoVentas,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PresupuestoVentasPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO,presupuestoventasConstantesFunciones.resaltarSeleccionarPresupuestoVentas,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PresupuestoVentasConstantesFunciones.SCLASSWEBTITULO,presupuestoventasConstantesFunciones.resaltarSeleccionarPresupuestoVentas,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPresupuestoVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoVentas,PresupuestoVentasConstantesFunciones.LABEL_ID));

		if(this.presupuestoventasConstantesFunciones.mostraridPresupuestoVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoVentasConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presupuestoventasConstantesFunciones.resaltaridPresupuestoVentas,this.presupuestoventasConstantesFunciones.activaridPresupuestoVentas,iSizeTabla,this,true,"idPresupuestoVentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestoventasConstantesFunciones.resaltaridPresupuestoVentas,this.presupuestoventasConstantesFunciones.activaridPresupuestoVentas,this,true,"idPresupuestoVentas","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoVentas,PresupuestoVentasConstantesFunciones.LABEL_IDEMPRESA));

		if(this.presupuestoventasConstantesFunciones.mostrarid_empresaPresupuestoVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoVentasConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.presupuestoventasConstantesFunciones.resaltarid_empresaPresupuestoVentas,this,this.presupuestoventasConstantesFunciones.activarid_empresaPresupuestoVentas,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.presupuestoventasConstantesFunciones.resaltarid_empresaPresupuestoVentas,this,this.presupuestoventasConstantesFunciones.activarid_empresaPresupuestoVentas,false,"id_empresaPresupuestoVentas","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresupuestoVentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoVentas,PresupuestoVentasConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.presupuestoventasConstantesFunciones.mostrarid_sucursalPresupuestoVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoVentasConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.presupuestoventasConstantesFunciones.resaltarid_sucursalPresupuestoVentas,this,this.presupuestoventasConstantesFunciones.activarid_sucursalPresupuestoVentas,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.presupuestoventasConstantesFunciones.resaltarid_sucursalPresupuestoVentas,this,this.presupuestoventasConstantesFunciones.activarid_sucursalPresupuestoVentas,false,"id_sucursalPresupuestoVentas","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresupuestoVentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoVentas,PresupuestoVentasConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.presupuestoventasConstantesFunciones.mostrarid_ejercicioPresupuestoVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoVentasConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.presupuestoventasConstantesFunciones.resaltarid_ejercicioPresupuestoVentas,this,this.presupuestoventasConstantesFunciones.activarid_ejercicioPresupuestoVentas,iSizeTabla));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.presupuestoventasConstantesFunciones.resaltarid_ejercicioPresupuestoVentas,this,this.presupuestoventasConstantesFunciones.activarid_ejercicioPresupuestoVentas,false,"id_ejercicioPresupuestoVentas","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresupuestoVentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoVentas,PresupuestoVentasConstantesFunciones.LABEL_IDPERIODO));

		if(this.presupuestoventasConstantesFunciones.mostrarid_periodoPresupuestoVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoVentasConstantesFunciones.LABEL_IDPERIODO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new PeriodoTableCell(this.periodosForeignKey,this.presupuestoventasConstantesFunciones.resaltarid_periodoPresupuestoVentas,this,this.presupuestoventasConstantesFunciones.activarid_periodoPresupuestoVentas,iSizeTabla));
			tableColumn.setCellEditor(new PeriodoTableCell(this.periodosForeignKey,this.presupuestoventasConstantesFunciones.resaltarid_periodoPresupuestoVentas,this,this.presupuestoventasConstantesFunciones.activarid_periodoPresupuestoVentas,false,"id_periodoPresupuestoVentas","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresupuestoVentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoVentas,PresupuestoVentasConstantesFunciones.LABEL_IDVENDEDOR));

		if(this.presupuestoventasConstantesFunciones.mostrarid_vendedorPresupuestoVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoVentasConstantesFunciones.LABEL_IDVENDEDOR,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new VendedorTableCell(this.vendedorsForeignKey,this.presupuestoventasConstantesFunciones.resaltarid_vendedorPresupuestoVentas,this,this.presupuestoventasConstantesFunciones.activarid_vendedorPresupuestoVentas,iSizeTabla));
			tableColumn.setCellEditor(new VendedorTableCell(this.vendedorsForeignKey,this.presupuestoventasConstantesFunciones.resaltarid_vendedorPresupuestoVentas,this,this.presupuestoventasConstantesFunciones.activarid_vendedorPresupuestoVentas,true,"id_vendedorPresupuestoVentas","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresupuestoVentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoVentas,PresupuestoVentasConstantesFunciones.LABEL_IDPAIS));

		if(this.presupuestoventasConstantesFunciones.mostrarid_paisPresupuestoVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoVentasConstantesFunciones.LABEL_IDPAIS,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PaisTableCell(this.paissForeignKey,this.presupuestoventasConstantesFunciones.resaltarid_paisPresupuestoVentas,this,this.presupuestoventasConstantesFunciones.activarid_paisPresupuestoVentas,iSizeTabla));
			tableColumn.setCellEditor(new PaisTableCell(this.paissForeignKey,this.presupuestoventasConstantesFunciones.resaltarid_paisPresupuestoVentas,this,this.presupuestoventasConstantesFunciones.activarid_paisPresupuestoVentas,true,"id_paisPresupuestoVentas","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresupuestoVentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoVentas,PresupuestoVentasConstantesFunciones.LABEL_IDCIUDAD));

		if(this.presupuestoventasConstantesFunciones.mostrarid_ciudadPresupuestoVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoVentasConstantesFunciones.LABEL_IDCIUDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CiudadTableCell(this.ciudadsForeignKey,this.presupuestoventasConstantesFunciones.resaltarid_ciudadPresupuestoVentas,this,this.presupuestoventasConstantesFunciones.activarid_ciudadPresupuestoVentas,iSizeTabla));
			tableColumn.setCellEditor(new CiudadTableCell(this.ciudadsForeignKey,this.presupuestoventasConstantesFunciones.resaltarid_ciudadPresupuestoVentas,this,this.presupuestoventasConstantesFunciones.activarid_ciudadPresupuestoVentas,true,"id_ciudadPresupuestoVentas","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresupuestoVentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoVentas,PresupuestoVentasConstantesFunciones.LABEL_IDZONA));

		if(this.presupuestoventasConstantesFunciones.mostrarid_zonaPresupuestoVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoVentasConstantesFunciones.LABEL_IDZONA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ZonaTableCell(this.zonasForeignKey,this.presupuestoventasConstantesFunciones.resaltarid_zonaPresupuestoVentas,this,this.presupuestoventasConstantesFunciones.activarid_zonaPresupuestoVentas,iSizeTabla));
			tableColumn.setCellEditor(new ZonaTableCell(this.zonasForeignKey,this.presupuestoventasConstantesFunciones.resaltarid_zonaPresupuestoVentas,this,this.presupuestoventasConstantesFunciones.activarid_zonaPresupuestoVentas,true,"id_zonaPresupuestoVentas","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresupuestoVentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoVentas,PresupuestoVentasConstantesFunciones.LABEL_IDPRODUCTO));

		if(this.presupuestoventasConstantesFunciones.mostrarid_productoPresupuestoVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoVentasConstantesFunciones.LABEL_IDPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoTableCell(this.productosForeignKey,this.presupuestoventasConstantesFunciones.resaltarid_productoPresupuestoVentas,this,this.presupuestoventasConstantesFunciones.activarid_productoPresupuestoVentas,iSizeTabla));
			tableColumn.setCellEditor(new ProductoTableCell(this.productosForeignKey,this.presupuestoventasConstantesFunciones.resaltarid_productoPresupuestoVentas,this,this.presupuestoventasConstantesFunciones.activarid_productoPresupuestoVentas,true,"id_productoPresupuestoVentas","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new PresupuestoVentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoVentas,PresupuestoVentasConstantesFunciones.LABEL_PRECIO));

		if(this.presupuestoventasConstantesFunciones.mostrarprecioPresupuestoVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoVentasConstantesFunciones.LABEL_PRECIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presupuestoventasConstantesFunciones.resaltarprecioPresupuestoVentas,this.presupuestoventasConstantesFunciones.activarprecioPresupuestoVentas,iSizeTabla,this,true,"precioPresupuestoVentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestoventasConstantesFunciones.resaltarprecioPresupuestoVentas,this.presupuestoventasConstantesFunciones.activarprecioPresupuestoVentas,this,true,"precioPresupuestoVentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PresupuestoVentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoVentas,PresupuestoVentasConstantesFunciones.LABEL_CANTIDAD));

		if(this.presupuestoventasConstantesFunciones.mostrarcantidadPresupuestoVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoVentasConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presupuestoventasConstantesFunciones.resaltarcantidadPresupuestoVentas,this.presupuestoventasConstantesFunciones.activarcantidadPresupuestoVentas,iSizeTabla,this,true,"cantidadPresupuestoVentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestoventasConstantesFunciones.resaltarcantidadPresupuestoVentas,this.presupuestoventasConstantesFunciones.activarcantidadPresupuestoVentas,this,true,"cantidadPresupuestoVentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PresupuestoVentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoVentas,PresupuestoVentasConstantesFunciones.LABEL_VALOR));

		if(this.presupuestoventasConstantesFunciones.mostrarvalorPresupuestoVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoVentasConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presupuestoventasConstantesFunciones.resaltarvalorPresupuestoVentas,this.presupuestoventasConstantesFunciones.activarvalorPresupuestoVentas,iSizeTabla,this,true,"valorPresupuestoVentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestoventasConstantesFunciones.resaltarvalorPresupuestoVentas,this.presupuestoventasConstantesFunciones.activarvalorPresupuestoVentas,this,true,"valorPresupuestoVentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PresupuestoVentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoVentas,PresupuestoVentasConstantesFunciones.LABEL_PORCENTAJE));

		if(this.presupuestoventasConstantesFunciones.mostrarporcentajePresupuestoVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoVentasConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presupuestoventasConstantesFunciones.resaltarporcentajePresupuestoVentas,this.presupuestoventasConstantesFunciones.activarporcentajePresupuestoVentas,iSizeTabla,this,true,"porcentajePresupuestoVentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestoventasConstantesFunciones.resaltarporcentajePresupuestoVentas,this.presupuestoventasConstantesFunciones.activarporcentajePresupuestoVentas,this,true,"porcentajePresupuestoVentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PresupuestoVentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoVentas,PresupuestoVentasConstantesFunciones.LABEL_CANTIDADTOTAL));

		if(this.presupuestoventasConstantesFunciones.mostrarcantidad_totalPresupuestoVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoVentasConstantesFunciones.LABEL_CANTIDADTOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presupuestoventasConstantesFunciones.resaltarcantidad_totalPresupuestoVentas,this.presupuestoventasConstantesFunciones.activarcantidad_totalPresupuestoVentas,iSizeTabla,this,true,"cantidad_totalPresupuestoVentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestoventasConstantesFunciones.resaltarcantidad_totalPresupuestoVentas,this.presupuestoventasConstantesFunciones.activarcantidad_totalPresupuestoVentas,this,true,"cantidad_totalPresupuestoVentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PresupuestoVentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoVentas,PresupuestoVentasConstantesFunciones.LABEL_VALORTOTAL));

		if(this.presupuestoventasConstantesFunciones.mostrarvalor_totalPresupuestoVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoVentasConstantesFunciones.LABEL_VALORTOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presupuestoventasConstantesFunciones.resaltarvalor_totalPresupuestoVentas,this.presupuestoventasConstantesFunciones.activarvalor_totalPresupuestoVentas,iSizeTabla,this,true,"valor_totalPresupuestoVentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestoventasConstantesFunciones.resaltarvalor_totalPresupuestoVentas,this.presupuestoventasConstantesFunciones.activarvalor_totalPresupuestoVentas,this,true,"valor_totalPresupuestoVentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PresupuestoVentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.presupuestoventasSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.presupuestoventasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.presupuestoventasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPresupuestoVentas.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.presupuestoventasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.presupuestoventasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPresupuestoVentas.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPresupuestoVentas && this.isPermisoGuardarCambiosPresupuestoVentas) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.presupuestoventasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.presupuestoventasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPresupuestoVentas.addColumn(tableColumn);
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
			
			this.jTableDatosPresupuestoVentas.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPresupuestoVentas && this.isPermisoGuardarCambiosPresupuestoVentas) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPresupuestoVentas && this.isPermisoGuardarCambiosPresupuestoVentas) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPresupuestoVentas.moveColumn(this.jTableDatosPresupuestoVentas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPresupuestoVentas.moveColumn(this.jTableDatosPresupuestoVentas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPresupuestoVentas.moveColumn(this.jTableDatosPresupuestoVentas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPresupuestoVentas.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPresupuestoVentas.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPresupuestoVentas,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PresupuestoVentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPresupuestoVentas.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPresupuestoVentas.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PresupuestoVentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PresupuestoVentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPresupuestoVentas.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPresupuestoVentas.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPresupuestoVentas.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=presupuestoventasLogic.getPresupuestoVentass().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=presupuestoventass.size()-1;
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
		//this.jTableDatosPresupuestoVentas.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPresupuestoVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPresupuestoVentas();
			
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
				
				//this.isEsNuevoPresupuestoVentas=false;
					
				PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
			
				if(this.presupuestoventasSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPresupuestoVentas==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPresupuestoVentas.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPresupuestoVentas.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventas =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestoventas =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.presupuestoventas.getsType().equals("DUPLICADO")
				   || this.presupuestoventas.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPresupuestoVentas=true;
				
				} else {
					this.isEsNuevoPresupuestoVentas=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {
					if(this.presupuestoventas.getId()>=0 && !this.presupuestoventas.getIsNew()) {						
						this.isEsNuevoPresupuestoVentas=false;
						
					} else {
						this.isEsNuevoPresupuestoVentas=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPresupuestoVentas(esRelaciones);						
				
				this.seleccionarPresupuestoVentas(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.presupuestoventas.getId()<0) {
					this.isEsNuevoPresupuestoVentas=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPresupuestoVentas(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPresupuestoVentas(evt,rowIndex);
				}	
				
				if(this.presupuestoventasSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PresupuestoVentas: " + this.dDif); 
					}
				}								
				
				PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPresupuestoVentas(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.presupuestoventas)) {
					if(this.presupuestoventas.getId()>0) {
						this.presupuestoventas.setIsDeleted(true);
						
						this.presupuestoventassEliminados.add(this.presupuestoventas);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.presupuestoventasLogic.getPresupuestoVentass().remove(this.presupuestoventas);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.presupuestoventass.remove(this.presupuestoventas);				
					}
					
					
					((PresupuestoVentasModel) this.jTableDatosPresupuestoVentas.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPresupuestoVentas(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPresupuestoVentas(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPresupuestoVentas) {
			
			if(this.jInternalFrameDetalleFormPresupuestoVentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPresupuestoVentas.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPresupuestoVentas.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventas =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestoventas =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PresupuestoVentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPresupuestoVentas(this.presupuestoventas);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.presupuestoventasConstantesFunciones.cargarid_empresaPresupuestoVentas || this.presupuestoventasConstantesFunciones.event_dependid_empresaPresupuestoVentas) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.presupuestoventas.getid_empresa());
									//this.inicializarActualizarBindingPresupuestoVentas(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(presupuestoventas.getEmpresa()!=null) {
							this.empresasForeignKey.add(presupuestoventas.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.presupuestoventas.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.presupuestoventasConstantesFunciones.cargarid_sucursalPresupuestoVentas || this.presupuestoventasConstantesFunciones.event_dependid_sucursalPresupuestoVentas) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.presupuestoventas.getid_sucursal());
									//this.inicializarActualizarBindingPresupuestoVentas(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(presupuestoventas.getSucursal()!=null) {
							this.sucursalsForeignKey.add(presupuestoventas.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.presupuestoventas.getid_sucursal(),false,"Formulario");

					//Ejercicio
					if(!this.presupuestoventasConstantesFunciones.cargarid_ejercicioPresupuestoVentas || this.presupuestoventasConstantesFunciones.event_dependid_ejercicioPresupuestoVentas) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.presupuestoventas.getid_ejercicio());
									//this.inicializarActualizarBindingPresupuestoVentas(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(presupuestoventas.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(presupuestoventas.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.presupuestoventas.getid_ejercicio(),false,"Formulario");

					//Periodo
					if(!this.presupuestoventasConstantesFunciones.cargarid_periodoPresupuestoVentas || this.presupuestoventasConstantesFunciones.event_dependid_periodoPresupuestoVentas) {
						//this.cargarCombosPeriodosForeignKeyLista(" where id="+this.presupuestoventas.getid_periodo());
									//this.inicializarActualizarBindingPresupuestoVentas(false,false);
						this.periodosForeignKey=new ArrayList<Periodo>();

						if(presupuestoventas.getPeriodo()!=null) {
							this.periodosForeignKey.add(presupuestoventas.getPeriodo());
						}

						this.addItemDefectoCombosForeignKeyPeriodo();
						this.cargarCombosFramePeriodosForeignKey("Todos");
					}
					this.setActualPeriodoForeignKey(this.presupuestoventas.getid_periodo(),false,"Formulario");

					//Vendedor
					if(!this.presupuestoventasConstantesFunciones.cargarid_vendedorPresupuestoVentas || this.presupuestoventasConstantesFunciones.event_dependid_vendedorPresupuestoVentas) {
						//this.cargarCombosVendedorsForeignKeyLista(" where id="+this.presupuestoventas.getid_vendedor());
									//this.inicializarActualizarBindingPresupuestoVentas(false,false);
						this.vendedorsForeignKey=new ArrayList<Vendedor>();

						if(presupuestoventas.getVendedor()!=null) {
							this.vendedorsForeignKey.add(presupuestoventas.getVendedor());
						}

						this.addItemDefectoCombosForeignKeyVendedor();
						this.cargarCombosFrameVendedorsForeignKey("Todos");
					}
					this.setActualVendedorForeignKey(this.presupuestoventas.getid_vendedor(),false,"Formulario");

					//Pais
					if(!this.presupuestoventasConstantesFunciones.cargarid_paisPresupuestoVentas || this.presupuestoventasConstantesFunciones.event_dependid_paisPresupuestoVentas) {
						//this.cargarCombosPaissForeignKeyLista(" where id="+this.presupuestoventas.getid_pais());
									//this.inicializarActualizarBindingPresupuestoVentas(false,false);
						this.paissForeignKey=new ArrayList<Pais>();

						if(presupuestoventas.getPais()!=null) {
							this.paissForeignKey.add(presupuestoventas.getPais());
						}

						this.addItemDefectoCombosForeignKeyPais();
						this.cargarCombosFramePaissForeignKey("Todos");
					}
					this.setActualPaisForeignKey(this.presupuestoventas.getid_pais(),false,"Formulario");

					//Ciudad
					if(!this.presupuestoventasConstantesFunciones.cargarid_ciudadPresupuestoVentas || this.presupuestoventasConstantesFunciones.event_dependid_ciudadPresupuestoVentas) {
						//this.cargarCombosCiudadsForeignKeyLista(" where id="+this.presupuestoventas.getid_ciudad());
									//this.inicializarActualizarBindingPresupuestoVentas(false,false);
						this.ciudadsForeignKey=new ArrayList<Ciudad>();

						if(presupuestoventas.getCiudad()!=null) {
							this.ciudadsForeignKey.add(presupuestoventas.getCiudad());
						}

						this.addItemDefectoCombosForeignKeyCiudad();
						this.cargarCombosFrameCiudadsForeignKey("Todos");
					}
					this.setActualCiudadForeignKey(this.presupuestoventas.getid_ciudad(),false,"Formulario");

					//Zona
					if(!this.presupuestoventasConstantesFunciones.cargarid_zonaPresupuestoVentas || this.presupuestoventasConstantesFunciones.event_dependid_zonaPresupuestoVentas) {
						//this.cargarCombosZonasForeignKeyLista(" where id="+this.presupuestoventas.getid_zona());
									//this.inicializarActualizarBindingPresupuestoVentas(false,false);
						this.zonasForeignKey=new ArrayList<Zona>();

						if(presupuestoventas.getZona()!=null) {
							this.zonasForeignKey.add(presupuestoventas.getZona());
						}

						this.addItemDefectoCombosForeignKeyZona();
						this.cargarCombosFrameZonasForeignKey("Todos");
					}
					this.setActualZonaForeignKey(this.presupuestoventas.getid_zona(),false,"Formulario");

					//Producto
					if(!this.presupuestoventasConstantesFunciones.cargarid_productoPresupuestoVentas || this.presupuestoventasConstantesFunciones.event_dependid_productoPresupuestoVentas) {
						//this.cargarCombosProductosForeignKeyLista(" where id="+this.presupuestoventas.getid_producto());
									//this.inicializarActualizarBindingPresupuestoVentas(false,false);
						this.productosForeignKey=new ArrayList<Producto>();

						if(presupuestoventas.getProducto()!=null) {
							this.productosForeignKey.add(presupuestoventas.getProducto());
						}

						this.addItemDefectoCombosForeignKeyProducto();
						this.cargarCombosFrameProductosForeignKey("Todos");
					}
					this.setActualProductoForeignKey(this.presupuestoventas.getid_producto(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPresupuestoVentas("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPresupuestoVentas(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPresupuestoVentas() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPresupuestoVentas(PresupuestoVentas presupuestoventas) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPresupuestoVentas(presupuestoventas,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPresupuestoVentas(PresupuestoVentas presupuestoventas,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPresupuestoVentas(presupuestoventas);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPresupuestoVentas(presupuestoventas,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPresupuestoVentas(presupuestoventas);
	}
	
	public void setVariablesObjetoActualToFormularioPresupuestoVentas(PresupuestoVentas presupuestoventas) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPresupuestoVentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPresupuestoVentas.jLabelidPresupuestoVentas.setText(presupuestoventas.getId().toString());
			this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldprecioPresupuestoVentas.setText(presupuestoventas.getprecio().toString());
			this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldcantidadPresupuestoVentas.setText(presupuestoventas.getcantidad().toString());
			this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldvalorPresupuestoVentas.setText(presupuestoventas.getvalor().toString());
			this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldporcentajePresupuestoVentas.setText(presupuestoventas.getporcentaje().toString());
			this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldcantidad_totalPresupuestoVentas.setText(presupuestoventas.getcantidad_total().toString());
			this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldvalor_totalPresupuestoVentas.setText(presupuestoventas.getvalor_total().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PresupuestoVentas presupuestoventasLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,presupuestoventasLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PresupuestoVentas presupuestoventasLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				presupuestoventasLocal=this.presupuestoventas;
			} else {
				presupuestoventasLocal=this.presupuestoventasAnterior;
			}
		}
		
		if(this.permiteMantenimiento(presupuestoventasLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPresupuestoVentas(presupuestoventasLocal,true);
					
					if(presupuestoventasSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(presupuestoventasLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(presupuestoventasLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPresupuestoVentas(PresupuestoVentas presupuestoventas,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPresupuestoVentas(presupuestoventas,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(presupuestoventas);
	}
	
	public void setVariablesFormularioToObjetoActualPresupuestoVentas(PresupuestoVentas presupuestoventas,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPresupuestoVentas(presupuestoventas,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPresupuestoVentas(PresupuestoVentas presupuestoventas,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPresupuestoVentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPresupuestoVentas.jLabelidPresupuestoVentas.getText()==null || this.jInternalFrameDetalleFormPresupuestoVentas.jLabelidPresupuestoVentas.getText()=="" || this.jInternalFrameDetalleFormPresupuestoVentas.jLabelidPresupuestoVentas.getText()=="Id") {
				this.jInternalFrameDetalleFormPresupuestoVentas.jLabelidPresupuestoVentas.setText("0");
			}

			if(conColumnasBase) {presupuestoventas.setId(Long.parseLong(this.jInternalFrameDetalleFormPresupuestoVentas.jLabelidPresupuestoVentas.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestoVentasConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoVentas.jLabelIdPresupuestoVentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presupuestoventas.setprecio(Double.parseDouble(this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldprecioPresupuestoVentas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestoVentasConstantesFunciones.LABEL_PRECIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoVentas.jLabelprecioPresupuestoVentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presupuestoventas.setcantidad(Integer.parseInt(this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldcantidadPresupuestoVentas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestoVentasConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoVentas.jLabelcantidadPresupuestoVentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presupuestoventas.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldvalorPresupuestoVentas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestoVentasConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoVentas.jLabelvalorPresupuestoVentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presupuestoventas.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldporcentajePresupuestoVentas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestoVentasConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoVentas.jLabelporcentajePresupuestoVentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presupuestoventas.setcantidad_total(Integer.parseInt(this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldcantidad_totalPresupuestoVentas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestoVentasConstantesFunciones.LABEL_CANTIDADTOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoVentas.jLabelcantidad_totalPresupuestoVentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presupuestoventas.setvalor_total(Double.parseDouble(this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldvalor_totalPresupuestoVentas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestoVentasConstantesFunciones.LABEL_VALORTOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoVentas.jLabelvalor_totalPresupuestoVentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPresupuestoVentas(PresupuestoVentas presupuestoventasBean,PresupuestoVentas presupuestoventas,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && presupuestoventasBean.getid_vendedor()!=null && !presupuestoventasBean.getid_vendedor().equals(-1L))) {presupuestoventas.setid_vendedor(presupuestoventasBean.getid_vendedor());}
			if(conDefault || (!conDefault && presupuestoventasBean.getid_pais()!=null && !presupuestoventasBean.getid_pais().equals(-1L))) {presupuestoventas.setid_pais(presupuestoventasBean.getid_pais());}
			if(conDefault || (!conDefault && presupuestoventasBean.getid_ciudad()!=null && !presupuestoventasBean.getid_ciudad().equals(-1L))) {presupuestoventas.setid_ciudad(presupuestoventasBean.getid_ciudad());}
			if(conDefault || (!conDefault && presupuestoventasBean.getid_zona()!=null && !presupuestoventasBean.getid_zona().equals(null))) {presupuestoventas.setid_zona(presupuestoventasBean.getid_zona());}
			if(conDefault || (!conDefault && presupuestoventasBean.getid_producto()!=null && !presupuestoventasBean.getid_producto().equals(-1L))) {presupuestoventas.setid_producto(presupuestoventasBean.getid_producto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPresupuestoVentas(PresupuestoVentas presupuestoventasOrigen,PresupuestoVentas presupuestoventas,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && presupuestoventasOrigen.getId()!=null && !presupuestoventasOrigen.getId().equals(0L))) {presupuestoventas.setId(presupuestoventasOrigen.getId());}}
			if(conDefault || (!conDefault && presupuestoventasOrigen.getid_vendedor()!=null && !presupuestoventasOrigen.getid_vendedor().equals(-1L))) {presupuestoventas.setid_vendedor(presupuestoventasOrigen.getid_vendedor());}
			if(conDefault || (!conDefault && presupuestoventasOrigen.getid_pais()!=null && !presupuestoventasOrigen.getid_pais().equals(-1L))) {presupuestoventas.setid_pais(presupuestoventasOrigen.getid_pais());}
			if(conDefault || (!conDefault && presupuestoventasOrigen.getid_ciudad()!=null && !presupuestoventasOrigen.getid_ciudad().equals(-1L))) {presupuestoventas.setid_ciudad(presupuestoventasOrigen.getid_ciudad());}
			if(conDefault || (!conDefault && presupuestoventasOrigen.getid_zona()!=null && !presupuestoventasOrigen.getid_zona().equals(null))) {presupuestoventas.setid_zona(presupuestoventasOrigen.getid_zona());}
			if(conDefault || (!conDefault && presupuestoventasOrigen.getid_producto()!=null && !presupuestoventasOrigen.getid_producto().equals(-1L))) {presupuestoventas.setid_producto(presupuestoventasOrigen.getid_producto());}
			if(conDefault || (!conDefault && presupuestoventasOrigen.getprecio()!=null && !presupuestoventasOrigen.getprecio().equals(0.0))) {presupuestoventas.setprecio(presupuestoventasOrigen.getprecio());}
			if(conDefault || (!conDefault && presupuestoventasOrigen.getcantidad()!=null && !presupuestoventasOrigen.getcantidad().equals(0))) {presupuestoventas.setcantidad(presupuestoventasOrigen.getcantidad());}
			if(conDefault || (!conDefault && presupuestoventasOrigen.getvalor()!=null && !presupuestoventasOrigen.getvalor().equals(0.0))) {presupuestoventas.setvalor(presupuestoventasOrigen.getvalor());}
			if(conDefault || (!conDefault && presupuestoventasOrigen.getporcentaje()!=null && !presupuestoventasOrigen.getporcentaje().equals(0.0))) {presupuestoventas.setporcentaje(presupuestoventasOrigen.getporcentaje());}
			if(conDefault || (!conDefault && presupuestoventasOrigen.getcantidad_total()!=null && !presupuestoventasOrigen.getcantidad_total().equals(0))) {presupuestoventas.setcantidad_total(presupuestoventasOrigen.getcantidad_total());}
			if(conDefault || (!conDefault && presupuestoventasOrigen.getvalor_total()!=null && !presupuestoventasOrigen.getvalor_total().equals(0.0))) {presupuestoventas.setvalor_total(presupuestoventasOrigen.getvalor_total());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPresupuestoVentas(PresupuestoVentas presupuestoventas) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPresupuestoVentas.jLabelidPresupuestoVentas.setText(presupuestoventas.getId().toString());
			this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldprecioPresupuestoVentas.setText(presupuestoventas.getprecio().toString());
			this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldcantidadPresupuestoVentas.setText(presupuestoventas.getcantidad().toString());
			this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldvalorPresupuestoVentas.setText(presupuestoventas.getvalor().toString());
			this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldporcentajePresupuestoVentas.setText(presupuestoventas.getporcentaje().toString());
			this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldcantidad_totalPresupuestoVentas.setText(presupuestoventas.getcantidad_total().toString());
			this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldvalor_totalPresupuestoVentas.setText(presupuestoventas.getvalor_total().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPresupuestoVentas(PresupuestoVentasBean presupuestoventasBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPresupuestoVentas.jLabelidPresupuestoVentas.setText(presupuestoventasBean.getId().toString());
			this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldprecioPresupuestoVentas.setText(presupuestoventasBean.getprecio().toString());
			this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldcantidadPresupuestoVentas.setText(presupuestoventasBean.getcantidad().toString());
			this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldvalorPresupuestoVentas.setText(presupuestoventasBean.getvalor().toString());
			this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldporcentajePresupuestoVentas.setText(presupuestoventasBean.getporcentaje().toString());
			this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldcantidad_totalPresupuestoVentas.setText(presupuestoventasBean.getcantidad_total().toString());
			this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldvalor_totalPresupuestoVentas.setText(presupuestoventasBean.getvalor_total().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPresupuestoVentas(PresupuestoVentasParameterReturnGeneral presupuestoventasReturnGeneral,PresupuestoVentasBean presupuestoventasBean,Boolean conDefault) throws Exception { 
		try {
			PresupuestoVentas presupuestoventasLocal=new PresupuestoVentas();
			
			presupuestoventasLocal=presupuestoventasReturnGeneral.getPresupuestoVentas();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && presupuestoventasLocal.getId()!=null && !presupuestoventasLocal.getId().equals(0L))) {presupuestoventasBean.setId(presupuestoventasLocal.getId());}}
			if(conDefault || (!conDefault && presupuestoventasLocal.getid_vendedor()!=null && !presupuestoventasLocal.getid_vendedor().equals(-1L))) {presupuestoventasBean.setid_vendedor(presupuestoventasLocal.getid_vendedor());}
			if(conDefault || (!conDefault && presupuestoventasLocal.getid_pais()!=null && !presupuestoventasLocal.getid_pais().equals(-1L))) {presupuestoventasBean.setid_pais(presupuestoventasLocal.getid_pais());}
			if(conDefault || (!conDefault && presupuestoventasLocal.getid_ciudad()!=null && !presupuestoventasLocal.getid_ciudad().equals(-1L))) {presupuestoventasBean.setid_ciudad(presupuestoventasLocal.getid_ciudad());}
			if(conDefault || (!conDefault && presupuestoventasLocal.getid_zona()!=null && !presupuestoventasLocal.getid_zona().equals(null))) {presupuestoventasBean.setid_zona(presupuestoventasLocal.getid_zona());}
			if(conDefault || (!conDefault && presupuestoventasLocal.getid_producto()!=null && !presupuestoventasLocal.getid_producto().equals(-1L))) {presupuestoventasBean.setid_producto(presupuestoventasLocal.getid_producto());}
			if(conDefault || (!conDefault && presupuestoventasLocal.getprecio()!=null && !presupuestoventasLocal.getprecio().equals(0.0))) {presupuestoventasBean.setprecio(presupuestoventasLocal.getprecio());}
			if(conDefault || (!conDefault && presupuestoventasLocal.getcantidad()!=null && !presupuestoventasLocal.getcantidad().equals(0))) {presupuestoventasBean.setcantidad(presupuestoventasLocal.getcantidad());}
			if(conDefault || (!conDefault && presupuestoventasLocal.getvalor()!=null && !presupuestoventasLocal.getvalor().equals(0.0))) {presupuestoventasBean.setvalor(presupuestoventasLocal.getvalor());}
			if(conDefault || (!conDefault && presupuestoventasLocal.getporcentaje()!=null && !presupuestoventasLocal.getporcentaje().equals(0.0))) {presupuestoventasBean.setporcentaje(presupuestoventasLocal.getporcentaje());}
			if(conDefault || (!conDefault && presupuestoventasLocal.getcantidad_total()!=null && !presupuestoventasLocal.getcantidad_total().equals(0))) {presupuestoventasBean.setcantidad_total(presupuestoventasLocal.getcantidad_total());}
			if(conDefault || (!conDefault && presupuestoventasLocal.getvalor_total()!=null && !presupuestoventasLocal.getvalor_total().equals(0.0))) {presupuestoventasBean.setvalor_total(presupuestoventasLocal.getvalor_total());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPresupuestoVentasGenerico(Long idPresupuestoVentasSeleccionado,JComboBox jComboBoxPresupuestoVentas,List<PresupuestoVentas> presupuestoventassLocal)throws Exception {
		try {
			PresupuestoVentas  presupuestoventasTemp=null;

			for(PresupuestoVentas presupuestoventasAux:presupuestoventassLocal) {
				if(presupuestoventasAux.getId()!=null && presupuestoventasAux.getId().equals(idPresupuestoVentasSeleccionado)) {
					presupuestoventasTemp=presupuestoventasAux;
					break;
				}
			}

			jComboBoxPresupuestoVentas.setSelectedItem(presupuestoventasTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPresupuestoVentasGenerico(JComboBox jComboBoxPresupuestoVentas,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPresupuestoVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPresupuestoVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPresupuestoVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPresupuestoVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPresupuestoVentas.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPresupuestoVentas.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPresupuestoVentas.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPresupuestoVentas.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPresupuestoVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPresupuestoVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			presupuestoventas=(PresupuestoVentas) presupuestoventasLogic.getPresupuestoVentass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			presupuestoventas =(PresupuestoVentas) presupuestoventass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!presupuestoventas.getIsNew() && !presupuestoventas.getIsChanged() && !presupuestoventas.getIsDeleted()) {
				sDescripcion=presupuestoventas.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=presupuestoventas.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!presupuestoventas.getIsNew() && !presupuestoventas.getIsChanged() && !presupuestoventas.getIsDeleted()) {
				sDescripcion=presupuestoventas.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=presupuestoventas.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!presupuestoventas.getIsNew() && !presupuestoventas.getIsChanged() && !presupuestoventas.getIsDeleted()) {
				sDescripcion=presupuestoventas.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=presupuestoventas.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!presupuestoventas.getIsNew() && !presupuestoventas.getIsChanged() && !presupuestoventas.getIsDeleted()) {
				sDescripcion=presupuestoventas.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=presupuestoventas.getperiodo_descripcion();
			}
		}

		if(sTipo.equals("Vendedor")) {
			//sDescripcion=this.getActualVendedorForeignKeyDescripcion((Long)value);
			if(!presupuestoventas.getIsNew() && !presupuestoventas.getIsChanged() && !presupuestoventas.getIsDeleted()) {
				sDescripcion=presupuestoventas.getvendedor_descripcion();
			} else {
				//sDescripcion=this.getActualVendedorForeignKeyDescripcion((Long)value);
				sDescripcion=presupuestoventas.getvendedor_descripcion();
			}
		}

		if(sTipo.equals("Pais")) {
			//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
			if(!presupuestoventas.getIsNew() && !presupuestoventas.getIsChanged() && !presupuestoventas.getIsDeleted()) {
				sDescripcion=presupuestoventas.getpais_descripcion();
			} else {
				//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
				sDescripcion=presupuestoventas.getpais_descripcion();
			}
		}

		if(sTipo.equals("Ciudad")) {
			//sDescripcion=this.getActualCiudadForeignKeyDescripcion((Long)value);
			if(!presupuestoventas.getIsNew() && !presupuestoventas.getIsChanged() && !presupuestoventas.getIsDeleted()) {
				sDescripcion=presupuestoventas.getciudad_descripcion();
			} else {
				//sDescripcion=this.getActualCiudadForeignKeyDescripcion((Long)value);
				sDescripcion=presupuestoventas.getciudad_descripcion();
			}
		}

		if(sTipo.equals("Zona")) {
			//sDescripcion=this.getActualZonaForeignKeyDescripcion((Long)value);
			if(!presupuestoventas.getIsNew() && !presupuestoventas.getIsChanged() && !presupuestoventas.getIsDeleted()) {
				sDescripcion=presupuestoventas.getzona_descripcion();
			} else {
				//sDescripcion=this.getActualZonaForeignKeyDescripcion((Long)value);
				sDescripcion=presupuestoventas.getzona_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!presupuestoventas.getIsNew() && !presupuestoventas.getIsChanged() && !presupuestoventas.getIsDeleted()) {
				sDescripcion=presupuestoventas.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=presupuestoventas.getproducto_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PresupuestoVentas presupuestoventasRow=new PresupuestoVentas();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			presupuestoventasRow=(PresupuestoVentas) presupuestoventasLogic.getPresupuestoVentass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			presupuestoventasRow=(PresupuestoVentas) presupuestoventass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPresupuestoVentas(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPresupuestoVentas.setVisible((this.isVisibilidadCeldaNuevoPresupuestoVentas && this.isPermisoNuevoPresupuestoVentas));			
			this.jButtonDuplicarPresupuestoVentas.setVisible((this.isVisibilidadCeldaDuplicarPresupuestoVentas && this.isPermisoDuplicarPresupuestoVentas));			
			this.jButtonCopiarPresupuestoVentas.setVisible((this.isVisibilidadCeldaCopiarPresupuestoVentas && this.isPermisoCopiarPresupuestoVentas));
			this.jButtonVerFormPresupuestoVentas.setVisible((this.isVisibilidadCeldaVerFormPresupuestoVentas && this.isPermisoVerFormPresupuestoVentas));
			
			this.jButtonAbrirOrderByPresupuestoVentas.setVisible((this.isVisibilidadCeldaOrdenPresupuestoVentas && this.isPermisoOrdenPresupuestoVentas));			
			
			this.jButtonNuevoRelacionesPresupuestoVentas.setVisible((this.isVisibilidadCeldaNuevoRelacionesPresupuestoVentas && this.isPermisoNuevoPresupuestoVentas));			
			this.jButtonNuevoGuardarCambiosPresupuestoVentas.setVisible((this.isVisibilidadCeldaNuevoPresupuestoVentas && this.isPermisoNuevoPresupuestoVentas && this.isPermisoGuardarCambiosPresupuestoVentas));
			
			if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
			this.jInternalFrameDetalleFormPresupuestoVentas.jButtonModificarPresupuestoVentas.setVisible((this.isVisibilidadCeldaModificarPresupuestoVentas && this.isPermisoActualizarPresupuestoVentas));	
			this.jInternalFrameDetalleFormPresupuestoVentas.jButtonActualizarPresupuestoVentas.setVisible((this.isVisibilidadCeldaActualizarPresupuestoVentas && this.isPermisoActualizarPresupuestoVentas));	
			this.jInternalFrameDetalleFormPresupuestoVentas.jButtonEliminarPresupuestoVentas.setVisible((this.isVisibilidadCeldaEliminarPresupuestoVentas && this.isPermisoEliminarPresupuestoVentas));
			this.jInternalFrameDetalleFormPresupuestoVentas.jButtonCancelarPresupuestoVentas.setVisible(this.isVisibilidadCeldaCancelarPresupuestoVentas);							
			this.jInternalFrameDetalleFormPresupuestoVentas.jButtonGuardarCambiosPresupuestoVentas.setVisible((this.isVisibilidadCeldaGuardarPresupuestoVentas && this.isPermisoGuardarCambiosPresupuestoVentas));			
			
			}
						
			this.jButtonGuardarCambiosTablaPresupuestoVentas.setVisible((this.isVisibilidadCeldaGuardarCambiosPresupuestoVentas && this.isPermisoGuardarCambiosPresupuestoVentas));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPresupuestoVentas.setVisible((this.isVisibilidadCeldaNuevoPresupuestoVentas && this.isPermisoNuevoPresupuestoVentas));						
			this.jButtonDuplicarToolBarPresupuestoVentas.setVisible((this.isVisibilidadCeldaDuplicarPresupuestoVentas && this.isPermisoDuplicarPresupuestoVentas));						
			this.jButtonCopiarToolBarPresupuestoVentas.setVisible((this.isVisibilidadCeldaCopiarPresupuestoVentas && this.isPermisoCopiarPresupuestoVentas));			
			this.jButtonVerFormToolBarPresupuestoVentas.setVisible((this.isVisibilidadCeldaVerFormPresupuestoVentas && this.isPermisoVerFormPresupuestoVentas));			
			this.jButtonAbrirOrderByToolBarPresupuestoVentas.setVisible((this.isVisibilidadCeldaOrdenPresupuestoVentas && this.isPermisoOrdenPresupuestoVentas));
			this.jButtonNuevoRelacionesToolBarPresupuestoVentas.setVisible((this.isVisibilidadCeldaNuevoRelacionesPresupuestoVentas && this.isPermisoNuevoPresupuestoVentas));			
			this.jButtonNuevoGuardarCambiosToolBarPresupuestoVentas.setVisible((this.isVisibilidadCeldaNuevoPresupuestoVentas && this.isPermisoNuevoPresupuestoVentas && this.isPermisoGuardarCambiosPresupuestoVentas));			
			
			if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
			this.jInternalFrameDetalleFormPresupuestoVentas.jButtonModificarToolBarPresupuestoVentas.setVisible((this.isVisibilidadCeldaModificarPresupuestoVentas && this.isPermisoActualizarPresupuestoVentas));	
			this.jInternalFrameDetalleFormPresupuestoVentas.jButtonActualizarToolBarPresupuestoVentas.setVisible((this.isVisibilidadCeldaActualizarPresupuestoVentas  && this.isPermisoActualizarPresupuestoVentas));	
			this.jInternalFrameDetalleFormPresupuestoVentas.jButtonEliminarToolBarPresupuestoVentas.setVisible((this.isVisibilidadCeldaEliminarPresupuestoVentas && this.isPermisoEliminarPresupuestoVentas));
			this.jInternalFrameDetalleFormPresupuestoVentas.jButtonCancelarToolBarPresupuestoVentas.setVisible(this.isVisibilidadCeldaCancelarPresupuestoVentas);				
			this.jInternalFrameDetalleFormPresupuestoVentas.jButtonGuardarCambiosToolBarPresupuestoVentas.setVisible((this.isVisibilidadCeldaGuardarPresupuestoVentas && this.isPermisoGuardarCambiosPresupuestoVentas));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPresupuestoVentas.setVisible((this.isVisibilidadCeldaGuardarCambiosPresupuestoVentas && this.isPermisoGuardarCambiosPresupuestoVentas));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPresupuestoVentas.setVisible((this.isVisibilidadCeldaNuevoPresupuestoVentas && this.isPermisoNuevoPresupuestoVentas));			
			this.jMenuItemDuplicarPresupuestoVentas.setVisible((this.isVisibilidadCeldaDuplicarPresupuestoVentas && this.isPermisoDuplicarPresupuestoVentas));			
			this.jMenuItemCopiarPresupuestoVentas.setVisible((this.isVisibilidadCeldaCopiarPresupuestoVentas && this.isPermisoCopiarPresupuestoVentas));			
			this.jMenuItemVerFormPresupuestoVentas.setVisible((this.isVisibilidadCeldaVerFormPresupuestoVentas && this.isPermisoVerFormPresupuestoVentas));			
			this.jMenuItemAbrirOrderByPresupuestoVentas.setVisible((this.isVisibilidadCeldaOrdenPresupuestoVentas && this.isPermisoOrdenPresupuestoVentas));			
			//this.jMenuItemMostrarOcultarPresupuestoVentas.setVisible((this.isVisibilidadCeldaOrdenPresupuestoVentas && this.isPermisoOrdenPresupuestoVentas));
			this.jMenuItemDetalleAbrirOrderByPresupuestoVentas.setVisible((this.isVisibilidadCeldaOrdenPresupuestoVentas && this.isPermisoOrdenPresupuestoVentas));			
			//this.jMenuItemDetalleMostrarOcultarPresupuestoVentas.setVisible((this.isVisibilidadCeldaOrdenPresupuestoVentas && this.isPermisoOrdenPresupuestoVentas));			
			this.jMenuItemNuevoRelacionesPresupuestoVentas.setVisible((this.isVisibilidadCeldaNuevoRelacionesPresupuestoVentas && this.isPermisoNuevoPresupuestoVentas));			
			this.jMenuItemNuevoGuardarCambiosPresupuestoVentas.setVisible((this.isVisibilidadCeldaNuevoPresupuestoVentas && this.isPermisoNuevoPresupuestoVentas && this.isPermisoGuardarCambiosPresupuestoVentas));									
			
			if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
			this.jInternalFrameDetalleFormPresupuestoVentas.jMenuItemModificarPresupuestoVentas.setVisible((this.isVisibilidadCeldaModificarPresupuestoVentas && this.isPermisoActualizarPresupuestoVentas));	
			this.jInternalFrameDetalleFormPresupuestoVentas.jMenuItemActualizarPresupuestoVentas.setVisible((this.isVisibilidadCeldaActualizarPresupuestoVentas && this.isPermisoActualizarPresupuestoVentas));	
			this.jInternalFrameDetalleFormPresupuestoVentas.jMenuItemEliminarPresupuestoVentas.setVisible((this.isVisibilidadCeldaEliminarPresupuestoVentas && this.isPermisoEliminarPresupuestoVentas));
			this.jInternalFrameDetalleFormPresupuestoVentas.jMenuItemCancelarPresupuestoVentas.setVisible(this.isVisibilidadCeldaCancelarPresupuestoVentas);				
			}
			
			this.jMenuItemGuardarCambiosPresupuestoVentas.setVisible((this.isVisibilidadCeldaGuardarPresupuestoVentas && this.isPermisoGuardarCambiosPresupuestoVentas));						
			this.jMenuItemGuardarCambiosTablaPresupuestoVentas.setVisible((this.isVisibilidadCeldaGuardarCambiosPresupuestoVentas && this.isPermisoGuardarCambiosPresupuestoVentas));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPresupuestoVentas=this.jButtonNuevoPresupuestoVentas.isVisible();
			this.isVisibilidadCeldaDuplicarPresupuestoVentas=this.jButtonDuplicarPresupuestoVentas.isVisible();
			this.isVisibilidadCeldaCopiarPresupuestoVentas=this.jButtonCopiarPresupuestoVentas.isVisible();
			this.isVisibilidadCeldaVerFormPresupuestoVentas=this.jButtonVerFormPresupuestoVentas.isVisible();
			
			this.isVisibilidadCeldaOrdenPresupuestoVentas=this.jButtonAbrirOrderByPresupuestoVentas.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoVentas=this.jButtonNuevoRelacionesPresupuestoVentas.isVisible();
			this.isVisibilidadCeldaModificarPresupuestoVentas=this.jButtonModificarPresupuestoVentas.isVisible();
			
			if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
			this.isVisibilidadCeldaActualizarPresupuestoVentas=this.jInternalFrameDetalleFormPresupuestoVentas.jButtonActualizarPresupuestoVentas.isVisible();
			this.isVisibilidadCeldaEliminarPresupuestoVentas=this.jInternalFrameDetalleFormPresupuestoVentas.jButtonEliminarPresupuestoVentas.isVisible();
			this.isVisibilidadCeldaCancelarPresupuestoVentas=this.jInternalFrameDetalleFormPresupuestoVentas.jButtonCancelarPresupuestoVentas.isVisible();
			this.isVisibilidadCeldaGuardarPresupuestoVentas=this.jInternalFrameDetalleFormPresupuestoVentas.jButtonGuardarCambiosPresupuestoVentas.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPresupuestoVentas=this.jButtonGuardarCambiosTablaPresupuestoVentas.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPresupuestoVentas=this.jButtonNuevoToolBarPresupuestoVentas.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoVentas=this.jButtonNuevoRelacionesToolBarPresupuestoVentas.isVisible();
			
			if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
			this.isVisibilidadCeldaModificarPresupuestoVentas=this.jInternalFrameDetalleFormPresupuestoVentas.jButtonModificarToolBarPresupuestoVentas.isVisible();
			this.isVisibilidadCeldaActualizarPresupuestoVentas=this.jInternalFrameDetalleFormPresupuestoVentas.jButtonActualizarToolBarPresupuestoVentas.isVisible();
			this.isVisibilidadCeldaEliminarPresupuestoVentas=this.jInternalFrameDetalleFormPresupuestoVentas.jButtonEliminarToolBarPresupuestoVentas.isVisible();
			this.isVisibilidadCeldaCancelarPresupuestoVentas=this.jInternalFrameDetalleFormPresupuestoVentas.jButtonCancelarToolBarPresupuestoVentas.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPresupuestoVentas=this.jButtonGuardarCambiosToolBarPresupuestoVentas.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPresupuestoVentas=this.jButtonGuardarCambiosTablaToolBarPresupuestoVentas.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPresupuestoVentas=this.jMenuItemNuevoPresupuestoVentas.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoVentas=this.jMenuItemNuevoRelacionesPresupuestoVentas.isVisible();
			
			if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
			this.isVisibilidadCeldaModificarPresupuestoVentas=this.jInternalFrameDetalleFormPresupuestoVentas.jMenuItemModificarPresupuestoVentas.isVisible();
			this.isVisibilidadCeldaActualizarPresupuestoVentas=this.jInternalFrameDetalleFormPresupuestoVentas.jMenuItemActualizarPresupuestoVentas.isVisible();
			this.isVisibilidadCeldaEliminarPresupuestoVentas=this.jInternalFrameDetalleFormPresupuestoVentas.jMenuItemEliminarPresupuestoVentas.isVisible();
			this.isVisibilidadCeldaCancelarPresupuestoVentas=this.jInternalFrameDetalleFormPresupuestoVentas.jMenuItemCancelarPresupuestoVentas.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPresupuestoVentas=this.jMenuItemGuardarCambiosPresupuestoVentas.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPresupuestoVentas=this.jMenuItemGuardarCambiosTablaPresupuestoVentas.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPresupuestoVentas(Boolean esInicializar) {
		if(PresupuestoVentasJInternalFrame.ISBINDING_MANUAL) {			
			if(this.presupuestoventasSessionBean.getConGuardarRelaciones()) {
				//if(this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPresupuestoVentas();
			}
			
			this.inicializarActualizarBindingBotonesManualPresupuestoVentas(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPresupuestoVentas() {
		this.jButtonNuevoPresupuestoVentas.setVisible(this.isPermisoNuevoPresupuestoVentas);			
		this.jButtonDuplicarPresupuestoVentas.setVisible(this.isPermisoDuplicarPresupuestoVentas);			
		this.jButtonCopiarPresupuestoVentas.setVisible(this.isPermisoCopiarPresupuestoVentas);			
		this.jButtonVerFormPresupuestoVentas.setVisible(this.isPermisoVerFormPresupuestoVentas);			
		
		this.jButtonAbrirOrderByPresupuestoVentas.setVisible(this.isPermisoOrdenPresupuestoVentas);					
		
		this.jButtonNuevoRelacionesPresupuestoVentas.setVisible(this.isPermisoNuevoPresupuestoVentas);			
		
		if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoVentas.jButtonModificarPresupuestoVentas.setVisible(this.isPermisoActualizarPresupuestoVentas);	
			this.jInternalFrameDetalleFormPresupuestoVentas.jButtonActualizarPresupuestoVentas.setVisible(this.isPermisoActualizarPresupuestoVentas);	
			this.jInternalFrameDetalleFormPresupuestoVentas.jButtonEliminarPresupuestoVentas.setVisible(this.isPermisoEliminarPresupuestoVentas);
			this.jInternalFrameDetalleFormPresupuestoVentas.jButtonCancelarPresupuestoVentas.setVisible(this.isVisibilidadCeldaCancelarPresupuestoVentas);						
			this.jInternalFrameDetalleFormPresupuestoVentas.jButtonGuardarCambiosPresupuestoVentas.setVisible(this.isPermisoGuardarCambiosPresupuestoVentas);							
		}
		
		this.jButtonGuardarCambiosTablaPresupuestoVentas.setVisible(this.isPermisoActualizarPresupuestoVentas);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePresupuestoVentas() {
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonModificarPresupuestoVentas.setVisible(this.isPermisoActualizarPresupuestoVentas);	
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonActualizarPresupuestoVentas.setVisible(this.isPermisoActualizarPresupuestoVentas);	
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonEliminarPresupuestoVentas.setVisible(this.isPermisoEliminarPresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonCancelarPresupuestoVentas.setVisible(this.isVisibilidadCeldaCancelarPresupuestoVentas);							
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonGuardarCambiosPresupuestoVentas.setVisible((this.isVisibilidadCeldaGuardarPresupuestoVentas && this.isPermisoGuardarCambiosPresupuestoVentas));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPresupuestoVentas() {
		if(PresupuestoVentasJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPresupuestoVentas();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPresupuestoVentas() {
	}
	
	public void jTableDatosPresupuestoVentasListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPresupuestoVentas(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPresupuestoVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.getpresupuestoventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoventas =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoventas =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoventas==null) {
						this.presupuestoventas = new PresupuestoVentas();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.presupuestoventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);
				}

				if(this.presupuestoventas.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.presupuestoventas.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaPresupuestoVentasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebPresupuestoVentas(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresupuestoVentas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresupuestoVentas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventas =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestoventas =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.getpresupuestoventas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.presupuestoventasLogic.getConnexion());

				if(this.presupuestoventas.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.presupuestoventas.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresupuestoVentas=(TitledBorder)this.jScrollPanelDatosPresupuestoVentas.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderPresupuestoVentas.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaPresupuestoVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.getpresupuestoventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoventas =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoventas =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoventas==null) {
						this.presupuestoventas = new PresupuestoVentas();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.presupuestoventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);
				}

				if(this.presupuestoventas.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.presupuestoventas.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalPresupuestoVentasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebPresupuestoVentas(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresupuestoVentas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresupuestoVentas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventas =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestoventas =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.getpresupuestoventas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.presupuestoventasLogic.getConnexion());

				if(this.presupuestoventas.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.presupuestoventas.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresupuestoVentas=(TitledBorder)this.jScrollPanelDatosPresupuestoVentas.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderPresupuestoVentas.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalPresupuestoVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.getpresupuestoventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoventas =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoventas =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoventas==null) {
						this.presupuestoventas = new PresupuestoVentas();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.presupuestoventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);
				}

				if(this.presupuestoventas.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.presupuestoventas.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioPresupuestoVentasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebPresupuestoVentas(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresupuestoVentas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresupuestoVentas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventas =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestoventas =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.getpresupuestoventas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.presupuestoventasLogic.getConnexion());

				if(this.presupuestoventas.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.presupuestoventas.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresupuestoVentas=(TitledBorder)this.jScrollPanelDatosPresupuestoVentas.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderPresupuestoVentas.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioPresupuestoVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.getpresupuestoventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoventas =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoventas =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoventas==null) {
						this.presupuestoventas = new PresupuestoVentas();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.presupuestoventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);
				}

				if(this.presupuestoventas.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.presupuestoventas.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoPresupuestoVentasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebPresupuestoVentas(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresupuestoVentas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresupuestoVentas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventas =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestoventas =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.getpresupuestoventas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.presupuestoventasLogic.getConnexion());

				if(this.presupuestoventas.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.presupuestoventas.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresupuestoVentas=(TitledBorder)this.jScrollPanelDatosPresupuestoVentas.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderPresupuestoVentas.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoPresupuestoVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.getpresupuestoventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoventas =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoventas =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoventas==null) {
						this.presupuestoventas = new PresupuestoVentas();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.presupuestoventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);
				}

				if(this.presupuestoventas.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.presupuestoventas.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_vendedorPresupuestoVentasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisovendedor=true;

			idTienePermisovendedor=this.tienePermisosUsuarioEnPaginaWebPresupuestoVentas(VendedorConstantesFunciones.CLASSNAME);

			if(idTienePermisovendedor) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresupuestoVentas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresupuestoVentas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventas =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestoventas =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.getpresupuestoventas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);

				this.vendedorBeanSwingJInternalFrame=new VendedorBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.vendedorBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.vendedorBeanSwingJInternalFrame.getVendedorLogic().setConnexion(this.presupuestoventasLogic.getConnexion());

				if(this.presupuestoventas.getid_vendedor()!=null) {
					this.vendedorBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.vendedorBeanSwingJInternalFrame.setIdActual(this.presupuestoventas.getid_vendedor());
					this.vendedorBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.vendedorBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.vendedorBeanSwingJInternalFrame.inicializarActualizarBindingTablaVendedor();
				}

				JInternalFrameBase jinternalFrame =this.vendedorBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresupuestoVentas=(TitledBorder)this.jScrollPanelDatosPresupuestoVentas.getBorder();
				TitledBorder titledBordervendedor=(TitledBorder)this.vendedorBeanSwingJInternalFrame.jScrollPanelDatosVendedor.getBorder();

				titledBordervendedor.setTitle(titledBorderPresupuestoVentas.getTitle() + " -> Vendedor");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_vendedorPresupuestoVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.getpresupuestoventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoventas =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoventas =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoventas==null) {
						this.presupuestoventas = new PresupuestoVentas();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.presupuestoventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);
				}

				if(this.presupuestoventas.getid_vendedor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_vendedor = "+this.presupuestoventas.getid_vendedor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_paisPresupuestoVentasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopais=true;

			idTienePermisopais=this.tienePermisosUsuarioEnPaginaWebPresupuestoVentas(PaisConstantesFunciones.CLASSNAME);

			if(idTienePermisopais) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresupuestoVentas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresupuestoVentas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventas =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestoventas =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.getpresupuestoventas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);

				this.paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.paisBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.paisBeanSwingJInternalFrame.getPaisLogic().setConnexion(this.presupuestoventasLogic.getConnexion());

				if(this.presupuestoventas.getid_pais()!=null) {
					this.paisBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.paisBeanSwingJInternalFrame.setIdActual(this.presupuestoventas.getid_pais());
					this.paisBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais();
				}

				JInternalFrameBase jinternalFrame =this.paisBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresupuestoVentas=(TitledBorder)this.jScrollPanelDatosPresupuestoVentas.getBorder();
				TitledBorder titledBorderpais=(TitledBorder)this.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getBorder();

				titledBorderpais.setTitle(titledBorderPresupuestoVentas.getTitle() + " -> Pais");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_paisPresupuestoVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.getpresupuestoventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoventas =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoventas =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoventas==null) {
						this.presupuestoventas = new PresupuestoVentas();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.presupuestoventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);
				}

				if(this.presupuestoventas.getid_pais()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pais = "+this.presupuestoventas.getid_pais().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ciudadPresupuestoVentasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisociudad=true;

			idTienePermisociudad=this.tienePermisosUsuarioEnPaginaWebPresupuestoVentas(CiudadConstantesFunciones.CLASSNAME);

			if(idTienePermisociudad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresupuestoVentas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresupuestoVentas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventas =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestoventas =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.getpresupuestoventas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);

				this.ciudadBeanSwingJInternalFrame=new CiudadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ciudadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ciudadBeanSwingJInternalFrame.getCiudadLogic().setConnexion(this.presupuestoventasLogic.getConnexion());

				if(this.presupuestoventas.getid_ciudad()!=null) {
					this.ciudadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ciudadBeanSwingJInternalFrame.setIdActual(this.presupuestoventas.getid_ciudad());
					this.ciudadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ciudadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ciudadBeanSwingJInternalFrame.inicializarActualizarBindingTablaCiudad();
				}

				JInternalFrameBase jinternalFrame =this.ciudadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresupuestoVentas=(TitledBorder)this.jScrollPanelDatosPresupuestoVentas.getBorder();
				TitledBorder titledBorderciudad=(TitledBorder)this.ciudadBeanSwingJInternalFrame.jScrollPanelDatosCiudad.getBorder();

				titledBorderciudad.setTitle(titledBorderPresupuestoVentas.getTitle() + " -> Ciudad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ciudadPresupuestoVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.getpresupuestoventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoventas =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoventas =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoventas==null) {
						this.presupuestoventas = new PresupuestoVentas();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.presupuestoventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);
				}

				if(this.presupuestoventas.getid_ciudad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ciudad = "+this.presupuestoventas.getid_ciudad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_zonaPresupuestoVentasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisozona=true;

			idTienePermisozona=this.tienePermisosUsuarioEnPaginaWebPresupuestoVentas(ZonaConstantesFunciones.CLASSNAME);

			if(idTienePermisozona) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresupuestoVentas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresupuestoVentas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventas =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestoventas =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.getpresupuestoventas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);

				this.zonaBeanSwingJInternalFrame=new ZonaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.zonaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.zonaBeanSwingJInternalFrame.getZonaLogic().setConnexion(this.presupuestoventasLogic.getConnexion());

				if(this.presupuestoventas.getid_zona()!=null) {
					this.zonaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.zonaBeanSwingJInternalFrame.setIdActual(this.presupuestoventas.getid_zona());
					this.zonaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.zonaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.zonaBeanSwingJInternalFrame.inicializarActualizarBindingTablaZona();
				}

				JInternalFrameBase jinternalFrame =this.zonaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresupuestoVentas=(TitledBorder)this.jScrollPanelDatosPresupuestoVentas.getBorder();
				TitledBorder titledBorderzona=(TitledBorder)this.zonaBeanSwingJInternalFrame.jScrollPanelDatosZona.getBorder();

				titledBorderzona.setTitle(titledBorderPresupuestoVentas.getTitle() + " -> Zona");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_zonaPresupuestoVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.getpresupuestoventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoventas =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoventas =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoventas==null) {
						this.presupuestoventas = new PresupuestoVentas();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.presupuestoventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);
				}

				if(this.presupuestoventas.getid_zona()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_zona = "+this.presupuestoventas.getid_zona().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoPresupuestoVentasActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderPresupuestoVentas=null;
			TitledBorder titledBorderproducto=null;

			if(!this.jScrollPanelDatosPresupuestoVentas.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderPresupuestoVentas=(TitledBorder)this.jScrollPanelDatosPresupuestoVentas.getBorder();
				titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderPresupuestoVentas.getTitle() + " -> Producto");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_productoPresupuestoVentasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebPresupuestoVentas(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresupuestoVentas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresupuestoVentas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventas =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestoventas =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.getpresupuestoventas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.presupuestoventasLogic.getConnexion());

				if(this.presupuestoventas.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.presupuestoventas.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresupuestoVentas=(TitledBorder)this.jScrollPanelDatosPresupuestoVentas.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderPresupuestoVentas.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoPresupuestoVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.getpresupuestoventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoventas =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoventas =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoventas==null) {
						this.presupuestoventas = new PresupuestoVentas();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.presupuestoventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);
				}

				if(this.presupuestoventas.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.presupuestoventas.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonprecioPresupuestoVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.getpresupuestoventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoventas =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoventas =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoventas==null) {
						this.presupuestoventas = new PresupuestoVentas();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.presupuestoventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);
				}

				if(this.presupuestoventas.getprecio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where precio = "+this.presupuestoventas.getprecio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadPresupuestoVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.getpresupuestoventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoventas =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoventas =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoventas==null) {
						this.presupuestoventas = new PresupuestoVentas();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.presupuestoventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);
				}

				if(this.presupuestoventas.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.presupuestoventas.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorPresupuestoVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.getpresupuestoventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoventas =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoventas =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoventas==null) {
						this.presupuestoventas = new PresupuestoVentas();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.presupuestoventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);
				}

				if(this.presupuestoventas.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.presupuestoventas.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajePresupuestoVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.getpresupuestoventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoventas =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoventas =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoventas==null) {
						this.presupuestoventas = new PresupuestoVentas();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.presupuestoventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);
				}

				if(this.presupuestoventas.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.presupuestoventas.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidad_totalPresupuestoVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.getpresupuestoventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoventas =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoventas =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoventas==null) {
						this.presupuestoventas = new PresupuestoVentas();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.presupuestoventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);
				}

				if(this.presupuestoventas.getcantidad_total()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad_total = "+this.presupuestoventas.getcantidad_total().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_totalPresupuestoVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.getpresupuestoventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoventas =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoventas =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoventas==null) {
						this.presupuestoventas = new PresupuestoVentas();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.presupuestoventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);
				}

				if(this.presupuestoventas.getvalor_total()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_total = "+this.presupuestoventas.getvalor_total().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCiudadPresupuestoVentasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresupuestoVentas(false,false);

			this.getPresupuestoVentassFK_IdCiudad();

			this.inicializarActualizarBindingPresupuestoVentas(false);

			//if(PresupuestoVentasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresupuestoVentas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioPresupuestoVentasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresupuestoVentas(false,false);

			this.getPresupuestoVentassFK_IdEjercicio();

			this.inicializarActualizarBindingPresupuestoVentas(false);

			//if(PresupuestoVentasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresupuestoVentas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaPresupuestoVentasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresupuestoVentas(false,false);

			this.getPresupuestoVentassFK_IdEmpresa();

			this.inicializarActualizarBindingPresupuestoVentas(false);

			//if(PresupuestoVentasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresupuestoVentas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPaisPresupuestoVentasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresupuestoVentas(false,false);

			this.getPresupuestoVentassFK_IdPais();

			this.inicializarActualizarBindingPresupuestoVentas(false);

			//if(PresupuestoVentasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresupuestoVentas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoPresupuestoVentasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresupuestoVentas(false,false);

			this.getPresupuestoVentassFK_IdPeriodo();

			this.inicializarActualizarBindingPresupuestoVentas(false);

			//if(PresupuestoVentasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresupuestoVentas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoPresupuestoVentasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresupuestoVentas(false,false);

			this.getPresupuestoVentassFK_IdProducto();

			this.inicializarActualizarBindingPresupuestoVentas(false);

			//if(PresupuestoVentasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresupuestoVentas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalPresupuestoVentasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresupuestoVentas(false,false);

			this.getPresupuestoVentassFK_IdSucursal();

			this.inicializarActualizarBindingPresupuestoVentas(false);

			//if(PresupuestoVentasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresupuestoVentas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdVendedorPresupuestoVentasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresupuestoVentas(false,false);

			this.getPresupuestoVentassFK_IdVendedor();

			this.inicializarActualizarBindingPresupuestoVentas(false);

			//if(PresupuestoVentasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresupuestoVentas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdZonaPresupuestoVentasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresupuestoVentas(false,false);

			this.getPresupuestoVentassFK_IdZona();

			this.inicializarActualizarBindingPresupuestoVentas(false);

			//if(PresupuestoVentasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresupuestoVentas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventasLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePresupuestoVentas() {
		if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
			this.jInternalFrameDetalleFormPresupuestoVentas.setVisible(false);	    			
			this.jInternalFrameDetalleFormPresupuestoVentas.dispose();
			this.jInternalFrameDetalleFormPresupuestoVentas=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPresupuestoVentas!=null) {
			this.jInternalFrameReporteDinamicoPresupuestoVentas.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPresupuestoVentas.dispose();
			this.jInternalFrameReporteDinamicoPresupuestoVentas=null;
		}
		
		if(this.jInternalFrameImportacionPresupuestoVentas!=null) {
			this.jInternalFrameImportacionPresupuestoVentas.setVisible(false);	    			
			this.jInternalFrameImportacionPresupuestoVentas.dispose();
			this.jInternalFrameImportacionPresupuestoVentas=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPresupuestoVentas();
			
			PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
			
			
			if(sTipo.equals("NuevoPresupuestoVentas")) {
				jButtonNuevoPresupuestoVentasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPresupuestoVentas")) {
				jButtonDuplicarPresupuestoVentasActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPresupuestoVentas")) {
				jButtonCopiarPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("VerFormPresupuestoVentas")) {
				jButtonVerFormPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPresupuestoVentas")) {
				jButtonNuevoPresupuestoVentasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPresupuestoVentas")) {
				jButtonDuplicarPresupuestoVentasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPresupuestoVentas")) {
				jButtonNuevoPresupuestoVentasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPresupuestoVentas")) {
				jButtonDuplicarPresupuestoVentasActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPresupuestoVentas")) {
				jButtonNuevoPresupuestoVentasActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPresupuestoVentas")) {
				jButtonNuevoPresupuestoVentasActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPresupuestoVentas")) {
				jButtonNuevoPresupuestoVentasActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPresupuestoVentas")) {
				jButtonModificarPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPresupuestoVentas")) {
				jButtonModificarPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPresupuestoVentas")) {
				jButtonModificarPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPresupuestoVentas")) {
				jButtonActualizarPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPresupuestoVentas")) {
				jButtonActualizarPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPresupuestoVentas")) {
				jButtonActualizarPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("EliminarPresupuestoVentas")) {
				jButtonEliminarPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPresupuestoVentas")) {
				jButtonEliminarPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPresupuestoVentas")) {
				jButtonEliminarPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("CancelarPresupuestoVentas")) {
				jButtonCancelarPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPresupuestoVentas")) {
				jButtonCancelarPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPresupuestoVentas")) {
				jButtonCancelarPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("CerrarPresupuestoVentas")) {
				jButtonCerrarPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPresupuestoVentas")) {
				jButtonCerrarPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPresupuestoVentas")) {
				jButtonCerrarPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPresupuestoVentas")) {
				jButtonMostrarOcultarPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPresupuestoVentas")) {
				jButtonCancelarPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPresupuestoVentas")) {
				jButtonGuardarCambiosPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPresupuestoVentas")) {
				jButtonGuardarCambiosPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPresupuestoVentas")) {
				jButtonCopiarPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPresupuestoVentas")) {
				jButtonVerFormPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPresupuestoVentas")) {
				jButtonGuardarCambiosPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPresupuestoVentas")) {
				jButtonCopiarPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPresupuestoVentas")) {
				jButtonVerFormPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPresupuestoVentas")) {
				jButtonGuardarCambiosPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPresupuestoVentas")) {
				jButtonGuardarCambiosPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPresupuestoVentas")) {
				jButtonGuardarCambiosPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPresupuestoVentas")) {
				jButtonRecargarInformacionPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPresupuestoVentas")) {
				jButtonRecargarInformacionPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPresupuestoVentas")) {
				jButtonRecargarInformacionPresupuestoVentasActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPresupuestoVentas")) {
				jButtonAnterioresPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPresupuestoVentas")) {
				jButtonAnterioresPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePresupuestoVentas")) {
				jButtonAnterioresPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPresupuestoVentas")) {
				jButtonSiguientesPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPresupuestoVentas")) {
				jButtonSiguientesPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPresupuestoVentas")) {
				jButtonSiguientesPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPresupuestoVentas") || sTipo.equals("MenuItemDetalleAbrirOrderByPresupuestoVentas")) {
				jButtonAbrirOrderByPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPresupuestoVentas") || sTipo.equals("MenuItemDetalleMostrarOcultarPresupuestoVentas")) {
				jButtonMostrarOcultarPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPresupuestoVentas")) {
				jButtonNuevoGuardarCambiosPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPresupuestoVentas")) {
				jButtonNuevoGuardarCambiosPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPresupuestoVentas")) {
				jButtonNuevoGuardarCambiosPresupuestoVentasActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPresupuestoVentas")) {
				jButtonCerrarReporteDinamicoPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPresupuestoVentas")) {
				jButtonGenerarReporteDinamicoPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPresupuestoVentas")) {
				
				jButtonGenerarExcelReporteDinamicoPresupuestoVentasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPresupuestoVentas")) {
				jButtonCerrarImportacionPresupuestoVentasActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPresupuestoVentas")) {
				
				jButtonGenerarImportacionPresupuestoVentasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPresupuestoVentas")) {
				
				jButtonAbrirImportacionPresupuestoVentasActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPresupuestoVentas")) {
				jComboBoxTiposAccionesPresupuestoVentasActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPresupuestoVentas")) {
				jComboBoxTiposRelacionesPresupuestoVentasActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPresupuestoVentas")) {
				jComboBoxTiposAccionesPresupuestoVentasActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPresupuestoVentas")) {
				
				jComboBoxTiposSeleccionarPresupuestoVentasActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPresupuestoVentas")) {
				jTextFieldValorCampoGeneralPresupuestoVentasActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPresupuestoVentas")) {
				jButtonAbrirOrderByPresupuestoVentasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPresupuestoVentas")) {
				jButtonAbrirOrderByPresupuestoVentasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPresupuestoVentas")) {
				jButtonCerrarOrderByPresupuestoVentasActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPresupuestoVentasBusqueda")) {
				this.jButtonidPresupuestoVentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPresupuestoVentasUpdate")) {
				this.jButtonid_empresaPresupuestoVentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPresupuestoVentasBusqueda")) {
				this.jButtonid_empresaPresupuestoVentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalPresupuestoVentasUpdate")) {
				this.jButtonid_sucursalPresupuestoVentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalPresupuestoVentasBusqueda")) {
				this.jButtonid_sucursalPresupuestoVentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioPresupuestoVentasUpdate")) {
				this.jButtonid_ejercicioPresupuestoVentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioPresupuestoVentasBusqueda")) {
				this.jButtonid_ejercicioPresupuestoVentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoPresupuestoVentasUpdate")) {
				this.jButtonid_periodoPresupuestoVentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoPresupuestoVentasBusqueda")) {
				this.jButtonid_periodoPresupuestoVentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_vendedorPresupuestoVentasUpdate")) {
				this.jButtonid_vendedorPresupuestoVentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_vendedorPresupuestoVentasBusqueda")) {
				this.jButtonid_vendedorPresupuestoVentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisPresupuestoVentasUpdate")) {
				this.jButtonid_paisPresupuestoVentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisPresupuestoVentasBusqueda")) {
				this.jButtonid_paisPresupuestoVentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ciudadPresupuestoVentasUpdate")) {
				this.jButtonid_ciudadPresupuestoVentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ciudadPresupuestoVentasBusqueda")) {
				this.jButtonid_ciudadPresupuestoVentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_zonaPresupuestoVentasUpdate")) {
				this.jButtonid_zonaPresupuestoVentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_zonaPresupuestoVentasBusqueda")) {
				this.jButtonid_zonaPresupuestoVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoPresupuestoVentas")) {
				this.jButtonid_productoPresupuestoVentasActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoPresupuestoVentasUpdate")) {
				this.jButtonid_productoPresupuestoVentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoPresupuestoVentasBusqueda")) {
				this.jButtonid_productoPresupuestoVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioPresupuestoVentasBusqueda")) {
				this.jButtonprecioPresupuestoVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadPresupuestoVentasBusqueda")) {
				this.jButtoncantidadPresupuestoVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorPresupuestoVentasBusqueda")) {
				this.jButtonvalorPresupuestoVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajePresupuestoVentasBusqueda")) {
				this.jButtonporcentajePresupuestoVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_totalPresupuestoVentasBusqueda")) {
				this.jButtoncantidad_totalPresupuestoVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_totalPresupuestoVentasBusqueda")) {
				this.jButtonvalor_totalPresupuestoVentasBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_productoPresupuestoVentas")) {
				this.jButtonid_productoPresupuestoVentasActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdCiudadPresupuestoVentas")) {
				this.jButtonFK_IdCiudadPresupuestoVentasActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPaisPresupuestoVentas")) {
				this.jButtonFK_IdPaisPresupuestoVentasActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdProductoPresupuestoVentas")) {
				this.jButtonFK_IdProductoPresupuestoVentasActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdVendedorPresupuestoVentas")) {
				this.jButtonFK_IdVendedorPresupuestoVentasActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdZonaPresupuestoVentas")) {
				this.jButtonFK_IdZonaPresupuestoVentasActionPerformed(evt);
			}
			
			;
			
			
			PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPresupuestoVentas();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestoVentasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoventas);
				
				PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
				
				


				
				PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoVentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoVentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PresupuestoVentas presupuestoventasLocal=null;
			
			if(!this.getEsControlTabla()) {
				presupuestoventasLocal=this.presupuestoventas;
			} else {
				presupuestoventasLocal=this.presupuestoventasAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoventas);
				
				PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
							
				
				


				
				PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoVentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoVentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestoVentasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasAnterior =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestoventasAnterior =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
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
			
			PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
			
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
			
			


			
			PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestoVentasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoventas);
				
				PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
								
						
				


				
				PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoVentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoVentas.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoventas);
				
				PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
								
				
				


				
				PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoVentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoVentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestoVentasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasAnterior =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestoventasAnterior =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoventas);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestoVentasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasAnterior =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestoventasAnterior =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestoVentasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoventas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.presupuestoventas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoventas);
				
				PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
							
				
				


				
				PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoVentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoVentas.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestoVentasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoventasAnterior =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.presupuestoventasAnterior =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
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
			
			PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
			
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
			
			


			
			PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestoVentasActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoventas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.presupuestoventas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoventas);
				
				PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
								
				
				


				
				PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoVentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoVentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestoVentasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasAnterior =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestoventasAnterior =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestoVentasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoventas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.presupuestoventas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestoVentasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoventas);
				
				PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPresupuestoVentas")) {
					jCheckBoxSeleccionarTodosPresupuestoVentasItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPresupuestoVentas")) {
					jCheckBoxSeleccionadosPresupuestoVentasItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPresupuestoVentas")) {
					
				}
				
				


				
				
				PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoVentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoVentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoventas);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.presupuestoventas);
				
				PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
												
				
				


				
				
				PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoVentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoVentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestoVentasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoventasAnterior =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.presupuestoventasAnterior =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestoVentasActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoventas);
				
				PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
				
				
				PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
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
			
			PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
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
			
			


			
			PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestoVentasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoventas);
				
				PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoVentas.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoVentas.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoventas);
				
				PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
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
				
				


				
				PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoVentas.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoVentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestoVentasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventasAnterior =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestoventasAnterior =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPresupuestoVentas")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPresupuestoVentasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPresupuestoVentas.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.presupuestoventas =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.presupuestoventas =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.presupuestoventas);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPresupuestoVentas")) {
				
				}
				
				PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPresupuestoVentas")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPresupuestoVentas.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPresupuestoVentas")) {
			
			}
			
			PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPresupuestoVentas();
			
			PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
			
			if(sTipo.equals("NuevoPresupuestoVentas")) {
				jButtonNuevoPresupuestoVentasActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPresupuestoVentas")) {
				jButtonDuplicarPresupuestoVentasActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPresupuestoVentas")) {
				jButtonCopiarPresupuestoVentasActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPresupuestoVentas")) {
				jButtonVerFormPresupuestoVentasActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPresupuestoVentas")) {
				jButtonNuevoPresupuestoVentasActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPresupuestoVentas")) {
				jButtonModificarPresupuestoVentasActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPresupuestoVentas")) {
				jButtonActualizarPresupuestoVentasActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPresupuestoVentas")) {
				jButtonEliminarPresupuestoVentasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPresupuestoVentas")) {
				jButtonGuardarCambiosPresupuestoVentasActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPresupuestoVentas")) {
				jButtonCancelarPresupuestoVentasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPresupuestoVentas")) {
				jButtonCerrarPresupuestoVentasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPresupuestoVentas")) {
				jButtonGuardarCambiosPresupuestoVentasActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPresupuestoVentas")) {
				jButtonNuevoGuardarCambiosPresupuestoVentasActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPresupuestoVentas")) {
				jButtonAbrirOrderByPresupuestoVentasActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPresupuestoVentas")) {
				jButtonRecargarInformacionPresupuestoVentasActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPresupuestoVentas")) {
				jButtonAnterioresPresupuestoVentasActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPresupuestoVentas")) {
				jButtonSiguientesPresupuestoVentasActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPresupuestoVentasBusqueda")) {
				this.jButtonidPresupuestoVentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPresupuestoVentasUpdate")) {
				this.jButtonid_empresaPresupuestoVentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPresupuestoVentasBusqueda")) {
				this.jButtonid_empresaPresupuestoVentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalPresupuestoVentasUpdate")) {
				this.jButtonid_sucursalPresupuestoVentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalPresupuestoVentasBusqueda")) {
				this.jButtonid_sucursalPresupuestoVentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioPresupuestoVentasUpdate")) {
				this.jButtonid_ejercicioPresupuestoVentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioPresupuestoVentasBusqueda")) {
				this.jButtonid_ejercicioPresupuestoVentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoPresupuestoVentasUpdate")) {
				this.jButtonid_periodoPresupuestoVentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoPresupuestoVentasBusqueda")) {
				this.jButtonid_periodoPresupuestoVentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_vendedorPresupuestoVentasUpdate")) {
				this.jButtonid_vendedorPresupuestoVentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_vendedorPresupuestoVentasBusqueda")) {
				this.jButtonid_vendedorPresupuestoVentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisPresupuestoVentasUpdate")) {
				this.jButtonid_paisPresupuestoVentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisPresupuestoVentasBusqueda")) {
				this.jButtonid_paisPresupuestoVentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ciudadPresupuestoVentasUpdate")) {
				this.jButtonid_ciudadPresupuestoVentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ciudadPresupuestoVentasBusqueda")) {
				this.jButtonid_ciudadPresupuestoVentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_zonaPresupuestoVentasUpdate")) {
				this.jButtonid_zonaPresupuestoVentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_zonaPresupuestoVentasBusqueda")) {
				this.jButtonid_zonaPresupuestoVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoPresupuestoVentas")) {
				this.jButtonid_productoPresupuestoVentasActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoPresupuestoVentasUpdate")) {
				this.jButtonid_productoPresupuestoVentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoPresupuestoVentasBusqueda")) {
				this.jButtonid_productoPresupuestoVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioPresupuestoVentasBusqueda")) {
				this.jButtonprecioPresupuestoVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadPresupuestoVentasBusqueda")) {
				this.jButtoncantidadPresupuestoVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorPresupuestoVentasBusqueda")) {
				this.jButtonvalorPresupuestoVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajePresupuestoVentasBusqueda")) {
				this.jButtonporcentajePresupuestoVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_totalPresupuestoVentasBusqueda")) {
				this.jButtoncantidad_totalPresupuestoVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_totalPresupuestoVentasBusqueda")) {
				this.jButtonvalor_totalPresupuestoVentasBusquedaActionPerformed(evt);
			}
			
			PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPresupuestoVentas();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePresupuestoVentas")) {
				closingInternalFramePresupuestoVentas();
				
			} else if(sTipo.equals("jButtonCancelarPresupuestoVentas")) {
				JInternalFrameBase jInternalFrameDetalleFormPresupuestoVentas = (JInternalFrameBase)evt.getSource();
	            	
	            PresupuestoVentasBeanSwingJInternalFrame jInternalFrameParent=(PresupuestoVentasBeanSwingJInternalFrame)jInternalFrameDetalleFormPresupuestoVentas.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPresupuestoVentasActionPerformed(null);
			}
			
			PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.presupuestoventas,new Object(),this.presupuestoventasParameterGeneral,this.presupuestoventasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPresupuestoVentas(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPresupuestoVentas(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPresupuestoVentas(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.presupuestoventas)) {
			if(!esControlTabla) {
				if(PresupuestoVentasJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.presupuestoventas,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);			
				}
				
				if(this.presupuestoventasSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPresupuestoVentas(this.presupuestoventas,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.presupuestoventasReturnGeneral=presupuestoventasLogic.procesarEventosPresupuestoVentassWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presupuestoventasLogic.getPresupuestoVentass(),this.presupuestoventas,this.presupuestoventasParameterGeneral,this.isEsNuevoPresupuestoVentas,classes);//this.presupuestoventasLogic.getPresupuestoVentas()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPresupuestoVentas(this.presupuestoventasReturnGeneral,this.presupuestoventasBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.presupuestoventasSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPresupuestoVentas(classes,this.presupuestoventasReturnGeneral,this.presupuestoventasBean,false);
					}
						
					if(this.presupuestoventasReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPresupuestoVentas(this.presupuestoventasReturnGeneral.getPresupuestoVentas());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPresupuestoVentas(this.presupuestoventasReturnGeneral.getPresupuestoVentas());	
					}
						
					if(this.presupuestoventasReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPresupuestoVentas(this.presupuestoventasReturnGeneral.getPresupuestoVentas(),classes);//this.presupuestoventasBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPresupuestoVentas(this.presupuestoventas,classes);//this.presupuestoventasBean);									
				}
			
				if(PresupuestoVentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPresupuestoVentas(this.presupuestoventas,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentas(this.presupuestoventas);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.presupuestoventasAnterior!=null) {
						this.presupuestoventas=this.presupuestoventasAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.presupuestoventasReturnGeneral=presupuestoventasLogic.procesarEventosPresupuestoVentassWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presupuestoventasLogic.getPresupuestoVentass(),this.presupuestoventas,this.presupuestoventasParameterGeneral,this.isEsNuevoPresupuestoVentas,classes);//this.presupuestoventasLogic.getPresupuestoVentas()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.presupuestoventasSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.presupuestoventasSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.presupuestoventasReturnGeneral.getPresupuestoVentas(),presupuestoventasLogic.getPresupuestoVentass());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.presupuestoventasReturnGeneral.getPresupuestoVentas(),this.presupuestoventass);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPresupuestoVentas.repaint();
				
				//((AbstractTableModel) this.jTableDatosPresupuestoVentas.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPresupuestoVentas();
			}
		}
	}
	
	public void actualizarVisualTableDatosPresupuestoVentas() throws Exception {
		
		PresupuestoVentasModel presupuestoventasModel=(PresupuestoVentasModel)this.jTableDatosPresupuestoVentas.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			presupuestoventasModel.presupuestoventass=this.presupuestoventasLogic.getPresupuestoVentass();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			presupuestoventasModel.presupuestoventass=this.presupuestoventass;
		}
		
		
		((PresupuestoVentasModel) this.jTableDatosPresupuestoVentas.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPresupuestoVentas() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getpresupuestoventasAnterior(),this.presupuestoventasLogic.getPresupuestoVentass());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getpresupuestoventasAnterior(),this.presupuestoventass);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPresupuestoVentas();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPresupuestoVentas(PresupuestoVentas presupuestoventas,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
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
										
				PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presupuestoventas,new Object(),generalEntityParameterGeneral,this.presupuestoventasReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.presupuestoventasSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PresupuestoVentasConstantesFunciones.getClassesRelationshipsOfPresupuestoVentas(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PresupuestoVentasConstantesFunciones.getClassesRelationshipsFromStringsOfPresupuestoVentas(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPresupuestoVentas(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PresupuestoVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presupuestoventas,new Object(),generalEntityParameterGeneral,this.presupuestoventasReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPresupuestoVentas(PresupuestoVentasBean presupuestoventasBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPresupuestoVentas(ArrayList<Classe> classes,PresupuestoVentasReturnGeneral presupuestoventasReturnGeneral,PresupuestoVentasBean presupuestoventasBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPresupuestoVentas(PresupuestoVentas presupuestoventas,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.presupuestoventas)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPresupuestoVentas = new PresupuestoVentasDetalleFormJInternalFrame(jDesktopPane,this.presupuestoventasSessionBean.getConGuardarRelaciones(),this.presupuestoventasSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.setVisible(false);
		this.jInternalFrameDetalleFormPresupuestoVentas.setSelected(false);						
		
		this.jInternalFrameDetalleFormPresupuestoVentas.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPresupuestoVentas.presupuestoventasLogic=this.presupuestoventasLogic;
		
		this.cargarCombosFrameForeignKeyPresupuestoVentas("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePresupuestoVentas();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePresupuestoVentas();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPresupuestoVentas("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPresupuestoVentas();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPresupuestoVentas.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPresupuestoVentas"));
		
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonModificarPresupuestoVentas.addActionListener(new ButtonActionListener(this,"ModificarPresupuestoVentas"));

		
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonModificarToolBarPresupuestoVentas.addActionListener(new ButtonActionListener(this,"ModificarToolBarPresupuestoVentas"));
					
		this.jInternalFrameDetalleFormPresupuestoVentas.jMenuItemModificarPresupuestoVentas.addActionListener(new ButtonActionListener(this,"MenuItemModificarPresupuestoVentas"));		
		
		
		
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonActualizarPresupuestoVentas.addActionListener (new ButtonActionListener(this,"ActualizarPresupuestoVentas"));
		
		
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonActualizarToolBarPresupuestoVentas.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPresupuestoVentas"));
						
		this.jInternalFrameDetalleFormPresupuestoVentas.jMenuItemActualizarPresupuestoVentas.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPresupuestoVentas"));		
		
		
		
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonEliminarPresupuestoVentas.addActionListener (new ButtonActionListener(this,"EliminarPresupuestoVentas"));
		
		
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonEliminarToolBarPresupuestoVentas.addActionListener (new ButtonActionListener(this,"EliminarToolBarPresupuestoVentas"));
								
		this.jInternalFrameDetalleFormPresupuestoVentas.jMenuItemEliminarPresupuestoVentas.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPresupuestoVentas"));		
		
		
		
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonCancelarPresupuestoVentas.addActionListener (new ButtonActionListener(this,"CancelarPresupuestoVentas"));
		
		
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonCancelarToolBarPresupuestoVentas.addActionListener (new ButtonActionListener(this,"CancelarToolBarPresupuestoVentas"));
					
		this.jInternalFrameDetalleFormPresupuestoVentas.jMenuItemCancelarPresupuestoVentas.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPresupuestoVentas"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPresupuestoVentas.jMenuItemDetalleCerrarPresupuestoVentas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPresupuestoVentas"));		
		
		
		
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonGuardarCambiosToolBarPresupuestoVentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPresupuestoVentas"));
		
		
		
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonGuardarCambiosToolBarPresupuestoVentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPresupuestoVentas"));
		
		
		
		this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxTiposAccionesFormularioPresupuestoVentas.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPresupuestoVentas"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonidPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"idPresupuestoVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_empresaPresupuestoVentasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPresupuestoVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_empresaPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPresupuestoVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_sucursalPresupuestoVentasUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPresupuestoVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_sucursalPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPresupuestoVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_ejercicioPresupuestoVentasUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPresupuestoVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_ejercicioPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPresupuestoVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_periodoPresupuestoVentasUpdate.addActionListener(new ButtonActionListener(this,"id_periodoPresupuestoVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_periodoPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoPresupuestoVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_vendedorPresupuestoVentasUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorPresupuestoVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_vendedorPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorPresupuestoVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_paisPresupuestoVentasUpdate.addActionListener(new ButtonActionListener(this,"id_paisPresupuestoVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_paisPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_paisPresupuestoVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_ciudadPresupuestoVentasUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadPresupuestoVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_ciudadPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadPresupuestoVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_zonaPresupuestoVentasUpdate.addActionListener(new ButtonActionListener(this,"id_zonaPresupuestoVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_zonaPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_zonaPresupuestoVentasBusqueda"));
		//jButtonid_productoPresupuestoVentas.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoPresupuestoVentasActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_productoPresupuestoVentas.addActionListener(new ButtonActionListener(this,"id_productoPresupuestoVentas"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_productoPresupuestoVentasUpdate.addActionListener(new ButtonActionListener(this,"id_productoPresupuestoVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_productoPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_productoPresupuestoVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonprecioPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"precioPresupuestoVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtoncantidadPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"cantidadPresupuestoVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonvalorPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"valorPresupuestoVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonporcentajePresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"porcentajePresupuestoVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtoncantidad_totalPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_totalPresupuestoVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonvalor_totalPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"valor_totalPresupuestoVentasBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPresupuestoVentas.jTabbedPaneRelacionesPresupuestoVentas.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPresupuestoVentas"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePresupuestoVentas"));
		
		if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoVentas.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPresupuestoVentas"));
		}
		
		this.jTableDatosPresupuestoVentas.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPresupuestoVentas"));
		
		this.jTableDatosPresupuestoVentas.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPresupuestoVentas"));
		
		this.jButtonNuevoPresupuestoVentas.addActionListener(new ButtonActionListener(this,"NuevoPresupuestoVentas"));
		
		this.jButtonDuplicarPresupuestoVentas.addActionListener(new ButtonActionListener(this,"DuplicarPresupuestoVentas"));
		
		this.jButtonCopiarPresupuestoVentas.addActionListener(new ButtonActionListener(this,"CopiarPresupuestoVentas"));
		
		this.jButtonVerFormPresupuestoVentas.addActionListener(new ButtonActionListener(this,"VerFormPresupuestoVentas"));
		
		
		this.jButtonNuevoToolBarPresupuestoVentas.addActionListener(new ButtonActionListener(this,"NuevoToolBarPresupuestoVentas"));
			
		this.jButtonDuplicarToolBarPresupuestoVentas.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPresupuestoVentas"));
			
		this.jMenuItemNuevoPresupuestoVentas.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPresupuestoVentas"));
			
		this.jMenuItemDuplicarPresupuestoVentas.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPresupuestoVentas"));		
		
		
		this.jButtonNuevoRelacionesPresupuestoVentas.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPresupuestoVentas"));
		
		
		this.jButtonNuevoRelacionesToolBarPresupuestoVentas.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPresupuestoVentas"));
			
		this.jMenuItemNuevoRelacionesPresupuestoVentas.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPresupuestoVentas"));		
		
		
		if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoVentas.jButtonModificarPresupuestoVentas.addActionListener(new ButtonActionListener(this,"ModificarPresupuestoVentas"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoVentas.jButtonModificarToolBarPresupuestoVentas.addActionListener(new ButtonActionListener(this,"ModificarToolBarPresupuestoVentas"));
			
			this.jInternalFrameDetalleFormPresupuestoVentas.jMenuItemModificarPresupuestoVentas.addActionListener(new ButtonActionListener(this,"MenuItemModificarPresupuestoVentas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPresupuestoVentas.jButtonActualizarPresupuestoVentas.addActionListener (new ButtonActionListener(this,"ActualizarPresupuestoVentas"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoVentas.jButtonActualizarToolBarPresupuestoVentas.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPresupuestoVentas"));
				
			this.jInternalFrameDetalleFormPresupuestoVentas.jMenuItemActualizarPresupuestoVentas.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPresupuestoVentas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoVentas.jButtonEliminarPresupuestoVentas.addActionListener (new ButtonActionListener(this,"EliminarPresupuestoVentas"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoVentas.jButtonEliminarToolBarPresupuestoVentas.addActionListener (new ButtonActionListener(this,"EliminarToolBarPresupuestoVentas"));
						
			this.jInternalFrameDetalleFormPresupuestoVentas.jMenuItemEliminarPresupuestoVentas.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPresupuestoVentas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoVentas.jButtonCancelarPresupuestoVentas.addActionListener (new ButtonActionListener(this,"CancelarPresupuestoVentas"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoVentas.jButtonCancelarToolBarPresupuestoVentas.addActionListener (new ButtonActionListener(this,"CancelarToolBarPresupuestoVentas"));
			
			this.jInternalFrameDetalleFormPresupuestoVentas.jMenuItemCancelarPresupuestoVentas.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPresupuestoVentas"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPresupuestoVentas.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPresupuestoVentas"));		
		
		
		this.jButtonCerrarPresupuestoVentas.addActionListener (new ButtonActionListener(this,"CerrarPresupuestoVentas"));
		
		
		this.jButtonCerrarToolBarPresupuestoVentas.addActionListener (new ButtonActionListener(this,"CerrarToolBarPresupuestoVentas"));
			
		this.jMenuItemCerrarPresupuestoVentas.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPresupuestoVentas"));
			
		if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoVentas.jMenuItemDetalleCerrarPresupuestoVentas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPresupuestoVentas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoVentas.jButtonGuardarCambiosPresupuestoVentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosPresupuestoVentas"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoVentas.jButtonGuardarCambiosToolBarPresupuestoVentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPresupuestoVentas"));
		}
		
		this.jButtonCopiarToolBarPresupuestoVentas.addActionListener (new ButtonActionListener(this,"CopiarToolBarPresupuestoVentas"));
			
		this.jButtonVerFormToolBarPresupuestoVentas.addActionListener (new ButtonActionListener(this,"VerFormToolBarPresupuestoVentas"));
		
		this.jMenuItemGuardarCambiosPresupuestoVentas.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPresupuestoVentas"));
			
		this.jMenuItemCopiarPresupuestoVentas.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPresupuestoVentas"));		
		
		this.jMenuItemVerFormPresupuestoVentas.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPresupuestoVentas"));		
		
		
		this.jButtonGuardarCambiosTablaPresupuestoVentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPresupuestoVentas"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPresupuestoVentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPresupuestoVentas"));
			
		this.jMenuItemGuardarCambiosTablaPresupuestoVentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPresupuestoVentas"));		
		
		
		
		this.jButtonRecargarInformacionPresupuestoVentas.addActionListener (new ButtonActionListener(this,"RecargarInformacionPresupuestoVentas"));
					
		this.jButtonRecargarInformacionToolBarPresupuestoVentas.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPresupuestoVentas"));
		
		this.jMenuItemRecargarInformacionPresupuestoVentas.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPresupuestoVentas"));		
		
		
		
		this.jButtonAnterioresPresupuestoVentas.addActionListener (new ButtonActionListener(this,"AnterioresPresupuestoVentas"));
		
		
		this.jButtonAnterioresToolBarPresupuestoVentas.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPresupuestoVentas"));
		
		this.jMenuItemAnterioresPresupuestoVentas.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPresupuestoVentas"));		
		
		
		this.jButtonSiguientesPresupuestoVentas.addActionListener (new ButtonActionListener(this,"SiguientesPresupuestoVentas"));
		
		
		this.jButtonSiguientesToolBarPresupuestoVentas.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPresupuestoVentas"));
			
		this.jMenuItemSiguientesPresupuestoVentas.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPresupuestoVentas"));
			
		this.jMenuItemAbrirOrderByPresupuestoVentas.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPresupuestoVentas"));
			
		this.jMenuItemMostrarOcultarPresupuestoVentas.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPresupuestoVentas"));
			
		this.jMenuItemDetalleAbrirOrderByPresupuestoVentas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPresupuestoVentas"));
			
		this.jMenuItemDetalleMostarOcultarPresupuestoVentas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPresupuestoVentas"));		
		
		
		this.jButtonNuevoGuardarCambiosPresupuestoVentas.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPresupuestoVentas"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPresupuestoVentas.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPresupuestoVentas"));
			
		this.jMenuItemNuevoGuardarCambiosPresupuestoVentas.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPresupuestoVentas"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPresupuestoVentas.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPresupuestoVentas"));

		this.jCheckBoxSeleccionadosPresupuestoVentas.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPresupuestoVentas"));
		
		if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxTiposAccionesFormularioPresupuestoVentas.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPresupuestoVentas"));
		}
		
		
		this.jComboBoxTiposRelacionesPresupuestoVentas.addActionListener (new ButtonActionListener(this,"TiposRelacionesPresupuestoVentas"));
			
		this.jComboBoxTiposAccionesPresupuestoVentas.addActionListener (new ButtonActionListener(this,"TiposAccionesPresupuestoVentas"));
					
		this.jComboBoxTiposSeleccionarPresupuestoVentas.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPresupuestoVentas"));
			
		this.jTextFieldValorCampoGeneralPresupuestoVentas.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPresupuestoVentas"));		
		
		
		if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonidPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"idPresupuestoVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_empresaPresupuestoVentasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPresupuestoVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_empresaPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPresupuestoVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_sucursalPresupuestoVentasUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPresupuestoVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_sucursalPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPresupuestoVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_ejercicioPresupuestoVentasUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPresupuestoVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_ejercicioPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPresupuestoVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_periodoPresupuestoVentasUpdate.addActionListener(new ButtonActionListener(this,"id_periodoPresupuestoVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_periodoPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoPresupuestoVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_vendedorPresupuestoVentasUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorPresupuestoVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_vendedorPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorPresupuestoVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_paisPresupuestoVentasUpdate.addActionListener(new ButtonActionListener(this,"id_paisPresupuestoVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_paisPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_paisPresupuestoVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_ciudadPresupuestoVentasUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadPresupuestoVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_ciudadPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadPresupuestoVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_zonaPresupuestoVentasUpdate.addActionListener(new ButtonActionListener(this,"id_zonaPresupuestoVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_zonaPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_zonaPresupuestoVentasBusqueda"));
		//jButtonid_productoPresupuestoVentas.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoPresupuestoVentasActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_productoPresupuestoVentas.addActionListener(new ButtonActionListener(this,"id_productoPresupuestoVentas"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_productoPresupuestoVentasUpdate.addActionListener(new ButtonActionListener(this,"id_productoPresupuestoVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_productoPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_productoPresupuestoVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonprecioPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"precioPresupuestoVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtoncantidadPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"cantidadPresupuestoVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonvalorPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"valorPresupuestoVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonporcentajePresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"porcentajePresupuestoVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtoncantidad_totalPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_totalPresupuestoVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonvalor_totalPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"valor_totalPresupuestoVentasBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCiudadPresupuestoVentas.addActionListener(new ButtonActionListener(this,"FK_IdCiudadPresupuestoVentas"));

			this.jButtonFK_IdPaisPresupuestoVentas.addActionListener(new ButtonActionListener(this,"FK_IdPaisPresupuestoVentas"));

			this.jButtonFK_IdProductoPresupuestoVentas.addActionListener(new ButtonActionListener(this,"FK_IdProductoPresupuestoVentas"));

			this.jButtonBuscarFK_IdProductoid_productoPresupuestoVentas.addActionListener(new ButtonActionListener(this,"id_productoPresupuestoVentas"));

			this.jButtonFK_IdVendedorPresupuestoVentas.addActionListener(new ButtonActionListener(this,"FK_IdVendedorPresupuestoVentas"));

			this.jButtonFK_IdZonaPresupuestoVentas.addActionListener(new ButtonActionListener(this,"FK_IdZonaPresupuestoVentas"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPresupuestoVentas!=null) {
				this.jInternalFrameReporteDinamicoPresupuestoVentas.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPresupuestoVentas"));
				this.jInternalFrameReporteDinamicoPresupuestoVentas.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPresupuestoVentas"));
				this.jInternalFrameReporteDinamicoPresupuestoVentas.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPresupuestoVentas"));
			}
			
			//this.jButtonCerrarReporteDinamicoPresupuestoVentas.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPresupuestoVentas"));				
			//this.jButtonGenerarReporteDinamicoPresupuestoVentas.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPresupuestoVentas"));
			//this.jButtonGenerarExcelReporteDinamicoPresupuestoVentas.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPresupuestoVentas"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPresupuestoVentas!=null) {
				this.jInternalFrameImportacionPresupuestoVentas.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPresupuestoVentas"));
				this.jInternalFrameImportacionPresupuestoVentas.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPresupuestoVentas"));
				this.jInternalFrameImportacionPresupuestoVentas.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPresupuestoVentas"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPresupuestoVentas.addActionListener (new ButtonActionListener(this,"AbrirOrderByPresupuestoVentas"));
			
			this.jButtonAbrirOrderByToolBarPresupuestoVentas.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPresupuestoVentas"));			
			
			if(this.jInternalFrameOrderByPresupuestoVentas!=null) {
				this.jInternalFrameOrderByPresupuestoVentas.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPresupuestoVentas"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoVentas.jTabbedPaneRelacionesPresupuestoVentas.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPresupuestoVentas"));
		
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
            		closingInternalFramePresupuestoVentas();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPresupuestoVentas.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPresupuestoVentas = (JInternalFrameBase)event.getSource();
	            	
	            PresupuestoVentasBeanSwingJInternalFrame jInternalFrameParent=(PresupuestoVentasBeanSwingJInternalFrame)jInternalFrameDetalleFormPresupuestoVentas.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPresupuestoVentasActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPresupuestoVentas.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPresupuestoVentasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPresupuestoVentas.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPresupuestoVentas.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresupuestoVentasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresupuestoVentasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresupuestoVentasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPresupuestoVentas";
		inputMap = this.jButtonNuevoPresupuestoVentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPresupuestoVentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPresupuestoVentasActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresupuestoVentasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresupuestoVentasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresupuestoVentasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPresupuestoVentas";
		inputMap = this.jButtonNuevoRelacionesPresupuestoVentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPresupuestoVentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPresupuestoVentasActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPresupuestoVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPresupuestoVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPresupuestoVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPresupuestoVentas";
		inputMap = this.jButtonModificarPresupuestoVentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPresupuestoVentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPresupuestoVentasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPresupuestoVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPresupuestoVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPresupuestoVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPresupuestoVentas";
		inputMap = this.jButtonActualizarPresupuestoVentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPresupuestoVentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPresupuestoVentasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPresupuestoVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPresupuestoVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPresupuestoVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPresupuestoVentas";
		inputMap = this.jButtonEliminarPresupuestoVentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPresupuestoVentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPresupuestoVentasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPresupuestoVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPresupuestoVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPresupuestoVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPresupuestoVentas";
		inputMap = this.jButtonCancelarPresupuestoVentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPresupuestoVentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPresupuestoVentasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPresupuestoVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPresupuestoVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPresupuestoVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPresupuestoVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPresupuestoVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPresupuestoVentas";
		inputMap = this.jButtonCerrarPresupuestoVentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPresupuestoVentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPresupuestoVentasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonGuardarCambiosPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresupuestoVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresupuestoVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresupuestoVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresupuestoVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresupuestoVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresupuestoVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPresupuestoVentas";
		inputMap = this.jInternalFrameDetalleFormPresupuestoVentas.jButtonGuardarCambiosPresupuestoVentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonGuardarCambiosPresupuestoVentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPresupuestoVentasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPresupuestoVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPresupuestoVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPresupuestoVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPresupuestoVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPresupuestoVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPresupuestoVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPresupuestoVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPresupuestoVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPresupuestoVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPresupuestoVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPresupuestoVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPresupuestoVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPresupuestoVentas.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPresupuestoVentasItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPresupuestoVentas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPresupuestoVentasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPresupuestoVentas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPresupuestoVentasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPresupuestoVentas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPresupuestoVentasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonidPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"idPresupuestoVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_empresaPresupuestoVentasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPresupuestoVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_empresaPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPresupuestoVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_sucursalPresupuestoVentasUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPresupuestoVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_sucursalPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPresupuestoVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_ejercicioPresupuestoVentasUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPresupuestoVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_ejercicioPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPresupuestoVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_periodoPresupuestoVentasUpdate.addActionListener(new ButtonActionListener(this,"id_periodoPresupuestoVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_periodoPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoPresupuestoVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_vendedorPresupuestoVentasUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorPresupuestoVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_vendedorPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorPresupuestoVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_paisPresupuestoVentasUpdate.addActionListener(new ButtonActionListener(this,"id_paisPresupuestoVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_paisPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_paisPresupuestoVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_ciudadPresupuestoVentasUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadPresupuestoVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_ciudadPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadPresupuestoVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_zonaPresupuestoVentasUpdate.addActionListener(new ButtonActionListener(this,"id_zonaPresupuestoVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_zonaPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_zonaPresupuestoVentasBusqueda"));
		//jButtonid_productoPresupuestoVentas.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoPresupuestoVentasActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_productoPresupuestoVentas.addActionListener(new ButtonActionListener(this,"id_productoPresupuestoVentas"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_productoPresupuestoVentasUpdate.addActionListener(new ButtonActionListener(this,"id_productoPresupuestoVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_productoPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_productoPresupuestoVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonprecioPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"precioPresupuestoVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtoncantidadPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"cantidadPresupuestoVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonvalorPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"valorPresupuestoVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonporcentajePresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"porcentajePresupuestoVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtoncantidad_totalPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_totalPresupuestoVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentas.jButtonvalor_totalPresupuestoVentasBusqueda.addActionListener(new ButtonActionListener(this,"valor_totalPresupuestoVentasBusqueda"));
		
		
		this.jButtonFK_IdCiudadPresupuestoVentas.addActionListener(new ButtonActionListener(this,"FK_IdCiudadPresupuestoVentas"));

		this.jButtonFK_IdPaisPresupuestoVentas.addActionListener(new ButtonActionListener(this,"FK_IdPaisPresupuestoVentas"));

		this.jButtonFK_IdProductoPresupuestoVentas.addActionListener(new ButtonActionListener(this,"FK_IdProductoPresupuestoVentas"));

		this.jButtonBuscarFK_IdProductoid_productoPresupuestoVentas.addActionListener(new ButtonActionListener(this,"id_productoPresupuestoVentas"));

		this.jButtonFK_IdVendedorPresupuestoVentas.addActionListener(new ButtonActionListener(this,"FK_IdVendedorPresupuestoVentas"));

		this.jButtonFK_IdZonaPresupuestoVentas.addActionListener(new ButtonActionListener(this,"FK_IdZonaPresupuestoVentas"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPresupuestoVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPresupuestoVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPresupuestoVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPresupuestoVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPresupuestoVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPresupuestoVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPresupuestoVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPresupuestoVentasActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPresupuestoVentas.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPresupuestoVentas(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PresupuestoVentas presupuestoventasAux:this.presupuestoventasLogic.getPresupuestoVentass()) {
					presupuestoventasAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresupuestoVentas presupuestoventasAux:presupuestoventass) {
					presupuestoventasAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPresupuestoVentasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPresupuestoVentas(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PresupuestoVentas presupuestoventasAux:this.presupuestoventasLogic.getPresupuestoVentass()) {
						presupuestoventasAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PresupuestoVentas presupuestoventasAux:presupuestoventass) {
						presupuestoventasAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PresupuestoVentas presupuestoventasAux:this.presupuestoventasLogic.getPresupuestoVentass()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PresupuestoVentas presupuestoventasAux:presupuestoventass) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPresupuestoVentas(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPresupuestoVentas.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPresupuestoVentas.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoVentas,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPresupuestoVentasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPresupuestoVentas(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPresupuestoVentas.getSelectedRows();
			
			PresupuestoVentas presupuestoventasLocal=new PresupuestoVentas();
			
			//this.seleccionarTodosPresupuestoVentas(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presupuestoventasLocal =(PresupuestoVentas) this.presupuestoventasLogic.getPresupuestoVentass().toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					presupuestoventasLocal =(PresupuestoVentas) this.presupuestoventass.toArray()[this.jTableDatosPresupuestoVentas.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				presupuestoventasLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PresupuestoVentas presupuestoventasAux:this.presupuestoventasLogic.getPresupuestoVentass()) {
						presupuestoventasAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PresupuestoVentas presupuestoventasAux:presupuestoventass) {
						presupuestoventasAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPresupuestoVentas(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPresupuestoVentas.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPresupuestoVentas.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoVentas,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPresupuestoVentasItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPresupuestoVentasParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPresupuestoVentasActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPresupuestoVentas(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPresupuestoVentas.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PresupuestoVentas presupuestoventasAux:this.presupuestoventasLogic.getPresupuestoVentass()) {
				
						if(sTipoSeleccionar.equals(PresupuestoVentasConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							presupuestoventasAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestoVentasConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							presupuestoventasAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestoVentasConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							presupuestoventasAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestoVentasConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							presupuestoventasAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestoVentasConstantesFunciones.LABEL_CANTIDADTOTAL)) {
							existe=true;
							presupuestoventasAux.setcantidad_total(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestoVentasConstantesFunciones.LABEL_VALORTOTAL)) {
							existe=true;
							presupuestoventasAux.setvalor_total(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresupuestoVentas presupuestoventasAux:presupuestoventass) {
					
						if(sTipoSeleccionar.equals(PresupuestoVentasConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							presupuestoventasAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestoVentasConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							presupuestoventasAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestoVentasConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							presupuestoventasAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestoVentasConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							presupuestoventasAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestoVentasConstantesFunciones.LABEL_CANTIDADTOTAL)) {
							existe=true;
							presupuestoventasAux.setcantidad_total(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestoVentasConstantesFunciones.LABEL_VALORTOTAL)) {
							existe=true;
							presupuestoventasAux.setvalor_total(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPresupuestoVentas(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPresupuestoVentasActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPresupuestoVentas(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPresupuestoVentas=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPresupuestoVentas.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxTiposAccionesFormularioPresupuestoVentas.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePresupuestoVentas) {				
					conSplash=true;//false;										
					
					//this.startProcessPresupuestoVentas(conSplash);
				
					this.generarReportePresupuestoVentassSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresupuestoVentas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxTiposAccionesFormularioPresupuestoVentas.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPresupuestoVentassSeleccionados();
				//this.jComboBoxTiposAccionesPresupuestoVentas.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPresupuestoVentassSeleccionados(false);
				//this.jComboBoxTiposAccionesPresupuestoVentas.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPresupuestoVentassSeleccionados(true);
				//this.jComboBoxTiposAccionesPresupuestoVentas.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPresupuestoVentas();
				
				this.exportarPresupuestoVentassSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresupuestoVentas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxTiposAccionesFormularioPresupuestoVentas.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPresupuestoVentass();
				//this.importarPresupuestoVentass();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresupuestoVentas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxTiposAccionesFormularioPresupuestoVentas.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPresupuestoVentas();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPresupuestoVentassSeleccionados();
				//this.jComboBoxTiposAccionesPresupuestoVentas.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Presupuesto Ventas", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPresupuestoVentas();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPresupuestoVentas)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPresupuestoVentas(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Presupuesto Ventas",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresupuestoVentas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxTiposAccionesFormularioPresupuestoVentas.setSelectedIndex(0);					
				}	
			} 			
			else if(PresupuestoVentasBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePresupuestoVentas) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPresupuestoVentas(conSplash);
					
						//this.actualizarParametrosGeneralPresupuestoVentas();
						
						this.generarReporteProcesoAccionPresupuestoVentassSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPresupuestoVentas.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxTiposAccionesFormularioPresupuestoVentas.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PresupuestoVentasBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Presupuesto VentasES SELECCIONADOS?", "MANTENIMIENTO DE Presupuesto Ventas", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPresupuestoVentas();
				
						this.actualizarParametrosGeneralPresupuestoVentas();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.presupuestoventasReturnGeneral=presupuestoventasLogic.procesarAccionPresupuestoVentassWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.presupuestoventasLogic.getPresupuestoVentass(),this.presupuestoventasParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPresupuestoVentasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPresupuestoVentas.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxTiposAccionesFormularioPresupuestoVentas.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPresupuestoVentas();
					
					PresupuestoVentasBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPresupuestoVentasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPresupuestoVentas.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxTiposAccionesFormularioPresupuestoVentas.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPresupuestoVentas(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPresupuestoVentasActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPresupuestoVentas();
			
			if(this.jInternalFrameDetalleFormPresupuestoVentas==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PresupuestoVentas> presupuestoventassSeleccionados=new ArrayList<PresupuestoVentas>();		
			PresupuestoVentas presupuestoventas=new PresupuestoVentas();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPresupuestoVentas(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPresupuestoVentas.getSelectedItem();
			
			
			
			
			presupuestoventassSeleccionados=this.getPresupuestoVentassSeleccionados(true);
			//this.sTipoAccion;
			
			if(presupuestoventassSeleccionados.size()==1) {
				for(PresupuestoVentas presupuestoventasAux:presupuestoventassSeleccionados) {
					presupuestoventas=presupuestoventasAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPresupuestoVentas();
			
      		//this.finishProcessPresupuestoVentas(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPresupuestoVentasReturnGeneral() throws Exception {
		if(this.presupuestoventasReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.presupuestoventasReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.presupuestoventasReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.presupuestoventasReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.presupuestoventasReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.presupuestoventasReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPresupuestoVentas(false);
		}
		
		if(this.presupuestoventasReturnGeneral.getConRetornoLista() || this.presupuestoventasReturnGeneral.getConRetornoObjeto()) {
			if(this.presupuestoventasReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.presupuestoventasLogic.setPresupuestoVentass(this.presupuestoventasReturnGeneral.getPresupuestoVentass());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.presupuestoventasReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.presupuestoventasLogic.setPresupuestoVentas(this.presupuestoventasReturnGeneral.getPresupuestoVentas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingPresupuestoVentas(false);
		}
	}
	
	public void actualizarParametrosGeneralPresupuestoVentas() throws Exception {
		
		
	}
	
	public ArrayList<PresupuestoVentas> getPresupuestoVentassSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PresupuestoVentas> presupuestoventassSeleccionados=new ArrayList<PresupuestoVentas>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPresupuestoVentas) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PresupuestoVentas presupuestoventasAux:presupuestoventasLogic.getPresupuestoVentass()) {
					if(presupuestoventasAux.getIsSelected()) {
						presupuestoventassSeleccionados.add(presupuestoventasAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresupuestoVentas presupuestoventasAux:this.presupuestoventass) {
					if(presupuestoventasAux.getIsSelected()) {
						presupuestoventassSeleccionados.add(presupuestoventasAux);				
					}
				}
			}
			
			if(presupuestoventassSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						presupuestoventassSeleccionados.addAll(this.presupuestoventasLogic.getPresupuestoVentass());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						presupuestoventassSeleccionados.addAll(this.presupuestoventass);				
					}
				}
			}
		} else {
			presupuestoventassSeleccionados.add(this.presupuestoventas);
		}
		
		return presupuestoventassSeleccionados;
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
	
	public void generarReportePresupuestoVentassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPresupuestoVentassSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPresupuestoVentassSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPresupuestoVentassSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPresupuestoVentassSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Presupuesto Ventas",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPresupuestoVentassSeleccionados() throws Exception {
		ArrayList<PresupuestoVentas> presupuestoventassSeleccionados=new ArrayList<PresupuestoVentas>();		
		
		presupuestoventassSeleccionados=this.getPresupuestoVentassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePresupuestoVentass("Todos",presupuestoventassSeleccionados);
		
	}	
	
	public void generarReporteNormalPresupuestoVentassSeleccionados() throws Exception {
		ArrayList<PresupuestoVentas> presupuestoventassSeleccionados=new ArrayList<PresupuestoVentas>();		
		
		presupuestoventassSeleccionados=this.getPresupuestoVentassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePresupuestoVentass("Todos",presupuestoventassSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPresupuestoVentassSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PresupuestoVentas> presupuestoventassSeleccionados=new ArrayList<PresupuestoVentas>();
		
		presupuestoventassSeleccionados=this.getPresupuestoVentassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePresupuestoVentass("Todos",presupuestoventassSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPresupuestoVentassSeleccionados() throws Exception {
		ArrayList<PresupuestoVentas> presupuestoventassSeleccionados=new ArrayList<PresupuestoVentas>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPresupuestoVentas();
		
		
		presupuestoventassSeleccionados=this.getPresupuestoVentassSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPresupuestoVentas();
		
		
		//this.generarReportePresupuestoVentass("Todos",presupuestoventassSeleccionados ,presupuestoventasImplementable,presupuestoventasImplementableHome);
	}
	
	public void mostrarImportacionPresupuestoVentass() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPresupuestoVentas();
		
		this.abrirFrameImportacionPresupuestoVentas();		
		
			
		//this.generarReportePresupuestoVentass("Todos",presupuestoventassSeleccionados ,presupuestoventasImplementable,presupuestoventasImplementableHome);
	}
	
	public void importarPresupuestoVentass() throws Exception {		
	
	}
	
	public void exportarPresupuestoVentassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPresupuestoVentassSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPresupuestoVentassSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPresupuestoVentassSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Presupuesto Ventas",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPresupuestoVentassSeleccionados() throws Exception {
		ArrayList<PresupuestoVentas> presupuestoventassSeleccionados=new ArrayList<PresupuestoVentas>();		
		
		presupuestoventassSeleccionados=this.getPresupuestoVentassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestoventas."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPresupuestoVentas(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PresupuestoVentas presupuestoventasAux:presupuestoventassSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPresupuestoVentas(presupuestoventasAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//presupuestoventasAux.setsDetalleGeneralEntityReporte(presupuestoventasAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuesto Ventas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPresupuestoVentas(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PresupuestoVentasConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoVentasConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoVentasConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoVentasConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoVentasConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoVentasConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoVentasConstantesFunciones.LABEL_IDVENDEDOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoVentasConstantesFunciones.LABEL_IDPAIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoVentasConstantesFunciones.LABEL_IDCIUDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoVentasConstantesFunciones.LABEL_IDZONA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoVentasConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoVentasConstantesFunciones.LABEL_PRECIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoVentasConstantesFunciones.LABEL_CANTIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoVentasConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoVentasConstantesFunciones.LABEL_PORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoVentasConstantesFunciones.LABEL_CANTIDADTOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoVentasConstantesFunciones.LABEL_VALORTOTAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPresupuestoVentas(PresupuestoVentas presupuestoventas,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=presupuestoventas.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoventas.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoventas.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoventas.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoventas.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoventas.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoventas.getvendedor_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoventas.getpais_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoventas.getciudad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoventas.getzona_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoventas.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoventas.getprecio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoventas.getcantidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoventas.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoventas.getporcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoventas.getcantidad_total().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoventas.getvalor_total().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPresupuestoVentassSeleccionados() throws Exception {
		ArrayList<PresupuestoVentas> presupuestoventassSeleccionados=new ArrayList<PresupuestoVentas>();		
		
		presupuestoventassSeleccionados=this.getPresupuestoVentassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestoventas.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PresupuestoVentass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPresupuestoVentas(row);				
				iRow++;
			}				
			
			for(PresupuestoVentas presupuestoventasAux:presupuestoventassSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPresupuestoVentas(presupuestoventasAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuesto Ventas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPresupuestoVentassSeleccionados() throws Exception {
		ArrayList<PresupuestoVentas> presupuestoventassSeleccionados=new ArrayList<PresupuestoVentas>();		
		
		presupuestoventassSeleccionados=this.getPresupuestoVentassSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestoventas.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("presupuestoventass");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("presupuestoventas");
			//elementRoot.appendChild(element);
		
			for(PresupuestoVentas presupuestoventasAux:presupuestoventassSeleccionados) {
				element = document.createElement("presupuestoventas");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPresupuestoVentas(presupuestoventasAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuesto Ventas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPresupuestoVentas(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_IDVENDEDOR);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_IDPAIS);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_IDCIUDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_IDZONA);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_PRECIO);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_CANTIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_PORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_CANTIDADTOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoVentasConstantesFunciones.LABEL_VALORTOTAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPresupuestoVentas(PresupuestoVentas presupuestoventas,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoventas.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoventas.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoventas.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoventas.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoventas.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoventas.getvendedor_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoventas.getpais_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoventas.getciudad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoventas.getzona_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoventas.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoventas.getprecio());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoventas.getcantidad());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoventas.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoventas.getporcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoventas.getcantidad_total());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoventas.getvalor_total());				
	}
	
	public void setFilaDatosExportarXmlPresupuestoVentas(PresupuestoVentas presupuestoventas,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PresupuestoVentasConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(presupuestoventas.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PresupuestoVentasConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(presupuestoventas.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(PresupuestoVentasConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(presupuestoventas.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(PresupuestoVentasConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(presupuestoventas.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(PresupuestoVentasConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(presupuestoventas.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(PresupuestoVentasConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(presupuestoventas.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementvendedor_descripcion = document.createElement(PresupuestoVentasConstantesFunciones.IDVENDEDOR);
		elementvendedor_descripcion.appendChild(document.createTextNode(presupuestoventas.getvendedor_descripcion()));
		element.appendChild(elementvendedor_descripcion);

		Element elementpais_descripcion = document.createElement(PresupuestoVentasConstantesFunciones.IDPAIS);
		elementpais_descripcion.appendChild(document.createTextNode(presupuestoventas.getpais_descripcion()));
		element.appendChild(elementpais_descripcion);

		Element elementciudad_descripcion = document.createElement(PresupuestoVentasConstantesFunciones.IDCIUDAD);
		elementciudad_descripcion.appendChild(document.createTextNode(presupuestoventas.getciudad_descripcion()));
		element.appendChild(elementciudad_descripcion);

		Element elementzona_descripcion = document.createElement(PresupuestoVentasConstantesFunciones.IDZONA);
		elementzona_descripcion.appendChild(document.createTextNode(presupuestoventas.getzona_descripcion()));
		element.appendChild(elementzona_descripcion);

		Element elementproducto_descripcion = document.createElement(PresupuestoVentasConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(presupuestoventas.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementprecio = document.createElement(PresupuestoVentasConstantesFunciones.PRECIO);
		elementprecio.appendChild(document.createTextNode(presupuestoventas.getprecio().toString().trim()));
		element.appendChild(elementprecio);

		Element elementcantidad = document.createElement(PresupuestoVentasConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(presupuestoventas.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);

		Element elementvalor = document.createElement(PresupuestoVentasConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(presupuestoventas.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementporcentaje = document.createElement(PresupuestoVentasConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(presupuestoventas.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);

		Element elementcantidad_total = document.createElement(PresupuestoVentasConstantesFunciones.CANTIDADTOTAL);
		elementcantidad_total.appendChild(document.createTextNode(presupuestoventas.getcantidad_total().toString().trim()));
		element.appendChild(elementcantidad_total);

		Element elementvalor_total = document.createElement(PresupuestoVentasConstantesFunciones.VALORTOTAL);
		elementvalor_total.appendChild(document.createTextNode(presupuestoventas.getvalor_total().toString().trim()));
		element.appendChild(elementvalor_total);
	}
	
	public void generarReporteGroupGenericoPresupuestoVentassSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PresupuestoVentas> presupuestoventassSeleccionados=new ArrayList<PresupuestoVentas>();
		
		presupuestoventassSeleccionados=this.getPresupuestoVentassSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPresupuestoVentas(presupuestoventassSeleccionados);
		
		this.generarReportePresupuestoVentass("Todos",presupuestoventassSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPresupuestoVentas(ArrayList<PresupuestoVentas> presupuestoventassSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PresupuestoVentas presupuestoventasAux:presupuestoventassSeleccionados) {
				presupuestoventasAux.setsDetalleGeneralEntityReporte(presupuestoventasAux.toString());
			
				if(sTipoSeleccionar.equals(PresupuestoVentasConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					presupuestoventasAux.setsDescripcionGeneralEntityReporte1(presupuestoventasAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresupuestoVentasConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					presupuestoventasAux.setsDescripcionGeneralEntityReporte1(presupuestoventasAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresupuestoVentasConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					presupuestoventasAux.setsDescripcionGeneralEntityReporte1(presupuestoventasAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresupuestoVentasConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					presupuestoventasAux.setsDescripcionGeneralEntityReporte1(presupuestoventasAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresupuestoVentasConstantesFunciones.LABEL_IDVENDEDOR)) {
					existe=true;
					presupuestoventasAux.setsDescripcionGeneralEntityReporte1(presupuestoventasAux.getvendedor_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresupuestoVentasConstantesFunciones.LABEL_IDPAIS)) {
					existe=true;
					presupuestoventasAux.setsDescripcionGeneralEntityReporte1(presupuestoventasAux.getpais_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresupuestoVentasConstantesFunciones.LABEL_IDCIUDAD)) {
					existe=true;
					presupuestoventasAux.setsDescripcionGeneralEntityReporte1(presupuestoventasAux.getciudad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresupuestoVentasConstantesFunciones.LABEL_IDZONA)) {
					existe=true;
					presupuestoventasAux.setsDescripcionGeneralEntityReporte1(presupuestoventasAux.getzona_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresupuestoVentasConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					presupuestoventasAux.setsDescripcionGeneralEntityReporte1(presupuestoventasAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresupuestoVentasConstantesFunciones.LABEL_CANTIDAD)) {
					existe=true;
					presupuestoventasAux.setsDescripcionGeneralEntityReporte1(presupuestoventasAux.getcantidad().toString());
				}
				 else if(sTipoSeleccionar.equals(PresupuestoVentasConstantesFunciones.LABEL_CANTIDADTOTAL)) {
					existe=true;
					presupuestoventasAux.setsDescripcionGeneralEntityReporte1(presupuestoventasAux.getcantidad_total().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPresupuestoVentas(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPresupuestoVentas=true;
				this.isVisibilidadCeldaNuevoRelacionesPresupuestoVentas=true;
				this.isVisibilidadCeldaGuardarCambiosPresupuestoVentas=true;
			}
			
			this.isVisibilidadCeldaModificarPresupuestoVentas=false;
			this.isVisibilidadCeldaActualizarPresupuestoVentas=false;
			this.isVisibilidadCeldaEliminarPresupuestoVentas=false;
			this.isVisibilidadCeldaCancelarPresupuestoVentas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestoVentas=true;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestoVentas=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPresupuestoVentas=false;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoVentas=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoVentas=false;
			this.isVisibilidadCeldaModificarPresupuestoVentas=false;
			this.isVisibilidadCeldaActualizarPresupuestoVentas=true;
			this.isVisibilidadCeldaEliminarPresupuestoVentas=false;
			this.isVisibilidadCeldaCancelarPresupuestoVentas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestoVentas=true;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestoVentas=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPresupuestoVentas=false;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoVentas=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoVentas=false;
			this.isVisibilidadCeldaModificarPresupuestoVentas=false;
			this.isVisibilidadCeldaActualizarPresupuestoVentas=true;
			this.isVisibilidadCeldaEliminarPresupuestoVentas=true;
			this.isVisibilidadCeldaCancelarPresupuestoVentas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestoVentas=true;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestoVentas=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPresupuestoVentas=false;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoVentas=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoVentas=false;
			this.isVisibilidadCeldaModificarPresupuestoVentas=false;
			this.isVisibilidadCeldaActualizarPresupuestoVentas=true;
			this.isVisibilidadCeldaEliminarPresupuestoVentas=false;
			this.isVisibilidadCeldaCancelarPresupuestoVentas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestoVentas=false;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestoVentas=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPresupuestoVentas=true;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoVentas=true;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoVentas=true;
			this.isVisibilidadCeldaModificarPresupuestoVentas=false;
			this.isVisibilidadCeldaActualizarPresupuestoVentas=false;
			this.isVisibilidadCeldaEliminarPresupuestoVentas=false;
			this.isVisibilidadCeldaCancelarPresupuestoVentas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestoVentas=true;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestoVentas=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPresupuestoVentas=false;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoVentas=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoVentas=false;
			this.isVisibilidadCeldaActualizarPresupuestoVentas=false;
			this.isVisibilidadCeldaEliminarPresupuestoVentas=false;
			this.isVisibilidadCeldaCancelarPresupuestoVentas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestoVentas=false;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestoVentas=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPresupuestoVentas=false;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoVentas=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoVentas=false;
			this.isVisibilidadCeldaModificarPresupuestoVentas=true;
			this.isVisibilidadCeldaActualizarPresupuestoVentas=false;
			this.isVisibilidadCeldaEliminarPresupuestoVentas=false;
			this.isVisibilidadCeldaCancelarPresupuestoVentas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestoVentas=false;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestoVentas=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PresupuestoVentasJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPresupuestoVentas=true;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoVentas=true;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoVentas=true;
		} else {
			this.actualizarEstadoPanelsPresupuestoVentas(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPresupuestoVentas=false;
			//this.isVisibilidadCeldaVerFormPresupuestoVentas=false;
			this.isVisibilidadCeldaDuplicarPresupuestoVentas=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!presupuestoventasSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoVentas=false;
		} else {
			this.isVisibilidadCeldaNuevoPresupuestoVentas=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoVentas=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(presupuestoventasSessionBean.getEsGuardarRelacionado()) {
			if(!presupuestoventasSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPresupuestoVentas=false;												
			}
			
			this.jButtonCerrarPresupuestoVentas.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoVentas=false;
		}
		
		if(!this.permiteMantenimiento(this.presupuestoventas)) {
			this.isVisibilidadCeldaActualizarPresupuestoVentas=false;
			this.isVisibilidadCeldaEliminarPresupuestoVentas=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPresupuestoVentas() {
	}
	
	public void actualizarEstadoPanelsPresupuestoVentas(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPresupuestoVentas!=null) {
				this.jScrollPanelDatosEdicionPresupuestoVentas.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestoVentas!=null) {
				this.jTabbedPaneBusquedasPresupuestoVentas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresupuestoVentas!=null) {
				this.jScrollPanelDatosPresupuestoVentas.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresupuestoVentas!=null) {
				this.jPanelPaginacionPresupuestoVentas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresupuestoVentas!=null) {
				this.jPanelParametrosReportesPresupuestoVentas.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPresupuestoVentas!=null) {
				this.jScrollPanelDatosEdicionPresupuestoVentas.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestoVentas!=null) {
				this.jTabbedPaneBusquedasPresupuestoVentas.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPresupuestoVentas!=null) {
				this.jScrollPanelDatosPresupuestoVentas.setVisible(false);
			}
			
			if(this.jPanelPaginacionPresupuestoVentas!=null) {
				this.jPanelPaginacionPresupuestoVentas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPresupuestoVentas!=null) {
				this.jPanelParametrosReportesPresupuestoVentas.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPresupuestoVentas!=null) {
				this.jScrollPanelDatosEdicionPresupuestoVentas.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestoVentas!=null) {
				this.jTabbedPaneBusquedasPresupuestoVentas.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPresupuestoVentas!=null) {
				this.jScrollPanelDatosPresupuestoVentas.setVisible(false);
			}
			
			if(this.jPanelPaginacionPresupuestoVentas!=null) {
				this.jPanelPaginacionPresupuestoVentas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPresupuestoVentas!=null) {
				this.jPanelParametrosReportesPresupuestoVentas.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPresupuestoVentas!=null) {
				this.jScrollPanelDatosEdicionPresupuestoVentas.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestoVentas!=null) {
				this.jTabbedPaneBusquedasPresupuestoVentas.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPresupuestoVentas!=null) {
				this.jScrollPanelDatosPresupuestoVentas.setVisible(false);
			}
			
			if(this.jPanelPaginacionPresupuestoVentas!=null) {
				this.jPanelPaginacionPresupuestoVentas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPresupuestoVentas!=null) {
				this.jPanelParametrosReportesPresupuestoVentas.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPresupuestoVentas!=null) {
				this.jScrollPanelDatosEdicionPresupuestoVentas.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestoVentas!=null) {
				this.jTabbedPaneBusquedasPresupuestoVentas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresupuestoVentas!=null) {
				this.jScrollPanelDatosPresupuestoVentas.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresupuestoVentas!=null) {
				this.jPanelPaginacionPresupuestoVentas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresupuestoVentas!=null) {
				this.jPanelParametrosReportesPresupuestoVentas.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPresupuestoVentas!=null) {
				this.jScrollPanelDatosEdicionPresupuestoVentas.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestoVentas!=null) {
				this.jTabbedPaneBusquedasPresupuestoVentas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresupuestoVentas!=null) {
				this.jScrollPanelDatosPresupuestoVentas.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresupuestoVentas!=null) {
				this.jPanelPaginacionPresupuestoVentas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresupuestoVentas!=null) {
				this.jPanelParametrosReportesPresupuestoVentas.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPresupuestoVentas!=null) {
				this.jScrollPanelDatosEdicionPresupuestoVentas.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestoVentas!=null) {
				this.jTabbedPaneBusquedasPresupuestoVentas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresupuestoVentas!=null) {
				this.jScrollPanelDatosPresupuestoVentas.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresupuestoVentas!=null) {
				this.jPanelPaginacionPresupuestoVentas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresupuestoVentas!=null) {
				this.jPanelParametrosReportesPresupuestoVentas.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPresupuestoVentas!=null) {
					this.jTabbedPaneBusquedasPresupuestoVentas.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPresupuestoVentas!=null) {
				this.jPanelParametrosReportesPresupuestoVentas.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestoVentas!=null) {
				this.jTabbedPaneBusquedasPresupuestoVentas.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPresupuestoVentas!=null) {
				this.jPanelParametrosReportesPresupuestoVentas.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCiudad=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdCiudadPresupuestoVentas);}

			this.isVisibilidadFK_IdPais=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdPaisPresupuestoVentas);}

			this.isVisibilidadFK_IdProducto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdProductoPresupuestoVentas);}

			this.isVisibilidadFK_IdVendedor=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdVendedor) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdVendedorPresupuestoVentas);}

			this.isVisibilidadFK_IdZona=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdZona) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdZonaPresupuestoVentas);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdCiudad=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdCiudadPresupuestoVentas);}

			this.isVisibilidadFK_IdPais=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdPaisPresupuestoVentas);}

			this.isVisibilidadFK_IdProducto=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdProductoPresupuestoVentas);}

			this.isVisibilidadFK_IdVendedor=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdVendedor) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdVendedorPresupuestoVentas);}

			this.isVisibilidadFK_IdZona=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdZona) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdZonaPresupuestoVentas);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadFK_IdCiudad=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdCiudadPresupuestoVentas);}

			this.isVisibilidadFK_IdPais=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdPaisPresupuestoVentas);}

			this.isVisibilidadFK_IdProducto=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdProductoPresupuestoVentas);}

			this.isVisibilidadFK_IdVendedor=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdVendedor) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdVendedorPresupuestoVentas);}

			this.isVisibilidadFK_IdZona=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdZona) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdZonaPresupuestoVentas);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadFK_IdCiudad=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdCiudadPresupuestoVentas);}

			this.isVisibilidadFK_IdPais=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdPaisPresupuestoVentas);}

			this.isVisibilidadFK_IdProducto=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdProductoPresupuestoVentas);}

			this.isVisibilidadFK_IdVendedor=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdVendedor) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdVendedorPresupuestoVentas);}

			this.isVisibilidadFK_IdZona=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdZona) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdZonaPresupuestoVentas);}
		}
		
	}

	public void setVisibilidadBusquedasParaVendedor(Boolean isParaVendedor){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaVendedorNegation=!isParaVendedor;

			this.isVisibilidadFK_IdCiudad=isParaVendedorNegation;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdCiudadPresupuestoVentas);}

			this.isVisibilidadFK_IdPais=isParaVendedorNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdPaisPresupuestoVentas);}

			this.isVisibilidadFK_IdProducto=isParaVendedorNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdProductoPresupuestoVentas);}

			this.isVisibilidadFK_IdVendedor=isParaVendedor;
			if(!this.isVisibilidadFK_IdVendedor) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdVendedorPresupuestoVentas);}

			this.isVisibilidadFK_IdZona=isParaVendedorNegation;
			if(!this.isVisibilidadFK_IdZona) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdZonaPresupuestoVentas);}
		}
		
	}

	public void setVisibilidadBusquedasParaPais(Boolean isParaPais){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPaisNegation=!isParaPais;

			this.isVisibilidadFK_IdCiudad=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdCiudadPresupuestoVentas);}

			this.isVisibilidadFK_IdPais=isParaPais;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdPaisPresupuestoVentas);}

			this.isVisibilidadFK_IdProducto=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdProductoPresupuestoVentas);}

			this.isVisibilidadFK_IdVendedor=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdVendedor) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdVendedorPresupuestoVentas);}

			this.isVisibilidadFK_IdZona=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdZona) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdZonaPresupuestoVentas);}
		}
		
	}

	public void setVisibilidadBusquedasParaCiudad(Boolean isParaCiudad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCiudadNegation=!isParaCiudad;

			this.isVisibilidadFK_IdCiudad=isParaCiudad;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdCiudadPresupuestoVentas);}

			this.isVisibilidadFK_IdPais=isParaCiudadNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdPaisPresupuestoVentas);}

			this.isVisibilidadFK_IdProducto=isParaCiudadNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdProductoPresupuestoVentas);}

			this.isVisibilidadFK_IdVendedor=isParaCiudadNegation;
			if(!this.isVisibilidadFK_IdVendedor) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdVendedorPresupuestoVentas);}

			this.isVisibilidadFK_IdZona=isParaCiudadNegation;
			if(!this.isVisibilidadFK_IdZona) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdZonaPresupuestoVentas);}
		}
		
	}

	public void setVisibilidadBusquedasParaZona(Boolean isParaZona){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaZonaNegation=!isParaZona;

			this.isVisibilidadFK_IdCiudad=isParaZonaNegation;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdCiudadPresupuestoVentas);}

			this.isVisibilidadFK_IdPais=isParaZonaNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdPaisPresupuestoVentas);}

			this.isVisibilidadFK_IdProducto=isParaZonaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdProductoPresupuestoVentas);}

			this.isVisibilidadFK_IdVendedor=isParaZonaNegation;
			if(!this.isVisibilidadFK_IdVendedor) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdVendedorPresupuestoVentas);}

			this.isVisibilidadFK_IdZona=isParaZona;
			if(!this.isVisibilidadFK_IdZona) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdZonaPresupuestoVentas);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadFK_IdCiudad=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdCiudadPresupuestoVentas);}

			this.isVisibilidadFK_IdPais=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdPaisPresupuestoVentas);}

			this.isVisibilidadFK_IdProducto=isParaProducto;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdProductoPresupuestoVentas);}

			this.isVisibilidadFK_IdVendedor=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdVendedor) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdVendedorPresupuestoVentas);}

			this.isVisibilidadFK_IdZona=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdZona) {this.jTabbedPaneBusquedasPresupuestoVentas.remove(jPanelFK_IdZonaPresupuestoVentas);}
		}
		
	}
	
	
	
	

	public String registrarSesionPresupuestoVentasParaBusquedaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(presupuestoventasSessionBean==null) {
				presupuestoventasSessionBean=new PresupuestoVentasSessionBean();
			}

			if(productoSessionBean==null) {
				productoSessionBean=new ProductoSessionBean();
			}

			productoSessionBean.setsPathNavegacionActual(presupuestoventasSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			productoSessionBean.setisPermiteRecargarInformacion(false);
			productoSessionBean.setisPaginaPopup(true);
			isPaginaPopupProducto=productoSessionBean.getisPaginaPopup();
			productoSessionBean.setisPaginaPopup(false);
			productoSessionBean.setEstaModoBusqueda(true);
			productoSessionBean.setsFuncionBusquedaRapida("window.opener.presupuestoventasFuncionGeneral.setCombosCodigoDesdeBusquedaid_producto(TO_REPLACE);");
			productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(PresupuestoVentasConstantesFunciones.SNOMBREOPCION);
			//productoSessionBean.setisBusquedaDesdeForeignKeySesionPresupuestoVentas(true);
			//productoSessionBean.setlidPresupuestoVentasActual(this.idPresupuestoVentasActual);

			presupuestoventasSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPresupuestoVentas(true);
			presupuestoventasSessionBean.setlIdPresupuestoVentasActualForeignKey(this.idPresupuestoVentasActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PresupuestoVentasSessionBean presupuestoventasSessionBean=new PresupuestoVentasSessionBean();
		
		if(this.presupuestoventasSessionBean==null) {
			this.presupuestoventasSessionBean=new PresupuestoVentasSessionBean();
		}
		
		this.presupuestoventasSessionBean.setsUltimaBusquedaPresupuestoVentas(this.getsAccionBusqueda());
		this.presupuestoventasSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.presupuestoventasSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCiudad")) {
			presupuestoventasSessionBean.setid_ciudad(this.getid_ciudadFK_IdCiudad());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
			presupuestoventasSessionBean.setid_ejercicio(this.getid_ejercicioFK_IdEjercicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			presupuestoventasSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
			presupuestoventasSessionBean.setid_pais(this.getid_paisFK_IdPais());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
			presupuestoventasSessionBean.setid_periodo(this.getid_periodoFK_IdPeriodo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
			presupuestoventasSessionBean.setid_producto(this.getid_productoFK_IdProducto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			presupuestoventasSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdVendedor")) {
			presupuestoventasSessionBean.setid_vendedor(this.getid_vendedorFK_IdVendedor());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdZona")) {
			presupuestoventasSessionBean.setid_zona(this.getid_zonaFK_IdZona());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PresupuestoVentasSessionBean presupuestoventasSessionBean=new PresupuestoVentasSessionBean();
		
		if(this.presupuestoventasSessionBean==null) {
			this.presupuestoventasSessionBean=new PresupuestoVentasSessionBean();
		}
		
		if(this.presupuestoventasSessionBean.getsUltimaBusquedaPresupuestoVentas()!=null&&!this.presupuestoventasSessionBean.getsUltimaBusquedaPresupuestoVentas().equals("")) {
			this.setsAccionBusqueda(presupuestoventasSessionBean.getsUltimaBusquedaPresupuestoVentas());
			this.setiNumeroPaginacion(presupuestoventasSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(presupuestoventasSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCiudad")) {
				this.setid_ciudadFK_IdCiudad(presupuestoventasSessionBean.getid_ciudad());
				presupuestoventasSessionBean.setid_ciudad(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
				this.setid_ejercicioFK_IdEjercicio(presupuestoventasSessionBean.getid_ejercicio());
				presupuestoventasSessionBean.setid_ejercicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(presupuestoventasSessionBean.getid_empresa());
				presupuestoventasSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
				this.setid_paisFK_IdPais(presupuestoventasSessionBean.getid_pais());
				presupuestoventasSessionBean.setid_pais(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
				this.setid_periodoFK_IdPeriodo(presupuestoventasSessionBean.getid_periodo());
				presupuestoventasSessionBean.setid_periodo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
				this.setid_productoFK_IdProducto(presupuestoventasSessionBean.getid_producto());
				presupuestoventasSessionBean.setid_producto(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(presupuestoventasSessionBean.getid_sucursal());
				presupuestoventasSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdVendedor")) {
				this.setid_vendedorFK_IdVendedor(presupuestoventasSessionBean.getid_vendedor());
				presupuestoventasSessionBean.setid_vendedor(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdZona")) {
				this.setid_zonaFK_IdZona(presupuestoventasSessionBean.getid_zona());
				presupuestoventasSessionBean.setid_zona(null);
			}
		}
		
		this.presupuestoventasSessionBean.setsUltimaBusquedaPresupuestoVentas("");
		this.presupuestoventasSessionBean.setiNumeroPaginacion(PresupuestoVentasConstantesFunciones.INUMEROPAGINACION);
		this.presupuestoventasSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPresupuestoVentas(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPresupuestoVentas() {
		this.updateBorderResaltarBusquedasFormularioPresupuestoVentas();
		this.updateVisibilidadBusquedasFormularioPresupuestoVentas();
		this.updateHabilitarBusquedasFormularioPresupuestoVentas();
	}
	
	public void updateBorderResaltarBusquedasFormularioPresupuestoVentas() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPresupuestoVentas.getComponents().length>0) {
	

		if(this.presupuestoventasConstantesFunciones.resaltarFK_IdCiudadPresupuestoVentas!=null) {
			index= this.jTabbedPaneBusquedasPresupuestoVentas.indexOfComponent(this.jPanelFK_IdCiudadPresupuestoVentas);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoVentas.getComponent(index);
				jPanel.setBorder(this.presupuestoventasConstantesFunciones.resaltarFK_IdCiudadPresupuestoVentas);
			}
		}

		if(this.presupuestoventasConstantesFunciones.resaltarFK_IdPaisPresupuestoVentas!=null) {
			index= this.jTabbedPaneBusquedasPresupuestoVentas.indexOfComponent(this.jPanelFK_IdPaisPresupuestoVentas);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoVentas.getComponent(index);
				jPanel.setBorder(this.presupuestoventasConstantesFunciones.resaltarFK_IdPaisPresupuestoVentas);
			}
		}

		if(this.presupuestoventasConstantesFunciones.resaltarFK_IdProductoPresupuestoVentas!=null) {
			index= this.jTabbedPaneBusquedasPresupuestoVentas.indexOfComponent(this.jPanelFK_IdProductoPresupuestoVentas);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoVentas.getComponent(index);
				jPanel.setBorder(this.presupuestoventasConstantesFunciones.resaltarFK_IdProductoPresupuestoVentas);
			}
		}

		if(this.presupuestoventasConstantesFunciones.resaltarFK_IdVendedorPresupuestoVentas!=null) {
			index= this.jTabbedPaneBusquedasPresupuestoVentas.indexOfComponent(this.jPanelFK_IdVendedorPresupuestoVentas);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoVentas.getComponent(index);
				jPanel.setBorder(this.presupuestoventasConstantesFunciones.resaltarFK_IdVendedorPresupuestoVentas);
			}
		}

		if(this.presupuestoventasConstantesFunciones.resaltarFK_IdZonaPresupuestoVentas!=null) {
			index= this.jTabbedPaneBusquedasPresupuestoVentas.indexOfComponent(this.jPanelFK_IdZonaPresupuestoVentas);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoVentas.getComponent(index);
				jPanel.setBorder(this.presupuestoventasConstantesFunciones.resaltarFK_IdZonaPresupuestoVentas);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPresupuestoVentas() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPresupuestoVentas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPresupuestoVentas.indexOfComponent(this.jPanelFK_IdCiudadPresupuestoVentas);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoVentas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.presupuestoventasConstantesFunciones.mostrarFK_IdCiudadPresupuestoVentas);
			if(!this.presupuestoventasConstantesFunciones.mostrarFK_IdCiudadPresupuestoVentas && index>-1) {
				this.jTabbedPaneBusquedasPresupuestoVentas.remove(index);
			}

			index= this.jTabbedPaneBusquedasPresupuestoVentas.indexOfComponent(this.jPanelFK_IdPaisPresupuestoVentas);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoVentas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.presupuestoventasConstantesFunciones.mostrarFK_IdPaisPresupuestoVentas);
			if(!this.presupuestoventasConstantesFunciones.mostrarFK_IdPaisPresupuestoVentas && index>-1) {
				this.jTabbedPaneBusquedasPresupuestoVentas.remove(index);
			}

			index= this.jTabbedPaneBusquedasPresupuestoVentas.indexOfComponent(this.jPanelFK_IdProductoPresupuestoVentas);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoVentas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.presupuestoventasConstantesFunciones.mostrarFK_IdProductoPresupuestoVentas);
			if(!this.presupuestoventasConstantesFunciones.mostrarFK_IdProductoPresupuestoVentas && index>-1) {
				this.jTabbedPaneBusquedasPresupuestoVentas.remove(index);
			}

			index= this.jTabbedPaneBusquedasPresupuestoVentas.indexOfComponent(this.jPanelFK_IdVendedorPresupuestoVentas);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoVentas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.presupuestoventasConstantesFunciones.mostrarFK_IdVendedorPresupuestoVentas);
			if(!this.presupuestoventasConstantesFunciones.mostrarFK_IdVendedorPresupuestoVentas && index>-1) {
				this.jTabbedPaneBusquedasPresupuestoVentas.remove(index);
			}

			index= this.jTabbedPaneBusquedasPresupuestoVentas.indexOfComponent(this.jPanelFK_IdZonaPresupuestoVentas);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoVentas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.presupuestoventasConstantesFunciones.mostrarFK_IdZonaPresupuestoVentas);
			if(!this.presupuestoventasConstantesFunciones.mostrarFK_IdZonaPresupuestoVentas && index>-1) {
				this.jTabbedPaneBusquedasPresupuestoVentas.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPresupuestoVentas() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPresupuestoVentas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPresupuestoVentas.indexOfComponent(this.jPanelFK_IdCiudadPresupuestoVentas);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoVentas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.presupuestoventasConstantesFunciones.activarFK_IdCiudadPresupuestoVentas);
				this.jTabbedPaneBusquedasPresupuestoVentas.setEnabledAt(index,this.presupuestoventasConstantesFunciones.activarFK_IdCiudadPresupuestoVentas);
			}

			index= this.jTabbedPaneBusquedasPresupuestoVentas.indexOfComponent(this.jPanelFK_IdPaisPresupuestoVentas);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoVentas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.presupuestoventasConstantesFunciones.activarFK_IdPaisPresupuestoVentas);
				this.jTabbedPaneBusquedasPresupuestoVentas.setEnabledAt(index,this.presupuestoventasConstantesFunciones.activarFK_IdPaisPresupuestoVentas);
			}

			index= this.jTabbedPaneBusquedasPresupuestoVentas.indexOfComponent(this.jPanelFK_IdProductoPresupuestoVentas);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoVentas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.presupuestoventasConstantesFunciones.activarFK_IdProductoPresupuestoVentas);
				this.jTabbedPaneBusquedasPresupuestoVentas.setEnabledAt(index,this.presupuestoventasConstantesFunciones.activarFK_IdProductoPresupuestoVentas);
			}

			index= this.jTabbedPaneBusquedasPresupuestoVentas.indexOfComponent(this.jPanelFK_IdVendedorPresupuestoVentas);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoVentas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.presupuestoventasConstantesFunciones.activarFK_IdVendedorPresupuestoVentas);
				this.jTabbedPaneBusquedasPresupuestoVentas.setEnabledAt(index,this.presupuestoventasConstantesFunciones.activarFK_IdVendedorPresupuestoVentas);
			}

			index= this.jTabbedPaneBusquedasPresupuestoVentas.indexOfComponent(this.jPanelFK_IdZonaPresupuestoVentas);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoVentas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.presupuestoventasConstantesFunciones.activarFK_IdZonaPresupuestoVentas);
				this.jTabbedPaneBusquedasPresupuestoVentas.setEnabledAt(index,this.presupuestoventasConstantesFunciones.activarFK_IdZonaPresupuestoVentas);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPresupuestoVentas(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCiudad")) {
			index= this.jTabbedPaneBusquedasPresupuestoVentas.indexOfComponent(this.jPanelFK_IdCiudadPresupuestoVentas);

			this.jTabbedPaneBusquedasPresupuestoVentas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoVentas.getComponent(index);

			this.presupuestoventasConstantesFunciones.setResaltarFK_IdCiudadPresupuestoVentas(resaltar);

			jPanel.setBorder(this.presupuestoventasConstantesFunciones.resaltarFK_IdCiudadPresupuestoVentas);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPais")) {
			index= this.jTabbedPaneBusquedasPresupuestoVentas.indexOfComponent(this.jPanelFK_IdPaisPresupuestoVentas);

			this.jTabbedPaneBusquedasPresupuestoVentas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoVentas.getComponent(index);

			this.presupuestoventasConstantesFunciones.setResaltarFK_IdPaisPresupuestoVentas(resaltar);

			jPanel.setBorder(this.presupuestoventasConstantesFunciones.resaltarFK_IdPaisPresupuestoVentas);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdProducto")) {
			index= this.jTabbedPaneBusquedasPresupuestoVentas.indexOfComponent(this.jPanelFK_IdProductoPresupuestoVentas);

			this.jTabbedPaneBusquedasPresupuestoVentas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoVentas.getComponent(index);

			this.presupuestoventasConstantesFunciones.setResaltarFK_IdProductoPresupuestoVentas(resaltar);

			jPanel.setBorder(this.presupuestoventasConstantesFunciones.resaltarFK_IdProductoPresupuestoVentas);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdVendedor")) {
			index= this.jTabbedPaneBusquedasPresupuestoVentas.indexOfComponent(this.jPanelFK_IdVendedorPresupuestoVentas);

			this.jTabbedPaneBusquedasPresupuestoVentas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoVentas.getComponent(index);

			this.presupuestoventasConstantesFunciones.setResaltarFK_IdVendedorPresupuestoVentas(resaltar);

			jPanel.setBorder(this.presupuestoventasConstantesFunciones.resaltarFK_IdVendedorPresupuestoVentas);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdZona")) {
			index= this.jTabbedPaneBusquedasPresupuestoVentas.indexOfComponent(this.jPanelFK_IdZonaPresupuestoVentas);

			this.jTabbedPaneBusquedasPresupuestoVentas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoVentas.getComponent(index);

			this.presupuestoventasConstantesFunciones.setResaltarFK_IdZonaPresupuestoVentas(resaltar);

			jPanel.setBorder(this.presupuestoventasConstantesFunciones.resaltarFK_IdZonaPresupuestoVentas);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPresupuestoVentas.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPresupuestoVentas() throws Exception {

		if(this.jInternalFrameDetalleFormPresupuestoVentas==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPresupuestoVentas();
		this.updateVisibilidadResaltarControlesFormularioPresupuestoVentas();
		this.updateHabilitarResaltarControlesFormularioPresupuestoVentas();
		
	}
	
	public void updateBorderResaltarControlesFormularioPresupuestoVentas() throws Exception {
		if(this.jInternalFrameDetalleFormPresupuestoVentas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.presupuestoventasConstantesFunciones.resaltaridPresupuestoVentas!=null && this.jInternalFrameDetalleFormPresupuestoVentas!=null) {this.jInternalFrameDetalleFormPresupuestoVentas.jLabelidPresupuestoVentas.setBorder(this.presupuestoventasConstantesFunciones.resaltaridPresupuestoVentas);}
		if(this.presupuestoventasConstantesFunciones.resaltarid_empresaPresupuestoVentas!=null && this.jInternalFrameDetalleFormPresupuestoVentas!=null) {this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_empresaPresupuestoVentas.setBorder(this.presupuestoventasConstantesFunciones.resaltarid_empresaPresupuestoVentas);}
		if(this.presupuestoventasConstantesFunciones.resaltarid_sucursalPresupuestoVentas!=null && this.jInternalFrameDetalleFormPresupuestoVentas!=null) {this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_sucursalPresupuestoVentas.setBorder(this.presupuestoventasConstantesFunciones.resaltarid_sucursalPresupuestoVentas);}
		if(this.presupuestoventasConstantesFunciones.resaltarid_ejercicioPresupuestoVentas!=null && this.jInternalFrameDetalleFormPresupuestoVentas!=null) {this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_ejercicioPresupuestoVentas.setBorder(this.presupuestoventasConstantesFunciones.resaltarid_ejercicioPresupuestoVentas);}
		if(this.presupuestoventasConstantesFunciones.resaltarid_periodoPresupuestoVentas!=null && this.jInternalFrameDetalleFormPresupuestoVentas!=null) {this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_periodoPresupuestoVentas.setBorder(this.presupuestoventasConstantesFunciones.resaltarid_periodoPresupuestoVentas);}
		if(this.presupuestoventasConstantesFunciones.resaltarid_vendedorPresupuestoVentas!=null && this.jInternalFrameDetalleFormPresupuestoVentas!=null) {this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_vendedorPresupuestoVentas.setBorder(this.presupuestoventasConstantesFunciones.resaltarid_vendedorPresupuestoVentas);}
		if(this.presupuestoventasConstantesFunciones.resaltarid_paisPresupuestoVentas!=null && this.jInternalFrameDetalleFormPresupuestoVentas!=null) {this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_paisPresupuestoVentas.setBorder(this.presupuestoventasConstantesFunciones.resaltarid_paisPresupuestoVentas);}
		if(this.presupuestoventasConstantesFunciones.resaltarid_ciudadPresupuestoVentas!=null && this.jInternalFrameDetalleFormPresupuestoVentas!=null) {this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_ciudadPresupuestoVentas.setBorder(this.presupuestoventasConstantesFunciones.resaltarid_ciudadPresupuestoVentas);}
		if(this.presupuestoventasConstantesFunciones.resaltarid_zonaPresupuestoVentas!=null && this.jInternalFrameDetalleFormPresupuestoVentas!=null) {this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_zonaPresupuestoVentas.setBorder(this.presupuestoventasConstantesFunciones.resaltarid_zonaPresupuestoVentas);}
		if(this.presupuestoventasConstantesFunciones.resaltarid_productoPresupuestoVentas!=null && this.jInternalFrameDetalleFormPresupuestoVentas!=null) {this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_productoPresupuestoVentas.setBorder(this.presupuestoventasConstantesFunciones.resaltarid_productoPresupuestoVentas);}
		if(this.presupuestoventasConstantesFunciones.resaltarprecioPresupuestoVentas!=null && this.jInternalFrameDetalleFormPresupuestoVentas!=null) {this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldprecioPresupuestoVentas.setBorder(this.presupuestoventasConstantesFunciones.resaltarprecioPresupuestoVentas);}
		if(this.presupuestoventasConstantesFunciones.resaltarcantidadPresupuestoVentas!=null && this.jInternalFrameDetalleFormPresupuestoVentas!=null) {this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldcantidadPresupuestoVentas.setBorder(this.presupuestoventasConstantesFunciones.resaltarcantidadPresupuestoVentas);}
		if(this.presupuestoventasConstantesFunciones.resaltarvalorPresupuestoVentas!=null && this.jInternalFrameDetalleFormPresupuestoVentas!=null) {this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldvalorPresupuestoVentas.setBorder(this.presupuestoventasConstantesFunciones.resaltarvalorPresupuestoVentas);}
		if(this.presupuestoventasConstantesFunciones.resaltarporcentajePresupuestoVentas!=null && this.jInternalFrameDetalleFormPresupuestoVentas!=null) {this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldporcentajePresupuestoVentas.setBorder(this.presupuestoventasConstantesFunciones.resaltarporcentajePresupuestoVentas);}
		if(this.presupuestoventasConstantesFunciones.resaltarcantidad_totalPresupuestoVentas!=null && this.jInternalFrameDetalleFormPresupuestoVentas!=null) {this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldcantidad_totalPresupuestoVentas.setBorder(this.presupuestoventasConstantesFunciones.resaltarcantidad_totalPresupuestoVentas);}
		if(this.presupuestoventasConstantesFunciones.resaltarvalor_totalPresupuestoVentas!=null && this.jInternalFrameDetalleFormPresupuestoVentas!=null) {this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldvalor_totalPresupuestoVentas.setBorder(this.presupuestoventasConstantesFunciones.resaltarvalor_totalPresupuestoVentas);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPresupuestoVentas() throws Exception {		
		if(this.jInternalFrameDetalleFormPresupuestoVentas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
	
		//this.jInternalFrameDetalleFormPresupuestoVentas.jLabelidPresupuestoVentas.setVisible(this.presupuestoventasConstantesFunciones.mostraridPresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jPanelidPresupuestoVentas.setVisible(this.presupuestoventasConstantesFunciones.mostraridPresupuestoVentas);
		//this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_empresaPresupuestoVentas.setVisible(this.presupuestoventasConstantesFunciones.mostrarid_empresaPresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jPanelid_empresaPresupuestoVentas.setVisible(this.presupuestoventasConstantesFunciones.mostrarid_empresaPresupuestoVentas);
		//this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_sucursalPresupuestoVentas.setVisible(this.presupuestoventasConstantesFunciones.mostrarid_sucursalPresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jPanelid_sucursalPresupuestoVentas.setVisible(this.presupuestoventasConstantesFunciones.mostrarid_sucursalPresupuestoVentas);
		//this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_ejercicioPresupuestoVentas.setVisible(this.presupuestoventasConstantesFunciones.mostrarid_ejercicioPresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jPanelid_ejercicioPresupuestoVentas.setVisible(this.presupuestoventasConstantesFunciones.mostrarid_ejercicioPresupuestoVentas);
		//this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_periodoPresupuestoVentas.setVisible(this.presupuestoventasConstantesFunciones.mostrarid_periodoPresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jPanelid_periodoPresupuestoVentas.setVisible(this.presupuestoventasConstantesFunciones.mostrarid_periodoPresupuestoVentas);
		//this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_vendedorPresupuestoVentas.setVisible(this.presupuestoventasConstantesFunciones.mostrarid_vendedorPresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jPanelid_vendedorPresupuestoVentas.setVisible(this.presupuestoventasConstantesFunciones.mostrarid_vendedorPresupuestoVentas);
		//this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_paisPresupuestoVentas.setVisible(this.presupuestoventasConstantesFunciones.mostrarid_paisPresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jPanelid_paisPresupuestoVentas.setVisible(this.presupuestoventasConstantesFunciones.mostrarid_paisPresupuestoVentas);
		//this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_ciudadPresupuestoVentas.setVisible(this.presupuestoventasConstantesFunciones.mostrarid_ciudadPresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jPanelid_ciudadPresupuestoVentas.setVisible(this.presupuestoventasConstantesFunciones.mostrarid_ciudadPresupuestoVentas);
		//this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_zonaPresupuestoVentas.setVisible(this.presupuestoventasConstantesFunciones.mostrarid_zonaPresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jPanelid_zonaPresupuestoVentas.setVisible(this.presupuestoventasConstantesFunciones.mostrarid_zonaPresupuestoVentas);
		//this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_productoPresupuestoVentas.setVisible(this.presupuestoventasConstantesFunciones.mostrarid_productoPresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jPanelid_productoPresupuestoVentas.setVisible(this.presupuestoventasConstantesFunciones.mostrarid_productoPresupuestoVentas);
			this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_productoPresupuestoVentas.setVisible(this.presupuestoventasConstantesFunciones.mostrarid_productoPresupuestoVentas);
		//this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldprecioPresupuestoVentas.setVisible(this.presupuestoventasConstantesFunciones.mostrarprecioPresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jPanelprecioPresupuestoVentas.setVisible(this.presupuestoventasConstantesFunciones.mostrarprecioPresupuestoVentas);
		//this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldcantidadPresupuestoVentas.setVisible(this.presupuestoventasConstantesFunciones.mostrarcantidadPresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jPanelcantidadPresupuestoVentas.setVisible(this.presupuestoventasConstantesFunciones.mostrarcantidadPresupuestoVentas);
		//this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldvalorPresupuestoVentas.setVisible(this.presupuestoventasConstantesFunciones.mostrarvalorPresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jPanelvalorPresupuestoVentas.setVisible(this.presupuestoventasConstantesFunciones.mostrarvalorPresupuestoVentas);
		//this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldporcentajePresupuestoVentas.setVisible(this.presupuestoventasConstantesFunciones.mostrarporcentajePresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jPanelporcentajePresupuestoVentas.setVisible(this.presupuestoventasConstantesFunciones.mostrarporcentajePresupuestoVentas);
		//this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldcantidad_totalPresupuestoVentas.setVisible(this.presupuestoventasConstantesFunciones.mostrarcantidad_totalPresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jPanelcantidad_totalPresupuestoVentas.setVisible(this.presupuestoventasConstantesFunciones.mostrarcantidad_totalPresupuestoVentas);
		//this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldvalor_totalPresupuestoVentas.setVisible(this.presupuestoventasConstantesFunciones.mostrarvalor_totalPresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jPanelvalor_totalPresupuestoVentas.setVisible(this.presupuestoventasConstantesFunciones.mostrarvalor_totalPresupuestoVentas);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPresupuestoVentas() throws Exception {
		if(this.jInternalFrameDetalleFormPresupuestoVentas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPresupuestoVentas!=null) {
	
		this.jInternalFrameDetalleFormPresupuestoVentas.jLabelidPresupuestoVentas.setEnabled(this.presupuestoventasConstantesFunciones.activaridPresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_empresaPresupuestoVentas.setEnabled(this.presupuestoventasConstantesFunciones.activarid_empresaPresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_sucursalPresupuestoVentas.setEnabled(this.presupuestoventasConstantesFunciones.activarid_sucursalPresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_ejercicioPresupuestoVentas.setEnabled(this.presupuestoventasConstantesFunciones.activarid_ejercicioPresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_periodoPresupuestoVentas.setEnabled(this.presupuestoventasConstantesFunciones.activarid_periodoPresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_vendedorPresupuestoVentas.setEnabled(this.presupuestoventasConstantesFunciones.activarid_vendedorPresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_paisPresupuestoVentas.setEnabled(this.presupuestoventasConstantesFunciones.activarid_paisPresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_ciudadPresupuestoVentas.setEnabled(this.presupuestoventasConstantesFunciones.activarid_ciudadPresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_zonaPresupuestoVentas.setEnabled(this.presupuestoventasConstantesFunciones.activarid_zonaPresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jComboBoxid_productoPresupuestoVentas.setEnabled(this.presupuestoventasConstantesFunciones.activarid_productoPresupuestoVentas);
			this.jInternalFrameDetalleFormPresupuestoVentas.jButtonid_productoPresupuestoVentas.setEnabled(this.presupuestoventasConstantesFunciones.activarid_productoPresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldprecioPresupuestoVentas.setEnabled(this.presupuestoventasConstantesFunciones.activarprecioPresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldcantidadPresupuestoVentas.setEnabled(this.presupuestoventasConstantesFunciones.activarcantidadPresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldvalorPresupuestoVentas.setEnabled(this.presupuestoventasConstantesFunciones.activarvalorPresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldporcentajePresupuestoVentas.setEnabled(this.presupuestoventasConstantesFunciones.activarporcentajePresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldcantidad_totalPresupuestoVentas.setEnabled(this.presupuestoventasConstantesFunciones.activarcantidad_totalPresupuestoVentas);
		this.jInternalFrameDetalleFormPresupuestoVentas.jTextFieldvalor_totalPresupuestoVentas.setEnabled(this.presupuestoventasConstantesFunciones.activarvalor_totalPresupuestoVentas);
		}
	}
	
		
}