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

import com.bydan.erp.inventario.util.DetalleRequisicionConstantesFunciones;
import com.bydan.erp.inventario.util.DetalleRequisicionParameterReturnGeneral;
//import com.bydan.erp.inventario.util.DetalleRequisicionParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.DetalleRequisicionBean;
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
public class DetalleRequisicionBeanSwingJInternalFrame extends DetalleRequisicionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DetalleRequisicionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DetalleRequisicion> detallerequisicionValidator = new ClassValidator<DetalleRequisicion>(DetalleRequisicion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DetalleRequisicion detallerequisicion;	
	public DetalleRequisicion detallerequisicionAux;
	public DetalleRequisicion detallerequisicionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DetalleRequisicion detallerequisicionTotales;
	public Long idDetalleRequisicionActual;
	public Long iIdNuevoDetalleRequisicion=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboRequisicion="";

	public List<Requisicion> requisicionsForeignKey;

	public List<Requisicion> getrequisicionsForeignKey() {
		return requisicionsForeignKey;
	}

	public void setrequisicionsForeignKey(List<Requisicion> requisicionsForeignKey) {
		this.requisicionsForeignKey = requisicionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Requisicion requisicionForeignKey;

	public Requisicion getrequisicionForeignKey() {
		return requisicionForeignKey;
	}

	public void setrequisicionForeignKey(Requisicion requisicionForeignKey) {
		this.requisicionForeignKey = requisicionForeignKey;
	}

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

	public String sFinalQueryComboAnio="";

	public List<Anio> aniosForeignKey;

	public List<Anio> getaniosForeignKey() {
		return aniosForeignKey;
	}

	public void setaniosForeignKey(List<Anio> aniosForeignKey) {
		this.aniosForeignKey = aniosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Anio anioForeignKey;

	public Anio getanioForeignKey() {
		return anioForeignKey;
	}

	public void setanioForeignKey(Anio anioForeignKey) {
		this.anioForeignKey = anioForeignKey;
	}

	public String sFinalQueryComboMes="";

	public List<Mes> messForeignKey;

	public List<Mes> getmessForeignKey() {
		return messForeignKey;
	}

	public void setmessForeignKey(List<Mes> messForeignKey) {
		this.messForeignKey = messForeignKey;
	}

	//OBJETO FK ACTUAL
	public Mes mesForeignKey;

	public Mes getmesForeignKey() {
		return mesForeignKey;
	}

	public void setmesForeignKey(Mes mesForeignKey) {
		this.mesForeignKey = mesForeignKey;
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
	
	public Boolean isPermisoTodoDetalleRequisicion;
	public Boolean isPermisoNuevoDetalleRequisicion;
	public Boolean isPermisoActualizarDetalleRequisicion;
	public Boolean isPermisoActualizarOriginalDetalleRequisicion;
	public Boolean isPermisoEliminarDetalleRequisicion;
	public Boolean isPermisoGuardarCambiosDetalleRequisicion;
	public Boolean isPermisoConsultaDetalleRequisicion;
	public Boolean isPermisoBusquedaDetalleRequisicion;
	public Boolean isPermisoReporteDetalleRequisicion;
	public Boolean isPermisoPaginacionMedioDetalleRequisicion;
	public Boolean isPermisoPaginacionAltoDetalleRequisicion;
	public Boolean isPermisoPaginacionTodoDetalleRequisicion;
	public Boolean isPermisoCopiarDetalleRequisicion;
	public Boolean isPermisoVerFormDetalleRequisicion;
	public Boolean isPermisoDuplicarDetalleRequisicion;
	public Boolean isPermisoOrdenDetalleRequisicion;
	
	
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
	
	public DetalleRequisicionParameterReturnGeneral detallerequisicionReturnGeneral;
	public DetalleRequisicionParameterReturnGeneral detallerequisicionParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDetalleRequisicion=false;
	public Boolean esParaAccionDesdeFormularioDetalleRequisicion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DetalleRequisicionSessionBeanAdditional detallerequisicionSessionBeanAdditional=null;
	
	public DetalleRequisicionSessionBeanAdditional getDetalleRequisicionSessionBeanAdditional() {
		return this.detallerequisicionSessionBeanAdditional;
	}
	
	public void setDetalleRequisicionSessionBeanAdditional(DetalleRequisicionSessionBeanAdditional detallerequisicionSessionBeanAdditional) {
		try {
			this.detallerequisicionSessionBeanAdditional=detallerequisicionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DetalleRequisicionBeanSwingJInternalFrameAdditional detallerequisicionBeanSwingJInternalFrameAdditional=null;
	//public class DetalleRequisicionBeanSwingJInternalFrame
	
	public DetalleRequisicionBeanSwingJInternalFrameAdditional getDetalleRequisicionBeanSwingJInternalFrameAdditional() {
		return this.detallerequisicionBeanSwingJInternalFrameAdditional;
	}
	
	public void setDetalleRequisicionBeanSwingJInternalFrameAdditional(DetalleRequisicionBeanSwingJInternalFrameAdditional detallerequisicionBeanSwingJInternalFrameAdditional) {
		try {
			this.detallerequisicionBeanSwingJInternalFrameAdditional=detallerequisicionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DetalleRequisicionLogic detallerequisicionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DetalleRequisicion detallerequisicionBean;
	public DetalleRequisicionConstantesFunciones detallerequisicionConstantesFunciones;
	//public DetalleRequisicionParameterReturnGeneral detallerequisicionReturnGeneral;
	
	//FK
	
	public RequisicionLogic requisicionLogic;
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	public AnioLogic anioLogic;
	public MesLogic mesLogic;
	public BodegaLogic bodegaLogic;
	public ProductoLogic productoLogic;
	public UnidadLogic unidadLogic;
	
	//PARAMETROS
	
	
	//public List<DetalleRequisicion> detallerequisicions;	
	//public List<DetalleRequisicion> detallerequisicionsEliminados;
	//public List<DetalleRequisicion> detallerequisicionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDetalleRequisicion=false;
	public Boolean isVisibilidadCeldaDuplicarDetalleRequisicion=true;
	public Boolean isVisibilidadCeldaCopiarDetalleRequisicion=true;
	public Boolean isVisibilidadCeldaVerFormDetalleRequisicion=true;
	public Boolean isVisibilidadCeldaOrdenDetalleRequisicion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDetalleRequisicion=false;
	public Boolean isVisibilidadCeldaModificarDetalleRequisicion=false;
	public Boolean isVisibilidadCeldaActualizarDetalleRequisicion=false;
	public Boolean isVisibilidadCeldaEliminarDetalleRequisicion=false;
	public Boolean isVisibilidadCeldaCancelarDetalleRequisicion=false;
	public Boolean isVisibilidadCeldaGuardarDetalleRequisicion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDetalleRequisicion=false;	
	
	
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdMes=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdRequisicion=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdUnidad=false;
	
	public Long getiIdNuevoDetalleRequisicion() {
		return this.iIdNuevoDetalleRequisicion;
	}

	public void setiIdNuevoDetalleRequisicion(Long iIdNuevoDetalleRequisicion) {
		this.iIdNuevoDetalleRequisicion = iIdNuevoDetalleRequisicion;
	}
	
	public Long getidDetalleRequisicionActual() {
		return this.idDetalleRequisicionActual;
	}

	public void setidDetalleRequisicionActual(Long idDetalleRequisicionActual) {
		this.idDetalleRequisicionActual = idDetalleRequisicionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DetalleRequisicion getdetallerequisicion() {
		return this.detallerequisicion;
	}

	public void setdetallerequisicion(DetalleRequisicion detallerequisicion) {
		this.detallerequisicion = detallerequisicion;
	}
	
	public DetalleRequisicion getdetallerequisicionAux() {
		return this.detallerequisicionAux;
	}

	public void setdetallerequisicionAux(DetalleRequisicion detallerequisicionAux) {
		this.detallerequisicionAux = detallerequisicionAux;
	}				
	
	public DetalleRequisicion getdetallerequisicionAnterior() {
		return this.detallerequisicionAnterior;
	}

	public void setdetallerequisicionAnterior(DetalleRequisicion detallerequisicionAnterior) {
		this.detallerequisicionAnterior = detallerequisicionAnterior;
	}	
	
	public DetalleRequisicion getdetallerequisicionTotales() {
		return this.detallerequisicionTotales;
	}

	public void setdetallerequisicionTotales(DetalleRequisicion detallerequisicionTotales) {
		this.detallerequisicionTotales = detallerequisicionTotales;
	}	
	
	public DetalleRequisicion getdetallerequisicionBean() {
		return this.detallerequisicionBean;
	}

	public void setdetallerequisicionBean(DetalleRequisicion detallerequisicionBean) {
		this.detallerequisicionBean = detallerequisicionBean;
	}	
	
	public DetalleRequisicionParameterReturnGeneral getdetallerequisicionReturnGeneral() {
		return this.detallerequisicionReturnGeneral;
	}

	public void setdetallerequisicionReturnGeneral(DetalleRequisicionParameterReturnGeneral detallerequisicionReturnGeneral) {
		this.detallerequisicionReturnGeneral = detallerequisicionReturnGeneral;
	}	
	
	
	public Long id_anioFK_IdAnio=null;

	public Long getid_anioFK_IdAnio() {
		return this.id_anioFK_IdAnio;
	}

	public void setid_anioFK_IdAnio(Long id_anioFK_IdAnio) {
		this.id_anioFK_IdAnio = id_anioFK_IdAnio;
	}

	public Long id_bodegaFK_IdBodega=-1L;

	public Long getid_bodegaFK_IdBodega() {
		return this.id_bodegaFK_IdBodega;
	}

	public void setid_bodegaFK_IdBodega(Long id_bodegaFK_IdBodega) {
		this.id_bodegaFK_IdBodega = id_bodegaFK_IdBodega;
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

	public Long id_mesFK_IdMes=null;

	public Long getid_mesFK_IdMes() {
		return this.id_mesFK_IdMes;
	}

	public void setid_mesFK_IdMes(Long id_mesFK_IdMes) {
		this.id_mesFK_IdMes = id_mesFK_IdMes;
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

	public Long id_requisicionFK_IdRequisicion=-1L;

	public Long getid_requisicionFK_IdRequisicion() {
		return this.id_requisicionFK_IdRequisicion;
	}

	public void setid_requisicionFK_IdRequisicion(Long id_requisicionFK_IdRequisicion) {
		this.id_requisicionFK_IdRequisicion = id_requisicionFK_IdRequisicion;
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
	
	
	public DetalleRequisicionLogic getDetalleRequisicionLogic()	{		
		return detallerequisicionLogic;
	}

	public void setDetalleRequisicionLogic(DetalleRequisicionLogic detallerequisicionLogic) {
		this.detallerequisicionLogic = detallerequisicionLogic;
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
	
	public Boolean getIsEsNuevoDetalleRequisicion() {
		return isEsNuevoDetalleRequisicion;
	}

	public void setIsEsNuevoDetalleRequisicion(Boolean isEsNuevoDetalleRequisicion) {
		this.isEsNuevoDetalleRequisicion = isEsNuevoDetalleRequisicion;
	}

	public Boolean getEsParaAccionDesdeFormularioDetalleRequisicion() {
		return esParaAccionDesdeFormularioDetalleRequisicion;
	}
	
	public void setEsParaAccionDesdeFormularioDetalleRequisicion(Boolean esParaAccionDesdeFormularioDetalleRequisicion) {
		this.esParaAccionDesdeFormularioDetalleRequisicion = esParaAccionDesdeFormularioDetalleRequisicion;
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
	
	
	public void cargarCombosRequisicionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.requisicionsForeignKey=new ArrayList<Requisicion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			RequisicionLogic requisicionLogic=new RequisicionLogic();

			requisicionLogic.getRequisicionDataAccess().setIsForForeingKeyData(true);

			if(this.detallerequisicionSessionBean==null) {
				this.detallerequisicionSessionBean=new DetalleRequisicionSessionBean();
			}

			if(!this.detallerequisicionSessionBean.getisBusquedaDesdeForeignKeySesionRequisicion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					requisicionLogic.getRequisicionDataAccess().setIsForForeingKeyData(true);

					requisicionLogic.getTodosRequisicionsWithConnection(sFinalQuery,new Pagination());

					this.requisicionsForeignKey=requisicionLogic.getRequisicions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaRequisicion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					requisicionLogic.getEntityWithConnection(detallerequisicionSessionBean.getlidRequisicionActual());
					this.requisicionsForeignKey.add(requisicionLogic.getRequisicion());
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

			if(this.detallerequisicionSessionBean==null) {
				this.detallerequisicionSessionBean=new DetalleRequisicionSessionBean();
			}

			if(!this.detallerequisicionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(detallerequisicionSessionBean.getlidEmpresaActual());
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

			if(this.detallerequisicionSessionBean==null) {
				this.detallerequisicionSessionBean=new DetalleRequisicionSessionBean();
			}

			if(!this.detallerequisicionSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(detallerequisicionSessionBean.getlidSucursalActual());
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

			if(this.detallerequisicionSessionBean==null) {
				this.detallerequisicionSessionBean=new DetalleRequisicionSessionBean();
			}

			if(!this.detallerequisicionSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(detallerequisicionSessionBean.getlidEjercicioActual());
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

			if(this.detallerequisicionSessionBean==null) {
				this.detallerequisicionSessionBean=new DetalleRequisicionSessionBean();
			}

			if(!this.detallerequisicionSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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
					periodoLogic.getEntityWithConnection(detallerequisicionSessionBean.getlidPeriodoActual());
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

	public void cargarCombosAniosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.aniosForeignKey=new ArrayList<Anio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			AnioLogic anioLogic=new AnioLogic();

			//anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

			if(this.detallerequisicionSessionBean==null) {
				this.detallerequisicionSessionBean=new DetalleRequisicionSessionBean();
			}

			if(!this.detallerequisicionSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

					anioLogic.getTodosAniosWithConnection(sFinalQuery,new Pagination());

					this.aniosForeignKey=anioLogic.getAnios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaAnio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					anioLogic.getEntityWithConnection(detallerequisicionSessionBean.getlidAnioActual());
					this.aniosForeignKey.add(anioLogic.getAnio());
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

	public void cargarCombosMessForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.messForeignKey=new ArrayList<Mes>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			MesLogic mesLogic=new MesLogic();

			//mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

			if(this.detallerequisicionSessionBean==null) {
				this.detallerequisicionSessionBean=new DetalleRequisicionSessionBean();
			}

			if(!this.detallerequisicionSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

					mesLogic.getTodosMessWithConnection(sFinalQuery,new Pagination());

					this.messForeignKey=mesLogic.getMess();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaMes(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesLogic.getEntityWithConnection(detallerequisicionSessionBean.getlidMesActual());
					this.messForeignKey.add(mesLogic.getMes());
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

			if(this.detallerequisicionSessionBean==null) {
				this.detallerequisicionSessionBean=new DetalleRequisicionSessionBean();
			}

			if(!this.detallerequisicionSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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
					bodegaLogic.getEntityWithConnection(detallerequisicionSessionBean.getlidBodegaActual());
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

			if(this.detallerequisicionSessionBean==null) {
				this.detallerequisicionSessionBean=new DetalleRequisicionSessionBean();
			}

			if(!this.detallerequisicionSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(detallerequisicionSessionBean.getlidProductoActual());
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

			if(this.detallerequisicionSessionBean==null) {
				this.detallerequisicionSessionBean=new DetalleRequisicionSessionBean();
			}

			if(!this.detallerequisicionSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
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
					unidadLogic.getEntityWithConnection(detallerequisicionSessionBean.getlidUnidadActual());
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

	
	
	public void setActualRequisicionForeignKey(Long idRequisicionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Requisicion  requisicionTemp=null;

			for(Requisicion requisicionAux:requisicionsForeignKey) {
				if(requisicionAux.getId()!=null && requisicionAux.getId().equals(idRequisicionSeleccionado)) {
					requisicionTemp=requisicionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(requisicionTemp!=null) {

					if(this.detallerequisicion!=null) {
						this.detallerequisicion.setRequisicion(requisicionTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
						this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_requisicionDetalleRequisicion.setSelectedItem(requisicionTemp);
					}
				} else {
					//jComboBoxid_requisicionDetalleRequisicion.setSelectedItem(requisicionTemp);
					if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
						if(this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_requisicionDetalleRequisicion.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_requisicionDetalleRequisicion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdRequisicion") || sFormularioTipoBusqueda.equals("Todos")){
					if(requisicionTemp!=null && jComboBoxid_requisicionFK_IdRequisicionDetalleRequisicion!=null) {
						jComboBoxid_requisicionFK_IdRequisicionDetalleRequisicion.setSelectedItem(requisicionTemp);
					} else {
						if(jComboBoxid_requisicionFK_IdRequisicionDetalleRequisicion!=null) {
							//jComboBoxid_requisicionFK_IdRequisicionDetalleRequisicion.setSelectedItem(requisicionTemp);
							if(jComboBoxid_requisicionFK_IdRequisicionDetalleRequisicion.getItemCount()>0) {
								jComboBoxid_requisicionFK_IdRequisicionDetalleRequisicion.setSelectedIndex(0);
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

	public String getActualRequisicionForeignKeyDescripcion(Long idRequisicionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Requisicion  requisicionTemp=null;

			for(Requisicion requisicionAux:requisicionsForeignKey) {
				if(requisicionAux.getId()!=null && requisicionAux.getId().equals(idRequisicionSeleccionado)) {
					requisicionTemp=requisicionAux;
					break;
				}
			}


			sDescripcion=RequisicionConstantesFunciones.getRequisicionDescripcion(requisicionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualRequisicionForeignKeyGenerico(Long idRequisicionSeleccionado,JComboBox jComboBoxid_requisicionDetalleRequisicionGenerico)throws Exception
	{
		try
		{
			Requisicion  requisicionTemp=null;

			for(Requisicion requisicionAux:requisicionsForeignKey) {
				if(requisicionAux.getId()!=null && requisicionAux.getId().equals(idRequisicionSeleccionado)) {
					requisicionTemp=requisicionAux;
					break;
				}
			}

			if(requisicionTemp!=null) {
				jComboBoxid_requisicionDetalleRequisicionGenerico.setSelectedItem(requisicionTemp);
			} else {
				if(jComboBoxid_requisicionDetalleRequisicionGenerico!=null && jComboBoxid_requisicionDetalleRequisicionGenerico.getItemCount()>0) {
					jComboBoxid_requisicionDetalleRequisicionGenerico.setSelectedIndex(0);
				}
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

					if(this.detallerequisicion!=null) {
						this.detallerequisicion.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
						this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_empresaDetalleRequisicion.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaDetalleRequisicion.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
						if(this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_empresaDetalleRequisicion.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_empresaDetalleRequisicion.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaDetalleRequisicionGenerico)throws Exception
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
				jComboBoxid_empresaDetalleRequisicionGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaDetalleRequisicionGenerico!=null && jComboBoxid_empresaDetalleRequisicionGenerico.getItemCount()>0) {
					jComboBoxid_empresaDetalleRequisicionGenerico.setSelectedIndex(0);
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

					if(this.detallerequisicion!=null) {
						this.detallerequisicion.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
						this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_sucursalDetalleRequisicion.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalDetalleRequisicion.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
						if(this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_sucursalDetalleRequisicion.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_sucursalDetalleRequisicion.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalDetalleRequisicionGenerico)throws Exception
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
				jComboBoxid_sucursalDetalleRequisicionGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalDetalleRequisicionGenerico!=null && jComboBoxid_sucursalDetalleRequisicionGenerico.getItemCount()>0) {
					jComboBoxid_sucursalDetalleRequisicionGenerico.setSelectedIndex(0);
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

					if(this.detallerequisicion!=null) {
						this.detallerequisicion.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
						this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_ejercicioDetalleRequisicion.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioDetalleRequisicion.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
						if(this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_ejercicioDetalleRequisicion.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_ejercicioDetalleRequisicion.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioDetalleRequisicionGenerico)throws Exception
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
				jComboBoxid_ejercicioDetalleRequisicionGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioDetalleRequisicionGenerico!=null && jComboBoxid_ejercicioDetalleRequisicionGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioDetalleRequisicionGenerico.setSelectedIndex(0);
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

					if(this.detallerequisicion!=null) {
						this.detallerequisicion.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
						this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_periodoDetalleRequisicion.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoDetalleRequisicion.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
						if(this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_periodoDetalleRequisicion.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_periodoDetalleRequisicion.setSelectedIndex(0);
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
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoDetalleRequisicionGenerico)throws Exception
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
				jComboBoxid_periodoDetalleRequisicionGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoDetalleRequisicionGenerico!=null && jComboBoxid_periodoDetalleRequisicionGenerico.getItemCount()>0) {
					jComboBoxid_periodoDetalleRequisicionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualAnioForeignKey(Long idAnioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(anioTemp!=null) {

					if(this.detallerequisicion!=null) {
						this.detallerequisicion.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
						this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_anioDetalleRequisicion.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioDetalleRequisicion.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
						if(this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_anioDetalleRequisicion.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_anioDetalleRequisicion.setSelectedIndex(0);
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

	public String getActualAnioForeignKeyDescripcion(Long idAnioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}


			sDescripcion=AnioConstantesFunciones.getAnioDescripcion(anioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioDetalleRequisicionGenerico)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(anioTemp!=null) {
				jComboBoxid_anioDetalleRequisicionGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioDetalleRequisicionGenerico!=null && jComboBoxid_anioDetalleRequisicionGenerico.getItemCount()>0) {
					jComboBoxid_anioDetalleRequisicionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualMesForeignKey(Long idMesSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(mesTemp!=null) {

					if(this.detallerequisicion!=null) {
						this.detallerequisicion.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
						this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_mesDetalleRequisicion.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesDetalleRequisicion.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
						if(this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_mesDetalleRequisicion.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_mesDetalleRequisicion.setSelectedIndex(0);
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

	public String getActualMesForeignKeyDescripcion(Long idMesSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}


			sDescripcion=MesConstantesFunciones.getMesDescripcion(mesTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesDetalleRequisicionGenerico)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(mesTemp!=null) {
				jComboBoxid_mesDetalleRequisicionGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesDetalleRequisicionGenerico!=null && jComboBoxid_mesDetalleRequisicionGenerico.getItemCount()>0) {
					jComboBoxid_mesDetalleRequisicionGenerico.setSelectedIndex(0);
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

					if(this.detallerequisicion!=null) {
						this.detallerequisicion.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
						this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_bodegaDetalleRequisicion.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaDetalleRequisicion.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
						if(this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_bodegaDetalleRequisicion.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_bodegaDetalleRequisicion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaFK_IdBodegaDetalleRequisicion!=null) {
						jComboBoxid_bodegaFK_IdBodegaDetalleRequisicion.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaFK_IdBodegaDetalleRequisicion!=null) {
							//jComboBoxid_bodegaFK_IdBodegaDetalleRequisicion.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaFK_IdBodegaDetalleRequisicion.getItemCount()>0) {
								jComboBoxid_bodegaFK_IdBodegaDetalleRequisicion.setSelectedIndex(0);
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
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaDetalleRequisicionGenerico)throws Exception
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
				jComboBoxid_bodegaDetalleRequisicionGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaDetalleRequisicionGenerico!=null && jComboBoxid_bodegaDetalleRequisicionGenerico.getItemCount()>0) {
					jComboBoxid_bodegaDetalleRequisicionGenerico.setSelectedIndex(0);
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

					if(this.detallerequisicion!=null) {
						this.detallerequisicion.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
						this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_productoDetalleRequisicion.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoDetalleRequisicion.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
						if(this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_productoDetalleRequisicion.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_productoDetalleRequisicion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoFK_IdProductoDetalleRequisicion!=null) {
						jComboBoxid_productoFK_IdProductoDetalleRequisicion.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoFK_IdProductoDetalleRequisicion!=null) {
							//jComboBoxid_productoFK_IdProductoDetalleRequisicion.setSelectedItem(productoTemp);
							if(jComboBoxid_productoFK_IdProductoDetalleRequisicion.getItemCount()>0) {
								jComboBoxid_productoFK_IdProductoDetalleRequisicion.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoDetalleRequisicionGenerico)throws Exception
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
				jComboBoxid_productoDetalleRequisicionGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoDetalleRequisicionGenerico!=null && jComboBoxid_productoDetalleRequisicionGenerico.getItemCount()>0) {
					jComboBoxid_productoDetalleRequisicionGenerico.setSelectedIndex(0);
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

					if(this.detallerequisicion!=null) {
						this.detallerequisicion.setUnidad(unidadTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
						this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_unidadDetalleRequisicion.setSelectedItem(unidadTemp);
					}
				} else {
					//jComboBoxid_unidadDetalleRequisicion.setSelectedItem(unidadTemp);
					if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
						if(this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_unidadDetalleRequisicion.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_unidadDetalleRequisicion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){
					if(unidadTemp!=null && jComboBoxid_unidadFK_IdUnidadDetalleRequisicion!=null) {
						jComboBoxid_unidadFK_IdUnidadDetalleRequisicion.setSelectedItem(unidadTemp);
					} else {
						if(jComboBoxid_unidadFK_IdUnidadDetalleRequisicion!=null) {
							//jComboBoxid_unidadFK_IdUnidadDetalleRequisicion.setSelectedItem(unidadTemp);
							if(jComboBoxid_unidadFK_IdUnidadDetalleRequisicion.getItemCount()>0) {
								jComboBoxid_unidadFK_IdUnidadDetalleRequisicion.setSelectedIndex(0);
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
	public void setActualUnidadForeignKeyGenerico(Long idUnidadSeleccionado,JComboBox jComboBoxid_unidadDetalleRequisicionGenerico)throws Exception
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
				jComboBoxid_unidadDetalleRequisicionGenerico.setSelectedItem(unidadTemp);
			} else {
				if(jComboBoxid_unidadDetalleRequisicionGenerico!=null && jComboBoxid_unidadDetalleRequisicionGenerico.getItemCount()>0) {
					jComboBoxid_unidadDetalleRequisicionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarRequisicionForeignKey(DetalleRequisicion detallerequisicion,JComboBox jComboBoxid_requisicionDetalleRequisicionGenerico)throws Exception
	{
		try
		{
			Requisicion  requisicionAux=new Requisicion();

			if(jComboBoxid_requisicionDetalleRequisicionGenerico==null) {
				requisicionAux=(Requisicion)this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_requisicionDetalleRequisicion.getSelectedItem();
			} else {
				requisicionAux=(Requisicion)jComboBoxid_requisicionDetalleRequisicionGenerico.getSelectedItem();
			}

			if(requisicionAux!=null && requisicionAux.getId()!=null) {
				detallerequisicion.setid_requisicion(requisicionAux.getId());
				detallerequisicion.setrequisicion_descripcion(DetalleRequisicionConstantesFunciones.getRequisicionDescripcion(requisicionAux));
				detallerequisicion.setRequisicion(requisicionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(DetalleRequisicion detallerequisicion,JComboBox jComboBoxid_empresaDetalleRequisicionGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaDetalleRequisicionGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_empresaDetalleRequisicion.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaDetalleRequisicionGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				detallerequisicion.setid_empresa(empresaAux.getId());
				detallerequisicion.setempresa_descripcion(DetalleRequisicionConstantesFunciones.getEmpresaDescripcion(empresaAux));
				detallerequisicion.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(DetalleRequisicion detallerequisicion,JComboBox jComboBoxid_sucursalDetalleRequisicionGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalDetalleRequisicionGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_sucursalDetalleRequisicion.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalDetalleRequisicionGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				detallerequisicion.setid_sucursal(sucursalAux.getId());
				detallerequisicion.setsucursal_descripcion(DetalleRequisicionConstantesFunciones.getSucursalDescripcion(sucursalAux));
				detallerequisicion.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(DetalleRequisicion detallerequisicion,JComboBox jComboBoxid_ejercicioDetalleRequisicionGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioDetalleRequisicionGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_ejercicioDetalleRequisicion.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioDetalleRequisicionGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				detallerequisicion.setid_ejercicio(ejercicioAux.getId());
				detallerequisicion.setejercicio_descripcion(DetalleRequisicionConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				detallerequisicion.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(DetalleRequisicion detallerequisicion,JComboBox jComboBoxid_periodoDetalleRequisicionGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoDetalleRequisicionGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_periodoDetalleRequisicion.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoDetalleRequisicionGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				if(periodoAux.getid_estado_periodo().equals(0L)) {
					throw new Exception("Periodo INACTIVO, NO PUEDE GUARDAR LA INFORMACION CONSULTE CON EL ADMINISTRADOR");
				}

				detallerequisicion.setid_periodo(periodoAux.getId());
				detallerequisicion.setperiodo_descripcion(DetalleRequisicionConstantesFunciones.getPeriodoDescripcion(periodoAux));
				detallerequisicion.setPeriodo(periodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(DetalleRequisicion detallerequisicion,JComboBox jComboBoxid_anioDetalleRequisicionGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioDetalleRequisicionGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_anioDetalleRequisicion.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioDetalleRequisicionGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				detallerequisicion.setid_anio(anioAux.getId());
				detallerequisicion.setanio_descripcion(DetalleRequisicionConstantesFunciones.getAnioDescripcion(anioAux));
				detallerequisicion.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(DetalleRequisicion detallerequisicion,JComboBox jComboBoxid_mesDetalleRequisicionGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesDetalleRequisicionGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_mesDetalleRequisicion.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesDetalleRequisicionGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				detallerequisicion.setid_mes(mesAux.getId());
				detallerequisicion.setmes_descripcion(DetalleRequisicionConstantesFunciones.getMesDescripcion(mesAux));
				detallerequisicion.setMes(mesAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(DetalleRequisicion detallerequisicion,JComboBox jComboBoxid_bodegaDetalleRequisicionGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaDetalleRequisicionGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_bodegaDetalleRequisicion.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaDetalleRequisicionGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				detallerequisicion.setid_bodega(bodegaAux.getId());
				detallerequisicion.setbodega_descripcion(DetalleRequisicionConstantesFunciones.getBodegaDescripcion(bodegaAux));
				detallerequisicion.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(DetalleRequisicion detallerequisicion,JComboBox jComboBoxid_productoDetalleRequisicionGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoDetalleRequisicionGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_productoDetalleRequisicion.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoDetalleRequisicionGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				detallerequisicion.setid_producto(productoAux.getId());
				detallerequisicion.setproducto_descripcion(DetalleRequisicionConstantesFunciones.getProductoDescripcion(productoAux));
				detallerequisicion.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUnidadForeignKey(DetalleRequisicion detallerequisicion,JComboBox jComboBoxid_unidadDetalleRequisicionGenerico)throws Exception
	{
		try
		{
			Unidad  unidadAux=new Unidad();

			if(jComboBoxid_unidadDetalleRequisicionGenerico==null) {
				unidadAux=(Unidad)this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_unidadDetalleRequisicion.getSelectedItem();
			} else {
				unidadAux=(Unidad)jComboBoxid_unidadDetalleRequisicionGenerico.getSelectedItem();
			}

			if(unidadAux!=null && unidadAux.getId()!=null) {
				detallerequisicion.setid_unidad(unidadAux.getId());
				detallerequisicion.setunidad_descripcion(DetalleRequisicionConstantesFunciones.getUnidadDescripcion(unidadAux));
				detallerequisicion.setUnidad(unidadAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameRequisicionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingRequisicion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleRequisicionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) { 
							this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_requisicionDetalleRequisicion.removeAllItems();

							for(Requisicion requisicion:this.requisicionsForeignKey) {
								this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_requisicionDetalleRequisicion.addItem(requisicion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) { 
					}

					if(!DetalleRequisicionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdRequisicion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleRequisicionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_requisicionFK_IdRequisicionDetalleRequisicion.removeAllItems();

							for(Requisicion requisicion:this.requisicionsForeignKey) {
								this.jComboBoxid_requisicionFK_IdRequisicionDetalleRequisicion.addItem(requisicion);
							}
						}

						if(!DetalleRequisicionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleRequisicionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) { 
							this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_empresaDetalleRequisicion.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_empresaDetalleRequisicion.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) { 
					}

					if(!DetalleRequisicionJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetalleRequisicionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) { 
							this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_sucursalDetalleRequisicion.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_sucursalDetalleRequisicion.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) { 
					}

					if(!DetalleRequisicionJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetalleRequisicionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) { 
							this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_ejercicioDetalleRequisicion.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_ejercicioDetalleRequisicion.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) { 
					}

					if(!DetalleRequisicionJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetalleRequisicionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) { 
							this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_periodoDetalleRequisicion.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_periodoDetalleRequisicion.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) { 
					}

					if(!DetalleRequisicionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameAniosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingAnio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleRequisicionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) { 
							this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_anioDetalleRequisicion.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_anioDetalleRequisicion.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) { 
					}

					if(!DetalleRequisicionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameMessForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingMes=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleRequisicionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) { 
							this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_mesDetalleRequisicion.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_mesDetalleRequisicion.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) { 
					}

					if(!DetalleRequisicionJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetalleRequisicionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) { 
							this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_bodegaDetalleRequisicion.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_bodegaDetalleRequisicion.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) { 
					}

					if(!DetalleRequisicionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleRequisicionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaDetalleRequisicion.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaFK_IdBodegaDetalleRequisicion.addItem(bodega);
							}
						}

						if(!DetalleRequisicionJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetalleRequisicionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) { 
							this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_productoDetalleRequisicion.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_productoDetalleRequisicion.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) { 
					}

					if(!DetalleRequisicionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleRequisicionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoFK_IdProductoDetalleRequisicion.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoFK_IdProductoDetalleRequisicion.addItem(producto);
							}
						}

						if(!DetalleRequisicionJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetalleRequisicionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) { 
							this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_unidadDetalleRequisicion.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_unidadDetalleRequisicion.addItem(unidad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) { 
					}

					if(!DetalleRequisicionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleRequisicionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_unidadFK_IdUnidadDetalleRequisicion.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jComboBoxid_unidadFK_IdUnidadDetalleRequisicion.addItem(unidad);
							}
						}

						if(!DetalleRequisicionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameRequisicionForeignKey(Requisicion requisicion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
							this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_requisicionDetalleRequisicion.setSelectedItem(requisicion);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
							this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_requisicionDetalleRequisicion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_requisicionFK_IdRequisicionDetalleRequisicion.setSelectedItem(requisicion);
						} else {
							this.jComboBoxid_requisicionFK_IdRequisicionDetalleRequisicion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
							this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_empresaDetalleRequisicion.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
							this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_empresaDetalleRequisicion.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
							this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_sucursalDetalleRequisicion.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
							this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_sucursalDetalleRequisicion.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
							this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_ejercicioDetalleRequisicion.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
							this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_ejercicioDetalleRequisicion.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
							this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_periodoDetalleRequisicion.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
							this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_periodoDetalleRequisicion.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameAnioForeignKey(Anio anio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
							this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_anioDetalleRequisicion.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
							this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_anioDetalleRequisicion.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameMesForeignKey(Mes mes,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
							this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_mesDetalleRequisicion.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
							this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_mesDetalleRequisicion.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
							this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_bodegaDetalleRequisicion.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
							this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_bodegaDetalleRequisicion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaFK_IdBodegaDetalleRequisicion.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaDetalleRequisicion.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
							this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_productoDetalleRequisicion.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
							this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_productoDetalleRequisicion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoFK_IdProductoDetalleRequisicion.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoFK_IdProductoDetalleRequisicion.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
							this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_unidadDetalleRequisicion.setSelectedItem(unidad);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
							this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_unidadDetalleRequisicion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_unidadFK_IdUnidadDetalleRequisicion.setSelectedItem(unidad);
						} else {
							this.jComboBoxid_unidadFK_IdUnidadDetalleRequisicion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesDetalleRequisicion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			DetalleRequisicionConstantesFunciones.refrescarForeignKeysDescripcionesDetalleRequisicion(this.detallerequisicionLogic.getDetalleRequisicions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			DetalleRequisicionConstantesFunciones.refrescarForeignKeysDescripcionesDetalleRequisicion(this.detallerequisicions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Requisicion.class));
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(Periodo.class));
		classes.add(new Classe(Anio.class));
		classes.add(new Classe(Mes.class));
		classes.add(new Classe(Bodega.class));
		classes.add(new Classe(Producto.class));
		classes.add(new Classe(Unidad.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//detallerequisicionLogic.setDetalleRequisicions(this.detallerequisicions);
			detallerequisicionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public DetalleRequisicionParameterReturnGeneral getDetalleRequisicionParameterGeneral() {
		return this.detallerequisicionParameterGeneral;
	}
	
	public void setDetalleRequisicionParameterGeneral(DetalleRequisicionParameterReturnGeneral detallerequisicionParameterGeneral) {
		this.detallerequisicionParameterGeneral = detallerequisicionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDetalleRequisicion() {
		return isPermisoTodoDetalleRequisicion;
	}

	public void setIsPermisoTodoDetalleRequisicion(Boolean isPermisoTodoDetalleRequisicion) {
		this.isPermisoTodoDetalleRequisicion = isPermisoTodoDetalleRequisicion;
	}

	public Boolean getIsPermisoNuevoDetalleRequisicion() {
		return isPermisoNuevoDetalleRequisicion;
	}

	public void setIsPermisoNuevoDetalleRequisicion(Boolean isPermisoNuevoDetalleRequisicion) {
		this.isPermisoNuevoDetalleRequisicion = isPermisoNuevoDetalleRequisicion;
	}

	public Boolean getIsPermisoActualizarDetalleRequisicion() {
		return isPermisoActualizarDetalleRequisicion;
	}

	public void setIsPermisoActualizarDetalleRequisicion(Boolean isPermisoActualizarDetalleRequisicion) {
		this.isPermisoActualizarDetalleRequisicion = isPermisoActualizarDetalleRequisicion;
	}

	public Boolean getIsPermisoEliminarDetalleRequisicion() {
		return isPermisoEliminarDetalleRequisicion;
	}

	public void setIsPermisoEliminarDetalleRequisicion(Boolean isPermisoEliminarDetalleRequisicion) {
		this.isPermisoEliminarDetalleRequisicion = isPermisoEliminarDetalleRequisicion;
	}

	public Boolean getIsPermisoGuardarCambiosDetalleRequisicion() {
		return isPermisoGuardarCambiosDetalleRequisicion;
	}

	public void setIsPermisoGuardarCambiosDetalleRequisicion(Boolean isPermisoGuardarCambiosDetalleRequisicion) {
		this.isPermisoGuardarCambiosDetalleRequisicion = isPermisoGuardarCambiosDetalleRequisicion;
	}
	
	public Boolean getIsPermisoConsultaDetalleRequisicion() {
		return isPermisoConsultaDetalleRequisicion;
	}

	public void setIsPermisoConsultaDetalleRequisicion(Boolean isPermisoConsultaDetalleRequisicion) {
		this.isPermisoConsultaDetalleRequisicion = isPermisoConsultaDetalleRequisicion;
	}

	public Boolean getIsPermisoBusquedaDetalleRequisicion() {
		return isPermisoBusquedaDetalleRequisicion;
	}

	public void setIsPermisoBusquedaDetalleRequisicion(Boolean isPermisoBusquedaDetalleRequisicion) {
		this.isPermisoBusquedaDetalleRequisicion = isPermisoBusquedaDetalleRequisicion;
	}

	public Boolean getIsPermisoReporteDetalleRequisicion() {
		return isPermisoReporteDetalleRequisicion;
	}

	public void setIsPermisoReporteDetalleRequisicion(Boolean isPermisoReporteDetalleRequisicion) {
		this.isPermisoReporteDetalleRequisicion = isPermisoReporteDetalleRequisicion;
	}
	
	public Boolean getIsPermisoPaginacionMedioDetalleRequisicion() {
		return isPermisoPaginacionMedioDetalleRequisicion;
	}

	public void setIsPermisoPaginacionMedioDetalleRequisicion(Boolean isPermisoPaginacionMedioDetalleRequisicion) {
		this.isPermisoPaginacionMedioDetalleRequisicion = isPermisoPaginacionMedioDetalleRequisicion;
	}
	
	public Boolean getIsPermisoPaginacionTodoDetalleRequisicion() {
		return isPermisoPaginacionTodoDetalleRequisicion;
	}

	public void setIsPermisoPaginacionTodoDetalleRequisicion(Boolean isPermisoPaginacionTodoDetalleRequisicion) {
		this.isPermisoPaginacionTodoDetalleRequisicion = isPermisoPaginacionTodoDetalleRequisicion;
	}
	
	public Boolean getIsPermisoPaginacionAltoDetalleRequisicion() {
		return isPermisoPaginacionAltoDetalleRequisicion;
	}

	public void setIsPermisoPaginacionAltoDetalleRequisicion(Boolean isPermisoPaginacionAltoDetalleRequisicion) {
		this.isPermisoPaginacionAltoDetalleRequisicion = isPermisoPaginacionAltoDetalleRequisicion;
	}
	
	public Boolean getIsPermisoCopiarDetalleRequisicion() {
		return isPermisoCopiarDetalleRequisicion;
	}

	public void setIsPermisoCopiarDetalleRequisicion(Boolean isPermisoCopiarDetalleRequisicion) {
		this.isPermisoCopiarDetalleRequisicion = isPermisoCopiarDetalleRequisicion;
	}
	
	public Boolean getIsPermisoVerFormDetalleRequisicion() {
		return isPermisoVerFormDetalleRequisicion;
	}

	public void setIsPermisoVerFormDetalleRequisicion(Boolean isPermisoVerFormDetalleRequisicion) {
		this.isPermisoVerFormDetalleRequisicion = isPermisoVerFormDetalleRequisicion;
	}
	
	public Boolean getIsPermisoDuplicarDetalleRequisicion() {
		return isPermisoDuplicarDetalleRequisicion;
	}

	public void setIsPermisoDuplicarDetalleRequisicion(Boolean isPermisoDuplicarDetalleRequisicion) {
		this.isPermisoDuplicarDetalleRequisicion = isPermisoDuplicarDetalleRequisicion;
	}
	
	public Boolean getIsPermisoOrdenDetalleRequisicion() {
		return isPermisoOrdenDetalleRequisicion;
	}

	public void setIsPermisoOrdenDetalleRequisicion(Boolean isPermisoOrdenDetalleRequisicion) {
		this.isPermisoOrdenDetalleRequisicion = isPermisoOrdenDetalleRequisicion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDetalleRequisicion() {
		return isVisibilidadCeldaNuevoDetalleRequisicion;
	}

	public void setIsVisibilidadCeldaNuevoDetalleRequisicion(Boolean isVisibilidadCeldaNuevoDetalleRequisicion) {
		this.isVisibilidadCeldaNuevoDetalleRequisicion = isVisibilidadCeldaNuevoDetalleRequisicion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDetalleRequisicion() {
		return isVisibilidadCeldaDuplicarDetalleRequisicion;
	}

	public void setIsVisibilidadCeldaDuplicarDetalleRequisicion(Boolean isVisibilidadCeldaDuplicarDetalleRequisicion) {
		this.isVisibilidadCeldaDuplicarDetalleRequisicion = isVisibilidadCeldaDuplicarDetalleRequisicion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDetalleRequisicion() {
		return isVisibilidadCeldaCopiarDetalleRequisicion;
	}

	public void setIsVisibilidadCeldaCopiarDetalleRequisicion(Boolean isVisibilidadCeldaCopiarDetalleRequisicion) {
		this.isVisibilidadCeldaCopiarDetalleRequisicion = isVisibilidadCeldaCopiarDetalleRequisicion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDetalleRequisicion() {
		return isVisibilidadCeldaVerFormDetalleRequisicion;
	}

	public void setIsVisibilidadCeldaVerFormDetalleRequisicion(Boolean isVisibilidadCeldaVerFormDetalleRequisicion) {
		this.isVisibilidadCeldaVerFormDetalleRequisicion = isVisibilidadCeldaVerFormDetalleRequisicion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDetalleRequisicion() {
		return isVisibilidadCeldaOrdenDetalleRequisicion;
	}

	public void setIsVisibilidadCeldaOrdenDetalleRequisicion(Boolean isVisibilidadCeldaOrdenDetalleRequisicion) {
		this.isVisibilidadCeldaOrdenDetalleRequisicion = isVisibilidadCeldaOrdenDetalleRequisicion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDetalleRequisicion() {
		return isVisibilidadCeldaNuevoRelacionesDetalleRequisicion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDetalleRequisicion(Boolean isVisibilidadCeldaNuevoRelacionesDetalleRequisicion) {
		this.isVisibilidadCeldaNuevoRelacionesDetalleRequisicion = isVisibilidadCeldaNuevoRelacionesDetalleRequisicion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDetalleRequisicion() {
		return isVisibilidadCeldaModificarDetalleRequisicion;
	}

	public void setIsVisibilidadCeldaModificarDetalleRequisicion(Boolean isVisibilidadCeldaModificarDetalleRequisicion) {
		this.isVisibilidadCeldaModificarDetalleRequisicion = isVisibilidadCeldaModificarDetalleRequisicion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDetalleRequisicion() {
		return isVisibilidadCeldaActualizarDetalleRequisicion;
	}

	public void setIsVisibilidadCeldaActualizarDetalleRequisicion(Boolean isVisibilidadCeldaActualizarDetalleRequisicion) {
		this.isVisibilidadCeldaActualizarDetalleRequisicion = isVisibilidadCeldaActualizarDetalleRequisicion;
	}

	public Boolean getIsVisibilidadCeldaEliminarDetalleRequisicion() {
		return isVisibilidadCeldaEliminarDetalleRequisicion;
	}

	public void setIsVisibilidadCeldaEliminarDetalleRequisicion(Boolean isVisibilidadCeldaEliminarDetalleRequisicion) {
		this.isVisibilidadCeldaEliminarDetalleRequisicion = isVisibilidadCeldaEliminarDetalleRequisicion;
	}

	public Boolean getIsVisibilidadCeldaCancelarDetalleRequisicion() {
		return isVisibilidadCeldaCancelarDetalleRequisicion;
	}

	public void setIsVisibilidadCeldaCancelarDetalleRequisicion(Boolean isVisibilidadCeldaCancelarDetalleRequisicion) {
		this.isVisibilidadCeldaCancelarDetalleRequisicion = isVisibilidadCeldaCancelarDetalleRequisicion;
	}

	public Boolean getIsVisibilidadCeldaGuardarDetalleRequisicion() {
		return isVisibilidadCeldaGuardarDetalleRequisicion;
	}

	public void setIsVisibilidadCeldaGuardarDetalleRequisicion(Boolean isVisibilidadCeldaGuardarDetalleRequisicion) {
		this.isVisibilidadCeldaGuardarDetalleRequisicion = isVisibilidadCeldaGuardarDetalleRequisicion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDetalleRequisicion() {
		return isVisibilidadCeldaGuardarCambiosDetalleRequisicion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDetalleRequisicion(Boolean isVisibilidadCeldaGuardarCambiosDetalleRequisicion) {
		this.isVisibilidadCeldaGuardarCambiosDetalleRequisicion = isVisibilidadCeldaGuardarCambiosDetalleRequisicion;
	}
		
	public DetalleRequisicionSessionBean getdetallerequisicionSessionBean() {
		return this.detallerequisicionSessionBean;
	}
	
	public void setdetallerequisicionSessionBean(DetalleRequisicionSessionBean detallerequisicionSessionBean) {
		this.detallerequisicionSessionBean=detallerequisicionSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdAnio() {
		return this.isVisibilidadFK_IdAnio;
	}

	public void setisVisibilidadFK_IdAnio(Boolean isVisibilidadFK_IdAnio) {
		this.isVisibilidadFK_IdAnio=isVisibilidadFK_IdAnio;
	}

	public Boolean getisVisibilidadFK_IdBodega() {
		return this.isVisibilidadFK_IdBodega;
	}

	public void setisVisibilidadFK_IdBodega(Boolean isVisibilidadFK_IdBodega) {
		this.isVisibilidadFK_IdBodega=isVisibilidadFK_IdBodega;
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

	public Boolean getisVisibilidadFK_IdMes() {
		return this.isVisibilidadFK_IdMes;
	}

	public void setisVisibilidadFK_IdMes(Boolean isVisibilidadFK_IdMes) {
		this.isVisibilidadFK_IdMes=isVisibilidadFK_IdMes;
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

	public Boolean getisVisibilidadFK_IdRequisicion() {
		return this.isVisibilidadFK_IdRequisicion;
	}

	public void setisVisibilidadFK_IdRequisicion(Boolean isVisibilidadFK_IdRequisicion) {
		this.isVisibilidadFK_IdRequisicion=isVisibilidadFK_IdRequisicion;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(DetalleRequisicion detallerequisicion)throws Exception {
		try {
			
				this.setActualParaGuardarRequisicionForeignKey(detallerequisicion,null);
				this.setActualParaGuardarEmpresaForeignKey(detallerequisicion,null);
				this.setActualParaGuardarSucursalForeignKey(detallerequisicion,null);
				this.setActualParaGuardarEjercicioForeignKey(detallerequisicion,null);
				this.setActualParaGuardarPeriodoForeignKey(detallerequisicion,null);
				this.setActualParaGuardarAnioForeignKey(detallerequisicion,null);
				this.setActualParaGuardarMesForeignKey(detallerequisicion,null);
				this.setActualParaGuardarBodegaForeignKey(detallerequisicion,null);
				this.setActualParaGuardarProductoForeignKey(detallerequisicion,null);
				this.setActualParaGuardarUnidadForeignKey(detallerequisicion,null);
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
	
	public void bugActualizarReferenciaActual(DetalleRequisicion detallerequisicion,DetalleRequisicion detallerequisicionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDetalleRequisicion(detallerequisicion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		detallerequisicionAux.setId(detallerequisicion.getId());
		detallerequisicionAux.setVersionRow(detallerequisicion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessDetalleRequisicion();
		
			int intSelectedRow = this.jTableDatosDetalleRequisicion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicion =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.detallerequisicion =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(DetalleRequisicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.detallerequisicion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = detallerequisicionValidator.getInvalidValues(this.detallerequisicion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			detallerequisicionLogic.setDatosCliente(datosCliente);
			detallerequisicionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				detallerequisicionAux=new  DetalleRequisicion();
				
				detallerequisicionAux.setIsNew(true);
				detallerequisicionAux.setIsChanged(true);
				
				detallerequisicionAux.setDetalleRequisicionOriginal(this.detallerequisicion);
				
				detallerequisicionAux.setId(this.detallerequisicion.getId());	
				detallerequisicionAux.setVersionRow(this.detallerequisicion.getVersionRow());	
				detallerequisicionAux.setid_requisicion(this.detallerequisicion.getid_requisicion());	
				detallerequisicionAux.setid_empresa(this.detallerequisicion.getid_empresa());	
				detallerequisicionAux.setid_sucursal(this.detallerequisicion.getid_sucursal());	
				detallerequisicionAux.setid_ejercicio(this.detallerequisicion.getid_ejercicio());	
				detallerequisicionAux.setid_periodo(this.detallerequisicion.getid_periodo());	
				detallerequisicionAux.setid_anio(this.detallerequisicion.getid_anio());	
				detallerequisicionAux.setid_mes(this.detallerequisicion.getid_mes());	
				detallerequisicionAux.setid_bodega(this.detallerequisicion.getid_bodega());	
				detallerequisicionAux.setid_producto(this.detallerequisicion.getid_producto());	
				detallerequisicionAux.setid_unidad(this.detallerequisicion.getid_unidad());	
				detallerequisicionAux.setcantidad(this.detallerequisicion.getcantidad());	
				detallerequisicionAux.setdescripcion(this.detallerequisicion.getdescripcion());	
				detallerequisicionAux.setfecha_autoriza(this.detallerequisicion.getfecha_autoriza());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detallerequisicionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detallerequisicionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(detallerequisicionAux,detallerequisicionLogic.getDetalleRequisicions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallerequisicionAux,detallerequisicions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.detallerequisicionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detallerequisicionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallerequisicionLogic.saveDetalleRequisicions();//WithConnection
						//detallerequisicionLogic.getSetVersionRowDetalleRequisicions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detallerequisicion,detallerequisicionAux);
					
					this.refrescarForeignKeysDescripcionesDetalleRequisicion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detallerequisicionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detallerequisicionLogic.saveDetalleRequisicionRelaciones(detallerequisicionAux);//WithConnection
								//detallerequisicionLogic.getSetVersionRowDetalleRequisicions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detallerequisicion,detallerequisicionAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detallerequisicionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detallerequisicionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detallerequisicionAux,detallerequisicionLogic.getDetalleRequisicions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detallerequisicionAux,detallerequisicions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detallerequisicion,detallerequisicionAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				detallerequisicionAux=new  DetalleRequisicion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.detallerequisicionSessionBean.getEsGuardarRelacionado() 
					|| (this.detallerequisicionSessionBean.getEsGuardarRelacionado() && this.detallerequisicion.getId()>=0)) {
						
					detallerequisicionAux.setIsNew(false);
				}
				
				detallerequisicionAux.setIsDeleted(false);
			
				detallerequisicionAux.setId(this.detallerequisicion.getId());	
				detallerequisicionAux.setVersionRow(this.detallerequisicion.getVersionRow());	
				detallerequisicionAux.setid_requisicion(this.detallerequisicion.getid_requisicion());	
				detallerequisicionAux.setid_empresa(this.detallerequisicion.getid_empresa());	
				detallerequisicionAux.setid_sucursal(this.detallerequisicion.getid_sucursal());	
				detallerequisicionAux.setid_ejercicio(this.detallerequisicion.getid_ejercicio());	
				detallerequisicionAux.setid_periodo(this.detallerequisicion.getid_periodo());	
				detallerequisicionAux.setid_anio(this.detallerequisicion.getid_anio());	
				detallerequisicionAux.setid_mes(this.detallerequisicion.getid_mes());	
				detallerequisicionAux.setid_bodega(this.detallerequisicion.getid_bodega());	
				detallerequisicionAux.setid_producto(this.detallerequisicion.getid_producto());	
				detallerequisicionAux.setid_unidad(this.detallerequisicion.getid_unidad());	
				detallerequisicionAux.setcantidad(this.detallerequisicion.getcantidad());	
				detallerequisicionAux.setdescripcion(this.detallerequisicion.getdescripcion());	
				detallerequisicionAux.setfecha_autoriza(this.detallerequisicion.getfecha_autoriza());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detallerequisicionAux,detallerequisicionLogic.getDetalleRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallerequisicionAux,detallerequisicions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.detallerequisicionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detallerequisicionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallerequisicionLogic.saveDetalleRequisicions();//WithConnection
						//detallerequisicionLogic.getSetVersionRowDetalleRequisicions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detallerequisicion,detallerequisicionAux);
					
					this.refrescarForeignKeysDescripcionesDetalleRequisicion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detallerequisicionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detallerequisicionLogic.saveDetalleRequisicionRelaciones(detallerequisicionAux);//WithConnection
								//detallerequisicionLogic.getSetVersionRowDetalleRequisicions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detallerequisicion,detallerequisicionAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detallerequisicionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detallerequisicionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detallerequisicionAux,detallerequisicionLogic.getDetalleRequisicions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detallerequisicionAux,detallerequisicions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detallerequisicion,detallerequisicionAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				detallerequisicionAux=new  DetalleRequisicion();
				
				detallerequisicionAux.setIsNew(false);
				detallerequisicionAux.setIsChanged(false);
				
				detallerequisicionAux.setIsDeleted(true);
				
				detallerequisicionAux.setId(this.detallerequisicion.getId());	
				detallerequisicionAux.setVersionRow(this.detallerequisicion.getVersionRow());	
				detallerequisicionAux.setid_requisicion(this.detallerequisicion.getid_requisicion());	
				detallerequisicionAux.setid_empresa(this.detallerequisicion.getid_empresa());	
				detallerequisicionAux.setid_sucursal(this.detallerequisicion.getid_sucursal());	
				detallerequisicionAux.setid_ejercicio(this.detallerequisicion.getid_ejercicio());	
				detallerequisicionAux.setid_periodo(this.detallerequisicion.getid_periodo());	
				detallerequisicionAux.setid_anio(this.detallerequisicion.getid_anio());	
				detallerequisicionAux.setid_mes(this.detallerequisicion.getid_mes());	
				detallerequisicionAux.setid_bodega(this.detallerequisicion.getid_bodega());	
				detallerequisicionAux.setid_producto(this.detallerequisicion.getid_producto());	
				detallerequisicionAux.setid_unidad(this.detallerequisicion.getid_unidad());	
				detallerequisicionAux.setcantidad(this.detallerequisicion.getcantidad());	
				detallerequisicionAux.setdescripcion(this.detallerequisicion.getdescripcion());	
				detallerequisicionAux.setfecha_autoriza(this.detallerequisicion.getfecha_autoriza());	
				
				if(this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.detallerequisicionAux.getId()>=0) {	
						this.detallerequisicionsEliminados.add(detallerequisicionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(detallerequisicionAux,detallerequisicionLogic.getDetalleRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallerequisicionAux,detallerequisicions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.detallerequisicionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detallerequisicionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallerequisicionLogic.saveDetalleRequisicions();//WithConnection
						//detallerequisicionLogic.getSetVersionRowDetalleRequisicions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detallerequisicionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detallerequisicionLogic.saveDetalleRequisicionRelaciones(detallerequisicionAux);//WithConnection
								//detallerequisicionLogic.getSetVersionRowDetalleRequisicions();//WithConnection
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
							if(this.detallerequisicionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.detallerequisicionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(detallerequisicionAux,detallerequisicionLogic.getDetalleRequisicions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(detallerequisicionAux,detallerequisicions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.getDetalleRequisicions().addAll(this.detallerequisicionsEliminados);
					
					detallerequisicionLogic.saveDetalleRequisicions();//WithConnection
					//detallerequisicionLogic.getSetVersionRowDetalleRequisicions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesDetalleRequisicion();
				
				this.detallerequisicionsEliminados= new ArrayList<DetalleRequisicion>();		
			}
			
			if(this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arrDatoGeneralTotales=DetalleRequisicionConstantesFunciones.getTotalesListaDetalleRequisicion(detallerequisicionLogic.getDetalleRequisicions());							
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				this.arrDatoGeneralTotales=DetalleRequisicionConstantesFunciones.getTotalesListaDetalleRequisicion(this.detallerequisicions);
			}
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Detalle Requisicion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Requisicion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.detallerequisicion=detallerequisicionAux;
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
      		//this.finishProcessDetalleRequisicion();
      	}
		
	}	
	
	public void actualizarRelaciones(DetalleRequisicion detallerequisicionLocal) throws Exception {
		
		if(this.detallerequisicionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DetalleRequisicion detallerequisicionLocal) throws Exception {	
		if(this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(RequisicionDetalleFormJInternalFrame.class)) {
				RequisicionBeanSwingJInternalFrame requisicionBeanSwingJInternalFrameLocal=(RequisicionBeanSwingJInternalFrame) ((RequisicionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				requisicionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoRequisicion(requisicionBeanSwingJInternalFrameLocal.getrequisicion(),true);
				requisicionBeanSwingJInternalFrameLocal.actualizarLista(requisicionBeanSwingJInternalFrameLocal.requisicion,this.requisicionsForeignKey);

				requisicionBeanSwingJInternalFrameLocal.actualizarRelaciones(requisicionBeanSwingJInternalFrameLocal.requisicion);

				detallerequisicionLocal.setRequisicion(requisicionBeanSwingJInternalFrameLocal.requisicion);

				this.addItemDefectoCombosForeignKeyRequisicion();
				this.cargarCombosFrameRequisicionsForeignKey("Formulario");
				this.setActualRequisicionForeignKey(requisicionBeanSwingJInternalFrameLocal.requisicion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				detallerequisicionLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				detallerequisicionLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				detallerequisicionLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				detallerequisicionLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				detallerequisicionLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				detallerequisicionLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				detallerequisicionLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				detallerequisicionLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UnidadDetalleFormJInternalFrame.class)) {
				UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrameLocal=(UnidadBeanSwingJInternalFrame) ((UnidadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				unidadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUnidad(unidadBeanSwingJInternalFrameLocal.getunidad(),true);
				unidadBeanSwingJInternalFrameLocal.actualizarLista(unidadBeanSwingJInternalFrameLocal.unidad,this.unidadsForeignKey);

				unidadBeanSwingJInternalFrameLocal.actualizarRelaciones(unidadBeanSwingJInternalFrameLocal.unidad);

				detallerequisicionLocal.setUnidad(unidadBeanSwingJInternalFrameLocal.unidad);

				this.addItemDefectoCombosForeignKeyUnidad();
				this.cargarCombosFrameUnidadsForeignKey("Formulario");
				this.setActualUnidadForeignKey(unidadBeanSwingJInternalFrameLocal.unidad.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDetalleRequisicionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDetalleRequisicion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detallerequisicion =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.detallerequisicion =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = detallerequisicionValidator.getInvalidValues(this.detallerequisicion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DetalleRequisicion detallerequisicion,List<DetalleRequisicion> detallerequisicions) throws Exception {
		try	{		
			DetalleRequisicionConstantesFunciones.actualizarLista(detallerequisicion,detallerequisicions,this.detallerequisicionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(DetalleRequisicion detallerequisicion,List<DetalleRequisicion> detallerequisicions) throws Exception {
		try	{			
			DetalleRequisicionConstantesFunciones.actualizarSelectedLista(detallerequisicion,detallerequisicions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DetalleRequisicion> detallerequisicionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				detallerequisicionsLocal=this.detallerequisicionLogic.getDetalleRequisicions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				detallerequisicionsLocal=this.detallerequisicions;
			}
			//ARCHITECTURE
		
			for(DetalleRequisicion detallerequisicionLocal:detallerequisicionsLocal) {
				if(this.permiteMantenimiento(detallerequisicionLocal) && detallerequisicionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DetalleRequisicionConstantesFunciones.getDetalleRequisicionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DetalleRequisicionConstantesFunciones.IDREQUISICION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleRequisicion.jLabelid_requisicionDetalleRequisicion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleRequisicionConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleRequisicion.jLabelid_empresaDetalleRequisicion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleRequisicionConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleRequisicion.jLabelid_sucursalDetalleRequisicion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleRequisicionConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleRequisicion.jLabelid_ejercicioDetalleRequisicion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleRequisicionConstantesFunciones.IDPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleRequisicion.jLabelid_periodoDetalleRequisicion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleRequisicionConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleRequisicion.jLabelid_anioDetalleRequisicion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleRequisicionConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleRequisicion.jLabelid_mesDetalleRequisicion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleRequisicionConstantesFunciones.IDBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleRequisicion.jLabelid_bodegaDetalleRequisicion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleRequisicionConstantesFunciones.IDPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleRequisicion.jLabelid_productoDetalleRequisicion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleRequisicionConstantesFunciones.IDUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleRequisicion.jLabelid_unidadDetalleRequisicion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleRequisicionConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleRequisicion.jLabelcantidadDetalleRequisicion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleRequisicionConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleRequisicion.jLabeldescripcionDetalleRequisicion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleRequisicionConstantesFunciones.FECHAAUTORIZA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleRequisicion.jLabelfecha_autorizaDetalleRequisicion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleRequisicion.jLabelid_requisicionDetalleRequisicion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleRequisicion.jLabelid_empresaDetalleRequisicion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleRequisicion.jLabelid_sucursalDetalleRequisicion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleRequisicion.jLabelid_ejercicioDetalleRequisicion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleRequisicion.jLabelid_periodoDetalleRequisicion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleRequisicion.jLabelid_anioDetalleRequisicion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleRequisicion.jLabelid_mesDetalleRequisicion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleRequisicion.jLabelid_bodegaDetalleRequisicion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleRequisicion.jLabelid_productoDetalleRequisicion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleRequisicion.jLabelid_unidadDetalleRequisicion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleRequisicion.jLabelcantidadDetalleRequisicion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleRequisicion.jLabeldescripcionDetalleRequisicion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleRequisicion.jLabelfecha_autorizaDetalleRequisicion,"");
		
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
		this.iIdNuevoDetalleRequisicion--;	
		
		
		this.detallerequisicionAux=new DetalleRequisicion();
		
		this.detallerequisicionAux.setId(this.iIdNuevoDetalleRequisicion);
		this.detallerequisicionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detallerequisicionLogic.getDetalleRequisicions().add(this.detallerequisicionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.detallerequisicions.add(this.detallerequisicionAux);
		}
		//ARCHITECTURE
		
		this.detallerequisicion=this.detallerequisicionAux;
		
		if(DetalleRequisicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDetalleRequisicion(this.detallerequisicion);
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleRequisicion(this.detallerequisicion);
		}
				
		//this.setDefaultControlesDetalleRequisicion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDetalleRequisicion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDetalleRequisicion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleRequisicion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleRequisicion(this.detallerequisicionBean,this.detallerequisicion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(DetalleRequisicionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.detallerequisicionSessionBean.getConGuardarRelaciones()) {
			classes=DetalleRequisicionConstantesFunciones.getClassesRelationshipsOfDetalleRequisicion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.detallerequisicionReturnGeneral=detallerequisicionLogic.procesarEventosDetalleRequisicionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detallerequisicionLogic.getDetalleRequisicions(),this.detallerequisicion,this.detallerequisicionParameterGeneral,this.isEsNuevoDetalleRequisicion,classes);//this.detallerequisicionLogic.getDetalleRequisicion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDetalleRequisicion(this.detallerequisicionReturnGeneral,this.detallerequisicionBean,false);
		
		if(this.detallerequisicionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleRequisicion(this.detallerequisicionReturnGeneral.getDetalleRequisicion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDetalleRequisicion(this.detallerequisicionReturnGeneral.getDetalleRequisicion());
		}
		
		if(this.detallerequisicionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDetalleRequisicion(this.detallerequisicionReturnGeneral.getDetalleRequisicion(),classes);//this.detallerequisicionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.detallerequisicion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDetalleRequisicion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDetalleRequisicion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleRequisicionBeanSwingJInternalFrameAdditional.RecargarFormDetalleRequisicion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDetalleRequisicion(false);
						
			if(detallerequisicionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DetalleRequisicionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleRequisicion();
			}
			
			this.actualizarVisualTableDatosDetalleRequisicion();
			
			this.jTableDatosDetalleRequisicion.setRowSelectionInterval(this.getIndiceNuevoDetalleRequisicion(), this.getIndiceNuevoDetalleRequisicion());
			
			this.seleccionarFilaTablaDetalleRequisicionActual();
						
			this.actualizarEstadoCeldasBotonesDetalleRequisicion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDetalleRequisicion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDetalleRequisicion.jTextFieldcantidadDetalleRequisicion.setEnabled(isHabilitar && this.detallerequisicionConstantesFunciones.activarcantidadDetalleRequisicion);
		this.jInternalFrameDetalleFormDetalleRequisicion.jTextAreadescripcionDetalleRequisicion.setEnabled(isHabilitar && this.detallerequisicionConstantesFunciones.activardescripcionDetalleRequisicion);//
		this.jInternalFrameDetalleFormDetalleRequisicion.jDateChooserfecha_autorizaDetalleRequisicion.setEnabled(isHabilitar && this.detallerequisicionConstantesFunciones.activarfecha_autorizaDetalleRequisicion);	
		
		this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_requisicionDetalleRequisicion.setEnabled(isHabilitar && this.detallerequisicionConstantesFunciones.activarid_requisicionDetalleRequisicion);//
		this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_empresaDetalleRequisicion.setEnabled(isHabilitar && this.detallerequisicionConstantesFunciones.activarid_empresaDetalleRequisicion);//
		this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_sucursalDetalleRequisicion.setEnabled(isHabilitar && this.detallerequisicionConstantesFunciones.activarid_sucursalDetalleRequisicion);//
		this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_ejercicioDetalleRequisicion.setEnabled(isHabilitar && this.detallerequisicionConstantesFunciones.activarid_ejercicioDetalleRequisicion);//
		this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_periodoDetalleRequisicion.setEnabled(isHabilitar && this.detallerequisicionConstantesFunciones.activarid_periodoDetalleRequisicion);//
		this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_anioDetalleRequisicion.setEnabled(isHabilitar && this.detallerequisicionConstantesFunciones.activarid_anioDetalleRequisicion);//
		this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_mesDetalleRequisicion.setEnabled(isHabilitar && this.detallerequisicionConstantesFunciones.activarid_mesDetalleRequisicion);
		this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_bodegaDetalleRequisicion.setEnabled(isHabilitar && this.detallerequisicionConstantesFunciones.activarid_bodegaDetalleRequisicion);
		this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_productoDetalleRequisicion.setEnabled(isHabilitar && this.detallerequisicionConstantesFunciones.activarid_productoDetalleRequisicion);
		this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_unidadDetalleRequisicion.setEnabled(isHabilitar && this.detallerequisicionConstantesFunciones.activarid_unidadDetalleRequisicion);
	};
	
	public void setDefaultControlesDetalleRequisicion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDetalleRequisicion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.detallerequisicionSessionBean.setConGuardarRelaciones(true);			
			this.detallerequisicionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDetalleRequisicion.jTabbedPaneRelacionesDetalleRequisicion.setVisible(true);
			
					
		} else {
			//this.detallerequisicionSessionBean.setConGuardarRelaciones(false);			
			this.detallerequisicionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDetalleRequisicion.jTabbedPaneRelacionesDetalleRequisicion.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDetalleRequisicion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleRequisicion detallerequisicionAux:this.detallerequisicionLogic.getDetalleRequisicions()) {
				if(detallerequisicionAux.getId().equals(this.iIdNuevoDetalleRequisicion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleRequisicion detallerequisicionAux:this.detallerequisicions) {
				if(detallerequisicionAux.getId().equals(this.iIdNuevoDetalleRequisicion)) {
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
	
	public int getIndiceActualDetalleRequisicion(DetalleRequisicion detallerequisicion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleRequisicion detallerequisicionAux:this.detallerequisicionLogic.getDetalleRequisicions()) {
				if(detallerequisicionAux.getId().equals(detallerequisicion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleRequisicion detallerequisicionAux:this.detallerequisicions) {
				if(detallerequisicionAux.getId().equals(detallerequisicion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDetalleRequisicion(DetalleRequisicion detallerequisicionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleRequisicion detallerequisicionAux:this.detallerequisicionLogic.getDetalleRequisicions()) {
				if(detallerequisicionAux.getDetalleRequisicionOriginal().getId().equals(detallerequisicionOriginal.getId())) {
					existe=true;
					detallerequisicionOriginal.setId(detallerequisicionAux.getId());
					detallerequisicionOriginal.setVersionRow(detallerequisicionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleRequisicion detallerequisicionAux:this.detallerequisicions) {
				if(detallerequisicionAux.getDetalleRequisicionOriginal().getId().equals(detallerequisicionOriginal.getId())) {
					existe=true;
					detallerequisicionOriginal.setId(detallerequisicionAux.getId());
					detallerequisicionOriginal.setVersionRow(detallerequisicionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDetalleRequisicion(Boolean esParaCancelar) throws Exception {
		detallerequisicionsAux=new ArrayList<DetalleRequisicion>();
		detallerequisicionAux=new DetalleRequisicion();
		
		if(!this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleRequisicion detallerequisicionAux:this.detallerequisicionLogic.getDetalleRequisicions()) {
					if(detallerequisicionAux.getId()<0) {
						detallerequisicionsAux.add(detallerequisicionAux);
					}		
				}
				this.iIdNuevoDetalleRequisicion=0L;
				this.detallerequisicionLogic.getDetalleRequisicions().removeAll(detallerequisicionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleRequisicion detallerequisicionAux:this.detallerequisicions) {
					if(detallerequisicionAux.getId()<0) {
						detallerequisicionsAux.add(detallerequisicionAux);
					}		
				}
				this.iIdNuevoDetalleRequisicion=0L;
				this.detallerequisicions.removeAll(detallerequisicionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDetalleRequisicion 
					&& this.detallerequisicionLogic.getDetalleRequisicions().size()>0
					) {
					detallerequisicionAux=this.detallerequisicionLogic.getDetalleRequisicions().get(this.detallerequisicionLogic.getDetalleRequisicions().size() - 1);
				
					if(detallerequisicionAux.getId()<0) {
						this.detallerequisicionLogic.getDetalleRequisicions().remove(detallerequisicionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDetalleRequisicion && this.detallerequisicions.size()>0) {
					detallerequisicionAux=this.detallerequisicions.get(this.detallerequisicions.size() - 1);
				
					if(detallerequisicionAux.getId()<0) {
						this.detallerequisicions.remove(detallerequisicionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDetalleRequisicion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(detallerequisicion.getId()<0) {
				this.detallerequisicionLogic.getDetalleRequisicions().remove(this.detallerequisicion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(detallerequisicion.getId()<0) {
				this.detallerequisicions.remove(this.detallerequisicion);
			}
		}			
	}
	
	public void setEstadosInicialesDetalleRequisicion(List<DetalleRequisicion> detallerequisicionsAux) throws Exception {
		DetalleRequisicionConstantesFunciones.setEstadosInicialesDetalleRequisicion(detallerequisicionsAux);
	}
	
	public void setEstadosInicialesDetalleRequisicion(DetalleRequisicion detallerequisicionAux) throws Exception {
		DetalleRequisicionConstantesFunciones.setEstadosInicialesDetalleRequisicion(detallerequisicionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDetalleRequisicionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDetalleRequisicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDetalleRequisicionActual()) {
				if(!this.isEsNuevoDetalleRequisicion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDetalleRequisicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDetalleRequisicion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDetalleRequisicionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Detalle Requisicion ?", "MANTENIMIENTO DE Detalle Requisicion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDetalleRequisicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DetalleRequisicion detallerequisicion) throws Exception {
		DetalleRequisicionConstantesFunciones.seleccionarAsignar(this.detallerequisicion,detallerequisicion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDetalleRequisicion=this.isPermisoActualizarOriginalDetalleRequisicion;
			
			
			this.seleccionarAsignar(detallerequisicion);
			
			

			idProductoActual=detallerequisicion.getid_producto();
			this.seleccionarProductoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleRequisicionConstantesFunciones.quitarEspaciosDetalleRequisicion(this.detallerequisicion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesDetalleRequisicion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.detallerequisicionSessionBean.setsFuncionBusquedaRapida(this.detallerequisicionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoDetalleRequisicion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDetalleRequisicion(esParaCancelar);				
				this.cancelarNuevoDetalleRequisicion(esParaCancelar);								
			}
			
			this.detallerequisicion=new DetalleRequisicion();
			
			this.inicializarDetalleRequisicion();
			
			this.actualizarEstadoCeldasBotonesDetalleRequisicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDetalleRequisicion() throws Exception {
		try {
			DetalleRequisicionConstantesFunciones.inicializarDetalleRequisicion(this.detallerequisicion);
			
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
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.detallerequisicionLogic.getDetalleRequisicions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDetalleRequisicions(String sAccionBusqueda,List<DetalleRequisicion> detallerequisicionsParaReportes) throws Exception {
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
					sPathReporteFinal="DetalleRequisicion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DetalleRequisicionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DetalleRequisicionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DetalleRequisicion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Detalle Requisicions");		
		parameters.put("busquedapor", DetalleRequisicionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDetalleRequisicion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DetalleRequisicionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DetalleRequisicionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDetalleRequisicion=new JRBeanArrayDataSource(DetalleRequisicionJInternalFrame.TraerDetalleRequisicionBeans(detallerequisicionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDetalleRequisicion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DetalleRequisicionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DetalleRequisicionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DetalleRequisicionBean.TraerDetalleRequisicionBeans(detallerequisicionsParaReportes).toArray()));
							
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
				this.generarExcelReporteDetalleRequisicions(sAccionBusqueda,sTipoArchivoReporte,detallerequisicionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDetalleRequisicions(sAccionBusqueda,sTipoArchivoReporte,detallerequisicionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDetalleRequisicionActionPerformed(null);
					//this.generarExcelReporteDetalleRequisicions(sAccionBusqueda,sTipoArchivoReporte,detallerequisicionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDetalleRequisicions(sAccionBusqueda,sTipoArchivoReporte,detallerequisicionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDetalleRequisicions(sAccionBusqueda,sTipoArchivoReporte,detallerequisicionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDetalleRequisicions(sAccionBusqueda,sTipoArchivoReporte,detallerequisicionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDetalleRequisicions(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleRequisicion> detallerequisicionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallerequisicion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleRequisicions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleRequisicion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DetalleRequisicion detallerequisicion : detallerequisicionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DetalleRequisicionConstantesFunciones.generarExcelReporteDataDetalleRequisicion("NORMAL",row,workbook,detallerequisicion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Requisicion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDetalleRequisicion(String sTipo,Row row,Workbook workbook) {
		
		DetalleRequisicionConstantesFunciones.generarExcelReporteHeaderDetalleRequisicion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDetalleRequisicions(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleRequisicion> detallerequisicionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallerequisicion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleRequisicions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DetalleRequisicion detallerequisicion : detallerequisicionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DetalleRequisicionConstantesFunciones.getDetalleRequisicionDescripcion(detallerequisicion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleRequisicionConstantesFunciones.LABEL_IDREQUISICION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleRequisicionConstantesFunciones.LABEL_IDREQUISICION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallerequisicion.getrequisicion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleRequisicionConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleRequisicionConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallerequisicion.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleRequisicionConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleRequisicionConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallerequisicion.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleRequisicionConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleRequisicionConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallerequisicion.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleRequisicionConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleRequisicionConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallerequisicion.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleRequisicionConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleRequisicionConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallerequisicion.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleRequisicionConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleRequisicionConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallerequisicion.getmes_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleRequisicionConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleRequisicionConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallerequisicion.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleRequisicionConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleRequisicionConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallerequisicion.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleRequisicionConstantesFunciones.LABEL_IDUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleRequisicionConstantesFunciones.LABEL_IDUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallerequisicion.getunidad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleRequisicionConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleRequisicionConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallerequisicion.getcantidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleRequisicionConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleRequisicionConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallerequisicion.getdescripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleRequisicionConstantesFunciones.LABEL_FECHAAUTORIZA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleRequisicionConstantesFunciones.LABEL_FECHAAUTORIZA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallerequisicion.getfecha_autoriza());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Requisicion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDetalleRequisicions(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleRequisicion> detallerequisicionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DetalleRequisicion> detallerequisicionsRespaldo=null;
		
		classes=DetalleRequisicionConstantesFunciones.getClassesRelationshipsOfDetalleRequisicion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.detallerequisicionLogic.setDatosCliente(this.datosCliente);
		this.detallerequisicionLogic.setDatosDeep(this.datosDeep);
		this.detallerequisicionLogic.setIsConDeep(true);
		
		detallerequisicionsRespaldo=this.detallerequisicionLogic.getDetalleRequisicions();
		
		this.detallerequisicionLogic.setDetalleRequisicions(detallerequisicionsParaReportes);	
		this.detallerequisicionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		detallerequisicionsParaReportes=this.detallerequisicionLogic.getDetalleRequisicions();
		this.detallerequisicionLogic.setDetalleRequisicions(detallerequisicionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallerequisicion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleRequisicions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleRequisicion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DetalleRequisicion detallerequisicion : detallerequisicionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDetalleRequisicion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DetalleRequisicionConstantesFunciones.generarExcelReporteDataDetalleRequisicion("NORMAL",row,workbook,detallerequisicion,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DetalleRequisicionConstantesFunciones.getDetalleRequisicionDescripcion(detallerequisicion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Requisicion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleRequisicion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleRequisicion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleRequisicion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleRequisicion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDetalleRequisicion() throws Exception {		
		this.startProcessDetalleRequisicion(true);
	}
	
	public void startProcessDetalleRequisicion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDetalleRequisicion ,this.jPanelParametrosReportesDetalleRequisicion, this.jScrollPanelDatosDetalleRequisicion,this.jPanelPaginacionDetalleRequisicion, this.jScrollPanelDatosEdicionDetalleRequisicion, this.jPanelAccionesDetalleRequisicion,this.jPanelAccionesFormularioDetalleRequisicion,this.jmenuBarDetalleRequisicion,this.jmenuBarDetalleDetalleRequisicion,this.jTtoolBarDetalleRequisicion,this.jTtoolBarDetalleDetalleRequisicion);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleRequisicion=this.jTabbedPaneBusquedasDetalleRequisicion; 
		
		final JPanel jPanelParametrosReportesDetalleRequisicion=this.jPanelParametrosReportesDetalleRequisicion;
		//final JScrollPane jScrollPanelDatosDetalleRequisicion=this.jScrollPanelDatosDetalleRequisicion;
		final JTable jTableDatosDetalleRequisicion=this.jTableDatosDetalleRequisicion;		
		final JPanel jPanelPaginacionDetalleRequisicion=this.jPanelPaginacionDetalleRequisicion;
		//final JScrollPane jScrollPanelDatosEdicionDetalleRequisicion=this.jScrollPanelDatosEdicionDetalleRequisicion;
		final JPanel jPanelAccionesDetalleRequisicion=this.jPanelAccionesDetalleRequisicion;
		
		JPanel jPanelCamposAuxiliarDetalleRequisicion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDetalleRequisicion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
			jPanelCamposAuxiliarDetalleRequisicion=this.jInternalFrameDetalleFormDetalleRequisicion.jPanelCamposDetalleRequisicion;
			jPanelAccionesFormularioAuxiliarDetalleRequisicion=this.jInternalFrameDetalleFormDetalleRequisicion.jPanelAccionesFormularioDetalleRequisicion;
		}
		
		final JPanel jPanelCamposDetalleRequisicion=jPanelCamposAuxiliarDetalleRequisicion;
		final JPanel jPanelAccionesFormularioDetalleRequisicion=jPanelAccionesFormularioAuxiliarDetalleRequisicion;
		
		
		final JMenuBar jmenuBarDetalleRequisicion=this.jmenuBarDetalleRequisicion;
		final JToolBar jTtoolBarDetalleRequisicion=this.jTtoolBarDetalleRequisicion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDetalleRequisicion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleRequisicion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
			jmenuBarDetalleAuxiliarDetalleRequisicion=this.jInternalFrameDetalleFormDetalleRequisicion.jmenuBarDetalleDetalleRequisicion;
			jTtoolBarDetalleAuxiliarDetalleRequisicion=this.jInternalFrameDetalleFormDetalleRequisicion.jTtoolBarDetalleDetalleRequisicion;
		}
		
		final JMenuBar jmenuBarDetalleDetalleRequisicion=jmenuBarDetalleAuxiliarDetalleRequisicion;
		final JToolBar jTtoolBarDetalleDetalleRequisicion=jTtoolBarDetalleAuxiliarDetalleRequisicion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleRequisicion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleRequisicion;
			processRunnable.jTableDatos=jTableDatosDetalleRequisicion;
			processRunnable.jPanelCampos=jPanelCamposDetalleRequisicion;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleRequisicion;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleRequisicion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleRequisicion;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleRequisicion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleRequisicion;
			processRunnable.jTtoolBar=jTtoolBarDetalleRequisicion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleRequisicion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleRequisicion ,jPanelParametrosReportesDetalleRequisicion,jTableDatosDetalleRequisicion, /*jScrollPanelDatosDetalleRequisicion,*/jPanelCamposDetalleRequisicion,jPanelPaginacionDetalleRequisicion, /*jScrollPanelDatosEdicionDetalleRequisicion,*/ jPanelAccionesDetalleRequisicion,jPanelAccionesFormularioDetalleRequisicion,jmenuBarDetalleRequisicion,jmenuBarDetalleDetalleRequisicion,jTtoolBarDetalleRequisicion,jTtoolBarDetalleDetalleRequisicion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleRequisicion ,jPanelParametrosReportesDetalleRequisicion, jScrollPanelDatosDetalleRequisicion,jPanelPaginacionDetalleRequisicion, jScrollPanelDatosEdicionDetalleRequisicion, jPanelAccionesDetalleRequisicion,jPanelAccionesFormularioDetalleRequisicion,jmenuBarDetalleRequisicion,jmenuBarDetalleDetalleRequisicion,jTtoolBarDetalleRequisicion,jTtoolBarDetalleDetalleRequisicion);
						
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
	
	public void finishProcessDetalleRequisicion() {// throws Exception 
		this.finishProcessDetalleRequisicion(true);
	}
	
	public void finishProcessDetalleRequisicion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDetalleRequisicion ,this.jPanelParametrosReportesDetalleRequisicion, this.jScrollPanelDatosDetalleRequisicion,this.jPanelPaginacionDetalleRequisicion, this.jScrollPanelDatosEdicionDetalleRequisicion, this.jPanelAccionesDetalleRequisicion,this.jPanelAccionesFormularioDetalleRequisicion,this.jmenuBarDetalleRequisicion,this.jmenuBarDetalleDetalleRequisicion,this.jTtoolBarDetalleRequisicion,this.jTtoolBarDetalleDetalleRequisicion);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleRequisicion=this.jTabbedPaneBusquedasDetalleRequisicion; 
		
		final JPanel jPanelParametrosReportesDetalleRequisicion=this.jPanelParametrosReportesDetalleRequisicion;
		//final JScrollPane jScrollPanelDatosDetalleRequisicion=this.jScrollPanelDatosDetalleRequisicion;
		final JTable jTableDatosDetalleRequisicion=this.jTableDatosDetalleRequisicion;		
		final JPanel jPanelPaginacionDetalleRequisicion=this.jPanelPaginacionDetalleRequisicion;
		//final JScrollPane jScrollPanelDatosEdicionDetalleRequisicion=this.jScrollPanelDatosEdicionDetalleRequisicion;
		final JPanel jPanelAccionesDetalleRequisicion=this.jPanelAccionesDetalleRequisicion;
		
		JPanel jPanelCamposAuxiliarDetalleRequisicion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDetalleRequisicion=new JPanel();
		
		if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
			jPanelCamposAuxiliarDetalleRequisicion=this.jInternalFrameDetalleFormDetalleRequisicion.jPanelCamposDetalleRequisicion;
			jPanelAccionesFormularioAuxiliarDetalleRequisicion=this.jInternalFrameDetalleFormDetalleRequisicion.jPanelAccionesFormularioDetalleRequisicion;
		}
		
		final JPanel jPanelCamposDetalleRequisicion=jPanelCamposAuxiliarDetalleRequisicion;
		final JPanel jPanelAccionesFormularioDetalleRequisicion=jPanelAccionesFormularioAuxiliarDetalleRequisicion;
		
		
		final JMenuBar jmenuBarDetalleRequisicion=this.jmenuBarDetalleRequisicion;		
		final JToolBar jTtoolBarDetalleRequisicion=this.jTtoolBarDetalleRequisicion;
				
		JMenuBar jmenuBarDetalleAuxiliarDetalleRequisicion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleRequisicion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
			jmenuBarDetalleAuxiliarDetalleRequisicion=this.jInternalFrameDetalleFormDetalleRequisicion.jmenuBarDetalleDetalleRequisicion;
			jTtoolBarDetalleAuxiliarDetalleRequisicion=this.jInternalFrameDetalleFormDetalleRequisicion.jTtoolBarDetalleDetalleRequisicion;		
		}
		
		final JMenuBar jmenuBarDetalleDetalleRequisicion=jmenuBarDetalleAuxiliarDetalleRequisicion;
		final JToolBar jTtoolBarDetalleDetalleRequisicion=jTtoolBarDetalleAuxiliarDetalleRequisicion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleRequisicion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleRequisicion;
			processRunnable.jTableDatos=jTableDatosDetalleRequisicion;
			processRunnable.jPanelCampos=jPanelCamposDetalleRequisicion;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleRequisicion;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleRequisicion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleRequisicion;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleRequisicion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleRequisicion;
			processRunnable.jTtoolBar=jTtoolBarDetalleRequisicion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleRequisicion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDetalleRequisicion ,jPanelParametrosReportesDetalleRequisicion, jTableDatosDetalleRequisicion,/*jScrollPanelDatosDetalleRequisicion,*/jPanelCamposDetalleRequisicion,jPanelPaginacionDetalleRequisicion, /*jScrollPanelDatosEdicionDetalleRequisicion,*/ jPanelAccionesDetalleRequisicion,jPanelAccionesFormularioDetalleRequisicion,jmenuBarDetalleRequisicion,jmenuBarDetalleDetalleRequisicion,jTtoolBarDetalleRequisicion,jTtoolBarDetalleDetalleRequisicion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDetalleRequisicion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDetalleRequisicion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDetalleRequisicion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDetalleRequisicion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleRequisicion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDetalleRequisicion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDetalleRequisicion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleRequisicion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDetalleRequisicion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.detallerequisicionConstantesFunciones.getsFinalQueryDetalleRequisicion();
		String  finalQueryPaginacionTodos=this.detallerequisicionConstantesFunciones.getsFinalQueryDetalleRequisicion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DetalleRequisicionConstantesFunciones.getArrayColumnasGlobalesNoDetalleRequisicion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DetalleRequisicionConstantesFunciones.getArrayColumnasGlobalesDetalleRequisicion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DetalleRequisicionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.detallerequisicionsEliminados= new ArrayList<DetalleRequisicion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDetalleRequisicion();
		
				///*DetalleRequisicionSessionBean*/this.detallerequisicionSessionBean=new DetalleRequisicionSessionBean();
			
			if(this.detallerequisicionSessionBean==null) {
				this.detallerequisicionSessionBean=new DetalleRequisicionSessionBean();
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
					this.iNumeroPaginacion=DetalleRequisicionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DetalleRequisicionConstantesFunciones.getClassesForeignKeysOfDetalleRequisicion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/detallerequisicion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			detallerequisicionsAux= new ArrayList<DetalleRequisicion>();
			
				
			detallerequisicionLogic.setDatosCliente(this.datosCliente);
			detallerequisicionLogic.setDatosDeep(this.datosDeep);
			detallerequisicionLogic.setIsConDeep(true);
			
			
			detallerequisicionLogic.getDetalleRequisicionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					detallerequisicionLogic.getTodosDetalleRequisicions(finalQueryGlobal,pagination);
					
					//detallerequisicionLogic.getTodosDetalleRequisicionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(detallerequisicionLogic.getDetalleRequisicions()==null|| detallerequisicionLogic.getDetalleRequisicions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detallerequisicionsAux= new ArrayList<DetalleRequisicion>();
							detallerequisicionsAux.addAll(detallerequisicionLogic.getDetalleRequisicions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallerequisicionsAux= new ArrayList<DetalleRequisicion>();
							detallerequisicionsAux.addAll(detallerequisicions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detallerequisicionLogic.getTodosDetalleRequisicions(finalQueryGlobal+"",this.pagination);												
							
							//detallerequisicionLogic.getTodosDetalleRequisicionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteDetalleRequisicions("Todos",detallerequisicionLogic.getDetalleRequisicions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detallerequisicionLogic.setDetalleRequisicions(new ArrayList<DetalleRequisicion>());					
							detallerequisicionLogic.getDetalleRequisicions().addAll(detallerequisicionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallerequisicions=new ArrayList<DetalleRequisicion>();
							detallerequisicions.addAll(detallerequisicionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idDetalleRequisicion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idDetalleRequisicion=this.idActual;
				
				} else if(this.idDetalleRequisicionActual!=null && this.idDetalleRequisicionActual!=0L) {
					idDetalleRequisicion=idDetalleRequisicionActual;
				}
				
					
				this.sDetalleReporte=DetalleRequisicionConstantesFunciones.getDetalleIndicePorId(idDetalleRequisicion);
				
				this.detallerequisicions=new ArrayList<DetalleRequisicion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					detallerequisicionLogic.getEntity(idDetalleRequisicion);
					
					//detallerequisicionLogic.getEntityWithConnection(idDetalleRequisicion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallerequisicionLogic.setDetalleRequisicions(new ArrayList<DetalleRequisicion>());
					detallerequisicionLogic.getDetalleRequisicions().add(detallerequisicionLogic.getDetalleRequisicion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallerequisicions=new ArrayList<DetalleRequisicion>();
					this.detallerequisicions.add(detallerequisicion);
				}
				
				if(detallerequisicionLogic.getDetalleRequisicion()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdBodega")) {
				this.sDetalleReporte=DetalleRequisicionConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallerequisicionLogic.getDetalleRequisicionsFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleRequisicionConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleRequisicionConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallerequisicionLogic.getDetalleRequisicions()==null||detallerequisicionLogic.getDetalleRequisicions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallerequisicions==null|| detallerequisicions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallerequisicionsAux=new ArrayList<DetalleRequisicion>();
						detallerequisicionsAux.addAll(detallerequisicionLogic.getDetalleRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallerequisicionsAux=new ArrayList<DetalleRequisicion>();
							detallerequisicionsAux.addAll(detallerequisicions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallerequisicionLogic.getDetalleRequisicionsFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleRequisicionConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleRequisicionConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleRequisicions("FK_IdBodega",detallerequisicionLogic.getDetalleRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleRequisicions("FK_IdBodega",detallerequisicions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallerequisicionLogic.setDetalleRequisicions(new ArrayList<DetalleRequisicion>());
						detallerequisicionLogic.getDetalleRequisicions().addAll(detallerequisicionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallerequisicions=new ArrayList<DetalleRequisicion>();
							detallerequisicions.addAll(detallerequisicionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEjercicio")) {
				this.sDetalleReporte=DetalleRequisicionConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallerequisicionLogic.getDetalleRequisicionsFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleRequisicionConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleRequisicionConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallerequisicionLogic.getDetalleRequisicions()==null||detallerequisicionLogic.getDetalleRequisicions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallerequisicions==null|| detallerequisicions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallerequisicionsAux=new ArrayList<DetalleRequisicion>();
						detallerequisicionsAux.addAll(detallerequisicionLogic.getDetalleRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallerequisicionsAux=new ArrayList<DetalleRequisicion>();
							detallerequisicionsAux.addAll(detallerequisicions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallerequisicionLogic.getDetalleRequisicionsFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleRequisicionConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleRequisicionConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleRequisicions("FK_IdEjercicio",detallerequisicionLogic.getDetalleRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleRequisicions("FK_IdEjercicio",detallerequisicions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallerequisicionLogic.setDetalleRequisicions(new ArrayList<DetalleRequisicion>());
						detallerequisicionLogic.getDetalleRequisicions().addAll(detallerequisicionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallerequisicions=new ArrayList<DetalleRequisicion>();
							detallerequisicions.addAll(detallerequisicionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=DetalleRequisicionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallerequisicionLogic.getDetalleRequisicionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleRequisicionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleRequisicionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallerequisicionLogic.getDetalleRequisicions()==null||detallerequisicionLogic.getDetalleRequisicions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallerequisicions==null|| detallerequisicions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallerequisicionsAux=new ArrayList<DetalleRequisicion>();
						detallerequisicionsAux.addAll(detallerequisicionLogic.getDetalleRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallerequisicionsAux=new ArrayList<DetalleRequisicion>();
							detallerequisicionsAux.addAll(detallerequisicions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallerequisicionLogic.getDetalleRequisicionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleRequisicionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleRequisicionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleRequisicions("FK_IdEmpresa",detallerequisicionLogic.getDetalleRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleRequisicions("FK_IdEmpresa",detallerequisicions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallerequisicionLogic.setDetalleRequisicions(new ArrayList<DetalleRequisicion>());
						detallerequisicionLogic.getDetalleRequisicions().addAll(detallerequisicionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallerequisicions=new ArrayList<DetalleRequisicion>();
							detallerequisicions.addAll(detallerequisicionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPeriodo")) {
				this.sDetalleReporte=DetalleRequisicionConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallerequisicionLogic.getDetalleRequisicionsFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleRequisicionConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleRequisicionConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallerequisicionLogic.getDetalleRequisicions()==null||detallerequisicionLogic.getDetalleRequisicions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallerequisicions==null|| detallerequisicions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallerequisicionsAux=new ArrayList<DetalleRequisicion>();
						detallerequisicionsAux.addAll(detallerequisicionLogic.getDetalleRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallerequisicionsAux=new ArrayList<DetalleRequisicion>();
							detallerequisicionsAux.addAll(detallerequisicions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallerequisicionLogic.getDetalleRequisicionsFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleRequisicionConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleRequisicionConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleRequisicions("FK_IdPeriodo",detallerequisicionLogic.getDetalleRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleRequisicions("FK_IdPeriodo",detallerequisicions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallerequisicionLogic.setDetalleRequisicions(new ArrayList<DetalleRequisicion>());
						detallerequisicionLogic.getDetalleRequisicions().addAll(detallerequisicionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallerequisicions=new ArrayList<DetalleRequisicion>();
							detallerequisicions.addAll(detallerequisicionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdProducto")) {
				this.sDetalleReporte=DetalleRequisicionConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallerequisicionLogic.getDetalleRequisicionsFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleRequisicionConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleRequisicionConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallerequisicionLogic.getDetalleRequisicions()==null||detallerequisicionLogic.getDetalleRequisicions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallerequisicions==null|| detallerequisicions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallerequisicionsAux=new ArrayList<DetalleRequisicion>();
						detallerequisicionsAux.addAll(detallerequisicionLogic.getDetalleRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallerequisicionsAux=new ArrayList<DetalleRequisicion>();
							detallerequisicionsAux.addAll(detallerequisicions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallerequisicionLogic.getDetalleRequisicionsFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleRequisicionConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleRequisicionConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleRequisicions("FK_IdProducto",detallerequisicionLogic.getDetalleRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleRequisicions("FK_IdProducto",detallerequisicions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallerequisicionLogic.setDetalleRequisicions(new ArrayList<DetalleRequisicion>());
						detallerequisicionLogic.getDetalleRequisicions().addAll(detallerequisicionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallerequisicions=new ArrayList<DetalleRequisicion>();
							detallerequisicions.addAll(detallerequisicionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdRequisicion")) {
				this.sDetalleReporte=DetalleRequisicionConstantesFunciones.getDetalleIndiceFK_IdRequisicion(id_requisicionFK_IdRequisicion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallerequisicionLogic.getDetalleRequisicionsFK_IdRequisicion(finalQueryGlobal,pagination,id_requisicionFK_IdRequisicion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleRequisicionConstantesFunciones.getDetalleIndiceFK_IdRequisicion(id_requisicionFK_IdRequisicion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleRequisicionConstantesFunciones.getDetalleIndiceFK_IdRequisicion(id_requisicionFK_IdRequisicion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallerequisicionLogic.getDetalleRequisicions()==null||detallerequisicionLogic.getDetalleRequisicions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallerequisicions==null|| detallerequisicions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallerequisicionsAux=new ArrayList<DetalleRequisicion>();
						detallerequisicionsAux.addAll(detallerequisicionLogic.getDetalleRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallerequisicionsAux=new ArrayList<DetalleRequisicion>();
							detallerequisicionsAux.addAll(detallerequisicions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallerequisicionLogic.getDetalleRequisicionsFK_IdRequisicion(finalQueryGlobal,pagination,id_requisicionFK_IdRequisicion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleRequisicionConstantesFunciones.getDetalleIndiceFK_IdRequisicion(id_requisicionFK_IdRequisicion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleRequisicionConstantesFunciones.getDetalleIndiceFK_IdRequisicion(id_requisicionFK_IdRequisicion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleRequisicions("FK_IdRequisicion",detallerequisicionLogic.getDetalleRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleRequisicions("FK_IdRequisicion",detallerequisicions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallerequisicionLogic.setDetalleRequisicions(new ArrayList<DetalleRequisicion>());
						detallerequisicionLogic.getDetalleRequisicions().addAll(detallerequisicionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallerequisicions=new ArrayList<DetalleRequisicion>();
							detallerequisicions.addAll(detallerequisicionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=DetalleRequisicionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallerequisicionLogic.getDetalleRequisicionsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleRequisicionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleRequisicionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallerequisicionLogic.getDetalleRequisicions()==null||detallerequisicionLogic.getDetalleRequisicions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallerequisicions==null|| detallerequisicions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallerequisicionsAux=new ArrayList<DetalleRequisicion>();
						detallerequisicionsAux.addAll(detallerequisicionLogic.getDetalleRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallerequisicionsAux=new ArrayList<DetalleRequisicion>();
							detallerequisicionsAux.addAll(detallerequisicions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallerequisicionLogic.getDetalleRequisicionsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleRequisicionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleRequisicionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleRequisicions("FK_IdSucursal",detallerequisicionLogic.getDetalleRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleRequisicions("FK_IdSucursal",detallerequisicions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallerequisicionLogic.setDetalleRequisicions(new ArrayList<DetalleRequisicion>());
						detallerequisicionLogic.getDetalleRequisicions().addAll(detallerequisicionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallerequisicions=new ArrayList<DetalleRequisicion>();
							detallerequisicions.addAll(detallerequisicionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUnidad")) {
				this.sDetalleReporte=DetalleRequisicionConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallerequisicionLogic.getDetalleRequisicionsFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleRequisicionConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleRequisicionConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallerequisicionLogic.getDetalleRequisicions()==null||detallerequisicionLogic.getDetalleRequisicions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallerequisicions==null|| detallerequisicions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallerequisicionsAux=new ArrayList<DetalleRequisicion>();
						detallerequisicionsAux.addAll(detallerequisicionLogic.getDetalleRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallerequisicionsAux=new ArrayList<DetalleRequisicion>();
							detallerequisicionsAux.addAll(detallerequisicions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallerequisicionLogic.getDetalleRequisicionsFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleRequisicionConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleRequisicionConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleRequisicions("FK_IdUnidad",detallerequisicionLogic.getDetalleRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleRequisicions("FK_IdUnidad",detallerequisicions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallerequisicionLogic.setDetalleRequisicions(new ArrayList<DetalleRequisicion>());
						detallerequisicionLogic.getDetalleRequisicions().addAll(detallerequisicionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallerequisicions=new ArrayList<DetalleRequisicion>();
							detallerequisicions.addAll(detallerequisicionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDetalleRequisicion();
		
		this.traerValoresTablaTotales();	
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrDatoGeneralTotales=DetalleRequisicionConstantesFunciones.getTotalesListaDetalleRequisicion(detallerequisicionLogic.getDetalleRequisicions());							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrDatoGeneralTotales=DetalleRequisicionConstantesFunciones.getTotalesListaDetalleRequisicion(this.detallerequisicions);
		}
		*/
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDetalleRequisicion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detallerequisicionLogic.getDetalleRequisicions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallerequisicions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detallerequisicionLogic.getDetalleRequisicions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallerequisicions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DetalleRequisicion detallerequisicion) {
		Boolean permite=true;
		
		if(this.detallerequisicion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrDatoGeneralTotales=DetalleRequisicionConstantesFunciones.getTotalesListaDetalleRequisicion(detallerequisicionLogic.getDetalleRequisicions());							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrDatoGeneralTotales=DetalleRequisicionConstantesFunciones.getTotalesListaDetalleRequisicion(this.detallerequisicions);
		}
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DetalleRequisicionConstantesFunciones.getOrderByListaDetalleRequisicion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DetalleRequisicionConstantesFunciones.getOrderByListaDetalleRequisicion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleRequisicion detallerequisicion:detallerequisicionLogic.getDetalleRequisicions()) {
				if(detallerequisicion.getsType().equals(Constantes2.S_TOTALES)) {
					detallerequisicionTotales=detallerequisicion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleRequisicion detallerequisicion:this.detallerequisicions) {
				if(detallerequisicion.getsType().equals(Constantes2.S_TOTALES)) {
					detallerequisicionTotales=detallerequisicion;
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
			this.detallerequisicionAux=new DetalleRequisicion();
			this.detallerequisicionAux.setsType(Constantes2.S_TOTALES);
			this.detallerequisicionAux.setIsNew(false);
			this.detallerequisicionAux.setIsChanged(false);
			this.detallerequisicionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				DetalleRequisicionConstantesFunciones.TotalizarValoresFilaDetalleRequisicion(this.detallerequisicionLogic.getDetalleRequisicions(),this.detallerequisicionAux);
				
				this.detallerequisicionLogic.getDetalleRequisicions().add(this.detallerequisicionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DetalleRequisicionConstantesFunciones.TotalizarValoresFilaDetalleRequisicion(this.detallerequisicions,this.detallerequisicionAux);
				
				this.detallerequisicions.add(this.detallerequisicionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		detallerequisicionTotales=new DetalleRequisicion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detallerequisicionLogic.getDetalleRequisicions().remove(detallerequisicionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detallerequisicions.remove(detallerequisicionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		detallerequisicionTotales=new DetalleRequisicion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleRequisicion detallerequisicion:detallerequisicionLogic.getDetalleRequisicions()) {
				if(detallerequisicion.getsType().equals(Constantes2.S_TOTALES)) {
					detallerequisicionTotales=detallerequisicion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleRequisicionConstantesFunciones.TotalizarValoresFilaDetalleRequisicion(this.detallerequisicionLogic.getDetalleRequisicions(),detallerequisicionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleRequisicion detallerequisicion:this.detallerequisicions) {
				if(detallerequisicion.getsType().equals(Constantes2.S_TOTALES)) {
					detallerequisicionTotales=detallerequisicion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleRequisicionConstantesFunciones.TotalizarValoresFilaDetalleRequisicion(this.detallerequisicions,detallerequisicionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDetalleRequisicionsFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleRequisicionsFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleRequisicionsFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleRequisicionsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleRequisicionsFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleRequisicionsFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleRequisicionsFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleRequisicionsFK_IdRequisicion()throws Exception {
		try {
			sAccionBusqueda="FK_IdRequisicion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleRequisicionsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleRequisicionsFK_IdUnidad()throws Exception {
		try {
			sAccionBusqueda="FK_IdUnidad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDetalleRequisicionsFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallerequisicionLogic.getDetalleRequisicionsFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleRequisicionsFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallerequisicionLogic.getDetalleRequisicionsFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleRequisicionsFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallerequisicionLogic.getDetalleRequisicionsFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleRequisicionsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallerequisicionLogic.getDetalleRequisicionsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleRequisicionsFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallerequisicionLogic.getDetalleRequisicionsFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleRequisicionsFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallerequisicionLogic.getDetalleRequisicionsFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleRequisicionsFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallerequisicionLogic.getDetalleRequisicionsFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleRequisicionsFK_IdRequisicion(String sFinalQuery,Long id_requisicion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallerequisicionLogic.getDetalleRequisicionsFK_IdRequisicion(sFinalQuery,this.pagination,id_requisicion);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleRequisicionsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallerequisicionLogic.getDetalleRequisicionsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleRequisicionsFK_IdUnidad(String sFinalQuery,Long id_unidad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallerequisicionLogic.getDetalleRequisicionsFK_IdUnidad(sFinalQuery,this.pagination,id_unidad);
				
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
	
	public void inicializarPermisosDetalleRequisicion() {
		this.isPermisoTodoDetalleRequisicion=false;
		this.isPermisoNuevoDetalleRequisicion=false;
		this.isPermisoActualizarDetalleRequisicion=false;
		this.isPermisoActualizarOriginalDetalleRequisicion=false;
		this.isPermisoEliminarDetalleRequisicion=false;
		this.isPermisoGuardarCambiosDetalleRequisicion=false;
		this.isPermisoConsultaDetalleRequisicion=false;
		this.isPermisoBusquedaDetalleRequisicion=false;
		this.isPermisoReporteDetalleRequisicion=false;		
		this.isPermisoOrdenDetalleRequisicion=false;		
		this.isPermisoPaginacionMedioDetalleRequisicion=false;		
		this.isPermisoPaginacionAltoDetalleRequisicion=false;
		this.isPermisoPaginacionTodoDetalleRequisicion=false;
		this.isPermisoCopiarDetalleRequisicion=false;		
		this.isPermisoVerFormDetalleRequisicion=false;		
		this.isPermisoDuplicarDetalleRequisicion=false;		
		this.isPermisoOrdenDetalleRequisicion=false;		
	}
	
	public void setPermisosUsuarioDetalleRequisicion(Boolean isPermiso) {
		this.isPermisoTodoDetalleRequisicion=isPermiso;
		this.isPermisoNuevoDetalleRequisicion=isPermiso;
		this.isPermisoActualizarDetalleRequisicion=isPermiso;
		this.isPermisoActualizarOriginalDetalleRequisicion=isPermiso;
		this.isPermisoEliminarDetalleRequisicion=isPermiso;
		this.isPermisoGuardarCambiosDetalleRequisicion=isPermiso;
		this.isPermisoConsultaDetalleRequisicion=isPermiso;
		this.isPermisoBusquedaDetalleRequisicion=isPermiso;
		this.isPermisoReporteDetalleRequisicion=isPermiso;
		this.isPermisoOrdenDetalleRequisicion=isPermiso;		
		this.isPermisoPaginacionMedioDetalleRequisicion=isPermiso;		
		this.isPermisoPaginacionAltoDetalleRequisicion=isPermiso;		
		this.isPermisoPaginacionTodoDetalleRequisicion=isPermiso;		
		this.isPermisoCopiarDetalleRequisicion=isPermiso;		
		this.isPermisoVerFormDetalleRequisicion=isPermiso;		
		this.isPermisoDuplicarDetalleRequisicion=isPermiso;
		this.isPermisoOrdenDetalleRequisicion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDetalleRequisicion(Boolean isPermiso) {
		//this.isPermisoTodoDetalleRequisicion=isPermiso;
		this.isPermisoNuevoDetalleRequisicion=isPermiso;
		this.isPermisoActualizarDetalleRequisicion=isPermiso;
		this.isPermisoActualizarOriginalDetalleRequisicion=isPermiso;
		this.isPermisoEliminarDetalleRequisicion=isPermiso;
		this.isPermisoGuardarCambiosDetalleRequisicion=isPermiso;
		//this.isPermisoConsultaDetalleRequisicion=isPermiso;
		//this.isPermisoBusquedaDetalleRequisicion=isPermiso;
		//this.isPermisoReporteDetalleRequisicion=isPermiso;
		//this.isPermisoOrdenDetalleRequisicion=isPermiso;		
		//this.isPermisoPaginacionMedioDetalleRequisicion=isPermiso;		
		//this.isPermisoPaginacionAltoDetalleRequisicion=isPermiso;		
		//this.isPermisoPaginacionTodoDetalleRequisicion=isPermiso;		
		//this.isPermisoCopiarDetalleRequisicion=isPermiso;		
		//this.isPermisoDuplicarDetalleRequisicion=isPermiso;
		//this.isPermisoOrdenDetalleRequisicion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDetalleRequisicionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DetalleRequisicionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDetalleRequisicion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDetalleRequisicionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDetalleRequisicionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDetalleRequisicionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDetalleRequisicionClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDetalleRequisicion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DetalleRequisicionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DetalleRequisicionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDetalleRequisicion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDetalleRequisicion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDetalleRequisicion=this.isPermisoActualizarDetalleRequisicion;
			this.isPermisoEliminarDetalleRequisicion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDetalleRequisicion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDetalleRequisicion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDetalleRequisicion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDetalleRequisicion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDetalleRequisicion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleRequisicion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDetalleRequisicion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDetalleRequisicion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDetalleRequisicion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDetalleRequisicion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDetalleRequisicion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDetalleRequisicion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleRequisicion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDetalleRequisicion.setToolTipText(this.jTableDatosDetalleRequisicion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDetalleRequisicion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDetalleRequisicion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DetalleRequisicionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DetalleRequisicionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDetalleRequisicion() throws Exception {
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
	public void inicializarCombosForeignKeyDetalleRequisicionListas()throws Exception {
		try	{						
			
				this.requisicionsForeignKey=new ArrayList();
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
				this.aniosForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
				this.bodegasForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
				this.unidadsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDetalleRequisicionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DetalleRequisicionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyDetalleRequisicionListas(false);
			} else {
			
				this.cargarCombosForeignKeyRequisicionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyUnidadListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyRequisicionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.requisicionsForeignKey==null||this.requisicionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=RequisicionConstantesFunciones.getArrayColumnasGlobalesRequisicion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,RequisicionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=RequisicionConstantesFunciones.SFINALQUERY;

				this.cargarCombosRequisicionsForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeyAnioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=AnioConstantesFunciones.SFINALQUERY;

				this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMesListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.messForeignKey==null||this.messForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=MesConstantesFunciones.SFINALQUERY;

				this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyDetalleRequisicionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			DetalleRequisicionParameterReturnGeneral detallerequisicionReturnGeneral=new DetalleRequisicionParameterReturnGeneral();
						
			


				String finalQueryGlobalRequisicion="";

				if(((this.requisicionsForeignKey==null||this.requisicionsForeignKey.size()<=0) && this.detallerequisicionConstantesFunciones.cargarid_requisicionDetalleRequisicion)
					 || (this.esRecargarFks && this.detallerequisicionConstantesFunciones.cargarid_requisicionDetalleRequisicion)) {

					if(!this.detallerequisicionSessionBean.getisBusquedaDesdeForeignKeySesionRequisicion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=RequisicionConstantesFunciones.getArrayColumnasGlobalesRequisicion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalRequisicion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,RequisicionConstantesFunciones.TABLENAME);

						finalQueryGlobalRequisicion=Funciones.GetFinalQueryAppend(finalQueryGlobalRequisicion, "");
						finalQueryGlobalRequisicion+=RequisicionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosRequisicionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalRequisicion=" WHERE " + ConstantesSql.ID + "="+detallerequisicionSessionBean.getlidRequisicionActual();
					}
				} else {
					finalQueryGlobalRequisicion="NONE";
				}


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.detallerequisicionConstantesFunciones.cargarid_empresaDetalleRequisicion)
					 || (this.esRecargarFks && this.detallerequisicionConstantesFunciones.cargarid_empresaDetalleRequisicion)) {

					if(!this.detallerequisicionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+detallerequisicionSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.detallerequisicionConstantesFunciones.cargarid_sucursalDetalleRequisicion)
					 || (this.esRecargarFks && this.detallerequisicionConstantesFunciones.cargarid_sucursalDetalleRequisicion)) {

					if(!this.detallerequisicionSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+detallerequisicionSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.detallerequisicionConstantesFunciones.cargarid_ejercicioDetalleRequisicion)
					 || (this.esRecargarFks && this.detallerequisicionConstantesFunciones.cargarid_ejercicioDetalleRequisicion)) {

					if(!this.detallerequisicionSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+detallerequisicionSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalPeriodo="";

				if(((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0) && this.detallerequisicionConstantesFunciones.cargarid_periodoDetalleRequisicion)
					 || (this.esRecargarFks && this.detallerequisicionConstantesFunciones.cargarid_periodoDetalleRequisicion)) {

					if(!this.detallerequisicionSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPeriodo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

						finalQueryGlobalPeriodo=Funciones.GetFinalQueryAppend(finalQueryGlobalPeriodo, "");
						finalQueryGlobalPeriodo+=PeriodoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPeriodo=" WHERE " + ConstantesSql.ID + "="+detallerequisicionSessionBean.getlidPeriodoActual();
					}
				} else {
					finalQueryGlobalPeriodo="NONE";
				}


				String finalQueryGlobalAnio="";

				if(((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0) && this.detallerequisicionConstantesFunciones.cargarid_anioDetalleRequisicion)
					 || (this.esRecargarFks && this.detallerequisicionConstantesFunciones.cargarid_anioDetalleRequisicion)) {

					if(!this.detallerequisicionSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAnio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

						finalQueryGlobalAnio=Funciones.GetFinalQueryAppend(finalQueryGlobalAnio, "");
						finalQueryGlobalAnio+=AnioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAnio=" WHERE " + ConstantesSql.ID + "="+detallerequisicionSessionBean.getlidAnioActual();
					}
				} else {
					finalQueryGlobalAnio="NONE";
				}


				String finalQueryGlobalMes="";

				if(((this.messForeignKey==null||this.messForeignKey.size()<=0) && this.detallerequisicionConstantesFunciones.cargarid_mesDetalleRequisicion)
					 || (this.esRecargarFks && this.detallerequisicionConstantesFunciones.cargarid_mesDetalleRequisicion)) {

					if(!this.detallerequisicionSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMes=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

						finalQueryGlobalMes=Funciones.GetFinalQueryAppend(finalQueryGlobalMes, "");
						finalQueryGlobalMes+=MesConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMes=" WHERE " + ConstantesSql.ID + "="+detallerequisicionSessionBean.getlidMesActual();
					}
				} else {
					finalQueryGlobalMes="NONE";
				}


				String finalQueryGlobalBodega="";

				if(((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0) && this.detallerequisicionConstantesFunciones.cargarid_bodegaDetalleRequisicion)
					 || (this.esRecargarFks && this.detallerequisicionConstantesFunciones.cargarid_bodegaDetalleRequisicion)) {

					if(!this.detallerequisicionSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBodega=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

						finalQueryGlobalBodega=Funciones.GetFinalQueryAppend(finalQueryGlobalBodega, "");
						finalQueryGlobalBodega+=BodegaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBodega=" WHERE " + ConstantesSql.ID + "="+detallerequisicionSessionBean.getlidBodegaActual();
					}
				} else {
					finalQueryGlobalBodega="NONE";
				}


				String finalQueryGlobalProducto="";

				if(cargarCombosDependencia && ((this.productosForeignKey==null||this.productosForeignKey.size()<=0) && this.detallerequisicionConstantesFunciones.cargarid_productoDetalleRequisicion)
					 || (this.esRecargarFks && this.detallerequisicionConstantesFunciones.cargarid_productoDetalleRequisicion)) {

					if(!this.detallerequisicionSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalProducto, "");
						finalQueryGlobalProducto+=ProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProducto=" WHERE " + ConstantesSql.ID + "="+detallerequisicionSessionBean.getlidProductoActual();
					}
				} else {
					finalQueryGlobalProducto="NONE";
				}


				String finalQueryGlobalUnidad="";

				if(cargarCombosDependencia && ((this.unidadsForeignKey==null||this.unidadsForeignKey.size()<=0) && this.detallerequisicionConstantesFunciones.cargarid_unidadDetalleRequisicion)
					 || (this.esRecargarFks && this.detallerequisicionConstantesFunciones.cargarid_unidadDetalleRequisicion)) {

					if(!this.detallerequisicionSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UnidadConstantesFunciones.getArrayColumnasGlobalesUnidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUnidad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UnidadConstantesFunciones.TABLENAME);

						finalQueryGlobalUnidad=Funciones.GetFinalQueryAppend(finalQueryGlobalUnidad, "");
						finalQueryGlobalUnidad+=UnidadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUnidadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUnidad=" WHERE " + ConstantesSql.ID + "="+detallerequisicionSessionBean.getlidUnidadActual();
					}
				} else {
					finalQueryGlobalUnidad="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				detallerequisicionReturnGeneral=detallerequisicionLogic.cargarCombosLoteForeignKeyDetalleRequisicion(finalQueryGlobalRequisicion,finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEjercicio,finalQueryGlobalPeriodo,finalQueryGlobalAnio,finalQueryGlobalMes,finalQueryGlobalBodega,finalQueryGlobalProducto,finalQueryGlobalUnidad);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalRequisicion.equals("NONE")) {
				this.requisicionsForeignKey=detallerequisicionReturnGeneral.getrequisicionsForeignKey();
			}

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=detallerequisicionReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=detallerequisicionReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=detallerequisicionReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalPeriodo.equals("NONE")) {
				this.periodosForeignKey=detallerequisicionReturnGeneral.getperiodosForeignKey();
			}

			if(!finalQueryGlobalAnio.equals("NONE")) {
				this.aniosForeignKey=detallerequisicionReturnGeneral.getaniosForeignKey();
			}

			if(!finalQueryGlobalMes.equals("NONE")) {
				this.messForeignKey=detallerequisicionReturnGeneral.getmessForeignKey();
			}

			if(!finalQueryGlobalBodega.equals("NONE")) {
				this.bodegasForeignKey=detallerequisicionReturnGeneral.getbodegasForeignKey();
			}

			if(!finalQueryGlobalProducto.equals("NONE")) {
				this.productosForeignKey=detallerequisicionReturnGeneral.getproductosForeignKey();
			}

			if(!finalQueryGlobalUnidad.equals("NONE")) {
				this.unidadsForeignKey=detallerequisicionReturnGeneral.getunidadsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyDetalleRequisicion()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyRequisicion();
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
			this.addItemDefectoCombosForeignKeyAnio();
			this.addItemDefectoCombosForeignKeyMes();
			this.addItemDefectoCombosForeignKeyBodega();
			this.addItemDefectoCombosForeignKeyProducto();
			this.addItemDefectoCombosForeignKeyUnidad();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyRequisicion()throws Exception {
		try {
			if(this.detallerequisicionSessionBean==null) {
				this.detallerequisicionSessionBean=new DetalleRequisicionSessionBean();
			}

			if(!this.detallerequisicionSessionBean.getisBusquedaDesdeForeignKeySesionRequisicion()) {
				Requisicion requisicion=new Requisicion();
				RequisicionConstantesFunciones.setRequisicionDescripcion(requisicion,Constantes.SMENSAJE_ESCOJA_OPCION);
				requisicion.setId(null);

				if(!RequisicionConstantesFunciones.ExisteEnLista(this.requisicionsForeignKey,requisicion,true)) {

					this.requisicionsForeignKey.add(0,requisicion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {

			if(!this.detallerequisicionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.detallerequisicionSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.detallerequisicionSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

			if(!this.detallerequisicionSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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

	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {

			if(!this.detallerequisicionSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				Anio anio=new Anio();
				AnioConstantesFunciones.setAnioDescripcion(anio,Constantes.SMENSAJE_ESCOJA_OPCION);
				anio.setId(null);

				if(!AnioConstantesFunciones.ExisteEnLista(this.aniosForeignKey,anio,true)) {

					this.aniosForeignKey.add(0,anio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyMes()throws Exception {
		try {

			if(!this.detallerequisicionSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				Mes mes=new Mes();
				MesConstantesFunciones.setMesDescripcion(mes,Constantes.SMENSAJE_ESCOJA_OPCION);
				mes.setId(null);

				if(!MesConstantesFunciones.ExisteEnLista(this.messForeignKey,mes,true)) {

					this.messForeignKey.add(0,mes);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyBodega()throws Exception {
		try {

			if(!this.detallerequisicionSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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

			if(!this.detallerequisicionSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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

	public void addItemDefectoCombosForeignKeyUnidad()throws Exception {
		try {

			if(!this.detallerequisicionSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
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
	
	public void initActionsCombosTodosForeignKeyDetalleRequisicion()throws Exception {
		try {
			
			this.initActionsCombosForeignKeyBodega("Todos");
			this.initActionsCombosForeignKeyProducto("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDetalleRequisicion(String sFormularioTipoBusqueda)throws Exception {
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
			sFinalQueryCombo=InventarioSql.GetQueryUnidadFromBodegaYProducto(productoLocal,this.detallerequisicion.getid_bodega());

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
					if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
						this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_bodegaDetalleRequisicion.addItemListener(new ComboBoxItemListener(this,"id_bodegaDetalleRequisicion"));
						this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_bodegaDetalleRequisicion.addFocusListener(new ComboBoxFocusListener(this,"id_bodegaDetalleRequisicion"));
					}
				} else {
					if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
						this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_bodegaDetalleRequisicion.addActionListener(new ComboBoxActionListener(this,"id_bodegaDetalleRequisicion"));
						this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_bodegaDetalleRequisicion.addFocusListener(new ComboBoxFocusListener(this,"id_bodegaDetalleRequisicion"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_bodegaFK_IdBodegaDetalleRequisicion.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_bodegaFK_IdBodegaDetalleRequisicion"));

						this.jComboBoxid_bodegaFK_IdBodegaDetalleRequisicion.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_bodegaFK_IdBodegaDetalleRequisicion"));

					} else {
						this.jComboBoxid_bodegaFK_IdBodegaDetalleRequisicion.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_bodegaFK_IdBodegaDetalleRequisicion"));

						this.jComboBoxid_bodegaFK_IdBodegaDetalleRequisicion.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_bodegaFK_IdBodegaDetalleRequisicion"));

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
					if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
						this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_productoDetalleRequisicion.addItemListener(new ComboBoxItemListener(this,"id_productoDetalleRequisicion"));
						this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_productoDetalleRequisicion.addFocusListener(new ComboBoxFocusListener(this,"id_productoDetalleRequisicion"));
					}
				} else {
					if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
						this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_productoDetalleRequisicion.addActionListener(new ComboBoxActionListener(this,"id_productoDetalleRequisicion"));
						this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_productoDetalleRequisicion.addFocusListener(new ComboBoxFocusListener(this,"id_productoDetalleRequisicion"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_productoFK_IdProductoDetalleRequisicion.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_productoFK_IdProductoDetalleRequisicion"));

						this.jComboBoxid_productoFK_IdProductoDetalleRequisicion.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_productoFK_IdProductoDetalleRequisicion"));

					} else {
						this.jComboBoxid_productoFK_IdProductoDetalleRequisicion.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_productoFK_IdProductoDetalleRequisicion"));

						this.jComboBoxid_productoFK_IdProductoDetalleRequisicion.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_productoFK_IdProductoDetalleRequisicion"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosForeignKeyDetalleRequisicion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualEjercicioForeignKey(this.parametroGeneralUsuario.getid_ejercicio(),false,"Formulario");
				this.setActualPeriodoForeignKey(this.parametroGeneralUsuario.getid_periodo(),false,"Formulario");
			
			
				this.detallerequisicion.setfecha_autoriza(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleRequisicion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDetalleRequisicion(DetalleRequisicion detallerequisicion)throws Exception {	
		try {
			
			this.setActualRequisicionForeignKey(detallerequisicion.getid_requisicion(),false,"Formulario");
			this.setActualBodegaForeignKey(detallerequisicion.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(detallerequisicion.getid_producto(),false,"Formulario");
			this.setActualUnidadForeignKey(detallerequisicion.getid_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDetalleRequisicion(DetalleRequisicion detallerequisicion,String sTipoEvento)throws Exception {	
		try {
			
			

				if(detallerequisicion.getProducto()!=null && !sTipoEvento.equals("id_productoDetalleRequisicion")) { //sTipoEvento Evita Bucle Infinito

					this.productosForeignKey=new ArrayList<Producto>();
					this.productosForeignKey.add(detallerequisicion.getProducto());

					this.addItemDefectoCombosForeignKeyProducto();
					this.cargarCombosFrameProductosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDetalleRequisicion()throws Exception {	
		try {
			
			this.setActualRequisicionForeignKey(this.detallerequisicionConstantesFunciones.getid_requisicion(),false,"Formulario");
			this.setActualBodegaForeignKey(this.detallerequisicionConstantesFunciones.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(this.detallerequisicionConstantesFunciones.getid_producto(),false,"Formulario");
			this.setActualUnidadForeignKey(this.detallerequisicionConstantesFunciones.getid_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleRequisicion()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_ejercicioDetalleRequisicion.getSelectedItem();
					this.setActualAnioForeignKey(ejercicioActual.getid_anio(),false,"Formulario");
				}

				if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_periodoDetalleRequisicion.getSelectedItem();
					this.setActualMesForeignKey(periodoActual.getid_mes(),false,"Formulario");
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDetalleRequisicion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDetalleRequisicion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDetalleRequisicion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDetalleRequisicion()throws Exception {
		try {
			

			this.cargarCombosFrameRequisicionsForeignKey("Todos");
			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");
			this.cargarCombosFrameAniosForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");
			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");
			this.cargarCombosFrameUnidadsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDetalleRequisicion(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameRequisicionsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUnidadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDetalleRequisicion()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_requisicionDetalleRequisicion!=null && this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_requisicionDetalleRequisicion.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_requisicionDetalleRequisicion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_empresaDetalleRequisicion!=null && this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_empresaDetalleRequisicion.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_empresaDetalleRequisicion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_sucursalDetalleRequisicion!=null && this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_sucursalDetalleRequisicion.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_sucursalDetalleRequisicion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_ejercicioDetalleRequisicion!=null && this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_ejercicioDetalleRequisicion.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_ejercicioDetalleRequisicion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_periodoDetalleRequisicion!=null && this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_periodoDetalleRequisicion.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_periodoDetalleRequisicion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_anioDetalleRequisicion!=null && this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_anioDetalleRequisicion.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_anioDetalleRequisicion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_mesDetalleRequisicion!=null && this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_mesDetalleRequisicion.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_mesDetalleRequisicion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_bodegaDetalleRequisicion!=null && this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_bodegaDetalleRequisicion.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_bodegaDetalleRequisicion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_productoDetalleRequisicion!=null && this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_productoDetalleRequisicion.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_productoDetalleRequisicion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_unidadDetalleRequisicion!=null && this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_unidadDetalleRequisicion.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_unidadDetalleRequisicion.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	















	public void recargarFormDetalleRequisicionBodega(JComboBox<?> jComboBoxGenericoBodega,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormDetalleRequisicionid_producto(jComboBoxGenericoBodega,sFormularioTipoBusqueda,"Bodega",false);
	}

	public void recargarFormDetalleRequisicionProducto(JComboBox<?> jComboBoxGenericoProducto,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormDetalleRequisicionid_unidad(jComboBoxGenericoProducto,sFormularioTipoBusqueda,"Producto",false);
	}


	
	



	public void recargarFormDetalleRequisicionid_producto(JComboBox<?> jComboBoxGenericoProducto,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Bodega")){
				this.setActualParaGuardarBodegaForeignKey(this.detallerequisicion,jComboBoxGenericoProducto);
			}

			if(this.detallerequisicion.getid_bodega()!=null && this.detallerequisicion.getid_bodega()!=0L) {
				sFinalQuery+="  WHERE  id_bodega="+this.detallerequisicion.getid_bodega();
			} else {
				sFinalQuery+="  WHERE  id_bodega=-1";
			}



			//BUCLE RECURSIVO
			this.setActualProductoForeignKey(this.detallerequisicion.getid_bodega(),true,sFormularioTipoBusqueda);

			this.cargarCombosProductosForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}



	public void recargarFormDetalleRequisicionid_unidad(JComboBox<?> jComboBoxGenericoUnidad,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Producto")){
				this.setActualParaGuardarProductoForeignKey(this.detallerequisicion,jComboBoxGenericoUnidad);
			}

			if(this.detallerequisicion.getid_producto()!=null && this.detallerequisicion.getid_producto()!=0L) {
				sFinalQuery+="  WHERE  id_producto="+this.detallerequisicion.getid_producto();
			} else {
				sFinalQuery+="  WHERE  id_producto=-1";
			}



			//BUCLE RECURSIVO
			this.setActualUnidadForeignKey(this.detallerequisicion.getid_producto(),true,sFormularioTipoBusqueda);

			this.cargarCombosUnidadsForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameUnidadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public DetalleRequisicionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DetalleRequisicionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DetalleRequisicionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.detallerequisicionSessionBean=new DetalleRequisicionSessionBean(); 
		this.detallerequisicionConstantesFunciones=new DetalleRequisicionConstantesFunciones(); 
		this.detallerequisicionBean=new DetalleRequisicion();//(this.detallerequisicionConstantesFunciones); 		
		this.detallerequisicionReturnGeneral=new DetalleRequisicionParameterReturnGeneral(); 
		
		this.detallerequisicionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallerequisicionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DetalleRequisicionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DetalleRequisicionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DetalleRequisicionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDetalleRequisicion(true);
			
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
			
			this.detallerequisicionConstantesFunciones=new DetalleRequisicionConstantesFunciones(); 
			this.detallerequisicionBean=new DetalleRequisicion();//this.detallerequisicionConstantesFunciones); 			
			this.detallerequisicionReturnGeneral=new DetalleRequisicionParameterReturnGeneral(); 
		
			DetalleRequisicionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Requisicion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.detallerequisicion=new DetalleRequisicion();
			this.detallerequisicions = new ArrayList<DetalleRequisicion>();
			this.detallerequisicionsAux = new ArrayList<DetalleRequisicion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic=new DetalleRequisicionLogic();
				this.detallerequisicionLogic.getNewConnexionToDeep("");
			}
			
			//this.detallerequisicionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.detallerequisicionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDetalleRequisicion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDetalleRequisicion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleRequisicion);	
					}
					
					if(this.jInternalFrameImportacionDetalleRequisicion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleRequisicion);							
					}
					
				}
				
				if(this.jInternalFrameTotalesDetalleRequisicion!=null) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameTotalesDetalleRequisicion);
				}
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDetalleRequisicion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDetalleRequisicion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleRequisicion);
				this.jInternalFrameDetalleFormDetalleRequisicion.setVisible(false);
				this.jInternalFrameDetalleFormDetalleRequisicion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleRequisicion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleRequisicion);
					this.jInternalFrameReporteDinamicoDetalleRequisicion.setVisible(false);
					this.jInternalFrameReporteDinamicoDetalleRequisicion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDetalleRequisicion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDetalleRequisicion);
					this.jInternalFrameImportacionDetalleRequisicion.setVisible(false);
					this.jInternalFrameImportacionDetalleRequisicion.setSelected(false);
				}
				
				
			}
			
			if(this.jInternalFrameTotalesDetalleRequisicion!=null) {
				//TOTALES
				this.jDesktopPane.add(this.jInternalFrameTotalesDetalleRequisicion);
				this.jInternalFrameTotalesDetalleRequisicion.setVisible(false);
				this.jInternalFrameTotalesDetalleRequisicion.setSelected(false);
			}
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDetalleRequisicion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDetalleRequisicion);
					this.jInternalFrameOrderByDetalleRequisicion.setVisible(false);
					this.jInternalFrameOrderByDetalleRequisicion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDetalleRequisicionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DetalleRequisicionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.detallerequisicionReturnGeneral=new DetalleRequisicionParameterReturnGeneral();
			
			this.detallerequisicionParameterGeneral=new DetalleRequisicionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.detallerequisicionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DetalleRequisicionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleRequisicionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detallerequisicionSessionBean.getEsGuardarRelacionado(),this.detallerequisicionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleRequisicionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detallerequisicionSessionBean.getEsGuardarRelacionado(),this.detallerequisicionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDetalleRequisicion=false;
			this.isVisibilidadCeldaDuplicarDetalleRequisicion=true;
			this.isVisibilidadCeldaCopiarDetalleRequisicion=true;
			this.isVisibilidadCeldaVerFormDetalleRequisicion=true;
			this.isVisibilidadCeldaOrdenDetalleRequisicion=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleRequisicion=false;
			this.isVisibilidadCeldaModificarDetalleRequisicion=false;
			this.isVisibilidadCeldaActualizarDetalleRequisicion=false;
			this.isVisibilidadCeldaEliminarDetalleRequisicion=false;
			this.isVisibilidadCeldaCancelarDetalleRequisicion=false;
			this.isVisibilidadCeldaGuardarDetalleRequisicion=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleRequisicion=false;
			
			
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdMes=true;
			this.isVisibilidadFK_IdPeriodo=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdRequisicion=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdUnidad=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDetalleRequisicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDetalleRequisicion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDetalleRequisicion(false);
			
			this.setPermisosUsuarioDetalleRequisicion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallerequisicionSessionBean.getEsGuardarRelacionado() 
				|| (this.detallerequisicionSessionBean.getEsGuardarRelacionado() && this.detallerequisicionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDetalleRequisicionClasesRelacionadas();
			}
			
			if(this.detallerequisicionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDetalleRequisicionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DetalleRequisicionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDetalleRequisicion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDetalleRequisicion();
			}
			
			if(!this.isPermisoBusquedaDetalleRequisicion) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDetalleRequisicion.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioDetalleRequisicion,this.isPermisoPaginacionMedioDetalleRequisicion,this.isPermisoPaginacionTodoDetalleRequisicion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DetalleRequisicionConstantesFunciones.getTiposSeleccionarDetalleRequisicion());
				
				this.tiposColumnasSelect=DetalleRequisicionConstantesFunciones.getTiposSeleccionarDetalleRequisicion(true);
				
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
			//if(!this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDetalleRequisicion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioDetalleRequisicion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioDetalleRequisicion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleRequisicion() ;
			
			/*
			} else {
				this.tiposAcciones=new ArrayList<Reporte>();
				this.tiposAccionesFormulario=new ArrayList<Reporte>();
			}
			*/						
			
			this.inicializarInvalidValues();
						
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			this.arrDatoGeneralTotales= new  ArrayList<DatoGeneral>();
			
			
			this.arrOrderBy= new  ArrayList<OrderBy>();
			
			
			this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
			
			
			this.traerValoresTablaOrderBy();			
			
			
			this.isGuardarCambiosEnLote=false;
			this.isCargarCombosDependencia=false;
			
			 
			jasperPrint = null;												
			
			//FK
			
			this.requisicionLogic=new RequisicionLogic();
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.ejercicioLogic=new EjercicioLogic();
			this.periodoLogic=new PeriodoLogic();
			this.anioLogic=new AnioLogic();
			this.mesLogic=new MesLogic();
			this.bodegaLogic=new BodegaLogic();
			this.productoLogic=new ProductoLogic();
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
				detallerequisicionImplementable= (DetalleRequisicionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleRequisicionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				detallerequisicionImplementableHome= (DetalleRequisicionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleRequisicionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.detallerequisicions= new ArrayList<DetalleRequisicion>();
			this.detallerequisicionsEliminados= new ArrayList<DetalleRequisicion>();
						
			this.isEsNuevoDetalleRequisicion=false;
			this.esParaAccionDesdeFormularioDetalleRequisicion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idProductoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.requisicionsForeignKey=new ArrayList<Requisicion>() ;
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			this.aniosForeignKey=new ArrayList<Anio>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			this.bodegasForeignKey=new ArrayList<Bodega>() ;
			this.productosForeignKey=new ArrayList<Producto>() ;
			this.unidadsForeignKey=new ArrayList<Unidad>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDetalleRequisicion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDetalleRequisicion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DetalleRequisicionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DetalleRequisicionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDetalleRequisicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDetalleRequisicion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDetalleRequisicion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDetalleRequisicion();
			}
			
			DetalleRequisicionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDetalleRequisicion.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDetalleRequisicion.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDetalleRequisicion.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDetalleRequisicion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DetalleRequisicion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDetalleRequisicion() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDetalleRequisicion")) {
				iIndex=this.jInternalFrameDetalleFormDetalleRequisicion.jTabbedPaneRelacionesDetalleRequisicion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDetalleRequisicion.jTabbedPaneRelacionesDetalleRequisicion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDetalleRequisicion.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDetalleRequisicion();	
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
	
	public void cargarCombosForeignKeyDetalleRequisicion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDetalleRequisicion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDetalleRequisicion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDetalleRequisicionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDetalleRequisicion();
		
		this.cargarCombosFrameForeignKeyDetalleRequisicion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDetalleRequisicion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDetalleRequisicion();
		}
	}
	
	

	public void cargarCombosForeignKeyRequisicion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyRequisicionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyRequisicion();
				this.cargarCombosFrameRequisicionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaRequisicion(this.requisicionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyAnio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaAnio(this.aniosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMes(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaMes(this.messForeignKey);

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
	
	public void jButtonNuevoDetalleRequisicionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.detallerequisicionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDetalleRequisicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
			
			
			if(jTableDatosDetalleRequisicion.getRowCount()>=1) {
				jTableDatosDetalleRequisicion.removeRowSelectionInterval(0, jTableDatosDetalleRequisicion.getRowCount()-1);						
			}
			
			this.isEsNuevoDetalleRequisicion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDetalleRequisicion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDetalleRequisicion(true);			
			//this.detallerequisicion=new DetalleRequisicion();
			//this.detallerequisicion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleRequisicion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleRequisicion() ;
			
			if(DetalleRequisicionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleRequisicion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.detallerequisicion);	
			this.actualizarInformacion("INFO_PADRE",false,this.detallerequisicion);				
			
			DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
			
			if(this.detallerequisicionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DetalleRequisicion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDetalleRequisicionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DetalleRequisicion> detallerequisicionsSeleccionados=new ArrayList<DetalleRequisicion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDetalleRequisicion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDetalleRequisicion.getSelectedRows().length;			
			}
			
			detallerequisicionsSeleccionados=this.getDetalleRequisicionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDetalleRequisicion--;			
				//DetalleRequisicion detallerequisicionAux= new DetalleRequisicion();			
				//detallerequisicionAux.setId(this.iIdNuevoDetalleRequisicion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DetalleRequisicion detallerequisicionOrigen=new DetalleRequisicion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DetalleRequisicion detallerequisicionOrigen : detallerequisicionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDetalleRequisicion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							detallerequisicionOrigen =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallerequisicionOrigen =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDetalleRequisicion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.detallerequisicion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDetalleRequisicion(detallerequisicionOrigen,this.detallerequisicion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detallerequisicionLogic.getDetalleRequisicions().add(this.detallerequisicionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detallerequisicions.add(this.detallerequisicionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDetalleRequisicion(false);
				
				this.jTableDatosDetalleRequisicion.setRowSelectionInterval(this.getIndiceNuevoDetalleRequisicion(), this.getIndiceNuevoDetalleRequisicion());
				
				int iLastRow =  this.jTableDatosDetalleRequisicion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleRequisicion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleRequisicion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleRequisicion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDetalleRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DetalleRequisicion> detallerequisicionsSeleccionados=new ArrayList<DetalleRequisicion>();									
		
			DetalleRequisicion detallerequisicionOrigen=new DetalleRequisicion();
			DetalleRequisicion detallerequisicionDestino=new DetalleRequisicion();
				
			detallerequisicionsSeleccionados=this.getDetalleRequisicionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDetalleRequisicion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || detallerequisicionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDetalleRequisicion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallerequisicionOrigen =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detallerequisicionOrigen =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallerequisicionDestino =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detallerequisicionDestino =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				detallerequisicionOrigen =detallerequisicionsSeleccionados.get(0);
				detallerequisicionDestino =detallerequisicionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDetalleRequisicion(detallerequisicionOrigen,detallerequisicionDestino,true,false);
				
				detallerequisicionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detallerequisicionDestino,detallerequisicionLogic.getDetalleRequisicions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallerequisicionDestino,detallerequisicions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDetalleRequisicion(false);
				
				//this.jTableDatosDetalleRequisicion.setRowSelectionInterval(this.getIndiceNuevoDetalleRequisicion(), this.getIndiceNuevoDetalleRequisicion());
				
				int iLastRow =  this.jTableDatosDetalleRequisicion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleRequisicion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleRequisicion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleRequisicion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDetalleRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleRequisicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDetalleRequisicion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDetalleRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDetalleRequisicion.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDetalleRequisicion.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDetalleRequisicion.setVisible(!isVisible);
			this.jPanelPaginacionDetalleRequisicion.setVisible(!isVisible);
			this.jPanelAccionesDetalleRequisicion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDetalleRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDetalleRequisicion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDetalleRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDetalleRequisicion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDetalleRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDetalleRequisicion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonAbrirTotalesDetalleRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.abrirInicializarFrameTotalesDetalleRequisicion();
			
			this.abrirFrameTotalesDetalleRequisicion();
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTotalesDetalleRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.cerrarFrameTotalesDetalleRequisicion();
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonAbrirOrderByDetalleRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDetalleRequisicion();
			
			this.abrirFrameOrderByDetalleRequisicion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDetalleRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDetalleRequisicion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDetalleRequisicion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleRequisicion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDetalleRequisicion.isMaximum()) {
					this.jInternalFrameDetalleFormDetalleRequisicion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDetalleRequisicion.setSize(this.jInternalFrameDetalleFormDetalleRequisicion.iWidthFormulario,this.jInternalFrameDetalleFormDetalleRequisicion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDetalleRequisicion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDetalleRequisicion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDetalleRequisicion.isMaximum()) {
						this.jInternalFrameDetalleFormDetalleRequisicion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDetalleRequisicion.jContentPaneDetalleDetalleRequisicion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDetalleRequisicion.jTabbedPaneRelacionesDetalleRequisicion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDetalleRequisicion.jContentPaneDetalleDetalleRequisicion.getWidth(),DetalleRequisicionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleRequisicion.jTabbedPaneRelacionesDetalleRequisicion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDetalleRequisicion.jContentPaneDetalleDetalleRequisicion.getWidth(),DetalleRequisicionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleRequisicion.jTabbedPaneRelacionesDetalleRequisicion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDetalleRequisicion.jContentPaneDetalleDetalleRequisicion.getWidth(),DetalleRequisicionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDetalleRequisicion.setVisible(true);
	        this.jInternalFrameDetalleFormDetalleRequisicion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDetalleRequisicion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDetalleRequisicion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDetalleRequisicion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleRequisicion,false,this);
				} else {
					this.jInternalFrameOrderByDetalleRequisicion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleRequisicion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDetalleRequisicion);
				this.jInternalFrameOrderByDetalleRequisicion.setVisible(false);
				this.jInternalFrameOrderByDetalleRequisicion.setSelected(false);
				
				this.jInternalFrameOrderByDetalleRequisicion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleRequisicion"));
				
				this.inicializarActualizarBindingTablaOrderByDetalleRequisicion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDetalleRequisicion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDetalleRequisicion==null) {
				
				this.jInternalFrameImportacionDetalleRequisicion=new ImportacionJInternalFrame(DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleRequisicion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDetalleRequisicion);
				this.jInternalFrameImportacionDetalleRequisicion.setVisible(false);
				this.jInternalFrameImportacionDetalleRequisicion.setSelected(false);


				this.jInternalFrameImportacionDetalleRequisicion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleRequisicion"));
				this.jInternalFrameImportacionDetalleRequisicion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleRequisicion"));
				this.jInternalFrameImportacionDetalleRequisicion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleRequisicion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDetalleRequisicion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDetalleRequisicion==null) {
				this.jInternalFrameReporteDinamicoDetalleRequisicion=new ReporteDinamicoJInternalFrame(DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleRequisicion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleRequisicion);
				this.jInternalFrameReporteDinamicoDetalleRequisicion.setVisible(false);
				this.jInternalFrameReporteDinamicoDetalleRequisicion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDetalleRequisicion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleRequisicion"));
				this.jInternalFrameReporteDinamicoDetalleRequisicion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleRequisicion"));
				this.jInternalFrameReporteDinamicoDetalleRequisicion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleRequisicion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleRequisicion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	public void abrirInicializarFrameTotalesDetalleRequisicion() throws Exception {	    	        
	    try {			
			if(this.jInternalFrameTotalesDetalleRequisicion==null) {
				this.jInternalFrameTotalesDetalleRequisicion=new TotalesJInternalFrame(this.jButtonAbrirTotalesDetalleRequisicion,STIPO_TAMANIO_GENERAL,this);
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameTotalesDetalleRequisicion);

				//TOTALES
				this.jDesktopPane.add(this.jInternalFrameTotalesDetalleRequisicion);
				this.jInternalFrameTotalesDetalleRequisicion.setVisible(false);
				this.jInternalFrameTotalesDetalleRequisicion.setSelected(false);


				this.jInternalFrameTotalesDetalleRequisicion.getjButtonCerrarTotales().addActionListener (new ButtonActionListener(this,"CerrarTotalesDetalleRequisicion"));
								
				this.inicializarActualizarBindingTablaTotalesDetalleRequisicion();
				
				this.redimensionarTablaTotales();
			}			
		} catch (final Exception e) {
			
		}
	}	
	
		
					
	public void cerrarFrameDetalleDetalleRequisicion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleRequisicion);
			
	       	this.jInternalFrameDetalleFormDetalleRequisicion.setVisible(false);
	        this.jInternalFrameDetalleFormDetalleRequisicion.setSelected(false);
			
			//this.jInternalFrameDetalleFormDetalleRequisicion.dispose();
			//this.jInternalFrameDetalleFormDetalleRequisicion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDetalleRequisicion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDetalleRequisicion.setVisible(true);
	        this.jInternalFrameReporteDinamicoDetalleRequisicion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDetalleRequisicion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDetalleRequisicion.setVisible(true);
	        this.jInternalFrameImportacionDetalleRequisicion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	public void abrirFrameTotalesDetalleRequisicion() throws Exception {	    	        
	    try {
			this.jInternalFrameTotalesDetalleRequisicion.setVisible(true);
	        this.jInternalFrameTotalesDetalleRequisicion.setSelected(true);
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
	    }
	}
	
	public void cerrarFrameTotalesDetalleRequisicion() throws Exception {	    	        
	    try {
			this.jInternalFrameTotalesDetalleRequisicion.setVisible(false);
	        this.jInternalFrameTotalesDetalleRequisicion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	
	public void abrirFrameOrderByDetalleRequisicion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDetalleRequisicion.setVisible(true);
	        this.jInternalFrameOrderByDetalleRequisicion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDetalleRequisicion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDetalleRequisicion.setVisible(false);
	        this.jInternalFrameOrderByDetalleRequisicion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDetalleRequisicion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDetalleRequisicion.setVisible(false);
	        this.jInternalFrameReporteDinamicoDetalleRequisicion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDetalleRequisicion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDetalleRequisicion.setVisible(false);
	        this.jInternalFrameImportacionDetalleRequisicion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDetalleRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDetalleRequisicion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDetalleRequisicion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleRequisicion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDetalleRequisicion(true);
			//this.isEsNuevoDetalleRequisicion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicion =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallerequisicion =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDetalleRequisicion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleRequisicion(false) ;
			
			if(detallerequisicionSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DetalleRequisicionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleRequisicion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleRequisicion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDetalleRequisicionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDetalleRequisicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicion =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallerequisicion =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDetalleRequisicion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleRequisicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleRequisicion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDetalleRequisicion(true);
			//this.isEsNuevoDetalleRequisicion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicion =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallerequisicion =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.detallerequisicion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDetalleRequisicion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDetalleRequisicion(false) ;
			
			if(DetalleRequisicionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleRequisicion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleRequisicion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Producto")) {
				if(!this.detallerequisicionConstantesFunciones.cargarid_productoDetalleRequisicion) {
					this.cargarCombosProductosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingDetalleRequisicion(false,false);
					this.cargarCombosFrameProductosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_producto (id);

				this.recargarComboTablaProducto(this.productosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaRequisicion(List<Requisicion> requisicionsForeignKey)throws Exception{
		TableColumn tableColumnRequisicion=this.jTableDatosDetalleRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRequisicion,DetalleRequisicionConstantesFunciones.LABEL_IDREQUISICION));
		TableCellEditor tableCellEditorRequisicion =tableColumnRequisicion.getCellEditor();

		RequisicionTableCell requisicionTableCellFk=(RequisicionTableCell)tableCellEditorRequisicion;

		if(requisicionTableCellFk!=null) {
			requisicionTableCellFk.setrequisicionsForeignKey(requisicionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleRequisicion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//requisicionTableCellFk.setRowActual(intSelectedRow);
			//requisicionTableCellFk.setrequisicionsForeignKeyActual(requisicionsForeignKey);
		//}


		if(requisicionTableCellFk!=null) {
			requisicionTableCellFk.RecargarRequisicionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
					
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosDetalleRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRequisicion,DetalleRequisicionConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleRequisicion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//anioTableCellFk.setRowActual(intSelectedRow);
			//anioTableCellFk.setaniosForeignKeyActual(aniosForeignKey);
		//}


		if(anioTableCellFk!=null) {
			anioTableCellFk.RecargarAniosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaMes(List<Mes> messForeignKey)throws Exception{
		TableColumn tableColumnMes=this.jTableDatosDetalleRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRequisicion,DetalleRequisicionConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleRequisicion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosDetalleRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRequisicion,DetalleRequisicionConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleRequisicion.getSelectedRow();

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
		TableColumn tableColumnProducto=this.jTableDatosDetalleRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRequisicion,DetalleRequisicionConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleRequisicion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoTableCellFk.setRowActual(intSelectedRow);
			//productoTableCellFk.setproductosForeignKeyActual(productosForeignKey);
		//}


		if(productoTableCellFk!=null) {
			productoTableCellFk.RecargarProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaUnidad(List<Unidad> unidadsForeignKey)throws Exception{
		TableColumn tableColumnUnidad=this.jTableDatosDetalleRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRequisicion,DetalleRequisicionConstantesFunciones.LABEL_IDUNIDAD));
		TableCellEditor tableCellEditorUnidad =tableColumnUnidad.getCellEditor();

		UnidadTableCell unidadTableCellFk=(UnidadTableCell)tableCellEditorUnidad;

		if(unidadTableCellFk!=null) {
			unidadTableCellFk.setunidadsForeignKey(unidadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleRequisicion.getSelectedRow();

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
	
	public void jButtonActualizarDetalleRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDetalleRequisicion(false);
			
			//if(!this.isEsNuevoDetalleRequisicion) {								
				int intSelectedRow = this.jTableDatosDetalleRequisicion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicion =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallerequisicion =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DetalleRequisicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.detallerequisicion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);
				
			}
			
			if(this.permiteMantenimiento(this.detallerequisicion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDetalleRequisicion=true;
					this.inicializarActualizarBindingTablaDetalleRequisicion(false);
					this.isEsNuevoDetalleRequisicion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDetalleRequisicion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDetalleRequisicion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleRequisicion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleRequisicion(false);
				
				this.habilitarDeshabilitarControlesDetalleRequisicion(false);
			
												
				
				if(DetalleRequisicionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDetalleRequisicion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDetalleRequisicionActionPerformed(evt,detallerequisicionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDetalleRequisicion(this.detallerequisicion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDetalleRequisicion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,detallerequisicionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.detallerequisicion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DetalleRequisicion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleRequisicion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDetalleRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDetalleRequisicion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicion =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				this.detallerequisicion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallerequisicion =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				this.detallerequisicion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.detallerequisicion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DetalleRequisicionModel) this.jTableDatosDetalleRequisicion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDetalleRequisicion=true;
				this.inicializarActualizarBindingTablaDetalleRequisicion(false);
				this.isEsNuevoDetalleRequisicion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleRequisicion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleRequisicion(false);
				
				this.habilitarDeshabilitarControlesDetalleRequisicion(false);
				
				
				
				if(DetalleRequisicionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDetalleRequisicion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDetalleRequisicionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDetalleRequisicion.getRowCount()>=1) {
				jTableDatosDetalleRequisicion.removeRowSelectionInterval(0, jTableDatosDetalleRequisicion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDetalleRequisicion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDetalleRequisicion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleRequisicion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleRequisicion(false) ;
			
			this.isEsNuevoDetalleRequisicion=false;
			
			if(DetalleRequisicionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDetalleRequisicion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDetalleRequisicionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDetalleRequisicion(false);
				
				//SI ES MANUAL
				if(DetalleRequisicionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDetalleRequisicion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDetalleRequisicionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDetalleRequisicion--;			
			//DetalleRequisicion detallerequisicionAux= new DetalleRequisicion();			
			//detallerequisicionAux.setId(this.iIdNuevoDetalleRequisicion);
			
			if(this.jInternalFrameDetalleFormDetalleRequisicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDetalleRequisicion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);
			
			this.detallerequisicion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.detallerequisicionLogic.getDetalleRequisicions().add(this.detallerequisicionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.detallerequisicions.add(this.detallerequisicionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDetalleRequisicion(false);
			
			this.jTableDatosDetalleRequisicion.setRowSelectionInterval(this.getIndiceNuevoDetalleRequisicion(), this.getIndiceNuevoDetalleRequisicion());
			
			int iLastRow =  this.jTableDatosDetalleRequisicion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDetalleRequisicion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDetalleRequisicion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDetalleRequisicion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDetalleRequisicionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDetalleRequisicion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleRequisicion(false);
			
			//SI ES MANUAL
			if(DetalleRequisicionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleRequisicion();
			}
			
			//this.abrirFrameTreeDetalleRequisicion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDetalleRequisicionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Detalle RequisicionS ?", "MANTENIMIENTO DE Detalle Requisicion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionDetalleRequisicion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralDetalleRequisicion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.detallerequisicionReturnGeneral=detallerequisicionLogic.procesarImportacionDetalleRequisicionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.detallerequisicionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarDetalleRequisicionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDetalleRequisicionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDetalleRequisicion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDetalleRequisicion.setFileImportacion(this.jInternalFrameImportacionDetalleRequisicion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDetalleRequisicion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDetalleRequisicion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDetalleRequisicion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDetalleRequisicion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDetalleRequisicionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DetalleRequisicion> detallerequisicionsSeleccionados=new ArrayList<DetalleRequisicion>();		

		detallerequisicionsSeleccionados=this.getDetalleRequisicionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleRequisicion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleRequisicion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DetalleRequisicionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DetalleRequisicionBaseDesign.jrxml";
			
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
			
			this.generarReporteDetalleRequisicions("Todos",detallerequisicionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Requisicion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleRequisicion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleRequisicion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleRequisicionConstantesFunciones.LABEL_IDREQUISICION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Requisicion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Requisicion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Requisicion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Requisicion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Periodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Periodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Periodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Periodo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDMES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mes_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Bodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Bodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Bodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Bodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Producto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Producto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Producto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Producto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Unidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Unidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Unidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Unidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleRequisicionConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleRequisicionConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleRequisicionConstantesFunciones.LABEL_FECHAAUTORIZA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaAutoriza_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaAutoriza_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaAutoriza_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaAutoriza_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoDetalleRequisicion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleRequisicion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleRequisicion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DetalleRequisicionConstantesFunciones.LABEL_IDREQUISICION:
					sNombreCampoCategoria="id_requisicion";
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoria="id_periodo";
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoria="id_bodega";
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoria="id_producto";
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoria="id_unidad";
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_FECHAAUTORIZA:
					sNombreCampoCategoria="fecha_autoriza";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDetalleRequisicion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DetalleRequisicionConstantesFunciones.LABEL_IDREQUISICION:
					sNombreCampoCategoriaValor="id_requisicion";
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoriaValor="id_periodo";
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoriaValor="id_bodega";
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoriaValor="id_producto";
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoriaValor="id_unidad";
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_FECHAAUTORIZA:
					sNombreCampoCategoriaValor="fecha_autoriza";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDetalleRequisicion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleRequisicion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleRequisicionConstantesFunciones.LABEL_IDREQUISICION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Requisicion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_requisicion");
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo");
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDMES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes");
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_bodega");
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto");
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Unidad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_unidad");
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantidad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad");
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_FECHAAUTORIZA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Autorizacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_autoriza");
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
	
	public void jButtonGenerarExcelReporteDinamicoDetalleRequisicionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DetalleRequisicion> detallerequisicionsSeleccionados=new ArrayList<DetalleRequisicion>();		
		
		detallerequisicionsSeleccionados=this.getDetalleRequisicionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallerequisicion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DetalleRequisicions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDetalleRequisicion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleRequisicion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DetalleRequisicionConstantesFunciones.LABEL_IDREQUISICION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleRequisicionConstantesFunciones.LABEL_IDREQUISICION);
					iRow++;

					for(DetalleRequisicion detallerequisicion:detallerequisicionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallerequisicion.getrequisicion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleRequisicionConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(DetalleRequisicion detallerequisicion:detallerequisicionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallerequisicion.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleRequisicionConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(DetalleRequisicion detallerequisicion:detallerequisicionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallerequisicion.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleRequisicionConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(DetalleRequisicion detallerequisicion:detallerequisicionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallerequisicion.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleRequisicionConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(DetalleRequisicion detallerequisicion:detallerequisicionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallerequisicion.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleRequisicionConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(DetalleRequisicion detallerequisicion:detallerequisicionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallerequisicion.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleRequisicionConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(DetalleRequisicion detallerequisicion:detallerequisicionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallerequisicion.getmes_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleRequisicionConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(DetalleRequisicion detallerequisicion:detallerequisicionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallerequisicion.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleRequisicionConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(DetalleRequisicion detallerequisicion:detallerequisicionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallerequisicion.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_IDUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleRequisicionConstantesFunciones.LABEL_IDUNIDAD);
					iRow++;

					for(DetalleRequisicion detallerequisicion:detallerequisicionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallerequisicion.getunidad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleRequisicionConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(DetalleRequisicion detallerequisicion:detallerequisicionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallerequisicion.getcantidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleRequisicionConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(DetalleRequisicion detallerequisicion:detallerequisicionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallerequisicion.getdescripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleRequisicionConstantesFunciones.LABEL_FECHAAUTORIZA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleRequisicionConstantesFunciones.LABEL_FECHAAUTORIZA);
					iRow++;

					for(DetalleRequisicion detallerequisicion:detallerequisicionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallerequisicion.getfecha_autoriza());
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
			//	this.getFilaCabeceraExportarExcelDetalleRequisicion(row);				
			//	iRow++;
			//}				
			
			//for(DetalleRequisicion detallerequisicionAux:detallerequisicionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDetalleRequisicion(detallerequisicionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Requisicion",JOptionPane.INFORMATION_MESSAGE);
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
				this.detallerequisicionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleRequisicion(false);
			
			//SI ES MANUAL
			if(DetalleRequisicionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleRequisicion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDetalleRequisicionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleRequisicion(false);
			
			//SI ES MANUAL
			if(DetalleRequisicionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleRequisicion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDetalleRequisicionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleRequisicion(false);
			
			//SI ES MANUAL
			if(DetalleRequisicionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleRequisicion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDetalleRequisicion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDetalleRequisicion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDetalleRequisicion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDetalleRequisicion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDetalleRequisicion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDetalleRequisicion.setMinimumSize(dimensionMinimum);
		this.jTableDatosDetalleRequisicion.setMaximumSize(dimensionMaximum);
		this.jTableDatosDetalleRequisicion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDetalleRequisicion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDetalleRequisicion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDetalleRequisicion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDetalleRequisicion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDetalleRequisicion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDetalleRequisicion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleRequisicion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDetalleRequisicion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DetalleRequisicionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DetalleRequisicionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDetalleRequisicion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDetalleRequisicion();
		
		this.inicializarActualizarBindingBotonesManualDetalleRequisicion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleRequisicion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleRequisicion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleRequisicion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleRequisicion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDetalleRequisicion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDetalleRequisicion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDetalleRequisicion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDetalleRequisicion.jCheckBoxPostAccionNuevoDetalleRequisicion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDetalleRequisicion.jCheckBoxPostAccionSinCerrarDetalleRequisicion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDetalleRequisicion.jCheckBoxPostAccionSinMensajeDetalleRequisicion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDetalleRequisicion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDetalleRequisicion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDetalleRequisicion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
				this.jInternalFrameDetalleFormDetalleRequisicion.jCheckBoxPostAccionNuevoDetalleRequisicion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDetalleRequisicion.jCheckBoxPostAccionSinCerrarDetalleRequisicion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDetalleRequisicion.jCheckBoxPostAccionSinMensajeDetalleRequisicion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDetalleRequisicion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDetalleRequisicion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxTiposAccionesFormularioDetalleRequisicion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDetalleRequisicion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDetalleRequisicion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleRequisicion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDetalleRequisicion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDetalleRequisicion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDetalleRequisicion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDetalleRequisicion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDetalleRequisicion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleRequisicion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDetalleRequisicion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDetalleRequisicion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDetalleRequisicion(Boolean esInicializar) throws Exception {
		try	{	
			if(DetalleRequisicionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleRequisicion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDetalleRequisicion() throws Exception {
		try	{
			if(DetalleRequisicionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleRequisicion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleRequisicion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxTiposAccionesFormularioDetalleRequisicion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxTiposAccionesFormularioDetalleRequisicion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleRequisicion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDetalleRequisicion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDetalleRequisicion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDetalleRequisicion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDetalleRequisicion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDetalleRequisicion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDetalleRequisicion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDetalleRequisicion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDetalleRequisicion.addItem(reporte);
			}
			
			
			if(!this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDetalleRequisicion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDetalleRequisicion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDetalleRequisicion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDetalleRequisicion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDetalleRequisicion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDetalleRequisicion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxTiposAccionesFormularioDetalleRequisicion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxTiposAccionesFormularioDetalleRequisicion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDetalleRequisicion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDetalleRequisicion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDetalleRequisicion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleRequisicion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleRequisicion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleRequisicion!=null) {
				this.jInternalFrameReporteDinamicoDetalleRequisicion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleRequisicion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleRequisicion!=null) {
				this.jInternalFrameReporteDinamicoDetalleRequisicion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleRequisicion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDetalleRequisicion!=null) {
				
				if(this.jInternalFrameReporteDinamicoDetalleRequisicion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleRequisicion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleRequisicion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDetalleRequisicion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleRequisicion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleRequisicion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDetalleRequisicion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaFK_IdBodegaDetalleRequisicion.getSelectedItem()!=null){this.id_bodegaFK_IdBodega=((Bodega)this.jComboBoxid_bodegaFK_IdBodegaDetalleRequisicion.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoFK_IdProductoDetalleRequisicion.getSelectedItem()!=null){this.id_productoFK_IdProducto=((Producto)this.jComboBoxid_productoFK_IdProductoDetalleRequisicion.getSelectedItem()).getId();}
		if(this.jComboBoxid_requisicionFK_IdRequisicionDetalleRequisicion.getSelectedItem()!=null){this.id_requisicionFK_IdRequisicion=((Requisicion)this.jComboBoxid_requisicionFK_IdRequisicionDetalleRequisicion.getSelectedItem()).getId();}
		if(this.jComboBoxid_unidadFK_IdUnidadDetalleRequisicion.getSelectedItem()!=null){this.id_unidadFK_IdUnidad=((Unidad)this.jComboBoxid_unidadFK_IdUnidadDetalleRequisicion.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDetalleRequisicion(Boolean esInicializar) throws Exception {				
		if(DetalleRequisicionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleRequisicion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDetalleRequisicion() throws Exception {
		this.inicializarActualizarBindingTablaDetalleRequisicion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDetalleRequisicion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDetalleRequisicion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDetalleRequisicion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleRequisicion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DetalleRequisicionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDetalleRequisicion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleRequisicion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DetalleRequisicionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDetalleRequisicionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRequisicionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DetalleRequisicionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDetalleRequisicion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleRequisicion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DetalleRequisicionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDetalleRequisicion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	public void inicializarActualizarBindingTablaTotalesDetalleRequisicion() {		
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		
		//TABLA TOTALES
		this.jInternalFrameTotalesDetalleRequisicion.getjTableDatosTotales().setModel(new TablaGeneralTotalModel(this.arrDatoGeneralTotales));
				
		//DEFINIR RENDERERS TOTALES
		tableColumn=this.jInternalFrameTotalesDetalleRequisicion.getjTableDatosTotales().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameTotalesDetalleRequisicion.getjTableDatosTotales(),Constantes2.S_TIPO));			
		//tableColumn.addPropertyChangeListener(new DetalleRequisicionPropertyChangeListener());
				
				
		tableColumn=this.jInternalFrameTotalesDetalleRequisicion.getjTableDatosTotales().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameTotalesDetalleRequisicion.getjTableDatosTotales(),Constantes2.S_TOTAL));
		//tableColumn.addPropertyChangeListener(new DetalleRequisicionPropertyChangeListener());		
	}
	
	public void inicializarActualizarBindingTablaDetalleRequisicion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=detallerequisicionLogic.getDetalleRequisicions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=detallerequisicions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DetalleRequisicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDetalleRequisicion.setModel(new DetalleRequisicionModel(this.detallerequisicionLogic.getDetalleRequisicions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDetalleRequisicion.setModel(new DetalleRequisicionModel(this.detallerequisicions,this));
			}
			//ARCHITECTURE
			
			if(this.jInternalFrameTotalesDetalleRequisicion!=null) {
				//TABLA TOTALES
				this.jInternalFrameTotalesDetalleRequisicion.getjTableDatosTotales().setModel(new TablaGeneralTotalModel(this.arrDatoGeneralTotales));
				
				//DEFINIR RENDERERS TOTALES
				tableColumn=this.jInternalFrameTotalesDetalleRequisicion.getjTableDatosTotales().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameTotalesDetalleRequisicion.getjTableDatosTotales(),Constantes2.S_TIPO));			
				//tableColumn.addPropertyChangeListener(new DetalleRequisicionPropertyChangeListener());
				
				
				tableColumn=this.jInternalFrameTotalesDetalleRequisicion.getjTableDatosTotales().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameTotalesDetalleRequisicion.getjTableDatosTotales(),Constantes2.S_TOTAL));
				//tableColumn.addPropertyChangeListener(new DetalleRequisicionPropertyChangeListener());
			}
							
			
			
			if(this.jInternalFrameOrderByDetalleRequisicion!=null && this.jInternalFrameOrderByDetalleRequisicion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDetalleRequisicion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDetalleRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRequisicion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DetalleRequisicionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO,detallerequisicionConstantesFunciones.resaltarSeleccionarDetalleRequisicion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO,detallerequisicionConstantesFunciones.resaltarSeleccionarDetalleRequisicion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDetalleRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRequisicion,DetalleRequisicionConstantesFunciones.LABEL_ID));

		if(this.detallerequisicionConstantesFunciones.mostraridDetalleRequisicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleRequisicionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallerequisicionConstantesFunciones.resaltaridDetalleRequisicion,this.detallerequisicionConstantesFunciones.activaridDetalleRequisicion,this,true,"idDetalleRequisicion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallerequisicionConstantesFunciones.resaltaridDetalleRequisicion,this.detallerequisicionConstantesFunciones.activaridDetalleRequisicion,this,true,"idDetalleRequisicion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRequisicion,DetalleRequisicionConstantesFunciones.LABEL_IDREQUISICION));

		if(this.detallerequisicionConstantesFunciones.mostrarid_requisicionDetalleRequisicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleRequisicionConstantesFunciones.LABEL_IDREQUISICION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new RequisicionTableCell(this.requisicionsForeignKey,this.detallerequisicionConstantesFunciones.resaltarid_requisicionDetalleRequisicion,this,this.detallerequisicionConstantesFunciones.activarid_requisicionDetalleRequisicion));
			tableColumn.setCellEditor(new RequisicionTableCell(this.requisicionsForeignKey,this.detallerequisicionConstantesFunciones.resaltarid_requisicionDetalleRequisicion,this,this.detallerequisicionConstantesFunciones.activarid_requisicionDetalleRequisicion,true,"id_requisicionDetalleRequisicion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleRequisicionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRequisicion,DetalleRequisicionConstantesFunciones.LABEL_IDEMPRESA));

		if(this.detallerequisicionConstantesFunciones.mostrarid_empresaDetalleRequisicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleRequisicionConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.detallerequisicionConstantesFunciones.resaltarid_empresaDetalleRequisicion,this,this.detallerequisicionConstantesFunciones.activarid_empresaDetalleRequisicion));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.detallerequisicionConstantesFunciones.resaltarid_empresaDetalleRequisicion,this,this.detallerequisicionConstantesFunciones.activarid_empresaDetalleRequisicion,false,"id_empresaDetalleRequisicion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleRequisicionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRequisicion,DetalleRequisicionConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.detallerequisicionConstantesFunciones.mostrarid_sucursalDetalleRequisicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleRequisicionConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.detallerequisicionConstantesFunciones.resaltarid_sucursalDetalleRequisicion,this,this.detallerequisicionConstantesFunciones.activarid_sucursalDetalleRequisicion));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.detallerequisicionConstantesFunciones.resaltarid_sucursalDetalleRequisicion,this,this.detallerequisicionConstantesFunciones.activarid_sucursalDetalleRequisicion,false,"id_sucursalDetalleRequisicion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleRequisicionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRequisicion,DetalleRequisicionConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.detallerequisicionConstantesFunciones.mostrarid_ejercicioDetalleRequisicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleRequisicionConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.detallerequisicionConstantesFunciones.resaltarid_ejercicioDetalleRequisicion,this,this.detallerequisicionConstantesFunciones.activarid_ejercicioDetalleRequisicion));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.detallerequisicionConstantesFunciones.resaltarid_ejercicioDetalleRequisicion,this,this.detallerequisicionConstantesFunciones.activarid_ejercicioDetalleRequisicion,false,"id_ejercicioDetalleRequisicion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleRequisicionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRequisicion,DetalleRequisicionConstantesFunciones.LABEL_IDPERIODO));

		if(this.detallerequisicionConstantesFunciones.mostrarid_periodoDetalleRequisicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleRequisicionConstantesFunciones.LABEL_IDPERIODO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new PeriodoTableCell(this.periodosForeignKey,this.detallerequisicionConstantesFunciones.resaltarid_periodoDetalleRequisicion,this,this.detallerequisicionConstantesFunciones.activarid_periodoDetalleRequisicion));
			tableColumn.setCellEditor(new PeriodoTableCell(this.periodosForeignKey,this.detallerequisicionConstantesFunciones.resaltarid_periodoDetalleRequisicion,this,this.detallerequisicionConstantesFunciones.activarid_periodoDetalleRequisicion,false,"id_periodoDetalleRequisicion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleRequisicionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRequisicion,DetalleRequisicionConstantesFunciones.LABEL_IDANIO));

		if(this.detallerequisicionConstantesFunciones.mostrarid_anioDetalleRequisicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleRequisicionConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.detallerequisicionConstantesFunciones.resaltarid_anioDetalleRequisicion,this,this.detallerequisicionConstantesFunciones.activarid_anioDetalleRequisicion));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.detallerequisicionConstantesFunciones.resaltarid_anioDetalleRequisicion,this,this.detallerequisicionConstantesFunciones.activarid_anioDetalleRequisicion,true,"id_anioDetalleRequisicion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleRequisicionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRequisicion,DetalleRequisicionConstantesFunciones.LABEL_IDMES));

		if(this.detallerequisicionConstantesFunciones.mostrarid_mesDetalleRequisicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleRequisicionConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.detallerequisicionConstantesFunciones.resaltarid_mesDetalleRequisicion,this,this.detallerequisicionConstantesFunciones.activarid_mesDetalleRequisicion));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.detallerequisicionConstantesFunciones.resaltarid_mesDetalleRequisicion,this,this.detallerequisicionConstantesFunciones.activarid_mesDetalleRequisicion,true,"id_mesDetalleRequisicion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleRequisicionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRequisicion,DetalleRequisicionConstantesFunciones.LABEL_IDBODEGA));

		if(this.detallerequisicionConstantesFunciones.mostrarid_bodegaDetalleRequisicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleRequisicionConstantesFunciones.LABEL_IDBODEGA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BodegaTableCell(this.bodegasForeignKey,this.detallerequisicionConstantesFunciones.resaltarid_bodegaDetalleRequisicion,this,this.detallerequisicionConstantesFunciones.activarid_bodegaDetalleRequisicion));
			tableColumn.setCellEditor(new BodegaTableCell(this.bodegasForeignKey,this.detallerequisicionConstantesFunciones.resaltarid_bodegaDetalleRequisicion,this,this.detallerequisicionConstantesFunciones.activarid_bodegaDetalleRequisicion,true,"id_bodegaDetalleRequisicion","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new DetalleRequisicionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRequisicion,DetalleRequisicionConstantesFunciones.LABEL_IDPRODUCTO));

		if(this.detallerequisicionConstantesFunciones.mostrarid_productoDetalleRequisicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleRequisicionConstantesFunciones.LABEL_IDPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoTableCell(this.productosForeignKey,this.detallerequisicionConstantesFunciones.resaltarid_productoDetalleRequisicion,this,this.detallerequisicionConstantesFunciones.activarid_productoDetalleRequisicion));
			tableColumn.setCellEditor(new ProductoTableCell(this.productosForeignKey,this.detallerequisicionConstantesFunciones.resaltarid_productoDetalleRequisicion,this,this.detallerequisicionConstantesFunciones.activarid_productoDetalleRequisicion,true,"id_productoDetalleRequisicion","CON_BUSQUEDA-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new DetalleRequisicionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRequisicion,DetalleRequisicionConstantesFunciones.LABEL_IDUNIDAD));

		if(this.detallerequisicionConstantesFunciones.mostrarid_unidadDetalleRequisicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleRequisicionConstantesFunciones.LABEL_IDUNIDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new UnidadTableCell(this.unidadsForeignKey,this.detallerequisicionConstantesFunciones.resaltarid_unidadDetalleRequisicion,this,this.detallerequisicionConstantesFunciones.activarid_unidadDetalleRequisicion));
			tableColumn.setCellEditor(new UnidadTableCell(this.unidadsForeignKey,this.detallerequisicionConstantesFunciones.resaltarid_unidadDetalleRequisicion,this,this.detallerequisicionConstantesFunciones.activarid_unidadDetalleRequisicion,true,"id_unidadDetalleRequisicion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleRequisicionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRequisicion,DetalleRequisicionConstantesFunciones.LABEL_CANTIDAD));

		if(this.detallerequisicionConstantesFunciones.mostrarcantidadDetalleRequisicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleRequisicionConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallerequisicionConstantesFunciones.resaltarcantidadDetalleRequisicion,this.detallerequisicionConstantesFunciones.activarcantidadDetalleRequisicion,this,true,"cantidadDetalleRequisicion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallerequisicionConstantesFunciones.resaltarcantidadDetalleRequisicion,this.detallerequisicionConstantesFunciones.activarcantidadDetalleRequisicion,this,true,"cantidadDetalleRequisicion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleRequisicionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRequisicion,DetalleRequisicionConstantesFunciones.LABEL_DESCRIPCION));

		if(this.detallerequisicionConstantesFunciones.mostrardescripcionDetalleRequisicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleRequisicionConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.detallerequisicionConstantesFunciones.resaltardescripcionDetalleRequisicion,this.detallerequisicionConstantesFunciones.activardescripcionDetalleRequisicion,this,true,"descripcionDetalleRequisicion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallerequisicionConstantesFunciones.resaltardescripcionDetalleRequisicion,this.detallerequisicionConstantesFunciones.activardescripcionDetalleRequisicion,this,true,"descripcionDetalleRequisicion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleRequisicionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.detallerequisicionSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detallerequisicionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detallerequisicionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleRequisicion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detallerequisicionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detallerequisicionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleRequisicion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDetalleRequisicion && this.isPermisoGuardarCambiosDetalleRequisicion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.detallerequisicionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.detallerequisicionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDetalleRequisicion.addColumn(tableColumn);
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
			
			this.jTableDatosDetalleRequisicion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleRequisicion && this.isPermisoGuardarCambiosDetalleRequisicion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleRequisicion && this.isPermisoGuardarCambiosDetalleRequisicion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDetalleRequisicion.moveColumn(this.jTableDatosDetalleRequisicion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDetalleRequisicion.moveColumn(this.jTableDatosDetalleRequisicion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDetalleRequisicion.moveColumn(this.jTableDatosDetalleRequisicion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDetalleRequisicion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDetalleRequisicion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDetalleRequisicion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DetalleRequisicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDetalleRequisicion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDetalleRequisicion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DetalleRequisicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DetalleRequisicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDetalleRequisicion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDetalleRequisicion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDetalleRequisicion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=detallerequisicionLogic.getDetalleRequisicions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=detallerequisicions.size()-1;
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
		//this.jTableDatosDetalleRequisicion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDetalleRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDetalleRequisicion();
			
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
				
				//this.isEsNuevoDetalleRequisicion=false;
					
				DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
			
				if(this.detallerequisicionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDetalleRequisicion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleRequisicion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleRequisicion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicion =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallerequisicion =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.detallerequisicion.getsType().equals("DUPLICADO")
				   || this.detallerequisicion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDetalleRequisicion=true;
				
				} else {
					this.isEsNuevoDetalleRequisicion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {
					if(this.detallerequisicion.getId()>=0 && !this.detallerequisicion.getIsNew()) {						
						this.isEsNuevoDetalleRequisicion=false;
						
					} else {
						this.isEsNuevoDetalleRequisicion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDetalleRequisicion(esRelaciones);						
				
				this.seleccionarDetalleRequisicion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.detallerequisicion.getId()<0) {
					this.isEsNuevoDetalleRequisicion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDetalleRequisicion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDetalleRequisicion(evt,rowIndex);
				}	
				
				if(this.detallerequisicionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DetalleRequisicion: " + this.dDif); 
					}
				}								
				
				DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDetalleRequisicion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.detallerequisicion)) {
					if(this.detallerequisicion.getId()>0) {
						this.detallerequisicion.setIsDeleted(true);
						
						this.detallerequisicionsEliminados.add(this.detallerequisicion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detallerequisicionLogic.getDetalleRequisicions().remove(this.detallerequisicion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detallerequisicions.remove(this.detallerequisicion);				
					}
					
					
					((DetalleRequisicionModel) this.jTableDatosDetalleRequisicion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleRequisicion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDetalleRequisicion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDetalleRequisicion) {
			
			if(this.jInternalFrameDetalleFormDetalleRequisicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleRequisicion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleRequisicion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicion =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallerequisicion =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DetalleRequisicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDetalleRequisicion(this.detallerequisicion);
				}
				
				//ARCHITECTURE
				try {
					

					//Requisicion
					if(!this.detallerequisicionConstantesFunciones.cargarid_requisicionDetalleRequisicion || this.detallerequisicionConstantesFunciones.event_dependid_requisicionDetalleRequisicion) {
						//this.cargarCombosRequisicionsForeignKeyLista(" where id="+this.detallerequisicion.getid_requisicion());
									//this.inicializarActualizarBindingDetalleRequisicion(false,false);
						this.requisicionsForeignKey=new ArrayList<Requisicion>();

						if(detallerequisicion.getRequisicion()!=null) {
							this.requisicionsForeignKey.add(detallerequisicion.getRequisicion());
						}

						this.addItemDefectoCombosForeignKeyRequisicion();
						this.cargarCombosFrameRequisicionsForeignKey("Todos");
					}
					this.setActualRequisicionForeignKey(this.detallerequisicion.getid_requisicion(),false,"Formulario");

					//Empresa
					if(!this.detallerequisicionConstantesFunciones.cargarid_empresaDetalleRequisicion || this.detallerequisicionConstantesFunciones.event_dependid_empresaDetalleRequisicion) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.detallerequisicion.getid_empresa());
									//this.inicializarActualizarBindingDetalleRequisicion(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(detallerequisicion.getEmpresa()!=null) {
							this.empresasForeignKey.add(detallerequisicion.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.detallerequisicion.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.detallerequisicionConstantesFunciones.cargarid_sucursalDetalleRequisicion || this.detallerequisicionConstantesFunciones.event_dependid_sucursalDetalleRequisicion) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.detallerequisicion.getid_sucursal());
									//this.inicializarActualizarBindingDetalleRequisicion(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(detallerequisicion.getSucursal()!=null) {
							this.sucursalsForeignKey.add(detallerequisicion.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.detallerequisicion.getid_sucursal(),false,"Formulario");

					//Ejercicio
					if(!this.detallerequisicionConstantesFunciones.cargarid_ejercicioDetalleRequisicion || this.detallerequisicionConstantesFunciones.event_dependid_ejercicioDetalleRequisicion) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.detallerequisicion.getid_ejercicio());
									//this.inicializarActualizarBindingDetalleRequisicion(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(detallerequisicion.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(detallerequisicion.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.detallerequisicion.getid_ejercicio(),false,"Formulario");

					//Periodo
					if(!this.detallerequisicionConstantesFunciones.cargarid_periodoDetalleRequisicion || this.detallerequisicionConstantesFunciones.event_dependid_periodoDetalleRequisicion) {
						//this.cargarCombosPeriodosForeignKeyLista(" where id="+this.detallerequisicion.getid_periodo());
									//this.inicializarActualizarBindingDetalleRequisicion(false,false);
						this.periodosForeignKey=new ArrayList<Periodo>();

						if(detallerequisicion.getPeriodo()!=null) {
							this.periodosForeignKey.add(detallerequisicion.getPeriodo());
						}

						this.addItemDefectoCombosForeignKeyPeriodo();
						this.cargarCombosFramePeriodosForeignKey("Todos");
					}
					this.setActualPeriodoForeignKey(this.detallerequisicion.getid_periodo(),false,"Formulario");

					//Anio
					if(!this.detallerequisicionConstantesFunciones.cargarid_anioDetalleRequisicion || this.detallerequisicionConstantesFunciones.event_dependid_anioDetalleRequisicion) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.detallerequisicion.getid_anio());
									//this.inicializarActualizarBindingDetalleRequisicion(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(detallerequisicion.getAnio()!=null) {
							this.aniosForeignKey.add(detallerequisicion.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.detallerequisicion.getid_anio(),false,"Formulario");

					//Mes
					if(!this.detallerequisicionConstantesFunciones.cargarid_mesDetalleRequisicion || this.detallerequisicionConstantesFunciones.event_dependid_mesDetalleRequisicion) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.detallerequisicion.getid_mes());
									//this.inicializarActualizarBindingDetalleRequisicion(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(detallerequisicion.getMes()!=null) {
							this.messForeignKey.add(detallerequisicion.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.detallerequisicion.getid_mes(),false,"Formulario");

					//Bodega
					if(!this.detallerequisicionConstantesFunciones.cargarid_bodegaDetalleRequisicion || this.detallerequisicionConstantesFunciones.event_dependid_bodegaDetalleRequisicion) {
						//this.cargarCombosBodegasForeignKeyLista(" where id="+this.detallerequisicion.getid_bodega());
									//this.inicializarActualizarBindingDetalleRequisicion(false,false);
						this.bodegasForeignKey=new ArrayList<Bodega>();

						if(detallerequisicion.getBodega()!=null) {
							this.bodegasForeignKey.add(detallerequisicion.getBodega());
						}

						this.addItemDefectoCombosForeignKeyBodega();
						this.cargarCombosFrameBodegasForeignKey("Todos");
					}
					this.setActualBodegaForeignKey(this.detallerequisicion.getid_bodega(),false,"Formulario");

					//Producto
					if(!this.detallerequisicionConstantesFunciones.cargarid_productoDetalleRequisicion || this.detallerequisicionConstantesFunciones.event_dependid_productoDetalleRequisicion) {
						//this.cargarCombosProductosForeignKeyLista(" where id="+this.detallerequisicion.getid_producto());
									//this.inicializarActualizarBindingDetalleRequisicion(false,false);
						this.productosForeignKey=new ArrayList<Producto>();

						if(detallerequisicion.getProducto()!=null) {
							this.productosForeignKey.add(detallerequisicion.getProducto());
						}

						this.addItemDefectoCombosForeignKeyProducto();
						this.cargarCombosFrameProductosForeignKey("Todos");
					}
					this.setActualProductoForeignKey(this.detallerequisicion.getid_producto(),false,"Formulario");

					//Unidad
					if(!this.detallerequisicionConstantesFunciones.cargarid_unidadDetalleRequisicion || this.detallerequisicionConstantesFunciones.event_dependid_unidadDetalleRequisicion) {
						//this.cargarCombosUnidadsForeignKeyLista(" where id="+this.detallerequisicion.getid_unidad());
									//this.inicializarActualizarBindingDetalleRequisicion(false,false);
						this.unidadsForeignKey=new ArrayList<Unidad>();

						if(detallerequisicion.getUnidad()!=null) {
							this.unidadsForeignKey.add(detallerequisicion.getUnidad());
						}

						this.addItemDefectoCombosForeignKeyUnidad();
						this.cargarCombosFrameUnidadsForeignKey("Todos");
					}
					this.setActualUnidadForeignKey(this.detallerequisicion.getid_unidad(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDetalleRequisicion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDetalleRequisicion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleRequisicion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleRequisicion(DetalleRequisicion detallerequisicion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDetalleRequisicion(detallerequisicion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleRequisicion(DetalleRequisicion detallerequisicion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDetalleRequisicion(detallerequisicion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDetalleRequisicion(detallerequisicion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDetalleRequisicion(detallerequisicion);
	}
	
	public void setVariablesObjetoActualToFormularioDetalleRequisicion(DetalleRequisicion detallerequisicion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDetalleRequisicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDetalleRequisicion.jLabelidDetalleRequisicion.setText(detallerequisicion.getId().toString());
			this.jInternalFrameDetalleFormDetalleRequisicion.jTextFieldcantidadDetalleRequisicion.setText(detallerequisicion.getcantidad().toString());
			this.jInternalFrameDetalleFormDetalleRequisicion.jTextAreadescripcionDetalleRequisicion.setText(detallerequisicion.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DetalleRequisicion detallerequisicionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,detallerequisicionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DetalleRequisicion detallerequisicionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				detallerequisicionLocal=this.detallerequisicion;
			} else {
				detallerequisicionLocal=this.detallerequisicionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(detallerequisicionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDetalleRequisicion(detallerequisicionLocal,true);
					
					if(detallerequisicionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(detallerequisicionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(detallerequisicionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDetalleRequisicion(DetalleRequisicion detallerequisicion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleRequisicion(detallerequisicion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(detallerequisicion);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleRequisicion(DetalleRequisicion detallerequisicion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleRequisicion(detallerequisicion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleRequisicion(DetalleRequisicion detallerequisicion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDetalleRequisicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDetalleRequisicion.jLabelidDetalleRequisicion.getText()==null || this.jInternalFrameDetalleFormDetalleRequisicion.jLabelidDetalleRequisicion.getText()=="" || this.jInternalFrameDetalleFormDetalleRequisicion.jLabelidDetalleRequisicion.getText()=="Id") {
				this.jInternalFrameDetalleFormDetalleRequisicion.jLabelidDetalleRequisicion.setText("0");
			}

			if(conColumnasBase) {detallerequisicion.setId(Long.parseLong(this.jInternalFrameDetalleFormDetalleRequisicion.jLabelidDetalleRequisicion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleRequisicionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleRequisicion.jLabelIdDetalleRequisicion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallerequisicion.setcantidad(Long.parseLong(this.jInternalFrameDetalleFormDetalleRequisicion.jTextFieldcantidadDetalleRequisicion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleRequisicionConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleRequisicion.jLabelcantidadDetalleRequisicion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallerequisicion.setdescripcion(this.jInternalFrameDetalleFormDetalleRequisicion.jTextAreadescripcionDetalleRequisicion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleRequisicionConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleRequisicion.jLabeldescripcionDetalleRequisicion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleRequisicion(DetalleRequisicion detallerequisicionBean,DetalleRequisicion detallerequisicion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDetalleRequisicion(DetalleRequisicion detallerequisicionOrigen,DetalleRequisicion detallerequisicion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detallerequisicionOrigen.getId()!=null && !detallerequisicionOrigen.getId().equals(0L))) {detallerequisicion.setId(detallerequisicionOrigen.getId());}}
			if(conDefault || (!conDefault && detallerequisicionOrigen.getcantidad()!=null && !detallerequisicionOrigen.getcantidad().equals(0L))) {detallerequisicion.setcantidad(detallerequisicionOrigen.getcantidad());}
			if(conDefault || (!conDefault && detallerequisicionOrigen.getdescripcion()!=null && !detallerequisicionOrigen.getdescripcion().equals(""))) {detallerequisicion.setdescripcion(detallerequisicionOrigen.getdescripcion());}
			if(conDefault || (!conDefault && detallerequisicionOrigen.getfecha_autoriza()!=null && !detallerequisicionOrigen.getfecha_autoriza().equals(new Date()))) {detallerequisicion.setfecha_autoriza(detallerequisicionOrigen.getfecha_autoriza());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleRequisicion(DetalleRequisicion detallerequisicion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleRequisicion.jLabelidDetalleRequisicion.setText(detallerequisicion.getId().toString());
			this.jInternalFrameDetalleFormDetalleRequisicion.jTextFieldcantidadDetalleRequisicion.setText(detallerequisicion.getcantidad().toString());
			this.jInternalFrameDetalleFormDetalleRequisicion.jTextAreadescripcionDetalleRequisicion.setText(detallerequisicion.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleRequisicion(DetalleRequisicionBean detallerequisicionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleRequisicion.jLabelidDetalleRequisicion.setText(detallerequisicionBean.getId().toString());
			this.jInternalFrameDetalleFormDetalleRequisicion.jTextFieldcantidadDetalleRequisicion.setText(detallerequisicionBean.getcantidad().toString());
			this.jInternalFrameDetalleFormDetalleRequisicion.jTextAreadescripcionDetalleRequisicion.setText(detallerequisicionBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDetalleRequisicion(DetalleRequisicionParameterReturnGeneral detallerequisicionReturnGeneral,DetalleRequisicionBean detallerequisicionBean,Boolean conDefault) throws Exception { 
		try {
			DetalleRequisicion detallerequisicionLocal=new DetalleRequisicion();
			
			detallerequisicionLocal=detallerequisicionReturnGeneral.getDetalleRequisicion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detallerequisicionLocal.getId()!=null && !detallerequisicionLocal.getId().equals(0L))) {detallerequisicionBean.setId(detallerequisicionLocal.getId());}}
			if(conDefault || (!conDefault && detallerequisicionLocal.getcantidad()!=null && !detallerequisicionLocal.getcantidad().equals(0L))) {detallerequisicionBean.setcantidad(detallerequisicionLocal.getcantidad());}
			if(conDefault || (!conDefault && detallerequisicionLocal.getdescripcion()!=null && !detallerequisicionLocal.getdescripcion().equals(""))) {detallerequisicionBean.setdescripcion(detallerequisicionLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDetalleRequisicionGenerico(Long idDetalleRequisicionSeleccionado,JComboBox jComboBoxDetalleRequisicion,List<DetalleRequisicion> detallerequisicionsLocal)throws Exception {
		try {
			DetalleRequisicion  detallerequisicionTemp=null;

			for(DetalleRequisicion detallerequisicionAux:detallerequisicionsLocal) {
				if(detallerequisicionAux.getId()!=null && detallerequisicionAux.getId().equals(idDetalleRequisicionSeleccionado)) {
					detallerequisicionTemp=detallerequisicionAux;
					break;
				}
			}

			jComboBoxDetalleRequisicion.setSelectedItem(detallerequisicionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDetalleRequisicionGenerico(JComboBox jComboBoxDetalleRequisicion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDetalleRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDetalleRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleRequisicion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDetalleRequisicion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleRequisicion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDetalleRequisicion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDetalleRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDetalleRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallerequisicion=(DetalleRequisicion) detallerequisicionLogic.getDetalleRequisicions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detallerequisicion =(DetalleRequisicion) detallerequisicions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Requisicion")) {
			//sDescripcion=this.getActualRequisicionForeignKeyDescripcion((Long)value);
			if(!detallerequisicion.getIsNew() && !detallerequisicion.getIsChanged() && !detallerequisicion.getIsDeleted()) {
				sDescripcion=detallerequisicion.getrequisicion_descripcion();
			} else {
				//sDescripcion=this.getActualRequisicionForeignKeyDescripcion((Long)value);
				sDescripcion=detallerequisicion.getrequisicion_descripcion();
			}
		}

		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!detallerequisicion.getIsNew() && !detallerequisicion.getIsChanged() && !detallerequisicion.getIsDeleted()) {
				sDescripcion=detallerequisicion.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=detallerequisicion.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!detallerequisicion.getIsNew() && !detallerequisicion.getIsChanged() && !detallerequisicion.getIsDeleted()) {
				sDescripcion=detallerequisicion.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=detallerequisicion.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!detallerequisicion.getIsNew() && !detallerequisicion.getIsChanged() && !detallerequisicion.getIsDeleted()) {
				sDescripcion=detallerequisicion.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=detallerequisicion.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!detallerequisicion.getIsNew() && !detallerequisicion.getIsChanged() && !detallerequisicion.getIsDeleted()) {
				sDescripcion=detallerequisicion.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=detallerequisicion.getperiodo_descripcion();
			}
		}

		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!detallerequisicion.getIsNew() && !detallerequisicion.getIsChanged() && !detallerequisicion.getIsDeleted()) {
				sDescripcion=detallerequisicion.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=detallerequisicion.getanio_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!detallerequisicion.getIsNew() && !detallerequisicion.getIsChanged() && !detallerequisicion.getIsDeleted()) {
				sDescripcion=detallerequisicion.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=detallerequisicion.getmes_descripcion();
			}
		}

		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!detallerequisicion.getIsNew() && !detallerequisicion.getIsChanged() && !detallerequisicion.getIsDeleted()) {
				sDescripcion=detallerequisicion.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=detallerequisicion.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!detallerequisicion.getIsNew() && !detallerequisicion.getIsChanged() && !detallerequisicion.getIsDeleted()) {
				sDescripcion=detallerequisicion.getproducto_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=detallerequisicion.getproducto_descripcion();
			}
		}

		if(sTipo.equals("Unidad")) {
			//sDescripcion=this.getActualUnidadForeignKeyDescripcion((Long)value);
			if(!detallerequisicion.getIsNew() && !detallerequisicion.getIsChanged() && !detallerequisicion.getIsDeleted()) {
				sDescripcion=detallerequisicion.getunidad_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=detallerequisicion.getunidad_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DetalleRequisicion detallerequisicionRow=new DetalleRequisicion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallerequisicionRow=(DetalleRequisicion) detallerequisicionLogic.getDetalleRequisicions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detallerequisicionRow=(DetalleRequisicion) detallerequisicions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDetalleRequisicion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDetalleRequisicion.setVisible((this.isVisibilidadCeldaNuevoDetalleRequisicion && this.isPermisoNuevoDetalleRequisicion));			
			this.jButtonDuplicarDetalleRequisicion.setVisible((this.isVisibilidadCeldaDuplicarDetalleRequisicion && this.isPermisoDuplicarDetalleRequisicion));			
			this.jButtonCopiarDetalleRequisicion.setVisible((this.isVisibilidadCeldaCopiarDetalleRequisicion && this.isPermisoCopiarDetalleRequisicion));
			this.jButtonVerFormDetalleRequisicion.setVisible((this.isVisibilidadCeldaVerFormDetalleRequisicion && this.isPermisoVerFormDetalleRequisicion));
			
			this.jButtonAbrirOrderByDetalleRequisicion.setVisible((this.isVisibilidadCeldaOrdenDetalleRequisicion && this.isPermisoOrdenDetalleRequisicion));			
			
			this.jButtonNuevoRelacionesDetalleRequisicion.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleRequisicion && this.isPermisoNuevoDetalleRequisicion));			
			this.jButtonNuevoGuardarCambiosDetalleRequisicion.setVisible((this.isVisibilidadCeldaNuevoDetalleRequisicion && this.isPermisoNuevoDetalleRequisicion && this.isPermisoGuardarCambiosDetalleRequisicion));
			
			if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
			this.jInternalFrameDetalleFormDetalleRequisicion.jButtonModificarDetalleRequisicion.setVisible((this.isVisibilidadCeldaModificarDetalleRequisicion && this.isPermisoActualizarDetalleRequisicion));	
			this.jInternalFrameDetalleFormDetalleRequisicion.jButtonActualizarDetalleRequisicion.setVisible((this.isVisibilidadCeldaActualizarDetalleRequisicion && this.isPermisoActualizarDetalleRequisicion));	
			this.jInternalFrameDetalleFormDetalleRequisicion.jButtonEliminarDetalleRequisicion.setVisible((this.isVisibilidadCeldaEliminarDetalleRequisicion && this.isPermisoEliminarDetalleRequisicion));
			this.jInternalFrameDetalleFormDetalleRequisicion.jButtonCancelarDetalleRequisicion.setVisible(this.isVisibilidadCeldaCancelarDetalleRequisicion);							
			this.jInternalFrameDetalleFormDetalleRequisicion.jButtonGuardarCambiosDetalleRequisicion.setVisible((this.isVisibilidadCeldaGuardarDetalleRequisicion && this.isPermisoGuardarCambiosDetalleRequisicion));			
			
			}
						
			this.jButtonGuardarCambiosTablaDetalleRequisicion.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleRequisicion && this.isPermisoGuardarCambiosDetalleRequisicion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDetalleRequisicion.setVisible((this.isVisibilidadCeldaNuevoDetalleRequisicion && this.isPermisoNuevoDetalleRequisicion));						
			this.jButtonDuplicarToolBarDetalleRequisicion.setVisible((this.isVisibilidadCeldaDuplicarDetalleRequisicion && this.isPermisoDuplicarDetalleRequisicion));						
			this.jButtonCopiarToolBarDetalleRequisicion.setVisible((this.isVisibilidadCeldaCopiarDetalleRequisicion && this.isPermisoCopiarDetalleRequisicion));			
			this.jButtonVerFormToolBarDetalleRequisicion.setVisible((this.isVisibilidadCeldaVerFormDetalleRequisicion && this.isPermisoVerFormDetalleRequisicion));			
			this.jButtonAbrirOrderByToolBarDetalleRequisicion.setVisible((this.isVisibilidadCeldaOrdenDetalleRequisicion && this.isPermisoOrdenDetalleRequisicion));
			this.jButtonNuevoRelacionesToolBarDetalleRequisicion.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleRequisicion && this.isPermisoNuevoDetalleRequisicion));			
			this.jButtonNuevoGuardarCambiosToolBarDetalleRequisicion.setVisible((this.isVisibilidadCeldaNuevoDetalleRequisicion && this.isPermisoNuevoDetalleRequisicion && this.isPermisoGuardarCambiosDetalleRequisicion));			
			
			if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
			this.jInternalFrameDetalleFormDetalleRequisicion.jButtonModificarToolBarDetalleRequisicion.setVisible((this.isVisibilidadCeldaModificarDetalleRequisicion && this.isPermisoActualizarDetalleRequisicion));	
			this.jInternalFrameDetalleFormDetalleRequisicion.jButtonActualizarToolBarDetalleRequisicion.setVisible((this.isVisibilidadCeldaActualizarDetalleRequisicion  && this.isPermisoActualizarDetalleRequisicion));	
			this.jInternalFrameDetalleFormDetalleRequisicion.jButtonEliminarToolBarDetalleRequisicion.setVisible((this.isVisibilidadCeldaEliminarDetalleRequisicion && this.isPermisoEliminarDetalleRequisicion));
			this.jInternalFrameDetalleFormDetalleRequisicion.jButtonCancelarToolBarDetalleRequisicion.setVisible(this.isVisibilidadCeldaCancelarDetalleRequisicion);				
			this.jInternalFrameDetalleFormDetalleRequisicion.jButtonGuardarCambiosToolBarDetalleRequisicion.setVisible((this.isVisibilidadCeldaGuardarDetalleRequisicion && this.isPermisoGuardarCambiosDetalleRequisicion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDetalleRequisicion.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleRequisicion && this.isPermisoGuardarCambiosDetalleRequisicion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDetalleRequisicion.setVisible((this.isVisibilidadCeldaNuevoDetalleRequisicion && this.isPermisoNuevoDetalleRequisicion));			
			this.jMenuItemDuplicarDetalleRequisicion.setVisible((this.isVisibilidadCeldaDuplicarDetalleRequisicion && this.isPermisoDuplicarDetalleRequisicion));			
			this.jMenuItemCopiarDetalleRequisicion.setVisible((this.isVisibilidadCeldaCopiarDetalleRequisicion && this.isPermisoCopiarDetalleRequisicion));			
			this.jMenuItemVerFormDetalleRequisicion.setVisible((this.isVisibilidadCeldaVerFormDetalleRequisicion && this.isPermisoVerFormDetalleRequisicion));			
			this.jMenuItemAbrirOrderByDetalleRequisicion.setVisible((this.isVisibilidadCeldaOrdenDetalleRequisicion && this.isPermisoOrdenDetalleRequisicion));			
			//this.jMenuItemMostrarOcultarDetalleRequisicion.setVisible((this.isVisibilidadCeldaOrdenDetalleRequisicion && this.isPermisoOrdenDetalleRequisicion));
			this.jMenuItemDetalleAbrirOrderByDetalleRequisicion.setVisible((this.isVisibilidadCeldaOrdenDetalleRequisicion && this.isPermisoOrdenDetalleRequisicion));			
			//this.jMenuItemDetalleMostrarOcultarDetalleRequisicion.setVisible((this.isVisibilidadCeldaOrdenDetalleRequisicion && this.isPermisoOrdenDetalleRequisicion));			
			this.jMenuItemNuevoRelacionesDetalleRequisicion.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleRequisicion && this.isPermisoNuevoDetalleRequisicion));			
			this.jMenuItemNuevoGuardarCambiosDetalleRequisicion.setVisible((this.isVisibilidadCeldaNuevoDetalleRequisicion && this.isPermisoNuevoDetalleRequisicion && this.isPermisoGuardarCambiosDetalleRequisicion));									
			
			if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
			this.jInternalFrameDetalleFormDetalleRequisicion.jMenuItemModificarDetalleRequisicion.setVisible((this.isVisibilidadCeldaModificarDetalleRequisicion && this.isPermisoActualizarDetalleRequisicion));	
			this.jInternalFrameDetalleFormDetalleRequisicion.jMenuItemActualizarDetalleRequisicion.setVisible((this.isVisibilidadCeldaActualizarDetalleRequisicion && this.isPermisoActualizarDetalleRequisicion));	
			this.jInternalFrameDetalleFormDetalleRequisicion.jMenuItemEliminarDetalleRequisicion.setVisible((this.isVisibilidadCeldaEliminarDetalleRequisicion && this.isPermisoEliminarDetalleRequisicion));
			this.jInternalFrameDetalleFormDetalleRequisicion.jMenuItemCancelarDetalleRequisicion.setVisible(this.isVisibilidadCeldaCancelarDetalleRequisicion);				
			}
			
			this.jMenuItemGuardarCambiosDetalleRequisicion.setVisible((this.isVisibilidadCeldaGuardarDetalleRequisicion && this.isPermisoGuardarCambiosDetalleRequisicion));						
			this.jMenuItemGuardarCambiosTablaDetalleRequisicion.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleRequisicion && this.isPermisoGuardarCambiosDetalleRequisicion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDetalleRequisicion=this.jButtonNuevoDetalleRequisicion.isVisible();
			this.isVisibilidadCeldaDuplicarDetalleRequisicion=this.jButtonDuplicarDetalleRequisicion.isVisible();
			this.isVisibilidadCeldaCopiarDetalleRequisicion=this.jButtonCopiarDetalleRequisicion.isVisible();
			this.isVisibilidadCeldaVerFormDetalleRequisicion=this.jButtonVerFormDetalleRequisicion.isVisible();
			
			this.isVisibilidadCeldaOrdenDetalleRequisicion=this.jButtonAbrirOrderByDetalleRequisicion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDetalleRequisicion=this.jButtonNuevoRelacionesDetalleRequisicion.isVisible();
			this.isVisibilidadCeldaModificarDetalleRequisicion=this.jButtonModificarDetalleRequisicion.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
			this.isVisibilidadCeldaActualizarDetalleRequisicion=this.jInternalFrameDetalleFormDetalleRequisicion.jButtonActualizarDetalleRequisicion.isVisible();
			this.isVisibilidadCeldaEliminarDetalleRequisicion=this.jInternalFrameDetalleFormDetalleRequisicion.jButtonEliminarDetalleRequisicion.isVisible();
			this.isVisibilidadCeldaCancelarDetalleRequisicion=this.jInternalFrameDetalleFormDetalleRequisicion.jButtonCancelarDetalleRequisicion.isVisible();
			this.isVisibilidadCeldaGuardarDetalleRequisicion=this.jInternalFrameDetalleFormDetalleRequisicion.jButtonGuardarCambiosDetalleRequisicion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDetalleRequisicion=this.jButtonGuardarCambiosTablaDetalleRequisicion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDetalleRequisicion=this.jButtonNuevoToolBarDetalleRequisicion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleRequisicion=this.jButtonNuevoRelacionesToolBarDetalleRequisicion.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
			this.isVisibilidadCeldaModificarDetalleRequisicion=this.jInternalFrameDetalleFormDetalleRequisicion.jButtonModificarToolBarDetalleRequisicion.isVisible();
			this.isVisibilidadCeldaActualizarDetalleRequisicion=this.jInternalFrameDetalleFormDetalleRequisicion.jButtonActualizarToolBarDetalleRequisicion.isVisible();
			this.isVisibilidadCeldaEliminarDetalleRequisicion=this.jInternalFrameDetalleFormDetalleRequisicion.jButtonEliminarToolBarDetalleRequisicion.isVisible();
			this.isVisibilidadCeldaCancelarDetalleRequisicion=this.jInternalFrameDetalleFormDetalleRequisicion.jButtonCancelarToolBarDetalleRequisicion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleRequisicion=this.jButtonGuardarCambiosToolBarDetalleRequisicion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleRequisicion=this.jButtonGuardarCambiosTablaToolBarDetalleRequisicion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDetalleRequisicion=this.jMenuItemNuevoDetalleRequisicion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleRequisicion=this.jMenuItemNuevoRelacionesDetalleRequisicion.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
			this.isVisibilidadCeldaModificarDetalleRequisicion=this.jInternalFrameDetalleFormDetalleRequisicion.jMenuItemModificarDetalleRequisicion.isVisible();
			this.isVisibilidadCeldaActualizarDetalleRequisicion=this.jInternalFrameDetalleFormDetalleRequisicion.jMenuItemActualizarDetalleRequisicion.isVisible();
			this.isVisibilidadCeldaEliminarDetalleRequisicion=this.jInternalFrameDetalleFormDetalleRequisicion.jMenuItemEliminarDetalleRequisicion.isVisible();
			this.isVisibilidadCeldaCancelarDetalleRequisicion=this.jInternalFrameDetalleFormDetalleRequisicion.jMenuItemCancelarDetalleRequisicion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleRequisicion=this.jMenuItemGuardarCambiosDetalleRequisicion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleRequisicion=this.jMenuItemGuardarCambiosTablaDetalleRequisicion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDetalleRequisicion(Boolean esInicializar) {
		if(DetalleRequisicionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.detallerequisicionSessionBean.getConGuardarRelaciones()) {
				//if(this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleRequisicion();
			}
			
			this.inicializarActualizarBindingBotonesManualDetalleRequisicion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDetalleRequisicion() {
		this.jButtonNuevoDetalleRequisicion.setVisible(this.isPermisoNuevoDetalleRequisicion);			
		this.jButtonDuplicarDetalleRequisicion.setVisible(this.isPermisoDuplicarDetalleRequisicion);			
		this.jButtonCopiarDetalleRequisicion.setVisible(this.isPermisoCopiarDetalleRequisicion);			
		this.jButtonVerFormDetalleRequisicion.setVisible(this.isPermisoVerFormDetalleRequisicion);			
		
		this.jButtonAbrirOrderByDetalleRequisicion.setVisible(this.isPermisoOrdenDetalleRequisicion);					
		
		this.jButtonNuevoRelacionesDetalleRequisicion.setVisible(this.isPermisoNuevoDetalleRequisicion);			
		
		if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRequisicion.jButtonModificarDetalleRequisicion.setVisible(this.isPermisoActualizarDetalleRequisicion);	
			this.jInternalFrameDetalleFormDetalleRequisicion.jButtonActualizarDetalleRequisicion.setVisible(this.isPermisoActualizarDetalleRequisicion);	
			this.jInternalFrameDetalleFormDetalleRequisicion.jButtonEliminarDetalleRequisicion.setVisible(this.isPermisoEliminarDetalleRequisicion);
			this.jInternalFrameDetalleFormDetalleRequisicion.jButtonCancelarDetalleRequisicion.setVisible(this.isVisibilidadCeldaCancelarDetalleRequisicion);						
			this.jInternalFrameDetalleFormDetalleRequisicion.jButtonGuardarCambiosDetalleRequisicion.setVisible(this.isPermisoGuardarCambiosDetalleRequisicion);							
		}
		
		this.jButtonGuardarCambiosTablaDetalleRequisicion.setVisible(this.isPermisoActualizarDetalleRequisicion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleRequisicion() {
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonModificarDetalleRequisicion.setVisible(this.isPermisoActualizarDetalleRequisicion);	
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonActualizarDetalleRequisicion.setVisible(this.isPermisoActualizarDetalleRequisicion);	
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonEliminarDetalleRequisicion.setVisible(this.isPermisoEliminarDetalleRequisicion);
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonCancelarDetalleRequisicion.setVisible(this.isVisibilidadCeldaCancelarDetalleRequisicion);							
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonGuardarCambiosDetalleRequisicion.setVisible((this.isVisibilidadCeldaGuardarDetalleRequisicion && this.isPermisoGuardarCambiosDetalleRequisicion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDetalleRequisicion() {
		if(DetalleRequisicionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDetalleRequisicion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDetalleRequisicion() {
	}
	
	public void jTableDatosDetalleRequisicionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDetalleRequisicion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDetalleRequisicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRequisicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.getdetallerequisicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallerequisicion =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallerequisicion =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallerequisicion==null) {
						this.detallerequisicion = new DetalleRequisicion();
					}

					this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.detallerequisicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);
				}

				if(this.detallerequisicion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.detallerequisicion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleRequisicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_requisicionDetalleRequisicionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisorequisicion=true;

			idTienePermisorequisicion=this.tienePermisosUsuarioEnPaginaWebDetalleRequisicion(RequisicionConstantesFunciones.CLASSNAME);

			if(idTienePermisorequisicion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRequisicion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleRequisicion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleRequisicion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicion =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallerequisicion =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.getdetallerequisicion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);

				this.requisicionBeanSwingJInternalFrame=new RequisicionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.requisicionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.requisicionBeanSwingJInternalFrame.getRequisicionLogic().setConnexion(this.detallerequisicionLogic.getConnexion());

				if(this.detallerequisicion.getid_requisicion()!=null) {
					this.requisicionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.requisicionBeanSwingJInternalFrame.setIdActual(this.detallerequisicion.getid_requisicion());
					this.requisicionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.requisicionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.requisicionBeanSwingJInternalFrame.inicializarActualizarBindingTablaRequisicion();
				}

				JInternalFrameBase jinternalFrame =this.requisicionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleRequisicion=(TitledBorder)this.jScrollPanelDatosDetalleRequisicion.getBorder();
				TitledBorder titledBorderrequisicion=(TitledBorder)this.requisicionBeanSwingJInternalFrame.jScrollPanelDatosRequisicion.getBorder();

				titledBorderrequisicion.setTitle(titledBorderDetalleRequisicion.getTitle() + " -> Requisicion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_requisicionDetalleRequisicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRequisicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.getdetallerequisicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallerequisicion =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallerequisicion =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallerequisicion==null) {
						this.detallerequisicion = new DetalleRequisicion();
					}

					this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.detallerequisicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);
				}

				if(this.detallerequisicion.getid_requisicion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_requisicion = "+this.detallerequisicion.getid_requisicion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleRequisicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaDetalleRequisicionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebDetalleRequisicion(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRequisicion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleRequisicion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleRequisicion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicion =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallerequisicion =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.getdetallerequisicion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.detallerequisicionLogic.getConnexion());

				if(this.detallerequisicion.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.detallerequisicion.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleRequisicion=(TitledBorder)this.jScrollPanelDatosDetalleRequisicion.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderDetalleRequisicion.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaDetalleRequisicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRequisicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.getdetallerequisicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallerequisicion =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallerequisicion =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallerequisicion==null) {
						this.detallerequisicion = new DetalleRequisicion();
					}

					this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.detallerequisicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);
				}

				if(this.detallerequisicion.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.detallerequisicion.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleRequisicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalDetalleRequisicionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebDetalleRequisicion(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRequisicion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleRequisicion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleRequisicion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicion =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallerequisicion =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.getdetallerequisicion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.detallerequisicionLogic.getConnexion());

				if(this.detallerequisicion.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.detallerequisicion.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleRequisicion=(TitledBorder)this.jScrollPanelDatosDetalleRequisicion.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderDetalleRequisicion.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalDetalleRequisicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRequisicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.getdetallerequisicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallerequisicion =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallerequisicion =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallerequisicion==null) {
						this.detallerequisicion = new DetalleRequisicion();
					}

					this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.detallerequisicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);
				}

				if(this.detallerequisicion.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.detallerequisicion.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleRequisicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioDetalleRequisicionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebDetalleRequisicion(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRequisicion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleRequisicion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleRequisicion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicion =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallerequisicion =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.getdetallerequisicion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.detallerequisicionLogic.getConnexion());

				if(this.detallerequisicion.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.detallerequisicion.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleRequisicion=(TitledBorder)this.jScrollPanelDatosDetalleRequisicion.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderDetalleRequisicion.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioDetalleRequisicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRequisicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.getdetallerequisicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallerequisicion =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallerequisicion =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallerequisicion==null) {
						this.detallerequisicion = new DetalleRequisicion();
					}

					this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.detallerequisicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);
				}

				if(this.detallerequisicion.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.detallerequisicion.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleRequisicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoDetalleRequisicionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebDetalleRequisicion(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRequisicion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleRequisicion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleRequisicion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicion =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallerequisicion =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.getdetallerequisicion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.detallerequisicionLogic.getConnexion());

				if(this.detallerequisicion.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.detallerequisicion.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleRequisicion=(TitledBorder)this.jScrollPanelDatosDetalleRequisicion.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderDetalleRequisicion.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoDetalleRequisicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRequisicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.getdetallerequisicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallerequisicion =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallerequisicion =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallerequisicion==null) {
						this.detallerequisicion = new DetalleRequisicion();
					}

					this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.detallerequisicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);
				}

				if(this.detallerequisicion.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.detallerequisicion.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleRequisicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioDetalleRequisicionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebDetalleRequisicion(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRequisicion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleRequisicion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleRequisicion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicion =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallerequisicion =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.getdetallerequisicion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.detallerequisicionLogic.getConnexion());

				if(this.detallerequisicion.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.detallerequisicion.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleRequisicion=(TitledBorder)this.jScrollPanelDatosDetalleRequisicion.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderDetalleRequisicion.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioDetalleRequisicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRequisicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.getdetallerequisicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallerequisicion =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallerequisicion =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallerequisicion==null) {
						this.detallerequisicion = new DetalleRequisicion();
					}

					this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.detallerequisicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);
				}

				if(this.detallerequisicion.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.detallerequisicion.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleRequisicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesDetalleRequisicionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebDetalleRequisicion(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRequisicion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleRequisicion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleRequisicion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicion =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallerequisicion =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.getdetallerequisicion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.detallerequisicionLogic.getConnexion());

				if(this.detallerequisicion.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.detallerequisicion.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleRequisicion=(TitledBorder)this.jScrollPanelDatosDetalleRequisicion.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderDetalleRequisicion.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesDetalleRequisicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRequisicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.getdetallerequisicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallerequisicion =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallerequisicion =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallerequisicion==null) {
						this.detallerequisicion = new DetalleRequisicion();
					}

					this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.detallerequisicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);
				}

				if(this.detallerequisicion.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.detallerequisicion.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleRequisicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaDetalleRequisicionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebDetalleRequisicion(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRequisicion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleRequisicion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleRequisicion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicion =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallerequisicion =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.getdetallerequisicion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.detallerequisicionLogic.getConnexion());

				if(this.detallerequisicion.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.detallerequisicion.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleRequisicion=(TitledBorder)this.jScrollPanelDatosDetalleRequisicion.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderDetalleRequisicion.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaDetalleRequisicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRequisicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.getdetallerequisicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallerequisicion =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallerequisicion =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallerequisicion==null) {
						this.detallerequisicion = new DetalleRequisicion();
					}

					this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.detallerequisicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);
				}

				if(this.detallerequisicion.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.detallerequisicion.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleRequisicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoDetalleRequisicionActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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

				//BUSQUEDA FILTRADA DESDE COMBO EVENT Y EVENTDEPEND
				this.productoBeanSwingJInternalFrame.sFinalQueryGeneral=this.sFinalQueryComboProducto;
				this.productoBeanSwingJInternalFrame.procesarBusqueda(this.productoBeanSwingJInternalFrame.sAccionBusqueda);
				this.productoBeanSwingJInternalFrame.inicializarActualizarBindingProducto(false);
			}


			JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderDetalleRequisicion=null;
			TitledBorder titledBorderproducto=null;

			if(!this.jScrollPanelDatosDetalleRequisicion.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderDetalleRequisicion=(TitledBorder)this.jScrollPanelDatosDetalleRequisicion.getBorder();
				titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderDetalleRequisicion.getTitle() + " -> Producto");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_productoDetalleRequisicionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebDetalleRequisicion(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRequisicion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleRequisicion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleRequisicion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicion =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallerequisicion =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.getdetallerequisicion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.detallerequisicionLogic.getConnexion());

				if(this.detallerequisicion.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.detallerequisicion.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleRequisicion=(TitledBorder)this.jScrollPanelDatosDetalleRequisicion.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderDetalleRequisicion.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoDetalleRequisicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRequisicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.getdetallerequisicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallerequisicion =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallerequisicion =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallerequisicion==null) {
						this.detallerequisicion = new DetalleRequisicion();
					}

					this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.detallerequisicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);
				}

				if(this.detallerequisicion.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.detallerequisicion.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleRequisicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_unidadDetalleRequisicionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisounidad=true;

			idTienePermisounidad=this.tienePermisosUsuarioEnPaginaWebDetalleRequisicion(UnidadConstantesFunciones.CLASSNAME);

			if(idTienePermisounidad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRequisicion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleRequisicion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleRequisicion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicion =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallerequisicion =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.getdetallerequisicion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);

				this.unidadBeanSwingJInternalFrame=new UnidadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.unidadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.unidadBeanSwingJInternalFrame.getUnidadLogic().setConnexion(this.detallerequisicionLogic.getConnexion());

				if(this.detallerequisicion.getid_unidad()!=null) {
					this.unidadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.unidadBeanSwingJInternalFrame.setIdActual(this.detallerequisicion.getid_unidad());
					this.unidadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.inicializarActualizarBindingTablaUnidad();
				}

				JInternalFrameBase jinternalFrame =this.unidadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleRequisicion=(TitledBorder)this.jScrollPanelDatosDetalleRequisicion.getBorder();
				TitledBorder titledBorderunidad=(TitledBorder)this.unidadBeanSwingJInternalFrame.jScrollPanelDatosUnidad.getBorder();

				titledBorderunidad.setTitle(titledBorderDetalleRequisicion.getTitle() + " -> Unidad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_unidadDetalleRequisicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRequisicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.getdetallerequisicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallerequisicion =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallerequisicion =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallerequisicion==null) {
						this.detallerequisicion = new DetalleRequisicion();
					}

					this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.detallerequisicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);
				}

				if(this.detallerequisicion.getid_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_unidad = "+this.detallerequisicion.getid_unidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleRequisicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadDetalleRequisicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRequisicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.getdetallerequisicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallerequisicion =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallerequisicion =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallerequisicion==null) {
						this.detallerequisicion = new DetalleRequisicion();
					}

					this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.detallerequisicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);
				}

				if(this.detallerequisicion.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.detallerequisicion.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleRequisicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionDetalleRequisicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRequisicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.getdetallerequisicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallerequisicion =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallerequisicion =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallerequisicion==null) {
						this.detallerequisicion = new DetalleRequisicion();
					}

					this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.detallerequisicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);
				}

				if(this.detallerequisicion.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.detallerequisicion.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleRequisicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_autorizaDetalleRequisicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRequisicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.getdetallerequisicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallerequisicion =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallerequisicion =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallerequisicion==null) {
						this.detallerequisicion = new DetalleRequisicion();
					}

					this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.detallerequisicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);
				}

				if(this.detallerequisicion.getfecha_autoriza()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_autoriza = '"+Funciones2.getStringPostgresDate(this.detallerequisicion.getfecha_autoriza())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleRequisicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdAnioDetalleRequisicionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleRequisicion(false,false);

			this.getDetalleRequisicionsFK_IdAnio();

			this.inicializarActualizarBindingDetalleRequisicion(false);

			//if(DetalleRequisicionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleRequisicion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdBodegaDetalleRequisicionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleRequisicion(false,false);

			this.getDetalleRequisicionsFK_IdBodega();

			this.inicializarActualizarBindingDetalleRequisicion(false);

			//if(DetalleRequisicionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleRequisicion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioDetalleRequisicionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleRequisicion(false,false);

			this.getDetalleRequisicionsFK_IdEjercicio();

			this.inicializarActualizarBindingDetalleRequisicion(false);

			//if(DetalleRequisicionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleRequisicion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaDetalleRequisicionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleRequisicion(false,false);

			this.getDetalleRequisicionsFK_IdEmpresa();

			this.inicializarActualizarBindingDetalleRequisicion(false);

			//if(DetalleRequisicionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleRequisicion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesDetalleRequisicionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleRequisicion(false,false);

			this.getDetalleRequisicionsFK_IdMes();

			this.inicializarActualizarBindingDetalleRequisicion(false);

			//if(DetalleRequisicionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleRequisicion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoDetalleRequisicionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleRequisicion(false,false);

			this.getDetalleRequisicionsFK_IdPeriodo();

			this.inicializarActualizarBindingDetalleRequisicion(false);

			//if(DetalleRequisicionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleRequisicion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoDetalleRequisicionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleRequisicion(false,false);

			this.getDetalleRequisicionsFK_IdProducto();

			this.inicializarActualizarBindingDetalleRequisicion(false);

			//if(DetalleRequisicionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleRequisicion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdRequisicionDetalleRequisicionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleRequisicion(false,false);

			this.getDetalleRequisicionsFK_IdRequisicion();

			this.inicializarActualizarBindingDetalleRequisicion(false);

			//if(DetalleRequisicionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleRequisicion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalDetalleRequisicionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleRequisicion(false,false);

			this.getDetalleRequisicionsFK_IdSucursal();

			this.inicializarActualizarBindingDetalleRequisicion(false);

			//if(DetalleRequisicionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleRequisicion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUnidadDetalleRequisicionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleRequisicion(false,false);

			this.getDetalleRequisicionsFK_IdUnidad();

			this.inicializarActualizarBindingDetalleRequisicion(false);

			//if(DetalleRequisicionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleRequisicion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerequisicionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDetalleRequisicion() {
		if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
			this.jInternalFrameDetalleFormDetalleRequisicion.setVisible(false);	    			
			this.jInternalFrameDetalleFormDetalleRequisicion.dispose();
			this.jInternalFrameDetalleFormDetalleRequisicion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDetalleRequisicion!=null) {
			this.jInternalFrameReporteDinamicoDetalleRequisicion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDetalleRequisicion.dispose();
			this.jInternalFrameReporteDinamicoDetalleRequisicion=null;
		}
		
		if(this.jInternalFrameImportacionDetalleRequisicion!=null) {
			this.jInternalFrameImportacionDetalleRequisicion.setVisible(false);	    			
			this.jInternalFrameImportacionDetalleRequisicion.dispose();
			this.jInternalFrameImportacionDetalleRequisicion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDetalleRequisicion();
			
			DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
			
			
			if(sTipo.equals("NuevoDetalleRequisicion")) {
				jButtonNuevoDetalleRequisicionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDetalleRequisicion")) {
				jButtonDuplicarDetalleRequisicionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDetalleRequisicion")) {
				jButtonCopiarDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("VerFormDetalleRequisicion")) {
				jButtonVerFormDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDetalleRequisicion")) {
				jButtonNuevoDetalleRequisicionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDetalleRequisicion")) {
				jButtonDuplicarDetalleRequisicionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDetalleRequisicion")) {
				jButtonNuevoDetalleRequisicionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDetalleRequisicion")) {
				jButtonDuplicarDetalleRequisicionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDetalleRequisicion")) {
				jButtonNuevoDetalleRequisicionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDetalleRequisicion")) {
				jButtonNuevoDetalleRequisicionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDetalleRequisicion")) {
				jButtonNuevoDetalleRequisicionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDetalleRequisicion")) {
				jButtonModificarDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDetalleRequisicion")) {
				jButtonModificarDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDetalleRequisicion")) {
				jButtonModificarDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDetalleRequisicion")) {
				jButtonActualizarDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDetalleRequisicion")) {
				jButtonActualizarDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDetalleRequisicion")) {
				jButtonActualizarDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("EliminarDetalleRequisicion")) {
				jButtonEliminarDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDetalleRequisicion")) {
				jButtonEliminarDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDetalleRequisicion")) {
				jButtonEliminarDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("CancelarDetalleRequisicion")) {
				jButtonCancelarDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDetalleRequisicion")) {
				jButtonCancelarDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDetalleRequisicion")) {
				jButtonCancelarDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("CerrarDetalleRequisicion")) {
				jButtonCerrarDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDetalleRequisicion")) {
				jButtonCerrarDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDetalleRequisicion")) {
				jButtonCerrarDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDetalleRequisicion")) {
				jButtonMostrarOcultarDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDetalleRequisicion")) {
				jButtonCancelarDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDetalleRequisicion")) {
				jButtonGuardarCambiosDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDetalleRequisicion")) {
				jButtonGuardarCambiosDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDetalleRequisicion")) {
				jButtonCopiarDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDetalleRequisicion")) {
				jButtonVerFormDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDetalleRequisicion")) {
				jButtonGuardarCambiosDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDetalleRequisicion")) {
				jButtonCopiarDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDetalleRequisicion")) {
				jButtonVerFormDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDetalleRequisicion")) {
				jButtonGuardarCambiosDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDetalleRequisicion")) {
				jButtonGuardarCambiosDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDetalleRequisicion")) {
				jButtonGuardarCambiosDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDetalleRequisicion")) {
				jButtonRecargarInformacionDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDetalleRequisicion")) {
				jButtonRecargarInformacionDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDetalleRequisicion")) {
				jButtonRecargarInformacionDetalleRequisicionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDetalleRequisicion")) {
				jButtonAnterioresDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDetalleRequisicion")) {
				jButtonAnterioresDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDetalleRequisicion")) {
				jButtonAnterioresDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDetalleRequisicion")) {
				jButtonSiguientesDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDetalleRequisicion")) {
				jButtonSiguientesDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDetalleRequisicion")) {
				jButtonSiguientesDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDetalleRequisicion") || sTipo.equals("MenuItemDetalleAbrirOrderByDetalleRequisicion")) {
				jButtonAbrirOrderByDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDetalleRequisicion") || sTipo.equals("MenuItemDetalleMostrarOcultarDetalleRequisicion")) {
				jButtonMostrarOcultarDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleRequisicion")) {
				jButtonNuevoGuardarCambiosDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDetalleRequisicion")) {
				jButtonNuevoGuardarCambiosDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDetalleRequisicion")) {
				jButtonNuevoGuardarCambiosDetalleRequisicionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDetalleRequisicion")) {
				jButtonCerrarReporteDinamicoDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDetalleRequisicion")) {
				jButtonGenerarReporteDinamicoDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDetalleRequisicion")) {
				
				jButtonGenerarExcelReporteDinamicoDetalleRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDetalleRequisicion")) {
				jButtonCerrarImportacionDetalleRequisicionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDetalleRequisicion")) {
				
				jButtonGenerarImportacionDetalleRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDetalleRequisicion")) {
				
				jButtonAbrirImportacionDetalleRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDetalleRequisicion")) {
				jComboBoxTiposAccionesDetalleRequisicionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDetalleRequisicion")) {
				jComboBoxTiposRelacionesDetalleRequisicionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDetalleRequisicion")) {
				jComboBoxTiposAccionesDetalleRequisicionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDetalleRequisicion")) {
				
				jComboBoxTiposSeleccionarDetalleRequisicionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDetalleRequisicion")) {
				jTextFieldValorCampoGeneralDetalleRequisicionActionListener(evt);
			}
			
			else if(sTipo.equals("AbrirTotalesDetalleRequisicion")) {
				jButtonAbrirTotalesDetalleRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTotalesDetalleRequisicion")) {
				jButtonCerrarTotalesDetalleRequisicionActionPerformed(evt);
			} 
			
			else if(sTipo.equals("AbrirOrderByDetalleRequisicion")) {
				jButtonAbrirOrderByDetalleRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDetalleRequisicion")) {
				jButtonAbrirOrderByDetalleRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDetalleRequisicion")) {
				jButtonCerrarOrderByDetalleRequisicionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleRequisicionBusqueda")) {
				this.jButtonidDetalleRequisicionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_requisicionDetalleRequisicionUpdate")) {
				this.jButtonid_requisicionDetalleRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_requisicionDetalleRequisicionBusqueda")) {
				this.jButtonid_requisicionDetalleRequisicionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetalleRequisicionUpdate")) {
				this.jButtonid_empresaDetalleRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetalleRequisicionBusqueda")) {
				this.jButtonid_empresaDetalleRequisicionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDetalleRequisicionUpdate")) {
				this.jButtonid_sucursalDetalleRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDetalleRequisicionBusqueda")) {
				this.jButtonid_sucursalDetalleRequisicionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioDetalleRequisicionUpdate")) {
				this.jButtonid_ejercicioDetalleRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioDetalleRequisicionBusqueda")) {
				this.jButtonid_ejercicioDetalleRequisicionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoDetalleRequisicionUpdate")) {
				this.jButtonid_periodoDetalleRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoDetalleRequisicionBusqueda")) {
				this.jButtonid_periodoDetalleRequisicionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioDetalleRequisicionUpdate")) {
				this.jButtonid_anioDetalleRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioDetalleRequisicionBusqueda")) {
				this.jButtonid_anioDetalleRequisicionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesDetalleRequisicionUpdate")) {
				this.jButtonid_mesDetalleRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesDetalleRequisicionBusqueda")) {
				this.jButtonid_mesDetalleRequisicionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaDetalleRequisicionUpdate")) {
				this.jButtonid_bodegaDetalleRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaDetalleRequisicionBusqueda")) {
				this.jButtonid_bodegaDetalleRequisicionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoDetalleRequisicion")) {
				this.jButtonid_productoDetalleRequisicionActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoDetalleRequisicionUpdate")) {
				this.jButtonid_productoDetalleRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoDetalleRequisicionBusqueda")) {
				this.jButtonid_productoDetalleRequisicionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadDetalleRequisicionUpdate")) {
				this.jButtonid_unidadDetalleRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadDetalleRequisicionBusqueda")) {
				this.jButtonid_unidadDetalleRequisicionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadDetalleRequisicionBusqueda")) {
				this.jButtoncantidadDetalleRequisicionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionDetalleRequisicionBusqueda")) {
				this.jButtondescripcionDetalleRequisicionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_autorizaDetalleRequisicionBusqueda")) {
				this.jButtonfecha_autorizaDetalleRequisicionBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_productoDetalleRequisicion")) {
				this.jButtonid_productoDetalleRequisicionActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdBodegaDetalleRequisicion")) {
				this.jButtonFK_IdBodegaDetalleRequisicionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdProductoDetalleRequisicion")) {
				this.jButtonFK_IdProductoDetalleRequisicionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdRequisicionDetalleRequisicion")) {
				this.jButtonFK_IdRequisicionDetalleRequisicionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdUnidadDetalleRequisicion")) {
				this.jButtonFK_IdUnidadDetalleRequisicionActionPerformed(evt);
			}
			
			;
			
			
			DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDetalleRequisicion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleRequisicionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallerequisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallerequisicion);
				
				DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
				
				


				
				DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleRequisicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleRequisicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DetalleRequisicion detallerequisicionLocal=null;
			
			if(!this.getEsControlTabla()) {
				detallerequisicionLocal=this.detallerequisicion;
			} else {
				detallerequisicionLocal=this.detallerequisicionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallerequisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallerequisicion);
				
				DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
							
				
				


				
				DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleRequisicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleRequisicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleRequisicionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleRequisicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionAnterior =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallerequisicionAnterior =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
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
			
			DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
			
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
			
			


			
			DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleRequisicionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallerequisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallerequisicion);
				
				DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
								
						
				


				
				DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleRequisicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleRequisicion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallerequisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallerequisicion);
				
				DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
								
				
				


				
				DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleRequisicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleRequisicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleRequisicionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleRequisicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionAnterior =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallerequisicionAnterior =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallerequisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallerequisicion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleRequisicionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleRequisicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionAnterior =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallerequisicionAnterior =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleRequisicionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallerequisicion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallerequisicion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallerequisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallerequisicion);
				
				DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
							
				
				


				
				DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleRequisicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleRequisicion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleRequisicionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleRequisicion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallerequisicionAnterior =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detallerequisicionAnterior =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
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
			
			DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
			
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
			
			


			
			DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleRequisicionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallerequisicion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallerequisicion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallerequisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallerequisicion);
				
				DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
								
				
				


				
				DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleRequisicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleRequisicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleRequisicionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleRequisicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionAnterior =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallerequisicionAnterior =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleRequisicionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallerequisicion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallerequisicion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleRequisicionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallerequisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallerequisicion);
				
				DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDetalleRequisicion")) {
					jCheckBoxSeleccionarTodosDetalleRequisicionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDetalleRequisicion")) {
					jCheckBoxSeleccionadosDetalleRequisicionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDetalleRequisicion")) {
					
				}
				
				


				
				
				DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleRequisicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleRequisicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.detallerequisicion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.detallerequisicion);
				
				DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
												
				
				


				
				
				DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleRequisicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleRequisicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleRequisicionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleRequisicion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallerequisicionAnterior =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detallerequisicionAnterior =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleRequisicionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallerequisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallerequisicion);
				
				DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
				
				
				DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
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
			
			DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
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
			
			


			if(sTipo.equals("id_bodegaDetalleRequisicion")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_bodegaDetalleRequisicion;
				}

				if(this.detallerequisicionSessionBean.getConGuardarRelaciones()) {
					//classes=DetalleRequisicionConstantesFunciones.getClassesRelationshipsOfDetalleRequisicion(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyBodega(jComboBoxGenerico,"Formulario");

				this.recargarFormDetalleRequisicion(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_bodegaFK_IdBodegaDetalleRequisicion")) {
				this.procesarActionsCombosForeignKeyBodega(jComboBoxid_bodegaFK_IdBodegaDetalleRequisicion,"FK_IdBodega");
				//recargarFormDetalleRequisicionBodega(jComboBoxid_bodegaFK_IdBodegaDetalleRequisicion,"FK_IdBodega");
			}
			 else if(sTipo.equals("id_productoDetalleRequisicion")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_productoDetalleRequisicion;
				}

				if(this.detallerequisicionSessionBean.getConGuardarRelaciones()) {
					//classes=DetalleRequisicionConstantesFunciones.getClassesRelationshipsOfDetalleRequisicion(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyProducto(jComboBoxGenerico,"Formulario");

				this.recargarFormDetalleRequisicion(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_productoFK_IdProductoDetalleRequisicion")) {
				this.procesarActionsCombosForeignKeyProducto(jComboBoxid_productoFK_IdProductoDetalleRequisicion,"FK_IdProducto");
				//recargarFormDetalleRequisicionProducto(jComboBoxid_productoFK_IdProductoDetalleRequisicion,"FK_IdProducto");
			}
			
			DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleRequisicionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallerequisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallerequisicion);
				
				DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_bodegaDetalleRequisicion")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_bodegaDetalleRequisicion;
				}

				if(this.detallerequisicionSessionBean.getConGuardarRelaciones()) {
					//classes=DetalleRequisicionConstantesFunciones.getClassesRelationshipsOfDetalleRequisicion(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyBodega(jComboBoxGenerico,"Formulario");

				this.recargarFormDetalleRequisicion(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_bodegaFK_IdBodegaDetalleRequisicion")) {
				this.procesarActionsCombosForeignKeyBodega(jComboBoxid_bodegaFK_IdBodegaDetalleRequisicion,"FK_IdBodega");
				//recargarFormDetalleRequisicionBodega(jComboBoxid_bodegaFK_IdBodegaDetalleRequisicion,"FK_IdBodega");
			}
			 else if(sTipo.equals("id_productoDetalleRequisicion")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_productoDetalleRequisicion;
				}

				if(this.detallerequisicionSessionBean.getConGuardarRelaciones()) {
					//classes=DetalleRequisicionConstantesFunciones.getClassesRelationshipsOfDetalleRequisicion(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyProducto(jComboBoxGenerico,"Formulario");

				this.recargarFormDetalleRequisicion(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_productoFK_IdProductoDetalleRequisicion")) {
				this.procesarActionsCombosForeignKeyProducto(jComboBoxid_productoFK_IdProductoDetalleRequisicion,"FK_IdProducto");
				//recargarFormDetalleRequisicionProducto(jComboBoxid_productoFK_IdProductoDetalleRequisicion,"FK_IdProducto");
			}
				
				DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleRequisicion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleRequisicion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallerequisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallerequisicion);
				
				DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
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
				
				


			if(sTipo.equals("id_bodegaDetalleRequisicion")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_bodegaDetalleRequisicion;
				}

				if(this.detallerequisicionSessionBean.getConGuardarRelaciones()) {
					//classes=DetalleRequisicionConstantesFunciones.getClassesRelationshipsOfDetalleRequisicion(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyBodega(jComboBoxGenerico,"Formulario");

				this.recargarFormDetalleRequisicion(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_bodegaFK_IdBodegaDetalleRequisicion")) {
				this.procesarActionsCombosForeignKeyBodega(jComboBoxid_bodegaFK_IdBodegaDetalleRequisicion,"FK_IdBodega");
				//recargarFormDetalleRequisicionBodega(jComboBoxid_bodegaFK_IdBodegaDetalleRequisicion,"FK_IdBodega");
			}
			 else if(sTipo.equals("id_productoDetalleRequisicion")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_productoDetalleRequisicion;
				}

				if(this.detallerequisicionSessionBean.getConGuardarRelaciones()) {
					//classes=DetalleRequisicionConstantesFunciones.getClassesRelationshipsOfDetalleRequisicion(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyProducto(jComboBoxGenerico,"Formulario");

				this.recargarFormDetalleRequisicion(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_productoFK_IdProductoDetalleRequisicion")) {
				this.procesarActionsCombosForeignKeyProducto(jComboBoxid_productoFK_IdProductoDetalleRequisicion,"FK_IdProducto");
				//recargarFormDetalleRequisicionProducto(jComboBoxid_productoFK_IdProductoDetalleRequisicion,"FK_IdProducto");
			}
				
				DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleRequisicion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleRequisicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleRequisicionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleRequisicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerequisicionAnterior =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallerequisicionAnterior =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDetalleRequisicion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDetalleRequisicionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDetalleRequisicion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.detallerequisicion =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.detallerequisicion =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.detallerequisicion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDetalleRequisicion")) {
				
				}
				
				DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDetalleRequisicion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDetalleRequisicion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDetalleRequisicion")) {
			
			}
			
			DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDetalleRequisicion();
			
			DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
			
			if(sTipo.equals("NuevoDetalleRequisicion")) {
				jButtonNuevoDetalleRequisicionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDetalleRequisicion")) {
				jButtonDuplicarDetalleRequisicionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDetalleRequisicion")) {
				jButtonCopiarDetalleRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDetalleRequisicion")) {
				jButtonVerFormDetalleRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDetalleRequisicion")) {
				jButtonNuevoDetalleRequisicionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDetalleRequisicion")) {
				jButtonModificarDetalleRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDetalleRequisicion")) {
				jButtonActualizarDetalleRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDetalleRequisicion")) {
				jButtonEliminarDetalleRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDetalleRequisicion")) {
				jButtonGuardarCambiosDetalleRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDetalleRequisicion")) {
				jButtonCancelarDetalleRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDetalleRequisicion")) {
				jButtonCerrarDetalleRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDetalleRequisicion")) {
				jButtonGuardarCambiosDetalleRequisicionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleRequisicion")) {
				jButtonNuevoGuardarCambiosDetalleRequisicionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDetalleRequisicion")) {
				jButtonAbrirOrderByDetalleRequisicionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDetalleRequisicion")) {
				jButtonRecargarInformacionDetalleRequisicionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDetalleRequisicion")) {
				jButtonAnterioresDetalleRequisicionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDetalleRequisicion")) {
				jButtonSiguientesDetalleRequisicionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleRequisicionBusqueda")) {
				this.jButtonidDetalleRequisicionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_requisicionDetalleRequisicionUpdate")) {
				this.jButtonid_requisicionDetalleRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_requisicionDetalleRequisicionBusqueda")) {
				this.jButtonid_requisicionDetalleRequisicionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetalleRequisicionUpdate")) {
				this.jButtonid_empresaDetalleRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetalleRequisicionBusqueda")) {
				this.jButtonid_empresaDetalleRequisicionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDetalleRequisicionUpdate")) {
				this.jButtonid_sucursalDetalleRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDetalleRequisicionBusqueda")) {
				this.jButtonid_sucursalDetalleRequisicionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioDetalleRequisicionUpdate")) {
				this.jButtonid_ejercicioDetalleRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioDetalleRequisicionBusqueda")) {
				this.jButtonid_ejercicioDetalleRequisicionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoDetalleRequisicionUpdate")) {
				this.jButtonid_periodoDetalleRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoDetalleRequisicionBusqueda")) {
				this.jButtonid_periodoDetalleRequisicionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioDetalleRequisicionUpdate")) {
				this.jButtonid_anioDetalleRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioDetalleRequisicionBusqueda")) {
				this.jButtonid_anioDetalleRequisicionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesDetalleRequisicionUpdate")) {
				this.jButtonid_mesDetalleRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesDetalleRequisicionBusqueda")) {
				this.jButtonid_mesDetalleRequisicionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaDetalleRequisicionUpdate")) {
				this.jButtonid_bodegaDetalleRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaDetalleRequisicionBusqueda")) {
				this.jButtonid_bodegaDetalleRequisicionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoDetalleRequisicion")) {
				this.jButtonid_productoDetalleRequisicionActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoDetalleRequisicionUpdate")) {
				this.jButtonid_productoDetalleRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoDetalleRequisicionBusqueda")) {
				this.jButtonid_productoDetalleRequisicionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadDetalleRequisicionUpdate")) {
				this.jButtonid_unidadDetalleRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadDetalleRequisicionBusqueda")) {
				this.jButtonid_unidadDetalleRequisicionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadDetalleRequisicionBusqueda")) {
				this.jButtoncantidadDetalleRequisicionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionDetalleRequisicionBusqueda")) {
				this.jButtondescripcionDetalleRequisicionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_autorizaDetalleRequisicionBusqueda")) {
				this.jButtonfecha_autorizaDetalleRequisicionBusquedaActionPerformed(evt);
			}
			
			DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDetalleRequisicion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDetalleRequisicion")) {
				closingInternalFrameDetalleRequisicion();
				
			} else if(sTipo.equals("jButtonCancelarDetalleRequisicion")) {
				JInternalFrameBase jInternalFrameDetalleFormDetalleRequisicion = (JInternalFrameBase)evt.getSource();
	            	
	            DetalleRequisicionBeanSwingJInternalFrame jInternalFrameParent=(DetalleRequisicionBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleRequisicion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDetalleRequisicionActionPerformed(null);
			}
			
			DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detallerequisicion,new Object(),this.detallerequisicionParameterGeneral,this.detallerequisicionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDetalleRequisicion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDetalleRequisicion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDetalleRequisicion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.detallerequisicion)) {
			if(!esControlTabla) {
				if(DetalleRequisicionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.detallerequisicion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);			
				}
				
				if(this.detallerequisicionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDetalleRequisicion(this.detallerequisicion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detallerequisicionReturnGeneral=detallerequisicionLogic.procesarEventosDetalleRequisicionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallerequisicionLogic.getDetalleRequisicions(),this.detallerequisicion,this.detallerequisicionParameterGeneral,this.isEsNuevoDetalleRequisicion,classes);//this.detallerequisicionLogic.getDetalleRequisicion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDetalleRequisicion(this.detallerequisicionReturnGeneral,this.detallerequisicionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.detallerequisicionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDetalleRequisicion(classes,this.detallerequisicionReturnGeneral,this.detallerequisicionBean,false);
					}
						
					if(this.detallerequisicionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDetalleRequisicion(this.detallerequisicionReturnGeneral.getDetalleRequisicion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDetalleRequisicion(this.detallerequisicionReturnGeneral.getDetalleRequisicion());	
					}
						
					if(this.detallerequisicionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDetalleRequisicion(this.detallerequisicionReturnGeneral.getDetalleRequisicion(),classes);//this.detallerequisicionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDetalleRequisicion(this.detallerequisicion,classes);//this.detallerequisicionBean);									
				}
			
				if(DetalleRequisicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDetalleRequisicion(this.detallerequisicion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRequisicion(this.detallerequisicion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.detallerequisicionAnterior!=null) {
						this.detallerequisicion=this.detallerequisicionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detallerequisicionReturnGeneral=detallerequisicionLogic.procesarEventosDetalleRequisicionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallerequisicionLogic.getDetalleRequisicions(),this.detallerequisicion,this.detallerequisicionParameterGeneral,this.isEsNuevoDetalleRequisicion,classes);//this.detallerequisicionLogic.getDetalleRequisicion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detallerequisicionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detallerequisicionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.detallerequisicionReturnGeneral.getDetalleRequisicion(),detallerequisicionLogic.getDetalleRequisicions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.detallerequisicionReturnGeneral.getDetalleRequisicion(),this.detallerequisicions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDetalleRequisicion.repaint();
				
				//((AbstractTableModel) this.jTableDatosDetalleRequisicion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDetalleRequisicion();
			}
		}
	}
	
	public void actualizarVisualTableDatosDetalleRequisicion() throws Exception {
		
		DetalleRequisicionModel detallerequisicionModel=(DetalleRequisicionModel)this.jTableDatosDetalleRequisicion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallerequisicionModel.detallerequisicions=this.detallerequisicionLogic.getDetalleRequisicions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			detallerequisicionModel.detallerequisicions=this.detallerequisicions;
		}
		
		
		((DetalleRequisicionModel) this.jTableDatosDetalleRequisicion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDetalleRequisicion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdetallerequisicionAnterior(),this.detallerequisicionLogic.getDetalleRequisicions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdetallerequisicionAnterior(),this.detallerequisicions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDetalleRequisicion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDetalleRequisicion(DetalleRequisicion detallerequisicion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
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
										
				DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallerequisicion,new Object(),generalEntityParameterGeneral,this.detallerequisicionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.detallerequisicionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DetalleRequisicionConstantesFunciones.getClassesRelationshipsOfDetalleRequisicion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DetalleRequisicionConstantesFunciones.getClassesRelationshipsFromStringsOfDetalleRequisicion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDetalleRequisicion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DetalleRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallerequisicion,new Object(),generalEntityParameterGeneral,this.detallerequisicionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDetalleRequisicion(DetalleRequisicionBean detallerequisicionBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDetalleRequisicion(ArrayList<Classe> classes,DetalleRequisicionReturnGeneral detallerequisicionReturnGeneral,DetalleRequisicionBean detallerequisicionBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDetalleRequisicion(DetalleRequisicion detallerequisicion,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.detallerequisicion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDetalleRequisicion = new DetalleRequisicionDetalleFormJInternalFrame(jDesktopPane,this.detallerequisicionSessionBean.getConGuardarRelaciones(),this.detallerequisicionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleRequisicion);
		this.jInternalFrameDetalleFormDetalleRequisicion.setVisible(false);
		this.jInternalFrameDetalleFormDetalleRequisicion.setSelected(false);						
		
		this.jInternalFrameDetalleFormDetalleRequisicion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDetalleRequisicion.detallerequisicionLogic=this.detallerequisicionLogic;
		
		this.cargarCombosFrameForeignKeyDetalleRequisicion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleRequisicion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleRequisicion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDetalleRequisicion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDetalleRequisicion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDetalleRequisicion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleRequisicion"));
		
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonModificarDetalleRequisicion.addActionListener(new ButtonActionListener(this,"ModificarDetalleRequisicion"));

		
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonModificarToolBarDetalleRequisicion.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleRequisicion"));
					
		this.jInternalFrameDetalleFormDetalleRequisicion.jMenuItemModificarDetalleRequisicion.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleRequisicion"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonActualizarDetalleRequisicion.addActionListener (new ButtonActionListener(this,"ActualizarDetalleRequisicion"));
		
		
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonActualizarToolBarDetalleRequisicion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleRequisicion"));
						
		this.jInternalFrameDetalleFormDetalleRequisicion.jMenuItemActualizarDetalleRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleRequisicion"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonEliminarDetalleRequisicion.addActionListener (new ButtonActionListener(this,"EliminarDetalleRequisicion"));
		
		
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonEliminarToolBarDetalleRequisicion.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleRequisicion"));
								
		this.jInternalFrameDetalleFormDetalleRequisicion.jMenuItemEliminarDetalleRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleRequisicion"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonCancelarDetalleRequisicion.addActionListener (new ButtonActionListener(this,"CancelarDetalleRequisicion"));
		
		
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonCancelarToolBarDetalleRequisicion.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleRequisicion"));
					
		this.jInternalFrameDetalleFormDetalleRequisicion.jMenuItemCancelarDetalleRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleRequisicion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDetalleRequisicion.jMenuItemDetalleCerrarDetalleRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleRequisicion"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonGuardarCambiosToolBarDetalleRequisicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleRequisicion"));
		
		
		
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonGuardarCambiosToolBarDetalleRequisicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleRequisicion"));
		
		
		
		this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxTiposAccionesFormularioDetalleRequisicion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleRequisicion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonidDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_requisicionDetalleRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_requisicionDetalleRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_requisicionDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_requisicionDetalleRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_empresaDetalleRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_empresaDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_sucursalDetalleRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_sucursalDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_ejercicioDetalleRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioDetalleRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_ejercicioDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioDetalleRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_periodoDetalleRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_periodoDetalleRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_periodoDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoDetalleRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_anioDetalleRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_anioDetalleRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_anioDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_anioDetalleRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_mesDetalleRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_mesDetalleRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_mesDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_mesDetalleRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_bodegaDetalleRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaDetalleRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_bodegaDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaDetalleRequisicionBusqueda"));
		//jButtonid_productoDetalleRequisicion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoDetalleRequisicionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_productoDetalleRequisicion.addActionListener(new ButtonActionListener(this,"id_productoDetalleRequisicion"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_productoDetalleRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_productoDetalleRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_productoDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_productoDetalleRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_unidadDetalleRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_unidadDetalleRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_unidadDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadDetalleRequisicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtoncantidadDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"cantidadDetalleRequisicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtondescripcionDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDetalleRequisicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonfecha_autorizaDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"fecha_autorizaDetalleRequisicionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDetalleRequisicion.jTabbedPaneRelacionesDetalleRequisicion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleRequisicion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDetalleRequisicion"));
		
		if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRequisicion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleRequisicion"));
		}
		
		this.jTableDatosDetalleRequisicion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDetalleRequisicion"));
		
		this.jTableDatosDetalleRequisicion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDetalleRequisicion"));
		
		this.jButtonNuevoDetalleRequisicion.addActionListener(new ButtonActionListener(this,"NuevoDetalleRequisicion"));
		
		this.jButtonDuplicarDetalleRequisicion.addActionListener(new ButtonActionListener(this,"DuplicarDetalleRequisicion"));
		
		this.jButtonCopiarDetalleRequisicion.addActionListener(new ButtonActionListener(this,"CopiarDetalleRequisicion"));
		
		this.jButtonVerFormDetalleRequisicion.addActionListener(new ButtonActionListener(this,"VerFormDetalleRequisicion"));
		
		
		this.jButtonNuevoToolBarDetalleRequisicion.addActionListener(new ButtonActionListener(this,"NuevoToolBarDetalleRequisicion"));
			
		this.jButtonDuplicarToolBarDetalleRequisicion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDetalleRequisicion"));
			
		this.jMenuItemNuevoDetalleRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDetalleRequisicion"));
			
		this.jMenuItemDuplicarDetalleRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDetalleRequisicion"));		
		
		
		this.jButtonNuevoRelacionesDetalleRequisicion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDetalleRequisicion"));
		
		
		this.jButtonNuevoRelacionesToolBarDetalleRequisicion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDetalleRequisicion"));
			
		this.jMenuItemNuevoRelacionesDetalleRequisicion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDetalleRequisicion"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRequisicion.jButtonModificarDetalleRequisicion.addActionListener(new ButtonActionListener(this,"ModificarDetalleRequisicion"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRequisicion.jButtonModificarToolBarDetalleRequisicion.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleRequisicion"));
			
			this.jInternalFrameDetalleFormDetalleRequisicion.jMenuItemModificarDetalleRequisicion.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleRequisicion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDetalleRequisicion.jButtonActualizarDetalleRequisicion.addActionListener (new ButtonActionListener(this,"ActualizarDetalleRequisicion"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRequisicion.jButtonActualizarToolBarDetalleRequisicion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleRequisicion"));
				
			this.jInternalFrameDetalleFormDetalleRequisicion.jMenuItemActualizarDetalleRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleRequisicion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRequisicion.jButtonEliminarDetalleRequisicion.addActionListener (new ButtonActionListener(this,"EliminarDetalleRequisicion"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRequisicion.jButtonEliminarToolBarDetalleRequisicion.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleRequisicion"));
						
			this.jInternalFrameDetalleFormDetalleRequisicion.jMenuItemEliminarDetalleRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleRequisicion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRequisicion.jButtonCancelarDetalleRequisicion.addActionListener (new ButtonActionListener(this,"CancelarDetalleRequisicion"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRequisicion.jButtonCancelarToolBarDetalleRequisicion.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleRequisicion"));
			
			this.jInternalFrameDetalleFormDetalleRequisicion.jMenuItemCancelarDetalleRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleRequisicion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDetalleRequisicion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDetalleRequisicion"));		
		
		
		this.jButtonCerrarDetalleRequisicion.addActionListener (new ButtonActionListener(this,"CerrarDetalleRequisicion"));
		
		
		this.jButtonCerrarToolBarDetalleRequisicion.addActionListener (new ButtonActionListener(this,"CerrarToolBarDetalleRequisicion"));
			
		this.jMenuItemCerrarDetalleRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDetalleRequisicion"));
			
		if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRequisicion.jMenuItemDetalleCerrarDetalleRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleRequisicion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRequisicion.jButtonGuardarCambiosDetalleRequisicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosDetalleRequisicion"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRequisicion.jButtonGuardarCambiosToolBarDetalleRequisicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleRequisicion"));
		}
		
		this.jButtonCopiarToolBarDetalleRequisicion.addActionListener (new ButtonActionListener(this,"CopiarToolBarDetalleRequisicion"));
			
		this.jButtonVerFormToolBarDetalleRequisicion.addActionListener (new ButtonActionListener(this,"VerFormToolBarDetalleRequisicion"));
		
		this.jMenuItemGuardarCambiosDetalleRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDetalleRequisicion"));
			
		this.jMenuItemCopiarDetalleRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDetalleRequisicion"));		
		
		this.jMenuItemVerFormDetalleRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDetalleRequisicion"));		
		
		
		this.jButtonGuardarCambiosTablaDetalleRequisicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleRequisicion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleRequisicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDetalleRequisicion"));
			
		this.jMenuItemGuardarCambiosTablaDetalleRequisicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleRequisicion"));		
		
		
		
		this.jButtonRecargarInformacionDetalleRequisicion.addActionListener (new ButtonActionListener(this,"RecargarInformacionDetalleRequisicion"));
					
		this.jButtonRecargarInformacionToolBarDetalleRequisicion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDetalleRequisicion"));
		
		this.jMenuItemRecargarInformacionDetalleRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDetalleRequisicion"));		
		
		
		
		this.jButtonAnterioresDetalleRequisicion.addActionListener (new ButtonActionListener(this,"AnterioresDetalleRequisicion"));
		
		
		this.jButtonAnterioresToolBarDetalleRequisicion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDetalleRequisicion"));
		
		this.jMenuItemAnterioresDetalleRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDetalleRequisicion"));		
		
		
		this.jButtonSiguientesDetalleRequisicion.addActionListener (new ButtonActionListener(this,"SiguientesDetalleRequisicion"));
		
		
		this.jButtonSiguientesToolBarDetalleRequisicion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDetalleRequisicion"));
			
		this.jMenuItemSiguientesDetalleRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDetalleRequisicion"));
			
		this.jMenuItemAbrirOrderByDetalleRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDetalleRequisicion"));
			
		this.jMenuItemMostrarOcultarDetalleRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDetalleRequisicion"));
			
		this.jMenuItemDetalleAbrirOrderByDetalleRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDetalleRequisicion"));
			
		this.jMenuItemDetalleMostarOcultarDetalleRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDetalleRequisicion"));		
		
		
		this.jButtonNuevoGuardarCambiosDetalleRequisicion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDetalleRequisicion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleRequisicion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDetalleRequisicion"));
			
		this.jMenuItemNuevoGuardarCambiosDetalleRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDetalleRequisicion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDetalleRequisicion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDetalleRequisicion"));

		this.jCheckBoxSeleccionadosDetalleRequisicion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDetalleRequisicion"));
		
		if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxTiposAccionesFormularioDetalleRequisicion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleRequisicion"));
		}
		
		
		this.jComboBoxTiposRelacionesDetalleRequisicion.addActionListener (new ButtonActionListener(this,"TiposRelacionesDetalleRequisicion"));
			
		this.jComboBoxTiposAccionesDetalleRequisicion.addActionListener (new ButtonActionListener(this,"TiposAccionesDetalleRequisicion"));
					
		this.jComboBoxTiposSeleccionarDetalleRequisicion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDetalleRequisicion"));
			
		this.jTextFieldValorCampoGeneralDetalleRequisicion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDetalleRequisicion"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonidDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_requisicionDetalleRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_requisicionDetalleRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_requisicionDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_requisicionDetalleRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_empresaDetalleRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_empresaDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_sucursalDetalleRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_sucursalDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_ejercicioDetalleRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioDetalleRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_ejercicioDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioDetalleRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_periodoDetalleRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_periodoDetalleRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_periodoDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoDetalleRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_anioDetalleRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_anioDetalleRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_anioDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_anioDetalleRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_mesDetalleRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_mesDetalleRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_mesDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_mesDetalleRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_bodegaDetalleRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaDetalleRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_bodegaDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaDetalleRequisicionBusqueda"));
		//jButtonid_productoDetalleRequisicion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoDetalleRequisicionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_productoDetalleRequisicion.addActionListener(new ButtonActionListener(this,"id_productoDetalleRequisicion"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_productoDetalleRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_productoDetalleRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_productoDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_productoDetalleRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_unidadDetalleRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_unidadDetalleRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_unidadDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadDetalleRequisicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtoncantidadDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"cantidadDetalleRequisicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtondescripcionDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDetalleRequisicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonfecha_autorizaDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"fecha_autorizaDetalleRequisicionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdBodegaDetalleRequisicion.addActionListener(new ButtonActionListener(this,"FK_IdBodegaDetalleRequisicion"));

			this.jButtonFK_IdProductoDetalleRequisicion.addActionListener(new ButtonActionListener(this,"FK_IdProductoDetalleRequisicion"));

			this.jButtonBuscarFK_IdProductoid_productoDetalleRequisicion.addActionListener(new ButtonActionListener(this,"id_productoDetalleRequisicion"));

			this.jButtonFK_IdRequisicionDetalleRequisicion.addActionListener(new ButtonActionListener(this,"FK_IdRequisicionDetalleRequisicion"));

			this.jButtonFK_IdUnidadDetalleRequisicion.addActionListener(new ButtonActionListener(this,"FK_IdUnidadDetalleRequisicion"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDetalleRequisicion!=null) {
				this.jInternalFrameReporteDinamicoDetalleRequisicion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleRequisicion"));
				this.jInternalFrameReporteDinamicoDetalleRequisicion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleRequisicion"));
				this.jInternalFrameReporteDinamicoDetalleRequisicion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleRequisicion"));
			}
			
			//this.jButtonCerrarReporteDinamicoDetalleRequisicion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleRequisicion"));				
			//this.jButtonGenerarReporteDinamicoDetalleRequisicion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleRequisicion"));
			//this.jButtonGenerarExcelReporteDinamicoDetalleRequisicion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleRequisicion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDetalleRequisicion!=null) {
				this.jInternalFrameImportacionDetalleRequisicion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleRequisicion"));
				this.jInternalFrameImportacionDetalleRequisicion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleRequisicion"));
				this.jInternalFrameImportacionDetalleRequisicion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleRequisicion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDetalleRequisicion.addActionListener (new ButtonActionListener(this,"AbrirOrderByDetalleRequisicion"));
			
			this.jButtonAbrirOrderByToolBarDetalleRequisicion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDetalleRequisicion"));			
			
			if(this.jInternalFrameOrderByDetalleRequisicion!=null) {
				this.jInternalFrameOrderByDetalleRequisicion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleRequisicion"));				
			}
			
			
		}
		
		this.jButtonAbrirTotalesDetalleRequisicion.addActionListener (new ButtonActionListener(this,"AbrirTotalesDetalleRequisicion"));
		
		if(this.jInternalFrameTotalesDetalleRequisicion!=null) {
			this.jInternalFrameTotalesDetalleRequisicion.getjButtonCerrarTotales().addActionListener (new ButtonActionListener(this,"CerrarTotalesDetalleRequisicion"));
		}
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRequisicion.jTabbedPaneRelacionesDetalleRequisicion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleRequisicion"));
		
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
            		closingInternalFrameDetalleRequisicion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDetalleRequisicion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDetalleRequisicion = (JInternalFrameBase)event.getSource();
	            	
	            DetalleRequisicionBeanSwingJInternalFrame jInternalFrameParent=(DetalleRequisicionBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleRequisicion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDetalleRequisicionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDetalleRequisicion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDetalleRequisicionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDetalleRequisicion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDetalleRequisicion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleRequisicionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleRequisicionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleRequisicionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDetalleRequisicion";
		inputMap = this.jButtonNuevoDetalleRequisicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDetalleRequisicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleRequisicionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleRequisicionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleRequisicionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleRequisicionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDetalleRequisicion";
		inputMap = this.jButtonNuevoRelacionesDetalleRequisicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDetalleRequisicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleRequisicionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDetalleRequisicion";
		inputMap = this.jButtonModificarDetalleRequisicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDetalleRequisicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDetalleRequisicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDetalleRequisicion";
		inputMap = this.jButtonActualizarDetalleRequisicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDetalleRequisicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDetalleRequisicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDetalleRequisicion";
		inputMap = this.jButtonEliminarDetalleRequisicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDetalleRequisicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDetalleRequisicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDetalleRequisicion";
		inputMap = this.jButtonCancelarDetalleRequisicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDetalleRequisicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDetalleRequisicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDetalleRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDetalleRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDetalleRequisicion";
		inputMap = this.jButtonCerrarDetalleRequisicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDetalleRequisicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDetalleRequisicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonGuardarCambiosDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDetalleRequisicion";
		inputMap = this.jInternalFrameDetalleFormDetalleRequisicion.jButtonGuardarCambiosDetalleRequisicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonGuardarCambiosDetalleRequisicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDetalleRequisicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDetalleRequisicion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDetalleRequisicionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDetalleRequisicion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDetalleRequisicionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDetalleRequisicion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDetalleRequisicionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDetalleRequisicion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDetalleRequisicionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonidDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_requisicionDetalleRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_requisicionDetalleRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_requisicionDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_requisicionDetalleRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_empresaDetalleRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_empresaDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_sucursalDetalleRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_sucursalDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_ejercicioDetalleRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioDetalleRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_ejercicioDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioDetalleRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_periodoDetalleRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_periodoDetalleRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_periodoDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoDetalleRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_anioDetalleRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_anioDetalleRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_anioDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_anioDetalleRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_mesDetalleRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_mesDetalleRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_mesDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_mesDetalleRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_bodegaDetalleRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaDetalleRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_bodegaDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaDetalleRequisicionBusqueda"));
		//jButtonid_productoDetalleRequisicion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoDetalleRequisicionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_productoDetalleRequisicion.addActionListener(new ButtonActionListener(this,"id_productoDetalleRequisicion"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_productoDetalleRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_productoDetalleRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_productoDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_productoDetalleRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_unidadDetalleRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_unidadDetalleRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_unidadDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadDetalleRequisicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtoncantidadDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"cantidadDetalleRequisicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtondescripcionDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDetalleRequisicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRequisicion.jButtonfecha_autorizaDetalleRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"fecha_autorizaDetalleRequisicionBusqueda"));
		
		
		this.jButtonFK_IdBodegaDetalleRequisicion.addActionListener(new ButtonActionListener(this,"FK_IdBodegaDetalleRequisicion"));

		this.jButtonFK_IdProductoDetalleRequisicion.addActionListener(new ButtonActionListener(this,"FK_IdProductoDetalleRequisicion"));

		this.jButtonBuscarFK_IdProductoid_productoDetalleRequisicion.addActionListener(new ButtonActionListener(this,"id_productoDetalleRequisicion"));

		this.jButtonFK_IdRequisicionDetalleRequisicion.addActionListener(new ButtonActionListener(this,"FK_IdRequisicionDetalleRequisicion"));

		this.jButtonFK_IdUnidadDetalleRequisicion.addActionListener(new ButtonActionListener(this,"FK_IdUnidadDetalleRequisicion"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDetalleRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDetalleRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDetalleRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDetalleRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDetalleRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDetalleRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDetalleRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDetalleRequisicionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDetalleRequisicion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDetalleRequisicion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DetalleRequisicion detallerequisicionAux:this.detallerequisicionLogic.getDetalleRequisicions()) {
					detallerequisicionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleRequisicion detallerequisicionAux:detallerequisicions) {
					detallerequisicionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDetalleRequisicionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleRequisicion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleRequisicion detallerequisicionAux:this.detallerequisicionLogic.getDetalleRequisicions()) {
						detallerequisicionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleRequisicion detallerequisicionAux:detallerequisicions) {
						detallerequisicionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DetalleRequisicion detallerequisicionAux:this.detallerequisicionLogic.getDetalleRequisicions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleRequisicion detallerequisicionAux:detallerequisicions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleRequisicion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleRequisicion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleRequisicion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleRequisicion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDetalleRequisicionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleRequisicion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDetalleRequisicion.getSelectedRows();
			
			DetalleRequisicion detallerequisicionLocal=new DetalleRequisicion();
			
			//this.seleccionarTodosDetalleRequisicion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallerequisicionLocal =(DetalleRequisicion) this.detallerequisicionLogic.getDetalleRequisicions().toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					detallerequisicionLocal =(DetalleRequisicion) this.detallerequisicions.toArray()[this.jTableDatosDetalleRequisicion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				detallerequisicionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleRequisicion detallerequisicionAux:this.detallerequisicionLogic.getDetalleRequisicions()) {
						detallerequisicionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleRequisicion detallerequisicionAux:detallerequisicions) {
						detallerequisicionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDetalleRequisicion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleRequisicion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleRequisicion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleRequisicion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDetalleRequisicionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDetalleRequisicionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDetalleRequisicionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDetalleRequisicion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDetalleRequisicion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleRequisicion detallerequisicionAux:this.detallerequisicionLogic.getDetalleRequisicions()) {
				
						if(sTipoSeleccionar.equals(DetalleRequisicionConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							detallerequisicionAux.setcantidad(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleRequisicionConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							detallerequisicionAux.setdescripcion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetalleRequisicionConstantesFunciones.LABEL_FECHAAUTORIZA)) {
							existe=true;
							detallerequisicionAux.setfecha_autoriza(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleRequisicion detallerequisicionAux:detallerequisicions) {
					
						if(sTipoSeleccionar.equals(DetalleRequisicionConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							detallerequisicionAux.setcantidad(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleRequisicionConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							detallerequisicionAux.setdescripcion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetalleRequisicionConstantesFunciones.LABEL_FECHAAUTORIZA)) {
							existe=true;
							detallerequisicionAux.setfecha_autoriza(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleRequisicion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDetalleRequisicionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDetalleRequisicion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDetalleRequisicion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDetalleRequisicion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxTiposAccionesFormularioDetalleRequisicion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDetalleRequisicion) {				
					conSplash=true;//false;										
					
					//this.startProcessDetalleRequisicion(conSplash);
				
					this.generarReporteDetalleRequisicionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleRequisicion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxTiposAccionesFormularioDetalleRequisicion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDetalleRequisicionsSeleccionados();
				//this.jComboBoxTiposAccionesDetalleRequisicion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleRequisicionsSeleccionados(false);
				//this.jComboBoxTiposAccionesDetalleRequisicion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleRequisicionsSeleccionados(true);
				//this.jComboBoxTiposAccionesDetalleRequisicion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleRequisicion();
				
				this.exportarDetalleRequisicionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleRequisicion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxTiposAccionesFormularioDetalleRequisicion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDetalleRequisicions();
				//this.importarDetalleRequisicions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleRequisicion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxTiposAccionesFormularioDetalleRequisicion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleRequisicion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDetalleRequisicionsSeleccionados();
				//this.jComboBoxTiposAccionesDetalleRequisicion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Detalle Requisicion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDetalleRequisicion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDetalleRequisicion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDetalleRequisicion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Requisicion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleRequisicion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxTiposAccionesFormularioDetalleRequisicion.setSelectedIndex(0);					
				}	
			} 			
			else if(DetalleRequisicionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDetalleRequisicion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDetalleRequisicion(conSplash);
					
						//this.actualizarParametrosGeneralDetalleRequisicion();
						
						this.generarReporteProcesoAccionDetalleRequisicionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDetalleRequisicion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxTiposAccionesFormularioDetalleRequisicion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DetalleRequisicionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Detalle RequisicionS SELECCIONADOS?", "MANTENIMIENTO DE Detalle Requisicion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDetalleRequisicion();
				
						this.actualizarParametrosGeneralDetalleRequisicion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.detallerequisicionReturnGeneral=detallerequisicionLogic.procesarAccionDetalleRequisicionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.detallerequisicionLogic.getDetalleRequisicions(),this.detallerequisicionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDetalleRequisicionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleRequisicion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxTiposAccionesFormularioDetalleRequisicion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDetalleRequisicion();
					
					DetalleRequisicionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDetalleRequisicionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleRequisicion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxTiposAccionesFormularioDetalleRequisicion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDetalleRequisicion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDetalleRequisicionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDetalleRequisicion();
			
			if(this.jInternalFrameDetalleFormDetalleRequisicion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DetalleRequisicion> detallerequisicionsSeleccionados=new ArrayList<DetalleRequisicion>();		
			DetalleRequisicion detallerequisicion=new DetalleRequisicion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDetalleRequisicion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDetalleRequisicion.getSelectedItem();
			
			
			
			
			detallerequisicionsSeleccionados=this.getDetalleRequisicionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(detallerequisicionsSeleccionados.size()==1) {
				for(DetalleRequisicion detallerequisicionAux:detallerequisicionsSeleccionados) {
					detallerequisicion=detallerequisicionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDetalleRequisicion();
			
      		//this.finishProcessDetalleRequisicion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDetalleRequisicionReturnGeneral() throws Exception {
		if(this.detallerequisicionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.detallerequisicionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.detallerequisicionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.detallerequisicionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.detallerequisicionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.detallerequisicionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDetalleRequisicion(false);
		}
		
		if(this.detallerequisicionReturnGeneral.getConRetornoLista() || this.detallerequisicionReturnGeneral.getConRetornoObjeto()) {
			if(this.detallerequisicionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detallerequisicionLogic.setDetalleRequisicions(this.detallerequisicionReturnGeneral.getDetalleRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.detallerequisicionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detallerequisicionLogic.setDetalleRequisicion(this.detallerequisicionReturnGeneral.getDetalleRequisicion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingDetalleRequisicion(false);
		}
	}
	
	public void actualizarParametrosGeneralDetalleRequisicion() throws Exception {
		
		
	}
	
	public ArrayList<DetalleRequisicion> getDetalleRequisicionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DetalleRequisicion> detallerequisicionsSeleccionados=new ArrayList<DetalleRequisicion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDetalleRequisicion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DetalleRequisicion detallerequisicionAux:detallerequisicionLogic.getDetalleRequisicions()) {
					if(detallerequisicionAux.getIsSelected()) {
						detallerequisicionsSeleccionados.add(detallerequisicionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleRequisicion detallerequisicionAux:this.detallerequisicions) {
					if(detallerequisicionAux.getIsSelected()) {
						detallerequisicionsSeleccionados.add(detallerequisicionAux);				
					}
				}
			}
			
			if(detallerequisicionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						detallerequisicionsSeleccionados.addAll(this.detallerequisicionLogic.getDetalleRequisicions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						detallerequisicionsSeleccionados.addAll(this.detallerequisicions);				
					}
				}
			}
		} else {
			detallerequisicionsSeleccionados.add(this.detallerequisicion);
		}
		
		return detallerequisicionsSeleccionados;
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
	
	public void generarReporteDetalleRequisicionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDetalleRequisicionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDetalleRequisicionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleRequisicionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleRequisicionsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Detalle Requisicion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDetalleRequisicionsSeleccionados() throws Exception {
		ArrayList<DetalleRequisicion> detallerequisicionsSeleccionados=new ArrayList<DetalleRequisicion>();		
		
		detallerequisicionsSeleccionados=this.getDetalleRequisicionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDetalleRequisicions("Todos",detallerequisicionsSeleccionados);
		
	}	
	
	public void generarReporteNormalDetalleRequisicionsSeleccionados() throws Exception {
		ArrayList<DetalleRequisicion> detallerequisicionsSeleccionados=new ArrayList<DetalleRequisicion>();		
		
		detallerequisicionsSeleccionados=this.getDetalleRequisicionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDetalleRequisicions("Todos",detallerequisicionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDetalleRequisicionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DetalleRequisicion> detallerequisicionsSeleccionados=new ArrayList<DetalleRequisicion>();
		
		detallerequisicionsSeleccionados=this.getDetalleRequisicionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDetalleRequisicions("Todos",detallerequisicionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDetalleRequisicionsSeleccionados() throws Exception {
		ArrayList<DetalleRequisicion> detallerequisicionsSeleccionados=new ArrayList<DetalleRequisicion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDetalleRequisicion();
		
		
		detallerequisicionsSeleccionados=this.getDetalleRequisicionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDetalleRequisicion();
		
		
		//this.generarReporteDetalleRequisicions("Todos",detallerequisicionsSeleccionados ,detallerequisicionImplementable,detallerequisicionImplementableHome);
	}
	
	public void mostrarImportacionDetalleRequisicions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDetalleRequisicion();
		
		this.abrirFrameImportacionDetalleRequisicion();		
		
			
		//this.generarReporteDetalleRequisicions("Todos",detallerequisicionsSeleccionados ,detallerequisicionImplementable,detallerequisicionImplementableHome);
	}
	
	public void importarDetalleRequisicions() throws Exception {		
	
	}
	
	public void exportarDetalleRequisicionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDetalleRequisicionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDetalleRequisicionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDetalleRequisicionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Detalle Requisicion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDetalleRequisicionsSeleccionados() throws Exception {
		ArrayList<DetalleRequisicion> detallerequisicionsSeleccionados=new ArrayList<DetalleRequisicion>();		
		
		detallerequisicionsSeleccionados=this.getDetalleRequisicionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallerequisicion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDetalleRequisicion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DetalleRequisicion detallerequisicionAux:detallerequisicionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDetalleRequisicion(detallerequisicionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//detallerequisicionAux.setsDetalleGeneralEntityReporte(detallerequisicionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Requisicion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDetalleRequisicion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DetalleRequisicionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleRequisicionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleRequisicionConstantesFunciones.LABEL_IDREQUISICION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleRequisicionConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleRequisicionConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleRequisicionConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleRequisicionConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleRequisicionConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleRequisicionConstantesFunciones.LABEL_IDMES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleRequisicionConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleRequisicionConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleRequisicionConstantesFunciones.LABEL_IDUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleRequisicionConstantesFunciones.LABEL_CANTIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleRequisicionConstantesFunciones.LABEL_DESCRIPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleRequisicionConstantesFunciones.LABEL_FECHAAUTORIZA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDetalleRequisicion(DetalleRequisicion detallerequisicion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=detallerequisicion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=detallerequisicion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallerequisicion.getrequisicion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallerequisicion.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallerequisicion.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallerequisicion.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallerequisicion.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallerequisicion.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallerequisicion.getmes_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallerequisicion.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallerequisicion.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallerequisicion.getunidad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallerequisicion.getcantidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallerequisicion.getdescripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallerequisicion.getfecha_autoriza().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDetalleRequisicionsSeleccionados() throws Exception {
		ArrayList<DetalleRequisicion> detallerequisicionsSeleccionados=new ArrayList<DetalleRequisicion>();		
		
		detallerequisicionsSeleccionados=this.getDetalleRequisicionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallerequisicion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DetalleRequisicions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDetalleRequisicion(row);				
				iRow++;
			}				
			
			for(DetalleRequisicion detallerequisicionAux:detallerequisicionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDetalleRequisicion(detallerequisicionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Requisicion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDetalleRequisicionsSeleccionados() throws Exception {
		ArrayList<DetalleRequisicion> detallerequisicionsSeleccionados=new ArrayList<DetalleRequisicion>();		
		
		detallerequisicionsSeleccionados=this.getDetalleRequisicionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallerequisicion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("detallerequisicions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("detallerequisicion");
			//elementRoot.appendChild(element);
		
			for(DetalleRequisicion detallerequisicionAux:detallerequisicionsSeleccionados) {
				element = document.createElement("detallerequisicion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDetalleRequisicion(detallerequisicionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Requisicion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDetalleRequisicion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleRequisicionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleRequisicionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DetalleRequisicionConstantesFunciones.LABEL_IDREQUISICION);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleRequisicionConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleRequisicionConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleRequisicionConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleRequisicionConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleRequisicionConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleRequisicionConstantesFunciones.LABEL_IDMES);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleRequisicionConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleRequisicionConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleRequisicionConstantesFunciones.LABEL_IDUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleRequisicionConstantesFunciones.LABEL_CANTIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleRequisicionConstantesFunciones.LABEL_DESCRIPCION);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleRequisicionConstantesFunciones.LABEL_FECHAAUTORIZA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDetalleRequisicion(DetalleRequisicion detallerequisicion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(detallerequisicion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(detallerequisicion.getrequisicion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallerequisicion.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallerequisicion.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallerequisicion.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallerequisicion.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallerequisicion.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallerequisicion.getmes_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallerequisicion.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallerequisicion.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallerequisicion.getunidad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallerequisicion.getcantidad());
		cell = row.createCell(iColumn++);cell.setCellValue(detallerequisicion.getdescripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallerequisicion.getfecha_autoriza());				
	}
	
	public void setFilaDatosExportarXmlDetalleRequisicion(DetalleRequisicion detallerequisicion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DetalleRequisicionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(detallerequisicion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DetalleRequisicionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(detallerequisicion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementrequisicion_descripcion = document.createElement(DetalleRequisicionConstantesFunciones.IDREQUISICION);
		elementrequisicion_descripcion.appendChild(document.createTextNode(detallerequisicion.getrequisicion_descripcion()));
		element.appendChild(elementrequisicion_descripcion);

		Element elementempresa_descripcion = document.createElement(DetalleRequisicionConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(detallerequisicion.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(DetalleRequisicionConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(detallerequisicion.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(DetalleRequisicionConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(detallerequisicion.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(DetalleRequisicionConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(detallerequisicion.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementanio_descripcion = document.createElement(DetalleRequisicionConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(detallerequisicion.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementmes_descripcion = document.createElement(DetalleRequisicionConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(detallerequisicion.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);

		Element elementbodega_descripcion = document.createElement(DetalleRequisicionConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(detallerequisicion.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementproducto_descripcion = document.createElement(DetalleRequisicionConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(detallerequisicion.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementunidad_descripcion = document.createElement(DetalleRequisicionConstantesFunciones.IDUNIDAD);
		elementunidad_descripcion.appendChild(document.createTextNode(detallerequisicion.getunidad_descripcion()));
		element.appendChild(elementunidad_descripcion);

		Element elementcantidad = document.createElement(DetalleRequisicionConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(detallerequisicion.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);

		Element elementdescripcion = document.createElement(DetalleRequisicionConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(detallerequisicion.getdescripcion().trim()));
		element.appendChild(elementdescripcion);

		Element elementfecha_autoriza = document.createElement(DetalleRequisicionConstantesFunciones.FECHAAUTORIZA);
		elementfecha_autoriza.appendChild(document.createTextNode(detallerequisicion.getfecha_autoriza().toString().trim()));
		element.appendChild(elementfecha_autoriza);
	}
	
	public void generarReporteGroupGenericoDetalleRequisicionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DetalleRequisicion> detallerequisicionsSeleccionados=new ArrayList<DetalleRequisicion>();
		
		detallerequisicionsSeleccionados=this.getDetalleRequisicionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDetalleRequisicion(detallerequisicionsSeleccionados);
		
		this.generarReporteDetalleRequisicions("Todos",detallerequisicionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDetalleRequisicion(ArrayList<DetalleRequisicion> detallerequisicionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DetalleRequisicion detallerequisicionAux:detallerequisicionsSeleccionados) {
				detallerequisicionAux.setsDetalleGeneralEntityReporte(detallerequisicionAux.toString());
			
				if(sTipoSeleccionar.equals(DetalleRequisicionConstantesFunciones.LABEL_IDREQUISICION)) {
					existe=true;
					detallerequisicionAux.setsDescripcionGeneralEntityReporte1(detallerequisicionAux.getrequisicion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleRequisicionConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					detallerequisicionAux.setsDescripcionGeneralEntityReporte1(detallerequisicionAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleRequisicionConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					detallerequisicionAux.setsDescripcionGeneralEntityReporte1(detallerequisicionAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleRequisicionConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					detallerequisicionAux.setsDescripcionGeneralEntityReporte1(detallerequisicionAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleRequisicionConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					detallerequisicionAux.setsDescripcionGeneralEntityReporte1(detallerequisicionAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleRequisicionConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					detallerequisicionAux.setsDescripcionGeneralEntityReporte1(detallerequisicionAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleRequisicionConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					detallerequisicionAux.setsDescripcionGeneralEntityReporte1(detallerequisicionAux.getmes_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleRequisicionConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					detallerequisicionAux.setsDescripcionGeneralEntityReporte1(detallerequisicionAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleRequisicionConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					detallerequisicionAux.setsDescripcionGeneralEntityReporte1(detallerequisicionAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleRequisicionConstantesFunciones.LABEL_IDUNIDAD)) {
					existe=true;
					detallerequisicionAux.setsDescripcionGeneralEntityReporte1(detallerequisicionAux.getunidad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleRequisicionConstantesFunciones.LABEL_CANTIDAD)) {
					existe=true;
					detallerequisicionAux.setsDescripcionGeneralEntityReporte1(detallerequisicionAux.getcantidad().toString());
				}
				 else if(sTipoSeleccionar.equals(DetalleRequisicionConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					detallerequisicionAux.setsDescripcionGeneralEntityReporte1(detallerequisicionAux.getdescripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleRequisicionConstantesFunciones.LABEL_FECHAAUTORIZA)) {
					existe=true;
					detallerequisicionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(detallerequisicionAux.getfecha_autoriza()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDetalleRequisicion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDetalleRequisicion=true;
				this.isVisibilidadCeldaNuevoRelacionesDetalleRequisicion=true;
				this.isVisibilidadCeldaGuardarCambiosDetalleRequisicion=true;
			}
			
			this.isVisibilidadCeldaModificarDetalleRequisicion=false;
			this.isVisibilidadCeldaActualizarDetalleRequisicion=false;
			this.isVisibilidadCeldaEliminarDetalleRequisicion=false;
			this.isVisibilidadCeldaCancelarDetalleRequisicion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleRequisicion=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleRequisicion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDetalleRequisicion=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleRequisicion=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleRequisicion=false;
			this.isVisibilidadCeldaModificarDetalleRequisicion=false;
			this.isVisibilidadCeldaActualizarDetalleRequisicion=true;
			this.isVisibilidadCeldaEliminarDetalleRequisicion=false;
			this.isVisibilidadCeldaCancelarDetalleRequisicion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleRequisicion=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleRequisicion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDetalleRequisicion=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleRequisicion=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleRequisicion=false;
			this.isVisibilidadCeldaModificarDetalleRequisicion=false;
			this.isVisibilidadCeldaActualizarDetalleRequisicion=true;
			this.isVisibilidadCeldaEliminarDetalleRequisicion=true;
			this.isVisibilidadCeldaCancelarDetalleRequisicion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleRequisicion=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleRequisicion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDetalleRequisicion=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleRequisicion=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleRequisicion=false;
			this.isVisibilidadCeldaModificarDetalleRequisicion=false;
			this.isVisibilidadCeldaActualizarDetalleRequisicion=true;
			this.isVisibilidadCeldaEliminarDetalleRequisicion=false;
			this.isVisibilidadCeldaCancelarDetalleRequisicion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleRequisicion=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleRequisicion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDetalleRequisicion=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleRequisicion=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleRequisicion=true;
			this.isVisibilidadCeldaModificarDetalleRequisicion=false;
			this.isVisibilidadCeldaActualizarDetalleRequisicion=false;
			this.isVisibilidadCeldaEliminarDetalleRequisicion=false;
			this.isVisibilidadCeldaCancelarDetalleRequisicion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleRequisicion=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleRequisicion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDetalleRequisicion=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleRequisicion=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleRequisicion=false;
			this.isVisibilidadCeldaActualizarDetalleRequisicion=false;
			this.isVisibilidadCeldaEliminarDetalleRequisicion=false;
			this.isVisibilidadCeldaCancelarDetalleRequisicion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleRequisicion=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleRequisicion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDetalleRequisicion=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleRequisicion=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleRequisicion=false;
			this.isVisibilidadCeldaModificarDetalleRequisicion=true;
			this.isVisibilidadCeldaActualizarDetalleRequisicion=false;
			this.isVisibilidadCeldaEliminarDetalleRequisicion=false;
			this.isVisibilidadCeldaCancelarDetalleRequisicion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleRequisicion=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleRequisicion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DetalleRequisicionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDetalleRequisicion=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleRequisicion=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleRequisicion=true;
		} else {
			this.actualizarEstadoPanelsDetalleRequisicion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDetalleRequisicion=false;
			//this.isVisibilidadCeldaVerFormDetalleRequisicion=false;
			this.isVisibilidadCeldaDuplicarDetalleRequisicion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!detallerequisicionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleRequisicion=false;
		} else {
			this.isVisibilidadCeldaNuevoDetalleRequisicion=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleRequisicion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(detallerequisicionSessionBean.getEsGuardarRelacionado()) {
			if(!detallerequisicionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDetalleRequisicion=false;												
			}
			
			this.jButtonCerrarDetalleRequisicion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleRequisicion=false;
		}
		
		if(!this.permiteMantenimiento(this.detallerequisicion)) {
			this.isVisibilidadCeldaActualizarDetalleRequisicion=false;
			this.isVisibilidadCeldaEliminarDetalleRequisicion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleRequisicion() {
	}
	
	public void actualizarEstadoPanelsDetalleRequisicion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDetalleRequisicion!=null) {
				this.jScrollPanelDatosEdicionDetalleRequisicion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleRequisicion!=null) {
				this.jTabbedPaneBusquedasDetalleRequisicion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleRequisicion!=null) {
				this.jScrollPanelDatosDetalleRequisicion.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleRequisicion!=null) {
				this.jPanelPaginacionDetalleRequisicion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleRequisicion!=null) {
				this.jPanelParametrosReportesDetalleRequisicion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDetalleRequisicion!=null) {
				this.jScrollPanelDatosEdicionDetalleRequisicion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleRequisicion!=null) {
				this.jTabbedPaneBusquedasDetalleRequisicion.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDetalleRequisicion!=null) {
				this.jScrollPanelDatosDetalleRequisicion.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleRequisicion!=null) {
				this.jPanelPaginacionDetalleRequisicion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleRequisicion!=null) {
				this.jPanelParametrosReportesDetalleRequisicion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDetalleRequisicion!=null) {
				this.jScrollPanelDatosEdicionDetalleRequisicion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleRequisicion!=null) {
				this.jTabbedPaneBusquedasDetalleRequisicion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleRequisicion!=null) {
				this.jScrollPanelDatosDetalleRequisicion.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleRequisicion!=null) {
				this.jPanelPaginacionDetalleRequisicion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleRequisicion!=null) {
				this.jPanelParametrosReportesDetalleRequisicion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDetalleRequisicion!=null) {
				this.jScrollPanelDatosEdicionDetalleRequisicion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleRequisicion!=null) {
				this.jTabbedPaneBusquedasDetalleRequisicion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleRequisicion!=null) {
				this.jScrollPanelDatosDetalleRequisicion.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleRequisicion!=null) {
				this.jPanelPaginacionDetalleRequisicion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleRequisicion!=null) {
				this.jPanelParametrosReportesDetalleRequisicion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDetalleRequisicion!=null) {
				this.jScrollPanelDatosEdicionDetalleRequisicion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleRequisicion!=null) {
				this.jTabbedPaneBusquedasDetalleRequisicion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleRequisicion!=null) {
				this.jScrollPanelDatosDetalleRequisicion.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleRequisicion!=null) {
				this.jPanelPaginacionDetalleRequisicion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleRequisicion!=null) {
				this.jPanelParametrosReportesDetalleRequisicion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDetalleRequisicion!=null) {
				this.jScrollPanelDatosEdicionDetalleRequisicion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleRequisicion!=null) {
				this.jTabbedPaneBusquedasDetalleRequisicion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleRequisicion!=null) {
				this.jScrollPanelDatosDetalleRequisicion.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleRequisicion!=null) {
				this.jPanelPaginacionDetalleRequisicion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleRequisicion!=null) {
				this.jPanelParametrosReportesDetalleRequisicion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDetalleRequisicion!=null) {
				this.jScrollPanelDatosEdicionDetalleRequisicion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleRequisicion!=null) {
				this.jTabbedPaneBusquedasDetalleRequisicion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleRequisicion!=null) {
				this.jScrollPanelDatosDetalleRequisicion.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleRequisicion!=null) {
				this.jPanelPaginacionDetalleRequisicion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleRequisicion!=null) {
				this.jPanelParametrosReportesDetalleRequisicion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDetalleRequisicion!=null) {
					this.jTabbedPaneBusquedasDetalleRequisicion.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDetalleRequisicion!=null) {
				this.jPanelParametrosReportesDetalleRequisicion.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleRequisicion!=null) {
				this.jTabbedPaneBusquedasDetalleRequisicion.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDetalleRequisicion!=null) {
				this.jPanelParametrosReportesDetalleRequisicion.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaRequisicion(Boolean isParaRequisicion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaRequisicionNegation=!isParaRequisicion;

			this.isVisibilidadFK_IdBodega=isParaRequisicionNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDetalleRequisicion.remove(jPanelFK_IdBodegaDetalleRequisicion);}

			this.isVisibilidadFK_IdProducto=isParaRequisicionNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetalleRequisicion.remove(jPanelFK_IdProductoDetalleRequisicion);}

			this.isVisibilidadFK_IdRequisicion=isParaRequisicion;
			if(!this.isVisibilidadFK_IdRequisicion) {this.jTabbedPaneBusquedasDetalleRequisicion.remove(jPanelFK_IdRequisicionDetalleRequisicion);}

			this.isVisibilidadFK_IdUnidad=isParaRequisicionNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetalleRequisicion.remove(jPanelFK_IdUnidadDetalleRequisicion);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdBodega=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDetalleRequisicion.remove(jPanelFK_IdBodegaDetalleRequisicion);}

			this.isVisibilidadFK_IdProducto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetalleRequisicion.remove(jPanelFK_IdProductoDetalleRequisicion);}

			this.isVisibilidadFK_IdRequisicion=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdRequisicion) {this.jTabbedPaneBusquedasDetalleRequisicion.remove(jPanelFK_IdRequisicionDetalleRequisicion);}

			this.isVisibilidadFK_IdUnidad=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetalleRequisicion.remove(jPanelFK_IdUnidadDetalleRequisicion);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdBodega=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDetalleRequisicion.remove(jPanelFK_IdBodegaDetalleRequisicion);}

			this.isVisibilidadFK_IdProducto=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetalleRequisicion.remove(jPanelFK_IdProductoDetalleRequisicion);}

			this.isVisibilidadFK_IdRequisicion=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdRequisicion) {this.jTabbedPaneBusquedasDetalleRequisicion.remove(jPanelFK_IdRequisicionDetalleRequisicion);}

			this.isVisibilidadFK_IdUnidad=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetalleRequisicion.remove(jPanelFK_IdUnidadDetalleRequisicion);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadFK_IdBodega=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDetalleRequisicion.remove(jPanelFK_IdBodegaDetalleRequisicion);}

			this.isVisibilidadFK_IdProducto=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetalleRequisicion.remove(jPanelFK_IdProductoDetalleRequisicion);}

			this.isVisibilidadFK_IdRequisicion=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdRequisicion) {this.jTabbedPaneBusquedasDetalleRequisicion.remove(jPanelFK_IdRequisicionDetalleRequisicion);}

			this.isVisibilidadFK_IdUnidad=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetalleRequisicion.remove(jPanelFK_IdUnidadDetalleRequisicion);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadFK_IdBodega=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDetalleRequisicion.remove(jPanelFK_IdBodegaDetalleRequisicion);}

			this.isVisibilidadFK_IdProducto=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetalleRequisicion.remove(jPanelFK_IdProductoDetalleRequisicion);}

			this.isVisibilidadFK_IdRequisicion=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdRequisicion) {this.jTabbedPaneBusquedasDetalleRequisicion.remove(jPanelFK_IdRequisicionDetalleRequisicion);}

			this.isVisibilidadFK_IdUnidad=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetalleRequisicion.remove(jPanelFK_IdUnidadDetalleRequisicion);}
		}
		
	}

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadFK_IdBodega=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDetalleRequisicion.remove(jPanelFK_IdBodegaDetalleRequisicion);}

			this.isVisibilidadFK_IdProducto=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetalleRequisicion.remove(jPanelFK_IdProductoDetalleRequisicion);}

			this.isVisibilidadFK_IdRequisicion=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdRequisicion) {this.jTabbedPaneBusquedasDetalleRequisicion.remove(jPanelFK_IdRequisicionDetalleRequisicion);}

			this.isVisibilidadFK_IdUnidad=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetalleRequisicion.remove(jPanelFK_IdUnidadDetalleRequisicion);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadFK_IdBodega=isParaMesNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDetalleRequisicion.remove(jPanelFK_IdBodegaDetalleRequisicion);}

			this.isVisibilidadFK_IdProducto=isParaMesNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetalleRequisicion.remove(jPanelFK_IdProductoDetalleRequisicion);}

			this.isVisibilidadFK_IdRequisicion=isParaMesNegation;
			if(!this.isVisibilidadFK_IdRequisicion) {this.jTabbedPaneBusquedasDetalleRequisicion.remove(jPanelFK_IdRequisicionDetalleRequisicion);}

			this.isVisibilidadFK_IdUnidad=isParaMesNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetalleRequisicion.remove(jPanelFK_IdUnidadDetalleRequisicion);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadFK_IdBodega=isParaBodega;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDetalleRequisicion.remove(jPanelFK_IdBodegaDetalleRequisicion);}

			this.isVisibilidadFK_IdProducto=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetalleRequisicion.remove(jPanelFK_IdProductoDetalleRequisicion);}

			this.isVisibilidadFK_IdRequisicion=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdRequisicion) {this.jTabbedPaneBusquedasDetalleRequisicion.remove(jPanelFK_IdRequisicionDetalleRequisicion);}

			this.isVisibilidadFK_IdUnidad=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetalleRequisicion.remove(jPanelFK_IdUnidadDetalleRequisicion);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadFK_IdBodega=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDetalleRequisicion.remove(jPanelFK_IdBodegaDetalleRequisicion);}

			this.isVisibilidadFK_IdProducto=isParaProducto;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetalleRequisicion.remove(jPanelFK_IdProductoDetalleRequisicion);}

			this.isVisibilidadFK_IdRequisicion=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdRequisicion) {this.jTabbedPaneBusquedasDetalleRequisicion.remove(jPanelFK_IdRequisicionDetalleRequisicion);}

			this.isVisibilidadFK_IdUnidad=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetalleRequisicion.remove(jPanelFK_IdUnidadDetalleRequisicion);}
		}
		
	}

	public void setVisibilidadBusquedasParaUnidad(Boolean isParaUnidad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUnidadNegation=!isParaUnidad;

			this.isVisibilidadFK_IdBodega=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDetalleRequisicion.remove(jPanelFK_IdBodegaDetalleRequisicion);}

			this.isVisibilidadFK_IdProducto=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetalleRequisicion.remove(jPanelFK_IdProductoDetalleRequisicion);}

			this.isVisibilidadFK_IdRequisicion=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdRequisicion) {this.jTabbedPaneBusquedasDetalleRequisicion.remove(jPanelFK_IdRequisicionDetalleRequisicion);}

			this.isVisibilidadFK_IdUnidad=isParaUnidad;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetalleRequisicion.remove(jPanelFK_IdUnidadDetalleRequisicion);}
		}
		
	}
	
	
	
	

	public String registrarSesionDetalleRequisicionParaBusquedaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(detallerequisicionSessionBean==null) {
				detallerequisicionSessionBean=new DetalleRequisicionSessionBean();
			}

			if(productoSessionBean==null) {
				productoSessionBean=new ProductoSessionBean();
			}

			productoSessionBean.setsPathNavegacionActual(detallerequisicionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			productoSessionBean.setisPermiteRecargarInformacion(false);
			productoSessionBean.setisPaginaPopup(true);
			isPaginaPopupProducto=productoSessionBean.getisPaginaPopup();
			productoSessionBean.setisPaginaPopup(false);
			productoSessionBean.setEstaModoBusqueda(true);
			productoSessionBean.setsFuncionBusquedaRapida("window.opener.detallerequisicionFuncionGeneral.setCombosCodigoDesdeBusquedaid_producto(TO_REPLACE);");
			productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(DetalleRequisicionConstantesFunciones.SNOMBREOPCION);
			//productoSessionBean.setisBusquedaDesdeForeignKeySesionDetalleRequisicion(true);
			//productoSessionBean.setlidDetalleRequisicionActual(this.idDetalleRequisicionActual);

			detallerequisicionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyDetalleRequisicion(true);
			detallerequisicionSessionBean.setlIdDetalleRequisicionActualForeignKey(this.idDetalleRequisicionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//DetalleRequisicionSessionBean detallerequisicionSessionBean=new DetalleRequisicionSessionBean();
		
		if(this.detallerequisicionSessionBean==null) {
			this.detallerequisicionSessionBean=new DetalleRequisicionSessionBean();
		}
		
		this.detallerequisicionSessionBean.setsUltimaBusquedaDetalleRequisicion(this.getsAccionBusqueda());
		this.detallerequisicionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.detallerequisicionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
			detallerequisicionSessionBean.setid_bodega(this.getid_bodegaFK_IdBodega());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
			detallerequisicionSessionBean.setid_ejercicio(this.getid_ejercicioFK_IdEjercicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			detallerequisicionSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
			detallerequisicionSessionBean.setid_periodo(this.getid_periodoFK_IdPeriodo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
			detallerequisicionSessionBean.setid_producto(this.getid_productoFK_IdProducto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdRequisicion")) {
			detallerequisicionSessionBean.setid_requisicion(this.getid_requisicionFK_IdRequisicion());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			detallerequisicionSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
			detallerequisicionSessionBean.setid_unidad(this.getid_unidadFK_IdUnidad());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//DetalleRequisicionSessionBean detallerequisicionSessionBean=new DetalleRequisicionSessionBean();
		
		if(this.detallerequisicionSessionBean==null) {
			this.detallerequisicionSessionBean=new DetalleRequisicionSessionBean();
		}
		
		if(this.detallerequisicionSessionBean.getsUltimaBusquedaDetalleRequisicion()!=null&&!this.detallerequisicionSessionBean.getsUltimaBusquedaDetalleRequisicion().equals("")) {
			this.setsAccionBusqueda(detallerequisicionSessionBean.getsUltimaBusquedaDetalleRequisicion());
			this.setiNumeroPaginacion(detallerequisicionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(detallerequisicionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
				this.setid_bodegaFK_IdBodega(detallerequisicionSessionBean.getid_bodega());
				detallerequisicionSessionBean.setid_bodega(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
				this.setid_ejercicioFK_IdEjercicio(detallerequisicionSessionBean.getid_ejercicio());
				detallerequisicionSessionBean.setid_ejercicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(detallerequisicionSessionBean.getid_empresa());
				detallerequisicionSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
				this.setid_periodoFK_IdPeriodo(detallerequisicionSessionBean.getid_periodo());
				detallerequisicionSessionBean.setid_periodo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
				this.setid_productoFK_IdProducto(detallerequisicionSessionBean.getid_producto());
				detallerequisicionSessionBean.setid_producto(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdRequisicion")) {
				this.setid_requisicionFK_IdRequisicion(detallerequisicionSessionBean.getid_requisicion());
				detallerequisicionSessionBean.setid_requisicion(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(detallerequisicionSessionBean.getid_sucursal());
				detallerequisicionSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
				this.setid_unidadFK_IdUnidad(detallerequisicionSessionBean.getid_unidad());
				detallerequisicionSessionBean.setid_unidad(-1L);
			}
		}
		
		this.detallerequisicionSessionBean.setsUltimaBusquedaDetalleRequisicion("");
		this.detallerequisicionSessionBean.setiNumeroPaginacion(DetalleRequisicionConstantesFunciones.INUMEROPAGINACION);
		this.detallerequisicionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDetalleRequisicion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDetalleRequisicion() {
		this.updateBorderResaltarBusquedasFormularioDetalleRequisicion();
		this.updateVisibilidadBusquedasFormularioDetalleRequisicion();
		this.updateHabilitarBusquedasFormularioDetalleRequisicion();
	}
	
	public void updateBorderResaltarBusquedasFormularioDetalleRequisicion() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDetalleRequisicion.getComponents().length>0) {
	

		if(this.detallerequisicionConstantesFunciones.resaltarFK_IdBodegaDetalleRequisicion!=null) {
			index= this.jTabbedPaneBusquedasDetalleRequisicion.indexOfComponent(this.jPanelFK_IdBodegaDetalleRequisicion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleRequisicion.getComponent(index);
				jPanel.setBorder(this.detallerequisicionConstantesFunciones.resaltarFK_IdBodegaDetalleRequisicion);
			}
		}

		if(this.detallerequisicionConstantesFunciones.resaltarFK_IdProductoDetalleRequisicion!=null) {
			index= this.jTabbedPaneBusquedasDetalleRequisicion.indexOfComponent(this.jPanelFK_IdProductoDetalleRequisicion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleRequisicion.getComponent(index);
				jPanel.setBorder(this.detallerequisicionConstantesFunciones.resaltarFK_IdProductoDetalleRequisicion);
			}
		}

		if(this.detallerequisicionConstantesFunciones.resaltarFK_IdRequisicionDetalleRequisicion!=null) {
			index= this.jTabbedPaneBusquedasDetalleRequisicion.indexOfComponent(this.jPanelFK_IdRequisicionDetalleRequisicion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleRequisicion.getComponent(index);
				jPanel.setBorder(this.detallerequisicionConstantesFunciones.resaltarFK_IdRequisicionDetalleRequisicion);
			}
		}

		if(this.detallerequisicionConstantesFunciones.resaltarFK_IdUnidadDetalleRequisicion!=null) {
			index= this.jTabbedPaneBusquedasDetalleRequisicion.indexOfComponent(this.jPanelFK_IdUnidadDetalleRequisicion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleRequisicion.getComponent(index);
				jPanel.setBorder(this.detallerequisicionConstantesFunciones.resaltarFK_IdUnidadDetalleRequisicion);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDetalleRequisicion() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDetalleRequisicion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleRequisicion.indexOfComponent(this.jPanelFK_IdBodegaDetalleRequisicion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleRequisicion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detallerequisicionConstantesFunciones.mostrarFK_IdBodegaDetalleRequisicion);
			if(!this.detallerequisicionConstantesFunciones.mostrarFK_IdBodegaDetalleRequisicion && index>-1) {
				this.jTabbedPaneBusquedasDetalleRequisicion.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetalleRequisicion.indexOfComponent(this.jPanelFK_IdProductoDetalleRequisicion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleRequisicion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detallerequisicionConstantesFunciones.mostrarFK_IdProductoDetalleRequisicion);
			if(!this.detallerequisicionConstantesFunciones.mostrarFK_IdProductoDetalleRequisicion && index>-1) {
				this.jTabbedPaneBusquedasDetalleRequisicion.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetalleRequisicion.indexOfComponent(this.jPanelFK_IdRequisicionDetalleRequisicion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleRequisicion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detallerequisicionConstantesFunciones.mostrarFK_IdRequisicionDetalleRequisicion);
			if(!this.detallerequisicionConstantesFunciones.mostrarFK_IdRequisicionDetalleRequisicion && index>-1) {
				this.jTabbedPaneBusquedasDetalleRequisicion.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetalleRequisicion.indexOfComponent(this.jPanelFK_IdUnidadDetalleRequisicion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleRequisicion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detallerequisicionConstantesFunciones.mostrarFK_IdUnidadDetalleRequisicion);
			if(!this.detallerequisicionConstantesFunciones.mostrarFK_IdUnidadDetalleRequisicion && index>-1) {
				this.jTabbedPaneBusquedasDetalleRequisicion.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDetalleRequisicion() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDetalleRequisicion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleRequisicion.indexOfComponent(this.jPanelFK_IdBodegaDetalleRequisicion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleRequisicion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detallerequisicionConstantesFunciones.activarFK_IdBodegaDetalleRequisicion);
				this.jTabbedPaneBusquedasDetalleRequisicion.setEnabledAt(index,this.detallerequisicionConstantesFunciones.activarFK_IdBodegaDetalleRequisicion);
			}

			index= this.jTabbedPaneBusquedasDetalleRequisicion.indexOfComponent(this.jPanelFK_IdProductoDetalleRequisicion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleRequisicion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detallerequisicionConstantesFunciones.activarFK_IdProductoDetalleRequisicion);
				this.jTabbedPaneBusquedasDetalleRequisicion.setEnabledAt(index,this.detallerequisicionConstantesFunciones.activarFK_IdProductoDetalleRequisicion);
			}

			index= this.jTabbedPaneBusquedasDetalleRequisicion.indexOfComponent(this.jPanelFK_IdRequisicionDetalleRequisicion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleRequisicion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detallerequisicionConstantesFunciones.activarFK_IdRequisicionDetalleRequisicion);
				this.jTabbedPaneBusquedasDetalleRequisicion.setEnabledAt(index,this.detallerequisicionConstantesFunciones.activarFK_IdRequisicionDetalleRequisicion);
			}

			index= this.jTabbedPaneBusquedasDetalleRequisicion.indexOfComponent(this.jPanelFK_IdUnidadDetalleRequisicion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleRequisicion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detallerequisicionConstantesFunciones.activarFK_IdUnidadDetalleRequisicion);
				this.jTabbedPaneBusquedasDetalleRequisicion.setEnabledAt(index,this.detallerequisicionConstantesFunciones.activarFK_IdUnidadDetalleRequisicion);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDetalleRequisicion(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdBodega")) {
			index= this.jTabbedPaneBusquedasDetalleRequisicion.indexOfComponent(this.jPanelFK_IdBodegaDetalleRequisicion);

			this.jTabbedPaneBusquedasDetalleRequisicion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleRequisicion.getComponent(index);

			this.detallerequisicionConstantesFunciones.setResaltarFK_IdBodegaDetalleRequisicion(resaltar);

			jPanel.setBorder(this.detallerequisicionConstantesFunciones.resaltarFK_IdBodegaDetalleRequisicion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdProducto")) {
			index= this.jTabbedPaneBusquedasDetalleRequisicion.indexOfComponent(this.jPanelFK_IdProductoDetalleRequisicion);

			this.jTabbedPaneBusquedasDetalleRequisicion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleRequisicion.getComponent(index);

			this.detallerequisicionConstantesFunciones.setResaltarFK_IdProductoDetalleRequisicion(resaltar);

			jPanel.setBorder(this.detallerequisicionConstantesFunciones.resaltarFK_IdProductoDetalleRequisicion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdRequisicion")) {
			index= this.jTabbedPaneBusquedasDetalleRequisicion.indexOfComponent(this.jPanelFK_IdRequisicionDetalleRequisicion);

			this.jTabbedPaneBusquedasDetalleRequisicion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleRequisicion.getComponent(index);

			this.detallerequisicionConstantesFunciones.setResaltarFK_IdRequisicionDetalleRequisicion(resaltar);

			jPanel.setBorder(this.detallerequisicionConstantesFunciones.resaltarFK_IdRequisicionDetalleRequisicion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdUnidad")) {
			index= this.jTabbedPaneBusquedasDetalleRequisicion.indexOfComponent(this.jPanelFK_IdUnidadDetalleRequisicion);

			this.jTabbedPaneBusquedasDetalleRequisicion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleRequisicion.getComponent(index);

			this.detallerequisicionConstantesFunciones.setResaltarFK_IdUnidadDetalleRequisicion(resaltar);

			jPanel.setBorder(this.detallerequisicionConstantesFunciones.resaltarFK_IdUnidadDetalleRequisicion);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDetalleRequisicion.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDetalleRequisicion() throws Exception {

		if(this.jInternalFrameDetalleFormDetalleRequisicion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDetalleRequisicion();
		this.updateVisibilidadResaltarControlesFormularioDetalleRequisicion();
		this.updateHabilitarResaltarControlesFormularioDetalleRequisicion();
		
	}
	
	public void updateBorderResaltarControlesFormularioDetalleRequisicion() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleRequisicion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.detallerequisicionConstantesFunciones.resaltaridDetalleRequisicion!=null && this.jInternalFrameDetalleFormDetalleRequisicion!=null) {this.jInternalFrameDetalleFormDetalleRequisicion.jLabelidDetalleRequisicion.setBorder(this.detallerequisicionConstantesFunciones.resaltaridDetalleRequisicion);}
		if(this.detallerequisicionConstantesFunciones.resaltarid_requisicionDetalleRequisicion!=null && this.jInternalFrameDetalleFormDetalleRequisicion!=null) {this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_requisicionDetalleRequisicion.setBorder(this.detallerequisicionConstantesFunciones.resaltarid_requisicionDetalleRequisicion);}
		if(this.detallerequisicionConstantesFunciones.resaltarid_empresaDetalleRequisicion!=null && this.jInternalFrameDetalleFormDetalleRequisicion!=null) {this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_empresaDetalleRequisicion.setBorder(this.detallerequisicionConstantesFunciones.resaltarid_empresaDetalleRequisicion);}
		if(this.detallerequisicionConstantesFunciones.resaltarid_sucursalDetalleRequisicion!=null && this.jInternalFrameDetalleFormDetalleRequisicion!=null) {this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_sucursalDetalleRequisicion.setBorder(this.detallerequisicionConstantesFunciones.resaltarid_sucursalDetalleRequisicion);}
		if(this.detallerequisicionConstantesFunciones.resaltarid_ejercicioDetalleRequisicion!=null && this.jInternalFrameDetalleFormDetalleRequisicion!=null) {this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_ejercicioDetalleRequisicion.setBorder(this.detallerequisicionConstantesFunciones.resaltarid_ejercicioDetalleRequisicion);}
		if(this.detallerequisicionConstantesFunciones.resaltarid_periodoDetalleRequisicion!=null && this.jInternalFrameDetalleFormDetalleRequisicion!=null) {this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_periodoDetalleRequisicion.setBorder(this.detallerequisicionConstantesFunciones.resaltarid_periodoDetalleRequisicion);}
		if(this.detallerequisicionConstantesFunciones.resaltarid_anioDetalleRequisicion!=null && this.jInternalFrameDetalleFormDetalleRequisicion!=null) {this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_anioDetalleRequisicion.setBorder(this.detallerequisicionConstantesFunciones.resaltarid_anioDetalleRequisicion);}
		if(this.detallerequisicionConstantesFunciones.resaltarid_mesDetalleRequisicion!=null && this.jInternalFrameDetalleFormDetalleRequisicion!=null) {this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_mesDetalleRequisicion.setBorder(this.detallerequisicionConstantesFunciones.resaltarid_mesDetalleRequisicion);}
		if(this.detallerequisicionConstantesFunciones.resaltarid_bodegaDetalleRequisicion!=null && this.jInternalFrameDetalleFormDetalleRequisicion!=null) {this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_bodegaDetalleRequisicion.setBorder(this.detallerequisicionConstantesFunciones.resaltarid_bodegaDetalleRequisicion);}
		if(this.detallerequisicionConstantesFunciones.resaltarid_productoDetalleRequisicion!=null && this.jInternalFrameDetalleFormDetalleRequisicion!=null) {this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_productoDetalleRequisicion.setBorder(this.detallerequisicionConstantesFunciones.resaltarid_productoDetalleRequisicion);}
		if(this.detallerequisicionConstantesFunciones.resaltarid_unidadDetalleRequisicion!=null && this.jInternalFrameDetalleFormDetalleRequisicion!=null) {this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_unidadDetalleRequisicion.setBorder(this.detallerequisicionConstantesFunciones.resaltarid_unidadDetalleRequisicion);}
		if(this.detallerequisicionConstantesFunciones.resaltarcantidadDetalleRequisicion!=null && this.jInternalFrameDetalleFormDetalleRequisicion!=null) {this.jInternalFrameDetalleFormDetalleRequisicion.jTextFieldcantidadDetalleRequisicion.setBorder(this.detallerequisicionConstantesFunciones.resaltarcantidadDetalleRequisicion);}
		if(this.detallerequisicionConstantesFunciones.resaltardescripcionDetalleRequisicion!=null && this.jInternalFrameDetalleFormDetalleRequisicion!=null) {this.jInternalFrameDetalleFormDetalleRequisicion.jTextAreadescripcionDetalleRequisicion.setBorder(this.detallerequisicionConstantesFunciones.resaltardescripcionDetalleRequisicion);}
		if(this.detallerequisicionConstantesFunciones.resaltarfecha_autorizaDetalleRequisicion!=null && this.jInternalFrameDetalleFormDetalleRequisicion!=null) {this.jInternalFrameDetalleFormDetalleRequisicion.jDateChooserfecha_autorizaDetalleRequisicion.setBorder(this.detallerequisicionConstantesFunciones.resaltarfecha_autorizaDetalleRequisicion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDetalleRequisicion() throws Exception {		
		if(this.jInternalFrameDetalleFormDetalleRequisicion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
	
		//this.jInternalFrameDetalleFormDetalleRequisicion.jLabelidDetalleRequisicion.setVisible(this.detallerequisicionConstantesFunciones.mostraridDetalleRequisicion);
		this.jInternalFrameDetalleFormDetalleRequisicion.jPanelidDetalleRequisicion.setVisible(this.detallerequisicionConstantesFunciones.mostraridDetalleRequisicion);
		//this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_requisicionDetalleRequisicion.setVisible(this.detallerequisicionConstantesFunciones.mostrarid_requisicionDetalleRequisicion);
		this.jInternalFrameDetalleFormDetalleRequisicion.jPanelid_requisicionDetalleRequisicion.setVisible(this.detallerequisicionConstantesFunciones.mostrarid_requisicionDetalleRequisicion);
		//this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_empresaDetalleRequisicion.setVisible(this.detallerequisicionConstantesFunciones.mostrarid_empresaDetalleRequisicion);
		this.jInternalFrameDetalleFormDetalleRequisicion.jPanelid_empresaDetalleRequisicion.setVisible(this.detallerequisicionConstantesFunciones.mostrarid_empresaDetalleRequisicion);
		//this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_sucursalDetalleRequisicion.setVisible(this.detallerequisicionConstantesFunciones.mostrarid_sucursalDetalleRequisicion);
		this.jInternalFrameDetalleFormDetalleRequisicion.jPanelid_sucursalDetalleRequisicion.setVisible(this.detallerequisicionConstantesFunciones.mostrarid_sucursalDetalleRequisicion);
		//this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_ejercicioDetalleRequisicion.setVisible(this.detallerequisicionConstantesFunciones.mostrarid_ejercicioDetalleRequisicion);
		this.jInternalFrameDetalleFormDetalleRequisicion.jPanelid_ejercicioDetalleRequisicion.setVisible(this.detallerequisicionConstantesFunciones.mostrarid_ejercicioDetalleRequisicion);
		//this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_periodoDetalleRequisicion.setVisible(this.detallerequisicionConstantesFunciones.mostrarid_periodoDetalleRequisicion);
		this.jInternalFrameDetalleFormDetalleRequisicion.jPanelid_periodoDetalleRequisicion.setVisible(this.detallerequisicionConstantesFunciones.mostrarid_periodoDetalleRequisicion);
		//this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_anioDetalleRequisicion.setVisible(this.detallerequisicionConstantesFunciones.mostrarid_anioDetalleRequisicion);
		this.jInternalFrameDetalleFormDetalleRequisicion.jPanelid_anioDetalleRequisicion.setVisible(this.detallerequisicionConstantesFunciones.mostrarid_anioDetalleRequisicion);
		//this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_mesDetalleRequisicion.setVisible(this.detallerequisicionConstantesFunciones.mostrarid_mesDetalleRequisicion);
		this.jInternalFrameDetalleFormDetalleRequisicion.jPanelid_mesDetalleRequisicion.setVisible(this.detallerequisicionConstantesFunciones.mostrarid_mesDetalleRequisicion);
		//this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_bodegaDetalleRequisicion.setVisible(this.detallerequisicionConstantesFunciones.mostrarid_bodegaDetalleRequisicion);
		this.jInternalFrameDetalleFormDetalleRequisicion.jPanelid_bodegaDetalleRequisicion.setVisible(this.detallerequisicionConstantesFunciones.mostrarid_bodegaDetalleRequisicion);
		//this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_productoDetalleRequisicion.setVisible(this.detallerequisicionConstantesFunciones.mostrarid_productoDetalleRequisicion);
		this.jInternalFrameDetalleFormDetalleRequisicion.jPanelid_productoDetalleRequisicion.setVisible(this.detallerequisicionConstantesFunciones.mostrarid_productoDetalleRequisicion);
			this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_productoDetalleRequisicion.setVisible(this.detallerequisicionConstantesFunciones.mostrarid_productoDetalleRequisicion);
		//this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_unidadDetalleRequisicion.setVisible(this.detallerequisicionConstantesFunciones.mostrarid_unidadDetalleRequisicion);
		this.jInternalFrameDetalleFormDetalleRequisicion.jPanelid_unidadDetalleRequisicion.setVisible(this.detallerequisicionConstantesFunciones.mostrarid_unidadDetalleRequisicion);
		//this.jInternalFrameDetalleFormDetalleRequisicion.jTextFieldcantidadDetalleRequisicion.setVisible(this.detallerequisicionConstantesFunciones.mostrarcantidadDetalleRequisicion);
		this.jInternalFrameDetalleFormDetalleRequisicion.jPanelcantidadDetalleRequisicion.setVisible(this.detallerequisicionConstantesFunciones.mostrarcantidadDetalleRequisicion);
		//this.jInternalFrameDetalleFormDetalleRequisicion.jTextAreadescripcionDetalleRequisicion.setVisible(this.detallerequisicionConstantesFunciones.mostrardescripcionDetalleRequisicion);
		this.jInternalFrameDetalleFormDetalleRequisicion.jPaneldescripcionDetalleRequisicion.setVisible(this.detallerequisicionConstantesFunciones.mostrardescripcionDetalleRequisicion);
		//this.jInternalFrameDetalleFormDetalleRequisicion.jDateChooserfecha_autorizaDetalleRequisicion.setVisible(this.detallerequisicionConstantesFunciones.mostrarfecha_autorizaDetalleRequisicion);
		this.jInternalFrameDetalleFormDetalleRequisicion.jPanelfecha_autorizaDetalleRequisicion.setVisible(this.detallerequisicionConstantesFunciones.mostrarfecha_autorizaDetalleRequisicion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDetalleRequisicion() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleRequisicion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleRequisicion!=null) {
	
		this.jInternalFrameDetalleFormDetalleRequisicion.jLabelidDetalleRequisicion.setEnabled(this.detallerequisicionConstantesFunciones.activaridDetalleRequisicion);
		this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_requisicionDetalleRequisicion.setEnabled(this.detallerequisicionConstantesFunciones.activarid_requisicionDetalleRequisicion);
		this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_empresaDetalleRequisicion.setEnabled(this.detallerequisicionConstantesFunciones.activarid_empresaDetalleRequisicion);
		this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_sucursalDetalleRequisicion.setEnabled(this.detallerequisicionConstantesFunciones.activarid_sucursalDetalleRequisicion);
		this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_ejercicioDetalleRequisicion.setEnabled(this.detallerequisicionConstantesFunciones.activarid_ejercicioDetalleRequisicion);
		this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_periodoDetalleRequisicion.setEnabled(this.detallerequisicionConstantesFunciones.activarid_periodoDetalleRequisicion);
		this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_anioDetalleRequisicion.setEnabled(this.detallerequisicionConstantesFunciones.activarid_anioDetalleRequisicion);
		this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_mesDetalleRequisicion.setEnabled(this.detallerequisicionConstantesFunciones.activarid_mesDetalleRequisicion);
		this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_bodegaDetalleRequisicion.setEnabled(this.detallerequisicionConstantesFunciones.activarid_bodegaDetalleRequisicion);
		this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_productoDetalleRequisicion.setEnabled(this.detallerequisicionConstantesFunciones.activarid_productoDetalleRequisicion);
			this.jInternalFrameDetalleFormDetalleRequisicion.jButtonid_productoDetalleRequisicion.setEnabled(this.detallerequisicionConstantesFunciones.activarid_productoDetalleRequisicion);
		this.jInternalFrameDetalleFormDetalleRequisicion.jComboBoxid_unidadDetalleRequisicion.setEnabled(this.detallerequisicionConstantesFunciones.activarid_unidadDetalleRequisicion);
		this.jInternalFrameDetalleFormDetalleRequisicion.jTextFieldcantidadDetalleRequisicion.setEnabled(this.detallerequisicionConstantesFunciones.activarcantidadDetalleRequisicion);
		this.jInternalFrameDetalleFormDetalleRequisicion.jTextAreadescripcionDetalleRequisicion.setEnabled(this.detallerequisicionConstantesFunciones.activardescripcionDetalleRequisicion);
		this.jInternalFrameDetalleFormDetalleRequisicion.jDateChooserfecha_autorizaDetalleRequisicion.setEnabled(this.detallerequisicionConstantesFunciones.activarfecha_autorizaDetalleRequisicion);
		}
	}
	
		
}