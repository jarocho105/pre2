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


import java.sql.Time;


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

import com.bydan.erp.inventario.util.RequisicionConstantesFunciones;
import com.bydan.erp.inventario.util.RequisicionParameterReturnGeneral;
//import com.bydan.erp.inventario.util.RequisicionParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.RequisicionBean;
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
import com.bydan.erp.nomina.business.logic.*;
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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class RequisicionBeanSwingJInternalFrame extends RequisicionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(RequisicionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Requisicion> requisicionValidator = new ClassValidator<Requisicion>(Requisicion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Requisicion requisicion;	
	public Requisicion requisicionAux;
	public Requisicion requisicionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Requisicion requisicionTotales;
	public Long idRequisicionActual;
	public Long iIdNuevoRequisicion=0L;
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

	public String sFinalQueryComboTipoRequisicion="";

	public List<TipoRequisicion> tiporequisicionsForeignKey;

	public List<TipoRequisicion> gettiporequisicionsForeignKey() {
		return tiporequisicionsForeignKey;
	}

	public void settiporequisicionsForeignKey(List<TipoRequisicion> tiporequisicionsForeignKey) {
		this.tiporequisicionsForeignKey = tiporequisicionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoRequisicion tiporequisicionForeignKey;

	public TipoRequisicion gettiporequisicionForeignKey() {
		return tiporequisicionForeignKey;
	}

	public void settiporequisicionForeignKey(TipoRequisicion tiporequisicionForeignKey) {
		this.tiporequisicionForeignKey = tiporequisicionForeignKey;
	}

	public String sFinalQueryComboEmpleado="";

	public List<Empleado> empleadosForeignKey;

	public List<Empleado> getempleadosForeignKey() {
		return empleadosForeignKey;
	}

	public void setempleadosForeignKey(List<Empleado> empleadosForeignKey) {
		this.empleadosForeignKey = empleadosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empleado empleadoForeignKey;

	public Empleado getempleadoForeignKey() {
		return empleadoForeignKey;
	}

	public void setempleadoForeignKey(Empleado empleadoForeignKey) {
		this.empleadoForeignKey = empleadoForeignKey;
	}

	public String sFinalQueryComboEstadoRequisicion="";

	public List<EstadoRequisicion> estadorequisicionsForeignKey;

	public List<EstadoRequisicion> getestadorequisicionsForeignKey() {
		return estadorequisicionsForeignKey;
	}

	public void setestadorequisicionsForeignKey(List<EstadoRequisicion> estadorequisicionsForeignKey) {
		this.estadorequisicionsForeignKey = estadorequisicionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public EstadoRequisicion estadorequisicionForeignKey;

	public EstadoRequisicion getestadorequisicionForeignKey() {
		return estadorequisicionForeignKey;
	}

	public void setestadorequisicionForeignKey(EstadoRequisicion estadorequisicionForeignKey) {
		this.estadorequisicionForeignKey = estadorequisicionForeignKey;
	}

	public String sFinalQueryComboFormato="";

	public List<Formato> formatosForeignKey;

	public List<Formato> getformatosForeignKey() {
		return formatosForeignKey;
	}

	public void setformatosForeignKey(List<Formato> formatosForeignKey) {
		this.formatosForeignKey = formatosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Formato formatoForeignKey;

	public Formato getformatoForeignKey() {
		return formatoForeignKey;
	}

	public void setformatoForeignKey(Formato formatoForeignKey) {
		this.formatoForeignKey = formatoForeignKey;
	}

	public String sFinalQueryComboBodegaSolicitar="";

	public List<Bodega> bodegasolicitarsForeignKey;

	public List<Bodega> getbodegasolicitarsForeignKey() {
		return bodegasolicitarsForeignKey;
	}

	public void setbodegasolicitarsForeignKey(List<Bodega> bodegasolicitarsForeignKey) {
		this.bodegasolicitarsForeignKey = bodegasolicitarsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Bodega bodegasolicitarForeignKey;

	public Bodega getbodegasolicitarForeignKey() {
		return bodegasolicitarForeignKey;
	}

	public void setbodegasolicitarForeignKey(Bodega bodegasolicitarForeignKey) {
		this.bodegasolicitarForeignKey = bodegasolicitarForeignKey;
	}

	public String sFinalQueryComboBodegaSolicita="";

	public List<Bodega> bodegasolicitasForeignKey;

	public List<Bodega> getbodegasolicitasForeignKey() {
		return bodegasolicitasForeignKey;
	}

	public void setbodegasolicitasForeignKey(List<Bodega> bodegasolicitasForeignKey) {
		this.bodegasolicitasForeignKey = bodegasolicitasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Bodega bodegasolicitaForeignKey;

	public Bodega getbodegasolicitaForeignKey() {
		return bodegasolicitaForeignKey;
	}

	public void setbodegasolicitaForeignKey(Bodega bodegasolicitaForeignKey) {
		this.bodegasolicitaForeignKey = bodegasolicitaForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosDetalleRequisicion=false;

	public Boolean getIsTienePermisosDetalleRequisicion() {
		return isTienePermisosDetalleRequisicion;
	}

	public void setIsTienePermisosDetalleRequisicion(Boolean isTienePermisosDetalleRequisicion) {
		this.isTienePermisosDetalleRequisicion= isTienePermisosDetalleRequisicion;
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
	
	public Boolean isPermisoTodoRequisicion;
	public Boolean isPermisoNuevoRequisicion;
	public Boolean isPermisoActualizarRequisicion;
	public Boolean isPermisoActualizarOriginalRequisicion;
	public Boolean isPermisoEliminarRequisicion;
	public Boolean isPermisoGuardarCambiosRequisicion;
	public Boolean isPermisoConsultaRequisicion;
	public Boolean isPermisoBusquedaRequisicion;
	public Boolean isPermisoReporteRequisicion;
	public Boolean isPermisoPaginacionMedioRequisicion;
	public Boolean isPermisoPaginacionAltoRequisicion;
	public Boolean isPermisoPaginacionTodoRequisicion;
	public Boolean isPermisoCopiarRequisicion;
	public Boolean isPermisoVerFormRequisicion;
	public Boolean isPermisoDuplicarRequisicion;
	public Boolean isPermisoOrdenRequisicion;
	
	
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
	
	public RequisicionParameterReturnGeneral requisicionReturnGeneral;
	public RequisicionParameterReturnGeneral requisicionParameterGeneral;
	
	

	public DetalleRequisicionLogic detallerequisicionLogic=null;

	public DetalleRequisicionLogic getDetalleRequisicionLogic() {
		return detallerequisicionLogic;
	}

	public void setDetalleRequisicionLogic(DetalleRequisicionLogic detallerequisicionLogic) {
		this.detallerequisicionLogic = detallerequisicionLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoRequisicion=false;
	public Boolean esParaAccionDesdeFormularioRequisicion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected RequisicionSessionBeanAdditional requisicionSessionBeanAdditional=null;
	
	public RequisicionSessionBeanAdditional getRequisicionSessionBeanAdditional() {
		return this.requisicionSessionBeanAdditional;
	}
	
	public void setRequisicionSessionBeanAdditional(RequisicionSessionBeanAdditional requisicionSessionBeanAdditional) {
		try {
			this.requisicionSessionBeanAdditional=requisicionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected RequisicionBeanSwingJInternalFrameAdditional requisicionBeanSwingJInternalFrameAdditional=null;
	//public class RequisicionBeanSwingJInternalFrame
	
	public RequisicionBeanSwingJInternalFrameAdditional getRequisicionBeanSwingJInternalFrameAdditional() {
		return this.requisicionBeanSwingJInternalFrameAdditional;
	}
	
	public void setRequisicionBeanSwingJInternalFrameAdditional(RequisicionBeanSwingJInternalFrameAdditional requisicionBeanSwingJInternalFrameAdditional) {
		try {
			this.requisicionBeanSwingJInternalFrameAdditional=requisicionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public RequisicionLogic requisicionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Requisicion requisicionBean;
	public RequisicionConstantesFunciones requisicionConstantesFunciones;
	//public RequisicionParameterReturnGeneral requisicionReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public TipoRequisicionLogic tiporequisicionLogic;
	public EmpleadoLogic empleadoLogic;
	public EstadoRequisicionLogic estadorequisicionLogic;
	public FormatoLogic formatoLogic;
	public BodegaLogic bodegasolicitarLogic;
	public BodegaLogic bodegasolicitaLogic;
	
	//PARAMETROS
	
	
	//public List<Requisicion> requisicions;	
	//public List<Requisicion> requisicionsEliminados;
	//public List<Requisicion> requisicionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoRequisicion=false;
	public Boolean isVisibilidadCeldaDuplicarRequisicion=true;
	public Boolean isVisibilidadCeldaCopiarRequisicion=true;
	public Boolean isVisibilidadCeldaVerFormRequisicion=true;
	public Boolean isVisibilidadCeldaOrdenRequisicion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesRequisicion=false;
	public Boolean isVisibilidadCeldaModificarRequisicion=false;
	public Boolean isVisibilidadCeldaActualizarRequisicion=false;
	public Boolean isVisibilidadCeldaEliminarRequisicion=false;
	public Boolean isVisibilidadCeldaCancelarRequisicion=false;
	public Boolean isVisibilidadCeldaGuardarRequisicion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosRequisicion=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadFK_IdBodegaSolicita=false;
	public Boolean isVisibilidadFK_IdBodegaSolicitar=false;
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstadoRequisicion=false;
	public Boolean isVisibilidadFK_IdFormato=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoRequisicion=false;
	
	public Long getiIdNuevoRequisicion() {
		return this.iIdNuevoRequisicion;
	}

	public void setiIdNuevoRequisicion(Long iIdNuevoRequisicion) {
		this.iIdNuevoRequisicion = iIdNuevoRequisicion;
	}
	
	public Long getidRequisicionActual() {
		return this.idRequisicionActual;
	}

	public void setidRequisicionActual(Long idRequisicionActual) {
		this.idRequisicionActual = idRequisicionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Requisicion getrequisicion() {
		return this.requisicion;
	}

	public void setrequisicion(Requisicion requisicion) {
		this.requisicion = requisicion;
	}
	
	public Requisicion getrequisicionAux() {
		return this.requisicionAux;
	}

	public void setrequisicionAux(Requisicion requisicionAux) {
		this.requisicionAux = requisicionAux;
	}				
	
	public Requisicion getrequisicionAnterior() {
		return this.requisicionAnterior;
	}

	public void setrequisicionAnterior(Requisicion requisicionAnterior) {
		this.requisicionAnterior = requisicionAnterior;
	}	
	
	public Requisicion getrequisicionTotales() {
		return this.requisicionTotales;
	}

	public void setrequisicionTotales(Requisicion requisicionTotales) {
		this.requisicionTotales = requisicionTotales;
	}	
	
	public Requisicion getrequisicionBean() {
		return this.requisicionBean;
	}

	public void setrequisicionBean(Requisicion requisicionBean) {
		this.requisicionBean = requisicionBean;
	}	
	
	public RequisicionParameterReturnGeneral getrequisicionReturnGeneral() {
		return this.requisicionReturnGeneral;
	}

	public void setrequisicionReturnGeneral(RequisicionParameterReturnGeneral requisicionReturnGeneral) {
		this.requisicionReturnGeneral = requisicionReturnGeneral;
	}	
	
	
	public String numero_secuencialBusquedaPorCodigo="";

	public String getnumero_secuencialBusquedaPorCodigo() {
		return this.numero_secuencialBusquedaPorCodigo;
	}

	public void setnumero_secuencialBusquedaPorCodigo(String numero_secuencialBusquedaPorCodigo) {
		this.numero_secuencialBusquedaPorCodigo = numero_secuencialBusquedaPorCodigo;
	}

	public Long id_bodega_solicitaFK_IdBodegaSolicita=-1L;

	public Long getid_bodega_solicitaFK_IdBodegaSolicita() {
		return this.id_bodega_solicitaFK_IdBodegaSolicita;
	}

	public void setid_bodega_solicitaFK_IdBodegaSolicita(Long id_bodega_solicitaFK_IdBodegaSolicita) {
		this.id_bodega_solicitaFK_IdBodegaSolicita = id_bodega_solicitaFK_IdBodegaSolicita;
	}

	public Long id_bodega_solicitarFK_IdBodegaSolicitar=-1L;

	public Long getid_bodega_solicitarFK_IdBodegaSolicitar() {
		return this.id_bodega_solicitarFK_IdBodegaSolicitar;
	}

	public void setid_bodega_solicitarFK_IdBodegaSolicitar(Long id_bodega_solicitarFK_IdBodegaSolicitar) {
		this.id_bodega_solicitarFK_IdBodegaSolicitar = id_bodega_solicitarFK_IdBodegaSolicitar;
	}

	public Long id_empleadoFK_IdEmpleado=-1L;

	public Long getid_empleadoFK_IdEmpleado() {
		return this.id_empleadoFK_IdEmpleado;
	}

	public void setid_empleadoFK_IdEmpleado(Long id_empleadoFK_IdEmpleado) {
		this.id_empleadoFK_IdEmpleado = id_empleadoFK_IdEmpleado;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_estado_requisicionFK_IdEstadoRequisicion=-1L;

	public Long getid_estado_requisicionFK_IdEstadoRequisicion() {
		return this.id_estado_requisicionFK_IdEstadoRequisicion;
	}

	public void setid_estado_requisicionFK_IdEstadoRequisicion(Long id_estado_requisicionFK_IdEstadoRequisicion) {
		this.id_estado_requisicionFK_IdEstadoRequisicion = id_estado_requisicionFK_IdEstadoRequisicion;
	}

	public Long id_formatoFK_IdFormato=-1L;

	public Long getid_formatoFK_IdFormato() {
		return this.id_formatoFK_IdFormato;
	}

	public void setid_formatoFK_IdFormato(Long id_formatoFK_IdFormato) {
		this.id_formatoFK_IdFormato = id_formatoFK_IdFormato;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

	public Long id_tipo_requisicionFK_IdTipoRequisicion=-1L;

	public Long getid_tipo_requisicionFK_IdTipoRequisicion() {
		return this.id_tipo_requisicionFK_IdTipoRequisicion;
	}

	public void setid_tipo_requisicionFK_IdTipoRequisicion(Long id_tipo_requisicionFK_IdTipoRequisicion) {
		this.id_tipo_requisicionFK_IdTipoRequisicion = id_tipo_requisicionFK_IdTipoRequisicion;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public RequisicionLogic getRequisicionLogic()	{		
		return requisicionLogic;
	}

	public void setRequisicionLogic(RequisicionLogic requisicionLogic) {
		this.requisicionLogic = requisicionLogic;
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
	
	public Boolean getIsEsNuevoRequisicion() {
		return isEsNuevoRequisicion;
	}

	public void setIsEsNuevoRequisicion(Boolean isEsNuevoRequisicion) {
		this.isEsNuevoRequisicion = isEsNuevoRequisicion;
	}

	public Boolean getEsParaAccionDesdeFormularioRequisicion() {
		return esParaAccionDesdeFormularioRequisicion;
	}
	
	public void setEsParaAccionDesdeFormularioRequisicion(Boolean esParaAccionDesdeFormularioRequisicion) {
		this.esParaAccionDesdeFormularioRequisicion = esParaAccionDesdeFormularioRequisicion;
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

			if(this.requisicionSessionBean==null) {
				this.requisicionSessionBean=new RequisicionSessionBean();
			}

			if(!this.requisicionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(requisicionSessionBean.getlidEmpresaActual());
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

			if(this.requisicionSessionBean==null) {
				this.requisicionSessionBean=new RequisicionSessionBean();
			}

			if(!this.requisicionSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(requisicionSessionBean.getlidSucursalActual());
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

	public void cargarCombosTipoRequisicionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tiporequisicionsForeignKey=new ArrayList<TipoRequisicion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoRequisicionLogic tiporequisicionLogic=new TipoRequisicionLogic();

			//tiporequisicionLogic.getTipoRequisicionDataAccess().setIsForForeingKeyData(true);

			if(this.requisicionSessionBean==null) {
				this.requisicionSessionBean=new RequisicionSessionBean();
			}

			if(!this.requisicionSessionBean.getisBusquedaDesdeForeignKeySesionTipoRequisicion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tiporequisicionLogic.getTipoRequisicionDataAccess().setIsForForeingKeyData(true);

					tiporequisicionLogic.getTodosTipoRequisicionsWithConnection(sFinalQuery,new Pagination());

					this.tiporequisicionsForeignKey=tiporequisicionLogic.getTipoRequisicions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoRequisicion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporequisicionLogic.getEntityWithConnection(requisicionSessionBean.getlidTipoRequisicionActual());
					this.tiporequisicionsForeignKey.add(tiporequisicionLogic.getTipoRequisicion());
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

	public void cargarCombosEmpleadosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empleadosForeignKey=new ArrayList<Empleado>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpleadoLogic empleadoLogic=new EmpleadoLogic();

			//empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

			if(this.requisicionSessionBean==null) {
				this.requisicionSessionBean=new RequisicionSessionBean();
			}

			if(!this.requisicionSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

					empleadoLogic.getTodosEmpleadosWithConnection(sFinalQuery,new Pagination());

					this.empleadosForeignKey=empleadoLogic.getEmpleados();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpleado(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoLogic.getEntityWithConnection(requisicionSessionBean.getlidEmpleadoActual());
					this.empleadosForeignKey.add(empleadoLogic.getEmpleado());
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

	public void cargarCombosEstadoRequisicionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.estadorequisicionsForeignKey=new ArrayList<EstadoRequisicion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EstadoRequisicionLogic estadorequisicionLogic=new EstadoRequisicionLogic();

			//estadorequisicionLogic.getEstadoRequisicionDataAccess().setIsForForeingKeyData(true);

			if(this.requisicionSessionBean==null) {
				this.requisicionSessionBean=new RequisicionSessionBean();
			}

			if(!this.requisicionSessionBean.getisBusquedaDesdeForeignKeySesionEstadoRequisicion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estadorequisicionLogic.getEstadoRequisicionDataAccess().setIsForForeingKeyData(true);

					estadorequisicionLogic.getTodosEstadoRequisicionsWithConnection(sFinalQuery,new Pagination());

					this.estadorequisicionsForeignKey=estadorequisicionLogic.getEstadoRequisicions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEstadoRequisicion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadorequisicionLogic.getEntityWithConnection(requisicionSessionBean.getlidEstadoRequisicionActual());
					this.estadorequisicionsForeignKey.add(estadorequisicionLogic.getEstadoRequisicion());
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

	public void cargarCombosFormatosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.formatosForeignKey=new ArrayList<Formato>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			FormatoLogic formatoLogic=new FormatoLogic();

			//formatoLogic.getFormatoDataAccess().setIsForForeingKeyData(true);

			if(this.requisicionSessionBean==null) {
				this.requisicionSessionBean=new RequisicionSessionBean();
			}

			if(!this.requisicionSessionBean.getisBusquedaDesdeForeignKeySesionFormato()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//formatoLogic.getFormatoDataAccess().setIsForForeingKeyData(true);

					formatoLogic.getTodosFormatosWithConnection(sFinalQuery,new Pagination());

					this.formatosForeignKey=formatoLogic.getFormatos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaFormato(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatoLogic.getEntityWithConnection(requisicionSessionBean.getlidFormatoActual());
					this.formatosForeignKey.add(formatoLogic.getFormato());
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

	public void cargarCombosBodegaSolicitarsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.bodegasolicitarsForeignKey=new ArrayList<Bodega>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			BodegaLogic bodegaLogic=new BodegaLogic();

			//bodegaLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

			if(this.requisicionSessionBean==null) {
				this.requisicionSessionBean=new RequisicionSessionBean();
			}

			if(!this.requisicionSessionBean.getisBusquedaDesdeForeignKeySesionBodegaSolicitar()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//bodegasolicitarLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

					bodegaLogic.getTodosBodegasWithConnection(sFinalQuery,new Pagination());

					this.bodegasolicitarsForeignKey=bodegaLogic.getBodegas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaBodegaSolicitar(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					bodegaLogic.getEntityWithConnection(requisicionSessionBean.getlidBodegaSolicitarActual());
					this.bodegasolicitarsForeignKey.add(bodegaLogic.getBodega());
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

	public void cargarCombosBodegaSolicitasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.bodegasolicitasForeignKey=new ArrayList<Bodega>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			BodegaLogic bodegaLogic=new BodegaLogic();

			//bodegaLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

			if(this.requisicionSessionBean==null) {
				this.requisicionSessionBean=new RequisicionSessionBean();
			}

			if(!this.requisicionSessionBean.getisBusquedaDesdeForeignKeySesionBodegaSolicita()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//bodegasolicitaLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

					bodegaLogic.getTodosBodegasWithConnection(sFinalQuery,new Pagination());

					this.bodegasolicitasForeignKey=bodegaLogic.getBodegas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaBodegaSolicita(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					bodegaLogic.getEntityWithConnection(requisicionSessionBean.getlidBodegaSolicitaActual());
					this.bodegasolicitasForeignKey.add(bodegaLogic.getBodega());
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

					if(this.requisicion!=null) {
						this.requisicion.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormRequisicion!=null) {
						this.jInternalFrameDetalleFormRequisicion.jComboBoxid_empresaRequisicion.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaRequisicion.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormRequisicion!=null) {
						if(this.jInternalFrameDetalleFormRequisicion.jComboBoxid_empresaRequisicion.getItemCount()>0) {
							this.jInternalFrameDetalleFormRequisicion.jComboBoxid_empresaRequisicion.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaRequisicionGenerico)throws Exception
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
				jComboBoxid_empresaRequisicionGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaRequisicionGenerico!=null && jComboBoxid_empresaRequisicionGenerico.getItemCount()>0) {
					jComboBoxid_empresaRequisicionGenerico.setSelectedIndex(0);
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

					if(this.requisicion!=null) {
						this.requisicion.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormRequisicion!=null) {
						this.jInternalFrameDetalleFormRequisicion.jComboBoxid_sucursalRequisicion.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalRequisicion.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormRequisicion!=null) {
						if(this.jInternalFrameDetalleFormRequisicion.jComboBoxid_sucursalRequisicion.getItemCount()>0) {
							this.jInternalFrameDetalleFormRequisicion.jComboBoxid_sucursalRequisicion.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalRequisicionGenerico)throws Exception
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
				jComboBoxid_sucursalRequisicionGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalRequisicionGenerico!=null && jComboBoxid_sucursalRequisicionGenerico.getItemCount()>0) {
					jComboBoxid_sucursalRequisicionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoRequisicionForeignKey(Long idTipoRequisicionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoRequisicion  tiporequisicionTemp=null;

			for(TipoRequisicion tiporequisicionAux:tiporequisicionsForeignKey) {
				if(tiporequisicionAux.getId()!=null && tiporequisicionAux.getId().equals(idTipoRequisicionSeleccionado)) {
					tiporequisicionTemp=tiporequisicionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tiporequisicionTemp!=null) {

					if(this.requisicion!=null) {
						this.requisicion.setTipoRequisicion(tiporequisicionTemp);
					}

					if(this.jInternalFrameDetalleFormRequisicion!=null) {
						this.jInternalFrameDetalleFormRequisicion.jComboBoxid_tipo_requisicionRequisicion.setSelectedItem(tiporequisicionTemp);
					}
				} else {
					//jComboBoxid_tipo_requisicionRequisicion.setSelectedItem(tiporequisicionTemp);
					if(this.jInternalFrameDetalleFormRequisicion!=null) {
						if(this.jInternalFrameDetalleFormRequisicion.jComboBoxid_tipo_requisicionRequisicion.getItemCount()>0) {
							this.jInternalFrameDetalleFormRequisicion.jComboBoxid_tipo_requisicionRequisicion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoRequisicion") || sFormularioTipoBusqueda.equals("Todos")){
					if(tiporequisicionTemp!=null && jComboBoxid_tipo_requisicionFK_IdTipoRequisicionRequisicion!=null) {
						jComboBoxid_tipo_requisicionFK_IdTipoRequisicionRequisicion.setSelectedItem(tiporequisicionTemp);
					} else {
						if(jComboBoxid_tipo_requisicionFK_IdTipoRequisicionRequisicion!=null) {
							//jComboBoxid_tipo_requisicionFK_IdTipoRequisicionRequisicion.setSelectedItem(tiporequisicionTemp);
							if(jComboBoxid_tipo_requisicionFK_IdTipoRequisicionRequisicion.getItemCount()>0) {
								jComboBoxid_tipo_requisicionFK_IdTipoRequisicionRequisicion.setSelectedIndex(0);
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

	public String getActualTipoRequisicionForeignKeyDescripcion(Long idTipoRequisicionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoRequisicion  tiporequisicionTemp=null;

			for(TipoRequisicion tiporequisicionAux:tiporequisicionsForeignKey) {
				if(tiporequisicionAux.getId()!=null && tiporequisicionAux.getId().equals(idTipoRequisicionSeleccionado)) {
					tiporequisicionTemp=tiporequisicionAux;
					break;
				}
			}


			sDescripcion=TipoRequisicionConstantesFunciones.getTipoRequisicionDescripcion(tiporequisicionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoRequisicionForeignKeyGenerico(Long idTipoRequisicionSeleccionado,JComboBox jComboBoxid_tipo_requisicionRequisicionGenerico)throws Exception
	{
		try
		{
			TipoRequisicion  tiporequisicionTemp=null;

			for(TipoRequisicion tiporequisicionAux:tiporequisicionsForeignKey) {
				if(tiporequisicionAux.getId()!=null && tiporequisicionAux.getId().equals(idTipoRequisicionSeleccionado)) {
					tiporequisicionTemp=tiporequisicionAux;
					break;
				}
			}

			if(tiporequisicionTemp!=null) {
				jComboBoxid_tipo_requisicionRequisicionGenerico.setSelectedItem(tiporequisicionTemp);
			} else {
				if(jComboBoxid_tipo_requisicionRequisicionGenerico!=null && jComboBoxid_tipo_requisicionRequisicionGenerico.getItemCount()>0) {
					jComboBoxid_tipo_requisicionRequisicionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEmpleadoForeignKey(Long idEmpleadoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empleadoTemp!=null) {

					if(this.requisicion!=null) {
						this.requisicion.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormRequisicion!=null) {
						this.jInternalFrameDetalleFormRequisicion.jComboBoxid_empleadoRequisicion.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoRequisicion.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormRequisicion!=null) {
						if(this.jInternalFrameDetalleFormRequisicion.jComboBoxid_empleadoRequisicion.getItemCount()>0) {
							this.jInternalFrameDetalleFormRequisicion.jComboBoxid_empleadoRequisicion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoRequisicion!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoRequisicion.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoRequisicion!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoRequisicion.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoRequisicion.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoRequisicion.setSelectedIndex(0);
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

	public String getActualEmpleadoForeignKeyDescripcion(Long idEmpleadoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}


			sDescripcion=EmpleadoConstantesFunciones.getEmpleadoDescripcion(empleadoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoRequisicionGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}

			if(empleadoTemp!=null) {
				jComboBoxid_empleadoRequisicionGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoRequisicionGenerico!=null && jComboBoxid_empleadoRequisicionGenerico.getItemCount()>0) {
					jComboBoxid_empleadoRequisicionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEstadoRequisicionForeignKey(Long idEstadoRequisicionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			EstadoRequisicion  estadorequisicionTemp=null;

			for(EstadoRequisicion estadorequisicionAux:estadorequisicionsForeignKey) {
				if(estadorequisicionAux.getId()!=null && estadorequisicionAux.getId().equals(idEstadoRequisicionSeleccionado)) {
					estadorequisicionTemp=estadorequisicionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(estadorequisicionTemp!=null) {

					if(this.requisicion!=null) {
						this.requisicion.setEstadoRequisicion(estadorequisicionTemp);
					}

					if(this.jInternalFrameDetalleFormRequisicion!=null) {
						this.jInternalFrameDetalleFormRequisicion.jComboBoxid_estado_requisicionRequisicion.setSelectedItem(estadorequisicionTemp);
					}
				} else {
					//jComboBoxid_estado_requisicionRequisicion.setSelectedItem(estadorequisicionTemp);
					if(this.jInternalFrameDetalleFormRequisicion!=null) {
						if(this.jInternalFrameDetalleFormRequisicion.jComboBoxid_estado_requisicionRequisicion.getItemCount()>0) {
							this.jInternalFrameDetalleFormRequisicion.jComboBoxid_estado_requisicionRequisicion.setSelectedIndex(0);
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

	public String getActualEstadoRequisicionForeignKeyDescripcion(Long idEstadoRequisicionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			EstadoRequisicion  estadorequisicionTemp=null;

			for(EstadoRequisicion estadorequisicionAux:estadorequisicionsForeignKey) {
				if(estadorequisicionAux.getId()!=null && estadorequisicionAux.getId().equals(idEstadoRequisicionSeleccionado)) {
					estadorequisicionTemp=estadorequisicionAux;
					break;
				}
			}


			sDescripcion=EstadoRequisicionConstantesFunciones.getEstadoRequisicionDescripcion(estadorequisicionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEstadoRequisicionForeignKeyGenerico(Long idEstadoRequisicionSeleccionado,JComboBox jComboBoxid_estado_requisicionRequisicionGenerico)throws Exception
	{
		try
		{
			EstadoRequisicion  estadorequisicionTemp=null;

			for(EstadoRequisicion estadorequisicionAux:estadorequisicionsForeignKey) {
				if(estadorequisicionAux.getId()!=null && estadorequisicionAux.getId().equals(idEstadoRequisicionSeleccionado)) {
					estadorequisicionTemp=estadorequisicionAux;
					break;
				}
			}

			if(estadorequisicionTemp!=null) {
				jComboBoxid_estado_requisicionRequisicionGenerico.setSelectedItem(estadorequisicionTemp);
			} else {
				if(jComboBoxid_estado_requisicionRequisicionGenerico!=null && jComboBoxid_estado_requisicionRequisicionGenerico.getItemCount()>0) {
					jComboBoxid_estado_requisicionRequisicionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualFormatoForeignKey(Long idFormatoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Formato  formatoTemp=null;

			for(Formato formatoAux:formatosForeignKey) {
				if(formatoAux.getId()!=null && formatoAux.getId().equals(idFormatoSeleccionado)) {
					formatoTemp=formatoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(formatoTemp!=null) {

					if(this.requisicion!=null) {
						this.requisicion.setFormato(formatoTemp);
					}

					if(this.jInternalFrameDetalleFormRequisicion!=null) {
						this.jInternalFrameDetalleFormRequisicion.jComboBoxid_formatoRequisicion.setSelectedItem(formatoTemp);
					}
				} else {
					//jComboBoxid_formatoRequisicion.setSelectedItem(formatoTemp);
					if(this.jInternalFrameDetalleFormRequisicion!=null) {
						if(this.jInternalFrameDetalleFormRequisicion.jComboBoxid_formatoRequisicion.getItemCount()>0) {
							this.jInternalFrameDetalleFormRequisicion.jComboBoxid_formatoRequisicion.setSelectedIndex(0);
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

	public String getActualFormatoForeignKeyDescripcion(Long idFormatoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Formato  formatoTemp=null;

			for(Formato formatoAux:formatosForeignKey) {
				if(formatoAux.getId()!=null && formatoAux.getId().equals(idFormatoSeleccionado)) {
					formatoTemp=formatoAux;
					break;
				}
			}


			sDescripcion=FormatoConstantesFunciones.getFormatoDescripcion(formatoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualFormatoForeignKeyGenerico(Long idFormatoSeleccionado,JComboBox jComboBoxid_formatoRequisicionGenerico)throws Exception
	{
		try
		{
			Formato  formatoTemp=null;

			for(Formato formatoAux:formatosForeignKey) {
				if(formatoAux.getId()!=null && formatoAux.getId().equals(idFormatoSeleccionado)) {
					formatoTemp=formatoAux;
					break;
				}
			}

			if(formatoTemp!=null) {
				jComboBoxid_formatoRequisicionGenerico.setSelectedItem(formatoTemp);
			} else {
				if(jComboBoxid_formatoRequisicionGenerico!=null && jComboBoxid_formatoRequisicionGenerico.getItemCount()>0) {
					jComboBoxid_formatoRequisicionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualBodegaSolicitarForeignKey(Long idBodegaSolicitarSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Bodega  bodegasolicitarTemp=null;

			for(Bodega bodegasolicitarAux:bodegasolicitarsForeignKey) {
				if(bodegasolicitarAux.getId()!=null && bodegasolicitarAux.getId().equals(idBodegaSolicitarSeleccionado)) {
					bodegasolicitarTemp=bodegasolicitarAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(bodegasolicitarTemp!=null) {

					if(this.requisicion!=null) {
						this.requisicion.setBodegaSolicitar(bodegasolicitarTemp);
					}

					if(this.jInternalFrameDetalleFormRequisicion!=null) {
						this.jInternalFrameDetalleFormRequisicion.jComboBoxid_bodega_solicitarRequisicion.setSelectedItem(bodegasolicitarTemp);
					}
				} else {
					//jComboBoxid_bodega_solicitarRequisicion.setSelectedItem(bodegasolicitarTemp);
					if(this.jInternalFrameDetalleFormRequisicion!=null) {
						if(this.jInternalFrameDetalleFormRequisicion.jComboBoxid_bodega_solicitarRequisicion.getItemCount()>0) {
							this.jInternalFrameDetalleFormRequisicion.jComboBoxid_bodega_solicitarRequisicion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBodegaSolicitar") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegasolicitarTemp!=null && jComboBoxid_bodega_solicitarFK_IdBodegaSolicitarRequisicion!=null) {
						jComboBoxid_bodega_solicitarFK_IdBodegaSolicitarRequisicion.setSelectedItem(bodegasolicitarTemp);
					} else {
						if(jComboBoxid_bodega_solicitarFK_IdBodegaSolicitarRequisicion!=null) {
							//jComboBoxid_bodega_solicitarFK_IdBodegaSolicitarRequisicion.setSelectedItem(bodegasolicitarTemp);
							if(jComboBoxid_bodega_solicitarFK_IdBodegaSolicitarRequisicion.getItemCount()>0) {
								jComboBoxid_bodega_solicitarFK_IdBodegaSolicitarRequisicion.setSelectedIndex(0);
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

	public String getActualBodegaSolicitarForeignKeyDescripcion(Long idBodegaSolicitarSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Bodega  bodegasolicitarTemp=null;

			for(Bodega bodegasolicitarAux:bodegasolicitarsForeignKey) {
				if(bodegasolicitarAux.getId()!=null && bodegasolicitarAux.getId().equals(idBodegaSolicitarSeleccionado)) {
					bodegasolicitarTemp=bodegasolicitarAux;
					break;
				}
			}


			sDescripcion=BodegaConstantesFunciones.getBodegaDescripcion(bodegasolicitarTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualBodegaSolicitarForeignKeyGenerico(Long idBodegaSolicitarSeleccionado,JComboBox jComboBoxid_bodega_solicitarRequisicionGenerico)throws Exception
	{
		try
		{
			Bodega  bodegasolicitarTemp=null;

			for(Bodega bodegasolicitarAux:bodegasolicitarsForeignKey) {
				if(bodegasolicitarAux.getId()!=null && bodegasolicitarAux.getId().equals(idBodegaSolicitarSeleccionado)) {
					bodegasolicitarTemp=bodegasolicitarAux;
					break;
				}
			}

			if(bodegasolicitarTemp!=null) {
				jComboBoxid_bodega_solicitarRequisicionGenerico.setSelectedItem(bodegasolicitarTemp);
			} else {
				if(jComboBoxid_bodega_solicitarRequisicionGenerico!=null && jComboBoxid_bodega_solicitarRequisicionGenerico.getItemCount()>0) {
					jComboBoxid_bodega_solicitarRequisicionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualBodegaSolicitaForeignKey(Long idBodegaSolicitaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Bodega  bodegasolicitaTemp=null;

			for(Bodega bodegasolicitaAux:bodegasolicitasForeignKey) {
				if(bodegasolicitaAux.getId()!=null && bodegasolicitaAux.getId().equals(idBodegaSolicitaSeleccionado)) {
					bodegasolicitaTemp=bodegasolicitaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(bodegasolicitaTemp!=null) {

					if(this.requisicion!=null) {
						this.requisicion.setBodegaSolicita(bodegasolicitaTemp);
					}

					if(this.jInternalFrameDetalleFormRequisicion!=null) {
						this.jInternalFrameDetalleFormRequisicion.jComboBoxid_bodega_solicitaRequisicion.setSelectedItem(bodegasolicitaTemp);
					}
				} else {
					//jComboBoxid_bodega_solicitaRequisicion.setSelectedItem(bodegasolicitaTemp);
					if(this.jInternalFrameDetalleFormRequisicion!=null) {
						if(this.jInternalFrameDetalleFormRequisicion.jComboBoxid_bodega_solicitaRequisicion.getItemCount()>0) {
							this.jInternalFrameDetalleFormRequisicion.jComboBoxid_bodega_solicitaRequisicion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBodegaSolicita") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegasolicitaTemp!=null && jComboBoxid_bodega_solicitaFK_IdBodegaSolicitaRequisicion!=null) {
						jComboBoxid_bodega_solicitaFK_IdBodegaSolicitaRequisicion.setSelectedItem(bodegasolicitaTemp);
					} else {
						if(jComboBoxid_bodega_solicitaFK_IdBodegaSolicitaRequisicion!=null) {
							//jComboBoxid_bodega_solicitaFK_IdBodegaSolicitaRequisicion.setSelectedItem(bodegasolicitaTemp);
							if(jComboBoxid_bodega_solicitaFK_IdBodegaSolicitaRequisicion.getItemCount()>0) {
								jComboBoxid_bodega_solicitaFK_IdBodegaSolicitaRequisicion.setSelectedIndex(0);
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

	public String getActualBodegaSolicitaForeignKeyDescripcion(Long idBodegaSolicitaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Bodega  bodegasolicitaTemp=null;

			for(Bodega bodegasolicitaAux:bodegasolicitasForeignKey) {
				if(bodegasolicitaAux.getId()!=null && bodegasolicitaAux.getId().equals(idBodegaSolicitaSeleccionado)) {
					bodegasolicitaTemp=bodegasolicitaAux;
					break;
				}
			}


			sDescripcion=BodegaConstantesFunciones.getBodegaDescripcion(bodegasolicitaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualBodegaSolicitaForeignKeyGenerico(Long idBodegaSolicitaSeleccionado,JComboBox jComboBoxid_bodega_solicitaRequisicionGenerico)throws Exception
	{
		try
		{
			Bodega  bodegasolicitaTemp=null;

			for(Bodega bodegasolicitaAux:bodegasolicitasForeignKey) {
				if(bodegasolicitaAux.getId()!=null && bodegasolicitaAux.getId().equals(idBodegaSolicitaSeleccionado)) {
					bodegasolicitaTemp=bodegasolicitaAux;
					break;
				}
			}

			if(bodegasolicitaTemp!=null) {
				jComboBoxid_bodega_solicitaRequisicionGenerico.setSelectedItem(bodegasolicitaTemp);
			} else {
				if(jComboBoxid_bodega_solicitaRequisicionGenerico!=null && jComboBoxid_bodega_solicitaRequisicionGenerico.getItemCount()>0) {
					jComboBoxid_bodega_solicitaRequisicionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Requisicion requisicion,JComboBox jComboBoxid_empresaRequisicionGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaRequisicionGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormRequisicion.jComboBoxid_empresaRequisicion.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaRequisicionGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				requisicion.setid_empresa(empresaAux.getId());
				requisicion.setempresa_descripcion(RequisicionConstantesFunciones.getEmpresaDescripcion(empresaAux));
				requisicion.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(Requisicion requisicion,JComboBox jComboBoxid_sucursalRequisicionGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalRequisicionGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormRequisicion.jComboBoxid_sucursalRequisicion.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalRequisicionGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				requisicion.setid_sucursal(sucursalAux.getId());
				requisicion.setsucursal_descripcion(RequisicionConstantesFunciones.getSucursalDescripcion(sucursalAux));
				requisicion.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoRequisicionForeignKey(Requisicion requisicion,JComboBox jComboBoxid_tipo_requisicionRequisicionGenerico)throws Exception
	{
		try
		{
			TipoRequisicion  tiporequisicionAux=new TipoRequisicion();

			if(jComboBoxid_tipo_requisicionRequisicionGenerico==null) {
				tiporequisicionAux=(TipoRequisicion)this.jInternalFrameDetalleFormRequisicion.jComboBoxid_tipo_requisicionRequisicion.getSelectedItem();
			} else {
				tiporequisicionAux=(TipoRequisicion)jComboBoxid_tipo_requisicionRequisicionGenerico.getSelectedItem();
			}

			if(tiporequisicionAux!=null && tiporequisicionAux.getId()!=null) {
				requisicion.setid_tipo_requisicion(tiporequisicionAux.getId());
				requisicion.settiporequisicion_descripcion(RequisicionConstantesFunciones.getTipoRequisicionDescripcion(tiporequisicionAux));
				requisicion.setTipoRequisicion(tiporequisicionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(Requisicion requisicion,JComboBox jComboBoxid_empleadoRequisicionGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoRequisicionGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormRequisicion.jComboBoxid_empleadoRequisicion.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoRequisicionGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				requisicion.setid_empleado(empleadoAux.getId());
				requisicion.setempleado_descripcion(RequisicionConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				requisicion.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstadoRequisicionForeignKey(Requisicion requisicion,JComboBox jComboBoxid_estado_requisicionRequisicionGenerico)throws Exception
	{
		try
		{
			EstadoRequisicion  estadorequisicionAux=new EstadoRequisicion();

			if(jComboBoxid_estado_requisicionRequisicionGenerico==null) {
				estadorequisicionAux=(EstadoRequisicion)this.jInternalFrameDetalleFormRequisicion.jComboBoxid_estado_requisicionRequisicion.getSelectedItem();
			} else {
				estadorequisicionAux=(EstadoRequisicion)jComboBoxid_estado_requisicionRequisicionGenerico.getSelectedItem();
			}

			if(estadorequisicionAux!=null && estadorequisicionAux.getId()!=null) {
				requisicion.setid_estado_requisicion(estadorequisicionAux.getId());
				requisicion.setestadorequisicion_descripcion(RequisicionConstantesFunciones.getEstadoRequisicionDescripcion(estadorequisicionAux));
				requisicion.setEstadoRequisicion(estadorequisicionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFormatoForeignKey(Requisicion requisicion,JComboBox jComboBoxid_formatoRequisicionGenerico)throws Exception
	{
		try
		{
			Formato  formatoAux=new Formato();

			if(jComboBoxid_formatoRequisicionGenerico==null) {
				formatoAux=(Formato)this.jInternalFrameDetalleFormRequisicion.jComboBoxid_formatoRequisicion.getSelectedItem();
			} else {
				formatoAux=(Formato)jComboBoxid_formatoRequisicionGenerico.getSelectedItem();
			}

			if(formatoAux!=null && formatoAux.getId()!=null) {
				requisicion.setid_formato(formatoAux.getId());
				requisicion.setformato_descripcion(RequisicionConstantesFunciones.getFormatoDescripcion(formatoAux));
				requisicion.setFormato(formatoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaSolicitarForeignKey(Requisicion requisicion,JComboBox jComboBoxid_bodega_solicitarRequisicionGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodega_solicitarRequisicionGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormRequisicion.jComboBoxid_bodega_solicitarRequisicion.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodega_solicitarRequisicionGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				requisicion.setid_bodega_solicitar(bodegaAux.getId());
				requisicion.setbodegasolicitar_descripcion(RequisicionConstantesFunciones.getBodegaSolicitarDescripcion(bodegaAux));
				requisicion.setBodegaSolicitar(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaSolicitaForeignKey(Requisicion requisicion,JComboBox jComboBoxid_bodega_solicitaRequisicionGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodega_solicitaRequisicionGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormRequisicion.jComboBoxid_bodega_solicitaRequisicion.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodega_solicitaRequisicionGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				requisicion.setid_bodega_solicita(bodegaAux.getId());
				requisicion.setbodegasolicita_descripcion(RequisicionConstantesFunciones.getBodegaSolicitaDescripcion(bodegaAux));
				requisicion.setBodegaSolicita(bodegaAux);			}
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

					if(!RequisicionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRequisicion!=null) { 
							this.jInternalFrameDetalleFormRequisicion.jComboBoxid_empresaRequisicion.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormRequisicion.jComboBoxid_empresaRequisicion.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRequisicion!=null) { 
					}

					if(!RequisicionJInternalFrame.ISBINDING_MANUAL) {
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

					if(!RequisicionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRequisicion!=null) { 
							this.jInternalFrameDetalleFormRequisicion.jComboBoxid_sucursalRequisicion.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormRequisicion.jComboBoxid_sucursalRequisicion.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRequisicion!=null) { 
					}

					if(!RequisicionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoRequisicionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoRequisicion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!RequisicionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRequisicion!=null) { 
							this.jInternalFrameDetalleFormRequisicion.jComboBoxid_tipo_requisicionRequisicion.removeAllItems();

							for(TipoRequisicion tiporequisicion:this.tiporequisicionsForeignKey) {
								this.jInternalFrameDetalleFormRequisicion.jComboBoxid_tipo_requisicionRequisicion.addItem(tiporequisicion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRequisicion!=null) { 
					}

					if(!RequisicionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoRequisicion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!RequisicionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_requisicionFK_IdTipoRequisicionRequisicion.removeAllItems();

							for(TipoRequisicion tiporequisicion:this.tiporequisicionsForeignKey) {
								this.jComboBoxid_tipo_requisicionFK_IdTipoRequisicionRequisicion.addItem(tiporequisicion);
							}
						}

						if(!RequisicionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpleadosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpleado=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!RequisicionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRequisicion!=null) { 
							this.jInternalFrameDetalleFormRequisicion.jComboBoxid_empleadoRequisicion.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormRequisicion.jComboBoxid_empleadoRequisicion.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRequisicion!=null) { 
					}

					if(!RequisicionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!RequisicionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoRequisicion.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoRequisicion.addItem(empleado);
							}
						}

						if(!RequisicionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEstadoRequisicionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEstadoRequisicion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!RequisicionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRequisicion!=null) { 
							this.jInternalFrameDetalleFormRequisicion.jComboBoxid_estado_requisicionRequisicion.removeAllItems();

							for(EstadoRequisicion estadorequisicion:this.estadorequisicionsForeignKey) {
								this.jInternalFrameDetalleFormRequisicion.jComboBoxid_estado_requisicionRequisicion.addItem(estadorequisicion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRequisicion!=null) { 
					}

					if(!RequisicionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameFormatosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingFormato=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!RequisicionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRequisicion!=null) { 
							this.jInternalFrameDetalleFormRequisicion.jComboBoxid_formatoRequisicion.removeAllItems();

							for(Formato formato:this.formatosForeignKey) {
								this.jInternalFrameDetalleFormRequisicion.jComboBoxid_formatoRequisicion.addItem(formato);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRequisicion!=null) { 
					}

					if(!RequisicionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameBodegaSolicitarsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingBodega=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!RequisicionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRequisicion!=null) { 
							this.jInternalFrameDetalleFormRequisicion.jComboBoxid_bodega_solicitarRequisicion.removeAllItems();

							for(Bodega bodegasolicitar:this.bodegasolicitarsForeignKey) {
								this.jInternalFrameDetalleFormRequisicion.jComboBoxid_bodega_solicitarRequisicion.addItem(bodegasolicitar);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRequisicion!=null) { 
					}

					if(!RequisicionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBodegaSolicitar") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!RequisicionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodega_solicitarFK_IdBodegaSolicitarRequisicion.removeAllItems();

							for(Bodega bodegasolicitar:this.bodegasolicitarsForeignKey) {
								this.jComboBoxid_bodega_solicitarFK_IdBodegaSolicitarRequisicion.addItem(bodegasolicitar);
							}
						}

						if(!RequisicionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameBodegaSolicitasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingBodega=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!RequisicionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRequisicion!=null) { 
							this.jInternalFrameDetalleFormRequisicion.jComboBoxid_bodega_solicitaRequisicion.removeAllItems();

							for(Bodega bodegasolicita:this.bodegasolicitasForeignKey) {
								this.jInternalFrameDetalleFormRequisicion.jComboBoxid_bodega_solicitaRequisicion.addItem(bodegasolicita);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRequisicion!=null) { 
					}

					if(!RequisicionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBodegaSolicita") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!RequisicionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodega_solicitaFK_IdBodegaSolicitaRequisicion.removeAllItems();

							for(Bodega bodegasolicita:this.bodegasolicitasForeignKey) {
								this.jComboBoxid_bodega_solicitaFK_IdBodegaSolicitaRequisicion.addItem(bodegasolicita);
							}
						}

						if(!RequisicionJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormRequisicion!=null) {
							this.jInternalFrameDetalleFormRequisicion.jComboBoxid_empresaRequisicion.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormRequisicion!=null) {
							this.jInternalFrameDetalleFormRequisicion.jComboBoxid_empresaRequisicion.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormRequisicion!=null) {
							this.jInternalFrameDetalleFormRequisicion.jComboBoxid_sucursalRequisicion.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormRequisicion!=null) {
							this.jInternalFrameDetalleFormRequisicion.jComboBoxid_sucursalRequisicion.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTipoRequisicionForeignKey(TipoRequisicion tiporequisicion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormRequisicion!=null) {
							this.jInternalFrameDetalleFormRequisicion.jComboBoxid_tipo_requisicionRequisicion.setSelectedItem(tiporequisicion);
						}
					} else {
						if(this.jInternalFrameDetalleFormRequisicion!=null) {
							this.jInternalFrameDetalleFormRequisicion.jComboBoxid_tipo_requisicionRequisicion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_requisicionFK_IdTipoRequisicionRequisicion.setSelectedItem(tiporequisicion);
						} else {
							this.jComboBoxid_tipo_requisicionFK_IdTipoRequisicionRequisicion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEmpleadoForeignKey(Empleado empleado,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormRequisicion!=null) {
							this.jInternalFrameDetalleFormRequisicion.jComboBoxid_empleadoRequisicion.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormRequisicion!=null) {
							this.jInternalFrameDetalleFormRequisicion.jComboBoxid_empleadoRequisicion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoRequisicion.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoRequisicion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEstadoRequisicionForeignKey(EstadoRequisicion estadorequisicion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormRequisicion!=null) {
							this.jInternalFrameDetalleFormRequisicion.jComboBoxid_estado_requisicionRequisicion.setSelectedItem(estadorequisicion);
						}
					} else {
						if(this.jInternalFrameDetalleFormRequisicion!=null) {
							this.jInternalFrameDetalleFormRequisicion.jComboBoxid_estado_requisicionRequisicion.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameFormatoForeignKey(Formato formato,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormRequisicion!=null) {
							this.jInternalFrameDetalleFormRequisicion.jComboBoxid_formatoRequisicion.setSelectedItem(formato);
						}
					} else {
						if(this.jInternalFrameDetalleFormRequisicion!=null) {
							this.jInternalFrameDetalleFormRequisicion.jComboBoxid_formatoRequisicion.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameBodegaSolicitarForeignKey(Bodega bodegasolicitar,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormRequisicion!=null) {
							this.jInternalFrameDetalleFormRequisicion.jComboBoxid_bodega_solicitarRequisicion.setSelectedItem(bodegasolicitar);
						}
					} else {
						if(this.jInternalFrameDetalleFormRequisicion!=null) {
							this.jInternalFrameDetalleFormRequisicion.jComboBoxid_bodega_solicitarRequisicion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodega_solicitarFK_IdBodegaSolicitarRequisicion.setSelectedItem(bodegasolicitar);
						} else {
							this.jComboBoxid_bodega_solicitarFK_IdBodegaSolicitarRequisicion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameBodegaSolicitaForeignKey(Bodega bodegasolicita,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormRequisicion!=null) {
							this.jInternalFrameDetalleFormRequisicion.jComboBoxid_bodega_solicitaRequisicion.setSelectedItem(bodegasolicita);
						}
					} else {
						if(this.jInternalFrameDetalleFormRequisicion!=null) {
							this.jInternalFrameDetalleFormRequisicion.jComboBoxid_bodega_solicitaRequisicion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodega_solicitaFK_IdBodegaSolicitaRequisicion.setSelectedItem(bodegasolicita);
						} else {
							this.jComboBoxid_bodega_solicitaFK_IdBodegaSolicitaRequisicion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesRequisicion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			RequisicionConstantesFunciones.refrescarForeignKeysDescripcionesRequisicion(this.requisicionLogic.getRequisicions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			RequisicionConstantesFunciones.refrescarForeignKeysDescripcionesRequisicion(this.requisicions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(TipoRequisicion.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(EstadoRequisicion.class));
		classes.add(new Classe(Formato.class));
		classes.add(new Classe(Bodega.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//requisicionLogic.setRequisicions(this.requisicions);
			requisicionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public RequisicionParameterReturnGeneral getRequisicionParameterGeneral() {
		return this.requisicionParameterGeneral;
	}
	
	public void setRequisicionParameterGeneral(RequisicionParameterReturnGeneral requisicionParameterGeneral) {
		this.requisicionParameterGeneral = requisicionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoRequisicion() {
		return isPermisoTodoRequisicion;
	}

	public void setIsPermisoTodoRequisicion(Boolean isPermisoTodoRequisicion) {
		this.isPermisoTodoRequisicion = isPermisoTodoRequisicion;
	}

	public Boolean getIsPermisoNuevoRequisicion() {
		return isPermisoNuevoRequisicion;
	}

	public void setIsPermisoNuevoRequisicion(Boolean isPermisoNuevoRequisicion) {
		this.isPermisoNuevoRequisicion = isPermisoNuevoRequisicion;
	}

	public Boolean getIsPermisoActualizarRequisicion() {
		return isPermisoActualizarRequisicion;
	}

	public void setIsPermisoActualizarRequisicion(Boolean isPermisoActualizarRequisicion) {
		this.isPermisoActualizarRequisicion = isPermisoActualizarRequisicion;
	}

	public Boolean getIsPermisoEliminarRequisicion() {
		return isPermisoEliminarRequisicion;
	}

	public void setIsPermisoEliminarRequisicion(Boolean isPermisoEliminarRequisicion) {
		this.isPermisoEliminarRequisicion = isPermisoEliminarRequisicion;
	}

	public Boolean getIsPermisoGuardarCambiosRequisicion() {
		return isPermisoGuardarCambiosRequisicion;
	}

	public void setIsPermisoGuardarCambiosRequisicion(Boolean isPermisoGuardarCambiosRequisicion) {
		this.isPermisoGuardarCambiosRequisicion = isPermisoGuardarCambiosRequisicion;
	}
	
	public Boolean getIsPermisoConsultaRequisicion() {
		return isPermisoConsultaRequisicion;
	}

	public void setIsPermisoConsultaRequisicion(Boolean isPermisoConsultaRequisicion) {
		this.isPermisoConsultaRequisicion = isPermisoConsultaRequisicion;
	}

	public Boolean getIsPermisoBusquedaRequisicion() {
		return isPermisoBusquedaRequisicion;
	}

	public void setIsPermisoBusquedaRequisicion(Boolean isPermisoBusquedaRequisicion) {
		this.isPermisoBusquedaRequisicion = isPermisoBusquedaRequisicion;
	}

	public Boolean getIsPermisoReporteRequisicion() {
		return isPermisoReporteRequisicion;
	}

	public void setIsPermisoReporteRequisicion(Boolean isPermisoReporteRequisicion) {
		this.isPermisoReporteRequisicion = isPermisoReporteRequisicion;
	}
	
	public Boolean getIsPermisoPaginacionMedioRequisicion() {
		return isPermisoPaginacionMedioRequisicion;
	}

	public void setIsPermisoPaginacionMedioRequisicion(Boolean isPermisoPaginacionMedioRequisicion) {
		this.isPermisoPaginacionMedioRequisicion = isPermisoPaginacionMedioRequisicion;
	}
	
	public Boolean getIsPermisoPaginacionTodoRequisicion() {
		return isPermisoPaginacionTodoRequisicion;
	}

	public void setIsPermisoPaginacionTodoRequisicion(Boolean isPermisoPaginacionTodoRequisicion) {
		this.isPermisoPaginacionTodoRequisicion = isPermisoPaginacionTodoRequisicion;
	}
	
	public Boolean getIsPermisoPaginacionAltoRequisicion() {
		return isPermisoPaginacionAltoRequisicion;
	}

	public void setIsPermisoPaginacionAltoRequisicion(Boolean isPermisoPaginacionAltoRequisicion) {
		this.isPermisoPaginacionAltoRequisicion = isPermisoPaginacionAltoRequisicion;
	}
	
	public Boolean getIsPermisoCopiarRequisicion() {
		return isPermisoCopiarRequisicion;
	}

	public void setIsPermisoCopiarRequisicion(Boolean isPermisoCopiarRequisicion) {
		this.isPermisoCopiarRequisicion = isPermisoCopiarRequisicion;
	}
	
	public Boolean getIsPermisoVerFormRequisicion() {
		return isPermisoVerFormRequisicion;
	}

	public void setIsPermisoVerFormRequisicion(Boolean isPermisoVerFormRequisicion) {
		this.isPermisoVerFormRequisicion = isPermisoVerFormRequisicion;
	}
	
	public Boolean getIsPermisoDuplicarRequisicion() {
		return isPermisoDuplicarRequisicion;
	}

	public void setIsPermisoDuplicarRequisicion(Boolean isPermisoDuplicarRequisicion) {
		this.isPermisoDuplicarRequisicion = isPermisoDuplicarRequisicion;
	}
	
	public Boolean getIsPermisoOrdenRequisicion() {
		return isPermisoOrdenRequisicion;
	}

	public void setIsPermisoOrdenRequisicion(Boolean isPermisoOrdenRequisicion) {
		this.isPermisoOrdenRequisicion = isPermisoOrdenRequisicion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoRequisicion() {
		return isVisibilidadCeldaNuevoRequisicion;
	}

	public void setIsVisibilidadCeldaNuevoRequisicion(Boolean isVisibilidadCeldaNuevoRequisicion) {
		this.isVisibilidadCeldaNuevoRequisicion = isVisibilidadCeldaNuevoRequisicion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarRequisicion() {
		return isVisibilidadCeldaDuplicarRequisicion;
	}

	public void setIsVisibilidadCeldaDuplicarRequisicion(Boolean isVisibilidadCeldaDuplicarRequisicion) {
		this.isVisibilidadCeldaDuplicarRequisicion = isVisibilidadCeldaDuplicarRequisicion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarRequisicion() {
		return isVisibilidadCeldaCopiarRequisicion;
	}

	public void setIsVisibilidadCeldaCopiarRequisicion(Boolean isVisibilidadCeldaCopiarRequisicion) {
		this.isVisibilidadCeldaCopiarRequisicion = isVisibilidadCeldaCopiarRequisicion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormRequisicion() {
		return isVisibilidadCeldaVerFormRequisicion;
	}

	public void setIsVisibilidadCeldaVerFormRequisicion(Boolean isVisibilidadCeldaVerFormRequisicion) {
		this.isVisibilidadCeldaVerFormRequisicion = isVisibilidadCeldaVerFormRequisicion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenRequisicion() {
		return isVisibilidadCeldaOrdenRequisicion;
	}

	public void setIsVisibilidadCeldaOrdenRequisicion(Boolean isVisibilidadCeldaOrdenRequisicion) {
		this.isVisibilidadCeldaOrdenRequisicion = isVisibilidadCeldaOrdenRequisicion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesRequisicion() {
		return isVisibilidadCeldaNuevoRelacionesRequisicion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesRequisicion(Boolean isVisibilidadCeldaNuevoRelacionesRequisicion) {
		this.isVisibilidadCeldaNuevoRelacionesRequisicion = isVisibilidadCeldaNuevoRelacionesRequisicion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarRequisicion() {
		return isVisibilidadCeldaModificarRequisicion;
	}

	public void setIsVisibilidadCeldaModificarRequisicion(Boolean isVisibilidadCeldaModificarRequisicion) {
		this.isVisibilidadCeldaModificarRequisicion = isVisibilidadCeldaModificarRequisicion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarRequisicion() {
		return isVisibilidadCeldaActualizarRequisicion;
	}

	public void setIsVisibilidadCeldaActualizarRequisicion(Boolean isVisibilidadCeldaActualizarRequisicion) {
		this.isVisibilidadCeldaActualizarRequisicion = isVisibilidadCeldaActualizarRequisicion;
	}

	public Boolean getIsVisibilidadCeldaEliminarRequisicion() {
		return isVisibilidadCeldaEliminarRequisicion;
	}

	public void setIsVisibilidadCeldaEliminarRequisicion(Boolean isVisibilidadCeldaEliminarRequisicion) {
		this.isVisibilidadCeldaEliminarRequisicion = isVisibilidadCeldaEliminarRequisicion;
	}

	public Boolean getIsVisibilidadCeldaCancelarRequisicion() {
		return isVisibilidadCeldaCancelarRequisicion;
	}

	public void setIsVisibilidadCeldaCancelarRequisicion(Boolean isVisibilidadCeldaCancelarRequisicion) {
		this.isVisibilidadCeldaCancelarRequisicion = isVisibilidadCeldaCancelarRequisicion;
	}

	public Boolean getIsVisibilidadCeldaGuardarRequisicion() {
		return isVisibilidadCeldaGuardarRequisicion;
	}

	public void setIsVisibilidadCeldaGuardarRequisicion(Boolean isVisibilidadCeldaGuardarRequisicion) {
		this.isVisibilidadCeldaGuardarRequisicion = isVisibilidadCeldaGuardarRequisicion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosRequisicion() {
		return isVisibilidadCeldaGuardarCambiosRequisicion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosRequisicion(Boolean isVisibilidadCeldaGuardarCambiosRequisicion) {
		this.isVisibilidadCeldaGuardarCambiosRequisicion = isVisibilidadCeldaGuardarCambiosRequisicion;
	}
		
	public RequisicionSessionBean getrequisicionSessionBean() {
		return this.requisicionSessionBean;
	}
	
	public void setrequisicionSessionBean(RequisicionSessionBean requisicionSessionBean) {
		this.requisicionSessionBean=requisicionSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorCodigo() {
		return this.isVisibilidadBusquedaPorCodigo;
	}

	public void setisVisibilidadBusquedaPorCodigo(Boolean isVisibilidadBusquedaPorCodigo) {
		this.isVisibilidadBusquedaPorCodigo=isVisibilidadBusquedaPorCodigo;
	}

	public Boolean getisVisibilidadFK_IdBodegaSolicita() {
		return this.isVisibilidadFK_IdBodegaSolicita;
	}

	public void setisVisibilidadFK_IdBodegaSolicita(Boolean isVisibilidadFK_IdBodegaSolicita) {
		this.isVisibilidadFK_IdBodegaSolicita=isVisibilidadFK_IdBodegaSolicita;
	}

	public Boolean getisVisibilidadFK_IdBodegaSolicitar() {
		return this.isVisibilidadFK_IdBodegaSolicitar;
	}

	public void setisVisibilidadFK_IdBodegaSolicitar(Boolean isVisibilidadFK_IdBodegaSolicitar) {
		this.isVisibilidadFK_IdBodegaSolicitar=isVisibilidadFK_IdBodegaSolicitar;
	}

	public Boolean getisVisibilidadFK_IdEmpleado() {
		return this.isVisibilidadFK_IdEmpleado;
	}

	public void setisVisibilidadFK_IdEmpleado(Boolean isVisibilidadFK_IdEmpleado) {
		this.isVisibilidadFK_IdEmpleado=isVisibilidadFK_IdEmpleado;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdEstadoRequisicion() {
		return this.isVisibilidadFK_IdEstadoRequisicion;
	}

	public void setisVisibilidadFK_IdEstadoRequisicion(Boolean isVisibilidadFK_IdEstadoRequisicion) {
		this.isVisibilidadFK_IdEstadoRequisicion=isVisibilidadFK_IdEstadoRequisicion;
	}

	public Boolean getisVisibilidadFK_IdFormato() {
		return this.isVisibilidadFK_IdFormato;
	}

	public void setisVisibilidadFK_IdFormato(Boolean isVisibilidadFK_IdFormato) {
		this.isVisibilidadFK_IdFormato=isVisibilidadFK_IdFormato;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	public Boolean getisVisibilidadFK_IdTipoRequisicion() {
		return this.isVisibilidadFK_IdTipoRequisicion;
	}

	public void setisVisibilidadFK_IdTipoRequisicion(Boolean isVisibilidadFK_IdTipoRequisicion) {
		this.isVisibilidadFK_IdTipoRequisicion=isVisibilidadFK_IdTipoRequisicion;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysRequisicion(Requisicion requisicion)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(requisicion,null);
				this.setActualParaGuardarSucursalForeignKey(requisicion,null);
				this.setActualParaGuardarTipoRequisicionForeignKey(requisicion,null);
				this.setActualParaGuardarEmpleadoForeignKey(requisicion,null);
				this.setActualParaGuardarEstadoRequisicionForeignKey(requisicion,null);
				this.setActualParaGuardarFormatoForeignKey(requisicion,null);
				this.setActualParaGuardarBodegaSolicitarForeignKey(requisicion,null);
				this.setActualParaGuardarBodegaSolicitaForeignKey(requisicion,null);
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
	
	public void bugActualizarReferenciaActual(Requisicion requisicion,Requisicion requisicionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalRequisicion(requisicion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		requisicionAux.setId(requisicion.getId());
		requisicionAux.setVersionRow(requisicion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessRequisicion();
		
			int intSelectedRow = this.jTableDatosRequisicion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicion =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.requisicion =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(RequisicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualRequisicion(this.requisicion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = requisicionValidator.getInvalidValues(this.requisicion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			requisicionLogic.setDatosCliente(datosCliente);
			requisicionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				requisicionAux=new  Requisicion();
				
				requisicionAux.setIsNew(true);
				requisicionAux.setIsChanged(true);
				
				requisicionAux.setRequisicionOriginal(this.requisicion);
				
				requisicionAux.setId(this.requisicion.getId());	
				requisicionAux.setVersionRow(this.requisicion.getVersionRow());	
				requisicionAux.setid_empresa(this.requisicion.getid_empresa());	
				requisicionAux.setid_sucursal(this.requisicion.getid_sucursal());	
				requisicionAux.setnumero_secuencial(this.requisicion.getnumero_secuencial());	
				requisicionAux.setid_tipo_requisicion(this.requisicion.getid_tipo_requisicion());	
				requisicionAux.setfecha(this.requisicion.getfecha());	
				requisicionAux.sethora(this.requisicion.gethora());	
				requisicionAux.setid_empleado(this.requisicion.getid_empleado());	
				requisicionAux.setid_estado_requisicion(this.requisicion.getid_estado_requisicion());	
				requisicionAux.setid_formato(this.requisicion.getid_formato());	
				requisicionAux.setid_bodega_solicitar(this.requisicion.getid_bodega_solicitar());	
				requisicionAux.setdescripcion(this.requisicion.getdescripcion());	
				requisicionAux.setid_bodega_solicita(this.requisicion.getid_bodega_solicita());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.requisicionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.requisicionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(requisicionAux,requisicionLogic.getRequisicions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(requisicionAux,requisicions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.requisicionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.requisicionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						requisicionLogic.saveRequisicions();//WithConnection
						//requisicionLogic.getSetVersionRowRequisicions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.requisicion,requisicionAux);
					
					this.refrescarForeignKeysDescripcionesRequisicion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.requisicionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.detallerequisicionLogic.getDetalleRequisicions().addAll(this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.detallerequisicionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.detallerequisicions.addAll(this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.detallerequisicionsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.requisicionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								requisicionLogic.saveRequisicionRelaciones(requisicionAux,this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.detallerequisicionLogic.getDetalleRequisicions());//WithConnection
								//requisicionLogic.getSetVersionRowRequisicions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.requisicion,requisicionAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.detallerequisicionLogic.setDetalleRequisicions(new ArrayList<DetalleRequisicion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.detallerequisicions= new ArrayList<DetalleRequisicion>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.quitarFilaTotales();}
							requisicionAux.setDetalleRequisicions(this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.detallerequisicionLogic.getDetalleRequisicions());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.requisicionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.requisicionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(requisicionAux,requisicionLogic.getRequisicions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(requisicionAux,requisicions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.requisicion,requisicionAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				requisicionAux=new  Requisicion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.requisicionSessionBean.getEsGuardarRelacionado() 
					|| (this.requisicionSessionBean.getEsGuardarRelacionado() && this.requisicion.getId()>=0)) {
						
					requisicionAux.setIsNew(false);
				}
				
				requisicionAux.setIsDeleted(false);
			
				requisicionAux.setId(this.requisicion.getId());	
				requisicionAux.setVersionRow(this.requisicion.getVersionRow());	
				requisicionAux.setid_empresa(this.requisicion.getid_empresa());	
				requisicionAux.setid_sucursal(this.requisicion.getid_sucursal());	
				requisicionAux.setnumero_secuencial(this.requisicion.getnumero_secuencial());	
				requisicionAux.setid_tipo_requisicion(this.requisicion.getid_tipo_requisicion());	
				requisicionAux.setfecha(this.requisicion.getfecha());	
				requisicionAux.sethora(this.requisicion.gethora());	
				requisicionAux.setid_empleado(this.requisicion.getid_empleado());	
				requisicionAux.setid_estado_requisicion(this.requisicion.getid_estado_requisicion());	
				requisicionAux.setid_formato(this.requisicion.getid_formato());	
				requisicionAux.setid_bodega_solicitar(this.requisicion.getid_bodega_solicitar());	
				requisicionAux.setdescripcion(this.requisicion.getdescripcion());	
				requisicionAux.setid_bodega_solicita(this.requisicion.getid_bodega_solicita());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(requisicionAux,requisicionLogic.getRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(requisicionAux,requisicions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.requisicionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.requisicionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						requisicionLogic.saveRequisicions();//WithConnection
						//requisicionLogic.getSetVersionRowRequisicions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.requisicion,requisicionAux);
					
					this.refrescarForeignKeysDescripcionesRequisicion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.requisicionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.detallerequisicionLogic.getDetalleRequisicions().addAll(this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.detallerequisicionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.detallerequisicions.addAll(this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.detallerequisicionsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.requisicionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								requisicionLogic.saveRequisicionRelaciones(requisicionAux,this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.detallerequisicionLogic.getDetalleRequisicions());//WithConnection
								//requisicionLogic.getSetVersionRowRequisicions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.requisicion,requisicionAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.detallerequisicionLogic.setDetalleRequisicions(new ArrayList<DetalleRequisicion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.detallerequisicions= new ArrayList<DetalleRequisicion>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.quitarFilaTotales();}
							requisicionAux.setDetalleRequisicions(this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.detallerequisicionLogic.getDetalleRequisicions());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.requisicionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.requisicionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(requisicionAux,requisicionLogic.getRequisicions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(requisicionAux,requisicions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.requisicion,requisicionAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				requisicionAux=new  Requisicion();
				
				requisicionAux.setIsNew(false);
				requisicionAux.setIsChanged(false);
				
				requisicionAux.setIsDeleted(true);
				
				requisicionAux.setId(this.requisicion.getId());	
				requisicionAux.setVersionRow(this.requisicion.getVersionRow());	
				requisicionAux.setid_empresa(this.requisicion.getid_empresa());	
				requisicionAux.setid_sucursal(this.requisicion.getid_sucursal());	
				requisicionAux.setnumero_secuencial(this.requisicion.getnumero_secuencial());	
				requisicionAux.setid_tipo_requisicion(this.requisicion.getid_tipo_requisicion());	
				requisicionAux.setfecha(this.requisicion.getfecha());	
				requisicionAux.sethora(this.requisicion.gethora());	
				requisicionAux.setid_empleado(this.requisicion.getid_empleado());	
				requisicionAux.setid_estado_requisicion(this.requisicion.getid_estado_requisicion());	
				requisicionAux.setid_formato(this.requisicion.getid_formato());	
				requisicionAux.setid_bodega_solicitar(this.requisicion.getid_bodega_solicitar());	
				requisicionAux.setdescripcion(this.requisicion.getdescripcion());	
				requisicionAux.setid_bodega_solicita(this.requisicion.getid_bodega_solicita());	
				
				if(this.requisicionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.requisicionAux.getId()>=0) {	
						this.requisicionsEliminados.add(requisicionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(requisicionAux,requisicionLogic.getRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(requisicionAux,requisicions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.requisicionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.requisicionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						requisicionLogic.saveRequisicions();//WithConnection
						//requisicionLogic.getSetVersionRowRequisicions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.requisicionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.detallerequisicionLogic.getDetalleRequisicions().addAll(this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.detallerequisicionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.detallerequisicions.addAll(this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.detallerequisicionsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.requisicionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								requisicionLogic.saveRequisicionRelaciones(requisicionAux,this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.detallerequisicionLogic.getDetalleRequisicions());//WithConnection
								//requisicionLogic.getSetVersionRowRequisicions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.detallerequisicionLogic.setDetalleRequisicions(new ArrayList<DetalleRequisicion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.detallerequisicions= new ArrayList<DetalleRequisicion>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.quitarFilaTotales();}
							requisicionAux.setDetalleRequisicions(this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.detallerequisicionLogic.getDetalleRequisicions());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.requisicionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.requisicionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(requisicionAux,requisicionLogic.getRequisicions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(requisicionAux,requisicions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.getRequisicions().addAll(this.requisicionsEliminados);
					
					requisicionLogic.saveRequisicions();//WithConnection
					//requisicionLogic.getSetVersionRowRequisicions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesRequisicion();
				
				this.requisicionsEliminados= new ArrayList<Requisicion>();		
			}
			
			if(this.requisicionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.requisicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Requisicion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Requisicion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.requisicion=requisicionAux;
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
      		//this.finishProcessRequisicion();
      	}
		
	}	
	
	public void actualizarRelaciones(Requisicion requisicionLocal) throws Exception {
		
		if(this.requisicionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				requisicionLocal.setDetalleRequisicions(this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.detallerequisicionLogic.getDetalleRequisicions());
			
			} else {
			
				requisicionLocal.setDetalleRequisicions(this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.detallerequisicions);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Requisicion requisicionLocal) throws Exception {	
		if(this.requisicionSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				requisicionLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				requisicionLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoRequisicionDetalleFormJInternalFrame.class)) {
				TipoRequisicionBeanSwingJInternalFrame tiporequisicionBeanSwingJInternalFrameLocal=(TipoRequisicionBeanSwingJInternalFrame) ((TipoRequisicionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tiporequisicionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoRequisicion(tiporequisicionBeanSwingJInternalFrameLocal.gettiporequisicion(),true);
				tiporequisicionBeanSwingJInternalFrameLocal.actualizarLista(tiporequisicionBeanSwingJInternalFrameLocal.tiporequisicion,this.tiporequisicionsForeignKey);

				tiporequisicionBeanSwingJInternalFrameLocal.actualizarRelaciones(tiporequisicionBeanSwingJInternalFrameLocal.tiporequisicion);

				requisicionLocal.setTipoRequisicion(tiporequisicionBeanSwingJInternalFrameLocal.tiporequisicion);

				this.addItemDefectoCombosForeignKeyTipoRequisicion();
				this.cargarCombosFrameTipoRequisicionsForeignKey("Formulario");
				this.setActualTipoRequisicionForeignKey(tiporequisicionBeanSwingJInternalFrameLocal.tiporequisicion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				requisicionLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstadoRequisicionDetalleFormJInternalFrame.class)) {
				EstadoRequisicionBeanSwingJInternalFrame estadorequisicionBeanSwingJInternalFrameLocal=(EstadoRequisicionBeanSwingJInternalFrame) ((EstadoRequisicionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estadorequisicionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstadoRequisicion(estadorequisicionBeanSwingJInternalFrameLocal.getestadorequisicion(),true);
				estadorequisicionBeanSwingJInternalFrameLocal.actualizarLista(estadorequisicionBeanSwingJInternalFrameLocal.estadorequisicion,this.estadorequisicionsForeignKey);

				estadorequisicionBeanSwingJInternalFrameLocal.actualizarRelaciones(estadorequisicionBeanSwingJInternalFrameLocal.estadorequisicion);

				requisicionLocal.setEstadoRequisicion(estadorequisicionBeanSwingJInternalFrameLocal.estadorequisicion);

				this.addItemDefectoCombosForeignKeyEstadoRequisicion();
				this.cargarCombosFrameEstadoRequisicionsForeignKey("Formulario");
				this.setActualEstadoRequisicionForeignKey(estadorequisicionBeanSwingJInternalFrameLocal.estadorequisicion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(FormatoDetalleFormJInternalFrame.class)) {
				FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrameLocal=(FormatoBeanSwingJInternalFrame) ((FormatoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				formatoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFormato(formatoBeanSwingJInternalFrameLocal.getformato(),true);
				formatoBeanSwingJInternalFrameLocal.actualizarLista(formatoBeanSwingJInternalFrameLocal.formato,this.formatosForeignKey);

				formatoBeanSwingJInternalFrameLocal.actualizarRelaciones(formatoBeanSwingJInternalFrameLocal.formato);

				requisicionLocal.setFormato(formatoBeanSwingJInternalFrameLocal.formato);

				this.addItemDefectoCombosForeignKeyFormato();
				this.cargarCombosFrameFormatosForeignKey("Formulario");
				this.setActualFormatoForeignKey(formatoBeanSwingJInternalFrameLocal.formato.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegasolicitarBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegasolicitarBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegasolicitarBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegasolicitarBeanSwingJInternalFrameLocal.actualizarLista(bodegasolicitarBeanSwingJInternalFrameLocal.bodega,this.bodegasolicitarsForeignKey);

				bodegasolicitarBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegasolicitarBeanSwingJInternalFrameLocal.bodega);

				requisicionLocal.setBodegaSolicitar(bodegasolicitarBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodegaSolicitar();
				this.cargarCombosFrameBodegaSolicitarsForeignKey("Formulario");
				this.setActualBodegaSolicitarForeignKey(bodegasolicitarBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegasolicitaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegasolicitaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegasolicitaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegasolicitaBeanSwingJInternalFrameLocal.actualizarLista(bodegasolicitaBeanSwingJInternalFrameLocal.bodega,this.bodegasolicitasForeignKey);

				bodegasolicitaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegasolicitaBeanSwingJInternalFrameLocal.bodega);

				requisicionLocal.setBodegaSolicita(bodegasolicitaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodegaSolicita();
				this.cargarCombosFrameBodegaSolicitasForeignKey("Formulario");
				this.setActualBodegaSolicitaForeignKey(bodegasolicitaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarRequisicionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosRequisicion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.requisicion =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.requisicion =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = requisicionValidator.getInvalidValues(this.requisicion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Requisicion requisicion,List<Requisicion> requisicions) throws Exception {
		try	{		
			RequisicionConstantesFunciones.actualizarLista(requisicion,requisicions,this.requisicionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Requisicion requisicion,List<Requisicion> requisicions) throws Exception {
		try	{			
			RequisicionConstantesFunciones.actualizarSelectedLista(requisicion,requisicions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Requisicion> requisicionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				requisicionsLocal=this.requisicionLogic.getRequisicions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				requisicionsLocal=this.requisicions;
			}
			//ARCHITECTURE
		
			for(Requisicion requisicionLocal:requisicionsLocal) {
				if(this.permiteMantenimiento(requisicionLocal) && requisicionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+RequisicionConstantesFunciones.getRequisicionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(RequisicionConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRequisicion.jLabelid_empresaRequisicion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RequisicionConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRequisicion.jLabelid_sucursalRequisicion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RequisicionConstantesFunciones.NUMEROSECUENCIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRequisicion.jLabelnumero_secuencialRequisicion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RequisicionConstantesFunciones.IDTIPOREQUISICION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRequisicion.jLabelid_tipo_requisicionRequisicion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RequisicionConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRequisicion.jLabelfechaRequisicion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RequisicionConstantesFunciones.HORA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRequisicion.jLabelhoraRequisicion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RequisicionConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRequisicion.jLabelid_empleadoRequisicion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RequisicionConstantesFunciones.IDESTADOREQUISICION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRequisicion.jLabelid_estado_requisicionRequisicion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RequisicionConstantesFunciones.IDFORMATO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRequisicion.jLabelid_formatoRequisicion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RequisicionConstantesFunciones.IDBODEGASOLICITAR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRequisicion.jLabelid_bodega_solicitarRequisicion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RequisicionConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRequisicion.jLabeldescripcionRequisicion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RequisicionConstantesFunciones.IDBODEGASOLICITA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRequisicion.jLabelid_bodega_solicitaRequisicion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormRequisicion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRequisicion.jLabelid_empresaRequisicion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRequisicion.jLabelid_sucursalRequisicion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRequisicion.jLabelnumero_secuencialRequisicion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRequisicion.jLabelid_tipo_requisicionRequisicion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRequisicion.jLabelfechaRequisicion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRequisicion.jLabelhoraRequisicion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRequisicion.jLabelid_empleadoRequisicion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRequisicion.jLabelid_estado_requisicionRequisicion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRequisicion.jLabelid_formatoRequisicion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRequisicion.jLabelid_bodega_solicitarRequisicion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRequisicion.jLabeldescripcionRequisicion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRequisicion.jLabelid_bodega_solicitaRequisicion,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DetalleRequisicion")) {
			if(this.requisicion==null) {
				this.requisicion= new Requisicion();
			}

			if(this.requisicionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoRequisicion
				this.setVariablesFormularioToObjetoActualRequisicion(this.requisicion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);

				this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.getdetallerequisicion().setRequisicion(this.requisicion);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoRequisicion--;	
		
		
		this.requisicionAux=new Requisicion();
		
		this.requisicionAux.setId(this.iIdNuevoRequisicion);
		this.requisicionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.requisicionLogic.getRequisicions().add(this.requisicionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.requisicions.add(this.requisicionAux);
		}
		//ARCHITECTURE
		
		this.requisicion=this.requisicionAux;
		
		if(RequisicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioRequisicion(this.requisicion);
			this.setVariablesObjetoActualToFormularioForeignKeyRequisicion(this.requisicion);
		}
				
		//this.setDefaultControlesRequisicion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyRequisicion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyRequisicion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyRequisicion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRequisicion(this.requisicionBean,this.requisicion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(RequisicionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.requisicionSessionBean.getConGuardarRelaciones()) {
			classes=RequisicionConstantesFunciones.getClassesRelationshipsOfRequisicion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.requisicionReturnGeneral=requisicionLogic.procesarEventosRequisicionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.requisicionLogic.getRequisicions(),this.requisicion,this.requisicionParameterGeneral,this.isEsNuevoRequisicion,classes);//this.requisicionLogic.getRequisicion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanRequisicion(this.requisicionReturnGeneral,this.requisicionBean,false);
		
		if(this.requisicionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyRequisicion(this.requisicionReturnGeneral.getRequisicion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioRequisicion(this.requisicionReturnGeneral.getRequisicion());
		}
		
		if(this.requisicionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioRequisicion(this.requisicionReturnGeneral.getRequisicion(),classes);//this.requisicionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualRequisicion(this.requisicion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyRequisicion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyRequisicion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			RequisicionBeanSwingJInternalFrameAdditional.RecargarFormRequisicion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingRequisicion(false);
						
			if(requisicionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.detallerequisicionSessionBean.getEsGuardarRelacionado() && DetalleRequisicionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleRequisicionActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(RequisicionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRequisicion();
			}
			
			this.actualizarVisualTableDatosRequisicion();
			
			this.jTableDatosRequisicion.setRowSelectionInterval(this.getIndiceNuevoRequisicion(), this.getIndiceNuevoRequisicion());
			
			this.seleccionarFilaTablaRequisicionActual();
						
			this.actualizarEstadoCeldasBotonesRequisicion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesRequisicion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormRequisicion.jTextFieldnumero_secuencialRequisicion.setEnabled(isHabilitar && this.requisicionConstantesFunciones.activarnumero_secuencialRequisicion);
		this.jInternalFrameDetalleFormRequisicion.jDateChooserfechaRequisicion.setEnabled(isHabilitar && this.requisicionConstantesFunciones.activarfechaRequisicion);
		this.jInternalFrameDetalleFormRequisicion.jSpinnerhoraRequisicion.setEnabled(isHabilitar && this.requisicionConstantesFunciones.activarhoraRequisicion);
		this.jInternalFrameDetalleFormRequisicion.jTextAreadescripcionRequisicion.setEnabled(isHabilitar && this.requisicionConstantesFunciones.activardescripcionRequisicion);	
		//
		this.jInternalFrameDetalleFormRequisicion.jComboBoxid_empresaRequisicion.setEnabled(isHabilitar && this.requisicionConstantesFunciones.activarid_empresaRequisicion);//
		this.jInternalFrameDetalleFormRequisicion.jComboBoxid_sucursalRequisicion.setEnabled(isHabilitar && this.requisicionConstantesFunciones.activarid_sucursalRequisicion);
		this.jInternalFrameDetalleFormRequisicion.jComboBoxid_tipo_requisicionRequisicion.setEnabled(isHabilitar && this.requisicionConstantesFunciones.activarid_tipo_requisicionRequisicion);
		this.jInternalFrameDetalleFormRequisicion.jComboBoxid_empleadoRequisicion.setEnabled(isHabilitar && this.requisicionConstantesFunciones.activarid_empleadoRequisicion);
		this.jInternalFrameDetalleFormRequisicion.jComboBoxid_estado_requisicionRequisicion.setEnabled(isHabilitar && this.requisicionConstantesFunciones.activarid_estado_requisicionRequisicion);
		this.jInternalFrameDetalleFormRequisicion.jComboBoxid_formatoRequisicion.setEnabled(isHabilitar && this.requisicionConstantesFunciones.activarid_formatoRequisicion);
		this.jInternalFrameDetalleFormRequisicion.jComboBoxid_bodega_solicitarRequisicion.setEnabled(isHabilitar && this.requisicionConstantesFunciones.activarid_bodega_solicitarRequisicion);
		this.jInternalFrameDetalleFormRequisicion.jComboBoxid_bodega_solicitaRequisicion.setEnabled(isHabilitar && this.requisicionConstantesFunciones.activarid_bodega_solicitaRequisicion);
	};
	
	public void setDefaultControlesRequisicion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoRequisicion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.requisicionSessionBean.setConGuardarRelaciones(true);			
			this.requisicionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormRequisicion.jTabbedPaneRelacionesRequisicion.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.detallerequisicionSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.requisicionSessionBean.setConGuardarRelaciones(false);			
			this.requisicionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormRequisicion.jTabbedPaneRelacionesRequisicion.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.detallerequisicionSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoRequisicion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Requisicion requisicionAux:this.requisicionLogic.getRequisicions()) {
				if(requisicionAux.getId().equals(this.iIdNuevoRequisicion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Requisicion requisicionAux:this.requisicions) {
				if(requisicionAux.getId().equals(this.iIdNuevoRequisicion)) {
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
	
	public int getIndiceActualRequisicion(Requisicion requisicion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Requisicion requisicionAux:this.requisicionLogic.getRequisicions()) {
				if(requisicionAux.getId().equals(requisicion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Requisicion requisicionAux:this.requisicions) {
				if(requisicionAux.getId().equals(requisicion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalRequisicion(Requisicion requisicionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Requisicion requisicionAux:this.requisicionLogic.getRequisicions()) {
				if(requisicionAux.getRequisicionOriginal().getId().equals(requisicionOriginal.getId())) {
					existe=true;
					requisicionOriginal.setId(requisicionAux.getId());
					requisicionOriginal.setVersionRow(requisicionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Requisicion requisicionAux:this.requisicions) {
				if(requisicionAux.getRequisicionOriginal().getId().equals(requisicionOriginal.getId())) {
					existe=true;
					requisicionOriginal.setId(requisicionAux.getId());
					requisicionOriginal.setVersionRow(requisicionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosRequisicion(Boolean esParaCancelar) throws Exception {
		requisicionsAux=new ArrayList<Requisicion>();
		requisicionAux=new Requisicion();
		
		if(!this.requisicionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Requisicion requisicionAux:this.requisicionLogic.getRequisicions()) {
					if(requisicionAux.getId()<0) {
						requisicionsAux.add(requisicionAux);
					}		
				}
				this.iIdNuevoRequisicion=0L;
				this.requisicionLogic.getRequisicions().removeAll(requisicionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Requisicion requisicionAux:this.requisicions) {
					if(requisicionAux.getId()<0) {
						requisicionsAux.add(requisicionAux);
					}		
				}
				this.iIdNuevoRequisicion=0L;
				this.requisicions.removeAll(requisicionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoRequisicion 
					&& this.requisicionLogic.getRequisicions().size()>0
					) {
					requisicionAux=this.requisicionLogic.getRequisicions().get(this.requisicionLogic.getRequisicions().size() - 1);
				
					if(requisicionAux.getId()<0) {
						this.requisicionLogic.getRequisicions().remove(requisicionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoRequisicion && this.requisicions.size()>0) {
					requisicionAux=this.requisicions.get(this.requisicions.size() - 1);
				
					if(requisicionAux.getId()<0) {
						this.requisicions.remove(requisicionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoRequisicion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(requisicion.getId()<0) {
				this.requisicionLogic.getRequisicions().remove(this.requisicion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(requisicion.getId()<0) {
				this.requisicions.remove(this.requisicion);
			}
		}			
	}
	
	public void setEstadosInicialesRequisicion(List<Requisicion> requisicionsAux) throws Exception {
		RequisicionConstantesFunciones.setEstadosInicialesRequisicion(requisicionsAux);
	}
	
	public void setEstadosInicialesRequisicion(Requisicion requisicionAux) throws Exception {
		RequisicionConstantesFunciones.setEstadosInicialesRequisicion(requisicionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarRequisicionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesRequisicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarRequisicionActual()) {
				if(!this.isEsNuevoRequisicion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesRequisicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoRequisicion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarRequisicionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Requisicion ?", "MANTENIMIENTO DE Requisicion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesRequisicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Requisicion requisicion) throws Exception {
		RequisicionConstantesFunciones.seleccionarAsignar(this.requisicion,requisicion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarRequisicion=this.isPermisoActualizarOriginalRequisicion;
			
			
			this.seleccionarAsignar(requisicion);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			RequisicionConstantesFunciones.quitarEspaciosRequisicion(this.requisicion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesRequisicion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.requisicionSessionBean.setsFuncionBusquedaRapida(this.requisicionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoRequisicion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosRequisicion(esParaCancelar);				
				this.cancelarNuevoRequisicion(esParaCancelar);								
			}
			
			this.requisicion=new Requisicion();
			
			this.inicializarRequisicion();
			
			this.actualizarEstadoCeldasBotonesRequisicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarRequisicion() throws Exception {
		try {
			RequisicionConstantesFunciones.inicializarRequisicion(this.requisicion);
			
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
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.requisicionLogic.getRequisicions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteRequisicions(String sAccionBusqueda,List<Requisicion> requisicionsParaReportes) throws Exception {
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
					sPathReporteFinal="Requisicion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="RequisicionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("RequisicionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Requisicion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Requisiciones");		
		parameters.put("busquedapor", RequisicionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(DetalleRequisicion.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					RequisicionLogic requisicionLogicAuxiliar=new RequisicionLogic();
					requisicionLogicAuxiliar.setDatosCliente(requisicionLogic.getDatosCliente());				
					requisicionLogicAuxiliar.setRequisicions(requisicionsParaReportes);
					
					requisicionLogicAuxiliar.cargarRelacionesLoteForeignKeyRequisicionWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					requisicionsParaReportes=requisicionLogicAuxiliar.getRequisicions();
					
					//requisicionLogic.getNewConnexionToDeep();
					
					//for (Requisicion requisicion:requisicionsParaReportes) {
					//	requisicionLogic.deepLoad(requisicion, false, DeepLoadType.INCLUDE, classes);
					//}						
					//requisicionLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//requisicionLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDetalleRequisicion = AuxiliarReportes.class.getResourceAsStream("DetalleRequisicionDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detallerequisicion", reportFileDetalleRequisicion);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceRequisicion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			RequisicionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			RequisicionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceRequisicion=new JRBeanArrayDataSource(RequisicionJInternalFrame.TraerRequisicionBeans(requisicionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceRequisicion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+RequisicionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+RequisicionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(RequisicionBean.TraerRequisicionBeans(requisicionsParaReportes).toArray()));
							
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
				this.generarExcelReporteRequisicions(sAccionBusqueda,sTipoArchivoReporte,requisicionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalRequisicions(sAccionBusqueda,sTipoArchivoReporte,requisicionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoRequisicionActionPerformed(null);
					//this.generarExcelReporteRequisicions(sAccionBusqueda,sTipoArchivoReporte,requisicionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalRequisicions(sAccionBusqueda,sTipoArchivoReporte,requisicionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesRequisicions(sAccionBusqueda,sTipoArchivoReporte,requisicionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesRequisicions(sAccionBusqueda,sTipoArchivoReporte,requisicionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRequisicions(String sAccionBusqueda,String sTipoArchivoReporte,List<Requisicion> requisicionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"requisicion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Requisicions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRequisicion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Requisicion requisicion : requisicionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			RequisicionConstantesFunciones.generarExcelReporteDataRequisicion("NORMAL",row,workbook,requisicion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.requisicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Requisicion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderRequisicion(String sTipo,Row row,Workbook workbook) {
		
		RequisicionConstantesFunciones.generarExcelReporteHeaderRequisicion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalRequisicions(String sAccionBusqueda,String sTipoArchivoReporte,List<Requisicion> requisicionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"requisicion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Requisicions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Requisicion requisicion : requisicionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(RequisicionConstantesFunciones.getRequisicionDescripcion(requisicion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RequisicionConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RequisicionConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(requisicion.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RequisicionConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RequisicionConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(requisicion.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RequisicionConstantesFunciones.LABEL_NUMEROSECUENCIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RequisicionConstantesFunciones.LABEL_NUMEROSECUENCIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(requisicion.getnumero_secuencial());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RequisicionConstantesFunciones.LABEL_IDTIPOREQUISICION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RequisicionConstantesFunciones.LABEL_IDTIPOREQUISICION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(requisicion.gettiporequisicion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RequisicionConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RequisicionConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(requisicion.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RequisicionConstantesFunciones.LABEL_HORA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RequisicionConstantesFunciones.LABEL_HORA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(requisicion.gethora());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RequisicionConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RequisicionConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(requisicion.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RequisicionConstantesFunciones.LABEL_IDESTADOREQUISICION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RequisicionConstantesFunciones.LABEL_IDESTADOREQUISICION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(requisicion.getestadorequisicion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RequisicionConstantesFunciones.LABEL_IDFORMATO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RequisicionConstantesFunciones.LABEL_IDFORMATO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(requisicion.getformato_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RequisicionConstantesFunciones.LABEL_IDBODEGASOLICITAR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RequisicionConstantesFunciones.LABEL_IDBODEGASOLICITAR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(requisicion.getbodegasolicitar_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RequisicionConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RequisicionConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(requisicion.getdescripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RequisicionConstantesFunciones.LABEL_IDBODEGASOLICITA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RequisicionConstantesFunciones.LABEL_IDBODEGASOLICITA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(requisicion.getbodegasolicita_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.requisicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Requisicion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesRequisicions(String sAccionBusqueda,String sTipoArchivoReporte,List<Requisicion> requisicionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Requisicion> requisicionsRespaldo=null;
		
		classes=RequisicionConstantesFunciones.getClassesRelationshipsOfRequisicion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.requisicionLogic.setDatosCliente(this.datosCliente);
		this.requisicionLogic.setDatosDeep(this.datosDeep);
		this.requisicionLogic.setIsConDeep(true);
		
		requisicionsRespaldo=this.requisicionLogic.getRequisicions();
		
		this.requisicionLogic.setRequisicions(requisicionsParaReportes);	
		this.requisicionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		requisicionsParaReportes=this.requisicionLogic.getRequisicions();
		this.requisicionLogic.setRequisicions(requisicionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"requisicion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Requisicions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRequisicion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Requisicion requisicion : requisicionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderRequisicion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			RequisicionConstantesFunciones.generarExcelReporteDataRequisicion("NORMAL",row,workbook,requisicion,cellStyleDataAux);
		
			
			


				//DetalleRequisicion
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO))) {

				if(requisicion.getDetalleRequisicions()!=null && requisicion.getDetalleRequisicions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleRequisicionConstantesFunciones.generarExcelReporteHeaderDetalleRequisicion("RELACIONADO",row,workbook);
				}

				if(requisicion.getDetalleRequisicions()!=null) {
					i2=0;
					for(DetalleRequisicion detallerequisicion : requisicion.getDetalleRequisicions()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetalleRequisicionConstantesFunciones.generarExcelReporteDataDetalleRequisicion("RELACIONADO",row,workbook,detallerequisicion,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(RequisicionConstantesFunciones.getRequisicionDescripcion(requisicion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.requisicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Requisicion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoRequisicion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRequisicion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoRequisicion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRequisicion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessRequisicion() throws Exception {		
		this.startProcessRequisicion(true);
	}
	
	public void startProcessRequisicion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasRequisicion ,this.jPanelParametrosReportesRequisicion, this.jScrollPanelDatosRequisicion,this.jPanelPaginacionRequisicion, this.jScrollPanelDatosEdicionRequisicion, this.jPanelAccionesRequisicion,this.jPanelAccionesFormularioRequisicion,this.jmenuBarRequisicion,this.jmenuBarDetalleRequisicion,this.jTtoolBarRequisicion,this.jTtoolBarDetalleRequisicion);		
		
		final JTabbedPane jTabbedPaneBusquedasRequisicion=this.jTabbedPaneBusquedasRequisicion; 
		
		final JPanel jPanelParametrosReportesRequisicion=this.jPanelParametrosReportesRequisicion;
		//final JScrollPane jScrollPanelDatosRequisicion=this.jScrollPanelDatosRequisicion;
		final JTable jTableDatosRequisicion=this.jTableDatosRequisicion;		
		final JPanel jPanelPaginacionRequisicion=this.jPanelPaginacionRequisicion;
		//final JScrollPane jScrollPanelDatosEdicionRequisicion=this.jScrollPanelDatosEdicionRequisicion;
		final JPanel jPanelAccionesRequisicion=this.jPanelAccionesRequisicion;
		
		JPanel jPanelCamposAuxiliarRequisicion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarRequisicion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormRequisicion!=null) {
			jPanelCamposAuxiliarRequisicion=this.jInternalFrameDetalleFormRequisicion.jPanelCamposRequisicion;
			jPanelAccionesFormularioAuxiliarRequisicion=this.jInternalFrameDetalleFormRequisicion.jPanelAccionesFormularioRequisicion;
		}
		
		final JPanel jPanelCamposRequisicion=jPanelCamposAuxiliarRequisicion;
		final JPanel jPanelAccionesFormularioRequisicion=jPanelAccionesFormularioAuxiliarRequisicion;
		
		
		final JMenuBar jmenuBarRequisicion=this.jmenuBarRequisicion;
		final JToolBar jTtoolBarRequisicion=this.jTtoolBarRequisicion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarRequisicion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRequisicion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormRequisicion!=null) {
			jmenuBarDetalleAuxiliarRequisicion=this.jInternalFrameDetalleFormRequisicion.jmenuBarDetalleRequisicion;
			jTtoolBarDetalleAuxiliarRequisicion=this.jInternalFrameDetalleFormRequisicion.jTtoolBarDetalleRequisicion;
		}
		
		final JMenuBar jmenuBarDetalleRequisicion=jmenuBarDetalleAuxiliarRequisicion;
		final JToolBar jTtoolBarDetalleRequisicion=jTtoolBarDetalleAuxiliarRequisicion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRequisicion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRequisicion;
			processRunnable.jTableDatos=jTableDatosRequisicion;
			processRunnable.jPanelCampos=jPanelCamposRequisicion;
			processRunnable.jPanelPaginacion=jPanelPaginacionRequisicion;
			processRunnable.jPanelAcciones=jPanelAccionesRequisicion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRequisicion;
			
			
			processRunnable.jmenuBar=jmenuBarRequisicion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRequisicion;
			processRunnable.jTtoolBar=jTtoolBarRequisicion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRequisicion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRequisicion ,jPanelParametrosReportesRequisicion,jTableDatosRequisicion, /*jScrollPanelDatosRequisicion,*/jPanelCamposRequisicion,jPanelPaginacionRequisicion, /*jScrollPanelDatosEdicionRequisicion,*/ jPanelAccionesRequisicion,jPanelAccionesFormularioRequisicion,jmenuBarRequisicion,jmenuBarDetalleRequisicion,jTtoolBarRequisicion,jTtoolBarDetalleRequisicion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRequisicion ,jPanelParametrosReportesRequisicion, jScrollPanelDatosRequisicion,jPanelPaginacionRequisicion, jScrollPanelDatosEdicionRequisicion, jPanelAccionesRequisicion,jPanelAccionesFormularioRequisicion,jmenuBarRequisicion,jmenuBarDetalleRequisicion,jTtoolBarRequisicion,jTtoolBarDetalleRequisicion);
						
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
	
	public void finishProcessRequisicion() {// throws Exception 
		this.finishProcessRequisicion(true);
	}
	
	public void finishProcessRequisicion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasRequisicion ,this.jPanelParametrosReportesRequisicion, this.jScrollPanelDatosRequisicion,this.jPanelPaginacionRequisicion, this.jScrollPanelDatosEdicionRequisicion, this.jPanelAccionesRequisicion,this.jPanelAccionesFormularioRequisicion,this.jmenuBarRequisicion,this.jmenuBarDetalleRequisicion,this.jTtoolBarRequisicion,this.jTtoolBarDetalleRequisicion);		
		
		final JTabbedPane jTabbedPaneBusquedasRequisicion=this.jTabbedPaneBusquedasRequisicion; 
		
		final JPanel jPanelParametrosReportesRequisicion=this.jPanelParametrosReportesRequisicion;
		//final JScrollPane jScrollPanelDatosRequisicion=this.jScrollPanelDatosRequisicion;
		final JTable jTableDatosRequisicion=this.jTableDatosRequisicion;		
		final JPanel jPanelPaginacionRequisicion=this.jPanelPaginacionRequisicion;
		//final JScrollPane jScrollPanelDatosEdicionRequisicion=this.jScrollPanelDatosEdicionRequisicion;
		final JPanel jPanelAccionesRequisicion=this.jPanelAccionesRequisicion;
		
		JPanel jPanelCamposAuxiliarRequisicion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarRequisicion=new JPanel();
		
		if(this.jInternalFrameDetalleFormRequisicion!=null) {
			jPanelCamposAuxiliarRequisicion=this.jInternalFrameDetalleFormRequisicion.jPanelCamposRequisicion;
			jPanelAccionesFormularioAuxiliarRequisicion=this.jInternalFrameDetalleFormRequisicion.jPanelAccionesFormularioRequisicion;
		}
		
		final JPanel jPanelCamposRequisicion=jPanelCamposAuxiliarRequisicion;
		final JPanel jPanelAccionesFormularioRequisicion=jPanelAccionesFormularioAuxiliarRequisicion;
		
		
		final JMenuBar jmenuBarRequisicion=this.jmenuBarRequisicion;		
		final JToolBar jTtoolBarRequisicion=this.jTtoolBarRequisicion;
				
		JMenuBar jmenuBarDetalleAuxiliarRequisicion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRequisicion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormRequisicion!=null) {
			jmenuBarDetalleAuxiliarRequisicion=this.jInternalFrameDetalleFormRequisicion.jmenuBarDetalleRequisicion;
			jTtoolBarDetalleAuxiliarRequisicion=this.jInternalFrameDetalleFormRequisicion.jTtoolBarDetalleRequisicion;		
		}
		
		final JMenuBar jmenuBarDetalleRequisicion=jmenuBarDetalleAuxiliarRequisicion;
		final JToolBar jTtoolBarDetalleRequisicion=jTtoolBarDetalleAuxiliarRequisicion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRequisicion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRequisicion;
			processRunnable.jTableDatos=jTableDatosRequisicion;
			processRunnable.jPanelCampos=jPanelCamposRequisicion;
			processRunnable.jPanelPaginacion=jPanelPaginacionRequisicion;
			processRunnable.jPanelAcciones=jPanelAccionesRequisicion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRequisicion;
			
			
			processRunnable.jmenuBar=jmenuBarRequisicion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRequisicion;
			processRunnable.jTtoolBar=jTtoolBarRequisicion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRequisicion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasRequisicion ,jPanelParametrosReportesRequisicion, jTableDatosRequisicion,/*jScrollPanelDatosRequisicion,*/jPanelCamposRequisicion,jPanelPaginacionRequisicion, /*jScrollPanelDatosEdicionRequisicion,*/ jPanelAccionesRequisicion,jPanelAccionesFormularioRequisicion,jmenuBarRequisicion,jmenuBarDetalleRequisicion,jTtoolBarRequisicion,jTtoolBarDetalleRequisicion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesRequisicion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarRequisicion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuRequisicion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarRequisicion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarRequisicion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleRequisicion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuRequisicion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarRequisicion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleRequisicion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.requisicionConstantesFunciones.getsFinalQueryRequisicion();
		String  finalQueryPaginacionTodos=this.requisicionConstantesFunciones.getsFinalQueryRequisicion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=RequisicionConstantesFunciones.getArrayColumnasGlobalesNoRequisicion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=RequisicionConstantesFunciones.getArrayColumnasGlobalesRequisicion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,RequisicionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.requisicionsEliminados= new ArrayList<Requisicion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessRequisicion();
		
				///*RequisicionSessionBean*/this.requisicionSessionBean=new RequisicionSessionBean();
			
			if(this.requisicionSessionBean==null) {
				this.requisicionSessionBean=new RequisicionSessionBean();
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
					this.iNumeroPaginacion=RequisicionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=RequisicionConstantesFunciones.getClassesForeignKeysOfRequisicion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/requisicion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			requisicionsAux= new ArrayList<Requisicion>();
			
				
			requisicionLogic.setDatosCliente(this.datosCliente);
			requisicionLogic.setDatosDeep(this.datosDeep);
			requisicionLogic.setIsConDeep(true);
			
			
			requisicionLogic.getRequisicionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					requisicionLogic.getTodosRequisicions(finalQueryGlobal,pagination);
					
					//requisicionLogic.getTodosRequisicionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(requisicionLogic.getRequisicions()==null|| requisicionLogic.getRequisicions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							requisicionsAux= new ArrayList<Requisicion>();
							requisicionsAux.addAll(requisicionLogic.getRequisicions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							requisicionsAux= new ArrayList<Requisicion>();
							requisicionsAux.addAll(requisicions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							requisicionLogic.getTodosRequisicions(finalQueryGlobal+"",this.pagination);												
							
							//requisicionLogic.getTodosRequisicionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteRequisicions("Todos",requisicionLogic.getRequisicions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							requisicionLogic.setRequisicions(new ArrayList<Requisicion>());					
							requisicionLogic.getRequisicions().addAll(requisicionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							requisicions=new ArrayList<Requisicion>();
							requisicions.addAll(requisicionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idRequisicion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idRequisicion=this.idActual;
				
				} else if(this.idRequisicionActual!=null && this.idRequisicionActual!=0L) {
					idRequisicion=idRequisicionActual;
				}
				
					
				this.sDetalleReporte=RequisicionConstantesFunciones.getDetalleIndicePorId(idRequisicion);
				
				this.requisicions=new ArrayList<Requisicion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					requisicionLogic.getEntity(idRequisicion);
					
					//requisicionLogic.getEntityWithConnection(idRequisicion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					requisicionLogic.setRequisicions(new ArrayList<Requisicion>());
					requisicionLogic.getRequisicions().add(requisicionLogic.getRequisicion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.requisicions=new ArrayList<Requisicion>();
					this.requisicions.add(requisicion);
				}
				
				if(requisicionLogic.getRequisicion()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=RequisicionConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(numero_secuencialBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					requisicionLogic.getRequisicionsBusquedaPorCodigo(finalQueryGlobal,pagination,numero_secuencialBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RequisicionConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(numero_secuencialBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RequisicionConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(numero_secuencialBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=requisicionLogic.getRequisicions()==null||requisicionLogic.getRequisicions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=requisicions==null|| requisicions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						requisicionsAux=new ArrayList<Requisicion>();
						requisicionsAux.addAll(requisicionLogic.getRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							requisicionsAux=new ArrayList<Requisicion>();
							requisicionsAux.addAll(requisicions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							requisicionLogic.getRequisicionsBusquedaPorCodigo(finalQueryGlobal,pagination,numero_secuencialBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RequisicionConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(numero_secuencialBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RequisicionConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(numero_secuencialBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRequisicions("BusquedaPorCodigo",requisicionLogic.getRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRequisicions("BusquedaPorCodigo",requisicions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						requisicionLogic.setRequisicions(new ArrayList<Requisicion>());
						requisicionLogic.getRequisicions().addAll(requisicionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							requisicions=new ArrayList<Requisicion>();
							requisicions.addAll(requisicionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdBodegaSolicita")) {
				this.sDetalleReporte=RequisicionConstantesFunciones.getDetalleIndiceFK_IdBodegaSolicita(id_bodega_solicitaFK_IdBodegaSolicita);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					requisicionLogic.getRequisicionsFK_IdBodegaSolicita(finalQueryGlobal,pagination,id_bodega_solicitaFK_IdBodegaSolicita);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RequisicionConstantesFunciones.getDetalleIndiceFK_IdBodegaSolicita(id_bodega_solicitaFK_IdBodegaSolicita);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RequisicionConstantesFunciones.getDetalleIndiceFK_IdBodegaSolicita(id_bodega_solicitaFK_IdBodegaSolicita);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=requisicionLogic.getRequisicions()==null||requisicionLogic.getRequisicions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=requisicions==null|| requisicions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						requisicionsAux=new ArrayList<Requisicion>();
						requisicionsAux.addAll(requisicionLogic.getRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							requisicionsAux=new ArrayList<Requisicion>();
							requisicionsAux.addAll(requisicions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							requisicionLogic.getRequisicionsFK_IdBodegaSolicita(finalQueryGlobal,pagination,id_bodega_solicitaFK_IdBodegaSolicita);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RequisicionConstantesFunciones.getDetalleIndiceFK_IdBodegaSolicita(id_bodega_solicitaFK_IdBodegaSolicita);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RequisicionConstantesFunciones.getDetalleIndiceFK_IdBodegaSolicita(id_bodega_solicitaFK_IdBodegaSolicita);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRequisicions("FK_IdBodegaSolicita",requisicionLogic.getRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRequisicions("FK_IdBodegaSolicita",requisicions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						requisicionLogic.setRequisicions(new ArrayList<Requisicion>());
						requisicionLogic.getRequisicions().addAll(requisicionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							requisicions=new ArrayList<Requisicion>();
							requisicions.addAll(requisicionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdBodegaSolicitar")) {
				this.sDetalleReporte=RequisicionConstantesFunciones.getDetalleIndiceFK_IdBodegaSolicitar(id_bodega_solicitarFK_IdBodegaSolicitar);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					requisicionLogic.getRequisicionsFK_IdBodegaSolicitar(finalQueryGlobal,pagination,id_bodega_solicitarFK_IdBodegaSolicitar);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RequisicionConstantesFunciones.getDetalleIndiceFK_IdBodegaSolicitar(id_bodega_solicitarFK_IdBodegaSolicitar);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RequisicionConstantesFunciones.getDetalleIndiceFK_IdBodegaSolicitar(id_bodega_solicitarFK_IdBodegaSolicitar);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=requisicionLogic.getRequisicions()==null||requisicionLogic.getRequisicions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=requisicions==null|| requisicions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						requisicionsAux=new ArrayList<Requisicion>();
						requisicionsAux.addAll(requisicionLogic.getRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							requisicionsAux=new ArrayList<Requisicion>();
							requisicionsAux.addAll(requisicions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							requisicionLogic.getRequisicionsFK_IdBodegaSolicitar(finalQueryGlobal,pagination,id_bodega_solicitarFK_IdBodegaSolicitar);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RequisicionConstantesFunciones.getDetalleIndiceFK_IdBodegaSolicitar(id_bodega_solicitarFK_IdBodegaSolicitar);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RequisicionConstantesFunciones.getDetalleIndiceFK_IdBodegaSolicitar(id_bodega_solicitarFK_IdBodegaSolicitar);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRequisicions("FK_IdBodegaSolicitar",requisicionLogic.getRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRequisicions("FK_IdBodegaSolicitar",requisicions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						requisicionLogic.setRequisicions(new ArrayList<Requisicion>());
						requisicionLogic.getRequisicions().addAll(requisicionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							requisicions=new ArrayList<Requisicion>();
							requisicions.addAll(requisicionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=RequisicionConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					requisicionLogic.getRequisicionsFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RequisicionConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RequisicionConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=requisicionLogic.getRequisicions()==null||requisicionLogic.getRequisicions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=requisicions==null|| requisicions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						requisicionsAux=new ArrayList<Requisicion>();
						requisicionsAux.addAll(requisicionLogic.getRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							requisicionsAux=new ArrayList<Requisicion>();
							requisicionsAux.addAll(requisicions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							requisicionLogic.getRequisicionsFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RequisicionConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RequisicionConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRequisicions("FK_IdEmpleado",requisicionLogic.getRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRequisicions("FK_IdEmpleado",requisicions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						requisicionLogic.setRequisicions(new ArrayList<Requisicion>());
						requisicionLogic.getRequisicions().addAll(requisicionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							requisicions=new ArrayList<Requisicion>();
							requisicions.addAll(requisicionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=RequisicionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					requisicionLogic.getRequisicionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RequisicionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RequisicionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=requisicionLogic.getRequisicions()==null||requisicionLogic.getRequisicions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=requisicions==null|| requisicions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						requisicionsAux=new ArrayList<Requisicion>();
						requisicionsAux.addAll(requisicionLogic.getRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							requisicionsAux=new ArrayList<Requisicion>();
							requisicionsAux.addAll(requisicions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							requisicionLogic.getRequisicionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RequisicionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RequisicionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRequisicions("FK_IdEmpresa",requisicionLogic.getRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRequisicions("FK_IdEmpresa",requisicions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						requisicionLogic.setRequisicions(new ArrayList<Requisicion>());
						requisicionLogic.getRequisicions().addAll(requisicionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							requisicions=new ArrayList<Requisicion>();
							requisicions.addAll(requisicionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=RequisicionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					requisicionLogic.getRequisicionsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RequisicionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RequisicionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=requisicionLogic.getRequisicions()==null||requisicionLogic.getRequisicions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=requisicions==null|| requisicions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						requisicionsAux=new ArrayList<Requisicion>();
						requisicionsAux.addAll(requisicionLogic.getRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							requisicionsAux=new ArrayList<Requisicion>();
							requisicionsAux.addAll(requisicions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							requisicionLogic.getRequisicionsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RequisicionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RequisicionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRequisicions("FK_IdSucursal",requisicionLogic.getRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRequisicions("FK_IdSucursal",requisicions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						requisicionLogic.setRequisicions(new ArrayList<Requisicion>());
						requisicionLogic.getRequisicions().addAll(requisicionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							requisicions=new ArrayList<Requisicion>();
							requisicions.addAll(requisicionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoRequisicion")) {
				this.sDetalleReporte=RequisicionConstantesFunciones.getDetalleIndiceFK_IdTipoRequisicion(id_tipo_requisicionFK_IdTipoRequisicion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					requisicionLogic.getRequisicionsFK_IdTipoRequisicion(finalQueryGlobal,pagination,id_tipo_requisicionFK_IdTipoRequisicion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RequisicionConstantesFunciones.getDetalleIndiceFK_IdTipoRequisicion(id_tipo_requisicionFK_IdTipoRequisicion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RequisicionConstantesFunciones.getDetalleIndiceFK_IdTipoRequisicion(id_tipo_requisicionFK_IdTipoRequisicion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=requisicionLogic.getRequisicions()==null||requisicionLogic.getRequisicions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=requisicions==null|| requisicions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						requisicionsAux=new ArrayList<Requisicion>();
						requisicionsAux.addAll(requisicionLogic.getRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							requisicionsAux=new ArrayList<Requisicion>();
							requisicionsAux.addAll(requisicions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							requisicionLogic.getRequisicionsFK_IdTipoRequisicion(finalQueryGlobal,pagination,id_tipo_requisicionFK_IdTipoRequisicion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RequisicionConstantesFunciones.getDetalleIndiceFK_IdTipoRequisicion(id_tipo_requisicionFK_IdTipoRequisicion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RequisicionConstantesFunciones.getDetalleIndiceFK_IdTipoRequisicion(id_tipo_requisicionFK_IdTipoRequisicion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRequisicions("FK_IdTipoRequisicion",requisicionLogic.getRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRequisicions("FK_IdTipoRequisicion",requisicions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						requisicionLogic.setRequisicions(new ArrayList<Requisicion>());
						requisicionLogic.getRequisicions().addAll(requisicionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							requisicions=new ArrayList<Requisicion>();
							requisicions.addAll(requisicionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesRequisicion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessRequisicion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=requisicionLogic.getRequisicions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=requisicions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=requisicionLogic.getRequisicions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=requisicions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Requisicion requisicion) {
		Boolean permite=true;
		
		if(this.requisicion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=RequisicionConstantesFunciones.getOrderByListaRequisicion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=RequisicionConstantesFunciones.getOrderByListaRequisicion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Requisicion requisicion:requisicionLogic.getRequisicions()) {
				if(requisicion.getsType().equals(Constantes2.S_TOTALES)) {
					requisicionTotales=requisicion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Requisicion requisicion:this.requisicions) {
				if(requisicion.getsType().equals(Constantes2.S_TOTALES)) {
					requisicionTotales=requisicion;
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
			this.requisicionAux=new Requisicion();
			this.requisicionAux.setsType(Constantes2.S_TOTALES);
			this.requisicionAux.setIsNew(false);
			this.requisicionAux.setIsChanged(false);
			this.requisicionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				RequisicionConstantesFunciones.TotalizarValoresFilaRequisicion(this.requisicionLogic.getRequisicions(),this.requisicionAux);
				
				this.requisicionLogic.getRequisicions().add(this.requisicionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				RequisicionConstantesFunciones.TotalizarValoresFilaRequisicion(this.requisicions,this.requisicionAux);
				
				this.requisicions.add(this.requisicionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		requisicionTotales=new Requisicion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.requisicionLogic.getRequisicions().remove(requisicionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.requisicions.remove(requisicionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		requisicionTotales=new Requisicion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Requisicion requisicion:requisicionLogic.getRequisicions()) {
				if(requisicion.getsType().equals(Constantes2.S_TOTALES)) {
					requisicionTotales=requisicion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RequisicionConstantesFunciones.TotalizarValoresFilaRequisicion(this.requisicionLogic.getRequisicions(),requisicionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Requisicion requisicion:this.requisicions) {
				if(requisicion.getsType().equals(Constantes2.S_TOTALES)) {
					requisicionTotales=requisicion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RequisicionConstantesFunciones.TotalizarValoresFilaRequisicion(this.requisicions,requisicionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getRequisicionsBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRequisicionsFK_IdBodegaSolicita()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodegaSolicita";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRequisicionsFK_IdBodegaSolicitar()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodegaSolicitar";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRequisicionsFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRequisicionsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRequisicionsFK_IdEstadoRequisicion()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstadoRequisicion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRequisicionsFK_IdFormato()throws Exception {
		try {
			sAccionBusqueda="FK_IdFormato";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRequisicionsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRequisicionsFK_IdTipoRequisicion()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoRequisicion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getRequisicionsBusquedaPorCodigo(String sFinalQuery,String numero_secuencial)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					requisicionLogic.getRequisicionsBusquedaPorCodigo(sFinalQuery,this.pagination,numero_secuencial);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRequisicionsFK_IdBodegaSolicita(String sFinalQuery,Long id_bodega_solicita)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					requisicionLogic.getRequisicionsFK_IdBodegaSolicita(sFinalQuery,this.pagination,id_bodega_solicita);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRequisicionsFK_IdBodegaSolicitar(String sFinalQuery,Long id_bodega_solicitar)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					requisicionLogic.getRequisicionsFK_IdBodegaSolicitar(sFinalQuery,this.pagination,id_bodega_solicitar);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRequisicionsFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					requisicionLogic.getRequisicionsFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRequisicionsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					requisicionLogic.getRequisicionsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRequisicionsFK_IdEstadoRequisicion(String sFinalQuery,Long id_estado_requisicion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					requisicionLogic.getRequisicionsFK_IdEstadoRequisicion(sFinalQuery,this.pagination,id_estado_requisicion);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRequisicionsFK_IdFormato(String sFinalQuery,Long id_formato)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					requisicionLogic.getRequisicionsFK_IdFormato(sFinalQuery,this.pagination,id_formato);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRequisicionsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					requisicionLogic.getRequisicionsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRequisicionsFK_IdTipoRequisicion(String sFinalQuery,Long id_tipo_requisicion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					requisicionLogic.getRequisicionsFK_IdTipoRequisicion(sFinalQuery,this.pagination,id_tipo_requisicion);
				
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
	
	public void inicializarPermisosRequisicion() {
		this.isPermisoTodoRequisicion=false;
		this.isPermisoNuevoRequisicion=false;
		this.isPermisoActualizarRequisicion=false;
		this.isPermisoActualizarOriginalRequisicion=false;
		this.isPermisoEliminarRequisicion=false;
		this.isPermisoGuardarCambiosRequisicion=false;
		this.isPermisoConsultaRequisicion=false;
		this.isPermisoBusquedaRequisicion=false;
		this.isPermisoReporteRequisicion=false;		
		this.isPermisoOrdenRequisicion=false;		
		this.isPermisoPaginacionMedioRequisicion=false;		
		this.isPermisoPaginacionAltoRequisicion=false;
		this.isPermisoPaginacionTodoRequisicion=false;
		this.isPermisoCopiarRequisicion=false;		
		this.isPermisoVerFormRequisicion=false;		
		this.isPermisoDuplicarRequisicion=false;		
		this.isPermisoOrdenRequisicion=false;		
	}
	
	public void setPermisosUsuarioRequisicion(Boolean isPermiso) {
		this.isPermisoTodoRequisicion=isPermiso;
		this.isPermisoNuevoRequisicion=isPermiso;
		this.isPermisoActualizarRequisicion=isPermiso;
		this.isPermisoActualizarOriginalRequisicion=isPermiso;
		this.isPermisoEliminarRequisicion=isPermiso;
		this.isPermisoGuardarCambiosRequisicion=isPermiso;
		this.isPermisoConsultaRequisicion=isPermiso;
		this.isPermisoBusquedaRequisicion=isPermiso;
		this.isPermisoReporteRequisicion=isPermiso;
		this.isPermisoOrdenRequisicion=isPermiso;		
		this.isPermisoPaginacionMedioRequisicion=isPermiso;		
		this.isPermisoPaginacionAltoRequisicion=isPermiso;		
		this.isPermisoPaginacionTodoRequisicion=isPermiso;		
		this.isPermisoCopiarRequisicion=isPermiso;		
		this.isPermisoVerFormRequisicion=isPermiso;		
		this.isPermisoDuplicarRequisicion=isPermiso;
		this.isPermisoOrdenRequisicion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioRequisicion(Boolean isPermiso) {
		//this.isPermisoTodoRequisicion=isPermiso;
		this.isPermisoNuevoRequisicion=isPermiso;
		this.isPermisoActualizarRequisicion=isPermiso;
		this.isPermisoActualizarOriginalRequisicion=isPermiso;
		this.isPermisoEliminarRequisicion=isPermiso;
		this.isPermisoGuardarCambiosRequisicion=isPermiso;
		//this.isPermisoConsultaRequisicion=isPermiso;
		//this.isPermisoBusquedaRequisicion=isPermiso;
		//this.isPermisoReporteRequisicion=isPermiso;
		//this.isPermisoOrdenRequisicion=isPermiso;		
		//this.isPermisoPaginacionMedioRequisicion=isPermiso;		
		//this.isPermisoPaginacionAltoRequisicion=isPermiso;		
		//this.isPermisoPaginacionTodoRequisicion=isPermiso;		
		//this.isPermisoCopiarRequisicion=isPermiso;		
		//this.isPermisoDuplicarRequisicion=isPermiso;
		//this.isPermisoOrdenRequisicion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioRequisicionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DetalleRequisicionConstantesFunciones.SNOMBREOPCION);
		
		if(RequisicionJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosDetalleRequisicion=false;
		this.isTienePermisosDetalleRequisicion=this.verificarGetPermisosUsuarioOpcionRequisicionClaseRelacionada(this.opcionsRelacionadas,DetalleRequisicionConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebRequisicion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioRequisicionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDetalleRequisicion=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioRequisicionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionRequisicionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioRequisicionClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDetalleRequisicion && this.jInternalFrameDetalleFormRequisicion!=null && this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormRequisicion.jTabbedPaneRelacionesRequisicion.remove(this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioRequisicion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(RequisicionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.requisicionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, RequisicionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoRequisicion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarRequisicion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalRequisicion=this.isPermisoActualizarRequisicion;
			this.isPermisoEliminarRequisicion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosRequisicion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaRequisicion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaRequisicion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoRequisicion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteRequisicion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRequisicion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioRequisicion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoRequisicion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoRequisicion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarRequisicion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormRequisicion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarRequisicion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRequisicion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.requisicionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosRequisicion.setToolTipText(this.jTableDatosRequisicion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioRequisicion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioRequisicion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(RequisicionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(RequisicionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioRequisicion() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDetalleRequisicion && this.requisicionConstantesFunciones.mostrarDetalleRequisicionRequisicion && !RequisicionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Requisicion");
			reporte.setsDescripcion("Detalle Requisicion");
			this.tiposRelaciones.add(reporte);
		}
		
		
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
	public void inicializarCombosForeignKeyRequisicionListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.tiporequisicionsForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.estadorequisicionsForeignKey=new ArrayList();
				this.formatosForeignKey=new ArrayList();
				this.bodegasolicitarsForeignKey=new ArrayList();
				this.bodegasolicitasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyRequisicionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(RequisicionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyRequisicionListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoRequisicionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstadoRequisicionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyFormatoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaSolicitarListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaSolicitaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoRequisicionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tiporequisicionsForeignKey==null||this.tiporequisicionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoRequisicionConstantesFunciones.getArrayColumnasGlobalesTipoRequisicion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoRequisicionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoRequisicionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoRequisicionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEmpleadoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpleadoConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstadoRequisicionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.estadorequisicionsForeignKey==null||this.estadorequisicionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EstadoRequisicionConstantesFunciones.getArrayColumnasGlobalesEstadoRequisicion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoRequisicionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EstadoRequisicionConstantesFunciones.SFINALQUERY;

				this.cargarCombosEstadoRequisicionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFormatoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.formatosForeignKey==null||this.formatosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=FormatoConstantesFunciones.getArrayColumnasGlobalesFormato(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FormatoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=FormatoConstantesFunciones.SFINALQUERY;

				this.cargarCombosFormatosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyBodegaSolicitarListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.bodegasolicitarsForeignKey==null||this.bodegasolicitarsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=BodegaConstantesFunciones.SFINALQUERY;

				this.cargarCombosBodegaSolicitarsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyBodegaSolicitaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.bodegasolicitasForeignKey==null||this.bodegasolicitasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=BodegaConstantesFunciones.SFINALQUERY;

				this.cargarCombosBodegaSolicitasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyRequisicionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			RequisicionParameterReturnGeneral requisicionReturnGeneral=new RequisicionParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.requisicionConstantesFunciones.cargarid_empresaRequisicion)
					 || (this.esRecargarFks && this.requisicionConstantesFunciones.cargarid_empresaRequisicion)) {

					if(!this.requisicionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+requisicionSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.requisicionConstantesFunciones.cargarid_sucursalRequisicion)
					 || (this.esRecargarFks && this.requisicionConstantesFunciones.cargarid_sucursalRequisicion)) {

					if(!this.requisicionSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+requisicionSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalTipoRequisicion="";

				if(((this.tiporequisicionsForeignKey==null||this.tiporequisicionsForeignKey.size()<=0) && this.requisicionConstantesFunciones.cargarid_tipo_requisicionRequisicion)
					 || (this.esRecargarFks && this.requisicionConstantesFunciones.cargarid_tipo_requisicionRequisicion)) {

					if(!this.requisicionSessionBean.getisBusquedaDesdeForeignKeySesionTipoRequisicion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoRequisicionConstantesFunciones.getArrayColumnasGlobalesTipoRequisicion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoRequisicion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoRequisicionConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoRequisicion=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoRequisicion, "");
						finalQueryGlobalTipoRequisicion+=TipoRequisicionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoRequisicionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoRequisicion=" WHERE " + ConstantesSql.ID + "="+requisicionSessionBean.getlidTipoRequisicionActual();
					}
				} else {
					finalQueryGlobalTipoRequisicion="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.requisicionConstantesFunciones.cargarid_empleadoRequisicion)
					 || (this.esRecargarFks && this.requisicionConstantesFunciones.cargarid_empleadoRequisicion)) {

					if(!this.requisicionSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+requisicionSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalEstadoRequisicion="";

				if(((this.estadorequisicionsForeignKey==null||this.estadorequisicionsForeignKey.size()<=0) && this.requisicionConstantesFunciones.cargarid_estado_requisicionRequisicion)
					 || (this.esRecargarFks && this.requisicionConstantesFunciones.cargarid_estado_requisicionRequisicion)) {

					if(!this.requisicionSessionBean.getisBusquedaDesdeForeignKeySesionEstadoRequisicion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstadoRequisicionConstantesFunciones.getArrayColumnasGlobalesEstadoRequisicion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstadoRequisicion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoRequisicionConstantesFunciones.TABLENAME);

						finalQueryGlobalEstadoRequisicion=Funciones.GetFinalQueryAppend(finalQueryGlobalEstadoRequisicion, "");
						finalQueryGlobalEstadoRequisicion+=EstadoRequisicionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstadoRequisicionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstadoRequisicion=" WHERE " + ConstantesSql.ID + "="+requisicionSessionBean.getlidEstadoRequisicionActual();
					}
				} else {
					finalQueryGlobalEstadoRequisicion="NONE";
				}


				String finalQueryGlobalFormato="";

				if(((this.formatosForeignKey==null||this.formatosForeignKey.size()<=0) && this.requisicionConstantesFunciones.cargarid_formatoRequisicion)
					 || (this.esRecargarFks && this.requisicionConstantesFunciones.cargarid_formatoRequisicion)) {

					if(!this.requisicionSessionBean.getisBusquedaDesdeForeignKeySesionFormato()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=FormatoConstantesFunciones.getArrayColumnasGlobalesFormato(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalFormato=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FormatoConstantesFunciones.TABLENAME);

						finalQueryGlobalFormato=Funciones.GetFinalQueryAppend(finalQueryGlobalFormato, "");
						finalQueryGlobalFormato+=FormatoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosFormatosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalFormato=" WHERE " + ConstantesSql.ID + "="+requisicionSessionBean.getlidFormatoActual();
					}
				} else {
					finalQueryGlobalFormato="NONE";
				}


				String finalQueryGlobalBodegaSolicitar="";

				if(((this.bodegasolicitarsForeignKey==null||this.bodegasolicitarsForeignKey.size()<=0) && this.requisicionConstantesFunciones.cargarid_bodega_solicitarRequisicion)
					 || (this.esRecargarFks && this.requisicionConstantesFunciones.cargarid_bodega_solicitarRequisicion)) {

					if(!this.requisicionSessionBean.getisBusquedaDesdeForeignKeySesionBodegaSolicitar()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBodegaSolicitar=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

						finalQueryGlobalBodegaSolicitar=Funciones.GetFinalQueryAppend(finalQueryGlobalBodegaSolicitar, "");
						finalQueryGlobalBodegaSolicitar+=BodegaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBodegaSolicitarsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBodegaSolicitar=" WHERE " + ConstantesSql.ID + "="+requisicionSessionBean.getlidBodegaSolicitarActual();
					}
				} else {
					finalQueryGlobalBodegaSolicitar="NONE";
				}


				String finalQueryGlobalBodegaSolicita="";

				if(((this.bodegasolicitasForeignKey==null||this.bodegasolicitasForeignKey.size()<=0) && this.requisicionConstantesFunciones.cargarid_bodega_solicitaRequisicion)
					 || (this.esRecargarFks && this.requisicionConstantesFunciones.cargarid_bodega_solicitaRequisicion)) {

					if(!this.requisicionSessionBean.getisBusquedaDesdeForeignKeySesionBodegaSolicita()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBodegaSolicita=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

						finalQueryGlobalBodegaSolicita=Funciones.GetFinalQueryAppend(finalQueryGlobalBodegaSolicita, "");
						finalQueryGlobalBodegaSolicita+=BodegaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBodegaSolicitasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBodegaSolicita=" WHERE " + ConstantesSql.ID + "="+requisicionSessionBean.getlidBodegaSolicitaActual();
					}
				} else {
					finalQueryGlobalBodegaSolicita="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				requisicionReturnGeneral=requisicionLogic.cargarCombosLoteForeignKeyRequisicion(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalTipoRequisicion,finalQueryGlobalEmpleado,finalQueryGlobalEstadoRequisicion,finalQueryGlobalFormato,finalQueryGlobalBodegaSolicitar,finalQueryGlobalBodegaSolicita);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=requisicionReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=requisicionReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalTipoRequisicion.equals("NONE")) {
				this.tiporequisicionsForeignKey=requisicionReturnGeneral.gettiporequisicionsForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=requisicionReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalEstadoRequisicion.equals("NONE")) {
				this.estadorequisicionsForeignKey=requisicionReturnGeneral.getestadorequisicionsForeignKey();
			}

			if(!finalQueryGlobalFormato.equals("NONE")) {
				this.formatosForeignKey=requisicionReturnGeneral.getformatosForeignKey();
			}

			if(!finalQueryGlobalBodegaSolicitar.equals("NONE")) {
				this.bodegasolicitarsForeignKey=requisicionReturnGeneral.getbodegasolicitarsForeignKey();
			}

			if(!finalQueryGlobalBodegaSolicita.equals("NONE")) {
				this.bodegasolicitasForeignKey=requisicionReturnGeneral.getbodegasolicitasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyRequisicion()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyTipoRequisicion();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyEstadoRequisicion();
			this.addItemDefectoCombosForeignKeyFormato();
			this.addItemDefectoCombosForeignKeyBodegaSolicitar();
			this.addItemDefectoCombosForeignKeyBodegaSolicita();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.requisicionSessionBean==null) {
				this.requisicionSessionBean=new RequisicionSessionBean();
			}

			if(!this.requisicionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.requisicionSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyTipoRequisicion()throws Exception {
		try {

			if(!this.requisicionSessionBean.getisBusquedaDesdeForeignKeySesionTipoRequisicion()) {
				TipoRequisicion tiporequisicion=new TipoRequisicion();
				TipoRequisicionConstantesFunciones.setTipoRequisicionDescripcion(tiporequisicion,Constantes.SMENSAJE_ESCOJA_OPCION);
				tiporequisicion.setId(null);

				if(!TipoRequisicionConstantesFunciones.ExisteEnLista(this.tiporequisicionsForeignKey,tiporequisicion,true)) {

					this.tiporequisicionsForeignKey.add(0,tiporequisicion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEmpleado()throws Exception {
		try {

			if(!this.requisicionSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
				Empleado empleado=new Empleado();
				EmpleadoConstantesFunciones.setEmpleadoDescripcion(empleado,Constantes.SMENSAJE_ESCOJA_OPCION);
				empleado.setId(null);

				if(!EmpleadoConstantesFunciones.ExisteEnLista(this.empleadosForeignKey,empleado,true)) {

					this.empleadosForeignKey.add(0,empleado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEstadoRequisicion()throws Exception {
		try {

			if(!this.requisicionSessionBean.getisBusquedaDesdeForeignKeySesionEstadoRequisicion()) {
				EstadoRequisicion estadorequisicion=new EstadoRequisicion();
				EstadoRequisicionConstantesFunciones.setEstadoRequisicionDescripcion(estadorequisicion,Constantes.SMENSAJE_ESCOJA_OPCION);
				estadorequisicion.setId(null);

				if(!EstadoRequisicionConstantesFunciones.ExisteEnLista(this.estadorequisicionsForeignKey,estadorequisicion,true)) {

					this.estadorequisicionsForeignKey.add(0,estadorequisicion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyFormato()throws Exception {
		try {

			if(!this.requisicionSessionBean.getisBusquedaDesdeForeignKeySesionFormato()) {
				Formato formato=new Formato();
				FormatoConstantesFunciones.setFormatoDescripcion(formato,Constantes.SMENSAJE_ESCOJA_OPCION);
				formato.setId(null);

				if(!FormatoConstantesFunciones.ExisteEnLista(this.formatosForeignKey,formato,true)) {

					this.formatosForeignKey.add(0,formato);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyBodegaSolicitar()throws Exception {
		try {

			if(!this.requisicionSessionBean.getisBusquedaDesdeForeignKeySesionBodegaSolicitar()) {
				Bodega bodegasolicitar=new Bodega();
				BodegaConstantesFunciones.setBodegaDescripcion(bodegasolicitar,Constantes.SMENSAJE_ESCOJA_OPCION);
				bodegasolicitar.setId(null);

				if(!BodegaConstantesFunciones.ExisteEnLista(this.bodegasolicitarsForeignKey,bodegasolicitar,true)) {

					this.bodegasolicitarsForeignKey.add(0,bodegasolicitar);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyBodegaSolicita()throws Exception {
		try {

			if(!this.requisicionSessionBean.getisBusquedaDesdeForeignKeySesionBodegaSolicita()) {
				Bodega bodegasolicita=new Bodega();
				BodegaConstantesFunciones.setBodegaDescripcion(bodegasolicita,Constantes.SMENSAJE_ESCOJA_OPCION);
				bodegasolicita.setId(null);

				if(!BodegaConstantesFunciones.ExisteEnLista(this.bodegasolicitasForeignKey,bodegasolicita,true)) {

					this.bodegasolicitasForeignKey.add(0,bodegasolicita);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyRequisicion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyRequisicion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyRequisicion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
				this.requisicion.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyRequisicion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyRequisicion(Requisicion requisicion)throws Exception {	
		try {
			
			this.setActualTipoRequisicionForeignKey(requisicion.getid_tipo_requisicion(),false,"Formulario");
			this.setActualEmpleadoForeignKey(requisicion.getid_empleado(),false,"Formulario");
			this.setActualEstadoRequisicionForeignKey(requisicion.getid_estado_requisicion(),false,"Formulario");
			this.setActualFormatoForeignKey(requisicion.getid_formato(),false,"Formulario");
			this.setActualBodegaSolicitarForeignKey(requisicion.getid_bodega_solicitar(),false,"Formulario");
			this.setActualBodegaSolicitaForeignKey(requisicion.getid_bodega_solicita(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyRequisicion(Requisicion requisicion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyRequisicion()throws Exception {	
		try {
			
			this.setActualTipoRequisicionForeignKey(this.requisicionConstantesFunciones.getid_tipo_requisicion(),false,"Formulario");
			this.setActualEmpleadoForeignKey(this.requisicionConstantesFunciones.getid_empleado(),false,"Formulario");
			this.setActualEstadoRequisicionForeignKey(this.requisicionConstantesFunciones.getid_estado_requisicion(),false,"Formulario");
			this.setActualFormatoForeignKey(this.requisicionConstantesFunciones.getid_formato(),false,"Formulario");
			this.setActualBodegaSolicitarForeignKey(this.requisicionConstantesFunciones.getid_bodega_solicitar(),false,"Formulario");
			this.setActualBodegaSolicitaForeignKey(this.requisicionConstantesFunciones.getid_bodega_solicita(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyRequisicion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyRequisicion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyRequisicion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroRequisicion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyRequisicion()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameTipoRequisicionsForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameEstadoRequisicionsForeignKey("Todos");
			this.cargarCombosFrameFormatosForeignKey("Todos");
			this.cargarCombosFrameBodegaSolicitarsForeignKey("Todos");
			this.cargarCombosFrameBodegaSolicitasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyRequisicion(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoRequisicionsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstadoRequisicionsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameFormatosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegaSolicitarsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegaSolicitasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyRequisicion()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormRequisicion.jComboBoxid_empresaRequisicion!=null && this.jInternalFrameDetalleFormRequisicion.jComboBoxid_empresaRequisicion.getItemCount()>0) {
				this.jInternalFrameDetalleFormRequisicion.jComboBoxid_empresaRequisicion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRequisicion.jComboBoxid_sucursalRequisicion!=null && this.jInternalFrameDetalleFormRequisicion.jComboBoxid_sucursalRequisicion.getItemCount()>0) {
				this.jInternalFrameDetalleFormRequisicion.jComboBoxid_sucursalRequisicion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRequisicion.jComboBoxid_tipo_requisicionRequisicion!=null && this.jInternalFrameDetalleFormRequisicion.jComboBoxid_tipo_requisicionRequisicion.getItemCount()>0) {
				this.jInternalFrameDetalleFormRequisicion.jComboBoxid_tipo_requisicionRequisicion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRequisicion.jComboBoxid_empleadoRequisicion!=null && this.jInternalFrameDetalleFormRequisicion.jComboBoxid_empleadoRequisicion.getItemCount()>0) {
				this.jInternalFrameDetalleFormRequisicion.jComboBoxid_empleadoRequisicion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRequisicion.jComboBoxid_estado_requisicionRequisicion!=null && this.jInternalFrameDetalleFormRequisicion.jComboBoxid_estado_requisicionRequisicion.getItemCount()>0) {
				this.jInternalFrameDetalleFormRequisicion.jComboBoxid_estado_requisicionRequisicion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRequisicion.jComboBoxid_formatoRequisicion!=null && this.jInternalFrameDetalleFormRequisicion.jComboBoxid_formatoRequisicion.getItemCount()>0) {
				this.jInternalFrameDetalleFormRequisicion.jComboBoxid_formatoRequisicion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRequisicion.jComboBoxid_bodega_solicitarRequisicion!=null && this.jInternalFrameDetalleFormRequisicion.jComboBoxid_bodega_solicitarRequisicion.getItemCount()>0) {
				this.jInternalFrameDetalleFormRequisicion.jComboBoxid_bodega_solicitarRequisicion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRequisicion.jComboBoxid_bodega_solicitaRequisicion!=null && this.jInternalFrameDetalleFormRequisicion.jComboBoxid_bodega_solicitaRequisicion.getItemCount()>0) {
				this.jInternalFrameDetalleFormRequisicion.jComboBoxid_bodega_solicitaRequisicion.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
















	
	

	public RequisicionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public RequisicionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public RequisicionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.requisicionSessionBean=new RequisicionSessionBean(); 
		this.requisicionConstantesFunciones=new RequisicionConstantesFunciones(); 
		this.requisicionBean=new Requisicion();//(this.requisicionConstantesFunciones); 		
		this.requisicionReturnGeneral=new RequisicionParameterReturnGeneral(); 
		
		this.requisicionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.requisicionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public RequisicionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public RequisicionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public RequisicionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessRequisicion(true);
			
			Boolean esParaBusquedaForeignKey=false;//ANTES USADO COMO PARAMETRO DEL CONSTRUCTOR
			
			if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				esParaBusquedaForeignKey=true;
			}
			
			//OBLIGA VALIDA CON GUARDAR RELACIONES, TAMBIEN EN SWING
			conGuardarRelaciones=true;
			
			
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
			
			this.requisicionConstantesFunciones=new RequisicionConstantesFunciones(); 
			this.requisicionBean=new Requisicion();//this.requisicionConstantesFunciones); 			
			this.requisicionReturnGeneral=new RequisicionParameterReturnGeneral(); 
		
			RequisicionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Requisicion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.requisicion=new Requisicion();
			this.requisicions = new ArrayList<Requisicion>();
			this.requisicionsAux = new ArrayList<Requisicion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic=new RequisicionLogic();
				this.requisicionLogic.getNewConnexionToDeep("");
			}
			
			//this.requisicionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.requisicionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormRequisicion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoRequisicion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRequisicion);	
					}
					
					if(this.jInternalFrameImportacionRequisicion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRequisicion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByRequisicion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByRequisicion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormRequisicion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormRequisicion);
				this.jInternalFrameDetalleFormRequisicion.setVisible(false);
				this.jInternalFrameDetalleFormRequisicion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoRequisicion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRequisicion);
					this.jInternalFrameReporteDinamicoRequisicion.setVisible(false);
					this.jInternalFrameReporteDinamicoRequisicion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionRequisicion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionRequisicion);
					this.jInternalFrameImportacionRequisicion.setVisible(false);
					this.jInternalFrameImportacionRequisicion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByRequisicion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByRequisicion);
					this.jInternalFrameOrderByRequisicion.setVisible(false);
					this.jInternalFrameOrderByRequisicion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idRequisicionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=RequisicionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.requisicionReturnGeneral=new RequisicionParameterReturnGeneral();
			
			this.requisicionParameterGeneral=new RequisicionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.requisicionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.requisicionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(RequisicionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.requisicionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DetalleRequisicionConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RequisicionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.requisicionSessionBean.getEsGuardarRelacionado(),this.requisicionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RequisicionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.requisicionSessionBean.getEsGuardarRelacionado(),this.requisicionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoRequisicion=false;
			this.isVisibilidadCeldaDuplicarRequisicion=true;
			this.isVisibilidadCeldaCopiarRequisicion=true;
			this.isVisibilidadCeldaVerFormRequisicion=true;
			this.isVisibilidadCeldaOrdenRequisicion=true;
			this.isVisibilidadCeldaNuevoRelacionesRequisicion=false;
			this.isVisibilidadCeldaModificarRequisicion=false;
			this.isVisibilidadCeldaActualizarRequisicion=false;
			this.isVisibilidadCeldaEliminarRequisicion=false;
			this.isVisibilidadCeldaCancelarRequisicion=false;
			this.isVisibilidadCeldaGuardarRequisicion=false;
			this.isVisibilidadCeldaGuardarCambiosRequisicion=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadFK_IdBodegaSolicita=true;
			this.isVisibilidadFK_IdBodegaSolicitar=true;
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstadoRequisicion=true;
			this.isVisibilidadFK_IdFormato=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoRequisicion=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesRequisicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosRequisicion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioRequisicion(false);
			
			this.setPermisosUsuarioRequisicion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.requisicionSessionBean.getEsGuardarRelacionado() 
				|| (this.requisicionSessionBean.getEsGuardarRelacionado() && this.requisicionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioRequisicionClasesRelacionadas();
			}
			
			if(this.requisicionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioRequisicionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!RequisicionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosRequisicion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualRequisicion();
			}
			
			if(!this.isPermisoBusquedaRequisicion) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasRequisicion.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.requisicionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioRequisicion,this.isPermisoPaginacionMedioRequisicion,this.isPermisoPaginacionTodoRequisicion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(RequisicionConstantesFunciones.getTiposSeleccionarRequisicion());
				
				this.tiposColumnasSelect=RequisicionConstantesFunciones.getTiposSeleccionarRequisicion(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectRequisicion();				
				//this.tiposRelacionesSelect=RequisicionConstantesFunciones.getTiposRelacionesRequisicion(true);
				
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
			//if(!this.requisicionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioRequisicion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioRequisicion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioRequisicion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesRequisicion() ;
			
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
			
			
			this.detallerequisicionLogic=new DetalleRequisicionLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.tiporequisicionLogic=new TipoRequisicionLogic();
			this.empleadoLogic=new EmpleadoLogic();
			this.estadorequisicionLogic=new EstadoRequisicionLogic();
			this.formatoLogic=new FormatoLogic();
			this.bodegasolicitarLogic=new BodegaLogic();
			this.bodegasolicitaLogic=new BodegaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				requisicionImplementable= (RequisicionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RequisicionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				requisicionImplementableHome= (RequisicionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RequisicionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.requisicions= new ArrayList<Requisicion>();
			this.requisicionsEliminados= new ArrayList<Requisicion>();
						
			this.isEsNuevoRequisicion=false;
			this.esParaAccionDesdeFormularioRequisicion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.tiporequisicionsForeignKey=new ArrayList<TipoRequisicion>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.estadorequisicionsForeignKey=new ArrayList<EstadoRequisicion>() ;
			this.formatosForeignKey=new ArrayList<Formato>() ;
			this.bodegasolicitarsForeignKey=new ArrayList<Bodega>() ;
			this.bodegasolicitasForeignKey=new ArrayList<Bodega>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyRequisicion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroRequisicion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.requisicionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			RequisicionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=RequisicionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesRequisicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingRequisicion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormRequisicion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioRequisicion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioRequisicion();
			}
			
			RequisicionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasRequisicion.getTabCount(); i++) {
					this.jTabbedPaneBusquedasRequisicion.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasRequisicion.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessRequisicion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Requisicion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectRequisicion() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesRequisicion")) {
				iIndex=this.jInternalFrameDetalleFormRequisicion.jTabbedPaneRelacionesRequisicion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormRequisicion.jTabbedPaneRelacionesRequisicion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosRequisicion.getSelectedRow();	
				
				

				if(sTitle.equals("Detalle Requisicions")) {
					if(!DetalleRequisicionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessRequisicion();

						this.cargarParteTabPanelRelacionadaDetalleRequisicion(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessRequisicion();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDetalleRequisicion(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormRequisicion.cargarSessionConBeanSwingJInternalFrameDetalleRequisicion(false,true,iIndex);
		this.jButtonDetalleRequisicionActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleRequisicion();

		//this.jTabbedPaneRelacionesRequisicion.updateUI();
		//this.jTabbedPaneRelacionesRequisicion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesRequisicion.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DetalleRequisicion")) {
				int row=this.jTableDatosRequisicion.getSelectedRow();
				jButtonDetalleRequisicionActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.requisicionSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Detalle Requisicion")) {

					if(this.isTienePermisosDetalleRequisicion && this.requisicionConstantesFunciones.mostrarDetalleRequisicionRequisicion && !RequisicionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Requisicions"+"("+DetalleRequisicionConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Requisicions");

						if(requisicionConstantesFunciones.resaltarDetalleRequisicionRequisicion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(requisicionConstantesFunciones.resaltarDetalleRequisicionRequisicion);
						}

						jmenuItem.setEnabled(this.requisicionConstantesFunciones.activarDetalleRequisicionRequisicion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleRequisicion"));

						

						this.jInternalFrameDetalleFormRequisicion.jmenuDetalleRequisicion.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyRequisicion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyRequisicion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyRequisicion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyRequisicionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyRequisicion();
		
		this.cargarCombosFrameForeignKeyRequisicion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyRequisicion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyRequisicion();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoRequisicion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoRequisicionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoRequisicion();
				this.cargarCombosFrameTipoRequisicionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoRequisicion(this.tiporequisicionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEmpleado(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEmpleado(this.empleadosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstadoRequisicion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEstadoRequisicionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEstadoRequisicion();
				this.cargarCombosFrameEstadoRequisicionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEstadoRequisicion(this.estadorequisicionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFormato(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyFormatoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyFormato();
				this.cargarCombosFrameFormatosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaFormato(this.formatosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyBodegaSolicitar(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyBodegaSolicitarListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyBodegaSolicitar();
				this.cargarCombosFrameBodegaSolicitarsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaBodegaSolicitar(this.bodegasolicitarsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyBodegaSolicita(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyBodegaSolicitaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyBodegaSolicita();
				this.cargarCombosFrameBodegaSolicitasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaBodegaSolicita(this.bodegasolicitasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoRequisicionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.requisicionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormRequisicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
			
			
			if(jTableDatosRequisicion.getRowCount()>=1) {
				jTableDatosRequisicion.removeRowSelectionInterval(0, jTableDatosRequisicion.getRowCount()-1);						
			}
			
			this.isEsNuevoRequisicion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoRequisicion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesRequisicion(true);			
			//this.requisicion=new Requisicion();
			//this.requisicion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRequisicion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRequisicion() ;
			
			if(RequisicionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRequisicion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.requisicion);	
			this.actualizarInformacion("INFO_PADRE",false,this.requisicion);				
			
			RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
			
			if(this.requisicionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Requisicion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarRequisicionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Requisicion> requisicionsSeleccionados=new ArrayList<Requisicion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosRequisicion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosRequisicion.getSelectedRows().length;			
			}
			
			requisicionsSeleccionados=this.getRequisicionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoRequisicion--;			
				//Requisicion requisicionAux= new Requisicion();			
				//requisicionAux.setId(this.iIdNuevoRequisicion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Requisicion requisicionOrigen=new Requisicion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Requisicion requisicionOrigen : requisicionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosRequisicion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							requisicionOrigen =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							requisicionOrigen =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaRequisicion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.requisicion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosRequisicion(requisicionOrigen,this.requisicion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.requisicionLogic.getRequisicions().add(this.requisicionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.requisicions.add(this.requisicionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaRequisicion(false);
				
				this.jTableDatosRequisicion.setRowSelectionInterval(this.getIndiceNuevoRequisicion(), this.getIndiceNuevoRequisicion());
				
				int iLastRow =  this.jTableDatosRequisicion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRequisicion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRequisicion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRequisicion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Requisicion> requisicionsSeleccionados=new ArrayList<Requisicion>();									
		
			Requisicion requisicionOrigen=new Requisicion();
			Requisicion requisicionDestino=new Requisicion();
				
			requisicionsSeleccionados=this.getRequisicionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosRequisicion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || requisicionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosRequisicion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						requisicionOrigen =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						requisicionOrigen =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						requisicionDestino =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						requisicionDestino =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				requisicionOrigen =requisicionsSeleccionados.get(0);
				requisicionDestino =requisicionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosRequisicion(requisicionOrigen,requisicionDestino,true,false);
				
				requisicionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(requisicionDestino,requisicionLogic.getRequisicions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(requisicionDestino,requisicions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaRequisicion(false);
				
				//this.jTableDatosRequisicion.setRowSelectionInterval(this.getIndiceNuevoRequisicion(), this.getIndiceNuevoRequisicion());
				
				int iLastRow =  this.jTableDatosRequisicion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRequisicion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRequisicion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRequisicion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRequisicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormRequisicion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesRequisicion.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasRequisicion.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesRequisicion.setVisible(!isVisible);
			this.jPanelPaginacionRequisicion.setVisible(!isVisible);
			this.jPanelAccionesRequisicion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameRequisicion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoRequisicion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionRequisicion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByRequisicion();
			
			this.abrirFrameOrderByRequisicion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByRequisicion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleRequisicion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormRequisicion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormRequisicion.isMaximum()) {
					this.jInternalFrameDetalleFormRequisicion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormRequisicion.setSize(this.jInternalFrameDetalleFormRequisicion.iWidthFormulario,this.jInternalFrameDetalleFormRequisicion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormRequisicion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormRequisicion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormRequisicion.isMaximum()) {
						this.jInternalFrameDetalleFormRequisicion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormRequisicion.jContentPaneDetalleRequisicion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormRequisicion.jTabbedPaneRelacionesRequisicion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormRequisicion.jContentPaneDetalleRequisicion.getWidth(),RequisicionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRequisicion.jTabbedPaneRelacionesRequisicion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormRequisicion.jContentPaneDetalleRequisicion.getWidth(),RequisicionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRequisicion.jTabbedPaneRelacionesRequisicion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormRequisicion.jContentPaneDetalleRequisicion.getWidth(),RequisicionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DetalleRequisicionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleRequisicion();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormRequisicion.setVisible(true);
	        this.jInternalFrameDetalleFormRequisicion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByRequisicion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByRequisicion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByRequisicion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRequisicion,false,this);
				} else {
					this.jInternalFrameOrderByRequisicion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRequisicion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByRequisicion);
				this.jInternalFrameOrderByRequisicion.setVisible(false);
				this.jInternalFrameOrderByRequisicion.setSelected(false);
				
				this.jInternalFrameOrderByRequisicion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRequisicion"));
				
				this.inicializarActualizarBindingTablaOrderByRequisicion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionRequisicion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionRequisicion==null) {
				
				this.jInternalFrameImportacionRequisicion=new ImportacionJInternalFrame(RequisicionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRequisicion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionRequisicion);
				this.jInternalFrameImportacionRequisicion.setVisible(false);
				this.jInternalFrameImportacionRequisicion.setSelected(false);


				this.jInternalFrameImportacionRequisicion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRequisicion"));
				this.jInternalFrameImportacionRequisicion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRequisicion"));
				this.jInternalFrameImportacionRequisicion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRequisicion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoRequisicion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoRequisicion==null) {
				this.jInternalFrameReporteDinamicoRequisicion=new ReporteDinamicoJInternalFrame(RequisicionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRequisicion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRequisicion);
				this.jInternalFrameReporteDinamicoRequisicion.setVisible(false);
				this.jInternalFrameReporteDinamicoRequisicion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoRequisicion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRequisicion"));
				this.jInternalFrameReporteDinamicoRequisicion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRequisicion"));
				this.jInternalFrameReporteDinamicoRequisicion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRequisicion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRequisicion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDetalleRequisicion() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.jScrollPanelDatosDetalleRequisicion.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormRequisicion.jContentPaneDetalleRequisicion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.jScrollPanelDatosDetalleRequisicion.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.jScrollPanelDatosDetalleRequisicion.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.jScrollPanelDatosDetalleRequisicion.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleRequisicion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormRequisicion);
			
	       	this.jInternalFrameDetalleFormRequisicion.setVisible(false);
	        this.jInternalFrameDetalleFormRequisicion.setSelected(false);
			
			//this.jInternalFrameDetalleFormRequisicion.dispose();
			//this.jInternalFrameDetalleFormRequisicion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoRequisicion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoRequisicion.setVisible(true);
	        this.jInternalFrameReporteDinamicoRequisicion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionRequisicion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionRequisicion.setVisible(true);
	        this.jInternalFrameImportacionRequisicion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByRequisicion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByRequisicion.setVisible(true);
	        this.jInternalFrameOrderByRequisicion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByRequisicion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByRequisicion.setVisible(false);
	        this.jInternalFrameOrderByRequisicion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoRequisicion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoRequisicion.setVisible(false);
	        this.jInternalFrameReporteDinamicoRequisicion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionRequisicion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionRequisicion.setVisible(false);
	        this.jInternalFrameImportacionRequisicion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarRequisicion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarRequisicion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRequisicion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesRequisicion(true);
			//this.isEsNuevoRequisicion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicion =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.requisicion =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesRequisicion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRequisicion(false) ;
			
			if(requisicionSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.detallerequisicionSessionBean.getEsGuardarRelacionado() && DetalleRequisicionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleRequisicionActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(RequisicionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRequisicion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRequisicion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaRequisicionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosRequisicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicion =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.requisicion =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarRequisicion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRequisicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRequisicion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesRequisicion(true);
			//this.isEsNuevoRequisicion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicion =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.requisicion =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.requisicion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesRequisicion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesRequisicion(false) ;
			
			if(RequisicionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRequisicion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRequisicion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaTipoRequisicion(List<TipoRequisicion> tiporequisicionsForeignKey)throws Exception{
		TableColumn tableColumnTipoRequisicion=this.jTableDatosRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRequisicion,RequisicionConstantesFunciones.LABEL_IDTIPOREQUISICION));
		TableCellEditor tableCellEditorTipoRequisicion =tableColumnTipoRequisicion.getCellEditor();

		TipoRequisicionTableCell tiporequisicionTableCellFk=(TipoRequisicionTableCell)tableCellEditorTipoRequisicion;

		if(tiporequisicionTableCellFk!=null) {
			tiporequisicionTableCellFk.settiporequisicionsForeignKey(tiporequisicionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosRequisicion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tiporequisicionTableCellFk.setRowActual(intSelectedRow);
			//tiporequisicionTableCellFk.settiporequisicionsForeignKeyActual(tiporequisicionsForeignKey);
		//}


		if(tiporequisicionTableCellFk!=null) {
			tiporequisicionTableCellFk.RecargarTipoRequisicionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRequisicion,RequisicionConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosRequisicion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstadoRequisicion(List<EstadoRequisicion> estadorequisicionsForeignKey)throws Exception{
		TableColumn tableColumnEstadoRequisicion=this.jTableDatosRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRequisicion,RequisicionConstantesFunciones.LABEL_IDESTADOREQUISICION));
		TableCellEditor tableCellEditorEstadoRequisicion =tableColumnEstadoRequisicion.getCellEditor();

		EstadoRequisicionTableCell estadorequisicionTableCellFk=(EstadoRequisicionTableCell)tableCellEditorEstadoRequisicion;

		if(estadorequisicionTableCellFk!=null) {
			estadorequisicionTableCellFk.setestadorequisicionsForeignKey(estadorequisicionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosRequisicion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estadorequisicionTableCellFk.setRowActual(intSelectedRow);
			//estadorequisicionTableCellFk.setestadorequisicionsForeignKeyActual(estadorequisicionsForeignKey);
		//}


		if(estadorequisicionTableCellFk!=null) {
			estadorequisicionTableCellFk.RecargarEstadoRequisicionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaFormato(List<Formato> formatosForeignKey)throws Exception{
		TableColumn tableColumnFormato=this.jTableDatosRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRequisicion,RequisicionConstantesFunciones.LABEL_IDFORMATO));
		TableCellEditor tableCellEditorFormato =tableColumnFormato.getCellEditor();

		FormatoTableCell formatoTableCellFk=(FormatoTableCell)tableCellEditorFormato;

		if(formatoTableCellFk!=null) {
			formatoTableCellFk.setformatosForeignKey(formatosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosRequisicion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//formatoTableCellFk.setRowActual(intSelectedRow);
			//formatoTableCellFk.setformatosForeignKeyActual(formatosForeignKey);
		//}


		if(formatoTableCellFk!=null) {
			formatoTableCellFk.RecargarFormatosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaBodegaSolicitar(List<Bodega> bodegasolicitarsForeignKey)throws Exception{
		TableColumn tableColumnBodegaSolicitar=this.jTableDatosRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRequisicion,RequisicionConstantesFunciones.LABEL_IDBODEGASOLICITAR));
		TableCellEditor tableCellEditorBodegaSolicitar =tableColumnBodegaSolicitar.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodegaSolicitar;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasolicitarsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosRequisicion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//bodegaTableCellFk.setRowActual(intSelectedRow);
			//bodegaTableCellFk.setbodegasForeignKeyActual(bodegasolicitarsForeignKey);
		//}


		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.RecargarBodegasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaBodegaSolicita(List<Bodega> bodegasolicitasForeignKey)throws Exception{
		TableColumn tableColumnBodegaSolicita=this.jTableDatosRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRequisicion,RequisicionConstantesFunciones.LABEL_IDBODEGASOLICITA));
		TableCellEditor tableCellEditorBodegaSolicita =tableColumnBodegaSolicita.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodegaSolicita;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasolicitasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosRequisicion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//bodegaTableCellFk.setRowActual(intSelectedRow);
			//bodegaTableCellFk.setbodegasForeignKeyActual(bodegasolicitasForeignKey);
		//}


		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.RecargarBodegasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesRequisicion(false);
			
			//if(!this.isEsNuevoRequisicion) {								
				int intSelectedRow = this.jTableDatosRequisicion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicion =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.requisicion =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(RequisicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualRequisicion(this.requisicion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);
				
			}
			
			if(this.permiteMantenimiento(this.requisicion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.requisicionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoRequisicion=true;
					this.inicializarActualizarBindingTablaRequisicion(false);
					this.isEsNuevoRequisicion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoRequisicion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoRequisicion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRequisicion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRequisicion(false);
				
				this.habilitarDeshabilitarControlesRequisicion(false);
			
												
				
				if(RequisicionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleRequisicion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoRequisicionActionPerformed(evt,requisicionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualRequisicion(this.requisicion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosRequisicion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,requisicionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.requisicion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Requisicion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Requisicion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosRequisicion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicion =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
				this.requisicion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.requisicion =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
				this.requisicion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.requisicion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.requisicionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((RequisicionModel) this.jTableDatosRequisicion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoRequisicion=true;
				this.inicializarActualizarBindingTablaRequisicion(false);
				this.isEsNuevoRequisicion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRequisicion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRequisicion(false);
				
				this.habilitarDeshabilitarControlesRequisicion(false);
				
				
				
				if(RequisicionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleRequisicion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarRequisicionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosRequisicion.getRowCount()>=1) {
				jTableDatosRequisicion.removeRowSelectionInterval(0, jTableDatosRequisicion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesRequisicion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaRequisicion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRequisicion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRequisicion(false) ;
			
			this.isEsNuevoRequisicion=false;
			
			if(RequisicionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleRequisicion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosRequisicionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingRequisicion(false);
				
				//SI ES MANUAL
				if(RequisicionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualRequisicion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosRequisicionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoRequisicion--;			
			//Requisicion requisicionAux= new Requisicion();			
			//requisicionAux.setId(this.iIdNuevoRequisicion);
			
			if(this.jInternalFrameDetalleFormRequisicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaRequisicion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);
			
			this.requisicion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.requisicionLogic.getRequisicions().add(this.requisicionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.requisicions.add(this.requisicionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaRequisicion(false);
			
			this.jTableDatosRequisicion.setRowSelectionInterval(this.getIndiceNuevoRequisicion(), this.getIndiceNuevoRequisicion());
			
			int iLastRow =  this.jTableDatosRequisicion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosRequisicion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosRequisicion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaRequisicion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionRequisicionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingRequisicion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRequisicion(false);
			
			//SI ES MANUAL
			if(RequisicionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRequisicion();
			}
			
			//this.abrirFrameTreeRequisicion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionRequisicionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE RequisicionES ?", "MANTENIMIENTO DE Requisicion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionRequisicion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralRequisicion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.requisicionReturnGeneral=requisicionLogic.procesarImportacionRequisicionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.requisicionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarRequisicionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionRequisicionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionRequisicion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionRequisicion.setFileImportacion(this.jInternalFrameImportacionRequisicion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionRequisicion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionRequisicion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionRequisicion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionRequisicion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoRequisicionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Requisicion> requisicionsSeleccionados=new ArrayList<Requisicion>();		

		requisicionsSeleccionados=this.getRequisicionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRequisicion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRequisicion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("RequisicionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"RequisicionBaseDesign.jrxml";
			
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
			
			this.generarReporteRequisicions("Todos",requisicionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.requisicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Requisicion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoRequisicion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRequisicion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RequisicionConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RequisicionConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RequisicionConstantesFunciones.LABEL_NUMEROSECUENCIAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroSecuencial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroSecuencial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroSecuencial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroSecuencial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RequisicionConstantesFunciones.LABEL_IDTIPOREQUISICION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoRequisicion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoRequisicion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoRequisicion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoRequisicion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RequisicionConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RequisicionConstantesFunciones.LABEL_HORA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ra_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ra_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ra_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ra_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RequisicionConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RequisicionConstantesFunciones.LABEL_IDESTADOREQUISICION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EstadoRequisicion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EstadoRequisicion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EstadoRequisicion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EstadoRequisicion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RequisicionConstantesFunciones.LABEL_IDFORMATO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Formato_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Formato_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Formato_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Formato_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RequisicionConstantesFunciones.LABEL_IDBODEGASOLICITAR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_BodegaSolicitar_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_BodegaSolicitar_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_BodegaSolicitar_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_BodegaSolicitar_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RequisicionConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RequisicionConstantesFunciones.LABEL_IDBODEGASOLICITA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_BodegaSolicita_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_BodegaSolicita_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_BodegaSolicita_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_BodegaSolicita_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoRequisicion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoRequisicion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoRequisicion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case RequisicionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case RequisicionConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case RequisicionConstantesFunciones.LABEL_NUMEROSECUENCIAL:
					sNombreCampoCategoria="numero_secuencial";
					break;

				case RequisicionConstantesFunciones.LABEL_IDTIPOREQUISICION:
					sNombreCampoCategoria="id_tipo_requisicion";
					break;

				case RequisicionConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case RequisicionConstantesFunciones.LABEL_HORA:
					sNombreCampoCategoria="hora";
					break;

				case RequisicionConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case RequisicionConstantesFunciones.LABEL_IDESTADOREQUISICION:
					sNombreCampoCategoria="id_estado_requisicion";
					break;

				case RequisicionConstantesFunciones.LABEL_IDFORMATO:
					sNombreCampoCategoria="id_formato";
					break;

				case RequisicionConstantesFunciones.LABEL_IDBODEGASOLICITAR:
					sNombreCampoCategoria="id_bodega_solicitar";
					break;

				case RequisicionConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;

				case RequisicionConstantesFunciones.LABEL_IDBODEGASOLICITA:
					sNombreCampoCategoria="id_bodega_solicita";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoRequisicion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case RequisicionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case RequisicionConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case RequisicionConstantesFunciones.LABEL_NUMEROSECUENCIAL:
					sNombreCampoCategoriaValor="numero_secuencial";
					break;

				case RequisicionConstantesFunciones.LABEL_IDTIPOREQUISICION:
					sNombreCampoCategoriaValor="id_tipo_requisicion";
					break;

				case RequisicionConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case RequisicionConstantesFunciones.LABEL_HORA:
					sNombreCampoCategoriaValor="hora";
					break;

				case RequisicionConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case RequisicionConstantesFunciones.LABEL_IDESTADOREQUISICION:
					sNombreCampoCategoriaValor="id_estado_requisicion";
					break;

				case RequisicionConstantesFunciones.LABEL_IDFORMATO:
					sNombreCampoCategoriaValor="id_formato";
					break;

				case RequisicionConstantesFunciones.LABEL_IDBODEGASOLICITAR:
					sNombreCampoCategoriaValor="id_bodega_solicitar";
					break;

				case RequisicionConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;

				case RequisicionConstantesFunciones.LABEL_IDBODEGASOLICITA:
					sNombreCampoCategoriaValor="id_bodega_solicita";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoRequisicion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRequisicion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RequisicionConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case RequisicionConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case RequisicionConstantesFunciones.LABEL_NUMEROSECUENCIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"No Secuencial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_secuencial");
					break;

				case RequisicionConstantesFunciones.LABEL_IDTIPOREQUISICION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_requisicion");
					break;

				case RequisicionConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case RequisicionConstantesFunciones.LABEL_HORA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Hora",sNombreCampoCategoria,sNombreCampoCategoriaValor,"hora");
					break;

				case RequisicionConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case RequisicionConstantesFunciones.LABEL_IDESTADOREQUISICION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estado_requisicion");
					break;

				case RequisicionConstantesFunciones.LABEL_IDFORMATO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Formato",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_formato");
					break;

				case RequisicionConstantesFunciones.LABEL_IDBODEGASOLICITAR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bode Solicitar",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_bodega_solicitar");
					break;

				case RequisicionConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
					break;

				case RequisicionConstantesFunciones.LABEL_IDBODEGASOLICITA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bode Solicita",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_bodega_solicita");
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
	
	public void jButtonGenerarExcelReporteDinamicoRequisicionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Requisicion> requisicionsSeleccionados=new ArrayList<Requisicion>();		
		
		requisicionsSeleccionados=this.getRequisicionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"requisicion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Requisicions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoRequisicion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoRequisicion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case RequisicionConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RequisicionConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Requisicion requisicion:requisicionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(requisicion.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RequisicionConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RequisicionConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(Requisicion requisicion:requisicionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(requisicion.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RequisicionConstantesFunciones.LABEL_NUMEROSECUENCIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RequisicionConstantesFunciones.LABEL_NUMEROSECUENCIAL);
					iRow++;

					for(Requisicion requisicion:requisicionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(requisicion.getnumero_secuencial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RequisicionConstantesFunciones.LABEL_IDTIPOREQUISICION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RequisicionConstantesFunciones.LABEL_IDTIPOREQUISICION);
					iRow++;

					for(Requisicion requisicion:requisicionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(requisicion.gettiporequisicion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RequisicionConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RequisicionConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(Requisicion requisicion:requisicionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(requisicion.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RequisicionConstantesFunciones.LABEL_HORA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RequisicionConstantesFunciones.LABEL_HORA);
					iRow++;

					for(Requisicion requisicion:requisicionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(requisicion.gethora());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RequisicionConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RequisicionConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(Requisicion requisicion:requisicionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(requisicion.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RequisicionConstantesFunciones.LABEL_IDESTADOREQUISICION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RequisicionConstantesFunciones.LABEL_IDESTADOREQUISICION);
					iRow++;

					for(Requisicion requisicion:requisicionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(requisicion.getestadorequisicion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RequisicionConstantesFunciones.LABEL_IDFORMATO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RequisicionConstantesFunciones.LABEL_IDFORMATO);
					iRow++;

					for(Requisicion requisicion:requisicionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(requisicion.getformato_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RequisicionConstantesFunciones.LABEL_IDBODEGASOLICITAR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RequisicionConstantesFunciones.LABEL_IDBODEGASOLICITAR);
					iRow++;

					for(Requisicion requisicion:requisicionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(requisicion.getbodegasolicitar_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RequisicionConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RequisicionConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(Requisicion requisicion:requisicionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(requisicion.getdescripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RequisicionConstantesFunciones.LABEL_IDBODEGASOLICITA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RequisicionConstantesFunciones.LABEL_IDBODEGASOLICITA);
					iRow++;

					for(Requisicion requisicion:requisicionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(requisicion.getbodegasolicita_descripcion());
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
			//	this.getFilaCabeceraExportarExcelRequisicion(row);				
			//	iRow++;
			//}				
			
			//for(Requisicion requisicionAux:requisicionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelRequisicion(requisicionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.requisicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Requisicion",JOptionPane.INFORMATION_MESSAGE);
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
				this.requisicionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRequisicion(false);
			
			//SI ES MANUAL
			if(RequisicionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRequisicion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresRequisicionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRequisicion(false);
			
			//SI ES MANUAL
			if(RequisicionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRequisicion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesRequisicionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRequisicion(false);
			
			//SI ES MANUAL
			if(RequisicionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRequisicion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaRequisicion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosRequisicion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosRequisicion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosRequisicion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosRequisicion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosRequisicion.setMinimumSize(dimensionMinimum);
		this.jTableDatosRequisicion.setMaximumSize(dimensionMaximum);
		this.jTableDatosRequisicion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingRequisicion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingRequisicion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingRequisicion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaRequisicion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesRequisicion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.requisicionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasRequisicion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRequisicion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesRequisicion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !RequisicionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!RequisicionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualRequisicion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaRequisicion();
		
		this.inicializarActualizarBindingBotonesManualRequisicion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.requisicionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualRequisicion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRequisicion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualRequisicion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualRequisicion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosRequisicion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosRequisicion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteRequisicion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormRequisicion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormRequisicion.jCheckBoxPostAccionNuevoRequisicion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormRequisicion.jCheckBoxPostAccionSinCerrarRequisicion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormRequisicion.jCheckBoxPostAccionSinMensajeRequisicion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosRequisicion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosRequisicion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteRequisicion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormRequisicion!=null) {
				this.jInternalFrameDetalleFormRequisicion.jCheckBoxPostAccionNuevoRequisicion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormRequisicion.jCheckBoxPostAccionSinCerrarRequisicion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormRequisicion.jCheckBoxPostAccionSinMensajeRequisicion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionRequisicion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionRequisicion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormRequisicion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormRequisicion.jComboBoxTiposAccionesFormularioRequisicion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesRequisicion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoRequisicion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRequisicion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesRequisicion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesRequisicion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarRequisicion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesRequisicion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoRequisicion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRequisicion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesRequisicion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralRequisicion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesRequisicion(Boolean esInicializar) throws Exception {
		try	{	
			if(RequisicionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualRequisicion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesRequisicion() throws Exception {
		try	{
			if(RequisicionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualRequisicion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRequisicion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormRequisicion.jComboBoxTiposAccionesFormularioRequisicion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormRequisicion.jComboBoxTiposAccionesFormularioRequisicion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualRequisicion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesRequisicion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesRequisicion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesRequisicion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesRequisicion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesRequisicion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesRequisicion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionRequisicion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionRequisicion.addItem(reporte);
			}
			
			
			if(!this.requisicionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionRequisicion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionRequisicion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesRequisicion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesRequisicion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesRequisicion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesRequisicion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormRequisicion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormRequisicion.jComboBoxTiposAccionesFormularioRequisicion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormRequisicion.jComboBoxTiposAccionesFormularioRequisicion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarRequisicion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarRequisicion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarRequisicion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRequisicion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRequisicion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRequisicion!=null) {
				this.jInternalFrameReporteDinamicoRequisicion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoRequisicion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRequisicion!=null) {
				this.jInternalFrameReporteDinamicoRequisicion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoRequisicion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoRequisicion!=null) {
				
				if(this.jInternalFrameReporteDinamicoRequisicion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRequisicion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRequisicion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoRequisicion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRequisicion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRequisicion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualRequisicion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.numero_secuencialBusquedaPorCodigo=this.jTextFieldnumero_secuencialBusquedaPorCodigoRequisicion.getText();
		if(this.jComboBoxid_bodega_solicitaFK_IdBodegaSolicitaRequisicion.getSelectedItem()!=null){this.id_bodega_solicitaFK_IdBodegaSolicita=((Bodega)this.jComboBoxid_bodega_solicitaFK_IdBodegaSolicitaRequisicion.getSelectedItem()).getId();}
		if(this.jComboBoxid_bodega_solicitarFK_IdBodegaSolicitarRequisicion.getSelectedItem()!=null){this.id_bodega_solicitarFK_IdBodegaSolicitar=((Bodega)this.jComboBoxid_bodega_solicitarFK_IdBodegaSolicitarRequisicion.getSelectedItem()).getId();}
		if(this.jComboBoxid_empleadoFK_IdEmpleadoRequisicion.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoRequisicion.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_requisicionFK_IdTipoRequisicionRequisicion.getSelectedItem()!=null){this.id_tipo_requisicionFK_IdTipoRequisicion=((TipoRequisicion)this.jComboBoxid_tipo_requisicionFK_IdTipoRequisicionRequisicion.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasRequisicion(Boolean esInicializar) throws Exception {				
		if(RequisicionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualRequisicion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaRequisicion() throws Exception {
		this.inicializarActualizarBindingTablaRequisicion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByRequisicion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByRequisicion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByRequisicion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRequisicion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new RequisicionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByRequisicion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRequisicion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new RequisicionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosRequisicionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRequisicionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new RequisicionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByRequisicion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRequisicion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new RequisicionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByRequisicion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaRequisicion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=requisicionLogic.getRequisicions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=requisicions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(RequisicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosRequisicion.setModel(new RequisicionModel(this.requisicionLogic.getRequisicions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosRequisicion.setModel(new RequisicionModel(this.requisicions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByRequisicion!=null && this.jInternalFrameOrderByRequisicion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByRequisicion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRequisicion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new RequisicionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+RequisicionConstantesFunciones.SCLASSWEBTITULO,requisicionConstantesFunciones.resaltarSeleccionarRequisicion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+RequisicionConstantesFunciones.SCLASSWEBTITULO,requisicionConstantesFunciones.resaltarSeleccionarRequisicion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRequisicion,RequisicionConstantesFunciones.LABEL_ID));

		if(this.requisicionConstantesFunciones.mostraridRequisicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RequisicionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.requisicionConstantesFunciones.resaltaridRequisicion,this.requisicionConstantesFunciones.activaridRequisicion,this,true,"idRequisicion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.requisicionConstantesFunciones.resaltaridRequisicion,this.requisicionConstantesFunciones.activaridRequisicion,this,true,"idRequisicion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRequisicion,RequisicionConstantesFunciones.LABEL_IDEMPRESA));

		if(this.requisicionConstantesFunciones.mostrarid_empresaRequisicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RequisicionConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.requisicionConstantesFunciones.resaltarid_empresaRequisicion,this,this.requisicionConstantesFunciones.activarid_empresaRequisicion));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.requisicionConstantesFunciones.resaltarid_empresaRequisicion,this,this.requisicionConstantesFunciones.activarid_empresaRequisicion,false,"id_empresaRequisicion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RequisicionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRequisicion,RequisicionConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.requisicionConstantesFunciones.mostrarid_sucursalRequisicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RequisicionConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.requisicionConstantesFunciones.resaltarid_sucursalRequisicion,this,this.requisicionConstantesFunciones.activarid_sucursalRequisicion));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.requisicionConstantesFunciones.resaltarid_sucursalRequisicion,this,this.requisicionConstantesFunciones.activarid_sucursalRequisicion,false,"id_sucursalRequisicion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RequisicionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRequisicion,RequisicionConstantesFunciones.LABEL_NUMEROSECUENCIAL));

		if(this.requisicionConstantesFunciones.mostrarnumero_secuencialRequisicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RequisicionConstantesFunciones.LABEL_NUMEROSECUENCIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.requisicionConstantesFunciones.resaltarnumero_secuencialRequisicion,this.requisicionConstantesFunciones.activarnumero_secuencialRequisicion,this,true,"numero_secuencialRequisicion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.requisicionConstantesFunciones.resaltarnumero_secuencialRequisicion,this.requisicionConstantesFunciones.activarnumero_secuencialRequisicion,this,true,"numero_secuencialRequisicion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RequisicionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRequisicion,RequisicionConstantesFunciones.LABEL_IDTIPOREQUISICION));

		if(this.requisicionConstantesFunciones.mostrarid_tipo_requisicionRequisicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RequisicionConstantesFunciones.LABEL_IDTIPOREQUISICION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoRequisicionTableCell(this.tiporequisicionsForeignKey,this.requisicionConstantesFunciones.resaltarid_tipo_requisicionRequisicion,this,this.requisicionConstantesFunciones.activarid_tipo_requisicionRequisicion));
			tableColumn.setCellEditor(new TipoRequisicionTableCell(this.tiporequisicionsForeignKey,this.requisicionConstantesFunciones.resaltarid_tipo_requisicionRequisicion,this,this.requisicionConstantesFunciones.activarid_tipo_requisicionRequisicion,true,"id_tipo_requisicionRequisicion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RequisicionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRequisicion,RequisicionConstantesFunciones.LABEL_FECHA));

		if(this.requisicionConstantesFunciones.mostrarfechaRequisicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RequisicionConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.requisicionConstantesFunciones.resaltarfechaRequisicion,this.requisicionConstantesFunciones.activarfechaRequisicion,this,true,"fechaRequisicion","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.requisicionConstantesFunciones.resaltarfechaRequisicion,this.requisicionConstantesFunciones.activarfechaRequisicion,this,true,"fechaRequisicion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new RequisicionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRequisicion,RequisicionConstantesFunciones.LABEL_HORA));

		if(this.requisicionConstantesFunciones.mostrarhoraRequisicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RequisicionConstantesFunciones.LABEL_HORA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TimeRenderer(this.requisicionConstantesFunciones.resaltarhoraRequisicion,this.requisicionConstantesFunciones.activarhoraRequisicion,this,true,"horaRequisicion","BASICO"));
			tableColumn.setCellEditor(new TimeEditorRenderer(this.requisicionConstantesFunciones.resaltarhoraRequisicion,this.requisicionConstantesFunciones.activarhoraRequisicion,this,true,"horaRequisicion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new RequisicionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRequisicion,RequisicionConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.requisicionConstantesFunciones.mostrarid_empleadoRequisicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RequisicionConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.requisicionConstantesFunciones.resaltarid_empleadoRequisicion,this,this.requisicionConstantesFunciones.activarid_empleadoRequisicion));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.requisicionConstantesFunciones.resaltarid_empleadoRequisicion,this,this.requisicionConstantesFunciones.activarid_empleadoRequisicion,true,"id_empleadoRequisicion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new RequisicionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRequisicion,RequisicionConstantesFunciones.LABEL_IDESTADOREQUISICION));

		if(this.requisicionConstantesFunciones.mostrarid_estado_requisicionRequisicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RequisicionConstantesFunciones.LABEL_IDESTADOREQUISICION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstadoRequisicionTableCell(this.estadorequisicionsForeignKey,this.requisicionConstantesFunciones.resaltarid_estado_requisicionRequisicion,this,this.requisicionConstantesFunciones.activarid_estado_requisicionRequisicion));
			tableColumn.setCellEditor(new EstadoRequisicionTableCell(this.estadorequisicionsForeignKey,this.requisicionConstantesFunciones.resaltarid_estado_requisicionRequisicion,this,this.requisicionConstantesFunciones.activarid_estado_requisicionRequisicion,true,"id_estado_requisicionRequisicion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RequisicionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRequisicion,RequisicionConstantesFunciones.LABEL_IDFORMATO));

		if(this.requisicionConstantesFunciones.mostrarid_formatoRequisicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RequisicionConstantesFunciones.LABEL_IDFORMATO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FormatoTableCell(this.formatosForeignKey,this.requisicionConstantesFunciones.resaltarid_formatoRequisicion,this,this.requisicionConstantesFunciones.activarid_formatoRequisicion));
			tableColumn.setCellEditor(new FormatoTableCell(this.formatosForeignKey,this.requisicionConstantesFunciones.resaltarid_formatoRequisicion,this,this.requisicionConstantesFunciones.activarid_formatoRequisicion,true,"id_formatoRequisicion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RequisicionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRequisicion,RequisicionConstantesFunciones.LABEL_IDBODEGASOLICITAR));

		if(this.requisicionConstantesFunciones.mostrarid_bodega_solicitarRequisicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RequisicionConstantesFunciones.LABEL_IDBODEGASOLICITAR,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BodegaTableCell(this.bodegasolicitarsForeignKey,this.requisicionConstantesFunciones.resaltarid_bodega_solicitarRequisicion,this,this.requisicionConstantesFunciones.activarid_bodega_solicitarRequisicion));
			tableColumn.setCellEditor(new BodegaTableCell(this.bodegasolicitarsForeignKey,this.requisicionConstantesFunciones.resaltarid_bodega_solicitarRequisicion,this,this.requisicionConstantesFunciones.activarid_bodega_solicitarRequisicion,true,"id_bodega_solicitarRequisicion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new RequisicionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRequisicion,RequisicionConstantesFunciones.LABEL_DESCRIPCION));

		if(this.requisicionConstantesFunciones.mostrardescripcionRequisicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RequisicionConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.requisicionConstantesFunciones.resaltardescripcionRequisicion,this.requisicionConstantesFunciones.activardescripcionRequisicion,this,true,"descripcionRequisicion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.requisicionConstantesFunciones.resaltardescripcionRequisicion,this.requisicionConstantesFunciones.activardescripcionRequisicion,this,true,"descripcionRequisicion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200);
			//tableColumn.addPropertyChangeListener(new RequisicionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRequisicion,RequisicionConstantesFunciones.LABEL_IDBODEGASOLICITA));

		if(this.requisicionConstantesFunciones.mostrarid_bodega_solicitaRequisicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RequisicionConstantesFunciones.LABEL_IDBODEGASOLICITA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BodegaTableCell(this.bodegasolicitasForeignKey,this.requisicionConstantesFunciones.resaltarid_bodega_solicitaRequisicion,this,this.requisicionConstantesFunciones.activarid_bodega_solicitaRequisicion));
			tableColumn.setCellEditor(new BodegaTableCell(this.bodegasolicitasForeignKey,this.requisicionConstantesFunciones.resaltarid_bodega_solicitaRequisicion,this,this.requisicionConstantesFunciones.activarid_bodega_solicitaRequisicion,true,"id_bodega_solicitaRequisicion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new RequisicionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.requisicionSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDetalleRequisicion && this.requisicionConstantesFunciones.mostrarDetalleRequisicionRequisicion && !RequisicionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Requisicions");
				tableColumn.setHeaderValue("Detalle Requisicions");
				tableColumn.setCellRenderer(new DetalleRequisicionTableCell(requisicionConstantesFunciones.resaltarDetalleRequisicionRequisicion,this,this.requisicionConstantesFunciones.activarDetalleRequisicionRequisicion));
				tableColumn.setCellEditor(new DetalleRequisicionTableCell(requisicionConstantesFunciones.resaltarDetalleRequisicionRequisicion,this,this.requisicionConstantesFunciones.activarDetalleRequisicionRequisicion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosRequisicion.addColumn(tableColumn);
			}
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.requisicionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.requisicionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosRequisicion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				//tableColumn= new TableColumn();
				//tableColumn.setIdentifier(sLabelColumnAccion);
				//tableColumn.setHeaderValue(sLabelColumnAccion);
				//tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.requisicionSessionBean.getEsGuardarRelacionado()));
				//tableColumn.setCellEditor(new IdTableCell(this,false,false,this.requisicionSessionBean.getEsGuardarRelacionado()));
		
				//tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				//tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				//tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				//tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				//this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				//this.jTableDatosRequisicion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarRequisicion && this.isPermisoGuardarCambiosRequisicion) {
					//tableColumn= new TableColumn();
					//tableColumn.setIdentifier(Constantes2.S_ELI);
					//tableColumn.setHeaderValue(sLabelColumnAccionEli);
					//tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.requisicionSessionBean.getEsGuardarRelacionado()));
					//tableColumn.setCellEditor(new IdTableCell(this,false,true,this.requisicionSessionBean.getEsGuardarRelacionado()));
			
					//tableColumn.setPreferredWidth(65); 	 
					//tableColumn.setWidth(65); 	 
					//tableColumn.setMinWidth(65); 
					//tableColumn.setMaxWidth(65);
					
					//this.iWidthTableDefinicion+=65;
						
					//this.jTableDatosRequisicion.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.requisicionSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosRequisicion.addColumn(tableColumn);
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
			
			this.jTableDatosRequisicion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRequisicion && this.isPermisoGuardarCambiosRequisicion) {
				//iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		//iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.requisicionSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRequisicion && this.isPermisoGuardarCambiosRequisicion) {
				////REUBICA ELIMINAR SIMPLE
				//jTableDatosRequisicion.moveColumn(this.jTableDatosRequisicion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				//iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		//jTableDatosRequisicion.moveColumn(this.jTableDatosRequisicion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.requisicionSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosRequisicion.moveColumn(this.jTableDatosRequisicion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosRequisicion.moveColumn(this.jTableDatosRequisicion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosRequisicion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosRequisicion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosRequisicion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!RequisicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosRequisicion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosRequisicion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!RequisicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!RequisicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosRequisicion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosRequisicion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosRequisicion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=requisicionLogic.getRequisicions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=requisicions.size()-1;
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
		//this.jTableDatosRequisicion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosRequisicion();
			
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
				
				//this.isEsNuevoRequisicion=false;
					
				RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
			
				if(this.requisicionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormRequisicion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRequisicion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRequisicion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicion =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.requisicion =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.requisicion.getsType().equals("DUPLICADO")
				   || this.requisicion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoRequisicion=true;
				
				} else {
					this.isEsNuevoRequisicion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.requisicionSessionBean.getEsGuardarRelacionado()) {
					if(this.requisicion.getId()>=0 && !this.requisicion.getIsNew()) {						
						this.isEsNuevoRequisicion=false;
						
					} else {
						this.isEsNuevoRequisicion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoRequisicion(esRelaciones);						
				
				this.seleccionarRequisicion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.requisicion.getId()<0) {
					this.isEsNuevoRequisicion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarRequisicion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarRequisicion(evt,rowIndex);
				}	
				
				if(this.requisicionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Requisicion: " + this.dDif); 
					}
				}								
				
				RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarRequisicion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.requisicion)) {
					if(this.requisicion.getId()>0) {
						this.requisicion.setIsDeleted(true);
						
						this.requisicionsEliminados.add(this.requisicion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.requisicionLogic.getRequisicions().remove(this.requisicion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.requisicions.remove(this.requisicion);				
					}
					
					
					((RequisicionModel) this.jTableDatosRequisicion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaRequisicion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarRequisicion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoRequisicion) {
			
			if(this.jInternalFrameDetalleFormRequisicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRequisicion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRequisicion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicion =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.requisicion =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(RequisicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioRequisicion(this.requisicion);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.requisicionConstantesFunciones.cargarid_empresaRequisicion || this.requisicionConstantesFunciones.event_dependid_empresaRequisicion) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.requisicion.getid_empresa());
									//this.inicializarActualizarBindingRequisicion(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(requisicion.getEmpresa()!=null) {
							this.empresasForeignKey.add(requisicion.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.requisicion.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.requisicionConstantesFunciones.cargarid_sucursalRequisicion || this.requisicionConstantesFunciones.event_dependid_sucursalRequisicion) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.requisicion.getid_sucursal());
									//this.inicializarActualizarBindingRequisicion(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(requisicion.getSucursal()!=null) {
							this.sucursalsForeignKey.add(requisicion.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.requisicion.getid_sucursal(),false,"Formulario");

					//TipoRequisicion
					if(!this.requisicionConstantesFunciones.cargarid_tipo_requisicionRequisicion || this.requisicionConstantesFunciones.event_dependid_tipo_requisicionRequisicion) {
						//this.cargarCombosTipoRequisicionsForeignKeyLista(" where id="+this.requisicion.getid_tipo_requisicion());
									//this.inicializarActualizarBindingRequisicion(false,false);
						this.tiporequisicionsForeignKey=new ArrayList<TipoRequisicion>();

						if(requisicion.getTipoRequisicion()!=null) {
							this.tiporequisicionsForeignKey.add(requisicion.getTipoRequisicion());
						}

						this.addItemDefectoCombosForeignKeyTipoRequisicion();
						this.cargarCombosFrameTipoRequisicionsForeignKey("Todos");
					}
					this.setActualTipoRequisicionForeignKey(this.requisicion.getid_tipo_requisicion(),false,"Formulario");

					//Empleado
					if(!this.requisicionConstantesFunciones.cargarid_empleadoRequisicion || this.requisicionConstantesFunciones.event_dependid_empleadoRequisicion) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.requisicion.getid_empleado());
									//this.inicializarActualizarBindingRequisicion(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(requisicion.getEmpleado()!=null) {
							this.empleadosForeignKey.add(requisicion.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.requisicion.getid_empleado(),false,"Formulario");

					//EstadoRequisicion
					if(!this.requisicionConstantesFunciones.cargarid_estado_requisicionRequisicion || this.requisicionConstantesFunciones.event_dependid_estado_requisicionRequisicion) {
						//this.cargarCombosEstadoRequisicionsForeignKeyLista(" where id="+this.requisicion.getid_estado_requisicion());
									//this.inicializarActualizarBindingRequisicion(false,false);
						this.estadorequisicionsForeignKey=new ArrayList<EstadoRequisicion>();

						if(requisicion.getEstadoRequisicion()!=null) {
							this.estadorequisicionsForeignKey.add(requisicion.getEstadoRequisicion());
						}

						this.addItemDefectoCombosForeignKeyEstadoRequisicion();
						this.cargarCombosFrameEstadoRequisicionsForeignKey("Todos");
					}
					this.setActualEstadoRequisicionForeignKey(this.requisicion.getid_estado_requisicion(),false,"Formulario");

					//Formato
					if(!this.requisicionConstantesFunciones.cargarid_formatoRequisicion || this.requisicionConstantesFunciones.event_dependid_formatoRequisicion) {
						//this.cargarCombosFormatosForeignKeyLista(" where id="+this.requisicion.getid_formato());
									//this.inicializarActualizarBindingRequisicion(false,false);
						this.formatosForeignKey=new ArrayList<Formato>();

						if(requisicion.getFormato()!=null) {
							this.formatosForeignKey.add(requisicion.getFormato());
						}

						this.addItemDefectoCombosForeignKeyFormato();
						this.cargarCombosFrameFormatosForeignKey("Todos");
					}
					this.setActualFormatoForeignKey(this.requisicion.getid_formato(),false,"Formulario");

					//BodegaSolicitar
					if(!this.requisicionConstantesFunciones.cargarid_bodega_solicitarRequisicion || this.requisicionConstantesFunciones.event_dependid_bodega_solicitarRequisicion) {
						//this.cargarCombosBodegaSolicitarsForeignKeyLista(" where id="+this.requisicion.getid_bodega_solicitar());
									//this.inicializarActualizarBindingRequisicion(false,false);
						this.bodegasolicitarsForeignKey=new ArrayList<Bodega>();

						if(requisicion.getBodegaSolicitar()!=null) {
							this.bodegasolicitarsForeignKey.add(requisicion.getBodegaSolicitar());
						}

						this.addItemDefectoCombosForeignKeyBodegaSolicitar();
						this.cargarCombosFrameBodegaSolicitarsForeignKey("Todos");
					}
					this.setActualBodegaSolicitarForeignKey(this.requisicion.getid_bodega_solicitar(),false,"Formulario");

					//BodegaSolicita
					if(!this.requisicionConstantesFunciones.cargarid_bodega_solicitaRequisicion || this.requisicionConstantesFunciones.event_dependid_bodega_solicitaRequisicion) {
						//this.cargarCombosBodegaSolicitasForeignKeyLista(" where id="+this.requisicion.getid_bodega_solicita());
									//this.inicializarActualizarBindingRequisicion(false,false);
						this.bodegasolicitasForeignKey=new ArrayList<Bodega>();

						if(requisicion.getBodegaSolicita()!=null) {
							this.bodegasolicitasForeignKey.add(requisicion.getBodegaSolicita());
						}

						this.addItemDefectoCombosForeignKeyBodegaSolicita();
						this.cargarCombosFrameBodegaSolicitasForeignKey("Todos");
					}
					this.setActualBodegaSolicitaForeignKey(this.requisicion.getid_bodega_solicita(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesRequisicion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesRequisicion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRequisicion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoRequisicion(Requisicion requisicion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoRequisicion(requisicion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoRequisicion(Requisicion requisicion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioRequisicion(requisicion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyRequisicion(requisicion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyRequisicion(requisicion);
	}
	
	public void setVariablesObjetoActualToFormularioRequisicion(Requisicion requisicion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormRequisicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormRequisicion.jLabelidRequisicion.setText(requisicion.getId().toString());
			this.jInternalFrameDetalleFormRequisicion.jTextFieldnumero_secuencialRequisicion.setText(requisicion.getnumero_secuencial());
			this.jInternalFrameDetalleFormRequisicion.jDateChooserfechaRequisicion.setDate(requisicion.getfecha());
			this.jInternalFrameDetalleFormRequisicion.jSpinnerhoraRequisicion.setValue(requisicion.gethora());
			this.jInternalFrameDetalleFormRequisicion.jTextAreadescripcionRequisicion.setText(requisicion.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Requisicion requisicionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,requisicionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Requisicion requisicionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				requisicionLocal=this.requisicion;
			} else {
				requisicionLocal=this.requisicionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(requisicionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoRequisicion(requisicionLocal,true);
					
					if(requisicionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(requisicionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.requisicionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(requisicionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoRequisicion(Requisicion requisicion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRequisicion(requisicion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(requisicion);
	}
	
	public void setVariablesFormularioToObjetoActualRequisicion(Requisicion requisicion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRequisicion(requisicion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualRequisicion(Requisicion requisicion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormRequisicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormRequisicion.jLabelidRequisicion.getText()==null || this.jInternalFrameDetalleFormRequisicion.jLabelidRequisicion.getText()=="" || this.jInternalFrameDetalleFormRequisicion.jLabelidRequisicion.getText()=="Id") {
				this.jInternalFrameDetalleFormRequisicion.jLabelidRequisicion.setText("0");
			}

			if(conColumnasBase) {requisicion.setId(Long.parseLong(this.jInternalFrameDetalleFormRequisicion.jLabelidRequisicion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RequisicionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRequisicion.jLabelIdRequisicion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			requisicion.setnumero_secuencial(this.jInternalFrameDetalleFormRequisicion.jTextFieldnumero_secuencialRequisicion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RequisicionConstantesFunciones.LABEL_NUMEROSECUENCIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRequisicion.jLabelnumero_secuencialRequisicion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			requisicion.setfecha(this.jInternalFrameDetalleFormRequisicion.jDateChooserfechaRequisicion.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RequisicionConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRequisicion.jLabelfechaRequisicion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			requisicion.sethora(new Time(((Date)this.jInternalFrameDetalleFormRequisicion.jSpinnerhoraRequisicion.getValue()).getTime()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RequisicionConstantesFunciones.LABEL_HORA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRequisicion.jLabelhoraRequisicion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			requisicion.setdescripcion(this.jInternalFrameDetalleFormRequisicion.jTextAreadescripcionRequisicion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RequisicionConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRequisicion.jLabeldescripcionRequisicion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRequisicion(Requisicion requisicionBean,Requisicion requisicion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && requisicionBean.getid_tipo_requisicion()!=null && !requisicionBean.getid_tipo_requisicion().equals(-1L))) {requisicion.setid_tipo_requisicion(requisicionBean.getid_tipo_requisicion());}
			if(conDefault || (!conDefault && requisicionBean.getid_empleado()!=null && !requisicionBean.getid_empleado().equals(-1L))) {requisicion.setid_empleado(requisicionBean.getid_empleado());}
			if(conDefault || (!conDefault && requisicionBean.getid_estado_requisicion()!=null && !requisicionBean.getid_estado_requisicion().equals(-1L))) {requisicion.setid_estado_requisicion(requisicionBean.getid_estado_requisicion());}
			if(conDefault || (!conDefault && requisicionBean.getid_formato()!=null && !requisicionBean.getid_formato().equals(-1L))) {requisicion.setid_formato(requisicionBean.getid_formato());}
			if(conDefault || (!conDefault && requisicionBean.getid_bodega_solicitar()!=null && !requisicionBean.getid_bodega_solicitar().equals(-1L))) {requisicion.setid_bodega_solicitar(requisicionBean.getid_bodega_solicitar());}
			if(conDefault || (!conDefault && requisicionBean.getid_bodega_solicita()!=null && !requisicionBean.getid_bodega_solicita().equals(-1L))) {requisicion.setid_bodega_solicita(requisicionBean.getid_bodega_solicita());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosRequisicion(Requisicion requisicionOrigen,Requisicion requisicion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && requisicionOrigen.getId()!=null && !requisicionOrigen.getId().equals(0L))) {requisicion.setId(requisicionOrigen.getId());}}
			if(conDefault || (!conDefault && requisicionOrigen.getnumero_secuencial()!=null && !requisicionOrigen.getnumero_secuencial().equals(""))) {requisicion.setnumero_secuencial(requisicionOrigen.getnumero_secuencial());}
			if(conDefault || (!conDefault && requisicionOrigen.getid_tipo_requisicion()!=null && !requisicionOrigen.getid_tipo_requisicion().equals(-1L))) {requisicion.setid_tipo_requisicion(requisicionOrigen.getid_tipo_requisicion());}
			if(conDefault || (!conDefault && requisicionOrigen.getfecha()!=null && !requisicionOrigen.getfecha().equals(new Date()))) {requisicion.setfecha(requisicionOrigen.getfecha());}
			if(conDefault || (!conDefault && requisicionOrigen.gethora()!=null && !requisicionOrigen.gethora().equals(new Time((new Date()).getTime())))) {requisicion.sethora(requisicionOrigen.gethora());}
			if(conDefault || (!conDefault && requisicionOrigen.getid_empleado()!=null && !requisicionOrigen.getid_empleado().equals(-1L))) {requisicion.setid_empleado(requisicionOrigen.getid_empleado());}
			if(conDefault || (!conDefault && requisicionOrigen.getid_estado_requisicion()!=null && !requisicionOrigen.getid_estado_requisicion().equals(-1L))) {requisicion.setid_estado_requisicion(requisicionOrigen.getid_estado_requisicion());}
			if(conDefault || (!conDefault && requisicionOrigen.getid_formato()!=null && !requisicionOrigen.getid_formato().equals(-1L))) {requisicion.setid_formato(requisicionOrigen.getid_formato());}
			if(conDefault || (!conDefault && requisicionOrigen.getid_bodega_solicitar()!=null && !requisicionOrigen.getid_bodega_solicitar().equals(-1L))) {requisicion.setid_bodega_solicitar(requisicionOrigen.getid_bodega_solicitar());}
			if(conDefault || (!conDefault && requisicionOrigen.getdescripcion()!=null && !requisicionOrigen.getdescripcion().equals(""))) {requisicion.setdescripcion(requisicionOrigen.getdescripcion());}
			if(conDefault || (!conDefault && requisicionOrigen.getid_bodega_solicita()!=null && !requisicionOrigen.getid_bodega_solicita().equals(-1L))) {requisicion.setid_bodega_solicita(requisicionOrigen.getid_bodega_solicita());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRequisicion(Requisicion requisicion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRequisicion.jLabelidRequisicion.setText(requisicion.getId().toString());
			this.jInternalFrameDetalleFormRequisicion.jTextFieldnumero_secuencialRequisicion.setText(requisicion.getnumero_secuencial());
			this.jInternalFrameDetalleFormRequisicion.jDateChooserfechaRequisicion.setDate(requisicion.getfecha());
			this.jInternalFrameDetalleFormRequisicion.jSpinnerhoraRequisicion.setValue(requisicion.gethora());
			this.jInternalFrameDetalleFormRequisicion.jTextAreadescripcionRequisicion.setText(requisicion.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRequisicion(RequisicionBean requisicionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRequisicion.jLabelidRequisicion.setText(requisicionBean.getId().toString());
			this.jInternalFrameDetalleFormRequisicion.jTextFieldnumero_secuencialRequisicion.setText(requisicionBean.getnumero_secuencial());
			this.jInternalFrameDetalleFormRequisicion.jDateChooserfechaRequisicion.setDate(requisicionBean.getfecha());
			this.jInternalFrameDetalleFormRequisicion.jSpinnerhoraRequisicion.setValue(requisicionBean.gethora());
			this.jInternalFrameDetalleFormRequisicion.jTextAreadescripcionRequisicion.setText(requisicionBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanRequisicion(RequisicionParameterReturnGeneral requisicionReturnGeneral,RequisicionBean requisicionBean,Boolean conDefault) throws Exception { 
		try {
			Requisicion requisicionLocal=new Requisicion();
			
			requisicionLocal=requisicionReturnGeneral.getRequisicion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && requisicionLocal.getId()!=null && !requisicionLocal.getId().equals(0L))) {requisicionBean.setId(requisicionLocal.getId());}}
			if(conDefault || (!conDefault && requisicionLocal.getnumero_secuencial()!=null && !requisicionLocal.getnumero_secuencial().equals(""))) {requisicionBean.setnumero_secuencial(requisicionLocal.getnumero_secuencial());}
			if(conDefault || (!conDefault && requisicionLocal.getid_tipo_requisicion()!=null && !requisicionLocal.getid_tipo_requisicion().equals(-1L))) {requisicionBean.setid_tipo_requisicion(requisicionLocal.getid_tipo_requisicion());}
			if(conDefault || (!conDefault && requisicionLocal.getfecha()!=null && !requisicionLocal.getfecha().equals(new Date()))) {requisicionBean.setfecha(requisicionLocal.getfecha());}
			if(conDefault || (!conDefault && requisicionLocal.gethora()!=null && !requisicionLocal.gethora().equals(new Time((new Date()).getTime())))) {requisicionBean.sethora(requisicionLocal.gethora());}
			if(conDefault || (!conDefault && requisicionLocal.getid_empleado()!=null && !requisicionLocal.getid_empleado().equals(-1L))) {requisicionBean.setid_empleado(requisicionLocal.getid_empleado());}
			if(conDefault || (!conDefault && requisicionLocal.getid_estado_requisicion()!=null && !requisicionLocal.getid_estado_requisicion().equals(-1L))) {requisicionBean.setid_estado_requisicion(requisicionLocal.getid_estado_requisicion());}
			if(conDefault || (!conDefault && requisicionLocal.getid_formato()!=null && !requisicionLocal.getid_formato().equals(-1L))) {requisicionBean.setid_formato(requisicionLocal.getid_formato());}
			if(conDefault || (!conDefault && requisicionLocal.getid_bodega_solicitar()!=null && !requisicionLocal.getid_bodega_solicitar().equals(-1L))) {requisicionBean.setid_bodega_solicitar(requisicionLocal.getid_bodega_solicitar());}
			if(conDefault || (!conDefault && requisicionLocal.getdescripcion()!=null && !requisicionLocal.getdescripcion().equals(""))) {requisicionBean.setdescripcion(requisicionLocal.getdescripcion());}
			if(conDefault || (!conDefault && requisicionLocal.getid_bodega_solicita()!=null && !requisicionLocal.getid_bodega_solicita().equals(-1L))) {requisicionBean.setid_bodega_solicita(requisicionLocal.getid_bodega_solicita());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxRequisicionGenerico(Long idRequisicionSeleccionado,JComboBox jComboBoxRequisicion,List<Requisicion> requisicionsLocal)throws Exception {
		try {
			Requisicion  requisicionTemp=null;

			for(Requisicion requisicionAux:requisicionsLocal) {
				if(requisicionAux.getId()!=null && requisicionAux.getId().equals(idRequisicionSeleccionado)) {
					requisicionTemp=requisicionAux;
					break;
				}
			}

			jComboBoxRequisicion.setSelectedItem(requisicionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxRequisicionGenerico(JComboBox jComboBoxRequisicion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRequisicion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxRequisicion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRequisicion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxRequisicion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("DetalleRequisicion")) {
			jButtonDetalleRequisicionActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			requisicion=(Requisicion) requisicionLogic.getRequisicions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			requisicion =(Requisicion) requisicions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!requisicion.getIsNew() && !requisicion.getIsChanged() && !requisicion.getIsDeleted()) {
				sDescripcion=requisicion.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=requisicion.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!requisicion.getIsNew() && !requisicion.getIsChanged() && !requisicion.getIsDeleted()) {
				sDescripcion=requisicion.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=requisicion.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("TipoRequisicion")) {
			//sDescripcion=this.getActualTipoRequisicionForeignKeyDescripcion((Long)value);
			if(!requisicion.getIsNew() && !requisicion.getIsChanged() && !requisicion.getIsDeleted()) {
				sDescripcion=requisicion.gettiporequisicion_descripcion();
			} else {
				//sDescripcion=this.getActualTipoRequisicionForeignKeyDescripcion((Long)value);
				sDescripcion=requisicion.gettiporequisicion_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!requisicion.getIsNew() && !requisicion.getIsChanged() && !requisicion.getIsDeleted()) {
				sDescripcion=requisicion.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=requisicion.getempleado_descripcion();
			}
		}

		if(sTipo.equals("EstadoRequisicion")) {
			//sDescripcion=this.getActualEstadoRequisicionForeignKeyDescripcion((Long)value);
			if(!requisicion.getIsNew() && !requisicion.getIsChanged() && !requisicion.getIsDeleted()) {
				sDescripcion=requisicion.getestadorequisicion_descripcion();
			} else {
				//sDescripcion=this.getActualEstadoRequisicionForeignKeyDescripcion((Long)value);
				sDescripcion=requisicion.getestadorequisicion_descripcion();
			}
		}

		if(sTipo.equals("Formato")) {
			//sDescripcion=this.getActualFormatoForeignKeyDescripcion((Long)value);
			if(!requisicion.getIsNew() && !requisicion.getIsChanged() && !requisicion.getIsDeleted()) {
				sDescripcion=requisicion.getformato_descripcion();
			} else {
				//sDescripcion=this.getActualFormatoForeignKeyDescripcion((Long)value);
				sDescripcion=requisicion.getformato_descripcion();
			}
		}

		if(sTipo.equals("BodegaSolicitar")) {
			//sDescripcion=this.getActualBodegaSolicitarForeignKeyDescripcion((Long)value);
			if(!requisicion.getIsNew() && !requisicion.getIsChanged() && !requisicion.getIsDeleted()) {
				sDescripcion=requisicion.getbodegasolicitar_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaSolicitarForeignKeyDescripcion((Long)value);
				sDescripcion=requisicion.getbodegasolicitar_descripcion();
			}
		}

		if(sTipo.equals("BodegaSolicita")) {
			//sDescripcion=this.getActualBodegaSolicitaForeignKeyDescripcion((Long)value);
			if(!requisicion.getIsNew() && !requisicion.getIsChanged() && !requisicion.getIsDeleted()) {
				sDescripcion=requisicion.getbodegasolicita_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaSolicitaForeignKeyDescripcion((Long)value);
				sDescripcion=requisicion.getbodegasolicita_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Requisicion requisicionRow=new Requisicion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			requisicionRow=(Requisicion) requisicionLogic.getRequisicions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			requisicionRow=(Requisicion) requisicions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDetalleRequisicionActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Requisicion requisicion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormRequisicion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.requisicion = (Requisicion)this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.requisicion = (Requisicion)this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(requisicion!=null) {
						this.requisicion = requisicion;
					} else {
						this.requisicion = new Requisicion();
					}
				}

				if(this.isTienePermisosDetalleRequisicion && this.permiteMantenimiento(this.requisicion)) {
					DetalleRequisicionBeanSwingJInternalFrame detallerequisicionBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFramePopup=new DetalleRequisicionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detallerequisicionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFramePopup;
					} else {
						detallerequisicionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame;
					}

					List<Requisicion> requisicions=new ArrayList<Requisicion>();
					requisicions.add(this.requisicion);
					if(!esRelacionado) {
						//detallerequisicionBeanSwingJInternalFrame.detallerequisicionSessionBean.setConGuardarRelaciones(false);
						//detallerequisicionBeanSwingJInternalFrame.detallerequisicionSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detallerequisicionBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormRequisicion.cargarDetalleRequisicionBeanSwingJInternalFrame(requisicions,this.requisicion,detallerequisicionBeanSwingJInternalFrame,/*conInicializar,*/detallerequisicionBeanSwingJInternalFrame.detallerequisicionSessionBean.getConGuardarRelaciones(),detallerequisicionBeanSwingJInternalFrame.detallerequisicionSessionBean.getEsGuardarRelacionado());
					detallerequisicionBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detallerequisicionBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleRequisicion("no_relacionado");

						detallerequisicionBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleRequisicionConstantesFunciones.ITAMANIOFILATABLA + (DetalleRequisicionConstantesFunciones.ITAMANIOFILATABLA/2));

						detallerequisicionBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderRequisicion=(TitledBorder)this.jScrollPanelDatosRequisicion.getBorder();
						TitledBorder titledBorderDetalleRequisicion=(TitledBorder)detallerequisicionBeanSwingJInternalFrame.jScrollPanelDatosDetalleRequisicion.getBorder();

						titledBorderDetalleRequisicion.setTitle(titledBorderRequisicion.getTitle() + " -> Detalle Requisicion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detallerequisicionBeanSwingJInternalFrame);
						}

						detallerequisicionBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detallerequisicionBeanSwingJInternalFrame);

						detallerequisicionBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.requisicionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Requisicion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualRequisicion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoRequisicion.setVisible((this.isVisibilidadCeldaNuevoRequisicion && this.isPermisoNuevoRequisicion));			
			this.jButtonDuplicarRequisicion.setVisible((this.isVisibilidadCeldaDuplicarRequisicion && this.isPermisoDuplicarRequisicion));			
			this.jButtonCopiarRequisicion.setVisible((this.isVisibilidadCeldaCopiarRequisicion && this.isPermisoCopiarRequisicion));
			this.jButtonVerFormRequisicion.setVisible((this.isVisibilidadCeldaVerFormRequisicion && this.isPermisoVerFormRequisicion));
			
			this.jButtonAbrirOrderByRequisicion.setVisible((this.isVisibilidadCeldaOrdenRequisicion && this.isPermisoOrdenRequisicion));			
			
			this.jButtonNuevoRelacionesRequisicion.setVisible((this.isVisibilidadCeldaNuevoRelacionesRequisicion && this.isPermisoNuevoRequisicion));			
			this.jButtonNuevoGuardarCambiosRequisicion.setVisible((this.isVisibilidadCeldaNuevoRequisicion && this.isPermisoNuevoRequisicion && this.isPermisoGuardarCambiosRequisicion));
			
			if(this.jInternalFrameDetalleFormRequisicion!=null) {
			this.jInternalFrameDetalleFormRequisicion.jButtonModificarRequisicion.setVisible((this.isVisibilidadCeldaModificarRequisicion && this.isPermisoActualizarRequisicion));	
			this.jInternalFrameDetalleFormRequisicion.jButtonActualizarRequisicion.setVisible((this.isVisibilidadCeldaActualizarRequisicion && this.isPermisoActualizarRequisicion));	
			this.jInternalFrameDetalleFormRequisicion.jButtonEliminarRequisicion.setVisible((this.isVisibilidadCeldaEliminarRequisicion && this.isPermisoEliminarRequisicion));
			this.jInternalFrameDetalleFormRequisicion.jButtonCancelarRequisicion.setVisible(this.isVisibilidadCeldaCancelarRequisicion);							
			this.jInternalFrameDetalleFormRequisicion.jButtonGuardarCambiosRequisicion.setVisible((this.isVisibilidadCeldaGuardarRequisicion && this.isPermisoGuardarCambiosRequisicion));			
			
			}
						
			this.jButtonGuardarCambiosTablaRequisicion.setVisible((this.isVisibilidadCeldaGuardarCambiosRequisicion && this.isPermisoGuardarCambiosRequisicion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarRequisicion.setVisible((this.isVisibilidadCeldaNuevoRequisicion && this.isPermisoNuevoRequisicion));						
			this.jButtonDuplicarToolBarRequisicion.setVisible((this.isVisibilidadCeldaDuplicarRequisicion && this.isPermisoDuplicarRequisicion));						
			this.jButtonCopiarToolBarRequisicion.setVisible((this.isVisibilidadCeldaCopiarRequisicion && this.isPermisoCopiarRequisicion));			
			this.jButtonVerFormToolBarRequisicion.setVisible((this.isVisibilidadCeldaVerFormRequisicion && this.isPermisoVerFormRequisicion));			
			this.jButtonAbrirOrderByToolBarRequisicion.setVisible((this.isVisibilidadCeldaOrdenRequisicion && this.isPermisoOrdenRequisicion));
			this.jButtonNuevoRelacionesToolBarRequisicion.setVisible((this.isVisibilidadCeldaNuevoRelacionesRequisicion && this.isPermisoNuevoRequisicion));			
			this.jButtonNuevoGuardarCambiosToolBarRequisicion.setVisible((this.isVisibilidadCeldaNuevoRequisicion && this.isPermisoNuevoRequisicion && this.isPermisoGuardarCambiosRequisicion));			
			
			if(this.jInternalFrameDetalleFormRequisicion!=null) {
			this.jInternalFrameDetalleFormRequisicion.jButtonModificarToolBarRequisicion.setVisible((this.isVisibilidadCeldaModificarRequisicion && this.isPermisoActualizarRequisicion));	
			this.jInternalFrameDetalleFormRequisicion.jButtonActualizarToolBarRequisicion.setVisible((this.isVisibilidadCeldaActualizarRequisicion  && this.isPermisoActualizarRequisicion));	
			this.jInternalFrameDetalleFormRequisicion.jButtonEliminarToolBarRequisicion.setVisible((this.isVisibilidadCeldaEliminarRequisicion && this.isPermisoEliminarRequisicion));
			this.jInternalFrameDetalleFormRequisicion.jButtonCancelarToolBarRequisicion.setVisible(this.isVisibilidadCeldaCancelarRequisicion);				
			this.jInternalFrameDetalleFormRequisicion.jButtonGuardarCambiosToolBarRequisicion.setVisible((this.isVisibilidadCeldaGuardarRequisicion && this.isPermisoGuardarCambiosRequisicion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarRequisicion.setVisible((this.isVisibilidadCeldaGuardarCambiosRequisicion && this.isPermisoGuardarCambiosRequisicion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoRequisicion.setVisible((this.isVisibilidadCeldaNuevoRequisicion && this.isPermisoNuevoRequisicion));			
			this.jMenuItemDuplicarRequisicion.setVisible((this.isVisibilidadCeldaDuplicarRequisicion && this.isPermisoDuplicarRequisicion));			
			this.jMenuItemCopiarRequisicion.setVisible((this.isVisibilidadCeldaCopiarRequisicion && this.isPermisoCopiarRequisicion));			
			this.jMenuItemVerFormRequisicion.setVisible((this.isVisibilidadCeldaVerFormRequisicion && this.isPermisoVerFormRequisicion));			
			this.jMenuItemAbrirOrderByRequisicion.setVisible((this.isVisibilidadCeldaOrdenRequisicion && this.isPermisoOrdenRequisicion));			
			//this.jMenuItemMostrarOcultarRequisicion.setVisible((this.isVisibilidadCeldaOrdenRequisicion && this.isPermisoOrdenRequisicion));
			this.jMenuItemDetalleAbrirOrderByRequisicion.setVisible((this.isVisibilidadCeldaOrdenRequisicion && this.isPermisoOrdenRequisicion));			
			//this.jMenuItemDetalleMostrarOcultarRequisicion.setVisible((this.isVisibilidadCeldaOrdenRequisicion && this.isPermisoOrdenRequisicion));			
			this.jMenuItemNuevoRelacionesRequisicion.setVisible((this.isVisibilidadCeldaNuevoRelacionesRequisicion && this.isPermisoNuevoRequisicion));			
			this.jMenuItemNuevoGuardarCambiosRequisicion.setVisible((this.isVisibilidadCeldaNuevoRequisicion && this.isPermisoNuevoRequisicion && this.isPermisoGuardarCambiosRequisicion));									
			
			if(this.jInternalFrameDetalleFormRequisicion!=null) {
			this.jInternalFrameDetalleFormRequisicion.jMenuItemModificarRequisicion.setVisible((this.isVisibilidadCeldaModificarRequisicion && this.isPermisoActualizarRequisicion));	
			this.jInternalFrameDetalleFormRequisicion.jMenuItemActualizarRequisicion.setVisible((this.isVisibilidadCeldaActualizarRequisicion && this.isPermisoActualizarRequisicion));	
			this.jInternalFrameDetalleFormRequisicion.jMenuItemEliminarRequisicion.setVisible((this.isVisibilidadCeldaEliminarRequisicion && this.isPermisoEliminarRequisicion));
			this.jInternalFrameDetalleFormRequisicion.jMenuItemCancelarRequisicion.setVisible(this.isVisibilidadCeldaCancelarRequisicion);				
			}
			
			this.jMenuItemGuardarCambiosRequisicion.setVisible((this.isVisibilidadCeldaGuardarRequisicion && this.isPermisoGuardarCambiosRequisicion));						
			this.jMenuItemGuardarCambiosTablaRequisicion.setVisible((this.isVisibilidadCeldaGuardarCambiosRequisicion && this.isPermisoGuardarCambiosRequisicion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoRequisicion=this.jButtonNuevoRequisicion.isVisible();
			this.isVisibilidadCeldaDuplicarRequisicion=this.jButtonDuplicarRequisicion.isVisible();
			this.isVisibilidadCeldaCopiarRequisicion=this.jButtonCopiarRequisicion.isVisible();
			this.isVisibilidadCeldaVerFormRequisicion=this.jButtonVerFormRequisicion.isVisible();
			
			this.isVisibilidadCeldaOrdenRequisicion=this.jButtonAbrirOrderByRequisicion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesRequisicion=this.jButtonNuevoRelacionesRequisicion.isVisible();
			this.isVisibilidadCeldaModificarRequisicion=this.jButtonModificarRequisicion.isVisible();
			
			if(this.jInternalFrameDetalleFormRequisicion!=null) {
			this.isVisibilidadCeldaActualizarRequisicion=this.jInternalFrameDetalleFormRequisicion.jButtonActualizarRequisicion.isVisible();
			this.isVisibilidadCeldaEliminarRequisicion=this.jInternalFrameDetalleFormRequisicion.jButtonEliminarRequisicion.isVisible();
			this.isVisibilidadCeldaCancelarRequisicion=this.jInternalFrameDetalleFormRequisicion.jButtonCancelarRequisicion.isVisible();
			this.isVisibilidadCeldaGuardarRequisicion=this.jInternalFrameDetalleFormRequisicion.jButtonGuardarCambiosRequisicion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosRequisicion=this.jButtonGuardarCambiosTablaRequisicion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoRequisicion=this.jButtonNuevoToolBarRequisicion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRequisicion=this.jButtonNuevoRelacionesToolBarRequisicion.isVisible();
			
			if(this.jInternalFrameDetalleFormRequisicion!=null) {
			this.isVisibilidadCeldaModificarRequisicion=this.jInternalFrameDetalleFormRequisicion.jButtonModificarToolBarRequisicion.isVisible();
			this.isVisibilidadCeldaActualizarRequisicion=this.jInternalFrameDetalleFormRequisicion.jButtonActualizarToolBarRequisicion.isVisible();
			this.isVisibilidadCeldaEliminarRequisicion=this.jInternalFrameDetalleFormRequisicion.jButtonEliminarToolBarRequisicion.isVisible();
			this.isVisibilidadCeldaCancelarRequisicion=this.jInternalFrameDetalleFormRequisicion.jButtonCancelarToolBarRequisicion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRequisicion=this.jButtonGuardarCambiosToolBarRequisicion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRequisicion=this.jButtonGuardarCambiosTablaToolBarRequisicion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoRequisicion=this.jMenuItemNuevoRequisicion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRequisicion=this.jMenuItemNuevoRelacionesRequisicion.isVisible();
			
			if(this.jInternalFrameDetalleFormRequisicion!=null) {
			this.isVisibilidadCeldaModificarRequisicion=this.jInternalFrameDetalleFormRequisicion.jMenuItemModificarRequisicion.isVisible();
			this.isVisibilidadCeldaActualizarRequisicion=this.jInternalFrameDetalleFormRequisicion.jMenuItemActualizarRequisicion.isVisible();
			this.isVisibilidadCeldaEliminarRequisicion=this.jInternalFrameDetalleFormRequisicion.jMenuItemEliminarRequisicion.isVisible();
			this.isVisibilidadCeldaCancelarRequisicion=this.jInternalFrameDetalleFormRequisicion.jMenuItemCancelarRequisicion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRequisicion=this.jMenuItemGuardarCambiosRequisicion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRequisicion=this.jMenuItemGuardarCambiosTablaRequisicion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesRequisicion(Boolean esInicializar) {
		if(RequisicionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.requisicionSessionBean.getConGuardarRelaciones()) {
				//if(this.requisicionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesRequisicion();
			}
			
			this.inicializarActualizarBindingBotonesManualRequisicion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualRequisicion() {
		this.jButtonNuevoRequisicion.setVisible(this.isPermisoNuevoRequisicion);			
		this.jButtonDuplicarRequisicion.setVisible(this.isPermisoDuplicarRequisicion);			
		this.jButtonCopiarRequisicion.setVisible(this.isPermisoCopiarRequisicion);			
		this.jButtonVerFormRequisicion.setVisible(this.isPermisoVerFormRequisicion);			
		
		this.jButtonAbrirOrderByRequisicion.setVisible(this.isPermisoOrdenRequisicion);					
		
		this.jButtonNuevoRelacionesRequisicion.setVisible(this.isPermisoNuevoRequisicion);			
		
		if(this.jInternalFrameDetalleFormRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRequisicion.jButtonModificarRequisicion.setVisible(this.isPermisoActualizarRequisicion);	
			this.jInternalFrameDetalleFormRequisicion.jButtonActualizarRequisicion.setVisible(this.isPermisoActualizarRequisicion);	
			this.jInternalFrameDetalleFormRequisicion.jButtonEliminarRequisicion.setVisible(this.isPermisoEliminarRequisicion);
			this.jInternalFrameDetalleFormRequisicion.jButtonCancelarRequisicion.setVisible(this.isVisibilidadCeldaCancelarRequisicion);						
			this.jInternalFrameDetalleFormRequisicion.jButtonGuardarCambiosRequisicion.setVisible(this.isPermisoGuardarCambiosRequisicion);							
		}
		
		this.jButtonGuardarCambiosTablaRequisicion.setVisible(this.isPermisoActualizarRequisicion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleRequisicion() {
		this.jInternalFrameDetalleFormRequisicion.jButtonModificarRequisicion.setVisible(this.isPermisoActualizarRequisicion);	
		this.jInternalFrameDetalleFormRequisicion.jButtonActualizarRequisicion.setVisible(this.isPermisoActualizarRequisicion);	
		this.jInternalFrameDetalleFormRequisicion.jButtonEliminarRequisicion.setVisible(this.isPermisoEliminarRequisicion);
		this.jInternalFrameDetalleFormRequisicion.jButtonCancelarRequisicion.setVisible(this.isVisibilidadCeldaCancelarRequisicion);							
		this.jInternalFrameDetalleFormRequisicion.jButtonGuardarCambiosRequisicion.setVisible((this.isVisibilidadCeldaGuardarRequisicion && this.isPermisoGuardarCambiosRequisicion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosRequisicion() {
		if(RequisicionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualRequisicion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesRequisicion() {
	}
	
	public void jTableDatosRequisicionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarRequisicion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidRequisicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRequisicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRequisicion(this.getrequisicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.requisicion =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.requisicion =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.requisicion==null) {
						this.requisicion = new Requisicion();
					}

					this.setVariablesFormularioToObjetoActualRequisicion(this.requisicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);
				}

				if(this.requisicion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.requisicion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRequisicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaRequisicionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebRequisicion(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRequisicion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRequisicion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRequisicion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicion =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.requisicion =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRequisicion(this.getrequisicion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.requisicionLogic.getConnexion());

				if(this.requisicion.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.requisicion.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRequisicion=(TitledBorder)this.jScrollPanelDatosRequisicion.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderRequisicion.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaRequisicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRequisicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRequisicion(this.getrequisicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.requisicion =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.requisicion =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.requisicion==null) {
						this.requisicion = new Requisicion();
					}

					this.setVariablesFormularioToObjetoActualRequisicion(this.requisicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);
				}

				if(this.requisicion.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.requisicion.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRequisicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalRequisicionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebRequisicion(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRequisicion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRequisicion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRequisicion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicion =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.requisicion =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRequisicion(this.getrequisicion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.requisicionLogic.getConnexion());

				if(this.requisicion.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.requisicion.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRequisicion=(TitledBorder)this.jScrollPanelDatosRequisicion.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderRequisicion.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalRequisicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRequisicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRequisicion(this.getrequisicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.requisicion =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.requisicion =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.requisicion==null) {
						this.requisicion = new Requisicion();
					}

					this.setVariablesFormularioToObjetoActualRequisicion(this.requisicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);
				}

				if(this.requisicion.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.requisicion.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRequisicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_secuencialRequisicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRequisicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRequisicion(this.getrequisicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.requisicion =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.requisicion =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.requisicion==null) {
						this.requisicion = new Requisicion();
					}

					this.setVariablesFormularioToObjetoActualRequisicion(this.requisicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);
				}

				if(this.requisicion.getnumero_secuencial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_secuencial like '%"+this.requisicion.getnumero_secuencial()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRequisicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_requisicionRequisicionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotiporequisicion=true;

			idTienePermisotiporequisicion=this.tienePermisosUsuarioEnPaginaWebRequisicion(TipoRequisicionConstantesFunciones.CLASSNAME);

			if(idTienePermisotiporequisicion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRequisicion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRequisicion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRequisicion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicion =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.requisicion =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRequisicion(this.getrequisicion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);

				this.tiporequisicionBeanSwingJInternalFrame=new TipoRequisicionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tiporequisicionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tiporequisicionBeanSwingJInternalFrame.getTipoRequisicionLogic().setConnexion(this.requisicionLogic.getConnexion());

				if(this.requisicion.getid_tipo_requisicion()!=null) {
					this.tiporequisicionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tiporequisicionBeanSwingJInternalFrame.setIdActual(this.requisicion.getid_tipo_requisicion());
					this.tiporequisicionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tiporequisicionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tiporequisicionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoRequisicion();
				}

				JInternalFrameBase jinternalFrame =this.tiporequisicionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRequisicion=(TitledBorder)this.jScrollPanelDatosRequisicion.getBorder();
				TitledBorder titledBordertiporequisicion=(TitledBorder)this.tiporequisicionBeanSwingJInternalFrame.jScrollPanelDatosTipoRequisicion.getBorder();

				titledBordertiporequisicion.setTitle(titledBorderRequisicion.getTitle() + " -> Tipo Requesicion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_requisicionRequisicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRequisicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRequisicion(this.getrequisicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.requisicion =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.requisicion =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.requisicion==null) {
						this.requisicion = new Requisicion();
					}

					this.setVariablesFormularioToObjetoActualRequisicion(this.requisicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);
				}

				if(this.requisicion.getid_tipo_requisicion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_requisicion = "+this.requisicion.getid_tipo_requisicion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRequisicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaRequisicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRequisicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRequisicion(this.getrequisicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.requisicion =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.requisicion =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.requisicion==null) {
						this.requisicion = new Requisicion();
					}

					this.setVariablesFormularioToObjetoActualRequisicion(this.requisicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);
				}

				if(this.requisicion.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.requisicion.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRequisicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhoraRequisicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRequisicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRequisicion(this.getrequisicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.requisicion =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.requisicion =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.requisicion==null) {
						this.requisicion = new Requisicion();
					}

					this.setVariablesFormularioToObjetoActualRequisicion(this.requisicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);
				}

				if(this.requisicion.gethora()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where hora = "+this.requisicion.gethora().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRequisicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoRequisicionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebRequisicion(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRequisicion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRequisicion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRequisicion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicion =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.requisicion =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRequisicion(this.getrequisicion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.requisicionLogic.getConnexion());

				if(this.requisicion.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.requisicion.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRequisicion=(TitledBorder)this.jScrollPanelDatosRequisicion.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderRequisicion.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoRequisicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRequisicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRequisicion(this.getrequisicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.requisicion =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.requisicion =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.requisicion==null) {
						this.requisicion = new Requisicion();
					}

					this.setVariablesFormularioToObjetoActualRequisicion(this.requisicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);
				}

				if(this.requisicion.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.requisicion.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRequisicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estado_requisicionRequisicionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestadorequisicion=true;

			idTienePermisoestadorequisicion=this.tienePermisosUsuarioEnPaginaWebRequisicion(EstadoRequisicionConstantesFunciones.CLASSNAME);

			if(idTienePermisoestadorequisicion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRequisicion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRequisicion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRequisicion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicion =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.requisicion =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRequisicion(this.getrequisicion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);

				this.estadorequisicionBeanSwingJInternalFrame=new EstadoRequisicionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estadorequisicionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estadorequisicionBeanSwingJInternalFrame.getEstadoRequisicionLogic().setConnexion(this.requisicionLogic.getConnexion());

				if(this.requisicion.getid_estado_requisicion()!=null) {
					this.estadorequisicionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estadorequisicionBeanSwingJInternalFrame.setIdActual(this.requisicion.getid_estado_requisicion());
					this.estadorequisicionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estadorequisicionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estadorequisicionBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstadoRequisicion();
				}

				JInternalFrameBase jinternalFrame =this.estadorequisicionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRequisicion=(TitledBorder)this.jScrollPanelDatosRequisicion.getBorder();
				TitledBorder titledBorderestadorequisicion=(TitledBorder)this.estadorequisicionBeanSwingJInternalFrame.jScrollPanelDatosEstadoRequisicion.getBorder();

				titledBorderestadorequisicion.setTitle(titledBorderRequisicion.getTitle() + " -> Estado Requisicion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estado_requisicionRequisicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRequisicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRequisicion(this.getrequisicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.requisicion =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.requisicion =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.requisicion==null) {
						this.requisicion = new Requisicion();
					}

					this.setVariablesFormularioToObjetoActualRequisicion(this.requisicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);
				}

				if(this.requisicion.getid_estado_requisicion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estado_requisicion = "+this.requisicion.getid_estado_requisicion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRequisicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_formatoRequisicionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoformato=true;

			idTienePermisoformato=this.tienePermisosUsuarioEnPaginaWebRequisicion(FormatoConstantesFunciones.CLASSNAME);

			if(idTienePermisoformato) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRequisicion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRequisicion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRequisicion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicion =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.requisicion =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRequisicion(this.getrequisicion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);

				this.formatoBeanSwingJInternalFrame=new FormatoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.formatoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.formatoBeanSwingJInternalFrame.getFormatoLogic().setConnexion(this.requisicionLogic.getConnexion());

				if(this.requisicion.getid_formato()!=null) {
					this.formatoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.formatoBeanSwingJInternalFrame.setIdActual(this.requisicion.getid_formato());
					this.formatoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.formatoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.formatoBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormato();
				}

				JInternalFrameBase jinternalFrame =this.formatoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRequisicion=(TitledBorder)this.jScrollPanelDatosRequisicion.getBorder();
				TitledBorder titledBorderformato=(TitledBorder)this.formatoBeanSwingJInternalFrame.jScrollPanelDatosFormato.getBorder();

				titledBorderformato.setTitle(titledBorderRequisicion.getTitle() + " -> Formato");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_formatoRequisicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRequisicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRequisicion(this.getrequisicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.requisicion =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.requisicion =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.requisicion==null) {
						this.requisicion = new Requisicion();
					}

					this.setVariablesFormularioToObjetoActualRequisicion(this.requisicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);
				}

				if(this.requisicion.getid_formato()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_formato = "+this.requisicion.getid_formato().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRequisicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodega_solicitarRequisicionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodegasolicitar=true;

			idTienePermisobodegasolicitar=this.tienePermisosUsuarioEnPaginaWebRequisicion(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodegasolicitar) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRequisicion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRequisicion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRequisicion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicion =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.requisicion =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRequisicion(this.getrequisicion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);

				this.bodegasolicitarBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegasolicitarBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegasolicitarBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.requisicionLogic.getConnexion());

				if(this.requisicion.getid_bodega_solicitar()!=null) {
					this.bodegasolicitarBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegasolicitarBeanSwingJInternalFrame.setIdActual(this.requisicion.getid_bodega_solicitar());
					this.bodegasolicitarBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegasolicitarBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegasolicitarBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegasolicitarBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRequisicion=(TitledBorder)this.jScrollPanelDatosRequisicion.getBorder();
				TitledBorder titledBorderbodegasolicitar=(TitledBorder)this.bodegasolicitarBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodegasolicitar.setTitle(titledBorderRequisicion.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodega_solicitarRequisicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRequisicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRequisicion(this.getrequisicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.requisicion =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.requisicion =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.requisicion==null) {
						this.requisicion = new Requisicion();
					}

					this.setVariablesFormularioToObjetoActualRequisicion(this.requisicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);
				}

				if(this.requisicion.getid_bodega_solicitar()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega_solicitar = "+this.requisicion.getid_bodega_solicitar().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRequisicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionRequisicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRequisicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRequisicion(this.getrequisicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.requisicion =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.requisicion =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.requisicion==null) {
						this.requisicion = new Requisicion();
					}

					this.setVariablesFormularioToObjetoActualRequisicion(this.requisicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);
				}

				if(this.requisicion.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.requisicion.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRequisicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodega_solicitaRequisicionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodegasolicita=true;

			idTienePermisobodegasolicita=this.tienePermisosUsuarioEnPaginaWebRequisicion(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodegasolicita) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRequisicion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRequisicion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRequisicion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicion =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.requisicion =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRequisicion(this.getrequisicion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);

				this.bodegasolicitaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegasolicitaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegasolicitaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.requisicionLogic.getConnexion());

				if(this.requisicion.getid_bodega_solicita()!=null) {
					this.bodegasolicitaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegasolicitaBeanSwingJInternalFrame.setIdActual(this.requisicion.getid_bodega_solicita());
					this.bodegasolicitaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegasolicitaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegasolicitaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegasolicitaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRequisicion=(TitledBorder)this.jScrollPanelDatosRequisicion.getBorder();
				TitledBorder titledBorderbodegasolicita=(TitledBorder)this.bodegasolicitaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodegasolicita.setTitle(titledBorderRequisicion.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodega_solicitaRequisicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRequisicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRequisicion(this.getrequisicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.requisicion =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.requisicion =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.requisicion==null) {
						this.requisicion = new Requisicion();
					}

					this.setVariablesFormularioToObjetoActualRequisicion(this.requisicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);
				}

				if(this.requisicion.getid_bodega_solicita()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega_solicita = "+this.requisicion.getid_bodega_solicita().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRequisicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoRequisicionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRequisicion(false,false);

			this.getRequisicionsBusquedaPorCodigo();

			this.inicializarActualizarBindingRequisicion(false);

			//if(RequisicionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRequisicion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdBodegaSolicitaRequisicionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRequisicion(false,false);

			this.getRequisicionsFK_IdBodegaSolicita();

			this.inicializarActualizarBindingRequisicion(false);

			//if(RequisicionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRequisicion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdBodegaSolicitarRequisicionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRequisicion(false,false);

			this.getRequisicionsFK_IdBodegaSolicitar();

			this.inicializarActualizarBindingRequisicion(false);

			//if(RequisicionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRequisicion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpleadoRequisicionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRequisicion(false,false);

			this.getRequisicionsFK_IdEmpleado();

			this.inicializarActualizarBindingRequisicion(false);

			//if(RequisicionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRequisicion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaRequisicionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRequisicion(false,false);

			this.getRequisicionsFK_IdEmpresa();

			this.inicializarActualizarBindingRequisicion(false);

			//if(RequisicionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRequisicion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstadoRequisicionRequisicionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRequisicion(false,false);

			this.getRequisicionsFK_IdEstadoRequisicion();

			this.inicializarActualizarBindingRequisicion(false);

			//if(RequisicionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRequisicion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFormatoRequisicionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRequisicion(false,false);

			this.getRequisicionsFK_IdFormato();

			this.inicializarActualizarBindingRequisicion(false);

			//if(RequisicionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRequisicion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalRequisicionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRequisicion(false,false);

			this.getRequisicionsFK_IdSucursal();

			this.inicializarActualizarBindingRequisicion(false);

			//if(RequisicionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRequisicion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoRequisicionRequisicionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRequisicion(false,false);

			this.getRequisicionsFK_IdTipoRequisicion();

			this.inicializarActualizarBindingRequisicion(false);

			//if(RequisicionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRequisicion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.requisicionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameRequisicion() {
		if(this.jInternalFrameDetalleFormRequisicion!=null) {
		

		if(this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormRequisicion!=null) {
			this.jInternalFrameDetalleFormRequisicion.setVisible(false);	    			
			this.jInternalFrameDetalleFormRequisicion.dispose();
			this.jInternalFrameDetalleFormRequisicion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoRequisicion!=null) {
			this.jInternalFrameReporteDinamicoRequisicion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoRequisicion.dispose();
			this.jInternalFrameReporteDinamicoRequisicion=null;
		}
		
		if(this.jInternalFrameImportacionRequisicion!=null) {
			this.jInternalFrameImportacionRequisicion.setVisible(false);	    			
			this.jInternalFrameImportacionRequisicion.dispose();
			this.jInternalFrameImportacionRequisicion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessRequisicion();
			
			RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
			
			
			if(sTipo.equals("NuevoRequisicion")) {
				jButtonNuevoRequisicionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarRequisicion")) {
				jButtonDuplicarRequisicionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarRequisicion")) {
				jButtonCopiarRequisicionActionPerformed(evt);
			} else if(sTipo.equals("VerFormRequisicion")) {
				jButtonVerFormRequisicionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarRequisicion")) {
				jButtonNuevoRequisicionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarRequisicion")) {
				jButtonDuplicarRequisicionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoRequisicion")) {
				jButtonNuevoRequisicionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarRequisicion")) {
				jButtonDuplicarRequisicionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesRequisicion")) {
				jButtonNuevoRequisicionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarRequisicion")) {
				jButtonNuevoRequisicionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesRequisicion")) {
				jButtonNuevoRequisicionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarRequisicion")) {
				jButtonModificarRequisicionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarRequisicion")) {
				jButtonModificarRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarRequisicion")) {
				jButtonModificarRequisicionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarRequisicion")) {
				jButtonActualizarRequisicionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarRequisicion")) {
				jButtonActualizarRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarRequisicion")) {
				jButtonActualizarRequisicionActionPerformed(evt);
			} else if(sTipo.equals("EliminarRequisicion")) {
				jButtonEliminarRequisicionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarRequisicion")) {
				jButtonEliminarRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarRequisicion")) {
				jButtonEliminarRequisicionActionPerformed(evt);
			} else if(sTipo.equals("CancelarRequisicion")) {
				jButtonCancelarRequisicionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarRequisicion")) {
				jButtonCancelarRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarRequisicion")) {
				jButtonCancelarRequisicionActionPerformed(evt);
			} else if(sTipo.equals("CerrarRequisicion")) {
				jButtonCerrarRequisicionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarRequisicion")) {
				jButtonCerrarRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarRequisicion")) {
				jButtonCerrarRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarRequisicion")) {
				jButtonMostrarOcultarRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarRequisicion")) {
				jButtonCancelarRequisicionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosRequisicion")) {
				jButtonGuardarCambiosRequisicionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarRequisicion")) {
				jButtonGuardarCambiosRequisicionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarRequisicion")) {
				jButtonCopiarRequisicionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarRequisicion")) {
				jButtonVerFormRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosRequisicion")) {
				jButtonGuardarCambiosRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarRequisicion")) {
				jButtonCopiarRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormRequisicion")) {
				jButtonVerFormRequisicionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaRequisicion")) {
				jButtonGuardarCambiosRequisicionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarRequisicion")) {
				jButtonGuardarCambiosRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaRequisicion")) {
				jButtonGuardarCambiosRequisicionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionRequisicion")) {
				jButtonRecargarInformacionRequisicionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarRequisicion")) {
				jButtonRecargarInformacionRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionRequisicion")) {
				jButtonRecargarInformacionRequisicionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresRequisicion")) {
				jButtonAnterioresRequisicionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarRequisicion")) {
				jButtonAnterioresRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreRequisicion")) {
				jButtonAnterioresRequisicionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesRequisicion")) {
				jButtonSiguientesRequisicionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarRequisicion")) {
				jButtonSiguientesRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesRequisicion")) {
				jButtonSiguientesRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByRequisicion") || sTipo.equals("MenuItemDetalleAbrirOrderByRequisicion")) {
				jButtonAbrirOrderByRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarRequisicion") || sTipo.equals("MenuItemDetalleMostrarOcultarRequisicion")) {
				jButtonMostrarOcultarRequisicionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosRequisicion")) {
				jButtonNuevoGuardarCambiosRequisicionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarRequisicion")) {
				jButtonNuevoGuardarCambiosRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosRequisicion")) {
				jButtonNuevoGuardarCambiosRequisicionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoRequisicion")) {
				jButtonCerrarReporteDinamicoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoRequisicion")) {
				jButtonGenerarReporteDinamicoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoRequisicion")) {
				
				jButtonGenerarExcelReporteDinamicoRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionRequisicion")) {
				jButtonCerrarImportacionRequisicionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionRequisicion")) {
				
				jButtonGenerarImportacionRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionRequisicion")) {
				
				jButtonAbrirImportacionRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesRequisicion")) {
				jComboBoxTiposAccionesRequisicionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesRequisicion")) {
				jComboBoxTiposRelacionesRequisicionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioRequisicion")) {
				jComboBoxTiposAccionesRequisicionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarRequisicion")) {
				
				jComboBoxTiposSeleccionarRequisicionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralRequisicion")) {
				jTextFieldValorCampoGeneralRequisicionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByRequisicion")) {
				jButtonAbrirOrderByRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarRequisicion")) {
				jButtonAbrirOrderByRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByRequisicion")) {
				jButtonCerrarOrderByRequisicionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRequisicionBusqueda")) {
				this.jButtonidRequisicionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaRequisicionUpdate")) {
				this.jButtonid_empresaRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaRequisicionBusqueda")) {
				this.jButtonid_empresaRequisicionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalRequisicionUpdate")) {
				this.jButtonid_sucursalRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalRequisicionBusqueda")) {
				this.jButtonid_sucursalRequisicionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_secuencialRequisicionBusqueda")) {
				this.jButtonnumero_secuencialRequisicionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_requisicionRequisicionUpdate")) {
				this.jButtonid_tipo_requisicionRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_requisicionRequisicionBusqueda")) {
				this.jButtonid_tipo_requisicionRequisicionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaRequisicionBusqueda")) {
				this.jButtonfechaRequisicionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horaRequisicionBusqueda")) {
				this.jButtonhoraRequisicionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoRequisicionUpdate")) {
				this.jButtonid_empleadoRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoRequisicionBusqueda")) {
				this.jButtonid_empleadoRequisicionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_requisicionRequisicionUpdate")) {
				this.jButtonid_estado_requisicionRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_requisicionRequisicionBusqueda")) {
				this.jButtonid_estado_requisicionRequisicionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formatoRequisicionUpdate")) {
				this.jButtonid_formatoRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formatoRequisicionBusqueda")) {
				this.jButtonid_formatoRequisicionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodega_solicitarRequisicionUpdate")) {
				this.jButtonid_bodega_solicitarRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodega_solicitarRequisicionBusqueda")) {
				this.jButtonid_bodega_solicitarRequisicionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionRequisicionBusqueda")) {
				this.jButtondescripcionRequisicionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodega_solicitaRequisicionUpdate")) {
				this.jButtonid_bodega_solicitaRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodega_solicitaRequisicionBusqueda")) {
				this.jButtonid_bodega_solicitaRequisicionBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoRequisicion")) {
				this.jButtonBusquedaPorCodigoRequisicionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdBodegaSolicitaRequisicion")) {
				this.jButtonFK_IdBodegaSolicitaRequisicionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdBodegaSolicitarRequisicion")) {
				this.jButtonFK_IdBodegaSolicitarRequisicionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEmpleadoRequisicion")) {
				this.jButtonFK_IdEmpleadoRequisicionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoRequisicionRequisicion")) {
				this.jButtonFK_IdTipoRequisicionRequisicionActionPerformed(evt);
			}
			
			;
			
			
			RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessRequisicion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRequisicionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.requisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.requisicion);
				
				RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
				
				


				
				RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Requisicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Requisicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Requisicion requisicionLocal=null;
			
			if(!this.getEsControlTabla()) {
				requisicionLocal=this.requisicion;
			} else {
				requisicionLocal=this.requisicionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.requisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.requisicion);
				
				RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
							
				
				


				
				RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Requisicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Requisicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRequisicionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRequisicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionAnterior =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.requisicionAnterior =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
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
			
			RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
			
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
			
			


			
			RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRequisicionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.requisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.requisicion);
				
				RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
								
						
				


				
				RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Requisicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Requisicion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.requisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.requisicion);
				
				RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
								
				
				


				
				RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Requisicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Requisicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRequisicionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRequisicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionAnterior =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.requisicionAnterior =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.requisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.requisicion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRequisicionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRequisicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionAnterior =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.requisicionAnterior =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRequisicionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.requisicion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.requisicion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.requisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.requisicion);
				
				RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
							
				
				


				
				RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Requisicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Requisicion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRequisicionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRequisicion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.requisicionAnterior =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.requisicionAnterior =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
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
			
			RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
			
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
			
			


			
			RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRequisicionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.requisicion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.requisicion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.requisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.requisicion);
				
				RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
								
				
				


				
				RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Requisicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Requisicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRequisicionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRequisicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionAnterior =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.requisicionAnterior =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRequisicionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.requisicion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.requisicion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRequisicionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.requisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.requisicion);
				
				RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosRequisicion")) {
					jCheckBoxSeleccionarTodosRequisicionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosRequisicion")) {
					jCheckBoxSeleccionadosRequisicionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarRequisicion")) {
					
				}
				
				


				
				
				RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Requisicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Requisicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.requisicion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.requisicion);
				
				RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
												
				
				


				
				
				RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Requisicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Requisicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRequisicionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRequisicion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.requisicionAnterior =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.requisicionAnterior =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRequisicionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.requisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.requisicion);
				
				RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
				
				
				RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
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
			
			RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
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
			
			


			
			RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRequisicionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.requisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.requisicion);
				
				RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Requisicion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Requisicion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.requisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.requisicion);
				
				RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
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
				
				


				
				RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Requisicion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Requisicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRequisicionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRequisicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.requisicionAnterior =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.requisicionAnterior =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarRequisicion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosRequisicionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosRequisicion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.requisicion =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.requisicion =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.requisicion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarRequisicion")) {
				
				}
				
				RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarRequisicion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosRequisicion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarRequisicion")) {
			
			}
			
			RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessRequisicion();
			
			RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
			
			if(sTipo.equals("NuevoRequisicion")) {
				jButtonNuevoRequisicionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarRequisicion")) {
				jButtonDuplicarRequisicionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarRequisicion")) {
				jButtonCopiarRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormRequisicion")) {
				jButtonVerFormRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesRequisicion")) {
				jButtonNuevoRequisicionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarRequisicion")) {
				jButtonModificarRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarRequisicion")) {
				jButtonActualizarRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarRequisicion")) {
				jButtonEliminarRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaRequisicion")) {
				jButtonGuardarCambiosRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarRequisicion")) {
				jButtonCancelarRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarRequisicion")) {
				jButtonCerrarRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosRequisicion")) {
				jButtonGuardarCambiosRequisicionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosRequisicion")) {
				jButtonNuevoGuardarCambiosRequisicionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByRequisicion")) {
				jButtonAbrirOrderByRequisicionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionRequisicion")) {
				jButtonRecargarInformacionRequisicionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresRequisicion")) {
				jButtonAnterioresRequisicionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesRequisicion")) {
				jButtonSiguientesRequisicionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRequisicionBusqueda")) {
				this.jButtonidRequisicionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaRequisicionUpdate")) {
				this.jButtonid_empresaRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaRequisicionBusqueda")) {
				this.jButtonid_empresaRequisicionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalRequisicionUpdate")) {
				this.jButtonid_sucursalRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalRequisicionBusqueda")) {
				this.jButtonid_sucursalRequisicionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_secuencialRequisicionBusqueda")) {
				this.jButtonnumero_secuencialRequisicionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_requisicionRequisicionUpdate")) {
				this.jButtonid_tipo_requisicionRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_requisicionRequisicionBusqueda")) {
				this.jButtonid_tipo_requisicionRequisicionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaRequisicionBusqueda")) {
				this.jButtonfechaRequisicionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horaRequisicionBusqueda")) {
				this.jButtonhoraRequisicionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoRequisicionUpdate")) {
				this.jButtonid_empleadoRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoRequisicionBusqueda")) {
				this.jButtonid_empleadoRequisicionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_requisicionRequisicionUpdate")) {
				this.jButtonid_estado_requisicionRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_requisicionRequisicionBusqueda")) {
				this.jButtonid_estado_requisicionRequisicionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formatoRequisicionUpdate")) {
				this.jButtonid_formatoRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formatoRequisicionBusqueda")) {
				this.jButtonid_formatoRequisicionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodega_solicitarRequisicionUpdate")) {
				this.jButtonid_bodega_solicitarRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodega_solicitarRequisicionBusqueda")) {
				this.jButtonid_bodega_solicitarRequisicionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionRequisicionBusqueda")) {
				this.jButtondescripcionRequisicionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodega_solicitaRequisicionUpdate")) {
				this.jButtonid_bodega_solicitaRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodega_solicitaRequisicionBusqueda")) {
				this.jButtonid_bodega_solicitaRequisicionBusquedaActionPerformed(evt);
			}
			
			RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessRequisicion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameRequisicion")) {
				closingInternalFrameRequisicion();
				
			} else if(sTipo.equals("jButtonCancelarRequisicion")) {
				JInternalFrameBase jInternalFrameDetalleFormRequisicion = (JInternalFrameBase)evt.getSource();
	            	
	            RequisicionBeanSwingJInternalFrame jInternalFrameParent=(RequisicionBeanSwingJInternalFrame)jInternalFrameDetalleFormRequisicion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarRequisicionActionPerformed(null);
			}
			
			RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.requisicion,new Object(),this.requisicionParameterGeneral,this.requisicionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormRequisicion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormRequisicion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormRequisicion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.requisicion)) {
			if(!esControlTabla) {
				if(RequisicionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualRequisicion(this.requisicion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);			
				}
				
				if(this.requisicionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualRequisicion(this.requisicion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.requisicionReturnGeneral=requisicionLogic.procesarEventosRequisicionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.requisicionLogic.getRequisicions(),this.requisicion,this.requisicionParameterGeneral,this.isEsNuevoRequisicion,classes);//this.requisicionLogic.getRequisicion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanRequisicion(this.requisicionReturnGeneral,this.requisicionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.requisicionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanRequisicion(classes,this.requisicionReturnGeneral,this.requisicionBean,false);
					}
						
					if(this.requisicionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyRequisicion(this.requisicionReturnGeneral.getRequisicion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioRequisicion(this.requisicionReturnGeneral.getRequisicion());	
					}
						
					if(this.requisicionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioRequisicion(this.requisicionReturnGeneral.getRequisicion(),classes);//this.requisicionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioRequisicion(this.requisicion,classes);//this.requisicionBean);									
				}
			
				if(RequisicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualRequisicion(this.requisicion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRequisicion(this.requisicion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.requisicionAnterior!=null) {
						this.requisicion=this.requisicionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.requisicionReturnGeneral=requisicionLogic.procesarEventosRequisicionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.requisicionLogic.getRequisicions(),this.requisicion,this.requisicionParameterGeneral,this.isEsNuevoRequisicion,classes);//this.requisicionLogic.getRequisicion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.requisicionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.requisicionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.requisicionReturnGeneral.getRequisicion(),requisicionLogic.getRequisicions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.requisicionReturnGeneral.getRequisicion(),this.requisicions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosRequisicion.repaint();
				
				//((AbstractTableModel) this.jTableDatosRequisicion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosRequisicion();
			}
		}
	}
	
	public void actualizarVisualTableDatosRequisicion() throws Exception {
		
		RequisicionModel requisicionModel=(RequisicionModel)this.jTableDatosRequisicion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			requisicionModel.requisicions=this.requisicionLogic.getRequisicions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			requisicionModel.requisicions=this.requisicions;
		}
		
		
		((RequisicionModel) this.jTableDatosRequisicion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaRequisicion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getrequisicionAnterior(),this.requisicionLogic.getRequisicions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getrequisicionAnterior(),this.requisicions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosRequisicion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioRequisicion(Requisicion requisicion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleRequisicion.class)) {
					this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.detallerequisicionLogic.setDetalleRequisicions(requisicion.getDetalleRequisicions());
					this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleRequisicion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
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
										
				RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.requisicion,new Object(),generalEntityParameterGeneral,this.requisicionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.requisicionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=RequisicionConstantesFunciones.getClassesRelationshipsOfRequisicion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=RequisicionConstantesFunciones.getClassesRelationshipsFromStringsOfRequisicion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormRequisicion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				RequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.requisicion,new Object(),generalEntityParameterGeneral,this.requisicionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioRequisicion(RequisicionBean requisicionBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleRequisicion.class)) {
					this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.detallerequisicionLogic.setDetalleRequisicions(requisicion.getDetalleRequisicions());
					this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleRequisicion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanRequisicion(ArrayList<Classe> classes,RequisicionReturnGeneral requisicionReturnGeneral,RequisicionBean requisicionBean,Boolean conDefault) throws Exception {
		
			this.requisicionBean.setDetalleRequisicions(requisicionReturnGeneral.getRequisicion().getDetalleRequisicions());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualRequisicion(Requisicion requisicion,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleRequisicion.class)) {
					requisicion.setDetalleRequisicions(this.jInternalFrameDetalleFormRequisicion.detallerequisicionBeanSwingJInternalFrame.detallerequisicionLogic.getDetalleRequisicions());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.requisicion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormRequisicion = new RequisicionDetalleFormJInternalFrame(jDesktopPane,this.requisicionSessionBean.getConGuardarRelaciones(),this.requisicionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormRequisicion);
		this.jInternalFrameDetalleFormRequisicion.setVisible(false);
		this.jInternalFrameDetalleFormRequisicion.setSelected(false);						
		
		this.jInternalFrameDetalleFormRequisicion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormRequisicion.requisicionLogic=this.requisicionLogic;
		
		this.cargarCombosFrameForeignKeyRequisicion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleRequisicion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRequisicion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyRequisicion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyRequisicion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormRequisicion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRequisicion"));
		
		this.jInternalFrameDetalleFormRequisicion.jButtonModificarRequisicion.addActionListener(new ButtonActionListener(this,"ModificarRequisicion"));

		
		this.jInternalFrameDetalleFormRequisicion.jButtonModificarToolBarRequisicion.addActionListener(new ButtonActionListener(this,"ModificarToolBarRequisicion"));
					
		this.jInternalFrameDetalleFormRequisicion.jMenuItemModificarRequisicion.addActionListener(new ButtonActionListener(this,"MenuItemModificarRequisicion"));		
		
		
		
		this.jInternalFrameDetalleFormRequisicion.jButtonActualizarRequisicion.addActionListener (new ButtonActionListener(this,"ActualizarRequisicion"));
		
		
		this.jInternalFrameDetalleFormRequisicion.jButtonActualizarToolBarRequisicion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRequisicion"));
						
		this.jInternalFrameDetalleFormRequisicion.jMenuItemActualizarRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRequisicion"));		
		
		
		
		this.jInternalFrameDetalleFormRequisicion.jButtonEliminarRequisicion.addActionListener (new ButtonActionListener(this,"EliminarRequisicion"));
		
		
		this.jInternalFrameDetalleFormRequisicion.jButtonEliminarToolBarRequisicion.addActionListener (new ButtonActionListener(this,"EliminarToolBarRequisicion"));
								
		this.jInternalFrameDetalleFormRequisicion.jMenuItemEliminarRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRequisicion"));		
		
		
		
		this.jInternalFrameDetalleFormRequisicion.jButtonCancelarRequisicion.addActionListener (new ButtonActionListener(this,"CancelarRequisicion"));
		
		
		this.jInternalFrameDetalleFormRequisicion.jButtonCancelarToolBarRequisicion.addActionListener (new ButtonActionListener(this,"CancelarToolBarRequisicion"));
					
		this.jInternalFrameDetalleFormRequisicion.jMenuItemCancelarRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRequisicion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormRequisicion.jMenuItemDetalleCerrarRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRequisicion"));		
		
		
		
		this.jInternalFrameDetalleFormRequisicion.jButtonGuardarCambiosToolBarRequisicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRequisicion"));
		
		
		
		this.jInternalFrameDetalleFormRequisicion.jButtonGuardarCambiosToolBarRequisicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRequisicion"));
		
		
		
		this.jInternalFrameDetalleFormRequisicion.jComboBoxTiposAccionesFormularioRequisicion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRequisicion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRequisicion.jButtonidRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"idRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRequisicion.jButtonid_empresaRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRequisicion.jButtonid_empresaRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRequisicion.jButtonid_sucursalRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRequisicion.jButtonid_sucursalRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalRequisicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRequisicion.jButtonnumero_secuencialRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"numero_secuencialRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRequisicion.jButtonid_tipo_requisicionRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_requisicionRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRequisicion.jButtonid_tipo_requisicionRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_requisicionRequisicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRequisicion.jButtonfechaRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"fechaRequisicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRequisicion.jButtonhoraRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"horaRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRequisicion.jButtonid_empleadoRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRequisicion.jButtonid_empleadoRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRequisicion.jButtonid_estado_requisicionRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_estado_requisicionRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRequisicion.jButtonid_estado_requisicionRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_requisicionRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRequisicion.jButtonid_formatoRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_formatoRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRequisicion.jButtonid_formatoRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_formatoRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRequisicion.jButtonid_bodega_solicitarRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_bodega_solicitarRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRequisicion.jButtonid_bodega_solicitarRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_bodega_solicitarRequisicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRequisicion.jButtondescripcionRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"descripcionRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRequisicion.jButtonid_bodega_solicitaRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_bodega_solicitaRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRequisicion.jButtonid_bodega_solicitaRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_bodega_solicitaRequisicionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormRequisicion.jTabbedPaneRelacionesRequisicion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRequisicion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameRequisicion"));
		
		if(this.jInternalFrameDetalleFormRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRequisicion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRequisicion"));
		}
		
		this.jTableDatosRequisicion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarRequisicion"));
		
		this.jTableDatosRequisicion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarRequisicion"));
		
		this.jButtonNuevoRequisicion.addActionListener(new ButtonActionListener(this,"NuevoRequisicion"));
		
		this.jButtonDuplicarRequisicion.addActionListener(new ButtonActionListener(this,"DuplicarRequisicion"));
		
		this.jButtonCopiarRequisicion.addActionListener(new ButtonActionListener(this,"CopiarRequisicion"));
		
		this.jButtonVerFormRequisicion.addActionListener(new ButtonActionListener(this,"VerFormRequisicion"));
		
		
		this.jButtonNuevoToolBarRequisicion.addActionListener(new ButtonActionListener(this,"NuevoToolBarRequisicion"));
			
		this.jButtonDuplicarToolBarRequisicion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarRequisicion"));
			
		this.jMenuItemNuevoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoRequisicion"));
			
		this.jMenuItemDuplicarRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarRequisicion"));		
		
		
		this.jButtonNuevoRelacionesRequisicion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesRequisicion"));
		
		
		this.jButtonNuevoRelacionesToolBarRequisicion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarRequisicion"));
			
		this.jMenuItemNuevoRelacionesRequisicion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesRequisicion"));		
		
		
		if(this.jInternalFrameDetalleFormRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRequisicion.jButtonModificarRequisicion.addActionListener(new ButtonActionListener(this,"ModificarRequisicion"));
		}
		
		
		if(this.jInternalFrameDetalleFormRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRequisicion.jButtonModificarToolBarRequisicion.addActionListener(new ButtonActionListener(this,"ModificarToolBarRequisicion"));
			
			this.jInternalFrameDetalleFormRequisicion.jMenuItemModificarRequisicion.addActionListener(new ButtonActionListener(this,"MenuItemModificarRequisicion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRequisicion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormRequisicion.jButtonActualizarRequisicion.addActionListener (new ButtonActionListener(this,"ActualizarRequisicion"));
		}
		
		
		if(this.jInternalFrameDetalleFormRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRequisicion.jButtonActualizarToolBarRequisicion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRequisicion"));
				
			this.jInternalFrameDetalleFormRequisicion.jMenuItemActualizarRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRequisicion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRequisicion.jButtonEliminarRequisicion.addActionListener (new ButtonActionListener(this,"EliminarRequisicion"));
		}
		
		
		if(this.jInternalFrameDetalleFormRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRequisicion.jButtonEliminarToolBarRequisicion.addActionListener (new ButtonActionListener(this,"EliminarToolBarRequisicion"));
						
			this.jInternalFrameDetalleFormRequisicion.jMenuItemEliminarRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRequisicion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRequisicion.jButtonCancelarRequisicion.addActionListener (new ButtonActionListener(this,"CancelarRequisicion"));
		}
		
		
		if(this.jInternalFrameDetalleFormRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRequisicion.jButtonCancelarToolBarRequisicion.addActionListener (new ButtonActionListener(this,"CancelarToolBarRequisicion"));
			
			this.jInternalFrameDetalleFormRequisicion.jMenuItemCancelarRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRequisicion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarRequisicion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarRequisicion"));		
		
		
		this.jButtonCerrarRequisicion.addActionListener (new ButtonActionListener(this,"CerrarRequisicion"));
		
		
		this.jButtonCerrarToolBarRequisicion.addActionListener (new ButtonActionListener(this,"CerrarToolBarRequisicion"));
			
		this.jMenuItemCerrarRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarRequisicion"));
			
		if(this.jInternalFrameDetalleFormRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRequisicion.jMenuItemDetalleCerrarRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRequisicion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRequisicion.jButtonGuardarCambiosRequisicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosRequisicion"));
		}
		
		
		if(this.jInternalFrameDetalleFormRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRequisicion.jButtonGuardarCambiosToolBarRequisicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRequisicion"));
		}
		
		this.jButtonCopiarToolBarRequisicion.addActionListener (new ButtonActionListener(this,"CopiarToolBarRequisicion"));
			
		this.jButtonVerFormToolBarRequisicion.addActionListener (new ButtonActionListener(this,"VerFormToolBarRequisicion"));
		
		this.jMenuItemGuardarCambiosRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosRequisicion"));
			
		this.jMenuItemCopiarRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarRequisicion"));		
		
		this.jMenuItemVerFormRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormRequisicion"));		
		
		
		this.jButtonGuardarCambiosTablaRequisicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRequisicion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarRequisicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarRequisicion"));
			
		this.jMenuItemGuardarCambiosTablaRequisicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRequisicion"));		
		
		
		
		this.jButtonRecargarInformacionRequisicion.addActionListener (new ButtonActionListener(this,"RecargarInformacionRequisicion"));
					
		this.jButtonRecargarInformacionToolBarRequisicion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarRequisicion"));
		
		this.jMenuItemRecargarInformacionRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionRequisicion"));		
		
		
		
		this.jButtonAnterioresRequisicion.addActionListener (new ButtonActionListener(this,"AnterioresRequisicion"));
		
		
		this.jButtonAnterioresToolBarRequisicion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarRequisicion"));
		
		this.jMenuItemAnterioresRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresRequisicion"));		
		
		
		this.jButtonSiguientesRequisicion.addActionListener (new ButtonActionListener(this,"SiguientesRequisicion"));
		
		
		this.jButtonSiguientesToolBarRequisicion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarRequisicion"));
			
		this.jMenuItemSiguientesRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesRequisicion"));
			
		this.jMenuItemAbrirOrderByRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByRequisicion"));
			
		this.jMenuItemMostrarOcultarRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarRequisicion"));
			
		this.jMenuItemDetalleAbrirOrderByRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByRequisicion"));
			
		this.jMenuItemDetalleMostarOcultarRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarRequisicion"));		
		
		
		this.jButtonNuevoGuardarCambiosRequisicion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosRequisicion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarRequisicion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarRequisicion"));
			
		this.jMenuItemNuevoGuardarCambiosRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosRequisicion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosRequisicion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosRequisicion"));

		this.jCheckBoxSeleccionadosRequisicion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosRequisicion"));
		
		if(this.jInternalFrameDetalleFormRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRequisicion.jComboBoxTiposAccionesFormularioRequisicion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRequisicion"));
		}
		
		
		this.jComboBoxTiposRelacionesRequisicion.addActionListener (new ButtonActionListener(this,"TiposRelacionesRequisicion"));
			
		this.jComboBoxTiposAccionesRequisicion.addActionListener (new ButtonActionListener(this,"TiposAccionesRequisicion"));
					
		this.jComboBoxTiposSeleccionarRequisicion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarRequisicion"));
			
		this.jTextFieldValorCampoGeneralRequisicion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralRequisicion"));		
		
		
		if(this.jInternalFrameDetalleFormRequisicion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRequisicion.jButtonidRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"idRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRequisicion.jButtonid_empresaRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRequisicion.jButtonid_empresaRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRequisicion.jButtonid_sucursalRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRequisicion.jButtonid_sucursalRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalRequisicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRequisicion.jButtonnumero_secuencialRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"numero_secuencialRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRequisicion.jButtonid_tipo_requisicionRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_requisicionRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRequisicion.jButtonid_tipo_requisicionRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_requisicionRequisicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRequisicion.jButtonfechaRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"fechaRequisicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRequisicion.jButtonhoraRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"horaRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRequisicion.jButtonid_empleadoRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRequisicion.jButtonid_empleadoRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRequisicion.jButtonid_estado_requisicionRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_estado_requisicionRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRequisicion.jButtonid_estado_requisicionRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_requisicionRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRequisicion.jButtonid_formatoRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_formatoRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRequisicion.jButtonid_formatoRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_formatoRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRequisicion.jButtonid_bodega_solicitarRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_bodega_solicitarRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRequisicion.jButtonid_bodega_solicitarRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_bodega_solicitarRequisicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRequisicion.jButtondescripcionRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"descripcionRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRequisicion.jButtonid_bodega_solicitaRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_bodega_solicitaRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRequisicion.jButtonid_bodega_solicitaRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_bodega_solicitaRequisicionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoRequisicion.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoRequisicion"));

			this.jButtonFK_IdBodegaSolicitaRequisicion.addActionListener(new ButtonActionListener(this,"FK_IdBodegaSolicitaRequisicion"));

			this.jButtonFK_IdBodegaSolicitarRequisicion.addActionListener(new ButtonActionListener(this,"FK_IdBodegaSolicitarRequisicion"));

			this.jButtonFK_IdEmpleadoRequisicion.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoRequisicion"));

			this.jButtonFK_IdTipoRequisicionRequisicion.addActionListener(new ButtonActionListener(this,"FK_IdTipoRequisicionRequisicion"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoRequisicion!=null) {
				this.jInternalFrameReporteDinamicoRequisicion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRequisicion"));
				this.jInternalFrameReporteDinamicoRequisicion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRequisicion"));
				this.jInternalFrameReporteDinamicoRequisicion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRequisicion"));
			}
			
			//this.jButtonCerrarReporteDinamicoRequisicion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRequisicion"));				
			//this.jButtonGenerarReporteDinamicoRequisicion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRequisicion"));
			//this.jButtonGenerarExcelReporteDinamicoRequisicion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRequisicion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionRequisicion!=null) {
				this.jInternalFrameImportacionRequisicion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRequisicion"));
				this.jInternalFrameImportacionRequisicion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRequisicion"));
				this.jInternalFrameImportacionRequisicion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRequisicion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByRequisicion.addActionListener (new ButtonActionListener(this,"AbrirOrderByRequisicion"));
			
			this.jButtonAbrirOrderByToolBarRequisicion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarRequisicion"));			
			
			if(this.jInternalFrameOrderByRequisicion!=null) {
				this.jInternalFrameOrderByRequisicion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRequisicion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormRequisicion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRequisicion.jTabbedPaneRelacionesRequisicion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRequisicion"));
		
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
            		closingInternalFrameRequisicion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormRequisicion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormRequisicion = (JInternalFrameBase)event.getSource();
	            	
	            RequisicionBeanSwingJInternalFrame jInternalFrameParent=(RequisicionBeanSwingJInternalFrame)jInternalFrameDetalleFormRequisicion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarRequisicionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosRequisicion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosRequisicionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosRequisicion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosRequisicion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRequisicionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRequisicionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRequisicionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRequisicion";
		inputMap = this.jButtonNuevoRequisicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRequisicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRequisicionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRequisicionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRequisicionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRequisicionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesRequisicion";
		inputMap = this.jButtonNuevoRelacionesRequisicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesRequisicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRequisicionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarRequisicion";
		inputMap = this.jButtonModificarRequisicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarRequisicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarRequisicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarRequisicion";
		inputMap = this.jButtonActualizarRequisicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarRequisicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarRequisicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarRequisicion";
		inputMap = this.jButtonEliminarRequisicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarRequisicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarRequisicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarRequisicion";
		inputMap = this.jButtonCancelarRequisicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarRequisicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarRequisicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarRequisicion";
		inputMap = this.jButtonCerrarRequisicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarRequisicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarRequisicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormRequisicion.jButtonGuardarCambiosRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosRequisicion";
		inputMap = this.jInternalFrameDetalleFormRequisicion.jButtonGuardarCambiosRequisicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormRequisicion.jButtonGuardarCambiosRequisicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosRequisicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosRequisicion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosRequisicionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesRequisicion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesRequisicionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarRequisicion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarRequisicionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralRequisicion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralRequisicionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRequisicion.jButtonidRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"idRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRequisicion.jButtonid_empresaRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRequisicion.jButtonid_empresaRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRequisicion.jButtonid_sucursalRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRequisicion.jButtonid_sucursalRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalRequisicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRequisicion.jButtonnumero_secuencialRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"numero_secuencialRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRequisicion.jButtonid_tipo_requisicionRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_requisicionRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRequisicion.jButtonid_tipo_requisicionRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_requisicionRequisicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRequisicion.jButtonfechaRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"fechaRequisicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRequisicion.jButtonhoraRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"horaRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRequisicion.jButtonid_empleadoRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRequisicion.jButtonid_empleadoRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRequisicion.jButtonid_estado_requisicionRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_estado_requisicionRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRequisicion.jButtonid_estado_requisicionRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_requisicionRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRequisicion.jButtonid_formatoRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_formatoRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRequisicion.jButtonid_formatoRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_formatoRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRequisicion.jButtonid_bodega_solicitarRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_bodega_solicitarRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRequisicion.jButtonid_bodega_solicitarRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_bodega_solicitarRequisicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRequisicion.jButtondescripcionRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"descripcionRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRequisicion.jButtonid_bodega_solicitaRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_bodega_solicitaRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRequisicion.jButtonid_bodega_solicitaRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_bodega_solicitaRequisicionBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoRequisicion.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoRequisicion"));

		this.jButtonFK_IdBodegaSolicitaRequisicion.addActionListener(new ButtonActionListener(this,"FK_IdBodegaSolicitaRequisicion"));

		this.jButtonFK_IdBodegaSolicitarRequisicion.addActionListener(new ButtonActionListener(this,"FK_IdBodegaSolicitarRequisicion"));

		this.jButtonFK_IdEmpleadoRequisicion.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoRequisicion"));

		this.jButtonFK_IdTipoRequisicionRequisicion.addActionListener(new ButtonActionListener(this,"FK_IdTipoRequisicionRequisicion"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarRequisicionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarRequisicion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosRequisicion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Requisicion requisicionAux:this.requisicionLogic.getRequisicions()) {
					requisicionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Requisicion requisicionAux:requisicions) {
					requisicionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosRequisicionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRequisicion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Requisicion requisicionAux:this.requisicionLogic.getRequisicions()) {
						requisicionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Requisicion requisicionAux:requisicions) {
						requisicionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Requisicion requisicionAux:this.requisicionLogic.getRequisicions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Requisicion requisicionAux:requisicions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaRequisicion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRequisicion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRequisicion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRequisicion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosRequisicionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRequisicion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosRequisicion.getSelectedRows();
			
			Requisicion requisicionLocal=new Requisicion();
			
			//this.seleccionarTodosRequisicion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					requisicionLocal =(Requisicion) this.requisicionLogic.getRequisicions().toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					requisicionLocal =(Requisicion) this.requisicions.toArray()[this.jTableDatosRequisicion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				requisicionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Requisicion requisicionAux:this.requisicionLogic.getRequisicions()) {
						requisicionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Requisicion requisicionAux:requisicions) {
						requisicionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaRequisicion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRequisicion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRequisicion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRequisicion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualRequisicionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarRequisicionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralRequisicionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingRequisicion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralRequisicion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Requisicion requisicionAux:this.requisicionLogic.getRequisicions()) {
				
						if(sTipoSeleccionar.equals(RequisicionConstantesFunciones.LABEL_NUMEROSECUENCIAL)) {
							existe=true;
							requisicionAux.setnumero_secuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RequisicionConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							requisicionAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RequisicionConstantesFunciones.LABEL_HORA)) {
							existe=true;
							requisicionAux.sethora(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RequisicionConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							requisicionAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Requisicion requisicionAux:requisicions) {
					
						if(sTipoSeleccionar.equals(RequisicionConstantesFunciones.LABEL_NUMEROSECUENCIAL)) {
							existe=true;
							requisicionAux.setnumero_secuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RequisicionConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							requisicionAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RequisicionConstantesFunciones.LABEL_HORA)) {
							existe=true;
							requisicionAux.sethora(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RequisicionConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							requisicionAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaRequisicion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesRequisicionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingRequisicion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioRequisicion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesRequisicion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormRequisicion.jComboBoxTiposAccionesFormularioRequisicion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteRequisicion) {				
					conSplash=true;//false;										
					
					//this.startProcessRequisicion(conSplash);
				
					this.generarReporteRequisicionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRequisicion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRequisicion.jComboBoxTiposAccionesFormularioRequisicion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoRequisicionsSeleccionados();
				//this.jComboBoxTiposAccionesRequisicion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRequisicionsSeleccionados(false);
				//this.jComboBoxTiposAccionesRequisicion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRequisicionsSeleccionados(true);
				//this.jComboBoxTiposAccionesRequisicion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRequisicion();
				
				this.exportarRequisicionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRequisicion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRequisicion.jComboBoxTiposAccionesFormularioRequisicion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionRequisicions();
				//this.importarRequisicions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRequisicion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRequisicion.jComboBoxTiposAccionesFormularioRequisicion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRequisicion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelRequisicionsSeleccionados();
				//this.jComboBoxTiposAccionesRequisicion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Requisicion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessRequisicion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoRequisicion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyRequisicion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Requisicion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRequisicion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRequisicion.jComboBoxTiposAccionesFormularioRequisicion.setSelectedIndex(0);					
				}	
			} 			
			else if(RequisicionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteRequisicion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessRequisicion(conSplash);
					
						//this.actualizarParametrosGeneralRequisicion();
						
						this.generarReporteProcesoAccionRequisicionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesRequisicion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormRequisicion.jComboBoxTiposAccionesFormularioRequisicion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(RequisicionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO RequisicionES SELECCIONADOS?", "MANTENIMIENTO DE Requisicion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessRequisicion();
				
						this.actualizarParametrosGeneralRequisicion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.requisicionReturnGeneral=requisicionLogic.procesarAccionRequisicionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.requisicionLogic.getRequisicions(),this.requisicionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarRequisicionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRequisicion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRequisicion.jComboBoxTiposAccionesFormularioRequisicion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralRequisicion();
					
					RequisicionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarRequisicionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRequisicion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRequisicion.jComboBoxTiposAccionesFormularioRequisicion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessRequisicion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesRequisicionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessRequisicion();
			
			if(this.jInternalFrameDetalleFormRequisicion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Requisicion> requisicionsSeleccionados=new ArrayList<Requisicion>();		
			Requisicion requisicion=new Requisicion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingRequisicion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesRequisicion.getSelectedItem();
			
			
			
			
			requisicionsSeleccionados=this.getRequisicionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(requisicionsSeleccionados.size()==1) {
				for(Requisicion requisicionAux:requisicionsSeleccionados) {
					requisicion=requisicionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Detalle Requisicion")) {
					jButtonDetalleRequisicionActionPerformed(null,rowIndex,true,false,requisicion);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessRequisicion();
			
      		//this.finishProcessRequisicion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarRequisicionReturnGeneral() throws Exception {
		if(this.requisicionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.requisicionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.requisicionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.requisicionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.requisicionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.requisicionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingRequisicion(false);
		}
		
		if(this.requisicionReturnGeneral.getConRetornoLista() || this.requisicionReturnGeneral.getConRetornoObjeto()) {
			if(this.requisicionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.requisicionLogic.setRequisicions(this.requisicionReturnGeneral.getRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.requisicionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.requisicionLogic.setRequisicion(this.requisicionReturnGeneral.getRequisicion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingRequisicion(false);
		}
	}
	
	public void actualizarParametrosGeneralRequisicion() throws Exception {
		
		
	}
	
	public ArrayList<Requisicion> getRequisicionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Requisicion> requisicionsSeleccionados=new ArrayList<Requisicion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioRequisicion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Requisicion requisicionAux:requisicionLogic.getRequisicions()) {
					if(requisicionAux.getIsSelected()) {
						requisicionsSeleccionados.add(requisicionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Requisicion requisicionAux:this.requisicions) {
					if(requisicionAux.getIsSelected()) {
						requisicionsSeleccionados.add(requisicionAux);				
					}
				}
			}
			
			if(requisicionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						requisicionsSeleccionados.addAll(this.requisicionLogic.getRequisicions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						requisicionsSeleccionados.addAll(this.requisicions);				
					}
				}
			}
		} else {
			requisicionsSeleccionados.add(this.requisicion);
		}
		
		return requisicionsSeleccionados;
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
	
	public void generarReporteRequisicionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalRequisicionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoRequisicionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRequisicionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRequisicionsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesRequisicionsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Requisicion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesRequisicionsSeleccionados() throws Exception {
		ArrayList<Requisicion> requisicionsSeleccionados=new ArrayList<Requisicion>();		
		
		requisicionsSeleccionados=this.getRequisicionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteRequisicions("Todos",requisicionsSeleccionados);
		
	}	
	
	public void generarReporteNormalRequisicionsSeleccionados() throws Exception {
		ArrayList<Requisicion> requisicionsSeleccionados=new ArrayList<Requisicion>();		
		
		requisicionsSeleccionados=this.getRequisicionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteRequisicions("Todos",requisicionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionRequisicionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Requisicion> requisicionsSeleccionados=new ArrayList<Requisicion>();
		
		requisicionsSeleccionados=this.getRequisicionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteRequisicions("Todos",requisicionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoRequisicionsSeleccionados() throws Exception {
		ArrayList<Requisicion> requisicionsSeleccionados=new ArrayList<Requisicion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoRequisicion();
		
		
		requisicionsSeleccionados=this.getRequisicionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoRequisicion();
		
		
		//this.generarReporteRequisicions("Todos",requisicionsSeleccionados ,requisicionImplementable,requisicionImplementableHome);
	}
	
	public void mostrarImportacionRequisicions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionRequisicion();
		
		this.abrirFrameImportacionRequisicion();		
		
			
		//this.generarReporteRequisicions("Todos",requisicionsSeleccionados ,requisicionImplementable,requisicionImplementableHome);
	}
	
	public void importarRequisicions() throws Exception {		
	
	}
	
	public void exportarRequisicionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelRequisicionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoRequisicionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlRequisicionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Requisicion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoRequisicionsSeleccionados() throws Exception {
		ArrayList<Requisicion> requisicionsSeleccionados=new ArrayList<Requisicion>();		
		
		requisicionsSeleccionados=this.getRequisicionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"requisicion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarRequisicion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Requisicion requisicionAux:requisicionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarRequisicion(requisicionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//requisicionAux.setsDetalleGeneralEntityReporte(requisicionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.requisicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Requisicion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarRequisicion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=RequisicionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RequisicionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RequisicionConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RequisicionConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RequisicionConstantesFunciones.LABEL_NUMEROSECUENCIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RequisicionConstantesFunciones.LABEL_IDTIPOREQUISICION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RequisicionConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RequisicionConstantesFunciones.LABEL_HORA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RequisicionConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RequisicionConstantesFunciones.LABEL_IDESTADOREQUISICION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RequisicionConstantesFunciones.LABEL_IDFORMATO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RequisicionConstantesFunciones.LABEL_IDBODEGASOLICITAR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RequisicionConstantesFunciones.LABEL_DESCRIPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RequisicionConstantesFunciones.LABEL_IDBODEGASOLICITA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarRequisicion(Requisicion requisicion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=requisicion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=requisicion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=requisicion.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=requisicion.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=requisicion.getnumero_secuencial();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=requisicion.gettiporequisicion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=requisicion.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=requisicion.gethora().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=requisicion.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=requisicion.getestadorequisicion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=requisicion.getformato_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=requisicion.getbodegasolicitar_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=requisicion.getdescripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=requisicion.getbodegasolicita_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelRequisicionsSeleccionados() throws Exception {
		ArrayList<Requisicion> requisicionsSeleccionados=new ArrayList<Requisicion>();		
		
		requisicionsSeleccionados=this.getRequisicionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"requisicion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Requisicions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelRequisicion(row);				
				iRow++;
			}				
			
			for(Requisicion requisicionAux:requisicionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelRequisicion(requisicionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.requisicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Requisicion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlRequisicionsSeleccionados() throws Exception {
		ArrayList<Requisicion> requisicionsSeleccionados=new ArrayList<Requisicion>();		
		
		requisicionsSeleccionados=this.getRequisicionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"requisicion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("requisicions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("requisicion");
			//elementRoot.appendChild(element);
		
			for(Requisicion requisicionAux:requisicionsSeleccionados) {
				element = document.createElement("requisicion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlRequisicion(requisicionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.requisicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Requisicion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelRequisicion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(RequisicionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(RequisicionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(RequisicionConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(RequisicionConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(RequisicionConstantesFunciones.LABEL_NUMEROSECUENCIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(RequisicionConstantesFunciones.LABEL_IDTIPOREQUISICION);
		cell = row.createCell(iColumn++);cell.setCellValue(RequisicionConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(RequisicionConstantesFunciones.LABEL_HORA);
		cell = row.createCell(iColumn++);cell.setCellValue(RequisicionConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(RequisicionConstantesFunciones.LABEL_IDESTADOREQUISICION);
		cell = row.createCell(iColumn++);cell.setCellValue(RequisicionConstantesFunciones.LABEL_IDFORMATO);
		cell = row.createCell(iColumn++);cell.setCellValue(RequisicionConstantesFunciones.LABEL_IDBODEGASOLICITAR);
		cell = row.createCell(iColumn++);cell.setCellValue(RequisicionConstantesFunciones.LABEL_DESCRIPCION);
		cell = row.createCell(iColumn++);cell.setCellValue(RequisicionConstantesFunciones.LABEL_IDBODEGASOLICITA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelRequisicion(Requisicion requisicion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(requisicion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(requisicion.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(requisicion.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(requisicion.getnumero_secuencial());
		cell = row.createCell(iColumn++);cell.setCellValue(requisicion.gettiporequisicion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(requisicion.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(requisicion.gethora());
		cell = row.createCell(iColumn++);cell.setCellValue(requisicion.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(requisicion.getestadorequisicion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(requisicion.getformato_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(requisicion.getbodegasolicitar_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(requisicion.getdescripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(requisicion.getbodegasolicita_descripcion());				
	}
	
	public void setFilaDatosExportarXmlRequisicion(Requisicion requisicion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(RequisicionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(requisicion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(RequisicionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(requisicion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(RequisicionConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(requisicion.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(RequisicionConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(requisicion.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementnumero_secuencial = document.createElement(RequisicionConstantesFunciones.NUMEROSECUENCIAL);
		elementnumero_secuencial.appendChild(document.createTextNode(requisicion.getnumero_secuencial().trim()));
		element.appendChild(elementnumero_secuencial);

		Element elementtiporequisicion_descripcion = document.createElement(RequisicionConstantesFunciones.IDTIPOREQUISICION);
		elementtiporequisicion_descripcion.appendChild(document.createTextNode(requisicion.gettiporequisicion_descripcion()));
		element.appendChild(elementtiporequisicion_descripcion);

		Element elementfecha = document.createElement(RequisicionConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(requisicion.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementhora = document.createElement(RequisicionConstantesFunciones.HORA);
		elementhora.appendChild(document.createTextNode(requisicion.gethora().toString().trim()));
		element.appendChild(elementhora);

		Element elementempleado_descripcion = document.createElement(RequisicionConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(requisicion.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementestadorequisicion_descripcion = document.createElement(RequisicionConstantesFunciones.IDESTADOREQUISICION);
		elementestadorequisicion_descripcion.appendChild(document.createTextNode(requisicion.getestadorequisicion_descripcion()));
		element.appendChild(elementestadorequisicion_descripcion);

		Element elementformato_descripcion = document.createElement(RequisicionConstantesFunciones.IDFORMATO);
		elementformato_descripcion.appendChild(document.createTextNode(requisicion.getformato_descripcion()));
		element.appendChild(elementformato_descripcion);

		Element elementbodegasolicitar_descripcion = document.createElement(RequisicionConstantesFunciones.IDBODEGASOLICITAR);
		elementbodegasolicitar_descripcion.appendChild(document.createTextNode(requisicion.getbodegasolicitar_descripcion()));
		element.appendChild(elementbodegasolicitar_descripcion);

		Element elementdescripcion = document.createElement(RequisicionConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(requisicion.getdescripcion().trim()));
		element.appendChild(elementdescripcion);

		Element elementbodegasolicita_descripcion = document.createElement(RequisicionConstantesFunciones.IDBODEGASOLICITA);
		elementbodegasolicita_descripcion.appendChild(document.createTextNode(requisicion.getbodegasolicita_descripcion()));
		element.appendChild(elementbodegasolicita_descripcion);
	}
	
	public void generarReporteGroupGenericoRequisicionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Requisicion> requisicionsSeleccionados=new ArrayList<Requisicion>();
		
		requisicionsSeleccionados=this.getRequisicionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoRequisicion(requisicionsSeleccionados);
		
		this.generarReporteRequisicions("Todos",requisicionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoRequisicion(ArrayList<Requisicion> requisicionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Requisicion requisicionAux:requisicionsSeleccionados) {
				requisicionAux.setsDetalleGeneralEntityReporte(requisicionAux.toString());
			
				if(sTipoSeleccionar.equals(RequisicionConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					requisicionAux.setsDescripcionGeneralEntityReporte1(requisicionAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RequisicionConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					requisicionAux.setsDescripcionGeneralEntityReporte1(requisicionAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RequisicionConstantesFunciones.LABEL_NUMEROSECUENCIAL)) {
					existe=true;
					requisicionAux.setsDescripcionGeneralEntityReporte1(requisicionAux.getnumero_secuencial());
				}
				 else if(sTipoSeleccionar.equals(RequisicionConstantesFunciones.LABEL_IDTIPOREQUISICION)) {
					existe=true;
					requisicionAux.setsDescripcionGeneralEntityReporte1(requisicionAux.gettiporequisicion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RequisicionConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					requisicionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(requisicionAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(RequisicionConstantesFunciones.LABEL_HORA)) {
					existe=true;
					requisicionAux.setsDescripcionGeneralEntityReporte1(requisicionAux.gethora().toString());
				}
				 else if(sTipoSeleccionar.equals(RequisicionConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					requisicionAux.setsDescripcionGeneralEntityReporte1(requisicionAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RequisicionConstantesFunciones.LABEL_IDESTADOREQUISICION)) {
					existe=true;
					requisicionAux.setsDescripcionGeneralEntityReporte1(requisicionAux.getestadorequisicion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RequisicionConstantesFunciones.LABEL_IDFORMATO)) {
					existe=true;
					requisicionAux.setsDescripcionGeneralEntityReporte1(requisicionAux.getformato_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RequisicionConstantesFunciones.LABEL_IDBODEGASOLICITAR)) {
					existe=true;
					requisicionAux.setsDescripcionGeneralEntityReporte1(requisicionAux.getbodegasolicitar_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RequisicionConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					requisicionAux.setsDescripcionGeneralEntityReporte1(requisicionAux.getdescripcion());
				}
				 else if(sTipoSeleccionar.equals(RequisicionConstantesFunciones.LABEL_IDBODEGASOLICITA)) {
					existe=true;
					requisicionAux.setsDescripcionGeneralEntityReporte1(requisicionAux.getbodegasolicita_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesRequisicion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoRequisicion=true;
				this.isVisibilidadCeldaNuevoRelacionesRequisicion=true;
				this.isVisibilidadCeldaGuardarCambiosRequisicion=true;
			}
			
			this.isVisibilidadCeldaModificarRequisicion=false;
			this.isVisibilidadCeldaActualizarRequisicion=false;
			this.isVisibilidadCeldaEliminarRequisicion=false;
			this.isVisibilidadCeldaCancelarRequisicion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRequisicion=true;
				} else {
					this.isVisibilidadCeldaGuardarRequisicion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoRequisicion=false;
			this.isVisibilidadCeldaNuevoRelacionesRequisicion=false;
			this.isVisibilidadCeldaGuardarCambiosRequisicion=false;
			this.isVisibilidadCeldaModificarRequisicion=false;
			this.isVisibilidadCeldaActualizarRequisicion=true;
			this.isVisibilidadCeldaEliminarRequisicion=false;
			this.isVisibilidadCeldaCancelarRequisicion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRequisicion=true;
				} else {
					this.isVisibilidadCeldaGuardarRequisicion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoRequisicion=false;
			this.isVisibilidadCeldaNuevoRelacionesRequisicion=false;
			this.isVisibilidadCeldaGuardarCambiosRequisicion=false;
			this.isVisibilidadCeldaModificarRequisicion=false;
			this.isVisibilidadCeldaActualizarRequisicion=true;
			this.isVisibilidadCeldaEliminarRequisicion=true;
			this.isVisibilidadCeldaCancelarRequisicion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRequisicion=true;
				} else {
					this.isVisibilidadCeldaGuardarRequisicion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoRequisicion=false;
			this.isVisibilidadCeldaNuevoRelacionesRequisicion=false;
			this.isVisibilidadCeldaGuardarCambiosRequisicion=false;
			this.isVisibilidadCeldaModificarRequisicion=false;
			this.isVisibilidadCeldaActualizarRequisicion=true;
			this.isVisibilidadCeldaEliminarRequisicion=false;
			this.isVisibilidadCeldaCancelarRequisicion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRequisicion=false;
				} else {
					this.isVisibilidadCeldaGuardarRequisicion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoRequisicion=true;
			this.isVisibilidadCeldaNuevoRelacionesRequisicion=true;
			this.isVisibilidadCeldaGuardarCambiosRequisicion=true;
			this.isVisibilidadCeldaModificarRequisicion=false;
			this.isVisibilidadCeldaActualizarRequisicion=false;
			this.isVisibilidadCeldaEliminarRequisicion=false;
			this.isVisibilidadCeldaCancelarRequisicion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRequisicion=true;
				} else {
					this.isVisibilidadCeldaGuardarRequisicion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoRequisicion=false;
			this.isVisibilidadCeldaNuevoRelacionesRequisicion=false;
			this.isVisibilidadCeldaGuardarCambiosRequisicion=false;
			this.isVisibilidadCeldaActualizarRequisicion=false;
			this.isVisibilidadCeldaEliminarRequisicion=false;
			this.isVisibilidadCeldaCancelarRequisicion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRequisicion=false;
				} else {
					this.isVisibilidadCeldaGuardarRequisicion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoRequisicion=false;
			this.isVisibilidadCeldaNuevoRelacionesRequisicion=false;
			this.isVisibilidadCeldaGuardarCambiosRequisicion=false;
			this.isVisibilidadCeldaModificarRequisicion=true;
			this.isVisibilidadCeldaActualizarRequisicion=false;
			this.isVisibilidadCeldaEliminarRequisicion=false;
			this.isVisibilidadCeldaCancelarRequisicion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRequisicion=false;
				} else {
					this.isVisibilidadCeldaGuardarRequisicion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(RequisicionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoRequisicion=true;
			this.isVisibilidadCeldaNuevoRelacionesRequisicion=true;
			this.isVisibilidadCeldaGuardarCambiosRequisicion=true;
		} else {
			this.actualizarEstadoPanelsRequisicion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarRequisicion=false;
			//this.isVisibilidadCeldaVerFormRequisicion=false;
			this.isVisibilidadCeldaDuplicarRequisicion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!requisicionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesRequisicion=false;
		} else {
			this.isVisibilidadCeldaNuevoRequisicion=false;
			this.isVisibilidadCeldaGuardarCambiosRequisicion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(requisicionSessionBean.getEsGuardarRelacionado()) {
			if(!requisicionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesRequisicion=false;												
			}
			
			this.jButtonCerrarRequisicion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesRequisicion=false;
		}
		
		if(!this.permiteMantenimiento(this.requisicion)) {
			this.isVisibilidadCeldaActualizarRequisicion=false;
			this.isVisibilidadCeldaEliminarRequisicion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesRequisicion() {
		this.isVisibilidadCeldaNuevoRequisicion=false;
		this.isVisibilidadCeldaGuardarCambiosRequisicion=false;
	}
	
	public void actualizarEstadoPanelsRequisicion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionRequisicion!=null) {
				this.jScrollPanelDatosEdicionRequisicion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRequisicion!=null) {
				this.jTabbedPaneBusquedasRequisicion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRequisicion!=null) {
				this.jScrollPanelDatosRequisicion.setVisible(true);
			}
			
			if(this.jPanelPaginacionRequisicion!=null) {
				this.jPanelPaginacionRequisicion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRequisicion!=null) {
				this.jPanelParametrosReportesRequisicion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionRequisicion!=null) {
				this.jScrollPanelDatosEdicionRequisicion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRequisicion!=null) {
				this.jTabbedPaneBusquedasRequisicion.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosRequisicion!=null) {
				this.jScrollPanelDatosRequisicion.setVisible(false);
			}
			
			if(this.jPanelPaginacionRequisicion!=null) {
				this.jPanelPaginacionRequisicion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRequisicion!=null) {
				this.jPanelParametrosReportesRequisicion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionRequisicion!=null) {
				this.jScrollPanelDatosEdicionRequisicion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRequisicion!=null) {
				this.jTabbedPaneBusquedasRequisicion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRequisicion!=null) {
				this.jScrollPanelDatosRequisicion.setVisible(false);
			}
			
			if(this.jPanelPaginacionRequisicion!=null) {
				this.jPanelPaginacionRequisicion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRequisicion!=null) {
				this.jPanelParametrosReportesRequisicion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionRequisicion!=null) {
				this.jScrollPanelDatosEdicionRequisicion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRequisicion!=null) {
				this.jTabbedPaneBusquedasRequisicion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRequisicion!=null) {
				this.jScrollPanelDatosRequisicion.setVisible(false);
			}
			
			if(this.jPanelPaginacionRequisicion!=null) {
				this.jPanelPaginacionRequisicion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRequisicion!=null) {
				this.jPanelParametrosReportesRequisicion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionRequisicion!=null) {
				this.jScrollPanelDatosEdicionRequisicion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRequisicion!=null) {
				this.jTabbedPaneBusquedasRequisicion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRequisicion!=null) {
				this.jScrollPanelDatosRequisicion.setVisible(true);
			}
			
			if(this.jPanelPaginacionRequisicion!=null) {
				this.jPanelPaginacionRequisicion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRequisicion!=null) {
				this.jPanelParametrosReportesRequisicion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionRequisicion!=null) {
				this.jScrollPanelDatosEdicionRequisicion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRequisicion!=null) {
				this.jTabbedPaneBusquedasRequisicion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRequisicion!=null) {
				this.jScrollPanelDatosRequisicion.setVisible(true);
			}
			
			if(this.jPanelPaginacionRequisicion!=null) {
				this.jPanelPaginacionRequisicion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRequisicion!=null) {
				this.jPanelParametrosReportesRequisicion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionRequisicion!=null) {
				this.jScrollPanelDatosEdicionRequisicion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRequisicion!=null) {
				this.jTabbedPaneBusquedasRequisicion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRequisicion!=null) {
				this.jScrollPanelDatosRequisicion.setVisible(true);
			}
			
			if(this.jPanelPaginacionRequisicion!=null) {
				this.jPanelPaginacionRequisicion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRequisicion!=null) {
				this.jPanelParametrosReportesRequisicion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.requisicionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasRequisicion!=null) {
					this.jTabbedPaneBusquedasRequisicion.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesRequisicion!=null) {
				this.jPanelParametrosReportesRequisicion.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.requisicionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRequisicion!=null) {
				this.jTabbedPaneBusquedasRequisicion.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesRequisicion!=null) {
				this.jPanelParametrosReportesRequisicion.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasRequisicion.remove(jPanelBusquedaPorCodigoRequisicion);}

			this.isVisibilidadFK_IdBodegaSolicita=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdBodegaSolicita) {this.jTabbedPaneBusquedasRequisicion.remove(jPanelFK_IdBodegaSolicitaRequisicion);}

			this.isVisibilidadFK_IdBodegaSolicitar=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdBodegaSolicitar) {this.jTabbedPaneBusquedasRequisicion.remove(jPanelFK_IdBodegaSolicitarRequisicion);}

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasRequisicion.remove(jPanelFK_IdEmpleadoRequisicion);}

			this.isVisibilidadFK_IdTipoRequisicion=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoRequisicion) {this.jTabbedPaneBusquedasRequisicion.remove(jPanelFK_IdTipoRequisicionRequisicion);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaPorCodigo=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasRequisicion.remove(jPanelBusquedaPorCodigoRequisicion);}

			this.isVisibilidadFK_IdBodegaSolicita=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdBodegaSolicita) {this.jTabbedPaneBusquedasRequisicion.remove(jPanelFK_IdBodegaSolicitaRequisicion);}

			this.isVisibilidadFK_IdBodegaSolicitar=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdBodegaSolicitar) {this.jTabbedPaneBusquedasRequisicion.remove(jPanelFK_IdBodegaSolicitarRequisicion);}

			this.isVisibilidadFK_IdEmpleado=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasRequisicion.remove(jPanelFK_IdEmpleadoRequisicion);}

			this.isVisibilidadFK_IdTipoRequisicion=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTipoRequisicion) {this.jTabbedPaneBusquedasRequisicion.remove(jPanelFK_IdTipoRequisicionRequisicion);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoRequisicion(Boolean isParaTipoRequisicion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoRequisicionNegation=!isParaTipoRequisicion;

			this.isVisibilidadBusquedaPorCodigo=isParaTipoRequisicionNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasRequisicion.remove(jPanelBusquedaPorCodigoRequisicion);}

			this.isVisibilidadFK_IdBodegaSolicita=isParaTipoRequisicionNegation;
			if(!this.isVisibilidadFK_IdBodegaSolicita) {this.jTabbedPaneBusquedasRequisicion.remove(jPanelFK_IdBodegaSolicitaRequisicion);}

			this.isVisibilidadFK_IdBodegaSolicitar=isParaTipoRequisicionNegation;
			if(!this.isVisibilidadFK_IdBodegaSolicitar) {this.jTabbedPaneBusquedasRequisicion.remove(jPanelFK_IdBodegaSolicitarRequisicion);}

			this.isVisibilidadFK_IdEmpleado=isParaTipoRequisicionNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasRequisicion.remove(jPanelFK_IdEmpleadoRequisicion);}

			this.isVisibilidadFK_IdTipoRequisicion=isParaTipoRequisicion;
			if(!this.isVisibilidadFK_IdTipoRequisicion) {this.jTabbedPaneBusquedasRequisicion.remove(jPanelFK_IdTipoRequisicionRequisicion);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpleadoNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasRequisicion.remove(jPanelBusquedaPorCodigoRequisicion);}

			this.isVisibilidadFK_IdBodegaSolicita=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdBodegaSolicita) {this.jTabbedPaneBusquedasRequisicion.remove(jPanelFK_IdBodegaSolicitaRequisicion);}

			this.isVisibilidadFK_IdBodegaSolicitar=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdBodegaSolicitar) {this.jTabbedPaneBusquedasRequisicion.remove(jPanelFK_IdBodegaSolicitarRequisicion);}

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasRequisicion.remove(jPanelFK_IdEmpleadoRequisicion);}

			this.isVisibilidadFK_IdTipoRequisicion=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdTipoRequisicion) {this.jTabbedPaneBusquedasRequisicion.remove(jPanelFK_IdTipoRequisicionRequisicion);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstadoRequisicion(Boolean isParaEstadoRequisicion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstadoRequisicionNegation=!isParaEstadoRequisicion;

			this.isVisibilidadBusquedaPorCodigo=isParaEstadoRequisicionNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasRequisicion.remove(jPanelBusquedaPorCodigoRequisicion);}

			this.isVisibilidadFK_IdBodegaSolicita=isParaEstadoRequisicionNegation;
			if(!this.isVisibilidadFK_IdBodegaSolicita) {this.jTabbedPaneBusquedasRequisicion.remove(jPanelFK_IdBodegaSolicitaRequisicion);}

			this.isVisibilidadFK_IdBodegaSolicitar=isParaEstadoRequisicionNegation;
			if(!this.isVisibilidadFK_IdBodegaSolicitar) {this.jTabbedPaneBusquedasRequisicion.remove(jPanelFK_IdBodegaSolicitarRequisicion);}

			this.isVisibilidadFK_IdEmpleado=isParaEstadoRequisicionNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasRequisicion.remove(jPanelFK_IdEmpleadoRequisicion);}

			this.isVisibilidadFK_IdTipoRequisicion=isParaEstadoRequisicionNegation;
			if(!this.isVisibilidadFK_IdTipoRequisicion) {this.jTabbedPaneBusquedasRequisicion.remove(jPanelFK_IdTipoRequisicionRequisicion);}
		}
		
	}

	public void setVisibilidadBusquedasParaFormato(Boolean isParaFormato){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFormatoNegation=!isParaFormato;

			this.isVisibilidadBusquedaPorCodigo=isParaFormatoNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasRequisicion.remove(jPanelBusquedaPorCodigoRequisicion);}

			this.isVisibilidadFK_IdBodegaSolicita=isParaFormatoNegation;
			if(!this.isVisibilidadFK_IdBodegaSolicita) {this.jTabbedPaneBusquedasRequisicion.remove(jPanelFK_IdBodegaSolicitaRequisicion);}

			this.isVisibilidadFK_IdBodegaSolicitar=isParaFormatoNegation;
			if(!this.isVisibilidadFK_IdBodegaSolicitar) {this.jTabbedPaneBusquedasRequisicion.remove(jPanelFK_IdBodegaSolicitarRequisicion);}

			this.isVisibilidadFK_IdEmpleado=isParaFormatoNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasRequisicion.remove(jPanelFK_IdEmpleadoRequisicion);}

			this.isVisibilidadFK_IdTipoRequisicion=isParaFormatoNegation;
			if(!this.isVisibilidadFK_IdTipoRequisicion) {this.jTabbedPaneBusquedasRequisicion.remove(jPanelFK_IdTipoRequisicionRequisicion);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodegaSolicitar(Boolean isParaBodegaSolicitar){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaSolicitarNegation=!isParaBodegaSolicitar;

			this.isVisibilidadBusquedaPorCodigo=isParaBodegaSolicitarNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasRequisicion.remove(jPanelBusquedaPorCodigoRequisicion);}

			this.isVisibilidadFK_IdBodegaSolicita=isParaBodegaSolicitarNegation;
			if(!this.isVisibilidadFK_IdBodegaSolicita) {this.jTabbedPaneBusquedasRequisicion.remove(jPanelFK_IdBodegaSolicitaRequisicion);}

			this.isVisibilidadFK_IdBodegaSolicitar=isParaBodegaSolicitar;
			if(!this.isVisibilidadFK_IdBodegaSolicitar) {this.jTabbedPaneBusquedasRequisicion.remove(jPanelFK_IdBodegaSolicitarRequisicion);}

			this.isVisibilidadFK_IdEmpleado=isParaBodegaSolicitarNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasRequisicion.remove(jPanelFK_IdEmpleadoRequisicion);}

			this.isVisibilidadFK_IdTipoRequisicion=isParaBodegaSolicitarNegation;
			if(!this.isVisibilidadFK_IdTipoRequisicion) {this.jTabbedPaneBusquedasRequisicion.remove(jPanelFK_IdTipoRequisicionRequisicion);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodegaSolicita(Boolean isParaBodegaSolicita){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaSolicitaNegation=!isParaBodegaSolicita;

			this.isVisibilidadBusquedaPorCodigo=isParaBodegaSolicitaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasRequisicion.remove(jPanelBusquedaPorCodigoRequisicion);}

			this.isVisibilidadFK_IdBodegaSolicita=isParaBodegaSolicita;
			if(!this.isVisibilidadFK_IdBodegaSolicita) {this.jTabbedPaneBusquedasRequisicion.remove(jPanelFK_IdBodegaSolicitaRequisicion);}

			this.isVisibilidadFK_IdBodegaSolicitar=isParaBodegaSolicitaNegation;
			if(!this.isVisibilidadFK_IdBodegaSolicitar) {this.jTabbedPaneBusquedasRequisicion.remove(jPanelFK_IdBodegaSolicitarRequisicion);}

			this.isVisibilidadFK_IdEmpleado=isParaBodegaSolicitaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasRequisicion.remove(jPanelFK_IdEmpleadoRequisicion);}

			this.isVisibilidadFK_IdTipoRequisicion=isParaBodegaSolicitaNegation;
			if(!this.isVisibilidadFK_IdTipoRequisicion) {this.jTabbedPaneBusquedasRequisicion.remove(jPanelFK_IdTipoRequisicionRequisicion);}
		}
		
	}
	
	

	public String registrarSesionRequisicionParaDetalleRequisicions() throws Exception {
		Boolean isPaginaPopupDetalleRequisicion=false;

		try {

			if(this.requisicionSessionBean==null) {
				this.requisicionSessionBean=new RequisicionSessionBean();
			}

			if(this.jInternalFrameDetalleFormRequisicion.detallerequisicionSessionBean==null) {
				this.jInternalFrameDetalleFormRequisicion.detallerequisicionSessionBean=new DetalleRequisicionSessionBean();
			}

			this.jInternalFrameDetalleFormRequisicion.detallerequisicionSessionBean.setsPathNavegacionActual(requisicionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleRequisicionConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormRequisicion.detallerequisicionSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleRequisicion=this.jInternalFrameDetalleFormRequisicion.detallerequisicionSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormRequisicion.detallerequisicionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleRequisicion(true);
			this.jInternalFrameDetalleFormRequisicion.detallerequisicionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleRequisicion(RequisicionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormRequisicion.detallerequisicionSessionBean.setisBusquedaDesdeForeignKeySesionRequisicion(true);
			this.jInternalFrameDetalleFormRequisicion.detallerequisicionSessionBean.setlidRequisicionActual(this.idRequisicionActual);
			this.jInternalFrameDetalleFormRequisicion.detallerequisicionSessionBean.setNoMantenimiento(true);

			requisicionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyRequisicion(true);
			requisicionSessionBean.setlIdRequisicionActualForeignKey(this.idRequisicionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//RequisicionSessionBean requisicionSessionBean=new RequisicionSessionBean();
		
		if(this.requisicionSessionBean==null) {
			this.requisicionSessionBean=new RequisicionSessionBean();
		}
		
		this.requisicionSessionBean.setsUltimaBusquedaRequisicion(this.getsAccionBusqueda());
		this.requisicionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.requisicionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			requisicionSessionBean.setnumero_secuencial(this.getnumero_secuencialBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdBodegaSolicita")) {
			requisicionSessionBean.setid_bodega_solicita(this.getid_bodega_solicitaFK_IdBodegaSolicita());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdBodegaSolicitar")) {
			requisicionSessionBean.setid_bodega_solicitar(this.getid_bodega_solicitarFK_IdBodegaSolicitar());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			requisicionSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			requisicionSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			requisicionSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoRequisicion")) {
			requisicionSessionBean.setid_tipo_requisicion(this.getid_tipo_requisicionFK_IdTipoRequisicion());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//RequisicionSessionBean requisicionSessionBean=new RequisicionSessionBean();
		
		if(this.requisicionSessionBean==null) {
			this.requisicionSessionBean=new RequisicionSessionBean();
		}
		
		if(this.requisicionSessionBean.getsUltimaBusquedaRequisicion()!=null&&!this.requisicionSessionBean.getsUltimaBusquedaRequisicion().equals("")) {
			this.setsAccionBusqueda(requisicionSessionBean.getsUltimaBusquedaRequisicion());
			this.setiNumeroPaginacion(requisicionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(requisicionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setnumero_secuencialBusquedaPorCodigo(requisicionSessionBean.getnumero_secuencial());
				requisicionSessionBean.setnumero_secuencial("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdBodegaSolicita")) {
				this.setid_bodega_solicitaFK_IdBodegaSolicita(requisicionSessionBean.getid_bodega_solicita());
				requisicionSessionBean.setid_bodega_solicita(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdBodegaSolicitar")) {
				this.setid_bodega_solicitarFK_IdBodegaSolicitar(requisicionSessionBean.getid_bodega_solicitar());
				requisicionSessionBean.setid_bodega_solicitar(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(requisicionSessionBean.getid_empleado());
				requisicionSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(requisicionSessionBean.getid_empresa());
				requisicionSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(requisicionSessionBean.getid_sucursal());
				requisicionSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoRequisicion")) {
				this.setid_tipo_requisicionFK_IdTipoRequisicion(requisicionSessionBean.getid_tipo_requisicion());
				requisicionSessionBean.setid_tipo_requisicion(-1L);
			}
		}
		
		this.requisicionSessionBean.setsUltimaBusquedaRequisicion("");
		this.requisicionSessionBean.setiNumeroPaginacion(RequisicionConstantesFunciones.INUMEROPAGINACION);
		this.requisicionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaRequisicion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioRequisicion() {
		this.updateBorderResaltarBusquedasFormularioRequisicion();
		this.updateVisibilidadBusquedasFormularioRequisicion();
		this.updateHabilitarBusquedasFormularioRequisicion();
	}
	
	public void updateBorderResaltarBusquedasFormularioRequisicion() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasRequisicion.getComponents().length>0) {
	

		if(this.requisicionConstantesFunciones.resaltarBusquedaPorCodigoRequisicion!=null) {
			index= this.jTabbedPaneBusquedasRequisicion.indexOfComponent(this.jPanelBusquedaPorCodigoRequisicion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRequisicion.getComponent(index);
				jPanel.setBorder(this.requisicionConstantesFunciones.resaltarBusquedaPorCodigoRequisicion);
			}
		}

		if(this.requisicionConstantesFunciones.resaltarFK_IdBodegaSolicitaRequisicion!=null) {
			index= this.jTabbedPaneBusquedasRequisicion.indexOfComponent(this.jPanelFK_IdBodegaSolicitaRequisicion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRequisicion.getComponent(index);
				jPanel.setBorder(this.requisicionConstantesFunciones.resaltarFK_IdBodegaSolicitaRequisicion);
			}
		}

		if(this.requisicionConstantesFunciones.resaltarFK_IdBodegaSolicitarRequisicion!=null) {
			index= this.jTabbedPaneBusquedasRequisicion.indexOfComponent(this.jPanelFK_IdBodegaSolicitarRequisicion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRequisicion.getComponent(index);
				jPanel.setBorder(this.requisicionConstantesFunciones.resaltarFK_IdBodegaSolicitarRequisicion);
			}
		}

		if(this.requisicionConstantesFunciones.resaltarFK_IdEmpleadoRequisicion!=null) {
			index= this.jTabbedPaneBusquedasRequisicion.indexOfComponent(this.jPanelFK_IdEmpleadoRequisicion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRequisicion.getComponent(index);
				jPanel.setBorder(this.requisicionConstantesFunciones.resaltarFK_IdEmpleadoRequisicion);
			}
		}

		if(this.requisicionConstantesFunciones.resaltarFK_IdTipoRequisicionRequisicion!=null) {
			index= this.jTabbedPaneBusquedasRequisicion.indexOfComponent(this.jPanelFK_IdTipoRequisicionRequisicion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRequisicion.getComponent(index);
				jPanel.setBorder(this.requisicionConstantesFunciones.resaltarFK_IdTipoRequisicionRequisicion);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioRequisicion() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasRequisicion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasRequisicion.indexOfComponent(this.jPanelBusquedaPorCodigoRequisicion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRequisicion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.requisicionConstantesFunciones.mostrarBusquedaPorCodigoRequisicion);
			if(!this.requisicionConstantesFunciones.mostrarBusquedaPorCodigoRequisicion && index>-1) {
				this.jTabbedPaneBusquedasRequisicion.remove(index);
			}

			index= this.jTabbedPaneBusquedasRequisicion.indexOfComponent(this.jPanelFK_IdBodegaSolicitaRequisicion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRequisicion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.requisicionConstantesFunciones.mostrarFK_IdBodegaSolicitaRequisicion);
			if(!this.requisicionConstantesFunciones.mostrarFK_IdBodegaSolicitaRequisicion && index>-1) {
				this.jTabbedPaneBusquedasRequisicion.remove(index);
			}

			index= this.jTabbedPaneBusquedasRequisicion.indexOfComponent(this.jPanelFK_IdBodegaSolicitarRequisicion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRequisicion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.requisicionConstantesFunciones.mostrarFK_IdBodegaSolicitarRequisicion);
			if(!this.requisicionConstantesFunciones.mostrarFK_IdBodegaSolicitarRequisicion && index>-1) {
				this.jTabbedPaneBusquedasRequisicion.remove(index);
			}

			index= this.jTabbedPaneBusquedasRequisicion.indexOfComponent(this.jPanelFK_IdEmpleadoRequisicion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRequisicion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.requisicionConstantesFunciones.mostrarFK_IdEmpleadoRequisicion);
			if(!this.requisicionConstantesFunciones.mostrarFK_IdEmpleadoRequisicion && index>-1) {
				this.jTabbedPaneBusquedasRequisicion.remove(index);
			}

			index= this.jTabbedPaneBusquedasRequisicion.indexOfComponent(this.jPanelFK_IdTipoRequisicionRequisicion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRequisicion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.requisicionConstantesFunciones.mostrarFK_IdTipoRequisicionRequisicion);
			if(!this.requisicionConstantesFunciones.mostrarFK_IdTipoRequisicionRequisicion && index>-1) {
				this.jTabbedPaneBusquedasRequisicion.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioRequisicion() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasRequisicion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasRequisicion.indexOfComponent(this.jPanelBusquedaPorCodigoRequisicion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRequisicion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.requisicionConstantesFunciones.activarBusquedaPorCodigoRequisicion);
				this.jTabbedPaneBusquedasRequisicion.setEnabledAt(index,this.requisicionConstantesFunciones.activarBusquedaPorCodigoRequisicion);
			}

			index= this.jTabbedPaneBusquedasRequisicion.indexOfComponent(this.jPanelFK_IdBodegaSolicitaRequisicion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRequisicion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.requisicionConstantesFunciones.activarFK_IdBodegaSolicitaRequisicion);
				this.jTabbedPaneBusquedasRequisicion.setEnabledAt(index,this.requisicionConstantesFunciones.activarFK_IdBodegaSolicitaRequisicion);
			}

			index= this.jTabbedPaneBusquedasRequisicion.indexOfComponent(this.jPanelFK_IdBodegaSolicitarRequisicion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRequisicion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.requisicionConstantesFunciones.activarFK_IdBodegaSolicitarRequisicion);
				this.jTabbedPaneBusquedasRequisicion.setEnabledAt(index,this.requisicionConstantesFunciones.activarFK_IdBodegaSolicitarRequisicion);
			}

			index= this.jTabbedPaneBusquedasRequisicion.indexOfComponent(this.jPanelFK_IdEmpleadoRequisicion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRequisicion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.requisicionConstantesFunciones.activarFK_IdEmpleadoRequisicion);
				this.jTabbedPaneBusquedasRequisicion.setEnabledAt(index,this.requisicionConstantesFunciones.activarFK_IdEmpleadoRequisicion);
			}

			index= this.jTabbedPaneBusquedasRequisicion.indexOfComponent(this.jPanelFK_IdTipoRequisicionRequisicion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRequisicion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.requisicionConstantesFunciones.activarFK_IdTipoRequisicionRequisicion);
				this.jTabbedPaneBusquedasRequisicion.setEnabledAt(index,this.requisicionConstantesFunciones.activarFK_IdTipoRequisicionRequisicion);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaRequisicion(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasRequisicion.indexOfComponent(this.jPanelBusquedaPorCodigoRequisicion);

			this.jTabbedPaneBusquedasRequisicion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRequisicion.getComponent(index);

			this.requisicionConstantesFunciones.setResaltarBusquedaPorCodigoRequisicion(resaltar);

			jPanel.setBorder(this.requisicionConstantesFunciones.resaltarBusquedaPorCodigoRequisicion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdBodegaSolicita")) {
			index= this.jTabbedPaneBusquedasRequisicion.indexOfComponent(this.jPanelFK_IdBodegaSolicitaRequisicion);

			this.jTabbedPaneBusquedasRequisicion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRequisicion.getComponent(index);

			this.requisicionConstantesFunciones.setResaltarFK_IdBodegaSolicitaRequisicion(resaltar);

			jPanel.setBorder(this.requisicionConstantesFunciones.resaltarFK_IdBodegaSolicitaRequisicion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdBodegaSolicitar")) {
			index= this.jTabbedPaneBusquedasRequisicion.indexOfComponent(this.jPanelFK_IdBodegaSolicitarRequisicion);

			this.jTabbedPaneBusquedasRequisicion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRequisicion.getComponent(index);

			this.requisicionConstantesFunciones.setResaltarFK_IdBodegaSolicitarRequisicion(resaltar);

			jPanel.setBorder(this.requisicionConstantesFunciones.resaltarFK_IdBodegaSolicitarRequisicion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasRequisicion.indexOfComponent(this.jPanelFK_IdEmpleadoRequisicion);

			this.jTabbedPaneBusquedasRequisicion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRequisicion.getComponent(index);

			this.requisicionConstantesFunciones.setResaltarFK_IdEmpleadoRequisicion(resaltar);

			jPanel.setBorder(this.requisicionConstantesFunciones.resaltarFK_IdEmpleadoRequisicion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoRequisicion")) {
			index= this.jTabbedPaneBusquedasRequisicion.indexOfComponent(this.jPanelFK_IdTipoRequisicionRequisicion);

			this.jTabbedPaneBusquedasRequisicion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRequisicion.getComponent(index);

			this.requisicionConstantesFunciones.setResaltarFK_IdTipoRequisicionRequisicion(resaltar);

			jPanel.setBorder(this.requisicionConstantesFunciones.resaltarFK_IdTipoRequisicionRequisicion);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarRequisicion.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioRequisicion() throws Exception {

		if(this.jInternalFrameDetalleFormRequisicion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioRequisicion();
		this.updateVisibilidadResaltarControlesFormularioRequisicion();
		this.updateHabilitarResaltarControlesFormularioRequisicion();
		
	}
	
	public void updateBorderResaltarControlesFormularioRequisicion() throws Exception {
		if(this.jInternalFrameDetalleFormRequisicion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.requisicionConstantesFunciones.resaltaridRequisicion!=null && this.jInternalFrameDetalleFormRequisicion!=null) {this.jInternalFrameDetalleFormRequisicion.jLabelidRequisicion.setBorder(this.requisicionConstantesFunciones.resaltaridRequisicion);}
		if(this.requisicionConstantesFunciones.resaltarid_empresaRequisicion!=null && this.jInternalFrameDetalleFormRequisicion!=null) {this.jInternalFrameDetalleFormRequisicion.jComboBoxid_empresaRequisicion.setBorder(this.requisicionConstantesFunciones.resaltarid_empresaRequisicion);}
		if(this.requisicionConstantesFunciones.resaltarid_sucursalRequisicion!=null && this.jInternalFrameDetalleFormRequisicion!=null) {this.jInternalFrameDetalleFormRequisicion.jComboBoxid_sucursalRequisicion.setBorder(this.requisicionConstantesFunciones.resaltarid_sucursalRequisicion);}
		if(this.requisicionConstantesFunciones.resaltarnumero_secuencialRequisicion!=null && this.jInternalFrameDetalleFormRequisicion!=null) {this.jInternalFrameDetalleFormRequisicion.jTextFieldnumero_secuencialRequisicion.setBorder(this.requisicionConstantesFunciones.resaltarnumero_secuencialRequisicion);}
		if(this.requisicionConstantesFunciones.resaltarid_tipo_requisicionRequisicion!=null && this.jInternalFrameDetalleFormRequisicion!=null) {this.jInternalFrameDetalleFormRequisicion.jComboBoxid_tipo_requisicionRequisicion.setBorder(this.requisicionConstantesFunciones.resaltarid_tipo_requisicionRequisicion);}
		if(this.requisicionConstantesFunciones.resaltarfechaRequisicion!=null && this.jInternalFrameDetalleFormRequisicion!=null) {this.jInternalFrameDetalleFormRequisicion.jDateChooserfechaRequisicion.setBorder(this.requisicionConstantesFunciones.resaltarfechaRequisicion);}
		if(this.requisicionConstantesFunciones.resaltarhoraRequisicion!=null && this.jInternalFrameDetalleFormRequisicion!=null) {this.jInternalFrameDetalleFormRequisicion.jSpinnerhoraRequisicion.setBorder(this.requisicionConstantesFunciones.resaltarhoraRequisicion);}
		if(this.requisicionConstantesFunciones.resaltarid_empleadoRequisicion!=null && this.jInternalFrameDetalleFormRequisicion!=null) {this.jInternalFrameDetalleFormRequisicion.jComboBoxid_empleadoRequisicion.setBorder(this.requisicionConstantesFunciones.resaltarid_empleadoRequisicion);}
		if(this.requisicionConstantesFunciones.resaltarid_estado_requisicionRequisicion!=null && this.jInternalFrameDetalleFormRequisicion!=null) {this.jInternalFrameDetalleFormRequisicion.jComboBoxid_estado_requisicionRequisicion.setBorder(this.requisicionConstantesFunciones.resaltarid_estado_requisicionRequisicion);}
		if(this.requisicionConstantesFunciones.resaltarid_formatoRequisicion!=null && this.jInternalFrameDetalleFormRequisicion!=null) {this.jInternalFrameDetalleFormRequisicion.jComboBoxid_formatoRequisicion.setBorder(this.requisicionConstantesFunciones.resaltarid_formatoRequisicion);}
		if(this.requisicionConstantesFunciones.resaltarid_bodega_solicitarRequisicion!=null && this.jInternalFrameDetalleFormRequisicion!=null) {this.jInternalFrameDetalleFormRequisicion.jComboBoxid_bodega_solicitarRequisicion.setBorder(this.requisicionConstantesFunciones.resaltarid_bodega_solicitarRequisicion);}
		if(this.requisicionConstantesFunciones.resaltardescripcionRequisicion!=null && this.jInternalFrameDetalleFormRequisicion!=null) {this.jInternalFrameDetalleFormRequisicion.jTextAreadescripcionRequisicion.setBorder(this.requisicionConstantesFunciones.resaltardescripcionRequisicion);}
		if(this.requisicionConstantesFunciones.resaltarid_bodega_solicitaRequisicion!=null && this.jInternalFrameDetalleFormRequisicion!=null) {this.jInternalFrameDetalleFormRequisicion.jComboBoxid_bodega_solicitaRequisicion.setBorder(this.requisicionConstantesFunciones.resaltarid_bodega_solicitaRequisicion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioRequisicion() throws Exception {		
		if(this.jInternalFrameDetalleFormRequisicion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRequisicion!=null) {
	
		//this.jInternalFrameDetalleFormRequisicion.jLabelidRequisicion.setVisible(this.requisicionConstantesFunciones.mostraridRequisicion);
		this.jInternalFrameDetalleFormRequisicion.jPanelidRequisicion.setVisible(this.requisicionConstantesFunciones.mostraridRequisicion);
		//this.jInternalFrameDetalleFormRequisicion.jComboBoxid_empresaRequisicion.setVisible(this.requisicionConstantesFunciones.mostrarid_empresaRequisicion);
		this.jInternalFrameDetalleFormRequisicion.jPanelid_empresaRequisicion.setVisible(this.requisicionConstantesFunciones.mostrarid_empresaRequisicion);
		//this.jInternalFrameDetalleFormRequisicion.jComboBoxid_sucursalRequisicion.setVisible(this.requisicionConstantesFunciones.mostrarid_sucursalRequisicion);
		this.jInternalFrameDetalleFormRequisicion.jPanelid_sucursalRequisicion.setVisible(this.requisicionConstantesFunciones.mostrarid_sucursalRequisicion);
		//this.jInternalFrameDetalleFormRequisicion.jTextFieldnumero_secuencialRequisicion.setVisible(this.requisicionConstantesFunciones.mostrarnumero_secuencialRequisicion);
		this.jInternalFrameDetalleFormRequisicion.jPanelnumero_secuencialRequisicion.setVisible(this.requisicionConstantesFunciones.mostrarnumero_secuencialRequisicion);
		//this.jInternalFrameDetalleFormRequisicion.jComboBoxid_tipo_requisicionRequisicion.setVisible(this.requisicionConstantesFunciones.mostrarid_tipo_requisicionRequisicion);
		this.jInternalFrameDetalleFormRequisicion.jPanelid_tipo_requisicionRequisicion.setVisible(this.requisicionConstantesFunciones.mostrarid_tipo_requisicionRequisicion);
		//this.jInternalFrameDetalleFormRequisicion.jDateChooserfechaRequisicion.setVisible(this.requisicionConstantesFunciones.mostrarfechaRequisicion);
		this.jInternalFrameDetalleFormRequisicion.jPanelfechaRequisicion.setVisible(this.requisicionConstantesFunciones.mostrarfechaRequisicion);
		//this.jInternalFrameDetalleFormRequisicion.jSpinnerhoraRequisicion.setVisible(this.requisicionConstantesFunciones.mostrarhoraRequisicion);
		this.jInternalFrameDetalleFormRequisicion.jPanelhoraRequisicion.setVisible(this.requisicionConstantesFunciones.mostrarhoraRequisicion);
		//this.jInternalFrameDetalleFormRequisicion.jComboBoxid_empleadoRequisicion.setVisible(this.requisicionConstantesFunciones.mostrarid_empleadoRequisicion);
		this.jInternalFrameDetalleFormRequisicion.jPanelid_empleadoRequisicion.setVisible(this.requisicionConstantesFunciones.mostrarid_empleadoRequisicion);
		//this.jInternalFrameDetalleFormRequisicion.jComboBoxid_estado_requisicionRequisicion.setVisible(this.requisicionConstantesFunciones.mostrarid_estado_requisicionRequisicion);
		this.jInternalFrameDetalleFormRequisicion.jPanelid_estado_requisicionRequisicion.setVisible(this.requisicionConstantesFunciones.mostrarid_estado_requisicionRequisicion);
		//this.jInternalFrameDetalleFormRequisicion.jComboBoxid_formatoRequisicion.setVisible(this.requisicionConstantesFunciones.mostrarid_formatoRequisicion);
		this.jInternalFrameDetalleFormRequisicion.jPanelid_formatoRequisicion.setVisible(this.requisicionConstantesFunciones.mostrarid_formatoRequisicion);
		//this.jInternalFrameDetalleFormRequisicion.jComboBoxid_bodega_solicitarRequisicion.setVisible(this.requisicionConstantesFunciones.mostrarid_bodega_solicitarRequisicion);
		this.jInternalFrameDetalleFormRequisicion.jPanelid_bodega_solicitarRequisicion.setVisible(this.requisicionConstantesFunciones.mostrarid_bodega_solicitarRequisicion);
		//this.jInternalFrameDetalleFormRequisicion.jTextAreadescripcionRequisicion.setVisible(this.requisicionConstantesFunciones.mostrardescripcionRequisicion);
		this.jInternalFrameDetalleFormRequisicion.jPaneldescripcionRequisicion.setVisible(this.requisicionConstantesFunciones.mostrardescripcionRequisicion);
		//this.jInternalFrameDetalleFormRequisicion.jComboBoxid_bodega_solicitaRequisicion.setVisible(this.requisicionConstantesFunciones.mostrarid_bodega_solicitaRequisicion);
		this.jInternalFrameDetalleFormRequisicion.jPanelid_bodega_solicitaRequisicion.setVisible(this.requisicionConstantesFunciones.mostrarid_bodega_solicitaRequisicion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioRequisicion() throws Exception {
		if(this.jInternalFrameDetalleFormRequisicion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRequisicion!=null) {
	
		this.jInternalFrameDetalleFormRequisicion.jLabelidRequisicion.setEnabled(this.requisicionConstantesFunciones.activaridRequisicion);
		this.jInternalFrameDetalleFormRequisicion.jComboBoxid_empresaRequisicion.setEnabled(this.requisicionConstantesFunciones.activarid_empresaRequisicion);
		this.jInternalFrameDetalleFormRequisicion.jComboBoxid_sucursalRequisicion.setEnabled(this.requisicionConstantesFunciones.activarid_sucursalRequisicion);
		this.jInternalFrameDetalleFormRequisicion.jTextFieldnumero_secuencialRequisicion.setEnabled(this.requisicionConstantesFunciones.activarnumero_secuencialRequisicion);
		this.jInternalFrameDetalleFormRequisicion.jComboBoxid_tipo_requisicionRequisicion.setEnabled(this.requisicionConstantesFunciones.activarid_tipo_requisicionRequisicion);
		this.jInternalFrameDetalleFormRequisicion.jDateChooserfechaRequisicion.setEnabled(this.requisicionConstantesFunciones.activarfechaRequisicion);
		this.jInternalFrameDetalleFormRequisicion.jSpinnerhoraRequisicion.setEnabled(this.requisicionConstantesFunciones.activarhoraRequisicion);
		this.jInternalFrameDetalleFormRequisicion.jComboBoxid_empleadoRequisicion.setEnabled(this.requisicionConstantesFunciones.activarid_empleadoRequisicion);
		this.jInternalFrameDetalleFormRequisicion.jComboBoxid_estado_requisicionRequisicion.setEnabled(this.requisicionConstantesFunciones.activarid_estado_requisicionRequisicion);
		this.jInternalFrameDetalleFormRequisicion.jComboBoxid_formatoRequisicion.setEnabled(this.requisicionConstantesFunciones.activarid_formatoRequisicion);
		this.jInternalFrameDetalleFormRequisicion.jComboBoxid_bodega_solicitarRequisicion.setEnabled(this.requisicionConstantesFunciones.activarid_bodega_solicitarRequisicion);
		this.jInternalFrameDetalleFormRequisicion.jTextAreadescripcionRequisicion.setEnabled(this.requisicionConstantesFunciones.activardescripcionRequisicion);
		this.jInternalFrameDetalleFormRequisicion.jComboBoxid_bodega_solicitaRequisicion.setEnabled(this.requisicionConstantesFunciones.activarid_bodega_solicitaRequisicion);
		}
	}
	
		
}